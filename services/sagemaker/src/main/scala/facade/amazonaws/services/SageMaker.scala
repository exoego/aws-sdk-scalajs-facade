package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object sagemaker {
  type Accept                                       = String
  type AccountId                                    = String
  type AdditionalCodeRepositoryNamesOrUrls          = js.Array[CodeRepositoryNameOrUrl]
  type AlgorithmArn                                 = String
  type AlgorithmImage                               = String
  type AlgorithmSortBy                              = String
  type AlgorithmStatus                              = String
  type AlgorithmStatusItemList                      = js.Array[AlgorithmStatusItem]
  type AlgorithmSummaryList                         = js.Array[AlgorithmSummary]
  type AlgorithmValidationProfiles                  = js.Array[AlgorithmValidationProfile]
  type ArnOrName                                    = String
  type AssemblyType                                 = String
  type AttributeName                                = String
  type AttributeNames                               = js.Array[AttributeName]
  type BatchStrategy                                = String
  type BillableTimeInSeconds                        = Int
  type BooleanOperator                              = String
  type Branch                                       = String
  type CategoricalParameterRanges                   = js.Array[CategoricalParameterRange]
  type Cents                                        = Int
  type CertifyForMarketplace                        = Boolean
  type ChannelName                                  = String
  type ChannelSpecifications                        = js.Array[ChannelSpecification]
  type CodeRepositoryArn                            = String
  type CodeRepositoryContains                       = String
  type CodeRepositoryNameContains                   = String
  type CodeRepositoryNameOrUrl                      = String
  type CodeRepositorySortBy                         = String
  type CodeRepositorySortOrder                      = String
  type CodeRepositorySummaryList                    = js.Array[CodeRepositorySummary]
  type CognitoClientId                              = String
  type CognitoUserGroup                             = String
  type CognitoUserPool                              = String
  type CompilationJobArn                            = String
  type CompilationJobStatus                         = String
  type CompilationJobSummaries                      = js.Array[CompilationJobSummary]
  type CompressionType                              = String
  type CompressionTypes                             = js.Array[CompressionType]
  type ContainerDefinitionList                      = js.Array[ContainerDefinition]
  type ContainerHostname                            = String
  type ContentClassifier                            = String
  type ContentClassifiers                           = js.Array[ContentClassifier]
  type ContentType                                  = String
  type ContentTypes                                 = js.Array[ContentType]
  type ContinuousParameterRanges                    = js.Array[ContinuousParameterRange]
  type CreationTime                                 = js.Date
  type DataInputConfig                              = String
  type DeployedImages                               = js.Array[DeployedImage]
  type DesiredWeightAndCapacityList                 = js.Array[DesiredWeightAndCapacity]
  type DetailedAlgorithmStatus                      = String
  type DetailedModelPackageStatus                   = String
  type DirectInternetAccess                         = String
  type DirectoryPath                                = String
  type DisassociateAdditionalCodeRepositories       = Boolean
  type DisassociateDefaultCodeRepository            = Boolean
  type DisassociateNotebookInstanceAcceleratorTypes = Boolean
  type DisassociateNotebookInstanceLifecycleConfig  = Boolean
  type Dollars                                      = Int
  type EndpointArn                                  = String
  type EndpointConfigArn                            = String
  type EndpointConfigName                           = String
  type EndpointConfigNameContains                   = String
  type EndpointConfigSortKey                        = String
  type EndpointConfigSummaryList                    = js.Array[EndpointConfigSummary]
  type EndpointName                                 = String
  type EndpointNameContains                         = String
  type EndpointSortKey                              = String
  type EndpointStatus                               = String
  type EndpointSummaryList                          = js.Array[EndpointSummary]
  type EntityDescription                            = String
  type EntityName                                   = String
  type EnvironmentKey                               = String
  type EnvironmentMap                               = js.Dictionary[EnvironmentValue]
  type EnvironmentValue                             = String
  type FailureReason                                = String
  type FileSystemAccessMode                         = String
  type FileSystemId                                 = String
  type FileSystemType                               = String
  type FilterList                                   = js.Array[Filter]
  type FilterValue                                  = String
  type FinalMetricDataList                          = js.Array[MetricData]
  type Framework                                    = String
  type GitConfigUrl                                 = String
  type HyperParameterScalingType                    = String
  type HyperParameterSpecifications                 = js.Array[HyperParameterSpecification]
  type HyperParameterTrainingJobSummaries           = js.Array[HyperParameterTrainingJobSummary]
  type HyperParameterTuningJobArn                   = String
  type HyperParameterTuningJobName                  = String
  type HyperParameterTuningJobObjectiveType         = String
  type HyperParameterTuningJobObjectives            = js.Array[HyperParameterTuningJobObjective]
  type HyperParameterTuningJobSortByOptions         = String
  type HyperParameterTuningJobStatus                = String
  type HyperParameterTuningJobStrategyType          = String
  type HyperParameterTuningJobSummaries             = js.Array[HyperParameterTuningJobSummary]
  type HyperParameterTuningJobWarmStartType         = String
  type HyperParameters                              = js.Dictionary[ParameterValue]
  type Image                                        = String
  type ImageDigest                                  = String
  type InputDataConfig                              = js.Array[Channel]
  type InputModes                                   = js.Array[TrainingInputMode]
  type InstanceType                                 = String
  type IntegerParameterRanges                       = js.Array[IntegerParameterRange]
  type JobReferenceCode                             = String
  type JobReferenceCodeContains                     = String
  type JoinSource                                   = String
  type JsonPath                                     = String
  type KmsKeyId                                     = String
  type LabelAttributeName                           = String
  type LabelCounter                                 = Int
  type LabelingJobAlgorithmSpecificationArn         = String
  type LabelingJobArn                               = String
  type LabelingJobForWorkteamSummaryList            = js.Array[LabelingJobForWorkteamSummary]
  type LabelingJobName                              = String
  type LabelingJobStatus                            = String
  type LabelingJobSummaryList                       = js.Array[LabelingJobSummary]
  type LambdaFunctionArn                            = String
  type LastModifiedTime                             = js.Date
  type ListCompilationJobsSortBy                    = String
  type ListLabelingJobsForWorkteamSortByOptions     = String
  type ListTagsMaxResults                           = Int
  type ListWorkteamsSortByOptions                   = String
  type MaxConcurrentTaskCount                       = Int
  type MaxConcurrentTransforms                      = Int
  type MaxHumanLabeledObjectCount                   = Int
  type MaxNumberOfTrainingJobs                      = Int
  type MaxParallelTrainingJobs                      = Int
  type MaxPayloadInMB                               = Int
  type MaxPercentageOfInputDatasetLabeled           = Int
  type MaxResults                                   = Int
  type MaxRuntimeInSeconds                          = Int
  type MaxWaitTimeInSeconds                         = Int
  type MemberDefinitions                            = js.Array[MemberDefinition]
  type MetricDefinitionList                         = js.Array[MetricDefinition]
  type MetricName                                   = String
  type MetricRegex                                  = String
  type MetricValue                                  = Float
  type ModelArn                                     = String
  type ModelName                                    = String
  type ModelNameContains                            = String
  type ModelPackageArn                              = String
  type ModelPackageContainerDefinitionList          = js.Array[ModelPackageContainerDefinition]
  type ModelPackageSortBy                           = String
  type ModelPackageStatus                           = String
  type ModelPackageStatusItemList                   = js.Array[ModelPackageStatusItem]
  type ModelPackageSummaryList                      = js.Array[ModelPackageSummary]
  type ModelPackageValidationProfiles               = js.Array[ModelPackageValidationProfile]
  type ModelSortKey                                 = String
  type ModelSummaryList                             = js.Array[ModelSummary]
  type NameContains                                 = String
  type NestedFiltersList                            = js.Array[NestedFilters]
  type NetworkInterfaceId                           = String
  type NextToken                                    = String
  type NotebookInstanceAcceleratorType              = String
  type NotebookInstanceAcceleratorTypes             = js.Array[NotebookInstanceAcceleratorType]
  type NotebookInstanceArn                          = String
  type NotebookInstanceLifecycleConfigArn           = String
  type NotebookInstanceLifecycleConfigContent       = String
  type NotebookInstanceLifecycleConfigList          = js.Array[NotebookInstanceLifecycleHook]
  type NotebookInstanceLifecycleConfigName          = String
  type NotebookInstanceLifecycleConfigNameContains  = String
  type NotebookInstanceLifecycleConfigSortKey       = String
  type NotebookInstanceLifecycleConfigSortOrder     = String
  type NotebookInstanceLifecycleConfigSummaryList   = js.Array[NotebookInstanceLifecycleConfigSummary]
  type NotebookInstanceName                         = String
  type NotebookInstanceNameContains                 = String
  type NotebookInstanceSortKey                      = String
  type NotebookInstanceSortOrder                    = String
  type NotebookInstanceStatus                       = String
  type NotebookInstanceSummaryList                  = js.Array[NotebookInstanceSummary]
  type NotebookInstanceUrl                          = String
  type NotebookInstanceVolumeSizeInGB               = Int
  type NotificationTopicArn                         = String
  type NumberOfHumanWorkersPerDataObject            = Int
  type ObjectiveStatus                              = String
  type ObjectiveStatusCounter                       = Int
  type Operator                                     = String
  type OrderKey                                     = String
  type PaginationToken                              = String
  type ParameterKey                                 = String
  type ParameterName                                = String
  type ParameterType                                = String
  type ParameterValue                               = String
  type ParameterValues                              = js.Array[ParameterValue]
  type ParentHyperParameterTuningJobs               = js.Array[ParentHyperParameterTuningJob]
  type ProductId                                    = String
  type ProductListings                              = js.Array[String]
  type ProductionVariantAcceleratorType             = String
  type ProductionVariantInstanceType                = String
  type ProductionVariantList                        = js.Array[ProductionVariant]
  type ProductionVariantSummaryList                 = js.Array[ProductionVariantSummary]
  type PropertyNameHint                             = String
  type PropertyNameSuggestionList                   = js.Array[PropertyNameSuggestion]
  type RealtimeInferenceInstanceTypes               = js.Array[ProductionVariantInstanceType]
  type RecordWrapper                                = String
  type RenderingErrorList                           = js.Array[RenderingError]
  type ResourceArn                                  = String
  type ResourcePropertyName                         = String
  type ResourceType                                 = String
  type ResponseMIMEType                             = String
  type ResponseMIMETypes                            = js.Array[ResponseMIMEType]
  type RoleArn                                      = String
  type RootAccess                                   = String
  type S3DataDistribution                           = String
  type S3DataType                                   = String
  type S3Uri                                        = String
  type SearchExpressionList                         = js.Array[SearchExpression]
  type SearchResultsList                            = js.Array[SearchRecord]
  type SearchSortOrder                              = String
  type SecondaryStatus                              = String
  type SecondaryStatusTransitions                   = js.Array[SecondaryStatusTransition]
  type SecretArn                                    = String
  type SecurityGroupId                              = String
  type SecurityGroupIds                             = js.Array[SecurityGroupId]
  type Seed                                         = Double
  type SessionExpirationDurationInSeconds           = Int
  type SortBy                                       = String
  type SortOrder                                    = String
  type SourceAlgorithmList                          = js.Array[SourceAlgorithm]
  type SplitType                                    = String
  type StatusMessage                                = String
  type String200                                    = String
  type SubnetId                                     = String
  type Subnets                                      = js.Array[SubnetId]
  type SubscribedWorkteams                          = js.Array[SubscribedWorkteam]
  type Success                                      = Boolean
  type TagKey                                       = String
  type TagKeyList                                   = js.Array[TagKey]
  type TagList                                      = js.Array[Tag]
  type TagValue                                     = String
  type TargetDevice                                 = String
  type TaskAvailabilityLifetimeInSeconds            = Int
  type TaskCount                                    = Int
  type TaskDescription                              = String
  type TaskInput                                    = String
  type TaskKeyword                                  = String
  type TaskKeywords                                 = js.Array[TaskKeyword]
  type TaskTimeLimitInSeconds                       = Int
  type TaskTitle                                    = String
  type TemplateContent                              = String
  type TenthFractionsOfACent                        = Int
  type Timestamp                                    = js.Date
  type TrainingInputMode                            = String
  type TrainingInstanceCount                        = Int
  type TrainingInstanceType                         = String
  type TrainingInstanceTypes                        = js.Array[TrainingInstanceType]
  type TrainingJobArn                               = String
  type TrainingJobEarlyStoppingType                 = String
  type TrainingJobName                              = String
  type TrainingJobSortByOptions                     = String
  type TrainingJobStatus                            = String
  type TrainingJobStatusCounter                     = Int
  type TrainingJobSummaries                         = js.Array[TrainingJobSummary]
  type TrainingTimeInSeconds                        = Int
  type TransformEnvironmentKey                      = String
  type TransformEnvironmentMap                      = js.Dictionary[TransformEnvironmentValue]
  type TransformEnvironmentValue                    = String
  type TransformInstanceCount                       = Int
  type TransformInstanceType                        = String
  type TransformInstanceTypes                       = js.Array[TransformInstanceType]
  type TransformJobArn                              = String
  type TransformJobName                             = String
  type TransformJobStatus                           = String
  type TransformJobSummaries                        = js.Array[TransformJobSummary]
  type Url                                          = String
  type VariantName                                  = String
  type VariantWeight                                = Float
  type VolumeSizeInGB                               = Int
  type VpcSecurityGroupIds                          = js.Array[SecurityGroupId]
  type WorkteamArn                                  = String
  type WorkteamName                                 = String
  type Workteams                                    = js.Array[Workteam]

  implicit final class SageMakerOps(private val service: SageMaker) extends AnyVal {

    @inline def addTagsFuture(params: AddTagsInput): Future[AddTagsOutput] = service.addTags(params).promise.toFuture
    @inline def createAlgorithmFuture(params: CreateAlgorithmInput): Future[CreateAlgorithmOutput] =
      service.createAlgorithm(params).promise.toFuture
    @inline def createCodeRepositoryFuture(params: CreateCodeRepositoryInput): Future[CreateCodeRepositoryOutput] =
      service.createCodeRepository(params).promise.toFuture
    @inline def createCompilationJobFuture(params: CreateCompilationJobRequest): Future[CreateCompilationJobResponse] =
      service.createCompilationJob(params).promise.toFuture
    @inline def createEndpointConfigFuture(params: CreateEndpointConfigInput): Future[CreateEndpointConfigOutput] =
      service.createEndpointConfig(params).promise.toFuture
    @inline def createEndpointFuture(params: CreateEndpointInput): Future[CreateEndpointOutput] =
      service.createEndpoint(params).promise.toFuture
    @inline def createHyperParameterTuningJobFuture(
        params: CreateHyperParameterTuningJobRequest
    ): Future[CreateHyperParameterTuningJobResponse] = service.createHyperParameterTuningJob(params).promise.toFuture
    @inline def createLabelingJobFuture(params: CreateLabelingJobRequest): Future[CreateLabelingJobResponse] =
      service.createLabelingJob(params).promise.toFuture
    @inline def createModelFuture(params: CreateModelInput): Future[CreateModelOutput] =
      service.createModel(params).promise.toFuture
    @inline def createModelPackageFuture(params: CreateModelPackageInput): Future[CreateModelPackageOutput] =
      service.createModelPackage(params).promise.toFuture
    @inline def createNotebookInstanceFuture(
        params: CreateNotebookInstanceInput
    ): Future[CreateNotebookInstanceOutput] = service.createNotebookInstance(params).promise.toFuture
    @inline def createNotebookInstanceLifecycleConfigFuture(
        params: CreateNotebookInstanceLifecycleConfigInput
    ): Future[CreateNotebookInstanceLifecycleConfigOutput] =
      service.createNotebookInstanceLifecycleConfig(params).promise.toFuture
    @inline def createPresignedNotebookInstanceUrlFuture(
        params: CreatePresignedNotebookInstanceUrlInput
    ): Future[CreatePresignedNotebookInstanceUrlOutput] =
      service.createPresignedNotebookInstanceUrl(params).promise.toFuture
    @inline def createTrainingJobFuture(params: CreateTrainingJobRequest): Future[CreateTrainingJobResponse] =
      service.createTrainingJob(params).promise.toFuture
    @inline def createTransformJobFuture(params: CreateTransformJobRequest): Future[CreateTransformJobResponse] =
      service.createTransformJob(params).promise.toFuture
    @inline def createWorkteamFuture(params: CreateWorkteamRequest): Future[CreateWorkteamResponse] =
      service.createWorkteam(params).promise.toFuture
    @inline def deleteAlgorithmFuture(params: DeleteAlgorithmInput): Future[js.Object] =
      service.deleteAlgorithm(params).promise.toFuture
    @inline def deleteCodeRepositoryFuture(params: DeleteCodeRepositoryInput): Future[js.Object] =
      service.deleteCodeRepository(params).promise.toFuture
    @inline def deleteEndpointConfigFuture(params: DeleteEndpointConfigInput): Future[js.Object] =
      service.deleteEndpointConfig(params).promise.toFuture
    @inline def deleteEndpointFuture(params: DeleteEndpointInput): Future[js.Object] =
      service.deleteEndpoint(params).promise.toFuture
    @inline def deleteModelFuture(params: DeleteModelInput): Future[js.Object] =
      service.deleteModel(params).promise.toFuture
    @inline def deleteModelPackageFuture(params: DeleteModelPackageInput): Future[js.Object] =
      service.deleteModelPackage(params).promise.toFuture
    @inline def deleteNotebookInstanceFuture(params: DeleteNotebookInstanceInput): Future[js.Object] =
      service.deleteNotebookInstance(params).promise.toFuture
    @inline def deleteNotebookInstanceLifecycleConfigFuture(
        params: DeleteNotebookInstanceLifecycleConfigInput
    ): Future[js.Object] = service.deleteNotebookInstanceLifecycleConfig(params).promise.toFuture
    @inline def deleteTagsFuture(params: DeleteTagsInput): Future[DeleteTagsOutput] =
      service.deleteTags(params).promise.toFuture
    @inline def deleteWorkteamFuture(params: DeleteWorkteamRequest): Future[DeleteWorkteamResponse] =
      service.deleteWorkteam(params).promise.toFuture
    @inline def describeAlgorithmFuture(params: DescribeAlgorithmInput): Future[DescribeAlgorithmOutput] =
      service.describeAlgorithm(params).promise.toFuture
    @inline def describeCodeRepositoryFuture(
        params: DescribeCodeRepositoryInput
    ): Future[DescribeCodeRepositoryOutput] = service.describeCodeRepository(params).promise.toFuture
    @inline def describeCompilationJobFuture(
        params: DescribeCompilationJobRequest
    ): Future[DescribeCompilationJobResponse] = service.describeCompilationJob(params).promise.toFuture
    @inline def describeEndpointConfigFuture(
        params: DescribeEndpointConfigInput
    ): Future[DescribeEndpointConfigOutput] = service.describeEndpointConfig(params).promise.toFuture
    @inline def describeEndpointFuture(params: DescribeEndpointInput): Future[DescribeEndpointOutput] =
      service.describeEndpoint(params).promise.toFuture
    @inline def describeHyperParameterTuningJobFuture(
        params: DescribeHyperParameterTuningJobRequest
    ): Future[DescribeHyperParameterTuningJobResponse] =
      service.describeHyperParameterTuningJob(params).promise.toFuture
    @inline def describeLabelingJobFuture(params: DescribeLabelingJobRequest): Future[DescribeLabelingJobResponse] =
      service.describeLabelingJob(params).promise.toFuture
    @inline def describeModelFuture(params: DescribeModelInput): Future[DescribeModelOutput] =
      service.describeModel(params).promise.toFuture
    @inline def describeModelPackageFuture(params: DescribeModelPackageInput): Future[DescribeModelPackageOutput] =
      service.describeModelPackage(params).promise.toFuture
    @inline def describeNotebookInstanceFuture(
        params: DescribeNotebookInstanceInput
    ): Future[DescribeNotebookInstanceOutput] = service.describeNotebookInstance(params).promise.toFuture
    @inline def describeNotebookInstanceLifecycleConfigFuture(
        params: DescribeNotebookInstanceLifecycleConfigInput
    ): Future[DescribeNotebookInstanceLifecycleConfigOutput] =
      service.describeNotebookInstanceLifecycleConfig(params).promise.toFuture
    @inline def describeSubscribedWorkteamFuture(
        params: DescribeSubscribedWorkteamRequest
    ): Future[DescribeSubscribedWorkteamResponse] = service.describeSubscribedWorkteam(params).promise.toFuture
    @inline def describeTrainingJobFuture(params: DescribeTrainingJobRequest): Future[DescribeTrainingJobResponse] =
      service.describeTrainingJob(params).promise.toFuture
    @inline def describeTransformJobFuture(params: DescribeTransformJobRequest): Future[DescribeTransformJobResponse] =
      service.describeTransformJob(params).promise.toFuture
    @inline def describeWorkteamFuture(params: DescribeWorkteamRequest): Future[DescribeWorkteamResponse] =
      service.describeWorkteam(params).promise.toFuture
    @inline def getSearchSuggestionsFuture(params: GetSearchSuggestionsRequest): Future[GetSearchSuggestionsResponse] =
      service.getSearchSuggestions(params).promise.toFuture
    @inline def listAlgorithmsFuture(params: ListAlgorithmsInput): Future[ListAlgorithmsOutput] =
      service.listAlgorithms(params).promise.toFuture
    @inline def listCodeRepositoriesFuture(params: ListCodeRepositoriesInput): Future[ListCodeRepositoriesOutput] =
      service.listCodeRepositories(params).promise.toFuture
    @inline def listCompilationJobsFuture(params: ListCompilationJobsRequest): Future[ListCompilationJobsResponse] =
      service.listCompilationJobs(params).promise.toFuture
    @inline def listEndpointConfigsFuture(params: ListEndpointConfigsInput): Future[ListEndpointConfigsOutput] =
      service.listEndpointConfigs(params).promise.toFuture
    @inline def listEndpointsFuture(params: ListEndpointsInput): Future[ListEndpointsOutput] =
      service.listEndpoints(params).promise.toFuture
    @inline def listHyperParameterTuningJobsFuture(
        params: ListHyperParameterTuningJobsRequest
    ): Future[ListHyperParameterTuningJobsResponse] = service.listHyperParameterTuningJobs(params).promise.toFuture
    @inline def listLabelingJobsForWorkteamFuture(
        params: ListLabelingJobsForWorkteamRequest
    ): Future[ListLabelingJobsForWorkteamResponse] = service.listLabelingJobsForWorkteam(params).promise.toFuture
    @inline def listLabelingJobsFuture(params: ListLabelingJobsRequest): Future[ListLabelingJobsResponse] =
      service.listLabelingJobs(params).promise.toFuture
    @inline def listModelPackagesFuture(params: ListModelPackagesInput): Future[ListModelPackagesOutput] =
      service.listModelPackages(params).promise.toFuture
    @inline def listModelsFuture(params: ListModelsInput): Future[ListModelsOutput] =
      service.listModels(params).promise.toFuture
    @inline def listNotebookInstanceLifecycleConfigsFuture(
        params: ListNotebookInstanceLifecycleConfigsInput
    ): Future[ListNotebookInstanceLifecycleConfigsOutput] =
      service.listNotebookInstanceLifecycleConfigs(params).promise.toFuture
    @inline def listNotebookInstancesFuture(params: ListNotebookInstancesInput): Future[ListNotebookInstancesOutput] =
      service.listNotebookInstances(params).promise.toFuture
    @inline def listSubscribedWorkteamsFuture(
        params: ListSubscribedWorkteamsRequest
    ): Future[ListSubscribedWorkteamsResponse] = service.listSubscribedWorkteams(params).promise.toFuture
    @inline def listTagsFuture(params: ListTagsInput): Future[ListTagsOutput] =
      service.listTags(params).promise.toFuture
    @inline def listTrainingJobsForHyperParameterTuningJobFuture(
        params: ListTrainingJobsForHyperParameterTuningJobRequest
    ): Future[ListTrainingJobsForHyperParameterTuningJobResponse] =
      service.listTrainingJobsForHyperParameterTuningJob(params).promise.toFuture
    @inline def listTrainingJobsFuture(params: ListTrainingJobsRequest): Future[ListTrainingJobsResponse] =
      service.listTrainingJobs(params).promise.toFuture
    @inline def listTransformJobsFuture(params: ListTransformJobsRequest): Future[ListTransformJobsResponse] =
      service.listTransformJobs(params).promise.toFuture
    @inline def listWorkteamsFuture(params: ListWorkteamsRequest): Future[ListWorkteamsResponse] =
      service.listWorkteams(params).promise.toFuture
    @inline def renderUiTemplateFuture(params: RenderUiTemplateRequest): Future[RenderUiTemplateResponse] =
      service.renderUiTemplate(params).promise.toFuture
    @inline def searchFuture(params: SearchRequest): Future[SearchResponse] = service.search(params).promise.toFuture
    @inline def startNotebookInstanceFuture(params: StartNotebookInstanceInput): Future[js.Object] =
      service.startNotebookInstance(params).promise.toFuture
    @inline def stopCompilationJobFuture(params: StopCompilationJobRequest): Future[js.Object] =
      service.stopCompilationJob(params).promise.toFuture
    @inline def stopHyperParameterTuningJobFuture(params: StopHyperParameterTuningJobRequest): Future[js.Object] =
      service.stopHyperParameterTuningJob(params).promise.toFuture
    @inline def stopLabelingJobFuture(params: StopLabelingJobRequest): Future[js.Object] =
      service.stopLabelingJob(params).promise.toFuture
    @inline def stopNotebookInstanceFuture(params: StopNotebookInstanceInput): Future[js.Object] =
      service.stopNotebookInstance(params).promise.toFuture
    @inline def stopTrainingJobFuture(params: StopTrainingJobRequest): Future[js.Object] =
      service.stopTrainingJob(params).promise.toFuture
    @inline def stopTransformJobFuture(params: StopTransformJobRequest): Future[js.Object] =
      service.stopTransformJob(params).promise.toFuture
    @inline def updateCodeRepositoryFuture(params: UpdateCodeRepositoryInput): Future[UpdateCodeRepositoryOutput] =
      service.updateCodeRepository(params).promise.toFuture
    @inline def updateEndpointFuture(params: UpdateEndpointInput): Future[UpdateEndpointOutput] =
      service.updateEndpoint(params).promise.toFuture
    @inline def updateEndpointWeightsAndCapacitiesFuture(
        params: UpdateEndpointWeightsAndCapacitiesInput
    ): Future[UpdateEndpointWeightsAndCapacitiesOutput] =
      service.updateEndpointWeightsAndCapacities(params).promise.toFuture
    @inline def updateNotebookInstanceFuture(
        params: UpdateNotebookInstanceInput
    ): Future[UpdateNotebookInstanceOutput] = service.updateNotebookInstance(params).promise.toFuture
    @inline def updateNotebookInstanceLifecycleConfigFuture(
        params: UpdateNotebookInstanceLifecycleConfigInput
    ): Future[UpdateNotebookInstanceLifecycleConfigOutput] =
      service.updateNotebookInstanceLifecycleConfig(params).promise.toFuture
    @inline def updateWorkteamFuture(params: UpdateWorkteamRequest): Future[UpdateWorkteamResponse] =
      service.updateWorkteam(params).promise.toFuture
  }
}

package sagemaker {
  @js.native
  @JSImport("aws-sdk", "SageMaker")
  class SageMaker() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTags(params: AddTagsInput): Request[AddTagsOutput]                                            = js.native
    def createAlgorithm(params: CreateAlgorithmInput): Request[CreateAlgorithmOutput]                    = js.native
    def createCodeRepository(params: CreateCodeRepositoryInput): Request[CreateCodeRepositoryOutput]     = js.native
    def createCompilationJob(params: CreateCompilationJobRequest): Request[CreateCompilationJobResponse] = js.native
    def createEndpoint(params: CreateEndpointInput): Request[CreateEndpointOutput]                       = js.native
    def createEndpointConfig(params: CreateEndpointConfigInput): Request[CreateEndpointConfigOutput]     = js.native
    def createHyperParameterTuningJob(
        params: CreateHyperParameterTuningJobRequest
    ): Request[CreateHyperParameterTuningJobResponse]                                                      = js.native
    def createLabelingJob(params: CreateLabelingJobRequest): Request[CreateLabelingJobResponse]            = js.native
    def createModel(params: CreateModelInput): Request[CreateModelOutput]                                  = js.native
    def createModelPackage(params: CreateModelPackageInput): Request[CreateModelPackageOutput]             = js.native
    def createNotebookInstance(params: CreateNotebookInstanceInput): Request[CreateNotebookInstanceOutput] = js.native
    def createNotebookInstanceLifecycleConfig(
        params: CreateNotebookInstanceLifecycleConfigInput
    ): Request[CreateNotebookInstanceLifecycleConfigOutput] = js.native
    def createPresignedNotebookInstanceUrl(
        params: CreatePresignedNotebookInstanceUrlInput
    ): Request[CreatePresignedNotebookInstanceUrlOutput]                                           = js.native
    def createTrainingJob(params: CreateTrainingJobRequest): Request[CreateTrainingJobResponse]    = js.native
    def createTransformJob(params: CreateTransformJobRequest): Request[CreateTransformJobResponse] = js.native
    def createWorkteam(params: CreateWorkteamRequest): Request[CreateWorkteamResponse]             = js.native
    def deleteAlgorithm(params: DeleteAlgorithmInput): Request[js.Object]                          = js.native
    def deleteCodeRepository(params: DeleteCodeRepositoryInput): Request[js.Object]                = js.native
    def deleteEndpoint(params: DeleteEndpointInput): Request[js.Object]                            = js.native
    def deleteEndpointConfig(params: DeleteEndpointConfigInput): Request[js.Object]                = js.native
    def deleteModel(params: DeleteModelInput): Request[js.Object]                                  = js.native
    def deleteModelPackage(params: DeleteModelPackageInput): Request[js.Object]                    = js.native
    def deleteNotebookInstance(params: DeleteNotebookInstanceInput): Request[js.Object]            = js.native
    def deleteNotebookInstanceLifecycleConfig(params: DeleteNotebookInstanceLifecycleConfigInput): Request[js.Object] =
      js.native
    def deleteTags(params: DeleteTagsInput): Request[DeleteTagsOutput]                                     = js.native
    def deleteWorkteam(params: DeleteWorkteamRequest): Request[DeleteWorkteamResponse]                     = js.native
    def describeAlgorithm(params: DescribeAlgorithmInput): Request[DescribeAlgorithmOutput]                = js.native
    def describeCodeRepository(params: DescribeCodeRepositoryInput): Request[DescribeCodeRepositoryOutput] = js.native
    def describeCompilationJob(params: DescribeCompilationJobRequest): Request[DescribeCompilationJobResponse] =
      js.native
    def describeEndpoint(params: DescribeEndpointInput): Request[DescribeEndpointOutput]                   = js.native
    def describeEndpointConfig(params: DescribeEndpointConfigInput): Request[DescribeEndpointConfigOutput] = js.native
    def describeHyperParameterTuningJob(
        params: DescribeHyperParameterTuningJobRequest
    ): Request[DescribeHyperParameterTuningJobResponse]                                               = js.native
    def describeLabelingJob(params: DescribeLabelingJobRequest): Request[DescribeLabelingJobResponse] = js.native
    def describeModel(params: DescribeModelInput): Request[DescribeModelOutput]                       = js.native
    def describeModelPackage(params: DescribeModelPackageInput): Request[DescribeModelPackageOutput]  = js.native
    def describeNotebookInstance(params: DescribeNotebookInstanceInput): Request[DescribeNotebookInstanceOutput] =
      js.native
    def describeNotebookInstanceLifecycleConfig(
        params: DescribeNotebookInstanceLifecycleConfigInput
    ): Request[DescribeNotebookInstanceLifecycleConfigOutput] = js.native
    def describeSubscribedWorkteam(
        params: DescribeSubscribedWorkteamRequest
    ): Request[DescribeSubscribedWorkteamResponse]                                                       = js.native
    def describeTrainingJob(params: DescribeTrainingJobRequest): Request[DescribeTrainingJobResponse]    = js.native
    def describeTransformJob(params: DescribeTransformJobRequest): Request[DescribeTransformJobResponse] = js.native
    def describeWorkteam(params: DescribeWorkteamRequest): Request[DescribeWorkteamResponse]             = js.native
    def getSearchSuggestions(params: GetSearchSuggestionsRequest): Request[GetSearchSuggestionsResponse] = js.native
    def listAlgorithms(params: ListAlgorithmsInput): Request[ListAlgorithmsOutput]                       = js.native
    def listCodeRepositories(params: ListCodeRepositoriesInput): Request[ListCodeRepositoriesOutput]     = js.native
    def listCompilationJobs(params: ListCompilationJobsRequest): Request[ListCompilationJobsResponse]    = js.native
    def listEndpointConfigs(params: ListEndpointConfigsInput): Request[ListEndpointConfigsOutput]        = js.native
    def listEndpoints(params: ListEndpointsInput): Request[ListEndpointsOutput]                          = js.native
    def listHyperParameterTuningJobs(
        params: ListHyperParameterTuningJobsRequest
    ): Request[ListHyperParameterTuningJobsResponse]                                         = js.native
    def listLabelingJobs(params: ListLabelingJobsRequest): Request[ListLabelingJobsResponse] = js.native
    def listLabelingJobsForWorkteam(
        params: ListLabelingJobsForWorkteamRequest
    ): Request[ListLabelingJobsForWorkteamResponse]                                         = js.native
    def listModelPackages(params: ListModelPackagesInput): Request[ListModelPackagesOutput] = js.native
    def listModels(params: ListModelsInput): Request[ListModelsOutput]                      = js.native
    def listNotebookInstanceLifecycleConfigs(
        params: ListNotebookInstanceLifecycleConfigsInput
    ): Request[ListNotebookInstanceLifecycleConfigsOutput]                                              = js.native
    def listNotebookInstances(params: ListNotebookInstancesInput): Request[ListNotebookInstancesOutput] = js.native
    def listSubscribedWorkteams(params: ListSubscribedWorkteamsRequest): Request[ListSubscribedWorkteamsResponse] =
      js.native
    def listTags(params: ListTagsInput): Request[ListTagsOutput]                             = js.native
    def listTrainingJobs(params: ListTrainingJobsRequest): Request[ListTrainingJobsResponse] = js.native
    def listTrainingJobsForHyperParameterTuningJob(
        params: ListTrainingJobsForHyperParameterTuningJobRequest
    ): Request[ListTrainingJobsForHyperParameterTuningJobResponse]                                   = js.native
    def listTransformJobs(params: ListTransformJobsRequest): Request[ListTransformJobsResponse]      = js.native
    def listWorkteams(params: ListWorkteamsRequest): Request[ListWorkteamsResponse]                  = js.native
    def renderUiTemplate(params: RenderUiTemplateRequest): Request[RenderUiTemplateResponse]         = js.native
    def search(params: SearchRequest): Request[SearchResponse]                                       = js.native
    def startNotebookInstance(params: StartNotebookInstanceInput): Request[js.Object]                = js.native
    def stopCompilationJob(params: StopCompilationJobRequest): Request[js.Object]                    = js.native
    def stopHyperParameterTuningJob(params: StopHyperParameterTuningJobRequest): Request[js.Object]  = js.native
    def stopLabelingJob(params: StopLabelingJobRequest): Request[js.Object]                          = js.native
    def stopNotebookInstance(params: StopNotebookInstanceInput): Request[js.Object]                  = js.native
    def stopTrainingJob(params: StopTrainingJobRequest): Request[js.Object]                          = js.native
    def stopTransformJob(params: StopTransformJobRequest): Request[js.Object]                        = js.native
    def updateCodeRepository(params: UpdateCodeRepositoryInput): Request[UpdateCodeRepositoryOutput] = js.native
    def updateEndpoint(params: UpdateEndpointInput): Request[UpdateEndpointOutput]                   = js.native
    def updateEndpointWeightsAndCapacities(
        params: UpdateEndpointWeightsAndCapacitiesInput
    ): Request[UpdateEndpointWeightsAndCapacitiesOutput]                                                   = js.native
    def updateNotebookInstance(params: UpdateNotebookInstanceInput): Request[UpdateNotebookInstanceOutput] = js.native
    def updateNotebookInstanceLifecycleConfig(
        params: UpdateNotebookInstanceLifecycleConfigInput
    ): Request[UpdateNotebookInstanceLifecycleConfigOutput]                            = js.native
    def updateWorkteam(params: UpdateWorkteamRequest): Request[UpdateWorkteamResponse] = js.native
  }

  @js.native
  trait AddTagsInput extends js.Object {
    var ResourceArn: ResourceArn
    var Tags: TagList
  }

  object AddTagsInput {
    @inline
    def apply(
        ResourceArn: ResourceArn,
        Tags: TagList
    ): AddTagsInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddTagsInput]
    }
  }

  @js.native
  trait AddTagsOutput extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object AddTagsOutput {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): AddTagsOutput = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddTagsOutput]
    }
  }

  object AlgorithmSortByEnum {
    val Name         = "Name"
    val CreationTime = "CreationTime"

    val values = js.Object.freeze(js.Array(Name, CreationTime))
  }

  /**
    * Specifies the training algorithm to use in a [[https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateTrainingJob.html|CreateTrainingJob]] request.
    *  For more information about algorithms provided by Amazon SageMaker, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html|Algorithms]]. For information about using your own algorithms, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html|Using Your Own Algorithms with Amazon SageMaker]].
    */
  @js.native
  trait AlgorithmSpecification extends js.Object {
    var TrainingInputMode: TrainingInputMode
    var AlgorithmName: js.UndefOr[ArnOrName]
    var MetricDefinitions: js.UndefOr[MetricDefinitionList]
    var TrainingImage: js.UndefOr[AlgorithmImage]
  }

  object AlgorithmSpecification {
    @inline
    def apply(
        TrainingInputMode: TrainingInputMode,
        AlgorithmName: js.UndefOr[ArnOrName] = js.undefined,
        MetricDefinitions: js.UndefOr[MetricDefinitionList] = js.undefined,
        TrainingImage: js.UndefOr[AlgorithmImage] = js.undefined
    ): AlgorithmSpecification = {
      val __obj = js.Dynamic.literal(
        "TrainingInputMode" -> TrainingInputMode.asInstanceOf[js.Any]
      )

      AlgorithmName.foreach(__v => __obj.updateDynamic("AlgorithmName")(__v.asInstanceOf[js.Any]))
      MetricDefinitions.foreach(__v => __obj.updateDynamic("MetricDefinitions")(__v.asInstanceOf[js.Any]))
      TrainingImage.foreach(__v => __obj.updateDynamic("TrainingImage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlgorithmSpecification]
    }
  }

  object AlgorithmStatusEnum {
    val Pending    = "Pending"
    val InProgress = "InProgress"
    val Completed  = "Completed"
    val Failed     = "Failed"
    val Deleting   = "Deleting"

    val values = js.Object.freeze(js.Array(Pending, InProgress, Completed, Failed, Deleting))
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
    @inline
    def apply(
        ImageScanStatuses: js.UndefOr[AlgorithmStatusItemList] = js.undefined,
        ValidationStatuses: js.UndefOr[AlgorithmStatusItemList] = js.undefined
    ): AlgorithmStatusDetails = {
      val __obj = js.Dynamic.literal()
      ImageScanStatuses.foreach(__v => __obj.updateDynamic("ImageScanStatuses")(__v.asInstanceOf[js.Any]))
      ValidationStatuses.foreach(__v => __obj.updateDynamic("ValidationStatuses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlgorithmStatusDetails]
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
    @inline
    def apply(
        Name: EntityName,
        Status: DetailedAlgorithmStatus,
        FailureReason: js.UndefOr[String] = js.undefined
    ): AlgorithmStatusItem = {
      val __obj = js.Dynamic.literal(
        "Name"   -> Name.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlgorithmStatusItem]
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
    @inline
    def apply(
        AlgorithmArn: AlgorithmArn,
        AlgorithmName: EntityName,
        AlgorithmStatus: AlgorithmStatus,
        CreationTime: CreationTime,
        AlgorithmDescription: js.UndefOr[EntityDescription] = js.undefined
    ): AlgorithmSummary = {
      val __obj = js.Dynamic.literal(
        "AlgorithmArn"    -> AlgorithmArn.asInstanceOf[js.Any],
        "AlgorithmName"   -> AlgorithmName.asInstanceOf[js.Any],
        "AlgorithmStatus" -> AlgorithmStatus.asInstanceOf[js.Any],
        "CreationTime"    -> CreationTime.asInstanceOf[js.Any]
      )

      AlgorithmDescription.foreach(__v => __obj.updateDynamic("AlgorithmDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlgorithmSummary]
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
    @inline
    def apply(
        ProfileName: EntityName,
        TrainingJobDefinition: TrainingJobDefinition,
        TransformJobDefinition: js.UndefOr[TransformJobDefinition] = js.undefined
    ): AlgorithmValidationProfile = {
      val __obj = js.Dynamic.literal(
        "ProfileName"           -> ProfileName.asInstanceOf[js.Any],
        "TrainingJobDefinition" -> TrainingJobDefinition.asInstanceOf[js.Any]
      )

      TransformJobDefinition.foreach(__v => __obj.updateDynamic("TransformJobDefinition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlgorithmValidationProfile]
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
    @inline
    def apply(
        ValidationProfiles: AlgorithmValidationProfiles,
        ValidationRole: RoleArn
    ): AlgorithmValidationSpecification = {
      val __obj = js.Dynamic.literal(
        "ValidationProfiles" -> ValidationProfiles.asInstanceOf[js.Any],
        "ValidationRole"     -> ValidationRole.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AlgorithmValidationSpecification]
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
    @inline
    def apply(
        AnnotationConsolidationLambdaArn: LambdaFunctionArn
    ): AnnotationConsolidationConfig = {
      val __obj = js.Dynamic.literal(
        "AnnotationConsolidationLambdaArn" -> AnnotationConsolidationLambdaArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AnnotationConsolidationConfig]
    }
  }

  object AssemblyTypeEnum {
    val None = "None"
    val Line = "Line"

    val values = js.Object.freeze(js.Array(None, Line))
  }

  object BatchStrategyEnum {
    val MultiRecord  = "MultiRecord"
    val SingleRecord = "SingleRecord"

    val values = js.Object.freeze(js.Array(MultiRecord, SingleRecord))
  }

  object BooleanOperatorEnum {
    val And = "And"
    val Or  = "Or"

    val values = js.Object.freeze(js.Array(And, Or))
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
    @inline
    def apply(
        Name: ParameterKey,
        Values: ParameterValues
    ): CategoricalParameterRange = {
      val __obj = js.Dynamic.literal(
        "Name"   -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CategoricalParameterRange]
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
    @inline
    def apply(
        Values: ParameterValues
    ): CategoricalParameterRangeSpecification = {
      val __obj = js.Dynamic.literal(
        "Values" -> Values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CategoricalParameterRangeSpecification]
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
    @inline
    def apply(
        ChannelName: ChannelName,
        DataSource: DataSource,
        CompressionType: js.UndefOr[CompressionType] = js.undefined,
        ContentType: js.UndefOr[ContentType] = js.undefined,
        InputMode: js.UndefOr[TrainingInputMode] = js.undefined,
        RecordWrapperType: js.UndefOr[RecordWrapper] = js.undefined,
        ShuffleConfig: js.UndefOr[ShuffleConfig] = js.undefined
    ): Channel = {
      val __obj = js.Dynamic.literal(
        "ChannelName" -> ChannelName.asInstanceOf[js.Any],
        "DataSource"  -> DataSource.asInstanceOf[js.Any]
      )

      CompressionType.foreach(__v => __obj.updateDynamic("CompressionType")(__v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      InputMode.foreach(__v => __obj.updateDynamic("InputMode")(__v.asInstanceOf[js.Any]))
      RecordWrapperType.foreach(__v => __obj.updateDynamic("RecordWrapperType")(__v.asInstanceOf[js.Any]))
      ShuffleConfig.foreach(__v => __obj.updateDynamic("ShuffleConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Channel]
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
    @inline
    def apply(
        Name: ChannelName,
        SupportedContentTypes: ContentTypes,
        SupportedInputModes: InputModes,
        Description: js.UndefOr[EntityDescription] = js.undefined,
        IsRequired: js.UndefOr[Boolean] = js.undefined,
        SupportedCompressionTypes: js.UndefOr[CompressionTypes] = js.undefined
    ): ChannelSpecification = {
      val __obj = js.Dynamic.literal(
        "Name"                  -> Name.asInstanceOf[js.Any],
        "SupportedContentTypes" -> SupportedContentTypes.asInstanceOf[js.Any],
        "SupportedInputModes"   -> SupportedInputModes.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IsRequired.foreach(__v => __obj.updateDynamic("IsRequired")(__v.asInstanceOf[js.Any]))
      SupportedCompressionTypes.foreach(
        __v => __obj.updateDynamic("SupportedCompressionTypes")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ChannelSpecification]
    }
  }

  /**
    * Contains information about the output location for managed spot training checkpoint data.
    */
  @js.native
  trait CheckpointConfig extends js.Object {
    var S3Uri: S3Uri
    var LocalPath: js.UndefOr[DirectoryPath]
  }

  object CheckpointConfig {
    @inline
    def apply(
        S3Uri: S3Uri,
        LocalPath: js.UndefOr[DirectoryPath] = js.undefined
    ): CheckpointConfig = {
      val __obj = js.Dynamic.literal(
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )

      LocalPath.foreach(__v => __obj.updateDynamic("LocalPath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CheckpointConfig]
    }
  }

  object CodeRepositorySortByEnum {
    val Name             = "Name"
    val CreationTime     = "CreationTime"
    val LastModifiedTime = "LastModifiedTime"

    val values = js.Object.freeze(js.Array(Name, CreationTime, LastModifiedTime))
  }

  object CodeRepositorySortOrderEnum {
    val Ascending  = "Ascending"
    val Descending = "Descending"

    val values = js.Object.freeze(js.Array(Ascending, Descending))
  }

  /**
    * Specifies summary information about a Git repository.
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
    @inline
    def apply(
        CodeRepositoryArn: CodeRepositoryArn,
        CodeRepositoryName: EntityName,
        CreationTime: CreationTime,
        LastModifiedTime: LastModifiedTime,
        GitConfig: js.UndefOr[GitConfig] = js.undefined
    ): CodeRepositorySummary = {
      val __obj = js.Dynamic.literal(
        "CodeRepositoryArn"  -> CodeRepositoryArn.asInstanceOf[js.Any],
        "CodeRepositoryName" -> CodeRepositoryName.asInstanceOf[js.Any],
        "CreationTime"       -> CreationTime.asInstanceOf[js.Any],
        "LastModifiedTime"   -> LastModifiedTime.asInstanceOf[js.Any]
      )

      GitConfig.foreach(__v => __obj.updateDynamic("GitConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeRepositorySummary]
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
    @inline
    def apply(
        ClientId: CognitoClientId,
        UserGroup: CognitoUserGroup,
        UserPool: CognitoUserPool
    ): CognitoMemberDefinition = {
      val __obj = js.Dynamic.literal(
        "ClientId"  -> ClientId.asInstanceOf[js.Any],
        "UserGroup" -> UserGroup.asInstanceOf[js.Any],
        "UserPool"  -> UserPool.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CognitoMemberDefinition]
    }
  }

  object CompilationJobStatusEnum {
    val INPROGRESS = "INPROGRESS"
    val COMPLETED  = "COMPLETED"
    val FAILED     = "FAILED"
    val STARTING   = "STARTING"
    val STOPPING   = "STOPPING"
    val STOPPED    = "STOPPED"

    val values = js.Object.freeze(js.Array(INPROGRESS, COMPLETED, FAILED, STARTING, STOPPING, STOPPED))
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
    var CompilationStartTime: js.UndefOr[Timestamp]
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
  }

  object CompilationJobSummary {
    @inline
    def apply(
        CompilationJobArn: CompilationJobArn,
        CompilationJobName: EntityName,
        CompilationJobStatus: CompilationJobStatus,
        CompilationTargetDevice: TargetDevice,
        CreationTime: CreationTime,
        CompilationEndTime: js.UndefOr[Timestamp] = js.undefined,
        CompilationStartTime: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined
    ): CompilationJobSummary = {
      val __obj = js.Dynamic.literal(
        "CompilationJobArn"       -> CompilationJobArn.asInstanceOf[js.Any],
        "CompilationJobName"      -> CompilationJobName.asInstanceOf[js.Any],
        "CompilationJobStatus"    -> CompilationJobStatus.asInstanceOf[js.Any],
        "CompilationTargetDevice" -> CompilationTargetDevice.asInstanceOf[js.Any],
        "CreationTime"            -> CreationTime.asInstanceOf[js.Any]
      )

      CompilationEndTime.foreach(__v => __obj.updateDynamic("CompilationEndTime")(__v.asInstanceOf[js.Any]))
      CompilationStartTime.foreach(__v => __obj.updateDynamic("CompilationStartTime")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompilationJobSummary]
    }
  }

  object CompressionTypeEnum {
    val None = "None"
    val Gzip = "Gzip"

    val values = js.Object.freeze(js.Array(None, Gzip))
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
    @inline
    def apply(
        ContainerHostname: js.UndefOr[ContainerHostname] = js.undefined,
        Environment: js.UndefOr[EnvironmentMap] = js.undefined,
        Image: js.UndefOr[Image] = js.undefined,
        ModelDataUrl: js.UndefOr[Url] = js.undefined,
        ModelPackageName: js.UndefOr[ArnOrName] = js.undefined
    ): ContainerDefinition = {
      val __obj = js.Dynamic.literal()
      ContainerHostname.foreach(__v => __obj.updateDynamic("ContainerHostname")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      Image.foreach(__v => __obj.updateDynamic("Image")(__v.asInstanceOf[js.Any]))
      ModelDataUrl.foreach(__v => __obj.updateDynamic("ModelDataUrl")(__v.asInstanceOf[js.Any]))
      ModelPackageName.foreach(__v => __obj.updateDynamic("ModelPackageName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContainerDefinition]
    }
  }

  object ContentClassifierEnum {
    val FreeOfPersonallyIdentifiableInformation = "FreeOfPersonallyIdentifiableInformation"
    val FreeOfAdultContent                      = "FreeOfAdultContent"

    val values = js.Object.freeze(js.Array(FreeOfPersonallyIdentifiableInformation, FreeOfAdultContent))
  }

  /**
    * A list of continuous hyperparameters to tune.
    */
  @js.native
  trait ContinuousParameterRange extends js.Object {
    var MaxValue: ParameterValue
    var MinValue: ParameterValue
    var Name: ParameterKey
    var ScalingType: js.UndefOr[HyperParameterScalingType]
  }

  object ContinuousParameterRange {
    @inline
    def apply(
        MaxValue: ParameterValue,
        MinValue: ParameterValue,
        Name: ParameterKey,
        ScalingType: js.UndefOr[HyperParameterScalingType] = js.undefined
    ): ContinuousParameterRange = {
      val __obj = js.Dynamic.literal(
        "MaxValue" -> MaxValue.asInstanceOf[js.Any],
        "MinValue" -> MinValue.asInstanceOf[js.Any],
        "Name"     -> Name.asInstanceOf[js.Any]
      )

      ScalingType.foreach(__v => __obj.updateDynamic("ScalingType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContinuousParameterRange]
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
    @inline
    def apply(
        MaxValue: ParameterValue,
        MinValue: ParameterValue
    ): ContinuousParameterRangeSpecification = {
      val __obj = js.Dynamic.literal(
        "MaxValue" -> MaxValue.asInstanceOf[js.Any],
        "MinValue" -> MinValue.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ContinuousParameterRangeSpecification]
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
    @inline
    def apply(
        AlgorithmName: EntityName,
        TrainingSpecification: TrainingSpecification,
        AlgorithmDescription: js.UndefOr[EntityDescription] = js.undefined,
        CertifyForMarketplace: js.UndefOr[CertifyForMarketplace] = js.undefined,
        InferenceSpecification: js.UndefOr[InferenceSpecification] = js.undefined,
        ValidationSpecification: js.UndefOr[AlgorithmValidationSpecification] = js.undefined
    ): CreateAlgorithmInput = {
      val __obj = js.Dynamic.literal(
        "AlgorithmName"         -> AlgorithmName.asInstanceOf[js.Any],
        "TrainingSpecification" -> TrainingSpecification.asInstanceOf[js.Any]
      )

      AlgorithmDescription.foreach(__v => __obj.updateDynamic("AlgorithmDescription")(__v.asInstanceOf[js.Any]))
      CertifyForMarketplace.foreach(__v => __obj.updateDynamic("CertifyForMarketplace")(__v.asInstanceOf[js.Any]))
      InferenceSpecification.foreach(__v => __obj.updateDynamic("InferenceSpecification")(__v.asInstanceOf[js.Any]))
      ValidationSpecification.foreach(__v => __obj.updateDynamic("ValidationSpecification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAlgorithmInput]
    }
  }

  @js.native
  trait CreateAlgorithmOutput extends js.Object {
    var AlgorithmArn: AlgorithmArn
  }

  object CreateAlgorithmOutput {
    @inline
    def apply(
        AlgorithmArn: AlgorithmArn
    ): CreateAlgorithmOutput = {
      val __obj = js.Dynamic.literal(
        "AlgorithmArn" -> AlgorithmArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateAlgorithmOutput]
    }
  }

  @js.native
  trait CreateCodeRepositoryInput extends js.Object {
    var CodeRepositoryName: EntityName
    var GitConfig: GitConfig
  }

  object CreateCodeRepositoryInput {
    @inline
    def apply(
        CodeRepositoryName: EntityName,
        GitConfig: GitConfig
    ): CreateCodeRepositoryInput = {
      val __obj = js.Dynamic.literal(
        "CodeRepositoryName" -> CodeRepositoryName.asInstanceOf[js.Any],
        "GitConfig"          -> GitConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateCodeRepositoryInput]
    }
  }

  @js.native
  trait CreateCodeRepositoryOutput extends js.Object {
    var CodeRepositoryArn: CodeRepositoryArn
  }

  object CreateCodeRepositoryOutput {
    @inline
    def apply(
        CodeRepositoryArn: CodeRepositoryArn
    ): CreateCodeRepositoryOutput = {
      val __obj = js.Dynamic.literal(
        "CodeRepositoryArn" -> CodeRepositoryArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateCodeRepositoryOutput]
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
    @inline
    def apply(
        CompilationJobName: EntityName,
        InputConfig: InputConfig,
        OutputConfig: OutputConfig,
        RoleArn: RoleArn,
        StoppingCondition: StoppingCondition
    ): CreateCompilationJobRequest = {
      val __obj = js.Dynamic.literal(
        "CompilationJobName" -> CompilationJobName.asInstanceOf[js.Any],
        "InputConfig"        -> InputConfig.asInstanceOf[js.Any],
        "OutputConfig"       -> OutputConfig.asInstanceOf[js.Any],
        "RoleArn"            -> RoleArn.asInstanceOf[js.Any],
        "StoppingCondition"  -> StoppingCondition.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateCompilationJobRequest]
    }
  }

  @js.native
  trait CreateCompilationJobResponse extends js.Object {
    var CompilationJobArn: CompilationJobArn
  }

  object CreateCompilationJobResponse {
    @inline
    def apply(
        CompilationJobArn: CompilationJobArn
    ): CreateCompilationJobResponse = {
      val __obj = js.Dynamic.literal(
        "CompilationJobArn" -> CompilationJobArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateCompilationJobResponse]
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
    @inline
    def apply(
        EndpointConfigName: EndpointConfigName,
        ProductionVariants: ProductionVariantList,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateEndpointConfigInput = {
      val __obj = js.Dynamic.literal(
        "EndpointConfigName" -> EndpointConfigName.asInstanceOf[js.Any],
        "ProductionVariants" -> ProductionVariants.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEndpointConfigInput]
    }
  }

  @js.native
  trait CreateEndpointConfigOutput extends js.Object {
    var EndpointConfigArn: EndpointConfigArn
  }

  object CreateEndpointConfigOutput {
    @inline
    def apply(
        EndpointConfigArn: EndpointConfigArn
    ): CreateEndpointConfigOutput = {
      val __obj = js.Dynamic.literal(
        "EndpointConfigArn" -> EndpointConfigArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateEndpointConfigOutput]
    }
  }

  @js.native
  trait CreateEndpointInput extends js.Object {
    var EndpointConfigName: EndpointConfigName
    var EndpointName: EndpointName
    var Tags: js.UndefOr[TagList]
  }

  object CreateEndpointInput {
    @inline
    def apply(
        EndpointConfigName: EndpointConfigName,
        EndpointName: EndpointName,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateEndpointInput = {
      val __obj = js.Dynamic.literal(
        "EndpointConfigName" -> EndpointConfigName.asInstanceOf[js.Any],
        "EndpointName"       -> EndpointName.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEndpointInput]
    }
  }

  @js.native
  trait CreateEndpointOutput extends js.Object {
    var EndpointArn: EndpointArn
  }

  object CreateEndpointOutput {
    @inline
    def apply(
        EndpointArn: EndpointArn
    ): CreateEndpointOutput = {
      val __obj = js.Dynamic.literal(
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateEndpointOutput]
    }
  }

  @js.native
  trait CreateHyperParameterTuningJobRequest extends js.Object {
    var HyperParameterTuningJobConfig: HyperParameterTuningJobConfig
    var HyperParameterTuningJobName: HyperParameterTuningJobName
    var Tags: js.UndefOr[TagList]
    var TrainingJobDefinition: js.UndefOr[HyperParameterTrainingJobDefinition]
    var WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig]
  }

  object CreateHyperParameterTuningJobRequest {
    @inline
    def apply(
        HyperParameterTuningJobConfig: HyperParameterTuningJobConfig,
        HyperParameterTuningJobName: HyperParameterTuningJobName,
        Tags: js.UndefOr[TagList] = js.undefined,
        TrainingJobDefinition: js.UndefOr[HyperParameterTrainingJobDefinition] = js.undefined,
        WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig] = js.undefined
    ): CreateHyperParameterTuningJobRequest = {
      val __obj = js.Dynamic.literal(
        "HyperParameterTuningJobConfig" -> HyperParameterTuningJobConfig.asInstanceOf[js.Any],
        "HyperParameterTuningJobName"   -> HyperParameterTuningJobName.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TrainingJobDefinition.foreach(__v => __obj.updateDynamic("TrainingJobDefinition")(__v.asInstanceOf[js.Any]))
      WarmStartConfig.foreach(__v => __obj.updateDynamic("WarmStartConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHyperParameterTuningJobRequest]
    }
  }

  @js.native
  trait CreateHyperParameterTuningJobResponse extends js.Object {
    var HyperParameterTuningJobArn: HyperParameterTuningJobArn
  }

  object CreateHyperParameterTuningJobResponse {
    @inline
    def apply(
        HyperParameterTuningJobArn: HyperParameterTuningJobArn
    ): CreateHyperParameterTuningJobResponse = {
      val __obj = js.Dynamic.literal(
        "HyperParameterTuningJobArn" -> HyperParameterTuningJobArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateHyperParameterTuningJobResponse]
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
    @inline
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
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateLabelingJobRequest = {
      val __obj = js.Dynamic.literal(
        "HumanTaskConfig"    -> HumanTaskConfig.asInstanceOf[js.Any],
        "InputConfig"        -> InputConfig.asInstanceOf[js.Any],
        "LabelAttributeName" -> LabelAttributeName.asInstanceOf[js.Any],
        "LabelingJobName"    -> LabelingJobName.asInstanceOf[js.Any],
        "OutputConfig"       -> OutputConfig.asInstanceOf[js.Any],
        "RoleArn"            -> RoleArn.asInstanceOf[js.Any]
      )

      LabelCategoryConfigS3Uri.foreach(__v => __obj.updateDynamic("LabelCategoryConfigS3Uri")(__v.asInstanceOf[js.Any]))
      LabelingJobAlgorithmsConfig.foreach(
        __v => __obj.updateDynamic("LabelingJobAlgorithmsConfig")(__v.asInstanceOf[js.Any])
      )
      StoppingConditions.foreach(__v => __obj.updateDynamic("StoppingConditions")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLabelingJobRequest]
    }
  }

  @js.native
  trait CreateLabelingJobResponse extends js.Object {
    var LabelingJobArn: LabelingJobArn
  }

  object CreateLabelingJobResponse {
    @inline
    def apply(
        LabelingJobArn: LabelingJobArn
    ): CreateLabelingJobResponse = {
      val __obj = js.Dynamic.literal(
        "LabelingJobArn" -> LabelingJobArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateLabelingJobResponse]
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
    @inline
    def apply(
        ExecutionRoleArn: RoleArn,
        ModelName: ModelName,
        Containers: js.UndefOr[ContainerDefinitionList] = js.undefined,
        EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
        PrimaryContainer: js.UndefOr[ContainerDefinition] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): CreateModelInput = {
      val __obj = js.Dynamic.literal(
        "ExecutionRoleArn" -> ExecutionRoleArn.asInstanceOf[js.Any],
        "ModelName"        -> ModelName.asInstanceOf[js.Any]
      )

      Containers.foreach(__v => __obj.updateDynamic("Containers")(__v.asInstanceOf[js.Any]))
      EnableNetworkIsolation.foreach(__v => __obj.updateDynamic("EnableNetworkIsolation")(__v.asInstanceOf[js.Any]))
      PrimaryContainer.foreach(__v => __obj.updateDynamic("PrimaryContainer")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateModelInput]
    }
  }

  @js.native
  trait CreateModelOutput extends js.Object {
    var ModelArn: ModelArn
  }

  object CreateModelOutput {
    @inline
    def apply(
        ModelArn: ModelArn
    ): CreateModelOutput = {
      val __obj = js.Dynamic.literal(
        "ModelArn" -> ModelArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateModelOutput]
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
    @inline
    def apply(
        ModelPackageName: EntityName,
        CertifyForMarketplace: js.UndefOr[CertifyForMarketplace] = js.undefined,
        InferenceSpecification: js.UndefOr[InferenceSpecification] = js.undefined,
        ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined,
        SourceAlgorithmSpecification: js.UndefOr[SourceAlgorithmSpecification] = js.undefined,
        ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification] = js.undefined
    ): CreateModelPackageInput = {
      val __obj = js.Dynamic.literal(
        "ModelPackageName" -> ModelPackageName.asInstanceOf[js.Any]
      )

      CertifyForMarketplace.foreach(__v => __obj.updateDynamic("CertifyForMarketplace")(__v.asInstanceOf[js.Any]))
      InferenceSpecification.foreach(__v => __obj.updateDynamic("InferenceSpecification")(__v.asInstanceOf[js.Any]))
      ModelPackageDescription.foreach(__v => __obj.updateDynamic("ModelPackageDescription")(__v.asInstanceOf[js.Any]))
      SourceAlgorithmSpecification.foreach(
        __v => __obj.updateDynamic("SourceAlgorithmSpecification")(__v.asInstanceOf[js.Any])
      )
      ValidationSpecification.foreach(__v => __obj.updateDynamic("ValidationSpecification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateModelPackageInput]
    }
  }

  @js.native
  trait CreateModelPackageOutput extends js.Object {
    var ModelPackageArn: ModelPackageArn
  }

  object CreateModelPackageOutput {
    @inline
    def apply(
        ModelPackageArn: ModelPackageArn
    ): CreateModelPackageOutput = {
      val __obj = js.Dynamic.literal(
        "ModelPackageArn" -> ModelPackageArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateModelPackageOutput]
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
    var RootAccess: js.UndefOr[RootAccess]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var SubnetId: js.UndefOr[SubnetId]
    var Tags: js.UndefOr[TagList]
    var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB]
  }

  object CreateNotebookInstanceInput {
    @inline
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
        RootAccess: js.UndefOr[RootAccess] = js.undefined,
        SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
        SubnetId: js.UndefOr[SubnetId] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.undefined
    ): CreateNotebookInstanceInput = {
      val __obj = js.Dynamic.literal(
        "InstanceType"         -> InstanceType.asInstanceOf[js.Any],
        "NotebookInstanceName" -> NotebookInstanceName.asInstanceOf[js.Any],
        "RoleArn"              -> RoleArn.asInstanceOf[js.Any]
      )

      AcceleratorTypes.foreach(__v => __obj.updateDynamic("AcceleratorTypes")(__v.asInstanceOf[js.Any]))
      AdditionalCodeRepositories.foreach(
        __v => __obj.updateDynamic("AdditionalCodeRepositories")(__v.asInstanceOf[js.Any])
      )
      DefaultCodeRepository.foreach(__v => __obj.updateDynamic("DefaultCodeRepository")(__v.asInstanceOf[js.Any]))
      DirectInternetAccess.foreach(__v => __obj.updateDynamic("DirectInternetAccess")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LifecycleConfigName.foreach(__v => __obj.updateDynamic("LifecycleConfigName")(__v.asInstanceOf[js.Any]))
      RootAccess.foreach(__v => __obj.updateDynamic("RootAccess")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VolumeSizeInGB.foreach(__v => __obj.updateDynamic("VolumeSizeInGB")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNotebookInstanceInput]
    }
  }

  @js.native
  trait CreateNotebookInstanceLifecycleConfigInput extends js.Object {
    var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
    var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList]
    var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList]
  }

  object CreateNotebookInstanceLifecycleConfigInput {
    @inline
    def apply(
        NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName,
        OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined,
        OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined
    ): CreateNotebookInstanceLifecycleConfigInput = {
      val __obj = js.Dynamic.literal(
        "NotebookInstanceLifecycleConfigName" -> NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any]
      )

      OnCreate.foreach(__v => __obj.updateDynamic("OnCreate")(__v.asInstanceOf[js.Any]))
      OnStart.foreach(__v => __obj.updateDynamic("OnStart")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNotebookInstanceLifecycleConfigInput]
    }
  }

  @js.native
  trait CreateNotebookInstanceLifecycleConfigOutput extends js.Object {
    var NotebookInstanceLifecycleConfigArn: js.UndefOr[NotebookInstanceLifecycleConfigArn]
  }

  object CreateNotebookInstanceLifecycleConfigOutput {
    @inline
    def apply(
        NotebookInstanceLifecycleConfigArn: js.UndefOr[NotebookInstanceLifecycleConfigArn] = js.undefined
    ): CreateNotebookInstanceLifecycleConfigOutput = {
      val __obj = js.Dynamic.literal()
      NotebookInstanceLifecycleConfigArn.foreach(
        __v => __obj.updateDynamic("NotebookInstanceLifecycleConfigArn")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CreateNotebookInstanceLifecycleConfigOutput]
    }
  }

  @js.native
  trait CreateNotebookInstanceOutput extends js.Object {
    var NotebookInstanceArn: js.UndefOr[NotebookInstanceArn]
  }

  object CreateNotebookInstanceOutput {
    @inline
    def apply(
        NotebookInstanceArn: js.UndefOr[NotebookInstanceArn] = js.undefined
    ): CreateNotebookInstanceOutput = {
      val __obj = js.Dynamic.literal()
      NotebookInstanceArn.foreach(__v => __obj.updateDynamic("NotebookInstanceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNotebookInstanceOutput]
    }
  }

  @js.native
  trait CreatePresignedNotebookInstanceUrlInput extends js.Object {
    var NotebookInstanceName: NotebookInstanceName
    var SessionExpirationDurationInSeconds: js.UndefOr[SessionExpirationDurationInSeconds]
  }

  object CreatePresignedNotebookInstanceUrlInput {
    @inline
    def apply(
        NotebookInstanceName: NotebookInstanceName,
        SessionExpirationDurationInSeconds: js.UndefOr[SessionExpirationDurationInSeconds] = js.undefined
    ): CreatePresignedNotebookInstanceUrlInput = {
      val __obj = js.Dynamic.literal(
        "NotebookInstanceName" -> NotebookInstanceName.asInstanceOf[js.Any]
      )

      SessionExpirationDurationInSeconds.foreach(
        __v => __obj.updateDynamic("SessionExpirationDurationInSeconds")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CreatePresignedNotebookInstanceUrlInput]
    }
  }

  @js.native
  trait CreatePresignedNotebookInstanceUrlOutput extends js.Object {
    var AuthorizedUrl: js.UndefOr[NotebookInstanceUrl]
  }

  object CreatePresignedNotebookInstanceUrlOutput {
    @inline
    def apply(
        AuthorizedUrl: js.UndefOr[NotebookInstanceUrl] = js.undefined
    ): CreatePresignedNotebookInstanceUrlOutput = {
      val __obj = js.Dynamic.literal()
      AuthorizedUrl.foreach(__v => __obj.updateDynamic("AuthorizedUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePresignedNotebookInstanceUrlOutput]
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
    var CheckpointConfig: js.UndefOr[CheckpointConfig]
    var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean]
    var EnableManagedSpotTraining: js.UndefOr[Boolean]
    var EnableNetworkIsolation: js.UndefOr[Boolean]
    var HyperParameters: js.UndefOr[HyperParameters]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var Tags: js.UndefOr[TagList]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object CreateTrainingJobRequest {
    @inline
    def apply(
        AlgorithmSpecification: AlgorithmSpecification,
        OutputDataConfig: OutputDataConfig,
        ResourceConfig: ResourceConfig,
        RoleArn: RoleArn,
        StoppingCondition: StoppingCondition,
        TrainingJobName: TrainingJobName,
        CheckpointConfig: js.UndefOr[CheckpointConfig] = js.undefined,
        EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined,
        EnableManagedSpotTraining: js.UndefOr[Boolean] = js.undefined,
        EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
        HyperParameters: js.UndefOr[HyperParameters] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): CreateTrainingJobRequest = {
      val __obj = js.Dynamic.literal(
        "AlgorithmSpecification" -> AlgorithmSpecification.asInstanceOf[js.Any],
        "OutputDataConfig"       -> OutputDataConfig.asInstanceOf[js.Any],
        "ResourceConfig"         -> ResourceConfig.asInstanceOf[js.Any],
        "RoleArn"                -> RoleArn.asInstanceOf[js.Any],
        "StoppingCondition"      -> StoppingCondition.asInstanceOf[js.Any],
        "TrainingJobName"        -> TrainingJobName.asInstanceOf[js.Any]
      )

      CheckpointConfig.foreach(__v => __obj.updateDynamic("CheckpointConfig")(__v.asInstanceOf[js.Any]))
      EnableInterContainerTrafficEncryption.foreach(
        __v => __obj.updateDynamic("EnableInterContainerTrafficEncryption")(__v.asInstanceOf[js.Any])
      )
      EnableManagedSpotTraining.foreach(
        __v => __obj.updateDynamic("EnableManagedSpotTraining")(__v.asInstanceOf[js.Any])
      )
      EnableNetworkIsolation.foreach(__v => __obj.updateDynamic("EnableNetworkIsolation")(__v.asInstanceOf[js.Any]))
      HyperParameters.foreach(__v => __obj.updateDynamic("HyperParameters")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTrainingJobRequest]
    }
  }

  @js.native
  trait CreateTrainingJobResponse extends js.Object {
    var TrainingJobArn: TrainingJobArn
  }

  object CreateTrainingJobResponse {
    @inline
    def apply(
        TrainingJobArn: TrainingJobArn
    ): CreateTrainingJobResponse = {
      val __obj = js.Dynamic.literal(
        "TrainingJobArn" -> TrainingJobArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateTrainingJobResponse]
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
    var DataProcessing: js.UndefOr[DataProcessing]
    var Environment: js.UndefOr[TransformEnvironmentMap]
    var MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms]
    var MaxPayloadInMB: js.UndefOr[MaxPayloadInMB]
    var Tags: js.UndefOr[TagList]
  }

  object CreateTransformJobRequest {
    @inline
    def apply(
        ModelName: ModelName,
        TransformInput: TransformInput,
        TransformJobName: TransformJobName,
        TransformOutput: TransformOutput,
        TransformResources: TransformResources,
        BatchStrategy: js.UndefOr[BatchStrategy] = js.undefined,
        DataProcessing: js.UndefOr[DataProcessing] = js.undefined,
        Environment: js.UndefOr[TransformEnvironmentMap] = js.undefined,
        MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms] = js.undefined,
        MaxPayloadInMB: js.UndefOr[MaxPayloadInMB] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateTransformJobRequest = {
      val __obj = js.Dynamic.literal(
        "ModelName"          -> ModelName.asInstanceOf[js.Any],
        "TransformInput"     -> TransformInput.asInstanceOf[js.Any],
        "TransformJobName"   -> TransformJobName.asInstanceOf[js.Any],
        "TransformOutput"    -> TransformOutput.asInstanceOf[js.Any],
        "TransformResources" -> TransformResources.asInstanceOf[js.Any]
      )

      BatchStrategy.foreach(__v => __obj.updateDynamic("BatchStrategy")(__v.asInstanceOf[js.Any]))
      DataProcessing.foreach(__v => __obj.updateDynamic("DataProcessing")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      MaxConcurrentTransforms.foreach(__v => __obj.updateDynamic("MaxConcurrentTransforms")(__v.asInstanceOf[js.Any]))
      MaxPayloadInMB.foreach(__v => __obj.updateDynamic("MaxPayloadInMB")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTransformJobRequest]
    }
  }

  @js.native
  trait CreateTransformJobResponse extends js.Object {
    var TransformJobArn: TransformJobArn
  }

  object CreateTransformJobResponse {
    @inline
    def apply(
        TransformJobArn: TransformJobArn
    ): CreateTransformJobResponse = {
      val __obj = js.Dynamic.literal(
        "TransformJobArn" -> TransformJobArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateTransformJobResponse]
    }
  }

  @js.native
  trait CreateWorkteamRequest extends js.Object {
    var Description: String200
    var MemberDefinitions: MemberDefinitions
    var WorkteamName: WorkteamName
    var NotificationConfiguration: js.UndefOr[NotificationConfiguration]
    var Tags: js.UndefOr[TagList]
  }

  object CreateWorkteamRequest {
    @inline
    def apply(
        Description: String200,
        MemberDefinitions: MemberDefinitions,
        WorkteamName: WorkteamName,
        NotificationConfiguration: js.UndefOr[NotificationConfiguration] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateWorkteamRequest = {
      val __obj = js.Dynamic.literal(
        "Description"       -> Description.asInstanceOf[js.Any],
        "MemberDefinitions" -> MemberDefinitions.asInstanceOf[js.Any],
        "WorkteamName"      -> WorkteamName.asInstanceOf[js.Any]
      )

      NotificationConfiguration.foreach(
        __v => __obj.updateDynamic("NotificationConfiguration")(__v.asInstanceOf[js.Any])
      )
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkteamRequest]
    }
  }

  @js.native
  trait CreateWorkteamResponse extends js.Object {
    var WorkteamArn: js.UndefOr[WorkteamArn]
  }

  object CreateWorkteamResponse {
    @inline
    def apply(
        WorkteamArn: js.UndefOr[WorkteamArn] = js.undefined
    ): CreateWorkteamResponse = {
      val __obj = js.Dynamic.literal()
      WorkteamArn.foreach(__v => __obj.updateDynamic("WorkteamArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkteamResponse]
    }
  }

  /**
    * The data structure used to specify the data to be used for inference in a batch transform job and to associate the data that is relevant to the prediction results in the output. The input filter provided allows you to exclude input data that is not needed for inference in a batch transform job. The output filter provided allows you to include input data relevant to interpreting the predictions in the output from the job. For more information, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html|Associate Prediction Results with their Corresponding Input Records]].
    */
  @js.native
  trait DataProcessing extends js.Object {
    var InputFilter: js.UndefOr[JsonPath]
    var JoinSource: js.UndefOr[JoinSource]
    var OutputFilter: js.UndefOr[JsonPath]
  }

  object DataProcessing {
    @inline
    def apply(
        InputFilter: js.UndefOr[JsonPath] = js.undefined,
        JoinSource: js.UndefOr[JoinSource] = js.undefined,
        OutputFilter: js.UndefOr[JsonPath] = js.undefined
    ): DataProcessing = {
      val __obj = js.Dynamic.literal()
      InputFilter.foreach(__v => __obj.updateDynamic("InputFilter")(__v.asInstanceOf[js.Any]))
      JoinSource.foreach(__v => __obj.updateDynamic("JoinSource")(__v.asInstanceOf[js.Any]))
      OutputFilter.foreach(__v => __obj.updateDynamic("OutputFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataProcessing]
    }
  }

  /**
    * Describes the location of the channel data.
    */
  @js.native
  trait DataSource extends js.Object {
    var FileSystemDataSource: js.UndefOr[FileSystemDataSource]
    var S3DataSource: js.UndefOr[S3DataSource]
  }

  object DataSource {
    @inline
    def apply(
        FileSystemDataSource: js.UndefOr[FileSystemDataSource] = js.undefined,
        S3DataSource: js.UndefOr[S3DataSource] = js.undefined
    ): DataSource = {
      val __obj = js.Dynamic.literal()
      FileSystemDataSource.foreach(__v => __obj.updateDynamic("FileSystemDataSource")(__v.asInstanceOf[js.Any]))
      S3DataSource.foreach(__v => __obj.updateDynamic("S3DataSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSource]
    }
  }

  @js.native
  trait DeleteAlgorithmInput extends js.Object {
    var AlgorithmName: EntityName
  }

  object DeleteAlgorithmInput {
    @inline
    def apply(
        AlgorithmName: EntityName
    ): DeleteAlgorithmInput = {
      val __obj = js.Dynamic.literal(
        "AlgorithmName" -> AlgorithmName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAlgorithmInput]
    }
  }

  @js.native
  trait DeleteCodeRepositoryInput extends js.Object {
    var CodeRepositoryName: EntityName
  }

  object DeleteCodeRepositoryInput {
    @inline
    def apply(
        CodeRepositoryName: EntityName
    ): DeleteCodeRepositoryInput = {
      val __obj = js.Dynamic.literal(
        "CodeRepositoryName" -> CodeRepositoryName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteCodeRepositoryInput]
    }
  }

  @js.native
  trait DeleteEndpointConfigInput extends js.Object {
    var EndpointConfigName: EndpointConfigName
  }

  object DeleteEndpointConfigInput {
    @inline
    def apply(
        EndpointConfigName: EndpointConfigName
    ): DeleteEndpointConfigInput = {
      val __obj = js.Dynamic.literal(
        "EndpointConfigName" -> EndpointConfigName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEndpointConfigInput]
    }
  }

  @js.native
  trait DeleteEndpointInput extends js.Object {
    var EndpointName: EndpointName
  }

  object DeleteEndpointInput {
    @inline
    def apply(
        EndpointName: EndpointName
    ): DeleteEndpointInput = {
      val __obj = js.Dynamic.literal(
        "EndpointName" -> EndpointName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEndpointInput]
    }
  }

  @js.native
  trait DeleteModelInput extends js.Object {
    var ModelName: ModelName
  }

  object DeleteModelInput {
    @inline
    def apply(
        ModelName: ModelName
    ): DeleteModelInput = {
      val __obj = js.Dynamic.literal(
        "ModelName" -> ModelName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteModelInput]
    }
  }

  @js.native
  trait DeleteModelPackageInput extends js.Object {
    var ModelPackageName: EntityName
  }

  object DeleteModelPackageInput {
    @inline
    def apply(
        ModelPackageName: EntityName
    ): DeleteModelPackageInput = {
      val __obj = js.Dynamic.literal(
        "ModelPackageName" -> ModelPackageName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteModelPackageInput]
    }
  }

  @js.native
  trait DeleteNotebookInstanceInput extends js.Object {
    var NotebookInstanceName: NotebookInstanceName
  }

  object DeleteNotebookInstanceInput {
    @inline
    def apply(
        NotebookInstanceName: NotebookInstanceName
    ): DeleteNotebookInstanceInput = {
      val __obj = js.Dynamic.literal(
        "NotebookInstanceName" -> NotebookInstanceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteNotebookInstanceInput]
    }
  }

  @js.native
  trait DeleteNotebookInstanceLifecycleConfigInput extends js.Object {
    var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
  }

  object DeleteNotebookInstanceLifecycleConfigInput {
    @inline
    def apply(
        NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
    ): DeleteNotebookInstanceLifecycleConfigInput = {
      val __obj = js.Dynamic.literal(
        "NotebookInstanceLifecycleConfigName" -> NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteNotebookInstanceLifecycleConfigInput]
    }
  }

  @js.native
  trait DeleteTagsInput extends js.Object {
    var ResourceArn: ResourceArn
    var TagKeys: TagKeyList
  }

  object DeleteTagsInput {
    @inline
    def apply(
        ResourceArn: ResourceArn,
        TagKeys: TagKeyList
    ): DeleteTagsInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTagsInput]
    }
  }

  @js.native
  trait DeleteTagsOutput extends js.Object {}

  object DeleteTagsOutput {
    @inline
    def apply(
        ): DeleteTagsOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteTagsOutput]
    }
  }

  @js.native
  trait DeleteWorkteamRequest extends js.Object {
    var WorkteamName: WorkteamName
  }

  object DeleteWorkteamRequest {
    @inline
    def apply(
        WorkteamName: WorkteamName
    ): DeleteWorkteamRequest = {
      val __obj = js.Dynamic.literal(
        "WorkteamName" -> WorkteamName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteWorkteamRequest]
    }
  }

  @js.native
  trait DeleteWorkteamResponse extends js.Object {
    var Success: Success
  }

  object DeleteWorkteamResponse {
    @inline
    def apply(
        Success: Success
    ): DeleteWorkteamResponse = {
      val __obj = js.Dynamic.literal(
        "Success" -> Success.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteWorkteamResponse]
    }
  }

  /**
    * Gets the Amazon EC2 Container Registry path of the docker image of the model that is hosted in this <a>ProductionVariant</a>.
    *  If you used the <code>registry/repository[:tag]</code> form to specify the image path of the primary container when you created the model hosted in this <code>ProductionVariant</code>, the path resolves to a path of the form <code>registry/repository[@digest]</code>. A digest is a hash value that identifies a specific version of an image. For information about Amazon ECR paths, see [[https://docs.aws.amazon.com/AmazonECR/latest/userguide/docker-pull-ecr-image.html|Pulling an Image]] in the <i>Amazon ECR User Guide</i>.
    */
  @js.native
  trait DeployedImage extends js.Object {
    var ResolutionTime: js.UndefOr[Timestamp]
    var ResolvedImage: js.UndefOr[Image]
    var SpecifiedImage: js.UndefOr[Image]
  }

  object DeployedImage {
    @inline
    def apply(
        ResolutionTime: js.UndefOr[Timestamp] = js.undefined,
        ResolvedImage: js.UndefOr[Image] = js.undefined,
        SpecifiedImage: js.UndefOr[Image] = js.undefined
    ): DeployedImage = {
      val __obj = js.Dynamic.literal()
      ResolutionTime.foreach(__v => __obj.updateDynamic("ResolutionTime")(__v.asInstanceOf[js.Any]))
      ResolvedImage.foreach(__v => __obj.updateDynamic("ResolvedImage")(__v.asInstanceOf[js.Any]))
      SpecifiedImage.foreach(__v => __obj.updateDynamic("SpecifiedImage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeployedImage]
    }
  }

  @js.native
  trait DescribeAlgorithmInput extends js.Object {
    var AlgorithmName: ArnOrName
  }

  object DescribeAlgorithmInput {
    @inline
    def apply(
        AlgorithmName: ArnOrName
    ): DescribeAlgorithmInput = {
      val __obj = js.Dynamic.literal(
        "AlgorithmName" -> AlgorithmName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeAlgorithmInput]
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
    @inline
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
        ValidationSpecification: js.UndefOr[AlgorithmValidationSpecification] = js.undefined
    ): DescribeAlgorithmOutput = {
      val __obj = js.Dynamic.literal(
        "AlgorithmArn"           -> AlgorithmArn.asInstanceOf[js.Any],
        "AlgorithmName"          -> AlgorithmName.asInstanceOf[js.Any],
        "AlgorithmStatus"        -> AlgorithmStatus.asInstanceOf[js.Any],
        "AlgorithmStatusDetails" -> AlgorithmStatusDetails.asInstanceOf[js.Any],
        "CreationTime"           -> CreationTime.asInstanceOf[js.Any],
        "TrainingSpecification"  -> TrainingSpecification.asInstanceOf[js.Any]
      )

      AlgorithmDescription.foreach(__v => __obj.updateDynamic("AlgorithmDescription")(__v.asInstanceOf[js.Any]))
      CertifyForMarketplace.foreach(__v => __obj.updateDynamic("CertifyForMarketplace")(__v.asInstanceOf[js.Any]))
      InferenceSpecification.foreach(__v => __obj.updateDynamic("InferenceSpecification")(__v.asInstanceOf[js.Any]))
      ProductId.foreach(__v => __obj.updateDynamic("ProductId")(__v.asInstanceOf[js.Any]))
      ValidationSpecification.foreach(__v => __obj.updateDynamic("ValidationSpecification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAlgorithmOutput]
    }
  }

  @js.native
  trait DescribeCodeRepositoryInput extends js.Object {
    var CodeRepositoryName: EntityName
  }

  object DescribeCodeRepositoryInput {
    @inline
    def apply(
        CodeRepositoryName: EntityName
    ): DescribeCodeRepositoryInput = {
      val __obj = js.Dynamic.literal(
        "CodeRepositoryName" -> CodeRepositoryName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeCodeRepositoryInput]
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
    @inline
    def apply(
        CodeRepositoryArn: CodeRepositoryArn,
        CodeRepositoryName: EntityName,
        CreationTime: CreationTime,
        LastModifiedTime: LastModifiedTime,
        GitConfig: js.UndefOr[GitConfig] = js.undefined
    ): DescribeCodeRepositoryOutput = {
      val __obj = js.Dynamic.literal(
        "CodeRepositoryArn"  -> CodeRepositoryArn.asInstanceOf[js.Any],
        "CodeRepositoryName" -> CodeRepositoryName.asInstanceOf[js.Any],
        "CreationTime"       -> CreationTime.asInstanceOf[js.Any],
        "LastModifiedTime"   -> LastModifiedTime.asInstanceOf[js.Any]
      )

      GitConfig.foreach(__v => __obj.updateDynamic("GitConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCodeRepositoryOutput]
    }
  }

  @js.native
  trait DescribeCompilationJobRequest extends js.Object {
    var CompilationJobName: EntityName
  }

  object DescribeCompilationJobRequest {
    @inline
    def apply(
        CompilationJobName: EntityName
    ): DescribeCompilationJobRequest = {
      val __obj = js.Dynamic.literal(
        "CompilationJobName" -> CompilationJobName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeCompilationJobRequest]
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
    @inline
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
        CompilationStartTime: js.UndefOr[Timestamp] = js.undefined
    ): DescribeCompilationJobResponse = {
      val __obj = js.Dynamic.literal(
        "CompilationJobArn"    -> CompilationJobArn.asInstanceOf[js.Any],
        "CompilationJobName"   -> CompilationJobName.asInstanceOf[js.Any],
        "CompilationJobStatus" -> CompilationJobStatus.asInstanceOf[js.Any],
        "CreationTime"         -> CreationTime.asInstanceOf[js.Any],
        "FailureReason"        -> FailureReason.asInstanceOf[js.Any],
        "InputConfig"          -> InputConfig.asInstanceOf[js.Any],
        "LastModifiedTime"     -> LastModifiedTime.asInstanceOf[js.Any],
        "ModelArtifacts"       -> ModelArtifacts.asInstanceOf[js.Any],
        "OutputConfig"         -> OutputConfig.asInstanceOf[js.Any],
        "RoleArn"              -> RoleArn.asInstanceOf[js.Any],
        "StoppingCondition"    -> StoppingCondition.asInstanceOf[js.Any]
      )

      CompilationEndTime.foreach(__v => __obj.updateDynamic("CompilationEndTime")(__v.asInstanceOf[js.Any]))
      CompilationStartTime.foreach(__v => __obj.updateDynamic("CompilationStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCompilationJobResponse]
    }
  }

  @js.native
  trait DescribeEndpointConfigInput extends js.Object {
    var EndpointConfigName: EndpointConfigName
  }

  object DescribeEndpointConfigInput {
    @inline
    def apply(
        EndpointConfigName: EndpointConfigName
    ): DescribeEndpointConfigInput = {
      val __obj = js.Dynamic.literal(
        "EndpointConfigName" -> EndpointConfigName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeEndpointConfigInput]
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
    @inline
    def apply(
        CreationTime: Timestamp,
        EndpointConfigArn: EndpointConfigArn,
        EndpointConfigName: EndpointConfigName,
        ProductionVariants: ProductionVariantList,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): DescribeEndpointConfigOutput = {
      val __obj = js.Dynamic.literal(
        "CreationTime"       -> CreationTime.asInstanceOf[js.Any],
        "EndpointConfigArn"  -> EndpointConfigArn.asInstanceOf[js.Any],
        "EndpointConfigName" -> EndpointConfigName.asInstanceOf[js.Any],
        "ProductionVariants" -> ProductionVariants.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEndpointConfigOutput]
    }
  }

  @js.native
  trait DescribeEndpointInput extends js.Object {
    var EndpointName: EndpointName
  }

  object DescribeEndpointInput {
    @inline
    def apply(
        EndpointName: EndpointName
    ): DescribeEndpointInput = {
      val __obj = js.Dynamic.literal(
        "EndpointName" -> EndpointName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeEndpointInput]
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
    @inline
    def apply(
        CreationTime: Timestamp,
        EndpointArn: EndpointArn,
        EndpointConfigName: EndpointConfigName,
        EndpointName: EndpointName,
        EndpointStatus: EndpointStatus,
        LastModifiedTime: Timestamp,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        ProductionVariants: js.UndefOr[ProductionVariantSummaryList] = js.undefined
    ): DescribeEndpointOutput = {
      val __obj = js.Dynamic.literal(
        "CreationTime"       -> CreationTime.asInstanceOf[js.Any],
        "EndpointArn"        -> EndpointArn.asInstanceOf[js.Any],
        "EndpointConfigName" -> EndpointConfigName.asInstanceOf[js.Any],
        "EndpointName"       -> EndpointName.asInstanceOf[js.Any],
        "EndpointStatus"     -> EndpointStatus.asInstanceOf[js.Any],
        "LastModifiedTime"   -> LastModifiedTime.asInstanceOf[js.Any]
      )

      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      ProductionVariants.foreach(__v => __obj.updateDynamic("ProductionVariants")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEndpointOutput]
    }
  }

  @js.native
  trait DescribeHyperParameterTuningJobRequest extends js.Object {
    var HyperParameterTuningJobName: HyperParameterTuningJobName
  }

  object DescribeHyperParameterTuningJobRequest {
    @inline
    def apply(
        HyperParameterTuningJobName: HyperParameterTuningJobName
    ): DescribeHyperParameterTuningJobRequest = {
      val __obj = js.Dynamic.literal(
        "HyperParameterTuningJobName" -> HyperParameterTuningJobName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeHyperParameterTuningJobRequest]
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
    var TrainingJobStatusCounters: TrainingJobStatusCounters
    var BestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary]
    var FailureReason: js.UndefOr[FailureReason]
    var HyperParameterTuningEndTime: js.UndefOr[Timestamp]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var OverallBestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary]
    var TrainingJobDefinition: js.UndefOr[HyperParameterTrainingJobDefinition]
    var WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig]
  }

  object DescribeHyperParameterTuningJobResponse {
    @inline
    def apply(
        CreationTime: Timestamp,
        HyperParameterTuningJobArn: HyperParameterTuningJobArn,
        HyperParameterTuningJobConfig: HyperParameterTuningJobConfig,
        HyperParameterTuningJobName: HyperParameterTuningJobName,
        HyperParameterTuningJobStatus: HyperParameterTuningJobStatus,
        ObjectiveStatusCounters: ObjectiveStatusCounters,
        TrainingJobStatusCounters: TrainingJobStatusCounters,
        BestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        HyperParameterTuningEndTime: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        OverallBestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary] = js.undefined,
        TrainingJobDefinition: js.UndefOr[HyperParameterTrainingJobDefinition] = js.undefined,
        WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig] = js.undefined
    ): DescribeHyperParameterTuningJobResponse = {
      val __obj = js.Dynamic.literal(
        "CreationTime"                  -> CreationTime.asInstanceOf[js.Any],
        "HyperParameterTuningJobArn"    -> HyperParameterTuningJobArn.asInstanceOf[js.Any],
        "HyperParameterTuningJobConfig" -> HyperParameterTuningJobConfig.asInstanceOf[js.Any],
        "HyperParameterTuningJobName"   -> HyperParameterTuningJobName.asInstanceOf[js.Any],
        "HyperParameterTuningJobStatus" -> HyperParameterTuningJobStatus.asInstanceOf[js.Any],
        "ObjectiveStatusCounters"       -> ObjectiveStatusCounters.asInstanceOf[js.Any],
        "TrainingJobStatusCounters"     -> TrainingJobStatusCounters.asInstanceOf[js.Any]
      )

      BestTrainingJob.foreach(__v => __obj.updateDynamic("BestTrainingJob")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      HyperParameterTuningEndTime.foreach(
        __v => __obj.updateDynamic("HyperParameterTuningEndTime")(__v.asInstanceOf[js.Any])
      )
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      OverallBestTrainingJob.foreach(__v => __obj.updateDynamic("OverallBestTrainingJob")(__v.asInstanceOf[js.Any]))
      TrainingJobDefinition.foreach(__v => __obj.updateDynamic("TrainingJobDefinition")(__v.asInstanceOf[js.Any]))
      WarmStartConfig.foreach(__v => __obj.updateDynamic("WarmStartConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeHyperParameterTuningJobResponse]
    }
  }

  @js.native
  trait DescribeLabelingJobRequest extends js.Object {
    var LabelingJobName: LabelingJobName
  }

  object DescribeLabelingJobRequest {
    @inline
    def apply(
        LabelingJobName: LabelingJobName
    ): DescribeLabelingJobRequest = {
      val __obj = js.Dynamic.literal(
        "LabelingJobName" -> LabelingJobName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeLabelingJobRequest]
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
    @inline
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
        Tags: js.UndefOr[TagList] = js.undefined
    ): DescribeLabelingJobResponse = {
      val __obj = js.Dynamic.literal(
        "CreationTime"      -> CreationTime.asInstanceOf[js.Any],
        "HumanTaskConfig"   -> HumanTaskConfig.asInstanceOf[js.Any],
        "InputConfig"       -> InputConfig.asInstanceOf[js.Any],
        "JobReferenceCode"  -> JobReferenceCode.asInstanceOf[js.Any],
        "LabelCounters"     -> LabelCounters.asInstanceOf[js.Any],
        "LabelingJobArn"    -> LabelingJobArn.asInstanceOf[js.Any],
        "LabelingJobName"   -> LabelingJobName.asInstanceOf[js.Any],
        "LabelingJobStatus" -> LabelingJobStatus.asInstanceOf[js.Any],
        "LastModifiedTime"  -> LastModifiedTime.asInstanceOf[js.Any],
        "OutputConfig"      -> OutputConfig.asInstanceOf[js.Any],
        "RoleArn"           -> RoleArn.asInstanceOf[js.Any]
      )

      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LabelAttributeName.foreach(__v => __obj.updateDynamic("LabelAttributeName")(__v.asInstanceOf[js.Any]))
      LabelCategoryConfigS3Uri.foreach(__v => __obj.updateDynamic("LabelCategoryConfigS3Uri")(__v.asInstanceOf[js.Any]))
      LabelingJobAlgorithmsConfig.foreach(
        __v => __obj.updateDynamic("LabelingJobAlgorithmsConfig")(__v.asInstanceOf[js.Any])
      )
      LabelingJobOutput.foreach(__v => __obj.updateDynamic("LabelingJobOutput")(__v.asInstanceOf[js.Any]))
      StoppingConditions.foreach(__v => __obj.updateDynamic("StoppingConditions")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLabelingJobResponse]
    }
  }

  @js.native
  trait DescribeModelInput extends js.Object {
    var ModelName: ModelName
  }

  object DescribeModelInput {
    @inline
    def apply(
        ModelName: ModelName
    ): DescribeModelInput = {
      val __obj = js.Dynamic.literal(
        "ModelName" -> ModelName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeModelInput]
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
    @inline
    def apply(
        CreationTime: Timestamp,
        ExecutionRoleArn: RoleArn,
        ModelArn: ModelArn,
        ModelName: ModelName,
        Containers: js.UndefOr[ContainerDefinitionList] = js.undefined,
        EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
        PrimaryContainer: js.UndefOr[ContainerDefinition] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): DescribeModelOutput = {
      val __obj = js.Dynamic.literal(
        "CreationTime"     -> CreationTime.asInstanceOf[js.Any],
        "ExecutionRoleArn" -> ExecutionRoleArn.asInstanceOf[js.Any],
        "ModelArn"         -> ModelArn.asInstanceOf[js.Any],
        "ModelName"        -> ModelName.asInstanceOf[js.Any]
      )

      Containers.foreach(__v => __obj.updateDynamic("Containers")(__v.asInstanceOf[js.Any]))
      EnableNetworkIsolation.foreach(__v => __obj.updateDynamic("EnableNetworkIsolation")(__v.asInstanceOf[js.Any]))
      PrimaryContainer.foreach(__v => __obj.updateDynamic("PrimaryContainer")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeModelOutput]
    }
  }

  @js.native
  trait DescribeModelPackageInput extends js.Object {
    var ModelPackageName: ArnOrName
  }

  object DescribeModelPackageInput {
    @inline
    def apply(
        ModelPackageName: ArnOrName
    ): DescribeModelPackageInput = {
      val __obj = js.Dynamic.literal(
        "ModelPackageName" -> ModelPackageName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeModelPackageInput]
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
    @inline
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
        ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification] = js.undefined
    ): DescribeModelPackageOutput = {
      val __obj = js.Dynamic.literal(
        "CreationTime"              -> CreationTime.asInstanceOf[js.Any],
        "ModelPackageArn"           -> ModelPackageArn.asInstanceOf[js.Any],
        "ModelPackageName"          -> ModelPackageName.asInstanceOf[js.Any],
        "ModelPackageStatus"        -> ModelPackageStatus.asInstanceOf[js.Any],
        "ModelPackageStatusDetails" -> ModelPackageStatusDetails.asInstanceOf[js.Any]
      )

      CertifyForMarketplace.foreach(__v => __obj.updateDynamic("CertifyForMarketplace")(__v.asInstanceOf[js.Any]))
      InferenceSpecification.foreach(__v => __obj.updateDynamic("InferenceSpecification")(__v.asInstanceOf[js.Any]))
      ModelPackageDescription.foreach(__v => __obj.updateDynamic("ModelPackageDescription")(__v.asInstanceOf[js.Any]))
      SourceAlgorithmSpecification.foreach(
        __v => __obj.updateDynamic("SourceAlgorithmSpecification")(__v.asInstanceOf[js.Any])
      )
      ValidationSpecification.foreach(__v => __obj.updateDynamic("ValidationSpecification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeModelPackageOutput]
    }
  }

  @js.native
  trait DescribeNotebookInstanceInput extends js.Object {
    var NotebookInstanceName: NotebookInstanceName
  }

  object DescribeNotebookInstanceInput {
    @inline
    def apply(
        NotebookInstanceName: NotebookInstanceName
    ): DescribeNotebookInstanceInput = {
      val __obj = js.Dynamic.literal(
        "NotebookInstanceName" -> NotebookInstanceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeNotebookInstanceInput]
    }
  }

  @js.native
  trait DescribeNotebookInstanceLifecycleConfigInput extends js.Object {
    var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
  }

  object DescribeNotebookInstanceLifecycleConfigInput {
    @inline
    def apply(
        NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
    ): DescribeNotebookInstanceLifecycleConfigInput = {
      val __obj = js.Dynamic.literal(
        "NotebookInstanceLifecycleConfigName" -> NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeNotebookInstanceLifecycleConfigInput]
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
    @inline
    def apply(
        CreationTime: js.UndefOr[CreationTime] = js.undefined,
        LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined,
        NotebookInstanceLifecycleConfigArn: js.UndefOr[NotebookInstanceLifecycleConfigArn] = js.undefined,
        NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined,
        OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined,
        OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined
    ): DescribeNotebookInstanceLifecycleConfigOutput = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      NotebookInstanceLifecycleConfigArn.foreach(
        __v => __obj.updateDynamic("NotebookInstanceLifecycleConfigArn")(__v.asInstanceOf[js.Any])
      )
      NotebookInstanceLifecycleConfigName.foreach(
        __v => __obj.updateDynamic("NotebookInstanceLifecycleConfigName")(__v.asInstanceOf[js.Any])
      )
      OnCreate.foreach(__v => __obj.updateDynamic("OnCreate")(__v.asInstanceOf[js.Any]))
      OnStart.foreach(__v => __obj.updateDynamic("OnStart")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeNotebookInstanceLifecycleConfigOutput]
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
    var RootAccess: js.UndefOr[RootAccess]
    var SecurityGroups: js.UndefOr[SecurityGroupIds]
    var SubnetId: js.UndefOr[SubnetId]
    var Url: js.UndefOr[NotebookInstanceUrl]
    var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB]
  }

  object DescribeNotebookInstanceOutput {
    @inline
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
        RootAccess: js.UndefOr[RootAccess] = js.undefined,
        SecurityGroups: js.UndefOr[SecurityGroupIds] = js.undefined,
        SubnetId: js.UndefOr[SubnetId] = js.undefined,
        Url: js.UndefOr[NotebookInstanceUrl] = js.undefined,
        VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.undefined
    ): DescribeNotebookInstanceOutput = {
      val __obj = js.Dynamic.literal()
      AcceleratorTypes.foreach(__v => __obj.updateDynamic("AcceleratorTypes")(__v.asInstanceOf[js.Any]))
      AdditionalCodeRepositories.foreach(
        __v => __obj.updateDynamic("AdditionalCodeRepositories")(__v.asInstanceOf[js.Any])
      )
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DefaultCodeRepository.foreach(__v => __obj.updateDynamic("DefaultCodeRepository")(__v.asInstanceOf[js.Any]))
      DirectInternetAccess.foreach(__v => __obj.updateDynamic("DirectInternetAccess")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      NetworkInterfaceId.foreach(__v => __obj.updateDynamic("NetworkInterfaceId")(__v.asInstanceOf[js.Any]))
      NotebookInstanceArn.foreach(__v => __obj.updateDynamic("NotebookInstanceArn")(__v.asInstanceOf[js.Any]))
      NotebookInstanceLifecycleConfigName.foreach(
        __v => __obj.updateDynamic("NotebookInstanceLifecycleConfigName")(__v.asInstanceOf[js.Any])
      )
      NotebookInstanceName.foreach(__v => __obj.updateDynamic("NotebookInstanceName")(__v.asInstanceOf[js.Any]))
      NotebookInstanceStatus.foreach(__v => __obj.updateDynamic("NotebookInstanceStatus")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      RootAccess.foreach(__v => __obj.updateDynamic("RootAccess")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      VolumeSizeInGB.foreach(__v => __obj.updateDynamic("VolumeSizeInGB")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeNotebookInstanceOutput]
    }
  }

  @js.native
  trait DescribeSubscribedWorkteamRequest extends js.Object {
    var WorkteamArn: WorkteamArn
  }

  object DescribeSubscribedWorkteamRequest {
    @inline
    def apply(
        WorkteamArn: WorkteamArn
    ): DescribeSubscribedWorkteamRequest = {
      val __obj = js.Dynamic.literal(
        "WorkteamArn" -> WorkteamArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeSubscribedWorkteamRequest]
    }
  }

  @js.native
  trait DescribeSubscribedWorkteamResponse extends js.Object {
    var SubscribedWorkteam: SubscribedWorkteam
  }

  object DescribeSubscribedWorkteamResponse {
    @inline
    def apply(
        SubscribedWorkteam: SubscribedWorkteam
    ): DescribeSubscribedWorkteamResponse = {
      val __obj = js.Dynamic.literal(
        "SubscribedWorkteam" -> SubscribedWorkteam.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeSubscribedWorkteamResponse]
    }
  }

  @js.native
  trait DescribeTrainingJobRequest extends js.Object {
    var TrainingJobName: TrainingJobName
  }

  object DescribeTrainingJobRequest {
    @inline
    def apply(
        TrainingJobName: TrainingJobName
    ): DescribeTrainingJobRequest = {
      val __obj = js.Dynamic.literal(
        "TrainingJobName" -> TrainingJobName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeTrainingJobRequest]
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
    var BillableTimeInSeconds: js.UndefOr[BillableTimeInSeconds]
    var CheckpointConfig: js.UndefOr[CheckpointConfig]
    var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean]
    var EnableManagedSpotTraining: js.UndefOr[Boolean]
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
    var TrainingTimeInSeconds: js.UndefOr[TrainingTimeInSeconds]
    var TuningJobArn: js.UndefOr[HyperParameterTuningJobArn]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object DescribeTrainingJobResponse {
    @inline
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
        BillableTimeInSeconds: js.UndefOr[BillableTimeInSeconds] = js.undefined,
        CheckpointConfig: js.UndefOr[CheckpointConfig] = js.undefined,
        EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined,
        EnableManagedSpotTraining: js.UndefOr[Boolean] = js.undefined,
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
        TrainingTimeInSeconds: js.UndefOr[TrainingTimeInSeconds] = js.undefined,
        TuningJobArn: js.UndefOr[HyperParameterTuningJobArn] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): DescribeTrainingJobResponse = {
      val __obj = js.Dynamic.literal(
        "AlgorithmSpecification" -> AlgorithmSpecification.asInstanceOf[js.Any],
        "CreationTime"           -> CreationTime.asInstanceOf[js.Any],
        "ModelArtifacts"         -> ModelArtifacts.asInstanceOf[js.Any],
        "ResourceConfig"         -> ResourceConfig.asInstanceOf[js.Any],
        "SecondaryStatus"        -> SecondaryStatus.asInstanceOf[js.Any],
        "StoppingCondition"      -> StoppingCondition.asInstanceOf[js.Any],
        "TrainingJobArn"         -> TrainingJobArn.asInstanceOf[js.Any],
        "TrainingJobName"        -> TrainingJobName.asInstanceOf[js.Any],
        "TrainingJobStatus"      -> TrainingJobStatus.asInstanceOf[js.Any]
      )

      BillableTimeInSeconds.foreach(__v => __obj.updateDynamic("BillableTimeInSeconds")(__v.asInstanceOf[js.Any]))
      CheckpointConfig.foreach(__v => __obj.updateDynamic("CheckpointConfig")(__v.asInstanceOf[js.Any]))
      EnableInterContainerTrafficEncryption.foreach(
        __v => __obj.updateDynamic("EnableInterContainerTrafficEncryption")(__v.asInstanceOf[js.Any])
      )
      EnableManagedSpotTraining.foreach(
        __v => __obj.updateDynamic("EnableManagedSpotTraining")(__v.asInstanceOf[js.Any])
      )
      EnableNetworkIsolation.foreach(__v => __obj.updateDynamic("EnableNetworkIsolation")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      FinalMetricDataList.foreach(__v => __obj.updateDynamic("FinalMetricDataList")(__v.asInstanceOf[js.Any]))
      HyperParameters.foreach(__v => __obj.updateDynamic("HyperParameters")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      LabelingJobArn.foreach(__v => __obj.updateDynamic("LabelingJobArn")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.updateDynamic("OutputDataConfig")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      SecondaryStatusTransitions.foreach(
        __v => __obj.updateDynamic("SecondaryStatusTransitions")(__v.asInstanceOf[js.Any])
      )
      TrainingEndTime.foreach(__v => __obj.updateDynamic("TrainingEndTime")(__v.asInstanceOf[js.Any]))
      TrainingStartTime.foreach(__v => __obj.updateDynamic("TrainingStartTime")(__v.asInstanceOf[js.Any]))
      TrainingTimeInSeconds.foreach(__v => __obj.updateDynamic("TrainingTimeInSeconds")(__v.asInstanceOf[js.Any]))
      TuningJobArn.foreach(__v => __obj.updateDynamic("TuningJobArn")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTrainingJobResponse]
    }
  }

  @js.native
  trait DescribeTransformJobRequest extends js.Object {
    var TransformJobName: TransformJobName
  }

  object DescribeTransformJobRequest {
    @inline
    def apply(
        TransformJobName: TransformJobName
    ): DescribeTransformJobRequest = {
      val __obj = js.Dynamic.literal(
        "TransformJobName" -> TransformJobName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeTransformJobRequest]
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
    var DataProcessing: js.UndefOr[DataProcessing]
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
    @inline
    def apply(
        CreationTime: Timestamp,
        ModelName: ModelName,
        TransformInput: TransformInput,
        TransformJobArn: TransformJobArn,
        TransformJobName: TransformJobName,
        TransformJobStatus: TransformJobStatus,
        TransformResources: TransformResources,
        BatchStrategy: js.UndefOr[BatchStrategy] = js.undefined,
        DataProcessing: js.UndefOr[DataProcessing] = js.undefined,
        Environment: js.UndefOr[TransformEnvironmentMap] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        LabelingJobArn: js.UndefOr[LabelingJobArn] = js.undefined,
        MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms] = js.undefined,
        MaxPayloadInMB: js.UndefOr[MaxPayloadInMB] = js.undefined,
        TransformEndTime: js.UndefOr[Timestamp] = js.undefined,
        TransformOutput: js.UndefOr[TransformOutput] = js.undefined,
        TransformStartTime: js.UndefOr[Timestamp] = js.undefined
    ): DescribeTransformJobResponse = {
      val __obj = js.Dynamic.literal(
        "CreationTime"       -> CreationTime.asInstanceOf[js.Any],
        "ModelName"          -> ModelName.asInstanceOf[js.Any],
        "TransformInput"     -> TransformInput.asInstanceOf[js.Any],
        "TransformJobArn"    -> TransformJobArn.asInstanceOf[js.Any],
        "TransformJobName"   -> TransformJobName.asInstanceOf[js.Any],
        "TransformJobStatus" -> TransformJobStatus.asInstanceOf[js.Any],
        "TransformResources" -> TransformResources.asInstanceOf[js.Any]
      )

      BatchStrategy.foreach(__v => __obj.updateDynamic("BatchStrategy")(__v.asInstanceOf[js.Any]))
      DataProcessing.foreach(__v => __obj.updateDynamic("DataProcessing")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LabelingJobArn.foreach(__v => __obj.updateDynamic("LabelingJobArn")(__v.asInstanceOf[js.Any]))
      MaxConcurrentTransforms.foreach(__v => __obj.updateDynamic("MaxConcurrentTransforms")(__v.asInstanceOf[js.Any]))
      MaxPayloadInMB.foreach(__v => __obj.updateDynamic("MaxPayloadInMB")(__v.asInstanceOf[js.Any]))
      TransformEndTime.foreach(__v => __obj.updateDynamic("TransformEndTime")(__v.asInstanceOf[js.Any]))
      TransformOutput.foreach(__v => __obj.updateDynamic("TransformOutput")(__v.asInstanceOf[js.Any]))
      TransformStartTime.foreach(__v => __obj.updateDynamic("TransformStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTransformJobResponse]
    }
  }

  @js.native
  trait DescribeWorkteamRequest extends js.Object {
    var WorkteamName: WorkteamName
  }

  object DescribeWorkteamRequest {
    @inline
    def apply(
        WorkteamName: WorkteamName
    ): DescribeWorkteamRequest = {
      val __obj = js.Dynamic.literal(
        "WorkteamName" -> WorkteamName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeWorkteamRequest]
    }
  }

  @js.native
  trait DescribeWorkteamResponse extends js.Object {
    var Workteam: Workteam
  }

  object DescribeWorkteamResponse {
    @inline
    def apply(
        Workteam: Workteam
    ): DescribeWorkteamResponse = {
      val __obj = js.Dynamic.literal(
        "Workteam" -> Workteam.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeWorkteamResponse]
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
    @inline
    def apply(
        VariantName: VariantName,
        DesiredInstanceCount: js.UndefOr[TaskCount] = js.undefined,
        DesiredWeight: js.UndefOr[VariantWeight] = js.undefined
    ): DesiredWeightAndCapacity = {
      val __obj = js.Dynamic.literal(
        "VariantName" -> VariantName.asInstanceOf[js.Any]
      )

      DesiredInstanceCount.foreach(__v => __obj.updateDynamic("DesiredInstanceCount")(__v.asInstanceOf[js.Any]))
      DesiredWeight.foreach(__v => __obj.updateDynamic("DesiredWeight")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DesiredWeightAndCapacity]
    }
  }

  object DetailedAlgorithmStatusEnum {
    val NotStarted = "NotStarted"
    val InProgress = "InProgress"
    val Completed  = "Completed"
    val Failed     = "Failed"

    val values = js.Object.freeze(js.Array(NotStarted, InProgress, Completed, Failed))
  }

  object DetailedModelPackageStatusEnum {
    val NotStarted = "NotStarted"
    val InProgress = "InProgress"
    val Completed  = "Completed"
    val Failed     = "Failed"

    val values = js.Object.freeze(js.Array(NotStarted, InProgress, Completed, Failed))
  }

  object DirectInternetAccessEnum {
    val Enabled  = "Enabled"
    val Disabled = "Disabled"

    val values = js.Object.freeze(js.Array(Enabled, Disabled))
  }

  object EndpointConfigSortKeyEnum {
    val Name         = "Name"
    val CreationTime = "CreationTime"

    val values = js.Object.freeze(js.Array(Name, CreationTime))
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
    @inline
    def apply(
        CreationTime: Timestamp,
        EndpointConfigArn: EndpointConfigArn,
        EndpointConfigName: EndpointConfigName
    ): EndpointConfigSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime"       -> CreationTime.asInstanceOf[js.Any],
        "EndpointConfigArn"  -> EndpointConfigArn.asInstanceOf[js.Any],
        "EndpointConfigName" -> EndpointConfigName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EndpointConfigSummary]
    }
  }

  object EndpointSortKeyEnum {
    val Name         = "Name"
    val CreationTime = "CreationTime"
    val Status       = "Status"

    val values = js.Object.freeze(js.Array(Name, CreationTime, Status))
  }

  object EndpointStatusEnum {
    val OutOfService   = "OutOfService"
    val Creating       = "Creating"
    val Updating       = "Updating"
    val SystemUpdating = "SystemUpdating"
    val RollingBack    = "RollingBack"
    val InService      = "InService"
    val Deleting       = "Deleting"
    val Failed         = "Failed"

    val values = js.Object.freeze(
      js.Array(OutOfService, Creating, Updating, SystemUpdating, RollingBack, InService, Deleting, Failed)
    )
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
    @inline
    def apply(
        CreationTime: Timestamp,
        EndpointArn: EndpointArn,
        EndpointName: EndpointName,
        EndpointStatus: EndpointStatus,
        LastModifiedTime: Timestamp
    ): EndpointSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime"     -> CreationTime.asInstanceOf[js.Any],
        "EndpointArn"      -> EndpointArn.asInstanceOf[js.Any],
        "EndpointName"     -> EndpointName.asInstanceOf[js.Any],
        "EndpointStatus"   -> EndpointStatus.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EndpointSummary]
    }
  }

  object FileSystemAccessModeEnum {
    val rw = "rw"
    val ro = "ro"

    val values = js.Object.freeze(js.Array(rw, ro))
  }

  /**
    * Specifies a file system data source for a channel.
    */
  @js.native
  trait FileSystemDataSource extends js.Object {
    var DirectoryPath: DirectoryPath
    var FileSystemAccessMode: FileSystemAccessMode
    var FileSystemId: FileSystemId
    var FileSystemType: FileSystemType
  }

  object FileSystemDataSource {
    @inline
    def apply(
        DirectoryPath: DirectoryPath,
        FileSystemAccessMode: FileSystemAccessMode,
        FileSystemId: FileSystemId,
        FileSystemType: FileSystemType
    ): FileSystemDataSource = {
      val __obj = js.Dynamic.literal(
        "DirectoryPath"        -> DirectoryPath.asInstanceOf[js.Any],
        "FileSystemAccessMode" -> FileSystemAccessMode.asInstanceOf[js.Any],
        "FileSystemId"         -> FileSystemId.asInstanceOf[js.Any],
        "FileSystemType"       -> FileSystemType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[FileSystemDataSource]
    }
  }

  object FileSystemTypeEnum {
    val EFS       = "EFS"
    val FSxLustre = "FSxLustre"

    val values = js.Object.freeze(js.Array(EFS, FSxLustre))
  }

  /**
    * A conditional statement for a search expression that includes a Boolean operator, a resource property, and a value.
    *  If you don't specify an <code>Operator</code> and a <code>Value</code>, the filter searches for only the specified property. For example, defining a <code>Filter</code> for the <code>FailureReason</code> for the <code>TrainingJob</code> <code>Resource</code> searches for training job objects that have a value in the <code>FailureReason</code> field.
    *  If you specify a <code>Value</code>, but not an <code>Operator</code>, Amazon SageMaker uses the equals operator as the default.
    *  In search, there are several property types:
    *  <dl> <dt>Metrics</dt> <dd> To define a metric filter, enter a value using the form <code>"Metrics.&lt;name&gt;"</code>, where <code>&lt;name&gt;</code> is a metric name. For example, the following filter searches for training jobs with an <code>"accuracy"</code> metric greater than <code>"0.9"</code>:
    *  <code>{</code>
    *  <code>"Name": "Metrics.accuracy",</code>
    *  <code>"Operator": "GREATER_THAN",</code>
    *  <code>"Value": "0.9"</code>
    *  <code>}</code>
    *  </dd> <dt>HyperParameters</dt> <dd> To define a hyperparameter filter, enter a value with the form <code>"HyperParameters.&lt;name&gt;"</code>. Decimal hyperparameter values are treated as a decimal in a comparison if the specified <code>Value</code> is also a decimal value. If the specified <code>Value</code> is an integer, the decimal hyperparameter values are treated as integers. For example, the following filter is satisfied by training jobs with a <code>"learning_rate"</code> hyperparameter that is less than <code>"0.5"</code>:
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
    @inline
    def apply(
        Name: ResourcePropertyName,
        Operator: js.UndefOr[Operator] = js.undefined,
        Value: js.UndefOr[FilterValue] = js.undefined
    ): Filter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Operator.foreach(__v => __obj.updateDynamic("Operator")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filter]
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
    @inline
    def apply(
        MetricName: MetricName,
        Value: MetricValue,
        Type: js.UndefOr[HyperParameterTuningJobObjectiveType] = js.undefined
    ): FinalHyperParameterTuningJobObjectiveMetric = {
      val __obj = js.Dynamic.literal(
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Value"      -> Value.asInstanceOf[js.Any]
      )

      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FinalHyperParameterTuningJobObjectiveMetric]
    }
  }

  object FrameworkEnum {
    val TENSORFLOW = "TENSORFLOW"
    val MXNET      = "MXNET"
    val ONNX       = "ONNX"
    val PYTORCH    = "PYTORCH"
    val XGBOOST    = "XGBOOST"

    val values = js.Object.freeze(js.Array(TENSORFLOW, MXNET, ONNX, PYTORCH, XGBOOST))
  }

  @js.native
  trait GetSearchSuggestionsRequest extends js.Object {
    var Resource: ResourceType
    var SuggestionQuery: js.UndefOr[SuggestionQuery]
  }

  object GetSearchSuggestionsRequest {
    @inline
    def apply(
        Resource: ResourceType,
        SuggestionQuery: js.UndefOr[SuggestionQuery] = js.undefined
    ): GetSearchSuggestionsRequest = {
      val __obj = js.Dynamic.literal(
        "Resource" -> Resource.asInstanceOf[js.Any]
      )

      SuggestionQuery.foreach(__v => __obj.updateDynamic("SuggestionQuery")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSearchSuggestionsRequest]
    }
  }

  @js.native
  trait GetSearchSuggestionsResponse extends js.Object {
    var PropertyNameSuggestions: js.UndefOr[PropertyNameSuggestionList]
  }

  object GetSearchSuggestionsResponse {
    @inline
    def apply(
        PropertyNameSuggestions: js.UndefOr[PropertyNameSuggestionList] = js.undefined
    ): GetSearchSuggestionsResponse = {
      val __obj = js.Dynamic.literal()
      PropertyNameSuggestions.foreach(__v => __obj.updateDynamic("PropertyNameSuggestions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSearchSuggestionsResponse]
    }
  }

  /**
    * Specifies configuration details for a Git repository in your AWS account.
    */
  @js.native
  trait GitConfig extends js.Object {
    var RepositoryUrl: GitConfigUrl
    var Branch: js.UndefOr[Branch]
    var SecretArn: js.UndefOr[SecretArn]
  }

  object GitConfig {
    @inline
    def apply(
        RepositoryUrl: GitConfigUrl,
        Branch: js.UndefOr[Branch] = js.undefined,
        SecretArn: js.UndefOr[SecretArn] = js.undefined
    ): GitConfig = {
      val __obj = js.Dynamic.literal(
        "RepositoryUrl" -> RepositoryUrl.asInstanceOf[js.Any]
      )

      Branch.foreach(__v => __obj.updateDynamic("Branch")(__v.asInstanceOf[js.Any]))
      SecretArn.foreach(__v => __obj.updateDynamic("SecretArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GitConfig]
    }
  }

  /**
    * Specifies configuration details for a Git repository when the repository is updated.
    */
  @js.native
  trait GitConfigForUpdate extends js.Object {
    var SecretArn: js.UndefOr[SecretArn]
  }

  object GitConfigForUpdate {
    @inline
    def apply(
        SecretArn: js.UndefOr[SecretArn] = js.undefined
    ): GitConfigForUpdate = {
      val __obj = js.Dynamic.literal()
      SecretArn.foreach(__v => __obj.updateDynamic("SecretArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GitConfigForUpdate]
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
    @inline
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
        TaskKeywords: js.UndefOr[TaskKeywords] = js.undefined
    ): HumanTaskConfig = {
      val __obj = js.Dynamic.literal(
        "AnnotationConsolidationConfig"     -> AnnotationConsolidationConfig.asInstanceOf[js.Any],
        "NumberOfHumanWorkersPerDataObject" -> NumberOfHumanWorkersPerDataObject.asInstanceOf[js.Any],
        "PreHumanTaskLambdaArn"             -> PreHumanTaskLambdaArn.asInstanceOf[js.Any],
        "TaskDescription"                   -> TaskDescription.asInstanceOf[js.Any],
        "TaskTimeLimitInSeconds"            -> TaskTimeLimitInSeconds.asInstanceOf[js.Any],
        "TaskTitle"                         -> TaskTitle.asInstanceOf[js.Any],
        "UiConfig"                          -> UiConfig.asInstanceOf[js.Any],
        "WorkteamArn"                       -> WorkteamArn.asInstanceOf[js.Any]
      )

      MaxConcurrentTaskCount.foreach(__v => __obj.updateDynamic("MaxConcurrentTaskCount")(__v.asInstanceOf[js.Any]))
      PublicWorkforceTaskPrice.foreach(__v => __obj.updateDynamic("PublicWorkforceTaskPrice")(__v.asInstanceOf[js.Any]))
      TaskAvailabilityLifetimeInSeconds.foreach(
        __v => __obj.updateDynamic("TaskAvailabilityLifetimeInSeconds")(__v.asInstanceOf[js.Any])
      )
      TaskKeywords.foreach(__v => __obj.updateDynamic("TaskKeywords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HumanTaskConfig]
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
    @inline
    def apply(
        TrainingInputMode: TrainingInputMode,
        AlgorithmName: js.UndefOr[ArnOrName] = js.undefined,
        MetricDefinitions: js.UndefOr[MetricDefinitionList] = js.undefined,
        TrainingImage: js.UndefOr[AlgorithmImage] = js.undefined
    ): HyperParameterAlgorithmSpecification = {
      val __obj = js.Dynamic.literal(
        "TrainingInputMode" -> TrainingInputMode.asInstanceOf[js.Any]
      )

      AlgorithmName.foreach(__v => __obj.updateDynamic("AlgorithmName")(__v.asInstanceOf[js.Any]))
      MetricDefinitions.foreach(__v => __obj.updateDynamic("MetricDefinitions")(__v.asInstanceOf[js.Any]))
      TrainingImage.foreach(__v => __obj.updateDynamic("TrainingImage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HyperParameterAlgorithmSpecification]
    }
  }

  object HyperParameterScalingTypeEnum {
    val Auto               = "Auto"
    val Linear             = "Linear"
    val Logarithmic        = "Logarithmic"
    val ReverseLogarithmic = "ReverseLogarithmic"

    val values = js.Object.freeze(js.Array(Auto, Linear, Logarithmic, ReverseLogarithmic))
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
    @inline
    def apply(
        Name: ParameterName,
        Type: ParameterType,
        DefaultValue: js.UndefOr[ParameterValue] = js.undefined,
        Description: js.UndefOr[EntityDescription] = js.undefined,
        IsRequired: js.UndefOr[Boolean] = js.undefined,
        IsTunable: js.UndefOr[Boolean] = js.undefined,
        Range: js.UndefOr[ParameterRange] = js.undefined
    ): HyperParameterSpecification = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IsRequired.foreach(__v => __obj.updateDynamic("IsRequired")(__v.asInstanceOf[js.Any]))
      IsTunable.foreach(__v => __obj.updateDynamic("IsTunable")(__v.asInstanceOf[js.Any]))
      Range.foreach(__v => __obj.updateDynamic("Range")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HyperParameterSpecification]
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
    var CheckpointConfig: js.UndefOr[CheckpointConfig]
    var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean]
    var EnableManagedSpotTraining: js.UndefOr[Boolean]
    var EnableNetworkIsolation: js.UndefOr[Boolean]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var StaticHyperParameters: js.UndefOr[HyperParameters]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object HyperParameterTrainingJobDefinition {
    @inline
    def apply(
        AlgorithmSpecification: HyperParameterAlgorithmSpecification,
        OutputDataConfig: OutputDataConfig,
        ResourceConfig: ResourceConfig,
        RoleArn: RoleArn,
        StoppingCondition: StoppingCondition,
        CheckpointConfig: js.UndefOr[CheckpointConfig] = js.undefined,
        EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined,
        EnableManagedSpotTraining: js.UndefOr[Boolean] = js.undefined,
        EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        StaticHyperParameters: js.UndefOr[HyperParameters] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): HyperParameterTrainingJobDefinition = {
      val __obj = js.Dynamic.literal(
        "AlgorithmSpecification" -> AlgorithmSpecification.asInstanceOf[js.Any],
        "OutputDataConfig"       -> OutputDataConfig.asInstanceOf[js.Any],
        "ResourceConfig"         -> ResourceConfig.asInstanceOf[js.Any],
        "RoleArn"                -> RoleArn.asInstanceOf[js.Any],
        "StoppingCondition"      -> StoppingCondition.asInstanceOf[js.Any]
      )

      CheckpointConfig.foreach(__v => __obj.updateDynamic("CheckpointConfig")(__v.asInstanceOf[js.Any]))
      EnableInterContainerTrafficEncryption.foreach(
        __v => __obj.updateDynamic("EnableInterContainerTrafficEncryption")(__v.asInstanceOf[js.Any])
      )
      EnableManagedSpotTraining.foreach(
        __v => __obj.updateDynamic("EnableManagedSpotTraining")(__v.asInstanceOf[js.Any])
      )
      EnableNetworkIsolation.foreach(__v => __obj.updateDynamic("EnableNetworkIsolation")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      StaticHyperParameters.foreach(__v => __obj.updateDynamic("StaticHyperParameters")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HyperParameterTrainingJobDefinition]
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
    @inline
    def apply(
        CreationTime: Timestamp,
        TrainingJobArn: TrainingJobArn,
        TrainingJobName: TrainingJobName,
        TrainingJobStatus: TrainingJobStatus,
        TunedHyperParameters: HyperParameters,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        FinalHyperParameterTuningJobObjectiveMetric: js.UndefOr[FinalHyperParameterTuningJobObjectiveMetric] =
          js.undefined,
        ObjectiveStatus: js.UndefOr[ObjectiveStatus] = js.undefined,
        TrainingEndTime: js.UndefOr[Timestamp] = js.undefined,
        TrainingStartTime: js.UndefOr[Timestamp] = js.undefined,
        TuningJobName: js.UndefOr[HyperParameterTuningJobName] = js.undefined
    ): HyperParameterTrainingJobSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime"         -> CreationTime.asInstanceOf[js.Any],
        "TrainingJobArn"       -> TrainingJobArn.asInstanceOf[js.Any],
        "TrainingJobName"      -> TrainingJobName.asInstanceOf[js.Any],
        "TrainingJobStatus"    -> TrainingJobStatus.asInstanceOf[js.Any],
        "TunedHyperParameters" -> TunedHyperParameters.asInstanceOf[js.Any]
      )

      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      FinalHyperParameterTuningJobObjectiveMetric.foreach(
        __v => __obj.updateDynamic("FinalHyperParameterTuningJobObjectiveMetric")(__v.asInstanceOf[js.Any])
      )
      ObjectiveStatus.foreach(__v => __obj.updateDynamic("ObjectiveStatus")(__v.asInstanceOf[js.Any]))
      TrainingEndTime.foreach(__v => __obj.updateDynamic("TrainingEndTime")(__v.asInstanceOf[js.Any]))
      TrainingStartTime.foreach(__v => __obj.updateDynamic("TrainingStartTime")(__v.asInstanceOf[js.Any]))
      TuningJobName.foreach(__v => __obj.updateDynamic("TuningJobName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HyperParameterTrainingJobSummary]
    }
  }

  /**
    * Configures a hyperparameter tuning job.
    */
  @js.native
  trait HyperParameterTuningJobConfig extends js.Object {
    var ResourceLimits: ResourceLimits
    var Strategy: HyperParameterTuningJobStrategyType
    var HyperParameterTuningJobObjective: js.UndefOr[HyperParameterTuningJobObjective]
    var ParameterRanges: js.UndefOr[ParameterRanges]
    var TrainingJobEarlyStoppingType: js.UndefOr[TrainingJobEarlyStoppingType]
  }

  object HyperParameterTuningJobConfig {
    @inline
    def apply(
        ResourceLimits: ResourceLimits,
        Strategy: HyperParameterTuningJobStrategyType,
        HyperParameterTuningJobObjective: js.UndefOr[HyperParameterTuningJobObjective] = js.undefined,
        ParameterRanges: js.UndefOr[ParameterRanges] = js.undefined,
        TrainingJobEarlyStoppingType: js.UndefOr[TrainingJobEarlyStoppingType] = js.undefined
    ): HyperParameterTuningJobConfig = {
      val __obj = js.Dynamic.literal(
        "ResourceLimits" -> ResourceLimits.asInstanceOf[js.Any],
        "Strategy"       -> Strategy.asInstanceOf[js.Any]
      )

      HyperParameterTuningJobObjective.foreach(
        __v => __obj.updateDynamic("HyperParameterTuningJobObjective")(__v.asInstanceOf[js.Any])
      )
      ParameterRanges.foreach(__v => __obj.updateDynamic("ParameterRanges")(__v.asInstanceOf[js.Any]))
      TrainingJobEarlyStoppingType.foreach(
        __v => __obj.updateDynamic("TrainingJobEarlyStoppingType")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[HyperParameterTuningJobConfig]
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
    @inline
    def apply(
        MetricName: MetricName,
        Type: HyperParameterTuningJobObjectiveType
    ): HyperParameterTuningJobObjective = {
      val __obj = js.Dynamic.literal(
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Type"       -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[HyperParameterTuningJobObjective]
    }
  }

  object HyperParameterTuningJobObjectiveTypeEnum {
    val Maximize = "Maximize"
    val Minimize = "Minimize"

    val values = js.Object.freeze(js.Array(Maximize, Minimize))
  }

  object HyperParameterTuningJobSortByOptionsEnum {
    val Name         = "Name"
    val Status       = "Status"
    val CreationTime = "CreationTime"

    val values = js.Object.freeze(js.Array(Name, Status, CreationTime))
  }

  object HyperParameterTuningJobStatusEnum {
    val Completed  = "Completed"
    val InProgress = "InProgress"
    val Failed     = "Failed"
    val Stopped    = "Stopped"
    val Stopping   = "Stopping"

    val values = js.Object.freeze(js.Array(Completed, InProgress, Failed, Stopped, Stopping))
  }

  /**
    * The strategy hyperparameter tuning uses to find the best combination of hyperparameters for your model. Currently, the only supported value is <code>Bayesian</code>.
    */
  object HyperParameterTuningJobStrategyTypeEnum {
    val Bayesian = "Bayesian"
    val Random   = "Random"

    val values = js.Object.freeze(js.Array(Bayesian, Random))
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
    @inline
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
        ResourceLimits: js.UndefOr[ResourceLimits] = js.undefined
    ): HyperParameterTuningJobSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime"                  -> CreationTime.asInstanceOf[js.Any],
        "HyperParameterTuningJobArn"    -> HyperParameterTuningJobArn.asInstanceOf[js.Any],
        "HyperParameterTuningJobName"   -> HyperParameterTuningJobName.asInstanceOf[js.Any],
        "HyperParameterTuningJobStatus" -> HyperParameterTuningJobStatus.asInstanceOf[js.Any],
        "ObjectiveStatusCounters"       -> ObjectiveStatusCounters.asInstanceOf[js.Any],
        "Strategy"                      -> Strategy.asInstanceOf[js.Any],
        "TrainingJobStatusCounters"     -> TrainingJobStatusCounters.asInstanceOf[js.Any]
      )

      HyperParameterTuningEndTime.foreach(
        __v => __obj.updateDynamic("HyperParameterTuningEndTime")(__v.asInstanceOf[js.Any])
      )
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      ResourceLimits.foreach(__v => __obj.updateDynamic("ResourceLimits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HyperParameterTuningJobSummary]
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
    @inline
    def apply(
        ParentHyperParameterTuningJobs: ParentHyperParameterTuningJobs,
        WarmStartType: HyperParameterTuningJobWarmStartType
    ): HyperParameterTuningJobWarmStartConfig = {
      val __obj = js.Dynamic.literal(
        "ParentHyperParameterTuningJobs" -> ParentHyperParameterTuningJobs.asInstanceOf[js.Any],
        "WarmStartType"                  -> WarmStartType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[HyperParameterTuningJobWarmStartConfig]
    }
  }

  object HyperParameterTuningJobWarmStartTypeEnum {
    val IdenticalDataAndAlgorithm = "IdenticalDataAndAlgorithm"
    val TransferLearning          = "TransferLearning"

    val values = js.Object.freeze(js.Array(IdenticalDataAndAlgorithm, TransferLearning))
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
    @inline
    def apply(
        Containers: ModelPackageContainerDefinitionList,
        SupportedContentTypes: ContentTypes,
        SupportedRealtimeInferenceInstanceTypes: RealtimeInferenceInstanceTypes,
        SupportedResponseMIMETypes: ResponseMIMETypes,
        SupportedTransformInstanceTypes: TransformInstanceTypes
    ): InferenceSpecification = {
      val __obj = js.Dynamic.literal(
        "Containers"                              -> Containers.asInstanceOf[js.Any],
        "SupportedContentTypes"                   -> SupportedContentTypes.asInstanceOf[js.Any],
        "SupportedRealtimeInferenceInstanceTypes" -> SupportedRealtimeInferenceInstanceTypes.asInstanceOf[js.Any],
        "SupportedResponseMIMETypes"              -> SupportedResponseMIMETypes.asInstanceOf[js.Any],
        "SupportedTransformInstanceTypes"         -> SupportedTransformInstanceTypes.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InferenceSpecification]
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
    @inline
    def apply(
        DataInputConfig: DataInputConfig,
        Framework: Framework,
        S3Uri: S3Uri
    ): InputConfig = {
      val __obj = js.Dynamic.literal(
        "DataInputConfig" -> DataInputConfig.asInstanceOf[js.Any],
        "Framework"       -> Framework.asInstanceOf[js.Any],
        "S3Uri"           -> S3Uri.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InputConfig]
    }
  }

  object InstanceTypeEnum {
    val `ml.t2.medium`    = "ml.t2.medium"
    val `ml.t2.large`     = "ml.t2.large"
    val `ml.t2.xlarge`    = "ml.t2.xlarge"
    val `ml.t2.2xlarge`   = "ml.t2.2xlarge"
    val `ml.t3.medium`    = "ml.t3.medium"
    val `ml.t3.large`     = "ml.t3.large"
    val `ml.t3.xlarge`    = "ml.t3.xlarge"
    val `ml.t3.2xlarge`   = "ml.t3.2xlarge"
    val `ml.m4.xlarge`    = "ml.m4.xlarge"
    val `ml.m4.2xlarge`   = "ml.m4.2xlarge"
    val `ml.m4.4xlarge`   = "ml.m4.4xlarge"
    val `ml.m4.10xlarge`  = "ml.m4.10xlarge"
    val `ml.m4.16xlarge`  = "ml.m4.16xlarge"
    val `ml.m5.xlarge`    = "ml.m5.xlarge"
    val `ml.m5.2xlarge`   = "ml.m5.2xlarge"
    val `ml.m5.4xlarge`   = "ml.m5.4xlarge"
    val `ml.m5.12xlarge`  = "ml.m5.12xlarge"
    val `ml.m5.24xlarge`  = "ml.m5.24xlarge"
    val `ml.c4.xlarge`    = "ml.c4.xlarge"
    val `ml.c4.2xlarge`   = "ml.c4.2xlarge"
    val `ml.c4.4xlarge`   = "ml.c4.4xlarge"
    val `ml.c4.8xlarge`   = "ml.c4.8xlarge"
    val `ml.c5.xlarge`    = "ml.c5.xlarge"
    val `ml.c5.2xlarge`   = "ml.c5.2xlarge"
    val `ml.c5.4xlarge`   = "ml.c5.4xlarge"
    val `ml.c5.9xlarge`   = "ml.c5.9xlarge"
    val `ml.c5.18xlarge`  = "ml.c5.18xlarge"
    val `ml.c5d.xlarge`   = "ml.c5d.xlarge"
    val `ml.c5d.2xlarge`  = "ml.c5d.2xlarge"
    val `ml.c5d.4xlarge`  = "ml.c5d.4xlarge"
    val `ml.c5d.9xlarge`  = "ml.c5d.9xlarge"
    val `ml.c5d.18xlarge` = "ml.c5d.18xlarge"
    val `ml.p2.xlarge`    = "ml.p2.xlarge"
    val `ml.p2.8xlarge`   = "ml.p2.8xlarge"
    val `ml.p2.16xlarge`  = "ml.p2.16xlarge"
    val `ml.p3.2xlarge`   = "ml.p3.2xlarge"
    val `ml.p3.8xlarge`   = "ml.p3.8xlarge"
    val `ml.p3.16xlarge`  = "ml.p3.16xlarge"

    val values = js.Object.freeze(
      js.Array(
        `ml.t2.medium`,
        `ml.t2.large`,
        `ml.t2.xlarge`,
        `ml.t2.2xlarge`,
        `ml.t3.medium`,
        `ml.t3.large`,
        `ml.t3.xlarge`,
        `ml.t3.2xlarge`,
        `ml.m4.xlarge`,
        `ml.m4.2xlarge`,
        `ml.m4.4xlarge`,
        `ml.m4.10xlarge`,
        `ml.m4.16xlarge`,
        `ml.m5.xlarge`,
        `ml.m5.2xlarge`,
        `ml.m5.4xlarge`,
        `ml.m5.12xlarge`,
        `ml.m5.24xlarge`,
        `ml.c4.xlarge`,
        `ml.c4.2xlarge`,
        `ml.c4.4xlarge`,
        `ml.c4.8xlarge`,
        `ml.c5.xlarge`,
        `ml.c5.2xlarge`,
        `ml.c5.4xlarge`,
        `ml.c5.9xlarge`,
        `ml.c5.18xlarge`,
        `ml.c5d.xlarge`,
        `ml.c5d.2xlarge`,
        `ml.c5d.4xlarge`,
        `ml.c5d.9xlarge`,
        `ml.c5d.18xlarge`,
        `ml.p2.xlarge`,
        `ml.p2.8xlarge`,
        `ml.p2.16xlarge`,
        `ml.p3.2xlarge`,
        `ml.p3.8xlarge`,
        `ml.p3.16xlarge`
      )
    )
  }

  /**
    * For a hyperparameter of the integer type, specifies the range that a hyperparameter tuning job searches.
    */
  @js.native
  trait IntegerParameterRange extends js.Object {
    var MaxValue: ParameterValue
    var MinValue: ParameterValue
    var Name: ParameterKey
    var ScalingType: js.UndefOr[HyperParameterScalingType]
  }

  object IntegerParameterRange {
    @inline
    def apply(
        MaxValue: ParameterValue,
        MinValue: ParameterValue,
        Name: ParameterKey,
        ScalingType: js.UndefOr[HyperParameterScalingType] = js.undefined
    ): IntegerParameterRange = {
      val __obj = js.Dynamic.literal(
        "MaxValue" -> MaxValue.asInstanceOf[js.Any],
        "MinValue" -> MinValue.asInstanceOf[js.Any],
        "Name"     -> Name.asInstanceOf[js.Any]
      )

      ScalingType.foreach(__v => __obj.updateDynamic("ScalingType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IntegerParameterRange]
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
    @inline
    def apply(
        MaxValue: ParameterValue,
        MinValue: ParameterValue
    ): IntegerParameterRangeSpecification = {
      val __obj = js.Dynamic.literal(
        "MaxValue" -> MaxValue.asInstanceOf[js.Any],
        "MinValue" -> MinValue.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[IntegerParameterRangeSpecification]
    }
  }

  object JoinSourceEnum {
    val Input = "Input"
    val None  = "None"

    val values = js.Object.freeze(js.Array(Input, None))
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
    @inline
    def apply(
        FailedNonRetryableError: js.UndefOr[LabelCounter] = js.undefined,
        HumanLabeled: js.UndefOr[LabelCounter] = js.undefined,
        MachineLabeled: js.UndefOr[LabelCounter] = js.undefined,
        TotalLabeled: js.UndefOr[LabelCounter] = js.undefined,
        Unlabeled: js.UndefOr[LabelCounter] = js.undefined
    ): LabelCounters = {
      val __obj = js.Dynamic.literal()
      FailedNonRetryableError.foreach(__v => __obj.updateDynamic("FailedNonRetryableError")(__v.asInstanceOf[js.Any]))
      HumanLabeled.foreach(__v => __obj.updateDynamic("HumanLabeled")(__v.asInstanceOf[js.Any]))
      MachineLabeled.foreach(__v => __obj.updateDynamic("MachineLabeled")(__v.asInstanceOf[js.Any]))
      TotalLabeled.foreach(__v => __obj.updateDynamic("TotalLabeled")(__v.asInstanceOf[js.Any]))
      Unlabeled.foreach(__v => __obj.updateDynamic("Unlabeled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelCounters]
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
    @inline
    def apply(
        HumanLabeled: js.UndefOr[LabelCounter] = js.undefined,
        PendingHuman: js.UndefOr[LabelCounter] = js.undefined,
        Total: js.UndefOr[LabelCounter] = js.undefined
    ): LabelCountersForWorkteam = {
      val __obj = js.Dynamic.literal()
      HumanLabeled.foreach(__v => __obj.updateDynamic("HumanLabeled")(__v.asInstanceOf[js.Any]))
      PendingHuman.foreach(__v => __obj.updateDynamic("PendingHuman")(__v.asInstanceOf[js.Any]))
      Total.foreach(__v => __obj.updateDynamic("Total")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelCountersForWorkteam]
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
    @inline
    def apply(
        LabelingJobAlgorithmSpecificationArn: LabelingJobAlgorithmSpecificationArn,
        InitialActiveLearningModelArn: js.UndefOr[ModelArn] = js.undefined,
        LabelingJobResourceConfig: js.UndefOr[LabelingJobResourceConfig] = js.undefined
    ): LabelingJobAlgorithmsConfig = {
      val __obj = js.Dynamic.literal(
        "LabelingJobAlgorithmSpecificationArn" -> LabelingJobAlgorithmSpecificationArn.asInstanceOf[js.Any]
      )

      InitialActiveLearningModelArn.foreach(
        __v => __obj.updateDynamic("InitialActiveLearningModelArn")(__v.asInstanceOf[js.Any])
      )
      LabelingJobResourceConfig.foreach(
        __v => __obj.updateDynamic("LabelingJobResourceConfig")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[LabelingJobAlgorithmsConfig]
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
    @inline
    def apply(
        ContentClassifiers: js.UndefOr[ContentClassifiers] = js.undefined
    ): LabelingJobDataAttributes = {
      val __obj = js.Dynamic.literal()
      ContentClassifiers.foreach(__v => __obj.updateDynamic("ContentClassifiers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelingJobDataAttributes]
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
    @inline
    def apply(
        S3DataSource: LabelingJobS3DataSource
    ): LabelingJobDataSource = {
      val __obj = js.Dynamic.literal(
        "S3DataSource" -> S3DataSource.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[LabelingJobDataSource]
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
    var NumberOfHumanWorkersPerDataObject: js.UndefOr[NumberOfHumanWorkersPerDataObject]
  }

  object LabelingJobForWorkteamSummary {
    @inline
    def apply(
        CreationTime: Timestamp,
        JobReferenceCode: JobReferenceCode,
        WorkRequesterAccountId: AccountId,
        LabelCounters: js.UndefOr[LabelCountersForWorkteam] = js.undefined,
        LabelingJobName: js.UndefOr[LabelingJobName] = js.undefined,
        NumberOfHumanWorkersPerDataObject: js.UndefOr[NumberOfHumanWorkersPerDataObject] = js.undefined
    ): LabelingJobForWorkteamSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime"           -> CreationTime.asInstanceOf[js.Any],
        "JobReferenceCode"       -> JobReferenceCode.asInstanceOf[js.Any],
        "WorkRequesterAccountId" -> WorkRequesterAccountId.asInstanceOf[js.Any]
      )

      LabelCounters.foreach(__v => __obj.updateDynamic("LabelCounters")(__v.asInstanceOf[js.Any]))
      LabelingJobName.foreach(__v => __obj.updateDynamic("LabelingJobName")(__v.asInstanceOf[js.Any]))
      NumberOfHumanWorkersPerDataObject.foreach(
        __v => __obj.updateDynamic("NumberOfHumanWorkersPerDataObject")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[LabelingJobForWorkteamSummary]
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
    @inline
    def apply(
        DataSource: LabelingJobDataSource,
        DataAttributes: js.UndefOr[LabelingJobDataAttributes] = js.undefined
    ): LabelingJobInputConfig = {
      val __obj = js.Dynamic.literal(
        "DataSource" -> DataSource.asInstanceOf[js.Any]
      )

      DataAttributes.foreach(__v => __obj.updateDynamic("DataAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelingJobInputConfig]
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
    @inline
    def apply(
        OutputDatasetS3Uri: S3Uri,
        FinalActiveLearningModelArn: js.UndefOr[ModelArn] = js.undefined
    ): LabelingJobOutput = {
      val __obj = js.Dynamic.literal(
        "OutputDatasetS3Uri" -> OutputDatasetS3Uri.asInstanceOf[js.Any]
      )

      FinalActiveLearningModelArn.foreach(
        __v => __obj.updateDynamic("FinalActiveLearningModelArn")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[LabelingJobOutput]
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
    @inline
    def apply(
        S3OutputPath: S3Uri,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): LabelingJobOutputConfig = {
      val __obj = js.Dynamic.literal(
        "S3OutputPath" -> S3OutputPath.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelingJobOutputConfig]
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
    @inline
    def apply(
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): LabelingJobResourceConfig = {
      val __obj = js.Dynamic.literal()
      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelingJobResourceConfig]
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
    @inline
    def apply(
        ManifestS3Uri: S3Uri
    ): LabelingJobS3DataSource = {
      val __obj = js.Dynamic.literal(
        "ManifestS3Uri" -> ManifestS3Uri.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[LabelingJobS3DataSource]
    }
  }

  object LabelingJobStatusEnum {
    val InProgress = "InProgress"
    val Completed  = "Completed"
    val Failed     = "Failed"
    val Stopping   = "Stopping"
    val Stopped    = "Stopped"

    val values = js.Object.freeze(js.Array(InProgress, Completed, Failed, Stopping, Stopped))
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
    @inline
    def apply(
        MaxHumanLabeledObjectCount: js.UndefOr[MaxHumanLabeledObjectCount] = js.undefined,
        MaxPercentageOfInputDatasetLabeled: js.UndefOr[MaxPercentageOfInputDatasetLabeled] = js.undefined
    ): LabelingJobStoppingConditions = {
      val __obj = js.Dynamic.literal()
      MaxHumanLabeledObjectCount.foreach(
        __v => __obj.updateDynamic("MaxHumanLabeledObjectCount")(__v.asInstanceOf[js.Any])
      )
      MaxPercentageOfInputDatasetLabeled.foreach(
        __v => __obj.updateDynamic("MaxPercentageOfInputDatasetLabeled")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[LabelingJobStoppingConditions]
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
    @inline
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
        LabelingJobOutput: js.UndefOr[LabelingJobOutput] = js.undefined
    ): LabelingJobSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime"          -> CreationTime.asInstanceOf[js.Any],
        "LabelCounters"         -> LabelCounters.asInstanceOf[js.Any],
        "LabelingJobArn"        -> LabelingJobArn.asInstanceOf[js.Any],
        "LabelingJobName"       -> LabelingJobName.asInstanceOf[js.Any],
        "LabelingJobStatus"     -> LabelingJobStatus.asInstanceOf[js.Any],
        "LastModifiedTime"      -> LastModifiedTime.asInstanceOf[js.Any],
        "PreHumanTaskLambdaArn" -> PreHumanTaskLambdaArn.asInstanceOf[js.Any],
        "WorkteamArn"           -> WorkteamArn.asInstanceOf[js.Any]
      )

      AnnotationConsolidationLambdaArn.foreach(
        __v => __obj.updateDynamic("AnnotationConsolidationLambdaArn")(__v.asInstanceOf[js.Any])
      )
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      InputConfig.foreach(__v => __obj.updateDynamic("InputConfig")(__v.asInstanceOf[js.Any]))
      LabelingJobOutput.foreach(__v => __obj.updateDynamic("LabelingJobOutput")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelingJobSummary]
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
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined,
        CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[NameContains] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[AlgorithmSortBy] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListAlgorithmsInput = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAlgorithmsInput]
    }
  }

  @js.native
  trait ListAlgorithmsOutput extends js.Object {
    var AlgorithmSummaryList: AlgorithmSummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAlgorithmsOutput {
    @inline
    def apply(
        AlgorithmSummaryList: AlgorithmSummaryList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAlgorithmsOutput = {
      val __obj = js.Dynamic.literal(
        "AlgorithmSummaryList" -> AlgorithmSummaryList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAlgorithmsOutput]
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
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined,
        CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined,
        LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[CodeRepositoryNameContains] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[CodeRepositorySortBy] = js.undefined,
        SortOrder: js.UndefOr[CodeRepositorySortOrder] = js.undefined
    ): ListCodeRepositoriesInput = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeAfter.foreach(__v => __obj.updateDynamic("LastModifiedTimeAfter")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeBefore.foreach(__v => __obj.updateDynamic("LastModifiedTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCodeRepositoriesInput]
    }
  }

  @js.native
  trait ListCodeRepositoriesOutput extends js.Object {
    var CodeRepositorySummaryList: CodeRepositorySummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCodeRepositoriesOutput {
    @inline
    def apply(
        CodeRepositorySummaryList: CodeRepositorySummaryList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCodeRepositoriesOutput = {
      val __obj = js.Dynamic.literal(
        "CodeRepositorySummaryList" -> CodeRepositorySummaryList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCodeRepositoriesOutput]
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
    var SortBy: js.UndefOr[ListCompilationJobsSortBy]
    var SortOrder: js.UndefOr[SortOrder]
    var StatusEquals: js.UndefOr[CompilationJobStatus]
  }

  object ListCompilationJobsRequest {
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined,
        CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined,
        LastModifiedTimeAfter: js.UndefOr[LastModifiedTime] = js.undefined,
        LastModifiedTimeBefore: js.UndefOr[LastModifiedTime] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[NameContains] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[ListCompilationJobsSortBy] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined,
        StatusEquals: js.UndefOr[CompilationJobStatus] = js.undefined
    ): ListCompilationJobsRequest = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeAfter.foreach(__v => __obj.updateDynamic("LastModifiedTimeAfter")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeBefore.foreach(__v => __obj.updateDynamic("LastModifiedTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      StatusEquals.foreach(__v => __obj.updateDynamic("StatusEquals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCompilationJobsRequest]
    }
  }

  @js.native
  trait ListCompilationJobsResponse extends js.Object {
    var CompilationJobSummaries: CompilationJobSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCompilationJobsResponse {
    @inline
    def apply(
        CompilationJobSummaries: CompilationJobSummaries,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCompilationJobsResponse = {
      val __obj = js.Dynamic.literal(
        "CompilationJobSummaries" -> CompilationJobSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCompilationJobsResponse]
    }
  }

  object ListCompilationJobsSortByEnum {
    val Name         = "Name"
    val CreationTime = "CreationTime"
    val Status       = "Status"

    val values = js.Object.freeze(js.Array(Name, CreationTime, Status))
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
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[EndpointConfigNameContains] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        SortBy: js.UndefOr[EndpointConfigSortKey] = js.undefined,
        SortOrder: js.UndefOr[OrderKey] = js.undefined
    ): ListEndpointConfigsInput = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEndpointConfigsInput]
    }
  }

  @js.native
  trait ListEndpointConfigsOutput extends js.Object {
    var EndpointConfigs: EndpointConfigSummaryList
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListEndpointConfigsOutput {
    @inline
    def apply(
        EndpointConfigs: EndpointConfigSummaryList,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListEndpointConfigsOutput = {
      val __obj = js.Dynamic.literal(
        "EndpointConfigs" -> EndpointConfigs.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEndpointConfigsOutput]
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
    @inline
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
        StatusEquals: js.UndefOr[EndpointStatus] = js.undefined
    ): ListEndpointsInput = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeAfter.foreach(__v => __obj.updateDynamic("LastModifiedTimeAfter")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeBefore.foreach(__v => __obj.updateDynamic("LastModifiedTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      StatusEquals.foreach(__v => __obj.updateDynamic("StatusEquals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEndpointsInput]
    }
  }

  @js.native
  trait ListEndpointsOutput extends js.Object {
    var Endpoints: EndpointSummaryList
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListEndpointsOutput {
    @inline
    def apply(
        Endpoints: EndpointSummaryList,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListEndpointsOutput = {
      val __obj = js.Dynamic.literal(
        "Endpoints" -> Endpoints.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEndpointsOutput]
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
    @inline
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
        StatusEquals: js.UndefOr[HyperParameterTuningJobStatus] = js.undefined
    ): ListHyperParameterTuningJobsRequest = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeAfter.foreach(__v => __obj.updateDynamic("LastModifiedTimeAfter")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeBefore.foreach(__v => __obj.updateDynamic("LastModifiedTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      StatusEquals.foreach(__v => __obj.updateDynamic("StatusEquals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHyperParameterTuningJobsRequest]
    }
  }

  @js.native
  trait ListHyperParameterTuningJobsResponse extends js.Object {
    var HyperParameterTuningJobSummaries: HyperParameterTuningJobSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHyperParameterTuningJobsResponse {
    @inline
    def apply(
        HyperParameterTuningJobSummaries: HyperParameterTuningJobSummaries,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListHyperParameterTuningJobsResponse = {
      val __obj = js.Dynamic.literal(
        "HyperParameterTuningJobSummaries" -> HyperParameterTuningJobSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHyperParameterTuningJobsResponse]
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
    @inline
    def apply(
        WorkteamArn: WorkteamArn,
        CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        JobReferenceCodeContains: js.UndefOr[JobReferenceCodeContains] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[ListLabelingJobsForWorkteamSortByOptions] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListLabelingJobsForWorkteamRequest = {
      val __obj = js.Dynamic.literal(
        "WorkteamArn" -> WorkteamArn.asInstanceOf[js.Any]
      )

      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      JobReferenceCodeContains.foreach(__v => __obj.updateDynamic("JobReferenceCodeContains")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLabelingJobsForWorkteamRequest]
    }
  }

  @js.native
  trait ListLabelingJobsForWorkteamResponse extends js.Object {
    var LabelingJobSummaryList: LabelingJobForWorkteamSummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLabelingJobsForWorkteamResponse {
    @inline
    def apply(
        LabelingJobSummaryList: LabelingJobForWorkteamSummaryList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLabelingJobsForWorkteamResponse = {
      val __obj = js.Dynamic.literal(
        "LabelingJobSummaryList" -> LabelingJobSummaryList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLabelingJobsForWorkteamResponse]
    }
  }

  object ListLabelingJobsForWorkteamSortByOptionsEnum {
    val CreationTime = "CreationTime"

    val values = js.Object.freeze(js.Array(CreationTime))
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
    @inline
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
        StatusEquals: js.UndefOr[LabelingJobStatus] = js.undefined
    ): ListLabelingJobsRequest = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeAfter.foreach(__v => __obj.updateDynamic("LastModifiedTimeAfter")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeBefore.foreach(__v => __obj.updateDynamic("LastModifiedTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      StatusEquals.foreach(__v => __obj.updateDynamic("StatusEquals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLabelingJobsRequest]
    }
  }

  @js.native
  trait ListLabelingJobsResponse extends js.Object {
    var LabelingJobSummaryList: js.UndefOr[LabelingJobSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLabelingJobsResponse {
    @inline
    def apply(
        LabelingJobSummaryList: js.UndefOr[LabelingJobSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLabelingJobsResponse = {
      val __obj = js.Dynamic.literal()
      LabelingJobSummaryList.foreach(__v => __obj.updateDynamic("LabelingJobSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLabelingJobsResponse]
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
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined,
        CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[NameContains] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[ModelPackageSortBy] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListModelPackagesInput = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListModelPackagesInput]
    }
  }

  @js.native
  trait ListModelPackagesOutput extends js.Object {
    var ModelPackageSummaryList: ModelPackageSummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListModelPackagesOutput {
    @inline
    def apply(
        ModelPackageSummaryList: ModelPackageSummaryList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListModelPackagesOutput = {
      val __obj = js.Dynamic.literal(
        "ModelPackageSummaryList" -> ModelPackageSummaryList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListModelPackagesOutput]
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
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[ModelNameContains] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        SortBy: js.UndefOr[ModelSortKey] = js.undefined,
        SortOrder: js.UndefOr[OrderKey] = js.undefined
    ): ListModelsInput = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListModelsInput]
    }
  }

  @js.native
  trait ListModelsOutput extends js.Object {
    var Models: ModelSummaryList
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListModelsOutput {
    @inline
    def apply(
        Models: ModelSummaryList,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListModelsOutput = {
      val __obj = js.Dynamic.literal(
        "Models" -> Models.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListModelsOutput]
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
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined,
        CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined,
        LastModifiedTimeAfter: js.UndefOr[LastModifiedTime] = js.undefined,
        LastModifiedTimeBefore: js.UndefOr[LastModifiedTime] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[NotebookInstanceLifecycleConfigNameContains] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[NotebookInstanceLifecycleConfigSortKey] = js.undefined,
        SortOrder: js.UndefOr[NotebookInstanceLifecycleConfigSortOrder] = js.undefined
    ): ListNotebookInstanceLifecycleConfigsInput = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeAfter.foreach(__v => __obj.updateDynamic("LastModifiedTimeAfter")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeBefore.foreach(__v => __obj.updateDynamic("LastModifiedTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNotebookInstanceLifecycleConfigsInput]
    }
  }

  @js.native
  trait ListNotebookInstanceLifecycleConfigsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var NotebookInstanceLifecycleConfigs: js.UndefOr[NotebookInstanceLifecycleConfigSummaryList]
  }

  object ListNotebookInstanceLifecycleConfigsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        NotebookInstanceLifecycleConfigs: js.UndefOr[NotebookInstanceLifecycleConfigSummaryList] = js.undefined
    ): ListNotebookInstanceLifecycleConfigsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      NotebookInstanceLifecycleConfigs.foreach(
        __v => __obj.updateDynamic("NotebookInstanceLifecycleConfigs")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListNotebookInstanceLifecycleConfigsOutput]
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
    @inline
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
        StatusEquals: js.UndefOr[NotebookInstanceStatus] = js.undefined
    ): ListNotebookInstancesInput = {
      val __obj = js.Dynamic.literal()
      AdditionalCodeRepositoryEquals.foreach(
        __v => __obj.updateDynamic("AdditionalCodeRepositoryEquals")(__v.asInstanceOf[js.Any])
      )
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      DefaultCodeRepositoryContains.foreach(
        __v => __obj.updateDynamic("DefaultCodeRepositoryContains")(__v.asInstanceOf[js.Any])
      )
      LastModifiedTimeAfter.foreach(__v => __obj.updateDynamic("LastModifiedTimeAfter")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeBefore.foreach(__v => __obj.updateDynamic("LastModifiedTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      NotebookInstanceLifecycleConfigNameContains.foreach(
        __v => __obj.updateDynamic("NotebookInstanceLifecycleConfigNameContains")(__v.asInstanceOf[js.Any])
      )
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      StatusEquals.foreach(__v => __obj.updateDynamic("StatusEquals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNotebookInstancesInput]
    }
  }

  @js.native
  trait ListNotebookInstancesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var NotebookInstances: js.UndefOr[NotebookInstanceSummaryList]
  }

  object ListNotebookInstancesOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        NotebookInstances: js.UndefOr[NotebookInstanceSummaryList] = js.undefined
    ): ListNotebookInstancesOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      NotebookInstances.foreach(__v => __obj.updateDynamic("NotebookInstances")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNotebookInstancesOutput]
    }
  }

  @js.native
  trait ListSubscribedWorkteamsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[WorkteamName]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSubscribedWorkteamsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[WorkteamName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSubscribedWorkteamsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSubscribedWorkteamsRequest]
    }
  }

  @js.native
  trait ListSubscribedWorkteamsResponse extends js.Object {
    var SubscribedWorkteams: SubscribedWorkteams
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSubscribedWorkteamsResponse {
    @inline
    def apply(
        SubscribedWorkteams: SubscribedWorkteams,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSubscribedWorkteamsResponse = {
      val __obj = js.Dynamic.literal(
        "SubscribedWorkteams" -> SubscribedWorkteams.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSubscribedWorkteamsResponse]
    }
  }

  @js.native
  trait ListTagsInput extends js.Object {
    var ResourceArn: ResourceArn
    var MaxResults: js.UndefOr[ListTagsMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsInput {
    @inline
    def apply(
        ResourceArn: ResourceArn,
        MaxResults: js.UndefOr[ListTagsMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsInput]
    }
  }

  @js.native
  trait ListTagsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsOutput]
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
    @inline
    def apply(
        HyperParameterTuningJobName: HyperParameterTuningJobName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[TrainingJobSortByOptions] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined,
        StatusEquals: js.UndefOr[TrainingJobStatus] = js.undefined
    ): ListTrainingJobsForHyperParameterTuningJobRequest = {
      val __obj = js.Dynamic.literal(
        "HyperParameterTuningJobName" -> HyperParameterTuningJobName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      StatusEquals.foreach(__v => __obj.updateDynamic("StatusEquals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrainingJobsForHyperParameterTuningJobRequest]
    }
  }

  @js.native
  trait ListTrainingJobsForHyperParameterTuningJobResponse extends js.Object {
    var TrainingJobSummaries: HyperParameterTrainingJobSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTrainingJobsForHyperParameterTuningJobResponse {
    @inline
    def apply(
        TrainingJobSummaries: HyperParameterTrainingJobSummaries,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTrainingJobsForHyperParameterTuningJobResponse = {
      val __obj = js.Dynamic.literal(
        "TrainingJobSummaries" -> TrainingJobSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrainingJobsForHyperParameterTuningJobResponse]
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
    @inline
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
        StatusEquals: js.UndefOr[TrainingJobStatus] = js.undefined
    ): ListTrainingJobsRequest = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeAfter.foreach(__v => __obj.updateDynamic("LastModifiedTimeAfter")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeBefore.foreach(__v => __obj.updateDynamic("LastModifiedTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      StatusEquals.foreach(__v => __obj.updateDynamic("StatusEquals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrainingJobsRequest]
    }
  }

  @js.native
  trait ListTrainingJobsResponse extends js.Object {
    var TrainingJobSummaries: TrainingJobSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTrainingJobsResponse {
    @inline
    def apply(
        TrainingJobSummaries: TrainingJobSummaries,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTrainingJobsResponse = {
      val __obj = js.Dynamic.literal(
        "TrainingJobSummaries" -> TrainingJobSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrainingJobsResponse]
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
    @inline
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
        StatusEquals: js.UndefOr[TransformJobStatus] = js.undefined
    ): ListTransformJobsRequest = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeAfter.foreach(__v => __obj.updateDynamic("LastModifiedTimeAfter")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeBefore.foreach(__v => __obj.updateDynamic("LastModifiedTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      StatusEquals.foreach(__v => __obj.updateDynamic("StatusEquals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTransformJobsRequest]
    }
  }

  @js.native
  trait ListTransformJobsResponse extends js.Object {
    var TransformJobSummaries: TransformJobSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTransformJobsResponse {
    @inline
    def apply(
        TransformJobSummaries: TransformJobSummaries,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTransformJobsResponse = {
      val __obj = js.Dynamic.literal(
        "TransformJobSummaries" -> TransformJobSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTransformJobsResponse]
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
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[WorkteamName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[ListWorkteamsSortByOptions] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListWorkteamsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkteamsRequest]
    }
  }

  @js.native
  trait ListWorkteamsResponse extends js.Object {
    var Workteams: Workteams
    var NextToken: js.UndefOr[NextToken]
  }

  object ListWorkteamsResponse {
    @inline
    def apply(
        Workteams: Workteams,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListWorkteamsResponse = {
      val __obj = js.Dynamic.literal(
        "Workteams" -> Workteams.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkteamsResponse]
    }
  }

  object ListWorkteamsSortByOptionsEnum {
    val Name       = "Name"
    val CreateDate = "CreateDate"

    val values = js.Object.freeze(js.Array(Name, CreateDate))
  }

  /**
    * Defines the Amazon Cognito user group that is part of a work team.
    */
  @js.native
  trait MemberDefinition extends js.Object {
    var CognitoMemberDefinition: js.UndefOr[CognitoMemberDefinition]
  }

  object MemberDefinition {
    @inline
    def apply(
        CognitoMemberDefinition: js.UndefOr[CognitoMemberDefinition] = js.undefined
    ): MemberDefinition = {
      val __obj = js.Dynamic.literal()
      CognitoMemberDefinition.foreach(__v => __obj.updateDynamic("CognitoMemberDefinition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemberDefinition]
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
    @inline
    def apply(
        MetricName: js.UndefOr[MetricName] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined,
        Value: js.UndefOr[Float] = js.undefined
    ): MetricData = {
      val __obj = js.Dynamic.literal()
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricData]
    }
  }

  /**
    * Specifies a metric that the training algorithm writes to <code>stderr</code> or <code>stdout</code> . Amazon SageMakerhyperparameter tuning captures all defined metrics. You specify one metric that a hyperparameter tuning job uses as its objective metric to choose the best training job.
    */
  @js.native
  trait MetricDefinition extends js.Object {
    var Name: MetricName
    var Regex: MetricRegex
  }

  object MetricDefinition {
    @inline
    def apply(
        Name: MetricName,
        Regex: MetricRegex
    ): MetricDefinition = {
      val __obj = js.Dynamic.literal(
        "Name"  -> Name.asInstanceOf[js.Any],
        "Regex" -> Regex.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MetricDefinition]
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
    @inline
    def apply(
        S3ModelArtifacts: S3Uri
    ): ModelArtifacts = {
      val __obj = js.Dynamic.literal(
        "S3ModelArtifacts" -> S3ModelArtifacts.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModelArtifacts]
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
    @inline
    def apply(
        Image: Image,
        ContainerHostname: js.UndefOr[ContainerHostname] = js.undefined,
        ImageDigest: js.UndefOr[ImageDigest] = js.undefined,
        ModelDataUrl: js.UndefOr[Url] = js.undefined,
        ProductId: js.UndefOr[ProductId] = js.undefined
    ): ModelPackageContainerDefinition = {
      val __obj = js.Dynamic.literal(
        "Image" -> Image.asInstanceOf[js.Any]
      )

      ContainerHostname.foreach(__v => __obj.updateDynamic("ContainerHostname")(__v.asInstanceOf[js.Any]))
      ImageDigest.foreach(__v => __obj.updateDynamic("ImageDigest")(__v.asInstanceOf[js.Any]))
      ModelDataUrl.foreach(__v => __obj.updateDynamic("ModelDataUrl")(__v.asInstanceOf[js.Any]))
      ProductId.foreach(__v => __obj.updateDynamic("ProductId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelPackageContainerDefinition]
    }
  }

  object ModelPackageSortByEnum {
    val Name         = "Name"
    val CreationTime = "CreationTime"

    val values = js.Object.freeze(js.Array(Name, CreationTime))
  }

  object ModelPackageStatusEnum {
    val Pending    = "Pending"
    val InProgress = "InProgress"
    val Completed  = "Completed"
    val Failed     = "Failed"
    val Deleting   = "Deleting"

    val values = js.Object.freeze(js.Array(Pending, InProgress, Completed, Failed, Deleting))
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
    @inline
    def apply(
        ValidationStatuses: ModelPackageStatusItemList,
        ImageScanStatuses: js.UndefOr[ModelPackageStatusItemList] = js.undefined
    ): ModelPackageStatusDetails = {
      val __obj = js.Dynamic.literal(
        "ValidationStatuses" -> ValidationStatuses.asInstanceOf[js.Any]
      )

      ImageScanStatuses.foreach(__v => __obj.updateDynamic("ImageScanStatuses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelPackageStatusDetails]
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
    @inline
    def apply(
        Name: EntityName,
        Status: DetailedModelPackageStatus,
        FailureReason: js.UndefOr[String] = js.undefined
    ): ModelPackageStatusItem = {
      val __obj = js.Dynamic.literal(
        "Name"   -> Name.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelPackageStatusItem]
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
    @inline
    def apply(
        CreationTime: CreationTime,
        ModelPackageArn: ModelPackageArn,
        ModelPackageName: EntityName,
        ModelPackageStatus: ModelPackageStatus,
        ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined
    ): ModelPackageSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime"       -> CreationTime.asInstanceOf[js.Any],
        "ModelPackageArn"    -> ModelPackageArn.asInstanceOf[js.Any],
        "ModelPackageName"   -> ModelPackageName.asInstanceOf[js.Any],
        "ModelPackageStatus" -> ModelPackageStatus.asInstanceOf[js.Any]
      )

      ModelPackageDescription.foreach(__v => __obj.updateDynamic("ModelPackageDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelPackageSummary]
    }
  }

  /**
    * Contains data, such as the inputs and targeted instance types that are used in the process of validating the model package.
    *  The data provided in the validation profile is made available to your buyers on AWS Marketplace.
    */
  @js.native
  trait ModelPackageValidationProfile extends js.Object {
    var ProfileName: EntityName
    var TransformJobDefinition: TransformJobDefinition
  }

  object ModelPackageValidationProfile {
    @inline
    def apply(
        ProfileName: EntityName,
        TransformJobDefinition: TransformJobDefinition
    ): ModelPackageValidationProfile = {
      val __obj = js.Dynamic.literal(
        "ProfileName"            -> ProfileName.asInstanceOf[js.Any],
        "TransformJobDefinition" -> TransformJobDefinition.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModelPackageValidationProfile]
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
    @inline
    def apply(
        ValidationProfiles: ModelPackageValidationProfiles,
        ValidationRole: RoleArn
    ): ModelPackageValidationSpecification = {
      val __obj = js.Dynamic.literal(
        "ValidationProfiles" -> ValidationProfiles.asInstanceOf[js.Any],
        "ValidationRole"     -> ValidationRole.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModelPackageValidationSpecification]
    }
  }

  object ModelSortKeyEnum {
    val Name         = "Name"
    val CreationTime = "CreationTime"

    val values = js.Object.freeze(js.Array(Name, CreationTime))
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
    @inline
    def apply(
        CreationTime: Timestamp,
        ModelArn: ModelArn,
        ModelName: ModelName
    ): ModelSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ModelArn"     -> ModelArn.asInstanceOf[js.Any],
        "ModelName"    -> ModelName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModelSummary]
    }
  }

  /**
    * Defines a list of <code>NestedFilters</code> objects. To satisfy the conditions specified in the <code>NestedFilters</code> call, a resource must satisfy the conditions of all of the filters.
    *  For example, you could define a <code>NestedFilters</code> using the training job's <code>InputDataConfig</code> property to filter on <code>Channel</code> objects.
    *  A <code>NestedFilters</code> object contains multiple filters. For example, to find all training jobs whose name contains <code>train</code> and that have <code>cat/data</code> in their <code>S3Uri</code> (specified in <code>InputDataConfig</code>), you need to create a <code>NestedFilters</code> object that specifies the <code>InputDataConfig</code> property with the following <code>Filter</code> objects:
    * * <code>'{Name:"InputDataConfig.ChannelName", "Operator":"EQUALS", "Value":"train"}',</code>
    *  * <code>'{Name:"InputDataConfig.DataSource.S3DataSource.S3Uri", "Operator":"CONTAINS", "Value":"cat/data"}'</code>
    */
  @js.native
  trait NestedFilters extends js.Object {
    var Filters: FilterList
    var NestedPropertyName: ResourcePropertyName
  }

  object NestedFilters {
    @inline
    def apply(
        Filters: FilterList,
        NestedPropertyName: ResourcePropertyName
    ): NestedFilters = {
      val __obj = js.Dynamic.literal(
        "Filters"            -> Filters.asInstanceOf[js.Any],
        "NestedPropertyName" -> NestedPropertyName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[NestedFilters]
    }
  }

  object NotebookInstanceAcceleratorTypeEnum {
    val `ml.eia1.medium` = "ml.eia1.medium"
    val `ml.eia1.large`  = "ml.eia1.large"
    val `ml.eia1.xlarge` = "ml.eia1.xlarge"

    val values = js.Object.freeze(js.Array(`ml.eia1.medium`, `ml.eia1.large`, `ml.eia1.xlarge`))
  }

  object NotebookInstanceLifecycleConfigSortKeyEnum {
    val Name             = "Name"
    val CreationTime     = "CreationTime"
    val LastModifiedTime = "LastModifiedTime"

    val values = js.Object.freeze(js.Array(Name, CreationTime, LastModifiedTime))
  }

  object NotebookInstanceLifecycleConfigSortOrderEnum {
    val Ascending  = "Ascending"
    val Descending = "Descending"

    val values = js.Object.freeze(js.Array(Ascending, Descending))
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
    @inline
    def apply(
        NotebookInstanceLifecycleConfigArn: NotebookInstanceLifecycleConfigArn,
        NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName,
        CreationTime: js.UndefOr[CreationTime] = js.undefined,
        LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined
    ): NotebookInstanceLifecycleConfigSummary = {
      val __obj = js.Dynamic.literal(
        "NotebookInstanceLifecycleConfigArn"  -> NotebookInstanceLifecycleConfigArn.asInstanceOf[js.Any],
        "NotebookInstanceLifecycleConfigName" -> NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any]
      )

      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotebookInstanceLifecycleConfigSummary]
    }
  }

  /**
    * Contains the notebook instance lifecycle configuration script.
    *  Each lifecycle configuration script has a limit of 16384 characters.
    *  The value of the <code>PATH</code> environment variable that is available to both scripts is <code>/sbin:bin:/usr/sbin:/usr/bin</code>.
    *  View CloudWatch Logs for notebook instance lifecycle configurations in log group <code>/aws/sagemaker/NotebookInstances</code> in log stream <code>[notebook-instance-name]/[LifecycleConfigHook]</code>.
    *  Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes, it fails and the notebook instance is not created or started.
    *  For information about notebook instance lifestyle configurations, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html|Step 2.1: (Optional) Customize a Notebook Instance]].
    */
  @js.native
  trait NotebookInstanceLifecycleHook extends js.Object {
    var Content: js.UndefOr[NotebookInstanceLifecycleConfigContent]
  }

  object NotebookInstanceLifecycleHook {
    @inline
    def apply(
        Content: js.UndefOr[NotebookInstanceLifecycleConfigContent] = js.undefined
    ): NotebookInstanceLifecycleHook = {
      val __obj = js.Dynamic.literal()
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotebookInstanceLifecycleHook]
    }
  }

  object NotebookInstanceSortKeyEnum {
    val Name         = "Name"
    val CreationTime = "CreationTime"
    val Status       = "Status"

    val values = js.Object.freeze(js.Array(Name, CreationTime, Status))
  }

  object NotebookInstanceSortOrderEnum {
    val Ascending  = "Ascending"
    val Descending = "Descending"

    val values = js.Object.freeze(js.Array(Ascending, Descending))
  }

  object NotebookInstanceStatusEnum {
    val Pending   = "Pending"
    val InService = "InService"
    val Stopping  = "Stopping"
    val Stopped   = "Stopped"
    val Failed    = "Failed"
    val Deleting  = "Deleting"
    val Updating  = "Updating"

    val values = js.Object.freeze(js.Array(Pending, InService, Stopping, Stopped, Failed, Deleting, Updating))
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
    @inline
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
        Url: js.UndefOr[NotebookInstanceUrl] = js.undefined
    ): NotebookInstanceSummary = {
      val __obj = js.Dynamic.literal(
        "NotebookInstanceArn"  -> NotebookInstanceArn.asInstanceOf[js.Any],
        "NotebookInstanceName" -> NotebookInstanceName.asInstanceOf[js.Any]
      )

      AdditionalCodeRepositories.foreach(
        __v => __obj.updateDynamic("AdditionalCodeRepositories")(__v.asInstanceOf[js.Any])
      )
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DefaultCodeRepository.foreach(__v => __obj.updateDynamic("DefaultCodeRepository")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      NotebookInstanceLifecycleConfigName.foreach(
        __v => __obj.updateDynamic("NotebookInstanceLifecycleConfigName")(__v.asInstanceOf[js.Any])
      )
      NotebookInstanceStatus.foreach(__v => __obj.updateDynamic("NotebookInstanceStatus")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotebookInstanceSummary]
    }
  }

  /**
    * Configures SNS notifications of available or expiring work items for work teams.
    */
  @js.native
  trait NotificationConfiguration extends js.Object {
    var NotificationTopicArn: js.UndefOr[NotificationTopicArn]
  }

  object NotificationConfiguration {
    @inline
    def apply(
        NotificationTopicArn: js.UndefOr[NotificationTopicArn] = js.undefined
    ): NotificationConfiguration = {
      val __obj = js.Dynamic.literal()
      NotificationTopicArn.foreach(__v => __obj.updateDynamic("NotificationTopicArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotificationConfiguration]
    }
  }

  object ObjectiveStatusEnum {
    val Succeeded = "Succeeded"
    val Pending   = "Pending"
    val Failed    = "Failed"

    val values = js.Object.freeze(js.Array(Succeeded, Pending, Failed))
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
    @inline
    def apply(
        Failed: js.UndefOr[ObjectiveStatusCounter] = js.undefined,
        Pending: js.UndefOr[ObjectiveStatusCounter] = js.undefined,
        Succeeded: js.UndefOr[ObjectiveStatusCounter] = js.undefined
    ): ObjectiveStatusCounters = {
      val __obj = js.Dynamic.literal()
      Failed.foreach(__v => __obj.updateDynamic("Failed")(__v.asInstanceOf[js.Any]))
      Pending.foreach(__v => __obj.updateDynamic("Pending")(__v.asInstanceOf[js.Any]))
      Succeeded.foreach(__v => __obj.updateDynamic("Succeeded")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ObjectiveStatusCounters]
    }
  }

  object OperatorEnum {
    val Equals               = "Equals"
    val NotEquals            = "NotEquals"
    val GreaterThan          = "GreaterThan"
    val GreaterThanOrEqualTo = "GreaterThanOrEqualTo"
    val LessThan             = "LessThan"
    val LessThanOrEqualTo    = "LessThanOrEqualTo"
    val Contains             = "Contains"

    val values = js.Object.freeze(
      js.Array(Equals, NotEquals, GreaterThan, GreaterThanOrEqualTo, LessThan, LessThanOrEqualTo, Contains)
    )
  }

  object OrderKeyEnum {
    val Ascending  = "Ascending"
    val Descending = "Descending"

    val values = js.Object.freeze(js.Array(Ascending, Descending))
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
    @inline
    def apply(
        S3OutputLocation: S3Uri,
        TargetDevice: TargetDevice
    ): OutputConfig = {
      val __obj = js.Dynamic.literal(
        "S3OutputLocation" -> S3OutputLocation.asInstanceOf[js.Any],
        "TargetDevice"     -> TargetDevice.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[OutputConfig]
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
    @inline
    def apply(
        S3OutputPath: S3Uri,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): OutputDataConfig = {
      val __obj = js.Dynamic.literal(
        "S3OutputPath" -> S3OutputPath.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputDataConfig]
    }
  }

  /**
    * Defines the possible values for categorical, continuous, and integer hyperparameters to be used by an algorithm.
    */
  @js.native
  trait ParameterRange extends js.Object {
    var CategoricalParameterRangeSpecification: js.UndefOr[CategoricalParameterRangeSpecification]
    var ContinuousParameterRangeSpecification: js.UndefOr[ContinuousParameterRangeSpecification]
    var IntegerParameterRangeSpecification: js.UndefOr[IntegerParameterRangeSpecification]
  }

  object ParameterRange {
    @inline
    def apply(
        CategoricalParameterRangeSpecification: js.UndefOr[CategoricalParameterRangeSpecification] = js.undefined,
        ContinuousParameterRangeSpecification: js.UndefOr[ContinuousParameterRangeSpecification] = js.undefined,
        IntegerParameterRangeSpecification: js.UndefOr[IntegerParameterRangeSpecification] = js.undefined
    ): ParameterRange = {
      val __obj = js.Dynamic.literal()
      CategoricalParameterRangeSpecification.foreach(
        __v => __obj.updateDynamic("CategoricalParameterRangeSpecification")(__v.asInstanceOf[js.Any])
      )
      ContinuousParameterRangeSpecification.foreach(
        __v => __obj.updateDynamic("ContinuousParameterRangeSpecification")(__v.asInstanceOf[js.Any])
      )
      IntegerParameterRangeSpecification.foreach(
        __v => __obj.updateDynamic("IntegerParameterRangeSpecification")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ParameterRange]
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
    @inline
    def apply(
        CategoricalParameterRanges: js.UndefOr[CategoricalParameterRanges] = js.undefined,
        ContinuousParameterRanges: js.UndefOr[ContinuousParameterRanges] = js.undefined,
        IntegerParameterRanges: js.UndefOr[IntegerParameterRanges] = js.undefined
    ): ParameterRanges = {
      val __obj = js.Dynamic.literal()
      CategoricalParameterRanges.foreach(
        __v => __obj.updateDynamic("CategoricalParameterRanges")(__v.asInstanceOf[js.Any])
      )
      ContinuousParameterRanges.foreach(
        __v => __obj.updateDynamic("ContinuousParameterRanges")(__v.asInstanceOf[js.Any])
      )
      IntegerParameterRanges.foreach(__v => __obj.updateDynamic("IntegerParameterRanges")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterRanges]
    }
  }

  object ParameterTypeEnum {
    val Integer     = "Integer"
    val Continuous  = "Continuous"
    val Categorical = "Categorical"
    val FreeText    = "FreeText"

    val values = js.Object.freeze(js.Array(Integer, Continuous, Categorical, FreeText))
  }

  /**
    * A previously completed or stopped hyperparameter tuning job to be used as a starting point for a new hyperparameter tuning job.
    */
  @js.native
  trait ParentHyperParameterTuningJob extends js.Object {
    var HyperParameterTuningJobName: js.UndefOr[HyperParameterTuningJobName]
  }

  object ParentHyperParameterTuningJob {
    @inline
    def apply(
        HyperParameterTuningJobName: js.UndefOr[HyperParameterTuningJobName] = js.undefined
    ): ParentHyperParameterTuningJob = {
      val __obj = js.Dynamic.literal()
      HyperParameterTuningJobName.foreach(
        __v => __obj.updateDynamic("HyperParameterTuningJobName")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ParentHyperParameterTuningJob]
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
    @inline
    def apply(
        InitialInstanceCount: TaskCount,
        InstanceType: ProductionVariantInstanceType,
        ModelName: ModelName,
        VariantName: VariantName,
        AcceleratorType: js.UndefOr[ProductionVariantAcceleratorType] = js.undefined,
        InitialVariantWeight: js.UndefOr[VariantWeight] = js.undefined
    ): ProductionVariant = {
      val __obj = js.Dynamic.literal(
        "InitialInstanceCount" -> InitialInstanceCount.asInstanceOf[js.Any],
        "InstanceType"         -> InstanceType.asInstanceOf[js.Any],
        "ModelName"            -> ModelName.asInstanceOf[js.Any],
        "VariantName"          -> VariantName.asInstanceOf[js.Any]
      )

      AcceleratorType.foreach(__v => __obj.updateDynamic("AcceleratorType")(__v.asInstanceOf[js.Any]))
      InitialVariantWeight.foreach(__v => __obj.updateDynamic("InitialVariantWeight")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProductionVariant]
    }
  }

  object ProductionVariantAcceleratorTypeEnum {
    val `ml.eia1.medium` = "ml.eia1.medium"
    val `ml.eia1.large`  = "ml.eia1.large"
    val `ml.eia1.xlarge` = "ml.eia1.xlarge"

    val values = js.Object.freeze(js.Array(`ml.eia1.medium`, `ml.eia1.large`, `ml.eia1.xlarge`))
  }

  object ProductionVariantInstanceTypeEnum {
    val `ml.t2.medium`   = "ml.t2.medium"
    val `ml.t2.large`    = "ml.t2.large"
    val `ml.t2.xlarge`   = "ml.t2.xlarge"
    val `ml.t2.2xlarge`  = "ml.t2.2xlarge"
    val `ml.m4.xlarge`   = "ml.m4.xlarge"
    val `ml.m4.2xlarge`  = "ml.m4.2xlarge"
    val `ml.m4.4xlarge`  = "ml.m4.4xlarge"
    val `ml.m4.10xlarge` = "ml.m4.10xlarge"
    val `ml.m4.16xlarge` = "ml.m4.16xlarge"
    val `ml.m5.large`    = "ml.m5.large"
    val `ml.m5.xlarge`   = "ml.m5.xlarge"
    val `ml.m5.2xlarge`  = "ml.m5.2xlarge"
    val `ml.m5.4xlarge`  = "ml.m5.4xlarge"
    val `ml.m5.12xlarge` = "ml.m5.12xlarge"
    val `ml.m5.24xlarge` = "ml.m5.24xlarge"
    val `ml.c4.large`    = "ml.c4.large"
    val `ml.c4.xlarge`   = "ml.c4.xlarge"
    val `ml.c4.2xlarge`  = "ml.c4.2xlarge"
    val `ml.c4.4xlarge`  = "ml.c4.4xlarge"
    val `ml.c4.8xlarge`  = "ml.c4.8xlarge"
    val `ml.p2.xlarge`   = "ml.p2.xlarge"
    val `ml.p2.8xlarge`  = "ml.p2.8xlarge"
    val `ml.p2.16xlarge` = "ml.p2.16xlarge"
    val `ml.p3.2xlarge`  = "ml.p3.2xlarge"
    val `ml.p3.8xlarge`  = "ml.p3.8xlarge"
    val `ml.p3.16xlarge` = "ml.p3.16xlarge"
    val `ml.c5.large`    = "ml.c5.large"
    val `ml.c5.xlarge`   = "ml.c5.xlarge"
    val `ml.c5.2xlarge`  = "ml.c5.2xlarge"
    val `ml.c5.4xlarge`  = "ml.c5.4xlarge"
    val `ml.c5.9xlarge`  = "ml.c5.9xlarge"
    val `ml.c5.18xlarge` = "ml.c5.18xlarge"

    val values = js.Object.freeze(
      js.Array(
        `ml.t2.medium`,
        `ml.t2.large`,
        `ml.t2.xlarge`,
        `ml.t2.2xlarge`,
        `ml.m4.xlarge`,
        `ml.m4.2xlarge`,
        `ml.m4.4xlarge`,
        `ml.m4.10xlarge`,
        `ml.m4.16xlarge`,
        `ml.m5.large`,
        `ml.m5.xlarge`,
        `ml.m5.2xlarge`,
        `ml.m5.4xlarge`,
        `ml.m5.12xlarge`,
        `ml.m5.24xlarge`,
        `ml.c4.large`,
        `ml.c4.xlarge`,
        `ml.c4.2xlarge`,
        `ml.c4.4xlarge`,
        `ml.c4.8xlarge`,
        `ml.p2.xlarge`,
        `ml.p2.8xlarge`,
        `ml.p2.16xlarge`,
        `ml.p3.2xlarge`,
        `ml.p3.8xlarge`,
        `ml.p3.16xlarge`,
        `ml.c5.large`,
        `ml.c5.xlarge`,
        `ml.c5.2xlarge`,
        `ml.c5.4xlarge`,
        `ml.c5.9xlarge`,
        `ml.c5.18xlarge`
      )
    )
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
    @inline
    def apply(
        VariantName: VariantName,
        CurrentInstanceCount: js.UndefOr[TaskCount] = js.undefined,
        CurrentWeight: js.UndefOr[VariantWeight] = js.undefined,
        DeployedImages: js.UndefOr[DeployedImages] = js.undefined,
        DesiredInstanceCount: js.UndefOr[TaskCount] = js.undefined,
        DesiredWeight: js.UndefOr[VariantWeight] = js.undefined
    ): ProductionVariantSummary = {
      val __obj = js.Dynamic.literal(
        "VariantName" -> VariantName.asInstanceOf[js.Any]
      )

      CurrentInstanceCount.foreach(__v => __obj.updateDynamic("CurrentInstanceCount")(__v.asInstanceOf[js.Any]))
      CurrentWeight.foreach(__v => __obj.updateDynamic("CurrentWeight")(__v.asInstanceOf[js.Any]))
      DeployedImages.foreach(__v => __obj.updateDynamic("DeployedImages")(__v.asInstanceOf[js.Any]))
      DesiredInstanceCount.foreach(__v => __obj.updateDynamic("DesiredInstanceCount")(__v.asInstanceOf[js.Any]))
      DesiredWeight.foreach(__v => __obj.updateDynamic("DesiredWeight")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProductionVariantSummary]
    }
  }

  /**
    * A type of <code>SuggestionQuery</code>. A suggestion query for retrieving property names that match the specified hint.
    */
  @js.native
  trait PropertyNameQuery extends js.Object {
    var PropertyNameHint: PropertyNameHint
  }

  object PropertyNameQuery {
    @inline
    def apply(
        PropertyNameHint: PropertyNameHint
    ): PropertyNameQuery = {
      val __obj = js.Dynamic.literal(
        "PropertyNameHint" -> PropertyNameHint.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PropertyNameQuery]
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
    @inline
    def apply(
        PropertyName: js.UndefOr[ResourcePropertyName] = js.undefined
    ): PropertyNameSuggestion = {
      val __obj = js.Dynamic.literal()
      PropertyName.foreach(__v => __obj.updateDynamic("PropertyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PropertyNameSuggestion]
    }
  }

  /**
    * Defines the amount of money paid to an Amazon Mechanical Turk worker for each task performed.
    *  Use one of the following prices for bounding box tasks. Prices are in US dollars and should be based on the complexity of the task; the longer it takes in your initial testing, the more you should offer.
    * * 0.036
    *  * 0.048
    *  * 0.060
    *  * 0.072
    *  * 0.120
    *  * 0.240
    *  * 0.360
    *  * 0.480
    *  * 0.600
    *  * 0.720
    *  * 0.840
    *  * 0.960
    *  * 1.080
    *  * 1.200
    * Use one of the following prices for image classification, text classification, and custom tasks. Prices are in US dollars.
    * * 0.012
    *  * 0.024
    *  * 0.036
    *  * 0.048
    *  * 0.060
    *  * 0.072
    *  * 0.120
    *  * 0.240
    *  * 0.360
    *  * 0.480
    *  * 0.600
    *  * 0.720
    *  * 0.840
    *  * 0.960
    *  * 1.080
    *  * 1.200
    * Use one of the following prices for semantic segmentation tasks. Prices are in US dollars.
    * * 0.840
    *  * 0.960
    *  * 1.080
    *  * 1.200
    */
  @js.native
  trait PublicWorkforceTaskPrice extends js.Object {
    var AmountInUsd: js.UndefOr[USD]
  }

  object PublicWorkforceTaskPrice {
    @inline
    def apply(
        AmountInUsd: js.UndefOr[USD] = js.undefined
    ): PublicWorkforceTaskPrice = {
      val __obj = js.Dynamic.literal()
      AmountInUsd.foreach(__v => __obj.updateDynamic("AmountInUsd")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublicWorkforceTaskPrice]
    }
  }

  object RecordWrapperEnum {
    val None     = "None"
    val RecordIO = "RecordIO"

    val values = js.Object.freeze(js.Array(None, RecordIO))
  }

  @js.native
  trait RenderUiTemplateRequest extends js.Object {
    var RoleArn: RoleArn
    var Task: RenderableTask
    var UiTemplate: UiTemplate
  }

  object RenderUiTemplateRequest {
    @inline
    def apply(
        RoleArn: RoleArn,
        Task: RenderableTask,
        UiTemplate: UiTemplate
    ): RenderUiTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "RoleArn"    -> RoleArn.asInstanceOf[js.Any],
        "Task"       -> Task.asInstanceOf[js.Any],
        "UiTemplate" -> UiTemplate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RenderUiTemplateRequest]
    }
  }

  @js.native
  trait RenderUiTemplateResponse extends js.Object {
    var Errors: RenderingErrorList
    var RenderedContent: String
  }

  object RenderUiTemplateResponse {
    @inline
    def apply(
        Errors: RenderingErrorList,
        RenderedContent: String
    ): RenderUiTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "Errors"          -> Errors.asInstanceOf[js.Any],
        "RenderedContent" -> RenderedContent.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RenderUiTemplateResponse]
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
    @inline
    def apply(
        Input: TaskInput
    ): RenderableTask = {
      val __obj = js.Dynamic.literal(
        "Input" -> Input.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RenderableTask]
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
    @inline
    def apply(
        Code: String,
        Message: String
    ): RenderingError = {
      val __obj = js.Dynamic.literal(
        "Code"    -> Code.asInstanceOf[js.Any],
        "Message" -> Message.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RenderingError]
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
    @inline
    def apply(
        InstanceCount: TrainingInstanceCount,
        InstanceType: TrainingInstanceType,
        VolumeSizeInGB: VolumeSizeInGB,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): ResourceConfig = {
      val __obj = js.Dynamic.literal(
        "InstanceCount"  -> InstanceCount.asInstanceOf[js.Any],
        "InstanceType"   -> InstanceType.asInstanceOf[js.Any],
        "VolumeSizeInGB" -> VolumeSizeInGB.asInstanceOf[js.Any]
      )

      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceConfig]
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
    @inline
    def apply(
        MaxNumberOfTrainingJobs: MaxNumberOfTrainingJobs,
        MaxParallelTrainingJobs: MaxParallelTrainingJobs
    ): ResourceLimits = {
      val __obj = js.Dynamic.literal(
        "MaxNumberOfTrainingJobs" -> MaxNumberOfTrainingJobs.asInstanceOf[js.Any],
        "MaxParallelTrainingJobs" -> MaxParallelTrainingJobs.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResourceLimits]
    }
  }

  object ResourceTypeEnum {
    val TrainingJob = "TrainingJob"

    val values = js.Object.freeze(js.Array(TrainingJob))
  }

  object RootAccessEnum {
    val Enabled  = "Enabled"
    val Disabled = "Disabled"

    val values = js.Object.freeze(js.Array(Enabled, Disabled))
  }

  object S3DataDistributionEnum {
    val FullyReplicated = "FullyReplicated"
    val ShardedByS3Key  = "ShardedByS3Key"

    val values = js.Object.freeze(js.Array(FullyReplicated, ShardedByS3Key))
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
    @inline
    def apply(
        S3DataType: S3DataType,
        S3Uri: S3Uri,
        AttributeNames: js.UndefOr[AttributeNames] = js.undefined,
        S3DataDistributionType: js.UndefOr[S3DataDistribution] = js.undefined
    ): S3DataSource = {
      val __obj = js.Dynamic.literal(
        "S3DataType" -> S3DataType.asInstanceOf[js.Any],
        "S3Uri"      -> S3Uri.asInstanceOf[js.Any]
      )

      AttributeNames.foreach(__v => __obj.updateDynamic("AttributeNames")(__v.asInstanceOf[js.Any]))
      S3DataDistributionType.foreach(__v => __obj.updateDynamic("S3DataDistributionType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3DataSource]
    }
  }

  object S3DataTypeEnum {
    val ManifestFile          = "ManifestFile"
    val S3Prefix              = "S3Prefix"
    val AugmentedManifestFile = "AugmentedManifestFile"

    val values = js.Object.freeze(js.Array(ManifestFile, S3Prefix, AugmentedManifestFile))
  }

  /**
    * A multi-expression that searches for the specified resource or resources in a search. All resource objects that satisfy the expression's condition are included in the search results. You must specify at least one subexpression, filter, or nested filter. A <code>SearchExpression</code> can contain up to twenty elements.
    *  A <code>SearchExpression</code> contains the following components:
    * * A list of <code>Filter</code> objects. Each filter defines a simple Boolean expression comprised of a resource property name, Boolean operator, and value.
    *  * A list of <code>NestedFilter</code> objects. Each nested filter defines a list of Boolean expressions using a list of resource properties. A nested filter is satisfied if a single object in the list satisfies all Boolean expressions.
    *  * A list of <code>SearchExpression</code> objects. A search expression object can be nested in a list of search expression objects.
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
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        NestedFilters: js.UndefOr[NestedFiltersList] = js.undefined,
        Operator: js.UndefOr[BooleanOperator] = js.undefined,
        SubExpressions: js.UndefOr[SearchExpressionList] = js.undefined
    ): SearchExpression = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      NestedFilters.foreach(__v => __obj.updateDynamic("NestedFilters")(__v.asInstanceOf[js.Any]))
      Operator.foreach(__v => __obj.updateDynamic("Operator")(__v.asInstanceOf[js.Any]))
      SubExpressions.foreach(__v => __obj.updateDynamic("SubExpressions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchExpression]
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
    @inline
    def apply(
        TrainingJob: js.UndefOr[TrainingJob] = js.undefined
    ): SearchRecord = {
      val __obj = js.Dynamic.literal()
      TrainingJob.foreach(__v => __obj.updateDynamic("TrainingJob")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchRecord]
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
    @inline
    def apply(
        Resource: ResourceType,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SearchExpression: js.UndefOr[SearchExpression] = js.undefined,
        SortBy: js.UndefOr[ResourcePropertyName] = js.undefined,
        SortOrder: js.UndefOr[SearchSortOrder] = js.undefined
    ): SearchRequest = {
      val __obj = js.Dynamic.literal(
        "Resource" -> Resource.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SearchExpression.foreach(__v => __obj.updateDynamic("SearchExpression")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchRequest]
    }
  }

  @js.native
  trait SearchResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Results: js.UndefOr[SearchResultsList]
  }

  object SearchResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Results: js.UndefOr[SearchResultsList] = js.undefined
    ): SearchResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Results.foreach(__v => __obj.updateDynamic("Results")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchResponse]
    }
  }

  object SearchSortOrderEnum {
    val Ascending  = "Ascending"
    val Descending = "Descending"

    val values = js.Object.freeze(js.Array(Ascending, Descending))
  }

  object SecondaryStatusEnum {
    val Starting                 = "Starting"
    val LaunchingMLInstances     = "LaunchingMLInstances"
    val PreparingTrainingStack   = "PreparingTrainingStack"
    val Downloading              = "Downloading"
    val DownloadingTrainingImage = "DownloadingTrainingImage"
    val Training                 = "Training"
    val Uploading                = "Uploading"
    val Stopping                 = "Stopping"
    val Stopped                  = "Stopped"
    val MaxRuntimeExceeded       = "MaxRuntimeExceeded"
    val Completed                = "Completed"
    val Failed                   = "Failed"
    val Interrupted              = "Interrupted"
    val MaxWaitTimeExceeded      = "MaxWaitTimeExceeded"

    val values = js.Object.freeze(
      js.Array(
        Starting,
        LaunchingMLInstances,
        PreparingTrainingStack,
        Downloading,
        DownloadingTrainingImage,
        Training,
        Uploading,
        Stopping,
        Stopped,
        MaxRuntimeExceeded,
        Completed,
        Failed,
        Interrupted,
        MaxWaitTimeExceeded
      )
    )
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
    @inline
    def apply(
        StartTime: Timestamp,
        Status: SecondaryStatus,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined
    ): SecondaryStatusTransition = {
      val __obj = js.Dynamic.literal(
        "StartTime" -> StartTime.asInstanceOf[js.Any],
        "Status"    -> Status.asInstanceOf[js.Any]
      )

      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecondaryStatusTransition]
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
    @inline
    def apply(
        Seed: Seed
    ): ShuffleConfig = {
      val __obj = js.Dynamic.literal(
        "Seed" -> Seed.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ShuffleConfig]
    }
  }

  object SortByEnum {
    val Name         = "Name"
    val CreationTime = "CreationTime"
    val Status       = "Status"

    val values = js.Object.freeze(js.Array(Name, CreationTime, Status))
  }

  object SortOrderEnum {
    val Ascending  = "Ascending"
    val Descending = "Descending"

    val values = js.Object.freeze(js.Array(Ascending, Descending))
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
    @inline
    def apply(
        AlgorithmName: ArnOrName,
        ModelDataUrl: js.UndefOr[Url] = js.undefined
    ): SourceAlgorithm = {
      val __obj = js.Dynamic.literal(
        "AlgorithmName" -> AlgorithmName.asInstanceOf[js.Any]
      )

      ModelDataUrl.foreach(__v => __obj.updateDynamic("ModelDataUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceAlgorithm]
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
    @inline
    def apply(
        SourceAlgorithms: SourceAlgorithmList
    ): SourceAlgorithmSpecification = {
      val __obj = js.Dynamic.literal(
        "SourceAlgorithms" -> SourceAlgorithms.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SourceAlgorithmSpecification]
    }
  }

  object SplitTypeEnum {
    val None     = "None"
    val Line     = "Line"
    val RecordIO = "RecordIO"
    val TFRecord = "TFRecord"

    val values = js.Object.freeze(js.Array(None, Line, RecordIO, TFRecord))
  }

  @js.native
  trait StartNotebookInstanceInput extends js.Object {
    var NotebookInstanceName: NotebookInstanceName
  }

  object StartNotebookInstanceInput {
    @inline
    def apply(
        NotebookInstanceName: NotebookInstanceName
    ): StartNotebookInstanceInput = {
      val __obj = js.Dynamic.literal(
        "NotebookInstanceName" -> NotebookInstanceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartNotebookInstanceInput]
    }
  }

  @js.native
  trait StopCompilationJobRequest extends js.Object {
    var CompilationJobName: EntityName
  }

  object StopCompilationJobRequest {
    @inline
    def apply(
        CompilationJobName: EntityName
    ): StopCompilationJobRequest = {
      val __obj = js.Dynamic.literal(
        "CompilationJobName" -> CompilationJobName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopCompilationJobRequest]
    }
  }

  @js.native
  trait StopHyperParameterTuningJobRequest extends js.Object {
    var HyperParameterTuningJobName: HyperParameterTuningJobName
  }

  object StopHyperParameterTuningJobRequest {
    @inline
    def apply(
        HyperParameterTuningJobName: HyperParameterTuningJobName
    ): StopHyperParameterTuningJobRequest = {
      val __obj = js.Dynamic.literal(
        "HyperParameterTuningJobName" -> HyperParameterTuningJobName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopHyperParameterTuningJobRequest]
    }
  }

  @js.native
  trait StopLabelingJobRequest extends js.Object {
    var LabelingJobName: LabelingJobName
  }

  object StopLabelingJobRequest {
    @inline
    def apply(
        LabelingJobName: LabelingJobName
    ): StopLabelingJobRequest = {
      val __obj = js.Dynamic.literal(
        "LabelingJobName" -> LabelingJobName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopLabelingJobRequest]
    }
  }

  @js.native
  trait StopNotebookInstanceInput extends js.Object {
    var NotebookInstanceName: NotebookInstanceName
  }

  object StopNotebookInstanceInput {
    @inline
    def apply(
        NotebookInstanceName: NotebookInstanceName
    ): StopNotebookInstanceInput = {
      val __obj = js.Dynamic.literal(
        "NotebookInstanceName" -> NotebookInstanceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopNotebookInstanceInput]
    }
  }

  @js.native
  trait StopTrainingJobRequest extends js.Object {
    var TrainingJobName: TrainingJobName
  }

  object StopTrainingJobRequest {
    @inline
    def apply(
        TrainingJobName: TrainingJobName
    ): StopTrainingJobRequest = {
      val __obj = js.Dynamic.literal(
        "TrainingJobName" -> TrainingJobName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopTrainingJobRequest]
    }
  }

  @js.native
  trait StopTransformJobRequest extends js.Object {
    var TransformJobName: TransformJobName
  }

  object StopTransformJobRequest {
    @inline
    def apply(
        TransformJobName: TransformJobName
    ): StopTransformJobRequest = {
      val __obj = js.Dynamic.literal(
        "TransformJobName" -> TransformJobName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopTransformJobRequest]
    }
  }

  /**
    * Specifies a limit to how long a model training or compilation job can run. It also specifies how long you are willing to wait for a managed spot training job to complete. When the job reaches the time limit, Amazon SageMaker ends the training or compilation job. Use this API to cap model training costs.
    *  To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal, which delays job termination for 120 seconds. Algorithms can use this 120-second window to save the model artifacts, so the results of training are not lost.
    *  The training algorithms provided by Amazon SageMaker automatically save the intermediate results of a model training job when possible. This attempt to save artifacts is only a best effort case as model might not be in a state from which it can be saved. For example, if training has just started, the model might not be ready to save. When saved, this intermediate data is a valid model artifact. You can use it to create a model with <code>CreateModel</code>.
    *
    * '''Note:'''The Neural Topic Model (NTM) currently does not support saving intermediate model artifacts. When training NTMs, make sure that the maximum runtime is sufficient for the training job to complete.
    */
  @js.native
  trait StoppingCondition extends js.Object {
    var MaxRuntimeInSeconds: js.UndefOr[MaxRuntimeInSeconds]
    var MaxWaitTimeInSeconds: js.UndefOr[MaxWaitTimeInSeconds]
  }

  object StoppingCondition {
    @inline
    def apply(
        MaxRuntimeInSeconds: js.UndefOr[MaxRuntimeInSeconds] = js.undefined,
        MaxWaitTimeInSeconds: js.UndefOr[MaxWaitTimeInSeconds] = js.undefined
    ): StoppingCondition = {
      val __obj = js.Dynamic.literal()
      MaxRuntimeInSeconds.foreach(__v => __obj.updateDynamic("MaxRuntimeInSeconds")(__v.asInstanceOf[js.Any]))
      MaxWaitTimeInSeconds.foreach(__v => __obj.updateDynamic("MaxWaitTimeInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StoppingCondition]
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
    @inline
    def apply(
        WorkteamArn: WorkteamArn,
        ListingId: js.UndefOr[String] = js.undefined,
        MarketplaceDescription: js.UndefOr[String200] = js.undefined,
        MarketplaceTitle: js.UndefOr[String200] = js.undefined,
        SellerName: js.UndefOr[String] = js.undefined
    ): SubscribedWorkteam = {
      val __obj = js.Dynamic.literal(
        "WorkteamArn" -> WorkteamArn.asInstanceOf[js.Any]
      )

      ListingId.foreach(__v => __obj.updateDynamic("ListingId")(__v.asInstanceOf[js.Any]))
      MarketplaceDescription.foreach(__v => __obj.updateDynamic("MarketplaceDescription")(__v.asInstanceOf[js.Any]))
      MarketplaceTitle.foreach(__v => __obj.updateDynamic("MarketplaceTitle")(__v.asInstanceOf[js.Any]))
      SellerName.foreach(__v => __obj.updateDynamic("SellerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubscribedWorkteam]
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
    @inline
    def apply(
        PropertyNameQuery: js.UndefOr[PropertyNameQuery] = js.undefined
    ): SuggestionQuery = {
      val __obj = js.Dynamic.literal()
      PropertyNameQuery.foreach(__v => __obj.updateDynamic("PropertyNameQuery")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuggestionQuery]
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
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  object TargetDeviceEnum {
    val lambda      = "lambda"
    val ml_m4       = "ml_m4"
    val ml_m5       = "ml_m5"
    val ml_c4       = "ml_c4"
    val ml_c5       = "ml_c5"
    val ml_p2       = "ml_p2"
    val ml_p3       = "ml_p3"
    val jetson_tx1  = "jetson_tx1"
    val jetson_tx2  = "jetson_tx2"
    val jetson_nano = "jetson_nano"
    val rasp3b      = "rasp3b"
    val deeplens    = "deeplens"
    val rk3399      = "rk3399"
    val rk3288      = "rk3288"
    val aisage      = "aisage"
    val sbe_c       = "sbe_c"
    val qcs605      = "qcs605"
    val qcs603      = "qcs603"

    val values = js.Object.freeze(
      js.Array(
        lambda,
        ml_m4,
        ml_m5,
        ml_c4,
        ml_c5,
        ml_p2,
        ml_p3,
        jetson_tx1,
        jetson_tx2,
        jetson_nano,
        rasp3b,
        deeplens,
        rk3399,
        rk3288,
        aisage,
        sbe_c,
        qcs605,
        qcs603
      )
    )
  }

  object TrainingInputModeEnum {
    val Pipe = "Pipe"
    val File = "File"

    val values = js.Object.freeze(js.Array(Pipe, File))
  }

  object TrainingInstanceTypeEnum {
    val `ml.m4.xlarge`     = "ml.m4.xlarge"
    val `ml.m4.2xlarge`    = "ml.m4.2xlarge"
    val `ml.m4.4xlarge`    = "ml.m4.4xlarge"
    val `ml.m4.10xlarge`   = "ml.m4.10xlarge"
    val `ml.m4.16xlarge`   = "ml.m4.16xlarge"
    val `ml.m5.large`      = "ml.m5.large"
    val `ml.m5.xlarge`     = "ml.m5.xlarge"
    val `ml.m5.2xlarge`    = "ml.m5.2xlarge"
    val `ml.m5.4xlarge`    = "ml.m5.4xlarge"
    val `ml.m5.12xlarge`   = "ml.m5.12xlarge"
    val `ml.m5.24xlarge`   = "ml.m5.24xlarge"
    val `ml.c4.xlarge`     = "ml.c4.xlarge"
    val `ml.c4.2xlarge`    = "ml.c4.2xlarge"
    val `ml.c4.4xlarge`    = "ml.c4.4xlarge"
    val `ml.c4.8xlarge`    = "ml.c4.8xlarge"
    val `ml.p2.xlarge`     = "ml.p2.xlarge"
    val `ml.p2.8xlarge`    = "ml.p2.8xlarge"
    val `ml.p2.16xlarge`   = "ml.p2.16xlarge"
    val `ml.p3.2xlarge`    = "ml.p3.2xlarge"
    val `ml.p3.8xlarge`    = "ml.p3.8xlarge"
    val `ml.p3.16xlarge`   = "ml.p3.16xlarge"
    val `ml.c5.xlarge`     = "ml.c5.xlarge"
    val `ml.c5.2xlarge`    = "ml.c5.2xlarge"
    val `ml.c5.4xlarge`    = "ml.c5.4xlarge"
    val `ml.c5.9xlarge`    = "ml.c5.9xlarge"
    val `ml.c5.18xlarge`   = "ml.c5.18xlarge"
    val `ml.p3dn.24xlarge` = "ml.p3dn.24xlarge"

    val values = js.Object.freeze(
      js.Array(
        `ml.m4.xlarge`,
        `ml.m4.2xlarge`,
        `ml.m4.4xlarge`,
        `ml.m4.10xlarge`,
        `ml.m4.16xlarge`,
        `ml.m5.large`,
        `ml.m5.xlarge`,
        `ml.m5.2xlarge`,
        `ml.m5.4xlarge`,
        `ml.m5.12xlarge`,
        `ml.m5.24xlarge`,
        `ml.c4.xlarge`,
        `ml.c4.2xlarge`,
        `ml.c4.4xlarge`,
        `ml.c4.8xlarge`,
        `ml.p2.xlarge`,
        `ml.p2.8xlarge`,
        `ml.p2.16xlarge`,
        `ml.p3.2xlarge`,
        `ml.p3.8xlarge`,
        `ml.p3.16xlarge`,
        `ml.c5.xlarge`,
        `ml.c5.2xlarge`,
        `ml.c5.4xlarge`,
        `ml.c5.9xlarge`,
        `ml.c5.18xlarge`,
        `ml.p3dn.24xlarge`
      )
    )
  }

  /**
    * Contains information about a training job.
    */
  @js.native
  trait TrainingJob extends js.Object {
    var AlgorithmSpecification: js.UndefOr[AlgorithmSpecification]
    var CreationTime: js.UndefOr[Timestamp]
    var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean]
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
    @inline
    def apply(
        AlgorithmSpecification: js.UndefOr[AlgorithmSpecification] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined,
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
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): TrainingJob = {
      val __obj = js.Dynamic.literal()
      AlgorithmSpecification.foreach(__v => __obj.updateDynamic("AlgorithmSpecification")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      EnableInterContainerTrafficEncryption.foreach(
        __v => __obj.updateDynamic("EnableInterContainerTrafficEncryption")(__v.asInstanceOf[js.Any])
      )
      EnableNetworkIsolation.foreach(__v => __obj.updateDynamic("EnableNetworkIsolation")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      FinalMetricDataList.foreach(__v => __obj.updateDynamic("FinalMetricDataList")(__v.asInstanceOf[js.Any]))
      HyperParameters.foreach(__v => __obj.updateDynamic("HyperParameters")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      LabelingJobArn.foreach(__v => __obj.updateDynamic("LabelingJobArn")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      ModelArtifacts.foreach(__v => __obj.updateDynamic("ModelArtifacts")(__v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.updateDynamic("OutputDataConfig")(__v.asInstanceOf[js.Any]))
      ResourceConfig.foreach(__v => __obj.updateDynamic("ResourceConfig")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      SecondaryStatus.foreach(__v => __obj.updateDynamic("SecondaryStatus")(__v.asInstanceOf[js.Any]))
      SecondaryStatusTransitions.foreach(
        __v => __obj.updateDynamic("SecondaryStatusTransitions")(__v.asInstanceOf[js.Any])
      )
      StoppingCondition.foreach(__v => __obj.updateDynamic("StoppingCondition")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TrainingEndTime.foreach(__v => __obj.updateDynamic("TrainingEndTime")(__v.asInstanceOf[js.Any]))
      TrainingJobArn.foreach(__v => __obj.updateDynamic("TrainingJobArn")(__v.asInstanceOf[js.Any]))
      TrainingJobName.foreach(__v => __obj.updateDynamic("TrainingJobName")(__v.asInstanceOf[js.Any]))
      TrainingJobStatus.foreach(__v => __obj.updateDynamic("TrainingJobStatus")(__v.asInstanceOf[js.Any]))
      TrainingStartTime.foreach(__v => __obj.updateDynamic("TrainingStartTime")(__v.asInstanceOf[js.Any]))
      TuningJobArn.foreach(__v => __obj.updateDynamic("TuningJobArn")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrainingJob]
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
    @inline
    def apply(
        InputDataConfig: InputDataConfig,
        OutputDataConfig: OutputDataConfig,
        ResourceConfig: ResourceConfig,
        StoppingCondition: StoppingCondition,
        TrainingInputMode: TrainingInputMode,
        HyperParameters: js.UndefOr[HyperParameters] = js.undefined
    ): TrainingJobDefinition = {
      val __obj = js.Dynamic.literal(
        "InputDataConfig"   -> InputDataConfig.asInstanceOf[js.Any],
        "OutputDataConfig"  -> OutputDataConfig.asInstanceOf[js.Any],
        "ResourceConfig"    -> ResourceConfig.asInstanceOf[js.Any],
        "StoppingCondition" -> StoppingCondition.asInstanceOf[js.Any],
        "TrainingInputMode" -> TrainingInputMode.asInstanceOf[js.Any]
      )

      HyperParameters.foreach(__v => __obj.updateDynamic("HyperParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrainingJobDefinition]
    }
  }

  object TrainingJobEarlyStoppingTypeEnum {
    val Off  = "Off"
    val Auto = "Auto"

    val values = js.Object.freeze(js.Array(Off, Auto))
  }

  object TrainingJobSortByOptionsEnum {
    val Name                      = "Name"
    val CreationTime              = "CreationTime"
    val Status                    = "Status"
    val FinalObjectiveMetricValue = "FinalObjectiveMetricValue"

    val values = js.Object.freeze(js.Array(Name, CreationTime, Status, FinalObjectiveMetricValue))
  }

  object TrainingJobStatusEnum {
    val InProgress = "InProgress"
    val Completed  = "Completed"
    val Failed     = "Failed"
    val Stopping   = "Stopping"
    val Stopped    = "Stopped"

    val values = js.Object.freeze(js.Array(InProgress, Completed, Failed, Stopping, Stopped))
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
    @inline
    def apply(
        Completed: js.UndefOr[TrainingJobStatusCounter] = js.undefined,
        InProgress: js.UndefOr[TrainingJobStatusCounter] = js.undefined,
        NonRetryableError: js.UndefOr[TrainingJobStatusCounter] = js.undefined,
        RetryableError: js.UndefOr[TrainingJobStatusCounter] = js.undefined,
        Stopped: js.UndefOr[TrainingJobStatusCounter] = js.undefined
    ): TrainingJobStatusCounters = {
      val __obj = js.Dynamic.literal()
      Completed.foreach(__v => __obj.updateDynamic("Completed")(__v.asInstanceOf[js.Any]))
      InProgress.foreach(__v => __obj.updateDynamic("InProgress")(__v.asInstanceOf[js.Any]))
      NonRetryableError.foreach(__v => __obj.updateDynamic("NonRetryableError")(__v.asInstanceOf[js.Any]))
      RetryableError.foreach(__v => __obj.updateDynamic("RetryableError")(__v.asInstanceOf[js.Any]))
      Stopped.foreach(__v => __obj.updateDynamic("Stopped")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrainingJobStatusCounters]
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
    @inline
    def apply(
        CreationTime: Timestamp,
        TrainingJobArn: TrainingJobArn,
        TrainingJobName: TrainingJobName,
        TrainingJobStatus: TrainingJobStatus,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        TrainingEndTime: js.UndefOr[Timestamp] = js.undefined
    ): TrainingJobSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime"      -> CreationTime.asInstanceOf[js.Any],
        "TrainingJobArn"    -> TrainingJobArn.asInstanceOf[js.Any],
        "TrainingJobName"   -> TrainingJobName.asInstanceOf[js.Any],
        "TrainingJobStatus" -> TrainingJobStatus.asInstanceOf[js.Any]
      )

      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      TrainingEndTime.foreach(__v => __obj.updateDynamic("TrainingEndTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrainingJobSummary]
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
    @inline
    def apply(
        SupportedTrainingInstanceTypes: TrainingInstanceTypes,
        TrainingChannels: ChannelSpecifications,
        TrainingImage: Image,
        MetricDefinitions: js.UndefOr[MetricDefinitionList] = js.undefined,
        SupportedHyperParameters: js.UndefOr[HyperParameterSpecifications] = js.undefined,
        SupportedTuningJobObjectiveMetrics: js.UndefOr[HyperParameterTuningJobObjectives] = js.undefined,
        SupportsDistributedTraining: js.UndefOr[Boolean] = js.undefined,
        TrainingImageDigest: js.UndefOr[ImageDigest] = js.undefined
    ): TrainingSpecification = {
      val __obj = js.Dynamic.literal(
        "SupportedTrainingInstanceTypes" -> SupportedTrainingInstanceTypes.asInstanceOf[js.Any],
        "TrainingChannels"               -> TrainingChannels.asInstanceOf[js.Any],
        "TrainingImage"                  -> TrainingImage.asInstanceOf[js.Any]
      )

      MetricDefinitions.foreach(__v => __obj.updateDynamic("MetricDefinitions")(__v.asInstanceOf[js.Any]))
      SupportedHyperParameters.foreach(__v => __obj.updateDynamic("SupportedHyperParameters")(__v.asInstanceOf[js.Any]))
      SupportedTuningJobObjectiveMetrics.foreach(
        __v => __obj.updateDynamic("SupportedTuningJobObjectiveMetrics")(__v.asInstanceOf[js.Any])
      )
      SupportsDistributedTraining.foreach(
        __v => __obj.updateDynamic("SupportsDistributedTraining")(__v.asInstanceOf[js.Any])
      )
      TrainingImageDigest.foreach(__v => __obj.updateDynamic("TrainingImageDigest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrainingSpecification]
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
    @inline
    def apply(
        S3DataSource: TransformS3DataSource
    ): TransformDataSource = {
      val __obj = js.Dynamic.literal(
        "S3DataSource" -> S3DataSource.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TransformDataSource]
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
    @inline
    def apply(
        DataSource: TransformDataSource,
        CompressionType: js.UndefOr[CompressionType] = js.undefined,
        ContentType: js.UndefOr[ContentType] = js.undefined,
        SplitType: js.UndefOr[SplitType] = js.undefined
    ): TransformInput = {
      val __obj = js.Dynamic.literal(
        "DataSource" -> DataSource.asInstanceOf[js.Any]
      )

      CompressionType.foreach(__v => __obj.updateDynamic("CompressionType")(__v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      SplitType.foreach(__v => __obj.updateDynamic("SplitType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransformInput]
    }
  }

  object TransformInstanceTypeEnum {
    val `ml.m4.xlarge`   = "ml.m4.xlarge"
    val `ml.m4.2xlarge`  = "ml.m4.2xlarge"
    val `ml.m4.4xlarge`  = "ml.m4.4xlarge"
    val `ml.m4.10xlarge` = "ml.m4.10xlarge"
    val `ml.m4.16xlarge` = "ml.m4.16xlarge"
    val `ml.c4.xlarge`   = "ml.c4.xlarge"
    val `ml.c4.2xlarge`  = "ml.c4.2xlarge"
    val `ml.c4.4xlarge`  = "ml.c4.4xlarge"
    val `ml.c4.8xlarge`  = "ml.c4.8xlarge"
    val `ml.p2.xlarge`   = "ml.p2.xlarge"
    val `ml.p2.8xlarge`  = "ml.p2.8xlarge"
    val `ml.p2.16xlarge` = "ml.p2.16xlarge"
    val `ml.p3.2xlarge`  = "ml.p3.2xlarge"
    val `ml.p3.8xlarge`  = "ml.p3.8xlarge"
    val `ml.p3.16xlarge` = "ml.p3.16xlarge"
    val `ml.c5.xlarge`   = "ml.c5.xlarge"
    val `ml.c5.2xlarge`  = "ml.c5.2xlarge"
    val `ml.c5.4xlarge`  = "ml.c5.4xlarge"
    val `ml.c5.9xlarge`  = "ml.c5.9xlarge"
    val `ml.c5.18xlarge` = "ml.c5.18xlarge"
    val `ml.m5.large`    = "ml.m5.large"
    val `ml.m5.xlarge`   = "ml.m5.xlarge"
    val `ml.m5.2xlarge`  = "ml.m5.2xlarge"
    val `ml.m5.4xlarge`  = "ml.m5.4xlarge"
    val `ml.m5.12xlarge` = "ml.m5.12xlarge"
    val `ml.m5.24xlarge` = "ml.m5.24xlarge"

    val values = js.Object.freeze(
      js.Array(
        `ml.m4.xlarge`,
        `ml.m4.2xlarge`,
        `ml.m4.4xlarge`,
        `ml.m4.10xlarge`,
        `ml.m4.16xlarge`,
        `ml.c4.xlarge`,
        `ml.c4.2xlarge`,
        `ml.c4.4xlarge`,
        `ml.c4.8xlarge`,
        `ml.p2.xlarge`,
        `ml.p2.8xlarge`,
        `ml.p2.16xlarge`,
        `ml.p3.2xlarge`,
        `ml.p3.8xlarge`,
        `ml.p3.16xlarge`,
        `ml.c5.xlarge`,
        `ml.c5.2xlarge`,
        `ml.c5.4xlarge`,
        `ml.c5.9xlarge`,
        `ml.c5.18xlarge`,
        `ml.m5.large`,
        `ml.m5.xlarge`,
        `ml.m5.2xlarge`,
        `ml.m5.4xlarge`,
        `ml.m5.12xlarge`,
        `ml.m5.24xlarge`
      )
    )
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
    @inline
    def apply(
        TransformInput: TransformInput,
        TransformOutput: TransformOutput,
        TransformResources: TransformResources,
        BatchStrategy: js.UndefOr[BatchStrategy] = js.undefined,
        Environment: js.UndefOr[TransformEnvironmentMap] = js.undefined,
        MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms] = js.undefined,
        MaxPayloadInMB: js.UndefOr[MaxPayloadInMB] = js.undefined
    ): TransformJobDefinition = {
      val __obj = js.Dynamic.literal(
        "TransformInput"     -> TransformInput.asInstanceOf[js.Any],
        "TransformOutput"    -> TransformOutput.asInstanceOf[js.Any],
        "TransformResources" -> TransformResources.asInstanceOf[js.Any]
      )

      BatchStrategy.foreach(__v => __obj.updateDynamic("BatchStrategy")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      MaxConcurrentTransforms.foreach(__v => __obj.updateDynamic("MaxConcurrentTransforms")(__v.asInstanceOf[js.Any]))
      MaxPayloadInMB.foreach(__v => __obj.updateDynamic("MaxPayloadInMB")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransformJobDefinition]
    }
  }

  object TransformJobStatusEnum {
    val InProgress = "InProgress"
    val Completed  = "Completed"
    val Failed     = "Failed"
    val Stopping   = "Stopping"
    val Stopped    = "Stopped"

    val values = js.Object.freeze(js.Array(InProgress, Completed, Failed, Stopping, Stopped))
  }

  /**
    * Provides a summary of a transform job. Multiple <code>TransformJobSummary</code> objects are returned as a list after in response to a <a>ListTransformJobs</a> call.
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
    @inline
    def apply(
        CreationTime: Timestamp,
        TransformJobArn: TransformJobArn,
        TransformJobName: TransformJobName,
        TransformJobStatus: TransformJobStatus,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        TransformEndTime: js.UndefOr[Timestamp] = js.undefined
    ): TransformJobSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime"       -> CreationTime.asInstanceOf[js.Any],
        "TransformJobArn"    -> TransformJobArn.asInstanceOf[js.Any],
        "TransformJobName"   -> TransformJobName.asInstanceOf[js.Any],
        "TransformJobStatus" -> TransformJobStatus.asInstanceOf[js.Any]
      )

      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      TransformEndTime.foreach(__v => __obj.updateDynamic("TransformEndTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransformJobSummary]
    }
  }

  /**
    * Describes the results of a transform job.
    */
  @js.native
  trait TransformOutput extends js.Object {
    var S3OutputPath: S3Uri
    var Accept: js.UndefOr[Accept]
    var AssembleWith: js.UndefOr[AssemblyType]
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object TransformOutput {
    @inline
    def apply(
        S3OutputPath: S3Uri,
        Accept: js.UndefOr[Accept] = js.undefined,
        AssembleWith: js.UndefOr[AssemblyType] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): TransformOutput = {
      val __obj = js.Dynamic.literal(
        "S3OutputPath" -> S3OutputPath.asInstanceOf[js.Any]
      )

      Accept.foreach(__v => __obj.updateDynamic("Accept")(__v.asInstanceOf[js.Any]))
      AssembleWith.foreach(__v => __obj.updateDynamic("AssembleWith")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransformOutput]
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
    @inline
    def apply(
        InstanceCount: TransformInstanceCount,
        InstanceType: TransformInstanceType,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): TransformResources = {
      val __obj = js.Dynamic.literal(
        "InstanceCount" -> InstanceCount.asInstanceOf[js.Any],
        "InstanceType"  -> InstanceType.asInstanceOf[js.Any]
      )

      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransformResources]
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
    @inline
    def apply(
        S3DataType: S3DataType,
        S3Uri: S3Uri
    ): TransformS3DataSource = {
      val __obj = js.Dynamic.literal(
        "S3DataType" -> S3DataType.asInstanceOf[js.Any],
        "S3Uri"      -> S3Uri.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TransformS3DataSource]
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
    @inline
    def apply(
        Cents: js.UndefOr[Cents] = js.undefined,
        Dollars: js.UndefOr[Dollars] = js.undefined,
        TenthFractionsOfACent: js.UndefOr[TenthFractionsOfACent] = js.undefined
    ): USD = {
      val __obj = js.Dynamic.literal()
      Cents.foreach(__v => __obj.updateDynamic("Cents")(__v.asInstanceOf[js.Any]))
      Dollars.foreach(__v => __obj.updateDynamic("Dollars")(__v.asInstanceOf[js.Any]))
      TenthFractionsOfACent.foreach(__v => __obj.updateDynamic("TenthFractionsOfACent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[USD]
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
    @inline
    def apply(
        UiTemplateS3Uri: S3Uri
    ): UiConfig = {
      val __obj = js.Dynamic.literal(
        "UiTemplateS3Uri" -> UiTemplateS3Uri.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UiConfig]
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
    @inline
    def apply(
        Content: TemplateContent
    ): UiTemplate = {
      val __obj = js.Dynamic.literal(
        "Content" -> Content.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UiTemplate]
    }
  }

  @js.native
  trait UpdateCodeRepositoryInput extends js.Object {
    var CodeRepositoryName: EntityName
    var GitConfig: js.UndefOr[GitConfigForUpdate]
  }

  object UpdateCodeRepositoryInput {
    @inline
    def apply(
        CodeRepositoryName: EntityName,
        GitConfig: js.UndefOr[GitConfigForUpdate] = js.undefined
    ): UpdateCodeRepositoryInput = {
      val __obj = js.Dynamic.literal(
        "CodeRepositoryName" -> CodeRepositoryName.asInstanceOf[js.Any]
      )

      GitConfig.foreach(__v => __obj.updateDynamic("GitConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCodeRepositoryInput]
    }
  }

  @js.native
  trait UpdateCodeRepositoryOutput extends js.Object {
    var CodeRepositoryArn: CodeRepositoryArn
  }

  object UpdateCodeRepositoryOutput {
    @inline
    def apply(
        CodeRepositoryArn: CodeRepositoryArn
    ): UpdateCodeRepositoryOutput = {
      val __obj = js.Dynamic.literal(
        "CodeRepositoryArn" -> CodeRepositoryArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateCodeRepositoryOutput]
    }
  }

  @js.native
  trait UpdateEndpointInput extends js.Object {
    var EndpointConfigName: EndpointConfigName
    var EndpointName: EndpointName
  }

  object UpdateEndpointInput {
    @inline
    def apply(
        EndpointConfigName: EndpointConfigName,
        EndpointName: EndpointName
    ): UpdateEndpointInput = {
      val __obj = js.Dynamic.literal(
        "EndpointConfigName" -> EndpointConfigName.asInstanceOf[js.Any],
        "EndpointName"       -> EndpointName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateEndpointInput]
    }
  }

  @js.native
  trait UpdateEndpointOutput extends js.Object {
    var EndpointArn: EndpointArn
  }

  object UpdateEndpointOutput {
    @inline
    def apply(
        EndpointArn: EndpointArn
    ): UpdateEndpointOutput = {
      val __obj = js.Dynamic.literal(
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateEndpointOutput]
    }
  }

  @js.native
  trait UpdateEndpointWeightsAndCapacitiesInput extends js.Object {
    var DesiredWeightsAndCapacities: DesiredWeightAndCapacityList
    var EndpointName: EndpointName
  }

  object UpdateEndpointWeightsAndCapacitiesInput {
    @inline
    def apply(
        DesiredWeightsAndCapacities: DesiredWeightAndCapacityList,
        EndpointName: EndpointName
    ): UpdateEndpointWeightsAndCapacitiesInput = {
      val __obj = js.Dynamic.literal(
        "DesiredWeightsAndCapacities" -> DesiredWeightsAndCapacities.asInstanceOf[js.Any],
        "EndpointName"                -> EndpointName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateEndpointWeightsAndCapacitiesInput]
    }
  }

  @js.native
  trait UpdateEndpointWeightsAndCapacitiesOutput extends js.Object {
    var EndpointArn: EndpointArn
  }

  object UpdateEndpointWeightsAndCapacitiesOutput {
    @inline
    def apply(
        EndpointArn: EndpointArn
    ): UpdateEndpointWeightsAndCapacitiesOutput = {
      val __obj = js.Dynamic.literal(
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateEndpointWeightsAndCapacitiesOutput]
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
    var RootAccess: js.UndefOr[RootAccess]
    var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB]
  }

  object UpdateNotebookInstanceInput {
    @inline
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
        RootAccess: js.UndefOr[RootAccess] = js.undefined,
        VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.undefined
    ): UpdateNotebookInstanceInput = {
      val __obj = js.Dynamic.literal(
        "NotebookInstanceName" -> NotebookInstanceName.asInstanceOf[js.Any]
      )

      AcceleratorTypes.foreach(__v => __obj.updateDynamic("AcceleratorTypes")(__v.asInstanceOf[js.Any]))
      AdditionalCodeRepositories.foreach(
        __v => __obj.updateDynamic("AdditionalCodeRepositories")(__v.asInstanceOf[js.Any])
      )
      DefaultCodeRepository.foreach(__v => __obj.updateDynamic("DefaultCodeRepository")(__v.asInstanceOf[js.Any]))
      DisassociateAcceleratorTypes.foreach(
        __v => __obj.updateDynamic("DisassociateAcceleratorTypes")(__v.asInstanceOf[js.Any])
      )
      DisassociateAdditionalCodeRepositories.foreach(
        __v => __obj.updateDynamic("DisassociateAdditionalCodeRepositories")(__v.asInstanceOf[js.Any])
      )
      DisassociateDefaultCodeRepository.foreach(
        __v => __obj.updateDynamic("DisassociateDefaultCodeRepository")(__v.asInstanceOf[js.Any])
      )
      DisassociateLifecycleConfig.foreach(
        __v => __obj.updateDynamic("DisassociateLifecycleConfig")(__v.asInstanceOf[js.Any])
      )
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      LifecycleConfigName.foreach(__v => __obj.updateDynamic("LifecycleConfigName")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      RootAccess.foreach(__v => __obj.updateDynamic("RootAccess")(__v.asInstanceOf[js.Any]))
      VolumeSizeInGB.foreach(__v => __obj.updateDynamic("VolumeSizeInGB")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNotebookInstanceInput]
    }
  }

  @js.native
  trait UpdateNotebookInstanceLifecycleConfigInput extends js.Object {
    var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
    var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList]
    var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList]
  }

  object UpdateNotebookInstanceLifecycleConfigInput {
    @inline
    def apply(
        NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName,
        OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined,
        OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined
    ): UpdateNotebookInstanceLifecycleConfigInput = {
      val __obj = js.Dynamic.literal(
        "NotebookInstanceLifecycleConfigName" -> NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any]
      )

      OnCreate.foreach(__v => __obj.updateDynamic("OnCreate")(__v.asInstanceOf[js.Any]))
      OnStart.foreach(__v => __obj.updateDynamic("OnStart")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNotebookInstanceLifecycleConfigInput]
    }
  }

  @js.native
  trait UpdateNotebookInstanceLifecycleConfigOutput extends js.Object {}

  object UpdateNotebookInstanceLifecycleConfigOutput {
    @inline
    def apply(
        ): UpdateNotebookInstanceLifecycleConfigOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateNotebookInstanceLifecycleConfigOutput]
    }
  }

  @js.native
  trait UpdateNotebookInstanceOutput extends js.Object {}

  object UpdateNotebookInstanceOutput {
    @inline
    def apply(
        ): UpdateNotebookInstanceOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateNotebookInstanceOutput]
    }
  }

  @js.native
  trait UpdateWorkteamRequest extends js.Object {
    var WorkteamName: WorkteamName
    var Description: js.UndefOr[String200]
    var MemberDefinitions: js.UndefOr[MemberDefinitions]
    var NotificationConfiguration: js.UndefOr[NotificationConfiguration]
  }

  object UpdateWorkteamRequest {
    @inline
    def apply(
        WorkteamName: WorkteamName,
        Description: js.UndefOr[String200] = js.undefined,
        MemberDefinitions: js.UndefOr[MemberDefinitions] = js.undefined,
        NotificationConfiguration: js.UndefOr[NotificationConfiguration] = js.undefined
    ): UpdateWorkteamRequest = {
      val __obj = js.Dynamic.literal(
        "WorkteamName" -> WorkteamName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      MemberDefinitions.foreach(__v => __obj.updateDynamic("MemberDefinitions")(__v.asInstanceOf[js.Any]))
      NotificationConfiguration.foreach(
        __v => __obj.updateDynamic("NotificationConfiguration")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[UpdateWorkteamRequest]
    }
  }

  @js.native
  trait UpdateWorkteamResponse extends js.Object {
    var Workteam: Workteam
  }

  object UpdateWorkteamResponse {
    @inline
    def apply(
        Workteam: Workteam
    ): UpdateWorkteamResponse = {
      val __obj = js.Dynamic.literal(
        "Workteam" -> Workteam.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateWorkteamResponse]
    }
  }

  /**
    * Specifies a VPC that your training jobs and hosted models have access to. Control access to and from your training and model containers by configuring the VPC. For more information, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html|Protect Endpoints by Using an Amazon Virtual Private Cloud]] and [[https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html|Protect Training Jobs by Using an Amazon Virtual Private Cloud]].
    */
  @js.native
  trait VpcConfig extends js.Object {
    var SecurityGroupIds: VpcSecurityGroupIds
    var Subnets: Subnets
  }

  object VpcConfig {
    @inline
    def apply(
        SecurityGroupIds: VpcSecurityGroupIds,
        Subnets: Subnets
    ): VpcConfig = {
      val __obj = js.Dynamic.literal(
        "SecurityGroupIds" -> SecurityGroupIds.asInstanceOf[js.Any],
        "Subnets"          -> Subnets.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VpcConfig]
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
    var NotificationConfiguration: js.UndefOr[NotificationConfiguration]
    var ProductListingIds: js.UndefOr[ProductListings]
    var SubDomain: js.UndefOr[String]
  }

  object Workteam {
    @inline
    def apply(
        Description: String200,
        MemberDefinitions: MemberDefinitions,
        WorkteamArn: WorkteamArn,
        WorkteamName: WorkteamName,
        CreateDate: js.UndefOr[Timestamp] = js.undefined,
        LastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
        NotificationConfiguration: js.UndefOr[NotificationConfiguration] = js.undefined,
        ProductListingIds: js.UndefOr[ProductListings] = js.undefined,
        SubDomain: js.UndefOr[String] = js.undefined
    ): Workteam = {
      val __obj = js.Dynamic.literal(
        "Description"       -> Description.asInstanceOf[js.Any],
        "MemberDefinitions" -> MemberDefinitions.asInstanceOf[js.Any],
        "WorkteamArn"       -> WorkteamArn.asInstanceOf[js.Any],
        "WorkteamName"      -> WorkteamName.asInstanceOf[js.Any]
      )

      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      LastUpdatedDate.foreach(__v => __obj.updateDynamic("LastUpdatedDate")(__v.asInstanceOf[js.Any]))
      NotificationConfiguration.foreach(
        __v => __obj.updateDynamic("NotificationConfiguration")(__v.asInstanceOf[js.Any])
      )
      ProductListingIds.foreach(__v => __obj.updateDynamic("ProductListingIds")(__v.asInstanceOf[js.Any]))
      SubDomain.foreach(__v => __obj.updateDynamic("SubDomain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Workteam]
    }
  }
}
