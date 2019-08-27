package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
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
  type KinesisAnalyticsARN                 = String
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
  type TagKey                              = String
  type TagKeys                             = js.Array[TagKey]
  type TagValue                            = String
  type Tags                                = js.Array[Tag]
  type TextContent                         = String
  type Timestamp                           = js.Date
  type ZipFileContent =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String

  implicit final class KinesisAnalyticsV2Ops(val service: KinesisAnalyticsV2) extends AnyVal {

    def addApplicationCloudWatchLoggingOptionFuture(
        params: AddApplicationCloudWatchLoggingOptionRequest
    ): Future[AddApplicationCloudWatchLoggingOptionResponse] =
      service.addApplicationCloudWatchLoggingOption(params).promise.toFuture
    def addApplicationInputFuture(params: AddApplicationInputRequest): Future[AddApplicationInputResponse] =
      service.addApplicationInput(params).promise.toFuture
    def addApplicationInputProcessingConfigurationFuture(
        params: AddApplicationInputProcessingConfigurationRequest
    ): Future[AddApplicationInputProcessingConfigurationResponse] =
      service.addApplicationInputProcessingConfiguration(params).promise.toFuture
    def addApplicationOutputFuture(params: AddApplicationOutputRequest): Future[AddApplicationOutputResponse] =
      service.addApplicationOutput(params).promise.toFuture
    def addApplicationReferenceDataSourceFuture(
        params: AddApplicationReferenceDataSourceRequest
    ): Future[AddApplicationReferenceDataSourceResponse] =
      service.addApplicationReferenceDataSource(params).promise.toFuture
    def createApplicationFuture(params: CreateApplicationRequest): Future[CreateApplicationResponse] =
      service.createApplication(params).promise.toFuture
    def createApplicationSnapshotFuture(
        params: CreateApplicationSnapshotRequest
    ): Future[CreateApplicationSnapshotResponse] = service.createApplicationSnapshot(params).promise.toFuture
    def deleteApplicationCloudWatchLoggingOptionFuture(
        params: DeleteApplicationCloudWatchLoggingOptionRequest
    ): Future[DeleteApplicationCloudWatchLoggingOptionResponse] =
      service.deleteApplicationCloudWatchLoggingOption(params).promise.toFuture
    def deleteApplicationFuture(params: DeleteApplicationRequest): Future[DeleteApplicationResponse] =
      service.deleteApplication(params).promise.toFuture
    def deleteApplicationInputProcessingConfigurationFuture(
        params: DeleteApplicationInputProcessingConfigurationRequest
    ): Future[DeleteApplicationInputProcessingConfigurationResponse] =
      service.deleteApplicationInputProcessingConfiguration(params).promise.toFuture
    def deleteApplicationOutputFuture(params: DeleteApplicationOutputRequest): Future[DeleteApplicationOutputResponse] =
      service.deleteApplicationOutput(params).promise.toFuture
    def deleteApplicationReferenceDataSourceFuture(
        params: DeleteApplicationReferenceDataSourceRequest
    ): Future[DeleteApplicationReferenceDataSourceResponse] =
      service.deleteApplicationReferenceDataSource(params).promise.toFuture
    def deleteApplicationSnapshotFuture(
        params: DeleteApplicationSnapshotRequest
    ): Future[DeleteApplicationSnapshotResponse] = service.deleteApplicationSnapshot(params).promise.toFuture
    def describeApplicationFuture(params: DescribeApplicationRequest): Future[DescribeApplicationResponse] =
      service.describeApplication(params).promise.toFuture
    def describeApplicationSnapshotFuture(
        params: DescribeApplicationSnapshotRequest
    ): Future[DescribeApplicationSnapshotResponse] = service.describeApplicationSnapshot(params).promise.toFuture
    def discoverInputSchemaFuture(params: DiscoverInputSchemaRequest): Future[DiscoverInputSchemaResponse] =
      service.discoverInputSchema(params).promise.toFuture
    def listApplicationSnapshotsFuture(
        params: ListApplicationSnapshotsRequest
    ): Future[ListApplicationSnapshotsResponse] = service.listApplicationSnapshots(params).promise.toFuture
    def listApplicationsFuture(params: ListApplicationsRequest): Future[ListApplicationsResponse] =
      service.listApplications(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def startApplicationFuture(params: StartApplicationRequest): Future[StartApplicationResponse] =
      service.startApplication(params).promise.toFuture
    def stopApplicationFuture(params: StopApplicationRequest): Future[StopApplicationResponse] =
      service.stopApplication(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    def updateApplicationFuture(params: UpdateApplicationRequest): Future[UpdateApplicationResponse] =
      service.updateApplication(params).promise.toFuture
  }
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
    def listApplications(params: ListApplicationsRequest): Request[ListApplicationsResponse]          = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def startApplication(params: StartApplicationRequest): Request[StartApplicationResponse]          = js.native
    def stopApplication(params: StopApplicationRequest): Request[StopApplicationResponse]             = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                         = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                   = js.native
    def updateApplication(params: UpdateApplicationRequest): Request[UpdateApplicationResponse]       = js.native
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationName"             -> ApplicationName.asInstanceOf[js.Any],
        "CloudWatchLoggingOption"     -> CloudWatchLoggingOption.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddApplicationCloudWatchLoggingOptionRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationARN.foreach(__v => __obj.update("ApplicationARN", __v.asInstanceOf[js.Any]))
      ApplicationVersionId.foreach(__v => __obj.update("ApplicationVersionId", __v.asInstanceOf[js.Any]))
      CloudWatchLoggingOptionDescriptions.foreach(
        __v => __obj.update("CloudWatchLoggingOptionDescriptions", __v.asInstanceOf[js.Any])
      )
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
    def apply(
        ApplicationName: ApplicationName,
        CurrentApplicationVersionId: ApplicationVersionId,
        InputId: Id,
        InputProcessingConfiguration: InputProcessingConfiguration
    ): AddApplicationInputProcessingConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApplicationName"              -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId"  -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "InputId"                      -> InputId.asInstanceOf[js.Any],
        "InputProcessingConfiguration" -> InputProcessingConfiguration.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddApplicationInputProcessingConfigurationRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationARN.foreach(__v => __obj.update("ApplicationARN", __v.asInstanceOf[js.Any]))
      ApplicationVersionId.foreach(__v => __obj.update("ApplicationVersionId", __v.asInstanceOf[js.Any]))
      InputId.foreach(__v => __obj.update("InputId", __v.asInstanceOf[js.Any]))
      InputProcessingConfigurationDescription.foreach(
        __v => __obj.update("InputProcessingConfigurationDescription", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[AddApplicationInputProcessingConfigurationResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationName"             -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "Input"                       -> Input.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddApplicationInputRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationARN.foreach(__v => __obj.update("ApplicationARN", __v.asInstanceOf[js.Any]))
      ApplicationVersionId.foreach(__v => __obj.update("ApplicationVersionId", __v.asInstanceOf[js.Any]))
      InputDescriptions.foreach(__v => __obj.update("InputDescriptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddApplicationInputResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationName"             -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "Output"                      -> Output.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddApplicationOutputRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationARN.foreach(__v => __obj.update("ApplicationARN", __v.asInstanceOf[js.Any]))
      ApplicationVersionId.foreach(__v => __obj.update("ApplicationVersionId", __v.asInstanceOf[js.Any]))
      OutputDescriptions.foreach(__v => __obj.update("OutputDescriptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddApplicationOutputResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationName"             -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "ReferenceDataSource"         -> ReferenceDataSource.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddApplicationReferenceDataSourceRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationARN.foreach(__v => __obj.update("ApplicationARN", __v.asInstanceOf[js.Any]))
      ApplicationVersionId.foreach(__v => __obj.update("ApplicationVersionId", __v.asInstanceOf[js.Any]))
      ReferenceDataSourceDescriptions.foreach(
        __v => __obj.update("ReferenceDataSourceDescriptions", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[AddApplicationReferenceDataSourceResponse]
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
      val __obj = js.Dictionary[js.Any](
        "CodeContentType" -> CodeContentType.asInstanceOf[js.Any]
      )

      CodeContent.foreach(__v => __obj.update("CodeContent", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationCodeConfiguration]
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
      val __obj = js.Dictionary[js.Any](
        "CodeContentType" -> CodeContentType.asInstanceOf[js.Any]
      )

      CodeContentDescription.foreach(__v => __obj.update("CodeContentDescription", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationCodeConfigurationDescription]
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
      val __obj = js.Dictionary.empty[js.Any]
      CodeContentTypeUpdate.foreach(__v => __obj.update("CodeContentTypeUpdate", __v.asInstanceOf[js.Any]))
      CodeContentUpdate.foreach(__v => __obj.update("CodeContentUpdate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationCodeConfigurationUpdate]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationCodeConfiguration" -> ApplicationCodeConfiguration.asInstanceOf[js.Any]
      )

      ApplicationSnapshotConfiguration.foreach(
        __v => __obj.update("ApplicationSnapshotConfiguration", __v.asInstanceOf[js.Any])
      )
      EnvironmentProperties.foreach(__v => __obj.update("EnvironmentProperties", __v.asInstanceOf[js.Any]))
      FlinkApplicationConfiguration.foreach(
        __v => __obj.update("FlinkApplicationConfiguration", __v.asInstanceOf[js.Any])
      )
      SqlApplicationConfiguration.foreach(__v => __obj.update("SqlApplicationConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationConfiguration]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationCodeConfigurationDescription.foreach(
        __v => __obj.update("ApplicationCodeConfigurationDescription", __v.asInstanceOf[js.Any])
      )
      ApplicationSnapshotConfigurationDescription.foreach(
        __v => __obj.update("ApplicationSnapshotConfigurationDescription", __v.asInstanceOf[js.Any])
      )
      EnvironmentPropertyDescriptions.foreach(
        __v => __obj.update("EnvironmentPropertyDescriptions", __v.asInstanceOf[js.Any])
      )
      FlinkApplicationConfigurationDescription.foreach(
        __v => __obj.update("FlinkApplicationConfigurationDescription", __v.asInstanceOf[js.Any])
      )
      RunConfigurationDescription.foreach(__v => __obj.update("RunConfigurationDescription", __v.asInstanceOf[js.Any]))
      SqlApplicationConfigurationDescription.foreach(
        __v => __obj.update("SqlApplicationConfigurationDescription", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ApplicationConfigurationDescription]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationCodeConfigurationUpdate.foreach(
        __v => __obj.update("ApplicationCodeConfigurationUpdate", __v.asInstanceOf[js.Any])
      )
      ApplicationSnapshotConfigurationUpdate.foreach(
        __v => __obj.update("ApplicationSnapshotConfigurationUpdate", __v.asInstanceOf[js.Any])
      )
      EnvironmentPropertyUpdates.foreach(__v => __obj.update("EnvironmentPropertyUpdates", __v.asInstanceOf[js.Any]))
      FlinkApplicationConfigurationUpdate.foreach(
        __v => __obj.update("FlinkApplicationConfigurationUpdate", __v.asInstanceOf[js.Any])
      )
      SqlApplicationConfigurationUpdate.foreach(
        __v => __obj.update("SqlApplicationConfigurationUpdate", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ApplicationConfigurationUpdate]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationARN"       -> ApplicationARN.asInstanceOf[js.Any],
        "ApplicationName"      -> ApplicationName.asInstanceOf[js.Any],
        "ApplicationStatus"    -> ApplicationStatus.asInstanceOf[js.Any],
        "ApplicationVersionId" -> ApplicationVersionId.asInstanceOf[js.Any],
        "RuntimeEnvironment"   -> RuntimeEnvironment.asInstanceOf[js.Any]
      )

      ApplicationConfigurationDescription.foreach(
        __v => __obj.update("ApplicationConfigurationDescription", __v.asInstanceOf[js.Any])
      )
      ApplicationDescription.foreach(__v => __obj.update("ApplicationDescription", __v.asInstanceOf[js.Any]))
      CloudWatchLoggingOptionDescriptions.foreach(
        __v => __obj.update("CloudWatchLoggingOptionDescriptions", __v.asInstanceOf[js.Any])
      )
      CreateTimestamp.foreach(__v => __obj.update("CreateTimestamp", __v.asInstanceOf[js.Any]))
      LastUpdateTimestamp.foreach(__v => __obj.update("LastUpdateTimestamp", __v.asInstanceOf[js.Any]))
      ServiceExecutionRole.foreach(__v => __obj.update("ServiceExecutionRole", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationDetail]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationRestoreType" -> ApplicationRestoreType.asInstanceOf[js.Any]
      )

      SnapshotName.foreach(__v => __obj.update("SnapshotName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationRestoreConfiguration]
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
      val __obj = js.Dictionary[js.Any](
        "SnapshotsEnabled" -> SnapshotsEnabled.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ApplicationSnapshotConfiguration]
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
      val __obj = js.Dictionary[js.Any](
        "SnapshotsEnabled" -> SnapshotsEnabled.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ApplicationSnapshotConfigurationDescription]
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
      val __obj = js.Dictionary[js.Any](
        "SnapshotsEnabledUpdate" -> SnapshotsEnabledUpdate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ApplicationSnapshotConfigurationUpdate]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationARN"       -> ApplicationARN.asInstanceOf[js.Any],
        "ApplicationName"      -> ApplicationName.asInstanceOf[js.Any],
        "ApplicationStatus"    -> ApplicationStatus.asInstanceOf[js.Any],
        "ApplicationVersionId" -> ApplicationVersionId.asInstanceOf[js.Any],
        "RuntimeEnvironment"   -> RuntimeEnvironment.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ApplicationSummary]
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
      val __obj = js.Dictionary[js.Any](
        "RecordColumnDelimiter" -> RecordColumnDelimiter.asInstanceOf[js.Any],
        "RecordRowDelimiter"    -> RecordRowDelimiter.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CSVMappingParameters]
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
      val __obj = js.Dictionary[js.Any](
        "ConfigurationType" -> ConfigurationType.asInstanceOf[js.Any]
      )

      CheckpointInterval.foreach(__v => __obj.update("CheckpointInterval", __v.asInstanceOf[js.Any]))
      CheckpointingEnabled.foreach(__v => __obj.update("CheckpointingEnabled", __v.asInstanceOf[js.Any]))
      MinPauseBetweenCheckpoints.foreach(__v => __obj.update("MinPauseBetweenCheckpoints", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CheckpointConfiguration]
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
      val __obj = js.Dictionary.empty[js.Any]
      CheckpointInterval.foreach(__v => __obj.update("CheckpointInterval", __v.asInstanceOf[js.Any]))
      CheckpointingEnabled.foreach(__v => __obj.update("CheckpointingEnabled", __v.asInstanceOf[js.Any]))
      ConfigurationType.foreach(__v => __obj.update("ConfigurationType", __v.asInstanceOf[js.Any]))
      MinPauseBetweenCheckpoints.foreach(__v => __obj.update("MinPauseBetweenCheckpoints", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CheckpointConfigurationDescription]
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
      val __obj = js.Dictionary.empty[js.Any]
      CheckpointIntervalUpdate.foreach(__v => __obj.update("CheckpointIntervalUpdate", __v.asInstanceOf[js.Any]))
      CheckpointingEnabledUpdate.foreach(__v => __obj.update("CheckpointingEnabledUpdate", __v.asInstanceOf[js.Any]))
      ConfigurationTypeUpdate.foreach(__v => __obj.update("ConfigurationTypeUpdate", __v.asInstanceOf[js.Any]))
      MinPauseBetweenCheckpointsUpdate.foreach(
        __v => __obj.update("MinPauseBetweenCheckpointsUpdate", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CheckpointConfigurationUpdate]
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
      val __obj = js.Dictionary[js.Any](
        "LogStreamARN" -> LogStreamARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CloudWatchLoggingOption]
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
      val __obj = js.Dictionary[js.Any](
        "LogStreamARN" -> LogStreamARN.asInstanceOf[js.Any]
      )

      CloudWatchLoggingOptionId.foreach(__v => __obj.update("CloudWatchLoggingOptionId", __v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.update("RoleARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchLoggingOptionDescription]
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
      val __obj = js.Dictionary[js.Any](
        "CloudWatchLoggingOptionId" -> CloudWatchLoggingOptionId.asInstanceOf[js.Any]
      )

      LogStreamARNUpdate.foreach(__v => __obj.update("LogStreamARNUpdate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchLoggingOptionUpdate]
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
      val __obj = js.Dictionary.empty[js.Any]
      S3ContentLocation.foreach(__v => __obj.update("S3ContentLocation", __v.asInstanceOf[js.Any]))
      TextContent.foreach(__v => __obj.update("TextContent", __v.asInstanceOf[js.Any]))
      ZipFileContent.foreach(__v => __obj.update("ZipFileContent", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeContent]
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
      val __obj = js.Dictionary.empty[js.Any]
      CodeMD5.foreach(__v => __obj.update("CodeMD5", __v.asInstanceOf[js.Any]))
      CodeSize.foreach(__v => __obj.update("CodeSize", __v.asInstanceOf[js.Any]))
      S3ApplicationCodeLocationDescription.foreach(
        __v => __obj.update("S3ApplicationCodeLocationDescription", __v.asInstanceOf[js.Any])
      )
      TextContent.foreach(__v => __obj.update("TextContent", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeContentDescription]
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
      val __obj = js.Dictionary.empty[js.Any]
      S3ContentLocationUpdate.foreach(__v => __obj.update("S3ContentLocationUpdate", __v.asInstanceOf[js.Any]))
      TextContentUpdate.foreach(__v => __obj.update("TextContentUpdate", __v.asInstanceOf[js.Any]))
      ZipFileContentUpdate.foreach(__v => __obj.update("ZipFileContentUpdate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeContentUpdate]
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
    var Tags: js.UndefOr[Tags]
  }

  object CreateApplicationRequest {
    def apply(
        ApplicationName: ApplicationName,
        RuntimeEnvironment: RuntimeEnvironment,
        ServiceExecutionRole: RoleARN,
        ApplicationConfiguration: js.UndefOr[ApplicationConfiguration] = js.undefined,
        ApplicationDescription: js.UndefOr[ApplicationDescription] = js.undefined,
        CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateApplicationRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApplicationName"      -> ApplicationName.asInstanceOf[js.Any],
        "RuntimeEnvironment"   -> RuntimeEnvironment.asInstanceOf[js.Any],
        "ServiceExecutionRole" -> ServiceExecutionRole.asInstanceOf[js.Any]
      )

      ApplicationConfiguration.foreach(__v => __obj.update("ApplicationConfiguration", __v.asInstanceOf[js.Any]))
      ApplicationDescription.foreach(__v => __obj.update("ApplicationDescription", __v.asInstanceOf[js.Any]))
      CloudWatchLoggingOptions.foreach(__v => __obj.update("CloudWatchLoggingOptions", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationDetail" -> ApplicationDetail.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateApplicationResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "SnapshotName"    -> SnapshotName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateApplicationSnapshotRequest]
    }
  }

  @js.native
  trait CreateApplicationSnapshotResponse extends js.Object {}

  object CreateApplicationSnapshotResponse {
    def apply(
        ): CreateApplicationSnapshotResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CreateApplicationSnapshotResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationName"             -> ApplicationName.asInstanceOf[js.Any],
        "CloudWatchLoggingOptionId"   -> CloudWatchLoggingOptionId.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApplicationCloudWatchLoggingOptionRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationARN.foreach(__v => __obj.update("ApplicationARN", __v.asInstanceOf[js.Any]))
      ApplicationVersionId.foreach(__v => __obj.update("ApplicationVersionId", __v.asInstanceOf[js.Any]))
      CloudWatchLoggingOptionDescriptions.foreach(
        __v => __obj.update("CloudWatchLoggingOptionDescriptions", __v.asInstanceOf[js.Any])
      )
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
    def apply(
        ApplicationName: ApplicationName,
        CurrentApplicationVersionId: ApplicationVersionId,
        InputId: Id
    ): DeleteApplicationInputProcessingConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApplicationName"             -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "InputId"                     -> InputId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApplicationInputProcessingConfigurationRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationARN.foreach(__v => __obj.update("ApplicationARN", __v.asInstanceOf[js.Any]))
      ApplicationVersionId.foreach(__v => __obj.update("ApplicationVersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteApplicationInputProcessingConfigurationResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationName"             -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "OutputId"                    -> OutputId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApplicationOutputRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationARN.foreach(__v => __obj.update("ApplicationARN", __v.asInstanceOf[js.Any]))
      ApplicationVersionId.foreach(__v => __obj.update("ApplicationVersionId", __v.asInstanceOf[js.Any]))
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
    def apply(
        ApplicationName: ApplicationName,
        CurrentApplicationVersionId: ApplicationVersionId,
        ReferenceId: Id
    ): DeleteApplicationReferenceDataSourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApplicationName"             -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "ReferenceId"                 -> ReferenceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApplicationReferenceDataSourceRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationARN.foreach(__v => __obj.update("ApplicationARN", __v.asInstanceOf[js.Any]))
      ApplicationVersionId.foreach(__v => __obj.update("ApplicationVersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteApplicationReferenceDataSourceResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "CreateTimestamp" -> CreateTimestamp.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApplicationRequest]
    }
  }

  @js.native
  trait DeleteApplicationResponse extends js.Object {}

  object DeleteApplicationResponse {
    def apply(
        ): DeleteApplicationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteApplicationResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationName"           -> ApplicationName.asInstanceOf[js.Any],
        "SnapshotCreationTimestamp" -> SnapshotCreationTimestamp.asInstanceOf[js.Any],
        "SnapshotName"              -> SnapshotName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApplicationSnapshotRequest]
    }
  }

  @js.native
  trait DeleteApplicationSnapshotResponse extends js.Object {}

  object DeleteApplicationSnapshotResponse {
    def apply(
        ): DeleteApplicationSnapshotResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteApplicationSnapshotResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any]
      )

      IncludeAdditionalDetails.foreach(__v => __obj.update("IncludeAdditionalDetails", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeApplicationRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationDetail" -> ApplicationDetail.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeApplicationResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "SnapshotName"    -> SnapshotName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeApplicationSnapshotRequest]
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
      val __obj = js.Dictionary[js.Any](
        "SnapshotDetails" -> SnapshotDetails.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeApplicationSnapshotResponse]
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
      val __obj = js.Dictionary[js.Any](
        "RecordFormatType" -> RecordFormatType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DestinationSchema]
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
      val __obj = js.Dictionary[js.Any](
        "ServiceExecutionRole" -> ServiceExecutionRole.asInstanceOf[js.Any]
      )

      InputProcessingConfiguration.foreach(
        __v => __obj.update("InputProcessingConfiguration", __v.asInstanceOf[js.Any])
      )
      InputStartingPositionConfiguration.foreach(
        __v => __obj.update("InputStartingPositionConfiguration", __v.asInstanceOf[js.Any])
      )
      ResourceARN.foreach(__v => __obj.update("ResourceARN", __v.asInstanceOf[js.Any]))
      S3Configuration.foreach(__v => __obj.update("S3Configuration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DiscoverInputSchemaRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      InputSchema.foreach(__v => __obj.update("InputSchema", __v.asInstanceOf[js.Any]))
      ParsedInputRecords.foreach(__v => __obj.update("ParsedInputRecords", __v.asInstanceOf[js.Any]))
      ProcessedInputRecords.foreach(__v => __obj.update("ProcessedInputRecords", __v.asInstanceOf[js.Any]))
      RawInputRecords.foreach(__v => __obj.update("RawInputRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DiscoverInputSchemaResponse]
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
      val __obj = js.Dictionary[js.Any](
        "PropertyGroups" -> PropertyGroups.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EnvironmentProperties]
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
      val __obj = js.Dictionary.empty[js.Any]
      PropertyGroupDescriptions.foreach(__v => __obj.update("PropertyGroupDescriptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentPropertyDescriptions]
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
      val __obj = js.Dictionary[js.Any](
        "PropertyGroups" -> PropertyGroups.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EnvironmentPropertyUpdates]
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
      val __obj = js.Dictionary.empty[js.Any]
      CheckpointConfiguration.foreach(__v => __obj.update("CheckpointConfiguration", __v.asInstanceOf[js.Any]))
      MonitoringConfiguration.foreach(__v => __obj.update("MonitoringConfiguration", __v.asInstanceOf[js.Any]))
      ParallelismConfiguration.foreach(__v => __obj.update("ParallelismConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FlinkApplicationConfiguration]
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
      val __obj = js.Dictionary.empty[js.Any]
      CheckpointConfigurationDescription.foreach(
        __v => __obj.update("CheckpointConfigurationDescription", __v.asInstanceOf[js.Any])
      )
      JobPlanDescription.foreach(__v => __obj.update("JobPlanDescription", __v.asInstanceOf[js.Any]))
      MonitoringConfigurationDescription.foreach(
        __v => __obj.update("MonitoringConfigurationDescription", __v.asInstanceOf[js.Any])
      )
      ParallelismConfigurationDescription.foreach(
        __v => __obj.update("ParallelismConfigurationDescription", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[FlinkApplicationConfigurationDescription]
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
      val __obj = js.Dictionary.empty[js.Any]
      CheckpointConfigurationUpdate.foreach(
        __v => __obj.update("CheckpointConfigurationUpdate", __v.asInstanceOf[js.Any])
      )
      MonitoringConfigurationUpdate.foreach(
        __v => __obj.update("MonitoringConfigurationUpdate", __v.asInstanceOf[js.Any])
      )
      ParallelismConfigurationUpdate.foreach(
        __v => __obj.update("ParallelismConfigurationUpdate", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[FlinkApplicationConfigurationUpdate]
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
      val __obj = js.Dictionary[js.Any](
        "InputSchema" -> InputSchema.asInstanceOf[js.Any],
        "NamePrefix"  -> NamePrefix.asInstanceOf[js.Any]
      )

      InputParallelism.foreach(__v => __obj.update("InputParallelism", __v.asInstanceOf[js.Any]))
      InputProcessingConfiguration.foreach(
        __v => __obj.update("InputProcessingConfiguration", __v.asInstanceOf[js.Any])
      )
      KinesisFirehoseInput.foreach(__v => __obj.update("KinesisFirehoseInput", __v.asInstanceOf[js.Any]))
      KinesisStreamsInput.foreach(__v => __obj.update("KinesisStreamsInput", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Input]
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
      val __obj = js.Dictionary.empty[js.Any]
      InAppStreamNames.foreach(__v => __obj.update("InAppStreamNames", __v.asInstanceOf[js.Any]))
      InputId.foreach(__v => __obj.update("InputId", __v.asInstanceOf[js.Any]))
      InputParallelism.foreach(__v => __obj.update("InputParallelism", __v.asInstanceOf[js.Any]))
      InputProcessingConfigurationDescription.foreach(
        __v => __obj.update("InputProcessingConfigurationDescription", __v.asInstanceOf[js.Any])
      )
      InputSchema.foreach(__v => __obj.update("InputSchema", __v.asInstanceOf[js.Any]))
      InputStartingPositionConfiguration.foreach(
        __v => __obj.update("InputStartingPositionConfiguration", __v.asInstanceOf[js.Any])
      )
      KinesisFirehoseInputDescription.foreach(
        __v => __obj.update("KinesisFirehoseInputDescription", __v.asInstanceOf[js.Any])
      )
      KinesisStreamsInputDescription.foreach(
        __v => __obj.update("KinesisStreamsInputDescription", __v.asInstanceOf[js.Any])
      )
      NamePrefix.foreach(__v => __obj.update("NamePrefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputDescription]
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
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InputLambdaProcessor]
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
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      RoleARN.foreach(__v => __obj.update("RoleARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputLambdaProcessorDescription]
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
      val __obj = js.Dictionary[js.Any](
        "ResourceARNUpdate" -> ResourceARNUpdate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InputLambdaProcessorUpdate]
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
      val __obj = js.Dictionary.empty[js.Any]
      Count.foreach(__v => __obj.update("Count", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputParallelism]
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
      val __obj = js.Dictionary[js.Any](
        "CountUpdate" -> CountUpdate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InputParallelismUpdate]
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
      val __obj = js.Dictionary[js.Any](
        "InputLambdaProcessor" -> InputLambdaProcessor.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InputProcessingConfiguration]
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
      val __obj = js.Dictionary.empty[js.Any]
      InputLambdaProcessorDescription.foreach(
        __v => __obj.update("InputLambdaProcessorDescription", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[InputProcessingConfigurationDescription]
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
      val __obj = js.Dictionary[js.Any](
        "InputLambdaProcessorUpdate" -> InputLambdaProcessorUpdate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InputProcessingConfigurationUpdate]
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
      val __obj = js.Dictionary.empty[js.Any]
      RecordColumnUpdates.foreach(__v => __obj.update("RecordColumnUpdates", __v.asInstanceOf[js.Any]))
      RecordEncodingUpdate.foreach(__v => __obj.update("RecordEncodingUpdate", __v.asInstanceOf[js.Any]))
      RecordFormatUpdate.foreach(__v => __obj.update("RecordFormatUpdate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputSchemaUpdate]
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
      val __obj = js.Dictionary.empty[js.Any]
      InputStartingPosition.foreach(__v => __obj.update("InputStartingPosition", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputStartingPositionConfiguration]
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
      val __obj = js.Dictionary[js.Any](
        "InputId" -> InputId.asInstanceOf[js.Any]
      )

      InputParallelismUpdate.foreach(__v => __obj.update("InputParallelismUpdate", __v.asInstanceOf[js.Any]))
      InputProcessingConfigurationUpdate.foreach(
        __v => __obj.update("InputProcessingConfigurationUpdate", __v.asInstanceOf[js.Any])
      )
      InputSchemaUpdate.foreach(__v => __obj.update("InputSchemaUpdate", __v.asInstanceOf[js.Any]))
      KinesisFirehoseInputUpdate.foreach(__v => __obj.update("KinesisFirehoseInputUpdate", __v.asInstanceOf[js.Any]))
      KinesisStreamsInputUpdate.foreach(__v => __obj.update("KinesisStreamsInputUpdate", __v.asInstanceOf[js.Any]))
      NamePrefixUpdate.foreach(__v => __obj.update("NamePrefixUpdate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputUpdate]
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
      val __obj = js.Dictionary[js.Any](
        "RecordRowPath" -> RecordRowPath.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[JSONMappingParameters]
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
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[KinesisFirehoseInput]
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
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      RoleARN.foreach(__v => __obj.update("RoleARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KinesisFirehoseInputDescription]
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
      val __obj = js.Dictionary[js.Any](
        "ResourceARNUpdate" -> ResourceARNUpdate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[KinesisFirehoseInputUpdate]
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
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[KinesisFirehoseOutput]
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
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      RoleARN.foreach(__v => __obj.update("RoleARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KinesisFirehoseOutputDescription]
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
      val __obj = js.Dictionary[js.Any](
        "ResourceARNUpdate" -> ResourceARNUpdate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[KinesisFirehoseOutputUpdate]
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
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[KinesisStreamsInput]
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
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      RoleARN.foreach(__v => __obj.update("RoleARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KinesisStreamsInputDescription]
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
      val __obj = js.Dictionary[js.Any](
        "ResourceARNUpdate" -> ResourceARNUpdate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[KinesisStreamsInputUpdate]
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
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[KinesisStreamsOutput]
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
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      RoleARN.foreach(__v => __obj.update("RoleARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KinesisStreamsOutputDescription]
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
      val __obj = js.Dictionary[js.Any](
        "ResourceARNUpdate" -> ResourceARNUpdate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[KinesisStreamsOutputUpdate]
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
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[LambdaOutput]
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
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      RoleARN.foreach(__v => __obj.update("RoleARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaOutputDescription]
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
      val __obj = js.Dictionary[js.Any](
        "ResourceARNUpdate" -> ResourceARNUpdate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[LambdaOutputUpdate]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationSnapshotsRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SnapshotSummaries.foreach(__v => __obj.update("SnapshotSummaries", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationSnapshotsResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationSummaries" -> ApplicationSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: KinesisAnalyticsARN
  }

  object ListTagsForResourceRequest {
    def apply(
        ResourceARN: KinesisAnalyticsARN
    ): ListTagsForResourceRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      CSVMappingParameters.foreach(__v => __obj.update("CSVMappingParameters", __v.asInstanceOf[js.Any]))
      JSONMappingParameters.foreach(__v => __obj.update("JSONMappingParameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MappingParameters]
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
    * Describes configuration parameters for Amazon CloudWatch logging for a Java-based Kinesis Data Analytics application. For more information about CloudWatch logging, see [[https://docs.aws.amazon.com/kinesisanalytics/latest/java/monitoring-overview.html|Monitoring]].
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
      val __obj = js.Dictionary[js.Any](
        "ConfigurationType" -> ConfigurationType.asInstanceOf[js.Any]
      )

      LogLevel.foreach(__v => __obj.update("LogLevel", __v.asInstanceOf[js.Any]))
      MetricsLevel.foreach(__v => __obj.update("MetricsLevel", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringConfiguration]
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
      val __obj = js.Dictionary.empty[js.Any]
      ConfigurationType.foreach(__v => __obj.update("ConfigurationType", __v.asInstanceOf[js.Any]))
      LogLevel.foreach(__v => __obj.update("LogLevel", __v.asInstanceOf[js.Any]))
      MetricsLevel.foreach(__v => __obj.update("MetricsLevel", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringConfigurationDescription]
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
      val __obj = js.Dictionary.empty[js.Any]
      ConfigurationTypeUpdate.foreach(__v => __obj.update("ConfigurationTypeUpdate", __v.asInstanceOf[js.Any]))
      LogLevelUpdate.foreach(__v => __obj.update("LogLevelUpdate", __v.asInstanceOf[js.Any]))
      MetricsLevelUpdate.foreach(__v => __obj.update("MetricsLevelUpdate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringConfigurationUpdate]
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
      val __obj = js.Dictionary[js.Any](
        "DestinationSchema" -> DestinationSchema.asInstanceOf[js.Any],
        "Name"              -> Name.asInstanceOf[js.Any]
      )

      KinesisFirehoseOutput.foreach(__v => __obj.update("KinesisFirehoseOutput", __v.asInstanceOf[js.Any]))
      KinesisStreamsOutput.foreach(__v => __obj.update("KinesisStreamsOutput", __v.asInstanceOf[js.Any]))
      LambdaOutput.foreach(__v => __obj.update("LambdaOutput", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Output]
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
      val __obj = js.Dictionary.empty[js.Any]
      DestinationSchema.foreach(__v => __obj.update("DestinationSchema", __v.asInstanceOf[js.Any]))
      KinesisFirehoseOutputDescription.foreach(
        __v => __obj.update("KinesisFirehoseOutputDescription", __v.asInstanceOf[js.Any])
      )
      KinesisStreamsOutputDescription.foreach(
        __v => __obj.update("KinesisStreamsOutputDescription", __v.asInstanceOf[js.Any])
      )
      LambdaOutputDescription.foreach(__v => __obj.update("LambdaOutputDescription", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      OutputId.foreach(__v => __obj.update("OutputId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputDescription]
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
      val __obj = js.Dictionary[js.Any](
        "OutputId" -> OutputId.asInstanceOf[js.Any]
      )

      DestinationSchemaUpdate.foreach(__v => __obj.update("DestinationSchemaUpdate", __v.asInstanceOf[js.Any]))
      KinesisFirehoseOutputUpdate.foreach(__v => __obj.update("KinesisFirehoseOutputUpdate", __v.asInstanceOf[js.Any]))
      KinesisStreamsOutputUpdate.foreach(__v => __obj.update("KinesisStreamsOutputUpdate", __v.asInstanceOf[js.Any]))
      LambdaOutputUpdate.foreach(__v => __obj.update("LambdaOutputUpdate", __v.asInstanceOf[js.Any]))
      NameUpdate.foreach(__v => __obj.update("NameUpdate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputUpdate]
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
      val __obj = js.Dictionary[js.Any](
        "ConfigurationType" -> ConfigurationType.asInstanceOf[js.Any]
      )

      AutoScalingEnabled.foreach(__v => __obj.update("AutoScalingEnabled", __v.asInstanceOf[js.Any]))
      Parallelism.foreach(__v => __obj.update("Parallelism", __v.asInstanceOf[js.Any]))
      ParallelismPerKPU.foreach(__v => __obj.update("ParallelismPerKPU", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParallelismConfiguration]
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
      val __obj = js.Dictionary.empty[js.Any]
      AutoScalingEnabled.foreach(__v => __obj.update("AutoScalingEnabled", __v.asInstanceOf[js.Any]))
      ConfigurationType.foreach(__v => __obj.update("ConfigurationType", __v.asInstanceOf[js.Any]))
      CurrentParallelism.foreach(__v => __obj.update("CurrentParallelism", __v.asInstanceOf[js.Any]))
      Parallelism.foreach(__v => __obj.update("Parallelism", __v.asInstanceOf[js.Any]))
      ParallelismPerKPU.foreach(__v => __obj.update("ParallelismPerKPU", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParallelismConfigurationDescription]
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
      val __obj = js.Dictionary.empty[js.Any]
      AutoScalingEnabledUpdate.foreach(__v => __obj.update("AutoScalingEnabledUpdate", __v.asInstanceOf[js.Any]))
      ConfigurationTypeUpdate.foreach(__v => __obj.update("ConfigurationTypeUpdate", __v.asInstanceOf[js.Any]))
      ParallelismPerKPUUpdate.foreach(__v => __obj.update("ParallelismPerKPUUpdate", __v.asInstanceOf[js.Any]))
      ParallelismUpdate.foreach(__v => __obj.update("ParallelismUpdate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParallelismConfigurationUpdate]
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
      val __obj = js.Dictionary[js.Any](
        "PropertyGroupId" -> PropertyGroupId.asInstanceOf[js.Any],
        "PropertyMap"     -> PropertyMap.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PropertyGroup]
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
      val __obj = js.Dictionary[js.Any](
        "Name"    -> Name.asInstanceOf[js.Any],
        "SqlType" -> SqlType.asInstanceOf[js.Any]
      )

      Mapping.foreach(__v => __obj.update("Mapping", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecordColumn]
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
      val __obj = js.Dictionary[js.Any](
        "RecordFormatType" -> RecordFormatType.asInstanceOf[js.Any]
      )

      MappingParameters.foreach(__v => __obj.update("MappingParameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecordFormat]
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
      val __obj = js.Dictionary[js.Any](
        "ReferenceSchema" -> ReferenceSchema.asInstanceOf[js.Any],
        "TableName"       -> TableName.asInstanceOf[js.Any]
      )

      S3ReferenceDataSource.foreach(__v => __obj.update("S3ReferenceDataSource", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReferenceDataSource]
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
      val __obj = js.Dictionary[js.Any](
        "ReferenceId"                      -> ReferenceId.asInstanceOf[js.Any],
        "S3ReferenceDataSourceDescription" -> S3ReferenceDataSourceDescription.asInstanceOf[js.Any],
        "TableName"                        -> TableName.asInstanceOf[js.Any]
      )

      ReferenceSchema.foreach(__v => __obj.update("ReferenceSchema", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReferenceDataSourceDescription]
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
      val __obj = js.Dictionary[js.Any](
        "ReferenceId" -> ReferenceId.asInstanceOf[js.Any]
      )

      ReferenceSchemaUpdate.foreach(__v => __obj.update("ReferenceSchemaUpdate", __v.asInstanceOf[js.Any]))
      S3ReferenceDataSourceUpdate.foreach(__v => __obj.update("S3ReferenceDataSourceUpdate", __v.asInstanceOf[js.Any]))
      TableNameUpdate.foreach(__v => __obj.update("TableNameUpdate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReferenceDataSourceUpdate]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationRestoreConfiguration.foreach(
        __v => __obj.update("ApplicationRestoreConfiguration", __v.asInstanceOf[js.Any])
      )
      SqlRunConfigurations.foreach(__v => __obj.update("SqlRunConfigurations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RunConfiguration]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationRestoreConfigurationDescription.foreach(
        __v => __obj.update("ApplicationRestoreConfigurationDescription", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[RunConfigurationDescription]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationRestoreConfiguration.foreach(
        __v => __obj.update("ApplicationRestoreConfiguration", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[RunConfigurationUpdate]
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
      val __obj = js.Dictionary[js.Any](
        "BucketARN" -> BucketARN.asInstanceOf[js.Any],
        "FileKey"   -> FileKey.asInstanceOf[js.Any]
      )

      ObjectVersion.foreach(__v => __obj.update("ObjectVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3ApplicationCodeLocationDescription]
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
      val __obj = js.Dictionary[js.Any](
        "BucketARN" -> BucketARN.asInstanceOf[js.Any],
        "FileKey"   -> FileKey.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[S3Configuration]
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
      val __obj = js.Dictionary[js.Any](
        "BucketARN" -> BucketARN.asInstanceOf[js.Any],
        "FileKey"   -> FileKey.asInstanceOf[js.Any]
      )

      ObjectVersion.foreach(__v => __obj.update("ObjectVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3ContentLocation]
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
      val __obj = js.Dictionary.empty[js.Any]
      BucketARNUpdate.foreach(__v => __obj.update("BucketARNUpdate", __v.asInstanceOf[js.Any]))
      FileKeyUpdate.foreach(__v => __obj.update("FileKeyUpdate", __v.asInstanceOf[js.Any]))
      ObjectVersionUpdate.foreach(__v => __obj.update("ObjectVersionUpdate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3ContentLocationUpdate]
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
      val __obj = js.Dictionary.empty[js.Any]
      BucketARN.foreach(__v => __obj.update("BucketARN", __v.asInstanceOf[js.Any]))
      FileKey.foreach(__v => __obj.update("FileKey", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3ReferenceDataSource]
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
      val __obj = js.Dictionary[js.Any](
        "BucketARN" -> BucketARN.asInstanceOf[js.Any],
        "FileKey"   -> FileKey.asInstanceOf[js.Any]
      )

      ReferenceRoleARN.foreach(__v => __obj.update("ReferenceRoleARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3ReferenceDataSourceDescription]
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
      val __obj = js.Dictionary.empty[js.Any]
      BucketARNUpdate.foreach(__v => __obj.update("BucketARNUpdate", __v.asInstanceOf[js.Any]))
      FileKeyUpdate.foreach(__v => __obj.update("FileKeyUpdate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3ReferenceDataSourceUpdate]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationVersionId" -> ApplicationVersionId.asInstanceOf[js.Any],
        "SnapshotName"         -> SnapshotName.asInstanceOf[js.Any],
        "SnapshotStatus"       -> SnapshotStatus.asInstanceOf[js.Any]
      )

      SnapshotCreationTimestamp.foreach(__v => __obj.update("SnapshotCreationTimestamp", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SnapshotDetails]
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
      val __obj = js.Dictionary[js.Any](
        "RecordColumns" -> RecordColumns.asInstanceOf[js.Any],
        "RecordFormat"  -> RecordFormat.asInstanceOf[js.Any]
      )

      RecordEncoding.foreach(__v => __obj.update("RecordEncoding", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceSchema]
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
      val __obj = js.Dictionary.empty[js.Any]
      Inputs.foreach(__v => __obj.update("Inputs", __v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.update("Outputs", __v.asInstanceOf[js.Any]))
      ReferenceDataSources.foreach(__v => __obj.update("ReferenceDataSources", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SqlApplicationConfiguration]
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
      val __obj = js.Dictionary.empty[js.Any]
      InputDescriptions.foreach(__v => __obj.update("InputDescriptions", __v.asInstanceOf[js.Any]))
      OutputDescriptions.foreach(__v => __obj.update("OutputDescriptions", __v.asInstanceOf[js.Any]))
      ReferenceDataSourceDescriptions.foreach(
        __v => __obj.update("ReferenceDataSourceDescriptions", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[SqlApplicationConfigurationDescription]
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
      val __obj = js.Dictionary.empty[js.Any]
      InputUpdates.foreach(__v => __obj.update("InputUpdates", __v.asInstanceOf[js.Any]))
      OutputUpdates.foreach(__v => __obj.update("OutputUpdates", __v.asInstanceOf[js.Any]))
      ReferenceDataSourceUpdates.foreach(__v => __obj.update("ReferenceDataSourceUpdates", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SqlApplicationConfigurationUpdate]
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
      val __obj = js.Dictionary[js.Any](
        "InputId"                            -> InputId.asInstanceOf[js.Any],
        "InputStartingPositionConfiguration" -> InputStartingPositionConfiguration.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SqlRunConfiguration]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationName"  -> ApplicationName.asInstanceOf[js.Any],
        "RunConfiguration" -> RunConfiguration.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartApplicationRequest]
    }
  }

  @js.native
  trait StartApplicationResponse extends js.Object {}

  object StartApplicationResponse {
    def apply(
        ): StartApplicationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[StartApplicationResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopApplicationRequest]
    }
  }

  @js.native
  trait StopApplicationResponse extends js.Object {}

  object StopApplicationResponse {
    def apply(
        ): StopApplicationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[StopApplicationResponse]
    }
  }

  /**
    * A key-value pair (the value is optional) that you can define and assign to AWS resources. If you specify a tag that already exists, the tag value is replaced with the value that you specify in the request. Note that the maximum number of application tags includes system tags. The maximum number of user-defined application tags is 50. For more information, see [[https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html|Using Cost Allocation Tags]] in the <i>AWS Billing and Cost Management Guide</i>.
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
      val __obj = js.Dictionary[js.Any](
        "Key" -> Key.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceARN: KinesisAnalyticsARN
    var Tags: Tags
  }

  object TagResourceRequest {
    def apply(
        ResourceARN: KinesisAnalyticsARN,
        Tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: KinesisAnalyticsARN
    var TagKeys: TagKeys
  }

  object UntagResourceRequest {
    def apply(
        ResourceARN: KinesisAnalyticsARN,
        TagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UntagResourceResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationName"             -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any]
      )

      ApplicationConfigurationUpdate.foreach(
        __v => __obj.update("ApplicationConfigurationUpdate", __v.asInstanceOf[js.Any])
      )
      CloudWatchLoggingOptionUpdates.foreach(
        __v => __obj.update("CloudWatchLoggingOptionUpdates", __v.asInstanceOf[js.Any])
      )
      RunConfigurationUpdate.foreach(__v => __obj.update("RunConfigurationUpdate", __v.asInstanceOf[js.Any]))
      ServiceExecutionRoleUpdate.foreach(__v => __obj.update("ServiceExecutionRoleUpdate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApplicationRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationDetail" -> ApplicationDetail.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateApplicationResponse]
    }
  }
}
