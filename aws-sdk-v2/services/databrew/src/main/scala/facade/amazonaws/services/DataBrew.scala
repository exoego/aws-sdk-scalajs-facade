package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object databrew {
  type AccountId = String
  type ActionId = Int
  type AllowedStatisticList = js.Array[AllowedStatistics]
  type Arn = String
  type AssumeControl = Boolean
  type Attempt = Int
  type Bucket = String
  type CatalogId = String
  type ClientSessionId = String
  type ColumnName = String
  type ColumnNameList = js.Array[ColumnName]
  type ColumnRange = Int
  type ColumnSelectorList = js.Array[ColumnSelector]
  type ColumnStatisticsConfigurationList = js.Array[ColumnStatisticsConfiguration]
  type Condition = String
  type ConditionExpressionList = js.Array[ConditionExpression]
  type ConditionValue = String
  type CreateColumn = Boolean
  type CreatedBy = String
  type CronExpression = String
  type DataCatalogOutputList = js.Array[DataCatalogOutput]
  type DatabaseName = String
  type DatabaseOutputList = js.Array[DatabaseOutput]
  type DatabaseTableName = String
  type DatasetList = js.Array[Dataset]
  type DatasetName = String
  type Date = js.Date
  type DatetimeFormat = String
  type Delimiter = String
  type Disabled = Boolean
  type EncryptionKeyArn = String
  type EntityType = String
  type EntityTypeList = js.Array[EntityType]
  type ErrorCode = String
  type ExecutionTime = Int
  type Expression = String
  type GlueConnectionName = String
  type HeaderRow = Boolean
  type HiddenColumnList = js.Array[ColumnName]
  type JobList = js.Array[Job]
  type JobName = String
  type JobNameList = js.Array[JobName]
  type JobRunErrorMessage = String
  type JobRunId = String
  type JobRunList = js.Array[JobRun]
  type JobSize = Double
  type Key = String
  type LastModifiedBy = String
  type LocaleCode = String
  type LogGroupName = String
  type MaxCapacity = Int
  type MaxFiles = Int
  type MaxResults100 = Int
  type MaxRetries = Int
  type MultiLine = Boolean
  type NextToken = String
  type OpenedBy = String
  type Operation = String
  type OutputList = js.Array[Output]
  type OverwriteOutput = Boolean
  type ParameterMap = js.Dictionary[ParameterValue]
  type ParameterName = String
  type ParameterValue = String
  type PathParameterName = String
  type PathParametersMap = js.Dictionary[DatasetParameter]
  type Preview = Boolean
  type ProjectList = js.Array[Project]
  type ProjectName = String
  type PublishedBy = String
  type QueryString = String
  type RecipeDescription = String
  type RecipeErrorList = js.Array[RecipeVersionErrorDetail]
  type RecipeErrorMessage = String
  type RecipeList = js.Array[Recipe]
  type RecipeName = String
  type RecipeStepList = js.Array[RecipeStep]
  type RecipeVersion = String
  type RecipeVersionList = js.Array[RecipeVersion]
  type Result = String
  type RowRange = Int
  type RuleCount = Int
  type RuleList = js.Array[Rule]
  type RuleName = String
  type RulesetDescription = String
  type RulesetItemList = js.Array[RulesetItem]
  type RulesetName = String
  type SampleSize = Int
  type ScheduleList = js.Array[Schedule]
  type ScheduleName = String
  type SheetIndex = Int
  type SheetIndexList = js.Array[SheetIndex]
  type SheetName = String
  type SheetNameList = js.Array[SheetName]
  type StartColumnIndex = Int
  type StartRowIndex = Int
  type StartedBy = String
  type Statistic = String
  type StatisticList = js.Array[Statistic]
  type StatisticOverrideList = js.Array[StatisticOverride]
  type StepIndex = Int
  type TableName = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type TargetColumn = String
  type ThresholdValue = Double
  type Timeout = Int
  type TimezoneOffset = String
  type ValidationConfigurationList = js.Array[ValidationConfiguration]
  type ValueReference = String
  type ValuesMap = js.Dictionary[ConditionValue]

  final class DataBrewOps(private val service: DataBrew) extends AnyVal {

    @inline def batchDeleteRecipeVersionFuture(params: BatchDeleteRecipeVersionRequest): Future[BatchDeleteRecipeVersionResponse] = service.batchDeleteRecipeVersion(params).promise().toFuture
    @inline def createDatasetFuture(params: CreateDatasetRequest): Future[CreateDatasetResponse] = service.createDataset(params).promise().toFuture
    @inline def createProfileJobFuture(params: CreateProfileJobRequest): Future[CreateProfileJobResponse] = service.createProfileJob(params).promise().toFuture
    @inline def createProjectFuture(params: CreateProjectRequest): Future[CreateProjectResponse] = service.createProject(params).promise().toFuture
    @inline def createRecipeFuture(params: CreateRecipeRequest): Future[CreateRecipeResponse] = service.createRecipe(params).promise().toFuture
    @inline def createRecipeJobFuture(params: CreateRecipeJobRequest): Future[CreateRecipeJobResponse] = service.createRecipeJob(params).promise().toFuture
    @inline def createRulesetFuture(params: CreateRulesetRequest): Future[CreateRulesetResponse] = service.createRuleset(params).promise().toFuture
    @inline def createScheduleFuture(params: CreateScheduleRequest): Future[CreateScheduleResponse] = service.createSchedule(params).promise().toFuture
    @inline def deleteDatasetFuture(params: DeleteDatasetRequest): Future[DeleteDatasetResponse] = service.deleteDataset(params).promise().toFuture
    @inline def deleteJobFuture(params: DeleteJobRequest): Future[DeleteJobResponse] = service.deleteJob(params).promise().toFuture
    @inline def deleteProjectFuture(params: DeleteProjectRequest): Future[DeleteProjectResponse] = service.deleteProject(params).promise().toFuture
    @inline def deleteRecipeVersionFuture(params: DeleteRecipeVersionRequest): Future[DeleteRecipeVersionResponse] = service.deleteRecipeVersion(params).promise().toFuture
    @inline def deleteRulesetFuture(params: DeleteRulesetRequest): Future[DeleteRulesetResponse] = service.deleteRuleset(params).promise().toFuture
    @inline def deleteScheduleFuture(params: DeleteScheduleRequest): Future[DeleteScheduleResponse] = service.deleteSchedule(params).promise().toFuture
    @inline def describeDatasetFuture(params: DescribeDatasetRequest): Future[DescribeDatasetResponse] = service.describeDataset(params).promise().toFuture
    @inline def describeJobFuture(params: DescribeJobRequest): Future[DescribeJobResponse] = service.describeJob(params).promise().toFuture
    @inline def describeJobRunFuture(params: DescribeJobRunRequest): Future[DescribeJobRunResponse] = service.describeJobRun(params).promise().toFuture
    @inline def describeProjectFuture(params: DescribeProjectRequest): Future[DescribeProjectResponse] = service.describeProject(params).promise().toFuture
    @inline def describeRecipeFuture(params: DescribeRecipeRequest): Future[DescribeRecipeResponse] = service.describeRecipe(params).promise().toFuture
    @inline def describeRulesetFuture(params: DescribeRulesetRequest): Future[DescribeRulesetResponse] = service.describeRuleset(params).promise().toFuture
    @inline def describeScheduleFuture(params: DescribeScheduleRequest): Future[DescribeScheduleResponse] = service.describeSchedule(params).promise().toFuture
    @inline def listDatasetsFuture(params: ListDatasetsRequest): Future[ListDatasetsResponse] = service.listDatasets(params).promise().toFuture
    @inline def listJobRunsFuture(params: ListJobRunsRequest): Future[ListJobRunsResponse] = service.listJobRuns(params).promise().toFuture
    @inline def listJobsFuture(params: ListJobsRequest): Future[ListJobsResponse] = service.listJobs(params).promise().toFuture
    @inline def listProjectsFuture(params: ListProjectsRequest): Future[ListProjectsResponse] = service.listProjects(params).promise().toFuture
    @inline def listRecipeVersionsFuture(params: ListRecipeVersionsRequest): Future[ListRecipeVersionsResponse] = service.listRecipeVersions(params).promise().toFuture
    @inline def listRecipesFuture(params: ListRecipesRequest): Future[ListRecipesResponse] = service.listRecipes(params).promise().toFuture
    @inline def listRulesetsFuture(params: ListRulesetsRequest): Future[ListRulesetsResponse] = service.listRulesets(params).promise().toFuture
    @inline def listSchedulesFuture(params: ListSchedulesRequest): Future[ListSchedulesResponse] = service.listSchedules(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def publishRecipeFuture(params: PublishRecipeRequest): Future[PublishRecipeResponse] = service.publishRecipe(params).promise().toFuture
    @inline def sendProjectSessionActionFuture(params: SendProjectSessionActionRequest): Future[SendProjectSessionActionResponse] = service.sendProjectSessionAction(params).promise().toFuture
    @inline def startJobRunFuture(params: StartJobRunRequest): Future[StartJobRunResponse] = service.startJobRun(params).promise().toFuture
    @inline def startProjectSessionFuture(params: StartProjectSessionRequest): Future[StartProjectSessionResponse] = service.startProjectSession(params).promise().toFuture
    @inline def stopJobRunFuture(params: StopJobRunRequest): Future[StopJobRunResponse] = service.stopJobRun(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateDatasetFuture(params: UpdateDatasetRequest): Future[UpdateDatasetResponse] = service.updateDataset(params).promise().toFuture
    @inline def updateProfileJobFuture(params: UpdateProfileJobRequest): Future[UpdateProfileJobResponse] = service.updateProfileJob(params).promise().toFuture
    @inline def updateProjectFuture(params: UpdateProjectRequest): Future[UpdateProjectResponse] = service.updateProject(params).promise().toFuture
    @inline def updateRecipeFuture(params: UpdateRecipeRequest): Future[UpdateRecipeResponse] = service.updateRecipe(params).promise().toFuture
    @inline def updateRecipeJobFuture(params: UpdateRecipeJobRequest): Future[UpdateRecipeJobResponse] = service.updateRecipeJob(params).promise().toFuture
    @inline def updateRulesetFuture(params: UpdateRulesetRequest): Future[UpdateRulesetResponse] = service.updateRuleset(params).promise().toFuture
    @inline def updateScheduleFuture(params: UpdateScheduleRequest): Future[UpdateScheduleResponse] = service.updateSchedule(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/databrew", JSImport.Namespace, "AWS.DataBrew")
  class DataBrew() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchDeleteRecipeVersion(params: BatchDeleteRecipeVersionRequest): Request[BatchDeleteRecipeVersionResponse] = js.native
    def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse] = js.native
    def createProfileJob(params: CreateProfileJobRequest): Request[CreateProfileJobResponse] = js.native
    def createProject(params: CreateProjectRequest): Request[CreateProjectResponse] = js.native
    def createRecipe(params: CreateRecipeRequest): Request[CreateRecipeResponse] = js.native
    def createRecipeJob(params: CreateRecipeJobRequest): Request[CreateRecipeJobResponse] = js.native
    def createRuleset(params: CreateRulesetRequest): Request[CreateRulesetResponse] = js.native
    def createSchedule(params: CreateScheduleRequest): Request[CreateScheduleResponse] = js.native
    def deleteDataset(params: DeleteDatasetRequest): Request[DeleteDatasetResponse] = js.native
    def deleteJob(params: DeleteJobRequest): Request[DeleteJobResponse] = js.native
    def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResponse] = js.native
    def deleteRecipeVersion(params: DeleteRecipeVersionRequest): Request[DeleteRecipeVersionResponse] = js.native
    def deleteRuleset(params: DeleteRulesetRequest): Request[DeleteRulesetResponse] = js.native
    def deleteSchedule(params: DeleteScheduleRequest): Request[DeleteScheduleResponse] = js.native
    def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse] = js.native
    def describeJob(params: DescribeJobRequest): Request[DescribeJobResponse] = js.native
    def describeJobRun(params: DescribeJobRunRequest): Request[DescribeJobRunResponse] = js.native
    def describeProject(params: DescribeProjectRequest): Request[DescribeProjectResponse] = js.native
    def describeRecipe(params: DescribeRecipeRequest): Request[DescribeRecipeResponse] = js.native
    def describeRuleset(params: DescribeRulesetRequest): Request[DescribeRulesetResponse] = js.native
    def describeSchedule(params: DescribeScheduleRequest): Request[DescribeScheduleResponse] = js.native
    def listDatasets(params: ListDatasetsRequest): Request[ListDatasetsResponse] = js.native
    def listJobRuns(params: ListJobRunsRequest): Request[ListJobRunsResponse] = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResponse] = js.native
    def listProjects(params: ListProjectsRequest): Request[ListProjectsResponse] = js.native
    def listRecipeVersions(params: ListRecipeVersionsRequest): Request[ListRecipeVersionsResponse] = js.native
    def listRecipes(params: ListRecipesRequest): Request[ListRecipesResponse] = js.native
    def listRulesets(params: ListRulesetsRequest): Request[ListRulesetsResponse] = js.native
    def listSchedules(params: ListSchedulesRequest): Request[ListSchedulesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def publishRecipe(params: PublishRecipeRequest): Request[PublishRecipeResponse] = js.native
    def sendProjectSessionAction(params: SendProjectSessionActionRequest): Request[SendProjectSessionActionResponse] = js.native
    def startJobRun(params: StartJobRunRequest): Request[StartJobRunResponse] = js.native
    def startProjectSession(params: StartProjectSessionRequest): Request[StartProjectSessionResponse] = js.native
    def stopJobRun(params: StopJobRunRequest): Request[StopJobRunResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateDataset(params: UpdateDatasetRequest): Request[UpdateDatasetResponse] = js.native
    def updateProfileJob(params: UpdateProfileJobRequest): Request[UpdateProfileJobResponse] = js.native
    def updateProject(params: UpdateProjectRequest): Request[UpdateProjectResponse] = js.native
    def updateRecipe(params: UpdateRecipeRequest): Request[UpdateRecipeResponse] = js.native
    def updateRecipeJob(params: UpdateRecipeJobRequest): Request[UpdateRecipeJobResponse] = js.native
    def updateRuleset(params: UpdateRulesetRequest): Request[UpdateRulesetResponse] = js.native
    def updateSchedule(params: UpdateScheduleRequest): Request[UpdateScheduleResponse] = js.native
  }
  object DataBrew {
    @inline implicit def toOps(service: DataBrew): DataBrewOps = {
      new DataBrewOps(service)
    }
  }

  /** Configuration of statistics that are allowed to be run on columns that contain detected entities. When undefined, no statistics will be computed on columns that contain detected entities.
    */
  @js.native
  trait AllowedStatistics extends js.Object {
    var Statistics: StatisticList
  }

  object AllowedStatistics {
    @inline
    def apply(
        Statistics: StatisticList
    ): AllowedStatistics = {
      val __obj = js.Dynamic.literal(
        "Statistics" -> Statistics.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AllowedStatistics]
    }
  }

  @js.native
  trait BatchDeleteRecipeVersionRequest extends js.Object {
    var Name: RecipeName
    var RecipeVersions: RecipeVersionList
  }

  object BatchDeleteRecipeVersionRequest {
    @inline
    def apply(
        Name: RecipeName,
        RecipeVersions: RecipeVersionList
    ): BatchDeleteRecipeVersionRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RecipeVersions" -> RecipeVersions.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDeleteRecipeVersionRequest]
    }
  }

  @js.native
  trait BatchDeleteRecipeVersionResponse extends js.Object {
    var Name: RecipeName
    var Errors: js.UndefOr[RecipeErrorList]
  }

  object BatchDeleteRecipeVersionResponse {
    @inline
    def apply(
        Name: RecipeName,
        Errors: js.UndefOr[RecipeErrorList] = js.undefined
    ): BatchDeleteRecipeVersionResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteRecipeVersionResponse]
    }
  }

  /** Selector of a column from a dataset for profile job configuration. One selector includes either a column name or a regular expression.
    */
  @js.native
  trait ColumnSelector extends js.Object {
    var Name: js.UndefOr[ColumnName]
    var Regex: js.UndefOr[ColumnName]
  }

  object ColumnSelector {
    @inline
    def apply(
        Name: js.UndefOr[ColumnName] = js.undefined,
        Regex: js.UndefOr[ColumnName] = js.undefined
    ): ColumnSelector = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Regex.foreach(__v => __obj.updateDynamic("Regex")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnSelector]
    }
  }

  /** Configuration for column evaluations for a profile job. ColumnStatisticsConfiguration can be used to select evaluations and override parameters of evaluations for particular columns.
    */
  @js.native
  trait ColumnStatisticsConfiguration extends js.Object {
    var Statistics: StatisticsConfiguration
    var Selectors: js.UndefOr[ColumnSelectorList]
  }

  object ColumnStatisticsConfiguration {
    @inline
    def apply(
        Statistics: StatisticsConfiguration,
        Selectors: js.UndefOr[ColumnSelectorList] = js.undefined
    ): ColumnStatisticsConfiguration = {
      val __obj = js.Dynamic.literal(
        "Statistics" -> Statistics.asInstanceOf[js.Any]
      )

      Selectors.foreach(__v => __obj.updateDynamic("Selectors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnStatisticsConfiguration]
    }
  }

  /** Represents an individual condition that evaluates to true or false. Conditions are used with recipe actions. The action is only performed for column values where the condition evaluates to true. If a recipe requires more than one condition, then the recipe must specify multiple <code>ConditionExpression</code> elements. Each condition is applied to the rows in a dataset first, before the recipe action is performed.
    */
  @js.native
  trait ConditionExpression extends js.Object {
    var Condition: Condition
    var TargetColumn: TargetColumn
    var Value: js.UndefOr[ConditionValue]
  }

  object ConditionExpression {
    @inline
    def apply(
        Condition: Condition,
        TargetColumn: TargetColumn,
        Value: js.UndefOr[ConditionValue] = js.undefined
    ): ConditionExpression = {
      val __obj = js.Dynamic.literal(
        "Condition" -> Condition.asInstanceOf[js.Any],
        "TargetColumn" -> TargetColumn.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConditionExpression]
    }
  }

  @js.native
  trait CreateDatasetRequest extends js.Object {
    var Input: Input
    var Name: DatasetName
    var Format: js.UndefOr[InputFormat]
    var FormatOptions: js.UndefOr[FormatOptions]
    var PathOptions: js.UndefOr[PathOptions]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateDatasetRequest {
    @inline
    def apply(
        Input: Input,
        Name: DatasetName,
        Format: js.UndefOr[InputFormat] = js.undefined,
        FormatOptions: js.UndefOr[FormatOptions] = js.undefined,
        PathOptions: js.UndefOr[PathOptions] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "Input" -> Input.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      FormatOptions.foreach(__v => __obj.updateDynamic("FormatOptions")(__v.asInstanceOf[js.Any]))
      PathOptions.foreach(__v => __obj.updateDynamic("PathOptions")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetRequest]
    }
  }

  @js.native
  trait CreateDatasetResponse extends js.Object {
    var Name: DatasetName
  }

  object CreateDatasetResponse {
    @inline
    def apply(
        Name: DatasetName
    ): CreateDatasetResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateDatasetResponse]
    }
  }

  @js.native
  trait CreateProfileJobRequest extends js.Object {
    var DatasetName: DatasetName
    var Name: JobName
    var OutputLocation: S3Location
    var RoleArn: Arn
    var Configuration: js.UndefOr[ProfileConfiguration]
    var EncryptionKeyArn: js.UndefOr[EncryptionKeyArn]
    var EncryptionMode: js.UndefOr[EncryptionMode]
    var JobSample: js.UndefOr[JobSample]
    var LogSubscription: js.UndefOr[LogSubscription]
    var MaxCapacity: js.UndefOr[MaxCapacity]
    var MaxRetries: js.UndefOr[MaxRetries]
    var Tags: js.UndefOr[TagMap]
    var Timeout: js.UndefOr[Timeout]
    var ValidationConfigurations: js.UndefOr[ValidationConfigurationList]
  }

  object CreateProfileJobRequest {
    @inline
    def apply(
        DatasetName: DatasetName,
        Name: JobName,
        OutputLocation: S3Location,
        RoleArn: Arn,
        Configuration: js.UndefOr[ProfileConfiguration] = js.undefined,
        EncryptionKeyArn: js.UndefOr[EncryptionKeyArn] = js.undefined,
        EncryptionMode: js.UndefOr[EncryptionMode] = js.undefined,
        JobSample: js.UndefOr[JobSample] = js.undefined,
        LogSubscription: js.UndefOr[LogSubscription] = js.undefined,
        MaxCapacity: js.UndefOr[MaxCapacity] = js.undefined,
        MaxRetries: js.UndefOr[MaxRetries] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined,
        ValidationConfigurations: js.UndefOr[ValidationConfigurationList] = js.undefined
    ): CreateProfileJobRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetName" -> DatasetName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "OutputLocation" -> OutputLocation.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      EncryptionKeyArn.foreach(__v => __obj.updateDynamic("EncryptionKeyArn")(__v.asInstanceOf[js.Any]))
      EncryptionMode.foreach(__v => __obj.updateDynamic("EncryptionMode")(__v.asInstanceOf[js.Any]))
      JobSample.foreach(__v => __obj.updateDynamic("JobSample")(__v.asInstanceOf[js.Any]))
      LogSubscription.foreach(__v => __obj.updateDynamic("LogSubscription")(__v.asInstanceOf[js.Any]))
      MaxCapacity.foreach(__v => __obj.updateDynamic("MaxCapacity")(__v.asInstanceOf[js.Any]))
      MaxRetries.foreach(__v => __obj.updateDynamic("MaxRetries")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      ValidationConfigurations.foreach(__v => __obj.updateDynamic("ValidationConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProfileJobRequest]
    }
  }

  @js.native
  trait CreateProfileJobResponse extends js.Object {
    var Name: JobName
  }

  object CreateProfileJobResponse {
    @inline
    def apply(
        Name: JobName
    ): CreateProfileJobResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateProfileJobResponse]
    }
  }

  @js.native
  trait CreateProjectRequest extends js.Object {
    var DatasetName: DatasetName
    var Name: ProjectName
    var RecipeName: RecipeName
    var RoleArn: Arn
    var Sample: js.UndefOr[Sample]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateProjectRequest {
    @inline
    def apply(
        DatasetName: DatasetName,
        Name: ProjectName,
        RecipeName: RecipeName,
        RoleArn: Arn,
        Sample: js.UndefOr[Sample] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateProjectRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetName" -> DatasetName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "RecipeName" -> RecipeName.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      Sample.foreach(__v => __obj.updateDynamic("Sample")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProjectRequest]
    }
  }

  @js.native
  trait CreateProjectResponse extends js.Object {
    var Name: ProjectName
  }

  object CreateProjectResponse {
    @inline
    def apply(
        Name: ProjectName
    ): CreateProjectResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateProjectResponse]
    }
  }

  @js.native
  trait CreateRecipeJobRequest extends js.Object {
    var Name: JobName
    var RoleArn: Arn
    var DataCatalogOutputs: js.UndefOr[DataCatalogOutputList]
    var DatabaseOutputs: js.UndefOr[DatabaseOutputList]
    var DatasetName: js.UndefOr[DatasetName]
    var EncryptionKeyArn: js.UndefOr[EncryptionKeyArn]
    var EncryptionMode: js.UndefOr[EncryptionMode]
    var LogSubscription: js.UndefOr[LogSubscription]
    var MaxCapacity: js.UndefOr[MaxCapacity]
    var MaxRetries: js.UndefOr[MaxRetries]
    var Outputs: js.UndefOr[OutputList]
    var ProjectName: js.UndefOr[ProjectName]
    var RecipeReference: js.UndefOr[RecipeReference]
    var Tags: js.UndefOr[TagMap]
    var Timeout: js.UndefOr[Timeout]
  }

  object CreateRecipeJobRequest {
    @inline
    def apply(
        Name: JobName,
        RoleArn: Arn,
        DataCatalogOutputs: js.UndefOr[DataCatalogOutputList] = js.undefined,
        DatabaseOutputs: js.UndefOr[DatabaseOutputList] = js.undefined,
        DatasetName: js.UndefOr[DatasetName] = js.undefined,
        EncryptionKeyArn: js.UndefOr[EncryptionKeyArn] = js.undefined,
        EncryptionMode: js.UndefOr[EncryptionMode] = js.undefined,
        LogSubscription: js.UndefOr[LogSubscription] = js.undefined,
        MaxCapacity: js.UndefOr[MaxCapacity] = js.undefined,
        MaxRetries: js.UndefOr[MaxRetries] = js.undefined,
        Outputs: js.UndefOr[OutputList] = js.undefined,
        ProjectName: js.UndefOr[ProjectName] = js.undefined,
        RecipeReference: js.UndefOr[RecipeReference] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined
    ): CreateRecipeJobRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      DataCatalogOutputs.foreach(__v => __obj.updateDynamic("DataCatalogOutputs")(__v.asInstanceOf[js.Any]))
      DatabaseOutputs.foreach(__v => __obj.updateDynamic("DatabaseOutputs")(__v.asInstanceOf[js.Any]))
      DatasetName.foreach(__v => __obj.updateDynamic("DatasetName")(__v.asInstanceOf[js.Any]))
      EncryptionKeyArn.foreach(__v => __obj.updateDynamic("EncryptionKeyArn")(__v.asInstanceOf[js.Any]))
      EncryptionMode.foreach(__v => __obj.updateDynamic("EncryptionMode")(__v.asInstanceOf[js.Any]))
      LogSubscription.foreach(__v => __obj.updateDynamic("LogSubscription")(__v.asInstanceOf[js.Any]))
      MaxCapacity.foreach(__v => __obj.updateDynamic("MaxCapacity")(__v.asInstanceOf[js.Any]))
      MaxRetries.foreach(__v => __obj.updateDynamic("MaxRetries")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      ProjectName.foreach(__v => __obj.updateDynamic("ProjectName")(__v.asInstanceOf[js.Any]))
      RecipeReference.foreach(__v => __obj.updateDynamic("RecipeReference")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRecipeJobRequest]
    }
  }

  @js.native
  trait CreateRecipeJobResponse extends js.Object {
    var Name: JobName
  }

  object CreateRecipeJobResponse {
    @inline
    def apply(
        Name: JobName
    ): CreateRecipeJobResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateRecipeJobResponse]
    }
  }

  @js.native
  trait CreateRecipeRequest extends js.Object {
    var Name: RecipeName
    var Steps: RecipeStepList
    var Description: js.UndefOr[RecipeDescription]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateRecipeRequest {
    @inline
    def apply(
        Name: RecipeName,
        Steps: RecipeStepList,
        Description: js.UndefOr[RecipeDescription] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateRecipeRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Steps" -> Steps.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRecipeRequest]
    }
  }

  @js.native
  trait CreateRecipeResponse extends js.Object {
    var Name: RecipeName
  }

  object CreateRecipeResponse {
    @inline
    def apply(
        Name: RecipeName
    ): CreateRecipeResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateRecipeResponse]
    }
  }

  @js.native
  trait CreateRulesetRequest extends js.Object {
    var Name: RulesetName
    var Rules: RuleList
    var TargetArn: Arn
    var Description: js.UndefOr[RulesetDescription]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateRulesetRequest {
    @inline
    def apply(
        Name: RulesetName,
        Rules: RuleList,
        TargetArn: Arn,
        Description: js.UndefOr[RulesetDescription] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateRulesetRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Rules" -> Rules.asInstanceOf[js.Any],
        "TargetArn" -> TargetArn.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRulesetRequest]
    }
  }

  @js.native
  trait CreateRulesetResponse extends js.Object {
    var Name: RulesetName
  }

  object CreateRulesetResponse {
    @inline
    def apply(
        Name: RulesetName
    ): CreateRulesetResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateRulesetResponse]
    }
  }

  @js.native
  trait CreateScheduleRequest extends js.Object {
    var CronExpression: CronExpression
    var Name: ScheduleName
    var JobNames: js.UndefOr[JobNameList]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateScheduleRequest {
    @inline
    def apply(
        CronExpression: CronExpression,
        Name: ScheduleName,
        JobNames: js.UndefOr[JobNameList] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "CronExpression" -> CronExpression.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      JobNames.foreach(__v => __obj.updateDynamic("JobNames")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateScheduleRequest]
    }
  }

  @js.native
  trait CreateScheduleResponse extends js.Object {
    var Name: ScheduleName
  }

  object CreateScheduleResponse {
    @inline
    def apply(
        Name: ScheduleName
    ): CreateScheduleResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateScheduleResponse]
    }
  }

  /** Represents a set of options that define how DataBrew will read a comma-separated value (CSV) file when creating a dataset from that file.
    */
  @js.native
  trait CsvOptions extends js.Object {
    var Delimiter: js.UndefOr[Delimiter]
    var HeaderRow: js.UndefOr[HeaderRow]
  }

  object CsvOptions {
    @inline
    def apply(
        Delimiter: js.UndefOr[Delimiter] = js.undefined,
        HeaderRow: js.UndefOr[HeaderRow] = js.undefined
    ): CsvOptions = {
      val __obj = js.Dynamic.literal()
      Delimiter.foreach(__v => __obj.updateDynamic("Delimiter")(__v.asInstanceOf[js.Any]))
      HeaderRow.foreach(__v => __obj.updateDynamic("HeaderRow")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CsvOptions]
    }
  }

  /** Represents a set of options that define how DataBrew will write a comma-separated value (CSV) file.
    */
  @js.native
  trait CsvOutputOptions extends js.Object {
    var Delimiter: js.UndefOr[Delimiter]
  }

  object CsvOutputOptions {
    @inline
    def apply(
        Delimiter: js.UndefOr[Delimiter] = js.undefined
    ): CsvOutputOptions = {
      val __obj = js.Dynamic.literal()
      Delimiter.foreach(__v => __obj.updateDynamic("Delimiter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CsvOutputOptions]
    }
  }

  /** Represents how metadata stored in the Glue Data Catalog is defined in a DataBrew dataset.
    */
  @js.native
  trait DataCatalogInputDefinition extends js.Object {
    var DatabaseName: DatabaseName
    var TableName: TableName
    var CatalogId: js.UndefOr[CatalogId]
    var TempDirectory: js.UndefOr[S3Location]
  }

  object DataCatalogInputDefinition {
    @inline
    def apply(
        DatabaseName: DatabaseName,
        TableName: TableName,
        CatalogId: js.UndefOr[CatalogId] = js.undefined,
        TempDirectory: js.UndefOr[S3Location] = js.undefined
    ): DataCatalogInputDefinition = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      TempDirectory.foreach(__v => __obj.updateDynamic("TempDirectory")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataCatalogInputDefinition]
    }
  }

  /** Represents options that specify how and where in the Glue Data Catalog DataBrew writes the output generated by recipe jobs.
    */
  @js.native
  trait DataCatalogOutput extends js.Object {
    var DatabaseName: DatabaseName
    var TableName: TableName
    var CatalogId: js.UndefOr[CatalogId]
    var DatabaseOptions: js.UndefOr[DatabaseTableOutputOptions]
    var Overwrite: js.UndefOr[OverwriteOutput]
    var S3Options: js.UndefOr[S3TableOutputOptions]
  }

  object DataCatalogOutput {
    @inline
    def apply(
        DatabaseName: DatabaseName,
        TableName: TableName,
        CatalogId: js.UndefOr[CatalogId] = js.undefined,
        DatabaseOptions: js.UndefOr[DatabaseTableOutputOptions] = js.undefined,
        Overwrite: js.UndefOr[OverwriteOutput] = js.undefined,
        S3Options: js.UndefOr[S3TableOutputOptions] = js.undefined
    ): DataCatalogOutput = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      DatabaseOptions.foreach(__v => __obj.updateDynamic("DatabaseOptions")(__v.asInstanceOf[js.Any]))
      Overwrite.foreach(__v => __obj.updateDynamic("Overwrite")(__v.asInstanceOf[js.Any]))
      S3Options.foreach(__v => __obj.updateDynamic("S3Options")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataCatalogOutput]
    }
  }

  /** Connection information for dataset input files stored in a database.
    */
  @js.native
  trait DatabaseInputDefinition extends js.Object {
    var GlueConnectionName: GlueConnectionName
    var DatabaseTableName: js.UndefOr[DatabaseTableName]
    var QueryString: js.UndefOr[QueryString]
    var TempDirectory: js.UndefOr[S3Location]
  }

  object DatabaseInputDefinition {
    @inline
    def apply(
        GlueConnectionName: GlueConnectionName,
        DatabaseTableName: js.UndefOr[DatabaseTableName] = js.undefined,
        QueryString: js.UndefOr[QueryString] = js.undefined,
        TempDirectory: js.UndefOr[S3Location] = js.undefined
    ): DatabaseInputDefinition = {
      val __obj = js.Dynamic.literal(
        "GlueConnectionName" -> GlueConnectionName.asInstanceOf[js.Any]
      )

      DatabaseTableName.foreach(__v => __obj.updateDynamic("DatabaseTableName")(__v.asInstanceOf[js.Any]))
      QueryString.foreach(__v => __obj.updateDynamic("QueryString")(__v.asInstanceOf[js.Any]))
      TempDirectory.foreach(__v => __obj.updateDynamic("TempDirectory")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatabaseInputDefinition]
    }
  }

  /** Represents a JDBC database output object which defines the output destination for a DataBrew recipe job to write into.
    */
  @js.native
  trait DatabaseOutput extends js.Object {
    var DatabaseOptions: DatabaseTableOutputOptions
    var GlueConnectionName: GlueConnectionName
    var DatabaseOutputMode: js.UndefOr[DatabaseOutputMode]
  }

  object DatabaseOutput {
    @inline
    def apply(
        DatabaseOptions: DatabaseTableOutputOptions,
        GlueConnectionName: GlueConnectionName,
        DatabaseOutputMode: js.UndefOr[DatabaseOutputMode] = js.undefined
    ): DatabaseOutput = {
      val __obj = js.Dynamic.literal(
        "DatabaseOptions" -> DatabaseOptions.asInstanceOf[js.Any],
        "GlueConnectionName" -> GlueConnectionName.asInstanceOf[js.Any]
      )

      DatabaseOutputMode.foreach(__v => __obj.updateDynamic("DatabaseOutputMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatabaseOutput]
    }
  }

  /** Represents options that specify how and where DataBrew writes the database output generated by recipe jobs.
    */
  @js.native
  trait DatabaseTableOutputOptions extends js.Object {
    var TableName: DatabaseTableName
    var TempDirectory: js.UndefOr[S3Location]
  }

  object DatabaseTableOutputOptions {
    @inline
    def apply(
        TableName: DatabaseTableName,
        TempDirectory: js.UndefOr[S3Location] = js.undefined
    ): DatabaseTableOutputOptions = {
      val __obj = js.Dynamic.literal(
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      TempDirectory.foreach(__v => __obj.updateDynamic("TempDirectory")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatabaseTableOutputOptions]
    }
  }

  /** Represents a dataset that can be processed by DataBrew.
    */
  @js.native
  trait Dataset extends js.Object {
    var Input: Input
    var Name: DatasetName
    var AccountId: js.UndefOr[AccountId]
    var CreateDate: js.UndefOr[Date]
    var CreatedBy: js.UndefOr[CreatedBy]
    var Format: js.UndefOr[InputFormat]
    var FormatOptions: js.UndefOr[FormatOptions]
    var LastModifiedBy: js.UndefOr[LastModifiedBy]
    var LastModifiedDate: js.UndefOr[Date]
    var PathOptions: js.UndefOr[PathOptions]
    var ResourceArn: js.UndefOr[Arn]
    var Source: js.UndefOr[Source]
    var Tags: js.UndefOr[TagMap]
  }

  object Dataset {
    @inline
    def apply(
        Input: Input,
        Name: DatasetName,
        AccountId: js.UndefOr[AccountId] = js.undefined,
        CreateDate: js.UndefOr[Date] = js.undefined,
        CreatedBy: js.UndefOr[CreatedBy] = js.undefined,
        Format: js.UndefOr[InputFormat] = js.undefined,
        FormatOptions: js.UndefOr[FormatOptions] = js.undefined,
        LastModifiedBy: js.UndefOr[LastModifiedBy] = js.undefined,
        LastModifiedDate: js.UndefOr[Date] = js.undefined,
        PathOptions: js.UndefOr[PathOptions] = js.undefined,
        ResourceArn: js.UndefOr[Arn] = js.undefined,
        Source: js.UndefOr[Source] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): Dataset = {
      val __obj = js.Dynamic.literal(
        "Input" -> Input.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      FormatOptions.foreach(__v => __obj.updateDynamic("FormatOptions")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      PathOptions.foreach(__v => __obj.updateDynamic("PathOptions")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Dataset]
    }
  }

  /** Represents a dataset paramater that defines type and conditions for a parameter in the Amazon S3 path of the dataset.
    */
  @js.native
  trait DatasetParameter extends js.Object {
    var Name: PathParameterName
    var Type: ParameterType
    var CreateColumn: js.UndefOr[CreateColumn]
    var DatetimeOptions: js.UndefOr[DatetimeOptions]
    var Filter: js.UndefOr[FilterExpression]
  }

  object DatasetParameter {
    @inline
    def apply(
        Name: PathParameterName,
        Type: ParameterType,
        CreateColumn: js.UndefOr[CreateColumn] = js.undefined,
        DatetimeOptions: js.UndefOr[DatetimeOptions] = js.undefined,
        Filter: js.UndefOr[FilterExpression] = js.undefined
    ): DatasetParameter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      CreateColumn.foreach(__v => __obj.updateDynamic("CreateColumn")(__v.asInstanceOf[js.Any]))
      DatetimeOptions.foreach(__v => __obj.updateDynamic("DatetimeOptions")(__v.asInstanceOf[js.Any]))
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetParameter]
    }
  }

  /** Represents additional options for correct interpretation of datetime parameters used in the Amazon S3 path of a dataset.
    */
  @js.native
  trait DatetimeOptions extends js.Object {
    var Format: DatetimeFormat
    var LocaleCode: js.UndefOr[LocaleCode]
    var TimezoneOffset: js.UndefOr[TimezoneOffset]
  }

  object DatetimeOptions {
    @inline
    def apply(
        Format: DatetimeFormat,
        LocaleCode: js.UndefOr[LocaleCode] = js.undefined,
        TimezoneOffset: js.UndefOr[TimezoneOffset] = js.undefined
    ): DatetimeOptions = {
      val __obj = js.Dynamic.literal(
        "Format" -> Format.asInstanceOf[js.Any]
      )

      LocaleCode.foreach(__v => __obj.updateDynamic("LocaleCode")(__v.asInstanceOf[js.Any]))
      TimezoneOffset.foreach(__v => __obj.updateDynamic("TimezoneOffset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatetimeOptions]
    }
  }

  @js.native
  trait DeleteDatasetRequest extends js.Object {
    var Name: DatasetName
  }

  object DeleteDatasetRequest {
    @inline
    def apply(
        Name: DatasetName
    ): DeleteDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDatasetRequest]
    }
  }

  @js.native
  trait DeleteDatasetResponse extends js.Object {
    var Name: DatasetName
  }

  object DeleteDatasetResponse {
    @inline
    def apply(
        Name: DatasetName
    ): DeleteDatasetResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDatasetResponse]
    }
  }

  @js.native
  trait DeleteJobRequest extends js.Object {
    var Name: JobName
  }

  object DeleteJobRequest {
    @inline
    def apply(
        Name: JobName
    ): DeleteJobRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteJobRequest]
    }
  }

  @js.native
  trait DeleteJobResponse extends js.Object {
    var Name: JobName
  }

  object DeleteJobResponse {
    @inline
    def apply(
        Name: JobName
    ): DeleteJobResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteJobResponse]
    }
  }

  @js.native
  trait DeleteProjectRequest extends js.Object {
    var Name: ProjectName
  }

  object DeleteProjectRequest {
    @inline
    def apply(
        Name: ProjectName
    ): DeleteProjectRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteProjectRequest]
    }
  }

  @js.native
  trait DeleteProjectResponse extends js.Object {
    var Name: ProjectName
  }

  object DeleteProjectResponse {
    @inline
    def apply(
        Name: ProjectName
    ): DeleteProjectResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteProjectResponse]
    }
  }

  @js.native
  trait DeleteRecipeVersionRequest extends js.Object {
    var Name: RecipeName
    var RecipeVersion: RecipeVersion
  }

  object DeleteRecipeVersionRequest {
    @inline
    def apply(
        Name: RecipeName,
        RecipeVersion: RecipeVersion
    ): DeleteRecipeVersionRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RecipeVersion" -> RecipeVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRecipeVersionRequest]
    }
  }

  @js.native
  trait DeleteRecipeVersionResponse extends js.Object {
    var Name: RecipeName
    var RecipeVersion: RecipeVersion
  }

  object DeleteRecipeVersionResponse {
    @inline
    def apply(
        Name: RecipeName,
        RecipeVersion: RecipeVersion
    ): DeleteRecipeVersionResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RecipeVersion" -> RecipeVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRecipeVersionResponse]
    }
  }

  @js.native
  trait DeleteRulesetRequest extends js.Object {
    var Name: RulesetName
  }

  object DeleteRulesetRequest {
    @inline
    def apply(
        Name: RulesetName
    ): DeleteRulesetRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRulesetRequest]
    }
  }

  @js.native
  trait DeleteRulesetResponse extends js.Object {
    var Name: RulesetName
  }

  object DeleteRulesetResponse {
    @inline
    def apply(
        Name: RulesetName
    ): DeleteRulesetResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRulesetResponse]
    }
  }

  @js.native
  trait DeleteScheduleRequest extends js.Object {
    var Name: ScheduleName
  }

  object DeleteScheduleRequest {
    @inline
    def apply(
        Name: ScheduleName
    ): DeleteScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteScheduleRequest]
    }
  }

  @js.native
  trait DeleteScheduleResponse extends js.Object {
    var Name: ScheduleName
  }

  object DeleteScheduleResponse {
    @inline
    def apply(
        Name: ScheduleName
    ): DeleteScheduleResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteScheduleResponse]
    }
  }

  @js.native
  trait DescribeDatasetRequest extends js.Object {
    var Name: DatasetName
  }

  object DescribeDatasetRequest {
    @inline
    def apply(
        Name: DatasetName
    ): DescribeDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDatasetRequest]
    }
  }

  @js.native
  trait DescribeDatasetResponse extends js.Object {
    var Input: Input
    var Name: DatasetName
    var CreateDate: js.UndefOr[Date]
    var CreatedBy: js.UndefOr[CreatedBy]
    var Format: js.UndefOr[InputFormat]
    var FormatOptions: js.UndefOr[FormatOptions]
    var LastModifiedBy: js.UndefOr[LastModifiedBy]
    var LastModifiedDate: js.UndefOr[Date]
    var PathOptions: js.UndefOr[PathOptions]
    var ResourceArn: js.UndefOr[Arn]
    var Source: js.UndefOr[Source]
    var Tags: js.UndefOr[TagMap]
  }

  object DescribeDatasetResponse {
    @inline
    def apply(
        Input: Input,
        Name: DatasetName,
        CreateDate: js.UndefOr[Date] = js.undefined,
        CreatedBy: js.UndefOr[CreatedBy] = js.undefined,
        Format: js.UndefOr[InputFormat] = js.undefined,
        FormatOptions: js.UndefOr[FormatOptions] = js.undefined,
        LastModifiedBy: js.UndefOr[LastModifiedBy] = js.undefined,
        LastModifiedDate: js.UndefOr[Date] = js.undefined,
        PathOptions: js.UndefOr[PathOptions] = js.undefined,
        ResourceArn: js.UndefOr[Arn] = js.undefined,
        Source: js.UndefOr[Source] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): DescribeDatasetResponse = {
      val __obj = js.Dynamic.literal(
        "Input" -> Input.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      FormatOptions.foreach(__v => __obj.updateDynamic("FormatOptions")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      PathOptions.foreach(__v => __obj.updateDynamic("PathOptions")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDatasetResponse]
    }
  }

  @js.native
  trait DescribeJobRequest extends js.Object {
    var Name: JobName
  }

  object DescribeJobRequest {
    @inline
    def apply(
        Name: JobName
    ): DescribeJobRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeJobRequest]
    }
  }

  @js.native
  trait DescribeJobResponse extends js.Object {
    var Name: JobName
    var CreateDate: js.UndefOr[Date]
    var CreatedBy: js.UndefOr[CreatedBy]
    var DataCatalogOutputs: js.UndefOr[DataCatalogOutputList]
    var DatabaseOutputs: js.UndefOr[DatabaseOutputList]
    var DatasetName: js.UndefOr[DatasetName]
    var EncryptionKeyArn: js.UndefOr[EncryptionKeyArn]
    var EncryptionMode: js.UndefOr[EncryptionMode]
    var JobSample: js.UndefOr[JobSample]
    var LastModifiedBy: js.UndefOr[LastModifiedBy]
    var LastModifiedDate: js.UndefOr[Date]
    var LogSubscription: js.UndefOr[LogSubscription]
    var MaxCapacity: js.UndefOr[MaxCapacity]
    var MaxRetries: js.UndefOr[MaxRetries]
    var Outputs: js.UndefOr[OutputList]
    var ProfileConfiguration: js.UndefOr[ProfileConfiguration]
    var ProjectName: js.UndefOr[ProjectName]
    var RecipeReference: js.UndefOr[RecipeReference]
    var ResourceArn: js.UndefOr[Arn]
    var RoleArn: js.UndefOr[Arn]
    var Tags: js.UndefOr[TagMap]
    var Timeout: js.UndefOr[Timeout]
    var Type: js.UndefOr[JobType]
    var ValidationConfigurations: js.UndefOr[ValidationConfigurationList]
  }

  object DescribeJobResponse {
    @inline
    def apply(
        Name: JobName,
        CreateDate: js.UndefOr[Date] = js.undefined,
        CreatedBy: js.UndefOr[CreatedBy] = js.undefined,
        DataCatalogOutputs: js.UndefOr[DataCatalogOutputList] = js.undefined,
        DatabaseOutputs: js.UndefOr[DatabaseOutputList] = js.undefined,
        DatasetName: js.UndefOr[DatasetName] = js.undefined,
        EncryptionKeyArn: js.UndefOr[EncryptionKeyArn] = js.undefined,
        EncryptionMode: js.UndefOr[EncryptionMode] = js.undefined,
        JobSample: js.UndefOr[JobSample] = js.undefined,
        LastModifiedBy: js.UndefOr[LastModifiedBy] = js.undefined,
        LastModifiedDate: js.UndefOr[Date] = js.undefined,
        LogSubscription: js.UndefOr[LogSubscription] = js.undefined,
        MaxCapacity: js.UndefOr[MaxCapacity] = js.undefined,
        MaxRetries: js.UndefOr[MaxRetries] = js.undefined,
        Outputs: js.UndefOr[OutputList] = js.undefined,
        ProfileConfiguration: js.UndefOr[ProfileConfiguration] = js.undefined,
        ProjectName: js.UndefOr[ProjectName] = js.undefined,
        RecipeReference: js.UndefOr[RecipeReference] = js.undefined,
        ResourceArn: js.UndefOr[Arn] = js.undefined,
        RoleArn: js.UndefOr[Arn] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined,
        Type: js.UndefOr[JobType] = js.undefined,
        ValidationConfigurations: js.UndefOr[ValidationConfigurationList] = js.undefined
    ): DescribeJobResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      DataCatalogOutputs.foreach(__v => __obj.updateDynamic("DataCatalogOutputs")(__v.asInstanceOf[js.Any]))
      DatabaseOutputs.foreach(__v => __obj.updateDynamic("DatabaseOutputs")(__v.asInstanceOf[js.Any]))
      DatasetName.foreach(__v => __obj.updateDynamic("DatasetName")(__v.asInstanceOf[js.Any]))
      EncryptionKeyArn.foreach(__v => __obj.updateDynamic("EncryptionKeyArn")(__v.asInstanceOf[js.Any]))
      EncryptionMode.foreach(__v => __obj.updateDynamic("EncryptionMode")(__v.asInstanceOf[js.Any]))
      JobSample.foreach(__v => __obj.updateDynamic("JobSample")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      LogSubscription.foreach(__v => __obj.updateDynamic("LogSubscription")(__v.asInstanceOf[js.Any]))
      MaxCapacity.foreach(__v => __obj.updateDynamic("MaxCapacity")(__v.asInstanceOf[js.Any]))
      MaxRetries.foreach(__v => __obj.updateDynamic("MaxRetries")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      ProfileConfiguration.foreach(__v => __obj.updateDynamic("ProfileConfiguration")(__v.asInstanceOf[js.Any]))
      ProjectName.foreach(__v => __obj.updateDynamic("ProjectName")(__v.asInstanceOf[js.Any]))
      RecipeReference.foreach(__v => __obj.updateDynamic("RecipeReference")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      ValidationConfigurations.foreach(__v => __obj.updateDynamic("ValidationConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobResponse]
    }
  }

  @js.native
  trait DescribeJobRunRequest extends js.Object {
    var Name: JobName
    var RunId: JobRunId
  }

  object DescribeJobRunRequest {
    @inline
    def apply(
        Name: JobName,
        RunId: JobRunId
    ): DescribeJobRunRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RunId" -> RunId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeJobRunRequest]
    }
  }

  @js.native
  trait DescribeJobRunResponse extends js.Object {
    var JobName: JobName
    var Attempt: js.UndefOr[Attempt]
    var CompletedOn: js.UndefOr[Date]
    var DataCatalogOutputs: js.UndefOr[DataCatalogOutputList]
    var DatabaseOutputs: js.UndefOr[DatabaseOutputList]
    var DatasetName: js.UndefOr[DatasetName]
    var ErrorMessage: js.UndefOr[JobRunErrorMessage]
    var ExecutionTime: js.UndefOr[ExecutionTime]
    var JobSample: js.UndefOr[JobSample]
    var LogGroupName: js.UndefOr[LogGroupName]
    var LogSubscription: js.UndefOr[LogSubscription]
    var Outputs: js.UndefOr[OutputList]
    var ProfileConfiguration: js.UndefOr[ProfileConfiguration]
    var RecipeReference: js.UndefOr[RecipeReference]
    var RunId: js.UndefOr[JobRunId]
    var StartedBy: js.UndefOr[StartedBy]
    var StartedOn: js.UndefOr[Date]
    var State: js.UndefOr[JobRunState]
    var ValidationConfigurations: js.UndefOr[ValidationConfigurationList]
  }

  object DescribeJobRunResponse {
    @inline
    def apply(
        JobName: JobName,
        Attempt: js.UndefOr[Attempt] = js.undefined,
        CompletedOn: js.UndefOr[Date] = js.undefined,
        DataCatalogOutputs: js.UndefOr[DataCatalogOutputList] = js.undefined,
        DatabaseOutputs: js.UndefOr[DatabaseOutputList] = js.undefined,
        DatasetName: js.UndefOr[DatasetName] = js.undefined,
        ErrorMessage: js.UndefOr[JobRunErrorMessage] = js.undefined,
        ExecutionTime: js.UndefOr[ExecutionTime] = js.undefined,
        JobSample: js.UndefOr[JobSample] = js.undefined,
        LogGroupName: js.UndefOr[LogGroupName] = js.undefined,
        LogSubscription: js.UndefOr[LogSubscription] = js.undefined,
        Outputs: js.UndefOr[OutputList] = js.undefined,
        ProfileConfiguration: js.UndefOr[ProfileConfiguration] = js.undefined,
        RecipeReference: js.UndefOr[RecipeReference] = js.undefined,
        RunId: js.UndefOr[JobRunId] = js.undefined,
        StartedBy: js.UndefOr[StartedBy] = js.undefined,
        StartedOn: js.UndefOr[Date] = js.undefined,
        State: js.UndefOr[JobRunState] = js.undefined,
        ValidationConfigurations: js.UndefOr[ValidationConfigurationList] = js.undefined
    ): DescribeJobRunResponse = {
      val __obj = js.Dynamic.literal(
        "JobName" -> JobName.asInstanceOf[js.Any]
      )

      Attempt.foreach(__v => __obj.updateDynamic("Attempt")(__v.asInstanceOf[js.Any]))
      CompletedOn.foreach(__v => __obj.updateDynamic("CompletedOn")(__v.asInstanceOf[js.Any]))
      DataCatalogOutputs.foreach(__v => __obj.updateDynamic("DataCatalogOutputs")(__v.asInstanceOf[js.Any]))
      DatabaseOutputs.foreach(__v => __obj.updateDynamic("DatabaseOutputs")(__v.asInstanceOf[js.Any]))
      DatasetName.foreach(__v => __obj.updateDynamic("DatasetName")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      ExecutionTime.foreach(__v => __obj.updateDynamic("ExecutionTime")(__v.asInstanceOf[js.Any]))
      JobSample.foreach(__v => __obj.updateDynamic("JobSample")(__v.asInstanceOf[js.Any]))
      LogGroupName.foreach(__v => __obj.updateDynamic("LogGroupName")(__v.asInstanceOf[js.Any]))
      LogSubscription.foreach(__v => __obj.updateDynamic("LogSubscription")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      ProfileConfiguration.foreach(__v => __obj.updateDynamic("ProfileConfiguration")(__v.asInstanceOf[js.Any]))
      RecipeReference.foreach(__v => __obj.updateDynamic("RecipeReference")(__v.asInstanceOf[js.Any]))
      RunId.foreach(__v => __obj.updateDynamic("RunId")(__v.asInstanceOf[js.Any]))
      StartedBy.foreach(__v => __obj.updateDynamic("StartedBy")(__v.asInstanceOf[js.Any]))
      StartedOn.foreach(__v => __obj.updateDynamic("StartedOn")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      ValidationConfigurations.foreach(__v => __obj.updateDynamic("ValidationConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobRunResponse]
    }
  }

  @js.native
  trait DescribeProjectRequest extends js.Object {
    var Name: ProjectName
  }

  object DescribeProjectRequest {
    @inline
    def apply(
        Name: ProjectName
    ): DescribeProjectRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeProjectRequest]
    }
  }

  @js.native
  trait DescribeProjectResponse extends js.Object {
    var Name: ProjectName
    var CreateDate: js.UndefOr[Date]
    var CreatedBy: js.UndefOr[CreatedBy]
    var DatasetName: js.UndefOr[DatasetName]
    var LastModifiedBy: js.UndefOr[LastModifiedBy]
    var LastModifiedDate: js.UndefOr[Date]
    var OpenDate: js.UndefOr[Date]
    var OpenedBy: js.UndefOr[OpenedBy]
    var RecipeName: js.UndefOr[RecipeName]
    var ResourceArn: js.UndefOr[Arn]
    var RoleArn: js.UndefOr[Arn]
    var Sample: js.UndefOr[Sample]
    var SessionStatus: js.UndefOr[SessionStatus]
    var Tags: js.UndefOr[TagMap]
  }

  object DescribeProjectResponse {
    @inline
    def apply(
        Name: ProjectName,
        CreateDate: js.UndefOr[Date] = js.undefined,
        CreatedBy: js.UndefOr[CreatedBy] = js.undefined,
        DatasetName: js.UndefOr[DatasetName] = js.undefined,
        LastModifiedBy: js.UndefOr[LastModifiedBy] = js.undefined,
        LastModifiedDate: js.UndefOr[Date] = js.undefined,
        OpenDate: js.UndefOr[Date] = js.undefined,
        OpenedBy: js.UndefOr[OpenedBy] = js.undefined,
        RecipeName: js.UndefOr[RecipeName] = js.undefined,
        ResourceArn: js.UndefOr[Arn] = js.undefined,
        RoleArn: js.UndefOr[Arn] = js.undefined,
        Sample: js.UndefOr[Sample] = js.undefined,
        SessionStatus: js.UndefOr[SessionStatus] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): DescribeProjectResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      DatasetName.foreach(__v => __obj.updateDynamic("DatasetName")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      OpenDate.foreach(__v => __obj.updateDynamic("OpenDate")(__v.asInstanceOf[js.Any]))
      OpenedBy.foreach(__v => __obj.updateDynamic("OpenedBy")(__v.asInstanceOf[js.Any]))
      RecipeName.foreach(__v => __obj.updateDynamic("RecipeName")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Sample.foreach(__v => __obj.updateDynamic("Sample")(__v.asInstanceOf[js.Any]))
      SessionStatus.foreach(__v => __obj.updateDynamic("SessionStatus")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProjectResponse]
    }
  }

  @js.native
  trait DescribeRecipeRequest extends js.Object {
    var Name: RecipeName
    var RecipeVersion: js.UndefOr[RecipeVersion]
  }

  object DescribeRecipeRequest {
    @inline
    def apply(
        Name: RecipeName,
        RecipeVersion: js.UndefOr[RecipeVersion] = js.undefined
    ): DescribeRecipeRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      RecipeVersion.foreach(__v => __obj.updateDynamic("RecipeVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRecipeRequest]
    }
  }

  @js.native
  trait DescribeRecipeResponse extends js.Object {
    var Name: RecipeName
    var CreateDate: js.UndefOr[Date]
    var CreatedBy: js.UndefOr[CreatedBy]
    var Description: js.UndefOr[RecipeDescription]
    var LastModifiedBy: js.UndefOr[LastModifiedBy]
    var LastModifiedDate: js.UndefOr[Date]
    var ProjectName: js.UndefOr[ProjectName]
    var PublishedBy: js.UndefOr[PublishedBy]
    var PublishedDate: js.UndefOr[Date]
    var RecipeVersion: js.UndefOr[RecipeVersion]
    var ResourceArn: js.UndefOr[Arn]
    var Steps: js.UndefOr[RecipeStepList]
    var Tags: js.UndefOr[TagMap]
  }

  object DescribeRecipeResponse {
    @inline
    def apply(
        Name: RecipeName,
        CreateDate: js.UndefOr[Date] = js.undefined,
        CreatedBy: js.UndefOr[CreatedBy] = js.undefined,
        Description: js.UndefOr[RecipeDescription] = js.undefined,
        LastModifiedBy: js.UndefOr[LastModifiedBy] = js.undefined,
        LastModifiedDate: js.UndefOr[Date] = js.undefined,
        ProjectName: js.UndefOr[ProjectName] = js.undefined,
        PublishedBy: js.UndefOr[PublishedBy] = js.undefined,
        PublishedDate: js.UndefOr[Date] = js.undefined,
        RecipeVersion: js.UndefOr[RecipeVersion] = js.undefined,
        ResourceArn: js.UndefOr[Arn] = js.undefined,
        Steps: js.UndefOr[RecipeStepList] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): DescribeRecipeResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      ProjectName.foreach(__v => __obj.updateDynamic("ProjectName")(__v.asInstanceOf[js.Any]))
      PublishedBy.foreach(__v => __obj.updateDynamic("PublishedBy")(__v.asInstanceOf[js.Any]))
      PublishedDate.foreach(__v => __obj.updateDynamic("PublishedDate")(__v.asInstanceOf[js.Any]))
      RecipeVersion.foreach(__v => __obj.updateDynamic("RecipeVersion")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      Steps.foreach(__v => __obj.updateDynamic("Steps")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRecipeResponse]
    }
  }

  @js.native
  trait DescribeRulesetRequest extends js.Object {
    var Name: RulesetName
  }

  object DescribeRulesetRequest {
    @inline
    def apply(
        Name: RulesetName
    ): DescribeRulesetRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeRulesetRequest]
    }
  }

  @js.native
  trait DescribeRulesetResponse extends js.Object {
    var Name: RulesetName
    var CreateDate: js.UndefOr[Date]
    var CreatedBy: js.UndefOr[CreatedBy]
    var Description: js.UndefOr[RulesetDescription]
    var LastModifiedBy: js.UndefOr[LastModifiedBy]
    var LastModifiedDate: js.UndefOr[Date]
    var ResourceArn: js.UndefOr[Arn]
    var Rules: js.UndefOr[RuleList]
    var Tags: js.UndefOr[TagMap]
    var TargetArn: js.UndefOr[Arn]
  }

  object DescribeRulesetResponse {
    @inline
    def apply(
        Name: RulesetName,
        CreateDate: js.UndefOr[Date] = js.undefined,
        CreatedBy: js.UndefOr[CreatedBy] = js.undefined,
        Description: js.UndefOr[RulesetDescription] = js.undefined,
        LastModifiedBy: js.UndefOr[LastModifiedBy] = js.undefined,
        LastModifiedDate: js.UndefOr[Date] = js.undefined,
        ResourceArn: js.UndefOr[Arn] = js.undefined,
        Rules: js.UndefOr[RuleList] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        TargetArn: js.UndefOr[Arn] = js.undefined
    ): DescribeRulesetResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TargetArn.foreach(__v => __obj.updateDynamic("TargetArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRulesetResponse]
    }
  }

  @js.native
  trait DescribeScheduleRequest extends js.Object {
    var Name: ScheduleName
  }

  object DescribeScheduleRequest {
    @inline
    def apply(
        Name: ScheduleName
    ): DescribeScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeScheduleRequest]
    }
  }

  @js.native
  trait DescribeScheduleResponse extends js.Object {
    var Name: ScheduleName
    var CreateDate: js.UndefOr[Date]
    var CreatedBy: js.UndefOr[CreatedBy]
    var CronExpression: js.UndefOr[CronExpression]
    var JobNames: js.UndefOr[JobNameList]
    var LastModifiedBy: js.UndefOr[LastModifiedBy]
    var LastModifiedDate: js.UndefOr[Date]
    var ResourceArn: js.UndefOr[Arn]
    var Tags: js.UndefOr[TagMap]
  }

  object DescribeScheduleResponse {
    @inline
    def apply(
        Name: ScheduleName,
        CreateDate: js.UndefOr[Date] = js.undefined,
        CreatedBy: js.UndefOr[CreatedBy] = js.undefined,
        CronExpression: js.UndefOr[CronExpression] = js.undefined,
        JobNames: js.UndefOr[JobNameList] = js.undefined,
        LastModifiedBy: js.UndefOr[LastModifiedBy] = js.undefined,
        LastModifiedDate: js.UndefOr[Date] = js.undefined,
        ResourceArn: js.UndefOr[Arn] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): DescribeScheduleResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CronExpression.foreach(__v => __obj.updateDynamic("CronExpression")(__v.asInstanceOf[js.Any]))
      JobNames.foreach(__v => __obj.updateDynamic("JobNames")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScheduleResponse]
    }
  }

  /** Configuration of entity detection for a profile job. When undefined, entity detection is disabled.
    */
  @js.native
  trait EntityDetectorConfiguration extends js.Object {
    var EntityTypes: EntityTypeList
    var AllowedStatistics: js.UndefOr[AllowedStatisticList]
  }

  object EntityDetectorConfiguration {
    @inline
    def apply(
        EntityTypes: EntityTypeList,
        AllowedStatistics: js.UndefOr[AllowedStatisticList] = js.undefined
    ): EntityDetectorConfiguration = {
      val __obj = js.Dynamic.literal(
        "EntityTypes" -> EntityTypes.asInstanceOf[js.Any]
      )

      AllowedStatistics.foreach(__v => __obj.updateDynamic("AllowedStatistics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityDetectorConfiguration]
    }
  }

  /** Represents a set of options that define how DataBrew will interpret a Microsoft Excel file when creating a dataset from that file.
    */
  @js.native
  trait ExcelOptions extends js.Object {
    var HeaderRow: js.UndefOr[HeaderRow]
    var SheetIndexes: js.UndefOr[SheetIndexList]
    var SheetNames: js.UndefOr[SheetNameList]
  }

  object ExcelOptions {
    @inline
    def apply(
        HeaderRow: js.UndefOr[HeaderRow] = js.undefined,
        SheetIndexes: js.UndefOr[SheetIndexList] = js.undefined,
        SheetNames: js.UndefOr[SheetNameList] = js.undefined
    ): ExcelOptions = {
      val __obj = js.Dynamic.literal()
      HeaderRow.foreach(__v => __obj.updateDynamic("HeaderRow")(__v.asInstanceOf[js.Any]))
      SheetIndexes.foreach(__v => __obj.updateDynamic("SheetIndexes")(__v.asInstanceOf[js.Any]))
      SheetNames.foreach(__v => __obj.updateDynamic("SheetNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExcelOptions]
    }
  }

  /** Represents a limit imposed on number of Amazon S3 files that should be selected for a dataset from a connected Amazon S3 path.
    */
  @js.native
  trait FilesLimit extends js.Object {
    var MaxFiles: MaxFiles
    var Order: js.UndefOr[Order]
    var OrderedBy: js.UndefOr[OrderedBy]
  }

  object FilesLimit {
    @inline
    def apply(
        MaxFiles: MaxFiles,
        Order: js.UndefOr[Order] = js.undefined,
        OrderedBy: js.UndefOr[OrderedBy] = js.undefined
    ): FilesLimit = {
      val __obj = js.Dynamic.literal(
        "MaxFiles" -> MaxFiles.asInstanceOf[js.Any]
      )

      Order.foreach(__v => __obj.updateDynamic("Order")(__v.asInstanceOf[js.Any]))
      OrderedBy.foreach(__v => __obj.updateDynamic("OrderedBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilesLimit]
    }
  }

  /** Represents a structure for defining parameter conditions. Supported conditions are described here: [[https://docs.aws.amazon.com/databrew/latest/dg/datasets.multiple-files.html#conditions.for.dynamic.datasets|Supported conditions for dynamic datasets]] in the <i>Glue DataBrew Developer Guide</i>.
    */
  @js.native
  trait FilterExpression extends js.Object {
    var Expression: Expression
    var ValuesMap: ValuesMap
  }

  object FilterExpression {
    @inline
    def apply(
        Expression: Expression,
        ValuesMap: ValuesMap
    ): FilterExpression = {
      val __obj = js.Dynamic.literal(
        "Expression" -> Expression.asInstanceOf[js.Any],
        "ValuesMap" -> ValuesMap.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FilterExpression]
    }
  }

  /** Represents a set of options that define the structure of either comma-separated value (CSV), Excel, or JSON input.
    */
  @js.native
  trait FormatOptions extends js.Object {
    var Csv: js.UndefOr[CsvOptions]
    var Excel: js.UndefOr[ExcelOptions]
    var Json: js.UndefOr[JsonOptions]
  }

  object FormatOptions {
    @inline
    def apply(
        Csv: js.UndefOr[CsvOptions] = js.undefined,
        Excel: js.UndefOr[ExcelOptions] = js.undefined,
        Json: js.UndefOr[JsonOptions] = js.undefined
    ): FormatOptions = {
      val __obj = js.Dynamic.literal()
      Csv.foreach(__v => __obj.updateDynamic("Csv")(__v.asInstanceOf[js.Any]))
      Excel.foreach(__v => __obj.updateDynamic("Excel")(__v.asInstanceOf[js.Any]))
      Json.foreach(__v => __obj.updateDynamic("Json")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FormatOptions]
    }
  }

  /** Represents information on how DataBrew can find data, in either the Glue Data Catalog or Amazon S3.
    */
  @js.native
  trait Input extends js.Object {
    var DataCatalogInputDefinition: js.UndefOr[DataCatalogInputDefinition]
    var DatabaseInputDefinition: js.UndefOr[DatabaseInputDefinition]
    var Metadata: js.UndefOr[Metadata]
    var S3InputDefinition: js.UndefOr[S3Location]
  }

  object Input {
    @inline
    def apply(
        DataCatalogInputDefinition: js.UndefOr[DataCatalogInputDefinition] = js.undefined,
        DatabaseInputDefinition: js.UndefOr[DatabaseInputDefinition] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        S3InputDefinition: js.UndefOr[S3Location] = js.undefined
    ): Input = {
      val __obj = js.Dynamic.literal()
      DataCatalogInputDefinition.foreach(__v => __obj.updateDynamic("DataCatalogInputDefinition")(__v.asInstanceOf[js.Any]))
      DatabaseInputDefinition.foreach(__v => __obj.updateDynamic("DatabaseInputDefinition")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      S3InputDefinition.foreach(__v => __obj.updateDynamic("S3InputDefinition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Input]
    }
  }

  /** Represents all of the attributes of a DataBrew job.
    */
  @js.native
  trait Job extends js.Object {
    var Name: JobName
    var AccountId: js.UndefOr[AccountId]
    var CreateDate: js.UndefOr[Date]
    var CreatedBy: js.UndefOr[CreatedBy]
    var DataCatalogOutputs: js.UndefOr[DataCatalogOutputList]
    var DatabaseOutputs: js.UndefOr[DatabaseOutputList]
    var DatasetName: js.UndefOr[DatasetName]
    var EncryptionKeyArn: js.UndefOr[EncryptionKeyArn]
    var EncryptionMode: js.UndefOr[EncryptionMode]
    var JobSample: js.UndefOr[JobSample]
    var LastModifiedBy: js.UndefOr[LastModifiedBy]
    var LastModifiedDate: js.UndefOr[Date]
    var LogSubscription: js.UndefOr[LogSubscription]
    var MaxCapacity: js.UndefOr[MaxCapacity]
    var MaxRetries: js.UndefOr[MaxRetries]
    var Outputs: js.UndefOr[OutputList]
    var ProjectName: js.UndefOr[ProjectName]
    var RecipeReference: js.UndefOr[RecipeReference]
    var ResourceArn: js.UndefOr[Arn]
    var RoleArn: js.UndefOr[Arn]
    var Tags: js.UndefOr[TagMap]
    var Timeout: js.UndefOr[Timeout]
    var Type: js.UndefOr[JobType]
    var ValidationConfigurations: js.UndefOr[ValidationConfigurationList]
  }

  object Job {
    @inline
    def apply(
        Name: JobName,
        AccountId: js.UndefOr[AccountId] = js.undefined,
        CreateDate: js.UndefOr[Date] = js.undefined,
        CreatedBy: js.UndefOr[CreatedBy] = js.undefined,
        DataCatalogOutputs: js.UndefOr[DataCatalogOutputList] = js.undefined,
        DatabaseOutputs: js.UndefOr[DatabaseOutputList] = js.undefined,
        DatasetName: js.UndefOr[DatasetName] = js.undefined,
        EncryptionKeyArn: js.UndefOr[EncryptionKeyArn] = js.undefined,
        EncryptionMode: js.UndefOr[EncryptionMode] = js.undefined,
        JobSample: js.UndefOr[JobSample] = js.undefined,
        LastModifiedBy: js.UndefOr[LastModifiedBy] = js.undefined,
        LastModifiedDate: js.UndefOr[Date] = js.undefined,
        LogSubscription: js.UndefOr[LogSubscription] = js.undefined,
        MaxCapacity: js.UndefOr[MaxCapacity] = js.undefined,
        MaxRetries: js.UndefOr[MaxRetries] = js.undefined,
        Outputs: js.UndefOr[OutputList] = js.undefined,
        ProjectName: js.UndefOr[ProjectName] = js.undefined,
        RecipeReference: js.UndefOr[RecipeReference] = js.undefined,
        ResourceArn: js.UndefOr[Arn] = js.undefined,
        RoleArn: js.UndefOr[Arn] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined,
        Type: js.UndefOr[JobType] = js.undefined,
        ValidationConfigurations: js.UndefOr[ValidationConfigurationList] = js.undefined
    ): Job = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      DataCatalogOutputs.foreach(__v => __obj.updateDynamic("DataCatalogOutputs")(__v.asInstanceOf[js.Any]))
      DatabaseOutputs.foreach(__v => __obj.updateDynamic("DatabaseOutputs")(__v.asInstanceOf[js.Any]))
      DatasetName.foreach(__v => __obj.updateDynamic("DatasetName")(__v.asInstanceOf[js.Any]))
      EncryptionKeyArn.foreach(__v => __obj.updateDynamic("EncryptionKeyArn")(__v.asInstanceOf[js.Any]))
      EncryptionMode.foreach(__v => __obj.updateDynamic("EncryptionMode")(__v.asInstanceOf[js.Any]))
      JobSample.foreach(__v => __obj.updateDynamic("JobSample")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      LogSubscription.foreach(__v => __obj.updateDynamic("LogSubscription")(__v.asInstanceOf[js.Any]))
      MaxCapacity.foreach(__v => __obj.updateDynamic("MaxCapacity")(__v.asInstanceOf[js.Any]))
      MaxRetries.foreach(__v => __obj.updateDynamic("MaxRetries")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      ProjectName.foreach(__v => __obj.updateDynamic("ProjectName")(__v.asInstanceOf[js.Any]))
      RecipeReference.foreach(__v => __obj.updateDynamic("RecipeReference")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      ValidationConfigurations.foreach(__v => __obj.updateDynamic("ValidationConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Job]
    }
  }

  /** Represents one run of a DataBrew job.
    */
  @js.native
  trait JobRun extends js.Object {
    var Attempt: js.UndefOr[Attempt]
    var CompletedOn: js.UndefOr[Date]
    var DataCatalogOutputs: js.UndefOr[DataCatalogOutputList]
    var DatabaseOutputs: js.UndefOr[DatabaseOutputList]
    var DatasetName: js.UndefOr[DatasetName]
    var ErrorMessage: js.UndefOr[JobRunErrorMessage]
    var ExecutionTime: js.UndefOr[ExecutionTime]
    var JobName: js.UndefOr[JobName]
    var JobSample: js.UndefOr[JobSample]
    var LogGroupName: js.UndefOr[LogGroupName]
    var LogSubscription: js.UndefOr[LogSubscription]
    var Outputs: js.UndefOr[OutputList]
    var RecipeReference: js.UndefOr[RecipeReference]
    var RunId: js.UndefOr[JobRunId]
    var StartedBy: js.UndefOr[StartedBy]
    var StartedOn: js.UndefOr[Date]
    var State: js.UndefOr[JobRunState]
    var ValidationConfigurations: js.UndefOr[ValidationConfigurationList]
  }

  object JobRun {
    @inline
    def apply(
        Attempt: js.UndefOr[Attempt] = js.undefined,
        CompletedOn: js.UndefOr[Date] = js.undefined,
        DataCatalogOutputs: js.UndefOr[DataCatalogOutputList] = js.undefined,
        DatabaseOutputs: js.UndefOr[DatabaseOutputList] = js.undefined,
        DatasetName: js.UndefOr[DatasetName] = js.undefined,
        ErrorMessage: js.UndefOr[JobRunErrorMessage] = js.undefined,
        ExecutionTime: js.UndefOr[ExecutionTime] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobSample: js.UndefOr[JobSample] = js.undefined,
        LogGroupName: js.UndefOr[LogGroupName] = js.undefined,
        LogSubscription: js.UndefOr[LogSubscription] = js.undefined,
        Outputs: js.UndefOr[OutputList] = js.undefined,
        RecipeReference: js.UndefOr[RecipeReference] = js.undefined,
        RunId: js.UndefOr[JobRunId] = js.undefined,
        StartedBy: js.UndefOr[StartedBy] = js.undefined,
        StartedOn: js.UndefOr[Date] = js.undefined,
        State: js.UndefOr[JobRunState] = js.undefined,
        ValidationConfigurations: js.UndefOr[ValidationConfigurationList] = js.undefined
    ): JobRun = {
      val __obj = js.Dynamic.literal()
      Attempt.foreach(__v => __obj.updateDynamic("Attempt")(__v.asInstanceOf[js.Any]))
      CompletedOn.foreach(__v => __obj.updateDynamic("CompletedOn")(__v.asInstanceOf[js.Any]))
      DataCatalogOutputs.foreach(__v => __obj.updateDynamic("DataCatalogOutputs")(__v.asInstanceOf[js.Any]))
      DatabaseOutputs.foreach(__v => __obj.updateDynamic("DatabaseOutputs")(__v.asInstanceOf[js.Any]))
      DatasetName.foreach(__v => __obj.updateDynamic("DatasetName")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      ExecutionTime.foreach(__v => __obj.updateDynamic("ExecutionTime")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobSample.foreach(__v => __obj.updateDynamic("JobSample")(__v.asInstanceOf[js.Any]))
      LogGroupName.foreach(__v => __obj.updateDynamic("LogGroupName")(__v.asInstanceOf[js.Any]))
      LogSubscription.foreach(__v => __obj.updateDynamic("LogSubscription")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      RecipeReference.foreach(__v => __obj.updateDynamic("RecipeReference")(__v.asInstanceOf[js.Any]))
      RunId.foreach(__v => __obj.updateDynamic("RunId")(__v.asInstanceOf[js.Any]))
      StartedBy.foreach(__v => __obj.updateDynamic("StartedBy")(__v.asInstanceOf[js.Any]))
      StartedOn.foreach(__v => __obj.updateDynamic("StartedOn")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      ValidationConfigurations.foreach(__v => __obj.updateDynamic("ValidationConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobRun]
    }
  }

  /** A sample configuration for profile jobs only, which determines the number of rows on which the profile job is run. If a <code>JobSample</code> value isn't provided, the default is used. The default value is CUSTOM_ROWS for the mode parameter and 20,000 for the size parameter.
    */
  @js.native
  trait JobSample extends js.Object {
    var Mode: js.UndefOr[SampleMode]
    var Size: js.UndefOr[JobSize]
  }

  object JobSample {
    @inline
    def apply(
        Mode: js.UndefOr[SampleMode] = js.undefined,
        Size: js.UndefOr[JobSize] = js.undefined
    ): JobSample = {
      val __obj = js.Dynamic.literal()
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.updateDynamic("Size")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobSample]
    }
  }

  /** Represents the JSON-specific options that define how input is to be interpreted by Glue DataBrew.
    */
  @js.native
  trait JsonOptions extends js.Object {
    var MultiLine: js.UndefOr[MultiLine]
  }

  object JsonOptions {
    @inline
    def apply(
        MultiLine: js.UndefOr[MultiLine] = js.undefined
    ): JsonOptions = {
      val __obj = js.Dynamic.literal()
      MultiLine.foreach(__v => __obj.updateDynamic("MultiLine")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JsonOptions]
    }
  }

  @js.native
  trait ListDatasetsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults100]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDatasetsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatasetsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetsRequest]
    }
  }

  @js.native
  trait ListDatasetsResponse extends js.Object {
    var Datasets: DatasetList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDatasetsResponse {
    @inline
    def apply(
        Datasets: DatasetList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatasetsResponse = {
      val __obj = js.Dynamic.literal(
        "Datasets" -> Datasets.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetsResponse]
    }
  }

  @js.native
  trait ListJobRunsRequest extends js.Object {
    var Name: JobName
    var MaxResults: js.UndefOr[MaxResults100]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListJobRunsRequest {
    @inline
    def apply(
        Name: JobName,
        MaxResults: js.UndefOr[MaxResults100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListJobRunsRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobRunsRequest]
    }
  }

  @js.native
  trait ListJobRunsResponse extends js.Object {
    var JobRuns: JobRunList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListJobRunsResponse {
    @inline
    def apply(
        JobRuns: JobRunList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListJobRunsResponse = {
      val __obj = js.Dynamic.literal(
        "JobRuns" -> JobRuns.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobRunsResponse]
    }
  }

  @js.native
  trait ListJobsRequest extends js.Object {
    var DatasetName: js.UndefOr[DatasetName]
    var MaxResults: js.UndefOr[MaxResults100]
    var NextToken: js.UndefOr[NextToken]
    var ProjectName: js.UndefOr[ProjectName]
  }

  object ListJobsRequest {
    @inline
    def apply(
        DatasetName: js.UndefOr[DatasetName] = js.undefined,
        MaxResults: js.UndefOr[MaxResults100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ProjectName: js.UndefOr[ProjectName] = js.undefined
    ): ListJobsRequest = {
      val __obj = js.Dynamic.literal()
      DatasetName.foreach(__v => __obj.updateDynamic("DatasetName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProjectName.foreach(__v => __obj.updateDynamic("ProjectName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsRequest]
    }
  }

  @js.native
  trait ListJobsResponse extends js.Object {
    var Jobs: JobList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListJobsResponse {
    @inline
    def apply(
        Jobs: JobList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListJobsResponse = {
      val __obj = js.Dynamic.literal(
        "Jobs" -> Jobs.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsResponse]
    }
  }

  @js.native
  trait ListProjectsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults100]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListProjectsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListProjectsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectsRequest]
    }
  }

  @js.native
  trait ListProjectsResponse extends js.Object {
    var Projects: ProjectList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListProjectsResponse {
    @inline
    def apply(
        Projects: ProjectList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListProjectsResponse = {
      val __obj = js.Dynamic.literal(
        "Projects" -> Projects.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectsResponse]
    }
  }

  @js.native
  trait ListRecipeVersionsRequest extends js.Object {
    var Name: RecipeName
    var MaxResults: js.UndefOr[MaxResults100]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRecipeVersionsRequest {
    @inline
    def apply(
        Name: RecipeName,
        MaxResults: js.UndefOr[MaxResults100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRecipeVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecipeVersionsRequest]
    }
  }

  @js.native
  trait ListRecipeVersionsResponse extends js.Object {
    var Recipes: RecipeList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRecipeVersionsResponse {
    @inline
    def apply(
        Recipes: RecipeList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRecipeVersionsResponse = {
      val __obj = js.Dynamic.literal(
        "Recipes" -> Recipes.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecipeVersionsResponse]
    }
  }

  @js.native
  trait ListRecipesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults100]
    var NextToken: js.UndefOr[NextToken]
    var RecipeVersion: js.UndefOr[RecipeVersion]
  }

  object ListRecipesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RecipeVersion: js.UndefOr[RecipeVersion] = js.undefined
    ): ListRecipesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RecipeVersion.foreach(__v => __obj.updateDynamic("RecipeVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecipesRequest]
    }
  }

  @js.native
  trait ListRecipesResponse extends js.Object {
    var Recipes: RecipeList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRecipesResponse {
    @inline
    def apply(
        Recipes: RecipeList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRecipesResponse = {
      val __obj = js.Dynamic.literal(
        "Recipes" -> Recipes.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecipesResponse]
    }
  }

  @js.native
  trait ListRulesetsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults100]
    var NextToken: js.UndefOr[NextToken]
    var TargetArn: js.UndefOr[Arn]
  }

  object ListRulesetsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TargetArn: js.UndefOr[Arn] = js.undefined
    ): ListRulesetsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TargetArn.foreach(__v => __obj.updateDynamic("TargetArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRulesetsRequest]
    }
  }

  @js.native
  trait ListRulesetsResponse extends js.Object {
    var Rulesets: RulesetItemList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRulesetsResponse {
    @inline
    def apply(
        Rulesets: RulesetItemList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRulesetsResponse = {
      val __obj = js.Dynamic.literal(
        "Rulesets" -> Rulesets.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRulesetsResponse]
    }
  }

  @js.native
  trait ListSchedulesRequest extends js.Object {
    var JobName: js.UndefOr[JobName]
    var MaxResults: js.UndefOr[MaxResults100]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSchedulesRequest {
    @inline
    def apply(
        JobName: js.UndefOr[JobName] = js.undefined,
        MaxResults: js.UndefOr[MaxResults100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSchedulesRequest = {
      val __obj = js.Dynamic.literal()
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSchedulesRequest]
    }
  }

  @js.native
  trait ListSchedulesResponse extends js.Object {
    var Schedules: ScheduleList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSchedulesResponse {
    @inline
    def apply(
        Schedules: ScheduleList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSchedulesResponse = {
      val __obj = js.Dynamic.literal(
        "Schedules" -> Schedules.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSchedulesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Contains additional resource information needed for specific datasets.
    */
  @js.native
  trait Metadata extends js.Object {
    var SourceArn: js.UndefOr[Arn]
  }

  object Metadata {
    @inline
    def apply(
        SourceArn: js.UndefOr[Arn] = js.undefined
    ): Metadata = {
      val __obj = js.Dynamic.literal()
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Metadata]
    }
  }

  /** Represents options that specify how and where in Amazon S3 DataBrew writes the output generated by recipe jobs or profile jobs.
    */
  @js.native
  trait Output extends js.Object {
    var Location: S3Location
    var CompressionFormat: js.UndefOr[CompressionFormat]
    var Format: js.UndefOr[OutputFormat]
    var FormatOptions: js.UndefOr[OutputFormatOptions]
    var Overwrite: js.UndefOr[OverwriteOutput]
    var PartitionColumns: js.UndefOr[ColumnNameList]
  }

  object Output {
    @inline
    def apply(
        Location: S3Location,
        CompressionFormat: js.UndefOr[CompressionFormat] = js.undefined,
        Format: js.UndefOr[OutputFormat] = js.undefined,
        FormatOptions: js.UndefOr[OutputFormatOptions] = js.undefined,
        Overwrite: js.UndefOr[OverwriteOutput] = js.undefined,
        PartitionColumns: js.UndefOr[ColumnNameList] = js.undefined
    ): Output = {
      val __obj = js.Dynamic.literal(
        "Location" -> Location.asInstanceOf[js.Any]
      )

      CompressionFormat.foreach(__v => __obj.updateDynamic("CompressionFormat")(__v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      FormatOptions.foreach(__v => __obj.updateDynamic("FormatOptions")(__v.asInstanceOf[js.Any]))
      Overwrite.foreach(__v => __obj.updateDynamic("Overwrite")(__v.asInstanceOf[js.Any]))
      PartitionColumns.foreach(__v => __obj.updateDynamic("PartitionColumns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Output]
    }
  }

  /** Represents a set of options that define the structure of comma-separated (CSV) job output.
    */
  @js.native
  trait OutputFormatOptions extends js.Object {
    var Csv: js.UndefOr[CsvOutputOptions]
  }

  object OutputFormatOptions {
    @inline
    def apply(
        Csv: js.UndefOr[CsvOutputOptions] = js.undefined
    ): OutputFormatOptions = {
      val __obj = js.Dynamic.literal()
      Csv.foreach(__v => __obj.updateDynamic("Csv")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputFormatOptions]
    }
  }

  /** Represents a set of options that define how DataBrew selects files for a given Amazon S3 path in a dataset.
    */
  @js.native
  trait PathOptions extends js.Object {
    var FilesLimit: js.UndefOr[FilesLimit]
    var LastModifiedDateCondition: js.UndefOr[FilterExpression]
    var Parameters: js.UndefOr[PathParametersMap]
  }

  object PathOptions {
    @inline
    def apply(
        FilesLimit: js.UndefOr[FilesLimit] = js.undefined,
        LastModifiedDateCondition: js.UndefOr[FilterExpression] = js.undefined,
        Parameters: js.UndefOr[PathParametersMap] = js.undefined
    ): PathOptions = {
      val __obj = js.Dynamic.literal()
      FilesLimit.foreach(__v => __obj.updateDynamic("FilesLimit")(__v.asInstanceOf[js.Any]))
      LastModifiedDateCondition.foreach(__v => __obj.updateDynamic("LastModifiedDateCondition")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PathOptions]
    }
  }

  /** Configuration for profile jobs. Configuration can be used to select columns, do evaluations, and override default parameters of evaluations. When configuration is undefined, the profile job will apply default settings to all supported columns.
    */
  @js.native
  trait ProfileConfiguration extends js.Object {
    var ColumnStatisticsConfigurations: js.UndefOr[ColumnStatisticsConfigurationList]
    var DatasetStatisticsConfiguration: js.UndefOr[StatisticsConfiguration]
    var EntityDetectorConfiguration: js.UndefOr[EntityDetectorConfiguration]
    var ProfileColumns: js.UndefOr[ColumnSelectorList]
  }

  object ProfileConfiguration {
    @inline
    def apply(
        ColumnStatisticsConfigurations: js.UndefOr[ColumnStatisticsConfigurationList] = js.undefined,
        DatasetStatisticsConfiguration: js.UndefOr[StatisticsConfiguration] = js.undefined,
        EntityDetectorConfiguration: js.UndefOr[EntityDetectorConfiguration] = js.undefined,
        ProfileColumns: js.UndefOr[ColumnSelectorList] = js.undefined
    ): ProfileConfiguration = {
      val __obj = js.Dynamic.literal()
      ColumnStatisticsConfigurations.foreach(__v => __obj.updateDynamic("ColumnStatisticsConfigurations")(__v.asInstanceOf[js.Any]))
      DatasetStatisticsConfiguration.foreach(__v => __obj.updateDynamic("DatasetStatisticsConfiguration")(__v.asInstanceOf[js.Any]))
      EntityDetectorConfiguration.foreach(__v => __obj.updateDynamic("EntityDetectorConfiguration")(__v.asInstanceOf[js.Any]))
      ProfileColumns.foreach(__v => __obj.updateDynamic("ProfileColumns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProfileConfiguration]
    }
  }

  /** Represents all of the attributes of a DataBrew project.
    */
  @js.native
  trait Project extends js.Object {
    var Name: ProjectName
    var RecipeName: RecipeName
    var AccountId: js.UndefOr[AccountId]
    var CreateDate: js.UndefOr[Date]
    var CreatedBy: js.UndefOr[CreatedBy]
    var DatasetName: js.UndefOr[DatasetName]
    var LastModifiedBy: js.UndefOr[LastModifiedBy]
    var LastModifiedDate: js.UndefOr[Date]
    var OpenDate: js.UndefOr[Date]
    var OpenedBy: js.UndefOr[OpenedBy]
    var ResourceArn: js.UndefOr[Arn]
    var RoleArn: js.UndefOr[Arn]
    var Sample: js.UndefOr[Sample]
    var Tags: js.UndefOr[TagMap]
  }

  object Project {
    @inline
    def apply(
        Name: ProjectName,
        RecipeName: RecipeName,
        AccountId: js.UndefOr[AccountId] = js.undefined,
        CreateDate: js.UndefOr[Date] = js.undefined,
        CreatedBy: js.UndefOr[CreatedBy] = js.undefined,
        DatasetName: js.UndefOr[DatasetName] = js.undefined,
        LastModifiedBy: js.UndefOr[LastModifiedBy] = js.undefined,
        LastModifiedDate: js.UndefOr[Date] = js.undefined,
        OpenDate: js.UndefOr[Date] = js.undefined,
        OpenedBy: js.UndefOr[OpenedBy] = js.undefined,
        ResourceArn: js.UndefOr[Arn] = js.undefined,
        RoleArn: js.UndefOr[Arn] = js.undefined,
        Sample: js.UndefOr[Sample] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): Project = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RecipeName" -> RecipeName.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      DatasetName.foreach(__v => __obj.updateDynamic("DatasetName")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      OpenDate.foreach(__v => __obj.updateDynamic("OpenDate")(__v.asInstanceOf[js.Any]))
      OpenedBy.foreach(__v => __obj.updateDynamic("OpenedBy")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Sample.foreach(__v => __obj.updateDynamic("Sample")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Project]
    }
  }

  @js.native
  trait PublishRecipeRequest extends js.Object {
    var Name: RecipeName
    var Description: js.UndefOr[RecipeDescription]
  }

  object PublishRecipeRequest {
    @inline
    def apply(
        Name: RecipeName,
        Description: js.UndefOr[RecipeDescription] = js.undefined
    ): PublishRecipeRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublishRecipeRequest]
    }
  }

  @js.native
  trait PublishRecipeResponse extends js.Object {
    var Name: RecipeName
  }

  object PublishRecipeResponse {
    @inline
    def apply(
        Name: RecipeName
    ): PublishRecipeResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PublishRecipeResponse]
    }
  }

  /** Represents one or more actions to be performed on a DataBrew dataset.
    */
  @js.native
  trait Recipe extends js.Object {
    var Name: RecipeName
    var CreateDate: js.UndefOr[Date]
    var CreatedBy: js.UndefOr[CreatedBy]
    var Description: js.UndefOr[RecipeDescription]
    var LastModifiedBy: js.UndefOr[LastModifiedBy]
    var LastModifiedDate: js.UndefOr[Date]
    var ProjectName: js.UndefOr[ProjectName]
    var PublishedBy: js.UndefOr[PublishedBy]
    var PublishedDate: js.UndefOr[Date]
    var RecipeVersion: js.UndefOr[RecipeVersion]
    var ResourceArn: js.UndefOr[Arn]
    var Steps: js.UndefOr[RecipeStepList]
    var Tags: js.UndefOr[TagMap]
  }

  object Recipe {
    @inline
    def apply(
        Name: RecipeName,
        CreateDate: js.UndefOr[Date] = js.undefined,
        CreatedBy: js.UndefOr[CreatedBy] = js.undefined,
        Description: js.UndefOr[RecipeDescription] = js.undefined,
        LastModifiedBy: js.UndefOr[LastModifiedBy] = js.undefined,
        LastModifiedDate: js.UndefOr[Date] = js.undefined,
        ProjectName: js.UndefOr[ProjectName] = js.undefined,
        PublishedBy: js.UndefOr[PublishedBy] = js.undefined,
        PublishedDate: js.UndefOr[Date] = js.undefined,
        RecipeVersion: js.UndefOr[RecipeVersion] = js.undefined,
        ResourceArn: js.UndefOr[Arn] = js.undefined,
        Steps: js.UndefOr[RecipeStepList] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): Recipe = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      ProjectName.foreach(__v => __obj.updateDynamic("ProjectName")(__v.asInstanceOf[js.Any]))
      PublishedBy.foreach(__v => __obj.updateDynamic("PublishedBy")(__v.asInstanceOf[js.Any]))
      PublishedDate.foreach(__v => __obj.updateDynamic("PublishedDate")(__v.asInstanceOf[js.Any]))
      RecipeVersion.foreach(__v => __obj.updateDynamic("RecipeVersion")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      Steps.foreach(__v => __obj.updateDynamic("Steps")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Recipe]
    }
  }

  /** Represents a transformation and associated parameters that are used to apply a change to a DataBrew dataset. For more information, see [[https://docs.aws.amazon.com/databrew/latest/dg/recipe-actions-reference.html|Recipe actions reference]].
    */
  @js.native
  trait RecipeAction extends js.Object {
    var Operation: Operation
    var Parameters: js.UndefOr[ParameterMap]
  }

  object RecipeAction {
    @inline
    def apply(
        Operation: Operation,
        Parameters: js.UndefOr[ParameterMap] = js.undefined
    ): RecipeAction = {
      val __obj = js.Dynamic.literal(
        "Operation" -> Operation.asInstanceOf[js.Any]
      )

      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecipeAction]
    }
  }

  /** Represents the name and version of a DataBrew recipe.
    */
  @js.native
  trait RecipeReference extends js.Object {
    var Name: RecipeName
    var RecipeVersion: js.UndefOr[RecipeVersion]
  }

  object RecipeReference {
    @inline
    def apply(
        Name: RecipeName,
        RecipeVersion: js.UndefOr[RecipeVersion] = js.undefined
    ): RecipeReference = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      RecipeVersion.foreach(__v => __obj.updateDynamic("RecipeVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecipeReference]
    }
  }

  /** Represents a single step from a DataBrew recipe to be performed.
    */
  @js.native
  trait RecipeStep extends js.Object {
    var Action: RecipeAction
    var ConditionExpressions: js.UndefOr[ConditionExpressionList]
  }

  object RecipeStep {
    @inline
    def apply(
        Action: RecipeAction,
        ConditionExpressions: js.UndefOr[ConditionExpressionList] = js.undefined
    ): RecipeStep = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any]
      )

      ConditionExpressions.foreach(__v => __obj.updateDynamic("ConditionExpressions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecipeStep]
    }
  }

  /** Represents any errors encountered when attempting to delete multiple recipe versions.
    */
  @js.native
  trait RecipeVersionErrorDetail extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[RecipeErrorMessage]
    var RecipeVersion: js.UndefOr[RecipeVersion]
  }

  object RecipeVersionErrorDetail {
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[RecipeErrorMessage] = js.undefined,
        RecipeVersion: js.UndefOr[RecipeVersion] = js.undefined
    ): RecipeVersionErrorDetail = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      RecipeVersion.foreach(__v => __obj.updateDynamic("RecipeVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecipeVersionErrorDetail]
    }
  }

  /** Represents a single data quality requirement that should be validated in the scope of this dataset.
    */
  @js.native
  trait Rule extends js.Object {
    var CheckExpression: Expression
    var Name: RuleName
    var ColumnSelectors: js.UndefOr[ColumnSelectorList]
    var Disabled: js.UndefOr[Disabled]
    var SubstitutionMap: js.UndefOr[ValuesMap]
    var Threshold: js.UndefOr[Threshold]
  }

  object Rule {
    @inline
    def apply(
        CheckExpression: Expression,
        Name: RuleName,
        ColumnSelectors: js.UndefOr[ColumnSelectorList] = js.undefined,
        Disabled: js.UndefOr[Disabled] = js.undefined,
        SubstitutionMap: js.UndefOr[ValuesMap] = js.undefined,
        Threshold: js.UndefOr[Threshold] = js.undefined
    ): Rule = {
      val __obj = js.Dynamic.literal(
        "CheckExpression" -> CheckExpression.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ColumnSelectors.foreach(__v => __obj.updateDynamic("ColumnSelectors")(__v.asInstanceOf[js.Any]))
      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      SubstitutionMap.foreach(__v => __obj.updateDynamic("SubstitutionMap")(__v.asInstanceOf[js.Any]))
      Threshold.foreach(__v => __obj.updateDynamic("Threshold")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Rule]
    }
  }

  /** Contains metadata about the ruleset.
    */
  @js.native
  trait RulesetItem extends js.Object {
    var Name: RulesetName
    var TargetArn: Arn
    var AccountId: js.UndefOr[AccountId]
    var CreateDate: js.UndefOr[Date]
    var CreatedBy: js.UndefOr[CreatedBy]
    var Description: js.UndefOr[RulesetDescription]
    var LastModifiedBy: js.UndefOr[LastModifiedBy]
    var LastModifiedDate: js.UndefOr[Date]
    var ResourceArn: js.UndefOr[Arn]
    var RuleCount: js.UndefOr[RuleCount]
    var Tags: js.UndefOr[TagMap]
  }

  object RulesetItem {
    @inline
    def apply(
        Name: RulesetName,
        TargetArn: Arn,
        AccountId: js.UndefOr[AccountId] = js.undefined,
        CreateDate: js.UndefOr[Date] = js.undefined,
        CreatedBy: js.UndefOr[CreatedBy] = js.undefined,
        Description: js.UndefOr[RulesetDescription] = js.undefined,
        LastModifiedBy: js.UndefOr[LastModifiedBy] = js.undefined,
        LastModifiedDate: js.UndefOr[Date] = js.undefined,
        ResourceArn: js.UndefOr[Arn] = js.undefined,
        RuleCount: js.UndefOr[RuleCount] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): RulesetItem = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "TargetArn" -> TargetArn.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      RuleCount.foreach(__v => __obj.updateDynamic("RuleCount")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RulesetItem]
    }
  }

  /** Represents an Amazon S3 location (bucket name and object key) where DataBrew can read input data, or write output from a job.
    */
  @js.native
  trait S3Location extends js.Object {
    var Bucket: Bucket
    var Key: js.UndefOr[Key]
  }

  object S3Location {
    @inline
    def apply(
        Bucket: Bucket,
        Key: js.UndefOr[Key] = js.undefined
    ): S3Location = {
      val __obj = js.Dynamic.literal(
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Location]
    }
  }

  /** Represents options that specify how and where DataBrew writes the Amazon S3 output generated by recipe jobs.
    */
  @js.native
  trait S3TableOutputOptions extends js.Object {
    var Location: S3Location
  }

  object S3TableOutputOptions {
    @inline
    def apply(
        Location: S3Location
    ): S3TableOutputOptions = {
      val __obj = js.Dynamic.literal(
        "Location" -> Location.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3TableOutputOptions]
    }
  }

  /** Represents the sample size and sampling type for DataBrew to use for interactive data analysis.
    */
  @js.native
  trait Sample extends js.Object {
    var Type: SampleType
    var Size: js.UndefOr[SampleSize]
  }

  object Sample {
    @inline
    def apply(
        Type: SampleType,
        Size: js.UndefOr[SampleSize] = js.undefined
    ): Sample = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Size.foreach(__v => __obj.updateDynamic("Size")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Sample]
    }
  }

  /** Represents one or more dates and times when a job is to run.
    */
  @js.native
  trait Schedule extends js.Object {
    var Name: ScheduleName
    var AccountId: js.UndefOr[AccountId]
    var CreateDate: js.UndefOr[Date]
    var CreatedBy: js.UndefOr[CreatedBy]
    var CronExpression: js.UndefOr[CronExpression]
    var JobNames: js.UndefOr[JobNameList]
    var LastModifiedBy: js.UndefOr[LastModifiedBy]
    var LastModifiedDate: js.UndefOr[Date]
    var ResourceArn: js.UndefOr[Arn]
    var Tags: js.UndefOr[TagMap]
  }

  object Schedule {
    @inline
    def apply(
        Name: ScheduleName,
        AccountId: js.UndefOr[AccountId] = js.undefined,
        CreateDate: js.UndefOr[Date] = js.undefined,
        CreatedBy: js.UndefOr[CreatedBy] = js.undefined,
        CronExpression: js.UndefOr[CronExpression] = js.undefined,
        JobNames: js.UndefOr[JobNameList] = js.undefined,
        LastModifiedBy: js.UndefOr[LastModifiedBy] = js.undefined,
        LastModifiedDate: js.UndefOr[Date] = js.undefined,
        ResourceArn: js.UndefOr[Arn] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): Schedule = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CronExpression.foreach(__v => __obj.updateDynamic("CronExpression")(__v.asInstanceOf[js.Any]))
      JobNames.foreach(__v => __obj.updateDynamic("JobNames")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Schedule]
    }
  }

  @js.native
  trait SendProjectSessionActionRequest extends js.Object {
    var Name: ProjectName
    var ClientSessionId: js.UndefOr[ClientSessionId]
    var Preview: js.UndefOr[Preview]
    var RecipeStep: js.UndefOr[RecipeStep]
    var StepIndex: js.UndefOr[StepIndex]
    var ViewFrame: js.UndefOr[ViewFrame]
  }

  object SendProjectSessionActionRequest {
    @inline
    def apply(
        Name: ProjectName,
        ClientSessionId: js.UndefOr[ClientSessionId] = js.undefined,
        Preview: js.UndefOr[Preview] = js.undefined,
        RecipeStep: js.UndefOr[RecipeStep] = js.undefined,
        StepIndex: js.UndefOr[StepIndex] = js.undefined,
        ViewFrame: js.UndefOr[ViewFrame] = js.undefined
    ): SendProjectSessionActionRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ClientSessionId.foreach(__v => __obj.updateDynamic("ClientSessionId")(__v.asInstanceOf[js.Any]))
      Preview.foreach(__v => __obj.updateDynamic("Preview")(__v.asInstanceOf[js.Any]))
      RecipeStep.foreach(__v => __obj.updateDynamic("RecipeStep")(__v.asInstanceOf[js.Any]))
      StepIndex.foreach(__v => __obj.updateDynamic("StepIndex")(__v.asInstanceOf[js.Any]))
      ViewFrame.foreach(__v => __obj.updateDynamic("ViewFrame")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendProjectSessionActionRequest]
    }
  }

  @js.native
  trait SendProjectSessionActionResponse extends js.Object {
    var Name: ProjectName
    var ActionId: js.UndefOr[ActionId]
    var Result: js.UndefOr[Result]
  }

  object SendProjectSessionActionResponse {
    @inline
    def apply(
        Name: ProjectName,
        ActionId: js.UndefOr[ActionId] = js.undefined,
        Result: js.UndefOr[Result] = js.undefined
    ): SendProjectSessionActionResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ActionId.foreach(__v => __obj.updateDynamic("ActionId")(__v.asInstanceOf[js.Any]))
      Result.foreach(__v => __obj.updateDynamic("Result")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendProjectSessionActionResponse]
    }
  }

  @js.native
  trait StartJobRunRequest extends js.Object {
    var Name: JobName
  }

  object StartJobRunRequest {
    @inline
    def apply(
        Name: JobName
    ): StartJobRunRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartJobRunRequest]
    }
  }

  @js.native
  trait StartJobRunResponse extends js.Object {
    var RunId: JobRunId
  }

  object StartJobRunResponse {
    @inline
    def apply(
        RunId: JobRunId
    ): StartJobRunResponse = {
      val __obj = js.Dynamic.literal(
        "RunId" -> RunId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartJobRunResponse]
    }
  }

  @js.native
  trait StartProjectSessionRequest extends js.Object {
    var Name: ProjectName
    var AssumeControl: js.UndefOr[AssumeControl]
  }

  object StartProjectSessionRequest {
    @inline
    def apply(
        Name: ProjectName,
        AssumeControl: js.UndefOr[AssumeControl] = js.undefined
    ): StartProjectSessionRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AssumeControl.foreach(__v => __obj.updateDynamic("AssumeControl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartProjectSessionRequest]
    }
  }

  @js.native
  trait StartProjectSessionResponse extends js.Object {
    var Name: ProjectName
    var ClientSessionId: js.UndefOr[ClientSessionId]
  }

  object StartProjectSessionResponse {
    @inline
    def apply(
        Name: ProjectName,
        ClientSessionId: js.UndefOr[ClientSessionId] = js.undefined
    ): StartProjectSessionResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ClientSessionId.foreach(__v => __obj.updateDynamic("ClientSessionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartProjectSessionResponse]
    }
  }

  /** Override of a particular evaluation for a profile job.
    */
  @js.native
  trait StatisticOverride extends js.Object {
    var Parameters: ParameterMap
    var Statistic: Statistic
  }

  object StatisticOverride {
    @inline
    def apply(
        Parameters: ParameterMap,
        Statistic: Statistic
    ): StatisticOverride = {
      val __obj = js.Dynamic.literal(
        "Parameters" -> Parameters.asInstanceOf[js.Any],
        "Statistic" -> Statistic.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StatisticOverride]
    }
  }

  /** Configuration of evaluations for a profile job. This configuration can be used to select evaluations and override the parameters of selected evaluations.
    */
  @js.native
  trait StatisticsConfiguration extends js.Object {
    var IncludedStatistics: js.UndefOr[StatisticList]
    var Overrides: js.UndefOr[StatisticOverrideList]
  }

  object StatisticsConfiguration {
    @inline
    def apply(
        IncludedStatistics: js.UndefOr[StatisticList] = js.undefined,
        Overrides: js.UndefOr[StatisticOverrideList] = js.undefined
    ): StatisticsConfiguration = {
      val __obj = js.Dynamic.literal()
      IncludedStatistics.foreach(__v => __obj.updateDynamic("IncludedStatistics")(__v.asInstanceOf[js.Any]))
      Overrides.foreach(__v => __obj.updateDynamic("Overrides")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StatisticsConfiguration]
    }
  }

  @js.native
  trait StopJobRunRequest extends js.Object {
    var Name: JobName
    var RunId: JobRunId
  }

  object StopJobRunRequest {
    @inline
    def apply(
        Name: JobName,
        RunId: JobRunId
    ): StopJobRunRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RunId" -> RunId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopJobRunRequest]
    }
  }

  @js.native
  trait StopJobRunResponse extends js.Object {
    var RunId: JobRunId
  }

  object StopJobRunResponse {
    @inline
    def apply(
        RunId: JobRunId
    ): StopJobRunResponse = {
      val __obj = js.Dynamic.literal(
        "RunId" -> RunId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopJobRunResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var Tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        Tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
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

  /** The threshold used with a non-aggregate check expression. The non-aggregate check expression will be applied to each row in a specific column. Then the threshold will be used to determine whether the validation succeeds.
    */
  @js.native
  trait Threshold extends js.Object {
    var Value: ThresholdValue
    var Type: js.UndefOr[ThresholdType]
    var Unit: js.UndefOr[ThresholdUnit]
  }

  object Threshold {
    @inline
    def apply(
        Value: ThresholdValue,
        Type: js.UndefOr[ThresholdType] = js.undefined,
        Unit: js.UndefOr[ThresholdUnit] = js.undefined
    ): Threshold = {
      val __obj = js.Dynamic.literal(
        "Value" -> Value.asInstanceOf[js.Any]
      )

      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Threshold]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
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
  trait UpdateDatasetRequest extends js.Object {
    var Input: Input
    var Name: DatasetName
    var Format: js.UndefOr[InputFormat]
    var FormatOptions: js.UndefOr[FormatOptions]
    var PathOptions: js.UndefOr[PathOptions]
  }

  object UpdateDatasetRequest {
    @inline
    def apply(
        Input: Input,
        Name: DatasetName,
        Format: js.UndefOr[InputFormat] = js.undefined,
        FormatOptions: js.UndefOr[FormatOptions] = js.undefined,
        PathOptions: js.UndefOr[PathOptions] = js.undefined
    ): UpdateDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "Input" -> Input.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      FormatOptions.foreach(__v => __obj.updateDynamic("FormatOptions")(__v.asInstanceOf[js.Any]))
      PathOptions.foreach(__v => __obj.updateDynamic("PathOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDatasetRequest]
    }
  }

  @js.native
  trait UpdateDatasetResponse extends js.Object {
    var Name: DatasetName
  }

  object UpdateDatasetResponse {
    @inline
    def apply(
        Name: DatasetName
    ): UpdateDatasetResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateDatasetResponse]
    }
  }

  @js.native
  trait UpdateProfileJobRequest extends js.Object {
    var Name: JobName
    var OutputLocation: S3Location
    var RoleArn: Arn
    var Configuration: js.UndefOr[ProfileConfiguration]
    var EncryptionKeyArn: js.UndefOr[EncryptionKeyArn]
    var EncryptionMode: js.UndefOr[EncryptionMode]
    var JobSample: js.UndefOr[JobSample]
    var LogSubscription: js.UndefOr[LogSubscription]
    var MaxCapacity: js.UndefOr[MaxCapacity]
    var MaxRetries: js.UndefOr[MaxRetries]
    var Timeout: js.UndefOr[Timeout]
    var ValidationConfigurations: js.UndefOr[ValidationConfigurationList]
  }

  object UpdateProfileJobRequest {
    @inline
    def apply(
        Name: JobName,
        OutputLocation: S3Location,
        RoleArn: Arn,
        Configuration: js.UndefOr[ProfileConfiguration] = js.undefined,
        EncryptionKeyArn: js.UndefOr[EncryptionKeyArn] = js.undefined,
        EncryptionMode: js.UndefOr[EncryptionMode] = js.undefined,
        JobSample: js.UndefOr[JobSample] = js.undefined,
        LogSubscription: js.UndefOr[LogSubscription] = js.undefined,
        MaxCapacity: js.UndefOr[MaxCapacity] = js.undefined,
        MaxRetries: js.UndefOr[MaxRetries] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined,
        ValidationConfigurations: js.UndefOr[ValidationConfigurationList] = js.undefined
    ): UpdateProfileJobRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "OutputLocation" -> OutputLocation.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      EncryptionKeyArn.foreach(__v => __obj.updateDynamic("EncryptionKeyArn")(__v.asInstanceOf[js.Any]))
      EncryptionMode.foreach(__v => __obj.updateDynamic("EncryptionMode")(__v.asInstanceOf[js.Any]))
      JobSample.foreach(__v => __obj.updateDynamic("JobSample")(__v.asInstanceOf[js.Any]))
      LogSubscription.foreach(__v => __obj.updateDynamic("LogSubscription")(__v.asInstanceOf[js.Any]))
      MaxCapacity.foreach(__v => __obj.updateDynamic("MaxCapacity")(__v.asInstanceOf[js.Any]))
      MaxRetries.foreach(__v => __obj.updateDynamic("MaxRetries")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      ValidationConfigurations.foreach(__v => __obj.updateDynamic("ValidationConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProfileJobRequest]
    }
  }

  @js.native
  trait UpdateProfileJobResponse extends js.Object {
    var Name: JobName
  }

  object UpdateProfileJobResponse {
    @inline
    def apply(
        Name: JobName
    ): UpdateProfileJobResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateProfileJobResponse]
    }
  }

  @js.native
  trait UpdateProjectRequest extends js.Object {
    var Name: ProjectName
    var RoleArn: Arn
    var Sample: js.UndefOr[Sample]
  }

  object UpdateProjectRequest {
    @inline
    def apply(
        Name: ProjectName,
        RoleArn: Arn,
        Sample: js.UndefOr[Sample] = js.undefined
    ): UpdateProjectRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      Sample.foreach(__v => __obj.updateDynamic("Sample")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProjectRequest]
    }
  }

  @js.native
  trait UpdateProjectResponse extends js.Object {
    var Name: ProjectName
    var LastModifiedDate: js.UndefOr[Date]
  }

  object UpdateProjectResponse {
    @inline
    def apply(
        Name: ProjectName,
        LastModifiedDate: js.UndefOr[Date] = js.undefined
    ): UpdateProjectResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProjectResponse]
    }
  }

  @js.native
  trait UpdateRecipeJobRequest extends js.Object {
    var Name: JobName
    var RoleArn: Arn
    var DataCatalogOutputs: js.UndefOr[DataCatalogOutputList]
    var DatabaseOutputs: js.UndefOr[DatabaseOutputList]
    var EncryptionKeyArn: js.UndefOr[EncryptionKeyArn]
    var EncryptionMode: js.UndefOr[EncryptionMode]
    var LogSubscription: js.UndefOr[LogSubscription]
    var MaxCapacity: js.UndefOr[MaxCapacity]
    var MaxRetries: js.UndefOr[MaxRetries]
    var Outputs: js.UndefOr[OutputList]
    var Timeout: js.UndefOr[Timeout]
  }

  object UpdateRecipeJobRequest {
    @inline
    def apply(
        Name: JobName,
        RoleArn: Arn,
        DataCatalogOutputs: js.UndefOr[DataCatalogOutputList] = js.undefined,
        DatabaseOutputs: js.UndefOr[DatabaseOutputList] = js.undefined,
        EncryptionKeyArn: js.UndefOr[EncryptionKeyArn] = js.undefined,
        EncryptionMode: js.UndefOr[EncryptionMode] = js.undefined,
        LogSubscription: js.UndefOr[LogSubscription] = js.undefined,
        MaxCapacity: js.UndefOr[MaxCapacity] = js.undefined,
        MaxRetries: js.UndefOr[MaxRetries] = js.undefined,
        Outputs: js.UndefOr[OutputList] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined
    ): UpdateRecipeJobRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      DataCatalogOutputs.foreach(__v => __obj.updateDynamic("DataCatalogOutputs")(__v.asInstanceOf[js.Any]))
      DatabaseOutputs.foreach(__v => __obj.updateDynamic("DatabaseOutputs")(__v.asInstanceOf[js.Any]))
      EncryptionKeyArn.foreach(__v => __obj.updateDynamic("EncryptionKeyArn")(__v.asInstanceOf[js.Any]))
      EncryptionMode.foreach(__v => __obj.updateDynamic("EncryptionMode")(__v.asInstanceOf[js.Any]))
      LogSubscription.foreach(__v => __obj.updateDynamic("LogSubscription")(__v.asInstanceOf[js.Any]))
      MaxCapacity.foreach(__v => __obj.updateDynamic("MaxCapacity")(__v.asInstanceOf[js.Any]))
      MaxRetries.foreach(__v => __obj.updateDynamic("MaxRetries")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRecipeJobRequest]
    }
  }

  @js.native
  trait UpdateRecipeJobResponse extends js.Object {
    var Name: JobName
  }

  object UpdateRecipeJobResponse {
    @inline
    def apply(
        Name: JobName
    ): UpdateRecipeJobResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRecipeJobResponse]
    }
  }

  @js.native
  trait UpdateRecipeRequest extends js.Object {
    var Name: RecipeName
    var Description: js.UndefOr[RecipeDescription]
    var Steps: js.UndefOr[RecipeStepList]
  }

  object UpdateRecipeRequest {
    @inline
    def apply(
        Name: RecipeName,
        Description: js.UndefOr[RecipeDescription] = js.undefined,
        Steps: js.UndefOr[RecipeStepList] = js.undefined
    ): UpdateRecipeRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Steps.foreach(__v => __obj.updateDynamic("Steps")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRecipeRequest]
    }
  }

  @js.native
  trait UpdateRecipeResponse extends js.Object {
    var Name: RecipeName
  }

  object UpdateRecipeResponse {
    @inline
    def apply(
        Name: RecipeName
    ): UpdateRecipeResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRecipeResponse]
    }
  }

  @js.native
  trait UpdateRulesetRequest extends js.Object {
    var Name: RulesetName
    var Rules: RuleList
    var Description: js.UndefOr[RulesetDescription]
  }

  object UpdateRulesetRequest {
    @inline
    def apply(
        Name: RulesetName,
        Rules: RuleList,
        Description: js.UndefOr[RulesetDescription] = js.undefined
    ): UpdateRulesetRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Rules" -> Rules.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRulesetRequest]
    }
  }

  @js.native
  trait UpdateRulesetResponse extends js.Object {
    var Name: RulesetName
  }

  object UpdateRulesetResponse {
    @inline
    def apply(
        Name: RulesetName
    ): UpdateRulesetResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRulesetResponse]
    }
  }

  @js.native
  trait UpdateScheduleRequest extends js.Object {
    var CronExpression: CronExpression
    var Name: ScheduleName
    var JobNames: js.UndefOr[JobNameList]
  }

  object UpdateScheduleRequest {
    @inline
    def apply(
        CronExpression: CronExpression,
        Name: ScheduleName,
        JobNames: js.UndefOr[JobNameList] = js.undefined
    ): UpdateScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "CronExpression" -> CronExpression.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      JobNames.foreach(__v => __obj.updateDynamic("JobNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateScheduleRequest]
    }
  }

  @js.native
  trait UpdateScheduleResponse extends js.Object {
    var Name: ScheduleName
  }

  object UpdateScheduleResponse {
    @inline
    def apply(
        Name: ScheduleName
    ): UpdateScheduleResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateScheduleResponse]
    }
  }

  /** Configuration for data quality validation. Used to select the Rulesets and Validation Mode to be used in the profile job. When ValidationConfiguration is null, the profile job will run without data quality validation.
    */
  @js.native
  trait ValidationConfiguration extends js.Object {
    var RulesetArn: Arn
    var ValidationMode: js.UndefOr[ValidationMode]
  }

  object ValidationConfiguration {
    @inline
    def apply(
        RulesetArn: Arn,
        ValidationMode: js.UndefOr[ValidationMode] = js.undefined
    ): ValidationConfiguration = {
      val __obj = js.Dynamic.literal(
        "RulesetArn" -> RulesetArn.asInstanceOf[js.Any]
      )

      ValidationMode.foreach(__v => __obj.updateDynamic("ValidationMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidationConfiguration]
    }
  }

  /** Represents the data being transformed during an action.
    */
  @js.native
  trait ViewFrame extends js.Object {
    var StartColumnIndex: StartColumnIndex
    var Analytics: js.UndefOr[AnalyticsMode]
    var ColumnRange: js.UndefOr[ColumnRange]
    var HiddenColumns: js.UndefOr[HiddenColumnList]
    var RowRange: js.UndefOr[RowRange]
    var StartRowIndex: js.UndefOr[StartRowIndex]
  }

  object ViewFrame {
    @inline
    def apply(
        StartColumnIndex: StartColumnIndex,
        Analytics: js.UndefOr[AnalyticsMode] = js.undefined,
        ColumnRange: js.UndefOr[ColumnRange] = js.undefined,
        HiddenColumns: js.UndefOr[HiddenColumnList] = js.undefined,
        RowRange: js.UndefOr[RowRange] = js.undefined,
        StartRowIndex: js.UndefOr[StartRowIndex] = js.undefined
    ): ViewFrame = {
      val __obj = js.Dynamic.literal(
        "StartColumnIndex" -> StartColumnIndex.asInstanceOf[js.Any]
      )

      Analytics.foreach(__v => __obj.updateDynamic("Analytics")(__v.asInstanceOf[js.Any]))
      ColumnRange.foreach(__v => __obj.updateDynamic("ColumnRange")(__v.asInstanceOf[js.Any]))
      HiddenColumns.foreach(__v => __obj.updateDynamic("HiddenColumns")(__v.asInstanceOf[js.Any]))
      RowRange.foreach(__v => __obj.updateDynamic("RowRange")(__v.asInstanceOf[js.Any]))
      StartRowIndex.foreach(__v => __obj.updateDynamic("StartRowIndex")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ViewFrame]
    }
  }
}
