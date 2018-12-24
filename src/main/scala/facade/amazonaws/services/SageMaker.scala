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
  class SageMaker() extends js.Object {
    def this(config: AWSConfig) = this()

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
    var ResourceArn: ResourceArn
    var Tags: TagList
  }

  object AddTagsInput {
    def apply(
      ResourceArn: ResourceArn,
      Tags: TagList): AddTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
   * Specifies the training algorithm to use in a <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateTrainingJob.html">CreateTrainingJob</a> request.
   *  For more information about algorithms provided by Amazon SageMaker, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. For information about using your own algorithms, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms with Amazon SageMaker</a>.
   */
  @js.native
  trait AlgorithmSpecification extends js.Object {
    var TrainingInputMode: TrainingInputMode
    var AlgorithmName: js.UndefOr[ArnOrName]
    var MetricDefinitions: js.UndefOr[MetricDefinitionList]
    var TrainingImage: js.UndefOr[AlgorithmImage]
  }

  object AlgorithmSpecification {
    def apply(
      TrainingInputMode: TrainingInputMode,
      AlgorithmName: js.UndefOr[ArnOrName] = js.undefined,
      MetricDefinitions: js.UndefOr[MetricDefinitionList] = js.undefined,
      TrainingImage: js.UndefOr[AlgorithmImage] = js.undefined): AlgorithmSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrainingInputMode" -> TrainingInputMode.asInstanceOf[js.Any],
        "AlgorithmName" -> AlgorithmName.map { x => x.asInstanceOf[js.Any] },
        "MetricDefinitions" -> MetricDefinitions.map { x => x.asInstanceOf[js.Any] },
        "TrainingImage" -> TrainingImage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * Specifies the validation and image scan statuses of the algorithm.
   */
  @js.native
  trait AlgorithmStatusDetails extends js.Object {
    var ImageScanStatuses: js.UndefOr[AlgorithmStatusItemList]
    var ValidationStatuses: js.UndefOr[AlgorithmStatusItemList]
  }

  object AlgorithmStatusDetails {
    def apply(
      ImageScanStatuses: js.UndefOr[AlgorithmStatusItemList] = js.undefined,
      ValidationStatuses: js.UndefOr[AlgorithmStatusItemList] = js.undefined): AlgorithmStatusDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImageScanStatuses" -> ImageScanStatuses.map { x => x.asInstanceOf[js.Any] },
        "ValidationStatuses" -> ValidationStatuses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AlgorithmStatusDetails]
    }
  }

  /**
   * Represents the overall status of an algorithm.
   */
  @js.native
  trait AlgorithmStatusItem extends js.Object {
    var Name: EntityName
    var Status: DetailedAlgorithmStatus
    var FailureReason: js.UndefOr[String]
  }

  object AlgorithmStatusItem {
    def apply(
      Name: EntityName,
      Status: DetailedAlgorithmStatus,
      FailureReason: js.UndefOr[String] = js.undefined): AlgorithmStatusItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AlgorithmStatusItem]
    }
  }

  /**
   * Provides summary information about an algorithm.
   */
  @js.native
  trait AlgorithmSummary extends js.Object {
    var AlgorithmArn: AlgorithmArn
    var AlgorithmName: EntityName
    var AlgorithmStatus: AlgorithmStatus
    var CreationTime: CreationTime
    var AlgorithmDescription: js.UndefOr[EntityDescription]
  }

  object AlgorithmSummary {
    def apply(
      AlgorithmArn: AlgorithmArn,
      AlgorithmName: EntityName,
      AlgorithmStatus: AlgorithmStatus,
      CreationTime: CreationTime,
      AlgorithmDescription: js.UndefOr[EntityDescription] = js.undefined): AlgorithmSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlgorithmArn" -> AlgorithmArn.asInstanceOf[js.Any],
        "AlgorithmName" -> AlgorithmName.asInstanceOf[js.Any],
        "AlgorithmStatus" -> AlgorithmStatus.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "AlgorithmDescription" -> AlgorithmDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AlgorithmSummary]
    }
  }

  /**
   * Defines a training job and a batch transform job that Amazon SageMaker runs to validate your algorithm.
   *  The data provided in the validation profile is made available to your buyers on AWS Marketplace.
   */
  @js.native
  trait AlgorithmValidationProfile extends js.Object {
    var ProfileName: EntityName
    var TrainingJobDefinition: TrainingJobDefinition
    var TransformJobDefinition: js.UndefOr[TransformJobDefinition]
  }

  object AlgorithmValidationProfile {
    def apply(
      ProfileName: EntityName,
      TrainingJobDefinition: TrainingJobDefinition,
      TransformJobDefinition: js.UndefOr[TransformJobDefinition] = js.undefined): AlgorithmValidationProfile = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProfileName" -> ProfileName.asInstanceOf[js.Any],
        "TrainingJobDefinition" -> TrainingJobDefinition.asInstanceOf[js.Any],
        "TransformJobDefinition" -> TransformJobDefinition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AlgorithmValidationProfile]
    }
  }

  /**
   * Specifies configurations for one or more training jobs that Amazon SageMaker runs to test the algorithm.
   */
  @js.native
  trait AlgorithmValidationSpecification extends js.Object {
    var ValidationProfiles: AlgorithmValidationProfiles
    var ValidationRole: RoleArn
  }

  object AlgorithmValidationSpecification {
    def apply(
      ValidationProfiles: AlgorithmValidationProfiles,
      ValidationRole: RoleArn): AlgorithmValidationSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ValidationProfiles" -> ValidationProfiles.asInstanceOf[js.Any],
        "ValidationRole" -> ValidationRole.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AlgorithmValidationSpecification]
    }
  }

  /**
   * Configures how labels are consolidated across human workers.
   */
  @js.native
  trait AnnotationConsolidationConfig extends js.Object {
    var AnnotationConsolidationLambdaArn: LambdaFunctionArn
  }

  object AnnotationConsolidationConfig {
    def apply(
      AnnotationConsolidationLambdaArn: LambdaFunctionArn): AnnotationConsolidationConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AnnotationConsolidationLambdaArn" -> AnnotationConsolidationLambdaArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
   * A list of categorical hyperparameters to tune.
   */
  @js.native
  trait CategoricalParameterRange extends js.Object {
    var Name: ParameterKey
    var Values: ParameterValues
  }

  object CategoricalParameterRange {
    def apply(
      Name: ParameterKey,
      Values: ParameterValues): CategoricalParameterRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CategoricalParameterRange]
    }
  }

  /**
   * Defines the possible values for a categorical hyperparameter.
   */
  @js.native
  trait CategoricalParameterRangeSpecification extends js.Object {
    var Values: ParameterValues
  }

  object CategoricalParameterRangeSpecification {
    def apply(
      Values: ParameterValues): CategoricalParameterRangeSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Values" -> Values.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CategoricalParameterRangeSpecification]
    }
  }

  /**
   * A channel is a named input source that training algorithms can consume.
   */
  @js.native
  trait Channel extends js.Object {
    var ChannelName: ChannelName
    var DataSource: DataSource
    var CompressionType: js.UndefOr[CompressionType]
    var ContentType: js.UndefOr[ContentType]
    var InputMode: js.UndefOr[TrainingInputMode]
    var RecordWrapperType: js.UndefOr[RecordWrapper]
    var ShuffleConfig: js.UndefOr[ShuffleConfig]
  }

  object Channel {
    def apply(
      ChannelName: ChannelName,
      DataSource: DataSource,
      CompressionType: js.UndefOr[CompressionType] = js.undefined,
      ContentType: js.UndefOr[ContentType] = js.undefined,
      InputMode: js.UndefOr[TrainingInputMode] = js.undefined,
      RecordWrapperType: js.UndefOr[RecordWrapper] = js.undefined,
      ShuffleConfig: js.UndefOr[ShuffleConfig] = js.undefined): Channel = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChannelName" -> ChannelName.asInstanceOf[js.Any],
        "DataSource" -> DataSource.asInstanceOf[js.Any],
        "CompressionType" -> CompressionType.map { x => x.asInstanceOf[js.Any] },
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] },
        "InputMode" -> InputMode.map { x => x.asInstanceOf[js.Any] },
        "RecordWrapperType" -> RecordWrapperType.map { x => x.asInstanceOf[js.Any] },
        "ShuffleConfig" -> ShuffleConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Channel]
    }
  }

  /**
   * Defines a named input source, called a channel, to be used by an algorithm.
   */
  @js.native
  trait ChannelSpecification extends js.Object {
    var Name: ChannelName
    var SupportedContentTypes: ContentTypes
    var SupportedInputModes: InputModes
    var Description: js.UndefOr[EntityDescription]
    var IsRequired: js.UndefOr[Boolean]
    var SupportedCompressionTypes: js.UndefOr[CompressionTypes]
  }

  object ChannelSpecification {
    def apply(
      Name: ChannelName,
      SupportedContentTypes: ContentTypes,
      SupportedInputModes: InputModes,
      Description: js.UndefOr[EntityDescription] = js.undefined,
      IsRequired: js.UndefOr[Boolean] = js.undefined,
      SupportedCompressionTypes: js.UndefOr[CompressionTypes] = js.undefined): ChannelSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "SupportedContentTypes" -> SupportedContentTypes.asInstanceOf[js.Any],
        "SupportedInputModes" -> SupportedInputModes.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "IsRequired" -> IsRequired.map { x => x.asInstanceOf[js.Any] },
        "SupportedCompressionTypes" -> SupportedCompressionTypes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * Specifies summary information about a git repository.
   */
  @js.native
  trait CodeRepositorySummary extends js.Object {
    var CodeRepositoryArn: CodeRepositoryArn
    var CodeRepositoryName: EntityName
    var CreationTime: CreationTime
    var LastModifiedTime: LastModifiedTime
    var GitConfig: js.UndefOr[GitConfig]
  }

  object CodeRepositorySummary {
    def apply(
      CodeRepositoryArn: CodeRepositoryArn,
      CodeRepositoryName: EntityName,
      CreationTime: CreationTime,
      LastModifiedTime: LastModifiedTime,
      GitConfig: js.UndefOr[GitConfig] = js.undefined): CodeRepositorySummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeRepositoryArn" -> CodeRepositoryArn.asInstanceOf[js.Any],
        "CodeRepositoryName" -> CodeRepositoryName.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "GitConfig" -> GitConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CodeRepositorySummary]
    }
  }

  /**
   * Identifies a Amazon Cognito user group. A user group can be used in on or more work teams.
   */
  @js.native
  trait CognitoMemberDefinition extends js.Object {
    var ClientId: CognitoClientId
    var UserGroup: CognitoUserGroup
    var UserPool: CognitoUserPool
  }

  object CognitoMemberDefinition {
    def apply(
      ClientId: CognitoClientId,
      UserGroup: CognitoUserGroup,
      UserPool: CognitoUserPool): CognitoMemberDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientId" -> ClientId.asInstanceOf[js.Any],
        "UserGroup" -> UserGroup.asInstanceOf[js.Any],
        "UserPool" -> UserPool.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
   * A summary of a model compilation job.
   */
  @js.native
  trait CompilationJobSummary extends js.Object {
    var CompilationJobArn: CompilationJobArn
    var CompilationJobName: EntityName
    var CompilationJobStatus: CompilationJobStatus
    var CompilationTargetDevice: TargetDevice
    var CreationTime: CreationTime
    var CompilationEndTime: js.UndefOr[Timestamp]
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
  }

  object CompilationJobSummary {
    def apply(
      CompilationJobArn: CompilationJobArn,
      CompilationJobName: EntityName,
      CompilationJobStatus: CompilationJobStatus,
      CompilationTargetDevice: TargetDevice,
      CreationTime: CreationTime,
      CompilationEndTime: js.UndefOr[Timestamp] = js.undefined,
      LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined): CompilationJobSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompilationJobArn" -> CompilationJobArn.asInstanceOf[js.Any],
        "CompilationJobName" -> CompilationJobName.asInstanceOf[js.Any],
        "CompilationJobStatus" -> CompilationJobStatus.asInstanceOf[js.Any],
        "CompilationTargetDevice" -> CompilationTargetDevice.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "CompilationEndTime" -> CompilationEndTime.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompilationJobSummary]
    }
  }

  object CompressionTypeEnum {
    val None = "None"
    val Gzip = "Gzip"

    val values = IndexedSeq(None, Gzip)
  }

  /**
   * Describes the container, as part of model definition.
   */
  @js.native
  trait ContainerDefinition extends js.Object {
    var ContainerHostname: js.UndefOr[ContainerHostname]
    var Environment: js.UndefOr[EnvironmentMap]
    var Image: js.UndefOr[Image]
    var ModelDataUrl: js.UndefOr[Url]
    var ModelPackageName: js.UndefOr[ArnOrName]
  }

  object ContainerDefinition {
    def apply(
      ContainerHostname: js.UndefOr[ContainerHostname] = js.undefined,
      Environment: js.UndefOr[EnvironmentMap] = js.undefined,
      Image: js.UndefOr[Image] = js.undefined,
      ModelDataUrl: js.UndefOr[Url] = js.undefined,
      ModelPackageName: js.UndefOr[ArnOrName] = js.undefined): ContainerDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContainerHostname" -> ContainerHostname.map { x => x.asInstanceOf[js.Any] },
        "Environment" -> Environment.map { x => x.asInstanceOf[js.Any] },
        "Image" -> Image.map { x => x.asInstanceOf[js.Any] },
        "ModelDataUrl" -> ModelDataUrl.map { x => x.asInstanceOf[js.Any] },
        "ModelPackageName" -> ModelPackageName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerDefinition]
    }
  }

  object ContentClassifierEnum {
    val FreeOfPersonallyIdentifiableInformation = "FreeOfPersonallyIdentifiableInformation"
    val FreeOfAdultContent = "FreeOfAdultContent"

    val values = IndexedSeq(FreeOfPersonallyIdentifiableInformation, FreeOfAdultContent)
  }

  /**
   * A list of continuous hyperparameters to tune.
   */
  @js.native
  trait ContinuousParameterRange extends js.Object {
    var MaxValue: ParameterValue
    var MinValue: ParameterValue
    var Name: ParameterKey
  }

  object ContinuousParameterRange {
    def apply(
      MaxValue: ParameterValue,
      MinValue: ParameterValue,
      Name: ParameterKey): ContinuousParameterRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxValue" -> MaxValue.asInstanceOf[js.Any],
        "MinValue" -> MinValue.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContinuousParameterRange]
    }
  }

  /**
   * Defines the possible values for a continuous hyperparameter.
   */
  @js.native
  trait ContinuousParameterRangeSpecification extends js.Object {
    var MaxValue: ParameterValue
    var MinValue: ParameterValue
  }

  object ContinuousParameterRangeSpecification {
    def apply(
      MaxValue: ParameterValue,
      MinValue: ParameterValue): ContinuousParameterRangeSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxValue" -> MaxValue.asInstanceOf[js.Any],
        "MinValue" -> MinValue.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContinuousParameterRangeSpecification]
    }
  }

  @js.native
  trait CreateAlgorithmInput extends js.Object {
    var AlgorithmName: EntityName
    var TrainingSpecification: TrainingSpecification
    var AlgorithmDescription: js.UndefOr[EntityDescription]
    var CertifyForMarketplace: js.UndefOr[CertifyForMarketplace]
    var InferenceSpecification: js.UndefOr[InferenceSpecification]
    var ValidationSpecification: js.UndefOr[AlgorithmValidationSpecification]
  }

  object CreateAlgorithmInput {
    def apply(
      AlgorithmName: EntityName,
      TrainingSpecification: TrainingSpecification,
      AlgorithmDescription: js.UndefOr[EntityDescription] = js.undefined,
      CertifyForMarketplace: js.UndefOr[CertifyForMarketplace] = js.undefined,
      InferenceSpecification: js.UndefOr[InferenceSpecification] = js.undefined,
      ValidationSpecification: js.UndefOr[AlgorithmValidationSpecification] = js.undefined): CreateAlgorithmInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlgorithmName" -> AlgorithmName.asInstanceOf[js.Any],
        "TrainingSpecification" -> TrainingSpecification.asInstanceOf[js.Any],
        "AlgorithmDescription" -> AlgorithmDescription.map { x => x.asInstanceOf[js.Any] },
        "CertifyForMarketplace" -> CertifyForMarketplace.map { x => x.asInstanceOf[js.Any] },
        "InferenceSpecification" -> InferenceSpecification.map { x => x.asInstanceOf[js.Any] },
        "ValidationSpecification" -> ValidationSpecification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAlgorithmInput]
    }
  }

  @js.native
  trait CreateAlgorithmOutput extends js.Object {
    var AlgorithmArn: AlgorithmArn
  }

  object CreateAlgorithmOutput {
    def apply(
      AlgorithmArn: AlgorithmArn): CreateAlgorithmOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlgorithmArn" -> AlgorithmArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAlgorithmOutput]
    }
  }

  @js.native
  trait CreateCodeRepositoryInput extends js.Object {
    var CodeRepositoryName: EntityName
    var GitConfig: GitConfig
  }

  object CreateCodeRepositoryInput {
    def apply(
      CodeRepositoryName: EntityName,
      GitConfig: GitConfig): CreateCodeRepositoryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeRepositoryName" -> CodeRepositoryName.asInstanceOf[js.Any],
        "GitConfig" -> GitConfig.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCodeRepositoryInput]
    }
  }

  @js.native
  trait CreateCodeRepositoryOutput extends js.Object {
    var CodeRepositoryArn: CodeRepositoryArn
  }

  object CreateCodeRepositoryOutput {
    def apply(
      CodeRepositoryArn: CodeRepositoryArn): CreateCodeRepositoryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeRepositoryArn" -> CodeRepositoryArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCodeRepositoryOutput]
    }
  }

  @js.native
  trait CreateCompilationJobRequest extends js.Object {
    var CompilationJobName: EntityName
    var InputConfig: InputConfig
    var OutputConfig: OutputConfig
    var RoleArn: RoleArn
    var StoppingCondition: StoppingCondition
  }

  object CreateCompilationJobRequest {
    def apply(
      CompilationJobName: EntityName,
      InputConfig: InputConfig,
      OutputConfig: OutputConfig,
      RoleArn: RoleArn,
      StoppingCondition: StoppingCondition): CreateCompilationJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompilationJobName" -> CompilationJobName.asInstanceOf[js.Any],
        "InputConfig" -> InputConfig.asInstanceOf[js.Any],
        "OutputConfig" -> OutputConfig.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "StoppingCondition" -> StoppingCondition.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCompilationJobRequest]
    }
  }

  @js.native
  trait CreateCompilationJobResponse extends js.Object {
    var CompilationJobArn: CompilationJobArn
  }

  object CreateCompilationJobResponse {
    def apply(
      CompilationJobArn: CompilationJobArn): CreateCompilationJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompilationJobArn" -> CompilationJobArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCompilationJobResponse]
    }
  }

  @js.native
  trait CreateEndpointConfigInput extends js.Object {
    var EndpointConfigName: EndpointConfigName
    var ProductionVariants: ProductionVariantList
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var Tags: js.UndefOr[TagList]
  }

  object CreateEndpointConfigInput {
    def apply(
      EndpointConfigName: EndpointConfigName,
      ProductionVariants: ProductionVariantList,
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateEndpointConfigInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointConfigName" -> EndpointConfigName.asInstanceOf[js.Any],
        "ProductionVariants" -> ProductionVariants.asInstanceOf[js.Any],
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEndpointConfigInput]
    }
  }

  @js.native
  trait CreateEndpointConfigOutput extends js.Object {
    var EndpointConfigArn: EndpointConfigArn
  }

  object CreateEndpointConfigOutput {
    def apply(
      EndpointConfigArn: EndpointConfigArn): CreateEndpointConfigOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointConfigArn" -> EndpointConfigArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEndpointConfigOutput]
    }
  }

  @js.native
  trait CreateEndpointInput extends js.Object {
    var EndpointConfigName: EndpointConfigName
    var EndpointName: EndpointName
    var Tags: js.UndefOr[TagList]
  }

  object CreateEndpointInput {
    def apply(
      EndpointConfigName: EndpointConfigName,
      EndpointName: EndpointName,
      Tags: js.UndefOr[TagList] = js.undefined): CreateEndpointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointConfigName" -> EndpointConfigName.asInstanceOf[js.Any],
        "EndpointName" -> EndpointName.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEndpointInput]
    }
  }

  @js.native
  trait CreateEndpointOutput extends js.Object {
    var EndpointArn: EndpointArn
  }

  object CreateEndpointOutput {
    def apply(
      EndpointArn: EndpointArn): CreateEndpointOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEndpointOutput]
    }
  }

  @js.native
  trait CreateHyperParameterTuningJobRequest extends js.Object {
    var HyperParameterTuningJobConfig: HyperParameterTuningJobConfig
    var HyperParameterTuningJobName: HyperParameterTuningJobName
    var TrainingJobDefinition: HyperParameterTrainingJobDefinition
    var Tags: js.UndefOr[TagList]
    var WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig]
  }

  object CreateHyperParameterTuningJobRequest {
    def apply(
      HyperParameterTuningJobConfig: HyperParameterTuningJobConfig,
      HyperParameterTuningJobName: HyperParameterTuningJobName,
      TrainingJobDefinition: HyperParameterTrainingJobDefinition,
      Tags: js.UndefOr[TagList] = js.undefined,
      WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig] = js.undefined): CreateHyperParameterTuningJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HyperParameterTuningJobConfig" -> HyperParameterTuningJobConfig.asInstanceOf[js.Any],
        "HyperParameterTuningJobName" -> HyperParameterTuningJobName.asInstanceOf[js.Any],
        "TrainingJobDefinition" -> TrainingJobDefinition.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "WarmStartConfig" -> WarmStartConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHyperParameterTuningJobRequest]
    }
  }

  @js.native
  trait CreateHyperParameterTuningJobResponse extends js.Object {
    var HyperParameterTuningJobArn: HyperParameterTuningJobArn
  }

  object CreateHyperParameterTuningJobResponse {
    def apply(
      HyperParameterTuningJobArn: HyperParameterTuningJobArn): CreateHyperParameterTuningJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HyperParameterTuningJobArn" -> HyperParameterTuningJobArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHyperParameterTuningJobResponse]
    }
  }

  @js.native
  trait CreateLabelingJobRequest extends js.Object {
    var HumanTaskConfig: HumanTaskConfig
    var InputConfig: LabelingJobInputConfig
    var LabelAttributeName: LabelAttributeName
    var LabelingJobName: LabelingJobName
    var OutputConfig: LabelingJobOutputConfig
    var RoleArn: RoleArn
    var LabelCategoryConfigS3Uri: js.UndefOr[S3Uri]
    var LabelingJobAlgorithmsConfig: js.UndefOr[LabelingJobAlgorithmsConfig]
    var StoppingConditions: js.UndefOr[LabelingJobStoppingConditions]
    var Tags: js.UndefOr[TagList]
  }

  object CreateLabelingJobRequest {
    def apply(
      HumanTaskConfig: HumanTaskConfig,
      InputConfig: LabelingJobInputConfig,
      LabelAttributeName: LabelAttributeName,
      LabelingJobName: LabelingJobName,
      OutputConfig: LabelingJobOutputConfig,
      RoleArn: RoleArn,
      LabelCategoryConfigS3Uri: js.UndefOr[S3Uri] = js.undefined,
      LabelingJobAlgorithmsConfig: js.UndefOr[LabelingJobAlgorithmsConfig] = js.undefined,
      StoppingConditions: js.UndefOr[LabelingJobStoppingConditions] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateLabelingJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HumanTaskConfig" -> HumanTaskConfig.asInstanceOf[js.Any],
        "InputConfig" -> InputConfig.asInstanceOf[js.Any],
        "LabelAttributeName" -> LabelAttributeName.asInstanceOf[js.Any],
        "LabelingJobName" -> LabelingJobName.asInstanceOf[js.Any],
        "OutputConfig" -> OutputConfig.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "LabelCategoryConfigS3Uri" -> LabelCategoryConfigS3Uri.map { x => x.asInstanceOf[js.Any] },
        "LabelingJobAlgorithmsConfig" -> LabelingJobAlgorithmsConfig.map { x => x.asInstanceOf[js.Any] },
        "StoppingConditions" -> StoppingConditions.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLabelingJobRequest]
    }
  }

  @js.native
  trait CreateLabelingJobResponse extends js.Object {
    var LabelingJobArn: LabelingJobArn
  }

  object CreateLabelingJobResponse {
    def apply(
      LabelingJobArn: LabelingJobArn): CreateLabelingJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LabelingJobArn" -> LabelingJobArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLabelingJobResponse]
    }
  }

  @js.native
  trait CreateModelInput extends js.Object {
    var ExecutionRoleArn: RoleArn
    var ModelName: ModelName
    var Containers: js.UndefOr[ContainerDefinitionList]
    var EnableNetworkIsolation: js.UndefOr[Boolean]
    var PrimaryContainer: js.UndefOr[ContainerDefinition]
    var Tags: js.UndefOr[TagList]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object CreateModelInput {
    def apply(
      ExecutionRoleArn: RoleArn,
      ModelName: ModelName,
      Containers: js.UndefOr[ContainerDefinitionList] = js.undefined,
      EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
      PrimaryContainer: js.UndefOr[ContainerDefinition] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined): CreateModelInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExecutionRoleArn" -> ExecutionRoleArn.asInstanceOf[js.Any],
        "ModelName" -> ModelName.asInstanceOf[js.Any],
        "Containers" -> Containers.map { x => x.asInstanceOf[js.Any] },
        "EnableNetworkIsolation" -> EnableNetworkIsolation.map { x => x.asInstanceOf[js.Any] },
        "PrimaryContainer" -> PrimaryContainer.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "VpcConfig" -> VpcConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateModelInput]
    }
  }

  @js.native
  trait CreateModelOutput extends js.Object {
    var ModelArn: ModelArn
  }

  object CreateModelOutput {
    def apply(
      ModelArn: ModelArn): CreateModelOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelArn" -> ModelArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateModelOutput]
    }
  }

  @js.native
  trait CreateModelPackageInput extends js.Object {
    var ModelPackageName: EntityName
    var CertifyForMarketplace: js.UndefOr[CertifyForMarketplace]
    var InferenceSpecification: js.UndefOr[InferenceSpecification]
    var ModelPackageDescription: js.UndefOr[EntityDescription]
    var SourceAlgorithmSpecification: js.UndefOr[SourceAlgorithmSpecification]
    var ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification]
  }

  object CreateModelPackageInput {
    def apply(
      ModelPackageName: EntityName,
      CertifyForMarketplace: js.UndefOr[CertifyForMarketplace] = js.undefined,
      InferenceSpecification: js.UndefOr[InferenceSpecification] = js.undefined,
      ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined,
      SourceAlgorithmSpecification: js.UndefOr[SourceAlgorithmSpecification] = js.undefined,
      ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification] = js.undefined): CreateModelPackageInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelPackageName" -> ModelPackageName.asInstanceOf[js.Any],
        "CertifyForMarketplace" -> CertifyForMarketplace.map { x => x.asInstanceOf[js.Any] },
        "InferenceSpecification" -> InferenceSpecification.map { x => x.asInstanceOf[js.Any] },
        "ModelPackageDescription" -> ModelPackageDescription.map { x => x.asInstanceOf[js.Any] },
        "SourceAlgorithmSpecification" -> SourceAlgorithmSpecification.map { x => x.asInstanceOf[js.Any] },
        "ValidationSpecification" -> ValidationSpecification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateModelPackageInput]
    }
  }

  @js.native
  trait CreateModelPackageOutput extends js.Object {
    var ModelPackageArn: ModelPackageArn
  }

  object CreateModelPackageOutput {
    def apply(
      ModelPackageArn: ModelPackageArn): CreateModelPackageOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelPackageArn" -> ModelPackageArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateModelPackageOutput]
    }
  }

  @js.native
  trait CreateNotebookInstanceInput extends js.Object {
    var InstanceType: InstanceType
    var NotebookInstanceName: NotebookInstanceName
    var RoleArn: RoleArn
    var AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes]
    var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls]
    var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl]
    var DirectInternetAccess: js.UndefOr[DirectInternetAccess]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var LifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var SubnetId: js.UndefOr[SubnetId]
    var Tags: js.UndefOr[TagList]
    var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB]
  }

  object CreateNotebookInstanceInput {
    def apply(
      InstanceType: InstanceType,
      NotebookInstanceName: NotebookInstanceName,
      RoleArn: RoleArn,
      AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes] = js.undefined,
      AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.undefined,
      DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.undefined,
      DirectInternetAccess: js.UndefOr[DirectInternetAccess] = js.undefined,
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      LifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined,
      SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
      SubnetId: js.UndefOr[SubnetId] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.undefined): CreateNotebookInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceType" -> InstanceType.asInstanceOf[js.Any],
        "NotebookInstanceName" -> NotebookInstanceName.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "AcceleratorTypes" -> AcceleratorTypes.map { x => x.asInstanceOf[js.Any] },
        "AdditionalCodeRepositories" -> AdditionalCodeRepositories.map { x => x.asInstanceOf[js.Any] },
        "DefaultCodeRepository" -> DefaultCodeRepository.map { x => x.asInstanceOf[js.Any] },
        "DirectInternetAccess" -> DirectInternetAccess.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "LifecycleConfigName" -> LifecycleConfigName.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "VolumeSizeInGB" -> VolumeSizeInGB.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNotebookInstanceInput]
    }
  }

  @js.native
  trait CreateNotebookInstanceLifecycleConfigInput extends js.Object {
    var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
    var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList]
    var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList]
  }

  object CreateNotebookInstanceLifecycleConfigInput {
    def apply(
      NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName,
      OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined,
      OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined): CreateNotebookInstanceLifecycleConfigInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceLifecycleConfigName" -> NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any],
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
    var NotebookInstanceName: NotebookInstanceName
    var SessionExpirationDurationInSeconds: js.UndefOr[SessionExpirationDurationInSeconds]
  }

  object CreatePresignedNotebookInstanceUrlInput {
    def apply(
      NotebookInstanceName: NotebookInstanceName,
      SessionExpirationDurationInSeconds: js.UndefOr[SessionExpirationDurationInSeconds] = js.undefined): CreatePresignedNotebookInstanceUrlInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceName" -> NotebookInstanceName.asInstanceOf[js.Any],
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
    var AlgorithmSpecification: AlgorithmSpecification
    var OutputDataConfig: OutputDataConfig
    var ResourceConfig: ResourceConfig
    var RoleArn: RoleArn
    var StoppingCondition: StoppingCondition
    var TrainingJobName: TrainingJobName
    var EnableNetworkIsolation: js.UndefOr[Boolean]
    var HyperParameters: js.UndefOr[HyperParameters]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var Tags: js.UndefOr[TagList]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object CreateTrainingJobRequest {
    def apply(
      AlgorithmSpecification: AlgorithmSpecification,
      OutputDataConfig: OutputDataConfig,
      ResourceConfig: ResourceConfig,
      RoleArn: RoleArn,
      StoppingCondition: StoppingCondition,
      TrainingJobName: TrainingJobName,
      EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
      HyperParameters: js.UndefOr[HyperParameters] = js.undefined,
      InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined): CreateTrainingJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlgorithmSpecification" -> AlgorithmSpecification.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any],
        "ResourceConfig" -> ResourceConfig.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "StoppingCondition" -> StoppingCondition.asInstanceOf[js.Any],
        "TrainingJobName" -> TrainingJobName.asInstanceOf[js.Any],
        "EnableNetworkIsolation" -> EnableNetworkIsolation.map { x => x.asInstanceOf[js.Any] },
        "HyperParameters" -> HyperParameters.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "VpcConfig" -> VpcConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrainingJobRequest]
    }
  }

  @js.native
  trait CreateTrainingJobResponse extends js.Object {
    var TrainingJobArn: TrainingJobArn
  }

  object CreateTrainingJobResponse {
    def apply(
      TrainingJobArn: TrainingJobArn): CreateTrainingJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrainingJobArn" -> TrainingJobArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrainingJobResponse]
    }
  }

  @js.native
  trait CreateTransformJobRequest extends js.Object {
    var ModelName: ModelName
    var TransformInput: TransformInput
    var TransformJobName: TransformJobName
    var TransformOutput: TransformOutput
    var TransformResources: TransformResources
    var BatchStrategy: js.UndefOr[BatchStrategy]
    var Environment: js.UndefOr[TransformEnvironmentMap]
    var MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms]
    var MaxPayloadInMB: js.UndefOr[MaxPayloadInMB]
    var Tags: js.UndefOr[TagList]
  }

  object CreateTransformJobRequest {
    def apply(
      ModelName: ModelName,
      TransformInput: TransformInput,
      TransformJobName: TransformJobName,
      TransformOutput: TransformOutput,
      TransformResources: TransformResources,
      BatchStrategy: js.UndefOr[BatchStrategy] = js.undefined,
      Environment: js.UndefOr[TransformEnvironmentMap] = js.undefined,
      MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms] = js.undefined,
      MaxPayloadInMB: js.UndefOr[MaxPayloadInMB] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateTransformJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelName" -> ModelName.asInstanceOf[js.Any],
        "TransformInput" -> TransformInput.asInstanceOf[js.Any],
        "TransformJobName" -> TransformJobName.asInstanceOf[js.Any],
        "TransformOutput" -> TransformOutput.asInstanceOf[js.Any],
        "TransformResources" -> TransformResources.asInstanceOf[js.Any],
        "BatchStrategy" -> BatchStrategy.map { x => x.asInstanceOf[js.Any] },
        "Environment" -> Environment.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrentTransforms" -> MaxConcurrentTransforms.map { x => x.asInstanceOf[js.Any] },
        "MaxPayloadInMB" -> MaxPayloadInMB.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTransformJobRequest]
    }
  }

  @js.native
  trait CreateTransformJobResponse extends js.Object {
    var TransformJobArn: TransformJobArn
  }

  object CreateTransformJobResponse {
    def apply(
      TransformJobArn: TransformJobArn): CreateTransformJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TransformJobArn" -> TransformJobArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTransformJobResponse]
    }
  }

  @js.native
  trait CreateWorkteamRequest extends js.Object {
    var Description: String200
    var MemberDefinitions: MemberDefinitions
    var WorkteamName: WorkteamName
    var Tags: js.UndefOr[TagList]
  }

  object CreateWorkteamRequest {
    def apply(
      Description: String200,
      MemberDefinitions: MemberDefinitions,
      WorkteamName: WorkteamName,
      Tags: js.UndefOr[TagList] = js.undefined): CreateWorkteamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.asInstanceOf[js.Any],
        "MemberDefinitions" -> MemberDefinitions.asInstanceOf[js.Any],
        "WorkteamName" -> WorkteamName.asInstanceOf[js.Any],
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
   * Describes the location of the channel data.
   */
  @js.native
  trait DataSource extends js.Object {
    var S3DataSource: S3DataSource
  }

  object DataSource {
    def apply(
      S3DataSource: S3DataSource): DataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3DataSource" -> S3DataSource.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DataSource]
    }
  }

  @js.native
  trait DeleteAlgorithmInput extends js.Object {
    var AlgorithmName: EntityName
  }

  object DeleteAlgorithmInput {
    def apply(
      AlgorithmName: EntityName): DeleteAlgorithmInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlgorithmName" -> AlgorithmName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAlgorithmInput]
    }
  }

  @js.native
  trait DeleteCodeRepositoryInput extends js.Object {
    var CodeRepositoryName: EntityName
  }

  object DeleteCodeRepositoryInput {
    def apply(
      CodeRepositoryName: EntityName): DeleteCodeRepositoryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeRepositoryName" -> CodeRepositoryName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCodeRepositoryInput]
    }
  }

  @js.native
  trait DeleteEndpointConfigInput extends js.Object {
    var EndpointConfigName: EndpointConfigName
  }

  object DeleteEndpointConfigInput {
    def apply(
      EndpointConfigName: EndpointConfigName): DeleteEndpointConfigInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointConfigName" -> EndpointConfigName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEndpointConfigInput]
    }
  }

  @js.native
  trait DeleteEndpointInput extends js.Object {
    var EndpointName: EndpointName
  }

  object DeleteEndpointInput {
    def apply(
      EndpointName: EndpointName): DeleteEndpointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointName" -> EndpointName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEndpointInput]
    }
  }

  @js.native
  trait DeleteModelInput extends js.Object {
    var ModelName: ModelName
  }

  object DeleteModelInput {
    def apply(
      ModelName: ModelName): DeleteModelInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelName" -> ModelName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteModelInput]
    }
  }

  @js.native
  trait DeleteModelPackageInput extends js.Object {
    var ModelPackageName: EntityName
  }

  object DeleteModelPackageInput {
    def apply(
      ModelPackageName: EntityName): DeleteModelPackageInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelPackageName" -> ModelPackageName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteModelPackageInput]
    }
  }

  @js.native
  trait DeleteNotebookInstanceInput extends js.Object {
    var NotebookInstanceName: NotebookInstanceName
  }

  object DeleteNotebookInstanceInput {
    def apply(
      NotebookInstanceName: NotebookInstanceName): DeleteNotebookInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceName" -> NotebookInstanceName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNotebookInstanceInput]
    }
  }

  @js.native
  trait DeleteNotebookInstanceLifecycleConfigInput extends js.Object {
    var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
  }

  object DeleteNotebookInstanceLifecycleConfigInput {
    def apply(
      NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName): DeleteNotebookInstanceLifecycleConfigInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceLifecycleConfigName" -> NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNotebookInstanceLifecycleConfigInput]
    }
  }

  @js.native
  trait DeleteTagsInput extends js.Object {
    var ResourceArn: ResourceArn
    var TagKeys: TagKeyList
  }

  object DeleteTagsInput {
    def apply(
      ResourceArn: ResourceArn,
      TagKeys: TagKeyList): DeleteTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var WorkteamName: WorkteamName
  }

  object DeleteWorkteamRequest {
    def apply(
      WorkteamName: WorkteamName): DeleteWorkteamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkteamName" -> WorkteamName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteWorkteamRequest]
    }
  }

  @js.native
  trait DeleteWorkteamResponse extends js.Object {
    var Success: Success
  }

  object DeleteWorkteamResponse {
    def apply(
      Success: Success): DeleteWorkteamResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Success" -> Success.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteWorkteamResponse]
    }
  }

  /**
   * Gets the Amazon EC2 Container Registry path of the docker image of the model that is hosted in this <a>ProductionVariant</a>.
   *  If you used the <code>registry/repository[:tag]</code> form to specify the image path of the primary container when you created the model hosted in this <code>ProductionVariant</code>, the path resolves to a path of the form <code>registry/repository[@digest]</code>. A digest is a hash value that identifies a specific version of an image. For information about Amazon ECR paths, see <a href="http://docs.aws.amazon.com//AmazonECR/latest/userguide/docker-pull-ecr-image.html">Pulling an Image</a> in the <i>Amazon ECR User Guide</i>.
   */
  @js.native
  trait DeployedImage extends js.Object {
    var ResolutionTime: js.UndefOr[Timestamp]
    var ResolvedImage: js.UndefOr[Image]
    var SpecifiedImage: js.UndefOr[Image]
  }

  object DeployedImage {
    def apply(
      ResolutionTime: js.UndefOr[Timestamp] = js.undefined,
      ResolvedImage: js.UndefOr[Image] = js.undefined,
      SpecifiedImage: js.UndefOr[Image] = js.undefined): DeployedImage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolutionTime" -> ResolutionTime.map { x => x.asInstanceOf[js.Any] },
        "ResolvedImage" -> ResolvedImage.map { x => x.asInstanceOf[js.Any] },
        "SpecifiedImage" -> SpecifiedImage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeployedImage]
    }
  }

  @js.native
  trait DescribeAlgorithmInput extends js.Object {
    var AlgorithmName: ArnOrName
  }

  object DescribeAlgorithmInput {
    def apply(
      AlgorithmName: ArnOrName): DescribeAlgorithmInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlgorithmName" -> AlgorithmName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAlgorithmInput]
    }
  }

  @js.native
  trait DescribeAlgorithmOutput extends js.Object {
    var AlgorithmArn: AlgorithmArn
    var AlgorithmName: EntityName
    var AlgorithmStatus: AlgorithmStatus
    var AlgorithmStatusDetails: AlgorithmStatusDetails
    var CreationTime: CreationTime
    var TrainingSpecification: TrainingSpecification
    var AlgorithmDescription: js.UndefOr[EntityDescription]
    var CertifyForMarketplace: js.UndefOr[CertifyForMarketplace]
    var InferenceSpecification: js.UndefOr[InferenceSpecification]
    var ProductId: js.UndefOr[ProductId]
    var ValidationSpecification: js.UndefOr[AlgorithmValidationSpecification]
  }

  object DescribeAlgorithmOutput {
    def apply(
      AlgorithmArn: AlgorithmArn,
      AlgorithmName: EntityName,
      AlgorithmStatus: AlgorithmStatus,
      AlgorithmStatusDetails: AlgorithmStatusDetails,
      CreationTime: CreationTime,
      TrainingSpecification: TrainingSpecification,
      AlgorithmDescription: js.UndefOr[EntityDescription] = js.undefined,
      CertifyForMarketplace: js.UndefOr[CertifyForMarketplace] = js.undefined,
      InferenceSpecification: js.UndefOr[InferenceSpecification] = js.undefined,
      ProductId: js.UndefOr[ProductId] = js.undefined,
      ValidationSpecification: js.UndefOr[AlgorithmValidationSpecification] = js.undefined): DescribeAlgorithmOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlgorithmArn" -> AlgorithmArn.asInstanceOf[js.Any],
        "AlgorithmName" -> AlgorithmName.asInstanceOf[js.Any],
        "AlgorithmStatus" -> AlgorithmStatus.asInstanceOf[js.Any],
        "AlgorithmStatusDetails" -> AlgorithmStatusDetails.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "TrainingSpecification" -> TrainingSpecification.asInstanceOf[js.Any],
        "AlgorithmDescription" -> AlgorithmDescription.map { x => x.asInstanceOf[js.Any] },
        "CertifyForMarketplace" -> CertifyForMarketplace.map { x => x.asInstanceOf[js.Any] },
        "InferenceSpecification" -> InferenceSpecification.map { x => x.asInstanceOf[js.Any] },
        "ProductId" -> ProductId.map { x => x.asInstanceOf[js.Any] },
        "ValidationSpecification" -> ValidationSpecification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAlgorithmOutput]
    }
  }

  @js.native
  trait DescribeCodeRepositoryInput extends js.Object {
    var CodeRepositoryName: EntityName
  }

  object DescribeCodeRepositoryInput {
    def apply(
      CodeRepositoryName: EntityName): DescribeCodeRepositoryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeRepositoryName" -> CodeRepositoryName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCodeRepositoryInput]
    }
  }

  @js.native
  trait DescribeCodeRepositoryOutput extends js.Object {
    var CodeRepositoryArn: CodeRepositoryArn
    var CodeRepositoryName: EntityName
    var CreationTime: CreationTime
    var LastModifiedTime: LastModifiedTime
    var GitConfig: js.UndefOr[GitConfig]
  }

  object DescribeCodeRepositoryOutput {
    def apply(
      CodeRepositoryArn: CodeRepositoryArn,
      CodeRepositoryName: EntityName,
      CreationTime: CreationTime,
      LastModifiedTime: LastModifiedTime,
      GitConfig: js.UndefOr[GitConfig] = js.undefined): DescribeCodeRepositoryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeRepositoryArn" -> CodeRepositoryArn.asInstanceOf[js.Any],
        "CodeRepositoryName" -> CodeRepositoryName.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "GitConfig" -> GitConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCodeRepositoryOutput]
    }
  }

  @js.native
  trait DescribeCompilationJobRequest extends js.Object {
    var CompilationJobName: EntityName
  }

  object DescribeCompilationJobRequest {
    def apply(
      CompilationJobName: EntityName): DescribeCompilationJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompilationJobName" -> CompilationJobName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCompilationJobRequest]
    }
  }

  @js.native
  trait DescribeCompilationJobResponse extends js.Object {
    var CompilationJobArn: CompilationJobArn
    var CompilationJobName: EntityName
    var CompilationJobStatus: CompilationJobStatus
    var CreationTime: CreationTime
    var FailureReason: FailureReason
    var InputConfig: InputConfig
    var LastModifiedTime: LastModifiedTime
    var ModelArtifacts: ModelArtifacts
    var OutputConfig: OutputConfig
    var RoleArn: RoleArn
    var StoppingCondition: StoppingCondition
    var CompilationEndTime: js.UndefOr[Timestamp]
    var CompilationStartTime: js.UndefOr[Timestamp]
  }

  object DescribeCompilationJobResponse {
    def apply(
      CompilationJobArn: CompilationJobArn,
      CompilationJobName: EntityName,
      CompilationJobStatus: CompilationJobStatus,
      CreationTime: CreationTime,
      FailureReason: FailureReason,
      InputConfig: InputConfig,
      LastModifiedTime: LastModifiedTime,
      ModelArtifacts: ModelArtifacts,
      OutputConfig: OutputConfig,
      RoleArn: RoleArn,
      StoppingCondition: StoppingCondition,
      CompilationEndTime: js.UndefOr[Timestamp] = js.undefined,
      CompilationStartTime: js.UndefOr[Timestamp] = js.undefined): DescribeCompilationJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompilationJobArn" -> CompilationJobArn.asInstanceOf[js.Any],
        "CompilationJobName" -> CompilationJobName.asInstanceOf[js.Any],
        "CompilationJobStatus" -> CompilationJobStatus.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "FailureReason" -> FailureReason.asInstanceOf[js.Any],
        "InputConfig" -> InputConfig.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "ModelArtifacts" -> ModelArtifacts.asInstanceOf[js.Any],
        "OutputConfig" -> OutputConfig.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "StoppingCondition" -> StoppingCondition.asInstanceOf[js.Any],
        "CompilationEndTime" -> CompilationEndTime.map { x => x.asInstanceOf[js.Any] },
        "CompilationStartTime" -> CompilationStartTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCompilationJobResponse]
    }
  }

  @js.native
  trait DescribeEndpointConfigInput extends js.Object {
    var EndpointConfigName: EndpointConfigName
  }

  object DescribeEndpointConfigInput {
    def apply(
      EndpointConfigName: EndpointConfigName): DescribeEndpointConfigInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointConfigName" -> EndpointConfigName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointConfigInput]
    }
  }

  @js.native
  trait DescribeEndpointConfigOutput extends js.Object {
    var CreationTime: Timestamp
    var EndpointConfigArn: EndpointConfigArn
    var EndpointConfigName: EndpointConfigName
    var ProductionVariants: ProductionVariantList
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object DescribeEndpointConfigOutput {
    def apply(
      CreationTime: Timestamp,
      EndpointConfigArn: EndpointConfigArn,
      EndpointConfigName: EndpointConfigName,
      ProductionVariants: ProductionVariantList,
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined): DescribeEndpointConfigOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "EndpointConfigArn" -> EndpointConfigArn.asInstanceOf[js.Any],
        "EndpointConfigName" -> EndpointConfigName.asInstanceOf[js.Any],
        "ProductionVariants" -> ProductionVariants.asInstanceOf[js.Any],
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointConfigOutput]
    }
  }

  @js.native
  trait DescribeEndpointInput extends js.Object {
    var EndpointName: EndpointName
  }

  object DescribeEndpointInput {
    def apply(
      EndpointName: EndpointName): DescribeEndpointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointName" -> EndpointName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointInput]
    }
  }

  @js.native
  trait DescribeEndpointOutput extends js.Object {
    var CreationTime: Timestamp
    var EndpointArn: EndpointArn
    var EndpointConfigName: EndpointConfigName
    var EndpointName: EndpointName
    var EndpointStatus: EndpointStatus
    var LastModifiedTime: Timestamp
    var FailureReason: js.UndefOr[FailureReason]
    var ProductionVariants: js.UndefOr[ProductionVariantSummaryList]
  }

  object DescribeEndpointOutput {
    def apply(
      CreationTime: Timestamp,
      EndpointArn: EndpointArn,
      EndpointConfigName: EndpointConfigName,
      EndpointName: EndpointName,
      EndpointStatus: EndpointStatus,
      LastModifiedTime: Timestamp,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      ProductionVariants: js.UndefOr[ProductionVariantSummaryList] = js.undefined): DescribeEndpointOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any],
        "EndpointConfigName" -> EndpointConfigName.asInstanceOf[js.Any],
        "EndpointName" -> EndpointName.asInstanceOf[js.Any],
        "EndpointStatus" -> EndpointStatus.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "ProductionVariants" -> ProductionVariants.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointOutput]
    }
  }

  @js.native
  trait DescribeHyperParameterTuningJobRequest extends js.Object {
    var HyperParameterTuningJobName: HyperParameterTuningJobName
  }

  object DescribeHyperParameterTuningJobRequest {
    def apply(
      HyperParameterTuningJobName: HyperParameterTuningJobName): DescribeHyperParameterTuningJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HyperParameterTuningJobName" -> HyperParameterTuningJobName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHyperParameterTuningJobRequest]
    }
  }

  @js.native
  trait DescribeHyperParameterTuningJobResponse extends js.Object {
    var CreationTime: Timestamp
    var HyperParameterTuningJobArn: HyperParameterTuningJobArn
    var HyperParameterTuningJobConfig: HyperParameterTuningJobConfig
    var HyperParameterTuningJobName: HyperParameterTuningJobName
    var HyperParameterTuningJobStatus: HyperParameterTuningJobStatus
    var ObjectiveStatusCounters: ObjectiveStatusCounters
    var TrainingJobDefinition: HyperParameterTrainingJobDefinition
    var TrainingJobStatusCounters: TrainingJobStatusCounters
    var BestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary]
    var FailureReason: js.UndefOr[FailureReason]
    var HyperParameterTuningEndTime: js.UndefOr[Timestamp]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var OverallBestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary]
    var WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig]
  }

  object DescribeHyperParameterTuningJobResponse {
    def apply(
      CreationTime: Timestamp,
      HyperParameterTuningJobArn: HyperParameterTuningJobArn,
      HyperParameterTuningJobConfig: HyperParameterTuningJobConfig,
      HyperParameterTuningJobName: HyperParameterTuningJobName,
      HyperParameterTuningJobStatus: HyperParameterTuningJobStatus,
      ObjectiveStatusCounters: ObjectiveStatusCounters,
      TrainingJobDefinition: HyperParameterTrainingJobDefinition,
      TrainingJobStatusCounters: TrainingJobStatusCounters,
      BestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary] = js.undefined,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      HyperParameterTuningEndTime: js.UndefOr[Timestamp] = js.undefined,
      LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
      OverallBestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary] = js.undefined,
      WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig] = js.undefined): DescribeHyperParameterTuningJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "HyperParameterTuningJobArn" -> HyperParameterTuningJobArn.asInstanceOf[js.Any],
        "HyperParameterTuningJobConfig" -> HyperParameterTuningJobConfig.asInstanceOf[js.Any],
        "HyperParameterTuningJobName" -> HyperParameterTuningJobName.asInstanceOf[js.Any],
        "HyperParameterTuningJobStatus" -> HyperParameterTuningJobStatus.asInstanceOf[js.Any],
        "ObjectiveStatusCounters" -> ObjectiveStatusCounters.asInstanceOf[js.Any],
        "TrainingJobDefinition" -> TrainingJobDefinition.asInstanceOf[js.Any],
        "TrainingJobStatusCounters" -> TrainingJobStatusCounters.asInstanceOf[js.Any],
        "BestTrainingJob" -> BestTrainingJob.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "HyperParameterTuningEndTime" -> HyperParameterTuningEndTime.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "OverallBestTrainingJob" -> OverallBestTrainingJob.map { x => x.asInstanceOf[js.Any] },
        "WarmStartConfig" -> WarmStartConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHyperParameterTuningJobResponse]
    }
  }

  @js.native
  trait DescribeLabelingJobRequest extends js.Object {
    var LabelingJobName: LabelingJobName
  }

  object DescribeLabelingJobRequest {
    def apply(
      LabelingJobName: LabelingJobName): DescribeLabelingJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LabelingJobName" -> LabelingJobName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLabelingJobRequest]
    }
  }

  @js.native
  trait DescribeLabelingJobResponse extends js.Object {
    var CreationTime: Timestamp
    var HumanTaskConfig: HumanTaskConfig
    var InputConfig: LabelingJobInputConfig
    var JobReferenceCode: JobReferenceCode
    var LabelCounters: LabelCounters
    var LabelingJobArn: LabelingJobArn
    var LabelingJobName: LabelingJobName
    var LabelingJobStatus: LabelingJobStatus
    var LastModifiedTime: Timestamp
    var OutputConfig: LabelingJobOutputConfig
    var RoleArn: RoleArn
    var FailureReason: js.UndefOr[FailureReason]
    var LabelAttributeName: js.UndefOr[LabelAttributeName]
    var LabelCategoryConfigS3Uri: js.UndefOr[S3Uri]
    var LabelingJobAlgorithmsConfig: js.UndefOr[LabelingJobAlgorithmsConfig]
    var LabelingJobOutput: js.UndefOr[LabelingJobOutput]
    var StoppingConditions: js.UndefOr[LabelingJobStoppingConditions]
    var Tags: js.UndefOr[TagList]
  }

  object DescribeLabelingJobResponse {
    def apply(
      CreationTime: Timestamp,
      HumanTaskConfig: HumanTaskConfig,
      InputConfig: LabelingJobInputConfig,
      JobReferenceCode: JobReferenceCode,
      LabelCounters: LabelCounters,
      LabelingJobArn: LabelingJobArn,
      LabelingJobName: LabelingJobName,
      LabelingJobStatus: LabelingJobStatus,
      LastModifiedTime: Timestamp,
      OutputConfig: LabelingJobOutputConfig,
      RoleArn: RoleArn,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      LabelAttributeName: js.UndefOr[LabelAttributeName] = js.undefined,
      LabelCategoryConfigS3Uri: js.UndefOr[S3Uri] = js.undefined,
      LabelingJobAlgorithmsConfig: js.UndefOr[LabelingJobAlgorithmsConfig] = js.undefined,
      LabelingJobOutput: js.UndefOr[LabelingJobOutput] = js.undefined,
      StoppingConditions: js.UndefOr[LabelingJobStoppingConditions] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): DescribeLabelingJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "HumanTaskConfig" -> HumanTaskConfig.asInstanceOf[js.Any],
        "InputConfig" -> InputConfig.asInstanceOf[js.Any],
        "JobReferenceCode" -> JobReferenceCode.asInstanceOf[js.Any],
        "LabelCounters" -> LabelCounters.asInstanceOf[js.Any],
        "LabelingJobArn" -> LabelingJobArn.asInstanceOf[js.Any],
        "LabelingJobName" -> LabelingJobName.asInstanceOf[js.Any],
        "LabelingJobStatus" -> LabelingJobStatus.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "OutputConfig" -> OutputConfig.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "LabelAttributeName" -> LabelAttributeName.map { x => x.asInstanceOf[js.Any] },
        "LabelCategoryConfigS3Uri" -> LabelCategoryConfigS3Uri.map { x => x.asInstanceOf[js.Any] },
        "LabelingJobAlgorithmsConfig" -> LabelingJobAlgorithmsConfig.map { x => x.asInstanceOf[js.Any] },
        "LabelingJobOutput" -> LabelingJobOutput.map { x => x.asInstanceOf[js.Any] },
        "StoppingConditions" -> StoppingConditions.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLabelingJobResponse]
    }
  }

  @js.native
  trait DescribeModelInput extends js.Object {
    var ModelName: ModelName
  }

  object DescribeModelInput {
    def apply(
      ModelName: ModelName): DescribeModelInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelName" -> ModelName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeModelInput]
    }
  }

  @js.native
  trait DescribeModelOutput extends js.Object {
    var CreationTime: Timestamp
    var ExecutionRoleArn: RoleArn
    var ModelArn: ModelArn
    var ModelName: ModelName
    var Containers: js.UndefOr[ContainerDefinitionList]
    var EnableNetworkIsolation: js.UndefOr[Boolean]
    var PrimaryContainer: js.UndefOr[ContainerDefinition]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object DescribeModelOutput {
    def apply(
      CreationTime: Timestamp,
      ExecutionRoleArn: RoleArn,
      ModelArn: ModelArn,
      ModelName: ModelName,
      Containers: js.UndefOr[ContainerDefinitionList] = js.undefined,
      EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
      PrimaryContainer: js.UndefOr[ContainerDefinition] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined): DescribeModelOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ExecutionRoleArn" -> ExecutionRoleArn.asInstanceOf[js.Any],
        "ModelArn" -> ModelArn.asInstanceOf[js.Any],
        "ModelName" -> ModelName.asInstanceOf[js.Any],
        "Containers" -> Containers.map { x => x.asInstanceOf[js.Any] },
        "EnableNetworkIsolation" -> EnableNetworkIsolation.map { x => x.asInstanceOf[js.Any] },
        "PrimaryContainer" -> PrimaryContainer.map { x => x.asInstanceOf[js.Any] },
        "VpcConfig" -> VpcConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeModelOutput]
    }
  }

  @js.native
  trait DescribeModelPackageInput extends js.Object {
    var ModelPackageName: ArnOrName
  }

  object DescribeModelPackageInput {
    def apply(
      ModelPackageName: ArnOrName): DescribeModelPackageInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelPackageName" -> ModelPackageName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeModelPackageInput]
    }
  }

  @js.native
  trait DescribeModelPackageOutput extends js.Object {
    var CreationTime: CreationTime
    var ModelPackageArn: ModelPackageArn
    var ModelPackageName: EntityName
    var ModelPackageStatus: ModelPackageStatus
    var ModelPackageStatusDetails: ModelPackageStatusDetails
    var CertifyForMarketplace: js.UndefOr[CertifyForMarketplace]
    var InferenceSpecification: js.UndefOr[InferenceSpecification]
    var ModelPackageDescription: js.UndefOr[EntityDescription]
    var SourceAlgorithmSpecification: js.UndefOr[SourceAlgorithmSpecification]
    var ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification]
  }

  object DescribeModelPackageOutput {
    def apply(
      CreationTime: CreationTime,
      ModelPackageArn: ModelPackageArn,
      ModelPackageName: EntityName,
      ModelPackageStatus: ModelPackageStatus,
      ModelPackageStatusDetails: ModelPackageStatusDetails,
      CertifyForMarketplace: js.UndefOr[CertifyForMarketplace] = js.undefined,
      InferenceSpecification: js.UndefOr[InferenceSpecification] = js.undefined,
      ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined,
      SourceAlgorithmSpecification: js.UndefOr[SourceAlgorithmSpecification] = js.undefined,
      ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification] = js.undefined): DescribeModelPackageOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ModelPackageArn" -> ModelPackageArn.asInstanceOf[js.Any],
        "ModelPackageName" -> ModelPackageName.asInstanceOf[js.Any],
        "ModelPackageStatus" -> ModelPackageStatus.asInstanceOf[js.Any],
        "ModelPackageStatusDetails" -> ModelPackageStatusDetails.asInstanceOf[js.Any],
        "CertifyForMarketplace" -> CertifyForMarketplace.map { x => x.asInstanceOf[js.Any] },
        "InferenceSpecification" -> InferenceSpecification.map { x => x.asInstanceOf[js.Any] },
        "ModelPackageDescription" -> ModelPackageDescription.map { x => x.asInstanceOf[js.Any] },
        "SourceAlgorithmSpecification" -> SourceAlgorithmSpecification.map { x => x.asInstanceOf[js.Any] },
        "ValidationSpecification" -> ValidationSpecification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeModelPackageOutput]
    }
  }

  @js.native
  trait DescribeNotebookInstanceInput extends js.Object {
    var NotebookInstanceName: NotebookInstanceName
  }

  object DescribeNotebookInstanceInput {
    def apply(
      NotebookInstanceName: NotebookInstanceName): DescribeNotebookInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceName" -> NotebookInstanceName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNotebookInstanceInput]
    }
  }

  @js.native
  trait DescribeNotebookInstanceLifecycleConfigInput extends js.Object {
    var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
  }

  object DescribeNotebookInstanceLifecycleConfigInput {
    def apply(
      NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName): DescribeNotebookInstanceLifecycleConfigInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceLifecycleConfigName" -> NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNotebookInstanceLifecycleConfigInput]
    }
  }

  @js.native
  trait DescribeNotebookInstanceLifecycleConfigOutput extends js.Object {
    var CreationTime: js.UndefOr[CreationTime]
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
    var NotebookInstanceLifecycleConfigArn: js.UndefOr[NotebookInstanceLifecycleConfigArn]
    var NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName]
    var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList]
    var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList]
  }

  object DescribeNotebookInstanceLifecycleConfigOutput {
    def apply(
      CreationTime: js.UndefOr[CreationTime] = js.undefined,
      LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined,
      NotebookInstanceLifecycleConfigArn: js.UndefOr[NotebookInstanceLifecycleConfigArn] = js.undefined,
      NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined,
      OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined,
      OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined): DescribeNotebookInstanceLifecycleConfigOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceLifecycleConfigArn" -> NotebookInstanceLifecycleConfigArn.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceLifecycleConfigName" -> NotebookInstanceLifecycleConfigName.map { x => x.asInstanceOf[js.Any] },
        "OnCreate" -> OnCreate.map { x => x.asInstanceOf[js.Any] },
        "OnStart" -> OnStart.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNotebookInstanceLifecycleConfigOutput]
    }
  }

  @js.native
  trait DescribeNotebookInstanceOutput extends js.Object {
    var AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes]
    var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls]
    var CreationTime: js.UndefOr[CreationTime]
    var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl]
    var DirectInternetAccess: js.UndefOr[DirectInternetAccess]
    var FailureReason: js.UndefOr[FailureReason]
    var InstanceType: js.UndefOr[InstanceType]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var NotebookInstanceArn: js.UndefOr[NotebookInstanceArn]
    var NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName]
    var NotebookInstanceName: js.UndefOr[NotebookInstanceName]
    var NotebookInstanceStatus: js.UndefOr[NotebookInstanceStatus]
    var RoleArn: js.UndefOr[RoleArn]
    var SecurityGroups: js.UndefOr[SecurityGroupIds]
    var SubnetId: js.UndefOr[SubnetId]
    var Url: js.UndefOr[NotebookInstanceUrl]
    var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB]
  }

  object DescribeNotebookInstanceOutput {
    def apply(
      AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes] = js.undefined,
      AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.undefined,
      CreationTime: js.UndefOr[CreationTime] = js.undefined,
      DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.undefined,
      DirectInternetAccess: js.UndefOr[DirectInternetAccess] = js.undefined,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined,
      NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined,
      NotebookInstanceArn: js.UndefOr[NotebookInstanceArn] = js.undefined,
      NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined,
      NotebookInstanceName: js.UndefOr[NotebookInstanceName] = js.undefined,
      NotebookInstanceStatus: js.UndefOr[NotebookInstanceStatus] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined,
      SecurityGroups: js.UndefOr[SecurityGroupIds] = js.undefined,
      SubnetId: js.UndefOr[SubnetId] = js.undefined,
      Url: js.UndefOr[NotebookInstanceUrl] = js.undefined,
      VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.undefined): DescribeNotebookInstanceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceleratorTypes" -> AcceleratorTypes.map { x => x.asInstanceOf[js.Any] },
        "AdditionalCodeRepositories" -> AdditionalCodeRepositories.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] },
        "DefaultCodeRepository" -> DefaultCodeRepository.map { x => x.asInstanceOf[js.Any] },
        "DirectInternetAccess" -> DirectInternetAccess.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceArn" -> NotebookInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceLifecycleConfigName" -> NotebookInstanceLifecycleConfigName.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceName" -> NotebookInstanceName.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceStatus" -> NotebookInstanceStatus.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] },
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] },
        "VolumeSizeInGB" -> VolumeSizeInGB.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNotebookInstanceOutput]
    }
  }

  @js.native
  trait DescribeSubscribedWorkteamRequest extends js.Object {
    var WorkteamArn: WorkteamArn
  }

  object DescribeSubscribedWorkteamRequest {
    def apply(
      WorkteamArn: WorkteamArn): DescribeSubscribedWorkteamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkteamArn" -> WorkteamArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSubscribedWorkteamRequest]
    }
  }

  @js.native
  trait DescribeSubscribedWorkteamResponse extends js.Object {
    var SubscribedWorkteam: SubscribedWorkteam
  }

  object DescribeSubscribedWorkteamResponse {
    def apply(
      SubscribedWorkteam: SubscribedWorkteam): DescribeSubscribedWorkteamResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscribedWorkteam" -> SubscribedWorkteam.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSubscribedWorkteamResponse]
    }
  }

  @js.native
  trait DescribeTrainingJobRequest extends js.Object {
    var TrainingJobName: TrainingJobName
  }

  object DescribeTrainingJobRequest {
    def apply(
      TrainingJobName: TrainingJobName): DescribeTrainingJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrainingJobName" -> TrainingJobName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTrainingJobRequest]
    }
  }

  @js.native
  trait DescribeTrainingJobResponse extends js.Object {
    var AlgorithmSpecification: AlgorithmSpecification
    var CreationTime: Timestamp
    var ModelArtifacts: ModelArtifacts
    var ResourceConfig: ResourceConfig
    var SecondaryStatus: SecondaryStatus
    var StoppingCondition: StoppingCondition
    var TrainingJobArn: TrainingJobArn
    var TrainingJobName: TrainingJobName
    var TrainingJobStatus: TrainingJobStatus
    var EnableNetworkIsolation: js.UndefOr[Boolean]
    var FailureReason: js.UndefOr[FailureReason]
    var FinalMetricDataList: js.UndefOr[FinalMetricDataList]
    var HyperParameters: js.UndefOr[HyperParameters]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var LabelingJobArn: js.UndefOr[LabelingJobArn]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var RoleArn: js.UndefOr[RoleArn]
    var SecondaryStatusTransitions: js.UndefOr[SecondaryStatusTransitions]
    var TrainingEndTime: js.UndefOr[Timestamp]
    var TrainingStartTime: js.UndefOr[Timestamp]
    var TuningJobArn: js.UndefOr[HyperParameterTuningJobArn]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object DescribeTrainingJobResponse {
    def apply(
      AlgorithmSpecification: AlgorithmSpecification,
      CreationTime: Timestamp,
      ModelArtifacts: ModelArtifacts,
      ResourceConfig: ResourceConfig,
      SecondaryStatus: SecondaryStatus,
      StoppingCondition: StoppingCondition,
      TrainingJobArn: TrainingJobArn,
      TrainingJobName: TrainingJobName,
      TrainingJobStatus: TrainingJobStatus,
      EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      FinalMetricDataList: js.UndefOr[FinalMetricDataList] = js.undefined,
      HyperParameters: js.UndefOr[HyperParameters] = js.undefined,
      InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
      LabelingJobArn: js.UndefOr[LabelingJobArn] = js.undefined,
      LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
      OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined,
      SecondaryStatusTransitions: js.UndefOr[SecondaryStatusTransitions] = js.undefined,
      TrainingEndTime: js.UndefOr[Timestamp] = js.undefined,
      TrainingStartTime: js.UndefOr[Timestamp] = js.undefined,
      TuningJobArn: js.UndefOr[HyperParameterTuningJobArn] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined): DescribeTrainingJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlgorithmSpecification" -> AlgorithmSpecification.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ModelArtifacts" -> ModelArtifacts.asInstanceOf[js.Any],
        "ResourceConfig" -> ResourceConfig.asInstanceOf[js.Any],
        "SecondaryStatus" -> SecondaryStatus.asInstanceOf[js.Any],
        "StoppingCondition" -> StoppingCondition.asInstanceOf[js.Any],
        "TrainingJobArn" -> TrainingJobArn.asInstanceOf[js.Any],
        "TrainingJobName" -> TrainingJobName.asInstanceOf[js.Any],
        "TrainingJobStatus" -> TrainingJobStatus.asInstanceOf[js.Any],
        "EnableNetworkIsolation" -> EnableNetworkIsolation.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "FinalMetricDataList" -> FinalMetricDataList.map { x => x.asInstanceOf[js.Any] },
        "HyperParameters" -> HyperParameters.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "LabelingJobArn" -> LabelingJobArn.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "OutputDataConfig" -> OutputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
        "SecondaryStatusTransitions" -> SecondaryStatusTransitions.map { x => x.asInstanceOf[js.Any] },
        "TrainingEndTime" -> TrainingEndTime.map { x => x.asInstanceOf[js.Any] },
        "TrainingStartTime" -> TrainingStartTime.map { x => x.asInstanceOf[js.Any] },
        "TuningJobArn" -> TuningJobArn.map { x => x.asInstanceOf[js.Any] },
        "VpcConfig" -> VpcConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTrainingJobResponse]
    }
  }

  @js.native
  trait DescribeTransformJobRequest extends js.Object {
    var TransformJobName: TransformJobName
  }

  object DescribeTransformJobRequest {
    def apply(
      TransformJobName: TransformJobName): DescribeTransformJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TransformJobName" -> TransformJobName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTransformJobRequest]
    }
  }

  @js.native
  trait DescribeTransformJobResponse extends js.Object {
    var CreationTime: Timestamp
    var ModelName: ModelName
    var TransformInput: TransformInput
    var TransformJobArn: TransformJobArn
    var TransformJobName: TransformJobName
    var TransformJobStatus: TransformJobStatus
    var TransformResources: TransformResources
    var BatchStrategy: js.UndefOr[BatchStrategy]
    var Environment: js.UndefOr[TransformEnvironmentMap]
    var FailureReason: js.UndefOr[FailureReason]
    var LabelingJobArn: js.UndefOr[LabelingJobArn]
    var MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms]
    var MaxPayloadInMB: js.UndefOr[MaxPayloadInMB]
    var TransformEndTime: js.UndefOr[Timestamp]
    var TransformOutput: js.UndefOr[TransformOutput]
    var TransformStartTime: js.UndefOr[Timestamp]
  }

  object DescribeTransformJobResponse {
    def apply(
      CreationTime: Timestamp,
      ModelName: ModelName,
      TransformInput: TransformInput,
      TransformJobArn: TransformJobArn,
      TransformJobName: TransformJobName,
      TransformJobStatus: TransformJobStatus,
      TransformResources: TransformResources,
      BatchStrategy: js.UndefOr[BatchStrategy] = js.undefined,
      Environment: js.UndefOr[TransformEnvironmentMap] = js.undefined,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      LabelingJobArn: js.UndefOr[LabelingJobArn] = js.undefined,
      MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms] = js.undefined,
      MaxPayloadInMB: js.UndefOr[MaxPayloadInMB] = js.undefined,
      TransformEndTime: js.UndefOr[Timestamp] = js.undefined,
      TransformOutput: js.UndefOr[TransformOutput] = js.undefined,
      TransformStartTime: js.UndefOr[Timestamp] = js.undefined): DescribeTransformJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ModelName" -> ModelName.asInstanceOf[js.Any],
        "TransformInput" -> TransformInput.asInstanceOf[js.Any],
        "TransformJobArn" -> TransformJobArn.asInstanceOf[js.Any],
        "TransformJobName" -> TransformJobName.asInstanceOf[js.Any],
        "TransformJobStatus" -> TransformJobStatus.asInstanceOf[js.Any],
        "TransformResources" -> TransformResources.asInstanceOf[js.Any],
        "BatchStrategy" -> BatchStrategy.map { x => x.asInstanceOf[js.Any] },
        "Environment" -> Environment.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "LabelingJobArn" -> LabelingJobArn.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrentTransforms" -> MaxConcurrentTransforms.map { x => x.asInstanceOf[js.Any] },
        "MaxPayloadInMB" -> MaxPayloadInMB.map { x => x.asInstanceOf[js.Any] },
        "TransformEndTime" -> TransformEndTime.map { x => x.asInstanceOf[js.Any] },
        "TransformOutput" -> TransformOutput.map { x => x.asInstanceOf[js.Any] },
        "TransformStartTime" -> TransformStartTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTransformJobResponse]
    }
  }

  @js.native
  trait DescribeWorkteamRequest extends js.Object {
    var WorkteamName: WorkteamName
  }

  object DescribeWorkteamRequest {
    def apply(
      WorkteamName: WorkteamName): DescribeWorkteamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkteamName" -> WorkteamName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkteamRequest]
    }
  }

  @js.native
  trait DescribeWorkteamResponse extends js.Object {
    var Workteam: Workteam
  }

  object DescribeWorkteamResponse {
    def apply(
      Workteam: Workteam): DescribeWorkteamResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Workteam" -> Workteam.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkteamResponse]
    }
  }

  /**
   * Specifies weight and capacity values for a production variant.
   */
  @js.native
  trait DesiredWeightAndCapacity extends js.Object {
    var VariantName: VariantName
    var DesiredInstanceCount: js.UndefOr[TaskCount]
    var DesiredWeight: js.UndefOr[VariantWeight]
  }

  object DesiredWeightAndCapacity {
    def apply(
      VariantName: VariantName,
      DesiredInstanceCount: js.UndefOr[TaskCount] = js.undefined,
      DesiredWeight: js.UndefOr[VariantWeight] = js.undefined): DesiredWeightAndCapacity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VariantName" -> VariantName.asInstanceOf[js.Any],
        "DesiredInstanceCount" -> DesiredInstanceCount.map { x => x.asInstanceOf[js.Any] },
        "DesiredWeight" -> DesiredWeight.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * Provides summary information for an endpoint configuration.
   */
  @js.native
  trait EndpointConfigSummary extends js.Object {
    var CreationTime: Timestamp
    var EndpointConfigArn: EndpointConfigArn
    var EndpointConfigName: EndpointConfigName
  }

  object EndpointConfigSummary {
    def apply(
      CreationTime: Timestamp,
      EndpointConfigArn: EndpointConfigArn,
      EndpointConfigName: EndpointConfigName): EndpointConfigSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "EndpointConfigArn" -> EndpointConfigArn.asInstanceOf[js.Any],
        "EndpointConfigName" -> EndpointConfigName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
   * Provides summary information for an endpoint.
   */
  @js.native
  trait EndpointSummary extends js.Object {
    var CreationTime: Timestamp
    var EndpointArn: EndpointArn
    var EndpointName: EndpointName
    var EndpointStatus: EndpointStatus
    var LastModifiedTime: Timestamp
  }

  object EndpointSummary {
    def apply(
      CreationTime: Timestamp,
      EndpointArn: EndpointArn,
      EndpointName: EndpointName,
      EndpointStatus: EndpointStatus,
      LastModifiedTime: Timestamp): EndpointSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any],
        "EndpointName" -> EndpointName.asInstanceOf[js.Any],
        "EndpointStatus" -> EndpointStatus.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EndpointSummary]
    }
  }

  /**
   * A conditional statement for a search expression that includes a Boolean operator, a resource property, and a value.
   *  If you don't specify an <code>Operator</code> and a <code>Value</code>, the filter searches for only the specified property. For example, defining a <code>Filter</code> for the <code>FailureReason</code> for the <code>TrainingJob</code> <code>Resource</code> searches for training job objects that have a value in the <code>FailureReason</code> field.
   *  If you specify a <code>Value</code>, but not an <code>Operator</code>, Amazon SageMaker uses the equals operator as a default.
   *  In search, there are several property types:
   *  <dl> <dt>Metrics</dt> <dd> To define a metric filter, enter a value using the form <code>"Metrics.&lt;name&gt;"</code>, where <code>&lt;name&gt;</code> is a metric name. For example, the following filter searches for training jobs with an <code>"accuracy"</code> metric greater than <code>"0.9"</code>:
   *  <code>{</code>
   *  <code>"Name": "Metrics.accuracy",</code>
   *  <code>"Operator": "GREATER_THAN",</code>
   *  <code>"Value": "0.9"</code>
   *  <code>}</code>
   *  </dd> <dt>HyperParameters</dt> <dd> To define a hyperparameter filter, enter a value with the form <code>"HyperParamters.&lt;name&gt;"</code>. Decimal hyperparameter values are treated as a decimal in a comparison if the specified <code>Value</code> is also a decimal value. If the specified <code>Value</code> is an integer, the decimal hyperparameter values are treated as integers. For example, the following filter is satisfied by training jobs with a <code>"learning_rate"</code> hyperparameter that is less than <code>"0.5"</code>:
   *  <code> {</code>
   *  <code> "Name": "HyperParameters.learning_rate",</code>
   *  <code> "Operator": "LESS_THAN",</code>
   *  <code> "Value": "0.5"</code>
   *  <code> }</code>
   *  </dd> <dt>Tags</dt> <dd> To define a tag filter, enter a value with the form <code>"Tags.&lt;key&gt;"</code>.
   *  </dd> </dl>
   */
  @js.native
  trait Filter extends js.Object {
    var Name: ResourcePropertyName
    var Operator: js.UndefOr[Operator]
    var Value: js.UndefOr[FilterValue]
  }

  object Filter {
    def apply(
      Name: ResourcePropertyName,
      Operator: js.UndefOr[Operator] = js.undefined,
      Value: js.UndefOr[FilterValue] = js.undefined): Filter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Operator" -> Operator.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Filter]
    }
  }

  /**
   * Shows the final value for the objective metric for a training job that was launched by a hyperparameter tuning job. You define the objective metric in the <code>HyperParameterTuningJobObjective</code> parameter of <a>HyperParameterTuningJobConfig</a>.
   */
  @js.native
  trait FinalHyperParameterTuningJobObjectiveMetric extends js.Object {
    var MetricName: MetricName
    var Value: MetricValue
    var Type: js.UndefOr[HyperParameterTuningJobObjectiveType]
  }

  object FinalHyperParameterTuningJobObjectiveMetric {
    def apply(
      MetricName: MetricName,
      Value: MetricValue,
      Type: js.UndefOr[HyperParameterTuningJobObjectiveType] = js.undefined): FinalHyperParameterTuningJobObjectiveMetric = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any],
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Resource: ResourceType
    var SuggestionQuery: js.UndefOr[SuggestionQuery]
  }

  object GetSearchSuggestionsRequest {
    def apply(
      Resource: ResourceType,
      SuggestionQuery: js.UndefOr[SuggestionQuery] = js.undefined): GetSearchSuggestionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Resource" -> Resource.asInstanceOf[js.Any],
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
   * Specifies configuration details for a git repository in your AWS account.
   */
  @js.native
  trait GitConfig extends js.Object {
    var RepositoryUrl: Url
    var Branch: js.UndefOr[Branch]
    var SecretArn: js.UndefOr[SecretArn]
  }

  object GitConfig {
    def apply(
      RepositoryUrl: Url,
      Branch: js.UndefOr[Branch] = js.undefined,
      SecretArn: js.UndefOr[SecretArn] = js.undefined): GitConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RepositoryUrl" -> RepositoryUrl.asInstanceOf[js.Any],
        "Branch" -> Branch.map { x => x.asInstanceOf[js.Any] },
        "SecretArn" -> SecretArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GitConfig]
    }
  }

  /**
   * Specifies configuration details for a git repository when the repository is updated.
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
   * Information required for human workers to complete a labeling task.
   */
  @js.native
  trait HumanTaskConfig extends js.Object {
    var AnnotationConsolidationConfig: AnnotationConsolidationConfig
    var NumberOfHumanWorkersPerDataObject: NumberOfHumanWorkersPerDataObject
    var PreHumanTaskLambdaArn: LambdaFunctionArn
    var TaskDescription: TaskDescription
    var TaskTimeLimitInSeconds: TaskTimeLimitInSeconds
    var TaskTitle: TaskTitle
    var UiConfig: UiConfig
    var WorkteamArn: WorkteamArn
    var MaxConcurrentTaskCount: js.UndefOr[MaxConcurrentTaskCount]
    var PublicWorkforceTaskPrice: js.UndefOr[PublicWorkforceTaskPrice]
    var TaskAvailabilityLifetimeInSeconds: js.UndefOr[TaskAvailabilityLifetimeInSeconds]
    var TaskKeywords: js.UndefOr[TaskKeywords]
  }

  object HumanTaskConfig {
    def apply(
      AnnotationConsolidationConfig: AnnotationConsolidationConfig,
      NumberOfHumanWorkersPerDataObject: NumberOfHumanWorkersPerDataObject,
      PreHumanTaskLambdaArn: LambdaFunctionArn,
      TaskDescription: TaskDescription,
      TaskTimeLimitInSeconds: TaskTimeLimitInSeconds,
      TaskTitle: TaskTitle,
      UiConfig: UiConfig,
      WorkteamArn: WorkteamArn,
      MaxConcurrentTaskCount: js.UndefOr[MaxConcurrentTaskCount] = js.undefined,
      PublicWorkforceTaskPrice: js.UndefOr[PublicWorkforceTaskPrice] = js.undefined,
      TaskAvailabilityLifetimeInSeconds: js.UndefOr[TaskAvailabilityLifetimeInSeconds] = js.undefined,
      TaskKeywords: js.UndefOr[TaskKeywords] = js.undefined): HumanTaskConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AnnotationConsolidationConfig" -> AnnotationConsolidationConfig.asInstanceOf[js.Any],
        "NumberOfHumanWorkersPerDataObject" -> NumberOfHumanWorkersPerDataObject.asInstanceOf[js.Any],
        "PreHumanTaskLambdaArn" -> PreHumanTaskLambdaArn.asInstanceOf[js.Any],
        "TaskDescription" -> TaskDescription.asInstanceOf[js.Any],
        "TaskTimeLimitInSeconds" -> TaskTimeLimitInSeconds.asInstanceOf[js.Any],
        "TaskTitle" -> TaskTitle.asInstanceOf[js.Any],
        "UiConfig" -> UiConfig.asInstanceOf[js.Any],
        "WorkteamArn" -> WorkteamArn.asInstanceOf[js.Any],
        "MaxConcurrentTaskCount" -> MaxConcurrentTaskCount.map { x => x.asInstanceOf[js.Any] },
        "PublicWorkforceTaskPrice" -> PublicWorkforceTaskPrice.map { x => x.asInstanceOf[js.Any] },
        "TaskAvailabilityLifetimeInSeconds" -> TaskAvailabilityLifetimeInSeconds.map { x => x.asInstanceOf[js.Any] },
        "TaskKeywords" -> TaskKeywords.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HumanTaskConfig]
    }
  }

  /**
   * Specifies which training algorithm to use for training jobs that a hyperparameter tuning job launches and the metrics to monitor.
   */
  @js.native
  trait HyperParameterAlgorithmSpecification extends js.Object {
    var TrainingInputMode: TrainingInputMode
    var AlgorithmName: js.UndefOr[ArnOrName]
    var MetricDefinitions: js.UndefOr[MetricDefinitionList]
    var TrainingImage: js.UndefOr[AlgorithmImage]
  }

  object HyperParameterAlgorithmSpecification {
    def apply(
      TrainingInputMode: TrainingInputMode,
      AlgorithmName: js.UndefOr[ArnOrName] = js.undefined,
      MetricDefinitions: js.UndefOr[MetricDefinitionList] = js.undefined,
      TrainingImage: js.UndefOr[AlgorithmImage] = js.undefined): HyperParameterAlgorithmSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrainingInputMode" -> TrainingInputMode.asInstanceOf[js.Any],
        "AlgorithmName" -> AlgorithmName.map { x => x.asInstanceOf[js.Any] },
        "MetricDefinitions" -> MetricDefinitions.map { x => x.asInstanceOf[js.Any] },
        "TrainingImage" -> TrainingImage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HyperParameterAlgorithmSpecification]
    }
  }

  /**
   * Defines a hyperparameter to be used by an algorithm.
   */
  @js.native
  trait HyperParameterSpecification extends js.Object {
    var Name: ParameterName
    var Type: ParameterType
    var DefaultValue: js.UndefOr[ParameterValue]
    var Description: js.UndefOr[EntityDescription]
    var IsRequired: js.UndefOr[Boolean]
    var IsTunable: js.UndefOr[Boolean]
    var Range: js.UndefOr[ParameterRange]
  }

  object HyperParameterSpecification {
    def apply(
      Name: ParameterName,
      Type: ParameterType,
      DefaultValue: js.UndefOr[ParameterValue] = js.undefined,
      Description: js.UndefOr[EntityDescription] = js.undefined,
      IsRequired: js.UndefOr[Boolean] = js.undefined,
      IsTunable: js.UndefOr[Boolean] = js.undefined,
      Range: js.UndefOr[ParameterRange] = js.undefined): HyperParameterSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any],
        "DefaultValue" -> DefaultValue.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "IsRequired" -> IsRequired.map { x => x.asInstanceOf[js.Any] },
        "IsTunable" -> IsTunable.map { x => x.asInstanceOf[js.Any] },
        "Range" -> Range.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HyperParameterSpecification]
    }
  }

  /**
   * Defines the training jobs launched by a hyperparameter tuning job.
   */
  @js.native
  trait HyperParameterTrainingJobDefinition extends js.Object {
    var AlgorithmSpecification: HyperParameterAlgorithmSpecification
    var OutputDataConfig: OutputDataConfig
    var ResourceConfig: ResourceConfig
    var RoleArn: RoleArn
    var StoppingCondition: StoppingCondition
    var EnableNetworkIsolation: js.UndefOr[Boolean]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var StaticHyperParameters: js.UndefOr[HyperParameters]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object HyperParameterTrainingJobDefinition {
    def apply(
      AlgorithmSpecification: HyperParameterAlgorithmSpecification,
      OutputDataConfig: OutputDataConfig,
      ResourceConfig: ResourceConfig,
      RoleArn: RoleArn,
      StoppingCondition: StoppingCondition,
      EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
      InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
      StaticHyperParameters: js.UndefOr[HyperParameters] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined): HyperParameterTrainingJobDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlgorithmSpecification" -> AlgorithmSpecification.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any],
        "ResourceConfig" -> ResourceConfig.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "StoppingCondition" -> StoppingCondition.asInstanceOf[js.Any],
        "EnableNetworkIsolation" -> EnableNetworkIsolation.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "StaticHyperParameters" -> StaticHyperParameters.map { x => x.asInstanceOf[js.Any] },
        "VpcConfig" -> VpcConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HyperParameterTrainingJobDefinition]
    }
  }

  /**
   * Specifies summary information about a training job.
   */
  @js.native
  trait HyperParameterTrainingJobSummary extends js.Object {
    var CreationTime: Timestamp
    var TrainingJobArn: TrainingJobArn
    var TrainingJobName: TrainingJobName
    var TrainingJobStatus: TrainingJobStatus
    var TunedHyperParameters: HyperParameters
    var FailureReason: js.UndefOr[FailureReason]
    var FinalHyperParameterTuningJobObjectiveMetric: js.UndefOr[FinalHyperParameterTuningJobObjectiveMetric]
    var ObjectiveStatus: js.UndefOr[ObjectiveStatus]
    var TrainingEndTime: js.UndefOr[Timestamp]
    var TrainingStartTime: js.UndefOr[Timestamp]
    var TuningJobName: js.UndefOr[HyperParameterTuningJobName]
  }

  object HyperParameterTrainingJobSummary {
    def apply(
      CreationTime: Timestamp,
      TrainingJobArn: TrainingJobArn,
      TrainingJobName: TrainingJobName,
      TrainingJobStatus: TrainingJobStatus,
      TunedHyperParameters: HyperParameters,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      FinalHyperParameterTuningJobObjectiveMetric: js.UndefOr[FinalHyperParameterTuningJobObjectiveMetric] = js.undefined,
      ObjectiveStatus: js.UndefOr[ObjectiveStatus] = js.undefined,
      TrainingEndTime: js.UndefOr[Timestamp] = js.undefined,
      TrainingStartTime: js.UndefOr[Timestamp] = js.undefined,
      TuningJobName: js.UndefOr[HyperParameterTuningJobName] = js.undefined): HyperParameterTrainingJobSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "TrainingJobArn" -> TrainingJobArn.asInstanceOf[js.Any],
        "TrainingJobName" -> TrainingJobName.asInstanceOf[js.Any],
        "TrainingJobStatus" -> TrainingJobStatus.asInstanceOf[js.Any],
        "TunedHyperParameters" -> TunedHyperParameters.asInstanceOf[js.Any],
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "FinalHyperParameterTuningJobObjectiveMetric" -> FinalHyperParameterTuningJobObjectiveMetric.map { x => x.asInstanceOf[js.Any] },
        "ObjectiveStatus" -> ObjectiveStatus.map { x => x.asInstanceOf[js.Any] },
        "TrainingEndTime" -> TrainingEndTime.map { x => x.asInstanceOf[js.Any] },
        "TrainingStartTime" -> TrainingStartTime.map { x => x.asInstanceOf[js.Any] },
        "TuningJobName" -> TuningJobName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HyperParameterTrainingJobSummary]
    }
  }

  /**
   * Configures a hyperparameter tuning job.
   */
  @js.native
  trait HyperParameterTuningJobConfig extends js.Object {
    var HyperParameterTuningJobObjective: HyperParameterTuningJobObjective
    var ParameterRanges: ParameterRanges
    var ResourceLimits: ResourceLimits
    var Strategy: HyperParameterTuningJobStrategyType
  }

  object HyperParameterTuningJobConfig {
    def apply(
      HyperParameterTuningJobObjective: HyperParameterTuningJobObjective,
      ParameterRanges: ParameterRanges,
      ResourceLimits: ResourceLimits,
      Strategy: HyperParameterTuningJobStrategyType): HyperParameterTuningJobConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HyperParameterTuningJobObjective" -> HyperParameterTuningJobObjective.asInstanceOf[js.Any],
        "ParameterRanges" -> ParameterRanges.asInstanceOf[js.Any],
        "ResourceLimits" -> ResourceLimits.asInstanceOf[js.Any],
        "Strategy" -> Strategy.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HyperParameterTuningJobConfig]
    }
  }

  /**
   * Defines the objective metric for a hyperparameter tuning job. Hyperparameter tuning uses the value of this metric to evaluate the training jobs it launches, and returns the training job that results in either the highest or lowest value for this metric, depending on the value you specify for the <code>Type</code> parameter.
   */
  @js.native
  trait HyperParameterTuningJobObjective extends js.Object {
    var MetricName: MetricName
    var Type: HyperParameterTuningJobObjectiveType
  }

  object HyperParameterTuningJobObjective {
    def apply(
      MetricName: MetricName,
      Type: HyperParameterTuningJobObjectiveType): HyperParameterTuningJobObjective = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
   * The strategy hyperparameter tuning uses to find the best combination of hyperparameters for your model. Currently, the only supported value is <code>Bayesian</code>.
   */
  object HyperParameterTuningJobStrategyTypeEnum {
    val Bayesian = "Bayesian"

    val values = IndexedSeq(Bayesian)
  }

  /**
   * Provides summary information about a hyperparameter tuning job.
   */
  @js.native
  trait HyperParameterTuningJobSummary extends js.Object {
    var CreationTime: Timestamp
    var HyperParameterTuningJobArn: HyperParameterTuningJobArn
    var HyperParameterTuningJobName: HyperParameterTuningJobName
    var HyperParameterTuningJobStatus: HyperParameterTuningJobStatus
    var ObjectiveStatusCounters: ObjectiveStatusCounters
    var Strategy: HyperParameterTuningJobStrategyType
    var TrainingJobStatusCounters: TrainingJobStatusCounters
    var HyperParameterTuningEndTime: js.UndefOr[Timestamp]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var ResourceLimits: js.UndefOr[ResourceLimits]
  }

  object HyperParameterTuningJobSummary {
    def apply(
      CreationTime: Timestamp,
      HyperParameterTuningJobArn: HyperParameterTuningJobArn,
      HyperParameterTuningJobName: HyperParameterTuningJobName,
      HyperParameterTuningJobStatus: HyperParameterTuningJobStatus,
      ObjectiveStatusCounters: ObjectiveStatusCounters,
      Strategy: HyperParameterTuningJobStrategyType,
      TrainingJobStatusCounters: TrainingJobStatusCounters,
      HyperParameterTuningEndTime: js.UndefOr[Timestamp] = js.undefined,
      LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
      ResourceLimits: js.UndefOr[ResourceLimits] = js.undefined): HyperParameterTuningJobSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "HyperParameterTuningJobArn" -> HyperParameterTuningJobArn.asInstanceOf[js.Any],
        "HyperParameterTuningJobName" -> HyperParameterTuningJobName.asInstanceOf[js.Any],
        "HyperParameterTuningJobStatus" -> HyperParameterTuningJobStatus.asInstanceOf[js.Any],
        "ObjectiveStatusCounters" -> ObjectiveStatusCounters.asInstanceOf[js.Any],
        "Strategy" -> Strategy.asInstanceOf[js.Any],
        "TrainingJobStatusCounters" -> TrainingJobStatusCounters.asInstanceOf[js.Any],
        "HyperParameterTuningEndTime" -> HyperParameterTuningEndTime.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "ResourceLimits" -> ResourceLimits.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HyperParameterTuningJobSummary]
    }
  }

  /**
   * Specifies the configuration for a hyperparameter tuning job that uses one or more previous hyperparameter tuning jobs as a starting point. The results of previous tuning jobs are used to inform which combinations of hyperparameters to search over in the new tuning job.
   *  All training jobs launched by the new hyperparameter tuning job are evaluated by using the objective metric, and the training job that performs the best is compared to the best training jobs from the parent tuning jobs. From these, the training job that performs the best as measured by the objective metric is returned as the overall best training job.
   *
   * '''Note:'''All training jobs launched by parent hyperparameter tuning jobs and the new hyperparameter tuning jobs count against the limit of training jobs for the tuning job.
   */
  @js.native
  trait HyperParameterTuningJobWarmStartConfig extends js.Object {
    var ParentHyperParameterTuningJobs: ParentHyperParameterTuningJobs
    var WarmStartType: HyperParameterTuningJobWarmStartType
  }

  object HyperParameterTuningJobWarmStartConfig {
    def apply(
      ParentHyperParameterTuningJobs: ParentHyperParameterTuningJobs,
      WarmStartType: HyperParameterTuningJobWarmStartType): HyperParameterTuningJobWarmStartConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParentHyperParameterTuningJobs" -> ParentHyperParameterTuningJobs.asInstanceOf[js.Any],
        "WarmStartType" -> WarmStartType.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HyperParameterTuningJobWarmStartConfig]
    }
  }

  object HyperParameterTuningJobWarmStartTypeEnum {
    val IdenticalDataAndAlgorithm = "IdenticalDataAndAlgorithm"
    val TransferLearning = "TransferLearning"

    val values = IndexedSeq(IdenticalDataAndAlgorithm, TransferLearning)
  }

  /**
   * Defines how to perform inference generation after a training job is run.
   */
  @js.native
  trait InferenceSpecification extends js.Object {
    var Containers: ModelPackageContainerDefinitionList
    var SupportedContentTypes: ContentTypes
    var SupportedRealtimeInferenceInstanceTypes: RealtimeInferenceInstanceTypes
    var SupportedResponseMIMETypes: ResponseMIMETypes
    var SupportedTransformInstanceTypes: TransformInstanceTypes
  }

  object InferenceSpecification {
    def apply(
      Containers: ModelPackageContainerDefinitionList,
      SupportedContentTypes: ContentTypes,
      SupportedRealtimeInferenceInstanceTypes: RealtimeInferenceInstanceTypes,
      SupportedResponseMIMETypes: ResponseMIMETypes,
      SupportedTransformInstanceTypes: TransformInstanceTypes): InferenceSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Containers" -> Containers.asInstanceOf[js.Any],
        "SupportedContentTypes" -> SupportedContentTypes.asInstanceOf[js.Any],
        "SupportedRealtimeInferenceInstanceTypes" -> SupportedRealtimeInferenceInstanceTypes.asInstanceOf[js.Any],
        "SupportedResponseMIMETypes" -> SupportedResponseMIMETypes.asInstanceOf[js.Any],
        "SupportedTransformInstanceTypes" -> SupportedTransformInstanceTypes.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InferenceSpecification]
    }
  }

  /**
   * Contains information about the location of input model artifacts, the name and shape of the expected data inputs, and the framework in which the model was trained.
   */
  @js.native
  trait InputConfig extends js.Object {
    var DataInputConfig: DataInputConfig
    var Framework: Framework
    var S3Uri: S3Uri
  }

  object InputConfig {
    def apply(
      DataInputConfig: DataInputConfig,
      Framework: Framework,
      S3Uri: S3Uri): InputConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataInputConfig" -> DataInputConfig.asInstanceOf[js.Any],
        "Framework" -> Framework.asInstanceOf[js.Any],
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
   * For a hyperparameter of the integer type, specifies the range that a hyperparameter tuning job searches.
   */
  @js.native
  trait IntegerParameterRange extends js.Object {
    var MaxValue: ParameterValue
    var MinValue: ParameterValue
    var Name: ParameterKey
  }

  object IntegerParameterRange {
    def apply(
      MaxValue: ParameterValue,
      MinValue: ParameterValue,
      Name: ParameterKey): IntegerParameterRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxValue" -> MaxValue.asInstanceOf[js.Any],
        "MinValue" -> MinValue.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IntegerParameterRange]
    }
  }

  /**
   * Defines the possible values for an integer hyperparameter.
   */
  @js.native
  trait IntegerParameterRangeSpecification extends js.Object {
    var MaxValue: ParameterValue
    var MinValue: ParameterValue
  }

  object IntegerParameterRangeSpecification {
    def apply(
      MaxValue: ParameterValue,
      MinValue: ParameterValue): IntegerParameterRangeSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxValue" -> MaxValue.asInstanceOf[js.Any],
        "MinValue" -> MinValue.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IntegerParameterRangeSpecification]
    }
  }

  /**
   * Provides a breakdown of the number of objects labeled.
   */
  @js.native
  trait LabelCounters extends js.Object {
    var FailedNonRetryableError: js.UndefOr[LabelCounter]
    var HumanLabeled: js.UndefOr[LabelCounter]
    var MachineLabeled: js.UndefOr[LabelCounter]
    var TotalLabeled: js.UndefOr[LabelCounter]
    var Unlabeled: js.UndefOr[LabelCounter]
  }

  object LabelCounters {
    def apply(
      FailedNonRetryableError: js.UndefOr[LabelCounter] = js.undefined,
      HumanLabeled: js.UndefOr[LabelCounter] = js.undefined,
      MachineLabeled: js.UndefOr[LabelCounter] = js.undefined,
      TotalLabeled: js.UndefOr[LabelCounter] = js.undefined,
      Unlabeled: js.UndefOr[LabelCounter] = js.undefined): LabelCounters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedNonRetryableError" -> FailedNonRetryableError.map { x => x.asInstanceOf[js.Any] },
        "HumanLabeled" -> HumanLabeled.map { x => x.asInstanceOf[js.Any] },
        "MachineLabeled" -> MachineLabeled.map { x => x.asInstanceOf[js.Any] },
        "TotalLabeled" -> TotalLabeled.map { x => x.asInstanceOf[js.Any] },
        "Unlabeled" -> Unlabeled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelCounters]
    }
  }

  /**
   * Provides counts for human-labeled tasks in the labeling job.
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
   * Provides configuration information for auto-labeling of your data objects. A <code>LabelingJobAlgorithmsConfig</code> object must be supplied in order to use auto-labeling.
   */
  @js.native
  trait LabelingJobAlgorithmsConfig extends js.Object {
    var LabelingJobAlgorithmSpecificationArn: LabelingJobAlgorithmSpecificationArn
    var InitialActiveLearningModelArn: js.UndefOr[ModelArn]
    var LabelingJobResourceConfig: js.UndefOr[LabelingJobResourceConfig]
  }

  object LabelingJobAlgorithmsConfig {
    def apply(
      LabelingJobAlgorithmSpecificationArn: LabelingJobAlgorithmSpecificationArn,
      InitialActiveLearningModelArn: js.UndefOr[ModelArn] = js.undefined,
      LabelingJobResourceConfig: js.UndefOr[LabelingJobResourceConfig] = js.undefined): LabelingJobAlgorithmsConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LabelingJobAlgorithmSpecificationArn" -> LabelingJobAlgorithmSpecificationArn.asInstanceOf[js.Any],
        "InitialActiveLearningModelArn" -> InitialActiveLearningModelArn.map { x => x.asInstanceOf[js.Any] },
        "LabelingJobResourceConfig" -> LabelingJobResourceConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelingJobAlgorithmsConfig]
    }
  }

  /**
   * Attributes of the data specified by the customer. Use these to describe the data to be labeled.
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
   * Provides information about the location of input data.
   */
  @js.native
  trait LabelingJobDataSource extends js.Object {
    var S3DataSource: LabelingJobS3DataSource
  }

  object LabelingJobDataSource {
    def apply(
      S3DataSource: LabelingJobS3DataSource): LabelingJobDataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3DataSource" -> S3DataSource.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelingJobDataSource]
    }
  }

  /**
   * Provides summary information for a work team.
   */
  @js.native
  trait LabelingJobForWorkteamSummary extends js.Object {
    var CreationTime: Timestamp
    var JobReferenceCode: JobReferenceCode
    var WorkRequesterAccountId: AccountId
    var LabelCounters: js.UndefOr[LabelCountersForWorkteam]
    var LabelingJobName: js.UndefOr[LabelingJobName]
  }

  object LabelingJobForWorkteamSummary {
    def apply(
      CreationTime: Timestamp,
      JobReferenceCode: JobReferenceCode,
      WorkRequesterAccountId: AccountId,
      LabelCounters: js.UndefOr[LabelCountersForWorkteam] = js.undefined,
      LabelingJobName: js.UndefOr[LabelingJobName] = js.undefined): LabelingJobForWorkteamSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "JobReferenceCode" -> JobReferenceCode.asInstanceOf[js.Any],
        "WorkRequesterAccountId" -> WorkRequesterAccountId.asInstanceOf[js.Any],
        "LabelCounters" -> LabelCounters.map { x => x.asInstanceOf[js.Any] },
        "LabelingJobName" -> LabelingJobName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelingJobForWorkteamSummary]
    }
  }

  /**
   * Input configuration information for a labeling job.
   */
  @js.native
  trait LabelingJobInputConfig extends js.Object {
    var DataSource: LabelingJobDataSource
    var DataAttributes: js.UndefOr[LabelingJobDataAttributes]
  }

  object LabelingJobInputConfig {
    def apply(
      DataSource: LabelingJobDataSource,
      DataAttributes: js.UndefOr[LabelingJobDataAttributes] = js.undefined): LabelingJobInputConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataSource" -> DataSource.asInstanceOf[js.Any],
        "DataAttributes" -> DataAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelingJobInputConfig]
    }
  }

  /**
   * Specifies the location of the output produced by the labeling job.
   */
  @js.native
  trait LabelingJobOutput extends js.Object {
    var OutputDatasetS3Uri: S3Uri
    var FinalActiveLearningModelArn: js.UndefOr[ModelArn]
  }

  object LabelingJobOutput {
    def apply(
      OutputDatasetS3Uri: S3Uri,
      FinalActiveLearningModelArn: js.UndefOr[ModelArn] = js.undefined): LabelingJobOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OutputDatasetS3Uri" -> OutputDatasetS3Uri.asInstanceOf[js.Any],
        "FinalActiveLearningModelArn" -> FinalActiveLearningModelArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelingJobOutput]
    }
  }

  /**
   * Output configuration information for a labeling job.
   */
  @js.native
  trait LabelingJobOutputConfig extends js.Object {
    var S3OutputPath: S3Uri
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object LabelingJobOutputConfig {
    def apply(
      S3OutputPath: S3Uri,
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined): LabelingJobOutputConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3OutputPath" -> S3OutputPath.asInstanceOf[js.Any],
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelingJobOutputConfig]
    }
  }

  /**
   * Provides configuration information for labeling jobs.
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
   * The Amazon S3 location of the input data objects.
   */
  @js.native
  trait LabelingJobS3DataSource extends js.Object {
    var ManifestS3Uri: S3Uri
  }

  object LabelingJobS3DataSource {
    def apply(
      ManifestS3Uri: S3Uri): LabelingJobS3DataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ManifestS3Uri" -> ManifestS3Uri.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
   * A set of conditions for stopping a labeling job. If any of the conditions are met, the job is automatically stopped. You can use these conditions to control the cost of data labeling.
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
   * Provides summary information about a labeling job.
   */
  @js.native
  trait LabelingJobSummary extends js.Object {
    var CreationTime: Timestamp
    var LabelCounters: LabelCounters
    var LabelingJobArn: LabelingJobArn
    var LabelingJobName: LabelingJobName
    var LabelingJobStatus: LabelingJobStatus
    var LastModifiedTime: Timestamp
    var PreHumanTaskLambdaArn: LambdaFunctionArn
    var WorkteamArn: WorkteamArn
    var AnnotationConsolidationLambdaArn: js.UndefOr[LambdaFunctionArn]
    var FailureReason: js.UndefOr[FailureReason]
    var InputConfig: js.UndefOr[LabelingJobInputConfig]
    var LabelingJobOutput: js.UndefOr[LabelingJobOutput]
  }

  object LabelingJobSummary {
    def apply(
      CreationTime: Timestamp,
      LabelCounters: LabelCounters,
      LabelingJobArn: LabelingJobArn,
      LabelingJobName: LabelingJobName,
      LabelingJobStatus: LabelingJobStatus,
      LastModifiedTime: Timestamp,
      PreHumanTaskLambdaArn: LambdaFunctionArn,
      WorkteamArn: WorkteamArn,
      AnnotationConsolidationLambdaArn: js.UndefOr[LambdaFunctionArn] = js.undefined,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      InputConfig: js.UndefOr[LabelingJobInputConfig] = js.undefined,
      LabelingJobOutput: js.UndefOr[LabelingJobOutput] = js.undefined): LabelingJobSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "LabelCounters" -> LabelCounters.asInstanceOf[js.Any],
        "LabelingJobArn" -> LabelingJobArn.asInstanceOf[js.Any],
        "LabelingJobName" -> LabelingJobName.asInstanceOf[js.Any],
        "LabelingJobStatus" -> LabelingJobStatus.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "PreHumanTaskLambdaArn" -> PreHumanTaskLambdaArn.asInstanceOf[js.Any],
        "WorkteamArn" -> WorkteamArn.asInstanceOf[js.Any],
        "AnnotationConsolidationLambdaArn" -> AnnotationConsolidationLambdaArn.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "InputConfig" -> InputConfig.map { x => x.asInstanceOf[js.Any] },
        "LabelingJobOutput" -> LabelingJobOutput.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelingJobSummary]
    }
  }

  @js.native
  trait ListAlgorithmsInput extends js.Object {
    var CreationTimeAfter: js.UndefOr[CreationTime]
    var CreationTimeBefore: js.UndefOr[CreationTime]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[NameContains]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[AlgorithmSortBy]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListAlgorithmsInput {
    def apply(
      CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined,
      CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NameContains: js.UndefOr[NameContains] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      SortBy: js.UndefOr[AlgorithmSortBy] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined): ListAlgorithmsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAlgorithmsInput]
    }
  }

  @js.native
  trait ListAlgorithmsOutput extends js.Object {
    var AlgorithmSummaryList: AlgorithmSummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAlgorithmsOutput {
    def apply(
      AlgorithmSummaryList: AlgorithmSummaryList,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListAlgorithmsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlgorithmSummaryList" -> AlgorithmSummaryList.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAlgorithmsOutput]
    }
  }

  @js.native
  trait ListCodeRepositoriesInput extends js.Object {
    var CreationTimeAfter: js.UndefOr[CreationTime]
    var CreationTimeBefore: js.UndefOr[CreationTime]
    var LastModifiedTimeAfter: js.UndefOr[Timestamp]
    var LastModifiedTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[CodeRepositoryNameContains]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[CodeRepositorySortBy]
    var SortOrder: js.UndefOr[CodeRepositorySortOrder]
  }

  object ListCodeRepositoriesInput {
    def apply(
      CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined,
      CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined,
      LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined,
      LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NameContains: js.UndefOr[CodeRepositoryNameContains] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      SortBy: js.UndefOr[CodeRepositorySortBy] = js.undefined,
      SortOrder: js.UndefOr[CodeRepositorySortOrder] = js.undefined): ListCodeRepositoriesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeAfter" -> LastModifiedTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeBefore" -> LastModifiedTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCodeRepositoriesInput]
    }
  }

  @js.native
  trait ListCodeRepositoriesOutput extends js.Object {
    var CodeRepositorySummaryList: CodeRepositorySummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCodeRepositoriesOutput {
    def apply(
      CodeRepositorySummaryList: CodeRepositorySummaryList,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListCodeRepositoriesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeRepositorySummaryList" -> CodeRepositorySummaryList.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCodeRepositoriesOutput]
    }
  }

  @js.native
  trait ListCompilationJobsRequest extends js.Object {
    var CreationTimeAfter: js.UndefOr[CreationTime]
    var CreationTimeBefore: js.UndefOr[CreationTime]
    var LastModifiedTimeAfter: js.UndefOr[LastModifiedTime]
    var LastModifiedTimeBefore: js.UndefOr[LastModifiedTime]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[NameContains]
    var NextToken: js.UndefOr[NextToken]
    var StatusEquals: js.UndefOr[CompilationJobStatus]
  }

  object ListCompilationJobsRequest {
    def apply(
      CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined,
      CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined,
      LastModifiedTimeAfter: js.UndefOr[LastModifiedTime] = js.undefined,
      LastModifiedTimeBefore: js.UndefOr[LastModifiedTime] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NameContains: js.UndefOr[NameContains] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      StatusEquals: js.UndefOr[CompilationJobStatus] = js.undefined): ListCompilationJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeAfter" -> LastModifiedTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeBefore" -> LastModifiedTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "StatusEquals" -> StatusEquals.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCompilationJobsRequest]
    }
  }

  @js.native
  trait ListCompilationJobsResponse extends js.Object {
    var CompilationJobSummaries: CompilationJobSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCompilationJobsResponse {
    def apply(
      CompilationJobSummaries: CompilationJobSummaries,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListCompilationJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompilationJobSummaries" -> CompilationJobSummaries.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCompilationJobsResponse]
    }
  }

  @js.native
  trait ListEndpointConfigsInput extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[EndpointConfigNameContains]
    var NextToken: js.UndefOr[PaginationToken]
    var SortBy: js.UndefOr[EndpointConfigSortKey]
    var SortOrder: js.UndefOr[OrderKey]
  }

  object ListEndpointConfigsInput {
    def apply(
      CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
      CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NameContains: js.UndefOr[EndpointConfigNameContains] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      SortBy: js.UndefOr[EndpointConfigSortKey] = js.undefined,
      SortOrder: js.UndefOr[OrderKey] = js.undefined): ListEndpointConfigsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEndpointConfigsInput]
    }
  }

  @js.native
  trait ListEndpointConfigsOutput extends js.Object {
    var EndpointConfigs: EndpointConfigSummaryList
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListEndpointConfigsOutput {
    def apply(
      EndpointConfigs: EndpointConfigSummaryList,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListEndpointConfigsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointConfigs" -> EndpointConfigs.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEndpointConfigsOutput]
    }
  }

  @js.native
  trait ListEndpointsInput extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var LastModifiedTimeAfter: js.UndefOr[Timestamp]
    var LastModifiedTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[EndpointNameContains]
    var NextToken: js.UndefOr[PaginationToken]
    var SortBy: js.UndefOr[EndpointSortKey]
    var SortOrder: js.UndefOr[OrderKey]
    var StatusEquals: js.UndefOr[EndpointStatus]
  }

  object ListEndpointsInput {
    def apply(
      CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
      CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined,
      LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NameContains: js.UndefOr[EndpointNameContains] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      SortBy: js.UndefOr[EndpointSortKey] = js.undefined,
      SortOrder: js.UndefOr[OrderKey] = js.undefined,
      StatusEquals: js.UndefOr[EndpointStatus] = js.undefined): ListEndpointsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeAfter" -> LastModifiedTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeBefore" -> LastModifiedTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "StatusEquals" -> StatusEquals.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEndpointsInput]
    }
  }

  @js.native
  trait ListEndpointsOutput extends js.Object {
    var Endpoints: EndpointSummaryList
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListEndpointsOutput {
    def apply(
      Endpoints: EndpointSummaryList,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListEndpointsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Endpoints" -> Endpoints.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEndpointsOutput]
    }
  }

  @js.native
  trait ListHyperParameterTuningJobsRequest extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var LastModifiedTimeAfter: js.UndefOr[Timestamp]
    var LastModifiedTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[NameContains]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[HyperParameterTuningJobSortByOptions]
    var SortOrder: js.UndefOr[SortOrder]
    var StatusEquals: js.UndefOr[HyperParameterTuningJobStatus]
  }

  object ListHyperParameterTuningJobsRequest {
    def apply(
      CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
      CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined,
      LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NameContains: js.UndefOr[NameContains] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      SortBy: js.UndefOr[HyperParameterTuningJobSortByOptions] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined,
      StatusEquals: js.UndefOr[HyperParameterTuningJobStatus] = js.undefined): ListHyperParameterTuningJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeAfter" -> LastModifiedTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeBefore" -> LastModifiedTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "StatusEquals" -> StatusEquals.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHyperParameterTuningJobsRequest]
    }
  }

  @js.native
  trait ListHyperParameterTuningJobsResponse extends js.Object {
    var HyperParameterTuningJobSummaries: HyperParameterTuningJobSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHyperParameterTuningJobsResponse {
    def apply(
      HyperParameterTuningJobSummaries: HyperParameterTuningJobSummaries,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListHyperParameterTuningJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HyperParameterTuningJobSummaries" -> HyperParameterTuningJobSummaries.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHyperParameterTuningJobsResponse]
    }
  }

  @js.native
  trait ListLabelingJobsForWorkteamRequest extends js.Object {
    var WorkteamArn: WorkteamArn
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var JobReferenceCodeContains: js.UndefOr[JobReferenceCodeContains]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[ListLabelingJobsForWorkteamSortByOptions]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListLabelingJobsForWorkteamRequest {
    def apply(
      WorkteamArn: WorkteamArn,
      CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
      CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      JobReferenceCodeContains: js.UndefOr[JobReferenceCodeContains] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      SortBy: js.UndefOr[ListLabelingJobsForWorkteamSortByOptions] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined): ListLabelingJobsForWorkteamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkteamArn" -> WorkteamArn.asInstanceOf[js.Any],
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "JobReferenceCodeContains" -> JobReferenceCodeContains.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLabelingJobsForWorkteamRequest]
    }
  }

  @js.native
  trait ListLabelingJobsForWorkteamResponse extends js.Object {
    var LabelingJobSummaryList: LabelingJobForWorkteamSummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLabelingJobsForWorkteamResponse {
    def apply(
      LabelingJobSummaryList: LabelingJobForWorkteamSummaryList,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListLabelingJobsForWorkteamResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LabelingJobSummaryList" -> LabelingJobSummaryList.asInstanceOf[js.Any],
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
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var LastModifiedTimeAfter: js.UndefOr[Timestamp]
    var LastModifiedTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[NameContains]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[SortBy]
    var SortOrder: js.UndefOr[SortOrder]
    var StatusEquals: js.UndefOr[LabelingJobStatus]
  }

  object ListLabelingJobsRequest {
    def apply(
      CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
      CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined,
      LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NameContains: js.UndefOr[NameContains] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      SortBy: js.UndefOr[SortBy] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined,
      StatusEquals: js.UndefOr[LabelingJobStatus] = js.undefined): ListLabelingJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeAfter" -> LastModifiedTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeBefore" -> LastModifiedTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "StatusEquals" -> StatusEquals.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var CreationTimeAfter: js.UndefOr[CreationTime]
    var CreationTimeBefore: js.UndefOr[CreationTime]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[NameContains]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[ModelPackageSortBy]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListModelPackagesInput {
    def apply(
      CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined,
      CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NameContains: js.UndefOr[NameContains] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      SortBy: js.UndefOr[ModelPackageSortBy] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined): ListModelPackagesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListModelPackagesInput]
    }
  }

  @js.native
  trait ListModelPackagesOutput extends js.Object {
    var ModelPackageSummaryList: ModelPackageSummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListModelPackagesOutput {
    def apply(
      ModelPackageSummaryList: ModelPackageSummaryList,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListModelPackagesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelPackageSummaryList" -> ModelPackageSummaryList.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListModelPackagesOutput]
    }
  }

  @js.native
  trait ListModelsInput extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[ModelNameContains]
    var NextToken: js.UndefOr[PaginationToken]
    var SortBy: js.UndefOr[ModelSortKey]
    var SortOrder: js.UndefOr[OrderKey]
  }

  object ListModelsInput {
    def apply(
      CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
      CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NameContains: js.UndefOr[ModelNameContains] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      SortBy: js.UndefOr[ModelSortKey] = js.undefined,
      SortOrder: js.UndefOr[OrderKey] = js.undefined): ListModelsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListModelsInput]
    }
  }

  @js.native
  trait ListModelsOutput extends js.Object {
    var Models: ModelSummaryList
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListModelsOutput {
    def apply(
      Models: ModelSummaryList,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListModelsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Models" -> Models.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListModelsOutput]
    }
  }

  @js.native
  trait ListNotebookInstanceLifecycleConfigsInput extends js.Object {
    var CreationTimeAfter: js.UndefOr[CreationTime]
    var CreationTimeBefore: js.UndefOr[CreationTime]
    var LastModifiedTimeAfter: js.UndefOr[LastModifiedTime]
    var LastModifiedTimeBefore: js.UndefOr[LastModifiedTime]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[NotebookInstanceLifecycleConfigNameContains]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[NotebookInstanceLifecycleConfigSortKey]
    var SortOrder: js.UndefOr[NotebookInstanceLifecycleConfigSortOrder]
  }

  object ListNotebookInstanceLifecycleConfigsInput {
    def apply(
      CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined,
      CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined,
      LastModifiedTimeAfter: js.UndefOr[LastModifiedTime] = js.undefined,
      LastModifiedTimeBefore: js.UndefOr[LastModifiedTime] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NameContains: js.UndefOr[NotebookInstanceLifecycleConfigNameContains] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      SortBy: js.UndefOr[NotebookInstanceLifecycleConfigSortKey] = js.undefined,
      SortOrder: js.UndefOr[NotebookInstanceLifecycleConfigSortOrder] = js.undefined): ListNotebookInstanceLifecycleConfigsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeAfter" -> LastModifiedTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeBefore" -> LastModifiedTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var AdditionalCodeRepositoryEquals: js.UndefOr[CodeRepositoryNameOrUrl]
    var CreationTimeAfter: js.UndefOr[CreationTime]
    var CreationTimeBefore: js.UndefOr[CreationTime]
    var DefaultCodeRepositoryContains: js.UndefOr[CodeRepositoryContains]
    var LastModifiedTimeAfter: js.UndefOr[LastModifiedTime]
    var LastModifiedTimeBefore: js.UndefOr[LastModifiedTime]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[NotebookInstanceNameContains]
    var NextToken: js.UndefOr[NextToken]
    var NotebookInstanceLifecycleConfigNameContains: js.UndefOr[NotebookInstanceLifecycleConfigName]
    var SortBy: js.UndefOr[NotebookInstanceSortKey]
    var SortOrder: js.UndefOr[NotebookInstanceSortOrder]
    var StatusEquals: js.UndefOr[NotebookInstanceStatus]
  }

  object ListNotebookInstancesInput {
    def apply(
      AdditionalCodeRepositoryEquals: js.UndefOr[CodeRepositoryNameOrUrl] = js.undefined,
      CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined,
      CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined,
      DefaultCodeRepositoryContains: js.UndefOr[CodeRepositoryContains] = js.undefined,
      LastModifiedTimeAfter: js.UndefOr[LastModifiedTime] = js.undefined,
      LastModifiedTimeBefore: js.UndefOr[LastModifiedTime] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NameContains: js.UndefOr[NotebookInstanceNameContains] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      NotebookInstanceLifecycleConfigNameContains: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined,
      SortBy: js.UndefOr[NotebookInstanceSortKey] = js.undefined,
      SortOrder: js.UndefOr[NotebookInstanceSortOrder] = js.undefined,
      StatusEquals: js.UndefOr[NotebookInstanceStatus] = js.undefined): ListNotebookInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdditionalCodeRepositoryEquals" -> AdditionalCodeRepositoryEquals.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "DefaultCodeRepositoryContains" -> DefaultCodeRepositoryContains.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeAfter" -> LastModifiedTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeBefore" -> LastModifiedTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceLifecycleConfigNameContains" -> NotebookInstanceLifecycleConfigNameContains.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "StatusEquals" -> StatusEquals.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[WorkteamName]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSubscribedWorkteamsRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NameContains: js.UndefOr[WorkteamName] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListSubscribedWorkteamsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSubscribedWorkteamsRequest]
    }
  }

  @js.native
  trait ListSubscribedWorkteamsResponse extends js.Object {
    var SubscribedWorkteams: SubscribedWorkteams
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSubscribedWorkteamsResponse {
    def apply(
      SubscribedWorkteams: SubscribedWorkteams,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListSubscribedWorkteamsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscribedWorkteams" -> SubscribedWorkteams.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSubscribedWorkteamsResponse]
    }
  }

  @js.native
  trait ListTagsInput extends js.Object {
    var ResourceArn: ResourceArn
    var MaxResults: js.UndefOr[ListTagsMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsInput {
    def apply(
      ResourceArn: ResourceArn,
      MaxResults: js.UndefOr[ListTagsMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsInput]
    }
  }

  @js.native
  trait ListTagsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsOutput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): ListTagsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsOutput]
    }
  }

  @js.native
  trait ListTrainingJobsForHyperParameterTuningJobRequest extends js.Object {
    var HyperParameterTuningJobName: HyperParameterTuningJobName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[TrainingJobSortByOptions]
    var SortOrder: js.UndefOr[SortOrder]
    var StatusEquals: js.UndefOr[TrainingJobStatus]
  }

  object ListTrainingJobsForHyperParameterTuningJobRequest {
    def apply(
      HyperParameterTuningJobName: HyperParameterTuningJobName,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      SortBy: js.UndefOr[TrainingJobSortByOptions] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined,
      StatusEquals: js.UndefOr[TrainingJobStatus] = js.undefined): ListTrainingJobsForHyperParameterTuningJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HyperParameterTuningJobName" -> HyperParameterTuningJobName.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "StatusEquals" -> StatusEquals.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrainingJobsForHyperParameterTuningJobRequest]
    }
  }

  @js.native
  trait ListTrainingJobsForHyperParameterTuningJobResponse extends js.Object {
    var TrainingJobSummaries: HyperParameterTrainingJobSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTrainingJobsForHyperParameterTuningJobResponse {
    def apply(
      TrainingJobSummaries: HyperParameterTrainingJobSummaries,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTrainingJobsForHyperParameterTuningJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrainingJobSummaries" -> TrainingJobSummaries.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrainingJobsForHyperParameterTuningJobResponse]
    }
  }

  @js.native
  trait ListTrainingJobsRequest extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var LastModifiedTimeAfter: js.UndefOr[Timestamp]
    var LastModifiedTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[NameContains]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[SortBy]
    var SortOrder: js.UndefOr[SortOrder]
    var StatusEquals: js.UndefOr[TrainingJobStatus]
  }

  object ListTrainingJobsRequest {
    def apply(
      CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
      CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined,
      LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NameContains: js.UndefOr[NameContains] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      SortBy: js.UndefOr[SortBy] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined,
      StatusEquals: js.UndefOr[TrainingJobStatus] = js.undefined): ListTrainingJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeAfter" -> LastModifiedTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeBefore" -> LastModifiedTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "StatusEquals" -> StatusEquals.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrainingJobsRequest]
    }
  }

  @js.native
  trait ListTrainingJobsResponse extends js.Object {
    var TrainingJobSummaries: TrainingJobSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTrainingJobsResponse {
    def apply(
      TrainingJobSummaries: TrainingJobSummaries,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTrainingJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrainingJobSummaries" -> TrainingJobSummaries.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrainingJobsResponse]
    }
  }

  @js.native
  trait ListTransformJobsRequest extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var LastModifiedTimeAfter: js.UndefOr[Timestamp]
    var LastModifiedTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[NameContains]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[SortBy]
    var SortOrder: js.UndefOr[SortOrder]
    var StatusEquals: js.UndefOr[TransformJobStatus]
  }

  object ListTransformJobsRequest {
    def apply(
      CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
      CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined,
      LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NameContains: js.UndefOr[NameContains] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      SortBy: js.UndefOr[SortBy] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined,
      StatusEquals: js.UndefOr[TransformJobStatus] = js.undefined): ListTransformJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTimeAfter" -> CreationTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "CreationTimeBefore" -> CreationTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeAfter" -> LastModifiedTimeAfter.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimeBefore" -> LastModifiedTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "StatusEquals" -> StatusEquals.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTransformJobsRequest]
    }
  }

  @js.native
  trait ListTransformJobsResponse extends js.Object {
    var TransformJobSummaries: TransformJobSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTransformJobsResponse {
    def apply(
      TransformJobSummaries: TransformJobSummaries,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTransformJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TransformJobSummaries" -> TransformJobSummaries.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTransformJobsResponse]
    }
  }

  @js.native
  trait ListWorkteamsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[WorkteamName]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[ListWorkteamsSortByOptions]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListWorkteamsRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NameContains: js.UndefOr[WorkteamName] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      SortBy: js.UndefOr[ListWorkteamsSortByOptions] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined): ListWorkteamsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NameContains" -> NameContains.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListWorkteamsRequest]
    }
  }

  @js.native
  trait ListWorkteamsResponse extends js.Object {
    var Workteams: Workteams
    var NextToken: js.UndefOr[NextToken]
  }

  object ListWorkteamsResponse {
    def apply(
      Workteams: Workteams,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListWorkteamsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Workteams" -> Workteams.asInstanceOf[js.Any],
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
   * Defines the Amazon Cognito user group that is part of a work team.
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
   * The name, value, and date and time of a metric that was emitted to Amazon CloudWatch.
   */
  @js.native
  trait MetricData extends js.Object {
    var MetricName: js.UndefOr[MetricName]
    var Timestamp: js.UndefOr[Timestamp]
    var Value: js.UndefOr[Float]
  }

  object MetricData {
    def apply(
      MetricName: js.UndefOr[MetricName] = js.undefined,
      Timestamp: js.UndefOr[Timestamp] = js.undefined,
      Value: js.UndefOr[Float] = js.undefined): MetricData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] },
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricData]
    }
  }

  /**
   * Specifies a metric that the training algorithm writes to <code>stderr</code> or <code>stdout</code>. Amazon SageMakerhyperparameter tuning captures all defined metrics. You specify one metric that a hyperparameter tuning job uses as its objective metric to choose the best training job.
   */
  @js.native
  trait MetricDefinition extends js.Object {
    var Name: MetricName
    var Regex: MetricRegex
  }

  object MetricDefinition {
    def apply(
      Name: MetricName,
      Regex: MetricRegex): MetricDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Regex" -> Regex.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricDefinition]
    }
  }

  /**
   * Provides information about the location that is configured for storing model artifacts.
   */
  @js.native
  trait ModelArtifacts extends js.Object {
    var S3ModelArtifacts: S3Uri
  }

  object ModelArtifacts {
    def apply(
      S3ModelArtifacts: S3Uri): ModelArtifacts = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3ModelArtifacts" -> S3ModelArtifacts.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModelArtifacts]
    }
  }

  /**
   * Describes the Docker container for the model package.
   */
  @js.native
  trait ModelPackageContainerDefinition extends js.Object {
    var Image: Image
    var ContainerHostname: js.UndefOr[ContainerHostname]
    var ImageDigest: js.UndefOr[ImageDigest]
    var ModelDataUrl: js.UndefOr[Url]
    var ProductId: js.UndefOr[ProductId]
  }

  object ModelPackageContainerDefinition {
    def apply(
      Image: Image,
      ContainerHostname: js.UndefOr[ContainerHostname] = js.undefined,
      ImageDigest: js.UndefOr[ImageDigest] = js.undefined,
      ModelDataUrl: js.UndefOr[Url] = js.undefined,
      ProductId: js.UndefOr[ProductId] = js.undefined): ModelPackageContainerDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Image" -> Image.asInstanceOf[js.Any],
        "ContainerHostname" -> ContainerHostname.map { x => x.asInstanceOf[js.Any] },
        "ImageDigest" -> ImageDigest.map { x => x.asInstanceOf[js.Any] },
        "ModelDataUrl" -> ModelDataUrl.map { x => x.asInstanceOf[js.Any] },
        "ProductId" -> ProductId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * Specifies the validation and image scan statuses of the model package.
   */
  @js.native
  trait ModelPackageStatusDetails extends js.Object {
    var ValidationStatuses: ModelPackageStatusItemList
    var ImageScanStatuses: js.UndefOr[ModelPackageStatusItemList]
  }

  object ModelPackageStatusDetails {
    def apply(
      ValidationStatuses: ModelPackageStatusItemList,
      ImageScanStatuses: js.UndefOr[ModelPackageStatusItemList] = js.undefined): ModelPackageStatusDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ValidationStatuses" -> ValidationStatuses.asInstanceOf[js.Any],
        "ImageScanStatuses" -> ImageScanStatuses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModelPackageStatusDetails]
    }
  }

  /**
   * Represents the overall status of a model package.
   */
  @js.native
  trait ModelPackageStatusItem extends js.Object {
    var Name: EntityName
    var Status: DetailedModelPackageStatus
    var FailureReason: js.UndefOr[String]
  }

  object ModelPackageStatusItem {
    def apply(
      Name: EntityName,
      Status: DetailedModelPackageStatus,
      FailureReason: js.UndefOr[String] = js.undefined): ModelPackageStatusItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModelPackageStatusItem]
    }
  }

  /**
   * Provides summary information about a model package.
   */
  @js.native
  trait ModelPackageSummary extends js.Object {
    var CreationTime: CreationTime
    var ModelPackageArn: ModelPackageArn
    var ModelPackageName: EntityName
    var ModelPackageStatus: ModelPackageStatus
    var ModelPackageDescription: js.UndefOr[EntityDescription]
  }

  object ModelPackageSummary {
    def apply(
      CreationTime: CreationTime,
      ModelPackageArn: ModelPackageArn,
      ModelPackageName: EntityName,
      ModelPackageStatus: ModelPackageStatus,
      ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined): ModelPackageSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ModelPackageArn" -> ModelPackageArn.asInstanceOf[js.Any],
        "ModelPackageName" -> ModelPackageName.asInstanceOf[js.Any],
        "ModelPackageStatus" -> ModelPackageStatus.asInstanceOf[js.Any],
        "ModelPackageDescription" -> ModelPackageDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModelPackageSummary]
    }
  }

  /**
   * Contains data such as the inputs and targeted instance types that are used in the process of validating the model package.
   *  The data provided in the validation profile is made available to your buyers on AWS Marketplace.
   */
  @js.native
  trait ModelPackageValidationProfile extends js.Object {
    var ProfileName: EntityName
    var TransformJobDefinition: TransformJobDefinition
  }

  object ModelPackageValidationProfile {
    def apply(
      ProfileName: EntityName,
      TransformJobDefinition: TransformJobDefinition): ModelPackageValidationProfile = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProfileName" -> ProfileName.asInstanceOf[js.Any],
        "TransformJobDefinition" -> TransformJobDefinition.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModelPackageValidationProfile]
    }
  }

  /**
   * Specifies batch transform jobs that Amazon SageMaker runs to validate your model package.
   */
  @js.native
  trait ModelPackageValidationSpecification extends js.Object {
    var ValidationProfiles: ModelPackageValidationProfiles
    var ValidationRole: RoleArn
  }

  object ModelPackageValidationSpecification {
    def apply(
      ValidationProfiles: ModelPackageValidationProfiles,
      ValidationRole: RoleArn): ModelPackageValidationSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ValidationProfiles" -> ValidationProfiles.asInstanceOf[js.Any],
        "ValidationRole" -> ValidationRole.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModelPackageValidationSpecification]
    }
  }

  object ModelSortKeyEnum {
    val Name = "Name"
    val CreationTime = "CreationTime"

    val values = IndexedSeq(Name, CreationTime)
  }

  /**
   * Provides summary information about a model.
   */
  @js.native
  trait ModelSummary extends js.Object {
    var CreationTime: Timestamp
    var ModelArn: ModelArn
    var ModelName: ModelName
  }

  object ModelSummary {
    def apply(
      CreationTime: Timestamp,
      ModelArn: ModelArn,
      ModelName: ModelName): ModelSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ModelArn" -> ModelArn.asInstanceOf[js.Any],
        "ModelName" -> ModelName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModelSummary]
    }
  }

  /**
   * A <code>NestedFilter</code> is defined by using a resource name under <code>NestedPropertyName</code>, which entries in a list that properties must match to be included in the results. To satisfy the conditions specified in the <code>NestedFilters</code> call, each object in the list must satisfy the conditions of all of the filters.
   *  For example, a <code>NestedFilters</code> could be defined using the training job's <code>InputDataConfig</code> property, this would be defined as a list of <code>Channel</code> objects.
   *  A <code>NestedFilters</code> object contains multiple filters. For example, to find all training jobs that have <code>train</code> in their name, and have <code>cat/data</code> in their<code/> <code>S3Uri</code> (under <code>InputDataConfig</code>), you need to create a <code>NestedFilters</code> object that specfies the <code>InputDataConfig</code> property with the following <code>Filter</code> objects:
   * * <code>'{Name:"InputDataConfig.ChannelName", "Operator":"EQUALS", "Value":"train"}',</code>
   *  * <code>'{Name:"InputDataConfig.DataSource.S3DataSource.S3Uri", "Operator":"CONTAINS", "Value":"cat/data"}'</code>
   */
  @js.native
  trait NestedFilters extends js.Object {
    var Filters: FilterList
    var NestedPropertyName: ResourcePropertyName
  }

  object NestedFilters {
    def apply(
      Filters: FilterList,
      NestedPropertyName: ResourcePropertyName): NestedFilters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.asInstanceOf[js.Any],
        "NestedPropertyName" -> NestedPropertyName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
   * Provides a summary of a notebook instance lifecycle configuration.
   */
  @js.native
  trait NotebookInstanceLifecycleConfigSummary extends js.Object {
    var NotebookInstanceLifecycleConfigArn: NotebookInstanceLifecycleConfigArn
    var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
    var CreationTime: js.UndefOr[CreationTime]
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
  }

  object NotebookInstanceLifecycleConfigSummary {
    def apply(
      NotebookInstanceLifecycleConfigArn: NotebookInstanceLifecycleConfigArn,
      NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName,
      CreationTime: js.UndefOr[CreationTime] = js.undefined,
      LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined): NotebookInstanceLifecycleConfigSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceLifecycleConfigArn" -> NotebookInstanceLifecycleConfigArn.asInstanceOf[js.Any],
        "NotebookInstanceLifecycleConfigName" -> NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotebookInstanceLifecycleConfigSummary]
    }
  }

  /**
   * Contains the notebook instance lifecycle configuration script.
   *  Each lifecycle configuration script has a limit of 16384 characters.
   *  The value of the <code>PATH</code> environment variable that is available to both scripts is <code>/sbin:bin:/usr/sbin:/usr/bin</code>.
   *  View CloudWatch Logs for notebook instance lifecycle configurations in log group <code>/aws/sagemaker/NotebookInstances</code> in log stream <code>[notebook-instance-name]/[LifecycleConfigHook]</code>.
   *  Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes, it fails and the notebook instance is not created or started.
   *  For information about notebook instance lifestyle configurations, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step 2.1: (Optional) Customize a Notebook Instance</a>.
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
   * Provides summary information for an Amazon SageMaker notebook instance.
   */
  @js.native
  trait NotebookInstanceSummary extends js.Object {
    var NotebookInstanceArn: NotebookInstanceArn
    var NotebookInstanceName: NotebookInstanceName
    var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls]
    var CreationTime: js.UndefOr[CreationTime]
    var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl]
    var InstanceType: js.UndefOr[InstanceType]
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
    var NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName]
    var NotebookInstanceStatus: js.UndefOr[NotebookInstanceStatus]
    var Url: js.UndefOr[NotebookInstanceUrl]
  }

  object NotebookInstanceSummary {
    def apply(
      NotebookInstanceArn: NotebookInstanceArn,
      NotebookInstanceName: NotebookInstanceName,
      AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.undefined,
      CreationTime: js.UndefOr[CreationTime] = js.undefined,
      DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined,
      NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined,
      NotebookInstanceStatus: js.UndefOr[NotebookInstanceStatus] = js.undefined,
      Url: js.UndefOr[NotebookInstanceUrl] = js.undefined): NotebookInstanceSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceArn" -> NotebookInstanceArn.asInstanceOf[js.Any],
        "NotebookInstanceName" -> NotebookInstanceName.asInstanceOf[js.Any],
        "AdditionalCodeRepositories" -> AdditionalCodeRepositories.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] },
        "DefaultCodeRepository" -> DefaultCodeRepository.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceLifecycleConfigName" -> NotebookInstanceLifecycleConfigName.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceStatus" -> NotebookInstanceStatus.map { x => x.asInstanceOf[js.Any] },
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * Specifies the number of training jobs that this hyperparameter tuning job launched, categorized by the status of their objective metric. The objective metric status shows whether the final objective metric for the training job has been evaluated by the tuning job and used in the hyperparameter tuning process.
   */
  @js.native
  trait ObjectiveStatusCounters extends js.Object {
    var Failed: js.UndefOr[ObjectiveStatusCounter]
    var Pending: js.UndefOr[ObjectiveStatusCounter]
    var Succeeded: js.UndefOr[ObjectiveStatusCounter]
  }

  object ObjectiveStatusCounters {
    def apply(
      Failed: js.UndefOr[ObjectiveStatusCounter] = js.undefined,
      Pending: js.UndefOr[ObjectiveStatusCounter] = js.undefined,
      Succeeded: js.UndefOr[ObjectiveStatusCounter] = js.undefined): ObjectiveStatusCounters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Failed" -> Failed.map { x => x.asInstanceOf[js.Any] },
        "Pending" -> Pending.map { x => x.asInstanceOf[js.Any] },
        "Succeeded" -> Succeeded.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * Contains information about the output location for the compiled model and the device (target) that the model runs on.
   */
  @js.native
  trait OutputConfig extends js.Object {
    var S3OutputLocation: S3Uri
    var TargetDevice: TargetDevice
  }

  object OutputConfig {
    def apply(
      S3OutputLocation: S3Uri,
      TargetDevice: TargetDevice): OutputConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3OutputLocation" -> S3OutputLocation.asInstanceOf[js.Any],
        "TargetDevice" -> TargetDevice.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputConfig]
    }
  }

  /**
   * Provides information about how to store model training results (model artifacts).
   */
  @js.native
  trait OutputDataConfig extends js.Object {
    var S3OutputPath: S3Uri
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object OutputDataConfig {
    def apply(
      S3OutputPath: S3Uri,
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined): OutputDataConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3OutputPath" -> S3OutputPath.asInstanceOf[js.Any],
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputDataConfig]
    }
  }

  /**
   * Defines the possible values for categorical, continous, and integer hyperparameters to be used by an algorithm.
   */
  @js.native
  trait ParameterRange extends js.Object {
    var CategoricalParameterRangeSpecification: js.UndefOr[CategoricalParameterRangeSpecification]
    var ContinuousParameterRangeSpecification: js.UndefOr[ContinuousParameterRangeSpecification]
    var IntegerParameterRangeSpecification: js.UndefOr[IntegerParameterRangeSpecification]
  }

  object ParameterRange {
    def apply(
      CategoricalParameterRangeSpecification: js.UndefOr[CategoricalParameterRangeSpecification] = js.undefined,
      ContinuousParameterRangeSpecification: js.UndefOr[ContinuousParameterRangeSpecification] = js.undefined,
      IntegerParameterRangeSpecification: js.UndefOr[IntegerParameterRangeSpecification] = js.undefined): ParameterRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CategoricalParameterRangeSpecification" -> CategoricalParameterRangeSpecification.map { x => x.asInstanceOf[js.Any] },
        "ContinuousParameterRangeSpecification" -> ContinuousParameterRangeSpecification.map { x => x.asInstanceOf[js.Any] },
        "IntegerParameterRangeSpecification" -> IntegerParameterRangeSpecification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParameterRange]
    }
  }

  /**
   * Specifies ranges of integer, continuous, and categorical hyperparameters that a hyperparameter tuning job searches. The hyperparameter tuning job launches training jobs with hyperparameter values within these ranges to find the combination of values that result in the training job with the best performance as measured by the objective metric of the hyperparameter tuning job.
   *
   * '''Note:'''You can specify a maximum of 20 hyperparameters that a hyperparameter tuning job can search over. Every possible value of a categorical parameter range counts against this limit.
   */
  @js.native
  trait ParameterRanges extends js.Object {
    var CategoricalParameterRanges: js.UndefOr[CategoricalParameterRanges]
    var ContinuousParameterRanges: js.UndefOr[ContinuousParameterRanges]
    var IntegerParameterRanges: js.UndefOr[IntegerParameterRanges]
  }

  object ParameterRanges {
    def apply(
      CategoricalParameterRanges: js.UndefOr[CategoricalParameterRanges] = js.undefined,
      ContinuousParameterRanges: js.UndefOr[ContinuousParameterRanges] = js.undefined,
      IntegerParameterRanges: js.UndefOr[IntegerParameterRanges] = js.undefined): ParameterRanges = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CategoricalParameterRanges" -> CategoricalParameterRanges.map { x => x.asInstanceOf[js.Any] },
        "ContinuousParameterRanges" -> ContinuousParameterRanges.map { x => x.asInstanceOf[js.Any] },
        "IntegerParameterRanges" -> IntegerParameterRanges.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * A previously completed or stopped hyperparameter tuning job to be used as a starting point for a new hyperparameter tuning job.
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
   * Identifies a model that you want to host and the resources to deploy for hosting it. If you are deploying multiple models, tell Amazon SageMaker how to distribute traffic among the models by specifying variant weights.
   */
  @js.native
  trait ProductionVariant extends js.Object {
    var InitialInstanceCount: TaskCount
    var InstanceType: ProductionVariantInstanceType
    var ModelName: ModelName
    var VariantName: VariantName
    var AcceleratorType: js.UndefOr[ProductionVariantAcceleratorType]
    var InitialVariantWeight: js.UndefOr[VariantWeight]
  }

  object ProductionVariant {
    def apply(
      InitialInstanceCount: TaskCount,
      InstanceType: ProductionVariantInstanceType,
      ModelName: ModelName,
      VariantName: VariantName,
      AcceleratorType: js.UndefOr[ProductionVariantAcceleratorType] = js.undefined,
      InitialVariantWeight: js.UndefOr[VariantWeight] = js.undefined): ProductionVariant = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InitialInstanceCount" -> InitialInstanceCount.asInstanceOf[js.Any],
        "InstanceType" -> InstanceType.asInstanceOf[js.Any],
        "ModelName" -> ModelName.asInstanceOf[js.Any],
        "VariantName" -> VariantName.asInstanceOf[js.Any],
        "AcceleratorType" -> AcceleratorType.map { x => x.asInstanceOf[js.Any] },
        "InitialVariantWeight" -> InitialVariantWeight.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * Describes weight and capacities for a production variant associated with an endpoint. If you sent a request to the <code>UpdateEndpointWeightsAndCapacities</code> API and the endpoint status is <code>Updating</code>, you get different desired and current values.
   */
  @js.native
  trait ProductionVariantSummary extends js.Object {
    var VariantName: VariantName
    var CurrentInstanceCount: js.UndefOr[TaskCount]
    var CurrentWeight: js.UndefOr[VariantWeight]
    var DeployedImages: js.UndefOr[DeployedImages]
    var DesiredInstanceCount: js.UndefOr[TaskCount]
    var DesiredWeight: js.UndefOr[VariantWeight]
  }

  object ProductionVariantSummary {
    def apply(
      VariantName: VariantName,
      CurrentInstanceCount: js.UndefOr[TaskCount] = js.undefined,
      CurrentWeight: js.UndefOr[VariantWeight] = js.undefined,
      DeployedImages: js.UndefOr[DeployedImages] = js.undefined,
      DesiredInstanceCount: js.UndefOr[TaskCount] = js.undefined,
      DesiredWeight: js.UndefOr[VariantWeight] = js.undefined): ProductionVariantSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VariantName" -> VariantName.asInstanceOf[js.Any],
        "CurrentInstanceCount" -> CurrentInstanceCount.map { x => x.asInstanceOf[js.Any] },
        "CurrentWeight" -> CurrentWeight.map { x => x.asInstanceOf[js.Any] },
        "DeployedImages" -> DeployedImages.map { x => x.asInstanceOf[js.Any] },
        "DesiredInstanceCount" -> DesiredInstanceCount.map { x => x.asInstanceOf[js.Any] },
        "DesiredWeight" -> DesiredWeight.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProductionVariantSummary]
    }
  }

  /**
   * A suggestion query for retrieving property names.
   */
  @js.native
  trait PropertyNameQuery extends js.Object {
    var PropertyNameHint: PropertyNameHint
  }

  object PropertyNameQuery {
    def apply(
      PropertyNameHint: PropertyNameHint): PropertyNameQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PropertyNameHint" -> PropertyNameHint.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PropertyNameQuery]
    }
  }

  /**
   * A property name returned from a <code>GetSearchSuggestions</code> call that specifies a value in the <code>PropertyNameQuery</code> field.
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
   * Defines the amount of money paid to an Amazon Mechanical Turk worker for each task performed. For more information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-public-payment.html"> Public Workforce Task Price</a>.
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
    var RoleArn: RoleArn
    var Task: RenderableTask
    var UiTemplate: UiTemplate
  }

  object RenderUiTemplateRequest {
    def apply(
      RoleArn: RoleArn,
      Task: RenderableTask,
      UiTemplate: UiTemplate): RenderUiTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "Task" -> Task.asInstanceOf[js.Any],
        "UiTemplate" -> UiTemplate.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RenderUiTemplateRequest]
    }
  }

  @js.native
  trait RenderUiTemplateResponse extends js.Object {
    var Errors: RenderingErrorList
    var RenderedContent: String
  }

  object RenderUiTemplateResponse {
    def apply(
      Errors: RenderingErrorList,
      RenderedContent: String): RenderUiTemplateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Errors" -> Errors.asInstanceOf[js.Any],
        "RenderedContent" -> RenderedContent.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RenderUiTemplateResponse]
    }
  }

  /**
   * Contains input values for a task.
   */
  @js.native
  trait RenderableTask extends js.Object {
    var Input: TaskInput
  }

  object RenderableTask {
    def apply(
      Input: TaskInput): RenderableTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Input" -> Input.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RenderableTask]
    }
  }

  /**
   * A description of an error that occurred while rendering the template.
   */
  @js.native
  trait RenderingError extends js.Object {
    var Code: String
    var Message: String
  }

  object RenderingError {
    def apply(
      Code: String,
      Message: String): RenderingError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.asInstanceOf[js.Any],
        "Message" -> Message.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RenderingError]
    }
  }

  /**
   * Describes the resources, including ML compute instances and ML storage volumes, to use for model training.
   */
  @js.native
  trait ResourceConfig extends js.Object {
    var InstanceCount: TrainingInstanceCount
    var InstanceType: TrainingInstanceType
    var VolumeSizeInGB: VolumeSizeInGB
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
  }

  object ResourceConfig {
    def apply(
      InstanceCount: TrainingInstanceCount,
      InstanceType: TrainingInstanceType,
      VolumeSizeInGB: VolumeSizeInGB,
      VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined): ResourceConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceCount" -> InstanceCount.asInstanceOf[js.Any],
        "InstanceType" -> InstanceType.asInstanceOf[js.Any],
        "VolumeSizeInGB" -> VolumeSizeInGB.asInstanceOf[js.Any],
        "VolumeKmsKeyId" -> VolumeKmsKeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceConfig]
    }
  }

  /**
   * Specifies the maximum number of training jobs and parallel training jobs that a hyperparameter tuning job can launch.
   */
  @js.native
  trait ResourceLimits extends js.Object {
    var MaxNumberOfTrainingJobs: MaxNumberOfTrainingJobs
    var MaxParallelTrainingJobs: MaxParallelTrainingJobs
  }

  object ResourceLimits {
    def apply(
      MaxNumberOfTrainingJobs: MaxNumberOfTrainingJobs,
      MaxParallelTrainingJobs: MaxParallelTrainingJobs): ResourceLimits = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxNumberOfTrainingJobs" -> MaxNumberOfTrainingJobs.asInstanceOf[js.Any],
        "MaxParallelTrainingJobs" -> MaxParallelTrainingJobs.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
   * Describes the S3 data source.
   */
  @js.native
  trait S3DataSource extends js.Object {
    var S3DataType: S3DataType
    var S3Uri: S3Uri
    var AttributeNames: js.UndefOr[AttributeNames]
    var S3DataDistributionType: js.UndefOr[S3DataDistribution]
  }

  object S3DataSource {
    def apply(
      S3DataType: S3DataType,
      S3Uri: S3Uri,
      AttributeNames: js.UndefOr[AttributeNames] = js.undefined,
      S3DataDistributionType: js.UndefOr[S3DataDistribution] = js.undefined): S3DataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3DataType" -> S3DataType.asInstanceOf[js.Any],
        "S3Uri" -> S3Uri.asInstanceOf[js.Any],
        "AttributeNames" -> AttributeNames.map { x => x.asInstanceOf[js.Any] },
        "S3DataDistributionType" -> S3DataDistributionType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * A multi-expression that searches for the specified resource or resources. All resource objects that satisfy the expression's condition are included in the search results.
   *  A <code>SearchExpression</code> contains the following components:
   * * A list of <code>Filter</code> objects. Each filter defines a simple Boolean expression comprised of a resource property name, Boolean operator, and value.
   *  * A list of <code>NestedFilter</code> objects. Each nested filter defines a list of Boolean expressions using a list of resource properties. A nested filter is satisfied if a single object in the list satisfies all Boolean expressions.
   *  * A list of <code>SearchExpression</code> objects.
   *  * A Boolean operator: <code>And</code> or <code>Or</code>.
   */
  @js.native
  trait SearchExpression extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var NestedFilters: js.UndefOr[NestedFiltersList]
    var Operator: js.UndefOr[BooleanOperator]
    var SubExpressions: js.UndefOr[SearchExpressionList]
  }

  object SearchExpression {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      NestedFilters: js.UndefOr[NestedFiltersList] = js.undefined,
      Operator: js.UndefOr[BooleanOperator] = js.undefined,
      SubExpressions: js.UndefOr[SearchExpressionList] = js.undefined): SearchExpression = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NestedFilters" -> NestedFilters.map { x => x.asInstanceOf[js.Any] },
        "Operator" -> Operator.map { x => x.asInstanceOf[js.Any] },
        "SubExpressions" -> SubExpressions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchExpression]
    }
  }

  /**
   * An individual search result record that contains a single resource object.
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
    var Resource: ResourceType
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SearchExpression: js.UndefOr[SearchExpression]
    var SortBy: js.UndefOr[ResourcePropertyName]
    var SortOrder: js.UndefOr[SearchSortOrder]
  }

  object SearchRequest {
    def apply(
      Resource: ResourceType,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      SearchExpression: js.UndefOr[SearchExpression] = js.undefined,
      SortBy: js.UndefOr[ResourcePropertyName] = js.undefined,
      SortOrder: js.UndefOr[SearchSortOrder] = js.undefined): SearchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Resource" -> Resource.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SearchExpression" -> SearchExpression.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchRequest]
    }
  }

  @js.native
  trait SearchResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Results: js.UndefOr[SearchResultsList]
  }

  object SearchResponse {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Results: js.UndefOr[SearchResultsList] = js.undefined): SearchResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Results" -> Results.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * An array element of [[DescribeTrainingJobResponse.SecondaryStatusTransitions]]. It provides additional details about a status that the training job has transitioned through. A training job can be in one of several states, for example, starting, downloading, training, or uploading. Within each state, there are a number of intermediate states. For example, within the starting state, Amazon SageMaker could be starting the training job or launching the ML instances. These transitional states are referred to as the job's secondary status.
   *  <p/>
   */
  @js.native
  trait SecondaryStatusTransition extends js.Object {
    var StartTime: Timestamp
    var Status: SecondaryStatus
    var EndTime: js.UndefOr[Timestamp]
    var StatusMessage: js.UndefOr[StatusMessage]
  }

  object SecondaryStatusTransition {
    def apply(
      StartTime: Timestamp,
      Status: SecondaryStatus,
      EndTime: js.UndefOr[Timestamp] = js.undefined,
      StatusMessage: js.UndefOr[StatusMessage] = js.undefined): SecondaryStatusTransition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StartTime" -> StartTime.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecondaryStatusTransition]
    }
  }

  /**
   * A configuration for a shuffle option for input data in a channel. If you use <code>S3Prefix</code> for <code>S3DataType</code>, the results of the S3 key prefix matches are shuffled. If you use <code>ManifestFile</code>, the order of the S3 object references in the <code>ManifestFile</code> is shuffled. If you use <code>AugmentedManifestFile</code>, the order of the JSON lines in the <code>AugmentedManifestFile</code> is shuffled. The shuffling order is determined using the <code>Seed</code> value.
   *  For Pipe input mode, shuffling is done at the start of every epoch. With large datasets, this ensures that the order of the training data is different for each epoch, and it helps reduce bias and possible overfitting. In a multi-node training job when <code>ShuffleConfig</code> is combined with <code>S3DataDistributionType</code> of <code>ShardedByS3Key</code>, the data is shuffled across nodes so that the content sent to a particular node on the first epoch might be sent to a different node on the second epoch.
   */
  @js.native
  trait ShuffleConfig extends js.Object {
    var Seed: Seed
  }

  object ShuffleConfig {
    def apply(
      Seed: Seed): ShuffleConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Seed" -> Seed.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
   * Specifies an algorithm that was used to create the model package. The algorithm must be either an algorithm resource in your Amazon SageMaker account or an algorithm in AWS Marketplace that you are subscribed to.
   */
  @js.native
  trait SourceAlgorithm extends js.Object {
    var AlgorithmName: ArnOrName
    var ModelDataUrl: js.UndefOr[Url]
  }

  object SourceAlgorithm {
    def apply(
      AlgorithmName: ArnOrName,
      ModelDataUrl: js.UndefOr[Url] = js.undefined): SourceAlgorithm = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlgorithmName" -> AlgorithmName.asInstanceOf[js.Any],
        "ModelDataUrl" -> ModelDataUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceAlgorithm]
    }
  }

  /**
   * A list of algorithms that were used to create a model package.
   */
  @js.native
  trait SourceAlgorithmSpecification extends js.Object {
    var SourceAlgorithms: SourceAlgorithmList
  }

  object SourceAlgorithmSpecification {
    def apply(
      SourceAlgorithms: SourceAlgorithmList): SourceAlgorithmSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceAlgorithms" -> SourceAlgorithms.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var NotebookInstanceName: NotebookInstanceName
  }

  object StartNotebookInstanceInput {
    def apply(
      NotebookInstanceName: NotebookInstanceName): StartNotebookInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceName" -> NotebookInstanceName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartNotebookInstanceInput]
    }
  }

  @js.native
  trait StopCompilationJobRequest extends js.Object {
    var CompilationJobName: EntityName
  }

  object StopCompilationJobRequest {
    def apply(
      CompilationJobName: EntityName): StopCompilationJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompilationJobName" -> CompilationJobName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopCompilationJobRequest]
    }
  }

  @js.native
  trait StopHyperParameterTuningJobRequest extends js.Object {
    var HyperParameterTuningJobName: HyperParameterTuningJobName
  }

  object StopHyperParameterTuningJobRequest {
    def apply(
      HyperParameterTuningJobName: HyperParameterTuningJobName): StopHyperParameterTuningJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HyperParameterTuningJobName" -> HyperParameterTuningJobName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopHyperParameterTuningJobRequest]
    }
  }

  @js.native
  trait StopLabelingJobRequest extends js.Object {
    var LabelingJobName: LabelingJobName
  }

  object StopLabelingJobRequest {
    def apply(
      LabelingJobName: LabelingJobName): StopLabelingJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LabelingJobName" -> LabelingJobName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopLabelingJobRequest]
    }
  }

  @js.native
  trait StopNotebookInstanceInput extends js.Object {
    var NotebookInstanceName: NotebookInstanceName
  }

  object StopNotebookInstanceInput {
    def apply(
      NotebookInstanceName: NotebookInstanceName): StopNotebookInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceName" -> NotebookInstanceName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopNotebookInstanceInput]
    }
  }

  @js.native
  trait StopTrainingJobRequest extends js.Object {
    var TrainingJobName: TrainingJobName
  }

  object StopTrainingJobRequest {
    def apply(
      TrainingJobName: TrainingJobName): StopTrainingJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrainingJobName" -> TrainingJobName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopTrainingJobRequest]
    }
  }

  @js.native
  trait StopTransformJobRequest extends js.Object {
    var TransformJobName: TransformJobName
  }

  object StopTransformJobRequest {
    def apply(
      TransformJobName: TransformJobName): StopTransformJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TransformJobName" -> TransformJobName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopTransformJobRequest]
    }
  }

  /**
   * Specifies how long a model training or compilation job can run. When the job reaches the limit, Amazon SageMaker ends the training job. Use this API to cap model processing cost.
   *  To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal, which delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts, so the results of training is not lost.
   *  Training algorithms provided by Amazon SageMaker automatically saves the intermediate results of a model training job (it is best effort case, as model might not be ready to save as some stages, for example training just started). This intermediate data is a valid model artifact. You can use it to create a model (<code>CreateModel</code>).
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
   * Describes a work team of a vendor that does the a labelling job.
   */
  @js.native
  trait SubscribedWorkteam extends js.Object {
    var WorkteamArn: WorkteamArn
    var ListingId: js.UndefOr[String]
    var MarketplaceDescription: js.UndefOr[String200]
    var MarketplaceTitle: js.UndefOr[String200]
    var SellerName: js.UndefOr[String]
  }

  object SubscribedWorkteam {
    def apply(
      WorkteamArn: WorkteamArn,
      ListingId: js.UndefOr[String] = js.undefined,
      MarketplaceDescription: js.UndefOr[String200] = js.undefined,
      MarketplaceTitle: js.UndefOr[String200] = js.undefined,
      SellerName: js.UndefOr[String] = js.undefined): SubscribedWorkteam = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkteamArn" -> WorkteamArn.asInstanceOf[js.Any],
        "ListingId" -> ListingId.map { x => x.asInstanceOf[js.Any] },
        "MarketplaceDescription" -> MarketplaceDescription.map { x => x.asInstanceOf[js.Any] },
        "MarketplaceTitle" -> MarketplaceTitle.map { x => x.asInstanceOf[js.Any] },
        "SellerName" -> SellerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubscribedWorkteam]
    }
  }

  /**
   * Limits the property names that are included in the response.
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
   * Describes a tag.
   */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
      Key: TagKey,
      Value: TagValue): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
   * Contains information about a training job.
   */
  @js.native
  trait TrainingJob extends js.Object {
    var AlgorithmSpecification: js.UndefOr[AlgorithmSpecification]
    var CreationTime: js.UndefOr[Timestamp]
    var EnableNetworkIsolation: js.UndefOr[Boolean]
    var FailureReason: js.UndefOr[FailureReason]
    var FinalMetricDataList: js.UndefOr[FinalMetricDataList]
    var HyperParameters: js.UndefOr[HyperParameters]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var LabelingJobArn: js.UndefOr[LabelingJobArn]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var ModelArtifacts: js.UndefOr[ModelArtifacts]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var ResourceConfig: js.UndefOr[ResourceConfig]
    var RoleArn: js.UndefOr[RoleArn]
    var SecondaryStatus: js.UndefOr[SecondaryStatus]
    var SecondaryStatusTransitions: js.UndefOr[SecondaryStatusTransitions]
    var StoppingCondition: js.UndefOr[StoppingCondition]
    var Tags: js.UndefOr[TagList]
    var TrainingEndTime: js.UndefOr[Timestamp]
    var TrainingJobArn: js.UndefOr[TrainingJobArn]
    var TrainingJobName: js.UndefOr[TrainingJobName]
    var TrainingJobStatus: js.UndefOr[TrainingJobStatus]
    var TrainingStartTime: js.UndefOr[Timestamp]
    var TuningJobArn: js.UndefOr[HyperParameterTuningJobArn]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object TrainingJob {
    def apply(
      AlgorithmSpecification: js.UndefOr[AlgorithmSpecification] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined,
      EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      FinalMetricDataList: js.UndefOr[FinalMetricDataList] = js.undefined,
      HyperParameters: js.UndefOr[HyperParameters] = js.undefined,
      InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
      LabelingJobArn: js.UndefOr[LabelingJobArn] = js.undefined,
      LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
      ModelArtifacts: js.UndefOr[ModelArtifacts] = js.undefined,
      OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
      ResourceConfig: js.UndefOr[ResourceConfig] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined,
      SecondaryStatus: js.UndefOr[SecondaryStatus] = js.undefined,
      SecondaryStatusTransitions: js.UndefOr[SecondaryStatusTransitions] = js.undefined,
      StoppingCondition: js.UndefOr[StoppingCondition] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      TrainingEndTime: js.UndefOr[Timestamp] = js.undefined,
      TrainingJobArn: js.UndefOr[TrainingJobArn] = js.undefined,
      TrainingJobName: js.UndefOr[TrainingJobName] = js.undefined,
      TrainingJobStatus: js.UndefOr[TrainingJobStatus] = js.undefined,
      TrainingStartTime: js.UndefOr[Timestamp] = js.undefined,
      TuningJobArn: js.UndefOr[HyperParameterTuningJobArn] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined): TrainingJob = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlgorithmSpecification" -> AlgorithmSpecification.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] },
        "EnableNetworkIsolation" -> EnableNetworkIsolation.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "FinalMetricDataList" -> FinalMetricDataList.map { x => x.asInstanceOf[js.Any] },
        "HyperParameters" -> HyperParameters.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "LabelingJobArn" -> LabelingJobArn.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "ModelArtifacts" -> ModelArtifacts.map { x => x.asInstanceOf[js.Any] },
        "OutputDataConfig" -> OutputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "ResourceConfig" -> ResourceConfig.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
        "SecondaryStatus" -> SecondaryStatus.map { x => x.asInstanceOf[js.Any] },
        "SecondaryStatusTransitions" -> SecondaryStatusTransitions.map { x => x.asInstanceOf[js.Any] },
        "StoppingCondition" -> StoppingCondition.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "TrainingEndTime" -> TrainingEndTime.map { x => x.asInstanceOf[js.Any] },
        "TrainingJobArn" -> TrainingJobArn.map { x => x.asInstanceOf[js.Any] },
        "TrainingJobName" -> TrainingJobName.map { x => x.asInstanceOf[js.Any] },
        "TrainingJobStatus" -> TrainingJobStatus.map { x => x.asInstanceOf[js.Any] },
        "TrainingStartTime" -> TrainingStartTime.map { x => x.asInstanceOf[js.Any] },
        "TuningJobArn" -> TuningJobArn.map { x => x.asInstanceOf[js.Any] },
        "VpcConfig" -> VpcConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrainingJob]
    }
  }

  /**
   * Defines the input needed to run a training job using the algorithm.
   */
  @js.native
  trait TrainingJobDefinition extends js.Object {
    var InputDataConfig: InputDataConfig
    var OutputDataConfig: OutputDataConfig
    var ResourceConfig: ResourceConfig
    var StoppingCondition: StoppingCondition
    var TrainingInputMode: TrainingInputMode
    var HyperParameters: js.UndefOr[HyperParameters]
  }

  object TrainingJobDefinition {
    def apply(
      InputDataConfig: InputDataConfig,
      OutputDataConfig: OutputDataConfig,
      ResourceConfig: ResourceConfig,
      StoppingCondition: StoppingCondition,
      TrainingInputMode: TrainingInputMode,
      HyperParameters: js.UndefOr[HyperParameters] = js.undefined): TrainingJobDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any],
        "ResourceConfig" -> ResourceConfig.asInstanceOf[js.Any],
        "StoppingCondition" -> StoppingCondition.asInstanceOf[js.Any],
        "TrainingInputMode" -> TrainingInputMode.asInstanceOf[js.Any],
        "HyperParameters" -> HyperParameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * The numbers of training jobs launched by a hyperparameter tuning job, categorized by status.
   */
  @js.native
  trait TrainingJobStatusCounters extends js.Object {
    var Completed: js.UndefOr[TrainingJobStatusCounter]
    var InProgress: js.UndefOr[TrainingJobStatusCounter]
    var NonRetryableError: js.UndefOr[TrainingJobStatusCounter]
    var RetryableError: js.UndefOr[TrainingJobStatusCounter]
    var Stopped: js.UndefOr[TrainingJobStatusCounter]
  }

  object TrainingJobStatusCounters {
    def apply(
      Completed: js.UndefOr[TrainingJobStatusCounter] = js.undefined,
      InProgress: js.UndefOr[TrainingJobStatusCounter] = js.undefined,
      NonRetryableError: js.UndefOr[TrainingJobStatusCounter] = js.undefined,
      RetryableError: js.UndefOr[TrainingJobStatusCounter] = js.undefined,
      Stopped: js.UndefOr[TrainingJobStatusCounter] = js.undefined): TrainingJobStatusCounters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Completed" -> Completed.map { x => x.asInstanceOf[js.Any] },
        "InProgress" -> InProgress.map { x => x.asInstanceOf[js.Any] },
        "NonRetryableError" -> NonRetryableError.map { x => x.asInstanceOf[js.Any] },
        "RetryableError" -> RetryableError.map { x => x.asInstanceOf[js.Any] },
        "Stopped" -> Stopped.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrainingJobStatusCounters]
    }
  }

  /**
   * Provides summary information about a training job.
   */
  @js.native
  trait TrainingJobSummary extends js.Object {
    var CreationTime: Timestamp
    var TrainingJobArn: TrainingJobArn
    var TrainingJobName: TrainingJobName
    var TrainingJobStatus: TrainingJobStatus
    var LastModifiedTime: js.UndefOr[Timestamp]
    var TrainingEndTime: js.UndefOr[Timestamp]
  }

  object TrainingJobSummary {
    def apply(
      CreationTime: Timestamp,
      TrainingJobArn: TrainingJobArn,
      TrainingJobName: TrainingJobName,
      TrainingJobStatus: TrainingJobStatus,
      LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
      TrainingEndTime: js.UndefOr[Timestamp] = js.undefined): TrainingJobSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "TrainingJobArn" -> TrainingJobArn.asInstanceOf[js.Any],
        "TrainingJobName" -> TrainingJobName.asInstanceOf[js.Any],
        "TrainingJobStatus" -> TrainingJobStatus.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "TrainingEndTime" -> TrainingEndTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrainingJobSummary]
    }
  }

  /**
   * Defines how the algorithm is used for a training job.
   */
  @js.native
  trait TrainingSpecification extends js.Object {
    var SupportedTrainingInstanceTypes: TrainingInstanceTypes
    var TrainingChannels: ChannelSpecifications
    var TrainingImage: Image
    var MetricDefinitions: js.UndefOr[MetricDefinitionList]
    var SupportedHyperParameters: js.UndefOr[HyperParameterSpecifications]
    var SupportedTuningJobObjectiveMetrics: js.UndefOr[HyperParameterTuningJobObjectives]
    var SupportsDistributedTraining: js.UndefOr[Boolean]
    var TrainingImageDigest: js.UndefOr[ImageDigest]
  }

  object TrainingSpecification {
    def apply(
      SupportedTrainingInstanceTypes: TrainingInstanceTypes,
      TrainingChannels: ChannelSpecifications,
      TrainingImage: Image,
      MetricDefinitions: js.UndefOr[MetricDefinitionList] = js.undefined,
      SupportedHyperParameters: js.UndefOr[HyperParameterSpecifications] = js.undefined,
      SupportedTuningJobObjectiveMetrics: js.UndefOr[HyperParameterTuningJobObjectives] = js.undefined,
      SupportsDistributedTraining: js.UndefOr[Boolean] = js.undefined,
      TrainingImageDigest: js.UndefOr[ImageDigest] = js.undefined): TrainingSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SupportedTrainingInstanceTypes" -> SupportedTrainingInstanceTypes.asInstanceOf[js.Any],
        "TrainingChannels" -> TrainingChannels.asInstanceOf[js.Any],
        "TrainingImage" -> TrainingImage.asInstanceOf[js.Any],
        "MetricDefinitions" -> MetricDefinitions.map { x => x.asInstanceOf[js.Any] },
        "SupportedHyperParameters" -> SupportedHyperParameters.map { x => x.asInstanceOf[js.Any] },
        "SupportedTuningJobObjectiveMetrics" -> SupportedTuningJobObjectiveMetrics.map { x => x.asInstanceOf[js.Any] },
        "SupportsDistributedTraining" -> SupportsDistributedTraining.map { x => x.asInstanceOf[js.Any] },
        "TrainingImageDigest" -> TrainingImageDigest.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrainingSpecification]
    }
  }

  /**
   * Describes the location of the channel data.
   */
  @js.native
  trait TransformDataSource extends js.Object {
    var S3DataSource: TransformS3DataSource
  }

  object TransformDataSource {
    def apply(
      S3DataSource: TransformS3DataSource): TransformDataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3DataSource" -> S3DataSource.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransformDataSource]
    }
  }

  /**
   * Describes the input source of a transform job and the way the transform job consumes it.
   */
  @js.native
  trait TransformInput extends js.Object {
    var DataSource: TransformDataSource
    var CompressionType: js.UndefOr[CompressionType]
    var ContentType: js.UndefOr[ContentType]
    var SplitType: js.UndefOr[SplitType]
  }

  object TransformInput {
    def apply(
      DataSource: TransformDataSource,
      CompressionType: js.UndefOr[CompressionType] = js.undefined,
      ContentType: js.UndefOr[ContentType] = js.undefined,
      SplitType: js.UndefOr[SplitType] = js.undefined): TransformInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataSource" -> DataSource.asInstanceOf[js.Any],
        "CompressionType" -> CompressionType.map { x => x.asInstanceOf[js.Any] },
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] },
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
   * Defines the input needed to run a transform job using the inference specification specified in the algorithm.
   */
  @js.native
  trait TransformJobDefinition extends js.Object {
    var TransformInput: TransformInput
    var TransformOutput: TransformOutput
    var TransformResources: TransformResources
    var BatchStrategy: js.UndefOr[BatchStrategy]
    var Environment: js.UndefOr[TransformEnvironmentMap]
    var MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms]
    var MaxPayloadInMB: js.UndefOr[MaxPayloadInMB]
  }

  object TransformJobDefinition {
    def apply(
      TransformInput: TransformInput,
      TransformOutput: TransformOutput,
      TransformResources: TransformResources,
      BatchStrategy: js.UndefOr[BatchStrategy] = js.undefined,
      Environment: js.UndefOr[TransformEnvironmentMap] = js.undefined,
      MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms] = js.undefined,
      MaxPayloadInMB: js.UndefOr[MaxPayloadInMB] = js.undefined): TransformJobDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TransformInput" -> TransformInput.asInstanceOf[js.Any],
        "TransformOutput" -> TransformOutput.asInstanceOf[js.Any],
        "TransformResources" -> TransformResources.asInstanceOf[js.Any],
        "BatchStrategy" -> BatchStrategy.map { x => x.asInstanceOf[js.Any] },
        "Environment" -> Environment.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrentTransforms" -> MaxConcurrentTransforms.map { x => x.asInstanceOf[js.Any] },
        "MaxPayloadInMB" -> MaxPayloadInMB.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * Provides a summary of a transform job. Multiple TransformJobSummary objects are returned as a list after calling <a>ListTransformJobs</a>.
   */
  @js.native
  trait TransformJobSummary extends js.Object {
    var CreationTime: Timestamp
    var TransformJobArn: TransformJobArn
    var TransformJobName: TransformJobName
    var TransformJobStatus: TransformJobStatus
    var FailureReason: js.UndefOr[FailureReason]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var TransformEndTime: js.UndefOr[Timestamp]
  }

  object TransformJobSummary {
    def apply(
      CreationTime: Timestamp,
      TransformJobArn: TransformJobArn,
      TransformJobName: TransformJobName,
      TransformJobStatus: TransformJobStatus,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
      TransformEndTime: js.UndefOr[Timestamp] = js.undefined): TransformJobSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "TransformJobArn" -> TransformJobArn.asInstanceOf[js.Any],
        "TransformJobName" -> TransformJobName.asInstanceOf[js.Any],
        "TransformJobStatus" -> TransformJobStatus.asInstanceOf[js.Any],
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "TransformEndTime" -> TransformEndTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransformJobSummary]
    }
  }

  /**
   * Describes the results of a transform job output.
   */
  @js.native
  trait TransformOutput extends js.Object {
    var S3OutputPath: S3Uri
    var Accept: js.UndefOr[Accept]
    var AssembleWith: js.UndefOr[AssemblyType]
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object TransformOutput {
    def apply(
      S3OutputPath: S3Uri,
      Accept: js.UndefOr[Accept] = js.undefined,
      AssembleWith: js.UndefOr[AssemblyType] = js.undefined,
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined): TransformOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3OutputPath" -> S3OutputPath.asInstanceOf[js.Any],
        "Accept" -> Accept.map { x => x.asInstanceOf[js.Any] },
        "AssembleWith" -> AssembleWith.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransformOutput]
    }
  }

  /**
   * Describes the resources, including ML instance types and ML instance count, to use for transform job.
   */
  @js.native
  trait TransformResources extends js.Object {
    var InstanceCount: TransformInstanceCount
    var InstanceType: TransformInstanceType
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
  }

  object TransformResources {
    def apply(
      InstanceCount: TransformInstanceCount,
      InstanceType: TransformInstanceType,
      VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined): TransformResources = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceCount" -> InstanceCount.asInstanceOf[js.Any],
        "InstanceType" -> InstanceType.asInstanceOf[js.Any],
        "VolumeKmsKeyId" -> VolumeKmsKeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransformResources]
    }
  }

  /**
   * Describes the S3 data source.
   */
  @js.native
  trait TransformS3DataSource extends js.Object {
    var S3DataType: S3DataType
    var S3Uri: S3Uri
  }

  object TransformS3DataSource {
    def apply(
      S3DataType: S3DataType,
      S3Uri: S3Uri): TransformS3DataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3DataType" -> S3DataType.asInstanceOf[js.Any],
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransformS3DataSource]
    }
  }

  /**
   * Represents an amount of money in United States dollars/
   */
  @js.native
  trait USD extends js.Object {
    var Cents: js.UndefOr[Cents]
    var Dollars: js.UndefOr[Dollars]
    var TenthFractionsOfACent: js.UndefOr[TenthFractionsOfACent]
  }

  object USD {
    def apply(
      Cents: js.UndefOr[Cents] = js.undefined,
      Dollars: js.UndefOr[Dollars] = js.undefined,
      TenthFractionsOfACent: js.UndefOr[TenthFractionsOfACent] = js.undefined): USD = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cents" -> Cents.map { x => x.asInstanceOf[js.Any] },
        "Dollars" -> Dollars.map { x => x.asInstanceOf[js.Any] },
        "TenthFractionsOfACent" -> TenthFractionsOfACent.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[USD]
    }
  }

  /**
   * Provided configuration information for the worker UI for a labeling job.
   */
  @js.native
  trait UiConfig extends js.Object {
    var UiTemplateS3Uri: S3Uri
  }

  object UiConfig {
    def apply(
      UiTemplateS3Uri: S3Uri): UiConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UiTemplateS3Uri" -> UiTemplateS3Uri.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UiConfig]
    }
  }

  /**
   * The Liquid template for the worker user interface.
   */
  @js.native
  trait UiTemplate extends js.Object {
    var Content: TemplateContent
  }

  object UiTemplate {
    def apply(
      Content: TemplateContent): UiTemplate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Content" -> Content.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UiTemplate]
    }
  }

  @js.native
  trait UpdateCodeRepositoryInput extends js.Object {
    var CodeRepositoryName: EntityName
    var GitConfig: js.UndefOr[GitConfigForUpdate]
  }

  object UpdateCodeRepositoryInput {
    def apply(
      CodeRepositoryName: EntityName,
      GitConfig: js.UndefOr[GitConfigForUpdate] = js.undefined): UpdateCodeRepositoryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeRepositoryName" -> CodeRepositoryName.asInstanceOf[js.Any],
        "GitConfig" -> GitConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCodeRepositoryInput]
    }
  }

  @js.native
  trait UpdateCodeRepositoryOutput extends js.Object {
    var CodeRepositoryArn: CodeRepositoryArn
  }

  object UpdateCodeRepositoryOutput {
    def apply(
      CodeRepositoryArn: CodeRepositoryArn): UpdateCodeRepositoryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeRepositoryArn" -> CodeRepositoryArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCodeRepositoryOutput]
    }
  }

  @js.native
  trait UpdateEndpointInput extends js.Object {
    var EndpointConfigName: EndpointConfigName
    var EndpointName: EndpointName
  }

  object UpdateEndpointInput {
    def apply(
      EndpointConfigName: EndpointConfigName,
      EndpointName: EndpointName): UpdateEndpointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointConfigName" -> EndpointConfigName.asInstanceOf[js.Any],
        "EndpointName" -> EndpointName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEndpointInput]
    }
  }

  @js.native
  trait UpdateEndpointOutput extends js.Object {
    var EndpointArn: EndpointArn
  }

  object UpdateEndpointOutput {
    def apply(
      EndpointArn: EndpointArn): UpdateEndpointOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEndpointOutput]
    }
  }

  @js.native
  trait UpdateEndpointWeightsAndCapacitiesInput extends js.Object {
    var DesiredWeightsAndCapacities: DesiredWeightAndCapacityList
    var EndpointName: EndpointName
  }

  object UpdateEndpointWeightsAndCapacitiesInput {
    def apply(
      DesiredWeightsAndCapacities: DesiredWeightAndCapacityList,
      EndpointName: EndpointName): UpdateEndpointWeightsAndCapacitiesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DesiredWeightsAndCapacities" -> DesiredWeightsAndCapacities.asInstanceOf[js.Any],
        "EndpointName" -> EndpointName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEndpointWeightsAndCapacitiesInput]
    }
  }

  @js.native
  trait UpdateEndpointWeightsAndCapacitiesOutput extends js.Object {
    var EndpointArn: EndpointArn
  }

  object UpdateEndpointWeightsAndCapacitiesOutput {
    def apply(
      EndpointArn: EndpointArn): UpdateEndpointWeightsAndCapacitiesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEndpointWeightsAndCapacitiesOutput]
    }
  }

  @js.native
  trait UpdateNotebookInstanceInput extends js.Object {
    var NotebookInstanceName: NotebookInstanceName
    var AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes]
    var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls]
    var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl]
    var DisassociateAcceleratorTypes: js.UndefOr[DisassociateNotebookInstanceAcceleratorTypes]
    var DisassociateAdditionalCodeRepositories: js.UndefOr[DisassociateAdditionalCodeRepositories]
    var DisassociateDefaultCodeRepository: js.UndefOr[DisassociateDefaultCodeRepository]
    var DisassociateLifecycleConfig: js.UndefOr[DisassociateNotebookInstanceLifecycleConfig]
    var InstanceType: js.UndefOr[InstanceType]
    var LifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName]
    var RoleArn: js.UndefOr[RoleArn]
    var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB]
  }

  object UpdateNotebookInstanceInput {
    def apply(
      NotebookInstanceName: NotebookInstanceName,
      AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes] = js.undefined,
      AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.undefined,
      DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.undefined,
      DisassociateAcceleratorTypes: js.UndefOr[DisassociateNotebookInstanceAcceleratorTypes] = js.undefined,
      DisassociateAdditionalCodeRepositories: js.UndefOr[DisassociateAdditionalCodeRepositories] = js.undefined,
      DisassociateDefaultCodeRepository: js.UndefOr[DisassociateDefaultCodeRepository] = js.undefined,
      DisassociateLifecycleConfig: js.UndefOr[DisassociateNotebookInstanceLifecycleConfig] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      LifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined,
      VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.undefined): UpdateNotebookInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceName" -> NotebookInstanceName.asInstanceOf[js.Any],
        "AcceleratorTypes" -> AcceleratorTypes.map { x => x.asInstanceOf[js.Any] },
        "AdditionalCodeRepositories" -> AdditionalCodeRepositories.map { x => x.asInstanceOf[js.Any] },
        "DefaultCodeRepository" -> DefaultCodeRepository.map { x => x.asInstanceOf[js.Any] },
        "DisassociateAcceleratorTypes" -> DisassociateAcceleratorTypes.map { x => x.asInstanceOf[js.Any] },
        "DisassociateAdditionalCodeRepositories" -> DisassociateAdditionalCodeRepositories.map { x => x.asInstanceOf[js.Any] },
        "DisassociateDefaultCodeRepository" -> DisassociateDefaultCodeRepository.map { x => x.asInstanceOf[js.Any] },
        "DisassociateLifecycleConfig" -> DisassociateLifecycleConfig.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "LifecycleConfigName" -> LifecycleConfigName.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
        "VolumeSizeInGB" -> VolumeSizeInGB.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateNotebookInstanceInput]
    }
  }

  @js.native
  trait UpdateNotebookInstanceLifecycleConfigInput extends js.Object {
    var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
    var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList]
    var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList]
  }

  object UpdateNotebookInstanceLifecycleConfigInput {
    def apply(
      NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName,
      OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined,
      OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined): UpdateNotebookInstanceLifecycleConfigInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceLifecycleConfigName" -> NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any],
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
    var WorkteamName: WorkteamName
    var Description: js.UndefOr[String200]
    var MemberDefinitions: js.UndefOr[MemberDefinitions]
  }

  object UpdateWorkteamRequest {
    def apply(
      WorkteamName: WorkteamName,
      Description: js.UndefOr[String200] = js.undefined,
      MemberDefinitions: js.UndefOr[MemberDefinitions] = js.undefined): UpdateWorkteamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkteamName" -> WorkteamName.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "MemberDefinitions" -> MemberDefinitions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateWorkteamRequest]
    }
  }

  @js.native
  trait UpdateWorkteamResponse extends js.Object {
    var Workteam: Workteam
  }

  object UpdateWorkteamResponse {
    def apply(
      Workteam: Workteam): UpdateWorkteamResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Workteam" -> Workteam.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateWorkteamResponse]
    }
  }

  /**
   * Specifies a VPC that your training jobs and hosted models have access to. Control access to and from your training and model containers by configuring the VPC. For more information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html">Protect Endpoints by Using an Amazon Virtual Private Cloud</a> and <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect Training Jobs by Using an Amazon Virtual Private Cloud</a>.
   */
  @js.native
  trait VpcConfig extends js.Object {
    var SecurityGroupIds: VpcSecurityGroupIds
    var Subnets: Subnets
  }

  object VpcConfig {
    def apply(
      SecurityGroupIds: VpcSecurityGroupIds,
      Subnets: Subnets): VpcConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecurityGroupIds" -> SecurityGroupIds.asInstanceOf[js.Any],
        "Subnets" -> Subnets.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcConfig]
    }
  }

  /**
   * Provides details about a labeling work team.
   */
  @js.native
  trait Workteam extends js.Object {
    var Description: String200
    var MemberDefinitions: MemberDefinitions
    var WorkteamArn: WorkteamArn
    var WorkteamName: WorkteamName
    var CreateDate: js.UndefOr[Timestamp]
    var LastUpdatedDate: js.UndefOr[Timestamp]
    var ProductListingIds: js.UndefOr[ProductListings]
    var SubDomain: js.UndefOr[String]
  }

  object Workteam {
    def apply(
      Description: String200,
      MemberDefinitions: MemberDefinitions,
      WorkteamArn: WorkteamArn,
      WorkteamName: WorkteamName,
      CreateDate: js.UndefOr[Timestamp] = js.undefined,
      LastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
      ProductListingIds: js.UndefOr[ProductListings] = js.undefined,
      SubDomain: js.UndefOr[String] = js.undefined): Workteam = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.asInstanceOf[js.Any],
        "MemberDefinitions" -> MemberDefinitions.asInstanceOf[js.Any],
        "WorkteamArn" -> WorkteamArn.asInstanceOf[js.Any],
        "WorkteamName" -> WorkteamName.asInstanceOf[js.Any],
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] },
        "LastUpdatedDate" -> LastUpdatedDate.map { x => x.asInstanceOf[js.Any] },
        "ProductListingIds" -> ProductListingIds.map { x => x.asInstanceOf[js.Any] },
        "SubDomain" -> SubDomain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Workteam]
    }
  }
}
