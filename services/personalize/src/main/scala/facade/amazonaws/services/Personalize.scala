package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object personalize {
  type AccountId                              = String
  type Arn                                    = String
  type ArnList                                = js.Array[Arn]
  type AvroSchema                             = String
  type Campaigns                              = js.Array[CampaignSummary]
  type CategoricalHyperParameterRanges        = js.Array[CategoricalHyperParameterRange]
  type CategoricalValue                       = String
  type CategoricalValues                      = js.Array[CategoricalValue]
  type ContinuousHyperParameterRanges         = js.Array[ContinuousHyperParameterRange]
  type ContinuousMaxValue                     = Double
  type ContinuousMinValue                     = Double
  type DatasetGroups                          = js.Array[DatasetGroupSummary]
  type DatasetImportJobs                      = js.Array[DatasetImportJobSummary]
  type DatasetType                            = String
  type Datasets                               = js.Array[DatasetSummary]
  type Date                                   = js.Date
  type DefaultCategoricalHyperParameterRanges = js.Array[DefaultCategoricalHyperParameterRange]
  type DefaultContinuousHyperParameterRanges  = js.Array[DefaultContinuousHyperParameterRange]
  type DefaultIntegerHyperParameterRanges     = js.Array[DefaultIntegerHyperParameterRange]
  type Description                            = String
  type DockerURI                              = String
  type EventTrackers                          = js.Array[EventTrackerSummary]
  type EventType                              = String
  type EventValueThreshold                    = String
  type FailureReason                          = String
  type FeatureTransformationParameters        = js.Dictionary[ParameterValue]
  type FeaturizationParameters                = js.Dictionary[ParameterValue]
  type HPOObjectiveType                       = String
  type HPOResource                            = String
  type HyperParameters                        = js.Dictionary[ParameterValue]
  type IntegerHyperParameterRanges            = js.Array[IntegerHyperParameterRange]
  type IntegerMaxValue                        = Int
  type IntegerMinValue                        = Int
  type KmsKeyArn                              = String
  type MaxResults                             = Int
  type MetricName                             = String
  type MetricRegex                            = String
  type MetricValue                            = Double
  type Metrics                                = js.Dictionary[MetricValue]
  type Name                                   = String
  type NextToken                              = String
  type ParameterName                          = String
  type ParameterValue                         = String
  type PerformAutoML                          = Boolean
  type PerformHPO                             = Boolean
  type RecipeProvider                         = String
  type RecipeType                             = String
  type Recipes                                = js.Array[RecipeSummary]
  type ResourceConfig                         = js.Dictionary[ParameterValue]
  type RoleArn                                = String
  type S3Location                             = String
  type Schemas                                = js.Array[DatasetSchemaSummary]
  type SolutionVersions                       = js.Array[SolutionVersionSummary]
  type Solutions                              = js.Array[SolutionSummary]
  type Status                                 = String
  type TrackingId                             = String
  type TrainingInputMode                      = String
  type TransactionsPerSecond                  = Int
  type Tunable                                = Boolean

  implicit final class PersonalizeOps(private val service: Personalize) extends AnyVal {

    def createCampaignFuture(params: CreateCampaignRequest): Future[CreateCampaignResponse] =
      service.createCampaign(params).promise.toFuture
    def createDatasetFuture(params: CreateDatasetRequest): Future[CreateDatasetResponse] =
      service.createDataset(params).promise.toFuture
    def createDatasetGroupFuture(params: CreateDatasetGroupRequest): Future[CreateDatasetGroupResponse] =
      service.createDatasetGroup(params).promise.toFuture
    def createDatasetImportJobFuture(params: CreateDatasetImportJobRequest): Future[CreateDatasetImportJobResponse] =
      service.createDatasetImportJob(params).promise.toFuture
    def createEventTrackerFuture(params: CreateEventTrackerRequest): Future[CreateEventTrackerResponse] =
      service.createEventTracker(params).promise.toFuture
    def createSchemaFuture(params: CreateSchemaRequest): Future[CreateSchemaResponse] =
      service.createSchema(params).promise.toFuture
    def createSolutionFuture(params: CreateSolutionRequest): Future[CreateSolutionResponse] =
      service.createSolution(params).promise.toFuture
    def createSolutionVersionFuture(params: CreateSolutionVersionRequest): Future[CreateSolutionVersionResponse] =
      service.createSolutionVersion(params).promise.toFuture
    def deleteCampaignFuture(params: DeleteCampaignRequest): Future[js.Object] =
      service.deleteCampaign(params).promise.toFuture
    def deleteDatasetFuture(params: DeleteDatasetRequest): Future[js.Object] =
      service.deleteDataset(params).promise.toFuture
    def deleteDatasetGroupFuture(params: DeleteDatasetGroupRequest): Future[js.Object] =
      service.deleteDatasetGroup(params).promise.toFuture
    def deleteEventTrackerFuture(params: DeleteEventTrackerRequest): Future[js.Object] =
      service.deleteEventTracker(params).promise.toFuture
    def deleteSchemaFuture(params: DeleteSchemaRequest): Future[js.Object] =
      service.deleteSchema(params).promise.toFuture
    def deleteSolutionFuture(params: DeleteSolutionRequest): Future[js.Object] =
      service.deleteSolution(params).promise.toFuture
    def describeAlgorithmFuture(params: DescribeAlgorithmRequest): Future[DescribeAlgorithmResponse] =
      service.describeAlgorithm(params).promise.toFuture
    def describeCampaignFuture(params: DescribeCampaignRequest): Future[DescribeCampaignResponse] =
      service.describeCampaign(params).promise.toFuture
    def describeDatasetFuture(params: DescribeDatasetRequest): Future[DescribeDatasetResponse] =
      service.describeDataset(params).promise.toFuture
    def describeDatasetGroupFuture(params: DescribeDatasetGroupRequest): Future[DescribeDatasetGroupResponse] =
      service.describeDatasetGroup(params).promise.toFuture
    def describeDatasetImportJobFuture(
        params: DescribeDatasetImportJobRequest
    ): Future[DescribeDatasetImportJobResponse] = service.describeDatasetImportJob(params).promise.toFuture
    def describeEventTrackerFuture(params: DescribeEventTrackerRequest): Future[DescribeEventTrackerResponse] =
      service.describeEventTracker(params).promise.toFuture
    def describeFeatureTransformationFuture(
        params: DescribeFeatureTransformationRequest
    ): Future[DescribeFeatureTransformationResponse] = service.describeFeatureTransformation(params).promise.toFuture
    def describeRecipeFuture(params: DescribeRecipeRequest): Future[DescribeRecipeResponse] =
      service.describeRecipe(params).promise.toFuture
    def describeSchemaFuture(params: DescribeSchemaRequest): Future[DescribeSchemaResponse] =
      service.describeSchema(params).promise.toFuture
    def describeSolutionFuture(params: DescribeSolutionRequest): Future[DescribeSolutionResponse] =
      service.describeSolution(params).promise.toFuture
    def describeSolutionVersionFuture(params: DescribeSolutionVersionRequest): Future[DescribeSolutionVersionResponse] =
      service.describeSolutionVersion(params).promise.toFuture
    def getSolutionMetricsFuture(params: GetSolutionMetricsRequest): Future[GetSolutionMetricsResponse] =
      service.getSolutionMetrics(params).promise.toFuture
    def listCampaignsFuture(params: ListCampaignsRequest): Future[ListCampaignsResponse] =
      service.listCampaigns(params).promise.toFuture
    def listDatasetGroupsFuture(params: ListDatasetGroupsRequest): Future[ListDatasetGroupsResponse] =
      service.listDatasetGroups(params).promise.toFuture
    def listDatasetImportJobsFuture(params: ListDatasetImportJobsRequest): Future[ListDatasetImportJobsResponse] =
      service.listDatasetImportJobs(params).promise.toFuture
    def listDatasetsFuture(params: ListDatasetsRequest): Future[ListDatasetsResponse] =
      service.listDatasets(params).promise.toFuture
    def listEventTrackersFuture(params: ListEventTrackersRequest): Future[ListEventTrackersResponse] =
      service.listEventTrackers(params).promise.toFuture
    def listRecipesFuture(params: ListRecipesRequest): Future[ListRecipesResponse] =
      service.listRecipes(params).promise.toFuture
    def listSchemasFuture(params: ListSchemasRequest): Future[ListSchemasResponse] =
      service.listSchemas(params).promise.toFuture
    def listSolutionVersionsFuture(params: ListSolutionVersionsRequest): Future[ListSolutionVersionsResponse] =
      service.listSolutionVersions(params).promise.toFuture
    def listSolutionsFuture(params: ListSolutionsRequest): Future[ListSolutionsResponse] =
      service.listSolutions(params).promise.toFuture
    def updateCampaignFuture(params: UpdateCampaignRequest): Future[UpdateCampaignResponse] =
      service.updateCampaign(params).promise.toFuture
  }
}

package personalize {
  @js.native
  @JSImport("aws-sdk", "Personalize")
  class Personalize() extends js.Object {
    def this(config: AWSConfig) = this()

    def createCampaign(params: CreateCampaignRequest): Request[CreateCampaignResponse]             = js.native
    def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse]                = js.native
    def createDatasetGroup(params: CreateDatasetGroupRequest): Request[CreateDatasetGroupResponse] = js.native
    def createDatasetImportJob(params: CreateDatasetImportJobRequest): Request[CreateDatasetImportJobResponse] =
      js.native
    def createEventTracker(params: CreateEventTrackerRequest): Request[CreateEventTrackerResponse]          = js.native
    def createSchema(params: CreateSchemaRequest): Request[CreateSchemaResponse]                            = js.native
    def createSolution(params: CreateSolutionRequest): Request[CreateSolutionResponse]                      = js.native
    def createSolutionVersion(params: CreateSolutionVersionRequest): Request[CreateSolutionVersionResponse] = js.native
    def deleteCampaign(params: DeleteCampaignRequest): Request[js.Object]                                   = js.native
    def deleteDataset(params: DeleteDatasetRequest): Request[js.Object]                                     = js.native
    def deleteDatasetGroup(params: DeleteDatasetGroupRequest): Request[js.Object]                           = js.native
    def deleteEventTracker(params: DeleteEventTrackerRequest): Request[js.Object]                           = js.native
    def deleteSchema(params: DeleteSchemaRequest): Request[js.Object]                                       = js.native
    def deleteSolution(params: DeleteSolutionRequest): Request[js.Object]                                   = js.native
    def describeAlgorithm(params: DescribeAlgorithmRequest): Request[DescribeAlgorithmResponse]             = js.native
    def describeCampaign(params: DescribeCampaignRequest): Request[DescribeCampaignResponse]                = js.native
    def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse]                   = js.native
    def describeDatasetGroup(params: DescribeDatasetGroupRequest): Request[DescribeDatasetGroupResponse]    = js.native
    def describeDatasetImportJob(params: DescribeDatasetImportJobRequest): Request[DescribeDatasetImportJobResponse] =
      js.native
    def describeEventTracker(params: DescribeEventTrackerRequest): Request[DescribeEventTrackerResponse] = js.native
    def describeFeatureTransformation(
        params: DescribeFeatureTransformationRequest
    ): Request[DescribeFeatureTransformationResponse]                                        = js.native
    def describeRecipe(params: DescribeRecipeRequest): Request[DescribeRecipeResponse]       = js.native
    def describeSchema(params: DescribeSchemaRequest): Request[DescribeSchemaResponse]       = js.native
    def describeSolution(params: DescribeSolutionRequest): Request[DescribeSolutionResponse] = js.native
    def describeSolutionVersion(params: DescribeSolutionVersionRequest): Request[DescribeSolutionVersionResponse] =
      js.native
    def getSolutionMetrics(params: GetSolutionMetricsRequest): Request[GetSolutionMetricsResponse]          = js.native
    def listCampaigns(params: ListCampaignsRequest): Request[ListCampaignsResponse]                         = js.native
    def listDatasetGroups(params: ListDatasetGroupsRequest): Request[ListDatasetGroupsResponse]             = js.native
    def listDatasetImportJobs(params: ListDatasetImportJobsRequest): Request[ListDatasetImportJobsResponse] = js.native
    def listDatasets(params: ListDatasetsRequest): Request[ListDatasetsResponse]                            = js.native
    def listEventTrackers(params: ListEventTrackersRequest): Request[ListEventTrackersResponse]             = js.native
    def listRecipes(params: ListRecipesRequest): Request[ListRecipesResponse]                               = js.native
    def listSchemas(params: ListSchemasRequest): Request[ListSchemasResponse]                               = js.native
    def listSolutionVersions(params: ListSolutionVersionsRequest): Request[ListSolutionVersionsResponse]    = js.native
    def listSolutions(params: ListSolutionsRequest): Request[ListSolutionsResponse]                         = js.native
    def updateCampaign(params: UpdateCampaignRequest): Request[UpdateCampaignResponse]                      = js.native
  }

  /**
    * Describes a custom algorithm.
    */
  @js.native
  trait Algorithm extends js.Object {
    var algorithmArn: js.UndefOr[Arn]
    var algorithmImage: js.UndefOr[AlgorithmImage]
    var creationDateTime: js.UndefOr[Date]
    var defaultHyperParameterRanges: js.UndefOr[DefaultHyperParameterRanges]
    var defaultHyperParameters: js.UndefOr[HyperParameters]
    var defaultResourceConfig: js.UndefOr[ResourceConfig]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var name: js.UndefOr[Name]
    var roleArn: js.UndefOr[Arn]
    var trainingInputMode: js.UndefOr[TrainingInputMode]
  }

  object Algorithm {
    def apply(
        algorithmArn: js.UndefOr[Arn] = js.undefined,
        algorithmImage: js.UndefOr[AlgorithmImage] = js.undefined,
        creationDateTime: js.UndefOr[Date] = js.undefined,
        defaultHyperParameterRanges: js.UndefOr[DefaultHyperParameterRanges] = js.undefined,
        defaultHyperParameters: js.UndefOr[HyperParameters] = js.undefined,
        defaultResourceConfig: js.UndefOr[ResourceConfig] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Date] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        roleArn: js.UndefOr[Arn] = js.undefined,
        trainingInputMode: js.UndefOr[TrainingInputMode] = js.undefined
    ): Algorithm = {
      val __obj = js.Dynamic.literal()
      algorithmArn.foreach(__v => __obj.updateDynamic("algorithmArn")(__v.asInstanceOf[js.Any]))
      algorithmImage.foreach(__v => __obj.updateDynamic("algorithmImage")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      defaultHyperParameterRanges.foreach(
        __v => __obj.updateDynamic("defaultHyperParameterRanges")(__v.asInstanceOf[js.Any])
      )
      defaultHyperParameters.foreach(__v => __obj.updateDynamic("defaultHyperParameters")(__v.asInstanceOf[js.Any]))
      defaultResourceConfig.foreach(__v => __obj.updateDynamic("defaultResourceConfig")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      trainingInputMode.foreach(__v => __obj.updateDynamic("trainingInputMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Algorithm]
    }
  }

  /**
    * Describes an algorithm image.
    */
  @js.native
  trait AlgorithmImage extends js.Object {
    var dockerURI: DockerURI
    var name: js.UndefOr[Name]
  }

  object AlgorithmImage {
    def apply(
        dockerURI: DockerURI,
        name: js.UndefOr[Name] = js.undefined
    ): AlgorithmImage = {
      val __obj = js.Dynamic.literal(
        "dockerURI" -> dockerURI.asInstanceOf[js.Any]
      )

      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlgorithmImage]
    }
  }

  /**
    * When the solution performs AutoML (<code>performAutoML</code> is true in <a>CreateSolution</a>), Amazon Personalize determines which recipe, from the specified list, optimizes the given metric. Amazon Personalize then uses that recipe for the solution.
    */
  @js.native
  trait AutoMLConfig extends js.Object {
    var metricName: js.UndefOr[MetricName]
    var recipeList: js.UndefOr[ArnList]
  }

  object AutoMLConfig {
    def apply(
        metricName: js.UndefOr[MetricName] = js.undefined,
        recipeList: js.UndefOr[ArnList] = js.undefined
    ): AutoMLConfig = {
      val __obj = js.Dynamic.literal()
      metricName.foreach(__v => __obj.updateDynamic("metricName")(__v.asInstanceOf[js.Any]))
      recipeList.foreach(__v => __obj.updateDynamic("recipeList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoMLConfig]
    }
  }

  /**
    * When the solution performs AutoML (<code>performAutoML</code> is true in <a>CreateSolution</a>), specifies the recipe that best optimized the specified metric.
    */
  @js.native
  trait AutoMLResult extends js.Object {
    var bestRecipeArn: js.UndefOr[Arn]
  }

  object AutoMLResult {
    def apply(
        bestRecipeArn: js.UndefOr[Arn] = js.undefined
    ): AutoMLResult = {
      val __obj = js.Dynamic.literal()
      bestRecipeArn.foreach(__v => __obj.updateDynamic("bestRecipeArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoMLResult]
    }
  }

  /**
    * Describes a deployed solution version, otherwise known as a campaign. For more information on campaigns, see <a>CreateCampaign</a>.
    */
  @js.native
  trait Campaign extends js.Object {
    var campaignArn: js.UndefOr[Arn]
    var creationDateTime: js.UndefOr[Date]
    var failureReason: js.UndefOr[FailureReason]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var latestCampaignUpdate: js.UndefOr[CampaignUpdateSummary]
    var minProvisionedTPS: js.UndefOr[TransactionsPerSecond]
    var name: js.UndefOr[Name]
    var solutionVersionArn: js.UndefOr[Arn]
    var status: js.UndefOr[Status]
  }

  object Campaign {
    def apply(
        campaignArn: js.UndefOr[Arn] = js.undefined,
        creationDateTime: js.UndefOr[Date] = js.undefined,
        failureReason: js.UndefOr[FailureReason] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Date] = js.undefined,
        latestCampaignUpdate: js.UndefOr[CampaignUpdateSummary] = js.undefined,
        minProvisionedTPS: js.UndefOr[TransactionsPerSecond] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        solutionVersionArn: js.UndefOr[Arn] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): Campaign = {
      val __obj = js.Dynamic.literal()
      campaignArn.foreach(__v => __obj.updateDynamic("campaignArn")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      latestCampaignUpdate.foreach(__v => __obj.updateDynamic("latestCampaignUpdate")(__v.asInstanceOf[js.Any]))
      minProvisionedTPS.foreach(__v => __obj.updateDynamic("minProvisionedTPS")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      solutionVersionArn.foreach(__v => __obj.updateDynamic("solutionVersionArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Campaign]
    }
  }

  /**
    * Provides a summary of the properties of a campaign. For a complete listing, call the <a>DescribeCampaign</a> API.
    */
  @js.native
  trait CampaignSummary extends js.Object {
    var campaignArn: js.UndefOr[Arn]
    var creationDateTime: js.UndefOr[Date]
    var failureReason: js.UndefOr[FailureReason]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var name: js.UndefOr[Name]
    var status: js.UndefOr[Status]
  }

  object CampaignSummary {
    def apply(
        campaignArn: js.UndefOr[Arn] = js.undefined,
        creationDateTime: js.UndefOr[Date] = js.undefined,
        failureReason: js.UndefOr[FailureReason] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Date] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): CampaignSummary = {
      val __obj = js.Dynamic.literal()
      campaignArn.foreach(__v => __obj.updateDynamic("campaignArn")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CampaignSummary]
    }
  }

  /**
    * Provides a summary of the properties of a campaign update. For a complete listing, call the <a>DescribeCampaign</a> API.
    */
  @js.native
  trait CampaignUpdateSummary extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var failureReason: js.UndefOr[FailureReason]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var minProvisionedTPS: js.UndefOr[TransactionsPerSecond]
    var solutionVersionArn: js.UndefOr[Arn]
    var status: js.UndefOr[Status]
  }

  object CampaignUpdateSummary {
    def apply(
        creationDateTime: js.UndefOr[Date] = js.undefined,
        failureReason: js.UndefOr[FailureReason] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Date] = js.undefined,
        minProvisionedTPS: js.UndefOr[TransactionsPerSecond] = js.undefined,
        solutionVersionArn: js.UndefOr[Arn] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): CampaignUpdateSummary = {
      val __obj = js.Dynamic.literal()
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      minProvisionedTPS.foreach(__v => __obj.updateDynamic("minProvisionedTPS")(__v.asInstanceOf[js.Any]))
      solutionVersionArn.foreach(__v => __obj.updateDynamic("solutionVersionArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CampaignUpdateSummary]
    }
  }

  /**
    * Provides the name and range of a categorical hyperparameter.
    */
  @js.native
  trait CategoricalHyperParameterRange extends js.Object {
    var name: js.UndefOr[ParameterName]
    var values: js.UndefOr[CategoricalValues]
  }

  object CategoricalHyperParameterRange {
    def apply(
        name: js.UndefOr[ParameterName] = js.undefined,
        values: js.UndefOr[CategoricalValues] = js.undefined
    ): CategoricalHyperParameterRange = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CategoricalHyperParameterRange]
    }
  }

  /**
    * Provides the name and range of a continuous hyperparameter.
    */
  @js.native
  trait ContinuousHyperParameterRange extends js.Object {
    var maxValue: js.UndefOr[ContinuousMaxValue]
    var minValue: js.UndefOr[ContinuousMinValue]
    var name: js.UndefOr[ParameterName]
  }

  object ContinuousHyperParameterRange {
    def apply(
        maxValue: js.UndefOr[ContinuousMaxValue] = js.undefined,
        minValue: js.UndefOr[ContinuousMinValue] = js.undefined,
        name: js.UndefOr[ParameterName] = js.undefined
    ): ContinuousHyperParameterRange = {
      val __obj = js.Dynamic.literal()
      maxValue.foreach(__v => __obj.updateDynamic("maxValue")(__v.asInstanceOf[js.Any]))
      minValue.foreach(__v => __obj.updateDynamic("minValue")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContinuousHyperParameterRange]
    }
  }

  @js.native
  trait CreateCampaignRequest extends js.Object {
    var minProvisionedTPS: TransactionsPerSecond
    var name: Name
    var solutionVersionArn: Arn
  }

  object CreateCampaignRequest {
    def apply(
        minProvisionedTPS: TransactionsPerSecond,
        name: Name,
        solutionVersionArn: Arn
    ): CreateCampaignRequest = {
      val __obj = js.Dynamic.literal(
        "minProvisionedTPS"  -> minProvisionedTPS.asInstanceOf[js.Any],
        "name"               -> name.asInstanceOf[js.Any],
        "solutionVersionArn" -> solutionVersionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateCampaignRequest]
    }
  }

  @js.native
  trait CreateCampaignResponse extends js.Object {
    var campaignArn: js.UndefOr[Arn]
  }

  object CreateCampaignResponse {
    def apply(
        campaignArn: js.UndefOr[Arn] = js.undefined
    ): CreateCampaignResponse = {
      val __obj = js.Dynamic.literal()
      campaignArn.foreach(__v => __obj.updateDynamic("campaignArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCampaignResponse]
    }
  }

  @js.native
  trait CreateDatasetGroupRequest extends js.Object {
    var name: Name
    var kmsKeyArn: js.UndefOr[KmsKeyArn]
    var roleArn: js.UndefOr[RoleArn]
  }

  object CreateDatasetGroupRequest {
    def apply(
        name: Name,
        kmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): CreateDatasetGroupRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      kmsKeyArn.foreach(__v => __obj.updateDynamic("kmsKeyArn")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetGroupRequest]
    }
  }

  @js.native
  trait CreateDatasetGroupResponse extends js.Object {
    var datasetGroupArn: js.UndefOr[Arn]
  }

  object CreateDatasetGroupResponse {
    def apply(
        datasetGroupArn: js.UndefOr[Arn] = js.undefined
    ): CreateDatasetGroupResponse = {
      val __obj = js.Dynamic.literal()
      datasetGroupArn.foreach(__v => __obj.updateDynamic("datasetGroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetGroupResponse]
    }
  }

  @js.native
  trait CreateDatasetImportJobRequest extends js.Object {
    var dataSource: DataSource
    var datasetArn: Arn
    var jobName: Name
    var roleArn: RoleArn
  }

  object CreateDatasetImportJobRequest {
    def apply(
        dataSource: DataSource,
        datasetArn: Arn,
        jobName: Name,
        roleArn: RoleArn
    ): CreateDatasetImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "dataSource" -> dataSource.asInstanceOf[js.Any],
        "datasetArn" -> datasetArn.asInstanceOf[js.Any],
        "jobName"    -> jobName.asInstanceOf[js.Any],
        "roleArn"    -> roleArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateDatasetImportJobRequest]
    }
  }

  @js.native
  trait CreateDatasetImportJobResponse extends js.Object {
    var datasetImportJobArn: js.UndefOr[Arn]
  }

  object CreateDatasetImportJobResponse {
    def apply(
        datasetImportJobArn: js.UndefOr[Arn] = js.undefined
    ): CreateDatasetImportJobResponse = {
      val __obj = js.Dynamic.literal()
      datasetImportJobArn.foreach(__v => __obj.updateDynamic("datasetImportJobArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetImportJobResponse]
    }
  }

  @js.native
  trait CreateDatasetRequest extends js.Object {
    var datasetGroupArn: Arn
    var datasetType: DatasetType
    var name: Name
    var schemaArn: Arn
  }

  object CreateDatasetRequest {
    def apply(
        datasetGroupArn: Arn,
        datasetType: DatasetType,
        name: Name,
        schemaArn: Arn
    ): CreateDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "datasetGroupArn" -> datasetGroupArn.asInstanceOf[js.Any],
        "datasetType"     -> datasetType.asInstanceOf[js.Any],
        "name"            -> name.asInstanceOf[js.Any],
        "schemaArn"       -> schemaArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateDatasetRequest]
    }
  }

  @js.native
  trait CreateDatasetResponse extends js.Object {
    var datasetArn: js.UndefOr[Arn]
  }

  object CreateDatasetResponse {
    def apply(
        datasetArn: js.UndefOr[Arn] = js.undefined
    ): CreateDatasetResponse = {
      val __obj = js.Dynamic.literal()
      datasetArn.foreach(__v => __obj.updateDynamic("datasetArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetResponse]
    }
  }

  @js.native
  trait CreateEventTrackerRequest extends js.Object {
    var datasetGroupArn: Arn
    var name: Name
  }

  object CreateEventTrackerRequest {
    def apply(
        datasetGroupArn: Arn,
        name: Name
    ): CreateEventTrackerRequest = {
      val __obj = js.Dynamic.literal(
        "datasetGroupArn" -> datasetGroupArn.asInstanceOf[js.Any],
        "name"            -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateEventTrackerRequest]
    }
  }

  @js.native
  trait CreateEventTrackerResponse extends js.Object {
    var eventTrackerArn: js.UndefOr[Arn]
    var trackingId: js.UndefOr[TrackingId]
  }

  object CreateEventTrackerResponse {
    def apply(
        eventTrackerArn: js.UndefOr[Arn] = js.undefined,
        trackingId: js.UndefOr[TrackingId] = js.undefined
    ): CreateEventTrackerResponse = {
      val __obj = js.Dynamic.literal()
      eventTrackerArn.foreach(__v => __obj.updateDynamic("eventTrackerArn")(__v.asInstanceOf[js.Any]))
      trackingId.foreach(__v => __obj.updateDynamic("trackingId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEventTrackerResponse]
    }
  }

  @js.native
  trait CreateSchemaRequest extends js.Object {
    var name: Name
    var schema: AvroSchema
  }

  object CreateSchemaRequest {
    def apply(
        name: Name,
        schema: AvroSchema
    ): CreateSchemaRequest = {
      val __obj = js.Dynamic.literal(
        "name"   -> name.asInstanceOf[js.Any],
        "schema" -> schema.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateSchemaRequest]
    }
  }

  @js.native
  trait CreateSchemaResponse extends js.Object {
    var schemaArn: js.UndefOr[Arn]
  }

  object CreateSchemaResponse {
    def apply(
        schemaArn: js.UndefOr[Arn] = js.undefined
    ): CreateSchemaResponse = {
      val __obj = js.Dynamic.literal()
      schemaArn.foreach(__v => __obj.updateDynamic("schemaArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSchemaResponse]
    }
  }

  @js.native
  trait CreateSolutionRequest extends js.Object {
    var datasetGroupArn: Arn
    var name: Name
    var eventType: js.UndefOr[EventType]
    var performAutoML: js.UndefOr[PerformAutoML]
    var performHPO: js.UndefOr[PerformHPO]
    var recipeArn: js.UndefOr[Arn]
    var solutionConfig: js.UndefOr[SolutionConfig]
  }

  object CreateSolutionRequest {
    def apply(
        datasetGroupArn: Arn,
        name: Name,
        eventType: js.UndefOr[EventType] = js.undefined,
        performAutoML: js.UndefOr[PerformAutoML] = js.undefined,
        performHPO: js.UndefOr[PerformHPO] = js.undefined,
        recipeArn: js.UndefOr[Arn] = js.undefined,
        solutionConfig: js.UndefOr[SolutionConfig] = js.undefined
    ): CreateSolutionRequest = {
      val __obj = js.Dynamic.literal(
        "datasetGroupArn" -> datasetGroupArn.asInstanceOf[js.Any],
        "name"            -> name.asInstanceOf[js.Any]
      )

      eventType.foreach(__v => __obj.updateDynamic("eventType")(__v.asInstanceOf[js.Any]))
      performAutoML.foreach(__v => __obj.updateDynamic("performAutoML")(__v.asInstanceOf[js.Any]))
      performHPO.foreach(__v => __obj.updateDynamic("performHPO")(__v.asInstanceOf[js.Any]))
      recipeArn.foreach(__v => __obj.updateDynamic("recipeArn")(__v.asInstanceOf[js.Any]))
      solutionConfig.foreach(__v => __obj.updateDynamic("solutionConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSolutionRequest]
    }
  }

  @js.native
  trait CreateSolutionResponse extends js.Object {
    var solutionArn: js.UndefOr[Arn]
  }

  object CreateSolutionResponse {
    def apply(
        solutionArn: js.UndefOr[Arn] = js.undefined
    ): CreateSolutionResponse = {
      val __obj = js.Dynamic.literal()
      solutionArn.foreach(__v => __obj.updateDynamic("solutionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSolutionResponse]
    }
  }

  @js.native
  trait CreateSolutionVersionRequest extends js.Object {
    var solutionArn: Arn
  }

  object CreateSolutionVersionRequest {
    def apply(
        solutionArn: Arn
    ): CreateSolutionVersionRequest = {
      val __obj = js.Dynamic.literal(
        "solutionArn" -> solutionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateSolutionVersionRequest]
    }
  }

  @js.native
  trait CreateSolutionVersionResponse extends js.Object {
    var solutionVersionArn: js.UndefOr[Arn]
  }

  object CreateSolutionVersionResponse {
    def apply(
        solutionVersionArn: js.UndefOr[Arn] = js.undefined
    ): CreateSolutionVersionResponse = {
      val __obj = js.Dynamic.literal()
      solutionVersionArn.foreach(__v => __obj.updateDynamic("solutionVersionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSolutionVersionResponse]
    }
  }

  /**
    * Describes the data source that contains the data to upload to a dataset.
    */
  @js.native
  trait DataSource extends js.Object {
    var dataLocation: js.UndefOr[S3Location]
  }

  object DataSource {
    def apply(
        dataLocation: js.UndefOr[S3Location] = js.undefined
    ): DataSource = {
      val __obj = js.Dynamic.literal()
      dataLocation.foreach(__v => __obj.updateDynamic("dataLocation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSource]
    }
  }

  /**
    * Provides metadata for a dataset.
    */
  @js.native
  trait Dataset extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var datasetArn: js.UndefOr[Arn]
    var datasetGroupArn: js.UndefOr[Arn]
    var datasetType: js.UndefOr[DatasetType]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var name: js.UndefOr[Name]
    var schemaArn: js.UndefOr[Arn]
    var status: js.UndefOr[Status]
  }

  object Dataset {
    def apply(
        creationDateTime: js.UndefOr[Date] = js.undefined,
        datasetArn: js.UndefOr[Arn] = js.undefined,
        datasetGroupArn: js.UndefOr[Arn] = js.undefined,
        datasetType: js.UndefOr[DatasetType] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Date] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        schemaArn: js.UndefOr[Arn] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): Dataset = {
      val __obj = js.Dynamic.literal()
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      datasetArn.foreach(__v => __obj.updateDynamic("datasetArn")(__v.asInstanceOf[js.Any]))
      datasetGroupArn.foreach(__v => __obj.updateDynamic("datasetGroupArn")(__v.asInstanceOf[js.Any]))
      datasetType.foreach(__v => __obj.updateDynamic("datasetType")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      schemaArn.foreach(__v => __obj.updateDynamic("schemaArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Dataset]
    }
  }

  /**
    * A dataset group is a collection of related datasets (Interactions, User, and Item). You create a dataset group by calling <a>CreateDatasetGroup</a>. You then create a dataset and add it to a dataset group by calling <a>CreateDataset</a>. The dataset group is used to create and train a solution by calling <a>CreateSolution</a>. A dataset group can contain only one of each type of dataset.
    *  You can specify an AWS Key Management Service (KMS) key to encrypt the datasets in the group.
    */
  @js.native
  trait DatasetGroup extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var datasetGroupArn: js.UndefOr[Arn]
    var failureReason: js.UndefOr[FailureReason]
    var kmsKeyArn: js.UndefOr[KmsKeyArn]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var name: js.UndefOr[Name]
    var roleArn: js.UndefOr[RoleArn]
    var status: js.UndefOr[Status]
  }

  object DatasetGroup {
    def apply(
        creationDateTime: js.UndefOr[Date] = js.undefined,
        datasetGroupArn: js.UndefOr[Arn] = js.undefined,
        failureReason: js.UndefOr[FailureReason] = js.undefined,
        kmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Date] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): DatasetGroup = {
      val __obj = js.Dynamic.literal()
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      datasetGroupArn.foreach(__v => __obj.updateDynamic("datasetGroupArn")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      kmsKeyArn.foreach(__v => __obj.updateDynamic("kmsKeyArn")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetGroup]
    }
  }

  /**
    * Provides a summary of the properties of a dataset group. For a complete listing, call the <a>DescribeDatasetGroup</a> API.
    */
  @js.native
  trait DatasetGroupSummary extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var datasetGroupArn: js.UndefOr[Arn]
    var failureReason: js.UndefOr[FailureReason]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var name: js.UndefOr[Name]
    var status: js.UndefOr[Status]
  }

  object DatasetGroupSummary {
    def apply(
        creationDateTime: js.UndefOr[Date] = js.undefined,
        datasetGroupArn: js.UndefOr[Arn] = js.undefined,
        failureReason: js.UndefOr[FailureReason] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Date] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): DatasetGroupSummary = {
      val __obj = js.Dynamic.literal()
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      datasetGroupArn.foreach(__v => __obj.updateDynamic("datasetGroupArn")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetGroupSummary]
    }
  }

  /**
    * Describes a job that imports training data from a data source (Amazon S3 bucket) to an Amazon Personalize dataset. For more information, see <a>CreateDatasetImportJob</a>.
    *  A dataset import job can be in one of the following states:
    * * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
    */
  @js.native
  trait DatasetImportJob extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var dataSource: js.UndefOr[DataSource]
    var datasetArn: js.UndefOr[Arn]
    var datasetImportJobArn: js.UndefOr[Arn]
    var failureReason: js.UndefOr[FailureReason]
    var jobName: js.UndefOr[Name]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var roleArn: js.UndefOr[Arn]
    var status: js.UndefOr[Status]
  }

  object DatasetImportJob {
    def apply(
        creationDateTime: js.UndefOr[Date] = js.undefined,
        dataSource: js.UndefOr[DataSource] = js.undefined,
        datasetArn: js.UndefOr[Arn] = js.undefined,
        datasetImportJobArn: js.UndefOr[Arn] = js.undefined,
        failureReason: js.UndefOr[FailureReason] = js.undefined,
        jobName: js.UndefOr[Name] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Date] = js.undefined,
        roleArn: js.UndefOr[Arn] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): DatasetImportJob = {
      val __obj = js.Dynamic.literal()
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      dataSource.foreach(__v => __obj.updateDynamic("dataSource")(__v.asInstanceOf[js.Any]))
      datasetArn.foreach(__v => __obj.updateDynamic("datasetArn")(__v.asInstanceOf[js.Any]))
      datasetImportJobArn.foreach(__v => __obj.updateDynamic("datasetImportJobArn")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      jobName.foreach(__v => __obj.updateDynamic("jobName")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetImportJob]
    }
  }

  /**
    * Provides a summary of the properties of a dataset import job. For a complete listing, call the <a>DescribeDatasetImportJob</a> API.
    */
  @js.native
  trait DatasetImportJobSummary extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var datasetImportJobArn: js.UndefOr[Arn]
    var failureReason: js.UndefOr[FailureReason]
    var jobName: js.UndefOr[Name]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var status: js.UndefOr[Status]
  }

  object DatasetImportJobSummary {
    def apply(
        creationDateTime: js.UndefOr[Date] = js.undefined,
        datasetImportJobArn: js.UndefOr[Arn] = js.undefined,
        failureReason: js.UndefOr[FailureReason] = js.undefined,
        jobName: js.UndefOr[Name] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Date] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): DatasetImportJobSummary = {
      val __obj = js.Dynamic.literal()
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      datasetImportJobArn.foreach(__v => __obj.updateDynamic("datasetImportJobArn")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      jobName.foreach(__v => __obj.updateDynamic("jobName")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetImportJobSummary]
    }
  }

  /**
    * Describes the schema for a dataset. For more information on schemas, see <a>CreateSchema</a>.
    */
  @js.native
  trait DatasetSchema extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var name: js.UndefOr[Name]
    var schema: js.UndefOr[AvroSchema]
    var schemaArn: js.UndefOr[Arn]
  }

  object DatasetSchema {
    def apply(
        creationDateTime: js.UndefOr[Date] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Date] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        schema: js.UndefOr[AvroSchema] = js.undefined,
        schemaArn: js.UndefOr[Arn] = js.undefined
    ): DatasetSchema = {
      val __obj = js.Dynamic.literal()
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      schema.foreach(__v => __obj.updateDynamic("schema")(__v.asInstanceOf[js.Any]))
      schemaArn.foreach(__v => __obj.updateDynamic("schemaArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetSchema]
    }
  }

  /**
    * Provides a summary of the properties of a dataset schema. For a complete listing, call the <a>DescribeSchema</a> API.
    */
  @js.native
  trait DatasetSchemaSummary extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var name: js.UndefOr[Name]
    var schemaArn: js.UndefOr[Arn]
  }

  object DatasetSchemaSummary {
    def apply(
        creationDateTime: js.UndefOr[Date] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Date] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        schemaArn: js.UndefOr[Arn] = js.undefined
    ): DatasetSchemaSummary = {
      val __obj = js.Dynamic.literal()
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      schemaArn.foreach(__v => __obj.updateDynamic("schemaArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetSchemaSummary]
    }
  }

  /**
    * Provides a summary of the properties of a dataset. For a complete listing, call the <a>DescribeDataset</a> API.
    */
  @js.native
  trait DatasetSummary extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var datasetArn: js.UndefOr[Arn]
    var datasetType: js.UndefOr[DatasetType]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var name: js.UndefOr[Name]
    var status: js.UndefOr[Status]
  }

  object DatasetSummary {
    def apply(
        creationDateTime: js.UndefOr[Date] = js.undefined,
        datasetArn: js.UndefOr[Arn] = js.undefined,
        datasetType: js.UndefOr[DatasetType] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Date] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): DatasetSummary = {
      val __obj = js.Dynamic.literal()
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      datasetArn.foreach(__v => __obj.updateDynamic("datasetArn")(__v.asInstanceOf[js.Any]))
      datasetType.foreach(__v => __obj.updateDynamic("datasetType")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetSummary]
    }
  }

  /**
    * Provides the name and default range of a categorical hyperparameter and whether the hyperparameter is tunable. A tunable hyperparameter can have its value determined during hyperparameter optimization (HPO).
    */
  @js.native
  trait DefaultCategoricalHyperParameterRange extends js.Object {
    var isTunable: js.UndefOr[Tunable]
    var name: js.UndefOr[ParameterName]
    var values: js.UndefOr[CategoricalValues]
  }

  object DefaultCategoricalHyperParameterRange {
    def apply(
        isTunable: js.UndefOr[Tunable] = js.undefined,
        name: js.UndefOr[ParameterName] = js.undefined,
        values: js.UndefOr[CategoricalValues] = js.undefined
    ): DefaultCategoricalHyperParameterRange = {
      val __obj = js.Dynamic.literal()
      isTunable.foreach(__v => __obj.updateDynamic("isTunable")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefaultCategoricalHyperParameterRange]
    }
  }

  /**
    * Provides the name and default range of a continuous hyperparameter and whether the hyperparameter is tunable. A tunable hyperparameter can have its value determined during hyperparameter optimization (HPO).
    */
  @js.native
  trait DefaultContinuousHyperParameterRange extends js.Object {
    var isTunable: js.UndefOr[Tunable]
    var maxValue: js.UndefOr[ContinuousMaxValue]
    var minValue: js.UndefOr[ContinuousMinValue]
    var name: js.UndefOr[ParameterName]
  }

  object DefaultContinuousHyperParameterRange {
    def apply(
        isTunable: js.UndefOr[Tunable] = js.undefined,
        maxValue: js.UndefOr[ContinuousMaxValue] = js.undefined,
        minValue: js.UndefOr[ContinuousMinValue] = js.undefined,
        name: js.UndefOr[ParameterName] = js.undefined
    ): DefaultContinuousHyperParameterRange = {
      val __obj = js.Dynamic.literal()
      isTunable.foreach(__v => __obj.updateDynamic("isTunable")(__v.asInstanceOf[js.Any]))
      maxValue.foreach(__v => __obj.updateDynamic("maxValue")(__v.asInstanceOf[js.Any]))
      minValue.foreach(__v => __obj.updateDynamic("minValue")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefaultContinuousHyperParameterRange]
    }
  }

  /**
    * Specifies the hyperparameters and their default ranges. Hyperparameters can be categorical, continuous, or integer-valued.
    */
  @js.native
  trait DefaultHyperParameterRanges extends js.Object {
    var categoricalHyperParameterRanges: js.UndefOr[DefaultCategoricalHyperParameterRanges]
    var continuousHyperParameterRanges: js.UndefOr[DefaultContinuousHyperParameterRanges]
    var integerHyperParameterRanges: js.UndefOr[DefaultIntegerHyperParameterRanges]
  }

  object DefaultHyperParameterRanges {
    def apply(
        categoricalHyperParameterRanges: js.UndefOr[DefaultCategoricalHyperParameterRanges] = js.undefined,
        continuousHyperParameterRanges: js.UndefOr[DefaultContinuousHyperParameterRanges] = js.undefined,
        integerHyperParameterRanges: js.UndefOr[DefaultIntegerHyperParameterRanges] = js.undefined
    ): DefaultHyperParameterRanges = {
      val __obj = js.Dynamic.literal()
      categoricalHyperParameterRanges.foreach(
        __v => __obj.updateDynamic("categoricalHyperParameterRanges")(__v.asInstanceOf[js.Any])
      )
      continuousHyperParameterRanges.foreach(
        __v => __obj.updateDynamic("continuousHyperParameterRanges")(__v.asInstanceOf[js.Any])
      )
      integerHyperParameterRanges.foreach(
        __v => __obj.updateDynamic("integerHyperParameterRanges")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DefaultHyperParameterRanges]
    }
  }

  /**
    * Provides the name and default range of a integer-valued hyperparameter and whether the hyperparameter is tunable. A tunable hyperparameter can have its value determined during hyperparameter optimization (HPO).
    */
  @js.native
  trait DefaultIntegerHyperParameterRange extends js.Object {
    var isTunable: js.UndefOr[Tunable]
    var maxValue: js.UndefOr[IntegerMaxValue]
    var minValue: js.UndefOr[IntegerMinValue]
    var name: js.UndefOr[ParameterName]
  }

  object DefaultIntegerHyperParameterRange {
    def apply(
        isTunable: js.UndefOr[Tunable] = js.undefined,
        maxValue: js.UndefOr[IntegerMaxValue] = js.undefined,
        minValue: js.UndefOr[IntegerMinValue] = js.undefined,
        name: js.UndefOr[ParameterName] = js.undefined
    ): DefaultIntegerHyperParameterRange = {
      val __obj = js.Dynamic.literal()
      isTunable.foreach(__v => __obj.updateDynamic("isTunable")(__v.asInstanceOf[js.Any]))
      maxValue.foreach(__v => __obj.updateDynamic("maxValue")(__v.asInstanceOf[js.Any]))
      minValue.foreach(__v => __obj.updateDynamic("minValue")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefaultIntegerHyperParameterRange]
    }
  }

  @js.native
  trait DeleteCampaignRequest extends js.Object {
    var campaignArn: Arn
  }

  object DeleteCampaignRequest {
    def apply(
        campaignArn: Arn
    ): DeleteCampaignRequest = {
      val __obj = js.Dynamic.literal(
        "campaignArn" -> campaignArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteCampaignRequest]
    }
  }

  @js.native
  trait DeleteDatasetGroupRequest extends js.Object {
    var datasetGroupArn: Arn
  }

  object DeleteDatasetGroupRequest {
    def apply(
        datasetGroupArn: Arn
    ): DeleteDatasetGroupRequest = {
      val __obj = js.Dynamic.literal(
        "datasetGroupArn" -> datasetGroupArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDatasetGroupRequest]
    }
  }

  @js.native
  trait DeleteDatasetRequest extends js.Object {
    var datasetArn: Arn
  }

  object DeleteDatasetRequest {
    def apply(
        datasetArn: Arn
    ): DeleteDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "datasetArn" -> datasetArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDatasetRequest]
    }
  }

  @js.native
  trait DeleteEventTrackerRequest extends js.Object {
    var eventTrackerArn: Arn
  }

  object DeleteEventTrackerRequest {
    def apply(
        eventTrackerArn: Arn
    ): DeleteEventTrackerRequest = {
      val __obj = js.Dynamic.literal(
        "eventTrackerArn" -> eventTrackerArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEventTrackerRequest]
    }
  }

  @js.native
  trait DeleteSchemaRequest extends js.Object {
    var schemaArn: Arn
  }

  object DeleteSchemaRequest {
    def apply(
        schemaArn: Arn
    ): DeleteSchemaRequest = {
      val __obj = js.Dynamic.literal(
        "schemaArn" -> schemaArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSchemaRequest]
    }
  }

  @js.native
  trait DeleteSolutionRequest extends js.Object {
    var solutionArn: Arn
  }

  object DeleteSolutionRequest {
    def apply(
        solutionArn: Arn
    ): DeleteSolutionRequest = {
      val __obj = js.Dynamic.literal(
        "solutionArn" -> solutionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSolutionRequest]
    }
  }

  @js.native
  trait DescribeAlgorithmRequest extends js.Object {
    var algorithmArn: Arn
  }

  object DescribeAlgorithmRequest {
    def apply(
        algorithmArn: Arn
    ): DescribeAlgorithmRequest = {
      val __obj = js.Dynamic.literal(
        "algorithmArn" -> algorithmArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeAlgorithmRequest]
    }
  }

  @js.native
  trait DescribeAlgorithmResponse extends js.Object {
    var algorithm: js.UndefOr[Algorithm]
  }

  object DescribeAlgorithmResponse {
    def apply(
        algorithm: js.UndefOr[Algorithm] = js.undefined
    ): DescribeAlgorithmResponse = {
      val __obj = js.Dynamic.literal()
      algorithm.foreach(__v => __obj.updateDynamic("algorithm")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAlgorithmResponse]
    }
  }

  @js.native
  trait DescribeCampaignRequest extends js.Object {
    var campaignArn: Arn
  }

  object DescribeCampaignRequest {
    def apply(
        campaignArn: Arn
    ): DescribeCampaignRequest = {
      val __obj = js.Dynamic.literal(
        "campaignArn" -> campaignArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeCampaignRequest]
    }
  }

  @js.native
  trait DescribeCampaignResponse extends js.Object {
    var campaign: js.UndefOr[Campaign]
  }

  object DescribeCampaignResponse {
    def apply(
        campaign: js.UndefOr[Campaign] = js.undefined
    ): DescribeCampaignResponse = {
      val __obj = js.Dynamic.literal()
      campaign.foreach(__v => __obj.updateDynamic("campaign")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCampaignResponse]
    }
  }

  @js.native
  trait DescribeDatasetGroupRequest extends js.Object {
    var datasetGroupArn: Arn
  }

  object DescribeDatasetGroupRequest {
    def apply(
        datasetGroupArn: Arn
    ): DescribeDatasetGroupRequest = {
      val __obj = js.Dynamic.literal(
        "datasetGroupArn" -> datasetGroupArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeDatasetGroupRequest]
    }
  }

  @js.native
  trait DescribeDatasetGroupResponse extends js.Object {
    var datasetGroup: js.UndefOr[DatasetGroup]
  }

  object DescribeDatasetGroupResponse {
    def apply(
        datasetGroup: js.UndefOr[DatasetGroup] = js.undefined
    ): DescribeDatasetGroupResponse = {
      val __obj = js.Dynamic.literal()
      datasetGroup.foreach(__v => __obj.updateDynamic("datasetGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDatasetGroupResponse]
    }
  }

  @js.native
  trait DescribeDatasetImportJobRequest extends js.Object {
    var datasetImportJobArn: Arn
  }

  object DescribeDatasetImportJobRequest {
    def apply(
        datasetImportJobArn: Arn
    ): DescribeDatasetImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "datasetImportJobArn" -> datasetImportJobArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeDatasetImportJobRequest]
    }
  }

  @js.native
  trait DescribeDatasetImportJobResponse extends js.Object {
    var datasetImportJob: js.UndefOr[DatasetImportJob]
  }

  object DescribeDatasetImportJobResponse {
    def apply(
        datasetImportJob: js.UndefOr[DatasetImportJob] = js.undefined
    ): DescribeDatasetImportJobResponse = {
      val __obj = js.Dynamic.literal()
      datasetImportJob.foreach(__v => __obj.updateDynamic("datasetImportJob")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDatasetImportJobResponse]
    }
  }

  @js.native
  trait DescribeDatasetRequest extends js.Object {
    var datasetArn: Arn
  }

  object DescribeDatasetRequest {
    def apply(
        datasetArn: Arn
    ): DescribeDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "datasetArn" -> datasetArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeDatasetRequest]
    }
  }

  @js.native
  trait DescribeDatasetResponse extends js.Object {
    var dataset: js.UndefOr[Dataset]
  }

  object DescribeDatasetResponse {
    def apply(
        dataset: js.UndefOr[Dataset] = js.undefined
    ): DescribeDatasetResponse = {
      val __obj = js.Dynamic.literal()
      dataset.foreach(__v => __obj.updateDynamic("dataset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDatasetResponse]
    }
  }

  @js.native
  trait DescribeEventTrackerRequest extends js.Object {
    var eventTrackerArn: Arn
  }

  object DescribeEventTrackerRequest {
    def apply(
        eventTrackerArn: Arn
    ): DescribeEventTrackerRequest = {
      val __obj = js.Dynamic.literal(
        "eventTrackerArn" -> eventTrackerArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeEventTrackerRequest]
    }
  }

  @js.native
  trait DescribeEventTrackerResponse extends js.Object {
    var eventTracker: js.UndefOr[EventTracker]
  }

  object DescribeEventTrackerResponse {
    def apply(
        eventTracker: js.UndefOr[EventTracker] = js.undefined
    ): DescribeEventTrackerResponse = {
      val __obj = js.Dynamic.literal()
      eventTracker.foreach(__v => __obj.updateDynamic("eventTracker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventTrackerResponse]
    }
  }

  @js.native
  trait DescribeFeatureTransformationRequest extends js.Object {
    var featureTransformationArn: Arn
  }

  object DescribeFeatureTransformationRequest {
    def apply(
        featureTransformationArn: Arn
    ): DescribeFeatureTransformationRequest = {
      val __obj = js.Dynamic.literal(
        "featureTransformationArn" -> featureTransformationArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeFeatureTransformationRequest]
    }
  }

  @js.native
  trait DescribeFeatureTransformationResponse extends js.Object {
    var featureTransformation: js.UndefOr[FeatureTransformation]
  }

  object DescribeFeatureTransformationResponse {
    def apply(
        featureTransformation: js.UndefOr[FeatureTransformation] = js.undefined
    ): DescribeFeatureTransformationResponse = {
      val __obj = js.Dynamic.literal()
      featureTransformation.foreach(__v => __obj.updateDynamic("featureTransformation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFeatureTransformationResponse]
    }
  }

  @js.native
  trait DescribeRecipeRequest extends js.Object {
    var recipeArn: Arn
  }

  object DescribeRecipeRequest {
    def apply(
        recipeArn: Arn
    ): DescribeRecipeRequest = {
      val __obj = js.Dynamic.literal(
        "recipeArn" -> recipeArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeRecipeRequest]
    }
  }

  @js.native
  trait DescribeRecipeResponse extends js.Object {
    var recipe: js.UndefOr[Recipe]
  }

  object DescribeRecipeResponse {
    def apply(
        recipe: js.UndefOr[Recipe] = js.undefined
    ): DescribeRecipeResponse = {
      val __obj = js.Dynamic.literal()
      recipe.foreach(__v => __obj.updateDynamic("recipe")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRecipeResponse]
    }
  }

  @js.native
  trait DescribeSchemaRequest extends js.Object {
    var schemaArn: Arn
  }

  object DescribeSchemaRequest {
    def apply(
        schemaArn: Arn
    ): DescribeSchemaRequest = {
      val __obj = js.Dynamic.literal(
        "schemaArn" -> schemaArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeSchemaRequest]
    }
  }

  @js.native
  trait DescribeSchemaResponse extends js.Object {
    var schema: js.UndefOr[DatasetSchema]
  }

  object DescribeSchemaResponse {
    def apply(
        schema: js.UndefOr[DatasetSchema] = js.undefined
    ): DescribeSchemaResponse = {
      val __obj = js.Dynamic.literal()
      schema.foreach(__v => __obj.updateDynamic("schema")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSchemaResponse]
    }
  }

  @js.native
  trait DescribeSolutionRequest extends js.Object {
    var solutionArn: Arn
  }

  object DescribeSolutionRequest {
    def apply(
        solutionArn: Arn
    ): DescribeSolutionRequest = {
      val __obj = js.Dynamic.literal(
        "solutionArn" -> solutionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeSolutionRequest]
    }
  }

  @js.native
  trait DescribeSolutionResponse extends js.Object {
    var solution: js.UndefOr[Solution]
  }

  object DescribeSolutionResponse {
    def apply(
        solution: js.UndefOr[Solution] = js.undefined
    ): DescribeSolutionResponse = {
      val __obj = js.Dynamic.literal()
      solution.foreach(__v => __obj.updateDynamic("solution")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSolutionResponse]
    }
  }

  @js.native
  trait DescribeSolutionVersionRequest extends js.Object {
    var solutionVersionArn: Arn
  }

  object DescribeSolutionVersionRequest {
    def apply(
        solutionVersionArn: Arn
    ): DescribeSolutionVersionRequest = {
      val __obj = js.Dynamic.literal(
        "solutionVersionArn" -> solutionVersionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeSolutionVersionRequest]
    }
  }

  @js.native
  trait DescribeSolutionVersionResponse extends js.Object {
    var solutionVersion: js.UndefOr[SolutionVersion]
  }

  object DescribeSolutionVersionResponse {
    def apply(
        solutionVersion: js.UndefOr[SolutionVersion] = js.undefined
    ): DescribeSolutionVersionResponse = {
      val __obj = js.Dynamic.literal()
      solutionVersion.foreach(__v => __obj.updateDynamic("solutionVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSolutionVersionResponse]
    }
  }

  /**
    * Provides information about an event tracker.
    */
  @js.native
  trait EventTracker extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var creationDateTime: js.UndefOr[Date]
    var datasetGroupArn: js.UndefOr[Arn]
    var eventTrackerArn: js.UndefOr[Arn]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var name: js.UndefOr[Name]
    var status: js.UndefOr[Status]
    var trackingId: js.UndefOr[TrackingId]
  }

  object EventTracker {
    def apply(
        accountId: js.UndefOr[AccountId] = js.undefined,
        creationDateTime: js.UndefOr[Date] = js.undefined,
        datasetGroupArn: js.UndefOr[Arn] = js.undefined,
        eventTrackerArn: js.UndefOr[Arn] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Date] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        status: js.UndefOr[Status] = js.undefined,
        trackingId: js.UndefOr[TrackingId] = js.undefined
    ): EventTracker = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      datasetGroupArn.foreach(__v => __obj.updateDynamic("datasetGroupArn")(__v.asInstanceOf[js.Any]))
      eventTrackerArn.foreach(__v => __obj.updateDynamic("eventTrackerArn")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      trackingId.foreach(__v => __obj.updateDynamic("trackingId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventTracker]
    }
  }

  /**
    * Provides a summary of the properties of an event tracker. For a complete listing, call the <a>DescribeEventTracker</a> API.
    */
  @js.native
  trait EventTrackerSummary extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var eventTrackerArn: js.UndefOr[Arn]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var name: js.UndefOr[Name]
    var status: js.UndefOr[Status]
  }

  object EventTrackerSummary {
    def apply(
        creationDateTime: js.UndefOr[Date] = js.undefined,
        eventTrackerArn: js.UndefOr[Arn] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Date] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): EventTrackerSummary = {
      val __obj = js.Dynamic.literal()
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      eventTrackerArn.foreach(__v => __obj.updateDynamic("eventTrackerArn")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventTrackerSummary]
    }
  }

  /**
    * Provides feature transformation information. Feature transformation is the process of modifying raw input data into a form more suitable for model training.
    */
  @js.native
  trait FeatureTransformation extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var defaultParameters: js.UndefOr[FeaturizationParameters]
    var featureTransformationArn: js.UndefOr[Arn]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var name: js.UndefOr[Name]
    var status: js.UndefOr[Status]
  }

  object FeatureTransformation {
    def apply(
        creationDateTime: js.UndefOr[Date] = js.undefined,
        defaultParameters: js.UndefOr[FeaturizationParameters] = js.undefined,
        featureTransformationArn: js.UndefOr[Arn] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Date] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): FeatureTransformation = {
      val __obj = js.Dynamic.literal()
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      defaultParameters.foreach(__v => __obj.updateDynamic("defaultParameters")(__v.asInstanceOf[js.Any]))
      featureTransformationArn.foreach(__v => __obj.updateDynamic("featureTransformationArn")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FeatureTransformation]
    }
  }

  @js.native
  trait GetSolutionMetricsRequest extends js.Object {
    var solutionVersionArn: Arn
  }

  object GetSolutionMetricsRequest {
    def apply(
        solutionVersionArn: Arn
    ): GetSolutionMetricsRequest = {
      val __obj = js.Dynamic.literal(
        "solutionVersionArn" -> solutionVersionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSolutionMetricsRequest]
    }
  }

  @js.native
  trait GetSolutionMetricsResponse extends js.Object {
    var metrics: js.UndefOr[Metrics]
    var solutionVersionArn: js.UndefOr[Arn]
  }

  object GetSolutionMetricsResponse {
    def apply(
        metrics: js.UndefOr[Metrics] = js.undefined,
        solutionVersionArn: js.UndefOr[Arn] = js.undefined
    ): GetSolutionMetricsResponse = {
      val __obj = js.Dynamic.literal()
      metrics.foreach(__v => __obj.updateDynamic("metrics")(__v.asInstanceOf[js.Any]))
      solutionVersionArn.foreach(__v => __obj.updateDynamic("solutionVersionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSolutionMetricsResponse]
    }
  }

  /**
    * Describes the properties for hyperparameter optimization (HPO). For use with the bring-your-own-recipe feature. Do not use for Amazon Personalize native recipes.
    */
  @js.native
  trait HPOConfig extends js.Object {
    var algorithmHyperParameterRanges: js.UndefOr[HyperParameterRanges]
    var hpoObjective: js.UndefOr[HPOObjective]
    var hpoResourceConfig: js.UndefOr[HPOResourceConfig]
  }

  object HPOConfig {
    def apply(
        algorithmHyperParameterRanges: js.UndefOr[HyperParameterRanges] = js.undefined,
        hpoObjective: js.UndefOr[HPOObjective] = js.undefined,
        hpoResourceConfig: js.UndefOr[HPOResourceConfig] = js.undefined
    ): HPOConfig = {
      val __obj = js.Dynamic.literal()
      algorithmHyperParameterRanges.foreach(
        __v => __obj.updateDynamic("algorithmHyperParameterRanges")(__v.asInstanceOf[js.Any])
      )
      hpoObjective.foreach(__v => __obj.updateDynamic("hpoObjective")(__v.asInstanceOf[js.Any]))
      hpoResourceConfig.foreach(__v => __obj.updateDynamic("hpoResourceConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HPOConfig]
    }
  }

  /**
    * The metric to optimize during hyperparameter optimization (HPO).
    */
  @js.native
  trait HPOObjective extends js.Object {
    var metricName: js.UndefOr[MetricName]
    var metricRegex: js.UndefOr[MetricRegex]
    var `type`: js.UndefOr[HPOObjectiveType]
  }

  object HPOObjective {
    def apply(
        metricName: js.UndefOr[MetricName] = js.undefined,
        metricRegex: js.UndefOr[MetricRegex] = js.undefined,
        `type`: js.UndefOr[HPOObjectiveType] = js.undefined
    ): HPOObjective = {
      val __obj = js.Dynamic.literal()
      metricName.foreach(__v => __obj.updateDynamic("metricName")(__v.asInstanceOf[js.Any]))
      metricRegex.foreach(__v => __obj.updateDynamic("metricRegex")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HPOObjective]
    }
  }

  /**
    * Describes the resource configuration for hyperparameter optimization (HPO).
    */
  @js.native
  trait HPOResourceConfig extends js.Object {
    var maxNumberOfTrainingJobs: js.UndefOr[HPOResource]
    var maxParallelTrainingJobs: js.UndefOr[HPOResource]
  }

  object HPOResourceConfig {
    def apply(
        maxNumberOfTrainingJobs: js.UndefOr[HPOResource] = js.undefined,
        maxParallelTrainingJobs: js.UndefOr[HPOResource] = js.undefined
    ): HPOResourceConfig = {
      val __obj = js.Dynamic.literal()
      maxNumberOfTrainingJobs.foreach(__v => __obj.updateDynamic("maxNumberOfTrainingJobs")(__v.asInstanceOf[js.Any]))
      maxParallelTrainingJobs.foreach(__v => __obj.updateDynamic("maxParallelTrainingJobs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HPOResourceConfig]
    }
  }

  /**
    * Specifies the hyperparameters and their ranges. Hyperparameters can be categorical, continuous, or integer-valued.
    */
  @js.native
  trait HyperParameterRanges extends js.Object {
    var categoricalHyperParameterRanges: js.UndefOr[CategoricalHyperParameterRanges]
    var continuousHyperParameterRanges: js.UndefOr[ContinuousHyperParameterRanges]
    var integerHyperParameterRanges: js.UndefOr[IntegerHyperParameterRanges]
  }

  object HyperParameterRanges {
    def apply(
        categoricalHyperParameterRanges: js.UndefOr[CategoricalHyperParameterRanges] = js.undefined,
        continuousHyperParameterRanges: js.UndefOr[ContinuousHyperParameterRanges] = js.undefined,
        integerHyperParameterRanges: js.UndefOr[IntegerHyperParameterRanges] = js.undefined
    ): HyperParameterRanges = {
      val __obj = js.Dynamic.literal()
      categoricalHyperParameterRanges.foreach(
        __v => __obj.updateDynamic("categoricalHyperParameterRanges")(__v.asInstanceOf[js.Any])
      )
      continuousHyperParameterRanges.foreach(
        __v => __obj.updateDynamic("continuousHyperParameterRanges")(__v.asInstanceOf[js.Any])
      )
      integerHyperParameterRanges.foreach(
        __v => __obj.updateDynamic("integerHyperParameterRanges")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[HyperParameterRanges]
    }
  }

  /**
    * Provides the name and range of an integer-valued hyperparameter.
    */
  @js.native
  trait IntegerHyperParameterRange extends js.Object {
    var maxValue: js.UndefOr[IntegerMaxValue]
    var minValue: js.UndefOr[IntegerMinValue]
    var name: js.UndefOr[ParameterName]
  }

  object IntegerHyperParameterRange {
    def apply(
        maxValue: js.UndefOr[IntegerMaxValue] = js.undefined,
        minValue: js.UndefOr[IntegerMinValue] = js.undefined,
        name: js.UndefOr[ParameterName] = js.undefined
    ): IntegerHyperParameterRange = {
      val __obj = js.Dynamic.literal()
      maxValue.foreach(__v => __obj.updateDynamic("maxValue")(__v.asInstanceOf[js.Any]))
      minValue.foreach(__v => __obj.updateDynamic("minValue")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IntegerHyperParameterRange]
    }
  }

  @js.native
  trait ListCampaignsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var solutionArn: js.UndefOr[Arn]
  }

  object ListCampaignsRequest {
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        solutionArn: js.UndefOr[Arn] = js.undefined
    ): ListCampaignsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      solutionArn.foreach(__v => __obj.updateDynamic("solutionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCampaignsRequest]
    }
  }

  @js.native
  trait ListCampaignsResponse extends js.Object {
    var campaigns: js.UndefOr[Campaigns]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListCampaignsResponse {
    def apply(
        campaigns: js.UndefOr[Campaigns] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCampaignsResponse = {
      val __obj = js.Dynamic.literal()
      campaigns.foreach(__v => __obj.updateDynamic("campaigns")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCampaignsResponse]
    }
  }

  @js.native
  trait ListDatasetGroupsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDatasetGroupsRequest {
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatasetGroupsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetGroupsRequest]
    }
  }

  @js.native
  trait ListDatasetGroupsResponse extends js.Object {
    var datasetGroups: js.UndefOr[DatasetGroups]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDatasetGroupsResponse {
    def apply(
        datasetGroups: js.UndefOr[DatasetGroups] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatasetGroupsResponse = {
      val __obj = js.Dynamic.literal()
      datasetGroups.foreach(__v => __obj.updateDynamic("datasetGroups")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetGroupsResponse]
    }
  }

  @js.native
  trait ListDatasetImportJobsRequest extends js.Object {
    var datasetArn: js.UndefOr[Arn]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDatasetImportJobsRequest {
    def apply(
        datasetArn: js.UndefOr[Arn] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatasetImportJobsRequest = {
      val __obj = js.Dynamic.literal()
      datasetArn.foreach(__v => __obj.updateDynamic("datasetArn")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetImportJobsRequest]
    }
  }

  @js.native
  trait ListDatasetImportJobsResponse extends js.Object {
    var datasetImportJobs: js.UndefOr[DatasetImportJobs]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDatasetImportJobsResponse {
    def apply(
        datasetImportJobs: js.UndefOr[DatasetImportJobs] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatasetImportJobsResponse = {
      val __obj = js.Dynamic.literal()
      datasetImportJobs.foreach(__v => __obj.updateDynamic("datasetImportJobs")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetImportJobsResponse]
    }
  }

  @js.native
  trait ListDatasetsRequest extends js.Object {
    var datasetGroupArn: js.UndefOr[Arn]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDatasetsRequest {
    def apply(
        datasetGroupArn: js.UndefOr[Arn] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatasetsRequest = {
      val __obj = js.Dynamic.literal()
      datasetGroupArn.foreach(__v => __obj.updateDynamic("datasetGroupArn")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetsRequest]
    }
  }

  @js.native
  trait ListDatasetsResponse extends js.Object {
    var datasets: js.UndefOr[Datasets]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDatasetsResponse {
    def apply(
        datasets: js.UndefOr[Datasets] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatasetsResponse = {
      val __obj = js.Dynamic.literal()
      datasets.foreach(__v => __obj.updateDynamic("datasets")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetsResponse]
    }
  }

  @js.native
  trait ListEventTrackersRequest extends js.Object {
    var datasetGroupArn: js.UndefOr[Arn]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListEventTrackersRequest {
    def apply(
        datasetGroupArn: js.UndefOr[Arn] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEventTrackersRequest = {
      val __obj = js.Dynamic.literal()
      datasetGroupArn.foreach(__v => __obj.updateDynamic("datasetGroupArn")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventTrackersRequest]
    }
  }

  @js.native
  trait ListEventTrackersResponse extends js.Object {
    var eventTrackers: js.UndefOr[EventTrackers]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListEventTrackersResponse {
    def apply(
        eventTrackers: js.UndefOr[EventTrackers] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEventTrackersResponse = {
      val __obj = js.Dynamic.literal()
      eventTrackers.foreach(__v => __obj.updateDynamic("eventTrackers")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventTrackersResponse]
    }
  }

  @js.native
  trait ListRecipesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var recipeProvider: js.UndefOr[RecipeProvider]
  }

  object ListRecipesRequest {
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        recipeProvider: js.UndefOr[RecipeProvider] = js.undefined
    ): ListRecipesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      recipeProvider.foreach(__v => __obj.updateDynamic("recipeProvider")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecipesRequest]
    }
  }

  @js.native
  trait ListRecipesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var recipes: js.UndefOr[Recipes]
  }

  object ListRecipesResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        recipes: js.UndefOr[Recipes] = js.undefined
    ): ListRecipesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      recipes.foreach(__v => __obj.updateDynamic("recipes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecipesResponse]
    }
  }

  @js.native
  trait ListSchemasRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListSchemasRequest {
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSchemasRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSchemasRequest]
    }
  }

  @js.native
  trait ListSchemasResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var schemas: js.UndefOr[Schemas]
  }

  object ListSchemasResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        schemas: js.UndefOr[Schemas] = js.undefined
    ): ListSchemasResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      schemas.foreach(__v => __obj.updateDynamic("schemas")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSchemasResponse]
    }
  }

  @js.native
  trait ListSolutionVersionsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var solutionArn: js.UndefOr[Arn]
  }

  object ListSolutionVersionsRequest {
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        solutionArn: js.UndefOr[Arn] = js.undefined
    ): ListSolutionVersionsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      solutionArn.foreach(__v => __obj.updateDynamic("solutionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSolutionVersionsRequest]
    }
  }

  @js.native
  trait ListSolutionVersionsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var solutionVersions: js.UndefOr[SolutionVersions]
  }

  object ListSolutionVersionsResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        solutionVersions: js.UndefOr[SolutionVersions] = js.undefined
    ): ListSolutionVersionsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      solutionVersions.foreach(__v => __obj.updateDynamic("solutionVersions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSolutionVersionsResponse]
    }
  }

  @js.native
  trait ListSolutionsRequest extends js.Object {
    var datasetGroupArn: js.UndefOr[Arn]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListSolutionsRequest {
    def apply(
        datasetGroupArn: js.UndefOr[Arn] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSolutionsRequest = {
      val __obj = js.Dynamic.literal()
      datasetGroupArn.foreach(__v => __obj.updateDynamic("datasetGroupArn")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSolutionsRequest]
    }
  }

  @js.native
  trait ListSolutionsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var solutions: js.UndefOr[Solutions]
  }

  object ListSolutionsResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        solutions: js.UndefOr[Solutions] = js.undefined
    ): ListSolutionsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      solutions.foreach(__v => __obj.updateDynamic("solutions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSolutionsResponse]
    }
  }

  /**
    * Provides information about a recipe. Each recipe provides an algorithm that Amazon Personalize uses in model training when you use the <a>CreateSolution</a> operation.
    */
  @js.native
  trait Recipe extends js.Object {
    var algorithmArn: js.UndefOr[Arn]
    var creationDateTime: js.UndefOr[Date]
    var description: js.UndefOr[Description]
    var featureTransformationArn: js.UndefOr[Arn]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var name: js.UndefOr[Name]
    var recipeArn: js.UndefOr[Arn]
    var recipeType: js.UndefOr[RecipeType]
    var status: js.UndefOr[Status]
  }

  object Recipe {
    def apply(
        algorithmArn: js.UndefOr[Arn] = js.undefined,
        creationDateTime: js.UndefOr[Date] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        featureTransformationArn: js.UndefOr[Arn] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Date] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        recipeArn: js.UndefOr[Arn] = js.undefined,
        recipeType: js.UndefOr[RecipeType] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): Recipe = {
      val __obj = js.Dynamic.literal()
      algorithmArn.foreach(__v => __obj.updateDynamic("algorithmArn")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      featureTransformationArn.foreach(__v => __obj.updateDynamic("featureTransformationArn")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      recipeArn.foreach(__v => __obj.updateDynamic("recipeArn")(__v.asInstanceOf[js.Any]))
      recipeType.foreach(__v => __obj.updateDynamic("recipeType")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Recipe]
    }
  }

  object RecipeProviderEnum {
    val SERVICE = "SERVICE"

    val values = js.Object.freeze(js.Array(SERVICE))
  }

  /**
    * Provides a summary of the properties of a recipe. For a complete listing, call the <a>DescribeRecipe</a> API.
    */
  @js.native
  trait RecipeSummary extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var name: js.UndefOr[Name]
    var recipeArn: js.UndefOr[Arn]
    var status: js.UndefOr[Status]
  }

  object RecipeSummary {
    def apply(
        creationDateTime: js.UndefOr[Date] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Date] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        recipeArn: js.UndefOr[Arn] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): RecipeSummary = {
      val __obj = js.Dynamic.literal()
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      recipeArn.foreach(__v => __obj.updateDynamic("recipeArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecipeSummary]
    }
  }

  /**
    * An object that provides information about a solution. A solution is a trained model that can be deployed as a campaign.
    */
  @js.native
  trait Solution extends js.Object {
    var autoMLResult: js.UndefOr[AutoMLResult]
    var creationDateTime: js.UndefOr[Date]
    var datasetGroupArn: js.UndefOr[Arn]
    var eventType: js.UndefOr[EventType]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var latestSolutionVersion: js.UndefOr[SolutionVersionSummary]
    var name: js.UndefOr[Name]
    var performAutoML: js.UndefOr[PerformAutoML]
    var performHPO: js.UndefOr[PerformHPO]
    var recipeArn: js.UndefOr[Arn]
    var solutionArn: js.UndefOr[Arn]
    var solutionConfig: js.UndefOr[SolutionConfig]
    var status: js.UndefOr[Status]
  }

  object Solution {
    def apply(
        autoMLResult: js.UndefOr[AutoMLResult] = js.undefined,
        creationDateTime: js.UndefOr[Date] = js.undefined,
        datasetGroupArn: js.UndefOr[Arn] = js.undefined,
        eventType: js.UndefOr[EventType] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Date] = js.undefined,
        latestSolutionVersion: js.UndefOr[SolutionVersionSummary] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        performAutoML: js.UndefOr[PerformAutoML] = js.undefined,
        performHPO: js.UndefOr[PerformHPO] = js.undefined,
        recipeArn: js.UndefOr[Arn] = js.undefined,
        solutionArn: js.UndefOr[Arn] = js.undefined,
        solutionConfig: js.UndefOr[SolutionConfig] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): Solution = {
      val __obj = js.Dynamic.literal()
      autoMLResult.foreach(__v => __obj.updateDynamic("autoMLResult")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      datasetGroupArn.foreach(__v => __obj.updateDynamic("datasetGroupArn")(__v.asInstanceOf[js.Any]))
      eventType.foreach(__v => __obj.updateDynamic("eventType")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      latestSolutionVersion.foreach(__v => __obj.updateDynamic("latestSolutionVersion")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      performAutoML.foreach(__v => __obj.updateDynamic("performAutoML")(__v.asInstanceOf[js.Any]))
      performHPO.foreach(__v => __obj.updateDynamic("performHPO")(__v.asInstanceOf[js.Any]))
      recipeArn.foreach(__v => __obj.updateDynamic("recipeArn")(__v.asInstanceOf[js.Any]))
      solutionArn.foreach(__v => __obj.updateDynamic("solutionArn")(__v.asInstanceOf[js.Any]))
      solutionConfig.foreach(__v => __obj.updateDynamic("solutionConfig")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Solution]
    }
  }

  /**
    * Describes the configuration properties for the solution.
    */
  @js.native
  trait SolutionConfig extends js.Object {
    var algorithmHyperParameters: js.UndefOr[HyperParameters]
    var autoMLConfig: js.UndefOr[AutoMLConfig]
    var eventValueThreshold: js.UndefOr[EventValueThreshold]
    var featureTransformationParameters: js.UndefOr[FeatureTransformationParameters]
    var hpoConfig: js.UndefOr[HPOConfig]
  }

  object SolutionConfig {
    def apply(
        algorithmHyperParameters: js.UndefOr[HyperParameters] = js.undefined,
        autoMLConfig: js.UndefOr[AutoMLConfig] = js.undefined,
        eventValueThreshold: js.UndefOr[EventValueThreshold] = js.undefined,
        featureTransformationParameters: js.UndefOr[FeatureTransformationParameters] = js.undefined,
        hpoConfig: js.UndefOr[HPOConfig] = js.undefined
    ): SolutionConfig = {
      val __obj = js.Dynamic.literal()
      algorithmHyperParameters.foreach(__v => __obj.updateDynamic("algorithmHyperParameters")(__v.asInstanceOf[js.Any]))
      autoMLConfig.foreach(__v => __obj.updateDynamic("autoMLConfig")(__v.asInstanceOf[js.Any]))
      eventValueThreshold.foreach(__v => __obj.updateDynamic("eventValueThreshold")(__v.asInstanceOf[js.Any]))
      featureTransformationParameters.foreach(
        __v => __obj.updateDynamic("featureTransformationParameters")(__v.asInstanceOf[js.Any])
      )
      hpoConfig.foreach(__v => __obj.updateDynamic("hpoConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SolutionConfig]
    }
  }

  /**
    * Provides a summary of the properties of a solution. For a complete listing, call the <a>DescribeSolution</a> API.
    */
  @js.native
  trait SolutionSummary extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var name: js.UndefOr[Name]
    var solutionArn: js.UndefOr[Arn]
    var status: js.UndefOr[Status]
  }

  object SolutionSummary {
    def apply(
        creationDateTime: js.UndefOr[Date] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Date] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        solutionArn: js.UndefOr[Arn] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): SolutionSummary = {
      val __obj = js.Dynamic.literal()
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      solutionArn.foreach(__v => __obj.updateDynamic("solutionArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SolutionSummary]
    }
  }

  /**
    * An object that provides information about a specific version of a <a>Solution</a>.
    */
  @js.native
  trait SolutionVersion extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var datasetGroupArn: js.UndefOr[Arn]
    var eventType: js.UndefOr[EventType]
    var failureReason: js.UndefOr[FailureReason]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var performAutoML: js.UndefOr[PerformAutoML]
    var performHPO: js.UndefOr[PerformHPO]
    var recipeArn: js.UndefOr[Arn]
    var solutionArn: js.UndefOr[Arn]
    var solutionConfig: js.UndefOr[SolutionConfig]
    var solutionVersionArn: js.UndefOr[Arn]
    var status: js.UndefOr[Status]
  }

  object SolutionVersion {
    def apply(
        creationDateTime: js.UndefOr[Date] = js.undefined,
        datasetGroupArn: js.UndefOr[Arn] = js.undefined,
        eventType: js.UndefOr[EventType] = js.undefined,
        failureReason: js.UndefOr[FailureReason] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Date] = js.undefined,
        performAutoML: js.UndefOr[PerformAutoML] = js.undefined,
        performHPO: js.UndefOr[PerformHPO] = js.undefined,
        recipeArn: js.UndefOr[Arn] = js.undefined,
        solutionArn: js.UndefOr[Arn] = js.undefined,
        solutionConfig: js.UndefOr[SolutionConfig] = js.undefined,
        solutionVersionArn: js.UndefOr[Arn] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): SolutionVersion = {
      val __obj = js.Dynamic.literal()
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      datasetGroupArn.foreach(__v => __obj.updateDynamic("datasetGroupArn")(__v.asInstanceOf[js.Any]))
      eventType.foreach(__v => __obj.updateDynamic("eventType")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      performAutoML.foreach(__v => __obj.updateDynamic("performAutoML")(__v.asInstanceOf[js.Any]))
      performHPO.foreach(__v => __obj.updateDynamic("performHPO")(__v.asInstanceOf[js.Any]))
      recipeArn.foreach(__v => __obj.updateDynamic("recipeArn")(__v.asInstanceOf[js.Any]))
      solutionArn.foreach(__v => __obj.updateDynamic("solutionArn")(__v.asInstanceOf[js.Any]))
      solutionConfig.foreach(__v => __obj.updateDynamic("solutionConfig")(__v.asInstanceOf[js.Any]))
      solutionVersionArn.foreach(__v => __obj.updateDynamic("solutionVersionArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SolutionVersion]
    }
  }

  /**
    * Provides a summary of the properties of a solution version. For a complete listing, call the <a>DescribeSolutionVersion</a> API.
    */
  @js.native
  trait SolutionVersionSummary extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var failureReason: js.UndefOr[FailureReason]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var solutionVersionArn: js.UndefOr[Arn]
    var status: js.UndefOr[Status]
  }

  object SolutionVersionSummary {
    def apply(
        creationDateTime: js.UndefOr[Date] = js.undefined,
        failureReason: js.UndefOr[FailureReason] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Date] = js.undefined,
        solutionVersionArn: js.UndefOr[Arn] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): SolutionVersionSummary = {
      val __obj = js.Dynamic.literal()
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      solutionVersionArn.foreach(__v => __obj.updateDynamic("solutionVersionArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SolutionVersionSummary]
    }
  }

  @js.native
  trait UpdateCampaignRequest extends js.Object {
    var campaignArn: Arn
    var minProvisionedTPS: js.UndefOr[TransactionsPerSecond]
    var solutionVersionArn: js.UndefOr[Arn]
  }

  object UpdateCampaignRequest {
    def apply(
        campaignArn: Arn,
        minProvisionedTPS: js.UndefOr[TransactionsPerSecond] = js.undefined,
        solutionVersionArn: js.UndefOr[Arn] = js.undefined
    ): UpdateCampaignRequest = {
      val __obj = js.Dynamic.literal(
        "campaignArn" -> campaignArn.asInstanceOf[js.Any]
      )

      minProvisionedTPS.foreach(__v => __obj.updateDynamic("minProvisionedTPS")(__v.asInstanceOf[js.Any]))
      solutionVersionArn.foreach(__v => __obj.updateDynamic("solutionVersionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCampaignRequest]
    }
  }

  @js.native
  trait UpdateCampaignResponse extends js.Object {
    var campaignArn: js.UndefOr[Arn]
  }

  object UpdateCampaignResponse {
    def apply(
        campaignArn: js.UndefOr[Arn] = js.undefined
    ): UpdateCampaignResponse = {
      val __obj = js.Dynamic.literal()
      campaignArn.foreach(__v => __obj.updateDynamic("campaignArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCampaignResponse]
    }
  }
}
