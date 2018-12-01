package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object sagemaker {
  type Accept = String
  type AccountId = String
  type AdditionalCodeRepositoryNamesOrUrls = js.Array[CodeRepositoryNameOrUrl]
  type AlgorithmArn = String
  type AlgorithmImage = String
  type AlgorithmSortBy = String
  type AlgorithmStatus = String
  type AlgorithmStatusItemList = js.Array[AlgorithmStatusItem]
  type AlgorithmSummaryList = js.Array[AlgorithmSummary]
  type AlgorithmValidationProfiles = js.Array[AlgorithmValidationProfile]
  type ArnOrName = String
  type AssemblyType = String
  type AttributeName = String
  type AttributeNames = js.Array[AttributeName]
  type BatchStrategy = String
  type BooleanOperator = String
  type Branch = String
  type CategoricalParameterRanges = js.Array[CategoricalParameterRange]
  type Cents = Int
  type CertifyForMarketplace = Boolean
  type ChannelName = String
  type ChannelSpecifications = js.Array[ChannelSpecification]
  type CodeRepositoryArn = String
  type CodeRepositoryContains = String
  type CodeRepositoryNameContains = String
  type CodeRepositoryNameOrUrl = String
  type CodeRepositorySortBy = String
  type CodeRepositorySortOrder = String
  type CodeRepositorySummaryList = js.Array[CodeRepositorySummary]
  type CognitoClientId = String
  type CognitoUserGroup = String
  type CognitoUserPool = String
  type CompilationJobArn = String
  type CompilationJobStatus = String
  type CompilationJobSummaries = js.Array[CompilationJobSummary]
  type CompressionType = String
  type CompressionTypes = js.Array[CompressionType]
  type ContainerDefinitionList = js.Array[ContainerDefinition]
  type ContainerHostname = String
  type ContentClassifier = String
  type ContentClassifiers = js.Array[ContentClassifier]
  type ContentType = String
  type ContentTypes = js.Array[ContentType]
  type ContinuousParameterRanges = js.Array[ContinuousParameterRange]
  type CreationTime = js.Date
  type DataInputConfig = String
  type DeployedImages = js.Array[DeployedImage]
  type DesiredWeightAndCapacityList = js.Array[DesiredWeightAndCapacity]
  type DetailedAlgorithmStatus = String
  type DetailedModelPackageStatus = String
  type DirectInternetAccess = String
  type DisassociateAdditionalCodeRepositories = Boolean
  type DisassociateDefaultCodeRepository = Boolean
  type DisassociateNotebookInstanceAcceleratorTypes = Boolean
  type DisassociateNotebookInstanceLifecycleConfig = Boolean
  type Dollars = Int
  type EndpointArn = String
  type EndpointConfigArn = String
  type EndpointConfigName = String
  type EndpointConfigNameContains = String
  type EndpointConfigSortKey = String
  type EndpointConfigSummaryList = js.Array[EndpointConfigSummary]
  type EndpointName = String
  type EndpointNameContains = String
  type EndpointSortKey = String
  type EndpointStatus = String
  type EndpointSummaryList = js.Array[EndpointSummary]
  type EntityDescription = String
  type EntityName = String
  type EnvironmentKey = String
  type EnvironmentMap = js.Dictionary[EnvironmentValue]
  type EnvironmentValue = String
  type FailureReason = String
  type FilterList = js.Array[Filter]
  type FilterValue = String
  type FinalMetricDataList = js.Array[MetricData]
  type Framework = String
  type HyperParameterSpecifications = js.Array[HyperParameterSpecification]
  type HyperParameterTrainingJobSummaries = js.Array[HyperParameterTrainingJobSummary]
  type HyperParameterTuningJobArn = String
  type HyperParameterTuningJobName = String
  type HyperParameterTuningJobObjectiveType = String
  type HyperParameterTuningJobObjectives = js.Array[HyperParameterTuningJobObjective]
  type HyperParameterTuningJobSortByOptions = String
  type HyperParameterTuningJobStatus = String
  type HyperParameterTuningJobStrategyType = String
  type HyperParameterTuningJobSummaries = js.Array[HyperParameterTuningJobSummary]
  type HyperParameterTuningJobWarmStartType = String
  type HyperParameters = js.Dictionary[ParameterValue]
  type Image = String
  type ImageDigest = String
  type InputDataConfig = js.Array[Channel]
  type InputModes = js.Array[TrainingInputMode]
  type InstanceType = String
  type IntegerParameterRanges = js.Array[IntegerParameterRange]
  type JobReferenceCode = String
  type JobReferenceCodeContains = String
  type KmsKeyId = String
  type LabelAttributeName = String
  type LabelCounter = Int
  type LabelingJobAlgorithmSpecificationArn = String
  type LabelingJobArn = String
  type LabelingJobForWorkteamSummaryList = js.Array[LabelingJobForWorkteamSummary]
  type LabelingJobName = String
  type LabelingJobStatus = String
  type LabelingJobSummaryList = js.Array[LabelingJobSummary]
  type LambdaFunctionArn = String
  type LastModifiedTime = js.Date
  type ListLabelingJobsForWorkteamSortByOptions = String
  type ListTagsMaxResults = Int
  type ListWorkteamsSortByOptions = String
  type MaxConcurrentTaskCount = Int
  type MaxConcurrentTransforms = Int
  type MaxHumanLabeledObjectCount = Int
  type MaxNumberOfTrainingJobs = Int
  type MaxParallelTrainingJobs = Int
  type MaxPayloadInMB = Int
  type MaxPercentageOfInputDatasetLabeled = Int
  type MaxResults = Int
  type MaxRuntimeInSeconds = Int
  type MemberDefinitions = js.Array[MemberDefinition]
  type MetricDefinitionList = js.Array[MetricDefinition]
  type MetricName = String
  type MetricRegex = String
  type MetricValue = Float
  type ModelArn = String
  type ModelName = String
  type ModelNameContains = String
  type ModelPackageArn = String
  type ModelPackageContainerDefinitionList = js.Array[ModelPackageContainerDefinition]
  type ModelPackageSortBy = String
  type ModelPackageStatus = String
  type ModelPackageStatusItemList = js.Array[ModelPackageStatusItem]
  type ModelPackageSummaryList = js.Array[ModelPackageSummary]
  type ModelPackageValidationProfiles = js.Array[ModelPackageValidationProfile]
  type ModelSortKey = String
  type ModelSummaryList = js.Array[ModelSummary]
  type NameContains = String
  type NestedFiltersList = js.Array[NestedFilters]
  type NetworkInterfaceId = String
  type NextToken = String
  type NotebookInstanceAcceleratorType = String
  type NotebookInstanceAcceleratorTypes = js.Array[NotebookInstanceAcceleratorType]
  type NotebookInstanceArn = String
  type NotebookInstanceLifecycleConfigArn = String
  type NotebookInstanceLifecycleConfigContent = String
  type NotebookInstanceLifecycleConfigList = js.Array[NotebookInstanceLifecycleHook]
  type NotebookInstanceLifecycleConfigName = String
  type NotebookInstanceLifecycleConfigNameContains = String
  type NotebookInstanceLifecycleConfigSortKey = String
  type NotebookInstanceLifecycleConfigSortOrder = String
  type NotebookInstanceLifecycleConfigSummaryList = js.Array[NotebookInstanceLifecycleConfigSummary]
  type NotebookInstanceName = String
  type NotebookInstanceNameContains = String
  type NotebookInstanceSortKey = String
  type NotebookInstanceSortOrder = String
  type NotebookInstanceStatus = String
  type NotebookInstanceSummaryList = js.Array[NotebookInstanceSummary]
  type NotebookInstanceUrl = String
  type NotebookInstanceVolumeSizeInGB = Int
  type NumberOfHumanWorkersPerDataObject = Int
  type ObjectiveStatus = String
  type ObjectiveStatusCounter = Int
  type Operator = String
  type OrderKey = String
  type PaginationToken = String
  type ParameterKey = String
  type ParameterName = String
  type ParameterType = String
  type ParameterValue = String
  type ParameterValues = js.Array[ParameterValue]
  type ParentHyperParameterTuningJobs = js.Array[ParentHyperParameterTuningJob]
  type ProductId = String
  type ProductListings = js.Array[String]
  type ProductionVariantAcceleratorType = String
  type ProductionVariantInstanceType = String
  type ProductionVariantList = js.Array[ProductionVariant]
  type ProductionVariantSummaryList = js.Array[ProductionVariantSummary]
  type PropertyNameHint = String
  type PropertyNameSuggestionList = js.Array[PropertyNameSuggestion]
  type RealtimeInferenceInstanceTypes = js.Array[ProductionVariantInstanceType]
  type RecordWrapper = String
  type RenderingErrorList = js.Array[RenderingError]
  type ResourceArn = String
  type ResourcePropertyName = String
  type ResourceType = String
  type ResponseMIMEType = String
  type ResponseMIMETypes = js.Array[ResponseMIMEType]
  type RoleArn = String
  type S3DataDistribution = String
  type S3DataType = String
  type S3Uri = String
  type SearchExpressionList = js.Array[SearchExpression]
  type SearchResultsList = js.Array[SearchRecord]
  type SearchSortOrder = String
  type SecondaryStatus = String
  type SecondaryStatusTransitions = js.Array[SecondaryStatusTransition]
  type SecretArn = String
  type SecurityGroupId = String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type Seed = Double
  type SessionExpirationDurationInSeconds = Int
  type SortBy = String
  type SortOrder = String
  type SourceAlgorithmList = js.Array[SourceAlgorithm]
  type SplitType = String
  type StatusMessage = String
  type String200 = String
  type SubnetId = String
  type Subnets = js.Array[SubnetId]
  type SubscribedWorkteams = js.Array[SubscribedWorkteam]
  type Success = Boolean
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TargetDevice = String
  type TaskAvailabilityLifetimeInSeconds = Int
  type TaskCount = Int
  type TaskDescription = String
  type TaskInput = String
  type TaskKeyword = String
  type TaskKeywords = js.Array[TaskKeyword]
  type TaskTimeLimitInSeconds = Int
  type TaskTitle = String
  type TemplateContent = String
  type TenthFractionsOfACent = Int
  type Timestamp = js.Date
  type TrainingInputMode = String
  type TrainingInstanceCount = Int
  type TrainingInstanceType = String
  type TrainingInstanceTypes = js.Array[TrainingInstanceType]
  type TrainingJobArn = String
  type TrainingJobName = String
  type TrainingJobSortByOptions = String
  type TrainingJobStatus = String
  type TrainingJobStatusCounter = Int
  type TrainingJobSummaries = js.Array[TrainingJobSummary]
  type TransformEnvironmentKey = String
  type TransformEnvironmentMap = js.Dictionary[TransformEnvironmentValue]
  type TransformEnvironmentValue = String
  type TransformInstanceCount = Int
  type TransformInstanceType = String
  type TransformInstanceTypes = js.Array[TransformInstanceType]
  type TransformJobArn = String
  type TransformJobName = String
  type TransformJobStatus = String
  type TransformJobSummaries = js.Array[TransformJobSummary]
  type Url = String
  type VariantName = String
  type VariantWeight = Float
  type VolumeSizeInGB = Int
  type VpcSecurityGroupIds = js.Array[SecurityGroupId]
  type WorkteamArn = String
  type WorkteamName = String
  type Workteams = js.Array[Workteam]
}

package sagemaker {
  @js.native
  @JSImport("aws-sdk", "SageMaker")
  class SageMaker(config: AWSConfig) extends js.Object {
    def addTags(params: AddTagsInput): Request[AddTagsOutput] = js.native
    def createAlgorithm(params: CreateAlgorithmInput): Request[CreateAlgorithmOutput] = js.native
    def createCodeRepository(params: CreateCodeRepositoryInput): Request[CreateCodeRepositoryOutput] = js.native
    def createCompilationJob(params: CreateCompilationJobRequest): Request[CreateCompilationJobResponse] = js.native
    def createEndpoint(params: CreateEndpointInput): Request[CreateEndpointOutput] = js.native
    def createEndpointConfig(params: CreateEndpointConfigInput): Request[CreateEndpointConfigOutput] = js.native
    def createHyperParameterTuningJob(params: CreateHyperParameterTuningJobRequest): Request[CreateHyperParameterTuningJobResponse] = js.native
    def createLabelingJob(params: CreateLabelingJobRequest): Request[CreateLabelingJobResponse] = js.native
    def createModel(params: CreateModelInput): Request[CreateModelOutput] = js.native
    def createModelPackage(params: CreateModelPackageInput): Request[CreateModelPackageOutput] = js.native
    def createNotebookInstance(params: CreateNotebookInstanceInput): Request[CreateNotebookInstanceOutput] = js.native
    def createNotebookInstanceLifecycleConfig(params: CreateNotebookInstanceLifecycleConfigInput): Request[CreateNotebookInstanceLifecycleConfigOutput] = js.native
    def createPresignedNotebookInstanceUrl(params: CreatePresignedNotebookInstanceUrlInput): Request[CreatePresignedNotebookInstanceUrlOutput] = js.native
    def createTrainingJob(params: CreateTrainingJobRequest): Request[CreateTrainingJobResponse] = js.native
    def createTransformJob(params: CreateTransformJobRequest): Request[CreateTransformJobResponse] = js.native
    def createWorkteam(params: CreateWorkteamRequest): Request[CreateWorkteamResponse] = js.native
    def deleteAlgorithm(params: DeleteAlgorithmInput): Request[js.Object] = js.native
    def deleteCodeRepository(params: DeleteCodeRepositoryInput): Request[js.Object] = js.native
    def deleteEndpoint(params: DeleteEndpointInput): Request[js.Object] = js.native
    def deleteEndpointConfig(params: DeleteEndpointConfigInput): Request[js.Object] = js.native
    def deleteModel(params: DeleteModelInput): Request[js.Object] = js.native
    def deleteModelPackage(params: DeleteModelPackageInput): Request[js.Object] = js.native
    def deleteNotebookInstance(params: DeleteNotebookInstanceInput): Request[js.Object] = js.native
    def deleteNotebookInstanceLifecycleConfig(params: DeleteNotebookInstanceLifecycleConfigInput): Request[js.Object] = js.native
    def deleteTags(params: DeleteTagsInput): Request[DeleteTagsOutput] = js.native
    def deleteWorkteam(params: DeleteWorkteamRequest): Request[DeleteWorkteamResponse] = js.native
    def describeAlgorithm(params: DescribeAlgorithmInput): Request[DescribeAlgorithmOutput] = js.native
    def describeCodeRepository(params: DescribeCodeRepositoryInput): Request[DescribeCodeRepositoryOutput] = js.native
    def describeCompilationJob(params: DescribeCompilationJobRequest): Request[DescribeCompilationJobResponse] = js.native
    def describeEndpoint(params: DescribeEndpointInput): Request[DescribeEndpointOutput] = js.native
    def describeEndpointConfig(params: DescribeEndpointConfigInput): Request[DescribeEndpointConfigOutput] = js.native
    def describeHyperParameterTuningJob(params: DescribeHyperParameterTuningJobRequest): Request[DescribeHyperParameterTuningJobResponse] = js.native
    def describeLabelingJob(params: DescribeLabelingJobRequest): Request[DescribeLabelingJobResponse] = js.native
    def describeModel(params: DescribeModelInput): Request[DescribeModelOutput] = js.native
    def describeModelPackage(params: DescribeModelPackageInput): Request[DescribeModelPackageOutput] = js.native
    def describeNotebookInstance(params: DescribeNotebookInstanceInput): Request[DescribeNotebookInstanceOutput] = js.native
    def describeNotebookInstanceLifecycleConfig(params: DescribeNotebookInstanceLifecycleConfigInput): Request[DescribeNotebookInstanceLifecycleConfigOutput] = js.native
    def describeSubscribedWorkteam(params: DescribeSubscribedWorkteamRequest): Request[DescribeSubscribedWorkteamResponse] = js.native
    def describeTrainingJob(params: DescribeTrainingJobRequest): Request[DescribeTrainingJobResponse] = js.native
    def describeTransformJob(params: DescribeTransformJobRequest): Request[DescribeTransformJobResponse] = js.native
    def describeWorkteam(params: DescribeWorkteamRequest): Request[DescribeWorkteamResponse] = js.native
    def getSearchSuggestions(params: GetSearchSuggestionsRequest): Request[GetSearchSuggestionsResponse] = js.native
    def listAlgorithms(params: ListAlgorithmsInput): Request[ListAlgorithmsOutput] = js.native
    def listCodeRepositories(params: ListCodeRepositoriesInput): Request[ListCodeRepositoriesOutput] = js.native
    def listCompilationJobs(params: ListCompilationJobsRequest): Request[ListCompilationJobsResponse] = js.native
    def listEndpointConfigs(params: ListEndpointConfigsInput): Request[ListEndpointConfigsOutput] = js.native
    def listEndpoints(params: ListEndpointsInput): Request[ListEndpointsOutput] = js.native
    def listHyperParameterTuningJobs(params: ListHyperParameterTuningJobsRequest): Request[ListHyperParameterTuningJobsResponse] = js.native
    def listLabelingJobs(params: ListLabelingJobsRequest): Request[ListLabelingJobsResponse] = js.native
    def listLabelingJobsForWorkteam(params: ListLabelingJobsForWorkteamRequest): Request[ListLabelingJobsForWorkteamResponse] = js.native
    def listModelPackages(params: ListModelPackagesInput): Request[ListModelPackagesOutput] = js.native
    def listModels(params: ListModelsInput): Request[ListModelsOutput] = js.native
    def listNotebookInstanceLifecycleConfigs(params: ListNotebookInstanceLifecycleConfigsInput): Request[ListNotebookInstanceLifecycleConfigsOutput] = js.native
    def listNotebookInstances(params: ListNotebookInstancesInput): Request[ListNotebookInstancesOutput] = js.native
    def listSubscribedWorkteams(params: ListSubscribedWorkteamsRequest): Request[ListSubscribedWorkteamsResponse] = js.native
    def listTags(params: ListTagsInput): Request[ListTagsOutput] = js.native
    def listTrainingJobs(params: ListTrainingJobsRequest): Request[ListTrainingJobsResponse] = js.native
    def listTrainingJobsForHyperParameterTuningJob(params: ListTrainingJobsForHyperParameterTuningJobRequest): Request[ListTrainingJobsForHyperParameterTuningJobResponse] = js.native
    def listTransformJobs(params: ListTransformJobsRequest): Request[ListTransformJobsResponse] = js.native
    def listWorkteams(params: ListWorkteamsRequest): Request[ListWorkteamsResponse] = js.native
    def renderUiTemplate(params: RenderUiTemplateRequest): Request[RenderUiTemplateResponse] = js.native
    def search(params: SearchRequest): Request[SearchResponse] = js.native
    def startNotebookInstance(params: StartNotebookInstanceInput): Request[js.Object] = js.native
    def stopCompilationJob(params: StopCompilationJobRequest): Request[js.Object] = js.native
    def stopHyperParameterTuningJob(params: StopHyperParameterTuningJobRequest): Request[js.Object] = js.native
    def stopLabelingJob(params: StopLabelingJobRequest): Request[js.Object] = js.native
    def stopNotebookInstance(params: StopNotebookInstanceInput): Request[js.Object] = js.native
    def stopTrainingJob(params: StopTrainingJobRequest): Request[js.Object] = js.native
    def stopTransformJob(params: StopTransformJobRequest): Request[js.Object] = js.native
    def updateCodeRepository(params: UpdateCodeRepositoryInput): Request[UpdateCodeRepositoryOutput] = js.native
    def updateEndpoint(params: UpdateEndpointInput): Request[UpdateEndpointOutput] = js.native
    def updateEndpointWeightsAndCapacities(params: UpdateEndpointWeightsAndCapacitiesInput): Request[UpdateEndpointWeightsAndCapacitiesOutput] = js.native
    def updateNotebookInstance(params: UpdateNotebookInstanceInput): Request[UpdateNotebookInstanceOutput] = js.native
    def updateNotebookInstanceLifecycleConfig(params: UpdateNotebookInstanceLifecycleConfigInput): Request[UpdateNotebookInstanceLifecycleConfigOutput] = js.native
    def updateWorkteam(params: UpdateWorkteamRequest): Request[UpdateWorkteamResponse] = js.native
  }

  @js.native
  trait AddTagsInput extends js.Object {
    var ResourceArn: js.UndefOr[ResourceArn]
    var Tags: js.UndefOr[TagList]
  }

  object AddTagsInput {
    def apply(
      ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): AddTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsInput]
    }
  }

  @js.native
  trait AddTagsOutput extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object AddTagsOutput {
    def apply(
      Tags: js.UndefOr[TagList] = js.undefined): AddTagsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsOutput]
    }
  }

  object AlgorithmSortByEnum {
    val Name = "Name"
    val CreationTime = "CreationTime"

    val values = IndexedSeq(Name, CreationTime)
  }

  /**
   * <p>Specifies the training algorithm to use in a <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateTrainingJob.html">CreateTrainingJob</a> request.</p> <p>For more information about algorithms provided by Amazon SageMaker, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. For information about using your own algorithms, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms with Amazon SageMaker</a>. </p>
   */
  @js.native
  trait AlgorithmSpecification extends js.Object {
    var TrainingImage: js.UndefOr[AlgorithmImage]
    var AlgorithmName: js.UndefOr[ArnOrName]
    var TrainingInputMode: js.UndefOr[TrainingInputMode]
    var MetricDefinitions: js.UndefOr[MetricDefinitionList]
  }

  object AlgorithmSpecification {
    def apply(
      TrainingImage: js.UndefOr[AlgorithmImage] = js.undefined,
      AlgorithmName: js.UndefOr[ArnOrName] = js.undefined,
      TrainingInputMode: js.UndefOr[TrainingInputMode] = js.undefined,
      MetricDefinitions: js.UndefOr[MetricDefinitionList] = js.undefined): AlgorithmSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrainingImage" -> TrainingImage.map { x => x.asInstanceOf[js.Any] },
        "AlgorithmName" -> AlgorithmName.map { x => x.asInstanceOf[js.Any] },
        "TrainingInputMode" -> TrainingInputMode.map { x => x.asInstanceOf[js.Any] },
        "MetricDefinitions" -> MetricDefinitions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AlgorithmSpecification]
    }
  }

  object AlgorithmStatusEnum {
    val Pending = "Pending"
    val InProgress = "InProgress"
    val Completed = "Completed"
    val Failed = "Failed"
    val Deleting = "Deleting"

    val values = IndexedSeq(Pending, InProgress, Completed, Failed, Deleting)
  }

  /**
   * <p>Specifies the validation and image scan statuses of the algorithm.</p>
   */
  @js.native
  trait AlgorithmStatusDetails extends js.Object {
    var ValidationStatuses: js.UndefOr[AlgorithmStatusItemList]
    var ImageScanStatuses: js.UndefOr[AlgorithmStatusItemList]
  }

  object AlgorithmStatusDetails {
    def apply(
      ValidationStatuses: js.UndefOr[AlgorithmStatusItemList] = js.undefined,
      ImageScanStatuses: js.UndefOr[AlgorithmStatusItemList] = js.undefined): AlgorithmStatusDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ValidationStatuses" -> ValidationStatuses.map { x => x.asInstanceOf[js.Any] },
        "ImageScanStatuses" -> ImageScanStatuses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AlgorithmStatusDetails]
    }
  }

  /**
   * <p>Represents the overall status of an algorithm.</p>
   */
  @js.native
  trait AlgorithmStatusItem extends js.Object {
    var Name: js.UndefOr[EntityName]
    var Status: js.UndefOr[DetailedAlgorithmStatus]
    var FailureReason: js.UndefOr[String]
  }

  object AlgorithmStatusItem {
    def apply(
      Name: js.UndefOr[EntityName] = js.undefined,
      Status: js.UndefOr[DetailedAlgorithmStatus] = js.undefined,
      FailureReason: js.UndefOr[String] = js.undefined): AlgorithmStatusItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AlgorithmStatusItem]
    }
  }

  /**
   * <p>Provides summary information about an algorithm.</p>
   */
  @js.native
  trait AlgorithmSummary extends js.Object {
    var AlgorithmDescription: js.UndefOr[EntityDescription]
    var AlgorithmArn: js.UndefOr[AlgorithmArn]
    var AlgorithmName: js.UndefOr[EntityName]
    var AlgorithmStatus: js.UndefOr[AlgorithmStatus]
    var CreationTime: js.UndefOr[CreationTime]
  }

  object AlgorithmSummary {
    def apply(
      AlgorithmDescription: js.UndefOr[EntityDescription] = js.undefined,
      AlgorithmArn: js.UndefOr[AlgorithmArn] = js.undefined,
      AlgorithmName: js.UndefOr[EntityName] = js.undefined,
      AlgorithmStatus: js.UndefOr[AlgorithmStatus] = js.undefined,
      CreationTime: js.UndefOr[CreationTime] = js.undefined): AlgorithmSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlgorithmDescription" -> AlgorithmDescription.map { x => x.asInstanceOf[js.Any] },
        "AlgorithmArn" -> AlgorithmArn.map { x => x.asInstanceOf[js.Any] },
        "AlgorithmName" -> AlgorithmName.map { x => x.asInstanceOf[js.Any] },
        "AlgorithmStatus" -> AlgorithmStatus.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AlgorithmSummary]
    }
  }

  /**
   * <p>Defines a training job and a batch transform job that Amazon SageMaker runs to validate your algorithm.</p> <p>The data provided in the validation profile is made available to your buyers on AWS Marketplace.</p>
   */
  @js.native
  trait AlgorithmValidationProfile extends js.Object {
    var ProfileName: js.UndefOr[EntityName]
    var TrainingJobDefinition: js.UndefOr[TrainingJobDefinition]
    var TransformJobDefinition: js.UndefOr[TransformJobDefinition]
  }

  object AlgorithmValidationProfile {
    def apply(
      ProfileName: js.UndefOr[EntityName] = js.undefined,
      TrainingJobDefinition: js.UndefOr[TrainingJobDefinition] = js.undefined,
      TransformJobDefinition: js.UndefOr[TransformJobDefinition] = js.undefined): AlgorithmValidationProfile = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProfileName" -> ProfileName.map { x => x.asInstanceOf[js.Any] },
        "TrainingJobDefinition" -> TrainingJobDefinition.map { x => x.asInstanceOf[js.Any] },
        "TransformJobDefinition" -> TransformJobDefinition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AlgorithmValidationProfile]
    }
  }

  /**
   * <p>Specifies configurations for one or more training jobs that Amazon SageMaker runs to test the algorithm.</p>
   */
  @js.native
  trait AlgorithmValidationSpecification extends js.Object {
    var ValidationRole: js.UndefOr[RoleArn]
    var ValidationProfiles: js.UndefOr[AlgorithmValidationProfiles]
  }

  object AlgorithmValidationSpecification {
    def apply(
      ValidationRole: js.UndefOr[RoleArn] = js.undefined,
      ValidationProfiles: js.UndefOr[AlgorithmValidationProfiles] = js.undefined): AlgorithmValidationSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ValidationRole" -> ValidationRole.map { x => x.asInstanceOf[js.Any] },
        "ValidationProfiles" -> ValidationProfiles.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AlgorithmValidationSpecification]
    }
  }

  /**
   * <p>Configures how labels are consolidated across human workers.</p>
   */
  @js.native
  trait AnnotationConsolidationConfig extends js.Object {
    var AnnotationConsolidationLambdaArn: js.UndefOr[LambdaFunctionArn]
  }

  object AnnotationConsolidationConfig {
    def apply(
      AnnotationConsolidationLambdaArn: js.UndefOr[LambdaFunctionArn] = js.undefined): AnnotationConsolidationConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AnnotationConsolidationLambdaArn" -> AnnotationConsolidationLambdaArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AnnotationConsolidationConfig]
    }
  }

  object AssemblyTypeEnum {
    val None = "None"
    val Line = "Line"

    val values = IndexedSeq(None, Line)
  }

  object BatchStrategyEnum {
    val MultiRecord = "MultiRecord"
    val SingleRecord = "SingleRecord"

    val values = IndexedSeq(MultiRecord, SingleRecord)
  }

  object BooleanOperatorEnum {
    val And = "And"
    val Or = "Or"

    val values = IndexedSeq(And, Or)
  }

  /**
   * <p>A list of categorical hyperparameters to tune.</p>
   */
  @js.native
  trait CategoricalParameterRange extends js.Object {
    var Name: js.UndefOr[ParameterKey]
    var Values: js.UndefOr[ParameterValues]
  }

  object CategoricalParameterRange {
    def apply(
      Name: js.UndefOr[ParameterKey] = js.undefined,
      Values: js.UndefOr[ParameterValues] = js.undefined): CategoricalParameterRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CategoricalParameterRange]
    }
  }

  /**
   * <p>Defines the possible values for a categorical hyperparameter.</p>
   */
  @js.native
  trait CategoricalParameterRangeSpecification extends js.Object {
    var Values: js.UndefOr[ParameterValues]
  }

  object CategoricalParameterRangeSpecification {
    def apply(
      Values: js.UndefOr[ParameterValues] = js.undefined): CategoricalParameterRangeSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CategoricalParameterRangeSpecification]
    }
  }

  /**
   * <p>A channel is a named input source that training algorithms can consume. </p>
   */
  @js.native
  trait Channel extends js.Object {
    var InputMode: js.UndefOr[TrainingInputMode]
    var ChannelName: js.UndefOr[ChannelName]
    var CompressionType: js.UndefOr[CompressionType]
    var ShuffleConfig: js.UndefOr[ShuffleConfig]
    var RecordWrapperType: js.UndefOr[RecordWrapper]
    var ContentType: js.UndefOr[ContentType]
    var DataSource: js.UndefOr[DataSource]
  }

  object Channel {
    def apply(
      InputMode: js.UndefOr[TrainingInputMode] = js.undefined,
      ChannelName: js.UndefOr[ChannelName] = js.undefined,
      CompressionType: js.UndefOr[CompressionType] = js.undefined,
      ShuffleConfig: js.UndefOr[ShuffleConfig] = js.undefined,
      RecordWrapperType: js.UndefOr[RecordWrapper] = js.undefined,
      ContentType: js.UndefOr[ContentType] = js.undefined,
      DataSource: js.UndefOr[DataSource] = js.undefined): Channel = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputMode" -> InputMode.map { x => x.asInstanceOf[js.Any] },
        "ChannelName" -> ChannelName.map { x => x.asInstanceOf[js.Any] },
        "CompressionType" -> CompressionType.map { x => x.asInstanceOf[js.Any] },
        "ShuffleConfig" -> ShuffleConfig.map { x => x.asInstanceOf[js.Any] },
        "RecordWrapperType" -> RecordWrapperType.map { x => x.asInstanceOf[js.Any] },
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] },
        "DataSource" -> DataSource.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Channel]
    }
  }

  /**
   * <p>Defines a named input source, called a channel, to be used by an algorithm.</p>
   */
  @js.native
  trait ChannelSpecification extends js.Object {
    var SupportedInputModes: js.UndefOr[InputModes]
    var Name: js.UndefOr[ChannelName]
    var SupportedCompressionTypes: js.UndefOr[CompressionTypes]
    var IsRequired: js.UndefOr[Boolean]
    var SupportedContentTypes: js.UndefOr[ContentTypes]
    var Description: js.UndefOr[EntityDescription]
  }

  object ChannelSpecification {
    def apply(
      SupportedInputModes: js.UndefOr[InputModes] = js.undefined,
      Name: js.UndefOr[ChannelName] = js.undefined,
      SupportedCompressionTypes: js.UndefOr[CompressionTypes] = js.undefined,
      IsRequired: js.UndefOr[Boolean] = js.undefined,
      SupportedContentTypes: js.UndefOr[ContentTypes] = js.undefined,
      Description: js.UndefOr[EntityDescription] = js.undefined): ChannelSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SupportedInputModes" -> SupportedInputModes.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "SupportedCompressionTypes" -> SupportedCompressionTypes.map { x => x.asInstanceOf[js.Any] },
        "IsRequired" -> IsRequired.map { x => x.asInstanceOf[js.Any] },
        "SupportedContentTypes" -> SupportedContentTypes.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChannelSpecification]
    }
  }

  object CodeRepositorySortByEnum {
    val Name = "Name"
    val CreationTime = "CreationTime"
    val LastModifiedTime = "LastModifiedTime"

    val values = IndexedSeq(Name, CreationTime, LastModifiedTime)
  }

  object CodeRepositorySortOrderEnum {
    val Ascending = "Ascending"
    val Descending = "Descending"

    val values = IndexedSeq(Ascending, Descending)
  }

  /**
   * <p>Specifies summary information about a git repository.</p>
   */
  @js.native
  trait CodeRepositorySummary extends js.Object {
    var CodeRepositoryName: js.UndefOr[EntityName]
    var CodeRepositoryArn: js.UndefOr[CodeRepositoryArn]
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
    var GitConfig: js.UndefOr[GitConfig]
    var CreationTime: js.UndefOr[CreationTime]
  }

  object CodeRepositorySummary {
    def apply(
      CodeRepositoryName: js.UndefOr[EntityName] = js.undefined,
      CodeRepositoryArn: js.UndefOr[CodeRepositoryArn] = js.undefined,
      LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined,
      GitConfig: js.UndefOr[GitConfig] = js.undefined,
      CreationTime: js.UndefOr[CreationTime] = js.undefined): CodeRepositorySummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeRepositoryName" -> CodeRepositoryName.map { x => x.asInstanceOf[js.Any] },
        "CodeRepositoryArn" -> CodeRepositoryArn.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "GitConfig" -> GitConfig.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CodeRepositorySummary]
    }
  }

  /**
   * <p>Identifies a Amazon Cognito user group. A user group can be used in on or more work teams.</p>
   */
  @js.native
  trait CognitoMemberDefinition extends js.Object {
    var UserPool: js.UndefOr[CognitoUserPool]
    var UserGroup: js.UndefOr[CognitoUserGroup]
    var ClientId: js.UndefOr[CognitoClientId]
  }

  object CognitoMemberDefinition {
    def apply(
      UserPool: js.UndefOr[CognitoUserPool] = js.undefined,
      UserGroup: js.UndefOr[CognitoUserGroup] = js.undefined,
      ClientId: js.UndefOr[CognitoClientId] = js.undefined): CognitoMemberDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPool" -> UserPool.map { x => x.asInstanceOf[js.Any] },
        "UserGroup" -> UserGroup.map { x => x.asInstanceOf[js.Any] },
        "ClientId" -> ClientId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CognitoMemberDefinition]
    }
  }

  object CompilationJobStatusEnum {
    val INPROGRESS = "INPROGRESS"
    val COMPLETED = "COMPLETED"
    val FAILED = "FAILED"
    val STARTING = "STARTING"
    val STOPPING = "STOPPING"
    val STOPPED = "STOPPED"

    val values = IndexedSeq(INPROGRESS, COMPLETED, FAILED, STARTING, STOPPING, STOPPED)
  }

  /**
   * <p>A summary of a model compilation job.</p>
   */
  @js.native
  trait CompilationJobSummary extends js.Object {
    var CompilationEndTime: js.UndefOr[Timestamp]
    var CompilationJobStatus: js.UndefOr[CompilationJobStatus]
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
    var CompilationJobArn: js.UndefOr[CompilationJobArn]
    var CompilationTargetDevice: js.UndefOr[TargetDevice]
    var CompilationJobName: js.UndefOr[EntityName]
    var CreationTime: js.UndefOr[CreationTime]
  }

  object CompilationJobSummary {
    def apply(
      CompilationEndTime: js.UndefOr[Timestamp] = js.undefined,
      CompilationJobStatus: js.UndefOr[CompilationJobStatus] = js.undefined,
      LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined,
      CompilationJobArn: js.UndefOr[CompilationJobArn] = js.undefined,
      CompilationTargetDevice: js.UndefOr[TargetDevice] = js.undefined,
      CompilationJobName: js.UndefOr[EntityName] = js.undefined,
      CreationTime: js.UndefOr[CreationTime] = js.undefined): CompilationJobSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompilationEndTime" -> CompilationEndTime.map { x => x.asInstanceOf[js.Any] },
        "CompilationJobStatus" -> CompilationJobStatus.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "CompilationJobArn" -> CompilationJobArn.map { x => x.asInstanceOf[js.Any] },
        "CompilationTargetDevice" -> CompilationTargetDevice.map { x => x.asInstanceOf[js.Any] },
        "CompilationJobName" -> CompilationJobName.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompilationJobSummary]
    }
  }

  object CompressionTypeEnum {
    val None = "None"
    val Gzip = "Gzip"

    val values = IndexedSeq(None, Gzip)
  }

  /**
   * <p>Describes the container, as part of model definition.</p>
   */
  @js.native
  trait ContainerDefinition extends js.Object {
    var Environment: js.UndefOr[EnvironmentMap]
    var ModelPackageName: js.UndefOr[ArnOrName]
    var ContainerHostname: js.UndefOr[ContainerHostname]
    var ModelDataUrl: js.UndefOr[Url]
    var Image: js.UndefOr[Image]
  }

  object ContainerDefinition {
    def apply(
      Environment: js.UndefOr[EnvironmentMap] = js.undefined,
      ModelPackageName: js.UndefOr[ArnOrName] = js.undefined,
      ContainerHostname: js.UndefOr[ContainerHostname] = js.undefined,
      ModelDataUrl: js.UndefOr[Url] = js.undefined,
      Image: js.UndefOr[Image] = js.undefined): ContainerDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Environment" -> Environment.map { x => x.asInstanceOf[js.Any] },
        "ModelPackageName" -> ModelPackageName.map { x => x.asInstanceOf[js.Any] },
        "ContainerHostname" -> ContainerHostname.map { x => x.asInstanceOf[js.Any] },
        "ModelDataUrl" -> ModelDataUrl.map { x => x.asInstanceOf[js.Any] },
        "Image" -> Image.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerDefinition]
    }
  }

  object ContentClassifierEnum {
    val FreeOfPersonallyIdentifiableInformation = "FreeOfPersonallyIdentifiableInformation"
    val FreeOfAdultContent = "FreeOfAdultContent"

    val values = IndexedSeq(FreeOfPersonallyIdentifiableInformation, FreeOfAdultContent)
  }

  /**
   * <p>A list of continuous hyperparameters to tune.</p>
   */
  @js.native
  trait ContinuousParameterRange extends js.Object {
    var Name: js.UndefOr[ParameterKey]
    var MinValue: js.UndefOr[ParameterValue]
    var MaxValue: js.UndefOr[ParameterValue]
  }

  object ContinuousParameterRange {
    def apply(
      Name: js.UndefOr[ParameterKey] = js.undefined,
      MinValue: js.UndefOr[ParameterValue] = js.undefined,
      MaxValue: js.UndefOr[ParameterValue] = js.undefined): ContinuousParameterRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "MinValue" -> MinValue.map { x => x.asInstanceOf[js.Any] },
        "MaxValue" -> MaxValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContinuousParameterRange]
    }
  }

  /**
   * <p>Defines the possible values for a continuous hyperparameter.</p>
   */
  @js.native
  trait ContinuousParameterRangeSpecification extends js.Object {
    var MinValue: js.UndefOr[ParameterValue]
    var MaxValue: js.UndefOr[ParameterValue]
  }

  object ContinuousParameterRangeSpecification {
    def apply(
      MinValue: js.UndefOr[ParameterValue] = js.undefined,
      MaxValue: js.UndefOr[ParameterValue] = js.undefined): ContinuousParameterRangeSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MinValue" -> MinValue.map { x => x.asInstanceOf[js.Any] },
        "MaxValue" -> MaxValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContinuousParameterRangeSpecification]
    }
  }

  @js.native
  trait CreateAlgorithmInput extends js.Object {
    var AlgorithmDescription: js.UndefOr[EntityDescription]
    var InferenceSpecification: js.UndefOr[InferenceSpecification]
    var TrainingSpecification: js.UndefOr[TrainingSpecification]
    var AlgorithmName: js.UndefOr[EntityName]
    var CertifyForMarketplace: js.UndefOr[CertifyForMarketplace]
    var ValidationSpecification: js.UndefOr[AlgorithmValidationSpecification]
  }

  object CreateAlgorithmInput {
    def apply(
      AlgorithmDescription: js.UndefOr[EntityDescription] = js.undefined,
      InferenceSpecification: js.UndefOr[InferenceSpecification] = js.undefined,
      TrainingSpecification: js.UndefOr[TrainingSpecification] = js.undefined,
      AlgorithmName: js.UndefOr[EntityName] = js.undefined,
      CertifyForMarketplace: js.UndefOr[CertifyForMarketplace] = js.undefined,
      ValidationSpecification: js.UndefOr[AlgorithmValidationSpecification] = js.undefined): CreateAlgorithmInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlgorithmDescription" -> AlgorithmDescription.map { x => x.asInstanceOf[js.Any] },
        "InferenceSpecification" -> InferenceSpecification.map { x => x.asInstanceOf[js.Any] },
        "TrainingSpecification" -> TrainingSpecification.map { x => x.asInstanceOf[js.Any] },
        "AlgorithmName" -> AlgorithmName.map { x => x.asInstanceOf[js.Any] },
        "CertifyForMarketplace" -> CertifyForMarketplace.map { x => x.asInstanceOf[js.Any] },
        "ValidationSpecification" -> ValidationSpecification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAlgorithmInput]
    }
  }

  @js.native
  trait CreateAlgorithmOutput extends js.Object {
    var AlgorithmArn: js.UndefOr[AlgorithmArn]
  }

  object CreateAlgorithmOutput {
    def apply(
      AlgorithmArn: js.UndefOr[AlgorithmArn] = js.undefined): CreateAlgorithmOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlgorithmArn" -> AlgorithmArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAlgorithmOutput]
    }
  }

  @js.native
  trait CreateCodeRepositoryInput extends js.Object {
    var CodeRepositoryName: js.UndefOr[EntityName]
    var GitConfig: js.UndefOr[GitConfig]
  }

  object CreateCodeRepositoryInput {
    def apply(
      CodeRepositoryName: js.UndefOr[EntityName] = js.undefined,
      GitConfig: js.UndefOr[GitConfig] = js.undefined): CreateCodeRepositoryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeRepositoryName" -> CodeRepositoryName.map { x => x.asInstanceOf[js.Any] },
        "GitConfig" -> GitConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCodeRepositoryInput]
    }
  }

  @js.native
  trait CreateCodeRepositoryOutput extends js.Object {
    var CodeRepositoryArn: js.UndefOr[CodeRepositoryArn]
  }

  object CreateCodeRepositoryOutput {
    def apply(
      CodeRepositoryArn: js.UndefOr[CodeRepositoryArn] = js.undefined): CreateCodeRepositoryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeRepositoryArn" -> CodeRepositoryArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCodeRepositoryOutput]
    }
  }

  @js.native
  trait CreateCompilationJobRequest extends js.Object {
    var InputConfig: js.UndefOr[InputConfig]
    var StoppingCondition: js.UndefOr[StoppingCondition]
    var CompilationJobName: js.UndefOr[EntityName]
    var RoleArn: js.UndefOr[RoleArn]
    var OutputConfig: js.UndefOr[OutputConfig]
  }

  object CreateCompilationJobRequest {
    def apply(
      InputConfig: js.UndefOr[InputConfig] = js.undefined,
      StoppingCondition: js.UndefOr[StoppingCondition] = js.undefined,
      CompilationJobName: js.UndefOr[EntityName] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined,
      OutputConfig: js.UndefOr[OutputConfig] = js.undefined): CreateCompilationJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputConfig" -> InputConfig.map { x => x.asInstanceOf[js.Any] },
        "StoppingCondition" -> StoppingCondition.map { x => x.asInstanceOf[js.Any] },
        "CompilationJobName" -> CompilationJobName.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
        "OutputConfig" -> OutputConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCompilationJobRequest]
    }
  }

  @js.native
  trait CreateCompilationJobResponse extends js.Object {
    var CompilationJobArn: js.UndefOr[CompilationJobArn]
  }

  object CreateCompilationJobResponse {
    def apply(
      CompilationJobArn: js.UndefOr[CompilationJobArn] = js.undefined): CreateCompilationJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompilationJobArn" -> CompilationJobArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCompilationJobResponse]
    }
  }

  @js.native
  trait CreateEndpointConfigInput extends js.Object {
    var EndpointConfigName: js.UndefOr[EndpointConfigName]
    var ProductionVariants: js.UndefOr[ProductionVariantList]
    var Tags: js.UndefOr[TagList]
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object CreateEndpointConfigInput {
    def apply(
      EndpointConfigName: js.UndefOr[EndpointConfigName] = js.undefined,
      ProductionVariants: js.UndefOr[ProductionVariantList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined): CreateEndpointConfigInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointConfigName" -> EndpointConfigName.map { x => x.asInstanceOf[js.Any] },
        "ProductionVariants" -> ProductionVariants.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEndpointConfigInput]
    }
  }

  @js.native
  trait CreateEndpointConfigOutput extends js.Object {
    var EndpointConfigArn: js.UndefOr[EndpointConfigArn]
  }

  object CreateEndpointConfigOutput {
    def apply(
      EndpointConfigArn: js.UndefOr[EndpointConfigArn] = js.undefined): CreateEndpointConfigOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointConfigArn" -> EndpointConfigArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEndpointConfigOutput]
    }
  }

  @js.native
  trait CreateEndpointInput extends js.Object {
    var EndpointName: js.UndefOr[EndpointName]
    var EndpointConfigName: js.UndefOr[EndpointConfigName]
    var Tags: js.UndefOr[TagList]
  }

  object CreateEndpointInput {
    def apply(
      EndpointName: js.UndefOr[EndpointName] = js.undefined,
      EndpointConfigName: js.UndefOr[EndpointConfigName] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateEndpointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointName" -> EndpointName.map { x => x.asInstanceOf[js.Any] },
        "EndpointConfigName" -> EndpointConfigName.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEndpointInput]
    }
  }

  @js.native
  trait CreateEndpointOutput extends js.Object {
    var EndpointArn: js.UndefOr[EndpointArn]
  }

  object CreateEndpointOutput {
    def apply(
      EndpointArn: js.UndefOr[EndpointArn] = js.undefined): CreateEndpointOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointArn" -> EndpointArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEndpointOutput]
    }
  }

  @js.native
  trait CreateHyperParameterTuningJobRequest extends js.Object {
    var TrainingJobDefinition: js.UndefOr[HyperParameterTrainingJobDefinition]
    var WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig]
    var HyperParameterTuningJobName: js.UndefOr[HyperParameterTuningJobName]
    var Tags: js.UndefOr[TagList]
    var HyperParameterTuningJobConfig: js.UndefOr[HyperParameterTuningJobConfig]
  }

  object CreateHyperParameterTuningJobRequest {
    def apply(
      TrainingJobDefinition: js.UndefOr[HyperParameterTrainingJobDefinition] = js.undefined,
      WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig] = js.undefined,
      HyperParameterTuningJobName: js.UndefOr[HyperParameterTuningJobName] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      HyperParameterTuningJobConfig: js.UndefOr[HyperParameterTuningJobConfig] = js.undefined): CreateHyperParameterTuningJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrainingJobDefinition" -> TrainingJobDefinition.map { x => x.asInstanceOf[js.Any] },
        "WarmStartConfig" -> WarmStartConfig.map { x => x.asInstanceOf[js.Any] },
        "HyperParameterTuningJobName" -> HyperParameterTuningJobName.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "HyperParameterTuningJobConfig" -> HyperParameterTuningJobConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHyperParameterTuningJobRequest]
    }
  }

  @js.native
  trait CreateHyperParameterTuningJobResponse extends js.Object {
    var HyperParameterTuningJobArn: js.UndefOr[HyperParameterTuningJobArn]
  }

  object CreateHyperParameterTuningJobResponse {
    def apply(
      HyperParameterTuningJobArn: js.UndefOr[HyperParameterTuningJobArn] = js.undefined): CreateHyperParameterTuningJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HyperParameterTuningJobArn" -> HyperParameterTuningJobArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHyperParameterTuningJobResponse]
    }
  }

  @js.native
  trait CreateLabelingJobRequest extends js.Object {
    var InputConfig: js.UndefOr[LabelingJobInputConfig]
    var LabelCategoryConfigS3Uri: js.UndefOr[S3Uri]
    var LabelingJobName: js.UndefOr[LabelingJobName]
    var HumanTaskConfig: js.UndefOr[HumanTaskConfig]
    var LabelAttributeName: js.UndefOr[LabelAttributeName]
    var StoppingConditions: js.UndefOr[LabelingJobStoppingConditions]
    var LabelingJobAlgorithmsConfig: js.UndefOr[LabelingJobAlgorithmsConfig]
    var Tags: js.UndefOr[TagList]
    var RoleArn: js.UndefOr[RoleArn]
    var OutputConfig: js.UndefOr[LabelingJobOutputConfig]
  }

  object CreateLabelingJobRequest {
    def apply(
      InputConfig: js.UndefOr[LabelingJobInputConfig] = js.undefined,
      LabelCategoryConfigS3Uri: js.UndefOr[S3Uri] = js.undefined,
      LabelingJobName: js.UndefOr[LabelingJobName] = js.undefined,
      HumanTaskConfig: js.UndefOr[HumanTaskConfig] = js.undefined,
      LabelAttributeName: js.UndefOr[LabelAttributeName] = js.undefined,
      StoppingConditions: js.UndefOr[LabelingJobStoppingConditions] = js.undefined,
      LabelingJobAlgorithmsConfig: js.UndefOr[LabelingJobAlgorithmsConfig] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined,
      OutputConfig: js.UndefOr[LabelingJobOutputConfig] = js.undefined): CreateLabelingJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputConfig" -> InputConfig.map { x => x.asInstanceOf[js.Any] },
        "LabelCategoryConfigS3Uri" -> LabelCategoryConfigS3Uri.map { x => x.asInstanceOf[js.Any] },
        "LabelingJobName" -> LabelingJobName.map { x => x.asInstanceOf[js.Any] },
        "HumanTaskConfig" -> HumanTaskConfig.map { x => x.asInstanceOf[js.Any] },
        "LabelAttributeName" -> LabelAttributeName.map { x => x.asInstanceOf[js.Any] },
        "StoppingConditions" -> StoppingConditions.map { x => x.asInstanceOf[js.Any] },
        "LabelingJobAlgorithmsConfig" -> LabelingJobAlgorithmsConfig.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
        "OutputConfig" -> OutputConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLabelingJobRequest]
    }
  }

  @js.native
  trait CreateLabelingJobResponse extends js.Object {
    var LabelingJobArn: js.UndefOr[LabelingJobArn]
  }

  object CreateLabelingJobResponse {
    def apply(
      LabelingJobArn: js.UndefOr[LabelingJobArn] = js.undefined): CreateLabelingJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LabelingJobArn" -> LabelingJobArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLabelingJobResponse]
    }
  }

  @js.native
  trait CreateModelInput extends js.Object {
    var Containers: js.UndefOr[ContainerDefinitionList]
    var ModelName: js.UndefOr[ModelName]
    var EnableNetworkIsolation: js.UndefOr[Boolean]
    var VpcConfig: js.UndefOr[VpcConfig]
    var Tags: js.UndefOr[TagList]
    var PrimaryContainer: js.UndefOr[ContainerDefinition]
    var ExecutionRoleArn: js.UndefOr[RoleArn]
  }

  object CreateModelInput {
    def apply(
      Containers: js.UndefOr[ContainerDefinitionList] = js.undefined,
      ModelName: js.UndefOr[ModelName] = js.undefined,
      EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      PrimaryContainer: js.UndefOr[ContainerDefinition] = js.undefined,
      ExecutionRoleArn: js.UndefOr[RoleArn] = js.undefined): CreateModelInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Containers" -> Containers.map { x => x.asInstanceOf[js.Any] },
        "ModelName" -> ModelName.map { x => x.asInstanceOf[js.Any] },
        "EnableNetworkIsolation" -> EnableNetworkIsolation.map { x => x.asInstanceOf[js.Any] },
        "VpcConfig" -> VpcConfig.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "PrimaryContainer" -> PrimaryContainer.map { x => x.asInstanceOf[js.Any] },
        "ExecutionRoleArn" -> ExecutionRoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateModelInput]
    }
  }

  @js.native
  trait CreateModelOutput extends js.Object {
    var ModelArn: js.UndefOr[ModelArn]
  }

  object CreateModelOutput {
    def apply(
      ModelArn: js.UndefOr[ModelArn] = js.undefined): CreateModelOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelArn" -> ModelArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateModelOutput]
    }
  }

  @js.native
  trait CreateModelPackageInput extends js.Object {
    var SourceAlgorithmSpecification: js.UndefOr[SourceAlgorithmSpecification]
    var InferenceSpecification: js.UndefOr[InferenceSpecification]
    var ModelPackageName: js.UndefOr[EntityName]
    var ModelPackageDescription: js.UndefOr[EntityDescription]
    var CertifyForMarketplace: js.UndefOr[CertifyForMarketplace]
    var ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification]
  }

  object CreateModelPackageInput {
    def apply(
      SourceAlgorithmSpecification: js.UndefOr[SourceAlgorithmSpecification] = js.undefined,
      InferenceSpecification: js.UndefOr[InferenceSpecification] = js.undefined,
      ModelPackageName: js.UndefOr[EntityName] = js.undefined,
      ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined,
      CertifyForMarketplace: js.UndefOr[CertifyForMarketplace] = js.undefined,
      ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification] = js.undefined): CreateModelPackageInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceAlgorithmSpecification" -> SourceAlgorithmSpecification.map { x => x.asInstanceOf[js.Any] },
        "InferenceSpecification" -> InferenceSpecification.map { x => x.asInstanceOf[js.Any] },
        "ModelPackageName" -> ModelPackageName.map { x => x.asInstanceOf[js.Any] },
        "ModelPackageDescription" -> ModelPackageDescription.map { x => x.asInstanceOf[js.Any] },
        "CertifyForMarketplace" -> CertifyForMarketplace.map { x => x.asInstanceOf[js.Any] },
        "ValidationSpecification" -> ValidationSpecification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateModelPackageInput]
    }
  }

  @js.native
  trait CreateModelPackageOutput extends js.Object {
    var ModelPackageArn: js.UndefOr[ModelPackageArn]
  }

  object CreateModelPackageOutput {
    def apply(
      ModelPackageArn: js.UndefOr[ModelPackageArn] = js.undefined): CreateModelPackageOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelPackageArn" -> ModelPackageArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateModelPackageOutput]
    }
  }

  @js.native
  trait CreateNotebookInstanceInput extends js.Object {
    var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB]
    var DirectInternetAccess: js.UndefOr[DirectInternetAccess]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var NotebookInstanceName: js.UndefOr[NotebookInstanceName]
    var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var InstanceType: js.UndefOr[InstanceType]
    var Tags: js.UndefOr[TagList]
    var AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes]
    var LifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName]
    var RoleArn: js.UndefOr[RoleArn]
    var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl]
    var SubnetId: js.UndefOr[SubnetId]
  }

  object CreateNotebookInstanceInput {
    def apply(
      VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.undefined,
      DirectInternetAccess: js.UndefOr[DirectInternetAccess] = js.undefined,
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      NotebookInstanceName: js.UndefOr[NotebookInstanceName] = js.undefined,
      AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.undefined,
      SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes] = js.undefined,
      LifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined,
      DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.undefined,
      SubnetId: js.UndefOr[SubnetId] = js.undefined): CreateNotebookInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeSizeInGB" -> VolumeSizeInGB.map { x => x.asInstanceOf[js.Any] },
        "DirectInternetAccess" -> DirectInternetAccess.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceName" -> NotebookInstanceName.map { x => x.asInstanceOf[js.Any] },
        "AdditionalCodeRepositories" -> AdditionalCodeRepositories.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "AcceleratorTypes" -> AcceleratorTypes.map { x => x.asInstanceOf[js.Any] },
        "LifecycleConfigName" -> LifecycleConfigName.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
        "DefaultCodeRepository" -> DefaultCodeRepository.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNotebookInstanceInput]
    }
  }

  @js.native
  trait CreateNotebookInstanceLifecycleConfigInput extends js.Object {
    var NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName]
    var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList]
    var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList]
  }

  object CreateNotebookInstanceLifecycleConfigInput {
    def apply(
      NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined,
      OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined,
      OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined): CreateNotebookInstanceLifecycleConfigInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceLifecycleConfigName" -> NotebookInstanceLifecycleConfigName.map { x => x.asInstanceOf[js.Any] },
        "OnCreate" -> OnCreate.map { x => x.asInstanceOf[js.Any] },
        "OnStart" -> OnStart.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNotebookInstanceLifecycleConfigInput]
    }
  }

  @js.native
  trait CreateNotebookInstanceLifecycleConfigOutput extends js.Object {
    var NotebookInstanceLifecycleConfigArn: js.UndefOr[NotebookInstanceLifecycleConfigArn]
  }

  object CreateNotebookInstanceLifecycleConfigOutput {
    def apply(
      NotebookInstanceLifecycleConfigArn: js.UndefOr[NotebookInstanceLifecycleConfigArn] = js.undefined): CreateNotebookInstanceLifecycleConfigOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceLifecycleConfigArn" -> NotebookInstanceLifecycleConfigArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNotebookInstanceLifecycleConfigOutput]
    }
  }

  @js.native
  trait CreateNotebookInstanceOutput extends js.Object {
    var NotebookInstanceArn: js.UndefOr[NotebookInstanceArn]
  }

  object CreateNotebookInstanceOutput {
    def apply(
      NotebookInstanceArn: js.UndefOr[NotebookInstanceArn] = js.undefined): CreateNotebookInstanceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceArn" -> NotebookInstanceArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNotebookInstanceOutput]
    }
  }

  @js.native
  trait CreatePresignedNotebookInstanceUrlInput extends js.Object {
    var NotebookInstanceName: js.UndefOr[NotebookInstanceName]
    var SessionExpirationDurationInSeconds: js.UndefOr[SessionExpirationDurationInSeconds]
  }

  object CreatePresignedNotebookInstanceUrlInput {
    def apply(
      NotebookInstanceName: js.UndefOr[NotebookInstanceName] = js.undefined,
      SessionExpirationDurationInSeconds: js.UndefOr[SessionExpirationDurationInSeconds] = js.undefined): CreatePresignedNotebookInstanceUrlInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceName" -> NotebookInstanceName.map { x => x.asInstanceOf[js.Any] },
        "SessionExpirationDurationInSeconds" -> SessionExpirationDurationInSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePresignedNotebookInstanceUrlInput]
    }
  }

  @js.native
  trait CreatePresignedNotebookInstanceUrlOutput extends js.Object {
    var AuthorizedUrl: js.UndefOr[NotebookInstanceUrl]
  }

  object CreatePresignedNotebookInstanceUrlOutput {
    def apply(
      AuthorizedUrl: js.UndefOr[NotebookInstanceUrl] = js.undefined): CreatePresignedNotebookInstanceUrlOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthorizedUrl" -> AuthorizedUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePresignedNotebookInstanceUrlOutput]
    }
  }

  @js.native
  trait CreateTrainingJobRequest extends js.Object {
    var StoppingCondition: js.UndefOr[StoppingCondition]
    var ResourceConfig: js.UndefOr[ResourceConfig]
    var HyperParameters: js.UndefOr[HyperParameters]
    var EnableNetworkIsolation: js.UndefOr[Boolean]
    var AlgorithmSpecification: js.UndefOr[AlgorithmSpecification]
    var VpcConfig: js.UndefOr[VpcConfig]
    var Tags: js.UndefOr[TagList]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var RoleArn: js.UndefOr[RoleArn]
    var TrainingJobName: js.UndefOr[TrainingJobName]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
  }

  object CreateTrainingJobRequest {
    def apply(
      StoppingCondition: js.UndefOr[StoppingCondition] = js.undefined,
      ResourceConfig: js.UndefOr[ResourceConfig] = js.undefined,
      HyperParameters: js.UndefOr[HyperParameters] = js.undefined,
      EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
      AlgorithmSpecification: js.UndefOr[AlgorithmSpecification] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined,
      TrainingJobName: js.UndefOr[TrainingJobName] = js.undefined,
      OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined): CreateTrainingJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StoppingCondition" -> StoppingCondition.map { x => x.asInstanceOf[js.Any] },
        "ResourceConfig" -> ResourceConfig.map { x => x.asInstanceOf[js.Any] },
        "HyperParameters" -> HyperParameters.map { x => x.asInstanceOf[js.Any] },
        "EnableNetworkIsolation" -> EnableNetworkIsolation.map { x => x.asInstanceOf[js.Any] },
        "AlgorithmSpecification" -> AlgorithmSpecification.map { x => x.asInstanceOf[js.Any] },
        "VpcConfig" -> VpcConfig.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
        "TrainingJobName" -> TrainingJobName.map { x => x.asInstanceOf[js.Any] },
        "OutputDataConfig" -> OutputDataConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrainingJobRequest]
    }
  }

  @js.native
  trait CreateTrainingJobResponse extends js.Object {
    var TrainingJobArn: js.UndefOr[TrainingJobArn]
  }

  object CreateTrainingJobResponse {
    def apply(
      TrainingJobArn: js.UndefOr[TrainingJobArn] = js.undefined): CreateTrainingJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrainingJobArn" -> TrainingJobArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrainingJobResponse]
    }
  }

  @js.native
  trait CreateTransformJobRequest extends js.Object {
    var TransformJobName: js.UndefOr[TransformJobName]
    var TransformResources: js.UndefOr[TransformResources]
    var Environment: js.UndefOr[TransformEnvironmentMap]
    var ModelName: js.UndefOr[ModelName]
    var MaxPayloadInMB: js.UndefOr[MaxPayloadInMB]
    var MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms]
    var TransformInput: js.UndefOr[TransformInput]
    var TransformOutput: js.UndefOr[TransformOutput]
    var Tags: js.UndefOr[TagList]
    var BatchStrategy: js.UndefOr[BatchStrategy]
  }

  object CreateTransformJobRequest {
    def apply(
      TransformJobName: js.UndefOr[TransformJobName] = js.undefined,
      TransformResources: js.UndefOr[TransformResources] = js.undefined,
      Environment: js.UndefOr[TransformEnvironmentMap] = js.undefined,
      ModelName: js.UndefOr[ModelName] = js.undefined,
      MaxPayloadInMB: js.UndefOr[MaxPayloadInMB] = js.undefined,
      MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms] = js.undefined,
      TransformInput: js.UndefOr[TransformInput] = js.undefined,
      TransformOutput: js.UndefOr[TransformOutput] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      BatchStrategy: js.UndefOr[BatchStrategy] = js.undefined): CreateTransformJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TransformJobName" -> TransformJobName.map { x => x.asInstanceOf[js.Any] },
        "TransformResources" -> TransformResources.map { x => x.asInstanceOf[js.Any] },
        "Environment" -> Environment.map { x => x.asInstanceOf[js.Any] },
        "ModelName" -> ModelName.map { x => x.asInstanceOf[js.Any] },
        "MaxPayloadInMB" -> MaxPayloadInMB.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrentTransforms" -> MaxConcurrentTransforms.map { x => x.asInstanceOf[js.Any] },
        "TransformInput" -> TransformInput.map { x => x.asInstanceOf[js.Any] },
        "TransformOutput" -> TransformOutput.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "BatchStrategy" -> BatchStrategy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTransformJobRequest]
    }
  }

  @js.native
  trait CreateTransformJobResponse extends js.Object {
    var TransformJobArn: js.UndefOr[TransformJobArn]
  }

  object CreateTransformJobResponse {
    def apply(
      TransformJobArn: js.UndefOr[TransformJobArn] = js.undefined): CreateTransformJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TransformJobArn" -> TransformJobArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTransformJobResponse]
    }
  }

  @js.native
  trait CreateWorkteamRequest extends js.Object {
    var WorkteamName: js.UndefOr[WorkteamName]
    var MemberDefinitions: js.UndefOr[MemberDefinitions]
    var Description: js.UndefOr[String200]
    var Tags: js.UndefOr[TagList]
  }

  object CreateWorkteamRequest {
    def apply(
      WorkteamName: js.UndefOr[WorkteamName] = js.undefined,
      MemberDefinitions: js.UndefOr[MemberDefinitions] = js.undefined,
      Description: js.UndefOr[String200] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateWorkteamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkteamName" -> WorkteamName.map { x => x.asInstanceOf[js.Any] },
        "MemberDefinitions" -> MemberDefinitions.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateWorkteamRequest]
    }
  }

  @js.native
  trait CreateWorkteamResponse extends js.Object {
    var WorkteamArn: js.UndefOr[WorkteamArn]
  }

  object CreateWorkteamResponse {
    def apply(
      WorkteamArn: js.UndefOr[WorkteamArn] = js.undefined): CreateWorkteamResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkteamArn" -> WorkteamArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateWorkteamResponse]
    }
  }

  /**
   * <p>Describes the location of the channel data.</p>
   */
  @js.native
  trait DataSource extends js.Object {
    var S3DataSource: js.UndefOr[S3DataSource]
  }

  object DataSource {
    def apply(
      S3DataSource: js.UndefOr[S3DataSource] = js.undefined): DataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3DataSource" -> S3DataSource.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DataSource]
    }
  }

  @js.native
  trait DeleteAlgorithmInput extends js.Object {
    var AlgorithmName: js.UndefOr[EntityName]
  }

  object DeleteAlgorithmInput {
    def apply(
      AlgorithmName: js.UndefOr[EntityName] = js.undefined): DeleteAlgorithmInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlgorithmName" -> AlgorithmName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAlgorithmInput]
    }
  }

  @js.native
  trait DeleteCodeRepositoryInput extends js.Object {
    var CodeRepositoryName: js.UndefOr[EntityName]
  }

  object DeleteCodeRepositoryInput {
    def apply(
      CodeRepositoryName: js.UndefOr[EntityName] = js.undefined): DeleteCodeRepositoryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeRepositoryName" -> CodeRepositoryName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCodeRepositoryInput]
    }
  }

  @js.native
  trait DeleteEndpointConfigInput extends js.Object {
    var EndpointConfigName: js.UndefOr[EndpointConfigName]
  }

  object DeleteEndpointConfigInput {
    def apply(
      EndpointConfigName: js.UndefOr[EndpointConfigName] = js.undefined): DeleteEndpointConfigInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointConfigName" -> EndpointConfigName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEndpointConfigInput]
    }
  }

  @js.native
  trait DeleteEndpointInput extends js.Object {
    var EndpointName: js.UndefOr[EndpointName]
  }

  object DeleteEndpointInput {
    def apply(
      EndpointName: js.UndefOr[EndpointName] = js.undefined): DeleteEndpointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointName" -> EndpointName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEndpointInput]
    }
  }

  @js.native
  trait DeleteModelInput extends js.Object {
    var ModelName: js.UndefOr[ModelName]
  }

  object DeleteModelInput {
    def apply(
      ModelName: js.UndefOr[ModelName] = js.undefined): DeleteModelInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelName" -> ModelName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteModelInput]
    }
  }

  @js.native
  trait DeleteModelPackageInput extends js.Object {
    var ModelPackageName: js.UndefOr[EntityName]
  }

  object DeleteModelPackageInput {
    def apply(
      ModelPackageName: js.UndefOr[EntityName] = js.undefined): DeleteModelPackageInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelPackageName" -> ModelPackageName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteModelPackageInput]
    }
  }

  @js.native
  trait DeleteNotebookInstanceInput extends js.Object {
    var NotebookInstanceName: js.UndefOr[NotebookInstanceName]
  }

  object DeleteNotebookInstanceInput {
    def apply(
      NotebookInstanceName: js.UndefOr[NotebookInstanceName] = js.undefined): DeleteNotebookInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceName" -> NotebookInstanceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNotebookInstanceInput]
    }
  }

  @js.native
  trait DeleteNotebookInstanceLifecycleConfigInput extends js.Object {
    var NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName]
  }

  object DeleteNotebookInstanceLifecycleConfigInput {
    def apply(
      NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined): DeleteNotebookInstanceLifecycleConfigInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceLifecycleConfigName" -> NotebookInstanceLifecycleConfigName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNotebookInstanceLifecycleConfigInput]
    }
  }

  @js.native
  trait DeleteTagsInput extends js.Object {
    var ResourceArn: js.UndefOr[ResourceArn]
    var TagKeys: js.UndefOr[TagKeyList]
  }

  object DeleteTagsInput {
    def apply(
      ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined): DeleteTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsInput]
    }
  }

  @js.native
  trait DeleteTagsOutput extends js.Object {

  }

  object DeleteTagsOutput {
    def apply(): DeleteTagsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsOutput]
    }
  }

  @js.native
  trait DeleteWorkteamRequest extends js.Object {
    var WorkteamName: js.UndefOr[WorkteamName]
  }

  object DeleteWorkteamRequest {
    def apply(
      WorkteamName: js.UndefOr[WorkteamName] = js.undefined): DeleteWorkteamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkteamName" -> WorkteamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteWorkteamRequest]
    }
  }

  @js.native
  trait DeleteWorkteamResponse extends js.Object {
    var Success: js.UndefOr[Success]
  }

  object DeleteWorkteamResponse {
    def apply(
      Success: js.UndefOr[Success] = js.undefined): DeleteWorkteamResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Success" -> Success.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteWorkteamResponse]
    }
  }

  /**
   * <p>Gets the Amazon EC2 Container Registry path of the docker image of the model that is hosted in this <a>ProductionVariant</a>.</p> <p>If you used the <code>registry/repository[:tag]</code> form to specify the image path of the primary container when you created the model hosted in this <code>ProductionVariant</code>, the path resolves to a path of the form <code>registry/repository[@digest]</code>. A digest is a hash value that identifies a specific version of an image. For information about Amazon ECR paths, see <a href="http://docs.aws.amazon.com//AmazonECR/latest/userguide/docker-pull-ecr-image.html">Pulling an Image</a> in the <i>Amazon ECR User Guide</i>.</p>
   */
  @js.native
  trait DeployedImage extends js.Object {
    var SpecifiedImage: js.UndefOr[Image]
    var ResolvedImage: js.UndefOr[Image]
    var ResolutionTime: js.UndefOr[Timestamp]
  }

  object DeployedImage {
    def apply(
      SpecifiedImage: js.UndefOr[Image] = js.undefined,
      ResolvedImage: js.UndefOr[Image] = js.undefined,
      ResolutionTime: js.UndefOr[Timestamp] = js.undefined): DeployedImage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SpecifiedImage" -> SpecifiedImage.map { x => x.asInstanceOf[js.Any] },
        "ResolvedImage" -> ResolvedImage.map { x => x.asInstanceOf[js.Any] },
        "ResolutionTime" -> ResolutionTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeployedImage]
    }
  }

  @js.native
  trait DescribeAlgorithmInput extends js.Object {
    var AlgorithmName: js.UndefOr[ArnOrName]
  }

  object DescribeAlgorithmInput {
    def apply(
      AlgorithmName: js.UndefOr[ArnOrName] = js.undefined): DescribeAlgorithmInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlgorithmName" -> AlgorithmName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAlgorithmInput]
    }
  }

  @js.native
  trait DescribeAlgorithmOutput extends js.Object {
    var AlgorithmDescription: js.UndefOr[EntityDescription]
    var ProductId: js.UndefOr[ProductId]
    var AlgorithmStatusDetails: js.UndefOr[AlgorithmStatusDetails]
    var InferenceSpecification: js.UndefOr[InferenceSpecification]
    var TrainingSpecification: js.UndefOr[TrainingSpecification]
    var AlgorithmArn: js.UndefOr[AlgorithmArn]
    var AlgorithmName: js.UndefOr[EntityName]
    var CertifyForMarketplace: js.UndefOr[CertifyForMarketplace]
    var ValidationSpecification: js.UndefOr[AlgorithmValidationSpecification]
    var AlgorithmStatus: js.UndefOr[AlgorithmStatus]
    var CreationTime: js.UndefOr[CreationTime]
  }

  object DescribeAlgorithmOutput {
    def apply(
      AlgorithmDescription: js.UndefOr[EntityDescription] = js.undefined,
      ProductId: js.UndefOr[ProductId] = js.undefined,
      AlgorithmStatusDetails: js.UndefOr[AlgorithmStatusDetails] = js.undefined,
      InferenceSpecification: js.UndefOr[InferenceSpecification] = js.undefined,
      TrainingSpecification: js.UndefOr[TrainingSpecification] = js.undefined,
      AlgorithmArn: js.UndefOr[AlgorithmArn] = js.undefined,
      AlgorithmName: js.UndefOr[EntityName] = js.undefined,
      CertifyForMarketplace: js.UndefOr[CertifyForMarketplace] = js.undefined,
      ValidationSpecification: js.UndefOr[AlgorithmValidationSpecification] = js.undefined,
      AlgorithmStatus: js.UndefOr[AlgorithmStatus] = js.undefined,
      CreationTime: js.UndefOr[CreationTime] = js.undefined): DescribeAlgorithmOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlgorithmDescription" -> AlgorithmDescription.map { x => x.asInstanceOf[js.Any] },
        "ProductId" -> ProductId.map { x => x.asInstanceOf[js.Any] },
        "AlgorithmStatusDetails" -> AlgorithmStatusDetails.map { x => x.asInstanceOf[js.Any] },
        "InferenceSpecification" -> InferenceSpecification.map { x => x.asInstanceOf[js.Any] },
        "TrainingSpecification" -> TrainingSpecification.map { x => x.asInstanceOf[js.Any] },
        "AlgorithmArn" -> AlgorithmArn.map { x => x.asInstanceOf[js.Any] },
        "AlgorithmName" -> AlgorithmName.map { x => x.asInstanceOf[js.Any] },
        "CertifyForMarketplace" -> CertifyForMarketplace.map { x => x.asInstanceOf[js.Any] },
        "ValidationSpecification" -> ValidationSpecification.map { x => x.asInstanceOf[js.Any] },
        "AlgorithmStatus" -> AlgorithmStatus.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAlgorithmOutput]
    }
  }

  @js.native
  trait DescribeCodeRepositoryInput extends js.Object {
    var CodeRepositoryName: js.UndefOr[EntityName]
  }

  object DescribeCodeRepositoryInput {
    def apply(
      CodeRepositoryName: js.UndefOr[EntityName] = js.undefined): DescribeCodeRepositoryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeRepositoryName" -> CodeRepositoryName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCodeRepositoryInput]
    }
  }

  @js.native
  trait DescribeCodeRepositoryOutput extends js.Object {
    var CodeRepositoryName: js.UndefOr[EntityName]
    var CodeRepositoryArn: js.UndefOr[CodeRepositoryArn]
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
    var GitConfig: js.UndefOr[GitConfig]
    var CreationTime: js.UndefOr[CreationTime]
  }

  object DescribeCodeRepositoryOutput {
    def apply(
      CodeRepositoryName: js.UndefOr[EntityName] = js.undefined,
      CodeRepositoryArn: js.UndefOr[CodeRepositoryArn] = js.undefined,
      LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined,
      GitConfig: js.UndefOr[GitConfig] = js.undefined,
      CreationTime: js.UndefOr[CreationTime] = js.undefined): DescribeCodeRepositoryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeRepositoryName" -> CodeRepositoryName.map { x => x.asInstanceOf[js.Any] },
        "CodeRepositoryArn" -> CodeRepositoryArn.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "GitConfig" -> GitConfig.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCodeRepositoryOutput]
    }
  }

  @js.native
  trait DescribeCompilationJobRequest extends js.Object {
    var CompilationJobName: js.UndefOr[EntityName]
  }

  object DescribeCompilationJobRequest {
    def apply(
      CompilationJobName: js.UndefOr[EntityName] = js.undefined): DescribeCompilationJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompilationJobName" -> CompilationJobName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCompilationJobRequest]
    }
  }

  @js.native
  trait DescribeCompilationJobResponse extends js.Object {
    var CompilationEndTime: js.UndefOr[Timestamp]
    var CompilationJobStatus: js.UndefOr[CompilationJobStatus]
    var InputConfig: js.UndefOr[InputConfig]
    var StoppingCondition: js.UndefOr[StoppingCondition]
    var ModelArtifacts: js.UndefOr[ModelArtifacts]
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
    var CompilationStartTime: js.UndefOr[Timestamp]
    var CompilationJobArn: js.UndefOr[CompilationJobArn]
    var FailureReason: js.UndefOr[FailureReason]
    var CompilationJobName: js.UndefOr[EntityName]
    var RoleArn: js.UndefOr[RoleArn]
    var OutputConfig: js.UndefOr[OutputConfig]
    var CreationTime: js.UndefOr[CreationTime]
  }

  object DescribeCompilationJobResponse {
    def apply(
      CompilationEndTime: js.UndefOr[Timestamp] = js.undefined,
      CompilationJobStatus: js.UndefOr[CompilationJobStatus] = js.undefined,
      InputConfig: js.UndefOr[InputConfig] = js.undefined,
      StoppingCondition: js.UndefOr[StoppingCondition] = js.undefined,
      ModelArtifacts: js.UndefOr[ModelArtifacts] = js.undefined,
      LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined,
      CompilationStartTime: js.UndefOr[Timestamp] = js.undefined,
      CompilationJobArn: js.UndefOr[CompilationJobArn] = js.undefined,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      CompilationJobName: js.UndefOr[EntityName] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined,
      OutputConfig: js.UndefOr[OutputConfig] = js.undefined,
      CreationTime: js.UndefOr[CreationTime] = js.undefined): DescribeCompilationJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompilationEndTime" -> CompilationEndTime.map { x => x.asInstanceOf[js.Any] },
        "CompilationJobStatus" -> CompilationJobStatus.map { x => x.asInstanceOf[js.Any] },
        "InputConfig" -> InputConfig.map { x => x.asInstanceOf[js.Any] },
        "StoppingCondition" -> StoppingCondition.map { x => x.asInstanceOf[js.Any] },
        "ModelArtifacts" -> ModelArtifacts.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "CompilationStartTime" -> CompilationStartTime.map { x => x.asInstanceOf[js.Any] },
        "CompilationJobArn" -> CompilationJobArn.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "CompilationJobName" -> CompilationJobName.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
        "OutputConfig" -> OutputConfig.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCompilationJobResponse]
    }
  }

  @js.native
  trait DescribeEndpointConfigInput extends js.Object {
    var EndpointConfigName: js.UndefOr[EndpointConfigName]
  }

  object DescribeEndpointConfigInput {
    def apply(
      EndpointConfigName: js.UndefOr[EndpointConfigName] = js.undefined): DescribeEndpointConfigInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointConfigName" -> EndpointConfigName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointConfigInput]
    }
  }

  @js.native
  trait DescribeEndpointConfigOutput extends js.Object {
    var EndpointConfigName: js.UndefOr[EndpointConfigName]
    var EndpointConfigArn: js.UndefOr[EndpointConfigArn]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var ProductionVariants: js.UndefOr[ProductionVariantList]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object DescribeEndpointConfigOutput {
    def apply(
      EndpointConfigName: js.UndefOr[EndpointConfigName] = js.undefined,
      EndpointConfigArn: js.UndefOr[EndpointConfigArn] = js.undefined,
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      ProductionVariants: js.UndefOr[ProductionVariantList] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): DescribeEndpointConfigOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointConfigName" -> EndpointConfigName.map { x => x.asInstanceOf[js.Any] },
        "EndpointConfigArn" -> EndpointConfigArn.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "ProductionVariants" -> ProductionVariants.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointConfigOutput]
    }
  }

  @js.native
  trait DescribeEndpointInput extends js.Object {
    var EndpointName: js.UndefOr[EndpointName]
  }

  object DescribeEndpointInput {
    def apply(
      EndpointName: js.UndefOr[EndpointName] = js.undefined): DescribeEndpointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointName" -> EndpointName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointInput]
    }
  }

  @js.native
  trait DescribeEndpointOutput extends js.Object {
    var EndpointConfigName: js.UndefOr[EndpointConfigName]
    var EndpointArn: js.UndefOr[EndpointArn]
    var EndpointStatus: js.UndefOr[EndpointStatus]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var ProductionVariants: js.UndefOr[ProductionVariantSummaryList]
    var FailureReason: js.UndefOr[FailureReason]
    var EndpointName: js.UndefOr[EndpointName]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object DescribeEndpointOutput {
    def apply(
      EndpointConfigName: js.UndefOr[EndpointConfigName] = js.undefined,
      EndpointArn: js.UndefOr[EndpointArn] = js.undefined,
      EndpointStatus: js.UndefOr[EndpointStatus] = js.undefined,
      LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
      ProductionVariants: js.UndefOr[ProductionVariantSummaryList] = js.undefined,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      EndpointName: js.UndefOr[EndpointName] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): DescribeEndpointOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointConfigName" -> EndpointConfigName.map { x => x.asInstanceOf[js.Any] },
        "EndpointArn" -> EndpointArn.map { x => x.asInstanceOf[js.Any] },
        "EndpointStatus" -> EndpointStatus.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "ProductionVariants" -> ProductionVariants.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "EndpointName" -> EndpointName.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointOutput]
    }
  }

  @js.native
  trait DescribeHyperParameterTuningJobRequest extends js.Object {
    var HyperParameterTuningJobName: js.UndefOr[HyperParameterTuningJobName]
  }

  object DescribeHyperParameterTuningJobRequest {
    def apply(
      HyperParameterTuningJobName: js.UndefOr[HyperParameterTuningJobName] = js.undefined): DescribeHyperParameterTuningJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HyperParameterTuningJobName" -> HyperParameterTuningJobName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHyperParameterTuningJobRequest]
    }
  }

  @js.native
  trait DescribeHyperParameterTuningJobResponse extends js.Object {
    var HyperParameterTuningEndTime: js.UndefOr[Timestamp]
    var TrainingJobDefinition: js.UndefOr[HyperParameterTrainingJobDefinition]
    var ObjectiveStatusCounters: js.UndefOr[ObjectiveStatusCounters]
    var WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig]
    var BestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary]
    var OverallBestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var TrainingJobStatusCounters: js.UndefOr[TrainingJobStatusCounters]
    var HyperParameterTuningJobStatus: js.UndefOr[HyperParameterTuningJobStatus]
    var HyperParameterTuningJobName: js.UndefOr[HyperParameterTuningJobName]
    var FailureReason: js.UndefOr[FailureReason]
    var HyperParameterTuningJobConfig: js.UndefOr[HyperParameterTuningJobConfig]
    var HyperParameterTuningJobArn: js.UndefOr[HyperParameterTuningJobArn]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object DescribeHyperParameterTuningJobResponse {
    def apply(
      HyperParameterTuningEndTime: js.UndefOr[Timestamp] = js.undefined,
      TrainingJobDefinition: js.UndefOr[HyperParameterTrainingJobDefinition] = js.undefined,
      ObjectiveStatusCounters: js.UndefOr[ObjectiveStatusCounters] = js.undefined,
      WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig] = js.undefined,
      BestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary] = js.undefined,
      OverallBestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary] = js.undefined,
      LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
      TrainingJobStatusCounters: js.UndefOr[TrainingJobStatusCounters] = js.undefined,
      HyperParameterTuningJobStatus: js.UndefOr[HyperParameterTuningJobStatus] = js.undefined,
      HyperParameterTuningJobName: js.UndefOr[HyperParameterTuningJobName] = js.undefined,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      HyperParameterTuningJobConfig: js.UndefOr[HyperParameterTuningJobConfig] = js.undefined,
      HyperParameterTuningJobArn: js.UndefOr[HyperParameterTuningJobArn] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): DescribeHyperParameterTuningJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HyperParameterTuningEndTime" -> HyperParameterTuningEndTime.map { x => x.asInstanceOf[js.Any] },
        "TrainingJobDefinition" -> TrainingJobDefinition.map { x => x.asInstanceOf[js.Any] },
        "ObjectiveStatusCounters" -> ObjectiveStatusCounters.map { x => x.asInstanceOf[js.Any] },
        "WarmStartConfig" -> WarmStartConfig.map { x => x.asInstanceOf[js.Any] },
        "BestTrainingJob" -> BestTrainingJob.map { x => x.asInstanceOf[js.Any] },
        "OverallBestTrainingJob" -> OverallBestTrainingJob.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "TrainingJobStatusCounters" -> TrainingJobStatusCounters.map { x => x.asInstanceOf[js.Any] },
        "HyperParameterTuningJobStatus" -> HyperParameterTuningJobStatus.map { x => x.asInstanceOf[js.Any] },
        "HyperParameterTuningJobName" -> HyperParameterTuningJobName.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "HyperParameterTuningJobConfig" -> HyperParameterTuningJobConfig.map { x => x.asInstanceOf[js.Any] },
        "HyperParameterTuningJobArn" -> HyperParameterTuningJobArn.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHyperParameterTuningJobResponse]
    }
  }

  @js.native
  trait DescribeLabelingJobRequest extends js.Object {
    var LabelingJobName: js.UndefOr[LabelingJobName]
  }

  object DescribeLabelingJobRequest {
    def apply(
      LabelingJobName: js.UndefOr[LabelingJobName] = js.undefined): DescribeLabelingJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LabelingJobName" -> LabelingJobName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLabelingJobRequest]
    }
  }

  @js.native
  trait DescribeLabelingJobResponse extends js.Object {
    var LabelingJobOutput: js.UndefOr[LabelingJobOutput]
    var InputConfig: js.UndefOr[LabelingJobInputConfig]
    var LabelCategoryConfigS3Uri: js.UndefOr[S3Uri]
    var JobReferenceCode: js.UndefOr[JobReferenceCode]
    var LabelingJobName: js.UndefOr[LabelingJobName]
    var LabelCounters: js.UndefOr[LabelCounters]
    var HumanTaskConfig: js.UndefOr[HumanTaskConfig]
    var LabelAttributeName: js.UndefOr[LabelAttributeName]
    var StoppingConditions: js.UndefOr[LabelingJobStoppingConditions]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var FailureReason: js.UndefOr[FailureReason]
    var LabelingJobStatus: js.UndefOr[LabelingJobStatus]
    var LabelingJobAlgorithmsConfig: js.UndefOr[LabelingJobAlgorithmsConfig]
    var Tags: js.UndefOr[TagList]
    var LabelingJobArn: js.UndefOr[LabelingJobArn]
    var RoleArn: js.UndefOr[RoleArn]
    var OutputConfig: js.UndefOr[LabelingJobOutputConfig]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object DescribeLabelingJobResponse {
    def apply(
      LabelingJobOutput: js.UndefOr[LabelingJobOutput] = js.undefined,
      InputConfig: js.UndefOr[LabelingJobInputConfig] = js.undefined,
      LabelCategoryConfigS3Uri: js.UndefOr[S3Uri] = js.undefined,
      JobReferenceCode: js.UndefOr[JobReferenceCode] = js.undefined,
      LabelingJobName: js.UndefOr[LabelingJobName] = js.undefined,
      LabelCounters: js.UndefOr[LabelCounters] = js.undefined,
      HumanTaskConfig: js.UndefOr[HumanTaskConfig] = js.undefined,
      LabelAttributeName: js.UndefOr[LabelAttributeName] = js.undefined,
      StoppingConditions: js.UndefOr[LabelingJobStoppingConditions] = js.undefined,
      LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      LabelingJobStatus: js.UndefOr[LabelingJobStatus] = js.undefined,
      LabelingJobAlgorithmsConfig: js.UndefOr[LabelingJobAlgorithmsConfig] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      LabelingJobArn: js.UndefOr[LabelingJobArn] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined,
      OutputConfig: js.UndefOr[LabelingJobOutputConfig] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): DescribeLabelingJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LabelingJobOutput" -> LabelingJobOutput.map { x => x.asInstanceOf[js.Any] },
        "InputConfig" -> InputConfig.map { x => x.asInstanceOf[js.Any] },
        "LabelCategoryConfigS3Uri" -> LabelCategoryConfigS3Uri.map { x => x.asInstanceOf[js.Any] },
        "JobReferenceCode" -> JobReferenceCode.map { x => x.asInstanceOf[js.Any] },
        "LabelingJobName" -> LabelingJobName.map { x => x.asInstanceOf[js.Any] },
        "LabelCounters" -> LabelCounters.map { x => x.asInstanceOf[js.Any] },
        "HumanTaskConfig" -> HumanTaskConfig.map { x => x.asInstanceOf[js.Any] },
        "LabelAttributeName" -> LabelAttributeName.map { x => x.asInstanceOf[js.Any] },
        "StoppingConditions" -> StoppingConditions.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "LabelingJobStatus" -> LabelingJobStatus.map { x => x.asInstanceOf[js.Any] },
        "LabelingJobAlgorithmsConfig" -> LabelingJobAlgorithmsConfig.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "LabelingJobArn" -> LabelingJobArn.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
        "OutputConfig" -> OutputConfig.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLabelingJobResponse]
    }
  }

  @js.native
  trait DescribeModelInput extends js.Object {
    var ModelName: js.UndefOr[ModelName]
  }

  object DescribeModelInput {
    def apply(
      ModelName: js.UndefOr[ModelName] = js.undefined): DescribeModelInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelName" -> ModelName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeModelInput]
    }
  }

  @js.native
  trait DescribeModelOutput extends js.Object {
    var Containers: js.UndefOr[ContainerDefinitionList]
    var ModelName: js.UndefOr[ModelName]
    var EnableNetworkIsolation: js.UndefOr[Boolean]
    var ModelArn: js.UndefOr[ModelArn]
    var VpcConfig: js.UndefOr[VpcConfig]
    var PrimaryContainer: js.UndefOr[ContainerDefinition]
    var ExecutionRoleArn: js.UndefOr[RoleArn]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object DescribeModelOutput {
    def apply(
      Containers: js.UndefOr[ContainerDefinitionList] = js.undefined,
      ModelName: js.UndefOr[ModelName] = js.undefined,
      EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
      ModelArn: js.UndefOr[ModelArn] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined,
      PrimaryContainer: js.UndefOr[ContainerDefinition] = js.undefined,
      ExecutionRoleArn: js.UndefOr[RoleArn] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): DescribeModelOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Containers" -> Containers.map { x => x.asInstanceOf[js.Any] },
        "ModelName" -> ModelName.map { x => x.asInstanceOf[js.Any] },
        "EnableNetworkIsolation" -> EnableNetworkIsolation.map { x => x.asInstanceOf[js.Any] },
        "ModelArn" -> ModelArn.map { x => x.asInstanceOf[js.Any] },
        "VpcConfig" -> VpcConfig.map { x => x.asInstanceOf[js.Any] },
        "PrimaryContainer" -> PrimaryContainer.map { x => x.asInstanceOf[js.Any] },
        "ExecutionRoleArn" -> ExecutionRoleArn.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeModelOutput]
    }
  }

  @js.native
  trait DescribeModelPackageInput extends js.Object {
    var ModelPackageName: js.UndefOr[ArnOrName]
  }

  object DescribeModelPackageInput {
    def apply(
      ModelPackageName: js.UndefOr[ArnOrName] = js.undefined): DescribeModelPackageInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelPackageName" -> ModelPackageName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeModelPackageInput]
    }
  }

  @js.native
  trait DescribeModelPackageOutput extends js.Object {
    var ModelPackageArn: js.UndefOr[ModelPackageArn]
    var SourceAlgorithmSpecification: js.UndefOr[SourceAlgorithmSpecification]
    var InferenceSpecification: js.UndefOr[InferenceSpecification]
    var ModelPackageName: js.UndefOr[EntityName]
    var ModelPackageDescription: js.UndefOr[EntityDescription]
    var CertifyForMarketplace: js.UndefOr[CertifyForMarketplace]
    var ModelPackageStatusDetails: js.UndefOr[ModelPackageStatusDetails]
    var ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification]
    var ModelPackageStatus: js.UndefOr[ModelPackageStatus]
    var CreationTime: js.UndefOr[CreationTime]
  }

  object DescribeModelPackageOutput {
    def apply(
      ModelPackageArn: js.UndefOr[ModelPackageArn] = js.undefined,
      SourceAlgorithmSpecification: js.UndefOr[SourceAlgorithmSpecification] = js.undefined,
      InferenceSpecification: js.UndefOr[InferenceSpecification] = js.undefined,
      ModelPackageName: js.UndefOr[EntityName] = js.undefined,
      ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined,
      CertifyForMarketplace: js.UndefOr[CertifyForMarketplace] = js.undefined,
      ModelPackageStatusDetails: js.UndefOr[ModelPackageStatusDetails] = js.undefined,
      ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification] = js.undefined,
      ModelPackageStatus: js.UndefOr[ModelPackageStatus] = js.undefined,
      CreationTime: js.UndefOr[CreationTime] = js.undefined): DescribeModelPackageOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelPackageArn" -> ModelPackageArn.map { x => x.asInstanceOf[js.Any] },
        "SourceAlgorithmSpecification" -> SourceAlgorithmSpecification.map { x => x.asInstanceOf[js.Any] },
        "InferenceSpecification" -> InferenceSpecification.map { x => x.asInstanceOf[js.Any] },
        "ModelPackageName" -> ModelPackageName.map { x => x.asInstanceOf[js.Any] },
        "ModelPackageDescription" -> ModelPackageDescription.map { x => x.asInstanceOf[js.Any] },
        "CertifyForMarketplace" -> CertifyForMarketplace.map { x => x.asInstanceOf[js.Any] },
        "ModelPackageStatusDetails" -> ModelPackageStatusDetails.map { x => x.asInstanceOf[js.Any] },
        "ValidationSpecification" -> ValidationSpecification.map { x => x.asInstanceOf[js.Any] },
        "ModelPackageStatus" -> ModelPackageStatus.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeModelPackageOutput]
    }
  }

  @js.native
  trait DescribeNotebookInstanceInput extends js.Object {
    var NotebookInstanceName: js.UndefOr[NotebookInstanceName]
  }

  object DescribeNotebookInstanceInput {
    def apply(
      NotebookInstanceName: js.UndefOr[NotebookInstanceName] = js.undefined): DescribeNotebookInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceName" -> NotebookInstanceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNotebookInstanceInput]
    }
  }

  @js.native
  trait DescribeNotebookInstanceLifecycleConfigInput extends js.Object {
    var NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName]
  }

  object DescribeNotebookInstanceLifecycleConfigInput {
    def apply(
      NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined): DescribeNotebookInstanceLifecycleConfigInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceLifecycleConfigName" -> NotebookInstanceLifecycleConfigName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNotebookInstanceLifecycleConfigInput]
    }
  }

  @js.native
  trait DescribeNotebookInstanceLifecycleConfigOutput extends js.Object {
    var NotebookInstanceLifecycleConfigArn: js.UndefOr[NotebookInstanceLifecycleConfigArn]
    var NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName]
    var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList]
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
    var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList]
    var CreationTime: js.UndefOr[CreationTime]
  }

  object DescribeNotebookInstanceLifecycleConfigOutput {
    def apply(
      NotebookInstanceLifecycleConfigArn: js.UndefOr[NotebookInstanceLifecycleConfigArn] = js.undefined,
      NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined,
      OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined,
      LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined,
      OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined,
      CreationTime: js.UndefOr[CreationTime] = js.undefined): DescribeNotebookInstanceLifecycleConfigOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceLifecycleConfigArn" -> NotebookInstanceLifecycleConfigArn.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceLifecycleConfigName" -> NotebookInstanceLifecycleConfigName.map { x => x.asInstanceOf[js.Any] },
        "OnCreate" -> OnCreate.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "OnStart" -> OnStart.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNotebookInstanceLifecycleConfigOutput]
    }
  }

  @js.native
  trait DescribeNotebookInstanceOutput extends js.Object {
    var NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName]
    var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB]
    var DirectInternetAccess: js.UndefOr[DirectInternetAccess]
    var SecurityGroups: js.UndefOr[SecurityGroupIds]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var NotebookInstanceName: js.UndefOr[NotebookInstanceName]
    var NotebookInstanceStatus: js.UndefOr[NotebookInstanceStatus]
    var NotebookInstanceArn: js.UndefOr[NotebookInstanceArn]
    var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls]
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
    var InstanceType: js.UndefOr[InstanceType]
    var FailureReason: js.UndefOr[FailureReason]
    var Url: js.UndefOr[NotebookInstanceUrl]
    var AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var RoleArn: js.UndefOr[RoleArn]
    var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl]
    var CreationTime: js.UndefOr[CreationTime]
    var SubnetId: js.UndefOr[SubnetId]
  }

  object DescribeNotebookInstanceOutput {
    def apply(
      NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined,
      VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.undefined,
      DirectInternetAccess: js.UndefOr[DirectInternetAccess] = js.undefined,
      SecurityGroups: js.UndefOr[SecurityGroupIds] = js.undefined,
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      NotebookInstanceName: js.UndefOr[NotebookInstanceName] = js.undefined,
      NotebookInstanceStatus: js.UndefOr[NotebookInstanceStatus] = js.undefined,
      NotebookInstanceArn: js.UndefOr[NotebookInstanceArn] = js.undefined,
      AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.undefined,
      LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      Url: js.UndefOr[NotebookInstanceUrl] = js.undefined,
      AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes] = js.undefined,
      NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined,
      DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.undefined,
      CreationTime: js.UndefOr[CreationTime] = js.undefined,
      SubnetId: js.UndefOr[SubnetId] = js.undefined): DescribeNotebookInstanceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceLifecycleConfigName" -> NotebookInstanceLifecycleConfigName.map { x => x.asInstanceOf[js.Any] },
        "VolumeSizeInGB" -> VolumeSizeInGB.map { x => x.asInstanceOf[js.Any] },
        "DirectInternetAccess" -> DirectInternetAccess.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceName" -> NotebookInstanceName.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceStatus" -> NotebookInstanceStatus.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceArn" -> NotebookInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "AdditionalCodeRepositories" -> AdditionalCodeRepositories.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] },
        "AcceleratorTypes" -> AcceleratorTypes.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
        "DefaultCodeRepository" -> DefaultCodeRepository.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNotebookInstanceOutput]
    }
  }

  @js.native
  trait DescribeSubscribedWorkteamRequest extends js.Object {
    var WorkteamArn: js.UndefOr[WorkteamArn]
  }

  object DescribeSubscribedWorkteamRequest {
    def apply(
      WorkteamArn: js.UndefOr[WorkteamArn] = js.undefined): DescribeSubscribedWorkteamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkteamArn" -> WorkteamArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSubscribedWorkteamRequest]
    }
  }

  @js.native
  trait DescribeSubscribedWorkteamResponse extends js.Object {
    var SubscribedWorkteam: js.UndefOr[SubscribedWorkteam]
  }

  object DescribeSubscribedWorkteamResponse {
    def apply(
      SubscribedWorkteam: js.UndefOr[SubscribedWorkteam] = js.undefined): DescribeSubscribedWorkteamResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscribedWorkteam" -> SubscribedWorkteam.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSubscribedWorkteamResponse]
    }
  }

  @js.native
  trait DescribeTrainingJobRequest extends js.Object {
    var TrainingJobName: js.UndefOr[TrainingJobName]
  }

  object DescribeTrainingJobRequest {
    def apply(
      TrainingJobName: js.UndefOr[TrainingJobName] = js.undefined): DescribeTrainingJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrainingJobName" -> TrainingJobName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTrainingJobRequest]
    }
  }

  @js.native
  trait DescribeTrainingJobResponse extends js.Object {
    var FinalMetricDataList: js.UndefOr[FinalMetricDataList]
    var SecondaryStatus: js.UndefOr[SecondaryStatus]
    var TrainingStartTime: js.UndefOr[Timestamp]
    var SecondaryStatusTransitions: js.UndefOr[SecondaryStatusTransitions]
    var StoppingCondition: js.UndefOr[StoppingCondition]
    var ModelArtifacts: js.UndefOr[ModelArtifacts]
    var TrainingJobStatus: js.UndefOr[TrainingJobStatus]
    var ResourceConfig: js.UndefOr[ResourceConfig]
    var HyperParameters: js.UndefOr[HyperParameters]
    var EnableNetworkIsolation: js.UndefOr[Boolean]
    var TrainingJobArn: js.UndefOr[TrainingJobArn]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var AlgorithmSpecification: js.UndefOr[AlgorithmSpecification]
    var FailureReason: js.UndefOr[FailureReason]
    var VpcConfig: js.UndefOr[VpcConfig]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var LabelingJobArn: js.UndefOr[LabelingJobArn]
    var RoleArn: js.UndefOr[RoleArn]
    var TrainingJobName: js.UndefOr[TrainingJobName]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var TrainingEndTime: js.UndefOr[Timestamp]
    var TuningJobArn: js.UndefOr[HyperParameterTuningJobArn]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object DescribeTrainingJobResponse {
    def apply(
      FinalMetricDataList: js.UndefOr[FinalMetricDataList] = js.undefined,
      SecondaryStatus: js.UndefOr[SecondaryStatus] = js.undefined,
      TrainingStartTime: js.UndefOr[Timestamp] = js.undefined,
      SecondaryStatusTransitions: js.UndefOr[SecondaryStatusTransitions] = js.undefined,
      StoppingCondition: js.UndefOr[StoppingCondition] = js.undefined,
      ModelArtifacts: js.UndefOr[ModelArtifacts] = js.undefined,
      TrainingJobStatus: js.UndefOr[TrainingJobStatus] = js.undefined,
      ResourceConfig: js.UndefOr[ResourceConfig] = js.undefined,
      HyperParameters: js.UndefOr[HyperParameters] = js.undefined,
      EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
      TrainingJobArn: js.UndefOr[TrainingJobArn] = js.undefined,
      LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
      AlgorithmSpecification: js.UndefOr[AlgorithmSpecification] = js.undefined,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined,
      InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
      LabelingJobArn: js.UndefOr[LabelingJobArn] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined,
      TrainingJobName: js.UndefOr[TrainingJobName] = js.undefined,
      OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
      TrainingEndTime: js.UndefOr[Timestamp] = js.undefined,
      TuningJobArn: js.UndefOr[HyperParameterTuningJobArn] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): DescribeTrainingJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FinalMetricDataList" -> FinalMetricDataList.map { x => x.asInstanceOf[js.Any] },
        "SecondaryStatus" -> SecondaryStatus.map { x => x.asInstanceOf[js.Any] },
        "TrainingStartTime" -> TrainingStartTime.map { x => x.asInstanceOf[js.Any] },
        "SecondaryStatusTransitions" -> SecondaryStatusTransitions.map { x => x.asInstanceOf[js.Any] },
        "StoppingCondition" -> StoppingCondition.map { x => x.asInstanceOf[js.Any] },
        "ModelArtifacts" -> ModelArtifacts.map { x => x.asInstanceOf[js.Any] },
        "TrainingJobStatus" -> TrainingJobStatus.map { x => x.asInstanceOf[js.Any] },
        "ResourceConfig" -> ResourceConfig.map { x => x.asInstanceOf[js.Any] },
        "HyperParameters" -> HyperParameters.map { x => x.asInstanceOf[js.Any] },
        "EnableNetworkIsolation" -> EnableNetworkIsolation.map { x => x.asInstanceOf[js.Any] },
        "TrainingJobArn" -> TrainingJobArn.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "AlgorithmSpecification" -> AlgorithmSpecification.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "VpcConfig" -> VpcConfig.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "LabelingJobArn" -> LabelingJobArn.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
        "TrainingJobName" -> TrainingJobName.map { x => x.asInstanceOf[js.Any] },
        "OutputDataConfig" -> OutputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "TrainingEndTime" -> TrainingEndTime.map { x => x.asInstanceOf[js.Any] },
        "TuningJobArn" -> TuningJobArn.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTrainingJobResponse]
    }
  }

  @js.native
  trait DescribeTransformJobRequest extends js.Object {
    var TransformJobName: js.UndefOr[TransformJobName]
  }

  object DescribeTransformJobRequest {
    def apply(
      TransformJobName: js.UndefOr[TransformJobName] = js.undefined): DescribeTransformJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TransformJobName" -> TransformJobName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTransformJobRequest]
    }
  }

  @js.native
  trait DescribeTransformJobResponse extends js.Object {
    var TransformJobName: js.UndefOr[TransformJobName]
    var TransformResources: js.UndefOr[TransformResources]
    var Environment: js.UndefOr[TransformEnvironmentMap]
    var ModelName: js.UndefOr[ModelName]
    var MaxPayloadInMB: js.UndefOr[MaxPayloadInMB]
    var MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms]
    var TransformInput: js.UndefOr[TransformInput]
    var FailureReason: js.UndefOr[FailureReason]
    var TransformOutput: js.UndefOr[TransformOutput]
    var TransformJobStatus: js.UndefOr[TransformJobStatus]
    var BatchStrategy: js.UndefOr[BatchStrategy]
    var TransformEndTime: js.UndefOr[Timestamp]
    var LabelingJobArn: js.UndefOr[LabelingJobArn]
    var TransformJobArn: js.UndefOr[TransformJobArn]
    var TransformStartTime: js.UndefOr[Timestamp]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object DescribeTransformJobResponse {
    def apply(
      TransformJobName: js.UndefOr[TransformJobName] = js.undefined,
      TransformResources: js.UndefOr[TransformResources] = js.undefined,
      Environment: js.UndefOr[TransformEnvironmentMap] = js.undefined,
      ModelName: js.UndefOr[ModelName] = js.undefined,
      MaxPayloadInMB: js.UndefOr[MaxPayloadInMB] = js.undefined,
      MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms] = js.undefined,
      TransformInput: js.UndefOr[TransformInput] = js.undefined,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      TransformOutput: js.UndefOr[TransformOutput] = js.undefined,
      TransformJobStatus: js.UndefOr[TransformJobStatus] = js.undefined,
      BatchStrategy: js.UndefOr[BatchStrategy] = js.undefined,
      TransformEndTime: js.UndefOr[Timestamp] = js.undefined,
      LabelingJobArn: js.UndefOr[LabelingJobArn] = js.undefined,
      TransformJobArn: js.UndefOr[TransformJobArn] = js.undefined,
      TransformStartTime: js.UndefOr[Timestamp] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): DescribeTransformJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TransformJobName" -> TransformJobName.map { x => x.asInstanceOf[js.Any] },
        "TransformResources" -> TransformResources.map { x => x.asInstanceOf[js.Any] },
        "Environment" -> Environment.map { x => x.asInstanceOf[js.Any] },
        "ModelName" -> ModelName.map { x => x.asInstanceOf[js.Any] },
        "MaxPayloadInMB" -> MaxPayloadInMB.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrentTransforms" -> MaxConcurrentTransforms.map { x => x.asInstanceOf[js.Any] },
        "TransformInput" -> TransformInput.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "TransformOutput" -> TransformOutput.map { x => x.asInstanceOf[js.Any] },
        "TransformJobStatus" -> TransformJobStatus.map { x => x.asInstanceOf[js.Any] },
        "BatchStrategy" -> BatchStrategy.map { x => x.asInstanceOf[js.Any] },
        "TransformEndTime" -> TransformEndTime.map { x => x.asInstanceOf[js.Any] },
        "LabelingJobArn" -> LabelingJobArn.map { x => x.asInstanceOf[js.Any] },
        "TransformJobArn" -> TransformJobArn.map { x => x.asInstanceOf[js.Any] },
        "TransformStartTime" -> TransformStartTime.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTransformJobResponse]
    }
  }

  @js.native
  trait DescribeWorkteamRequest extends js.Object {
    var WorkteamName: js.UndefOr[WorkteamName]
  }

  object DescribeWorkteamRequest {
    def apply(
      WorkteamName: js.UndefOr[WorkteamName] = js.undefined): DescribeWorkteamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkteamName" -> WorkteamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkteamRequest]
    }
  }

  @js.native
  trait DescribeWorkteamResponse extends js.Object {
    var Workteam: js.UndefOr[Workteam]
  }

  object DescribeWorkteamResponse {
    def apply(
      Workteam: js.UndefOr[Workteam] = js.undefined): DescribeWorkteamResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Workteam" -> Workteam.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkteamResponse]
    }
  }

  /**
   * <p>Specifies weight and capacity values for a production variant.</p>
   */
  @js.native
  trait DesiredWeightAndCapacity extends js.Object {
    var VariantName: js.UndefOr[VariantName]
    var DesiredWeight: js.UndefOr[VariantWeight]
    var DesiredInstanceCount: js.UndefOr[TaskCount]
  }

  object DesiredWeightAndCapacity {
    def apply(
      VariantName: js.UndefOr[VariantName] = js.undefined,
      DesiredWeight: js.UndefOr[VariantWeight] = js.undefined,
      DesiredInstanceCount: js.UndefOr[TaskCount] = js.undefined): DesiredWeightAndCapacity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VariantName" -> VariantName.map { x => x.asInstanceOf[js.Any] },
        "DesiredWeight" -> DesiredWeight.map { x => x.asInstanceOf[js.Any] },
        "DesiredInstanceCount" -> DesiredInstanceCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DesiredWeightAndCapacity]
    }
  }

  object DetailedAlgorithmStatusEnum {
    val NotStarted = "NotStarted"
    val InProgress = "InProgress"
    val Completed = "Completed"
    val Failed = "Failed"

    val values = IndexedSeq(NotStarted, InProgress, Completed, Failed)
  }

  object DetailedModelPackageStatusEnum {
    val NotStarted = "NotStarted"
    val InProgress = "InProgress"
    val Completed = "Completed"
    val Failed = "Failed"

    val values = IndexedSeq(NotStarted, InProgress, Completed, Failed)
  }

  object DirectInternetAccessEnum {
    val Enabled = "Enabled"
    val Disabled = "Disabled"

    val values = IndexedSeq(Enabled, Disabled)
  }

  object EndpointConfigSortKeyEnum {
    val Name = "Name"
    val CreationTime = "CreationTime"

    val values = IndexedSeq(Name, CreationTime)
  }

  /**
   * <p>Provides summary information for an endpoint configuration.</p>
   */
  @js.native
  trait EndpointConfigSummary extends js.Object {
    var EndpointConfigName: js.UndefOr[EndpointConfigName]
    var EndpointConfigArn: js.UndefOr[EndpointConfigArn]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object EndpointConfigSummary {
    def apply(
      EndpointConfigName: js.UndefOr[EndpointConfigName] = js.undefined,
      EndpointConfigArn: js.UndefOr[EndpointConfigArn] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): EndpointConfigSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointConfigName" -> EndpointConfigName.map { x => x.asInstanceOf[js.Any] },
        "EndpointConfigArn" -> EndpointConfigArn.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EndpointConfigSummary]
    }
  }

  object EndpointSortKeyEnum {
    val Name = "Name"
    val CreationTime = "CreationTime"
    val Status = "Status"

    val values = IndexedSeq(Name, CreationTime, Status)
  }

  object EndpointStatusEnum {
    val OutOfService = "OutOfService"
    val Creating = "Creating"
    val Updating = "Updating"
    val SystemUpdating = "SystemUpdating"
    val RollingBack = "RollingBack"
    val InService = "InService"
    val Deleting = "Deleting"
    val Failed = "Failed"

    val values = IndexedSeq(OutOfService, Creating, Updating, SystemUpdating, RollingBack, InService, Deleting, Failed)
  }

  /**
   * <p>Provides summary information for an endpoint.</p>
   */
  @js.native
  trait EndpointSummary extends js.Object {
    var EndpointArn: js.UndefOr[EndpointArn]
    var EndpointStatus: js.UndefOr[EndpointStatus]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var EndpointName: js.UndefOr[EndpointName]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object EndpointSummary {
    def apply(
      EndpointArn: js.UndefOr[EndpointArn] = js.undefined,
      EndpointStatus: js.UndefOr[EndpointStatus] = js.undefined,
      LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
      EndpointName: js.UndefOr[EndpointName] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): EndpointSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointArn" -> EndpointArn.map { x => x.asInstanceOf[js.Any] },
        "EndpointStatus" -> EndpointStatus.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "EndpointName" -> EndpointName.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EndpointSummary]
    }
  }

  /**
   * <p>A conditional statement for a search expression that includes a Boolean operator, a resource property, and a value.</p> <p>If you don't specify an <code>Operator</code> and a <code>Value</code>, the filter searches for only the specified property. For example, defining a <code>Filter</code> for the <code>FailureReason</code> for the <code>TrainingJob</code> <code>Resource</code> searches for training job objects that have a value in the <code>FailureReason</code> field.</p> <p>If you specify a <code>Value</code>, but not an <code>Operator</code>, Amazon SageMaker uses the equals operator as a default.</p> <p>In search, there are several property types:</p> <dl> <dt>Metrics</dt> <dd> <p>To define a metric filter, enter a value using the form <code>"Metrics.&lt;name&gt;"</code>, where <code>&lt;name&gt;</code> is a metric name. For example, the following filter searches for training jobs with an <code>"accuracy"</code> metric greater than <code>"0.9"</code>:</p> <p> <code>{</code> </p> <p> <code>"Name": "Metrics.accuracy",</code> </p> <p> <code>"Operator": "GREATER_THAN",</code> </p> <p> <code>"Value": "0.9"</code> </p> <p> <code>}</code> </p> </dd> <dt>HyperParameters</dt> <dd> <p>To define a hyperparameter filter, enter a value with the form <code>"HyperParamters.&lt;name&gt;"</code>. Decimal hyperparameter values are treated as a decimal in a comparison if the specified <code>Value</code> is also a decimal value. If the specified <code>Value</code> is an integer, the decimal hyperparameter values are treated as integers. For example, the following filter is satisfied by training jobs with a <code>"learning_rate"</code> hyperparameter that is less than <code>"0.5"</code>:</p> <p> <code> {</code> </p> <p> <code> "Name": "HyperParameters.learning_rate",</code> </p> <p> <code> "Operator": "LESS_THAN",</code> </p> <p> <code> "Value": "0.5"</code> </p> <p> <code> }</code> </p> </dd> <dt>Tags</dt> <dd> <p>To define a tag filter, enter a value with the form <code>"Tags.&lt;key&gt;"</code>.</p> </dd> </dl>
   */
  @js.native
  trait Filter extends js.Object {
    var Name: js.UndefOr[ResourcePropertyName]
    var Operator: js.UndefOr[Operator]
    var Value: js.UndefOr[FilterValue]
  }

  object Filter {
    def apply(
      Name: js.UndefOr[ResourcePropertyName] = js.undefined,
      Operator: js.UndefOr[Operator] = js.undefined,
      Value: js.UndefOr[FilterValue] = js.undefined): Filter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Operator" -> Operator.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Filter]
    }
  }

  /**
   * <p>Shows the final value for the objective metric for a training job that was launched by a hyperparameter tuning job. You define the objective metric in the <code>HyperParameterTuningJobObjective</code> parameter of <a>HyperParameterTuningJobConfig</a>.</p>
   */
  @js.native
  trait FinalHyperParameterTuningJobObjectiveMetric extends js.Object {
    var Type: js.UndefOr[HyperParameterTuningJobObjectiveType]
    var MetricName: js.UndefOr[MetricName]
    var Value: js.UndefOr[MetricValue]
  }

  object FinalHyperParameterTuningJobObjectiveMetric {
    def apply(
      Type: js.UndefOr[HyperParameterTuningJobObjectiveType] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined,
      Value: js.UndefOr[MetricValue] = js.undefined): FinalHyperParameterTuningJobObjectiveMetric = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FinalHyperParameterTuningJobObjectiveMetric]
    }
  }

  object FrameworkEnum {
    val TENSORFLOW = "TENSORFLOW"
    val MXNET = "MXNET"
    val ONNX = "ONNX"
    val PYTORCH = "PYTORCH"
    val XGBOOST = "XGBOOST"

    val values = IndexedSeq(TENSORFLOW, MXNET, ONNX, PYTORCH, XGBOOST)
  }

  @js.native
  trait GetSearchSuggestionsRequest extends js.Object {
    var Resource: js.UndefOr[ResourceType]
    var SuggestionQuery: js.UndefOr[SuggestionQuery]
  }

  object GetSearchSuggestionsRequest {
    def apply(
      Resource: js.UndefOr[ResourceType] = js.undefined,
      SuggestionQuery: js.UndefOr[SuggestionQuery] = js.undefined): GetSearchSuggestionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Resource" -> Resource.map { x => x.asInstanceOf[js.Any] },
        "SuggestionQuery" -> SuggestionQuery.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSearchSuggestionsRequest]
    }
  }

  @js.native
  trait GetSearchSuggestionsResponse extends js.Object {
    var PropertyNameSuggestions: js.UndefOr[PropertyNameSuggestionList]
  }

  object GetSearchSuggestionsResponse {
    def apply(
      PropertyNameSuggestions: js.UndefOr[PropertyNameSuggestionList] = js.undefined): GetSearchSuggestionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PropertyNameSuggestions" -> PropertyNameSuggestions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSearchSuggestionsResponse]
    }
  }

  /**
   * <p>Specifies configuration details for a git repository in your AWS account.</p>
   */
  @js.native
  trait GitConfig extends js.Object {
    var RepositoryUrl: js.UndefOr[Url]
    var Branch: js.UndefOr[Branch]
    var SecretArn: js.UndefOr[SecretArn]
  }

  object GitConfig {
    def apply(
      RepositoryUrl: js.UndefOr[Url] = js.undefined,
      Branch: js.UndefOr[Branch] = js.undefined,
      SecretArn: js.UndefOr[SecretArn] = js.undefined): GitConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RepositoryUrl" -> RepositoryUrl.map { x => x.asInstanceOf[js.Any] },
        "Branch" -> Branch.map { x => x.asInstanceOf[js.Any] },
        "SecretArn" -> SecretArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GitConfig]
    }
  }

  /**
   * <p>Specifies configuration details for a git repository when the repository is updated.</p>
   */
  @js.native
  trait GitConfigForUpdate extends js.Object {
    var SecretArn: js.UndefOr[SecretArn]
  }

  object GitConfigForUpdate {
    def apply(
      SecretArn: js.UndefOr[SecretArn] = js.undefined): GitConfigForUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretArn" -> SecretArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GitConfigForUpdate]
    }
  }

  /**
   * <p>Information required for human workers to complete a labeling task.</p>
   */
  @js.native
  trait HumanTaskConfig extends js.Object {
    var TaskAvailabilityLifetimeInSeconds: js.UndefOr[TaskAvailabilityLifetimeInSeconds]
    var TaskKeywords: js.UndefOr[TaskKeywords]
    var PublicWorkforceTaskPrice: js.UndefOr[PublicWorkforceTaskPrice]
    var MaxConcurrentTaskCount: js.UndefOr[MaxConcurrentTaskCount]
    var TaskTimeLimitInSeconds: js.UndefOr[TaskTimeLimitInSeconds]
    var TaskDescription: js.UndefOr[TaskDescription]
    var TaskTitle: js.UndefOr[TaskTitle]
    var WorkteamArn: js.UndefOr[WorkteamArn]
    var NumberOfHumanWorkersPerDataObject: js.UndefOr[NumberOfHumanWorkersPerDataObject]
    var PreHumanTaskLambdaArn: js.UndefOr[LambdaFunctionArn]
    var AnnotationConsolidationConfig: js.UndefOr[AnnotationConsolidationConfig]
    var UiConfig: js.UndefOr[UiConfig]
  }

  object HumanTaskConfig {
    def apply(
      TaskAvailabilityLifetimeInSeconds: js.UndefOr[TaskAvailabilityLifetimeInSeconds] = js.undefined,
      TaskKeywords: js.UndefOr[TaskKeywords] = js.undefined,
      PublicWorkforceTaskPrice: js.UndefOr[PublicWorkforceTaskPrice] = js.undefined,
      MaxConcurrentTaskCount: js.UndefOr[MaxConcurrentTaskCount] = js.undefined,
      TaskTimeLimitInSeconds: js.UndefOr[TaskTimeLimitInSeconds] = js.undefined,
      TaskDescription: js.UndefOr[TaskDescription] = js.undefined,
      TaskTitle: js.UndefOr[TaskTitle] = js.undefined,
      WorkteamArn: js.UndefOr[WorkteamArn] = js.undefined,
      NumberOfHumanWorkersPerDataObject: js.UndefOr[NumberOfHumanWorkersPerDataObject] = js.undefined,
      PreHumanTaskLambdaArn: js.UndefOr[LambdaFunctionArn] = js.undefined,
      AnnotationConsolidationConfig: js.UndefOr[AnnotationConsolidationConfig] = js.undefined,
      UiConfig: js.UndefOr[UiConfig] = js.undefined): HumanTaskConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskAvailabilityLifetimeInSeconds" -> TaskAvailabilityLifetimeInSeconds.map { x => x.asInstanceOf[js.Any] },
        "TaskKeywords" -> TaskKeywords.map { x => x.asInstanceOf[js.Any] },
        "PublicWorkforceTaskPrice" -> PublicWorkforceTaskPrice.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrentTaskCount" -> MaxConcurrentTaskCount.map { x => x.asInstanceOf[js.Any] },
        "TaskTimeLimitInSeconds" -> TaskTimeLimitInSeconds.map { x => x.asInstanceOf[js.Any] },
        "TaskDescription" -> TaskDescription.map { x => x.asInstanceOf[js.Any] },
        "TaskTitle" -> TaskTitle.map { x => x.asInstanceOf[js.Any] },
        "WorkteamArn" -> WorkteamArn.map { x => x.asInstanceOf[js.Any] },
        "NumberOfHumanWorkersPerDataObject" -> NumberOfHumanWorkersPerDataObject.map { x => x.asInstanceOf[js.Any] },
        "PreHumanTaskLambdaArn" -> PreHumanTaskLambdaArn.map { x => x.asInstanceOf[js.Any] },
        "AnnotationConsolidationConfig" -> AnnotationConsolidationConfig.map { x => x.asInstanceOf[js.Any] },
        "UiConfig" -> UiConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HumanTaskConfig]
    }
  }

  /**
   * <p>Specifies which training algorithm to use for training jobs that a hyperparameter tuning job launches and the metrics to monitor.</p>
   */
  @js.native
  trait HyperParameterAlgorithmSpecification extends js.Object {
    var TrainingImage: js.UndefOr[AlgorithmImage]
    var TrainingInputMode: js.UndefOr[TrainingInputMode]
    var AlgorithmName: js.UndefOr[ArnOrName]
    var MetricDefinitions: js.UndefOr[MetricDefinitionList]
  }

  object HyperParameterAlgorithmSpecification {
    def apply(
      TrainingImage: js.UndefOr[AlgorithmImage] = js.undefined,
      TrainingInputMode: js.UndefOr[TrainingInputMode] = js.undefined,
      AlgorithmName: js.UndefOr[ArnOrName] = js.undefined,
      MetricDefinitions: js.UndefOr[MetricDefinitionList] = js.undefined): HyperParameterAlgorithmSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrainingImage" -> TrainingImage.map { x => x.asInstanceOf[js.Any] },
        "TrainingInputMode" -> TrainingInputMode.map { x => x.asInstanceOf[js.Any] },
        "AlgorithmName" -> AlgorithmName.map { x => x.asInstanceOf[js.Any] },
        "MetricDefinitions" -> MetricDefinitions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HyperParameterAlgorithmSpecification]
    }
  }

  /**
   * <p>Defines a hyperparameter to be used by an algorithm.</p>
   */
  @js.native
  trait HyperParameterSpecification extends js.Object {
    var Name: js.UndefOr[ParameterName]
    var IsRequired: js.UndefOr[Boolean]
    var Description: js.UndefOr[EntityDescription]
    var IsTunable: js.UndefOr[Boolean]
    var DefaultValue: js.UndefOr[ParameterValue]
    var Range: js.UndefOr[ParameterRange]
    var Type: js.UndefOr[ParameterType]
  }

  object HyperParameterSpecification {
    def apply(
      Name: js.UndefOr[ParameterName] = js.undefined,
      IsRequired: js.UndefOr[Boolean] = js.undefined,
      Description: js.UndefOr[EntityDescription] = js.undefined,
      IsTunable: js.UndefOr[Boolean] = js.undefined,
      DefaultValue: js.UndefOr[ParameterValue] = js.undefined,
      Range: js.UndefOr[ParameterRange] = js.undefined,
      Type: js.UndefOr[ParameterType] = js.undefined): HyperParameterSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "IsRequired" -> IsRequired.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "IsTunable" -> IsTunable.map { x => x.asInstanceOf[js.Any] },
        "DefaultValue" -> DefaultValue.map { x => x.asInstanceOf[js.Any] },
        "Range" -> Range.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HyperParameterSpecification]
    }
  }

  /**
   * <p>Defines the training jobs launched by a hyperparameter tuning job.</p>
   */
  @js.native
  trait HyperParameterTrainingJobDefinition extends js.Object {
    var StoppingCondition: js.UndefOr[StoppingCondition]
    var ResourceConfig: js.UndefOr[ResourceConfig]
    var EnableNetworkIsolation: js.UndefOr[Boolean]
    var AlgorithmSpecification: js.UndefOr[HyperParameterAlgorithmSpecification]
    var VpcConfig: js.UndefOr[VpcConfig]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var StaticHyperParameters: js.UndefOr[HyperParameters]
    var RoleArn: js.UndefOr[RoleArn]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
  }

  object HyperParameterTrainingJobDefinition {
    def apply(
      StoppingCondition: js.UndefOr[StoppingCondition] = js.undefined,
      ResourceConfig: js.UndefOr[ResourceConfig] = js.undefined,
      EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
      AlgorithmSpecification: js.UndefOr[HyperParameterAlgorithmSpecification] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined,
      InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
      StaticHyperParameters: js.UndefOr[HyperParameters] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined,
      OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined): HyperParameterTrainingJobDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StoppingCondition" -> StoppingCondition.map { x => x.asInstanceOf[js.Any] },
        "ResourceConfig" -> ResourceConfig.map { x => x.asInstanceOf[js.Any] },
        "EnableNetworkIsolation" -> EnableNetworkIsolation.map { x => x.asInstanceOf[js.Any] },
        "AlgorithmSpecification" -> AlgorithmSpecification.map { x => x.asInstanceOf[js.Any] },
        "VpcConfig" -> VpcConfig.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "StaticHyperParameters" -> StaticHyperParameters.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
        "OutputDataConfig" -> OutputDataConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HyperParameterTrainingJobDefinition]
    }
  }

  /**
   * <p>Specifies summary information about a training job.</p>
   */
  @js.native
  trait HyperParameterTrainingJobSummary extends js.Object {
    var TrainingStartTime: js.UndefOr[Timestamp]
    var TrainingJobStatus: js.UndefOr[TrainingJobStatus]
    var TuningJobName: js.UndefOr[HyperParameterTuningJobName]
    var ObjectiveStatus: js.UndefOr[ObjectiveStatus]
    var TrainingJobArn: js.UndefOr[TrainingJobArn]
    var FailureReason: js.UndefOr[FailureReason]
    var FinalHyperParameterTuningJobObjectiveMetric: js.UndefOr[FinalHyperParameterTuningJobObjectiveMetric]
    var TrainingJobName: js.UndefOr[TrainingJobName]
    var TrainingEndTime: js.UndefOr[Timestamp]
    var TunedHyperParameters: js.UndefOr[HyperParameters]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object HyperParameterTrainingJobSummary {
    def apply(
      TrainingStartTime: js.UndefOr[Timestamp] = js.undefined,
      TrainingJobStatus: js.UndefOr[TrainingJobStatus] = js.undefined,
      TuningJobName: js.UndefOr[HyperParameterTuningJobName] = js.undefined,
      ObjectiveStatus: js.UndefOr[ObjectiveStatus] = js.undefined,
      TrainingJobArn: js.UndefOr[TrainingJobArn] = js.undefined,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      FinalHyperParameterTuningJobObjectiveMetric: js.UndefOr[FinalHyperParameterTuningJobObjectiveMetric] = js.undefined,
      TrainingJobName: js.UndefOr[TrainingJobName] = js.undefined,
      TrainingEndTime: js.UndefOr[Timestamp] = js.undefined,
      TunedHyperParameters: js.UndefOr[HyperParameters] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): HyperParameterTrainingJobSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrainingStartTime" -> TrainingStartTime.map { x => x.asInstanceOf[js.Any] },
        "TrainingJobStatus" -> TrainingJobStatus.map { x => x.asInstanceOf[js.Any] },
        "TuningJobName" -> TuningJobName.map { x => x.asInstanceOf[js.Any] },
        "ObjectiveStatus" -> ObjectiveStatus.map { x => x.asInstanceOf[js.Any] },
        "TrainingJobArn" -> TrainingJobArn.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "FinalHyperParameterTuningJobObjectiveMetric" -> FinalHyperParameterTuningJobObjectiveMetric.map { x => x.asInstanceOf[js.Any] },
        "TrainingJobName" -> TrainingJobName.map { x => x.asInstanceOf[js.Any] },
        "TrainingEndTime" -> TrainingEndTime.map { x => x.asInstanceOf[js.Any] },
        "TunedHyperParameters" -> TunedHyperParameters.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HyperParameterTrainingJobSummary]
    }
  }

  /**
   * <p>Configures a hyperparameter tuning job.</p>
   */
  @js.native
  trait HyperParameterTuningJobConfig extends js.Object {
    var Strategy: js.UndefOr[HyperParameterTuningJobStrategyType]
    var HyperParameterTuningJobObjective: js.UndefOr[HyperParameterTuningJobObjective]
    var ResourceLimits: js.UndefOr[ResourceLimits]
    var ParameterRanges: js.UndefOr[ParameterRanges]
  }

  object HyperParameterTuningJobConfig {
    def apply(
      Strategy: js.UndefOr[HyperParameterTuningJobStrategyType] = js.undefined,
      HyperParameterTuningJobObjective: js.UndefOr[HyperParameterTuningJobObjective] = js.undefined,
      ResourceLimits: js.UndefOr[ResourceLimits] = js.undefined,
      ParameterRanges: js.UndefOr[ParameterRanges] = js.undefined): HyperParameterTuningJobConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Strategy" -> Strategy.map { x => x.asInstanceOf[js.Any] },
        "HyperParameterTuningJobObjective" -> HyperParameterTuningJobObjective.map { x => x.asInstanceOf[js.Any] },
        "ResourceLimits" -> ResourceLimits.map { x => x.asInstanceOf[js.Any] },
        "ParameterRanges" -> ParameterRanges.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HyperParameterTuningJobConfig]
    }
  }

  /**
   * <p>Defines the objective metric for a hyperparameter tuning job. Hyperparameter tuning uses the value of this metric to evaluate the training jobs it launches, and returns the training job that results in either the highest or lowest value for this metric, depending on the value you specify for the <code>Type</code> parameter.</p>
   */
  @js.native
  trait HyperParameterTuningJobObjective extends js.Object {
    var Type: js.UndefOr[HyperParameterTuningJobObjectiveType]
    var MetricName: js.UndefOr[MetricName]
  }

  object HyperParameterTuningJobObjective {
    def apply(
      Type: js.UndefOr[HyperParameterTuningJobObjectiveType] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined): HyperParameterTuningJobObjective = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HyperParameterTuningJobObjective]
    }
  }

  object HyperParameterTuningJobObjectiveTypeEnum {
    val Maximize = "Maximize"
    val Minimize = "Minimize"

    val values = IndexedSeq(Maximize, Minimize)
  }

  object HyperParameterTuningJobSortByOptionsEnum {
    val Name = "Name"
    val Status = "Status"
    val CreationTime = "CreationTime"

    val values = IndexedSeq(Name, Status, CreationTime)
  }

  object HyperParameterTuningJobStatusEnum {
    val Completed = "Completed"
    val InProgress = "InProgress"
    val Failed = "Failed"
    val Stopped = "Stopped"
    val Stopping = "Stopping"

    val values = IndexedSeq(Completed, InProgress, Failed, Stopped, Stopping)
  }

  /**
   * <p>The strategy hyperparameter tuning uses to find the best combination of hyperparameters for your model. Currently, the only supported value is <code>Bayesian</code>.</p>
   */
  object HyperParameterTuningJobStrategyTypeEnum {
    val Bayesian = "Bayesian"

    val values = IndexedSeq(Bayesian)
  }

  /**
   * <p>Provides summary information about a hyperparameter tuning job.</p>
   */
  @js.native
  trait HyperParameterTuningJobSummary extends js.Object {
    var HyperParameterTuningEndTime: js.UndefOr[Timestamp]
    var ObjectiveStatusCounters: js.UndefOr[ObjectiveStatusCounters]
    var Strategy: js.UndefOr[HyperParameterTuningJobStrategyType]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var TrainingJobStatusCounters: js.UndefOr[TrainingJobStatusCounters]
    var HyperParameterTuningJobStatus: js.UndefOr[HyperParameterTuningJobStatus]
    var HyperParameterTuningJobName: js.UndefOr[HyperParameterTuningJobName]
    var ResourceLimits: js.UndefOr[ResourceLimits]
    var HyperParameterTuningJobArn: js.UndefOr[HyperParameterTuningJobArn]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object HyperParameterTuningJobSummary {
    def apply(
      HyperParameterTuningEndTime: js.UndefOr[Timestamp] = js.undefined,
      ObjectiveStatusCounters: js.UndefOr[ObjectiveStatusCounters] = js.undefined,
      Strategy: js.UndefOr[HyperParameterTuningJobStrategyType] = js.undefined,
      LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
      TrainingJobStatusCounters: js.UndefOr[TrainingJobStatusCounters] = js.undefined,
      HyperParameterTuningJobStatus: js.UndefOr[HyperParameterTuningJobStatus] = js.undefined,
      HyperParameterTuningJobName: js.UndefOr[HyperParameterTuningJobName] = js.undefined,
      ResourceLimits: js.UndefOr[ResourceLimits] = js.undefined,
      HyperParameterTuningJobArn: js.UndefOr[HyperParameterTuningJobArn] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): HyperParameterTuningJobSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HyperParameterTuningEndTime" -> HyperParameterTuningEndTime.map { x => x.asInstanceOf[js.Any] },
        "ObjectiveStatusCounters" -> ObjectiveStatusCounters.map { x => x.asInstanceOf[js.Any] },
        "Strategy" -> Strategy.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "TrainingJobStatusCounters" -> TrainingJobStatusCounters.map { x => x.asInstanceOf[js.Any] },
        "HyperParameterTuningJobStatus" -> HyperParameterTuningJobStatus.map { x => x.asInstanceOf[js.Any] },
        "HyperParameterTuningJobName" -> HyperParameterTuningJobName.map { x => x.asInstanceOf[js.Any] },
        "ResourceLimits" -> ResourceLimits.map { x => x.asInstanceOf[js.Any] },
        "HyperParameterTuningJobArn" -> HyperParameterTuningJobArn.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HyperParameterTuningJobSummary]
    }
  }

  /**
   * <p>Specifies the configuration for a hyperparameter tuning job that uses one or more previous hyperparameter tuning jobs as a starting point. The results of previous tuning jobs are used to inform which combinations of hyperparameters to search over in the new tuning job.</p> <p>All training jobs launched by the new hyperparameter tuning job are evaluated by using the objective metric, and the training job that performs the best is compared to the best training jobs from the parent tuning jobs. From these, the training job that performs the best as measured by the objective metric is returned as the overall best training job.</p> <note> <p>All training jobs launched by parent hyperparameter tuning jobs and the new hyperparameter tuning jobs count against the limit of training jobs for the tuning job.</p> </note>
   */
  @js.native
  trait HyperParameterTuningJobWarmStartConfig extends js.Object {
    var ParentHyperParameterTuningJobs: js.UndefOr[ParentHyperParameterTuningJobs]
    var WarmStartType: js.UndefOr[HyperParameterTuningJobWarmStartType]
  }

  object HyperParameterTuningJobWarmStartConfig {
    def apply(
      ParentHyperParameterTuningJobs: js.UndefOr[ParentHyperParameterTuningJobs] = js.undefined,
      WarmStartType: js.UndefOr[HyperParameterTuningJobWarmStartType] = js.undefined): HyperParameterTuningJobWarmStartConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParentHyperParameterTuningJobs" -> ParentHyperParameterTuningJobs.map { x => x.asInstanceOf[js.Any] },
        "WarmStartType" -> WarmStartType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HyperParameterTuningJobWarmStartConfig]
    }
  }

  object HyperParameterTuningJobWarmStartTypeEnum {
    val IdenticalDataAndAlgorithm = "IdenticalDataAndAlgorithm"
    val TransferLearning = "TransferLearning"

    val values = IndexedSeq(IdenticalDataAndAlgorithm, TransferLearning)
  }

  /**
   * <p>Defines how to perform inference generation after a training job is run.</p>
   */
  @js.native
  trait InferenceSpecification extends js.Object {
    var Containers: js.UndefOr[ModelPackageContainerDefinitionList]
    var SupportedContentTypes: js.UndefOr[ContentTypes]
    var SupportedTransformInstanceTypes: js.UndefOr[TransformInstanceTypes]
    var SupportedResponseMIMETypes: js.UndefOr[ResponseMIMETypes]
    var SupportedRealtimeInferenceInstanceTypes: js.UndefOr[RealtimeInferenceInstanceTypes]
  }

  object InferenceSpecification {
    def apply(
      Containers: js.UndefOr[ModelPackageContainerDefinitionList] = js.undefined,
      SupportedContentTypes: js.UndefOr[ContentTypes] = js.undefined,
      SupportedTransformInstanceTypes: js.UndefOr[TransformInstanceTypes] = js.undefined,
      SupportedResponseMIMETypes: js.UndefOr[ResponseMIMETypes] = js.undefined,
      SupportedRealtimeInferenceInstanceTypes: js.UndefOr[RealtimeInferenceInstanceTypes] = js.undefined): InferenceSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Containers" -> Containers.map { x => x.asInstanceOf[js.Any] },
        "SupportedContentTypes" -> SupportedContentTypes.map { x => x.asInstanceOf[js.Any] },
        "SupportedTransformInstanceTypes" -> SupportedTransformInstanceTypes.map { x => x.asInstanceOf[js.Any] },
        "SupportedResponseMIMETypes" -> SupportedResponseMIMETypes.map { x => x.asInstanceOf[js.Any] },
        "SupportedRealtimeInferenceInstanceTypes" -> SupportedRealtimeInferenceInstanceTypes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InferenceSpecification]
    }
  }

  /**
   * <p>Contains information about the location of input model artifacts, the name and shape of the expected data inputs, and the framework in which the model was trained.</p>
   */
  @js.native
  trait InputConfig extends js.Object {
    var S3Uri: js.UndefOr[S3Uri]
    var DataInputConfig: js.UndefOr[DataInputConfig]
    var Framework: js.UndefOr[Framework]
  }

  object InputConfig {
    def apply(
      S3Uri: js.UndefOr[S3Uri] = js.undefined,
      DataInputConfig: js.UndefOr[DataInputConfig] = js.undefined,
      Framework: js.UndefOr[Framework] = js.undefined): InputConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3Uri" -> S3Uri.map { x => x.asInstanceOf[js.Any] },
        "DataInputConfig" -> DataInputConfig.map { x => x.asInstanceOf[js.Any] },
        "Framework" -> Framework.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputConfig]
    }
  }

  object InstanceTypeEnum {
    val `ml.t2.medium` = "ml.t2.medium"
    val `ml.t2.large` = "ml.t2.large"
    val `ml.t2.xlarge` = "ml.t2.xlarge"
    val `ml.t2.2xlarge` = "ml.t2.2xlarge"
    val `ml.t3.medium` = "ml.t3.medium"
    val `ml.t3.large` = "ml.t3.large"
    val `ml.t3.xlarge` = "ml.t3.xlarge"
    val `ml.t3.2xlarge` = "ml.t3.2xlarge"
    val `ml.m4.xlarge` = "ml.m4.xlarge"
    val `ml.m4.2xlarge` = "ml.m4.2xlarge"
    val `ml.m4.4xlarge` = "ml.m4.4xlarge"
    val `ml.m4.10xlarge` = "ml.m4.10xlarge"
    val `ml.m4.16xlarge` = "ml.m4.16xlarge"
    val `ml.m5.xlarge` = "ml.m5.xlarge"
    val `ml.m5.2xlarge` = "ml.m5.2xlarge"
    val `ml.m5.4xlarge` = "ml.m5.4xlarge"
    val `ml.m5.12xlarge` = "ml.m5.12xlarge"
    val `ml.m5.24xlarge` = "ml.m5.24xlarge"
    val `ml.c4.xlarge` = "ml.c4.xlarge"
    val `ml.c4.2xlarge` = "ml.c4.2xlarge"
    val `ml.c4.4xlarge` = "ml.c4.4xlarge"
    val `ml.c4.8xlarge` = "ml.c4.8xlarge"
    val `ml.c5.xlarge` = "ml.c5.xlarge"
    val `ml.c5.2xlarge` = "ml.c5.2xlarge"
    val `ml.c5.4xlarge` = "ml.c5.4xlarge"
    val `ml.c5.9xlarge` = "ml.c5.9xlarge"
    val `ml.c5.18xlarge` = "ml.c5.18xlarge"
    val `ml.c5d.xlarge` = "ml.c5d.xlarge"
    val `ml.c5d.2xlarge` = "ml.c5d.2xlarge"
    val `ml.c5d.4xlarge` = "ml.c5d.4xlarge"
    val `ml.c5d.9xlarge` = "ml.c5d.9xlarge"
    val `ml.c5d.18xlarge` = "ml.c5d.18xlarge"
    val `ml.p2.xlarge` = "ml.p2.xlarge"
    val `ml.p2.8xlarge` = "ml.p2.8xlarge"
    val `ml.p2.16xlarge` = "ml.p2.16xlarge"
    val `ml.p3.2xlarge` = "ml.p3.2xlarge"
    val `ml.p3.8xlarge` = "ml.p3.8xlarge"
    val `ml.p3.16xlarge` = "ml.p3.16xlarge"

    val values = IndexedSeq(`ml.t2.medium`, `ml.t2.large`, `ml.t2.xlarge`, `ml.t2.2xlarge`, `ml.t3.medium`, `ml.t3.large`, `ml.t3.xlarge`, `ml.t3.2xlarge`, `ml.m4.xlarge`, `ml.m4.2xlarge`, `ml.m4.4xlarge`, `ml.m4.10xlarge`, `ml.m4.16xlarge`, `ml.m5.xlarge`, `ml.m5.2xlarge`, `ml.m5.4xlarge`, `ml.m5.12xlarge`, `ml.m5.24xlarge`, `ml.c4.xlarge`, `ml.c4.2xlarge`, `ml.c4.4xlarge`, `ml.c4.8xlarge`, `ml.c5.xlarge`, `ml.c5.2xlarge`, `ml.c5.4xlarge`, `ml.c5.9xlarge`, `ml.c5.18xlarge`, `ml.c5d.xlarge`, `ml.c5d.2xlarge`, `ml.c5d.4xlarge`, `ml.c5d.9xlarge`, `ml.c5d.18xlarge`, `ml.p2.xlarge`, `ml.p2.8xlarge`, `ml.p2.16xlarge`, `ml.p3.2xlarge`, `ml.p3.8xlarge`, `ml.p3.16xlarge`)
  }

  /**
   * <p>For a hyperparameter of the integer type, specifies the range that a hyperparameter tuning job searches.</p>
   */
  @js.native
  trait IntegerParameterRange extends js.Object {
    var Name: js.UndefOr[ParameterKey]
    var MinValue: js.UndefOr[ParameterValue]
    var MaxValue: js.UndefOr[ParameterValue]
  }

  object IntegerParameterRange {
    def apply(
      Name: js.UndefOr[ParameterKey] = js.undefined,
      MinValue: js.UndefOr[ParameterValue] = js.undefined,
      MaxValue: js.UndefOr[ParameterValue] = js.undefined): IntegerParameterRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "MinValue" -> MinValue.map { x => x.asInstanceOf[js.Any] },
        "MaxValue" -> MaxValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IntegerParameterRange]
    }
  }

  /**
   * <p>Defines the possible values for an integer hyperparameter.</p>
   */
  @js.native
  trait IntegerParameterRangeSpecification extends js.Object {
    var MinValue: js.UndefOr[ParameterValue]
    var MaxValue: js.UndefOr[ParameterValue]
  }

  object IntegerParameterRangeSpecification {
    def apply(
      MinValue: js.UndefOr[ParameterValue] = js.undefined,
      MaxValue: js.UndefOr[ParameterValue] = js.undefined): IntegerParameterRangeSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MinValue" -> MinValue.map { x => x.asInstanceOf[js.Any] },
        "MaxValue" -> MaxValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IntegerParameterRangeSpecification]
    }
  }

  /**
   * <p>Provides a breakdown of the number of objects labeled.</p>
   */
  @js.native
  trait LabelCounters extends js.Object {
    var Unlabeled: js.UndefOr[LabelCounter]
    var MachineLabeled: js.UndefOr[LabelCounter]
    var HumanLabeled: js.UndefOr[LabelCounter]
    var FailedNonRetryableError: js.UndefOr[LabelCounter]
    var TotalLabeled: js.UndefOr[LabelCounter]
  }

  object LabelCounters {
    def apply(
      Unlabeled: js.UndefOr[LabelCounter] = js.undefined,
      MachineLabeled: js.UndefOr[LabelCounter] = js.undefined,
      HumanLabeled: js.UndefOr[LabelCounter] = js.undefined,
      FailedNonRetryableError: js.UndefOr[LabelCounter] = js.undefined,
      TotalLabeled: js.UndefOr[LabelCounter] = js.undefined): LabelCounters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Unlabeled" -> Unlabeled.map { x => x.asInstanceOf[js.Any] },
        "MachineLabeled" -> MachineLabeled.map { x => x.asInstanceOf[js.Any] },
        "HumanLabeled" -> HumanLabeled.map { x => x.asInstanceOf[js.Any] },
        "FailedNonRetryableError" -> FailedNonRetryableError.map { x => x.asInstanceOf[js.Any] },
        "TotalLabeled" -> TotalLabeled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelCounters]
    }
  }

  /**
   * <p>Provides counts for human-labeled tasks in the labeling job.</p>
   */
  @js.native
  trait LabelCountersForWorkteam extends js.Object {
    var HumanLabeled: js.UndefOr[LabelCounter]
    var PendingHuman: js.UndefOr[LabelCounter]
    var Total: js.UndefOr[LabelCounter]
  }

  object LabelCountersForWorkteam {
    def apply(
      HumanLabeled: js.UndefOr[LabelCounter] = js.undefined,
      PendingHuman: js.UndefOr[LabelCounter] = js.undefined,
      Total: js.UndefOr[LabelCounter] = js.undefined): LabelCountersForWorkteam = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HumanLabeled" -> HumanLabeled.map { x => x.asInstanceOf[js.Any] },
        "PendingHuman" -> PendingHuman.map { x => x.asInstanceOf[js.Any] },
        "Total" -> Total.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelCountersForWorkteam]
    }
  }

  /**
   * <p>Provides configuration information for auto-labeling of your data objects. A <code>LabelingJobAlgorithmsConfig</code> object must be supplied in order to use auto-labeling.</p>
   */
  @js.native
  trait LabelingJobAlgorithmsConfig extends js.Object {
    var LabelingJobAlgorithmSpecificationArn: js.UndefOr[LabelingJobAlgorithmSpecificationArn]
    var InitialActiveLearningModelArn: js.UndefOr[ModelArn]
    var LabelingJobResourceConfig: js.UndefOr[LabelingJobResourceConfig]
  }

  object LabelingJobAlgorithmsConfig {
    def apply(
      LabelingJobAlgorithmSpecificationArn: js.UndefOr[LabelingJobAlgorithmSpecificationArn] = js.undefined,
      InitialActiveLearningModelArn: js.UndefOr[ModelArn] = js.undefined,
      LabelingJobResourceConfig: js.UndefOr[LabelingJobResourceConfig] = js.undefined): LabelingJobAlgorithmsConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LabelingJobAlgorithmSpecificationArn" -> LabelingJobAlgorithmSpecificationArn.map { x => x.asInstanceOf[js.Any] },
        "InitialActiveLearningModelArn" -> InitialActiveLearningModelArn.map { x => x.asInstanceOf[js.Any] },
        "LabelingJobResourceConfig" -> LabelingJobResourceConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelingJobAlgorithmsConfig]
    }
  }

  /**
   * <p>Attributes of the data specified by the customer. Use these to describe the data to be labeled.</p>
   */
  @js.native
  trait LabelingJobDataAttributes extends js.Object {
    var ContentClassifiers: js.UndefOr[ContentClassifiers]
  }

  object LabelingJobDataAttributes {
    def apply(
      ContentClassifiers: js.UndefOr[ContentClassifiers] = js.undefined): LabelingJobDataAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContentClassifiers" -> ContentClassifiers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelingJobDataAttributes]
    }
  }

  /**
   * <p>Provides information about the location of input data.</p>
   */
  @js.native
  trait LabelingJobDataSource extends js.Object {
    var S3DataSource: js.UndefOr[LabelingJobS3DataSource]
  }

  object LabelingJobDataSource {
    def apply(
      S3DataSource: js.UndefOr[LabelingJobS3DataSource] = js.undefined): LabelingJobDataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3DataSource" -> S3DataSource.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelingJobDataSource]
    }
  }

  /**
   * <p>Provides summary information for a work team.</p>
   */
  @js.native
  trait LabelingJobForWorkteamSummary extends js.Object {
    var WorkRequesterAccountId: js.UndefOr[AccountId]
    var JobReferenceCode: js.UndefOr[JobReferenceCode]
    var LabelingJobName: js.UndefOr[LabelingJobName]
    var LabelCounters: js.UndefOr[LabelCountersForWorkteam]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object LabelingJobForWorkteamSummary {
    def apply(
      WorkRequesterAccountId: js.UndefOr[AccountId] = js.undefined,
      JobReferenceCode: js.UndefOr[JobReferenceCode] = js.undefined,
      LabelingJobName: js.UndefOr[LabelingJobName] = js.undefined,
      LabelCounters: js.UndefOr[LabelCountersForWorkteam] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): LabelingJobForWorkteamSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkRequesterAccountId" -> WorkRequesterAccountId.map { x => x.asInstanceOf[js.Any] },
        "JobReferenceCode" -> JobReferenceCode.map { x => x.asInstanceOf[js.Any] },
        "LabelingJobName" -> LabelingJobName.map { x => x.asInstanceOf[js.Any] },
        "LabelCounters" -> LabelCounters.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelingJobForWorkteamSummary]
    }
  }

  /**
   * <p>Input configuration information for a labeling job.</p>
   */
  @js.native
  trait LabelingJobInputConfig extends js.Object {
    var DataSource: js.UndefOr[LabelingJobDataSource]
    var DataAttributes: js.UndefOr[LabelingJobDataAttributes]
  }

  object LabelingJobInputConfig {
    def apply(
      DataSource: js.UndefOr[LabelingJobDataSource] = js.undefined,
      DataAttributes: js.UndefOr[LabelingJobDataAttributes] = js.undefined): LabelingJobInputConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataSource" -> DataSource.map { x => x.asInstanceOf[js.Any] },
        "DataAttributes" -> DataAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelingJobInputConfig]
    }
  }

  /**
   * <p>Specifies the location of the output produced by the labeling job. </p>
   */
  @js.native
  trait LabelingJobOutput extends js.Object {
    var OutputDatasetS3Uri: js.UndefOr[S3Uri]
    var FinalActiveLearningModelArn: js.UndefOr[ModelArn]
  }

  object LabelingJobOutput {
    def apply(
      OutputDatasetS3Uri: js.UndefOr[S3Uri] = js.undefined,
      FinalActiveLearningModelArn: js.UndefOr[ModelArn] = js.undefined): LabelingJobOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OutputDatasetS3Uri" -> OutputDatasetS3Uri.map { x => x.asInstanceOf[js.Any] },
        "FinalActiveLearningModelArn" -> FinalActiveLearningModelArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelingJobOutput]
    }
  }

  /**
   * <p>Output configuration information for a labeling job.</p>
   */
  @js.native
  trait LabelingJobOutputConfig extends js.Object {
    var S3OutputPath: js.UndefOr[S3Uri]
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object LabelingJobOutputConfig {
    def apply(
      S3OutputPath: js.UndefOr[S3Uri] = js.undefined,
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined): LabelingJobOutputConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3OutputPath" -> S3OutputPath.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelingJobOutputConfig]
    }
  }

  /**
   * <p>Provides configuration information for labeling jobs.</p>
   */
  @js.native
  trait LabelingJobResourceConfig extends js.Object {
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
  }

  object LabelingJobResourceConfig {
    def apply(
      VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined): LabelingJobResourceConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeKmsKeyId" -> VolumeKmsKeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelingJobResourceConfig]
    }
  }

  /**
   * <p>The Amazon S3 location of the input data objects.</p>
   */
  @js.native
  trait LabelingJobS3DataSource extends js.Object {
    var ManifestS3Uri: js.UndefOr[S3Uri]
  }

  object LabelingJobS3DataSource {
    def apply(
      ManifestS3Uri: js.UndefOr[S3Uri] = js.undefined): LabelingJobS3DataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ManifestS3Uri" -> ManifestS3Uri.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelingJobS3DataSource]
    }
  }

  object LabelingJobStatusEnum {
    val InProgress = "InProgress"
    val Completed = "Completed"
    val Failed = "Failed"
    val Stopping = "Stopping"
    val Stopped = "Stopped"

    val values = IndexedSeq(InProgress, Completed, Failed, Stopping, Stopped)
  }

  /**
   * <p>A set of conditions for stopping a labeling job. If any of the conditions are met, the job is automatically stopped. You can use these conditions to control the cost of data labeling.</p>
   */
  @js.native
  trait LabelingJobStoppingConditions extends js.Object {
    var MaxHumanLabeledObjectCount: js.UndefOr[MaxHumanLabeledObjectCount]
    var MaxPercentageOfInputDatasetLabeled: js.UndefOr[MaxPercentageOfInputDatasetLabeled]
  }

  object LabelingJobStoppingConditions {
    def apply(
      MaxHumanLabeledObjectCount: js.UndefOr[MaxHumanLabeledObjectCount] = js.undefined,
      MaxPercentageOfInputDatasetLabeled: js.UndefOr[MaxPercentageOfInputDatasetLabeled] = js.undefined): LabelingJobStoppingConditions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxHumanLabeledObjectCount" -> MaxHumanLabeledObjectCount.map { x => x.asInstanceOf[js.Any] },
        "MaxPercentageOfInputDatasetLabeled" -> MaxPercentageOfInputDatasetLabeled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelingJobStoppingConditions]
    }
  }

  /**
   * <p>Provides summary information about a labeling job.</p>
   */
  @js.native
  trait LabelingJobSummary extends js.Object {
    var LabelingJobOutput: js.UndefOr[LabelingJobOutput]
    var InputConfig: js.UndefOr[LabelingJobInputConfig]
    var LabelingJobName: js.UndefOr[LabelingJobName]
    var LabelCounters: js.UndefOr[LabelCounters]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var FailureReason: js.UndefOr[FailureReason]
    var LabelingJobStatus: js.UndefOr[LabelingJobStatus]
    var WorkteamArn: js.UndefOr[WorkteamArn]
    var AnnotationConsolidationLambdaArn: js.UndefOr[LambdaFunctionArn]
    var LabelingJobArn: js.UndefOr[LabelingJobArn]
    var PreHumanTaskLambdaArn: js.UndefOr[LambdaFunctionArn]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object LabelingJobSummary {
    def apply(
      LabelingJobOutput: js.UndefOr[LabelingJobOutput] = js.undefined,
      InputConfig: js.UndefOr[LabelingJobInputConfig] = js.undefined,
      LabelingJobName: js.UndefOr[LabelingJobName] = js.undefined,
      LabelCounters: js.UndefOr[LabelCounters] = js.undefined,
      LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      LabelingJobStatus: js.UndefOr[LabelingJobStatus] = js.undefined,
      WorkteamArn: js.UndefOr[WorkteamArn] = js.undefined,
      AnnotationConsolidationLambdaArn: js.UndefOr[LambdaFunctionArn] = js.undefined,
      LabelingJobArn: js.UndefOr[LabelingJobArn] = js.undefined,
      PreHumanTaskLambdaArn: js.UndefOr[LambdaFunctionArn] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): LabelingJobSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LabelingJobOutput" -> LabelingJobOutput.map { x => x.asInstanceOf[js.Any] },
        "InputConfig" -> InputConfig.map { x => x.asInstanceOf[js.Any] },
        "LabelingJobName" -> LabelingJobName.map { x => x.asInstanceOf[js.Any] },
        "LabelCounters" -> LabelCounters.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "LabelingJobStatus" -> LabelingJobStatus.map { x => x.asInstanceOf[js.Any] },
        "WorkteamArn" -> WorkteamArn.map { x => x.asInstanceOf[js.Any] },
        "AnnotationConsolidationLambdaArn" -> AnnotationConsolidationLambdaArn.map { x => x.asInstanceOf[js.Any] },
        "LabelingJobArn" -> LabelingJobArn.map { x => x.asInstanceOf[js.Any] },
        "PreHumanTaskLambdaArn" -> PreHumanTaskLambdaArn.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelingJobSummary]
    }
  }

  @js.native
  trait ListAlgorithmsInput extends js.Object {
    var SortBy: js.UndefOr[AlgorithmSortBy]
    var MaxResults: js.UndefOr[MaxResults]
    var SortOrder: js.UndefOr[SortOrder]
    var NameContains: js.UndefOr[NameContains]
    var CreationTimeAfter: js.UndefOr[CreationTime]
    var CreationTimeBefore: js.UndefOr[CreationTime]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAlgorithmsInput {
    def apply(
      SortBy: js.UndefOr[AlgorithmSortBy] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined,
      NameContains: js.UndefOr[NameContains] = js.undefined,
      CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined,
      CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListAlgorithmsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAlgorithmsInput]
    }
  }

  @js.native
  trait ListAlgorithmsOutput extends js.Object {
    var AlgorithmSummaryList: js.UndefOr[AlgorithmSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAlgorithmsOutput {
    def apply(
      AlgorithmSummaryList: js.UndefOr[AlgorithmSummaryList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListAlgorithmsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlgorithmSummaryList" -> AlgorithmSummaryList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAlgorithmsOutput]
    }
  }

  @js.native
  trait ListCodeRepositoriesInput extends js.Object {
    var SortBy: js.UndefOr[CodeRepositorySortBy]
    var MaxResults: js.UndefOr[MaxResults]
    var SortOrder: js.UndefOr[CodeRepositorySortOrder]
    var NameContains: js.UndefOr[CodeRepositoryNameContains]
    var LastModifiedTimeBefore: js.UndefOr[Timestamp]
    var CreationTimeAfter: js.UndefOr[CreationTime]
    var CreationTimeBefore: js.UndefOr[CreationTime]
    var NextToken: js.UndefOr[NextToken]
    var LastModifiedTimeAfter: js.UndefOr[Timestamp]
  }

  object ListCodeRepositoriesInput {
    def apply(
      SortBy: js.UndefOr[CodeRepositorySortBy] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      SortOrder: js.UndefOr[CodeRepositorySortOrder] = js.undefined,
      NameContains: js.UndefOr[CodeRepositoryNameContains] = js.undefined,
      LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined,
      CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined): ListCodeRepositoriesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeBefore" -> LastModifiedTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeAfter" -> LastModifiedTimeAfter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCodeRepositoriesInput]
    }
  }

  @js.native
  trait ListCodeRepositoriesOutput extends js.Object {
    var CodeRepositorySummaryList: js.UndefOr[CodeRepositorySummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCodeRepositoriesOutput {
    def apply(
      CodeRepositorySummaryList: js.UndefOr[CodeRepositorySummaryList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListCodeRepositoriesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeRepositorySummaryList" -> CodeRepositorySummaryList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCodeRepositoriesOutput]
    }
  }

  @js.native
  trait ListCompilationJobsRequest extends js.Object {
    var StatusEquals: js.UndefOr[CompilationJobStatus]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[NameContains]
    var LastModifiedTimeBefore: js.UndefOr[LastModifiedTime]
    var CreationTimeAfter: js.UndefOr[CreationTime]
    var CreationTimeBefore: js.UndefOr[CreationTime]
    var NextToken: js.UndefOr[NextToken]
    var LastModifiedTimeAfter: js.UndefOr[LastModifiedTime]
  }

  object ListCompilationJobsRequest {
    def apply(
      StatusEquals: js.UndefOr[CompilationJobStatus] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NameContains: js.UndefOr[NameContains] = js.undefined,
      LastModifiedTimeBefore: js.UndefOr[LastModifiedTime] = js.undefined,
      CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined,
      CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      LastModifiedTimeAfter: js.UndefOr[LastModifiedTime] = js.undefined): ListCompilationJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusEquals" -> StatusEquals.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeBefore" -> LastModifiedTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeAfter" -> LastModifiedTimeAfter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCompilationJobsRequest]
    }
  }

  @js.native
  trait ListCompilationJobsResponse extends js.Object {
    var CompilationJobSummaries: js.UndefOr[CompilationJobSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCompilationJobsResponse {
    def apply(
      CompilationJobSummaries: js.UndefOr[CompilationJobSummaries] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListCompilationJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompilationJobSummaries" -> CompilationJobSummaries.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCompilationJobsResponse]
    }
  }

  @js.native
  trait ListEndpointConfigsInput extends js.Object {
    var SortBy: js.UndefOr[EndpointConfigSortKey]
    var MaxResults: js.UndefOr[MaxResults]
    var SortOrder: js.UndefOr[OrderKey]
    var NameContains: js.UndefOr[EndpointConfigNameContains]
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListEndpointConfigsInput {
    def apply(
      SortBy: js.UndefOr[EndpointConfigSortKey] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      SortOrder: js.UndefOr[OrderKey] = js.undefined,
      NameContains: js.UndefOr[EndpointConfigNameContains] = js.undefined,
      CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
      CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListEndpointConfigsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEndpointConfigsInput]
    }
  }

  @js.native
  trait ListEndpointConfigsOutput extends js.Object {
    var EndpointConfigs: js.UndefOr[EndpointConfigSummaryList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListEndpointConfigsOutput {
    def apply(
      EndpointConfigs: js.UndefOr[EndpointConfigSummaryList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListEndpointConfigsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointConfigs" -> EndpointConfigs.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEndpointConfigsOutput]
    }
  }

  @js.native
  trait ListEndpointsInput extends js.Object {
    var StatusEquals: js.UndefOr[EndpointStatus]
    var SortBy: js.UndefOr[EndpointSortKey]
    var MaxResults: js.UndefOr[MaxResults]
    var SortOrder: js.UndefOr[OrderKey]
    var NameContains: js.UndefOr[EndpointNameContains]
    var LastModifiedTimeBefore: js.UndefOr[Timestamp]
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var NextToken: js.UndefOr[PaginationToken]
    var LastModifiedTimeAfter: js.UndefOr[Timestamp]
  }

  object ListEndpointsInput {
    def apply(
      StatusEquals: js.UndefOr[EndpointStatus] = js.undefined,
      SortBy: js.UndefOr[EndpointSortKey] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      SortOrder: js.UndefOr[OrderKey] = js.undefined,
      NameContains: js.UndefOr[EndpointNameContains] = js.undefined,
      LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
      CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined): ListEndpointsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusEquals" -> StatusEquals.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeBefore" -> LastModifiedTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeAfter" -> LastModifiedTimeAfter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEndpointsInput]
    }
  }

  @js.native
  trait ListEndpointsOutput extends js.Object {
    var Endpoints: js.UndefOr[EndpointSummaryList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListEndpointsOutput {
    def apply(
      Endpoints: js.UndefOr[EndpointSummaryList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListEndpointsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Endpoints" -> Endpoints.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEndpointsOutput]
    }
  }

  @js.native
  trait ListHyperParameterTuningJobsRequest extends js.Object {
    var StatusEquals: js.UndefOr[HyperParameterTuningJobStatus]
    var SortBy: js.UndefOr[HyperParameterTuningJobSortByOptions]
    var MaxResults: js.UndefOr[MaxResults]
    var SortOrder: js.UndefOr[SortOrder]
    var NameContains: js.UndefOr[NameContains]
    var LastModifiedTimeBefore: js.UndefOr[Timestamp]
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var NextToken: js.UndefOr[NextToken]
    var LastModifiedTimeAfter: js.UndefOr[Timestamp]
  }

  object ListHyperParameterTuningJobsRequest {
    def apply(
      StatusEquals: js.UndefOr[HyperParameterTuningJobStatus] = js.undefined,
      SortBy: js.UndefOr[HyperParameterTuningJobSortByOptions] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined,
      NameContains: js.UndefOr[NameContains] = js.undefined,
      LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
      CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined): ListHyperParameterTuningJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusEquals" -> StatusEquals.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeBefore" -> LastModifiedTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeAfter" -> LastModifiedTimeAfter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHyperParameterTuningJobsRequest]
    }
  }

  @js.native
  trait ListHyperParameterTuningJobsResponse extends js.Object {
    var HyperParameterTuningJobSummaries: js.UndefOr[HyperParameterTuningJobSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHyperParameterTuningJobsResponse {
    def apply(
      HyperParameterTuningJobSummaries: js.UndefOr[HyperParameterTuningJobSummaries] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListHyperParameterTuningJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HyperParameterTuningJobSummaries" -> HyperParameterTuningJobSummaries.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHyperParameterTuningJobsResponse]
    }
  }

  @js.native
  trait ListLabelingJobsForWorkteamRequest extends js.Object {
    var SortBy: js.UndefOr[ListLabelingJobsForWorkteamSortByOptions]
    var MaxResults: js.UndefOr[MaxResults]
    var SortOrder: js.UndefOr[SortOrder]
    var WorkteamArn: js.UndefOr[WorkteamArn]
    var JobReferenceCodeContains: js.UndefOr[JobReferenceCodeContains]
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLabelingJobsForWorkteamRequest {
    def apply(
      SortBy: js.UndefOr[ListLabelingJobsForWorkteamSortByOptions] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined,
      WorkteamArn: js.UndefOr[WorkteamArn] = js.undefined,
      JobReferenceCodeContains: js.UndefOr[JobReferenceCodeContains] = js.undefined,
      CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
      CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListLabelingJobsForWorkteamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "WorkteamArn" -> WorkteamArn.map { x => x.asInstanceOf[js.Any] },
        "JobReferenceCodeContains" -> JobReferenceCodeContains.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLabelingJobsForWorkteamRequest]
    }
  }

  @js.native
  trait ListLabelingJobsForWorkteamResponse extends js.Object {
    var LabelingJobSummaryList: js.UndefOr[LabelingJobForWorkteamSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLabelingJobsForWorkteamResponse {
    def apply(
      LabelingJobSummaryList: js.UndefOr[LabelingJobForWorkteamSummaryList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListLabelingJobsForWorkteamResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LabelingJobSummaryList" -> LabelingJobSummaryList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLabelingJobsForWorkteamResponse]
    }
  }

  object ListLabelingJobsForWorkteamSortByOptionsEnum {
    val CreationTime = "CreationTime"

    val values = IndexedSeq(CreationTime)
  }

  @js.native
  trait ListLabelingJobsRequest extends js.Object {
    var StatusEquals: js.UndefOr[LabelingJobStatus]
    var SortBy: js.UndefOr[SortBy]
    var MaxResults: js.UndefOr[MaxResults]
    var SortOrder: js.UndefOr[SortOrder]
    var NameContains: js.UndefOr[NameContains]
    var LastModifiedTimeBefore: js.UndefOr[Timestamp]
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var NextToken: js.UndefOr[NextToken]
    var LastModifiedTimeAfter: js.UndefOr[Timestamp]
  }

  object ListLabelingJobsRequest {
    def apply(
      StatusEquals: js.UndefOr[LabelingJobStatus] = js.undefined,
      SortBy: js.UndefOr[SortBy] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined,
      NameContains: js.UndefOr[NameContains] = js.undefined,
      LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
      CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined): ListLabelingJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusEquals" -> StatusEquals.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeBefore" -> LastModifiedTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeAfter" -> LastModifiedTimeAfter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLabelingJobsRequest]
    }
  }

  @js.native
  trait ListLabelingJobsResponse extends js.Object {
    var LabelingJobSummaryList: js.UndefOr[LabelingJobSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLabelingJobsResponse {
    def apply(
      LabelingJobSummaryList: js.UndefOr[LabelingJobSummaryList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListLabelingJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LabelingJobSummaryList" -> LabelingJobSummaryList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLabelingJobsResponse]
    }
  }

  @js.native
  trait ListModelPackagesInput extends js.Object {
    var SortBy: js.UndefOr[ModelPackageSortBy]
    var MaxResults: js.UndefOr[MaxResults]
    var SortOrder: js.UndefOr[SortOrder]
    var NameContains: js.UndefOr[NameContains]
    var CreationTimeAfter: js.UndefOr[CreationTime]
    var CreationTimeBefore: js.UndefOr[CreationTime]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListModelPackagesInput {
    def apply(
      SortBy: js.UndefOr[ModelPackageSortBy] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined,
      NameContains: js.UndefOr[NameContains] = js.undefined,
      CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined,
      CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListModelPackagesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListModelPackagesInput]
    }
  }

  @js.native
  trait ListModelPackagesOutput extends js.Object {
    var ModelPackageSummaryList: js.UndefOr[ModelPackageSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListModelPackagesOutput {
    def apply(
      ModelPackageSummaryList: js.UndefOr[ModelPackageSummaryList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListModelPackagesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelPackageSummaryList" -> ModelPackageSummaryList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListModelPackagesOutput]
    }
  }

  @js.native
  trait ListModelsInput extends js.Object {
    var SortBy: js.UndefOr[ModelSortKey]
    var MaxResults: js.UndefOr[MaxResults]
    var SortOrder: js.UndefOr[OrderKey]
    var NameContains: js.UndefOr[ModelNameContains]
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListModelsInput {
    def apply(
      SortBy: js.UndefOr[ModelSortKey] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      SortOrder: js.UndefOr[OrderKey] = js.undefined,
      NameContains: js.UndefOr[ModelNameContains] = js.undefined,
      CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
      CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListModelsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListModelsInput]
    }
  }

  @js.native
  trait ListModelsOutput extends js.Object {
    var Models: js.UndefOr[ModelSummaryList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListModelsOutput {
    def apply(
      Models: js.UndefOr[ModelSummaryList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListModelsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Models" -> Models.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListModelsOutput]
    }
  }

  @js.native
  trait ListNotebookInstanceLifecycleConfigsInput extends js.Object {
    var SortBy: js.UndefOr[NotebookInstanceLifecycleConfigSortKey]
    var MaxResults: js.UndefOr[MaxResults]
    var SortOrder: js.UndefOr[NotebookInstanceLifecycleConfigSortOrder]
    var NameContains: js.UndefOr[NotebookInstanceLifecycleConfigNameContains]
    var LastModifiedTimeBefore: js.UndefOr[LastModifiedTime]
    var CreationTimeAfter: js.UndefOr[CreationTime]
    var CreationTimeBefore: js.UndefOr[CreationTime]
    var NextToken: js.UndefOr[NextToken]
    var LastModifiedTimeAfter: js.UndefOr[LastModifiedTime]
  }

  object ListNotebookInstanceLifecycleConfigsInput {
    def apply(
      SortBy: js.UndefOr[NotebookInstanceLifecycleConfigSortKey] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      SortOrder: js.UndefOr[NotebookInstanceLifecycleConfigSortOrder] = js.undefined,
      NameContains: js.UndefOr[NotebookInstanceLifecycleConfigNameContains] = js.undefined,
      LastModifiedTimeBefore: js.UndefOr[LastModifiedTime] = js.undefined,
      CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined,
      CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      LastModifiedTimeAfter: js.UndefOr[LastModifiedTime] = js.undefined): ListNotebookInstanceLifecycleConfigsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeBefore" -> LastModifiedTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeAfter" -> LastModifiedTimeAfter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListNotebookInstanceLifecycleConfigsInput]
    }
  }

  @js.native
  trait ListNotebookInstanceLifecycleConfigsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var NotebookInstanceLifecycleConfigs: js.UndefOr[NotebookInstanceLifecycleConfigSummaryList]
  }

  object ListNotebookInstanceLifecycleConfigsOutput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      NotebookInstanceLifecycleConfigs: js.UndefOr[NotebookInstanceLifecycleConfigSummaryList] = js.undefined): ListNotebookInstanceLifecycleConfigsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceLifecycleConfigs" -> NotebookInstanceLifecycleConfigs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListNotebookInstanceLifecycleConfigsOutput]
    }
  }

  @js.native
  trait ListNotebookInstancesInput extends js.Object {
    var StatusEquals: js.UndefOr[NotebookInstanceStatus]
    var SortBy: js.UndefOr[NotebookInstanceSortKey]
    var MaxResults: js.UndefOr[MaxResults]
    var SortOrder: js.UndefOr[NotebookInstanceSortOrder]
    var NameContains: js.UndefOr[NotebookInstanceNameContains]
    var AdditionalCodeRepositoryEquals: js.UndefOr[CodeRepositoryNameOrUrl]
    var LastModifiedTimeBefore: js.UndefOr[LastModifiedTime]
    var CreationTimeAfter: js.UndefOr[CreationTime]
    var CreationTimeBefore: js.UndefOr[CreationTime]
    var NextToken: js.UndefOr[NextToken]
    var DefaultCodeRepositoryContains: js.UndefOr[CodeRepositoryContains]
    var LastModifiedTimeAfter: js.UndefOr[LastModifiedTime]
    var NotebookInstanceLifecycleConfigNameContains: js.UndefOr[NotebookInstanceLifecycleConfigName]
  }

  object ListNotebookInstancesInput {
    def apply(
      StatusEquals: js.UndefOr[NotebookInstanceStatus] = js.undefined,
      SortBy: js.UndefOr[NotebookInstanceSortKey] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      SortOrder: js.UndefOr[NotebookInstanceSortOrder] = js.undefined,
      NameContains: js.UndefOr[NotebookInstanceNameContains] = js.undefined,
      AdditionalCodeRepositoryEquals: js.UndefOr[CodeRepositoryNameOrUrl] = js.undefined,
      LastModifiedTimeBefore: js.UndefOr[LastModifiedTime] = js.undefined,
      CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined,
      CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      DefaultCodeRepositoryContains: js.UndefOr[CodeRepositoryContains] = js.undefined,
      LastModifiedTimeAfter: js.UndefOr[LastModifiedTime] = js.undefined,
      NotebookInstanceLifecycleConfigNameContains: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined): ListNotebookInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusEquals" -> StatusEquals.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "AdditionalCodeRepositoryEquals" -> AdditionalCodeRepositoryEquals.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeBefore" -> LastModifiedTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "DefaultCodeRepositoryContains" -> DefaultCodeRepositoryContains.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeAfter" -> LastModifiedTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceLifecycleConfigNameContains" -> NotebookInstanceLifecycleConfigNameContains.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListNotebookInstancesInput]
    }
  }

  @js.native
  trait ListNotebookInstancesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var NotebookInstances: js.UndefOr[NotebookInstanceSummaryList]
  }

  object ListNotebookInstancesOutput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      NotebookInstances: js.UndefOr[NotebookInstanceSummaryList] = js.undefined): ListNotebookInstancesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstances" -> NotebookInstances.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListNotebookInstancesOutput]
    }
  }

  @js.native
  trait ListSubscribedWorkteamsRequest extends js.Object {
    var NameContains: js.UndefOr[WorkteamName]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListSubscribedWorkteamsRequest {
    def apply(
      NameContains: js.UndefOr[WorkteamName] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListSubscribedWorkteamsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSubscribedWorkteamsRequest]
    }
  }

  @js.native
  trait ListSubscribedWorkteamsResponse extends js.Object {
    var SubscribedWorkteams: js.UndefOr[SubscribedWorkteams]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSubscribedWorkteamsResponse {
    def apply(
      SubscribedWorkteams: js.UndefOr[SubscribedWorkteams] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListSubscribedWorkteamsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscribedWorkteams" -> SubscribedWorkteams.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSubscribedWorkteamsResponse]
    }
  }

  @js.native
  trait ListTagsInput extends js.Object {
    var ResourceArn: js.UndefOr[ResourceArn]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[ListTagsMaxResults]
  }

  object ListTagsInput {
    def apply(
      ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[ListTagsMaxResults] = js.undefined): ListTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsInput]
    }
  }

  @js.native
  trait ListTagsOutput extends js.Object {
    var Tags: js.UndefOr[TagList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsOutput {
    def apply(
      Tags: js.UndefOr[TagList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTagsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsOutput]
    }
  }

  @js.native
  trait ListTrainingJobsForHyperParameterTuningJobRequest extends js.Object {
    var StatusEquals: js.UndefOr[TrainingJobStatus]
    var SortBy: js.UndefOr[TrainingJobSortByOptions]
    var MaxResults: js.UndefOr[MaxResults]
    var SortOrder: js.UndefOr[SortOrder]
    var HyperParameterTuningJobName: js.UndefOr[HyperParameterTuningJobName]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTrainingJobsForHyperParameterTuningJobRequest {
    def apply(
      StatusEquals: js.UndefOr[TrainingJobStatus] = js.undefined,
      SortBy: js.UndefOr[TrainingJobSortByOptions] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined,
      HyperParameterTuningJobName: js.UndefOr[HyperParameterTuningJobName] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTrainingJobsForHyperParameterTuningJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusEquals" -> StatusEquals.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "HyperParameterTuningJobName" -> HyperParameterTuningJobName.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrainingJobsForHyperParameterTuningJobRequest]
    }
  }

  @js.native
  trait ListTrainingJobsForHyperParameterTuningJobResponse extends js.Object {
    var TrainingJobSummaries: js.UndefOr[HyperParameterTrainingJobSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTrainingJobsForHyperParameterTuningJobResponse {
    def apply(
      TrainingJobSummaries: js.UndefOr[HyperParameterTrainingJobSummaries] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTrainingJobsForHyperParameterTuningJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrainingJobSummaries" -> TrainingJobSummaries.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrainingJobsForHyperParameterTuningJobResponse]
    }
  }

  @js.native
  trait ListTrainingJobsRequest extends js.Object {
    var StatusEquals: js.UndefOr[TrainingJobStatus]
    var SortBy: js.UndefOr[SortBy]
    var MaxResults: js.UndefOr[MaxResults]
    var SortOrder: js.UndefOr[SortOrder]
    var NameContains: js.UndefOr[NameContains]
    var LastModifiedTimeBefore: js.UndefOr[Timestamp]
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var NextToken: js.UndefOr[NextToken]
    var LastModifiedTimeAfter: js.UndefOr[Timestamp]
  }

  object ListTrainingJobsRequest {
    def apply(
      StatusEquals: js.UndefOr[TrainingJobStatus] = js.undefined,
      SortBy: js.UndefOr[SortBy] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined,
      NameContains: js.UndefOr[NameContains] = js.undefined,
      LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
      CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined): ListTrainingJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusEquals" -> StatusEquals.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeBefore" -> LastModifiedTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeAfter" -> LastModifiedTimeAfter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrainingJobsRequest]
    }
  }

  @js.native
  trait ListTrainingJobsResponse extends js.Object {
    var TrainingJobSummaries: js.UndefOr[TrainingJobSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTrainingJobsResponse {
    def apply(
      TrainingJobSummaries: js.UndefOr[TrainingJobSummaries] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTrainingJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrainingJobSummaries" -> TrainingJobSummaries.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrainingJobsResponse]
    }
  }

  @js.native
  trait ListTransformJobsRequest extends js.Object {
    var StatusEquals: js.UndefOr[TransformJobStatus]
    var SortBy: js.UndefOr[SortBy]
    var MaxResults: js.UndefOr[MaxResults]
    var SortOrder: js.UndefOr[SortOrder]
    var NameContains: js.UndefOr[NameContains]
    var LastModifiedTimeBefore: js.UndefOr[Timestamp]
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var NextToken: js.UndefOr[NextToken]
    var LastModifiedTimeAfter: js.UndefOr[Timestamp]
  }

  object ListTransformJobsRequest {
    def apply(
      StatusEquals: js.UndefOr[TransformJobStatus] = js.undefined,
      SortBy: js.UndefOr[SortBy] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined,
      NameContains: js.UndefOr[NameContains] = js.undefined,
      LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
      CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined): ListTransformJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusEquals" -> StatusEquals.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeBefore" -> LastModifiedTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeAfter" -> LastModifiedTimeAfter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTransformJobsRequest]
    }
  }

  @js.native
  trait ListTransformJobsResponse extends js.Object {
    var TransformJobSummaries: js.UndefOr[TransformJobSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTransformJobsResponse {
    def apply(
      TransformJobSummaries: js.UndefOr[TransformJobSummaries] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTransformJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TransformJobSummaries" -> TransformJobSummaries.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTransformJobsResponse]
    }
  }

  @js.native
  trait ListWorkteamsRequest extends js.Object {
    var SortBy: js.UndefOr[ListWorkteamsSortByOptions]
    var MaxResults: js.UndefOr[MaxResults]
    var SortOrder: js.UndefOr[SortOrder]
    var NameContains: js.UndefOr[WorkteamName]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListWorkteamsRequest {
    def apply(
      SortBy: js.UndefOr[ListWorkteamsSortByOptions] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined,
      NameContains: js.UndefOr[WorkteamName] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListWorkteamsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListWorkteamsRequest]
    }
  }

  @js.native
  trait ListWorkteamsResponse extends js.Object {
    var Workteams: js.UndefOr[Workteams]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListWorkteamsResponse {
    def apply(
      Workteams: js.UndefOr[Workteams] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListWorkteamsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Workteams" -> Workteams.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListWorkteamsResponse]
    }
  }

  object ListWorkteamsSortByOptionsEnum {
    val Name = "Name"
    val CreateDate = "CreateDate"

    val values = IndexedSeq(Name, CreateDate)
  }

  /**
   * <p>Defines the Amazon Cognito user group that is part of a work team.</p>
   */
  @js.native
  trait MemberDefinition extends js.Object {
    var CognitoMemberDefinition: js.UndefOr[CognitoMemberDefinition]
  }

  object MemberDefinition {
    def apply(
      CognitoMemberDefinition: js.UndefOr[CognitoMemberDefinition] = js.undefined): MemberDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CognitoMemberDefinition" -> CognitoMemberDefinition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MemberDefinition]
    }
  }

  /**
   * <p>The name, value, and date and time of a metric that was emitted to Amazon CloudWatch.</p>
   */
  @js.native
  trait MetricData extends js.Object {
    var MetricName: js.UndefOr[MetricName]
    var Value: js.UndefOr[Float]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object MetricData {
    def apply(
      MetricName: js.UndefOr[MetricName] = js.undefined,
      Value: js.UndefOr[Float] = js.undefined,
      Timestamp: js.UndefOr[Timestamp] = js.undefined): MetricData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricData]
    }
  }

  /**
   * <p>Specifies a metric that the training algorithm writes to <code>stderr</code> or <code>stdout</code>. Amazon SageMakerhyperparameter tuning captures all defined metrics. You specify one metric that a hyperparameter tuning job uses as its objective metric to choose the best training job.</p>
   */
  @js.native
  trait MetricDefinition extends js.Object {
    var Name: js.UndefOr[MetricName]
    var Regex: js.UndefOr[MetricRegex]
  }

  object MetricDefinition {
    def apply(
      Name: js.UndefOr[MetricName] = js.undefined,
      Regex: js.UndefOr[MetricRegex] = js.undefined): MetricDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Regex" -> Regex.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricDefinition]
    }
  }

  /**
   * <p>Provides information about the location that is configured for storing model artifacts. </p>
   */
  @js.native
  trait ModelArtifacts extends js.Object {
    var S3ModelArtifacts: js.UndefOr[S3Uri]
  }

  object ModelArtifacts {
    def apply(
      S3ModelArtifacts: js.UndefOr[S3Uri] = js.undefined): ModelArtifacts = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3ModelArtifacts" -> S3ModelArtifacts.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModelArtifacts]
    }
  }

  /**
   * <p>Describes the Docker container for the model package.</p>
   */
  @js.native
  trait ModelPackageContainerDefinition extends js.Object {
    var ProductId: js.UndefOr[ProductId]
    var ContainerHostname: js.UndefOr[ContainerHostname]
    var ModelDataUrl: js.UndefOr[Url]
    var ImageDigest: js.UndefOr[ImageDigest]
    var Image: js.UndefOr[Image]
  }

  object ModelPackageContainerDefinition {
    def apply(
      ProductId: js.UndefOr[ProductId] = js.undefined,
      ContainerHostname: js.UndefOr[ContainerHostname] = js.undefined,
      ModelDataUrl: js.UndefOr[Url] = js.undefined,
      ImageDigest: js.UndefOr[ImageDigest] = js.undefined,
      Image: js.UndefOr[Image] = js.undefined): ModelPackageContainerDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductId" -> ProductId.map { x => x.asInstanceOf[js.Any] },
        "ContainerHostname" -> ContainerHostname.map { x => x.asInstanceOf[js.Any] },
        "ModelDataUrl" -> ModelDataUrl.map { x => x.asInstanceOf[js.Any] },
        "ImageDigest" -> ImageDigest.map { x => x.asInstanceOf[js.Any] },
        "Image" -> Image.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModelPackageContainerDefinition]
    }
  }

  object ModelPackageSortByEnum {
    val Name = "Name"
    val CreationTime = "CreationTime"

    val values = IndexedSeq(Name, CreationTime)
  }

  object ModelPackageStatusEnum {
    val Pending = "Pending"
    val InProgress = "InProgress"
    val Completed = "Completed"
    val Failed = "Failed"
    val Deleting = "Deleting"

    val values = IndexedSeq(Pending, InProgress, Completed, Failed, Deleting)
  }

  /**
   * <p>Specifies the validation and image scan statuses of the model package.</p>
   */
  @js.native
  trait ModelPackageStatusDetails extends js.Object {
    var ValidationStatuses: js.UndefOr[ModelPackageStatusItemList]
    var ImageScanStatuses: js.UndefOr[ModelPackageStatusItemList]
  }

  object ModelPackageStatusDetails {
    def apply(
      ValidationStatuses: js.UndefOr[ModelPackageStatusItemList] = js.undefined,
      ImageScanStatuses: js.UndefOr[ModelPackageStatusItemList] = js.undefined): ModelPackageStatusDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ValidationStatuses" -> ValidationStatuses.map { x => x.asInstanceOf[js.Any] },
        "ImageScanStatuses" -> ImageScanStatuses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModelPackageStatusDetails]
    }
  }

  /**
   * <p>Represents the overall status of a model package.</p>
   */
  @js.native
  trait ModelPackageStatusItem extends js.Object {
    var Name: js.UndefOr[EntityName]
    var Status: js.UndefOr[DetailedModelPackageStatus]
    var FailureReason: js.UndefOr[String]
  }

  object ModelPackageStatusItem {
    def apply(
      Name: js.UndefOr[EntityName] = js.undefined,
      Status: js.UndefOr[DetailedModelPackageStatus] = js.undefined,
      FailureReason: js.UndefOr[String] = js.undefined): ModelPackageStatusItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModelPackageStatusItem]
    }
  }

  /**
   * <p>Provides summary information about a model package.</p>
   */
  @js.native
  trait ModelPackageSummary extends js.Object {
    var ModelPackageArn: js.UndefOr[ModelPackageArn]
    var ModelPackageName: js.UndefOr[EntityName]
    var ModelPackageDescription: js.UndefOr[EntityDescription]
    var ModelPackageStatus: js.UndefOr[ModelPackageStatus]
    var CreationTime: js.UndefOr[CreationTime]
  }

  object ModelPackageSummary {
    def apply(
      ModelPackageArn: js.UndefOr[ModelPackageArn] = js.undefined,
      ModelPackageName: js.UndefOr[EntityName] = js.undefined,
      ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined,
      ModelPackageStatus: js.UndefOr[ModelPackageStatus] = js.undefined,
      CreationTime: js.UndefOr[CreationTime] = js.undefined): ModelPackageSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelPackageArn" -> ModelPackageArn.map { x => x.asInstanceOf[js.Any] },
        "ModelPackageName" -> ModelPackageName.map { x => x.asInstanceOf[js.Any] },
        "ModelPackageDescription" -> ModelPackageDescription.map { x => x.asInstanceOf[js.Any] },
        "ModelPackageStatus" -> ModelPackageStatus.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModelPackageSummary]
    }
  }

  /**
   * <p>Contains data such as the inputs and targeted instance types that are used in the process of validating the model package.</p> <p>The data provided in the validation profile is made available to your buyers on AWS Marketplace.</p>
   */
  @js.native
  trait ModelPackageValidationProfile extends js.Object {
    var ProfileName: js.UndefOr[EntityName]
    var TransformJobDefinition: js.UndefOr[TransformJobDefinition]
  }

  object ModelPackageValidationProfile {
    def apply(
      ProfileName: js.UndefOr[EntityName] = js.undefined,
      TransformJobDefinition: js.UndefOr[TransformJobDefinition] = js.undefined): ModelPackageValidationProfile = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProfileName" -> ProfileName.map { x => x.asInstanceOf[js.Any] },
        "TransformJobDefinition" -> TransformJobDefinition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModelPackageValidationProfile]
    }
  }

  /**
   * <p>Specifies batch transform jobs that Amazon SageMaker runs to validate your model package.</p>
   */
  @js.native
  trait ModelPackageValidationSpecification extends js.Object {
    var ValidationRole: js.UndefOr[RoleArn]
    var ValidationProfiles: js.UndefOr[ModelPackageValidationProfiles]
  }

  object ModelPackageValidationSpecification {
    def apply(
      ValidationRole: js.UndefOr[RoleArn] = js.undefined,
      ValidationProfiles: js.UndefOr[ModelPackageValidationProfiles] = js.undefined): ModelPackageValidationSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ValidationRole" -> ValidationRole.map { x => x.asInstanceOf[js.Any] },
        "ValidationProfiles" -> ValidationProfiles.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModelPackageValidationSpecification]
    }
  }

  object ModelSortKeyEnum {
    val Name = "Name"
    val CreationTime = "CreationTime"

    val values = IndexedSeq(Name, CreationTime)
  }

  /**
   * <p>Provides summary information about a model.</p>
   */
  @js.native
  trait ModelSummary extends js.Object {
    var ModelName: js.UndefOr[ModelName]
    var ModelArn: js.UndefOr[ModelArn]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object ModelSummary {
    def apply(
      ModelName: js.UndefOr[ModelName] = js.undefined,
      ModelArn: js.UndefOr[ModelArn] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): ModelSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelName" -> ModelName.map { x => x.asInstanceOf[js.Any] },
        "ModelArn" -> ModelArn.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModelSummary]
    }
  }

  /**
   * <p>A <code>NestedFilter</code> is defined by using a resource name under <code>NestedPropertyName</code>, which entries in a list that properties must match to be included in the results. To satisfy the conditions specified in the <code>NestedFilters</code> call, each object in the list must satisfy the conditions of all of the filters.</p> <p>For example, a <code>NestedFilters</code> could be defined using the training job's <code>InputDataConfig</code> property, this would be defined as a list of <code>Channel</code> objects. </p> <p>A <code>NestedFilters</code> object contains multiple filters. For example, to find all training jobs that have <code>train</code> in their name, and have <code>cat/data</code> in their<code/> <code>S3Uri</code> (under <code>InputDataConfig</code>), you need to create a <code>NestedFilters</code> object that specfies the <code>InputDataConfig</code> property with the following <code>Filter</code> objects:</p> <ul> <li> <p> <code>'{Name:"InputDataConfig.ChannelName", "Operator":"EQUALS", "Value":"train"}',</code> </p> </li> <li> <p> <code>'{Name:"InputDataConfig.DataSource.S3DataSource.S3Uri", "Operator":"CONTAINS", "Value":"cat/data"}'</code> </p> </li> </ul>
   */
  @js.native
  trait NestedFilters extends js.Object {
    var NestedPropertyName: js.UndefOr[ResourcePropertyName]
    var Filters: js.UndefOr[FilterList]
  }

  object NestedFilters {
    def apply(
      NestedPropertyName: js.UndefOr[ResourcePropertyName] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined): NestedFilters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NestedPropertyName" -> NestedPropertyName.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NestedFilters]
    }
  }

  object NotebookInstanceAcceleratorTypeEnum {
    val `ml.eia1.medium` = "ml.eia1.medium"
    val `ml.eia1.large` = "ml.eia1.large"
    val `ml.eia1.xlarge` = "ml.eia1.xlarge"

    val values = IndexedSeq(`ml.eia1.medium`, `ml.eia1.large`, `ml.eia1.xlarge`)
  }

  object NotebookInstanceLifecycleConfigSortKeyEnum {
    val Name = "Name"
    val CreationTime = "CreationTime"
    val LastModifiedTime = "LastModifiedTime"

    val values = IndexedSeq(Name, CreationTime, LastModifiedTime)
  }

  object NotebookInstanceLifecycleConfigSortOrderEnum {
    val Ascending = "Ascending"
    val Descending = "Descending"

    val values = IndexedSeq(Ascending, Descending)
  }

  /**
   * <p>Provides a summary of a notebook instance lifecycle configuration.</p>
   */
  @js.native
  trait NotebookInstanceLifecycleConfigSummary extends js.Object {
    var NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName]
    var NotebookInstanceLifecycleConfigArn: js.UndefOr[NotebookInstanceLifecycleConfigArn]
    var CreationTime: js.UndefOr[CreationTime]
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
  }

  object NotebookInstanceLifecycleConfigSummary {
    def apply(
      NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined,
      NotebookInstanceLifecycleConfigArn: js.UndefOr[NotebookInstanceLifecycleConfigArn] = js.undefined,
      CreationTime: js.UndefOr[CreationTime] = js.undefined,
      LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined): NotebookInstanceLifecycleConfigSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceLifecycleConfigName" -> NotebookInstanceLifecycleConfigName.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceLifecycleConfigArn" -> NotebookInstanceLifecycleConfigArn.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotebookInstanceLifecycleConfigSummary]
    }
  }

  /**
   * <p>Contains the notebook instance lifecycle configuration script.</p> <p>Each lifecycle configuration script has a limit of 16384 characters.</p> <p>The value of the <code>$PATH</code> environment variable that is available to both scripts is <code>/sbin:bin:/usr/sbin:/usr/bin</code>.</p> <p>View CloudWatch Logs for notebook instance lifecycle configurations in log group <code>/aws/sagemaker/NotebookInstances</code> in log stream <code>[notebook-instance-name]/[LifecycleConfigHook]</code>.</p> <p>Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes, it fails and the notebook instance is not created or started.</p> <p>For information about notebook instance lifestyle configurations, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step 2.1: (Optional) Customize a Notebook Instance</a>.</p>
   */
  @js.native
  trait NotebookInstanceLifecycleHook extends js.Object {
    var Content: js.UndefOr[NotebookInstanceLifecycleConfigContent]
  }

  object NotebookInstanceLifecycleHook {
    def apply(
      Content: js.UndefOr[NotebookInstanceLifecycleConfigContent] = js.undefined): NotebookInstanceLifecycleHook = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Content" -> Content.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotebookInstanceLifecycleHook]
    }
  }

  object NotebookInstanceSortKeyEnum {
    val Name = "Name"
    val CreationTime = "CreationTime"
    val Status = "Status"

    val values = IndexedSeq(Name, CreationTime, Status)
  }

  object NotebookInstanceSortOrderEnum {
    val Ascending = "Ascending"
    val Descending = "Descending"

    val values = IndexedSeq(Ascending, Descending)
  }

  object NotebookInstanceStatusEnum {
    val Pending = "Pending"
    val InService = "InService"
    val Stopping = "Stopping"
    val Stopped = "Stopped"
    val Failed = "Failed"
    val Deleting = "Deleting"
    val Updating = "Updating"

    val values = IndexedSeq(Pending, InService, Stopping, Stopped, Failed, Deleting, Updating)
  }

  /**
   * <p>Provides summary information for an Amazon SageMaker notebook instance.</p>
   */
  @js.native
  trait NotebookInstanceSummary extends js.Object {
    var NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName]
    var NotebookInstanceName: js.UndefOr[NotebookInstanceName]
    var NotebookInstanceStatus: js.UndefOr[NotebookInstanceStatus]
    var NotebookInstanceArn: js.UndefOr[NotebookInstanceArn]
    var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls]
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
    var InstanceType: js.UndefOr[InstanceType]
    var Url: js.UndefOr[NotebookInstanceUrl]
    var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl]
    var CreationTime: js.UndefOr[CreationTime]
  }

  object NotebookInstanceSummary {
    def apply(
      NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined,
      NotebookInstanceName: js.UndefOr[NotebookInstanceName] = js.undefined,
      NotebookInstanceStatus: js.UndefOr[NotebookInstanceStatus] = js.undefined,
      NotebookInstanceArn: js.UndefOr[NotebookInstanceArn] = js.undefined,
      AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.undefined,
      LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      Url: js.UndefOr[NotebookInstanceUrl] = js.undefined,
      DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.undefined,
      CreationTime: js.UndefOr[CreationTime] = js.undefined): NotebookInstanceSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceLifecycleConfigName" -> NotebookInstanceLifecycleConfigName.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceName" -> NotebookInstanceName.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceStatus" -> NotebookInstanceStatus.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceArn" -> NotebookInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "AdditionalCodeRepositories" -> AdditionalCodeRepositories.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] },
        "DefaultCodeRepository" -> DefaultCodeRepository.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotebookInstanceSummary]
    }
  }

  object ObjectiveStatusEnum {
    val Succeeded = "Succeeded"
    val Pending = "Pending"
    val Failed = "Failed"

    val values = IndexedSeq(Succeeded, Pending, Failed)
  }

  /**
   * <p>Specifies the number of training jobs that this hyperparameter tuning job launched, categorized by the status of their objective metric. The objective metric status shows whether the final objective metric for the training job has been evaluated by the tuning job and used in the hyperparameter tuning process.</p>
   */
  @js.native
  trait ObjectiveStatusCounters extends js.Object {
    var Succeeded: js.UndefOr[ObjectiveStatusCounter]
    var Pending: js.UndefOr[ObjectiveStatusCounter]
    var Failed: js.UndefOr[ObjectiveStatusCounter]
  }

  object ObjectiveStatusCounters {
    def apply(
      Succeeded: js.UndefOr[ObjectiveStatusCounter] = js.undefined,
      Pending: js.UndefOr[ObjectiveStatusCounter] = js.undefined,
      Failed: js.UndefOr[ObjectiveStatusCounter] = js.undefined): ObjectiveStatusCounters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Succeeded" -> Succeeded.map { x => x.asInstanceOf[js.Any] },
        "Pending" -> Pending.map { x => x.asInstanceOf[js.Any] },
        "Failed" -> Failed.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ObjectiveStatusCounters]
    }
  }

  object OperatorEnum {
    val Equals = "Equals"
    val NotEquals = "NotEquals"
    val GreaterThan = "GreaterThan"
    val GreaterThanOrEqualTo = "GreaterThanOrEqualTo"
    val LessThan = "LessThan"
    val LessThanOrEqualTo = "LessThanOrEqualTo"
    val Contains = "Contains"

    val values = IndexedSeq(Equals, NotEquals, GreaterThan, GreaterThanOrEqualTo, LessThan, LessThanOrEqualTo, Contains)
  }

  object OrderKeyEnum {
    val Ascending = "Ascending"
    val Descending = "Descending"

    val values = IndexedSeq(Ascending, Descending)
  }

  /**
   * <p>Contains information about the output location for the compiled model and the device (target) that the model runs on.</p>
   */
  @js.native
  trait OutputConfig extends js.Object {
    var S3OutputLocation: js.UndefOr[S3Uri]
    var TargetDevice: js.UndefOr[TargetDevice]
  }

  object OutputConfig {
    def apply(
      S3OutputLocation: js.UndefOr[S3Uri] = js.undefined,
      TargetDevice: js.UndefOr[TargetDevice] = js.undefined): OutputConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3OutputLocation" -> S3OutputLocation.map { x => x.asInstanceOf[js.Any] },
        "TargetDevice" -> TargetDevice.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputConfig]
    }
  }

  /**
   * <p>Provides information about how to store model training results (model artifacts).</p>
   */
  @js.native
  trait OutputDataConfig extends js.Object {
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var S3OutputPath: js.UndefOr[S3Uri]
  }

  object OutputDataConfig {
    def apply(
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      S3OutputPath: js.UndefOr[S3Uri] = js.undefined): OutputDataConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "S3OutputPath" -> S3OutputPath.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputDataConfig]
    }
  }

  /**
   * <p>Defines the possible values for categorical, continous, and integer hyperparameters to be used by an algorithm.</p>
   */
  @js.native
  trait ParameterRange extends js.Object {
    var IntegerParameterRangeSpecification: js.UndefOr[IntegerParameterRangeSpecification]
    var ContinuousParameterRangeSpecification: js.UndefOr[ContinuousParameterRangeSpecification]
    var CategoricalParameterRangeSpecification: js.UndefOr[CategoricalParameterRangeSpecification]
  }

  object ParameterRange {
    def apply(
      IntegerParameterRangeSpecification: js.UndefOr[IntegerParameterRangeSpecification] = js.undefined,
      ContinuousParameterRangeSpecification: js.UndefOr[ContinuousParameterRangeSpecification] = js.undefined,
      CategoricalParameterRangeSpecification: js.UndefOr[CategoricalParameterRangeSpecification] = js.undefined): ParameterRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IntegerParameterRangeSpecification" -> IntegerParameterRangeSpecification.map { x => x.asInstanceOf[js.Any] },
        "ContinuousParameterRangeSpecification" -> ContinuousParameterRangeSpecification.map { x => x.asInstanceOf[js.Any] },
        "CategoricalParameterRangeSpecification" -> CategoricalParameterRangeSpecification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParameterRange]
    }
  }

  /**
   * <p>Specifies ranges of integer, continuous, and categorical hyperparameters that a hyperparameter tuning job searches. The hyperparameter tuning job launches training jobs with hyperparameter values within these ranges to find the combination of values that result in the training job with the best performance as measured by the objective metric of the hyperparameter tuning job.</p> <note> <p>You can specify a maximum of 20 hyperparameters that a hyperparameter tuning job can search over. Every possible value of a categorical parameter range counts against this limit.</p> </note>
   */
  @js.native
  trait ParameterRanges extends js.Object {
    var IntegerParameterRanges: js.UndefOr[IntegerParameterRanges]
    var ContinuousParameterRanges: js.UndefOr[ContinuousParameterRanges]
    var CategoricalParameterRanges: js.UndefOr[CategoricalParameterRanges]
  }

  object ParameterRanges {
    def apply(
      IntegerParameterRanges: js.UndefOr[IntegerParameterRanges] = js.undefined,
      ContinuousParameterRanges: js.UndefOr[ContinuousParameterRanges] = js.undefined,
      CategoricalParameterRanges: js.UndefOr[CategoricalParameterRanges] = js.undefined): ParameterRanges = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IntegerParameterRanges" -> IntegerParameterRanges.map { x => x.asInstanceOf[js.Any] },
        "ContinuousParameterRanges" -> ContinuousParameterRanges.map { x => x.asInstanceOf[js.Any] },
        "CategoricalParameterRanges" -> CategoricalParameterRanges.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParameterRanges]
    }
  }

  object ParameterTypeEnum {
    val Integer = "Integer"
    val Continuous = "Continuous"
    val Categorical = "Categorical"
    val FreeText = "FreeText"

    val values = IndexedSeq(Integer, Continuous, Categorical, FreeText)
  }

  /**
   * <p>A previously completed or stopped hyperparameter tuning job to be used as a starting point for a new hyperparameter tuning job.</p>
   */
  @js.native
  trait ParentHyperParameterTuningJob extends js.Object {
    var HyperParameterTuningJobName: js.UndefOr[HyperParameterTuningJobName]
  }

  object ParentHyperParameterTuningJob {
    def apply(
      HyperParameterTuningJobName: js.UndefOr[HyperParameterTuningJobName] = js.undefined): ParentHyperParameterTuningJob = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HyperParameterTuningJobName" -> HyperParameterTuningJobName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParentHyperParameterTuningJob]
    }
  }

  /**
   * <p>Identifies a model that you want to host and the resources to deploy for hosting it. If you are deploying multiple models, tell Amazon SageMaker how to distribute traffic among the models by specifying variant weights. </p>
   */
  @js.native
  trait ProductionVariant extends js.Object {
    var ModelName: js.UndefOr[ModelName]
    var VariantName: js.UndefOr[VariantName]
    var InitialInstanceCount: js.UndefOr[TaskCount]
    var InstanceType: js.UndefOr[ProductionVariantInstanceType]
    var InitialVariantWeight: js.UndefOr[VariantWeight]
    var AcceleratorType: js.UndefOr[ProductionVariantAcceleratorType]
  }

  object ProductionVariant {
    def apply(
      ModelName: js.UndefOr[ModelName] = js.undefined,
      VariantName: js.UndefOr[VariantName] = js.undefined,
      InitialInstanceCount: js.UndefOr[TaskCount] = js.undefined,
      InstanceType: js.UndefOr[ProductionVariantInstanceType] = js.undefined,
      InitialVariantWeight: js.UndefOr[VariantWeight] = js.undefined,
      AcceleratorType: js.UndefOr[ProductionVariantAcceleratorType] = js.undefined): ProductionVariant = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelName" -> ModelName.map { x => x.asInstanceOf[js.Any] },
        "VariantName" -> VariantName.map { x => x.asInstanceOf[js.Any] },
        "InitialInstanceCount" -> InitialInstanceCount.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "InitialVariantWeight" -> InitialVariantWeight.map { x => x.asInstanceOf[js.Any] },
        "AcceleratorType" -> AcceleratorType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProductionVariant]
    }
  }

  object ProductionVariantAcceleratorTypeEnum {
    val `ml.eia1.medium` = "ml.eia1.medium"
    val `ml.eia1.large` = "ml.eia1.large"
    val `ml.eia1.xlarge` = "ml.eia1.xlarge"

    val values = IndexedSeq(`ml.eia1.medium`, `ml.eia1.large`, `ml.eia1.xlarge`)
  }

  object ProductionVariantInstanceTypeEnum {
    val `ml.t2.medium` = "ml.t2.medium"
    val `ml.t2.large` = "ml.t2.large"
    val `ml.t2.xlarge` = "ml.t2.xlarge"
    val `ml.t2.2xlarge` = "ml.t2.2xlarge"
    val `ml.m4.xlarge` = "ml.m4.xlarge"
    val `ml.m4.2xlarge` = "ml.m4.2xlarge"
    val `ml.m4.4xlarge` = "ml.m4.4xlarge"
    val `ml.m4.10xlarge` = "ml.m4.10xlarge"
    val `ml.m4.16xlarge` = "ml.m4.16xlarge"
    val `ml.m5.large` = "ml.m5.large"
    val `ml.m5.xlarge` = "ml.m5.xlarge"
    val `ml.m5.2xlarge` = "ml.m5.2xlarge"
    val `ml.m5.4xlarge` = "ml.m5.4xlarge"
    val `ml.m5.12xlarge` = "ml.m5.12xlarge"
    val `ml.m5.24xlarge` = "ml.m5.24xlarge"
    val `ml.c4.large` = "ml.c4.large"
    val `ml.c4.xlarge` = "ml.c4.xlarge"
    val `ml.c4.2xlarge` = "ml.c4.2xlarge"
    val `ml.c4.4xlarge` = "ml.c4.4xlarge"
    val `ml.c4.8xlarge` = "ml.c4.8xlarge"
    val `ml.p2.xlarge` = "ml.p2.xlarge"
    val `ml.p2.8xlarge` = "ml.p2.8xlarge"
    val `ml.p2.16xlarge` = "ml.p2.16xlarge"
    val `ml.p3.2xlarge` = "ml.p3.2xlarge"
    val `ml.p3.8xlarge` = "ml.p3.8xlarge"
    val `ml.p3.16xlarge` = "ml.p3.16xlarge"
    val `ml.c5.large` = "ml.c5.large"
    val `ml.c5.xlarge` = "ml.c5.xlarge"
    val `ml.c5.2xlarge` = "ml.c5.2xlarge"
    val `ml.c5.4xlarge` = "ml.c5.4xlarge"
    val `ml.c5.9xlarge` = "ml.c5.9xlarge"
    val `ml.c5.18xlarge` = "ml.c5.18xlarge"

    val values = IndexedSeq(`ml.t2.medium`, `ml.t2.large`, `ml.t2.xlarge`, `ml.t2.2xlarge`, `ml.m4.xlarge`, `ml.m4.2xlarge`, `ml.m4.4xlarge`, `ml.m4.10xlarge`, `ml.m4.16xlarge`, `ml.m5.large`, `ml.m5.xlarge`, `ml.m5.2xlarge`, `ml.m5.4xlarge`, `ml.m5.12xlarge`, `ml.m5.24xlarge`, `ml.c4.large`, `ml.c4.xlarge`, `ml.c4.2xlarge`, `ml.c4.4xlarge`, `ml.c4.8xlarge`, `ml.p2.xlarge`, `ml.p2.8xlarge`, `ml.p2.16xlarge`, `ml.p3.2xlarge`, `ml.p3.8xlarge`, `ml.p3.16xlarge`, `ml.c5.large`, `ml.c5.xlarge`, `ml.c5.2xlarge`, `ml.c5.4xlarge`, `ml.c5.9xlarge`, `ml.c5.18xlarge`)
  }

  /**
   * <p>Describes weight and capacities for a production variant associated with an endpoint. If you sent a request to the <code>UpdateEndpointWeightsAndCapacities</code> API and the endpoint status is <code>Updating</code>, you get different desired and current values. </p>
   */
  @js.native
  trait ProductionVariantSummary extends js.Object {
    var DeployedImages: js.UndefOr[DeployedImages]
    var VariantName: js.UndefOr[VariantName]
    var DesiredInstanceCount: js.UndefOr[TaskCount]
    var DesiredWeight: js.UndefOr[VariantWeight]
    var CurrentInstanceCount: js.UndefOr[TaskCount]
    var CurrentWeight: js.UndefOr[VariantWeight]
  }

  object ProductionVariantSummary {
    def apply(
      DeployedImages: js.UndefOr[DeployedImages] = js.undefined,
      VariantName: js.UndefOr[VariantName] = js.undefined,
      DesiredInstanceCount: js.UndefOr[TaskCount] = js.undefined,
      DesiredWeight: js.UndefOr[VariantWeight] = js.undefined,
      CurrentInstanceCount: js.UndefOr[TaskCount] = js.undefined,
      CurrentWeight: js.UndefOr[VariantWeight] = js.undefined): ProductionVariantSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeployedImages" -> DeployedImages.map { x => x.asInstanceOf[js.Any] },
        "VariantName" -> VariantName.map { x => x.asInstanceOf[js.Any] },
        "DesiredInstanceCount" -> DesiredInstanceCount.map { x => x.asInstanceOf[js.Any] },
        "DesiredWeight" -> DesiredWeight.map { x => x.asInstanceOf[js.Any] },
        "CurrentInstanceCount" -> CurrentInstanceCount.map { x => x.asInstanceOf[js.Any] },
        "CurrentWeight" -> CurrentWeight.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProductionVariantSummary]
    }
  }

  /**
   * <p>A suggestion query for retrieving property names.</p>
   */
  @js.native
  trait PropertyNameQuery extends js.Object {
    var PropertyNameHint: js.UndefOr[PropertyNameHint]
  }

  object PropertyNameQuery {
    def apply(
      PropertyNameHint: js.UndefOr[PropertyNameHint] = js.undefined): PropertyNameQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PropertyNameHint" -> PropertyNameHint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PropertyNameQuery]
    }
  }

  /**
   * <p>A property name returned from a <code>GetSearchSuggestions</code> call that specifies a value in the <code>PropertyNameQuery</code> field.</p>
   */
  @js.native
  trait PropertyNameSuggestion extends js.Object {
    var PropertyName: js.UndefOr[ResourcePropertyName]
  }

  object PropertyNameSuggestion {
    def apply(
      PropertyName: js.UndefOr[ResourcePropertyName] = js.undefined): PropertyNameSuggestion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PropertyName" -> PropertyName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PropertyNameSuggestion]
    }
  }

  /**
   * <p>Defines the amount of money paid to an Amazon Mechanical Turk worker for each task performed. For more information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-public-payment.html"> Public Workforce Task Price</a>. </p>
   */
  @js.native
  trait PublicWorkforceTaskPrice extends js.Object {
    var AmountInUsd: js.UndefOr[USD]
  }

  object PublicWorkforceTaskPrice {
    def apply(
      AmountInUsd: js.UndefOr[USD] = js.undefined): PublicWorkforceTaskPrice = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AmountInUsd" -> AmountInUsd.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublicWorkforceTaskPrice]
    }
  }

  object RecordWrapperEnum {
    val None = "None"
    val RecordIO = "RecordIO"

    val values = IndexedSeq(None, RecordIO)
  }

  @js.native
  trait RenderUiTemplateRequest extends js.Object {
    var UiTemplate: js.UndefOr[UiTemplate]
    var Task: js.UndefOr[RenderableTask]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object RenderUiTemplateRequest {
    def apply(
      UiTemplate: js.UndefOr[UiTemplate] = js.undefined,
      Task: js.UndefOr[RenderableTask] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined): RenderUiTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UiTemplate" -> UiTemplate.map { x => x.asInstanceOf[js.Any] },
        "Task" -> Task.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RenderUiTemplateRequest]
    }
  }

  @js.native
  trait RenderUiTemplateResponse extends js.Object {
    var RenderedContent: js.UndefOr[String]
    var Errors: js.UndefOr[RenderingErrorList]
  }

  object RenderUiTemplateResponse {
    def apply(
      RenderedContent: js.UndefOr[String] = js.undefined,
      Errors: js.UndefOr[RenderingErrorList] = js.undefined): RenderUiTemplateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RenderedContent" -> RenderedContent.map { x => x.asInstanceOf[js.Any] },
        "Errors" -> Errors.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RenderUiTemplateResponse]
    }
  }

  /**
   * <p>Contains input values for a task.</p>
   */
  @js.native
  trait RenderableTask extends js.Object {
    var Input: js.UndefOr[TaskInput]
  }

  object RenderableTask {
    def apply(
      Input: js.UndefOr[TaskInput] = js.undefined): RenderableTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Input" -> Input.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RenderableTask]
    }
  }

  /**
   * <p>A description of an error that occurred while rendering the template.</p>
   */
  @js.native
  trait RenderingError extends js.Object {
    var Code: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }

  object RenderingError {
    def apply(
      Code: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[String] = js.undefined): RenderingError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RenderingError]
    }
  }

  /**
   * <p>Describes the resources, including ML compute instances and ML storage volumes, to use for model training. </p>
   */
  @js.native
  trait ResourceConfig extends js.Object {
    var InstanceType: js.UndefOr[TrainingInstanceType]
    var InstanceCount: js.UndefOr[TrainingInstanceCount]
    var VolumeSizeInGB: js.UndefOr[VolumeSizeInGB]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
  }

  object ResourceConfig {
    def apply(
      InstanceType: js.UndefOr[TrainingInstanceType] = js.undefined,
      InstanceCount: js.UndefOr[TrainingInstanceCount] = js.undefined,
      VolumeSizeInGB: js.UndefOr[VolumeSizeInGB] = js.undefined,
      VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined): ResourceConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "InstanceCount" -> InstanceCount.map { x => x.asInstanceOf[js.Any] },
        "VolumeSizeInGB" -> VolumeSizeInGB.map { x => x.asInstanceOf[js.Any] },
        "VolumeKmsKeyId" -> VolumeKmsKeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceConfig]
    }
  }

  /**
   * <p>Specifies the maximum number of training jobs and parallel training jobs that a hyperparameter tuning job can launch.</p>
   */
  @js.native
  trait ResourceLimits extends js.Object {
    var MaxNumberOfTrainingJobs: js.UndefOr[MaxNumberOfTrainingJobs]
    var MaxParallelTrainingJobs: js.UndefOr[MaxParallelTrainingJobs]
  }

  object ResourceLimits {
    def apply(
      MaxNumberOfTrainingJobs: js.UndefOr[MaxNumberOfTrainingJobs] = js.undefined,
      MaxParallelTrainingJobs: js.UndefOr[MaxParallelTrainingJobs] = js.undefined): ResourceLimits = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxNumberOfTrainingJobs" -> MaxNumberOfTrainingJobs.map { x => x.asInstanceOf[js.Any] },
        "MaxParallelTrainingJobs" -> MaxParallelTrainingJobs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceLimits]
    }
  }

  object ResourceTypeEnum {
    val TrainingJob = "TrainingJob"

    val values = IndexedSeq(TrainingJob)
  }

  object S3DataDistributionEnum {
    val FullyReplicated = "FullyReplicated"
    val ShardedByS3Key = "ShardedByS3Key"

    val values = IndexedSeq(FullyReplicated, ShardedByS3Key)
  }

  /**
   * <p>Describes the S3 data source.</p>
   */
  @js.native
  trait S3DataSource extends js.Object {
    var S3DataType: js.UndefOr[S3DataType]
    var S3Uri: js.UndefOr[S3Uri]
    var S3DataDistributionType: js.UndefOr[S3DataDistribution]
    var AttributeNames: js.UndefOr[AttributeNames]
  }

  object S3DataSource {
    def apply(
      S3DataType: js.UndefOr[S3DataType] = js.undefined,
      S3Uri: js.UndefOr[S3Uri] = js.undefined,
      S3DataDistributionType: js.UndefOr[S3DataDistribution] = js.undefined,
      AttributeNames: js.UndefOr[AttributeNames] = js.undefined): S3DataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3DataType" -> S3DataType.map { x => x.asInstanceOf[js.Any] },
        "S3Uri" -> S3Uri.map { x => x.asInstanceOf[js.Any] },
        "S3DataDistributionType" -> S3DataDistributionType.map { x => x.asInstanceOf[js.Any] },
        "AttributeNames" -> AttributeNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3DataSource]
    }
  }

  object S3DataTypeEnum {
    val ManifestFile = "ManifestFile"
    val S3Prefix = "S3Prefix"
    val AugmentedManifestFile = "AugmentedManifestFile"

    val values = IndexedSeq(ManifestFile, S3Prefix, AugmentedManifestFile)
  }

  /**
   * <p>A multi-expression that searches for the specified resource or resources. All resource objects that satisfy the expression's condition are included in the search results.</p> <p>A <code>SearchExpression</code> contains the following components:</p> <ul> <li> <p>A list of <code>Filter</code> objects. Each filter defines a simple Boolean expression comprised of a resource property name, Boolean operator, and value.</p> </li> <li> <p>A list of <code>NestedFilter</code> objects. Each nested filter defines a list of Boolean expressions using a list of resource properties. A nested filter is satisfied if a single object in the list satisfies all Boolean expressions.</p> </li> <li> <p>A list of <code>SearchExpression</code> objects.</p> </li> <li> <p>A Boolean operator: <code>And</code> or <code>Or</code>.</p> </li> </ul>
   */
  @js.native
  trait SearchExpression extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var NestedFilters: js.UndefOr[NestedFiltersList]
    var SubExpressions: js.UndefOr[SearchExpressionList]
    var Operator: js.UndefOr[BooleanOperator]
  }

  object SearchExpression {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      NestedFilters: js.UndefOr[NestedFiltersList] = js.undefined,
      SubExpressions: js.UndefOr[SearchExpressionList] = js.undefined,
      Operator: js.UndefOr[BooleanOperator] = js.undefined): SearchExpression = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NestedFilters" -> NestedFilters.map { x => x.asInstanceOf[js.Any] },
        "SubExpressions" -> SubExpressions.map { x => x.asInstanceOf[js.Any] },
        "Operator" -> Operator.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchExpression]
    }
  }

  /**
   * <p>An individual search result record that contains a single resource object.</p>
   */
  @js.native
  trait SearchRecord extends js.Object {
    var TrainingJob: js.UndefOr[TrainingJob]
  }

  object SearchRecord {
    def apply(
      TrainingJob: js.UndefOr[TrainingJob] = js.undefined): SearchRecord = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrainingJob" -> TrainingJob.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchRecord]
    }
  }

  @js.native
  trait SearchRequest extends js.Object {
    var SortBy: js.UndefOr[ResourcePropertyName]
    var MaxResults: js.UndefOr[MaxResults]
    var Resource: js.UndefOr[ResourceType]
    var SearchExpression: js.UndefOr[SearchExpression]
    var SortOrder: js.UndefOr[SearchSortOrder]
    var NextToken: js.UndefOr[NextToken]
  }

  object SearchRequest {
    def apply(
      SortBy: js.UndefOr[ResourcePropertyName] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      Resource: js.UndefOr[ResourceType] = js.undefined,
      SearchExpression: js.UndefOr[SearchExpression] = js.undefined,
      SortOrder: js.UndefOr[SearchSortOrder] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): SearchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "Resource" -> Resource.map { x => x.asInstanceOf[js.Any] },
        "SearchExpression" -> SearchExpression.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchRequest]
    }
  }

  @js.native
  trait SearchResponse extends js.Object {
    var Results: js.UndefOr[SearchResultsList]
    var NextToken: js.UndefOr[NextToken]
  }

  object SearchResponse {
    def apply(
      Results: js.UndefOr[SearchResultsList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): SearchResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Results" -> Results.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchResponse]
    }
  }

  object SearchSortOrderEnum {
    val Ascending = "Ascending"
    val Descending = "Descending"

    val values = IndexedSeq(Ascending, Descending)
  }

  object SecondaryStatusEnum {
    val Starting = "Starting"
    val LaunchingMLInstances = "LaunchingMLInstances"
    val PreparingTrainingStack = "PreparingTrainingStack"
    val Downloading = "Downloading"
    val DownloadingTrainingImage = "DownloadingTrainingImage"
    val Training = "Training"
    val Uploading = "Uploading"
    val Stopping = "Stopping"
    val Stopped = "Stopped"
    val MaxRuntimeExceeded = "MaxRuntimeExceeded"
    val Completed = "Completed"
    val Failed = "Failed"

    val values = IndexedSeq(Starting, LaunchingMLInstances, PreparingTrainingStack, Downloading, DownloadingTrainingImage, Training, Uploading, Stopping, Stopped, MaxRuntimeExceeded, Completed, Failed)
  }

  /**
   * <p>An array element of <a>DescribeTrainingJobResponse$SecondaryStatusTransitions</a>. It provides additional details about a status that the training job has transitioned through. A training job can be in one of several states, for example, starting, downloading, training, or uploading. Within each state, there are a number of intermediate states. For example, within the starting state, Amazon SageMaker could be starting the training job or launching the ML instances. These transitional states are referred to as the job's secondary status. </p> <p/>
   */
  @js.native
  trait SecondaryStatusTransition extends js.Object {
    var Status: js.UndefOr[SecondaryStatus]
    var StartTime: js.UndefOr[Timestamp]
    var EndTime: js.UndefOr[Timestamp]
    var StatusMessage: js.UndefOr[StatusMessage]
  }

  object SecondaryStatusTransition {
    def apply(
      Status: js.UndefOr[SecondaryStatus] = js.undefined,
      StartTime: js.UndefOr[Timestamp] = js.undefined,
      EndTime: js.UndefOr[Timestamp] = js.undefined,
      StatusMessage: js.UndefOr[StatusMessage] = js.undefined): SecondaryStatusTransition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecondaryStatusTransition]
    }
  }

  /**
   * <p>A configuration for a shuffle option for input data in a channel. If you use <code>S3Prefix</code> for <code>S3DataType</code>, the results of the S3 key prefix matches are shuffled. If you use <code>ManifestFile</code>, the order of the S3 object references in the <code>ManifestFile</code> is shuffled. If you use <code>AugmentedManifestFile</code>, the order of the JSON lines in the <code>AugmentedManifestFile</code> is shuffled. The shuffling order is determined using the <code>Seed</code> value.</p> <p>For Pipe input mode, shuffling is done at the start of every epoch. With large datasets, this ensures that the order of the training data is different for each epoch, and it helps reduce bias and possible overfitting. In a multi-node training job when <code>ShuffleConfig</code> is combined with <code>S3DataDistributionType</code> of <code>ShardedByS3Key</code>, the data is shuffled across nodes so that the content sent to a particular node on the first epoch might be sent to a different node on the second epoch.</p>
   */
  @js.native
  trait ShuffleConfig extends js.Object {
    var Seed: js.UndefOr[Seed]
  }

  object ShuffleConfig {
    def apply(
      Seed: js.UndefOr[Seed] = js.undefined): ShuffleConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Seed" -> Seed.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ShuffleConfig]
    }
  }

  object SortByEnum {
    val Name = "Name"
    val CreationTime = "CreationTime"
    val Status = "Status"

    val values = IndexedSeq(Name, CreationTime, Status)
  }

  object SortOrderEnum {
    val Ascending = "Ascending"
    val Descending = "Descending"

    val values = IndexedSeq(Ascending, Descending)
  }

  /**
   * <p>Specifies an algorithm that was used to create the model package. The algorithm must be either an algorithm resource in your Amazon SageMaker account or an algorithm in AWS Marketplace that you are subscribed to.</p>
   */
  @js.native
  trait SourceAlgorithm extends js.Object {
    var ModelDataUrl: js.UndefOr[Url]
    var AlgorithmName: js.UndefOr[ArnOrName]
  }

  object SourceAlgorithm {
    def apply(
      ModelDataUrl: js.UndefOr[Url] = js.undefined,
      AlgorithmName: js.UndefOr[ArnOrName] = js.undefined): SourceAlgorithm = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelDataUrl" -> ModelDataUrl.map { x => x.asInstanceOf[js.Any] },
        "AlgorithmName" -> AlgorithmName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceAlgorithm]
    }
  }

  /**
   * <p>A list of algorithms that were used to create a model package.</p>
   */
  @js.native
  trait SourceAlgorithmSpecification extends js.Object {
    var SourceAlgorithms: js.UndefOr[SourceAlgorithmList]
  }

  object SourceAlgorithmSpecification {
    def apply(
      SourceAlgorithms: js.UndefOr[SourceAlgorithmList] = js.undefined): SourceAlgorithmSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceAlgorithms" -> SourceAlgorithms.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceAlgorithmSpecification]
    }
  }

  object SplitTypeEnum {
    val None = "None"
    val Line = "Line"
    val RecordIO = "RecordIO"

    val values = IndexedSeq(None, Line, RecordIO)
  }

  @js.native
  trait StartNotebookInstanceInput extends js.Object {
    var NotebookInstanceName: js.UndefOr[NotebookInstanceName]
  }

  object StartNotebookInstanceInput {
    def apply(
      NotebookInstanceName: js.UndefOr[NotebookInstanceName] = js.undefined): StartNotebookInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceName" -> NotebookInstanceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartNotebookInstanceInput]
    }
  }

  @js.native
  trait StopCompilationJobRequest extends js.Object {
    var CompilationJobName: js.UndefOr[EntityName]
  }

  object StopCompilationJobRequest {
    def apply(
      CompilationJobName: js.UndefOr[EntityName] = js.undefined): StopCompilationJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompilationJobName" -> CompilationJobName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopCompilationJobRequest]
    }
  }

  @js.native
  trait StopHyperParameterTuningJobRequest extends js.Object {
    var HyperParameterTuningJobName: js.UndefOr[HyperParameterTuningJobName]
  }

  object StopHyperParameterTuningJobRequest {
    def apply(
      HyperParameterTuningJobName: js.UndefOr[HyperParameterTuningJobName] = js.undefined): StopHyperParameterTuningJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HyperParameterTuningJobName" -> HyperParameterTuningJobName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopHyperParameterTuningJobRequest]
    }
  }

  @js.native
  trait StopLabelingJobRequest extends js.Object {
    var LabelingJobName: js.UndefOr[LabelingJobName]
  }

  object StopLabelingJobRequest {
    def apply(
      LabelingJobName: js.UndefOr[LabelingJobName] = js.undefined): StopLabelingJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LabelingJobName" -> LabelingJobName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopLabelingJobRequest]
    }
  }

  @js.native
  trait StopNotebookInstanceInput extends js.Object {
    var NotebookInstanceName: js.UndefOr[NotebookInstanceName]
  }

  object StopNotebookInstanceInput {
    def apply(
      NotebookInstanceName: js.UndefOr[NotebookInstanceName] = js.undefined): StopNotebookInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceName" -> NotebookInstanceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopNotebookInstanceInput]
    }
  }

  @js.native
  trait StopTrainingJobRequest extends js.Object {
    var TrainingJobName: js.UndefOr[TrainingJobName]
  }

  object StopTrainingJobRequest {
    def apply(
      TrainingJobName: js.UndefOr[TrainingJobName] = js.undefined): StopTrainingJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrainingJobName" -> TrainingJobName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopTrainingJobRequest]
    }
  }

  @js.native
  trait StopTransformJobRequest extends js.Object {
    var TransformJobName: js.UndefOr[TransformJobName]
  }

  object StopTransformJobRequest {
    def apply(
      TransformJobName: js.UndefOr[TransformJobName] = js.undefined): StopTransformJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TransformJobName" -> TransformJobName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopTransformJobRequest]
    }
  }

  /**
   * <p>Specifies how long a model training or compilation job can run. When the job reaches the limit, Amazon SageMaker ends the training job. Use this API to cap model processing cost.</p> <p>To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal, which delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts, so the results of training is not lost. </p> <p>Training algorithms provided by Amazon SageMaker automatically saves the intermediate results of a model training job (it is best effort case, as model might not be ready to save as some stages, for example training just started). This intermediate data is a valid model artifact. You can use it to create a model (<code>CreateModel</code>). </p>
   */
  @js.native
  trait StoppingCondition extends js.Object {
    var MaxRuntimeInSeconds: js.UndefOr[MaxRuntimeInSeconds]
  }

  object StoppingCondition {
    def apply(
      MaxRuntimeInSeconds: js.UndefOr[MaxRuntimeInSeconds] = js.undefined): StoppingCondition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxRuntimeInSeconds" -> MaxRuntimeInSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StoppingCondition]
    }
  }

  /**
   * <p>Describes a work team of a vendor that does the a labelling job.</p>
   */
  @js.native
  trait SubscribedWorkteam extends js.Object {
    var MarketplaceDescription: js.UndefOr[String200]
    var ListingId: js.UndefOr[String]
    var MarketplaceTitle: js.UndefOr[String200]
    var WorkteamArn: js.UndefOr[WorkteamArn]
    var SellerName: js.UndefOr[String]
  }

  object SubscribedWorkteam {
    def apply(
      MarketplaceDescription: js.UndefOr[String200] = js.undefined,
      ListingId: js.UndefOr[String] = js.undefined,
      MarketplaceTitle: js.UndefOr[String200] = js.undefined,
      WorkteamArn: js.UndefOr[WorkteamArn] = js.undefined,
      SellerName: js.UndefOr[String] = js.undefined): SubscribedWorkteam = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MarketplaceDescription" -> MarketplaceDescription.map { x => x.asInstanceOf[js.Any] },
        "ListingId" -> ListingId.map { x => x.asInstanceOf[js.Any] },
        "MarketplaceTitle" -> MarketplaceTitle.map { x => x.asInstanceOf[js.Any] },
        "WorkteamArn" -> WorkteamArn.map { x => x.asInstanceOf[js.Any] },
        "SellerName" -> SellerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubscribedWorkteam]
    }
  }

  /**
   * <p>Limits the property names that are included in the response.</p>
   */
  @js.native
  trait SuggestionQuery extends js.Object {
    var PropertyNameQuery: js.UndefOr[PropertyNameQuery]
  }

  object SuggestionQuery {
    def apply(
      PropertyNameQuery: js.UndefOr[PropertyNameQuery] = js.undefined): SuggestionQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PropertyNameQuery" -> PropertyNameQuery.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SuggestionQuery]
    }
  }

  /**
   * <p>Describes a tag. </p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  object TargetDeviceEnum {
    val ml_m4 = "ml_m4"
    val ml_m5 = "ml_m5"
    val ml_c4 = "ml_c4"
    val ml_c5 = "ml_c5"
    val ml_p2 = "ml_p2"
    val ml_p3 = "ml_p3"
    val jetson_tx1 = "jetson_tx1"
    val jetson_tx2 = "jetson_tx2"
    val rasp3b = "rasp3b"
    val deeplens = "deeplens"

    val values = IndexedSeq(ml_m4, ml_m5, ml_c4, ml_c5, ml_p2, ml_p3, jetson_tx1, jetson_tx2, rasp3b, deeplens)
  }

  object TrainingInputModeEnum {
    val Pipe = "Pipe"
    val File = "File"

    val values = IndexedSeq(Pipe, File)
  }

  object TrainingInstanceTypeEnum {
    val `ml.m4.xlarge` = "ml.m4.xlarge"
    val `ml.m4.2xlarge` = "ml.m4.2xlarge"
    val `ml.m4.4xlarge` = "ml.m4.4xlarge"
    val `ml.m4.10xlarge` = "ml.m4.10xlarge"
    val `ml.m4.16xlarge` = "ml.m4.16xlarge"
    val `ml.m5.large` = "ml.m5.large"
    val `ml.m5.xlarge` = "ml.m5.xlarge"
    val `ml.m5.2xlarge` = "ml.m5.2xlarge"
    val `ml.m5.4xlarge` = "ml.m5.4xlarge"
    val `ml.m5.12xlarge` = "ml.m5.12xlarge"
    val `ml.m5.24xlarge` = "ml.m5.24xlarge"
    val `ml.c4.xlarge` = "ml.c4.xlarge"
    val `ml.c4.2xlarge` = "ml.c4.2xlarge"
    val `ml.c4.4xlarge` = "ml.c4.4xlarge"
    val `ml.c4.8xlarge` = "ml.c4.8xlarge"
    val `ml.p2.xlarge` = "ml.p2.xlarge"
    val `ml.p2.8xlarge` = "ml.p2.8xlarge"
    val `ml.p2.16xlarge` = "ml.p2.16xlarge"
    val `ml.p3.2xlarge` = "ml.p3.2xlarge"
    val `ml.p3.8xlarge` = "ml.p3.8xlarge"
    val `ml.p3.16xlarge` = "ml.p3.16xlarge"
    val `ml.c5.xlarge` = "ml.c5.xlarge"
    val `ml.c5.2xlarge` = "ml.c5.2xlarge"
    val `ml.c5.4xlarge` = "ml.c5.4xlarge"
    val `ml.c5.9xlarge` = "ml.c5.9xlarge"
    val `ml.c5.18xlarge` = "ml.c5.18xlarge"

    val values = IndexedSeq(`ml.m4.xlarge`, `ml.m4.2xlarge`, `ml.m4.4xlarge`, `ml.m4.10xlarge`, `ml.m4.16xlarge`, `ml.m5.large`, `ml.m5.xlarge`, `ml.m5.2xlarge`, `ml.m5.4xlarge`, `ml.m5.12xlarge`, `ml.m5.24xlarge`, `ml.c4.xlarge`, `ml.c4.2xlarge`, `ml.c4.4xlarge`, `ml.c4.8xlarge`, `ml.p2.xlarge`, `ml.p2.8xlarge`, `ml.p2.16xlarge`, `ml.p3.2xlarge`, `ml.p3.8xlarge`, `ml.p3.16xlarge`, `ml.c5.xlarge`, `ml.c5.2xlarge`, `ml.c5.4xlarge`, `ml.c5.9xlarge`, `ml.c5.18xlarge`)
  }

  /**
   * <p>Contains information about a training job.</p>
   */
  @js.native
  trait TrainingJob extends js.Object {
    var FinalMetricDataList: js.UndefOr[FinalMetricDataList]
    var SecondaryStatus: js.UndefOr[SecondaryStatus]
    var TrainingStartTime: js.UndefOr[Timestamp]
    var SecondaryStatusTransitions: js.UndefOr[SecondaryStatusTransitions]
    var StoppingCondition: js.UndefOr[StoppingCondition]
    var ModelArtifacts: js.UndefOr[ModelArtifacts]
    var TrainingJobStatus: js.UndefOr[TrainingJobStatus]
    var ResourceConfig: js.UndefOr[ResourceConfig]
    var HyperParameters: js.UndefOr[HyperParameters]
    var EnableNetworkIsolation: js.UndefOr[Boolean]
    var TrainingJobArn: js.UndefOr[TrainingJobArn]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var AlgorithmSpecification: js.UndefOr[AlgorithmSpecification]
    var FailureReason: js.UndefOr[FailureReason]
    var VpcConfig: js.UndefOr[VpcConfig]
    var Tags: js.UndefOr[TagList]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var LabelingJobArn: js.UndefOr[LabelingJobArn]
    var RoleArn: js.UndefOr[RoleArn]
    var TrainingJobName: js.UndefOr[TrainingJobName]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var TrainingEndTime: js.UndefOr[Timestamp]
    var TuningJobArn: js.UndefOr[HyperParameterTuningJobArn]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object TrainingJob {
    def apply(
      FinalMetricDataList: js.UndefOr[FinalMetricDataList] = js.undefined,
      SecondaryStatus: js.UndefOr[SecondaryStatus] = js.undefined,
      TrainingStartTime: js.UndefOr[Timestamp] = js.undefined,
      SecondaryStatusTransitions: js.UndefOr[SecondaryStatusTransitions] = js.undefined,
      StoppingCondition: js.UndefOr[StoppingCondition] = js.undefined,
      ModelArtifacts: js.UndefOr[ModelArtifacts] = js.undefined,
      TrainingJobStatus: js.UndefOr[TrainingJobStatus] = js.undefined,
      ResourceConfig: js.UndefOr[ResourceConfig] = js.undefined,
      HyperParameters: js.UndefOr[HyperParameters] = js.undefined,
      EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
      TrainingJobArn: js.UndefOr[TrainingJobArn] = js.undefined,
      LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
      AlgorithmSpecification: js.UndefOr[AlgorithmSpecification] = js.undefined,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
      LabelingJobArn: js.UndefOr[LabelingJobArn] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined,
      TrainingJobName: js.UndefOr[TrainingJobName] = js.undefined,
      OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
      TrainingEndTime: js.UndefOr[Timestamp] = js.undefined,
      TuningJobArn: js.UndefOr[HyperParameterTuningJobArn] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): TrainingJob = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FinalMetricDataList" -> FinalMetricDataList.map { x => x.asInstanceOf[js.Any] },
        "SecondaryStatus" -> SecondaryStatus.map { x => x.asInstanceOf[js.Any] },
        "TrainingStartTime" -> TrainingStartTime.map { x => x.asInstanceOf[js.Any] },
        "SecondaryStatusTransitions" -> SecondaryStatusTransitions.map { x => x.asInstanceOf[js.Any] },
        "StoppingCondition" -> StoppingCondition.map { x => x.asInstanceOf[js.Any] },
        "ModelArtifacts" -> ModelArtifacts.map { x => x.asInstanceOf[js.Any] },
        "TrainingJobStatus" -> TrainingJobStatus.map { x => x.asInstanceOf[js.Any] },
        "ResourceConfig" -> ResourceConfig.map { x => x.asInstanceOf[js.Any] },
        "HyperParameters" -> HyperParameters.map { x => x.asInstanceOf[js.Any] },
        "EnableNetworkIsolation" -> EnableNetworkIsolation.map { x => x.asInstanceOf[js.Any] },
        "TrainingJobArn" -> TrainingJobArn.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "AlgorithmSpecification" -> AlgorithmSpecification.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "VpcConfig" -> VpcConfig.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "LabelingJobArn" -> LabelingJobArn.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
        "TrainingJobName" -> TrainingJobName.map { x => x.asInstanceOf[js.Any] },
        "OutputDataConfig" -> OutputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "TrainingEndTime" -> TrainingEndTime.map { x => x.asInstanceOf[js.Any] },
        "TuningJobArn" -> TuningJobArn.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrainingJob]
    }
  }

  /**
   * <p>Defines the input needed to run a training job using the algorithm.</p>
   */
  @js.native
  trait TrainingJobDefinition extends js.Object {
    var StoppingCondition: js.UndefOr[StoppingCondition]
    var ResourceConfig: js.UndefOr[ResourceConfig]
    var HyperParameters: js.UndefOr[HyperParameters]
    var TrainingInputMode: js.UndefOr[TrainingInputMode]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
  }

  object TrainingJobDefinition {
    def apply(
      StoppingCondition: js.UndefOr[StoppingCondition] = js.undefined,
      ResourceConfig: js.UndefOr[ResourceConfig] = js.undefined,
      HyperParameters: js.UndefOr[HyperParameters] = js.undefined,
      TrainingInputMode: js.UndefOr[TrainingInputMode] = js.undefined,
      InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
      OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined): TrainingJobDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StoppingCondition" -> StoppingCondition.map { x => x.asInstanceOf[js.Any] },
        "ResourceConfig" -> ResourceConfig.map { x => x.asInstanceOf[js.Any] },
        "HyperParameters" -> HyperParameters.map { x => x.asInstanceOf[js.Any] },
        "TrainingInputMode" -> TrainingInputMode.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "OutputDataConfig" -> OutputDataConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrainingJobDefinition]
    }
  }

  object TrainingJobSortByOptionsEnum {
    val Name = "Name"
    val CreationTime = "CreationTime"
    val Status = "Status"
    val FinalObjectiveMetricValue = "FinalObjectiveMetricValue"

    val values = IndexedSeq(Name, CreationTime, Status, FinalObjectiveMetricValue)
  }

  object TrainingJobStatusEnum {
    val InProgress = "InProgress"
    val Completed = "Completed"
    val Failed = "Failed"
    val Stopping = "Stopping"
    val Stopped = "Stopped"

    val values = IndexedSeq(InProgress, Completed, Failed, Stopping, Stopped)
  }

  /**
   * <p>The numbers of training jobs launched by a hyperparameter tuning job, categorized by status.</p>
   */
  @js.native
  trait TrainingJobStatusCounters extends js.Object {
    var RetryableError: js.UndefOr[TrainingJobStatusCounter]
    var Stopped: js.UndefOr[TrainingJobStatusCounter]
    var Completed: js.UndefOr[TrainingJobStatusCounter]
    var InProgress: js.UndefOr[TrainingJobStatusCounter]
    var NonRetryableError: js.UndefOr[TrainingJobStatusCounter]
  }

  object TrainingJobStatusCounters {
    def apply(
      RetryableError: js.UndefOr[TrainingJobStatusCounter] = js.undefined,
      Stopped: js.UndefOr[TrainingJobStatusCounter] = js.undefined,
      Completed: js.UndefOr[TrainingJobStatusCounter] = js.undefined,
      InProgress: js.UndefOr[TrainingJobStatusCounter] = js.undefined,
      NonRetryableError: js.UndefOr[TrainingJobStatusCounter] = js.undefined): TrainingJobStatusCounters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RetryableError" -> RetryableError.map { x => x.asInstanceOf[js.Any] },
        "Stopped" -> Stopped.map { x => x.asInstanceOf[js.Any] },
        "Completed" -> Completed.map { x => x.asInstanceOf[js.Any] },
        "InProgress" -> InProgress.map { x => x.asInstanceOf[js.Any] },
        "NonRetryableError" -> NonRetryableError.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrainingJobStatusCounters]
    }
  }

  /**
   * <p>Provides summary information about a training job.</p>
   */
  @js.native
  trait TrainingJobSummary extends js.Object {
    var TrainingJobStatus: js.UndefOr[TrainingJobStatus]
    var TrainingJobArn: js.UndefOr[TrainingJobArn]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var TrainingJobName: js.UndefOr[TrainingJobName]
    var TrainingEndTime: js.UndefOr[Timestamp]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object TrainingJobSummary {
    def apply(
      TrainingJobStatus: js.UndefOr[TrainingJobStatus] = js.undefined,
      TrainingJobArn: js.UndefOr[TrainingJobArn] = js.undefined,
      LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
      TrainingJobName: js.UndefOr[TrainingJobName] = js.undefined,
      TrainingEndTime: js.UndefOr[Timestamp] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): TrainingJobSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrainingJobStatus" -> TrainingJobStatus.map { x => x.asInstanceOf[js.Any] },
        "TrainingJobArn" -> TrainingJobArn.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "TrainingJobName" -> TrainingJobName.map { x => x.asInstanceOf[js.Any] },
        "TrainingEndTime" -> TrainingEndTime.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrainingJobSummary]
    }
  }

  /**
   * <p>Defines how the algorithm is used for a training job.</p>
   */
  @js.native
  trait TrainingSpecification extends js.Object {
    var SupportedHyperParameters: js.UndefOr[HyperParameterSpecifications]
    var MetricDefinitions: js.UndefOr[MetricDefinitionList]
    var SupportedTrainingInstanceTypes: js.UndefOr[TrainingInstanceTypes]
    var SupportedTuningJobObjectiveMetrics: js.UndefOr[HyperParameterTuningJobObjectives]
    var TrainingImage: js.UndefOr[Image]
    var SupportsDistributedTraining: js.UndefOr[Boolean]
    var TrainingImageDigest: js.UndefOr[ImageDigest]
    var TrainingChannels: js.UndefOr[ChannelSpecifications]
  }

  object TrainingSpecification {
    def apply(
      SupportedHyperParameters: js.UndefOr[HyperParameterSpecifications] = js.undefined,
      MetricDefinitions: js.UndefOr[MetricDefinitionList] = js.undefined,
      SupportedTrainingInstanceTypes: js.UndefOr[TrainingInstanceTypes] = js.undefined,
      SupportedTuningJobObjectiveMetrics: js.UndefOr[HyperParameterTuningJobObjectives] = js.undefined,
      TrainingImage: js.UndefOr[Image] = js.undefined,
      SupportsDistributedTraining: js.UndefOr[Boolean] = js.undefined,
      TrainingImageDigest: js.UndefOr[ImageDigest] = js.undefined,
      TrainingChannels: js.UndefOr[ChannelSpecifications] = js.undefined): TrainingSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SupportedHyperParameters" -> SupportedHyperParameters.map { x => x.asInstanceOf[js.Any] },
        "MetricDefinitions" -> MetricDefinitions.map { x => x.asInstanceOf[js.Any] },
        "SupportedTrainingInstanceTypes" -> SupportedTrainingInstanceTypes.map { x => x.asInstanceOf[js.Any] },
        "SupportedTuningJobObjectiveMetrics" -> SupportedTuningJobObjectiveMetrics.map { x => x.asInstanceOf[js.Any] },
        "TrainingImage" -> TrainingImage.map { x => x.asInstanceOf[js.Any] },
        "SupportsDistributedTraining" -> SupportsDistributedTraining.map { x => x.asInstanceOf[js.Any] },
        "TrainingImageDigest" -> TrainingImageDigest.map { x => x.asInstanceOf[js.Any] },
        "TrainingChannels" -> TrainingChannels.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrainingSpecification]
    }
  }

  /**
   * <p>Describes the location of the channel data.</p>
   */
  @js.native
  trait TransformDataSource extends js.Object {
    var S3DataSource: js.UndefOr[TransformS3DataSource]
  }

  object TransformDataSource {
    def apply(
      S3DataSource: js.UndefOr[TransformS3DataSource] = js.undefined): TransformDataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3DataSource" -> S3DataSource.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransformDataSource]
    }
  }

  /**
   * <p>Describes the input source of a transform job and the way the transform job consumes it.</p>
   */
  @js.native
  trait TransformInput extends js.Object {
    var DataSource: js.UndefOr[TransformDataSource]
    var ContentType: js.UndefOr[ContentType]
    var CompressionType: js.UndefOr[CompressionType]
    var SplitType: js.UndefOr[SplitType]
  }

  object TransformInput {
    def apply(
      DataSource: js.UndefOr[TransformDataSource] = js.undefined,
      ContentType: js.UndefOr[ContentType] = js.undefined,
      CompressionType: js.UndefOr[CompressionType] = js.undefined,
      SplitType: js.UndefOr[SplitType] = js.undefined): TransformInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataSource" -> DataSource.map { x => x.asInstanceOf[js.Any] },
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] },
        "CompressionType" -> CompressionType.map { x => x.asInstanceOf[js.Any] },
        "SplitType" -> SplitType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransformInput]
    }
  }

  object TransformInstanceTypeEnum {
    val `ml.m4.xlarge` = "ml.m4.xlarge"
    val `ml.m4.2xlarge` = "ml.m4.2xlarge"
    val `ml.m4.4xlarge` = "ml.m4.4xlarge"
    val `ml.m4.10xlarge` = "ml.m4.10xlarge"
    val `ml.m4.16xlarge` = "ml.m4.16xlarge"
    val `ml.c4.xlarge` = "ml.c4.xlarge"
    val `ml.c4.2xlarge` = "ml.c4.2xlarge"
    val `ml.c4.4xlarge` = "ml.c4.4xlarge"
    val `ml.c4.8xlarge` = "ml.c4.8xlarge"
    val `ml.p2.xlarge` = "ml.p2.xlarge"
    val `ml.p2.8xlarge` = "ml.p2.8xlarge"
    val `ml.p2.16xlarge` = "ml.p2.16xlarge"
    val `ml.p3.2xlarge` = "ml.p3.2xlarge"
    val `ml.p3.8xlarge` = "ml.p3.8xlarge"
    val `ml.p3.16xlarge` = "ml.p3.16xlarge"
    val `ml.c5.xlarge` = "ml.c5.xlarge"
    val `ml.c5.2xlarge` = "ml.c5.2xlarge"
    val `ml.c5.4xlarge` = "ml.c5.4xlarge"
    val `ml.c5.9xlarge` = "ml.c5.9xlarge"
    val `ml.c5.18xlarge` = "ml.c5.18xlarge"
    val `ml.m5.large` = "ml.m5.large"
    val `ml.m5.xlarge` = "ml.m5.xlarge"
    val `ml.m5.2xlarge` = "ml.m5.2xlarge"
    val `ml.m5.4xlarge` = "ml.m5.4xlarge"
    val `ml.m5.12xlarge` = "ml.m5.12xlarge"
    val `ml.m5.24xlarge` = "ml.m5.24xlarge"

    val values = IndexedSeq(`ml.m4.xlarge`, `ml.m4.2xlarge`, `ml.m4.4xlarge`, `ml.m4.10xlarge`, `ml.m4.16xlarge`, `ml.c4.xlarge`, `ml.c4.2xlarge`, `ml.c4.4xlarge`, `ml.c4.8xlarge`, `ml.p2.xlarge`, `ml.p2.8xlarge`, `ml.p2.16xlarge`, `ml.p3.2xlarge`, `ml.p3.8xlarge`, `ml.p3.16xlarge`, `ml.c5.xlarge`, `ml.c5.2xlarge`, `ml.c5.4xlarge`, `ml.c5.9xlarge`, `ml.c5.18xlarge`, `ml.m5.large`, `ml.m5.xlarge`, `ml.m5.2xlarge`, `ml.m5.4xlarge`, `ml.m5.12xlarge`, `ml.m5.24xlarge`)
  }

  /**
   * <p>Defines the input needed to run a transform job using the inference specification specified in the algorithm.</p>
   */
  @js.native
  trait TransformJobDefinition extends js.Object {
    var TransformResources: js.UndefOr[TransformResources]
    var Environment: js.UndefOr[TransformEnvironmentMap]
    var MaxPayloadInMB: js.UndefOr[MaxPayloadInMB]
    var MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms]
    var TransformInput: js.UndefOr[TransformInput]
    var TransformOutput: js.UndefOr[TransformOutput]
    var BatchStrategy: js.UndefOr[BatchStrategy]
  }

  object TransformJobDefinition {
    def apply(
      TransformResources: js.UndefOr[TransformResources] = js.undefined,
      Environment: js.UndefOr[TransformEnvironmentMap] = js.undefined,
      MaxPayloadInMB: js.UndefOr[MaxPayloadInMB] = js.undefined,
      MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms] = js.undefined,
      TransformInput: js.UndefOr[TransformInput] = js.undefined,
      TransformOutput: js.UndefOr[TransformOutput] = js.undefined,
      BatchStrategy: js.UndefOr[BatchStrategy] = js.undefined): TransformJobDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TransformResources" -> TransformResources.map { x => x.asInstanceOf[js.Any] },
        "Environment" -> Environment.map { x => x.asInstanceOf[js.Any] },
        "MaxPayloadInMB" -> MaxPayloadInMB.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrentTransforms" -> MaxConcurrentTransforms.map { x => x.asInstanceOf[js.Any] },
        "TransformInput" -> TransformInput.map { x => x.asInstanceOf[js.Any] },
        "TransformOutput" -> TransformOutput.map { x => x.asInstanceOf[js.Any] },
        "BatchStrategy" -> BatchStrategy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransformJobDefinition]
    }
  }

  object TransformJobStatusEnum {
    val InProgress = "InProgress"
    val Completed = "Completed"
    val Failed = "Failed"
    val Stopping = "Stopping"
    val Stopped = "Stopped"

    val values = IndexedSeq(InProgress, Completed, Failed, Stopping, Stopped)
  }

  /**
   * <p>Provides a summary of a transform job. Multiple TransformJobSummary objects are returned as a list after calling <a>ListTransformJobs</a>.</p>
   */
  @js.native
  trait TransformJobSummary extends js.Object {
    var TransformJobName: js.UndefOr[TransformJobName]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var FailureReason: js.UndefOr[FailureReason]
    var TransformJobStatus: js.UndefOr[TransformJobStatus]
    var TransformEndTime: js.UndefOr[Timestamp]
    var TransformJobArn: js.UndefOr[TransformJobArn]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object TransformJobSummary {
    def apply(
      TransformJobName: js.UndefOr[TransformJobName] = js.undefined,
      LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      TransformJobStatus: js.UndefOr[TransformJobStatus] = js.undefined,
      TransformEndTime: js.UndefOr[Timestamp] = js.undefined,
      TransformJobArn: js.UndefOr[TransformJobArn] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): TransformJobSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TransformJobName" -> TransformJobName.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "TransformJobStatus" -> TransformJobStatus.map { x => x.asInstanceOf[js.Any] },
        "TransformEndTime" -> TransformEndTime.map { x => x.asInstanceOf[js.Any] },
        "TransformJobArn" -> TransformJobArn.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransformJobSummary]
    }
  }

  /**
   * <p>Describes the results of a transform job output.</p>
   */
  @js.native
  trait TransformOutput extends js.Object {
    var S3OutputPath: js.UndefOr[S3Uri]
    var Accept: js.UndefOr[Accept]
    var AssembleWith: js.UndefOr[AssemblyType]
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object TransformOutput {
    def apply(
      S3OutputPath: js.UndefOr[S3Uri] = js.undefined,
      Accept: js.UndefOr[Accept] = js.undefined,
      AssembleWith: js.UndefOr[AssemblyType] = js.undefined,
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined): TransformOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3OutputPath" -> S3OutputPath.map { x => x.asInstanceOf[js.Any] },
        "Accept" -> Accept.map { x => x.asInstanceOf[js.Any] },
        "AssembleWith" -> AssembleWith.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransformOutput]
    }
  }

  /**
   * <p>Describes the resources, including ML instance types and ML instance count, to use for transform job.</p>
   */
  @js.native
  trait TransformResources extends js.Object {
    var InstanceType: js.UndefOr[TransformInstanceType]
    var InstanceCount: js.UndefOr[TransformInstanceCount]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
  }

  object TransformResources {
    def apply(
      InstanceType: js.UndefOr[TransformInstanceType] = js.undefined,
      InstanceCount: js.UndefOr[TransformInstanceCount] = js.undefined,
      VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined): TransformResources = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "InstanceCount" -> InstanceCount.map { x => x.asInstanceOf[js.Any] },
        "VolumeKmsKeyId" -> VolumeKmsKeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransformResources]
    }
  }

  /**
   * <p>Describes the S3 data source.</p>
   */
  @js.native
  trait TransformS3DataSource extends js.Object {
    var S3DataType: js.UndefOr[S3DataType]
    var S3Uri: js.UndefOr[S3Uri]
  }

  object TransformS3DataSource {
    def apply(
      S3DataType: js.UndefOr[S3DataType] = js.undefined,
      S3Uri: js.UndefOr[S3Uri] = js.undefined): TransformS3DataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3DataType" -> S3DataType.map { x => x.asInstanceOf[js.Any] },
        "S3Uri" -> S3Uri.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransformS3DataSource]
    }
  }

  /**
   * <p>Represents an amount of money in United States dollars/</p>
   */
  @js.native
  trait USD extends js.Object {
    var Dollars: js.UndefOr[Dollars]
    var Cents: js.UndefOr[Cents]
    var TenthFractionsOfACent: js.UndefOr[TenthFractionsOfACent]
  }

  object USD {
    def apply(
      Dollars: js.UndefOr[Dollars] = js.undefined,
      Cents: js.UndefOr[Cents] = js.undefined,
      TenthFractionsOfACent: js.UndefOr[TenthFractionsOfACent] = js.undefined): USD = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Dollars" -> Dollars.map { x => x.asInstanceOf[js.Any] },
        "Cents" -> Cents.map { x => x.asInstanceOf[js.Any] },
        "TenthFractionsOfACent" -> TenthFractionsOfACent.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[USD]
    }
  }

  /**
   * <p>Provided configuration information for the worker UI for a labeling job. </p>
   */
  @js.native
  trait UiConfig extends js.Object {
    var UiTemplateS3Uri: js.UndefOr[S3Uri]
  }

  object UiConfig {
    def apply(
      UiTemplateS3Uri: js.UndefOr[S3Uri] = js.undefined): UiConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UiTemplateS3Uri" -> UiTemplateS3Uri.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UiConfig]
    }
  }

  /**
   * <p>The Liquid template for the worker user interface.</p>
   */
  @js.native
  trait UiTemplate extends js.Object {
    var Content: js.UndefOr[TemplateContent]
  }

  object UiTemplate {
    def apply(
      Content: js.UndefOr[TemplateContent] = js.undefined): UiTemplate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Content" -> Content.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UiTemplate]
    }
  }

  @js.native
  trait UpdateCodeRepositoryInput extends js.Object {
    var CodeRepositoryName: js.UndefOr[EntityName]
    var GitConfig: js.UndefOr[GitConfigForUpdate]
  }

  object UpdateCodeRepositoryInput {
    def apply(
      CodeRepositoryName: js.UndefOr[EntityName] = js.undefined,
      GitConfig: js.UndefOr[GitConfigForUpdate] = js.undefined): UpdateCodeRepositoryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeRepositoryName" -> CodeRepositoryName.map { x => x.asInstanceOf[js.Any] },
        "GitConfig" -> GitConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCodeRepositoryInput]
    }
  }

  @js.native
  trait UpdateCodeRepositoryOutput extends js.Object {
    var CodeRepositoryArn: js.UndefOr[CodeRepositoryArn]
  }

  object UpdateCodeRepositoryOutput {
    def apply(
      CodeRepositoryArn: js.UndefOr[CodeRepositoryArn] = js.undefined): UpdateCodeRepositoryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeRepositoryArn" -> CodeRepositoryArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCodeRepositoryOutput]
    }
  }

  @js.native
  trait UpdateEndpointInput extends js.Object {
    var EndpointName: js.UndefOr[EndpointName]
    var EndpointConfigName: js.UndefOr[EndpointConfigName]
  }

  object UpdateEndpointInput {
    def apply(
      EndpointName: js.UndefOr[EndpointName] = js.undefined,
      EndpointConfigName: js.UndefOr[EndpointConfigName] = js.undefined): UpdateEndpointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointName" -> EndpointName.map { x => x.asInstanceOf[js.Any] },
        "EndpointConfigName" -> EndpointConfigName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEndpointInput]
    }
  }

  @js.native
  trait UpdateEndpointOutput extends js.Object {
    var EndpointArn: js.UndefOr[EndpointArn]
  }

  object UpdateEndpointOutput {
    def apply(
      EndpointArn: js.UndefOr[EndpointArn] = js.undefined): UpdateEndpointOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointArn" -> EndpointArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEndpointOutput]
    }
  }

  @js.native
  trait UpdateEndpointWeightsAndCapacitiesInput extends js.Object {
    var EndpointName: js.UndefOr[EndpointName]
    var DesiredWeightsAndCapacities: js.UndefOr[DesiredWeightAndCapacityList]
  }

  object UpdateEndpointWeightsAndCapacitiesInput {
    def apply(
      EndpointName: js.UndefOr[EndpointName] = js.undefined,
      DesiredWeightsAndCapacities: js.UndefOr[DesiredWeightAndCapacityList] = js.undefined): UpdateEndpointWeightsAndCapacitiesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointName" -> EndpointName.map { x => x.asInstanceOf[js.Any] },
        "DesiredWeightsAndCapacities" -> DesiredWeightsAndCapacities.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEndpointWeightsAndCapacitiesInput]
    }
  }

  @js.native
  trait UpdateEndpointWeightsAndCapacitiesOutput extends js.Object {
    var EndpointArn: js.UndefOr[EndpointArn]
  }

  object UpdateEndpointWeightsAndCapacitiesOutput {
    def apply(
      EndpointArn: js.UndefOr[EndpointArn] = js.undefined): UpdateEndpointWeightsAndCapacitiesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointArn" -> EndpointArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEndpointWeightsAndCapacitiesOutput]
    }
  }

  @js.native
  trait UpdateNotebookInstanceInput extends js.Object {
    var DisassociateDefaultCodeRepository: js.UndefOr[DisassociateDefaultCodeRepository]
    var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB]
    var NotebookInstanceName: js.UndefOr[NotebookInstanceName]
    var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls]
    var DisassociateAdditionalCodeRepositories: js.UndefOr[DisassociateAdditionalCodeRepositories]
    var InstanceType: js.UndefOr[InstanceType]
    var AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes]
    var DisassociateLifecycleConfig: js.UndefOr[DisassociateNotebookInstanceLifecycleConfig]
    var LifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName]
    var RoleArn: js.UndefOr[RoleArn]
    var DisassociateAcceleratorTypes: js.UndefOr[DisassociateNotebookInstanceAcceleratorTypes]
    var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl]
  }

  object UpdateNotebookInstanceInput {
    def apply(
      DisassociateDefaultCodeRepository: js.UndefOr[DisassociateDefaultCodeRepository] = js.undefined,
      VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.undefined,
      NotebookInstanceName: js.UndefOr[NotebookInstanceName] = js.undefined,
      AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.undefined,
      DisassociateAdditionalCodeRepositories: js.UndefOr[DisassociateAdditionalCodeRepositories] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes] = js.undefined,
      DisassociateLifecycleConfig: js.UndefOr[DisassociateNotebookInstanceLifecycleConfig] = js.undefined,
      LifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined,
      DisassociateAcceleratorTypes: js.UndefOr[DisassociateNotebookInstanceAcceleratorTypes] = js.undefined,
      DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.undefined): UpdateNotebookInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisassociateDefaultCodeRepository" -> DisassociateDefaultCodeRepository.map { x => x.asInstanceOf[js.Any] },
        "VolumeSizeInGB" -> VolumeSizeInGB.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceName" -> NotebookInstanceName.map { x => x.asInstanceOf[js.Any] },
        "AdditionalCodeRepositories" -> AdditionalCodeRepositories.map { x => x.asInstanceOf[js.Any] },
        "DisassociateAdditionalCodeRepositories" -> DisassociateAdditionalCodeRepositories.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "AcceleratorTypes" -> AcceleratorTypes.map { x => x.asInstanceOf[js.Any] },
        "DisassociateLifecycleConfig" -> DisassociateLifecycleConfig.map { x => x.asInstanceOf[js.Any] },
        "LifecycleConfigName" -> LifecycleConfigName.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
        "DisassociateAcceleratorTypes" -> DisassociateAcceleratorTypes.map { x => x.asInstanceOf[js.Any] },
        "DefaultCodeRepository" -> DefaultCodeRepository.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateNotebookInstanceInput]
    }
  }

  @js.native
  trait UpdateNotebookInstanceLifecycleConfigInput extends js.Object {
    var NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName]
    var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList]
    var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList]
  }

  object UpdateNotebookInstanceLifecycleConfigInput {
    def apply(
      NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined,
      OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined,
      OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined): UpdateNotebookInstanceLifecycleConfigInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceLifecycleConfigName" -> NotebookInstanceLifecycleConfigName.map { x => x.asInstanceOf[js.Any] },
        "OnCreate" -> OnCreate.map { x => x.asInstanceOf[js.Any] },
        "OnStart" -> OnStart.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateNotebookInstanceLifecycleConfigInput]
    }
  }

  @js.native
  trait UpdateNotebookInstanceLifecycleConfigOutput extends js.Object {

  }

  object UpdateNotebookInstanceLifecycleConfigOutput {
    def apply(): UpdateNotebookInstanceLifecycleConfigOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateNotebookInstanceLifecycleConfigOutput]
    }
  }

  @js.native
  trait UpdateNotebookInstanceOutput extends js.Object {

  }

  object UpdateNotebookInstanceOutput {
    def apply(): UpdateNotebookInstanceOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateNotebookInstanceOutput]
    }
  }

  @js.native
  trait UpdateWorkteamRequest extends js.Object {
    var WorkteamName: js.UndefOr[WorkteamName]
    var MemberDefinitions: js.UndefOr[MemberDefinitions]
    var Description: js.UndefOr[String200]
  }

  object UpdateWorkteamRequest {
    def apply(
      WorkteamName: js.UndefOr[WorkteamName] = js.undefined,
      MemberDefinitions: js.UndefOr[MemberDefinitions] = js.undefined,
      Description: js.UndefOr[String200] = js.undefined): UpdateWorkteamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkteamName" -> WorkteamName.map { x => x.asInstanceOf[js.Any] },
        "MemberDefinitions" -> MemberDefinitions.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateWorkteamRequest]
    }
  }

  @js.native
  trait UpdateWorkteamResponse extends js.Object {
    var Workteam: js.UndefOr[Workteam]
  }

  object UpdateWorkteamResponse {
    def apply(
      Workteam: js.UndefOr[Workteam] = js.undefined): UpdateWorkteamResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Workteam" -> Workteam.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateWorkteamResponse]
    }
  }

  /**
   * <p>Specifies a VPC that your training jobs and hosted models have access to. Control access to and from your training and model containers by configuring the VPC. For more information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html">Protect Endpoints by Using an Amazon Virtual Private Cloud</a> and <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect Training Jobs by Using an Amazon Virtual Private Cloud</a>. </p>
   */
  @js.native
  trait VpcConfig extends js.Object {
    var SecurityGroupIds: js.UndefOr[VpcSecurityGroupIds]
    var Subnets: js.UndefOr[Subnets]
  }

  object VpcConfig {
    def apply(
      SecurityGroupIds: js.UndefOr[VpcSecurityGroupIds] = js.undefined,
      Subnets: js.UndefOr[Subnets] = js.undefined): VpcConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "Subnets" -> Subnets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcConfig]
    }
  }

  /**
   * <p>Provides details about a labeling work team.</p>
   */
  @js.native
  trait Workteam extends js.Object {
    var SubDomain: js.UndefOr[String]
    var Description: js.UndefOr[String200]
    var CreateDate: js.UndefOr[Timestamp]
    var WorkteamArn: js.UndefOr[WorkteamArn]
    var MemberDefinitions: js.UndefOr[MemberDefinitions]
    var ProductListingIds: js.UndefOr[ProductListings]
    var LastUpdatedDate: js.UndefOr[Timestamp]
    var WorkteamName: js.UndefOr[WorkteamName]
  }

  object Workteam {
    def apply(
      SubDomain: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String200] = js.undefined,
      CreateDate: js.UndefOr[Timestamp] = js.undefined,
      WorkteamArn: js.UndefOr[WorkteamArn] = js.undefined,
      MemberDefinitions: js.UndefOr[MemberDefinitions] = js.undefined,
      ProductListingIds: js.UndefOr[ProductListings] = js.undefined,
      LastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
      WorkteamName: js.UndefOr[WorkteamName] = js.undefined): Workteam = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubDomain" -> SubDomain.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] },
        "WorkteamArn" -> WorkteamArn.map { x => x.asInstanceOf[js.Any] },
        "MemberDefinitions" -> MemberDefinitions.map { x => x.asInstanceOf[js.Any] },
        "ProductListingIds" -> ProductListingIds.map { x => x.asInstanceOf[js.Any] },
        "LastUpdatedDate" -> LastUpdatedDate.map { x => x.asInstanceOf[js.Any] },
        "WorkteamName" -> WorkteamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Workteam]
    }
  }
}
