package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object robomaker {
  type Architecture = String
  type Arn = String
  type Arns = js.Array[Arn]
  type ClientRequestToken = String
  type CreatedAt = js.Date
  type DeploymentApplicationConfigs = js.Array[DeploymentApplicationConfig]
  type DeploymentJobErrorCode = String
  type DeploymentJobs = js.Array[DeploymentJob]
  type DeploymentStatus = String
  type EnvironmentVariableKey = String
  type EnvironmentVariableMap = js.Dictionary[EnvironmentVariableValue]
  type EnvironmentVariableValue = String
  type FailureBehavior = String
  type FilterValues = js.Array[Name]
  type Filters = js.Array[Filter]
  type Fleets = js.Array[Fleet]
  type GenericString = String
  type IamRole = String
  type Id = String
  type JobDuration = Double
  type LastUpdatedAt = js.Date
  type MaxResults = Int
  type Name = String
  type PaginationToken = String
  type Percentage = Int
  type RenderingEngineType = String
  type RenderingEngineVersionType = String
  type RevisionId = String
  type RobotApplicationConfigs = js.Array[RobotApplicationConfig]
  type RobotApplicationNames = js.Array[Name]
  type RobotApplicationSummaries = js.Array[RobotApplicationSummary]
  type RobotDeploymentSummary = js.Array[RobotDeployment]
  type RobotSoftwareSuiteType = String
  type RobotSoftwareSuiteVersionType = String
  type RobotStatus = String
  type Robots = js.Array[Robot]
  type S3Bucket = String
  type S3Etag = String
  type S3Key = String
  type SecurityGroups = js.Array[GenericString]
  type SimulationApplicationConfigs = js.Array[SimulationApplicationConfig]
  type SimulationApplicationNames = js.Array[Name]
  type SimulationApplicationSummaries = js.Array[SimulationApplicationSummary]
  type SimulationJobErrorCode = String
  type SimulationJobStatus = String
  type SimulationJobSummaries = js.Array[SimulationJobSummary]
  type SimulationJobs = js.Array[SimulationJob]
  type SimulationSoftwareSuiteType = String
  type SimulationSoftwareSuiteVersionType = String
  type SimulationTimeMillis = Double
  type SourceConfigs = js.Array[SourceConfig]
  type Sources = js.Array[Source]
  type Subnets = js.Array[GenericString]
  type Version = String
  type VersionQualifier = String
}

package robomaker {
  @js.native
  @JSImport("aws-sdk", "RoboMaker")
  class RoboMaker(config: AWSConfig) extends js.Object {
    def batchDescribeSimulationJob(params: BatchDescribeSimulationJobRequest): Request[BatchDescribeSimulationJobResponse] = js.native
    def cancelSimulationJob(params: CancelSimulationJobRequest): Request[CancelSimulationJobResponse] = js.native
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
    def listDeploymentJobs(params: ListDeploymentJobsRequest): Request[ListDeploymentJobsResponse] = js.native
    def listFleets(params: ListFleetsRequest): Request[ListFleetsResponse] = js.native
    def listRobotApplications(params: ListRobotApplicationsRequest): Request[ListRobotApplicationsResponse] = js.native
    def listRobots(params: ListRobotsRequest): Request[ListRobotsResponse] = js.native
    def listSimulationApplications(params: ListSimulationApplicationsRequest): Request[ListSimulationApplicationsResponse] = js.native
    def listSimulationJobs(params: ListSimulationJobsRequest): Request[ListSimulationJobsResponse] = js.native
    def registerRobot(params: RegisterRobotRequest): Request[RegisterRobotResponse] = js.native
    def restartSimulationJob(params: RestartSimulationJobRequest): Request[RestartSimulationJobResponse] = js.native
    def syncDeploymentJob(params: SyncDeploymentJobRequest): Request[SyncDeploymentJobResponse] = js.native
    def updateRobotApplication(params: UpdateRobotApplicationRequest): Request[UpdateRobotApplicationResponse] = js.native
    def updateSimulationApplication(params: UpdateSimulationApplicationRequest): Request[UpdateSimulationApplicationResponse] = js.native
  }

  object ArchitectureEnum {
    val X86_64 = "X86_64"
    val ARM64 = "ARM64"
    val ARMHF = "ARMHF"

    val values = IndexedSeq(X86_64, ARM64, ARMHF)
  }

  @js.native
  trait BatchDescribeSimulationJobRequest extends js.Object {
    var jobs: Arns
  }

  object BatchDescribeSimulationJobRequest {
    def apply(
      jobs: Arns): BatchDescribeSimulationJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobs" -> jobs.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDescribeSimulationJobRequest]
    }
  }

  @js.native
  trait BatchDescribeSimulationJobResponse extends js.Object {
    var jobs: js.UndefOr[SimulationJobs]
    var unprocessedJobs: js.UndefOr[Arns]
  }

  object BatchDescribeSimulationJobResponse {
    def apply(
      jobs: js.UndefOr[SimulationJobs] = js.undefined,
      unprocessedJobs: js.UndefOr[Arns] = js.undefined): BatchDescribeSimulationJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobs" -> jobs.map { x => x.asInstanceOf[js.Any] },
        "unprocessedJobs" -> unprocessedJobs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDescribeSimulationJobResponse]
    }
  }

  @js.native
  trait CancelSimulationJobRequest extends js.Object {
    var job: Arn
  }

  object CancelSimulationJobRequest {
    def apply(
      job: Arn): CancelSimulationJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "job" -> job.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelSimulationJobRequest]
    }
  }

  @js.native
  trait CancelSimulationJobResponse extends js.Object {

  }

  object CancelSimulationJobResponse {
    def apply(): CancelSimulationJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelSimulationJobResponse]
    }
  }

  @js.native
  trait CreateDeploymentJobRequest extends js.Object {
    var clientRequestToken: ClientRequestToken
    var deploymentApplicationConfigs: DeploymentApplicationConfigs
    var fleet: Arn
    var deploymentConfig: js.UndefOr[DeploymentConfig]
  }

  object CreateDeploymentJobRequest {
    def apply(
      clientRequestToken: ClientRequestToken,
      deploymentApplicationConfigs: DeploymentApplicationConfigs,
      fleet: Arn,
      deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined): CreateDeploymentJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientRequestToken" -> clientRequestToken.asInstanceOf[js.Any],
        "deploymentApplicationConfigs" -> deploymentApplicationConfigs.asInstanceOf[js.Any],
        "fleet" -> fleet.asInstanceOf[js.Any],
        "deploymentConfig" -> deploymentConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentJobRequest]
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
  }

  object CreateDeploymentJobResponse {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      createdAt: js.UndefOr[CreatedAt] = js.undefined,
      deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs] = js.undefined,
      deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined,
      failureCode: js.UndefOr[DeploymentJobErrorCode] = js.undefined,
      failureReason: js.UndefOr[GenericString] = js.undefined,
      fleet: js.UndefOr[Arn] = js.undefined,
      status: js.UndefOr[DeploymentStatus] = js.undefined): CreateDeploymentJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "deploymentApplicationConfigs" -> deploymentApplicationConfigs.map { x => x.asInstanceOf[js.Any] },
        "deploymentConfig" -> deploymentConfig.map { x => x.asInstanceOf[js.Any] },
        "failureCode" -> failureCode.map { x => x.asInstanceOf[js.Any] },
        "failureReason" -> failureReason.map { x => x.asInstanceOf[js.Any] },
        "fleet" -> fleet.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentJobResponse]
    }
  }

  @js.native
  trait CreateFleetRequest extends js.Object {
    var name: Name
  }

  object CreateFleetRequest {
    def apply(
      name: Name): CreateFleetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFleetRequest]
    }
  }

  @js.native
  trait CreateFleetResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[CreatedAt]
    var name: js.UndefOr[Name]
  }

  object CreateFleetResponse {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      createdAt: js.UndefOr[CreatedAt] = js.undefined,
      name: js.UndefOr[Name] = js.undefined): CreateFleetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFleetResponse]
    }
  }

  @js.native
  trait CreateRobotApplicationRequest extends js.Object {
    var name: Name
    var robotSoftwareSuite: RobotSoftwareSuite
    var sources: SourceConfigs
  }

  object CreateRobotApplicationRequest {
    def apply(
      name: Name,
      robotSoftwareSuite: RobotSoftwareSuite,
      sources: SourceConfigs): CreateRobotApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.asInstanceOf[js.Any],
        "robotSoftwareSuite" -> robotSoftwareSuite.asInstanceOf[js.Any],
        "sources" -> sources.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRobotApplicationRequest]
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
    var version: js.UndefOr[Version]
  }

  object CreateRobotApplicationResponse {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      revisionId: js.UndefOr[RevisionId] = js.undefined,
      robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined,
      sources: js.UndefOr[Sources] = js.undefined,
      version: js.UndefOr[Version] = js.undefined): CreateRobotApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedAt" -> lastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "revisionId" -> revisionId.map { x => x.asInstanceOf[js.Any] },
        "robotSoftwareSuite" -> robotSoftwareSuite.map { x => x.asInstanceOf[js.Any] },
        "sources" -> sources.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRobotApplicationResponse]
    }
  }

  @js.native
  trait CreateRobotApplicationVersionRequest extends js.Object {
    var application: Arn
    var currentRevisionId: js.UndefOr[RevisionId]
  }

  object CreateRobotApplicationVersionRequest {
    def apply(
      application: Arn,
      currentRevisionId: js.UndefOr[RevisionId] = js.undefined): CreateRobotApplicationVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "application" -> application.asInstanceOf[js.Any],
        "currentRevisionId" -> currentRevisionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRobotApplicationVersionRequest]
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
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      revisionId: js.UndefOr[RevisionId] = js.undefined,
      robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined,
      sources: js.UndefOr[Sources] = js.undefined,
      version: js.UndefOr[Version] = js.undefined): CreateRobotApplicationVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedAt" -> lastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "revisionId" -> revisionId.map { x => x.asInstanceOf[js.Any] },
        "robotSoftwareSuite" -> robotSoftwareSuite.map { x => x.asInstanceOf[js.Any] },
        "sources" -> sources.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRobotApplicationVersionResponse]
    }
  }

  @js.native
  trait CreateRobotRequest extends js.Object {
    var architecture: Architecture
    var greengrassGroupId: Id
    var name: Name
  }

  object CreateRobotRequest {
    def apply(
      architecture: Architecture,
      greengrassGroupId: Id,
      name: Name): CreateRobotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "architecture" -> architecture.asInstanceOf[js.Any],
        "greengrassGroupId" -> greengrassGroupId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRobotRequest]
    }
  }

  @js.native
  trait CreateRobotResponse extends js.Object {
    var architecture: js.UndefOr[Architecture]
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[CreatedAt]
    var greengrassGroupId: js.UndefOr[Id]
    var name: js.UndefOr[Name]
  }

  object CreateRobotResponse {
    def apply(
      architecture: js.UndefOr[Architecture] = js.undefined,
      arn: js.UndefOr[Arn] = js.undefined,
      createdAt: js.UndefOr[CreatedAt] = js.undefined,
      greengrassGroupId: js.UndefOr[Id] = js.undefined,
      name: js.UndefOr[Name] = js.undefined): CreateRobotResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "architecture" -> architecture.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "greengrassGroupId" -> greengrassGroupId.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRobotResponse]
    }
  }

  @js.native
  trait CreateSimulationApplicationRequest extends js.Object {
    var name: Name
    var renderingEngine: RenderingEngine
    var robotSoftwareSuite: RobotSoftwareSuite
    var simulationSoftwareSuite: SimulationSoftwareSuite
    var sources: SourceConfigs
  }

  object CreateSimulationApplicationRequest {
    def apply(
      name: Name,
      renderingEngine: RenderingEngine,
      robotSoftwareSuite: RobotSoftwareSuite,
      simulationSoftwareSuite: SimulationSoftwareSuite,
      sources: SourceConfigs): CreateSimulationApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.asInstanceOf[js.Any],
        "renderingEngine" -> renderingEngine.asInstanceOf[js.Any],
        "robotSoftwareSuite" -> robotSoftwareSuite.asInstanceOf[js.Any],
        "simulationSoftwareSuite" -> simulationSoftwareSuite.asInstanceOf[js.Any],
        "sources" -> sources.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSimulationApplicationRequest]
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
    var version: js.UndefOr[Version]
  }

  object CreateSimulationApplicationResponse {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      renderingEngine: js.UndefOr[RenderingEngine] = js.undefined,
      revisionId: js.UndefOr[RevisionId] = js.undefined,
      robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined,
      simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite] = js.undefined,
      sources: js.UndefOr[Sources] = js.undefined,
      version: js.UndefOr[Version] = js.undefined): CreateSimulationApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedAt" -> lastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "renderingEngine" -> renderingEngine.map { x => x.asInstanceOf[js.Any] },
        "revisionId" -> revisionId.map { x => x.asInstanceOf[js.Any] },
        "robotSoftwareSuite" -> robotSoftwareSuite.map { x => x.asInstanceOf[js.Any] },
        "simulationSoftwareSuite" -> simulationSoftwareSuite.map { x => x.asInstanceOf[js.Any] },
        "sources" -> sources.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSimulationApplicationResponse]
    }
  }

  @js.native
  trait CreateSimulationApplicationVersionRequest extends js.Object {
    var application: Arn
    var currentRevisionId: js.UndefOr[RevisionId]
  }

  object CreateSimulationApplicationVersionRequest {
    def apply(
      application: Arn,
      currentRevisionId: js.UndefOr[RevisionId] = js.undefined): CreateSimulationApplicationVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "application" -> application.asInstanceOf[js.Any],
        "currentRevisionId" -> currentRevisionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSimulationApplicationVersionRequest]
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
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      renderingEngine: js.UndefOr[RenderingEngine] = js.undefined,
      revisionId: js.UndefOr[RevisionId] = js.undefined,
      robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined,
      simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite] = js.undefined,
      sources: js.UndefOr[Sources] = js.undefined,
      version: js.UndefOr[Version] = js.undefined): CreateSimulationApplicationVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedAt" -> lastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "renderingEngine" -> renderingEngine.map { x => x.asInstanceOf[js.Any] },
        "revisionId" -> revisionId.map { x => x.asInstanceOf[js.Any] },
        "robotSoftwareSuite" -> robotSoftwareSuite.map { x => x.asInstanceOf[js.Any] },
        "simulationSoftwareSuite" -> simulationSoftwareSuite.map { x => x.asInstanceOf[js.Any] },
        "sources" -> sources.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSimulationApplicationVersionResponse]
    }
  }

  @js.native
  trait CreateSimulationJobRequest extends js.Object {
    var iamRole: IamRole
    var maxJobDurationInSeconds: JobDuration
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var failureBehavior: js.UndefOr[FailureBehavior]
    var outputLocation: js.UndefOr[OutputLocation]
    var robotApplications: js.UndefOr[RobotApplicationConfigs]
    var simulationApplications: js.UndefOr[SimulationApplicationConfigs]
    var vpcConfig: js.UndefOr[VPCConfig]
  }

  object CreateSimulationJobRequest {
    def apply(
      iamRole: IamRole,
      maxJobDurationInSeconds: JobDuration,
      clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      failureBehavior: js.UndefOr[FailureBehavior] = js.undefined,
      outputLocation: js.UndefOr[OutputLocation] = js.undefined,
      robotApplications: js.UndefOr[RobotApplicationConfigs] = js.undefined,
      simulationApplications: js.UndefOr[SimulationApplicationConfigs] = js.undefined,
      vpcConfig: js.UndefOr[VPCConfig] = js.undefined): CreateSimulationJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "iamRole" -> iamRole.asInstanceOf[js.Any],
        "maxJobDurationInSeconds" -> maxJobDurationInSeconds.asInstanceOf[js.Any],
        "clientRequestToken" -> clientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "failureBehavior" -> failureBehavior.map { x => x.asInstanceOf[js.Any] },
        "outputLocation" -> outputLocation.map { x => x.asInstanceOf[js.Any] },
        "robotApplications" -> robotApplications.map { x => x.asInstanceOf[js.Any] },
        "simulationApplications" -> simulationApplications.map { x => x.asInstanceOf[js.Any] },
        "vpcConfig" -> vpcConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSimulationJobRequest]
    }
  }

  @js.native
  trait CreateSimulationJobResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var failureBehavior: js.UndefOr[FailureBehavior]
    var failureCode: js.UndefOr[SimulationJobErrorCode]
    var iamRole: js.UndefOr[IamRole]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var maxJobDurationInSeconds: js.UndefOr[JobDuration]
    var outputLocation: js.UndefOr[OutputLocation]
    var robotApplications: js.UndefOr[RobotApplicationConfigs]
    var simulationApplications: js.UndefOr[SimulationApplicationConfigs]
    var simulationTimeMillis: js.UndefOr[SimulationTimeMillis]
    var status: js.UndefOr[SimulationJobStatus]
    var vpcConfig: js.UndefOr[VPCConfigResponse]
  }

  object CreateSimulationJobResponse {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      failureBehavior: js.UndefOr[FailureBehavior] = js.undefined,
      failureCode: js.UndefOr[SimulationJobErrorCode] = js.undefined,
      iamRole: js.UndefOr[IamRole] = js.undefined,
      lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
      maxJobDurationInSeconds: js.UndefOr[JobDuration] = js.undefined,
      outputLocation: js.UndefOr[OutputLocation] = js.undefined,
      robotApplications: js.UndefOr[RobotApplicationConfigs] = js.undefined,
      simulationApplications: js.UndefOr[SimulationApplicationConfigs] = js.undefined,
      simulationTimeMillis: js.UndefOr[SimulationTimeMillis] = js.undefined,
      status: js.UndefOr[SimulationJobStatus] = js.undefined,
      vpcConfig: js.UndefOr[VPCConfigResponse] = js.undefined): CreateSimulationJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "clientRequestToken" -> clientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "failureBehavior" -> failureBehavior.map { x => x.asInstanceOf[js.Any] },
        "failureCode" -> failureCode.map { x => x.asInstanceOf[js.Any] },
        "iamRole" -> iamRole.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedAt" -> lastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "maxJobDurationInSeconds" -> maxJobDurationInSeconds.map { x => x.asInstanceOf[js.Any] },
        "outputLocation" -> outputLocation.map { x => x.asInstanceOf[js.Any] },
        "robotApplications" -> robotApplications.map { x => x.asInstanceOf[js.Any] },
        "simulationApplications" -> simulationApplications.map { x => x.asInstanceOf[js.Any] },
        "simulationTimeMillis" -> simulationTimeMillis.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "vpcConfig" -> vpcConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSimulationJobResponse]
    }
  }

  @js.native
  trait DeleteFleetRequest extends js.Object {
    var fleet: Arn
  }

  object DeleteFleetRequest {
    def apply(
      fleet: Arn): DeleteFleetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "fleet" -> fleet.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFleetRequest]
    }
  }

  @js.native
  trait DeleteFleetResponse extends js.Object {

  }

  object DeleteFleetResponse {
    def apply(): DeleteFleetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFleetResponse]
    }
  }

  @js.native
  trait DeleteRobotApplicationRequest extends js.Object {
    var application: Arn
    var applicationVersion: js.UndefOr[Version]
  }

  object DeleteRobotApplicationRequest {
    def apply(
      application: Arn,
      applicationVersion: js.UndefOr[Version] = js.undefined): DeleteRobotApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "application" -> application.asInstanceOf[js.Any],
        "applicationVersion" -> applicationVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRobotApplicationRequest]
    }
  }

  @js.native
  trait DeleteRobotApplicationResponse extends js.Object {

  }

  object DeleteRobotApplicationResponse {
    def apply(): DeleteRobotApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRobotApplicationResponse]
    }
  }

  @js.native
  trait DeleteRobotRequest extends js.Object {
    var robot: Arn
  }

  object DeleteRobotRequest {
    def apply(
      robot: Arn): DeleteRobotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "robot" -> robot.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRobotRequest]
    }
  }

  @js.native
  trait DeleteRobotResponse extends js.Object {

  }

  object DeleteRobotResponse {
    def apply(): DeleteRobotResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRobotResponse]
    }
  }

  @js.native
  trait DeleteSimulationApplicationRequest extends js.Object {
    var application: Arn
    var applicationVersion: js.UndefOr[Version]
  }

  object DeleteSimulationApplicationRequest {
    def apply(
      application: Arn,
      applicationVersion: js.UndefOr[Version] = js.undefined): DeleteSimulationApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "application" -> application.asInstanceOf[js.Any],
        "applicationVersion" -> applicationVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSimulationApplicationRequest]
    }
  }

  @js.native
  trait DeleteSimulationApplicationResponse extends js.Object {

  }

  object DeleteSimulationApplicationResponse {
    def apply(): DeleteSimulationApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSimulationApplicationResponse]
    }
  }

  /**
   * Information about a deployment application configuration.
   */
  @js.native
  trait DeploymentApplicationConfig extends js.Object {
    var application: Arn
    var applicationVersion: Version
    var launchConfig: DeploymentLaunchConfig
  }

  object DeploymentApplicationConfig {
    def apply(
      application: Arn,
      applicationVersion: Version,
      launchConfig: DeploymentLaunchConfig): DeploymentApplicationConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "application" -> application.asInstanceOf[js.Any],
        "applicationVersion" -> applicationVersion.asInstanceOf[js.Any],
        "launchConfig" -> launchConfig.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentApplicationConfig]
    }
  }

  /**
   * Information about a deployment configuration.
   */
  @js.native
  trait DeploymentConfig extends js.Object {
    var concurrentDeploymentPercentage: js.UndefOr[Percentage]
    var failureThresholdPercentage: js.UndefOr[Percentage]
  }

  object DeploymentConfig {
    def apply(
      concurrentDeploymentPercentage: js.UndefOr[Percentage] = js.undefined,
      failureThresholdPercentage: js.UndefOr[Percentage] = js.undefined): DeploymentConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "concurrentDeploymentPercentage" -> concurrentDeploymentPercentage.map { x => x.asInstanceOf[js.Any] },
        "failureThresholdPercentage" -> failureThresholdPercentage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentConfig]
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
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      createdAt: js.UndefOr[CreatedAt] = js.undefined,
      deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs] = js.undefined,
      deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined,
      failureCode: js.UndefOr[DeploymentJobErrorCode] = js.undefined,
      failureReason: js.UndefOr[GenericString] = js.undefined,
      fleet: js.UndefOr[Arn] = js.undefined,
      status: js.UndefOr[DeploymentStatus] = js.undefined): DeploymentJob = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "deploymentApplicationConfigs" -> deploymentApplicationConfigs.map { x => x.asInstanceOf[js.Any] },
        "deploymentConfig" -> deploymentConfig.map { x => x.asInstanceOf[js.Any] },
        "failureCode" -> failureCode.map { x => x.asInstanceOf[js.Any] },
        "failureReason" -> failureReason.map { x => x.asInstanceOf[js.Any] },
        "fleet" -> fleet.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentJob]
    }
  }

  object DeploymentJobErrorCodeEnum {
    val ResourceNotFound = "ResourceNotFound"
    val FailureThresholdBreached = "FailureThresholdBreached"
    val RobotDeploymentNoResponse = "RobotDeploymentNoResponse"
    val GreengrassDeploymentFailed = "GreengrassDeploymentFailed"
    val MissingRobotArchitecture = "MissingRobotArchitecture"
    val MissingRobotApplicationArchitecture = "MissingRobotApplicationArchitecture"
    val MissingRobotDeploymentResource = "MissingRobotDeploymentResource"
    val GreengrassGroupVersionDoesNotExist = "GreengrassGroupVersionDoesNotExist"
    val ExtractingBundleFailure = "ExtractingBundleFailure"
    val PreLaunchFileFailure = "PreLaunchFileFailure"
    val PostLaunchFileFailure = "PostLaunchFileFailure"
    val BadPermissionError = "BadPermissionError"
    val InternalServerError = "InternalServerError"

    val values = IndexedSeq(ResourceNotFound, FailureThresholdBreached, RobotDeploymentNoResponse, GreengrassDeploymentFailed, MissingRobotArchitecture, MissingRobotApplicationArchitecture, MissingRobotDeploymentResource, GreengrassGroupVersionDoesNotExist, ExtractingBundleFailure, PreLaunchFileFailure, PostLaunchFileFailure, BadPermissionError, InternalServerError)
  }

  /**
   * Configuration information for a deployment launch.
   */
  @js.native
  trait DeploymentLaunchConfig extends js.Object {
    var launchFile: GenericString
    var packageName: GenericString
    var environmentVariables: js.UndefOr[EnvironmentVariableMap]
    var postLaunchFile: js.UndefOr[GenericString]
    var preLaunchFile: js.UndefOr[GenericString]
  }

  object DeploymentLaunchConfig {
    def apply(
      launchFile: GenericString,
      packageName: GenericString,
      environmentVariables: js.UndefOr[EnvironmentVariableMap] = js.undefined,
      postLaunchFile: js.UndefOr[GenericString] = js.undefined,
      preLaunchFile: js.UndefOr[GenericString] = js.undefined): DeploymentLaunchConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "launchFile" -> launchFile.asInstanceOf[js.Any],
        "packageName" -> packageName.asInstanceOf[js.Any],
        "environmentVariables" -> environmentVariables.map { x => x.asInstanceOf[js.Any] },
        "postLaunchFile" -> postLaunchFile.map { x => x.asInstanceOf[js.Any] },
        "preLaunchFile" -> preLaunchFile.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentLaunchConfig]
    }
  }

  object DeploymentStatusEnum {
    val Pending = "Pending"
    val Preparing = "Preparing"
    val InProgress = "InProgress"
    val Failed = "Failed"
    val Succeeded = "Succeeded"

    val values = IndexedSeq(Pending, Preparing, InProgress, Failed, Succeeded)
  }

  @js.native
  trait DeregisterRobotRequest extends js.Object {
    var fleet: Arn
    var robot: Arn
  }

  object DeregisterRobotRequest {
    def apply(
      fleet: Arn,
      robot: Arn): DeregisterRobotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "fleet" -> fleet.asInstanceOf[js.Any],
        "robot" -> robot.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterRobotRequest]
    }
  }

  @js.native
  trait DeregisterRobotResponse extends js.Object {
    var fleet: js.UndefOr[Arn]
    var robot: js.UndefOr[Arn]
  }

  object DeregisterRobotResponse {
    def apply(
      fleet: js.UndefOr[Arn] = js.undefined,
      robot: js.UndefOr[Arn] = js.undefined): DeregisterRobotResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "fleet" -> fleet.map { x => x.asInstanceOf[js.Any] },
        "robot" -> robot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterRobotResponse]
    }
  }

  @js.native
  trait DescribeDeploymentJobRequest extends js.Object {
    var job: Arn
  }

  object DescribeDeploymentJobRequest {
    def apply(
      job: Arn): DescribeDeploymentJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "job" -> job.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeploymentJobRequest]
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
  }

  object DescribeDeploymentJobResponse {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      createdAt: js.UndefOr[CreatedAt] = js.undefined,
      deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs] = js.undefined,
      deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined,
      failureCode: js.UndefOr[DeploymentJobErrorCode] = js.undefined,
      failureReason: js.UndefOr[GenericString] = js.undefined,
      fleet: js.UndefOr[Arn] = js.undefined,
      robotDeploymentSummary: js.UndefOr[RobotDeploymentSummary] = js.undefined,
      status: js.UndefOr[DeploymentStatus] = js.undefined): DescribeDeploymentJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "deploymentApplicationConfigs" -> deploymentApplicationConfigs.map { x => x.asInstanceOf[js.Any] },
        "deploymentConfig" -> deploymentConfig.map { x => x.asInstanceOf[js.Any] },
        "failureCode" -> failureCode.map { x => x.asInstanceOf[js.Any] },
        "failureReason" -> failureReason.map { x => x.asInstanceOf[js.Any] },
        "fleet" -> fleet.map { x => x.asInstanceOf[js.Any] },
        "robotDeploymentSummary" -> robotDeploymentSummary.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeploymentJobResponse]
    }
  }

  @js.native
  trait DescribeFleetRequest extends js.Object {
    var fleet: Arn
  }

  object DescribeFleetRequest {
    def apply(
      fleet: Arn): DescribeFleetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "fleet" -> fleet.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetRequest]
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
  }

  object DescribeFleetResponse {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      createdAt: js.UndefOr[CreatedAt] = js.undefined,
      lastDeploymentJob: js.UndefOr[Arn] = js.undefined,
      lastDeploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined,
      lastDeploymentTime: js.UndefOr[CreatedAt] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      robots: js.UndefOr[Robots] = js.undefined): DescribeFleetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "lastDeploymentJob" -> lastDeploymentJob.map { x => x.asInstanceOf[js.Any] },
        "lastDeploymentStatus" -> lastDeploymentStatus.map { x => x.asInstanceOf[js.Any] },
        "lastDeploymentTime" -> lastDeploymentTime.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "robots" -> robots.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetResponse]
    }
  }

  @js.native
  trait DescribeRobotApplicationRequest extends js.Object {
    var application: Arn
    var applicationVersion: js.UndefOr[Version]
  }

  object DescribeRobotApplicationRequest {
    def apply(
      application: Arn,
      applicationVersion: js.UndefOr[Version] = js.undefined): DescribeRobotApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "application" -> application.asInstanceOf[js.Any],
        "applicationVersion" -> applicationVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRobotApplicationRequest]
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
    var version: js.UndefOr[Version]
  }

  object DescribeRobotApplicationResponse {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      revisionId: js.UndefOr[RevisionId] = js.undefined,
      robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined,
      sources: js.UndefOr[Sources] = js.undefined,
      version: js.UndefOr[Version] = js.undefined): DescribeRobotApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedAt" -> lastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "revisionId" -> revisionId.map { x => x.asInstanceOf[js.Any] },
        "robotSoftwareSuite" -> robotSoftwareSuite.map { x => x.asInstanceOf[js.Any] },
        "sources" -> sources.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRobotApplicationResponse]
    }
  }

  @js.native
  trait DescribeRobotRequest extends js.Object {
    var robot: Arn
  }

  object DescribeRobotRequest {
    def apply(
      robot: Arn): DescribeRobotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "robot" -> robot.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRobotRequest]
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
  }

  object DescribeRobotResponse {
    def apply(
      architecture: js.UndefOr[Architecture] = js.undefined,
      arn: js.UndefOr[Arn] = js.undefined,
      createdAt: js.UndefOr[CreatedAt] = js.undefined,
      fleetArn: js.UndefOr[Arn] = js.undefined,
      greengrassGroupId: js.UndefOr[Id] = js.undefined,
      lastDeploymentJob: js.UndefOr[Arn] = js.undefined,
      lastDeploymentTime: js.UndefOr[CreatedAt] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      status: js.UndefOr[RobotStatus] = js.undefined): DescribeRobotResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "architecture" -> architecture.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "fleetArn" -> fleetArn.map { x => x.asInstanceOf[js.Any] },
        "greengrassGroupId" -> greengrassGroupId.map { x => x.asInstanceOf[js.Any] },
        "lastDeploymentJob" -> lastDeploymentJob.map { x => x.asInstanceOf[js.Any] },
        "lastDeploymentTime" -> lastDeploymentTime.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRobotResponse]
    }
  }

  @js.native
  trait DescribeSimulationApplicationRequest extends js.Object {
    var application: Arn
    var applicationVersion: js.UndefOr[Version]
  }

  object DescribeSimulationApplicationRequest {
    def apply(
      application: Arn,
      applicationVersion: js.UndefOr[Version] = js.undefined): DescribeSimulationApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "application" -> application.asInstanceOf[js.Any],
        "applicationVersion" -> applicationVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSimulationApplicationRequest]
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
    var version: js.UndefOr[Version]
  }

  object DescribeSimulationApplicationResponse {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      renderingEngine: js.UndefOr[RenderingEngine] = js.undefined,
      revisionId: js.UndefOr[RevisionId] = js.undefined,
      robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined,
      simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite] = js.undefined,
      sources: js.UndefOr[Sources] = js.undefined,
      version: js.UndefOr[Version] = js.undefined): DescribeSimulationApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedAt" -> lastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "renderingEngine" -> renderingEngine.map { x => x.asInstanceOf[js.Any] },
        "revisionId" -> revisionId.map { x => x.asInstanceOf[js.Any] },
        "robotSoftwareSuite" -> robotSoftwareSuite.map { x => x.asInstanceOf[js.Any] },
        "simulationSoftwareSuite" -> simulationSoftwareSuite.map { x => x.asInstanceOf[js.Any] },
        "sources" -> sources.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSimulationApplicationResponse]
    }
  }

  @js.native
  trait DescribeSimulationJobRequest extends js.Object {
    var job: Arn
  }

  object DescribeSimulationJobRequest {
    def apply(
      job: Arn): DescribeSimulationJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "job" -> job.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSimulationJobRequest]
    }
  }

  @js.native
  trait DescribeSimulationJobResponse extends js.Object {
    var arn: js.UndefOr[Arn]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var failureBehavior: js.UndefOr[FailureBehavior]
    var failureCode: js.UndefOr[SimulationJobErrorCode]
    var iamRole: js.UndefOr[IamRole]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var maxJobDurationInSeconds: js.UndefOr[JobDuration]
    var name: js.UndefOr[Name]
    var outputLocation: js.UndefOr[OutputLocation]
    var robotApplications: js.UndefOr[RobotApplicationConfigs]
    var simulationApplications: js.UndefOr[SimulationApplicationConfigs]
    var simulationTimeMillis: js.UndefOr[SimulationTimeMillis]
    var status: js.UndefOr[SimulationJobStatus]
    var vpcConfig: js.UndefOr[VPCConfigResponse]
  }

  object DescribeSimulationJobResponse {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      failureBehavior: js.UndefOr[FailureBehavior] = js.undefined,
      failureCode: js.UndefOr[SimulationJobErrorCode] = js.undefined,
      iamRole: js.UndefOr[IamRole] = js.undefined,
      lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
      maxJobDurationInSeconds: js.UndefOr[JobDuration] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      outputLocation: js.UndefOr[OutputLocation] = js.undefined,
      robotApplications: js.UndefOr[RobotApplicationConfigs] = js.undefined,
      simulationApplications: js.UndefOr[SimulationApplicationConfigs] = js.undefined,
      simulationTimeMillis: js.UndefOr[SimulationTimeMillis] = js.undefined,
      status: js.UndefOr[SimulationJobStatus] = js.undefined,
      vpcConfig: js.UndefOr[VPCConfigResponse] = js.undefined): DescribeSimulationJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "clientRequestToken" -> clientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "failureBehavior" -> failureBehavior.map { x => x.asInstanceOf[js.Any] },
        "failureCode" -> failureCode.map { x => x.asInstanceOf[js.Any] },
        "iamRole" -> iamRole.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedAt" -> lastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "maxJobDurationInSeconds" -> maxJobDurationInSeconds.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "outputLocation" -> outputLocation.map { x => x.asInstanceOf[js.Any] },
        "robotApplications" -> robotApplications.map { x => x.asInstanceOf[js.Any] },
        "simulationApplications" -> simulationApplications.map { x => x.asInstanceOf[js.Any] },
        "simulationTimeMillis" -> simulationTimeMillis.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "vpcConfig" -> vpcConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSimulationJobResponse]
    }
  }

  object FailureBehaviorEnum {
    val Fail = "Fail"
    val Continue = "Continue"

    val values = IndexedSeq(Fail, Continue)
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
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      values: js.UndefOr[FilterValues] = js.undefined): Filter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "values" -> values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Filter]
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
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      createdAt: js.UndefOr[CreatedAt] = js.undefined,
      lastDeploymentJob: js.UndefOr[Arn] = js.undefined,
      lastDeploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined,
      lastDeploymentTime: js.UndefOr[CreatedAt] = js.undefined,
      name: js.UndefOr[Name] = js.undefined): Fleet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "lastDeploymentJob" -> lastDeploymentJob.map { x => x.asInstanceOf[js.Any] },
        "lastDeploymentStatus" -> lastDeploymentStatus.map { x => x.asInstanceOf[js.Any] },
        "lastDeploymentTime" -> lastDeploymentTime.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Fleet]
    }
  }

  /**
   * Information about a launch configuration.
   */
  @js.native
  trait LaunchConfig extends js.Object {
    var launchFile: GenericString
    var packageName: GenericString
    var environmentVariables: js.UndefOr[EnvironmentVariableMap]
  }

  object LaunchConfig {
    def apply(
      launchFile: GenericString,
      packageName: GenericString,
      environmentVariables: js.UndefOr[EnvironmentVariableMap] = js.undefined): LaunchConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "launchFile" -> launchFile.asInstanceOf[js.Any],
        "packageName" -> packageName.asInstanceOf[js.Any],
        "environmentVariables" -> environmentVariables.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchConfig]
    }
  }

  @js.native
  trait ListDeploymentJobsRequest extends js.Object {
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDeploymentJobsRequest {
    def apply(
      filters: js.UndefOr[Filters] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListDeploymentJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filters" -> filters.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentJobsRequest]
    }
  }

  @js.native
  trait ListDeploymentJobsResponse extends js.Object {
    var deploymentJobs: js.UndefOr[DeploymentJobs]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDeploymentJobsResponse {
    def apply(
      deploymentJobs: js.UndefOr[DeploymentJobs] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListDeploymentJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentJobs" -> deploymentJobs.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentJobsResponse]
    }
  }

  @js.native
  trait ListFleetsRequest extends js.Object {
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListFleetsRequest {
    def apply(
      filters: js.UndefOr[Filters] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListFleetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filters" -> filters.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFleetsRequest]
    }
  }

  @js.native
  trait ListFleetsResponse extends js.Object {
    var fleetDetails: js.UndefOr[Fleets]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListFleetsResponse {
    def apply(
      fleetDetails: js.UndefOr[Fleets] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListFleetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "fleetDetails" -> fleetDetails.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFleetsResponse]
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
    def apply(
      filters: js.UndefOr[Filters] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      versionQualifier: js.UndefOr[VersionQualifier] = js.undefined): ListRobotApplicationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filters" -> filters.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "versionQualifier" -> versionQualifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRobotApplicationsRequest]
    }
  }

  @js.native
  trait ListRobotApplicationsResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var robotApplicationSummaries: js.UndefOr[RobotApplicationSummaries]
  }

  object ListRobotApplicationsResponse {
    def apply(
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      robotApplicationSummaries: js.UndefOr[RobotApplicationSummaries] = js.undefined): ListRobotApplicationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "robotApplicationSummaries" -> robotApplicationSummaries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRobotApplicationsResponse]
    }
  }

  @js.native
  trait ListRobotsRequest extends js.Object {
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListRobotsRequest {
    def apply(
      filters: js.UndefOr[Filters] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListRobotsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filters" -> filters.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRobotsRequest]
    }
  }

  @js.native
  trait ListRobotsResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var robots: js.UndefOr[Robots]
  }

  object ListRobotsResponse {
    def apply(
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      robots: js.UndefOr[Robots] = js.undefined): ListRobotsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "robots" -> robots.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRobotsResponse]
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
    def apply(
      filters: js.UndefOr[Filters] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      versionQualifier: js.UndefOr[VersionQualifier] = js.undefined): ListSimulationApplicationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filters" -> filters.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "versionQualifier" -> versionQualifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSimulationApplicationsRequest]
    }
  }

  @js.native
  trait ListSimulationApplicationsResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var simulationApplicationSummaries: js.UndefOr[SimulationApplicationSummaries]
  }

  object ListSimulationApplicationsResponse {
    def apply(
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      simulationApplicationSummaries: js.UndefOr[SimulationApplicationSummaries] = js.undefined): ListSimulationApplicationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "simulationApplicationSummaries" -> simulationApplicationSummaries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSimulationApplicationsResponse]
    }
  }

  @js.native
  trait ListSimulationJobsRequest extends js.Object {
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListSimulationJobsRequest {
    def apply(
      filters: js.UndefOr[Filters] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListSimulationJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filters" -> filters.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSimulationJobsRequest]
    }
  }

  @js.native
  trait ListSimulationJobsResponse extends js.Object {
    var simulationJobSummaries: SimulationJobSummaries
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListSimulationJobsResponse {
    def apply(
      simulationJobSummaries: SimulationJobSummaries,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListSimulationJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "simulationJobSummaries" -> simulationJobSummaries.asInstanceOf[js.Any],
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSimulationJobsResponse]
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
    def apply(
      s3Bucket: js.UndefOr[S3Bucket] = js.undefined,
      s3Prefix: js.UndefOr[S3Key] = js.undefined): OutputLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "s3Bucket" -> s3Bucket.map { x => x.asInstanceOf[js.Any] },
        "s3Prefix" -> s3Prefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputLocation]
    }
  }

  /**
   * Information about the progress of a deployment job.
   */
  @js.native
  trait ProgressDetail extends js.Object {
    var currentProgress: js.UndefOr[GenericString]
    var targetResource: js.UndefOr[GenericString]
  }

  object ProgressDetail {
    def apply(
      currentProgress: js.UndefOr[GenericString] = js.undefined,
      targetResource: js.UndefOr[GenericString] = js.undefined): ProgressDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "currentProgress" -> currentProgress.map { x => x.asInstanceOf[js.Any] },
        "targetResource" -> targetResource.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProgressDetail]
    }
  }

  @js.native
  trait RegisterRobotRequest extends js.Object {
    var fleet: Arn
    var robot: Arn
  }

  object RegisterRobotRequest {
    def apply(
      fleet: Arn,
      robot: Arn): RegisterRobotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "fleet" -> fleet.asInstanceOf[js.Any],
        "robot" -> robot.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterRobotRequest]
    }
  }

  @js.native
  trait RegisterRobotResponse extends js.Object {
    var fleet: js.UndefOr[Arn]
    var robot: js.UndefOr[Arn]
  }

  object RegisterRobotResponse {
    def apply(
      fleet: js.UndefOr[Arn] = js.undefined,
      robot: js.UndefOr[Arn] = js.undefined): RegisterRobotResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "fleet" -> fleet.map { x => x.asInstanceOf[js.Any] },
        "robot" -> robot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterRobotResponse]
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
    def apply(
      name: js.UndefOr[RenderingEngineType] = js.undefined,
      version: js.UndefOr[RenderingEngineVersionType] = js.undefined): RenderingEngine = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RenderingEngine]
    }
  }

  object RenderingEngineTypeEnum {
    val OGRE = "OGRE"

    val values = IndexedSeq(OGRE)
  }

  @js.native
  trait RestartSimulationJobRequest extends js.Object {
    var job: Arn
  }

  object RestartSimulationJobRequest {
    def apply(
      job: Arn): RestartSimulationJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "job" -> job.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestartSimulationJobRequest]
    }
  }

  @js.native
  trait RestartSimulationJobResponse extends js.Object {

  }

  object RestartSimulationJobResponse {
    def apply(): RestartSimulationJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestartSimulationJobResponse]
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
    def apply(
      architecture: js.UndefOr[Architecture] = js.undefined,
      arn: js.UndefOr[Arn] = js.undefined,
      createdAt: js.UndefOr[CreatedAt] = js.undefined,
      fleetArn: js.UndefOr[Arn] = js.undefined,
      greenGrassGroupId: js.UndefOr[Id] = js.undefined,
      lastDeploymentJob: js.UndefOr[Arn] = js.undefined,
      lastDeploymentTime: js.UndefOr[CreatedAt] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      status: js.UndefOr[RobotStatus] = js.undefined): Robot = {
      val _fields = IndexedSeq[(String, js.Any)](
        "architecture" -> architecture.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "fleetArn" -> fleetArn.map { x => x.asInstanceOf[js.Any] },
        "greenGrassGroupId" -> greenGrassGroupId.map { x => x.asInstanceOf[js.Any] },
        "lastDeploymentJob" -> lastDeploymentJob.map { x => x.asInstanceOf[js.Any] },
        "lastDeploymentTime" -> lastDeploymentTime.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Robot]
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
    def apply(
      application: Arn,
      launchConfig: LaunchConfig,
      applicationVersion: js.UndefOr[Version] = js.undefined): RobotApplicationConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "application" -> application.asInstanceOf[js.Any],
        "launchConfig" -> launchConfig.asInstanceOf[js.Any],
        "applicationVersion" -> applicationVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RobotApplicationConfig]
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
    var version: js.UndefOr[Version]
  }

  object RobotApplicationSummary {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      version: js.UndefOr[Version] = js.undefined): RobotApplicationSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedAt" -> lastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RobotApplicationSummary]
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
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      deploymentFinishTime: js.UndefOr[CreatedAt] = js.undefined,
      deploymentStartTime: js.UndefOr[CreatedAt] = js.undefined,
      failureCode: js.UndefOr[DeploymentJobErrorCode] = js.undefined,
      failureReason: js.UndefOr[GenericString] = js.undefined,
      progressDetail: js.UndefOr[ProgressDetail] = js.undefined,
      status: js.UndefOr[RobotStatus] = js.undefined): RobotDeployment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "deploymentFinishTime" -> deploymentFinishTime.map { x => x.asInstanceOf[js.Any] },
        "deploymentStartTime" -> deploymentStartTime.map { x => x.asInstanceOf[js.Any] },
        "failureCode" -> failureCode.map { x => x.asInstanceOf[js.Any] },
        "failureReason" -> failureReason.map { x => x.asInstanceOf[js.Any] },
        "progressDetail" -> progressDetail.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RobotDeployment]
    }
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
    def apply(
      name: js.UndefOr[RobotSoftwareSuiteType] = js.undefined,
      version: js.UndefOr[RobotSoftwareSuiteVersionType] = js.undefined): RobotSoftwareSuite = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RobotSoftwareSuite]
    }
  }

  object RobotSoftwareSuiteTypeEnum {
    val ROS = "ROS"

    val values = IndexedSeq(ROS)
  }

  object RobotSoftwareSuiteVersionTypeEnum {
    val Kinetic = "Kinetic"

    val values = IndexedSeq(Kinetic)
  }

  object RobotStatusEnum {
    val Available = "Available"
    val Registered = "Registered"
    val PendingNewDeployment = "PendingNewDeployment"
    val Deploying = "Deploying"
    val Failed = "Failed"
    val InSync = "InSync"
    val NoResponse = "NoResponse"

    val values = IndexedSeq(Available, Registered, PendingNewDeployment, Deploying, Failed, InSync, NoResponse)
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
    def apply(
      application: Arn,
      launchConfig: LaunchConfig,
      applicationVersion: js.UndefOr[Version] = js.undefined): SimulationApplicationConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "application" -> application.asInstanceOf[js.Any],
        "launchConfig" -> launchConfig.asInstanceOf[js.Any],
        "applicationVersion" -> applicationVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SimulationApplicationConfig]
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
    var version: js.UndefOr[Version]
  }

  object SimulationApplicationSummary {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      version: js.UndefOr[Version] = js.undefined): SimulationApplicationSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedAt" -> lastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SimulationApplicationSummary]
    }
  }

  /**
   * Information about a simulation job.
   */
  @js.native
  trait SimulationJob extends js.Object {
    var arn: js.UndefOr[Arn]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var failureBehavior: js.UndefOr[FailureBehavior]
    var failureCode: js.UndefOr[SimulationJobErrorCode]
    var iamRole: js.UndefOr[IamRole]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var maxJobDurationInSeconds: js.UndefOr[JobDuration]
    var name: js.UndefOr[Name]
    var outputLocation: js.UndefOr[OutputLocation]
    var robotApplications: js.UndefOr[RobotApplicationConfigs]
    var simulationApplications: js.UndefOr[SimulationApplicationConfigs]
    var simulationTimeMillis: js.UndefOr[SimulationTimeMillis]
    var status: js.UndefOr[SimulationJobStatus]
    var vpcConfig: js.UndefOr[VPCConfigResponse]
  }

  object SimulationJob {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      failureBehavior: js.UndefOr[FailureBehavior] = js.undefined,
      failureCode: js.UndefOr[SimulationJobErrorCode] = js.undefined,
      iamRole: js.UndefOr[IamRole] = js.undefined,
      lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
      maxJobDurationInSeconds: js.UndefOr[JobDuration] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      outputLocation: js.UndefOr[OutputLocation] = js.undefined,
      robotApplications: js.UndefOr[RobotApplicationConfigs] = js.undefined,
      simulationApplications: js.UndefOr[SimulationApplicationConfigs] = js.undefined,
      simulationTimeMillis: js.UndefOr[SimulationTimeMillis] = js.undefined,
      status: js.UndefOr[SimulationJobStatus] = js.undefined,
      vpcConfig: js.UndefOr[VPCConfigResponse] = js.undefined): SimulationJob = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "clientRequestToken" -> clientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "failureBehavior" -> failureBehavior.map { x => x.asInstanceOf[js.Any] },
        "failureCode" -> failureCode.map { x => x.asInstanceOf[js.Any] },
        "iamRole" -> iamRole.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedAt" -> lastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "maxJobDurationInSeconds" -> maxJobDurationInSeconds.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "outputLocation" -> outputLocation.map { x => x.asInstanceOf[js.Any] },
        "robotApplications" -> robotApplications.map { x => x.asInstanceOf[js.Any] },
        "simulationApplications" -> simulationApplications.map { x => x.asInstanceOf[js.Any] },
        "simulationTimeMillis" -> simulationTimeMillis.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "vpcConfig" -> vpcConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SimulationJob]
    }
  }

  object SimulationJobErrorCodeEnum {
    val InternalServiceError = "InternalServiceError"
    val RobotApplicationCrash = "RobotApplicationCrash"
    val SimulationApplicationCrash = "SimulationApplicationCrash"
    val BadPermissionsRobotApplication = "BadPermissionsRobotApplication"
    val BadPermissionsSimulationApplication = "BadPermissionsSimulationApplication"
    val BadPermissionsS3Output = "BadPermissionsS3Output"
    val BadPermissionsCloudwatchLogs = "BadPermissionsCloudwatchLogs"
    val SubnetIpLimitExceeded = "SubnetIpLimitExceeded"
    val ENILimitExceeded = "ENILimitExceeded"
    val BadPermissionsUserCredentials = "BadPermissionsUserCredentials"
    val InvalidBundleRobotApplication = "InvalidBundleRobotApplication"
    val InvalidBundleSimulationApplication = "InvalidBundleSimulationApplication"
    val RobotApplicationVersionMismatchedEtag = "RobotApplicationVersionMismatchedEtag"
    val SimulationApplicationVersionMismatchedEtag = "SimulationApplicationVersionMismatchedEtag"

    val values = IndexedSeq(InternalServiceError, RobotApplicationCrash, SimulationApplicationCrash, BadPermissionsRobotApplication, BadPermissionsSimulationApplication, BadPermissionsS3Output, BadPermissionsCloudwatchLogs, SubnetIpLimitExceeded, ENILimitExceeded, BadPermissionsUserCredentials, InvalidBundleRobotApplication, InvalidBundleSimulationApplication, RobotApplicationVersionMismatchedEtag, SimulationApplicationVersionMismatchedEtag)
  }

  object SimulationJobStatusEnum {
    val Pending = "Pending"
    val Preparing = "Preparing"
    val Running = "Running"
    val Restarting = "Restarting"
    val Completed = "Completed"
    val Failed = "Failed"
    val RunningFailed = "RunningFailed"
    val Terminating = "Terminating"
    val Terminated = "Terminated"
    val Canceled = "Canceled"

    val values = IndexedSeq(Pending, Preparing, Running, Restarting, Completed, Failed, RunningFailed, Terminating, Terminated, Canceled)
  }

  /**
   * Summary information for a simulation job.
   */
  @js.native
  trait SimulationJobSummary extends js.Object {
    var arn: js.UndefOr[Arn]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var name: js.UndefOr[Name]
    var robotApplicationNames: js.UndefOr[RobotApplicationNames]
    var simulationApplicationNames: js.UndefOr[SimulationApplicationNames]
    var status: js.UndefOr[SimulationJobStatus]
  }

  object SimulationJobSummary {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      robotApplicationNames: js.UndefOr[RobotApplicationNames] = js.undefined,
      simulationApplicationNames: js.UndefOr[SimulationApplicationNames] = js.undefined,
      status: js.UndefOr[SimulationJobStatus] = js.undefined): SimulationJobSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedAt" -> lastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "robotApplicationNames" -> robotApplicationNames.map { x => x.asInstanceOf[js.Any] },
        "simulationApplicationNames" -> simulationApplicationNames.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SimulationJobSummary]
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
    def apply(
      name: js.UndefOr[SimulationSoftwareSuiteType] = js.undefined,
      version: js.UndefOr[SimulationSoftwareSuiteVersionType] = js.undefined): SimulationSoftwareSuite = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SimulationSoftwareSuite]
    }
  }

  object SimulationSoftwareSuiteTypeEnum {
    val Gazebo = "Gazebo"

    val values = IndexedSeq(Gazebo)
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
    def apply(
      architecture: js.UndefOr[Architecture] = js.undefined,
      etag: js.UndefOr[S3Etag] = js.undefined,
      s3Bucket: js.UndefOr[S3Bucket] = js.undefined,
      s3Key: js.UndefOr[S3Key] = js.undefined): Source = {
      val _fields = IndexedSeq[(String, js.Any)](
        "architecture" -> architecture.map { x => x.asInstanceOf[js.Any] },
        "etag" -> etag.map { x => x.asInstanceOf[js.Any] },
        "s3Bucket" -> s3Bucket.map { x => x.asInstanceOf[js.Any] },
        "s3Key" -> s3Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Source]
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
    def apply(
      architecture: js.UndefOr[Architecture] = js.undefined,
      s3Bucket: js.UndefOr[S3Bucket] = js.undefined,
      s3Key: js.UndefOr[S3Key] = js.undefined): SourceConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "architecture" -> architecture.map { x => x.asInstanceOf[js.Any] },
        "s3Bucket" -> s3Bucket.map { x => x.asInstanceOf[js.Any] },
        "s3Key" -> s3Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceConfig]
    }
  }

  @js.native
  trait SyncDeploymentJobRequest extends js.Object {
    var clientRequestToken: ClientRequestToken
    var fleet: Arn
  }

  object SyncDeploymentJobRequest {
    def apply(
      clientRequestToken: ClientRequestToken,
      fleet: Arn): SyncDeploymentJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientRequestToken" -> clientRequestToken.asInstanceOf[js.Any],
        "fleet" -> fleet.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SyncDeploymentJobRequest]
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
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      createdAt: js.UndefOr[CreatedAt] = js.undefined,
      deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs] = js.undefined,
      deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined,
      failureCode: js.UndefOr[DeploymentJobErrorCode] = js.undefined,
      failureReason: js.UndefOr[GenericString] = js.undefined,
      fleet: js.UndefOr[Arn] = js.undefined,
      status: js.UndefOr[DeploymentStatus] = js.undefined): SyncDeploymentJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "deploymentApplicationConfigs" -> deploymentApplicationConfigs.map { x => x.asInstanceOf[js.Any] },
        "deploymentConfig" -> deploymentConfig.map { x => x.asInstanceOf[js.Any] },
        "failureCode" -> failureCode.map { x => x.asInstanceOf[js.Any] },
        "failureReason" -> failureReason.map { x => x.asInstanceOf[js.Any] },
        "fleet" -> fleet.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SyncDeploymentJobResponse]
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
    def apply(
      application: Arn,
      robotSoftwareSuite: RobotSoftwareSuite,
      sources: SourceConfigs,
      currentRevisionId: js.UndefOr[RevisionId] = js.undefined): UpdateRobotApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "application" -> application.asInstanceOf[js.Any],
        "robotSoftwareSuite" -> robotSoftwareSuite.asInstanceOf[js.Any],
        "sources" -> sources.asInstanceOf[js.Any],
        "currentRevisionId" -> currentRevisionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRobotApplicationRequest]
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
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      revisionId: js.UndefOr[RevisionId] = js.undefined,
      robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined,
      sources: js.UndefOr[Sources] = js.undefined,
      version: js.UndefOr[Version] = js.undefined): UpdateRobotApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedAt" -> lastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "revisionId" -> revisionId.map { x => x.asInstanceOf[js.Any] },
        "robotSoftwareSuite" -> robotSoftwareSuite.map { x => x.asInstanceOf[js.Any] },
        "sources" -> sources.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRobotApplicationResponse]
    }
  }

  @js.native
  trait UpdateSimulationApplicationRequest extends js.Object {
    var application: Arn
    var renderingEngine: RenderingEngine
    var robotSoftwareSuite: RobotSoftwareSuite
    var simulationSoftwareSuite: SimulationSoftwareSuite
    var sources: SourceConfigs
    var currentRevisionId: js.UndefOr[RevisionId]
  }

  object UpdateSimulationApplicationRequest {
    def apply(
      application: Arn,
      renderingEngine: RenderingEngine,
      robotSoftwareSuite: RobotSoftwareSuite,
      simulationSoftwareSuite: SimulationSoftwareSuite,
      sources: SourceConfigs,
      currentRevisionId: js.UndefOr[RevisionId] = js.undefined): UpdateSimulationApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "application" -> application.asInstanceOf[js.Any],
        "renderingEngine" -> renderingEngine.asInstanceOf[js.Any],
        "robotSoftwareSuite" -> robotSoftwareSuite.asInstanceOf[js.Any],
        "simulationSoftwareSuite" -> simulationSoftwareSuite.asInstanceOf[js.Any],
        "sources" -> sources.asInstanceOf[js.Any],
        "currentRevisionId" -> currentRevisionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSimulationApplicationRequest]
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
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      renderingEngine: js.UndefOr[RenderingEngine] = js.undefined,
      revisionId: js.UndefOr[RevisionId] = js.undefined,
      robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined,
      simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite] = js.undefined,
      sources: js.UndefOr[Sources] = js.undefined,
      version: js.UndefOr[Version] = js.undefined): UpdateSimulationApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedAt" -> lastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "renderingEngine" -> renderingEngine.map { x => x.asInstanceOf[js.Any] },
        "revisionId" -> revisionId.map { x => x.asInstanceOf[js.Any] },
        "robotSoftwareSuite" -> robotSoftwareSuite.map { x => x.asInstanceOf[js.Any] },
        "simulationSoftwareSuite" -> simulationSoftwareSuite.map { x => x.asInstanceOf[js.Any] },
        "sources" -> sources.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSimulationApplicationResponse]
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
    def apply(
      subnets: Subnets,
      assignPublicIp: js.UndefOr[Boolean] = js.undefined,
      securityGroups: js.UndefOr[SecurityGroups] = js.undefined): VPCConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "subnets" -> subnets.asInstanceOf[js.Any],
        "assignPublicIp" -> assignPublicIp.map { x => x.asInstanceOf[js.Any] },
        "securityGroups" -> securityGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VPCConfig]
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
    def apply(
      assignPublicIp: js.UndefOr[Boolean] = js.undefined,
      securityGroups: js.UndefOr[SecurityGroups] = js.undefined,
      subnets: js.UndefOr[Subnets] = js.undefined,
      vpcId: js.UndefOr[GenericString] = js.undefined): VPCConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assignPublicIp" -> assignPublicIp.map { x => x.asInstanceOf[js.Any] },
        "securityGroups" -> securityGroups.map { x => x.asInstanceOf[js.Any] },
        "subnets" -> subnets.map { x => x.asInstanceOf[js.Any] },
        "vpcId" -> vpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VPCConfigResponse]
    }
  }
}
