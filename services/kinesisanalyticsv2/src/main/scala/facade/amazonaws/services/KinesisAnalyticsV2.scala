package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object kinesisanalyticsv2 {
  type ApplicationDescription              = String
  type ApplicationName                     = String
  type ApplicationSummaries                = js.Array[ApplicationSummary]
  type ApplicationVersionId                = Double
  type BooleanObject                       = Boolean
  type BucketARN                           = String
  type CheckpointInterval                  = Double
  type CloudWatchLoggingOptionDescriptions = js.Array[CloudWatchLoggingOptionDescription]
  type CloudWatchLoggingOptionUpdates      = js.Array[CloudWatchLoggingOptionUpdate]
  type CloudWatchLoggingOptions            = js.Array[CloudWatchLoggingOption]
  type CodeMD5                             = String
  type CodeSize                            = Double
  type FileKey                             = String
  type Id                                  = String
  type InAppStreamName                     = String
  type InAppStreamNames                    = js.Array[InAppStreamName]
  type InAppTableName                      = String
  type InputDescriptions                   = js.Array[InputDescription]
  type InputParallelismCount               = Int
  type InputUpdates                        = js.Array[InputUpdate]
  type Inputs                              = js.Array[Input]
  type JobPlanDescription                  = String
  type KinesisAnalyticsARN                 = String
  type ListApplicationsInputLimit          = Int
  type ListSnapshotsInputLimit             = Int
  type LogStreamARN                        = String
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
  type RecordRowDelimiter                  = String
  type RecordRowPath                       = String
  type ReferenceDataSourceDescriptions     = js.Array[ReferenceDataSourceDescription]
  type ReferenceDataSourceUpdates          = js.Array[ReferenceDataSourceUpdate]
  type ReferenceDataSources                = js.Array[ReferenceDataSource]
  type ResourceARN                         = String
  type RoleARN                             = String
  type SecurityGroupId                     = String
  type SecurityGroupIds                    = js.Array[SecurityGroupId]
  type SnapshotName                        = String
  type SnapshotSummaries                   = js.Array[SnapshotDetails]
  type SqlRunConfigurations                = js.Array[SqlRunConfiguration]
  type SubnetId                            = String
  type SubnetIds                           = js.Array[SubnetId]
  type TagKey                              = String
  type TagKeys                             = js.Array[TagKey]
  type TagValue                            = String
  type Tags                                = js.Array[Tag]
  type TextContent                         = String
  type Timestamp                           = js.Date
  type VpcConfigurationDescriptions        = js.Array[VpcConfigurationDescription]
  type VpcConfigurationUpdates             = js.Array[VpcConfigurationUpdate]
  type VpcConfigurations                   = js.Array[VpcConfiguration]
  type VpcId                               = String
  type ZipFileContent                      = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String

  implicit final class KinesisAnalyticsV2Ops(private val service: KinesisAnalyticsV2) extends AnyVal {

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
    @inline def addApplicationVpcConfigurationFuture(
        params: AddApplicationVpcConfigurationRequest
    ): Future[AddApplicationVpcConfigurationResponse] =
      service.addApplicationVpcConfiguration(params).promise().toFuture
    @inline def createApplicationFuture(params: CreateApplicationRequest): Future[CreateApplicationResponse] =
      service.createApplication(params).promise().toFuture
    @inline def createApplicationSnapshotFuture(
        params: CreateApplicationSnapshotRequest
    ): Future[CreateApplicationSnapshotResponse] = service.createApplicationSnapshot(params).promise().toFuture
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
    @inline def deleteApplicationSnapshotFuture(
        params: DeleteApplicationSnapshotRequest
    ): Future[DeleteApplicationSnapshotResponse] = service.deleteApplicationSnapshot(params).promise().toFuture
    @inline def deleteApplicationVpcConfigurationFuture(
        params: DeleteApplicationVpcConfigurationRequest
    ): Future[DeleteApplicationVpcConfigurationResponse] =
      service.deleteApplicationVpcConfiguration(params).promise().toFuture
    @inline def describeApplicationFuture(params: DescribeApplicationRequest): Future[DescribeApplicationResponse] =
      service.describeApplication(params).promise().toFuture
    @inline def describeApplicationSnapshotFuture(
        params: DescribeApplicationSnapshotRequest
    ): Future[DescribeApplicationSnapshotResponse] = service.describeApplicationSnapshot(params).promise().toFuture
    @inline def discoverInputSchemaFuture(params: DiscoverInputSchemaRequest): Future[DiscoverInputSchemaResponse] =
      service.discoverInputSchema(params).promise().toFuture
    @inline def listApplicationSnapshotsFuture(
        params: ListApplicationSnapshotsRequest
    ): Future[ListApplicationSnapshotsResponse] = service.listApplicationSnapshots(params).promise().toFuture
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
    ): Request[AddApplicationReferenceDataSourceResponse] = js.native
    def addApplicationVpcConfiguration(
        params: AddApplicationVpcConfigurationRequest
    ): Request[AddApplicationVpcConfigurationResponse]                                          = js.native
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
    ): Request[DeleteApplicationSnapshotResponse] = js.native
    def deleteApplicationVpcConfiguration(
        params: DeleteApplicationVpcConfigurationRequest
    ): Request[DeleteApplicationVpcConfigurationResponse]                                             = js.native
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
  @Factory
  trait AddApplicationCloudWatchLoggingOptionRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CloudWatchLoggingOption: CloudWatchLoggingOption
    var CurrentApplicationVersionId: ApplicationVersionId
  }

  @js.native
  @Factory
  trait AddApplicationCloudWatchLoggingOptionResponse extends js.Object {
    var ApplicationARN: js.UndefOr[ResourceARN]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var CloudWatchLoggingOptionDescriptions: js.UndefOr[CloudWatchLoggingOptionDescriptions]
  }

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
  trait AddApplicationInputProcessingConfigurationResponse extends js.Object {
    var ApplicationARN: js.UndefOr[ResourceARN]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var InputId: js.UndefOr[Id]
    var InputProcessingConfigurationDescription: js.UndefOr[InputProcessingConfigurationDescription]
  }

  @js.native
  @Factory
  trait AddApplicationInputRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var Input: Input
  }

  @js.native
  @Factory
  trait AddApplicationInputResponse extends js.Object {
    var ApplicationARN: js.UndefOr[ResourceARN]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var InputDescriptions: js.UndefOr[InputDescriptions]
  }

  @js.native
  @Factory
  trait AddApplicationOutputRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var Output: Output
  }

  @js.native
  @Factory
  trait AddApplicationOutputResponse extends js.Object {
    var ApplicationARN: js.UndefOr[ResourceARN]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var OutputDescriptions: js.UndefOr[OutputDescriptions]
  }

  @js.native
  @Factory
  trait AddApplicationReferenceDataSourceRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var ReferenceDataSource: ReferenceDataSource
  }

  @js.native
  @Factory
  trait AddApplicationReferenceDataSourceResponse extends js.Object {
    var ApplicationARN: js.UndefOr[ResourceARN]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var ReferenceDataSourceDescriptions: js.UndefOr[ReferenceDataSourceDescriptions]
  }

  @js.native
  @Factory
  trait AddApplicationVpcConfigurationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var VpcConfiguration: VpcConfiguration
  }

  @js.native
  @Factory
  trait AddApplicationVpcConfigurationResponse extends js.Object {
    var ApplicationARN: js.UndefOr[ResourceARN]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var VpcConfigurationDescription: js.UndefOr[VpcConfigurationDescription]
  }

  /**
    * Describes code configuration for a Java-based Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait ApplicationCodeConfiguration extends js.Object {
    var CodeContentType: CodeContentType
    var CodeContent: js.UndefOr[CodeContent]
  }

  /**
    * Describes code configuration for a Java-based Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait ApplicationCodeConfigurationDescription extends js.Object {
    var CodeContentType: CodeContentType
    var CodeContentDescription: js.UndefOr[CodeContentDescription]
  }

  /**
    * Describes updates to a Java-based Amazon Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait ApplicationCodeConfigurationUpdate extends js.Object {
    var CodeContentTypeUpdate: js.UndefOr[CodeContentType]
    var CodeContentUpdate: js.UndefOr[CodeContentUpdate]
  }

  /**
    * Specifies the creation parameters for an Amazon Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait ApplicationConfiguration extends js.Object {
    var ApplicationCodeConfiguration: ApplicationCodeConfiguration
    var ApplicationSnapshotConfiguration: js.UndefOr[ApplicationSnapshotConfiguration]
    var EnvironmentProperties: js.UndefOr[EnvironmentProperties]
    var FlinkApplicationConfiguration: js.UndefOr[FlinkApplicationConfiguration]
    var SqlApplicationConfiguration: js.UndefOr[SqlApplicationConfiguration]
    var VpcConfigurations: js.UndefOr[VpcConfigurations]
  }

  /**
    * Describes details about the application code and starting parameters for an Amazon Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait ApplicationConfigurationDescription extends js.Object {
    var ApplicationCodeConfigurationDescription: js.UndefOr[ApplicationCodeConfigurationDescription]
    var ApplicationSnapshotConfigurationDescription: js.UndefOr[ApplicationSnapshotConfigurationDescription]
    var EnvironmentPropertyDescriptions: js.UndefOr[EnvironmentPropertyDescriptions]
    var FlinkApplicationConfigurationDescription: js.UndefOr[FlinkApplicationConfigurationDescription]
    var RunConfigurationDescription: js.UndefOr[RunConfigurationDescription]
    var SqlApplicationConfigurationDescription: js.UndefOr[SqlApplicationConfigurationDescription]
    var VpcConfigurationDescriptions: js.UndefOr[VpcConfigurationDescriptions]
  }

  /**
    * Describes updates to an application's configuration.
    */
  @js.native
  @Factory
  trait ApplicationConfigurationUpdate extends js.Object {
    var ApplicationCodeConfigurationUpdate: js.UndefOr[ApplicationCodeConfigurationUpdate]
    var ApplicationSnapshotConfigurationUpdate: js.UndefOr[ApplicationSnapshotConfigurationUpdate]
    var EnvironmentPropertyUpdates: js.UndefOr[EnvironmentPropertyUpdates]
    var FlinkApplicationConfigurationUpdate: js.UndefOr[FlinkApplicationConfigurationUpdate]
    var SqlApplicationConfigurationUpdate: js.UndefOr[SqlApplicationConfigurationUpdate]
    var VpcConfigurationUpdates: js.UndefOr[VpcConfigurationUpdates]
  }

  /**
    * Describes the application, including the application Amazon Resource Name (ARN), status, latest version, and input and output configurations.
    */
  @js.native
  @Factory
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

  /**
    * Specifies the method and snapshot to use when restarting an application using previously saved application state.
    */
  @js.native
  @Factory
  trait ApplicationRestoreConfiguration extends js.Object {
    var ApplicationRestoreType: ApplicationRestoreType
    var SnapshotName: js.UndefOr[SnapshotName]
  }

  @js.native
  sealed trait ApplicationRestoreType extends js.Any
  object ApplicationRestoreType extends js.Object {
    val SKIP_RESTORE_FROM_SNAPSHOT   = "SKIP_RESTORE_FROM_SNAPSHOT".asInstanceOf[ApplicationRestoreType]
    val RESTORE_FROM_LATEST_SNAPSHOT = "RESTORE_FROM_LATEST_SNAPSHOT".asInstanceOf[ApplicationRestoreType]
    val RESTORE_FROM_CUSTOM_SNAPSHOT = "RESTORE_FROM_CUSTOM_SNAPSHOT".asInstanceOf[ApplicationRestoreType]

    val values =
      js.Object.freeze(js.Array(SKIP_RESTORE_FROM_SNAPSHOT, RESTORE_FROM_LATEST_SNAPSHOT, RESTORE_FROM_CUSTOM_SNAPSHOT))
  }

  /**
    * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait ApplicationSnapshotConfiguration extends js.Object {
    var SnapshotsEnabled: BooleanObject
  }

  /**
    * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait ApplicationSnapshotConfigurationDescription extends js.Object {
    var SnapshotsEnabled: BooleanObject
  }

  /**
    * Describes updates to whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait ApplicationSnapshotConfigurationUpdate extends js.Object {
    var SnapshotsEnabledUpdate: BooleanObject
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
    * Provides application summary information, including the application Amazon Resource Name (ARN), name, and status.
    */
  @js.native
  @Factory
  trait ApplicationSummary extends js.Object {
    var ApplicationARN: ResourceARN
    var ApplicationName: ApplicationName
    var ApplicationStatus: ApplicationStatus
    var ApplicationVersionId: ApplicationVersionId
    var RuntimeEnvironment: RuntimeEnvironment
  }

  /**
    * For an SQL-based application, provides additional mapping information when the record format uses delimiters, such as CSV. For example, the following sample records use CSV format, where the records use the <i>'n'</i> as the row delimiter and a comma (",") as the column delimiter:
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
    * Describes an application's checkpointing configuration. Checkpointing is the process of persisting application state for fault tolerance. For more information, see [[https://ci.apache.org/projects/flink/flink-docs-release-1.6/concepts/programming-model.html#checkpoints-for-fault-tolerance| Checkpoints for Fault Tolerance]] in the [[https://ci.apache.org/projects/flink/flink-docs-release-1.6/|Apache Flink Documentation]].
    */
  @js.native
  @Factory
  trait CheckpointConfiguration extends js.Object {
    var ConfigurationType: ConfigurationType
    var CheckpointInterval: js.UndefOr[CheckpointInterval]
    var CheckpointingEnabled: js.UndefOr[BooleanObject]
    var MinPauseBetweenCheckpoints: js.UndefOr[MinPauseBetweenCheckpoints]
  }

  /**
    * Describes checkpointing parameters for a Java-based Amazon Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait CheckpointConfigurationDescription extends js.Object {
    var CheckpointInterval: js.UndefOr[CheckpointInterval]
    var CheckpointingEnabled: js.UndefOr[BooleanObject]
    var ConfigurationType: js.UndefOr[ConfigurationType]
    var MinPauseBetweenCheckpoints: js.UndefOr[MinPauseBetweenCheckpoints]
  }

  /**
    * Describes updates to the checkpointing parameters for a Java-based Amazon Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait CheckpointConfigurationUpdate extends js.Object {
    var CheckpointIntervalUpdate: js.UndefOr[CheckpointInterval]
    var CheckpointingEnabledUpdate: js.UndefOr[BooleanObject]
    var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType]
    var MinPauseBetweenCheckpointsUpdate: js.UndefOr[MinPauseBetweenCheckpoints]
  }

  /**
    * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon Resource Name (ARN).
    */
  @js.native
  @Factory
  trait CloudWatchLoggingOption extends js.Object {
    var LogStreamARN: LogStreamARN
  }

  /**
    * Describes the Amazon CloudWatch logging option.
    */
  @js.native
  @Factory
  trait CloudWatchLoggingOptionDescription extends js.Object {
    var LogStreamARN: LogStreamARN
    var CloudWatchLoggingOptionId: js.UndefOr[Id]
    var RoleARN: js.UndefOr[RoleARN]
  }

  /**
    * Describes the Amazon CloudWatch logging option updates.
    */
  @js.native
  @Factory
  trait CloudWatchLoggingOptionUpdate extends js.Object {
    var CloudWatchLoggingOptionId: Id
    var LogStreamARNUpdate: js.UndefOr[LogStreamARN]
  }

  /**
    * Specifies either the application code, or the location of the application code, for a Java-based Amazon Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait CodeContent extends js.Object {
    var S3ContentLocation: js.UndefOr[S3ContentLocation]
    var TextContent: js.UndefOr[TextContent]
    var ZipFileContent: js.UndefOr[ZipFileContent]
  }

  /**
    * Describes details about the application code for a Java-based Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait CodeContentDescription extends js.Object {
    var CodeMD5: js.UndefOr[CodeMD5]
    var CodeSize: js.UndefOr[CodeSize]
    var S3ApplicationCodeLocationDescription: js.UndefOr[S3ApplicationCodeLocationDescription]
    var TextContent: js.UndefOr[TextContent]
  }

  @js.native
  sealed trait CodeContentType extends js.Any
  object CodeContentType extends js.Object {
    val PLAINTEXT = "PLAINTEXT".asInstanceOf[CodeContentType]
    val ZIPFILE   = "ZIPFILE".asInstanceOf[CodeContentType]

    val values = js.Object.freeze(js.Array(PLAINTEXT, ZIPFILE))
  }

  /**
    * Describes an update to the code of a Java-based Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait CodeContentUpdate extends js.Object {
    var S3ContentLocationUpdate: js.UndefOr[S3ContentLocationUpdate]
    var TextContentUpdate: js.UndefOr[TextContent]
    var ZipFileContentUpdate: js.UndefOr[ZipFileContent]
  }

  @js.native
  sealed trait ConfigurationType extends js.Any
  object ConfigurationType extends js.Object {
    val DEFAULT = "DEFAULT".asInstanceOf[ConfigurationType]
    val CUSTOM  = "CUSTOM".asInstanceOf[ConfigurationType]

    val values = js.Object.freeze(js.Array(DEFAULT, CUSTOM))
  }

  @js.native
  @Factory
  trait CreateApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var RuntimeEnvironment: RuntimeEnvironment
    var ServiceExecutionRole: RoleARN
    var ApplicationConfiguration: js.UndefOr[ApplicationConfiguration]
    var ApplicationDescription: js.UndefOr[ApplicationDescription]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateApplicationResponse extends js.Object {
    var ApplicationDetail: ApplicationDetail
  }

  @js.native
  @Factory
  trait CreateApplicationSnapshotRequest extends js.Object {
    var ApplicationName: ApplicationName
    var SnapshotName: SnapshotName
  }

  @js.native
  @Factory
  trait CreateApplicationSnapshotResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteApplicationCloudWatchLoggingOptionRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CloudWatchLoggingOptionId: Id
    var CurrentApplicationVersionId: ApplicationVersionId
  }

  @js.native
  @Factory
  trait DeleteApplicationCloudWatchLoggingOptionResponse extends js.Object {
    var ApplicationARN: js.UndefOr[ResourceARN]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var CloudWatchLoggingOptionDescriptions: js.UndefOr[CloudWatchLoggingOptionDescriptions]
  }

  @js.native
  @Factory
  trait DeleteApplicationInputProcessingConfigurationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var InputId: Id
  }

  @js.native
  @Factory
  trait DeleteApplicationInputProcessingConfigurationResponse extends js.Object {
    var ApplicationARN: js.UndefOr[ResourceARN]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
  }

  @js.native
  @Factory
  trait DeleteApplicationOutputRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var OutputId: Id
  }

  @js.native
  @Factory
  trait DeleteApplicationOutputResponse extends js.Object {
    var ApplicationARN: js.UndefOr[ResourceARN]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
  }

  @js.native
  @Factory
  trait DeleteApplicationReferenceDataSourceRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var ReferenceId: Id
  }

  @js.native
  @Factory
  trait DeleteApplicationReferenceDataSourceResponse extends js.Object {
    var ApplicationARN: js.UndefOr[ResourceARN]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
  }

  @js.native
  @Factory
  trait DeleteApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CreateTimestamp: Timestamp
  }

  @js.native
  @Factory
  trait DeleteApplicationResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteApplicationSnapshotRequest extends js.Object {
    var ApplicationName: ApplicationName
    var SnapshotCreationTimestamp: Timestamp
    var SnapshotName: SnapshotName
  }

  @js.native
  @Factory
  trait DeleteApplicationSnapshotResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteApplicationVpcConfigurationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var VpcConfigurationId: Id
  }

  @js.native
  @Factory
  trait DeleteApplicationVpcConfigurationResponse extends js.Object {
    var ApplicationARN: js.UndefOr[ResourceARN]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
  }

  @js.native
  @Factory
  trait DescribeApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var IncludeAdditionalDetails: js.UndefOr[BooleanObject]
  }

  @js.native
  @Factory
  trait DescribeApplicationResponse extends js.Object {
    var ApplicationDetail: ApplicationDetail
  }

  @js.native
  @Factory
  trait DescribeApplicationSnapshotRequest extends js.Object {
    var ApplicationName: ApplicationName
    var SnapshotName: SnapshotName
  }

  @js.native
  @Factory
  trait DescribeApplicationSnapshotResponse extends js.Object {
    var SnapshotDetails: SnapshotDetails
  }

  /**
    * Describes the data format when records are written to the destination in an SQL-based Amazon Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait DestinationSchema extends js.Object {
    var RecordFormatType: RecordFormatType
  }

  @js.native
  @Factory
  trait DiscoverInputSchemaRequest extends js.Object {
    var ServiceExecutionRole: RoleARN
    var InputProcessingConfiguration: js.UndefOr[InputProcessingConfiguration]
    var InputStartingPositionConfiguration: js.UndefOr[InputStartingPositionConfiguration]
    var ResourceARN: js.UndefOr[ResourceARN]
    var S3Configuration: js.UndefOr[S3Configuration]
  }

  @js.native
  @Factory
  trait DiscoverInputSchemaResponse extends js.Object {
    var InputSchema: js.UndefOr[SourceSchema]
    var ParsedInputRecords: js.UndefOr[ParsedInputRecords]
    var ProcessedInputRecords: js.UndefOr[ProcessedInputRecords]
    var RawInputRecords: js.UndefOr[RawInputRecords]
  }

  /**
    * Describes execution properties for a Java-based Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait EnvironmentProperties extends js.Object {
    var PropertyGroups: PropertyGroups
  }

  /**
    * Describes the execution properties for a Java-based Amazon Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait EnvironmentPropertyDescriptions extends js.Object {
    var PropertyGroupDescriptions: js.UndefOr[PropertyGroups]
  }

  /**
    * Describes updates to the execution property groups for a Java-based Amazon Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait EnvironmentPropertyUpdates extends js.Object {
    var PropertyGroups: PropertyGroups
  }

  /**
    * Describes configuration parameters for a Java-based Amazon Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait FlinkApplicationConfiguration extends js.Object {
    var CheckpointConfiguration: js.UndefOr[CheckpointConfiguration]
    var MonitoringConfiguration: js.UndefOr[MonitoringConfiguration]
    var ParallelismConfiguration: js.UndefOr[ParallelismConfiguration]
  }

  /**
    * Describes configuration parameters for a Java-based Amazon Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait FlinkApplicationConfigurationDescription extends js.Object {
    var CheckpointConfigurationDescription: js.UndefOr[CheckpointConfigurationDescription]
    var JobPlanDescription: js.UndefOr[JobPlanDescription]
    var MonitoringConfigurationDescription: js.UndefOr[MonitoringConfigurationDescription]
    var ParallelismConfigurationDescription: js.UndefOr[ParallelismConfigurationDescription]
  }

  /**
    * Describes updates to the configuration parameters for a Java-based Amazon Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait FlinkApplicationConfigurationUpdate extends js.Object {
    var CheckpointConfigurationUpdate: js.UndefOr[CheckpointConfigurationUpdate]
    var MonitoringConfigurationUpdate: js.UndefOr[MonitoringConfigurationUpdate]
    var ParallelismConfigurationUpdate: js.UndefOr[ParallelismConfigurationUpdate]
  }

  /**
    * Describes the starting parameters for an Apache Flink-based Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait FlinkRunConfiguration extends js.Object {
    var AllowNonRestoredState: js.UndefOr[BooleanObject]
  }

  /**
    * When you configure the application input for an SQL-based Amazon Kinesis Data Analytics application, you specify the streaming source, the in-application stream name that is created, and the mapping between the two.
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
    * Describes the application input configuration for an SQL-based Amazon Kinesis Data Analytics application.
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
    * An object that contains the Amazon Resource Name (ARN) of the AWS Lambda function that is used to preprocess records in the stream in an SQL-based Amazon Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait InputLambdaProcessor extends js.Object {
    var ResourceARN: ResourceARN
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, an object that contains the Amazon Resource Name (ARN) of the AWS Lambda function that is used to preprocess records in the stream.
    */
  @js.native
  @Factory
  trait InputLambdaProcessorDescription extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: js.UndefOr[RoleARN]
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, represents an update to the <a>InputLambdaProcessor</a> that is used to preprocess the records in the stream.
    */
  @js.native
  @Factory
  trait InputLambdaProcessorUpdate extends js.Object {
    var ResourceARNUpdate: ResourceARN
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, describes the number of in-application streams to create for a given streaming source.
    */
  @js.native
  @Factory
  trait InputParallelism extends js.Object {
    var Count: js.UndefOr[InputParallelismCount]
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, provides updates to the parallelism count.
    */
  @js.native
  @Factory
  trait InputParallelismUpdate extends js.Object {
    var CountUpdate: InputParallelismCount
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, describes a processor that is used to preprocess the records in the stream before being processed by your application code. Currently, the only input processor available is [[https://aws.amazon.com/documentation/lambda/|AWS Lambda]].
    */
  @js.native
  @Factory
  trait InputProcessingConfiguration extends js.Object {
    var InputLambdaProcessor: InputLambdaProcessor
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, provides the configuration information about an input processor. Currently, the only input processor available is [[https://aws.amazon.com/documentation/lambda/|AWS Lambda]].
    */
  @js.native
  @Factory
  trait InputProcessingConfigurationDescription extends js.Object {
    var InputLambdaProcessorDescription: js.UndefOr[InputLambdaProcessorDescription]
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, describes updates to an <a>InputProcessingConfiguration</a>.
    */
  @js.native
  @Factory
  trait InputProcessingConfigurationUpdate extends js.Object {
    var InputLambdaProcessorUpdate: InputLambdaProcessorUpdate
  }

  /**
    * Describes updates for an SQL-based Amazon Kinesis Data Analytics application's input schema.
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
    * For an SQL-based Amazon Kinesis Data Analytics application, describes updates to a specific input configuration (identified by the <code>InputId</code> of an application).
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
    * For an SQL-based Amazon Kinesis Data Analytics application, provides additional mapping information when JSON is the record format on the streaming source.
    */
  @js.native
  @Factory
  trait JSONMappingParameters extends js.Object {
    var RecordRowPath: RecordRowPath
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, identifies a Kinesis Data Firehose delivery stream as the streaming source. You provide the delivery stream's Amazon Resource Name (ARN).
    */
  @js.native
  @Factory
  trait KinesisFirehoseInput extends js.Object {
    var ResourceARN: ResourceARN
  }

  /**
    * Describes the Amazon Kinesis Data Firehose delivery stream that is configured as the streaming source in the application input configuration.
    */
  @js.native
  @Factory
  trait KinesisFirehoseInputDescription extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: js.UndefOr[RoleARN]
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, when updating application input configuration, provides information about a Kinesis Data Firehose delivery stream as the streaming source.
    */
  @js.native
  @Factory
  trait KinesisFirehoseInputUpdate extends js.Object {
    var ResourceARNUpdate: ResourceARN
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, when configuring application output, identifies a Kinesis Data Firehose delivery stream as the destination. You provide the stream Amazon Resource Name (ARN) of the delivery stream.
    */
  @js.native
  @Factory
  trait KinesisFirehoseOutput extends js.Object {
    var ResourceARN: ResourceARN
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application's output, describes the Kinesis Data Firehose delivery stream that is configured as its destination.
    */
  @js.native
  @Factory
  trait KinesisFirehoseOutputDescription extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: js.UndefOr[RoleARN]
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, when updating an output configuration using the <a>UpdateApplication</a> operation, provides information about a Kinesis Data Firehose delivery stream that is configured as the destination.
    */
  @js.native
  @Factory
  trait KinesisFirehoseOutputUpdate extends js.Object {
    var ResourceARNUpdate: ResourceARN
  }

  /**
    * Identifies an Amazon Kinesis data stream as the streaming source. You provide the stream's Amazon Resource Name (ARN).
    */
  @js.native
  @Factory
  trait KinesisStreamsInput extends js.Object {
    var ResourceARN: ResourceARN
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, describes the Kinesis data stream that is configured as the streaming source in the application input configuration.
    */
  @js.native
  @Factory
  trait KinesisStreamsInputDescription extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: js.UndefOr[RoleARN]
  }

  /**
    * When you update the input configuration for an SQL-based Amazon Kinesis Data Analytics application, provides information about an Amazon Kinesis stream as the streaming source.
    */
  @js.native
  @Factory
  trait KinesisStreamsInputUpdate extends js.Object {
    var ResourceARNUpdate: ResourceARN
  }

  /**
    * When you configure an SQL-based Amazon Kinesis Data Analytics application's output, identifies a Kinesis data stream as the destination. You provide the stream Amazon Resource Name (ARN).
    */
  @js.native
  @Factory
  trait KinesisStreamsOutput extends js.Object {
    var ResourceARN: ResourceARN
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application's output, describes the Kinesis data stream that is configured as its destination.
    */
  @js.native
  @Factory
  trait KinesisStreamsOutputDescription extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: js.UndefOr[RoleARN]
  }

  /**
    * When you update an SQL-based Amazon Kinesis Data Analytics application's output configuration using the <a>UpdateApplication</a> operation, provides information about a Kinesis data stream that is configured as the destination.
    */
  @js.native
  @Factory
  trait KinesisStreamsOutputUpdate extends js.Object {
    var ResourceARNUpdate: ResourceARN
  }

  /**
    * When you configure an SQL-based Amazon Kinesis Data Analytics application's output, identifies an AWS Lambda function as the destination. You provide the function Amazon Resource Name (ARN) of the Lambda function.
    */
  @js.native
  @Factory
  trait LambdaOutput extends js.Object {
    var ResourceARN: ResourceARN
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application output, describes the AWS Lambda function that is configured as its destination.
    */
  @js.native
  @Factory
  trait LambdaOutputDescription extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: js.UndefOr[RoleARN]
  }

  /**
    * When you update an SQL-based Amazon Kinesis Data Analytics application's output configuration using the <a>UpdateApplication</a> operation, provides information about an AWS Lambda function that is configured as the destination.
    */
  @js.native
  @Factory
  trait LambdaOutputUpdate extends js.Object {
    var ResourceARNUpdate: ResourceARN
  }

  @js.native
  @Factory
  trait ListApplicationSnapshotsRequest extends js.Object {
    var ApplicationName: ApplicationName
    var Limit: js.UndefOr[ListSnapshotsInputLimit]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListApplicationSnapshotsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SnapshotSummaries: js.UndefOr[SnapshotSummaries]
  }

  @js.native
  @Factory
  trait ListApplicationsRequest extends js.Object {
    var Limit: js.UndefOr[ListApplicationsInputLimit]
    var NextToken: js.UndefOr[ApplicationName]
  }

  @js.native
  @Factory
  trait ListApplicationsResponse extends js.Object {
    var ApplicationSummaries: ApplicationSummaries
    var NextToken: js.UndefOr[ApplicationName]
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

  @js.native
  sealed trait LogLevel extends js.Any
  object LogLevel extends js.Object {
    val INFO  = "INFO".asInstanceOf[LogLevel]
    val WARN  = "WARN".asInstanceOf[LogLevel]
    val ERROR = "ERROR".asInstanceOf[LogLevel]
    val DEBUG = "DEBUG".asInstanceOf[LogLevel]

    val values = js.Object.freeze(js.Array(INFO, WARN, ERROR, DEBUG))
  }

  /**
    * When you configure an SQL-based Amazon Kinesis Data Analytics application's input at the time of creating or updating an application, provides additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
    */
  @js.native
  @Factory
  trait MappingParameters extends js.Object {
    var CSVMappingParameters: js.UndefOr[CSVMappingParameters]
    var JSONMappingParameters: js.UndefOr[JSONMappingParameters]
  }

  @js.native
  sealed trait MetricsLevel extends js.Any
  object MetricsLevel extends js.Object {
    val APPLICATION = "APPLICATION".asInstanceOf[MetricsLevel]
    val TASK        = "TASK".asInstanceOf[MetricsLevel]
    val OPERATOR    = "OPERATOR".asInstanceOf[MetricsLevel]
    val PARALLELISM = "PARALLELISM".asInstanceOf[MetricsLevel]

    val values = js.Object.freeze(js.Array(APPLICATION, TASK, OPERATOR, PARALLELISM))
  }

  /**
    * Describes configuration parameters for Amazon CloudWatch logging for a Java-based Kinesis Data Analytics application. For more information about CloudWatch logging, see [[https://docs.aws.amazon.com/kinesisanalytics/latest/java/monitoring-overview.html|Monitoring]].
    */
  @js.native
  @Factory
  trait MonitoringConfiguration extends js.Object {
    var ConfigurationType: ConfigurationType
    var LogLevel: js.UndefOr[LogLevel]
    var MetricsLevel: js.UndefOr[MetricsLevel]
  }

  /**
    * Describes configuration parameters for CloudWatch logging for a Java-based Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait MonitoringConfigurationDescription extends js.Object {
    var ConfigurationType: js.UndefOr[ConfigurationType]
    var LogLevel: js.UndefOr[LogLevel]
    var MetricsLevel: js.UndefOr[MetricsLevel]
  }

  /**
    * Describes updates to configuration parameters for Amazon CloudWatch logging for a Java-based Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait MonitoringConfigurationUpdate extends js.Object {
    var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType]
    var LogLevelUpdate: js.UndefOr[LogLevel]
    var MetricsLevelUpdate: js.UndefOr[MetricsLevel]
  }

  /**
    * Describes an SQL-based Amazon Kinesis Data Analytics application's output configuration, in which you identify an in-application stream and a destination where you want the in-application stream data to be written. The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
    *  <p/>
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
    * For an SQL-based Amazon Kinesis Data Analytics application, describes the application output configuration, which includes the in-application stream name and the destination where the stream data is written. The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
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
    * For an SQL-based Amazon Kinesis Data Analytics application, describes updates to the output configuration identified by the <code>OutputId</code>.
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
    * Describes parameters for how a Java-based Amazon Kinesis Data Analytics application executes multiple tasks simultaneously. For more information about parallelism, see [[https://ci.apache.org/projects/flink/flink-docs-stable/dev/parallel.html|Parallel Execution]] in the [[https://ci.apache.org/projects/flink/flink-docs-release-1.6/|Apache Flink Documentation]].
    */
  @js.native
  @Factory
  trait ParallelismConfiguration extends js.Object {
    var ConfigurationType: ConfigurationType
    var AutoScalingEnabled: js.UndefOr[BooleanObject]
    var Parallelism: js.UndefOr[Parallelism]
    var ParallelismPerKPU: js.UndefOr[ParallelismPerKPU]
  }

  /**
    * Describes parameters for how a Java-based Kinesis Data Analytics application executes multiple tasks simultaneously.
    */
  @js.native
  @Factory
  trait ParallelismConfigurationDescription extends js.Object {
    var AutoScalingEnabled: js.UndefOr[BooleanObject]
    var ConfigurationType: js.UndefOr[ConfigurationType]
    var CurrentParallelism: js.UndefOr[Parallelism]
    var Parallelism: js.UndefOr[Parallelism]
    var ParallelismPerKPU: js.UndefOr[ParallelismPerKPU]
  }

  /**
    * Describes updates to parameters for how a Java-based Kinesis Data Analytics application executes multiple tasks simultaneously.
    */
  @js.native
  @Factory
  trait ParallelismConfigurationUpdate extends js.Object {
    var AutoScalingEnabledUpdate: js.UndefOr[BooleanObject]
    var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType]
    var ParallelismPerKPUUpdate: js.UndefOr[ParallelismPerKPU]
    var ParallelismUpdate: js.UndefOr[Parallelism]
  }

  /**
    * Property key-value pairs passed into a Java-based Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait PropertyGroup extends js.Object {
    var PropertyGroupId: Id
    var PropertyMap: PropertyMap
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, describes the mapping of each data element in the streaming source to the corresponding column in the in-application stream.
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
    * For an SQL-based Amazon Kinesis Data Analytics application, describes the record format and relevant mapping information that should be applied to schematize the records on the stream.
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
    * For an SQL-based Amazon Kinesis Data Analytics application, describes the reference data source by providing the source information (Amazon S3 bucket name and object key name), the resulting in-application table name that is created, and the necessary schema to map the data elements in the Amazon S3 object to the in-application table.
    */
  @js.native
  @Factory
  trait ReferenceDataSource extends js.Object {
    var ReferenceSchema: SourceSchema
    var TableName: InAppTableName
    var S3ReferenceDataSource: js.UndefOr[S3ReferenceDataSource]
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, describes the reference data source configured for an application.
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
    * When you update a reference data source configuration for a SQL-based Amazon Kinesis Data Analytics application, this object provides all the updated values (such as the source bucket name and object key name), the in-application table name that is created, and updated mapping information that maps the data in the Amazon S3 object to the in-application reference table that is created.
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
    * Describes the starting parameters for an Amazon Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait RunConfiguration extends js.Object {
    var ApplicationRestoreConfiguration: js.UndefOr[ApplicationRestoreConfiguration]
    var FlinkRunConfiguration: js.UndefOr[FlinkRunConfiguration]
    var SqlRunConfigurations: js.UndefOr[SqlRunConfigurations]
  }

  /**
    * Describes the starting properties for a Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait RunConfigurationDescription extends js.Object {
    var ApplicationRestoreConfigurationDescription: js.UndefOr[ApplicationRestoreConfiguration]
  }

  /**
    * Describes the updates to the starting parameters for a Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait RunConfigurationUpdate extends js.Object {
    var ApplicationRestoreConfiguration: js.UndefOr[ApplicationRestoreConfiguration]
    var FlinkRunConfiguration: js.UndefOr[FlinkRunConfiguration]
  }

  @js.native
  sealed trait RuntimeEnvironment extends js.Any
  object RuntimeEnvironment extends js.Object {
    val `SQL-1_0`   = "SQL-1_0".asInstanceOf[RuntimeEnvironment]
    val `FLINK-1_6` = "FLINK-1_6".asInstanceOf[RuntimeEnvironment]
    val `FLINK-1_8` = "FLINK-1_8".asInstanceOf[RuntimeEnvironment]

    val values = js.Object.freeze(js.Array(`SQL-1_0`, `FLINK-1_6`, `FLINK-1_8`))
  }

  /**
    * Describes the location of a Java-based Amazon Kinesis Data Analytics application's code stored in an S3 bucket.
    */
  @js.native
  @Factory
  trait S3ApplicationCodeLocationDescription extends js.Object {
    var BucketARN: BucketARN
    var FileKey: FileKey
    var ObjectVersion: js.UndefOr[ObjectVersion]
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, provides a description of an Amazon S3 data source, including the Amazon Resource Name (ARN) of the S3 bucket and the name of the Amazon S3 object that contains the data.
    */
  @js.native
  @Factory
  trait S3Configuration extends js.Object {
    var BucketARN: BucketARN
    var FileKey: FileKey
  }

  /**
    * For a Java-based Amazon Kinesis Data Analytics application, provides a description of an Amazon S3 object, including the Amazon Resource Name (ARN) of the S3 bucket, the name of the Amazon S3 object that contains the data, and the version number of the Amazon S3 object that contains the data.
    */
  @js.native
  @Factory
  trait S3ContentLocation extends js.Object {
    var BucketARN: BucketARN
    var FileKey: FileKey
    var ObjectVersion: js.UndefOr[ObjectVersion]
  }

  /**
    * Describes an update for the Amazon S3 code content location for a Java-based Amazon Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait S3ContentLocationUpdate extends js.Object {
    var BucketARNUpdate: js.UndefOr[BucketARN]
    var FileKeyUpdate: js.UndefOr[FileKey]
    var ObjectVersionUpdate: js.UndefOr[ObjectVersion]
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, identifies the Amazon S3 bucket and object that contains the reference data.
    *  A Kinesis Data Analytics application loads reference data only once. If the data changes, you call the <a>UpdateApplication</a> operation to trigger reloading of data into your application.
    */
  @js.native
  @Factory
  trait S3ReferenceDataSource extends js.Object {
    var BucketARN: js.UndefOr[BucketARN]
    var FileKey: js.UndefOr[FileKey]
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, provides the bucket name and object key name that stores the reference data.
    */
  @js.native
  @Factory
  trait S3ReferenceDataSourceDescription extends js.Object {
    var BucketARN: BucketARN
    var FileKey: FileKey
    var ReferenceRoleARN: js.UndefOr[RoleARN]
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, describes the Amazon S3 bucket name and object key name for an in-application reference table.
    */
  @js.native
  @Factory
  trait S3ReferenceDataSourceUpdate extends js.Object {
    var BucketARNUpdate: js.UndefOr[BucketARN]
    var FileKeyUpdate: js.UndefOr[FileKey]
  }

  /**
    * Provides details about a snapshot of application state.
    */
  @js.native
  @Factory
  trait SnapshotDetails extends js.Object {
    var ApplicationVersionId: ApplicationVersionId
    var SnapshotName: SnapshotName
    var SnapshotStatus: SnapshotStatus
    var SnapshotCreationTimestamp: js.UndefOr[Timestamp]
  }

  @js.native
  sealed trait SnapshotStatus extends js.Any
  object SnapshotStatus extends js.Object {
    val CREATING = "CREATING".asInstanceOf[SnapshotStatus]
    val READY    = "READY".asInstanceOf[SnapshotStatus]
    val DELETING = "DELETING".asInstanceOf[SnapshotStatus]
    val FAILED   = "FAILED".asInstanceOf[SnapshotStatus]

    val values = js.Object.freeze(js.Array(CREATING, READY, DELETING, FAILED))
  }

  /**
    * For an SQL-based Amazon Kinesis Data Analytics application, describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.
    */
  @js.native
  @Factory
  trait SourceSchema extends js.Object {
    var RecordColumns: RecordColumns
    var RecordFormat: RecordFormat
    var RecordEncoding: js.UndefOr[RecordEncoding]
  }

  /**
    * Describes the inputs, outputs, and reference data sources for an SQL-based Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait SqlApplicationConfiguration extends js.Object {
    var Inputs: js.UndefOr[Inputs]
    var Outputs: js.UndefOr[Outputs]
    var ReferenceDataSources: js.UndefOr[ReferenceDataSources]
  }

  /**
    * Describes the inputs, outputs, and reference data sources for an SQL-based Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait SqlApplicationConfigurationDescription extends js.Object {
    var InputDescriptions: js.UndefOr[InputDescriptions]
    var OutputDescriptions: js.UndefOr[OutputDescriptions]
    var ReferenceDataSourceDescriptions: js.UndefOr[ReferenceDataSourceDescriptions]
  }

  /**
    * Describes updates to the input streams, destination streams, and reference data sources for an SQL-based Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait SqlApplicationConfigurationUpdate extends js.Object {
    var InputUpdates: js.UndefOr[InputUpdates]
    var OutputUpdates: js.UndefOr[OutputUpdates]
    var ReferenceDataSourceUpdates: js.UndefOr[ReferenceDataSourceUpdates]
  }

  /**
    * Describes the starting parameters for an SQL-based Kinesis Data Analytics application.
    */
  @js.native
  @Factory
  trait SqlRunConfiguration extends js.Object {
    var InputId: Id
    var InputStartingPositionConfiguration: InputStartingPositionConfiguration
  }

  @js.native
  @Factory
  trait StartApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var RunConfiguration: RunConfiguration
  }

  @js.native
  @Factory
  trait StartApplicationResponse extends js.Object {}

  @js.native
  @Factory
  trait StopApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
  }

  @js.native
  @Factory
  trait StopApplicationResponse extends js.Object {}

  /**
    * A key-value pair (the value is optional) that you can define and assign to AWS resources. If you specify a tag that already exists, the tag value is replaced with the value that you specify in the request. Note that the maximum number of application tags includes system tags. The maximum number of user-defined application tags is 50. For more information, see [[https://docs.aws.amazon.com/kinesisanalytics/latest/java/how-tagging.html|Using Tagging]].
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
    var CurrentApplicationVersionId: ApplicationVersionId
    var ApplicationConfigurationUpdate: js.UndefOr[ApplicationConfigurationUpdate]
    var CloudWatchLoggingOptionUpdates: js.UndefOr[CloudWatchLoggingOptionUpdates]
    var RunConfigurationUpdate: js.UndefOr[RunConfigurationUpdate]
    var ServiceExecutionRoleUpdate: js.UndefOr[RoleARN]
  }

  @js.native
  @Factory
  trait UpdateApplicationResponse extends js.Object {
    var ApplicationDetail: ApplicationDetail
  }

  /**
    * Describes the parameters of a VPC used by the application.
    */
  @js.native
  @Factory
  trait VpcConfiguration extends js.Object {
    var SecurityGroupIds: SecurityGroupIds
    var SubnetIds: SubnetIds
  }

  /**
    * Describes the parameters of a VPC used by the application.
    */
  @js.native
  @Factory
  trait VpcConfigurationDescription extends js.Object {
    var SecurityGroupIds: SecurityGroupIds
    var SubnetIds: SubnetIds
    var VpcConfigurationId: Id
    var VpcId: VpcId
  }

  /**
    * Describes updates to the VPC configuration used by the application.
    */
  @js.native
  @Factory
  trait VpcConfigurationUpdate extends js.Object {
    var VpcConfigurationId: Id
    var SecurityGroupIdUpdates: js.UndefOr[SecurityGroupIds]
    var SubnetIdUpdates: js.UndefOr[SubnetIds]
  }
}
