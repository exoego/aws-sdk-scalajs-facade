package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object evidently {
  type Arn = String
  type CwDimensionSafeName = String
  type CwLogGroupSafeName = String
  type Description = String
  type DoubleValueList = js.Array[Double]
  type EntityId = String
  type EntityOverrideMap = js.Dictionary[VariationName]
  type ErrorCodeEnum = String
  type ErrorMessage = String
  type EvaluationRequestsList = js.Array[EvaluationRequest]
  type EvaluationResultsList = js.Array[EvaluationResult]
  type EvaluationRulesList = js.Array[EvaluationRule]
  type EventList = js.Array[Event]
  type ExperimentArn = String
  type ExperimentList = js.Array[Experiment]
  type ExperimentName = String
  type ExperimentReportList = js.Array[ExperimentReport]
  type ExperimentReportNameList = js.Array[ExperimentReportName]
  type ExperimentResultRequestTypeList = js.Array[ExperimentResultRequestType]
  type ExperimentResultsDataList = js.Array[ExperimentResultsData]
  type FeatureArn = String
  type FeatureName = String
  type FeatureSummariesList = js.Array[FeatureSummary]
  type FeatureToVariationMap = js.Dictionary[VariationName]
  type GroupName = String
  type GroupToWeightMap = js.Dictionary[SplitWeight]
  type JsonPath = String
  type JsonValue = String
  type LaunchArn = String
  type LaunchGroupConfigList = js.Array[LaunchGroupConfig]
  type LaunchGroupList = js.Array[LaunchGroup]
  type LaunchName = String
  type LaunchesList = js.Array[Launch]
  type MaxExperiments = Int
  type MaxFeatures = Int
  type MaxLaunches = Int
  type MaxProjects = Int
  type MetricDefinitionConfigEventPatternString = String
  type MetricGoalConfigList = js.Array[MetricGoalConfig]
  type MetricGoalsList = js.Array[MetricGoal]
  type MetricMonitorConfigList = js.Array[MetricMonitorConfig]
  type MetricMonitorList = js.Array[MetricMonitor]
  type MetricNameList = js.Array[CwDimensionSafeName]
  type MetricUnitLabel = String
  type NextToken = String
  type ProjectArn = String
  type ProjectName = String
  type ProjectRef = String
  type ProjectSummariesList = js.Array[ProjectSummary]
  type PutProjectEventsResultEntryList = js.Array[PutProjectEventsResultEntry]
  type RandomizationSalt = String
  type ResultsPeriod = Double
  type RuleName = String
  type RuleType = String
  type S3BucketSafeName = String
  type S3PrefixSafeName = String
  type ScheduledSplitConfigList = js.Array[ScheduledSplitConfig]
  type ScheduledStepList = js.Array[ScheduledSplit]
  type SplitWeight = Double
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Timestamp = js.Date
  type TimestampList = js.Array[Timestamp]
  type TreatmentConfigList = js.Array[TreatmentConfig]
  type TreatmentList = js.Array[Treatment]
  type TreatmentName = String
  type TreatmentNameList = js.Array[TreatmentName]
  type TreatmentToWeightMap = js.Dictionary[SplitWeight]
  type Uuid = String
  type VariableValueLongValueLong = Double
  type VariableValueStringValueString = String
  type VariationConfigsList = js.Array[VariationConfig]
  type VariationName = String
  type VariationNameList = js.Array[VariationName]
  type VariationsList = js.Array[Variation]

  final class EvidentlyOps(private val service: Evidently) extends AnyVal {

    @inline def batchEvaluateFeatureFuture(params: BatchEvaluateFeatureRequest): Future[BatchEvaluateFeatureResponse] = service.batchEvaluateFeature(params).promise().toFuture
    @inline def createExperimentFuture(params: CreateExperimentRequest): Future[CreateExperimentResponse] = service.createExperiment(params).promise().toFuture
    @inline def createFeatureFuture(params: CreateFeatureRequest): Future[CreateFeatureResponse] = service.createFeature(params).promise().toFuture
    @inline def createLaunchFuture(params: CreateLaunchRequest): Future[CreateLaunchResponse] = service.createLaunch(params).promise().toFuture
    @inline def createProjectFuture(params: CreateProjectRequest): Future[CreateProjectResponse] = service.createProject(params).promise().toFuture
    @inline def deleteExperimentFuture(params: DeleteExperimentRequest): Future[DeleteExperimentResponse] = service.deleteExperiment(params).promise().toFuture
    @inline def deleteFeatureFuture(params: DeleteFeatureRequest): Future[DeleteFeatureResponse] = service.deleteFeature(params).promise().toFuture
    @inline def deleteLaunchFuture(params: DeleteLaunchRequest): Future[DeleteLaunchResponse] = service.deleteLaunch(params).promise().toFuture
    @inline def deleteProjectFuture(params: DeleteProjectRequest): Future[DeleteProjectResponse] = service.deleteProject(params).promise().toFuture
    @inline def evaluateFeatureFuture(params: EvaluateFeatureRequest): Future[EvaluateFeatureResponse] = service.evaluateFeature(params).promise().toFuture
    @inline def getExperimentFuture(params: GetExperimentRequest): Future[GetExperimentResponse] = service.getExperiment(params).promise().toFuture
    @inline def getExperimentResultsFuture(params: GetExperimentResultsRequest): Future[GetExperimentResultsResponse] = service.getExperimentResults(params).promise().toFuture
    @inline def getFeatureFuture(params: GetFeatureRequest): Future[GetFeatureResponse] = service.getFeature(params).promise().toFuture
    @inline def getLaunchFuture(params: GetLaunchRequest): Future[GetLaunchResponse] = service.getLaunch(params).promise().toFuture
    @inline def getProjectFuture(params: GetProjectRequest): Future[GetProjectResponse] = service.getProject(params).promise().toFuture
    @inline def listExperimentsFuture(params: ListExperimentsRequest): Future[ListExperimentsResponse] = service.listExperiments(params).promise().toFuture
    @inline def listFeaturesFuture(params: ListFeaturesRequest): Future[ListFeaturesResponse] = service.listFeatures(params).promise().toFuture
    @inline def listLaunchesFuture(params: ListLaunchesRequest): Future[ListLaunchesResponse] = service.listLaunches(params).promise().toFuture
    @inline def listProjectsFuture(params: ListProjectsRequest): Future[ListProjectsResponse] = service.listProjects(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putProjectEventsFuture(params: PutProjectEventsRequest): Future[PutProjectEventsResponse] = service.putProjectEvents(params).promise().toFuture
    @inline def startExperimentFuture(params: StartExperimentRequest): Future[StartExperimentResponse] = service.startExperiment(params).promise().toFuture
    @inline def startLaunchFuture(params: StartLaunchRequest): Future[StartLaunchResponse] = service.startLaunch(params).promise().toFuture
    @inline def stopExperimentFuture(params: StopExperimentRequest): Future[StopExperimentResponse] = service.stopExperiment(params).promise().toFuture
    @inline def stopLaunchFuture(params: StopLaunchRequest): Future[StopLaunchResponse] = service.stopLaunch(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateExperimentFuture(params: UpdateExperimentRequest): Future[UpdateExperimentResponse] = service.updateExperiment(params).promise().toFuture
    @inline def updateFeatureFuture(params: UpdateFeatureRequest): Future[UpdateFeatureResponse] = service.updateFeature(params).promise().toFuture
    @inline def updateLaunchFuture(params: UpdateLaunchRequest): Future[UpdateLaunchResponse] = service.updateLaunch(params).promise().toFuture
    @inline def updateProjectDataDeliveryFuture(params: UpdateProjectDataDeliveryRequest): Future[UpdateProjectDataDeliveryResponse] = service.updateProjectDataDelivery(params).promise().toFuture
    @inline def updateProjectFuture(params: UpdateProjectRequest): Future[UpdateProjectResponse] = service.updateProject(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/evidently", JSImport.Namespace, "AWS.Evidently")
  class Evidently() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchEvaluateFeature(params: BatchEvaluateFeatureRequest): Request[BatchEvaluateFeatureResponse] = js.native
    def createExperiment(params: CreateExperimentRequest): Request[CreateExperimentResponse] = js.native
    def createFeature(params: CreateFeatureRequest): Request[CreateFeatureResponse] = js.native
    def createLaunch(params: CreateLaunchRequest): Request[CreateLaunchResponse] = js.native
    def createProject(params: CreateProjectRequest): Request[CreateProjectResponse] = js.native
    def deleteExperiment(params: DeleteExperimentRequest): Request[DeleteExperimentResponse] = js.native
    def deleteFeature(params: DeleteFeatureRequest): Request[DeleteFeatureResponse] = js.native
    def deleteLaunch(params: DeleteLaunchRequest): Request[DeleteLaunchResponse] = js.native
    def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResponse] = js.native
    def evaluateFeature(params: EvaluateFeatureRequest): Request[EvaluateFeatureResponse] = js.native
    def getExperiment(params: GetExperimentRequest): Request[GetExperimentResponse] = js.native
    def getExperimentResults(params: GetExperimentResultsRequest): Request[GetExperimentResultsResponse] = js.native
    def getFeature(params: GetFeatureRequest): Request[GetFeatureResponse] = js.native
    def getLaunch(params: GetLaunchRequest): Request[GetLaunchResponse] = js.native
    def getProject(params: GetProjectRequest): Request[GetProjectResponse] = js.native
    def listExperiments(params: ListExperimentsRequest): Request[ListExperimentsResponse] = js.native
    def listFeatures(params: ListFeaturesRequest): Request[ListFeaturesResponse] = js.native
    def listLaunches(params: ListLaunchesRequest): Request[ListLaunchesResponse] = js.native
    def listProjects(params: ListProjectsRequest): Request[ListProjectsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putProjectEvents(params: PutProjectEventsRequest): Request[PutProjectEventsResponse] = js.native
    def startExperiment(params: StartExperimentRequest): Request[StartExperimentResponse] = js.native
    def startLaunch(params: StartLaunchRequest): Request[StartLaunchResponse] = js.native
    def stopExperiment(params: StopExperimentRequest): Request[StopExperimentResponse] = js.native
    def stopLaunch(params: StopLaunchRequest): Request[StopLaunchResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateExperiment(params: UpdateExperimentRequest): Request[UpdateExperimentResponse] = js.native
    def updateFeature(params: UpdateFeatureRequest): Request[UpdateFeatureResponse] = js.native
    def updateLaunch(params: UpdateLaunchRequest): Request[UpdateLaunchResponse] = js.native
    def updateProject(params: UpdateProjectRequest): Request[UpdateProjectResponse] = js.native
    def updateProjectDataDelivery(params: UpdateProjectDataDeliveryRequest): Request[UpdateProjectDataDeliveryResponse] = js.native
  }
  object Evidently {
    @inline implicit def toOps(service: Evidently): EvidentlyOps = {
      new EvidentlyOps(service)
    }
  }

  @js.native
  trait BatchEvaluateFeatureRequest extends js.Object {
    var project: ProjectRef
    var requests: EvaluationRequestsList
  }

  object BatchEvaluateFeatureRequest {
    @inline
    def apply(
        project: ProjectRef,
        requests: EvaluationRequestsList
    ): BatchEvaluateFeatureRequest = {
      val __obj = js.Dynamic.literal(
        "project" -> project.asInstanceOf[js.Any],
        "requests" -> requests.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchEvaluateFeatureRequest]
    }
  }

  @js.native
  trait BatchEvaluateFeatureResponse extends js.Object {
    var results: js.UndefOr[EvaluationResultsList]
  }

  object BatchEvaluateFeatureResponse {
    @inline
    def apply(
        results: js.UndefOr[EvaluationResultsList] = js.undefined
    ): BatchEvaluateFeatureResponse = {
      val __obj = js.Dynamic.literal()
      results.foreach(__v => __obj.updateDynamic("results")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchEvaluateFeatureResponse]
    }
  }

  /** A structure containing the CloudWatch Logs log group where the project stores evaluation events.
    */
  @js.native
  trait CloudWatchLogsDestination extends js.Object {
    var logGroup: js.UndefOr[CwLogGroupSafeName]
  }

  object CloudWatchLogsDestination {
    @inline
    def apply(
        logGroup: js.UndefOr[CwLogGroupSafeName] = js.undefined
    ): CloudWatchLogsDestination = {
      val __obj = js.Dynamic.literal()
      logGroup.foreach(__v => __obj.updateDynamic("logGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchLogsDestination]
    }
  }

  /** A structure containing the CloudWatch Logs log group where the project stores evaluation events.
    */
  @js.native
  trait CloudWatchLogsDestinationConfig extends js.Object {
    var logGroup: js.UndefOr[CwLogGroupSafeName]
  }

  object CloudWatchLogsDestinationConfig {
    @inline
    def apply(
        logGroup: js.UndefOr[CwLogGroupSafeName] = js.undefined
    ): CloudWatchLogsDestinationConfig = {
      val __obj = js.Dynamic.literal()
      logGroup.foreach(__v => __obj.updateDynamic("logGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchLogsDestinationConfig]
    }
  }

  @js.native
  trait CreateExperimentRequest extends js.Object {
    var metricGoals: MetricGoalConfigList
    var name: ExperimentName
    var project: ProjectRef
    var treatments: TreatmentConfigList
    var description: js.UndefOr[Description]
    var onlineAbConfig: js.UndefOr[OnlineAbConfig]
    var randomizationSalt: js.UndefOr[RandomizationSalt]
    var samplingRate: js.UndefOr[SplitWeight]
    var tags: js.UndefOr[TagMap]
  }

  object CreateExperimentRequest {
    @inline
    def apply(
        metricGoals: MetricGoalConfigList,
        name: ExperimentName,
        project: ProjectRef,
        treatments: TreatmentConfigList,
        description: js.UndefOr[Description] = js.undefined,
        onlineAbConfig: js.UndefOr[OnlineAbConfig] = js.undefined,
        randomizationSalt: js.UndefOr[RandomizationSalt] = js.undefined,
        samplingRate: js.UndefOr[SplitWeight] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateExperimentRequest = {
      val __obj = js.Dynamic.literal(
        "metricGoals" -> metricGoals.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "project" -> project.asInstanceOf[js.Any],
        "treatments" -> treatments.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      onlineAbConfig.foreach(__v => __obj.updateDynamic("onlineAbConfig")(__v.asInstanceOf[js.Any]))
      randomizationSalt.foreach(__v => __obj.updateDynamic("randomizationSalt")(__v.asInstanceOf[js.Any]))
      samplingRate.foreach(__v => __obj.updateDynamic("samplingRate")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateExperimentRequest]
    }
  }

  @js.native
  trait CreateExperimentResponse extends js.Object {
    var experiment: Experiment
  }

  object CreateExperimentResponse {
    @inline
    def apply(
        experiment: Experiment
    ): CreateExperimentResponse = {
      val __obj = js.Dynamic.literal(
        "experiment" -> experiment.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateExperimentResponse]
    }
  }

  @js.native
  trait CreateFeatureRequest extends js.Object {
    var name: FeatureName
    var project: ProjectRef
    var variations: VariationConfigsList
    var defaultVariation: js.UndefOr[VariationName]
    var description: js.UndefOr[Description]
    var entityOverrides: js.UndefOr[EntityOverrideMap]
    var evaluationStrategy: js.UndefOr[FeatureEvaluationStrategy]
    var tags: js.UndefOr[TagMap]
  }

  object CreateFeatureRequest {
    @inline
    def apply(
        name: FeatureName,
        project: ProjectRef,
        variations: VariationConfigsList,
        defaultVariation: js.UndefOr[VariationName] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        entityOverrides: js.UndefOr[EntityOverrideMap] = js.undefined,
        evaluationStrategy: js.UndefOr[FeatureEvaluationStrategy] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateFeatureRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "project" -> project.asInstanceOf[js.Any],
        "variations" -> variations.asInstanceOf[js.Any]
      )

      defaultVariation.foreach(__v => __obj.updateDynamic("defaultVariation")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      entityOverrides.foreach(__v => __obj.updateDynamic("entityOverrides")(__v.asInstanceOf[js.Any]))
      evaluationStrategy.foreach(__v => __obj.updateDynamic("evaluationStrategy")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFeatureRequest]
    }
  }

  @js.native
  trait CreateFeatureResponse extends js.Object {
    var feature: js.UndefOr[Feature]
  }

  object CreateFeatureResponse {
    @inline
    def apply(
        feature: js.UndefOr[Feature] = js.undefined
    ): CreateFeatureResponse = {
      val __obj = js.Dynamic.literal()
      feature.foreach(__v => __obj.updateDynamic("feature")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFeatureResponse]
    }
  }

  @js.native
  trait CreateLaunchRequest extends js.Object {
    var groups: LaunchGroupConfigList
    var name: LaunchName
    var project: ProjectRef
    var description: js.UndefOr[Description]
    var metricMonitors: js.UndefOr[MetricMonitorConfigList]
    var randomizationSalt: js.UndefOr[RandomizationSalt]
    var scheduledSplitsConfig: js.UndefOr[ScheduledSplitsLaunchConfig]
    var tags: js.UndefOr[TagMap]
  }

  object CreateLaunchRequest {
    @inline
    def apply(
        groups: LaunchGroupConfigList,
        name: LaunchName,
        project: ProjectRef,
        description: js.UndefOr[Description] = js.undefined,
        metricMonitors: js.UndefOr[MetricMonitorConfigList] = js.undefined,
        randomizationSalt: js.UndefOr[RandomizationSalt] = js.undefined,
        scheduledSplitsConfig: js.UndefOr[ScheduledSplitsLaunchConfig] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateLaunchRequest = {
      val __obj = js.Dynamic.literal(
        "groups" -> groups.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "project" -> project.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      metricMonitors.foreach(__v => __obj.updateDynamic("metricMonitors")(__v.asInstanceOf[js.Any]))
      randomizationSalt.foreach(__v => __obj.updateDynamic("randomizationSalt")(__v.asInstanceOf[js.Any]))
      scheduledSplitsConfig.foreach(__v => __obj.updateDynamic("scheduledSplitsConfig")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLaunchRequest]
    }
  }

  @js.native
  trait CreateLaunchResponse extends js.Object {
    var launch: Launch
  }

  object CreateLaunchResponse {
    @inline
    def apply(
        launch: Launch
    ): CreateLaunchResponse = {
      val __obj = js.Dynamic.literal(
        "launch" -> launch.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateLaunchResponse]
    }
  }

  @js.native
  trait CreateProjectRequest extends js.Object {
    var name: ProjectName
    var dataDelivery: js.UndefOr[ProjectDataDeliveryConfig]
    var description: js.UndefOr[Description]
    var tags: js.UndefOr[TagMap]
  }

  object CreateProjectRequest {
    @inline
    def apply(
        name: ProjectName,
        dataDelivery: js.UndefOr[ProjectDataDeliveryConfig] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateProjectRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      dataDelivery.foreach(__v => __obj.updateDynamic("dataDelivery")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProjectRequest]
    }
  }

  @js.native
  trait CreateProjectResponse extends js.Object {
    var project: Project
  }

  object CreateProjectResponse {
    @inline
    def apply(
        project: Project
    ): CreateProjectResponse = {
      val __obj = js.Dynamic.literal(
        "project" -> project.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateProjectResponse]
    }
  }

  @js.native
  trait DeleteExperimentRequest extends js.Object {
    var experiment: ExperimentName
    var project: ProjectRef
  }

  object DeleteExperimentRequest {
    @inline
    def apply(
        experiment: ExperimentName,
        project: ProjectRef
    ): DeleteExperimentRequest = {
      val __obj = js.Dynamic.literal(
        "experiment" -> experiment.asInstanceOf[js.Any],
        "project" -> project.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteExperimentRequest]
    }
  }

  @js.native
  trait DeleteExperimentResponse extends js.Object

  object DeleteExperimentResponse {
    @inline
    def apply(): DeleteExperimentResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteExperimentResponse]
    }
  }

  @js.native
  trait DeleteFeatureRequest extends js.Object {
    var feature: FeatureName
    var project: ProjectRef
  }

  object DeleteFeatureRequest {
    @inline
    def apply(
        feature: FeatureName,
        project: ProjectRef
    ): DeleteFeatureRequest = {
      val __obj = js.Dynamic.literal(
        "feature" -> feature.asInstanceOf[js.Any],
        "project" -> project.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFeatureRequest]
    }
  }

  @js.native
  trait DeleteFeatureResponse extends js.Object

  object DeleteFeatureResponse {
    @inline
    def apply(): DeleteFeatureResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteFeatureResponse]
    }
  }

  @js.native
  trait DeleteLaunchRequest extends js.Object {
    var launch: LaunchName
    var project: ProjectRef
  }

  object DeleteLaunchRequest {
    @inline
    def apply(
        launch: LaunchName,
        project: ProjectRef
    ): DeleteLaunchRequest = {
      val __obj = js.Dynamic.literal(
        "launch" -> launch.asInstanceOf[js.Any],
        "project" -> project.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteLaunchRequest]
    }
  }

  @js.native
  trait DeleteLaunchResponse extends js.Object

  object DeleteLaunchResponse {
    @inline
    def apply(): DeleteLaunchResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteLaunchResponse]
    }
  }

  @js.native
  trait DeleteProjectRequest extends js.Object {
    var project: ProjectRef
  }

  object DeleteProjectRequest {
    @inline
    def apply(
        project: ProjectRef
    ): DeleteProjectRequest = {
      val __obj = js.Dynamic.literal(
        "project" -> project.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteProjectRequest]
    }
  }

  @js.native
  trait DeleteProjectResponse extends js.Object

  object DeleteProjectResponse {
    @inline
    def apply(): DeleteProjectResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteProjectResponse]
    }
  }

  @js.native
  trait EvaluateFeatureRequest extends js.Object {
    var entityId: EntityId
    var feature: FeatureName
    var project: ProjectRef
    var evaluationContext: js.UndefOr[JsonValue]
  }

  object EvaluateFeatureRequest {
    @inline
    def apply(
        entityId: EntityId,
        feature: FeatureName,
        project: ProjectRef,
        evaluationContext: js.UndefOr[JsonValue] = js.undefined
    ): EvaluateFeatureRequest = {
      val __obj = js.Dynamic.literal(
        "entityId" -> entityId.asInstanceOf[js.Any],
        "feature" -> feature.asInstanceOf[js.Any],
        "project" -> project.asInstanceOf[js.Any]
      )

      evaluationContext.foreach(__v => __obj.updateDynamic("evaluationContext")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EvaluateFeatureRequest]
    }
  }

  @js.native
  trait EvaluateFeatureResponse extends js.Object {
    var details: js.UndefOr[JsonValue]
    var reason: js.UndefOr[String]
    var value: js.UndefOr[VariableValue]
    var variation: js.UndefOr[String]
  }

  object EvaluateFeatureResponse {
    @inline
    def apply(
        details: js.UndefOr[JsonValue] = js.undefined,
        reason: js.UndefOr[String] = js.undefined,
        value: js.UndefOr[VariableValue] = js.undefined,
        variation: js.UndefOr[String] = js.undefined
    ): EvaluateFeatureResponse = {
      val __obj = js.Dynamic.literal()
      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      variation.foreach(__v => __obj.updateDynamic("variation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EvaluateFeatureResponse]
    }
  }

  /** This structure assigns a feature variation to one user session.
    */
  @js.native
  trait EvaluationRequest extends js.Object {
    var entityId: EntityId
    var feature: FeatureName
    var evaluationContext: js.UndefOr[JsonValue]
  }

  object EvaluationRequest {
    @inline
    def apply(
        entityId: EntityId,
        feature: FeatureName,
        evaluationContext: js.UndefOr[JsonValue] = js.undefined
    ): EvaluationRequest = {
      val __obj = js.Dynamic.literal(
        "entityId" -> entityId.asInstanceOf[js.Any],
        "feature" -> feature.asInstanceOf[js.Any]
      )

      evaluationContext.foreach(__v => __obj.updateDynamic("evaluationContext")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EvaluationRequest]
    }
  }

  /** This structure displays the results of one feature evaluation assignment to one user session.
    */
  @js.native
  trait EvaluationResult extends js.Object {
    var entityId: EntityId
    var feature: FeatureName
    var details: js.UndefOr[JsonValue]
    var project: js.UndefOr[Arn]
    var reason: js.UndefOr[String]
    var value: js.UndefOr[VariableValue]
    var variation: js.UndefOr[String]
  }

  object EvaluationResult {
    @inline
    def apply(
        entityId: EntityId,
        feature: FeatureName,
        details: js.UndefOr[JsonValue] = js.undefined,
        project: js.UndefOr[Arn] = js.undefined,
        reason: js.UndefOr[String] = js.undefined,
        value: js.UndefOr[VariableValue] = js.undefined,
        variation: js.UndefOr[String] = js.undefined
    ): EvaluationResult = {
      val __obj = js.Dynamic.literal(
        "entityId" -> entityId.asInstanceOf[js.Any],
        "feature" -> feature.asInstanceOf[js.Any]
      )

      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      project.foreach(__v => __obj.updateDynamic("project")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      variation.foreach(__v => __obj.updateDynamic("variation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EvaluationResult]
    }
  }

  /** A structure that contains the information about an evaluation rule for this feature, if it is used in a launch or experiment.
    */
  @js.native
  trait EvaluationRule extends js.Object {
    var `type`: RuleType
    var name: js.UndefOr[RuleName]
  }

  object EvaluationRule {
    @inline
    def apply(
        `type`: RuleType,
        name: js.UndefOr[RuleName] = js.undefined
    ): EvaluationRule = {
      val __obj = js.Dynamic.literal(
        "type" -> `type`.asInstanceOf[js.Any]
      )

      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EvaluationRule]
    }
  }

  /** A structure that contains the information about one evaluation event or custom event sent to Evidently. This is a JSON payload. If this event specifies a pre-defined event type, the payload must follow the defined event schema.
    */
  @js.native
  trait Event extends js.Object {
    var data: JsonValue
    var timestamp: Timestamp
    var `type`: EventType
  }

  object Event {
    @inline
    def apply(
        data: JsonValue,
        timestamp: Timestamp,
        `type`: EventType
    ): Event = {
      val __obj = js.Dynamic.literal(
        "data" -> data.asInstanceOf[js.Any],
        "timestamp" -> timestamp.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Event]
    }
  }

  /** A structure containing the configuration details of an experiment.
    */
  @js.native
  trait Experiment extends js.Object {
    var arn: ExperimentArn
    var createdTime: Timestamp
    var lastUpdatedTime: Timestamp
    var name: ExperimentName
    var status: ExperimentStatus
    var `type`: ExperimentType
    var description: js.UndefOr[Description]
    var execution: js.UndefOr[ExperimentExecution]
    var metricGoals: js.UndefOr[MetricGoalsList]
    var onlineAbDefinition: js.UndefOr[OnlineAbDefinition]
    var project: js.UndefOr[ProjectArn]
    var randomizationSalt: js.UndefOr[RandomizationSalt]
    var samplingRate: js.UndefOr[SplitWeight]
    var schedule: js.UndefOr[ExperimentSchedule]
    var statusReason: js.UndefOr[Description]
    var tags: js.UndefOr[TagMap]
    var treatments: js.UndefOr[TreatmentList]
  }

  object Experiment {
    @inline
    def apply(
        arn: ExperimentArn,
        createdTime: Timestamp,
        lastUpdatedTime: Timestamp,
        name: ExperimentName,
        status: ExperimentStatus,
        `type`: ExperimentType,
        description: js.UndefOr[Description] = js.undefined,
        execution: js.UndefOr[ExperimentExecution] = js.undefined,
        metricGoals: js.UndefOr[MetricGoalsList] = js.undefined,
        onlineAbDefinition: js.UndefOr[OnlineAbDefinition] = js.undefined,
        project: js.UndefOr[ProjectArn] = js.undefined,
        randomizationSalt: js.UndefOr[RandomizationSalt] = js.undefined,
        samplingRate: js.UndefOr[SplitWeight] = js.undefined,
        schedule: js.UndefOr[ExperimentSchedule] = js.undefined,
        statusReason: js.UndefOr[Description] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        treatments: js.UndefOr[TreatmentList] = js.undefined
    ): Experiment = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdTime" -> createdTime.asInstanceOf[js.Any],
        "lastUpdatedTime" -> lastUpdatedTime.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      execution.foreach(__v => __obj.updateDynamic("execution")(__v.asInstanceOf[js.Any]))
      metricGoals.foreach(__v => __obj.updateDynamic("metricGoals")(__v.asInstanceOf[js.Any]))
      onlineAbDefinition.foreach(__v => __obj.updateDynamic("onlineAbDefinition")(__v.asInstanceOf[js.Any]))
      project.foreach(__v => __obj.updateDynamic("project")(__v.asInstanceOf[js.Any]))
      randomizationSalt.foreach(__v => __obj.updateDynamic("randomizationSalt")(__v.asInstanceOf[js.Any]))
      samplingRate.foreach(__v => __obj.updateDynamic("samplingRate")(__v.asInstanceOf[js.Any]))
      schedule.foreach(__v => __obj.updateDynamic("schedule")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      treatments.foreach(__v => __obj.updateDynamic("treatments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Experiment]
    }
  }

  /** This structure contains the date and time that the experiment started and ended.
    */
  @js.native
  trait ExperimentExecution extends js.Object {
    var endedTime: js.UndefOr[Timestamp]
    var startedTime: js.UndefOr[Timestamp]
  }

  object ExperimentExecution {
    @inline
    def apply(
        endedTime: js.UndefOr[Timestamp] = js.undefined,
        startedTime: js.UndefOr[Timestamp] = js.undefined
    ): ExperimentExecution = {
      val __obj = js.Dynamic.literal()
      endedTime.foreach(__v => __obj.updateDynamic("endedTime")(__v.asInstanceOf[js.Any]))
      startedTime.foreach(__v => __obj.updateDynamic("startedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentExecution]
    }
  }

  /** A structure that contains results of an experiment.
    */
  @js.native
  trait ExperimentReport extends js.Object {
    var content: js.UndefOr[JsonValue]
    var metricName: js.UndefOr[CwDimensionSafeName]
    var reportName: js.UndefOr[ExperimentReportName]
    var treatmentName: js.UndefOr[TreatmentName]
  }

  object ExperimentReport {
    @inline
    def apply(
        content: js.UndefOr[JsonValue] = js.undefined,
        metricName: js.UndefOr[CwDimensionSafeName] = js.undefined,
        reportName: js.UndefOr[ExperimentReportName] = js.undefined,
        treatmentName: js.UndefOr[TreatmentName] = js.undefined
    ): ExperimentReport = {
      val __obj = js.Dynamic.literal()
      content.foreach(__v => __obj.updateDynamic("content")(__v.asInstanceOf[js.Any]))
      metricName.foreach(__v => __obj.updateDynamic("metricName")(__v.asInstanceOf[js.Any]))
      reportName.foreach(__v => __obj.updateDynamic("reportName")(__v.asInstanceOf[js.Any]))
      treatmentName.foreach(__v => __obj.updateDynamic("treatmentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentReport]
    }
  }

  /** A structure that contains experiment results for one metric that is monitored in the experiment.
    */
  @js.native
  trait ExperimentResultsData extends js.Object {
    var metricName: js.UndefOr[CwDimensionSafeName]
    var resultStat: js.UndefOr[ExperimentResultResponseType]
    var treatmentName: js.UndefOr[TreatmentName]
    var values: js.UndefOr[DoubleValueList]
  }

  object ExperimentResultsData {
    @inline
    def apply(
        metricName: js.UndefOr[CwDimensionSafeName] = js.undefined,
        resultStat: js.UndefOr[ExperimentResultResponseType] = js.undefined,
        treatmentName: js.UndefOr[TreatmentName] = js.undefined,
        values: js.UndefOr[DoubleValueList] = js.undefined
    ): ExperimentResultsData = {
      val __obj = js.Dynamic.literal()
      metricName.foreach(__v => __obj.updateDynamic("metricName")(__v.asInstanceOf[js.Any]))
      resultStat.foreach(__v => __obj.updateDynamic("resultStat")(__v.asInstanceOf[js.Any]))
      treatmentName.foreach(__v => __obj.updateDynamic("treatmentName")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentResultsData]
    }
  }

  /** This structure contains the time and date that Evidently completed the analysis of the experiment.
    */
  @js.native
  trait ExperimentSchedule extends js.Object {
    var analysisCompleteTime: js.UndefOr[Timestamp]
  }

  object ExperimentSchedule {
    @inline
    def apply(
        analysisCompleteTime: js.UndefOr[Timestamp] = js.undefined
    ): ExperimentSchedule = {
      val __obj = js.Dynamic.literal()
      analysisCompleteTime.foreach(__v => __obj.updateDynamic("analysisCompleteTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentSchedule]
    }
  }

  /** This structure contains information about one Evidently feature in your account.
    */
  @js.native
  trait Feature extends js.Object {
    var arn: FeatureArn
    var createdTime: Timestamp
    var evaluationStrategy: FeatureEvaluationStrategy
    var lastUpdatedTime: Timestamp
    var name: FeatureName
    var status: FeatureStatus
    var valueType: VariationValueType
    var variations: VariationsList
    var defaultVariation: js.UndefOr[VariationName]
    var description: js.UndefOr[Description]
    var entityOverrides: js.UndefOr[EntityOverrideMap]
    var evaluationRules: js.UndefOr[EvaluationRulesList]
    var project: js.UndefOr[ProjectArn]
    var tags: js.UndefOr[TagMap]
  }

  object Feature {
    @inline
    def apply(
        arn: FeatureArn,
        createdTime: Timestamp,
        evaluationStrategy: FeatureEvaluationStrategy,
        lastUpdatedTime: Timestamp,
        name: FeatureName,
        status: FeatureStatus,
        valueType: VariationValueType,
        variations: VariationsList,
        defaultVariation: js.UndefOr[VariationName] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        entityOverrides: js.UndefOr[EntityOverrideMap] = js.undefined,
        evaluationRules: js.UndefOr[EvaluationRulesList] = js.undefined,
        project: js.UndefOr[ProjectArn] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): Feature = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdTime" -> createdTime.asInstanceOf[js.Any],
        "evaluationStrategy" -> evaluationStrategy.asInstanceOf[js.Any],
        "lastUpdatedTime" -> lastUpdatedTime.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "valueType" -> valueType.asInstanceOf[js.Any],
        "variations" -> variations.asInstanceOf[js.Any]
      )

      defaultVariation.foreach(__v => __obj.updateDynamic("defaultVariation")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      entityOverrides.foreach(__v => __obj.updateDynamic("entityOverrides")(__v.asInstanceOf[js.Any]))
      evaluationRules.foreach(__v => __obj.updateDynamic("evaluationRules")(__v.asInstanceOf[js.Any]))
      project.foreach(__v => __obj.updateDynamic("project")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Feature]
    }
  }

  /** This structure contains information about one Evidently feature in your account.
    */
  @js.native
  trait FeatureSummary extends js.Object {
    var arn: Arn
    var createdTime: Timestamp
    var evaluationStrategy: FeatureEvaluationStrategy
    var lastUpdatedTime: Timestamp
    var name: FeatureName
    var status: FeatureStatus
    var defaultVariation: js.UndefOr[VariationName]
    var evaluationRules: js.UndefOr[EvaluationRulesList]
    var project: js.UndefOr[ProjectRef]
    var tags: js.UndefOr[TagMap]
  }

  object FeatureSummary {
    @inline
    def apply(
        arn: Arn,
        createdTime: Timestamp,
        evaluationStrategy: FeatureEvaluationStrategy,
        lastUpdatedTime: Timestamp,
        name: FeatureName,
        status: FeatureStatus,
        defaultVariation: js.UndefOr[VariationName] = js.undefined,
        evaluationRules: js.UndefOr[EvaluationRulesList] = js.undefined,
        project: js.UndefOr[ProjectRef] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): FeatureSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdTime" -> createdTime.asInstanceOf[js.Any],
        "evaluationStrategy" -> evaluationStrategy.asInstanceOf[js.Any],
        "lastUpdatedTime" -> lastUpdatedTime.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      defaultVariation.foreach(__v => __obj.updateDynamic("defaultVariation")(__v.asInstanceOf[js.Any]))
      evaluationRules.foreach(__v => __obj.updateDynamic("evaluationRules")(__v.asInstanceOf[js.Any]))
      project.foreach(__v => __obj.updateDynamic("project")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FeatureSummary]
    }
  }

  @js.native
  trait GetExperimentRequest extends js.Object {
    var experiment: ExperimentName
    var project: ProjectRef
  }

  object GetExperimentRequest {
    @inline
    def apply(
        experiment: ExperimentName,
        project: ProjectRef
    ): GetExperimentRequest = {
      val __obj = js.Dynamic.literal(
        "experiment" -> experiment.asInstanceOf[js.Any],
        "project" -> project.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetExperimentRequest]
    }
  }

  @js.native
  trait GetExperimentResponse extends js.Object {
    var experiment: js.UndefOr[Experiment]
  }

  object GetExperimentResponse {
    @inline
    def apply(
        experiment: js.UndefOr[Experiment] = js.undefined
    ): GetExperimentResponse = {
      val __obj = js.Dynamic.literal()
      experiment.foreach(__v => __obj.updateDynamic("experiment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetExperimentResponse]
    }
  }

  @js.native
  trait GetExperimentResultsRequest extends js.Object {
    var experiment: ExperimentName
    var metricNames: MetricNameList
    var project: ProjectRef
    var treatmentNames: TreatmentNameList
    var baseStat: js.UndefOr[ExperimentBaseStat]
    var endTime: js.UndefOr[Timestamp]
    var period: js.UndefOr[ResultsPeriod]
    var reportNames: js.UndefOr[ExperimentReportNameList]
    var resultStats: js.UndefOr[ExperimentResultRequestTypeList]
    var startTime: js.UndefOr[Timestamp]
  }

  object GetExperimentResultsRequest {
    @inline
    def apply(
        experiment: ExperimentName,
        metricNames: MetricNameList,
        project: ProjectRef,
        treatmentNames: TreatmentNameList,
        baseStat: js.UndefOr[ExperimentBaseStat] = js.undefined,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        period: js.UndefOr[ResultsPeriod] = js.undefined,
        reportNames: js.UndefOr[ExperimentReportNameList] = js.undefined,
        resultStats: js.UndefOr[ExperimentResultRequestTypeList] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined
    ): GetExperimentResultsRequest = {
      val __obj = js.Dynamic.literal(
        "experiment" -> experiment.asInstanceOf[js.Any],
        "metricNames" -> metricNames.asInstanceOf[js.Any],
        "project" -> project.asInstanceOf[js.Any],
        "treatmentNames" -> treatmentNames.asInstanceOf[js.Any]
      )

      baseStat.foreach(__v => __obj.updateDynamic("baseStat")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      period.foreach(__v => __obj.updateDynamic("period")(__v.asInstanceOf[js.Any]))
      reportNames.foreach(__v => __obj.updateDynamic("reportNames")(__v.asInstanceOf[js.Any]))
      resultStats.foreach(__v => __obj.updateDynamic("resultStats")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetExperimentResultsRequest]
    }
  }

  @js.native
  trait GetExperimentResultsResponse extends js.Object {
    var reports: js.UndefOr[ExperimentReportList]
    var resultsData: js.UndefOr[ExperimentResultsDataList]
    var timestamps: js.UndefOr[TimestampList]
  }

  object GetExperimentResultsResponse {
    @inline
    def apply(
        reports: js.UndefOr[ExperimentReportList] = js.undefined,
        resultsData: js.UndefOr[ExperimentResultsDataList] = js.undefined,
        timestamps: js.UndefOr[TimestampList] = js.undefined
    ): GetExperimentResultsResponse = {
      val __obj = js.Dynamic.literal()
      reports.foreach(__v => __obj.updateDynamic("reports")(__v.asInstanceOf[js.Any]))
      resultsData.foreach(__v => __obj.updateDynamic("resultsData")(__v.asInstanceOf[js.Any]))
      timestamps.foreach(__v => __obj.updateDynamic("timestamps")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetExperimentResultsResponse]
    }
  }

  @js.native
  trait GetFeatureRequest extends js.Object {
    var feature: FeatureName
    var project: ProjectRef
  }

  object GetFeatureRequest {
    @inline
    def apply(
        feature: FeatureName,
        project: ProjectRef
    ): GetFeatureRequest = {
      val __obj = js.Dynamic.literal(
        "feature" -> feature.asInstanceOf[js.Any],
        "project" -> project.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetFeatureRequest]
    }
  }

  @js.native
  trait GetFeatureResponse extends js.Object {
    var feature: Feature
  }

  object GetFeatureResponse {
    @inline
    def apply(
        feature: Feature
    ): GetFeatureResponse = {
      val __obj = js.Dynamic.literal(
        "feature" -> feature.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetFeatureResponse]
    }
  }

  @js.native
  trait GetLaunchRequest extends js.Object {
    var launch: LaunchName
    var project: ProjectRef
  }

  object GetLaunchRequest {
    @inline
    def apply(
        launch: LaunchName,
        project: ProjectRef
    ): GetLaunchRequest = {
      val __obj = js.Dynamic.literal(
        "launch" -> launch.asInstanceOf[js.Any],
        "project" -> project.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetLaunchRequest]
    }
  }

  @js.native
  trait GetLaunchResponse extends js.Object {
    var launch: js.UndefOr[Launch]
  }

  object GetLaunchResponse {
    @inline
    def apply(
        launch: js.UndefOr[Launch] = js.undefined
    ): GetLaunchResponse = {
      val __obj = js.Dynamic.literal()
      launch.foreach(__v => __obj.updateDynamic("launch")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLaunchResponse]
    }
  }

  @js.native
  trait GetProjectRequest extends js.Object {
    var project: ProjectRef
  }

  object GetProjectRequest {
    @inline
    def apply(
        project: ProjectRef
    ): GetProjectRequest = {
      val __obj = js.Dynamic.literal(
        "project" -> project.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetProjectRequest]
    }
  }

  @js.native
  trait GetProjectResponse extends js.Object {
    var project: Project
  }

  object GetProjectResponse {
    @inline
    def apply(
        project: Project
    ): GetProjectResponse = {
      val __obj = js.Dynamic.literal(
        "project" -> project.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetProjectResponse]
    }
  }

  /** This structure contains the configuration details of one Evidently launch.
    */
  @js.native
  trait Launch extends js.Object {
    var arn: LaunchArn
    var createdTime: Timestamp
    var lastUpdatedTime: Timestamp
    var name: LaunchName
    var status: LaunchStatus
    var `type`: LaunchType
    var description: js.UndefOr[Description]
    var execution: js.UndefOr[LaunchExecution]
    var groups: js.UndefOr[LaunchGroupList]
    var metricMonitors: js.UndefOr[MetricMonitorList]
    var project: js.UndefOr[ProjectRef]
    var randomizationSalt: js.UndefOr[RandomizationSalt]
    var scheduledSplitsDefinition: js.UndefOr[ScheduledSplitsLaunchDefinition]
    var statusReason: js.UndefOr[Description]
    var tags: js.UndefOr[TagMap]
  }

  object Launch {
    @inline
    def apply(
        arn: LaunchArn,
        createdTime: Timestamp,
        lastUpdatedTime: Timestamp,
        name: LaunchName,
        status: LaunchStatus,
        `type`: LaunchType,
        description: js.UndefOr[Description] = js.undefined,
        execution: js.UndefOr[LaunchExecution] = js.undefined,
        groups: js.UndefOr[LaunchGroupList] = js.undefined,
        metricMonitors: js.UndefOr[MetricMonitorList] = js.undefined,
        project: js.UndefOr[ProjectRef] = js.undefined,
        randomizationSalt: js.UndefOr[RandomizationSalt] = js.undefined,
        scheduledSplitsDefinition: js.UndefOr[ScheduledSplitsLaunchDefinition] = js.undefined,
        statusReason: js.UndefOr[Description] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): Launch = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdTime" -> createdTime.asInstanceOf[js.Any],
        "lastUpdatedTime" -> lastUpdatedTime.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      execution.foreach(__v => __obj.updateDynamic("execution")(__v.asInstanceOf[js.Any]))
      groups.foreach(__v => __obj.updateDynamic("groups")(__v.asInstanceOf[js.Any]))
      metricMonitors.foreach(__v => __obj.updateDynamic("metricMonitors")(__v.asInstanceOf[js.Any]))
      project.foreach(__v => __obj.updateDynamic("project")(__v.asInstanceOf[js.Any]))
      randomizationSalt.foreach(__v => __obj.updateDynamic("randomizationSalt")(__v.asInstanceOf[js.Any]))
      scheduledSplitsDefinition.foreach(__v => __obj.updateDynamic("scheduledSplitsDefinition")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Launch]
    }
  }

  /** This structure contains information about the start and end times of the launch.
    */
  @js.native
  trait LaunchExecution extends js.Object {
    var endedTime: js.UndefOr[Timestamp]
    var startedTime: js.UndefOr[Timestamp]
  }

  object LaunchExecution {
    @inline
    def apply(
        endedTime: js.UndefOr[Timestamp] = js.undefined,
        startedTime: js.UndefOr[Timestamp] = js.undefined
    ): LaunchExecution = {
      val __obj = js.Dynamic.literal()
      endedTime.foreach(__v => __obj.updateDynamic("endedTime")(__v.asInstanceOf[js.Any]))
      startedTime.foreach(__v => __obj.updateDynamic("startedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchExecution]
    }
  }

  /** A structure that defines one launch group in a launch. A launch group is a variation of the feature that you are including in the launch.
    */
  @js.native
  trait LaunchGroup extends js.Object {
    var featureVariations: FeatureToVariationMap
    var name: GroupName
    var description: js.UndefOr[Description]
  }

  object LaunchGroup {
    @inline
    def apply(
        featureVariations: FeatureToVariationMap,
        name: GroupName,
        description: js.UndefOr[Description] = js.undefined
    ): LaunchGroup = {
      val __obj = js.Dynamic.literal(
        "featureVariations" -> featureVariations.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchGroup]
    }
  }

  /** A structure that defines one launch group in a launch. A launch group is a variation of the feature that you are including in the launch.
    */
  @js.native
  trait LaunchGroupConfig extends js.Object {
    var feature: FeatureName
    var name: GroupName
    var variation: VariationName
    var description: js.UndefOr[Description]
  }

  object LaunchGroupConfig {
    @inline
    def apply(
        feature: FeatureName,
        name: GroupName,
        variation: VariationName,
        description: js.UndefOr[Description] = js.undefined
    ): LaunchGroupConfig = {
      val __obj = js.Dynamic.literal(
        "feature" -> feature.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "variation" -> variation.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchGroupConfig]
    }
  }

  @js.native
  trait ListExperimentsRequest extends js.Object {
    var project: ProjectRef
    var maxResults: js.UndefOr[MaxExperiments]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListExperimentsRequest {
    @inline
    def apply(
        project: ProjectRef,
        maxResults: js.UndefOr[MaxExperiments] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListExperimentsRequest = {
      val __obj = js.Dynamic.literal(
        "project" -> project.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExperimentsRequest]
    }
  }

  @js.native
  trait ListExperimentsResponse extends js.Object {
    var experiments: js.UndefOr[ExperimentList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListExperimentsResponse {
    @inline
    def apply(
        experiments: js.UndefOr[ExperimentList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListExperimentsResponse = {
      val __obj = js.Dynamic.literal()
      experiments.foreach(__v => __obj.updateDynamic("experiments")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExperimentsResponse]
    }
  }

  @js.native
  trait ListFeaturesRequest extends js.Object {
    var project: ProjectRef
    var maxResults: js.UndefOr[MaxFeatures]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListFeaturesRequest {
    @inline
    def apply(
        project: ProjectRef,
        maxResults: js.UndefOr[MaxFeatures] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFeaturesRequest = {
      val __obj = js.Dynamic.literal(
        "project" -> project.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFeaturesRequest]
    }
  }

  @js.native
  trait ListFeaturesResponse extends js.Object {
    var features: js.UndefOr[FeatureSummariesList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListFeaturesResponse {
    @inline
    def apply(
        features: js.UndefOr[FeatureSummariesList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFeaturesResponse = {
      val __obj = js.Dynamic.literal()
      features.foreach(__v => __obj.updateDynamic("features")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFeaturesResponse]
    }
  }

  @js.native
  trait ListLaunchesRequest extends js.Object {
    var project: ProjectRef
    var maxResults: js.UndefOr[MaxLaunches]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListLaunchesRequest {
    @inline
    def apply(
        project: ProjectRef,
        maxResults: js.UndefOr[MaxLaunches] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLaunchesRequest = {
      val __obj = js.Dynamic.literal(
        "project" -> project.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLaunchesRequest]
    }
  }

  @js.native
  trait ListLaunchesResponse extends js.Object {
    var launches: js.UndefOr[LaunchesList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListLaunchesResponse {
    @inline
    def apply(
        launches: js.UndefOr[LaunchesList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLaunchesResponse = {
      val __obj = js.Dynamic.literal()
      launches.foreach(__v => __obj.updateDynamic("launches")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLaunchesResponse]
    }
  }

  @js.native
  trait ListProjectsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxProjects]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListProjectsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxProjects] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListProjectsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectsRequest]
    }
  }

  @js.native
  trait ListProjectsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var projects: js.UndefOr[ProjectSummariesList]
  }

  object ListProjectsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        projects: js.UndefOr[ProjectSummariesList] = js.undefined
    ): ListProjectsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      projects.foreach(__v => __obj.updateDynamic("projects")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectsResponse]
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

  /** This structure defines a metric that is being used to evaluate the variations during a launch or experiment.
    */
  @js.native
  trait MetricDefinition extends js.Object {
    var entityIdKey: js.UndefOr[JsonPath]
    var eventPattern: js.UndefOr[JsonValue]
    var name: js.UndefOr[CwDimensionSafeName]
    var unitLabel: js.UndefOr[MetricUnitLabel]
    var valueKey: js.UndefOr[JsonPath]
  }

  object MetricDefinition {
    @inline
    def apply(
        entityIdKey: js.UndefOr[JsonPath] = js.undefined,
        eventPattern: js.UndefOr[JsonValue] = js.undefined,
        name: js.UndefOr[CwDimensionSafeName] = js.undefined,
        unitLabel: js.UndefOr[MetricUnitLabel] = js.undefined,
        valueKey: js.UndefOr[JsonPath] = js.undefined
    ): MetricDefinition = {
      val __obj = js.Dynamic.literal()
      entityIdKey.foreach(__v => __obj.updateDynamic("entityIdKey")(__v.asInstanceOf[js.Any]))
      eventPattern.foreach(__v => __obj.updateDynamic("eventPattern")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      unitLabel.foreach(__v => __obj.updateDynamic("unitLabel")(__v.asInstanceOf[js.Any]))
      valueKey.foreach(__v => __obj.updateDynamic("valueKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricDefinition]
    }
  }

  /** This structure defines a metric that you want to use to evaluate the variations during a launch or experiment.
    */
  @js.native
  trait MetricDefinitionConfig extends js.Object {
    var entityIdKey: js.UndefOr[JsonPath]
    var eventPattern: js.UndefOr[MetricDefinitionConfigEventPatternString]
    var name: js.UndefOr[CwDimensionSafeName]
    var unitLabel: js.UndefOr[MetricUnitLabel]
    var valueKey: js.UndefOr[JsonPath]
  }

  object MetricDefinitionConfig {
    @inline
    def apply(
        entityIdKey: js.UndefOr[JsonPath] = js.undefined,
        eventPattern: js.UndefOr[MetricDefinitionConfigEventPatternString] = js.undefined,
        name: js.UndefOr[CwDimensionSafeName] = js.undefined,
        unitLabel: js.UndefOr[MetricUnitLabel] = js.undefined,
        valueKey: js.UndefOr[JsonPath] = js.undefined
    ): MetricDefinitionConfig = {
      val __obj = js.Dynamic.literal()
      entityIdKey.foreach(__v => __obj.updateDynamic("entityIdKey")(__v.asInstanceOf[js.Any]))
      eventPattern.foreach(__v => __obj.updateDynamic("eventPattern")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      unitLabel.foreach(__v => __obj.updateDynamic("unitLabel")(__v.asInstanceOf[js.Any]))
      valueKey.foreach(__v => __obj.updateDynamic("valueKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricDefinitionConfig]
    }
  }

  /** A structure that tells Evidently whether higher or lower values are desired for a metric that is used in an experiment.
    */
  @js.native
  trait MetricGoal extends js.Object {
    var metricDefinition: MetricDefinition
    var desiredChange: js.UndefOr[ChangeDirectionEnum]
  }

  object MetricGoal {
    @inline
    def apply(
        metricDefinition: MetricDefinition,
        desiredChange: js.UndefOr[ChangeDirectionEnum] = js.undefined
    ): MetricGoal = {
      val __obj = js.Dynamic.literal(
        "metricDefinition" -> metricDefinition.asInstanceOf[js.Any]
      )

      desiredChange.foreach(__v => __obj.updateDynamic("desiredChange")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricGoal]
    }
  }

  /** Use this structure to tell Evidently whether higher or lower values are desired for a metric that is used in an experiment.
    */
  @js.native
  trait MetricGoalConfig extends js.Object {
    var metricDefinition: MetricDefinitionConfig
    var desiredChange: js.UndefOr[ChangeDirectionEnum]
  }

  object MetricGoalConfig {
    @inline
    def apply(
        metricDefinition: MetricDefinitionConfig,
        desiredChange: js.UndefOr[ChangeDirectionEnum] = js.undefined
    ): MetricGoalConfig = {
      val __obj = js.Dynamic.literal(
        "metricDefinition" -> metricDefinition.asInstanceOf[js.Any]
      )

      desiredChange.foreach(__v => __obj.updateDynamic("desiredChange")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricGoalConfig]
    }
  }

  /** A structure that defines a metric to be used to monitor performance of the variations during a launch.
    */
  @js.native
  trait MetricMonitor extends js.Object {
    var metricDefinition: MetricDefinition
  }

  object MetricMonitor {
    @inline
    def apply(
        metricDefinition: MetricDefinition
    ): MetricMonitor = {
      val __obj = js.Dynamic.literal(
        "metricDefinition" -> metricDefinition.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MetricMonitor]
    }
  }

  /** A structure that defines a metric to be used to monitor performance of the variations during a launch.
    */
  @js.native
  trait MetricMonitorConfig extends js.Object {
    var metricDefinition: MetricDefinitionConfig
  }

  object MetricMonitorConfig {
    @inline
    def apply(
        metricDefinition: MetricDefinitionConfig
    ): MetricMonitorConfig = {
      val __obj = js.Dynamic.literal(
        "metricDefinition" -> metricDefinition.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MetricMonitorConfig]
    }
  }

  /** A structure that contains the configuration of which variation to use as the "control" version. The "control" version is used for comparison with other variations. This structure also specifies how much experiment traffic is allocated to each variation.
    */
  @js.native
  trait OnlineAbConfig extends js.Object {
    var controlTreatmentName: js.UndefOr[TreatmentName]
    var treatmentWeights: js.UndefOr[TreatmentToWeightMap]
  }

  object OnlineAbConfig {
    @inline
    def apply(
        controlTreatmentName: js.UndefOr[TreatmentName] = js.undefined,
        treatmentWeights: js.UndefOr[TreatmentToWeightMap] = js.undefined
    ): OnlineAbConfig = {
      val __obj = js.Dynamic.literal()
      controlTreatmentName.foreach(__v => __obj.updateDynamic("controlTreatmentName")(__v.asInstanceOf[js.Any]))
      treatmentWeights.foreach(__v => __obj.updateDynamic("treatmentWeights")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OnlineAbConfig]
    }
  }

  /** A structure that contains the configuration of which variation to use as the "control" version. The "control" version is used for comparison with other variations. This structure also specifies how much experiment traffic is allocated to each variation.
    */
  @js.native
  trait OnlineAbDefinition extends js.Object {
    var controlTreatmentName: js.UndefOr[TreatmentName]
    var treatmentWeights: js.UndefOr[TreatmentToWeightMap]
  }

  object OnlineAbDefinition {
    @inline
    def apply(
        controlTreatmentName: js.UndefOr[TreatmentName] = js.undefined,
        treatmentWeights: js.UndefOr[TreatmentToWeightMap] = js.undefined
    ): OnlineAbDefinition = {
      val __obj = js.Dynamic.literal()
      controlTreatmentName.foreach(__v => __obj.updateDynamic("controlTreatmentName")(__v.asInstanceOf[js.Any]))
      treatmentWeights.foreach(__v => __obj.updateDynamic("treatmentWeights")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OnlineAbDefinition]
    }
  }

  /** This structure defines a project, which is the logical object in Evidently that can contain features, launches, and experiments. Use projects to group similar features together.
    */
  @js.native
  trait Project extends js.Object {
    var arn: ProjectArn
    var createdTime: Timestamp
    var lastUpdatedTime: Timestamp
    var name: ProjectName
    var status: ProjectStatus
    var activeExperimentCount: js.UndefOr[Double]
    var activeLaunchCount: js.UndefOr[Double]
    var dataDelivery: js.UndefOr[ProjectDataDelivery]
    var description: js.UndefOr[Description]
    var experimentCount: js.UndefOr[Double]
    var featureCount: js.UndefOr[Double]
    var launchCount: js.UndefOr[Double]
    var tags: js.UndefOr[TagMap]
  }

  object Project {
    @inline
    def apply(
        arn: ProjectArn,
        createdTime: Timestamp,
        lastUpdatedTime: Timestamp,
        name: ProjectName,
        status: ProjectStatus,
        activeExperimentCount: js.UndefOr[Double] = js.undefined,
        activeLaunchCount: js.UndefOr[Double] = js.undefined,
        dataDelivery: js.UndefOr[ProjectDataDelivery] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        experimentCount: js.UndefOr[Double] = js.undefined,
        featureCount: js.UndefOr[Double] = js.undefined,
        launchCount: js.UndefOr[Double] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): Project = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdTime" -> createdTime.asInstanceOf[js.Any],
        "lastUpdatedTime" -> lastUpdatedTime.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      activeExperimentCount.foreach(__v => __obj.updateDynamic("activeExperimentCount")(__v.asInstanceOf[js.Any]))
      activeLaunchCount.foreach(__v => __obj.updateDynamic("activeLaunchCount")(__v.asInstanceOf[js.Any]))
      dataDelivery.foreach(__v => __obj.updateDynamic("dataDelivery")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      experimentCount.foreach(__v => __obj.updateDynamic("experimentCount")(__v.asInstanceOf[js.Any]))
      featureCount.foreach(__v => __obj.updateDynamic("featureCount")(__v.asInstanceOf[js.Any]))
      launchCount.foreach(__v => __obj.updateDynamic("launchCount")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Project]
    }
  }

  /** A structure that contains information about where Evidently is to store evaluation events for longer term storage.
    */
  @js.native
  trait ProjectDataDelivery extends js.Object {
    var cloudWatchLogs: js.UndefOr[CloudWatchLogsDestination]
    var s3Destination: js.UndefOr[S3Destination]
  }

  object ProjectDataDelivery {
    @inline
    def apply(
        cloudWatchLogs: js.UndefOr[CloudWatchLogsDestination] = js.undefined,
        s3Destination: js.UndefOr[S3Destination] = js.undefined
    ): ProjectDataDelivery = {
      val __obj = js.Dynamic.literal()
      cloudWatchLogs.foreach(__v => __obj.updateDynamic("cloudWatchLogs")(__v.asInstanceOf[js.Any]))
      s3Destination.foreach(__v => __obj.updateDynamic("s3Destination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectDataDelivery]
    }
  }

  /** A structure that contains information about where Evidently is to store evaluation events for longer term storage.
    */
  @js.native
  trait ProjectDataDeliveryConfig extends js.Object {
    var cloudWatchLogs: js.UndefOr[CloudWatchLogsDestinationConfig]
    var s3Destination: js.UndefOr[S3DestinationConfig]
  }

  object ProjectDataDeliveryConfig {
    @inline
    def apply(
        cloudWatchLogs: js.UndefOr[CloudWatchLogsDestinationConfig] = js.undefined,
        s3Destination: js.UndefOr[S3DestinationConfig] = js.undefined
    ): ProjectDataDeliveryConfig = {
      val __obj = js.Dynamic.literal()
      cloudWatchLogs.foreach(__v => __obj.updateDynamic("cloudWatchLogs")(__v.asInstanceOf[js.Any]))
      s3Destination.foreach(__v => __obj.updateDynamic("s3Destination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectDataDeliveryConfig]
    }
  }

  /** A structure that contains configuration information about an Evidently project.
    */
  @js.native
  trait ProjectSummary extends js.Object {
    var arn: ProjectArn
    var createdTime: Timestamp
    var lastUpdatedTime: Timestamp
    var name: ProjectName
    var status: ProjectStatus
    var activeExperimentCount: js.UndefOr[Double]
    var activeLaunchCount: js.UndefOr[Double]
    var description: js.UndefOr[Description]
    var experimentCount: js.UndefOr[Double]
    var featureCount: js.UndefOr[Double]
    var launchCount: js.UndefOr[Double]
    var tags: js.UndefOr[TagMap]
  }

  object ProjectSummary {
    @inline
    def apply(
        arn: ProjectArn,
        createdTime: Timestamp,
        lastUpdatedTime: Timestamp,
        name: ProjectName,
        status: ProjectStatus,
        activeExperimentCount: js.UndefOr[Double] = js.undefined,
        activeLaunchCount: js.UndefOr[Double] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        experimentCount: js.UndefOr[Double] = js.undefined,
        featureCount: js.UndefOr[Double] = js.undefined,
        launchCount: js.UndefOr[Double] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): ProjectSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdTime" -> createdTime.asInstanceOf[js.Any],
        "lastUpdatedTime" -> lastUpdatedTime.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      activeExperimentCount.foreach(__v => __obj.updateDynamic("activeExperimentCount")(__v.asInstanceOf[js.Any]))
      activeLaunchCount.foreach(__v => __obj.updateDynamic("activeLaunchCount")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      experimentCount.foreach(__v => __obj.updateDynamic("experimentCount")(__v.asInstanceOf[js.Any]))
      featureCount.foreach(__v => __obj.updateDynamic("featureCount")(__v.asInstanceOf[js.Any]))
      launchCount.foreach(__v => __obj.updateDynamic("launchCount")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectSummary]
    }
  }

  @js.native
  trait PutProjectEventsRequest extends js.Object {
    var events: EventList
    var project: ProjectRef
  }

  object PutProjectEventsRequest {
    @inline
    def apply(
        events: EventList,
        project: ProjectRef
    ): PutProjectEventsRequest = {
      val __obj = js.Dynamic.literal(
        "events" -> events.asInstanceOf[js.Any],
        "project" -> project.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutProjectEventsRequest]
    }
  }

  @js.native
  trait PutProjectEventsResponse extends js.Object {
    var eventResults: js.UndefOr[PutProjectEventsResultEntryList]
    var failedEventCount: js.UndefOr[Int]
  }

  object PutProjectEventsResponse {
    @inline
    def apply(
        eventResults: js.UndefOr[PutProjectEventsResultEntryList] = js.undefined,
        failedEventCount: js.UndefOr[Int] = js.undefined
    ): PutProjectEventsResponse = {
      val __obj = js.Dynamic.literal()
      eventResults.foreach(__v => __obj.updateDynamic("eventResults")(__v.asInstanceOf[js.Any]))
      failedEventCount.foreach(__v => __obj.updateDynamic("failedEventCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutProjectEventsResponse]
    }
  }

  /** A structure that contains Evidently's response to the sent events, including an event ID and error codes, if any.
    */
  @js.native
  trait PutProjectEventsResultEntry extends js.Object {
    var errorCode: js.UndefOr[ErrorCodeEnum]
    var errorMessage: js.UndefOr[ErrorMessage]
    var eventId: js.UndefOr[Uuid]
  }

  object PutProjectEventsResultEntry {
    @inline
    def apply(
        errorCode: js.UndefOr[ErrorCodeEnum] = js.undefined,
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        eventId: js.UndefOr[Uuid] = js.undefined
    ): PutProjectEventsResultEntry = {
      val __obj = js.Dynamic.literal()
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      eventId.foreach(__v => __obj.updateDynamic("eventId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutProjectEventsResultEntry]
    }
  }

  /** If the project stores evaluation events in an Amazon S3 bucket, this structure stores the bucket name and bucket prefix.
    */
  @js.native
  trait S3Destination extends js.Object {
    var bucket: js.UndefOr[S3BucketSafeName]
    var prefix: js.UndefOr[S3PrefixSafeName]
  }

  object S3Destination {
    @inline
    def apply(
        bucket: js.UndefOr[S3BucketSafeName] = js.undefined,
        prefix: js.UndefOr[S3PrefixSafeName] = js.undefined
    ): S3Destination = {
      val __obj = js.Dynamic.literal()
      bucket.foreach(__v => __obj.updateDynamic("bucket")(__v.asInstanceOf[js.Any]))
      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Destination]
    }
  }

  /** If the project stores evaluation events in an Amazon S3 bucket, this structure stores the bucket name and bucket prefix.
    */
  @js.native
  trait S3DestinationConfig extends js.Object {
    var bucket: js.UndefOr[S3BucketSafeName]
    var prefix: js.UndefOr[S3PrefixSafeName]
  }

  object S3DestinationConfig {
    @inline
    def apply(
        bucket: js.UndefOr[S3BucketSafeName] = js.undefined,
        prefix: js.UndefOr[S3PrefixSafeName] = js.undefined
    ): S3DestinationConfig = {
      val __obj = js.Dynamic.literal()
      bucket.foreach(__v => __obj.updateDynamic("bucket")(__v.asInstanceOf[js.Any]))
      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3DestinationConfig]
    }
  }

  /** This structure defines the traffic allocation percentages among the feature variations during one step of a launch, and the start time of that step.
    */
  @js.native
  trait ScheduledSplit extends js.Object {
    var startTime: Timestamp
    var groupWeights: js.UndefOr[GroupToWeightMap]
  }

  object ScheduledSplit {
    @inline
    def apply(
        startTime: Timestamp,
        groupWeights: js.UndefOr[GroupToWeightMap] = js.undefined
    ): ScheduledSplit = {
      val __obj = js.Dynamic.literal(
        "startTime" -> startTime.asInstanceOf[js.Any]
      )

      groupWeights.foreach(__v => __obj.updateDynamic("groupWeights")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduledSplit]
    }
  }

  /** This structure defines the traffic allocation percentages among the feature variations during one step of a launch, and the start time of that step.
    */
  @js.native
  trait ScheduledSplitConfig extends js.Object {
    var groupWeights: GroupToWeightMap
    var startTime: Timestamp
  }

  object ScheduledSplitConfig {
    @inline
    def apply(
        groupWeights: GroupToWeightMap,
        startTime: Timestamp
    ): ScheduledSplitConfig = {
      val __obj = js.Dynamic.literal(
        "groupWeights" -> groupWeights.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ScheduledSplitConfig]
    }
  }

  /** An array of structures that define the traffic allocation percentages among the feature variations during each step of a launch. This also defines the start time of each step.
    */
  @js.native
  trait ScheduledSplitsLaunchConfig extends js.Object {
    var steps: ScheduledSplitConfigList
  }

  object ScheduledSplitsLaunchConfig {
    @inline
    def apply(
        steps: ScheduledSplitConfigList
    ): ScheduledSplitsLaunchConfig = {
      val __obj = js.Dynamic.literal(
        "steps" -> steps.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ScheduledSplitsLaunchConfig]
    }
  }

  /** An array of structures that define the traffic allocation percentages among the feature variations during each step of a launch. This also defines the start time of each step.
    */
  @js.native
  trait ScheduledSplitsLaunchDefinition extends js.Object {
    var steps: js.UndefOr[ScheduledStepList]
  }

  object ScheduledSplitsLaunchDefinition {
    @inline
    def apply(
        steps: js.UndefOr[ScheduledStepList] = js.undefined
    ): ScheduledSplitsLaunchDefinition = {
      val __obj = js.Dynamic.literal()
      steps.foreach(__v => __obj.updateDynamic("steps")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduledSplitsLaunchDefinition]
    }
  }

  @js.native
  trait StartExperimentRequest extends js.Object {
    var analysisCompleteTime: Timestamp
    var experiment: ExperimentName
    var project: ProjectRef
  }

  object StartExperimentRequest {
    @inline
    def apply(
        analysisCompleteTime: Timestamp,
        experiment: ExperimentName,
        project: ProjectRef
    ): StartExperimentRequest = {
      val __obj = js.Dynamic.literal(
        "analysisCompleteTime" -> analysisCompleteTime.asInstanceOf[js.Any],
        "experiment" -> experiment.asInstanceOf[js.Any],
        "project" -> project.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartExperimentRequest]
    }
  }

  @js.native
  trait StartExperimentResponse extends js.Object {
    var startedTime: js.UndefOr[Timestamp]
  }

  object StartExperimentResponse {
    @inline
    def apply(
        startedTime: js.UndefOr[Timestamp] = js.undefined
    ): StartExperimentResponse = {
      val __obj = js.Dynamic.literal()
      startedTime.foreach(__v => __obj.updateDynamic("startedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartExperimentResponse]
    }
  }

  @js.native
  trait StartLaunchRequest extends js.Object {
    var launch: LaunchName
    var project: ProjectRef
  }

  object StartLaunchRequest {
    @inline
    def apply(
        launch: LaunchName,
        project: ProjectRef
    ): StartLaunchRequest = {
      val __obj = js.Dynamic.literal(
        "launch" -> launch.asInstanceOf[js.Any],
        "project" -> project.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartLaunchRequest]
    }
  }

  @js.native
  trait StartLaunchResponse extends js.Object {
    var launch: Launch
  }

  object StartLaunchResponse {
    @inline
    def apply(
        launch: Launch
    ): StartLaunchResponse = {
      val __obj = js.Dynamic.literal(
        "launch" -> launch.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartLaunchResponse]
    }
  }

  @js.native
  trait StopExperimentRequest extends js.Object {
    var experiment: ExperimentName
    var project: ProjectRef
    var desiredState: js.UndefOr[ExperimentStopDesiredState]
    var reason: js.UndefOr[Description]
  }

  object StopExperimentRequest {
    @inline
    def apply(
        experiment: ExperimentName,
        project: ProjectRef,
        desiredState: js.UndefOr[ExperimentStopDesiredState] = js.undefined,
        reason: js.UndefOr[Description] = js.undefined
    ): StopExperimentRequest = {
      val __obj = js.Dynamic.literal(
        "experiment" -> experiment.asInstanceOf[js.Any],
        "project" -> project.asInstanceOf[js.Any]
      )

      desiredState.foreach(__v => __obj.updateDynamic("desiredState")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopExperimentRequest]
    }
  }

  @js.native
  trait StopExperimentResponse extends js.Object {
    var endedTime: js.UndefOr[Timestamp]
  }

  object StopExperimentResponse {
    @inline
    def apply(
        endedTime: js.UndefOr[Timestamp] = js.undefined
    ): StopExperimentResponse = {
      val __obj = js.Dynamic.literal()
      endedTime.foreach(__v => __obj.updateDynamic("endedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopExperimentResponse]
    }
  }

  @js.native
  trait StopLaunchRequest extends js.Object {
    var launch: LaunchName
    var project: ProjectRef
    var desiredState: js.UndefOr[LaunchStopDesiredState]
    var reason: js.UndefOr[Description]
  }

  object StopLaunchRequest {
    @inline
    def apply(
        launch: LaunchName,
        project: ProjectRef,
        desiredState: js.UndefOr[LaunchStopDesiredState] = js.undefined,
        reason: js.UndefOr[Description] = js.undefined
    ): StopLaunchRequest = {
      val __obj = js.Dynamic.literal(
        "launch" -> launch.asInstanceOf[js.Any],
        "project" -> project.asInstanceOf[js.Any]
      )

      desiredState.foreach(__v => __obj.updateDynamic("desiredState")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopLaunchRequest]
    }
  }

  @js.native
  trait StopLaunchResponse extends js.Object {
    var endedTime: js.UndefOr[Timestamp]
  }

  object StopLaunchResponse {
    @inline
    def apply(
        endedTime: js.UndefOr[Timestamp] = js.undefined
    ): StopLaunchResponse = {
      val __obj = js.Dynamic.literal()
      endedTime.foreach(__v => __obj.updateDynamic("endedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopLaunchResponse]
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
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** A structure that defines one treatment in an experiment. A treatment is a variation of the feature that you are including in the experiment.
    */
  @js.native
  trait Treatment extends js.Object {
    var name: TreatmentName
    var description: js.UndefOr[Description]
    var featureVariations: js.UndefOr[FeatureToVariationMap]
  }

  object Treatment {
    @inline
    def apply(
        name: TreatmentName,
        description: js.UndefOr[Description] = js.undefined,
        featureVariations: js.UndefOr[FeatureToVariationMap] = js.undefined
    ): Treatment = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      featureVariations.foreach(__v => __obj.updateDynamic("featureVariations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Treatment]
    }
  }

  /** A structure that defines one treatment in an experiment. A treatment is a variation of the feature that you are including in the experiment.
    */
  @js.native
  trait TreatmentConfig extends js.Object {
    var feature: FeatureName
    var name: TreatmentName
    var variation: VariationName
    var description: js.UndefOr[Description]
  }

  object TreatmentConfig {
    @inline
    def apply(
        feature: FeatureName,
        name: TreatmentName,
        variation: VariationName,
        description: js.UndefOr[Description] = js.undefined
    ): TreatmentConfig = {
      val __obj = js.Dynamic.literal(
        "feature" -> feature.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "variation" -> variation.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TreatmentConfig]
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
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateExperimentRequest extends js.Object {
    var experiment: ExperimentName
    var project: ProjectRef
    var description: js.UndefOr[Description]
    var metricGoals: js.UndefOr[MetricGoalConfigList]
    var onlineAbConfig: js.UndefOr[OnlineAbConfig]
    var randomizationSalt: js.UndefOr[RandomizationSalt]
    var samplingRate: js.UndefOr[SplitWeight]
    var treatments: js.UndefOr[TreatmentConfigList]
  }

  object UpdateExperimentRequest {
    @inline
    def apply(
        experiment: ExperimentName,
        project: ProjectRef,
        description: js.UndefOr[Description] = js.undefined,
        metricGoals: js.UndefOr[MetricGoalConfigList] = js.undefined,
        onlineAbConfig: js.UndefOr[OnlineAbConfig] = js.undefined,
        randomizationSalt: js.UndefOr[RandomizationSalt] = js.undefined,
        samplingRate: js.UndefOr[SplitWeight] = js.undefined,
        treatments: js.UndefOr[TreatmentConfigList] = js.undefined
    ): UpdateExperimentRequest = {
      val __obj = js.Dynamic.literal(
        "experiment" -> experiment.asInstanceOf[js.Any],
        "project" -> project.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      metricGoals.foreach(__v => __obj.updateDynamic("metricGoals")(__v.asInstanceOf[js.Any]))
      onlineAbConfig.foreach(__v => __obj.updateDynamic("onlineAbConfig")(__v.asInstanceOf[js.Any]))
      randomizationSalt.foreach(__v => __obj.updateDynamic("randomizationSalt")(__v.asInstanceOf[js.Any]))
      samplingRate.foreach(__v => __obj.updateDynamic("samplingRate")(__v.asInstanceOf[js.Any]))
      treatments.foreach(__v => __obj.updateDynamic("treatments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateExperimentRequest]
    }
  }

  @js.native
  trait UpdateExperimentResponse extends js.Object {
    var experiment: Experiment
  }

  object UpdateExperimentResponse {
    @inline
    def apply(
        experiment: Experiment
    ): UpdateExperimentResponse = {
      val __obj = js.Dynamic.literal(
        "experiment" -> experiment.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateExperimentResponse]
    }
  }

  @js.native
  trait UpdateFeatureRequest extends js.Object {
    var feature: FeatureName
    var project: ProjectRef
    var addOrUpdateVariations: js.UndefOr[VariationConfigsList]
    var defaultVariation: js.UndefOr[VariationName]
    var description: js.UndefOr[Description]
    var entityOverrides: js.UndefOr[EntityOverrideMap]
    var evaluationStrategy: js.UndefOr[FeatureEvaluationStrategy]
    var removeVariations: js.UndefOr[VariationNameList]
  }

  object UpdateFeatureRequest {
    @inline
    def apply(
        feature: FeatureName,
        project: ProjectRef,
        addOrUpdateVariations: js.UndefOr[VariationConfigsList] = js.undefined,
        defaultVariation: js.UndefOr[VariationName] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        entityOverrides: js.UndefOr[EntityOverrideMap] = js.undefined,
        evaluationStrategy: js.UndefOr[FeatureEvaluationStrategy] = js.undefined,
        removeVariations: js.UndefOr[VariationNameList] = js.undefined
    ): UpdateFeatureRequest = {
      val __obj = js.Dynamic.literal(
        "feature" -> feature.asInstanceOf[js.Any],
        "project" -> project.asInstanceOf[js.Any]
      )

      addOrUpdateVariations.foreach(__v => __obj.updateDynamic("addOrUpdateVariations")(__v.asInstanceOf[js.Any]))
      defaultVariation.foreach(__v => __obj.updateDynamic("defaultVariation")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      entityOverrides.foreach(__v => __obj.updateDynamic("entityOverrides")(__v.asInstanceOf[js.Any]))
      evaluationStrategy.foreach(__v => __obj.updateDynamic("evaluationStrategy")(__v.asInstanceOf[js.Any]))
      removeVariations.foreach(__v => __obj.updateDynamic("removeVariations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFeatureRequest]
    }
  }

  @js.native
  trait UpdateFeatureResponse extends js.Object {
    var feature: Feature
  }

  object UpdateFeatureResponse {
    @inline
    def apply(
        feature: Feature
    ): UpdateFeatureResponse = {
      val __obj = js.Dynamic.literal(
        "feature" -> feature.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateFeatureResponse]
    }
  }

  @js.native
  trait UpdateLaunchRequest extends js.Object {
    var launch: LaunchName
    var project: ProjectRef
    var description: js.UndefOr[Description]
    var groups: js.UndefOr[LaunchGroupConfigList]
    var metricMonitors: js.UndefOr[MetricMonitorConfigList]
    var randomizationSalt: js.UndefOr[RandomizationSalt]
    var scheduledSplitsConfig: js.UndefOr[ScheduledSplitsLaunchConfig]
  }

  object UpdateLaunchRequest {
    @inline
    def apply(
        launch: LaunchName,
        project: ProjectRef,
        description: js.UndefOr[Description] = js.undefined,
        groups: js.UndefOr[LaunchGroupConfigList] = js.undefined,
        metricMonitors: js.UndefOr[MetricMonitorConfigList] = js.undefined,
        randomizationSalt: js.UndefOr[RandomizationSalt] = js.undefined,
        scheduledSplitsConfig: js.UndefOr[ScheduledSplitsLaunchConfig] = js.undefined
    ): UpdateLaunchRequest = {
      val __obj = js.Dynamic.literal(
        "launch" -> launch.asInstanceOf[js.Any],
        "project" -> project.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      groups.foreach(__v => __obj.updateDynamic("groups")(__v.asInstanceOf[js.Any]))
      metricMonitors.foreach(__v => __obj.updateDynamic("metricMonitors")(__v.asInstanceOf[js.Any]))
      randomizationSalt.foreach(__v => __obj.updateDynamic("randomizationSalt")(__v.asInstanceOf[js.Any]))
      scheduledSplitsConfig.foreach(__v => __obj.updateDynamic("scheduledSplitsConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLaunchRequest]
    }
  }

  @js.native
  trait UpdateLaunchResponse extends js.Object {
    var launch: Launch
  }

  object UpdateLaunchResponse {
    @inline
    def apply(
        launch: Launch
    ): UpdateLaunchResponse = {
      val __obj = js.Dynamic.literal(
        "launch" -> launch.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateLaunchResponse]
    }
  }

  @js.native
  trait UpdateProjectDataDeliveryRequest extends js.Object {
    var project: ProjectRef
    var cloudWatchLogs: js.UndefOr[CloudWatchLogsDestinationConfig]
    var s3Destination: js.UndefOr[S3DestinationConfig]
  }

  object UpdateProjectDataDeliveryRequest {
    @inline
    def apply(
        project: ProjectRef,
        cloudWatchLogs: js.UndefOr[CloudWatchLogsDestinationConfig] = js.undefined,
        s3Destination: js.UndefOr[S3DestinationConfig] = js.undefined
    ): UpdateProjectDataDeliveryRequest = {
      val __obj = js.Dynamic.literal(
        "project" -> project.asInstanceOf[js.Any]
      )

      cloudWatchLogs.foreach(__v => __obj.updateDynamic("cloudWatchLogs")(__v.asInstanceOf[js.Any]))
      s3Destination.foreach(__v => __obj.updateDynamic("s3Destination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProjectDataDeliveryRequest]
    }
  }

  @js.native
  trait UpdateProjectDataDeliveryResponse extends js.Object {
    var project: Project
  }

  object UpdateProjectDataDeliveryResponse {
    @inline
    def apply(
        project: Project
    ): UpdateProjectDataDeliveryResponse = {
      val __obj = js.Dynamic.literal(
        "project" -> project.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateProjectDataDeliveryResponse]
    }
  }

  @js.native
  trait UpdateProjectRequest extends js.Object {
    var project: ProjectRef
    var description: js.UndefOr[Description]
  }

  object UpdateProjectRequest {
    @inline
    def apply(
        project: ProjectRef,
        description: js.UndefOr[Description] = js.undefined
    ): UpdateProjectRequest = {
      val __obj = js.Dynamic.literal(
        "project" -> project.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProjectRequest]
    }
  }

  @js.native
  trait UpdateProjectResponse extends js.Object {
    var project: Project
  }

  object UpdateProjectResponse {
    @inline
    def apply(
        project: Project
    ): UpdateProjectResponse = {
      val __obj = js.Dynamic.literal(
        "project" -> project.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateProjectResponse]
    }
  }

  /** The value assigned to a feature variation. This structure must contain exactly one field. It can be <code>boolValue</code>, <code>doubleValue</code>, <code>longValue</code>, or <code>stringValue</code>.
    */
  @js.native
  trait VariableValue extends js.Object {
    var boolValue: js.UndefOr[Boolean]
    var doubleValue: js.UndefOr[Double]
    var longValue: js.UndefOr[VariableValueLongValueLong]
    var stringValue: js.UndefOr[VariableValueStringValueString]
  }

  object VariableValue {
    @inline
    def apply(
        boolValue: js.UndefOr[Boolean] = js.undefined,
        doubleValue: js.UndefOr[Double] = js.undefined,
        longValue: js.UndefOr[VariableValueLongValueLong] = js.undefined,
        stringValue: js.UndefOr[VariableValueStringValueString] = js.undefined
    ): VariableValue = {
      val __obj = js.Dynamic.literal()
      boolValue.foreach(__v => __obj.updateDynamic("boolValue")(__v.asInstanceOf[js.Any]))
      doubleValue.foreach(__v => __obj.updateDynamic("doubleValue")(__v.asInstanceOf[js.Any]))
      longValue.foreach(__v => __obj.updateDynamic("longValue")(__v.asInstanceOf[js.Any]))
      stringValue.foreach(__v => __obj.updateDynamic("stringValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VariableValue]
    }
  }

  /** This structure contains the name and variation value of one variation of a feature.
    */
  @js.native
  trait Variation extends js.Object {
    var name: js.UndefOr[VariationName]
    var value: js.UndefOr[VariableValue]
  }

  object Variation {
    @inline
    def apply(
        name: js.UndefOr[VariationName] = js.undefined,
        value: js.UndefOr[VariableValue] = js.undefined
    ): Variation = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Variation]
    }
  }

  /** This structure contains the name and variation value of one variation of a feature.
    */
  @js.native
  trait VariationConfig extends js.Object {
    var name: VariationName
    var value: VariableValue
  }

  object VariationConfig {
    @inline
    def apply(
        name: VariationName,
        value: VariableValue
    ): VariationConfig = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VariationConfig]
    }
  }
}
