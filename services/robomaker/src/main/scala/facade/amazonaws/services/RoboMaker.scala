package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object robomaker {
  type Architecture                       = String
  type Arn                                = String
  type Arns                               = js.Array[Arn]
  type BoxedBoolean                       = Boolean
  type ClientRequestToken                 = String
  type Command                            = String
  type CreatedAt                          = js.Date
  type DataSourceConfigs                  = js.Array[DataSourceConfig]
  type DataSourceNames                    = js.Array[Name]
  type DataSources                        = js.Array[DataSource]
  type DeploymentApplicationConfigs       = js.Array[DeploymentApplicationConfig]
  type DeploymentJobErrorCode             = String
  type DeploymentJobs                     = js.Array[DeploymentJob]
  type DeploymentStatus                   = String
  type DeploymentTimeout                  = Double
  type DeploymentVersion                  = String
  type EnvironmentVariableKey             = String
  type EnvironmentVariableMap             = js.Dictionary[EnvironmentVariableValue]
  type EnvironmentVariableValue           = String
  type FailureBehavior                    = String
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
  type MaxResults                         = Int
  type Name                               = String
  type NonEmptyString                     = String
  type PaginationToken                    = String
  type Path                               = String
  type PercentDone                        = Float
  type Percentage                         = Int
  type RenderingEngineType                = String
  type RenderingEngineVersionType         = String
  type RevisionId                         = String
  type RobotApplicationConfigs            = js.Array[RobotApplicationConfig]
  type RobotApplicationNames              = js.Array[Name]
  type RobotApplicationSummaries          = js.Array[RobotApplicationSummary]
  type RobotDeploymentStep                = String
  type RobotDeploymentSummary             = js.Array[RobotDeployment]
  type RobotSoftwareSuiteType             = String
  type RobotSoftwareSuiteVersionType      = String
  type RobotStatus                        = String
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
  type SimulationJobErrorCode             = String
  type SimulationJobStatus                = String
  type SimulationJobSummaries             = js.Array[SimulationJobSummary]
  type SimulationJobs                     = js.Array[SimulationJob]
  type SimulationSoftwareSuiteType        = String
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

    def batchDescribeSimulationJobFuture(
        params: BatchDescribeSimulationJobRequest
    ): Future[BatchDescribeSimulationJobResponse] = service.batchDescribeSimulationJob(params).promise.toFuture
    def cancelDeploymentJobFuture(params: CancelDeploymentJobRequest): Future[CancelDeploymentJobResponse] =
      service.cancelDeploymentJob(params).promise.toFuture
    def cancelSimulationJobFuture(params: CancelSimulationJobRequest): Future[CancelSimulationJobResponse] =
      service.cancelSimulationJob(params).promise.toFuture
    def createDeploymentJobFuture(params: CreateDeploymentJobRequest): Future[CreateDeploymentJobResponse] =
      service.createDeploymentJob(params).promise.toFuture
    def createFleetFuture(params: CreateFleetRequest): Future[CreateFleetResponse] =
      service.createFleet(params).promise.toFuture
    def createRobotApplicationFuture(params: CreateRobotApplicationRequest): Future[CreateRobotApplicationResponse] =
      service.createRobotApplication(params).promise.toFuture
    def createRobotApplicationVersionFuture(
        params: CreateRobotApplicationVersionRequest
    ): Future[CreateRobotApplicationVersionResponse] = service.createRobotApplicationVersion(params).promise.toFuture
    def createRobotFuture(params: CreateRobotRequest): Future[CreateRobotResponse] =
      service.createRobot(params).promise.toFuture
    def createSimulationApplicationFuture(
        params: CreateSimulationApplicationRequest
    ): Future[CreateSimulationApplicationResponse] = service.createSimulationApplication(params).promise.toFuture
    def createSimulationApplicationVersionFuture(
        params: CreateSimulationApplicationVersionRequest
    ): Future[CreateSimulationApplicationVersionResponse] =
      service.createSimulationApplicationVersion(params).promise.toFuture
    def createSimulationJobFuture(params: CreateSimulationJobRequest): Future[CreateSimulationJobResponse] =
      service.createSimulationJob(params).promise.toFuture
    def deleteFleetFuture(params: DeleteFleetRequest): Future[DeleteFleetResponse] =
      service.deleteFleet(params).promise.toFuture
    def deleteRobotApplicationFuture(params: DeleteRobotApplicationRequest): Future[DeleteRobotApplicationResponse] =
      service.deleteRobotApplication(params).promise.toFuture
    def deleteRobotFuture(params: DeleteRobotRequest): Future[DeleteRobotResponse] =
      service.deleteRobot(params).promise.toFuture
    def deleteSimulationApplicationFuture(
        params: DeleteSimulationApplicationRequest
    ): Future[DeleteSimulationApplicationResponse] = service.deleteSimulationApplication(params).promise.toFuture
    def deregisterRobotFuture(params: DeregisterRobotRequest): Future[DeregisterRobotResponse] =
      service.deregisterRobot(params).promise.toFuture
    def describeDeploymentJobFuture(params: DescribeDeploymentJobRequest): Future[DescribeDeploymentJobResponse] =
      service.describeDeploymentJob(params).promise.toFuture
    def describeFleetFuture(params: DescribeFleetRequest): Future[DescribeFleetResponse] =
      service.describeFleet(params).promise.toFuture
    def describeRobotApplicationFuture(
        params: DescribeRobotApplicationRequest
    ): Future[DescribeRobotApplicationResponse] = service.describeRobotApplication(params).promise.toFuture
    def describeRobotFuture(params: DescribeRobotRequest): Future[DescribeRobotResponse] =
      service.describeRobot(params).promise.toFuture
    def describeSimulationApplicationFuture(
        params: DescribeSimulationApplicationRequest
    ): Future[DescribeSimulationApplicationResponse] = service.describeSimulationApplication(params).promise.toFuture
    def describeSimulationJobFuture(params: DescribeSimulationJobRequest): Future[DescribeSimulationJobResponse] =
      service.describeSimulationJob(params).promise.toFuture
    def listDeploymentJobsFuture(params: ListDeploymentJobsRequest): Future[ListDeploymentJobsResponse] =
      service.listDeploymentJobs(params).promise.toFuture
    def listFleetsFuture(params: ListFleetsRequest): Future[ListFleetsResponse] =
      service.listFleets(params).promise.toFuture
    def listRobotApplicationsFuture(params: ListRobotApplicationsRequest): Future[ListRobotApplicationsResponse] =
      service.listRobotApplications(params).promise.toFuture
    def listRobotsFuture(params: ListRobotsRequest): Future[ListRobotsResponse] =
      service.listRobots(params).promise.toFuture
    def listSimulationApplicationsFuture(
        params: ListSimulationApplicationsRequest
    ): Future[ListSimulationApplicationsResponse] = service.listSimulationApplications(params).promise.toFuture
    def listSimulationJobsFuture(params: ListSimulationJobsRequest): Future[ListSimulationJobsResponse] =
      service.listSimulationJobs(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def registerRobotFuture(params: RegisterRobotRequest): Future[RegisterRobotResponse] =
      service.registerRobot(params).promise.toFuture
    def restartSimulationJobFuture(params: RestartSimulationJobRequest): Future[RestartSimulationJobResponse] =
      service.restartSimulationJob(params).promise.toFuture
    def syncDeploymentJobFuture(params: SyncDeploymentJobRequest): Future[SyncDeploymentJobResponse] =
      service.syncDeploymentJob(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    def updateRobotApplicationFuture(params: UpdateRobotApplicationRequest): Future[UpdateRobotApplicationResponse] =
      service.updateRobotApplication(params).promise.toFuture
    def updateSimulationApplicationFuture(
        params: UpdateSimulationApplicationRequest
    ): Future[UpdateSimulationApplicationResponse] = service.updateSimulationApplication(params).promise.toFuture
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
    def listDeploymentJobs(params: ListDeploymentJobsRequest): Request[ListDeploymentJobsResponse]          = js.native
    def listFleets(params: ListFleetsRequest): Request[ListFleetsResponse]                                  = js.native
    def listRobotApplications(params: ListRobotApplicationsRequest): Request[ListRobotApplicationsResponse] = js.native
    def listRobots(params: ListRobotsRequest): Request[ListRobotsResponse]                                  = js.native
    def listSimulationApplications(
        params: ListSimulationApplicationsRequest
    ): Request[ListSimulationApplicationsResponse]                                                       = js.native
    def listSimulationJobs(params: ListSimulationJobsRequest): Request[ListSimulationJobsResponse]       = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]    = js.native
    def registerRobot(params: RegisterRobotRequest): Request[RegisterRobotResponse]                      = js.native
    def restartSimulationJob(params: RestartSimulationJobRequest): Request[RestartSimulationJobResponse] = js.native
    def syncDeploymentJob(params: SyncDeploymentJobRequest): Request[SyncDeploymentJobResponse]          = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                            = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                      = js.native
    def updateRobotApplication(params: UpdateRobotApplicationRequest): Request[UpdateRobotApplicationResponse] =
      js.native
    def updateSimulationApplication(
        params: UpdateSimulationApplicationRequest
    ): Request[UpdateSimulationApplicationResponse] = js.native
  }

  object ArchitectureEnum {
    val X86_64 = "X86_64"
    val ARM64  = "ARM64"
    val ARMHF  = "ARMHF"

    val values = js.Object.freeze(js.Array(X86_64, ARM64, ARMHF))
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
        "clientRequestToken"           -> clientRequestToken.asInstanceOf[js.Any],
        "deploymentApplicationConfigs" -> deploymentApplicationConfigs.asInstanceOf[js.Any],
        "fleet"                        -> fleet.asInstanceOf[js.Any]
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
      deploymentApplicationConfigs.foreach(
        __v => __obj.updateDynamic("deploymentApplicationConfigs")(__v.asInstanceOf[js.Any])
      )
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
        "name"               -> name.asInstanceOf[js.Any],
        "robotSoftwareSuite" -> robotSoftwareSuite.asInstanceOf[js.Any],
        "sources"            -> sources.asInstanceOf[js.Any]
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
        "architecture"      -> architecture.asInstanceOf[js.Any],
        "greengrassGroupId" -> greengrassGroupId.asInstanceOf[js.Any],
        "name"              -> name.asInstanceOf[js.Any]
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
        "name"                    -> name.asInstanceOf[js.Any],
        "robotSoftwareSuite"      -> robotSoftwareSuite.asInstanceOf[js.Any],
        "simulationSoftwareSuite" -> simulationSoftwareSuite.asInstanceOf[js.Any],
        "sources"                 -> sources.asInstanceOf[js.Any]
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
        "iamRole"                 -> iamRole.asInstanceOf[js.Any],
        "maxJobDurationInSeconds" -> maxJobDurationInSeconds.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
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
        "name"     -> name.asInstanceOf[js.Any],
        "s3Bucket" -> s3Bucket.asInstanceOf[js.Any],
        "s3Keys"   -> s3Keys.asInstanceOf[js.Any]
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
        "application"        -> application.asInstanceOf[js.Any],
        "applicationVersion" -> applicationVersion.asInstanceOf[js.Any],
        "launchConfig"       -> launchConfig.asInstanceOf[js.Any]
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
    var failureThresholdPercentage: js.UndefOr[Percentage]
    var robotDeploymentTimeoutInSeconds: js.UndefOr[DeploymentTimeout]
  }

  object DeploymentConfig {
    @inline
    def apply(
        concurrentDeploymentPercentage: js.UndefOr[Percentage] = js.undefined,
        failureThresholdPercentage: js.UndefOr[Percentage] = js.undefined,
        robotDeploymentTimeoutInSeconds: js.UndefOr[DeploymentTimeout] = js.undefined
    ): DeploymentConfig = {
      val __obj = js.Dynamic.literal()
      concurrentDeploymentPercentage.foreach(
        __v => __obj.updateDynamic("concurrentDeploymentPercentage")(__v.asInstanceOf[js.Any])
      )
      failureThresholdPercentage.foreach(
        __v => __obj.updateDynamic("failureThresholdPercentage")(__v.asInstanceOf[js.Any])
      )
      robotDeploymentTimeoutInSeconds.foreach(
        __v => __obj.updateDynamic("robotDeploymentTimeoutInSeconds")(__v.asInstanceOf[js.Any])
      )
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
      deploymentApplicationConfigs.foreach(
        __v => __obj.updateDynamic("deploymentApplicationConfigs")(__v.asInstanceOf[js.Any])
      )
      deploymentConfig.foreach(__v => __obj.updateDynamic("deploymentConfig")(__v.asInstanceOf[js.Any]))
      failureCode.foreach(__v => __obj.updateDynamic("failureCode")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      fleet.foreach(__v => __obj.updateDynamic("fleet")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentJob]
    }
  }

  object DeploymentJobErrorCodeEnum {
    val ResourceNotFound                    = "ResourceNotFound"
    val EnvironmentSetupError               = "EnvironmentSetupError"
    val EtagMismatch                        = "EtagMismatch"
    val FailureThresholdBreached            = "FailureThresholdBreached"
    val RobotDeploymentAborted              = "RobotDeploymentAborted"
    val RobotDeploymentNoResponse           = "RobotDeploymentNoResponse"
    val RobotAgentConnectionTimeout         = "RobotAgentConnectionTimeout"
    val GreengrassDeploymentFailed          = "GreengrassDeploymentFailed"
    val MissingRobotArchitecture            = "MissingRobotArchitecture"
    val MissingRobotApplicationArchitecture = "MissingRobotApplicationArchitecture"
    val MissingRobotDeploymentResource      = "MissingRobotDeploymentResource"
    val GreengrassGroupVersionDoesNotExist  = "GreengrassGroupVersionDoesNotExist"
    val ExtractingBundleFailure             = "ExtractingBundleFailure"
    val PreLaunchFileFailure                = "PreLaunchFileFailure"
    val PostLaunchFileFailure               = "PostLaunchFileFailure"
    val BadPermissionError                  = "BadPermissionError"
    val InternalServerError                 = "InternalServerError"

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
        InternalServerError
      )
    )
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
        "launchFile"  -> launchFile.asInstanceOf[js.Any],
        "packageName" -> packageName.asInstanceOf[js.Any]
      )

      environmentVariables.foreach(__v => __obj.updateDynamic("environmentVariables")(__v.asInstanceOf[js.Any]))
      postLaunchFile.foreach(__v => __obj.updateDynamic("postLaunchFile")(__v.asInstanceOf[js.Any]))
      preLaunchFile.foreach(__v => __obj.updateDynamic("preLaunchFile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentLaunchConfig]
    }
  }

  object DeploymentStatusEnum {
    val Pending    = "Pending"
    val Preparing  = "Preparing"
    val InProgress = "InProgress"
    val Failed     = "Failed"
    val Succeeded  = "Succeeded"
    val Canceled   = "Canceled"

    val values = js.Object.freeze(js.Array(Pending, Preparing, InProgress, Failed, Succeeded, Canceled))
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
      deploymentApplicationConfigs.foreach(
        __v => __obj.updateDynamic("deploymentApplicationConfigs")(__v.asInstanceOf[js.Any])
      )
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

  object FailureBehaviorEnum {
    val Fail     = "Fail"
    val Continue = "Continue"

    val values = js.Object.freeze(js.Array(Fail, Continue))
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
  }

  object LaunchConfig {
    @inline
    def apply(
        launchFile: Command,
        packageName: Command,
        environmentVariables: js.UndefOr[EnvironmentVariableMap] = js.undefined
    ): LaunchConfig = {
      val __obj = js.Dynamic.literal(
        "launchFile"  -> launchFile.asInstanceOf[js.Any],
        "packageName" -> packageName.asInstanceOf[js.Any]
      )

      environmentVariables.foreach(__v => __obj.updateDynamic("environmentVariables")(__v.asInstanceOf[js.Any]))
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
      robotApplicationSummaries.foreach(
        __v => __obj.updateDynamic("robotApplicationSummaries")(__v.asInstanceOf[js.Any])
      )
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
      simulationApplicationSummaries.foreach(
        __v => __obj.updateDynamic("simulationApplicationSummaries")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListSimulationApplicationsResponse]
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
      estimatedTimeRemainingSeconds.foreach(
        __v => __obj.updateDynamic("estimatedTimeRemainingSeconds")(__v.asInstanceOf[js.Any])
      )
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

  object RenderingEngineTypeEnum {
    val OGRE = "OGRE"

    val values = js.Object.freeze(js.Array(OGRE))
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
        "application"  -> application.asInstanceOf[js.Any],
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

  object RobotDeploymentStepEnum {
    val Validating            = "Validating"
    val DownloadingExtracting = "DownloadingExtracting"
    val ExecutingPreLaunch    = "ExecutingPreLaunch"
    val Launching             = "Launching"
    val ExecutingPostLaunch   = "ExecutingPostLaunch"
    val Finished              = "Finished"

    val values = js.Object.freeze(
      js.Array(Validating, DownloadingExtracting, ExecutingPreLaunch, Launching, ExecutingPostLaunch, Finished)
    )
  }

  /**
    * Information about a robot software suite.
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

  object RobotSoftwareSuiteTypeEnum {
    val ROS = "ROS"

    val values = js.Object.freeze(js.Array(ROS))
  }

  object RobotSoftwareSuiteVersionTypeEnum {
    val Kinetic = "Kinetic"
    val Melodic = "Melodic"

    val values = js.Object.freeze(js.Array(Kinetic, Melodic))
  }

  object RobotStatusEnum {
    val Available            = "Available"
    val Registered           = "Registered"
    val PendingNewDeployment = "PendingNewDeployment"
    val Deploying            = "Deploying"
    val Failed               = "Failed"
    val InSync               = "InSync"
    val NoResponse           = "NoResponse"

    val values =
      js.Object.freeze(js.Array(Available, Registered, PendingNewDeployment, Deploying, Failed, InSync, NoResponse))
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
        "application"  -> application.asInstanceOf[js.Any],
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

  object SimulationJobErrorCodeEnum {
    val InternalServiceError                       = "InternalServiceError"
    val RobotApplicationCrash                      = "RobotApplicationCrash"
    val SimulationApplicationCrash                 = "SimulationApplicationCrash"
    val BadPermissionsRobotApplication             = "BadPermissionsRobotApplication"
    val BadPermissionsSimulationApplication        = "BadPermissionsSimulationApplication"
    val BadPermissionsS3Object                     = "BadPermissionsS3Object"
    val BadPermissionsS3Output                     = "BadPermissionsS3Output"
    val BadPermissionsCloudwatchLogs               = "BadPermissionsCloudwatchLogs"
    val SubnetIpLimitExceeded                      = "SubnetIpLimitExceeded"
    val ENILimitExceeded                           = "ENILimitExceeded"
    val BadPermissionsUserCredentials              = "BadPermissionsUserCredentials"
    val InvalidBundleRobotApplication              = "InvalidBundleRobotApplication"
    val InvalidBundleSimulationApplication         = "InvalidBundleSimulationApplication"
    val InvalidS3Resource                          = "InvalidS3Resource"
    val MismatchedEtag                             = "MismatchedEtag"
    val RobotApplicationVersionMismatchedEtag      = "RobotApplicationVersionMismatchedEtag"
    val SimulationApplicationVersionMismatchedEtag = "SimulationApplicationVersionMismatchedEtag"
    val ResourceNotFound                           = "ResourceNotFound"
    val InvalidInput                               = "InvalidInput"
    val WrongRegionS3Bucket                        = "WrongRegionS3Bucket"
    val WrongRegionS3Output                        = "WrongRegionS3Output"
    val WrongRegionRobotApplication                = "WrongRegionRobotApplication"
    val WrongRegionSimulationApplication           = "WrongRegionSimulationApplication"

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
        MismatchedEtag,
        RobotApplicationVersionMismatchedEtag,
        SimulationApplicationVersionMismatchedEtag,
        ResourceNotFound,
        InvalidInput,
        WrongRegionS3Bucket,
        WrongRegionS3Output,
        WrongRegionRobotApplication,
        WrongRegionSimulationApplication
      )
    )
  }

  object SimulationJobStatusEnum {
    val Pending       = "Pending"
    val Preparing     = "Preparing"
    val Running       = "Running"
    val Restarting    = "Restarting"
    val Completed     = "Completed"
    val Failed        = "Failed"
    val RunningFailed = "RunningFailed"
    val Terminating   = "Terminating"
    val Terminated    = "Terminated"
    val Canceled      = "Canceled"

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
      simulationApplicationNames.foreach(
        __v => __obj.updateDynamic("simulationApplicationNames")(__v.asInstanceOf[js.Any])
      )
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

  object SimulationSoftwareSuiteTypeEnum {
    val Gazebo     = "Gazebo"
    val RosbagPlay = "RosbagPlay"

    val values = js.Object.freeze(js.Array(Gazebo, RosbagPlay))
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
        "fleet"              -> fleet.asInstanceOf[js.Any]
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
      deploymentApplicationConfigs.foreach(
        __v => __obj.updateDynamic("deploymentApplicationConfigs")(__v.asInstanceOf[js.Any])
      )
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
        "tags"        -> tags.asInstanceOf[js.Any]
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
        "tagKeys"     -> tagKeys.asInstanceOf[js.Any]
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
        "application"        -> application.asInstanceOf[js.Any],
        "robotSoftwareSuite" -> robotSoftwareSuite.asInstanceOf[js.Any],
        "sources"            -> sources.asInstanceOf[js.Any]
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
        "application"             -> application.asInstanceOf[js.Any],
        "robotSoftwareSuite"      -> robotSoftwareSuite.asInstanceOf[js.Any],
        "simulationSoftwareSuite" -> simulationSoftwareSuite.asInstanceOf[js.Any],
        "sources"                 -> sources.asInstanceOf[js.Any]
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
