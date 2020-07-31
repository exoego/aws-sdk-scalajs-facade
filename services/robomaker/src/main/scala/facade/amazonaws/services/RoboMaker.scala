package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object robomaker {
  type Arn = String
  type Arns = js.Array[Arn]
  type BatchTimeoutInSeconds = Double
  type BoxedBoolean = Boolean
  type ClientRequestToken = String
  type Command = String
  type CreateSimulationJobRequests = js.Array[SimulationJobRequest]
  type CreatedAt = js.Date
  type DataSourceConfigs = js.Array[DataSourceConfig]
  type DataSourceNames = js.Array[Name]
  type DataSources = js.Array[DataSource]
  type DeploymentApplicationConfigs = js.Array[DeploymentApplicationConfig]
  type DeploymentJobs = js.Array[DeploymentJob]
  type DeploymentTimeout = Double
  type DeploymentVersion = String
  type EnvironmentVariableKey = String
  type EnvironmentVariableMap = js.Dictionary[EnvironmentVariableValue]
  type EnvironmentVariableValue = String
  type FailedAt = js.Date
  type FailedCreateSimulationJobRequests = js.Array[FailedCreateSimulationJobRequest]
  type FilterValues = js.Array[Name]
  type Filters = js.Array[Filter]
  type Fleets = js.Array[Fleet]
  type GenericInteger = Int
  type GenericString = String
  type IamRole = String
  type Id = String
  type JobDuration = Double
  type LastStartedAt = js.Date
  type LastUpdatedAt = js.Date
  type MaxConcurrency = Int
  type MaxResults = Int
  type Name = String
  type NonEmptyString = String
  type NonSystemPort = Int
  type PaginationToken = String
  type Path = String
  type PercentDone = Float
  type Percentage = Int
  type Port = Int
  type PortMappingList = js.Array[PortMapping]
  type RenderingEngineVersionType = String
  type RevisionId = String
  type RobotApplicationConfigs = js.Array[RobotApplicationConfig]
  type RobotApplicationNames = js.Array[Name]
  type RobotApplicationSummaries = js.Array[RobotApplicationSummary]
  type RobotDeploymentSummary = js.Array[RobotDeployment]
  type Robots = js.Array[Robot]
  type S3Bucket = String
  type S3Etag = String
  type S3Key = String
  type S3KeyOutputs = js.Array[S3KeyOutput]
  type S3Keys = js.Array[S3Key]
  type SecurityGroups = js.Array[NonEmptyString]
  type SimulationApplicationConfigs = js.Array[SimulationApplicationConfig]
  type SimulationApplicationNames = js.Array[Name]
  type SimulationApplicationSummaries = js.Array[SimulationApplicationSummary]
  type SimulationJobBatchSummaries = js.Array[SimulationJobBatchSummary]
  type SimulationJobSummaries = js.Array[SimulationJobSummary]
  type SimulationJobs = js.Array[SimulationJob]
  type SimulationSoftwareSuiteVersionType = String
  type SimulationTimeMillis = Double
  type SimulationUnit = Int
  type SourceConfigs = js.Array[SourceConfig]
  type Sources = js.Array[Source]
  type Subnets = js.Array[NonEmptyString]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Version = String
  type VersionQualifier = String

  implicit final class RoboMakerOps(private val service: RoboMaker) extends AnyVal {

    @inline def batchDescribeSimulationJobFuture(params: BatchDescribeSimulationJobRequest): Future[BatchDescribeSimulationJobResponse] = service.batchDescribeSimulationJob(params).promise().toFuture
    @inline def cancelDeploymentJobFuture(params: CancelDeploymentJobRequest): Future[CancelDeploymentJobResponse] = service.cancelDeploymentJob(params).promise().toFuture
    @inline def cancelSimulationJobBatchFuture(params: CancelSimulationJobBatchRequest): Future[CancelSimulationJobBatchResponse] = service.cancelSimulationJobBatch(params).promise().toFuture
    @inline def cancelSimulationJobFuture(params: CancelSimulationJobRequest): Future[CancelSimulationJobResponse] = service.cancelSimulationJob(params).promise().toFuture
    @inline def createDeploymentJobFuture(params: CreateDeploymentJobRequest): Future[CreateDeploymentJobResponse] = service.createDeploymentJob(params).promise().toFuture
    @inline def createFleetFuture(params: CreateFleetRequest): Future[CreateFleetResponse] = service.createFleet(params).promise().toFuture
    @inline def createRobotApplicationFuture(params: CreateRobotApplicationRequest): Future[CreateRobotApplicationResponse] = service.createRobotApplication(params).promise().toFuture
    @inline def createRobotApplicationVersionFuture(params: CreateRobotApplicationVersionRequest): Future[CreateRobotApplicationVersionResponse] = service.createRobotApplicationVersion(params).promise().toFuture
    @inline def createRobotFuture(params: CreateRobotRequest): Future[CreateRobotResponse] = service.createRobot(params).promise().toFuture
    @inline def createSimulationApplicationFuture(params: CreateSimulationApplicationRequest): Future[CreateSimulationApplicationResponse] = service.createSimulationApplication(params).promise().toFuture
    @inline def createSimulationApplicationVersionFuture(params: CreateSimulationApplicationVersionRequest): Future[CreateSimulationApplicationVersionResponse] = service.createSimulationApplicationVersion(params).promise().toFuture
    @inline def createSimulationJobFuture(params: CreateSimulationJobRequest): Future[CreateSimulationJobResponse] = service.createSimulationJob(params).promise().toFuture
    @inline def deleteFleetFuture(params: DeleteFleetRequest): Future[DeleteFleetResponse] = service.deleteFleet(params).promise().toFuture
    @inline def deleteRobotApplicationFuture(params: DeleteRobotApplicationRequest): Future[DeleteRobotApplicationResponse] = service.deleteRobotApplication(params).promise().toFuture
    @inline def deleteRobotFuture(params: DeleteRobotRequest): Future[DeleteRobotResponse] = service.deleteRobot(params).promise().toFuture
    @inline def deleteSimulationApplicationFuture(params: DeleteSimulationApplicationRequest): Future[DeleteSimulationApplicationResponse] = service.deleteSimulationApplication(params).promise().toFuture
    @inline def deregisterRobotFuture(params: DeregisterRobotRequest): Future[DeregisterRobotResponse] = service.deregisterRobot(params).promise().toFuture
    @inline def describeDeploymentJobFuture(params: DescribeDeploymentJobRequest): Future[DescribeDeploymentJobResponse] = service.describeDeploymentJob(params).promise().toFuture
    @inline def describeFleetFuture(params: DescribeFleetRequest): Future[DescribeFleetResponse] = service.describeFleet(params).promise().toFuture
    @inline def describeRobotApplicationFuture(params: DescribeRobotApplicationRequest): Future[DescribeRobotApplicationResponse] = service.describeRobotApplication(params).promise().toFuture
    @inline def describeRobotFuture(params: DescribeRobotRequest): Future[DescribeRobotResponse] = service.describeRobot(params).promise().toFuture
    @inline def describeSimulationApplicationFuture(params: DescribeSimulationApplicationRequest): Future[DescribeSimulationApplicationResponse] = service.describeSimulationApplication(params).promise().toFuture
    @inline def describeSimulationJobBatchFuture(params: DescribeSimulationJobBatchRequest): Future[DescribeSimulationJobBatchResponse] = service.describeSimulationJobBatch(params).promise().toFuture
    @inline def describeSimulationJobFuture(params: DescribeSimulationJobRequest): Future[DescribeSimulationJobResponse] = service.describeSimulationJob(params).promise().toFuture
    @inline def listDeploymentJobsFuture(params: ListDeploymentJobsRequest): Future[ListDeploymentJobsResponse] = service.listDeploymentJobs(params).promise().toFuture
    @inline def listFleetsFuture(params: ListFleetsRequest): Future[ListFleetsResponse] = service.listFleets(params).promise().toFuture
    @inline def listRobotApplicationsFuture(params: ListRobotApplicationsRequest): Future[ListRobotApplicationsResponse] = service.listRobotApplications(params).promise().toFuture
    @inline def listRobotsFuture(params: ListRobotsRequest): Future[ListRobotsResponse] = service.listRobots(params).promise().toFuture
    @inline def listSimulationApplicationsFuture(params: ListSimulationApplicationsRequest): Future[ListSimulationApplicationsResponse] = service.listSimulationApplications(params).promise().toFuture
    @inline def listSimulationJobBatchesFuture(params: ListSimulationJobBatchesRequest): Future[ListSimulationJobBatchesResponse] = service.listSimulationJobBatches(params).promise().toFuture
    @inline def listSimulationJobsFuture(params: ListSimulationJobsRequest): Future[ListSimulationJobsResponse] = service.listSimulationJobs(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def registerRobotFuture(params: RegisterRobotRequest): Future[RegisterRobotResponse] = service.registerRobot(params).promise().toFuture
    @inline def restartSimulationJobFuture(params: RestartSimulationJobRequest): Future[RestartSimulationJobResponse] = service.restartSimulationJob(params).promise().toFuture
    @inline def startSimulationJobBatchFuture(params: StartSimulationJobBatchRequest): Future[StartSimulationJobBatchResponse] = service.startSimulationJobBatch(params).promise().toFuture
    @inline def syncDeploymentJobFuture(params: SyncDeploymentJobRequest): Future[SyncDeploymentJobResponse] = service.syncDeploymentJob(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateRobotApplicationFuture(params: UpdateRobotApplicationRequest): Future[UpdateRobotApplicationResponse] = service.updateRobotApplication(params).promise().toFuture
    @inline def updateSimulationApplicationFuture(params: UpdateSimulationApplicationRequest): Future[UpdateSimulationApplicationResponse] = service.updateSimulationApplication(params).promise().toFuture
  }
}

package robomaker {
  @js.native
  @JSImport("aws-sdk", "RoboMaker", "AWS.RoboMaker")
  class RoboMaker() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchDescribeSimulationJob(params: BatchDescribeSimulationJobRequest): Request[BatchDescribeSimulationJobResponse] = js.native
    def cancelDeploymentJob(params: CancelDeploymentJobRequest): Request[CancelDeploymentJobResponse] = js.native
    def cancelSimulationJob(params: CancelSimulationJobRequest): Request[CancelSimulationJobResponse] = js.native
    def cancelSimulationJobBatch(params: CancelSimulationJobBatchRequest): Request[CancelSimulationJobBatchResponse] = js.native
    def createDeploymentJob(params: CreateDeploymentJobRequest): Request[CreateDeploymentJobResponse] = js.native
    def createFleet(params: CreateFleetRequest): Request[CreateFleetResponse] = js.native
    def createRobot(params: CreateRobotRequest): Request[CreateRobotResponse] = js.native
    def createRobotApplication(params: CreateRobotApplicationRequest): Request[CreateRobotApplicationResponse] = js.native
    def createRobotApplicationVersion(params: CreateRobotApplicationVersionRequest): Request[CreateRobotApplicationVersionResponse] = js.native
    def createSimulationApplication(params: CreateSimulationApplicationRequest): Request[CreateSimulationApplicationResponse] = js.native
    def createSimulationApplicationVersion(params: CreateSimulationApplicationVersionRequest): Request[CreateSimulationApplicationVersionResponse] = js.native
    def createSimulationJob(params: CreateSimulationJobRequest): Request[CreateSimulationJobResponse] = js.native
    def deleteFleet(params: DeleteFleetRequest): Request[DeleteFleetResponse] = js.native
    def deleteRobot(params: DeleteRobotRequest): Request[DeleteRobotResponse] = js.native
    def deleteRobotApplication(params: DeleteRobotApplicationRequest): Request[DeleteRobotApplicationResponse] = js.native
    def deleteSimulationApplication(params: DeleteSimulationApplicationRequest): Request[DeleteSimulationApplicationResponse] = js.native
    def deregisterRobot(params: DeregisterRobotRequest): Request[DeregisterRobotResponse] = js.native
    def describeDeploymentJob(params: DescribeDeploymentJobRequest): Request[DescribeDeploymentJobResponse] = js.native
    def describeFleet(params: DescribeFleetRequest): Request[DescribeFleetResponse] = js.native
    def describeRobot(params: DescribeRobotRequest): Request[DescribeRobotResponse] = js.native
    def describeRobotApplication(params: DescribeRobotApplicationRequest): Request[DescribeRobotApplicationResponse] = js.native
    def describeSimulationApplication(params: DescribeSimulationApplicationRequest): Request[DescribeSimulationApplicationResponse] = js.native
    def describeSimulationJob(params: DescribeSimulationJobRequest): Request[DescribeSimulationJobResponse] = js.native
    def describeSimulationJobBatch(params: DescribeSimulationJobBatchRequest): Request[DescribeSimulationJobBatchResponse] = js.native
    def listDeploymentJobs(params: ListDeploymentJobsRequest): Request[ListDeploymentJobsResponse] = js.native
    def listFleets(params: ListFleetsRequest): Request[ListFleetsResponse] = js.native
    def listRobotApplications(params: ListRobotApplicationsRequest): Request[ListRobotApplicationsResponse] = js.native
    def listRobots(params: ListRobotsRequest): Request[ListRobotsResponse] = js.native
    def listSimulationApplications(params: ListSimulationApplicationsRequest): Request[ListSimulationApplicationsResponse] = js.native
    def listSimulationJobBatches(params: ListSimulationJobBatchesRequest): Request[ListSimulationJobBatchesResponse] = js.native
    def listSimulationJobs(params: ListSimulationJobsRequest): Request[ListSimulationJobsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def registerRobot(params: RegisterRobotRequest): Request[RegisterRobotResponse] = js.native
    def restartSimulationJob(params: RestartSimulationJobRequest): Request[RestartSimulationJobResponse] = js.native
    def startSimulationJobBatch(params: StartSimulationJobBatchRequest): Request[StartSimulationJobBatchResponse] = js.native
    def syncDeploymentJob(params: SyncDeploymentJobRequest): Request[SyncDeploymentJobResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateRobotApplication(params: UpdateRobotApplicationRequest): Request[UpdateRobotApplicationResponse] = js.native
    def updateSimulationApplication(params: UpdateSimulationApplicationRequest): Request[UpdateSimulationApplicationResponse] = js.native
  }

  @js.native
  sealed trait Architecture extends js.Any
  object Architecture {
    @inline def X86_64 = "X86_64".asInstanceOf[Architecture]
    @inline def ARM64 = "ARM64".asInstanceOf[Architecture]
    @inline def ARMHF = "ARMHF".asInstanceOf[Architecture]

    @inline def values = js.Object.freeze(js.Array(X86_64, ARM64, ARMHF))
  }

  @js.native
  trait BatchDescribeSimulationJobRequest extends js.Object {
    var jobs: Arns
  }

  object BatchDescribeSimulationJobRequest {
    @inline
    def apply(
        jobs: Arns
    ): BatchDescribeSimulationJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobs" -> jobs.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchDescribeSimulationJobRequest]
    }
  }

  @js.native
  trait BatchDescribeSimulationJobResponse extends js.Object {
    var jobs: js.UndefOr[SimulationJobs]
    var unprocessedJobs: js.UndefOr[Arns]
  }

  object BatchDescribeSimulationJobResponse {
    @inline
    def apply(
        jobs: js.UndefOr[SimulationJobs] = js.undefined,
        unprocessedJobs: js.UndefOr[Arns] = js.undefined
    ): BatchDescribeSimulationJobResponse = {
      val __obj = js.Dynamic.literal()
      jobs.foreach(__v => __obj.updateDynamic("jobs")(__v.asInstanceOf[js.Any]))
      unprocessedJobs.foreach(__v => __obj.updateDynamic("unprocessedJobs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDescribeSimulationJobResponse]
    }
  }

  /**
    * Information about the batch policy.
    */
  @js.native
  trait BatchPolicy extends js.Object {
    var maxConcurrency: js.UndefOr[MaxConcurrency]
    var timeoutInSeconds: js.UndefOr[BatchTimeoutInSeconds]
  }

  object BatchPolicy {
    @inline
    def apply(
        maxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
        timeoutInSeconds: js.UndefOr[BatchTimeoutInSeconds] = js.undefined
    ): BatchPolicy = {
      val __obj = js.Dynamic.literal()
      maxConcurrency.foreach(__v => __obj.updateDynamic("maxConcurrency")(__v.asInstanceOf[js.Any]))
      timeoutInSeconds.foreach(__v => __obj.updateDynamic("timeoutInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchPolicy]
    }
  }

  @js.native
  trait CancelDeploymentJobRequest extends js.Object {
    var job: Arn
  }

  object CancelDeploymentJobRequest {
    @inline
    def apply(
        job: Arn
    ): CancelDeploymentJobRequest = {
      val __obj = js.Dynamic.literal(
        "job" -> job.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelDeploymentJobRequest]
    }
  }

  @js.native
  trait CancelDeploymentJobResponse extends js.Object {}

  object CancelDeploymentJobResponse {
    @inline
    def apply(
    ): CancelDeploymentJobResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CancelDeploymentJobResponse]
    }
  }

  @js.native
  trait CancelSimulationJobBatchRequest extends js.Object {
    var batch: Arn
  }

  object CancelSimulationJobBatchRequest {
    @inline
    def apply(
        batch: Arn
    ): CancelSimulationJobBatchRequest = {
      val __obj = js.Dynamic.literal(
        "batch" -> batch.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelSimulationJobBatchRequest]
    }
  }

  @js.native
  trait CancelSimulationJobBatchResponse extends js.Object {}

  object CancelSimulationJobBatchResponse {
    @inline
    def apply(
    ): CancelSimulationJobBatchResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CancelSimulationJobBatchResponse]
    }
  }

  @js.native
  trait CancelSimulationJobRequest extends js.Object {
    var job: Arn
  }

  object CancelSimulationJobRequest {
    @inline
    def apply(
        job: Arn
    ): CancelSimulationJobRequest = {
      val __obj = js.Dynamic.literal(
        "job" -> job.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelSimulationJobRequest]
    }
  }

  @js.native
  trait CancelSimulationJobResponse extends js.Object {}

  object CancelSimulationJobResponse {
    @inline
    def apply(
    ): CancelSimulationJobResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CancelSimulationJobResponse]
    }
  }

  /**
    * Compute information for the simulation job.
    */
  @js.native
  trait Compute extends js.Object {
    var simulationUnitLimit: js.UndefOr[SimulationUnit]
  }

  object Compute {
    @inline
    def apply(
        simulationUnitLimit: js.UndefOr[SimulationUnit] = js.undefined
    ): Compute = {
      val __obj = js.Dynamic.literal()
      simulationUnitLimit.foreach(__v => __obj.updateDynamic("simulationUnitLimit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Compute]
    }
  }

  /**
    * Compute information for the simulation job
    */
  @js.native
  trait ComputeResponse extends js.Object {
    var simulationUnitLimit: js.UndefOr[SimulationUnit]
  }

  object ComputeResponse {
    @inline
    def apply(
        simulationUnitLimit: js.UndefOr[SimulationUnit] = js.undefined
    ): ComputeResponse = {
      val __obj = js.Dynamic.literal()
      simulationUnitLimit.foreach(__v => __obj.updateDynamic("simulationUnitLimit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComputeResponse]
    }
  }

  @js.native
  trait CreateDeploymentJobRequest extends js.Object {
    var clientRequestToken: ClientRequestToken
    var deploymentApplicationConfigs: DeploymentApplicationConfigs
    var fleet: Arn
    var deploymentConfig: js.UndefOr[DeploymentConfig]
    var tags: js.UndefOr[TagMap]
  }

  object CreateDeploymentJobRequest {
    @inline
    def apply(
        clientRequestToken: ClientRequestToken,
        deploymentApplicationConfigs: DeploymentApplicationConfigs,
        fleet: Arn,
        deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateDeploymentJobRequest = {
      val __obj = js.Dynamic.literal(
        "clientRequestToken" -> clientRequestToken.asInstanceOf[js.Any],
        "deploymentApplicationConfigs" -> deploymentApplicationConfigs.asInstanceOf[js.Any],
        "fleet" -> fleet.asInstanceOf[js.Any]
      )

      deploymentConfig.foreach(__v => __obj.updateDynamic("deploymentConfig")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentJobRequest]
    }
  }

  @js.native
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

  object CreateDeploymentJobResponse {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        createdAt: js.UndefOr[CreatedAt] = js.undefined,
        deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs] = js.undefined,
        deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined,
        failureCode: js.UndefOr[DeploymentJobErrorCode] = js.undefined,
        failureReason: js.UndefOr[GenericString] = js.undefined,
        fleet: js.UndefOr[Arn] = js.undefined,
        status: js.UndefOr[DeploymentStatus] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateDeploymentJobResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      deploymentApplicationConfigs.foreach(__v => __obj.updateDynamic("deploymentApplicationConfigs")(__v.asInstanceOf[js.Any]))
      deploymentConfig.foreach(__v => __obj.updateDynamic("deploymentConfig")(__v.asInstanceOf[js.Any]))
      failureCode.foreach(__v => __obj.updateDynamic("failureCode")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      fleet.foreach(__v => __obj.updateDynamic("fleet")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentJobResponse]
    }
  }

  @js.native
  trait CreateFleetRequest extends js.Object {
    var name: Name
    var tags: js.UndefOr[TagMap]
  }

  object CreateFleetRequest {
    @inline
    def apply(
        name: Name,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateFleetRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFleetRequest]
    }
  }

  @js.native
  trait CreateFleetResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[CreatedAt]
    var name: js.UndefOr[Name]
    var tags: js.UndefOr[TagMap]
  }

  object CreateFleetResponse {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        createdAt: js.UndefOr[CreatedAt] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateFleetResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFleetResponse]
    }
  }

  @js.native
  trait CreateRobotApplicationRequest extends js.Object {
    var name: Name
    var robotSoftwareSuite: RobotSoftwareSuite
    var sources: SourceConfigs
    var tags: js.UndefOr[TagMap]
  }

  object CreateRobotApplicationRequest {
    @inline
    def apply(
        name: Name,
        robotSoftwareSuite: RobotSoftwareSuite,
        sources: SourceConfigs,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateRobotApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "robotSoftwareSuite" -> robotSoftwareSuite.asInstanceOf[js.Any],
        "sources" -> sources.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRobotApplicationRequest]
    }
  }

  @js.native
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

  object CreateRobotApplicationResponse {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        revisionId: js.UndefOr[RevisionId] = js.undefined,
        robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined,
        sources: js.UndefOr[Sources] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): CreateRobotApplicationResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      revisionId.foreach(__v => __obj.updateDynamic("revisionId")(__v.asInstanceOf[js.Any]))
      robotSoftwareSuite.foreach(__v => __obj.updateDynamic("robotSoftwareSuite")(__v.asInstanceOf[js.Any]))
      sources.foreach(__v => __obj.updateDynamic("sources")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRobotApplicationResponse]
    }
  }

  @js.native
  trait CreateRobotApplicationVersionRequest extends js.Object {
    var application: Arn
    var currentRevisionId: js.UndefOr[RevisionId]
  }

  object CreateRobotApplicationVersionRequest {
    @inline
    def apply(
        application: Arn,
        currentRevisionId: js.UndefOr[RevisionId] = js.undefined
    ): CreateRobotApplicationVersionRequest = {
      val __obj = js.Dynamic.literal(
        "application" -> application.asInstanceOf[js.Any]
      )

      currentRevisionId.foreach(__v => __obj.updateDynamic("currentRevisionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRobotApplicationVersionRequest]
    }
  }

  @js.native
  trait CreateRobotApplicationVersionResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var name: js.UndefOr[Name]
    var revisionId: js.UndefOr[RevisionId]
    var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite]
    var sources: js.UndefOr[Sources]
    var version: js.UndefOr[Version]
  }

  object CreateRobotApplicationVersionResponse {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        revisionId: js.UndefOr[RevisionId] = js.undefined,
        robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined,
        sources: js.UndefOr[Sources] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): CreateRobotApplicationVersionResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      revisionId.foreach(__v => __obj.updateDynamic("revisionId")(__v.asInstanceOf[js.Any]))
      robotSoftwareSuite.foreach(__v => __obj.updateDynamic("robotSoftwareSuite")(__v.asInstanceOf[js.Any]))
      sources.foreach(__v => __obj.updateDynamic("sources")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRobotApplicationVersionResponse]
    }
  }

  @js.native
  trait CreateRobotRequest extends js.Object {
    var architecture: Architecture
    var greengrassGroupId: Id
    var name: Name
    var tags: js.UndefOr[TagMap]
  }

  object CreateRobotRequest {
    @inline
    def apply(
        architecture: Architecture,
        greengrassGroupId: Id,
        name: Name,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateRobotRequest = {
      val __obj = js.Dynamic.literal(
        "architecture" -> architecture.asInstanceOf[js.Any],
        "greengrassGroupId" -> greengrassGroupId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRobotRequest]
    }
  }

  @js.native
  trait CreateRobotResponse extends js.Object {
    var architecture: js.UndefOr[Architecture]
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[CreatedAt]
    var greengrassGroupId: js.UndefOr[Id]
    var name: js.UndefOr[Name]
    var tags: js.UndefOr[TagMap]
  }

  object CreateRobotResponse {
    @inline
    def apply(
        architecture: js.UndefOr[Architecture] = js.undefined,
        arn: js.UndefOr[Arn] = js.undefined,
        createdAt: js.UndefOr[CreatedAt] = js.undefined,
        greengrassGroupId: js.UndefOr[Id] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateRobotResponse = {
      val __obj = js.Dynamic.literal()
      architecture.foreach(__v => __obj.updateDynamic("architecture")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      greengrassGroupId.foreach(__v => __obj.updateDynamic("greengrassGroupId")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRobotResponse]
    }
  }

  @js.native
  trait CreateSimulationApplicationRequest extends js.Object {
    var name: Name
    var robotSoftwareSuite: RobotSoftwareSuite
    var simulationSoftwareSuite: SimulationSoftwareSuite
    var sources: SourceConfigs
    var renderingEngine: js.UndefOr[RenderingEngine]
    var tags: js.UndefOr[TagMap]
  }

  object CreateSimulationApplicationRequest {
    @inline
    def apply(
        name: Name,
        robotSoftwareSuite: RobotSoftwareSuite,
        simulationSoftwareSuite: SimulationSoftwareSuite,
        sources: SourceConfigs,
        renderingEngine: js.UndefOr[RenderingEngine] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateSimulationApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "robotSoftwareSuite" -> robotSoftwareSuite.asInstanceOf[js.Any],
        "simulationSoftwareSuite" -> simulationSoftwareSuite.asInstanceOf[js.Any],
        "sources" -> sources.asInstanceOf[js.Any]
      )

      renderingEngine.foreach(__v => __obj.updateDynamic("renderingEngine")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSimulationApplicationRequest]
    }
  }

  @js.native
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

  object CreateSimulationApplicationResponse {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        renderingEngine: js.UndefOr[RenderingEngine] = js.undefined,
        revisionId: js.UndefOr[RevisionId] = js.undefined,
        robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined,
        simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite] = js.undefined,
        sources: js.UndefOr[Sources] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): CreateSimulationApplicationResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      renderingEngine.foreach(__v => __obj.updateDynamic("renderingEngine")(__v.asInstanceOf[js.Any]))
      revisionId.foreach(__v => __obj.updateDynamic("revisionId")(__v.asInstanceOf[js.Any]))
      robotSoftwareSuite.foreach(__v => __obj.updateDynamic("robotSoftwareSuite")(__v.asInstanceOf[js.Any]))
      simulationSoftwareSuite.foreach(__v => __obj.updateDynamic("simulationSoftwareSuite")(__v.asInstanceOf[js.Any]))
      sources.foreach(__v => __obj.updateDynamic("sources")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSimulationApplicationResponse]
    }
  }

  @js.native
  trait CreateSimulationApplicationVersionRequest extends js.Object {
    var application: Arn
    var currentRevisionId: js.UndefOr[RevisionId]
  }

  object CreateSimulationApplicationVersionRequest {
    @inline
    def apply(
        application: Arn,
        currentRevisionId: js.UndefOr[RevisionId] = js.undefined
    ): CreateSimulationApplicationVersionRequest = {
      val __obj = js.Dynamic.literal(
        "application" -> application.asInstanceOf[js.Any]
      )

      currentRevisionId.foreach(__v => __obj.updateDynamic("currentRevisionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSimulationApplicationVersionRequest]
    }
  }

  @js.native
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

  object CreateSimulationApplicationVersionResponse {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        renderingEngine: js.UndefOr[RenderingEngine] = js.undefined,
        revisionId: js.UndefOr[RevisionId] = js.undefined,
        robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined,
        simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite] = js.undefined,
        sources: js.UndefOr[Sources] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): CreateSimulationApplicationVersionResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      renderingEngine.foreach(__v => __obj.updateDynamic("renderingEngine")(__v.asInstanceOf[js.Any]))
      revisionId.foreach(__v => __obj.updateDynamic("revisionId")(__v.asInstanceOf[js.Any]))
      robotSoftwareSuite.foreach(__v => __obj.updateDynamic("robotSoftwareSuite")(__v.asInstanceOf[js.Any]))
      simulationSoftwareSuite.foreach(__v => __obj.updateDynamic("simulationSoftwareSuite")(__v.asInstanceOf[js.Any]))
      sources.foreach(__v => __obj.updateDynamic("sources")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSimulationApplicationVersionResponse]
    }
  }

  @js.native
  trait CreateSimulationJobRequest extends js.Object {
    var iamRole: IamRole
    var maxJobDurationInSeconds: JobDuration
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var compute: js.UndefOr[Compute]
    var dataSources: js.UndefOr[DataSourceConfigs]
    var failureBehavior: js.UndefOr[FailureBehavior]
    var loggingConfig: js.UndefOr[LoggingConfig]
    var outputLocation: js.UndefOr[OutputLocation]
    var robotApplications: js.UndefOr[RobotApplicationConfigs]
    var simulationApplications: js.UndefOr[SimulationApplicationConfigs]
    var tags: js.UndefOr[TagMap]
    var vpcConfig: js.UndefOr[VPCConfig]
  }

  object CreateSimulationJobRequest {
    @inline
    def apply(
        iamRole: IamRole,
        maxJobDurationInSeconds: JobDuration,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        compute: js.UndefOr[Compute] = js.undefined,
        dataSources: js.UndefOr[DataSourceConfigs] = js.undefined,
        failureBehavior: js.UndefOr[FailureBehavior] = js.undefined,
        loggingConfig: js.UndefOr[LoggingConfig] = js.undefined,
        outputLocation: js.UndefOr[OutputLocation] = js.undefined,
        robotApplications: js.UndefOr[RobotApplicationConfigs] = js.undefined,
        simulationApplications: js.UndefOr[SimulationApplicationConfigs] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        vpcConfig: js.UndefOr[VPCConfig] = js.undefined
    ): CreateSimulationJobRequest = {
      val __obj = js.Dynamic.literal(
        "iamRole" -> iamRole.asInstanceOf[js.Any],
        "maxJobDurationInSeconds" -> maxJobDurationInSeconds.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      compute.foreach(__v => __obj.updateDynamic("compute")(__v.asInstanceOf[js.Any]))
      dataSources.foreach(__v => __obj.updateDynamic("dataSources")(__v.asInstanceOf[js.Any]))
      failureBehavior.foreach(__v => __obj.updateDynamic("failureBehavior")(__v.asInstanceOf[js.Any]))
      loggingConfig.foreach(__v => __obj.updateDynamic("loggingConfig")(__v.asInstanceOf[js.Any]))
      outputLocation.foreach(__v => __obj.updateDynamic("outputLocation")(__v.asInstanceOf[js.Any]))
      robotApplications.foreach(__v => __obj.updateDynamic("robotApplications")(__v.asInstanceOf[js.Any]))
      simulationApplications.foreach(__v => __obj.updateDynamic("simulationApplications")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      vpcConfig.foreach(__v => __obj.updateDynamic("vpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSimulationJobRequest]
    }
  }

  @js.native
  trait CreateSimulationJobResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var compute: js.UndefOr[ComputeResponse]
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

  object CreateSimulationJobResponse {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        compute: js.UndefOr[ComputeResponse] = js.undefined,
        dataSources: js.UndefOr[DataSources] = js.undefined,
        failureBehavior: js.UndefOr[FailureBehavior] = js.undefined,
        failureCode: js.UndefOr[SimulationJobErrorCode] = js.undefined,
        iamRole: js.UndefOr[IamRole] = js.undefined,
        lastStartedAt: js.UndefOr[LastStartedAt] = js.undefined,
        lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
        loggingConfig: js.UndefOr[LoggingConfig] = js.undefined,
        maxJobDurationInSeconds: js.UndefOr[JobDuration] = js.undefined,
        outputLocation: js.UndefOr[OutputLocation] = js.undefined,
        robotApplications: js.UndefOr[RobotApplicationConfigs] = js.undefined,
        simulationApplications: js.UndefOr[SimulationApplicationConfigs] = js.undefined,
        simulationTimeMillis: js.UndefOr[SimulationTimeMillis] = js.undefined,
        status: js.UndefOr[SimulationJobStatus] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        vpcConfig: js.UndefOr[VPCConfigResponse] = js.undefined
    ): CreateSimulationJobResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      compute.foreach(__v => __obj.updateDynamic("compute")(__v.asInstanceOf[js.Any]))
      dataSources.foreach(__v => __obj.updateDynamic("dataSources")(__v.asInstanceOf[js.Any]))
      failureBehavior.foreach(__v => __obj.updateDynamic("failureBehavior")(__v.asInstanceOf[js.Any]))
      failureCode.foreach(__v => __obj.updateDynamic("failureCode")(__v.asInstanceOf[js.Any]))
      iamRole.foreach(__v => __obj.updateDynamic("iamRole")(__v.asInstanceOf[js.Any]))
      lastStartedAt.foreach(__v => __obj.updateDynamic("lastStartedAt")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      loggingConfig.foreach(__v => __obj.updateDynamic("loggingConfig")(__v.asInstanceOf[js.Any]))
      maxJobDurationInSeconds.foreach(__v => __obj.updateDynamic("maxJobDurationInSeconds")(__v.asInstanceOf[js.Any]))
      outputLocation.foreach(__v => __obj.updateDynamic("outputLocation")(__v.asInstanceOf[js.Any]))
      robotApplications.foreach(__v => __obj.updateDynamic("robotApplications")(__v.asInstanceOf[js.Any]))
      simulationApplications.foreach(__v => __obj.updateDynamic("simulationApplications")(__v.asInstanceOf[js.Any]))
      simulationTimeMillis.foreach(__v => __obj.updateDynamic("simulationTimeMillis")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      vpcConfig.foreach(__v => __obj.updateDynamic("vpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSimulationJobResponse]
    }
  }

  /**
    * Information about a data source.
    */
  @js.native
  trait DataSource extends js.Object {
    var name: js.UndefOr[Name]
    var s3Bucket: js.UndefOr[S3Bucket]
    var s3Keys: js.UndefOr[S3KeyOutputs]
  }

  object DataSource {
    @inline
    def apply(
        name: js.UndefOr[Name] = js.undefined,
        s3Bucket: js.UndefOr[S3Bucket] = js.undefined,
        s3Keys: js.UndefOr[S3KeyOutputs] = js.undefined
    ): DataSource = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      s3Bucket.foreach(__v => __obj.updateDynamic("s3Bucket")(__v.asInstanceOf[js.Any]))
      s3Keys.foreach(__v => __obj.updateDynamic("s3Keys")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSource]
    }
  }

  /**
    * Information about a data source.
    */
  @js.native
  trait DataSourceConfig extends js.Object {
    var name: Name
    var s3Bucket: S3Bucket
    var s3Keys: S3Keys
  }

  object DataSourceConfig {
    @inline
    def apply(
        name: Name,
        s3Bucket: S3Bucket,
        s3Keys: S3Keys
    ): DataSourceConfig = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "s3Bucket" -> s3Bucket.asInstanceOf[js.Any],
        "s3Keys" -> s3Keys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DataSourceConfig]
    }
  }

  @js.native
  trait DeleteFleetRequest extends js.Object {
    var fleet: Arn
  }

  object DeleteFleetRequest {
    @inline
    def apply(
        fleet: Arn
    ): DeleteFleetRequest = {
      val __obj = js.Dynamic.literal(
        "fleet" -> fleet.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteFleetRequest]
    }
  }

  @js.native
  trait DeleteFleetResponse extends js.Object {}

  object DeleteFleetResponse {
    @inline
    def apply(
    ): DeleteFleetResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteFleetResponse]
    }
  }

  @js.native
  trait DeleteRobotApplicationRequest extends js.Object {
    var application: Arn
    var applicationVersion: js.UndefOr[Version]
  }

  object DeleteRobotApplicationRequest {
    @inline
    def apply(
        application: Arn,
        applicationVersion: js.UndefOr[Version] = js.undefined
    ): DeleteRobotApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "application" -> application.asInstanceOf[js.Any]
      )

      applicationVersion.foreach(__v => __obj.updateDynamic("applicationVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRobotApplicationRequest]
    }
  }

  @js.native
  trait DeleteRobotApplicationResponse extends js.Object {}

  object DeleteRobotApplicationResponse {
    @inline
    def apply(
    ): DeleteRobotApplicationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteRobotApplicationResponse]
    }
  }

  @js.native
  trait DeleteRobotRequest extends js.Object {
    var robot: Arn
  }

  object DeleteRobotRequest {
    @inline
    def apply(
        robot: Arn
    ): DeleteRobotRequest = {
      val __obj = js.Dynamic.literal(
        "robot" -> robot.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRobotRequest]
    }
  }

  @js.native
  trait DeleteRobotResponse extends js.Object {}

  object DeleteRobotResponse {
    @inline
    def apply(
    ): DeleteRobotResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteRobotResponse]
    }
  }

  @js.native
  trait DeleteSimulationApplicationRequest extends js.Object {
    var application: Arn
    var applicationVersion: js.UndefOr[Version]
  }

  object DeleteSimulationApplicationRequest {
    @inline
    def apply(
        application: Arn,
        applicationVersion: js.UndefOr[Version] = js.undefined
    ): DeleteSimulationApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "application" -> application.asInstanceOf[js.Any]
      )

      applicationVersion.foreach(__v => __obj.updateDynamic("applicationVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSimulationApplicationRequest]
    }
  }

  @js.native
  trait DeleteSimulationApplicationResponse extends js.Object {}

  object DeleteSimulationApplicationResponse {
    @inline
    def apply(
    ): DeleteSimulationApplicationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteSimulationApplicationResponse]
    }
  }

  /**
    * Information about a deployment application configuration.
    */
  @js.native
  trait DeploymentApplicationConfig extends js.Object {
    var application: Arn
    var applicationVersion: DeploymentVersion
    var launchConfig: DeploymentLaunchConfig
  }

  object DeploymentApplicationConfig {
    @inline
    def apply(
        application: Arn,
        applicationVersion: DeploymentVersion,
        launchConfig: DeploymentLaunchConfig
    ): DeploymentApplicationConfig = {
      val __obj = js.Dynamic.literal(
        "application" -> application.asInstanceOf[js.Any],
        "applicationVersion" -> applicationVersion.asInstanceOf[js.Any],
        "launchConfig" -> launchConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeploymentApplicationConfig]
    }
  }

  /**
    * Information about a deployment configuration.
    */
  @js.native
  trait DeploymentConfig extends js.Object {
    var concurrentDeploymentPercentage: js.UndefOr[Percentage]
    var downloadConditionFile: js.UndefOr[S3Object]
    var failureThresholdPercentage: js.UndefOr[Percentage]
    var robotDeploymentTimeoutInSeconds: js.UndefOr[DeploymentTimeout]
  }

  object DeploymentConfig {
    @inline
    def apply(
        concurrentDeploymentPercentage: js.UndefOr[Percentage] = js.undefined,
        downloadConditionFile: js.UndefOr[S3Object] = js.undefined,
        failureThresholdPercentage: js.UndefOr[Percentage] = js.undefined,
        robotDeploymentTimeoutInSeconds: js.UndefOr[DeploymentTimeout] = js.undefined
    ): DeploymentConfig = {
      val __obj = js.Dynamic.literal()
      concurrentDeploymentPercentage.foreach(__v => __obj.updateDynamic("concurrentDeploymentPercentage")(__v.asInstanceOf[js.Any]))
      downloadConditionFile.foreach(__v => __obj.updateDynamic("downloadConditionFile")(__v.asInstanceOf[js.Any]))
      failureThresholdPercentage.foreach(__v => __obj.updateDynamic("failureThresholdPercentage")(__v.asInstanceOf[js.Any]))
      robotDeploymentTimeoutInSeconds.foreach(__v => __obj.updateDynamic("robotDeploymentTimeoutInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentConfig]
    }
  }

  /**
    * Information about a deployment job.
    */
  @js.native
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

  object DeploymentJob {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        createdAt: js.UndefOr[CreatedAt] = js.undefined,
        deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs] = js.undefined,
        deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined,
        failureCode: js.UndefOr[DeploymentJobErrorCode] = js.undefined,
        failureReason: js.UndefOr[GenericString] = js.undefined,
        fleet: js.UndefOr[Arn] = js.undefined,
        status: js.UndefOr[DeploymentStatus] = js.undefined
    ): DeploymentJob = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      deploymentApplicationConfigs.foreach(__v => __obj.updateDynamic("deploymentApplicationConfigs")(__v.asInstanceOf[js.Any]))
      deploymentConfig.foreach(__v => __obj.updateDynamic("deploymentConfig")(__v.asInstanceOf[js.Any]))
      failureCode.foreach(__v => __obj.updateDynamic("failureCode")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      fleet.foreach(__v => __obj.updateDynamic("fleet")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentJob]
    }
  }

  @js.native
  sealed trait DeploymentJobErrorCode extends js.Any
  object DeploymentJobErrorCode {
    @inline def ResourceNotFound = "ResourceNotFound".asInstanceOf[DeploymentJobErrorCode]
    @inline def EnvironmentSetupError = "EnvironmentSetupError".asInstanceOf[DeploymentJobErrorCode]
    @inline def EtagMismatch = "EtagMismatch".asInstanceOf[DeploymentJobErrorCode]
    @inline def FailureThresholdBreached = "FailureThresholdBreached".asInstanceOf[DeploymentJobErrorCode]
    @inline def RobotDeploymentAborted = "RobotDeploymentAborted".asInstanceOf[DeploymentJobErrorCode]
    @inline def RobotDeploymentNoResponse = "RobotDeploymentNoResponse".asInstanceOf[DeploymentJobErrorCode]
    @inline def RobotAgentConnectionTimeout = "RobotAgentConnectionTimeout".asInstanceOf[DeploymentJobErrorCode]
    @inline def GreengrassDeploymentFailed = "GreengrassDeploymentFailed".asInstanceOf[DeploymentJobErrorCode]
    @inline def InvalidGreengrassGroup = "InvalidGreengrassGroup".asInstanceOf[DeploymentJobErrorCode]
    @inline def MissingRobotArchitecture = "MissingRobotArchitecture".asInstanceOf[DeploymentJobErrorCode]
    @inline def MissingRobotApplicationArchitecture = "MissingRobotApplicationArchitecture".asInstanceOf[DeploymentJobErrorCode]
    @inline def MissingRobotDeploymentResource = "MissingRobotDeploymentResource".asInstanceOf[DeploymentJobErrorCode]
    @inline def GreengrassGroupVersionDoesNotExist = "GreengrassGroupVersionDoesNotExist".asInstanceOf[DeploymentJobErrorCode]
    @inline def LambdaDeleted = "LambdaDeleted".asInstanceOf[DeploymentJobErrorCode]
    @inline def ExtractingBundleFailure = "ExtractingBundleFailure".asInstanceOf[DeploymentJobErrorCode]
    @inline def PreLaunchFileFailure = "PreLaunchFileFailure".asInstanceOf[DeploymentJobErrorCode]
    @inline def PostLaunchFileFailure = "PostLaunchFileFailure".asInstanceOf[DeploymentJobErrorCode]
    @inline def BadPermissionError = "BadPermissionError".asInstanceOf[DeploymentJobErrorCode]
    @inline def DownloadConditionFailed = "DownloadConditionFailed".asInstanceOf[DeploymentJobErrorCode]
    @inline def InternalServerError = "InternalServerError".asInstanceOf[DeploymentJobErrorCode]

    @inline def values =
      js.Object.freeze(js.Array(
        ResourceNotFound,
        EnvironmentSetupError,
        EtagMismatch,
        FailureThresholdBreached,
        RobotDeploymentAborted,
        RobotDeploymentNoResponse,
        RobotAgentConnectionTimeout,
        GreengrassDeploymentFailed,
        InvalidGreengrassGroup,
        MissingRobotArchitecture,
        MissingRobotApplicationArchitecture,
        MissingRobotDeploymentResource,
        GreengrassGroupVersionDoesNotExist,
        LambdaDeleted,
        ExtractingBundleFailure,
        PreLaunchFileFailure,
        PostLaunchFileFailure,
        BadPermissionError,
        DownloadConditionFailed,
        InternalServerError
      ))
  }

  /**
    * Configuration information for a deployment launch.
    */
  @js.native
  trait DeploymentLaunchConfig extends js.Object {
    var launchFile: Command
    var packageName: Command
    var environmentVariables: js.UndefOr[EnvironmentVariableMap]
    var postLaunchFile: js.UndefOr[Path]
    var preLaunchFile: js.UndefOr[Path]
  }

  object DeploymentLaunchConfig {
    @inline
    def apply(
        launchFile: Command,
        packageName: Command,
        environmentVariables: js.UndefOr[EnvironmentVariableMap] = js.undefined,
        postLaunchFile: js.UndefOr[Path] = js.undefined,
        preLaunchFile: js.UndefOr[Path] = js.undefined
    ): DeploymentLaunchConfig = {
      val __obj = js.Dynamic.literal(
        "launchFile" -> launchFile.asInstanceOf[js.Any],
        "packageName" -> packageName.asInstanceOf[js.Any]
      )

      environmentVariables.foreach(__v => __obj.updateDynamic("environmentVariables")(__v.asInstanceOf[js.Any]))
      postLaunchFile.foreach(__v => __obj.updateDynamic("postLaunchFile")(__v.asInstanceOf[js.Any]))
      preLaunchFile.foreach(__v => __obj.updateDynamic("preLaunchFile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentLaunchConfig]
    }
  }

  @js.native
  sealed trait DeploymentStatus extends js.Any
  object DeploymentStatus {
    @inline def Pending = "Pending".asInstanceOf[DeploymentStatus]
    @inline def Preparing = "Preparing".asInstanceOf[DeploymentStatus]
    @inline def InProgress = "InProgress".asInstanceOf[DeploymentStatus]
    @inline def Failed = "Failed".asInstanceOf[DeploymentStatus]
    @inline def Succeeded = "Succeeded".asInstanceOf[DeploymentStatus]
    @inline def Canceled = "Canceled".asInstanceOf[DeploymentStatus]

    @inline def values = js.Object.freeze(js.Array(Pending, Preparing, InProgress, Failed, Succeeded, Canceled))
  }

  @js.native
  trait DeregisterRobotRequest extends js.Object {
    var fleet: Arn
    var robot: Arn
  }

  object DeregisterRobotRequest {
    @inline
    def apply(
        fleet: Arn,
        robot: Arn
    ): DeregisterRobotRequest = {
      val __obj = js.Dynamic.literal(
        "fleet" -> fleet.asInstanceOf[js.Any],
        "robot" -> robot.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeregisterRobotRequest]
    }
  }

  @js.native
  trait DeregisterRobotResponse extends js.Object {
    var fleet: js.UndefOr[Arn]
    var robot: js.UndefOr[Arn]
  }

  object DeregisterRobotResponse {
    @inline
    def apply(
        fleet: js.UndefOr[Arn] = js.undefined,
        robot: js.UndefOr[Arn] = js.undefined
    ): DeregisterRobotResponse = {
      val __obj = js.Dynamic.literal()
      fleet.foreach(__v => __obj.updateDynamic("fleet")(__v.asInstanceOf[js.Any]))
      robot.foreach(__v => __obj.updateDynamic("robot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeregisterRobotResponse]
    }
  }

  @js.native
  trait DescribeDeploymentJobRequest extends js.Object {
    var job: Arn
  }

  object DescribeDeploymentJobRequest {
    @inline
    def apply(
        job: Arn
    ): DescribeDeploymentJobRequest = {
      val __obj = js.Dynamic.literal(
        "job" -> job.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeDeploymentJobRequest]
    }
  }

  @js.native
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

  object DescribeDeploymentJobResponse {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        createdAt: js.UndefOr[CreatedAt] = js.undefined,
        deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs] = js.undefined,
        deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined,
        failureCode: js.UndefOr[DeploymentJobErrorCode] = js.undefined,
        failureReason: js.UndefOr[GenericString] = js.undefined,
        fleet: js.UndefOr[Arn] = js.undefined,
        robotDeploymentSummary: js.UndefOr[RobotDeploymentSummary] = js.undefined,
        status: js.UndefOr[DeploymentStatus] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): DescribeDeploymentJobResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      deploymentApplicationConfigs.foreach(__v => __obj.updateDynamic("deploymentApplicationConfigs")(__v.asInstanceOf[js.Any]))
      deploymentConfig.foreach(__v => __obj.updateDynamic("deploymentConfig")(__v.asInstanceOf[js.Any]))
      failureCode.foreach(__v => __obj.updateDynamic("failureCode")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      fleet.foreach(__v => __obj.updateDynamic("fleet")(__v.asInstanceOf[js.Any]))
      robotDeploymentSummary.foreach(__v => __obj.updateDynamic("robotDeploymentSummary")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDeploymentJobResponse]
    }
  }

  @js.native
  trait DescribeFleetRequest extends js.Object {
    var fleet: Arn
  }

  object DescribeFleetRequest {
    @inline
    def apply(
        fleet: Arn
    ): DescribeFleetRequest = {
      val __obj = js.Dynamic.literal(
        "fleet" -> fleet.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeFleetRequest]
    }
  }

  @js.native
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

  object DescribeFleetResponse {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        createdAt: js.UndefOr[CreatedAt] = js.undefined,
        lastDeploymentJob: js.UndefOr[Arn] = js.undefined,
        lastDeploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined,
        lastDeploymentTime: js.UndefOr[CreatedAt] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        robots: js.UndefOr[Robots] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): DescribeFleetResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      lastDeploymentJob.foreach(__v => __obj.updateDynamic("lastDeploymentJob")(__v.asInstanceOf[js.Any]))
      lastDeploymentStatus.foreach(__v => __obj.updateDynamic("lastDeploymentStatus")(__v.asInstanceOf[js.Any]))
      lastDeploymentTime.foreach(__v => __obj.updateDynamic("lastDeploymentTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      robots.foreach(__v => __obj.updateDynamic("robots")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFleetResponse]
    }
  }

  @js.native
  trait DescribeRobotApplicationRequest extends js.Object {
    var application: Arn
    var applicationVersion: js.UndefOr[Version]
  }

  object DescribeRobotApplicationRequest {
    @inline
    def apply(
        application: Arn,
        applicationVersion: js.UndefOr[Version] = js.undefined
    ): DescribeRobotApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "application" -> application.asInstanceOf[js.Any]
      )

      applicationVersion.foreach(__v => __obj.updateDynamic("applicationVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRobotApplicationRequest]
    }
  }

  @js.native
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

  object DescribeRobotApplicationResponse {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        revisionId: js.UndefOr[RevisionId] = js.undefined,
        robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined,
        sources: js.UndefOr[Sources] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): DescribeRobotApplicationResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      revisionId.foreach(__v => __obj.updateDynamic("revisionId")(__v.asInstanceOf[js.Any]))
      robotSoftwareSuite.foreach(__v => __obj.updateDynamic("robotSoftwareSuite")(__v.asInstanceOf[js.Any]))
      sources.foreach(__v => __obj.updateDynamic("sources")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRobotApplicationResponse]
    }
  }

  @js.native
  trait DescribeRobotRequest extends js.Object {
    var robot: Arn
  }

  object DescribeRobotRequest {
    @inline
    def apply(
        robot: Arn
    ): DescribeRobotRequest = {
      val __obj = js.Dynamic.literal(
        "robot" -> robot.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeRobotRequest]
    }
  }

  @js.native
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

  object DescribeRobotResponse {
    @inline
    def apply(
        architecture: js.UndefOr[Architecture] = js.undefined,
        arn: js.UndefOr[Arn] = js.undefined,
        createdAt: js.UndefOr[CreatedAt] = js.undefined,
        fleetArn: js.UndefOr[Arn] = js.undefined,
        greengrassGroupId: js.UndefOr[Id] = js.undefined,
        lastDeploymentJob: js.UndefOr[Arn] = js.undefined,
        lastDeploymentTime: js.UndefOr[CreatedAt] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        status: js.UndefOr[RobotStatus] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): DescribeRobotResponse = {
      val __obj = js.Dynamic.literal()
      architecture.foreach(__v => __obj.updateDynamic("architecture")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      fleetArn.foreach(__v => __obj.updateDynamic("fleetArn")(__v.asInstanceOf[js.Any]))
      greengrassGroupId.foreach(__v => __obj.updateDynamic("greengrassGroupId")(__v.asInstanceOf[js.Any]))
      lastDeploymentJob.foreach(__v => __obj.updateDynamic("lastDeploymentJob")(__v.asInstanceOf[js.Any]))
      lastDeploymentTime.foreach(__v => __obj.updateDynamic("lastDeploymentTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRobotResponse]
    }
  }

  @js.native
  trait DescribeSimulationApplicationRequest extends js.Object {
    var application: Arn
    var applicationVersion: js.UndefOr[Version]
  }

  object DescribeSimulationApplicationRequest {
    @inline
    def apply(
        application: Arn,
        applicationVersion: js.UndefOr[Version] = js.undefined
    ): DescribeSimulationApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "application" -> application.asInstanceOf[js.Any]
      )

      applicationVersion.foreach(__v => __obj.updateDynamic("applicationVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSimulationApplicationRequest]
    }
  }

  @js.native
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

  object DescribeSimulationApplicationResponse {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        renderingEngine: js.UndefOr[RenderingEngine] = js.undefined,
        revisionId: js.UndefOr[RevisionId] = js.undefined,
        robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined,
        simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite] = js.undefined,
        sources: js.UndefOr[Sources] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): DescribeSimulationApplicationResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      renderingEngine.foreach(__v => __obj.updateDynamic("renderingEngine")(__v.asInstanceOf[js.Any]))
      revisionId.foreach(__v => __obj.updateDynamic("revisionId")(__v.asInstanceOf[js.Any]))
      robotSoftwareSuite.foreach(__v => __obj.updateDynamic("robotSoftwareSuite")(__v.asInstanceOf[js.Any]))
      simulationSoftwareSuite.foreach(__v => __obj.updateDynamic("simulationSoftwareSuite")(__v.asInstanceOf[js.Any]))
      sources.foreach(__v => __obj.updateDynamic("sources")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSimulationApplicationResponse]
    }
  }

  @js.native
  trait DescribeSimulationJobBatchRequest extends js.Object {
    var batch: Arn
  }

  object DescribeSimulationJobBatchRequest {
    @inline
    def apply(
        batch: Arn
    ): DescribeSimulationJobBatchRequest = {
      val __obj = js.Dynamic.literal(
        "batch" -> batch.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeSimulationJobBatchRequest]
    }
  }

  @js.native
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

  object DescribeSimulationJobBatchResponse {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        batchPolicy: js.UndefOr[BatchPolicy] = js.undefined,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        createdAt: js.UndefOr[CreatedAt] = js.undefined,
        createdRequests: js.UndefOr[SimulationJobSummaries] = js.undefined,
        failedRequests: js.UndefOr[FailedCreateSimulationJobRequests] = js.undefined,
        failureCode: js.UndefOr[SimulationJobBatchErrorCode] = js.undefined,
        failureReason: js.UndefOr[GenericString] = js.undefined,
        lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
        pendingRequests: js.UndefOr[CreateSimulationJobRequests] = js.undefined,
        status: js.UndefOr[SimulationJobBatchStatus] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): DescribeSimulationJobBatchResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      batchPolicy.foreach(__v => __obj.updateDynamic("batchPolicy")(__v.asInstanceOf[js.Any]))
      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      createdRequests.foreach(__v => __obj.updateDynamic("createdRequests")(__v.asInstanceOf[js.Any]))
      failedRequests.foreach(__v => __obj.updateDynamic("failedRequests")(__v.asInstanceOf[js.Any]))
      failureCode.foreach(__v => __obj.updateDynamic("failureCode")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      pendingRequests.foreach(__v => __obj.updateDynamic("pendingRequests")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSimulationJobBatchResponse]
    }
  }

  @js.native
  trait DescribeSimulationJobRequest extends js.Object {
    var job: Arn
  }

  object DescribeSimulationJobRequest {
    @inline
    def apply(
        job: Arn
    ): DescribeSimulationJobRequest = {
      val __obj = js.Dynamic.literal(
        "job" -> job.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeSimulationJobRequest]
    }
  }

  @js.native
  trait DescribeSimulationJobResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var compute: js.UndefOr[ComputeResponse]
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

  object DescribeSimulationJobResponse {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        compute: js.UndefOr[ComputeResponse] = js.undefined,
        dataSources: js.UndefOr[DataSources] = js.undefined,
        failureBehavior: js.UndefOr[FailureBehavior] = js.undefined,
        failureCode: js.UndefOr[SimulationJobErrorCode] = js.undefined,
        failureReason: js.UndefOr[GenericString] = js.undefined,
        iamRole: js.UndefOr[IamRole] = js.undefined,
        lastStartedAt: js.UndefOr[LastStartedAt] = js.undefined,
        lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
        loggingConfig: js.UndefOr[LoggingConfig] = js.undefined,
        maxJobDurationInSeconds: js.UndefOr[JobDuration] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        networkInterface: js.UndefOr[NetworkInterface] = js.undefined,
        outputLocation: js.UndefOr[OutputLocation] = js.undefined,
        robotApplications: js.UndefOr[RobotApplicationConfigs] = js.undefined,
        simulationApplications: js.UndefOr[SimulationApplicationConfigs] = js.undefined,
        simulationTimeMillis: js.UndefOr[SimulationTimeMillis] = js.undefined,
        status: js.UndefOr[SimulationJobStatus] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        vpcConfig: js.UndefOr[VPCConfigResponse] = js.undefined
    ): DescribeSimulationJobResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      compute.foreach(__v => __obj.updateDynamic("compute")(__v.asInstanceOf[js.Any]))
      dataSources.foreach(__v => __obj.updateDynamic("dataSources")(__v.asInstanceOf[js.Any]))
      failureBehavior.foreach(__v => __obj.updateDynamic("failureBehavior")(__v.asInstanceOf[js.Any]))
      failureCode.foreach(__v => __obj.updateDynamic("failureCode")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      iamRole.foreach(__v => __obj.updateDynamic("iamRole")(__v.asInstanceOf[js.Any]))
      lastStartedAt.foreach(__v => __obj.updateDynamic("lastStartedAt")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      loggingConfig.foreach(__v => __obj.updateDynamic("loggingConfig")(__v.asInstanceOf[js.Any]))
      maxJobDurationInSeconds.foreach(__v => __obj.updateDynamic("maxJobDurationInSeconds")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      networkInterface.foreach(__v => __obj.updateDynamic("networkInterface")(__v.asInstanceOf[js.Any]))
      outputLocation.foreach(__v => __obj.updateDynamic("outputLocation")(__v.asInstanceOf[js.Any]))
      robotApplications.foreach(__v => __obj.updateDynamic("robotApplications")(__v.asInstanceOf[js.Any]))
      simulationApplications.foreach(__v => __obj.updateDynamic("simulationApplications")(__v.asInstanceOf[js.Any]))
      simulationTimeMillis.foreach(__v => __obj.updateDynamic("simulationTimeMillis")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      vpcConfig.foreach(__v => __obj.updateDynamic("vpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSimulationJobResponse]
    }
  }

  /**
    * Information about a failed create simulation job request.
    */
  @js.native
  trait FailedCreateSimulationJobRequest extends js.Object {
    var failedAt: js.UndefOr[FailedAt]
    var failureCode: js.UndefOr[SimulationJobErrorCode]
    var failureReason: js.UndefOr[GenericString]
    var request: js.UndefOr[SimulationJobRequest]
  }

  object FailedCreateSimulationJobRequest {
    @inline
    def apply(
        failedAt: js.UndefOr[FailedAt] = js.undefined,
        failureCode: js.UndefOr[SimulationJobErrorCode] = js.undefined,
        failureReason: js.UndefOr[GenericString] = js.undefined,
        request: js.UndefOr[SimulationJobRequest] = js.undefined
    ): FailedCreateSimulationJobRequest = {
      val __obj = js.Dynamic.literal()
      failedAt.foreach(__v => __obj.updateDynamic("failedAt")(__v.asInstanceOf[js.Any]))
      failureCode.foreach(__v => __obj.updateDynamic("failureCode")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      request.foreach(__v => __obj.updateDynamic("request")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailedCreateSimulationJobRequest]
    }
  }

  @js.native
  sealed trait FailureBehavior extends js.Any
  object FailureBehavior {
    @inline def Fail = "Fail".asInstanceOf[FailureBehavior]
    @inline def Continue = "Continue".asInstanceOf[FailureBehavior]

    @inline def values = js.Object.freeze(js.Array(Fail, Continue))
  }

  /**
    * Information about a filter.
    */
  @js.native
  trait Filter extends js.Object {
    var name: js.UndefOr[Name]
    var values: js.UndefOr[FilterValues]
  }

  object Filter {
    @inline
    def apply(
        name: js.UndefOr[Name] = js.undefined,
        values: js.UndefOr[FilterValues] = js.undefined
    ): Filter = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filter]
    }
  }

  /**
    * Information about a fleet.
    */
  @js.native
  trait Fleet extends js.Object {
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[CreatedAt]
    var lastDeploymentJob: js.UndefOr[Arn]
    var lastDeploymentStatus: js.UndefOr[DeploymentStatus]
    var lastDeploymentTime: js.UndefOr[CreatedAt]
    var name: js.UndefOr[Name]
  }

  object Fleet {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        createdAt: js.UndefOr[CreatedAt] = js.undefined,
        lastDeploymentJob: js.UndefOr[Arn] = js.undefined,
        lastDeploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined,
        lastDeploymentTime: js.UndefOr[CreatedAt] = js.undefined,
        name: js.UndefOr[Name] = js.undefined
    ): Fleet = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      lastDeploymentJob.foreach(__v => __obj.updateDynamic("lastDeploymentJob")(__v.asInstanceOf[js.Any]))
      lastDeploymentStatus.foreach(__v => __obj.updateDynamic("lastDeploymentStatus")(__v.asInstanceOf[js.Any]))
      lastDeploymentTime.foreach(__v => __obj.updateDynamic("lastDeploymentTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Fleet]
    }
  }

  /**
    * Information about a launch configuration.
    */
  @js.native
  trait LaunchConfig extends js.Object {
    var launchFile: Command
    var packageName: Command
    var environmentVariables: js.UndefOr[EnvironmentVariableMap]
    var portForwardingConfig: js.UndefOr[PortForwardingConfig]
    var streamUI: js.UndefOr[Boolean]
  }

  object LaunchConfig {
    @inline
    def apply(
        launchFile: Command,
        packageName: Command,
        environmentVariables: js.UndefOr[EnvironmentVariableMap] = js.undefined,
        portForwardingConfig: js.UndefOr[PortForwardingConfig] = js.undefined,
        streamUI: js.UndefOr[Boolean] = js.undefined
    ): LaunchConfig = {
      val __obj = js.Dynamic.literal(
        "launchFile" -> launchFile.asInstanceOf[js.Any],
        "packageName" -> packageName.asInstanceOf[js.Any]
      )

      environmentVariables.foreach(__v => __obj.updateDynamic("environmentVariables")(__v.asInstanceOf[js.Any]))
      portForwardingConfig.foreach(__v => __obj.updateDynamic("portForwardingConfig")(__v.asInstanceOf[js.Any]))
      streamUI.foreach(__v => __obj.updateDynamic("streamUI")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchConfig]
    }
  }

  @js.native
  trait ListDeploymentJobsRequest extends js.Object {
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDeploymentJobsRequest {
    @inline
    def apply(
        filters: js.UndefOr[Filters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDeploymentJobsRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeploymentJobsRequest]
    }
  }

  @js.native
  trait ListDeploymentJobsResponse extends js.Object {
    var deploymentJobs: js.UndefOr[DeploymentJobs]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDeploymentJobsResponse {
    @inline
    def apply(
        deploymentJobs: js.UndefOr[DeploymentJobs] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDeploymentJobsResponse = {
      val __obj = js.Dynamic.literal()
      deploymentJobs.foreach(__v => __obj.updateDynamic("deploymentJobs")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeploymentJobsResponse]
    }
  }

  @js.native
  trait ListFleetsRequest extends js.Object {
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListFleetsRequest {
    @inline
    def apply(
        filters: js.UndefOr[Filters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListFleetsRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFleetsRequest]
    }
  }

  @js.native
  trait ListFleetsResponse extends js.Object {
    var fleetDetails: js.UndefOr[Fleets]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListFleetsResponse {
    @inline
    def apply(
        fleetDetails: js.UndefOr[Fleets] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListFleetsResponse = {
      val __obj = js.Dynamic.literal()
      fleetDetails.foreach(__v => __obj.updateDynamic("fleetDetails")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFleetsResponse]
    }
  }

  @js.native
  trait ListRobotApplicationsRequest extends js.Object {
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
    var versionQualifier: js.UndefOr[VersionQualifier]
  }

  object ListRobotApplicationsRequest {
    @inline
    def apply(
        filters: js.UndefOr[Filters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        versionQualifier: js.UndefOr[VersionQualifier] = js.undefined
    ): ListRobotApplicationsRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      versionQualifier.foreach(__v => __obj.updateDynamic("versionQualifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRobotApplicationsRequest]
    }
  }

  @js.native
  trait ListRobotApplicationsResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var robotApplicationSummaries: js.UndefOr[RobotApplicationSummaries]
  }

  object ListRobotApplicationsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        robotApplicationSummaries: js.UndefOr[RobotApplicationSummaries] = js.undefined
    ): ListRobotApplicationsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      robotApplicationSummaries.foreach(__v => __obj.updateDynamic("robotApplicationSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRobotApplicationsResponse]
    }
  }

  @js.native
  trait ListRobotsRequest extends js.Object {
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListRobotsRequest {
    @inline
    def apply(
        filters: js.UndefOr[Filters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListRobotsRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRobotsRequest]
    }
  }

  @js.native
  trait ListRobotsResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var robots: js.UndefOr[Robots]
  }

  object ListRobotsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        robots: js.UndefOr[Robots] = js.undefined
    ): ListRobotsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      robots.foreach(__v => __obj.updateDynamic("robots")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRobotsResponse]
    }
  }

  @js.native
  trait ListSimulationApplicationsRequest extends js.Object {
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
    var versionQualifier: js.UndefOr[VersionQualifier]
  }

  object ListSimulationApplicationsRequest {
    @inline
    def apply(
        filters: js.UndefOr[Filters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        versionQualifier: js.UndefOr[VersionQualifier] = js.undefined
    ): ListSimulationApplicationsRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      versionQualifier.foreach(__v => __obj.updateDynamic("versionQualifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSimulationApplicationsRequest]
    }
  }

  @js.native
  trait ListSimulationApplicationsResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var simulationApplicationSummaries: js.UndefOr[SimulationApplicationSummaries]
  }

  object ListSimulationApplicationsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        simulationApplicationSummaries: js.UndefOr[SimulationApplicationSummaries] = js.undefined
    ): ListSimulationApplicationsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      simulationApplicationSummaries.foreach(__v => __obj.updateDynamic("simulationApplicationSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSimulationApplicationsResponse]
    }
  }

  @js.native
  trait ListSimulationJobBatchesRequest extends js.Object {
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListSimulationJobBatchesRequest {
    @inline
    def apply(
        filters: js.UndefOr[Filters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListSimulationJobBatchesRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSimulationJobBatchesRequest]
    }
  }

  @js.native
  trait ListSimulationJobBatchesResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var simulationJobBatchSummaries: js.UndefOr[SimulationJobBatchSummaries]
  }

  object ListSimulationJobBatchesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        simulationJobBatchSummaries: js.UndefOr[SimulationJobBatchSummaries] = js.undefined
    ): ListSimulationJobBatchesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      simulationJobBatchSummaries.foreach(__v => __obj.updateDynamic("simulationJobBatchSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSimulationJobBatchesResponse]
    }
  }

  @js.native
  trait ListSimulationJobsRequest extends js.Object {
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListSimulationJobsRequest {
    @inline
    def apply(
        filters: js.UndefOr[Filters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListSimulationJobsRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSimulationJobsRequest]
    }
  }

  @js.native
  trait ListSimulationJobsResponse extends js.Object {
    var simulationJobSummaries: SimulationJobSummaries
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListSimulationJobsResponse {
    @inline
    def apply(
        simulationJobSummaries: SimulationJobSummaries,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListSimulationJobsResponse = {
      val __obj = js.Dynamic.literal(
        "simulationJobSummaries" -> simulationJobSummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSimulationJobsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * The logging configuration.
    */
  @js.native
  trait LoggingConfig extends js.Object {
    var recordAllRosTopics: BoxedBoolean
  }

  object LoggingConfig {
    @inline
    def apply(
        recordAllRosTopics: BoxedBoolean
    ): LoggingConfig = {
      val __obj = js.Dynamic.literal(
        "recordAllRosTopics" -> recordAllRosTopics.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[LoggingConfig]
    }
  }

  /**
    * Describes a network interface.
    */
  @js.native
  trait NetworkInterface extends js.Object {
    var networkInterfaceId: js.UndefOr[GenericString]
    var privateIpAddress: js.UndefOr[GenericString]
    var publicIpAddress: js.UndefOr[GenericString]
  }

  object NetworkInterface {
    @inline
    def apply(
        networkInterfaceId: js.UndefOr[GenericString] = js.undefined,
        privateIpAddress: js.UndefOr[GenericString] = js.undefined,
        publicIpAddress: js.UndefOr[GenericString] = js.undefined
    ): NetworkInterface = {
      val __obj = js.Dynamic.literal()
      networkInterfaceId.foreach(__v => __obj.updateDynamic("networkInterfaceId")(__v.asInstanceOf[js.Any]))
      privateIpAddress.foreach(__v => __obj.updateDynamic("privateIpAddress")(__v.asInstanceOf[js.Any]))
      publicIpAddress.foreach(__v => __obj.updateDynamic("publicIpAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkInterface]
    }
  }

  /**
    * The output location.
    */
  @js.native
  trait OutputLocation extends js.Object {
    var s3Bucket: js.UndefOr[S3Bucket]
    var s3Prefix: js.UndefOr[S3Key]
  }

  object OutputLocation {
    @inline
    def apply(
        s3Bucket: js.UndefOr[S3Bucket] = js.undefined,
        s3Prefix: js.UndefOr[S3Key] = js.undefined
    ): OutputLocation = {
      val __obj = js.Dynamic.literal()
      s3Bucket.foreach(__v => __obj.updateDynamic("s3Bucket")(__v.asInstanceOf[js.Any]))
      s3Prefix.foreach(__v => __obj.updateDynamic("s3Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputLocation]
    }
  }

  /**
    * Configuration information for port forwarding.
    */
  @js.native
  trait PortForwardingConfig extends js.Object {
    var portMappings: js.UndefOr[PortMappingList]
  }

  object PortForwardingConfig {
    @inline
    def apply(
        portMappings: js.UndefOr[PortMappingList] = js.undefined
    ): PortForwardingConfig = {
      val __obj = js.Dynamic.literal()
      portMappings.foreach(__v => __obj.updateDynamic("portMappings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortForwardingConfig]
    }
  }

  /**
    * An object representing a port mapping.
    */
  @js.native
  trait PortMapping extends js.Object {
    var applicationPort: NonSystemPort
    var jobPort: Port
    var enableOnPublicIp: js.UndefOr[Boolean]
  }

  object PortMapping {
    @inline
    def apply(
        applicationPort: NonSystemPort,
        jobPort: Port,
        enableOnPublicIp: js.UndefOr[Boolean] = js.undefined
    ): PortMapping = {
      val __obj = js.Dynamic.literal(
        "applicationPort" -> applicationPort.asInstanceOf[js.Any],
        "jobPort" -> jobPort.asInstanceOf[js.Any]
      )

      enableOnPublicIp.foreach(__v => __obj.updateDynamic("enableOnPublicIp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortMapping]
    }
  }

  /**
    * Information about the progress of a deployment job.
    */
  @js.native
  trait ProgressDetail extends js.Object {
    var currentProgress: js.UndefOr[RobotDeploymentStep]
    var estimatedTimeRemainingSeconds: js.UndefOr[GenericInteger]
    var percentDone: js.UndefOr[PercentDone]
    var targetResource: js.UndefOr[GenericString]
  }

  object ProgressDetail {
    @inline
    def apply(
        currentProgress: js.UndefOr[RobotDeploymentStep] = js.undefined,
        estimatedTimeRemainingSeconds: js.UndefOr[GenericInteger] = js.undefined,
        percentDone: js.UndefOr[PercentDone] = js.undefined,
        targetResource: js.UndefOr[GenericString] = js.undefined
    ): ProgressDetail = {
      val __obj = js.Dynamic.literal()
      currentProgress.foreach(__v => __obj.updateDynamic("currentProgress")(__v.asInstanceOf[js.Any]))
      estimatedTimeRemainingSeconds.foreach(__v => __obj.updateDynamic("estimatedTimeRemainingSeconds")(__v.asInstanceOf[js.Any]))
      percentDone.foreach(__v => __obj.updateDynamic("percentDone")(__v.asInstanceOf[js.Any]))
      targetResource.foreach(__v => __obj.updateDynamic("targetResource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProgressDetail]
    }
  }

  @js.native
  trait RegisterRobotRequest extends js.Object {
    var fleet: Arn
    var robot: Arn
  }

  object RegisterRobotRequest {
    @inline
    def apply(
        fleet: Arn,
        robot: Arn
    ): RegisterRobotRequest = {
      val __obj = js.Dynamic.literal(
        "fleet" -> fleet.asInstanceOf[js.Any],
        "robot" -> robot.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RegisterRobotRequest]
    }
  }

  @js.native
  trait RegisterRobotResponse extends js.Object {
    var fleet: js.UndefOr[Arn]
    var robot: js.UndefOr[Arn]
  }

  object RegisterRobotResponse {
    @inline
    def apply(
        fleet: js.UndefOr[Arn] = js.undefined,
        robot: js.UndefOr[Arn] = js.undefined
    ): RegisterRobotResponse = {
      val __obj = js.Dynamic.literal()
      fleet.foreach(__v => __obj.updateDynamic("fleet")(__v.asInstanceOf[js.Any]))
      robot.foreach(__v => __obj.updateDynamic("robot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterRobotResponse]
    }
  }

  /**
    * Information about a rendering engine.
    */
  @js.native
  trait RenderingEngine extends js.Object {
    var name: js.UndefOr[RenderingEngineType]
    var version: js.UndefOr[RenderingEngineVersionType]
  }

  object RenderingEngine {
    @inline
    def apply(
        name: js.UndefOr[RenderingEngineType] = js.undefined,
        version: js.UndefOr[RenderingEngineVersionType] = js.undefined
    ): RenderingEngine = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RenderingEngine]
    }
  }

  @js.native
  sealed trait RenderingEngineType extends js.Any
  object RenderingEngineType {
    @inline def OGRE = "OGRE".asInstanceOf[RenderingEngineType]

    @inline def values = js.Object.freeze(js.Array(OGRE))
  }

  @js.native
  trait RestartSimulationJobRequest extends js.Object {
    var job: Arn
  }

  object RestartSimulationJobRequest {
    @inline
    def apply(
        job: Arn
    ): RestartSimulationJobRequest = {
      val __obj = js.Dynamic.literal(
        "job" -> job.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RestartSimulationJobRequest]
    }
  }

  @js.native
  trait RestartSimulationJobResponse extends js.Object {}

  object RestartSimulationJobResponse {
    @inline
    def apply(
    ): RestartSimulationJobResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RestartSimulationJobResponse]
    }
  }

  /**
    * Information about a robot.
    */
  @js.native
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

  object Robot {
    @inline
    def apply(
        architecture: js.UndefOr[Architecture] = js.undefined,
        arn: js.UndefOr[Arn] = js.undefined,
        createdAt: js.UndefOr[CreatedAt] = js.undefined,
        fleetArn: js.UndefOr[Arn] = js.undefined,
        greenGrassGroupId: js.UndefOr[Id] = js.undefined,
        lastDeploymentJob: js.UndefOr[Arn] = js.undefined,
        lastDeploymentTime: js.UndefOr[CreatedAt] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        status: js.UndefOr[RobotStatus] = js.undefined
    ): Robot = {
      val __obj = js.Dynamic.literal()
      architecture.foreach(__v => __obj.updateDynamic("architecture")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      fleetArn.foreach(__v => __obj.updateDynamic("fleetArn")(__v.asInstanceOf[js.Any]))
      greenGrassGroupId.foreach(__v => __obj.updateDynamic("greenGrassGroupId")(__v.asInstanceOf[js.Any]))
      lastDeploymentJob.foreach(__v => __obj.updateDynamic("lastDeploymentJob")(__v.asInstanceOf[js.Any]))
      lastDeploymentTime.foreach(__v => __obj.updateDynamic("lastDeploymentTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Robot]
    }
  }

  /**
    * Application configuration information for a robot.
    */
  @js.native
  trait RobotApplicationConfig extends js.Object {
    var application: Arn
    var launchConfig: LaunchConfig
    var applicationVersion: js.UndefOr[Version]
  }

  object RobotApplicationConfig {
    @inline
    def apply(
        application: Arn,
        launchConfig: LaunchConfig,
        applicationVersion: js.UndefOr[Version] = js.undefined
    ): RobotApplicationConfig = {
      val __obj = js.Dynamic.literal(
        "application" -> application.asInstanceOf[js.Any],
        "launchConfig" -> launchConfig.asInstanceOf[js.Any]
      )

      applicationVersion.foreach(__v => __obj.updateDynamic("applicationVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RobotApplicationConfig]
    }
  }

  /**
    * Summary information for a robot application.
    */
  @js.native
  trait RobotApplicationSummary extends js.Object {
    var arn: js.UndefOr[Arn]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var name: js.UndefOr[Name]
    var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite]
    var version: js.UndefOr[Version]
  }

  object RobotApplicationSummary {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): RobotApplicationSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      robotSoftwareSuite.foreach(__v => __obj.updateDynamic("robotSoftwareSuite")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RobotApplicationSummary]
    }
  }

  /**
    * Information about a robot deployment.
    */
  @js.native
  trait RobotDeployment extends js.Object {
    var arn: js.UndefOr[Arn]
    var deploymentFinishTime: js.UndefOr[CreatedAt]
    var deploymentStartTime: js.UndefOr[CreatedAt]
    var failureCode: js.UndefOr[DeploymentJobErrorCode]
    var failureReason: js.UndefOr[GenericString]
    var progressDetail: js.UndefOr[ProgressDetail]
    var status: js.UndefOr[RobotStatus]
  }

  object RobotDeployment {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        deploymentFinishTime: js.UndefOr[CreatedAt] = js.undefined,
        deploymentStartTime: js.UndefOr[CreatedAt] = js.undefined,
        failureCode: js.UndefOr[DeploymentJobErrorCode] = js.undefined,
        failureReason: js.UndefOr[GenericString] = js.undefined,
        progressDetail: js.UndefOr[ProgressDetail] = js.undefined,
        status: js.UndefOr[RobotStatus] = js.undefined
    ): RobotDeployment = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      deploymentFinishTime.foreach(__v => __obj.updateDynamic("deploymentFinishTime")(__v.asInstanceOf[js.Any]))
      deploymentStartTime.foreach(__v => __obj.updateDynamic("deploymentStartTime")(__v.asInstanceOf[js.Any]))
      failureCode.foreach(__v => __obj.updateDynamic("failureCode")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      progressDetail.foreach(__v => __obj.updateDynamic("progressDetail")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RobotDeployment]
    }
  }

  @js.native
  sealed trait RobotDeploymentStep extends js.Any
  object RobotDeploymentStep {
    @inline def Validating = "Validating".asInstanceOf[RobotDeploymentStep]
    @inline def DownloadingExtracting = "DownloadingExtracting".asInstanceOf[RobotDeploymentStep]
    @inline def ExecutingDownloadCondition = "ExecutingDownloadCondition".asInstanceOf[RobotDeploymentStep]
    @inline def ExecutingPreLaunch = "ExecutingPreLaunch".asInstanceOf[RobotDeploymentStep]
    @inline def Launching = "Launching".asInstanceOf[RobotDeploymentStep]
    @inline def ExecutingPostLaunch = "ExecutingPostLaunch".asInstanceOf[RobotDeploymentStep]
    @inline def Finished = "Finished".asInstanceOf[RobotDeploymentStep]

    @inline def values = js.Object.freeze(js.Array(Validating, DownloadingExtracting, ExecutingDownloadCondition, ExecutingPreLaunch, Launching, ExecutingPostLaunch, Finished))
  }

  /**
    * Information about a robot software suite (ROS distribution).
    */
  @js.native
  trait RobotSoftwareSuite extends js.Object {
    var name: js.UndefOr[RobotSoftwareSuiteType]
    var version: js.UndefOr[RobotSoftwareSuiteVersionType]
  }

  object RobotSoftwareSuite {
    @inline
    def apply(
        name: js.UndefOr[RobotSoftwareSuiteType] = js.undefined,
        version: js.UndefOr[RobotSoftwareSuiteVersionType] = js.undefined
    ): RobotSoftwareSuite = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RobotSoftwareSuite]
    }
  }

  @js.native
  sealed trait RobotSoftwareSuiteType extends js.Any
  object RobotSoftwareSuiteType {
    @inline def ROS = "ROS".asInstanceOf[RobotSoftwareSuiteType]
    @inline def ROS2 = "ROS2".asInstanceOf[RobotSoftwareSuiteType]

    @inline def values = js.Object.freeze(js.Array(ROS, ROS2))
  }

  @js.native
  sealed trait RobotSoftwareSuiteVersionType extends js.Any
  object RobotSoftwareSuiteVersionType {
    @inline def Kinetic = "Kinetic".asInstanceOf[RobotSoftwareSuiteVersionType]
    @inline def Melodic = "Melodic".asInstanceOf[RobotSoftwareSuiteVersionType]
    @inline def Dashing = "Dashing".asInstanceOf[RobotSoftwareSuiteVersionType]

    @inline def values = js.Object.freeze(js.Array(Kinetic, Melodic, Dashing))
  }

  @js.native
  sealed trait RobotStatus extends js.Any
  object RobotStatus {
    @inline def Available = "Available".asInstanceOf[RobotStatus]
    @inline def Registered = "Registered".asInstanceOf[RobotStatus]
    @inline def PendingNewDeployment = "PendingNewDeployment".asInstanceOf[RobotStatus]
    @inline def Deploying = "Deploying".asInstanceOf[RobotStatus]
    @inline def Failed = "Failed".asInstanceOf[RobotStatus]
    @inline def InSync = "InSync".asInstanceOf[RobotStatus]
    @inline def NoResponse = "NoResponse".asInstanceOf[RobotStatus]

    @inline def values = js.Object.freeze(js.Array(Available, Registered, PendingNewDeployment, Deploying, Failed, InSync, NoResponse))
  }

  /**
    * Information about S3 keys.
    */
  @js.native
  trait S3KeyOutput extends js.Object {
    var etag: js.UndefOr[S3Etag]
    var s3Key: js.UndefOr[S3Key]
  }

  object S3KeyOutput {
    @inline
    def apply(
        etag: js.UndefOr[S3Etag] = js.undefined,
        s3Key: js.UndefOr[S3Key] = js.undefined
    ): S3KeyOutput = {
      val __obj = js.Dynamic.literal()
      etag.foreach(__v => __obj.updateDynamic("etag")(__v.asInstanceOf[js.Any]))
      s3Key.foreach(__v => __obj.updateDynamic("s3Key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3KeyOutput]
    }
  }

  /**
    * Information about an S3 object.
    */
  @js.native
  trait S3Object extends js.Object {
    var bucket: S3Bucket
    var key: S3Key
    var etag: js.UndefOr[S3Etag]
  }

  object S3Object {
    @inline
    def apply(
        bucket: S3Bucket,
        key: S3Key,
        etag: js.UndefOr[S3Etag] = js.undefined
    ): S3Object = {
      val __obj = js.Dynamic.literal(
        "bucket" -> bucket.asInstanceOf[js.Any],
        "key" -> key.asInstanceOf[js.Any]
      )

      etag.foreach(__v => __obj.updateDynamic("etag")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Object]
    }
  }

  /**
    * Information about a simulation application configuration.
    */
  @js.native
  trait SimulationApplicationConfig extends js.Object {
    var application: Arn
    var launchConfig: LaunchConfig
    var applicationVersion: js.UndefOr[Version]
  }

  object SimulationApplicationConfig {
    @inline
    def apply(
        application: Arn,
        launchConfig: LaunchConfig,
        applicationVersion: js.UndefOr[Version] = js.undefined
    ): SimulationApplicationConfig = {
      val __obj = js.Dynamic.literal(
        "application" -> application.asInstanceOf[js.Any],
        "launchConfig" -> launchConfig.asInstanceOf[js.Any]
      )

      applicationVersion.foreach(__v => __obj.updateDynamic("applicationVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimulationApplicationConfig]
    }
  }

  /**
    * Summary information for a simulation application.
    */
  @js.native
  trait SimulationApplicationSummary extends js.Object {
    var arn: js.UndefOr[Arn]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var name: js.UndefOr[Name]
    var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite]
    var simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite]
    var version: js.UndefOr[Version]
  }

  object SimulationApplicationSummary {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined,
        simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): SimulationApplicationSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      robotSoftwareSuite.foreach(__v => __obj.updateDynamic("robotSoftwareSuite")(__v.asInstanceOf[js.Any]))
      simulationSoftwareSuite.foreach(__v => __obj.updateDynamic("simulationSoftwareSuite")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimulationApplicationSummary]
    }
  }

  /**
    * Information about a simulation job.
    */
  @js.native
  trait SimulationJob extends js.Object {
    var arn: js.UndefOr[Arn]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var compute: js.UndefOr[ComputeResponse]
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

  object SimulationJob {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        compute: js.UndefOr[ComputeResponse] = js.undefined,
        dataSources: js.UndefOr[DataSources] = js.undefined,
        failureBehavior: js.UndefOr[FailureBehavior] = js.undefined,
        failureCode: js.UndefOr[SimulationJobErrorCode] = js.undefined,
        failureReason: js.UndefOr[GenericString] = js.undefined,
        iamRole: js.UndefOr[IamRole] = js.undefined,
        lastStartedAt: js.UndefOr[LastStartedAt] = js.undefined,
        lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
        loggingConfig: js.UndefOr[LoggingConfig] = js.undefined,
        maxJobDurationInSeconds: js.UndefOr[JobDuration] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        networkInterface: js.UndefOr[NetworkInterface] = js.undefined,
        outputLocation: js.UndefOr[OutputLocation] = js.undefined,
        robotApplications: js.UndefOr[RobotApplicationConfigs] = js.undefined,
        simulationApplications: js.UndefOr[SimulationApplicationConfigs] = js.undefined,
        simulationTimeMillis: js.UndefOr[SimulationTimeMillis] = js.undefined,
        status: js.UndefOr[SimulationJobStatus] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        vpcConfig: js.UndefOr[VPCConfigResponse] = js.undefined
    ): SimulationJob = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      compute.foreach(__v => __obj.updateDynamic("compute")(__v.asInstanceOf[js.Any]))
      dataSources.foreach(__v => __obj.updateDynamic("dataSources")(__v.asInstanceOf[js.Any]))
      failureBehavior.foreach(__v => __obj.updateDynamic("failureBehavior")(__v.asInstanceOf[js.Any]))
      failureCode.foreach(__v => __obj.updateDynamic("failureCode")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      iamRole.foreach(__v => __obj.updateDynamic("iamRole")(__v.asInstanceOf[js.Any]))
      lastStartedAt.foreach(__v => __obj.updateDynamic("lastStartedAt")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      loggingConfig.foreach(__v => __obj.updateDynamic("loggingConfig")(__v.asInstanceOf[js.Any]))
      maxJobDurationInSeconds.foreach(__v => __obj.updateDynamic("maxJobDurationInSeconds")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      networkInterface.foreach(__v => __obj.updateDynamic("networkInterface")(__v.asInstanceOf[js.Any]))
      outputLocation.foreach(__v => __obj.updateDynamic("outputLocation")(__v.asInstanceOf[js.Any]))
      robotApplications.foreach(__v => __obj.updateDynamic("robotApplications")(__v.asInstanceOf[js.Any]))
      simulationApplications.foreach(__v => __obj.updateDynamic("simulationApplications")(__v.asInstanceOf[js.Any]))
      simulationTimeMillis.foreach(__v => __obj.updateDynamic("simulationTimeMillis")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      vpcConfig.foreach(__v => __obj.updateDynamic("vpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimulationJob]
    }
  }

  @js.native
  sealed trait SimulationJobBatchErrorCode extends js.Any
  object SimulationJobBatchErrorCode {
    @inline def InternalServiceError = "InternalServiceError".asInstanceOf[SimulationJobBatchErrorCode]

    @inline def values = js.Object.freeze(js.Array(InternalServiceError))
  }

  @js.native
  sealed trait SimulationJobBatchStatus extends js.Any
  object SimulationJobBatchStatus {
    @inline def Pending = "Pending".asInstanceOf[SimulationJobBatchStatus]
    @inline def InProgress = "InProgress".asInstanceOf[SimulationJobBatchStatus]
    @inline def Failed = "Failed".asInstanceOf[SimulationJobBatchStatus]
    @inline def Completed = "Completed".asInstanceOf[SimulationJobBatchStatus]
    @inline def Canceled = "Canceled".asInstanceOf[SimulationJobBatchStatus]
    @inline def Canceling = "Canceling".asInstanceOf[SimulationJobBatchStatus]
    @inline def Completing = "Completing".asInstanceOf[SimulationJobBatchStatus]
    @inline def TimingOut = "TimingOut".asInstanceOf[SimulationJobBatchStatus]
    @inline def TimedOut = "TimedOut".asInstanceOf[SimulationJobBatchStatus]

    @inline def values = js.Object.freeze(js.Array(Pending, InProgress, Failed, Completed, Canceled, Canceling, Completing, TimingOut, TimedOut))
  }

  /**
    * Information about a simulation job batch.
    */
  @js.native
  trait SimulationJobBatchSummary extends js.Object {
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[CreatedAt]
    var createdRequestCount: js.UndefOr[Int]
    var failedRequestCount: js.UndefOr[Int]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var pendingRequestCount: js.UndefOr[Int]
    var status: js.UndefOr[SimulationJobBatchStatus]
  }

  object SimulationJobBatchSummary {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        createdAt: js.UndefOr[CreatedAt] = js.undefined,
        createdRequestCount: js.UndefOr[Int] = js.undefined,
        failedRequestCount: js.UndefOr[Int] = js.undefined,
        lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
        pendingRequestCount: js.UndefOr[Int] = js.undefined,
        status: js.UndefOr[SimulationJobBatchStatus] = js.undefined
    ): SimulationJobBatchSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      createdRequestCount.foreach(__v => __obj.updateDynamic("createdRequestCount")(__v.asInstanceOf[js.Any]))
      failedRequestCount.foreach(__v => __obj.updateDynamic("failedRequestCount")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      pendingRequestCount.foreach(__v => __obj.updateDynamic("pendingRequestCount")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimulationJobBatchSummary]
    }
  }

  @js.native
  sealed trait SimulationJobErrorCode extends js.Any
  object SimulationJobErrorCode {
    @inline def InternalServiceError = "InternalServiceError".asInstanceOf[SimulationJobErrorCode]
    @inline def RobotApplicationCrash = "RobotApplicationCrash".asInstanceOf[SimulationJobErrorCode]
    @inline def SimulationApplicationCrash = "SimulationApplicationCrash".asInstanceOf[SimulationJobErrorCode]
    @inline def BadPermissionsRobotApplication = "BadPermissionsRobotApplication".asInstanceOf[SimulationJobErrorCode]
    @inline def BadPermissionsSimulationApplication = "BadPermissionsSimulationApplication".asInstanceOf[SimulationJobErrorCode]
    @inline def BadPermissionsS3Object = "BadPermissionsS3Object".asInstanceOf[SimulationJobErrorCode]
    @inline def BadPermissionsS3Output = "BadPermissionsS3Output".asInstanceOf[SimulationJobErrorCode]
    @inline def BadPermissionsCloudwatchLogs = "BadPermissionsCloudwatchLogs".asInstanceOf[SimulationJobErrorCode]
    @inline def SubnetIpLimitExceeded = "SubnetIpLimitExceeded".asInstanceOf[SimulationJobErrorCode]
    @inline def ENILimitExceeded = "ENILimitExceeded".asInstanceOf[SimulationJobErrorCode]
    @inline def BadPermissionsUserCredentials = "BadPermissionsUserCredentials".asInstanceOf[SimulationJobErrorCode]
    @inline def InvalidBundleRobotApplication = "InvalidBundleRobotApplication".asInstanceOf[SimulationJobErrorCode]
    @inline def InvalidBundleSimulationApplication = "InvalidBundleSimulationApplication".asInstanceOf[SimulationJobErrorCode]
    @inline def InvalidS3Resource = "InvalidS3Resource".asInstanceOf[SimulationJobErrorCode]
    @inline def LimitExceeded = "LimitExceeded".asInstanceOf[SimulationJobErrorCode]
    @inline def MismatchedEtag = "MismatchedEtag".asInstanceOf[SimulationJobErrorCode]
    @inline def RobotApplicationVersionMismatchedEtag = "RobotApplicationVersionMismatchedEtag".asInstanceOf[SimulationJobErrorCode]
    @inline def SimulationApplicationVersionMismatchedEtag = "SimulationApplicationVersionMismatchedEtag".asInstanceOf[SimulationJobErrorCode]
    @inline def ResourceNotFound = "ResourceNotFound".asInstanceOf[SimulationJobErrorCode]
    @inline def RequestThrottled = "RequestThrottled".asInstanceOf[SimulationJobErrorCode]
    @inline def BatchTimedOut = "BatchTimedOut".asInstanceOf[SimulationJobErrorCode]
    @inline def BatchCanceled = "BatchCanceled".asInstanceOf[SimulationJobErrorCode]
    @inline def InvalidInput = "InvalidInput".asInstanceOf[SimulationJobErrorCode]
    @inline def WrongRegionS3Bucket = "WrongRegionS3Bucket".asInstanceOf[SimulationJobErrorCode]
    @inline def WrongRegionS3Output = "WrongRegionS3Output".asInstanceOf[SimulationJobErrorCode]
    @inline def WrongRegionRobotApplication = "WrongRegionRobotApplication".asInstanceOf[SimulationJobErrorCode]
    @inline def WrongRegionSimulationApplication = "WrongRegionSimulationApplication".asInstanceOf[SimulationJobErrorCode]

    @inline def values =
      js.Object.freeze(js.Array(
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
      ))
  }

  /**
    * Information about a simulation job request.
    */
  @js.native
  trait SimulationJobRequest extends js.Object {
    var maxJobDurationInSeconds: JobDuration
    var compute: js.UndefOr[Compute]
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

  object SimulationJobRequest {
    @inline
    def apply(
        maxJobDurationInSeconds: JobDuration,
        compute: js.UndefOr[Compute] = js.undefined,
        dataSources: js.UndefOr[DataSourceConfigs] = js.undefined,
        failureBehavior: js.UndefOr[FailureBehavior] = js.undefined,
        iamRole: js.UndefOr[IamRole] = js.undefined,
        loggingConfig: js.UndefOr[LoggingConfig] = js.undefined,
        outputLocation: js.UndefOr[OutputLocation] = js.undefined,
        robotApplications: js.UndefOr[RobotApplicationConfigs] = js.undefined,
        simulationApplications: js.UndefOr[SimulationApplicationConfigs] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        useDefaultApplications: js.UndefOr[BoxedBoolean] = js.undefined,
        vpcConfig: js.UndefOr[VPCConfig] = js.undefined
    ): SimulationJobRequest = {
      val __obj = js.Dynamic.literal(
        "maxJobDurationInSeconds" -> maxJobDurationInSeconds.asInstanceOf[js.Any]
      )

      compute.foreach(__v => __obj.updateDynamic("compute")(__v.asInstanceOf[js.Any]))
      dataSources.foreach(__v => __obj.updateDynamic("dataSources")(__v.asInstanceOf[js.Any]))
      failureBehavior.foreach(__v => __obj.updateDynamic("failureBehavior")(__v.asInstanceOf[js.Any]))
      iamRole.foreach(__v => __obj.updateDynamic("iamRole")(__v.asInstanceOf[js.Any]))
      loggingConfig.foreach(__v => __obj.updateDynamic("loggingConfig")(__v.asInstanceOf[js.Any]))
      outputLocation.foreach(__v => __obj.updateDynamic("outputLocation")(__v.asInstanceOf[js.Any]))
      robotApplications.foreach(__v => __obj.updateDynamic("robotApplications")(__v.asInstanceOf[js.Any]))
      simulationApplications.foreach(__v => __obj.updateDynamic("simulationApplications")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      useDefaultApplications.foreach(__v => __obj.updateDynamic("useDefaultApplications")(__v.asInstanceOf[js.Any]))
      vpcConfig.foreach(__v => __obj.updateDynamic("vpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimulationJobRequest]
    }
  }

  @js.native
  sealed trait SimulationJobStatus extends js.Any
  object SimulationJobStatus {
    @inline def Pending = "Pending".asInstanceOf[SimulationJobStatus]
    @inline def Preparing = "Preparing".asInstanceOf[SimulationJobStatus]
    @inline def Running = "Running".asInstanceOf[SimulationJobStatus]
    @inline def Restarting = "Restarting".asInstanceOf[SimulationJobStatus]
    @inline def Completed = "Completed".asInstanceOf[SimulationJobStatus]
    @inline def Failed = "Failed".asInstanceOf[SimulationJobStatus]
    @inline def RunningFailed = "RunningFailed".asInstanceOf[SimulationJobStatus]
    @inline def Terminating = "Terminating".asInstanceOf[SimulationJobStatus]
    @inline def Terminated = "Terminated".asInstanceOf[SimulationJobStatus]
    @inline def Canceled = "Canceled".asInstanceOf[SimulationJobStatus]

    @inline def values = js.Object.freeze(js.Array(Pending, Preparing, Running, Restarting, Completed, Failed, RunningFailed, Terminating, Terminated, Canceled))
  }

  /**
    * Summary information for a simulation job.
    */
  @js.native
  trait SimulationJobSummary extends js.Object {
    var arn: js.UndefOr[Arn]
    var dataSourceNames: js.UndefOr[DataSourceNames]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var name: js.UndefOr[Name]
    var robotApplicationNames: js.UndefOr[RobotApplicationNames]
    var simulationApplicationNames: js.UndefOr[SimulationApplicationNames]
    var status: js.UndefOr[SimulationJobStatus]
  }

  object SimulationJobSummary {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        dataSourceNames: js.UndefOr[DataSourceNames] = js.undefined,
        lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        robotApplicationNames: js.UndefOr[RobotApplicationNames] = js.undefined,
        simulationApplicationNames: js.UndefOr[SimulationApplicationNames] = js.undefined,
        status: js.UndefOr[SimulationJobStatus] = js.undefined
    ): SimulationJobSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      dataSourceNames.foreach(__v => __obj.updateDynamic("dataSourceNames")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      robotApplicationNames.foreach(__v => __obj.updateDynamic("robotApplicationNames")(__v.asInstanceOf[js.Any]))
      simulationApplicationNames.foreach(__v => __obj.updateDynamic("simulationApplicationNames")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimulationJobSummary]
    }
  }

  /**
    * Information about a simulation software suite.
    */
  @js.native
  trait SimulationSoftwareSuite extends js.Object {
    var name: js.UndefOr[SimulationSoftwareSuiteType]
    var version: js.UndefOr[SimulationSoftwareSuiteVersionType]
  }

  object SimulationSoftwareSuite {
    @inline
    def apply(
        name: js.UndefOr[SimulationSoftwareSuiteType] = js.undefined,
        version: js.UndefOr[SimulationSoftwareSuiteVersionType] = js.undefined
    ): SimulationSoftwareSuite = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimulationSoftwareSuite]
    }
  }

  @js.native
  sealed trait SimulationSoftwareSuiteType extends js.Any
  object SimulationSoftwareSuiteType {
    @inline def Gazebo = "Gazebo".asInstanceOf[SimulationSoftwareSuiteType]
    @inline def RosbagPlay = "RosbagPlay".asInstanceOf[SimulationSoftwareSuiteType]

    @inline def values = js.Object.freeze(js.Array(Gazebo, RosbagPlay))
  }

  /**
    * Information about a source.
    */
  @js.native
  trait Source extends js.Object {
    var architecture: js.UndefOr[Architecture]
    var etag: js.UndefOr[S3Etag]
    var s3Bucket: js.UndefOr[S3Bucket]
    var s3Key: js.UndefOr[S3Key]
  }

  object Source {
    @inline
    def apply(
        architecture: js.UndefOr[Architecture] = js.undefined,
        etag: js.UndefOr[S3Etag] = js.undefined,
        s3Bucket: js.UndefOr[S3Bucket] = js.undefined,
        s3Key: js.UndefOr[S3Key] = js.undefined
    ): Source = {
      val __obj = js.Dynamic.literal()
      architecture.foreach(__v => __obj.updateDynamic("architecture")(__v.asInstanceOf[js.Any]))
      etag.foreach(__v => __obj.updateDynamic("etag")(__v.asInstanceOf[js.Any]))
      s3Bucket.foreach(__v => __obj.updateDynamic("s3Bucket")(__v.asInstanceOf[js.Any]))
      s3Key.foreach(__v => __obj.updateDynamic("s3Key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Source]
    }
  }

  /**
    * Information about a source configuration.
    */
  @js.native
  trait SourceConfig extends js.Object {
    var architecture: js.UndefOr[Architecture]
    var s3Bucket: js.UndefOr[S3Bucket]
    var s3Key: js.UndefOr[S3Key]
  }

  object SourceConfig {
    @inline
    def apply(
        architecture: js.UndefOr[Architecture] = js.undefined,
        s3Bucket: js.UndefOr[S3Bucket] = js.undefined,
        s3Key: js.UndefOr[S3Key] = js.undefined
    ): SourceConfig = {
      val __obj = js.Dynamic.literal()
      architecture.foreach(__v => __obj.updateDynamic("architecture")(__v.asInstanceOf[js.Any]))
      s3Bucket.foreach(__v => __obj.updateDynamic("s3Bucket")(__v.asInstanceOf[js.Any]))
      s3Key.foreach(__v => __obj.updateDynamic("s3Key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceConfig]
    }
  }

  @js.native
  trait StartSimulationJobBatchRequest extends js.Object {
    var createSimulationJobRequests: CreateSimulationJobRequests
    var batchPolicy: js.UndefOr[BatchPolicy]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var tags: js.UndefOr[TagMap]
  }

  object StartSimulationJobBatchRequest {
    @inline
    def apply(
        createSimulationJobRequests: CreateSimulationJobRequests,
        batchPolicy: js.UndefOr[BatchPolicy] = js.undefined,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): StartSimulationJobBatchRequest = {
      val __obj = js.Dynamic.literal(
        "createSimulationJobRequests" -> createSimulationJobRequests.asInstanceOf[js.Any]
      )

      batchPolicy.foreach(__v => __obj.updateDynamic("batchPolicy")(__v.asInstanceOf[js.Any]))
      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSimulationJobBatchRequest]
    }
  }

  @js.native
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

  object StartSimulationJobBatchResponse {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        batchPolicy: js.UndefOr[BatchPolicy] = js.undefined,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        createdAt: js.UndefOr[CreatedAt] = js.undefined,
        createdRequests: js.UndefOr[SimulationJobSummaries] = js.undefined,
        failedRequests: js.UndefOr[FailedCreateSimulationJobRequests] = js.undefined,
        failureCode: js.UndefOr[SimulationJobBatchErrorCode] = js.undefined,
        failureReason: js.UndefOr[GenericString] = js.undefined,
        pendingRequests: js.UndefOr[CreateSimulationJobRequests] = js.undefined,
        status: js.UndefOr[SimulationJobBatchStatus] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): StartSimulationJobBatchResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      batchPolicy.foreach(__v => __obj.updateDynamic("batchPolicy")(__v.asInstanceOf[js.Any]))
      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      createdRequests.foreach(__v => __obj.updateDynamic("createdRequests")(__v.asInstanceOf[js.Any]))
      failedRequests.foreach(__v => __obj.updateDynamic("failedRequests")(__v.asInstanceOf[js.Any]))
      failureCode.foreach(__v => __obj.updateDynamic("failureCode")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      pendingRequests.foreach(__v => __obj.updateDynamic("pendingRequests")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSimulationJobBatchResponse]
    }
  }

  @js.native
  trait SyncDeploymentJobRequest extends js.Object {
    var clientRequestToken: ClientRequestToken
    var fleet: Arn
  }

  object SyncDeploymentJobRequest {
    @inline
    def apply(
        clientRequestToken: ClientRequestToken,
        fleet: Arn
    ): SyncDeploymentJobRequest = {
      val __obj = js.Dynamic.literal(
        "clientRequestToken" -> clientRequestToken.asInstanceOf[js.Any],
        "fleet" -> fleet.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SyncDeploymentJobRequest]
    }
  }

  @js.native
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

  object SyncDeploymentJobResponse {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        createdAt: js.UndefOr[CreatedAt] = js.undefined,
        deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs] = js.undefined,
        deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined,
        failureCode: js.UndefOr[DeploymentJobErrorCode] = js.undefined,
        failureReason: js.UndefOr[GenericString] = js.undefined,
        fleet: js.UndefOr[Arn] = js.undefined,
        status: js.UndefOr[DeploymentStatus] = js.undefined
    ): SyncDeploymentJobResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      deploymentApplicationConfigs.foreach(__v => __obj.updateDynamic("deploymentApplicationConfigs")(__v.asInstanceOf[js.Any]))
      deploymentConfig.foreach(__v => __obj.updateDynamic("deploymentConfig")(__v.asInstanceOf[js.Any]))
      failureCode.foreach(__v => __obj.updateDynamic("failureCode")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      fleet.foreach(__v => __obj.updateDynamic("fleet")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SyncDeploymentJobResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: Arn,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: Arn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateRobotApplicationRequest extends js.Object {
    var application: Arn
    var robotSoftwareSuite: RobotSoftwareSuite
    var sources: SourceConfigs
    var currentRevisionId: js.UndefOr[RevisionId]
  }

  object UpdateRobotApplicationRequest {
    @inline
    def apply(
        application: Arn,
        robotSoftwareSuite: RobotSoftwareSuite,
        sources: SourceConfigs,
        currentRevisionId: js.UndefOr[RevisionId] = js.undefined
    ): UpdateRobotApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "application" -> application.asInstanceOf[js.Any],
        "robotSoftwareSuite" -> robotSoftwareSuite.asInstanceOf[js.Any],
        "sources" -> sources.asInstanceOf[js.Any]
      )

      currentRevisionId.foreach(__v => __obj.updateDynamic("currentRevisionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRobotApplicationRequest]
    }
  }

  @js.native
  trait UpdateRobotApplicationResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var name: js.UndefOr[Name]
    var revisionId: js.UndefOr[RevisionId]
    var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite]
    var sources: js.UndefOr[Sources]
    var version: js.UndefOr[Version]
  }

  object UpdateRobotApplicationResponse {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        revisionId: js.UndefOr[RevisionId] = js.undefined,
        robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined,
        sources: js.UndefOr[Sources] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): UpdateRobotApplicationResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      revisionId.foreach(__v => __obj.updateDynamic("revisionId")(__v.asInstanceOf[js.Any]))
      robotSoftwareSuite.foreach(__v => __obj.updateDynamic("robotSoftwareSuite")(__v.asInstanceOf[js.Any]))
      sources.foreach(__v => __obj.updateDynamic("sources")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRobotApplicationResponse]
    }
  }

  @js.native
  trait UpdateSimulationApplicationRequest extends js.Object {
    var application: Arn
    var robotSoftwareSuite: RobotSoftwareSuite
    var simulationSoftwareSuite: SimulationSoftwareSuite
    var sources: SourceConfigs
    var currentRevisionId: js.UndefOr[RevisionId]
    var renderingEngine: js.UndefOr[RenderingEngine]
  }

  object UpdateSimulationApplicationRequest {
    @inline
    def apply(
        application: Arn,
        robotSoftwareSuite: RobotSoftwareSuite,
        simulationSoftwareSuite: SimulationSoftwareSuite,
        sources: SourceConfigs,
        currentRevisionId: js.UndefOr[RevisionId] = js.undefined,
        renderingEngine: js.UndefOr[RenderingEngine] = js.undefined
    ): UpdateSimulationApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "application" -> application.asInstanceOf[js.Any],
        "robotSoftwareSuite" -> robotSoftwareSuite.asInstanceOf[js.Any],
        "simulationSoftwareSuite" -> simulationSoftwareSuite.asInstanceOf[js.Any],
        "sources" -> sources.asInstanceOf[js.Any]
      )

      currentRevisionId.foreach(__v => __obj.updateDynamic("currentRevisionId")(__v.asInstanceOf[js.Any]))
      renderingEngine.foreach(__v => __obj.updateDynamic("renderingEngine")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSimulationApplicationRequest]
    }
  }

  @js.native
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

  object UpdateSimulationApplicationResponse {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        renderingEngine: js.UndefOr[RenderingEngine] = js.undefined,
        revisionId: js.UndefOr[RevisionId] = js.undefined,
        robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined,
        simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite] = js.undefined,
        sources: js.UndefOr[Sources] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): UpdateSimulationApplicationResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      renderingEngine.foreach(__v => __obj.updateDynamic("renderingEngine")(__v.asInstanceOf[js.Any]))
      revisionId.foreach(__v => __obj.updateDynamic("revisionId")(__v.asInstanceOf[js.Any]))
      robotSoftwareSuite.foreach(__v => __obj.updateDynamic("robotSoftwareSuite")(__v.asInstanceOf[js.Any]))
      simulationSoftwareSuite.foreach(__v => __obj.updateDynamic("simulationSoftwareSuite")(__v.asInstanceOf[js.Any]))
      sources.foreach(__v => __obj.updateDynamic("sources")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSimulationApplicationResponse]
    }
  }

  /**
    * If your simulation job accesses resources in a VPC, you provide this parameter identifying the list of security group IDs and subnet IDs. These must belong to the same VPC. You must provide at least one security group and two subnet IDs.
    */
  @js.native
  trait VPCConfig extends js.Object {
    var subnets: Subnets
    var assignPublicIp: js.UndefOr[Boolean]
    var securityGroups: js.UndefOr[SecurityGroups]
  }

  object VPCConfig {
    @inline
    def apply(
        subnets: Subnets,
        assignPublicIp: js.UndefOr[Boolean] = js.undefined,
        securityGroups: js.UndefOr[SecurityGroups] = js.undefined
    ): VPCConfig = {
      val __obj = js.Dynamic.literal(
        "subnets" -> subnets.asInstanceOf[js.Any]
      )

      assignPublicIp.foreach(__v => __obj.updateDynamic("assignPublicIp")(__v.asInstanceOf[js.Any]))
      securityGroups.foreach(__v => __obj.updateDynamic("securityGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VPCConfig]
    }
  }

  /**
    * VPC configuration associated with your simulation job.
    */
  @js.native
  trait VPCConfigResponse extends js.Object {
    var assignPublicIp: js.UndefOr[Boolean]
    var securityGroups: js.UndefOr[SecurityGroups]
    var subnets: js.UndefOr[Subnets]
    var vpcId: js.UndefOr[GenericString]
  }

  object VPCConfigResponse {
    @inline
    def apply(
        assignPublicIp: js.UndefOr[Boolean] = js.undefined,
        securityGroups: js.UndefOr[SecurityGroups] = js.undefined,
        subnets: js.UndefOr[Subnets] = js.undefined,
        vpcId: js.UndefOr[GenericString] = js.undefined
    ): VPCConfigResponse = {
      val __obj = js.Dynamic.literal()
      assignPublicIp.foreach(__v => __obj.updateDynamic("assignPublicIp")(__v.asInstanceOf[js.Any]))
      securityGroups.foreach(__v => __obj.updateDynamic("securityGroups")(__v.asInstanceOf[js.Any]))
      subnets.foreach(__v => __obj.updateDynamic("subnets")(__v.asInstanceOf[js.Any]))
      vpcId.foreach(__v => __obj.updateDynamic("vpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VPCConfigResponse]
    }
  }
}
