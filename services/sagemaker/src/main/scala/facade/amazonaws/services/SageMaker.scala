package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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
  type EnvironmentArn                                  = String
  type EnvironmentKey                                  = String
  type EnvironmentMap                                  = js.Dictionary[EnvironmentValue]
  type EnvironmentValue                                = String
  type ExitMessage                                     = String
  type ExperimentArn                                   = String
  type ExperimentConfigName                            = String
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
  @Factory
  trait AddTagsInput extends js.Object {
    var ResourceArn: ResourceArn
    var Tags: TagList
  }

  @js.native
  @Factory
  trait AddTagsOutput extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  sealed trait AlgorithmSortBy extends js.Any
  object AlgorithmSortBy extends js.Object {
    val Name         = "Name".asInstanceOf[AlgorithmSortBy]
    val CreationTime = "CreationTime".asInstanceOf[AlgorithmSortBy]

    val values = js.Object.freeze(js.Array(Name, CreationTime))
  }

  /**
    * Specifies the training algorithm to use in a [[https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateTrainingJob.html|CreateTrainingJob]] request.
    *  For more information about algorithms provided by Amazon SageMaker, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html|Algorithms]]. For information about using your own algorithms, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html|Using Your Own Algorithms with Amazon SageMaker]].
    */
  @js.native
  @Factory
  trait AlgorithmSpecification extends js.Object {
    var TrainingInputMode: TrainingInputMode
    var AlgorithmName: js.UndefOr[ArnOrName]
    var EnableSageMakerMetricsTimeSeries: js.UndefOr[Boolean]
    var MetricDefinitions: js.UndefOr[MetricDefinitionList]
    var TrainingImage: js.UndefOr[AlgorithmImage]
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
  @Factory
  trait AlgorithmStatusDetails extends js.Object {
    var ImageScanStatuses: js.UndefOr[AlgorithmStatusItemList]
    var ValidationStatuses: js.UndefOr[AlgorithmStatusItemList]
  }

  /**
    * Represents the overall status of an algorithm.
    */
  @js.native
  @Factory
  trait AlgorithmStatusItem extends js.Object {
    var Name: EntityName
    var Status: DetailedAlgorithmStatus
    var FailureReason: js.UndefOr[String]
  }

  /**
    * Provides summary information about an algorithm.
    */
  @js.native
  @Factory
  trait AlgorithmSummary extends js.Object {
    var AlgorithmArn: AlgorithmArn
    var AlgorithmName: EntityName
    var AlgorithmStatus: AlgorithmStatus
    var CreationTime: CreationTime
    var AlgorithmDescription: js.UndefOr[EntityDescription]
  }

  /**
    * Defines a training job and a batch transform job that Amazon SageMaker runs to validate your algorithm.
    *  The data provided in the validation profile is made available to your buyers on AWS Marketplace.
    */
  @js.native
  @Factory
  trait AlgorithmValidationProfile extends js.Object {
    var ProfileName: EntityName
    var TrainingJobDefinition: TrainingJobDefinition
    var TransformJobDefinition: js.UndefOr[TransformJobDefinition]
  }

  /**
    * Specifies configurations for one or more training jobs that Amazon SageMaker runs to test the algorithm.
    */
  @js.native
  @Factory
  trait AlgorithmValidationSpecification extends js.Object {
    var ValidationProfiles: AlgorithmValidationProfiles
    var ValidationRole: RoleArn
  }

  /**
    * Configures how labels are consolidated across human workers.
    */
  @js.native
  @Factory
  trait AnnotationConsolidationConfig extends js.Object {
    var AnnotationConsolidationLambdaArn: LambdaFunctionArn
  }

  /**
    * The app's details.
    */
  @js.native
  @Factory
  trait AppDetails extends js.Object {
    var AppName: js.UndefOr[AppName]
    var AppType: js.UndefOr[AppType]
    var CreationTime: js.UndefOr[CreationTime]
    var DomainId: js.UndefOr[DomainId]
    var Status: js.UndefOr[AppStatus]
    var UserProfileName: js.UndefOr[UserProfileName]
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
  @Factory
  trait AppSpecification extends js.Object {
    var ImageUri: ImageUri
    var ContainerArguments: js.UndefOr[ContainerArguments]
    var ContainerEntrypoint: js.UndefOr[ContainerEntrypoint]
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
  @Factory
  trait AssociateTrialComponentRequest extends js.Object {
    var TrialComponentName: ExperimentEntityName
    var TrialName: ExperimentEntityName
  }

  @js.native
  @Factory
  trait AssociateTrialComponentResponse extends js.Object {
    var TrialArn: js.UndefOr[TrialArn]
    var TrialComponentArn: js.UndefOr[TrialComponentArn]
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
  @Factory
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

  /**
    * Information about the steps for a Candidate, and what step it is working on.
    */
  @js.native
  @Factory
  trait AutoMLCandidateStep extends js.Object {
    var CandidateStepArn: CandidateStepArn
    var CandidateStepName: CandidateStepName
    var CandidateStepType: CandidateStepType
  }

  /**
    * Similar to Channel. A channel is a named input source that training algorithms can consume. Refer to Channel for detailed descriptions.
    */
  @js.native
  @Factory
  trait AutoMLChannel extends js.Object {
    var DataSource: AutoMLDataSource
    var TargetAttributeName: TargetAttributeName
    var CompressionType: js.UndefOr[CompressionType]
  }

  /**
    * A list of container definitions that describe the different containers that make up one AutoML candidate. Refer to ContainerDefinition for more details.
    */
  @js.native
  @Factory
  trait AutoMLContainerDefinition extends js.Object {
    var Image: Image
    var ModelDataUrl: Url
    var Environment: js.UndefOr[EnvironmentMap]
  }

  /**
    * The data source for the AutoPilot job.
    */
  @js.native
  @Factory
  trait AutoMLDataSource extends js.Object {
    var S3DataSource: AutoMLS3DataSource
  }

  /**
    * Artifacts that are generation during a job.
    */
  @js.native
  @Factory
  trait AutoMLJobArtifacts extends js.Object {
    var CandidateDefinitionNotebookLocation: js.UndefOr[CandidateDefinitionNotebookLocation]
    var DataExplorationNotebookLocation: js.UndefOr[DataExplorationNotebookLocation]
  }

  /**
    * How long a job is allowed to run, or how many candidates a job is allowed to generate.
    */
  @js.native
  @Factory
  trait AutoMLJobCompletionCriteria extends js.Object {
    var MaxAutoMLJobRuntimeInSeconds: js.UndefOr[MaxAutoMLJobRuntimeInSeconds]
    var MaxCandidates: js.UndefOr[MaxCandidates]
    var MaxRuntimePerTrainingJobInSeconds: js.UndefOr[MaxRuntimePerTrainingJobInSeconds]
  }

  /**
    * A collection of settings used for a job.
    */
  @js.native
  @Factory
  trait AutoMLJobConfig extends js.Object {
    var CompletionCriteria: js.UndefOr[AutoMLJobCompletionCriteria]
    var SecurityConfig: js.UndefOr[AutoMLSecurityConfig]
  }

  /**
    * Applies a metric to minimize or maximize for the job's objective.
    */
  @js.native
  @Factory
  trait AutoMLJobObjective extends js.Object {
    var MetricName: AutoMLMetricEnum
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
  @Factory
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
  @Factory
  trait AutoMLOutputDataConfig extends js.Object {
    var S3OutputPath: S3Uri
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  /**
    * The Amazon S3 data source.
    */
  @js.native
  @Factory
  trait AutoMLS3DataSource extends js.Object {
    var S3DataType: AutoMLS3DataType
    var S3Uri: S3Uri
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
  @Factory
  trait AutoMLSecurityConfig extends js.Object {
    var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
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
  @Factory
  trait CaptureContentTypeHeader extends js.Object {
    var CsvContentTypes: js.UndefOr[CsvContentTypes]
    var JsonContentTypes: js.UndefOr[JsonContentTypes]
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
  @Factory
  trait CaptureOption extends js.Object {
    var CaptureMode: CaptureMode
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
  @Factory
  trait CategoricalParameterRange extends js.Object {
    var Name: ParameterKey
    var Values: ParameterValues
  }

  /**
    * Defines the possible values for a categorical hyperparameter.
    */
  @js.native
  @Factory
  trait CategoricalParameterRangeSpecification extends js.Object {
    var Values: ParameterValues
  }

  /**
    * A channel is a named input source that training algorithms can consume.
    */
  @js.native
  @Factory
  trait Channel extends js.Object {
    var ChannelName: ChannelName
    var DataSource: DataSource
    var CompressionType: js.UndefOr[CompressionType]
    var ContentType: js.UndefOr[ContentType]
    var InputMode: js.UndefOr[TrainingInputMode]
    var RecordWrapperType: js.UndefOr[RecordWrapper]
    var ShuffleConfig: js.UndefOr[ShuffleConfig]
  }

  /**
    * Defines a named input source, called a channel, to be used by an algorithm.
    */
  @js.native
  @Factory
  trait ChannelSpecification extends js.Object {
    var Name: ChannelName
    var SupportedContentTypes: ContentTypes
    var SupportedInputModes: InputModes
    var Description: js.UndefOr[EntityDescription]
    var IsRequired: js.UndefOr[Boolean]
    var SupportedCompressionTypes: js.UndefOr[CompressionTypes]
  }

  /**
    * Contains information about the output location for managed spot training checkpoint data.
    */
  @js.native
  @Factory
  trait CheckpointConfig extends js.Object {
    var S3Uri: S3Uri
    var LocalPath: js.UndefOr[DirectoryPath]
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
  @Factory
  trait CodeRepositorySummary extends js.Object {
    var CodeRepositoryArn: CodeRepositoryArn
    var CodeRepositoryName: EntityName
    var CreationTime: CreationTime
    var LastModifiedTime: LastModifiedTime
    var GitConfig: js.UndefOr[GitConfig]
  }

  /**
    * Identifies a Amazon Cognito user group. A user group can be used in on or more work teams.
    */
  @js.native
  @Factory
  trait CognitoMemberDefinition extends js.Object {
    var ClientId: CognitoClientId
    var UserGroup: CognitoUserGroup
    var UserPool: CognitoUserPool
  }

  /**
    * Configuration information for tensor collections.
    */
  @js.native
  @Factory
  trait CollectionConfiguration extends js.Object {
    var CollectionName: js.UndefOr[CollectionName]
    var CollectionParameters: js.UndefOr[CollectionParameters]
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
  @Factory
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
  @Factory
  trait ContainerDefinition extends js.Object {
    var ContainerHostname: js.UndefOr[ContainerHostname]
    var Environment: js.UndefOr[EnvironmentMap]
    var Image: js.UndefOr[Image]
    var Mode: js.UndefOr[ContainerMode]
    var ModelDataUrl: js.UndefOr[Url]
    var ModelPackageName: js.UndefOr[ArnOrName]
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
  @Factory
  trait ContinuousParameterRange extends js.Object {
    var MaxValue: ParameterValue
    var MinValue: ParameterValue
    var Name: ParameterKey
    var ScalingType: js.UndefOr[HyperParameterScalingType]
  }

  /**
    * Defines the possible values for a continuous hyperparameter.
    */
  @js.native
  @Factory
  trait ContinuousParameterRangeSpecification extends js.Object {
    var MaxValue: ParameterValue
    var MinValue: ParameterValue
  }

  @js.native
  @Factory
  trait CreateAlgorithmInput extends js.Object {
    var AlgorithmName: EntityName
    var TrainingSpecification: TrainingSpecification
    var AlgorithmDescription: js.UndefOr[EntityDescription]
    var CertifyForMarketplace: js.UndefOr[CertifyForMarketplace]
    var InferenceSpecification: js.UndefOr[InferenceSpecification]
    var ValidationSpecification: js.UndefOr[AlgorithmValidationSpecification]
  }

  @js.native
  @Factory
  trait CreateAlgorithmOutput extends js.Object {
    var AlgorithmArn: AlgorithmArn
  }

  @js.native
  @Factory
  trait CreateAppRequest extends js.Object {
    var AppName: AppName
    var AppType: AppType
    var DomainId: DomainId
    var UserProfileName: UserProfileName
    var ResourceSpec: js.UndefOr[ResourceSpec]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateAppResponse extends js.Object {
    var AppArn: js.UndefOr[AppArn]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateAutoMLJobResponse extends js.Object {
    var AutoMLJobArn: AutoMLJobArn
  }

  @js.native
  @Factory
  trait CreateCodeRepositoryInput extends js.Object {
    var CodeRepositoryName: EntityName
    var GitConfig: GitConfig
  }

  @js.native
  @Factory
  trait CreateCodeRepositoryOutput extends js.Object {
    var CodeRepositoryArn: CodeRepositoryArn
  }

  @js.native
  @Factory
  trait CreateCompilationJobRequest extends js.Object {
    var CompilationJobName: EntityName
    var InputConfig: InputConfig
    var OutputConfig: OutputConfig
    var RoleArn: RoleArn
    var StoppingCondition: StoppingCondition
  }

  @js.native
  @Factory
  trait CreateCompilationJobResponse extends js.Object {
    var CompilationJobArn: CompilationJobArn
  }

  @js.native
  @Factory
  trait CreateDomainRequest extends js.Object {
    var AuthMode: AuthMode
    var DefaultUserSettings: UserSettings
    var DomainName: DomainName
    var SubnetIds: Subnets
    var VpcId: VpcId
    var HomeEfsFileSystemKmsKeyId: js.UndefOr[KmsKeyId]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateDomainResponse extends js.Object {
    var DomainArn: js.UndefOr[DomainArn]
    var Url: js.UndefOr[String1024]
  }

  @js.native
  @Factory
  trait CreateEndpointConfigInput extends js.Object {
    var EndpointConfigName: EndpointConfigName
    var ProductionVariants: ProductionVariantList
    var DataCaptureConfig: js.UndefOr[DataCaptureConfig]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateEndpointConfigOutput extends js.Object {
    var EndpointConfigArn: EndpointConfigArn
  }

  @js.native
  @Factory
  trait CreateEndpointInput extends js.Object {
    var EndpointConfigName: EndpointConfigName
    var EndpointName: EndpointName
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateEndpointOutput extends js.Object {
    var EndpointArn: EndpointArn
  }

  @js.native
  @Factory
  trait CreateExperimentRequest extends js.Object {
    var ExperimentName: ExperimentEntityName
    var Description: js.UndefOr[ExperimentDescription]
    var DisplayName: js.UndefOr[ExperimentEntityName]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateExperimentResponse extends js.Object {
    var ExperimentArn: js.UndefOr[ExperimentArn]
  }

  @js.native
  @Factory
  trait CreateFlowDefinitionRequest extends js.Object {
    var FlowDefinitionName: FlowDefinitionName
    var HumanLoopConfig: HumanLoopConfig
    var OutputConfig: FlowDefinitionOutputConfig
    var RoleArn: RoleArn
    var HumanLoopActivationConfig: js.UndefOr[HumanLoopActivationConfig]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateFlowDefinitionResponse extends js.Object {
    var FlowDefinitionArn: FlowDefinitionArn
  }

  @js.native
  @Factory
  trait CreateHumanTaskUiRequest extends js.Object {
    var HumanTaskUiName: HumanTaskUiName
    var UiTemplate: UiTemplate
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateHumanTaskUiResponse extends js.Object {
    var HumanTaskUiArn: HumanTaskUiArn
  }

  @js.native
  @Factory
  trait CreateHyperParameterTuningJobRequest extends js.Object {
    var HyperParameterTuningJobConfig: HyperParameterTuningJobConfig
    var HyperParameterTuningJobName: HyperParameterTuningJobName
    var Tags: js.UndefOr[TagList]
    var TrainingJobDefinition: js.UndefOr[HyperParameterTrainingJobDefinition]
    var TrainingJobDefinitions: js.UndefOr[HyperParameterTrainingJobDefinitions]
    var WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig]
  }

  @js.native
  @Factory
  trait CreateHyperParameterTuningJobResponse extends js.Object {
    var HyperParameterTuningJobArn: HyperParameterTuningJobArn
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateLabelingJobResponse extends js.Object {
    var LabelingJobArn: LabelingJobArn
  }

  @js.native
  @Factory
  trait CreateModelInput extends js.Object {
    var ExecutionRoleArn: RoleArn
    var ModelName: ModelName
    var Containers: js.UndefOr[ContainerDefinitionList]
    var EnableNetworkIsolation: js.UndefOr[Boolean]
    var PrimaryContainer: js.UndefOr[ContainerDefinition]
    var Tags: js.UndefOr[TagList]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  @js.native
  @Factory
  trait CreateModelOutput extends js.Object {
    var ModelArn: ModelArn
  }

  @js.native
  @Factory
  trait CreateModelPackageInput extends js.Object {
    var ModelPackageName: EntityName
    var CertifyForMarketplace: js.UndefOr[CertifyForMarketplace]
    var InferenceSpecification: js.UndefOr[InferenceSpecification]
    var ModelPackageDescription: js.UndefOr[EntityDescription]
    var SourceAlgorithmSpecification: js.UndefOr[SourceAlgorithmSpecification]
    var ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification]
  }

  @js.native
  @Factory
  trait CreateModelPackageOutput extends js.Object {
    var ModelPackageArn: ModelPackageArn
  }

  @js.native
  @Factory
  trait CreateMonitoringScheduleRequest extends js.Object {
    var MonitoringScheduleConfig: MonitoringScheduleConfig
    var MonitoringScheduleName: MonitoringScheduleName
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateMonitoringScheduleResponse extends js.Object {
    var MonitoringScheduleArn: MonitoringScheduleArn
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateNotebookInstanceLifecycleConfigInput extends js.Object {
    var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
    var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList]
    var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList]
  }

  @js.native
  @Factory
  trait CreateNotebookInstanceLifecycleConfigOutput extends js.Object {
    var NotebookInstanceLifecycleConfigArn: js.UndefOr[NotebookInstanceLifecycleConfigArn]
  }

  @js.native
  @Factory
  trait CreateNotebookInstanceOutput extends js.Object {
    var NotebookInstanceArn: js.UndefOr[NotebookInstanceArn]
  }

  @js.native
  @Factory
  trait CreatePresignedDomainUrlRequest extends js.Object {
    var DomainId: DomainId
    var UserProfileName: UserProfileName
    var SessionExpirationDurationInSeconds: js.UndefOr[SessionExpirationDurationInSeconds]
  }

  @js.native
  @Factory
  trait CreatePresignedDomainUrlResponse extends js.Object {
    var AuthorizedUrl: js.UndefOr[PresignedDomainUrl]
  }

  @js.native
  @Factory
  trait CreatePresignedNotebookInstanceUrlInput extends js.Object {
    var NotebookInstanceName: NotebookInstanceName
    var SessionExpirationDurationInSeconds: js.UndefOr[SessionExpirationDurationInSeconds]
  }

  @js.native
  @Factory
  trait CreatePresignedNotebookInstanceUrlOutput extends js.Object {
    var AuthorizedUrl: js.UndefOr[NotebookInstanceUrl]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateProcessingJobResponse extends js.Object {
    var ProcessingJobArn: ProcessingJobArn
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateTrainingJobResponse extends js.Object {
    var TrainingJobArn: TrainingJobArn
  }

  @js.native
  @Factory
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
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateTransformJobResponse extends js.Object {
    var TransformJobArn: TransformJobArn
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateTrialComponentResponse extends js.Object {
    var TrialComponentArn: js.UndefOr[TrialComponentArn]
  }

  @js.native
  @Factory
  trait CreateTrialRequest extends js.Object {
    var ExperimentName: ExperimentEntityName
    var TrialName: ExperimentEntityName
    var DisplayName: js.UndefOr[ExperimentEntityName]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateTrialResponse extends js.Object {
    var TrialArn: js.UndefOr[TrialArn]
  }

  @js.native
  @Factory
  trait CreateUserProfileRequest extends js.Object {
    var DomainId: DomainId
    var UserProfileName: UserProfileName
    var SingleSignOnUserIdentifier: js.UndefOr[SingleSignOnUserIdentifier]
    var SingleSignOnUserValue: js.UndefOr[String256]
    var Tags: js.UndefOr[TagList]
    var UserSettings: js.UndefOr[UserSettings]
  }

  @js.native
  @Factory
  trait CreateUserProfileResponse extends js.Object {
    var UserProfileArn: js.UndefOr[UserProfileArn]
  }

  @js.native
  @Factory
  trait CreateWorkteamRequest extends js.Object {
    var Description: String200
    var MemberDefinitions: MemberDefinitions
    var WorkteamName: WorkteamName
    var NotificationConfiguration: js.UndefOr[NotificationConfiguration]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateWorkteamResponse extends js.Object {
    var WorkteamArn: js.UndefOr[WorkteamArn]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DataCaptureConfig extends js.Object {
    var CaptureOptions: CaptureOptionList
    var DestinationS3Uri: DestinationS3Uri
    var InitialSamplingPercentage: SamplingPercentage
    var CaptureContentTypeHeader: js.UndefOr[CaptureContentTypeHeader]
    var EnableCapture: js.UndefOr[EnableCapture]
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DataCaptureConfigSummary extends js.Object {
    var CaptureStatus: CaptureStatus
    var CurrentSamplingPercentage: SamplingPercentage
    var DestinationS3Uri: DestinationS3Uri
    var EnableCapture: EnableCapture
    var KmsKeyId: KmsKeyId
  }

  /**
    * The data structure used to specify the data to be used for inference in a batch transform job and to associate the data that is relevant to the prediction results in the output. The input filter provided allows you to exclude input data that is not needed for inference in a batch transform job. The output filter provided allows you to include input data relevant to interpreting the predictions in the output from the job. For more information, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html|Associate Prediction Results with their Corresponding Input Records]].
    */
  @js.native
  @Factory
  trait DataProcessing extends js.Object {
    var InputFilter: js.UndefOr[JsonPath]
    var JoinSource: js.UndefOr[JoinSource]
    var OutputFilter: js.UndefOr[JsonPath]
  }

  /**
    * Describes the location of the channel data.
    */
  @js.native
  @Factory
  trait DataSource extends js.Object {
    var FileSystemDataSource: js.UndefOr[FileSystemDataSource]
    var S3DataSource: js.UndefOr[S3DataSource]
  }

  /**
    * Configuration information for the debug hook parameters, collection configuration, and storage paths.
    */
  @js.native
  @Factory
  trait DebugHookConfig extends js.Object {
    var S3OutputPath: S3Uri
    var CollectionConfigurations: js.UndefOr[CollectionConfigurations]
    var HookParameters: js.UndefOr[HookParameters]
    var LocalPath: js.UndefOr[DirectoryPath]
  }

  /**
    * Configuration information for debugging rules.
    */
  @js.native
  @Factory
  trait DebugRuleConfiguration extends js.Object {
    var RuleConfigurationName: RuleConfigurationName
    var RuleEvaluatorImage: AlgorithmImage
    var InstanceType: js.UndefOr[ProcessingInstanceType]
    var LocalPath: js.UndefOr[DirectoryPath]
    var RuleParameters: js.UndefOr[RuleParameters]
    var S3OutputPath: js.UndefOr[S3Uri]
    var VolumeSizeInGB: js.UndefOr[OptionalVolumeSizeInGB]
  }

  /**
    * Information about the status of the rule evaluation.
    */
  @js.native
  @Factory
  trait DebugRuleEvaluationStatus extends js.Object {
    var LastModifiedTime: js.UndefOr[Timestamp]
    var RuleConfigurationName: js.UndefOr[RuleConfigurationName]
    var RuleEvaluationJobArn: js.UndefOr[ProcessingJobArn]
    var RuleEvaluationStatus: js.UndefOr[RuleEvaluationStatus]
    var StatusDetails: js.UndefOr[StatusDetails]
  }

  @js.native
  @Factory
  trait DeleteAlgorithmInput extends js.Object {
    var AlgorithmName: EntityName
  }

  @js.native
  @Factory
  trait DeleteAppRequest extends js.Object {
    var AppName: AppName
    var AppType: AppType
    var DomainId: DomainId
    var UserProfileName: UserProfileName
  }

  @js.native
  @Factory
  trait DeleteCodeRepositoryInput extends js.Object {
    var CodeRepositoryName: EntityName
  }

  @js.native
  @Factory
  trait DeleteDomainRequest extends js.Object {
    var DomainId: DomainId
    var RetentionPolicy: js.UndefOr[RetentionPolicy]
  }

  @js.native
  @Factory
  trait DeleteEndpointConfigInput extends js.Object {
    var EndpointConfigName: EndpointConfigName
  }

  @js.native
  @Factory
  trait DeleteEndpointInput extends js.Object {
    var EndpointName: EndpointName
  }

  @js.native
  @Factory
  trait DeleteExperimentRequest extends js.Object {
    var ExperimentName: ExperimentEntityName
  }

  @js.native
  @Factory
  trait DeleteExperimentResponse extends js.Object {
    var ExperimentArn: js.UndefOr[ExperimentArn]
  }

  @js.native
  @Factory
  trait DeleteFlowDefinitionRequest extends js.Object {
    var FlowDefinitionName: FlowDefinitionName
  }

  @js.native
  @Factory
  trait DeleteFlowDefinitionResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteModelInput extends js.Object {
    var ModelName: ModelName
  }

  @js.native
  @Factory
  trait DeleteModelPackageInput extends js.Object {
    var ModelPackageName: EntityName
  }

  @js.native
  @Factory
  trait DeleteMonitoringScheduleRequest extends js.Object {
    var MonitoringScheduleName: MonitoringScheduleName
  }

  @js.native
  @Factory
  trait DeleteNotebookInstanceInput extends js.Object {
    var NotebookInstanceName: NotebookInstanceName
  }

  @js.native
  @Factory
  trait DeleteNotebookInstanceLifecycleConfigInput extends js.Object {
    var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
  }

  @js.native
  @Factory
  trait DeleteTagsInput extends js.Object {
    var ResourceArn: ResourceArn
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait DeleteTagsOutput extends js.Object {}

  @js.native
  @Factory
  trait DeleteTrialComponentRequest extends js.Object {
    var TrialComponentName: ExperimentEntityName
  }

  @js.native
  @Factory
  trait DeleteTrialComponentResponse extends js.Object {
    var TrialComponentArn: js.UndefOr[TrialComponentArn]
  }

  @js.native
  @Factory
  trait DeleteTrialRequest extends js.Object {
    var TrialName: ExperimentEntityName
  }

  @js.native
  @Factory
  trait DeleteTrialResponse extends js.Object {
    var TrialArn: js.UndefOr[TrialArn]
  }

  @js.native
  @Factory
  trait DeleteUserProfileRequest extends js.Object {
    var DomainId: DomainId
    var UserProfileName: UserProfileName
  }

  @js.native
  @Factory
  trait DeleteWorkteamRequest extends js.Object {
    var WorkteamName: WorkteamName
  }

  @js.native
  @Factory
  trait DeleteWorkteamResponse extends js.Object {
    var Success: Success
  }

  /**
    * Gets the Amazon EC2 Container Registry path of the docker image of the model that is hosted in this <a>ProductionVariant</a>.
    *  If you used the <code>registry/repository[:tag]</code> form to specify the image path of the primary container when you created the model hosted in this <code>ProductionVariant</code>, the path resolves to a path of the form <code>registry/repository[@digest]</code>. A digest is a hash value that identifies a specific version of an image. For information about Amazon ECR paths, see [[https://docs.aws.amazon.com/AmazonECR/latest/userguide/docker-pull-ecr-image.html|Pulling an Image]] in the <i>Amazon ECR User Guide</i>.
    */
  @js.native
  @Factory
  trait DeployedImage extends js.Object {
    var ResolutionTime: js.UndefOr[Timestamp]
    var ResolvedImage: js.UndefOr[Image]
    var SpecifiedImage: js.UndefOr[Image]
  }

  @js.native
  @Factory
  trait DescribeAlgorithmInput extends js.Object {
    var AlgorithmName: ArnOrName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeAppRequest extends js.Object {
    var AppName: AppName
    var AppType: AppType
    var DomainId: DomainId
    var UserProfileName: UserProfileName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeAutoMLJobRequest extends js.Object {
    var AutoMLJobName: AutoMLJobName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeCodeRepositoryInput extends js.Object {
    var CodeRepositoryName: EntityName
  }

  @js.native
  @Factory
  trait DescribeCodeRepositoryOutput extends js.Object {
    var CodeRepositoryArn: CodeRepositoryArn
    var CodeRepositoryName: EntityName
    var CreationTime: CreationTime
    var LastModifiedTime: LastModifiedTime
    var GitConfig: js.UndefOr[GitConfig]
  }

  @js.native
  @Factory
  trait DescribeCompilationJobRequest extends js.Object {
    var CompilationJobName: EntityName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeDomainRequest extends js.Object {
    var DomainId: DomainId
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeEndpointConfigInput extends js.Object {
    var EndpointConfigName: EndpointConfigName
  }

  @js.native
  @Factory
  trait DescribeEndpointConfigOutput extends js.Object {
    var CreationTime: Timestamp
    var EndpointConfigArn: EndpointConfigArn
    var EndpointConfigName: EndpointConfigName
    var ProductionVariants: ProductionVariantList
    var DataCaptureConfig: js.UndefOr[DataCaptureConfig]
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  @js.native
  @Factory
  trait DescribeEndpointInput extends js.Object {
    var EndpointName: EndpointName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeExperimentRequest extends js.Object {
    var ExperimentName: ExperimentEntityName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeFlowDefinitionRequest extends js.Object {
    var FlowDefinitionName: FlowDefinitionName
  }

  @js.native
  @Factory
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
  }

  @js.native
  @Factory
  trait DescribeHumanTaskUiRequest extends js.Object {
    var HumanTaskUiName: HumanTaskUiName
  }

  @js.native
  @Factory
  trait DescribeHumanTaskUiResponse extends js.Object {
    var CreationTime: Timestamp
    var HumanTaskUiArn: HumanTaskUiArn
    var HumanTaskUiName: HumanTaskUiName
    var UiTemplate: UiTemplateInfo
  }

  @js.native
  @Factory
  trait DescribeHyperParameterTuningJobRequest extends js.Object {
    var HyperParameterTuningJobName: HyperParameterTuningJobName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeLabelingJobRequest extends js.Object {
    var LabelingJobName: LabelingJobName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeModelInput extends js.Object {
    var ModelName: ModelName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeModelPackageInput extends js.Object {
    var ModelPackageName: ArnOrName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeMonitoringScheduleRequest extends js.Object {
    var MonitoringScheduleName: MonitoringScheduleName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeNotebookInstanceInput extends js.Object {
    var NotebookInstanceName: NotebookInstanceName
  }

  @js.native
  @Factory
  trait DescribeNotebookInstanceLifecycleConfigInput extends js.Object {
    var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
  }

  @js.native
  @Factory
  trait DescribeNotebookInstanceLifecycleConfigOutput extends js.Object {
    var CreationTime: js.UndefOr[CreationTime]
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
    var NotebookInstanceLifecycleConfigArn: js.UndefOr[NotebookInstanceLifecycleConfigArn]
    var NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName]
    var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList]
    var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeProcessingJobRequest extends js.Object {
    var ProcessingJobName: ProcessingJobName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeSubscribedWorkteamRequest extends js.Object {
    var WorkteamArn: WorkteamArn
  }

  @js.native
  @Factory
  trait DescribeSubscribedWorkteamResponse extends js.Object {
    var SubscribedWorkteam: SubscribedWorkteam
  }

  @js.native
  @Factory
  trait DescribeTrainingJobRequest extends js.Object {
    var TrainingJobName: TrainingJobName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeTransformJobRequest extends js.Object {
    var TransformJobName: TransformJobName
  }

  @js.native
  @Factory
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
    var TransformEndTime: js.UndefOr[Timestamp]
    var TransformOutput: js.UndefOr[TransformOutput]
    var TransformStartTime: js.UndefOr[Timestamp]
  }

  @js.native
  @Factory
  trait DescribeTrialComponentRequest extends js.Object {
    var TrialComponentName: ExperimentEntityName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeTrialRequest extends js.Object {
    var TrialName: ExperimentEntityName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeUserProfileRequest extends js.Object {
    var DomainId: DomainId
    var UserProfileName: UserProfileName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeWorkforceRequest extends js.Object {
    var WorkforceName: WorkforceName
  }

  @js.native
  @Factory
  trait DescribeWorkforceResponse extends js.Object {
    var Workforce: Workforce
  }

  @js.native
  @Factory
  trait DescribeWorkteamRequest extends js.Object {
    var WorkteamName: WorkteamName
  }

  @js.native
  @Factory
  trait DescribeWorkteamResponse extends js.Object {
    var Workteam: Workteam
  }

  /**
    * Specifies weight and capacity values for a production variant.
    */
  @js.native
  @Factory
  trait DesiredWeightAndCapacity extends js.Object {
    var VariantName: VariantName
    var DesiredInstanceCount: js.UndefOr[TaskCount]
    var DesiredWeight: js.UndefOr[VariantWeight]
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
  @Factory
  trait DisassociateTrialComponentRequest extends js.Object {
    var TrialComponentName: ExperimentEntityName
    var TrialName: ExperimentEntityName
  }

  @js.native
  @Factory
  trait DisassociateTrialComponentResponse extends js.Object {
    var TrialArn: js.UndefOr[TrialArn]
    var TrialComponentArn: js.UndefOr[TrialComponentArn]
  }

  /**
    * The domain's details.
    */
  @js.native
  @Factory
  trait DomainDetails extends js.Object {
    var CreationTime: js.UndefOr[CreationTime]
    var DomainArn: js.UndefOr[DomainArn]
    var DomainId: js.UndefOr[DomainId]
    var DomainName: js.UndefOr[DomainName]
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
    var Status: js.UndefOr[DomainStatus]
    var Url: js.UndefOr[String1024]
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
  @Factory
  trait EndpointConfigSummary extends js.Object {
    var CreationTime: Timestamp
    var EndpointConfigArn: EndpointConfigArn
    var EndpointConfigName: EndpointConfigName
  }

  /**
    * Input object for the endpoint
    */
  @js.native
  @Factory
  trait EndpointInput extends js.Object {
    var EndpointName: EndpointName
    var LocalPath: ProcessingLocalPath
    var S3DataDistributionType: js.UndefOr[ProcessingS3DataDistributionType]
    var S3InputMode: js.UndefOr[ProcessingS3InputMode]
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
  @Factory
  trait EndpointSummary extends js.Object {
    var CreationTime: Timestamp
    var EndpointArn: EndpointArn
    var EndpointName: EndpointName
    var EndpointStatus: EndpointStatus
    var LastModifiedTime: Timestamp
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
    * A summary of the properties of an experiment as returned by the <a>Search</a> API.
    */
  @js.native
  @Factory
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

  /**
    * Configuration for the experiment.
    */
  @js.native
  @Factory
  trait ExperimentConfig extends js.Object {
    var ExperimentName: js.UndefOr[ExperimentConfigName]
    var TrialComponentDisplayName: js.UndefOr[ExperimentConfigName]
    var TrialName: js.UndefOr[ExperimentConfigName]
  }

  /**
    * The source of the experiment.
    */
  @js.native
  @Factory
  trait ExperimentSource extends js.Object {
    var SourceArn: ExperimentSourceArn
    var SourceType: js.UndefOr[SourceType]
  }

  /**
    * A summary of the properties of an experiment. To get the complete set of properties, call the <a>DescribeExperiment</a> API and provide the <code>ExperimentName</code>.
    */
  @js.native
  @Factory
  trait ExperimentSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DisplayName: js.UndefOr[ExperimentEntityName]
    var ExperimentArn: js.UndefOr[ExperimentArn]
    var ExperimentName: js.UndefOr[ExperimentEntityName]
    var ExperimentSource: js.UndefOr[ExperimentSource]
    var LastModifiedTime: js.UndefOr[Timestamp]
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
  @Factory
  trait FileSystemDataSource extends js.Object {
    var DirectoryPath: DirectoryPath
    var FileSystemAccessMode: FileSystemAccessMode
    var FileSystemId: FileSystemId
    var FileSystemType: FileSystemType
  }

  @js.native
  sealed trait FileSystemType extends js.Any
  object FileSystemType extends js.Object {
    val EFS       = "EFS".asInstanceOf[FileSystemType]
    val FSxLustre = "FSxLustre".asInstanceOf[FileSystemType]

    val values = js.Object.freeze(js.Array(EFS, FSxLustre))
  }

  /**
    * A conditional statement for a search expression that includes a resource property, a Boolean operator, and a value.
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
  @Factory
  trait Filter extends js.Object {
    var Name: ResourcePropertyName
    var Operator: js.UndefOr[Operator]
    var Value: js.UndefOr[FilterValue]
  }

  /**
    * The candidate result from a job.
    */
  @js.native
  @Factory
  trait FinalAutoMLJobObjectiveMetric extends js.Object {
    var MetricName: AutoMLMetricEnum
    var Value: MetricValue
    var Type: js.UndefOr[AutoMLJobObjectiveType]
  }

  /**
    * Shows the final value for the objective metric for a training job that was launched by a hyperparameter tuning job. You define the objective metric in the <code>HyperParameterTuningJobObjective</code> parameter of <a>HyperParameterTuningJobConfig</a>.
    */
  @js.native
  @Factory
  trait FinalHyperParameterTuningJobObjectiveMetric extends js.Object {
    var MetricName: MetricName
    var Value: MetricValue
    var Type: js.UndefOr[HyperParameterTuningJobObjectiveType]
  }

  /**
    * Contains information about where human output will be stored.
    */
  @js.native
  @Factory
  trait FlowDefinitionOutputConfig extends js.Object {
    var S3OutputPath: S3Uri
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  @js.native
  sealed trait FlowDefinitionStatus extends js.Any
  object FlowDefinitionStatus extends js.Object {
    val Initializing = "Initializing".asInstanceOf[FlowDefinitionStatus]
    val Active       = "Active".asInstanceOf[FlowDefinitionStatus]
    val Failed       = "Failed".asInstanceOf[FlowDefinitionStatus]
    val Deleting     = "Deleting".asInstanceOf[FlowDefinitionStatus]
    val Deleted      = "Deleted".asInstanceOf[FlowDefinitionStatus]

    val values = js.Object.freeze(js.Array(Initializing, Active, Failed, Deleting, Deleted))
  }

  /**
    * Contains summary information about the flow definition.
    */
  @js.native
  @Factory
  trait FlowDefinitionSummary extends js.Object {
    var CreationTime: Timestamp
    var FlowDefinitionArn: FlowDefinitionArn
    var FlowDefinitionName: FlowDefinitionName
    var FlowDefinitionStatus: FlowDefinitionStatus
    var FailureReason: js.UndefOr[FailureReason]
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

    val values = js.Object.freeze(js.Array(TENSORFLOW, KERAS, MXNET, ONNX, PYTORCH, XGBOOST))
  }

  @js.native
  @Factory
  trait GetSearchSuggestionsRequest extends js.Object {
    var Resource: ResourceType
    var SuggestionQuery: js.UndefOr[SuggestionQuery]
  }

  @js.native
  @Factory
  trait GetSearchSuggestionsResponse extends js.Object {
    var PropertyNameSuggestions: js.UndefOr[PropertyNameSuggestionList]
  }

  /**
    * Specifies configuration details for a Git repository in your AWS account.
    */
  @js.native
  @Factory
  trait GitConfig extends js.Object {
    var RepositoryUrl: GitConfigUrl
    var Branch: js.UndefOr[Branch]
    var SecretArn: js.UndefOr[SecretArn]
  }

  /**
    * Specifies configuration details for a Git repository when the repository is updated.
    */
  @js.native
  @Factory
  trait GitConfigForUpdate extends js.Object {
    var SecretArn: js.UndefOr[SecretArn]
  }

  /**
    * Defines under what conditions SageMaker creates a human loop. Used within .
    */
  @js.native
  @Factory
  trait HumanLoopActivationConditionsConfig extends js.Object {
    var HumanLoopActivationConditions: HumanLoopActivationConditions
  }

  /**
    * Provides information about how and under what conditions SageMaker creates a human loop. If <code>HumanLoopActivationConfig</code> is not given, then all requests go to humans.
    */
  @js.native
  @Factory
  trait HumanLoopActivationConfig extends js.Object {
    var HumanLoopActivationConditionsConfig: HumanLoopActivationConditionsConfig
    var HumanLoopRequestSource: HumanLoopRequestSource
  }

  /**
    * Describes the work to be performed by human workers.
    */
  @js.native
  @Factory
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

  /**
    * Container for configuring the source of human task requests.
    */
  @js.native
  @Factory
  trait HumanLoopRequestSource extends js.Object {
    var AwsManagedHumanLoopRequestSource: AwsManagedHumanLoopRequestSource
  }

  /**
    * Information required for human workers to complete a labeling task.
    */
  @js.native
  @Factory
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

  /**
    * Container for human task user interface information.
    */
  @js.native
  @Factory
  trait HumanTaskUiSummary extends js.Object {
    var CreationTime: Timestamp
    var HumanTaskUiArn: HumanTaskUiArn
    var HumanTaskUiName: HumanTaskUiName
  }

  /**
    * Specifies which training algorithm to use for training jobs that a hyperparameter tuning job launches and the metrics to monitor.
    */
  @js.native
  @Factory
  trait HyperParameterAlgorithmSpecification extends js.Object {
    var TrainingInputMode: TrainingInputMode
    var AlgorithmName: js.UndefOr[ArnOrName]
    var MetricDefinitions: js.UndefOr[MetricDefinitionList]
    var TrainingImage: js.UndefOr[AlgorithmImage]
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
  @Factory
  trait HyperParameterSpecification extends js.Object {
    var Name: ParameterName
    var Type: ParameterType
    var DefaultValue: js.UndefOr[ParameterValue]
    var Description: js.UndefOr[EntityDescription]
    var IsRequired: js.UndefOr[Boolean]
    var IsTunable: js.UndefOr[Boolean]
    var Range: js.UndefOr[ParameterRange]
  }

  /**
    * Defines the training jobs launched by a hyperparameter tuning job.
    */
  @js.native
  @Factory
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

  /**
    * Specifies summary information about a training job.
    */
  @js.native
  @Factory
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

  /**
    * Configures a hyperparameter tuning job.
    */
  @js.native
  @Factory
  trait HyperParameterTuningJobConfig extends js.Object {
    var ResourceLimits: ResourceLimits
    var Strategy: HyperParameterTuningJobStrategyType
    var HyperParameterTuningJobObjective: js.UndefOr[HyperParameterTuningJobObjective]
    var ParameterRanges: js.UndefOr[ParameterRanges]
    var TrainingJobEarlyStoppingType: js.UndefOr[TrainingJobEarlyStoppingType]
    var TuningJobCompletionCriteria: js.UndefOr[TuningJobCompletionCriteria]
  }

  /**
    * Defines the objective metric for a hyperparameter tuning job. Hyperparameter tuning uses the value of this metric to evaluate the training jobs it launches, and returns the training job that results in either the highest or lowest value for this metric, depending on the value you specify for the <code>Type</code> parameter.
    */
  @js.native
  @Factory
  trait HyperParameterTuningJobObjective extends js.Object {
    var MetricName: MetricName
    var Type: HyperParameterTuningJobObjectiveType
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
  @Factory
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

  /**
    * Specifies the configuration for a hyperparameter tuning job that uses one or more previous hyperparameter tuning jobs as a starting point. The results of previous tuning jobs are used to inform which combinations of hyperparameters to search over in the new tuning job.
    *  All training jobs launched by the new hyperparameter tuning job are evaluated by using the objective metric, and the training job that performs the best is compared to the best training jobs from the parent tuning jobs. From these, the training job that performs the best as measured by the objective metric is returned as the overall best training job.
    *
    * '''Note:'''All training jobs launched by parent hyperparameter tuning jobs and the new hyperparameter tuning jobs count against the limit of training jobs for the tuning job.
    */
  @js.native
  @Factory
  trait HyperParameterTuningJobWarmStartConfig extends js.Object {
    var ParentHyperParameterTuningJobs: ParentHyperParameterTuningJobs
    var WarmStartType: HyperParameterTuningJobWarmStartType
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
  @Factory
  trait InferenceSpecification extends js.Object {
    var Containers: ModelPackageContainerDefinitionList
    var SupportedContentTypes: ContentTypes
    var SupportedRealtimeInferenceInstanceTypes: RealtimeInferenceInstanceTypes
    var SupportedResponseMIMETypes: ResponseMIMETypes
    var SupportedTransformInstanceTypes: TransformInstanceTypes
  }

  /**
    * Contains information about the location of input model artifacts, the name and shape of the expected data inputs, and the framework in which the model was trained.
    */
  @js.native
  @Factory
  trait InputConfig extends js.Object {
    var DataInputConfig: DataInputConfig
    var Framework: Framework
    var S3Uri: S3Uri
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
  @Factory
  trait IntegerParameterRange extends js.Object {
    var MaxValue: ParameterValue
    var MinValue: ParameterValue
    var Name: ParameterKey
    var ScalingType: js.UndefOr[HyperParameterScalingType]
  }

  /**
    * Defines the possible values for an integer hyperparameter.
    */
  @js.native
  @Factory
  trait IntegerParameterRangeSpecification extends js.Object {
    var MaxValue: ParameterValue
    var MinValue: ParameterValue
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
  @Factory
  trait JupyterServerAppSettings extends js.Object {
    var DefaultResourceSpec: js.UndefOr[ResourceSpec]
  }

  /**
    * The kernel gateway app settings.
    */
  @js.native
  @Factory
  trait KernelGatewayAppSettings extends js.Object {
    var DefaultResourceSpec: js.UndefOr[ResourceSpec]
  }

  /**
    * Provides a breakdown of the number of objects labeled.
    */
  @js.native
  @Factory
  trait LabelCounters extends js.Object {
    var FailedNonRetryableError: js.UndefOr[LabelCounter]
    var HumanLabeled: js.UndefOr[LabelCounter]
    var MachineLabeled: js.UndefOr[LabelCounter]
    var TotalLabeled: js.UndefOr[LabelCounter]
    var Unlabeled: js.UndefOr[LabelCounter]
  }

  /**
    * Provides counts for human-labeled tasks in the labeling job.
    */
  @js.native
  @Factory
  trait LabelCountersForWorkteam extends js.Object {
    var HumanLabeled: js.UndefOr[LabelCounter]
    var PendingHuman: js.UndefOr[LabelCounter]
    var Total: js.UndefOr[LabelCounter]
  }

  /**
    * Provides configuration information for auto-labeling of your data objects. A <code>LabelingJobAlgorithmsConfig</code> object must be supplied in order to use auto-labeling.
    */
  @js.native
  @Factory
  trait LabelingJobAlgorithmsConfig extends js.Object {
    var LabelingJobAlgorithmSpecificationArn: LabelingJobAlgorithmSpecificationArn
    var InitialActiveLearningModelArn: js.UndefOr[ModelArn]
    var LabelingJobResourceConfig: js.UndefOr[LabelingJobResourceConfig]
  }

  /**
    * Attributes of the data specified by the customer. Use these to describe the data to be labeled.
    */
  @js.native
  @Factory
  trait LabelingJobDataAttributes extends js.Object {
    var ContentClassifiers: js.UndefOr[ContentClassifiers]
  }

  /**
    * Provides information about the location of input data.
    */
  @js.native
  @Factory
  trait LabelingJobDataSource extends js.Object {
    var S3DataSource: LabelingJobS3DataSource
  }

  /**
    * Provides summary information for a work team.
    */
  @js.native
  @Factory
  trait LabelingJobForWorkteamSummary extends js.Object {
    var CreationTime: Timestamp
    var JobReferenceCode: JobReferenceCode
    var WorkRequesterAccountId: AccountId
    var LabelCounters: js.UndefOr[LabelCountersForWorkteam]
    var LabelingJobName: js.UndefOr[LabelingJobName]
    var NumberOfHumanWorkersPerDataObject: js.UndefOr[NumberOfHumanWorkersPerDataObject]
  }

  /**
    * Input configuration information for a labeling job.
    */
  @js.native
  @Factory
  trait LabelingJobInputConfig extends js.Object {
    var DataSource: LabelingJobDataSource
    var DataAttributes: js.UndefOr[LabelingJobDataAttributes]
  }

  /**
    * Specifies the location of the output produced by the labeling job.
    */
  @js.native
  @Factory
  trait LabelingJobOutput extends js.Object {
    var OutputDatasetS3Uri: S3Uri
    var FinalActiveLearningModelArn: js.UndefOr[ModelArn]
  }

  /**
    * Output configuration information for a labeling job.
    */
  @js.native
  @Factory
  trait LabelingJobOutputConfig extends js.Object {
    var S3OutputPath: S3Uri
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  /**
    * Provides configuration information for labeling jobs.
    */
  @js.native
  @Factory
  trait LabelingJobResourceConfig extends js.Object {
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
  }

  /**
    * The Amazon S3 location of the input data objects.
    */
  @js.native
  @Factory
  trait LabelingJobS3DataSource extends js.Object {
    var ManifestS3Uri: S3Uri
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
  @Factory
  trait LabelingJobStoppingConditions extends js.Object {
    var MaxHumanLabeledObjectCount: js.UndefOr[MaxHumanLabeledObjectCount]
    var MaxPercentageOfInputDatasetLabeled: js.UndefOr[MaxPercentageOfInputDatasetLabeled]
  }

  /**
    * Provides summary information about a labeling job.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListAlgorithmsInput extends js.Object {
    var CreationTimeAfter: js.UndefOr[CreationTime]
    var CreationTimeBefore: js.UndefOr[CreationTime]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[NameContains]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[AlgorithmSortBy]
    var SortOrder: js.UndefOr[SortOrder]
  }

  @js.native
  @Factory
  trait ListAlgorithmsOutput extends js.Object {
    var AlgorithmSummaryList: AlgorithmSummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListAppsRequest extends js.Object {
    var DomainIdEquals: js.UndefOr[DomainId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[AppSortKey]
    var SortOrder: js.UndefOr[SortOrder]
    var UserProfileNameEquals: js.UndefOr[UserProfileName]
  }

  @js.native
  @Factory
  trait ListAppsResponse extends js.Object {
    var Apps: js.UndefOr[AppList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListAutoMLJobsResponse extends js.Object {
    var AutoMLJobSummaries: AutoMLJobSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListCandidatesForAutoMLJobRequest extends js.Object {
    var AutoMLJobName: AutoMLJobName
    var CandidateNameEquals: js.UndefOr[CandidateName]
    var MaxResults: js.UndefOr[AutoMLMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[CandidateSortBy]
    var SortOrder: js.UndefOr[AutoMLSortOrder]
    var StatusEquals: js.UndefOr[CandidateStatus]
  }

  @js.native
  @Factory
  trait ListCandidatesForAutoMLJobResponse extends js.Object {
    var Candidates: AutoMLCandidates
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListCodeRepositoriesOutput extends js.Object {
    var CodeRepositorySummaryList: CodeRepositorySummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListCompilationJobsResponse extends js.Object {
    var CompilationJobSummaries: CompilationJobSummaries
    var NextToken: js.UndefOr[NextToken]
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
  @Factory
  trait ListDomainsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDomainsResponse extends js.Object {
    var Domains: js.UndefOr[DomainList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListEndpointConfigsInput extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[EndpointConfigNameContains]
    var NextToken: js.UndefOr[PaginationToken]
    var SortBy: js.UndefOr[EndpointConfigSortKey]
    var SortOrder: js.UndefOr[OrderKey]
  }

  @js.native
  @Factory
  trait ListEndpointConfigsOutput extends js.Object {
    var EndpointConfigs: EndpointConfigSummaryList
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListEndpointsOutput extends js.Object {
    var Endpoints: EndpointSummaryList
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListExperimentsRequest extends js.Object {
    var CreatedAfter: js.UndefOr[Timestamp]
    var CreatedBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[SortExperimentsBy]
    var SortOrder: js.UndefOr[SortOrder]
  }

  @js.native
  @Factory
  trait ListExperimentsResponse extends js.Object {
    var ExperimentSummaries: js.UndefOr[ExperimentSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListFlowDefinitionsRequest extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortOrder: js.UndefOr[SortOrder]
  }

  @js.native
  @Factory
  trait ListFlowDefinitionsResponse extends js.Object {
    var FlowDefinitionSummaries: FlowDefinitionSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListHumanTaskUisRequest extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortOrder: js.UndefOr[SortOrder]
  }

  @js.native
  @Factory
  trait ListHumanTaskUisResponse extends js.Object {
    var HumanTaskUiSummaries: HumanTaskUiSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListHyperParameterTuningJobsResponse extends js.Object {
    var HyperParameterTuningJobSummaries: HyperParameterTuningJobSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListLabelingJobsForWorkteamResponse extends js.Object {
    var LabelingJobSummaryList: LabelingJobForWorkteamSummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  sealed trait ListLabelingJobsForWorkteamSortByOptions extends js.Any
  object ListLabelingJobsForWorkteamSortByOptions extends js.Object {
    val CreationTime = "CreationTime".asInstanceOf[ListLabelingJobsForWorkteamSortByOptions]

    val values = js.Object.freeze(js.Array(CreationTime))
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListLabelingJobsResponse extends js.Object {
    var LabelingJobSummaryList: js.UndefOr[LabelingJobSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListModelPackagesInput extends js.Object {
    var CreationTimeAfter: js.UndefOr[CreationTime]
    var CreationTimeBefore: js.UndefOr[CreationTime]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[NameContains]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[ModelPackageSortBy]
    var SortOrder: js.UndefOr[SortOrder]
  }

  @js.native
  @Factory
  trait ListModelPackagesOutput extends js.Object {
    var ModelPackageSummaryList: ModelPackageSummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListModelsInput extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[ModelNameContains]
    var NextToken: js.UndefOr[PaginationToken]
    var SortBy: js.UndefOr[ModelSortKey]
    var SortOrder: js.UndefOr[OrderKey]
  }

  @js.native
  @Factory
  trait ListModelsOutput extends js.Object {
    var Models: ModelSummaryList
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListMonitoringExecutionsResponse extends js.Object {
    var MonitoringExecutionSummaries: MonitoringExecutionSummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListMonitoringSchedulesResponse extends js.Object {
    var MonitoringScheduleSummaries: MonitoringScheduleSummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListNotebookInstanceLifecycleConfigsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var NotebookInstanceLifecycleConfigs: js.UndefOr[NotebookInstanceLifecycleConfigSummaryList]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListNotebookInstancesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var NotebookInstances: js.UndefOr[NotebookInstanceSummaryList]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListProcessingJobsResponse extends js.Object {
    var ProcessingJobSummaries: ProcessingJobSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListSubscribedWorkteamsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[WorkteamName]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListSubscribedWorkteamsResponse extends js.Object {
    var SubscribedWorkteams: SubscribedWorkteams
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsInput extends js.Object {
    var ResourceArn: ResourceArn
    var MaxResults: js.UndefOr[ListTagsMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait ListTrainingJobsForHyperParameterTuningJobRequest extends js.Object {
    var HyperParameterTuningJobName: HyperParameterTuningJobName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[TrainingJobSortByOptions]
    var SortOrder: js.UndefOr[SortOrder]
    var StatusEquals: js.UndefOr[TrainingJobStatus]
  }

  @js.native
  @Factory
  trait ListTrainingJobsForHyperParameterTuningJobResponse extends js.Object {
    var TrainingJobSummaries: HyperParameterTrainingJobSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListTrainingJobsResponse extends js.Object {
    var TrainingJobSummaries: TrainingJobSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListTransformJobsResponse extends js.Object {
    var TransformJobSummaries: TransformJobSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListTrialComponentsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TrialComponentSummaries: js.UndefOr[TrialComponentSummaries]
  }

  @js.native
  @Factory
  trait ListTrialsRequest extends js.Object {
    var CreatedAfter: js.UndefOr[Timestamp]
    var CreatedBefore: js.UndefOr[Timestamp]
    var ExperimentName: js.UndefOr[ExperimentEntityName]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[SortTrialsBy]
    var SortOrder: js.UndefOr[SortOrder]
  }

  @js.native
  @Factory
  trait ListTrialsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TrialSummaries: js.UndefOr[TrialSummaries]
  }

  @js.native
  @Factory
  trait ListUserProfilesRequest extends js.Object {
    var DomainIdEquals: js.UndefOr[DomainId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[UserProfileSortKey]
    var SortOrder: js.UndefOr[SortOrder]
    var UserProfileNameContains: js.UndefOr[UserProfileName]
  }

  @js.native
  @Factory
  trait ListUserProfilesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var UserProfiles: js.UndefOr[UserProfileList]
  }

  @js.native
  @Factory
  trait ListWorkteamsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[WorkteamName]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[ListWorkteamsSortByOptions]
    var SortOrder: js.UndefOr[SortOrder]
  }

  @js.native
  @Factory
  trait ListWorkteamsResponse extends js.Object {
    var Workteams: Workteams
    var NextToken: js.UndefOr[NextToken]
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
  @Factory
  trait MemberDefinition extends js.Object {
    var CognitoMemberDefinition: js.UndefOr[CognitoMemberDefinition]
  }

  /**
    * The name, value, and date and time of a metric that was emitted to Amazon CloudWatch.
    */
  @js.native
  @Factory
  trait MetricData extends js.Object {
    var MetricName: js.UndefOr[MetricName]
    var Timestamp: js.UndefOr[Timestamp]
    var Value: js.UndefOr[Float]
  }

  /**
    * Specifies a metric that the training algorithm writes to <code>stderr</code> or <code>stdout</code> . Amazon SageMakerhyperparameter tuning captures all defined metrics. You specify one metric that a hyperparameter tuning job uses as its objective metric to choose the best training job.
    */
  @js.native
  @Factory
  trait MetricDefinition extends js.Object {
    var Name: MetricName
    var Regex: MetricRegex
  }

  /**
    * Provides information about the location that is configured for storing model artifacts.
    */
  @js.native
  @Factory
  trait ModelArtifacts extends js.Object {
    var S3ModelArtifacts: S3Uri
  }

  /**
    * Describes the Docker container for the model package.
    */
  @js.native
  @Factory
  trait ModelPackageContainerDefinition extends js.Object {
    var Image: Image
    var ContainerHostname: js.UndefOr[ContainerHostname]
    var ImageDigest: js.UndefOr[ImageDigest]
    var ModelDataUrl: js.UndefOr[Url]
    var ProductId: js.UndefOr[ProductId]
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
  @Factory
  trait ModelPackageStatusDetails extends js.Object {
    var ValidationStatuses: ModelPackageStatusItemList
    var ImageScanStatuses: js.UndefOr[ModelPackageStatusItemList]
  }

  /**
    * Represents the overall status of a model package.
    */
  @js.native
  @Factory
  trait ModelPackageStatusItem extends js.Object {
    var Name: EntityName
    var Status: DetailedModelPackageStatus
    var FailureReason: js.UndefOr[String]
  }

  /**
    * Provides summary information about a model package.
    */
  @js.native
  @Factory
  trait ModelPackageSummary extends js.Object {
    var CreationTime: CreationTime
    var ModelPackageArn: ModelPackageArn
    var ModelPackageName: EntityName
    var ModelPackageStatus: ModelPackageStatus
    var ModelPackageDescription: js.UndefOr[EntityDescription]
  }

  /**
    * Contains data, such as the inputs and targeted instance types that are used in the process of validating the model package.
    *  The data provided in the validation profile is made available to your buyers on AWS Marketplace.
    */
  @js.native
  @Factory
  trait ModelPackageValidationProfile extends js.Object {
    var ProfileName: EntityName
    var TransformJobDefinition: TransformJobDefinition
  }

  /**
    * Specifies batch transform jobs that Amazon SageMaker runs to validate your model package.
    */
  @js.native
  @Factory
  trait ModelPackageValidationSpecification extends js.Object {
    var ValidationProfiles: ModelPackageValidationProfiles
    var ValidationRole: RoleArn
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
  @Factory
  trait ModelSummary extends js.Object {
    var CreationTime: Timestamp
    var ModelArn: ModelArn
    var ModelName: ModelName
  }

  /**
    * Container image configuration object for the monitoring job.
    */
  @js.native
  @Factory
  trait MonitoringAppSpecification extends js.Object {
    var ImageUri: ImageUri
    var ContainerArguments: js.UndefOr[MonitoringContainerArguments]
    var ContainerEntrypoint: js.UndefOr[ContainerEntrypoint]
    var PostAnalyticsProcessorSourceUri: js.UndefOr[S3Uri]
    var RecordPreprocessorSourceUri: js.UndefOr[S3Uri]
  }

  /**
    * Configuration for monitoring constraints and monitoring statistics. These baseline resources are compared against the results of the current job from the series of jobs scheduled to collect data periodically.
    */
  @js.native
  @Factory
  trait MonitoringBaselineConfig extends js.Object {
    var ConstraintsResource: js.UndefOr[MonitoringConstraintsResource]
    var StatisticsResource: js.UndefOr[MonitoringStatisticsResource]
  }

  /**
    * Configuration for the cluster used to run model monitoring jobs.
    */
  @js.native
  @Factory
  trait MonitoringClusterConfig extends js.Object {
    var InstanceCount: ProcessingInstanceCount
    var InstanceType: ProcessingInstanceType
    var VolumeSizeInGB: ProcessingVolumeSizeInGB
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
  }

  /**
    * The constraints resource for a monitoring job.
    */
  @js.native
  @Factory
  trait MonitoringConstraintsResource extends js.Object {
    var S3Uri: js.UndefOr[S3Uri]
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
  @Factory
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

  /**
    * The inputs for a monitoring job.
    */
  @js.native
  @Factory
  trait MonitoringInput extends js.Object {
    var EndpointInput: EndpointInput
  }

  /**
    * Defines the monitoring job.
    */
  @js.native
  @Factory
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

  /**
    * The output object for a monitoring job.
    */
  @js.native
  @Factory
  trait MonitoringOutput extends js.Object {
    var S3Output: MonitoringS3Output
  }

  /**
    * The output configuration for monitoring jobs.
    */
  @js.native
  @Factory
  trait MonitoringOutputConfig extends js.Object {
    var MonitoringOutputs: MonitoringOutputs
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  /**
    * Identifies the resources to deploy for a monitoring job.
    */
  @js.native
  @Factory
  trait MonitoringResources extends js.Object {
    var ClusterConfig: MonitoringClusterConfig
  }

  /**
    * Information about where and how you want to store the results of a monitoring job.
    */
  @js.native
  @Factory
  trait MonitoringS3Output extends js.Object {
    var LocalPath: ProcessingLocalPath
    var S3Uri: MonitoringS3Uri
    var S3UploadMode: js.UndefOr[ProcessingS3UploadMode]
  }

  /**
    * Configures the monitoring schedule and defines the monitoring job.
    */
  @js.native
  @Factory
  trait MonitoringScheduleConfig extends js.Object {
    var MonitoringJobDefinition: MonitoringJobDefinition
    var ScheduleConfig: js.UndefOr[ScheduleConfig]
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
  @Factory
  trait MonitoringScheduleSummary extends js.Object {
    var CreationTime: Timestamp
    var LastModifiedTime: Timestamp
    var MonitoringScheduleArn: MonitoringScheduleArn
    var MonitoringScheduleName: MonitoringScheduleName
    var MonitoringScheduleStatus: ScheduleStatus
    var EndpointName: js.UndefOr[EndpointName]
  }

  /**
    * The statistics resource for a monitoring job.
    */
  @js.native
  @Factory
  trait MonitoringStatisticsResource extends js.Object {
    var S3Uri: js.UndefOr[S3Uri]
  }

  /**
    * A time limit for how long the monitoring job is allowed to run before stopping.
    */
  @js.native
  @Factory
  trait MonitoringStoppingCondition extends js.Object {
    var MaxRuntimeInSeconds: MonitoringMaxRuntimeInSeconds
  }

  /**
    * Defines a list of <code>NestedFilters</code> objects. To satisfy the conditions specified in the <code>NestedFilters</code> call, a resource must satisfy the conditions of all of the filters.
    *  For example, you could define a <code>NestedFilters</code> using the training job's <code>InputDataConfig</code> property to filter on <code>Channel</code> objects.
    *  A <code>NestedFilters</code> object contains multiple filters. For example, to find all training jobs whose name contains <code>train</code> and that have <code>cat/data</code> in their <code>S3Uri</code> (specified in <code>InputDataConfig</code>), you need to create a <code>NestedFilters</code> object that specifies the <code>InputDataConfig</code> property with the following <code>Filter</code> objects:
    * * <code>'{Name:"InputDataConfig.ChannelName", "Operator":"EQUALS", "Value":"train"}',</code>
    *  * <code>'{Name:"InputDataConfig.DataSource.S3DataSource.S3Uri", "Operator":"CONTAINS", "Value":"cat/data"}'</code>
    */
  @js.native
  @Factory
  trait NestedFilters extends js.Object {
    var Filters: FilterList
    var NestedPropertyName: ResourcePropertyName
  }

  /**
    * Networking options for a job, such as network traffic encryption between containers, whether to allow inbound and outbound network calls to and from containers, and the VPC subnets and security groups to use for VPC-enabled jobs.
    */
  @js.native
  @Factory
  trait NetworkConfig extends js.Object {
    var EnableNetworkIsolation: js.UndefOr[Boolean]
    var VpcConfig: js.UndefOr[VpcConfig]
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
  @Factory
  trait NotebookInstanceLifecycleConfigSummary extends js.Object {
    var NotebookInstanceLifecycleConfigArn: NotebookInstanceLifecycleConfigArn
    var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
    var CreationTime: js.UndefOr[CreationTime]
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
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
  @Factory
  trait NotebookInstanceLifecycleHook extends js.Object {
    var Content: js.UndefOr[NotebookInstanceLifecycleConfigContent]
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
  @Factory
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
  @Factory
  trait NotificationConfiguration extends js.Object {
    var NotificationTopicArn: js.UndefOr[NotificationTopicArn]
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
  @Factory
  trait ObjectiveStatusCounters extends js.Object {
    var Failed: js.UndefOr[ObjectiveStatusCounter]
    var Pending: js.UndefOr[ObjectiveStatusCounter]
    var Succeeded: js.UndefOr[ObjectiveStatusCounter]
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
        NotExists
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
  @Factory
  trait OutputConfig extends js.Object {
    var S3OutputLocation: S3Uri
    var TargetDevice: TargetDevice
  }

  /**
    * Provides information about how to store model training results (model artifacts).
    */
  @js.native
  @Factory
  trait OutputDataConfig extends js.Object {
    var S3OutputPath: S3Uri
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  /**
    * Defines the possible values for categorical, continuous, and integer hyperparameters to be used by an algorithm.
    */
  @js.native
  @Factory
  trait ParameterRange extends js.Object {
    var CategoricalParameterRangeSpecification: js.UndefOr[CategoricalParameterRangeSpecification]
    var ContinuousParameterRangeSpecification: js.UndefOr[ContinuousParameterRangeSpecification]
    var IntegerParameterRangeSpecification: js.UndefOr[IntegerParameterRangeSpecification]
  }

  /**
    * Specifies ranges of integer, continuous, and categorical hyperparameters that a hyperparameter tuning job searches. The hyperparameter tuning job launches training jobs with hyperparameter values within these ranges to find the combination of values that result in the training job with the best performance as measured by the objective metric of the hyperparameter tuning job.
    *
    * '''Note:'''You can specify a maximum of 20 hyperparameters that a hyperparameter tuning job can search over. Every possible value of a categorical parameter range counts against this limit.
    */
  @js.native
  @Factory
  trait ParameterRanges extends js.Object {
    var CategoricalParameterRanges: js.UndefOr[CategoricalParameterRanges]
    var ContinuousParameterRanges: js.UndefOr[ContinuousParameterRanges]
    var IntegerParameterRanges: js.UndefOr[IntegerParameterRanges]
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
  @Factory
  trait Parent extends js.Object {
    var ExperimentName: js.UndefOr[ExperimentEntityName]
    var TrialName: js.UndefOr[ExperimentEntityName]
  }

  /**
    * A previously completed or stopped hyperparameter tuning job to be used as a starting point for a new hyperparameter tuning job.
    */
  @js.native
  @Factory
  trait ParentHyperParameterTuningJob extends js.Object {
    var HyperParameterTuningJobName: js.UndefOr[HyperParameterTuningJobName]
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
  @Factory
  trait ProcessingClusterConfig extends js.Object {
    var InstanceCount: ProcessingInstanceCount
    var InstanceType: ProcessingInstanceType
    var VolumeSizeInGB: ProcessingVolumeSizeInGB
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
  }

  /**
    * The inputs for a processing job.
    */
  @js.native
  @Factory
  trait ProcessingInput extends js.Object {
    var InputName: String
    var S3Input: ProcessingS3Input
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
  @Factory
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

  /**
    * Describes the results of a processing job.
    */
  @js.native
  @Factory
  trait ProcessingOutput extends js.Object {
    var OutputName: String
    var S3Output: ProcessingS3Output
  }

  /**
    * The output configuration for the processing job.
    */
  @js.native
  @Factory
  trait ProcessingOutputConfig extends js.Object {
    var Outputs: ProcessingOutputs
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  /**
    * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In distributed training, you specify more than one instance.
    */
  @js.native
  @Factory
  trait ProcessingResources extends js.Object {
    var ClusterConfig: ProcessingClusterConfig
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
  @Factory
  trait ProcessingS3Input extends js.Object {
    var LocalPath: ProcessingLocalPath
    var S3DataType: ProcessingS3DataType
    var S3InputMode: ProcessingS3InputMode
    var S3Uri: S3Uri
    var S3CompressionType: js.UndefOr[ProcessingS3CompressionType]
    var S3DataDistributionType: js.UndefOr[ProcessingS3DataDistributionType]
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
  @Factory
  trait ProcessingS3Output extends js.Object {
    var LocalPath: ProcessingLocalPath
    var S3UploadMode: ProcessingS3UploadMode
    var S3Uri: S3Uri
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
  @Factory
  trait ProcessingStoppingCondition extends js.Object {
    var MaxRuntimeInSeconds: ProcessingMaxRuntimeInSeconds
  }

  /**
    * Identifies a model that you want to host and the resources to deploy for hosting it. If you are deploying multiple models, tell Amazon SageMaker how to distribute traffic among the models by specifying variant weights.
    */
  @js.native
  @Factory
  trait ProductionVariant extends js.Object {
    var InitialInstanceCount: TaskCount
    var InstanceType: ProductionVariantInstanceType
    var ModelName: ModelName
    var VariantName: VariantName
    var AcceleratorType: js.UndefOr[ProductionVariantAcceleratorType]
    var InitialVariantWeight: js.UndefOr[VariantWeight]
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
  @Factory
  trait ProductionVariantSummary extends js.Object {
    var VariantName: VariantName
    var CurrentInstanceCount: js.UndefOr[TaskCount]
    var CurrentWeight: js.UndefOr[VariantWeight]
    var DeployedImages: js.UndefOr[DeployedImages]
    var DesiredInstanceCount: js.UndefOr[TaskCount]
    var DesiredWeight: js.UndefOr[VariantWeight]
  }

  /**
    * Part of the <code>SuggestionQuery</code> type. Specifies a hint for retrieving property names that begin with the specified text.
    */
  @js.native
  @Factory
  trait PropertyNameQuery extends js.Object {
    var PropertyNameHint: PropertyNameHint
  }

  /**
    * A property name returned from a <code>GetSearchSuggestions</code> call that specifies a value in the <code>PropertyNameQuery</code> field.
    */
  @js.native
  @Factory
  trait PropertyNameSuggestion extends js.Object {
    var PropertyName: js.UndefOr[ResourcePropertyName]
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
  @Factory
  trait PublicWorkforceTaskPrice extends js.Object {
    var AmountInUsd: js.UndefOr[USD]
  }

  @js.native
  sealed trait RecordWrapper extends js.Any
  object RecordWrapper extends js.Object {
    val None     = "None".asInstanceOf[RecordWrapper]
    val RecordIO = "RecordIO".asInstanceOf[RecordWrapper]

    val values = js.Object.freeze(js.Array(None, RecordIO))
  }

  @js.native
  @Factory
  trait RenderUiTemplateRequest extends js.Object {
    var RoleArn: RoleArn
    var Task: RenderableTask
    var UiTemplate: UiTemplate
  }

  @js.native
  @Factory
  trait RenderUiTemplateResponse extends js.Object {
    var Errors: RenderingErrorList
    var RenderedContent: String
  }

  /**
    * Contains input values for a task.
    */
  @js.native
  @Factory
  trait RenderableTask extends js.Object {
    var Input: TaskInput
  }

  /**
    * A description of an error that occurred while rendering the template.
    */
  @js.native
  @Factory
  trait RenderingError extends js.Object {
    var Code: String
    var Message: String
  }

  /**
    * The resolved attributes.
    */
  @js.native
  @Factory
  trait ResolvedAttributes extends js.Object {
    var AutoMLJobObjective: js.UndefOr[AutoMLJobObjective]
    var CompletionCriteria: js.UndefOr[AutoMLJobCompletionCriteria]
    var ProblemType: js.UndefOr[ProblemType]
  }

  /**
    * Describes the resources, including ML compute instances and ML storage volumes, to use for model training.
    */
  @js.native
  @Factory
  trait ResourceConfig extends js.Object {
    var InstanceCount: TrainingInstanceCount
    var InstanceType: TrainingInstanceType
    var VolumeSizeInGB: VolumeSizeInGB
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
  }

  /**
    * Specifies the maximum number of training jobs and parallel training jobs that a hyperparameter tuning job can launch.
    */
  @js.native
  @Factory
  trait ResourceLimits extends js.Object {
    var MaxNumberOfTrainingJobs: MaxNumberOfTrainingJobs
    var MaxParallelTrainingJobs: MaxParallelTrainingJobs
  }

  /**
    * The instance type and quantity.
    */
  @js.native
  @Factory
  trait ResourceSpec extends js.Object {
    var EnvironmentArn: js.UndefOr[EnvironmentArn]
    var InstanceType: js.UndefOr[AppInstanceType]
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
    * The retention policy.
    */
  @js.native
  @Factory
  trait RetentionPolicy extends js.Object {
    var HomeEfsFileSystem: js.UndefOr[RetentionType]
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
  @Factory
  trait S3DataSource extends js.Object {
    var S3DataType: S3DataType
    var S3Uri: S3Uri
    var AttributeNames: js.UndefOr[AttributeNames]
    var S3DataDistributionType: js.UndefOr[S3DataDistribution]
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
  @Factory
  trait ScheduleConfig extends js.Object {
    var ScheduleExpression: ScheduleExpression
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
    * * A list of <code>Filter</code> objects. Each filter defines a simple Boolean expression comprised of a resource property name, Boolean operator, and value. A <code>SearchExpression</code> can include only one <code>Contains</code> operator.
    *  * A list of <code>NestedFilter</code> objects. Each nested filter defines a list of Boolean expressions using a list of resource properties. A nested filter is satisfied if a single object in the list satisfies all Boolean expressions.
    *  * A list of <code>SearchExpression</code> objects. A search expression object can be nested in a list of search expression objects.
    *  * A Boolean operator: <code>And</code> or <code>Or</code>.
    */
  @js.native
  @Factory
  trait SearchExpression extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var NestedFilters: js.UndefOr[NestedFiltersList]
    var Operator: js.UndefOr[BooleanOperator]
    var SubExpressions: js.UndefOr[SearchExpressionList]
  }

  /**
    * An individual search result record that contains a single resource object.
    */
  @js.native
  @Factory
  trait SearchRecord extends js.Object {
    var Experiment: js.UndefOr[Experiment]
    var TrainingJob: js.UndefOr[TrainingJob]
    var Trial: js.UndefOr[Trial]
    var TrialComponent: js.UndefOr[TrialComponent]
  }

  @js.native
  @Factory
  trait SearchRequest extends js.Object {
    var Resource: ResourceType
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SearchExpression: js.UndefOr[SearchExpression]
    var SortBy: js.UndefOr[ResourcePropertyName]
    var SortOrder: js.UndefOr[SearchSortOrder]
  }

  @js.native
  @Factory
  trait SearchResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Results: js.UndefOr[SearchResultsList]
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
  @Factory
  trait SecondaryStatusTransition extends js.Object {
    var StartTime: Timestamp
    var Status: SecondaryStatus
    var EndTime: js.UndefOr[Timestamp]
    var StatusMessage: js.UndefOr[StatusMessage]
  }

  /**
    * The sharing settings.
    */
  @js.native
  @Factory
  trait SharingSettings extends js.Object {
    var NotebookOutputOption: js.UndefOr[NotebookOutputOption]
    var S3KmsKeyId: js.UndefOr[KmsKeyId]
    var S3OutputPath: js.UndefOr[S3Uri]
  }

  /**
    * A configuration for a shuffle option for input data in a channel. If you use <code>S3Prefix</code> for <code>S3DataType</code>, the results of the S3 key prefix matches are shuffled. If you use <code>ManifestFile</code>, the order of the S3 object references in the <code>ManifestFile</code> is shuffled. If you use <code>AugmentedManifestFile</code>, the order of the JSON lines in the <code>AugmentedManifestFile</code> is shuffled. The shuffling order is determined using the <code>Seed</code> value.
    *  For Pipe input mode, when <code>ShuffleConfig</code> is specified shuffling is done at the start of every epoch. With large datasets, this ensures that the order of the training data is different for each epoch, and it helps reduce bias and possible overfitting. In a multi-node training job when <code>ShuffleConfig</code> is combined with <code>S3DataDistributionType</code> of <code>ShardedByS3Key</code>, the data is shuffled across nodes so that the content sent to a particular node on the first epoch might be sent to a different node on the second epoch.
    */
  @js.native
  @Factory
  trait ShuffleConfig extends js.Object {
    var Seed: Seed
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
  @Factory
  trait SourceAlgorithm extends js.Object {
    var AlgorithmName: ArnOrName
    var ModelDataUrl: js.UndefOr[Url]
  }

  /**
    * A list of algorithms that were used to create a model package.
    */
  @js.native
  @Factory
  trait SourceAlgorithmSpecification extends js.Object {
    var SourceAlgorithms: SourceAlgorithmList
  }

  /**
    * A list of IP address ranges ([[https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html|CIDRs]]). Used to create an allow list of IP addresses for a private workforce. For more information, see .
    */
  @js.native
  @Factory
  trait SourceIpConfig extends js.Object {
    var Cidrs: Cidrs
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
  @Factory
  trait StartMonitoringScheduleRequest extends js.Object {
    var MonitoringScheduleName: MonitoringScheduleName
  }

  @js.native
  @Factory
  trait StartNotebookInstanceInput extends js.Object {
    var NotebookInstanceName: NotebookInstanceName
  }

  @js.native
  @Factory
  trait StopAutoMLJobRequest extends js.Object {
    var AutoMLJobName: AutoMLJobName
  }

  @js.native
  @Factory
  trait StopCompilationJobRequest extends js.Object {
    var CompilationJobName: EntityName
  }

  @js.native
  @Factory
  trait StopHyperParameterTuningJobRequest extends js.Object {
    var HyperParameterTuningJobName: HyperParameterTuningJobName
  }

  @js.native
  @Factory
  trait StopLabelingJobRequest extends js.Object {
    var LabelingJobName: LabelingJobName
  }

  @js.native
  @Factory
  trait StopMonitoringScheduleRequest extends js.Object {
    var MonitoringScheduleName: MonitoringScheduleName
  }

  @js.native
  @Factory
  trait StopNotebookInstanceInput extends js.Object {
    var NotebookInstanceName: NotebookInstanceName
  }

  @js.native
  @Factory
  trait StopProcessingJobRequest extends js.Object {
    var ProcessingJobName: ProcessingJobName
  }

  @js.native
  @Factory
  trait StopTrainingJobRequest extends js.Object {
    var TrainingJobName: TrainingJobName
  }

  @js.native
  @Factory
  trait StopTransformJobRequest extends js.Object {
    var TransformJobName: TransformJobName
  }

  /**
    * Specifies a limit to how long a model training or compilation job can run. It also specifies how long you are willing to wait for a managed spot training job to complete. When the job reaches the time limit, Amazon SageMaker ends the training or compilation job. Use this API to cap model training costs.
    *  To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal, which delays job termination for 120 seconds. Algorithms can use this 120-second window to save the model artifacts, so the results of training are not lost.
    *  The training algorithms provided by Amazon SageMaker automatically save the intermediate results of a model training job when possible. This attempt to save artifacts is only a best effort case as model might not be in a state from which it can be saved. For example, if training has just started, the model might not be ready to save. When saved, this intermediate data is a valid model artifact. You can use it to create a model with <code>CreateModel</code>.
    *
    * '''Note:'''The Neural Topic Model (NTM) currently does not support saving intermediate model artifacts. When training NTMs, make sure that the maximum runtime is sufficient for the training job to complete.
    */
  @js.native
  @Factory
  trait StoppingCondition extends js.Object {
    var MaxRuntimeInSeconds: js.UndefOr[MaxRuntimeInSeconds]
    var MaxWaitTimeInSeconds: js.UndefOr[MaxWaitTimeInSeconds]
  }

  /**
    * Describes a work team of a vendor that does the a labelling job.
    */
  @js.native
  @Factory
  trait SubscribedWorkteam extends js.Object {
    var WorkteamArn: WorkteamArn
    var ListingId: js.UndefOr[String]
    var MarketplaceDescription: js.UndefOr[String200]
    var MarketplaceTitle: js.UndefOr[String200]
    var SellerName: js.UndefOr[String]
  }

  /**
    * Specified in the <a>GetSearchSuggestions</a> request. Limits the property names that are included in the response.
    */
  @js.native
  @Factory
  trait SuggestionQuery extends js.Object {
    var PropertyNameQuery: js.UndefOr[PropertyNameQuery]
  }

  /**
    * Describes a tag.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  @js.native
  sealed trait TargetDevice extends js.Any
  object TargetDevice extends js.Object {
    val lambda      = "lambda".asInstanceOf[TargetDevice]
    val ml_m4       = "ml_m4".asInstanceOf[TargetDevice]
    val ml_m5       = "ml_m5".asInstanceOf[TargetDevice]
    val ml_c4       = "ml_c4".asInstanceOf[TargetDevice]
    val ml_c5       = "ml_c5".asInstanceOf[TargetDevice]
    val ml_p2       = "ml_p2".asInstanceOf[TargetDevice]
    val ml_p3       = "ml_p3".asInstanceOf[TargetDevice]
    val ml_inf1     = "ml_inf1".asInstanceOf[TargetDevice]
    val jetson_tx1  = "jetson_tx1".asInstanceOf[TargetDevice]
    val jetson_tx2  = "jetson_tx2".asInstanceOf[TargetDevice]
    val jetson_nano = "jetson_nano".asInstanceOf[TargetDevice]
    val rasp3b      = "rasp3b".asInstanceOf[TargetDevice]
    val deeplens    = "deeplens".asInstanceOf[TargetDevice]
    val rk3399      = "rk3399".asInstanceOf[TargetDevice]
    val rk3288      = "rk3288".asInstanceOf[TargetDevice]
    val aisage      = "aisage".asInstanceOf[TargetDevice]
    val sbe_c       = "sbe_c".asInstanceOf[TargetDevice]
    val qcs605      = "qcs605".asInstanceOf[TargetDevice]
    val qcs603      = "qcs603".asInstanceOf[TargetDevice]

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

  /**
    * The TensorBoard app settings.
    */
  @js.native
  @Factory
  trait TensorBoardAppSettings extends js.Object {
    var DefaultResourceSpec: js.UndefOr[ResourceSpec]
  }

  /**
    * Configuration of storage locations for TensorBoard output.
    */
  @js.native
  @Factory
  trait TensorBoardOutputConfig extends js.Object {
    var S3OutputPath: S3Uri
    var LocalPath: js.UndefOr[DirectoryPath]
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
        `ml.c5.18xlarge`
      )
    )
  }

  /**
    * Contains information about a training job.
    */
  @js.native
  @Factory
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

  /**
    * Defines the input needed to run a training job using the algorithm.
    */
  @js.native
  @Factory
  trait TrainingJobDefinition extends js.Object {
    var InputDataConfig: InputDataConfig
    var OutputDataConfig: OutputDataConfig
    var ResourceConfig: ResourceConfig
    var StoppingCondition: StoppingCondition
    var TrainingInputMode: TrainingInputMode
    var HyperParameters: js.UndefOr[HyperParameters]
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
  @Factory
  trait TrainingJobStatusCounters extends js.Object {
    var Completed: js.UndefOr[TrainingJobStatusCounter]
    var InProgress: js.UndefOr[TrainingJobStatusCounter]
    var NonRetryableError: js.UndefOr[TrainingJobStatusCounter]
    var RetryableError: js.UndefOr[TrainingJobStatusCounter]
    var Stopped: js.UndefOr[TrainingJobStatusCounter]
  }

  /**
    * Provides summary information about a training job.
    */
  @js.native
  @Factory
  trait TrainingJobSummary extends js.Object {
    var CreationTime: Timestamp
    var TrainingJobArn: TrainingJobArn
    var TrainingJobName: TrainingJobName
    var TrainingJobStatus: TrainingJobStatus
    var LastModifiedTime: js.UndefOr[Timestamp]
    var TrainingEndTime: js.UndefOr[Timestamp]
  }

  /**
    * Defines how the algorithm is used for a training job.
    */
  @js.native
  @Factory
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

  /**
    * Describes the location of the channel data.
    */
  @js.native
  @Factory
  trait TransformDataSource extends js.Object {
    var S3DataSource: TransformS3DataSource
  }

  /**
    * Describes the input source of a transform job and the way the transform job consumes it.
    */
  @js.native
  @Factory
  trait TransformInput extends js.Object {
    var DataSource: TransformDataSource
    var CompressionType: js.UndefOr[CompressionType]
    var ContentType: js.UndefOr[ContentType]
    var SplitType: js.UndefOr[SplitType]
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
  @Factory
  trait TransformJobDefinition extends js.Object {
    var TransformInput: TransformInput
    var TransformOutput: TransformOutput
    var TransformResources: TransformResources
    var BatchStrategy: js.UndefOr[BatchStrategy]
    var Environment: js.UndefOr[TransformEnvironmentMap]
    var MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms]
    var MaxPayloadInMB: js.UndefOr[MaxPayloadInMB]
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
  @Factory
  trait TransformJobSummary extends js.Object {
    var CreationTime: Timestamp
    var TransformJobArn: TransformJobArn
    var TransformJobName: TransformJobName
    var TransformJobStatus: TransformJobStatus
    var FailureReason: js.UndefOr[FailureReason]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var TransformEndTime: js.UndefOr[Timestamp]
  }

  /**
    * Describes the results of a transform job.
    */
  @js.native
  @Factory
  trait TransformOutput extends js.Object {
    var S3OutputPath: S3Uri
    var Accept: js.UndefOr[Accept]
    var AssembleWith: js.UndefOr[AssemblyType]
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  /**
    * Describes the resources, including ML instance types and ML instance count, to use for transform job.
    */
  @js.native
  @Factory
  trait TransformResources extends js.Object {
    var InstanceCount: TransformInstanceCount
    var InstanceType: TransformInstanceType
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
  }

  /**
    * Describes the S3 data source.
    */
  @js.native
  @Factory
  trait TransformS3DataSource extends js.Object {
    var S3DataType: S3DataType
    var S3Uri: S3Uri
  }

  /**
    * A summary of the properties of a trial as returned by the <a>Search</a> API.
    */
  @js.native
  @Factory
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

  /**
    * A summary of the properties of a trial component as returned by the <a>Search</a> API.
    */
  @js.native
  @Factory
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

  /**
    * Represents an input or output artifact of a trial component. You specify <code>TrialComponentArtifact</code> as part of the <code>InputArtifacts</code> and <code>OutputArtifacts</code> parameters in the <a>CreateTrialComponent</a> request.
    *  Examples of input artifacts are datasets, algorithms, hyperparameters, source code, and instance types. Examples of output artifacts are metrics, snapshots, logs, and images.
    */
  @js.native
  @Factory
  trait TrialComponentArtifact extends js.Object {
    var Value: TrialComponentArtifactValue
    var MediaType: js.UndefOr[MediaType]
  }

  /**
    * A summary of the metrics of a trial component.
    */
  @js.native
  @Factory
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

  /**
    * The value of a hyperparameter. Only one of <code>NumberValue</code> or <code>StringValue</code> can be specified.
    *  This object is specified in the <a>CreateTrialComponent</a> request.
    */
  @js.native
  @Factory
  trait TrialComponentParameterValue extends js.Object {
    var NumberValue: js.UndefOr[DoubleParameterValue]
    var StringValue: js.UndefOr[StringParameterValue]
  }

  @js.native
  sealed trait TrialComponentPrimaryStatus extends js.Any
  object TrialComponentPrimaryStatus extends js.Object {
    val InProgress = "InProgress".asInstanceOf[TrialComponentPrimaryStatus]
    val Completed  = "Completed".asInstanceOf[TrialComponentPrimaryStatus]
    val Failed     = "Failed".asInstanceOf[TrialComponentPrimaryStatus]

    val values = js.Object.freeze(js.Array(InProgress, Completed, Failed))
  }

  /**
    * A short summary of a trial component.
    */
  @js.native
  @Factory
  trait TrialComponentSimpleSummary extends js.Object {
    var CreatedBy: js.UndefOr[UserContext]
    var CreationTime: js.UndefOr[Timestamp]
    var TrialComponentArn: js.UndefOr[TrialComponentArn]
    var TrialComponentName: js.UndefOr[ExperimentEntityName]
    var TrialComponentSource: js.UndefOr[TrialComponentSource]
  }

  /**
    * The source of the trial component.
    */
  @js.native
  @Factory
  trait TrialComponentSource extends js.Object {
    var SourceArn: TrialComponentSourceArn
    var SourceType: js.UndefOr[SourceType]
  }

  /**
    * Detailed information about the source of a trial component.
    */
  @js.native
  @Factory
  trait TrialComponentSourceDetail extends js.Object {
    var SourceArn: js.UndefOr[TrialComponentSourceArn]
    var TrainingJob: js.UndefOr[TrainingJob]
  }

  /**
    * The status of the trial component.
    */
  @js.native
  @Factory
  trait TrialComponentStatus extends js.Object {
    var Message: js.UndefOr[TrialComponentStatusMessage]
    var PrimaryStatus: js.UndefOr[TrialComponentPrimaryStatus]
  }

  /**
    * A summary of the properties of a trial component. To get all the properties, call the <a>DescribeTrialComponent</a> API and provide the <code>TrialComponentName</code>.
    */
  @js.native
  @Factory
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

  /**
    * The source of the trial.
    */
  @js.native
  @Factory
  trait TrialSource extends js.Object {
    var SourceArn: TrialSourceArn
    var SourceType: js.UndefOr[SourceType]
  }

  /**
    * A summary of the properties of a trial. To get the complete set of properties, call the <a>DescribeTrial</a> API and provide the <code>TrialName</code>.
    */
  @js.native
  @Factory
  trait TrialSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DisplayName: js.UndefOr[ExperimentEntityName]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var TrialArn: js.UndefOr[TrialArn]
    var TrialName: js.UndefOr[ExperimentEntityName]
    var TrialSource: js.UndefOr[TrialSource]
  }

  /**
    * The job completion criteria.
    */
  @js.native
  @Factory
  trait TuningJobCompletionCriteria extends js.Object {
    var TargetObjectiveMetricValue: TargetObjectiveMetricValue
  }

  /**
    * Represents an amount of money in United States dollars/
    */
  @js.native
  @Factory
  trait USD extends js.Object {
    var Cents: js.UndefOr[Cents]
    var Dollars: js.UndefOr[Dollars]
    var TenthFractionsOfACent: js.UndefOr[TenthFractionsOfACent]
  }

  /**
    * Provided configuration information for the worker UI for a labeling job.
    */
  @js.native
  @Factory
  trait UiConfig extends js.Object {
    var UiTemplateS3Uri: S3Uri
  }

  /**
    * The Liquid template for the worker user interface.
    */
  @js.native
  @Factory
  trait UiTemplate extends js.Object {
    var Content: TemplateContent
  }

  /**
    * Container for user interface template information.
    */
  @js.native
  @Factory
  trait UiTemplateInfo extends js.Object {
    var ContentSha256: js.UndefOr[TemplateContentSha256]
    var Url: js.UndefOr[TemplateUrl]
  }

  @js.native
  @Factory
  trait UpdateCodeRepositoryInput extends js.Object {
    var CodeRepositoryName: EntityName
    var GitConfig: js.UndefOr[GitConfigForUpdate]
  }

  @js.native
  @Factory
  trait UpdateCodeRepositoryOutput extends js.Object {
    var CodeRepositoryArn: CodeRepositoryArn
  }

  @js.native
  @Factory
  trait UpdateDomainRequest extends js.Object {
    var DomainId: DomainId
    var DefaultUserSettings: js.UndefOr[UserSettings]
  }

  @js.native
  @Factory
  trait UpdateDomainResponse extends js.Object {
    var DomainArn: js.UndefOr[DomainArn]
  }

  @js.native
  @Factory
  trait UpdateEndpointInput extends js.Object {
    var EndpointConfigName: EndpointConfigName
    var EndpointName: EndpointName
  }

  @js.native
  @Factory
  trait UpdateEndpointOutput extends js.Object {
    var EndpointArn: EndpointArn
  }

  @js.native
  @Factory
  trait UpdateEndpointWeightsAndCapacitiesInput extends js.Object {
    var DesiredWeightsAndCapacities: DesiredWeightAndCapacityList
    var EndpointName: EndpointName
  }

  @js.native
  @Factory
  trait UpdateEndpointWeightsAndCapacitiesOutput extends js.Object {
    var EndpointArn: EndpointArn
  }

  @js.native
  @Factory
  trait UpdateExperimentRequest extends js.Object {
    var ExperimentName: ExperimentEntityName
    var Description: js.UndefOr[ExperimentDescription]
    var DisplayName: js.UndefOr[ExperimentEntityName]
  }

  @js.native
  @Factory
  trait UpdateExperimentResponse extends js.Object {
    var ExperimentArn: js.UndefOr[ExperimentArn]
  }

  @js.native
  @Factory
  trait UpdateMonitoringScheduleRequest extends js.Object {
    var MonitoringScheduleConfig: MonitoringScheduleConfig
    var MonitoringScheduleName: MonitoringScheduleName
  }

  @js.native
  @Factory
  trait UpdateMonitoringScheduleResponse extends js.Object {
    var MonitoringScheduleArn: MonitoringScheduleArn
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait UpdateNotebookInstanceLifecycleConfigInput extends js.Object {
    var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
    var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList]
    var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList]
  }

  @js.native
  @Factory
  trait UpdateNotebookInstanceLifecycleConfigOutput extends js.Object {}

  @js.native
  @Factory
  trait UpdateNotebookInstanceOutput extends js.Object {}

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait UpdateTrialComponentResponse extends js.Object {
    var TrialComponentArn: js.UndefOr[TrialComponentArn]
  }

  @js.native
  @Factory
  trait UpdateTrialRequest extends js.Object {
    var TrialName: ExperimentEntityName
    var DisplayName: js.UndefOr[ExperimentEntityName]
  }

  @js.native
  @Factory
  trait UpdateTrialResponse extends js.Object {
    var TrialArn: js.UndefOr[TrialArn]
  }

  @js.native
  @Factory
  trait UpdateUserProfileRequest extends js.Object {
    var DomainId: DomainId
    var UserProfileName: UserProfileName
    var UserSettings: js.UndefOr[UserSettings]
  }

  @js.native
  @Factory
  trait UpdateUserProfileResponse extends js.Object {
    var UserProfileArn: js.UndefOr[UserProfileArn]
  }

  @js.native
  @Factory
  trait UpdateWorkforceRequest extends js.Object {
    var WorkforceName: WorkforceName
    var SourceIpConfig: js.UndefOr[SourceIpConfig]
  }

  @js.native
  @Factory
  trait UpdateWorkforceResponse extends js.Object {
    var Workforce: Workforce
  }

  @js.native
  @Factory
  trait UpdateWorkteamRequest extends js.Object {
    var WorkteamName: WorkteamName
    var Description: js.UndefOr[String200]
    var MemberDefinitions: js.UndefOr[MemberDefinitions]
    var NotificationConfiguration: js.UndefOr[NotificationConfiguration]
  }

  @js.native
  @Factory
  trait UpdateWorkteamResponse extends js.Object {
    var Workteam: Workteam
  }

  /**
    * Information about the user who created or modified an experiment, trial, or trial component.
    */
  @js.native
  @Factory
  trait UserContext extends js.Object {
    var DomainId: js.UndefOr[String]
    var UserProfileArn: js.UndefOr[String]
    var UserProfileName: js.UndefOr[String]
  }

  /**
    * The user profile details.
    */
  @js.native
  @Factory
  trait UserProfileDetails extends js.Object {
    var CreationTime: js.UndefOr[CreationTime]
    var DomainId: js.UndefOr[DomainId]
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
    var Status: js.UndefOr[UserProfileStatus]
    var UserProfileName: js.UndefOr[UserProfileName]
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
  @Factory
  trait UserSettings extends js.Object {
    var ExecutionRole: js.UndefOr[RoleArn]
    var JupyterServerAppSettings: js.UndefOr[JupyterServerAppSettings]
    var KernelGatewayAppSettings: js.UndefOr[KernelGatewayAppSettings]
    var SecurityGroups: js.UndefOr[SecurityGroupIds]
    var SharingSettings: js.UndefOr[SharingSettings]
    var TensorBoardAppSettings: js.UndefOr[TensorBoardAppSettings]
  }

  /**
    * Specifies a VPC that your training jobs and hosted models have access to. Control access to and from your training and model containers by configuring the VPC. For more information, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html|Protect Endpoints by Using an Amazon Virtual Private Cloud]] and [[https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html|Protect Training Jobs by Using an Amazon Virtual Private Cloud]].
    */
  @js.native
  @Factory
  trait VpcConfig extends js.Object {
    var SecurityGroupIds: VpcSecurityGroupIds
    var Subnets: Subnets
  }

  /**
    * A single private workforce, which is automatically created when you create your first private work team. You can create one private work force in each AWS Region. By default, any workforce related API operation used in a specific region will apply to the workforce created in that region. To learn how to create a private workforce, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-create-private.html|Create a Private Workforce]].
    */
  @js.native
  @Factory
  trait Workforce extends js.Object {
    var WorkforceArn: WorkforceArn
    var WorkforceName: WorkforceName
    var LastUpdatedDate: js.UndefOr[Timestamp]
    var SourceIpConfig: js.UndefOr[SourceIpConfig]
  }

  /**
    * Provides details about a labeling work team.
    */
  @js.native
  @Factory
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
}
