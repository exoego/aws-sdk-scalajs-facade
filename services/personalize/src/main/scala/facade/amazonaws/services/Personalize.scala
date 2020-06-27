package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object personalize {
  type AccountId                              = String
  type Arn                                    = String
  type ArnList                                = js.Array[Arn]
  type AvroSchema                             = String
  type BatchInferenceJobs                     = js.Array[BatchInferenceJobSummary]
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
  type NumBatchResults                        = Int
  type ParameterName                          = String
  type ParameterValue                         = String
  type PerformAutoML                          = Boolean
  type PerformHPO                             = Boolean
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
  type TrainingHours                          = Double
  type TrainingInputMode                      = String
  type TransactionsPerSecond                  = Int
  type Tunable                                = Boolean

  implicit final class PersonalizeOps(private val service: Personalize) extends AnyVal {

    @inline def createBatchInferenceJobFuture(
        params: CreateBatchInferenceJobRequest
    ): Future[CreateBatchInferenceJobResponse] = service.createBatchInferenceJob(params).promise().toFuture
    @inline def createCampaignFuture(params: CreateCampaignRequest): Future[CreateCampaignResponse] =
      service.createCampaign(params).promise().toFuture
    @inline def createDatasetFuture(params: CreateDatasetRequest): Future[CreateDatasetResponse] =
      service.createDataset(params).promise().toFuture
    @inline def createDatasetGroupFuture(params: CreateDatasetGroupRequest): Future[CreateDatasetGroupResponse] =
      service.createDatasetGroup(params).promise().toFuture
    @inline def createDatasetImportJobFuture(
        params: CreateDatasetImportJobRequest
    ): Future[CreateDatasetImportJobResponse] = service.createDatasetImportJob(params).promise().toFuture
    @inline def createEventTrackerFuture(params: CreateEventTrackerRequest): Future[CreateEventTrackerResponse] =
      service.createEventTracker(params).promise().toFuture
    @inline def createSchemaFuture(params: CreateSchemaRequest): Future[CreateSchemaResponse] =
      service.createSchema(params).promise().toFuture
    @inline def createSolutionFuture(params: CreateSolutionRequest): Future[CreateSolutionResponse] =
      service.createSolution(params).promise().toFuture
    @inline def createSolutionVersionFuture(
        params: CreateSolutionVersionRequest
    ): Future[CreateSolutionVersionResponse] = service.createSolutionVersion(params).promise().toFuture
    @inline def deleteCampaignFuture(params: DeleteCampaignRequest): Future[js.Object] =
      service.deleteCampaign(params).promise().toFuture
    @inline def deleteDatasetFuture(params: DeleteDatasetRequest): Future[js.Object] =
      service.deleteDataset(params).promise().toFuture
    @inline def deleteDatasetGroupFuture(params: DeleteDatasetGroupRequest): Future[js.Object] =
      service.deleteDatasetGroup(params).promise().toFuture
    @inline def deleteEventTrackerFuture(params: DeleteEventTrackerRequest): Future[js.Object] =
      service.deleteEventTracker(params).promise().toFuture
    @inline def deleteSchemaFuture(params: DeleteSchemaRequest): Future[js.Object] =
      service.deleteSchema(params).promise().toFuture
    @inline def deleteSolutionFuture(params: DeleteSolutionRequest): Future[js.Object] =
      service.deleteSolution(params).promise().toFuture
    @inline def describeAlgorithmFuture(params: DescribeAlgorithmRequest): Future[DescribeAlgorithmResponse] =
      service.describeAlgorithm(params).promise().toFuture
    @inline def describeBatchInferenceJobFuture(
        params: DescribeBatchInferenceJobRequest
    ): Future[DescribeBatchInferenceJobResponse] = service.describeBatchInferenceJob(params).promise().toFuture
    @inline def describeCampaignFuture(params: DescribeCampaignRequest): Future[DescribeCampaignResponse] =
      service.describeCampaign(params).promise().toFuture
    @inline def describeDatasetFuture(params: DescribeDatasetRequest): Future[DescribeDatasetResponse] =
      service.describeDataset(params).promise().toFuture
    @inline def describeDatasetGroupFuture(params: DescribeDatasetGroupRequest): Future[DescribeDatasetGroupResponse] =
      service.describeDatasetGroup(params).promise().toFuture
    @inline def describeDatasetImportJobFuture(
        params: DescribeDatasetImportJobRequest
    ): Future[DescribeDatasetImportJobResponse] = service.describeDatasetImportJob(params).promise().toFuture
    @inline def describeEventTrackerFuture(params: DescribeEventTrackerRequest): Future[DescribeEventTrackerResponse] =
      service.describeEventTracker(params).promise().toFuture
    @inline def describeFeatureTransformationFuture(
        params: DescribeFeatureTransformationRequest
    ): Future[DescribeFeatureTransformationResponse] = service.describeFeatureTransformation(params).promise().toFuture
    @inline def describeRecipeFuture(params: DescribeRecipeRequest): Future[DescribeRecipeResponse] =
      service.describeRecipe(params).promise().toFuture
    @inline def describeSchemaFuture(params: DescribeSchemaRequest): Future[DescribeSchemaResponse] =
      service.describeSchema(params).promise().toFuture
    @inline def describeSolutionFuture(params: DescribeSolutionRequest): Future[DescribeSolutionResponse] =
      service.describeSolution(params).promise().toFuture
    @inline def describeSolutionVersionFuture(
        params: DescribeSolutionVersionRequest
    ): Future[DescribeSolutionVersionResponse] = service.describeSolutionVersion(params).promise().toFuture
    @inline def getSolutionMetricsFuture(params: GetSolutionMetricsRequest): Future[GetSolutionMetricsResponse] =
      service.getSolutionMetrics(params).promise().toFuture
    @inline def listBatchInferenceJobsFuture(
        params: ListBatchInferenceJobsRequest
    ): Future[ListBatchInferenceJobsResponse] = service.listBatchInferenceJobs(params).promise().toFuture
    @inline def listCampaignsFuture(params: ListCampaignsRequest): Future[ListCampaignsResponse] =
      service.listCampaigns(params).promise().toFuture
    @inline def listDatasetGroupsFuture(params: ListDatasetGroupsRequest): Future[ListDatasetGroupsResponse] =
      service.listDatasetGroups(params).promise().toFuture
    @inline def listDatasetImportJobsFuture(
        params: ListDatasetImportJobsRequest
    ): Future[ListDatasetImportJobsResponse] = service.listDatasetImportJobs(params).promise().toFuture
    @inline def listDatasetsFuture(params: ListDatasetsRequest): Future[ListDatasetsResponse] =
      service.listDatasets(params).promise().toFuture
    @inline def listEventTrackersFuture(params: ListEventTrackersRequest): Future[ListEventTrackersResponse] =
      service.listEventTrackers(params).promise().toFuture
    @inline def listRecipesFuture(params: ListRecipesRequest): Future[ListRecipesResponse] =
      service.listRecipes(params).promise().toFuture
    @inline def listSchemasFuture(params: ListSchemasRequest): Future[ListSchemasResponse] =
      service.listSchemas(params).promise().toFuture
    @inline def listSolutionVersionsFuture(params: ListSolutionVersionsRequest): Future[ListSolutionVersionsResponse] =
      service.listSolutionVersions(params).promise().toFuture
    @inline def listSolutionsFuture(params: ListSolutionsRequest): Future[ListSolutionsResponse] =
      service.listSolutions(params).promise().toFuture
    @inline def updateCampaignFuture(params: UpdateCampaignRequest): Future[UpdateCampaignResponse] =
      service.updateCampaign(params).promise().toFuture
  }
}

package personalize {
  @js.native
  @JSImport("aws-sdk", "Personalize")
  class Personalize() extends js.Object {
    def this(config: AWSConfig) = this()

    def createBatchInferenceJob(params: CreateBatchInferenceJobRequest): Request[CreateBatchInferenceJobResponse] =
      js.native
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
    def describeBatchInferenceJob(
        params: DescribeBatchInferenceJobRequest
    ): Request[DescribeBatchInferenceJobResponse]                                                        = js.native
    def describeCampaign(params: DescribeCampaignRequest): Request[DescribeCampaignResponse]             = js.native
    def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse]                = js.native
    def describeDatasetGroup(params: DescribeDatasetGroupRequest): Request[DescribeDatasetGroupResponse] = js.native
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
    def getSolutionMetrics(params: GetSolutionMetricsRequest): Request[GetSolutionMetricsResponse] = js.native
    def listBatchInferenceJobs(params: ListBatchInferenceJobsRequest): Request[ListBatchInferenceJobsResponse] =
      js.native
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
  @Factory
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

  /**
    * Describes an algorithm image.
    */
  @js.native
  @Factory
  trait AlgorithmImage extends js.Object {
    var dockerURI: DockerURI
    var name: js.UndefOr[Name]
  }

  /**
    * When the solution performs AutoML (<code>performAutoML</code> is true in <a>CreateSolution</a>), Amazon Personalize determines which recipe, from the specified list, optimizes the given metric. Amazon Personalize then uses that recipe for the solution.
    */
  @js.native
  @Factory
  trait AutoMLConfig extends js.Object {
    var metricName: js.UndefOr[MetricName]
    var recipeList: js.UndefOr[ArnList]
  }

  /**
    * When the solution performs AutoML (<code>performAutoML</code> is true in <a>CreateSolution</a>), specifies the recipe that best optimized the specified metric.
    */
  @js.native
  @Factory
  trait AutoMLResult extends js.Object {
    var bestRecipeArn: js.UndefOr[Arn]
  }

  /**
    * Contains information on a batch inference job.
    */
  @js.native
  @Factory
  trait BatchInferenceJob extends js.Object {
    var batchInferenceJobArn: js.UndefOr[Arn]
    var creationDateTime: js.UndefOr[Date]
    var failureReason: js.UndefOr[FailureReason]
    var jobInput: js.UndefOr[BatchInferenceJobInput]
    var jobName: js.UndefOr[Name]
    var jobOutput: js.UndefOr[BatchInferenceJobOutput]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var numResults: js.UndefOr[NumBatchResults]
    var roleArn: js.UndefOr[RoleArn]
    var solutionVersionArn: js.UndefOr[Arn]
    var status: js.UndefOr[Status]
  }

  /**
    * The input configuration of a batch inference job.
    */
  @js.native
  @Factory
  trait BatchInferenceJobInput extends js.Object {
    var s3DataSource: S3DataConfig
  }

  /**
    * The output configuration parameters of a batch inference job.
    */
  @js.native
  @Factory
  trait BatchInferenceJobOutput extends js.Object {
    var s3DataDestination: S3DataConfig
  }

  /**
    * A truncated version of the <a>BatchInferenceJob</a> datatype. The <a>ListBatchInferenceJobs</a> operation returns a list of batch inference job summaries.
    */
  @js.native
  @Factory
  trait BatchInferenceJobSummary extends js.Object {
    var batchInferenceJobArn: js.UndefOr[Arn]
    var creationDateTime: js.UndefOr[Date]
    var failureReason: js.UndefOr[FailureReason]
    var jobName: js.UndefOr[Name]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var status: js.UndefOr[Status]
  }

  /**
    * Describes a deployed solution version, otherwise known as a campaign. For more information on campaigns, see <a>CreateCampaign</a>.
    */
  @js.native
  @Factory
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

  /**
    * Provides a summary of the properties of a campaign. For a complete listing, call the <a>DescribeCampaign</a> API.
    */
  @js.native
  @Factory
  trait CampaignSummary extends js.Object {
    var campaignArn: js.UndefOr[Arn]
    var creationDateTime: js.UndefOr[Date]
    var failureReason: js.UndefOr[FailureReason]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var name: js.UndefOr[Name]
    var status: js.UndefOr[Status]
  }

  /**
    * Provides a summary of the properties of a campaign update. For a complete listing, call the <a>DescribeCampaign</a> API.
    */
  @js.native
  @Factory
  trait CampaignUpdateSummary extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var failureReason: js.UndefOr[FailureReason]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var minProvisionedTPS: js.UndefOr[TransactionsPerSecond]
    var solutionVersionArn: js.UndefOr[Arn]
    var status: js.UndefOr[Status]
  }

  /**
    * Provides the name and range of a categorical hyperparameter.
    */
  @js.native
  @Factory
  trait CategoricalHyperParameterRange extends js.Object {
    var name: js.UndefOr[ParameterName]
    var values: js.UndefOr[CategoricalValues]
  }

  /**
    * Provides the name and range of a continuous hyperparameter.
    */
  @js.native
  @Factory
  trait ContinuousHyperParameterRange extends js.Object {
    var maxValue: js.UndefOr[ContinuousMaxValue]
    var minValue: js.UndefOr[ContinuousMinValue]
    var name: js.UndefOr[ParameterName]
  }

  @js.native
  @Factory
  trait CreateBatchInferenceJobRequest extends js.Object {
    var jobInput: BatchInferenceJobInput
    var jobName: Name
    var jobOutput: BatchInferenceJobOutput
    var roleArn: RoleArn
    var solutionVersionArn: Arn
    var numResults: js.UndefOr[NumBatchResults]
  }

  @js.native
  @Factory
  trait CreateBatchInferenceJobResponse extends js.Object {
    var batchInferenceJobArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait CreateCampaignRequest extends js.Object {
    var minProvisionedTPS: TransactionsPerSecond
    var name: Name
    var solutionVersionArn: Arn
  }

  @js.native
  @Factory
  trait CreateCampaignResponse extends js.Object {
    var campaignArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait CreateDatasetGroupRequest extends js.Object {
    var name: Name
    var kmsKeyArn: js.UndefOr[KmsKeyArn]
    var roleArn: js.UndefOr[RoleArn]
  }

  @js.native
  @Factory
  trait CreateDatasetGroupResponse extends js.Object {
    var datasetGroupArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait CreateDatasetImportJobRequest extends js.Object {
    var dataSource: DataSource
    var datasetArn: Arn
    var jobName: Name
    var roleArn: RoleArn
  }

  @js.native
  @Factory
  trait CreateDatasetImportJobResponse extends js.Object {
    var datasetImportJobArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait CreateDatasetRequest extends js.Object {
    var datasetGroupArn: Arn
    var datasetType: DatasetType
    var name: Name
    var schemaArn: Arn
  }

  @js.native
  @Factory
  trait CreateDatasetResponse extends js.Object {
    var datasetArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait CreateEventTrackerRequest extends js.Object {
    var datasetGroupArn: Arn
    var name: Name
  }

  @js.native
  @Factory
  trait CreateEventTrackerResponse extends js.Object {
    var eventTrackerArn: js.UndefOr[Arn]
    var trackingId: js.UndefOr[TrackingId]
  }

  @js.native
  @Factory
  trait CreateSchemaRequest extends js.Object {
    var name: Name
    var schema: AvroSchema
  }

  @js.native
  @Factory
  trait CreateSchemaResponse extends js.Object {
    var schemaArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait CreateSolutionRequest extends js.Object {
    var datasetGroupArn: Arn
    var name: Name
    var eventType: js.UndefOr[EventType]
    var performAutoML: js.UndefOr[PerformAutoML]
    var performHPO: js.UndefOr[Boolean]
    var recipeArn: js.UndefOr[Arn]
    var solutionConfig: js.UndefOr[SolutionConfig]
  }

  @js.native
  @Factory
  trait CreateSolutionResponse extends js.Object {
    var solutionArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait CreateSolutionVersionRequest extends js.Object {
    var solutionArn: Arn
    var trainingMode: js.UndefOr[TrainingMode]
  }

  @js.native
  @Factory
  trait CreateSolutionVersionResponse extends js.Object {
    var solutionVersionArn: js.UndefOr[Arn]
  }

  /**
    * Describes the data source that contains the data to upload to a dataset.
    */
  @js.native
  @Factory
  trait DataSource extends js.Object {
    var dataLocation: js.UndefOr[S3Location]
  }

  /**
    * Provides metadata for a dataset.
    */
  @js.native
  @Factory
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

  /**
    * A dataset group is a collection of related datasets (Interactions, User, and Item). You create a dataset group by calling <a>CreateDatasetGroup</a>. You then create a dataset and add it to a dataset group by calling <a>CreateDataset</a>. The dataset group is used to create and train a solution by calling <a>CreateSolution</a>. A dataset group can contain only one of each type of dataset.
    *  You can specify an AWS Key Management Service (KMS) key to encrypt the datasets in the group.
    */
  @js.native
  @Factory
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

  /**
    * Provides a summary of the properties of a dataset group. For a complete listing, call the <a>DescribeDatasetGroup</a> API.
    */
  @js.native
  @Factory
  trait DatasetGroupSummary extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var datasetGroupArn: js.UndefOr[Arn]
    var failureReason: js.UndefOr[FailureReason]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var name: js.UndefOr[Name]
    var status: js.UndefOr[Status]
  }

  /**
    * Describes a job that imports training data from a data source (Amazon S3 bucket) to an Amazon Personalize dataset. For more information, see <a>CreateDatasetImportJob</a>.
    *  A dataset import job can be in one of the following states:
    * * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
    */
  @js.native
  @Factory
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

  /**
    * Provides a summary of the properties of a dataset import job. For a complete listing, call the <a>DescribeDatasetImportJob</a> API.
    */
  @js.native
  @Factory
  trait DatasetImportJobSummary extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var datasetImportJobArn: js.UndefOr[Arn]
    var failureReason: js.UndefOr[FailureReason]
    var jobName: js.UndefOr[Name]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var status: js.UndefOr[Status]
  }

  /**
    * Describes the schema for a dataset. For more information on schemas, see <a>CreateSchema</a>.
    */
  @js.native
  @Factory
  trait DatasetSchema extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var name: js.UndefOr[Name]
    var schema: js.UndefOr[AvroSchema]
    var schemaArn: js.UndefOr[Arn]
  }

  /**
    * Provides a summary of the properties of a dataset schema. For a complete listing, call the <a>DescribeSchema</a> API.
    */
  @js.native
  @Factory
  trait DatasetSchemaSummary extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var name: js.UndefOr[Name]
    var schemaArn: js.UndefOr[Arn]
  }

  /**
    * Provides a summary of the properties of a dataset. For a complete listing, call the <a>DescribeDataset</a> API.
    */
  @js.native
  @Factory
  trait DatasetSummary extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var datasetArn: js.UndefOr[Arn]
    var datasetType: js.UndefOr[DatasetType]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var name: js.UndefOr[Name]
    var status: js.UndefOr[Status]
  }

  /**
    * Provides the name and default range of a categorical hyperparameter and whether the hyperparameter is tunable. A tunable hyperparameter can have its value determined during hyperparameter optimization (HPO).
    */
  @js.native
  @Factory
  trait DefaultCategoricalHyperParameterRange extends js.Object {
    var isTunable: js.UndefOr[Tunable]
    var name: js.UndefOr[ParameterName]
    var values: js.UndefOr[CategoricalValues]
  }

  /**
    * Provides the name and default range of a continuous hyperparameter and whether the hyperparameter is tunable. A tunable hyperparameter can have its value determined during hyperparameter optimization (HPO).
    */
  @js.native
  @Factory
  trait DefaultContinuousHyperParameterRange extends js.Object {
    var isTunable: js.UndefOr[Tunable]
    var maxValue: js.UndefOr[ContinuousMaxValue]
    var minValue: js.UndefOr[ContinuousMinValue]
    var name: js.UndefOr[ParameterName]
  }

  /**
    * Specifies the hyperparameters and their default ranges. Hyperparameters can be categorical, continuous, or integer-valued.
    */
  @js.native
  @Factory
  trait DefaultHyperParameterRanges extends js.Object {
    var categoricalHyperParameterRanges: js.UndefOr[DefaultCategoricalHyperParameterRanges]
    var continuousHyperParameterRanges: js.UndefOr[DefaultContinuousHyperParameterRanges]
    var integerHyperParameterRanges: js.UndefOr[DefaultIntegerHyperParameterRanges]
  }

  /**
    * Provides the name and default range of a integer-valued hyperparameter and whether the hyperparameter is tunable. A tunable hyperparameter can have its value determined during hyperparameter optimization (HPO).
    */
  @js.native
  @Factory
  trait DefaultIntegerHyperParameterRange extends js.Object {
    var isTunable: js.UndefOr[Tunable]
    var maxValue: js.UndefOr[IntegerMaxValue]
    var minValue: js.UndefOr[IntegerMinValue]
    var name: js.UndefOr[ParameterName]
  }

  @js.native
  @Factory
  trait DeleteCampaignRequest extends js.Object {
    var campaignArn: Arn
  }

  @js.native
  @Factory
  trait DeleteDatasetGroupRequest extends js.Object {
    var datasetGroupArn: Arn
  }

  @js.native
  @Factory
  trait DeleteDatasetRequest extends js.Object {
    var datasetArn: Arn
  }

  @js.native
  @Factory
  trait DeleteEventTrackerRequest extends js.Object {
    var eventTrackerArn: Arn
  }

  @js.native
  @Factory
  trait DeleteSchemaRequest extends js.Object {
    var schemaArn: Arn
  }

  @js.native
  @Factory
  trait DeleteSolutionRequest extends js.Object {
    var solutionArn: Arn
  }

  @js.native
  @Factory
  trait DescribeAlgorithmRequest extends js.Object {
    var algorithmArn: Arn
  }

  @js.native
  @Factory
  trait DescribeAlgorithmResponse extends js.Object {
    var algorithm: js.UndefOr[Algorithm]
  }

  @js.native
  @Factory
  trait DescribeBatchInferenceJobRequest extends js.Object {
    var batchInferenceJobArn: Arn
  }

  @js.native
  @Factory
  trait DescribeBatchInferenceJobResponse extends js.Object {
    var batchInferenceJob: js.UndefOr[BatchInferenceJob]
  }

  @js.native
  @Factory
  trait DescribeCampaignRequest extends js.Object {
    var campaignArn: Arn
  }

  @js.native
  @Factory
  trait DescribeCampaignResponse extends js.Object {
    var campaign: js.UndefOr[Campaign]
  }

  @js.native
  @Factory
  trait DescribeDatasetGroupRequest extends js.Object {
    var datasetGroupArn: Arn
  }

  @js.native
  @Factory
  trait DescribeDatasetGroupResponse extends js.Object {
    var datasetGroup: js.UndefOr[DatasetGroup]
  }

  @js.native
  @Factory
  trait DescribeDatasetImportJobRequest extends js.Object {
    var datasetImportJobArn: Arn
  }

  @js.native
  @Factory
  trait DescribeDatasetImportJobResponse extends js.Object {
    var datasetImportJob: js.UndefOr[DatasetImportJob]
  }

  @js.native
  @Factory
  trait DescribeDatasetRequest extends js.Object {
    var datasetArn: Arn
  }

  @js.native
  @Factory
  trait DescribeDatasetResponse extends js.Object {
    var dataset: js.UndefOr[Dataset]
  }

  @js.native
  @Factory
  trait DescribeEventTrackerRequest extends js.Object {
    var eventTrackerArn: Arn
  }

  @js.native
  @Factory
  trait DescribeEventTrackerResponse extends js.Object {
    var eventTracker: js.UndefOr[EventTracker]
  }

  @js.native
  @Factory
  trait DescribeFeatureTransformationRequest extends js.Object {
    var featureTransformationArn: Arn
  }

  @js.native
  @Factory
  trait DescribeFeatureTransformationResponse extends js.Object {
    var featureTransformation: js.UndefOr[FeatureTransformation]
  }

  @js.native
  @Factory
  trait DescribeRecipeRequest extends js.Object {
    var recipeArn: Arn
  }

  @js.native
  @Factory
  trait DescribeRecipeResponse extends js.Object {
    var recipe: js.UndefOr[Recipe]
  }

  @js.native
  @Factory
  trait DescribeSchemaRequest extends js.Object {
    var schemaArn: Arn
  }

  @js.native
  @Factory
  trait DescribeSchemaResponse extends js.Object {
    var schema: js.UndefOr[DatasetSchema]
  }

  @js.native
  @Factory
  trait DescribeSolutionRequest extends js.Object {
    var solutionArn: Arn
  }

  @js.native
  @Factory
  trait DescribeSolutionResponse extends js.Object {
    var solution: js.UndefOr[Solution]
  }

  @js.native
  @Factory
  trait DescribeSolutionVersionRequest extends js.Object {
    var solutionVersionArn: Arn
  }

  @js.native
  @Factory
  trait DescribeSolutionVersionResponse extends js.Object {
    var solutionVersion: js.UndefOr[SolutionVersion]
  }

  /**
    * Provides information about an event tracker.
    */
  @js.native
  @Factory
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

  /**
    * Provides a summary of the properties of an event tracker. For a complete listing, call the <a>DescribeEventTracker</a> API.
    */
  @js.native
  @Factory
  trait EventTrackerSummary extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var eventTrackerArn: js.UndefOr[Arn]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var name: js.UndefOr[Name]
    var status: js.UndefOr[Status]
  }

  /**
    * Provides feature transformation information. Feature transformation is the process of modifying raw input data into a form more suitable for model training.
    */
  @js.native
  @Factory
  trait FeatureTransformation extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var defaultParameters: js.UndefOr[FeaturizationParameters]
    var featureTransformationArn: js.UndefOr[Arn]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var name: js.UndefOr[Name]
    var status: js.UndefOr[Status]
  }

  @js.native
  @Factory
  trait GetSolutionMetricsRequest extends js.Object {
    var solutionVersionArn: Arn
  }

  @js.native
  @Factory
  trait GetSolutionMetricsResponse extends js.Object {
    var metrics: js.UndefOr[Metrics]
    var solutionVersionArn: js.UndefOr[Arn]
  }

  /**
    * Describes the properties for hyperparameter optimization (HPO). For use with the bring-your-own-recipe feature. Do not use for Amazon Personalize native recipes.
    */
  @js.native
  @Factory
  trait HPOConfig extends js.Object {
    var algorithmHyperParameterRanges: js.UndefOr[HyperParameterRanges]
    var hpoObjective: js.UndefOr[HPOObjective]
    var hpoResourceConfig: js.UndefOr[HPOResourceConfig]
  }

  /**
    * The metric to optimize during hyperparameter optimization (HPO).
    */
  @js.native
  @Factory
  trait HPOObjective extends js.Object {
    var metricName: js.UndefOr[MetricName]
    var metricRegex: js.UndefOr[MetricRegex]
    var `type`: js.UndefOr[HPOObjectiveType]
  }

  /**
    * Describes the resource configuration for hyperparameter optimization (HPO).
    */
  @js.native
  @Factory
  trait HPOResourceConfig extends js.Object {
    var maxNumberOfTrainingJobs: js.UndefOr[HPOResource]
    var maxParallelTrainingJobs: js.UndefOr[HPOResource]
  }

  /**
    * Specifies the hyperparameters and their ranges. Hyperparameters can be categorical, continuous, or integer-valued.
    */
  @js.native
  @Factory
  trait HyperParameterRanges extends js.Object {
    var categoricalHyperParameterRanges: js.UndefOr[CategoricalHyperParameterRanges]
    var continuousHyperParameterRanges: js.UndefOr[ContinuousHyperParameterRanges]
    var integerHyperParameterRanges: js.UndefOr[IntegerHyperParameterRanges]
  }

  /**
    * Provides the name and range of an integer-valued hyperparameter.
    */
  @js.native
  @Factory
  trait IntegerHyperParameterRange extends js.Object {
    var maxValue: js.UndefOr[IntegerMaxValue]
    var minValue: js.UndefOr[IntegerMinValue]
    var name: js.UndefOr[ParameterName]
  }

  @js.native
  @Factory
  trait ListBatchInferenceJobsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var solutionVersionArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait ListBatchInferenceJobsResponse extends js.Object {
    var batchInferenceJobs: js.UndefOr[BatchInferenceJobs]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListCampaignsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var solutionArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait ListCampaignsResponse extends js.Object {
    var campaigns: js.UndefOr[Campaigns]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDatasetGroupsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDatasetGroupsResponse extends js.Object {
    var datasetGroups: js.UndefOr[DatasetGroups]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDatasetImportJobsRequest extends js.Object {
    var datasetArn: js.UndefOr[Arn]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDatasetImportJobsResponse extends js.Object {
    var datasetImportJobs: js.UndefOr[DatasetImportJobs]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDatasetsRequest extends js.Object {
    var datasetGroupArn: js.UndefOr[Arn]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDatasetsResponse extends js.Object {
    var datasets: js.UndefOr[Datasets]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListEventTrackersRequest extends js.Object {
    var datasetGroupArn: js.UndefOr[Arn]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListEventTrackersResponse extends js.Object {
    var eventTrackers: js.UndefOr[EventTrackers]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListRecipesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var recipeProvider: js.UndefOr[RecipeProvider]
  }

  @js.native
  @Factory
  trait ListRecipesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var recipes: js.UndefOr[Recipes]
  }

  @js.native
  @Factory
  trait ListSchemasRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListSchemasResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var schemas: js.UndefOr[Schemas]
  }

  @js.native
  @Factory
  trait ListSolutionVersionsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var solutionArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait ListSolutionVersionsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var solutionVersions: js.UndefOr[SolutionVersions]
  }

  @js.native
  @Factory
  trait ListSolutionsRequest extends js.Object {
    var datasetGroupArn: js.UndefOr[Arn]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListSolutionsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var solutions: js.UndefOr[Solutions]
  }

  /**
    * Provides information about a recipe. Each recipe provides an algorithm that Amazon Personalize uses in model training when you use the <a>CreateSolution</a> operation.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait RecipeProvider extends js.Any
  object RecipeProvider extends js.Object {
    val SERVICE = "SERVICE".asInstanceOf[RecipeProvider]

    val values = js.Object.freeze(js.Array(SERVICE))
  }

  /**
    * Provides a summary of the properties of a recipe. For a complete listing, call the <a>DescribeRecipe</a> API.
    */
  @js.native
  @Factory
  trait RecipeSummary extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var name: js.UndefOr[Name]
    var recipeArn: js.UndefOr[Arn]
    var status: js.UndefOr[Status]
  }

  /**
    * The configuration details of an Amazon S3 input or output bucket.
    */
  @js.native
  @Factory
  trait S3DataConfig extends js.Object {
    var path: S3Location
    var kmsKeyArn: js.UndefOr[KmsKeyArn]
  }

  /**
    * An object that provides information about a solution. A solution is a trained model that can be deployed as a campaign.
    */
  @js.native
  @Factory
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

  /**
    * Describes the configuration properties for the solution.
    */
  @js.native
  @Factory
  trait SolutionConfig extends js.Object {
    var algorithmHyperParameters: js.UndefOr[HyperParameters]
    var autoMLConfig: js.UndefOr[AutoMLConfig]
    var eventValueThreshold: js.UndefOr[EventValueThreshold]
    var featureTransformationParameters: js.UndefOr[FeatureTransformationParameters]
    var hpoConfig: js.UndefOr[HPOConfig]
  }

  /**
    * Provides a summary of the properties of a solution. For a complete listing, call the <a>DescribeSolution</a> API.
    */
  @js.native
  @Factory
  trait SolutionSummary extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var name: js.UndefOr[Name]
    var solutionArn: js.UndefOr[Arn]
    var status: js.UndefOr[Status]
  }

  /**
    * An object that provides information about a specific version of a <a>Solution</a>.
    */
  @js.native
  @Factory
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
    var trainingHours: js.UndefOr[TrainingHours]
    var trainingMode: js.UndefOr[TrainingMode]
  }

  /**
    * Provides a summary of the properties of a solution version. For a complete listing, call the <a>DescribeSolutionVersion</a> API.
    */
  @js.native
  @Factory
  trait SolutionVersionSummary extends js.Object {
    var creationDateTime: js.UndefOr[Date]
    var failureReason: js.UndefOr[FailureReason]
    var lastUpdatedDateTime: js.UndefOr[Date]
    var solutionVersionArn: js.UndefOr[Arn]
    var status: js.UndefOr[Status]
  }

  @js.native
  sealed trait TrainingMode extends js.Any
  object TrainingMode extends js.Object {
    val FULL   = "FULL".asInstanceOf[TrainingMode]
    val UPDATE = "UPDATE".asInstanceOf[TrainingMode]

    val values = js.Object.freeze(js.Array(FULL, UPDATE))
  }

  @js.native
  @Factory
  trait UpdateCampaignRequest extends js.Object {
    var campaignArn: Arn
    var minProvisionedTPS: js.UndefOr[TransactionsPerSecond]
    var solutionVersionArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait UpdateCampaignResponse extends js.Object {
    var campaignArn: js.UndefOr[Arn]
  }
}
