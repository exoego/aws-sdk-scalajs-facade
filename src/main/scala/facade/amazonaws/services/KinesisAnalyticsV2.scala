package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object kinesisanalyticsv2 {
  type ApplicationDescription              = String
  type ApplicationName                     = String
  type ApplicationRestoreType              = String
  type ApplicationStatus                   = String
  type ApplicationSummaries                = js.Array[ApplicationSummary]
  type ApplicationVersionId                = Double
  type BooleanObject                       = Boolean
  type BucketARN                           = String
  type CheckpointInterval                  = Double
  type CloudWatchLoggingOptionDescriptions = js.Array[CloudWatchLoggingOptionDescription]
  type CloudWatchLoggingOptionUpdates      = js.Array[CloudWatchLoggingOptionUpdate]
  type CloudWatchLoggingOptions            = js.Array[CloudWatchLoggingOption]
  type CodeContentType                     = String
  type CodeMD5                             = String
  type CodeSize                            = Double
  type ConfigurationType                   = String
  type FileKey                             = String
  type Id                                  = String
  type InAppStreamName                     = String
  type InAppStreamNames                    = js.Array[InAppStreamName]
  type InAppTableName                      = String
  type InputDescriptions                   = js.Array[InputDescription]
  type InputParallelismCount               = Int
  type InputStartingPosition               = String
  type InputUpdates                        = js.Array[InputUpdate]
  type Inputs                              = js.Array[Input]
  type JobPlanDescription                  = String
  type ListApplicationsInputLimit          = Int
  type ListSnapshotsInputLimit             = Int
  type LogLevel                            = String
  type LogStreamARN                        = String
  type MetricsLevel                        = String
  type MinPauseBetweenCheckpoints          = Double
  type NextToken                           = String
  type ObjectVersion                       = String
  type OutputDescriptions                  = js.Array[OutputDescription]
  type OutputUpdates                       = js.Array[OutputUpdate]
  type Outputs                             = js.Array[Output]
  type Parallelism                         = Int
  type ParallelismPerKPU                   = Int
  type ParsedInputRecord                   = js.Array[ParsedInputRecordField]
  type ParsedInputRecordField              = String
  type ParsedInputRecords                  = js.Array[ParsedInputRecord]
  type ProcessedInputRecord                = String
  type ProcessedInputRecords               = js.Array[ProcessedInputRecord]
  type PropertyGroups                      = js.Array[PropertyGroup]
  type PropertyKey                         = String
  type PropertyMap                         = js.Dictionary[PropertyValue]
  type PropertyValue                       = String
  type RawInputRecord                      = String
  type RawInputRecords                     = js.Array[RawInputRecord]
  type RecordColumnDelimiter               = String
  type RecordColumnMapping                 = String
  type RecordColumnName                    = String
  type RecordColumnSqlType                 = String
  type RecordColumns                       = js.Array[RecordColumn]
  type RecordEncoding                      = String
  type RecordFormatType                    = String
  type RecordRowDelimiter                  = String
  type RecordRowPath                       = String
  type ReferenceDataSourceDescriptions     = js.Array[ReferenceDataSourceDescription]
  type ReferenceDataSourceUpdates          = js.Array[ReferenceDataSourceUpdate]
  type ReferenceDataSources                = js.Array[ReferenceDataSource]
  type ResourceARN                         = String
  type RoleARN                             = String
  type RuntimeEnvironment                  = String
  type SnapshotName                        = String
  type SnapshotStatus                      = String
  type SnapshotSummaries                   = js.Array[SnapshotDetails]
  type SqlRunConfigurations                = js.Array[SqlRunConfiguration]
  type TextContent                         = String
  type Timestamp                           = js.Date
  type ZipFileContent =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
}

package kinesisanalyticsv2 {
  @js.native
  @JSImport("aws-sdk", "KinesisAnalyticsV2")
  class KinesisAnalyticsV2() extends js.Object {
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
    def createApplicationSnapshot(
        params: CreateApplicationSnapshotRequest
    ): Request[CreateApplicationSnapshotResponse]                                               = js.native
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
    ): Request[DeleteApplicationReferenceDataSourceResponse] = js.native
    def deleteApplicationSnapshot(
        params: DeleteApplicationSnapshotRequest
    ): Request[DeleteApplicationSnapshotResponse]                                                     = js.native
    def describeApplication(params: DescribeApplicationRequest): Request[DescribeApplicationResponse] = js.native
    def describeApplicationSnapshot(
        params: DescribeApplicationSnapshotRequest
    ): Request[DescribeApplicationSnapshotResponse]                                                   = js.native
    def discoverInputSchema(params: DiscoverInputSchemaRequest): Request[DiscoverInputSchemaResponse] = js.native
    def listApplicationSnapshots(params: ListApplicationSnapshotsRequest): Request[ListApplicationSnapshotsResponse] =
      js.native
    def listApplications(params: ListApplicationsRequest): Request[ListApplicationsResponse]    = js.native
    def startApplication(params: StartApplicationRequest): Request[StartApplicationResponse]    = js.native
    def stopApplication(params: StopApplicationRequest): Request[StopApplicationResponse]       = js.native
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
        CurrentApplicationVersionId: ApplicationVersionId
    ): AddApplicationCloudWatchLoggingOptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName"             -> ApplicationName.asInstanceOf[js.Any],
        "CloudWatchLoggingOption"     -> CloudWatchLoggingOption.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[AddApplicationCloudWatchLoggingOptionRequest]
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
        CloudWatchLoggingOptionDescriptions: js.UndefOr[CloudWatchLoggingOptionDescriptions] = js.undefined
    ): AddApplicationCloudWatchLoggingOptionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationARN" -> ApplicationARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplicationVersionId" -> ApplicationVersionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CloudWatchLoggingOptionDescriptions" -> CloudWatchLoggingOptionDescriptions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[AddApplicationCloudWatchLoggingOptionResponse]
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
        InputProcessingConfiguration: InputProcessingConfiguration
    ): AddApplicationInputProcessingConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName"              -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId"  -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "InputId"                      -> InputId.asInstanceOf[js.Any],
        "InputProcessingConfiguration" -> InputProcessingConfiguration.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[AddApplicationInputProcessingConfigurationRequest]
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
        InputProcessingConfigurationDescription: js.UndefOr[InputProcessingConfigurationDescription] = js.undefined
    ): AddApplicationInputProcessingConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationARN" -> ApplicationARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplicationVersionId" -> ApplicationVersionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputId" -> InputId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputProcessingConfigurationDescription" -> InputProcessingConfigurationDescription.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[AddApplicationInputProcessingConfigurationResponse]
    }
  }

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
        Input: Input
    ): AddApplicationInputRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName"             -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "Input"                       -> Input.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

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
        InputDescriptions: js.UndefOr[InputDescriptions] = js.undefined
    ): AddApplicationInputResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationARN" -> ApplicationARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplicationVersionId" -> ApplicationVersionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputDescriptions" -> InputDescriptions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddApplicationInputResponse]
    }
  }

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
        Output: Output
    ): AddApplicationOutputRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName"             -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "Output"                      -> Output.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

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
        OutputDescriptions: js.UndefOr[OutputDescriptions] = js.undefined
    ): AddApplicationOutputResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationARN" -> ApplicationARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplicationVersionId" -> ApplicationVersionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutputDescriptions" -> OutputDescriptions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddApplicationOutputResponse]
    }
  }

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
        ReferenceDataSource: ReferenceDataSource
    ): AddApplicationReferenceDataSourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName"             -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "ReferenceDataSource"         -> ReferenceDataSource.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

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
        ReferenceDataSourceDescriptions: js.UndefOr[ReferenceDataSourceDescriptions] = js.undefined
    ): AddApplicationReferenceDataSourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationARN" -> ApplicationARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplicationVersionId" -> ApplicationVersionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReferenceDataSourceDescriptions" -> ReferenceDataSourceDescriptions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddApplicationReferenceDataSourceResponse]
    }
  }

  /**
    * Describes code configuration for a Java-based Kinesis Data Analytics application.
    */
  @js.native
  trait ApplicationCodeConfiguration extends js.Object {
    var CodeContentType: CodeContentType
    var CodeContent: js.UndefOr[CodeContent]
  }

  object ApplicationCodeConfiguration {
    def apply(
        CodeContentType: CodeContentType,
        CodeContent: js.UndefOr[CodeContent] = js.undefined
    ): ApplicationCodeConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeContentType" -> CodeContentType.asInstanceOf[js.Any],
        "CodeContent" -> CodeContent.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationCodeConfiguration]
    }
  }

  /**
    * Describes code configuration for a Java-based Kinesis Data Analytics application.
    */
  @js.native
  trait ApplicationCodeConfigurationDescription extends js.Object {
    var CodeContentType: CodeContentType
    var CodeContentDescription: js.UndefOr[CodeContentDescription]
  }

  object ApplicationCodeConfigurationDescription {
    def apply(
        CodeContentType: CodeContentType,
        CodeContentDescription: js.UndefOr[CodeContentDescription] = js.undefined
    ): ApplicationCodeConfigurationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeContentType" -> CodeContentType.asInstanceOf[js.Any],
        "CodeContentDescription" -> CodeContentDescription.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationCodeConfigurationDescription]
    }
  }

  /**
    * Describes updates to a Java-based Amazon Kinesis Data Analytics application.
    */
  @js.native
  trait ApplicationCodeConfigurationUpdate extends js.Object {
    var CodeContentTypeUpdate: js.UndefOr[CodeContentType]
    var CodeContentUpdate: js.UndefOr[CodeContentUpdate]
  }

  object ApplicationCodeConfigurationUpdate {
    def apply(
        CodeContentTypeUpdate: js.UndefOr[CodeContentType] = js.undefined,
        CodeContentUpdate: js.UndefOr[CodeContentUpdate] = js.undefined
    ): ApplicationCodeConfigurationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeContentTypeUpdate" -> CodeContentTypeUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CodeContentUpdate" -> CodeContentUpdate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationCodeConfigurationUpdate]
    }
  }

  /**
    * Specifies the creation parameters for an Amazon Kinesis Data Analytics application.
    */
  @js.native
  trait ApplicationConfiguration extends js.Object {
    var ApplicationCodeConfiguration: ApplicationCodeConfiguration
    var ApplicationSnapshotConfiguration: js.UndefOr[ApplicationSnapshotConfiguration]
    var EnvironmentProperties: js.UndefOr[EnvironmentProperties]
    var FlinkApplicationConfiguration: js.UndefOr[FlinkApplicationConfiguration]
    var SqlApplicationConfiguration: js.UndefOr[SqlApplicationConfiguration]
  }

  object ApplicationConfiguration {
    def apply(
        ApplicationCodeConfiguration: ApplicationCodeConfiguration,
        ApplicationSnapshotConfiguration: js.UndefOr[ApplicationSnapshotConfiguration] = js.undefined,
        EnvironmentProperties: js.UndefOr[EnvironmentProperties] = js.undefined,
        FlinkApplicationConfiguration: js.UndefOr[FlinkApplicationConfiguration] = js.undefined,
        SqlApplicationConfiguration: js.UndefOr[SqlApplicationConfiguration] = js.undefined
    ): ApplicationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationCodeConfiguration" -> ApplicationCodeConfiguration.asInstanceOf[js.Any],
        "ApplicationSnapshotConfiguration" -> ApplicationSnapshotConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentProperties" -> EnvironmentProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FlinkApplicationConfiguration" -> FlinkApplicationConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SqlApplicationConfiguration" -> SqlApplicationConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationConfiguration]
    }
  }

  /**
    * Describes details about the application code and starting parameters for an Amazon Kinesis Data Analytics application.
    */
  @js.native
  trait ApplicationConfigurationDescription extends js.Object {
    var ApplicationCodeConfigurationDescription: js.UndefOr[ApplicationCodeConfigurationDescription]
    var ApplicationSnapshotConfigurationDescription: js.UndefOr[ApplicationSnapshotConfigurationDescription]
    var EnvironmentPropertyDescriptions: js.UndefOr[EnvironmentPropertyDescriptions]
    var FlinkApplicationConfigurationDescription: js.UndefOr[FlinkApplicationConfigurationDescription]
    var RunConfigurationDescription: js.UndefOr[RunConfigurationDescription]
    var SqlApplicationConfigurationDescription: js.UndefOr[SqlApplicationConfigurationDescription]
  }

  object ApplicationConfigurationDescription {
    def apply(
        ApplicationCodeConfigurationDescription: js.UndefOr[ApplicationCodeConfigurationDescription] = js.undefined,
        ApplicationSnapshotConfigurationDescription: js.UndefOr[ApplicationSnapshotConfigurationDescription] =
          js.undefined,
        EnvironmentPropertyDescriptions: js.UndefOr[EnvironmentPropertyDescriptions] = js.undefined,
        FlinkApplicationConfigurationDescription: js.UndefOr[FlinkApplicationConfigurationDescription] = js.undefined,
        RunConfigurationDescription: js.UndefOr[RunConfigurationDescription] = js.undefined,
        SqlApplicationConfigurationDescription: js.UndefOr[SqlApplicationConfigurationDescription] = js.undefined
    ): ApplicationConfigurationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationCodeConfigurationDescription" -> ApplicationCodeConfigurationDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplicationSnapshotConfigurationDescription" -> ApplicationSnapshotConfigurationDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentPropertyDescriptions" -> EnvironmentPropertyDescriptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FlinkApplicationConfigurationDescription" -> FlinkApplicationConfigurationDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RunConfigurationDescription" -> RunConfigurationDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SqlApplicationConfigurationDescription" -> SqlApplicationConfigurationDescription.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationConfigurationDescription]
    }
  }

  /**
    * Describes updates to an application's configuration.
    */
  @js.native
  trait ApplicationConfigurationUpdate extends js.Object {
    var ApplicationCodeConfigurationUpdate: js.UndefOr[ApplicationCodeConfigurationUpdate]
    var ApplicationSnapshotConfigurationUpdate: js.UndefOr[ApplicationSnapshotConfigurationUpdate]
    var EnvironmentPropertyUpdates: js.UndefOr[EnvironmentPropertyUpdates]
    var FlinkApplicationConfigurationUpdate: js.UndefOr[FlinkApplicationConfigurationUpdate]
    var SqlApplicationConfigurationUpdate: js.UndefOr[SqlApplicationConfigurationUpdate]
  }

  object ApplicationConfigurationUpdate {
    def apply(
        ApplicationCodeConfigurationUpdate: js.UndefOr[ApplicationCodeConfigurationUpdate] = js.undefined,
        ApplicationSnapshotConfigurationUpdate: js.UndefOr[ApplicationSnapshotConfigurationUpdate] = js.undefined,
        EnvironmentPropertyUpdates: js.UndefOr[EnvironmentPropertyUpdates] = js.undefined,
        FlinkApplicationConfigurationUpdate: js.UndefOr[FlinkApplicationConfigurationUpdate] = js.undefined,
        SqlApplicationConfigurationUpdate: js.UndefOr[SqlApplicationConfigurationUpdate] = js.undefined
    ): ApplicationConfigurationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationCodeConfigurationUpdate" -> ApplicationCodeConfigurationUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplicationSnapshotConfigurationUpdate" -> ApplicationSnapshotConfigurationUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentPropertyUpdates" -> EnvironmentPropertyUpdates.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FlinkApplicationConfigurationUpdate" -> FlinkApplicationConfigurationUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SqlApplicationConfigurationUpdate" -> SqlApplicationConfigurationUpdate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationConfigurationUpdate]
    }
  }

  /**
    * Describes the application, including the application Amazon Resource Name (ARN), status, latest version, and input and output configurations.
    */
  @js.native
  trait ApplicationDetail extends js.Object {
    var ApplicationARN: ResourceARN
    var ApplicationName: ApplicationName
    var ApplicationStatus: ApplicationStatus
    var ApplicationVersionId: ApplicationVersionId
    var RuntimeEnvironment: RuntimeEnvironment
    var ApplicationConfigurationDescription: js.UndefOr[ApplicationConfigurationDescription]
    var ApplicationDescription: js.UndefOr[ApplicationDescription]
    var CloudWatchLoggingOptionDescriptions: js.UndefOr[CloudWatchLoggingOptionDescriptions]
    var CreateTimestamp: js.UndefOr[Timestamp]
    var LastUpdateTimestamp: js.UndefOr[Timestamp]
    var ServiceExecutionRole: js.UndefOr[RoleARN]
  }

  object ApplicationDetail {
    def apply(
        ApplicationARN: ResourceARN,
        ApplicationName: ApplicationName,
        ApplicationStatus: ApplicationStatus,
        ApplicationVersionId: ApplicationVersionId,
        RuntimeEnvironment: RuntimeEnvironment,
        ApplicationConfigurationDescription: js.UndefOr[ApplicationConfigurationDescription] = js.undefined,
        ApplicationDescription: js.UndefOr[ApplicationDescription] = js.undefined,
        CloudWatchLoggingOptionDescriptions: js.UndefOr[CloudWatchLoggingOptionDescriptions] = js.undefined,
        CreateTimestamp: js.UndefOr[Timestamp] = js.undefined,
        LastUpdateTimestamp: js.UndefOr[Timestamp] = js.undefined,
        ServiceExecutionRole: js.UndefOr[RoleARN] = js.undefined
    ): ApplicationDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationARN"       -> ApplicationARN.asInstanceOf[js.Any],
        "ApplicationName"      -> ApplicationName.asInstanceOf[js.Any],
        "ApplicationStatus"    -> ApplicationStatus.asInstanceOf[js.Any],
        "ApplicationVersionId" -> ApplicationVersionId.asInstanceOf[js.Any],
        "RuntimeEnvironment"   -> RuntimeEnvironment.asInstanceOf[js.Any],
        "ApplicationConfigurationDescription" -> ApplicationConfigurationDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplicationDescription" -> ApplicationDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CloudWatchLoggingOptionDescriptions" -> CloudWatchLoggingOptionDescriptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreateTimestamp" -> CreateTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdateTimestamp" -> LastUpdateTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServiceExecutionRole" -> ServiceExecutionRole.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationDetail]
    }
  }

  /**
    * Specifies the method and snapshot to use when restarting an application using previously saved application state.
    */
  @js.native
  trait ApplicationRestoreConfiguration extends js.Object {
    var ApplicationRestoreType: ApplicationRestoreType
    var SnapshotName: js.UndefOr[SnapshotName]
  }

  object ApplicationRestoreConfiguration {
    def apply(
        ApplicationRestoreType: ApplicationRestoreType,
        SnapshotName: js.UndefOr[SnapshotName] = js.undefined
    ): ApplicationRestoreConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationRestoreType" -> ApplicationRestoreType.asInstanceOf[js.Any],
        "SnapshotName" -> SnapshotName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationRestoreConfiguration]
    }
  }

  object ApplicationRestoreTypeEnum {
    val SKIP_RESTORE_FROM_SNAPSHOT   = "SKIP_RESTORE_FROM_SNAPSHOT"
    val RESTORE_FROM_LATEST_SNAPSHOT = "RESTORE_FROM_LATEST_SNAPSHOT"
    val RESTORE_FROM_CUSTOM_SNAPSHOT = "RESTORE_FROM_CUSTOM_SNAPSHOT"

    val values = IndexedSeq(SKIP_RESTORE_FROM_SNAPSHOT, RESTORE_FROM_LATEST_SNAPSHOT, RESTORE_FROM_CUSTOM_SNAPSHOT)
  }

  /**
    * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
    */
  @js.native
  trait ApplicationSnapshotConfiguration extends js.Object {
    var SnapshotsEnabled: BooleanObject
  }

  object ApplicationSnapshotConfiguration {
    def apply(
        SnapshotsEnabled: BooleanObject
    ): ApplicationSnapshotConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotsEnabled" -> SnapshotsEnabled.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationSnapshotConfiguration]
    }
  }

  /**
    * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
    */
  @js.native
  trait ApplicationSnapshotConfigurationDescription extends js.Object {
    var SnapshotsEnabled: BooleanObject
  }

  object ApplicationSnapshotConfigurationDescription {
    def apply(
        SnapshotsEnabled: BooleanObject
    ): ApplicationSnapshotConfigurationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotsEnabled" -> SnapshotsEnabled.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[ApplicationSnapshotConfigurationDescription]
    }
  }

  /**
    * Describes updates to whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
    */
  @js.native
  trait ApplicationSnapshotConfigurationUpdate extends js.Object {
    var SnapshotsEnabledUpdate: BooleanObject
  }

  object ApplicationSnapshotConfigurationUpdate {
    def apply(
        SnapshotsEnabledUpdate: BooleanObject
    ): ApplicationSnapshotConfigurationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotsEnabledUpdate" -> SnapshotsEnabledUpdate.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationSnapshotConfigurationUpdate]
    }
  }

  object ApplicationStatusEnum {
    val DELETING = "DELETING"
    val STARTING = "STARTING"
    val STOPPING = "STOPPING"
    val READY    = "READY"
    val RUNNING  = "RUNNING"
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
    var ApplicationVersionId: ApplicationVersionId
    var RuntimeEnvironment: RuntimeEnvironment
  }

  object ApplicationSummary {
    def apply(
        ApplicationARN: ResourceARN,
        ApplicationName: ApplicationName,
        ApplicationStatus: ApplicationStatus,
        ApplicationVersionId: ApplicationVersionId,
        RuntimeEnvironment: RuntimeEnvironment
    ): ApplicationSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationARN"       -> ApplicationARN.asInstanceOf[js.Any],
        "ApplicationName"      -> ApplicationName.asInstanceOf[js.Any],
        "ApplicationStatus"    -> ApplicationStatus.asInstanceOf[js.Any],
        "ApplicationVersionId" -> ApplicationVersionId.asInstanceOf[js.Any],
        "RuntimeEnvironment"   -> RuntimeEnvironment.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationSummary]
    }
  }

  /**
    * For an SQL-based application, provides additional mapping information when the record format uses delimiters, such as CSV. For example, the following sample records use CSV format, where the records use the <i>'n'</i> as the row delimiter and a comma (",") as the column delimiter:
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
        RecordRowDelimiter: RecordRowDelimiter
    ): CSVMappingParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordColumnDelimiter" -> RecordColumnDelimiter.asInstanceOf[js.Any],
        "RecordRowDelimiter"    -> RecordRowDelimiter.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CSVMappingParameters]
    }
  }

  /**
    * Describes an application's checkpointing configuration. Checkpointing is the process of persisting application state for fault tolerance. For more information, see [[https://ci.apache.org/projects/flink/flink-docs-release-1.6/concepts/programming-model.html#checkpoints-for-fault-tolerance| Checkpoints for Fault Tolerance]] in the [[https://ci.apache.org/projects/flink/flink-docs-release-1.6/|Apache Flink Documentation]].
    */
  @js.native
  trait CheckpointConfiguration extends js.Object {
    var ConfigurationType: ConfigurationType
    var CheckpointInterval: js.UndefOr[CheckpointInterval]
    var CheckpointingEnabled: js.UndefOr[BooleanObject]
    var MinPauseBetweenCheckpoints: js.UndefOr[MinPauseBetweenCheckpoints]
  }

  object CheckpointConfiguration {
    def apply(
        ConfigurationType: ConfigurationType,
        CheckpointInterval: js.UndefOr[CheckpointInterval] = js.undefined,
        CheckpointingEnabled: js.UndefOr[BooleanObject] = js.undefined,
        MinPauseBetweenCheckpoints: js.UndefOr[MinPauseBetweenCheckpoints] = js.undefined
    ): CheckpointConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationType" -> ConfigurationType.asInstanceOf[js.Any],
        "CheckpointInterval" -> CheckpointInterval.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CheckpointingEnabled" -> CheckpointingEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinPauseBetweenCheckpoints" -> MinPauseBetweenCheckpoints.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CheckpointConfiguration]
    }
  }

  /**
    * Describes checkpointing parameters for a Java-based Amazon Kinesis Data Analytics application.
    */
  @js.native
  trait CheckpointConfigurationDescription extends js.Object {
    var CheckpointInterval: js.UndefOr[CheckpointInterval]
    var CheckpointingEnabled: js.UndefOr[BooleanObject]
    var ConfigurationType: js.UndefOr[ConfigurationType]
    var MinPauseBetweenCheckpoints: js.UndefOr[MinPauseBetweenCheckpoints]
  }

  object CheckpointConfigurationDescription {
    def apply(
        CheckpointInterval: js.UndefOr[CheckpointInterval] = js.undefined,
        CheckpointingEnabled: js.UndefOr[BooleanObject] = js.undefined,
        ConfigurationType: js.UndefOr[ConfigurationType] = js.undefined,
        MinPauseBetweenCheckpoints: js.UndefOr[MinPauseBetweenCheckpoints] = js.undefined
    ): CheckpointConfigurationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CheckpointInterval" -> CheckpointInterval.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CheckpointingEnabled" -> CheckpointingEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConfigurationType" -> ConfigurationType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinPauseBetweenCheckpoints" -> MinPauseBetweenCheckpoints.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CheckpointConfigurationDescription]
    }
  }

  /**
    * Describes updates to the checkpointing parameters for a Java-based Amazon Kinesis Data Analytics application.
    */
  @js.native
  trait CheckpointConfigurationUpdate extends js.Object {
    var CheckpointIntervalUpdate: js.UndefOr[CheckpointInterval]
    var CheckpointingEnabledUpdate: js.UndefOr[BooleanObject]
    var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType]
    var MinPauseBetweenCheckpointsUpdate: js.UndefOr[MinPauseBetweenCheckpoints]
  }

  object CheckpointConfigurationUpdate {
    def apply(
        CheckpointIntervalUpdate: js.UndefOr[CheckpointInterval] = js.undefined,
        CheckpointingEnabledUpdate: js.UndefOr[BooleanObject] = js.undefined,
        ConfigurationTypeUpdate: js.UndefOr[ConfigurationType] = js.undefined,
        MinPauseBetweenCheckpointsUpdate: js.UndefOr[MinPauseBetweenCheckpoints] = js.undefined
    ): CheckpointConfigurationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CheckpointIntervalUpdate" -> CheckpointIntervalUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CheckpointingEnabledUpdate" -> CheckpointingEnabledUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConfigurationTypeUpdate" -> ConfigurationTypeUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinPauseBetweenCheckpointsUpdate" -> MinPauseBetweenCheckpointsUpdate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CheckpointConfigurationUpdate]
    }
  }

  /**
    * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon Resource Name (ARN).
    */
  @js.native
  trait CloudWatchLoggingOption extends js.Object {
    var LogStreamARN: LogStreamARN
  }

  object CloudWatchLoggingOption {
    def apply(
        LogStreamARN: LogStreamARN
    ): CloudWatchLoggingOption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogStreamARN" -> LogStreamARN.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchLoggingOption]
    }
  }

  /**
    * Describes the Amazon CloudWatch logging option.
    */
  @js.native
  trait CloudWatchLoggingOptionDescription extends js.Object {
    var LogStreamARN: LogStreamARN
    var CloudWatchLoggingOptionId: js.UndefOr[Id]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object CloudWatchLoggingOptionDescription {
    def apply(
        LogStreamARN: LogStreamARN,
        CloudWatchLoggingOptionId: js.UndefOr[Id] = js.undefined,
        RoleARN: js.UndefOr[RoleARN] = js.undefined
    ): CloudWatchLoggingOptionDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogStreamARN" -> LogStreamARN.asInstanceOf[js.Any],
        "CloudWatchLoggingOptionId" -> CloudWatchLoggingOptionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleARN" -> RoleARN.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchLoggingOptionDescription]
    }
  }

  /**
    * Describes the Amazon CloudWatch logging option updates.
    */
  @js.native
  trait CloudWatchLoggingOptionUpdate extends js.Object {
    var CloudWatchLoggingOptionId: Id
    var LogStreamARNUpdate: js.UndefOr[LogStreamARN]
  }

  object CloudWatchLoggingOptionUpdate {
    def apply(
        CloudWatchLoggingOptionId: Id,
        LogStreamARNUpdate: js.UndefOr[LogStreamARN] = js.undefined
    ): CloudWatchLoggingOptionUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLoggingOptionId" -> CloudWatchLoggingOptionId.asInstanceOf[js.Any],
        "LogStreamARNUpdate" -> LogStreamARNUpdate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchLoggingOptionUpdate]
    }
  }

  /**
    * Specifies either the application code, or the location of the application code, for a Java-based Amazon Kinesis Data Analytics application.
    */
  @js.native
  trait CodeContent extends js.Object {
    var S3ContentLocation: js.UndefOr[S3ContentLocation]
    var TextContent: js.UndefOr[TextContent]
    var ZipFileContent: js.UndefOr[ZipFileContent]
  }

  object CodeContent {
    def apply(
        S3ContentLocation: js.UndefOr[S3ContentLocation] = js.undefined,
        TextContent: js.UndefOr[TextContent] = js.undefined,
        ZipFileContent: js.UndefOr[ZipFileContent] = js.undefined
    ): CodeContent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3ContentLocation" -> S3ContentLocation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TextContent" -> TextContent.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ZipFileContent" -> ZipFileContent.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CodeContent]
    }
  }

  /**
    * Describes details about the application code for a Java-based Kinesis Data Analytics application.
    */
  @js.native
  trait CodeContentDescription extends js.Object {
    var CodeMD5: js.UndefOr[CodeMD5]
    var CodeSize: js.UndefOr[CodeSize]
    var S3ApplicationCodeLocationDescription: js.UndefOr[S3ApplicationCodeLocationDescription]
    var TextContent: js.UndefOr[TextContent]
  }

  object CodeContentDescription {
    def apply(
        CodeMD5: js.UndefOr[CodeMD5] = js.undefined,
        CodeSize: js.UndefOr[CodeSize] = js.undefined,
        S3ApplicationCodeLocationDescription: js.UndefOr[S3ApplicationCodeLocationDescription] = js.undefined,
        TextContent: js.UndefOr[TextContent] = js.undefined
    ): CodeContentDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeMD5" -> CodeMD5.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CodeSize" -> CodeSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3ApplicationCodeLocationDescription" -> S3ApplicationCodeLocationDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TextContent" -> TextContent.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CodeContentDescription]
    }
  }

  object CodeContentTypeEnum {
    val PLAINTEXT = "PLAINTEXT"
    val ZIPFILE   = "ZIPFILE"

    val values = IndexedSeq(PLAINTEXT, ZIPFILE)
  }

  /**
    * Describes an update to the code of a Java-based Kinesis Data Analytics application.
    */
  @js.native
  trait CodeContentUpdate extends js.Object {
    var S3ContentLocationUpdate: js.UndefOr[S3ContentLocationUpdate]
    var TextContentUpdate: js.UndefOr[TextContent]
    var ZipFileContentUpdate: js.UndefOr[ZipFileContent]
  }

  object CodeContentUpdate {
    def apply(
        S3ContentLocationUpdate: js.UndefOr[S3ContentLocationUpdate] = js.undefined,
        TextContentUpdate: js.UndefOr[TextContent] = js.undefined,
        ZipFileContentUpdate: js.UndefOr[ZipFileContent] = js.undefined
    ): CodeContentUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3ContentLocationUpdate" -> S3ContentLocationUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TextContentUpdate" -> TextContentUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ZipFileContentUpdate" -> ZipFileContentUpdate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CodeContentUpdate]
    }
  }

  object ConfigurationTypeEnum {
    val DEFAULT = "DEFAULT"
    val CUSTOM  = "CUSTOM"

    val values = IndexedSeq(DEFAULT, CUSTOM)
  }

  @js.native
  trait CreateApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var RuntimeEnvironment: RuntimeEnvironment
    var ServiceExecutionRole: RoleARN
    var ApplicationConfiguration: js.UndefOr[ApplicationConfiguration]
    var ApplicationDescription: js.UndefOr[ApplicationDescription]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
  }

  object CreateApplicationRequest {
    def apply(
        ApplicationName: ApplicationName,
        RuntimeEnvironment: RuntimeEnvironment,
        ServiceExecutionRole: RoleARN,
        ApplicationConfiguration: js.UndefOr[ApplicationConfiguration] = js.undefined,
        ApplicationDescription: js.UndefOr[ApplicationDescription] = js.undefined,
        CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined
    ): CreateApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName"      -> ApplicationName.asInstanceOf[js.Any],
        "RuntimeEnvironment"   -> RuntimeEnvironment.asInstanceOf[js.Any],
        "ServiceExecutionRole" -> ServiceExecutionRole.asInstanceOf[js.Any],
        "ApplicationConfiguration" -> ApplicationConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplicationDescription" -> ApplicationDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationRequest]
    }
  }

  @js.native
  trait CreateApplicationResponse extends js.Object {
    var ApplicationDetail: ApplicationDetail
  }

  object CreateApplicationResponse {
    def apply(
        ApplicationDetail: ApplicationDetail
    ): CreateApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationDetail" -> ApplicationDetail.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationResponse]
    }
  }

  @js.native
  trait CreateApplicationSnapshotRequest extends js.Object {
    var ApplicationName: ApplicationName
    var SnapshotName: SnapshotName
  }

  object CreateApplicationSnapshotRequest {
    def apply(
        ApplicationName: ApplicationName,
        SnapshotName: SnapshotName
    ): CreateApplicationSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "SnapshotName"    -> SnapshotName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationSnapshotRequest]
    }
  }

  @js.native
  trait CreateApplicationSnapshotResponse extends js.Object {}

  object CreateApplicationSnapshotResponse {
    def apply(
        ): CreateApplicationSnapshotResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationSnapshotResponse]
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
        CurrentApplicationVersionId: ApplicationVersionId
    ): DeleteApplicationCloudWatchLoggingOptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName"             -> ApplicationName.asInstanceOf[js.Any],
        "CloudWatchLoggingOptionId"   -> CloudWatchLoggingOptionId.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DeleteApplicationCloudWatchLoggingOptionRequest]
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
        CloudWatchLoggingOptionDescriptions: js.UndefOr[CloudWatchLoggingOptionDescriptions] = js.undefined
    ): DeleteApplicationCloudWatchLoggingOptionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationARN" -> ApplicationARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplicationVersionId" -> ApplicationVersionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CloudWatchLoggingOptionDescriptions" -> CloudWatchLoggingOptionDescriptions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DeleteApplicationCloudWatchLoggingOptionResponse]
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
        InputId: Id
    ): DeleteApplicationInputProcessingConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName"             -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "InputId"                     -> InputId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DeleteApplicationInputProcessingConfigurationRequest]
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
        ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined
    ): DeleteApplicationInputProcessingConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationARN" -> ApplicationARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplicationVersionId" -> ApplicationVersionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DeleteApplicationInputProcessingConfigurationResponse]
    }
  }

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
        OutputId: Id
    ): DeleteApplicationOutputRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName"             -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "OutputId"                    -> OutputId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

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
        ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined
    ): DeleteApplicationOutputResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationARN" -> ApplicationARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplicationVersionId" -> ApplicationVersionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        ReferenceId: Id
    ): DeleteApplicationReferenceDataSourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName"             -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "ReferenceId"                 -> ReferenceId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DeleteApplicationReferenceDataSourceRequest]
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
        ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined
    ): DeleteApplicationReferenceDataSourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationARN" -> ApplicationARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplicationVersionId" -> ApplicationVersionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DeleteApplicationReferenceDataSourceResponse]
    }
  }

  @js.native
  trait DeleteApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CreateTimestamp: Timestamp
  }

  object DeleteApplicationRequest {
    def apply(
        ApplicationName: ApplicationName,
        CreateTimestamp: Timestamp
    ): DeleteApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "CreateTimestamp" -> CreateTimestamp.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationRequest]
    }
  }

  @js.native
  trait DeleteApplicationResponse extends js.Object {}

  object DeleteApplicationResponse {
    def apply(
        ): DeleteApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationResponse]
    }
  }

  @js.native
  trait DeleteApplicationSnapshotRequest extends js.Object {
    var ApplicationName: ApplicationName
    var SnapshotCreationTimestamp: Timestamp
    var SnapshotName: SnapshotName
  }

  object DeleteApplicationSnapshotRequest {
    def apply(
        ApplicationName: ApplicationName,
        SnapshotCreationTimestamp: Timestamp,
        SnapshotName: SnapshotName
    ): DeleteApplicationSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName"           -> ApplicationName.asInstanceOf[js.Any],
        "SnapshotCreationTimestamp" -> SnapshotCreationTimestamp.asInstanceOf[js.Any],
        "SnapshotName"              -> SnapshotName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationSnapshotRequest]
    }
  }

  @js.native
  trait DeleteApplicationSnapshotResponse extends js.Object {}

  object DeleteApplicationSnapshotResponse {
    def apply(
        ): DeleteApplicationSnapshotResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationSnapshotResponse]
    }
  }

  @js.native
  trait DescribeApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var IncludeAdditionalDetails: js.UndefOr[BooleanObject]
  }

  object DescribeApplicationRequest {
    def apply(
        ApplicationName: ApplicationName,
        IncludeAdditionalDetails: js.UndefOr[BooleanObject] = js.undefined
    ): DescribeApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "IncludeAdditionalDetails" -> IncludeAdditionalDetails.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeApplicationRequest]
    }
  }

  @js.native
  trait DescribeApplicationResponse extends js.Object {
    var ApplicationDetail: ApplicationDetail
  }

  object DescribeApplicationResponse {
    def apply(
        ApplicationDetail: ApplicationDetail
    ): DescribeApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationDetail" -> ApplicationDetail.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeApplicationResponse]
    }
  }

  @js.native
  trait DescribeApplicationSnapshotRequest extends js.Object {
    var ApplicationName: ApplicationName
    var SnapshotName: SnapshotName
  }

  object DescribeApplicationSnapshotRequest {
    def apply(
        ApplicationName: ApplicationName,
        SnapshotName: SnapshotName
    ): DescribeApplicationSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "SnapshotName"    -> SnapshotName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeApplicationSnapshotRequest]
    }
  }

  @js.native
  trait DescribeApplicationSnapshotResponse extends js.Object {
    var SnapshotDetails: SnapshotDetails
  }

  object DescribeApplicationSnapshotResponse {
    def apply(
        SnapshotDetails: SnapshotDetails
    ): DescribeApplicationSnapshotResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotDetails" -> SnapshotDetails.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeApplicationSnapshotResponse]
    }
  }

  /**
    * Describes the data format when records are written to the destination in an SQL-based Amazon Kinesis Data Analytics application.
    */
  @js.native
  trait DestinationSchema extends js.Object {
    var RecordFormatType: RecordFormatType
  }

  object DestinationSchema {
    def apply(
        RecordFormatType: RecordFormatType
    ): DestinationSchema = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordFormatType" -> RecordFormatType.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DestinationSchema]
    }
  }

  @js.native
  trait DiscoverInputSchemaRequest extends js.Object {
    var ServiceExecutionRole: RoleARN
    var InputProcessingConfiguration: js.UndefOr[InputProcessingConfiguration]
    var InputStartingPositionConfiguration: js.UndefOr[InputStartingPositionConfiguration]
    var ResourceARN: js.UndefOr[ResourceARN]
    var S3Configuration: js.UndefOr[S3Configuration]
  }

  object DiscoverInputSchemaRequest {
    def apply(
        ServiceExecutionRole: RoleARN,
        InputProcessingConfiguration: js.UndefOr[InputProcessingConfiguration] = js.undefined,
        InputStartingPositionConfiguration: js.UndefOr[InputStartingPositionConfiguration] = js.undefined,
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
        S3Configuration: js.UndefOr[S3Configuration] = js.undefined
    ): DiscoverInputSchemaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceExecutionRole" -> ServiceExecutionRole.asInstanceOf[js.Any],
        "InputProcessingConfiguration" -> InputProcessingConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputStartingPositionConfiguration" -> InputStartingPositionConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceARN" -> ResourceARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3Configuration" -> S3Configuration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        RawInputRecords: js.UndefOr[RawInputRecords] = js.undefined
    ): DiscoverInputSchemaResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputSchema" -> InputSchema.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParsedInputRecords" -> ParsedInputRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProcessedInputRecords" -> ProcessedInputRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RawInputRecords" -> RawInputRecords.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiscoverInputSchemaResponse]
    }
  }

  /**
    * Describes execution properties for a Java-based Kinesis Data Analytics application.
    */
  @js.native
  trait EnvironmentProperties extends js.Object {
    var PropertyGroups: PropertyGroups
  }

  object EnvironmentProperties {
    def apply(
        PropertyGroups: PropertyGroups
    ): EnvironmentProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PropertyGroups" -> PropertyGroups.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentProperties]
    }
  }

  /**
    * Describes the execution properties for a Java-based Amazon Kinesis Data Analytics application.
    */
  @js.native
  trait EnvironmentPropertyDescriptions extends js.Object {
    var PropertyGroupDescriptions: js.UndefOr[PropertyGroups]
  }

  object EnvironmentPropertyDescriptions {
    def apply(
        PropertyGroupDescriptions: js.UndefOr[PropertyGroups] = js.undefined
    ): EnvironmentPropertyDescriptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PropertyGroupDescriptions" -> PropertyGroupDescriptions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentPropertyDescriptions]
    }
  }

  /**
    * Describes updates to the execution property groups for a Java-based Amazon Kinesis Data Analytics application.
    */
  @js.native
  trait EnvironmentPropertyUpdates extends js.Object {
    var PropertyGroups: PropertyGroups
  }

  object EnvironmentPropertyUpdates {
    def apply(
        PropertyGroups: PropertyGroups
    ): EnvironmentPropertyUpdates = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PropertyGroups" -> PropertyGroups.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentPropertyUpdates]
    }
  }

  /**
    * Describes configuration parameters for a Java-based Amazon Kinesis Data Analytics application.
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
        ParallelismConfiguration: js.UndefOr[ParallelismConfiguration] = js.undefined
    ): FlinkApplicationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CheckpointConfiguration" -> CheckpointConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MonitoringConfiguration" -> MonitoringConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParallelismConfiguration" -> ParallelismConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FlinkApplicationConfiguration]
    }
  }

  /**
    * Describes configuration parameters for a Java-based Amazon Kinesis Data Analytics application.
    */
  @js.native
  trait FlinkApplicationConfigurationDescription extends js.Object {
    var CheckpointConfigurationDescription: js.UndefOr[CheckpointConfigurationDescription]
    var JobPlanDescription: js.UndefOr[JobPlanDescription]
    var MonitoringConfigurationDescription: js.UndefOr[MonitoringConfigurationDescription]
    var ParallelismConfigurationDescription: js.UndefOr[ParallelismConfigurationDescription]
  }

  object FlinkApplicationConfigurationDescription {
    def apply(
        CheckpointConfigurationDescription: js.UndefOr[CheckpointConfigurationDescription] = js.undefined,
        JobPlanDescription: js.UndefOr[JobPlanDescription] = js.undefined,
        MonitoringConfigurationDescription: js.UndefOr[MonitoringConfigurationDescription] = js.undefined,
        ParallelismConfigurationDescription: js.UndefOr[ParallelismConfigurationDescription] = js.undefined
    ): FlinkApplicationConfigurationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CheckpointConfigurationDescription" -> CheckpointConfigurationDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobPlanDescription" -> JobPlanDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MonitoringConfigurationDescription" -> MonitoringConfigurationDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParallelismConfigurationDescription" -> ParallelismConfigurationDescription.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FlinkApplicationConfigurationDescription]
    }
  }

  /**
    * Describes updates to the configuration parameters for a Java-based Amazon Kinesis Data Analytics application.
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
        ParallelismConfigurationUpdate: js.UndefOr[ParallelismConfigurationUpdate] = js.undefined
    ): FlinkApplicationConfigurationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CheckpointConfigurationUpdate" -> CheckpointConfigurationUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MonitoringConfigurationUpdate" -> MonitoringConfigurationUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParallelismConfigurationUpdate" -> ParallelismConfigurationUpdate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FlinkApplicationConfigurationUpdate]
    }
  }

  /**
    * When you configure the application input for an SQL-based Amazon Kinesis Data Analytics application, you specify the streaming source, the in-application stream name that is created, and the mapping between the two.
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
        KinesisStreamsInput: js.UndefOr[KinesisStreamsInput] = js.undefined
    ): Input = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputSchema" -> InputSchema.asInstanceOf[js.Any],
        "NamePrefix"  -> NamePrefix.asInstanceOf[js.Any],
        "InputParallelism" -> InputParallelism.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputProcessingConfiguration" -> InputProcessingConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KinesisFirehoseInput" -> KinesisFirehoseInput.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KinesisStreamsInput" -> KinesisStreamsInput.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Input]
    }
  }

  /**
    * Describes the application input configuration for an SQL-based Amazon Kinesis Data Analytics application.
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
        NamePrefix: js.UndefOr[InAppStreamName] = js.undefined
    ): InputDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InAppStreamNames" -> InAppStreamNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputId" -> InputId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputParallelism" -> InputParallelism.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputProcessingConfigurationDescription" -> InputProcessingConfigurationDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputSchema" -> InputSchema.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputStartingPositionConfiguration" -> InputStartingPositionConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KinesisFirehoseInputDescription" -> KinesisFirehoseInputDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KinesisStreamsInputDescription" -> KinesisStreamsInputDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NamePrefix" -> NamePrefix.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputDescription]
    }
  }

  /**
    * An object that contains the Amazon Resource Name (ARN) of the AWS Lambda function that is used to preprocess records in the stream in an SQL-based Amazon Kinesis Data Analytics application.
    */
  @js.native
  trait InputLambdaProcessor extends js.Object {
    var ResourceARN: ResourceARN
  }

  object InputLambdaProcessor {
    def apply(
        ResourceARN: ResourceARN
    ): InputLambdaProcessor = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputLambdaProcessor]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, an object that contains the Amazon Resource Name (ARN) of the AWS Lambda function that is used to preprocess records in the stream.
    */
  @js.native
  trait InputLambdaProcessorDescription extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: js.UndefOr[RoleARN]
  }

  object InputLambdaProcessorDescription {
    def apply(
        ResourceARN: ResourceARN,
        RoleARN: js.UndefOr[RoleARN] = js.undefined
    ): InputLambdaProcessorDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputLambdaProcessorDescription]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, represents an update to the <a>InputLambdaProcessor</a> that is used to preprocess the records in the stream.
    */
  @js.native
  trait InputLambdaProcessorUpdate extends js.Object {
    var ResourceARNUpdate: ResourceARN
  }

  object InputLambdaProcessorUpdate {
    def apply(
        ResourceARNUpdate: ResourceARN
    ): InputLambdaProcessorUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARNUpdate" -> ResourceARNUpdate.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputLambdaProcessorUpdate]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, describes the number of in-application streams to create for a given streaming source.
    */
  @js.native
  trait InputParallelism extends js.Object {
    var Count: js.UndefOr[InputParallelismCount]
  }

  object InputParallelism {
    def apply(
        Count: js.UndefOr[InputParallelismCount] = js.undefined
    ): InputParallelism = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Count" -> Count.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputParallelism]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, provides updates to the parallelism count.
    */
  @js.native
  trait InputParallelismUpdate extends js.Object {
    var CountUpdate: InputParallelismCount
  }

  object InputParallelismUpdate {
    def apply(
        CountUpdate: InputParallelismCount
    ): InputParallelismUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CountUpdate" -> CountUpdate.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputParallelismUpdate]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, describes a processor that is used to preprocess the records in the stream before being processed by your application code. Currently, the only input processor available is [[https://aws.amazon.com/documentation/lambda/|AWS Lambda]].
    */
  @js.native
  trait InputProcessingConfiguration extends js.Object {
    var InputLambdaProcessor: InputLambdaProcessor
  }

  object InputProcessingConfiguration {
    def apply(
        InputLambdaProcessor: InputLambdaProcessor
    ): InputProcessingConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputLambdaProcessor" -> InputLambdaProcessor.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputProcessingConfiguration]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, provides the configuration information about an input processor. Currently, the only input processor available is [[https://aws.amazon.com/documentation/lambda/|AWS Lambda]].
    */
  @js.native
  trait InputProcessingConfigurationDescription extends js.Object {
    var InputLambdaProcessorDescription: js.UndefOr[InputLambdaProcessorDescription]
  }

  object InputProcessingConfigurationDescription {
    def apply(
        InputLambdaProcessorDescription: js.UndefOr[InputLambdaProcessorDescription] = js.undefined
    ): InputProcessingConfigurationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputLambdaProcessorDescription" -> InputLambdaProcessorDescription.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputProcessingConfigurationDescription]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, describes updates to an <a>InputProcessingConfiguration</a>.
    */
  @js.native
  trait InputProcessingConfigurationUpdate extends js.Object {
    var InputLambdaProcessorUpdate: InputLambdaProcessorUpdate
  }

  object InputProcessingConfigurationUpdate {
    def apply(
        InputLambdaProcessorUpdate: InputLambdaProcessorUpdate
    ): InputProcessingConfigurationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputLambdaProcessorUpdate" -> InputLambdaProcessorUpdate.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputProcessingConfigurationUpdate]
    }
  }

  /**
    * Describes updates for an SQL-based Amazon Kinesis Data Analytics application's input schema.
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
        RecordFormatUpdate: js.UndefOr[RecordFormat] = js.undefined
    ): InputSchemaUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordColumnUpdates" -> RecordColumnUpdates.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RecordEncodingUpdate" -> RecordEncodingUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RecordFormatUpdate" -> RecordFormatUpdate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputSchemaUpdate]
    }
  }

  object InputStartingPositionEnum {
    val NOW                = "NOW"
    val TRIM_HORIZON       = "TRIM_HORIZON"
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
        InputStartingPosition: js.UndefOr[InputStartingPosition] = js.undefined
    ): InputStartingPositionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputStartingPosition" -> InputStartingPosition.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputStartingPositionConfiguration]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, describes updates to a specific input configuration (identified by the <code>InputId</code> of an application).
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
        NamePrefixUpdate: js.UndefOr[InAppStreamName] = js.undefined
    ): InputUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputId" -> InputId.asInstanceOf[js.Any],
        "InputParallelismUpdate" -> InputParallelismUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputProcessingConfigurationUpdate" -> InputProcessingConfigurationUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputSchemaUpdate" -> InputSchemaUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KinesisFirehoseInputUpdate" -> KinesisFirehoseInputUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KinesisStreamsInputUpdate" -> KinesisStreamsInputUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NamePrefixUpdate" -> NamePrefixUpdate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputUpdate]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, provides additional mapping information when JSON is the record format on the streaming source.
    */
  @js.native
  trait JSONMappingParameters extends js.Object {
    var RecordRowPath: RecordRowPath
  }

  object JSONMappingParameters {
    def apply(
        RecordRowPath: RecordRowPath
    ): JSONMappingParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordRowPath" -> RecordRowPath.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JSONMappingParameters]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, identifies a Kinesis Data Firehose delivery stream as the streaming source. You provide the delivery stream's Amazon Resource Name (ARN).
    */
  @js.native
  trait KinesisFirehoseInput extends js.Object {
    var ResourceARN: ResourceARN
  }

  object KinesisFirehoseInput {
    def apply(
        ResourceARN: ResourceARN
    ): KinesisFirehoseInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisFirehoseInput]
    }
  }

  /**
    * Describes the Amazon Kinesis Data Firehose delivery stream that is configured as the streaming source in the application input configuration.
    */
  @js.native
  trait KinesisFirehoseInputDescription extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: js.UndefOr[RoleARN]
  }

  object KinesisFirehoseInputDescription {
    def apply(
        ResourceARN: ResourceARN,
        RoleARN: js.UndefOr[RoleARN] = js.undefined
    ): KinesisFirehoseInputDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisFirehoseInputDescription]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, when updating application input configuration, provides information about a Kinesis Data Firehose delivery stream as the streaming source.
    */
  @js.native
  trait KinesisFirehoseInputUpdate extends js.Object {
    var ResourceARNUpdate: ResourceARN
  }

  object KinesisFirehoseInputUpdate {
    def apply(
        ResourceARNUpdate: ResourceARN
    ): KinesisFirehoseInputUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARNUpdate" -> ResourceARNUpdate.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisFirehoseInputUpdate]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, when configuring application output, identifies a Kinesis Data Firehose delivery stream as the destination. You provide the stream Amazon Resource Name (ARN) of the delivery stream.
    */
  @js.native
  trait KinesisFirehoseOutput extends js.Object {
    var ResourceARN: ResourceARN
  }

  object KinesisFirehoseOutput {
    def apply(
        ResourceARN: ResourceARN
    ): KinesisFirehoseOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisFirehoseOutput]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application's output, describes the Kinesis Data Firehose delivery stream that is configured as its destination.
    */
  @js.native
  trait KinesisFirehoseOutputDescription extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: js.UndefOr[RoleARN]
  }

  object KinesisFirehoseOutputDescription {
    def apply(
        ResourceARN: ResourceARN,
        RoleARN: js.UndefOr[RoleARN] = js.undefined
    ): KinesisFirehoseOutputDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisFirehoseOutputDescription]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, when updating an output configuration using the <a>UpdateApplication</a> operation, provides information about a Kinesis Data Firehose delivery stream that is configured as the destination.
    */
  @js.native
  trait KinesisFirehoseOutputUpdate extends js.Object {
    var ResourceARNUpdate: ResourceARN
  }

  object KinesisFirehoseOutputUpdate {
    def apply(
        ResourceARNUpdate: ResourceARN
    ): KinesisFirehoseOutputUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARNUpdate" -> ResourceARNUpdate.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisFirehoseOutputUpdate]
    }
  }

  /**
    * Identifies an Amazon Kinesis data stream as the streaming source. You provide the stream's Amazon Resource Name (ARN).
    */
  @js.native
  trait KinesisStreamsInput extends js.Object {
    var ResourceARN: ResourceARN
  }

  object KinesisStreamsInput {
    def apply(
        ResourceARN: ResourceARN
    ): KinesisStreamsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisStreamsInput]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, describes the Kinesis data stream that is configured as the streaming source in the application input configuration.
    */
  @js.native
  trait KinesisStreamsInputDescription extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: js.UndefOr[RoleARN]
  }

  object KinesisStreamsInputDescription {
    def apply(
        ResourceARN: ResourceARN,
        RoleARN: js.UndefOr[RoleARN] = js.undefined
    ): KinesisStreamsInputDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisStreamsInputDescription]
    }
  }

  /**
    * When you update the input configuration for an SQL-based Amazon Kinesis Data Analytics application, provides information about an Amazon Kinesis stream as the streaming source.
    */
  @js.native
  trait KinesisStreamsInputUpdate extends js.Object {
    var ResourceARNUpdate: ResourceARN
  }

  object KinesisStreamsInputUpdate {
    def apply(
        ResourceARNUpdate: ResourceARN
    ): KinesisStreamsInputUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARNUpdate" -> ResourceARNUpdate.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisStreamsInputUpdate]
    }
  }

  /**
    * When you configure an SQL-based Amazon Kinesis Data Analytics application's output, identifies a Kinesis data stream as the destination. You provide the stream Amazon Resource Name (ARN).
    */
  @js.native
  trait KinesisStreamsOutput extends js.Object {
    var ResourceARN: ResourceARN
  }

  object KinesisStreamsOutput {
    def apply(
        ResourceARN: ResourceARN
    ): KinesisStreamsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisStreamsOutput]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application's output, describes the Kinesis data stream that is configured as its destination.
    */
  @js.native
  trait KinesisStreamsOutputDescription extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: js.UndefOr[RoleARN]
  }

  object KinesisStreamsOutputDescription {
    def apply(
        ResourceARN: ResourceARN,
        RoleARN: js.UndefOr[RoleARN] = js.undefined
    ): KinesisStreamsOutputDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisStreamsOutputDescription]
    }
  }

  /**
    * When you update an SQL-based Amazon Kinesis Data Analytics application's output configuration using the <a>UpdateApplication</a> operation, provides information about a Kinesis data stream that is configured as the destination.
    */
  @js.native
  trait KinesisStreamsOutputUpdate extends js.Object {
    var ResourceARNUpdate: ResourceARN
  }

  object KinesisStreamsOutputUpdate {
    def apply(
        ResourceARNUpdate: ResourceARN
    ): KinesisStreamsOutputUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARNUpdate" -> ResourceARNUpdate.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisStreamsOutputUpdate]
    }
  }

  /**
    * When you configure an SQL-based Amazon Kinesis Data Analytics application's output, identifies an AWS Lambda function as the destination. You provide the function Amazon Resource Name (ARN) of the Lambda function.
    */
  @js.native
  trait LambdaOutput extends js.Object {
    var ResourceARN: ResourceARN
  }

  object LambdaOutput {
    def apply(
        ResourceARN: ResourceARN
    ): LambdaOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaOutput]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application output, describes the AWS Lambda function that is configured as its destination.
    */
  @js.native
  trait LambdaOutputDescription extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: js.UndefOr[RoleARN]
  }

  object LambdaOutputDescription {
    def apply(
        ResourceARN: ResourceARN,
        RoleARN: js.UndefOr[RoleARN] = js.undefined
    ): LambdaOutputDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaOutputDescription]
    }
  }

  /**
    * When you update an SQL-based Amazon Kinesis Data Analytics application's output configuration using the <a>UpdateApplication</a> operation, provides information about an AWS Lambda function that is configured as the destination.
    */
  @js.native
  trait LambdaOutputUpdate extends js.Object {
    var ResourceARNUpdate: ResourceARN
  }

  object LambdaOutputUpdate {
    def apply(
        ResourceARNUpdate: ResourceARN
    ): LambdaOutputUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARNUpdate" -> ResourceARNUpdate.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaOutputUpdate]
    }
  }

  @js.native
  trait ListApplicationSnapshotsRequest extends js.Object {
    var ApplicationName: ApplicationName
    var Limit: js.UndefOr[ListSnapshotsInputLimit]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListApplicationSnapshotsRequest {
    def apply(
        ApplicationName: ApplicationName,
        Limit: js.UndefOr[ListSnapshotsInputLimit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApplicationSnapshotsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApplicationSnapshotsRequest]
    }
  }

  @js.native
  trait ListApplicationSnapshotsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SnapshotSummaries: js.UndefOr[SnapshotSummaries]
  }

  object ListApplicationSnapshotsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SnapshotSummaries: js.UndefOr[SnapshotSummaries] = js.undefined
    ): ListApplicationSnapshotsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotSummaries" -> SnapshotSummaries.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[ApplicationName] = js.undefined
    ): ListApplicationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApplicationsRequest]
    }
  }

  @js.native
  trait ListApplicationsResponse extends js.Object {
    var ApplicationSummaries: ApplicationSummaries
    var NextToken: js.UndefOr[ApplicationName]
  }

  object ListApplicationsResponse {
    def apply(
        ApplicationSummaries: ApplicationSummaries,
        NextToken: js.UndefOr[ApplicationName] = js.undefined
    ): ListApplicationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationSummaries" -> ApplicationSummaries.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApplicationsResponse]
    }
  }

  object LogLevelEnum {
    val INFO  = "INFO"
    val WARN  = "WARN"
    val ERROR = "ERROR"
    val DEBUG = "DEBUG"

    val values = IndexedSeq(INFO, WARN, ERROR, DEBUG)
  }

  /**
    * When you configure an SQL-based Amazon Kinesis Data Analytics application's input at the time of creating or updating an application, provides additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
    */
  @js.native
  trait MappingParameters extends js.Object {
    var CSVMappingParameters: js.UndefOr[CSVMappingParameters]
    var JSONMappingParameters: js.UndefOr[JSONMappingParameters]
  }

  object MappingParameters {
    def apply(
        CSVMappingParameters: js.UndefOr[CSVMappingParameters] = js.undefined,
        JSONMappingParameters: js.UndefOr[JSONMappingParameters] = js.undefined
    ): MappingParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CSVMappingParameters" -> CSVMappingParameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JSONMappingParameters" -> JSONMappingParameters.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MappingParameters]
    }
  }

  object MetricsLevelEnum {
    val APPLICATION = "APPLICATION"
    val TASK        = "TASK"
    val OPERATOR    = "OPERATOR"
    val PARALLELISM = "PARALLELISM"

    val values = IndexedSeq(APPLICATION, TASK, OPERATOR, PARALLELISM)
  }

  /**
    * Describes configuration parameters for Amazon CloudWatch logging for a Java-based Kinesis Data Analytics application. For more information about CloudWatch logging, see [[https://docs.aws.amazon.com/kinesisanalytics/latest/Java/monitoring-overview.html|Monitoring]].
    */
  @js.native
  trait MonitoringConfiguration extends js.Object {
    var ConfigurationType: ConfigurationType
    var LogLevel: js.UndefOr[LogLevel]
    var MetricsLevel: js.UndefOr[MetricsLevel]
  }

  object MonitoringConfiguration {
    def apply(
        ConfigurationType: ConfigurationType,
        LogLevel: js.UndefOr[LogLevel] = js.undefined,
        MetricsLevel: js.UndefOr[MetricsLevel] = js.undefined
    ): MonitoringConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationType" -> ConfigurationType.asInstanceOf[js.Any],
        "LogLevel" -> LogLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MetricsLevel" -> MetricsLevel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MonitoringConfiguration]
    }
  }

  /**
    * Describes configuration parameters for CloudWatch logging for a Java-based Kinesis Data Analytics application.
    */
  @js.native
  trait MonitoringConfigurationDescription extends js.Object {
    var ConfigurationType: js.UndefOr[ConfigurationType]
    var LogLevel: js.UndefOr[LogLevel]
    var MetricsLevel: js.UndefOr[MetricsLevel]
  }

  object MonitoringConfigurationDescription {
    def apply(
        ConfigurationType: js.UndefOr[ConfigurationType] = js.undefined,
        LogLevel: js.UndefOr[LogLevel] = js.undefined,
        MetricsLevel: js.UndefOr[MetricsLevel] = js.undefined
    ): MonitoringConfigurationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationType" -> ConfigurationType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogLevel" -> LogLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MetricsLevel" -> MetricsLevel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MonitoringConfigurationDescription]
    }
  }

  /**
    * Describes updates to configuration parameters for Amazon CloudWatch logging for a Java-based Kinesis Data Analytics application.
    */
  @js.native
  trait MonitoringConfigurationUpdate extends js.Object {
    var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType]
    var LogLevelUpdate: js.UndefOr[LogLevel]
    var MetricsLevelUpdate: js.UndefOr[MetricsLevel]
  }

  object MonitoringConfigurationUpdate {
    def apply(
        ConfigurationTypeUpdate: js.UndefOr[ConfigurationType] = js.undefined,
        LogLevelUpdate: js.UndefOr[LogLevel] = js.undefined,
        MetricsLevelUpdate: js.UndefOr[MetricsLevel] = js.undefined
    ): MonitoringConfigurationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationTypeUpdate" -> ConfigurationTypeUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogLevelUpdate" -> LogLevelUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MetricsLevelUpdate" -> MetricsLevelUpdate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MonitoringConfigurationUpdate]
    }
  }

  /**
    * Describes an SQL-based Amazon Kinesis Data Analytics application's output configuration, in which you identify an in-application stream and a destination where you want the in-application stream data to be written. The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
    *  <p/>
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
        LambdaOutput: js.UndefOr[LambdaOutput] = js.undefined
    ): Output = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationSchema" -> DestinationSchema.asInstanceOf[js.Any],
        "Name"              -> Name.asInstanceOf[js.Any],
        "KinesisFirehoseOutput" -> KinesisFirehoseOutput.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KinesisStreamsOutput" -> KinesisStreamsOutput.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LambdaOutput" -> LambdaOutput.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Output]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, describes the application output configuration, which includes the in-application stream name and the destination where the stream data is written. The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
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
        OutputId: js.UndefOr[Id] = js.undefined
    ): OutputDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationSchema" -> DestinationSchema.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KinesisFirehoseOutputDescription" -> KinesisFirehoseOutputDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KinesisStreamsOutputDescription" -> KinesisStreamsOutputDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LambdaOutputDescription" -> LambdaOutputDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutputId" -> OutputId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputDescription]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, describes updates to the output configuration identified by the <code>OutputId</code>.
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
        NameUpdate: js.UndefOr[InAppStreamName] = js.undefined
    ): OutputUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OutputId" -> OutputId.asInstanceOf[js.Any],
        "DestinationSchemaUpdate" -> DestinationSchemaUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KinesisFirehoseOutputUpdate" -> KinesisFirehoseOutputUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KinesisStreamsOutputUpdate" -> KinesisStreamsOutputUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LambdaOutputUpdate" -> LambdaOutputUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NameUpdate" -> NameUpdate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputUpdate]
    }
  }

  /**
    * Describes parameters for how a Java-based Amazon Kinesis Data Analytics application executes multiple tasks simultaneously. For more information about parallelism, see [[https://ci.apache.org/projects/flink/flink-docs-stable/dev/parallel.html|Parallel Execution]] in the [[https://ci.apache.org/projects/flink/flink-docs-release-1.6/|Apache Flink Documentation]].
    */
  @js.native
  trait ParallelismConfiguration extends js.Object {
    var ConfigurationType: ConfigurationType
    var AutoScalingEnabled: js.UndefOr[BooleanObject]
    var Parallelism: js.UndefOr[Parallelism]
    var ParallelismPerKPU: js.UndefOr[ParallelismPerKPU]
  }

  object ParallelismConfiguration {
    def apply(
        ConfigurationType: ConfigurationType,
        AutoScalingEnabled: js.UndefOr[BooleanObject] = js.undefined,
        Parallelism: js.UndefOr[Parallelism] = js.undefined,
        ParallelismPerKPU: js.UndefOr[ParallelismPerKPU] = js.undefined
    ): ParallelismConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationType" -> ConfigurationType.asInstanceOf[js.Any],
        "AutoScalingEnabled" -> AutoScalingEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Parallelism" -> Parallelism.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParallelismPerKPU" -> ParallelismPerKPU.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParallelismConfiguration]
    }
  }

  /**
    * Describes parameters for how a Java-based Kinesis Data Analytics application executes multiple tasks simultaneously.
    */
  @js.native
  trait ParallelismConfigurationDescription extends js.Object {
    var AutoScalingEnabled: js.UndefOr[BooleanObject]
    var ConfigurationType: js.UndefOr[ConfigurationType]
    var CurrentParallelism: js.UndefOr[Parallelism]
    var Parallelism: js.UndefOr[Parallelism]
    var ParallelismPerKPU: js.UndefOr[ParallelismPerKPU]
  }

  object ParallelismConfigurationDescription {
    def apply(
        AutoScalingEnabled: js.UndefOr[BooleanObject] = js.undefined,
        ConfigurationType: js.UndefOr[ConfigurationType] = js.undefined,
        CurrentParallelism: js.UndefOr[Parallelism] = js.undefined,
        Parallelism: js.UndefOr[Parallelism] = js.undefined,
        ParallelismPerKPU: js.UndefOr[ParallelismPerKPU] = js.undefined
    ): ParallelismConfigurationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingEnabled" -> AutoScalingEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConfigurationType" -> ConfigurationType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CurrentParallelism" -> CurrentParallelism.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Parallelism" -> Parallelism.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParallelismPerKPU" -> ParallelismPerKPU.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParallelismConfigurationDescription]
    }
  }

  /**
    * Describes updates to parameters for how a Java-based Kinesis Data Analytics application executes multiple tasks simultaneously.
    */
  @js.native
  trait ParallelismConfigurationUpdate extends js.Object {
    var AutoScalingEnabledUpdate: js.UndefOr[BooleanObject]
    var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType]
    var ParallelismPerKPUUpdate: js.UndefOr[ParallelismPerKPU]
    var ParallelismUpdate: js.UndefOr[Parallelism]
  }

  object ParallelismConfigurationUpdate {
    def apply(
        AutoScalingEnabledUpdate: js.UndefOr[BooleanObject] = js.undefined,
        ConfigurationTypeUpdate: js.UndefOr[ConfigurationType] = js.undefined,
        ParallelismPerKPUUpdate: js.UndefOr[ParallelismPerKPU] = js.undefined,
        ParallelismUpdate: js.UndefOr[Parallelism] = js.undefined
    ): ParallelismConfigurationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingEnabledUpdate" -> AutoScalingEnabledUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConfigurationTypeUpdate" -> ConfigurationTypeUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParallelismPerKPUUpdate" -> ParallelismPerKPUUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParallelismUpdate" -> ParallelismUpdate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParallelismConfigurationUpdate]
    }
  }

  /**
    * Property key-value pairs passed into a Java-based Kinesis Data Analytics application.
    */
  @js.native
  trait PropertyGroup extends js.Object {
    var PropertyGroupId: Id
    var PropertyMap: PropertyMap
  }

  object PropertyGroup {
    def apply(
        PropertyGroupId: Id,
        PropertyMap: PropertyMap
    ): PropertyGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PropertyGroupId" -> PropertyGroupId.asInstanceOf[js.Any],
        "PropertyMap"     -> PropertyMap.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PropertyGroup]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, describes the mapping of each data element in the streaming source to the corresponding column in the in-application stream.
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
        Mapping: js.UndefOr[RecordColumnMapping] = js.undefined
    ): RecordColumn = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"    -> Name.asInstanceOf[js.Any],
        "SqlType" -> SqlType.asInstanceOf[js.Any],
        "Mapping" -> Mapping.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordColumn]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, describes the record format and relevant mapping information that should be applied to schematize the records on the stream.
    */
  @js.native
  trait RecordFormat extends js.Object {
    var RecordFormatType: RecordFormatType
    var MappingParameters: js.UndefOr[MappingParameters]
  }

  object RecordFormat {
    def apply(
        RecordFormatType: RecordFormatType,
        MappingParameters: js.UndefOr[MappingParameters] = js.undefined
    ): RecordFormat = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordFormatType" -> RecordFormatType.asInstanceOf[js.Any],
        "MappingParameters" -> MappingParameters.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordFormat]
    }
  }

  object RecordFormatTypeEnum {
    val JSON = "JSON"
    val CSV  = "CSV"

    val values = IndexedSeq(JSON, CSV)
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, describes the reference data source by providing the source information (Amazon S3 bucket name and object key name), the resulting in-application table name that is created, and the necessary schema to map the data elements in the Amazon S3 object to the in-application table.
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
        S3ReferenceDataSource: js.UndefOr[S3ReferenceDataSource] = js.undefined
    ): ReferenceDataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReferenceSchema" -> ReferenceSchema.asInstanceOf[js.Any],
        "TableName"       -> TableName.asInstanceOf[js.Any],
        "S3ReferenceDataSource" -> S3ReferenceDataSource.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReferenceDataSource]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, describes the reference data source configured for an application.
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
        ReferenceSchema: js.UndefOr[SourceSchema] = js.undefined
    ): ReferenceDataSourceDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReferenceId"                      -> ReferenceId.asInstanceOf[js.Any],
        "S3ReferenceDataSourceDescription" -> S3ReferenceDataSourceDescription.asInstanceOf[js.Any],
        "TableName"                        -> TableName.asInstanceOf[js.Any],
        "ReferenceSchema" -> ReferenceSchema.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReferenceDataSourceDescription]
    }
  }

  /**
    * When you update a reference data source configuration for a SQL-based Amazon Kinesis Data Analytics application, this object provides all the updated values (such as the source bucket name and object key name), the in-application table name that is created, and updated mapping information that maps the data in the Amazon S3 object to the in-application reference table that is created.
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
        TableNameUpdate: js.UndefOr[InAppTableName] = js.undefined
    ): ReferenceDataSourceUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReferenceId" -> ReferenceId.asInstanceOf[js.Any],
        "ReferenceSchemaUpdate" -> ReferenceSchemaUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3ReferenceDataSourceUpdate" -> S3ReferenceDataSourceUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableNameUpdate" -> TableNameUpdate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReferenceDataSourceUpdate]
    }
  }

  /**
    * Describes the starting parameters for an Amazon Kinesis Data Analytics application.
    */
  @js.native
  trait RunConfiguration extends js.Object {
    var ApplicationRestoreConfiguration: js.UndefOr[ApplicationRestoreConfiguration]
    var SqlRunConfigurations: js.UndefOr[SqlRunConfigurations]
  }

  object RunConfiguration {
    def apply(
        ApplicationRestoreConfiguration: js.UndefOr[ApplicationRestoreConfiguration] = js.undefined,
        SqlRunConfigurations: js.UndefOr[SqlRunConfigurations] = js.undefined
    ): RunConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationRestoreConfiguration" -> ApplicationRestoreConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SqlRunConfigurations" -> SqlRunConfigurations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunConfiguration]
    }
  }

  /**
    * Describes the starting properties for a Kinesis Data Analytics application.
    */
  @js.native
  trait RunConfigurationDescription extends js.Object {
    var ApplicationRestoreConfigurationDescription: js.UndefOr[ApplicationRestoreConfiguration]
  }

  object RunConfigurationDescription {
    def apply(
        ApplicationRestoreConfigurationDescription: js.UndefOr[ApplicationRestoreConfiguration] = js.undefined
    ): RunConfigurationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationRestoreConfigurationDescription" -> ApplicationRestoreConfigurationDescription.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunConfigurationDescription]
    }
  }

  /**
    * Describes the updates to the starting parameters for a Kinesis Data Analytics application.
    */
  @js.native
  trait RunConfigurationUpdate extends js.Object {
    var ApplicationRestoreConfiguration: js.UndefOr[ApplicationRestoreConfiguration]
  }

  object RunConfigurationUpdate {
    def apply(
        ApplicationRestoreConfiguration: js.UndefOr[ApplicationRestoreConfiguration] = js.undefined
    ): RunConfigurationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationRestoreConfiguration" -> ApplicationRestoreConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunConfigurationUpdate]
    }
  }

  object RuntimeEnvironmentEnum {
    val `SQL-1_0`   = "SQL-1_0"
    val `FLINK-1_6` = "FLINK-1_6"

    val values = IndexedSeq(`SQL-1_0`, `FLINK-1_6`)
  }

  /**
    * Describes the location of a Java-based Amazon Kinesis Data Analytics application's code stored in an S3 bucket.
    */
  @js.native
  trait S3ApplicationCodeLocationDescription extends js.Object {
    var BucketARN: BucketARN
    var FileKey: FileKey
    var ObjectVersion: js.UndefOr[ObjectVersion]
  }

  object S3ApplicationCodeLocationDescription {
    def apply(
        BucketARN: BucketARN,
        FileKey: FileKey,
        ObjectVersion: js.UndefOr[ObjectVersion] = js.undefined
    ): S3ApplicationCodeLocationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARN" -> BucketARN.asInstanceOf[js.Any],
        "FileKey"   -> FileKey.asInstanceOf[js.Any],
        "ObjectVersion" -> ObjectVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3ApplicationCodeLocationDescription]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, provides a description of an Amazon S3 data source, including the Amazon Resource Name (ARN) of the S3 bucket and the name of the Amazon S3 object that contains the data.
    */
  @js.native
  trait S3Configuration extends js.Object {
    var BucketARN: BucketARN
    var FileKey: FileKey
  }

  object S3Configuration {
    def apply(
        BucketARN: BucketARN,
        FileKey: FileKey
    ): S3Configuration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARN" -> BucketARN.asInstanceOf[js.Any],
        "FileKey"   -> FileKey.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Configuration]
    }
  }

  /**
    * For a Java-based Amazon Kinesis Data Analytics application, provides a description of an Amazon S3 object, including the Amazon Resource Name (ARN) of the S3 bucket, the name of the Amazon S3 object that contains the data, and the version number of the Amazon S3 object that contains the data.
    */
  @js.native
  trait S3ContentLocation extends js.Object {
    var BucketARN: BucketARN
    var FileKey: FileKey
    var ObjectVersion: js.UndefOr[ObjectVersion]
  }

  object S3ContentLocation {
    def apply(
        BucketARN: BucketARN,
        FileKey: FileKey,
        ObjectVersion: js.UndefOr[ObjectVersion] = js.undefined
    ): S3ContentLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARN" -> BucketARN.asInstanceOf[js.Any],
        "FileKey"   -> FileKey.asInstanceOf[js.Any],
        "ObjectVersion" -> ObjectVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3ContentLocation]
    }
  }

  /**
    * Describes an update for the Amazon S3 code content location for a Java-based Amazon Kinesis Data Analytics application.
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
        ObjectVersionUpdate: js.UndefOr[ObjectVersion] = js.undefined
    ): S3ContentLocationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARNUpdate" -> BucketARNUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FileKeyUpdate" -> FileKeyUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ObjectVersionUpdate" -> ObjectVersionUpdate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3ContentLocationUpdate]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, identifies the Amazon S3 bucket and object that contains the reference data.
    *  A Kinesis Data Analytics application loads reference data only once. If the data changes, you call the <a>UpdateApplication</a> operation to trigger reloading of data into your application.
    */
  @js.native
  trait S3ReferenceDataSource extends js.Object {
    var BucketARN: js.UndefOr[BucketARN]
    var FileKey: js.UndefOr[FileKey]
  }

  object S3ReferenceDataSource {
    def apply(
        BucketARN: js.UndefOr[BucketARN] = js.undefined,
        FileKey: js.UndefOr[FileKey] = js.undefined
    ): S3ReferenceDataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARN" -> BucketARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FileKey" -> FileKey.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3ReferenceDataSource]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, provides the bucket name and object key name that stores the reference data.
    */
  @js.native
  trait S3ReferenceDataSourceDescription extends js.Object {
    var BucketARN: BucketARN
    var FileKey: FileKey
    var ReferenceRoleARN: js.UndefOr[RoleARN]
  }

  object S3ReferenceDataSourceDescription {
    def apply(
        BucketARN: BucketARN,
        FileKey: FileKey,
        ReferenceRoleARN: js.UndefOr[RoleARN] = js.undefined
    ): S3ReferenceDataSourceDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARN" -> BucketARN.asInstanceOf[js.Any],
        "FileKey"   -> FileKey.asInstanceOf[js.Any],
        "ReferenceRoleARN" -> ReferenceRoleARN.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3ReferenceDataSourceDescription]
    }
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, describes the Amazon S3 bucket name and object key name for an in-application reference table.
    */
  @js.native
  trait S3ReferenceDataSourceUpdate extends js.Object {
    var BucketARNUpdate: js.UndefOr[BucketARN]
    var FileKeyUpdate: js.UndefOr[FileKey]
  }

  object S3ReferenceDataSourceUpdate {
    def apply(
        BucketARNUpdate: js.UndefOr[BucketARN] = js.undefined,
        FileKeyUpdate: js.UndefOr[FileKey] = js.undefined
    ): S3ReferenceDataSourceUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARNUpdate" -> BucketARNUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FileKeyUpdate" -> FileKeyUpdate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3ReferenceDataSourceUpdate]
    }
  }

  /**
    * Provides details about a snapshot of application state.
    */
  @js.native
  trait SnapshotDetails extends js.Object {
    var ApplicationVersionId: ApplicationVersionId
    var SnapshotName: SnapshotName
    var SnapshotStatus: SnapshotStatus
    var SnapshotCreationTimestamp: js.UndefOr[Timestamp]
  }

  object SnapshotDetails {
    def apply(
        ApplicationVersionId: ApplicationVersionId,
        SnapshotName: SnapshotName,
        SnapshotStatus: SnapshotStatus,
        SnapshotCreationTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): SnapshotDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationVersionId" -> ApplicationVersionId.asInstanceOf[js.Any],
        "SnapshotName"         -> SnapshotName.asInstanceOf[js.Any],
        "SnapshotStatus"       -> SnapshotStatus.asInstanceOf[js.Any],
        "SnapshotCreationTimestamp" -> SnapshotCreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotDetails]
    }
  }

  object SnapshotStatusEnum {
    val CREATING = "CREATING"
    val READY    = "READY"
    val DELETING = "DELETING"
    val FAILED   = "FAILED"

    val values = IndexedSeq(CREATING, READY, DELETING, FAILED)
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.
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
        RecordEncoding: js.UndefOr[RecordEncoding] = js.undefined
    ): SourceSchema = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordColumns" -> RecordColumns.asInstanceOf[js.Any],
        "RecordFormat"  -> RecordFormat.asInstanceOf[js.Any],
        "RecordEncoding" -> RecordEncoding.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceSchema]
    }
  }

  /**
    * Describes the inputs, outputs, and reference data sources for an SQL-based Kinesis Data Analytics application.
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
        ReferenceDataSources: js.UndefOr[ReferenceDataSources] = js.undefined
    ): SqlApplicationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Inputs" -> Inputs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Outputs" -> Outputs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReferenceDataSources" -> ReferenceDataSources.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SqlApplicationConfiguration]
    }
  }

  /**
    * Describes the inputs, outputs, and reference data sources for an SQL-based Kinesis Data Analytics application.
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
        ReferenceDataSourceDescriptions: js.UndefOr[ReferenceDataSourceDescriptions] = js.undefined
    ): SqlApplicationConfigurationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputDescriptions" -> InputDescriptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutputDescriptions" -> OutputDescriptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReferenceDataSourceDescriptions" -> ReferenceDataSourceDescriptions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SqlApplicationConfigurationDescription]
    }
  }

  /**
    * Describes updates to the input streams, destination streams, and reference data sources for an SQL-based Kinesis Data Analytics application.
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
        ReferenceDataSourceUpdates: js.UndefOr[ReferenceDataSourceUpdates] = js.undefined
    ): SqlApplicationConfigurationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputUpdates" -> InputUpdates.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutputUpdates" -> OutputUpdates.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReferenceDataSourceUpdates" -> ReferenceDataSourceUpdates.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SqlApplicationConfigurationUpdate]
    }
  }

  /**
    * Describes the starting parameters for an SQL-based Kinesis Data Analytics application.
    */
  @js.native
  trait SqlRunConfiguration extends js.Object {
    var InputId: Id
    var InputStartingPositionConfiguration: InputStartingPositionConfiguration
  }

  object SqlRunConfiguration {
    def apply(
        InputId: Id,
        InputStartingPositionConfiguration: InputStartingPositionConfiguration
    ): SqlRunConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputId"                            -> InputId.asInstanceOf[js.Any],
        "InputStartingPositionConfiguration" -> InputStartingPositionConfiguration.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SqlRunConfiguration]
    }
  }

  @js.native
  trait StartApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var RunConfiguration: RunConfiguration
  }

  object StartApplicationRequest {
    def apply(
        ApplicationName: ApplicationName,
        RunConfiguration: RunConfiguration
    ): StartApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName"  -> ApplicationName.asInstanceOf[js.Any],
        "RunConfiguration" -> RunConfiguration.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartApplicationRequest]
    }
  }

  @js.native
  trait StartApplicationResponse extends js.Object {}

  object StartApplicationResponse {
    def apply(
        ): StartApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartApplicationResponse]
    }
  }

  @js.native
  trait StopApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
  }

  object StopApplicationRequest {
    def apply(
        ApplicationName: ApplicationName
    ): StopApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopApplicationRequest]
    }
  }

  @js.native
  trait StopApplicationResponse extends js.Object {}

  object StopApplicationResponse {
    def apply(
        ): StopApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopApplicationResponse]
    }
  }

  @js.native
  trait UpdateApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var ApplicationConfigurationUpdate: js.UndefOr[ApplicationConfigurationUpdate]
    var CloudWatchLoggingOptionUpdates: js.UndefOr[CloudWatchLoggingOptionUpdates]
    var RunConfigurationUpdate: js.UndefOr[RunConfigurationUpdate]
    var ServiceExecutionRoleUpdate: js.UndefOr[RoleARN]
  }

  object UpdateApplicationRequest {
    def apply(
        ApplicationName: ApplicationName,
        CurrentApplicationVersionId: ApplicationVersionId,
        ApplicationConfigurationUpdate: js.UndefOr[ApplicationConfigurationUpdate] = js.undefined,
        CloudWatchLoggingOptionUpdates: js.UndefOr[CloudWatchLoggingOptionUpdates] = js.undefined,
        RunConfigurationUpdate: js.UndefOr[RunConfigurationUpdate] = js.undefined,
        ServiceExecutionRoleUpdate: js.UndefOr[RoleARN] = js.undefined
    ): UpdateApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName"             -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "ApplicationConfigurationUpdate" -> ApplicationConfigurationUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CloudWatchLoggingOptionUpdates" -> CloudWatchLoggingOptionUpdates.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RunConfigurationUpdate" -> RunConfigurationUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServiceExecutionRoleUpdate" -> ServiceExecutionRoleUpdate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApplicationRequest]
    }
  }

  @js.native
  trait UpdateApplicationResponse extends js.Object {
    var ApplicationDetail: ApplicationDetail
  }

  object UpdateApplicationResponse {
    def apply(
        ApplicationDetail: ApplicationDetail
    ): UpdateApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationDetail" -> ApplicationDetail.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApplicationResponse]
    }
  }
}
