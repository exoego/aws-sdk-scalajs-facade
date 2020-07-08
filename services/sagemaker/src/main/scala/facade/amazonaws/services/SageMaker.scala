package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object sagemaker {
  type Accept                                          = String
  type AccountId                                       = String
  type AdditionalCodeRepositoryNamesOrUrls             = js.Array[CodeRepositoryNameOrUrl]
  type AlgorithmArn                                    = String
  type AlgorithmImage                                  = String
  type AlgorithmStatusItemList                         = js.Array[AlgorithmStatusItem]
  type AlgorithmSummaryList                            = js.Array[AlgorithmSummary]
  type AlgorithmValidationProfiles                     = js.Array[AlgorithmValidationProfile]
  type AppArn                                          = String
  type AppList                                         = js.Array[AppDetails]
  type AppName                                         = String
  type ArnOrName                                       = String
  type AttributeName                                   = String
  type AttributeNames                                  = js.Array[AttributeName]
  type AutoMLCandidates                                = js.Array[AutoMLCandidate]
  type AutoMLContainerDefinitions                      = js.Array[AutoMLContainerDefinition]
  type AutoMLFailureReason                             = String
  type AutoMLInputDataConfig                           = js.Array[AutoMLChannel]
  type AutoMLJobArn                                    = String
  type AutoMLJobName                                   = String
  type AutoMLJobSummaries                              = js.Array[AutoMLJobSummary]
  type AutoMLMaxResults                                = Int
  type AutoMLNameContains                              = String
  type BillableTimeInSeconds                           = Int
  type Branch                                          = String
  type CandidateDefinitionNotebookLocation             = String
  type CandidateName                                   = String
  type CandidateStepArn                                = String
  type CandidateStepName                               = String
  type CandidateSteps                                  = js.Array[AutoMLCandidateStep]
  type CaptureOptionList                               = js.Array[CaptureOption]
  type CategoricalParameterRanges                      = js.Array[CategoricalParameterRange]
  type Cents                                           = Int
  type CertifyForMarketplace                           = Boolean
  type ChannelName                                     = String
  type ChannelSpecifications                           = js.Array[ChannelSpecification]
  type Cidr                                            = String
  type Cidrs                                           = js.Array[Cidr]
  type CodeRepositoryArn                               = String
  type CodeRepositoryContains                          = String
  type CodeRepositoryNameContains                      = String
  type CodeRepositoryNameOrUrl                         = String
  type CodeRepositorySummaryList                       = js.Array[CodeRepositorySummary]
  type CognitoClientId                                 = String
  type CognitoUserGroup                                = String
  type CognitoUserPool                                 = String
  type CollectionConfigurations                        = js.Array[CollectionConfiguration]
  type CollectionName                                  = String
  type CollectionParameters                            = js.Dictionary[ConfigValue]
  type CompilationJobArn                               = String
  type CompilationJobSummaries                         = js.Array[CompilationJobSummary]
  type CompressionTypes                                = js.Array[CompressionType]
  type ConfigKey                                       = String
  type ConfigValue                                     = String
  type ContainerArgument                               = String
  type ContainerArguments                              = js.Array[ContainerArgument]
  type ContainerDefinitionList                         = js.Array[ContainerDefinition]
  type ContainerEntrypoint                             = js.Array[ContainerEntrypointString]
  type ContainerEntrypointString                       = String
  type ContainerHostname                               = String
  type ContentClassifiers                              = js.Array[ContentClassifier]
  type ContentType                                     = String
  type ContentTypes                                    = js.Array[ContentType]
  type ContinuousParameterRanges                       = js.Array[ContinuousParameterRange]
  type CreationTime                                    = js.Date
  type CsvContentType                                  = String
  type CsvContentTypes                                 = js.Array[CsvContentType]
  type DataExplorationNotebookLocation                 = String
  type DataInputConfig                                 = String
  type DebugRuleConfigurations                         = js.Array[DebugRuleConfiguration]
  type DebugRuleEvaluationStatuses                     = js.Array[DebugRuleEvaluationStatus]
  type DeployedImages                                  = js.Array[DeployedImage]
  type DesiredWeightAndCapacityList                    = js.Array[DesiredWeightAndCapacity]
  type DestinationS3Uri                                = String
  type DirectoryPath                                   = String
  type DisassociateAdditionalCodeRepositories          = Boolean
  type DisassociateDefaultCodeRepository               = Boolean
  type DisassociateNotebookInstanceAcceleratorTypes    = Boolean
  type DisassociateNotebookInstanceLifecycleConfig     = Boolean
  type Dollars                                         = Int
  type DomainArn                                       = String
  type DomainId                                        = String
  type DomainList                                      = js.Array[DomainDetails]
  type DomainName                                      = String
  type DoubleParameterValue                            = Double
  type EfsUid                                          = String
  type EnableCapture                                   = Boolean
  type EndpointArn                                     = String
  type EndpointConfigArn                               = String
  type EndpointConfigName                              = String
  type EndpointConfigNameContains                      = String
  type EndpointConfigSummaryList                       = js.Array[EndpointConfigSummary]
  type EndpointName                                    = String
  type EndpointNameContains                            = String
  type EndpointSummaryList                             = js.Array[EndpointSummary]
  type EntityDescription                               = String
  type EntityName                                      = String
  type EnvironmentKey                                  = String
  type EnvironmentMap                                  = js.Dictionary[EnvironmentValue]
  type EnvironmentValue                                = String
  type ExitMessage                                     = String
  type ExperimentArn                                   = String
  type ExperimentDescription                           = String
  type ExperimentEntityName                            = String
  type ExperimentSourceArn                             = String
  type ExperimentSummaries                             = js.Array[ExperimentSummary]
  type FailureReason                                   = String
  type FileSystemId                                    = String
  type FilterList                                      = js.Array[Filter]
  type FilterValue                                     = String
  type FinalMetricDataList                             = js.Array[MetricData]
  type FlowDefinitionArn                               = String
  type FlowDefinitionName                              = String
  type FlowDefinitionSummaries                         = js.Array[FlowDefinitionSummary]
  type FlowDefinitionTaskAvailabilityLifetimeInSeconds = Int
  type FlowDefinitionTaskCount                         = Int
  type FlowDefinitionTaskDescription                   = String
  type FlowDefinitionTaskKeyword                       = String
  type FlowDefinitionTaskKeywords                      = js.Array[FlowDefinitionTaskKeyword]
  type FlowDefinitionTaskTimeLimitInSeconds            = Int
  type FlowDefinitionTaskTitle                         = String
  type GenerateCandidateDefinitionsOnly                = Boolean
  type GitConfigUrl                                    = String
  type HookParameters                                  = js.Dictionary[ConfigValue]
  type HumanLoopActivationConditions                   = String
  type HumanTaskUiArn                                  = String
  type HumanTaskUiName                                 = String
  type HumanTaskUiSummaries                            = js.Array[HumanTaskUiSummary]
  type HyperParameterSpecifications                    = js.Array[HyperParameterSpecification]
  type HyperParameterTrainingJobDefinitionName         = String
  type HyperParameterTrainingJobDefinitions            = js.Array[HyperParameterTrainingJobDefinition]
  type HyperParameterTrainingJobSummaries              = js.Array[HyperParameterTrainingJobSummary]
  type HyperParameterTuningJobArn                      = String
  type HyperParameterTuningJobName                     = String
  type HyperParameterTuningJobObjectives               = js.Array[HyperParameterTuningJobObjective]
  type HyperParameterTuningJobSummaries                = js.Array[HyperParameterTuningJobSummary]
  type HyperParameters                                 = js.Dictionary[ParameterValue]
  type Image                                           = String
  type ImageDigest                                     = String
  type ImageUri                                        = String
  type InputDataConfig                                 = js.Array[Channel]
  type InputModes                                      = js.Array[TrainingInputMode]
  type IntegerParameterRanges                          = js.Array[IntegerParameterRange]
  type InvocationsMaxRetries                           = Int
  type InvocationsTimeoutInSeconds                     = Int
  type JobReferenceCode                                = String
  type JobReferenceCodeContains                        = String
  type JsonContentType                                 = String
  type JsonContentTypes                                = js.Array[JsonContentType]
  type JsonPath                                        = String
  type KmsKeyId                                        = String
  type LabelAttributeName                              = String
  type LabelCounter                                    = Int
  type LabelingJobAlgorithmSpecificationArn            = String
  type LabelingJobArn                                  = String
  type LabelingJobForWorkteamSummaryList               = js.Array[LabelingJobForWorkteamSummary]
  type LabelingJobName                                 = String
  type LabelingJobSummaryList                          = js.Array[LabelingJobSummary]
  type LambdaFunctionArn                               = String
  type LastModifiedTime                                = js.Date
  type ListTagsMaxResults                              = Int
  type ListTrialComponentKey256                        = js.Array[TrialComponentKey256]
  type MaxAutoMLJobRuntimeInSeconds                    = Int
  type MaxCandidates                                   = Int
  type MaxConcurrentTaskCount                          = Int
  type MaxConcurrentTransforms                         = Int
  type MaxHumanLabeledObjectCount                      = Int
  type MaxNumberOfTrainingJobs                         = Int
  type MaxParallelTrainingJobs                         = Int
  type MaxPayloadInMB                                  = Int
  type MaxPercentageOfInputDatasetLabeled              = Int
  type MaxResults                                      = Int
  type MaxRuntimeInSeconds                             = Int
  type MaxRuntimePerTrainingJobInSeconds               = Int
  type MaxWaitTimeInSeconds                            = Int
  type MediaType                                       = String
  type MemberDefinitions                               = js.Array[MemberDefinition]
  type MetricDefinitionList                            = js.Array[MetricDefinition]
  type MetricName                                      = String
  type MetricRegex                                     = String
  type MetricValue                                     = Float
  type ModelArn                                        = String
  type ModelName                                       = String
  type ModelNameContains                               = String
  type ModelPackageArn                                 = String
  type ModelPackageContainerDefinitionList             = js.Array[ModelPackageContainerDefinition]
  type ModelPackageStatusItemList                      = js.Array[ModelPackageStatusItem]
  type ModelPackageSummaryList                         = js.Array[ModelPackageSummary]
  type ModelPackageValidationProfiles                  = js.Array[ModelPackageValidationProfile]
  type ModelSummaryList                                = js.Array[ModelSummary]
  type MonitoringContainerArguments                    = js.Array[ContainerArgument]
  type MonitoringEnvironmentMap                        = js.Dictionary[ProcessingEnvironmentValue]
  type MonitoringExecutionSummaryList                  = js.Array[MonitoringExecutionSummary]
  type MonitoringInputs                                = js.Array[MonitoringInput]
  type MonitoringMaxRuntimeInSeconds                   = Int
  type MonitoringOutputs                               = js.Array[MonitoringOutput]
  type MonitoringS3Uri                                 = String
  type MonitoringScheduleArn                           = String
  type MonitoringScheduleName                          = String
  type MonitoringScheduleSummaryList                   = js.Array[MonitoringScheduleSummary]
  type NameContains                                    = String
  type NestedFiltersList                               = js.Array[NestedFilters]
  type NetworkInterfaceId                              = String
  type NextToken                                       = String
  type NotebookInstanceAcceleratorTypes                = js.Array[NotebookInstanceAcceleratorType]
  type NotebookInstanceArn                             = String
  type NotebookInstanceLifecycleConfigArn              = String
  type NotebookInstanceLifecycleConfigContent          = String
  type NotebookInstanceLifecycleConfigList             = js.Array[NotebookInstanceLifecycleHook]
  type NotebookInstanceLifecycleConfigName             = String
  type NotebookInstanceLifecycleConfigNameContains     = String
  type NotebookInstanceLifecycleConfigSummaryList      = js.Array[NotebookInstanceLifecycleConfigSummary]
  type NotebookInstanceName                            = String
  type NotebookInstanceNameContains                    = String
  type NotebookInstanceSummaryList                     = js.Array[NotebookInstanceSummary]
  type NotebookInstanceUrl                             = String
  type NotebookInstanceVolumeSizeInGB                  = Int
  type NotificationTopicArn                            = String
  type NumberOfHumanWorkersPerDataObject               = Int
  type ObjectiveStatusCounter                          = Int
  type OptionalDouble                                  = Double
  type OptionalInteger                                 = Int
  type OptionalVolumeSizeInGB                          = Int
  type PaginationToken                                 = String
  type ParameterKey                                    = String
  type ParameterName                                   = String
  type ParameterValue                                  = String
  type ParameterValues                                 = js.Array[ParameterValue]
  type ParentHyperParameterTuningJobs                  = js.Array[ParentHyperParameterTuningJob]
  type Parents                                         = js.Array[Parent]
  type PresignedDomainUrl                              = String
  type ProcessingEnvironmentKey                        = String
  type ProcessingEnvironmentMap                        = js.Dictionary[ProcessingEnvironmentValue]
  type ProcessingEnvironmentValue                      = String
  type ProcessingInputs                                = js.Array[ProcessingInput]
  type ProcessingInstanceCount                         = Int
  type ProcessingJobArn                                = String
  type ProcessingJobName                               = String
  type ProcessingJobSummaries                          = js.Array[ProcessingJobSummary]
  type ProcessingLocalPath                             = String
  type ProcessingMaxRuntimeInSeconds                   = Int
  type ProcessingOutputs                               = js.Array[ProcessingOutput]
  type ProcessingVolumeSizeInGB                        = Int
  type ProductId                                       = String
  type ProductListings                                 = js.Array[String]
  type ProductionVariantList                           = js.Array[ProductionVariant]
  type ProductionVariantSummaryList                    = js.Array[ProductionVariantSummary]
  type PropertyNameHint                                = String
  type PropertyNameSuggestionList                      = js.Array[PropertyNameSuggestion]
  type RealtimeInferenceInstanceTypes                  = js.Array[ProductionVariantInstanceType]
  type RenderingErrorList                              = js.Array[RenderingError]
  type ResourceArn                                     = String
  type ResourceId                                      = String
  type ResourcePropertyName                            = String
  type ResponseMIMEType                                = String
  type ResponseMIMETypes                               = js.Array[ResponseMIMEType]
  type RoleArn                                         = String
  type RuleConfigurationName                           = String
  type RuleParameters                                  = js.Dictionary[ConfigValue]
  type S3Uri                                           = String
  type SageMakerImageArn                               = String
  type SamplingPercentage                              = Int
  type ScheduleExpression                              = String
  type SearchExpressionList                            = js.Array[SearchExpression]
  type SearchResultsList                               = js.Array[SearchRecord]
  type SecondaryStatusTransitions                      = js.Array[SecondaryStatusTransition]
  type SecretArn                                       = String
  type SecurityGroupId                                 = String
  type SecurityGroupIds                                = js.Array[SecurityGroupId]
  type Seed                                            = Double
  type SessionExpirationDurationInSeconds              = Int
  type SingleSignOnUserIdentifier                      = String
  type SourceAlgorithmList                             = js.Array[SourceAlgorithm]
  type SourceType                                      = String
  type StatusDetails                                   = String
  type StatusMessage                                   = String
  type String1024                                      = String
  type String200                                       = String
  type String256                                       = String
  type StringParameterValue                            = String
  type SubnetId                                        = String
  type Subnets                                         = js.Array[SubnetId]
  type SubscribedWorkteams                             = js.Array[SubscribedWorkteam]
  type Success                                         = Boolean
  type TagKey                                          = String
  type TagKeyList                                      = js.Array[TagKey]
  type TagList                                         = js.Array[Tag]
  type TagValue                                        = String
  type TargetAttributeName                             = String
  type TargetObjectiveMetricValue                      = Float
  type TaskAvailabilityLifetimeInSeconds               = Int
  type TaskCount                                       = Int
  type TaskDescription                                 = String
  type TaskInput                                       = String
  type TaskKeyword                                     = String
  type TaskKeywords                                    = js.Array[TaskKeyword]
  type TaskTimeLimitInSeconds                          = Int
  type TaskTitle                                       = String
  type TemplateContent                                 = String
  type TemplateContentSha256                           = String
  type TemplateUrl                                     = String
  type TenthFractionsOfACent                           = Int
  type Timestamp                                       = js.Date
  type TrainingInstanceCount                           = Int
  type TrainingInstanceTypes                           = js.Array[TrainingInstanceType]
  type TrainingJobArn                                  = String
  type TrainingJobName                                 = String
  type TrainingJobStatusCounter                        = Int
  type TrainingJobSummaries                            = js.Array[TrainingJobSummary]
  type TrainingTimeInSeconds                           = Int
  type TransformEnvironmentKey                         = String
  type TransformEnvironmentMap                         = js.Dictionary[TransformEnvironmentValue]
  type TransformEnvironmentValue                       = String
  type TransformInstanceCount                          = Int
  type TransformInstanceTypes                          = js.Array[TransformInstanceType]
  type TransformJobArn                                 = String
  type TransformJobName                                = String
  type TransformJobSummaries                           = js.Array[TransformJobSummary]
  type TrialArn                                        = String
  type TrialComponentArn                               = String
  type TrialComponentArtifactValue                     = String
  type TrialComponentArtifacts                         = js.Dictionary[TrialComponentArtifact]
  type TrialComponentKey256                            = String
  type TrialComponentKey64                             = String
  type TrialComponentMetricSummaries                   = js.Array[TrialComponentMetricSummary]
  type TrialComponentParameters                        = js.Dictionary[TrialComponentParameterValue]
  type TrialComponentSimpleSummaries                   = js.Array[TrialComponentSimpleSummary]
  type TrialComponentSourceArn                         = String
  type TrialComponentStatusMessage                     = String
  type TrialComponentSummaries                         = js.Array[TrialComponentSummary]
  type TrialSourceArn                                  = String
  type TrialSummaries                                  = js.Array[TrialSummary]
  type Url                                             = String
  type UserProfileArn                                  = String
  type UserProfileList                                 = js.Array[UserProfileDetails]
  type UserProfileName                                 = String
  type VariantName                                     = String
  type VariantPropertyList                             = js.Array[VariantProperty]
  type VariantWeight                                   = Float
  type VolumeSizeInGB                                  = Int
  type VpcId                                           = String
  type VpcSecurityGroupIds                             = js.Array[SecurityGroupId]
  type WorkforceArn                                    = String
  type WorkforceName                                   = String
  type WorkteamArn                                     = String
  type WorkteamName                                    = String
  type Workteams                                       = js.Array[Workteam]

  implicit final class SageMakerOps(private val service: SageMaker) extends AnyVal {

    @inline def addTagsFuture(params: AddTagsInput): Future[AddTagsOutput] = service.addTags(params).promise().toFuture
    @inline def associateTrialComponentFuture(
        params: AssociateTrialComponentRequest
    ): Future[AssociateTrialComponentResponse] = service.associateTrialComponent(params).promise().toFuture
    @inline def createAlgorithmFuture(params: CreateAlgorithmInput): Future[CreateAlgorithmOutput] =
      service.createAlgorithm(params).promise().toFuture
    @inline def createAppFuture(params: CreateAppRequest): Future[CreateAppResponse] =
      service.createApp(params).promise().toFuture
    @inline def createAutoMLJobFuture(params: CreateAutoMLJobRequest): Future[CreateAutoMLJobResponse] =
      service.createAutoMLJob(params).promise().toFuture
    @inline def createCodeRepositoryFuture(params: CreateCodeRepositoryInput): Future[CreateCodeRepositoryOutput] =
      service.createCodeRepository(params).promise().toFuture
    @inline def createCompilationJobFuture(params: CreateCompilationJobRequest): Future[CreateCompilationJobResponse] =
      service.createCompilationJob(params).promise().toFuture
    @inline def createDomainFuture(params: CreateDomainRequest): Future[CreateDomainResponse] =
      service.createDomain(params).promise().toFuture
    @inline def createEndpointConfigFuture(params: CreateEndpointConfigInput): Future[CreateEndpointConfigOutput] =
      service.createEndpointConfig(params).promise().toFuture
    @inline def createEndpointFuture(params: CreateEndpointInput): Future[CreateEndpointOutput] =
      service.createEndpoint(params).promise().toFuture
    @inline def createExperimentFuture(params: CreateExperimentRequest): Future[CreateExperimentResponse] =
      service.createExperiment(params).promise().toFuture
    @inline def createFlowDefinitionFuture(params: CreateFlowDefinitionRequest): Future[CreateFlowDefinitionResponse] =
      service.createFlowDefinition(params).promise().toFuture
    @inline def createHumanTaskUiFuture(params: CreateHumanTaskUiRequest): Future[CreateHumanTaskUiResponse] =
      service.createHumanTaskUi(params).promise().toFuture
    @inline def createHyperParameterTuningJobFuture(
        params: CreateHyperParameterTuningJobRequest
    ): Future[CreateHyperParameterTuningJobResponse] = service.createHyperParameterTuningJob(params).promise().toFuture
    @inline def createLabelingJobFuture(params: CreateLabelingJobRequest): Future[CreateLabelingJobResponse] =
      service.createLabelingJob(params).promise().toFuture
    @inline def createModelFuture(params: CreateModelInput): Future[CreateModelOutput] =
      service.createModel(params).promise().toFuture
    @inline def createModelPackageFuture(params: CreateModelPackageInput): Future[CreateModelPackageOutput] =
      service.createModelPackage(params).promise().toFuture
    @inline def createMonitoringScheduleFuture(
        params: CreateMonitoringScheduleRequest
    ): Future[CreateMonitoringScheduleResponse] = service.createMonitoringSchedule(params).promise().toFuture
    @inline def createNotebookInstanceFuture(
        params: CreateNotebookInstanceInput
    ): Future[CreateNotebookInstanceOutput] = service.createNotebookInstance(params).promise().toFuture
    @inline def createNotebookInstanceLifecycleConfigFuture(
        params: CreateNotebookInstanceLifecycleConfigInput
    ): Future[CreateNotebookInstanceLifecycleConfigOutput] =
      service.createNotebookInstanceLifecycleConfig(params).promise().toFuture
    @inline def createPresignedDomainUrlFuture(
        params: CreatePresignedDomainUrlRequest
    ): Future[CreatePresignedDomainUrlResponse] = service.createPresignedDomainUrl(params).promise().toFuture
    @inline def createPresignedNotebookInstanceUrlFuture(
        params: CreatePresignedNotebookInstanceUrlInput
    ): Future[CreatePresignedNotebookInstanceUrlOutput] =
      service.createPresignedNotebookInstanceUrl(params).promise().toFuture
    @inline def createProcessingJobFuture(params: CreateProcessingJobRequest): Future[CreateProcessingJobResponse] =
      service.createProcessingJob(params).promise().toFuture
    @inline def createTrainingJobFuture(params: CreateTrainingJobRequest): Future[CreateTrainingJobResponse] =
      service.createTrainingJob(params).promise().toFuture
    @inline def createTransformJobFuture(params: CreateTransformJobRequest): Future[CreateTransformJobResponse] =
      service.createTransformJob(params).promise().toFuture
    @inline def createTrialComponentFuture(params: CreateTrialComponentRequest): Future[CreateTrialComponentResponse] =
      service.createTrialComponent(params).promise().toFuture
    @inline def createTrialFuture(params: CreateTrialRequest): Future[CreateTrialResponse] =
      service.createTrial(params).promise().toFuture
    @inline def createUserProfileFuture(params: CreateUserProfileRequest): Future[CreateUserProfileResponse] =
      service.createUserProfile(params).promise().toFuture
    @inline def createWorkteamFuture(params: CreateWorkteamRequest): Future[CreateWorkteamResponse] =
      service.createWorkteam(params).promise().toFuture
    @inline def deleteAlgorithmFuture(params: DeleteAlgorithmInput): Future[js.Object] =
      service.deleteAlgorithm(params).promise().toFuture
    @inline def deleteAppFuture(params: DeleteAppRequest): Future[js.Object] =
      service.deleteApp(params).promise().toFuture
    @inline def deleteCodeRepositoryFuture(params: DeleteCodeRepositoryInput): Future[js.Object] =
      service.deleteCodeRepository(params).promise().toFuture
    @inline def deleteDomainFuture(params: DeleteDomainRequest): Future[js.Object] =
      service.deleteDomain(params).promise().toFuture
    @inline def deleteEndpointConfigFuture(params: DeleteEndpointConfigInput): Future[js.Object] =
      service.deleteEndpointConfig(params).promise().toFuture
    @inline def deleteEndpointFuture(params: DeleteEndpointInput): Future[js.Object] =
      service.deleteEndpoint(params).promise().toFuture
    @inline def deleteExperimentFuture(params: DeleteExperimentRequest): Future[DeleteExperimentResponse] =
      service.deleteExperiment(params).promise().toFuture
    @inline def deleteFlowDefinitionFuture(params: DeleteFlowDefinitionRequest): Future[DeleteFlowDefinitionResponse] =
      service.deleteFlowDefinition(params).promise().toFuture
    @inline def deleteModelFuture(params: DeleteModelInput): Future[js.Object] =
      service.deleteModel(params).promise().toFuture
    @inline def deleteModelPackageFuture(params: DeleteModelPackageInput): Future[js.Object] =
      service.deleteModelPackage(params).promise().toFuture
    @inline def deleteMonitoringScheduleFuture(params: DeleteMonitoringScheduleRequest): Future[js.Object] =
      service.deleteMonitoringSchedule(params).promise().toFuture
    @inline def deleteNotebookInstanceFuture(params: DeleteNotebookInstanceInput): Future[js.Object] =
      service.deleteNotebookInstance(params).promise().toFuture
    @inline def deleteNotebookInstanceLifecycleConfigFuture(
        params: DeleteNotebookInstanceLifecycleConfigInput
    ): Future[js.Object] = service.deleteNotebookInstanceLifecycleConfig(params).promise().toFuture
    @inline def deleteTagsFuture(params: DeleteTagsInput): Future[DeleteTagsOutput] =
      service.deleteTags(params).promise().toFuture
    @inline def deleteTrialComponentFuture(params: DeleteTrialComponentRequest): Future[DeleteTrialComponentResponse] =
      service.deleteTrialComponent(params).promise().toFuture
    @inline def deleteTrialFuture(params: DeleteTrialRequest): Future[DeleteTrialResponse] =
      service.deleteTrial(params).promise().toFuture
    @inline def deleteUserProfileFuture(params: DeleteUserProfileRequest): Future[js.Object] =
      service.deleteUserProfile(params).promise().toFuture
    @inline def deleteWorkteamFuture(params: DeleteWorkteamRequest): Future[DeleteWorkteamResponse] =
      service.deleteWorkteam(params).promise().toFuture
    @inline def describeAlgorithmFuture(params: DescribeAlgorithmInput): Future[DescribeAlgorithmOutput] =
      service.describeAlgorithm(params).promise().toFuture
    @inline def describeAppFuture(params: DescribeAppRequest): Future[DescribeAppResponse] =
      service.describeApp(params).promise().toFuture
    @inline def describeAutoMLJobFuture(params: DescribeAutoMLJobRequest): Future[DescribeAutoMLJobResponse] =
      service.describeAutoMLJob(params).promise().toFuture
    @inline def describeCodeRepositoryFuture(
        params: DescribeCodeRepositoryInput
    ): Future[DescribeCodeRepositoryOutput] = service.describeCodeRepository(params).promise().toFuture
    @inline def describeCompilationJobFuture(
        params: DescribeCompilationJobRequest
    ): Future[DescribeCompilationJobResponse] = service.describeCompilationJob(params).promise().toFuture
    @inline def describeDomainFuture(params: DescribeDomainRequest): Future[DescribeDomainResponse] =
      service.describeDomain(params).promise().toFuture
    @inline def describeEndpointConfigFuture(
        params: DescribeEndpointConfigInput
    ): Future[DescribeEndpointConfigOutput] = service.describeEndpointConfig(params).promise().toFuture
    @inline def describeEndpointFuture(params: DescribeEndpointInput): Future[DescribeEndpointOutput] =
      service.describeEndpoint(params).promise().toFuture
    @inline def describeExperimentFuture(params: DescribeExperimentRequest): Future[DescribeExperimentResponse] =
      service.describeExperiment(params).promise().toFuture
    @inline def describeFlowDefinitionFuture(
        params: DescribeFlowDefinitionRequest
    ): Future[DescribeFlowDefinitionResponse] = service.describeFlowDefinition(params).promise().toFuture
    @inline def describeHumanTaskUiFuture(params: DescribeHumanTaskUiRequest): Future[DescribeHumanTaskUiResponse] =
      service.describeHumanTaskUi(params).promise().toFuture
    @inline def describeHyperParameterTuningJobFuture(
        params: DescribeHyperParameterTuningJobRequest
    ): Future[DescribeHyperParameterTuningJobResponse] =
      service.describeHyperParameterTuningJob(params).promise().toFuture
    @inline def describeLabelingJobFuture(params: DescribeLabelingJobRequest): Future[DescribeLabelingJobResponse] =
      service.describeLabelingJob(params).promise().toFuture
    @inline def describeModelFuture(params: DescribeModelInput): Future[DescribeModelOutput] =
      service.describeModel(params).promise().toFuture
    @inline def describeModelPackageFuture(params: DescribeModelPackageInput): Future[DescribeModelPackageOutput] =
      service.describeModelPackage(params).promise().toFuture
    @inline def describeMonitoringScheduleFuture(
        params: DescribeMonitoringScheduleRequest
    ): Future[DescribeMonitoringScheduleResponse] = service.describeMonitoringSchedule(params).promise().toFuture
    @inline def describeNotebookInstanceFuture(
        params: DescribeNotebookInstanceInput
    ): Future[DescribeNotebookInstanceOutput] = service.describeNotebookInstance(params).promise().toFuture
    @inline def describeNotebookInstanceLifecycleConfigFuture(
        params: DescribeNotebookInstanceLifecycleConfigInput
    ): Future[DescribeNotebookInstanceLifecycleConfigOutput] =
      service.describeNotebookInstanceLifecycleConfig(params).promise().toFuture
    @inline def describeProcessingJobFuture(
        params: DescribeProcessingJobRequest
    ): Future[DescribeProcessingJobResponse] = service.describeProcessingJob(params).promise().toFuture
    @inline def describeSubscribedWorkteamFuture(
        params: DescribeSubscribedWorkteamRequest
    ): Future[DescribeSubscribedWorkteamResponse] = service.describeSubscribedWorkteam(params).promise().toFuture
    @inline def describeTrainingJobFuture(params: DescribeTrainingJobRequest): Future[DescribeTrainingJobResponse] =
      service.describeTrainingJob(params).promise().toFuture
    @inline def describeTransformJobFuture(params: DescribeTransformJobRequest): Future[DescribeTransformJobResponse] =
      service.describeTransformJob(params).promise().toFuture
    @inline def describeTrialComponentFuture(
        params: DescribeTrialComponentRequest
    ): Future[DescribeTrialComponentResponse] = service.describeTrialComponent(params).promise().toFuture
    @inline def describeTrialFuture(params: DescribeTrialRequest): Future[DescribeTrialResponse] =
      service.describeTrial(params).promise().toFuture
    @inline def describeUserProfileFuture(params: DescribeUserProfileRequest): Future[DescribeUserProfileResponse] =
      service.describeUserProfile(params).promise().toFuture
    @inline def describeWorkforceFuture(params: DescribeWorkforceRequest): Future[DescribeWorkforceResponse] =
      service.describeWorkforce(params).promise().toFuture
    @inline def describeWorkteamFuture(params: DescribeWorkteamRequest): Future[DescribeWorkteamResponse] =
      service.describeWorkteam(params).promise().toFuture
    @inline def disassociateTrialComponentFuture(
        params: DisassociateTrialComponentRequest
    ): Future[DisassociateTrialComponentResponse] = service.disassociateTrialComponent(params).promise().toFuture
    @inline def getSearchSuggestionsFuture(params: GetSearchSuggestionsRequest): Future[GetSearchSuggestionsResponse] =
      service.getSearchSuggestions(params).promise().toFuture
    @inline def listAlgorithmsFuture(params: ListAlgorithmsInput): Future[ListAlgorithmsOutput] =
      service.listAlgorithms(params).promise().toFuture
    @inline def listAppsFuture(params: ListAppsRequest): Future[ListAppsResponse] =
      service.listApps(params).promise().toFuture
    @inline def listAutoMLJobsFuture(params: ListAutoMLJobsRequest): Future[ListAutoMLJobsResponse] =
      service.listAutoMLJobs(params).promise().toFuture
    @inline def listCandidatesForAutoMLJobFuture(
        params: ListCandidatesForAutoMLJobRequest
    ): Future[ListCandidatesForAutoMLJobResponse] = service.listCandidatesForAutoMLJob(params).promise().toFuture
    @inline def listCodeRepositoriesFuture(params: ListCodeRepositoriesInput): Future[ListCodeRepositoriesOutput] =
      service.listCodeRepositories(params).promise().toFuture
    @inline def listCompilationJobsFuture(params: ListCompilationJobsRequest): Future[ListCompilationJobsResponse] =
      service.listCompilationJobs(params).promise().toFuture
    @inline def listDomainsFuture(params: ListDomainsRequest): Future[ListDomainsResponse] =
      service.listDomains(params).promise().toFuture
    @inline def listEndpointConfigsFuture(params: ListEndpointConfigsInput): Future[ListEndpointConfigsOutput] =
      service.listEndpointConfigs(params).promise().toFuture
    @inline def listEndpointsFuture(params: ListEndpointsInput): Future[ListEndpointsOutput] =
      service.listEndpoints(params).promise().toFuture
    @inline def listExperimentsFuture(params: ListExperimentsRequest): Future[ListExperimentsResponse] =
      service.listExperiments(params).promise().toFuture
    @inline def listFlowDefinitionsFuture(params: ListFlowDefinitionsRequest): Future[ListFlowDefinitionsResponse] =
      service.listFlowDefinitions(params).promise().toFuture
    @inline def listHumanTaskUisFuture(params: ListHumanTaskUisRequest): Future[ListHumanTaskUisResponse] =
      service.listHumanTaskUis(params).promise().toFuture
    @inline def listHyperParameterTuningJobsFuture(
        params: ListHyperParameterTuningJobsRequest
    ): Future[ListHyperParameterTuningJobsResponse] = service.listHyperParameterTuningJobs(params).promise().toFuture
    @inline def listLabelingJobsForWorkteamFuture(
        params: ListLabelingJobsForWorkteamRequest
    ): Future[ListLabelingJobsForWorkteamResponse] = service.listLabelingJobsForWorkteam(params).promise().toFuture
    @inline def listLabelingJobsFuture(params: ListLabelingJobsRequest): Future[ListLabelingJobsResponse] =
      service.listLabelingJobs(params).promise().toFuture
    @inline def listModelPackagesFuture(params: ListModelPackagesInput): Future[ListModelPackagesOutput] =
      service.listModelPackages(params).promise().toFuture
    @inline def listModelsFuture(params: ListModelsInput): Future[ListModelsOutput] =
      service.listModels(params).promise().toFuture
    @inline def listMonitoringExecutionsFuture(
        params: ListMonitoringExecutionsRequest
    ): Future[ListMonitoringExecutionsResponse] = service.listMonitoringExecutions(params).promise().toFuture
    @inline def listMonitoringSchedulesFuture(
        params: ListMonitoringSchedulesRequest
    ): Future[ListMonitoringSchedulesResponse] = service.listMonitoringSchedules(params).promise().toFuture
    @inline def listNotebookInstanceLifecycleConfigsFuture(
        params: ListNotebookInstanceLifecycleConfigsInput
    ): Future[ListNotebookInstanceLifecycleConfigsOutput] =
      service.listNotebookInstanceLifecycleConfigs(params).promise().toFuture
    @inline def listNotebookInstancesFuture(params: ListNotebookInstancesInput): Future[ListNotebookInstancesOutput] =
      service.listNotebookInstances(params).promise().toFuture
    @inline def listProcessingJobsFuture(params: ListProcessingJobsRequest): Future[ListProcessingJobsResponse] =
      service.listProcessingJobs(params).promise().toFuture
    @inline def listSubscribedWorkteamsFuture(
        params: ListSubscribedWorkteamsRequest
    ): Future[ListSubscribedWorkteamsResponse] = service.listSubscribedWorkteams(params).promise().toFuture
    @inline def listTagsFuture(params: ListTagsInput): Future[ListTagsOutput] =
      service.listTags(params).promise().toFuture
    @inline def listTrainingJobsForHyperParameterTuningJobFuture(
        params: ListTrainingJobsForHyperParameterTuningJobRequest
    ): Future[ListTrainingJobsForHyperParameterTuningJobResponse] =
      service.listTrainingJobsForHyperParameterTuningJob(params).promise().toFuture
    @inline def listTrainingJobsFuture(params: ListTrainingJobsRequest): Future[ListTrainingJobsResponse] =
      service.listTrainingJobs(params).promise().toFuture
    @inline def listTransformJobsFuture(params: ListTransformJobsRequest): Future[ListTransformJobsResponse] =
      service.listTransformJobs(params).promise().toFuture
    @inline def listTrialComponentsFuture(params: ListTrialComponentsRequest): Future[ListTrialComponentsResponse] =
      service.listTrialComponents(params).promise().toFuture
    @inline def listTrialsFuture(params: ListTrialsRequest): Future[ListTrialsResponse] =
      service.listTrials(params).promise().toFuture
    @inline def listUserProfilesFuture(params: ListUserProfilesRequest): Future[ListUserProfilesResponse] =
      service.listUserProfiles(params).promise().toFuture
    @inline def listWorkteamsFuture(params: ListWorkteamsRequest): Future[ListWorkteamsResponse] =
      service.listWorkteams(params).promise().toFuture
    @inline def renderUiTemplateFuture(params: RenderUiTemplateRequest): Future[RenderUiTemplateResponse] =
      service.renderUiTemplate(params).promise().toFuture
    @inline def searchFuture(params: SearchRequest): Future[SearchResponse] = service.search(params).promise().toFuture
    @inline def startMonitoringScheduleFuture(params: StartMonitoringScheduleRequest): Future[js.Object] =
      service.startMonitoringSchedule(params).promise().toFuture
    @inline def startNotebookInstanceFuture(params: StartNotebookInstanceInput): Future[js.Object] =
      service.startNotebookInstance(params).promise().toFuture
    @inline def stopAutoMLJobFuture(params: StopAutoMLJobRequest): Future[js.Object] =
      service.stopAutoMLJob(params).promise().toFuture
    @inline def stopCompilationJobFuture(params: StopCompilationJobRequest): Future[js.Object] =
      service.stopCompilationJob(params).promise().toFuture
    @inline def stopHyperParameterTuningJobFuture(params: StopHyperParameterTuningJobRequest): Future[js.Object] =
      service.stopHyperParameterTuningJob(params).promise().toFuture
    @inline def stopLabelingJobFuture(params: StopLabelingJobRequest): Future[js.Object] =
      service.stopLabelingJob(params).promise().toFuture
    @inline def stopMonitoringScheduleFuture(params: StopMonitoringScheduleRequest): Future[js.Object] =
      service.stopMonitoringSchedule(params).promise().toFuture
    @inline def stopNotebookInstanceFuture(params: StopNotebookInstanceInput): Future[js.Object] =
      service.stopNotebookInstance(params).promise().toFuture
    @inline def stopProcessingJobFuture(params: StopProcessingJobRequest): Future[js.Object] =
      service.stopProcessingJob(params).promise().toFuture
    @inline def stopTrainingJobFuture(params: StopTrainingJobRequest): Future[js.Object] =
      service.stopTrainingJob(params).promise().toFuture
    @inline def stopTransformJobFuture(params: StopTransformJobRequest): Future[js.Object] =
      service.stopTransformJob(params).promise().toFuture
    @inline def updateCodeRepositoryFuture(params: UpdateCodeRepositoryInput): Future[UpdateCodeRepositoryOutput] =
      service.updateCodeRepository(params).promise().toFuture
    @inline def updateDomainFuture(params: UpdateDomainRequest): Future[UpdateDomainResponse] =
      service.updateDomain(params).promise().toFuture
    @inline def updateEndpointFuture(params: UpdateEndpointInput): Future[UpdateEndpointOutput] =
      service.updateEndpoint(params).promise().toFuture
    @inline def updateEndpointWeightsAndCapacitiesFuture(
        params: UpdateEndpointWeightsAndCapacitiesInput
    ): Future[UpdateEndpointWeightsAndCapacitiesOutput] =
      service.updateEndpointWeightsAndCapacities(params).promise().toFuture
    @inline def updateExperimentFuture(params: UpdateExperimentRequest): Future[UpdateExperimentResponse] =
      service.updateExperiment(params).promise().toFuture
    @inline def updateMonitoringScheduleFuture(
        params: UpdateMonitoringScheduleRequest
    ): Future[UpdateMonitoringScheduleResponse] = service.updateMonitoringSchedule(params).promise().toFuture
    @inline def updateNotebookInstanceFuture(
        params: UpdateNotebookInstanceInput
    ): Future[UpdateNotebookInstanceOutput] = service.updateNotebookInstance(params).promise().toFuture
    @inline def updateNotebookInstanceLifecycleConfigFuture(
        params: UpdateNotebookInstanceLifecycleConfigInput
    ): Future[UpdateNotebookInstanceLifecycleConfigOutput] =
      service.updateNotebookInstanceLifecycleConfig(params).promise().toFuture
    @inline def updateTrialComponentFuture(params: UpdateTrialComponentRequest): Future[UpdateTrialComponentResponse] =
      service.updateTrialComponent(params).promise().toFuture
    @inline def updateTrialFuture(params: UpdateTrialRequest): Future[UpdateTrialResponse] =
      service.updateTrial(params).promise().toFuture
    @inline def updateUserProfileFuture(params: UpdateUserProfileRequest): Future[UpdateUserProfileResponse] =
      service.updateUserProfile(params).promise().toFuture
    @inline def updateWorkforceFuture(params: UpdateWorkforceRequest): Future[UpdateWorkforceResponse] =
      service.updateWorkforce(params).promise().toFuture
    @inline def updateWorkteamFuture(params: UpdateWorkteamRequest): Future[UpdateWorkteamResponse] =
      service.updateWorkteam(params).promise().toFuture
  }
}

package sagemaker {
  @js.native
  @JSImport("aws-sdk", "SageMaker")
  class SageMaker() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTags(params: AddTagsInput): Request[AddTagsOutput] = js.native
    def associateTrialComponent(params: AssociateTrialComponentRequest): Request[AssociateTrialComponentResponse] =
      js.native
    def createAlgorithm(params: CreateAlgorithmInput): Request[CreateAlgorithmOutput]                    = js.native
    def createApp(params: CreateAppRequest): Request[CreateAppResponse]                                  = js.native
    def createAutoMLJob(params: CreateAutoMLJobRequest): Request[CreateAutoMLJobResponse]                = js.native
    def createCodeRepository(params: CreateCodeRepositoryInput): Request[CreateCodeRepositoryOutput]     = js.native
    def createCompilationJob(params: CreateCompilationJobRequest): Request[CreateCompilationJobResponse] = js.native
    def createDomain(params: CreateDomainRequest): Request[CreateDomainResponse]                         = js.native
    def createEndpoint(params: CreateEndpointInput): Request[CreateEndpointOutput]                       = js.native
    def createEndpointConfig(params: CreateEndpointConfigInput): Request[CreateEndpointConfigOutput]     = js.native
    def createExperiment(params: CreateExperimentRequest): Request[CreateExperimentResponse]             = js.native
    def createFlowDefinition(params: CreateFlowDefinitionRequest): Request[CreateFlowDefinitionResponse] = js.native
    def createHumanTaskUi(params: CreateHumanTaskUiRequest): Request[CreateHumanTaskUiResponse]          = js.native
    def createHyperParameterTuningJob(
        params: CreateHyperParameterTuningJobRequest
    ): Request[CreateHyperParameterTuningJobResponse]                                           = js.native
    def createLabelingJob(params: CreateLabelingJobRequest): Request[CreateLabelingJobResponse] = js.native
    def createModel(params: CreateModelInput): Request[CreateModelOutput]                       = js.native
    def createModelPackage(params: CreateModelPackageInput): Request[CreateModelPackageOutput]  = js.native
    def createMonitoringSchedule(params: CreateMonitoringScheduleRequest): Request[CreateMonitoringScheduleResponse] =
      js.native
    def createNotebookInstance(params: CreateNotebookInstanceInput): Request[CreateNotebookInstanceOutput] = js.native
    def createNotebookInstanceLifecycleConfig(
        params: CreateNotebookInstanceLifecycleConfigInput
    ): Request[CreateNotebookInstanceLifecycleConfigOutput] = js.native
    def createPresignedDomainUrl(params: CreatePresignedDomainUrlRequest): Request[CreatePresignedDomainUrlResponse] =
      js.native
    def createPresignedNotebookInstanceUrl(
        params: CreatePresignedNotebookInstanceUrlInput
    ): Request[CreatePresignedNotebookInstanceUrlOutput]                                                 = js.native
    def createProcessingJob(params: CreateProcessingJobRequest): Request[CreateProcessingJobResponse]    = js.native
    def createTrainingJob(params: CreateTrainingJobRequest): Request[CreateTrainingJobResponse]          = js.native
    def createTransformJob(params: CreateTransformJobRequest): Request[CreateTransformJobResponse]       = js.native
    def createTrial(params: CreateTrialRequest): Request[CreateTrialResponse]                            = js.native
    def createTrialComponent(params: CreateTrialComponentRequest): Request[CreateTrialComponentResponse] = js.native
    def createUserProfile(params: CreateUserProfileRequest): Request[CreateUserProfileResponse]          = js.native
    def createWorkteam(params: CreateWorkteamRequest): Request[CreateWorkteamResponse]                   = js.native
    def deleteAlgorithm(params: DeleteAlgorithmInput): Request[js.Object]                                = js.native
    def deleteApp(params: DeleteAppRequest): Request[js.Object]                                          = js.native
    def deleteCodeRepository(params: DeleteCodeRepositoryInput): Request[js.Object]                      = js.native
    def deleteDomain(params: DeleteDomainRequest): Request[js.Object]                                    = js.native
    def deleteEndpoint(params: DeleteEndpointInput): Request[js.Object]                                  = js.native
    def deleteEndpointConfig(params: DeleteEndpointConfigInput): Request[js.Object]                      = js.native
    def deleteExperiment(params: DeleteExperimentRequest): Request[DeleteExperimentResponse]             = js.native
    def deleteFlowDefinition(params: DeleteFlowDefinitionRequest): Request[DeleteFlowDefinitionResponse] = js.native
    def deleteModel(params: DeleteModelInput): Request[js.Object]                                        = js.native
    def deleteModelPackage(params: DeleteModelPackageInput): Request[js.Object]                          = js.native
    def deleteMonitoringSchedule(params: DeleteMonitoringScheduleRequest): Request[js.Object]            = js.native
    def deleteNotebookInstance(params: DeleteNotebookInstanceInput): Request[js.Object]                  = js.native
    def deleteNotebookInstanceLifecycleConfig(params: DeleteNotebookInstanceLifecycleConfigInput): Request[js.Object] =
      js.native
    def deleteTags(params: DeleteTagsInput): Request[DeleteTagsOutput]                                     = js.native
    def deleteTrial(params: DeleteTrialRequest): Request[DeleteTrialResponse]                              = js.native
    def deleteTrialComponent(params: DeleteTrialComponentRequest): Request[DeleteTrialComponentResponse]   = js.native
    def deleteUserProfile(params: DeleteUserProfileRequest): Request[js.Object]                            = js.native
    def deleteWorkteam(params: DeleteWorkteamRequest): Request[DeleteWorkteamResponse]                     = js.native
    def describeAlgorithm(params: DescribeAlgorithmInput): Request[DescribeAlgorithmOutput]                = js.native
    def describeApp(params: DescribeAppRequest): Request[DescribeAppResponse]                              = js.native
    def describeAutoMLJob(params: DescribeAutoMLJobRequest): Request[DescribeAutoMLJobResponse]            = js.native
    def describeCodeRepository(params: DescribeCodeRepositoryInput): Request[DescribeCodeRepositoryOutput] = js.native
    def describeCompilationJob(params: DescribeCompilationJobRequest): Request[DescribeCompilationJobResponse] =
      js.native
    def describeDomain(params: DescribeDomainRequest): Request[DescribeDomainResponse]                     = js.native
    def describeEndpoint(params: DescribeEndpointInput): Request[DescribeEndpointOutput]                   = js.native
    def describeEndpointConfig(params: DescribeEndpointConfigInput): Request[DescribeEndpointConfigOutput] = js.native
    def describeExperiment(params: DescribeExperimentRequest): Request[DescribeExperimentResponse]         = js.native
    def describeFlowDefinition(params: DescribeFlowDefinitionRequest): Request[DescribeFlowDefinitionResponse] =
      js.native
    def describeHumanTaskUi(params: DescribeHumanTaskUiRequest): Request[DescribeHumanTaskUiResponse] = js.native
    def describeHyperParameterTuningJob(
        params: DescribeHyperParameterTuningJobRequest
    ): Request[DescribeHyperParameterTuningJobResponse]                                               = js.native
    def describeLabelingJob(params: DescribeLabelingJobRequest): Request[DescribeLabelingJobResponse] = js.native
    def describeModel(params: DescribeModelInput): Request[DescribeModelOutput]                       = js.native
    def describeModelPackage(params: DescribeModelPackageInput): Request[DescribeModelPackageOutput]  = js.native
    def describeMonitoringSchedule(
        params: DescribeMonitoringScheduleRequest
    ): Request[DescribeMonitoringScheduleResponse] = js.native
    def describeNotebookInstance(params: DescribeNotebookInstanceInput): Request[DescribeNotebookInstanceOutput] =
      js.native
    def describeNotebookInstanceLifecycleConfig(
        params: DescribeNotebookInstanceLifecycleConfigInput
    ): Request[DescribeNotebookInstanceLifecycleConfigOutput]                                               = js.native
    def describeProcessingJob(params: DescribeProcessingJobRequest): Request[DescribeProcessingJobResponse] = js.native
    def describeSubscribedWorkteam(
        params: DescribeSubscribedWorkteamRequest
    ): Request[DescribeSubscribedWorkteamResponse]                                                       = js.native
    def describeTrainingJob(params: DescribeTrainingJobRequest): Request[DescribeTrainingJobResponse]    = js.native
    def describeTransformJob(params: DescribeTransformJobRequest): Request[DescribeTransformJobResponse] = js.native
    def describeTrial(params: DescribeTrialRequest): Request[DescribeTrialResponse]                      = js.native
    def describeTrialComponent(params: DescribeTrialComponentRequest): Request[DescribeTrialComponentResponse] =
      js.native
    def describeUserProfile(params: DescribeUserProfileRequest): Request[DescribeUserProfileResponse] = js.native
    def describeWorkforce(params: DescribeWorkforceRequest): Request[DescribeWorkforceResponse]       = js.native
    def describeWorkteam(params: DescribeWorkteamRequest): Request[DescribeWorkteamResponse]          = js.native
    def disassociateTrialComponent(
        params: DisassociateTrialComponentRequest
    ): Request[DisassociateTrialComponentResponse]                                                       = js.native
    def getSearchSuggestions(params: GetSearchSuggestionsRequest): Request[GetSearchSuggestionsResponse] = js.native
    def listAlgorithms(params: ListAlgorithmsInput): Request[ListAlgorithmsOutput]                       = js.native
    def listApps(params: ListAppsRequest): Request[ListAppsResponse]                                     = js.native
    def listAutoMLJobs(params: ListAutoMLJobsRequest): Request[ListAutoMLJobsResponse]                   = js.native
    def listCandidatesForAutoMLJob(
        params: ListCandidatesForAutoMLJobRequest
    ): Request[ListCandidatesForAutoMLJobResponse]                                                    = js.native
    def listCodeRepositories(params: ListCodeRepositoriesInput): Request[ListCodeRepositoriesOutput]  = js.native
    def listCompilationJobs(params: ListCompilationJobsRequest): Request[ListCompilationJobsResponse] = js.native
    def listDomains(params: ListDomainsRequest): Request[ListDomainsResponse]                         = js.native
    def listEndpointConfigs(params: ListEndpointConfigsInput): Request[ListEndpointConfigsOutput]     = js.native
    def listEndpoints(params: ListEndpointsInput): Request[ListEndpointsOutput]                       = js.native
    def listExperiments(params: ListExperimentsRequest): Request[ListExperimentsResponse]             = js.native
    def listFlowDefinitions(params: ListFlowDefinitionsRequest): Request[ListFlowDefinitionsResponse] = js.native
    def listHumanTaskUis(params: ListHumanTaskUisRequest): Request[ListHumanTaskUisResponse]          = js.native
    def listHyperParameterTuningJobs(
        params: ListHyperParameterTuningJobsRequest
    ): Request[ListHyperParameterTuningJobsResponse]                                         = js.native
    def listLabelingJobs(params: ListLabelingJobsRequest): Request[ListLabelingJobsResponse] = js.native
    def listLabelingJobsForWorkteam(
        params: ListLabelingJobsForWorkteamRequest
    ): Request[ListLabelingJobsForWorkteamResponse]                                         = js.native
    def listModelPackages(params: ListModelPackagesInput): Request[ListModelPackagesOutput] = js.native
    def listModels(params: ListModelsInput): Request[ListModelsOutput]                      = js.native
    def listMonitoringExecutions(params: ListMonitoringExecutionsRequest): Request[ListMonitoringExecutionsResponse] =
      js.native
    def listMonitoringSchedules(params: ListMonitoringSchedulesRequest): Request[ListMonitoringSchedulesResponse] =
      js.native
    def listNotebookInstanceLifecycleConfigs(
        params: ListNotebookInstanceLifecycleConfigsInput
    ): Request[ListNotebookInstanceLifecycleConfigsOutput]                                              = js.native
    def listNotebookInstances(params: ListNotebookInstancesInput): Request[ListNotebookInstancesOutput] = js.native
    def listProcessingJobs(params: ListProcessingJobsRequest): Request[ListProcessingJobsResponse]      = js.native
    def listSubscribedWorkteams(params: ListSubscribedWorkteamsRequest): Request[ListSubscribedWorkteamsResponse] =
      js.native
    def listTags(params: ListTagsInput): Request[ListTagsOutput]                             = js.native
    def listTrainingJobs(params: ListTrainingJobsRequest): Request[ListTrainingJobsResponse] = js.native
    def listTrainingJobsForHyperParameterTuningJob(
        params: ListTrainingJobsForHyperParameterTuningJobRequest
    ): Request[ListTrainingJobsForHyperParameterTuningJobResponse]                                    = js.native
    def listTransformJobs(params: ListTransformJobsRequest): Request[ListTransformJobsResponse]       = js.native
    def listTrialComponents(params: ListTrialComponentsRequest): Request[ListTrialComponentsResponse] = js.native
    def listTrials(params: ListTrialsRequest): Request[ListTrialsResponse]                            = js.native
    def listUserProfiles(params: ListUserProfilesRequest): Request[ListUserProfilesResponse]          = js.native
    def listWorkteams(params: ListWorkteamsRequest): Request[ListWorkteamsResponse]                   = js.native
    def renderUiTemplate(params: RenderUiTemplateRequest): Request[RenderUiTemplateResponse]          = js.native
    def search(params: SearchRequest): Request[SearchResponse]                                        = js.native
    def startMonitoringSchedule(params: StartMonitoringScheduleRequest): Request[js.Object]           = js.native
    def startNotebookInstance(params: StartNotebookInstanceInput): Request[js.Object]                 = js.native
    def stopAutoMLJob(params: StopAutoMLJobRequest): Request[js.Object]                               = js.native
    def stopCompilationJob(params: StopCompilationJobRequest): Request[js.Object]                     = js.native
    def stopHyperParameterTuningJob(params: StopHyperParameterTuningJobRequest): Request[js.Object]   = js.native
    def stopLabelingJob(params: StopLabelingJobRequest): Request[js.Object]                           = js.native
    def stopMonitoringSchedule(params: StopMonitoringScheduleRequest): Request[js.Object]             = js.native
    def stopNotebookInstance(params: StopNotebookInstanceInput): Request[js.Object]                   = js.native
    def stopProcessingJob(params: StopProcessingJobRequest): Request[js.Object]                       = js.native
    def stopTrainingJob(params: StopTrainingJobRequest): Request[js.Object]                           = js.native
    def stopTransformJob(params: StopTransformJobRequest): Request[js.Object]                         = js.native
    def updateCodeRepository(params: UpdateCodeRepositoryInput): Request[UpdateCodeRepositoryOutput]  = js.native
    def updateDomain(params: UpdateDomainRequest): Request[UpdateDomainResponse]                      = js.native
    def updateEndpoint(params: UpdateEndpointInput): Request[UpdateEndpointOutput]                    = js.native
    def updateEndpointWeightsAndCapacities(
        params: UpdateEndpointWeightsAndCapacitiesInput
    ): Request[UpdateEndpointWeightsAndCapacitiesOutput]                                     = js.native
    def updateExperiment(params: UpdateExperimentRequest): Request[UpdateExperimentResponse] = js.native
    def updateMonitoringSchedule(params: UpdateMonitoringScheduleRequest): Request[UpdateMonitoringScheduleResponse] =
      js.native
    def updateNotebookInstance(params: UpdateNotebookInstanceInput): Request[UpdateNotebookInstanceOutput] = js.native
    def updateNotebookInstanceLifecycleConfig(
        params: UpdateNotebookInstanceLifecycleConfigInput
    ): Request[UpdateNotebookInstanceLifecycleConfigOutput]                                              = js.native
    def updateTrial(params: UpdateTrialRequest): Request[UpdateTrialResponse]                            = js.native
    def updateTrialComponent(params: UpdateTrialComponentRequest): Request[UpdateTrialComponentResponse] = js.native
    def updateUserProfile(params: UpdateUserProfileRequest): Request[UpdateUserProfileResponse]          = js.native
    def updateWorkforce(params: UpdateWorkforceRequest): Request[UpdateWorkforceResponse]                = js.native
    def updateWorkteam(params: UpdateWorkteamRequest): Request[UpdateWorkteamResponse]                   = js.native
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

  @js.native
  sealed trait AlgorithmSortBy extends js.Any
  object AlgorithmSortBy extends js.Object {
    val Name         = "Name".asInstanceOf[AlgorithmSortBy]
    val CreationTime = "CreationTime".asInstanceOf[AlgorithmSortBy]

    val values = js.Object.freeze(js.Array(Name, CreationTime))
  }

  /**
    * Specifies the training algorithm to use in a <a>CreateTrainingJob</a> request.
    *  For more information about algorithms provided by Amazon SageMaker, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html|Algorithms]]. For information about using your own algorithms, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html|Using Your Own Algorithms with Amazon SageMaker]].
    */
  @js.native
  trait AlgorithmSpecification extends js.Object {
    var TrainingInputMode: TrainingInputMode
    var AlgorithmName: js.UndefOr[ArnOrName]
    var EnableSageMakerMetricsTimeSeries: js.UndefOr[Boolean]
    var MetricDefinitions: js.UndefOr[MetricDefinitionList]
    var TrainingImage: js.UndefOr[AlgorithmImage]
  }

  object AlgorithmSpecification {
    @inline
    def apply(
        TrainingInputMode: TrainingInputMode,
        AlgorithmName: js.UndefOr[ArnOrName] = js.undefined,
        EnableSageMakerMetricsTimeSeries: js.UndefOr[Boolean] = js.undefined,
        MetricDefinitions: js.UndefOr[MetricDefinitionList] = js.undefined,
        TrainingImage: js.UndefOr[AlgorithmImage] = js.undefined
    ): AlgorithmSpecification = {
      val __obj = js.Dynamic.literal(
        "TrainingInputMode" -> TrainingInputMode.asInstanceOf[js.Any]
      )

      AlgorithmName.foreach(__v => __obj.updateDynamic("AlgorithmName")(__v.asInstanceOf[js.Any]))
      EnableSageMakerMetricsTimeSeries.foreach(__v =>
        __obj.updateDynamic("EnableSageMakerMetricsTimeSeries")(__v.asInstanceOf[js.Any])
      )
      MetricDefinitions.foreach(__v => __obj.updateDynamic("MetricDefinitions")(__v.asInstanceOf[js.Any]))
      TrainingImage.foreach(__v => __obj.updateDynamic("TrainingImage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlgorithmSpecification]
    }
  }

  @js.native
  sealed trait AlgorithmStatus extends js.Any
  object AlgorithmStatus extends js.Object {
    val Pending    = "Pending".asInstanceOf[AlgorithmStatus]
    val InProgress = "InProgress".asInstanceOf[AlgorithmStatus]
    val Completed  = "Completed".asInstanceOf[AlgorithmStatus]
    val Failed     = "Failed".asInstanceOf[AlgorithmStatus]
    val Deleting   = "Deleting".asInstanceOf[AlgorithmStatus]

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

  /**
    * The app's details.
    */
  @js.native
  trait AppDetails extends js.Object {
    var AppName: js.UndefOr[AppName]
    var AppType: js.UndefOr[AppType]
    var CreationTime: js.UndefOr[CreationTime]
    var DomainId: js.UndefOr[DomainId]
    var Status: js.UndefOr[AppStatus]
    var UserProfileName: js.UndefOr[UserProfileName]
  }

  object AppDetails {
    @inline
    def apply(
        AppName: js.UndefOr[AppName] = js.undefined,
        AppType: js.UndefOr[AppType] = js.undefined,
        CreationTime: js.UndefOr[CreationTime] = js.undefined,
        DomainId: js.UndefOr[DomainId] = js.undefined,
        Status: js.UndefOr[AppStatus] = js.undefined,
        UserProfileName: js.UndefOr[UserProfileName] = js.undefined
    ): AppDetails = {
      val __obj = js.Dynamic.literal()
      AppName.foreach(__v => __obj.updateDynamic("AppName")(__v.asInstanceOf[js.Any]))
      AppType.foreach(__v => __obj.updateDynamic("AppType")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DomainId.foreach(__v => __obj.updateDynamic("DomainId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UserProfileName.foreach(__v => __obj.updateDynamic("UserProfileName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppDetails]
    }
  }

  @js.native
  sealed trait AppInstanceType extends js.Any
  object AppInstanceType extends js.Object {
    val system             = "system".asInstanceOf[AppInstanceType]
    val `ml.t3.micro`      = "ml.t3.micro".asInstanceOf[AppInstanceType]
    val `ml.t3.small`      = "ml.t3.small".asInstanceOf[AppInstanceType]
    val `ml.t3.medium`     = "ml.t3.medium".asInstanceOf[AppInstanceType]
    val `ml.t3.large`      = "ml.t3.large".asInstanceOf[AppInstanceType]
    val `ml.t3.xlarge`     = "ml.t3.xlarge".asInstanceOf[AppInstanceType]
    val `ml.t3.2xlarge`    = "ml.t3.2xlarge".asInstanceOf[AppInstanceType]
    val `ml.m5.large`      = "ml.m5.large".asInstanceOf[AppInstanceType]
    val `ml.m5.xlarge`     = "ml.m5.xlarge".asInstanceOf[AppInstanceType]
    val `ml.m5.2xlarge`    = "ml.m5.2xlarge".asInstanceOf[AppInstanceType]
    val `ml.m5.4xlarge`    = "ml.m5.4xlarge".asInstanceOf[AppInstanceType]
    val `ml.m5.8xlarge`    = "ml.m5.8xlarge".asInstanceOf[AppInstanceType]
    val `ml.m5.12xlarge`   = "ml.m5.12xlarge".asInstanceOf[AppInstanceType]
    val `ml.m5.16xlarge`   = "ml.m5.16xlarge".asInstanceOf[AppInstanceType]
    val `ml.m5.24xlarge`   = "ml.m5.24xlarge".asInstanceOf[AppInstanceType]
    val `ml.c5.large`      = "ml.c5.large".asInstanceOf[AppInstanceType]
    val `ml.c5.xlarge`     = "ml.c5.xlarge".asInstanceOf[AppInstanceType]
    val `ml.c5.2xlarge`    = "ml.c5.2xlarge".asInstanceOf[AppInstanceType]
    val `ml.c5.4xlarge`    = "ml.c5.4xlarge".asInstanceOf[AppInstanceType]
    val `ml.c5.9xlarge`    = "ml.c5.9xlarge".asInstanceOf[AppInstanceType]
    val `ml.c5.12xlarge`   = "ml.c5.12xlarge".asInstanceOf[AppInstanceType]
    val `ml.c5.18xlarge`   = "ml.c5.18xlarge".asInstanceOf[AppInstanceType]
    val `ml.c5.24xlarge`   = "ml.c5.24xlarge".asInstanceOf[AppInstanceType]
    val `ml.p3.2xlarge`    = "ml.p3.2xlarge".asInstanceOf[AppInstanceType]
    val `ml.p3.8xlarge`    = "ml.p3.8xlarge".asInstanceOf[AppInstanceType]
    val `ml.p3.16xlarge`   = "ml.p3.16xlarge".asInstanceOf[AppInstanceType]
    val `ml.g4dn.xlarge`   = "ml.g4dn.xlarge".asInstanceOf[AppInstanceType]
    val `ml.g4dn.2xlarge`  = "ml.g4dn.2xlarge".asInstanceOf[AppInstanceType]
    val `ml.g4dn.4xlarge`  = "ml.g4dn.4xlarge".asInstanceOf[AppInstanceType]
    val `ml.g4dn.8xlarge`  = "ml.g4dn.8xlarge".asInstanceOf[AppInstanceType]
    val `ml.g4dn.12xlarge` = "ml.g4dn.12xlarge".asInstanceOf[AppInstanceType]
    val `ml.g4dn.16xlarge` = "ml.g4dn.16xlarge".asInstanceOf[AppInstanceType]

    val values = js.Object.freeze(
      js.Array(
        system,
        `ml.t3.micro`,
        `ml.t3.small`,
        `ml.t3.medium`,
        `ml.t3.large`,
        `ml.t3.xlarge`,
        `ml.t3.2xlarge`,
        `ml.m5.large`,
        `ml.m5.xlarge`,
        `ml.m5.2xlarge`,
        `ml.m5.4xlarge`,
        `ml.m5.8xlarge`,
        `ml.m5.12xlarge`,
        `ml.m5.16xlarge`,
        `ml.m5.24xlarge`,
        `ml.c5.large`,
        `ml.c5.xlarge`,
        `ml.c5.2xlarge`,
        `ml.c5.4xlarge`,
        `ml.c5.9xlarge`,
        `ml.c5.12xlarge`,
        `ml.c5.18xlarge`,
        `ml.c5.24xlarge`,
        `ml.p3.2xlarge`,
        `ml.p3.8xlarge`,
        `ml.p3.16xlarge`,
        `ml.g4dn.xlarge`,
        `ml.g4dn.2xlarge`,
        `ml.g4dn.4xlarge`,
        `ml.g4dn.8xlarge`,
        `ml.g4dn.12xlarge`,
        `ml.g4dn.16xlarge`
      )
    )
  }

  @js.native
  sealed trait AppSortKey extends js.Any
  object AppSortKey extends js.Object {
    val CreationTime = "CreationTime".asInstanceOf[AppSortKey]

    val values = js.Object.freeze(js.Array(CreationTime))
  }

  /**
    * Configuration to run a processing job in a specified container image.
    */
  @js.native
  trait AppSpecification extends js.Object {
    var ImageUri: ImageUri
    var ContainerArguments: js.UndefOr[ContainerArguments]
    var ContainerEntrypoint: js.UndefOr[ContainerEntrypoint]
  }

  object AppSpecification {
    @inline
    def apply(
        ImageUri: ImageUri,
        ContainerArguments: js.UndefOr[ContainerArguments] = js.undefined,
        ContainerEntrypoint: js.UndefOr[ContainerEntrypoint] = js.undefined
    ): AppSpecification = {
      val __obj = js.Dynamic.literal(
        "ImageUri" -> ImageUri.asInstanceOf[js.Any]
      )

      ContainerArguments.foreach(__v => __obj.updateDynamic("ContainerArguments")(__v.asInstanceOf[js.Any]))
      ContainerEntrypoint.foreach(__v => __obj.updateDynamic("ContainerEntrypoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppSpecification]
    }
  }

  @js.native
  sealed trait AppStatus extends js.Any
  object AppStatus extends js.Object {
    val Deleted   = "Deleted".asInstanceOf[AppStatus]
    val Deleting  = "Deleting".asInstanceOf[AppStatus]
    val Failed    = "Failed".asInstanceOf[AppStatus]
    val InService = "InService".asInstanceOf[AppStatus]
    val Pending   = "Pending".asInstanceOf[AppStatus]

    val values = js.Object.freeze(js.Array(Deleted, Deleting, Failed, InService, Pending))
  }

  @js.native
  sealed trait AppType extends js.Any
  object AppType extends js.Object {
    val JupyterServer = "JupyterServer".asInstanceOf[AppType]
    val KernelGateway = "KernelGateway".asInstanceOf[AppType]
    val TensorBoard   = "TensorBoard".asInstanceOf[AppType]

    val values = js.Object.freeze(js.Array(JupyterServer, KernelGateway, TensorBoard))
  }

  @js.native
  sealed trait AssemblyType extends js.Any
  object AssemblyType extends js.Object {
    val None = "None".asInstanceOf[AssemblyType]
    val Line = "Line".asInstanceOf[AssemblyType]

    val values = js.Object.freeze(js.Array(None, Line))
  }

  @js.native
  trait AssociateTrialComponentRequest extends js.Object {
    var TrialComponentName: ExperimentEntityName
    var TrialName: ExperimentEntityName
  }

  object AssociateTrialComponentRequest {
    @inline
    def apply(
        TrialComponentName: ExperimentEntityName,
        TrialName: ExperimentEntityName
    ): AssociateTrialComponentRequest = {
      val __obj = js.Dynamic.literal(
        "TrialComponentName" -> TrialComponentName.asInstanceOf[js.Any],
        "TrialName"          -> TrialName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateTrialComponentRequest]
    }
  }

  @js.native
  trait AssociateTrialComponentResponse extends js.Object {
    var TrialArn: js.UndefOr[TrialArn]
    var TrialComponentArn: js.UndefOr[TrialComponentArn]
  }

  object AssociateTrialComponentResponse {
    @inline
    def apply(
        TrialArn: js.UndefOr[TrialArn] = js.undefined,
        TrialComponentArn: js.UndefOr[TrialComponentArn] = js.undefined
    ): AssociateTrialComponentResponse = {
      val __obj = js.Dynamic.literal()
      TrialArn.foreach(__v => __obj.updateDynamic("TrialArn")(__v.asInstanceOf[js.Any]))
      TrialComponentArn.foreach(__v => __obj.updateDynamic("TrialComponentArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateTrialComponentResponse]
    }
  }

  @js.native
  sealed trait AuthMode extends js.Any
  object AuthMode extends js.Object {
    val SSO = "SSO".asInstanceOf[AuthMode]
    val IAM = "IAM".asInstanceOf[AuthMode]

    val values = js.Object.freeze(js.Array(SSO, IAM))
  }

  /**
    * An AutoPilot job will return recommendations, or candidates. Each candidate has futher details about the steps involed, and the status.
    */
  @js.native
  trait AutoMLCandidate extends js.Object {
    var CandidateName: CandidateName
    var CandidateStatus: CandidateStatus
    var CandidateSteps: CandidateSteps
    var CreationTime: Timestamp
    var LastModifiedTime: Timestamp
    var ObjectiveStatus: ObjectiveStatus
    var EndTime: js.UndefOr[Timestamp]
    var FailureReason: js.UndefOr[AutoMLFailureReason]
    var FinalAutoMLJobObjectiveMetric: js.UndefOr[FinalAutoMLJobObjectiveMetric]
    var InferenceContainers: js.UndefOr[AutoMLContainerDefinitions]
  }

  object AutoMLCandidate {
    @inline
    def apply(
        CandidateName: CandidateName,
        CandidateStatus: CandidateStatus,
        CandidateSteps: CandidateSteps,
        CreationTime: Timestamp,
        LastModifiedTime: Timestamp,
        ObjectiveStatus: ObjectiveStatus,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        FailureReason: js.UndefOr[AutoMLFailureReason] = js.undefined,
        FinalAutoMLJobObjectiveMetric: js.UndefOr[FinalAutoMLJobObjectiveMetric] = js.undefined,
        InferenceContainers: js.UndefOr[AutoMLContainerDefinitions] = js.undefined
    ): AutoMLCandidate = {
      val __obj = js.Dynamic.literal(
        "CandidateName"    -> CandidateName.asInstanceOf[js.Any],
        "CandidateStatus"  -> CandidateStatus.asInstanceOf[js.Any],
        "CandidateSteps"   -> CandidateSteps.asInstanceOf[js.Any],
        "CreationTime"     -> CreationTime.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "ObjectiveStatus"  -> ObjectiveStatus.asInstanceOf[js.Any]
      )

      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      FinalAutoMLJobObjectiveMetric.foreach(__v =>
        __obj.updateDynamic("FinalAutoMLJobObjectiveMetric")(__v.asInstanceOf[js.Any])
      )
      InferenceContainers.foreach(__v => __obj.updateDynamic("InferenceContainers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoMLCandidate]
    }
  }

  /**
    * Information about the steps for a Candidate, and what step it is working on.
    */
  @js.native
  trait AutoMLCandidateStep extends js.Object {
    var CandidateStepArn: CandidateStepArn
    var CandidateStepName: CandidateStepName
    var CandidateStepType: CandidateStepType
  }

  object AutoMLCandidateStep {
    @inline
    def apply(
        CandidateStepArn: CandidateStepArn,
        CandidateStepName: CandidateStepName,
        CandidateStepType: CandidateStepType
    ): AutoMLCandidateStep = {
      val __obj = js.Dynamic.literal(
        "CandidateStepArn"  -> CandidateStepArn.asInstanceOf[js.Any],
        "CandidateStepName" -> CandidateStepName.asInstanceOf[js.Any],
        "CandidateStepType" -> CandidateStepType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AutoMLCandidateStep]
    }
  }

  /**
    * Similar to Channel. A channel is a named input source that training algorithms can consume. Refer to Channel for detailed descriptions.
    */
  @js.native
  trait AutoMLChannel extends js.Object {
    var DataSource: AutoMLDataSource
    var TargetAttributeName: TargetAttributeName
    var CompressionType: js.UndefOr[CompressionType]
  }

  object AutoMLChannel {
    @inline
    def apply(
        DataSource: AutoMLDataSource,
        TargetAttributeName: TargetAttributeName,
        CompressionType: js.UndefOr[CompressionType] = js.undefined
    ): AutoMLChannel = {
      val __obj = js.Dynamic.literal(
        "DataSource"          -> DataSource.asInstanceOf[js.Any],
        "TargetAttributeName" -> TargetAttributeName.asInstanceOf[js.Any]
      )

      CompressionType.foreach(__v => __obj.updateDynamic("CompressionType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoMLChannel]
    }
  }

  /**
    * A list of container definitions that describe the different containers that make up one AutoML candidate. Refer to ContainerDefinition for more details.
    */
  @js.native
  trait AutoMLContainerDefinition extends js.Object {
    var Image: Image
    var ModelDataUrl: Url
    var Environment: js.UndefOr[EnvironmentMap]
  }

  object AutoMLContainerDefinition {
    @inline
    def apply(
        Image: Image,
        ModelDataUrl: Url,
        Environment: js.UndefOr[EnvironmentMap] = js.undefined
    ): AutoMLContainerDefinition = {
      val __obj = js.Dynamic.literal(
        "Image"        -> Image.asInstanceOf[js.Any],
        "ModelDataUrl" -> ModelDataUrl.asInstanceOf[js.Any]
      )

      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoMLContainerDefinition]
    }
  }

  /**
    * The data source for the AutoPilot job.
    */
  @js.native
  trait AutoMLDataSource extends js.Object {
    var S3DataSource: AutoMLS3DataSource
  }

  object AutoMLDataSource {
    @inline
    def apply(
        S3DataSource: AutoMLS3DataSource
    ): AutoMLDataSource = {
      val __obj = js.Dynamic.literal(
        "S3DataSource" -> S3DataSource.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AutoMLDataSource]
    }
  }

  /**
    * Artifacts that are generation during a job.
    */
  @js.native
  trait AutoMLJobArtifacts extends js.Object {
    var CandidateDefinitionNotebookLocation: js.UndefOr[CandidateDefinitionNotebookLocation]
    var DataExplorationNotebookLocation: js.UndefOr[DataExplorationNotebookLocation]
  }

  object AutoMLJobArtifacts {
    @inline
    def apply(
        CandidateDefinitionNotebookLocation: js.UndefOr[CandidateDefinitionNotebookLocation] = js.undefined,
        DataExplorationNotebookLocation: js.UndefOr[DataExplorationNotebookLocation] = js.undefined
    ): AutoMLJobArtifacts = {
      val __obj = js.Dynamic.literal()
      CandidateDefinitionNotebookLocation.foreach(__v =>
        __obj.updateDynamic("CandidateDefinitionNotebookLocation")(__v.asInstanceOf[js.Any])
      )
      DataExplorationNotebookLocation.foreach(__v =>
        __obj.updateDynamic("DataExplorationNotebookLocation")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[AutoMLJobArtifacts]
    }
  }

  /**
    * How long a job is allowed to run, or how many candidates a job is allowed to generate.
    */
  @js.native
  trait AutoMLJobCompletionCriteria extends js.Object {
    var MaxAutoMLJobRuntimeInSeconds: js.UndefOr[MaxAutoMLJobRuntimeInSeconds]
    var MaxCandidates: js.UndefOr[MaxCandidates]
    var MaxRuntimePerTrainingJobInSeconds: js.UndefOr[MaxRuntimePerTrainingJobInSeconds]
  }

  object AutoMLJobCompletionCriteria {
    @inline
    def apply(
        MaxAutoMLJobRuntimeInSeconds: js.UndefOr[MaxAutoMLJobRuntimeInSeconds] = js.undefined,
        MaxCandidates: js.UndefOr[MaxCandidates] = js.undefined,
        MaxRuntimePerTrainingJobInSeconds: js.UndefOr[MaxRuntimePerTrainingJobInSeconds] = js.undefined
    ): AutoMLJobCompletionCriteria = {
      val __obj = js.Dynamic.literal()
      MaxAutoMLJobRuntimeInSeconds.foreach(__v =>
        __obj.updateDynamic("MaxAutoMLJobRuntimeInSeconds")(__v.asInstanceOf[js.Any])
      )
      MaxCandidates.foreach(__v => __obj.updateDynamic("MaxCandidates")(__v.asInstanceOf[js.Any]))
      MaxRuntimePerTrainingJobInSeconds.foreach(__v =>
        __obj.updateDynamic("MaxRuntimePerTrainingJobInSeconds")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[AutoMLJobCompletionCriteria]
    }
  }

  /**
    * A collection of settings used for a job.
    */
  @js.native
  trait AutoMLJobConfig extends js.Object {
    var CompletionCriteria: js.UndefOr[AutoMLJobCompletionCriteria]
    var SecurityConfig: js.UndefOr[AutoMLSecurityConfig]
  }

  object AutoMLJobConfig {
    @inline
    def apply(
        CompletionCriteria: js.UndefOr[AutoMLJobCompletionCriteria] = js.undefined,
        SecurityConfig: js.UndefOr[AutoMLSecurityConfig] = js.undefined
    ): AutoMLJobConfig = {
      val __obj = js.Dynamic.literal()
      CompletionCriteria.foreach(__v => __obj.updateDynamic("CompletionCriteria")(__v.asInstanceOf[js.Any]))
      SecurityConfig.foreach(__v => __obj.updateDynamic("SecurityConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoMLJobConfig]
    }
  }

  /**
    * Applies a metric to minimize or maximize for the job's objective.
    */
  @js.native
  trait AutoMLJobObjective extends js.Object {
    var MetricName: AutoMLMetricEnum
  }

  object AutoMLJobObjective {
    @inline
    def apply(
        MetricName: AutoMLMetricEnum
    ): AutoMLJobObjective = {
      val __obj = js.Dynamic.literal(
        "MetricName" -> MetricName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AutoMLJobObjective]
    }
  }

  @js.native
  sealed trait AutoMLJobObjectiveType extends js.Any
  object AutoMLJobObjectiveType extends js.Object {
    val Maximize = "Maximize".asInstanceOf[AutoMLJobObjectiveType]
    val Minimize = "Minimize".asInstanceOf[AutoMLJobObjectiveType]

    val values = js.Object.freeze(js.Array(Maximize, Minimize))
  }

  @js.native
  sealed trait AutoMLJobSecondaryStatus extends js.Any
  object AutoMLJobSecondaryStatus extends js.Object {
    val Starting                      = "Starting".asInstanceOf[AutoMLJobSecondaryStatus]
    val AnalyzingData                 = "AnalyzingData".asInstanceOf[AutoMLJobSecondaryStatus]
    val FeatureEngineering            = "FeatureEngineering".asInstanceOf[AutoMLJobSecondaryStatus]
    val ModelTuning                   = "ModelTuning".asInstanceOf[AutoMLJobSecondaryStatus]
    val MaxCandidatesReached          = "MaxCandidatesReached".asInstanceOf[AutoMLJobSecondaryStatus]
    val Failed                        = "Failed".asInstanceOf[AutoMLJobSecondaryStatus]
    val Stopped                       = "Stopped".asInstanceOf[AutoMLJobSecondaryStatus]
    val MaxAutoMLJobRuntimeReached    = "MaxAutoMLJobRuntimeReached".asInstanceOf[AutoMLJobSecondaryStatus]
    val Stopping                      = "Stopping".asInstanceOf[AutoMLJobSecondaryStatus]
    val CandidateDefinitionsGenerated = "CandidateDefinitionsGenerated".asInstanceOf[AutoMLJobSecondaryStatus]

    val values = js.Object.freeze(
      js.Array(
        Starting,
        AnalyzingData,
        FeatureEngineering,
        ModelTuning,
        MaxCandidatesReached,
        Failed,
        Stopped,
        MaxAutoMLJobRuntimeReached,
        Stopping,
        CandidateDefinitionsGenerated
      )
    )
  }

  @js.native
  sealed trait AutoMLJobStatus extends js.Any
  object AutoMLJobStatus extends js.Object {
    val Completed  = "Completed".asInstanceOf[AutoMLJobStatus]
    val InProgress = "InProgress".asInstanceOf[AutoMLJobStatus]
    val Failed     = "Failed".asInstanceOf[AutoMLJobStatus]
    val Stopped    = "Stopped".asInstanceOf[AutoMLJobStatus]
    val Stopping   = "Stopping".asInstanceOf[AutoMLJobStatus]

    val values = js.Object.freeze(js.Array(Completed, InProgress, Failed, Stopped, Stopping))
  }

  /**
    * Provides a summary about a job.
    */
  @js.native
  trait AutoMLJobSummary extends js.Object {
    var AutoMLJobArn: AutoMLJobArn
    var AutoMLJobName: AutoMLJobName
    var AutoMLJobSecondaryStatus: AutoMLJobSecondaryStatus
    var AutoMLJobStatus: AutoMLJobStatus
    var CreationTime: Timestamp
    var LastModifiedTime: Timestamp
    var EndTime: js.UndefOr[Timestamp]
    var FailureReason: js.UndefOr[AutoMLFailureReason]
  }

  object AutoMLJobSummary {
    @inline
    def apply(
        AutoMLJobArn: AutoMLJobArn,
        AutoMLJobName: AutoMLJobName,
        AutoMLJobSecondaryStatus: AutoMLJobSecondaryStatus,
        AutoMLJobStatus: AutoMLJobStatus,
        CreationTime: Timestamp,
        LastModifiedTime: Timestamp,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        FailureReason: js.UndefOr[AutoMLFailureReason] = js.undefined
    ): AutoMLJobSummary = {
      val __obj = js.Dynamic.literal(
        "AutoMLJobArn"             -> AutoMLJobArn.asInstanceOf[js.Any],
        "AutoMLJobName"            -> AutoMLJobName.asInstanceOf[js.Any],
        "AutoMLJobSecondaryStatus" -> AutoMLJobSecondaryStatus.asInstanceOf[js.Any],
        "AutoMLJobStatus"          -> AutoMLJobStatus.asInstanceOf[js.Any],
        "CreationTime"             -> CreationTime.asInstanceOf[js.Any],
        "LastModifiedTime"         -> LastModifiedTime.asInstanceOf[js.Any]
      )

      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoMLJobSummary]
    }
  }

  @js.native
  sealed trait AutoMLMetricEnum extends js.Any
  object AutoMLMetricEnum extends js.Object {
    val Accuracy = "Accuracy".asInstanceOf[AutoMLMetricEnum]
    val MSE      = "MSE".asInstanceOf[AutoMLMetricEnum]
    val F1       = "F1".asInstanceOf[AutoMLMetricEnum]
    val F1macro  = "F1macro".asInstanceOf[AutoMLMetricEnum]

    val values = js.Object.freeze(js.Array(Accuracy, MSE, F1, F1macro))
  }

  /**
    * The output data configuration.
    */
  @js.native
  trait AutoMLOutputDataConfig extends js.Object {
    var S3OutputPath: S3Uri
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object AutoMLOutputDataConfig {
    @inline
    def apply(
        S3OutputPath: S3Uri,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): AutoMLOutputDataConfig = {
      val __obj = js.Dynamic.literal(
        "S3OutputPath" -> S3OutputPath.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoMLOutputDataConfig]
    }
  }

  /**
    * The Amazon S3 data source.
    */
  @js.native
  trait AutoMLS3DataSource extends js.Object {
    var S3DataType: AutoMLS3DataType
    var S3Uri: S3Uri
  }

  object AutoMLS3DataSource {
    @inline
    def apply(
        S3DataType: AutoMLS3DataType,
        S3Uri: S3Uri
    ): AutoMLS3DataSource = {
      val __obj = js.Dynamic.literal(
        "S3DataType" -> S3DataType.asInstanceOf[js.Any],
        "S3Uri"      -> S3Uri.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AutoMLS3DataSource]
    }
  }

  @js.native
  sealed trait AutoMLS3DataType extends js.Any
  object AutoMLS3DataType extends js.Object {
    val ManifestFile = "ManifestFile".asInstanceOf[AutoMLS3DataType]
    val S3Prefix     = "S3Prefix".asInstanceOf[AutoMLS3DataType]

    val values = js.Object.freeze(js.Array(ManifestFile, S3Prefix))
  }

  /**
    * Security options.
    */
  @js.native
  trait AutoMLSecurityConfig extends js.Object {
    var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object AutoMLSecurityConfig {
    @inline
    def apply(
        EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): AutoMLSecurityConfig = {
      val __obj = js.Dynamic.literal()
      EnableInterContainerTrafficEncryption.foreach(__v =>
        __obj.updateDynamic("EnableInterContainerTrafficEncryption")(__v.asInstanceOf[js.Any])
      )
      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoMLSecurityConfig]
    }
  }

  @js.native
  sealed trait AutoMLSortBy extends js.Any
  object AutoMLSortBy extends js.Object {
    val Name         = "Name".asInstanceOf[AutoMLSortBy]
    val CreationTime = "CreationTime".asInstanceOf[AutoMLSortBy]
    val Status       = "Status".asInstanceOf[AutoMLSortBy]

    val values = js.Object.freeze(js.Array(Name, CreationTime, Status))
  }

  @js.native
  sealed trait AutoMLSortOrder extends js.Any
  object AutoMLSortOrder extends js.Object {
    val Ascending  = "Ascending".asInstanceOf[AutoMLSortOrder]
    val Descending = "Descending".asInstanceOf[AutoMLSortOrder]

    val values = js.Object.freeze(js.Array(Ascending, Descending))
  }

  @js.native
  sealed trait AwsManagedHumanLoopRequestSource extends js.Any
  object AwsManagedHumanLoopRequestSource extends js.Object {
    val `AWS/Rekognition/DetectModerationLabels/Image/V3` =
      "AWS/Rekognition/DetectModerationLabels/Image/V3".asInstanceOf[AwsManagedHumanLoopRequestSource]
    val `AWS/Textract/AnalyzeDocument/Forms/V1` =
      "AWS/Textract/AnalyzeDocument/Forms/V1".asInstanceOf[AwsManagedHumanLoopRequestSource]

    val values = js.Object.freeze(
      js.Array(`AWS/Rekognition/DetectModerationLabels/Image/V3`, `AWS/Textract/AnalyzeDocument/Forms/V1`)
    )
  }

  @js.native
  sealed trait BatchStrategy extends js.Any
  object BatchStrategy extends js.Object {
    val MultiRecord  = "MultiRecord".asInstanceOf[BatchStrategy]
    val SingleRecord = "SingleRecord".asInstanceOf[BatchStrategy]

    val values = js.Object.freeze(js.Array(MultiRecord, SingleRecord))
  }

  @js.native
  sealed trait BooleanOperator extends js.Any
  object BooleanOperator extends js.Object {
    val And = "And".asInstanceOf[BooleanOperator]
    val Or  = "Or".asInstanceOf[BooleanOperator]

    val values = js.Object.freeze(js.Array(And, Or))
  }

  @js.native
  sealed trait CandidateSortBy extends js.Any
  object CandidateSortBy extends js.Object {
    val CreationTime              = "CreationTime".asInstanceOf[CandidateSortBy]
    val Status                    = "Status".asInstanceOf[CandidateSortBy]
    val FinalObjectiveMetricValue = "FinalObjectiveMetricValue".asInstanceOf[CandidateSortBy]

    val values = js.Object.freeze(js.Array(CreationTime, Status, FinalObjectiveMetricValue))
  }

  @js.native
  sealed trait CandidateStatus extends js.Any
  object CandidateStatus extends js.Object {
    val Completed  = "Completed".asInstanceOf[CandidateStatus]
    val InProgress = "InProgress".asInstanceOf[CandidateStatus]
    val Failed     = "Failed".asInstanceOf[CandidateStatus]
    val Stopped    = "Stopped".asInstanceOf[CandidateStatus]
    val Stopping   = "Stopping".asInstanceOf[CandidateStatus]

    val values = js.Object.freeze(js.Array(Completed, InProgress, Failed, Stopped, Stopping))
  }

  @js.native
  sealed trait CandidateStepType extends js.Any
  object CandidateStepType extends js.Object {
    val `AWS::SageMaker::TrainingJob`   = "AWS::SageMaker::TrainingJob".asInstanceOf[CandidateStepType]
    val `AWS::SageMaker::TransformJob`  = "AWS::SageMaker::TransformJob".asInstanceOf[CandidateStepType]
    val `AWS::SageMaker::ProcessingJob` = "AWS::SageMaker::ProcessingJob".asInstanceOf[CandidateStepType]

    val values = js.Object.freeze(
      js.Array(`AWS::SageMaker::TrainingJob`, `AWS::SageMaker::TransformJob`, `AWS::SageMaker::ProcessingJob`)
    )
  }

  /**
    * <p/>
    */
  @js.native
  trait CaptureContentTypeHeader extends js.Object {
    var CsvContentTypes: js.UndefOr[CsvContentTypes]
    var JsonContentTypes: js.UndefOr[JsonContentTypes]
  }

  object CaptureContentTypeHeader {
    @inline
    def apply(
        CsvContentTypes: js.UndefOr[CsvContentTypes] = js.undefined,
        JsonContentTypes: js.UndefOr[JsonContentTypes] = js.undefined
    ): CaptureContentTypeHeader = {
      val __obj = js.Dynamic.literal()
      CsvContentTypes.foreach(__v => __obj.updateDynamic("CsvContentTypes")(__v.asInstanceOf[js.Any]))
      JsonContentTypes.foreach(__v => __obj.updateDynamic("JsonContentTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaptureContentTypeHeader]
    }
  }

  @js.native
  sealed trait CaptureMode extends js.Any
  object CaptureMode extends js.Object {
    val Input  = "Input".asInstanceOf[CaptureMode]
    val Output = "Output".asInstanceOf[CaptureMode]

    val values = js.Object.freeze(js.Array(Input, Output))
  }

  /**
    * <p/>
    */
  @js.native
  trait CaptureOption extends js.Object {
    var CaptureMode: CaptureMode
  }

  object CaptureOption {
    @inline
    def apply(
        CaptureMode: CaptureMode
    ): CaptureOption = {
      val __obj = js.Dynamic.literal(
        "CaptureMode" -> CaptureMode.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CaptureOption]
    }
  }

  @js.native
  sealed trait CaptureStatus extends js.Any
  object CaptureStatus extends js.Object {
    val Started = "Started".asInstanceOf[CaptureStatus]
    val Stopped = "Stopped".asInstanceOf[CaptureStatus]

    val values = js.Object.freeze(js.Array(Started, Stopped))
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
      SupportedCompressionTypes.foreach(__v =>
        __obj.updateDynamic("SupportedCompressionTypes")(__v.asInstanceOf[js.Any])
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

  @js.native
  sealed trait CodeRepositorySortBy extends js.Any
  object CodeRepositorySortBy extends js.Object {
    val Name             = "Name".asInstanceOf[CodeRepositorySortBy]
    val CreationTime     = "CreationTime".asInstanceOf[CodeRepositorySortBy]
    val LastModifiedTime = "LastModifiedTime".asInstanceOf[CodeRepositorySortBy]

    val values = js.Object.freeze(js.Array(Name, CreationTime, LastModifiedTime))
  }

  @js.native
  sealed trait CodeRepositorySortOrder extends js.Any
  object CodeRepositorySortOrder extends js.Object {
    val Ascending  = "Ascending".asInstanceOf[CodeRepositorySortOrder]
    val Descending = "Descending".asInstanceOf[CodeRepositorySortOrder]

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

  /**
    * Configuration information for tensor collections.
    */
  @js.native
  trait CollectionConfiguration extends js.Object {
    var CollectionName: js.UndefOr[CollectionName]
    var CollectionParameters: js.UndefOr[CollectionParameters]
  }

  object CollectionConfiguration {
    @inline
    def apply(
        CollectionName: js.UndefOr[CollectionName] = js.undefined,
        CollectionParameters: js.UndefOr[CollectionParameters] = js.undefined
    ): CollectionConfiguration = {
      val __obj = js.Dynamic.literal()
      CollectionName.foreach(__v => __obj.updateDynamic("CollectionName")(__v.asInstanceOf[js.Any]))
      CollectionParameters.foreach(__v => __obj.updateDynamic("CollectionParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CollectionConfiguration]
    }
  }

  @js.native
  sealed trait CompilationJobStatus extends js.Any
  object CompilationJobStatus extends js.Object {
    val INPROGRESS = "INPROGRESS".asInstanceOf[CompilationJobStatus]
    val COMPLETED  = "COMPLETED".asInstanceOf[CompilationJobStatus]
    val FAILED     = "FAILED".asInstanceOf[CompilationJobStatus]
    val STARTING   = "STARTING".asInstanceOf[CompilationJobStatus]
    val STOPPING   = "STOPPING".asInstanceOf[CompilationJobStatus]
    val STOPPED    = "STOPPED".asInstanceOf[CompilationJobStatus]

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

  @js.native
  sealed trait CompressionType extends js.Any
  object CompressionType extends js.Object {
    val None = "None".asInstanceOf[CompressionType]
    val Gzip = "Gzip".asInstanceOf[CompressionType]

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
    var Mode: js.UndefOr[ContainerMode]
    var ModelDataUrl: js.UndefOr[Url]
    var ModelPackageName: js.UndefOr[ArnOrName]
  }

  object ContainerDefinition {
    @inline
    def apply(
        ContainerHostname: js.UndefOr[ContainerHostname] = js.undefined,
        Environment: js.UndefOr[EnvironmentMap] = js.undefined,
        Image: js.UndefOr[Image] = js.undefined,
        Mode: js.UndefOr[ContainerMode] = js.undefined,
        ModelDataUrl: js.UndefOr[Url] = js.undefined,
        ModelPackageName: js.UndefOr[ArnOrName] = js.undefined
    ): ContainerDefinition = {
      val __obj = js.Dynamic.literal()
      ContainerHostname.foreach(__v => __obj.updateDynamic("ContainerHostname")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      Image.foreach(__v => __obj.updateDynamic("Image")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      ModelDataUrl.foreach(__v => __obj.updateDynamic("ModelDataUrl")(__v.asInstanceOf[js.Any]))
      ModelPackageName.foreach(__v => __obj.updateDynamic("ModelPackageName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContainerDefinition]
    }
  }

  @js.native
  sealed trait ContainerMode extends js.Any
  object ContainerMode extends js.Object {
    val SingleModel = "SingleModel".asInstanceOf[ContainerMode]
    val MultiModel  = "MultiModel".asInstanceOf[ContainerMode]

    val values = js.Object.freeze(js.Array(SingleModel, MultiModel))
  }

  @js.native
  sealed trait ContentClassifier extends js.Any
  object ContentClassifier extends js.Object {
    val FreeOfPersonallyIdentifiableInformation =
      "FreeOfPersonallyIdentifiableInformation".asInstanceOf[ContentClassifier]
    val FreeOfAdultContent = "FreeOfAdultContent".asInstanceOf[ContentClassifier]

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
  trait CreateAppRequest extends js.Object {
    var AppName: AppName
    var AppType: AppType
    var DomainId: DomainId
    var UserProfileName: UserProfileName
    var ResourceSpec: js.UndefOr[ResourceSpec]
    var Tags: js.UndefOr[TagList]
  }

  object CreateAppRequest {
    @inline
    def apply(
        AppName: AppName,
        AppType: AppType,
        DomainId: DomainId,
        UserProfileName: UserProfileName,
        ResourceSpec: js.UndefOr[ResourceSpec] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateAppRequest = {
      val __obj = js.Dynamic.literal(
        "AppName"         -> AppName.asInstanceOf[js.Any],
        "AppType"         -> AppType.asInstanceOf[js.Any],
        "DomainId"        -> DomainId.asInstanceOf[js.Any],
        "UserProfileName" -> UserProfileName.asInstanceOf[js.Any]
      )

      ResourceSpec.foreach(__v => __obj.updateDynamic("ResourceSpec")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppRequest]
    }
  }

  @js.native
  trait CreateAppResponse extends js.Object {
    var AppArn: js.UndefOr[AppArn]
  }

  object CreateAppResponse {
    @inline
    def apply(
        AppArn: js.UndefOr[AppArn] = js.undefined
    ): CreateAppResponse = {
      val __obj = js.Dynamic.literal()
      AppArn.foreach(__v => __obj.updateDynamic("AppArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppResponse]
    }
  }

  @js.native
  trait CreateAutoMLJobRequest extends js.Object {
    var AutoMLJobName: AutoMLJobName
    var InputDataConfig: AutoMLInputDataConfig
    var OutputDataConfig: AutoMLOutputDataConfig
    var RoleArn: RoleArn
    var AutoMLJobConfig: js.UndefOr[AutoMLJobConfig]
    var AutoMLJobObjective: js.UndefOr[AutoMLJobObjective]
    var GenerateCandidateDefinitionsOnly: js.UndefOr[GenerateCandidateDefinitionsOnly]
    var ProblemType: js.UndefOr[ProblemType]
    var Tags: js.UndefOr[TagList]
  }

  object CreateAutoMLJobRequest {
    @inline
    def apply(
        AutoMLJobName: AutoMLJobName,
        InputDataConfig: AutoMLInputDataConfig,
        OutputDataConfig: AutoMLOutputDataConfig,
        RoleArn: RoleArn,
        AutoMLJobConfig: js.UndefOr[AutoMLJobConfig] = js.undefined,
        AutoMLJobObjective: js.UndefOr[AutoMLJobObjective] = js.undefined,
        GenerateCandidateDefinitionsOnly: js.UndefOr[GenerateCandidateDefinitionsOnly] = js.undefined,
        ProblemType: js.UndefOr[ProblemType] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateAutoMLJobRequest = {
      val __obj = js.Dynamic.literal(
        "AutoMLJobName"    -> AutoMLJobName.asInstanceOf[js.Any],
        "InputDataConfig"  -> InputDataConfig.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any],
        "RoleArn"          -> RoleArn.asInstanceOf[js.Any]
      )

      AutoMLJobConfig.foreach(__v => __obj.updateDynamic("AutoMLJobConfig")(__v.asInstanceOf[js.Any]))
      AutoMLJobObjective.foreach(__v => __obj.updateDynamic("AutoMLJobObjective")(__v.asInstanceOf[js.Any]))
      GenerateCandidateDefinitionsOnly.foreach(__v =>
        __obj.updateDynamic("GenerateCandidateDefinitionsOnly")(__v.asInstanceOf[js.Any])
      )
      ProblemType.foreach(__v => __obj.updateDynamic("ProblemType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAutoMLJobRequest]
    }
  }

  @js.native
  trait CreateAutoMLJobResponse extends js.Object {
    var AutoMLJobArn: AutoMLJobArn
  }

  object CreateAutoMLJobResponse {
    @inline
    def apply(
        AutoMLJobArn: AutoMLJobArn
    ): CreateAutoMLJobResponse = {
      val __obj = js.Dynamic.literal(
        "AutoMLJobArn" -> AutoMLJobArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateAutoMLJobResponse]
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
  trait CreateDomainRequest extends js.Object {
    var AuthMode: AuthMode
    var DefaultUserSettings: UserSettings
    var DomainName: DomainName
    var SubnetIds: Subnets
    var VpcId: VpcId
    var HomeEfsFileSystemKmsKeyId: js.UndefOr[KmsKeyId]
    var Tags: js.UndefOr[TagList]
  }

  object CreateDomainRequest {
    @inline
    def apply(
        AuthMode: AuthMode,
        DefaultUserSettings: UserSettings,
        DomainName: DomainName,
        SubnetIds: Subnets,
        VpcId: VpcId,
        HomeEfsFileSystemKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDomainRequest = {
      val __obj = js.Dynamic.literal(
        "AuthMode"            -> AuthMode.asInstanceOf[js.Any],
        "DefaultUserSettings" -> DefaultUserSettings.asInstanceOf[js.Any],
        "DomainName"          -> DomainName.asInstanceOf[js.Any],
        "SubnetIds"           -> SubnetIds.asInstanceOf[js.Any],
        "VpcId"               -> VpcId.asInstanceOf[js.Any]
      )

      HomeEfsFileSystemKmsKeyId.foreach(__v =>
        __obj.updateDynamic("HomeEfsFileSystemKmsKeyId")(__v.asInstanceOf[js.Any])
      )
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDomainRequest]
    }
  }

  @js.native
  trait CreateDomainResponse extends js.Object {
    var DomainArn: js.UndefOr[DomainArn]
    var Url: js.UndefOr[String1024]
  }

  object CreateDomainResponse {
    @inline
    def apply(
        DomainArn: js.UndefOr[DomainArn] = js.undefined,
        Url: js.UndefOr[String1024] = js.undefined
    ): CreateDomainResponse = {
      val __obj = js.Dynamic.literal()
      DomainArn.foreach(__v => __obj.updateDynamic("DomainArn")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDomainResponse]
    }
  }

  @js.native
  trait CreateEndpointConfigInput extends js.Object {
    var EndpointConfigName: EndpointConfigName
    var ProductionVariants: ProductionVariantList
    var DataCaptureConfig: js.UndefOr[DataCaptureConfig]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var Tags: js.UndefOr[TagList]
  }

  object CreateEndpointConfigInput {
    @inline
    def apply(
        EndpointConfigName: EndpointConfigName,
        ProductionVariants: ProductionVariantList,
        DataCaptureConfig: js.UndefOr[DataCaptureConfig] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateEndpointConfigInput = {
      val __obj = js.Dynamic.literal(
        "EndpointConfigName" -> EndpointConfigName.asInstanceOf[js.Any],
        "ProductionVariants" -> ProductionVariants.asInstanceOf[js.Any]
      )

      DataCaptureConfig.foreach(__v => __obj.updateDynamic("DataCaptureConfig")(__v.asInstanceOf[js.Any]))
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
  trait CreateExperimentRequest extends js.Object {
    var ExperimentName: ExperimentEntityName
    var Description: js.UndefOr[ExperimentDescription]
    var DisplayName: js.UndefOr[ExperimentEntityName]
    var Tags: js.UndefOr[TagList]
  }

  object CreateExperimentRequest {
    @inline
    def apply(
        ExperimentName: ExperimentEntityName,
        Description: js.UndefOr[ExperimentDescription] = js.undefined,
        DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateExperimentRequest = {
      val __obj = js.Dynamic.literal(
        "ExperimentName" -> ExperimentName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateExperimentRequest]
    }
  }

  @js.native
  trait CreateExperimentResponse extends js.Object {
    var ExperimentArn: js.UndefOr[ExperimentArn]
  }

  object CreateExperimentResponse {
    @inline
    def apply(
        ExperimentArn: js.UndefOr[ExperimentArn] = js.undefined
    ): CreateExperimentResponse = {
      val __obj = js.Dynamic.literal()
      ExperimentArn.foreach(__v => __obj.updateDynamic("ExperimentArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateExperimentResponse]
    }
  }

  @js.native
  trait CreateFlowDefinitionRequest extends js.Object {
    var FlowDefinitionName: FlowDefinitionName
    var HumanLoopConfig: HumanLoopConfig
    var OutputConfig: FlowDefinitionOutputConfig
    var RoleArn: RoleArn
    var HumanLoopActivationConfig: js.UndefOr[HumanLoopActivationConfig]
    var HumanLoopRequestSource: js.UndefOr[HumanLoopRequestSource]
    var Tags: js.UndefOr[TagList]
  }

  object CreateFlowDefinitionRequest {
    @inline
    def apply(
        FlowDefinitionName: FlowDefinitionName,
        HumanLoopConfig: HumanLoopConfig,
        OutputConfig: FlowDefinitionOutputConfig,
        RoleArn: RoleArn,
        HumanLoopActivationConfig: js.UndefOr[HumanLoopActivationConfig] = js.undefined,
        HumanLoopRequestSource: js.UndefOr[HumanLoopRequestSource] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateFlowDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "FlowDefinitionName" -> FlowDefinitionName.asInstanceOf[js.Any],
        "HumanLoopConfig"    -> HumanLoopConfig.asInstanceOf[js.Any],
        "OutputConfig"       -> OutputConfig.asInstanceOf[js.Any],
        "RoleArn"            -> RoleArn.asInstanceOf[js.Any]
      )

      HumanLoopActivationConfig.foreach(__v =>
        __obj.updateDynamic("HumanLoopActivationConfig")(__v.asInstanceOf[js.Any])
      )
      HumanLoopRequestSource.foreach(__v => __obj.updateDynamic("HumanLoopRequestSource")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFlowDefinitionRequest]
    }
  }

  @js.native
  trait CreateFlowDefinitionResponse extends js.Object {
    var FlowDefinitionArn: FlowDefinitionArn
  }

  object CreateFlowDefinitionResponse {
    @inline
    def apply(
        FlowDefinitionArn: FlowDefinitionArn
    ): CreateFlowDefinitionResponse = {
      val __obj = js.Dynamic.literal(
        "FlowDefinitionArn" -> FlowDefinitionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateFlowDefinitionResponse]
    }
  }

  @js.native
  trait CreateHumanTaskUiRequest extends js.Object {
    var HumanTaskUiName: HumanTaskUiName
    var UiTemplate: UiTemplate
    var Tags: js.UndefOr[TagList]
  }

  object CreateHumanTaskUiRequest {
    @inline
    def apply(
        HumanTaskUiName: HumanTaskUiName,
        UiTemplate: UiTemplate,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateHumanTaskUiRequest = {
      val __obj = js.Dynamic.literal(
        "HumanTaskUiName" -> HumanTaskUiName.asInstanceOf[js.Any],
        "UiTemplate"      -> UiTemplate.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHumanTaskUiRequest]
    }
  }

  @js.native
  trait CreateHumanTaskUiResponse extends js.Object {
    var HumanTaskUiArn: HumanTaskUiArn
  }

  object CreateHumanTaskUiResponse {
    @inline
    def apply(
        HumanTaskUiArn: HumanTaskUiArn
    ): CreateHumanTaskUiResponse = {
      val __obj = js.Dynamic.literal(
        "HumanTaskUiArn" -> HumanTaskUiArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateHumanTaskUiResponse]
    }
  }

  @js.native
  trait CreateHyperParameterTuningJobRequest extends js.Object {
    var HyperParameterTuningJobConfig: HyperParameterTuningJobConfig
    var HyperParameterTuningJobName: HyperParameterTuningJobName
    var Tags: js.UndefOr[TagList]
    var TrainingJobDefinition: js.UndefOr[HyperParameterTrainingJobDefinition]
    var TrainingJobDefinitions: js.UndefOr[HyperParameterTrainingJobDefinitions]
    var WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig]
  }

  object CreateHyperParameterTuningJobRequest {
    @inline
    def apply(
        HyperParameterTuningJobConfig: HyperParameterTuningJobConfig,
        HyperParameterTuningJobName: HyperParameterTuningJobName,
        Tags: js.UndefOr[TagList] = js.undefined,
        TrainingJobDefinition: js.UndefOr[HyperParameterTrainingJobDefinition] = js.undefined,
        TrainingJobDefinitions: js.UndefOr[HyperParameterTrainingJobDefinitions] = js.undefined,
        WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig] = js.undefined
    ): CreateHyperParameterTuningJobRequest = {
      val __obj = js.Dynamic.literal(
        "HyperParameterTuningJobConfig" -> HyperParameterTuningJobConfig.asInstanceOf[js.Any],
        "HyperParameterTuningJobName"   -> HyperParameterTuningJobName.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TrainingJobDefinition.foreach(__v => __obj.updateDynamic("TrainingJobDefinition")(__v.asInstanceOf[js.Any]))
      TrainingJobDefinitions.foreach(__v => __obj.updateDynamic("TrainingJobDefinitions")(__v.asInstanceOf[js.Any]))
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
      LabelingJobAlgorithmsConfig.foreach(__v =>
        __obj.updateDynamic("LabelingJobAlgorithmsConfig")(__v.asInstanceOf[js.Any])
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
      SourceAlgorithmSpecification.foreach(__v =>
        __obj.updateDynamic("SourceAlgorithmSpecification")(__v.asInstanceOf[js.Any])
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
  trait CreateMonitoringScheduleRequest extends js.Object {
    var MonitoringScheduleConfig: MonitoringScheduleConfig
    var MonitoringScheduleName: MonitoringScheduleName
    var Tags: js.UndefOr[TagList]
  }

  object CreateMonitoringScheduleRequest {
    @inline
    def apply(
        MonitoringScheduleConfig: MonitoringScheduleConfig,
        MonitoringScheduleName: MonitoringScheduleName,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateMonitoringScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "MonitoringScheduleConfig" -> MonitoringScheduleConfig.asInstanceOf[js.Any],
        "MonitoringScheduleName"   -> MonitoringScheduleName.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMonitoringScheduleRequest]
    }
  }

  @js.native
  trait CreateMonitoringScheduleResponse extends js.Object {
    var MonitoringScheduleArn: MonitoringScheduleArn
  }

  object CreateMonitoringScheduleResponse {
    @inline
    def apply(
        MonitoringScheduleArn: MonitoringScheduleArn
    ): CreateMonitoringScheduleResponse = {
      val __obj = js.Dynamic.literal(
        "MonitoringScheduleArn" -> MonitoringScheduleArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateMonitoringScheduleResponse]
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
      AdditionalCodeRepositories.foreach(__v =>
        __obj.updateDynamic("AdditionalCodeRepositories")(__v.asInstanceOf[js.Any])
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
      NotebookInstanceLifecycleConfigArn.foreach(__v =>
        __obj.updateDynamic("NotebookInstanceLifecycleConfigArn")(__v.asInstanceOf[js.Any])
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
  trait CreatePresignedDomainUrlRequest extends js.Object {
    var DomainId: DomainId
    var UserProfileName: UserProfileName
    var SessionExpirationDurationInSeconds: js.UndefOr[SessionExpirationDurationInSeconds]
  }

  object CreatePresignedDomainUrlRequest {
    @inline
    def apply(
        DomainId: DomainId,
        UserProfileName: UserProfileName,
        SessionExpirationDurationInSeconds: js.UndefOr[SessionExpirationDurationInSeconds] = js.undefined
    ): CreatePresignedDomainUrlRequest = {
      val __obj = js.Dynamic.literal(
        "DomainId"        -> DomainId.asInstanceOf[js.Any],
        "UserProfileName" -> UserProfileName.asInstanceOf[js.Any]
      )

      SessionExpirationDurationInSeconds.foreach(__v =>
        __obj.updateDynamic("SessionExpirationDurationInSeconds")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CreatePresignedDomainUrlRequest]
    }
  }

  @js.native
  trait CreatePresignedDomainUrlResponse extends js.Object {
    var AuthorizedUrl: js.UndefOr[PresignedDomainUrl]
  }

  object CreatePresignedDomainUrlResponse {
    @inline
    def apply(
        AuthorizedUrl: js.UndefOr[PresignedDomainUrl] = js.undefined
    ): CreatePresignedDomainUrlResponse = {
      val __obj = js.Dynamic.literal()
      AuthorizedUrl.foreach(__v => __obj.updateDynamic("AuthorizedUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePresignedDomainUrlResponse]
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

      SessionExpirationDurationInSeconds.foreach(__v =>
        __obj.updateDynamic("SessionExpirationDurationInSeconds")(__v.asInstanceOf[js.Any])
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
  trait CreateProcessingJobRequest extends js.Object {
    var AppSpecification: AppSpecification
    var ProcessingJobName: ProcessingJobName
    var ProcessingResources: ProcessingResources
    var RoleArn: RoleArn
    var Environment: js.UndefOr[ProcessingEnvironmentMap]
    var ExperimentConfig: js.UndefOr[ExperimentConfig]
    var NetworkConfig: js.UndefOr[NetworkConfig]
    var ProcessingInputs: js.UndefOr[ProcessingInputs]
    var ProcessingOutputConfig: js.UndefOr[ProcessingOutputConfig]
    var StoppingCondition: js.UndefOr[ProcessingStoppingCondition]
    var Tags: js.UndefOr[TagList]
  }

  object CreateProcessingJobRequest {
    @inline
    def apply(
        AppSpecification: AppSpecification,
        ProcessingJobName: ProcessingJobName,
        ProcessingResources: ProcessingResources,
        RoleArn: RoleArn,
        Environment: js.UndefOr[ProcessingEnvironmentMap] = js.undefined,
        ExperimentConfig: js.UndefOr[ExperimentConfig] = js.undefined,
        NetworkConfig: js.UndefOr[NetworkConfig] = js.undefined,
        ProcessingInputs: js.UndefOr[ProcessingInputs] = js.undefined,
        ProcessingOutputConfig: js.UndefOr[ProcessingOutputConfig] = js.undefined,
        StoppingCondition: js.UndefOr[ProcessingStoppingCondition] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateProcessingJobRequest = {
      val __obj = js.Dynamic.literal(
        "AppSpecification"    -> AppSpecification.asInstanceOf[js.Any],
        "ProcessingJobName"   -> ProcessingJobName.asInstanceOf[js.Any],
        "ProcessingResources" -> ProcessingResources.asInstanceOf[js.Any],
        "RoleArn"             -> RoleArn.asInstanceOf[js.Any]
      )

      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      ExperimentConfig.foreach(__v => __obj.updateDynamic("ExperimentConfig")(__v.asInstanceOf[js.Any]))
      NetworkConfig.foreach(__v => __obj.updateDynamic("NetworkConfig")(__v.asInstanceOf[js.Any]))
      ProcessingInputs.foreach(__v => __obj.updateDynamic("ProcessingInputs")(__v.asInstanceOf[js.Any]))
      ProcessingOutputConfig.foreach(__v => __obj.updateDynamic("ProcessingOutputConfig")(__v.asInstanceOf[js.Any]))
      StoppingCondition.foreach(__v => __obj.updateDynamic("StoppingCondition")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProcessingJobRequest]
    }
  }

  @js.native
  trait CreateProcessingJobResponse extends js.Object {
    var ProcessingJobArn: ProcessingJobArn
  }

  object CreateProcessingJobResponse {
    @inline
    def apply(
        ProcessingJobArn: ProcessingJobArn
    ): CreateProcessingJobResponse = {
      val __obj = js.Dynamic.literal(
        "ProcessingJobArn" -> ProcessingJobArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateProcessingJobResponse]
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
    var DebugHookConfig: js.UndefOr[DebugHookConfig]
    var DebugRuleConfigurations: js.UndefOr[DebugRuleConfigurations]
    var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean]
    var EnableManagedSpotTraining: js.UndefOr[Boolean]
    var EnableNetworkIsolation: js.UndefOr[Boolean]
    var ExperimentConfig: js.UndefOr[ExperimentConfig]
    var HyperParameters: js.UndefOr[HyperParameters]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var Tags: js.UndefOr[TagList]
    var TensorBoardOutputConfig: js.UndefOr[TensorBoardOutputConfig]
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
        DebugHookConfig: js.UndefOr[DebugHookConfig] = js.undefined,
        DebugRuleConfigurations: js.UndefOr[DebugRuleConfigurations] = js.undefined,
        EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined,
        EnableManagedSpotTraining: js.UndefOr[Boolean] = js.undefined,
        EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
        ExperimentConfig: js.UndefOr[ExperimentConfig] = js.undefined,
        HyperParameters: js.UndefOr[HyperParameters] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TensorBoardOutputConfig: js.UndefOr[TensorBoardOutputConfig] = js.undefined,
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
      DebugHookConfig.foreach(__v => __obj.updateDynamic("DebugHookConfig")(__v.asInstanceOf[js.Any]))
      DebugRuleConfigurations.foreach(__v => __obj.updateDynamic("DebugRuleConfigurations")(__v.asInstanceOf[js.Any]))
      EnableInterContainerTrafficEncryption.foreach(__v =>
        __obj.updateDynamic("EnableInterContainerTrafficEncryption")(__v.asInstanceOf[js.Any])
      )
      EnableManagedSpotTraining.foreach(__v =>
        __obj.updateDynamic("EnableManagedSpotTraining")(__v.asInstanceOf[js.Any])
      )
      EnableNetworkIsolation.foreach(__v => __obj.updateDynamic("EnableNetworkIsolation")(__v.asInstanceOf[js.Any]))
      ExperimentConfig.foreach(__v => __obj.updateDynamic("ExperimentConfig")(__v.asInstanceOf[js.Any]))
      HyperParameters.foreach(__v => __obj.updateDynamic("HyperParameters")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TensorBoardOutputConfig.foreach(__v => __obj.updateDynamic("TensorBoardOutputConfig")(__v.asInstanceOf[js.Any]))
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
    var ExperimentConfig: js.UndefOr[ExperimentConfig]
    var MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms]
    var MaxPayloadInMB: js.UndefOr[MaxPayloadInMB]
    var ModelClientConfig: js.UndefOr[ModelClientConfig]
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
        ExperimentConfig: js.UndefOr[ExperimentConfig] = js.undefined,
        MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms] = js.undefined,
        MaxPayloadInMB: js.UndefOr[MaxPayloadInMB] = js.undefined,
        ModelClientConfig: js.UndefOr[ModelClientConfig] = js.undefined,
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
      ExperimentConfig.foreach(__v => __obj.updateDynamic("ExperimentConfig")(__v.asInstanceOf[js.Any]))
      MaxConcurrentTransforms.foreach(__v => __obj.updateDynamic("MaxConcurrentTransforms")(__v.asInstanceOf[js.Any]))
      MaxPayloadInMB.foreach(__v => __obj.updateDynamic("MaxPayloadInMB")(__v.asInstanceOf[js.Any]))
      ModelClientConfig.foreach(__v => __obj.updateDynamic("ModelClientConfig")(__v.asInstanceOf[js.Any]))
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
  trait CreateTrialComponentRequest extends js.Object {
    var TrialComponentName: ExperimentEntityName
    var DisplayName: js.UndefOr[ExperimentEntityName]
    var EndTime: js.UndefOr[Timestamp]
    var InputArtifacts: js.UndefOr[TrialComponentArtifacts]
    var OutputArtifacts: js.UndefOr[TrialComponentArtifacts]
    var Parameters: js.UndefOr[TrialComponentParameters]
    var StartTime: js.UndefOr[Timestamp]
    var Status: js.UndefOr[TrialComponentStatus]
    var Tags: js.UndefOr[TagList]
  }

  object CreateTrialComponentRequest {
    @inline
    def apply(
        TrialComponentName: ExperimentEntityName,
        DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        InputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.undefined,
        OutputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.undefined,
        Parameters: js.UndefOr[TrialComponentParameters] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[TrialComponentStatus] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateTrialComponentRequest = {
      val __obj = js.Dynamic.literal(
        "TrialComponentName" -> TrialComponentName.asInstanceOf[js.Any]
      )

      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      InputArtifacts.foreach(__v => __obj.updateDynamic("InputArtifacts")(__v.asInstanceOf[js.Any]))
      OutputArtifacts.foreach(__v => __obj.updateDynamic("OutputArtifacts")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTrialComponentRequest]
    }
  }

  @js.native
  trait CreateTrialComponentResponse extends js.Object {
    var TrialComponentArn: js.UndefOr[TrialComponentArn]
  }

  object CreateTrialComponentResponse {
    @inline
    def apply(
        TrialComponentArn: js.UndefOr[TrialComponentArn] = js.undefined
    ): CreateTrialComponentResponse = {
      val __obj = js.Dynamic.literal()
      TrialComponentArn.foreach(__v => __obj.updateDynamic("TrialComponentArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTrialComponentResponse]
    }
  }

  @js.native
  trait CreateTrialRequest extends js.Object {
    var ExperimentName: ExperimentEntityName
    var TrialName: ExperimentEntityName
    var DisplayName: js.UndefOr[ExperimentEntityName]
    var Tags: js.UndefOr[TagList]
  }

  object CreateTrialRequest {
    @inline
    def apply(
        ExperimentName: ExperimentEntityName,
        TrialName: ExperimentEntityName,
        DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateTrialRequest = {
      val __obj = js.Dynamic.literal(
        "ExperimentName" -> ExperimentName.asInstanceOf[js.Any],
        "TrialName"      -> TrialName.asInstanceOf[js.Any]
      )

      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTrialRequest]
    }
  }

  @js.native
  trait CreateTrialResponse extends js.Object {
    var TrialArn: js.UndefOr[TrialArn]
  }

  object CreateTrialResponse {
    @inline
    def apply(
        TrialArn: js.UndefOr[TrialArn] = js.undefined
    ): CreateTrialResponse = {
      val __obj = js.Dynamic.literal()
      TrialArn.foreach(__v => __obj.updateDynamic("TrialArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTrialResponse]
    }
  }

  @js.native
  trait CreateUserProfileRequest extends js.Object {
    var DomainId: DomainId
    var UserProfileName: UserProfileName
    var SingleSignOnUserIdentifier: js.UndefOr[SingleSignOnUserIdentifier]
    var SingleSignOnUserValue: js.UndefOr[String256]
    var Tags: js.UndefOr[TagList]
    var UserSettings: js.UndefOr[UserSettings]
  }

  object CreateUserProfileRequest {
    @inline
    def apply(
        DomainId: DomainId,
        UserProfileName: UserProfileName,
        SingleSignOnUserIdentifier: js.UndefOr[SingleSignOnUserIdentifier] = js.undefined,
        SingleSignOnUserValue: js.UndefOr[String256] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        UserSettings: js.UndefOr[UserSettings] = js.undefined
    ): CreateUserProfileRequest = {
      val __obj = js.Dynamic.literal(
        "DomainId"        -> DomainId.asInstanceOf[js.Any],
        "UserProfileName" -> UserProfileName.asInstanceOf[js.Any]
      )

      SingleSignOnUserIdentifier.foreach(__v =>
        __obj.updateDynamic("SingleSignOnUserIdentifier")(__v.asInstanceOf[js.Any])
      )
      SingleSignOnUserValue.foreach(__v => __obj.updateDynamic("SingleSignOnUserValue")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UserSettings.foreach(__v => __obj.updateDynamic("UserSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserProfileRequest]
    }
  }

  @js.native
  trait CreateUserProfileResponse extends js.Object {
    var UserProfileArn: js.UndefOr[UserProfileArn]
  }

  object CreateUserProfileResponse {
    @inline
    def apply(
        UserProfileArn: js.UndefOr[UserProfileArn] = js.undefined
    ): CreateUserProfileResponse = {
      val __obj = js.Dynamic.literal()
      UserProfileArn.foreach(__v => __obj.updateDynamic("UserProfileArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserProfileResponse]
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

      NotificationConfiguration.foreach(__v =>
        __obj.updateDynamic("NotificationConfiguration")(__v.asInstanceOf[js.Any])
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
    * <p/>
    */
  @js.native
  trait DataCaptureConfig extends js.Object {
    var CaptureOptions: CaptureOptionList
    var DestinationS3Uri: DestinationS3Uri
    var InitialSamplingPercentage: SamplingPercentage
    var CaptureContentTypeHeader: js.UndefOr[CaptureContentTypeHeader]
    var EnableCapture: js.UndefOr[EnableCapture]
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object DataCaptureConfig {
    @inline
    def apply(
        CaptureOptions: CaptureOptionList,
        DestinationS3Uri: DestinationS3Uri,
        InitialSamplingPercentage: SamplingPercentage,
        CaptureContentTypeHeader: js.UndefOr[CaptureContentTypeHeader] = js.undefined,
        EnableCapture: js.UndefOr[EnableCapture] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): DataCaptureConfig = {
      val __obj = js.Dynamic.literal(
        "CaptureOptions"            -> CaptureOptions.asInstanceOf[js.Any],
        "DestinationS3Uri"          -> DestinationS3Uri.asInstanceOf[js.Any],
        "InitialSamplingPercentage" -> InitialSamplingPercentage.asInstanceOf[js.Any]
      )

      CaptureContentTypeHeader.foreach(__v => __obj.updateDynamic("CaptureContentTypeHeader")(__v.asInstanceOf[js.Any]))
      EnableCapture.foreach(__v => __obj.updateDynamic("EnableCapture")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataCaptureConfig]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DataCaptureConfigSummary extends js.Object {
    var CaptureStatus: CaptureStatus
    var CurrentSamplingPercentage: SamplingPercentage
    var DestinationS3Uri: DestinationS3Uri
    var EnableCapture: EnableCapture
    var KmsKeyId: KmsKeyId
  }

  object DataCaptureConfigSummary {
    @inline
    def apply(
        CaptureStatus: CaptureStatus,
        CurrentSamplingPercentage: SamplingPercentage,
        DestinationS3Uri: DestinationS3Uri,
        EnableCapture: EnableCapture,
        KmsKeyId: KmsKeyId
    ): DataCaptureConfigSummary = {
      val __obj = js.Dynamic.literal(
        "CaptureStatus"             -> CaptureStatus.asInstanceOf[js.Any],
        "CurrentSamplingPercentage" -> CurrentSamplingPercentage.asInstanceOf[js.Any],
        "DestinationS3Uri"          -> DestinationS3Uri.asInstanceOf[js.Any],
        "EnableCapture"             -> EnableCapture.asInstanceOf[js.Any],
        "KmsKeyId"                  -> KmsKeyId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DataCaptureConfigSummary]
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

  /**
    * Configuration information for the debug hook parameters, collection configuration, and storage paths.
    */
  @js.native
  trait DebugHookConfig extends js.Object {
    var S3OutputPath: S3Uri
    var CollectionConfigurations: js.UndefOr[CollectionConfigurations]
    var HookParameters: js.UndefOr[HookParameters]
    var LocalPath: js.UndefOr[DirectoryPath]
  }

  object DebugHookConfig {
    @inline
    def apply(
        S3OutputPath: S3Uri,
        CollectionConfigurations: js.UndefOr[CollectionConfigurations] = js.undefined,
        HookParameters: js.UndefOr[HookParameters] = js.undefined,
        LocalPath: js.UndefOr[DirectoryPath] = js.undefined
    ): DebugHookConfig = {
      val __obj = js.Dynamic.literal(
        "S3OutputPath" -> S3OutputPath.asInstanceOf[js.Any]
      )

      CollectionConfigurations.foreach(__v => __obj.updateDynamic("CollectionConfigurations")(__v.asInstanceOf[js.Any]))
      HookParameters.foreach(__v => __obj.updateDynamic("HookParameters")(__v.asInstanceOf[js.Any]))
      LocalPath.foreach(__v => __obj.updateDynamic("LocalPath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DebugHookConfig]
    }
  }

  /**
    * Configuration information for debugging rules.
    */
  @js.native
  trait DebugRuleConfiguration extends js.Object {
    var RuleConfigurationName: RuleConfigurationName
    var RuleEvaluatorImage: AlgorithmImage
    var InstanceType: js.UndefOr[ProcessingInstanceType]
    var LocalPath: js.UndefOr[DirectoryPath]
    var RuleParameters: js.UndefOr[RuleParameters]
    var S3OutputPath: js.UndefOr[S3Uri]
    var VolumeSizeInGB: js.UndefOr[OptionalVolumeSizeInGB]
  }

  object DebugRuleConfiguration {
    @inline
    def apply(
        RuleConfigurationName: RuleConfigurationName,
        RuleEvaluatorImage: AlgorithmImage,
        InstanceType: js.UndefOr[ProcessingInstanceType] = js.undefined,
        LocalPath: js.UndefOr[DirectoryPath] = js.undefined,
        RuleParameters: js.UndefOr[RuleParameters] = js.undefined,
        S3OutputPath: js.UndefOr[S3Uri] = js.undefined,
        VolumeSizeInGB: js.UndefOr[OptionalVolumeSizeInGB] = js.undefined
    ): DebugRuleConfiguration = {
      val __obj = js.Dynamic.literal(
        "RuleConfigurationName" -> RuleConfigurationName.asInstanceOf[js.Any],
        "RuleEvaluatorImage"    -> RuleEvaluatorImage.asInstanceOf[js.Any]
      )

      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      LocalPath.foreach(__v => __obj.updateDynamic("LocalPath")(__v.asInstanceOf[js.Any]))
      RuleParameters.foreach(__v => __obj.updateDynamic("RuleParameters")(__v.asInstanceOf[js.Any]))
      S3OutputPath.foreach(__v => __obj.updateDynamic("S3OutputPath")(__v.asInstanceOf[js.Any]))
      VolumeSizeInGB.foreach(__v => __obj.updateDynamic("VolumeSizeInGB")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DebugRuleConfiguration]
    }
  }

  /**
    * Information about the status of the rule evaluation.
    */
  @js.native
  trait DebugRuleEvaluationStatus extends js.Object {
    var LastModifiedTime: js.UndefOr[Timestamp]
    var RuleConfigurationName: js.UndefOr[RuleConfigurationName]
    var RuleEvaluationJobArn: js.UndefOr[ProcessingJobArn]
    var RuleEvaluationStatus: js.UndefOr[RuleEvaluationStatus]
    var StatusDetails: js.UndefOr[StatusDetails]
  }

  object DebugRuleEvaluationStatus {
    @inline
    def apply(
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        RuleConfigurationName: js.UndefOr[RuleConfigurationName] = js.undefined,
        RuleEvaluationJobArn: js.UndefOr[ProcessingJobArn] = js.undefined,
        RuleEvaluationStatus: js.UndefOr[RuleEvaluationStatus] = js.undefined,
        StatusDetails: js.UndefOr[StatusDetails] = js.undefined
    ): DebugRuleEvaluationStatus = {
      val __obj = js.Dynamic.literal()
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      RuleConfigurationName.foreach(__v => __obj.updateDynamic("RuleConfigurationName")(__v.asInstanceOf[js.Any]))
      RuleEvaluationJobArn.foreach(__v => __obj.updateDynamic("RuleEvaluationJobArn")(__v.asInstanceOf[js.Any]))
      RuleEvaluationStatus.foreach(__v => __obj.updateDynamic("RuleEvaluationStatus")(__v.asInstanceOf[js.Any]))
      StatusDetails.foreach(__v => __obj.updateDynamic("StatusDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DebugRuleEvaluationStatus]
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
  trait DeleteAppRequest extends js.Object {
    var AppName: AppName
    var AppType: AppType
    var DomainId: DomainId
    var UserProfileName: UserProfileName
  }

  object DeleteAppRequest {
    @inline
    def apply(
        AppName: AppName,
        AppType: AppType,
        DomainId: DomainId,
        UserProfileName: UserProfileName
    ): DeleteAppRequest = {
      val __obj = js.Dynamic.literal(
        "AppName"         -> AppName.asInstanceOf[js.Any],
        "AppType"         -> AppType.asInstanceOf[js.Any],
        "DomainId"        -> DomainId.asInstanceOf[js.Any],
        "UserProfileName" -> UserProfileName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAppRequest]
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
  trait DeleteDomainRequest extends js.Object {
    var DomainId: DomainId
    var RetentionPolicy: js.UndefOr[RetentionPolicy]
  }

  object DeleteDomainRequest {
    @inline
    def apply(
        DomainId: DomainId,
        RetentionPolicy: js.UndefOr[RetentionPolicy] = js.undefined
    ): DeleteDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainId" -> DomainId.asInstanceOf[js.Any]
      )

      RetentionPolicy.foreach(__v => __obj.updateDynamic("RetentionPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDomainRequest]
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
  trait DeleteExperimentRequest extends js.Object {
    var ExperimentName: ExperimentEntityName
  }

  object DeleteExperimentRequest {
    @inline
    def apply(
        ExperimentName: ExperimentEntityName
    ): DeleteExperimentRequest = {
      val __obj = js.Dynamic.literal(
        "ExperimentName" -> ExperimentName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteExperimentRequest]
    }
  }

  @js.native
  trait DeleteExperimentResponse extends js.Object {
    var ExperimentArn: js.UndefOr[ExperimentArn]
  }

  object DeleteExperimentResponse {
    @inline
    def apply(
        ExperimentArn: js.UndefOr[ExperimentArn] = js.undefined
    ): DeleteExperimentResponse = {
      val __obj = js.Dynamic.literal()
      ExperimentArn.foreach(__v => __obj.updateDynamic("ExperimentArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteExperimentResponse]
    }
  }

  @js.native
  trait DeleteFlowDefinitionRequest extends js.Object {
    var FlowDefinitionName: FlowDefinitionName
  }

  object DeleteFlowDefinitionRequest {
    @inline
    def apply(
        FlowDefinitionName: FlowDefinitionName
    ): DeleteFlowDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "FlowDefinitionName" -> FlowDefinitionName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteFlowDefinitionRequest]
    }
  }

  @js.native
  trait DeleteFlowDefinitionResponse extends js.Object {}

  object DeleteFlowDefinitionResponse {
    @inline
    def apply(
    ): DeleteFlowDefinitionResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteFlowDefinitionResponse]
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
  trait DeleteMonitoringScheduleRequest extends js.Object {
    var MonitoringScheduleName: MonitoringScheduleName
  }

  object DeleteMonitoringScheduleRequest {
    @inline
    def apply(
        MonitoringScheduleName: MonitoringScheduleName
    ): DeleteMonitoringScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "MonitoringScheduleName" -> MonitoringScheduleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteMonitoringScheduleRequest]
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
  trait DeleteTrialComponentRequest extends js.Object {
    var TrialComponentName: ExperimentEntityName
  }

  object DeleteTrialComponentRequest {
    @inline
    def apply(
        TrialComponentName: ExperimentEntityName
    ): DeleteTrialComponentRequest = {
      val __obj = js.Dynamic.literal(
        "TrialComponentName" -> TrialComponentName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTrialComponentRequest]
    }
  }

  @js.native
  trait DeleteTrialComponentResponse extends js.Object {
    var TrialComponentArn: js.UndefOr[TrialComponentArn]
  }

  object DeleteTrialComponentResponse {
    @inline
    def apply(
        TrialComponentArn: js.UndefOr[TrialComponentArn] = js.undefined
    ): DeleteTrialComponentResponse = {
      val __obj = js.Dynamic.literal()
      TrialComponentArn.foreach(__v => __obj.updateDynamic("TrialComponentArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteTrialComponentResponse]
    }
  }

  @js.native
  trait DeleteTrialRequest extends js.Object {
    var TrialName: ExperimentEntityName
  }

  object DeleteTrialRequest {
    @inline
    def apply(
        TrialName: ExperimentEntityName
    ): DeleteTrialRequest = {
      val __obj = js.Dynamic.literal(
        "TrialName" -> TrialName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTrialRequest]
    }
  }

  @js.native
  trait DeleteTrialResponse extends js.Object {
    var TrialArn: js.UndefOr[TrialArn]
  }

  object DeleteTrialResponse {
    @inline
    def apply(
        TrialArn: js.UndefOr[TrialArn] = js.undefined
    ): DeleteTrialResponse = {
      val __obj = js.Dynamic.literal()
      TrialArn.foreach(__v => __obj.updateDynamic("TrialArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteTrialResponse]
    }
  }

  @js.native
  trait DeleteUserProfileRequest extends js.Object {
    var DomainId: DomainId
    var UserProfileName: UserProfileName
  }

  object DeleteUserProfileRequest {
    @inline
    def apply(
        DomainId: DomainId,
        UserProfileName: UserProfileName
    ): DeleteUserProfileRequest = {
      val __obj = js.Dynamic.literal(
        "DomainId"        -> DomainId.asInstanceOf[js.Any],
        "UserProfileName" -> UserProfileName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteUserProfileRequest]
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
  trait DescribeAppRequest extends js.Object {
    var AppName: AppName
    var AppType: AppType
    var DomainId: DomainId
    var UserProfileName: UserProfileName
  }

  object DescribeAppRequest {
    @inline
    def apply(
        AppName: AppName,
        AppType: AppType,
        DomainId: DomainId,
        UserProfileName: UserProfileName
    ): DescribeAppRequest = {
      val __obj = js.Dynamic.literal(
        "AppName"         -> AppName.asInstanceOf[js.Any],
        "AppType"         -> AppType.asInstanceOf[js.Any],
        "DomainId"        -> DomainId.asInstanceOf[js.Any],
        "UserProfileName" -> UserProfileName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeAppRequest]
    }
  }

  @js.native
  trait DescribeAppResponse extends js.Object {
    var AppArn: js.UndefOr[AppArn]
    var AppName: js.UndefOr[AppName]
    var AppType: js.UndefOr[AppType]
    var CreationTime: js.UndefOr[CreationTime]
    var DomainId: js.UndefOr[DomainId]
    var FailureReason: js.UndefOr[FailureReason]
    var LastHealthCheckTimestamp: js.UndefOr[Timestamp]
    var LastUserActivityTimestamp: js.UndefOr[Timestamp]
    var ResourceSpec: js.UndefOr[ResourceSpec]
    var Status: js.UndefOr[AppStatus]
    var UserProfileName: js.UndefOr[UserProfileName]
  }

  object DescribeAppResponse {
    @inline
    def apply(
        AppArn: js.UndefOr[AppArn] = js.undefined,
        AppName: js.UndefOr[AppName] = js.undefined,
        AppType: js.UndefOr[AppType] = js.undefined,
        CreationTime: js.UndefOr[CreationTime] = js.undefined,
        DomainId: js.UndefOr[DomainId] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        LastHealthCheckTimestamp: js.UndefOr[Timestamp] = js.undefined,
        LastUserActivityTimestamp: js.UndefOr[Timestamp] = js.undefined,
        ResourceSpec: js.UndefOr[ResourceSpec] = js.undefined,
        Status: js.UndefOr[AppStatus] = js.undefined,
        UserProfileName: js.UndefOr[UserProfileName] = js.undefined
    ): DescribeAppResponse = {
      val __obj = js.Dynamic.literal()
      AppArn.foreach(__v => __obj.updateDynamic("AppArn")(__v.asInstanceOf[js.Any]))
      AppName.foreach(__v => __obj.updateDynamic("AppName")(__v.asInstanceOf[js.Any]))
      AppType.foreach(__v => __obj.updateDynamic("AppType")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DomainId.foreach(__v => __obj.updateDynamic("DomainId")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LastHealthCheckTimestamp.foreach(__v => __obj.updateDynamic("LastHealthCheckTimestamp")(__v.asInstanceOf[js.Any]))
      LastUserActivityTimestamp.foreach(__v =>
        __obj.updateDynamic("LastUserActivityTimestamp")(__v.asInstanceOf[js.Any])
      )
      ResourceSpec.foreach(__v => __obj.updateDynamic("ResourceSpec")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UserProfileName.foreach(__v => __obj.updateDynamic("UserProfileName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAppResponse]
    }
  }

  @js.native
  trait DescribeAutoMLJobRequest extends js.Object {
    var AutoMLJobName: AutoMLJobName
  }

  object DescribeAutoMLJobRequest {
    @inline
    def apply(
        AutoMLJobName: AutoMLJobName
    ): DescribeAutoMLJobRequest = {
      val __obj = js.Dynamic.literal(
        "AutoMLJobName" -> AutoMLJobName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeAutoMLJobRequest]
    }
  }

  @js.native
  trait DescribeAutoMLJobResponse extends js.Object {
    var AutoMLJobArn: AutoMLJobArn
    var AutoMLJobName: AutoMLJobName
    var AutoMLJobSecondaryStatus: AutoMLJobSecondaryStatus
    var AutoMLJobStatus: AutoMLJobStatus
    var CreationTime: Timestamp
    var InputDataConfig: AutoMLInputDataConfig
    var LastModifiedTime: Timestamp
    var OutputDataConfig: AutoMLOutputDataConfig
    var RoleArn: RoleArn
    var AutoMLJobArtifacts: js.UndefOr[AutoMLJobArtifacts]
    var AutoMLJobConfig: js.UndefOr[AutoMLJobConfig]
    var AutoMLJobObjective: js.UndefOr[AutoMLJobObjective]
    var BestCandidate: js.UndefOr[AutoMLCandidate]
    var EndTime: js.UndefOr[Timestamp]
    var FailureReason: js.UndefOr[AutoMLFailureReason]
    var GenerateCandidateDefinitionsOnly: js.UndefOr[GenerateCandidateDefinitionsOnly]
    var ProblemType: js.UndefOr[ProblemType]
    var ResolvedAttributes: js.UndefOr[ResolvedAttributes]
  }

  object DescribeAutoMLJobResponse {
    @inline
    def apply(
        AutoMLJobArn: AutoMLJobArn,
        AutoMLJobName: AutoMLJobName,
        AutoMLJobSecondaryStatus: AutoMLJobSecondaryStatus,
        AutoMLJobStatus: AutoMLJobStatus,
        CreationTime: Timestamp,
        InputDataConfig: AutoMLInputDataConfig,
        LastModifiedTime: Timestamp,
        OutputDataConfig: AutoMLOutputDataConfig,
        RoleArn: RoleArn,
        AutoMLJobArtifacts: js.UndefOr[AutoMLJobArtifacts] = js.undefined,
        AutoMLJobConfig: js.UndefOr[AutoMLJobConfig] = js.undefined,
        AutoMLJobObjective: js.UndefOr[AutoMLJobObjective] = js.undefined,
        BestCandidate: js.UndefOr[AutoMLCandidate] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        FailureReason: js.UndefOr[AutoMLFailureReason] = js.undefined,
        GenerateCandidateDefinitionsOnly: js.UndefOr[GenerateCandidateDefinitionsOnly] = js.undefined,
        ProblemType: js.UndefOr[ProblemType] = js.undefined,
        ResolvedAttributes: js.UndefOr[ResolvedAttributes] = js.undefined
    ): DescribeAutoMLJobResponse = {
      val __obj = js.Dynamic.literal(
        "AutoMLJobArn"             -> AutoMLJobArn.asInstanceOf[js.Any],
        "AutoMLJobName"            -> AutoMLJobName.asInstanceOf[js.Any],
        "AutoMLJobSecondaryStatus" -> AutoMLJobSecondaryStatus.asInstanceOf[js.Any],
        "AutoMLJobStatus"          -> AutoMLJobStatus.asInstanceOf[js.Any],
        "CreationTime"             -> CreationTime.asInstanceOf[js.Any],
        "InputDataConfig"          -> InputDataConfig.asInstanceOf[js.Any],
        "LastModifiedTime"         -> LastModifiedTime.asInstanceOf[js.Any],
        "OutputDataConfig"         -> OutputDataConfig.asInstanceOf[js.Any],
        "RoleArn"                  -> RoleArn.asInstanceOf[js.Any]
      )

      AutoMLJobArtifacts.foreach(__v => __obj.updateDynamic("AutoMLJobArtifacts")(__v.asInstanceOf[js.Any]))
      AutoMLJobConfig.foreach(__v => __obj.updateDynamic("AutoMLJobConfig")(__v.asInstanceOf[js.Any]))
      AutoMLJobObjective.foreach(__v => __obj.updateDynamic("AutoMLJobObjective")(__v.asInstanceOf[js.Any]))
      BestCandidate.foreach(__v => __obj.updateDynamic("BestCandidate")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      GenerateCandidateDefinitionsOnly.foreach(__v =>
        __obj.updateDynamic("GenerateCandidateDefinitionsOnly")(__v.asInstanceOf[js.Any])
      )
      ProblemType.foreach(__v => __obj.updateDynamic("ProblemType")(__v.asInstanceOf[js.Any]))
      ResolvedAttributes.foreach(__v => __obj.updateDynamic("ResolvedAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAutoMLJobResponse]
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
  trait DescribeDomainRequest extends js.Object {
    var DomainId: DomainId
  }

  object DescribeDomainRequest {
    @inline
    def apply(
        DomainId: DomainId
    ): DescribeDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainId" -> DomainId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeDomainRequest]
    }
  }

  @js.native
  trait DescribeDomainResponse extends js.Object {
    var AuthMode: js.UndefOr[AuthMode]
    var CreationTime: js.UndefOr[CreationTime]
    var DefaultUserSettings: js.UndefOr[UserSettings]
    var DomainArn: js.UndefOr[DomainArn]
    var DomainId: js.UndefOr[DomainId]
    var DomainName: js.UndefOr[DomainName]
    var FailureReason: js.UndefOr[FailureReason]
    var HomeEfsFileSystemId: js.UndefOr[ResourceId]
    var HomeEfsFileSystemKmsKeyId: js.UndefOr[KmsKeyId]
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
    var SingleSignOnManagedApplicationInstanceId: js.UndefOr[String256]
    var Status: js.UndefOr[DomainStatus]
    var SubnetIds: js.UndefOr[Subnets]
    var Url: js.UndefOr[String1024]
    var VpcId: js.UndefOr[VpcId]
  }

  object DescribeDomainResponse {
    @inline
    def apply(
        AuthMode: js.UndefOr[AuthMode] = js.undefined,
        CreationTime: js.UndefOr[CreationTime] = js.undefined,
        DefaultUserSettings: js.UndefOr[UserSettings] = js.undefined,
        DomainArn: js.UndefOr[DomainArn] = js.undefined,
        DomainId: js.UndefOr[DomainId] = js.undefined,
        DomainName: js.UndefOr[DomainName] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        HomeEfsFileSystemId: js.UndefOr[ResourceId] = js.undefined,
        HomeEfsFileSystemKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined,
        SingleSignOnManagedApplicationInstanceId: js.UndefOr[String256] = js.undefined,
        Status: js.UndefOr[DomainStatus] = js.undefined,
        SubnetIds: js.UndefOr[Subnets] = js.undefined,
        Url: js.UndefOr[String1024] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): DescribeDomainResponse = {
      val __obj = js.Dynamic.literal()
      AuthMode.foreach(__v => __obj.updateDynamic("AuthMode")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DefaultUserSettings.foreach(__v => __obj.updateDynamic("DefaultUserSettings")(__v.asInstanceOf[js.Any]))
      DomainArn.foreach(__v => __obj.updateDynamic("DomainArn")(__v.asInstanceOf[js.Any]))
      DomainId.foreach(__v => __obj.updateDynamic("DomainId")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      HomeEfsFileSystemId.foreach(__v => __obj.updateDynamic("HomeEfsFileSystemId")(__v.asInstanceOf[js.Any]))
      HomeEfsFileSystemKmsKeyId.foreach(__v =>
        __obj.updateDynamic("HomeEfsFileSystemKmsKeyId")(__v.asInstanceOf[js.Any])
      )
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      SingleSignOnManagedApplicationInstanceId.foreach(__v =>
        __obj.updateDynamic("SingleSignOnManagedApplicationInstanceId")(__v.asInstanceOf[js.Any])
      )
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDomainResponse]
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
    var DataCaptureConfig: js.UndefOr[DataCaptureConfig]
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object DescribeEndpointConfigOutput {
    @inline
    def apply(
        CreationTime: Timestamp,
        EndpointConfigArn: EndpointConfigArn,
        EndpointConfigName: EndpointConfigName,
        ProductionVariants: ProductionVariantList,
        DataCaptureConfig: js.UndefOr[DataCaptureConfig] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): DescribeEndpointConfigOutput = {
      val __obj = js.Dynamic.literal(
        "CreationTime"       -> CreationTime.asInstanceOf[js.Any],
        "EndpointConfigArn"  -> EndpointConfigArn.asInstanceOf[js.Any],
        "EndpointConfigName" -> EndpointConfigName.asInstanceOf[js.Any],
        "ProductionVariants" -> ProductionVariants.asInstanceOf[js.Any]
      )

      DataCaptureConfig.foreach(__v => __obj.updateDynamic("DataCaptureConfig")(__v.asInstanceOf[js.Any]))
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
    var DataCaptureConfig: js.UndefOr[DataCaptureConfigSummary]
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
        DataCaptureConfig: js.UndefOr[DataCaptureConfigSummary] = js.undefined,
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

      DataCaptureConfig.foreach(__v => __obj.updateDynamic("DataCaptureConfig")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      ProductionVariants.foreach(__v => __obj.updateDynamic("ProductionVariants")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEndpointOutput]
    }
  }

  @js.native
  trait DescribeExperimentRequest extends js.Object {
    var ExperimentName: ExperimentEntityName
  }

  object DescribeExperimentRequest {
    @inline
    def apply(
        ExperimentName: ExperimentEntityName
    ): DescribeExperimentRequest = {
      val __obj = js.Dynamic.literal(
        "ExperimentName" -> ExperimentName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeExperimentRequest]
    }
  }

  @js.native
  trait DescribeExperimentResponse extends js.Object {
    var CreatedBy: js.UndefOr[UserContext]
    var CreationTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[ExperimentDescription]
    var DisplayName: js.UndefOr[ExperimentEntityName]
    var ExperimentArn: js.UndefOr[ExperimentArn]
    var ExperimentName: js.UndefOr[ExperimentEntityName]
    var LastModifiedBy: js.UndefOr[UserContext]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Source: js.UndefOr[ExperimentSource]
  }

  object DescribeExperimentResponse {
    @inline
    def apply(
        CreatedBy: js.UndefOr[UserContext] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[ExperimentDescription] = js.undefined,
        DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined,
        ExperimentArn: js.UndefOr[ExperimentArn] = js.undefined,
        ExperimentName: js.UndefOr[ExperimentEntityName] = js.undefined,
        LastModifiedBy: js.UndefOr[UserContext] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Source: js.UndefOr[ExperimentSource] = js.undefined
    ): DescribeExperimentResponse = {
      val __obj = js.Dynamic.literal()
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      ExperimentArn.foreach(__v => __obj.updateDynamic("ExperimentArn")(__v.asInstanceOf[js.Any]))
      ExperimentName.foreach(__v => __obj.updateDynamic("ExperimentName")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeExperimentResponse]
    }
  }

  @js.native
  trait DescribeFlowDefinitionRequest extends js.Object {
    var FlowDefinitionName: FlowDefinitionName
  }

  object DescribeFlowDefinitionRequest {
    @inline
    def apply(
        FlowDefinitionName: FlowDefinitionName
    ): DescribeFlowDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "FlowDefinitionName" -> FlowDefinitionName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeFlowDefinitionRequest]
    }
  }

  @js.native
  trait DescribeFlowDefinitionResponse extends js.Object {
    var CreationTime: Timestamp
    var FlowDefinitionArn: FlowDefinitionArn
    var FlowDefinitionName: FlowDefinitionName
    var FlowDefinitionStatus: FlowDefinitionStatus
    var HumanLoopConfig: HumanLoopConfig
    var OutputConfig: FlowDefinitionOutputConfig
    var RoleArn: RoleArn
    var FailureReason: js.UndefOr[FailureReason]
    var HumanLoopActivationConfig: js.UndefOr[HumanLoopActivationConfig]
    var HumanLoopRequestSource: js.UndefOr[HumanLoopRequestSource]
  }

  object DescribeFlowDefinitionResponse {
    @inline
    def apply(
        CreationTime: Timestamp,
        FlowDefinitionArn: FlowDefinitionArn,
        FlowDefinitionName: FlowDefinitionName,
        FlowDefinitionStatus: FlowDefinitionStatus,
        HumanLoopConfig: HumanLoopConfig,
        OutputConfig: FlowDefinitionOutputConfig,
        RoleArn: RoleArn,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        HumanLoopActivationConfig: js.UndefOr[HumanLoopActivationConfig] = js.undefined,
        HumanLoopRequestSource: js.UndefOr[HumanLoopRequestSource] = js.undefined
    ): DescribeFlowDefinitionResponse = {
      val __obj = js.Dynamic.literal(
        "CreationTime"         -> CreationTime.asInstanceOf[js.Any],
        "FlowDefinitionArn"    -> FlowDefinitionArn.asInstanceOf[js.Any],
        "FlowDefinitionName"   -> FlowDefinitionName.asInstanceOf[js.Any],
        "FlowDefinitionStatus" -> FlowDefinitionStatus.asInstanceOf[js.Any],
        "HumanLoopConfig"      -> HumanLoopConfig.asInstanceOf[js.Any],
        "OutputConfig"         -> OutputConfig.asInstanceOf[js.Any],
        "RoleArn"              -> RoleArn.asInstanceOf[js.Any]
      )

      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      HumanLoopActivationConfig.foreach(__v =>
        __obj.updateDynamic("HumanLoopActivationConfig")(__v.asInstanceOf[js.Any])
      )
      HumanLoopRequestSource.foreach(__v => __obj.updateDynamic("HumanLoopRequestSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFlowDefinitionResponse]
    }
  }

  @js.native
  trait DescribeHumanTaskUiRequest extends js.Object {
    var HumanTaskUiName: HumanTaskUiName
  }

  object DescribeHumanTaskUiRequest {
    @inline
    def apply(
        HumanTaskUiName: HumanTaskUiName
    ): DescribeHumanTaskUiRequest = {
      val __obj = js.Dynamic.literal(
        "HumanTaskUiName" -> HumanTaskUiName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeHumanTaskUiRequest]
    }
  }

  @js.native
  trait DescribeHumanTaskUiResponse extends js.Object {
    var CreationTime: Timestamp
    var HumanTaskUiArn: HumanTaskUiArn
    var HumanTaskUiName: HumanTaskUiName
    var UiTemplate: UiTemplateInfo
  }

  object DescribeHumanTaskUiResponse {
    @inline
    def apply(
        CreationTime: Timestamp,
        HumanTaskUiArn: HumanTaskUiArn,
        HumanTaskUiName: HumanTaskUiName,
        UiTemplate: UiTemplateInfo
    ): DescribeHumanTaskUiResponse = {
      val __obj = js.Dynamic.literal(
        "CreationTime"    -> CreationTime.asInstanceOf[js.Any],
        "HumanTaskUiArn"  -> HumanTaskUiArn.asInstanceOf[js.Any],
        "HumanTaskUiName" -> HumanTaskUiName.asInstanceOf[js.Any],
        "UiTemplate"      -> UiTemplate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeHumanTaskUiResponse]
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
    var TrainingJobDefinitions: js.UndefOr[HyperParameterTrainingJobDefinitions]
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
        TrainingJobDefinitions: js.UndefOr[HyperParameterTrainingJobDefinitions] = js.undefined,
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
      HyperParameterTuningEndTime.foreach(__v =>
        __obj.updateDynamic("HyperParameterTuningEndTime")(__v.asInstanceOf[js.Any])
      )
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      OverallBestTrainingJob.foreach(__v => __obj.updateDynamic("OverallBestTrainingJob")(__v.asInstanceOf[js.Any]))
      TrainingJobDefinition.foreach(__v => __obj.updateDynamic("TrainingJobDefinition")(__v.asInstanceOf[js.Any]))
      TrainingJobDefinitions.foreach(__v => __obj.updateDynamic("TrainingJobDefinitions")(__v.asInstanceOf[js.Any]))
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
      LabelingJobAlgorithmsConfig.foreach(__v =>
        __obj.updateDynamic("LabelingJobAlgorithmsConfig")(__v.asInstanceOf[js.Any])
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
      SourceAlgorithmSpecification.foreach(__v =>
        __obj.updateDynamic("SourceAlgorithmSpecification")(__v.asInstanceOf[js.Any])
      )
      ValidationSpecification.foreach(__v => __obj.updateDynamic("ValidationSpecification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeModelPackageOutput]
    }
  }

  @js.native
  trait DescribeMonitoringScheduleRequest extends js.Object {
    var MonitoringScheduleName: MonitoringScheduleName
  }

  object DescribeMonitoringScheduleRequest {
    @inline
    def apply(
        MonitoringScheduleName: MonitoringScheduleName
    ): DescribeMonitoringScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "MonitoringScheduleName" -> MonitoringScheduleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeMonitoringScheduleRequest]
    }
  }

  @js.native
  trait DescribeMonitoringScheduleResponse extends js.Object {
    var CreationTime: Timestamp
    var LastModifiedTime: Timestamp
    var MonitoringScheduleArn: MonitoringScheduleArn
    var MonitoringScheduleConfig: MonitoringScheduleConfig
    var MonitoringScheduleName: MonitoringScheduleName
    var MonitoringScheduleStatus: ScheduleStatus
    var EndpointName: js.UndefOr[EndpointName]
    var FailureReason: js.UndefOr[FailureReason]
    var LastMonitoringExecutionSummary: js.UndefOr[MonitoringExecutionSummary]
  }

  object DescribeMonitoringScheduleResponse {
    @inline
    def apply(
        CreationTime: Timestamp,
        LastModifiedTime: Timestamp,
        MonitoringScheduleArn: MonitoringScheduleArn,
        MonitoringScheduleConfig: MonitoringScheduleConfig,
        MonitoringScheduleName: MonitoringScheduleName,
        MonitoringScheduleStatus: ScheduleStatus,
        EndpointName: js.UndefOr[EndpointName] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        LastMonitoringExecutionSummary: js.UndefOr[MonitoringExecutionSummary] = js.undefined
    ): DescribeMonitoringScheduleResponse = {
      val __obj = js.Dynamic.literal(
        "CreationTime"             -> CreationTime.asInstanceOf[js.Any],
        "LastModifiedTime"         -> LastModifiedTime.asInstanceOf[js.Any],
        "MonitoringScheduleArn"    -> MonitoringScheduleArn.asInstanceOf[js.Any],
        "MonitoringScheduleConfig" -> MonitoringScheduleConfig.asInstanceOf[js.Any],
        "MonitoringScheduleName"   -> MonitoringScheduleName.asInstanceOf[js.Any],
        "MonitoringScheduleStatus" -> MonitoringScheduleStatus.asInstanceOf[js.Any]
      )

      EndpointName.foreach(__v => __obj.updateDynamic("EndpointName")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LastMonitoringExecutionSummary.foreach(__v =>
        __obj.updateDynamic("LastMonitoringExecutionSummary")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeMonitoringScheduleResponse]
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
      NotebookInstanceLifecycleConfigArn.foreach(__v =>
        __obj.updateDynamic("NotebookInstanceLifecycleConfigArn")(__v.asInstanceOf[js.Any])
      )
      NotebookInstanceLifecycleConfigName.foreach(__v =>
        __obj.updateDynamic("NotebookInstanceLifecycleConfigName")(__v.asInstanceOf[js.Any])
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
      AdditionalCodeRepositories.foreach(__v =>
        __obj.updateDynamic("AdditionalCodeRepositories")(__v.asInstanceOf[js.Any])
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
      NotebookInstanceLifecycleConfigName.foreach(__v =>
        __obj.updateDynamic("NotebookInstanceLifecycleConfigName")(__v.asInstanceOf[js.Any])
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
  trait DescribeProcessingJobRequest extends js.Object {
    var ProcessingJobName: ProcessingJobName
  }

  object DescribeProcessingJobRequest {
    @inline
    def apply(
        ProcessingJobName: ProcessingJobName
    ): DescribeProcessingJobRequest = {
      val __obj = js.Dynamic.literal(
        "ProcessingJobName" -> ProcessingJobName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeProcessingJobRequest]
    }
  }

  @js.native
  trait DescribeProcessingJobResponse extends js.Object {
    var AppSpecification: AppSpecification
    var CreationTime: Timestamp
    var ProcessingJobArn: ProcessingJobArn
    var ProcessingJobName: ProcessingJobName
    var ProcessingJobStatus: ProcessingJobStatus
    var ProcessingResources: ProcessingResources
    var AutoMLJobArn: js.UndefOr[AutoMLJobArn]
    var Environment: js.UndefOr[ProcessingEnvironmentMap]
    var ExitMessage: js.UndefOr[ExitMessage]
    var ExperimentConfig: js.UndefOr[ExperimentConfig]
    var FailureReason: js.UndefOr[FailureReason]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var MonitoringScheduleArn: js.UndefOr[MonitoringScheduleArn]
    var NetworkConfig: js.UndefOr[NetworkConfig]
    var ProcessingEndTime: js.UndefOr[Timestamp]
    var ProcessingInputs: js.UndefOr[ProcessingInputs]
    var ProcessingOutputConfig: js.UndefOr[ProcessingOutputConfig]
    var ProcessingStartTime: js.UndefOr[Timestamp]
    var RoleArn: js.UndefOr[RoleArn]
    var StoppingCondition: js.UndefOr[ProcessingStoppingCondition]
    var TrainingJobArn: js.UndefOr[TrainingJobArn]
  }

  object DescribeProcessingJobResponse {
    @inline
    def apply(
        AppSpecification: AppSpecification,
        CreationTime: Timestamp,
        ProcessingJobArn: ProcessingJobArn,
        ProcessingJobName: ProcessingJobName,
        ProcessingJobStatus: ProcessingJobStatus,
        ProcessingResources: ProcessingResources,
        AutoMLJobArn: js.UndefOr[AutoMLJobArn] = js.undefined,
        Environment: js.UndefOr[ProcessingEnvironmentMap] = js.undefined,
        ExitMessage: js.UndefOr[ExitMessage] = js.undefined,
        ExperimentConfig: js.UndefOr[ExperimentConfig] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        MonitoringScheduleArn: js.UndefOr[MonitoringScheduleArn] = js.undefined,
        NetworkConfig: js.UndefOr[NetworkConfig] = js.undefined,
        ProcessingEndTime: js.UndefOr[Timestamp] = js.undefined,
        ProcessingInputs: js.UndefOr[ProcessingInputs] = js.undefined,
        ProcessingOutputConfig: js.UndefOr[ProcessingOutputConfig] = js.undefined,
        ProcessingStartTime: js.UndefOr[Timestamp] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        StoppingCondition: js.UndefOr[ProcessingStoppingCondition] = js.undefined,
        TrainingJobArn: js.UndefOr[TrainingJobArn] = js.undefined
    ): DescribeProcessingJobResponse = {
      val __obj = js.Dynamic.literal(
        "AppSpecification"    -> AppSpecification.asInstanceOf[js.Any],
        "CreationTime"        -> CreationTime.asInstanceOf[js.Any],
        "ProcessingJobArn"    -> ProcessingJobArn.asInstanceOf[js.Any],
        "ProcessingJobName"   -> ProcessingJobName.asInstanceOf[js.Any],
        "ProcessingJobStatus" -> ProcessingJobStatus.asInstanceOf[js.Any],
        "ProcessingResources" -> ProcessingResources.asInstanceOf[js.Any]
      )

      AutoMLJobArn.foreach(__v => __obj.updateDynamic("AutoMLJobArn")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      ExitMessage.foreach(__v => __obj.updateDynamic("ExitMessage")(__v.asInstanceOf[js.Any]))
      ExperimentConfig.foreach(__v => __obj.updateDynamic("ExperimentConfig")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      MonitoringScheduleArn.foreach(__v => __obj.updateDynamic("MonitoringScheduleArn")(__v.asInstanceOf[js.Any]))
      NetworkConfig.foreach(__v => __obj.updateDynamic("NetworkConfig")(__v.asInstanceOf[js.Any]))
      ProcessingEndTime.foreach(__v => __obj.updateDynamic("ProcessingEndTime")(__v.asInstanceOf[js.Any]))
      ProcessingInputs.foreach(__v => __obj.updateDynamic("ProcessingInputs")(__v.asInstanceOf[js.Any]))
      ProcessingOutputConfig.foreach(__v => __obj.updateDynamic("ProcessingOutputConfig")(__v.asInstanceOf[js.Any]))
      ProcessingStartTime.foreach(__v => __obj.updateDynamic("ProcessingStartTime")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      StoppingCondition.foreach(__v => __obj.updateDynamic("StoppingCondition")(__v.asInstanceOf[js.Any]))
      TrainingJobArn.foreach(__v => __obj.updateDynamic("TrainingJobArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProcessingJobResponse]
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
    var AutoMLJobArn: js.UndefOr[AutoMLJobArn]
    var BillableTimeInSeconds: js.UndefOr[BillableTimeInSeconds]
    var CheckpointConfig: js.UndefOr[CheckpointConfig]
    var DebugHookConfig: js.UndefOr[DebugHookConfig]
    var DebugRuleConfigurations: js.UndefOr[DebugRuleConfigurations]
    var DebugRuleEvaluationStatuses: js.UndefOr[DebugRuleEvaluationStatuses]
    var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean]
    var EnableManagedSpotTraining: js.UndefOr[Boolean]
    var EnableNetworkIsolation: js.UndefOr[Boolean]
    var ExperimentConfig: js.UndefOr[ExperimentConfig]
    var FailureReason: js.UndefOr[FailureReason]
    var FinalMetricDataList: js.UndefOr[FinalMetricDataList]
    var HyperParameters: js.UndefOr[HyperParameters]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var LabelingJobArn: js.UndefOr[LabelingJobArn]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var RoleArn: js.UndefOr[RoleArn]
    var SecondaryStatusTransitions: js.UndefOr[SecondaryStatusTransitions]
    var TensorBoardOutputConfig: js.UndefOr[TensorBoardOutputConfig]
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
        AutoMLJobArn: js.UndefOr[AutoMLJobArn] = js.undefined,
        BillableTimeInSeconds: js.UndefOr[BillableTimeInSeconds] = js.undefined,
        CheckpointConfig: js.UndefOr[CheckpointConfig] = js.undefined,
        DebugHookConfig: js.UndefOr[DebugHookConfig] = js.undefined,
        DebugRuleConfigurations: js.UndefOr[DebugRuleConfigurations] = js.undefined,
        DebugRuleEvaluationStatuses: js.UndefOr[DebugRuleEvaluationStatuses] = js.undefined,
        EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined,
        EnableManagedSpotTraining: js.UndefOr[Boolean] = js.undefined,
        EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
        ExperimentConfig: js.UndefOr[ExperimentConfig] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        FinalMetricDataList: js.UndefOr[FinalMetricDataList] = js.undefined,
        HyperParameters: js.UndefOr[HyperParameters] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        LabelingJobArn: js.UndefOr[LabelingJobArn] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        SecondaryStatusTransitions: js.UndefOr[SecondaryStatusTransitions] = js.undefined,
        TensorBoardOutputConfig: js.UndefOr[TensorBoardOutputConfig] = js.undefined,
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

      AutoMLJobArn.foreach(__v => __obj.updateDynamic("AutoMLJobArn")(__v.asInstanceOf[js.Any]))
      BillableTimeInSeconds.foreach(__v => __obj.updateDynamic("BillableTimeInSeconds")(__v.asInstanceOf[js.Any]))
      CheckpointConfig.foreach(__v => __obj.updateDynamic("CheckpointConfig")(__v.asInstanceOf[js.Any]))
      DebugHookConfig.foreach(__v => __obj.updateDynamic("DebugHookConfig")(__v.asInstanceOf[js.Any]))
      DebugRuleConfigurations.foreach(__v => __obj.updateDynamic("DebugRuleConfigurations")(__v.asInstanceOf[js.Any]))
      DebugRuleEvaluationStatuses.foreach(__v =>
        __obj.updateDynamic("DebugRuleEvaluationStatuses")(__v.asInstanceOf[js.Any])
      )
      EnableInterContainerTrafficEncryption.foreach(__v =>
        __obj.updateDynamic("EnableInterContainerTrafficEncryption")(__v.asInstanceOf[js.Any])
      )
      EnableManagedSpotTraining.foreach(__v =>
        __obj.updateDynamic("EnableManagedSpotTraining")(__v.asInstanceOf[js.Any])
      )
      EnableNetworkIsolation.foreach(__v => __obj.updateDynamic("EnableNetworkIsolation")(__v.asInstanceOf[js.Any]))
      ExperimentConfig.foreach(__v => __obj.updateDynamic("ExperimentConfig")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      FinalMetricDataList.foreach(__v => __obj.updateDynamic("FinalMetricDataList")(__v.asInstanceOf[js.Any]))
      HyperParameters.foreach(__v => __obj.updateDynamic("HyperParameters")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      LabelingJobArn.foreach(__v => __obj.updateDynamic("LabelingJobArn")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.updateDynamic("OutputDataConfig")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      SecondaryStatusTransitions.foreach(__v =>
        __obj.updateDynamic("SecondaryStatusTransitions")(__v.asInstanceOf[js.Any])
      )
      TensorBoardOutputConfig.foreach(__v => __obj.updateDynamic("TensorBoardOutputConfig")(__v.asInstanceOf[js.Any]))
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
    var AutoMLJobArn: js.UndefOr[AutoMLJobArn]
    var BatchStrategy: js.UndefOr[BatchStrategy]
    var DataProcessing: js.UndefOr[DataProcessing]
    var Environment: js.UndefOr[TransformEnvironmentMap]
    var ExperimentConfig: js.UndefOr[ExperimentConfig]
    var FailureReason: js.UndefOr[FailureReason]
    var LabelingJobArn: js.UndefOr[LabelingJobArn]
    var MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms]
    var MaxPayloadInMB: js.UndefOr[MaxPayloadInMB]
    var ModelClientConfig: js.UndefOr[ModelClientConfig]
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
        AutoMLJobArn: js.UndefOr[AutoMLJobArn] = js.undefined,
        BatchStrategy: js.UndefOr[BatchStrategy] = js.undefined,
        DataProcessing: js.UndefOr[DataProcessing] = js.undefined,
        Environment: js.UndefOr[TransformEnvironmentMap] = js.undefined,
        ExperimentConfig: js.UndefOr[ExperimentConfig] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        LabelingJobArn: js.UndefOr[LabelingJobArn] = js.undefined,
        MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms] = js.undefined,
        MaxPayloadInMB: js.UndefOr[MaxPayloadInMB] = js.undefined,
        ModelClientConfig: js.UndefOr[ModelClientConfig] = js.undefined,
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

      AutoMLJobArn.foreach(__v => __obj.updateDynamic("AutoMLJobArn")(__v.asInstanceOf[js.Any]))
      BatchStrategy.foreach(__v => __obj.updateDynamic("BatchStrategy")(__v.asInstanceOf[js.Any]))
      DataProcessing.foreach(__v => __obj.updateDynamic("DataProcessing")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      ExperimentConfig.foreach(__v => __obj.updateDynamic("ExperimentConfig")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LabelingJobArn.foreach(__v => __obj.updateDynamic("LabelingJobArn")(__v.asInstanceOf[js.Any]))
      MaxConcurrentTransforms.foreach(__v => __obj.updateDynamic("MaxConcurrentTransforms")(__v.asInstanceOf[js.Any]))
      MaxPayloadInMB.foreach(__v => __obj.updateDynamic("MaxPayloadInMB")(__v.asInstanceOf[js.Any]))
      ModelClientConfig.foreach(__v => __obj.updateDynamic("ModelClientConfig")(__v.asInstanceOf[js.Any]))
      TransformEndTime.foreach(__v => __obj.updateDynamic("TransformEndTime")(__v.asInstanceOf[js.Any]))
      TransformOutput.foreach(__v => __obj.updateDynamic("TransformOutput")(__v.asInstanceOf[js.Any]))
      TransformStartTime.foreach(__v => __obj.updateDynamic("TransformStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTransformJobResponse]
    }
  }

  @js.native
  trait DescribeTrialComponentRequest extends js.Object {
    var TrialComponentName: ExperimentEntityName
  }

  object DescribeTrialComponentRequest {
    @inline
    def apply(
        TrialComponentName: ExperimentEntityName
    ): DescribeTrialComponentRequest = {
      val __obj = js.Dynamic.literal(
        "TrialComponentName" -> TrialComponentName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeTrialComponentRequest]
    }
  }

  @js.native
  trait DescribeTrialComponentResponse extends js.Object {
    var CreatedBy: js.UndefOr[UserContext]
    var CreationTime: js.UndefOr[Timestamp]
    var DisplayName: js.UndefOr[ExperimentEntityName]
    var EndTime: js.UndefOr[Timestamp]
    var InputArtifacts: js.UndefOr[TrialComponentArtifacts]
    var LastModifiedBy: js.UndefOr[UserContext]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Metrics: js.UndefOr[TrialComponentMetricSummaries]
    var OutputArtifacts: js.UndefOr[TrialComponentArtifacts]
    var Parameters: js.UndefOr[TrialComponentParameters]
    var Source: js.UndefOr[TrialComponentSource]
    var StartTime: js.UndefOr[Timestamp]
    var Status: js.UndefOr[TrialComponentStatus]
    var TrialComponentArn: js.UndefOr[TrialComponentArn]
    var TrialComponentName: js.UndefOr[ExperimentEntityName]
  }

  object DescribeTrialComponentResponse {
    @inline
    def apply(
        CreatedBy: js.UndefOr[UserContext] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        InputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.undefined,
        LastModifiedBy: js.UndefOr[UserContext] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Metrics: js.UndefOr[TrialComponentMetricSummaries] = js.undefined,
        OutputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.undefined,
        Parameters: js.UndefOr[TrialComponentParameters] = js.undefined,
        Source: js.UndefOr[TrialComponentSource] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[TrialComponentStatus] = js.undefined,
        TrialComponentArn: js.UndefOr[TrialComponentArn] = js.undefined,
        TrialComponentName: js.UndefOr[ExperimentEntityName] = js.undefined
    ): DescribeTrialComponentResponse = {
      val __obj = js.Dynamic.literal()
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      InputArtifacts.foreach(__v => __obj.updateDynamic("InputArtifacts")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      OutputArtifacts.foreach(__v => __obj.updateDynamic("OutputArtifacts")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TrialComponentArn.foreach(__v => __obj.updateDynamic("TrialComponentArn")(__v.asInstanceOf[js.Any]))
      TrialComponentName.foreach(__v => __obj.updateDynamic("TrialComponentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTrialComponentResponse]
    }
  }

  @js.native
  trait DescribeTrialRequest extends js.Object {
    var TrialName: ExperimentEntityName
  }

  object DescribeTrialRequest {
    @inline
    def apply(
        TrialName: ExperimentEntityName
    ): DescribeTrialRequest = {
      val __obj = js.Dynamic.literal(
        "TrialName" -> TrialName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeTrialRequest]
    }
  }

  @js.native
  trait DescribeTrialResponse extends js.Object {
    var CreatedBy: js.UndefOr[UserContext]
    var CreationTime: js.UndefOr[Timestamp]
    var DisplayName: js.UndefOr[ExperimentEntityName]
    var ExperimentName: js.UndefOr[ExperimentEntityName]
    var LastModifiedBy: js.UndefOr[UserContext]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Source: js.UndefOr[TrialSource]
    var TrialArn: js.UndefOr[TrialArn]
    var TrialName: js.UndefOr[ExperimentEntityName]
  }

  object DescribeTrialResponse {
    @inline
    def apply(
        CreatedBy: js.UndefOr[UserContext] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined,
        ExperimentName: js.UndefOr[ExperimentEntityName] = js.undefined,
        LastModifiedBy: js.UndefOr[UserContext] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Source: js.UndefOr[TrialSource] = js.undefined,
        TrialArn: js.UndefOr[TrialArn] = js.undefined,
        TrialName: js.UndefOr[ExperimentEntityName] = js.undefined
    ): DescribeTrialResponse = {
      val __obj = js.Dynamic.literal()
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      ExperimentName.foreach(__v => __obj.updateDynamic("ExperimentName")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      TrialArn.foreach(__v => __obj.updateDynamic("TrialArn")(__v.asInstanceOf[js.Any]))
      TrialName.foreach(__v => __obj.updateDynamic("TrialName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTrialResponse]
    }
  }

  @js.native
  trait DescribeUserProfileRequest extends js.Object {
    var DomainId: DomainId
    var UserProfileName: UserProfileName
  }

  object DescribeUserProfileRequest {
    @inline
    def apply(
        DomainId: DomainId,
        UserProfileName: UserProfileName
    ): DescribeUserProfileRequest = {
      val __obj = js.Dynamic.literal(
        "DomainId"        -> DomainId.asInstanceOf[js.Any],
        "UserProfileName" -> UserProfileName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeUserProfileRequest]
    }
  }

  @js.native
  trait DescribeUserProfileResponse extends js.Object {
    var CreationTime: js.UndefOr[CreationTime]
    var DomainId: js.UndefOr[DomainId]
    var FailureReason: js.UndefOr[FailureReason]
    var HomeEfsFileSystemUid: js.UndefOr[EfsUid]
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
    var SingleSignOnUserIdentifier: js.UndefOr[SingleSignOnUserIdentifier]
    var SingleSignOnUserValue: js.UndefOr[String256]
    var Status: js.UndefOr[UserProfileStatus]
    var UserProfileArn: js.UndefOr[UserProfileArn]
    var UserProfileName: js.UndefOr[UserProfileName]
    var UserSettings: js.UndefOr[UserSettings]
  }

  object DescribeUserProfileResponse {
    @inline
    def apply(
        CreationTime: js.UndefOr[CreationTime] = js.undefined,
        DomainId: js.UndefOr[DomainId] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        HomeEfsFileSystemUid: js.UndefOr[EfsUid] = js.undefined,
        LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined,
        SingleSignOnUserIdentifier: js.UndefOr[SingleSignOnUserIdentifier] = js.undefined,
        SingleSignOnUserValue: js.UndefOr[String256] = js.undefined,
        Status: js.UndefOr[UserProfileStatus] = js.undefined,
        UserProfileArn: js.UndefOr[UserProfileArn] = js.undefined,
        UserProfileName: js.UndefOr[UserProfileName] = js.undefined,
        UserSettings: js.UndefOr[UserSettings] = js.undefined
    ): DescribeUserProfileResponse = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DomainId.foreach(__v => __obj.updateDynamic("DomainId")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      HomeEfsFileSystemUid.foreach(__v => __obj.updateDynamic("HomeEfsFileSystemUid")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      SingleSignOnUserIdentifier.foreach(__v =>
        __obj.updateDynamic("SingleSignOnUserIdentifier")(__v.asInstanceOf[js.Any])
      )
      SingleSignOnUserValue.foreach(__v => __obj.updateDynamic("SingleSignOnUserValue")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UserProfileArn.foreach(__v => __obj.updateDynamic("UserProfileArn")(__v.asInstanceOf[js.Any]))
      UserProfileName.foreach(__v => __obj.updateDynamic("UserProfileName")(__v.asInstanceOf[js.Any]))
      UserSettings.foreach(__v => __obj.updateDynamic("UserSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserProfileResponse]
    }
  }

  @js.native
  trait DescribeWorkforceRequest extends js.Object {
    var WorkforceName: WorkforceName
  }

  object DescribeWorkforceRequest {
    @inline
    def apply(
        WorkforceName: WorkforceName
    ): DescribeWorkforceRequest = {
      val __obj = js.Dynamic.literal(
        "WorkforceName" -> WorkforceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeWorkforceRequest]
    }
  }

  @js.native
  trait DescribeWorkforceResponse extends js.Object {
    var Workforce: Workforce
  }

  object DescribeWorkforceResponse {
    @inline
    def apply(
        Workforce: Workforce
    ): DescribeWorkforceResponse = {
      val __obj = js.Dynamic.literal(
        "Workforce" -> Workforce.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeWorkforceResponse]
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

  @js.native
  sealed trait DetailedAlgorithmStatus extends js.Any
  object DetailedAlgorithmStatus extends js.Object {
    val NotStarted = "NotStarted".asInstanceOf[DetailedAlgorithmStatus]
    val InProgress = "InProgress".asInstanceOf[DetailedAlgorithmStatus]
    val Completed  = "Completed".asInstanceOf[DetailedAlgorithmStatus]
    val Failed     = "Failed".asInstanceOf[DetailedAlgorithmStatus]

    val values = js.Object.freeze(js.Array(NotStarted, InProgress, Completed, Failed))
  }

  @js.native
  sealed trait DetailedModelPackageStatus extends js.Any
  object DetailedModelPackageStatus extends js.Object {
    val NotStarted = "NotStarted".asInstanceOf[DetailedModelPackageStatus]
    val InProgress = "InProgress".asInstanceOf[DetailedModelPackageStatus]
    val Completed  = "Completed".asInstanceOf[DetailedModelPackageStatus]
    val Failed     = "Failed".asInstanceOf[DetailedModelPackageStatus]

    val values = js.Object.freeze(js.Array(NotStarted, InProgress, Completed, Failed))
  }

  @js.native
  sealed trait DirectInternetAccess extends js.Any
  object DirectInternetAccess extends js.Object {
    val Enabled  = "Enabled".asInstanceOf[DirectInternetAccess]
    val Disabled = "Disabled".asInstanceOf[DirectInternetAccess]

    val values = js.Object.freeze(js.Array(Enabled, Disabled))
  }

  @js.native
  trait DisassociateTrialComponentRequest extends js.Object {
    var TrialComponentName: ExperimentEntityName
    var TrialName: ExperimentEntityName
  }

  object DisassociateTrialComponentRequest {
    @inline
    def apply(
        TrialComponentName: ExperimentEntityName,
        TrialName: ExperimentEntityName
    ): DisassociateTrialComponentRequest = {
      val __obj = js.Dynamic.literal(
        "TrialComponentName" -> TrialComponentName.asInstanceOf[js.Any],
        "TrialName"          -> TrialName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateTrialComponentRequest]
    }
  }

  @js.native
  trait DisassociateTrialComponentResponse extends js.Object {
    var TrialArn: js.UndefOr[TrialArn]
    var TrialComponentArn: js.UndefOr[TrialComponentArn]
  }

  object DisassociateTrialComponentResponse {
    @inline
    def apply(
        TrialArn: js.UndefOr[TrialArn] = js.undefined,
        TrialComponentArn: js.UndefOr[TrialComponentArn] = js.undefined
    ): DisassociateTrialComponentResponse = {
      val __obj = js.Dynamic.literal()
      TrialArn.foreach(__v => __obj.updateDynamic("TrialArn")(__v.asInstanceOf[js.Any]))
      TrialComponentArn.foreach(__v => __obj.updateDynamic("TrialComponentArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateTrialComponentResponse]
    }
  }

  /**
    * The domain's details.
    */
  @js.native
  trait DomainDetails extends js.Object {
    var CreationTime: js.UndefOr[CreationTime]
    var DomainArn: js.UndefOr[DomainArn]
    var DomainId: js.UndefOr[DomainId]
    var DomainName: js.UndefOr[DomainName]
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
    var Status: js.UndefOr[DomainStatus]
    var Url: js.UndefOr[String1024]
  }

  object DomainDetails {
    @inline
    def apply(
        CreationTime: js.UndefOr[CreationTime] = js.undefined,
        DomainArn: js.UndefOr[DomainArn] = js.undefined,
        DomainId: js.UndefOr[DomainId] = js.undefined,
        DomainName: js.UndefOr[DomainName] = js.undefined,
        LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined,
        Status: js.UndefOr[DomainStatus] = js.undefined,
        Url: js.UndefOr[String1024] = js.undefined
    ): DomainDetails = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DomainArn.foreach(__v => __obj.updateDynamic("DomainArn")(__v.asInstanceOf[js.Any]))
      DomainId.foreach(__v => __obj.updateDynamic("DomainId")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainDetails]
    }
  }

  @js.native
  sealed trait DomainStatus extends js.Any
  object DomainStatus extends js.Object {
    val Deleting  = "Deleting".asInstanceOf[DomainStatus]
    val Failed    = "Failed".asInstanceOf[DomainStatus]
    val InService = "InService".asInstanceOf[DomainStatus]
    val Pending   = "Pending".asInstanceOf[DomainStatus]

    val values = js.Object.freeze(js.Array(Deleting, Failed, InService, Pending))
  }

  @js.native
  sealed trait EndpointConfigSortKey extends js.Any
  object EndpointConfigSortKey extends js.Object {
    val Name         = "Name".asInstanceOf[EndpointConfigSortKey]
    val CreationTime = "CreationTime".asInstanceOf[EndpointConfigSortKey]

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

  /**
    * Input object for the endpoint
    */
  @js.native
  trait EndpointInput extends js.Object {
    var EndpointName: EndpointName
    var LocalPath: ProcessingLocalPath
    var S3DataDistributionType: js.UndefOr[ProcessingS3DataDistributionType]
    var S3InputMode: js.UndefOr[ProcessingS3InputMode]
  }

  object EndpointInput {
    @inline
    def apply(
        EndpointName: EndpointName,
        LocalPath: ProcessingLocalPath,
        S3DataDistributionType: js.UndefOr[ProcessingS3DataDistributionType] = js.undefined,
        S3InputMode: js.UndefOr[ProcessingS3InputMode] = js.undefined
    ): EndpointInput = {
      val __obj = js.Dynamic.literal(
        "EndpointName" -> EndpointName.asInstanceOf[js.Any],
        "LocalPath"    -> LocalPath.asInstanceOf[js.Any]
      )

      S3DataDistributionType.foreach(__v => __obj.updateDynamic("S3DataDistributionType")(__v.asInstanceOf[js.Any]))
      S3InputMode.foreach(__v => __obj.updateDynamic("S3InputMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointInput]
    }
  }

  @js.native
  sealed trait EndpointSortKey extends js.Any
  object EndpointSortKey extends js.Object {
    val Name         = "Name".asInstanceOf[EndpointSortKey]
    val CreationTime = "CreationTime".asInstanceOf[EndpointSortKey]
    val Status       = "Status".asInstanceOf[EndpointSortKey]

    val values = js.Object.freeze(js.Array(Name, CreationTime, Status))
  }

  @js.native
  sealed trait EndpointStatus extends js.Any
  object EndpointStatus extends js.Object {
    val OutOfService   = "OutOfService".asInstanceOf[EndpointStatus]
    val Creating       = "Creating".asInstanceOf[EndpointStatus]
    val Updating       = "Updating".asInstanceOf[EndpointStatus]
    val SystemUpdating = "SystemUpdating".asInstanceOf[EndpointStatus]
    val RollingBack    = "RollingBack".asInstanceOf[EndpointStatus]
    val InService      = "InService".asInstanceOf[EndpointStatus]
    val Deleting       = "Deleting".asInstanceOf[EndpointStatus]
    val Failed         = "Failed".asInstanceOf[EndpointStatus]

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

  @js.native
  sealed trait ExecutionStatus extends js.Any
  object ExecutionStatus extends js.Object {
    val Pending                 = "Pending".asInstanceOf[ExecutionStatus]
    val Completed               = "Completed".asInstanceOf[ExecutionStatus]
    val CompletedWithViolations = "CompletedWithViolations".asInstanceOf[ExecutionStatus]
    val InProgress              = "InProgress".asInstanceOf[ExecutionStatus]
    val Failed                  = "Failed".asInstanceOf[ExecutionStatus]
    val Stopping                = "Stopping".asInstanceOf[ExecutionStatus]
    val Stopped                 = "Stopped".asInstanceOf[ExecutionStatus]

    val values =
      js.Object.freeze(js.Array(Pending, Completed, CompletedWithViolations, InProgress, Failed, Stopping, Stopped))
  }

  /**
    * The properties of an experiment as returned by the <a>Search</a> API.
    */
  @js.native
  trait Experiment extends js.Object {
    var CreatedBy: js.UndefOr[UserContext]
    var CreationTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[ExperimentDescription]
    var DisplayName: js.UndefOr[ExperimentEntityName]
    var ExperimentArn: js.UndefOr[ExperimentArn]
    var ExperimentName: js.UndefOr[ExperimentEntityName]
    var LastModifiedBy: js.UndefOr[UserContext]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Source: js.UndefOr[ExperimentSource]
    var Tags: js.UndefOr[TagList]
  }

  object Experiment {
    @inline
    def apply(
        CreatedBy: js.UndefOr[UserContext] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[ExperimentDescription] = js.undefined,
        DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined,
        ExperimentArn: js.UndefOr[ExperimentArn] = js.undefined,
        ExperimentName: js.UndefOr[ExperimentEntityName] = js.undefined,
        LastModifiedBy: js.UndefOr[UserContext] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Source: js.UndefOr[ExperimentSource] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): Experiment = {
      val __obj = js.Dynamic.literal()
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      ExperimentArn.foreach(__v => __obj.updateDynamic("ExperimentArn")(__v.asInstanceOf[js.Any]))
      ExperimentName.foreach(__v => __obj.updateDynamic("ExperimentName")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Experiment]
    }
  }

  /**
    * Configuration for the experiment.
    */
  @js.native
  trait ExperimentConfig extends js.Object {
    var ExperimentName: js.UndefOr[ExperimentEntityName]
    var TrialComponentDisplayName: js.UndefOr[ExperimentEntityName]
    var TrialName: js.UndefOr[ExperimentEntityName]
  }

  object ExperimentConfig {
    @inline
    def apply(
        ExperimentName: js.UndefOr[ExperimentEntityName] = js.undefined,
        TrialComponentDisplayName: js.UndefOr[ExperimentEntityName] = js.undefined,
        TrialName: js.UndefOr[ExperimentEntityName] = js.undefined
    ): ExperimentConfig = {
      val __obj = js.Dynamic.literal()
      ExperimentName.foreach(__v => __obj.updateDynamic("ExperimentName")(__v.asInstanceOf[js.Any]))
      TrialComponentDisplayName.foreach(__v =>
        __obj.updateDynamic("TrialComponentDisplayName")(__v.asInstanceOf[js.Any])
      )
      TrialName.foreach(__v => __obj.updateDynamic("TrialName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentConfig]
    }
  }

  /**
    * The source of the experiment.
    */
  @js.native
  trait ExperimentSource extends js.Object {
    var SourceArn: ExperimentSourceArn
    var SourceType: js.UndefOr[SourceType]
  }

  object ExperimentSource {
    @inline
    def apply(
        SourceArn: ExperimentSourceArn,
        SourceType: js.UndefOr[SourceType] = js.undefined
    ): ExperimentSource = {
      val __obj = js.Dynamic.literal(
        "SourceArn" -> SourceArn.asInstanceOf[js.Any]
      )

      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentSource]
    }
  }

  /**
    * A summary of the properties of an experiment. To get the complete set of properties, call the <a>DescribeExperiment</a> API and provide the <code>ExperimentName</code>.
    */
  @js.native
  trait ExperimentSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DisplayName: js.UndefOr[ExperimentEntityName]
    var ExperimentArn: js.UndefOr[ExperimentArn]
    var ExperimentName: js.UndefOr[ExperimentEntityName]
    var ExperimentSource: js.UndefOr[ExperimentSource]
    var LastModifiedTime: js.UndefOr[Timestamp]
  }

  object ExperimentSummary {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined,
        ExperimentArn: js.UndefOr[ExperimentArn] = js.undefined,
        ExperimentName: js.UndefOr[ExperimentEntityName] = js.undefined,
        ExperimentSource: js.UndefOr[ExperimentSource] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
    ): ExperimentSummary = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      ExperimentArn.foreach(__v => __obj.updateDynamic("ExperimentArn")(__v.asInstanceOf[js.Any]))
      ExperimentName.foreach(__v => __obj.updateDynamic("ExperimentName")(__v.asInstanceOf[js.Any]))
      ExperimentSource.foreach(__v => __obj.updateDynamic("ExperimentSource")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentSummary]
    }
  }

  @js.native
  sealed trait FileSystemAccessMode extends js.Any
  object FileSystemAccessMode extends js.Object {
    val rw = "rw".asInstanceOf[FileSystemAccessMode]
    val ro = "ro".asInstanceOf[FileSystemAccessMode]

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

  @js.native
  sealed trait FileSystemType extends js.Any
  object FileSystemType extends js.Object {
    val EFS       = "EFS".asInstanceOf[FileSystemType]
    val FSxLustre = "FSxLustre".asInstanceOf[FileSystemType]

    val values = js.Object.freeze(js.Array(EFS, FSxLustre))
  }

  /**
    * A conditional statement for a search expression that includes a resource property, a Boolean operator, and a value. Resources that match the statement are returned in the results from the <a>Search</a> API.
    *  If you specify a <code>Value</code>, but not an <code>Operator</code>, Amazon SageMaker uses the equals operator.
    *  In search, there are several property types:
    *  <dl> <dt>Metrics</dt> <dd> To define a metric filter, enter a value using the form <code>"Metrics.&lt;name&gt;"</code>, where <code>&lt;name&gt;</code> is a metric name. For example, the following filter searches for training jobs with an <code>"accuracy"</code> metric greater than <code>"0.9"</code>:
    *  <code>{</code>
    *  <code>"Name": "Metrics.accuracy",</code>
    *  <code>"Operator": "GreaterThan",</code>
    *  <code>"Value": "0.9"</code>
    *  <code>}</code>
    *  </dd> <dt>HyperParameters</dt> <dd> To define a hyperparameter filter, enter a value with the form <code>"HyperParameters.&lt;name&gt;"</code>. Decimal hyperparameter values are treated as a decimal in a comparison if the specified <code>Value</code> is also a decimal value. If the specified <code>Value</code> is an integer, the decimal hyperparameter values are treated as integers. For example, the following filter is satisfied by training jobs with a <code>"learning_rate"</code> hyperparameter that is less than <code>"0.5"</code>:
    *  <code> {</code>
    *  <code> "Name": "HyperParameters.learning_rate",</code>
    *  <code> "Operator": "LessThan",</code>
    *  <code> "Value": "0.5"</code>
    *  <code> }</code>
    *  </dd> <dt>Tags</dt> <dd> To define a tag filter, enter a value with the form <code>Tags.&lt;key&gt;</code>.
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
    * The candidate result from a job.
    */
  @js.native
  trait FinalAutoMLJobObjectiveMetric extends js.Object {
    var MetricName: AutoMLMetricEnum
    var Value: MetricValue
    var Type: js.UndefOr[AutoMLJobObjectiveType]
  }

  object FinalAutoMLJobObjectiveMetric {
    @inline
    def apply(
        MetricName: AutoMLMetricEnum,
        Value: MetricValue,
        Type: js.UndefOr[AutoMLJobObjectiveType] = js.undefined
    ): FinalAutoMLJobObjectiveMetric = {
      val __obj = js.Dynamic.literal(
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Value"      -> Value.asInstanceOf[js.Any]
      )

      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FinalAutoMLJobObjectiveMetric]
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

  /**
    * Contains information about where human output will be stored.
    */
  @js.native
  trait FlowDefinitionOutputConfig extends js.Object {
    var S3OutputPath: S3Uri
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object FlowDefinitionOutputConfig {
    @inline
    def apply(
        S3OutputPath: S3Uri,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): FlowDefinitionOutputConfig = {
      val __obj = js.Dynamic.literal(
        "S3OutputPath" -> S3OutputPath.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FlowDefinitionOutputConfig]
    }
  }

  @js.native
  sealed trait FlowDefinitionStatus extends js.Any
  object FlowDefinitionStatus extends js.Object {
    val Initializing = "Initializing".asInstanceOf[FlowDefinitionStatus]
    val Active       = "Active".asInstanceOf[FlowDefinitionStatus]
    val Failed       = "Failed".asInstanceOf[FlowDefinitionStatus]
    val Deleting     = "Deleting".asInstanceOf[FlowDefinitionStatus]

    val values = js.Object.freeze(js.Array(Initializing, Active, Failed, Deleting))
  }

  /**
    * Contains summary information about the flow definition.
    */
  @js.native
  trait FlowDefinitionSummary extends js.Object {
    var CreationTime: Timestamp
    var FlowDefinitionArn: FlowDefinitionArn
    var FlowDefinitionName: FlowDefinitionName
    var FlowDefinitionStatus: FlowDefinitionStatus
    var FailureReason: js.UndefOr[FailureReason]
  }

  object FlowDefinitionSummary {
    @inline
    def apply(
        CreationTime: Timestamp,
        FlowDefinitionArn: FlowDefinitionArn,
        FlowDefinitionName: FlowDefinitionName,
        FlowDefinitionStatus: FlowDefinitionStatus,
        FailureReason: js.UndefOr[FailureReason] = js.undefined
    ): FlowDefinitionSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime"         -> CreationTime.asInstanceOf[js.Any],
        "FlowDefinitionArn"    -> FlowDefinitionArn.asInstanceOf[js.Any],
        "FlowDefinitionName"   -> FlowDefinitionName.asInstanceOf[js.Any],
        "FlowDefinitionStatus" -> FlowDefinitionStatus.asInstanceOf[js.Any]
      )

      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FlowDefinitionSummary]
    }
  }

  @js.native
  sealed trait Framework extends js.Any
  object Framework extends js.Object {
    val TENSORFLOW = "TENSORFLOW".asInstanceOf[Framework]
    val KERAS      = "KERAS".asInstanceOf[Framework]
    val MXNET      = "MXNET".asInstanceOf[Framework]
    val ONNX       = "ONNX".asInstanceOf[Framework]
    val PYTORCH    = "PYTORCH".asInstanceOf[Framework]
    val XGBOOST    = "XGBOOST".asInstanceOf[Framework]
    val TFLITE     = "TFLITE".asInstanceOf[Framework]

    val values = js.Object.freeze(js.Array(TENSORFLOW, KERAS, MXNET, ONNX, PYTORCH, XGBOOST, TFLITE))
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
    * Defines under what conditions SageMaker creates a human loop. Used within . See for the required format of activation conditions.
    */
  @js.native
  trait HumanLoopActivationConditionsConfig extends js.Object {
    var HumanLoopActivationConditions: HumanLoopActivationConditions
  }

  object HumanLoopActivationConditionsConfig {
    @inline
    def apply(
        HumanLoopActivationConditions: HumanLoopActivationConditions
    ): HumanLoopActivationConditionsConfig = {
      val __obj = js.Dynamic.literal(
        "HumanLoopActivationConditions" -> HumanLoopActivationConditions.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[HumanLoopActivationConditionsConfig]
    }
  }

  /**
    * Provides information about how and under what conditions SageMaker creates a human loop. If <code>HumanLoopActivationConfig</code> is not given, then all requests go to humans.
    */
  @js.native
  trait HumanLoopActivationConfig extends js.Object {
    var HumanLoopActivationConditionsConfig: HumanLoopActivationConditionsConfig
  }

  object HumanLoopActivationConfig {
    @inline
    def apply(
        HumanLoopActivationConditionsConfig: HumanLoopActivationConditionsConfig
    ): HumanLoopActivationConfig = {
      val __obj = js.Dynamic.literal(
        "HumanLoopActivationConditionsConfig" -> HumanLoopActivationConditionsConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[HumanLoopActivationConfig]
    }
  }

  /**
    * Describes the work to be performed by human workers.
    */
  @js.native
  trait HumanLoopConfig extends js.Object {
    var HumanTaskUiArn: HumanTaskUiArn
    var TaskCount: FlowDefinitionTaskCount
    var TaskDescription: FlowDefinitionTaskDescription
    var TaskTitle: FlowDefinitionTaskTitle
    var WorkteamArn: WorkteamArn
    var PublicWorkforceTaskPrice: js.UndefOr[PublicWorkforceTaskPrice]
    var TaskAvailabilityLifetimeInSeconds: js.UndefOr[FlowDefinitionTaskAvailabilityLifetimeInSeconds]
    var TaskKeywords: js.UndefOr[FlowDefinitionTaskKeywords]
    var TaskTimeLimitInSeconds: js.UndefOr[FlowDefinitionTaskTimeLimitInSeconds]
  }

  object HumanLoopConfig {
    @inline
    def apply(
        HumanTaskUiArn: HumanTaskUiArn,
        TaskCount: FlowDefinitionTaskCount,
        TaskDescription: FlowDefinitionTaskDescription,
        TaskTitle: FlowDefinitionTaskTitle,
        WorkteamArn: WorkteamArn,
        PublicWorkforceTaskPrice: js.UndefOr[PublicWorkforceTaskPrice] = js.undefined,
        TaskAvailabilityLifetimeInSeconds: js.UndefOr[FlowDefinitionTaskAvailabilityLifetimeInSeconds] = js.undefined,
        TaskKeywords: js.UndefOr[FlowDefinitionTaskKeywords] = js.undefined,
        TaskTimeLimitInSeconds: js.UndefOr[FlowDefinitionTaskTimeLimitInSeconds] = js.undefined
    ): HumanLoopConfig = {
      val __obj = js.Dynamic.literal(
        "HumanTaskUiArn"  -> HumanTaskUiArn.asInstanceOf[js.Any],
        "TaskCount"       -> TaskCount.asInstanceOf[js.Any],
        "TaskDescription" -> TaskDescription.asInstanceOf[js.Any],
        "TaskTitle"       -> TaskTitle.asInstanceOf[js.Any],
        "WorkteamArn"     -> WorkteamArn.asInstanceOf[js.Any]
      )

      PublicWorkforceTaskPrice.foreach(__v => __obj.updateDynamic("PublicWorkforceTaskPrice")(__v.asInstanceOf[js.Any]))
      TaskAvailabilityLifetimeInSeconds.foreach(__v =>
        __obj.updateDynamic("TaskAvailabilityLifetimeInSeconds")(__v.asInstanceOf[js.Any])
      )
      TaskKeywords.foreach(__v => __obj.updateDynamic("TaskKeywords")(__v.asInstanceOf[js.Any]))
      TaskTimeLimitInSeconds.foreach(__v => __obj.updateDynamic("TaskTimeLimitInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HumanLoopConfig]
    }
  }

  /**
    * Container for configuring the source of human task requests.
    */
  @js.native
  trait HumanLoopRequestSource extends js.Object {
    var AwsManagedHumanLoopRequestSource: AwsManagedHumanLoopRequestSource
  }

  object HumanLoopRequestSource {
    @inline
    def apply(
        AwsManagedHumanLoopRequestSource: AwsManagedHumanLoopRequestSource
    ): HumanLoopRequestSource = {
      val __obj = js.Dynamic.literal(
        "AwsManagedHumanLoopRequestSource" -> AwsManagedHumanLoopRequestSource.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[HumanLoopRequestSource]
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
      TaskAvailabilityLifetimeInSeconds.foreach(__v =>
        __obj.updateDynamic("TaskAvailabilityLifetimeInSeconds")(__v.asInstanceOf[js.Any])
      )
      TaskKeywords.foreach(__v => __obj.updateDynamic("TaskKeywords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HumanTaskConfig]
    }
  }

  /**
    * Container for human task user interface information.
    */
  @js.native
  trait HumanTaskUiSummary extends js.Object {
    var CreationTime: Timestamp
    var HumanTaskUiArn: HumanTaskUiArn
    var HumanTaskUiName: HumanTaskUiName
  }

  object HumanTaskUiSummary {
    @inline
    def apply(
        CreationTime: Timestamp,
        HumanTaskUiArn: HumanTaskUiArn,
        HumanTaskUiName: HumanTaskUiName
    ): HumanTaskUiSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime"    -> CreationTime.asInstanceOf[js.Any],
        "HumanTaskUiArn"  -> HumanTaskUiArn.asInstanceOf[js.Any],
        "HumanTaskUiName" -> HumanTaskUiName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[HumanTaskUiSummary]
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

  @js.native
  sealed trait HyperParameterScalingType extends js.Any
  object HyperParameterScalingType extends js.Object {
    val Auto               = "Auto".asInstanceOf[HyperParameterScalingType]
    val Linear             = "Linear".asInstanceOf[HyperParameterScalingType]
    val Logarithmic        = "Logarithmic".asInstanceOf[HyperParameterScalingType]
    val ReverseLogarithmic = "ReverseLogarithmic".asInstanceOf[HyperParameterScalingType]

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
    var DefinitionName: js.UndefOr[HyperParameterTrainingJobDefinitionName]
    var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean]
    var EnableManagedSpotTraining: js.UndefOr[Boolean]
    var EnableNetworkIsolation: js.UndefOr[Boolean]
    var HyperParameterRanges: js.UndefOr[ParameterRanges]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var StaticHyperParameters: js.UndefOr[HyperParameters]
    var TuningObjective: js.UndefOr[HyperParameterTuningJobObjective]
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
        DefinitionName: js.UndefOr[HyperParameterTrainingJobDefinitionName] = js.undefined,
        EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined,
        EnableManagedSpotTraining: js.UndefOr[Boolean] = js.undefined,
        EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
        HyperParameterRanges: js.UndefOr[ParameterRanges] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        StaticHyperParameters: js.UndefOr[HyperParameters] = js.undefined,
        TuningObjective: js.UndefOr[HyperParameterTuningJobObjective] = js.undefined,
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
      DefinitionName.foreach(__v => __obj.updateDynamic("DefinitionName")(__v.asInstanceOf[js.Any]))
      EnableInterContainerTrafficEncryption.foreach(__v =>
        __obj.updateDynamic("EnableInterContainerTrafficEncryption")(__v.asInstanceOf[js.Any])
      )
      EnableManagedSpotTraining.foreach(__v =>
        __obj.updateDynamic("EnableManagedSpotTraining")(__v.asInstanceOf[js.Any])
      )
      EnableNetworkIsolation.foreach(__v => __obj.updateDynamic("EnableNetworkIsolation")(__v.asInstanceOf[js.Any]))
      HyperParameterRanges.foreach(__v => __obj.updateDynamic("HyperParameterRanges")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      StaticHyperParameters.foreach(__v => __obj.updateDynamic("StaticHyperParameters")(__v.asInstanceOf[js.Any]))
      TuningObjective.foreach(__v => __obj.updateDynamic("TuningObjective")(__v.asInstanceOf[js.Any]))
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
    var TrainingJobDefinitionName: js.UndefOr[HyperParameterTrainingJobDefinitionName]
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
        TrainingJobDefinitionName: js.UndefOr[HyperParameterTrainingJobDefinitionName] = js.undefined,
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
      FinalHyperParameterTuningJobObjectiveMetric.foreach(__v =>
        __obj.updateDynamic("FinalHyperParameterTuningJobObjectiveMetric")(__v.asInstanceOf[js.Any])
      )
      ObjectiveStatus.foreach(__v => __obj.updateDynamic("ObjectiveStatus")(__v.asInstanceOf[js.Any]))
      TrainingEndTime.foreach(__v => __obj.updateDynamic("TrainingEndTime")(__v.asInstanceOf[js.Any]))
      TrainingJobDefinitionName.foreach(__v =>
        __obj.updateDynamic("TrainingJobDefinitionName")(__v.asInstanceOf[js.Any])
      )
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
    var TuningJobCompletionCriteria: js.UndefOr[TuningJobCompletionCriteria]
  }

  object HyperParameterTuningJobConfig {
    @inline
    def apply(
        ResourceLimits: ResourceLimits,
        Strategy: HyperParameterTuningJobStrategyType,
        HyperParameterTuningJobObjective: js.UndefOr[HyperParameterTuningJobObjective] = js.undefined,
        ParameterRanges: js.UndefOr[ParameterRanges] = js.undefined,
        TrainingJobEarlyStoppingType: js.UndefOr[TrainingJobEarlyStoppingType] = js.undefined,
        TuningJobCompletionCriteria: js.UndefOr[TuningJobCompletionCriteria] = js.undefined
    ): HyperParameterTuningJobConfig = {
      val __obj = js.Dynamic.literal(
        "ResourceLimits" -> ResourceLimits.asInstanceOf[js.Any],
        "Strategy"       -> Strategy.asInstanceOf[js.Any]
      )

      HyperParameterTuningJobObjective.foreach(__v =>
        __obj.updateDynamic("HyperParameterTuningJobObjective")(__v.asInstanceOf[js.Any])
      )
      ParameterRanges.foreach(__v => __obj.updateDynamic("ParameterRanges")(__v.asInstanceOf[js.Any]))
      TrainingJobEarlyStoppingType.foreach(__v =>
        __obj.updateDynamic("TrainingJobEarlyStoppingType")(__v.asInstanceOf[js.Any])
      )
      TuningJobCompletionCriteria.foreach(__v =>
        __obj.updateDynamic("TuningJobCompletionCriteria")(__v.asInstanceOf[js.Any])
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

  @js.native
  sealed trait HyperParameterTuningJobObjectiveType extends js.Any
  object HyperParameterTuningJobObjectiveType extends js.Object {
    val Maximize = "Maximize".asInstanceOf[HyperParameterTuningJobObjectiveType]
    val Minimize = "Minimize".asInstanceOf[HyperParameterTuningJobObjectiveType]

    val values = js.Object.freeze(js.Array(Maximize, Minimize))
  }

  @js.native
  sealed trait HyperParameterTuningJobSortByOptions extends js.Any
  object HyperParameterTuningJobSortByOptions extends js.Object {
    val Name         = "Name".asInstanceOf[HyperParameterTuningJobSortByOptions]
    val Status       = "Status".asInstanceOf[HyperParameterTuningJobSortByOptions]
    val CreationTime = "CreationTime".asInstanceOf[HyperParameterTuningJobSortByOptions]

    val values = js.Object.freeze(js.Array(Name, Status, CreationTime))
  }

  @js.native
  sealed trait HyperParameterTuningJobStatus extends js.Any
  object HyperParameterTuningJobStatus extends js.Object {
    val Completed  = "Completed".asInstanceOf[HyperParameterTuningJobStatus]
    val InProgress = "InProgress".asInstanceOf[HyperParameterTuningJobStatus]
    val Failed     = "Failed".asInstanceOf[HyperParameterTuningJobStatus]
    val Stopped    = "Stopped".asInstanceOf[HyperParameterTuningJobStatus]
    val Stopping   = "Stopping".asInstanceOf[HyperParameterTuningJobStatus]

    val values = js.Object.freeze(js.Array(Completed, InProgress, Failed, Stopped, Stopping))
  }

  /**
    * The strategy hyperparameter tuning uses to find the best combination of hyperparameters for your model. Currently, the only supported value is <code>Bayesian</code>.
    */
  @js.native
  sealed trait HyperParameterTuningJobStrategyType extends js.Any
  object HyperParameterTuningJobStrategyType extends js.Object {
    val Bayesian = "Bayesian".asInstanceOf[HyperParameterTuningJobStrategyType]
    val Random   = "Random".asInstanceOf[HyperParameterTuningJobStrategyType]

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

      HyperParameterTuningEndTime.foreach(__v =>
        __obj.updateDynamic("HyperParameterTuningEndTime")(__v.asInstanceOf[js.Any])
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

  @js.native
  sealed trait HyperParameterTuningJobWarmStartType extends js.Any
  object HyperParameterTuningJobWarmStartType extends js.Object {
    val IdenticalDataAndAlgorithm = "IdenticalDataAndAlgorithm".asInstanceOf[HyperParameterTuningJobWarmStartType]
    val TransferLearning          = "TransferLearning".asInstanceOf[HyperParameterTuningJobWarmStartType]

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

  @js.native
  sealed trait InstanceType extends js.Any
  object InstanceType extends js.Object {
    val `ml.t2.medium`    = "ml.t2.medium".asInstanceOf[InstanceType]
    val `ml.t2.large`     = "ml.t2.large".asInstanceOf[InstanceType]
    val `ml.t2.xlarge`    = "ml.t2.xlarge".asInstanceOf[InstanceType]
    val `ml.t2.2xlarge`   = "ml.t2.2xlarge".asInstanceOf[InstanceType]
    val `ml.t3.medium`    = "ml.t3.medium".asInstanceOf[InstanceType]
    val `ml.t3.large`     = "ml.t3.large".asInstanceOf[InstanceType]
    val `ml.t3.xlarge`    = "ml.t3.xlarge".asInstanceOf[InstanceType]
    val `ml.t3.2xlarge`   = "ml.t3.2xlarge".asInstanceOf[InstanceType]
    val `ml.m4.xlarge`    = "ml.m4.xlarge".asInstanceOf[InstanceType]
    val `ml.m4.2xlarge`   = "ml.m4.2xlarge".asInstanceOf[InstanceType]
    val `ml.m4.4xlarge`   = "ml.m4.4xlarge".asInstanceOf[InstanceType]
    val `ml.m4.10xlarge`  = "ml.m4.10xlarge".asInstanceOf[InstanceType]
    val `ml.m4.16xlarge`  = "ml.m4.16xlarge".asInstanceOf[InstanceType]
    val `ml.m5.xlarge`    = "ml.m5.xlarge".asInstanceOf[InstanceType]
    val `ml.m5.2xlarge`   = "ml.m5.2xlarge".asInstanceOf[InstanceType]
    val `ml.m5.4xlarge`   = "ml.m5.4xlarge".asInstanceOf[InstanceType]
    val `ml.m5.12xlarge`  = "ml.m5.12xlarge".asInstanceOf[InstanceType]
    val `ml.m5.24xlarge`  = "ml.m5.24xlarge".asInstanceOf[InstanceType]
    val `ml.c4.xlarge`    = "ml.c4.xlarge".asInstanceOf[InstanceType]
    val `ml.c4.2xlarge`   = "ml.c4.2xlarge".asInstanceOf[InstanceType]
    val `ml.c4.4xlarge`   = "ml.c4.4xlarge".asInstanceOf[InstanceType]
    val `ml.c4.8xlarge`   = "ml.c4.8xlarge".asInstanceOf[InstanceType]
    val `ml.c5.xlarge`    = "ml.c5.xlarge".asInstanceOf[InstanceType]
    val `ml.c5.2xlarge`   = "ml.c5.2xlarge".asInstanceOf[InstanceType]
    val `ml.c5.4xlarge`   = "ml.c5.4xlarge".asInstanceOf[InstanceType]
    val `ml.c5.9xlarge`   = "ml.c5.9xlarge".asInstanceOf[InstanceType]
    val `ml.c5.18xlarge`  = "ml.c5.18xlarge".asInstanceOf[InstanceType]
    val `ml.c5d.xlarge`   = "ml.c5d.xlarge".asInstanceOf[InstanceType]
    val `ml.c5d.2xlarge`  = "ml.c5d.2xlarge".asInstanceOf[InstanceType]
    val `ml.c5d.4xlarge`  = "ml.c5d.4xlarge".asInstanceOf[InstanceType]
    val `ml.c5d.9xlarge`  = "ml.c5d.9xlarge".asInstanceOf[InstanceType]
    val `ml.c5d.18xlarge` = "ml.c5d.18xlarge".asInstanceOf[InstanceType]
    val `ml.p2.xlarge`    = "ml.p2.xlarge".asInstanceOf[InstanceType]
    val `ml.p2.8xlarge`   = "ml.p2.8xlarge".asInstanceOf[InstanceType]
    val `ml.p2.16xlarge`  = "ml.p2.16xlarge".asInstanceOf[InstanceType]
    val `ml.p3.2xlarge`   = "ml.p3.2xlarge".asInstanceOf[InstanceType]
    val `ml.p3.8xlarge`   = "ml.p3.8xlarge".asInstanceOf[InstanceType]
    val `ml.p3.16xlarge`  = "ml.p3.16xlarge".asInstanceOf[InstanceType]

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

  @js.native
  sealed trait JoinSource extends js.Any
  object JoinSource extends js.Object {
    val Input = "Input".asInstanceOf[JoinSource]
    val None  = "None".asInstanceOf[JoinSource]

    val values = js.Object.freeze(js.Array(Input, None))
  }

  /**
    * Jupyter server's app settings.
    */
  @js.native
  trait JupyterServerAppSettings extends js.Object {
    var DefaultResourceSpec: js.UndefOr[ResourceSpec]
  }

  object JupyterServerAppSettings {
    @inline
    def apply(
        DefaultResourceSpec: js.UndefOr[ResourceSpec] = js.undefined
    ): JupyterServerAppSettings = {
      val __obj = js.Dynamic.literal()
      DefaultResourceSpec.foreach(__v => __obj.updateDynamic("DefaultResourceSpec")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JupyterServerAppSettings]
    }
  }

  /**
    * The kernel gateway app settings.
    */
  @js.native
  trait KernelGatewayAppSettings extends js.Object {
    var DefaultResourceSpec: js.UndefOr[ResourceSpec]
  }

  object KernelGatewayAppSettings {
    @inline
    def apply(
        DefaultResourceSpec: js.UndefOr[ResourceSpec] = js.undefined
    ): KernelGatewayAppSettings = {
      val __obj = js.Dynamic.literal()
      DefaultResourceSpec.foreach(__v => __obj.updateDynamic("DefaultResourceSpec")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KernelGatewayAppSettings]
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

      InitialActiveLearningModelArn.foreach(__v =>
        __obj.updateDynamic("InitialActiveLearningModelArn")(__v.asInstanceOf[js.Any])
      )
      LabelingJobResourceConfig.foreach(__v =>
        __obj.updateDynamic("LabelingJobResourceConfig")(__v.asInstanceOf[js.Any])
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
      NumberOfHumanWorkersPerDataObject.foreach(__v =>
        __obj.updateDynamic("NumberOfHumanWorkersPerDataObject")(__v.asInstanceOf[js.Any])
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

      FinalActiveLearningModelArn.foreach(__v =>
        __obj.updateDynamic("FinalActiveLearningModelArn")(__v.asInstanceOf[js.Any])
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

  @js.native
  sealed trait LabelingJobStatus extends js.Any
  object LabelingJobStatus extends js.Object {
    val InProgress = "InProgress".asInstanceOf[LabelingJobStatus]
    val Completed  = "Completed".asInstanceOf[LabelingJobStatus]
    val Failed     = "Failed".asInstanceOf[LabelingJobStatus]
    val Stopping   = "Stopping".asInstanceOf[LabelingJobStatus]
    val Stopped    = "Stopped".asInstanceOf[LabelingJobStatus]

    val values = js.Object.freeze(js.Array(InProgress, Completed, Failed, Stopping, Stopped))
  }

  /**
    * A set of conditions for stopping a labeling job. If any of the conditions are met, the job is automatically stopped. You can use these conditions to control the cost of data labeling.
    *
    * '''Note:'''Labeling jobs fail after 30 days with an appropriate client error message.
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
      MaxHumanLabeledObjectCount.foreach(__v =>
        __obj.updateDynamic("MaxHumanLabeledObjectCount")(__v.asInstanceOf[js.Any])
      )
      MaxPercentageOfInputDatasetLabeled.foreach(__v =>
        __obj.updateDynamic("MaxPercentageOfInputDatasetLabeled")(__v.asInstanceOf[js.Any])
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

      AnnotationConsolidationLambdaArn.foreach(__v =>
        __obj.updateDynamic("AnnotationConsolidationLambdaArn")(__v.asInstanceOf[js.Any])
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
  trait ListAppsRequest extends js.Object {
    var DomainIdEquals: js.UndefOr[DomainId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[AppSortKey]
    var SortOrder: js.UndefOr[SortOrder]
    var UserProfileNameEquals: js.UndefOr[UserProfileName]
  }

  object ListAppsRequest {
    @inline
    def apply(
        DomainIdEquals: js.UndefOr[DomainId] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[AppSortKey] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined,
        UserProfileNameEquals: js.UndefOr[UserProfileName] = js.undefined
    ): ListAppsRequest = {
      val __obj = js.Dynamic.literal()
      DomainIdEquals.foreach(__v => __obj.updateDynamic("DomainIdEquals")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      UserProfileNameEquals.foreach(__v => __obj.updateDynamic("UserProfileNameEquals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppsRequest]
    }
  }

  @js.native
  trait ListAppsResponse extends js.Object {
    var Apps: js.UndefOr[AppList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAppsResponse {
    @inline
    def apply(
        Apps: js.UndefOr[AppList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppsResponse = {
      val __obj = js.Dynamic.literal()
      Apps.foreach(__v => __obj.updateDynamic("Apps")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppsResponse]
    }
  }

  @js.native
  trait ListAutoMLJobsRequest extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var LastModifiedTimeAfter: js.UndefOr[Timestamp]
    var LastModifiedTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[AutoMLMaxResults]
    var NameContains: js.UndefOr[AutoMLNameContains]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[AutoMLSortBy]
    var SortOrder: js.UndefOr[AutoMLSortOrder]
    var StatusEquals: js.UndefOr[AutoMLJobStatus]
  }

  object ListAutoMLJobsRequest {
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[AutoMLMaxResults] = js.undefined,
        NameContains: js.UndefOr[AutoMLNameContains] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[AutoMLSortBy] = js.undefined,
        SortOrder: js.UndefOr[AutoMLSortOrder] = js.undefined,
        StatusEquals: js.UndefOr[AutoMLJobStatus] = js.undefined
    ): ListAutoMLJobsRequest = {
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
      __obj.asInstanceOf[ListAutoMLJobsRequest]
    }
  }

  @js.native
  trait ListAutoMLJobsResponse extends js.Object {
    var AutoMLJobSummaries: AutoMLJobSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAutoMLJobsResponse {
    @inline
    def apply(
        AutoMLJobSummaries: AutoMLJobSummaries,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAutoMLJobsResponse = {
      val __obj = js.Dynamic.literal(
        "AutoMLJobSummaries" -> AutoMLJobSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAutoMLJobsResponse]
    }
  }

  @js.native
  trait ListCandidatesForAutoMLJobRequest extends js.Object {
    var AutoMLJobName: AutoMLJobName
    var CandidateNameEquals: js.UndefOr[CandidateName]
    var MaxResults: js.UndefOr[AutoMLMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[CandidateSortBy]
    var SortOrder: js.UndefOr[AutoMLSortOrder]
    var StatusEquals: js.UndefOr[CandidateStatus]
  }

  object ListCandidatesForAutoMLJobRequest {
    @inline
    def apply(
        AutoMLJobName: AutoMLJobName,
        CandidateNameEquals: js.UndefOr[CandidateName] = js.undefined,
        MaxResults: js.UndefOr[AutoMLMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[CandidateSortBy] = js.undefined,
        SortOrder: js.UndefOr[AutoMLSortOrder] = js.undefined,
        StatusEquals: js.UndefOr[CandidateStatus] = js.undefined
    ): ListCandidatesForAutoMLJobRequest = {
      val __obj = js.Dynamic.literal(
        "AutoMLJobName" -> AutoMLJobName.asInstanceOf[js.Any]
      )

      CandidateNameEquals.foreach(__v => __obj.updateDynamic("CandidateNameEquals")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      StatusEquals.foreach(__v => __obj.updateDynamic("StatusEquals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCandidatesForAutoMLJobRequest]
    }
  }

  @js.native
  trait ListCandidatesForAutoMLJobResponse extends js.Object {
    var Candidates: AutoMLCandidates
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCandidatesForAutoMLJobResponse {
    @inline
    def apply(
        Candidates: AutoMLCandidates,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCandidatesForAutoMLJobResponse = {
      val __obj = js.Dynamic.literal(
        "Candidates" -> Candidates.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCandidatesForAutoMLJobResponse]
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

  @js.native
  sealed trait ListCompilationJobsSortBy extends js.Any
  object ListCompilationJobsSortBy extends js.Object {
    val Name         = "Name".asInstanceOf[ListCompilationJobsSortBy]
    val CreationTime = "CreationTime".asInstanceOf[ListCompilationJobsSortBy]
    val Status       = "Status".asInstanceOf[ListCompilationJobsSortBy]

    val values = js.Object.freeze(js.Array(Name, CreationTime, Status))
  }

  @js.native
  trait ListDomainsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDomainsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDomainsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainsRequest]
    }
  }

  @js.native
  trait ListDomainsResponse extends js.Object {
    var Domains: js.UndefOr[DomainList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDomainsResponse {
    @inline
    def apply(
        Domains: js.UndefOr[DomainList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDomainsResponse = {
      val __obj = js.Dynamic.literal()
      Domains.foreach(__v => __obj.updateDynamic("Domains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainsResponse]
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
  trait ListExperimentsRequest extends js.Object {
    var CreatedAfter: js.UndefOr[Timestamp]
    var CreatedBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[SortExperimentsBy]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListExperimentsRequest {
    @inline
    def apply(
        CreatedAfter: js.UndefOr[Timestamp] = js.undefined,
        CreatedBefore: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[SortExperimentsBy] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListExperimentsRequest = {
      val __obj = js.Dynamic.literal()
      CreatedAfter.foreach(__v => __obj.updateDynamic("CreatedAfter")(__v.asInstanceOf[js.Any]))
      CreatedBefore.foreach(__v => __obj.updateDynamic("CreatedBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExperimentsRequest]
    }
  }

  @js.native
  trait ListExperimentsResponse extends js.Object {
    var ExperimentSummaries: js.UndefOr[ExperimentSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListExperimentsResponse {
    @inline
    def apply(
        ExperimentSummaries: js.UndefOr[ExperimentSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListExperimentsResponse = {
      val __obj = js.Dynamic.literal()
      ExperimentSummaries.foreach(__v => __obj.updateDynamic("ExperimentSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExperimentsResponse]
    }
  }

  @js.native
  trait ListFlowDefinitionsRequest extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListFlowDefinitionsRequest {
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListFlowDefinitionsRequest = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFlowDefinitionsRequest]
    }
  }

  @js.native
  trait ListFlowDefinitionsResponse extends js.Object {
    var FlowDefinitionSummaries: FlowDefinitionSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFlowDefinitionsResponse {
    @inline
    def apply(
        FlowDefinitionSummaries: FlowDefinitionSummaries,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFlowDefinitionsResponse = {
      val __obj = js.Dynamic.literal(
        "FlowDefinitionSummaries" -> FlowDefinitionSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFlowDefinitionsResponse]
    }
  }

  @js.native
  trait ListHumanTaskUisRequest extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListHumanTaskUisRequest {
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListHumanTaskUisRequest = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHumanTaskUisRequest]
    }
  }

  @js.native
  trait ListHumanTaskUisResponse extends js.Object {
    var HumanTaskUiSummaries: HumanTaskUiSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHumanTaskUisResponse {
    @inline
    def apply(
        HumanTaskUiSummaries: HumanTaskUiSummaries,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListHumanTaskUisResponse = {
      val __obj = js.Dynamic.literal(
        "HumanTaskUiSummaries" -> HumanTaskUiSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHumanTaskUisResponse]
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

  @js.native
  sealed trait ListLabelingJobsForWorkteamSortByOptions extends js.Any
  object ListLabelingJobsForWorkteamSortByOptions extends js.Object {
    val CreationTime = "CreationTime".asInstanceOf[ListLabelingJobsForWorkteamSortByOptions]

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
  trait ListMonitoringExecutionsRequest extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var EndpointName: js.UndefOr[EndpointName]
    var LastModifiedTimeAfter: js.UndefOr[Timestamp]
    var LastModifiedTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var MonitoringScheduleName: js.UndefOr[MonitoringScheduleName]
    var NextToken: js.UndefOr[NextToken]
    var ScheduledTimeAfter: js.UndefOr[Timestamp]
    var ScheduledTimeBefore: js.UndefOr[Timestamp]
    var SortBy: js.UndefOr[MonitoringExecutionSortKey]
    var SortOrder: js.UndefOr[SortOrder]
    var StatusEquals: js.UndefOr[ExecutionStatus]
  }

  object ListMonitoringExecutionsRequest {
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        EndpointName: js.UndefOr[EndpointName] = js.undefined,
        LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        MonitoringScheduleName: js.UndefOr[MonitoringScheduleName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ScheduledTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        ScheduledTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        SortBy: js.UndefOr[MonitoringExecutionSortKey] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined,
        StatusEquals: js.UndefOr[ExecutionStatus] = js.undefined
    ): ListMonitoringExecutionsRequest = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      EndpointName.foreach(__v => __obj.updateDynamic("EndpointName")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeAfter.foreach(__v => __obj.updateDynamic("LastModifiedTimeAfter")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeBefore.foreach(__v => __obj.updateDynamic("LastModifiedTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      MonitoringScheduleName.foreach(__v => __obj.updateDynamic("MonitoringScheduleName")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ScheduledTimeAfter.foreach(__v => __obj.updateDynamic("ScheduledTimeAfter")(__v.asInstanceOf[js.Any]))
      ScheduledTimeBefore.foreach(__v => __obj.updateDynamic("ScheduledTimeBefore")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      StatusEquals.foreach(__v => __obj.updateDynamic("StatusEquals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMonitoringExecutionsRequest]
    }
  }

  @js.native
  trait ListMonitoringExecutionsResponse extends js.Object {
    var MonitoringExecutionSummaries: MonitoringExecutionSummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMonitoringExecutionsResponse {
    @inline
    def apply(
        MonitoringExecutionSummaries: MonitoringExecutionSummaryList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMonitoringExecutionsResponse = {
      val __obj = js.Dynamic.literal(
        "MonitoringExecutionSummaries" -> MonitoringExecutionSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMonitoringExecutionsResponse]
    }
  }

  @js.native
  trait ListMonitoringSchedulesRequest extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var EndpointName: js.UndefOr[EndpointName]
    var LastModifiedTimeAfter: js.UndefOr[Timestamp]
    var LastModifiedTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[NameContains]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[MonitoringScheduleSortKey]
    var SortOrder: js.UndefOr[SortOrder]
    var StatusEquals: js.UndefOr[ScheduleStatus]
  }

  object ListMonitoringSchedulesRequest {
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        EndpointName: js.UndefOr[EndpointName] = js.undefined,
        LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[NameContains] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[MonitoringScheduleSortKey] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined,
        StatusEquals: js.UndefOr[ScheduleStatus] = js.undefined
    ): ListMonitoringSchedulesRequest = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      EndpointName.foreach(__v => __obj.updateDynamic("EndpointName")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeAfter.foreach(__v => __obj.updateDynamic("LastModifiedTimeAfter")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeBefore.foreach(__v => __obj.updateDynamic("LastModifiedTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      StatusEquals.foreach(__v => __obj.updateDynamic("StatusEquals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMonitoringSchedulesRequest]
    }
  }

  @js.native
  trait ListMonitoringSchedulesResponse extends js.Object {
    var MonitoringScheduleSummaries: MonitoringScheduleSummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMonitoringSchedulesResponse {
    @inline
    def apply(
        MonitoringScheduleSummaries: MonitoringScheduleSummaryList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMonitoringSchedulesResponse = {
      val __obj = js.Dynamic.literal(
        "MonitoringScheduleSummaries" -> MonitoringScheduleSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMonitoringSchedulesResponse]
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
      NotebookInstanceLifecycleConfigs.foreach(__v =>
        __obj.updateDynamic("NotebookInstanceLifecycleConfigs")(__v.asInstanceOf[js.Any])
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
      AdditionalCodeRepositoryEquals.foreach(__v =>
        __obj.updateDynamic("AdditionalCodeRepositoryEquals")(__v.asInstanceOf[js.Any])
      )
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      DefaultCodeRepositoryContains.foreach(__v =>
        __obj.updateDynamic("DefaultCodeRepositoryContains")(__v.asInstanceOf[js.Any])
      )
      LastModifiedTimeAfter.foreach(__v => __obj.updateDynamic("LastModifiedTimeAfter")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeBefore.foreach(__v => __obj.updateDynamic("LastModifiedTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      NotebookInstanceLifecycleConfigNameContains.foreach(__v =>
        __obj.updateDynamic("NotebookInstanceLifecycleConfigNameContains")(__v.asInstanceOf[js.Any])
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
  trait ListProcessingJobsRequest extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var LastModifiedTimeAfter: js.UndefOr[Timestamp]
    var LastModifiedTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[String]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[SortBy]
    var SortOrder: js.UndefOr[SortOrder]
    var StatusEquals: js.UndefOr[ProcessingJobStatus]
  }

  object ListProcessingJobsRequest {
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[String] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[SortBy] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined,
        StatusEquals: js.UndefOr[ProcessingJobStatus] = js.undefined
    ): ListProcessingJobsRequest = {
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
      __obj.asInstanceOf[ListProcessingJobsRequest]
    }
  }

  @js.native
  trait ListProcessingJobsResponse extends js.Object {
    var ProcessingJobSummaries: ProcessingJobSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  object ListProcessingJobsResponse {
    @inline
    def apply(
        ProcessingJobSummaries: ProcessingJobSummaries,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListProcessingJobsResponse = {
      val __obj = js.Dynamic.literal(
        "ProcessingJobSummaries" -> ProcessingJobSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProcessingJobsResponse]
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
  trait ListTrialComponentsRequest extends js.Object {
    var CreatedAfter: js.UndefOr[Timestamp]
    var CreatedBefore: js.UndefOr[Timestamp]
    var ExperimentName: js.UndefOr[ExperimentEntityName]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[SortTrialComponentsBy]
    var SortOrder: js.UndefOr[SortOrder]
    var SourceArn: js.UndefOr[String256]
    var TrialName: js.UndefOr[ExperimentEntityName]
  }

  object ListTrialComponentsRequest {
    @inline
    def apply(
        CreatedAfter: js.UndefOr[Timestamp] = js.undefined,
        CreatedBefore: js.UndefOr[Timestamp] = js.undefined,
        ExperimentName: js.UndefOr[ExperimentEntityName] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[SortTrialComponentsBy] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined,
        SourceArn: js.UndefOr[String256] = js.undefined,
        TrialName: js.UndefOr[ExperimentEntityName] = js.undefined
    ): ListTrialComponentsRequest = {
      val __obj = js.Dynamic.literal()
      CreatedAfter.foreach(__v => __obj.updateDynamic("CreatedAfter")(__v.asInstanceOf[js.Any]))
      CreatedBefore.foreach(__v => __obj.updateDynamic("CreatedBefore")(__v.asInstanceOf[js.Any]))
      ExperimentName.foreach(__v => __obj.updateDynamic("ExperimentName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      TrialName.foreach(__v => __obj.updateDynamic("TrialName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrialComponentsRequest]
    }
  }

  @js.native
  trait ListTrialComponentsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TrialComponentSummaries: js.UndefOr[TrialComponentSummaries]
  }

  object ListTrialComponentsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TrialComponentSummaries: js.UndefOr[TrialComponentSummaries] = js.undefined
    ): ListTrialComponentsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TrialComponentSummaries.foreach(__v => __obj.updateDynamic("TrialComponentSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrialComponentsResponse]
    }
  }

  @js.native
  trait ListTrialsRequest extends js.Object {
    var CreatedAfter: js.UndefOr[Timestamp]
    var CreatedBefore: js.UndefOr[Timestamp]
    var ExperimentName: js.UndefOr[ExperimentEntityName]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[SortTrialsBy]
    var SortOrder: js.UndefOr[SortOrder]
    var TrialComponentName: js.UndefOr[ExperimentEntityName]
  }

  object ListTrialsRequest {
    @inline
    def apply(
        CreatedAfter: js.UndefOr[Timestamp] = js.undefined,
        CreatedBefore: js.UndefOr[Timestamp] = js.undefined,
        ExperimentName: js.UndefOr[ExperimentEntityName] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[SortTrialsBy] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined,
        TrialComponentName: js.UndefOr[ExperimentEntityName] = js.undefined
    ): ListTrialsRequest = {
      val __obj = js.Dynamic.literal()
      CreatedAfter.foreach(__v => __obj.updateDynamic("CreatedAfter")(__v.asInstanceOf[js.Any]))
      CreatedBefore.foreach(__v => __obj.updateDynamic("CreatedBefore")(__v.asInstanceOf[js.Any]))
      ExperimentName.foreach(__v => __obj.updateDynamic("ExperimentName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      TrialComponentName.foreach(__v => __obj.updateDynamic("TrialComponentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrialsRequest]
    }
  }

  @js.native
  trait ListTrialsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TrialSummaries: js.UndefOr[TrialSummaries]
  }

  object ListTrialsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TrialSummaries: js.UndefOr[TrialSummaries] = js.undefined
    ): ListTrialsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TrialSummaries.foreach(__v => __obj.updateDynamic("TrialSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrialsResponse]
    }
  }

  @js.native
  trait ListUserProfilesRequest extends js.Object {
    var DomainIdEquals: js.UndefOr[DomainId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[UserProfileSortKey]
    var SortOrder: js.UndefOr[SortOrder]
    var UserProfileNameContains: js.UndefOr[UserProfileName]
  }

  object ListUserProfilesRequest {
    @inline
    def apply(
        DomainIdEquals: js.UndefOr[DomainId] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[UserProfileSortKey] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined,
        UserProfileNameContains: js.UndefOr[UserProfileName] = js.undefined
    ): ListUserProfilesRequest = {
      val __obj = js.Dynamic.literal()
      DomainIdEquals.foreach(__v => __obj.updateDynamic("DomainIdEquals")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      UserProfileNameContains.foreach(__v => __obj.updateDynamic("UserProfileNameContains")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserProfilesRequest]
    }
  }

  @js.native
  trait ListUserProfilesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var UserProfiles: js.UndefOr[UserProfileList]
  }

  object ListUserProfilesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        UserProfiles: js.UndefOr[UserProfileList] = js.undefined
    ): ListUserProfilesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      UserProfiles.foreach(__v => __obj.updateDynamic("UserProfiles")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserProfilesResponse]
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

  @js.native
  sealed trait ListWorkteamsSortByOptions extends js.Any
  object ListWorkteamsSortByOptions extends js.Object {
    val Name       = "Name".asInstanceOf[ListWorkteamsSortByOptions]
    val CreateDate = "CreateDate".asInstanceOf[ListWorkteamsSortByOptions]

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
    *  Model artifacts are the output that results from training a model, and typically consist of trained parameters, a model defintion that desribes how to compute inferences, and other metadata.
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
    * Configures the timeout and maximum number of retries for processing a transform job invocation.
    */
  @js.native
  trait ModelClientConfig extends js.Object {
    var InvocationsMaxRetries: js.UndefOr[InvocationsMaxRetries]
    var InvocationsTimeoutInSeconds: js.UndefOr[InvocationsTimeoutInSeconds]
  }

  object ModelClientConfig {
    @inline
    def apply(
        InvocationsMaxRetries: js.UndefOr[InvocationsMaxRetries] = js.undefined,
        InvocationsTimeoutInSeconds: js.UndefOr[InvocationsTimeoutInSeconds] = js.undefined
    ): ModelClientConfig = {
      val __obj = js.Dynamic.literal()
      InvocationsMaxRetries.foreach(__v => __obj.updateDynamic("InvocationsMaxRetries")(__v.asInstanceOf[js.Any]))
      InvocationsTimeoutInSeconds.foreach(__v =>
        __obj.updateDynamic("InvocationsTimeoutInSeconds")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ModelClientConfig]
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

  @js.native
  sealed trait ModelPackageSortBy extends js.Any
  object ModelPackageSortBy extends js.Object {
    val Name         = "Name".asInstanceOf[ModelPackageSortBy]
    val CreationTime = "CreationTime".asInstanceOf[ModelPackageSortBy]

    val values = js.Object.freeze(js.Array(Name, CreationTime))
  }

  @js.native
  sealed trait ModelPackageStatus extends js.Any
  object ModelPackageStatus extends js.Object {
    val Pending    = "Pending".asInstanceOf[ModelPackageStatus]
    val InProgress = "InProgress".asInstanceOf[ModelPackageStatus]
    val Completed  = "Completed".asInstanceOf[ModelPackageStatus]
    val Failed     = "Failed".asInstanceOf[ModelPackageStatus]
    val Deleting   = "Deleting".asInstanceOf[ModelPackageStatus]

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

  @js.native
  sealed trait ModelSortKey extends js.Any
  object ModelSortKey extends js.Object {
    val Name         = "Name".asInstanceOf[ModelSortKey]
    val CreationTime = "CreationTime".asInstanceOf[ModelSortKey]

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
    * Container image configuration object for the monitoring job.
    */
  @js.native
  trait MonitoringAppSpecification extends js.Object {
    var ImageUri: ImageUri
    var ContainerArguments: js.UndefOr[MonitoringContainerArguments]
    var ContainerEntrypoint: js.UndefOr[ContainerEntrypoint]
    var PostAnalyticsProcessorSourceUri: js.UndefOr[S3Uri]
    var RecordPreprocessorSourceUri: js.UndefOr[S3Uri]
  }

  object MonitoringAppSpecification {
    @inline
    def apply(
        ImageUri: ImageUri,
        ContainerArguments: js.UndefOr[MonitoringContainerArguments] = js.undefined,
        ContainerEntrypoint: js.UndefOr[ContainerEntrypoint] = js.undefined,
        PostAnalyticsProcessorSourceUri: js.UndefOr[S3Uri] = js.undefined,
        RecordPreprocessorSourceUri: js.UndefOr[S3Uri] = js.undefined
    ): MonitoringAppSpecification = {
      val __obj = js.Dynamic.literal(
        "ImageUri" -> ImageUri.asInstanceOf[js.Any]
      )

      ContainerArguments.foreach(__v => __obj.updateDynamic("ContainerArguments")(__v.asInstanceOf[js.Any]))
      ContainerEntrypoint.foreach(__v => __obj.updateDynamic("ContainerEntrypoint")(__v.asInstanceOf[js.Any]))
      PostAnalyticsProcessorSourceUri.foreach(__v =>
        __obj.updateDynamic("PostAnalyticsProcessorSourceUri")(__v.asInstanceOf[js.Any])
      )
      RecordPreprocessorSourceUri.foreach(__v =>
        __obj.updateDynamic("RecordPreprocessorSourceUri")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[MonitoringAppSpecification]
    }
  }

  /**
    * Configuration for monitoring constraints and monitoring statistics. These baseline resources are compared against the results of the current job from the series of jobs scheduled to collect data periodically.
    */
  @js.native
  trait MonitoringBaselineConfig extends js.Object {
    var ConstraintsResource: js.UndefOr[MonitoringConstraintsResource]
    var StatisticsResource: js.UndefOr[MonitoringStatisticsResource]
  }

  object MonitoringBaselineConfig {
    @inline
    def apply(
        ConstraintsResource: js.UndefOr[MonitoringConstraintsResource] = js.undefined,
        StatisticsResource: js.UndefOr[MonitoringStatisticsResource] = js.undefined
    ): MonitoringBaselineConfig = {
      val __obj = js.Dynamic.literal()
      ConstraintsResource.foreach(__v => __obj.updateDynamic("ConstraintsResource")(__v.asInstanceOf[js.Any]))
      StatisticsResource.foreach(__v => __obj.updateDynamic("StatisticsResource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringBaselineConfig]
    }
  }

  /**
    * Configuration for the cluster used to run model monitoring jobs.
    */
  @js.native
  trait MonitoringClusterConfig extends js.Object {
    var InstanceCount: ProcessingInstanceCount
    var InstanceType: ProcessingInstanceType
    var VolumeSizeInGB: ProcessingVolumeSizeInGB
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
  }

  object MonitoringClusterConfig {
    @inline
    def apply(
        InstanceCount: ProcessingInstanceCount,
        InstanceType: ProcessingInstanceType,
        VolumeSizeInGB: ProcessingVolumeSizeInGB,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): MonitoringClusterConfig = {
      val __obj = js.Dynamic.literal(
        "InstanceCount"  -> InstanceCount.asInstanceOf[js.Any],
        "InstanceType"   -> InstanceType.asInstanceOf[js.Any],
        "VolumeSizeInGB" -> VolumeSizeInGB.asInstanceOf[js.Any]
      )

      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringClusterConfig]
    }
  }

  /**
    * The constraints resource for a monitoring job.
    */
  @js.native
  trait MonitoringConstraintsResource extends js.Object {
    var S3Uri: js.UndefOr[S3Uri]
  }

  object MonitoringConstraintsResource {
    @inline
    def apply(
        S3Uri: js.UndefOr[S3Uri] = js.undefined
    ): MonitoringConstraintsResource = {
      val __obj = js.Dynamic.literal()
      S3Uri.foreach(__v => __obj.updateDynamic("S3Uri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringConstraintsResource]
    }
  }

  @js.native
  sealed trait MonitoringExecutionSortKey extends js.Any
  object MonitoringExecutionSortKey extends js.Object {
    val CreationTime  = "CreationTime".asInstanceOf[MonitoringExecutionSortKey]
    val ScheduledTime = "ScheduledTime".asInstanceOf[MonitoringExecutionSortKey]
    val Status        = "Status".asInstanceOf[MonitoringExecutionSortKey]

    val values = js.Object.freeze(js.Array(CreationTime, ScheduledTime, Status))
  }

  /**
    * Summary of information about the last monitoring job to run.
    */
  @js.native
  trait MonitoringExecutionSummary extends js.Object {
    var CreationTime: Timestamp
    var LastModifiedTime: Timestamp
    var MonitoringExecutionStatus: ExecutionStatus
    var MonitoringScheduleName: MonitoringScheduleName
    var ScheduledTime: Timestamp
    var EndpointName: js.UndefOr[EndpointName]
    var FailureReason: js.UndefOr[FailureReason]
    var ProcessingJobArn: js.UndefOr[ProcessingJobArn]
  }

  object MonitoringExecutionSummary {
    @inline
    def apply(
        CreationTime: Timestamp,
        LastModifiedTime: Timestamp,
        MonitoringExecutionStatus: ExecutionStatus,
        MonitoringScheduleName: MonitoringScheduleName,
        ScheduledTime: Timestamp,
        EndpointName: js.UndefOr[EndpointName] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        ProcessingJobArn: js.UndefOr[ProcessingJobArn] = js.undefined
    ): MonitoringExecutionSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime"              -> CreationTime.asInstanceOf[js.Any],
        "LastModifiedTime"          -> LastModifiedTime.asInstanceOf[js.Any],
        "MonitoringExecutionStatus" -> MonitoringExecutionStatus.asInstanceOf[js.Any],
        "MonitoringScheduleName"    -> MonitoringScheduleName.asInstanceOf[js.Any],
        "ScheduledTime"             -> ScheduledTime.asInstanceOf[js.Any]
      )

      EndpointName.foreach(__v => __obj.updateDynamic("EndpointName")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      ProcessingJobArn.foreach(__v => __obj.updateDynamic("ProcessingJobArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringExecutionSummary]
    }
  }

  /**
    * The inputs for a monitoring job.
    */
  @js.native
  trait MonitoringInput extends js.Object {
    var EndpointInput: EndpointInput
  }

  object MonitoringInput {
    @inline
    def apply(
        EndpointInput: EndpointInput
    ): MonitoringInput = {
      val __obj = js.Dynamic.literal(
        "EndpointInput" -> EndpointInput.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MonitoringInput]
    }
  }

  /**
    * Defines the monitoring job.
    */
  @js.native
  trait MonitoringJobDefinition extends js.Object {
    var MonitoringAppSpecification: MonitoringAppSpecification
    var MonitoringInputs: MonitoringInputs
    var MonitoringOutputConfig: MonitoringOutputConfig
    var MonitoringResources: MonitoringResources
    var RoleArn: RoleArn
    var BaselineConfig: js.UndefOr[MonitoringBaselineConfig]
    var Environment: js.UndefOr[MonitoringEnvironmentMap]
    var NetworkConfig: js.UndefOr[NetworkConfig]
    var StoppingCondition: js.UndefOr[MonitoringStoppingCondition]
  }

  object MonitoringJobDefinition {
    @inline
    def apply(
        MonitoringAppSpecification: MonitoringAppSpecification,
        MonitoringInputs: MonitoringInputs,
        MonitoringOutputConfig: MonitoringOutputConfig,
        MonitoringResources: MonitoringResources,
        RoleArn: RoleArn,
        BaselineConfig: js.UndefOr[MonitoringBaselineConfig] = js.undefined,
        Environment: js.UndefOr[MonitoringEnvironmentMap] = js.undefined,
        NetworkConfig: js.UndefOr[NetworkConfig] = js.undefined,
        StoppingCondition: js.UndefOr[MonitoringStoppingCondition] = js.undefined
    ): MonitoringJobDefinition = {
      val __obj = js.Dynamic.literal(
        "MonitoringAppSpecification" -> MonitoringAppSpecification.asInstanceOf[js.Any],
        "MonitoringInputs"           -> MonitoringInputs.asInstanceOf[js.Any],
        "MonitoringOutputConfig"     -> MonitoringOutputConfig.asInstanceOf[js.Any],
        "MonitoringResources"        -> MonitoringResources.asInstanceOf[js.Any],
        "RoleArn"                    -> RoleArn.asInstanceOf[js.Any]
      )

      BaselineConfig.foreach(__v => __obj.updateDynamic("BaselineConfig")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      NetworkConfig.foreach(__v => __obj.updateDynamic("NetworkConfig")(__v.asInstanceOf[js.Any]))
      StoppingCondition.foreach(__v => __obj.updateDynamic("StoppingCondition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringJobDefinition]
    }
  }

  /**
    * The output object for a monitoring job.
    */
  @js.native
  trait MonitoringOutput extends js.Object {
    var S3Output: MonitoringS3Output
  }

  object MonitoringOutput {
    @inline
    def apply(
        S3Output: MonitoringS3Output
    ): MonitoringOutput = {
      val __obj = js.Dynamic.literal(
        "S3Output" -> S3Output.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MonitoringOutput]
    }
  }

  /**
    * The output configuration for monitoring jobs.
    */
  @js.native
  trait MonitoringOutputConfig extends js.Object {
    var MonitoringOutputs: MonitoringOutputs
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object MonitoringOutputConfig {
    @inline
    def apply(
        MonitoringOutputs: MonitoringOutputs,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): MonitoringOutputConfig = {
      val __obj = js.Dynamic.literal(
        "MonitoringOutputs" -> MonitoringOutputs.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringOutputConfig]
    }
  }

  /**
    * Identifies the resources to deploy for a monitoring job.
    */
  @js.native
  trait MonitoringResources extends js.Object {
    var ClusterConfig: MonitoringClusterConfig
  }

  object MonitoringResources {
    @inline
    def apply(
        ClusterConfig: MonitoringClusterConfig
    ): MonitoringResources = {
      val __obj = js.Dynamic.literal(
        "ClusterConfig" -> ClusterConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MonitoringResources]
    }
  }

  /**
    * Information about where and how you want to store the results of a monitoring job.
    */
  @js.native
  trait MonitoringS3Output extends js.Object {
    var LocalPath: ProcessingLocalPath
    var S3Uri: MonitoringS3Uri
    var S3UploadMode: js.UndefOr[ProcessingS3UploadMode]
  }

  object MonitoringS3Output {
    @inline
    def apply(
        LocalPath: ProcessingLocalPath,
        S3Uri: MonitoringS3Uri,
        S3UploadMode: js.UndefOr[ProcessingS3UploadMode] = js.undefined
    ): MonitoringS3Output = {
      val __obj = js.Dynamic.literal(
        "LocalPath" -> LocalPath.asInstanceOf[js.Any],
        "S3Uri"     -> S3Uri.asInstanceOf[js.Any]
      )

      S3UploadMode.foreach(__v => __obj.updateDynamic("S3UploadMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringS3Output]
    }
  }

  /**
    * Configures the monitoring schedule and defines the monitoring job.
    */
  @js.native
  trait MonitoringScheduleConfig extends js.Object {
    var MonitoringJobDefinition: MonitoringJobDefinition
    var ScheduleConfig: js.UndefOr[ScheduleConfig]
  }

  object MonitoringScheduleConfig {
    @inline
    def apply(
        MonitoringJobDefinition: MonitoringJobDefinition,
        ScheduleConfig: js.UndefOr[ScheduleConfig] = js.undefined
    ): MonitoringScheduleConfig = {
      val __obj = js.Dynamic.literal(
        "MonitoringJobDefinition" -> MonitoringJobDefinition.asInstanceOf[js.Any]
      )

      ScheduleConfig.foreach(__v => __obj.updateDynamic("ScheduleConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringScheduleConfig]
    }
  }

  @js.native
  sealed trait MonitoringScheduleSortKey extends js.Any
  object MonitoringScheduleSortKey extends js.Object {
    val Name         = "Name".asInstanceOf[MonitoringScheduleSortKey]
    val CreationTime = "CreationTime".asInstanceOf[MonitoringScheduleSortKey]
    val Status       = "Status".asInstanceOf[MonitoringScheduleSortKey]

    val values = js.Object.freeze(js.Array(Name, CreationTime, Status))
  }

  /**
    * Summarizes the monitoring schedule.
    */
  @js.native
  trait MonitoringScheduleSummary extends js.Object {
    var CreationTime: Timestamp
    var LastModifiedTime: Timestamp
    var MonitoringScheduleArn: MonitoringScheduleArn
    var MonitoringScheduleName: MonitoringScheduleName
    var MonitoringScheduleStatus: ScheduleStatus
    var EndpointName: js.UndefOr[EndpointName]
  }

  object MonitoringScheduleSummary {
    @inline
    def apply(
        CreationTime: Timestamp,
        LastModifiedTime: Timestamp,
        MonitoringScheduleArn: MonitoringScheduleArn,
        MonitoringScheduleName: MonitoringScheduleName,
        MonitoringScheduleStatus: ScheduleStatus,
        EndpointName: js.UndefOr[EndpointName] = js.undefined
    ): MonitoringScheduleSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime"             -> CreationTime.asInstanceOf[js.Any],
        "LastModifiedTime"         -> LastModifiedTime.asInstanceOf[js.Any],
        "MonitoringScheduleArn"    -> MonitoringScheduleArn.asInstanceOf[js.Any],
        "MonitoringScheduleName"   -> MonitoringScheduleName.asInstanceOf[js.Any],
        "MonitoringScheduleStatus" -> MonitoringScheduleStatus.asInstanceOf[js.Any]
      )

      EndpointName.foreach(__v => __obj.updateDynamic("EndpointName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringScheduleSummary]
    }
  }

  /**
    * The statistics resource for a monitoring job.
    */
  @js.native
  trait MonitoringStatisticsResource extends js.Object {
    var S3Uri: js.UndefOr[S3Uri]
  }

  object MonitoringStatisticsResource {
    @inline
    def apply(
        S3Uri: js.UndefOr[S3Uri] = js.undefined
    ): MonitoringStatisticsResource = {
      val __obj = js.Dynamic.literal()
      S3Uri.foreach(__v => __obj.updateDynamic("S3Uri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringStatisticsResource]
    }
  }

  /**
    * A time limit for how long the monitoring job is allowed to run before stopping.
    */
  @js.native
  trait MonitoringStoppingCondition extends js.Object {
    var MaxRuntimeInSeconds: MonitoringMaxRuntimeInSeconds
  }

  object MonitoringStoppingCondition {
    @inline
    def apply(
        MaxRuntimeInSeconds: MonitoringMaxRuntimeInSeconds
    ): MonitoringStoppingCondition = {
      val __obj = js.Dynamic.literal(
        "MaxRuntimeInSeconds" -> MaxRuntimeInSeconds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MonitoringStoppingCondition]
    }
  }

  /**
    * A list of nested <a>Filter</a> objects. A resource must satisfy the conditions of all filters to be included in the results returned from the <a>Search</a> API.
    *  For example, to filter on a training job's <code>InputDataConfig</code> property with a specific channel name and <code>S3Uri</code> prefix, define the following filters:
    * * <code>'{Name:"InputDataConfig.ChannelName", "Operator":"Equals", "Value":"train"}',</code>
    *  * <code>'{Name:"InputDataConfig.DataSource.S3DataSource.S3Uri", "Operator":"Contains", "Value":"mybucket/catdata"}'</code>
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

  /**
    * Networking options for a job, such as network traffic encryption between containers, whether to allow inbound and outbound network calls to and from containers, and the VPC subnets and security groups to use for VPC-enabled jobs.
    */
  @js.native
  trait NetworkConfig extends js.Object {
    var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean]
    var EnableNetworkIsolation: js.UndefOr[Boolean]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object NetworkConfig {
    @inline
    def apply(
        EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined,
        EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): NetworkConfig = {
      val __obj = js.Dynamic.literal()
      EnableInterContainerTrafficEncryption.foreach(__v =>
        __obj.updateDynamic("EnableInterContainerTrafficEncryption")(__v.asInstanceOf[js.Any])
      )
      EnableNetworkIsolation.foreach(__v => __obj.updateDynamic("EnableNetworkIsolation")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkConfig]
    }
  }

  @js.native
  sealed trait NotebookInstanceAcceleratorType extends js.Any
  object NotebookInstanceAcceleratorType extends js.Object {
    val `ml.eia1.medium` = "ml.eia1.medium".asInstanceOf[NotebookInstanceAcceleratorType]
    val `ml.eia1.large`  = "ml.eia1.large".asInstanceOf[NotebookInstanceAcceleratorType]
    val `ml.eia1.xlarge` = "ml.eia1.xlarge".asInstanceOf[NotebookInstanceAcceleratorType]
    val `ml.eia2.medium` = "ml.eia2.medium".asInstanceOf[NotebookInstanceAcceleratorType]
    val `ml.eia2.large`  = "ml.eia2.large".asInstanceOf[NotebookInstanceAcceleratorType]
    val `ml.eia2.xlarge` = "ml.eia2.xlarge".asInstanceOf[NotebookInstanceAcceleratorType]

    val values = js.Object.freeze(
      js.Array(`ml.eia1.medium`, `ml.eia1.large`, `ml.eia1.xlarge`, `ml.eia2.medium`, `ml.eia2.large`, `ml.eia2.xlarge`)
    )
  }

  @js.native
  sealed trait NotebookInstanceLifecycleConfigSortKey extends js.Any
  object NotebookInstanceLifecycleConfigSortKey extends js.Object {
    val Name             = "Name".asInstanceOf[NotebookInstanceLifecycleConfigSortKey]
    val CreationTime     = "CreationTime".asInstanceOf[NotebookInstanceLifecycleConfigSortKey]
    val LastModifiedTime = "LastModifiedTime".asInstanceOf[NotebookInstanceLifecycleConfigSortKey]

    val values = js.Object.freeze(js.Array(Name, CreationTime, LastModifiedTime))
  }

  @js.native
  sealed trait NotebookInstanceLifecycleConfigSortOrder extends js.Any
  object NotebookInstanceLifecycleConfigSortOrder extends js.Object {
    val Ascending  = "Ascending".asInstanceOf[NotebookInstanceLifecycleConfigSortOrder]
    val Descending = "Descending".asInstanceOf[NotebookInstanceLifecycleConfigSortOrder]

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

  @js.native
  sealed trait NotebookInstanceSortKey extends js.Any
  object NotebookInstanceSortKey extends js.Object {
    val Name         = "Name".asInstanceOf[NotebookInstanceSortKey]
    val CreationTime = "CreationTime".asInstanceOf[NotebookInstanceSortKey]
    val Status       = "Status".asInstanceOf[NotebookInstanceSortKey]

    val values = js.Object.freeze(js.Array(Name, CreationTime, Status))
  }

  @js.native
  sealed trait NotebookInstanceSortOrder extends js.Any
  object NotebookInstanceSortOrder extends js.Object {
    val Ascending  = "Ascending".asInstanceOf[NotebookInstanceSortOrder]
    val Descending = "Descending".asInstanceOf[NotebookInstanceSortOrder]

    val values = js.Object.freeze(js.Array(Ascending, Descending))
  }

  @js.native
  sealed trait NotebookInstanceStatus extends js.Any
  object NotebookInstanceStatus extends js.Object {
    val Pending   = "Pending".asInstanceOf[NotebookInstanceStatus]
    val InService = "InService".asInstanceOf[NotebookInstanceStatus]
    val Stopping  = "Stopping".asInstanceOf[NotebookInstanceStatus]
    val Stopped   = "Stopped".asInstanceOf[NotebookInstanceStatus]
    val Failed    = "Failed".asInstanceOf[NotebookInstanceStatus]
    val Deleting  = "Deleting".asInstanceOf[NotebookInstanceStatus]
    val Updating  = "Updating".asInstanceOf[NotebookInstanceStatus]

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

      AdditionalCodeRepositories.foreach(__v =>
        __obj.updateDynamic("AdditionalCodeRepositories")(__v.asInstanceOf[js.Any])
      )
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DefaultCodeRepository.foreach(__v => __obj.updateDynamic("DefaultCodeRepository")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      NotebookInstanceLifecycleConfigName.foreach(__v =>
        __obj.updateDynamic("NotebookInstanceLifecycleConfigName")(__v.asInstanceOf[js.Any])
      )
      NotebookInstanceStatus.foreach(__v => __obj.updateDynamic("NotebookInstanceStatus")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotebookInstanceSummary]
    }
  }

  @js.native
  sealed trait NotebookOutputOption extends js.Any
  object NotebookOutputOption extends js.Object {
    val Allowed  = "Allowed".asInstanceOf[NotebookOutputOption]
    val Disabled = "Disabled".asInstanceOf[NotebookOutputOption]

    val values = js.Object.freeze(js.Array(Allowed, Disabled))
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

  @js.native
  sealed trait ObjectiveStatus extends js.Any
  object ObjectiveStatus extends js.Object {
    val Succeeded = "Succeeded".asInstanceOf[ObjectiveStatus]
    val Pending   = "Pending".asInstanceOf[ObjectiveStatus]
    val Failed    = "Failed".asInstanceOf[ObjectiveStatus]

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

  @js.native
  sealed trait Operator extends js.Any
  object Operator extends js.Object {
    val Equals               = "Equals".asInstanceOf[Operator]
    val NotEquals            = "NotEquals".asInstanceOf[Operator]
    val GreaterThan          = "GreaterThan".asInstanceOf[Operator]
    val GreaterThanOrEqualTo = "GreaterThanOrEqualTo".asInstanceOf[Operator]
    val LessThan             = "LessThan".asInstanceOf[Operator]
    val LessThanOrEqualTo    = "LessThanOrEqualTo".asInstanceOf[Operator]
    val Contains             = "Contains".asInstanceOf[Operator]
    val Exists               = "Exists".asInstanceOf[Operator]
    val NotExists            = "NotExists".asInstanceOf[Operator]
    val In                   = "In".asInstanceOf[Operator]

    val values = js.Object.freeze(
      js.Array(
        Equals,
        NotEquals,
        GreaterThan,
        GreaterThanOrEqualTo,
        LessThan,
        LessThanOrEqualTo,
        Contains,
        Exists,
        NotExists,
        In
      )
    )
  }

  @js.native
  sealed trait OrderKey extends js.Any
  object OrderKey extends js.Object {
    val Ascending  = "Ascending".asInstanceOf[OrderKey]
    val Descending = "Descending".asInstanceOf[OrderKey]

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
      CategoricalParameterRangeSpecification.foreach(__v =>
        __obj.updateDynamic("CategoricalParameterRangeSpecification")(__v.asInstanceOf[js.Any])
      )
      ContinuousParameterRangeSpecification.foreach(__v =>
        __obj.updateDynamic("ContinuousParameterRangeSpecification")(__v.asInstanceOf[js.Any])
      )
      IntegerParameterRangeSpecification.foreach(__v =>
        __obj.updateDynamic("IntegerParameterRangeSpecification")(__v.asInstanceOf[js.Any])
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
      CategoricalParameterRanges.foreach(__v =>
        __obj.updateDynamic("CategoricalParameterRanges")(__v.asInstanceOf[js.Any])
      )
      ContinuousParameterRanges.foreach(__v =>
        __obj.updateDynamic("ContinuousParameterRanges")(__v.asInstanceOf[js.Any])
      )
      IntegerParameterRanges.foreach(__v => __obj.updateDynamic("IntegerParameterRanges")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterRanges]
    }
  }

  @js.native
  sealed trait ParameterType extends js.Any
  object ParameterType extends js.Object {
    val Integer     = "Integer".asInstanceOf[ParameterType]
    val Continuous  = "Continuous".asInstanceOf[ParameterType]
    val Categorical = "Categorical".asInstanceOf[ParameterType]
    val FreeText    = "FreeText".asInstanceOf[ParameterType]

    val values = js.Object.freeze(js.Array(Integer, Continuous, Categorical, FreeText))
  }

  /**
    * The trial that a trial component is associated with and the experiment the trial is part of. A component might not be associated with a trial. A component can be associated with multiple trials.
    */
  @js.native
  trait Parent extends js.Object {
    var ExperimentName: js.UndefOr[ExperimentEntityName]
    var TrialName: js.UndefOr[ExperimentEntityName]
  }

  object Parent {
    @inline
    def apply(
        ExperimentName: js.UndefOr[ExperimentEntityName] = js.undefined,
        TrialName: js.UndefOr[ExperimentEntityName] = js.undefined
    ): Parent = {
      val __obj = js.Dynamic.literal()
      ExperimentName.foreach(__v => __obj.updateDynamic("ExperimentName")(__v.asInstanceOf[js.Any]))
      TrialName.foreach(__v => __obj.updateDynamic("TrialName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Parent]
    }
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
      HyperParameterTuningJobName.foreach(__v =>
        __obj.updateDynamic("HyperParameterTuningJobName")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ParentHyperParameterTuningJob]
    }
  }

  @js.native
  sealed trait ProblemType extends js.Any
  object ProblemType extends js.Object {
    val BinaryClassification     = "BinaryClassification".asInstanceOf[ProblemType]
    val MulticlassClassification = "MulticlassClassification".asInstanceOf[ProblemType]
    val Regression               = "Regression".asInstanceOf[ProblemType]

    val values = js.Object.freeze(js.Array(BinaryClassification, MulticlassClassification, Regression))
  }

  /**
    * Configuration for the cluster used to run a processing job.
    */
  @js.native
  trait ProcessingClusterConfig extends js.Object {
    var InstanceCount: ProcessingInstanceCount
    var InstanceType: ProcessingInstanceType
    var VolumeSizeInGB: ProcessingVolumeSizeInGB
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
  }

  object ProcessingClusterConfig {
    @inline
    def apply(
        InstanceCount: ProcessingInstanceCount,
        InstanceType: ProcessingInstanceType,
        VolumeSizeInGB: ProcessingVolumeSizeInGB,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): ProcessingClusterConfig = {
      val __obj = js.Dynamic.literal(
        "InstanceCount"  -> InstanceCount.asInstanceOf[js.Any],
        "InstanceType"   -> InstanceType.asInstanceOf[js.Any],
        "VolumeSizeInGB" -> VolumeSizeInGB.asInstanceOf[js.Any]
      )

      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProcessingClusterConfig]
    }
  }

  /**
    * The inputs for a processing job.
    */
  @js.native
  trait ProcessingInput extends js.Object {
    var InputName: String
    var S3Input: ProcessingS3Input
  }

  object ProcessingInput {
    @inline
    def apply(
        InputName: String,
        S3Input: ProcessingS3Input
    ): ProcessingInput = {
      val __obj = js.Dynamic.literal(
        "InputName" -> InputName.asInstanceOf[js.Any],
        "S3Input"   -> S3Input.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ProcessingInput]
    }
  }

  @js.native
  sealed trait ProcessingInstanceType extends js.Any
  object ProcessingInstanceType extends js.Object {
    val `ml.t3.medium`   = "ml.t3.medium".asInstanceOf[ProcessingInstanceType]
    val `ml.t3.large`    = "ml.t3.large".asInstanceOf[ProcessingInstanceType]
    val `ml.t3.xlarge`   = "ml.t3.xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.t3.2xlarge`  = "ml.t3.2xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.m4.xlarge`   = "ml.m4.xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.m4.2xlarge`  = "ml.m4.2xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.m4.4xlarge`  = "ml.m4.4xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.m4.10xlarge` = "ml.m4.10xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.m4.16xlarge` = "ml.m4.16xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.c4.xlarge`   = "ml.c4.xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.c4.2xlarge`  = "ml.c4.2xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.c4.4xlarge`  = "ml.c4.4xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.c4.8xlarge`  = "ml.c4.8xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.p2.xlarge`   = "ml.p2.xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.p2.8xlarge`  = "ml.p2.8xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.p2.16xlarge` = "ml.p2.16xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.p3.2xlarge`  = "ml.p3.2xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.p3.8xlarge`  = "ml.p3.8xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.p3.16xlarge` = "ml.p3.16xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.c5.xlarge`   = "ml.c5.xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.c5.2xlarge`  = "ml.c5.2xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.c5.4xlarge`  = "ml.c5.4xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.c5.9xlarge`  = "ml.c5.9xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.c5.18xlarge` = "ml.c5.18xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.m5.large`    = "ml.m5.large".asInstanceOf[ProcessingInstanceType]
    val `ml.m5.xlarge`   = "ml.m5.xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.m5.2xlarge`  = "ml.m5.2xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.m5.4xlarge`  = "ml.m5.4xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.m5.12xlarge` = "ml.m5.12xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.m5.24xlarge` = "ml.m5.24xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.r5.large`    = "ml.r5.large".asInstanceOf[ProcessingInstanceType]
    val `ml.r5.xlarge`   = "ml.r5.xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.r5.2xlarge`  = "ml.r5.2xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.r5.4xlarge`  = "ml.r5.4xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.r5.8xlarge`  = "ml.r5.8xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.r5.12xlarge` = "ml.r5.12xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.r5.16xlarge` = "ml.r5.16xlarge".asInstanceOf[ProcessingInstanceType]
    val `ml.r5.24xlarge` = "ml.r5.24xlarge".asInstanceOf[ProcessingInstanceType]

    val values = js.Object.freeze(
      js.Array(
        `ml.t3.medium`,
        `ml.t3.large`,
        `ml.t3.xlarge`,
        `ml.t3.2xlarge`,
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
        `ml.m5.24xlarge`,
        `ml.r5.large`,
        `ml.r5.xlarge`,
        `ml.r5.2xlarge`,
        `ml.r5.4xlarge`,
        `ml.r5.8xlarge`,
        `ml.r5.12xlarge`,
        `ml.r5.16xlarge`,
        `ml.r5.24xlarge`
      )
    )
  }

  /**
    * An Amazon SageMaker processing job that is used to analyze data and evaluate models. For more information, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/processing-job.html|Process Data and Evaluate Models]].
    */
  @js.native
  trait ProcessingJob extends js.Object {
    var AppSpecification: js.UndefOr[AppSpecification]
    var AutoMLJobArn: js.UndefOr[AutoMLJobArn]
    var CreationTime: js.UndefOr[Timestamp]
    var Environment: js.UndefOr[ProcessingEnvironmentMap]
    var ExitMessage: js.UndefOr[ExitMessage]
    var ExperimentConfig: js.UndefOr[ExperimentConfig]
    var FailureReason: js.UndefOr[FailureReason]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var MonitoringScheduleArn: js.UndefOr[MonitoringScheduleArn]
    var NetworkConfig: js.UndefOr[NetworkConfig]
    var ProcessingEndTime: js.UndefOr[Timestamp]
    var ProcessingInputs: js.UndefOr[ProcessingInputs]
    var ProcessingJobArn: js.UndefOr[ProcessingJobArn]
    var ProcessingJobName: js.UndefOr[ProcessingJobName]
    var ProcessingJobStatus: js.UndefOr[ProcessingJobStatus]
    var ProcessingOutputConfig: js.UndefOr[ProcessingOutputConfig]
    var ProcessingResources: js.UndefOr[ProcessingResources]
    var ProcessingStartTime: js.UndefOr[Timestamp]
    var RoleArn: js.UndefOr[RoleArn]
    var StoppingCondition: js.UndefOr[ProcessingStoppingCondition]
    var Tags: js.UndefOr[TagList]
    var TrainingJobArn: js.UndefOr[TrainingJobArn]
  }

  object ProcessingJob {
    @inline
    def apply(
        AppSpecification: js.UndefOr[AppSpecification] = js.undefined,
        AutoMLJobArn: js.UndefOr[AutoMLJobArn] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Environment: js.UndefOr[ProcessingEnvironmentMap] = js.undefined,
        ExitMessage: js.UndefOr[ExitMessage] = js.undefined,
        ExperimentConfig: js.UndefOr[ExperimentConfig] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        MonitoringScheduleArn: js.UndefOr[MonitoringScheduleArn] = js.undefined,
        NetworkConfig: js.UndefOr[NetworkConfig] = js.undefined,
        ProcessingEndTime: js.UndefOr[Timestamp] = js.undefined,
        ProcessingInputs: js.UndefOr[ProcessingInputs] = js.undefined,
        ProcessingJobArn: js.UndefOr[ProcessingJobArn] = js.undefined,
        ProcessingJobName: js.UndefOr[ProcessingJobName] = js.undefined,
        ProcessingJobStatus: js.UndefOr[ProcessingJobStatus] = js.undefined,
        ProcessingOutputConfig: js.UndefOr[ProcessingOutputConfig] = js.undefined,
        ProcessingResources: js.UndefOr[ProcessingResources] = js.undefined,
        ProcessingStartTime: js.UndefOr[Timestamp] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        StoppingCondition: js.UndefOr[ProcessingStoppingCondition] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TrainingJobArn: js.UndefOr[TrainingJobArn] = js.undefined
    ): ProcessingJob = {
      val __obj = js.Dynamic.literal()
      AppSpecification.foreach(__v => __obj.updateDynamic("AppSpecification")(__v.asInstanceOf[js.Any]))
      AutoMLJobArn.foreach(__v => __obj.updateDynamic("AutoMLJobArn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      ExitMessage.foreach(__v => __obj.updateDynamic("ExitMessage")(__v.asInstanceOf[js.Any]))
      ExperimentConfig.foreach(__v => __obj.updateDynamic("ExperimentConfig")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      MonitoringScheduleArn.foreach(__v => __obj.updateDynamic("MonitoringScheduleArn")(__v.asInstanceOf[js.Any]))
      NetworkConfig.foreach(__v => __obj.updateDynamic("NetworkConfig")(__v.asInstanceOf[js.Any]))
      ProcessingEndTime.foreach(__v => __obj.updateDynamic("ProcessingEndTime")(__v.asInstanceOf[js.Any]))
      ProcessingInputs.foreach(__v => __obj.updateDynamic("ProcessingInputs")(__v.asInstanceOf[js.Any]))
      ProcessingJobArn.foreach(__v => __obj.updateDynamic("ProcessingJobArn")(__v.asInstanceOf[js.Any]))
      ProcessingJobName.foreach(__v => __obj.updateDynamic("ProcessingJobName")(__v.asInstanceOf[js.Any]))
      ProcessingJobStatus.foreach(__v => __obj.updateDynamic("ProcessingJobStatus")(__v.asInstanceOf[js.Any]))
      ProcessingOutputConfig.foreach(__v => __obj.updateDynamic("ProcessingOutputConfig")(__v.asInstanceOf[js.Any]))
      ProcessingResources.foreach(__v => __obj.updateDynamic("ProcessingResources")(__v.asInstanceOf[js.Any]))
      ProcessingStartTime.foreach(__v => __obj.updateDynamic("ProcessingStartTime")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      StoppingCondition.foreach(__v => __obj.updateDynamic("StoppingCondition")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TrainingJobArn.foreach(__v => __obj.updateDynamic("TrainingJobArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProcessingJob]
    }
  }

  @js.native
  sealed trait ProcessingJobStatus extends js.Any
  object ProcessingJobStatus extends js.Object {
    val InProgress = "InProgress".asInstanceOf[ProcessingJobStatus]
    val Completed  = "Completed".asInstanceOf[ProcessingJobStatus]
    val Failed     = "Failed".asInstanceOf[ProcessingJobStatus]
    val Stopping   = "Stopping".asInstanceOf[ProcessingJobStatus]
    val Stopped    = "Stopped".asInstanceOf[ProcessingJobStatus]

    val values = js.Object.freeze(js.Array(InProgress, Completed, Failed, Stopping, Stopped))
  }

  /**
    * Summary of information about a processing job.
    */
  @js.native
  trait ProcessingJobSummary extends js.Object {
    var CreationTime: Timestamp
    var ProcessingJobArn: ProcessingJobArn
    var ProcessingJobName: ProcessingJobName
    var ProcessingJobStatus: ProcessingJobStatus
    var ExitMessage: js.UndefOr[ExitMessage]
    var FailureReason: js.UndefOr[FailureReason]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var ProcessingEndTime: js.UndefOr[Timestamp]
  }

  object ProcessingJobSummary {
    @inline
    def apply(
        CreationTime: Timestamp,
        ProcessingJobArn: ProcessingJobArn,
        ProcessingJobName: ProcessingJobName,
        ProcessingJobStatus: ProcessingJobStatus,
        ExitMessage: js.UndefOr[ExitMessage] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        ProcessingEndTime: js.UndefOr[Timestamp] = js.undefined
    ): ProcessingJobSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime"        -> CreationTime.asInstanceOf[js.Any],
        "ProcessingJobArn"    -> ProcessingJobArn.asInstanceOf[js.Any],
        "ProcessingJobName"   -> ProcessingJobName.asInstanceOf[js.Any],
        "ProcessingJobStatus" -> ProcessingJobStatus.asInstanceOf[js.Any]
      )

      ExitMessage.foreach(__v => __obj.updateDynamic("ExitMessage")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      ProcessingEndTime.foreach(__v => __obj.updateDynamic("ProcessingEndTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProcessingJobSummary]
    }
  }

  /**
    * Describes the results of a processing job.
    */
  @js.native
  trait ProcessingOutput extends js.Object {
    var OutputName: String
    var S3Output: ProcessingS3Output
  }

  object ProcessingOutput {
    @inline
    def apply(
        OutputName: String,
        S3Output: ProcessingS3Output
    ): ProcessingOutput = {
      val __obj = js.Dynamic.literal(
        "OutputName" -> OutputName.asInstanceOf[js.Any],
        "S3Output"   -> S3Output.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ProcessingOutput]
    }
  }

  /**
    * The output configuration for the processing job.
    */
  @js.native
  trait ProcessingOutputConfig extends js.Object {
    var Outputs: ProcessingOutputs
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object ProcessingOutputConfig {
    @inline
    def apply(
        Outputs: ProcessingOutputs,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): ProcessingOutputConfig = {
      val __obj = js.Dynamic.literal(
        "Outputs" -> Outputs.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProcessingOutputConfig]
    }
  }

  /**
    * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In distributed training, you specify more than one instance.
    */
  @js.native
  trait ProcessingResources extends js.Object {
    var ClusterConfig: ProcessingClusterConfig
  }

  object ProcessingResources {
    @inline
    def apply(
        ClusterConfig: ProcessingClusterConfig
    ): ProcessingResources = {
      val __obj = js.Dynamic.literal(
        "ClusterConfig" -> ClusterConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ProcessingResources]
    }
  }

  @js.native
  sealed trait ProcessingS3CompressionType extends js.Any
  object ProcessingS3CompressionType extends js.Object {
    val None = "None".asInstanceOf[ProcessingS3CompressionType]
    val Gzip = "Gzip".asInstanceOf[ProcessingS3CompressionType]

    val values = js.Object.freeze(js.Array(None, Gzip))
  }

  @js.native
  sealed trait ProcessingS3DataDistributionType extends js.Any
  object ProcessingS3DataDistributionType extends js.Object {
    val FullyReplicated = "FullyReplicated".asInstanceOf[ProcessingS3DataDistributionType]
    val ShardedByS3Key  = "ShardedByS3Key".asInstanceOf[ProcessingS3DataDistributionType]

    val values = js.Object.freeze(js.Array(FullyReplicated, ShardedByS3Key))
  }

  @js.native
  sealed trait ProcessingS3DataType extends js.Any
  object ProcessingS3DataType extends js.Object {
    val ManifestFile = "ManifestFile".asInstanceOf[ProcessingS3DataType]
    val S3Prefix     = "S3Prefix".asInstanceOf[ProcessingS3DataType]

    val values = js.Object.freeze(js.Array(ManifestFile, S3Prefix))
  }

  /**
    * Information about where and how you want to obtain the inputs for an processing job.
    */
  @js.native
  trait ProcessingS3Input extends js.Object {
    var LocalPath: ProcessingLocalPath
    var S3DataType: ProcessingS3DataType
    var S3InputMode: ProcessingS3InputMode
    var S3Uri: S3Uri
    var S3CompressionType: js.UndefOr[ProcessingS3CompressionType]
    var S3DataDistributionType: js.UndefOr[ProcessingS3DataDistributionType]
  }

  object ProcessingS3Input {
    @inline
    def apply(
        LocalPath: ProcessingLocalPath,
        S3DataType: ProcessingS3DataType,
        S3InputMode: ProcessingS3InputMode,
        S3Uri: S3Uri,
        S3CompressionType: js.UndefOr[ProcessingS3CompressionType] = js.undefined,
        S3DataDistributionType: js.UndefOr[ProcessingS3DataDistributionType] = js.undefined
    ): ProcessingS3Input = {
      val __obj = js.Dynamic.literal(
        "LocalPath"   -> LocalPath.asInstanceOf[js.Any],
        "S3DataType"  -> S3DataType.asInstanceOf[js.Any],
        "S3InputMode" -> S3InputMode.asInstanceOf[js.Any],
        "S3Uri"       -> S3Uri.asInstanceOf[js.Any]
      )

      S3CompressionType.foreach(__v => __obj.updateDynamic("S3CompressionType")(__v.asInstanceOf[js.Any]))
      S3DataDistributionType.foreach(__v => __obj.updateDynamic("S3DataDistributionType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProcessingS3Input]
    }
  }

  @js.native
  sealed trait ProcessingS3InputMode extends js.Any
  object ProcessingS3InputMode extends js.Object {
    val Pipe = "Pipe".asInstanceOf[ProcessingS3InputMode]
    val File = "File".asInstanceOf[ProcessingS3InputMode]

    val values = js.Object.freeze(js.Array(Pipe, File))
  }

  /**
    * Information about where and how you want to store the results of an processing job.
    */
  @js.native
  trait ProcessingS3Output extends js.Object {
    var LocalPath: ProcessingLocalPath
    var S3UploadMode: ProcessingS3UploadMode
    var S3Uri: S3Uri
  }

  object ProcessingS3Output {
    @inline
    def apply(
        LocalPath: ProcessingLocalPath,
        S3UploadMode: ProcessingS3UploadMode,
        S3Uri: S3Uri
    ): ProcessingS3Output = {
      val __obj = js.Dynamic.literal(
        "LocalPath"    -> LocalPath.asInstanceOf[js.Any],
        "S3UploadMode" -> S3UploadMode.asInstanceOf[js.Any],
        "S3Uri"        -> S3Uri.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ProcessingS3Output]
    }
  }

  @js.native
  sealed trait ProcessingS3UploadMode extends js.Any
  object ProcessingS3UploadMode extends js.Object {
    val Continuous = "Continuous".asInstanceOf[ProcessingS3UploadMode]
    val EndOfJob   = "EndOfJob".asInstanceOf[ProcessingS3UploadMode]

    val values = js.Object.freeze(js.Array(Continuous, EndOfJob))
  }

  /**
    * Specifies a time limit for how long the processing job is allowed to run.
    */
  @js.native
  trait ProcessingStoppingCondition extends js.Object {
    var MaxRuntimeInSeconds: ProcessingMaxRuntimeInSeconds
  }

  object ProcessingStoppingCondition {
    @inline
    def apply(
        MaxRuntimeInSeconds: ProcessingMaxRuntimeInSeconds
    ): ProcessingStoppingCondition = {
      val __obj = js.Dynamic.literal(
        "MaxRuntimeInSeconds" -> MaxRuntimeInSeconds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ProcessingStoppingCondition]
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

  @js.native
  sealed trait ProductionVariantAcceleratorType extends js.Any
  object ProductionVariantAcceleratorType extends js.Object {
    val `ml.eia1.medium` = "ml.eia1.medium".asInstanceOf[ProductionVariantAcceleratorType]
    val `ml.eia1.large`  = "ml.eia1.large".asInstanceOf[ProductionVariantAcceleratorType]
    val `ml.eia1.xlarge` = "ml.eia1.xlarge".asInstanceOf[ProductionVariantAcceleratorType]
    val `ml.eia2.medium` = "ml.eia2.medium".asInstanceOf[ProductionVariantAcceleratorType]
    val `ml.eia2.large`  = "ml.eia2.large".asInstanceOf[ProductionVariantAcceleratorType]
    val `ml.eia2.xlarge` = "ml.eia2.xlarge".asInstanceOf[ProductionVariantAcceleratorType]

    val values = js.Object.freeze(
      js.Array(`ml.eia1.medium`, `ml.eia1.large`, `ml.eia1.xlarge`, `ml.eia2.medium`, `ml.eia2.large`, `ml.eia2.xlarge`)
    )
  }

  @js.native
  sealed trait ProductionVariantInstanceType extends js.Any
  object ProductionVariantInstanceType extends js.Object {
    val `ml.t2.medium`     = "ml.t2.medium".asInstanceOf[ProductionVariantInstanceType]
    val `ml.t2.large`      = "ml.t2.large".asInstanceOf[ProductionVariantInstanceType]
    val `ml.t2.xlarge`     = "ml.t2.xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.t2.2xlarge`    = "ml.t2.2xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.m4.xlarge`     = "ml.m4.xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.m4.2xlarge`    = "ml.m4.2xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.m4.4xlarge`    = "ml.m4.4xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.m4.10xlarge`   = "ml.m4.10xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.m4.16xlarge`   = "ml.m4.16xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.m5.large`      = "ml.m5.large".asInstanceOf[ProductionVariantInstanceType]
    val `ml.m5.xlarge`     = "ml.m5.xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.m5.2xlarge`    = "ml.m5.2xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.m5.4xlarge`    = "ml.m5.4xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.m5.12xlarge`   = "ml.m5.12xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.m5.24xlarge`   = "ml.m5.24xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.m5d.large`     = "ml.m5d.large".asInstanceOf[ProductionVariantInstanceType]
    val `ml.m5d.xlarge`    = "ml.m5d.xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.m5d.2xlarge`   = "ml.m5d.2xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.m5d.4xlarge`   = "ml.m5d.4xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.m5d.12xlarge`  = "ml.m5d.12xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.m5d.24xlarge`  = "ml.m5d.24xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.c4.large`      = "ml.c4.large".asInstanceOf[ProductionVariantInstanceType]
    val `ml.c4.xlarge`     = "ml.c4.xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.c4.2xlarge`    = "ml.c4.2xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.c4.4xlarge`    = "ml.c4.4xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.c4.8xlarge`    = "ml.c4.8xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.p2.xlarge`     = "ml.p2.xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.p2.8xlarge`    = "ml.p2.8xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.p2.16xlarge`   = "ml.p2.16xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.p3.2xlarge`    = "ml.p3.2xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.p3.8xlarge`    = "ml.p3.8xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.p3.16xlarge`   = "ml.p3.16xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.c5.large`      = "ml.c5.large".asInstanceOf[ProductionVariantInstanceType]
    val `ml.c5.xlarge`     = "ml.c5.xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.c5.2xlarge`    = "ml.c5.2xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.c5.4xlarge`    = "ml.c5.4xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.c5.9xlarge`    = "ml.c5.9xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.c5.18xlarge`   = "ml.c5.18xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.c5d.large`     = "ml.c5d.large".asInstanceOf[ProductionVariantInstanceType]
    val `ml.c5d.xlarge`    = "ml.c5d.xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.c5d.2xlarge`   = "ml.c5d.2xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.c5d.4xlarge`   = "ml.c5d.4xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.c5d.9xlarge`   = "ml.c5d.9xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.c5d.18xlarge`  = "ml.c5d.18xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.g4dn.xlarge`   = "ml.g4dn.xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.g4dn.2xlarge`  = "ml.g4dn.2xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.g4dn.4xlarge`  = "ml.g4dn.4xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.g4dn.8xlarge`  = "ml.g4dn.8xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.g4dn.12xlarge` = "ml.g4dn.12xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.g4dn.16xlarge` = "ml.g4dn.16xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.r5.large`      = "ml.r5.large".asInstanceOf[ProductionVariantInstanceType]
    val `ml.r5.xlarge`     = "ml.r5.xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.r5.2xlarge`    = "ml.r5.2xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.r5.4xlarge`    = "ml.r5.4xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.r5.12xlarge`   = "ml.r5.12xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.r5.24xlarge`   = "ml.r5.24xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.r5d.large`     = "ml.r5d.large".asInstanceOf[ProductionVariantInstanceType]
    val `ml.r5d.xlarge`    = "ml.r5d.xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.r5d.2xlarge`   = "ml.r5d.2xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.r5d.4xlarge`   = "ml.r5d.4xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.r5d.12xlarge`  = "ml.r5d.12xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.r5d.24xlarge`  = "ml.r5d.24xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.inf1.xlarge`   = "ml.inf1.xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.inf1.2xlarge`  = "ml.inf1.2xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.inf1.6xlarge`  = "ml.inf1.6xlarge".asInstanceOf[ProductionVariantInstanceType]
    val `ml.inf1.24xlarge` = "ml.inf1.24xlarge".asInstanceOf[ProductionVariantInstanceType]

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
        `ml.m5d.large`,
        `ml.m5d.xlarge`,
        `ml.m5d.2xlarge`,
        `ml.m5d.4xlarge`,
        `ml.m5d.12xlarge`,
        `ml.m5d.24xlarge`,
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
        `ml.c5.18xlarge`,
        `ml.c5d.large`,
        `ml.c5d.xlarge`,
        `ml.c5d.2xlarge`,
        `ml.c5d.4xlarge`,
        `ml.c5d.9xlarge`,
        `ml.c5d.18xlarge`,
        `ml.g4dn.xlarge`,
        `ml.g4dn.2xlarge`,
        `ml.g4dn.4xlarge`,
        `ml.g4dn.8xlarge`,
        `ml.g4dn.12xlarge`,
        `ml.g4dn.16xlarge`,
        `ml.r5.large`,
        `ml.r5.xlarge`,
        `ml.r5.2xlarge`,
        `ml.r5.4xlarge`,
        `ml.r5.12xlarge`,
        `ml.r5.24xlarge`,
        `ml.r5d.large`,
        `ml.r5d.xlarge`,
        `ml.r5d.2xlarge`,
        `ml.r5d.4xlarge`,
        `ml.r5d.12xlarge`,
        `ml.r5d.24xlarge`,
        `ml.inf1.xlarge`,
        `ml.inf1.2xlarge`,
        `ml.inf1.6xlarge`,
        `ml.inf1.24xlarge`
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
    * Part of the <code>SuggestionQuery</code> type. Specifies a hint for retrieving property names that begin with the specified text.
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
    * Use one of the following prices for Textract AnalyzeDocument Important Form Key Amazon Augmented AI review tasks. Prices are in US dollars.
    * * 2.400
    *  * 2.280
    *  * 2.160
    *  * 2.040
    *  * 1.920
    *  * 1.800
    *  * 1.680
    *  * 1.560
    *  * 1.440
    *  * 1.320
    *  * 1.200
    *  * 1.080
    *  * 0.960
    *  * 0.840
    *  * 0.720
    *  * 0.600
    *  * 0.480
    *  * 0.360
    *  * 0.240
    *  * 0.120
    *  * 0.072
    *  * 0.060
    *  * 0.048
    *  * 0.036
    *  * 0.024
    *  * 0.012
    * Use one of the following prices for Rekognition DetectModerationLabels Amazon Augmented AI review tasks. Prices are in US dollars.
    * * 1.200
    *  * 1.080
    *  * 0.960
    *  * 0.840
    *  * 0.720
    *  * 0.600
    *  * 0.480
    *  * 0.360
    *  * 0.240
    *  * 0.120
    *  * 0.072
    *  * 0.060
    *  * 0.048
    *  * 0.036
    *  * 0.024
    *  * 0.012
    * Use one of the following prices for Amazon Augmented AI custom human review tasks. Prices are in US dollars.
    * * 1.200
    *  * 1.080
    *  * 0.960
    *  * 0.840
    *  * 0.720
    *  * 0.600
    *  * 0.480
    *  * 0.360
    *  * 0.240
    *  * 0.120
    *  * 0.072
    *  * 0.060
    *  * 0.048
    *  * 0.036
    *  * 0.024
    *  * 0.012
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

  @js.native
  sealed trait RecordWrapper extends js.Any
  object RecordWrapper extends js.Object {
    val None     = "None".asInstanceOf[RecordWrapper]
    val RecordIO = "RecordIO".asInstanceOf[RecordWrapper]

    val values = js.Object.freeze(js.Array(None, RecordIO))
  }

  @js.native
  trait RenderUiTemplateRequest extends js.Object {
    var RoleArn: RoleArn
    var Task: RenderableTask
    var HumanTaskUiArn: js.UndefOr[HumanTaskUiArn]
    var UiTemplate: js.UndefOr[UiTemplate]
  }

  object RenderUiTemplateRequest {
    @inline
    def apply(
        RoleArn: RoleArn,
        Task: RenderableTask,
        HumanTaskUiArn: js.UndefOr[HumanTaskUiArn] = js.undefined,
        UiTemplate: js.UndefOr[UiTemplate] = js.undefined
    ): RenderUiTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "Task"    -> Task.asInstanceOf[js.Any]
      )

      HumanTaskUiArn.foreach(__v => __obj.updateDynamic("HumanTaskUiArn")(__v.asInstanceOf[js.Any]))
      UiTemplate.foreach(__v => __obj.updateDynamic("UiTemplate")(__v.asInstanceOf[js.Any]))
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
    * The resolved attributes.
    */
  @js.native
  trait ResolvedAttributes extends js.Object {
    var AutoMLJobObjective: js.UndefOr[AutoMLJobObjective]
    var CompletionCriteria: js.UndefOr[AutoMLJobCompletionCriteria]
    var ProblemType: js.UndefOr[ProblemType]
  }

  object ResolvedAttributes {
    @inline
    def apply(
        AutoMLJobObjective: js.UndefOr[AutoMLJobObjective] = js.undefined,
        CompletionCriteria: js.UndefOr[AutoMLJobCompletionCriteria] = js.undefined,
        ProblemType: js.UndefOr[ProblemType] = js.undefined
    ): ResolvedAttributes = {
      val __obj = js.Dynamic.literal()
      AutoMLJobObjective.foreach(__v => __obj.updateDynamic("AutoMLJobObjective")(__v.asInstanceOf[js.Any]))
      CompletionCriteria.foreach(__v => __obj.updateDynamic("CompletionCriteria")(__v.asInstanceOf[js.Any]))
      ProblemType.foreach(__v => __obj.updateDynamic("ProblemType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResolvedAttributes]
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

  /**
    * The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. The ARN is stored as metadata in SageMaker Studio notebooks.
    */
  @js.native
  trait ResourceSpec extends js.Object {
    var InstanceType: js.UndefOr[AppInstanceType]
    var SageMakerImageArn: js.UndefOr[SageMakerImageArn]
  }

  object ResourceSpec {
    @inline
    def apply(
        InstanceType: js.UndefOr[AppInstanceType] = js.undefined,
        SageMakerImageArn: js.UndefOr[SageMakerImageArn] = js.undefined
    ): ResourceSpec = {
      val __obj = js.Dynamic.literal()
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      SageMakerImageArn.foreach(__v => __obj.updateDynamic("SageMakerImageArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceSpec]
    }
  }

  @js.native
  sealed trait ResourceType extends js.Any
  object ResourceType extends js.Object {
    val TrainingJob              = "TrainingJob".asInstanceOf[ResourceType]
    val Experiment               = "Experiment".asInstanceOf[ResourceType]
    val ExperimentTrial          = "ExperimentTrial".asInstanceOf[ResourceType]
    val ExperimentTrialComponent = "ExperimentTrialComponent".asInstanceOf[ResourceType]

    val values = js.Object.freeze(js.Array(TrainingJob, Experiment, ExperimentTrial, ExperimentTrialComponent))
  }

  /**
    * The retention policy for data stored on an Amazon Elastic File System (EFS) volume.
    */
  @js.native
  trait RetentionPolicy extends js.Object {
    var HomeEfsFileSystem: js.UndefOr[RetentionType]
  }

  object RetentionPolicy {
    @inline
    def apply(
        HomeEfsFileSystem: js.UndefOr[RetentionType] = js.undefined
    ): RetentionPolicy = {
      val __obj = js.Dynamic.literal()
      HomeEfsFileSystem.foreach(__v => __obj.updateDynamic("HomeEfsFileSystem")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetentionPolicy]
    }
  }

  @js.native
  sealed trait RetentionType extends js.Any
  object RetentionType extends js.Object {
    val Retain = "Retain".asInstanceOf[RetentionType]
    val Delete = "Delete".asInstanceOf[RetentionType]

    val values = js.Object.freeze(js.Array(Retain, Delete))
  }

  @js.native
  sealed trait RootAccess extends js.Any
  object RootAccess extends js.Object {
    val Enabled  = "Enabled".asInstanceOf[RootAccess]
    val Disabled = "Disabled".asInstanceOf[RootAccess]

    val values = js.Object.freeze(js.Array(Enabled, Disabled))
  }

  @js.native
  sealed trait RuleEvaluationStatus extends js.Any
  object RuleEvaluationStatus extends js.Object {
    val InProgress    = "InProgress".asInstanceOf[RuleEvaluationStatus]
    val NoIssuesFound = "NoIssuesFound".asInstanceOf[RuleEvaluationStatus]
    val IssuesFound   = "IssuesFound".asInstanceOf[RuleEvaluationStatus]
    val Error         = "Error".asInstanceOf[RuleEvaluationStatus]
    val Stopping      = "Stopping".asInstanceOf[RuleEvaluationStatus]
    val Stopped       = "Stopped".asInstanceOf[RuleEvaluationStatus]

    val values = js.Object.freeze(js.Array(InProgress, NoIssuesFound, IssuesFound, Error, Stopping, Stopped))
  }

  @js.native
  sealed trait S3DataDistribution extends js.Any
  object S3DataDistribution extends js.Object {
    val FullyReplicated = "FullyReplicated".asInstanceOf[S3DataDistribution]
    val ShardedByS3Key  = "ShardedByS3Key".asInstanceOf[S3DataDistribution]

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

  @js.native
  sealed trait S3DataType extends js.Any
  object S3DataType extends js.Object {
    val ManifestFile          = "ManifestFile".asInstanceOf[S3DataType]
    val S3Prefix              = "S3Prefix".asInstanceOf[S3DataType]
    val AugmentedManifestFile = "AugmentedManifestFile".asInstanceOf[S3DataType]

    val values = js.Object.freeze(js.Array(ManifestFile, S3Prefix, AugmentedManifestFile))
  }

  /**
    * Configuration details about the monitoring schedule.
    */
  @js.native
  trait ScheduleConfig extends js.Object {
    var ScheduleExpression: ScheduleExpression
  }

  object ScheduleConfig {
    @inline
    def apply(
        ScheduleExpression: ScheduleExpression
    ): ScheduleConfig = {
      val __obj = js.Dynamic.literal(
        "ScheduleExpression" -> ScheduleExpression.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ScheduleConfig]
    }
  }

  @js.native
  sealed trait ScheduleStatus extends js.Any
  object ScheduleStatus extends js.Object {
    val Pending   = "Pending".asInstanceOf[ScheduleStatus]
    val Failed    = "Failed".asInstanceOf[ScheduleStatus]
    val Scheduled = "Scheduled".asInstanceOf[ScheduleStatus]
    val Stopped   = "Stopped".asInstanceOf[ScheduleStatus]

    val values = js.Object.freeze(js.Array(Pending, Failed, Scheduled, Stopped))
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
    * A single resource returned as part of the <a>Search</a> API response.
    */
  @js.native
  trait SearchRecord extends js.Object {
    var Experiment: js.UndefOr[Experiment]
    var TrainingJob: js.UndefOr[TrainingJob]
    var Trial: js.UndefOr[Trial]
    var TrialComponent: js.UndefOr[TrialComponent]
  }

  object SearchRecord {
    @inline
    def apply(
        Experiment: js.UndefOr[Experiment] = js.undefined,
        TrainingJob: js.UndefOr[TrainingJob] = js.undefined,
        Trial: js.UndefOr[Trial] = js.undefined,
        TrialComponent: js.UndefOr[TrialComponent] = js.undefined
    ): SearchRecord = {
      val __obj = js.Dynamic.literal()
      Experiment.foreach(__v => __obj.updateDynamic("Experiment")(__v.asInstanceOf[js.Any]))
      TrainingJob.foreach(__v => __obj.updateDynamic("TrainingJob")(__v.asInstanceOf[js.Any]))
      Trial.foreach(__v => __obj.updateDynamic("Trial")(__v.asInstanceOf[js.Any]))
      TrialComponent.foreach(__v => __obj.updateDynamic("TrialComponent")(__v.asInstanceOf[js.Any]))
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

  @js.native
  sealed trait SearchSortOrder extends js.Any
  object SearchSortOrder extends js.Object {
    val Ascending  = "Ascending".asInstanceOf[SearchSortOrder]
    val Descending = "Descending".asInstanceOf[SearchSortOrder]

    val values = js.Object.freeze(js.Array(Ascending, Descending))
  }

  @js.native
  sealed trait SecondaryStatus extends js.Any
  object SecondaryStatus extends js.Object {
    val Starting                 = "Starting".asInstanceOf[SecondaryStatus]
    val LaunchingMLInstances     = "LaunchingMLInstances".asInstanceOf[SecondaryStatus]
    val PreparingTrainingStack   = "PreparingTrainingStack".asInstanceOf[SecondaryStatus]
    val Downloading              = "Downloading".asInstanceOf[SecondaryStatus]
    val DownloadingTrainingImage = "DownloadingTrainingImage".asInstanceOf[SecondaryStatus]
    val Training                 = "Training".asInstanceOf[SecondaryStatus]
    val Uploading                = "Uploading".asInstanceOf[SecondaryStatus]
    val Stopping                 = "Stopping".asInstanceOf[SecondaryStatus]
    val Stopped                  = "Stopped".asInstanceOf[SecondaryStatus]
    val MaxRuntimeExceeded       = "MaxRuntimeExceeded".asInstanceOf[SecondaryStatus]
    val Completed                = "Completed".asInstanceOf[SecondaryStatus]
    val Failed                   = "Failed".asInstanceOf[SecondaryStatus]
    val Interrupted              = "Interrupted".asInstanceOf[SecondaryStatus]
    val MaxWaitTimeExceeded      = "MaxWaitTimeExceeded".asInstanceOf[SecondaryStatus]

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
    * Specifies options when sharing an Amazon SageMaker Studio notebook. These settings are specified as part of <code>DefaultUserSettings</code> when the <a>CreateDomain</a> API is called, and as part of <code>UserSettings</code> when the <a>CreateUserProfile</a> API is called.
    */
  @js.native
  trait SharingSettings extends js.Object {
    var NotebookOutputOption: js.UndefOr[NotebookOutputOption]
    var S3KmsKeyId: js.UndefOr[KmsKeyId]
    var S3OutputPath: js.UndefOr[S3Uri]
  }

  object SharingSettings {
    @inline
    def apply(
        NotebookOutputOption: js.UndefOr[NotebookOutputOption] = js.undefined,
        S3KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        S3OutputPath: js.UndefOr[S3Uri] = js.undefined
    ): SharingSettings = {
      val __obj = js.Dynamic.literal()
      NotebookOutputOption.foreach(__v => __obj.updateDynamic("NotebookOutputOption")(__v.asInstanceOf[js.Any]))
      S3KmsKeyId.foreach(__v => __obj.updateDynamic("S3KmsKeyId")(__v.asInstanceOf[js.Any]))
      S3OutputPath.foreach(__v => __obj.updateDynamic("S3OutputPath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SharingSettings]
    }
  }

  /**
    * A configuration for a shuffle option for input data in a channel. If you use <code>S3Prefix</code> for <code>S3DataType</code>, the results of the S3 key prefix matches are shuffled. If you use <code>ManifestFile</code>, the order of the S3 object references in the <code>ManifestFile</code> is shuffled. If you use <code>AugmentedManifestFile</code>, the order of the JSON lines in the <code>AugmentedManifestFile</code> is shuffled. The shuffling order is determined using the <code>Seed</code> value.
    *  For Pipe input mode, when <code>ShuffleConfig</code> is specified shuffling is done at the start of every epoch. With large datasets, this ensures that the order of the training data is different for each epoch, and it helps reduce bias and possible overfitting. In a multi-node training job when <code>ShuffleConfig</code> is combined with <code>S3DataDistributionType</code> of <code>ShardedByS3Key</code>, the data is shuffled across nodes so that the content sent to a particular node on the first epoch might be sent to a different node on the second epoch.
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

  @js.native
  sealed trait SortBy extends js.Any
  object SortBy extends js.Object {
    val Name         = "Name".asInstanceOf[SortBy]
    val CreationTime = "CreationTime".asInstanceOf[SortBy]
    val Status       = "Status".asInstanceOf[SortBy]

    val values = js.Object.freeze(js.Array(Name, CreationTime, Status))
  }

  @js.native
  sealed trait SortExperimentsBy extends js.Any
  object SortExperimentsBy extends js.Object {
    val Name         = "Name".asInstanceOf[SortExperimentsBy]
    val CreationTime = "CreationTime".asInstanceOf[SortExperimentsBy]

    val values = js.Object.freeze(js.Array(Name, CreationTime))
  }

  @js.native
  sealed trait SortOrder extends js.Any
  object SortOrder extends js.Object {
    val Ascending  = "Ascending".asInstanceOf[SortOrder]
    val Descending = "Descending".asInstanceOf[SortOrder]

    val values = js.Object.freeze(js.Array(Ascending, Descending))
  }

  @js.native
  sealed trait SortTrialComponentsBy extends js.Any
  object SortTrialComponentsBy extends js.Object {
    val Name         = "Name".asInstanceOf[SortTrialComponentsBy]
    val CreationTime = "CreationTime".asInstanceOf[SortTrialComponentsBy]

    val values = js.Object.freeze(js.Array(Name, CreationTime))
  }

  @js.native
  sealed trait SortTrialsBy extends js.Any
  object SortTrialsBy extends js.Object {
    val Name         = "Name".asInstanceOf[SortTrialsBy]
    val CreationTime = "CreationTime".asInstanceOf[SortTrialsBy]

    val values = js.Object.freeze(js.Array(Name, CreationTime))
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

  /**
    * A list of IP address ranges ([[https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html|CIDRs]]). Used to create an allow list of IP addresses for a private workforce. For more information, see .
    */
  @js.native
  trait SourceIpConfig extends js.Object {
    var Cidrs: Cidrs
  }

  object SourceIpConfig {
    @inline
    def apply(
        Cidrs: Cidrs
    ): SourceIpConfig = {
      val __obj = js.Dynamic.literal(
        "Cidrs" -> Cidrs.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SourceIpConfig]
    }
  }

  @js.native
  sealed trait SplitType extends js.Any
  object SplitType extends js.Object {
    val None     = "None".asInstanceOf[SplitType]
    val Line     = "Line".asInstanceOf[SplitType]
    val RecordIO = "RecordIO".asInstanceOf[SplitType]
    val TFRecord = "TFRecord".asInstanceOf[SplitType]

    val values = js.Object.freeze(js.Array(None, Line, RecordIO, TFRecord))
  }

  @js.native
  trait StartMonitoringScheduleRequest extends js.Object {
    var MonitoringScheduleName: MonitoringScheduleName
  }

  object StartMonitoringScheduleRequest {
    @inline
    def apply(
        MonitoringScheduleName: MonitoringScheduleName
    ): StartMonitoringScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "MonitoringScheduleName" -> MonitoringScheduleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartMonitoringScheduleRequest]
    }
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
  trait StopAutoMLJobRequest extends js.Object {
    var AutoMLJobName: AutoMLJobName
  }

  object StopAutoMLJobRequest {
    @inline
    def apply(
        AutoMLJobName: AutoMLJobName
    ): StopAutoMLJobRequest = {
      val __obj = js.Dynamic.literal(
        "AutoMLJobName" -> AutoMLJobName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopAutoMLJobRequest]
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
  trait StopMonitoringScheduleRequest extends js.Object {
    var MonitoringScheduleName: MonitoringScheduleName
  }

  object StopMonitoringScheduleRequest {
    @inline
    def apply(
        MonitoringScheduleName: MonitoringScheduleName
    ): StopMonitoringScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "MonitoringScheduleName" -> MonitoringScheduleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopMonitoringScheduleRequest]
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
  trait StopProcessingJobRequest extends js.Object {
    var ProcessingJobName: ProcessingJobName
  }

  object StopProcessingJobRequest {
    @inline
    def apply(
        ProcessingJobName: ProcessingJobName
    ): StopProcessingJobRequest = {
      val __obj = js.Dynamic.literal(
        "ProcessingJobName" -> ProcessingJobName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopProcessingJobRequest]
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
    * Specified in the <a>GetSearchSuggestions</a> request. Limits the property names that are included in the response.
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

  @js.native
  sealed trait TargetDevice extends js.Any
  object TargetDevice extends js.Object {
    val lambda        = "lambda".asInstanceOf[TargetDevice]
    val ml_m4         = "ml_m4".asInstanceOf[TargetDevice]
    val ml_m5         = "ml_m5".asInstanceOf[TargetDevice]
    val ml_c4         = "ml_c4".asInstanceOf[TargetDevice]
    val ml_c5         = "ml_c5".asInstanceOf[TargetDevice]
    val ml_p2         = "ml_p2".asInstanceOf[TargetDevice]
    val ml_p3         = "ml_p3".asInstanceOf[TargetDevice]
    val ml_inf1       = "ml_inf1".asInstanceOf[TargetDevice]
    val jetson_tx1    = "jetson_tx1".asInstanceOf[TargetDevice]
    val jetson_tx2    = "jetson_tx2".asInstanceOf[TargetDevice]
    val jetson_nano   = "jetson_nano".asInstanceOf[TargetDevice]
    val jetson_xavier = "jetson_xavier".asInstanceOf[TargetDevice]
    val rasp3b        = "rasp3b".asInstanceOf[TargetDevice]
    val imx8qm        = "imx8qm".asInstanceOf[TargetDevice]
    val deeplens      = "deeplens".asInstanceOf[TargetDevice]
    val rk3399        = "rk3399".asInstanceOf[TargetDevice]
    val rk3288        = "rk3288".asInstanceOf[TargetDevice]
    val aisage        = "aisage".asInstanceOf[TargetDevice]
    val sbe_c         = "sbe_c".asInstanceOf[TargetDevice]
    val qcs605        = "qcs605".asInstanceOf[TargetDevice]
    val qcs603        = "qcs603".asInstanceOf[TargetDevice]
    val sitara_am57x  = "sitara_am57x".asInstanceOf[TargetDevice]
    val amba_cv22     = "amba_cv22".asInstanceOf[TargetDevice]

    val values = js.Object.freeze(
      js.Array(
        lambda,
        ml_m4,
        ml_m5,
        ml_c4,
        ml_c5,
        ml_p2,
        ml_p3,
        ml_inf1,
        jetson_tx1,
        jetson_tx2,
        jetson_nano,
        jetson_xavier,
        rasp3b,
        imx8qm,
        deeplens,
        rk3399,
        rk3288,
        aisage,
        sbe_c,
        qcs605,
        qcs603,
        sitara_am57x,
        amba_cv22
      )
    )
  }

  /**
    * The TensorBoard app settings.
    */
  @js.native
  trait TensorBoardAppSettings extends js.Object {
    var DefaultResourceSpec: js.UndefOr[ResourceSpec]
  }

  object TensorBoardAppSettings {
    @inline
    def apply(
        DefaultResourceSpec: js.UndefOr[ResourceSpec] = js.undefined
    ): TensorBoardAppSettings = {
      val __obj = js.Dynamic.literal()
      DefaultResourceSpec.foreach(__v => __obj.updateDynamic("DefaultResourceSpec")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TensorBoardAppSettings]
    }
  }

  /**
    * Configuration of storage locations for TensorBoard output.
    */
  @js.native
  trait TensorBoardOutputConfig extends js.Object {
    var S3OutputPath: S3Uri
    var LocalPath: js.UndefOr[DirectoryPath]
  }

  object TensorBoardOutputConfig {
    @inline
    def apply(
        S3OutputPath: S3Uri,
        LocalPath: js.UndefOr[DirectoryPath] = js.undefined
    ): TensorBoardOutputConfig = {
      val __obj = js.Dynamic.literal(
        "S3OutputPath" -> S3OutputPath.asInstanceOf[js.Any]
      )

      LocalPath.foreach(__v => __obj.updateDynamic("LocalPath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TensorBoardOutputConfig]
    }
  }

  @js.native
  sealed trait TrainingInputMode extends js.Any
  object TrainingInputMode extends js.Object {
    val Pipe = "Pipe".asInstanceOf[TrainingInputMode]
    val File = "File".asInstanceOf[TrainingInputMode]

    val values = js.Object.freeze(js.Array(Pipe, File))
  }

  @js.native
  sealed trait TrainingInstanceType extends js.Any
  object TrainingInstanceType extends js.Object {
    val `ml.m4.xlarge`     = "ml.m4.xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.m4.2xlarge`    = "ml.m4.2xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.m4.4xlarge`    = "ml.m4.4xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.m4.10xlarge`   = "ml.m4.10xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.m4.16xlarge`   = "ml.m4.16xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.g4dn.xlarge`   = "ml.g4dn.xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.g4dn.2xlarge`  = "ml.g4dn.2xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.g4dn.4xlarge`  = "ml.g4dn.4xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.g4dn.8xlarge`  = "ml.g4dn.8xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.g4dn.12xlarge` = "ml.g4dn.12xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.g4dn.16xlarge` = "ml.g4dn.16xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.m5.large`      = "ml.m5.large".asInstanceOf[TrainingInstanceType]
    val `ml.m5.xlarge`     = "ml.m5.xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.m5.2xlarge`    = "ml.m5.2xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.m5.4xlarge`    = "ml.m5.4xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.m5.12xlarge`   = "ml.m5.12xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.m5.24xlarge`   = "ml.m5.24xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.c4.xlarge`     = "ml.c4.xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.c4.2xlarge`    = "ml.c4.2xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.c4.4xlarge`    = "ml.c4.4xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.c4.8xlarge`    = "ml.c4.8xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.p2.xlarge`     = "ml.p2.xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.p2.8xlarge`    = "ml.p2.8xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.p2.16xlarge`   = "ml.p2.16xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.p3.2xlarge`    = "ml.p3.2xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.p3.8xlarge`    = "ml.p3.8xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.p3.16xlarge`   = "ml.p3.16xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.p3dn.24xlarge` = "ml.p3dn.24xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.c5.xlarge`     = "ml.c5.xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.c5.2xlarge`    = "ml.c5.2xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.c5.4xlarge`    = "ml.c5.4xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.c5.9xlarge`    = "ml.c5.9xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.c5.18xlarge`   = "ml.c5.18xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.c5n.xlarge`    = "ml.c5n.xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.c5n.2xlarge`   = "ml.c5n.2xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.c5n.4xlarge`   = "ml.c5n.4xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.c5n.9xlarge`   = "ml.c5n.9xlarge".asInstanceOf[TrainingInstanceType]
    val `ml.c5n.18xlarge`  = "ml.c5n.18xlarge".asInstanceOf[TrainingInstanceType]

    val values = js.Object.freeze(
      js.Array(
        `ml.m4.xlarge`,
        `ml.m4.2xlarge`,
        `ml.m4.4xlarge`,
        `ml.m4.10xlarge`,
        `ml.m4.16xlarge`,
        `ml.g4dn.xlarge`,
        `ml.g4dn.2xlarge`,
        `ml.g4dn.4xlarge`,
        `ml.g4dn.8xlarge`,
        `ml.g4dn.12xlarge`,
        `ml.g4dn.16xlarge`,
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
        `ml.p3dn.24xlarge`,
        `ml.c5.xlarge`,
        `ml.c5.2xlarge`,
        `ml.c5.4xlarge`,
        `ml.c5.9xlarge`,
        `ml.c5.18xlarge`,
        `ml.c5n.xlarge`,
        `ml.c5n.2xlarge`,
        `ml.c5n.4xlarge`,
        `ml.c5n.9xlarge`,
        `ml.c5n.18xlarge`
      )
    )
  }

  /**
    * Contains information about a training job.
    */
  @js.native
  trait TrainingJob extends js.Object {
    var AlgorithmSpecification: js.UndefOr[AlgorithmSpecification]
    var AutoMLJobArn: js.UndefOr[AutoMLJobArn]
    var BillableTimeInSeconds: js.UndefOr[BillableTimeInSeconds]
    var CheckpointConfig: js.UndefOr[CheckpointConfig]
    var CreationTime: js.UndefOr[Timestamp]
    var DebugHookConfig: js.UndefOr[DebugHookConfig]
    var DebugRuleConfigurations: js.UndefOr[DebugRuleConfigurations]
    var DebugRuleEvaluationStatuses: js.UndefOr[DebugRuleEvaluationStatuses]
    var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean]
    var EnableManagedSpotTraining: js.UndefOr[Boolean]
    var EnableNetworkIsolation: js.UndefOr[Boolean]
    var ExperimentConfig: js.UndefOr[ExperimentConfig]
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
    var TensorBoardOutputConfig: js.UndefOr[TensorBoardOutputConfig]
    var TrainingEndTime: js.UndefOr[Timestamp]
    var TrainingJobArn: js.UndefOr[TrainingJobArn]
    var TrainingJobName: js.UndefOr[TrainingJobName]
    var TrainingJobStatus: js.UndefOr[TrainingJobStatus]
    var TrainingStartTime: js.UndefOr[Timestamp]
    var TrainingTimeInSeconds: js.UndefOr[TrainingTimeInSeconds]
    var TuningJobArn: js.UndefOr[HyperParameterTuningJobArn]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object TrainingJob {
    @inline
    def apply(
        AlgorithmSpecification: js.UndefOr[AlgorithmSpecification] = js.undefined,
        AutoMLJobArn: js.UndefOr[AutoMLJobArn] = js.undefined,
        BillableTimeInSeconds: js.UndefOr[BillableTimeInSeconds] = js.undefined,
        CheckpointConfig: js.UndefOr[CheckpointConfig] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DebugHookConfig: js.UndefOr[DebugHookConfig] = js.undefined,
        DebugRuleConfigurations: js.UndefOr[DebugRuleConfigurations] = js.undefined,
        DebugRuleEvaluationStatuses: js.UndefOr[DebugRuleEvaluationStatuses] = js.undefined,
        EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined,
        EnableManagedSpotTraining: js.UndefOr[Boolean] = js.undefined,
        EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
        ExperimentConfig: js.UndefOr[ExperimentConfig] = js.undefined,
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
        TensorBoardOutputConfig: js.UndefOr[TensorBoardOutputConfig] = js.undefined,
        TrainingEndTime: js.UndefOr[Timestamp] = js.undefined,
        TrainingJobArn: js.UndefOr[TrainingJobArn] = js.undefined,
        TrainingJobName: js.UndefOr[TrainingJobName] = js.undefined,
        TrainingJobStatus: js.UndefOr[TrainingJobStatus] = js.undefined,
        TrainingStartTime: js.UndefOr[Timestamp] = js.undefined,
        TrainingTimeInSeconds: js.UndefOr[TrainingTimeInSeconds] = js.undefined,
        TuningJobArn: js.UndefOr[HyperParameterTuningJobArn] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): TrainingJob = {
      val __obj = js.Dynamic.literal()
      AlgorithmSpecification.foreach(__v => __obj.updateDynamic("AlgorithmSpecification")(__v.asInstanceOf[js.Any]))
      AutoMLJobArn.foreach(__v => __obj.updateDynamic("AutoMLJobArn")(__v.asInstanceOf[js.Any]))
      BillableTimeInSeconds.foreach(__v => __obj.updateDynamic("BillableTimeInSeconds")(__v.asInstanceOf[js.Any]))
      CheckpointConfig.foreach(__v => __obj.updateDynamic("CheckpointConfig")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DebugHookConfig.foreach(__v => __obj.updateDynamic("DebugHookConfig")(__v.asInstanceOf[js.Any]))
      DebugRuleConfigurations.foreach(__v => __obj.updateDynamic("DebugRuleConfigurations")(__v.asInstanceOf[js.Any]))
      DebugRuleEvaluationStatuses.foreach(__v =>
        __obj.updateDynamic("DebugRuleEvaluationStatuses")(__v.asInstanceOf[js.Any])
      )
      EnableInterContainerTrafficEncryption.foreach(__v =>
        __obj.updateDynamic("EnableInterContainerTrafficEncryption")(__v.asInstanceOf[js.Any])
      )
      EnableManagedSpotTraining.foreach(__v =>
        __obj.updateDynamic("EnableManagedSpotTraining")(__v.asInstanceOf[js.Any])
      )
      EnableNetworkIsolation.foreach(__v => __obj.updateDynamic("EnableNetworkIsolation")(__v.asInstanceOf[js.Any]))
      ExperimentConfig.foreach(__v => __obj.updateDynamic("ExperimentConfig")(__v.asInstanceOf[js.Any]))
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
      SecondaryStatusTransitions.foreach(__v =>
        __obj.updateDynamic("SecondaryStatusTransitions")(__v.asInstanceOf[js.Any])
      )
      StoppingCondition.foreach(__v => __obj.updateDynamic("StoppingCondition")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TensorBoardOutputConfig.foreach(__v => __obj.updateDynamic("TensorBoardOutputConfig")(__v.asInstanceOf[js.Any]))
      TrainingEndTime.foreach(__v => __obj.updateDynamic("TrainingEndTime")(__v.asInstanceOf[js.Any]))
      TrainingJobArn.foreach(__v => __obj.updateDynamic("TrainingJobArn")(__v.asInstanceOf[js.Any]))
      TrainingJobName.foreach(__v => __obj.updateDynamic("TrainingJobName")(__v.asInstanceOf[js.Any]))
      TrainingJobStatus.foreach(__v => __obj.updateDynamic("TrainingJobStatus")(__v.asInstanceOf[js.Any]))
      TrainingStartTime.foreach(__v => __obj.updateDynamic("TrainingStartTime")(__v.asInstanceOf[js.Any]))
      TrainingTimeInSeconds.foreach(__v => __obj.updateDynamic("TrainingTimeInSeconds")(__v.asInstanceOf[js.Any]))
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

  @js.native
  sealed trait TrainingJobEarlyStoppingType extends js.Any
  object TrainingJobEarlyStoppingType extends js.Object {
    val Off  = "Off".asInstanceOf[TrainingJobEarlyStoppingType]
    val Auto = "Auto".asInstanceOf[TrainingJobEarlyStoppingType]

    val values = js.Object.freeze(js.Array(Off, Auto))
  }

  @js.native
  sealed trait TrainingJobSortByOptions extends js.Any
  object TrainingJobSortByOptions extends js.Object {
    val Name                      = "Name".asInstanceOf[TrainingJobSortByOptions]
    val CreationTime              = "CreationTime".asInstanceOf[TrainingJobSortByOptions]
    val Status                    = "Status".asInstanceOf[TrainingJobSortByOptions]
    val FinalObjectiveMetricValue = "FinalObjectiveMetricValue".asInstanceOf[TrainingJobSortByOptions]

    val values = js.Object.freeze(js.Array(Name, CreationTime, Status, FinalObjectiveMetricValue))
  }

  @js.native
  sealed trait TrainingJobStatus extends js.Any
  object TrainingJobStatus extends js.Object {
    val InProgress = "InProgress".asInstanceOf[TrainingJobStatus]
    val Completed  = "Completed".asInstanceOf[TrainingJobStatus]
    val Failed     = "Failed".asInstanceOf[TrainingJobStatus]
    val Stopping   = "Stopping".asInstanceOf[TrainingJobStatus]
    val Stopped    = "Stopped".asInstanceOf[TrainingJobStatus]

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
      SupportedTuningJobObjectiveMetrics.foreach(__v =>
        __obj.updateDynamic("SupportedTuningJobObjectiveMetrics")(__v.asInstanceOf[js.Any])
      )
      SupportsDistributedTraining.foreach(__v =>
        __obj.updateDynamic("SupportsDistributedTraining")(__v.asInstanceOf[js.Any])
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

  @js.native
  sealed trait TransformInstanceType extends js.Any
  object TransformInstanceType extends js.Object {
    val `ml.m4.xlarge`   = "ml.m4.xlarge".asInstanceOf[TransformInstanceType]
    val `ml.m4.2xlarge`  = "ml.m4.2xlarge".asInstanceOf[TransformInstanceType]
    val `ml.m4.4xlarge`  = "ml.m4.4xlarge".asInstanceOf[TransformInstanceType]
    val `ml.m4.10xlarge` = "ml.m4.10xlarge".asInstanceOf[TransformInstanceType]
    val `ml.m4.16xlarge` = "ml.m4.16xlarge".asInstanceOf[TransformInstanceType]
    val `ml.c4.xlarge`   = "ml.c4.xlarge".asInstanceOf[TransformInstanceType]
    val `ml.c4.2xlarge`  = "ml.c4.2xlarge".asInstanceOf[TransformInstanceType]
    val `ml.c4.4xlarge`  = "ml.c4.4xlarge".asInstanceOf[TransformInstanceType]
    val `ml.c4.8xlarge`  = "ml.c4.8xlarge".asInstanceOf[TransformInstanceType]
    val `ml.p2.xlarge`   = "ml.p2.xlarge".asInstanceOf[TransformInstanceType]
    val `ml.p2.8xlarge`  = "ml.p2.8xlarge".asInstanceOf[TransformInstanceType]
    val `ml.p2.16xlarge` = "ml.p2.16xlarge".asInstanceOf[TransformInstanceType]
    val `ml.p3.2xlarge`  = "ml.p3.2xlarge".asInstanceOf[TransformInstanceType]
    val `ml.p3.8xlarge`  = "ml.p3.8xlarge".asInstanceOf[TransformInstanceType]
    val `ml.p3.16xlarge` = "ml.p3.16xlarge".asInstanceOf[TransformInstanceType]
    val `ml.c5.xlarge`   = "ml.c5.xlarge".asInstanceOf[TransformInstanceType]
    val `ml.c5.2xlarge`  = "ml.c5.2xlarge".asInstanceOf[TransformInstanceType]
    val `ml.c5.4xlarge`  = "ml.c5.4xlarge".asInstanceOf[TransformInstanceType]
    val `ml.c5.9xlarge`  = "ml.c5.9xlarge".asInstanceOf[TransformInstanceType]
    val `ml.c5.18xlarge` = "ml.c5.18xlarge".asInstanceOf[TransformInstanceType]
    val `ml.m5.large`    = "ml.m5.large".asInstanceOf[TransformInstanceType]
    val `ml.m5.xlarge`   = "ml.m5.xlarge".asInstanceOf[TransformInstanceType]
    val `ml.m5.2xlarge`  = "ml.m5.2xlarge".asInstanceOf[TransformInstanceType]
    val `ml.m5.4xlarge`  = "ml.m5.4xlarge".asInstanceOf[TransformInstanceType]
    val `ml.m5.12xlarge` = "ml.m5.12xlarge".asInstanceOf[TransformInstanceType]
    val `ml.m5.24xlarge` = "ml.m5.24xlarge".asInstanceOf[TransformInstanceType]

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

  @js.native
  sealed trait TransformJobStatus extends js.Any
  object TransformJobStatus extends js.Object {
    val InProgress = "InProgress".asInstanceOf[TransformJobStatus]
    val Completed  = "Completed".asInstanceOf[TransformJobStatus]
    val Failed     = "Failed".asInstanceOf[TransformJobStatus]
    val Stopping   = "Stopping".asInstanceOf[TransformJobStatus]
    val Stopped    = "Stopped".asInstanceOf[TransformJobStatus]

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
    * The properties of a trial as returned by the <a>Search</a> API.
    */
  @js.native
  trait Trial extends js.Object {
    var CreatedBy: js.UndefOr[UserContext]
    var CreationTime: js.UndefOr[Timestamp]
    var DisplayName: js.UndefOr[ExperimentEntityName]
    var ExperimentName: js.UndefOr[ExperimentEntityName]
    var LastModifiedBy: js.UndefOr[UserContext]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Source: js.UndefOr[TrialSource]
    var Tags: js.UndefOr[TagList]
    var TrialArn: js.UndefOr[TrialArn]
    var TrialComponentSummaries: js.UndefOr[TrialComponentSimpleSummaries]
    var TrialName: js.UndefOr[ExperimentEntityName]
  }

  object Trial {
    @inline
    def apply(
        CreatedBy: js.UndefOr[UserContext] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined,
        ExperimentName: js.UndefOr[ExperimentEntityName] = js.undefined,
        LastModifiedBy: js.UndefOr[UserContext] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Source: js.UndefOr[TrialSource] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TrialArn: js.UndefOr[TrialArn] = js.undefined,
        TrialComponentSummaries: js.UndefOr[TrialComponentSimpleSummaries] = js.undefined,
        TrialName: js.UndefOr[ExperimentEntityName] = js.undefined
    ): Trial = {
      val __obj = js.Dynamic.literal()
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      ExperimentName.foreach(__v => __obj.updateDynamic("ExperimentName")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TrialArn.foreach(__v => __obj.updateDynamic("TrialArn")(__v.asInstanceOf[js.Any]))
      TrialComponentSummaries.foreach(__v => __obj.updateDynamic("TrialComponentSummaries")(__v.asInstanceOf[js.Any]))
      TrialName.foreach(__v => __obj.updateDynamic("TrialName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Trial]
    }
  }

  /**
    * The properties of a trial component as returned by the <a>Search</a> API.
    */
  @js.native
  trait TrialComponent extends js.Object {
    var CreatedBy: js.UndefOr[UserContext]
    var CreationTime: js.UndefOr[Timestamp]
    var DisplayName: js.UndefOr[ExperimentEntityName]
    var EndTime: js.UndefOr[Timestamp]
    var InputArtifacts: js.UndefOr[TrialComponentArtifacts]
    var LastModifiedBy: js.UndefOr[UserContext]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Metrics: js.UndefOr[TrialComponentMetricSummaries]
    var OutputArtifacts: js.UndefOr[TrialComponentArtifacts]
    var Parameters: js.UndefOr[TrialComponentParameters]
    var Parents: js.UndefOr[Parents]
    var Source: js.UndefOr[TrialComponentSource]
    var SourceDetail: js.UndefOr[TrialComponentSourceDetail]
    var StartTime: js.UndefOr[Timestamp]
    var Status: js.UndefOr[TrialComponentStatus]
    var Tags: js.UndefOr[TagList]
    var TrialComponentArn: js.UndefOr[TrialComponentArn]
    var TrialComponentName: js.UndefOr[ExperimentEntityName]
  }

  object TrialComponent {
    @inline
    def apply(
        CreatedBy: js.UndefOr[UserContext] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        InputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.undefined,
        LastModifiedBy: js.UndefOr[UserContext] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Metrics: js.UndefOr[TrialComponentMetricSummaries] = js.undefined,
        OutputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.undefined,
        Parameters: js.UndefOr[TrialComponentParameters] = js.undefined,
        Parents: js.UndefOr[Parents] = js.undefined,
        Source: js.UndefOr[TrialComponentSource] = js.undefined,
        SourceDetail: js.UndefOr[TrialComponentSourceDetail] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[TrialComponentStatus] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TrialComponentArn: js.UndefOr[TrialComponentArn] = js.undefined,
        TrialComponentName: js.UndefOr[ExperimentEntityName] = js.undefined
    ): TrialComponent = {
      val __obj = js.Dynamic.literal()
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      InputArtifacts.foreach(__v => __obj.updateDynamic("InputArtifacts")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      OutputArtifacts.foreach(__v => __obj.updateDynamic("OutputArtifacts")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      Parents.foreach(__v => __obj.updateDynamic("Parents")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      SourceDetail.foreach(__v => __obj.updateDynamic("SourceDetail")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TrialComponentArn.foreach(__v => __obj.updateDynamic("TrialComponentArn")(__v.asInstanceOf[js.Any]))
      TrialComponentName.foreach(__v => __obj.updateDynamic("TrialComponentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrialComponent]
    }
  }

  /**
    * Represents an input or output artifact of a trial component. You specify <code>TrialComponentArtifact</code> as part of the <code>InputArtifacts</code> and <code>OutputArtifacts</code> parameters in the <a>CreateTrialComponent</a> request.
    *  Examples of input artifacts are datasets, algorithms, hyperparameters, source code, and instance types. Examples of output artifacts are metrics, snapshots, logs, and images.
    */
  @js.native
  trait TrialComponentArtifact extends js.Object {
    var Value: TrialComponentArtifactValue
    var MediaType: js.UndefOr[MediaType]
  }

  object TrialComponentArtifact {
    @inline
    def apply(
        Value: TrialComponentArtifactValue,
        MediaType: js.UndefOr[MediaType] = js.undefined
    ): TrialComponentArtifact = {
      val __obj = js.Dynamic.literal(
        "Value" -> Value.asInstanceOf[js.Any]
      )

      MediaType.foreach(__v => __obj.updateDynamic("MediaType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrialComponentArtifact]
    }
  }

  /**
    * A summary of the metrics of a trial component.
    */
  @js.native
  trait TrialComponentMetricSummary extends js.Object {
    var Avg: js.UndefOr[OptionalDouble]
    var Count: js.UndefOr[OptionalInteger]
    var Last: js.UndefOr[OptionalDouble]
    var Max: js.UndefOr[OptionalDouble]
    var MetricName: js.UndefOr[MetricName]
    var Min: js.UndefOr[OptionalDouble]
    var SourceArn: js.UndefOr[TrialComponentSourceArn]
    var StdDev: js.UndefOr[OptionalDouble]
    var TimeStamp: js.UndefOr[Timestamp]
  }

  object TrialComponentMetricSummary {
    @inline
    def apply(
        Avg: js.UndefOr[OptionalDouble] = js.undefined,
        Count: js.UndefOr[OptionalInteger] = js.undefined,
        Last: js.UndefOr[OptionalDouble] = js.undefined,
        Max: js.UndefOr[OptionalDouble] = js.undefined,
        MetricName: js.UndefOr[MetricName] = js.undefined,
        Min: js.UndefOr[OptionalDouble] = js.undefined,
        SourceArn: js.UndefOr[TrialComponentSourceArn] = js.undefined,
        StdDev: js.UndefOr[OptionalDouble] = js.undefined,
        TimeStamp: js.UndefOr[Timestamp] = js.undefined
    ): TrialComponentMetricSummary = {
      val __obj = js.Dynamic.literal()
      Avg.foreach(__v => __obj.updateDynamic("Avg")(__v.asInstanceOf[js.Any]))
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      Last.foreach(__v => __obj.updateDynamic("Last")(__v.asInstanceOf[js.Any]))
      Max.foreach(__v => __obj.updateDynamic("Max")(__v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Min.foreach(__v => __obj.updateDynamic("Min")(__v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      StdDev.foreach(__v => __obj.updateDynamic("StdDev")(__v.asInstanceOf[js.Any]))
      TimeStamp.foreach(__v => __obj.updateDynamic("TimeStamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrialComponentMetricSummary]
    }
  }

  /**
    * The value of a hyperparameter. Only one of <code>NumberValue</code> or <code>StringValue</code> can be specified.
    *  This object is specified in the <a>CreateTrialComponent</a> request.
    */
  @js.native
  trait TrialComponentParameterValue extends js.Object {
    var NumberValue: js.UndefOr[DoubleParameterValue]
    var StringValue: js.UndefOr[StringParameterValue]
  }

  object TrialComponentParameterValue {
    @inline
    def apply(
        NumberValue: js.UndefOr[DoubleParameterValue] = js.undefined,
        StringValue: js.UndefOr[StringParameterValue] = js.undefined
    ): TrialComponentParameterValue = {
      val __obj = js.Dynamic.literal()
      NumberValue.foreach(__v => __obj.updateDynamic("NumberValue")(__v.asInstanceOf[js.Any]))
      StringValue.foreach(__v => __obj.updateDynamic("StringValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrialComponentParameterValue]
    }
  }

  @js.native
  sealed trait TrialComponentPrimaryStatus extends js.Any
  object TrialComponentPrimaryStatus extends js.Object {
    val InProgress = "InProgress".asInstanceOf[TrialComponentPrimaryStatus]
    val Completed  = "Completed".asInstanceOf[TrialComponentPrimaryStatus]
    val Failed     = "Failed".asInstanceOf[TrialComponentPrimaryStatus]
    val Stopping   = "Stopping".asInstanceOf[TrialComponentPrimaryStatus]
    val Stopped    = "Stopped".asInstanceOf[TrialComponentPrimaryStatus]

    val values = js.Object.freeze(js.Array(InProgress, Completed, Failed, Stopping, Stopped))
  }

  /**
    * A short summary of a trial component.
    */
  @js.native
  trait TrialComponentSimpleSummary extends js.Object {
    var CreatedBy: js.UndefOr[UserContext]
    var CreationTime: js.UndefOr[Timestamp]
    var TrialComponentArn: js.UndefOr[TrialComponentArn]
    var TrialComponentName: js.UndefOr[ExperimentEntityName]
    var TrialComponentSource: js.UndefOr[TrialComponentSource]
  }

  object TrialComponentSimpleSummary {
    @inline
    def apply(
        CreatedBy: js.UndefOr[UserContext] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        TrialComponentArn: js.UndefOr[TrialComponentArn] = js.undefined,
        TrialComponentName: js.UndefOr[ExperimentEntityName] = js.undefined,
        TrialComponentSource: js.UndefOr[TrialComponentSource] = js.undefined
    ): TrialComponentSimpleSummary = {
      val __obj = js.Dynamic.literal()
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      TrialComponentArn.foreach(__v => __obj.updateDynamic("TrialComponentArn")(__v.asInstanceOf[js.Any]))
      TrialComponentName.foreach(__v => __obj.updateDynamic("TrialComponentName")(__v.asInstanceOf[js.Any]))
      TrialComponentSource.foreach(__v => __obj.updateDynamic("TrialComponentSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrialComponentSimpleSummary]
    }
  }

  /**
    * The Amazon Resource Name (ARN) and job type of the source of a trial component.
    */
  @js.native
  trait TrialComponentSource extends js.Object {
    var SourceArn: TrialComponentSourceArn
    var SourceType: js.UndefOr[SourceType]
  }

  object TrialComponentSource {
    @inline
    def apply(
        SourceArn: TrialComponentSourceArn,
        SourceType: js.UndefOr[SourceType] = js.undefined
    ): TrialComponentSource = {
      val __obj = js.Dynamic.literal(
        "SourceArn" -> SourceArn.asInstanceOf[js.Any]
      )

      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrialComponentSource]
    }
  }

  /**
    * Detailed information about the source of a trial component. Either <code>ProcessingJob</code> or <code>TrainingJob</code> is returned.
    */
  @js.native
  trait TrialComponentSourceDetail extends js.Object {
    var ProcessingJob: js.UndefOr[ProcessingJob]
    var SourceArn: js.UndefOr[TrialComponentSourceArn]
    var TrainingJob: js.UndefOr[TrainingJob]
  }

  object TrialComponentSourceDetail {
    @inline
    def apply(
        ProcessingJob: js.UndefOr[ProcessingJob] = js.undefined,
        SourceArn: js.UndefOr[TrialComponentSourceArn] = js.undefined,
        TrainingJob: js.UndefOr[TrainingJob] = js.undefined
    ): TrialComponentSourceDetail = {
      val __obj = js.Dynamic.literal()
      ProcessingJob.foreach(__v => __obj.updateDynamic("ProcessingJob")(__v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      TrainingJob.foreach(__v => __obj.updateDynamic("TrainingJob")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrialComponentSourceDetail]
    }
  }

  /**
    * The status of the trial component.
    */
  @js.native
  trait TrialComponentStatus extends js.Object {
    var Message: js.UndefOr[TrialComponentStatusMessage]
    var PrimaryStatus: js.UndefOr[TrialComponentPrimaryStatus]
  }

  object TrialComponentStatus {
    @inline
    def apply(
        Message: js.UndefOr[TrialComponentStatusMessage] = js.undefined,
        PrimaryStatus: js.UndefOr[TrialComponentPrimaryStatus] = js.undefined
    ): TrialComponentStatus = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      PrimaryStatus.foreach(__v => __obj.updateDynamic("PrimaryStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrialComponentStatus]
    }
  }

  /**
    * A summary of the properties of a trial component. To get all the properties, call the <a>DescribeTrialComponent</a> API and provide the <code>TrialComponentName</code>.
    */
  @js.native
  trait TrialComponentSummary extends js.Object {
    var CreatedBy: js.UndefOr[UserContext]
    var CreationTime: js.UndefOr[Timestamp]
    var DisplayName: js.UndefOr[ExperimentEntityName]
    var EndTime: js.UndefOr[Timestamp]
    var LastModifiedBy: js.UndefOr[UserContext]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var StartTime: js.UndefOr[Timestamp]
    var Status: js.UndefOr[TrialComponentStatus]
    var TrialComponentArn: js.UndefOr[TrialComponentArn]
    var TrialComponentName: js.UndefOr[ExperimentEntityName]
    var TrialComponentSource: js.UndefOr[TrialComponentSource]
  }

  object TrialComponentSummary {
    @inline
    def apply(
        CreatedBy: js.UndefOr[UserContext] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedBy: js.UndefOr[UserContext] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[TrialComponentStatus] = js.undefined,
        TrialComponentArn: js.UndefOr[TrialComponentArn] = js.undefined,
        TrialComponentName: js.UndefOr[ExperimentEntityName] = js.undefined,
        TrialComponentSource: js.UndefOr[TrialComponentSource] = js.undefined
    ): TrialComponentSummary = {
      val __obj = js.Dynamic.literal()
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TrialComponentArn.foreach(__v => __obj.updateDynamic("TrialComponentArn")(__v.asInstanceOf[js.Any]))
      TrialComponentName.foreach(__v => __obj.updateDynamic("TrialComponentName")(__v.asInstanceOf[js.Any]))
      TrialComponentSource.foreach(__v => __obj.updateDynamic("TrialComponentSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrialComponentSummary]
    }
  }

  /**
    * The source of the trial.
    */
  @js.native
  trait TrialSource extends js.Object {
    var SourceArn: TrialSourceArn
    var SourceType: js.UndefOr[SourceType]
  }

  object TrialSource {
    @inline
    def apply(
        SourceArn: TrialSourceArn,
        SourceType: js.UndefOr[SourceType] = js.undefined
    ): TrialSource = {
      val __obj = js.Dynamic.literal(
        "SourceArn" -> SourceArn.asInstanceOf[js.Any]
      )

      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrialSource]
    }
  }

  /**
    * A summary of the properties of a trial. To get the complete set of properties, call the <a>DescribeTrial</a> API and provide the <code>TrialName</code>.
    */
  @js.native
  trait TrialSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DisplayName: js.UndefOr[ExperimentEntityName]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var TrialArn: js.UndefOr[TrialArn]
    var TrialName: js.UndefOr[ExperimentEntityName]
    var TrialSource: js.UndefOr[TrialSource]
  }

  object TrialSummary {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        TrialArn: js.UndefOr[TrialArn] = js.undefined,
        TrialName: js.UndefOr[ExperimentEntityName] = js.undefined,
        TrialSource: js.UndefOr[TrialSource] = js.undefined
    ): TrialSummary = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      TrialArn.foreach(__v => __obj.updateDynamic("TrialArn")(__v.asInstanceOf[js.Any]))
      TrialName.foreach(__v => __obj.updateDynamic("TrialName")(__v.asInstanceOf[js.Any]))
      TrialSource.foreach(__v => __obj.updateDynamic("TrialSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrialSummary]
    }
  }

  /**
    * The job completion criteria.
    */
  @js.native
  trait TuningJobCompletionCriteria extends js.Object {
    var TargetObjectiveMetricValue: TargetObjectiveMetricValue
  }

  object TuningJobCompletionCriteria {
    @inline
    def apply(
        TargetObjectiveMetricValue: TargetObjectiveMetricValue
    ): TuningJobCompletionCriteria = {
      val __obj = js.Dynamic.literal(
        "TargetObjectiveMetricValue" -> TargetObjectiveMetricValue.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TuningJobCompletionCriteria]
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
    var HumanTaskUiArn: js.UndefOr[HumanTaskUiArn]
    var UiTemplateS3Uri: js.UndefOr[S3Uri]
  }

  object UiConfig {
    @inline
    def apply(
        HumanTaskUiArn: js.UndefOr[HumanTaskUiArn] = js.undefined,
        UiTemplateS3Uri: js.UndefOr[S3Uri] = js.undefined
    ): UiConfig = {
      val __obj = js.Dynamic.literal()
      HumanTaskUiArn.foreach(__v => __obj.updateDynamic("HumanTaskUiArn")(__v.asInstanceOf[js.Any]))
      UiTemplateS3Uri.foreach(__v => __obj.updateDynamic("UiTemplateS3Uri")(__v.asInstanceOf[js.Any]))
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

  /**
    * Container for user interface template information.
    */
  @js.native
  trait UiTemplateInfo extends js.Object {
    var ContentSha256: js.UndefOr[TemplateContentSha256]
    var Url: js.UndefOr[TemplateUrl]
  }

  object UiTemplateInfo {
    @inline
    def apply(
        ContentSha256: js.UndefOr[TemplateContentSha256] = js.undefined,
        Url: js.UndefOr[TemplateUrl] = js.undefined
    ): UiTemplateInfo = {
      val __obj = js.Dynamic.literal()
      ContentSha256.foreach(__v => __obj.updateDynamic("ContentSha256")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UiTemplateInfo]
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
  trait UpdateDomainRequest extends js.Object {
    var DomainId: DomainId
    var DefaultUserSettings: js.UndefOr[UserSettings]
  }

  object UpdateDomainRequest {
    @inline
    def apply(
        DomainId: DomainId,
        DefaultUserSettings: js.UndefOr[UserSettings] = js.undefined
    ): UpdateDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainId" -> DomainId.asInstanceOf[js.Any]
      )

      DefaultUserSettings.foreach(__v => __obj.updateDynamic("DefaultUserSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDomainRequest]
    }
  }

  @js.native
  trait UpdateDomainResponse extends js.Object {
    var DomainArn: js.UndefOr[DomainArn]
  }

  object UpdateDomainResponse {
    @inline
    def apply(
        DomainArn: js.UndefOr[DomainArn] = js.undefined
    ): UpdateDomainResponse = {
      val __obj = js.Dynamic.literal()
      DomainArn.foreach(__v => __obj.updateDynamic("DomainArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDomainResponse]
    }
  }

  @js.native
  trait UpdateEndpointInput extends js.Object {
    var EndpointConfigName: EndpointConfigName
    var EndpointName: EndpointName
    var ExcludeRetainedVariantProperties: js.UndefOr[VariantPropertyList]
    var RetainAllVariantProperties: js.UndefOr[Boolean]
  }

  object UpdateEndpointInput {
    @inline
    def apply(
        EndpointConfigName: EndpointConfigName,
        EndpointName: EndpointName,
        ExcludeRetainedVariantProperties: js.UndefOr[VariantPropertyList] = js.undefined,
        RetainAllVariantProperties: js.UndefOr[Boolean] = js.undefined
    ): UpdateEndpointInput = {
      val __obj = js.Dynamic.literal(
        "EndpointConfigName" -> EndpointConfigName.asInstanceOf[js.Any],
        "EndpointName"       -> EndpointName.asInstanceOf[js.Any]
      )

      ExcludeRetainedVariantProperties.foreach(__v =>
        __obj.updateDynamic("ExcludeRetainedVariantProperties")(__v.asInstanceOf[js.Any])
      )
      RetainAllVariantProperties.foreach(__v =>
        __obj.updateDynamic("RetainAllVariantProperties")(__v.asInstanceOf[js.Any])
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
  trait UpdateExperimentRequest extends js.Object {
    var ExperimentName: ExperimentEntityName
    var Description: js.UndefOr[ExperimentDescription]
    var DisplayName: js.UndefOr[ExperimentEntityName]
  }

  object UpdateExperimentRequest {
    @inline
    def apply(
        ExperimentName: ExperimentEntityName,
        Description: js.UndefOr[ExperimentDescription] = js.undefined,
        DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined
    ): UpdateExperimentRequest = {
      val __obj = js.Dynamic.literal(
        "ExperimentName" -> ExperimentName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateExperimentRequest]
    }
  }

  @js.native
  trait UpdateExperimentResponse extends js.Object {
    var ExperimentArn: js.UndefOr[ExperimentArn]
  }

  object UpdateExperimentResponse {
    @inline
    def apply(
        ExperimentArn: js.UndefOr[ExperimentArn] = js.undefined
    ): UpdateExperimentResponse = {
      val __obj = js.Dynamic.literal()
      ExperimentArn.foreach(__v => __obj.updateDynamic("ExperimentArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateExperimentResponse]
    }
  }

  @js.native
  trait UpdateMonitoringScheduleRequest extends js.Object {
    var MonitoringScheduleConfig: MonitoringScheduleConfig
    var MonitoringScheduleName: MonitoringScheduleName
  }

  object UpdateMonitoringScheduleRequest {
    @inline
    def apply(
        MonitoringScheduleConfig: MonitoringScheduleConfig,
        MonitoringScheduleName: MonitoringScheduleName
    ): UpdateMonitoringScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "MonitoringScheduleConfig" -> MonitoringScheduleConfig.asInstanceOf[js.Any],
        "MonitoringScheduleName"   -> MonitoringScheduleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateMonitoringScheduleRequest]
    }
  }

  @js.native
  trait UpdateMonitoringScheduleResponse extends js.Object {
    var MonitoringScheduleArn: MonitoringScheduleArn
  }

  object UpdateMonitoringScheduleResponse {
    @inline
    def apply(
        MonitoringScheduleArn: MonitoringScheduleArn
    ): UpdateMonitoringScheduleResponse = {
      val __obj = js.Dynamic.literal(
        "MonitoringScheduleArn" -> MonitoringScheduleArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateMonitoringScheduleResponse]
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
      AdditionalCodeRepositories.foreach(__v =>
        __obj.updateDynamic("AdditionalCodeRepositories")(__v.asInstanceOf[js.Any])
      )
      DefaultCodeRepository.foreach(__v => __obj.updateDynamic("DefaultCodeRepository")(__v.asInstanceOf[js.Any]))
      DisassociateAcceleratorTypes.foreach(__v =>
        __obj.updateDynamic("DisassociateAcceleratorTypes")(__v.asInstanceOf[js.Any])
      )
      DisassociateAdditionalCodeRepositories.foreach(__v =>
        __obj.updateDynamic("DisassociateAdditionalCodeRepositories")(__v.asInstanceOf[js.Any])
      )
      DisassociateDefaultCodeRepository.foreach(__v =>
        __obj.updateDynamic("DisassociateDefaultCodeRepository")(__v.asInstanceOf[js.Any])
      )
      DisassociateLifecycleConfig.foreach(__v =>
        __obj.updateDynamic("DisassociateLifecycleConfig")(__v.asInstanceOf[js.Any])
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
  trait UpdateTrialComponentRequest extends js.Object {
    var TrialComponentName: ExperimentEntityName
    var DisplayName: js.UndefOr[ExperimentEntityName]
    var EndTime: js.UndefOr[Timestamp]
    var InputArtifacts: js.UndefOr[TrialComponentArtifacts]
    var InputArtifactsToRemove: js.UndefOr[ListTrialComponentKey256]
    var OutputArtifacts: js.UndefOr[TrialComponentArtifacts]
    var OutputArtifactsToRemove: js.UndefOr[ListTrialComponentKey256]
    var Parameters: js.UndefOr[TrialComponentParameters]
    var ParametersToRemove: js.UndefOr[ListTrialComponentKey256]
    var StartTime: js.UndefOr[Timestamp]
    var Status: js.UndefOr[TrialComponentStatus]
  }

  object UpdateTrialComponentRequest {
    @inline
    def apply(
        TrialComponentName: ExperimentEntityName,
        DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        InputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.undefined,
        InputArtifactsToRemove: js.UndefOr[ListTrialComponentKey256] = js.undefined,
        OutputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.undefined,
        OutputArtifactsToRemove: js.UndefOr[ListTrialComponentKey256] = js.undefined,
        Parameters: js.UndefOr[TrialComponentParameters] = js.undefined,
        ParametersToRemove: js.UndefOr[ListTrialComponentKey256] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[TrialComponentStatus] = js.undefined
    ): UpdateTrialComponentRequest = {
      val __obj = js.Dynamic.literal(
        "TrialComponentName" -> TrialComponentName.asInstanceOf[js.Any]
      )

      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      InputArtifacts.foreach(__v => __obj.updateDynamic("InputArtifacts")(__v.asInstanceOf[js.Any]))
      InputArtifactsToRemove.foreach(__v => __obj.updateDynamic("InputArtifactsToRemove")(__v.asInstanceOf[js.Any]))
      OutputArtifacts.foreach(__v => __obj.updateDynamic("OutputArtifacts")(__v.asInstanceOf[js.Any]))
      OutputArtifactsToRemove.foreach(__v => __obj.updateDynamic("OutputArtifactsToRemove")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      ParametersToRemove.foreach(__v => __obj.updateDynamic("ParametersToRemove")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTrialComponentRequest]
    }
  }

  @js.native
  trait UpdateTrialComponentResponse extends js.Object {
    var TrialComponentArn: js.UndefOr[TrialComponentArn]
  }

  object UpdateTrialComponentResponse {
    @inline
    def apply(
        TrialComponentArn: js.UndefOr[TrialComponentArn] = js.undefined
    ): UpdateTrialComponentResponse = {
      val __obj = js.Dynamic.literal()
      TrialComponentArn.foreach(__v => __obj.updateDynamic("TrialComponentArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTrialComponentResponse]
    }
  }

  @js.native
  trait UpdateTrialRequest extends js.Object {
    var TrialName: ExperimentEntityName
    var DisplayName: js.UndefOr[ExperimentEntityName]
  }

  object UpdateTrialRequest {
    @inline
    def apply(
        TrialName: ExperimentEntityName,
        DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined
    ): UpdateTrialRequest = {
      val __obj = js.Dynamic.literal(
        "TrialName" -> TrialName.asInstanceOf[js.Any]
      )

      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTrialRequest]
    }
  }

  @js.native
  trait UpdateTrialResponse extends js.Object {
    var TrialArn: js.UndefOr[TrialArn]
  }

  object UpdateTrialResponse {
    @inline
    def apply(
        TrialArn: js.UndefOr[TrialArn] = js.undefined
    ): UpdateTrialResponse = {
      val __obj = js.Dynamic.literal()
      TrialArn.foreach(__v => __obj.updateDynamic("TrialArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTrialResponse]
    }
  }

  @js.native
  trait UpdateUserProfileRequest extends js.Object {
    var DomainId: DomainId
    var UserProfileName: UserProfileName
    var UserSettings: js.UndefOr[UserSettings]
  }

  object UpdateUserProfileRequest {
    @inline
    def apply(
        DomainId: DomainId,
        UserProfileName: UserProfileName,
        UserSettings: js.UndefOr[UserSettings] = js.undefined
    ): UpdateUserProfileRequest = {
      val __obj = js.Dynamic.literal(
        "DomainId"        -> DomainId.asInstanceOf[js.Any],
        "UserProfileName" -> UserProfileName.asInstanceOf[js.Any]
      )

      UserSettings.foreach(__v => __obj.updateDynamic("UserSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserProfileRequest]
    }
  }

  @js.native
  trait UpdateUserProfileResponse extends js.Object {
    var UserProfileArn: js.UndefOr[UserProfileArn]
  }

  object UpdateUserProfileResponse {
    @inline
    def apply(
        UserProfileArn: js.UndefOr[UserProfileArn] = js.undefined
    ): UpdateUserProfileResponse = {
      val __obj = js.Dynamic.literal()
      UserProfileArn.foreach(__v => __obj.updateDynamic("UserProfileArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserProfileResponse]
    }
  }

  @js.native
  trait UpdateWorkforceRequest extends js.Object {
    var WorkforceName: WorkforceName
    var SourceIpConfig: js.UndefOr[SourceIpConfig]
  }

  object UpdateWorkforceRequest {
    @inline
    def apply(
        WorkforceName: WorkforceName,
        SourceIpConfig: js.UndefOr[SourceIpConfig] = js.undefined
    ): UpdateWorkforceRequest = {
      val __obj = js.Dynamic.literal(
        "WorkforceName" -> WorkforceName.asInstanceOf[js.Any]
      )

      SourceIpConfig.foreach(__v => __obj.updateDynamic("SourceIpConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkforceRequest]
    }
  }

  @js.native
  trait UpdateWorkforceResponse extends js.Object {
    var Workforce: Workforce
  }

  object UpdateWorkforceResponse {
    @inline
    def apply(
        Workforce: Workforce
    ): UpdateWorkforceResponse = {
      val __obj = js.Dynamic.literal(
        "Workforce" -> Workforce.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateWorkforceResponse]
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
      NotificationConfiguration.foreach(__v =>
        __obj.updateDynamic("NotificationConfiguration")(__v.asInstanceOf[js.Any])
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
    * Information about the user who created or modified an experiment, trial, or trial component.
    */
  @js.native
  trait UserContext extends js.Object {
    var DomainId: js.UndefOr[String]
    var UserProfileArn: js.UndefOr[String]
    var UserProfileName: js.UndefOr[String]
  }

  object UserContext {
    @inline
    def apply(
        DomainId: js.UndefOr[String] = js.undefined,
        UserProfileArn: js.UndefOr[String] = js.undefined,
        UserProfileName: js.UndefOr[String] = js.undefined
    ): UserContext = {
      val __obj = js.Dynamic.literal()
      DomainId.foreach(__v => __obj.updateDynamic("DomainId")(__v.asInstanceOf[js.Any]))
      UserProfileArn.foreach(__v => __obj.updateDynamic("UserProfileArn")(__v.asInstanceOf[js.Any]))
      UserProfileName.foreach(__v => __obj.updateDynamic("UserProfileName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserContext]
    }
  }

  /**
    * The user profile details.
    */
  @js.native
  trait UserProfileDetails extends js.Object {
    var CreationTime: js.UndefOr[CreationTime]
    var DomainId: js.UndefOr[DomainId]
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
    var Status: js.UndefOr[UserProfileStatus]
    var UserProfileName: js.UndefOr[UserProfileName]
  }

  object UserProfileDetails {
    @inline
    def apply(
        CreationTime: js.UndefOr[CreationTime] = js.undefined,
        DomainId: js.UndefOr[DomainId] = js.undefined,
        LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined,
        Status: js.UndefOr[UserProfileStatus] = js.undefined,
        UserProfileName: js.UndefOr[UserProfileName] = js.undefined
    ): UserProfileDetails = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DomainId.foreach(__v => __obj.updateDynamic("DomainId")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UserProfileName.foreach(__v => __obj.updateDynamic("UserProfileName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserProfileDetails]
    }
  }

  @js.native
  sealed trait UserProfileSortKey extends js.Any
  object UserProfileSortKey extends js.Object {
    val CreationTime     = "CreationTime".asInstanceOf[UserProfileSortKey]
    val LastModifiedTime = "LastModifiedTime".asInstanceOf[UserProfileSortKey]

    val values = js.Object.freeze(js.Array(CreationTime, LastModifiedTime))
  }

  @js.native
  sealed trait UserProfileStatus extends js.Any
  object UserProfileStatus extends js.Object {
    val Deleting  = "Deleting".asInstanceOf[UserProfileStatus]
    val Failed    = "Failed".asInstanceOf[UserProfileStatus]
    val InService = "InService".asInstanceOf[UserProfileStatus]
    val Pending   = "Pending".asInstanceOf[UserProfileStatus]

    val values = js.Object.freeze(js.Array(Deleting, Failed, InService, Pending))
  }

  /**
    * A collection of settings.
    */
  @js.native
  trait UserSettings extends js.Object {
    var ExecutionRole: js.UndefOr[RoleArn]
    var JupyterServerAppSettings: js.UndefOr[JupyterServerAppSettings]
    var KernelGatewayAppSettings: js.UndefOr[KernelGatewayAppSettings]
    var SecurityGroups: js.UndefOr[SecurityGroupIds]
    var SharingSettings: js.UndefOr[SharingSettings]
    var TensorBoardAppSettings: js.UndefOr[TensorBoardAppSettings]
  }

  object UserSettings {
    @inline
    def apply(
        ExecutionRole: js.UndefOr[RoleArn] = js.undefined,
        JupyterServerAppSettings: js.UndefOr[JupyterServerAppSettings] = js.undefined,
        KernelGatewayAppSettings: js.UndefOr[KernelGatewayAppSettings] = js.undefined,
        SecurityGroups: js.UndefOr[SecurityGroupIds] = js.undefined,
        SharingSettings: js.UndefOr[SharingSettings] = js.undefined,
        TensorBoardAppSettings: js.UndefOr[TensorBoardAppSettings] = js.undefined
    ): UserSettings = {
      val __obj = js.Dynamic.literal()
      ExecutionRole.foreach(__v => __obj.updateDynamic("ExecutionRole")(__v.asInstanceOf[js.Any]))
      JupyterServerAppSettings.foreach(__v => __obj.updateDynamic("JupyterServerAppSettings")(__v.asInstanceOf[js.Any]))
      KernelGatewayAppSettings.foreach(__v => __obj.updateDynamic("KernelGatewayAppSettings")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      SharingSettings.foreach(__v => __obj.updateDynamic("SharingSettings")(__v.asInstanceOf[js.Any]))
      TensorBoardAppSettings.foreach(__v => __obj.updateDynamic("TensorBoardAppSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserSettings]
    }
  }

  /**
    * Specifies a production variant property type for an Endpoint.
    *  If you are updating an endpoint with the [[UpdateEndpointInput.RetainAllVariantProperties]] option set to <code>true</code>, the <code>VariantProperty</code> objects listed in [[UpdateEndpointInput.ExcludeRetainedVariantProperties]] override the existing variant properties of the endpoint.
    */
  @js.native
  trait VariantProperty extends js.Object {
    var VariantPropertyType: VariantPropertyType
  }

  object VariantProperty {
    @inline
    def apply(
        VariantPropertyType: VariantPropertyType
    ): VariantProperty = {
      val __obj = js.Dynamic.literal(
        "VariantPropertyType" -> VariantPropertyType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VariantProperty]
    }
  }

  @js.native
  sealed trait VariantPropertyType extends js.Any
  object VariantPropertyType extends js.Object {
    val DesiredInstanceCount = "DesiredInstanceCount".asInstanceOf[VariantPropertyType]
    val DesiredWeight        = "DesiredWeight".asInstanceOf[VariantPropertyType]
    val DataCaptureConfig    = "DataCaptureConfig".asInstanceOf[VariantPropertyType]

    val values = js.Object.freeze(js.Array(DesiredInstanceCount, DesiredWeight, DataCaptureConfig))
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
    * A single private workforce, which is automatically created when you create your first private work team. You can create one private work force in each AWS Region. By default, any workforce-related API operation used in a specific region will apply to the workforce created in that region. To learn how to create a private workforce, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-create-private.html|Create a Private Workforce]].
    */
  @js.native
  trait Workforce extends js.Object {
    var WorkforceArn: WorkforceArn
    var WorkforceName: WorkforceName
    var LastUpdatedDate: js.UndefOr[Timestamp]
    var SourceIpConfig: js.UndefOr[SourceIpConfig]
  }

  object Workforce {
    @inline
    def apply(
        WorkforceArn: WorkforceArn,
        WorkforceName: WorkforceName,
        LastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
        SourceIpConfig: js.UndefOr[SourceIpConfig] = js.undefined
    ): Workforce = {
      val __obj = js.Dynamic.literal(
        "WorkforceArn"  -> WorkforceArn.asInstanceOf[js.Any],
        "WorkforceName" -> WorkforceName.asInstanceOf[js.Any]
      )

      LastUpdatedDate.foreach(__v => __obj.updateDynamic("LastUpdatedDate")(__v.asInstanceOf[js.Any]))
      SourceIpConfig.foreach(__v => __obj.updateDynamic("SourceIpConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Workforce]
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
      NotificationConfiguration.foreach(__v =>
        __obj.updateDynamic("NotificationConfiguration")(__v.asInstanceOf[js.Any])
      )
      ProductListingIds.foreach(__v => __obj.updateDynamic("ProductListingIds")(__v.asInstanceOf[js.Any]))
      SubDomain.foreach(__v => __obj.updateDynamic("SubDomain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Workteam]
    }
  }
}
