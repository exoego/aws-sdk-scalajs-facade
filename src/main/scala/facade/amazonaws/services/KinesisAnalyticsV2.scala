package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object kinesisanalyticsv2 {
  type ApplicationDescription = String
  type ApplicationName = String
  type ApplicationRestoreType = String
  type ApplicationStatus = String
  type ApplicationSummaries = js.Array[ApplicationSummary]
  type ApplicationVersionId = Double
  type BooleanObject = Boolean
  type BucketARN = String
  type CheckpointInterval = Double
  type CloudWatchLoggingOptionDescriptions = js.Array[CloudWatchLoggingOptionDescription]
  type CloudWatchLoggingOptionUpdates = js.Array[CloudWatchLoggingOptionUpdate]
  type CloudWatchLoggingOptions = js.Array[CloudWatchLoggingOption]
  type CodeContentType = String
  type CodeMD5 = String
  type CodeSize = Double
  type ConfigurationType = String
  type FileKey = String
  type Id = String
  type InAppStreamName = String
  type InAppStreamNames = js.Array[InAppStreamName]
  type InAppTableName = String
  type InputDescriptions = js.Array[InputDescription]
  type InputParallelismCount = Int
  type InputStartingPosition = String
  type InputUpdates = js.Array[InputUpdate]
  type Inputs = js.Array[Input]
  type JobPlanDescription = String
  type ListApplicationsInputLimit = Int
  type ListSnapshotsInputLimit = Int
  type LogLevel = String
  type LogStreamARN = String
  type MetricsLevel = String
  type MinPauseBetweenCheckpoints = Double
  type NextToken = String
  type ObjectVersion = String
  type OutputDescriptions = js.Array[OutputDescription]
  type OutputUpdates = js.Array[OutputUpdate]
  type Outputs = js.Array[Output]
  type Parallelism = Int
  type ParallelismPerKPU = Int
  type ParsedInputRecord = js.Array[ParsedInputRecordField]
  type ParsedInputRecordField = String
  type ParsedInputRecords = js.Array[ParsedInputRecord]
  type ProcessedInputRecord = String
  type ProcessedInputRecords = js.Array[ProcessedInputRecord]
  type PropertyGroups = js.Array[PropertyGroup]
  type PropertyKey = String
  type PropertyMap = js.Dictionary[PropertyValue]
  type PropertyValue = String
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
  type ReferenceDataSources = js.Array[ReferenceDataSource]
  type ResourceARN = String
  type RoleARN = String
  type RuntimeEnvironment = String
  type SnapshotName = String
  type SnapshotStatus = String
  type SnapshotSummaries = js.Array[SnapshotDetails]
  type SqlRunConfigurations = js.Array[SqlRunConfiguration]
  type TextContent = String
  type Timestamp = js.Date
  type ZipFileContent = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
}

package kinesisanalyticsv2 {
  @js.native
  @JSImport("aws-sdk", "KinesisAnalyticsV2")
  class KinesisAnalyticsV2(config: AWSConfig) extends js.Object {
    def addApplicationCloudWatchLoggingOption(params: AddApplicationCloudWatchLoggingOptionRequest): Request[AddApplicationCloudWatchLoggingOptionResponse] = js.native
    def addApplicationInput(params: AddApplicationInputRequest): Request[AddApplicationInputResponse] = js.native
    def addApplicationInputProcessingConfiguration(params: AddApplicationInputProcessingConfigurationRequest): Request[AddApplicationInputProcessingConfigurationResponse] = js.native
    def addApplicationOutput(params: AddApplicationOutputRequest): Request[AddApplicationOutputResponse] = js.native
    def addApplicationReferenceDataSource(params: AddApplicationReferenceDataSourceRequest): Request[AddApplicationReferenceDataSourceResponse] = js.native
    def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResponse] = js.native
    def createApplicationSnapshot(params: CreateApplicationSnapshotRequest): Request[CreateApplicationSnapshotResponse] = js.native
    def deleteApplication(params: DeleteApplicationRequest): Request[DeleteApplicationResponse] = js.native
    def deleteApplicationCloudWatchLoggingOption(params: DeleteApplicationCloudWatchLoggingOptionRequest): Request[DeleteApplicationCloudWatchLoggingOptionResponse] = js.native
    def deleteApplicationInputProcessingConfiguration(params: DeleteApplicationInputProcessingConfigurationRequest): Request[DeleteApplicationInputProcessingConfigurationResponse] = js.native
    def deleteApplicationOutput(params: DeleteApplicationOutputRequest): Request[DeleteApplicationOutputResponse] = js.native
    def deleteApplicationReferenceDataSource(params: DeleteApplicationReferenceDataSourceRequest): Request[DeleteApplicationReferenceDataSourceResponse] = js.native
    def deleteApplicationSnapshot(params: DeleteApplicationSnapshotRequest): Request[DeleteApplicationSnapshotResponse] = js.native
    def describeApplication(params: DescribeApplicationRequest): Request[DescribeApplicationResponse] = js.native
    def describeApplicationSnapshot(params: DescribeApplicationSnapshotRequest): Request[DescribeApplicationSnapshotResponse] = js.native
    def discoverInputSchema(params: DiscoverInputSchemaRequest): Request[DiscoverInputSchemaResponse] = js.native
    def listApplicationSnapshots(params: ListApplicationSnapshotsRequest): Request[ListApplicationSnapshotsResponse] = js.native
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
    var ApplicationARN: js.UndefOr[ResourceARN]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var CloudWatchLoggingOptionDescriptions: js.UndefOr[CloudWatchLoggingOptionDescriptions]
  }

  object AddApplicationCloudWatchLoggingOptionResponse {
    def apply(
      ApplicationARN: js.UndefOr[ResourceARN] = js.undefined,
      ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
      CloudWatchLoggingOptionDescriptions: js.UndefOr[CloudWatchLoggingOptionDescriptions] = js.undefined): AddApplicationCloudWatchLoggingOptionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationARN" -> ApplicationARN.map { x => x.asInstanceOf[js.Any] },
        "ApplicationVersionId" -> ApplicationVersionId.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptionDescriptions" -> CloudWatchLoggingOptionDescriptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ApplicationARN: js.UndefOr[ResourceARN]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var InputId: js.UndefOr[Id]
    var InputProcessingConfigurationDescription: js.UndefOr[InputProcessingConfigurationDescription]
  }

  object AddApplicationInputProcessingConfigurationResponse {
    def apply(
      ApplicationARN: js.UndefOr[ResourceARN] = js.undefined,
      ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
      InputId: js.UndefOr[Id] = js.undefined,
      InputProcessingConfigurationDescription: js.UndefOr[InputProcessingConfigurationDescription] = js.undefined): AddApplicationInputProcessingConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationARN" -> ApplicationARN.map { x => x.asInstanceOf[js.Any] },
        "ApplicationVersionId" -> ApplicationVersionId.map { x => x.asInstanceOf[js.Any] },
        "InputId" -> InputId.map { x => x.asInstanceOf[js.Any] },
        "InputProcessingConfigurationDescription" -> InputProcessingConfigurationDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddApplicationInputProcessingConfigurationResponse]
    }
  }

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

  @js.native
  trait AddApplicationInputResponse extends js.Object {
    var ApplicationARN: js.UndefOr[ResourceARN]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var InputDescriptions: js.UndefOr[InputDescriptions]
  }

  object AddApplicationInputResponse {
    def apply(
      ApplicationARN: js.UndefOr[ResourceARN] = js.undefined,
      ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
      InputDescriptions: js.UndefOr[InputDescriptions] = js.undefined): AddApplicationInputResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationARN" -> ApplicationARN.map { x => x.asInstanceOf[js.Any] },
        "ApplicationVersionId" -> ApplicationVersionId.map { x => x.asInstanceOf[js.Any] },
        "InputDescriptions" -> InputDescriptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddApplicationInputResponse]
    }
  }

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

  @js.native
  trait AddApplicationOutputResponse extends js.Object {
    var ApplicationARN: js.UndefOr[ResourceARN]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var OutputDescriptions: js.UndefOr[OutputDescriptions]
  }

  object AddApplicationOutputResponse {
    def apply(
      ApplicationARN: js.UndefOr[ResourceARN] = js.undefined,
      ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
      OutputDescriptions: js.UndefOr[OutputDescriptions] = js.undefined): AddApplicationOutputResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationARN" -> ApplicationARN.map { x => x.asInstanceOf[js.Any] },
        "ApplicationVersionId" -> ApplicationVersionId.map { x => x.asInstanceOf[js.Any] },
        "OutputDescriptions" -> OutputDescriptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddApplicationOutputResponse]
    }
  }

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

  @js.native
  trait AddApplicationReferenceDataSourceResponse extends js.Object {
    var ApplicationARN: js.UndefOr[ResourceARN]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var ReferenceDataSourceDescriptions: js.UndefOr[ReferenceDataSourceDescriptions]
  }

  object AddApplicationReferenceDataSourceResponse {
    def apply(
      ApplicationARN: js.UndefOr[ResourceARN] = js.undefined,
      ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
      ReferenceDataSourceDescriptions: js.UndefOr[ReferenceDataSourceDescriptions] = js.undefined): AddApplicationReferenceDataSourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationARN" -> ApplicationARN.map { x => x.asInstanceOf[js.Any] },
        "ApplicationVersionId" -> ApplicationVersionId.map { x => x.asInstanceOf[js.Any] },
        "ReferenceDataSourceDescriptions" -> ReferenceDataSourceDescriptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddApplicationReferenceDataSourceResponse]
    }
  }

  /**
   * <p>Describes code configuration for a Java-based Kinesis Data Analytics application.</p>
   */
  @js.native
  trait ApplicationCodeConfiguration extends js.Object {
    var CodeContent: js.UndefOr[CodeContent]
    var CodeContentType: js.UndefOr[CodeContentType]
  }

  object ApplicationCodeConfiguration {
    def apply(
      CodeContent: js.UndefOr[CodeContent] = js.undefined,
      CodeContentType: js.UndefOr[CodeContentType] = js.undefined): ApplicationCodeConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeContent" -> CodeContent.map { x => x.asInstanceOf[js.Any] },
        "CodeContentType" -> CodeContentType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationCodeConfiguration]
    }
  }

  /**
   * <p>Describes code configuration for a Java-based Kinesis Data Analytics application.</p>
   */
  @js.native
  trait ApplicationCodeConfigurationDescription extends js.Object {
    var CodeContentType: js.UndefOr[CodeContentType]
    var CodeContentDescription: js.UndefOr[CodeContentDescription]
  }

  object ApplicationCodeConfigurationDescription {
    def apply(
      CodeContentType: js.UndefOr[CodeContentType] = js.undefined,
      CodeContentDescription: js.UndefOr[CodeContentDescription] = js.undefined): ApplicationCodeConfigurationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeContentType" -> CodeContentType.map { x => x.asInstanceOf[js.Any] },
        "CodeContentDescription" -> CodeContentDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationCodeConfigurationDescription]
    }
  }

  /**
   * <p>Describes updates to a Java-based Amazon Kinesis Data Analytics application.</p>
   */
  @js.native
  trait ApplicationCodeConfigurationUpdate extends js.Object {
    var CodeContentTypeUpdate: js.UndefOr[CodeContentType]
    var CodeContentUpdate: js.UndefOr[CodeContentUpdate]
  }

  object ApplicationCodeConfigurationUpdate {
    def apply(
      CodeContentTypeUpdate: js.UndefOr[CodeContentType] = js.undefined,
      CodeContentUpdate: js.UndefOr[CodeContentUpdate] = js.undefined): ApplicationCodeConfigurationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeContentTypeUpdate" -> CodeContentTypeUpdate.map { x => x.asInstanceOf[js.Any] },
        "CodeContentUpdate" -> CodeContentUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationCodeConfigurationUpdate]
    }
  }

  /**
   * <p>Specifies the creation parameters for an Amazon Kinesis Data Analytics application.</p>
   */
  @js.native
  trait ApplicationConfiguration extends js.Object {
    var FlinkApplicationConfiguration: js.UndefOr[FlinkApplicationConfiguration]
    var ApplicationSnapshotConfiguration: js.UndefOr[ApplicationSnapshotConfiguration]
    var SqlApplicationConfiguration: js.UndefOr[SqlApplicationConfiguration]
    var ApplicationCodeConfiguration: js.UndefOr[ApplicationCodeConfiguration]
    var EnvironmentProperties: js.UndefOr[EnvironmentProperties]
  }

  object ApplicationConfiguration {
    def apply(
      FlinkApplicationConfiguration: js.UndefOr[FlinkApplicationConfiguration] = js.undefined,
      ApplicationSnapshotConfiguration: js.UndefOr[ApplicationSnapshotConfiguration] = js.undefined,
      SqlApplicationConfiguration: js.UndefOr[SqlApplicationConfiguration] = js.undefined,
      ApplicationCodeConfiguration: js.UndefOr[ApplicationCodeConfiguration] = js.undefined,
      EnvironmentProperties: js.UndefOr[EnvironmentProperties] = js.undefined): ApplicationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FlinkApplicationConfiguration" -> FlinkApplicationConfiguration.map { x => x.asInstanceOf[js.Any] },
        "ApplicationSnapshotConfiguration" -> ApplicationSnapshotConfiguration.map { x => x.asInstanceOf[js.Any] },
        "SqlApplicationConfiguration" -> SqlApplicationConfiguration.map { x => x.asInstanceOf[js.Any] },
        "ApplicationCodeConfiguration" -> ApplicationCodeConfiguration.map { x => x.asInstanceOf[js.Any] },
        "EnvironmentProperties" -> EnvironmentProperties.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationConfiguration]
    }
  }

  /**
   * <p>Describes details about the application code and starting parameters for an Amazon Kinesis Data Analytics application.</p>
   */
  @js.native
  trait ApplicationConfigurationDescription extends js.Object {
    var RunConfigurationDescription: js.UndefOr[RunConfigurationDescription]
    var ApplicationCodeConfigurationDescription: js.UndefOr[ApplicationCodeConfigurationDescription]
    var ApplicationSnapshotConfigurationDescription: js.UndefOr[ApplicationSnapshotConfigurationDescription]
    var SqlApplicationConfigurationDescription: js.UndefOr[SqlApplicationConfigurationDescription]
    var EnvironmentPropertyDescriptions: js.UndefOr[EnvironmentPropertyDescriptions]
    var FlinkApplicationConfigurationDescription: js.UndefOr[FlinkApplicationConfigurationDescription]
  }

  object ApplicationConfigurationDescription {
    def apply(
      RunConfigurationDescription: js.UndefOr[RunConfigurationDescription] = js.undefined,
      ApplicationCodeConfigurationDescription: js.UndefOr[ApplicationCodeConfigurationDescription] = js.undefined,
      ApplicationSnapshotConfigurationDescription: js.UndefOr[ApplicationSnapshotConfigurationDescription] = js.undefined,
      SqlApplicationConfigurationDescription: js.UndefOr[SqlApplicationConfigurationDescription] = js.undefined,
      EnvironmentPropertyDescriptions: js.UndefOr[EnvironmentPropertyDescriptions] = js.undefined,
      FlinkApplicationConfigurationDescription: js.UndefOr[FlinkApplicationConfigurationDescription] = js.undefined): ApplicationConfigurationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RunConfigurationDescription" -> RunConfigurationDescription.map { x => x.asInstanceOf[js.Any] },
        "ApplicationCodeConfigurationDescription" -> ApplicationCodeConfigurationDescription.map { x => x.asInstanceOf[js.Any] },
        "ApplicationSnapshotConfigurationDescription" -> ApplicationSnapshotConfigurationDescription.map { x => x.asInstanceOf[js.Any] },
        "SqlApplicationConfigurationDescription" -> SqlApplicationConfigurationDescription.map { x => x.asInstanceOf[js.Any] },
        "EnvironmentPropertyDescriptions" -> EnvironmentPropertyDescriptions.map { x => x.asInstanceOf[js.Any] },
        "FlinkApplicationConfigurationDescription" -> FlinkApplicationConfigurationDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationConfigurationDescription]
    }
  }

  /**
   * <p>Describes updates to an application's configuration.</p>
   */
  @js.native
  trait ApplicationConfigurationUpdate extends js.Object {
    var FlinkApplicationConfigurationUpdate: js.UndefOr[FlinkApplicationConfigurationUpdate]
    var ApplicationCodeConfigurationUpdate: js.UndefOr[ApplicationCodeConfigurationUpdate]
    var SqlApplicationConfigurationUpdate: js.UndefOr[SqlApplicationConfigurationUpdate]
    var ApplicationSnapshotConfigurationUpdate: js.UndefOr[ApplicationSnapshotConfigurationUpdate]
    var EnvironmentPropertyUpdates: js.UndefOr[EnvironmentPropertyUpdates]
  }

  object ApplicationConfigurationUpdate {
    def apply(
      FlinkApplicationConfigurationUpdate: js.UndefOr[FlinkApplicationConfigurationUpdate] = js.undefined,
      ApplicationCodeConfigurationUpdate: js.UndefOr[ApplicationCodeConfigurationUpdate] = js.undefined,
      SqlApplicationConfigurationUpdate: js.UndefOr[SqlApplicationConfigurationUpdate] = js.undefined,
      ApplicationSnapshotConfigurationUpdate: js.UndefOr[ApplicationSnapshotConfigurationUpdate] = js.undefined,
      EnvironmentPropertyUpdates: js.UndefOr[EnvironmentPropertyUpdates] = js.undefined): ApplicationConfigurationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FlinkApplicationConfigurationUpdate" -> FlinkApplicationConfigurationUpdate.map { x => x.asInstanceOf[js.Any] },
        "ApplicationCodeConfigurationUpdate" -> ApplicationCodeConfigurationUpdate.map { x => x.asInstanceOf[js.Any] },
        "SqlApplicationConfigurationUpdate" -> SqlApplicationConfigurationUpdate.map { x => x.asInstanceOf[js.Any] },
        "ApplicationSnapshotConfigurationUpdate" -> ApplicationSnapshotConfigurationUpdate.map { x => x.asInstanceOf[js.Any] },
        "EnvironmentPropertyUpdates" -> EnvironmentPropertyUpdates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationConfigurationUpdate]
    }
  }

  /**
   * <p>Describes the application, including the application Amazon Resource Name (ARN), status, latest version, and input and output configurations.</p>
   */
  @js.native
  trait ApplicationDetail extends js.Object {
    var CreateTimestamp: js.UndefOr[Timestamp]
    var LastUpdateTimestamp: js.UndefOr[Timestamp]
    var RuntimeEnvironment: js.UndefOr[RuntimeEnvironment]
    var ApplicationConfigurationDescription: js.UndefOr[ApplicationConfigurationDescription]
    var ApplicationDescription: js.UndefOr[ApplicationDescription]
    var ApplicationStatus: js.UndefOr[ApplicationStatus]
    var CloudWatchLoggingOptionDescriptions: js.UndefOr[CloudWatchLoggingOptionDescriptions]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var ServiceExecutionRole: js.UndefOr[RoleARN]
    var ApplicationName: js.UndefOr[ApplicationName]
    var ApplicationARN: js.UndefOr[ResourceARN]
  }

  object ApplicationDetail {
    def apply(
      CreateTimestamp: js.UndefOr[Timestamp] = js.undefined,
      LastUpdateTimestamp: js.UndefOr[Timestamp] = js.undefined,
      RuntimeEnvironment: js.UndefOr[RuntimeEnvironment] = js.undefined,
      ApplicationConfigurationDescription: js.UndefOr[ApplicationConfigurationDescription] = js.undefined,
      ApplicationDescription: js.UndefOr[ApplicationDescription] = js.undefined,
      ApplicationStatus: js.UndefOr[ApplicationStatus] = js.undefined,
      CloudWatchLoggingOptionDescriptions: js.UndefOr[CloudWatchLoggingOptionDescriptions] = js.undefined,
      ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
      ServiceExecutionRole: js.UndefOr[RoleARN] = js.undefined,
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      ApplicationARN: js.UndefOr[ResourceARN] = js.undefined): ApplicationDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreateTimestamp" -> CreateTimestamp.map { x => x.asInstanceOf[js.Any] },
        "LastUpdateTimestamp" -> LastUpdateTimestamp.map { x => x.asInstanceOf[js.Any] },
        "RuntimeEnvironment" -> RuntimeEnvironment.map { x => x.asInstanceOf[js.Any] },
        "ApplicationConfigurationDescription" -> ApplicationConfigurationDescription.map { x => x.asInstanceOf[js.Any] },
        "ApplicationDescription" -> ApplicationDescription.map { x => x.asInstanceOf[js.Any] },
        "ApplicationStatus" -> ApplicationStatus.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptionDescriptions" -> CloudWatchLoggingOptionDescriptions.map { x => x.asInstanceOf[js.Any] },
        "ApplicationVersionId" -> ApplicationVersionId.map { x => x.asInstanceOf[js.Any] },
        "ServiceExecutionRole" -> ServiceExecutionRole.map { x => x.asInstanceOf[js.Any] },
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "ApplicationARN" -> ApplicationARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationDetail]
    }
  }

  /**
   * <p>Specifies the method and snapshot to use when restarting an application using previously saved application state.</p>
   */
  @js.native
  trait ApplicationRestoreConfiguration extends js.Object {
    var ApplicationRestoreType: js.UndefOr[ApplicationRestoreType]
    var SnapshotName: js.UndefOr[SnapshotName]
  }

  object ApplicationRestoreConfiguration {
    def apply(
      ApplicationRestoreType: js.UndefOr[ApplicationRestoreType] = js.undefined,
      SnapshotName: js.UndefOr[SnapshotName] = js.undefined): ApplicationRestoreConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationRestoreType" -> ApplicationRestoreType.map { x => x.asInstanceOf[js.Any] },
        "SnapshotName" -> SnapshotName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationRestoreConfiguration]
    }
  }

  object ApplicationRestoreTypeEnum {
    val SKIP_RESTORE_FROM_SNAPSHOT = "SKIP_RESTORE_FROM_SNAPSHOT"
    val RESTORE_FROM_LATEST_SNAPSHOT = "RESTORE_FROM_LATEST_SNAPSHOT"
    val RESTORE_FROM_CUSTOM_SNAPSHOT = "RESTORE_FROM_CUSTOM_SNAPSHOT"

    val values = IndexedSeq(SKIP_RESTORE_FROM_SNAPSHOT, RESTORE_FROM_LATEST_SNAPSHOT, RESTORE_FROM_CUSTOM_SNAPSHOT)
  }

  /**
   * <p>Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.</p>
   */
  @js.native
  trait ApplicationSnapshotConfiguration extends js.Object {
    var SnapshotsEnabled: js.UndefOr[BooleanObject]
  }

  object ApplicationSnapshotConfiguration {
    def apply(
      SnapshotsEnabled: js.UndefOr[BooleanObject] = js.undefined): ApplicationSnapshotConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotsEnabled" -> SnapshotsEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationSnapshotConfiguration]
    }
  }

  /**
   * <p>Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.</p>
   */
  @js.native
  trait ApplicationSnapshotConfigurationDescription extends js.Object {
    var SnapshotsEnabled: js.UndefOr[BooleanObject]
  }

  object ApplicationSnapshotConfigurationDescription {
    def apply(
      SnapshotsEnabled: js.UndefOr[BooleanObject] = js.undefined): ApplicationSnapshotConfigurationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotsEnabled" -> SnapshotsEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationSnapshotConfigurationDescription]
    }
  }

  /**
   * <p>Describes updates to whether snapshots are enabled for a Java-based Kinesis Data Analytics application.</p>
   */
  @js.native
  trait ApplicationSnapshotConfigurationUpdate extends js.Object {
    var SnapshotsEnabledUpdate: js.UndefOr[BooleanObject]
  }

  object ApplicationSnapshotConfigurationUpdate {
    def apply(
      SnapshotsEnabledUpdate: js.UndefOr[BooleanObject] = js.undefined): ApplicationSnapshotConfigurationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotsEnabledUpdate" -> SnapshotsEnabledUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationSnapshotConfigurationUpdate]
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
    var RuntimeEnvironment: js.UndefOr[RuntimeEnvironment]
    var ApplicationStatus: js.UndefOr[ApplicationStatus]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var ApplicationName: js.UndefOr[ApplicationName]
    var ApplicationARN: js.UndefOr[ResourceARN]
  }

  object ApplicationSummary {
    def apply(
      RuntimeEnvironment: js.UndefOr[RuntimeEnvironment] = js.undefined,
      ApplicationStatus: js.UndefOr[ApplicationStatus] = js.undefined,
      ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      ApplicationARN: js.UndefOr[ResourceARN] = js.undefined): ApplicationSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuntimeEnvironment" -> RuntimeEnvironment.map { x => x.asInstanceOf[js.Any] },
        "ApplicationStatus" -> ApplicationStatus.map { x => x.asInstanceOf[js.Any] },
        "ApplicationVersionId" -> ApplicationVersionId.map { x => x.asInstanceOf[js.Any] },
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "ApplicationARN" -> ApplicationARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationSummary]
    }
  }

  /**
   * <p>For an SQL-based application, provides additional mapping information when the record format uses delimiters, such as CSV. For example, the following sample records use CSV format, where the records use the <i>'\n'</i> as the row delimiter and a comma (",") as the column delimiter: </p> <p> <code>"name1", "address1"</code> </p> <p> <code>"name2", "address2"</code> </p>
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
   * <p>Describes an application's checkpointing configuration. Checkpointing is the process of persisting application state for fault tolerance. For more information, see <a href="https://ci.apache.org/projects/flink/flink-docs-release-1.6/concepts/programming-model.html#checkpoints-for-fault-tolerance"> Checkpoints for Fault Tolerance</a> in the <a href="https://ci.apache.org/projects/flink/flink-docs-release-1.6/">Apache Flink Documentation</a>.</p>
   */
  @js.native
  trait CheckpointConfiguration extends js.Object {
    var ConfigurationType: js.UndefOr[ConfigurationType]
    var CheckpointingEnabled: js.UndefOr[BooleanObject]
    var CheckpointInterval: js.UndefOr[CheckpointInterval]
    var MinPauseBetweenCheckpoints: js.UndefOr[MinPauseBetweenCheckpoints]
  }

  object CheckpointConfiguration {
    def apply(
      ConfigurationType: js.UndefOr[ConfigurationType] = js.undefined,
      CheckpointingEnabled: js.UndefOr[BooleanObject] = js.undefined,
      CheckpointInterval: js.UndefOr[CheckpointInterval] = js.undefined,
      MinPauseBetweenCheckpoints: js.UndefOr[MinPauseBetweenCheckpoints] = js.undefined): CheckpointConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationType" -> ConfigurationType.map { x => x.asInstanceOf[js.Any] },
        "CheckpointingEnabled" -> CheckpointingEnabled.map { x => x.asInstanceOf[js.Any] },
        "CheckpointInterval" -> CheckpointInterval.map { x => x.asInstanceOf[js.Any] },
        "MinPauseBetweenCheckpoints" -> MinPauseBetweenCheckpoints.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CheckpointConfiguration]
    }
  }

  /**
   * <p>Describes checkpointing parameters for a Java-based Amazon Kinesis Data Analytics application.</p>
   */
  @js.native
  trait CheckpointConfigurationDescription extends js.Object {
    var ConfigurationType: js.UndefOr[ConfigurationType]
    var CheckpointingEnabled: js.UndefOr[BooleanObject]
    var CheckpointInterval: js.UndefOr[CheckpointInterval]
    var MinPauseBetweenCheckpoints: js.UndefOr[MinPauseBetweenCheckpoints]
  }

  object CheckpointConfigurationDescription {
    def apply(
      ConfigurationType: js.UndefOr[ConfigurationType] = js.undefined,
      CheckpointingEnabled: js.UndefOr[BooleanObject] = js.undefined,
      CheckpointInterval: js.UndefOr[CheckpointInterval] = js.undefined,
      MinPauseBetweenCheckpoints: js.UndefOr[MinPauseBetweenCheckpoints] = js.undefined): CheckpointConfigurationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationType" -> ConfigurationType.map { x => x.asInstanceOf[js.Any] },
        "CheckpointingEnabled" -> CheckpointingEnabled.map { x => x.asInstanceOf[js.Any] },
        "CheckpointInterval" -> CheckpointInterval.map { x => x.asInstanceOf[js.Any] },
        "MinPauseBetweenCheckpoints" -> MinPauseBetweenCheckpoints.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CheckpointConfigurationDescription]
    }
  }

  /**
   * <p>Describes updates to the checkpointing parameters for a Java-based Amazon Kinesis Data Analytics application.</p>
   */
  @js.native
  trait CheckpointConfigurationUpdate extends js.Object {
    var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType]
    var CheckpointingEnabledUpdate: js.UndefOr[BooleanObject]
    var CheckpointIntervalUpdate: js.UndefOr[CheckpointInterval]
    var MinPauseBetweenCheckpointsUpdate: js.UndefOr[MinPauseBetweenCheckpoints]
  }

  object CheckpointConfigurationUpdate {
    def apply(
      ConfigurationTypeUpdate: js.UndefOr[ConfigurationType] = js.undefined,
      CheckpointingEnabledUpdate: js.UndefOr[BooleanObject] = js.undefined,
      CheckpointIntervalUpdate: js.UndefOr[CheckpointInterval] = js.undefined,
      MinPauseBetweenCheckpointsUpdate: js.UndefOr[MinPauseBetweenCheckpoints] = js.undefined): CheckpointConfigurationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationTypeUpdate" -> ConfigurationTypeUpdate.map { x => x.asInstanceOf[js.Any] },
        "CheckpointingEnabledUpdate" -> CheckpointingEnabledUpdate.map { x => x.asInstanceOf[js.Any] },
        "CheckpointIntervalUpdate" -> CheckpointIntervalUpdate.map { x => x.asInstanceOf[js.Any] },
        "MinPauseBetweenCheckpointsUpdate" -> MinPauseBetweenCheckpointsUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CheckpointConfigurationUpdate]
    }
  }

  /**
   * <p>Provides a description of Amazon CloudWatch logging options, including the log stream Amazon Resource Name (ARN). </p>
   */
  @js.native
  trait CloudWatchLoggingOption extends js.Object {
    var LogStreamARN: js.UndefOr[LogStreamARN]
  }

  object CloudWatchLoggingOption {
    def apply(
      LogStreamARN: js.UndefOr[LogStreamARN] = js.undefined): CloudWatchLoggingOption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogStreamARN" -> LogStreamARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchLoggingOption]
    }
  }

  /**
   * <p>Describes the Amazon CloudWatch logging option.</p>
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
   * <p>Describes the Amazon CloudWatch logging option updates.</p>
   */
  @js.native
  trait CloudWatchLoggingOptionUpdate extends js.Object {
    var CloudWatchLoggingOptionId: js.UndefOr[Id]
    var LogStreamARNUpdate: js.UndefOr[LogStreamARN]
  }

  object CloudWatchLoggingOptionUpdate {
    def apply(
      CloudWatchLoggingOptionId: js.UndefOr[Id] = js.undefined,
      LogStreamARNUpdate: js.UndefOr[LogStreamARN] = js.undefined): CloudWatchLoggingOptionUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLoggingOptionId" -> CloudWatchLoggingOptionId.map { x => x.asInstanceOf[js.Any] },
        "LogStreamARNUpdate" -> LogStreamARNUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchLoggingOptionUpdate]
    }
  }

  /**
   * <p>Specifies either the application code, or the location of the application code, for a Java-based Amazon Kinesis Data Analytics application. </p>
   */
  @js.native
  trait CodeContent extends js.Object {
    var TextContent: js.UndefOr[TextContent]
    var ZipFileContent: js.UndefOr[ZipFileContent]
    var S3ContentLocation: js.UndefOr[S3ContentLocation]
  }

  object CodeContent {
    def apply(
      TextContent: js.UndefOr[TextContent] = js.undefined,
      ZipFileContent: js.UndefOr[ZipFileContent] = js.undefined,
      S3ContentLocation: js.UndefOr[S3ContentLocation] = js.undefined): CodeContent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TextContent" -> TextContent.map { x => x.asInstanceOf[js.Any] },
        "ZipFileContent" -> ZipFileContent.map { x => x.asInstanceOf[js.Any] },
        "S3ContentLocation" -> S3ContentLocation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CodeContent]
    }
  }

  /**
   * <p>Describes details about the application code for a Java-based Kinesis Data Analytics application.</p>
   */
  @js.native
  trait CodeContentDescription extends js.Object {
    var TextContent: js.UndefOr[TextContent]
    var CodeMD5: js.UndefOr[CodeMD5]
    var CodeSize: js.UndefOr[CodeSize]
    var S3ApplicationCodeLocationDescription: js.UndefOr[S3ApplicationCodeLocationDescription]
  }

  object CodeContentDescription {
    def apply(
      TextContent: js.UndefOr[TextContent] = js.undefined,
      CodeMD5: js.UndefOr[CodeMD5] = js.undefined,
      CodeSize: js.UndefOr[CodeSize] = js.undefined,
      S3ApplicationCodeLocationDescription: js.UndefOr[S3ApplicationCodeLocationDescription] = js.undefined): CodeContentDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TextContent" -> TextContent.map { x => x.asInstanceOf[js.Any] },
        "CodeMD5" -> CodeMD5.map { x => x.asInstanceOf[js.Any] },
        "CodeSize" -> CodeSize.map { x => x.asInstanceOf[js.Any] },
        "S3ApplicationCodeLocationDescription" -> S3ApplicationCodeLocationDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CodeContentDescription]
    }
  }

  object CodeContentTypeEnum {
    val PLAINTEXT = "PLAINTEXT"
    val ZIPFILE = "ZIPFILE"

    val values = IndexedSeq(PLAINTEXT, ZIPFILE)
  }

  /**
   * <p>Describes an update to the code of a Java-based Kinesis Data Analytics application.</p>
   */
  @js.native
  trait CodeContentUpdate extends js.Object {
    var TextContentUpdate: js.UndefOr[TextContent]
    var ZipFileContentUpdate: js.UndefOr[ZipFileContent]
    var S3ContentLocationUpdate: js.UndefOr[S3ContentLocationUpdate]
  }

  object CodeContentUpdate {
    def apply(
      TextContentUpdate: js.UndefOr[TextContent] = js.undefined,
      ZipFileContentUpdate: js.UndefOr[ZipFileContent] = js.undefined,
      S3ContentLocationUpdate: js.UndefOr[S3ContentLocationUpdate] = js.undefined): CodeContentUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TextContentUpdate" -> TextContentUpdate.map { x => x.asInstanceOf[js.Any] },
        "ZipFileContentUpdate" -> ZipFileContentUpdate.map { x => x.asInstanceOf[js.Any] },
        "S3ContentLocationUpdate" -> S3ContentLocationUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CodeContentUpdate]
    }
  }

  object ConfigurationTypeEnum {
    val DEFAULT = "DEFAULT"
    val CUSTOM = "CUSTOM"

    val values = IndexedSeq(DEFAULT, CUSTOM)
  }

  @js.native
  trait CreateApplicationRequest extends js.Object {
    var RuntimeEnvironment: js.UndefOr[RuntimeEnvironment]
    var ApplicationDescription: js.UndefOr[ApplicationDescription]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var ServiceExecutionRole: js.UndefOr[RoleARN]
    var ApplicationName: js.UndefOr[ApplicationName]
    var ApplicationConfiguration: js.UndefOr[ApplicationConfiguration]
  }

  object CreateApplicationRequest {
    def apply(
      RuntimeEnvironment: js.UndefOr[RuntimeEnvironment] = js.undefined,
      ApplicationDescription: js.UndefOr[ApplicationDescription] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      ServiceExecutionRole: js.UndefOr[RoleARN] = js.undefined,
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      ApplicationConfiguration: js.UndefOr[ApplicationConfiguration] = js.undefined): CreateApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuntimeEnvironment" -> RuntimeEnvironment.map { x => x.asInstanceOf[js.Any] },
        "ApplicationDescription" -> ApplicationDescription.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "ServiceExecutionRole" -> ServiceExecutionRole.map { x => x.asInstanceOf[js.Any] },
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "ApplicationConfiguration" -> ApplicationConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationRequest]
    }
  }

  @js.native
  trait CreateApplicationResponse extends js.Object {
    var ApplicationDetail: js.UndefOr[ApplicationDetail]
  }

  object CreateApplicationResponse {
    def apply(
      ApplicationDetail: js.UndefOr[ApplicationDetail] = js.undefined): CreateApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationDetail" -> ApplicationDetail.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationResponse]
    }
  }

  @js.native
  trait CreateApplicationSnapshotRequest extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var SnapshotName: js.UndefOr[SnapshotName]
  }

  object CreateApplicationSnapshotRequest {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      SnapshotName: js.UndefOr[SnapshotName] = js.undefined): CreateApplicationSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "SnapshotName" -> SnapshotName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationSnapshotRequest]
    }
  }

  @js.native
  trait CreateApplicationSnapshotResponse extends js.Object {

  }

  object CreateApplicationSnapshotResponse {
    def apply(): CreateApplicationSnapshotResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationSnapshotResponse]
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
    var ApplicationARN: js.UndefOr[ResourceARN]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var CloudWatchLoggingOptionDescriptions: js.UndefOr[CloudWatchLoggingOptionDescriptions]
  }

  object DeleteApplicationCloudWatchLoggingOptionResponse {
    def apply(
      ApplicationARN: js.UndefOr[ResourceARN] = js.undefined,
      ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
      CloudWatchLoggingOptionDescriptions: js.UndefOr[CloudWatchLoggingOptionDescriptions] = js.undefined): DeleteApplicationCloudWatchLoggingOptionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationARN" -> ApplicationARN.map { x => x.asInstanceOf[js.Any] },
        "ApplicationVersionId" -> ApplicationVersionId.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptionDescriptions" -> CloudWatchLoggingOptionDescriptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ApplicationARN: js.UndefOr[ResourceARN]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
  }

  object DeleteApplicationInputProcessingConfigurationResponse {
    def apply(
      ApplicationARN: js.UndefOr[ResourceARN] = js.undefined,
      ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined): DeleteApplicationInputProcessingConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationARN" -> ApplicationARN.map { x => x.asInstanceOf[js.Any] },
        "ApplicationVersionId" -> ApplicationVersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationInputProcessingConfigurationResponse]
    }
  }

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

  @js.native
  trait DeleteApplicationOutputResponse extends js.Object {
    var ApplicationARN: js.UndefOr[ResourceARN]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
  }

  object DeleteApplicationOutputResponse {
    def apply(
      ApplicationARN: js.UndefOr[ResourceARN] = js.undefined,
      ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined): DeleteApplicationOutputResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationARN" -> ApplicationARN.map { x => x.asInstanceOf[js.Any] },
        "ApplicationVersionId" -> ApplicationVersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ApplicationARN: js.UndefOr[ResourceARN]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
  }

  object DeleteApplicationReferenceDataSourceResponse {
    def apply(
      ApplicationARN: js.UndefOr[ResourceARN] = js.undefined,
      ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined): DeleteApplicationReferenceDataSourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationARN" -> ApplicationARN.map { x => x.asInstanceOf[js.Any] },
        "ApplicationVersionId" -> ApplicationVersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationReferenceDataSourceResponse]
    }
  }

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

  @js.native
  trait DeleteApplicationResponse extends js.Object {

  }

  object DeleteApplicationResponse {
    def apply(): DeleteApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationResponse]
    }
  }

  @js.native
  trait DeleteApplicationSnapshotRequest extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var SnapshotName: js.UndefOr[SnapshotName]
    var SnapshotCreationTimestamp: js.UndefOr[Timestamp]
  }

  object DeleteApplicationSnapshotRequest {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      SnapshotName: js.UndefOr[SnapshotName] = js.undefined,
      SnapshotCreationTimestamp: js.UndefOr[Timestamp] = js.undefined): DeleteApplicationSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "SnapshotName" -> SnapshotName.map { x => x.asInstanceOf[js.Any] },
        "SnapshotCreationTimestamp" -> SnapshotCreationTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationSnapshotRequest]
    }
  }

  @js.native
  trait DeleteApplicationSnapshotResponse extends js.Object {

  }

  object DeleteApplicationSnapshotResponse {
    def apply(): DeleteApplicationSnapshotResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationSnapshotResponse]
    }
  }

  @js.native
  trait DescribeApplicationRequest extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var IncludeAdditionalDetails: js.UndefOr[BooleanObject]
  }

  object DescribeApplicationRequest {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      IncludeAdditionalDetails: js.UndefOr[BooleanObject] = js.undefined): DescribeApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "IncludeAdditionalDetails" -> IncludeAdditionalDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeApplicationRequest]
    }
  }

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

  @js.native
  trait DescribeApplicationSnapshotRequest extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var SnapshotName: js.UndefOr[SnapshotName]
  }

  object DescribeApplicationSnapshotRequest {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      SnapshotName: js.UndefOr[SnapshotName] = js.undefined): DescribeApplicationSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "SnapshotName" -> SnapshotName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeApplicationSnapshotRequest]
    }
  }

  @js.native
  trait DescribeApplicationSnapshotResponse extends js.Object {
    var SnapshotDetails: js.UndefOr[SnapshotDetails]
  }

  object DescribeApplicationSnapshotResponse {
    def apply(
      SnapshotDetails: js.UndefOr[SnapshotDetails] = js.undefined): DescribeApplicationSnapshotResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotDetails" -> SnapshotDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeApplicationSnapshotResponse]
    }
  }

  /**
   * <p>Describes the data format when records are written to the destination in an SQL-based Amazon Kinesis Data Analytics application. </p>
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
    var InputProcessingConfiguration: js.UndefOr[InputProcessingConfiguration]
    var ServiceExecutionRole: js.UndefOr[RoleARN]
    var S3Configuration: js.UndefOr[S3Configuration]
  }

  object DiscoverInputSchemaRequest {
    def apply(
      InputStartingPositionConfiguration: js.UndefOr[InputStartingPositionConfiguration] = js.undefined,
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      InputProcessingConfiguration: js.UndefOr[InputProcessingConfiguration] = js.undefined,
      ServiceExecutionRole: js.UndefOr[RoleARN] = js.undefined,
      S3Configuration: js.UndefOr[S3Configuration] = js.undefined): DiscoverInputSchemaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputStartingPositionConfiguration" -> InputStartingPositionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "InputProcessingConfiguration" -> InputProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "ServiceExecutionRole" -> ServiceExecutionRole.map { x => x.asInstanceOf[js.Any] },
        "S3Configuration" -> S3Configuration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiscoverInputSchemaRequest]
    }
  }

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
   * <p>Describes execution properties for a Java-based Kinesis Data Analytics application.</p>
   */
  @js.native
  trait EnvironmentProperties extends js.Object {
    var PropertyGroups: js.UndefOr[PropertyGroups]
  }

  object EnvironmentProperties {
    def apply(
      PropertyGroups: js.UndefOr[PropertyGroups] = js.undefined): EnvironmentProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PropertyGroups" -> PropertyGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentProperties]
    }
  }

  /**
   * <p>Describes the execution properties for a Java-based Amazon Kinesis Data Analytics application.</p>
   */
  @js.native
  trait EnvironmentPropertyDescriptions extends js.Object {
    var PropertyGroupDescriptions: js.UndefOr[PropertyGroups]
  }

  object EnvironmentPropertyDescriptions {
    def apply(
      PropertyGroupDescriptions: js.UndefOr[PropertyGroups] = js.undefined): EnvironmentPropertyDescriptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PropertyGroupDescriptions" -> PropertyGroupDescriptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentPropertyDescriptions]
    }
  }

  /**
   * <p>Describes updates to the execution property groups for a Java-based Amazon Kinesis Data Analytics application.</p>
   */
  @js.native
  trait EnvironmentPropertyUpdates extends js.Object {
    var PropertyGroups: js.UndefOr[PropertyGroups]
  }

  object EnvironmentPropertyUpdates {
    def apply(
      PropertyGroups: js.UndefOr[PropertyGroups] = js.undefined): EnvironmentPropertyUpdates = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PropertyGroups" -> PropertyGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentPropertyUpdates]
    }
  }

  /**
   * <p>Describes configuration parameters for a Java-based Amazon Kinesis Data Analytics application.</p>
   */
  @js.native
  trait FlinkApplicationConfiguration extends js.Object {
    var CheckpointConfiguration: js.UndefOr[CheckpointConfiguration]
    var MonitoringConfiguration: js.UndefOr[MonitoringConfiguration]
    var ParallelismConfiguration: js.UndefOr[ParallelismConfiguration]
  }

  object FlinkApplicationConfiguration {
    def apply(
      CheckpointConfiguration: js.UndefOr[CheckpointConfiguration] = js.undefined,
      MonitoringConfiguration: js.UndefOr[MonitoringConfiguration] = js.undefined,
      ParallelismConfiguration: js.UndefOr[ParallelismConfiguration] = js.undefined): FlinkApplicationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CheckpointConfiguration" -> CheckpointConfiguration.map { x => x.asInstanceOf[js.Any] },
        "MonitoringConfiguration" -> MonitoringConfiguration.map { x => x.asInstanceOf[js.Any] },
        "ParallelismConfiguration" -> ParallelismConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FlinkApplicationConfiguration]
    }
  }

  /**
   * <p>Describes configuration parameters for a Java-based Amazon Kinesis Data Analytics application.</p>
   */
  @js.native
  trait FlinkApplicationConfigurationDescription extends js.Object {
    var CheckpointConfigurationDescription: js.UndefOr[CheckpointConfigurationDescription]
    var MonitoringConfigurationDescription: js.UndefOr[MonitoringConfigurationDescription]
    var ParallelismConfigurationDescription: js.UndefOr[ParallelismConfigurationDescription]
    var JobPlanDescription: js.UndefOr[JobPlanDescription]
  }

  object FlinkApplicationConfigurationDescription {
    def apply(
      CheckpointConfigurationDescription: js.UndefOr[CheckpointConfigurationDescription] = js.undefined,
      MonitoringConfigurationDescription: js.UndefOr[MonitoringConfigurationDescription] = js.undefined,
      ParallelismConfigurationDescription: js.UndefOr[ParallelismConfigurationDescription] = js.undefined,
      JobPlanDescription: js.UndefOr[JobPlanDescription] = js.undefined): FlinkApplicationConfigurationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CheckpointConfigurationDescription" -> CheckpointConfigurationDescription.map { x => x.asInstanceOf[js.Any] },
        "MonitoringConfigurationDescription" -> MonitoringConfigurationDescription.map { x => x.asInstanceOf[js.Any] },
        "ParallelismConfigurationDescription" -> ParallelismConfigurationDescription.map { x => x.asInstanceOf[js.Any] },
        "JobPlanDescription" -> JobPlanDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FlinkApplicationConfigurationDescription]
    }
  }

  /**
   * <p>Describes updates to the configuration parameters for a Java-based Amazon Kinesis Data Analytics application.</p>
   */
  @js.native
  trait FlinkApplicationConfigurationUpdate extends js.Object {
    var CheckpointConfigurationUpdate: js.UndefOr[CheckpointConfigurationUpdate]
    var MonitoringConfigurationUpdate: js.UndefOr[MonitoringConfigurationUpdate]
    var ParallelismConfigurationUpdate: js.UndefOr[ParallelismConfigurationUpdate]
  }

  object FlinkApplicationConfigurationUpdate {
    def apply(
      CheckpointConfigurationUpdate: js.UndefOr[CheckpointConfigurationUpdate] = js.undefined,
      MonitoringConfigurationUpdate: js.UndefOr[MonitoringConfigurationUpdate] = js.undefined,
      ParallelismConfigurationUpdate: js.UndefOr[ParallelismConfigurationUpdate] = js.undefined): FlinkApplicationConfigurationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CheckpointConfigurationUpdate" -> CheckpointConfigurationUpdate.map { x => x.asInstanceOf[js.Any] },
        "MonitoringConfigurationUpdate" -> MonitoringConfigurationUpdate.map { x => x.asInstanceOf[js.Any] },
        "ParallelismConfigurationUpdate" -> ParallelismConfigurationUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FlinkApplicationConfigurationUpdate]
    }
  }

  /**
   * <p>When you configure the application input for an SQL-based Amazon Kinesis Data Analytics application, you specify the streaming source, the in-application stream name that is created, and the mapping between the two. </p>
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
   * <p>Describes the application input configuration for an SQL-based Amazon Kinesis Data Analytics application. </p>
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
   * <p>An object that contains the Amazon Resource Name (ARN) of the AWS Lambda function that is used to preprocess records in the stream in an SQL-based Amazon Kinesis Data Analytics application. </p>
   */
  @js.native
  trait InputLambdaProcessor extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
  }

  object InputLambdaProcessor {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined): InputLambdaProcessor = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputLambdaProcessor]
    }
  }

  /**
   * <p>For an SQL-based Amazon Kinesis Data Analytics application, an object that contains the Amazon Resource Name (ARN) of the AWS Lambda function that is used to preprocess records in the stream.</p>
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
   * <p>For an SQL-based Amazon Kinesis Data Analytics application, represents an update to the <a>InputLambdaProcessor</a> that is used to preprocess the records in the stream.</p>
   */
  @js.native
  trait InputLambdaProcessorUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
  }

  object InputLambdaProcessorUpdate {
    def apply(
      ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined): InputLambdaProcessorUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARNUpdate" -> ResourceARNUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputLambdaProcessorUpdate]
    }
  }

  /**
   * <p>For an SQL-based Amazon Kinesis Data Analytics application, describes the number of in-application streams to create for a given streaming source. </p>
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
   * <p>For an SQL-based Amazon Kinesis Data Analytics application, provides updates to the parallelism count.</p>
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
   * <p>For an SQL-based Amazon Kinesis Data Analytics application, describes a processor that is used to preprocess the records in the stream before being processed by your application code. Currently, the only input processor available is <a href="https://aws.amazon.com/documentation/lambda/">AWS Lambda</a>.</p>
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
   * <p>For an SQL-based Amazon Kinesis Data Analytics application, provides the configuration information about an input processor. Currently, the only input processor available is <a href="https://aws.amazon.com/documentation/lambda/">AWS Lambda</a>.</p>
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
   * <p>For an SQL-based Amazon Kinesis Data Analytics application, describes updates to an <a>InputProcessingConfiguration</a>.</p>
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
   * <p>Describes updates for an SQL-based Amazon Kinesis Data Analytics application's input schema.</p>
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
   * <p>For an SQL-based Amazon Kinesis Data Analytics application, describes updates to a specific input configuration (identified by the <code>InputId</code> of an application). </p>
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
   * <p>For an SQL-based Amazon Kinesis Data Analytics application, provides additional mapping information when JSON is the record format on the streaming source.</p>
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
   * <p>For an SQL-based Amazon Kinesis Data Analytics application, identifies a Kinesis Data Firehose delivery stream as the streaming source. You provide the delivery stream's Amazon Resource Name (ARN).</p>
   */
  @js.native
  trait KinesisFirehoseInput extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
  }

  object KinesisFirehoseInput {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined): KinesisFirehoseInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisFirehoseInput]
    }
  }

  /**
   * <p>Describes the Amazon Kinesis Data Firehose delivery stream that is configured as the streaming source in the application input configuration. </p>
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
   * <p>For an SQL-based Amazon Kinesis Data Analytics application, when updating application input configuration, provides information about a Kinesis Data Firehose delivery stream as the streaming source.</p>
   */
  @js.native
  trait KinesisFirehoseInputUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
  }

  object KinesisFirehoseInputUpdate {
    def apply(
      ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined): KinesisFirehoseInputUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARNUpdate" -> ResourceARNUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisFirehoseInputUpdate]
    }
  }

  /**
   * <p>For an SQL-based Amazon Kinesis Data Analytics application, when configuring application output, identifies a Kinesis Data Firehose delivery stream as the destination. You provide the stream Amazon Resource Name (ARN) of the delivery stream. </p>
   */
  @js.native
  trait KinesisFirehoseOutput extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
  }

  object KinesisFirehoseOutput {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined): KinesisFirehoseOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisFirehoseOutput]
    }
  }

  /**
   * <p>For an SQL-based Amazon Kinesis Data Analytics application's output, describes the Kinesis Data Firehose delivery stream that is configured as its destination.</p>
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
   * <p>For an SQL-based Amazon Kinesis Data Analytics application, when updating an output configuration using the <a>UpdateApplication</a> operation, provides information about a Kinesis Data Firehose delivery stream that is configured as the destination.</p>
   */
  @js.native
  trait KinesisFirehoseOutputUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
  }

  object KinesisFirehoseOutputUpdate {
    def apply(
      ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined): KinesisFirehoseOutputUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARNUpdate" -> ResourceARNUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisFirehoseOutputUpdate]
    }
  }

  /**
   * <p> Identifies an Amazon Kinesis data stream as the streaming source. You provide the stream's Amazon Resource Name (ARN).</p>
   */
  @js.native
  trait KinesisStreamsInput extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
  }

  object KinesisStreamsInput {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined): KinesisStreamsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisStreamsInput]
    }
  }

  /**
   * <p>For an SQL-based Amazon Kinesis Data Analytics application, describes the Kinesis data stream that is configured as the streaming source in the application input configuration. </p>
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
   * <p>When you update the input configuration for an SQL-based Amazon Kinesis Data Analytics application, provides information about an Amazon Kinesis stream as the streaming source.</p>
   */
  @js.native
  trait KinesisStreamsInputUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
  }

  object KinesisStreamsInputUpdate {
    def apply(
      ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined): KinesisStreamsInputUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARNUpdate" -> ResourceARNUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisStreamsInputUpdate]
    }
  }

  /**
   * <p>When you configure an SQL-based Amazon Kinesis Data Analytics application's output, identifies a Kinesis data stream as the destination. You provide the stream Amazon Resource Name (ARN). </p>
   */
  @js.native
  trait KinesisStreamsOutput extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
  }

  object KinesisStreamsOutput {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined): KinesisStreamsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisStreamsOutput]
    }
  }

  /**
   * <p>For an SQL-based Amazon Kinesis Data Analytics application's output, describes the Kinesis data stream that is configured as its destination. </p>
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
   * <p>When you update an SQL-based Amazon Kinesis Data Analytics application's output configuration using the <a>UpdateApplication</a> operation, provides information about a Kinesis data stream that is configured as the destination.</p>
   */
  @js.native
  trait KinesisStreamsOutputUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
  }

  object KinesisStreamsOutputUpdate {
    def apply(
      ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined): KinesisStreamsOutputUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARNUpdate" -> ResourceARNUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisStreamsOutputUpdate]
    }
  }

  /**
   * <p>When you configure an SQL-based Amazon Kinesis Data Analytics application's output, identifies an AWS Lambda function as the destination. You provide the function Amazon Resource Name (ARN) of the Lambda function. </p>
   */
  @js.native
  trait LambdaOutput extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
  }

  object LambdaOutput {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined): LambdaOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaOutput]
    }
  }

  /**
   * <p>For an SQL-based Amazon Kinesis Data Analytics application output, describes the AWS Lambda function that is configured as its destination. </p>
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
   * <p>When you update an SQL-based Amazon Kinesis Data Analytics application's output configuration using the <a>UpdateApplication</a> operation, provides information about an AWS Lambda function that is configured as the destination.</p>
   */
  @js.native
  trait LambdaOutputUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
  }

  object LambdaOutputUpdate {
    def apply(
      ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined): LambdaOutputUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARNUpdate" -> ResourceARNUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaOutputUpdate]
    }
  }

  @js.native
  trait ListApplicationSnapshotsRequest extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var Limit: js.UndefOr[ListSnapshotsInputLimit]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListApplicationSnapshotsRequest {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      Limit: js.UndefOr[ListSnapshotsInputLimit] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListApplicationSnapshotsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApplicationSnapshotsRequest]
    }
  }

  @js.native
  trait ListApplicationSnapshotsResponse extends js.Object {
    var SnapshotSummaries: js.UndefOr[SnapshotSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListApplicationSnapshotsResponse {
    def apply(
      SnapshotSummaries: js.UndefOr[SnapshotSummaries] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListApplicationSnapshotsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotSummaries" -> SnapshotSummaries.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApplicationSnapshotsResponse]
    }
  }

  @js.native
  trait ListApplicationsRequest extends js.Object {
    var Limit: js.UndefOr[ListApplicationsInputLimit]
    var NextToken: js.UndefOr[ApplicationName]
  }

  object ListApplicationsRequest {
    def apply(
      Limit: js.UndefOr[ListApplicationsInputLimit] = js.undefined,
      NextToken: js.UndefOr[ApplicationName] = js.undefined): ListApplicationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApplicationsRequest]
    }
  }

  @js.native
  trait ListApplicationsResponse extends js.Object {
    var ApplicationSummaries: js.UndefOr[ApplicationSummaries]
    var NextToken: js.UndefOr[ApplicationName]
  }

  object ListApplicationsResponse {
    def apply(
      ApplicationSummaries: js.UndefOr[ApplicationSummaries] = js.undefined,
      NextToken: js.UndefOr[ApplicationName] = js.undefined): ListApplicationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationSummaries" -> ApplicationSummaries.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApplicationsResponse]
    }
  }

  object LogLevelEnum {
    val INFO = "INFO"
    val WARN = "WARN"
    val ERROR = "ERROR"
    val DEBUG = "DEBUG"

    val values = IndexedSeq(INFO, WARN, ERROR, DEBUG)
  }

  /**
   * <p>When you configure an SQL-based Amazon Kinesis Data Analytics application's input at the time of creating or updating an application, provides additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.</p>
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

  object MetricsLevelEnum {
    val APPLICATION = "APPLICATION"
    val TASK = "TASK"
    val OPERATOR = "OPERATOR"
    val PARALLELISM = "PARALLELISM"

    val values = IndexedSeq(APPLICATION, TASK, OPERATOR, PARALLELISM)
  }

  /**
   * <p>Describes configuration parameters for Amazon CloudWatch logging for a Java-based Kinesis Data Analytics application. For more information about CloudWatch logging, see <a href="https://docs.aws.amazon.com/kinesisanalytics/latest/Java/monitoring-overview.html">Monitoring</a>.</p>
   */
  @js.native
  trait MonitoringConfiguration extends js.Object {
    var ConfigurationType: js.UndefOr[ConfigurationType]
    var MetricsLevel: js.UndefOr[MetricsLevel]
    var LogLevel: js.UndefOr[LogLevel]
  }

  object MonitoringConfiguration {
    def apply(
      ConfigurationType: js.UndefOr[ConfigurationType] = js.undefined,
      MetricsLevel: js.UndefOr[MetricsLevel] = js.undefined,
      LogLevel: js.UndefOr[LogLevel] = js.undefined): MonitoringConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationType" -> ConfigurationType.map { x => x.asInstanceOf[js.Any] },
        "MetricsLevel" -> MetricsLevel.map { x => x.asInstanceOf[js.Any] },
        "LogLevel" -> LogLevel.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MonitoringConfiguration]
    }
  }

  /**
   * <p>Describes configuration parameters for CloudWatch logging for a Java-based Kinesis Data Analytics application.</p>
   */
  @js.native
  trait MonitoringConfigurationDescription extends js.Object {
    var ConfigurationType: js.UndefOr[ConfigurationType]
    var MetricsLevel: js.UndefOr[MetricsLevel]
    var LogLevel: js.UndefOr[LogLevel]
  }

  object MonitoringConfigurationDescription {
    def apply(
      ConfigurationType: js.UndefOr[ConfigurationType] = js.undefined,
      MetricsLevel: js.UndefOr[MetricsLevel] = js.undefined,
      LogLevel: js.UndefOr[LogLevel] = js.undefined): MonitoringConfigurationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationType" -> ConfigurationType.map { x => x.asInstanceOf[js.Any] },
        "MetricsLevel" -> MetricsLevel.map { x => x.asInstanceOf[js.Any] },
        "LogLevel" -> LogLevel.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MonitoringConfigurationDescription]
    }
  }

  /**
   * <p>Describes updates to configuration parameters for Amazon CloudWatch logging for a Java-based Kinesis Data Analytics application.</p>
   */
  @js.native
  trait MonitoringConfigurationUpdate extends js.Object {
    var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType]
    var MetricsLevelUpdate: js.UndefOr[MetricsLevel]
    var LogLevelUpdate: js.UndefOr[LogLevel]
  }

  object MonitoringConfigurationUpdate {
    def apply(
      ConfigurationTypeUpdate: js.UndefOr[ConfigurationType] = js.undefined,
      MetricsLevelUpdate: js.UndefOr[MetricsLevel] = js.undefined,
      LogLevelUpdate: js.UndefOr[LogLevel] = js.undefined): MonitoringConfigurationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationTypeUpdate" -> ConfigurationTypeUpdate.map { x => x.asInstanceOf[js.Any] },
        "MetricsLevelUpdate" -> MetricsLevelUpdate.map { x => x.asInstanceOf[js.Any] },
        "LogLevelUpdate" -> LogLevelUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MonitoringConfigurationUpdate]
    }
  }

  /**
   * <p> Describes an SQL-based Amazon Kinesis Data Analytics application's output configuration, in which you identify an in-application stream and a destination where you want the in-application stream data to be written. The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream. </p> <p/>
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
   * <p>For an SQL-based Amazon Kinesis Data Analytics application, describes the application output configuration, which includes the in-application stream name and the destination where the stream data is written. The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream. </p>
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
   * <p> For an SQL-based Amazon Kinesis Data Analytics application, describes updates to the output configuration identified by the <code>OutputId</code>. </p>
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
   * <p>Describes parameters for how a Java-based Amazon Kinesis Data Analytics application executes multiple tasks simultaneously. For more information about parallelism, see <a href="https://ci.apache.org/projects/flink/flink-docs-stable/dev/parallel.html">Parallel Execution</a> in the <a href="https://ci.apache.org/projects/flink/flink-docs-release-1.6/">Apache Flink Documentation</a>.</p>
   */
  @js.native
  trait ParallelismConfiguration extends js.Object {
    var ConfigurationType: js.UndefOr[ConfigurationType]
    var Parallelism: js.UndefOr[Parallelism]
    var ParallelismPerKPU: js.UndefOr[ParallelismPerKPU]
    var AutoScalingEnabled: js.UndefOr[BooleanObject]
  }

  object ParallelismConfiguration {
    def apply(
      ConfigurationType: js.UndefOr[ConfigurationType] = js.undefined,
      Parallelism: js.UndefOr[Parallelism] = js.undefined,
      ParallelismPerKPU: js.UndefOr[ParallelismPerKPU] = js.undefined,
      AutoScalingEnabled: js.UndefOr[BooleanObject] = js.undefined): ParallelismConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationType" -> ConfigurationType.map { x => x.asInstanceOf[js.Any] },
        "Parallelism" -> Parallelism.map { x => x.asInstanceOf[js.Any] },
        "ParallelismPerKPU" -> ParallelismPerKPU.map { x => x.asInstanceOf[js.Any] },
        "AutoScalingEnabled" -> AutoScalingEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParallelismConfiguration]
    }
  }

  /**
   * <p>Describes parameters for how a Java-based Kinesis Data Analytics application executes multiple tasks simultaneously.</p>
   */
  @js.native
  trait ParallelismConfigurationDescription extends js.Object {
    var Parallelism: js.UndefOr[Parallelism]
    var ConfigurationType: js.UndefOr[ConfigurationType]
    var AutoScalingEnabled: js.UndefOr[BooleanObject]
    var ParallelismPerKPU: js.UndefOr[ParallelismPerKPU]
    var CurrentParallelism: js.UndefOr[Parallelism]
  }

  object ParallelismConfigurationDescription {
    def apply(
      Parallelism: js.UndefOr[Parallelism] = js.undefined,
      ConfigurationType: js.UndefOr[ConfigurationType] = js.undefined,
      AutoScalingEnabled: js.UndefOr[BooleanObject] = js.undefined,
      ParallelismPerKPU: js.UndefOr[ParallelismPerKPU] = js.undefined,
      CurrentParallelism: js.UndefOr[Parallelism] = js.undefined): ParallelismConfigurationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Parallelism" -> Parallelism.map { x => x.asInstanceOf[js.Any] },
        "ConfigurationType" -> ConfigurationType.map { x => x.asInstanceOf[js.Any] },
        "AutoScalingEnabled" -> AutoScalingEnabled.map { x => x.asInstanceOf[js.Any] },
        "ParallelismPerKPU" -> ParallelismPerKPU.map { x => x.asInstanceOf[js.Any] },
        "CurrentParallelism" -> CurrentParallelism.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParallelismConfigurationDescription]
    }
  }

  /**
   * <p>Describes updates to parameters for how a Java-based Kinesis Data Analytics application executes multiple tasks simultaneously.</p>
   */
  @js.native
  trait ParallelismConfigurationUpdate extends js.Object {
    var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType]
    var ParallelismUpdate: js.UndefOr[Parallelism]
    var ParallelismPerKPUUpdate: js.UndefOr[ParallelismPerKPU]
    var AutoScalingEnabledUpdate: js.UndefOr[BooleanObject]
  }

  object ParallelismConfigurationUpdate {
    def apply(
      ConfigurationTypeUpdate: js.UndefOr[ConfigurationType] = js.undefined,
      ParallelismUpdate: js.UndefOr[Parallelism] = js.undefined,
      ParallelismPerKPUUpdate: js.UndefOr[ParallelismPerKPU] = js.undefined,
      AutoScalingEnabledUpdate: js.UndefOr[BooleanObject] = js.undefined): ParallelismConfigurationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationTypeUpdate" -> ConfigurationTypeUpdate.map { x => x.asInstanceOf[js.Any] },
        "ParallelismUpdate" -> ParallelismUpdate.map { x => x.asInstanceOf[js.Any] },
        "ParallelismPerKPUUpdate" -> ParallelismPerKPUUpdate.map { x => x.asInstanceOf[js.Any] },
        "AutoScalingEnabledUpdate" -> AutoScalingEnabledUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParallelismConfigurationUpdate]
    }
  }

  /**
   * <p>Property key-value pairs passed into a Java-based Kinesis Data Analytics application.</p>
   */
  @js.native
  trait PropertyGroup extends js.Object {
    var PropertyGroupId: js.UndefOr[Id]
    var PropertyMap: js.UndefOr[PropertyMap]
  }

  object PropertyGroup {
    def apply(
      PropertyGroupId: js.UndefOr[Id] = js.undefined,
      PropertyMap: js.UndefOr[PropertyMap] = js.undefined): PropertyGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PropertyGroupId" -> PropertyGroupId.map { x => x.asInstanceOf[js.Any] },
        "PropertyMap" -> PropertyMap.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PropertyGroup]
    }
  }

  /**
   * <p>For an SQL-based Amazon Kinesis Data Analytics application, describes the mapping of each data element in the streaming source to the corresponding column in the in-application stream.</p> <p>Also used to describe the format of the reference data source.</p>
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
   * <p> For an SQL-based Amazon Kinesis Data Analytics application, describes the record format and relevant mapping information that should be applied to schematize the records on the stream. </p>
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
   * <p>For an SQL-based Amazon Kinesis Data Analytics application, describes the reference data source by providing the source information (Amazon S3 bucket name and object key name), the resulting in-application table name that is created, and the necessary schema to map the data elements in the Amazon S3 object to the in-application table.</p>
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
   * <p>For an SQL-based Amazon Kinesis Data Analytics application, describes the reference data source configured for an application.</p>
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
   * <p>When you update a reference data source configuration for a SQL-based Amazon Kinesis Data Analytics application, this object provides all the updated values (such as the source bucket name and object key name), the in-application table name that is created, and updated mapping information that maps the data in the Amazon S3 object to the in-application reference table that is created.</p>
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
   * <p>Describes the starting parameters for an Amazon Kinesis Data Analytics application.</p>
   */
  @js.native
  trait RunConfiguration extends js.Object {
    var SqlRunConfigurations: js.UndefOr[SqlRunConfigurations]
    var ApplicationRestoreConfiguration: js.UndefOr[ApplicationRestoreConfiguration]
  }

  object RunConfiguration {
    def apply(
      SqlRunConfigurations: js.UndefOr[SqlRunConfigurations] = js.undefined,
      ApplicationRestoreConfiguration: js.UndefOr[ApplicationRestoreConfiguration] = js.undefined): RunConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SqlRunConfigurations" -> SqlRunConfigurations.map { x => x.asInstanceOf[js.Any] },
        "ApplicationRestoreConfiguration" -> ApplicationRestoreConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunConfiguration]
    }
  }

  /**
   * <p>Describes the starting properties for a Kinesis Data Analytics application.</p>
   */
  @js.native
  trait RunConfigurationDescription extends js.Object {
    var ApplicationRestoreConfigurationDescription: js.UndefOr[ApplicationRestoreConfiguration]
  }

  object RunConfigurationDescription {
    def apply(
      ApplicationRestoreConfigurationDescription: js.UndefOr[ApplicationRestoreConfiguration] = js.undefined): RunConfigurationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationRestoreConfigurationDescription" -> ApplicationRestoreConfigurationDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunConfigurationDescription]
    }
  }

  /**
   * <p>Describes the updates to the starting parameters for a Kinesis Data Analytics application.</p>
   */
  @js.native
  trait RunConfigurationUpdate extends js.Object {
    var ApplicationRestoreConfiguration: js.UndefOr[ApplicationRestoreConfiguration]
  }

  object RunConfigurationUpdate {
    def apply(
      ApplicationRestoreConfiguration: js.UndefOr[ApplicationRestoreConfiguration] = js.undefined): RunConfigurationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationRestoreConfiguration" -> ApplicationRestoreConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunConfigurationUpdate]
    }
  }

  object RuntimeEnvironmentEnum {
    val `SQL-1_0` = "SQL-1_0"
    val `FLINK-1_6` = "FLINK-1_6"

    val values = IndexedSeq(`SQL-1_0`, `FLINK-1_6`)
  }

  /**
   * <p>Describes the location of a Java-based Amazon Kinesis Data Analytics application's code stored in an S3 bucket.</p>
   */
  @js.native
  trait S3ApplicationCodeLocationDescription extends js.Object {
    var BucketARN: js.UndefOr[BucketARN]
    var FileKey: js.UndefOr[FileKey]
    var ObjectVersion: js.UndefOr[ObjectVersion]
  }

  object S3ApplicationCodeLocationDescription {
    def apply(
      BucketARN: js.UndefOr[BucketARN] = js.undefined,
      FileKey: js.UndefOr[FileKey] = js.undefined,
      ObjectVersion: js.UndefOr[ObjectVersion] = js.undefined): S3ApplicationCodeLocationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARN" -> BucketARN.map { x => x.asInstanceOf[js.Any] },
        "FileKey" -> FileKey.map { x => x.asInstanceOf[js.Any] },
        "ObjectVersion" -> ObjectVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3ApplicationCodeLocationDescription]
    }
  }

  /**
   * <p>For an SQL-based Amazon Kinesis Data Analytics application, provides a description of an Amazon S3 data source, including the Amazon Resource Name (ARN) of the S3 bucket and the name of the Amazon S3 object that contains the data.</p>
   */
  @js.native
  trait S3Configuration extends js.Object {
    var BucketARN: js.UndefOr[BucketARN]
    var FileKey: js.UndefOr[FileKey]
  }

  object S3Configuration {
    def apply(
      BucketARN: js.UndefOr[BucketARN] = js.undefined,
      FileKey: js.UndefOr[FileKey] = js.undefined): S3Configuration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARN" -> BucketARN.map { x => x.asInstanceOf[js.Any] },
        "FileKey" -> FileKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Configuration]
    }
  }

  /**
   * <p>For a Java-based Amazon Kinesis Data Analytics application, provides a description of an Amazon S3 object, including the Amazon Resource Name (ARN) of the S3 bucket, the name of the Amazon S3 object that contains the data, and the version number of the Amazon S3 object that contains the data. </p>
   */
  @js.native
  trait S3ContentLocation extends js.Object {
    var BucketARN: js.UndefOr[BucketARN]
    var FileKey: js.UndefOr[FileKey]
    var ObjectVersion: js.UndefOr[ObjectVersion]
  }

  object S3ContentLocation {
    def apply(
      BucketARN: js.UndefOr[BucketARN] = js.undefined,
      FileKey: js.UndefOr[FileKey] = js.undefined,
      ObjectVersion: js.UndefOr[ObjectVersion] = js.undefined): S3ContentLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARN" -> BucketARN.map { x => x.asInstanceOf[js.Any] },
        "FileKey" -> FileKey.map { x => x.asInstanceOf[js.Any] },
        "ObjectVersion" -> ObjectVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3ContentLocation]
    }
  }

  /**
   * <p>Describes an update for the Amazon S3 code content location for a Java-based Amazon Kinesis Data Analytics application.</p>
   */
  @js.native
  trait S3ContentLocationUpdate extends js.Object {
    var BucketARNUpdate: js.UndefOr[BucketARN]
    var FileKeyUpdate: js.UndefOr[FileKey]
    var ObjectVersionUpdate: js.UndefOr[ObjectVersion]
  }

  object S3ContentLocationUpdate {
    def apply(
      BucketARNUpdate: js.UndefOr[BucketARN] = js.undefined,
      FileKeyUpdate: js.UndefOr[FileKey] = js.undefined,
      ObjectVersionUpdate: js.UndefOr[ObjectVersion] = js.undefined): S3ContentLocationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARNUpdate" -> BucketARNUpdate.map { x => x.asInstanceOf[js.Any] },
        "FileKeyUpdate" -> FileKeyUpdate.map { x => x.asInstanceOf[js.Any] },
        "ObjectVersionUpdate" -> ObjectVersionUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3ContentLocationUpdate]
    }
  }

  /**
   * <p>For an SQL-based Amazon Kinesis Data Analytics application, identifies the Amazon S3 bucket and object that contains the reference data.</p> <p>A Kinesis Data Analytics application loads reference data only once. If the data changes, you call the <a>UpdateApplication</a> operation to trigger reloading of data into your application. </p>
   */
  @js.native
  trait S3ReferenceDataSource extends js.Object {
    var BucketARN: js.UndefOr[BucketARN]
    var FileKey: js.UndefOr[FileKey]
  }

  object S3ReferenceDataSource {
    def apply(
      BucketARN: js.UndefOr[BucketARN] = js.undefined,
      FileKey: js.UndefOr[FileKey] = js.undefined): S3ReferenceDataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARN" -> BucketARN.map { x => x.asInstanceOf[js.Any] },
        "FileKey" -> FileKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3ReferenceDataSource]
    }
  }

  /**
   * <p>For an SQL-based Amazon Kinesis Data Analytics application, provides the bucket name and object key name that stores the reference data.</p>
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
   * <p>For an SQL-based Amazon Kinesis Data Analytics application, describes the Amazon S3 bucket name and object key name for an in-application reference table. </p>
   */
  @js.native
  trait S3ReferenceDataSourceUpdate extends js.Object {
    var BucketARNUpdate: js.UndefOr[BucketARN]
    var FileKeyUpdate: js.UndefOr[FileKey]
  }

  object S3ReferenceDataSourceUpdate {
    def apply(
      BucketARNUpdate: js.UndefOr[BucketARN] = js.undefined,
      FileKeyUpdate: js.UndefOr[FileKey] = js.undefined): S3ReferenceDataSourceUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARNUpdate" -> BucketARNUpdate.map { x => x.asInstanceOf[js.Any] },
        "FileKeyUpdate" -> FileKeyUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3ReferenceDataSourceUpdate]
    }
  }

  /**
   * <p>Provides details about a snapshot of application state.</p>
   */
  @js.native
  trait SnapshotDetails extends js.Object {
    var SnapshotName: js.UndefOr[SnapshotName]
    var SnapshotStatus: js.UndefOr[SnapshotStatus]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var SnapshotCreationTimestamp: js.UndefOr[Timestamp]
  }

  object SnapshotDetails {
    def apply(
      SnapshotName: js.UndefOr[SnapshotName] = js.undefined,
      SnapshotStatus: js.UndefOr[SnapshotStatus] = js.undefined,
      ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
      SnapshotCreationTimestamp: js.UndefOr[Timestamp] = js.undefined): SnapshotDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotName" -> SnapshotName.map { x => x.asInstanceOf[js.Any] },
        "SnapshotStatus" -> SnapshotStatus.map { x => x.asInstanceOf[js.Any] },
        "ApplicationVersionId" -> ApplicationVersionId.map { x => x.asInstanceOf[js.Any] },
        "SnapshotCreationTimestamp" -> SnapshotCreationTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotDetails]
    }
  }

  object SnapshotStatusEnum {
    val CREATING = "CREATING"
    val READY = "READY"
    val DELETING = "DELETING"
    val FAILED = "FAILED"

    val values = IndexedSeq(CREATING, READY, DELETING, FAILED)
  }

  /**
   * <p>For an SQL-based Amazon Kinesis Data Analytics application, describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream. </p>
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
   * <p>Describes the inputs, outputs, and reference data sources for an SQL-based Kinesis Data Analytics application.</p>
   */
  @js.native
  trait SqlApplicationConfiguration extends js.Object {
    var Inputs: js.UndefOr[Inputs]
    var Outputs: js.UndefOr[Outputs]
    var ReferenceDataSources: js.UndefOr[ReferenceDataSources]
  }

  object SqlApplicationConfiguration {
    def apply(
      Inputs: js.UndefOr[Inputs] = js.undefined,
      Outputs: js.UndefOr[Outputs] = js.undefined,
      ReferenceDataSources: js.UndefOr[ReferenceDataSources] = js.undefined): SqlApplicationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Inputs" -> Inputs.map { x => x.asInstanceOf[js.Any] },
        "Outputs" -> Outputs.map { x => x.asInstanceOf[js.Any] },
        "ReferenceDataSources" -> ReferenceDataSources.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SqlApplicationConfiguration]
    }
  }

  /**
   * <p>Describes the inputs, outputs, and reference data sources for an SQL-based Kinesis Data Analytics application.</p>
   */
  @js.native
  trait SqlApplicationConfigurationDescription extends js.Object {
    var InputDescriptions: js.UndefOr[InputDescriptions]
    var OutputDescriptions: js.UndefOr[OutputDescriptions]
    var ReferenceDataSourceDescriptions: js.UndefOr[ReferenceDataSourceDescriptions]
  }

  object SqlApplicationConfigurationDescription {
    def apply(
      InputDescriptions: js.UndefOr[InputDescriptions] = js.undefined,
      OutputDescriptions: js.UndefOr[OutputDescriptions] = js.undefined,
      ReferenceDataSourceDescriptions: js.UndefOr[ReferenceDataSourceDescriptions] = js.undefined): SqlApplicationConfigurationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputDescriptions" -> InputDescriptions.map { x => x.asInstanceOf[js.Any] },
        "OutputDescriptions" -> OutputDescriptions.map { x => x.asInstanceOf[js.Any] },
        "ReferenceDataSourceDescriptions" -> ReferenceDataSourceDescriptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SqlApplicationConfigurationDescription]
    }
  }

  /**
   * <p>Describes updates to the input streams, destination streams, and reference data sources for an SQL-based Kinesis Data Analytics application.</p>
   */
  @js.native
  trait SqlApplicationConfigurationUpdate extends js.Object {
    var InputUpdates: js.UndefOr[InputUpdates]
    var OutputUpdates: js.UndefOr[OutputUpdates]
    var ReferenceDataSourceUpdates: js.UndefOr[ReferenceDataSourceUpdates]
  }

  object SqlApplicationConfigurationUpdate {
    def apply(
      InputUpdates: js.UndefOr[InputUpdates] = js.undefined,
      OutputUpdates: js.UndefOr[OutputUpdates] = js.undefined,
      ReferenceDataSourceUpdates: js.UndefOr[ReferenceDataSourceUpdates] = js.undefined): SqlApplicationConfigurationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputUpdates" -> InputUpdates.map { x => x.asInstanceOf[js.Any] },
        "OutputUpdates" -> OutputUpdates.map { x => x.asInstanceOf[js.Any] },
        "ReferenceDataSourceUpdates" -> ReferenceDataSourceUpdates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SqlApplicationConfigurationUpdate]
    }
  }

  /**
   * <p>Describes the starting parameters for an SQL-based Kinesis Data Analytics application.</p>
   */
  @js.native
  trait SqlRunConfiguration extends js.Object {
    var InputId: js.UndefOr[Id]
    var InputStartingPositionConfiguration: js.UndefOr[InputStartingPositionConfiguration]
  }

  object SqlRunConfiguration {
    def apply(
      InputId: js.UndefOr[Id] = js.undefined,
      InputStartingPositionConfiguration: js.UndefOr[InputStartingPositionConfiguration] = js.undefined): SqlRunConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputId" -> InputId.map { x => x.asInstanceOf[js.Any] },
        "InputStartingPositionConfiguration" -> InputStartingPositionConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SqlRunConfiguration]
    }
  }

  @js.native
  trait StartApplicationRequest extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var RunConfiguration: js.UndefOr[RunConfiguration]
  }

  object StartApplicationRequest {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      RunConfiguration: js.UndefOr[RunConfiguration] = js.undefined): StartApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "RunConfiguration" -> RunConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartApplicationRequest]
    }
  }

  @js.native
  trait StartApplicationResponse extends js.Object {

  }

  object StartApplicationResponse {
    def apply(): StartApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartApplicationResponse]
    }
  }

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
    var ApplicationConfigurationUpdate: js.UndefOr[ApplicationConfigurationUpdate]
    var RunConfigurationUpdate: js.UndefOr[RunConfigurationUpdate]
    var ServiceExecutionRoleUpdate: js.UndefOr[RoleARN]
    var CloudWatchLoggingOptionUpdates: js.UndefOr[CloudWatchLoggingOptionUpdates]
    var CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var ApplicationName: js.UndefOr[ApplicationName]
  }

  object UpdateApplicationRequest {
    def apply(
      ApplicationConfigurationUpdate: js.UndefOr[ApplicationConfigurationUpdate] = js.undefined,
      RunConfigurationUpdate: js.UndefOr[RunConfigurationUpdate] = js.undefined,
      ServiceExecutionRoleUpdate: js.UndefOr[RoleARN] = js.undefined,
      CloudWatchLoggingOptionUpdates: js.UndefOr[CloudWatchLoggingOptionUpdates] = js.undefined,
      CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined): UpdateApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationConfigurationUpdate" -> ApplicationConfigurationUpdate.map { x => x.asInstanceOf[js.Any] },
        "RunConfigurationUpdate" -> RunConfigurationUpdate.map { x => x.asInstanceOf[js.Any] },
        "ServiceExecutionRoleUpdate" -> ServiceExecutionRoleUpdate.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptionUpdates" -> CloudWatchLoggingOptionUpdates.map { x => x.asInstanceOf[js.Any] },
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.map { x => x.asInstanceOf[js.Any] },
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApplicationRequest]
    }
  }

  @js.native
  trait UpdateApplicationResponse extends js.Object {
    var ApplicationDetail: js.UndefOr[ApplicationDetail]
  }

  object UpdateApplicationResponse {
    def apply(
      ApplicationDetail: js.UndefOr[ApplicationDetail] = js.undefined): UpdateApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationDetail" -> ApplicationDetail.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApplicationResponse]
    }
  }
}
