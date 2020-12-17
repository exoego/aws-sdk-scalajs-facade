package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object mwaa {
  type AirflowConfigurationOptions = js.Dictionary[ConfigValue]
  type AirflowVersion = String
  type CloudWatchLogGroupArn = String
  type ConfigKey = String
  type ConfigValue = String
  type CreatedAt = js.Date
  type Dimensions = js.Array[Dimension]
  type EnvironmentArn = String
  type EnvironmentClass = String
  type EnvironmentList = js.Array[EnvironmentName]
  type EnvironmentName = String
  type ErrorCode = String
  type ErrorMessage = String
  type Hostname = String
  type IamRoleArn = String
  type KmsKey = String
  type ListEnvironmentsInputMaxResultsInteger = Int
  type LoggingEnabled = Boolean
  type MaxWorkers = Int
  type MetricData = js.Array[MetricDatum]
  type NextToken = String
  type RelativePath = String
  type S3BucketArn = String
  type S3ObjectVersion = String
  type SecurityGroupId = String
  type SecurityGroupList = js.Array[SecurityGroupId]
  type SubnetId = String
  type SubnetList = js.Array[SubnetId]
  type SyntheticCreateCliTokenResponseToken = String
  type SyntheticCreateEnvironmentInputAirflowConfigurationOptions = js.Dictionary[ConfigValue]
  type SyntheticCreateWebLoginTokenResponseToken = String
  type SyntheticUpdateEnvironmentInputAirflowConfigurationOptions = js.Dictionary[ConfigValue]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Timestamp = js.Date
  type UpdateCreatedAt = js.Date
  type WebserverUrl = String
  type WeeklyMaintenanceWindowStart = String

  implicit final class MWAAOps(private val service: MWAA) extends AnyVal {

    @inline def createCliTokenFuture(params: CreateCliTokenRequest): Future[CreateCliTokenResponse] = service.createCliToken(params).promise().toFuture
    @inline def createEnvironmentFuture(params: CreateEnvironmentInput): Future[CreateEnvironmentOutput] = service.createEnvironment(params).promise().toFuture
    @inline def createWebLoginTokenFuture(params: CreateWebLoginTokenRequest): Future[CreateWebLoginTokenResponse] = service.createWebLoginToken(params).promise().toFuture
    @inline def deleteEnvironmentFuture(params: DeleteEnvironmentInput): Future[DeleteEnvironmentOutput] = service.deleteEnvironment(params).promise().toFuture
    @inline def getEnvironmentFuture(params: GetEnvironmentInput): Future[GetEnvironmentOutput] = service.getEnvironment(params).promise().toFuture
    @inline def listEnvironmentsFuture(params: ListEnvironmentsInput): Future[ListEnvironmentsOutput] = service.listEnvironments(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] = service.listTagsForResource(params).promise().toFuture
    @inline def publishMetricsFuture(params: PublishMetricsInput): Future[PublishMetricsOutput] = service.publishMetrics(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] = service.untagResource(params).promise().toFuture
    @inline def updateEnvironmentFuture(params: UpdateEnvironmentInput): Future[UpdateEnvironmentOutput] = service.updateEnvironment(params).promise().toFuture

  }
}

package mwaa {
  @js.native
  @JSImport("aws-sdk/clients/mwaa", JSImport.Namespace, "AWS.MWAA")
  class MWAA() extends js.Object {
    def this(config: AWSConfig) = this()

    def createCliToken(params: CreateCliTokenRequest): Request[CreateCliTokenResponse] = js.native
    def createEnvironment(params: CreateEnvironmentInput): Request[CreateEnvironmentOutput] = js.native
    def createWebLoginToken(params: CreateWebLoginTokenRequest): Request[CreateWebLoginTokenResponse] = js.native
    def deleteEnvironment(params: DeleteEnvironmentInput): Request[DeleteEnvironmentOutput] = js.native
    def getEnvironment(params: GetEnvironmentInput): Request[GetEnvironmentOutput] = js.native
    def listEnvironments(params: ListEnvironmentsInput): Request[ListEnvironmentsOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def publishMetrics(params: PublishMetricsInput): Request[PublishMetricsOutput] = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput] = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput] = js.native
    def updateEnvironment(params: UpdateEnvironmentInput): Request[UpdateEnvironmentOutput] = js.native
  }

  @js.native
  trait CreateCliTokenRequest extends js.Object {
    var Name: EnvironmentName
  }

  object CreateCliTokenRequest {
    @inline
    def apply(
        Name: EnvironmentName
    ): CreateCliTokenRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateCliTokenRequest]
    }
  }

  @js.native
  trait CreateCliTokenResponse extends js.Object {
    var CliToken: js.UndefOr[SyntheticCreateCliTokenResponseToken]
    var WebServerHostname: js.UndefOr[Hostname]
  }

  object CreateCliTokenResponse {
    @inline
    def apply(
        CliToken: js.UndefOr[SyntheticCreateCliTokenResponseToken] = js.undefined,
        WebServerHostname: js.UndefOr[Hostname] = js.undefined
    ): CreateCliTokenResponse = {
      val __obj = js.Dynamic.literal()
      CliToken.foreach(__v => __obj.updateDynamic("CliToken")(__v.asInstanceOf[js.Any]))
      WebServerHostname.foreach(__v => __obj.updateDynamic("WebServerHostname")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCliTokenResponse]
    }
  }

  /** This section contains the Amazon Managed Workflows for Apache Airflow (MWAA) API reference documentation to create an environment. For more information, see [[https://docs.aws.amazon.com/mwaa/latest/userguide/get-started.html|Get started with Amazon Managed Workflows for Apache Airflow]].
    */
  @js.native
  trait CreateEnvironmentInput extends js.Object {
    var DagS3Path: RelativePath
    var ExecutionRoleArn: IamRoleArn
    var Name: EnvironmentName
    var NetworkConfiguration: NetworkConfiguration
    var SourceBucketArn: S3BucketArn
    var AirflowConfigurationOptions: js.UndefOr[SyntheticCreateEnvironmentInputAirflowConfigurationOptions]
    var AirflowVersion: js.UndefOr[AirflowVersion]
    var EnvironmentClass: js.UndefOr[EnvironmentClass]
    var KmsKey: js.UndefOr[KmsKey]
    var LoggingConfiguration: js.UndefOr[LoggingConfigurationInput]
    var MaxWorkers: js.UndefOr[MaxWorkers]
    var PluginsS3ObjectVersion: js.UndefOr[S3ObjectVersion]
    var PluginsS3Path: js.UndefOr[RelativePath]
    var RequirementsS3ObjectVersion: js.UndefOr[S3ObjectVersion]
    var RequirementsS3Path: js.UndefOr[RelativePath]
    var Tags: js.UndefOr[TagMap]
    var WebserverAccessMode: js.UndefOr[WebserverAccessMode]
    var WeeklyMaintenanceWindowStart: js.UndefOr[WeeklyMaintenanceWindowStart]
  }

  object CreateEnvironmentInput {
    @inline
    def apply(
        DagS3Path: RelativePath,
        ExecutionRoleArn: IamRoleArn,
        Name: EnvironmentName,
        NetworkConfiguration: NetworkConfiguration,
        SourceBucketArn: S3BucketArn,
        AirflowConfigurationOptions: js.UndefOr[SyntheticCreateEnvironmentInputAirflowConfigurationOptions] = js.undefined,
        AirflowVersion: js.UndefOr[AirflowVersion] = js.undefined,
        EnvironmentClass: js.UndefOr[EnvironmentClass] = js.undefined,
        KmsKey: js.UndefOr[KmsKey] = js.undefined,
        LoggingConfiguration: js.UndefOr[LoggingConfigurationInput] = js.undefined,
        MaxWorkers: js.UndefOr[MaxWorkers] = js.undefined,
        PluginsS3ObjectVersion: js.UndefOr[S3ObjectVersion] = js.undefined,
        PluginsS3Path: js.UndefOr[RelativePath] = js.undefined,
        RequirementsS3ObjectVersion: js.UndefOr[S3ObjectVersion] = js.undefined,
        RequirementsS3Path: js.UndefOr[RelativePath] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        WebserverAccessMode: js.UndefOr[WebserverAccessMode] = js.undefined,
        WeeklyMaintenanceWindowStart: js.UndefOr[WeeklyMaintenanceWindowStart] = js.undefined
    ): CreateEnvironmentInput = {
      val __obj = js.Dynamic.literal(
        "DagS3Path" -> DagS3Path.asInstanceOf[js.Any],
        "ExecutionRoleArn" -> ExecutionRoleArn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "NetworkConfiguration" -> NetworkConfiguration.asInstanceOf[js.Any],
        "SourceBucketArn" -> SourceBucketArn.asInstanceOf[js.Any]
      )

      AirflowConfigurationOptions.foreach(__v => __obj.updateDynamic("AirflowConfigurationOptions")(__v.asInstanceOf[js.Any]))
      AirflowVersion.foreach(__v => __obj.updateDynamic("AirflowVersion")(__v.asInstanceOf[js.Any]))
      EnvironmentClass.foreach(__v => __obj.updateDynamic("EnvironmentClass")(__v.asInstanceOf[js.Any]))
      KmsKey.foreach(__v => __obj.updateDynamic("KmsKey")(__v.asInstanceOf[js.Any]))
      LoggingConfiguration.foreach(__v => __obj.updateDynamic("LoggingConfiguration")(__v.asInstanceOf[js.Any]))
      MaxWorkers.foreach(__v => __obj.updateDynamic("MaxWorkers")(__v.asInstanceOf[js.Any]))
      PluginsS3ObjectVersion.foreach(__v => __obj.updateDynamic("PluginsS3ObjectVersion")(__v.asInstanceOf[js.Any]))
      PluginsS3Path.foreach(__v => __obj.updateDynamic("PluginsS3Path")(__v.asInstanceOf[js.Any]))
      RequirementsS3ObjectVersion.foreach(__v => __obj.updateDynamic("RequirementsS3ObjectVersion")(__v.asInstanceOf[js.Any]))
      RequirementsS3Path.foreach(__v => __obj.updateDynamic("RequirementsS3Path")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      WebserverAccessMode.foreach(__v => __obj.updateDynamic("WebserverAccessMode")(__v.asInstanceOf[js.Any]))
      WeeklyMaintenanceWindowStart.foreach(__v => __obj.updateDynamic("WeeklyMaintenanceWindowStart")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEnvironmentInput]
    }
  }

  @js.native
  trait CreateEnvironmentOutput extends js.Object {
    var Arn: js.UndefOr[EnvironmentArn]
  }

  object CreateEnvironmentOutput {
    @inline
    def apply(
        Arn: js.UndefOr[EnvironmentArn] = js.undefined
    ): CreateEnvironmentOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEnvironmentOutput]
    }
  }

  @js.native
  trait CreateWebLoginTokenRequest extends js.Object {
    var Name: EnvironmentName
  }

  object CreateWebLoginTokenRequest {
    @inline
    def apply(
        Name: EnvironmentName
    ): CreateWebLoginTokenRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateWebLoginTokenRequest]
    }
  }

  @js.native
  trait CreateWebLoginTokenResponse extends js.Object {
    var WebServerHostname: js.UndefOr[Hostname]
    var WebToken: js.UndefOr[SyntheticCreateWebLoginTokenResponseToken]
  }

  object CreateWebLoginTokenResponse {
    @inline
    def apply(
        WebServerHostname: js.UndefOr[Hostname] = js.undefined,
        WebToken: js.UndefOr[SyntheticCreateWebLoginTokenResponseToken] = js.undefined
    ): CreateWebLoginTokenResponse = {
      val __obj = js.Dynamic.literal()
      WebServerHostname.foreach(__v => __obj.updateDynamic("WebServerHostname")(__v.asInstanceOf[js.Any]))
      WebToken.foreach(__v => __obj.updateDynamic("WebToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWebLoginTokenResponse]
    }
  }

  @js.native
  trait DeleteEnvironmentInput extends js.Object {
    var Name: EnvironmentName
  }

  object DeleteEnvironmentInput {
    @inline
    def apply(
        Name: EnvironmentName
    ): DeleteEnvironmentInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEnvironmentInput]
    }
  }

  @js.native
  trait DeleteEnvironmentOutput extends js.Object

  object DeleteEnvironmentOutput {
    @inline
    def apply(): DeleteEnvironmentOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteEnvironmentOutput]
    }
  }

  /** Internal only API.
    */
  @js.native
  trait Dimension extends js.Object {
    var Name: String
    var Value: String
  }

  object Dimension {
    @inline
    def apply(
        Name: String,
        Value: String
    ): Dimension = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Dimension]
    }
  }

  /** An Amazon MWAA environment.
    */
  @js.native
  trait Environment extends js.Object {
    var AirflowConfigurationOptions: js.UndefOr[AirflowConfigurationOptions]
    var AirflowVersion: js.UndefOr[AirflowVersion]
    var Arn: js.UndefOr[EnvironmentArn]
    var CreatedAt: js.UndefOr[CreatedAt]
    var DagS3Path: js.UndefOr[RelativePath]
    var EnvironmentClass: js.UndefOr[EnvironmentClass]
    var ExecutionRoleArn: js.UndefOr[IamRoleArn]
    var KmsKey: js.UndefOr[KmsKey]
    var LastUpdate: js.UndefOr[LastUpdate]
    var LoggingConfiguration: js.UndefOr[LoggingConfiguration]
    var MaxWorkers: js.UndefOr[MaxWorkers]
    var Name: js.UndefOr[EnvironmentName]
    var NetworkConfiguration: js.UndefOr[NetworkConfiguration]
    var PluginsS3ObjectVersion: js.UndefOr[S3ObjectVersion]
    var PluginsS3Path: js.UndefOr[RelativePath]
    var RequirementsS3ObjectVersion: js.UndefOr[S3ObjectVersion]
    var RequirementsS3Path: js.UndefOr[RelativePath]
    var ServiceRoleArn: js.UndefOr[IamRoleArn]
    var SourceBucketArn: js.UndefOr[S3BucketArn]
    var Status: js.UndefOr[EnvironmentStatus]
    var Tags: js.UndefOr[TagMap]
    var WebserverAccessMode: js.UndefOr[WebserverAccessMode]
    var WebserverUrl: js.UndefOr[WebserverUrl]
    var WeeklyMaintenanceWindowStart: js.UndefOr[WeeklyMaintenanceWindowStart]
  }

  object Environment {
    @inline
    def apply(
        AirflowConfigurationOptions: js.UndefOr[AirflowConfigurationOptions] = js.undefined,
        AirflowVersion: js.UndefOr[AirflowVersion] = js.undefined,
        Arn: js.UndefOr[EnvironmentArn] = js.undefined,
        CreatedAt: js.UndefOr[CreatedAt] = js.undefined,
        DagS3Path: js.UndefOr[RelativePath] = js.undefined,
        EnvironmentClass: js.UndefOr[EnvironmentClass] = js.undefined,
        ExecutionRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        KmsKey: js.UndefOr[KmsKey] = js.undefined,
        LastUpdate: js.UndefOr[LastUpdate] = js.undefined,
        LoggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined,
        MaxWorkers: js.UndefOr[MaxWorkers] = js.undefined,
        Name: js.UndefOr[EnvironmentName] = js.undefined,
        NetworkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
        PluginsS3ObjectVersion: js.UndefOr[S3ObjectVersion] = js.undefined,
        PluginsS3Path: js.UndefOr[RelativePath] = js.undefined,
        RequirementsS3ObjectVersion: js.UndefOr[S3ObjectVersion] = js.undefined,
        RequirementsS3Path: js.UndefOr[RelativePath] = js.undefined,
        ServiceRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        SourceBucketArn: js.UndefOr[S3BucketArn] = js.undefined,
        Status: js.UndefOr[EnvironmentStatus] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        WebserverAccessMode: js.UndefOr[WebserverAccessMode] = js.undefined,
        WebserverUrl: js.UndefOr[WebserverUrl] = js.undefined,
        WeeklyMaintenanceWindowStart: js.UndefOr[WeeklyMaintenanceWindowStart] = js.undefined
    ): Environment = {
      val __obj = js.Dynamic.literal()
      AirflowConfigurationOptions.foreach(__v => __obj.updateDynamic("AirflowConfigurationOptions")(__v.asInstanceOf[js.Any]))
      AirflowVersion.foreach(__v => __obj.updateDynamic("AirflowVersion")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DagS3Path.foreach(__v => __obj.updateDynamic("DagS3Path")(__v.asInstanceOf[js.Any]))
      EnvironmentClass.foreach(__v => __obj.updateDynamic("EnvironmentClass")(__v.asInstanceOf[js.Any]))
      ExecutionRoleArn.foreach(__v => __obj.updateDynamic("ExecutionRoleArn")(__v.asInstanceOf[js.Any]))
      KmsKey.foreach(__v => __obj.updateDynamic("KmsKey")(__v.asInstanceOf[js.Any]))
      LastUpdate.foreach(__v => __obj.updateDynamic("LastUpdate")(__v.asInstanceOf[js.Any]))
      LoggingConfiguration.foreach(__v => __obj.updateDynamic("LoggingConfiguration")(__v.asInstanceOf[js.Any]))
      MaxWorkers.foreach(__v => __obj.updateDynamic("MaxWorkers")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NetworkConfiguration.foreach(__v => __obj.updateDynamic("NetworkConfiguration")(__v.asInstanceOf[js.Any]))
      PluginsS3ObjectVersion.foreach(__v => __obj.updateDynamic("PluginsS3ObjectVersion")(__v.asInstanceOf[js.Any]))
      PluginsS3Path.foreach(__v => __obj.updateDynamic("PluginsS3Path")(__v.asInstanceOf[js.Any]))
      RequirementsS3ObjectVersion.foreach(__v => __obj.updateDynamic("RequirementsS3ObjectVersion")(__v.asInstanceOf[js.Any]))
      RequirementsS3Path.foreach(__v => __obj.updateDynamic("RequirementsS3Path")(__v.asInstanceOf[js.Any]))
      ServiceRoleArn.foreach(__v => __obj.updateDynamic("ServiceRoleArn")(__v.asInstanceOf[js.Any]))
      SourceBucketArn.foreach(__v => __obj.updateDynamic("SourceBucketArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      WebserverAccessMode.foreach(__v => __obj.updateDynamic("WebserverAccessMode")(__v.asInstanceOf[js.Any]))
      WebserverUrl.foreach(__v => __obj.updateDynamic("WebserverUrl")(__v.asInstanceOf[js.Any]))
      WeeklyMaintenanceWindowStart.foreach(__v => __obj.updateDynamic("WeeklyMaintenanceWindowStart")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Environment]
    }
  }

  @js.native
  sealed trait EnvironmentStatus extends js.Any
  object EnvironmentStatus {
    val CREATING = "CREATING".asInstanceOf[EnvironmentStatus]
    val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[EnvironmentStatus]
    val AVAILABLE = "AVAILABLE".asInstanceOf[EnvironmentStatus]
    val UPDATING = "UPDATING".asInstanceOf[EnvironmentStatus]
    val DELETING = "DELETING".asInstanceOf[EnvironmentStatus]
    val DELETED = "DELETED".asInstanceOf[EnvironmentStatus]

    @inline def values = js.Array(CREATING, CREATE_FAILED, AVAILABLE, UPDATING, DELETING, DELETED)
  }

  @js.native
  trait GetEnvironmentInput extends js.Object {
    var Name: EnvironmentName
  }

  object GetEnvironmentInput {
    @inline
    def apply(
        Name: EnvironmentName
    ): GetEnvironmentInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEnvironmentInput]
    }
  }

  @js.native
  trait GetEnvironmentOutput extends js.Object {
    var Environment: js.UndefOr[Environment]
  }

  object GetEnvironmentOutput {
    @inline
    def apply(
        Environment: js.UndefOr[Environment] = js.undefined
    ): GetEnvironmentOutput = {
      val __obj = js.Dynamic.literal()
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEnvironmentOutput]
    }
  }

  /** Last update information for the environment.
    */
  @js.native
  trait LastUpdate extends js.Object {
    var CreatedAt: js.UndefOr[UpdateCreatedAt]
    var Error: js.UndefOr[UpdateError]
    var Status: js.UndefOr[UpdateStatus]
  }

  object LastUpdate {
    @inline
    def apply(
        CreatedAt: js.UndefOr[UpdateCreatedAt] = js.undefined,
        Error: js.UndefOr[UpdateError] = js.undefined,
        Status: js.UndefOr[UpdateStatus] = js.undefined
    ): LastUpdate = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LastUpdate]
    }
  }

  @js.native
  trait ListEnvironmentsInput extends js.Object {
    var MaxResults: js.UndefOr[ListEnvironmentsInputMaxResultsInteger]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEnvironmentsInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListEnvironmentsInputMaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEnvironmentsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentsInput]
    }
  }

  @js.native
  trait ListEnvironmentsOutput extends js.Object {
    var Environments: EnvironmentList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEnvironmentsOutput {
    @inline
    def apply(
        Environments: EnvironmentList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEnvironmentsOutput = {
      val __obj = js.Dynamic.literal(
        "Environments" -> Environments.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentsOutput]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var ResourceArn: EnvironmentArn
  }

  object ListTagsForResourceInput {
    @inline
    def apply(
        ResourceArn: EnvironmentArn
    ): ListTagsForResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceOutput {
    @inline
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
    }
  }

  /** The Logging Configuration of your Amazon MWAA environment.
    */
  @js.native
  trait LoggingConfiguration extends js.Object {
    var DagProcessingLogs: js.UndefOr[ModuleLoggingConfiguration]
    var SchedulerLogs: js.UndefOr[ModuleLoggingConfiguration]
    var TaskLogs: js.UndefOr[ModuleLoggingConfiguration]
    var WebserverLogs: js.UndefOr[ModuleLoggingConfiguration]
    var WorkerLogs: js.UndefOr[ModuleLoggingConfiguration]
  }

  object LoggingConfiguration {
    @inline
    def apply(
        DagProcessingLogs: js.UndefOr[ModuleLoggingConfiguration] = js.undefined,
        SchedulerLogs: js.UndefOr[ModuleLoggingConfiguration] = js.undefined,
        TaskLogs: js.UndefOr[ModuleLoggingConfiguration] = js.undefined,
        WebserverLogs: js.UndefOr[ModuleLoggingConfiguration] = js.undefined,
        WorkerLogs: js.UndefOr[ModuleLoggingConfiguration] = js.undefined
    ): LoggingConfiguration = {
      val __obj = js.Dynamic.literal()
      DagProcessingLogs.foreach(__v => __obj.updateDynamic("DagProcessingLogs")(__v.asInstanceOf[js.Any]))
      SchedulerLogs.foreach(__v => __obj.updateDynamic("SchedulerLogs")(__v.asInstanceOf[js.Any]))
      TaskLogs.foreach(__v => __obj.updateDynamic("TaskLogs")(__v.asInstanceOf[js.Any]))
      WebserverLogs.foreach(__v => __obj.updateDynamic("WebserverLogs")(__v.asInstanceOf[js.Any]))
      WorkerLogs.foreach(__v => __obj.updateDynamic("WorkerLogs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoggingConfiguration]
    }
  }

  /** The Logging Configuration of your Amazon MWAA environment.
    */
  @js.native
  trait LoggingConfigurationInput extends js.Object {
    var DagProcessingLogs: js.UndefOr[ModuleLoggingConfigurationInput]
    var SchedulerLogs: js.UndefOr[ModuleLoggingConfigurationInput]
    var TaskLogs: js.UndefOr[ModuleLoggingConfigurationInput]
    var WebserverLogs: js.UndefOr[ModuleLoggingConfigurationInput]
    var WorkerLogs: js.UndefOr[ModuleLoggingConfigurationInput]
  }

  object LoggingConfigurationInput {
    @inline
    def apply(
        DagProcessingLogs: js.UndefOr[ModuleLoggingConfigurationInput] = js.undefined,
        SchedulerLogs: js.UndefOr[ModuleLoggingConfigurationInput] = js.undefined,
        TaskLogs: js.UndefOr[ModuleLoggingConfigurationInput] = js.undefined,
        WebserverLogs: js.UndefOr[ModuleLoggingConfigurationInput] = js.undefined,
        WorkerLogs: js.UndefOr[ModuleLoggingConfigurationInput] = js.undefined
    ): LoggingConfigurationInput = {
      val __obj = js.Dynamic.literal()
      DagProcessingLogs.foreach(__v => __obj.updateDynamic("DagProcessingLogs")(__v.asInstanceOf[js.Any]))
      SchedulerLogs.foreach(__v => __obj.updateDynamic("SchedulerLogs")(__v.asInstanceOf[js.Any]))
      TaskLogs.foreach(__v => __obj.updateDynamic("TaskLogs")(__v.asInstanceOf[js.Any]))
      WebserverLogs.foreach(__v => __obj.updateDynamic("WebserverLogs")(__v.asInstanceOf[js.Any]))
      WorkerLogs.foreach(__v => __obj.updateDynamic("WorkerLogs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoggingConfigurationInput]
    }
  }

  @js.native
  sealed trait LoggingLevel extends js.Any
  object LoggingLevel {
    val CRITICAL = "CRITICAL".asInstanceOf[LoggingLevel]
    val ERROR = "ERROR".asInstanceOf[LoggingLevel]
    val WARNING = "WARNING".asInstanceOf[LoggingLevel]
    val INFO = "INFO".asInstanceOf[LoggingLevel]
    val DEBUG = "DEBUG".asInstanceOf[LoggingLevel]

    @inline def values = js.Array(CRITICAL, ERROR, WARNING, INFO, DEBUG)
  }

  /** Internal only API.
    */
  @js.native
  trait MetricDatum extends js.Object {
    var MetricName: String
    var Timestamp: Timestamp
    var Dimensions: js.UndefOr[Dimensions]
    var StatisticValues: js.UndefOr[StatisticSet]
    var Unit: js.UndefOr[Unit]
    var Value: js.UndefOr[Double]
  }

  object MetricDatum {
    @inline
    def apply(
        MetricName: String,
        Timestamp: Timestamp,
        Dimensions: js.UndefOr[Dimensions] = js.undefined,
        StatisticValues: js.UndefOr[StatisticSet] = js.undefined,
        Unit: js.UndefOr[Unit] = js.undefined,
        Value: js.UndefOr[Double] = js.undefined
    ): MetricDatum = {
      val __obj = js.Dynamic.literal(
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Timestamp" -> Timestamp.asInstanceOf[js.Any]
      )

      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      StatisticValues.foreach(__v => __obj.updateDynamic("StatisticValues")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricDatum]
    }
  }

  /** A JSON blob that provides configuration to use for logging with respect to the various Apache Airflow services: DagProcessingLogs, SchedulerLogs, TaskLogs, WebserverLogs, and WorkerLogs.
    */
  @js.native
  trait ModuleLoggingConfiguration extends js.Object {
    var CloudWatchLogGroupArn: js.UndefOr[CloudWatchLogGroupArn]
    var Enabled: js.UndefOr[LoggingEnabled]
    var LogLevel: js.UndefOr[LoggingLevel]
  }

  object ModuleLoggingConfiguration {
    @inline
    def apply(
        CloudWatchLogGroupArn: js.UndefOr[CloudWatchLogGroupArn] = js.undefined,
        Enabled: js.UndefOr[LoggingEnabled] = js.undefined,
        LogLevel: js.UndefOr[LoggingLevel] = js.undefined
    ): ModuleLoggingConfiguration = {
      val __obj = js.Dynamic.literal()
      CloudWatchLogGroupArn.foreach(__v => __obj.updateDynamic("CloudWatchLogGroupArn")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      LogLevel.foreach(__v => __obj.updateDynamic("LogLevel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModuleLoggingConfiguration]
    }
  }

  /** A JSON blob that provides configuration to use for logging with respect to the various Apache Airflow services: DagProcessingLogs, SchedulerLogs, TaskLogs, WebserverLogs, and WorkerLogs.
    */
  @js.native
  trait ModuleLoggingConfigurationInput extends js.Object {
    var Enabled: LoggingEnabled
    var LogLevel: LoggingLevel
  }

  object ModuleLoggingConfigurationInput {
    @inline
    def apply(
        Enabled: LoggingEnabled,
        LogLevel: LoggingLevel
    ): ModuleLoggingConfigurationInput = {
      val __obj = js.Dynamic.literal(
        "Enabled" -> Enabled.asInstanceOf[js.Any],
        "LogLevel" -> LogLevel.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ModuleLoggingConfigurationInput]
    }
  }

  /** Provide the security group and subnet IDs for the workers and scheduler.
    */
  @js.native
  trait NetworkConfiguration extends js.Object {
    var SecurityGroupIds: js.UndefOr[SecurityGroupList]
    var SubnetIds: js.UndefOr[SubnetList]
  }

  object NetworkConfiguration {
    @inline
    def apply(
        SecurityGroupIds: js.UndefOr[SecurityGroupList] = js.undefined,
        SubnetIds: js.UndefOr[SubnetList] = js.undefined
    ): NetworkConfiguration = {
      val __obj = js.Dynamic.literal()
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkConfiguration]
    }
  }

  @js.native
  trait PublishMetricsInput extends js.Object {
    var EnvironmentName: EnvironmentName
    var MetricData: MetricData
  }

  object PublishMetricsInput {
    @inline
    def apply(
        EnvironmentName: EnvironmentName,
        MetricData: MetricData
    ): PublishMetricsInput = {
      val __obj = js.Dynamic.literal(
        "EnvironmentName" -> EnvironmentName.asInstanceOf[js.Any],
        "MetricData" -> MetricData.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PublishMetricsInput]
    }
  }

  @js.native
  trait PublishMetricsOutput extends js.Object

  object PublishMetricsOutput {
    @inline
    def apply(): PublishMetricsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublishMetricsOutput]
    }
  }

  /** Internal only API.
    */
  @js.native
  trait StatisticSet extends js.Object {
    var Maximum: js.UndefOr[Double]
    var Minimum: js.UndefOr[Double]
    var SampleCount: js.UndefOr[Int]
    var Sum: js.UndefOr[Double]
  }

  object StatisticSet {
    @inline
    def apply(
        Maximum: js.UndefOr[Double] = js.undefined,
        Minimum: js.UndefOr[Double] = js.undefined,
        SampleCount: js.UndefOr[Int] = js.undefined,
        Sum: js.UndefOr[Double] = js.undefined
    ): StatisticSet = {
      val __obj = js.Dynamic.literal()
      Maximum.foreach(__v => __obj.updateDynamic("Maximum")(__v.asInstanceOf[js.Any]))
      Minimum.foreach(__v => __obj.updateDynamic("Minimum")(__v.asInstanceOf[js.Any]))
      SampleCount.foreach(__v => __obj.updateDynamic("SampleCount")(__v.asInstanceOf[js.Any]))
      Sum.foreach(__v => __obj.updateDynamic("Sum")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StatisticSet]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var ResourceArn: EnvironmentArn
    var Tags: TagMap
  }

  object TagResourceInput {
    @inline
    def apply(
        ResourceArn: EnvironmentArn,
        Tags: TagMap
    ): TagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceInput]
    }
  }

  @js.native
  trait TagResourceOutput extends js.Object

  object TagResourceOutput {
    @inline
    def apply(): TagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceOutput]
    }
  }

  @js.native
  sealed trait Unit extends js.Any
  object Unit {
    val Seconds = "Seconds".asInstanceOf[Unit]
    val Microseconds = "Microseconds".asInstanceOf[Unit]
    val Milliseconds = "Milliseconds".asInstanceOf[Unit]
    val Bytes = "Bytes".asInstanceOf[Unit]
    val Kilobytes = "Kilobytes".asInstanceOf[Unit]
    val Megabytes = "Megabytes".asInstanceOf[Unit]
    val Gigabytes = "Gigabytes".asInstanceOf[Unit]
    val Terabytes = "Terabytes".asInstanceOf[Unit]
    val Bits = "Bits".asInstanceOf[Unit]
    val Kilobits = "Kilobits".asInstanceOf[Unit]
    val Megabits = "Megabits".asInstanceOf[Unit]
    val Gigabits = "Gigabits".asInstanceOf[Unit]
    val Terabits = "Terabits".asInstanceOf[Unit]
    val Percent = "Percent".asInstanceOf[Unit]
    val Count = "Count".asInstanceOf[Unit]
    val `Bytes/Second` = "Bytes/Second".asInstanceOf[Unit]
    val `Kilobytes/Second` = "Kilobytes/Second".asInstanceOf[Unit]
    val `Megabytes/Second` = "Megabytes/Second".asInstanceOf[Unit]
    val `Gigabytes/Second` = "Gigabytes/Second".asInstanceOf[Unit]
    val `Terabytes/Second` = "Terabytes/Second".asInstanceOf[Unit]
    val `Bits/Second` = "Bits/Second".asInstanceOf[Unit]
    val `Kilobits/Second` = "Kilobits/Second".asInstanceOf[Unit]
    val `Megabits/Second` = "Megabits/Second".asInstanceOf[Unit]
    val `Gigabits/Second` = "Gigabits/Second".asInstanceOf[Unit]
    val `Terabits/Second` = "Terabits/Second".asInstanceOf[Unit]
    val `Count/Second` = "Count/Second".asInstanceOf[Unit]
    val None = "None".asInstanceOf[Unit]

    @inline def values = js.Array(
      Seconds,
      Microseconds,
      Milliseconds,
      Bytes,
      Kilobytes,
      Megabytes,
      Gigabytes,
      Terabytes,
      Bits,
      Kilobits,
      Megabits,
      Gigabits,
      Terabits,
      Percent,
      Count,
      `Bytes/Second`,
      `Kilobytes/Second`,
      `Megabytes/Second`,
      `Gigabytes/Second`,
      `Terabytes/Second`,
      `Bits/Second`,
      `Kilobits/Second`,
      `Megabits/Second`,
      `Gigabits/Second`,
      `Terabits/Second`,
      `Count/Second`,
      None
    )
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var ResourceArn: EnvironmentArn
    var tagKeys: TagKeyList
  }

  object UntagResourceInput {
    @inline
    def apply(
        ResourceArn: EnvironmentArn,
        tagKeys: TagKeyList
    ): UntagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UntagResourceOutput extends js.Object

  object UntagResourceOutput {
    @inline
    def apply(): UntagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceOutput]
    }
  }

  @js.native
  trait UpdateEnvironmentInput extends js.Object {
    var Name: EnvironmentName
    var AirflowConfigurationOptions: js.UndefOr[SyntheticUpdateEnvironmentInputAirflowConfigurationOptions]
    var AirflowVersion: js.UndefOr[AirflowVersion]
    var DagS3Path: js.UndefOr[RelativePath]
    var EnvironmentClass: js.UndefOr[EnvironmentClass]
    var ExecutionRoleArn: js.UndefOr[IamRoleArn]
    var LoggingConfiguration: js.UndefOr[LoggingConfigurationInput]
    var MaxWorkers: js.UndefOr[MaxWorkers]
    var NetworkConfiguration: js.UndefOr[UpdateNetworkConfigurationInput]
    var PluginsS3ObjectVersion: js.UndefOr[S3ObjectVersion]
    var PluginsS3Path: js.UndefOr[RelativePath]
    var RequirementsS3ObjectVersion: js.UndefOr[S3ObjectVersion]
    var RequirementsS3Path: js.UndefOr[RelativePath]
    var SourceBucketArn: js.UndefOr[S3BucketArn]
    var WebserverAccessMode: js.UndefOr[WebserverAccessMode]
    var WeeklyMaintenanceWindowStart: js.UndefOr[WeeklyMaintenanceWindowStart]
  }

  object UpdateEnvironmentInput {
    @inline
    def apply(
        Name: EnvironmentName,
        AirflowConfigurationOptions: js.UndefOr[SyntheticUpdateEnvironmentInputAirflowConfigurationOptions] = js.undefined,
        AirflowVersion: js.UndefOr[AirflowVersion] = js.undefined,
        DagS3Path: js.UndefOr[RelativePath] = js.undefined,
        EnvironmentClass: js.UndefOr[EnvironmentClass] = js.undefined,
        ExecutionRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        LoggingConfiguration: js.UndefOr[LoggingConfigurationInput] = js.undefined,
        MaxWorkers: js.UndefOr[MaxWorkers] = js.undefined,
        NetworkConfiguration: js.UndefOr[UpdateNetworkConfigurationInput] = js.undefined,
        PluginsS3ObjectVersion: js.UndefOr[S3ObjectVersion] = js.undefined,
        PluginsS3Path: js.UndefOr[RelativePath] = js.undefined,
        RequirementsS3ObjectVersion: js.UndefOr[S3ObjectVersion] = js.undefined,
        RequirementsS3Path: js.UndefOr[RelativePath] = js.undefined,
        SourceBucketArn: js.UndefOr[S3BucketArn] = js.undefined,
        WebserverAccessMode: js.UndefOr[WebserverAccessMode] = js.undefined,
        WeeklyMaintenanceWindowStart: js.UndefOr[WeeklyMaintenanceWindowStart] = js.undefined
    ): UpdateEnvironmentInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AirflowConfigurationOptions.foreach(__v => __obj.updateDynamic("AirflowConfigurationOptions")(__v.asInstanceOf[js.Any]))
      AirflowVersion.foreach(__v => __obj.updateDynamic("AirflowVersion")(__v.asInstanceOf[js.Any]))
      DagS3Path.foreach(__v => __obj.updateDynamic("DagS3Path")(__v.asInstanceOf[js.Any]))
      EnvironmentClass.foreach(__v => __obj.updateDynamic("EnvironmentClass")(__v.asInstanceOf[js.Any]))
      ExecutionRoleArn.foreach(__v => __obj.updateDynamic("ExecutionRoleArn")(__v.asInstanceOf[js.Any]))
      LoggingConfiguration.foreach(__v => __obj.updateDynamic("LoggingConfiguration")(__v.asInstanceOf[js.Any]))
      MaxWorkers.foreach(__v => __obj.updateDynamic("MaxWorkers")(__v.asInstanceOf[js.Any]))
      NetworkConfiguration.foreach(__v => __obj.updateDynamic("NetworkConfiguration")(__v.asInstanceOf[js.Any]))
      PluginsS3ObjectVersion.foreach(__v => __obj.updateDynamic("PluginsS3ObjectVersion")(__v.asInstanceOf[js.Any]))
      PluginsS3Path.foreach(__v => __obj.updateDynamic("PluginsS3Path")(__v.asInstanceOf[js.Any]))
      RequirementsS3ObjectVersion.foreach(__v => __obj.updateDynamic("RequirementsS3ObjectVersion")(__v.asInstanceOf[js.Any]))
      RequirementsS3Path.foreach(__v => __obj.updateDynamic("RequirementsS3Path")(__v.asInstanceOf[js.Any]))
      SourceBucketArn.foreach(__v => __obj.updateDynamic("SourceBucketArn")(__v.asInstanceOf[js.Any]))
      WebserverAccessMode.foreach(__v => __obj.updateDynamic("WebserverAccessMode")(__v.asInstanceOf[js.Any]))
      WeeklyMaintenanceWindowStart.foreach(__v => __obj.updateDynamic("WeeklyMaintenanceWindowStart")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEnvironmentInput]
    }
  }

  @js.native
  trait UpdateEnvironmentOutput extends js.Object {
    var Arn: js.UndefOr[EnvironmentArn]
  }

  object UpdateEnvironmentOutput {
    @inline
    def apply(
        Arn: js.UndefOr[EnvironmentArn] = js.undefined
    ): UpdateEnvironmentOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEnvironmentOutput]
    }
  }

  /** Error information of update, if applicable.
    */
  @js.native
  trait UpdateError extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
  }

  object UpdateError {
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined
    ): UpdateError = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateError]
    }
  }

  /** Provide the security group and subnet IDs for the workers and scheduler.
    */
  @js.native
  trait UpdateNetworkConfigurationInput extends js.Object {
    var SecurityGroupIds: SecurityGroupList
  }

  object UpdateNetworkConfigurationInput {
    @inline
    def apply(
        SecurityGroupIds: SecurityGroupList
    ): UpdateNetworkConfigurationInput = {
      val __obj = js.Dynamic.literal(
        "SecurityGroupIds" -> SecurityGroupIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateNetworkConfigurationInput]
    }
  }

  @js.native
  sealed trait UpdateStatus extends js.Any
  object UpdateStatus {
    val SUCCESS = "SUCCESS".asInstanceOf[UpdateStatus]
    val PENDING = "PENDING".asInstanceOf[UpdateStatus]
    val FAILED = "FAILED".asInstanceOf[UpdateStatus]

    @inline def values = js.Array(SUCCESS, PENDING, FAILED)
  }

  @js.native
  sealed trait WebserverAccessMode extends js.Any
  object WebserverAccessMode {
    val PRIVATE_ONLY = "PRIVATE_ONLY".asInstanceOf[WebserverAccessMode]
    val PUBLIC_ONLY = "PUBLIC_ONLY".asInstanceOf[WebserverAccessMode]

    @inline def values = js.Array(PRIVATE_ONLY, PUBLIC_ONLY)
  }
}
