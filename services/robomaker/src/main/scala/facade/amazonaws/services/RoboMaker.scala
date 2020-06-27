package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object robomaker {
  type Arn                                = String
  type Arns                               = js.Array[Arn]
  type BatchTimeoutInSeconds              = Double
  type BoxedBoolean                       = Boolean
  type ClientRequestToken                 = String
  type Command                            = String
  type CreateSimulationJobRequests        = js.Array[SimulationJobRequest]
  type CreatedAt                          = js.Date
  type DataSourceConfigs                  = js.Array[DataSourceConfig]
  type DataSourceNames                    = js.Array[Name]
  type DataSources                        = js.Array[DataSource]
  type DeploymentApplicationConfigs       = js.Array[DeploymentApplicationConfig]
  type DeploymentJobs                     = js.Array[DeploymentJob]
  type DeploymentTimeout                  = Double
  type DeploymentVersion                  = String
  type EnvironmentVariableKey             = String
  type EnvironmentVariableMap             = js.Dictionary[EnvironmentVariableValue]
  type EnvironmentVariableValue           = String
  type FailedAt                           = js.Date
  type FailedCreateSimulationJobRequests  = js.Array[FailedCreateSimulationJobRequest]
  type FilterValues                       = js.Array[Name]
  type Filters                            = js.Array[Filter]
  type Fleets                             = js.Array[Fleet]
  type GenericInteger                     = Int
  type GenericString                      = String
  type IamRole                            = String
  type Id                                 = String
  type JobDuration                        = Double
  type LastStartedAt                      = js.Date
  type LastUpdatedAt                      = js.Date
  type MaxConcurrency                     = Int
  type MaxResults                         = Int
  type Name                               = String
  type NonEmptyString                     = String
  type NonSystemPort                      = Int
  type PaginationToken                    = String
  type Path                               = String
  type PercentDone                        = Float
  type Percentage                         = Int
  type Port                               = Int
  type PortMappingList                    = js.Array[PortMapping]
  type RenderingEngineVersionType         = String
  type RevisionId                         = String
  type RobotApplicationConfigs            = js.Array[RobotApplicationConfig]
  type RobotApplicationNames              = js.Array[Name]
  type RobotApplicationSummaries          = js.Array[RobotApplicationSummary]
  type RobotDeploymentSummary             = js.Array[RobotDeployment]
  type Robots                             = js.Array[Robot]
  type S3Bucket                           = String
  type S3Etag                             = String
  type S3Key                              = String
  type S3KeyOutputs                       = js.Array[S3KeyOutput]
  type S3Keys                             = js.Array[S3Key]
  type SecurityGroups                     = js.Array[NonEmptyString]
  type SimulationApplicationConfigs       = js.Array[SimulationApplicationConfig]
  type SimulationApplicationNames         = js.Array[Name]
  type SimulationApplicationSummaries     = js.Array[SimulationApplicationSummary]
  type SimulationJobBatchSummaries        = js.Array[SimulationJobBatchSummary]
  type SimulationJobSummaries             = js.Array[SimulationJobSummary]
  type SimulationJobs                     = js.Array[SimulationJob]
  type SimulationSoftwareSuiteVersionType = String
  type SimulationTimeMillis               = Double
  type SourceConfigs                      = js.Array[SourceConfig]
  type Sources                            = js.Array[Source]
  type Subnets                            = js.Array[NonEmptyString]
  type TagKey                             = String
  type TagKeyList                         = js.Array[TagKey]
  type TagMap                             = js.Dictionary[TagValue]
  type TagValue                           = String
  type Version                            = String
  type VersionQualifier                   = String

  implicit final class RoboMakerOps(private val service: RoboMaker) extends AnyVal {

    @inline def batchDescribeSimulationJobFuture(
        params: BatchDescribeSimulationJobRequest
    ): Future[BatchDescribeSimulationJobResponse] = service.batchDescribeSimulationJob(params).promise().toFuture
    @inline def cancelDeploymentJobFuture(params: CancelDeploymentJobRequest): Future[CancelDeploymentJobResponse] =
      service.cancelDeploymentJob(params).promise().toFuture
    @inline def cancelSimulationJobBatchFuture(
        params: CancelSimulationJobBatchRequest
    ): Future[CancelSimulationJobBatchResponse] = service.cancelSimulationJobBatch(params).promise().toFuture
    @inline def cancelSimulationJobFuture(params: CancelSimulationJobRequest): Future[CancelSimulationJobResponse] =
      service.cancelSimulationJob(params).promise().toFuture
    @inline def createDeploymentJobFuture(params: CreateDeploymentJobRequest): Future[CreateDeploymentJobResponse] =
      service.createDeploymentJob(params).promise().toFuture
    @inline def createFleetFuture(params: CreateFleetRequest): Future[CreateFleetResponse] =
      service.createFleet(params).promise().toFuture
    @inline def createRobotApplicationFuture(
        params: CreateRobotApplicationRequest
    ): Future[CreateRobotApplicationResponse] = service.createRobotApplication(params).promise().toFuture
    @inline def createRobotApplicationVersionFuture(
        params: CreateRobotApplicationVersionRequest
    ): Future[CreateRobotApplicationVersionResponse] = service.createRobotApplicationVersion(params).promise().toFuture
    @inline def createRobotFuture(params: CreateRobotRequest): Future[CreateRobotResponse] =
      service.createRobot(params).promise().toFuture
    @inline def createSimulationApplicationFuture(
        params: CreateSimulationApplicationRequest
    ): Future[CreateSimulationApplicationResponse] = service.createSimulationApplication(params).promise().toFuture
    @inline def createSimulationApplicationVersionFuture(
        params: CreateSimulationApplicationVersionRequest
    ): Future[CreateSimulationApplicationVersionResponse] =
      service.createSimulationApplicationVersion(params).promise().toFuture
    @inline def createSimulationJobFuture(params: CreateSimulationJobRequest): Future[CreateSimulationJobResponse] =
      service.createSimulationJob(params).promise().toFuture
    @inline def deleteFleetFuture(params: DeleteFleetRequest): Future[DeleteFleetResponse] =
      service.deleteFleet(params).promise().toFuture
    @inline def deleteRobotApplicationFuture(
        params: DeleteRobotApplicationRequest
    ): Future[DeleteRobotApplicationResponse] = service.deleteRobotApplication(params).promise().toFuture
    @inline def deleteRobotFuture(params: DeleteRobotRequest): Future[DeleteRobotResponse] =
      service.deleteRobot(params).promise().toFuture
    @inline def deleteSimulationApplicationFuture(
        params: DeleteSimulationApplicationRequest
    ): Future[DeleteSimulationApplicationResponse] = service.deleteSimulationApplication(params).promise().toFuture
    @inline def deregisterRobotFuture(params: DeregisterRobotRequest): Future[DeregisterRobotResponse] =
      service.deregisterRobot(params).promise().toFuture
    @inline def describeDeploymentJobFuture(
        params: DescribeDeploymentJobRequest
    ): Future[DescribeDeploymentJobResponse] = service.describeDeploymentJob(params).promise().toFuture
    @inline def describeFleetFuture(params: DescribeFleetRequest): Future[DescribeFleetResponse] =
      service.describeFleet(params).promise().toFuture
    @inline def describeRobotApplicationFuture(
        params: DescribeRobotApplicationRequest
    ): Future[DescribeRobotApplicationResponse] = service.describeRobotApplication(params).promise().toFuture
    @inline def describeRobotFuture(params: DescribeRobotRequest): Future[DescribeRobotResponse] =
      service.describeRobot(params).promise().toFuture
    @inline def describeSimulationApplicationFuture(
        params: DescribeSimulationApplicationRequest
    ): Future[DescribeSimulationApplicationResponse] = service.describeSimulationApplication(params).promise().toFuture
    @inline def describeSimulationJobBatchFuture(
        params: DescribeSimulationJobBatchRequest
    ): Future[DescribeSimulationJobBatchResponse] = service.describeSimulationJobBatch(params).promise().toFuture
    @inline def describeSimulationJobFuture(
        params: DescribeSimulationJobRequest
    ): Future[DescribeSimulationJobResponse] = service.describeSimulationJob(params).promise().toFuture
    @inline def listDeploymentJobsFuture(params: ListDeploymentJobsRequest): Future[ListDeploymentJobsResponse] =
      service.listDeploymentJobs(params).promise().toFuture
    @inline def listFleetsFuture(params: ListFleetsRequest): Future[ListFleetsResponse] =
      service.listFleets(params).promise().toFuture
    @inline def listRobotApplicationsFuture(
        params: ListRobotApplicationsRequest
    ): Future[ListRobotApplicationsResponse] = service.listRobotApplications(params).promise().toFuture
    @inline def listRobotsFuture(params: ListRobotsRequest): Future[ListRobotsResponse] =
      service.listRobots(params).promise().toFuture
    @inline def listSimulationApplicationsFuture(
        params: ListSimulationApplicationsRequest
    ): Future[ListSimulationApplicationsResponse] = service.listSimulationApplications(params).promise().toFuture
    @inline def listSimulationJobBatchesFuture(
        params: ListSimulationJobBatchesRequest
    ): Future[ListSimulationJobBatchesResponse] = service.listSimulationJobBatches(params).promise().toFuture
    @inline def listSimulationJobsFuture(params: ListSimulationJobsRequest): Future[ListSimulationJobsResponse] =
      service.listSimulationJobs(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def registerRobotFuture(params: RegisterRobotRequest): Future[RegisterRobotResponse] =
      service.registerRobot(params).promise().toFuture
    @inline def restartSimulationJobFuture(params: RestartSimulationJobRequest): Future[RestartSimulationJobResponse] =
      service.restartSimulationJob(params).promise().toFuture
    @inline def startSimulationJobBatchFuture(
        params: StartSimulationJobBatchRequest
    ): Future[StartSimulationJobBatchResponse] = service.startSimulationJobBatch(params).promise().toFuture
    @inline def syncDeploymentJobFuture(params: SyncDeploymentJobRequest): Future[SyncDeploymentJobResponse] =
      service.syncDeploymentJob(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateRobotApplicationFuture(
        params: UpdateRobotApplicationRequest
    ): Future[UpdateRobotApplicationResponse] = service.updateRobotApplication(params).promise().toFuture
    @inline def updateSimulationApplicationFuture(
        params: UpdateSimulationApplicationRequest
    ): Future[UpdateSimulationApplicationResponse] = service.updateSimulationApplication(params).promise().toFuture
  }
}

package robomaker {
  @js.native
  @JSImport("aws-sdk", "RoboMaker")
  class RoboMaker() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchDescribeSimulationJob(
        params: BatchDescribeSimulationJobRequest
    ): Request[BatchDescribeSimulationJobResponse]                                                    = js.native
    def cancelDeploymentJob(params: CancelDeploymentJobRequest): Request[CancelDeploymentJobResponse] = js.native
    def cancelSimulationJob(params: CancelSimulationJobRequest): Request[CancelSimulationJobResponse] = js.native
    def cancelSimulationJobBatch(params: CancelSimulationJobBatchRequest): Request[CancelSimulationJobBatchResponse] =
      js.native
    def createDeploymentJob(params: CreateDeploymentJobRequest): Request[CreateDeploymentJobResponse] = js.native
    def createFleet(params: CreateFleetRequest): Request[CreateFleetResponse]                         = js.native
    def createRobot(params: CreateRobotRequest): Request[CreateRobotResponse]                         = js.native
    def createRobotApplication(params: CreateRobotApplicationRequest): Request[CreateRobotApplicationResponse] =
      js.native
    def createRobotApplicationVersion(
        params: CreateRobotApplicationVersionRequest
    ): Request[CreateRobotApplicationVersionResponse] = js.native
    def createSimulationApplication(
        params: CreateSimulationApplicationRequest
    ): Request[CreateSimulationApplicationResponse] = js.native
    def createSimulationApplicationVersion(
        params: CreateSimulationApplicationVersionRequest
    ): Request[CreateSimulationApplicationVersionResponse]                                            = js.native
    def createSimulationJob(params: CreateSimulationJobRequest): Request[CreateSimulationJobResponse] = js.native
    def deleteFleet(params: DeleteFleetRequest): Request[DeleteFleetResponse]                         = js.native
    def deleteRobot(params: DeleteRobotRequest): Request[DeleteRobotResponse]                         = js.native
    def deleteRobotApplication(params: DeleteRobotApplicationRequest): Request[DeleteRobotApplicationResponse] =
      js.native
    def deleteSimulationApplication(
        params: DeleteSimulationApplicationRequest
    ): Request[DeleteSimulationApplicationResponse]                                                         = js.native
    def deregisterRobot(params: DeregisterRobotRequest): Request[DeregisterRobotResponse]                   = js.native
    def describeDeploymentJob(params: DescribeDeploymentJobRequest): Request[DescribeDeploymentJobResponse] = js.native
    def describeFleet(params: DescribeFleetRequest): Request[DescribeFleetResponse]                         = js.native
    def describeRobot(params: DescribeRobotRequest): Request[DescribeRobotResponse]                         = js.native
    def describeRobotApplication(params: DescribeRobotApplicationRequest): Request[DescribeRobotApplicationResponse] =
      js.native
    def describeSimulationApplication(
        params: DescribeSimulationApplicationRequest
    ): Request[DescribeSimulationApplicationResponse]                                                       = js.native
    def describeSimulationJob(params: DescribeSimulationJobRequest): Request[DescribeSimulationJobResponse] = js.native
    def describeSimulationJobBatch(
        params: DescribeSimulationJobBatchRequest
    ): Request[DescribeSimulationJobBatchResponse]                                                          = js.native
    def listDeploymentJobs(params: ListDeploymentJobsRequest): Request[ListDeploymentJobsResponse]          = js.native
    def listFleets(params: ListFleetsRequest): Request[ListFleetsResponse]                                  = js.native
    def listRobotApplications(params: ListRobotApplicationsRequest): Request[ListRobotApplicationsResponse] = js.native
    def listRobots(params: ListRobotsRequest): Request[ListRobotsResponse]                                  = js.native
    def listSimulationApplications(
        params: ListSimulationApplicationsRequest
    ): Request[ListSimulationApplicationsResponse] = js.native
    def listSimulationJobBatches(params: ListSimulationJobBatchesRequest): Request[ListSimulationJobBatchesResponse] =
      js.native
    def listSimulationJobs(params: ListSimulationJobsRequest): Request[ListSimulationJobsResponse]       = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]    = js.native
    def registerRobot(params: RegisterRobotRequest): Request[RegisterRobotResponse]                      = js.native
    def restartSimulationJob(params: RestartSimulationJobRequest): Request[RestartSimulationJobResponse] = js.native
    def startSimulationJobBatch(params: StartSimulationJobBatchRequest): Request[StartSimulationJobBatchResponse] =
      js.native
    def syncDeploymentJob(params: SyncDeploymentJobRequest): Request[SyncDeploymentJobResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                   = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]             = js.native
    def updateRobotApplication(params: UpdateRobotApplicationRequest): Request[UpdateRobotApplicationResponse] =
      js.native
    def updateSimulationApplication(
        params: UpdateSimulationApplicationRequest
    ): Request[UpdateSimulationApplicationResponse] = js.native
  }

  @js.native
  sealed trait Architecture extends js.Any
  object Architecture extends js.Object {
    val X86_64 = "X86_64".asInstanceOf[Architecture]
    val ARM64  = "ARM64".asInstanceOf[Architecture]
    val ARMHF  = "ARMHF".asInstanceOf[Architecture]

    val values = js.Object.freeze(js.Array(X86_64, ARM64, ARMHF))
  }

  @js.native
  @Factory
  trait BatchDescribeSimulationJobRequest extends js.Object {
    var jobs: Arns
  }

  @js.native
  @Factory
  trait BatchDescribeSimulationJobResponse extends js.Object {
    var jobs: js.UndefOr[SimulationJobs]
    var unprocessedJobs: js.UndefOr[Arns]
  }

  /**
    * Information about the batch policy.
    */
  @js.native
  @Factory
  trait BatchPolicy extends js.Object {
    var maxConcurrency: js.UndefOr[MaxConcurrency]
    var timeoutInSeconds: js.UndefOr[BatchTimeoutInSeconds]
  }

  @js.native
  @Factory
  trait CancelDeploymentJobRequest extends js.Object {
    var job: Arn
  }

  @js.native
  @Factory
  trait CancelDeploymentJobResponse extends js.Object {}

  @js.native
  @Factory
  trait CancelSimulationJobBatchRequest extends js.Object {
    var batch: Arn
  }

  @js.native
  @Factory
  trait CancelSimulationJobBatchResponse extends js.Object {}

  @js.native
  @Factory
  trait CancelSimulationJobRequest extends js.Object {
    var job: Arn
  }

  @js.native
  @Factory
  trait CancelSimulationJobResponse extends js.Object {}

  @js.native
  @Factory
  trait CreateDeploymentJobRequest extends js.Object {
    var clientRequestToken: ClientRequestToken
    var deploymentApplicationConfigs: DeploymentApplicationConfigs
    var fleet: Arn
    var deploymentConfig: js.UndefOr[DeploymentConfig]
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait CreateDeploymentJobResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[CreatedAt]
    var deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs]
    var deploymentConfig: js.UndefOr[DeploymentConfig]
    var failureCode: js.UndefOr[DeploymentJobErrorCode]
    var failureReason: js.UndefOr[GenericString]
    var fleet: js.UndefOr[Arn]
    var status: js.UndefOr[DeploymentStatus]
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait CreateFleetRequest extends js.Object {
    var name: Name
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait CreateFleetResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[CreatedAt]
    var name: js.UndefOr[Name]
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait CreateRobotApplicationRequest extends js.Object {
    var name: Name
    var robotSoftwareSuite: RobotSoftwareSuite
    var sources: SourceConfigs
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait CreateRobotApplicationResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var name: js.UndefOr[Name]
    var revisionId: js.UndefOr[RevisionId]
    var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite]
    var sources: js.UndefOr[Sources]
    var tags: js.UndefOr[TagMap]
    var version: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait CreateRobotApplicationVersionRequest extends js.Object {
    var application: Arn
    var currentRevisionId: js.UndefOr[RevisionId]
  }

  @js.native
  @Factory
  trait CreateRobotApplicationVersionResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var name: js.UndefOr[Name]
    var revisionId: js.UndefOr[RevisionId]
    var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite]
    var sources: js.UndefOr[Sources]
    var version: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait CreateRobotRequest extends js.Object {
    var architecture: Architecture
    var greengrassGroupId: Id
    var name: Name
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait CreateRobotResponse extends js.Object {
    var architecture: js.UndefOr[Architecture]
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[CreatedAt]
    var greengrassGroupId: js.UndefOr[Id]
    var name: js.UndefOr[Name]
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait CreateSimulationApplicationRequest extends js.Object {
    var name: Name
    var robotSoftwareSuite: RobotSoftwareSuite
    var simulationSoftwareSuite: SimulationSoftwareSuite
    var sources: SourceConfigs
    var renderingEngine: js.UndefOr[RenderingEngine]
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait CreateSimulationApplicationResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var name: js.UndefOr[Name]
    var renderingEngine: js.UndefOr[RenderingEngine]
    var revisionId: js.UndefOr[RevisionId]
    var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite]
    var simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite]
    var sources: js.UndefOr[Sources]
    var tags: js.UndefOr[TagMap]
    var version: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait CreateSimulationApplicationVersionRequest extends js.Object {
    var application: Arn
    var currentRevisionId: js.UndefOr[RevisionId]
  }

  @js.native
  @Factory
  trait CreateSimulationApplicationVersionResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var name: js.UndefOr[Name]
    var renderingEngine: js.UndefOr[RenderingEngine]
    var revisionId: js.UndefOr[RevisionId]
    var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite]
    var simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite]
    var sources: js.UndefOr[Sources]
    var version: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait CreateSimulationJobRequest extends js.Object {
    var iamRole: IamRole
    var maxJobDurationInSeconds: JobDuration
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var dataSources: js.UndefOr[DataSourceConfigs]
    var failureBehavior: js.UndefOr[FailureBehavior]
    var loggingConfig: js.UndefOr[LoggingConfig]
    var outputLocation: js.UndefOr[OutputLocation]
    var robotApplications: js.UndefOr[RobotApplicationConfigs]
    var simulationApplications: js.UndefOr[SimulationApplicationConfigs]
    var tags: js.UndefOr[TagMap]
    var vpcConfig: js.UndefOr[VPCConfig]
  }

  @js.native
  @Factory
  trait CreateSimulationJobResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var dataSources: js.UndefOr[DataSources]
    var failureBehavior: js.UndefOr[FailureBehavior]
    var failureCode: js.UndefOr[SimulationJobErrorCode]
    var iamRole: js.UndefOr[IamRole]
    var lastStartedAt: js.UndefOr[LastStartedAt]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var loggingConfig: js.UndefOr[LoggingConfig]
    var maxJobDurationInSeconds: js.UndefOr[JobDuration]
    var outputLocation: js.UndefOr[OutputLocation]
    var robotApplications: js.UndefOr[RobotApplicationConfigs]
    var simulationApplications: js.UndefOr[SimulationApplicationConfigs]
    var simulationTimeMillis: js.UndefOr[SimulationTimeMillis]
    var status: js.UndefOr[SimulationJobStatus]
    var tags: js.UndefOr[TagMap]
    var vpcConfig: js.UndefOr[VPCConfigResponse]
  }

  /**
    * Information about a data source.
    */
  @js.native
  @Factory
  trait DataSource extends js.Object {
    var name: js.UndefOr[Name]
    var s3Bucket: js.UndefOr[S3Bucket]
    var s3Keys: js.UndefOr[S3KeyOutputs]
  }

  /**
    * Information about a data source.
    */
  @js.native
  @Factory
  trait DataSourceConfig extends js.Object {
    var name: Name
    var s3Bucket: S3Bucket
    var s3Keys: S3Keys
  }

  @js.native
  @Factory
  trait DeleteFleetRequest extends js.Object {
    var fleet: Arn
  }

  @js.native
  @Factory
  trait DeleteFleetResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteRobotApplicationRequest extends js.Object {
    var application: Arn
    var applicationVersion: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait DeleteRobotApplicationResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteRobotRequest extends js.Object {
    var robot: Arn
  }

  @js.native
  @Factory
  trait DeleteRobotResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteSimulationApplicationRequest extends js.Object {
    var application: Arn
    var applicationVersion: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait DeleteSimulationApplicationResponse extends js.Object {}

  /**
    * Information about a deployment application configuration.
    */
  @js.native
  @Factory
  trait DeploymentApplicationConfig extends js.Object {
    var application: Arn
    var applicationVersion: DeploymentVersion
    var launchConfig: DeploymentLaunchConfig
  }

  /**
    * Information about a deployment configuration.
    */
  @js.native
  @Factory
  trait DeploymentConfig extends js.Object {
    var concurrentDeploymentPercentage: js.UndefOr[Percentage]
    var downloadConditionFile: js.UndefOr[S3Object]
    var failureThresholdPercentage: js.UndefOr[Percentage]
    var robotDeploymentTimeoutInSeconds: js.UndefOr[DeploymentTimeout]
  }

  /**
    * Information about a deployment job.
    */
  @js.native
  @Factory
  trait DeploymentJob extends js.Object {
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[CreatedAt]
    var deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs]
    var deploymentConfig: js.UndefOr[DeploymentConfig]
    var failureCode: js.UndefOr[DeploymentJobErrorCode]
    var failureReason: js.UndefOr[GenericString]
    var fleet: js.UndefOr[Arn]
    var status: js.UndefOr[DeploymentStatus]
  }

  @js.native
  sealed trait DeploymentJobErrorCode extends js.Any
  object DeploymentJobErrorCode extends js.Object {
    val ResourceNotFound                    = "ResourceNotFound".asInstanceOf[DeploymentJobErrorCode]
    val EnvironmentSetupError               = "EnvironmentSetupError".asInstanceOf[DeploymentJobErrorCode]
    val EtagMismatch                        = "EtagMismatch".asInstanceOf[DeploymentJobErrorCode]
    val FailureThresholdBreached            = "FailureThresholdBreached".asInstanceOf[DeploymentJobErrorCode]
    val RobotDeploymentAborted              = "RobotDeploymentAborted".asInstanceOf[DeploymentJobErrorCode]
    val RobotDeploymentNoResponse           = "RobotDeploymentNoResponse".asInstanceOf[DeploymentJobErrorCode]
    val RobotAgentConnectionTimeout         = "RobotAgentConnectionTimeout".asInstanceOf[DeploymentJobErrorCode]
    val GreengrassDeploymentFailed          = "GreengrassDeploymentFailed".asInstanceOf[DeploymentJobErrorCode]
    val MissingRobotArchitecture            = "MissingRobotArchitecture".asInstanceOf[DeploymentJobErrorCode]
    val MissingRobotApplicationArchitecture = "MissingRobotApplicationArchitecture".asInstanceOf[DeploymentJobErrorCode]
    val MissingRobotDeploymentResource      = "MissingRobotDeploymentResource".asInstanceOf[DeploymentJobErrorCode]
    val GreengrassGroupVersionDoesNotExist  = "GreengrassGroupVersionDoesNotExist".asInstanceOf[DeploymentJobErrorCode]
    val ExtractingBundleFailure             = "ExtractingBundleFailure".asInstanceOf[DeploymentJobErrorCode]
    val PreLaunchFileFailure                = "PreLaunchFileFailure".asInstanceOf[DeploymentJobErrorCode]
    val PostLaunchFileFailure               = "PostLaunchFileFailure".asInstanceOf[DeploymentJobErrorCode]
    val BadPermissionError                  = "BadPermissionError".asInstanceOf[DeploymentJobErrorCode]
    val DownloadConditionFailed             = "DownloadConditionFailed".asInstanceOf[DeploymentJobErrorCode]
    val InternalServerError                 = "InternalServerError".asInstanceOf[DeploymentJobErrorCode]

    val values = js.Object.freeze(
      js.Array(
        ResourceNotFound,
        EnvironmentSetupError,
        EtagMismatch,
        FailureThresholdBreached,
        RobotDeploymentAborted,
        RobotDeploymentNoResponse,
        RobotAgentConnectionTimeout,
        GreengrassDeploymentFailed,
        MissingRobotArchitecture,
        MissingRobotApplicationArchitecture,
        MissingRobotDeploymentResource,
        GreengrassGroupVersionDoesNotExist,
        ExtractingBundleFailure,
        PreLaunchFileFailure,
        PostLaunchFileFailure,
        BadPermissionError,
        DownloadConditionFailed,
        InternalServerError
      )
    )
  }

  /**
    * Configuration information for a deployment launch.
    */
  @js.native
  @Factory
  trait DeploymentLaunchConfig extends js.Object {
    var launchFile: Command
    var packageName: Command
    var environmentVariables: js.UndefOr[EnvironmentVariableMap]
    var postLaunchFile: js.UndefOr[Path]
    var preLaunchFile: js.UndefOr[Path]
  }

  @js.native
  sealed trait DeploymentStatus extends js.Any
  object DeploymentStatus extends js.Object {
    val Pending    = "Pending".asInstanceOf[DeploymentStatus]
    val Preparing  = "Preparing".asInstanceOf[DeploymentStatus]
    val InProgress = "InProgress".asInstanceOf[DeploymentStatus]
    val Failed     = "Failed".asInstanceOf[DeploymentStatus]
    val Succeeded  = "Succeeded".asInstanceOf[DeploymentStatus]
    val Canceled   = "Canceled".asInstanceOf[DeploymentStatus]

    val values = js.Object.freeze(js.Array(Pending, Preparing, InProgress, Failed, Succeeded, Canceled))
  }

  @js.native
  @Factory
  trait DeregisterRobotRequest extends js.Object {
    var fleet: Arn
    var robot: Arn
  }

  @js.native
  @Factory
  trait DeregisterRobotResponse extends js.Object {
    var fleet: js.UndefOr[Arn]
    var robot: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait DescribeDeploymentJobRequest extends js.Object {
    var job: Arn
  }

  @js.native
  @Factory
  trait DescribeDeploymentJobResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[CreatedAt]
    var deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs]
    var deploymentConfig: js.UndefOr[DeploymentConfig]
    var failureCode: js.UndefOr[DeploymentJobErrorCode]
    var failureReason: js.UndefOr[GenericString]
    var fleet: js.UndefOr[Arn]
    var robotDeploymentSummary: js.UndefOr[RobotDeploymentSummary]
    var status: js.UndefOr[DeploymentStatus]
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait DescribeFleetRequest extends js.Object {
    var fleet: Arn
  }

  @js.native
  @Factory
  trait DescribeFleetResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[CreatedAt]
    var lastDeploymentJob: js.UndefOr[Arn]
    var lastDeploymentStatus: js.UndefOr[DeploymentStatus]
    var lastDeploymentTime: js.UndefOr[CreatedAt]
    var name: js.UndefOr[Name]
    var robots: js.UndefOr[Robots]
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait DescribeRobotApplicationRequest extends js.Object {
    var application: Arn
    var applicationVersion: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait DescribeRobotApplicationResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var name: js.UndefOr[Name]
    var revisionId: js.UndefOr[RevisionId]
    var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite]
    var sources: js.UndefOr[Sources]
    var tags: js.UndefOr[TagMap]
    var version: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait DescribeRobotRequest extends js.Object {
    var robot: Arn
  }

  @js.native
  @Factory
  trait DescribeRobotResponse extends js.Object {
    var architecture: js.UndefOr[Architecture]
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[CreatedAt]
    var fleetArn: js.UndefOr[Arn]
    var greengrassGroupId: js.UndefOr[Id]
    var lastDeploymentJob: js.UndefOr[Arn]
    var lastDeploymentTime: js.UndefOr[CreatedAt]
    var name: js.UndefOr[Name]
    var status: js.UndefOr[RobotStatus]
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait DescribeSimulationApplicationRequest extends js.Object {
    var application: Arn
    var applicationVersion: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait DescribeSimulationApplicationResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var name: js.UndefOr[Name]
    var renderingEngine: js.UndefOr[RenderingEngine]
    var revisionId: js.UndefOr[RevisionId]
    var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite]
    var simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite]
    var sources: js.UndefOr[Sources]
    var tags: js.UndefOr[TagMap]
    var version: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait DescribeSimulationJobBatchRequest extends js.Object {
    var batch: Arn
  }

  @js.native
  @Factory
  trait DescribeSimulationJobBatchResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var batchPolicy: js.UndefOr[BatchPolicy]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var createdAt: js.UndefOr[CreatedAt]
    var createdRequests: js.UndefOr[SimulationJobSummaries]
    var failedRequests: js.UndefOr[FailedCreateSimulationJobRequests]
    var failureCode: js.UndefOr[SimulationJobBatchErrorCode]
    var failureReason: js.UndefOr[GenericString]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var pendingRequests: js.UndefOr[CreateSimulationJobRequests]
    var status: js.UndefOr[SimulationJobBatchStatus]
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait DescribeSimulationJobRequest extends js.Object {
    var job: Arn
  }

  @js.native
  @Factory
  trait DescribeSimulationJobResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var dataSources: js.UndefOr[DataSources]
    var failureBehavior: js.UndefOr[FailureBehavior]
    var failureCode: js.UndefOr[SimulationJobErrorCode]
    var failureReason: js.UndefOr[GenericString]
    var iamRole: js.UndefOr[IamRole]
    var lastStartedAt: js.UndefOr[LastStartedAt]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var loggingConfig: js.UndefOr[LoggingConfig]
    var maxJobDurationInSeconds: js.UndefOr[JobDuration]
    var name: js.UndefOr[Name]
    var networkInterface: js.UndefOr[NetworkInterface]
    var outputLocation: js.UndefOr[OutputLocation]
    var robotApplications: js.UndefOr[RobotApplicationConfigs]
    var simulationApplications: js.UndefOr[SimulationApplicationConfigs]
    var simulationTimeMillis: js.UndefOr[SimulationTimeMillis]
    var status: js.UndefOr[SimulationJobStatus]
    var tags: js.UndefOr[TagMap]
    var vpcConfig: js.UndefOr[VPCConfigResponse]
  }

  /**
    * Information about a failed create simulation job request.
    */
  @js.native
  @Factory
  trait FailedCreateSimulationJobRequest extends js.Object {
    var failedAt: js.UndefOr[FailedAt]
    var failureCode: js.UndefOr[SimulationJobErrorCode]
    var failureReason: js.UndefOr[GenericString]
    var request: js.UndefOr[SimulationJobRequest]
  }

  @js.native
  sealed trait FailureBehavior extends js.Any
  object FailureBehavior extends js.Object {
    val Fail     = "Fail".asInstanceOf[FailureBehavior]
    val Continue = "Continue".asInstanceOf[FailureBehavior]

    val values = js.Object.freeze(js.Array(Fail, Continue))
  }

  /**
    * Information about a filter.
    */
  @js.native
  @Factory
  trait Filter extends js.Object {
    var name: js.UndefOr[Name]
    var values: js.UndefOr[FilterValues]
  }

  /**
    * Information about a fleet.
    */
  @js.native
  @Factory
  trait Fleet extends js.Object {
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[CreatedAt]
    var lastDeploymentJob: js.UndefOr[Arn]
    var lastDeploymentStatus: js.UndefOr[DeploymentStatus]
    var lastDeploymentTime: js.UndefOr[CreatedAt]
    var name: js.UndefOr[Name]
  }

  /**
    * Information about a launch configuration.
    */
  @js.native
  @Factory
  trait LaunchConfig extends js.Object {
    var launchFile: Command
    var packageName: Command
    var environmentVariables: js.UndefOr[EnvironmentVariableMap]
    var portForwardingConfig: js.UndefOr[PortForwardingConfig]
  }

  @js.native
  @Factory
  trait ListDeploymentJobsRequest extends js.Object {
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListDeploymentJobsResponse extends js.Object {
    var deploymentJobs: js.UndefOr[DeploymentJobs]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListFleetsRequest extends js.Object {
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListFleetsResponse extends js.Object {
    var fleetDetails: js.UndefOr[Fleets]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListRobotApplicationsRequest extends js.Object {
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
    var versionQualifier: js.UndefOr[VersionQualifier]
  }

  @js.native
  @Factory
  trait ListRobotApplicationsResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var robotApplicationSummaries: js.UndefOr[RobotApplicationSummaries]
  }

  @js.native
  @Factory
  trait ListRobotsRequest extends js.Object {
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListRobotsResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var robots: js.UndefOr[Robots]
  }

  @js.native
  @Factory
  trait ListSimulationApplicationsRequest extends js.Object {
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
    var versionQualifier: js.UndefOr[VersionQualifier]
  }

  @js.native
  @Factory
  trait ListSimulationApplicationsResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var simulationApplicationSummaries: js.UndefOr[SimulationApplicationSummaries]
  }

  @js.native
  @Factory
  trait ListSimulationJobBatchesRequest extends js.Object {
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListSimulationJobBatchesResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var simulationJobBatchSummaries: js.UndefOr[SimulationJobBatchSummaries]
  }

  @js.native
  @Factory
  trait ListSimulationJobsRequest extends js.Object {
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListSimulationJobsResponse extends js.Object {
    var simulationJobSummaries: SimulationJobSummaries
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: Arn
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  /**
    * The logging configuration.
    */
  @js.native
  @Factory
  trait LoggingConfig extends js.Object {
    var recordAllRosTopics: BoxedBoolean
  }

  /**
    * Describes a network interface.
    */
  @js.native
  @Factory
  trait NetworkInterface extends js.Object {
    var networkInterfaceId: js.UndefOr[GenericString]
    var privateIpAddress: js.UndefOr[GenericString]
    var publicIpAddress: js.UndefOr[GenericString]
  }

  /**
    * The output location.
    */
  @js.native
  @Factory
  trait OutputLocation extends js.Object {
    var s3Bucket: js.UndefOr[S3Bucket]
    var s3Prefix: js.UndefOr[S3Key]
  }

  /**
    * Configuration information for port forwarding.
    */
  @js.native
  @Factory
  trait PortForwardingConfig extends js.Object {
    var portMappings: js.UndefOr[PortMappingList]
  }

  /**
    * An object representing a port mapping.
    */
  @js.native
  @Factory
  trait PortMapping extends js.Object {
    var applicationPort: NonSystemPort
    var jobPort: Port
    var enableOnPublicIp: js.UndefOr[Boolean]
  }

  /**
    * Information about the progress of a deployment job.
    */
  @js.native
  @Factory
  trait ProgressDetail extends js.Object {
    var currentProgress: js.UndefOr[RobotDeploymentStep]
    var estimatedTimeRemainingSeconds: js.UndefOr[GenericInteger]
    var percentDone: js.UndefOr[PercentDone]
    var targetResource: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait RegisterRobotRequest extends js.Object {
    var fleet: Arn
    var robot: Arn
  }

  @js.native
  @Factory
  trait RegisterRobotResponse extends js.Object {
    var fleet: js.UndefOr[Arn]
    var robot: js.UndefOr[Arn]
  }

  /**
    * Information about a rendering engine.
    */
  @js.native
  @Factory
  trait RenderingEngine extends js.Object {
    var name: js.UndefOr[RenderingEngineType]
    var version: js.UndefOr[RenderingEngineVersionType]
  }

  @js.native
  sealed trait RenderingEngineType extends js.Any
  object RenderingEngineType extends js.Object {
    val OGRE = "OGRE".asInstanceOf[RenderingEngineType]

    val values = js.Object.freeze(js.Array(OGRE))
  }

  @js.native
  @Factory
  trait RestartSimulationJobRequest extends js.Object {
    var job: Arn
  }

  @js.native
  @Factory
  trait RestartSimulationJobResponse extends js.Object {}

  /**
    * Information about a robot.
    */
  @js.native
  @Factory
  trait Robot extends js.Object {
    var architecture: js.UndefOr[Architecture]
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[CreatedAt]
    var fleetArn: js.UndefOr[Arn]
    var greenGrassGroupId: js.UndefOr[Id]
    var lastDeploymentJob: js.UndefOr[Arn]
    var lastDeploymentTime: js.UndefOr[CreatedAt]
    var name: js.UndefOr[Name]
    var status: js.UndefOr[RobotStatus]
  }

  /**
    * Application configuration information for a robot.
    */
  @js.native
  @Factory
  trait RobotApplicationConfig extends js.Object {
    var application: Arn
    var launchConfig: LaunchConfig
    var applicationVersion: js.UndefOr[Version]
  }

  /**
    * Summary information for a robot application.
    */
  @js.native
  @Factory
  trait RobotApplicationSummary extends js.Object {
    var arn: js.UndefOr[Arn]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var name: js.UndefOr[Name]
    var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite]
    var version: js.UndefOr[Version]
  }

  /**
    * Information about a robot deployment.
    */
  @js.native
  @Factory
  trait RobotDeployment extends js.Object {
    var arn: js.UndefOr[Arn]
    var deploymentFinishTime: js.UndefOr[CreatedAt]
    var deploymentStartTime: js.UndefOr[CreatedAt]
    var failureCode: js.UndefOr[DeploymentJobErrorCode]
    var failureReason: js.UndefOr[GenericString]
    var progressDetail: js.UndefOr[ProgressDetail]
    var status: js.UndefOr[RobotStatus]
  }

  @js.native
  sealed trait RobotDeploymentStep extends js.Any
  object RobotDeploymentStep extends js.Object {
    val Validating                 = "Validating".asInstanceOf[RobotDeploymentStep]
    val DownloadingExtracting      = "DownloadingExtracting".asInstanceOf[RobotDeploymentStep]
    val ExecutingDownloadCondition = "ExecutingDownloadCondition".asInstanceOf[RobotDeploymentStep]
    val ExecutingPreLaunch         = "ExecutingPreLaunch".asInstanceOf[RobotDeploymentStep]
    val Launching                  = "Launching".asInstanceOf[RobotDeploymentStep]
    val ExecutingPostLaunch        = "ExecutingPostLaunch".asInstanceOf[RobotDeploymentStep]
    val Finished                   = "Finished".asInstanceOf[RobotDeploymentStep]

    val values = js.Object.freeze(
      js.Array(
        Validating,
        DownloadingExtracting,
        ExecutingDownloadCondition,
        ExecutingPreLaunch,
        Launching,
        ExecutingPostLaunch,
        Finished
      )
    )
  }

  /**
    * Information about a robot software suite (ROS distribution).
    */
  @js.native
  @Factory
  trait RobotSoftwareSuite extends js.Object {
    var name: js.UndefOr[RobotSoftwareSuiteType]
    var version: js.UndefOr[RobotSoftwareSuiteVersionType]
  }

  @js.native
  sealed trait RobotSoftwareSuiteType extends js.Any
  object RobotSoftwareSuiteType extends js.Object {
    val ROS  = "ROS".asInstanceOf[RobotSoftwareSuiteType]
    val ROS2 = "ROS2".asInstanceOf[RobotSoftwareSuiteType]

    val values = js.Object.freeze(js.Array(ROS, ROS2))
  }

  @js.native
  sealed trait RobotSoftwareSuiteVersionType extends js.Any
  object RobotSoftwareSuiteVersionType extends js.Object {
    val Kinetic = "Kinetic".asInstanceOf[RobotSoftwareSuiteVersionType]
    val Melodic = "Melodic".asInstanceOf[RobotSoftwareSuiteVersionType]
    val Dashing = "Dashing".asInstanceOf[RobotSoftwareSuiteVersionType]

    val values = js.Object.freeze(js.Array(Kinetic, Melodic, Dashing))
  }

  @js.native
  sealed trait RobotStatus extends js.Any
  object RobotStatus extends js.Object {
    val Available            = "Available".asInstanceOf[RobotStatus]
    val Registered           = "Registered".asInstanceOf[RobotStatus]
    val PendingNewDeployment = "PendingNewDeployment".asInstanceOf[RobotStatus]
    val Deploying            = "Deploying".asInstanceOf[RobotStatus]
    val Failed               = "Failed".asInstanceOf[RobotStatus]
    val InSync               = "InSync".asInstanceOf[RobotStatus]
    val NoResponse           = "NoResponse".asInstanceOf[RobotStatus]

    val values =
      js.Object.freeze(js.Array(Available, Registered, PendingNewDeployment, Deploying, Failed, InSync, NoResponse))
  }

  /**
    * Information about S3 keys.
    */
  @js.native
  @Factory
  trait S3KeyOutput extends js.Object {
    var etag: js.UndefOr[S3Etag]
    var s3Key: js.UndefOr[S3Key]
  }

  /**
    * Information about an S3 object.
    */
  @js.native
  @Factory
  trait S3Object extends js.Object {
    var bucket: S3Bucket
    var key: S3Key
    var etag: js.UndefOr[S3Etag]
  }

  /**
    * Information about a simulation application configuration.
    */
  @js.native
  @Factory
  trait SimulationApplicationConfig extends js.Object {
    var application: Arn
    var launchConfig: LaunchConfig
    var applicationVersion: js.UndefOr[Version]
  }

  /**
    * Summary information for a simulation application.
    */
  @js.native
  @Factory
  trait SimulationApplicationSummary extends js.Object {
    var arn: js.UndefOr[Arn]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var name: js.UndefOr[Name]
    var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite]
    var simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite]
    var version: js.UndefOr[Version]
  }

  /**
    * Information about a simulation job.
    */
  @js.native
  @Factory
  trait SimulationJob extends js.Object {
    var arn: js.UndefOr[Arn]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var dataSources: js.UndefOr[DataSources]
    var failureBehavior: js.UndefOr[FailureBehavior]
    var failureCode: js.UndefOr[SimulationJobErrorCode]
    var failureReason: js.UndefOr[GenericString]
    var iamRole: js.UndefOr[IamRole]
    var lastStartedAt: js.UndefOr[LastStartedAt]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var loggingConfig: js.UndefOr[LoggingConfig]
    var maxJobDurationInSeconds: js.UndefOr[JobDuration]
    var name: js.UndefOr[Name]
    var networkInterface: js.UndefOr[NetworkInterface]
    var outputLocation: js.UndefOr[OutputLocation]
    var robotApplications: js.UndefOr[RobotApplicationConfigs]
    var simulationApplications: js.UndefOr[SimulationApplicationConfigs]
    var simulationTimeMillis: js.UndefOr[SimulationTimeMillis]
    var status: js.UndefOr[SimulationJobStatus]
    var tags: js.UndefOr[TagMap]
    var vpcConfig: js.UndefOr[VPCConfigResponse]
  }

  @js.native
  sealed trait SimulationJobBatchErrorCode extends js.Any
  object SimulationJobBatchErrorCode extends js.Object {
    val InternalServiceError = "InternalServiceError".asInstanceOf[SimulationJobBatchErrorCode]

    val values = js.Object.freeze(js.Array(InternalServiceError))
  }

  @js.native
  sealed trait SimulationJobBatchStatus extends js.Any
  object SimulationJobBatchStatus extends js.Object {
    val Pending    = "Pending".asInstanceOf[SimulationJobBatchStatus]
    val InProgress = "InProgress".asInstanceOf[SimulationJobBatchStatus]
    val Failed     = "Failed".asInstanceOf[SimulationJobBatchStatus]
    val Completed  = "Completed".asInstanceOf[SimulationJobBatchStatus]
    val Canceled   = "Canceled".asInstanceOf[SimulationJobBatchStatus]
    val Canceling  = "Canceling".asInstanceOf[SimulationJobBatchStatus]
    val Completing = "Completing".asInstanceOf[SimulationJobBatchStatus]
    val TimingOut  = "TimingOut".asInstanceOf[SimulationJobBatchStatus]
    val TimedOut   = "TimedOut".asInstanceOf[SimulationJobBatchStatus]

    val values = js.Object.freeze(
      js.Array(Pending, InProgress, Failed, Completed, Canceled, Canceling, Completing, TimingOut, TimedOut)
    )
  }

  /**
    * Information about a simulation job batch.
    */
  @js.native
  @Factory
  trait SimulationJobBatchSummary extends js.Object {
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[CreatedAt]
    var createdRequestCount: js.UndefOr[Int]
    var failedRequestCount: js.UndefOr[Int]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var pendingRequestCount: js.UndefOr[Int]
    var status: js.UndefOr[SimulationJobBatchStatus]
  }

  @js.native
  sealed trait SimulationJobErrorCode extends js.Any
  object SimulationJobErrorCode extends js.Object {
    val InternalServiceError                = "InternalServiceError".asInstanceOf[SimulationJobErrorCode]
    val RobotApplicationCrash               = "RobotApplicationCrash".asInstanceOf[SimulationJobErrorCode]
    val SimulationApplicationCrash          = "SimulationApplicationCrash".asInstanceOf[SimulationJobErrorCode]
    val BadPermissionsRobotApplication      = "BadPermissionsRobotApplication".asInstanceOf[SimulationJobErrorCode]
    val BadPermissionsSimulationApplication = "BadPermissionsSimulationApplication".asInstanceOf[SimulationJobErrorCode]
    val BadPermissionsS3Object              = "BadPermissionsS3Object".asInstanceOf[SimulationJobErrorCode]
    val BadPermissionsS3Output              = "BadPermissionsS3Output".asInstanceOf[SimulationJobErrorCode]
    val BadPermissionsCloudwatchLogs        = "BadPermissionsCloudwatchLogs".asInstanceOf[SimulationJobErrorCode]
    val SubnetIpLimitExceeded               = "SubnetIpLimitExceeded".asInstanceOf[SimulationJobErrorCode]
    val ENILimitExceeded                    = "ENILimitExceeded".asInstanceOf[SimulationJobErrorCode]
    val BadPermissionsUserCredentials       = "BadPermissionsUserCredentials".asInstanceOf[SimulationJobErrorCode]
    val InvalidBundleRobotApplication       = "InvalidBundleRobotApplication".asInstanceOf[SimulationJobErrorCode]
    val InvalidBundleSimulationApplication  = "InvalidBundleSimulationApplication".asInstanceOf[SimulationJobErrorCode]
    val InvalidS3Resource                   = "InvalidS3Resource".asInstanceOf[SimulationJobErrorCode]
    val LimitExceeded                       = "LimitExceeded".asInstanceOf[SimulationJobErrorCode]
    val MismatchedEtag                      = "MismatchedEtag".asInstanceOf[SimulationJobErrorCode]
    val RobotApplicationVersionMismatchedEtag =
      "RobotApplicationVersionMismatchedEtag".asInstanceOf[SimulationJobErrorCode]
    val SimulationApplicationVersionMismatchedEtag =
      "SimulationApplicationVersionMismatchedEtag".asInstanceOf[SimulationJobErrorCode]
    val ResourceNotFound                 = "ResourceNotFound".asInstanceOf[SimulationJobErrorCode]
    val RequestThrottled                 = "RequestThrottled".asInstanceOf[SimulationJobErrorCode]
    val BatchTimedOut                    = "BatchTimedOut".asInstanceOf[SimulationJobErrorCode]
    val BatchCanceled                    = "BatchCanceled".asInstanceOf[SimulationJobErrorCode]
    val InvalidInput                     = "InvalidInput".asInstanceOf[SimulationJobErrorCode]
    val WrongRegionS3Bucket              = "WrongRegionS3Bucket".asInstanceOf[SimulationJobErrorCode]
    val WrongRegionS3Output              = "WrongRegionS3Output".asInstanceOf[SimulationJobErrorCode]
    val WrongRegionRobotApplication      = "WrongRegionRobotApplication".asInstanceOf[SimulationJobErrorCode]
    val WrongRegionSimulationApplication = "WrongRegionSimulationApplication".asInstanceOf[SimulationJobErrorCode]

    val values = js.Object.freeze(
      js.Array(
        InternalServiceError,
        RobotApplicationCrash,
        SimulationApplicationCrash,
        BadPermissionsRobotApplication,
        BadPermissionsSimulationApplication,
        BadPermissionsS3Object,
        BadPermissionsS3Output,
        BadPermissionsCloudwatchLogs,
        SubnetIpLimitExceeded,
        ENILimitExceeded,
        BadPermissionsUserCredentials,
        InvalidBundleRobotApplication,
        InvalidBundleSimulationApplication,
        InvalidS3Resource,
        LimitExceeded,
        MismatchedEtag,
        RobotApplicationVersionMismatchedEtag,
        SimulationApplicationVersionMismatchedEtag,
        ResourceNotFound,
        RequestThrottled,
        BatchTimedOut,
        BatchCanceled,
        InvalidInput,
        WrongRegionS3Bucket,
        WrongRegionS3Output,
        WrongRegionRobotApplication,
        WrongRegionSimulationApplication
      )
    )
  }

  /**
    * Information about a simulation job request.
    */
  @js.native
  @Factory
  trait SimulationJobRequest extends js.Object {
    var maxJobDurationInSeconds: JobDuration
    var dataSources: js.UndefOr[DataSourceConfigs]
    var failureBehavior: js.UndefOr[FailureBehavior]
    var iamRole: js.UndefOr[IamRole]
    var loggingConfig: js.UndefOr[LoggingConfig]
    var outputLocation: js.UndefOr[OutputLocation]
    var robotApplications: js.UndefOr[RobotApplicationConfigs]
    var simulationApplications: js.UndefOr[SimulationApplicationConfigs]
    var tags: js.UndefOr[TagMap]
    var useDefaultApplications: js.UndefOr[BoxedBoolean]
    var vpcConfig: js.UndefOr[VPCConfig]
  }

  @js.native
  sealed trait SimulationJobStatus extends js.Any
  object SimulationJobStatus extends js.Object {
    val Pending       = "Pending".asInstanceOf[SimulationJobStatus]
    val Preparing     = "Preparing".asInstanceOf[SimulationJobStatus]
    val Running       = "Running".asInstanceOf[SimulationJobStatus]
    val Restarting    = "Restarting".asInstanceOf[SimulationJobStatus]
    val Completed     = "Completed".asInstanceOf[SimulationJobStatus]
    val Failed        = "Failed".asInstanceOf[SimulationJobStatus]
    val RunningFailed = "RunningFailed".asInstanceOf[SimulationJobStatus]
    val Terminating   = "Terminating".asInstanceOf[SimulationJobStatus]
    val Terminated    = "Terminated".asInstanceOf[SimulationJobStatus]
    val Canceled      = "Canceled".asInstanceOf[SimulationJobStatus]

    val values = js.Object.freeze(
      js.Array(
        Pending,
        Preparing,
        Running,
        Restarting,
        Completed,
        Failed,
        RunningFailed,
        Terminating,
        Terminated,
        Canceled
      )
    )
  }

  /**
    * Summary information for a simulation job.
    */
  @js.native
  @Factory
  trait SimulationJobSummary extends js.Object {
    var arn: js.UndefOr[Arn]
    var dataSourceNames: js.UndefOr[DataSourceNames]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var name: js.UndefOr[Name]
    var robotApplicationNames: js.UndefOr[RobotApplicationNames]
    var simulationApplicationNames: js.UndefOr[SimulationApplicationNames]
    var status: js.UndefOr[SimulationJobStatus]
  }

  /**
    * Information about a simulation software suite.
    */
  @js.native
  @Factory
  trait SimulationSoftwareSuite extends js.Object {
    var name: js.UndefOr[SimulationSoftwareSuiteType]
    var version: js.UndefOr[SimulationSoftwareSuiteVersionType]
  }

  @js.native
  sealed trait SimulationSoftwareSuiteType extends js.Any
  object SimulationSoftwareSuiteType extends js.Object {
    val Gazebo     = "Gazebo".asInstanceOf[SimulationSoftwareSuiteType]
    val RosbagPlay = "RosbagPlay".asInstanceOf[SimulationSoftwareSuiteType]

    val values = js.Object.freeze(js.Array(Gazebo, RosbagPlay))
  }

  /**
    * Information about a source.
    */
  @js.native
  @Factory
  trait Source extends js.Object {
    var architecture: js.UndefOr[Architecture]
    var etag: js.UndefOr[S3Etag]
    var s3Bucket: js.UndefOr[S3Bucket]
    var s3Key: js.UndefOr[S3Key]
  }

  /**
    * Information about a source configuration.
    */
  @js.native
  @Factory
  trait SourceConfig extends js.Object {
    var architecture: js.UndefOr[Architecture]
    var s3Bucket: js.UndefOr[S3Bucket]
    var s3Key: js.UndefOr[S3Key]
  }

  @js.native
  @Factory
  trait StartSimulationJobBatchRequest extends js.Object {
    var createSimulationJobRequests: CreateSimulationJobRequests
    var batchPolicy: js.UndefOr[BatchPolicy]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait StartSimulationJobBatchResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var batchPolicy: js.UndefOr[BatchPolicy]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var createdAt: js.UndefOr[CreatedAt]
    var createdRequests: js.UndefOr[SimulationJobSummaries]
    var failedRequests: js.UndefOr[FailedCreateSimulationJobRequests]
    var failureCode: js.UndefOr[SimulationJobBatchErrorCode]
    var failureReason: js.UndefOr[GenericString]
    var pendingRequests: js.UndefOr[CreateSimulationJobRequests]
    var status: js.UndefOr[SimulationJobBatchStatus]
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait SyncDeploymentJobRequest extends js.Object {
    var clientRequestToken: ClientRequestToken
    var fleet: Arn
  }

  @js.native
  @Factory
  trait SyncDeploymentJobResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[CreatedAt]
    var deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs]
    var deploymentConfig: js.UndefOr[DeploymentConfig]
    var failureCode: js.UndefOr[DeploymentJobErrorCode]
    var failureReason: js.UndefOr[GenericString]
    var fleet: js.UndefOr[Arn]
    var status: js.UndefOr[DeploymentStatus]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tags: TagMap
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateRobotApplicationRequest extends js.Object {
    var application: Arn
    var robotSoftwareSuite: RobotSoftwareSuite
    var sources: SourceConfigs
    var currentRevisionId: js.UndefOr[RevisionId]
  }

  @js.native
  @Factory
  trait UpdateRobotApplicationResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var name: js.UndefOr[Name]
    var revisionId: js.UndefOr[RevisionId]
    var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite]
    var sources: js.UndefOr[Sources]
    var version: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait UpdateSimulationApplicationRequest extends js.Object {
    var application: Arn
    var robotSoftwareSuite: RobotSoftwareSuite
    var simulationSoftwareSuite: SimulationSoftwareSuite
    var sources: SourceConfigs
    var currentRevisionId: js.UndefOr[RevisionId]
    var renderingEngine: js.UndefOr[RenderingEngine]
  }

  @js.native
  @Factory
  trait UpdateSimulationApplicationResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var name: js.UndefOr[Name]
    var renderingEngine: js.UndefOr[RenderingEngine]
    var revisionId: js.UndefOr[RevisionId]
    var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite]
    var simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite]
    var sources: js.UndefOr[Sources]
    var version: js.UndefOr[Version]
  }

  /**
    * If your simulation job accesses resources in a VPC, you provide this parameter identifying the list of security group IDs and subnet IDs. These must belong to the same VPC. You must provide at least one security group and two subnet IDs.
    */
  @js.native
  @Factory
  trait VPCConfig extends js.Object {
    var subnets: Subnets
    var assignPublicIp: js.UndefOr[Boolean]
    var securityGroups: js.UndefOr[SecurityGroups]
  }

  /**
    * VPC configuration associated with your simulation job.
    */
  @js.native
  @Factory
  trait VPCConfigResponse extends js.Object {
    var assignPublicIp: js.UndefOr[Boolean]
    var securityGroups: js.UndefOr[SecurityGroups]
    var subnets: js.UndefOr[Subnets]
    var vpcId: js.UndefOr[GenericString]
  }
}
