package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object sagemaker {
  type Accept = String
  type AccountId = String
  type ActionArn = String
  type ActionSummaries = js.Array[ActionSummary]
  type AdditionalCodeRepositoryNamesOrUrls = js.Array[CodeRepositoryNameOrUrl]
  type AgentVersions = js.Array[AgentVersion]
  type AlarmList = js.Array[Alarm]
  type AlarmName = String
  type AlgorithmArn = String
  type AlgorithmImage = String
  type AlgorithmStatusItemList = js.Array[AlgorithmStatusItem]
  type AlgorithmSummaryList = js.Array[AlgorithmSummary]
  type AlgorithmValidationProfiles = js.Array[AlgorithmValidationProfile]
  type AppArn = String
  type AppImageConfigArn = String
  type AppImageConfigList = js.Array[AppImageConfigDetails]
  type AppImageConfigName = String
  type AppList = js.Array[AppDetails]
  type AppManaged = Boolean
  type AppName = String
  type ApprovalDescription = String
  type ArnOrName = String
  type ArtifactArn = String
  type ArtifactDigest = String
  type ArtifactSourceTypes = js.Array[ArtifactSourceType]
  type ArtifactSummaries = js.Array[ArtifactSummary]
  type AssociationEntityArn = String
  type AssociationSummaries = js.Array[AssociationSummary]
  type AthenaCatalog = String
  type AthenaDatabase = String
  type AthenaQueryString = String
  type AthenaWorkGroup = String
  type AttributeName = String
  type AttributeNames = js.Array[AttributeName]
  type AutoMLCandidates = js.Array[AutoMLCandidate]
  type AutoMLContainerDefinitions = js.Array[AutoMLContainerDefinition]
  type AutoMLFailureReason = String
  type AutoMLInputDataConfig = js.Array[AutoMLChannel]
  type AutoMLJobArn = String
  type AutoMLJobName = String
  type AutoMLJobSummaries = js.Array[AutoMLJobSummary]
  type AutoMLMaxResults = Int
  type AutoMLNameContains = String
  type AutoMLPartialFailureReasons = js.Array[AutoMLPartialFailureReason]
  type BillableTimeInSeconds = Int
  type BlockedReason = String
  type Branch = String
  type CandidateDefinitionNotebookLocation = String
  type CandidateName = String
  type CandidateStepArn = String
  type CandidateStepName = String
  type CandidateSteps = js.Array[AutoMLCandidateStep]
  type CapacitySizeValue = Int
  type CaptureOptionList = js.Array[CaptureOption]
  type Catalog = String
  type CategoricalParameterRanges = js.Array[CategoricalParameterRange]
  type Cents = Int
  type CertifyForMarketplace = Boolean
  type ChannelName = String
  type ChannelSpecifications = js.Array[ChannelSpecification]
  type Cidr = String
  type Cidrs = js.Array[Cidr]
  type ClientId = String
  type ClientSecret = String
  type ClientToken = String
  type CodeRepositoryArn = String
  type CodeRepositoryContains = String
  type CodeRepositoryNameContains = String
  type CodeRepositoryNameOrUrl = String
  type CodeRepositorySummaryList = js.Array[CodeRepositorySummary]
  type CognitoUserGroup = String
  type CognitoUserPool = String
  type CollectionConfigurations = js.Array[CollectionConfiguration]
  type CollectionName = String
  type CollectionParameters = js.Dictionary[ConfigValue]
  type CompilationJobArn = String
  type CompilationJobSummaries = js.Array[CompilationJobSummary]
  type CompilerOptions = String
  type CompressionTypes = js.Array[CompressionType]
  type ConfigKey = String
  type ConfigValue = String
  type ContainerArgument = String
  type ContainerArguments = js.Array[ContainerArgument]
  type ContainerDefinitionList = js.Array[ContainerDefinition]
  type ContainerEntrypoint = js.Array[ContainerEntrypointString]
  type ContainerEntrypointString = String
  type ContainerHostname = String
  type ContainerImage = String
  type ContentClassifiers = js.Array[ContentClassifier]
  type ContentDigest = String
  type ContentType = String
  type ContentTypes = js.Array[ContentType]
  type ContextArn = String
  type ContextSummaries = js.Array[ContextSummary]
  type ContinuousParameterRanges = js.Array[ContinuousParameterRange]
  type CreationTime = js.Date
  type CsvContentType = String
  type CsvContentTypes = js.Array[CsvContentType]
  type CustomImages = js.Array[CustomImage]
  type DataExplorationNotebookLocation = String
  type DataInputConfig = String
  type Database = String
  type DebugRuleConfigurations = js.Array[DebugRuleConfiguration]
  type DebugRuleEvaluationStatuses = js.Array[DebugRuleEvaluationStatus]
  type DefaultGid = Int
  type DefaultUid = Int
  type DeployedImages = js.Array[DeployedImage]
  type Description = String
  type DesiredWeightAndCapacityList = js.Array[DesiredWeightAndCapacity]
  type DestinationS3Uri = String
  type DeviceArn = String
  type DeviceDescription = String
  type DeviceFleetArn = String
  type DeviceFleetDescription = String
  type DeviceFleetSummaries = js.Array[DeviceFleetSummary]
  type DeviceName = String
  type DeviceNames = js.Array[DeviceName]
  type DeviceSummaries = js.Array[DeviceSummary]
  type Devices = js.Array[Device]
  type DirectoryPath = String
  type DisableProfiler = Boolean
  type DisassociateAdditionalCodeRepositories = Boolean
  type DisassociateDefaultCodeRepository = Boolean
  type DisassociateNotebookInstanceAcceleratorTypes = Boolean
  type DisassociateNotebookInstanceLifecycleConfig = Boolean
  type Dollars = Int
  type DomainArn = String
  type DomainId = String
  type DomainList = js.Array[DomainDetails]
  type DomainName = String
  type DoubleParameterValue = Double
  type EdgeModelStats = js.Array[EdgeModelStat]
  type EdgeModelSummaries = js.Array[EdgeModelSummary]
  type EdgeModels = js.Array[EdgeModel]
  type EdgePackagingJobArn = String
  type EdgePackagingJobSummaries = js.Array[EdgePackagingJobSummary]
  type EdgeVersion = String
  type EfsUid = String
  type EnableCapture = Boolean
  type EndpointArn = String
  type EndpointConfigArn = String
  type EndpointConfigName = String
  type EndpointConfigNameContains = String
  type EndpointConfigSummaryList = js.Array[EndpointConfigSummary]
  type EndpointName = String
  type EndpointNameContains = String
  type EndpointSummaryList = js.Array[EndpointSummary]
  type EntityDescription = String
  type EntityName = String
  type EnvironmentKey = String
  type EnvironmentMap = js.Dictionary[EnvironmentValue]
  type EnvironmentValue = String
  type ExitMessage = String
  type ExperimentArn = String
  type ExperimentDescription = String
  type ExperimentEntityName = String
  type ExperimentSourceArn = String
  type ExperimentSummaries = js.Array[ExperimentSummary]
  type ExpiresInSeconds = Int
  type ExplainabilityLocation = String
  type FailureReason = String
  type FeatureDefinitions = js.Array[FeatureDefinition]
  type FeatureGroupArn = String
  type FeatureGroupMaxResults = Int
  type FeatureGroupName = String
  type FeatureGroupNameContains = String
  type FeatureGroupSummaries = js.Array[FeatureGroupSummary]
  type FeatureName = String
  type FileSystemId = String
  type FilterList = js.Array[Filter]
  type FilterValue = String
  type FinalMetricDataList = js.Array[MetricData]
  type FlowDefinitionArn = String
  type FlowDefinitionName = String
  type FlowDefinitionSummaries = js.Array[FlowDefinitionSummary]
  type FlowDefinitionTaskAvailabilityLifetimeInSeconds = Int
  type FlowDefinitionTaskCount = Int
  type FlowDefinitionTaskDescription = String
  type FlowDefinitionTaskKeyword = String
  type FlowDefinitionTaskKeywords = js.Array[FlowDefinitionTaskKeyword]
  type FlowDefinitionTaskTimeLimitInSeconds = Int
  type FlowDefinitionTaskTitle = String
  type FrameworkVersion = String
  type GenerateCandidateDefinitionsOnly = Boolean
  type GitConfigUrl = String
  type Group = String
  type Groups = js.Array[Group]
  type HookParameters = js.Dictionary[ConfigValue]
  type HumanLoopActivationConditions = String
  type HumanTaskUiArn = String
  type HumanTaskUiName = String
  type HumanTaskUiSummaries = js.Array[HumanTaskUiSummary]
  type HyperParameterKey = String
  type HyperParameterSpecifications = js.Array[HyperParameterSpecification]
  type HyperParameterTrainingJobDefinitionName = String
  type HyperParameterTrainingJobDefinitions = js.Array[HyperParameterTrainingJobDefinition]
  type HyperParameterTrainingJobSummaries = js.Array[HyperParameterTrainingJobSummary]
  type HyperParameterTuningJobArn = String
  type HyperParameterTuningJobName = String
  type HyperParameterTuningJobObjectives = js.Array[HyperParameterTuningJobObjective]
  type HyperParameterTuningJobSummaries = js.Array[HyperParameterTuningJobSummary]
  type HyperParameterValue = String
  type HyperParameters = js.Dictionary[HyperParameterValue]
  type IdempotencyToken = String
  type ImageArn = String
  type ImageBaseImage = String
  type ImageContainerImage = String
  type ImageDeleteProperty = String
  type ImageDeletePropertyList = js.Array[ImageDeleteProperty]
  type ImageDescription = String
  type ImageDigest = String
  type ImageDisplayName = String
  type ImageName = String
  type ImageNameContains = String
  type ImageUri = String
  type ImageVersionArn = String
  type ImageVersionNumber = Int
  type ImageVersions = js.Array[ImageVersion]
  type Images = js.Array[Image]
  type InputDataConfig = js.Array[Channel]
  type InputModes = js.Array[TrainingInputMode]
  type IntegerParameterRanges = js.Array[IntegerParameterRange]
  type InvocationsMaxRetries = Int
  type InvocationsTimeoutInSeconds = Int
  type IotRoleAlias = String
  type JobReferenceCode = String
  type JobReferenceCodeContains = String
  type JsonContentType = String
  type JsonContentTypes = js.Array[JsonContentType]
  type JsonPath = String
  type KernelDisplayName = String
  type KernelName = String
  type KernelSpecs = js.Array[KernelSpec]
  type KmsKeyId = String
  type LabelAttributeName = String
  type LabelCounter = Int
  type LabelingJobAlgorithmSpecificationArn = String
  type LabelingJobArn = String
  type LabelingJobForWorkteamSummaryList = js.Array[LabelingJobForWorkteamSummary]
  type LabelingJobName = String
  type LabelingJobSummaryList = js.Array[LabelingJobSummary]
  type LambdaFunctionArn = String
  type LastModifiedTime = js.Date
  type LineageEntityParameters = js.Dictionary[StringParameterValue]
  type ListLineageEntityParameterKey = js.Array[StringParameterValue]
  type ListMaxResults = Int
  type ListTagsMaxResults = Int
  type ListTrialComponentKey256 = js.Array[TrialComponentKey256]
  type MaxAutoMLJobRuntimeInSeconds = Int
  type MaxCandidates = Int
  type MaxConcurrentTaskCount = Int
  type MaxConcurrentTransforms = Int
  type MaxHumanLabeledObjectCount = Int
  type MaxNumberOfTrainingJobs = Int
  type MaxParallelTrainingJobs = Int
  type MaxPayloadInMB = Int
  type MaxPercentageOfInputDatasetLabeled = Int
  type MaxResults = Int
  type MaxRuntimeInSeconds = Int
  type MaxRuntimePerTrainingJobInSeconds = Int
  type MaxWaitTimeInSeconds = Int
  type MaximumExecutionTimeoutInSeconds = Int
  type MediaType = String
  type MemberDefinitions = js.Array[MemberDefinition]
  type MetadataPropertyValue = String
  type MetricDefinitionList = js.Array[MetricDefinition]
  type MetricName = String
  type MetricRegex = String
  type MetricValue = Float
  type ModelArn = String
  type ModelName = String
  type ModelNameContains = String
  type ModelPackageArn = String
  type ModelPackageContainerDefinitionList = js.Array[ModelPackageContainerDefinition]
  type ModelPackageGroupArn = String
  type ModelPackageGroupSummaryList = js.Array[ModelPackageGroupSummary]
  type ModelPackageStatusItemList = js.Array[ModelPackageStatusItem]
  type ModelPackageSummaryList = js.Array[ModelPackageSummary]
  type ModelPackageValidationProfiles = js.Array[ModelPackageValidationProfile]
  type ModelPackageVersion = Int
  type ModelSummaryList = js.Array[ModelSummary]
  type MonitoringContainerArguments = js.Array[ContainerArgument]
  type MonitoringEnvironmentMap = js.Dictionary[ProcessingEnvironmentValue]
  type MonitoringExecutionSummaryList = js.Array[MonitoringExecutionSummary]
  type MonitoringInputs = js.Array[MonitoringInput]
  type MonitoringJobDefinitionArn = String
  type MonitoringJobDefinitionName = String
  type MonitoringJobDefinitionSummaryList = js.Array[MonitoringJobDefinitionSummary]
  type MonitoringMaxRuntimeInSeconds = Int
  type MonitoringOutputs = js.Array[MonitoringOutput]
  type MonitoringS3Uri = String
  type MonitoringScheduleArn = String
  type MonitoringScheduleList = js.Array[MonitoringSchedule]
  type MonitoringScheduleName = String
  type MonitoringScheduleSummaryList = js.Array[MonitoringScheduleSummary]
  type MonitoringTimeOffsetString = String
  type MountPath = String
  type NameContains = String
  type NestedFiltersList = js.Array[NestedFilters]
  type NetworkInterfaceId = String
  type NextToken = String
  type NotebookInstanceAcceleratorTypes = js.Array[NotebookInstanceAcceleratorType]
  type NotebookInstanceArn = String
  type NotebookInstanceLifecycleConfigArn = String
  type NotebookInstanceLifecycleConfigContent = String
  type NotebookInstanceLifecycleConfigList = js.Array[NotebookInstanceLifecycleHook]
  type NotebookInstanceLifecycleConfigName = String
  type NotebookInstanceLifecycleConfigNameContains = String
  type NotebookInstanceLifecycleConfigSummaryList = js.Array[NotebookInstanceLifecycleConfigSummary]
  type NotebookInstanceName = String
  type NotebookInstanceNameContains = String
  type NotebookInstanceSummaryList = js.Array[NotebookInstanceSummary]
  type NotebookInstanceUrl = String
  type NotebookInstanceVolumeSizeInGB = Int
  type NotificationTopicArn = String
  type NumberOfHumanWorkersPerDataObject = Int
  type ObjectiveStatusCounter = Int
  type OidcEndpoint = String
  type OptionalDouble = Double
  type OptionalInteger = Int
  type OptionalVolumeSizeInGB = Int
  type PaginationToken = String
  type ParameterKey = String
  type ParameterList = js.Array[Parameter]
  type ParameterName = String
  type ParameterValue = String
  type ParameterValues = js.Array[ParameterValue]
  type ParentHyperParameterTuningJobs = js.Array[ParentHyperParameterTuningJob]
  type Parents = js.Array[Parent]
  type PipelineArn = String
  type PipelineDefinition = String
  type PipelineDescription = String
  type PipelineExecutionArn = String
  type PipelineExecutionDescription = String
  type PipelineExecutionName = String
  type PipelineExecutionStepList = js.Array[PipelineExecutionStep]
  type PipelineExecutionSummaryList = js.Array[PipelineExecutionSummary]
  type PipelineName = String
  type PipelineParameterName = String
  type PipelineSummaryList = js.Array[PipelineSummary]
  type PolicyString = String
  type PresignedDomainUrl = String
  type ProbabilityThresholdAttribute = Double
  type ProcessingEnvironmentKey = String
  type ProcessingEnvironmentMap = js.Dictionary[ProcessingEnvironmentValue]
  type ProcessingEnvironmentValue = String
  type ProcessingInputs = js.Array[ProcessingInput]
  type ProcessingInstanceCount = Int
  type ProcessingJobArn = String
  type ProcessingJobName = String
  type ProcessingJobSummaries = js.Array[ProcessingJobSummary]
  type ProcessingLocalPath = String
  type ProcessingMaxRuntimeInSeconds = Int
  type ProcessingOutputs = js.Array[ProcessingOutput]
  type ProcessingVolumeSizeInGB = Int
  type ProductId = String
  type ProductListings = js.Array[String]
  type ProductionVariantList = js.Array[ProductionVariant]
  type ProductionVariantSummaryList = js.Array[ProductionVariantSummary]
  type ProfilerRuleConfigurations = js.Array[ProfilerRuleConfiguration]
  type ProfilerRuleEvaluationStatuses = js.Array[ProfilerRuleEvaluationStatus]
  type ProfilingIntervalInMilliseconds = Double
  type ProfilingParameters = js.Dictionary[ConfigValue]
  type ProjectArn = String
  type ProjectEntityName = String
  type ProjectId = String
  type ProjectSummaryList = js.Array[ProjectSummary]
  type PropertyNameHint = String
  type PropertyNameSuggestionList = js.Array[PropertyNameSuggestion]
  type ProvisionedProductStatusMessage = String
  type ProvisioningParameterKey = String
  type ProvisioningParameterValue = String
  type ProvisioningParameters = js.Array[ProvisioningParameter]
  type RealtimeInferenceInstanceTypes = js.Array[ProductionVariantInstanceType]
  type RedshiftClusterId = String
  type RedshiftDatabase = String
  type RedshiftQueryString = String
  type RedshiftUserName = String
  type RenderingErrorList = js.Array[RenderingError]
  type RepositoryCredentialsProviderArn = String
  type ResourceArn = String
  type ResourceId = String
  type ResourcePropertyName = String
  type ResponseMIMEType = String
  type ResponseMIMETypes = js.Array[ResponseMIMEType]
  type RoleArn = String
  type RuleConfigurationName = String
  type RuleParameters = js.Dictionary[ConfigValue]
  type S3Uri = String
  type SamplingPercentage = Int
  type ScheduleExpression = String
  type SearchExpressionList = js.Array[SearchExpression]
  type SearchResultsList = js.Array[SearchRecord]
  type SecondaryStatusTransitions = js.Array[SecondaryStatusTransition]
  type SecretArn = String
  type SecurityGroupId = String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type Seed = Double
  type ServiceCatalogEntityId = String
  type SessionExpirationDurationInSeconds = Int
  type SingleSignOnUserIdentifier = String
  type SnsTopicArn = String
  type SourceAlgorithmList = js.Array[SourceAlgorithm]
  type SourceType = String
  type SourceUri = String
  type StatusDetails = String
  type StatusMessage = String
  type StepName = String
  type String1024 = String
  type String200 = String
  type String2048 = String
  type String256 = String
  type String64 = String
  type StringParameterValue = String
  type SubnetId = String
  type Subnets = js.Array[SubnetId]
  type SubscribedWorkteams = js.Array[SubscribedWorkteam]
  type Success = Boolean
  type TableName = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TargetAttributeName = String
  type TargetObjectiveMetricValue = Float
  type TaskAvailabilityLifetimeInSeconds = Int
  type TaskCount = Int
  type TaskDescription = String
  type TaskInput = String
  type TaskKeyword = String
  type TaskKeywords = js.Array[TaskKeyword]
  type TaskTimeLimitInSeconds = Int
  type TaskTitle = String
  type TemplateContent = String
  type TemplateContentSha256 = String
  type TemplateUrl = String
  type TenthFractionsOfACent = Int
  type TerminationWaitInSeconds = Int
  type ThingName = String
  type Timestamp = js.Date
  type TrainingEnvironmentKey = String
  type TrainingEnvironmentMap = js.Dictionary[TrainingEnvironmentValue]
  type TrainingEnvironmentValue = String
  type TrainingInstanceCount = Int
  type TrainingInstanceTypes = js.Array[TrainingInstanceType]
  type TrainingJobArn = String
  type TrainingJobName = String
  type TrainingJobStatusCounter = Int
  type TrainingJobSummaries = js.Array[TrainingJobSummary]
  type TrainingTimeInSeconds = Int
  type TransformEnvironmentKey = String
  type TransformEnvironmentMap = js.Dictionary[TransformEnvironmentValue]
  type TransformEnvironmentValue = String
  type TransformInstanceCount = Int
  type TransformInstanceTypes = js.Array[TransformInstanceType]
  type TransformJobArn = String
  type TransformJobName = String
  type TransformJobSummaries = js.Array[TransformJobSummary]
  type TrialArn = String
  type TrialComponentArn = String
  type TrialComponentArtifactValue = String
  type TrialComponentArtifacts = js.Dictionary[TrialComponentArtifact]
  type TrialComponentKey256 = String
  type TrialComponentKey64 = String
  type TrialComponentMetricSummaries = js.Array[TrialComponentMetricSummary]
  type TrialComponentParameters = js.Dictionary[TrialComponentParameterValue]
  type TrialComponentSimpleSummaries = js.Array[TrialComponentSimpleSummary]
  type TrialComponentSourceArn = String
  type TrialComponentStatusMessage = String
  type TrialComponentSummaries = js.Array[TrialComponentSummary]
  type TrialSourceArn = String
  type TrialSummaries = js.Array[TrialSummary]
  type Url = String
  type UserProfileArn = String
  type UserProfileList = js.Array[UserProfileDetails]
  type UserProfileName = String
  type VariantName = String
  type VariantPropertyList = js.Array[VariantProperty]
  type VariantWeight = Float
  type VersionedArnOrName = String
  type VolumeSizeInGB = Int
  type VpcId = String
  type VpcSecurityGroupIds = js.Array[SecurityGroupId]
  type WaitIntervalInSeconds = Int
  type WorkforceArn = String
  type WorkforceName = String
  type Workforces = js.Array[Workforce]
  type WorkteamArn = String
  type WorkteamName = String
  type Workteams = js.Array[Workteam]

  final class SageMakerOps(private val service: SageMaker) extends AnyVal {

    @inline def addAssociationFuture(params: AddAssociationRequest): Future[AddAssociationResponse] = service.addAssociation(params).promise().toFuture
    @inline def addTagsFuture(params: AddTagsInput): Future[AddTagsOutput] = service.addTags(params).promise().toFuture
    @inline def associateTrialComponentFuture(params: AssociateTrialComponentRequest): Future[AssociateTrialComponentResponse] = service.associateTrialComponent(params).promise().toFuture
    @inline def createActionFuture(params: CreateActionRequest): Future[CreateActionResponse] = service.createAction(params).promise().toFuture
    @inline def createAlgorithmFuture(params: CreateAlgorithmInput): Future[CreateAlgorithmOutput] = service.createAlgorithm(params).promise().toFuture
    @inline def createAppFuture(params: CreateAppRequest): Future[CreateAppResponse] = service.createApp(params).promise().toFuture
    @inline def createAppImageConfigFuture(params: CreateAppImageConfigRequest): Future[CreateAppImageConfigResponse] = service.createAppImageConfig(params).promise().toFuture
    @inline def createArtifactFuture(params: CreateArtifactRequest): Future[CreateArtifactResponse] = service.createArtifact(params).promise().toFuture
    @inline def createAutoMLJobFuture(params: CreateAutoMLJobRequest): Future[CreateAutoMLJobResponse] = service.createAutoMLJob(params).promise().toFuture
    @inline def createCodeRepositoryFuture(params: CreateCodeRepositoryInput): Future[CreateCodeRepositoryOutput] = service.createCodeRepository(params).promise().toFuture
    @inline def createCompilationJobFuture(params: CreateCompilationJobRequest): Future[CreateCompilationJobResponse] = service.createCompilationJob(params).promise().toFuture
    @inline def createContextFuture(params: CreateContextRequest): Future[CreateContextResponse] = service.createContext(params).promise().toFuture
    @inline def createDataQualityJobDefinitionFuture(params: CreateDataQualityJobDefinitionRequest): Future[CreateDataQualityJobDefinitionResponse] = service.createDataQualityJobDefinition(params).promise().toFuture
    @inline def createDeviceFleetFuture(params: CreateDeviceFleetRequest): Future[js.Object] = service.createDeviceFleet(params).promise().toFuture
    @inline def createDomainFuture(params: CreateDomainRequest): Future[CreateDomainResponse] = service.createDomain(params).promise().toFuture
    @inline def createEdgePackagingJobFuture(params: CreateEdgePackagingJobRequest): Future[js.Object] = service.createEdgePackagingJob(params).promise().toFuture
    @inline def createEndpointConfigFuture(params: CreateEndpointConfigInput): Future[CreateEndpointConfigOutput] = service.createEndpointConfig(params).promise().toFuture
    @inline def createEndpointFuture(params: CreateEndpointInput): Future[CreateEndpointOutput] = service.createEndpoint(params).promise().toFuture
    @inline def createExperimentFuture(params: CreateExperimentRequest): Future[CreateExperimentResponse] = service.createExperiment(params).promise().toFuture
    @inline def createFeatureGroupFuture(params: CreateFeatureGroupRequest): Future[CreateFeatureGroupResponse] = service.createFeatureGroup(params).promise().toFuture
    @inline def createFlowDefinitionFuture(params: CreateFlowDefinitionRequest): Future[CreateFlowDefinitionResponse] = service.createFlowDefinition(params).promise().toFuture
    @inline def createHumanTaskUiFuture(params: CreateHumanTaskUiRequest): Future[CreateHumanTaskUiResponse] = service.createHumanTaskUi(params).promise().toFuture
    @inline def createHyperParameterTuningJobFuture(params: CreateHyperParameterTuningJobRequest): Future[CreateHyperParameterTuningJobResponse] = service.createHyperParameterTuningJob(params).promise().toFuture
    @inline def createImageFuture(params: CreateImageRequest): Future[CreateImageResponse] = service.createImage(params).promise().toFuture
    @inline def createImageVersionFuture(params: CreateImageVersionRequest): Future[CreateImageVersionResponse] = service.createImageVersion(params).promise().toFuture
    @inline def createLabelingJobFuture(params: CreateLabelingJobRequest): Future[CreateLabelingJobResponse] = service.createLabelingJob(params).promise().toFuture
    @inline def createModelBiasJobDefinitionFuture(params: CreateModelBiasJobDefinitionRequest): Future[CreateModelBiasJobDefinitionResponse] = service.createModelBiasJobDefinition(params).promise().toFuture
    @inline def createModelExplainabilityJobDefinitionFuture(params: CreateModelExplainabilityJobDefinitionRequest): Future[CreateModelExplainabilityJobDefinitionResponse] = service.createModelExplainabilityJobDefinition(params).promise().toFuture
    @inline def createModelFuture(params: CreateModelInput): Future[CreateModelOutput] = service.createModel(params).promise().toFuture
    @inline def createModelPackageFuture(params: CreateModelPackageInput): Future[CreateModelPackageOutput] = service.createModelPackage(params).promise().toFuture
    @inline def createModelPackageGroupFuture(params: CreateModelPackageGroupInput): Future[CreateModelPackageGroupOutput] = service.createModelPackageGroup(params).promise().toFuture
    @inline def createModelQualityJobDefinitionFuture(params: CreateModelQualityJobDefinitionRequest): Future[CreateModelQualityJobDefinitionResponse] = service.createModelQualityJobDefinition(params).promise().toFuture
    @inline def createMonitoringScheduleFuture(params: CreateMonitoringScheduleRequest): Future[CreateMonitoringScheduleResponse] = service.createMonitoringSchedule(params).promise().toFuture
    @inline def createNotebookInstanceFuture(params: CreateNotebookInstanceInput): Future[CreateNotebookInstanceOutput] = service.createNotebookInstance(params).promise().toFuture
    @inline def createNotebookInstanceLifecycleConfigFuture(params: CreateNotebookInstanceLifecycleConfigInput): Future[CreateNotebookInstanceLifecycleConfigOutput] = service.createNotebookInstanceLifecycleConfig(params).promise().toFuture
    @inline def createPipelineFuture(params: CreatePipelineRequest): Future[CreatePipelineResponse] = service.createPipeline(params).promise().toFuture
    @inline def createPresignedDomainUrlFuture(params: CreatePresignedDomainUrlRequest): Future[CreatePresignedDomainUrlResponse] = service.createPresignedDomainUrl(params).promise().toFuture
    @inline def createPresignedNotebookInstanceUrlFuture(params: CreatePresignedNotebookInstanceUrlInput): Future[CreatePresignedNotebookInstanceUrlOutput] = service.createPresignedNotebookInstanceUrl(params).promise().toFuture
    @inline def createProcessingJobFuture(params: CreateProcessingJobRequest): Future[CreateProcessingJobResponse] = service.createProcessingJob(params).promise().toFuture
    @inline def createProjectFuture(params: CreateProjectInput): Future[CreateProjectOutput] = service.createProject(params).promise().toFuture
    @inline def createTrainingJobFuture(params: CreateTrainingJobRequest): Future[CreateTrainingJobResponse] = service.createTrainingJob(params).promise().toFuture
    @inline def createTransformJobFuture(params: CreateTransformJobRequest): Future[CreateTransformJobResponse] = service.createTransformJob(params).promise().toFuture
    @inline def createTrialComponentFuture(params: CreateTrialComponentRequest): Future[CreateTrialComponentResponse] = service.createTrialComponent(params).promise().toFuture
    @inline def createTrialFuture(params: CreateTrialRequest): Future[CreateTrialResponse] = service.createTrial(params).promise().toFuture
    @inline def createUserProfileFuture(params: CreateUserProfileRequest): Future[CreateUserProfileResponse] = service.createUserProfile(params).promise().toFuture
    @inline def createWorkforceFuture(params: CreateWorkforceRequest): Future[CreateWorkforceResponse] = service.createWorkforce(params).promise().toFuture
    @inline def createWorkteamFuture(params: CreateWorkteamRequest): Future[CreateWorkteamResponse] = service.createWorkteam(params).promise().toFuture
    @inline def deleteActionFuture(params: DeleteActionRequest): Future[DeleteActionResponse] = service.deleteAction(params).promise().toFuture
    @inline def deleteAlgorithmFuture(params: DeleteAlgorithmInput): Future[js.Object] = service.deleteAlgorithm(params).promise().toFuture
    @inline def deleteAppFuture(params: DeleteAppRequest): Future[js.Object] = service.deleteApp(params).promise().toFuture
    @inline def deleteAppImageConfigFuture(params: DeleteAppImageConfigRequest): Future[js.Object] = service.deleteAppImageConfig(params).promise().toFuture
    @inline def deleteArtifactFuture(params: DeleteArtifactRequest): Future[DeleteArtifactResponse] = service.deleteArtifact(params).promise().toFuture
    @inline def deleteAssociationFuture(params: DeleteAssociationRequest): Future[DeleteAssociationResponse] = service.deleteAssociation(params).promise().toFuture
    @inline def deleteCodeRepositoryFuture(params: DeleteCodeRepositoryInput): Future[js.Object] = service.deleteCodeRepository(params).promise().toFuture
    @inline def deleteContextFuture(params: DeleteContextRequest): Future[DeleteContextResponse] = service.deleteContext(params).promise().toFuture
    @inline def deleteDataQualityJobDefinitionFuture(params: DeleteDataQualityJobDefinitionRequest): Future[js.Object] = service.deleteDataQualityJobDefinition(params).promise().toFuture
    @inline def deleteDeviceFleetFuture(params: DeleteDeviceFleetRequest): Future[js.Object] = service.deleteDeviceFleet(params).promise().toFuture
    @inline def deleteDomainFuture(params: DeleteDomainRequest): Future[js.Object] = service.deleteDomain(params).promise().toFuture
    @inline def deleteEndpointConfigFuture(params: DeleteEndpointConfigInput): Future[js.Object] = service.deleteEndpointConfig(params).promise().toFuture
    @inline def deleteEndpointFuture(params: DeleteEndpointInput): Future[js.Object] = service.deleteEndpoint(params).promise().toFuture
    @inline def deleteExperimentFuture(params: DeleteExperimentRequest): Future[DeleteExperimentResponse] = service.deleteExperiment(params).promise().toFuture
    @inline def deleteFeatureGroupFuture(params: DeleteFeatureGroupRequest): Future[js.Object] = service.deleteFeatureGroup(params).promise().toFuture
    @inline def deleteFlowDefinitionFuture(params: DeleteFlowDefinitionRequest): Future[DeleteFlowDefinitionResponse] = service.deleteFlowDefinition(params).promise().toFuture
    @inline def deleteHumanTaskUiFuture(params: DeleteHumanTaskUiRequest): Future[DeleteHumanTaskUiResponse] = service.deleteHumanTaskUi(params).promise().toFuture
    @inline def deleteImageFuture(params: DeleteImageRequest): Future[DeleteImageResponse] = service.deleteImage(params).promise().toFuture
    @inline def deleteImageVersionFuture(params: DeleteImageVersionRequest): Future[DeleteImageVersionResponse] = service.deleteImageVersion(params).promise().toFuture
    @inline def deleteModelBiasJobDefinitionFuture(params: DeleteModelBiasJobDefinitionRequest): Future[js.Object] = service.deleteModelBiasJobDefinition(params).promise().toFuture
    @inline def deleteModelExplainabilityJobDefinitionFuture(params: DeleteModelExplainabilityJobDefinitionRequest): Future[js.Object] = service.deleteModelExplainabilityJobDefinition(params).promise().toFuture
    @inline def deleteModelFuture(params: DeleteModelInput): Future[js.Object] = service.deleteModel(params).promise().toFuture
    @inline def deleteModelPackageFuture(params: DeleteModelPackageInput): Future[js.Object] = service.deleteModelPackage(params).promise().toFuture
    @inline def deleteModelPackageGroupFuture(params: DeleteModelPackageGroupInput): Future[js.Object] = service.deleteModelPackageGroup(params).promise().toFuture
    @inline def deleteModelPackageGroupPolicyFuture(params: DeleteModelPackageGroupPolicyInput): Future[js.Object] = service.deleteModelPackageGroupPolicy(params).promise().toFuture
    @inline def deleteModelQualityJobDefinitionFuture(params: DeleteModelQualityJobDefinitionRequest): Future[js.Object] = service.deleteModelQualityJobDefinition(params).promise().toFuture
    @inline def deleteMonitoringScheduleFuture(params: DeleteMonitoringScheduleRequest): Future[js.Object] = service.deleteMonitoringSchedule(params).promise().toFuture
    @inline def deleteNotebookInstanceFuture(params: DeleteNotebookInstanceInput): Future[js.Object] = service.deleteNotebookInstance(params).promise().toFuture
    @inline def deleteNotebookInstanceLifecycleConfigFuture(params: DeleteNotebookInstanceLifecycleConfigInput): Future[js.Object] = service.deleteNotebookInstanceLifecycleConfig(params).promise().toFuture
    @inline def deletePipelineFuture(params: DeletePipelineRequest): Future[DeletePipelineResponse] = service.deletePipeline(params).promise().toFuture
    @inline def deleteProjectFuture(params: DeleteProjectInput): Future[js.Object] = service.deleteProject(params).promise().toFuture
    @inline def deleteTagsFuture(params: DeleteTagsInput): Future[DeleteTagsOutput] = service.deleteTags(params).promise().toFuture
    @inline def deleteTrialComponentFuture(params: DeleteTrialComponentRequest): Future[DeleteTrialComponentResponse] = service.deleteTrialComponent(params).promise().toFuture
    @inline def deleteTrialFuture(params: DeleteTrialRequest): Future[DeleteTrialResponse] = service.deleteTrial(params).promise().toFuture
    @inline def deleteUserProfileFuture(params: DeleteUserProfileRequest): Future[js.Object] = service.deleteUserProfile(params).promise().toFuture
    @inline def deleteWorkforceFuture(params: DeleteWorkforceRequest): Future[DeleteWorkforceResponse] = service.deleteWorkforce(params).promise().toFuture
    @inline def deleteWorkteamFuture(params: DeleteWorkteamRequest): Future[DeleteWorkteamResponse] = service.deleteWorkteam(params).promise().toFuture
    @inline def deregisterDevicesFuture(params: DeregisterDevicesRequest): Future[js.Object] = service.deregisterDevices(params).promise().toFuture
    @inline def describeActionFuture(params: DescribeActionRequest): Future[DescribeActionResponse] = service.describeAction(params).promise().toFuture
    @inline def describeAlgorithmFuture(params: DescribeAlgorithmInput): Future[DescribeAlgorithmOutput] = service.describeAlgorithm(params).promise().toFuture
    @inline def describeAppFuture(params: DescribeAppRequest): Future[DescribeAppResponse] = service.describeApp(params).promise().toFuture
    @inline def describeAppImageConfigFuture(params: DescribeAppImageConfigRequest): Future[DescribeAppImageConfigResponse] = service.describeAppImageConfig(params).promise().toFuture
    @inline def describeArtifactFuture(params: DescribeArtifactRequest): Future[DescribeArtifactResponse] = service.describeArtifact(params).promise().toFuture
    @inline def describeAutoMLJobFuture(params: DescribeAutoMLJobRequest): Future[DescribeAutoMLJobResponse] = service.describeAutoMLJob(params).promise().toFuture
    @inline def describeCodeRepositoryFuture(params: DescribeCodeRepositoryInput): Future[DescribeCodeRepositoryOutput] = service.describeCodeRepository(params).promise().toFuture
    @inline def describeCompilationJobFuture(params: DescribeCompilationJobRequest): Future[DescribeCompilationJobResponse] = service.describeCompilationJob(params).promise().toFuture
    @inline def describeContextFuture(params: DescribeContextRequest): Future[DescribeContextResponse] = service.describeContext(params).promise().toFuture
    @inline def describeDataQualityJobDefinitionFuture(params: DescribeDataQualityJobDefinitionRequest): Future[DescribeDataQualityJobDefinitionResponse] = service.describeDataQualityJobDefinition(params).promise().toFuture
    @inline def describeDeviceFleetFuture(params: DescribeDeviceFleetRequest): Future[DescribeDeviceFleetResponse] = service.describeDeviceFleet(params).promise().toFuture
    @inline def describeDeviceFuture(params: DescribeDeviceRequest): Future[DescribeDeviceResponse] = service.describeDevice(params).promise().toFuture
    @inline def describeDomainFuture(params: DescribeDomainRequest): Future[DescribeDomainResponse] = service.describeDomain(params).promise().toFuture
    @inline def describeEdgePackagingJobFuture(params: DescribeEdgePackagingJobRequest): Future[DescribeEdgePackagingJobResponse] = service.describeEdgePackagingJob(params).promise().toFuture
    @inline def describeEndpointConfigFuture(params: DescribeEndpointConfigInput): Future[DescribeEndpointConfigOutput] = service.describeEndpointConfig(params).promise().toFuture
    @inline def describeEndpointFuture(params: DescribeEndpointInput): Future[DescribeEndpointOutput] = service.describeEndpoint(params).promise().toFuture
    @inline def describeExperimentFuture(params: DescribeExperimentRequest): Future[DescribeExperimentResponse] = service.describeExperiment(params).promise().toFuture
    @inline def describeFeatureGroupFuture(params: DescribeFeatureGroupRequest): Future[DescribeFeatureGroupResponse] = service.describeFeatureGroup(params).promise().toFuture
    @inline def describeFlowDefinitionFuture(params: DescribeFlowDefinitionRequest): Future[DescribeFlowDefinitionResponse] = service.describeFlowDefinition(params).promise().toFuture
    @inline def describeHumanTaskUiFuture(params: DescribeHumanTaskUiRequest): Future[DescribeHumanTaskUiResponse] = service.describeHumanTaskUi(params).promise().toFuture
    @inline def describeHyperParameterTuningJobFuture(params: DescribeHyperParameterTuningJobRequest): Future[DescribeHyperParameterTuningJobResponse] = service.describeHyperParameterTuningJob(params).promise().toFuture
    @inline def describeImageFuture(params: DescribeImageRequest): Future[DescribeImageResponse] = service.describeImage(params).promise().toFuture
    @inline def describeImageVersionFuture(params: DescribeImageVersionRequest): Future[DescribeImageVersionResponse] = service.describeImageVersion(params).promise().toFuture
    @inline def describeLabelingJobFuture(params: DescribeLabelingJobRequest): Future[DescribeLabelingJobResponse] = service.describeLabelingJob(params).promise().toFuture
    @inline def describeModelBiasJobDefinitionFuture(params: DescribeModelBiasJobDefinitionRequest): Future[DescribeModelBiasJobDefinitionResponse] = service.describeModelBiasJobDefinition(params).promise().toFuture
    @inline def describeModelExplainabilityJobDefinitionFuture(params: DescribeModelExplainabilityJobDefinitionRequest): Future[DescribeModelExplainabilityJobDefinitionResponse] = service.describeModelExplainabilityJobDefinition(params).promise().toFuture
    @inline def describeModelFuture(params: DescribeModelInput): Future[DescribeModelOutput] = service.describeModel(params).promise().toFuture
    @inline def describeModelPackageFuture(params: DescribeModelPackageInput): Future[DescribeModelPackageOutput] = service.describeModelPackage(params).promise().toFuture
    @inline def describeModelPackageGroupFuture(params: DescribeModelPackageGroupInput): Future[DescribeModelPackageGroupOutput] = service.describeModelPackageGroup(params).promise().toFuture
    @inline def describeModelQualityJobDefinitionFuture(params: DescribeModelQualityJobDefinitionRequest): Future[DescribeModelQualityJobDefinitionResponse] = service.describeModelQualityJobDefinition(params).promise().toFuture
    @inline def describeMonitoringScheduleFuture(params: DescribeMonitoringScheduleRequest): Future[DescribeMonitoringScheduleResponse] = service.describeMonitoringSchedule(params).promise().toFuture
    @inline def describeNotebookInstanceFuture(params: DescribeNotebookInstanceInput): Future[DescribeNotebookInstanceOutput] = service.describeNotebookInstance(params).promise().toFuture
    @inline def describeNotebookInstanceLifecycleConfigFuture(params: DescribeNotebookInstanceLifecycleConfigInput): Future[DescribeNotebookInstanceLifecycleConfigOutput] = service.describeNotebookInstanceLifecycleConfig(params).promise().toFuture
    @inline def describePipelineDefinitionForExecutionFuture(params: DescribePipelineDefinitionForExecutionRequest): Future[DescribePipelineDefinitionForExecutionResponse] = service.describePipelineDefinitionForExecution(params).promise().toFuture
    @inline def describePipelineExecutionFuture(params: DescribePipelineExecutionRequest): Future[DescribePipelineExecutionResponse] = service.describePipelineExecution(params).promise().toFuture
    @inline def describePipelineFuture(params: DescribePipelineRequest): Future[DescribePipelineResponse] = service.describePipeline(params).promise().toFuture
    @inline def describeProcessingJobFuture(params: DescribeProcessingJobRequest): Future[DescribeProcessingJobResponse] = service.describeProcessingJob(params).promise().toFuture
    @inline def describeProjectFuture(params: DescribeProjectInput): Future[DescribeProjectOutput] = service.describeProject(params).promise().toFuture
    @inline def describeSubscribedWorkteamFuture(params: DescribeSubscribedWorkteamRequest): Future[DescribeSubscribedWorkteamResponse] = service.describeSubscribedWorkteam(params).promise().toFuture
    @inline def describeTrainingJobFuture(params: DescribeTrainingJobRequest): Future[DescribeTrainingJobResponse] = service.describeTrainingJob(params).promise().toFuture
    @inline def describeTransformJobFuture(params: DescribeTransformJobRequest): Future[DescribeTransformJobResponse] = service.describeTransformJob(params).promise().toFuture
    @inline def describeTrialComponentFuture(params: DescribeTrialComponentRequest): Future[DescribeTrialComponentResponse] = service.describeTrialComponent(params).promise().toFuture
    @inline def describeTrialFuture(params: DescribeTrialRequest): Future[DescribeTrialResponse] = service.describeTrial(params).promise().toFuture
    @inline def describeUserProfileFuture(params: DescribeUserProfileRequest): Future[DescribeUserProfileResponse] = service.describeUserProfile(params).promise().toFuture
    @inline def describeWorkforceFuture(params: DescribeWorkforceRequest): Future[DescribeWorkforceResponse] = service.describeWorkforce(params).promise().toFuture
    @inline def describeWorkteamFuture(params: DescribeWorkteamRequest): Future[DescribeWorkteamResponse] = service.describeWorkteam(params).promise().toFuture
    @inline def disableSagemakerServicecatalogPortfolioFuture(params: DisableSagemakerServicecatalogPortfolioInput): Future[DisableSagemakerServicecatalogPortfolioOutput] = service.disableSagemakerServicecatalogPortfolio(params).promise().toFuture
    @inline def disassociateTrialComponentFuture(params: DisassociateTrialComponentRequest): Future[DisassociateTrialComponentResponse] = service.disassociateTrialComponent(params).promise().toFuture
    @inline def enableSagemakerServicecatalogPortfolioFuture(params: EnableSagemakerServicecatalogPortfolioInput): Future[EnableSagemakerServicecatalogPortfolioOutput] = service.enableSagemakerServicecatalogPortfolio(params).promise().toFuture
    @inline def getDeviceFleetReportFuture(params: GetDeviceFleetReportRequest): Future[GetDeviceFleetReportResponse] = service.getDeviceFleetReport(params).promise().toFuture
    @inline def getModelPackageGroupPolicyFuture(params: GetModelPackageGroupPolicyInput): Future[GetModelPackageGroupPolicyOutput] = service.getModelPackageGroupPolicy(params).promise().toFuture
    @inline def getSagemakerServicecatalogPortfolioStatusFuture(params: GetSagemakerServicecatalogPortfolioStatusInput): Future[GetSagemakerServicecatalogPortfolioStatusOutput] = service.getSagemakerServicecatalogPortfolioStatus(params).promise().toFuture
    @inline def getSearchSuggestionsFuture(params: GetSearchSuggestionsRequest): Future[GetSearchSuggestionsResponse] = service.getSearchSuggestions(params).promise().toFuture
    @inline def listActionsFuture(params: ListActionsRequest): Future[ListActionsResponse] = service.listActions(params).promise().toFuture
    @inline def listAlgorithmsFuture(params: ListAlgorithmsInput): Future[ListAlgorithmsOutput] = service.listAlgorithms(params).promise().toFuture
    @inline def listAppImageConfigsFuture(params: ListAppImageConfigsRequest): Future[ListAppImageConfigsResponse] = service.listAppImageConfigs(params).promise().toFuture
    @inline def listAppsFuture(params: ListAppsRequest): Future[ListAppsResponse] = service.listApps(params).promise().toFuture
    @inline def listArtifactsFuture(params: ListArtifactsRequest): Future[ListArtifactsResponse] = service.listArtifacts(params).promise().toFuture
    @inline def listAssociationsFuture(params: ListAssociationsRequest): Future[ListAssociationsResponse] = service.listAssociations(params).promise().toFuture
    @inline def listAutoMLJobsFuture(params: ListAutoMLJobsRequest): Future[ListAutoMLJobsResponse] = service.listAutoMLJobs(params).promise().toFuture
    @inline def listCandidatesForAutoMLJobFuture(params: ListCandidatesForAutoMLJobRequest): Future[ListCandidatesForAutoMLJobResponse] = service.listCandidatesForAutoMLJob(params).promise().toFuture
    @inline def listCodeRepositoriesFuture(params: ListCodeRepositoriesInput): Future[ListCodeRepositoriesOutput] = service.listCodeRepositories(params).promise().toFuture
    @inline def listCompilationJobsFuture(params: ListCompilationJobsRequest): Future[ListCompilationJobsResponse] = service.listCompilationJobs(params).promise().toFuture
    @inline def listContextsFuture(params: ListContextsRequest): Future[ListContextsResponse] = service.listContexts(params).promise().toFuture
    @inline def listDataQualityJobDefinitionsFuture(params: ListDataQualityJobDefinitionsRequest): Future[ListDataQualityJobDefinitionsResponse] = service.listDataQualityJobDefinitions(params).promise().toFuture
    @inline def listDeviceFleetsFuture(params: ListDeviceFleetsRequest): Future[ListDeviceFleetsResponse] = service.listDeviceFleets(params).promise().toFuture
    @inline def listDevicesFuture(params: ListDevicesRequest): Future[ListDevicesResponse] = service.listDevices(params).promise().toFuture
    @inline def listDomainsFuture(params: ListDomainsRequest): Future[ListDomainsResponse] = service.listDomains(params).promise().toFuture
    @inline def listEdgePackagingJobsFuture(params: ListEdgePackagingJobsRequest): Future[ListEdgePackagingJobsResponse] = service.listEdgePackagingJobs(params).promise().toFuture
    @inline def listEndpointConfigsFuture(params: ListEndpointConfigsInput): Future[ListEndpointConfigsOutput] = service.listEndpointConfigs(params).promise().toFuture
    @inline def listEndpointsFuture(params: ListEndpointsInput): Future[ListEndpointsOutput] = service.listEndpoints(params).promise().toFuture
    @inline def listExperimentsFuture(params: ListExperimentsRequest): Future[ListExperimentsResponse] = service.listExperiments(params).promise().toFuture
    @inline def listFeatureGroupsFuture(params: ListFeatureGroupsRequest): Future[ListFeatureGroupsResponse] = service.listFeatureGroups(params).promise().toFuture
    @inline def listFlowDefinitionsFuture(params: ListFlowDefinitionsRequest): Future[ListFlowDefinitionsResponse] = service.listFlowDefinitions(params).promise().toFuture
    @inline def listHumanTaskUisFuture(params: ListHumanTaskUisRequest): Future[ListHumanTaskUisResponse] = service.listHumanTaskUis(params).promise().toFuture
    @inline def listHyperParameterTuningJobsFuture(params: ListHyperParameterTuningJobsRequest): Future[ListHyperParameterTuningJobsResponse] = service.listHyperParameterTuningJobs(params).promise().toFuture
    @inline def listImageVersionsFuture(params: ListImageVersionsRequest): Future[ListImageVersionsResponse] = service.listImageVersions(params).promise().toFuture
    @inline def listImagesFuture(params: ListImagesRequest): Future[ListImagesResponse] = service.listImages(params).promise().toFuture
    @inline def listLabelingJobsForWorkteamFuture(params: ListLabelingJobsForWorkteamRequest): Future[ListLabelingJobsForWorkteamResponse] = service.listLabelingJobsForWorkteam(params).promise().toFuture
    @inline def listLabelingJobsFuture(params: ListLabelingJobsRequest): Future[ListLabelingJobsResponse] = service.listLabelingJobs(params).promise().toFuture
    @inline def listModelBiasJobDefinitionsFuture(params: ListModelBiasJobDefinitionsRequest): Future[ListModelBiasJobDefinitionsResponse] = service.listModelBiasJobDefinitions(params).promise().toFuture
    @inline def listModelExplainabilityJobDefinitionsFuture(params: ListModelExplainabilityJobDefinitionsRequest): Future[ListModelExplainabilityJobDefinitionsResponse] = service.listModelExplainabilityJobDefinitions(params).promise().toFuture
    @inline def listModelPackageGroupsFuture(params: ListModelPackageGroupsInput): Future[ListModelPackageGroupsOutput] = service.listModelPackageGroups(params).promise().toFuture
    @inline def listModelPackagesFuture(params: ListModelPackagesInput): Future[ListModelPackagesOutput] = service.listModelPackages(params).promise().toFuture
    @inline def listModelQualityJobDefinitionsFuture(params: ListModelQualityJobDefinitionsRequest): Future[ListModelQualityJobDefinitionsResponse] = service.listModelQualityJobDefinitions(params).promise().toFuture
    @inline def listModelsFuture(params: ListModelsInput): Future[ListModelsOutput] = service.listModels(params).promise().toFuture
    @inline def listMonitoringExecutionsFuture(params: ListMonitoringExecutionsRequest): Future[ListMonitoringExecutionsResponse] = service.listMonitoringExecutions(params).promise().toFuture
    @inline def listMonitoringSchedulesFuture(params: ListMonitoringSchedulesRequest): Future[ListMonitoringSchedulesResponse] = service.listMonitoringSchedules(params).promise().toFuture
    @inline def listNotebookInstanceLifecycleConfigsFuture(params: ListNotebookInstanceLifecycleConfigsInput): Future[ListNotebookInstanceLifecycleConfigsOutput] = service.listNotebookInstanceLifecycleConfigs(params).promise().toFuture
    @inline def listNotebookInstancesFuture(params: ListNotebookInstancesInput): Future[ListNotebookInstancesOutput] = service.listNotebookInstances(params).promise().toFuture
    @inline def listPipelineExecutionStepsFuture(params: ListPipelineExecutionStepsRequest): Future[ListPipelineExecutionStepsResponse] = service.listPipelineExecutionSteps(params).promise().toFuture
    @inline def listPipelineExecutionsFuture(params: ListPipelineExecutionsRequest): Future[ListPipelineExecutionsResponse] = service.listPipelineExecutions(params).promise().toFuture
    @inline def listPipelineParametersForExecutionFuture(params: ListPipelineParametersForExecutionRequest): Future[ListPipelineParametersForExecutionResponse] = service.listPipelineParametersForExecution(params).promise().toFuture
    @inline def listPipelinesFuture(params: ListPipelinesRequest): Future[ListPipelinesResponse] = service.listPipelines(params).promise().toFuture
    @inline def listProcessingJobsFuture(params: ListProcessingJobsRequest): Future[ListProcessingJobsResponse] = service.listProcessingJobs(params).promise().toFuture
    @inline def listProjectsFuture(params: ListProjectsInput): Future[ListProjectsOutput] = service.listProjects(params).promise().toFuture
    @inline def listSubscribedWorkteamsFuture(params: ListSubscribedWorkteamsRequest): Future[ListSubscribedWorkteamsResponse] = service.listSubscribedWorkteams(params).promise().toFuture
    @inline def listTagsFuture(params: ListTagsInput): Future[ListTagsOutput] = service.listTags(params).promise().toFuture
    @inline def listTrainingJobsForHyperParameterTuningJobFuture(params: ListTrainingJobsForHyperParameterTuningJobRequest): Future[ListTrainingJobsForHyperParameterTuningJobResponse] = service.listTrainingJobsForHyperParameterTuningJob(params).promise().toFuture
    @inline def listTrainingJobsFuture(params: ListTrainingJobsRequest): Future[ListTrainingJobsResponse] = service.listTrainingJobs(params).promise().toFuture
    @inline def listTransformJobsFuture(params: ListTransformJobsRequest): Future[ListTransformJobsResponse] = service.listTransformJobs(params).promise().toFuture
    @inline def listTrialComponentsFuture(params: ListTrialComponentsRequest): Future[ListTrialComponentsResponse] = service.listTrialComponents(params).promise().toFuture
    @inline def listTrialsFuture(params: ListTrialsRequest): Future[ListTrialsResponse] = service.listTrials(params).promise().toFuture
    @inline def listUserProfilesFuture(params: ListUserProfilesRequest): Future[ListUserProfilesResponse] = service.listUserProfiles(params).promise().toFuture
    @inline def listWorkforcesFuture(params: ListWorkforcesRequest): Future[ListWorkforcesResponse] = service.listWorkforces(params).promise().toFuture
    @inline def listWorkteamsFuture(params: ListWorkteamsRequest): Future[ListWorkteamsResponse] = service.listWorkteams(params).promise().toFuture
    @inline def putModelPackageGroupPolicyFuture(params: PutModelPackageGroupPolicyInput): Future[PutModelPackageGroupPolicyOutput] = service.putModelPackageGroupPolicy(params).promise().toFuture
    @inline def registerDevicesFuture(params: RegisterDevicesRequest): Future[js.Object] = service.registerDevices(params).promise().toFuture
    @inline def renderUiTemplateFuture(params: RenderUiTemplateRequest): Future[RenderUiTemplateResponse] = service.renderUiTemplate(params).promise().toFuture
    @inline def searchFuture(params: SearchRequest): Future[SearchResponse] = service.search(params).promise().toFuture
    @inline def startMonitoringScheduleFuture(params: StartMonitoringScheduleRequest): Future[js.Object] = service.startMonitoringSchedule(params).promise().toFuture
    @inline def startNotebookInstanceFuture(params: StartNotebookInstanceInput): Future[js.Object] = service.startNotebookInstance(params).promise().toFuture
    @inline def startPipelineExecutionFuture(params: StartPipelineExecutionRequest): Future[StartPipelineExecutionResponse] = service.startPipelineExecution(params).promise().toFuture
    @inline def stopAutoMLJobFuture(params: StopAutoMLJobRequest): Future[js.Object] = service.stopAutoMLJob(params).promise().toFuture
    @inline def stopCompilationJobFuture(params: StopCompilationJobRequest): Future[js.Object] = service.stopCompilationJob(params).promise().toFuture
    @inline def stopEdgePackagingJobFuture(params: StopEdgePackagingJobRequest): Future[js.Object] = service.stopEdgePackagingJob(params).promise().toFuture
    @inline def stopHyperParameterTuningJobFuture(params: StopHyperParameterTuningJobRequest): Future[js.Object] = service.stopHyperParameterTuningJob(params).promise().toFuture
    @inline def stopLabelingJobFuture(params: StopLabelingJobRequest): Future[js.Object] = service.stopLabelingJob(params).promise().toFuture
    @inline def stopMonitoringScheduleFuture(params: StopMonitoringScheduleRequest): Future[js.Object] = service.stopMonitoringSchedule(params).promise().toFuture
    @inline def stopNotebookInstanceFuture(params: StopNotebookInstanceInput): Future[js.Object] = service.stopNotebookInstance(params).promise().toFuture
    @inline def stopPipelineExecutionFuture(params: StopPipelineExecutionRequest): Future[StopPipelineExecutionResponse] = service.stopPipelineExecution(params).promise().toFuture
    @inline def stopProcessingJobFuture(params: StopProcessingJobRequest): Future[js.Object] = service.stopProcessingJob(params).promise().toFuture
    @inline def stopTrainingJobFuture(params: StopTrainingJobRequest): Future[js.Object] = service.stopTrainingJob(params).promise().toFuture
    @inline def stopTransformJobFuture(params: StopTransformJobRequest): Future[js.Object] = service.stopTransformJob(params).promise().toFuture
    @inline def updateActionFuture(params: UpdateActionRequest): Future[UpdateActionResponse] = service.updateAction(params).promise().toFuture
    @inline def updateAppImageConfigFuture(params: UpdateAppImageConfigRequest): Future[UpdateAppImageConfigResponse] = service.updateAppImageConfig(params).promise().toFuture
    @inline def updateArtifactFuture(params: UpdateArtifactRequest): Future[UpdateArtifactResponse] = service.updateArtifact(params).promise().toFuture
    @inline def updateCodeRepositoryFuture(params: UpdateCodeRepositoryInput): Future[UpdateCodeRepositoryOutput] = service.updateCodeRepository(params).promise().toFuture
    @inline def updateContextFuture(params: UpdateContextRequest): Future[UpdateContextResponse] = service.updateContext(params).promise().toFuture
    @inline def updateDeviceFleetFuture(params: UpdateDeviceFleetRequest): Future[js.Object] = service.updateDeviceFleet(params).promise().toFuture
    @inline def updateDevicesFuture(params: UpdateDevicesRequest): Future[js.Object] = service.updateDevices(params).promise().toFuture
    @inline def updateDomainFuture(params: UpdateDomainRequest): Future[UpdateDomainResponse] = service.updateDomain(params).promise().toFuture
    @inline def updateEndpointFuture(params: UpdateEndpointInput): Future[UpdateEndpointOutput] = service.updateEndpoint(params).promise().toFuture
    @inline def updateEndpointWeightsAndCapacitiesFuture(params: UpdateEndpointWeightsAndCapacitiesInput): Future[UpdateEndpointWeightsAndCapacitiesOutput] = service.updateEndpointWeightsAndCapacities(params).promise().toFuture
    @inline def updateExperimentFuture(params: UpdateExperimentRequest): Future[UpdateExperimentResponse] = service.updateExperiment(params).promise().toFuture
    @inline def updateImageFuture(params: UpdateImageRequest): Future[UpdateImageResponse] = service.updateImage(params).promise().toFuture
    @inline def updateModelPackageFuture(params: UpdateModelPackageInput): Future[UpdateModelPackageOutput] = service.updateModelPackage(params).promise().toFuture
    @inline def updateMonitoringScheduleFuture(params: UpdateMonitoringScheduleRequest): Future[UpdateMonitoringScheduleResponse] = service.updateMonitoringSchedule(params).promise().toFuture
    @inline def updateNotebookInstanceFuture(params: UpdateNotebookInstanceInput): Future[UpdateNotebookInstanceOutput] = service.updateNotebookInstance(params).promise().toFuture
    @inline def updateNotebookInstanceLifecycleConfigFuture(params: UpdateNotebookInstanceLifecycleConfigInput): Future[UpdateNotebookInstanceLifecycleConfigOutput] = service.updateNotebookInstanceLifecycleConfig(params).promise().toFuture
    @inline def updatePipelineExecutionFuture(params: UpdatePipelineExecutionRequest): Future[UpdatePipelineExecutionResponse] = service.updatePipelineExecution(params).promise().toFuture
    @inline def updatePipelineFuture(params: UpdatePipelineRequest): Future[UpdatePipelineResponse] = service.updatePipeline(params).promise().toFuture
    @inline def updateTrainingJobFuture(params: UpdateTrainingJobRequest): Future[UpdateTrainingJobResponse] = service.updateTrainingJob(params).promise().toFuture
    @inline def updateTrialComponentFuture(params: UpdateTrialComponentRequest): Future[UpdateTrialComponentResponse] = service.updateTrialComponent(params).promise().toFuture
    @inline def updateTrialFuture(params: UpdateTrialRequest): Future[UpdateTrialResponse] = service.updateTrial(params).promise().toFuture
    @inline def updateUserProfileFuture(params: UpdateUserProfileRequest): Future[UpdateUserProfileResponse] = service.updateUserProfile(params).promise().toFuture
    @inline def updateWorkforceFuture(params: UpdateWorkforceRequest): Future[UpdateWorkforceResponse] = service.updateWorkforce(params).promise().toFuture
    @inline def updateWorkteamFuture(params: UpdateWorkteamRequest): Future[UpdateWorkteamResponse] = service.updateWorkteam(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/sagemaker", JSImport.Namespace, "AWS.SageMaker")
  class SageMaker() extends js.Object {
    def this(config: AWSConfig) = this()

    def addAssociation(params: AddAssociationRequest): Request[AddAssociationResponse] = js.native
    def addTags(params: AddTagsInput): Request[AddTagsOutput] = js.native
    def associateTrialComponent(params: AssociateTrialComponentRequest): Request[AssociateTrialComponentResponse] = js.native
    def createAction(params: CreateActionRequest): Request[CreateActionResponse] = js.native
    def createAlgorithm(params: CreateAlgorithmInput): Request[CreateAlgorithmOutput] = js.native
    def createApp(params: CreateAppRequest): Request[CreateAppResponse] = js.native
    def createAppImageConfig(params: CreateAppImageConfigRequest): Request[CreateAppImageConfigResponse] = js.native
    def createArtifact(params: CreateArtifactRequest): Request[CreateArtifactResponse] = js.native
    def createAutoMLJob(params: CreateAutoMLJobRequest): Request[CreateAutoMLJobResponse] = js.native
    def createCodeRepository(params: CreateCodeRepositoryInput): Request[CreateCodeRepositoryOutput] = js.native
    def createCompilationJob(params: CreateCompilationJobRequest): Request[CreateCompilationJobResponse] = js.native
    def createContext(params: CreateContextRequest): Request[CreateContextResponse] = js.native
    def createDataQualityJobDefinition(params: CreateDataQualityJobDefinitionRequest): Request[CreateDataQualityJobDefinitionResponse] = js.native
    def createDeviceFleet(params: CreateDeviceFleetRequest): Request[js.Object] = js.native
    def createDomain(params: CreateDomainRequest): Request[CreateDomainResponse] = js.native
    def createEdgePackagingJob(params: CreateEdgePackagingJobRequest): Request[js.Object] = js.native
    def createEndpoint(params: CreateEndpointInput): Request[CreateEndpointOutput] = js.native
    def createEndpointConfig(params: CreateEndpointConfigInput): Request[CreateEndpointConfigOutput] = js.native
    def createExperiment(params: CreateExperimentRequest): Request[CreateExperimentResponse] = js.native
    def createFeatureGroup(params: CreateFeatureGroupRequest): Request[CreateFeatureGroupResponse] = js.native
    def createFlowDefinition(params: CreateFlowDefinitionRequest): Request[CreateFlowDefinitionResponse] = js.native
    def createHumanTaskUi(params: CreateHumanTaskUiRequest): Request[CreateHumanTaskUiResponse] = js.native
    def createHyperParameterTuningJob(params: CreateHyperParameterTuningJobRequest): Request[CreateHyperParameterTuningJobResponse] = js.native
    def createImage(params: CreateImageRequest): Request[CreateImageResponse] = js.native
    def createImageVersion(params: CreateImageVersionRequest): Request[CreateImageVersionResponse] = js.native
    def createLabelingJob(params: CreateLabelingJobRequest): Request[CreateLabelingJobResponse] = js.native
    def createModel(params: CreateModelInput): Request[CreateModelOutput] = js.native
    def createModelBiasJobDefinition(params: CreateModelBiasJobDefinitionRequest): Request[CreateModelBiasJobDefinitionResponse] = js.native
    def createModelExplainabilityJobDefinition(params: CreateModelExplainabilityJobDefinitionRequest): Request[CreateModelExplainabilityJobDefinitionResponse] = js.native
    def createModelPackage(params: CreateModelPackageInput): Request[CreateModelPackageOutput] = js.native
    def createModelPackageGroup(params: CreateModelPackageGroupInput): Request[CreateModelPackageGroupOutput] = js.native
    def createModelQualityJobDefinition(params: CreateModelQualityJobDefinitionRequest): Request[CreateModelQualityJobDefinitionResponse] = js.native
    def createMonitoringSchedule(params: CreateMonitoringScheduleRequest): Request[CreateMonitoringScheduleResponse] = js.native
    def createNotebookInstance(params: CreateNotebookInstanceInput): Request[CreateNotebookInstanceOutput] = js.native
    def createNotebookInstanceLifecycleConfig(params: CreateNotebookInstanceLifecycleConfigInput): Request[CreateNotebookInstanceLifecycleConfigOutput] = js.native
    def createPipeline(params: CreatePipelineRequest): Request[CreatePipelineResponse] = js.native
    def createPresignedDomainUrl(params: CreatePresignedDomainUrlRequest): Request[CreatePresignedDomainUrlResponse] = js.native
    def createPresignedNotebookInstanceUrl(params: CreatePresignedNotebookInstanceUrlInput): Request[CreatePresignedNotebookInstanceUrlOutput] = js.native
    def createProcessingJob(params: CreateProcessingJobRequest): Request[CreateProcessingJobResponse] = js.native
    def createProject(params: CreateProjectInput): Request[CreateProjectOutput] = js.native
    def createTrainingJob(params: CreateTrainingJobRequest): Request[CreateTrainingJobResponse] = js.native
    def createTransformJob(params: CreateTransformJobRequest): Request[CreateTransformJobResponse] = js.native
    def createTrial(params: CreateTrialRequest): Request[CreateTrialResponse] = js.native
    def createTrialComponent(params: CreateTrialComponentRequest): Request[CreateTrialComponentResponse] = js.native
    def createUserProfile(params: CreateUserProfileRequest): Request[CreateUserProfileResponse] = js.native
    def createWorkforce(params: CreateWorkforceRequest): Request[CreateWorkforceResponse] = js.native
    def createWorkteam(params: CreateWorkteamRequest): Request[CreateWorkteamResponse] = js.native
    def deleteAction(params: DeleteActionRequest): Request[DeleteActionResponse] = js.native
    def deleteAlgorithm(params: DeleteAlgorithmInput): Request[js.Object] = js.native
    def deleteApp(params: DeleteAppRequest): Request[js.Object] = js.native
    def deleteAppImageConfig(params: DeleteAppImageConfigRequest): Request[js.Object] = js.native
    def deleteArtifact(params: DeleteArtifactRequest): Request[DeleteArtifactResponse] = js.native
    def deleteAssociation(params: DeleteAssociationRequest): Request[DeleteAssociationResponse] = js.native
    def deleteCodeRepository(params: DeleteCodeRepositoryInput): Request[js.Object] = js.native
    def deleteContext(params: DeleteContextRequest): Request[DeleteContextResponse] = js.native
    def deleteDataQualityJobDefinition(params: DeleteDataQualityJobDefinitionRequest): Request[js.Object] = js.native
    def deleteDeviceFleet(params: DeleteDeviceFleetRequest): Request[js.Object] = js.native
    def deleteDomain(params: DeleteDomainRequest): Request[js.Object] = js.native
    def deleteEndpoint(params: DeleteEndpointInput): Request[js.Object] = js.native
    def deleteEndpointConfig(params: DeleteEndpointConfigInput): Request[js.Object] = js.native
    def deleteExperiment(params: DeleteExperimentRequest): Request[DeleteExperimentResponse] = js.native
    def deleteFeatureGroup(params: DeleteFeatureGroupRequest): Request[js.Object] = js.native
    def deleteFlowDefinition(params: DeleteFlowDefinitionRequest): Request[DeleteFlowDefinitionResponse] = js.native
    def deleteHumanTaskUi(params: DeleteHumanTaskUiRequest): Request[DeleteHumanTaskUiResponse] = js.native
    def deleteImage(params: DeleteImageRequest): Request[DeleteImageResponse] = js.native
    def deleteImageVersion(params: DeleteImageVersionRequest): Request[DeleteImageVersionResponse] = js.native
    def deleteModel(params: DeleteModelInput): Request[js.Object] = js.native
    def deleteModelBiasJobDefinition(params: DeleteModelBiasJobDefinitionRequest): Request[js.Object] = js.native
    def deleteModelExplainabilityJobDefinition(params: DeleteModelExplainabilityJobDefinitionRequest): Request[js.Object] = js.native
    def deleteModelPackage(params: DeleteModelPackageInput): Request[js.Object] = js.native
    def deleteModelPackageGroup(params: DeleteModelPackageGroupInput): Request[js.Object] = js.native
    def deleteModelPackageGroupPolicy(params: DeleteModelPackageGroupPolicyInput): Request[js.Object] = js.native
    def deleteModelQualityJobDefinition(params: DeleteModelQualityJobDefinitionRequest): Request[js.Object] = js.native
    def deleteMonitoringSchedule(params: DeleteMonitoringScheduleRequest): Request[js.Object] = js.native
    def deleteNotebookInstance(params: DeleteNotebookInstanceInput): Request[js.Object] = js.native
    def deleteNotebookInstanceLifecycleConfig(params: DeleteNotebookInstanceLifecycleConfigInput): Request[js.Object] = js.native
    def deletePipeline(params: DeletePipelineRequest): Request[DeletePipelineResponse] = js.native
    def deleteProject(params: DeleteProjectInput): Request[js.Object] = js.native
    def deleteTags(params: DeleteTagsInput): Request[DeleteTagsOutput] = js.native
    def deleteTrial(params: DeleteTrialRequest): Request[DeleteTrialResponse] = js.native
    def deleteTrialComponent(params: DeleteTrialComponentRequest): Request[DeleteTrialComponentResponse] = js.native
    def deleteUserProfile(params: DeleteUserProfileRequest): Request[js.Object] = js.native
    def deleteWorkforce(params: DeleteWorkforceRequest): Request[DeleteWorkforceResponse] = js.native
    def deleteWorkteam(params: DeleteWorkteamRequest): Request[DeleteWorkteamResponse] = js.native
    def deregisterDevices(params: DeregisterDevicesRequest): Request[js.Object] = js.native
    def describeAction(params: DescribeActionRequest): Request[DescribeActionResponse] = js.native
    def describeAlgorithm(params: DescribeAlgorithmInput): Request[DescribeAlgorithmOutput] = js.native
    def describeApp(params: DescribeAppRequest): Request[DescribeAppResponse] = js.native
    def describeAppImageConfig(params: DescribeAppImageConfigRequest): Request[DescribeAppImageConfigResponse] = js.native
    def describeArtifact(params: DescribeArtifactRequest): Request[DescribeArtifactResponse] = js.native
    def describeAutoMLJob(params: DescribeAutoMLJobRequest): Request[DescribeAutoMLJobResponse] = js.native
    def describeCodeRepository(params: DescribeCodeRepositoryInput): Request[DescribeCodeRepositoryOutput] = js.native
    def describeCompilationJob(params: DescribeCompilationJobRequest): Request[DescribeCompilationJobResponse] = js.native
    def describeContext(params: DescribeContextRequest): Request[DescribeContextResponse] = js.native
    def describeDataQualityJobDefinition(params: DescribeDataQualityJobDefinitionRequest): Request[DescribeDataQualityJobDefinitionResponse] = js.native
    def describeDevice(params: DescribeDeviceRequest): Request[DescribeDeviceResponse] = js.native
    def describeDeviceFleet(params: DescribeDeviceFleetRequest): Request[DescribeDeviceFleetResponse] = js.native
    def describeDomain(params: DescribeDomainRequest): Request[DescribeDomainResponse] = js.native
    def describeEdgePackagingJob(params: DescribeEdgePackagingJobRequest): Request[DescribeEdgePackagingJobResponse] = js.native
    def describeEndpoint(params: DescribeEndpointInput): Request[DescribeEndpointOutput] = js.native
    def describeEndpointConfig(params: DescribeEndpointConfigInput): Request[DescribeEndpointConfigOutput] = js.native
    def describeExperiment(params: DescribeExperimentRequest): Request[DescribeExperimentResponse] = js.native
    def describeFeatureGroup(params: DescribeFeatureGroupRequest): Request[DescribeFeatureGroupResponse] = js.native
    def describeFlowDefinition(params: DescribeFlowDefinitionRequest): Request[DescribeFlowDefinitionResponse] = js.native
    def describeHumanTaskUi(params: DescribeHumanTaskUiRequest): Request[DescribeHumanTaskUiResponse] = js.native
    def describeHyperParameterTuningJob(params: DescribeHyperParameterTuningJobRequest): Request[DescribeHyperParameterTuningJobResponse] = js.native
    def describeImage(params: DescribeImageRequest): Request[DescribeImageResponse] = js.native
    def describeImageVersion(params: DescribeImageVersionRequest): Request[DescribeImageVersionResponse] = js.native
    def describeLabelingJob(params: DescribeLabelingJobRequest): Request[DescribeLabelingJobResponse] = js.native
    def describeModel(params: DescribeModelInput): Request[DescribeModelOutput] = js.native
    def describeModelBiasJobDefinition(params: DescribeModelBiasJobDefinitionRequest): Request[DescribeModelBiasJobDefinitionResponse] = js.native
    def describeModelExplainabilityJobDefinition(params: DescribeModelExplainabilityJobDefinitionRequest): Request[DescribeModelExplainabilityJobDefinitionResponse] = js.native
    def describeModelPackage(params: DescribeModelPackageInput): Request[DescribeModelPackageOutput] = js.native
    def describeModelPackageGroup(params: DescribeModelPackageGroupInput): Request[DescribeModelPackageGroupOutput] = js.native
    def describeModelQualityJobDefinition(params: DescribeModelQualityJobDefinitionRequest): Request[DescribeModelQualityJobDefinitionResponse] = js.native
    def describeMonitoringSchedule(params: DescribeMonitoringScheduleRequest): Request[DescribeMonitoringScheduleResponse] = js.native
    def describeNotebookInstance(params: DescribeNotebookInstanceInput): Request[DescribeNotebookInstanceOutput] = js.native
    def describeNotebookInstanceLifecycleConfig(params: DescribeNotebookInstanceLifecycleConfigInput): Request[DescribeNotebookInstanceLifecycleConfigOutput] = js.native
    def describePipeline(params: DescribePipelineRequest): Request[DescribePipelineResponse] = js.native
    def describePipelineDefinitionForExecution(params: DescribePipelineDefinitionForExecutionRequest): Request[DescribePipelineDefinitionForExecutionResponse] = js.native
    def describePipelineExecution(params: DescribePipelineExecutionRequest): Request[DescribePipelineExecutionResponse] = js.native
    def describeProcessingJob(params: DescribeProcessingJobRequest): Request[DescribeProcessingJobResponse] = js.native
    def describeProject(params: DescribeProjectInput): Request[DescribeProjectOutput] = js.native
    def describeSubscribedWorkteam(params: DescribeSubscribedWorkteamRequest): Request[DescribeSubscribedWorkteamResponse] = js.native
    def describeTrainingJob(params: DescribeTrainingJobRequest): Request[DescribeTrainingJobResponse] = js.native
    def describeTransformJob(params: DescribeTransformJobRequest): Request[DescribeTransformJobResponse] = js.native
    def describeTrial(params: DescribeTrialRequest): Request[DescribeTrialResponse] = js.native
    def describeTrialComponent(params: DescribeTrialComponentRequest): Request[DescribeTrialComponentResponse] = js.native
    def describeUserProfile(params: DescribeUserProfileRequest): Request[DescribeUserProfileResponse] = js.native
    def describeWorkforce(params: DescribeWorkforceRequest): Request[DescribeWorkforceResponse] = js.native
    def describeWorkteam(params: DescribeWorkteamRequest): Request[DescribeWorkteamResponse] = js.native
    def disableSagemakerServicecatalogPortfolio(params: DisableSagemakerServicecatalogPortfolioInput): Request[DisableSagemakerServicecatalogPortfolioOutput] = js.native
    def disassociateTrialComponent(params: DisassociateTrialComponentRequest): Request[DisassociateTrialComponentResponse] = js.native
    def enableSagemakerServicecatalogPortfolio(params: EnableSagemakerServicecatalogPortfolioInput): Request[EnableSagemakerServicecatalogPortfolioOutput] = js.native
    def getDeviceFleetReport(params: GetDeviceFleetReportRequest): Request[GetDeviceFleetReportResponse] = js.native
    def getModelPackageGroupPolicy(params: GetModelPackageGroupPolicyInput): Request[GetModelPackageGroupPolicyOutput] = js.native
    def getSagemakerServicecatalogPortfolioStatus(params: GetSagemakerServicecatalogPortfolioStatusInput): Request[GetSagemakerServicecatalogPortfolioStatusOutput] = js.native
    def getSearchSuggestions(params: GetSearchSuggestionsRequest): Request[GetSearchSuggestionsResponse] = js.native
    def listActions(params: ListActionsRequest): Request[ListActionsResponse] = js.native
    def listAlgorithms(params: ListAlgorithmsInput): Request[ListAlgorithmsOutput] = js.native
    def listAppImageConfigs(params: ListAppImageConfigsRequest): Request[ListAppImageConfigsResponse] = js.native
    def listApps(params: ListAppsRequest): Request[ListAppsResponse] = js.native
    def listArtifacts(params: ListArtifactsRequest): Request[ListArtifactsResponse] = js.native
    def listAssociations(params: ListAssociationsRequest): Request[ListAssociationsResponse] = js.native
    def listAutoMLJobs(params: ListAutoMLJobsRequest): Request[ListAutoMLJobsResponse] = js.native
    def listCandidatesForAutoMLJob(params: ListCandidatesForAutoMLJobRequest): Request[ListCandidatesForAutoMLJobResponse] = js.native
    def listCodeRepositories(params: ListCodeRepositoriesInput): Request[ListCodeRepositoriesOutput] = js.native
    def listCompilationJobs(params: ListCompilationJobsRequest): Request[ListCompilationJobsResponse] = js.native
    def listContexts(params: ListContextsRequest): Request[ListContextsResponse] = js.native
    def listDataQualityJobDefinitions(params: ListDataQualityJobDefinitionsRequest): Request[ListDataQualityJobDefinitionsResponse] = js.native
    def listDeviceFleets(params: ListDeviceFleetsRequest): Request[ListDeviceFleetsResponse] = js.native
    def listDevices(params: ListDevicesRequest): Request[ListDevicesResponse] = js.native
    def listDomains(params: ListDomainsRequest): Request[ListDomainsResponse] = js.native
    def listEdgePackagingJobs(params: ListEdgePackagingJobsRequest): Request[ListEdgePackagingJobsResponse] = js.native
    def listEndpointConfigs(params: ListEndpointConfigsInput): Request[ListEndpointConfigsOutput] = js.native
    def listEndpoints(params: ListEndpointsInput): Request[ListEndpointsOutput] = js.native
    def listExperiments(params: ListExperimentsRequest): Request[ListExperimentsResponse] = js.native
    def listFeatureGroups(params: ListFeatureGroupsRequest): Request[ListFeatureGroupsResponse] = js.native
    def listFlowDefinitions(params: ListFlowDefinitionsRequest): Request[ListFlowDefinitionsResponse] = js.native
    def listHumanTaskUis(params: ListHumanTaskUisRequest): Request[ListHumanTaskUisResponse] = js.native
    def listHyperParameterTuningJobs(params: ListHyperParameterTuningJobsRequest): Request[ListHyperParameterTuningJobsResponse] = js.native
    def listImageVersions(params: ListImageVersionsRequest): Request[ListImageVersionsResponse] = js.native
    def listImages(params: ListImagesRequest): Request[ListImagesResponse] = js.native
    def listLabelingJobs(params: ListLabelingJobsRequest): Request[ListLabelingJobsResponse] = js.native
    def listLabelingJobsForWorkteam(params: ListLabelingJobsForWorkteamRequest): Request[ListLabelingJobsForWorkteamResponse] = js.native
    def listModelBiasJobDefinitions(params: ListModelBiasJobDefinitionsRequest): Request[ListModelBiasJobDefinitionsResponse] = js.native
    def listModelExplainabilityJobDefinitions(params: ListModelExplainabilityJobDefinitionsRequest): Request[ListModelExplainabilityJobDefinitionsResponse] = js.native
    def listModelPackageGroups(params: ListModelPackageGroupsInput): Request[ListModelPackageGroupsOutput] = js.native
    def listModelPackages(params: ListModelPackagesInput): Request[ListModelPackagesOutput] = js.native
    def listModelQualityJobDefinitions(params: ListModelQualityJobDefinitionsRequest): Request[ListModelQualityJobDefinitionsResponse] = js.native
    def listModels(params: ListModelsInput): Request[ListModelsOutput] = js.native
    def listMonitoringExecutions(params: ListMonitoringExecutionsRequest): Request[ListMonitoringExecutionsResponse] = js.native
    def listMonitoringSchedules(params: ListMonitoringSchedulesRequest): Request[ListMonitoringSchedulesResponse] = js.native
    def listNotebookInstanceLifecycleConfigs(params: ListNotebookInstanceLifecycleConfigsInput): Request[ListNotebookInstanceLifecycleConfigsOutput] = js.native
    def listNotebookInstances(params: ListNotebookInstancesInput): Request[ListNotebookInstancesOutput] = js.native
    def listPipelineExecutionSteps(params: ListPipelineExecutionStepsRequest): Request[ListPipelineExecutionStepsResponse] = js.native
    def listPipelineExecutions(params: ListPipelineExecutionsRequest): Request[ListPipelineExecutionsResponse] = js.native
    def listPipelineParametersForExecution(params: ListPipelineParametersForExecutionRequest): Request[ListPipelineParametersForExecutionResponse] = js.native
    def listPipelines(params: ListPipelinesRequest): Request[ListPipelinesResponse] = js.native
    def listProcessingJobs(params: ListProcessingJobsRequest): Request[ListProcessingJobsResponse] = js.native
    def listProjects(params: ListProjectsInput): Request[ListProjectsOutput] = js.native
    def listSubscribedWorkteams(params: ListSubscribedWorkteamsRequest): Request[ListSubscribedWorkteamsResponse] = js.native
    def listTags(params: ListTagsInput): Request[ListTagsOutput] = js.native
    def listTrainingJobs(params: ListTrainingJobsRequest): Request[ListTrainingJobsResponse] = js.native
    def listTrainingJobsForHyperParameterTuningJob(params: ListTrainingJobsForHyperParameterTuningJobRequest): Request[ListTrainingJobsForHyperParameterTuningJobResponse] = js.native
    def listTransformJobs(params: ListTransformJobsRequest): Request[ListTransformJobsResponse] = js.native
    def listTrialComponents(params: ListTrialComponentsRequest): Request[ListTrialComponentsResponse] = js.native
    def listTrials(params: ListTrialsRequest): Request[ListTrialsResponse] = js.native
    def listUserProfiles(params: ListUserProfilesRequest): Request[ListUserProfilesResponse] = js.native
    def listWorkforces(params: ListWorkforcesRequest): Request[ListWorkforcesResponse] = js.native
    def listWorkteams(params: ListWorkteamsRequest): Request[ListWorkteamsResponse] = js.native
    def putModelPackageGroupPolicy(params: PutModelPackageGroupPolicyInput): Request[PutModelPackageGroupPolicyOutput] = js.native
    def registerDevices(params: RegisterDevicesRequest): Request[js.Object] = js.native
    def renderUiTemplate(params: RenderUiTemplateRequest): Request[RenderUiTemplateResponse] = js.native
    def search(params: SearchRequest): Request[SearchResponse] = js.native
    def startMonitoringSchedule(params: StartMonitoringScheduleRequest): Request[js.Object] = js.native
    def startNotebookInstance(params: StartNotebookInstanceInput): Request[js.Object] = js.native
    def startPipelineExecution(params: StartPipelineExecutionRequest): Request[StartPipelineExecutionResponse] = js.native
    def stopAutoMLJob(params: StopAutoMLJobRequest): Request[js.Object] = js.native
    def stopCompilationJob(params: StopCompilationJobRequest): Request[js.Object] = js.native
    def stopEdgePackagingJob(params: StopEdgePackagingJobRequest): Request[js.Object] = js.native
    def stopHyperParameterTuningJob(params: StopHyperParameterTuningJobRequest): Request[js.Object] = js.native
    def stopLabelingJob(params: StopLabelingJobRequest): Request[js.Object] = js.native
    def stopMonitoringSchedule(params: StopMonitoringScheduleRequest): Request[js.Object] = js.native
    def stopNotebookInstance(params: StopNotebookInstanceInput): Request[js.Object] = js.native
    def stopPipelineExecution(params: StopPipelineExecutionRequest): Request[StopPipelineExecutionResponse] = js.native
    def stopProcessingJob(params: StopProcessingJobRequest): Request[js.Object] = js.native
    def stopTrainingJob(params: StopTrainingJobRequest): Request[js.Object] = js.native
    def stopTransformJob(params: StopTransformJobRequest): Request[js.Object] = js.native
    def updateAction(params: UpdateActionRequest): Request[UpdateActionResponse] = js.native
    def updateAppImageConfig(params: UpdateAppImageConfigRequest): Request[UpdateAppImageConfigResponse] = js.native
    def updateArtifact(params: UpdateArtifactRequest): Request[UpdateArtifactResponse] = js.native
    def updateCodeRepository(params: UpdateCodeRepositoryInput): Request[UpdateCodeRepositoryOutput] = js.native
    def updateContext(params: UpdateContextRequest): Request[UpdateContextResponse] = js.native
    def updateDeviceFleet(params: UpdateDeviceFleetRequest): Request[js.Object] = js.native
    def updateDevices(params: UpdateDevicesRequest): Request[js.Object] = js.native
    def updateDomain(params: UpdateDomainRequest): Request[UpdateDomainResponse] = js.native
    def updateEndpoint(params: UpdateEndpointInput): Request[UpdateEndpointOutput] = js.native
    def updateEndpointWeightsAndCapacities(params: UpdateEndpointWeightsAndCapacitiesInput): Request[UpdateEndpointWeightsAndCapacitiesOutput] = js.native
    def updateExperiment(params: UpdateExperimentRequest): Request[UpdateExperimentResponse] = js.native
    def updateImage(params: UpdateImageRequest): Request[UpdateImageResponse] = js.native
    def updateModelPackage(params: UpdateModelPackageInput): Request[UpdateModelPackageOutput] = js.native
    def updateMonitoringSchedule(params: UpdateMonitoringScheduleRequest): Request[UpdateMonitoringScheduleResponse] = js.native
    def updateNotebookInstance(params: UpdateNotebookInstanceInput): Request[UpdateNotebookInstanceOutput] = js.native
    def updateNotebookInstanceLifecycleConfig(params: UpdateNotebookInstanceLifecycleConfigInput): Request[UpdateNotebookInstanceLifecycleConfigOutput] = js.native
    def updatePipeline(params: UpdatePipelineRequest): Request[UpdatePipelineResponse] = js.native
    def updatePipelineExecution(params: UpdatePipelineExecutionRequest): Request[UpdatePipelineExecutionResponse] = js.native
    def updateTrainingJob(params: UpdateTrainingJobRequest): Request[UpdateTrainingJobResponse] = js.native
    def updateTrial(params: UpdateTrialRequest): Request[UpdateTrialResponse] = js.native
    def updateTrialComponent(params: UpdateTrialComponentRequest): Request[UpdateTrialComponentResponse] = js.native
    def updateUserProfile(params: UpdateUserProfileRequest): Request[UpdateUserProfileResponse] = js.native
    def updateWorkforce(params: UpdateWorkforceRequest): Request[UpdateWorkforceResponse] = js.native
    def updateWorkteam(params: UpdateWorkteamRequest): Request[UpdateWorkteamResponse] = js.native
  }
  object SageMaker {
    @inline implicit def toOps(service: SageMaker): SageMakerOps = {
      new SageMakerOps(service)
    }
  }

  /** A structure describing the source of an action.
    */
  @js.native
  trait ActionSource extends js.Object {
    var SourceUri: String2048
    var SourceId: js.UndefOr[String256]
    var SourceType: js.UndefOr[String256]
  }

  object ActionSource {
    @inline
    def apply(
        SourceUri: String2048,
        SourceId: js.UndefOr[String256] = js.undefined,
        SourceType: js.UndefOr[String256] = js.undefined
    ): ActionSource = {
      val __obj = js.Dynamic.literal(
        "SourceUri" -> SourceUri.asInstanceOf[js.Any]
      )

      SourceId.foreach(__v => __obj.updateDynamic("SourceId")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionSource]
    }
  }

  /** Lists the properties of an <i>action</i>. An action represents an action or activity. Some examples are a workflow step and a model deployment. Generally, an action involves at least one input artifact or output artifact.
    */
  @js.native
  trait ActionSummary extends js.Object {
    var ActionArn: js.UndefOr[ActionArn]
    var ActionName: js.UndefOr[ExperimentEntityName]
    var ActionType: js.UndefOr[String64]
    var CreationTime: js.UndefOr[Timestamp]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Source: js.UndefOr[ActionSource]
    var Status: js.UndefOr[ActionStatus]
  }

  object ActionSummary {
    @inline
    def apply(
        ActionArn: js.UndefOr[ActionArn] = js.undefined,
        ActionName: js.UndefOr[ExperimentEntityName] = js.undefined,
        ActionType: js.UndefOr[String64] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Source: js.UndefOr[ActionSource] = js.undefined,
        Status: js.UndefOr[ActionStatus] = js.undefined
    ): ActionSummary = {
      val __obj = js.Dynamic.literal()
      ActionArn.foreach(__v => __obj.updateDynamic("ActionArn")(__v.asInstanceOf[js.Any]))
      ActionName.foreach(__v => __obj.updateDynamic("ActionName")(__v.asInstanceOf[js.Any]))
      ActionType.foreach(__v => __obj.updateDynamic("ActionType")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionSummary]
    }
  }

  @js.native
  trait AddAssociationRequest extends js.Object {
    var DestinationArn: AssociationEntityArn
    var SourceArn: AssociationEntityArn
    var AssociationType: js.UndefOr[AssociationEdgeType]
  }

  object AddAssociationRequest {
    @inline
    def apply(
        DestinationArn: AssociationEntityArn,
        SourceArn: AssociationEntityArn,
        AssociationType: js.UndefOr[AssociationEdgeType] = js.undefined
    ): AddAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "DestinationArn" -> DestinationArn.asInstanceOf[js.Any],
        "SourceArn" -> SourceArn.asInstanceOf[js.Any]
      )

      AssociationType.foreach(__v => __obj.updateDynamic("AssociationType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddAssociationRequest]
    }
  }

  @js.native
  trait AddAssociationResponse extends js.Object {
    var DestinationArn: js.UndefOr[AssociationEntityArn]
    var SourceArn: js.UndefOr[AssociationEntityArn]
  }

  object AddAssociationResponse {
    @inline
    def apply(
        DestinationArn: js.UndefOr[AssociationEntityArn] = js.undefined,
        SourceArn: js.UndefOr[AssociationEntityArn] = js.undefined
    ): AddAssociationResponse = {
      val __obj = js.Dynamic.literal()
      DestinationArn.foreach(__v => __obj.updateDynamic("DestinationArn")(__v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddAssociationResponse]
    }
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
        "Tags" -> Tags.asInstanceOf[js.Any]
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

  /** Edge Manager agent version.
    */
  @js.native
  trait AgentVersion extends js.Object {
    var AgentCount: Double
    var Version: EdgeVersion
  }

  object AgentVersion {
    @inline
    def apply(
        AgentCount: Double,
        Version: EdgeVersion
    ): AgentVersion = {
      val __obj = js.Dynamic.literal(
        "AgentCount" -> AgentCount.asInstanceOf[js.Any],
        "Version" -> Version.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AgentVersion]
    }
  }

  /** This API is not supported.
    */
  @js.native
  trait Alarm extends js.Object {
    var AlarmName: js.UndefOr[AlarmName]
  }

  object Alarm {
    @inline
    def apply(
        AlarmName: js.UndefOr[AlarmName] = js.undefined
    ): Alarm = {
      val __obj = js.Dynamic.literal()
      AlarmName.foreach(__v => __obj.updateDynamic("AlarmName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Alarm]
    }
  }

  /** Specifies the training algorithm to use in a <a>CreateTrainingJob</a> request. For more information about algorithms provided by Amazon SageMaker, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html|Algorithms]]. For information about using your own algorithms, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html|Using Your Own Algorithms with Amazon SageMaker]].
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
      EnableSageMakerMetricsTimeSeries.foreach(__v => __obj.updateDynamic("EnableSageMakerMetricsTimeSeries")(__v.asInstanceOf[js.Any]))
      MetricDefinitions.foreach(__v => __obj.updateDynamic("MetricDefinitions")(__v.asInstanceOf[js.Any]))
      TrainingImage.foreach(__v => __obj.updateDynamic("TrainingImage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlgorithmSpecification]
    }
  }

  /** Specifies the validation and image scan statuses of the algorithm.
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

  /** Represents the overall status of an algorithm.
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
        "Name" -> Name.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlgorithmStatusItem]
    }
  }

  /** Provides summary information about an algorithm.
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
        "AlgorithmArn" -> AlgorithmArn.asInstanceOf[js.Any],
        "AlgorithmName" -> AlgorithmName.asInstanceOf[js.Any],
        "AlgorithmStatus" -> AlgorithmStatus.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any]
      )

      AlgorithmDescription.foreach(__v => __obj.updateDynamic("AlgorithmDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlgorithmSummary]
    }
  }

  /** Defines a training job and a batch transform job that Amazon SageMaker runs to validate your algorithm. The data provided in the validation profile is made available to your buyers on AWS Marketplace.
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
        "ProfileName" -> ProfileName.asInstanceOf[js.Any],
        "TrainingJobDefinition" -> TrainingJobDefinition.asInstanceOf[js.Any]
      )

      TransformJobDefinition.foreach(__v => __obj.updateDynamic("TransformJobDefinition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlgorithmValidationProfile]
    }
  }

  /** Specifies configurations for one or more training jobs that Amazon SageMaker runs to test the algorithm.
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
        "ValidationRole" -> ValidationRole.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AlgorithmValidationSpecification]
    }
  }

  /** Configures how labels are consolidated across human workers and processes output data.
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

  /** Details about an Amazon SageMaker app.
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

  /** The configuration for running a SageMaker image as a KernelGateway app.
    */
  @js.native
  trait AppImageConfigDetails extends js.Object {
    var AppImageConfigArn: js.UndefOr[AppImageConfigArn]
    var AppImageConfigName: js.UndefOr[AppImageConfigName]
    var CreationTime: js.UndefOr[Timestamp]
    var KernelGatewayImageConfig: js.UndefOr[KernelGatewayImageConfig]
    var LastModifiedTime: js.UndefOr[Timestamp]
  }

  object AppImageConfigDetails {
    @inline
    def apply(
        AppImageConfigArn: js.UndefOr[AppImageConfigArn] = js.undefined,
        AppImageConfigName: js.UndefOr[AppImageConfigName] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        KernelGatewayImageConfig: js.UndefOr[KernelGatewayImageConfig] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
    ): AppImageConfigDetails = {
      val __obj = js.Dynamic.literal()
      AppImageConfigArn.foreach(__v => __obj.updateDynamic("AppImageConfigArn")(__v.asInstanceOf[js.Any]))
      AppImageConfigName.foreach(__v => __obj.updateDynamic("AppImageConfigName")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      KernelGatewayImageConfig.foreach(__v => __obj.updateDynamic("KernelGatewayImageConfig")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppImageConfigDetails]
    }
  }

  /** Configuration to run a processing job in a specified container image.
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

  /** A structure describing the source of an artifact.
    */
  @js.native
  trait ArtifactSource extends js.Object {
    var SourceUri: String2048
    var SourceTypes: js.UndefOr[ArtifactSourceTypes]
  }

  object ArtifactSource {
    @inline
    def apply(
        SourceUri: String2048,
        SourceTypes: js.UndefOr[ArtifactSourceTypes] = js.undefined
    ): ArtifactSource = {
      val __obj = js.Dynamic.literal(
        "SourceUri" -> SourceUri.asInstanceOf[js.Any]
      )

      SourceTypes.foreach(__v => __obj.updateDynamic("SourceTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArtifactSource]
    }
  }

  /** The ID and ID type of an artifact source.
    */
  @js.native
  trait ArtifactSourceType extends js.Object {
    var SourceIdType: ArtifactSourceIdType
    var Value: String256
  }

  object ArtifactSourceType {
    @inline
    def apply(
        SourceIdType: ArtifactSourceIdType,
        Value: String256
    ): ArtifactSourceType = {
      val __obj = js.Dynamic.literal(
        "SourceIdType" -> SourceIdType.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ArtifactSourceType]
    }
  }

  /** Lists a summary of the properties of an artifact. An artifact represents a URI addressable object or data. Some examples are a dataset and a model.
    */
  @js.native
  trait ArtifactSummary extends js.Object {
    var ArtifactArn: js.UndefOr[ArtifactArn]
    var ArtifactName: js.UndefOr[ExperimentEntityName]
    var ArtifactType: js.UndefOr[String256]
    var CreationTime: js.UndefOr[Timestamp]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Source: js.UndefOr[ArtifactSource]
  }

  object ArtifactSummary {
    @inline
    def apply(
        ArtifactArn: js.UndefOr[ArtifactArn] = js.undefined,
        ArtifactName: js.UndefOr[ExperimentEntityName] = js.undefined,
        ArtifactType: js.UndefOr[String256] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Source: js.UndefOr[ArtifactSource] = js.undefined
    ): ArtifactSummary = {
      val __obj = js.Dynamic.literal()
      ArtifactArn.foreach(__v => __obj.updateDynamic("ArtifactArn")(__v.asInstanceOf[js.Any]))
      ArtifactName.foreach(__v => __obj.updateDynamic("ArtifactName")(__v.asInstanceOf[js.Any]))
      ArtifactType.foreach(__v => __obj.updateDynamic("ArtifactType")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArtifactSummary]
    }
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
        "TrialName" -> TrialName.asInstanceOf[js.Any]
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

  /** Lists a summary of the properties of an association. An association is an entity that links other lineage or experiment entities. An example would be an association between a training job and a model.
    */
  @js.native
  trait AssociationSummary extends js.Object {
    var AssociationType: js.UndefOr[AssociationEdgeType]
    var CreatedBy: js.UndefOr[UserContext]
    var CreationTime: js.UndefOr[Timestamp]
    var DestinationArn: js.UndefOr[AssociationEntityArn]
    var DestinationName: js.UndefOr[ExperimentEntityName]
    var DestinationType: js.UndefOr[String256]
    var SourceArn: js.UndefOr[AssociationEntityArn]
    var SourceName: js.UndefOr[ExperimentEntityName]
    var SourceType: js.UndefOr[String256]
  }

  object AssociationSummary {
    @inline
    def apply(
        AssociationType: js.UndefOr[AssociationEdgeType] = js.undefined,
        CreatedBy: js.UndefOr[UserContext] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DestinationArn: js.UndefOr[AssociationEntityArn] = js.undefined,
        DestinationName: js.UndefOr[ExperimentEntityName] = js.undefined,
        DestinationType: js.UndefOr[String256] = js.undefined,
        SourceArn: js.UndefOr[AssociationEntityArn] = js.undefined,
        SourceName: js.UndefOr[ExperimentEntityName] = js.undefined,
        SourceType: js.UndefOr[String256] = js.undefined
    ): AssociationSummary = {
      val __obj = js.Dynamic.literal()
      AssociationType.foreach(__v => __obj.updateDynamic("AssociationType")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DestinationArn.foreach(__v => __obj.updateDynamic("DestinationArn")(__v.asInstanceOf[js.Any]))
      DestinationName.foreach(__v => __obj.updateDynamic("DestinationName")(__v.asInstanceOf[js.Any]))
      DestinationType.foreach(__v => __obj.updateDynamic("DestinationType")(__v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      SourceName.foreach(__v => __obj.updateDynamic("SourceName")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociationSummary]
    }
  }

  /** Configuration for Athena Dataset Definition input.
    */
  @js.native
  trait AthenaDatasetDefinition extends js.Object {
    var Catalog: AthenaCatalog
    var Database: AthenaDatabase
    var OutputFormat: AthenaResultFormat
    var OutputS3Uri: S3Uri
    var QueryString: AthenaQueryString
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var OutputCompression: js.UndefOr[AthenaResultCompressionType]
    var WorkGroup: js.UndefOr[AthenaWorkGroup]
  }

  object AthenaDatasetDefinition {
    @inline
    def apply(
        Catalog: AthenaCatalog,
        Database: AthenaDatabase,
        OutputFormat: AthenaResultFormat,
        OutputS3Uri: S3Uri,
        QueryString: AthenaQueryString,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        OutputCompression: js.UndefOr[AthenaResultCompressionType] = js.undefined,
        WorkGroup: js.UndefOr[AthenaWorkGroup] = js.undefined
    ): AthenaDatasetDefinition = {
      val __obj = js.Dynamic.literal(
        "Catalog" -> Catalog.asInstanceOf[js.Any],
        "Database" -> Database.asInstanceOf[js.Any],
        "OutputFormat" -> OutputFormat.asInstanceOf[js.Any],
        "OutputS3Uri" -> OutputS3Uri.asInstanceOf[js.Any],
        "QueryString" -> QueryString.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      OutputCompression.foreach(__v => __obj.updateDynamic("OutputCompression")(__v.asInstanceOf[js.Any]))
      WorkGroup.foreach(__v => __obj.updateDynamic("WorkGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AthenaDatasetDefinition]
    }
  }

  /** An Autopilot job returns recommendations, or candidates. Each candidate has futher details about the steps involed, and the status.
    */
  @js.native
  trait AutoMLCandidate extends js.Object {
    var CandidateName: CandidateName
    var CandidateStatus: CandidateStatus
    var CandidateSteps: CandidateSteps
    var CreationTime: Timestamp
    var LastModifiedTime: Timestamp
    var ObjectiveStatus: ObjectiveStatus
    var CandidateProperties: js.UndefOr[CandidateProperties]
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
        CandidateProperties: js.UndefOr[CandidateProperties] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        FailureReason: js.UndefOr[AutoMLFailureReason] = js.undefined,
        FinalAutoMLJobObjectiveMetric: js.UndefOr[FinalAutoMLJobObjectiveMetric] = js.undefined,
        InferenceContainers: js.UndefOr[AutoMLContainerDefinitions] = js.undefined
    ): AutoMLCandidate = {
      val __obj = js.Dynamic.literal(
        "CandidateName" -> CandidateName.asInstanceOf[js.Any],
        "CandidateStatus" -> CandidateStatus.asInstanceOf[js.Any],
        "CandidateSteps" -> CandidateSteps.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "ObjectiveStatus" -> ObjectiveStatus.asInstanceOf[js.Any]
      )

      CandidateProperties.foreach(__v => __obj.updateDynamic("CandidateProperties")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      FinalAutoMLJobObjectiveMetric.foreach(__v => __obj.updateDynamic("FinalAutoMLJobObjectiveMetric")(__v.asInstanceOf[js.Any]))
      InferenceContainers.foreach(__v => __obj.updateDynamic("InferenceContainers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoMLCandidate]
    }
  }

  /** Information about the steps for a Candidate, and what step it is working on.
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
        "CandidateStepArn" -> CandidateStepArn.asInstanceOf[js.Any],
        "CandidateStepName" -> CandidateStepName.asInstanceOf[js.Any],
        "CandidateStepType" -> CandidateStepType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AutoMLCandidateStep]
    }
  }

  /** A channel is a named input source that training algorithms can consume. For more information, see .
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
        "DataSource" -> DataSource.asInstanceOf[js.Any],
        "TargetAttributeName" -> TargetAttributeName.asInstanceOf[js.Any]
      )

      CompressionType.foreach(__v => __obj.updateDynamic("CompressionType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoMLChannel]
    }
  }

  /** A list of container definitions that describe the different containers that make up an AutoML candidate. For more information, see .
    */
  @js.native
  trait AutoMLContainerDefinition extends js.Object {
    var Image: ContainerImage
    var ModelDataUrl: Url
    var Environment: js.UndefOr[EnvironmentMap]
  }

  object AutoMLContainerDefinition {
    @inline
    def apply(
        Image: ContainerImage,
        ModelDataUrl: Url,
        Environment: js.UndefOr[EnvironmentMap] = js.undefined
    ): AutoMLContainerDefinition = {
      val __obj = js.Dynamic.literal(
        "Image" -> Image.asInstanceOf[js.Any],
        "ModelDataUrl" -> ModelDataUrl.asInstanceOf[js.Any]
      )

      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoMLContainerDefinition]
    }
  }

  /** The data source for the Autopilot job.
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

  /** Artifacts that are generation during a job.
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
      CandidateDefinitionNotebookLocation.foreach(__v => __obj.updateDynamic("CandidateDefinitionNotebookLocation")(__v.asInstanceOf[js.Any]))
      DataExplorationNotebookLocation.foreach(__v => __obj.updateDynamic("DataExplorationNotebookLocation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoMLJobArtifacts]
    }
  }

  /** How long a job is allowed to run, or how many candidates a job is allowed to generate.
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
      MaxAutoMLJobRuntimeInSeconds.foreach(__v => __obj.updateDynamic("MaxAutoMLJobRuntimeInSeconds")(__v.asInstanceOf[js.Any]))
      MaxCandidates.foreach(__v => __obj.updateDynamic("MaxCandidates")(__v.asInstanceOf[js.Any]))
      MaxRuntimePerTrainingJobInSeconds.foreach(__v => __obj.updateDynamic("MaxRuntimePerTrainingJobInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoMLJobCompletionCriteria]
    }
  }

  /** A collection of settings used for an AutoML job.
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

  /** Specifies a metric to minimize or maximize as the objective of a job.
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

  /** Provides a summary about an AutoML job.
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
    var PartialFailureReasons: js.UndefOr[AutoMLPartialFailureReasons]
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
        FailureReason: js.UndefOr[AutoMLFailureReason] = js.undefined,
        PartialFailureReasons: js.UndefOr[AutoMLPartialFailureReasons] = js.undefined
    ): AutoMLJobSummary = {
      val __obj = js.Dynamic.literal(
        "AutoMLJobArn" -> AutoMLJobArn.asInstanceOf[js.Any],
        "AutoMLJobName" -> AutoMLJobName.asInstanceOf[js.Any],
        "AutoMLJobSecondaryStatus" -> AutoMLJobSecondaryStatus.asInstanceOf[js.Any],
        "AutoMLJobStatus" -> AutoMLJobStatus.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any]
      )

      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      PartialFailureReasons.foreach(__v => __obj.updateDynamic("PartialFailureReasons")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoMLJobSummary]
    }
  }

  /** The output data configuration.
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

  /** The reason for a partial failure of an AutoML job.
    */
  @js.native
  trait AutoMLPartialFailureReason extends js.Object {
    var PartialFailureMessage: js.UndefOr[AutoMLFailureReason]
  }

  object AutoMLPartialFailureReason {
    @inline
    def apply(
        PartialFailureMessage: js.UndefOr[AutoMLFailureReason] = js.undefined
    ): AutoMLPartialFailureReason = {
      val __obj = js.Dynamic.literal()
      PartialFailureMessage.foreach(__v => __obj.updateDynamic("PartialFailureMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoMLPartialFailureReason]
    }
  }

  /** The Amazon S3 data source.
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
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AutoMLS3DataSource]
    }
  }

  /** Security options.
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
      EnableInterContainerTrafficEncryption.foreach(__v => __obj.updateDynamic("EnableInterContainerTrafficEncryption")(__v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoMLSecurityConfig]
    }
  }

  /** Currently, the <code>AutoRollbackConfig</code> API is not supported.
    */
  @js.native
  trait AutoRollbackConfig extends js.Object {
    var Alarms: js.UndefOr[AlarmList]
  }

  object AutoRollbackConfig {
    @inline
    def apply(
        Alarms: js.UndefOr[AlarmList] = js.undefined
    ): AutoRollbackConfig = {
      val __obj = js.Dynamic.literal()
      Alarms.foreach(__v => __obj.updateDynamic("Alarms")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoRollbackConfig]
    }
  }

  /** Contains bias metrics for a model.
    */
  @js.native
  trait Bias extends js.Object {
    var Report: js.UndefOr[MetricsSource]
  }

  object Bias {
    @inline
    def apply(
        Report: js.UndefOr[MetricsSource] = js.undefined
    ): Bias = {
      val __obj = js.Dynamic.literal()
      Report.foreach(__v => __obj.updateDynamic("Report")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Bias]
    }
  }

  /** Currently, the <code>BlueGreenUpdatePolicy</code> API is not supported.
    */
  @js.native
  trait BlueGreenUpdatePolicy extends js.Object {
    var TrafficRoutingConfiguration: TrafficRoutingConfig
    var MaximumExecutionTimeoutInSeconds: js.UndefOr[MaximumExecutionTimeoutInSeconds]
    var TerminationWaitInSeconds: js.UndefOr[TerminationWaitInSeconds]
  }

  object BlueGreenUpdatePolicy {
    @inline
    def apply(
        TrafficRoutingConfiguration: TrafficRoutingConfig,
        MaximumExecutionTimeoutInSeconds: js.UndefOr[MaximumExecutionTimeoutInSeconds] = js.undefined,
        TerminationWaitInSeconds: js.UndefOr[TerminationWaitInSeconds] = js.undefined
    ): BlueGreenUpdatePolicy = {
      val __obj = js.Dynamic.literal(
        "TrafficRoutingConfiguration" -> TrafficRoutingConfiguration.asInstanceOf[js.Any]
      )

      MaximumExecutionTimeoutInSeconds.foreach(__v => __obj.updateDynamic("MaximumExecutionTimeoutInSeconds")(__v.asInstanceOf[js.Any]))
      TerminationWaitInSeconds.foreach(__v => __obj.updateDynamic("TerminationWaitInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BlueGreenUpdatePolicy]
    }
  }

  /** Details on the cache hit of a pipeline execution step.
    */
  @js.native
  trait CacheHitResult extends js.Object {
    var SourcePipelineExecutionArn: js.UndefOr[PipelineExecutionArn]
  }

  object CacheHitResult {
    @inline
    def apply(
        SourcePipelineExecutionArn: js.UndefOr[PipelineExecutionArn] = js.undefined
    ): CacheHitResult = {
      val __obj = js.Dynamic.literal()
      SourcePipelineExecutionArn.foreach(__v => __obj.updateDynamic("SourcePipelineExecutionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheHitResult]
    }
  }

  /** Location of artifacts for an AutoML candidate job.
    */
  @js.native
  trait CandidateArtifactLocations extends js.Object {
    var Explainability: ExplainabilityLocation
  }

  object CandidateArtifactLocations {
    @inline
    def apply(
        Explainability: ExplainabilityLocation
    ): CandidateArtifactLocations = {
      val __obj = js.Dynamic.literal(
        "Explainability" -> Explainability.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CandidateArtifactLocations]
    }
  }

  /** The properties of an AutoML candidate job.
    */
  @js.native
  trait CandidateProperties extends js.Object {
    var CandidateArtifactLocations: js.UndefOr[CandidateArtifactLocations]
  }

  object CandidateProperties {
    @inline
    def apply(
        CandidateArtifactLocations: js.UndefOr[CandidateArtifactLocations] = js.undefined
    ): CandidateProperties = {
      val __obj = js.Dynamic.literal()
      CandidateArtifactLocations.foreach(__v => __obj.updateDynamic("CandidateArtifactLocations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CandidateProperties]
    }
  }

  /** Currently, the <code>CapacitySize</code> API is not supported.
    */
  @js.native
  trait CapacitySize extends js.Object {
    var Type: CapacitySizeType
    var Value: CapacitySizeValue
  }

  object CapacitySize {
    @inline
    def apply(
        Type: CapacitySizeType,
        Value: CapacitySizeValue
    ): CapacitySize = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CapacitySize]
    }
  }

  /** <p/>
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

  /** <p/>
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

  /** A list of categorical hyperparameters to tune.
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
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CategoricalParameterRange]
    }
  }

  /** Defines the possible values for a categorical hyperparameter.
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

  /** A channel is a named input source that training algorithms can consume.
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
        "DataSource" -> DataSource.asInstanceOf[js.Any]
      )

      CompressionType.foreach(__v => __obj.updateDynamic("CompressionType")(__v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      InputMode.foreach(__v => __obj.updateDynamic("InputMode")(__v.asInstanceOf[js.Any]))
      RecordWrapperType.foreach(__v => __obj.updateDynamic("RecordWrapperType")(__v.asInstanceOf[js.Any]))
      ShuffleConfig.foreach(__v => __obj.updateDynamic("ShuffleConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Channel]
    }
  }

  /** Defines a named input source, called a channel, to be used by an algorithm.
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
        "Name" -> Name.asInstanceOf[js.Any],
        "SupportedContentTypes" -> SupportedContentTypes.asInstanceOf[js.Any],
        "SupportedInputModes" -> SupportedInputModes.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IsRequired.foreach(__v => __obj.updateDynamic("IsRequired")(__v.asInstanceOf[js.Any]))
      SupportedCompressionTypes.foreach(__v => __obj.updateDynamic("SupportedCompressionTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelSpecification]
    }
  }

  /** Contains information about the output location for managed spot training checkpoint data.
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

  /** Specifies summary information about a Git repository.
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
        "CodeRepositoryArn" -> CodeRepositoryArn.asInstanceOf[js.Any],
        "CodeRepositoryName" -> CodeRepositoryName.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any]
      )

      GitConfig.foreach(__v => __obj.updateDynamic("GitConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeRepositorySummary]
    }
  }

  /** Use this parameter to configure your Amazon Cognito workforce. A single Cognito workforce is created using and corresponds to a single [[https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html| Amazon Cognito user pool]].
    */
  @js.native
  trait CognitoConfig extends js.Object {
    var ClientId: ClientId
    var UserPool: CognitoUserPool
  }

  object CognitoConfig {
    @inline
    def apply(
        ClientId: ClientId,
        UserPool: CognitoUserPool
    ): CognitoConfig = {
      val __obj = js.Dynamic.literal(
        "ClientId" -> ClientId.asInstanceOf[js.Any],
        "UserPool" -> UserPool.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CognitoConfig]
    }
  }

  /** Identifies a Amazon Cognito user group. A user group can be used in on or more work teams.
    */
  @js.native
  trait CognitoMemberDefinition extends js.Object {
    var ClientId: ClientId
    var UserGroup: CognitoUserGroup
    var UserPool: CognitoUserPool
  }

  object CognitoMemberDefinition {
    @inline
    def apply(
        ClientId: ClientId,
        UserGroup: CognitoUserGroup,
        UserPool: CognitoUserPool
    ): CognitoMemberDefinition = {
      val __obj = js.Dynamic.literal(
        "ClientId" -> ClientId.asInstanceOf[js.Any],
        "UserGroup" -> UserGroup.asInstanceOf[js.Any],
        "UserPool" -> UserPool.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CognitoMemberDefinition]
    }
  }

  /** Configuration information for the Debugger output tensor collections.
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

  /** A summary of a model compilation job.
    */
  @js.native
  trait CompilationJobSummary extends js.Object {
    var CompilationJobArn: CompilationJobArn
    var CompilationJobName: EntityName
    var CompilationJobStatus: CompilationJobStatus
    var CreationTime: CreationTime
    var CompilationEndTime: js.UndefOr[Timestamp]
    var CompilationStartTime: js.UndefOr[Timestamp]
    var CompilationTargetDevice: js.UndefOr[TargetDevice]
    var CompilationTargetPlatformAccelerator: js.UndefOr[TargetPlatformAccelerator]
    var CompilationTargetPlatformArch: js.UndefOr[TargetPlatformArch]
    var CompilationTargetPlatformOs: js.UndefOr[TargetPlatformOs]
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
  }

  object CompilationJobSummary {
    @inline
    def apply(
        CompilationJobArn: CompilationJobArn,
        CompilationJobName: EntityName,
        CompilationJobStatus: CompilationJobStatus,
        CreationTime: CreationTime,
        CompilationEndTime: js.UndefOr[Timestamp] = js.undefined,
        CompilationStartTime: js.UndefOr[Timestamp] = js.undefined,
        CompilationTargetDevice: js.UndefOr[TargetDevice] = js.undefined,
        CompilationTargetPlatformAccelerator: js.UndefOr[TargetPlatformAccelerator] = js.undefined,
        CompilationTargetPlatformArch: js.UndefOr[TargetPlatformArch] = js.undefined,
        CompilationTargetPlatformOs: js.UndefOr[TargetPlatformOs] = js.undefined,
        LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined
    ): CompilationJobSummary = {
      val __obj = js.Dynamic.literal(
        "CompilationJobArn" -> CompilationJobArn.asInstanceOf[js.Any],
        "CompilationJobName" -> CompilationJobName.asInstanceOf[js.Any],
        "CompilationJobStatus" -> CompilationJobStatus.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any]
      )

      CompilationEndTime.foreach(__v => __obj.updateDynamic("CompilationEndTime")(__v.asInstanceOf[js.Any]))
      CompilationStartTime.foreach(__v => __obj.updateDynamic("CompilationStartTime")(__v.asInstanceOf[js.Any]))
      CompilationTargetDevice.foreach(__v => __obj.updateDynamic("CompilationTargetDevice")(__v.asInstanceOf[js.Any]))
      CompilationTargetPlatformAccelerator.foreach(__v => __obj.updateDynamic("CompilationTargetPlatformAccelerator")(__v.asInstanceOf[js.Any]))
      CompilationTargetPlatformArch.foreach(__v => __obj.updateDynamic("CompilationTargetPlatformArch")(__v.asInstanceOf[js.Any]))
      CompilationTargetPlatformOs.foreach(__v => __obj.updateDynamic("CompilationTargetPlatformOs")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompilationJobSummary]
    }
  }

  /** Metadata for a Condition step.
    */
  @js.native
  trait ConditionStepMetadata extends js.Object {
    var Outcome: js.UndefOr[ConditionOutcome]
  }

  object ConditionStepMetadata {
    @inline
    def apply(
        Outcome: js.UndefOr[ConditionOutcome] = js.undefined
    ): ConditionStepMetadata = {
      val __obj = js.Dynamic.literal()
      Outcome.foreach(__v => __obj.updateDynamic("Outcome")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConditionStepMetadata]
    }
  }

  /** Describes the container, as part of model definition.
    */
  @js.native
  trait ContainerDefinition extends js.Object {
    var ContainerHostname: js.UndefOr[ContainerHostname]
    var Environment: js.UndefOr[EnvironmentMap]
    var Image: js.UndefOr[ContainerImage]
    var ImageConfig: js.UndefOr[ImageConfig]
    var Mode: js.UndefOr[ContainerMode]
    var ModelDataUrl: js.UndefOr[Url]
    var ModelPackageName: js.UndefOr[VersionedArnOrName]
    var MultiModelConfig: js.UndefOr[MultiModelConfig]
  }

  object ContainerDefinition {
    @inline
    def apply(
        ContainerHostname: js.UndefOr[ContainerHostname] = js.undefined,
        Environment: js.UndefOr[EnvironmentMap] = js.undefined,
        Image: js.UndefOr[ContainerImage] = js.undefined,
        ImageConfig: js.UndefOr[ImageConfig] = js.undefined,
        Mode: js.UndefOr[ContainerMode] = js.undefined,
        ModelDataUrl: js.UndefOr[Url] = js.undefined,
        ModelPackageName: js.UndefOr[VersionedArnOrName] = js.undefined,
        MultiModelConfig: js.UndefOr[MultiModelConfig] = js.undefined
    ): ContainerDefinition = {
      val __obj = js.Dynamic.literal()
      ContainerHostname.foreach(__v => __obj.updateDynamic("ContainerHostname")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      Image.foreach(__v => __obj.updateDynamic("Image")(__v.asInstanceOf[js.Any]))
      ImageConfig.foreach(__v => __obj.updateDynamic("ImageConfig")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      ModelDataUrl.foreach(__v => __obj.updateDynamic("ModelDataUrl")(__v.asInstanceOf[js.Any]))
      ModelPackageName.foreach(__v => __obj.updateDynamic("ModelPackageName")(__v.asInstanceOf[js.Any]))
      MultiModelConfig.foreach(__v => __obj.updateDynamic("MultiModelConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContainerDefinition]
    }
  }

  /** A structure describing the source of a context.
    */
  @js.native
  trait ContextSource extends js.Object {
    var SourceUri: String2048
    var SourceId: js.UndefOr[String256]
    var SourceType: js.UndefOr[String256]
  }

  object ContextSource {
    @inline
    def apply(
        SourceUri: String2048,
        SourceId: js.UndefOr[String256] = js.undefined,
        SourceType: js.UndefOr[String256] = js.undefined
    ): ContextSource = {
      val __obj = js.Dynamic.literal(
        "SourceUri" -> SourceUri.asInstanceOf[js.Any]
      )

      SourceId.foreach(__v => __obj.updateDynamic("SourceId")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContextSource]
    }
  }

  /** Lists a summary of the properties of a context. A context provides a logical grouping of other entities.
    */
  @js.native
  trait ContextSummary extends js.Object {
    var ContextArn: js.UndefOr[ContextArn]
    var ContextName: js.UndefOr[ExperimentEntityName]
    var ContextType: js.UndefOr[String256]
    var CreationTime: js.UndefOr[Timestamp]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Source: js.UndefOr[ContextSource]
  }

  object ContextSummary {
    @inline
    def apply(
        ContextArn: js.UndefOr[ContextArn] = js.undefined,
        ContextName: js.UndefOr[ExperimentEntityName] = js.undefined,
        ContextType: js.UndefOr[String256] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Source: js.UndefOr[ContextSource] = js.undefined
    ): ContextSummary = {
      val __obj = js.Dynamic.literal()
      ContextArn.foreach(__v => __obj.updateDynamic("ContextArn")(__v.asInstanceOf[js.Any]))
      ContextName.foreach(__v => __obj.updateDynamic("ContextName")(__v.asInstanceOf[js.Any]))
      ContextType.foreach(__v => __obj.updateDynamic("ContextType")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContextSummary]
    }
  }

  /** A list of continuous hyperparameters to tune.
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
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ScalingType.foreach(__v => __obj.updateDynamic("ScalingType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContinuousParameterRange]
    }
  }

  /** Defines the possible values for a continuous hyperparameter.
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
  trait CreateActionRequest extends js.Object {
    var ActionName: ExperimentEntityName
    var ActionType: String256
    var Source: ActionSource
    var Description: js.UndefOr[ExperimentDescription]
    var MetadataProperties: js.UndefOr[MetadataProperties]
    var Properties: js.UndefOr[LineageEntityParameters]
    var Status: js.UndefOr[ActionStatus]
    var Tags: js.UndefOr[TagList]
  }

  object CreateActionRequest {
    @inline
    def apply(
        ActionName: ExperimentEntityName,
        ActionType: String256,
        Source: ActionSource,
        Description: js.UndefOr[ExperimentDescription] = js.undefined,
        MetadataProperties: js.UndefOr[MetadataProperties] = js.undefined,
        Properties: js.UndefOr[LineageEntityParameters] = js.undefined,
        Status: js.UndefOr[ActionStatus] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateActionRequest = {
      val __obj = js.Dynamic.literal(
        "ActionName" -> ActionName.asInstanceOf[js.Any],
        "ActionType" -> ActionType.asInstanceOf[js.Any],
        "Source" -> Source.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      MetadataProperties.foreach(__v => __obj.updateDynamic("MetadataProperties")(__v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.updateDynamic("Properties")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateActionRequest]
    }
  }

  @js.native
  trait CreateActionResponse extends js.Object {
    var ActionArn: js.UndefOr[ActionArn]
  }

  object CreateActionResponse {
    @inline
    def apply(
        ActionArn: js.UndefOr[ActionArn] = js.undefined
    ): CreateActionResponse = {
      val __obj = js.Dynamic.literal()
      ActionArn.foreach(__v => __obj.updateDynamic("ActionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateActionResponse]
    }
  }

  @js.native
  trait CreateAlgorithmInput extends js.Object {
    var AlgorithmName: EntityName
    var TrainingSpecification: TrainingSpecification
    var AlgorithmDescription: js.UndefOr[EntityDescription]
    var CertifyForMarketplace: js.UndefOr[CertifyForMarketplace]
    var InferenceSpecification: js.UndefOr[InferenceSpecification]
    var Tags: js.UndefOr[TagList]
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
        Tags: js.UndefOr[TagList] = js.undefined,
        ValidationSpecification: js.UndefOr[AlgorithmValidationSpecification] = js.undefined
    ): CreateAlgorithmInput = {
      val __obj = js.Dynamic.literal(
        "AlgorithmName" -> AlgorithmName.asInstanceOf[js.Any],
        "TrainingSpecification" -> TrainingSpecification.asInstanceOf[js.Any]
      )

      AlgorithmDescription.foreach(__v => __obj.updateDynamic("AlgorithmDescription")(__v.asInstanceOf[js.Any]))
      CertifyForMarketplace.foreach(__v => __obj.updateDynamic("CertifyForMarketplace")(__v.asInstanceOf[js.Any]))
      InferenceSpecification.foreach(__v => __obj.updateDynamic("InferenceSpecification")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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
  trait CreateAppImageConfigRequest extends js.Object {
    var AppImageConfigName: AppImageConfigName
    var KernelGatewayImageConfig: js.UndefOr[KernelGatewayImageConfig]
    var Tags: js.UndefOr[TagList]
  }

  object CreateAppImageConfigRequest {
    @inline
    def apply(
        AppImageConfigName: AppImageConfigName,
        KernelGatewayImageConfig: js.UndefOr[KernelGatewayImageConfig] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateAppImageConfigRequest = {
      val __obj = js.Dynamic.literal(
        "AppImageConfigName" -> AppImageConfigName.asInstanceOf[js.Any]
      )

      KernelGatewayImageConfig.foreach(__v => __obj.updateDynamic("KernelGatewayImageConfig")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppImageConfigRequest]
    }
  }

  @js.native
  trait CreateAppImageConfigResponse extends js.Object {
    var AppImageConfigArn: js.UndefOr[AppImageConfigArn]
  }

  object CreateAppImageConfigResponse {
    @inline
    def apply(
        AppImageConfigArn: js.UndefOr[AppImageConfigArn] = js.undefined
    ): CreateAppImageConfigResponse = {
      val __obj = js.Dynamic.literal()
      AppImageConfigArn.foreach(__v => __obj.updateDynamic("AppImageConfigArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppImageConfigResponse]
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
        "AppName" -> AppName.asInstanceOf[js.Any],
        "AppType" -> AppType.asInstanceOf[js.Any],
        "DomainId" -> DomainId.asInstanceOf[js.Any],
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
  trait CreateArtifactRequest extends js.Object {
    var ArtifactType: String256
    var Source: ArtifactSource
    var ArtifactName: js.UndefOr[ExperimentEntityName]
    var MetadataProperties: js.UndefOr[MetadataProperties]
    var Properties: js.UndefOr[LineageEntityParameters]
    var Tags: js.UndefOr[TagList]
  }

  object CreateArtifactRequest {
    @inline
    def apply(
        ArtifactType: String256,
        Source: ArtifactSource,
        ArtifactName: js.UndefOr[ExperimentEntityName] = js.undefined,
        MetadataProperties: js.UndefOr[MetadataProperties] = js.undefined,
        Properties: js.UndefOr[LineageEntityParameters] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateArtifactRequest = {
      val __obj = js.Dynamic.literal(
        "ArtifactType" -> ArtifactType.asInstanceOf[js.Any],
        "Source" -> Source.asInstanceOf[js.Any]
      )

      ArtifactName.foreach(__v => __obj.updateDynamic("ArtifactName")(__v.asInstanceOf[js.Any]))
      MetadataProperties.foreach(__v => __obj.updateDynamic("MetadataProperties")(__v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.updateDynamic("Properties")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateArtifactRequest]
    }
  }

  @js.native
  trait CreateArtifactResponse extends js.Object {
    var ArtifactArn: js.UndefOr[ArtifactArn]
  }

  object CreateArtifactResponse {
    @inline
    def apply(
        ArtifactArn: js.UndefOr[ArtifactArn] = js.undefined
    ): CreateArtifactResponse = {
      val __obj = js.Dynamic.literal()
      ArtifactArn.foreach(__v => __obj.updateDynamic("ArtifactArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateArtifactResponse]
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
        "AutoMLJobName" -> AutoMLJobName.asInstanceOf[js.Any],
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      AutoMLJobConfig.foreach(__v => __obj.updateDynamic("AutoMLJobConfig")(__v.asInstanceOf[js.Any]))
      AutoMLJobObjective.foreach(__v => __obj.updateDynamic("AutoMLJobObjective")(__v.asInstanceOf[js.Any]))
      GenerateCandidateDefinitionsOnly.foreach(__v => __obj.updateDynamic("GenerateCandidateDefinitionsOnly")(__v.asInstanceOf[js.Any]))
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
    var Tags: js.UndefOr[TagList]
  }

  object CreateCodeRepositoryInput {
    @inline
    def apply(
        CodeRepositoryName: EntityName,
        GitConfig: GitConfig,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateCodeRepositoryInput = {
      val __obj = js.Dynamic.literal(
        "CodeRepositoryName" -> CodeRepositoryName.asInstanceOf[js.Any],
        "GitConfig" -> GitConfig.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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
    var Tags: js.UndefOr[TagList]
  }

  object CreateCompilationJobRequest {
    @inline
    def apply(
        CompilationJobName: EntityName,
        InputConfig: InputConfig,
        OutputConfig: OutputConfig,
        RoleArn: RoleArn,
        StoppingCondition: StoppingCondition,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateCompilationJobRequest = {
      val __obj = js.Dynamic.literal(
        "CompilationJobName" -> CompilationJobName.asInstanceOf[js.Any],
        "InputConfig" -> InputConfig.asInstanceOf[js.Any],
        "OutputConfig" -> OutputConfig.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "StoppingCondition" -> StoppingCondition.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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
  trait CreateContextRequest extends js.Object {
    var ContextName: ExperimentEntityName
    var ContextType: String256
    var Source: ContextSource
    var Description: js.UndefOr[ExperimentDescription]
    var Properties: js.UndefOr[LineageEntityParameters]
    var Tags: js.UndefOr[TagList]
  }

  object CreateContextRequest {
    @inline
    def apply(
        ContextName: ExperimentEntityName,
        ContextType: String256,
        Source: ContextSource,
        Description: js.UndefOr[ExperimentDescription] = js.undefined,
        Properties: js.UndefOr[LineageEntityParameters] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateContextRequest = {
      val __obj = js.Dynamic.literal(
        "ContextName" -> ContextName.asInstanceOf[js.Any],
        "ContextType" -> ContextType.asInstanceOf[js.Any],
        "Source" -> Source.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.updateDynamic("Properties")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateContextRequest]
    }
  }

  @js.native
  trait CreateContextResponse extends js.Object {
    var ContextArn: js.UndefOr[ContextArn]
  }

  object CreateContextResponse {
    @inline
    def apply(
        ContextArn: js.UndefOr[ContextArn] = js.undefined
    ): CreateContextResponse = {
      val __obj = js.Dynamic.literal()
      ContextArn.foreach(__v => __obj.updateDynamic("ContextArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateContextResponse]
    }
  }

  @js.native
  trait CreateDataQualityJobDefinitionRequest extends js.Object {
    var DataQualityAppSpecification: DataQualityAppSpecification
    var DataQualityJobInput: DataQualityJobInput
    var DataQualityJobOutputConfig: MonitoringOutputConfig
    var JobDefinitionName: MonitoringJobDefinitionName
    var JobResources: MonitoringResources
    var RoleArn: RoleArn
    var DataQualityBaselineConfig: js.UndefOr[DataQualityBaselineConfig]
    var NetworkConfig: js.UndefOr[MonitoringNetworkConfig]
    var StoppingCondition: js.UndefOr[MonitoringStoppingCondition]
    var Tags: js.UndefOr[TagList]
  }

  object CreateDataQualityJobDefinitionRequest {
    @inline
    def apply(
        DataQualityAppSpecification: DataQualityAppSpecification,
        DataQualityJobInput: DataQualityJobInput,
        DataQualityJobOutputConfig: MonitoringOutputConfig,
        JobDefinitionName: MonitoringJobDefinitionName,
        JobResources: MonitoringResources,
        RoleArn: RoleArn,
        DataQualityBaselineConfig: js.UndefOr[DataQualityBaselineConfig] = js.undefined,
        NetworkConfig: js.UndefOr[MonitoringNetworkConfig] = js.undefined,
        StoppingCondition: js.UndefOr[MonitoringStoppingCondition] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDataQualityJobDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "DataQualityAppSpecification" -> DataQualityAppSpecification.asInstanceOf[js.Any],
        "DataQualityJobInput" -> DataQualityJobInput.asInstanceOf[js.Any],
        "DataQualityJobOutputConfig" -> DataQualityJobOutputConfig.asInstanceOf[js.Any],
        "JobDefinitionName" -> JobDefinitionName.asInstanceOf[js.Any],
        "JobResources" -> JobResources.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      DataQualityBaselineConfig.foreach(__v => __obj.updateDynamic("DataQualityBaselineConfig")(__v.asInstanceOf[js.Any]))
      NetworkConfig.foreach(__v => __obj.updateDynamic("NetworkConfig")(__v.asInstanceOf[js.Any]))
      StoppingCondition.foreach(__v => __obj.updateDynamic("StoppingCondition")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataQualityJobDefinitionRequest]
    }
  }

  @js.native
  trait CreateDataQualityJobDefinitionResponse extends js.Object {
    var JobDefinitionArn: MonitoringJobDefinitionArn
  }

  object CreateDataQualityJobDefinitionResponse {
    @inline
    def apply(
        JobDefinitionArn: MonitoringJobDefinitionArn
    ): CreateDataQualityJobDefinitionResponse = {
      val __obj = js.Dynamic.literal(
        "JobDefinitionArn" -> JobDefinitionArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateDataQualityJobDefinitionResponse]
    }
  }

  @js.native
  trait CreateDeviceFleetRequest extends js.Object {
    var DeviceFleetName: EntityName
    var OutputConfig: EdgeOutputConfig
    var Description: js.UndefOr[DeviceFleetDescription]
    var RoleArn: js.UndefOr[RoleArn]
    var Tags: js.UndefOr[TagList]
  }

  object CreateDeviceFleetRequest {
    @inline
    def apply(
        DeviceFleetName: EntityName,
        OutputConfig: EdgeOutputConfig,
        Description: js.UndefOr[DeviceFleetDescription] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDeviceFleetRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceFleetName" -> DeviceFleetName.asInstanceOf[js.Any],
        "OutputConfig" -> OutputConfig.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeviceFleetRequest]
    }
  }

  @js.native
  trait CreateDomainRequest extends js.Object {
    var AuthMode: AuthMode
    var DefaultUserSettings: UserSettings
    var DomainName: DomainName
    var SubnetIds: Subnets
    var VpcId: VpcId
    var AppNetworkAccessType: js.UndefOr[AppNetworkAccessType]
    var HomeEfsFileSystemKmsKeyId: js.UndefOr[KmsKeyId]
    var KmsKeyId: js.UndefOr[KmsKeyId]
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
        AppNetworkAccessType: js.UndefOr[AppNetworkAccessType] = js.undefined,
        HomeEfsFileSystemKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDomainRequest = {
      val __obj = js.Dynamic.literal(
        "AuthMode" -> AuthMode.asInstanceOf[js.Any],
        "DefaultUserSettings" -> DefaultUserSettings.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any],
        "VpcId" -> VpcId.asInstanceOf[js.Any]
      )

      AppNetworkAccessType.foreach(__v => __obj.updateDynamic("AppNetworkAccessType")(__v.asInstanceOf[js.Any]))
      HomeEfsFileSystemKmsKeyId.foreach(__v => __obj.updateDynamic("HomeEfsFileSystemKmsKeyId")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
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
  trait CreateEdgePackagingJobRequest extends js.Object {
    var CompilationJobName: EntityName
    var EdgePackagingJobName: EntityName
    var ModelName: EntityName
    var ModelVersion: EdgeVersion
    var OutputConfig: EdgeOutputConfig
    var RoleArn: RoleArn
    var ResourceKey: js.UndefOr[KmsKeyId]
    var Tags: js.UndefOr[TagList]
  }

  object CreateEdgePackagingJobRequest {
    @inline
    def apply(
        CompilationJobName: EntityName,
        EdgePackagingJobName: EntityName,
        ModelName: EntityName,
        ModelVersion: EdgeVersion,
        OutputConfig: EdgeOutputConfig,
        RoleArn: RoleArn,
        ResourceKey: js.UndefOr[KmsKeyId] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateEdgePackagingJobRequest = {
      val __obj = js.Dynamic.literal(
        "CompilationJobName" -> CompilationJobName.asInstanceOf[js.Any],
        "EdgePackagingJobName" -> EdgePackagingJobName.asInstanceOf[js.Any],
        "ModelName" -> ModelName.asInstanceOf[js.Any],
        "ModelVersion" -> ModelVersion.asInstanceOf[js.Any],
        "OutputConfig" -> OutputConfig.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      ResourceKey.foreach(__v => __obj.updateDynamic("ResourceKey")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEdgePackagingJobRequest]
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
        "EndpointName" -> EndpointName.asInstanceOf[js.Any]
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
  trait CreateFeatureGroupRequest extends js.Object {
    var EventTimeFeatureName: FeatureName
    var FeatureDefinitions: FeatureDefinitions
    var FeatureGroupName: FeatureGroupName
    var RecordIdentifierFeatureName: FeatureName
    var Description: js.UndefOr[Description]
    var OfflineStoreConfig: js.UndefOr[OfflineStoreConfig]
    var OnlineStoreConfig: js.UndefOr[OnlineStoreConfig]
    var RoleArn: js.UndefOr[RoleArn]
    var Tags: js.UndefOr[TagList]
  }

  object CreateFeatureGroupRequest {
    @inline
    def apply(
        EventTimeFeatureName: FeatureName,
        FeatureDefinitions: FeatureDefinitions,
        FeatureGroupName: FeatureGroupName,
        RecordIdentifierFeatureName: FeatureName,
        Description: js.UndefOr[Description] = js.undefined,
        OfflineStoreConfig: js.UndefOr[OfflineStoreConfig] = js.undefined,
        OnlineStoreConfig: js.UndefOr[OnlineStoreConfig] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateFeatureGroupRequest = {
      val __obj = js.Dynamic.literal(
        "EventTimeFeatureName" -> EventTimeFeatureName.asInstanceOf[js.Any],
        "FeatureDefinitions" -> FeatureDefinitions.asInstanceOf[js.Any],
        "FeatureGroupName" -> FeatureGroupName.asInstanceOf[js.Any],
        "RecordIdentifierFeatureName" -> RecordIdentifierFeatureName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      OfflineStoreConfig.foreach(__v => __obj.updateDynamic("OfflineStoreConfig")(__v.asInstanceOf[js.Any]))
      OnlineStoreConfig.foreach(__v => __obj.updateDynamic("OnlineStoreConfig")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFeatureGroupRequest]
    }
  }

  @js.native
  trait CreateFeatureGroupResponse extends js.Object {
    var FeatureGroupArn: FeatureGroupArn
  }

  object CreateFeatureGroupResponse {
    @inline
    def apply(
        FeatureGroupArn: FeatureGroupArn
    ): CreateFeatureGroupResponse = {
      val __obj = js.Dynamic.literal(
        "FeatureGroupArn" -> FeatureGroupArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateFeatureGroupResponse]
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
        "HumanLoopConfig" -> HumanLoopConfig.asInstanceOf[js.Any],
        "OutputConfig" -> OutputConfig.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      HumanLoopActivationConfig.foreach(__v => __obj.updateDynamic("HumanLoopActivationConfig")(__v.asInstanceOf[js.Any]))
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
        "UiTemplate" -> UiTemplate.asInstanceOf[js.Any]
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
        "HyperParameterTuningJobName" -> HyperParameterTuningJobName.asInstanceOf[js.Any]
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
  trait CreateImageRequest extends js.Object {
    var ImageName: ImageName
    var RoleArn: RoleArn
    var Description: js.UndefOr[ImageDescription]
    var DisplayName: js.UndefOr[ImageDisplayName]
    var Tags: js.UndefOr[TagList]
  }

  object CreateImageRequest {
    @inline
    def apply(
        ImageName: ImageName,
        RoleArn: RoleArn,
        Description: js.UndefOr[ImageDescription] = js.undefined,
        DisplayName: js.UndefOr[ImageDisplayName] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateImageRequest = {
      val __obj = js.Dynamic.literal(
        "ImageName" -> ImageName.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateImageRequest]
    }
  }

  @js.native
  trait CreateImageResponse extends js.Object {
    var ImageArn: js.UndefOr[ImageArn]
  }

  object CreateImageResponse {
    @inline
    def apply(
        ImageArn: js.UndefOr[ImageArn] = js.undefined
    ): CreateImageResponse = {
      val __obj = js.Dynamic.literal()
      ImageArn.foreach(__v => __obj.updateDynamic("ImageArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateImageResponse]
    }
  }

  @js.native
  trait CreateImageVersionRequest extends js.Object {
    var BaseImage: ImageBaseImage
    var ClientToken: ClientToken
    var ImageName: ImageName
  }

  object CreateImageVersionRequest {
    @inline
    def apply(
        BaseImage: ImageBaseImage,
        ClientToken: ClientToken,
        ImageName: ImageName
    ): CreateImageVersionRequest = {
      val __obj = js.Dynamic.literal(
        "BaseImage" -> BaseImage.asInstanceOf[js.Any],
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "ImageName" -> ImageName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateImageVersionRequest]
    }
  }

  @js.native
  trait CreateImageVersionResponse extends js.Object {
    var ImageVersionArn: js.UndefOr[ImageVersionArn]
  }

  object CreateImageVersionResponse {
    @inline
    def apply(
        ImageVersionArn: js.UndefOr[ImageVersionArn] = js.undefined
    ): CreateImageVersionResponse = {
      val __obj = js.Dynamic.literal()
      ImageVersionArn.foreach(__v => __obj.updateDynamic("ImageVersionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateImageVersionResponse]
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
        "HumanTaskConfig" -> HumanTaskConfig.asInstanceOf[js.Any],
        "InputConfig" -> InputConfig.asInstanceOf[js.Any],
        "LabelAttributeName" -> LabelAttributeName.asInstanceOf[js.Any],
        "LabelingJobName" -> LabelingJobName.asInstanceOf[js.Any],
        "OutputConfig" -> OutputConfig.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      LabelCategoryConfigS3Uri.foreach(__v => __obj.updateDynamic("LabelCategoryConfigS3Uri")(__v.asInstanceOf[js.Any]))
      LabelingJobAlgorithmsConfig.foreach(__v => __obj.updateDynamic("LabelingJobAlgorithmsConfig")(__v.asInstanceOf[js.Any]))
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
  trait CreateModelBiasJobDefinitionRequest extends js.Object {
    var JobDefinitionName: MonitoringJobDefinitionName
    var JobResources: MonitoringResources
    var ModelBiasAppSpecification: ModelBiasAppSpecification
    var ModelBiasJobInput: ModelBiasJobInput
    var ModelBiasJobOutputConfig: MonitoringOutputConfig
    var RoleArn: RoleArn
    var ModelBiasBaselineConfig: js.UndefOr[ModelBiasBaselineConfig]
    var NetworkConfig: js.UndefOr[MonitoringNetworkConfig]
    var StoppingCondition: js.UndefOr[MonitoringStoppingCondition]
    var Tags: js.UndefOr[TagList]
  }

  object CreateModelBiasJobDefinitionRequest {
    @inline
    def apply(
        JobDefinitionName: MonitoringJobDefinitionName,
        JobResources: MonitoringResources,
        ModelBiasAppSpecification: ModelBiasAppSpecification,
        ModelBiasJobInput: ModelBiasJobInput,
        ModelBiasJobOutputConfig: MonitoringOutputConfig,
        RoleArn: RoleArn,
        ModelBiasBaselineConfig: js.UndefOr[ModelBiasBaselineConfig] = js.undefined,
        NetworkConfig: js.UndefOr[MonitoringNetworkConfig] = js.undefined,
        StoppingCondition: js.UndefOr[MonitoringStoppingCondition] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateModelBiasJobDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "JobDefinitionName" -> JobDefinitionName.asInstanceOf[js.Any],
        "JobResources" -> JobResources.asInstanceOf[js.Any],
        "ModelBiasAppSpecification" -> ModelBiasAppSpecification.asInstanceOf[js.Any],
        "ModelBiasJobInput" -> ModelBiasJobInput.asInstanceOf[js.Any],
        "ModelBiasJobOutputConfig" -> ModelBiasJobOutputConfig.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      ModelBiasBaselineConfig.foreach(__v => __obj.updateDynamic("ModelBiasBaselineConfig")(__v.asInstanceOf[js.Any]))
      NetworkConfig.foreach(__v => __obj.updateDynamic("NetworkConfig")(__v.asInstanceOf[js.Any]))
      StoppingCondition.foreach(__v => __obj.updateDynamic("StoppingCondition")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateModelBiasJobDefinitionRequest]
    }
  }

  @js.native
  trait CreateModelBiasJobDefinitionResponse extends js.Object {
    var JobDefinitionArn: MonitoringJobDefinitionArn
  }

  object CreateModelBiasJobDefinitionResponse {
    @inline
    def apply(
        JobDefinitionArn: MonitoringJobDefinitionArn
    ): CreateModelBiasJobDefinitionResponse = {
      val __obj = js.Dynamic.literal(
        "JobDefinitionArn" -> JobDefinitionArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateModelBiasJobDefinitionResponse]
    }
  }

  @js.native
  trait CreateModelExplainabilityJobDefinitionRequest extends js.Object {
    var JobDefinitionName: MonitoringJobDefinitionName
    var JobResources: MonitoringResources
    var ModelExplainabilityAppSpecification: ModelExplainabilityAppSpecification
    var ModelExplainabilityJobInput: ModelExplainabilityJobInput
    var ModelExplainabilityJobOutputConfig: MonitoringOutputConfig
    var RoleArn: RoleArn
    var ModelExplainabilityBaselineConfig: js.UndefOr[ModelExplainabilityBaselineConfig]
    var NetworkConfig: js.UndefOr[MonitoringNetworkConfig]
    var StoppingCondition: js.UndefOr[MonitoringStoppingCondition]
    var Tags: js.UndefOr[TagList]
  }

  object CreateModelExplainabilityJobDefinitionRequest {
    @inline
    def apply(
        JobDefinitionName: MonitoringJobDefinitionName,
        JobResources: MonitoringResources,
        ModelExplainabilityAppSpecification: ModelExplainabilityAppSpecification,
        ModelExplainabilityJobInput: ModelExplainabilityJobInput,
        ModelExplainabilityJobOutputConfig: MonitoringOutputConfig,
        RoleArn: RoleArn,
        ModelExplainabilityBaselineConfig: js.UndefOr[ModelExplainabilityBaselineConfig] = js.undefined,
        NetworkConfig: js.UndefOr[MonitoringNetworkConfig] = js.undefined,
        StoppingCondition: js.UndefOr[MonitoringStoppingCondition] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateModelExplainabilityJobDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "JobDefinitionName" -> JobDefinitionName.asInstanceOf[js.Any],
        "JobResources" -> JobResources.asInstanceOf[js.Any],
        "ModelExplainabilityAppSpecification" -> ModelExplainabilityAppSpecification.asInstanceOf[js.Any],
        "ModelExplainabilityJobInput" -> ModelExplainabilityJobInput.asInstanceOf[js.Any],
        "ModelExplainabilityJobOutputConfig" -> ModelExplainabilityJobOutputConfig.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      ModelExplainabilityBaselineConfig.foreach(__v => __obj.updateDynamic("ModelExplainabilityBaselineConfig")(__v.asInstanceOf[js.Any]))
      NetworkConfig.foreach(__v => __obj.updateDynamic("NetworkConfig")(__v.asInstanceOf[js.Any]))
      StoppingCondition.foreach(__v => __obj.updateDynamic("StoppingCondition")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateModelExplainabilityJobDefinitionRequest]
    }
  }

  @js.native
  trait CreateModelExplainabilityJobDefinitionResponse extends js.Object {
    var JobDefinitionArn: MonitoringJobDefinitionArn
  }

  object CreateModelExplainabilityJobDefinitionResponse {
    @inline
    def apply(
        JobDefinitionArn: MonitoringJobDefinitionArn
    ): CreateModelExplainabilityJobDefinitionResponse = {
      val __obj = js.Dynamic.literal(
        "JobDefinitionArn" -> JobDefinitionArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateModelExplainabilityJobDefinitionResponse]
    }
  }

  @js.native
  trait CreateModelInput extends js.Object {
    var ExecutionRoleArn: RoleArn
    var ModelName: ModelName
    var Containers: js.UndefOr[ContainerDefinitionList]
    var EnableNetworkIsolation: js.UndefOr[Boolean]
    var InferenceExecutionConfig: js.UndefOr[InferenceExecutionConfig]
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
        InferenceExecutionConfig: js.UndefOr[InferenceExecutionConfig] = js.undefined,
        PrimaryContainer: js.UndefOr[ContainerDefinition] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): CreateModelInput = {
      val __obj = js.Dynamic.literal(
        "ExecutionRoleArn" -> ExecutionRoleArn.asInstanceOf[js.Any],
        "ModelName" -> ModelName.asInstanceOf[js.Any]
      )

      Containers.foreach(__v => __obj.updateDynamic("Containers")(__v.asInstanceOf[js.Any]))
      EnableNetworkIsolation.foreach(__v => __obj.updateDynamic("EnableNetworkIsolation")(__v.asInstanceOf[js.Any]))
      InferenceExecutionConfig.foreach(__v => __obj.updateDynamic("InferenceExecutionConfig")(__v.asInstanceOf[js.Any]))
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
  trait CreateModelPackageGroupInput extends js.Object {
    var ModelPackageGroupName: EntityName
    var ModelPackageGroupDescription: js.UndefOr[EntityDescription]
    var Tags: js.UndefOr[TagList]
  }

  object CreateModelPackageGroupInput {
    @inline
    def apply(
        ModelPackageGroupName: EntityName,
        ModelPackageGroupDescription: js.UndefOr[EntityDescription] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateModelPackageGroupInput = {
      val __obj = js.Dynamic.literal(
        "ModelPackageGroupName" -> ModelPackageGroupName.asInstanceOf[js.Any]
      )

      ModelPackageGroupDescription.foreach(__v => __obj.updateDynamic("ModelPackageGroupDescription")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateModelPackageGroupInput]
    }
  }

  @js.native
  trait CreateModelPackageGroupOutput extends js.Object {
    var ModelPackageGroupArn: ModelPackageGroupArn
  }

  object CreateModelPackageGroupOutput {
    @inline
    def apply(
        ModelPackageGroupArn: ModelPackageGroupArn
    ): CreateModelPackageGroupOutput = {
      val __obj = js.Dynamic.literal(
        "ModelPackageGroupArn" -> ModelPackageGroupArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateModelPackageGroupOutput]
    }
  }

  @js.native
  trait CreateModelPackageInput extends js.Object {
    var CertifyForMarketplace: js.UndefOr[CertifyForMarketplace]
    var ClientToken: js.UndefOr[ClientToken]
    var InferenceSpecification: js.UndefOr[InferenceSpecification]
    var MetadataProperties: js.UndefOr[MetadataProperties]
    var ModelApprovalStatus: js.UndefOr[ModelApprovalStatus]
    var ModelMetrics: js.UndefOr[ModelMetrics]
    var ModelPackageDescription: js.UndefOr[EntityDescription]
    var ModelPackageGroupName: js.UndefOr[EntityName]
    var ModelPackageName: js.UndefOr[EntityName]
    var SourceAlgorithmSpecification: js.UndefOr[SourceAlgorithmSpecification]
    var Tags: js.UndefOr[TagList]
    var ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification]
  }

  object CreateModelPackageInput {
    @inline
    def apply(
        CertifyForMarketplace: js.UndefOr[CertifyForMarketplace] = js.undefined,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        InferenceSpecification: js.UndefOr[InferenceSpecification] = js.undefined,
        MetadataProperties: js.UndefOr[MetadataProperties] = js.undefined,
        ModelApprovalStatus: js.UndefOr[ModelApprovalStatus] = js.undefined,
        ModelMetrics: js.UndefOr[ModelMetrics] = js.undefined,
        ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined,
        ModelPackageGroupName: js.UndefOr[EntityName] = js.undefined,
        ModelPackageName: js.UndefOr[EntityName] = js.undefined,
        SourceAlgorithmSpecification: js.UndefOr[SourceAlgorithmSpecification] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification] = js.undefined
    ): CreateModelPackageInput = {
      val __obj = js.Dynamic.literal()
      CertifyForMarketplace.foreach(__v => __obj.updateDynamic("CertifyForMarketplace")(__v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      InferenceSpecification.foreach(__v => __obj.updateDynamic("InferenceSpecification")(__v.asInstanceOf[js.Any]))
      MetadataProperties.foreach(__v => __obj.updateDynamic("MetadataProperties")(__v.asInstanceOf[js.Any]))
      ModelApprovalStatus.foreach(__v => __obj.updateDynamic("ModelApprovalStatus")(__v.asInstanceOf[js.Any]))
      ModelMetrics.foreach(__v => __obj.updateDynamic("ModelMetrics")(__v.asInstanceOf[js.Any]))
      ModelPackageDescription.foreach(__v => __obj.updateDynamic("ModelPackageDescription")(__v.asInstanceOf[js.Any]))
      ModelPackageGroupName.foreach(__v => __obj.updateDynamic("ModelPackageGroupName")(__v.asInstanceOf[js.Any]))
      ModelPackageName.foreach(__v => __obj.updateDynamic("ModelPackageName")(__v.asInstanceOf[js.Any]))
      SourceAlgorithmSpecification.foreach(__v => __obj.updateDynamic("SourceAlgorithmSpecification")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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
  trait CreateModelQualityJobDefinitionRequest extends js.Object {
    var JobDefinitionName: MonitoringJobDefinitionName
    var JobResources: MonitoringResources
    var ModelQualityAppSpecification: ModelQualityAppSpecification
    var ModelQualityJobInput: ModelQualityJobInput
    var ModelQualityJobOutputConfig: MonitoringOutputConfig
    var RoleArn: RoleArn
    var ModelQualityBaselineConfig: js.UndefOr[ModelQualityBaselineConfig]
    var NetworkConfig: js.UndefOr[MonitoringNetworkConfig]
    var StoppingCondition: js.UndefOr[MonitoringStoppingCondition]
    var Tags: js.UndefOr[TagList]
  }

  object CreateModelQualityJobDefinitionRequest {
    @inline
    def apply(
        JobDefinitionName: MonitoringJobDefinitionName,
        JobResources: MonitoringResources,
        ModelQualityAppSpecification: ModelQualityAppSpecification,
        ModelQualityJobInput: ModelQualityJobInput,
        ModelQualityJobOutputConfig: MonitoringOutputConfig,
        RoleArn: RoleArn,
        ModelQualityBaselineConfig: js.UndefOr[ModelQualityBaselineConfig] = js.undefined,
        NetworkConfig: js.UndefOr[MonitoringNetworkConfig] = js.undefined,
        StoppingCondition: js.UndefOr[MonitoringStoppingCondition] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateModelQualityJobDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "JobDefinitionName" -> JobDefinitionName.asInstanceOf[js.Any],
        "JobResources" -> JobResources.asInstanceOf[js.Any],
        "ModelQualityAppSpecification" -> ModelQualityAppSpecification.asInstanceOf[js.Any],
        "ModelQualityJobInput" -> ModelQualityJobInput.asInstanceOf[js.Any],
        "ModelQualityJobOutputConfig" -> ModelQualityJobOutputConfig.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      ModelQualityBaselineConfig.foreach(__v => __obj.updateDynamic("ModelQualityBaselineConfig")(__v.asInstanceOf[js.Any]))
      NetworkConfig.foreach(__v => __obj.updateDynamic("NetworkConfig")(__v.asInstanceOf[js.Any]))
      StoppingCondition.foreach(__v => __obj.updateDynamic("StoppingCondition")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateModelQualityJobDefinitionRequest]
    }
  }

  @js.native
  trait CreateModelQualityJobDefinitionResponse extends js.Object {
    var JobDefinitionArn: MonitoringJobDefinitionArn
  }

  object CreateModelQualityJobDefinitionResponse {
    @inline
    def apply(
        JobDefinitionArn: MonitoringJobDefinitionArn
    ): CreateModelQualityJobDefinitionResponse = {
      val __obj = js.Dynamic.literal(
        "JobDefinitionArn" -> JobDefinitionArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateModelQualityJobDefinitionResponse]
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
        "MonitoringScheduleName" -> MonitoringScheduleName.asInstanceOf[js.Any]
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
        "InstanceType" -> InstanceType.asInstanceOf[js.Any],
        "NotebookInstanceName" -> NotebookInstanceName.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      AcceleratorTypes.foreach(__v => __obj.updateDynamic("AcceleratorTypes")(__v.asInstanceOf[js.Any]))
      AdditionalCodeRepositories.foreach(__v => __obj.updateDynamic("AdditionalCodeRepositories")(__v.asInstanceOf[js.Any]))
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
      NotebookInstanceLifecycleConfigArn.foreach(__v => __obj.updateDynamic("NotebookInstanceLifecycleConfigArn")(__v.asInstanceOf[js.Any]))
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
  trait CreatePipelineRequest extends js.Object {
    var ClientRequestToken: IdempotencyToken
    var PipelineDefinition: PipelineDefinition
    var PipelineName: PipelineName
    var RoleArn: RoleArn
    var PipelineDescription: js.UndefOr[PipelineDescription]
    var PipelineDisplayName: js.UndefOr[PipelineName]
    var Tags: js.UndefOr[TagList]
  }

  object CreatePipelineRequest {
    @inline
    def apply(
        ClientRequestToken: IdempotencyToken,
        PipelineDefinition: PipelineDefinition,
        PipelineName: PipelineName,
        RoleArn: RoleArn,
        PipelineDescription: js.UndefOr[PipelineDescription] = js.undefined,
        PipelineDisplayName: js.UndefOr[PipelineName] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreatePipelineRequest = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "PipelineDefinition" -> PipelineDefinition.asInstanceOf[js.Any],
        "PipelineName" -> PipelineName.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      PipelineDescription.foreach(__v => __obj.updateDynamic("PipelineDescription")(__v.asInstanceOf[js.Any]))
      PipelineDisplayName.foreach(__v => __obj.updateDynamic("PipelineDisplayName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePipelineRequest]
    }
  }

  @js.native
  trait CreatePipelineResponse extends js.Object {
    var PipelineArn: js.UndefOr[PipelineArn]
  }

  object CreatePipelineResponse {
    @inline
    def apply(
        PipelineArn: js.UndefOr[PipelineArn] = js.undefined
    ): CreatePipelineResponse = {
      val __obj = js.Dynamic.literal()
      PipelineArn.foreach(__v => __obj.updateDynamic("PipelineArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePipelineResponse]
    }
  }

  @js.native
  trait CreatePresignedDomainUrlRequest extends js.Object {
    var DomainId: DomainId
    var UserProfileName: UserProfileName
    var ExpiresInSeconds: js.UndefOr[ExpiresInSeconds]
    var SessionExpirationDurationInSeconds: js.UndefOr[SessionExpirationDurationInSeconds]
  }

  object CreatePresignedDomainUrlRequest {
    @inline
    def apply(
        DomainId: DomainId,
        UserProfileName: UserProfileName,
        ExpiresInSeconds: js.UndefOr[ExpiresInSeconds] = js.undefined,
        SessionExpirationDurationInSeconds: js.UndefOr[SessionExpirationDurationInSeconds] = js.undefined
    ): CreatePresignedDomainUrlRequest = {
      val __obj = js.Dynamic.literal(
        "DomainId" -> DomainId.asInstanceOf[js.Any],
        "UserProfileName" -> UserProfileName.asInstanceOf[js.Any]
      )

      ExpiresInSeconds.foreach(__v => __obj.updateDynamic("ExpiresInSeconds")(__v.asInstanceOf[js.Any]))
      SessionExpirationDurationInSeconds.foreach(__v => __obj.updateDynamic("SessionExpirationDurationInSeconds")(__v.asInstanceOf[js.Any]))
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

      SessionExpirationDurationInSeconds.foreach(__v => __obj.updateDynamic("SessionExpirationDurationInSeconds")(__v.asInstanceOf[js.Any]))
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
        "AppSpecification" -> AppSpecification.asInstanceOf[js.Any],
        "ProcessingJobName" -> ProcessingJobName.asInstanceOf[js.Any],
        "ProcessingResources" -> ProcessingResources.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
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
  trait CreateProjectInput extends js.Object {
    var ProjectName: ProjectEntityName
    var ServiceCatalogProvisioningDetails: ServiceCatalogProvisioningDetails
    var ProjectDescription: js.UndefOr[EntityDescription]
    var Tags: js.UndefOr[TagList]
  }

  object CreateProjectInput {
    @inline
    def apply(
        ProjectName: ProjectEntityName,
        ServiceCatalogProvisioningDetails: ServiceCatalogProvisioningDetails,
        ProjectDescription: js.UndefOr[EntityDescription] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateProjectInput = {
      val __obj = js.Dynamic.literal(
        "ProjectName" -> ProjectName.asInstanceOf[js.Any],
        "ServiceCatalogProvisioningDetails" -> ServiceCatalogProvisioningDetails.asInstanceOf[js.Any]
      )

      ProjectDescription.foreach(__v => __obj.updateDynamic("ProjectDescription")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProjectInput]
    }
  }

  @js.native
  trait CreateProjectOutput extends js.Object {
    var ProjectArn: ProjectArn
    var ProjectId: ProjectId
  }

  object CreateProjectOutput {
    @inline
    def apply(
        ProjectArn: ProjectArn,
        ProjectId: ProjectId
    ): CreateProjectOutput = {
      val __obj = js.Dynamic.literal(
        "ProjectArn" -> ProjectArn.asInstanceOf[js.Any],
        "ProjectId" -> ProjectId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateProjectOutput]
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
    var Environment: js.UndefOr[TrainingEnvironmentMap]
    var ExperimentConfig: js.UndefOr[ExperimentConfig]
    var HyperParameters: js.UndefOr[HyperParameters]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var ProfilerConfig: js.UndefOr[ProfilerConfig]
    var ProfilerRuleConfigurations: js.UndefOr[ProfilerRuleConfigurations]
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
        Environment: js.UndefOr[TrainingEnvironmentMap] = js.undefined,
        ExperimentConfig: js.UndefOr[ExperimentConfig] = js.undefined,
        HyperParameters: js.UndefOr[HyperParameters] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        ProfilerConfig: js.UndefOr[ProfilerConfig] = js.undefined,
        ProfilerRuleConfigurations: js.UndefOr[ProfilerRuleConfigurations] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TensorBoardOutputConfig: js.UndefOr[TensorBoardOutputConfig] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): CreateTrainingJobRequest = {
      val __obj = js.Dynamic.literal(
        "AlgorithmSpecification" -> AlgorithmSpecification.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any],
        "ResourceConfig" -> ResourceConfig.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "StoppingCondition" -> StoppingCondition.asInstanceOf[js.Any],
        "TrainingJobName" -> TrainingJobName.asInstanceOf[js.Any]
      )

      CheckpointConfig.foreach(__v => __obj.updateDynamic("CheckpointConfig")(__v.asInstanceOf[js.Any]))
      DebugHookConfig.foreach(__v => __obj.updateDynamic("DebugHookConfig")(__v.asInstanceOf[js.Any]))
      DebugRuleConfigurations.foreach(__v => __obj.updateDynamic("DebugRuleConfigurations")(__v.asInstanceOf[js.Any]))
      EnableInterContainerTrafficEncryption.foreach(__v => __obj.updateDynamic("EnableInterContainerTrafficEncryption")(__v.asInstanceOf[js.Any]))
      EnableManagedSpotTraining.foreach(__v => __obj.updateDynamic("EnableManagedSpotTraining")(__v.asInstanceOf[js.Any]))
      EnableNetworkIsolation.foreach(__v => __obj.updateDynamic("EnableNetworkIsolation")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      ExperimentConfig.foreach(__v => __obj.updateDynamic("ExperimentConfig")(__v.asInstanceOf[js.Any]))
      HyperParameters.foreach(__v => __obj.updateDynamic("HyperParameters")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      ProfilerConfig.foreach(__v => __obj.updateDynamic("ProfilerConfig")(__v.asInstanceOf[js.Any]))
      ProfilerRuleConfigurations.foreach(__v => __obj.updateDynamic("ProfilerRuleConfigurations")(__v.asInstanceOf[js.Any]))
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
        "ModelName" -> ModelName.asInstanceOf[js.Any],
        "TransformInput" -> TransformInput.asInstanceOf[js.Any],
        "TransformJobName" -> TransformJobName.asInstanceOf[js.Any],
        "TransformOutput" -> TransformOutput.asInstanceOf[js.Any],
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
    var MetadataProperties: js.UndefOr[MetadataProperties]
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
        MetadataProperties: js.UndefOr[MetadataProperties] = js.undefined,
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
      MetadataProperties.foreach(__v => __obj.updateDynamic("MetadataProperties")(__v.asInstanceOf[js.Any]))
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
    var MetadataProperties: js.UndefOr[MetadataProperties]
    var Tags: js.UndefOr[TagList]
  }

  object CreateTrialRequest {
    @inline
    def apply(
        ExperimentName: ExperimentEntityName,
        TrialName: ExperimentEntityName,
        DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined,
        MetadataProperties: js.UndefOr[MetadataProperties] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateTrialRequest = {
      val __obj = js.Dynamic.literal(
        "ExperimentName" -> ExperimentName.asInstanceOf[js.Any],
        "TrialName" -> TrialName.asInstanceOf[js.Any]
      )

      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      MetadataProperties.foreach(__v => __obj.updateDynamic("MetadataProperties")(__v.asInstanceOf[js.Any]))
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
        "DomainId" -> DomainId.asInstanceOf[js.Any],
        "UserProfileName" -> UserProfileName.asInstanceOf[js.Any]
      )

      SingleSignOnUserIdentifier.foreach(__v => __obj.updateDynamic("SingleSignOnUserIdentifier")(__v.asInstanceOf[js.Any]))
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
  trait CreateWorkforceRequest extends js.Object {
    var WorkforceName: WorkforceName
    var CognitoConfig: js.UndefOr[CognitoConfig]
    var OidcConfig: js.UndefOr[OidcConfig]
    var SourceIpConfig: js.UndefOr[SourceIpConfig]
    var Tags: js.UndefOr[TagList]
  }

  object CreateWorkforceRequest {
    @inline
    def apply(
        WorkforceName: WorkforceName,
        CognitoConfig: js.UndefOr[CognitoConfig] = js.undefined,
        OidcConfig: js.UndefOr[OidcConfig] = js.undefined,
        SourceIpConfig: js.UndefOr[SourceIpConfig] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateWorkforceRequest = {
      val __obj = js.Dynamic.literal(
        "WorkforceName" -> WorkforceName.asInstanceOf[js.Any]
      )

      CognitoConfig.foreach(__v => __obj.updateDynamic("CognitoConfig")(__v.asInstanceOf[js.Any]))
      OidcConfig.foreach(__v => __obj.updateDynamic("OidcConfig")(__v.asInstanceOf[js.Any]))
      SourceIpConfig.foreach(__v => __obj.updateDynamic("SourceIpConfig")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkforceRequest]
    }
  }

  @js.native
  trait CreateWorkforceResponse extends js.Object {
    var WorkforceArn: WorkforceArn
  }

  object CreateWorkforceResponse {
    @inline
    def apply(
        WorkforceArn: WorkforceArn
    ): CreateWorkforceResponse = {
      val __obj = js.Dynamic.literal(
        "WorkforceArn" -> WorkforceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateWorkforceResponse]
    }
  }

  @js.native
  trait CreateWorkteamRequest extends js.Object {
    var Description: String200
    var MemberDefinitions: MemberDefinitions
    var WorkteamName: WorkteamName
    var NotificationConfiguration: js.UndefOr[NotificationConfiguration]
    var Tags: js.UndefOr[TagList]
    var WorkforceName: js.UndefOr[WorkforceName]
  }

  object CreateWorkteamRequest {
    @inline
    def apply(
        Description: String200,
        MemberDefinitions: MemberDefinitions,
        WorkteamName: WorkteamName,
        NotificationConfiguration: js.UndefOr[NotificationConfiguration] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        WorkforceName: js.UndefOr[WorkforceName] = js.undefined
    ): CreateWorkteamRequest = {
      val __obj = js.Dynamic.literal(
        "Description" -> Description.asInstanceOf[js.Any],
        "MemberDefinitions" -> MemberDefinitions.asInstanceOf[js.Any],
        "WorkteamName" -> WorkteamName.asInstanceOf[js.Any]
      )

      NotificationConfiguration.foreach(__v => __obj.updateDynamic("NotificationConfiguration")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      WorkforceName.foreach(__v => __obj.updateDynamic("WorkforceName")(__v.asInstanceOf[js.Any]))
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

  /** A custom SageMaker image. For more information, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/studio-byoi.html|Bring your own SageMaker image]].
    */
  @js.native
  trait CustomImage extends js.Object {
    var AppImageConfigName: AppImageConfigName
    var ImageName: ImageName
    var ImageVersionNumber: js.UndefOr[ImageVersionNumber]
  }

  object CustomImage {
    @inline
    def apply(
        AppImageConfigName: AppImageConfigName,
        ImageName: ImageName,
        ImageVersionNumber: js.UndefOr[ImageVersionNumber] = js.undefined
    ): CustomImage = {
      val __obj = js.Dynamic.literal(
        "AppImageConfigName" -> AppImageConfigName.asInstanceOf[js.Any],
        "ImageName" -> ImageName.asInstanceOf[js.Any]
      )

      ImageVersionNumber.foreach(__v => __obj.updateDynamic("ImageVersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomImage]
    }
  }

  /** <p/>
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
        "CaptureOptions" -> CaptureOptions.asInstanceOf[js.Any],
        "DestinationS3Uri" -> DestinationS3Uri.asInstanceOf[js.Any],
        "InitialSamplingPercentage" -> InitialSamplingPercentage.asInstanceOf[js.Any]
      )

      CaptureContentTypeHeader.foreach(__v => __obj.updateDynamic("CaptureContentTypeHeader")(__v.asInstanceOf[js.Any]))
      EnableCapture.foreach(__v => __obj.updateDynamic("EnableCapture")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataCaptureConfig]
    }
  }

  /** <p/>
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
        "CaptureStatus" -> CaptureStatus.asInstanceOf[js.Any],
        "CurrentSamplingPercentage" -> CurrentSamplingPercentage.asInstanceOf[js.Any],
        "DestinationS3Uri" -> DestinationS3Uri.asInstanceOf[js.Any],
        "EnableCapture" -> EnableCapture.asInstanceOf[js.Any],
        "KmsKeyId" -> KmsKeyId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DataCaptureConfigSummary]
    }
  }

  /** The meta data of the Glue table which serves as data catalog for the <code>OfflineStore</code>.
    */
  @js.native
  trait DataCatalogConfig extends js.Object {
    var Catalog: Catalog
    var Database: Database
    var TableName: TableName
  }

  object DataCatalogConfig {
    @inline
    def apply(
        Catalog: Catalog,
        Database: Database,
        TableName: TableName
    ): DataCatalogConfig = {
      val __obj = js.Dynamic.literal(
        "Catalog" -> Catalog.asInstanceOf[js.Any],
        "Database" -> Database.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DataCatalogConfig]
    }
  }

  /** The data structure used to specify the data to be used for inference in a batch transform job and to associate the data that is relevant to the prediction results in the output. The input filter provided allows you to exclude input data that is not needed for inference in a batch transform job. The output filter provided allows you to include input data relevant to interpreting the predictions in the output from the job. For more information, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html|Associate Prediction Results with their Corresponding Input Records]].
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

  /** Information about the container that a data quality monitoring job runs.
    */
  @js.native
  trait DataQualityAppSpecification extends js.Object {
    var ImageUri: ImageUri
    var ContainerArguments: js.UndefOr[MonitoringContainerArguments]
    var ContainerEntrypoint: js.UndefOr[ContainerEntrypoint]
    var Environment: js.UndefOr[MonitoringEnvironmentMap]
    var PostAnalyticsProcessorSourceUri: js.UndefOr[S3Uri]
    var RecordPreprocessorSourceUri: js.UndefOr[S3Uri]
  }

  object DataQualityAppSpecification {
    @inline
    def apply(
        ImageUri: ImageUri,
        ContainerArguments: js.UndefOr[MonitoringContainerArguments] = js.undefined,
        ContainerEntrypoint: js.UndefOr[ContainerEntrypoint] = js.undefined,
        Environment: js.UndefOr[MonitoringEnvironmentMap] = js.undefined,
        PostAnalyticsProcessorSourceUri: js.UndefOr[S3Uri] = js.undefined,
        RecordPreprocessorSourceUri: js.UndefOr[S3Uri] = js.undefined
    ): DataQualityAppSpecification = {
      val __obj = js.Dynamic.literal(
        "ImageUri" -> ImageUri.asInstanceOf[js.Any]
      )

      ContainerArguments.foreach(__v => __obj.updateDynamic("ContainerArguments")(__v.asInstanceOf[js.Any]))
      ContainerEntrypoint.foreach(__v => __obj.updateDynamic("ContainerEntrypoint")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      PostAnalyticsProcessorSourceUri.foreach(__v => __obj.updateDynamic("PostAnalyticsProcessorSourceUri")(__v.asInstanceOf[js.Any]))
      RecordPreprocessorSourceUri.foreach(__v => __obj.updateDynamic("RecordPreprocessorSourceUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataQualityAppSpecification]
    }
  }

  /** Configuration for monitoring constraints and monitoring statistics. These baseline resources are compared against the results of the current job from the series of jobs scheduled to collect data periodically.
    */
  @js.native
  trait DataQualityBaselineConfig extends js.Object {
    var BaseliningJobName: js.UndefOr[ProcessingJobName]
    var ConstraintsResource: js.UndefOr[MonitoringConstraintsResource]
    var StatisticsResource: js.UndefOr[MonitoringStatisticsResource]
  }

  object DataQualityBaselineConfig {
    @inline
    def apply(
        BaseliningJobName: js.UndefOr[ProcessingJobName] = js.undefined,
        ConstraintsResource: js.UndefOr[MonitoringConstraintsResource] = js.undefined,
        StatisticsResource: js.UndefOr[MonitoringStatisticsResource] = js.undefined
    ): DataQualityBaselineConfig = {
      val __obj = js.Dynamic.literal()
      BaseliningJobName.foreach(__v => __obj.updateDynamic("BaseliningJobName")(__v.asInstanceOf[js.Any]))
      ConstraintsResource.foreach(__v => __obj.updateDynamic("ConstraintsResource")(__v.asInstanceOf[js.Any]))
      StatisticsResource.foreach(__v => __obj.updateDynamic("StatisticsResource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataQualityBaselineConfig]
    }
  }

  /** The input for the data quality monitoring job. Currently endpoints are supported for input.
    */
  @js.native
  trait DataQualityJobInput extends js.Object {
    var EndpointInput: EndpointInput
  }

  object DataQualityJobInput {
    @inline
    def apply(
        EndpointInput: EndpointInput
    ): DataQualityJobInput = {
      val __obj = js.Dynamic.literal(
        "EndpointInput" -> EndpointInput.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DataQualityJobInput]
    }
  }

  /** Describes the location of the channel data.
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

  /** Configuration for Dataset Definition inputs. The Dataset Definition input must specify exactly one of either <code>AthenaDatasetDefinition</code> or <code>RedshiftDatasetDefinition</code> types.
    */
  @js.native
  trait DatasetDefinition extends js.Object {
    var AthenaDatasetDefinition: js.UndefOr[AthenaDatasetDefinition]
    var DataDistributionType: js.UndefOr[DataDistributionType]
    var InputMode: js.UndefOr[InputMode]
    var LocalPath: js.UndefOr[ProcessingLocalPath]
    var RedshiftDatasetDefinition: js.UndefOr[RedshiftDatasetDefinition]
  }

  object DatasetDefinition {
    @inline
    def apply(
        AthenaDatasetDefinition: js.UndefOr[AthenaDatasetDefinition] = js.undefined,
        DataDistributionType: js.UndefOr[DataDistributionType] = js.undefined,
        InputMode: js.UndefOr[InputMode] = js.undefined,
        LocalPath: js.UndefOr[ProcessingLocalPath] = js.undefined,
        RedshiftDatasetDefinition: js.UndefOr[RedshiftDatasetDefinition] = js.undefined
    ): DatasetDefinition = {
      val __obj = js.Dynamic.literal()
      AthenaDatasetDefinition.foreach(__v => __obj.updateDynamic("AthenaDatasetDefinition")(__v.asInstanceOf[js.Any]))
      DataDistributionType.foreach(__v => __obj.updateDynamic("DataDistributionType")(__v.asInstanceOf[js.Any]))
      InputMode.foreach(__v => __obj.updateDynamic("InputMode")(__v.asInstanceOf[js.Any]))
      LocalPath.foreach(__v => __obj.updateDynamic("LocalPath")(__v.asInstanceOf[js.Any]))
      RedshiftDatasetDefinition.foreach(__v => __obj.updateDynamic("RedshiftDatasetDefinition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetDefinition]
    }
  }

  /** Configuration information for the Debugger hook parameters, metric and tensor collections, and storage paths. To learn more about how to configure the <code>DebugHookConfig</code> parameter, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/debugger-createtrainingjob-api.html|Use the SageMaker and Debugger Configuration API Operations to Create, Update, and Debug Your Training Job]].
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

  /** Configuration information for SageMaker Debugger rules for debugging. To learn more about how to configure the <code>DebugRuleConfiguration</code> parameter, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/debugger-createtrainingjob-api.html|Use the SageMaker and Debugger Configuration API Operations to Create, Update, and Debug Your Training Job]].
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
        "RuleEvaluatorImage" -> RuleEvaluatorImage.asInstanceOf[js.Any]
      )

      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      LocalPath.foreach(__v => __obj.updateDynamic("LocalPath")(__v.asInstanceOf[js.Any]))
      RuleParameters.foreach(__v => __obj.updateDynamic("RuleParameters")(__v.asInstanceOf[js.Any]))
      S3OutputPath.foreach(__v => __obj.updateDynamic("S3OutputPath")(__v.asInstanceOf[js.Any]))
      VolumeSizeInGB.foreach(__v => __obj.updateDynamic("VolumeSizeInGB")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DebugRuleConfiguration]
    }
  }

  /** Information about the status of the rule evaluation.
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
  trait DeleteActionRequest extends js.Object {
    var ActionName: ExperimentEntityName
  }

  object DeleteActionRequest {
    @inline
    def apply(
        ActionName: ExperimentEntityName
    ): DeleteActionRequest = {
      val __obj = js.Dynamic.literal(
        "ActionName" -> ActionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteActionRequest]
    }
  }

  @js.native
  trait DeleteActionResponse extends js.Object {
    var ActionArn: js.UndefOr[ActionArn]
  }

  object DeleteActionResponse {
    @inline
    def apply(
        ActionArn: js.UndefOr[ActionArn] = js.undefined
    ): DeleteActionResponse = {
      val __obj = js.Dynamic.literal()
      ActionArn.foreach(__v => __obj.updateDynamic("ActionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteActionResponse]
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
  trait DeleteAppImageConfigRequest extends js.Object {
    var AppImageConfigName: AppImageConfigName
  }

  object DeleteAppImageConfigRequest {
    @inline
    def apply(
        AppImageConfigName: AppImageConfigName
    ): DeleteAppImageConfigRequest = {
      val __obj = js.Dynamic.literal(
        "AppImageConfigName" -> AppImageConfigName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAppImageConfigRequest]
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
        "AppName" -> AppName.asInstanceOf[js.Any],
        "AppType" -> AppType.asInstanceOf[js.Any],
        "DomainId" -> DomainId.asInstanceOf[js.Any],
        "UserProfileName" -> UserProfileName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAppRequest]
    }
  }

  @js.native
  trait DeleteArtifactRequest extends js.Object {
    var ArtifactArn: js.UndefOr[ArtifactArn]
    var Source: js.UndefOr[ArtifactSource]
  }

  object DeleteArtifactRequest {
    @inline
    def apply(
        ArtifactArn: js.UndefOr[ArtifactArn] = js.undefined,
        Source: js.UndefOr[ArtifactSource] = js.undefined
    ): DeleteArtifactRequest = {
      val __obj = js.Dynamic.literal()
      ArtifactArn.foreach(__v => __obj.updateDynamic("ArtifactArn")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteArtifactRequest]
    }
  }

  @js.native
  trait DeleteArtifactResponse extends js.Object {
    var ArtifactArn: js.UndefOr[ArtifactArn]
  }

  object DeleteArtifactResponse {
    @inline
    def apply(
        ArtifactArn: js.UndefOr[ArtifactArn] = js.undefined
    ): DeleteArtifactResponse = {
      val __obj = js.Dynamic.literal()
      ArtifactArn.foreach(__v => __obj.updateDynamic("ArtifactArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteArtifactResponse]
    }
  }

  @js.native
  trait DeleteAssociationRequest extends js.Object {
    var DestinationArn: AssociationEntityArn
    var SourceArn: AssociationEntityArn
  }

  object DeleteAssociationRequest {
    @inline
    def apply(
        DestinationArn: AssociationEntityArn,
        SourceArn: AssociationEntityArn
    ): DeleteAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "DestinationArn" -> DestinationArn.asInstanceOf[js.Any],
        "SourceArn" -> SourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAssociationRequest]
    }
  }

  @js.native
  trait DeleteAssociationResponse extends js.Object {
    var DestinationArn: js.UndefOr[AssociationEntityArn]
    var SourceArn: js.UndefOr[AssociationEntityArn]
  }

  object DeleteAssociationResponse {
    @inline
    def apply(
        DestinationArn: js.UndefOr[AssociationEntityArn] = js.undefined,
        SourceArn: js.UndefOr[AssociationEntityArn] = js.undefined
    ): DeleteAssociationResponse = {
      val __obj = js.Dynamic.literal()
      DestinationArn.foreach(__v => __obj.updateDynamic("DestinationArn")(__v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAssociationResponse]
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
  trait DeleteContextRequest extends js.Object {
    var ContextName: ExperimentEntityName
  }

  object DeleteContextRequest {
    @inline
    def apply(
        ContextName: ExperimentEntityName
    ): DeleteContextRequest = {
      val __obj = js.Dynamic.literal(
        "ContextName" -> ContextName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteContextRequest]
    }
  }

  @js.native
  trait DeleteContextResponse extends js.Object {
    var ContextArn: js.UndefOr[ContextArn]
  }

  object DeleteContextResponse {
    @inline
    def apply(
        ContextArn: js.UndefOr[ContextArn] = js.undefined
    ): DeleteContextResponse = {
      val __obj = js.Dynamic.literal()
      ContextArn.foreach(__v => __obj.updateDynamic("ContextArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteContextResponse]
    }
  }

  @js.native
  trait DeleteDataQualityJobDefinitionRequest extends js.Object {
    var JobDefinitionName: MonitoringJobDefinitionName
  }

  object DeleteDataQualityJobDefinitionRequest {
    @inline
    def apply(
        JobDefinitionName: MonitoringJobDefinitionName
    ): DeleteDataQualityJobDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "JobDefinitionName" -> JobDefinitionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDataQualityJobDefinitionRequest]
    }
  }

  @js.native
  trait DeleteDeviceFleetRequest extends js.Object {
    var DeviceFleetName: EntityName
  }

  object DeleteDeviceFleetRequest {
    @inline
    def apply(
        DeviceFleetName: EntityName
    ): DeleteDeviceFleetRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceFleetName" -> DeviceFleetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDeviceFleetRequest]
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
  trait DeleteFeatureGroupRequest extends js.Object {
    var FeatureGroupName: FeatureGroupName
  }

  object DeleteFeatureGroupRequest {
    @inline
    def apply(
        FeatureGroupName: FeatureGroupName
    ): DeleteFeatureGroupRequest = {
      val __obj = js.Dynamic.literal(
        "FeatureGroupName" -> FeatureGroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFeatureGroupRequest]
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
  trait DeleteFlowDefinitionResponse extends js.Object

  object DeleteFlowDefinitionResponse {
    @inline
    def apply(): DeleteFlowDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteFlowDefinitionResponse]
    }
  }

  @js.native
  trait DeleteHumanTaskUiRequest extends js.Object {
    var HumanTaskUiName: HumanTaskUiName
  }

  object DeleteHumanTaskUiRequest {
    @inline
    def apply(
        HumanTaskUiName: HumanTaskUiName
    ): DeleteHumanTaskUiRequest = {
      val __obj = js.Dynamic.literal(
        "HumanTaskUiName" -> HumanTaskUiName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteHumanTaskUiRequest]
    }
  }

  @js.native
  trait DeleteHumanTaskUiResponse extends js.Object

  object DeleteHumanTaskUiResponse {
    @inline
    def apply(): DeleteHumanTaskUiResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteHumanTaskUiResponse]
    }
  }

  @js.native
  trait DeleteImageRequest extends js.Object {
    var ImageName: ImageName
  }

  object DeleteImageRequest {
    @inline
    def apply(
        ImageName: ImageName
    ): DeleteImageRequest = {
      val __obj = js.Dynamic.literal(
        "ImageName" -> ImageName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteImageRequest]
    }
  }

  @js.native
  trait DeleteImageResponse extends js.Object

  object DeleteImageResponse {
    @inline
    def apply(): DeleteImageResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteImageResponse]
    }
  }

  @js.native
  trait DeleteImageVersionRequest extends js.Object {
    var ImageName: ImageName
    var Version: ImageVersionNumber
  }

  object DeleteImageVersionRequest {
    @inline
    def apply(
        ImageName: ImageName,
        Version: ImageVersionNumber
    ): DeleteImageVersionRequest = {
      val __obj = js.Dynamic.literal(
        "ImageName" -> ImageName.asInstanceOf[js.Any],
        "Version" -> Version.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteImageVersionRequest]
    }
  }

  @js.native
  trait DeleteImageVersionResponse extends js.Object

  object DeleteImageVersionResponse {
    @inline
    def apply(): DeleteImageVersionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteImageVersionResponse]
    }
  }

  @js.native
  trait DeleteModelBiasJobDefinitionRequest extends js.Object {
    var JobDefinitionName: MonitoringJobDefinitionName
  }

  object DeleteModelBiasJobDefinitionRequest {
    @inline
    def apply(
        JobDefinitionName: MonitoringJobDefinitionName
    ): DeleteModelBiasJobDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "JobDefinitionName" -> JobDefinitionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteModelBiasJobDefinitionRequest]
    }
  }

  @js.native
  trait DeleteModelExplainabilityJobDefinitionRequest extends js.Object {
    var JobDefinitionName: MonitoringJobDefinitionName
  }

  object DeleteModelExplainabilityJobDefinitionRequest {
    @inline
    def apply(
        JobDefinitionName: MonitoringJobDefinitionName
    ): DeleteModelExplainabilityJobDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "JobDefinitionName" -> JobDefinitionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteModelExplainabilityJobDefinitionRequest]
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
  trait DeleteModelPackageGroupInput extends js.Object {
    var ModelPackageGroupName: ArnOrName
  }

  object DeleteModelPackageGroupInput {
    @inline
    def apply(
        ModelPackageGroupName: ArnOrName
    ): DeleteModelPackageGroupInput = {
      val __obj = js.Dynamic.literal(
        "ModelPackageGroupName" -> ModelPackageGroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteModelPackageGroupInput]
    }
  }

  @js.native
  trait DeleteModelPackageGroupPolicyInput extends js.Object {
    var ModelPackageGroupName: EntityName
  }

  object DeleteModelPackageGroupPolicyInput {
    @inline
    def apply(
        ModelPackageGroupName: EntityName
    ): DeleteModelPackageGroupPolicyInput = {
      val __obj = js.Dynamic.literal(
        "ModelPackageGroupName" -> ModelPackageGroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteModelPackageGroupPolicyInput]
    }
  }

  @js.native
  trait DeleteModelPackageInput extends js.Object {
    var ModelPackageName: VersionedArnOrName
  }

  object DeleteModelPackageInput {
    @inline
    def apply(
        ModelPackageName: VersionedArnOrName
    ): DeleteModelPackageInput = {
      val __obj = js.Dynamic.literal(
        "ModelPackageName" -> ModelPackageName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteModelPackageInput]
    }
  }

  @js.native
  trait DeleteModelQualityJobDefinitionRequest extends js.Object {
    var JobDefinitionName: MonitoringJobDefinitionName
  }

  object DeleteModelQualityJobDefinitionRequest {
    @inline
    def apply(
        JobDefinitionName: MonitoringJobDefinitionName
    ): DeleteModelQualityJobDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "JobDefinitionName" -> JobDefinitionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteModelQualityJobDefinitionRequest]
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
  trait DeletePipelineRequest extends js.Object {
    var ClientRequestToken: IdempotencyToken
    var PipelineName: PipelineName
  }

  object DeletePipelineRequest {
    @inline
    def apply(
        ClientRequestToken: IdempotencyToken,
        PipelineName: PipelineName
    ): DeletePipelineRequest = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "PipelineName" -> PipelineName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePipelineRequest]
    }
  }

  @js.native
  trait DeletePipelineResponse extends js.Object {
    var PipelineArn: js.UndefOr[PipelineArn]
  }

  object DeletePipelineResponse {
    @inline
    def apply(
        PipelineArn: js.UndefOr[PipelineArn] = js.undefined
    ): DeletePipelineResponse = {
      val __obj = js.Dynamic.literal()
      PipelineArn.foreach(__v => __obj.updateDynamic("PipelineArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePipelineResponse]
    }
  }

  @js.native
  trait DeleteProjectInput extends js.Object {
    var ProjectName: ProjectEntityName
  }

  object DeleteProjectInput {
    @inline
    def apply(
        ProjectName: ProjectEntityName
    ): DeleteProjectInput = {
      val __obj = js.Dynamic.literal(
        "ProjectName" -> ProjectName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteProjectInput]
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
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteTagsInput]
    }
  }

  @js.native
  trait DeleteTagsOutput extends js.Object

  object DeleteTagsOutput {
    @inline
    def apply(): DeleteTagsOutput = {
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
        "DomainId" -> DomainId.asInstanceOf[js.Any],
        "UserProfileName" -> UserProfileName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteUserProfileRequest]
    }
  }

  @js.native
  trait DeleteWorkforceRequest extends js.Object {
    var WorkforceName: WorkforceName
  }

  object DeleteWorkforceRequest {
    @inline
    def apply(
        WorkforceName: WorkforceName
    ): DeleteWorkforceRequest = {
      val __obj = js.Dynamic.literal(
        "WorkforceName" -> WorkforceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWorkforceRequest]
    }
  }

  @js.native
  trait DeleteWorkforceResponse extends js.Object

  object DeleteWorkforceResponse {
    @inline
    def apply(): DeleteWorkforceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteWorkforceResponse]
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

  /** Gets the Amazon EC2 Container Registry path of the docker image of the model that is hosted in this <a>ProductionVariant</a>. If you used the <code>registry/repository[:tag]</code> form to specify the image path of the primary container when you created the model hosted in this <code>ProductionVariant</code>, the path resolves to a path of the form <code>registry/repository[@digest]</code>. A digest is a hash value that identifies a specific version of an image. For information about Amazon ECR paths, see [[https://docs.aws.amazon.com/AmazonECR/latest/userguide/docker-pull-ecr-image.html|Pulling an Image]] in the <i>Amazon ECR User Guide</i>.
    */
  @js.native
  trait DeployedImage extends js.Object {
    var ResolutionTime: js.UndefOr[Timestamp]
    var ResolvedImage: js.UndefOr[ContainerImage]
    var SpecifiedImage: js.UndefOr[ContainerImage]
  }

  object DeployedImage {
    @inline
    def apply(
        ResolutionTime: js.UndefOr[Timestamp] = js.undefined,
        ResolvedImage: js.UndefOr[ContainerImage] = js.undefined,
        SpecifiedImage: js.UndefOr[ContainerImage] = js.undefined
    ): DeployedImage = {
      val __obj = js.Dynamic.literal()
      ResolutionTime.foreach(__v => __obj.updateDynamic("ResolutionTime")(__v.asInstanceOf[js.Any]))
      ResolvedImage.foreach(__v => __obj.updateDynamic("ResolvedImage")(__v.asInstanceOf[js.Any]))
      SpecifiedImage.foreach(__v => __obj.updateDynamic("SpecifiedImage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeployedImage]
    }
  }

  /** Currently, the <code>DeploymentConfig</code> API is not supported.
    */
  @js.native
  trait DeploymentConfig extends js.Object {
    var BlueGreenUpdatePolicy: BlueGreenUpdatePolicy
    var AutoRollbackConfiguration: js.UndefOr[AutoRollbackConfig]
  }

  object DeploymentConfig {
    @inline
    def apply(
        BlueGreenUpdatePolicy: BlueGreenUpdatePolicy,
        AutoRollbackConfiguration: js.UndefOr[AutoRollbackConfig] = js.undefined
    ): DeploymentConfig = {
      val __obj = js.Dynamic.literal(
        "BlueGreenUpdatePolicy" -> BlueGreenUpdatePolicy.asInstanceOf[js.Any]
      )

      AutoRollbackConfiguration.foreach(__v => __obj.updateDynamic("AutoRollbackConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentConfig]
    }
  }

  @js.native
  trait DeregisterDevicesRequest extends js.Object {
    var DeviceFleetName: EntityName
    var DeviceNames: DeviceNames
  }

  object DeregisterDevicesRequest {
    @inline
    def apply(
        DeviceFleetName: EntityName,
        DeviceNames: DeviceNames
    ): DeregisterDevicesRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceFleetName" -> DeviceFleetName.asInstanceOf[js.Any],
        "DeviceNames" -> DeviceNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeregisterDevicesRequest]
    }
  }

  @js.native
  trait DescribeActionRequest extends js.Object {
    var ActionName: ExperimentEntityName
  }

  object DescribeActionRequest {
    @inline
    def apply(
        ActionName: ExperimentEntityName
    ): DescribeActionRequest = {
      val __obj = js.Dynamic.literal(
        "ActionName" -> ActionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeActionRequest]
    }
  }

  @js.native
  trait DescribeActionResponse extends js.Object {
    var ActionArn: js.UndefOr[ActionArn]
    var ActionName: js.UndefOr[ExperimentEntityName]
    var ActionType: js.UndefOr[String256]
    var CreatedBy: js.UndefOr[UserContext]
    var CreationTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[ExperimentDescription]
    var LastModifiedBy: js.UndefOr[UserContext]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var MetadataProperties: js.UndefOr[MetadataProperties]
    var Properties: js.UndefOr[LineageEntityParameters]
    var Source: js.UndefOr[ActionSource]
    var Status: js.UndefOr[ActionStatus]
  }

  object DescribeActionResponse {
    @inline
    def apply(
        ActionArn: js.UndefOr[ActionArn] = js.undefined,
        ActionName: js.UndefOr[ExperimentEntityName] = js.undefined,
        ActionType: js.UndefOr[String256] = js.undefined,
        CreatedBy: js.UndefOr[UserContext] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[ExperimentDescription] = js.undefined,
        LastModifiedBy: js.UndefOr[UserContext] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        MetadataProperties: js.UndefOr[MetadataProperties] = js.undefined,
        Properties: js.UndefOr[LineageEntityParameters] = js.undefined,
        Source: js.UndefOr[ActionSource] = js.undefined,
        Status: js.UndefOr[ActionStatus] = js.undefined
    ): DescribeActionResponse = {
      val __obj = js.Dynamic.literal()
      ActionArn.foreach(__v => __obj.updateDynamic("ActionArn")(__v.asInstanceOf[js.Any]))
      ActionName.foreach(__v => __obj.updateDynamic("ActionName")(__v.asInstanceOf[js.Any]))
      ActionType.foreach(__v => __obj.updateDynamic("ActionType")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      MetadataProperties.foreach(__v => __obj.updateDynamic("MetadataProperties")(__v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.updateDynamic("Properties")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeActionResponse]
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
        "AlgorithmArn" -> AlgorithmArn.asInstanceOf[js.Any],
        "AlgorithmName" -> AlgorithmName.asInstanceOf[js.Any],
        "AlgorithmStatus" -> AlgorithmStatus.asInstanceOf[js.Any],
        "AlgorithmStatusDetails" -> AlgorithmStatusDetails.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "TrainingSpecification" -> TrainingSpecification.asInstanceOf[js.Any]
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
  trait DescribeAppImageConfigRequest extends js.Object {
    var AppImageConfigName: AppImageConfigName
  }

  object DescribeAppImageConfigRequest {
    @inline
    def apply(
        AppImageConfigName: AppImageConfigName
    ): DescribeAppImageConfigRequest = {
      val __obj = js.Dynamic.literal(
        "AppImageConfigName" -> AppImageConfigName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAppImageConfigRequest]
    }
  }

  @js.native
  trait DescribeAppImageConfigResponse extends js.Object {
    var AppImageConfigArn: js.UndefOr[AppImageConfigArn]
    var AppImageConfigName: js.UndefOr[AppImageConfigName]
    var CreationTime: js.UndefOr[Timestamp]
    var KernelGatewayImageConfig: js.UndefOr[KernelGatewayImageConfig]
    var LastModifiedTime: js.UndefOr[Timestamp]
  }

  object DescribeAppImageConfigResponse {
    @inline
    def apply(
        AppImageConfigArn: js.UndefOr[AppImageConfigArn] = js.undefined,
        AppImageConfigName: js.UndefOr[AppImageConfigName] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        KernelGatewayImageConfig: js.UndefOr[KernelGatewayImageConfig] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
    ): DescribeAppImageConfigResponse = {
      val __obj = js.Dynamic.literal()
      AppImageConfigArn.foreach(__v => __obj.updateDynamic("AppImageConfigArn")(__v.asInstanceOf[js.Any]))
      AppImageConfigName.foreach(__v => __obj.updateDynamic("AppImageConfigName")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      KernelGatewayImageConfig.foreach(__v => __obj.updateDynamic("KernelGatewayImageConfig")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAppImageConfigResponse]
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
        "AppName" -> AppName.asInstanceOf[js.Any],
        "AppType" -> AppType.asInstanceOf[js.Any],
        "DomainId" -> DomainId.asInstanceOf[js.Any],
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
      LastUserActivityTimestamp.foreach(__v => __obj.updateDynamic("LastUserActivityTimestamp")(__v.asInstanceOf[js.Any]))
      ResourceSpec.foreach(__v => __obj.updateDynamic("ResourceSpec")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UserProfileName.foreach(__v => __obj.updateDynamic("UserProfileName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAppResponse]
    }
  }

  @js.native
  trait DescribeArtifactRequest extends js.Object {
    var ArtifactArn: ArtifactArn
  }

  object DescribeArtifactRequest {
    @inline
    def apply(
        ArtifactArn: ArtifactArn
    ): DescribeArtifactRequest = {
      val __obj = js.Dynamic.literal(
        "ArtifactArn" -> ArtifactArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeArtifactRequest]
    }
  }

  @js.native
  trait DescribeArtifactResponse extends js.Object {
    var ArtifactArn: js.UndefOr[ArtifactArn]
    var ArtifactName: js.UndefOr[ExperimentEntityName]
    var ArtifactType: js.UndefOr[String256]
    var CreatedBy: js.UndefOr[UserContext]
    var CreationTime: js.UndefOr[Timestamp]
    var LastModifiedBy: js.UndefOr[UserContext]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var MetadataProperties: js.UndefOr[MetadataProperties]
    var Properties: js.UndefOr[LineageEntityParameters]
    var Source: js.UndefOr[ArtifactSource]
  }

  object DescribeArtifactResponse {
    @inline
    def apply(
        ArtifactArn: js.UndefOr[ArtifactArn] = js.undefined,
        ArtifactName: js.UndefOr[ExperimentEntityName] = js.undefined,
        ArtifactType: js.UndefOr[String256] = js.undefined,
        CreatedBy: js.UndefOr[UserContext] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedBy: js.UndefOr[UserContext] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        MetadataProperties: js.UndefOr[MetadataProperties] = js.undefined,
        Properties: js.UndefOr[LineageEntityParameters] = js.undefined,
        Source: js.UndefOr[ArtifactSource] = js.undefined
    ): DescribeArtifactResponse = {
      val __obj = js.Dynamic.literal()
      ArtifactArn.foreach(__v => __obj.updateDynamic("ArtifactArn")(__v.asInstanceOf[js.Any]))
      ArtifactName.foreach(__v => __obj.updateDynamic("ArtifactName")(__v.asInstanceOf[js.Any]))
      ArtifactType.foreach(__v => __obj.updateDynamic("ArtifactType")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      MetadataProperties.foreach(__v => __obj.updateDynamic("MetadataProperties")(__v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.updateDynamic("Properties")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeArtifactResponse]
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
    var PartialFailureReasons: js.UndefOr[AutoMLPartialFailureReasons]
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
        PartialFailureReasons: js.UndefOr[AutoMLPartialFailureReasons] = js.undefined,
        ProblemType: js.UndefOr[ProblemType] = js.undefined,
        ResolvedAttributes: js.UndefOr[ResolvedAttributes] = js.undefined
    ): DescribeAutoMLJobResponse = {
      val __obj = js.Dynamic.literal(
        "AutoMLJobArn" -> AutoMLJobArn.asInstanceOf[js.Any],
        "AutoMLJobName" -> AutoMLJobName.asInstanceOf[js.Any],
        "AutoMLJobSecondaryStatus" -> AutoMLJobSecondaryStatus.asInstanceOf[js.Any],
        "AutoMLJobStatus" -> AutoMLJobStatus.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      AutoMLJobArtifacts.foreach(__v => __obj.updateDynamic("AutoMLJobArtifacts")(__v.asInstanceOf[js.Any]))
      AutoMLJobConfig.foreach(__v => __obj.updateDynamic("AutoMLJobConfig")(__v.asInstanceOf[js.Any]))
      AutoMLJobObjective.foreach(__v => __obj.updateDynamic("AutoMLJobObjective")(__v.asInstanceOf[js.Any]))
      BestCandidate.foreach(__v => __obj.updateDynamic("BestCandidate")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      GenerateCandidateDefinitionsOnly.foreach(__v => __obj.updateDynamic("GenerateCandidateDefinitionsOnly")(__v.asInstanceOf[js.Any]))
      PartialFailureReasons.foreach(__v => __obj.updateDynamic("PartialFailureReasons")(__v.asInstanceOf[js.Any]))
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
        "CodeRepositoryArn" -> CodeRepositoryArn.asInstanceOf[js.Any],
        "CodeRepositoryName" -> CodeRepositoryName.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any]
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
    var ModelDigests: js.UndefOr[ModelDigests]
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
        CompilationStartTime: js.UndefOr[Timestamp] = js.undefined,
        ModelDigests: js.UndefOr[ModelDigests] = js.undefined
    ): DescribeCompilationJobResponse = {
      val __obj = js.Dynamic.literal(
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
        "StoppingCondition" -> StoppingCondition.asInstanceOf[js.Any]
      )

      CompilationEndTime.foreach(__v => __obj.updateDynamic("CompilationEndTime")(__v.asInstanceOf[js.Any]))
      CompilationStartTime.foreach(__v => __obj.updateDynamic("CompilationStartTime")(__v.asInstanceOf[js.Any]))
      ModelDigests.foreach(__v => __obj.updateDynamic("ModelDigests")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCompilationJobResponse]
    }
  }

  @js.native
  trait DescribeContextRequest extends js.Object {
    var ContextName: ExperimentEntityName
  }

  object DescribeContextRequest {
    @inline
    def apply(
        ContextName: ExperimentEntityName
    ): DescribeContextRequest = {
      val __obj = js.Dynamic.literal(
        "ContextName" -> ContextName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeContextRequest]
    }
  }

  @js.native
  trait DescribeContextResponse extends js.Object {
    var ContextArn: js.UndefOr[ContextArn]
    var ContextName: js.UndefOr[ExperimentEntityName]
    var ContextType: js.UndefOr[String256]
    var CreatedBy: js.UndefOr[UserContext]
    var CreationTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[ExperimentDescription]
    var LastModifiedBy: js.UndefOr[UserContext]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Properties: js.UndefOr[LineageEntityParameters]
    var Source: js.UndefOr[ContextSource]
  }

  object DescribeContextResponse {
    @inline
    def apply(
        ContextArn: js.UndefOr[ContextArn] = js.undefined,
        ContextName: js.UndefOr[ExperimentEntityName] = js.undefined,
        ContextType: js.UndefOr[String256] = js.undefined,
        CreatedBy: js.UndefOr[UserContext] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[ExperimentDescription] = js.undefined,
        LastModifiedBy: js.UndefOr[UserContext] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Properties: js.UndefOr[LineageEntityParameters] = js.undefined,
        Source: js.UndefOr[ContextSource] = js.undefined
    ): DescribeContextResponse = {
      val __obj = js.Dynamic.literal()
      ContextArn.foreach(__v => __obj.updateDynamic("ContextArn")(__v.asInstanceOf[js.Any]))
      ContextName.foreach(__v => __obj.updateDynamic("ContextName")(__v.asInstanceOf[js.Any]))
      ContextType.foreach(__v => __obj.updateDynamic("ContextType")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.updateDynamic("Properties")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeContextResponse]
    }
  }

  @js.native
  trait DescribeDataQualityJobDefinitionRequest extends js.Object {
    var JobDefinitionName: MonitoringJobDefinitionName
  }

  object DescribeDataQualityJobDefinitionRequest {
    @inline
    def apply(
        JobDefinitionName: MonitoringJobDefinitionName
    ): DescribeDataQualityJobDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "JobDefinitionName" -> JobDefinitionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDataQualityJobDefinitionRequest]
    }
  }

  @js.native
  trait DescribeDataQualityJobDefinitionResponse extends js.Object {
    var CreationTime: Timestamp
    var DataQualityAppSpecification: DataQualityAppSpecification
    var DataQualityJobInput: DataQualityJobInput
    var DataQualityJobOutputConfig: MonitoringOutputConfig
    var JobDefinitionArn: MonitoringJobDefinitionArn
    var JobDefinitionName: MonitoringJobDefinitionName
    var JobResources: MonitoringResources
    var RoleArn: RoleArn
    var DataQualityBaselineConfig: js.UndefOr[DataQualityBaselineConfig]
    var NetworkConfig: js.UndefOr[MonitoringNetworkConfig]
    var StoppingCondition: js.UndefOr[MonitoringStoppingCondition]
  }

  object DescribeDataQualityJobDefinitionResponse {
    @inline
    def apply(
        CreationTime: Timestamp,
        DataQualityAppSpecification: DataQualityAppSpecification,
        DataQualityJobInput: DataQualityJobInput,
        DataQualityJobOutputConfig: MonitoringOutputConfig,
        JobDefinitionArn: MonitoringJobDefinitionArn,
        JobDefinitionName: MonitoringJobDefinitionName,
        JobResources: MonitoringResources,
        RoleArn: RoleArn,
        DataQualityBaselineConfig: js.UndefOr[DataQualityBaselineConfig] = js.undefined,
        NetworkConfig: js.UndefOr[MonitoringNetworkConfig] = js.undefined,
        StoppingCondition: js.UndefOr[MonitoringStoppingCondition] = js.undefined
    ): DescribeDataQualityJobDefinitionResponse = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "DataQualityAppSpecification" -> DataQualityAppSpecification.asInstanceOf[js.Any],
        "DataQualityJobInput" -> DataQualityJobInput.asInstanceOf[js.Any],
        "DataQualityJobOutputConfig" -> DataQualityJobOutputConfig.asInstanceOf[js.Any],
        "JobDefinitionArn" -> JobDefinitionArn.asInstanceOf[js.Any],
        "JobDefinitionName" -> JobDefinitionName.asInstanceOf[js.Any],
        "JobResources" -> JobResources.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      DataQualityBaselineConfig.foreach(__v => __obj.updateDynamic("DataQualityBaselineConfig")(__v.asInstanceOf[js.Any]))
      NetworkConfig.foreach(__v => __obj.updateDynamic("NetworkConfig")(__v.asInstanceOf[js.Any]))
      StoppingCondition.foreach(__v => __obj.updateDynamic("StoppingCondition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDataQualityJobDefinitionResponse]
    }
  }

  @js.native
  trait DescribeDeviceFleetRequest extends js.Object {
    var DeviceFleetName: EntityName
  }

  object DescribeDeviceFleetRequest {
    @inline
    def apply(
        DeviceFleetName: EntityName
    ): DescribeDeviceFleetRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceFleetName" -> DeviceFleetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDeviceFleetRequest]
    }
  }

  @js.native
  trait DescribeDeviceFleetResponse extends js.Object {
    var CreationTime: Timestamp
    var DeviceFleetArn: DeviceFleetArn
    var DeviceFleetName: EntityName
    var LastModifiedTime: Timestamp
    var OutputConfig: EdgeOutputConfig
    var Description: js.UndefOr[DeviceFleetDescription]
    var IotRoleAlias: js.UndefOr[IotRoleAlias]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object DescribeDeviceFleetResponse {
    @inline
    def apply(
        CreationTime: Timestamp,
        DeviceFleetArn: DeviceFleetArn,
        DeviceFleetName: EntityName,
        LastModifiedTime: Timestamp,
        OutputConfig: EdgeOutputConfig,
        Description: js.UndefOr[DeviceFleetDescription] = js.undefined,
        IotRoleAlias: js.UndefOr[IotRoleAlias] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined
    ): DescribeDeviceFleetResponse = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "DeviceFleetArn" -> DeviceFleetArn.asInstanceOf[js.Any],
        "DeviceFleetName" -> DeviceFleetName.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "OutputConfig" -> OutputConfig.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IotRoleAlias.foreach(__v => __obj.updateDynamic("IotRoleAlias")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDeviceFleetResponse]
    }
  }

  @js.native
  trait DescribeDeviceRequest extends js.Object {
    var DeviceFleetName: EntityName
    var DeviceName: EntityName
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeDeviceRequest {
    @inline
    def apply(
        DeviceFleetName: EntityName,
        DeviceName: EntityName,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceFleetName" -> DeviceFleetName.asInstanceOf[js.Any],
        "DeviceName" -> DeviceName.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDeviceRequest]
    }
  }

  @js.native
  trait DescribeDeviceResponse extends js.Object {
    var DeviceFleetName: EntityName
    var DeviceName: EntityName
    var RegistrationTime: Timestamp
    var Description: js.UndefOr[DeviceDescription]
    var DeviceArn: js.UndefOr[DeviceArn]
    var IotThingName: js.UndefOr[ThingName]
    var LatestHeartbeat: js.UndefOr[Timestamp]
    var MaxModels: js.UndefOr[Int]
    var Models: js.UndefOr[EdgeModels]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeDeviceResponse {
    @inline
    def apply(
        DeviceFleetName: EntityName,
        DeviceName: EntityName,
        RegistrationTime: Timestamp,
        Description: js.UndefOr[DeviceDescription] = js.undefined,
        DeviceArn: js.UndefOr[DeviceArn] = js.undefined,
        IotThingName: js.UndefOr[ThingName] = js.undefined,
        LatestHeartbeat: js.UndefOr[Timestamp] = js.undefined,
        MaxModels: js.UndefOr[Int] = js.undefined,
        Models: js.UndefOr[EdgeModels] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeDeviceResponse = {
      val __obj = js.Dynamic.literal(
        "DeviceFleetName" -> DeviceFleetName.asInstanceOf[js.Any],
        "DeviceName" -> DeviceName.asInstanceOf[js.Any],
        "RegistrationTime" -> RegistrationTime.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DeviceArn.foreach(__v => __obj.updateDynamic("DeviceArn")(__v.asInstanceOf[js.Any]))
      IotThingName.foreach(__v => __obj.updateDynamic("IotThingName")(__v.asInstanceOf[js.Any]))
      LatestHeartbeat.foreach(__v => __obj.updateDynamic("LatestHeartbeat")(__v.asInstanceOf[js.Any]))
      MaxModels.foreach(__v => __obj.updateDynamic("MaxModels")(__v.asInstanceOf[js.Any]))
      Models.foreach(__v => __obj.updateDynamic("Models")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDeviceResponse]
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
    var AppNetworkAccessType: js.UndefOr[AppNetworkAccessType]
    var AuthMode: js.UndefOr[AuthMode]
    var CreationTime: js.UndefOr[CreationTime]
    var DefaultUserSettings: js.UndefOr[UserSettings]
    var DomainArn: js.UndefOr[DomainArn]
    var DomainId: js.UndefOr[DomainId]
    var DomainName: js.UndefOr[DomainName]
    var FailureReason: js.UndefOr[FailureReason]
    var HomeEfsFileSystemId: js.UndefOr[ResourceId]
    var HomeEfsFileSystemKmsKeyId: js.UndefOr[KmsKeyId]
    var KmsKeyId: js.UndefOr[KmsKeyId]
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
        AppNetworkAccessType: js.UndefOr[AppNetworkAccessType] = js.undefined,
        AuthMode: js.UndefOr[AuthMode] = js.undefined,
        CreationTime: js.UndefOr[CreationTime] = js.undefined,
        DefaultUserSettings: js.UndefOr[UserSettings] = js.undefined,
        DomainArn: js.UndefOr[DomainArn] = js.undefined,
        DomainId: js.UndefOr[DomainId] = js.undefined,
        DomainName: js.UndefOr[DomainName] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        HomeEfsFileSystemId: js.UndefOr[ResourceId] = js.undefined,
        HomeEfsFileSystemKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined,
        SingleSignOnManagedApplicationInstanceId: js.UndefOr[String256] = js.undefined,
        Status: js.UndefOr[DomainStatus] = js.undefined,
        SubnetIds: js.UndefOr[Subnets] = js.undefined,
        Url: js.UndefOr[String1024] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): DescribeDomainResponse = {
      val __obj = js.Dynamic.literal()
      AppNetworkAccessType.foreach(__v => __obj.updateDynamic("AppNetworkAccessType")(__v.asInstanceOf[js.Any]))
      AuthMode.foreach(__v => __obj.updateDynamic("AuthMode")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DefaultUserSettings.foreach(__v => __obj.updateDynamic("DefaultUserSettings")(__v.asInstanceOf[js.Any]))
      DomainArn.foreach(__v => __obj.updateDynamic("DomainArn")(__v.asInstanceOf[js.Any]))
      DomainId.foreach(__v => __obj.updateDynamic("DomainId")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      HomeEfsFileSystemId.foreach(__v => __obj.updateDynamic("HomeEfsFileSystemId")(__v.asInstanceOf[js.Any]))
      HomeEfsFileSystemKmsKeyId.foreach(__v => __obj.updateDynamic("HomeEfsFileSystemKmsKeyId")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      SingleSignOnManagedApplicationInstanceId.foreach(__v => __obj.updateDynamic("SingleSignOnManagedApplicationInstanceId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDomainResponse]
    }
  }

  @js.native
  trait DescribeEdgePackagingJobRequest extends js.Object {
    var EdgePackagingJobName: EntityName
  }

  object DescribeEdgePackagingJobRequest {
    @inline
    def apply(
        EdgePackagingJobName: EntityName
    ): DescribeEdgePackagingJobRequest = {
      val __obj = js.Dynamic.literal(
        "EdgePackagingJobName" -> EdgePackagingJobName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeEdgePackagingJobRequest]
    }
  }

  @js.native
  trait DescribeEdgePackagingJobResponse extends js.Object {
    var EdgePackagingJobArn: EdgePackagingJobArn
    var EdgePackagingJobName: EntityName
    var EdgePackagingJobStatus: EdgePackagingJobStatus
    var CompilationJobName: js.UndefOr[EntityName]
    var CreationTime: js.UndefOr[Timestamp]
    var EdgePackagingJobStatusMessage: js.UndefOr[String]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var ModelArtifact: js.UndefOr[S3Uri]
    var ModelName: js.UndefOr[EntityName]
    var ModelSignature: js.UndefOr[String]
    var ModelVersion: js.UndefOr[EdgeVersion]
    var OutputConfig: js.UndefOr[EdgeOutputConfig]
    var ResourceKey: js.UndefOr[KmsKeyId]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object DescribeEdgePackagingJobResponse {
    @inline
    def apply(
        EdgePackagingJobArn: EdgePackagingJobArn,
        EdgePackagingJobName: EntityName,
        EdgePackagingJobStatus: EdgePackagingJobStatus,
        CompilationJobName: js.UndefOr[EntityName] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        EdgePackagingJobStatusMessage: js.UndefOr[String] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        ModelArtifact: js.UndefOr[S3Uri] = js.undefined,
        ModelName: js.UndefOr[EntityName] = js.undefined,
        ModelSignature: js.UndefOr[String] = js.undefined,
        ModelVersion: js.UndefOr[EdgeVersion] = js.undefined,
        OutputConfig: js.UndefOr[EdgeOutputConfig] = js.undefined,
        ResourceKey: js.UndefOr[KmsKeyId] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined
    ): DescribeEdgePackagingJobResponse = {
      val __obj = js.Dynamic.literal(
        "EdgePackagingJobArn" -> EdgePackagingJobArn.asInstanceOf[js.Any],
        "EdgePackagingJobName" -> EdgePackagingJobName.asInstanceOf[js.Any],
        "EdgePackagingJobStatus" -> EdgePackagingJobStatus.asInstanceOf[js.Any]
      )

      CompilationJobName.foreach(__v => __obj.updateDynamic("CompilationJobName")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      EdgePackagingJobStatusMessage.foreach(__v => __obj.updateDynamic("EdgePackagingJobStatusMessage")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      ModelArtifact.foreach(__v => __obj.updateDynamic("ModelArtifact")(__v.asInstanceOf[js.Any]))
      ModelName.foreach(__v => __obj.updateDynamic("ModelName")(__v.asInstanceOf[js.Any]))
      ModelSignature.foreach(__v => __obj.updateDynamic("ModelSignature")(__v.asInstanceOf[js.Any]))
      ModelVersion.foreach(__v => __obj.updateDynamic("ModelVersion")(__v.asInstanceOf[js.Any]))
      OutputConfig.foreach(__v => __obj.updateDynamic("OutputConfig")(__v.asInstanceOf[js.Any]))
      ResourceKey.foreach(__v => __obj.updateDynamic("ResourceKey")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEdgePackagingJobResponse]
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
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "EndpointConfigArn" -> EndpointConfigArn.asInstanceOf[js.Any],
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
    var LastDeploymentConfig: js.UndefOr[DeploymentConfig]
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
        LastDeploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined,
        ProductionVariants: js.UndefOr[ProductionVariantSummaryList] = js.undefined
    ): DescribeEndpointOutput = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any],
        "EndpointConfigName" -> EndpointConfigName.asInstanceOf[js.Any],
        "EndpointName" -> EndpointName.asInstanceOf[js.Any],
        "EndpointStatus" -> EndpointStatus.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any]
      )

      DataCaptureConfig.foreach(__v => __obj.updateDynamic("DataCaptureConfig")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LastDeploymentConfig.foreach(__v => __obj.updateDynamic("LastDeploymentConfig")(__v.asInstanceOf[js.Any]))
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
  trait DescribeFeatureGroupRequest extends js.Object {
    var FeatureGroupName: FeatureGroupName
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeFeatureGroupRequest {
    @inline
    def apply(
        FeatureGroupName: FeatureGroupName,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeFeatureGroupRequest = {
      val __obj = js.Dynamic.literal(
        "FeatureGroupName" -> FeatureGroupName.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFeatureGroupRequest]
    }
  }

  @js.native
  trait DescribeFeatureGroupResponse extends js.Object {
    var CreationTime: CreationTime
    var EventTimeFeatureName: FeatureName
    var FeatureDefinitions: FeatureDefinitions
    var FeatureGroupArn: FeatureGroupArn
    var FeatureGroupName: FeatureGroupName
    var NextToken: NextToken
    var RecordIdentifierFeatureName: FeatureName
    var Description: js.UndefOr[Description]
    var FailureReason: js.UndefOr[FailureReason]
    var FeatureGroupStatus: js.UndefOr[FeatureGroupStatus]
    var OfflineStoreConfig: js.UndefOr[OfflineStoreConfig]
    var OfflineStoreStatus: js.UndefOr[OfflineStoreStatus]
    var OnlineStoreConfig: js.UndefOr[OnlineStoreConfig]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object DescribeFeatureGroupResponse {
    @inline
    def apply(
        CreationTime: CreationTime,
        EventTimeFeatureName: FeatureName,
        FeatureDefinitions: FeatureDefinitions,
        FeatureGroupArn: FeatureGroupArn,
        FeatureGroupName: FeatureGroupName,
        NextToken: NextToken,
        RecordIdentifierFeatureName: FeatureName,
        Description: js.UndefOr[Description] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        FeatureGroupStatus: js.UndefOr[FeatureGroupStatus] = js.undefined,
        OfflineStoreConfig: js.UndefOr[OfflineStoreConfig] = js.undefined,
        OfflineStoreStatus: js.UndefOr[OfflineStoreStatus] = js.undefined,
        OnlineStoreConfig: js.UndefOr[OnlineStoreConfig] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined
    ): DescribeFeatureGroupResponse = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "EventTimeFeatureName" -> EventTimeFeatureName.asInstanceOf[js.Any],
        "FeatureDefinitions" -> FeatureDefinitions.asInstanceOf[js.Any],
        "FeatureGroupArn" -> FeatureGroupArn.asInstanceOf[js.Any],
        "FeatureGroupName" -> FeatureGroupName.asInstanceOf[js.Any],
        "NextToken" -> NextToken.asInstanceOf[js.Any],
        "RecordIdentifierFeatureName" -> RecordIdentifierFeatureName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      FeatureGroupStatus.foreach(__v => __obj.updateDynamic("FeatureGroupStatus")(__v.asInstanceOf[js.Any]))
      OfflineStoreConfig.foreach(__v => __obj.updateDynamic("OfflineStoreConfig")(__v.asInstanceOf[js.Any]))
      OfflineStoreStatus.foreach(__v => __obj.updateDynamic("OfflineStoreStatus")(__v.asInstanceOf[js.Any]))
      OnlineStoreConfig.foreach(__v => __obj.updateDynamic("OnlineStoreConfig")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFeatureGroupResponse]
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
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "FlowDefinitionArn" -> FlowDefinitionArn.asInstanceOf[js.Any],
        "FlowDefinitionName" -> FlowDefinitionName.asInstanceOf[js.Any],
        "FlowDefinitionStatus" -> FlowDefinitionStatus.asInstanceOf[js.Any],
        "HumanLoopConfig" -> HumanLoopConfig.asInstanceOf[js.Any],
        "OutputConfig" -> OutputConfig.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      HumanLoopActivationConfig.foreach(__v => __obj.updateDynamic("HumanLoopActivationConfig")(__v.asInstanceOf[js.Any]))
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
    var HumanTaskUiStatus: js.UndefOr[HumanTaskUiStatus]
  }

  object DescribeHumanTaskUiResponse {
    @inline
    def apply(
        CreationTime: Timestamp,
        HumanTaskUiArn: HumanTaskUiArn,
        HumanTaskUiName: HumanTaskUiName,
        UiTemplate: UiTemplateInfo,
        HumanTaskUiStatus: js.UndefOr[HumanTaskUiStatus] = js.undefined
    ): DescribeHumanTaskUiResponse = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "HumanTaskUiArn" -> HumanTaskUiArn.asInstanceOf[js.Any],
        "HumanTaskUiName" -> HumanTaskUiName.asInstanceOf[js.Any],
        "UiTemplate" -> UiTemplate.asInstanceOf[js.Any]
      )

      HumanTaskUiStatus.foreach(__v => __obj.updateDynamic("HumanTaskUiStatus")(__v.asInstanceOf[js.Any]))
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
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "HyperParameterTuningJobArn" -> HyperParameterTuningJobArn.asInstanceOf[js.Any],
        "HyperParameterTuningJobConfig" -> HyperParameterTuningJobConfig.asInstanceOf[js.Any],
        "HyperParameterTuningJobName" -> HyperParameterTuningJobName.asInstanceOf[js.Any],
        "HyperParameterTuningJobStatus" -> HyperParameterTuningJobStatus.asInstanceOf[js.Any],
        "ObjectiveStatusCounters" -> ObjectiveStatusCounters.asInstanceOf[js.Any],
        "TrainingJobStatusCounters" -> TrainingJobStatusCounters.asInstanceOf[js.Any]
      )

      BestTrainingJob.foreach(__v => __obj.updateDynamic("BestTrainingJob")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      HyperParameterTuningEndTime.foreach(__v => __obj.updateDynamic("HyperParameterTuningEndTime")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      OverallBestTrainingJob.foreach(__v => __obj.updateDynamic("OverallBestTrainingJob")(__v.asInstanceOf[js.Any]))
      TrainingJobDefinition.foreach(__v => __obj.updateDynamic("TrainingJobDefinition")(__v.asInstanceOf[js.Any]))
      TrainingJobDefinitions.foreach(__v => __obj.updateDynamic("TrainingJobDefinitions")(__v.asInstanceOf[js.Any]))
      WarmStartConfig.foreach(__v => __obj.updateDynamic("WarmStartConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeHyperParameterTuningJobResponse]
    }
  }

  @js.native
  trait DescribeImageRequest extends js.Object {
    var ImageName: ImageName
  }

  object DescribeImageRequest {
    @inline
    def apply(
        ImageName: ImageName
    ): DescribeImageRequest = {
      val __obj = js.Dynamic.literal(
        "ImageName" -> ImageName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeImageRequest]
    }
  }

  @js.native
  trait DescribeImageResponse extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[ImageDescription]
    var DisplayName: js.UndefOr[ImageDisplayName]
    var FailureReason: js.UndefOr[FailureReason]
    var ImageArn: js.UndefOr[ImageArn]
    var ImageName: js.UndefOr[ImageName]
    var ImageStatus: js.UndefOr[ImageStatus]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object DescribeImageResponse {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[ImageDescription] = js.undefined,
        DisplayName: js.UndefOr[ImageDisplayName] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        ImageArn: js.UndefOr[ImageArn] = js.undefined,
        ImageName: js.UndefOr[ImageName] = js.undefined,
        ImageStatus: js.UndefOr[ImageStatus] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined
    ): DescribeImageResponse = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      ImageArn.foreach(__v => __obj.updateDynamic("ImageArn")(__v.asInstanceOf[js.Any]))
      ImageName.foreach(__v => __obj.updateDynamic("ImageName")(__v.asInstanceOf[js.Any]))
      ImageStatus.foreach(__v => __obj.updateDynamic("ImageStatus")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeImageResponse]
    }
  }

  @js.native
  trait DescribeImageVersionRequest extends js.Object {
    var ImageName: ImageName
    var Version: js.UndefOr[ImageVersionNumber]
  }

  object DescribeImageVersionRequest {
    @inline
    def apply(
        ImageName: ImageName,
        Version: js.UndefOr[ImageVersionNumber] = js.undefined
    ): DescribeImageVersionRequest = {
      val __obj = js.Dynamic.literal(
        "ImageName" -> ImageName.asInstanceOf[js.Any]
      )

      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeImageVersionRequest]
    }
  }

  @js.native
  trait DescribeImageVersionResponse extends js.Object {
    var BaseImage: js.UndefOr[ImageBaseImage]
    var ContainerImage: js.UndefOr[ImageContainerImage]
    var CreationTime: js.UndefOr[Timestamp]
    var FailureReason: js.UndefOr[FailureReason]
    var ImageArn: js.UndefOr[ImageArn]
    var ImageVersionArn: js.UndefOr[ImageVersionArn]
    var ImageVersionStatus: js.UndefOr[ImageVersionStatus]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Version: js.UndefOr[ImageVersionNumber]
  }

  object DescribeImageVersionResponse {
    @inline
    def apply(
        BaseImage: js.UndefOr[ImageBaseImage] = js.undefined,
        ContainerImage: js.UndefOr[ImageContainerImage] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        ImageArn: js.UndefOr[ImageArn] = js.undefined,
        ImageVersionArn: js.UndefOr[ImageVersionArn] = js.undefined,
        ImageVersionStatus: js.UndefOr[ImageVersionStatus] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Version: js.UndefOr[ImageVersionNumber] = js.undefined
    ): DescribeImageVersionResponse = {
      val __obj = js.Dynamic.literal()
      BaseImage.foreach(__v => __obj.updateDynamic("BaseImage")(__v.asInstanceOf[js.Any]))
      ContainerImage.foreach(__v => __obj.updateDynamic("ContainerImage")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      ImageArn.foreach(__v => __obj.updateDynamic("ImageArn")(__v.asInstanceOf[js.Any]))
      ImageVersionArn.foreach(__v => __obj.updateDynamic("ImageVersionArn")(__v.asInstanceOf[js.Any]))
      ImageVersionStatus.foreach(__v => __obj.updateDynamic("ImageVersionStatus")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeImageVersionResponse]
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
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LabelAttributeName.foreach(__v => __obj.updateDynamic("LabelAttributeName")(__v.asInstanceOf[js.Any]))
      LabelCategoryConfigS3Uri.foreach(__v => __obj.updateDynamic("LabelCategoryConfigS3Uri")(__v.asInstanceOf[js.Any]))
      LabelingJobAlgorithmsConfig.foreach(__v => __obj.updateDynamic("LabelingJobAlgorithmsConfig")(__v.asInstanceOf[js.Any]))
      LabelingJobOutput.foreach(__v => __obj.updateDynamic("LabelingJobOutput")(__v.asInstanceOf[js.Any]))
      StoppingConditions.foreach(__v => __obj.updateDynamic("StoppingConditions")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLabelingJobResponse]
    }
  }

  @js.native
  trait DescribeModelBiasJobDefinitionRequest extends js.Object {
    var JobDefinitionName: MonitoringJobDefinitionName
  }

  object DescribeModelBiasJobDefinitionRequest {
    @inline
    def apply(
        JobDefinitionName: MonitoringJobDefinitionName
    ): DescribeModelBiasJobDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "JobDefinitionName" -> JobDefinitionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeModelBiasJobDefinitionRequest]
    }
  }

  @js.native
  trait DescribeModelBiasJobDefinitionResponse extends js.Object {
    var CreationTime: Timestamp
    var JobDefinitionArn: MonitoringJobDefinitionArn
    var JobDefinitionName: MonitoringJobDefinitionName
    var JobResources: MonitoringResources
    var ModelBiasAppSpecification: ModelBiasAppSpecification
    var ModelBiasJobInput: ModelBiasJobInput
    var ModelBiasJobOutputConfig: MonitoringOutputConfig
    var RoleArn: RoleArn
    var ModelBiasBaselineConfig: js.UndefOr[ModelBiasBaselineConfig]
    var NetworkConfig: js.UndefOr[MonitoringNetworkConfig]
    var StoppingCondition: js.UndefOr[MonitoringStoppingCondition]
  }

  object DescribeModelBiasJobDefinitionResponse {
    @inline
    def apply(
        CreationTime: Timestamp,
        JobDefinitionArn: MonitoringJobDefinitionArn,
        JobDefinitionName: MonitoringJobDefinitionName,
        JobResources: MonitoringResources,
        ModelBiasAppSpecification: ModelBiasAppSpecification,
        ModelBiasJobInput: ModelBiasJobInput,
        ModelBiasJobOutputConfig: MonitoringOutputConfig,
        RoleArn: RoleArn,
        ModelBiasBaselineConfig: js.UndefOr[ModelBiasBaselineConfig] = js.undefined,
        NetworkConfig: js.UndefOr[MonitoringNetworkConfig] = js.undefined,
        StoppingCondition: js.UndefOr[MonitoringStoppingCondition] = js.undefined
    ): DescribeModelBiasJobDefinitionResponse = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "JobDefinitionArn" -> JobDefinitionArn.asInstanceOf[js.Any],
        "JobDefinitionName" -> JobDefinitionName.asInstanceOf[js.Any],
        "JobResources" -> JobResources.asInstanceOf[js.Any],
        "ModelBiasAppSpecification" -> ModelBiasAppSpecification.asInstanceOf[js.Any],
        "ModelBiasJobInput" -> ModelBiasJobInput.asInstanceOf[js.Any],
        "ModelBiasJobOutputConfig" -> ModelBiasJobOutputConfig.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      ModelBiasBaselineConfig.foreach(__v => __obj.updateDynamic("ModelBiasBaselineConfig")(__v.asInstanceOf[js.Any]))
      NetworkConfig.foreach(__v => __obj.updateDynamic("NetworkConfig")(__v.asInstanceOf[js.Any]))
      StoppingCondition.foreach(__v => __obj.updateDynamic("StoppingCondition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeModelBiasJobDefinitionResponse]
    }
  }

  @js.native
  trait DescribeModelExplainabilityJobDefinitionRequest extends js.Object {
    var JobDefinitionName: MonitoringJobDefinitionName
  }

  object DescribeModelExplainabilityJobDefinitionRequest {
    @inline
    def apply(
        JobDefinitionName: MonitoringJobDefinitionName
    ): DescribeModelExplainabilityJobDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "JobDefinitionName" -> JobDefinitionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeModelExplainabilityJobDefinitionRequest]
    }
  }

  @js.native
  trait DescribeModelExplainabilityJobDefinitionResponse extends js.Object {
    var CreationTime: Timestamp
    var JobDefinitionArn: MonitoringJobDefinitionArn
    var JobDefinitionName: MonitoringJobDefinitionName
    var JobResources: MonitoringResources
    var ModelExplainabilityAppSpecification: ModelExplainabilityAppSpecification
    var ModelExplainabilityJobInput: ModelExplainabilityJobInput
    var ModelExplainabilityJobOutputConfig: MonitoringOutputConfig
    var RoleArn: RoleArn
    var ModelExplainabilityBaselineConfig: js.UndefOr[ModelExplainabilityBaselineConfig]
    var NetworkConfig: js.UndefOr[MonitoringNetworkConfig]
    var StoppingCondition: js.UndefOr[MonitoringStoppingCondition]
  }

  object DescribeModelExplainabilityJobDefinitionResponse {
    @inline
    def apply(
        CreationTime: Timestamp,
        JobDefinitionArn: MonitoringJobDefinitionArn,
        JobDefinitionName: MonitoringJobDefinitionName,
        JobResources: MonitoringResources,
        ModelExplainabilityAppSpecification: ModelExplainabilityAppSpecification,
        ModelExplainabilityJobInput: ModelExplainabilityJobInput,
        ModelExplainabilityJobOutputConfig: MonitoringOutputConfig,
        RoleArn: RoleArn,
        ModelExplainabilityBaselineConfig: js.UndefOr[ModelExplainabilityBaselineConfig] = js.undefined,
        NetworkConfig: js.UndefOr[MonitoringNetworkConfig] = js.undefined,
        StoppingCondition: js.UndefOr[MonitoringStoppingCondition] = js.undefined
    ): DescribeModelExplainabilityJobDefinitionResponse = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "JobDefinitionArn" -> JobDefinitionArn.asInstanceOf[js.Any],
        "JobDefinitionName" -> JobDefinitionName.asInstanceOf[js.Any],
        "JobResources" -> JobResources.asInstanceOf[js.Any],
        "ModelExplainabilityAppSpecification" -> ModelExplainabilityAppSpecification.asInstanceOf[js.Any],
        "ModelExplainabilityJobInput" -> ModelExplainabilityJobInput.asInstanceOf[js.Any],
        "ModelExplainabilityJobOutputConfig" -> ModelExplainabilityJobOutputConfig.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      ModelExplainabilityBaselineConfig.foreach(__v => __obj.updateDynamic("ModelExplainabilityBaselineConfig")(__v.asInstanceOf[js.Any]))
      NetworkConfig.foreach(__v => __obj.updateDynamic("NetworkConfig")(__v.asInstanceOf[js.Any]))
      StoppingCondition.foreach(__v => __obj.updateDynamic("StoppingCondition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeModelExplainabilityJobDefinitionResponse]
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
    var InferenceExecutionConfig: js.UndefOr[InferenceExecutionConfig]
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
        InferenceExecutionConfig: js.UndefOr[InferenceExecutionConfig] = js.undefined,
        PrimaryContainer: js.UndefOr[ContainerDefinition] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): DescribeModelOutput = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ExecutionRoleArn" -> ExecutionRoleArn.asInstanceOf[js.Any],
        "ModelArn" -> ModelArn.asInstanceOf[js.Any],
        "ModelName" -> ModelName.asInstanceOf[js.Any]
      )

      Containers.foreach(__v => __obj.updateDynamic("Containers")(__v.asInstanceOf[js.Any]))
      EnableNetworkIsolation.foreach(__v => __obj.updateDynamic("EnableNetworkIsolation")(__v.asInstanceOf[js.Any]))
      InferenceExecutionConfig.foreach(__v => __obj.updateDynamic("InferenceExecutionConfig")(__v.asInstanceOf[js.Any]))
      PrimaryContainer.foreach(__v => __obj.updateDynamic("PrimaryContainer")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeModelOutput]
    }
  }

  @js.native
  trait DescribeModelPackageGroupInput extends js.Object {
    var ModelPackageGroupName: ArnOrName
  }

  object DescribeModelPackageGroupInput {
    @inline
    def apply(
        ModelPackageGroupName: ArnOrName
    ): DescribeModelPackageGroupInput = {
      val __obj = js.Dynamic.literal(
        "ModelPackageGroupName" -> ModelPackageGroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeModelPackageGroupInput]
    }
  }

  @js.native
  trait DescribeModelPackageGroupOutput extends js.Object {
    var CreatedBy: UserContext
    var CreationTime: CreationTime
    var ModelPackageGroupArn: ModelPackageGroupArn
    var ModelPackageGroupName: EntityName
    var ModelPackageGroupStatus: ModelPackageGroupStatus
    var ModelPackageGroupDescription: js.UndefOr[EntityDescription]
  }

  object DescribeModelPackageGroupOutput {
    @inline
    def apply(
        CreatedBy: UserContext,
        CreationTime: CreationTime,
        ModelPackageGroupArn: ModelPackageGroupArn,
        ModelPackageGroupName: EntityName,
        ModelPackageGroupStatus: ModelPackageGroupStatus,
        ModelPackageGroupDescription: js.UndefOr[EntityDescription] = js.undefined
    ): DescribeModelPackageGroupOutput = {
      val __obj = js.Dynamic.literal(
        "CreatedBy" -> CreatedBy.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ModelPackageGroupArn" -> ModelPackageGroupArn.asInstanceOf[js.Any],
        "ModelPackageGroupName" -> ModelPackageGroupName.asInstanceOf[js.Any],
        "ModelPackageGroupStatus" -> ModelPackageGroupStatus.asInstanceOf[js.Any]
      )

      ModelPackageGroupDescription.foreach(__v => __obj.updateDynamic("ModelPackageGroupDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeModelPackageGroupOutput]
    }
  }

  @js.native
  trait DescribeModelPackageInput extends js.Object {
    var ModelPackageName: VersionedArnOrName
  }

  object DescribeModelPackageInput {
    @inline
    def apply(
        ModelPackageName: VersionedArnOrName
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
    var ApprovalDescription: js.UndefOr[ApprovalDescription]
    var CertifyForMarketplace: js.UndefOr[CertifyForMarketplace]
    var CreatedBy: js.UndefOr[UserContext]
    var InferenceSpecification: js.UndefOr[InferenceSpecification]
    var LastModifiedBy: js.UndefOr[UserContext]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var MetadataProperties: js.UndefOr[MetadataProperties]
    var ModelApprovalStatus: js.UndefOr[ModelApprovalStatus]
    var ModelMetrics: js.UndefOr[ModelMetrics]
    var ModelPackageDescription: js.UndefOr[EntityDescription]
    var ModelPackageGroupName: js.UndefOr[EntityName]
    var ModelPackageVersion: js.UndefOr[ModelPackageVersion]
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
        ApprovalDescription: js.UndefOr[ApprovalDescription] = js.undefined,
        CertifyForMarketplace: js.UndefOr[CertifyForMarketplace] = js.undefined,
        CreatedBy: js.UndefOr[UserContext] = js.undefined,
        InferenceSpecification: js.UndefOr[InferenceSpecification] = js.undefined,
        LastModifiedBy: js.UndefOr[UserContext] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        MetadataProperties: js.UndefOr[MetadataProperties] = js.undefined,
        ModelApprovalStatus: js.UndefOr[ModelApprovalStatus] = js.undefined,
        ModelMetrics: js.UndefOr[ModelMetrics] = js.undefined,
        ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined,
        ModelPackageGroupName: js.UndefOr[EntityName] = js.undefined,
        ModelPackageVersion: js.UndefOr[ModelPackageVersion] = js.undefined,
        SourceAlgorithmSpecification: js.UndefOr[SourceAlgorithmSpecification] = js.undefined,
        ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification] = js.undefined
    ): DescribeModelPackageOutput = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ModelPackageArn" -> ModelPackageArn.asInstanceOf[js.Any],
        "ModelPackageName" -> ModelPackageName.asInstanceOf[js.Any],
        "ModelPackageStatus" -> ModelPackageStatus.asInstanceOf[js.Any],
        "ModelPackageStatusDetails" -> ModelPackageStatusDetails.asInstanceOf[js.Any]
      )

      ApprovalDescription.foreach(__v => __obj.updateDynamic("ApprovalDescription")(__v.asInstanceOf[js.Any]))
      CertifyForMarketplace.foreach(__v => __obj.updateDynamic("CertifyForMarketplace")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      InferenceSpecification.foreach(__v => __obj.updateDynamic("InferenceSpecification")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      MetadataProperties.foreach(__v => __obj.updateDynamic("MetadataProperties")(__v.asInstanceOf[js.Any]))
      ModelApprovalStatus.foreach(__v => __obj.updateDynamic("ModelApprovalStatus")(__v.asInstanceOf[js.Any]))
      ModelMetrics.foreach(__v => __obj.updateDynamic("ModelMetrics")(__v.asInstanceOf[js.Any]))
      ModelPackageDescription.foreach(__v => __obj.updateDynamic("ModelPackageDescription")(__v.asInstanceOf[js.Any]))
      ModelPackageGroupName.foreach(__v => __obj.updateDynamic("ModelPackageGroupName")(__v.asInstanceOf[js.Any]))
      ModelPackageVersion.foreach(__v => __obj.updateDynamic("ModelPackageVersion")(__v.asInstanceOf[js.Any]))
      SourceAlgorithmSpecification.foreach(__v => __obj.updateDynamic("SourceAlgorithmSpecification")(__v.asInstanceOf[js.Any]))
      ValidationSpecification.foreach(__v => __obj.updateDynamic("ValidationSpecification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeModelPackageOutput]
    }
  }

  @js.native
  trait DescribeModelQualityJobDefinitionRequest extends js.Object {
    var JobDefinitionName: MonitoringJobDefinitionName
  }

  object DescribeModelQualityJobDefinitionRequest {
    @inline
    def apply(
        JobDefinitionName: MonitoringJobDefinitionName
    ): DescribeModelQualityJobDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "JobDefinitionName" -> JobDefinitionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeModelQualityJobDefinitionRequest]
    }
  }

  @js.native
  trait DescribeModelQualityJobDefinitionResponse extends js.Object {
    var CreationTime: Timestamp
    var JobDefinitionArn: MonitoringJobDefinitionArn
    var JobDefinitionName: MonitoringJobDefinitionName
    var JobResources: MonitoringResources
    var ModelQualityAppSpecification: ModelQualityAppSpecification
    var ModelQualityJobInput: ModelQualityJobInput
    var ModelQualityJobOutputConfig: MonitoringOutputConfig
    var RoleArn: RoleArn
    var ModelQualityBaselineConfig: js.UndefOr[ModelQualityBaselineConfig]
    var NetworkConfig: js.UndefOr[MonitoringNetworkConfig]
    var StoppingCondition: js.UndefOr[MonitoringStoppingCondition]
  }

  object DescribeModelQualityJobDefinitionResponse {
    @inline
    def apply(
        CreationTime: Timestamp,
        JobDefinitionArn: MonitoringJobDefinitionArn,
        JobDefinitionName: MonitoringJobDefinitionName,
        JobResources: MonitoringResources,
        ModelQualityAppSpecification: ModelQualityAppSpecification,
        ModelQualityJobInput: ModelQualityJobInput,
        ModelQualityJobOutputConfig: MonitoringOutputConfig,
        RoleArn: RoleArn,
        ModelQualityBaselineConfig: js.UndefOr[ModelQualityBaselineConfig] = js.undefined,
        NetworkConfig: js.UndefOr[MonitoringNetworkConfig] = js.undefined,
        StoppingCondition: js.UndefOr[MonitoringStoppingCondition] = js.undefined
    ): DescribeModelQualityJobDefinitionResponse = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "JobDefinitionArn" -> JobDefinitionArn.asInstanceOf[js.Any],
        "JobDefinitionName" -> JobDefinitionName.asInstanceOf[js.Any],
        "JobResources" -> JobResources.asInstanceOf[js.Any],
        "ModelQualityAppSpecification" -> ModelQualityAppSpecification.asInstanceOf[js.Any],
        "ModelQualityJobInput" -> ModelQualityJobInput.asInstanceOf[js.Any],
        "ModelQualityJobOutputConfig" -> ModelQualityJobOutputConfig.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      ModelQualityBaselineConfig.foreach(__v => __obj.updateDynamic("ModelQualityBaselineConfig")(__v.asInstanceOf[js.Any]))
      NetworkConfig.foreach(__v => __obj.updateDynamic("NetworkConfig")(__v.asInstanceOf[js.Any]))
      StoppingCondition.foreach(__v => __obj.updateDynamic("StoppingCondition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeModelQualityJobDefinitionResponse]
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
    var MonitoringType: js.UndefOr[MonitoringType]
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
        LastMonitoringExecutionSummary: js.UndefOr[MonitoringExecutionSummary] = js.undefined,
        MonitoringType: js.UndefOr[MonitoringType] = js.undefined
    ): DescribeMonitoringScheduleResponse = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "MonitoringScheduleArn" -> MonitoringScheduleArn.asInstanceOf[js.Any],
        "MonitoringScheduleConfig" -> MonitoringScheduleConfig.asInstanceOf[js.Any],
        "MonitoringScheduleName" -> MonitoringScheduleName.asInstanceOf[js.Any],
        "MonitoringScheduleStatus" -> MonitoringScheduleStatus.asInstanceOf[js.Any]
      )

      EndpointName.foreach(__v => __obj.updateDynamic("EndpointName")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LastMonitoringExecutionSummary.foreach(__v => __obj.updateDynamic("LastMonitoringExecutionSummary")(__v.asInstanceOf[js.Any]))
      MonitoringType.foreach(__v => __obj.updateDynamic("MonitoringType")(__v.asInstanceOf[js.Any]))
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
      NotebookInstanceLifecycleConfigArn.foreach(__v => __obj.updateDynamic("NotebookInstanceLifecycleConfigArn")(__v.asInstanceOf[js.Any]))
      NotebookInstanceLifecycleConfigName.foreach(__v => __obj.updateDynamic("NotebookInstanceLifecycleConfigName")(__v.asInstanceOf[js.Any]))
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
      AdditionalCodeRepositories.foreach(__v => __obj.updateDynamic("AdditionalCodeRepositories")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DefaultCodeRepository.foreach(__v => __obj.updateDynamic("DefaultCodeRepository")(__v.asInstanceOf[js.Any]))
      DirectInternetAccess.foreach(__v => __obj.updateDynamic("DirectInternetAccess")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      NetworkInterfaceId.foreach(__v => __obj.updateDynamic("NetworkInterfaceId")(__v.asInstanceOf[js.Any]))
      NotebookInstanceArn.foreach(__v => __obj.updateDynamic("NotebookInstanceArn")(__v.asInstanceOf[js.Any]))
      NotebookInstanceLifecycleConfigName.foreach(__v => __obj.updateDynamic("NotebookInstanceLifecycleConfigName")(__v.asInstanceOf[js.Any]))
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
  trait DescribePipelineDefinitionForExecutionRequest extends js.Object {
    var PipelineExecutionArn: PipelineExecutionArn
  }

  object DescribePipelineDefinitionForExecutionRequest {
    @inline
    def apply(
        PipelineExecutionArn: PipelineExecutionArn
    ): DescribePipelineDefinitionForExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "PipelineExecutionArn" -> PipelineExecutionArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribePipelineDefinitionForExecutionRequest]
    }
  }

  @js.native
  trait DescribePipelineDefinitionForExecutionResponse extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var PipelineDefinition: js.UndefOr[PipelineDefinition]
  }

  object DescribePipelineDefinitionForExecutionResponse {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        PipelineDefinition: js.UndefOr[PipelineDefinition] = js.undefined
    ): DescribePipelineDefinitionForExecutionResponse = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      PipelineDefinition.foreach(__v => __obj.updateDynamic("PipelineDefinition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePipelineDefinitionForExecutionResponse]
    }
  }

  @js.native
  trait DescribePipelineExecutionRequest extends js.Object {
    var PipelineExecutionArn: PipelineExecutionArn
  }

  object DescribePipelineExecutionRequest {
    @inline
    def apply(
        PipelineExecutionArn: PipelineExecutionArn
    ): DescribePipelineExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "PipelineExecutionArn" -> PipelineExecutionArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribePipelineExecutionRequest]
    }
  }

  @js.native
  trait DescribePipelineExecutionResponse extends js.Object {
    var CreatedBy: js.UndefOr[UserContext]
    var CreationTime: js.UndefOr[Timestamp]
    var LastModifiedBy: js.UndefOr[UserContext]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var PipelineArn: js.UndefOr[PipelineArn]
    var PipelineExecutionArn: js.UndefOr[PipelineExecutionArn]
    var PipelineExecutionDescription: js.UndefOr[PipelineExecutionDescription]
    var PipelineExecutionDisplayName: js.UndefOr[PipelineExecutionName]
    var PipelineExecutionStatus: js.UndefOr[PipelineExecutionStatus]
  }

  object DescribePipelineExecutionResponse {
    @inline
    def apply(
        CreatedBy: js.UndefOr[UserContext] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedBy: js.UndefOr[UserContext] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        PipelineArn: js.UndefOr[PipelineArn] = js.undefined,
        PipelineExecutionArn: js.UndefOr[PipelineExecutionArn] = js.undefined,
        PipelineExecutionDescription: js.UndefOr[PipelineExecutionDescription] = js.undefined,
        PipelineExecutionDisplayName: js.UndefOr[PipelineExecutionName] = js.undefined,
        PipelineExecutionStatus: js.UndefOr[PipelineExecutionStatus] = js.undefined
    ): DescribePipelineExecutionResponse = {
      val __obj = js.Dynamic.literal()
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      PipelineArn.foreach(__v => __obj.updateDynamic("PipelineArn")(__v.asInstanceOf[js.Any]))
      PipelineExecutionArn.foreach(__v => __obj.updateDynamic("PipelineExecutionArn")(__v.asInstanceOf[js.Any]))
      PipelineExecutionDescription.foreach(__v => __obj.updateDynamic("PipelineExecutionDescription")(__v.asInstanceOf[js.Any]))
      PipelineExecutionDisplayName.foreach(__v => __obj.updateDynamic("PipelineExecutionDisplayName")(__v.asInstanceOf[js.Any]))
      PipelineExecutionStatus.foreach(__v => __obj.updateDynamic("PipelineExecutionStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePipelineExecutionResponse]
    }
  }

  @js.native
  trait DescribePipelineRequest extends js.Object {
    var PipelineName: PipelineName
  }

  object DescribePipelineRequest {
    @inline
    def apply(
        PipelineName: PipelineName
    ): DescribePipelineRequest = {
      val __obj = js.Dynamic.literal(
        "PipelineName" -> PipelineName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribePipelineRequest]
    }
  }

  @js.native
  trait DescribePipelineResponse extends js.Object {
    var CreatedBy: js.UndefOr[UserContext]
    var CreationTime: js.UndefOr[Timestamp]
    var LastModifiedBy: js.UndefOr[UserContext]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var LastRunTime: js.UndefOr[Timestamp]
    var PipelineArn: js.UndefOr[PipelineArn]
    var PipelineDefinition: js.UndefOr[PipelineDefinition]
    var PipelineDescription: js.UndefOr[PipelineDescription]
    var PipelineDisplayName: js.UndefOr[PipelineName]
    var PipelineName: js.UndefOr[PipelineName]
    var PipelineStatus: js.UndefOr[PipelineStatus]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object DescribePipelineResponse {
    @inline
    def apply(
        CreatedBy: js.UndefOr[UserContext] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedBy: js.UndefOr[UserContext] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        LastRunTime: js.UndefOr[Timestamp] = js.undefined,
        PipelineArn: js.UndefOr[PipelineArn] = js.undefined,
        PipelineDefinition: js.UndefOr[PipelineDefinition] = js.undefined,
        PipelineDescription: js.UndefOr[PipelineDescription] = js.undefined,
        PipelineDisplayName: js.UndefOr[PipelineName] = js.undefined,
        PipelineName: js.UndefOr[PipelineName] = js.undefined,
        PipelineStatus: js.UndefOr[PipelineStatus] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined
    ): DescribePipelineResponse = {
      val __obj = js.Dynamic.literal()
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      LastRunTime.foreach(__v => __obj.updateDynamic("LastRunTime")(__v.asInstanceOf[js.Any]))
      PipelineArn.foreach(__v => __obj.updateDynamic("PipelineArn")(__v.asInstanceOf[js.Any]))
      PipelineDefinition.foreach(__v => __obj.updateDynamic("PipelineDefinition")(__v.asInstanceOf[js.Any]))
      PipelineDescription.foreach(__v => __obj.updateDynamic("PipelineDescription")(__v.asInstanceOf[js.Any]))
      PipelineDisplayName.foreach(__v => __obj.updateDynamic("PipelineDisplayName")(__v.asInstanceOf[js.Any]))
      PipelineName.foreach(__v => __obj.updateDynamic("PipelineName")(__v.asInstanceOf[js.Any]))
      PipelineStatus.foreach(__v => __obj.updateDynamic("PipelineStatus")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePipelineResponse]
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
        "AppSpecification" -> AppSpecification.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ProcessingJobArn" -> ProcessingJobArn.asInstanceOf[js.Any],
        "ProcessingJobName" -> ProcessingJobName.asInstanceOf[js.Any],
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
  trait DescribeProjectInput extends js.Object {
    var ProjectName: ProjectEntityName
  }

  object DescribeProjectInput {
    @inline
    def apply(
        ProjectName: ProjectEntityName
    ): DescribeProjectInput = {
      val __obj = js.Dynamic.literal(
        "ProjectName" -> ProjectName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeProjectInput]
    }
  }

  @js.native
  trait DescribeProjectOutput extends js.Object {
    var CreationTime: Timestamp
    var ProjectArn: ProjectArn
    var ProjectId: ProjectId
    var ProjectName: ProjectEntityName
    var ProjectStatus: ProjectStatus
    var ServiceCatalogProvisioningDetails: ServiceCatalogProvisioningDetails
    var CreatedBy: js.UndefOr[UserContext]
    var ProjectDescription: js.UndefOr[EntityDescription]
    var ServiceCatalogProvisionedProductDetails: js.UndefOr[ServiceCatalogProvisionedProductDetails]
  }

  object DescribeProjectOutput {
    @inline
    def apply(
        CreationTime: Timestamp,
        ProjectArn: ProjectArn,
        ProjectId: ProjectId,
        ProjectName: ProjectEntityName,
        ProjectStatus: ProjectStatus,
        ServiceCatalogProvisioningDetails: ServiceCatalogProvisioningDetails,
        CreatedBy: js.UndefOr[UserContext] = js.undefined,
        ProjectDescription: js.UndefOr[EntityDescription] = js.undefined,
        ServiceCatalogProvisionedProductDetails: js.UndefOr[ServiceCatalogProvisionedProductDetails] = js.undefined
    ): DescribeProjectOutput = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ProjectArn" -> ProjectArn.asInstanceOf[js.Any],
        "ProjectId" -> ProjectId.asInstanceOf[js.Any],
        "ProjectName" -> ProjectName.asInstanceOf[js.Any],
        "ProjectStatus" -> ProjectStatus.asInstanceOf[js.Any],
        "ServiceCatalogProvisioningDetails" -> ServiceCatalogProvisioningDetails.asInstanceOf[js.Any]
      )

      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      ProjectDescription.foreach(__v => __obj.updateDynamic("ProjectDescription")(__v.asInstanceOf[js.Any]))
      ServiceCatalogProvisionedProductDetails.foreach(__v => __obj.updateDynamic("ServiceCatalogProvisionedProductDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProjectOutput]
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
    var Environment: js.UndefOr[TrainingEnvironmentMap]
    var ExperimentConfig: js.UndefOr[ExperimentConfig]
    var FailureReason: js.UndefOr[FailureReason]
    var FinalMetricDataList: js.UndefOr[FinalMetricDataList]
    var HyperParameters: js.UndefOr[HyperParameters]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var LabelingJobArn: js.UndefOr[LabelingJobArn]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var ProfilerConfig: js.UndefOr[ProfilerConfig]
    var ProfilerRuleConfigurations: js.UndefOr[ProfilerRuleConfigurations]
    var ProfilerRuleEvaluationStatuses: js.UndefOr[ProfilerRuleEvaluationStatuses]
    var ProfilingStatus: js.UndefOr[ProfilingStatus]
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
        Environment: js.UndefOr[TrainingEnvironmentMap] = js.undefined,
        ExperimentConfig: js.UndefOr[ExperimentConfig] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        FinalMetricDataList: js.UndefOr[FinalMetricDataList] = js.undefined,
        HyperParameters: js.UndefOr[HyperParameters] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        LabelingJobArn: js.UndefOr[LabelingJobArn] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
        ProfilerConfig: js.UndefOr[ProfilerConfig] = js.undefined,
        ProfilerRuleConfigurations: js.UndefOr[ProfilerRuleConfigurations] = js.undefined,
        ProfilerRuleEvaluationStatuses: js.UndefOr[ProfilerRuleEvaluationStatuses] = js.undefined,
        ProfilingStatus: js.UndefOr[ProfilingStatus] = js.undefined,
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
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ModelArtifacts" -> ModelArtifacts.asInstanceOf[js.Any],
        "ResourceConfig" -> ResourceConfig.asInstanceOf[js.Any],
        "SecondaryStatus" -> SecondaryStatus.asInstanceOf[js.Any],
        "StoppingCondition" -> StoppingCondition.asInstanceOf[js.Any],
        "TrainingJobArn" -> TrainingJobArn.asInstanceOf[js.Any],
        "TrainingJobName" -> TrainingJobName.asInstanceOf[js.Any],
        "TrainingJobStatus" -> TrainingJobStatus.asInstanceOf[js.Any]
      )

      AutoMLJobArn.foreach(__v => __obj.updateDynamic("AutoMLJobArn")(__v.asInstanceOf[js.Any]))
      BillableTimeInSeconds.foreach(__v => __obj.updateDynamic("BillableTimeInSeconds")(__v.asInstanceOf[js.Any]))
      CheckpointConfig.foreach(__v => __obj.updateDynamic("CheckpointConfig")(__v.asInstanceOf[js.Any]))
      DebugHookConfig.foreach(__v => __obj.updateDynamic("DebugHookConfig")(__v.asInstanceOf[js.Any]))
      DebugRuleConfigurations.foreach(__v => __obj.updateDynamic("DebugRuleConfigurations")(__v.asInstanceOf[js.Any]))
      DebugRuleEvaluationStatuses.foreach(__v => __obj.updateDynamic("DebugRuleEvaluationStatuses")(__v.asInstanceOf[js.Any]))
      EnableInterContainerTrafficEncryption.foreach(__v => __obj.updateDynamic("EnableInterContainerTrafficEncryption")(__v.asInstanceOf[js.Any]))
      EnableManagedSpotTraining.foreach(__v => __obj.updateDynamic("EnableManagedSpotTraining")(__v.asInstanceOf[js.Any]))
      EnableNetworkIsolation.foreach(__v => __obj.updateDynamic("EnableNetworkIsolation")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      ExperimentConfig.foreach(__v => __obj.updateDynamic("ExperimentConfig")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      FinalMetricDataList.foreach(__v => __obj.updateDynamic("FinalMetricDataList")(__v.asInstanceOf[js.Any]))
      HyperParameters.foreach(__v => __obj.updateDynamic("HyperParameters")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      LabelingJobArn.foreach(__v => __obj.updateDynamic("LabelingJobArn")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.updateDynamic("OutputDataConfig")(__v.asInstanceOf[js.Any]))
      ProfilerConfig.foreach(__v => __obj.updateDynamic("ProfilerConfig")(__v.asInstanceOf[js.Any]))
      ProfilerRuleConfigurations.foreach(__v => __obj.updateDynamic("ProfilerRuleConfigurations")(__v.asInstanceOf[js.Any]))
      ProfilerRuleEvaluationStatuses.foreach(__v => __obj.updateDynamic("ProfilerRuleEvaluationStatuses")(__v.asInstanceOf[js.Any]))
      ProfilingStatus.foreach(__v => __obj.updateDynamic("ProfilingStatus")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      SecondaryStatusTransitions.foreach(__v => __obj.updateDynamic("SecondaryStatusTransitions")(__v.asInstanceOf[js.Any]))
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
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ModelName" -> ModelName.asInstanceOf[js.Any],
        "TransformInput" -> TransformInput.asInstanceOf[js.Any],
        "TransformJobArn" -> TransformJobArn.asInstanceOf[js.Any],
        "TransformJobName" -> TransformJobName.asInstanceOf[js.Any],
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
    var MetadataProperties: js.UndefOr[MetadataProperties]
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
        MetadataProperties: js.UndefOr[MetadataProperties] = js.undefined,
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
      MetadataProperties.foreach(__v => __obj.updateDynamic("MetadataProperties")(__v.asInstanceOf[js.Any]))
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
    var MetadataProperties: js.UndefOr[MetadataProperties]
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
        MetadataProperties: js.UndefOr[MetadataProperties] = js.undefined,
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
      MetadataProperties.foreach(__v => __obj.updateDynamic("MetadataProperties")(__v.asInstanceOf[js.Any]))
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
        "DomainId" -> DomainId.asInstanceOf[js.Any],
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
      SingleSignOnUserIdentifier.foreach(__v => __obj.updateDynamic("SingleSignOnUserIdentifier")(__v.asInstanceOf[js.Any]))
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

  /** Specifies weight and capacity values for a production variant.
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

  /** Information of a particular device.
    */
  @js.native
  trait Device extends js.Object {
    var DeviceName: DeviceName
    var Description: js.UndefOr[DeviceDescription]
    var IotThingName: js.UndefOr[ThingName]
  }

  object Device {
    @inline
    def apply(
        DeviceName: DeviceName,
        Description: js.UndefOr[DeviceDescription] = js.undefined,
        IotThingName: js.UndefOr[ThingName] = js.undefined
    ): Device = {
      val __obj = js.Dynamic.literal(
        "DeviceName" -> DeviceName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IotThingName.foreach(__v => __obj.updateDynamic("IotThingName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Device]
    }
  }

  /** Summary of the device fleet.
    */
  @js.native
  trait DeviceFleetSummary extends js.Object {
    var DeviceFleetArn: DeviceFleetArn
    var DeviceFleetName: EntityName
    var CreationTime: js.UndefOr[Timestamp]
    var LastModifiedTime: js.UndefOr[Timestamp]
  }

  object DeviceFleetSummary {
    @inline
    def apply(
        DeviceFleetArn: DeviceFleetArn,
        DeviceFleetName: EntityName,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
    ): DeviceFleetSummary = {
      val __obj = js.Dynamic.literal(
        "DeviceFleetArn" -> DeviceFleetArn.asInstanceOf[js.Any],
        "DeviceFleetName" -> DeviceFleetName.asInstanceOf[js.Any]
      )

      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceFleetSummary]
    }
  }

  /** Status of devices.
    */
  @js.native
  trait DeviceStats extends js.Object {
    var ConnectedDeviceCount: Double
    var RegisteredDeviceCount: Double
  }

  object DeviceStats {
    @inline
    def apply(
        ConnectedDeviceCount: Double,
        RegisteredDeviceCount: Double
    ): DeviceStats = {
      val __obj = js.Dynamic.literal(
        "ConnectedDeviceCount" -> ConnectedDeviceCount.asInstanceOf[js.Any],
        "RegisteredDeviceCount" -> RegisteredDeviceCount.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeviceStats]
    }
  }

  /** Summary of the device.
    */
  @js.native
  trait DeviceSummary extends js.Object {
    var DeviceArn: DeviceArn
    var DeviceName: EntityName
    var Description: js.UndefOr[DeviceDescription]
    var DeviceFleetName: js.UndefOr[EntityName]
    var IotThingName: js.UndefOr[ThingName]
    var LatestHeartbeat: js.UndefOr[Timestamp]
    var Models: js.UndefOr[EdgeModelSummaries]
    var RegistrationTime: js.UndefOr[Timestamp]
  }

  object DeviceSummary {
    @inline
    def apply(
        DeviceArn: DeviceArn,
        DeviceName: EntityName,
        Description: js.UndefOr[DeviceDescription] = js.undefined,
        DeviceFleetName: js.UndefOr[EntityName] = js.undefined,
        IotThingName: js.UndefOr[ThingName] = js.undefined,
        LatestHeartbeat: js.UndefOr[Timestamp] = js.undefined,
        Models: js.UndefOr[EdgeModelSummaries] = js.undefined,
        RegistrationTime: js.UndefOr[Timestamp] = js.undefined
    ): DeviceSummary = {
      val __obj = js.Dynamic.literal(
        "DeviceArn" -> DeviceArn.asInstanceOf[js.Any],
        "DeviceName" -> DeviceName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DeviceFleetName.foreach(__v => __obj.updateDynamic("DeviceFleetName")(__v.asInstanceOf[js.Any]))
      IotThingName.foreach(__v => __obj.updateDynamic("IotThingName")(__v.asInstanceOf[js.Any]))
      LatestHeartbeat.foreach(__v => __obj.updateDynamic("LatestHeartbeat")(__v.asInstanceOf[js.Any]))
      Models.foreach(__v => __obj.updateDynamic("Models")(__v.asInstanceOf[js.Any]))
      RegistrationTime.foreach(__v => __obj.updateDynamic("RegistrationTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceSummary]
    }
  }

  @js.native
  trait DisableSagemakerServicecatalogPortfolioInput extends js.Object

  object DisableSagemakerServicecatalogPortfolioInput {
    @inline
    def apply(): DisableSagemakerServicecatalogPortfolioInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisableSagemakerServicecatalogPortfolioInput]
    }
  }

  @js.native
  trait DisableSagemakerServicecatalogPortfolioOutput extends js.Object

  object DisableSagemakerServicecatalogPortfolioOutput {
    @inline
    def apply(): DisableSagemakerServicecatalogPortfolioOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisableSagemakerServicecatalogPortfolioOutput]
    }
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
        "TrialName" -> TrialName.asInstanceOf[js.Any]
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

  /** The domain's details.
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

  /** The model on the edge device.
    */
  @js.native
  trait EdgeModel extends js.Object {
    var ModelName: EntityName
    var ModelVersion: EdgeVersion
    var LatestInference: js.UndefOr[Timestamp]
    var LatestSampleTime: js.UndefOr[Timestamp]
  }

  object EdgeModel {
    @inline
    def apply(
        ModelName: EntityName,
        ModelVersion: EdgeVersion,
        LatestInference: js.UndefOr[Timestamp] = js.undefined,
        LatestSampleTime: js.UndefOr[Timestamp] = js.undefined
    ): EdgeModel = {
      val __obj = js.Dynamic.literal(
        "ModelName" -> ModelName.asInstanceOf[js.Any],
        "ModelVersion" -> ModelVersion.asInstanceOf[js.Any]
      )

      LatestInference.foreach(__v => __obj.updateDynamic("LatestInference")(__v.asInstanceOf[js.Any]))
      LatestSampleTime.foreach(__v => __obj.updateDynamic("LatestSampleTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EdgeModel]
    }
  }

  /** Status of edge devices with this model.
    */
  @js.native
  trait EdgeModelStat extends js.Object {
    var ActiveDeviceCount: Double
    var ConnectedDeviceCount: Double
    var ModelName: EntityName
    var ModelVersion: EdgeVersion
    var OfflineDeviceCount: Double
    var SamplingDeviceCount: Double
  }

  object EdgeModelStat {
    @inline
    def apply(
        ActiveDeviceCount: Double,
        ConnectedDeviceCount: Double,
        ModelName: EntityName,
        ModelVersion: EdgeVersion,
        OfflineDeviceCount: Double,
        SamplingDeviceCount: Double
    ): EdgeModelStat = {
      val __obj = js.Dynamic.literal(
        "ActiveDeviceCount" -> ActiveDeviceCount.asInstanceOf[js.Any],
        "ConnectedDeviceCount" -> ConnectedDeviceCount.asInstanceOf[js.Any],
        "ModelName" -> ModelName.asInstanceOf[js.Any],
        "ModelVersion" -> ModelVersion.asInstanceOf[js.Any],
        "OfflineDeviceCount" -> OfflineDeviceCount.asInstanceOf[js.Any],
        "SamplingDeviceCount" -> SamplingDeviceCount.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EdgeModelStat]
    }
  }

  /** Summary of model on edge device.
    */
  @js.native
  trait EdgeModelSummary extends js.Object {
    var ModelName: EntityName
    var ModelVersion: EdgeVersion
  }

  object EdgeModelSummary {
    @inline
    def apply(
        ModelName: EntityName,
        ModelVersion: EdgeVersion
    ): EdgeModelSummary = {
      val __obj = js.Dynamic.literal(
        "ModelName" -> ModelName.asInstanceOf[js.Any],
        "ModelVersion" -> ModelVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EdgeModelSummary]
    }
  }

  /** The output configuration.
    */
  @js.native
  trait EdgeOutputConfig extends js.Object {
    var S3OutputLocation: S3Uri
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object EdgeOutputConfig {
    @inline
    def apply(
        S3OutputLocation: S3Uri,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): EdgeOutputConfig = {
      val __obj = js.Dynamic.literal(
        "S3OutputLocation" -> S3OutputLocation.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EdgeOutputConfig]
    }
  }

  /** Summary of edge packaging job.
    */
  @js.native
  trait EdgePackagingJobSummary extends js.Object {
    var EdgePackagingJobArn: EdgePackagingJobArn
    var EdgePackagingJobName: EntityName
    var EdgePackagingJobStatus: EdgePackagingJobStatus
    var CompilationJobName: js.UndefOr[EntityName]
    var CreationTime: js.UndefOr[Timestamp]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var ModelName: js.UndefOr[EntityName]
    var ModelVersion: js.UndefOr[EdgeVersion]
  }

  object EdgePackagingJobSummary {
    @inline
    def apply(
        EdgePackagingJobArn: EdgePackagingJobArn,
        EdgePackagingJobName: EntityName,
        EdgePackagingJobStatus: EdgePackagingJobStatus,
        CompilationJobName: js.UndefOr[EntityName] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        ModelName: js.UndefOr[EntityName] = js.undefined,
        ModelVersion: js.UndefOr[EdgeVersion] = js.undefined
    ): EdgePackagingJobSummary = {
      val __obj = js.Dynamic.literal(
        "EdgePackagingJobArn" -> EdgePackagingJobArn.asInstanceOf[js.Any],
        "EdgePackagingJobName" -> EdgePackagingJobName.asInstanceOf[js.Any],
        "EdgePackagingJobStatus" -> EdgePackagingJobStatus.asInstanceOf[js.Any]
      )

      CompilationJobName.foreach(__v => __obj.updateDynamic("CompilationJobName")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      ModelName.foreach(__v => __obj.updateDynamic("ModelName")(__v.asInstanceOf[js.Any]))
      ModelVersion.foreach(__v => __obj.updateDynamic("ModelVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EdgePackagingJobSummary]
    }
  }

  @js.native
  trait EnableSagemakerServicecatalogPortfolioInput extends js.Object

  object EnableSagemakerServicecatalogPortfolioInput {
    @inline
    def apply(): EnableSagemakerServicecatalogPortfolioInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnableSagemakerServicecatalogPortfolioInput]
    }
  }

  @js.native
  trait EnableSagemakerServicecatalogPortfolioOutput extends js.Object

  object EnableSagemakerServicecatalogPortfolioOutput {
    @inline
    def apply(): EnableSagemakerServicecatalogPortfolioOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnableSagemakerServicecatalogPortfolioOutput]
    }
  }

  /** A hosted endpoint for real-time inference.
    */
  @js.native
  trait Endpoint extends js.Object {
    var CreationTime: Timestamp
    var EndpointArn: EndpointArn
    var EndpointConfigName: EndpointConfigName
    var EndpointName: EndpointName
    var EndpointStatus: EndpointStatus
    var LastModifiedTime: Timestamp
    var DataCaptureConfig: js.UndefOr[DataCaptureConfigSummary]
    var FailureReason: js.UndefOr[FailureReason]
    var MonitoringSchedules: js.UndefOr[MonitoringScheduleList]
    var ProductionVariants: js.UndefOr[ProductionVariantSummaryList]
    var Tags: js.UndefOr[TagList]
  }

  object Endpoint {
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
        MonitoringSchedules: js.UndefOr[MonitoringScheduleList] = js.undefined,
        ProductionVariants: js.UndefOr[ProductionVariantSummaryList] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): Endpoint = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any],
        "EndpointConfigName" -> EndpointConfigName.asInstanceOf[js.Any],
        "EndpointName" -> EndpointName.asInstanceOf[js.Any],
        "EndpointStatus" -> EndpointStatus.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any]
      )

      DataCaptureConfig.foreach(__v => __obj.updateDynamic("DataCaptureConfig")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      MonitoringSchedules.foreach(__v => __obj.updateDynamic("MonitoringSchedules")(__v.asInstanceOf[js.Any]))
      ProductionVariants.foreach(__v => __obj.updateDynamic("ProductionVariants")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Endpoint]
    }
  }

  /** Provides summary information for an endpoint configuration.
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
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "EndpointConfigArn" -> EndpointConfigArn.asInstanceOf[js.Any],
        "EndpointConfigName" -> EndpointConfigName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EndpointConfigSummary]
    }
  }

  /** Input object for the endpoint
    */
  @js.native
  trait EndpointInput extends js.Object {
    var EndpointName: EndpointName
    var LocalPath: ProcessingLocalPath
    var EndTimeOffset: js.UndefOr[MonitoringTimeOffsetString]
    var FeaturesAttribute: js.UndefOr[String]
    var InferenceAttribute: js.UndefOr[String]
    var ProbabilityAttribute: js.UndefOr[String]
    var ProbabilityThresholdAttribute: js.UndefOr[ProbabilityThresholdAttribute]
    var S3DataDistributionType: js.UndefOr[ProcessingS3DataDistributionType]
    var S3InputMode: js.UndefOr[ProcessingS3InputMode]
    var StartTimeOffset: js.UndefOr[MonitoringTimeOffsetString]
  }

  object EndpointInput {
    @inline
    def apply(
        EndpointName: EndpointName,
        LocalPath: ProcessingLocalPath,
        EndTimeOffset: js.UndefOr[MonitoringTimeOffsetString] = js.undefined,
        FeaturesAttribute: js.UndefOr[String] = js.undefined,
        InferenceAttribute: js.UndefOr[String] = js.undefined,
        ProbabilityAttribute: js.UndefOr[String] = js.undefined,
        ProbabilityThresholdAttribute: js.UndefOr[ProbabilityThresholdAttribute] = js.undefined,
        S3DataDistributionType: js.UndefOr[ProcessingS3DataDistributionType] = js.undefined,
        S3InputMode: js.UndefOr[ProcessingS3InputMode] = js.undefined,
        StartTimeOffset: js.UndefOr[MonitoringTimeOffsetString] = js.undefined
    ): EndpointInput = {
      val __obj = js.Dynamic.literal(
        "EndpointName" -> EndpointName.asInstanceOf[js.Any],
        "LocalPath" -> LocalPath.asInstanceOf[js.Any]
      )

      EndTimeOffset.foreach(__v => __obj.updateDynamic("EndTimeOffset")(__v.asInstanceOf[js.Any]))
      FeaturesAttribute.foreach(__v => __obj.updateDynamic("FeaturesAttribute")(__v.asInstanceOf[js.Any]))
      InferenceAttribute.foreach(__v => __obj.updateDynamic("InferenceAttribute")(__v.asInstanceOf[js.Any]))
      ProbabilityAttribute.foreach(__v => __obj.updateDynamic("ProbabilityAttribute")(__v.asInstanceOf[js.Any]))
      ProbabilityThresholdAttribute.foreach(__v => __obj.updateDynamic("ProbabilityThresholdAttribute")(__v.asInstanceOf[js.Any]))
      S3DataDistributionType.foreach(__v => __obj.updateDynamic("S3DataDistributionType")(__v.asInstanceOf[js.Any]))
      S3InputMode.foreach(__v => __obj.updateDynamic("S3InputMode")(__v.asInstanceOf[js.Any]))
      StartTimeOffset.foreach(__v => __obj.updateDynamic("StartTimeOffset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointInput]
    }
  }

  /** Provides summary information for an endpoint.
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
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any],
        "EndpointName" -> EndpointName.asInstanceOf[js.Any],
        "EndpointStatus" -> EndpointStatus.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EndpointSummary]
    }
  }

  /** The properties of an experiment as returned by the <a>Search</a> API.
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

  /** Associates a SageMaker job as a trial component with an experiment and trial. Specified when you call the following APIs: * <a>CreateProcessingJob</a> * <a>CreateTrainingJob</a> * <a>CreateTransformJob</a>
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
      TrialComponentDisplayName.foreach(__v => __obj.updateDynamic("TrialComponentDisplayName")(__v.asInstanceOf[js.Any]))
      TrialName.foreach(__v => __obj.updateDynamic("TrialName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentConfig]
    }
  }

  /** The source of the experiment.
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

  /** A summary of the properties of an experiment. To get the complete set of properties, call the <a>DescribeExperiment</a> API and provide the <code>ExperimentName</code>.
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

  /** Contains explainability metrics for a model.
    */
  @js.native
  trait Explainability extends js.Object {
    var Report: js.UndefOr[MetricsSource]
  }

  object Explainability {
    @inline
    def apply(
        Report: js.UndefOr[MetricsSource] = js.undefined
    ): Explainability = {
      val __obj = js.Dynamic.literal()
      Report.foreach(__v => __obj.updateDynamic("Report")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Explainability]
    }
  }

  /** A list of features. You must include <code>FeatureName</code> and <code>FeatureType</code>. Valid feature <code>FeatureType</code>s are <code>Integral</code>, <code>Fractional</code> and <code>String</code>.
    */
  @js.native
  trait FeatureDefinition extends js.Object {
    var FeatureName: js.UndefOr[FeatureName]
    var FeatureType: js.UndefOr[FeatureType]
  }

  object FeatureDefinition {
    @inline
    def apply(
        FeatureName: js.UndefOr[FeatureName] = js.undefined,
        FeatureType: js.UndefOr[FeatureType] = js.undefined
    ): FeatureDefinition = {
      val __obj = js.Dynamic.literal()
      FeatureName.foreach(__v => __obj.updateDynamic("FeatureName")(__v.asInstanceOf[js.Any]))
      FeatureType.foreach(__v => __obj.updateDynamic("FeatureType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FeatureDefinition]
    }
  }

  /** Amazon SageMaker Feature Store stores features in a collection called Feature Group. A Feature Group can be visualized as a table which has rows, with a unique identifier for each row where each column in the table is a feature. In principle, a Feature Group is composed of features and values per features.
    */
  @js.native
  trait FeatureGroup extends js.Object {
    var CreationTime: js.UndefOr[CreationTime]
    var Description: js.UndefOr[Description]
    var EventTimeFeatureName: js.UndefOr[FeatureName]
    var FailureReason: js.UndefOr[FailureReason]
    var FeatureDefinitions: js.UndefOr[FeatureDefinitions]
    var FeatureGroupArn: js.UndefOr[FeatureGroupArn]
    var FeatureGroupName: js.UndefOr[FeatureGroupName]
    var FeatureGroupStatus: js.UndefOr[FeatureGroupStatus]
    var OfflineStoreConfig: js.UndefOr[OfflineStoreConfig]
    var OfflineStoreStatus: js.UndefOr[OfflineStoreStatus]
    var OnlineStoreConfig: js.UndefOr[OnlineStoreConfig]
    var RecordIdentifierFeatureName: js.UndefOr[FeatureName]
    var RoleArn: js.UndefOr[RoleArn]
    var Tags: js.UndefOr[TagList]
  }

  object FeatureGroup {
    @inline
    def apply(
        CreationTime: js.UndefOr[CreationTime] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        EventTimeFeatureName: js.UndefOr[FeatureName] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        FeatureDefinitions: js.UndefOr[FeatureDefinitions] = js.undefined,
        FeatureGroupArn: js.UndefOr[FeatureGroupArn] = js.undefined,
        FeatureGroupName: js.UndefOr[FeatureGroupName] = js.undefined,
        FeatureGroupStatus: js.UndefOr[FeatureGroupStatus] = js.undefined,
        OfflineStoreConfig: js.UndefOr[OfflineStoreConfig] = js.undefined,
        OfflineStoreStatus: js.UndefOr[OfflineStoreStatus] = js.undefined,
        OnlineStoreConfig: js.UndefOr[OnlineStoreConfig] = js.undefined,
        RecordIdentifierFeatureName: js.UndefOr[FeatureName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): FeatureGroup = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EventTimeFeatureName.foreach(__v => __obj.updateDynamic("EventTimeFeatureName")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      FeatureDefinitions.foreach(__v => __obj.updateDynamic("FeatureDefinitions")(__v.asInstanceOf[js.Any]))
      FeatureGroupArn.foreach(__v => __obj.updateDynamic("FeatureGroupArn")(__v.asInstanceOf[js.Any]))
      FeatureGroupName.foreach(__v => __obj.updateDynamic("FeatureGroupName")(__v.asInstanceOf[js.Any]))
      FeatureGroupStatus.foreach(__v => __obj.updateDynamic("FeatureGroupStatus")(__v.asInstanceOf[js.Any]))
      OfflineStoreConfig.foreach(__v => __obj.updateDynamic("OfflineStoreConfig")(__v.asInstanceOf[js.Any]))
      OfflineStoreStatus.foreach(__v => __obj.updateDynamic("OfflineStoreStatus")(__v.asInstanceOf[js.Any]))
      OnlineStoreConfig.foreach(__v => __obj.updateDynamic("OnlineStoreConfig")(__v.asInstanceOf[js.Any]))
      RecordIdentifierFeatureName.foreach(__v => __obj.updateDynamic("RecordIdentifierFeatureName")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FeatureGroup]
    }
  }

  /** The name, Arn, <code>CreationTime</code>, <code>FeatureGroup</code> values, <code>LastUpdatedTime</code> and <code>EnableOnlineStorage</code> status of a <code>FeatureGroup</code>.
    */
  @js.native
  trait FeatureGroupSummary extends js.Object {
    var CreationTime: Timestamp
    var FeatureGroupArn: FeatureGroupArn
    var FeatureGroupName: FeatureGroupName
    var FeatureGroupStatus: js.UndefOr[FeatureGroupStatus]
    var OfflineStoreStatus: js.UndefOr[OfflineStoreStatus]
  }

  object FeatureGroupSummary {
    @inline
    def apply(
        CreationTime: Timestamp,
        FeatureGroupArn: FeatureGroupArn,
        FeatureGroupName: FeatureGroupName,
        FeatureGroupStatus: js.UndefOr[FeatureGroupStatus] = js.undefined,
        OfflineStoreStatus: js.UndefOr[OfflineStoreStatus] = js.undefined
    ): FeatureGroupSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "FeatureGroupArn" -> FeatureGroupArn.asInstanceOf[js.Any],
        "FeatureGroupName" -> FeatureGroupName.asInstanceOf[js.Any]
      )

      FeatureGroupStatus.foreach(__v => __obj.updateDynamic("FeatureGroupStatus")(__v.asInstanceOf[js.Any]))
      OfflineStoreStatus.foreach(__v => __obj.updateDynamic("OfflineStoreStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FeatureGroupSummary]
    }
  }

  /** The Amazon Elastic File System (EFS) storage configuration for a SageMaker image.
    */
  @js.native
  trait FileSystemConfig extends js.Object {
    var DefaultGid: js.UndefOr[DefaultGid]
    var DefaultUid: js.UndefOr[DefaultUid]
    var MountPath: js.UndefOr[MountPath]
  }

  object FileSystemConfig {
    @inline
    def apply(
        DefaultGid: js.UndefOr[DefaultGid] = js.undefined,
        DefaultUid: js.UndefOr[DefaultUid] = js.undefined,
        MountPath: js.UndefOr[MountPath] = js.undefined
    ): FileSystemConfig = {
      val __obj = js.Dynamic.literal()
      DefaultGid.foreach(__v => __obj.updateDynamic("DefaultGid")(__v.asInstanceOf[js.Any]))
      DefaultUid.foreach(__v => __obj.updateDynamic("DefaultUid")(__v.asInstanceOf[js.Any]))
      MountPath.foreach(__v => __obj.updateDynamic("MountPath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileSystemConfig]
    }
  }

  /** Specifies a file system data source for a channel.
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
        "DirectoryPath" -> DirectoryPath.asInstanceOf[js.Any],
        "FileSystemAccessMode" -> FileSystemAccessMode.asInstanceOf[js.Any],
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any],
        "FileSystemType" -> FileSystemType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FileSystemDataSource]
    }
  }

  /** A conditional statement for a search expression that includes a resource property, a Boolean operator, and a value. Resources that match the statement are returned in the results from the <a>Search</a> API. If you specify a <code>Value</code>, but not an <code>Operator</code>, Amazon SageMaker uses the equals operator. In search, there are several property types: <dl> <dt>Metrics</dt> <dd> To define a metric filter, enter a value using the form <code>"Metrics.&lt;name&gt;"</code>, where <code>&lt;name&gt;</code> is a metric name. For example, the following filter searches for training jobs with an <code>"accuracy"</code> metric greater than <code>"0.9"</code>: <code>{</code> <code>"Name": "Metrics.accuracy",</code> <code>"Operator": "GreaterThan",</code> <code>"Value": "0.9"</code> <code>}</code> </dd> <dt>HyperParameters</dt> <dd> To define a hyperparameter filter, enter a value with the form <code>"HyperParameters.&lt;name&gt;"</code>. Decimal hyperparameter values are treated
    * as a decimal in a comparison if the specified <code>Value</code> is also a decimal value. If the specified <code>Value</code> is an integer, the decimal hyperparameter values are treated as integers. For example, the following filter is satisfied by training jobs with a <code>"learning_rate"</code> hyperparameter that is less than <code>"0.5"</code>: <code> {</code> <code> "Name": "HyperParameters.learning_rate",</code> <code> "Operator": "LessThan",</code> <code> "Value": "0.5"</code> <code> }</code> </dd> <dt>Tags</dt> <dd> To define a tag filter, enter a value with the form <code>Tags.&lt;key&gt;</code>. </dd> </dl>
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

  /** The best candidate result from an AutoML training job.
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
        "Value" -> Value.asInstanceOf[js.Any]
      )

      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FinalAutoMLJobObjectiveMetric]
    }
  }

  /** Shows the final value for the objective metric for a training job that was launched by a hyperparameter tuning job. You define the objective metric in the <code>HyperParameterTuningJobObjective</code> parameter of <a>HyperParameterTuningJobConfig</a>.
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
        "Value" -> Value.asInstanceOf[js.Any]
      )

      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FinalHyperParameterTuningJobObjectiveMetric]
    }
  }

  /** Contains information about where human output will be stored.
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

  /** Contains summary information about the flow definition.
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
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "FlowDefinitionArn" -> FlowDefinitionArn.asInstanceOf[js.Any],
        "FlowDefinitionName" -> FlowDefinitionName.asInstanceOf[js.Any],
        "FlowDefinitionStatus" -> FlowDefinitionStatus.asInstanceOf[js.Any]
      )

      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FlowDefinitionSummary]
    }
  }

  @js.native
  trait GetDeviceFleetReportRequest extends js.Object {
    var DeviceFleetName: EntityName
  }

  object GetDeviceFleetReportRequest {
    @inline
    def apply(
        DeviceFleetName: EntityName
    ): GetDeviceFleetReportRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceFleetName" -> DeviceFleetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDeviceFleetReportRequest]
    }
  }

  @js.native
  trait GetDeviceFleetReportResponse extends js.Object {
    var DeviceFleetArn: DeviceFleetArn
    var DeviceFleetName: EntityName
    var AgentVersions: js.UndefOr[AgentVersions]
    var Description: js.UndefOr[DeviceFleetDescription]
    var DeviceStats: js.UndefOr[DeviceStats]
    var ModelStats: js.UndefOr[EdgeModelStats]
    var OutputConfig: js.UndefOr[EdgeOutputConfig]
    var ReportGenerated: js.UndefOr[Timestamp]
  }

  object GetDeviceFleetReportResponse {
    @inline
    def apply(
        DeviceFleetArn: DeviceFleetArn,
        DeviceFleetName: EntityName,
        AgentVersions: js.UndefOr[AgentVersions] = js.undefined,
        Description: js.UndefOr[DeviceFleetDescription] = js.undefined,
        DeviceStats: js.UndefOr[DeviceStats] = js.undefined,
        ModelStats: js.UndefOr[EdgeModelStats] = js.undefined,
        OutputConfig: js.UndefOr[EdgeOutputConfig] = js.undefined,
        ReportGenerated: js.UndefOr[Timestamp] = js.undefined
    ): GetDeviceFleetReportResponse = {
      val __obj = js.Dynamic.literal(
        "DeviceFleetArn" -> DeviceFleetArn.asInstanceOf[js.Any],
        "DeviceFleetName" -> DeviceFleetName.asInstanceOf[js.Any]
      )

      AgentVersions.foreach(__v => __obj.updateDynamic("AgentVersions")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DeviceStats.foreach(__v => __obj.updateDynamic("DeviceStats")(__v.asInstanceOf[js.Any]))
      ModelStats.foreach(__v => __obj.updateDynamic("ModelStats")(__v.asInstanceOf[js.Any]))
      OutputConfig.foreach(__v => __obj.updateDynamic("OutputConfig")(__v.asInstanceOf[js.Any]))
      ReportGenerated.foreach(__v => __obj.updateDynamic("ReportGenerated")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeviceFleetReportResponse]
    }
  }

  @js.native
  trait GetModelPackageGroupPolicyInput extends js.Object {
    var ModelPackageGroupName: EntityName
  }

  object GetModelPackageGroupPolicyInput {
    @inline
    def apply(
        ModelPackageGroupName: EntityName
    ): GetModelPackageGroupPolicyInput = {
      val __obj = js.Dynamic.literal(
        "ModelPackageGroupName" -> ModelPackageGroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetModelPackageGroupPolicyInput]
    }
  }

  @js.native
  trait GetModelPackageGroupPolicyOutput extends js.Object {
    var ResourcePolicy: PolicyString
  }

  object GetModelPackageGroupPolicyOutput {
    @inline
    def apply(
        ResourcePolicy: PolicyString
    ): GetModelPackageGroupPolicyOutput = {
      val __obj = js.Dynamic.literal(
        "ResourcePolicy" -> ResourcePolicy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetModelPackageGroupPolicyOutput]
    }
  }

  @js.native
  trait GetSagemakerServicecatalogPortfolioStatusInput extends js.Object

  object GetSagemakerServicecatalogPortfolioStatusInput {
    @inline
    def apply(): GetSagemakerServicecatalogPortfolioStatusInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSagemakerServicecatalogPortfolioStatusInput]
    }
  }

  @js.native
  trait GetSagemakerServicecatalogPortfolioStatusOutput extends js.Object {
    var Status: js.UndefOr[SagemakerServicecatalogStatus]
  }

  object GetSagemakerServicecatalogPortfolioStatusOutput {
    @inline
    def apply(
        Status: js.UndefOr[SagemakerServicecatalogStatus] = js.undefined
    ): GetSagemakerServicecatalogPortfolioStatusOutput = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSagemakerServicecatalogPortfolioStatusOutput]
    }
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

  /** Specifies configuration details for a Git repository in your AWS account.
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

  /** Specifies configuration details for a Git repository when the repository is updated.
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

  /** Defines under what conditions SageMaker creates a human loop. Used within . See for the required format of activation conditions.
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

  /** Provides information about how and under what conditions SageMaker creates a human loop. If <code>HumanLoopActivationConfig</code> is not given, then all requests go to humans.
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

  /** Describes the work to be performed by human workers.
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
        "HumanTaskUiArn" -> HumanTaskUiArn.asInstanceOf[js.Any],
        "TaskCount" -> TaskCount.asInstanceOf[js.Any],
        "TaskDescription" -> TaskDescription.asInstanceOf[js.Any],
        "TaskTitle" -> TaskTitle.asInstanceOf[js.Any],
        "WorkteamArn" -> WorkteamArn.asInstanceOf[js.Any]
      )

      PublicWorkforceTaskPrice.foreach(__v => __obj.updateDynamic("PublicWorkforceTaskPrice")(__v.asInstanceOf[js.Any]))
      TaskAvailabilityLifetimeInSeconds.foreach(__v => __obj.updateDynamic("TaskAvailabilityLifetimeInSeconds")(__v.asInstanceOf[js.Any]))
      TaskKeywords.foreach(__v => __obj.updateDynamic("TaskKeywords")(__v.asInstanceOf[js.Any]))
      TaskTimeLimitInSeconds.foreach(__v => __obj.updateDynamic("TaskTimeLimitInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HumanLoopConfig]
    }
  }

  /** Container for configuring the source of human task requests.
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

  /** Information required for human workers to complete a labeling task.
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
        "AnnotationConsolidationConfig" -> AnnotationConsolidationConfig.asInstanceOf[js.Any],
        "NumberOfHumanWorkersPerDataObject" -> NumberOfHumanWorkersPerDataObject.asInstanceOf[js.Any],
        "PreHumanTaskLambdaArn" -> PreHumanTaskLambdaArn.asInstanceOf[js.Any],
        "TaskDescription" -> TaskDescription.asInstanceOf[js.Any],
        "TaskTimeLimitInSeconds" -> TaskTimeLimitInSeconds.asInstanceOf[js.Any],
        "TaskTitle" -> TaskTitle.asInstanceOf[js.Any],
        "UiConfig" -> UiConfig.asInstanceOf[js.Any],
        "WorkteamArn" -> WorkteamArn.asInstanceOf[js.Any]
      )

      MaxConcurrentTaskCount.foreach(__v => __obj.updateDynamic("MaxConcurrentTaskCount")(__v.asInstanceOf[js.Any]))
      PublicWorkforceTaskPrice.foreach(__v => __obj.updateDynamic("PublicWorkforceTaskPrice")(__v.asInstanceOf[js.Any]))
      TaskAvailabilityLifetimeInSeconds.foreach(__v => __obj.updateDynamic("TaskAvailabilityLifetimeInSeconds")(__v.asInstanceOf[js.Any]))
      TaskKeywords.foreach(__v => __obj.updateDynamic("TaskKeywords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HumanTaskConfig]
    }
  }

  /** Container for human task user interface information.
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
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "HumanTaskUiArn" -> HumanTaskUiArn.asInstanceOf[js.Any],
        "HumanTaskUiName" -> HumanTaskUiName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[HumanTaskUiSummary]
    }
  }

  /** Specifies which training algorithm to use for training jobs that a hyperparameter tuning job launches and the metrics to monitor.
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

  /** Defines a hyperparameter to be used by an algorithm.
    */
  @js.native
  trait HyperParameterSpecification extends js.Object {
    var Name: ParameterName
    var Type: ParameterType
    var DefaultValue: js.UndefOr[HyperParameterValue]
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
        DefaultValue: js.UndefOr[HyperParameterValue] = js.undefined,
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

  /** Defines the training jobs launched by a hyperparameter tuning job.
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
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any],
        "ResourceConfig" -> ResourceConfig.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "StoppingCondition" -> StoppingCondition.asInstanceOf[js.Any]
      )

      CheckpointConfig.foreach(__v => __obj.updateDynamic("CheckpointConfig")(__v.asInstanceOf[js.Any]))
      DefinitionName.foreach(__v => __obj.updateDynamic("DefinitionName")(__v.asInstanceOf[js.Any]))
      EnableInterContainerTrafficEncryption.foreach(__v => __obj.updateDynamic("EnableInterContainerTrafficEncryption")(__v.asInstanceOf[js.Any]))
      EnableManagedSpotTraining.foreach(__v => __obj.updateDynamic("EnableManagedSpotTraining")(__v.asInstanceOf[js.Any]))
      EnableNetworkIsolation.foreach(__v => __obj.updateDynamic("EnableNetworkIsolation")(__v.asInstanceOf[js.Any]))
      HyperParameterRanges.foreach(__v => __obj.updateDynamic("HyperParameterRanges")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      StaticHyperParameters.foreach(__v => __obj.updateDynamic("StaticHyperParameters")(__v.asInstanceOf[js.Any]))
      TuningObjective.foreach(__v => __obj.updateDynamic("TuningObjective")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HyperParameterTrainingJobDefinition]
    }
  }

  /** Specifies summary information about a training job.
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
        FinalHyperParameterTuningJobObjectiveMetric: js.UndefOr[FinalHyperParameterTuningJobObjectiveMetric] = js.undefined,
        ObjectiveStatus: js.UndefOr[ObjectiveStatus] = js.undefined,
        TrainingEndTime: js.UndefOr[Timestamp] = js.undefined,
        TrainingJobDefinitionName: js.UndefOr[HyperParameterTrainingJobDefinitionName] = js.undefined,
        TrainingStartTime: js.UndefOr[Timestamp] = js.undefined,
        TuningJobName: js.UndefOr[HyperParameterTuningJobName] = js.undefined
    ): HyperParameterTrainingJobSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "TrainingJobArn" -> TrainingJobArn.asInstanceOf[js.Any],
        "TrainingJobName" -> TrainingJobName.asInstanceOf[js.Any],
        "TrainingJobStatus" -> TrainingJobStatus.asInstanceOf[js.Any],
        "TunedHyperParameters" -> TunedHyperParameters.asInstanceOf[js.Any]
      )

      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      FinalHyperParameterTuningJobObjectiveMetric.foreach(__v => __obj.updateDynamic("FinalHyperParameterTuningJobObjectiveMetric")(__v.asInstanceOf[js.Any]))
      ObjectiveStatus.foreach(__v => __obj.updateDynamic("ObjectiveStatus")(__v.asInstanceOf[js.Any]))
      TrainingEndTime.foreach(__v => __obj.updateDynamic("TrainingEndTime")(__v.asInstanceOf[js.Any]))
      TrainingJobDefinitionName.foreach(__v => __obj.updateDynamic("TrainingJobDefinitionName")(__v.asInstanceOf[js.Any]))
      TrainingStartTime.foreach(__v => __obj.updateDynamic("TrainingStartTime")(__v.asInstanceOf[js.Any]))
      TuningJobName.foreach(__v => __obj.updateDynamic("TuningJobName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HyperParameterTrainingJobSummary]
    }
  }

  /** Configures a hyperparameter tuning job.
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
        "Strategy" -> Strategy.asInstanceOf[js.Any]
      )

      HyperParameterTuningJobObjective.foreach(__v => __obj.updateDynamic("HyperParameterTuningJobObjective")(__v.asInstanceOf[js.Any]))
      ParameterRanges.foreach(__v => __obj.updateDynamic("ParameterRanges")(__v.asInstanceOf[js.Any]))
      TrainingJobEarlyStoppingType.foreach(__v => __obj.updateDynamic("TrainingJobEarlyStoppingType")(__v.asInstanceOf[js.Any]))
      TuningJobCompletionCriteria.foreach(__v => __obj.updateDynamic("TuningJobCompletionCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HyperParameterTuningJobConfig]
    }
  }

  /** Defines the objective metric for a hyperparameter tuning job. Hyperparameter tuning uses the value of this metric to evaluate the training jobs it launches, and returns the training job that results in either the highest or lowest value for this metric, depending on the value you specify for the <code>Type</code> parameter.
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
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[HyperParameterTuningJobObjective]
    }
  }

  /** Provides summary information about a hyperparameter tuning job.
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
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "HyperParameterTuningJobArn" -> HyperParameterTuningJobArn.asInstanceOf[js.Any],
        "HyperParameterTuningJobName" -> HyperParameterTuningJobName.asInstanceOf[js.Any],
        "HyperParameterTuningJobStatus" -> HyperParameterTuningJobStatus.asInstanceOf[js.Any],
        "ObjectiveStatusCounters" -> ObjectiveStatusCounters.asInstanceOf[js.Any],
        "Strategy" -> Strategy.asInstanceOf[js.Any],
        "TrainingJobStatusCounters" -> TrainingJobStatusCounters.asInstanceOf[js.Any]
      )

      HyperParameterTuningEndTime.foreach(__v => __obj.updateDynamic("HyperParameterTuningEndTime")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      ResourceLimits.foreach(__v => __obj.updateDynamic("ResourceLimits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HyperParameterTuningJobSummary]
    }
  }

  /** Specifies the configuration for a hyperparameter tuning job that uses one or more previous hyperparameter tuning jobs as a starting point. The results of previous tuning jobs are used to inform which combinations of hyperparameters to search over in the new tuning job. All training jobs launched by the new hyperparameter tuning job are evaluated by using the objective metric, and the training job that performs the best is compared to the best training jobs from the parent tuning jobs. From these, the training job that performs the best as measured by the objective metric is returned as the overall best training job.
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
        "WarmStartType" -> WarmStartType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[HyperParameterTuningJobWarmStartConfig]
    }
  }

  /** A SageMaker image. A SageMaker image represents a set of container images that are derived from a common base container image. Each of these container images is represented by a SageMaker <code>ImageVersion</code>.
    */
  @js.native
  trait Image extends js.Object {
    var CreationTime: Timestamp
    var ImageArn: ImageArn
    var ImageName: ImageName
    var ImageStatus: ImageStatus
    var LastModifiedTime: Timestamp
    var Description: js.UndefOr[ImageDescription]
    var DisplayName: js.UndefOr[ImageDisplayName]
    var FailureReason: js.UndefOr[FailureReason]
  }

  object Image {
    @inline
    def apply(
        CreationTime: Timestamp,
        ImageArn: ImageArn,
        ImageName: ImageName,
        ImageStatus: ImageStatus,
        LastModifiedTime: Timestamp,
        Description: js.UndefOr[ImageDescription] = js.undefined,
        DisplayName: js.UndefOr[ImageDisplayName] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined
    ): Image = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ImageArn" -> ImageArn.asInstanceOf[js.Any],
        "ImageName" -> ImageName.asInstanceOf[js.Any],
        "ImageStatus" -> ImageStatus.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Image]
    }
  }

  /** Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC).
    */
  @js.native
  trait ImageConfig extends js.Object {
    var RepositoryAccessMode: RepositoryAccessMode
    var RepositoryAuthConfig: js.UndefOr[RepositoryAuthConfig]
  }

  object ImageConfig {
    @inline
    def apply(
        RepositoryAccessMode: RepositoryAccessMode,
        RepositoryAuthConfig: js.UndefOr[RepositoryAuthConfig] = js.undefined
    ): ImageConfig = {
      val __obj = js.Dynamic.literal(
        "RepositoryAccessMode" -> RepositoryAccessMode.asInstanceOf[js.Any]
      )

      RepositoryAuthConfig.foreach(__v => __obj.updateDynamic("RepositoryAuthConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageConfig]
    }
  }

  /** A version of a SageMaker <code>Image</code>. A version represents an existing container image.
    */
  @js.native
  trait ImageVersion extends js.Object {
    var CreationTime: Timestamp
    var ImageArn: ImageArn
    var ImageVersionArn: ImageVersionArn
    var ImageVersionStatus: ImageVersionStatus
    var LastModifiedTime: Timestamp
    var Version: ImageVersionNumber
    var FailureReason: js.UndefOr[FailureReason]
  }

  object ImageVersion {
    @inline
    def apply(
        CreationTime: Timestamp,
        ImageArn: ImageArn,
        ImageVersionArn: ImageVersionArn,
        ImageVersionStatus: ImageVersionStatus,
        LastModifiedTime: Timestamp,
        Version: ImageVersionNumber,
        FailureReason: js.UndefOr[FailureReason] = js.undefined
    ): ImageVersion = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ImageArn" -> ImageArn.asInstanceOf[js.Any],
        "ImageVersionArn" -> ImageVersionArn.asInstanceOf[js.Any],
        "ImageVersionStatus" -> ImageVersionStatus.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "Version" -> Version.asInstanceOf[js.Any]
      )

      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageVersion]
    }
  }

  /** Specifies details about how containers in a multi-container endpoint are run.
    */
  @js.native
  trait InferenceExecutionConfig extends js.Object {
    var Mode: InferenceExecutionMode
  }

  object InferenceExecutionConfig {
    @inline
    def apply(
        Mode: InferenceExecutionMode
    ): InferenceExecutionConfig = {
      val __obj = js.Dynamic.literal(
        "Mode" -> Mode.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InferenceExecutionConfig]
    }
  }

  /** Defines how to perform inference generation after a training job is run.
    */
  @js.native
  trait InferenceSpecification extends js.Object {
    var Containers: ModelPackageContainerDefinitionList
    var SupportedContentTypes: ContentTypes
    var SupportedResponseMIMETypes: ResponseMIMETypes
    var SupportedRealtimeInferenceInstanceTypes: js.UndefOr[RealtimeInferenceInstanceTypes]
    var SupportedTransformInstanceTypes: js.UndefOr[TransformInstanceTypes]
  }

  object InferenceSpecification {
    @inline
    def apply(
        Containers: ModelPackageContainerDefinitionList,
        SupportedContentTypes: ContentTypes,
        SupportedResponseMIMETypes: ResponseMIMETypes,
        SupportedRealtimeInferenceInstanceTypes: js.UndefOr[RealtimeInferenceInstanceTypes] = js.undefined,
        SupportedTransformInstanceTypes: js.UndefOr[TransformInstanceTypes] = js.undefined
    ): InferenceSpecification = {
      val __obj = js.Dynamic.literal(
        "Containers" -> Containers.asInstanceOf[js.Any],
        "SupportedContentTypes" -> SupportedContentTypes.asInstanceOf[js.Any],
        "SupportedResponseMIMETypes" -> SupportedResponseMIMETypes.asInstanceOf[js.Any]
      )

      SupportedRealtimeInferenceInstanceTypes.foreach(__v => __obj.updateDynamic("SupportedRealtimeInferenceInstanceTypes")(__v.asInstanceOf[js.Any]))
      SupportedTransformInstanceTypes.foreach(__v => __obj.updateDynamic("SupportedTransformInstanceTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InferenceSpecification]
    }
  }

  /** Contains information about the location of input model artifacts, the name and shape of the expected data inputs, and the framework in which the model was trained.
    */
  @js.native
  trait InputConfig extends js.Object {
    var DataInputConfig: DataInputConfig
    var Framework: Framework
    var S3Uri: S3Uri
    var FrameworkVersion: js.UndefOr[FrameworkVersion]
  }

  object InputConfig {
    @inline
    def apply(
        DataInputConfig: DataInputConfig,
        Framework: Framework,
        S3Uri: S3Uri,
        FrameworkVersion: js.UndefOr[FrameworkVersion] = js.undefined
    ): InputConfig = {
      val __obj = js.Dynamic.literal(
        "DataInputConfig" -> DataInputConfig.asInstanceOf[js.Any],
        "Framework" -> Framework.asInstanceOf[js.Any],
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )

      FrameworkVersion.foreach(__v => __obj.updateDynamic("FrameworkVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputConfig]
    }
  }

  /** For a hyperparameter of the integer type, specifies the range that a hyperparameter tuning job searches.
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
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ScalingType.foreach(__v => __obj.updateDynamic("ScalingType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IntegerParameterRange]
    }
  }

  /** Defines the possible values for an integer hyperparameter.
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

  /** The JupyterServer app settings.
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

  /** The KernelGateway app settings.
    */
  @js.native
  trait KernelGatewayAppSettings extends js.Object {
    var CustomImages: js.UndefOr[CustomImages]
    var DefaultResourceSpec: js.UndefOr[ResourceSpec]
  }

  object KernelGatewayAppSettings {
    @inline
    def apply(
        CustomImages: js.UndefOr[CustomImages] = js.undefined,
        DefaultResourceSpec: js.UndefOr[ResourceSpec] = js.undefined
    ): KernelGatewayAppSettings = {
      val __obj = js.Dynamic.literal()
      CustomImages.foreach(__v => __obj.updateDynamic("CustomImages")(__v.asInstanceOf[js.Any]))
      DefaultResourceSpec.foreach(__v => __obj.updateDynamic("DefaultResourceSpec")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KernelGatewayAppSettings]
    }
  }

  /** The configuration for the file system and kernels in a SageMaker image running as a KernelGateway app.
    */
  @js.native
  trait KernelGatewayImageConfig extends js.Object {
    var KernelSpecs: KernelSpecs
    var FileSystemConfig: js.UndefOr[FileSystemConfig]
  }

  object KernelGatewayImageConfig {
    @inline
    def apply(
        KernelSpecs: KernelSpecs,
        FileSystemConfig: js.UndefOr[FileSystemConfig] = js.undefined
    ): KernelGatewayImageConfig = {
      val __obj = js.Dynamic.literal(
        "KernelSpecs" -> KernelSpecs.asInstanceOf[js.Any]
      )

      FileSystemConfig.foreach(__v => __obj.updateDynamic("FileSystemConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KernelGatewayImageConfig]
    }
  }

  /** The specification of a Jupyter kernel.
    */
  @js.native
  trait KernelSpec extends js.Object {
    var Name: KernelName
    var DisplayName: js.UndefOr[KernelDisplayName]
  }

  object KernelSpec {
    @inline
    def apply(
        Name: KernelName,
        DisplayName: js.UndefOr[KernelDisplayName] = js.undefined
    ): KernelSpec = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KernelSpec]
    }
  }

  /** Provides a breakdown of the number of objects labeled.
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

  /** Provides counts for human-labeled tasks in the labeling job.
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

  /** Provides configuration information for auto-labeling of your data objects. A <code>LabelingJobAlgorithmsConfig</code> object must be supplied in order to use auto-labeling.
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

      InitialActiveLearningModelArn.foreach(__v => __obj.updateDynamic("InitialActiveLearningModelArn")(__v.asInstanceOf[js.Any]))
      LabelingJobResourceConfig.foreach(__v => __obj.updateDynamic("LabelingJobResourceConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelingJobAlgorithmsConfig]
    }
  }

  /** Attributes of the data specified by the customer. Use these to describe the data to be labeled.
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

  /** Provides information about the location of input data. You must specify at least one of the following: <code>S3DataSource</code> or <code>SnsDataSource</code>. Use <code>SnsDataSource</code> to specify an SNS input topic for a streaming labeling job. If you do not specify and SNS input topic ARN, Ground Truth will create a one-time labeling job. Use <code>S3DataSource</code> to specify an input manifest file for both streaming and one-time labeling jobs. Adding an <code>S3DataSource</code> is optional if you use <code>SnsDataSource</code> to create a streaming labeling job.
    */
  @js.native
  trait LabelingJobDataSource extends js.Object {
    var S3DataSource: js.UndefOr[LabelingJobS3DataSource]
    var SnsDataSource: js.UndefOr[LabelingJobSnsDataSource]
  }

  object LabelingJobDataSource {
    @inline
    def apply(
        S3DataSource: js.UndefOr[LabelingJobS3DataSource] = js.undefined,
        SnsDataSource: js.UndefOr[LabelingJobSnsDataSource] = js.undefined
    ): LabelingJobDataSource = {
      val __obj = js.Dynamic.literal()
      S3DataSource.foreach(__v => __obj.updateDynamic("S3DataSource")(__v.asInstanceOf[js.Any]))
      SnsDataSource.foreach(__v => __obj.updateDynamic("SnsDataSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelingJobDataSource]
    }
  }

  /** Provides summary information for a work team.
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
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "JobReferenceCode" -> JobReferenceCode.asInstanceOf[js.Any],
        "WorkRequesterAccountId" -> WorkRequesterAccountId.asInstanceOf[js.Any]
      )

      LabelCounters.foreach(__v => __obj.updateDynamic("LabelCounters")(__v.asInstanceOf[js.Any]))
      LabelingJobName.foreach(__v => __obj.updateDynamic("LabelingJobName")(__v.asInstanceOf[js.Any]))
      NumberOfHumanWorkersPerDataObject.foreach(__v => __obj.updateDynamic("NumberOfHumanWorkersPerDataObject")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelingJobForWorkteamSummary]
    }
  }

  /** Input configuration information for a labeling job.
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

  /** Specifies the location of the output produced by the labeling job.
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

      FinalActiveLearningModelArn.foreach(__v => __obj.updateDynamic("FinalActiveLearningModelArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelingJobOutput]
    }
  }

  /** Output configuration information for a labeling job.
    */
  @js.native
  trait LabelingJobOutputConfig extends js.Object {
    var S3OutputPath: S3Uri
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var SnsTopicArn: js.UndefOr[SnsTopicArn]
  }

  object LabelingJobOutputConfig {
    @inline
    def apply(
        S3OutputPath: S3Uri,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        SnsTopicArn: js.UndefOr[SnsTopicArn] = js.undefined
    ): LabelingJobOutputConfig = {
      val __obj = js.Dynamic.literal(
        "S3OutputPath" -> S3OutputPath.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.updateDynamic("SnsTopicArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelingJobOutputConfig]
    }
  }

  /** Configure encryption on the storage volume attached to the ML compute instance used to run automated data labeling model training and inference.
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

  /** The Amazon S3 location of the input data objects.
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

  /** An Amazon SNS data source used for streaming labeling jobs.
    */
  @js.native
  trait LabelingJobSnsDataSource extends js.Object {
    var SnsTopicArn: SnsTopicArn
  }

  object LabelingJobSnsDataSource {
    @inline
    def apply(
        SnsTopicArn: SnsTopicArn
    ): LabelingJobSnsDataSource = {
      val __obj = js.Dynamic.literal(
        "SnsTopicArn" -> SnsTopicArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LabelingJobSnsDataSource]
    }
  }

  /** A set of conditions for stopping a labeling job. If any of the conditions are met, the job is automatically stopped. You can use these conditions to control the cost of data labeling.
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
      MaxHumanLabeledObjectCount.foreach(__v => __obj.updateDynamic("MaxHumanLabeledObjectCount")(__v.asInstanceOf[js.Any]))
      MaxPercentageOfInputDatasetLabeled.foreach(__v => __obj.updateDynamic("MaxPercentageOfInputDatasetLabeled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelingJobStoppingConditions]
    }
  }

  /** Provides summary information about a labeling job.
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
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "LabelCounters" -> LabelCounters.asInstanceOf[js.Any],
        "LabelingJobArn" -> LabelingJobArn.asInstanceOf[js.Any],
        "LabelingJobName" -> LabelingJobName.asInstanceOf[js.Any],
        "LabelingJobStatus" -> LabelingJobStatus.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "PreHumanTaskLambdaArn" -> PreHumanTaskLambdaArn.asInstanceOf[js.Any],
        "WorkteamArn" -> WorkteamArn.asInstanceOf[js.Any]
      )

      AnnotationConsolidationLambdaArn.foreach(__v => __obj.updateDynamic("AnnotationConsolidationLambdaArn")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      InputConfig.foreach(__v => __obj.updateDynamic("InputConfig")(__v.asInstanceOf[js.Any]))
      LabelingJobOutput.foreach(__v => __obj.updateDynamic("LabelingJobOutput")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelingJobSummary]
    }
  }

  @js.native
  trait ListActionsRequest extends js.Object {
    var ActionType: js.UndefOr[String256]
    var CreatedAfter: js.UndefOr[Timestamp]
    var CreatedBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[SortActionsBy]
    var SortOrder: js.UndefOr[SortOrder]
    var SourceUri: js.UndefOr[SourceUri]
  }

  object ListActionsRequest {
    @inline
    def apply(
        ActionType: js.UndefOr[String256] = js.undefined,
        CreatedAfter: js.UndefOr[Timestamp] = js.undefined,
        CreatedBefore: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[SortActionsBy] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined,
        SourceUri: js.UndefOr[SourceUri] = js.undefined
    ): ListActionsRequest = {
      val __obj = js.Dynamic.literal()
      ActionType.foreach(__v => __obj.updateDynamic("ActionType")(__v.asInstanceOf[js.Any]))
      CreatedAfter.foreach(__v => __obj.updateDynamic("CreatedAfter")(__v.asInstanceOf[js.Any]))
      CreatedBefore.foreach(__v => __obj.updateDynamic("CreatedBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      SourceUri.foreach(__v => __obj.updateDynamic("SourceUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListActionsRequest]
    }
  }

  @js.native
  trait ListActionsResponse extends js.Object {
    var ActionSummaries: js.UndefOr[ActionSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListActionsResponse {
    @inline
    def apply(
        ActionSummaries: js.UndefOr[ActionSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListActionsResponse = {
      val __obj = js.Dynamic.literal()
      ActionSummaries.foreach(__v => __obj.updateDynamic("ActionSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListActionsResponse]
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
  trait ListAppImageConfigsRequest extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var ModifiedTimeAfter: js.UndefOr[Timestamp]
    var ModifiedTimeBefore: js.UndefOr[Timestamp]
    var NameContains: js.UndefOr[AppImageConfigName]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[AppImageConfigSortKey]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListAppImageConfigsRequest {
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        ModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        ModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        NameContains: js.UndefOr[AppImageConfigName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[AppImageConfigSortKey] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListAppImageConfigsRequest = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      ModifiedTimeAfter.foreach(__v => __obj.updateDynamic("ModifiedTimeAfter")(__v.asInstanceOf[js.Any]))
      ModifiedTimeBefore.foreach(__v => __obj.updateDynamic("ModifiedTimeBefore")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppImageConfigsRequest]
    }
  }

  @js.native
  trait ListAppImageConfigsResponse extends js.Object {
    var AppImageConfigs: js.UndefOr[AppImageConfigList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAppImageConfigsResponse {
    @inline
    def apply(
        AppImageConfigs: js.UndefOr[AppImageConfigList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppImageConfigsResponse = {
      val __obj = js.Dynamic.literal()
      AppImageConfigs.foreach(__v => __obj.updateDynamic("AppImageConfigs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppImageConfigsResponse]
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
  trait ListArtifactsRequest extends js.Object {
    var ArtifactType: js.UndefOr[String256]
    var CreatedAfter: js.UndefOr[Timestamp]
    var CreatedBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[SortArtifactsBy]
    var SortOrder: js.UndefOr[SortOrder]
    var SourceUri: js.UndefOr[SourceUri]
  }

  object ListArtifactsRequest {
    @inline
    def apply(
        ArtifactType: js.UndefOr[String256] = js.undefined,
        CreatedAfter: js.UndefOr[Timestamp] = js.undefined,
        CreatedBefore: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[SortArtifactsBy] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined,
        SourceUri: js.UndefOr[SourceUri] = js.undefined
    ): ListArtifactsRequest = {
      val __obj = js.Dynamic.literal()
      ArtifactType.foreach(__v => __obj.updateDynamic("ArtifactType")(__v.asInstanceOf[js.Any]))
      CreatedAfter.foreach(__v => __obj.updateDynamic("CreatedAfter")(__v.asInstanceOf[js.Any]))
      CreatedBefore.foreach(__v => __obj.updateDynamic("CreatedBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      SourceUri.foreach(__v => __obj.updateDynamic("SourceUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListArtifactsRequest]
    }
  }

  @js.native
  trait ListArtifactsResponse extends js.Object {
    var ArtifactSummaries: js.UndefOr[ArtifactSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListArtifactsResponse {
    @inline
    def apply(
        ArtifactSummaries: js.UndefOr[ArtifactSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListArtifactsResponse = {
      val __obj = js.Dynamic.literal()
      ArtifactSummaries.foreach(__v => __obj.updateDynamic("ArtifactSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListArtifactsResponse]
    }
  }

  @js.native
  trait ListAssociationsRequest extends js.Object {
    var AssociationType: js.UndefOr[AssociationEdgeType]
    var CreatedAfter: js.UndefOr[Timestamp]
    var CreatedBefore: js.UndefOr[Timestamp]
    var DestinationArn: js.UndefOr[AssociationEntityArn]
    var DestinationType: js.UndefOr[String256]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[SortAssociationsBy]
    var SortOrder: js.UndefOr[SortOrder]
    var SourceArn: js.UndefOr[AssociationEntityArn]
    var SourceType: js.UndefOr[String256]
  }

  object ListAssociationsRequest {
    @inline
    def apply(
        AssociationType: js.UndefOr[AssociationEdgeType] = js.undefined,
        CreatedAfter: js.UndefOr[Timestamp] = js.undefined,
        CreatedBefore: js.UndefOr[Timestamp] = js.undefined,
        DestinationArn: js.UndefOr[AssociationEntityArn] = js.undefined,
        DestinationType: js.UndefOr[String256] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[SortAssociationsBy] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined,
        SourceArn: js.UndefOr[AssociationEntityArn] = js.undefined,
        SourceType: js.UndefOr[String256] = js.undefined
    ): ListAssociationsRequest = {
      val __obj = js.Dynamic.literal()
      AssociationType.foreach(__v => __obj.updateDynamic("AssociationType")(__v.asInstanceOf[js.Any]))
      CreatedAfter.foreach(__v => __obj.updateDynamic("CreatedAfter")(__v.asInstanceOf[js.Any]))
      CreatedBefore.foreach(__v => __obj.updateDynamic("CreatedBefore")(__v.asInstanceOf[js.Any]))
      DestinationArn.foreach(__v => __obj.updateDynamic("DestinationArn")(__v.asInstanceOf[js.Any]))
      DestinationType.foreach(__v => __obj.updateDynamic("DestinationType")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociationsRequest]
    }
  }

  @js.native
  trait ListAssociationsResponse extends js.Object {
    var AssociationSummaries: js.UndefOr[AssociationSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAssociationsResponse {
    @inline
    def apply(
        AssociationSummaries: js.UndefOr[AssociationSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssociationsResponse = {
      val __obj = js.Dynamic.literal()
      AssociationSummaries.foreach(__v => __obj.updateDynamic("AssociationSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociationsResponse]
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
  trait ListContextsRequest extends js.Object {
    var ContextType: js.UndefOr[String256]
    var CreatedAfter: js.UndefOr[Timestamp]
    var CreatedBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[SortContextsBy]
    var SortOrder: js.UndefOr[SortOrder]
    var SourceUri: js.UndefOr[SourceUri]
  }

  object ListContextsRequest {
    @inline
    def apply(
        ContextType: js.UndefOr[String256] = js.undefined,
        CreatedAfter: js.UndefOr[Timestamp] = js.undefined,
        CreatedBefore: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[SortContextsBy] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined,
        SourceUri: js.UndefOr[SourceUri] = js.undefined
    ): ListContextsRequest = {
      val __obj = js.Dynamic.literal()
      ContextType.foreach(__v => __obj.updateDynamic("ContextType")(__v.asInstanceOf[js.Any]))
      CreatedAfter.foreach(__v => __obj.updateDynamic("CreatedAfter")(__v.asInstanceOf[js.Any]))
      CreatedBefore.foreach(__v => __obj.updateDynamic("CreatedBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      SourceUri.foreach(__v => __obj.updateDynamic("SourceUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContextsRequest]
    }
  }

  @js.native
  trait ListContextsResponse extends js.Object {
    var ContextSummaries: js.UndefOr[ContextSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListContextsResponse {
    @inline
    def apply(
        ContextSummaries: js.UndefOr[ContextSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListContextsResponse = {
      val __obj = js.Dynamic.literal()
      ContextSummaries.foreach(__v => __obj.updateDynamic("ContextSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContextsResponse]
    }
  }

  @js.native
  trait ListDataQualityJobDefinitionsRequest extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var EndpointName: js.UndefOr[EndpointName]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[NameContains]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[MonitoringJobDefinitionSortKey]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListDataQualityJobDefinitionsRequest {
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        EndpointName: js.UndefOr[EndpointName] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[NameContains] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[MonitoringJobDefinitionSortKey] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListDataQualityJobDefinitionsRequest = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      EndpointName.foreach(__v => __obj.updateDynamic("EndpointName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataQualityJobDefinitionsRequest]
    }
  }

  @js.native
  trait ListDataQualityJobDefinitionsResponse extends js.Object {
    var JobDefinitionSummaries: MonitoringJobDefinitionSummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDataQualityJobDefinitionsResponse {
    @inline
    def apply(
        JobDefinitionSummaries: MonitoringJobDefinitionSummaryList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDataQualityJobDefinitionsResponse = {
      val __obj = js.Dynamic.literal(
        "JobDefinitionSummaries" -> JobDefinitionSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataQualityJobDefinitionsResponse]
    }
  }

  @js.native
  trait ListDeviceFleetsRequest extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var LastModifiedTimeAfter: js.UndefOr[Timestamp]
    var LastModifiedTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[ListMaxResults]
    var NameContains: js.UndefOr[NameContains]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[ListDeviceFleetsSortBy]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListDeviceFleetsRequest {
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[ListMaxResults] = js.undefined,
        NameContains: js.UndefOr[NameContains] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[ListDeviceFleetsSortBy] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListDeviceFleetsRequest = {
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
      __obj.asInstanceOf[ListDeviceFleetsRequest]
    }
  }

  @js.native
  trait ListDeviceFleetsResponse extends js.Object {
    var DeviceFleetSummaries: DeviceFleetSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDeviceFleetsResponse {
    @inline
    def apply(
        DeviceFleetSummaries: DeviceFleetSummaries,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeviceFleetsResponse = {
      val __obj = js.Dynamic.literal(
        "DeviceFleetSummaries" -> DeviceFleetSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeviceFleetsResponse]
    }
  }

  @js.native
  trait ListDevicesRequest extends js.Object {
    var DeviceFleetName: js.UndefOr[EntityName]
    var LatestHeartbeatAfter: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[ListMaxResults]
    var ModelName: js.UndefOr[EntityName]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDevicesRequest {
    @inline
    def apply(
        DeviceFleetName: js.UndefOr[EntityName] = js.undefined,
        LatestHeartbeatAfter: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[ListMaxResults] = js.undefined,
        ModelName: js.UndefOr[EntityName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDevicesRequest = {
      val __obj = js.Dynamic.literal()
      DeviceFleetName.foreach(__v => __obj.updateDynamic("DeviceFleetName")(__v.asInstanceOf[js.Any]))
      LatestHeartbeatAfter.foreach(__v => __obj.updateDynamic("LatestHeartbeatAfter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      ModelName.foreach(__v => __obj.updateDynamic("ModelName")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevicesRequest]
    }
  }

  @js.native
  trait ListDevicesResponse extends js.Object {
    var DeviceSummaries: DeviceSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDevicesResponse {
    @inline
    def apply(
        DeviceSummaries: DeviceSummaries,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDevicesResponse = {
      val __obj = js.Dynamic.literal(
        "DeviceSummaries" -> DeviceSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevicesResponse]
    }
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
  trait ListEdgePackagingJobsRequest extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var LastModifiedTimeAfter: js.UndefOr[Timestamp]
    var LastModifiedTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[ListMaxResults]
    var ModelNameContains: js.UndefOr[NameContains]
    var NameContains: js.UndefOr[NameContains]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[ListEdgePackagingJobsSortBy]
    var SortOrder: js.UndefOr[SortOrder]
    var StatusEquals: js.UndefOr[EdgePackagingJobStatus]
  }

  object ListEdgePackagingJobsRequest {
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[ListMaxResults] = js.undefined,
        ModelNameContains: js.UndefOr[NameContains] = js.undefined,
        NameContains: js.UndefOr[NameContains] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[ListEdgePackagingJobsSortBy] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined,
        StatusEquals: js.UndefOr[EdgePackagingJobStatus] = js.undefined
    ): ListEdgePackagingJobsRequest = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeAfter.foreach(__v => __obj.updateDynamic("LastModifiedTimeAfter")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeBefore.foreach(__v => __obj.updateDynamic("LastModifiedTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      ModelNameContains.foreach(__v => __obj.updateDynamic("ModelNameContains")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      StatusEquals.foreach(__v => __obj.updateDynamic("StatusEquals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEdgePackagingJobsRequest]
    }
  }

  @js.native
  trait ListEdgePackagingJobsResponse extends js.Object {
    var EdgePackagingJobSummaries: EdgePackagingJobSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEdgePackagingJobsResponse {
    @inline
    def apply(
        EdgePackagingJobSummaries: EdgePackagingJobSummaries,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEdgePackagingJobsResponse = {
      val __obj = js.Dynamic.literal(
        "EdgePackagingJobSummaries" -> EdgePackagingJobSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEdgePackagingJobsResponse]
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
  trait ListFeatureGroupsRequest extends js.Object {
    var CreationTimeAfter: js.UndefOr[CreationTime]
    var CreationTimeBefore: js.UndefOr[CreationTime]
    var FeatureGroupStatusEquals: js.UndefOr[FeatureGroupStatus]
    var MaxResults: js.UndefOr[FeatureGroupMaxResults]
    var NameContains: js.UndefOr[FeatureGroupNameContains]
    var NextToken: js.UndefOr[NextToken]
    var OfflineStoreStatusEquals: js.UndefOr[OfflineStoreStatusValue]
    var SortBy: js.UndefOr[FeatureGroupSortBy]
    var SortOrder: js.UndefOr[FeatureGroupSortOrder]
  }

  object ListFeatureGroupsRequest {
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined,
        CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined,
        FeatureGroupStatusEquals: js.UndefOr[FeatureGroupStatus] = js.undefined,
        MaxResults: js.UndefOr[FeatureGroupMaxResults] = js.undefined,
        NameContains: js.UndefOr[FeatureGroupNameContains] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        OfflineStoreStatusEquals: js.UndefOr[OfflineStoreStatusValue] = js.undefined,
        SortBy: js.UndefOr[FeatureGroupSortBy] = js.undefined,
        SortOrder: js.UndefOr[FeatureGroupSortOrder] = js.undefined
    ): ListFeatureGroupsRequest = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      FeatureGroupStatusEquals.foreach(__v => __obj.updateDynamic("FeatureGroupStatusEquals")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OfflineStoreStatusEquals.foreach(__v => __obj.updateDynamic("OfflineStoreStatusEquals")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFeatureGroupsRequest]
    }
  }

  @js.native
  trait ListFeatureGroupsResponse extends js.Object {
    var FeatureGroupSummaries: FeatureGroupSummaries
    var NextToken: NextToken
  }

  object ListFeatureGroupsResponse {
    @inline
    def apply(
        FeatureGroupSummaries: FeatureGroupSummaries,
        NextToken: NextToken
    ): ListFeatureGroupsResponse = {
      val __obj = js.Dynamic.literal(
        "FeatureGroupSummaries" -> FeatureGroupSummaries.asInstanceOf[js.Any],
        "NextToken" -> NextToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListFeatureGroupsResponse]
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
  trait ListImageVersionsRequest extends js.Object {
    var ImageName: ImageName
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var LastModifiedTimeAfter: js.UndefOr[Timestamp]
    var LastModifiedTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[ImageVersionSortBy]
    var SortOrder: js.UndefOr[ImageVersionSortOrder]
  }

  object ListImageVersionsRequest {
    @inline
    def apply(
        ImageName: ImageName,
        CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[ImageVersionSortBy] = js.undefined,
        SortOrder: js.UndefOr[ImageVersionSortOrder] = js.undefined
    ): ListImageVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "ImageName" -> ImageName.asInstanceOf[js.Any]
      )

      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeAfter.foreach(__v => __obj.updateDynamic("LastModifiedTimeAfter")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeBefore.foreach(__v => __obj.updateDynamic("LastModifiedTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImageVersionsRequest]
    }
  }

  @js.native
  trait ListImageVersionsResponse extends js.Object {
    var ImageVersions: js.UndefOr[ImageVersions]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListImageVersionsResponse {
    @inline
    def apply(
        ImageVersions: js.UndefOr[ImageVersions] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListImageVersionsResponse = {
      val __obj = js.Dynamic.literal()
      ImageVersions.foreach(__v => __obj.updateDynamic("ImageVersions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImageVersionsResponse]
    }
  }

  @js.native
  trait ListImagesRequest extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var LastModifiedTimeAfter: js.UndefOr[Timestamp]
    var LastModifiedTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[ImageNameContains]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[ImageSortBy]
    var SortOrder: js.UndefOr[ImageSortOrder]
  }

  object ListImagesRequest {
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[ImageNameContains] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[ImageSortBy] = js.undefined,
        SortOrder: js.UndefOr[ImageSortOrder] = js.undefined
    ): ListImagesRequest = {
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
      __obj.asInstanceOf[ListImagesRequest]
    }
  }

  @js.native
  trait ListImagesResponse extends js.Object {
    var Images: js.UndefOr[Images]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListImagesResponse {
    @inline
    def apply(
        Images: js.UndefOr[Images] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListImagesResponse = {
      val __obj = js.Dynamic.literal()
      Images.foreach(__v => __obj.updateDynamic("Images")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImagesResponse]
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
  trait ListModelBiasJobDefinitionsRequest extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var EndpointName: js.UndefOr[EndpointName]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[NameContains]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[MonitoringJobDefinitionSortKey]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListModelBiasJobDefinitionsRequest {
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        EndpointName: js.UndefOr[EndpointName] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[NameContains] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[MonitoringJobDefinitionSortKey] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListModelBiasJobDefinitionsRequest = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      EndpointName.foreach(__v => __obj.updateDynamic("EndpointName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListModelBiasJobDefinitionsRequest]
    }
  }

  @js.native
  trait ListModelBiasJobDefinitionsResponse extends js.Object {
    var JobDefinitionSummaries: MonitoringJobDefinitionSummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListModelBiasJobDefinitionsResponse {
    @inline
    def apply(
        JobDefinitionSummaries: MonitoringJobDefinitionSummaryList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListModelBiasJobDefinitionsResponse = {
      val __obj = js.Dynamic.literal(
        "JobDefinitionSummaries" -> JobDefinitionSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListModelBiasJobDefinitionsResponse]
    }
  }

  @js.native
  trait ListModelExplainabilityJobDefinitionsRequest extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var EndpointName: js.UndefOr[EndpointName]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[NameContains]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[MonitoringJobDefinitionSortKey]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListModelExplainabilityJobDefinitionsRequest {
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        EndpointName: js.UndefOr[EndpointName] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[NameContains] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[MonitoringJobDefinitionSortKey] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListModelExplainabilityJobDefinitionsRequest = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      EndpointName.foreach(__v => __obj.updateDynamic("EndpointName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListModelExplainabilityJobDefinitionsRequest]
    }
  }

  @js.native
  trait ListModelExplainabilityJobDefinitionsResponse extends js.Object {
    var JobDefinitionSummaries: MonitoringJobDefinitionSummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListModelExplainabilityJobDefinitionsResponse {
    @inline
    def apply(
        JobDefinitionSummaries: MonitoringJobDefinitionSummaryList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListModelExplainabilityJobDefinitionsResponse = {
      val __obj = js.Dynamic.literal(
        "JobDefinitionSummaries" -> JobDefinitionSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListModelExplainabilityJobDefinitionsResponse]
    }
  }

  @js.native
  trait ListModelPackageGroupsInput extends js.Object {
    var CreationTimeAfter: js.UndefOr[CreationTime]
    var CreationTimeBefore: js.UndefOr[CreationTime]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[NameContains]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[ModelPackageGroupSortBy]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListModelPackageGroupsInput {
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined,
        CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[NameContains] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[ModelPackageGroupSortBy] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListModelPackageGroupsInput = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListModelPackageGroupsInput]
    }
  }

  @js.native
  trait ListModelPackageGroupsOutput extends js.Object {
    var ModelPackageGroupSummaryList: ModelPackageGroupSummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListModelPackageGroupsOutput {
    @inline
    def apply(
        ModelPackageGroupSummaryList: ModelPackageGroupSummaryList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListModelPackageGroupsOutput = {
      val __obj = js.Dynamic.literal(
        "ModelPackageGroupSummaryList" -> ModelPackageGroupSummaryList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListModelPackageGroupsOutput]
    }
  }

  @js.native
  trait ListModelPackagesInput extends js.Object {
    var CreationTimeAfter: js.UndefOr[CreationTime]
    var CreationTimeBefore: js.UndefOr[CreationTime]
    var MaxResults: js.UndefOr[MaxResults]
    var ModelApprovalStatus: js.UndefOr[ModelApprovalStatus]
    var ModelPackageGroupName: js.UndefOr[ArnOrName]
    var ModelPackageType: js.UndefOr[ModelPackageType]
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
        ModelApprovalStatus: js.UndefOr[ModelApprovalStatus] = js.undefined,
        ModelPackageGroupName: js.UndefOr[ArnOrName] = js.undefined,
        ModelPackageType: js.UndefOr[ModelPackageType] = js.undefined,
        NameContains: js.UndefOr[NameContains] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[ModelPackageSortBy] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListModelPackagesInput = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      ModelApprovalStatus.foreach(__v => __obj.updateDynamic("ModelApprovalStatus")(__v.asInstanceOf[js.Any]))
      ModelPackageGroupName.foreach(__v => __obj.updateDynamic("ModelPackageGroupName")(__v.asInstanceOf[js.Any]))
      ModelPackageType.foreach(__v => __obj.updateDynamic("ModelPackageType")(__v.asInstanceOf[js.Any]))
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
  trait ListModelQualityJobDefinitionsRequest extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var EndpointName: js.UndefOr[EndpointName]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[NameContains]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[MonitoringJobDefinitionSortKey]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListModelQualityJobDefinitionsRequest {
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        EndpointName: js.UndefOr[EndpointName] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[NameContains] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[MonitoringJobDefinitionSortKey] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListModelQualityJobDefinitionsRequest = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      EndpointName.foreach(__v => __obj.updateDynamic("EndpointName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListModelQualityJobDefinitionsRequest]
    }
  }

  @js.native
  trait ListModelQualityJobDefinitionsResponse extends js.Object {
    var JobDefinitionSummaries: MonitoringJobDefinitionSummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListModelQualityJobDefinitionsResponse {
    @inline
    def apply(
        JobDefinitionSummaries: MonitoringJobDefinitionSummaryList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListModelQualityJobDefinitionsResponse = {
      val __obj = js.Dynamic.literal(
        "JobDefinitionSummaries" -> JobDefinitionSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListModelQualityJobDefinitionsResponse]
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
    var MonitoringJobDefinitionName: js.UndefOr[MonitoringJobDefinitionName]
    var MonitoringScheduleName: js.UndefOr[MonitoringScheduleName]
    var MonitoringTypeEquals: js.UndefOr[MonitoringType]
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
        MonitoringJobDefinitionName: js.UndefOr[MonitoringJobDefinitionName] = js.undefined,
        MonitoringScheduleName: js.UndefOr[MonitoringScheduleName] = js.undefined,
        MonitoringTypeEquals: js.UndefOr[MonitoringType] = js.undefined,
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
      MonitoringJobDefinitionName.foreach(__v => __obj.updateDynamic("MonitoringJobDefinitionName")(__v.asInstanceOf[js.Any]))
      MonitoringScheduleName.foreach(__v => __obj.updateDynamic("MonitoringScheduleName")(__v.asInstanceOf[js.Any]))
      MonitoringTypeEquals.foreach(__v => __obj.updateDynamic("MonitoringTypeEquals")(__v.asInstanceOf[js.Any]))
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
    var MonitoringJobDefinitionName: js.UndefOr[MonitoringJobDefinitionName]
    var MonitoringTypeEquals: js.UndefOr[MonitoringType]
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
        MonitoringJobDefinitionName: js.UndefOr[MonitoringJobDefinitionName] = js.undefined,
        MonitoringTypeEquals: js.UndefOr[MonitoringType] = js.undefined,
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
      MonitoringJobDefinitionName.foreach(__v => __obj.updateDynamic("MonitoringJobDefinitionName")(__v.asInstanceOf[js.Any]))
      MonitoringTypeEquals.foreach(__v => __obj.updateDynamic("MonitoringTypeEquals")(__v.asInstanceOf[js.Any]))
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
      NotebookInstanceLifecycleConfigs.foreach(__v => __obj.updateDynamic("NotebookInstanceLifecycleConfigs")(__v.asInstanceOf[js.Any]))
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
      AdditionalCodeRepositoryEquals.foreach(__v => __obj.updateDynamic("AdditionalCodeRepositoryEquals")(__v.asInstanceOf[js.Any]))
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      DefaultCodeRepositoryContains.foreach(__v => __obj.updateDynamic("DefaultCodeRepositoryContains")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeAfter.foreach(__v => __obj.updateDynamic("LastModifiedTimeAfter")(__v.asInstanceOf[js.Any]))
      LastModifiedTimeBefore.foreach(__v => __obj.updateDynamic("LastModifiedTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      NotebookInstanceLifecycleConfigNameContains.foreach(__v => __obj.updateDynamic("NotebookInstanceLifecycleConfigNameContains")(__v.asInstanceOf[js.Any]))
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
  trait ListPipelineExecutionStepsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var PipelineExecutionArn: js.UndefOr[PipelineExecutionArn]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListPipelineExecutionStepsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PipelineExecutionArn: js.UndefOr[PipelineExecutionArn] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListPipelineExecutionStepsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PipelineExecutionArn.foreach(__v => __obj.updateDynamic("PipelineExecutionArn")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelineExecutionStepsRequest]
    }
  }

  @js.native
  trait ListPipelineExecutionStepsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PipelineExecutionSteps: js.UndefOr[PipelineExecutionStepList]
  }

  object ListPipelineExecutionStepsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PipelineExecutionSteps: js.UndefOr[PipelineExecutionStepList] = js.undefined
    ): ListPipelineExecutionStepsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PipelineExecutionSteps.foreach(__v => __obj.updateDynamic("PipelineExecutionSteps")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelineExecutionStepsResponse]
    }
  }

  @js.native
  trait ListPipelineExecutionsRequest extends js.Object {
    var PipelineName: PipelineName
    var CreatedAfter: js.UndefOr[Timestamp]
    var CreatedBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[SortPipelineExecutionsBy]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListPipelineExecutionsRequest {
    @inline
    def apply(
        PipelineName: PipelineName,
        CreatedAfter: js.UndefOr[Timestamp] = js.undefined,
        CreatedBefore: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[SortPipelineExecutionsBy] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListPipelineExecutionsRequest = {
      val __obj = js.Dynamic.literal(
        "PipelineName" -> PipelineName.asInstanceOf[js.Any]
      )

      CreatedAfter.foreach(__v => __obj.updateDynamic("CreatedAfter")(__v.asInstanceOf[js.Any]))
      CreatedBefore.foreach(__v => __obj.updateDynamic("CreatedBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelineExecutionsRequest]
    }
  }

  @js.native
  trait ListPipelineExecutionsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PipelineExecutionSummaries: js.UndefOr[PipelineExecutionSummaryList]
  }

  object ListPipelineExecutionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PipelineExecutionSummaries: js.UndefOr[PipelineExecutionSummaryList] = js.undefined
    ): ListPipelineExecutionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PipelineExecutionSummaries.foreach(__v => __obj.updateDynamic("PipelineExecutionSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelineExecutionsResponse]
    }
  }

  @js.native
  trait ListPipelineParametersForExecutionRequest extends js.Object {
    var PipelineExecutionArn: PipelineExecutionArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPipelineParametersForExecutionRequest {
    @inline
    def apply(
        PipelineExecutionArn: PipelineExecutionArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPipelineParametersForExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "PipelineExecutionArn" -> PipelineExecutionArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelineParametersForExecutionRequest]
    }
  }

  @js.native
  trait ListPipelineParametersForExecutionResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PipelineParameters: js.UndefOr[ParameterList]
  }

  object ListPipelineParametersForExecutionResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PipelineParameters: js.UndefOr[ParameterList] = js.undefined
    ): ListPipelineParametersForExecutionResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PipelineParameters.foreach(__v => __obj.updateDynamic("PipelineParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelineParametersForExecutionResponse]
    }
  }

  @js.native
  trait ListPipelinesRequest extends js.Object {
    var CreatedAfter: js.UndefOr[Timestamp]
    var CreatedBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var PipelineNamePrefix: js.UndefOr[PipelineName]
    var SortBy: js.UndefOr[SortPipelinesBy]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListPipelinesRequest {
    @inline
    def apply(
        CreatedAfter: js.UndefOr[Timestamp] = js.undefined,
        CreatedBefore: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PipelineNamePrefix: js.UndefOr[PipelineName] = js.undefined,
        SortBy: js.UndefOr[SortPipelinesBy] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListPipelinesRequest = {
      val __obj = js.Dynamic.literal()
      CreatedAfter.foreach(__v => __obj.updateDynamic("CreatedAfter")(__v.asInstanceOf[js.Any]))
      CreatedBefore.foreach(__v => __obj.updateDynamic("CreatedBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PipelineNamePrefix.foreach(__v => __obj.updateDynamic("PipelineNamePrefix")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelinesRequest]
    }
  }

  @js.native
  trait ListPipelinesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PipelineSummaries: js.UndefOr[PipelineSummaryList]
  }

  object ListPipelinesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PipelineSummaries: js.UndefOr[PipelineSummaryList] = js.undefined
    ): ListPipelinesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PipelineSummaries.foreach(__v => __obj.updateDynamic("PipelineSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelinesResponse]
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
  trait ListProjectsInput extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[ProjectEntityName]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[ProjectSortBy]
    var SortOrder: js.UndefOr[ProjectSortOrder]
  }

  object ListProjectsInput {
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[ProjectEntityName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[ProjectSortBy] = js.undefined,
        SortOrder: js.UndefOr[ProjectSortOrder] = js.undefined
    ): ListProjectsInput = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectsInput]
    }
  }

  @js.native
  trait ListProjectsOutput extends js.Object {
    var ProjectSummaryList: ProjectSummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListProjectsOutput {
    @inline
    def apply(
        ProjectSummaryList: ProjectSummaryList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListProjectsOutput = {
      val __obj = js.Dynamic.literal(
        "ProjectSummaryList" -> ProjectSummaryList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectsOutput]
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
  trait ListWorkforcesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[WorkforceName]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[ListWorkforcesSortByOptions]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListWorkforcesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[WorkforceName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[ListWorkforcesSortByOptions] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListWorkforcesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkforcesRequest]
    }
  }

  @js.native
  trait ListWorkforcesResponse extends js.Object {
    var Workforces: Workforces
    var NextToken: js.UndefOr[NextToken]
  }

  object ListWorkforcesResponse {
    @inline
    def apply(
        Workforces: Workforces,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListWorkforcesResponse = {
      val __obj = js.Dynamic.literal(
        "Workforces" -> Workforces.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkforcesResponse]
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

  /** Defines an Amazon Cognito or your own OIDC IdP user group that is part of a work team.
    */
  @js.native
  trait MemberDefinition extends js.Object {
    var CognitoMemberDefinition: js.UndefOr[CognitoMemberDefinition]
    var OidcMemberDefinition: js.UndefOr[OidcMemberDefinition]
  }

  object MemberDefinition {
    @inline
    def apply(
        CognitoMemberDefinition: js.UndefOr[CognitoMemberDefinition] = js.undefined,
        OidcMemberDefinition: js.UndefOr[OidcMemberDefinition] = js.undefined
    ): MemberDefinition = {
      val __obj = js.Dynamic.literal()
      CognitoMemberDefinition.foreach(__v => __obj.updateDynamic("CognitoMemberDefinition")(__v.asInstanceOf[js.Any]))
      OidcMemberDefinition.foreach(__v => __obj.updateDynamic("OidcMemberDefinition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemberDefinition]
    }
  }

  /** Metadata properties of the tracking entity, trial, or trial component.
    */
  @js.native
  trait MetadataProperties extends js.Object {
    var CommitId: js.UndefOr[MetadataPropertyValue]
    var GeneratedBy: js.UndefOr[MetadataPropertyValue]
    var ProjectId: js.UndefOr[MetadataPropertyValue]
    var Repository: js.UndefOr[MetadataPropertyValue]
  }

  object MetadataProperties {
    @inline
    def apply(
        CommitId: js.UndefOr[MetadataPropertyValue] = js.undefined,
        GeneratedBy: js.UndefOr[MetadataPropertyValue] = js.undefined,
        ProjectId: js.UndefOr[MetadataPropertyValue] = js.undefined,
        Repository: js.UndefOr[MetadataPropertyValue] = js.undefined
    ): MetadataProperties = {
      val __obj = js.Dynamic.literal()
      CommitId.foreach(__v => __obj.updateDynamic("CommitId")(__v.asInstanceOf[js.Any]))
      GeneratedBy.foreach(__v => __obj.updateDynamic("GeneratedBy")(__v.asInstanceOf[js.Any]))
      ProjectId.foreach(__v => __obj.updateDynamic("ProjectId")(__v.asInstanceOf[js.Any]))
      Repository.foreach(__v => __obj.updateDynamic("Repository")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetadataProperties]
    }
  }

  /** The name, value, and date and time of a metric that was emitted to Amazon CloudWatch.
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

  /** Specifies a metric that the training algorithm writes to <code>stderr</code> or <code>stdout</code> . Amazon SageMakerhyperparameter tuning captures all defined metrics. You specify one metric that a hyperparameter tuning job uses as its objective metric to choose the best training job.
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
        "Name" -> Name.asInstanceOf[js.Any],
        "Regex" -> Regex.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MetricDefinition]
    }
  }

  /** <p/>
    */
  @js.native
  trait MetricsSource extends js.Object {
    var ContentType: ContentType
    var S3Uri: S3Uri
    var ContentDigest: js.UndefOr[ContentDigest]
  }

  object MetricsSource {
    @inline
    def apply(
        ContentType: ContentType,
        S3Uri: S3Uri,
        ContentDigest: js.UndefOr[ContentDigest] = js.undefined
    ): MetricsSource = {
      val __obj = js.Dynamic.literal(
        "ContentType" -> ContentType.asInstanceOf[js.Any],
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )

      ContentDigest.foreach(__v => __obj.updateDynamic("ContentDigest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricsSource]
    }
  }

  /** Provides information about the location that is configured for storing model artifacts. Model artifacts are the output that results from training a model, and typically consist of trained parameters, a model defintion that desribes how to compute inferences, and other metadata.
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

  /** Docker container image configuration object for the model bias job.
    */
  @js.native
  trait ModelBiasAppSpecification extends js.Object {
    var ConfigUri: S3Uri
    var ImageUri: ImageUri
    var Environment: js.UndefOr[MonitoringEnvironmentMap]
  }

  object ModelBiasAppSpecification {
    @inline
    def apply(
        ConfigUri: S3Uri,
        ImageUri: ImageUri,
        Environment: js.UndefOr[MonitoringEnvironmentMap] = js.undefined
    ): ModelBiasAppSpecification = {
      val __obj = js.Dynamic.literal(
        "ConfigUri" -> ConfigUri.asInstanceOf[js.Any],
        "ImageUri" -> ImageUri.asInstanceOf[js.Any]
      )

      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelBiasAppSpecification]
    }
  }

  /** The configuration for a baseline model bias job.
    */
  @js.native
  trait ModelBiasBaselineConfig extends js.Object {
    var BaseliningJobName: js.UndefOr[ProcessingJobName]
    var ConstraintsResource: js.UndefOr[MonitoringConstraintsResource]
  }

  object ModelBiasBaselineConfig {
    @inline
    def apply(
        BaseliningJobName: js.UndefOr[ProcessingJobName] = js.undefined,
        ConstraintsResource: js.UndefOr[MonitoringConstraintsResource] = js.undefined
    ): ModelBiasBaselineConfig = {
      val __obj = js.Dynamic.literal()
      BaseliningJobName.foreach(__v => __obj.updateDynamic("BaseliningJobName")(__v.asInstanceOf[js.Any]))
      ConstraintsResource.foreach(__v => __obj.updateDynamic("ConstraintsResource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelBiasBaselineConfig]
    }
  }

  /** Inputs for the model bias job.
    */
  @js.native
  trait ModelBiasJobInput extends js.Object {
    var EndpointInput: EndpointInput
    var GroundTruthS3Input: MonitoringGroundTruthS3Input
  }

  object ModelBiasJobInput {
    @inline
    def apply(
        EndpointInput: EndpointInput,
        GroundTruthS3Input: MonitoringGroundTruthS3Input
    ): ModelBiasJobInput = {
      val __obj = js.Dynamic.literal(
        "EndpointInput" -> EndpointInput.asInstanceOf[js.Any],
        "GroundTruthS3Input" -> GroundTruthS3Input.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ModelBiasJobInput]
    }
  }

  /** Configures the timeout and maximum number of retries for processing a transform job invocation.
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
      InvocationsTimeoutInSeconds.foreach(__v => __obj.updateDynamic("InvocationsTimeoutInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelClientConfig]
    }
  }

  /** Data quality constraints and statistics for a model.
    */
  @js.native
  trait ModelDataQuality extends js.Object {
    var Constraints: js.UndefOr[MetricsSource]
    var Statistics: js.UndefOr[MetricsSource]
  }

  object ModelDataQuality {
    @inline
    def apply(
        Constraints: js.UndefOr[MetricsSource] = js.undefined,
        Statistics: js.UndefOr[MetricsSource] = js.undefined
    ): ModelDataQuality = {
      val __obj = js.Dynamic.literal()
      Constraints.foreach(__v => __obj.updateDynamic("Constraints")(__v.asInstanceOf[js.Any]))
      Statistics.foreach(__v => __obj.updateDynamic("Statistics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelDataQuality]
    }
  }

  /** Provides information to verify the integrity of stored model artifacts.
    */
  @js.native
  trait ModelDigests extends js.Object {
    var ArtifactDigest: js.UndefOr[ArtifactDigest]
  }

  object ModelDigests {
    @inline
    def apply(
        ArtifactDigest: js.UndefOr[ArtifactDigest] = js.undefined
    ): ModelDigests = {
      val __obj = js.Dynamic.literal()
      ArtifactDigest.foreach(__v => __obj.updateDynamic("ArtifactDigest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelDigests]
    }
  }

  /** Docker container image configuration object for the model explainability job.
    */
  @js.native
  trait ModelExplainabilityAppSpecification extends js.Object {
    var ConfigUri: S3Uri
    var ImageUri: ImageUri
    var Environment: js.UndefOr[MonitoringEnvironmentMap]
  }

  object ModelExplainabilityAppSpecification {
    @inline
    def apply(
        ConfigUri: S3Uri,
        ImageUri: ImageUri,
        Environment: js.UndefOr[MonitoringEnvironmentMap] = js.undefined
    ): ModelExplainabilityAppSpecification = {
      val __obj = js.Dynamic.literal(
        "ConfigUri" -> ConfigUri.asInstanceOf[js.Any],
        "ImageUri" -> ImageUri.asInstanceOf[js.Any]
      )

      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelExplainabilityAppSpecification]
    }
  }

  /** The configuration for a baseline model explainability job.
    */
  @js.native
  trait ModelExplainabilityBaselineConfig extends js.Object {
    var BaseliningJobName: js.UndefOr[ProcessingJobName]
    var ConstraintsResource: js.UndefOr[MonitoringConstraintsResource]
  }

  object ModelExplainabilityBaselineConfig {
    @inline
    def apply(
        BaseliningJobName: js.UndefOr[ProcessingJobName] = js.undefined,
        ConstraintsResource: js.UndefOr[MonitoringConstraintsResource] = js.undefined
    ): ModelExplainabilityBaselineConfig = {
      val __obj = js.Dynamic.literal()
      BaseliningJobName.foreach(__v => __obj.updateDynamic("BaseliningJobName")(__v.asInstanceOf[js.Any]))
      ConstraintsResource.foreach(__v => __obj.updateDynamic("ConstraintsResource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelExplainabilityBaselineConfig]
    }
  }

  /** Inputs for the model explainability job.
    */
  @js.native
  trait ModelExplainabilityJobInput extends js.Object {
    var EndpointInput: EndpointInput
  }

  object ModelExplainabilityJobInput {
    @inline
    def apply(
        EndpointInput: EndpointInput
    ): ModelExplainabilityJobInput = {
      val __obj = js.Dynamic.literal(
        "EndpointInput" -> EndpointInput.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ModelExplainabilityJobInput]
    }
  }

  /** Contains metrics captured from a model.
    */
  @js.native
  trait ModelMetrics extends js.Object {
    var Bias: js.UndefOr[Bias]
    var Explainability: js.UndefOr[Explainability]
    var ModelDataQuality: js.UndefOr[ModelDataQuality]
    var ModelQuality: js.UndefOr[ModelQuality]
  }

  object ModelMetrics {
    @inline
    def apply(
        Bias: js.UndefOr[Bias] = js.undefined,
        Explainability: js.UndefOr[Explainability] = js.undefined,
        ModelDataQuality: js.UndefOr[ModelDataQuality] = js.undefined,
        ModelQuality: js.UndefOr[ModelQuality] = js.undefined
    ): ModelMetrics = {
      val __obj = js.Dynamic.literal()
      Bias.foreach(__v => __obj.updateDynamic("Bias")(__v.asInstanceOf[js.Any]))
      Explainability.foreach(__v => __obj.updateDynamic("Explainability")(__v.asInstanceOf[js.Any]))
      ModelDataQuality.foreach(__v => __obj.updateDynamic("ModelDataQuality")(__v.asInstanceOf[js.Any]))
      ModelQuality.foreach(__v => __obj.updateDynamic("ModelQuality")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelMetrics]
    }
  }

  /** A versioned model that can be deployed for SageMaker inference.
    */
  @js.native
  trait ModelPackage extends js.Object {
    var ApprovalDescription: js.UndefOr[ApprovalDescription]
    var CertifyForMarketplace: js.UndefOr[CertifyForMarketplace]
    var CreatedBy: js.UndefOr[UserContext]
    var CreationTime: js.UndefOr[CreationTime]
    var InferenceSpecification: js.UndefOr[InferenceSpecification]
    var LastModifiedBy: js.UndefOr[UserContext]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var MetadataProperties: js.UndefOr[MetadataProperties]
    var ModelApprovalStatus: js.UndefOr[ModelApprovalStatus]
    var ModelMetrics: js.UndefOr[ModelMetrics]
    var ModelPackageArn: js.UndefOr[ModelPackageArn]
    var ModelPackageDescription: js.UndefOr[EntityDescription]
    var ModelPackageGroupName: js.UndefOr[EntityName]
    var ModelPackageName: js.UndefOr[EntityName]
    var ModelPackageStatus: js.UndefOr[ModelPackageStatus]
    var ModelPackageStatusDetails: js.UndefOr[ModelPackageStatusDetails]
    var ModelPackageVersion: js.UndefOr[ModelPackageVersion]
    var SourceAlgorithmSpecification: js.UndefOr[SourceAlgorithmSpecification]
    var Tags: js.UndefOr[TagList]
    var ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification]
  }

  object ModelPackage {
    @inline
    def apply(
        ApprovalDescription: js.UndefOr[ApprovalDescription] = js.undefined,
        CertifyForMarketplace: js.UndefOr[CertifyForMarketplace] = js.undefined,
        CreatedBy: js.UndefOr[UserContext] = js.undefined,
        CreationTime: js.UndefOr[CreationTime] = js.undefined,
        InferenceSpecification: js.UndefOr[InferenceSpecification] = js.undefined,
        LastModifiedBy: js.UndefOr[UserContext] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        MetadataProperties: js.UndefOr[MetadataProperties] = js.undefined,
        ModelApprovalStatus: js.UndefOr[ModelApprovalStatus] = js.undefined,
        ModelMetrics: js.UndefOr[ModelMetrics] = js.undefined,
        ModelPackageArn: js.UndefOr[ModelPackageArn] = js.undefined,
        ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined,
        ModelPackageGroupName: js.UndefOr[EntityName] = js.undefined,
        ModelPackageName: js.UndefOr[EntityName] = js.undefined,
        ModelPackageStatus: js.UndefOr[ModelPackageStatus] = js.undefined,
        ModelPackageStatusDetails: js.UndefOr[ModelPackageStatusDetails] = js.undefined,
        ModelPackageVersion: js.UndefOr[ModelPackageVersion] = js.undefined,
        SourceAlgorithmSpecification: js.UndefOr[SourceAlgorithmSpecification] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification] = js.undefined
    ): ModelPackage = {
      val __obj = js.Dynamic.literal()
      ApprovalDescription.foreach(__v => __obj.updateDynamic("ApprovalDescription")(__v.asInstanceOf[js.Any]))
      CertifyForMarketplace.foreach(__v => __obj.updateDynamic("CertifyForMarketplace")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      InferenceSpecification.foreach(__v => __obj.updateDynamic("InferenceSpecification")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      MetadataProperties.foreach(__v => __obj.updateDynamic("MetadataProperties")(__v.asInstanceOf[js.Any]))
      ModelApprovalStatus.foreach(__v => __obj.updateDynamic("ModelApprovalStatus")(__v.asInstanceOf[js.Any]))
      ModelMetrics.foreach(__v => __obj.updateDynamic("ModelMetrics")(__v.asInstanceOf[js.Any]))
      ModelPackageArn.foreach(__v => __obj.updateDynamic("ModelPackageArn")(__v.asInstanceOf[js.Any]))
      ModelPackageDescription.foreach(__v => __obj.updateDynamic("ModelPackageDescription")(__v.asInstanceOf[js.Any]))
      ModelPackageGroupName.foreach(__v => __obj.updateDynamic("ModelPackageGroupName")(__v.asInstanceOf[js.Any]))
      ModelPackageName.foreach(__v => __obj.updateDynamic("ModelPackageName")(__v.asInstanceOf[js.Any]))
      ModelPackageStatus.foreach(__v => __obj.updateDynamic("ModelPackageStatus")(__v.asInstanceOf[js.Any]))
      ModelPackageStatusDetails.foreach(__v => __obj.updateDynamic("ModelPackageStatusDetails")(__v.asInstanceOf[js.Any]))
      ModelPackageVersion.foreach(__v => __obj.updateDynamic("ModelPackageVersion")(__v.asInstanceOf[js.Any]))
      SourceAlgorithmSpecification.foreach(__v => __obj.updateDynamic("SourceAlgorithmSpecification")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      ValidationSpecification.foreach(__v => __obj.updateDynamic("ValidationSpecification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelPackage]
    }
  }

  /** Describes the Docker container for the model package.
    */
  @js.native
  trait ModelPackageContainerDefinition extends js.Object {
    var Image: ContainerImage
    var ContainerHostname: js.UndefOr[ContainerHostname]
    var ImageDigest: js.UndefOr[ImageDigest]
    var ModelDataUrl: js.UndefOr[Url]
    var ProductId: js.UndefOr[ProductId]
  }

  object ModelPackageContainerDefinition {
    @inline
    def apply(
        Image: ContainerImage,
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

  /** A group of versioned models in the model registry.
    */
  @js.native
  trait ModelPackageGroup extends js.Object {
    var CreatedBy: js.UndefOr[UserContext]
    var CreationTime: js.UndefOr[CreationTime]
    var ModelPackageGroupArn: js.UndefOr[ModelPackageGroupArn]
    var ModelPackageGroupDescription: js.UndefOr[EntityDescription]
    var ModelPackageGroupName: js.UndefOr[EntityName]
    var ModelPackageGroupStatus: js.UndefOr[ModelPackageGroupStatus]
    var Tags: js.UndefOr[TagList]
  }

  object ModelPackageGroup {
    @inline
    def apply(
        CreatedBy: js.UndefOr[UserContext] = js.undefined,
        CreationTime: js.UndefOr[CreationTime] = js.undefined,
        ModelPackageGroupArn: js.UndefOr[ModelPackageGroupArn] = js.undefined,
        ModelPackageGroupDescription: js.UndefOr[EntityDescription] = js.undefined,
        ModelPackageGroupName: js.UndefOr[EntityName] = js.undefined,
        ModelPackageGroupStatus: js.UndefOr[ModelPackageGroupStatus] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ModelPackageGroup = {
      val __obj = js.Dynamic.literal()
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      ModelPackageGroupArn.foreach(__v => __obj.updateDynamic("ModelPackageGroupArn")(__v.asInstanceOf[js.Any]))
      ModelPackageGroupDescription.foreach(__v => __obj.updateDynamic("ModelPackageGroupDescription")(__v.asInstanceOf[js.Any]))
      ModelPackageGroupName.foreach(__v => __obj.updateDynamic("ModelPackageGroupName")(__v.asInstanceOf[js.Any]))
      ModelPackageGroupStatus.foreach(__v => __obj.updateDynamic("ModelPackageGroupStatus")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelPackageGroup]
    }
  }

  /** Summary information about a model group.
    */
  @js.native
  trait ModelPackageGroupSummary extends js.Object {
    var CreationTime: CreationTime
    var ModelPackageGroupArn: ModelPackageGroupArn
    var ModelPackageGroupName: EntityName
    var ModelPackageGroupStatus: ModelPackageGroupStatus
    var ModelPackageGroupDescription: js.UndefOr[EntityDescription]
  }

  object ModelPackageGroupSummary {
    @inline
    def apply(
        CreationTime: CreationTime,
        ModelPackageGroupArn: ModelPackageGroupArn,
        ModelPackageGroupName: EntityName,
        ModelPackageGroupStatus: ModelPackageGroupStatus,
        ModelPackageGroupDescription: js.UndefOr[EntityDescription] = js.undefined
    ): ModelPackageGroupSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ModelPackageGroupArn" -> ModelPackageGroupArn.asInstanceOf[js.Any],
        "ModelPackageGroupName" -> ModelPackageGroupName.asInstanceOf[js.Any],
        "ModelPackageGroupStatus" -> ModelPackageGroupStatus.asInstanceOf[js.Any]
      )

      ModelPackageGroupDescription.foreach(__v => __obj.updateDynamic("ModelPackageGroupDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelPackageGroupSummary]
    }
  }

  /** Specifies the validation and image scan statuses of the model package.
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

  /** Represents the overall status of a model package.
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
        "Name" -> Name.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelPackageStatusItem]
    }
  }

  /** Provides summary information about a model package.
    */
  @js.native
  trait ModelPackageSummary extends js.Object {
    var CreationTime: CreationTime
    var ModelPackageArn: ModelPackageArn
    var ModelPackageName: EntityName
    var ModelPackageStatus: ModelPackageStatus
    var ModelApprovalStatus: js.UndefOr[ModelApprovalStatus]
    var ModelPackageDescription: js.UndefOr[EntityDescription]
    var ModelPackageGroupName: js.UndefOr[EntityName]
    var ModelPackageVersion: js.UndefOr[ModelPackageVersion]
  }

  object ModelPackageSummary {
    @inline
    def apply(
        CreationTime: CreationTime,
        ModelPackageArn: ModelPackageArn,
        ModelPackageName: EntityName,
        ModelPackageStatus: ModelPackageStatus,
        ModelApprovalStatus: js.UndefOr[ModelApprovalStatus] = js.undefined,
        ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined,
        ModelPackageGroupName: js.UndefOr[EntityName] = js.undefined,
        ModelPackageVersion: js.UndefOr[ModelPackageVersion] = js.undefined
    ): ModelPackageSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ModelPackageArn" -> ModelPackageArn.asInstanceOf[js.Any],
        "ModelPackageName" -> ModelPackageName.asInstanceOf[js.Any],
        "ModelPackageStatus" -> ModelPackageStatus.asInstanceOf[js.Any]
      )

      ModelApprovalStatus.foreach(__v => __obj.updateDynamic("ModelApprovalStatus")(__v.asInstanceOf[js.Any]))
      ModelPackageDescription.foreach(__v => __obj.updateDynamic("ModelPackageDescription")(__v.asInstanceOf[js.Any]))
      ModelPackageGroupName.foreach(__v => __obj.updateDynamic("ModelPackageGroupName")(__v.asInstanceOf[js.Any]))
      ModelPackageVersion.foreach(__v => __obj.updateDynamic("ModelPackageVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelPackageSummary]
    }
  }

  /** Contains data, such as the inputs and targeted instance types that are used in the process of validating the model package. The data provided in the validation profile is made available to your buyers on AWS Marketplace.
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
        "ProfileName" -> ProfileName.asInstanceOf[js.Any],
        "TransformJobDefinition" -> TransformJobDefinition.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ModelPackageValidationProfile]
    }
  }

  /** Specifies batch transform jobs that Amazon SageMaker runs to validate your model package.
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
        "ValidationRole" -> ValidationRole.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ModelPackageValidationSpecification]
    }
  }

  /** Model quality statistics and constraints.
    */
  @js.native
  trait ModelQuality extends js.Object {
    var Constraints: js.UndefOr[MetricsSource]
    var Statistics: js.UndefOr[MetricsSource]
  }

  object ModelQuality {
    @inline
    def apply(
        Constraints: js.UndefOr[MetricsSource] = js.undefined,
        Statistics: js.UndefOr[MetricsSource] = js.undefined
    ): ModelQuality = {
      val __obj = js.Dynamic.literal()
      Constraints.foreach(__v => __obj.updateDynamic("Constraints")(__v.asInstanceOf[js.Any]))
      Statistics.foreach(__v => __obj.updateDynamic("Statistics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelQuality]
    }
  }

  /** Container image configuration object for the monitoring job.
    */
  @js.native
  trait ModelQualityAppSpecification extends js.Object {
    var ImageUri: ImageUri
    var ContainerArguments: js.UndefOr[MonitoringContainerArguments]
    var ContainerEntrypoint: js.UndefOr[ContainerEntrypoint]
    var Environment: js.UndefOr[MonitoringEnvironmentMap]
    var PostAnalyticsProcessorSourceUri: js.UndefOr[S3Uri]
    var ProblemType: js.UndefOr[MonitoringProblemType]
    var RecordPreprocessorSourceUri: js.UndefOr[S3Uri]
  }

  object ModelQualityAppSpecification {
    @inline
    def apply(
        ImageUri: ImageUri,
        ContainerArguments: js.UndefOr[MonitoringContainerArguments] = js.undefined,
        ContainerEntrypoint: js.UndefOr[ContainerEntrypoint] = js.undefined,
        Environment: js.UndefOr[MonitoringEnvironmentMap] = js.undefined,
        PostAnalyticsProcessorSourceUri: js.UndefOr[S3Uri] = js.undefined,
        ProblemType: js.UndefOr[MonitoringProblemType] = js.undefined,
        RecordPreprocessorSourceUri: js.UndefOr[S3Uri] = js.undefined
    ): ModelQualityAppSpecification = {
      val __obj = js.Dynamic.literal(
        "ImageUri" -> ImageUri.asInstanceOf[js.Any]
      )

      ContainerArguments.foreach(__v => __obj.updateDynamic("ContainerArguments")(__v.asInstanceOf[js.Any]))
      ContainerEntrypoint.foreach(__v => __obj.updateDynamic("ContainerEntrypoint")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      PostAnalyticsProcessorSourceUri.foreach(__v => __obj.updateDynamic("PostAnalyticsProcessorSourceUri")(__v.asInstanceOf[js.Any]))
      ProblemType.foreach(__v => __obj.updateDynamic("ProblemType")(__v.asInstanceOf[js.Any]))
      RecordPreprocessorSourceUri.foreach(__v => __obj.updateDynamic("RecordPreprocessorSourceUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelQualityAppSpecification]
    }
  }

  /** Configuration for monitoring constraints and monitoring statistics. These baseline resources are compared against the results of the current job from the series of jobs scheduled to collect data periodically.
    */
  @js.native
  trait ModelQualityBaselineConfig extends js.Object {
    var BaseliningJobName: js.UndefOr[ProcessingJobName]
    var ConstraintsResource: js.UndefOr[MonitoringConstraintsResource]
  }

  object ModelQualityBaselineConfig {
    @inline
    def apply(
        BaseliningJobName: js.UndefOr[ProcessingJobName] = js.undefined,
        ConstraintsResource: js.UndefOr[MonitoringConstraintsResource] = js.undefined
    ): ModelQualityBaselineConfig = {
      val __obj = js.Dynamic.literal()
      BaseliningJobName.foreach(__v => __obj.updateDynamic("BaseliningJobName")(__v.asInstanceOf[js.Any]))
      ConstraintsResource.foreach(__v => __obj.updateDynamic("ConstraintsResource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelQualityBaselineConfig]
    }
  }

  /** The input for the model quality monitoring job. Currently endponts are supported for input for model quality monitoring jobs.
    */
  @js.native
  trait ModelQualityJobInput extends js.Object {
    var EndpointInput: EndpointInput
    var GroundTruthS3Input: MonitoringGroundTruthS3Input
  }

  object ModelQualityJobInput {
    @inline
    def apply(
        EndpointInput: EndpointInput,
        GroundTruthS3Input: MonitoringGroundTruthS3Input
    ): ModelQualityJobInput = {
      val __obj = js.Dynamic.literal(
        "EndpointInput" -> EndpointInput.asInstanceOf[js.Any],
        "GroundTruthS3Input" -> GroundTruthS3Input.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ModelQualityJobInput]
    }
  }

  /** Metadata for Model steps.
    */
  @js.native
  trait ModelStepMetadata extends js.Object {
    var Arn: js.UndefOr[String256]
  }

  object ModelStepMetadata {
    @inline
    def apply(
        Arn: js.UndefOr[String256] = js.undefined
    ): ModelStepMetadata = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelStepMetadata]
    }
  }

  /** Provides summary information about a model.
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
        "ModelArn" -> ModelArn.asInstanceOf[js.Any],
        "ModelName" -> ModelName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ModelSummary]
    }
  }

  /** Container image configuration object for the monitoring job.
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
      PostAnalyticsProcessorSourceUri.foreach(__v => __obj.updateDynamic("PostAnalyticsProcessorSourceUri")(__v.asInstanceOf[js.Any]))
      RecordPreprocessorSourceUri.foreach(__v => __obj.updateDynamic("RecordPreprocessorSourceUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringAppSpecification]
    }
  }

  /** Configuration for monitoring constraints and monitoring statistics. These baseline resources are compared against the results of the current job from the series of jobs scheduled to collect data periodically.
    */
  @js.native
  trait MonitoringBaselineConfig extends js.Object {
    var BaseliningJobName: js.UndefOr[ProcessingJobName]
    var ConstraintsResource: js.UndefOr[MonitoringConstraintsResource]
    var StatisticsResource: js.UndefOr[MonitoringStatisticsResource]
  }

  object MonitoringBaselineConfig {
    @inline
    def apply(
        BaseliningJobName: js.UndefOr[ProcessingJobName] = js.undefined,
        ConstraintsResource: js.UndefOr[MonitoringConstraintsResource] = js.undefined,
        StatisticsResource: js.UndefOr[MonitoringStatisticsResource] = js.undefined
    ): MonitoringBaselineConfig = {
      val __obj = js.Dynamic.literal()
      BaseliningJobName.foreach(__v => __obj.updateDynamic("BaseliningJobName")(__v.asInstanceOf[js.Any]))
      ConstraintsResource.foreach(__v => __obj.updateDynamic("ConstraintsResource")(__v.asInstanceOf[js.Any]))
      StatisticsResource.foreach(__v => __obj.updateDynamic("StatisticsResource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringBaselineConfig]
    }
  }

  /** Configuration for the cluster used to run model monitoring jobs.
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
        "InstanceCount" -> InstanceCount.asInstanceOf[js.Any],
        "InstanceType" -> InstanceType.asInstanceOf[js.Any],
        "VolumeSizeInGB" -> VolumeSizeInGB.asInstanceOf[js.Any]
      )

      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringClusterConfig]
    }
  }

  /** The constraints resource for a monitoring job.
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

  /** Summary of information about the last monitoring job to run.
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
    var MonitoringJobDefinitionName: js.UndefOr[MonitoringJobDefinitionName]
    var MonitoringType: js.UndefOr[MonitoringType]
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
        MonitoringJobDefinitionName: js.UndefOr[MonitoringJobDefinitionName] = js.undefined,
        MonitoringType: js.UndefOr[MonitoringType] = js.undefined,
        ProcessingJobArn: js.UndefOr[ProcessingJobArn] = js.undefined
    ): MonitoringExecutionSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "MonitoringExecutionStatus" -> MonitoringExecutionStatus.asInstanceOf[js.Any],
        "MonitoringScheduleName" -> MonitoringScheduleName.asInstanceOf[js.Any],
        "ScheduledTime" -> ScheduledTime.asInstanceOf[js.Any]
      )

      EndpointName.foreach(__v => __obj.updateDynamic("EndpointName")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      MonitoringJobDefinitionName.foreach(__v => __obj.updateDynamic("MonitoringJobDefinitionName")(__v.asInstanceOf[js.Any]))
      MonitoringType.foreach(__v => __obj.updateDynamic("MonitoringType")(__v.asInstanceOf[js.Any]))
      ProcessingJobArn.foreach(__v => __obj.updateDynamic("ProcessingJobArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringExecutionSummary]
    }
  }

  /** The ground truth labels for the dataset used for the monitoring job.
    */
  @js.native
  trait MonitoringGroundTruthS3Input extends js.Object {
    var S3Uri: js.UndefOr[MonitoringS3Uri]
  }

  object MonitoringGroundTruthS3Input {
    @inline
    def apply(
        S3Uri: js.UndefOr[MonitoringS3Uri] = js.undefined
    ): MonitoringGroundTruthS3Input = {
      val __obj = js.Dynamic.literal()
      S3Uri.foreach(__v => __obj.updateDynamic("S3Uri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringGroundTruthS3Input]
    }
  }

  /** The inputs for a monitoring job.
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

  /** Defines the monitoring job.
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
        "MonitoringInputs" -> MonitoringInputs.asInstanceOf[js.Any],
        "MonitoringOutputConfig" -> MonitoringOutputConfig.asInstanceOf[js.Any],
        "MonitoringResources" -> MonitoringResources.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      BaselineConfig.foreach(__v => __obj.updateDynamic("BaselineConfig")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      NetworkConfig.foreach(__v => __obj.updateDynamic("NetworkConfig")(__v.asInstanceOf[js.Any]))
      StoppingCondition.foreach(__v => __obj.updateDynamic("StoppingCondition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringJobDefinition]
    }
  }

  /** Summary information about a monitoring job.
    */
  @js.native
  trait MonitoringJobDefinitionSummary extends js.Object {
    var CreationTime: Timestamp
    var EndpointName: EndpointName
    var MonitoringJobDefinitionArn: MonitoringJobDefinitionArn
    var MonitoringJobDefinitionName: MonitoringJobDefinitionName
  }

  object MonitoringJobDefinitionSummary {
    @inline
    def apply(
        CreationTime: Timestamp,
        EndpointName: EndpointName,
        MonitoringJobDefinitionArn: MonitoringJobDefinitionArn,
        MonitoringJobDefinitionName: MonitoringJobDefinitionName
    ): MonitoringJobDefinitionSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "EndpointName" -> EndpointName.asInstanceOf[js.Any],
        "MonitoringJobDefinitionArn" -> MonitoringJobDefinitionArn.asInstanceOf[js.Any],
        "MonitoringJobDefinitionName" -> MonitoringJobDefinitionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MonitoringJobDefinitionSummary]
    }
  }

  /** The networking configuration for the monitoring job.
    */
  @js.native
  trait MonitoringNetworkConfig extends js.Object {
    var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean]
    var EnableNetworkIsolation: js.UndefOr[Boolean]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object MonitoringNetworkConfig {
    @inline
    def apply(
        EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined,
        EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): MonitoringNetworkConfig = {
      val __obj = js.Dynamic.literal()
      EnableInterContainerTrafficEncryption.foreach(__v => __obj.updateDynamic("EnableInterContainerTrafficEncryption")(__v.asInstanceOf[js.Any]))
      EnableNetworkIsolation.foreach(__v => __obj.updateDynamic("EnableNetworkIsolation")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringNetworkConfig]
    }
  }

  /** The output object for a monitoring job.
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

  /** The output configuration for monitoring jobs.
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

  /** Identifies the resources to deploy for a monitoring job.
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

  /** Information about where and how you want to store the results of a monitoring job.
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
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )

      S3UploadMode.foreach(__v => __obj.updateDynamic("S3UploadMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringS3Output]
    }
  }

  /** A schedule for a model monitoring job. For information about model monitor, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor.html|Amazon SageMaker Model Monitor]].
    */
  @js.native
  trait MonitoringSchedule extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var EndpointName: js.UndefOr[EndpointName]
    var FailureReason: js.UndefOr[FailureReason]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var LastMonitoringExecutionSummary: js.UndefOr[MonitoringExecutionSummary]
    var MonitoringScheduleArn: js.UndefOr[MonitoringScheduleArn]
    var MonitoringScheduleConfig: js.UndefOr[MonitoringScheduleConfig]
    var MonitoringScheduleName: js.UndefOr[MonitoringScheduleName]
    var MonitoringScheduleStatus: js.UndefOr[ScheduleStatus]
    var MonitoringType: js.UndefOr[MonitoringType]
    var Tags: js.UndefOr[TagList]
  }

  object MonitoringSchedule {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        EndpointName: js.UndefOr[EndpointName] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        LastMonitoringExecutionSummary: js.UndefOr[MonitoringExecutionSummary] = js.undefined,
        MonitoringScheduleArn: js.UndefOr[MonitoringScheduleArn] = js.undefined,
        MonitoringScheduleConfig: js.UndefOr[MonitoringScheduleConfig] = js.undefined,
        MonitoringScheduleName: js.UndefOr[MonitoringScheduleName] = js.undefined,
        MonitoringScheduleStatus: js.UndefOr[ScheduleStatus] = js.undefined,
        MonitoringType: js.UndefOr[MonitoringType] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): MonitoringSchedule = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      EndpointName.foreach(__v => __obj.updateDynamic("EndpointName")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      LastMonitoringExecutionSummary.foreach(__v => __obj.updateDynamic("LastMonitoringExecutionSummary")(__v.asInstanceOf[js.Any]))
      MonitoringScheduleArn.foreach(__v => __obj.updateDynamic("MonitoringScheduleArn")(__v.asInstanceOf[js.Any]))
      MonitoringScheduleConfig.foreach(__v => __obj.updateDynamic("MonitoringScheduleConfig")(__v.asInstanceOf[js.Any]))
      MonitoringScheduleName.foreach(__v => __obj.updateDynamic("MonitoringScheduleName")(__v.asInstanceOf[js.Any]))
      MonitoringScheduleStatus.foreach(__v => __obj.updateDynamic("MonitoringScheduleStatus")(__v.asInstanceOf[js.Any]))
      MonitoringType.foreach(__v => __obj.updateDynamic("MonitoringType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringSchedule]
    }
  }

  /** Configures the monitoring schedule and defines the monitoring job.
    */
  @js.native
  trait MonitoringScheduleConfig extends js.Object {
    var MonitoringJobDefinition: js.UndefOr[MonitoringJobDefinition]
    var MonitoringJobDefinitionName: js.UndefOr[MonitoringJobDefinitionName]
    var MonitoringType: js.UndefOr[MonitoringType]
    var ScheduleConfig: js.UndefOr[ScheduleConfig]
  }

  object MonitoringScheduleConfig {
    @inline
    def apply(
        MonitoringJobDefinition: js.UndefOr[MonitoringJobDefinition] = js.undefined,
        MonitoringJobDefinitionName: js.UndefOr[MonitoringJobDefinitionName] = js.undefined,
        MonitoringType: js.UndefOr[MonitoringType] = js.undefined,
        ScheduleConfig: js.UndefOr[ScheduleConfig] = js.undefined
    ): MonitoringScheduleConfig = {
      val __obj = js.Dynamic.literal()
      MonitoringJobDefinition.foreach(__v => __obj.updateDynamic("MonitoringJobDefinition")(__v.asInstanceOf[js.Any]))
      MonitoringJobDefinitionName.foreach(__v => __obj.updateDynamic("MonitoringJobDefinitionName")(__v.asInstanceOf[js.Any]))
      MonitoringType.foreach(__v => __obj.updateDynamic("MonitoringType")(__v.asInstanceOf[js.Any]))
      ScheduleConfig.foreach(__v => __obj.updateDynamic("ScheduleConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringScheduleConfig]
    }
  }

  /** Summarizes the monitoring schedule.
    */
  @js.native
  trait MonitoringScheduleSummary extends js.Object {
    var CreationTime: Timestamp
    var LastModifiedTime: Timestamp
    var MonitoringScheduleArn: MonitoringScheduleArn
    var MonitoringScheduleName: MonitoringScheduleName
    var MonitoringScheduleStatus: ScheduleStatus
    var EndpointName: js.UndefOr[EndpointName]
    var MonitoringJobDefinitionName: js.UndefOr[MonitoringJobDefinitionName]
    var MonitoringType: js.UndefOr[MonitoringType]
  }

  object MonitoringScheduleSummary {
    @inline
    def apply(
        CreationTime: Timestamp,
        LastModifiedTime: Timestamp,
        MonitoringScheduleArn: MonitoringScheduleArn,
        MonitoringScheduleName: MonitoringScheduleName,
        MonitoringScheduleStatus: ScheduleStatus,
        EndpointName: js.UndefOr[EndpointName] = js.undefined,
        MonitoringJobDefinitionName: js.UndefOr[MonitoringJobDefinitionName] = js.undefined,
        MonitoringType: js.UndefOr[MonitoringType] = js.undefined
    ): MonitoringScheduleSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "MonitoringScheduleArn" -> MonitoringScheduleArn.asInstanceOf[js.Any],
        "MonitoringScheduleName" -> MonitoringScheduleName.asInstanceOf[js.Any],
        "MonitoringScheduleStatus" -> MonitoringScheduleStatus.asInstanceOf[js.Any]
      )

      EndpointName.foreach(__v => __obj.updateDynamic("EndpointName")(__v.asInstanceOf[js.Any]))
      MonitoringJobDefinitionName.foreach(__v => __obj.updateDynamic("MonitoringJobDefinitionName")(__v.asInstanceOf[js.Any]))
      MonitoringType.foreach(__v => __obj.updateDynamic("MonitoringType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringScheduleSummary]
    }
  }

  /** The statistics resource for a monitoring job.
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

  /** A time limit for how long the monitoring job is allowed to run before stopping.
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

  /** Specifies additional configuration for hosting multi-model endpoints.
    */
  @js.native
  trait MultiModelConfig extends js.Object {
    var ModelCacheSetting: js.UndefOr[ModelCacheSetting]
  }

  object MultiModelConfig {
    @inline
    def apply(
        ModelCacheSetting: js.UndefOr[ModelCacheSetting] = js.undefined
    ): MultiModelConfig = {
      val __obj = js.Dynamic.literal()
      ModelCacheSetting.foreach(__v => __obj.updateDynamic("ModelCacheSetting")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MultiModelConfig]
    }
  }

  /** A list of nested <a>Filter</a> objects. A resource must satisfy the conditions of all filters to be included in the results returned from the <a>Search</a> API. For example, to filter on a training job's <code>InputDataConfig</code> property with a specific channel name and <code>S3Uri</code> prefix, define the following filters: * <code>'{Name:"InputDataConfig.ChannelName", "Operator":"Equals", "Value":"train"}',</code> * <code>'{Name:"InputDataConfig.DataSource.S3DataSource.S3Uri", "Operator":"Contains", "Value":"mybucket/catdata"}'</code>
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
        "Filters" -> Filters.asInstanceOf[js.Any],
        "NestedPropertyName" -> NestedPropertyName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NestedFilters]
    }
  }

  /** Networking options for a job, such as network traffic encryption between containers, whether to allow inbound and outbound network calls to and from containers, and the VPC subnets and security groups to use for VPC-enabled jobs.
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
      EnableInterContainerTrafficEncryption.foreach(__v => __obj.updateDynamic("EnableInterContainerTrafficEncryption")(__v.asInstanceOf[js.Any]))
      EnableNetworkIsolation.foreach(__v => __obj.updateDynamic("EnableNetworkIsolation")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkConfig]
    }
  }

  /** Provides a summary of a notebook instance lifecycle configuration.
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
        "NotebookInstanceLifecycleConfigArn" -> NotebookInstanceLifecycleConfigArn.asInstanceOf[js.Any],
        "NotebookInstanceLifecycleConfigName" -> NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any]
      )

      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotebookInstanceLifecycleConfigSummary]
    }
  }

  /** Contains the notebook instance lifecycle configuration script. Each lifecycle configuration script has a limit of 16384 characters. The value of the <code>PATH</code> environment variable that is available to both scripts is <code>/sbin:bin:/usr/sbin:/usr/bin</code>. View CloudWatch Logs for notebook instance lifecycle configurations in log group <code>/aws/sagemaker/NotebookInstances</code> in log stream <code>[notebook-instance-name]/[LifecycleConfigHook]</code>. Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes, it fails and the notebook instance is not created or started. For information about notebook instance lifestyle configurations, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html|Step 2.1: (Optional) Customize a Notebook Instance]].
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

  /** Provides summary information for an Amazon SageMaker notebook instance.
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
        "NotebookInstanceArn" -> NotebookInstanceArn.asInstanceOf[js.Any],
        "NotebookInstanceName" -> NotebookInstanceName.asInstanceOf[js.Any]
      )

      AdditionalCodeRepositories.foreach(__v => __obj.updateDynamic("AdditionalCodeRepositories")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DefaultCodeRepository.foreach(__v => __obj.updateDynamic("DefaultCodeRepository")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      NotebookInstanceLifecycleConfigName.foreach(__v => __obj.updateDynamic("NotebookInstanceLifecycleConfigName")(__v.asInstanceOf[js.Any]))
      NotebookInstanceStatus.foreach(__v => __obj.updateDynamic("NotebookInstanceStatus")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotebookInstanceSummary]
    }
  }

  /** Configures SNS notifications of available or expiring work items for work teams.
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

  /** Specifies the number of training jobs that this hyperparameter tuning job launched, categorized by the status of their objective metric. The objective metric status shows whether the final objective metric for the training job has been evaluated by the tuning job and used in the hyperparameter tuning process.
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

  /** The configuration of an <code>OfflineStore</code>. Provide an <code>OfflineStoreConfig</code> in a request to <code>CreateFeatureGroup</code> to create an <code>OfflineStore</code>. To encrypt an <code>OfflineStore</code> using at rest data encryption, specify AWS Key Management Service (KMS) key ID, or <code>KMSKeyId</code>, in <code>S3StorageConfig</code>.
    */
  @js.native
  trait OfflineStoreConfig extends js.Object {
    var S3StorageConfig: S3StorageConfig
    var DataCatalogConfig: js.UndefOr[DataCatalogConfig]
    var DisableGlueTableCreation: js.UndefOr[Boolean]
  }

  object OfflineStoreConfig {
    @inline
    def apply(
        S3StorageConfig: S3StorageConfig,
        DataCatalogConfig: js.UndefOr[DataCatalogConfig] = js.undefined,
        DisableGlueTableCreation: js.UndefOr[Boolean] = js.undefined
    ): OfflineStoreConfig = {
      val __obj = js.Dynamic.literal(
        "S3StorageConfig" -> S3StorageConfig.asInstanceOf[js.Any]
      )

      DataCatalogConfig.foreach(__v => __obj.updateDynamic("DataCatalogConfig")(__v.asInstanceOf[js.Any]))
      DisableGlueTableCreation.foreach(__v => __obj.updateDynamic("DisableGlueTableCreation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OfflineStoreConfig]
    }
  }

  /** The status of <code>OfflineStore</code>.
    */
  @js.native
  trait OfflineStoreStatus extends js.Object {
    var Status: OfflineStoreStatusValue
    var BlockedReason: js.UndefOr[BlockedReason]
  }

  object OfflineStoreStatus {
    @inline
    def apply(
        Status: OfflineStoreStatusValue,
        BlockedReason: js.UndefOr[BlockedReason] = js.undefined
    ): OfflineStoreStatus = {
      val __obj = js.Dynamic.literal(
        "Status" -> Status.asInstanceOf[js.Any]
      )

      BlockedReason.foreach(__v => __obj.updateDynamic("BlockedReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OfflineStoreStatus]
    }
  }

  /** Use this parameter to configure your OIDC Identity Provider (IdP).
    */
  @js.native
  trait OidcConfig extends js.Object {
    var AuthorizationEndpoint: OidcEndpoint
    var ClientId: ClientId
    var ClientSecret: ClientSecret
    var Issuer: OidcEndpoint
    var JwksUri: OidcEndpoint
    var LogoutEndpoint: OidcEndpoint
    var TokenEndpoint: OidcEndpoint
    var UserInfoEndpoint: OidcEndpoint
  }

  object OidcConfig {
    @inline
    def apply(
        AuthorizationEndpoint: OidcEndpoint,
        ClientId: ClientId,
        ClientSecret: ClientSecret,
        Issuer: OidcEndpoint,
        JwksUri: OidcEndpoint,
        LogoutEndpoint: OidcEndpoint,
        TokenEndpoint: OidcEndpoint,
        UserInfoEndpoint: OidcEndpoint
    ): OidcConfig = {
      val __obj = js.Dynamic.literal(
        "AuthorizationEndpoint" -> AuthorizationEndpoint.asInstanceOf[js.Any],
        "ClientId" -> ClientId.asInstanceOf[js.Any],
        "ClientSecret" -> ClientSecret.asInstanceOf[js.Any],
        "Issuer" -> Issuer.asInstanceOf[js.Any],
        "JwksUri" -> JwksUri.asInstanceOf[js.Any],
        "LogoutEndpoint" -> LogoutEndpoint.asInstanceOf[js.Any],
        "TokenEndpoint" -> TokenEndpoint.asInstanceOf[js.Any],
        "UserInfoEndpoint" -> UserInfoEndpoint.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OidcConfig]
    }
  }

  /** Your OIDC IdP workforce configuration.
    */
  @js.native
  trait OidcConfigForResponse extends js.Object {
    var AuthorizationEndpoint: js.UndefOr[OidcEndpoint]
    var ClientId: js.UndefOr[ClientId]
    var Issuer: js.UndefOr[OidcEndpoint]
    var JwksUri: js.UndefOr[OidcEndpoint]
    var LogoutEndpoint: js.UndefOr[OidcEndpoint]
    var TokenEndpoint: js.UndefOr[OidcEndpoint]
    var UserInfoEndpoint: js.UndefOr[OidcEndpoint]
  }

  object OidcConfigForResponse {
    @inline
    def apply(
        AuthorizationEndpoint: js.UndefOr[OidcEndpoint] = js.undefined,
        ClientId: js.UndefOr[ClientId] = js.undefined,
        Issuer: js.UndefOr[OidcEndpoint] = js.undefined,
        JwksUri: js.UndefOr[OidcEndpoint] = js.undefined,
        LogoutEndpoint: js.UndefOr[OidcEndpoint] = js.undefined,
        TokenEndpoint: js.UndefOr[OidcEndpoint] = js.undefined,
        UserInfoEndpoint: js.UndefOr[OidcEndpoint] = js.undefined
    ): OidcConfigForResponse = {
      val __obj = js.Dynamic.literal()
      AuthorizationEndpoint.foreach(__v => __obj.updateDynamic("AuthorizationEndpoint")(__v.asInstanceOf[js.Any]))
      ClientId.foreach(__v => __obj.updateDynamic("ClientId")(__v.asInstanceOf[js.Any]))
      Issuer.foreach(__v => __obj.updateDynamic("Issuer")(__v.asInstanceOf[js.Any]))
      JwksUri.foreach(__v => __obj.updateDynamic("JwksUri")(__v.asInstanceOf[js.Any]))
      LogoutEndpoint.foreach(__v => __obj.updateDynamic("LogoutEndpoint")(__v.asInstanceOf[js.Any]))
      TokenEndpoint.foreach(__v => __obj.updateDynamic("TokenEndpoint")(__v.asInstanceOf[js.Any]))
      UserInfoEndpoint.foreach(__v => __obj.updateDynamic("UserInfoEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OidcConfigForResponse]
    }
  }

  /** A list of user groups that exist in your OIDC Identity Provider (IdP). One to ten groups can be used to create a single private work team. When you add a user group to the list of <code>Groups</code>, you can add that user group to one or more private work teams. If you add a user group to a private work team, all workers in that user group are added to the work team.
    */
  @js.native
  trait OidcMemberDefinition extends js.Object {
    var Groups: Groups
  }

  object OidcMemberDefinition {
    @inline
    def apply(
        Groups: Groups
    ): OidcMemberDefinition = {
      val __obj = js.Dynamic.literal(
        "Groups" -> Groups.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OidcMemberDefinition]
    }
  }

  /** Use this to specify the AWS Key Management Service (KMS) Key ID, or <code>KMSKeyId</code>, for at rest data encryption. You can turn <code>OnlineStore</code> on or off by specifying the <code>EnableOnlineStore</code> flag at General Assembly; the default value is <code>False</code>.
    */
  @js.native
  trait OnlineStoreConfig extends js.Object {
    var EnableOnlineStore: js.UndefOr[Boolean]
    var SecurityConfig: js.UndefOr[OnlineStoreSecurityConfig]
  }

  object OnlineStoreConfig {
    @inline
    def apply(
        EnableOnlineStore: js.UndefOr[Boolean] = js.undefined,
        SecurityConfig: js.UndefOr[OnlineStoreSecurityConfig] = js.undefined
    ): OnlineStoreConfig = {
      val __obj = js.Dynamic.literal()
      EnableOnlineStore.foreach(__v => __obj.updateDynamic("EnableOnlineStore")(__v.asInstanceOf[js.Any]))
      SecurityConfig.foreach(__v => __obj.updateDynamic("SecurityConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OnlineStoreConfig]
    }
  }

  /** The security configuration for <code>OnlineStore</code>.
    */
  @js.native
  trait OnlineStoreSecurityConfig extends js.Object {
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object OnlineStoreSecurityConfig {
    @inline
    def apply(
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): OnlineStoreSecurityConfig = {
      val __obj = js.Dynamic.literal()
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OnlineStoreSecurityConfig]
    }
  }

  /** Contains information about the output location for the compiled model and the target device that the model runs on. <code>TargetDevice</code> and <code>TargetPlatform</code> are mutually exclusive, so you need to choose one between the two to specify your target device or platform. If you cannot find your device you want to use from the <code>TargetDevice</code> list, use <code>TargetPlatform</code> to describe the platform of your edge device and <code>CompilerOptions</code> if there are specific settings that are required or recommended to use for particular TargetPlatform.
    */
  @js.native
  trait OutputConfig extends js.Object {
    var S3OutputLocation: S3Uri
    var CompilerOptions: js.UndefOr[CompilerOptions]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var TargetDevice: js.UndefOr[TargetDevice]
    var TargetPlatform: js.UndefOr[TargetPlatform]
  }

  object OutputConfig {
    @inline
    def apply(
        S3OutputLocation: S3Uri,
        CompilerOptions: js.UndefOr[CompilerOptions] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        TargetDevice: js.UndefOr[TargetDevice] = js.undefined,
        TargetPlatform: js.UndefOr[TargetPlatform] = js.undefined
    ): OutputConfig = {
      val __obj = js.Dynamic.literal(
        "S3OutputLocation" -> S3OutputLocation.asInstanceOf[js.Any]
      )

      CompilerOptions.foreach(__v => __obj.updateDynamic("CompilerOptions")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      TargetDevice.foreach(__v => __obj.updateDynamic("TargetDevice")(__v.asInstanceOf[js.Any]))
      TargetPlatform.foreach(__v => __obj.updateDynamic("TargetPlatform")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputConfig]
    }
  }

  /** Provides information about how to store model training results (model artifacts).
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

  /** Assigns a value to a named Pipeline parameter.
    */
  @js.native
  trait Parameter extends js.Object {
    var Name: PipelineParameterName
    var Value: String1024
  }

  object Parameter {
    @inline
    def apply(
        Name: PipelineParameterName,
        Value: String1024
    ): Parameter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Parameter]
    }
  }

  /** Defines the possible values for categorical, continuous, and integer hyperparameters to be used by an algorithm.
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
      CategoricalParameterRangeSpecification.foreach(__v => __obj.updateDynamic("CategoricalParameterRangeSpecification")(__v.asInstanceOf[js.Any]))
      ContinuousParameterRangeSpecification.foreach(__v => __obj.updateDynamic("ContinuousParameterRangeSpecification")(__v.asInstanceOf[js.Any]))
      IntegerParameterRangeSpecification.foreach(__v => __obj.updateDynamic("IntegerParameterRangeSpecification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterRange]
    }
  }

  /** Specifies ranges of integer, continuous, and categorical hyperparameters that a hyperparameter tuning job searches. The hyperparameter tuning job launches training jobs with hyperparameter values within these ranges to find the combination of values that result in the training job with the best performance as measured by the objective metric of the hyperparameter tuning job.
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
      CategoricalParameterRanges.foreach(__v => __obj.updateDynamic("CategoricalParameterRanges")(__v.asInstanceOf[js.Any]))
      ContinuousParameterRanges.foreach(__v => __obj.updateDynamic("ContinuousParameterRanges")(__v.asInstanceOf[js.Any]))
      IntegerParameterRanges.foreach(__v => __obj.updateDynamic("IntegerParameterRanges")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterRanges]
    }
  }

  /** The trial that a trial component is associated with and the experiment the trial is part of. A component might not be associated with a trial. A component can be associated with multiple trials.
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

  /** A previously completed or stopped hyperparameter tuning job to be used as a starting point for a new hyperparameter tuning job.
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
      HyperParameterTuningJobName.foreach(__v => __obj.updateDynamic("HyperParameterTuningJobName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParentHyperParameterTuningJob]
    }
  }

  /** A SageMaker Model Building Pipeline instance.
    */
  @js.native
  trait Pipeline extends js.Object {
    var CreatedBy: js.UndefOr[UserContext]
    var CreationTime: js.UndefOr[Timestamp]
    var LastModifiedBy: js.UndefOr[UserContext]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var LastRunTime: js.UndefOr[Timestamp]
    var PipelineArn: js.UndefOr[PipelineArn]
    var PipelineDescription: js.UndefOr[PipelineDescription]
    var PipelineDisplayName: js.UndefOr[PipelineName]
    var PipelineName: js.UndefOr[PipelineName]
    var PipelineStatus: js.UndefOr[PipelineStatus]
    var RoleArn: js.UndefOr[RoleArn]
    var Tags: js.UndefOr[TagList]
  }

  object Pipeline {
    @inline
    def apply(
        CreatedBy: js.UndefOr[UserContext] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedBy: js.UndefOr[UserContext] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        LastRunTime: js.UndefOr[Timestamp] = js.undefined,
        PipelineArn: js.UndefOr[PipelineArn] = js.undefined,
        PipelineDescription: js.UndefOr[PipelineDescription] = js.undefined,
        PipelineDisplayName: js.UndefOr[PipelineName] = js.undefined,
        PipelineName: js.UndefOr[PipelineName] = js.undefined,
        PipelineStatus: js.UndefOr[PipelineStatus] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): Pipeline = {
      val __obj = js.Dynamic.literal()
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      LastRunTime.foreach(__v => __obj.updateDynamic("LastRunTime")(__v.asInstanceOf[js.Any]))
      PipelineArn.foreach(__v => __obj.updateDynamic("PipelineArn")(__v.asInstanceOf[js.Any]))
      PipelineDescription.foreach(__v => __obj.updateDynamic("PipelineDescription")(__v.asInstanceOf[js.Any]))
      PipelineDisplayName.foreach(__v => __obj.updateDynamic("PipelineDisplayName")(__v.asInstanceOf[js.Any]))
      PipelineName.foreach(__v => __obj.updateDynamic("PipelineName")(__v.asInstanceOf[js.Any]))
      PipelineStatus.foreach(__v => __obj.updateDynamic("PipelineStatus")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Pipeline]
    }
  }

  /** An execution of a pipeline.
    */
  @js.native
  trait PipelineExecution extends js.Object {
    var CreatedBy: js.UndefOr[UserContext]
    var CreationTime: js.UndefOr[Timestamp]
    var LastModifiedBy: js.UndefOr[UserContext]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var PipelineArn: js.UndefOr[PipelineArn]
    var PipelineExecutionArn: js.UndefOr[PipelineExecutionArn]
    var PipelineExecutionDescription: js.UndefOr[PipelineExecutionDescription]
    var PipelineExecutionDisplayName: js.UndefOr[PipelineExecutionName]
    var PipelineExecutionStatus: js.UndefOr[PipelineExecutionStatus]
    var PipelineParameters: js.UndefOr[ParameterList]
  }

  object PipelineExecution {
    @inline
    def apply(
        CreatedBy: js.UndefOr[UserContext] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedBy: js.UndefOr[UserContext] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        PipelineArn: js.UndefOr[PipelineArn] = js.undefined,
        PipelineExecutionArn: js.UndefOr[PipelineExecutionArn] = js.undefined,
        PipelineExecutionDescription: js.UndefOr[PipelineExecutionDescription] = js.undefined,
        PipelineExecutionDisplayName: js.UndefOr[PipelineExecutionName] = js.undefined,
        PipelineExecutionStatus: js.UndefOr[PipelineExecutionStatus] = js.undefined,
        PipelineParameters: js.UndefOr[ParameterList] = js.undefined
    ): PipelineExecution = {
      val __obj = js.Dynamic.literal()
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      PipelineArn.foreach(__v => __obj.updateDynamic("PipelineArn")(__v.asInstanceOf[js.Any]))
      PipelineExecutionArn.foreach(__v => __obj.updateDynamic("PipelineExecutionArn")(__v.asInstanceOf[js.Any]))
      PipelineExecutionDescription.foreach(__v => __obj.updateDynamic("PipelineExecutionDescription")(__v.asInstanceOf[js.Any]))
      PipelineExecutionDisplayName.foreach(__v => __obj.updateDynamic("PipelineExecutionDisplayName")(__v.asInstanceOf[js.Any]))
      PipelineExecutionStatus.foreach(__v => __obj.updateDynamic("PipelineExecutionStatus")(__v.asInstanceOf[js.Any]))
      PipelineParameters.foreach(__v => __obj.updateDynamic("PipelineParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineExecution]
    }
  }

  /** An execution of a step in a pipeline.
    */
  @js.native
  trait PipelineExecutionStep extends js.Object {
    var CacheHitResult: js.UndefOr[CacheHitResult]
    var EndTime: js.UndefOr[Timestamp]
    var FailureReason: js.UndefOr[FailureReason]
    var Metadata: js.UndefOr[PipelineExecutionStepMetadata]
    var StartTime: js.UndefOr[Timestamp]
    var StepName: js.UndefOr[StepName]
    var StepStatus: js.UndefOr[StepStatus]
  }

  object PipelineExecutionStep {
    @inline
    def apply(
        CacheHitResult: js.UndefOr[CacheHitResult] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        Metadata: js.UndefOr[PipelineExecutionStepMetadata] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined,
        StepName: js.UndefOr[StepName] = js.undefined,
        StepStatus: js.UndefOr[StepStatus] = js.undefined
    ): PipelineExecutionStep = {
      val __obj = js.Dynamic.literal()
      CacheHitResult.foreach(__v => __obj.updateDynamic("CacheHitResult")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      StepName.foreach(__v => __obj.updateDynamic("StepName")(__v.asInstanceOf[js.Any]))
      StepStatus.foreach(__v => __obj.updateDynamic("StepStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineExecutionStep]
    }
  }

  /** Metadata for a step execution.
    */
  @js.native
  trait PipelineExecutionStepMetadata extends js.Object {
    var Condition: js.UndefOr[ConditionStepMetadata]
    var Model: js.UndefOr[ModelStepMetadata]
    var ProcessingJob: js.UndefOr[ProcessingJobStepMetadata]
    var RegisterModel: js.UndefOr[RegisterModelStepMetadata]
    var TrainingJob: js.UndefOr[TrainingJobStepMetadata]
    var TransformJob: js.UndefOr[TransformJobStepMetadata]
  }

  object PipelineExecutionStepMetadata {
    @inline
    def apply(
        Condition: js.UndefOr[ConditionStepMetadata] = js.undefined,
        Model: js.UndefOr[ModelStepMetadata] = js.undefined,
        ProcessingJob: js.UndefOr[ProcessingJobStepMetadata] = js.undefined,
        RegisterModel: js.UndefOr[RegisterModelStepMetadata] = js.undefined,
        TrainingJob: js.UndefOr[TrainingJobStepMetadata] = js.undefined,
        TransformJob: js.UndefOr[TransformJobStepMetadata] = js.undefined
    ): PipelineExecutionStepMetadata = {
      val __obj = js.Dynamic.literal()
      Condition.foreach(__v => __obj.updateDynamic("Condition")(__v.asInstanceOf[js.Any]))
      Model.foreach(__v => __obj.updateDynamic("Model")(__v.asInstanceOf[js.Any]))
      ProcessingJob.foreach(__v => __obj.updateDynamic("ProcessingJob")(__v.asInstanceOf[js.Any]))
      RegisterModel.foreach(__v => __obj.updateDynamic("RegisterModel")(__v.asInstanceOf[js.Any]))
      TrainingJob.foreach(__v => __obj.updateDynamic("TrainingJob")(__v.asInstanceOf[js.Any]))
      TransformJob.foreach(__v => __obj.updateDynamic("TransformJob")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineExecutionStepMetadata]
    }
  }

  /** A pipeline execution summary.
    */
  @js.native
  trait PipelineExecutionSummary extends js.Object {
    var PipelineExecutionArn: js.UndefOr[PipelineExecutionArn]
    var PipelineExecutionDescription: js.UndefOr[PipelineExecutionDescription]
    var PipelineExecutionDisplayName: js.UndefOr[PipelineExecutionName]
    var PipelineExecutionStatus: js.UndefOr[PipelineExecutionStatus]
    var StartTime: js.UndefOr[Timestamp]
  }

  object PipelineExecutionSummary {
    @inline
    def apply(
        PipelineExecutionArn: js.UndefOr[PipelineExecutionArn] = js.undefined,
        PipelineExecutionDescription: js.UndefOr[PipelineExecutionDescription] = js.undefined,
        PipelineExecutionDisplayName: js.UndefOr[PipelineExecutionName] = js.undefined,
        PipelineExecutionStatus: js.UndefOr[PipelineExecutionStatus] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined
    ): PipelineExecutionSummary = {
      val __obj = js.Dynamic.literal()
      PipelineExecutionArn.foreach(__v => __obj.updateDynamic("PipelineExecutionArn")(__v.asInstanceOf[js.Any]))
      PipelineExecutionDescription.foreach(__v => __obj.updateDynamic("PipelineExecutionDescription")(__v.asInstanceOf[js.Any]))
      PipelineExecutionDisplayName.foreach(__v => __obj.updateDynamic("PipelineExecutionDisplayName")(__v.asInstanceOf[js.Any]))
      PipelineExecutionStatus.foreach(__v => __obj.updateDynamic("PipelineExecutionStatus")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineExecutionSummary]
    }
  }

  /** A summary of a pipeline.
    */
  @js.native
  trait PipelineSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var LastExecutionTime: js.UndefOr[Timestamp]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var PipelineArn: js.UndefOr[PipelineArn]
    var PipelineDescription: js.UndefOr[PipelineDescription]
    var PipelineDisplayName: js.UndefOr[PipelineName]
    var PipelineName: js.UndefOr[PipelineName]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object PipelineSummary {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastExecutionTime: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        PipelineArn: js.UndefOr[PipelineArn] = js.undefined,
        PipelineDescription: js.UndefOr[PipelineDescription] = js.undefined,
        PipelineDisplayName: js.UndefOr[PipelineName] = js.undefined,
        PipelineName: js.UndefOr[PipelineName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined
    ): PipelineSummary = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastExecutionTime.foreach(__v => __obj.updateDynamic("LastExecutionTime")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      PipelineArn.foreach(__v => __obj.updateDynamic("PipelineArn")(__v.asInstanceOf[js.Any]))
      PipelineDescription.foreach(__v => __obj.updateDynamic("PipelineDescription")(__v.asInstanceOf[js.Any]))
      PipelineDisplayName.foreach(__v => __obj.updateDynamic("PipelineDisplayName")(__v.asInstanceOf[js.Any]))
      PipelineName.foreach(__v => __obj.updateDynamic("PipelineName")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineSummary]
    }
  }

  /** Configuration for the cluster used to run a processing job.
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
        "InstanceCount" -> InstanceCount.asInstanceOf[js.Any],
        "InstanceType" -> InstanceType.asInstanceOf[js.Any],
        "VolumeSizeInGB" -> VolumeSizeInGB.asInstanceOf[js.Any]
      )

      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProcessingClusterConfig]
    }
  }

  /** Configuration for processing job outputs in Amazon SageMaker Feature Store.
    */
  @js.native
  trait ProcessingFeatureStoreOutput extends js.Object {
    var FeatureGroupName: FeatureGroupName
  }

  object ProcessingFeatureStoreOutput {
    @inline
    def apply(
        FeatureGroupName: FeatureGroupName
    ): ProcessingFeatureStoreOutput = {
      val __obj = js.Dynamic.literal(
        "FeatureGroupName" -> FeatureGroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ProcessingFeatureStoreOutput]
    }
  }

  /** The inputs for a processing job. The processing input must specify exactly one of either <code>S3Input</code> or <code>DatasetDefinition</code> types.
    */
  @js.native
  trait ProcessingInput extends js.Object {
    var InputName: String
    var AppManaged: js.UndefOr[AppManaged]
    var DatasetDefinition: js.UndefOr[DatasetDefinition]
    var S3Input: js.UndefOr[ProcessingS3Input]
  }

  object ProcessingInput {
    @inline
    def apply(
        InputName: String,
        AppManaged: js.UndefOr[AppManaged] = js.undefined,
        DatasetDefinition: js.UndefOr[DatasetDefinition] = js.undefined,
        S3Input: js.UndefOr[ProcessingS3Input] = js.undefined
    ): ProcessingInput = {
      val __obj = js.Dynamic.literal(
        "InputName" -> InputName.asInstanceOf[js.Any]
      )

      AppManaged.foreach(__v => __obj.updateDynamic("AppManaged")(__v.asInstanceOf[js.Any]))
      DatasetDefinition.foreach(__v => __obj.updateDynamic("DatasetDefinition")(__v.asInstanceOf[js.Any]))
      S3Input.foreach(__v => __obj.updateDynamic("S3Input")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProcessingInput]
    }
  }

  /** An Amazon SageMaker processing job that is used to analyze data and evaluate models. For more information, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/processing-job.html|Process Data and Evaluate Models]].
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

  /** Metadata for a processing job step.
    */
  @js.native
  trait ProcessingJobStepMetadata extends js.Object {
    var Arn: js.UndefOr[ProcessingJobArn]
  }

  object ProcessingJobStepMetadata {
    @inline
    def apply(
        Arn: js.UndefOr[ProcessingJobArn] = js.undefined
    ): ProcessingJobStepMetadata = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProcessingJobStepMetadata]
    }
  }

  /** Summary of information about a processing job.
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
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ProcessingJobArn" -> ProcessingJobArn.asInstanceOf[js.Any],
        "ProcessingJobName" -> ProcessingJobName.asInstanceOf[js.Any],
        "ProcessingJobStatus" -> ProcessingJobStatus.asInstanceOf[js.Any]
      )

      ExitMessage.foreach(__v => __obj.updateDynamic("ExitMessage")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      ProcessingEndTime.foreach(__v => __obj.updateDynamic("ProcessingEndTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProcessingJobSummary]
    }
  }

  /** Describes the results of a processing job. The processing output must specify exactly one of either <code>S3Output</code> or <code>FeatureStoreOutput</code> types.
    */
  @js.native
  trait ProcessingOutput extends js.Object {
    var OutputName: String
    var AppManaged: js.UndefOr[AppManaged]
    var FeatureStoreOutput: js.UndefOr[ProcessingFeatureStoreOutput]
    var S3Output: js.UndefOr[ProcessingS3Output]
  }

  object ProcessingOutput {
    @inline
    def apply(
        OutputName: String,
        AppManaged: js.UndefOr[AppManaged] = js.undefined,
        FeatureStoreOutput: js.UndefOr[ProcessingFeatureStoreOutput] = js.undefined,
        S3Output: js.UndefOr[ProcessingS3Output] = js.undefined
    ): ProcessingOutput = {
      val __obj = js.Dynamic.literal(
        "OutputName" -> OutputName.asInstanceOf[js.Any]
      )

      AppManaged.foreach(__v => __obj.updateDynamic("AppManaged")(__v.asInstanceOf[js.Any]))
      FeatureStoreOutput.foreach(__v => __obj.updateDynamic("FeatureStoreOutput")(__v.asInstanceOf[js.Any]))
      S3Output.foreach(__v => __obj.updateDynamic("S3Output")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProcessingOutput]
    }
  }

  /** Configuration for uploading output from the processing container.
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

  /** Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In distributed training, you specify more than one instance.
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

  /** Configuration for downloading input data from Amazon S3 into the processing container.
    */
  @js.native
  trait ProcessingS3Input extends js.Object {
    var S3DataType: ProcessingS3DataType
    var S3Uri: S3Uri
    var LocalPath: js.UndefOr[ProcessingLocalPath]
    var S3CompressionType: js.UndefOr[ProcessingS3CompressionType]
    var S3DataDistributionType: js.UndefOr[ProcessingS3DataDistributionType]
    var S3InputMode: js.UndefOr[ProcessingS3InputMode]
  }

  object ProcessingS3Input {
    @inline
    def apply(
        S3DataType: ProcessingS3DataType,
        S3Uri: S3Uri,
        LocalPath: js.UndefOr[ProcessingLocalPath] = js.undefined,
        S3CompressionType: js.UndefOr[ProcessingS3CompressionType] = js.undefined,
        S3DataDistributionType: js.UndefOr[ProcessingS3DataDistributionType] = js.undefined,
        S3InputMode: js.UndefOr[ProcessingS3InputMode] = js.undefined
    ): ProcessingS3Input = {
      val __obj = js.Dynamic.literal(
        "S3DataType" -> S3DataType.asInstanceOf[js.Any],
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )

      LocalPath.foreach(__v => __obj.updateDynamic("LocalPath")(__v.asInstanceOf[js.Any]))
      S3CompressionType.foreach(__v => __obj.updateDynamic("S3CompressionType")(__v.asInstanceOf[js.Any]))
      S3DataDistributionType.foreach(__v => __obj.updateDynamic("S3DataDistributionType")(__v.asInstanceOf[js.Any]))
      S3InputMode.foreach(__v => __obj.updateDynamic("S3InputMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProcessingS3Input]
    }
  }

  /** Configuration for uploading output data to Amazon S3 from the processing container.
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
        "LocalPath" -> LocalPath.asInstanceOf[js.Any],
        "S3UploadMode" -> S3UploadMode.asInstanceOf[js.Any],
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ProcessingS3Output]
    }
  }

  /** Configures conditions under which the processing job should be stopped, such as how long the processing job has been running. After the condition is met, the processing job is stopped.
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

  /** Identifies a model that you want to host and the resources to deploy for hosting it. If you are deploying multiple models, tell Amazon SageMaker how to distribute traffic among the models by specifying variant weights.
    */
  @js.native
  trait ProductionVariant extends js.Object {
    var InitialInstanceCount: TaskCount
    var InstanceType: ProductionVariantInstanceType
    var ModelName: ModelName
    var VariantName: VariantName
    var AcceleratorType: js.UndefOr[ProductionVariantAcceleratorType]
    var CoreDumpConfig: js.UndefOr[ProductionVariantCoreDumpConfig]
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
        CoreDumpConfig: js.UndefOr[ProductionVariantCoreDumpConfig] = js.undefined,
        InitialVariantWeight: js.UndefOr[VariantWeight] = js.undefined
    ): ProductionVariant = {
      val __obj = js.Dynamic.literal(
        "InitialInstanceCount" -> InitialInstanceCount.asInstanceOf[js.Any],
        "InstanceType" -> InstanceType.asInstanceOf[js.Any],
        "ModelName" -> ModelName.asInstanceOf[js.Any],
        "VariantName" -> VariantName.asInstanceOf[js.Any]
      )

      AcceleratorType.foreach(__v => __obj.updateDynamic("AcceleratorType")(__v.asInstanceOf[js.Any]))
      CoreDumpConfig.foreach(__v => __obj.updateDynamic("CoreDumpConfig")(__v.asInstanceOf[js.Any]))
      InitialVariantWeight.foreach(__v => __obj.updateDynamic("InitialVariantWeight")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProductionVariant]
    }
  }

  /** Specifies configuration for a core dump from the model container when the process crashes.
    */
  @js.native
  trait ProductionVariantCoreDumpConfig extends js.Object {
    var DestinationS3Uri: DestinationS3Uri
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object ProductionVariantCoreDumpConfig {
    @inline
    def apply(
        DestinationS3Uri: DestinationS3Uri,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): ProductionVariantCoreDumpConfig = {
      val __obj = js.Dynamic.literal(
        "DestinationS3Uri" -> DestinationS3Uri.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProductionVariantCoreDumpConfig]
    }
  }

  /** Describes weight and capacities for a production variant associated with an endpoint. If you sent a request to the <code>UpdateEndpointWeightsAndCapacities</code> API and the endpoint status is <code>Updating</code>, you get different desired and current values.
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

  /** Configuration information for Debugger system monitoring, framework profiling, and storage paths.
    */
  @js.native
  trait ProfilerConfig extends js.Object {
    var S3OutputPath: S3Uri
    var ProfilingIntervalInMilliseconds: js.UndefOr[ProfilingIntervalInMilliseconds]
    var ProfilingParameters: js.UndefOr[ProfilingParameters]
  }

  object ProfilerConfig {
    @inline
    def apply(
        S3OutputPath: S3Uri,
        ProfilingIntervalInMilliseconds: js.UndefOr[ProfilingIntervalInMilliseconds] = js.undefined,
        ProfilingParameters: js.UndefOr[ProfilingParameters] = js.undefined
    ): ProfilerConfig = {
      val __obj = js.Dynamic.literal(
        "S3OutputPath" -> S3OutputPath.asInstanceOf[js.Any]
      )

      ProfilingIntervalInMilliseconds.foreach(__v => __obj.updateDynamic("ProfilingIntervalInMilliseconds")(__v.asInstanceOf[js.Any]))
      ProfilingParameters.foreach(__v => __obj.updateDynamic("ProfilingParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProfilerConfig]
    }
  }

  /** Configuration information for updating the Debugger profile parameters, system and framework metrics configurations, and storage paths.
    */
  @js.native
  trait ProfilerConfigForUpdate extends js.Object {
    var DisableProfiler: js.UndefOr[DisableProfiler]
    var ProfilingIntervalInMilliseconds: js.UndefOr[ProfilingIntervalInMilliseconds]
    var ProfilingParameters: js.UndefOr[ProfilingParameters]
    var S3OutputPath: js.UndefOr[S3Uri]
  }

  object ProfilerConfigForUpdate {
    @inline
    def apply(
        DisableProfiler: js.UndefOr[DisableProfiler] = js.undefined,
        ProfilingIntervalInMilliseconds: js.UndefOr[ProfilingIntervalInMilliseconds] = js.undefined,
        ProfilingParameters: js.UndefOr[ProfilingParameters] = js.undefined,
        S3OutputPath: js.UndefOr[S3Uri] = js.undefined
    ): ProfilerConfigForUpdate = {
      val __obj = js.Dynamic.literal()
      DisableProfiler.foreach(__v => __obj.updateDynamic("DisableProfiler")(__v.asInstanceOf[js.Any]))
      ProfilingIntervalInMilliseconds.foreach(__v => __obj.updateDynamic("ProfilingIntervalInMilliseconds")(__v.asInstanceOf[js.Any]))
      ProfilingParameters.foreach(__v => __obj.updateDynamic("ProfilingParameters")(__v.asInstanceOf[js.Any]))
      S3OutputPath.foreach(__v => __obj.updateDynamic("S3OutputPath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProfilerConfigForUpdate]
    }
  }

  /** Configuration information for profiling rules.
    */
  @js.native
  trait ProfilerRuleConfiguration extends js.Object {
    var RuleConfigurationName: RuleConfigurationName
    var RuleEvaluatorImage: AlgorithmImage
    var InstanceType: js.UndefOr[ProcessingInstanceType]
    var LocalPath: js.UndefOr[DirectoryPath]
    var RuleParameters: js.UndefOr[RuleParameters]
    var S3OutputPath: js.UndefOr[S3Uri]
    var VolumeSizeInGB: js.UndefOr[OptionalVolumeSizeInGB]
  }

  object ProfilerRuleConfiguration {
    @inline
    def apply(
        RuleConfigurationName: RuleConfigurationName,
        RuleEvaluatorImage: AlgorithmImage,
        InstanceType: js.UndefOr[ProcessingInstanceType] = js.undefined,
        LocalPath: js.UndefOr[DirectoryPath] = js.undefined,
        RuleParameters: js.UndefOr[RuleParameters] = js.undefined,
        S3OutputPath: js.UndefOr[S3Uri] = js.undefined,
        VolumeSizeInGB: js.UndefOr[OptionalVolumeSizeInGB] = js.undefined
    ): ProfilerRuleConfiguration = {
      val __obj = js.Dynamic.literal(
        "RuleConfigurationName" -> RuleConfigurationName.asInstanceOf[js.Any],
        "RuleEvaluatorImage" -> RuleEvaluatorImage.asInstanceOf[js.Any]
      )

      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      LocalPath.foreach(__v => __obj.updateDynamic("LocalPath")(__v.asInstanceOf[js.Any]))
      RuleParameters.foreach(__v => __obj.updateDynamic("RuleParameters")(__v.asInstanceOf[js.Any]))
      S3OutputPath.foreach(__v => __obj.updateDynamic("S3OutputPath")(__v.asInstanceOf[js.Any]))
      VolumeSizeInGB.foreach(__v => __obj.updateDynamic("VolumeSizeInGB")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProfilerRuleConfiguration]
    }
  }

  /** Information about the status of the rule evaluation.
    */
  @js.native
  trait ProfilerRuleEvaluationStatus extends js.Object {
    var LastModifiedTime: js.UndefOr[Timestamp]
    var RuleConfigurationName: js.UndefOr[RuleConfigurationName]
    var RuleEvaluationJobArn: js.UndefOr[ProcessingJobArn]
    var RuleEvaluationStatus: js.UndefOr[RuleEvaluationStatus]
    var StatusDetails: js.UndefOr[StatusDetails]
  }

  object ProfilerRuleEvaluationStatus {
    @inline
    def apply(
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        RuleConfigurationName: js.UndefOr[RuleConfigurationName] = js.undefined,
        RuleEvaluationJobArn: js.UndefOr[ProcessingJobArn] = js.undefined,
        RuleEvaluationStatus: js.UndefOr[RuleEvaluationStatus] = js.undefined,
        StatusDetails: js.UndefOr[StatusDetails] = js.undefined
    ): ProfilerRuleEvaluationStatus = {
      val __obj = js.Dynamic.literal()
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      RuleConfigurationName.foreach(__v => __obj.updateDynamic("RuleConfigurationName")(__v.asInstanceOf[js.Any]))
      RuleEvaluationJobArn.foreach(__v => __obj.updateDynamic("RuleEvaluationJobArn")(__v.asInstanceOf[js.Any]))
      RuleEvaluationStatus.foreach(__v => __obj.updateDynamic("RuleEvaluationStatus")(__v.asInstanceOf[js.Any]))
      StatusDetails.foreach(__v => __obj.updateDynamic("StatusDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProfilerRuleEvaluationStatus]
    }
  }

  /** Information about a project.
    */
  @js.native
  trait ProjectSummary extends js.Object {
    var CreationTime: Timestamp
    var ProjectArn: ProjectArn
    var ProjectId: ProjectId
    var ProjectName: ProjectEntityName
    var ProjectStatus: ProjectStatus
    var ProjectDescription: js.UndefOr[EntityDescription]
  }

  object ProjectSummary {
    @inline
    def apply(
        CreationTime: Timestamp,
        ProjectArn: ProjectArn,
        ProjectId: ProjectId,
        ProjectName: ProjectEntityName,
        ProjectStatus: ProjectStatus,
        ProjectDescription: js.UndefOr[EntityDescription] = js.undefined
    ): ProjectSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ProjectArn" -> ProjectArn.asInstanceOf[js.Any],
        "ProjectId" -> ProjectId.asInstanceOf[js.Any],
        "ProjectName" -> ProjectName.asInstanceOf[js.Any],
        "ProjectStatus" -> ProjectStatus.asInstanceOf[js.Any]
      )

      ProjectDescription.foreach(__v => __obj.updateDynamic("ProjectDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectSummary]
    }
  }

  /** Part of the <code>SuggestionQuery</code> type. Specifies a hint for retrieving property names that begin with the specified text.
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

  /** A property name returned from a <code>GetSearchSuggestions</code> call that specifies a value in the <code>PropertyNameQuery</code> field.
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

  /** A key value pair used when you provision a project as a service catalog product. For information, see [[https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html|What is AWS Service Catalog]].
    */
  @js.native
  trait ProvisioningParameter extends js.Object {
    var Key: js.UndefOr[ProvisioningParameterKey]
    var Value: js.UndefOr[ProvisioningParameterValue]
  }

  object ProvisioningParameter {
    @inline
    def apply(
        Key: js.UndefOr[ProvisioningParameterKey] = js.undefined,
        Value: js.UndefOr[ProvisioningParameterValue] = js.undefined
    ): ProvisioningParameter = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisioningParameter]
    }
  }

  /** Defines the amount of money paid to an Amazon Mechanical Turk worker for each task performed. Use one of the following prices for bounding box tasks. Prices are in US dollars and should be based on the complexity of the task; the longer it takes in your initial testing, the more you should offer. * 0.036 * 0.048 * 0.060 * 0.072 * 0.120 * 0.240 * 0.360 * 0.480 * 0.600 * 0.720 * 0.840 * 0.960 * 1.080 * 1.200 Use one of the following prices for image classification, text classification, and custom tasks. Prices are in US dollars. * 0.012 * 0.024 * 0.036 * 0.048 * 0.060 * 0.072 * 0.120 * 0.240 * 0.360 * 0.480 * 0.600 * 0.720 * 0.840 * 0.960 * 1.080 * 1.200 Use one of the following prices for semantic segmentation tasks. Prices are in US dollars. * 0.840 * 0.960 * 1.080 * 1.200 Use one of the following prices for Textract AnalyzeDocument Important Form Key Amazon Augmented AI review tasks. Prices are in US dollars. * 2.400 * 2.280 * 2.160 * 2.040 * 1.920 * 1.800 * 1.680 * 1.560 *
    * 1.440 * 1.320 * 1.200 * 1.080 * 0.960 * 0.840 * 0.720 * 0.600 * 0.480 * 0.360 * 0.240 * 0.120 * 0.072 * 0.060 * 0.048 * 0.036 * 0.024 * 0.012 Use one of the following prices for Rekognition DetectModerationLabels Amazon Augmented AI review tasks. Prices are in US dollars. * 1.200 * 1.080 * 0.960 * 0.840 * 0.720 * 0.600 * 0.480 * 0.360 * 0.240 * 0.120 * 0.072 * 0.060 * 0.048 * 0.036 * 0.024 * 0.012 Use one of the following prices for Amazon Augmented AI custom human review tasks. Prices are in US dollars. * 1.200 * 1.080 * 0.960 * 0.840 * 0.720 * 0.600 * 0.480 * 0.360 * 0.240 * 0.120 * 0.072 * 0.060 * 0.048 * 0.036 * 0.024 * 0.012
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
  trait PutModelPackageGroupPolicyInput extends js.Object {
    var ModelPackageGroupName: EntityName
    var ResourcePolicy: PolicyString
  }

  object PutModelPackageGroupPolicyInput {
    @inline
    def apply(
        ModelPackageGroupName: EntityName,
        ResourcePolicy: PolicyString
    ): PutModelPackageGroupPolicyInput = {
      val __obj = js.Dynamic.literal(
        "ModelPackageGroupName" -> ModelPackageGroupName.asInstanceOf[js.Any],
        "ResourcePolicy" -> ResourcePolicy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutModelPackageGroupPolicyInput]
    }
  }

  @js.native
  trait PutModelPackageGroupPolicyOutput extends js.Object {
    var ModelPackageGroupArn: ModelPackageGroupArn
  }

  object PutModelPackageGroupPolicyOutput {
    @inline
    def apply(
        ModelPackageGroupArn: ModelPackageGroupArn
    ): PutModelPackageGroupPolicyOutput = {
      val __obj = js.Dynamic.literal(
        "ModelPackageGroupArn" -> ModelPackageGroupArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutModelPackageGroupPolicyOutput]
    }
  }

  /** Configuration for Redshift Dataset Definition input.
    */
  @js.native
  trait RedshiftDatasetDefinition extends js.Object {
    var ClusterId: RedshiftClusterId
    var ClusterRoleArn: RoleArn
    var Database: RedshiftDatabase
    var DbUser: RedshiftUserName
    var OutputFormat: RedshiftResultFormat
    var OutputS3Uri: S3Uri
    var QueryString: RedshiftQueryString
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var OutputCompression: js.UndefOr[RedshiftResultCompressionType]
  }

  object RedshiftDatasetDefinition {
    @inline
    def apply(
        ClusterId: RedshiftClusterId,
        ClusterRoleArn: RoleArn,
        Database: RedshiftDatabase,
        DbUser: RedshiftUserName,
        OutputFormat: RedshiftResultFormat,
        OutputS3Uri: S3Uri,
        QueryString: RedshiftQueryString,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        OutputCompression: js.UndefOr[RedshiftResultCompressionType] = js.undefined
    ): RedshiftDatasetDefinition = {
      val __obj = js.Dynamic.literal(
        "ClusterId" -> ClusterId.asInstanceOf[js.Any],
        "ClusterRoleArn" -> ClusterRoleArn.asInstanceOf[js.Any],
        "Database" -> Database.asInstanceOf[js.Any],
        "DbUser" -> DbUser.asInstanceOf[js.Any],
        "OutputFormat" -> OutputFormat.asInstanceOf[js.Any],
        "OutputS3Uri" -> OutputS3Uri.asInstanceOf[js.Any],
        "QueryString" -> QueryString.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      OutputCompression.foreach(__v => __obj.updateDynamic("OutputCompression")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RedshiftDatasetDefinition]
    }
  }

  @js.native
  trait RegisterDevicesRequest extends js.Object {
    var DeviceFleetName: EntityName
    var Devices: Devices
    var Tags: js.UndefOr[TagList]
  }

  object RegisterDevicesRequest {
    @inline
    def apply(
        DeviceFleetName: EntityName,
        Devices: Devices,
        Tags: js.UndefOr[TagList] = js.undefined
    ): RegisterDevicesRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceFleetName" -> DeviceFleetName.asInstanceOf[js.Any],
        "Devices" -> Devices.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterDevicesRequest]
    }
  }

  /** Metadata for a register model job step.
    */
  @js.native
  trait RegisterModelStepMetadata extends js.Object {
    var Arn: js.UndefOr[String256]
  }

  object RegisterModelStepMetadata {
    @inline
    def apply(
        Arn: js.UndefOr[String256] = js.undefined
    ): RegisterModelStepMetadata = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterModelStepMetadata]
    }
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
        "Task" -> Task.asInstanceOf[js.Any]
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
        "Errors" -> Errors.asInstanceOf[js.Any],
        "RenderedContent" -> RenderedContent.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RenderUiTemplateResponse]
    }
  }

  /** Contains input values for a task.
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

  /** A description of an error that occurred while rendering the template.
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
        "Code" -> Code.asInstanceOf[js.Any],
        "Message" -> Message.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RenderingError]
    }
  }

  /** Specifies an authentication configuration for the private docker registry where your model image is hosted. Specify a value for this property only if you specified <code>Vpc</code> as the value for the <code>RepositoryAccessMode</code> field of the <code>ImageConfig</code> object that you passed to a call to <a>CreateModel</a> and the private Docker registry where the model image is hosted requires authentication.
    */
  @js.native
  trait RepositoryAuthConfig extends js.Object {
    var RepositoryCredentialsProviderArn: RepositoryCredentialsProviderArn
  }

  object RepositoryAuthConfig {
    @inline
    def apply(
        RepositoryCredentialsProviderArn: RepositoryCredentialsProviderArn
    ): RepositoryAuthConfig = {
      val __obj = js.Dynamic.literal(
        "RepositoryCredentialsProviderArn" -> RepositoryCredentialsProviderArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RepositoryAuthConfig]
    }
  }

  /** The resolved attributes.
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

  /** Describes the resources, including ML compute instances and ML storage volumes, to use for model training.
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
        "InstanceCount" -> InstanceCount.asInstanceOf[js.Any],
        "InstanceType" -> InstanceType.asInstanceOf[js.Any],
        "VolumeSizeInGB" -> VolumeSizeInGB.asInstanceOf[js.Any]
      )

      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceConfig]
    }
  }

  /** Specifies the maximum number of training jobs and parallel training jobs that a hyperparameter tuning job can launch.
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

  /** Specifies the ARN's of a SageMaker image and SageMaker image version, and the instance type that the version runs on.
    */
  @js.native
  trait ResourceSpec extends js.Object {
    var InstanceType: js.UndefOr[AppInstanceType]
    var SageMakerImageArn: js.UndefOr[ImageArn]
    var SageMakerImageVersionArn: js.UndefOr[ImageVersionArn]
  }

  object ResourceSpec {
    @inline
    def apply(
        InstanceType: js.UndefOr[AppInstanceType] = js.undefined,
        SageMakerImageArn: js.UndefOr[ImageArn] = js.undefined,
        SageMakerImageVersionArn: js.UndefOr[ImageVersionArn] = js.undefined
    ): ResourceSpec = {
      val __obj = js.Dynamic.literal()
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      SageMakerImageArn.foreach(__v => __obj.updateDynamic("SageMakerImageArn")(__v.asInstanceOf[js.Any]))
      SageMakerImageVersionArn.foreach(__v => __obj.updateDynamic("SageMakerImageVersionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceSpec]
    }
  }

  /** The retention policy for data stored on an Amazon Elastic File System (EFS) volume.
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

  /** Describes the S3 data source.
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
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )

      AttributeNames.foreach(__v => __obj.updateDynamic("AttributeNames")(__v.asInstanceOf[js.Any]))
      S3DataDistributionType.foreach(__v => __obj.updateDynamic("S3DataDistributionType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3DataSource]
    }
  }

  /** The Amazon Simple Storage (Amazon S3) location and and security configuration for <code>OfflineStore</code>.
    */
  @js.native
  trait S3StorageConfig extends js.Object {
    var S3Uri: S3Uri
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var ResolvedOutputS3Uri: js.UndefOr[S3Uri]
  }

  object S3StorageConfig {
    @inline
    def apply(
        S3Uri: S3Uri,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        ResolvedOutputS3Uri: js.UndefOr[S3Uri] = js.undefined
    ): S3StorageConfig = {
      val __obj = js.Dynamic.literal(
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      ResolvedOutputS3Uri.foreach(__v => __obj.updateDynamic("ResolvedOutputS3Uri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3StorageConfig]
    }
  }

  /** Configuration details about the monitoring schedule.
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

  /** A multi-expression that searches for the specified resource or resources in a search. All resource objects that satisfy the expression's condition are included in the search results. You must specify at least one subexpression, filter, or nested filter. A <code>SearchExpression</code> can contain up to twenty elements. A <code>SearchExpression</code> contains the following components: * A list of <code>Filter</code> objects. Each filter defines a simple Boolean expression comprised of a resource property name, Boolean operator, and value. * A list of <code>NestedFilter</code> objects. Each nested filter defines a list of Boolean expressions using a list of resource properties. A nested filter is satisfied if a single object in the list satisfies all Boolean expressions. * A list of <code>SearchExpression</code> objects. A search expression object can be nested in a list of search expression objects. * A Boolean operator: <code>And</code> or <code>Or</code>.
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

  /** A single resource returned as part of the <a>Search</a> API response.
    */
  @js.native
  trait SearchRecord extends js.Object {
    var Endpoint: js.UndefOr[Endpoint]
    var Experiment: js.UndefOr[Experiment]
    var FeatureGroup: js.UndefOr[FeatureGroup]
    var ModelPackage: js.UndefOr[ModelPackage]
    var ModelPackageGroup: js.UndefOr[ModelPackageGroup]
    var Pipeline: js.UndefOr[Pipeline]
    var PipelineExecution: js.UndefOr[PipelineExecution]
    var TrainingJob: js.UndefOr[TrainingJob]
    var Trial: js.UndefOr[Trial]
    var TrialComponent: js.UndefOr[TrialComponent]
  }

  object SearchRecord {
    @inline
    def apply(
        Endpoint: js.UndefOr[Endpoint] = js.undefined,
        Experiment: js.UndefOr[Experiment] = js.undefined,
        FeatureGroup: js.UndefOr[FeatureGroup] = js.undefined,
        ModelPackage: js.UndefOr[ModelPackage] = js.undefined,
        ModelPackageGroup: js.UndefOr[ModelPackageGroup] = js.undefined,
        Pipeline: js.UndefOr[Pipeline] = js.undefined,
        PipelineExecution: js.UndefOr[PipelineExecution] = js.undefined,
        TrainingJob: js.UndefOr[TrainingJob] = js.undefined,
        Trial: js.UndefOr[Trial] = js.undefined,
        TrialComponent: js.UndefOr[TrialComponent] = js.undefined
    ): SearchRecord = {
      val __obj = js.Dynamic.literal()
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      Experiment.foreach(__v => __obj.updateDynamic("Experiment")(__v.asInstanceOf[js.Any]))
      FeatureGroup.foreach(__v => __obj.updateDynamic("FeatureGroup")(__v.asInstanceOf[js.Any]))
      ModelPackage.foreach(__v => __obj.updateDynamic("ModelPackage")(__v.asInstanceOf[js.Any]))
      ModelPackageGroup.foreach(__v => __obj.updateDynamic("ModelPackageGroup")(__v.asInstanceOf[js.Any]))
      Pipeline.foreach(__v => __obj.updateDynamic("Pipeline")(__v.asInstanceOf[js.Any]))
      PipelineExecution.foreach(__v => __obj.updateDynamic("PipelineExecution")(__v.asInstanceOf[js.Any]))
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

  /** An array element of [[DescribeTrainingJobResponse.SecondaryStatusTransitions]]. It provides additional details about a status that the training job has transitioned through. A training job can be in one of several states, for example, starting, downloading, training, or uploading. Within each state, there are a number of intermediate states. For example, within the starting state, Amazon SageMaker could be starting the training job or launching the ML instances. These transitional states are referred to as the job's secondary status. <p/>
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
        "Status" -> Status.asInstanceOf[js.Any]
      )

      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecondaryStatusTransition]
    }
  }

  /** Details of a provisioned service catalog product. For information about service catalog, see [[https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html|What is AWS Service Catalog]].
    */
  @js.native
  trait ServiceCatalogProvisionedProductDetails extends js.Object {
    var ProvisionedProductId: js.UndefOr[ServiceCatalogEntityId]
    var ProvisionedProductStatusMessage: js.UndefOr[ProvisionedProductStatusMessage]
  }

  object ServiceCatalogProvisionedProductDetails {
    @inline
    def apply(
        ProvisionedProductId: js.UndefOr[ServiceCatalogEntityId] = js.undefined,
        ProvisionedProductStatusMessage: js.UndefOr[ProvisionedProductStatusMessage] = js.undefined
    ): ServiceCatalogProvisionedProductDetails = {
      val __obj = js.Dynamic.literal()
      ProvisionedProductId.foreach(__v => __obj.updateDynamic("ProvisionedProductId")(__v.asInstanceOf[js.Any]))
      ProvisionedProductStatusMessage.foreach(__v => __obj.updateDynamic("ProvisionedProductStatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceCatalogProvisionedProductDetails]
    }
  }

  /** Details that you specify to provision a service catalog product. For information about service catalog, see .[[https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html|What is AWS Service Catalog]].
    */
  @js.native
  trait ServiceCatalogProvisioningDetails extends js.Object {
    var ProductId: ServiceCatalogEntityId
    var ProvisioningArtifactId: ServiceCatalogEntityId
    var PathId: js.UndefOr[ServiceCatalogEntityId]
    var ProvisioningParameters: js.UndefOr[ProvisioningParameters]
  }

  object ServiceCatalogProvisioningDetails {
    @inline
    def apply(
        ProductId: ServiceCatalogEntityId,
        ProvisioningArtifactId: ServiceCatalogEntityId,
        PathId: js.UndefOr[ServiceCatalogEntityId] = js.undefined,
        ProvisioningParameters: js.UndefOr[ProvisioningParameters] = js.undefined
    ): ServiceCatalogProvisioningDetails = {
      val __obj = js.Dynamic.literal(
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any]
      )

      PathId.foreach(__v => __obj.updateDynamic("PathId")(__v.asInstanceOf[js.Any]))
      ProvisioningParameters.foreach(__v => __obj.updateDynamic("ProvisioningParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceCatalogProvisioningDetails]
    }
  }

  /** Specifies options for sharing SageMaker Studio notebooks. These settings are specified as part of <code>DefaultUserSettings</code> when the <code>CreateDomain</code> API is called, and as part of <code>UserSettings</code> when the <code>CreateUserProfile</code> API is called. When <code>SharingSettings</code> is not specified, notebook sharing isn't allowed.
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

  /** A configuration for a shuffle option for input data in a channel. If you use <code>S3Prefix</code> for <code>S3DataType</code>, the results of the S3 key prefix matches are shuffled. If you use <code>ManifestFile</code>, the order of the S3 object references in the <code>ManifestFile</code> is shuffled. If you use <code>AugmentedManifestFile</code>, the order of the JSON lines in the <code>AugmentedManifestFile</code> is shuffled. The shuffling order is determined using the <code>Seed</code> value. For Pipe input mode, when <code>ShuffleConfig</code> is specified shuffling is done at the start of every epoch. With large datasets, this ensures that the order of the training data is different for each epoch, and it helps reduce bias and possible overfitting. In a multi-node training job when <code>ShuffleConfig</code> is combined with <code>S3DataDistributionType</code> of <code>ShardedByS3Key</code>, the data is shuffled across nodes so that the content sent to a particular node
    * on the first epoch might be sent to a different node on the second epoch.
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

  /** Specifies an algorithm that was used to create the model package. The algorithm must be either an algorithm resource in your Amazon SageMaker account or an algorithm in AWS Marketplace that you are subscribed to.
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

  /** A list of algorithms that were used to create a model package.
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

  /** A list of IP address ranges ([[https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html|CIDRs]]). Used to create an allow list of IP addresses for a private workforce. Workers will only be able to login to their worker portal from an IP address within this range. By default, a workforce isn't restricted to specific IP addresses.
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
  trait StartPipelineExecutionRequest extends js.Object {
    var ClientRequestToken: IdempotencyToken
    var PipelineName: PipelineName
    var PipelineExecutionDescription: js.UndefOr[PipelineExecutionDescription]
    var PipelineExecutionDisplayName: js.UndefOr[PipelineExecutionName]
    var PipelineParameters: js.UndefOr[ParameterList]
  }

  object StartPipelineExecutionRequest {
    @inline
    def apply(
        ClientRequestToken: IdempotencyToken,
        PipelineName: PipelineName,
        PipelineExecutionDescription: js.UndefOr[PipelineExecutionDescription] = js.undefined,
        PipelineExecutionDisplayName: js.UndefOr[PipelineExecutionName] = js.undefined,
        PipelineParameters: js.UndefOr[ParameterList] = js.undefined
    ): StartPipelineExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "PipelineName" -> PipelineName.asInstanceOf[js.Any]
      )

      PipelineExecutionDescription.foreach(__v => __obj.updateDynamic("PipelineExecutionDescription")(__v.asInstanceOf[js.Any]))
      PipelineExecutionDisplayName.foreach(__v => __obj.updateDynamic("PipelineExecutionDisplayName")(__v.asInstanceOf[js.Any]))
      PipelineParameters.foreach(__v => __obj.updateDynamic("PipelineParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartPipelineExecutionRequest]
    }
  }

  @js.native
  trait StartPipelineExecutionResponse extends js.Object {
    var PipelineExecutionArn: js.UndefOr[PipelineExecutionArn]
  }

  object StartPipelineExecutionResponse {
    @inline
    def apply(
        PipelineExecutionArn: js.UndefOr[PipelineExecutionArn] = js.undefined
    ): StartPipelineExecutionResponse = {
      val __obj = js.Dynamic.literal()
      PipelineExecutionArn.foreach(__v => __obj.updateDynamic("PipelineExecutionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartPipelineExecutionResponse]
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
  trait StopEdgePackagingJobRequest extends js.Object {
    var EdgePackagingJobName: EntityName
  }

  object StopEdgePackagingJobRequest {
    @inline
    def apply(
        EdgePackagingJobName: EntityName
    ): StopEdgePackagingJobRequest = {
      val __obj = js.Dynamic.literal(
        "EdgePackagingJobName" -> EdgePackagingJobName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopEdgePackagingJobRequest]
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
  trait StopPipelineExecutionRequest extends js.Object {
    var ClientRequestToken: IdempotencyToken
    var PipelineExecutionArn: PipelineExecutionArn
  }

  object StopPipelineExecutionRequest {
    @inline
    def apply(
        ClientRequestToken: IdempotencyToken,
        PipelineExecutionArn: PipelineExecutionArn
    ): StopPipelineExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "PipelineExecutionArn" -> PipelineExecutionArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopPipelineExecutionRequest]
    }
  }

  @js.native
  trait StopPipelineExecutionResponse extends js.Object {
    var PipelineExecutionArn: js.UndefOr[PipelineExecutionArn]
  }

  object StopPipelineExecutionResponse {
    @inline
    def apply(
        PipelineExecutionArn: js.UndefOr[PipelineExecutionArn] = js.undefined
    ): StopPipelineExecutionResponse = {
      val __obj = js.Dynamic.literal()
      PipelineExecutionArn.foreach(__v => __obj.updateDynamic("PipelineExecutionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopPipelineExecutionResponse]
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

  /** Specifies a limit to how long a model training or compilation job can run. It also specifies how long you are willing to wait for a managed spot training job to complete. When the job reaches the time limit, Amazon SageMaker ends the training or compilation job. Use this API to cap model training costs. To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal, which delays job termination for 120 seconds. Algorithms can use this 120-second window to save the model artifacts, so the results of training are not lost. The training algorithms provided by Amazon SageMaker automatically save the intermediate results of a model training job when possible. This attempt to save artifacts is only a best effort case as model might not be in a state from which it can be saved. For example, if training has just started, the model might not be ready to save. When saved, this intermediate data is a valid model artifact. You can use it to create a model with
    * <code>CreateModel</code>.
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

  /** Describes a work team of a vendor that does the a labelling job.
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

  /** Specified in the <a>GetSearchSuggestions</a> request. Limits the property names that are included in the response.
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

  /** Describes a tag.
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
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  /** Contains information about a target platform that you want your model to run on, such as OS, architecture, and accelerators. It is an alternative of <code>TargetDevice</code>.
    */
  @js.native
  trait TargetPlatform extends js.Object {
    var Arch: TargetPlatformArch
    var Os: TargetPlatformOs
    var Accelerator: js.UndefOr[TargetPlatformAccelerator]
  }

  object TargetPlatform {
    @inline
    def apply(
        Arch: TargetPlatformArch,
        Os: TargetPlatformOs,
        Accelerator: js.UndefOr[TargetPlatformAccelerator] = js.undefined
    ): TargetPlatform = {
      val __obj = js.Dynamic.literal(
        "Arch" -> Arch.asInstanceOf[js.Any],
        "Os" -> Os.asInstanceOf[js.Any]
      )

      Accelerator.foreach(__v => __obj.updateDynamic("Accelerator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetPlatform]
    }
  }

  /** The TensorBoard app settings.
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

  /** Configuration of storage locations for the Debugger TensorBoard output data.
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

  /** Currently, the <code>TrafficRoutingConfig</code> API is not supported.
    */
  @js.native
  trait TrafficRoutingConfig extends js.Object {
    var Type: TrafficRoutingConfigType
    var WaitIntervalInSeconds: WaitIntervalInSeconds
    var CanarySize: js.UndefOr[CapacitySize]
  }

  object TrafficRoutingConfig {
    @inline
    def apply(
        Type: TrafficRoutingConfigType,
        WaitIntervalInSeconds: WaitIntervalInSeconds,
        CanarySize: js.UndefOr[CapacitySize] = js.undefined
    ): TrafficRoutingConfig = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any],
        "WaitIntervalInSeconds" -> WaitIntervalInSeconds.asInstanceOf[js.Any]
      )

      CanarySize.foreach(__v => __obj.updateDynamic("CanarySize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrafficRoutingConfig]
    }
  }

  /** Contains information about a training job.
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
    var Environment: js.UndefOr[TrainingEnvironmentMap]
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
        Environment: js.UndefOr[TrainingEnvironmentMap] = js.undefined,
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
      DebugRuleEvaluationStatuses.foreach(__v => __obj.updateDynamic("DebugRuleEvaluationStatuses")(__v.asInstanceOf[js.Any]))
      EnableInterContainerTrafficEncryption.foreach(__v => __obj.updateDynamic("EnableInterContainerTrafficEncryption")(__v.asInstanceOf[js.Any]))
      EnableManagedSpotTraining.foreach(__v => __obj.updateDynamic("EnableManagedSpotTraining")(__v.asInstanceOf[js.Any]))
      EnableNetworkIsolation.foreach(__v => __obj.updateDynamic("EnableNetworkIsolation")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
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
      SecondaryStatusTransitions.foreach(__v => __obj.updateDynamic("SecondaryStatusTransitions")(__v.asInstanceOf[js.Any]))
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

  /** Defines the input needed to run a training job using the algorithm.
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
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any],
        "ResourceConfig" -> ResourceConfig.asInstanceOf[js.Any],
        "StoppingCondition" -> StoppingCondition.asInstanceOf[js.Any],
        "TrainingInputMode" -> TrainingInputMode.asInstanceOf[js.Any]
      )

      HyperParameters.foreach(__v => __obj.updateDynamic("HyperParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrainingJobDefinition]
    }
  }

  /** The numbers of training jobs launched by a hyperparameter tuning job, categorized by status.
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

  /** Metadata for a training job step.
    */
  @js.native
  trait TrainingJobStepMetadata extends js.Object {
    var Arn: js.UndefOr[TrainingJobArn]
  }

  object TrainingJobStepMetadata {
    @inline
    def apply(
        Arn: js.UndefOr[TrainingJobArn] = js.undefined
    ): TrainingJobStepMetadata = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrainingJobStepMetadata]
    }
  }

  /** Provides summary information about a training job.
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
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "TrainingJobArn" -> TrainingJobArn.asInstanceOf[js.Any],
        "TrainingJobName" -> TrainingJobName.asInstanceOf[js.Any],
        "TrainingJobStatus" -> TrainingJobStatus.asInstanceOf[js.Any]
      )

      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      TrainingEndTime.foreach(__v => __obj.updateDynamic("TrainingEndTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrainingJobSummary]
    }
  }

  /** Defines how the algorithm is used for a training job.
    */
  @js.native
  trait TrainingSpecification extends js.Object {
    var SupportedTrainingInstanceTypes: TrainingInstanceTypes
    var TrainingChannels: ChannelSpecifications
    var TrainingImage: ContainerImage
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
        TrainingImage: ContainerImage,
        MetricDefinitions: js.UndefOr[MetricDefinitionList] = js.undefined,
        SupportedHyperParameters: js.UndefOr[HyperParameterSpecifications] = js.undefined,
        SupportedTuningJobObjectiveMetrics: js.UndefOr[HyperParameterTuningJobObjectives] = js.undefined,
        SupportsDistributedTraining: js.UndefOr[Boolean] = js.undefined,
        TrainingImageDigest: js.UndefOr[ImageDigest] = js.undefined
    ): TrainingSpecification = {
      val __obj = js.Dynamic.literal(
        "SupportedTrainingInstanceTypes" -> SupportedTrainingInstanceTypes.asInstanceOf[js.Any],
        "TrainingChannels" -> TrainingChannels.asInstanceOf[js.Any],
        "TrainingImage" -> TrainingImage.asInstanceOf[js.Any]
      )

      MetricDefinitions.foreach(__v => __obj.updateDynamic("MetricDefinitions")(__v.asInstanceOf[js.Any]))
      SupportedHyperParameters.foreach(__v => __obj.updateDynamic("SupportedHyperParameters")(__v.asInstanceOf[js.Any]))
      SupportedTuningJobObjectiveMetrics.foreach(__v => __obj.updateDynamic("SupportedTuningJobObjectiveMetrics")(__v.asInstanceOf[js.Any]))
      SupportsDistributedTraining.foreach(__v => __obj.updateDynamic("SupportsDistributedTraining")(__v.asInstanceOf[js.Any]))
      TrainingImageDigest.foreach(__v => __obj.updateDynamic("TrainingImageDigest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrainingSpecification]
    }
  }

  /** Describes the location of the channel data.
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

  /** Describes the input source of a transform job and the way the transform job consumes it.
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

  /** A batch transform job. For information about SageMaker batch transform, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform.html|Use Batch Transform]].
    */
  @js.native
  trait TransformJob extends js.Object {
    var AutoMLJobArn: js.UndefOr[AutoMLJobArn]
    var BatchStrategy: js.UndefOr[BatchStrategy]
    var CreationTime: js.UndefOr[Timestamp]
    var DataProcessing: js.UndefOr[DataProcessing]
    var Environment: js.UndefOr[TransformEnvironmentMap]
    var ExperimentConfig: js.UndefOr[ExperimentConfig]
    var FailureReason: js.UndefOr[FailureReason]
    var LabelingJobArn: js.UndefOr[LabelingJobArn]
    var MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms]
    var MaxPayloadInMB: js.UndefOr[MaxPayloadInMB]
    var ModelClientConfig: js.UndefOr[ModelClientConfig]
    var ModelName: js.UndefOr[ModelName]
    var Tags: js.UndefOr[TagList]
    var TransformEndTime: js.UndefOr[Timestamp]
    var TransformInput: js.UndefOr[TransformInput]
    var TransformJobArn: js.UndefOr[TransformJobArn]
    var TransformJobName: js.UndefOr[TransformJobName]
    var TransformJobStatus: js.UndefOr[TransformJobStatus]
    var TransformOutput: js.UndefOr[TransformOutput]
    var TransformResources: js.UndefOr[TransformResources]
    var TransformStartTime: js.UndefOr[Timestamp]
  }

  object TransformJob {
    @inline
    def apply(
        AutoMLJobArn: js.UndefOr[AutoMLJobArn] = js.undefined,
        BatchStrategy: js.UndefOr[BatchStrategy] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DataProcessing: js.UndefOr[DataProcessing] = js.undefined,
        Environment: js.UndefOr[TransformEnvironmentMap] = js.undefined,
        ExperimentConfig: js.UndefOr[ExperimentConfig] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        LabelingJobArn: js.UndefOr[LabelingJobArn] = js.undefined,
        MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms] = js.undefined,
        MaxPayloadInMB: js.UndefOr[MaxPayloadInMB] = js.undefined,
        ModelClientConfig: js.UndefOr[ModelClientConfig] = js.undefined,
        ModelName: js.UndefOr[ModelName] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TransformEndTime: js.UndefOr[Timestamp] = js.undefined,
        TransformInput: js.UndefOr[TransformInput] = js.undefined,
        TransformJobArn: js.UndefOr[TransformJobArn] = js.undefined,
        TransformJobName: js.UndefOr[TransformJobName] = js.undefined,
        TransformJobStatus: js.UndefOr[TransformJobStatus] = js.undefined,
        TransformOutput: js.UndefOr[TransformOutput] = js.undefined,
        TransformResources: js.UndefOr[TransformResources] = js.undefined,
        TransformStartTime: js.UndefOr[Timestamp] = js.undefined
    ): TransformJob = {
      val __obj = js.Dynamic.literal()
      AutoMLJobArn.foreach(__v => __obj.updateDynamic("AutoMLJobArn")(__v.asInstanceOf[js.Any]))
      BatchStrategy.foreach(__v => __obj.updateDynamic("BatchStrategy")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DataProcessing.foreach(__v => __obj.updateDynamic("DataProcessing")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      ExperimentConfig.foreach(__v => __obj.updateDynamic("ExperimentConfig")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LabelingJobArn.foreach(__v => __obj.updateDynamic("LabelingJobArn")(__v.asInstanceOf[js.Any]))
      MaxConcurrentTransforms.foreach(__v => __obj.updateDynamic("MaxConcurrentTransforms")(__v.asInstanceOf[js.Any]))
      MaxPayloadInMB.foreach(__v => __obj.updateDynamic("MaxPayloadInMB")(__v.asInstanceOf[js.Any]))
      ModelClientConfig.foreach(__v => __obj.updateDynamic("ModelClientConfig")(__v.asInstanceOf[js.Any]))
      ModelName.foreach(__v => __obj.updateDynamic("ModelName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TransformEndTime.foreach(__v => __obj.updateDynamic("TransformEndTime")(__v.asInstanceOf[js.Any]))
      TransformInput.foreach(__v => __obj.updateDynamic("TransformInput")(__v.asInstanceOf[js.Any]))
      TransformJobArn.foreach(__v => __obj.updateDynamic("TransformJobArn")(__v.asInstanceOf[js.Any]))
      TransformJobName.foreach(__v => __obj.updateDynamic("TransformJobName")(__v.asInstanceOf[js.Any]))
      TransformJobStatus.foreach(__v => __obj.updateDynamic("TransformJobStatus")(__v.asInstanceOf[js.Any]))
      TransformOutput.foreach(__v => __obj.updateDynamic("TransformOutput")(__v.asInstanceOf[js.Any]))
      TransformResources.foreach(__v => __obj.updateDynamic("TransformResources")(__v.asInstanceOf[js.Any]))
      TransformStartTime.foreach(__v => __obj.updateDynamic("TransformStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransformJob]
    }
  }

  /** Defines the input needed to run a transform job using the inference specification specified in the algorithm.
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
        "TransformInput" -> TransformInput.asInstanceOf[js.Any],
        "TransformOutput" -> TransformOutput.asInstanceOf[js.Any],
        "TransformResources" -> TransformResources.asInstanceOf[js.Any]
      )

      BatchStrategy.foreach(__v => __obj.updateDynamic("BatchStrategy")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      MaxConcurrentTransforms.foreach(__v => __obj.updateDynamic("MaxConcurrentTransforms")(__v.asInstanceOf[js.Any]))
      MaxPayloadInMB.foreach(__v => __obj.updateDynamic("MaxPayloadInMB")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransformJobDefinition]
    }
  }

  /** Metadata for a transform job step.
    */
  @js.native
  trait TransformJobStepMetadata extends js.Object {
    var Arn: js.UndefOr[TransformJobArn]
  }

  object TransformJobStepMetadata {
    @inline
    def apply(
        Arn: js.UndefOr[TransformJobArn] = js.undefined
    ): TransformJobStepMetadata = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransformJobStepMetadata]
    }
  }

  /** Provides a summary of a transform job. Multiple <code>TransformJobSummary</code> objects are returned as a list after in response to a <a>ListTransformJobs</a> call.
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
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "TransformJobArn" -> TransformJobArn.asInstanceOf[js.Any],
        "TransformJobName" -> TransformJobName.asInstanceOf[js.Any],
        "TransformJobStatus" -> TransformJobStatus.asInstanceOf[js.Any]
      )

      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      TransformEndTime.foreach(__v => __obj.updateDynamic("TransformEndTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransformJobSummary]
    }
  }

  /** Describes the results of a transform job.
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

  /** Describes the resources, including ML instance types and ML instance count, to use for transform job.
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
        "InstanceType" -> InstanceType.asInstanceOf[js.Any]
      )

      VolumeKmsKeyId.foreach(__v => __obj.updateDynamic("VolumeKmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransformResources]
    }
  }

  /** Describes the S3 data source.
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
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TransformS3DataSource]
    }
  }

  /** The properties of a trial as returned by the <a>Search</a> API.
    */
  @js.native
  trait Trial extends js.Object {
    var CreatedBy: js.UndefOr[UserContext]
    var CreationTime: js.UndefOr[Timestamp]
    var DisplayName: js.UndefOr[ExperimentEntityName]
    var ExperimentName: js.UndefOr[ExperimentEntityName]
    var LastModifiedBy: js.UndefOr[UserContext]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var MetadataProperties: js.UndefOr[MetadataProperties]
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
        MetadataProperties: js.UndefOr[MetadataProperties] = js.undefined,
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
      MetadataProperties.foreach(__v => __obj.updateDynamic("MetadataProperties")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TrialArn.foreach(__v => __obj.updateDynamic("TrialArn")(__v.asInstanceOf[js.Any]))
      TrialComponentSummaries.foreach(__v => __obj.updateDynamic("TrialComponentSummaries")(__v.asInstanceOf[js.Any]))
      TrialName.foreach(__v => __obj.updateDynamic("TrialName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Trial]
    }
  }

  /** The properties of a trial component as returned by the <a>Search</a> API.
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
    var MetadataProperties: js.UndefOr[MetadataProperties]
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
        MetadataProperties: js.UndefOr[MetadataProperties] = js.undefined,
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
      MetadataProperties.foreach(__v => __obj.updateDynamic("MetadataProperties")(__v.asInstanceOf[js.Any]))
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

  /** Represents an input or output artifact of a trial component. You specify <code>TrialComponentArtifact</code> as part of the <code>InputArtifacts</code> and <code>OutputArtifacts</code> parameters in the <a>CreateTrialComponent</a> request. Examples of input artifacts are datasets, algorithms, hyperparameters, source code, and instance types. Examples of output artifacts are metrics, snapshots, logs, and images.
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

  /** A summary of the metrics of a trial component.
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

  /** The value of a hyperparameter. Only one of <code>NumberValue</code> or <code>StringValue</code> can be specified. This object is specified in the <a>CreateTrialComponent</a> request.
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

  /** A short summary of a trial component.
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

  /** The Amazon Resource Name (ARN) and job type of the source of a trial component.
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

  /** Detailed information about the source of a trial component. Either <code>ProcessingJob</code> or <code>TrainingJob</code> is returned.
    */
  @js.native
  trait TrialComponentSourceDetail extends js.Object {
    var ProcessingJob: js.UndefOr[ProcessingJob]
    var SourceArn: js.UndefOr[TrialComponentSourceArn]
    var TrainingJob: js.UndefOr[TrainingJob]
    var TransformJob: js.UndefOr[TransformJob]
  }

  object TrialComponentSourceDetail {
    @inline
    def apply(
        ProcessingJob: js.UndefOr[ProcessingJob] = js.undefined,
        SourceArn: js.UndefOr[TrialComponentSourceArn] = js.undefined,
        TrainingJob: js.UndefOr[TrainingJob] = js.undefined,
        TransformJob: js.UndefOr[TransformJob] = js.undefined
    ): TrialComponentSourceDetail = {
      val __obj = js.Dynamic.literal()
      ProcessingJob.foreach(__v => __obj.updateDynamic("ProcessingJob")(__v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      TrainingJob.foreach(__v => __obj.updateDynamic("TrainingJob")(__v.asInstanceOf[js.Any]))
      TransformJob.foreach(__v => __obj.updateDynamic("TransformJob")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrialComponentSourceDetail]
    }
  }

  /** The status of the trial component.
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

  /** A summary of the properties of a trial component. To get all the properties, call the <a>DescribeTrialComponent</a> API and provide the <code>TrialComponentName</code>.
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

  /** The source of the trial.
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

  /** A summary of the properties of a trial. To get the complete set of properties, call the <a>DescribeTrial</a> API and provide the <code>TrialName</code>.
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

  /** The job completion criteria.
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

  /** Represents an amount of money in United States dollars/
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

  /** Provided configuration information for the worker UI for a labeling job.
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

  /** The Liquid template for the worker user interface.
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

  /** Container for user interface template information.
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
  trait UpdateActionRequest extends js.Object {
    var ActionName: ExperimentEntityName
    var Description: js.UndefOr[ExperimentDescription]
    var Properties: js.UndefOr[LineageEntityParameters]
    var PropertiesToRemove: js.UndefOr[ListLineageEntityParameterKey]
    var Status: js.UndefOr[ActionStatus]
  }

  object UpdateActionRequest {
    @inline
    def apply(
        ActionName: ExperimentEntityName,
        Description: js.UndefOr[ExperimentDescription] = js.undefined,
        Properties: js.UndefOr[LineageEntityParameters] = js.undefined,
        PropertiesToRemove: js.UndefOr[ListLineageEntityParameterKey] = js.undefined,
        Status: js.UndefOr[ActionStatus] = js.undefined
    ): UpdateActionRequest = {
      val __obj = js.Dynamic.literal(
        "ActionName" -> ActionName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.updateDynamic("Properties")(__v.asInstanceOf[js.Any]))
      PropertiesToRemove.foreach(__v => __obj.updateDynamic("PropertiesToRemove")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateActionRequest]
    }
  }

  @js.native
  trait UpdateActionResponse extends js.Object {
    var ActionArn: js.UndefOr[ActionArn]
  }

  object UpdateActionResponse {
    @inline
    def apply(
        ActionArn: js.UndefOr[ActionArn] = js.undefined
    ): UpdateActionResponse = {
      val __obj = js.Dynamic.literal()
      ActionArn.foreach(__v => __obj.updateDynamic("ActionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateActionResponse]
    }
  }

  @js.native
  trait UpdateAppImageConfigRequest extends js.Object {
    var AppImageConfigName: AppImageConfigName
    var KernelGatewayImageConfig: js.UndefOr[KernelGatewayImageConfig]
  }

  object UpdateAppImageConfigRequest {
    @inline
    def apply(
        AppImageConfigName: AppImageConfigName,
        KernelGatewayImageConfig: js.UndefOr[KernelGatewayImageConfig] = js.undefined
    ): UpdateAppImageConfigRequest = {
      val __obj = js.Dynamic.literal(
        "AppImageConfigName" -> AppImageConfigName.asInstanceOf[js.Any]
      )

      KernelGatewayImageConfig.foreach(__v => __obj.updateDynamic("KernelGatewayImageConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAppImageConfigRequest]
    }
  }

  @js.native
  trait UpdateAppImageConfigResponse extends js.Object {
    var AppImageConfigArn: js.UndefOr[AppImageConfigArn]
  }

  object UpdateAppImageConfigResponse {
    @inline
    def apply(
        AppImageConfigArn: js.UndefOr[AppImageConfigArn] = js.undefined
    ): UpdateAppImageConfigResponse = {
      val __obj = js.Dynamic.literal()
      AppImageConfigArn.foreach(__v => __obj.updateDynamic("AppImageConfigArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAppImageConfigResponse]
    }
  }

  @js.native
  trait UpdateArtifactRequest extends js.Object {
    var ArtifactArn: ArtifactArn
    var ArtifactName: js.UndefOr[ExperimentEntityName]
    var Properties: js.UndefOr[LineageEntityParameters]
    var PropertiesToRemove: js.UndefOr[ListLineageEntityParameterKey]
  }

  object UpdateArtifactRequest {
    @inline
    def apply(
        ArtifactArn: ArtifactArn,
        ArtifactName: js.UndefOr[ExperimentEntityName] = js.undefined,
        Properties: js.UndefOr[LineageEntityParameters] = js.undefined,
        PropertiesToRemove: js.UndefOr[ListLineageEntityParameterKey] = js.undefined
    ): UpdateArtifactRequest = {
      val __obj = js.Dynamic.literal(
        "ArtifactArn" -> ArtifactArn.asInstanceOf[js.Any]
      )

      ArtifactName.foreach(__v => __obj.updateDynamic("ArtifactName")(__v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.updateDynamic("Properties")(__v.asInstanceOf[js.Any]))
      PropertiesToRemove.foreach(__v => __obj.updateDynamic("PropertiesToRemove")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateArtifactRequest]
    }
  }

  @js.native
  trait UpdateArtifactResponse extends js.Object {
    var ArtifactArn: js.UndefOr[ArtifactArn]
  }

  object UpdateArtifactResponse {
    @inline
    def apply(
        ArtifactArn: js.UndefOr[ArtifactArn] = js.undefined
    ): UpdateArtifactResponse = {
      val __obj = js.Dynamic.literal()
      ArtifactArn.foreach(__v => __obj.updateDynamic("ArtifactArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateArtifactResponse]
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
  trait UpdateContextRequest extends js.Object {
    var ContextName: ExperimentEntityName
    var Description: js.UndefOr[ExperimentDescription]
    var Properties: js.UndefOr[LineageEntityParameters]
    var PropertiesToRemove: js.UndefOr[ListLineageEntityParameterKey]
  }

  object UpdateContextRequest {
    @inline
    def apply(
        ContextName: ExperimentEntityName,
        Description: js.UndefOr[ExperimentDescription] = js.undefined,
        Properties: js.UndefOr[LineageEntityParameters] = js.undefined,
        PropertiesToRemove: js.UndefOr[ListLineageEntityParameterKey] = js.undefined
    ): UpdateContextRequest = {
      val __obj = js.Dynamic.literal(
        "ContextName" -> ContextName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.updateDynamic("Properties")(__v.asInstanceOf[js.Any]))
      PropertiesToRemove.foreach(__v => __obj.updateDynamic("PropertiesToRemove")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateContextRequest]
    }
  }

  @js.native
  trait UpdateContextResponse extends js.Object {
    var ContextArn: js.UndefOr[ContextArn]
  }

  object UpdateContextResponse {
    @inline
    def apply(
        ContextArn: js.UndefOr[ContextArn] = js.undefined
    ): UpdateContextResponse = {
      val __obj = js.Dynamic.literal()
      ContextArn.foreach(__v => __obj.updateDynamic("ContextArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateContextResponse]
    }
  }

  @js.native
  trait UpdateDeviceFleetRequest extends js.Object {
    var DeviceFleetName: EntityName
    var OutputConfig: EdgeOutputConfig
    var Description: js.UndefOr[DeviceFleetDescription]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object UpdateDeviceFleetRequest {
    @inline
    def apply(
        DeviceFleetName: EntityName,
        OutputConfig: EdgeOutputConfig,
        Description: js.UndefOr[DeviceFleetDescription] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined
    ): UpdateDeviceFleetRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceFleetName" -> DeviceFleetName.asInstanceOf[js.Any],
        "OutputConfig" -> OutputConfig.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDeviceFleetRequest]
    }
  }

  @js.native
  trait UpdateDevicesRequest extends js.Object {
    var DeviceFleetName: EntityName
    var Devices: Devices
  }

  object UpdateDevicesRequest {
    @inline
    def apply(
        DeviceFleetName: EntityName,
        Devices: Devices
    ): UpdateDevicesRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceFleetName" -> DeviceFleetName.asInstanceOf[js.Any],
        "Devices" -> Devices.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateDevicesRequest]
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
    var DeploymentConfig: js.UndefOr[DeploymentConfig]
    var ExcludeRetainedVariantProperties: js.UndefOr[VariantPropertyList]
    var RetainAllVariantProperties: js.UndefOr[Boolean]
  }

  object UpdateEndpointInput {
    @inline
    def apply(
        EndpointConfigName: EndpointConfigName,
        EndpointName: EndpointName,
        DeploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined,
        ExcludeRetainedVariantProperties: js.UndefOr[VariantPropertyList] = js.undefined,
        RetainAllVariantProperties: js.UndefOr[Boolean] = js.undefined
    ): UpdateEndpointInput = {
      val __obj = js.Dynamic.literal(
        "EndpointConfigName" -> EndpointConfigName.asInstanceOf[js.Any],
        "EndpointName" -> EndpointName.asInstanceOf[js.Any]
      )

      DeploymentConfig.foreach(__v => __obj.updateDynamic("DeploymentConfig")(__v.asInstanceOf[js.Any]))
      ExcludeRetainedVariantProperties.foreach(__v => __obj.updateDynamic("ExcludeRetainedVariantProperties")(__v.asInstanceOf[js.Any]))
      RetainAllVariantProperties.foreach(__v => __obj.updateDynamic("RetainAllVariantProperties")(__v.asInstanceOf[js.Any]))
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
        "EndpointName" -> EndpointName.asInstanceOf[js.Any]
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
  trait UpdateImageRequest extends js.Object {
    var ImageName: ImageName
    var DeleteProperties: js.UndefOr[ImageDeletePropertyList]
    var Description: js.UndefOr[ImageDescription]
    var DisplayName: js.UndefOr[ImageDisplayName]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object UpdateImageRequest {
    @inline
    def apply(
        ImageName: ImageName,
        DeleteProperties: js.UndefOr[ImageDeletePropertyList] = js.undefined,
        Description: js.UndefOr[ImageDescription] = js.undefined,
        DisplayName: js.UndefOr[ImageDisplayName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined
    ): UpdateImageRequest = {
      val __obj = js.Dynamic.literal(
        "ImageName" -> ImageName.asInstanceOf[js.Any]
      )

      DeleteProperties.foreach(__v => __obj.updateDynamic("DeleteProperties")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateImageRequest]
    }
  }

  @js.native
  trait UpdateImageResponse extends js.Object {
    var ImageArn: js.UndefOr[ImageArn]
  }

  object UpdateImageResponse {
    @inline
    def apply(
        ImageArn: js.UndefOr[ImageArn] = js.undefined
    ): UpdateImageResponse = {
      val __obj = js.Dynamic.literal()
      ImageArn.foreach(__v => __obj.updateDynamic("ImageArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateImageResponse]
    }
  }

  @js.native
  trait UpdateModelPackageInput extends js.Object {
    var ModelApprovalStatus: ModelApprovalStatus
    var ModelPackageArn: ModelPackageArn
    var ApprovalDescription: js.UndefOr[ApprovalDescription]
  }

  object UpdateModelPackageInput {
    @inline
    def apply(
        ModelApprovalStatus: ModelApprovalStatus,
        ModelPackageArn: ModelPackageArn,
        ApprovalDescription: js.UndefOr[ApprovalDescription] = js.undefined
    ): UpdateModelPackageInput = {
      val __obj = js.Dynamic.literal(
        "ModelApprovalStatus" -> ModelApprovalStatus.asInstanceOf[js.Any],
        "ModelPackageArn" -> ModelPackageArn.asInstanceOf[js.Any]
      )

      ApprovalDescription.foreach(__v => __obj.updateDynamic("ApprovalDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateModelPackageInput]
    }
  }

  @js.native
  trait UpdateModelPackageOutput extends js.Object {
    var ModelPackageArn: ModelPackageArn
  }

  object UpdateModelPackageOutput {
    @inline
    def apply(
        ModelPackageArn: ModelPackageArn
    ): UpdateModelPackageOutput = {
      val __obj = js.Dynamic.literal(
        "ModelPackageArn" -> ModelPackageArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateModelPackageOutput]
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
        "MonitoringScheduleName" -> MonitoringScheduleName.asInstanceOf[js.Any]
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
      AdditionalCodeRepositories.foreach(__v => __obj.updateDynamic("AdditionalCodeRepositories")(__v.asInstanceOf[js.Any]))
      DefaultCodeRepository.foreach(__v => __obj.updateDynamic("DefaultCodeRepository")(__v.asInstanceOf[js.Any]))
      DisassociateAcceleratorTypes.foreach(__v => __obj.updateDynamic("DisassociateAcceleratorTypes")(__v.asInstanceOf[js.Any]))
      DisassociateAdditionalCodeRepositories.foreach(__v => __obj.updateDynamic("DisassociateAdditionalCodeRepositories")(__v.asInstanceOf[js.Any]))
      DisassociateDefaultCodeRepository.foreach(__v => __obj.updateDynamic("DisassociateDefaultCodeRepository")(__v.asInstanceOf[js.Any]))
      DisassociateLifecycleConfig.foreach(__v => __obj.updateDynamic("DisassociateLifecycleConfig")(__v.asInstanceOf[js.Any]))
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
  trait UpdateNotebookInstanceLifecycleConfigOutput extends js.Object

  object UpdateNotebookInstanceLifecycleConfigOutput {
    @inline
    def apply(): UpdateNotebookInstanceLifecycleConfigOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateNotebookInstanceLifecycleConfigOutput]
    }
  }

  @js.native
  trait UpdateNotebookInstanceOutput extends js.Object

  object UpdateNotebookInstanceOutput {
    @inline
    def apply(): UpdateNotebookInstanceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateNotebookInstanceOutput]
    }
  }

  @js.native
  trait UpdatePipelineExecutionRequest extends js.Object {
    var PipelineExecutionArn: PipelineExecutionArn
    var PipelineExecutionDescription: js.UndefOr[PipelineExecutionDescription]
    var PipelineExecutionDisplayName: js.UndefOr[PipelineExecutionName]
  }

  object UpdatePipelineExecutionRequest {
    @inline
    def apply(
        PipelineExecutionArn: PipelineExecutionArn,
        PipelineExecutionDescription: js.UndefOr[PipelineExecutionDescription] = js.undefined,
        PipelineExecutionDisplayName: js.UndefOr[PipelineExecutionName] = js.undefined
    ): UpdatePipelineExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "PipelineExecutionArn" -> PipelineExecutionArn.asInstanceOf[js.Any]
      )

      PipelineExecutionDescription.foreach(__v => __obj.updateDynamic("PipelineExecutionDescription")(__v.asInstanceOf[js.Any]))
      PipelineExecutionDisplayName.foreach(__v => __obj.updateDynamic("PipelineExecutionDisplayName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePipelineExecutionRequest]
    }
  }

  @js.native
  trait UpdatePipelineExecutionResponse extends js.Object {
    var PipelineExecutionArn: js.UndefOr[PipelineExecutionArn]
  }

  object UpdatePipelineExecutionResponse {
    @inline
    def apply(
        PipelineExecutionArn: js.UndefOr[PipelineExecutionArn] = js.undefined
    ): UpdatePipelineExecutionResponse = {
      val __obj = js.Dynamic.literal()
      PipelineExecutionArn.foreach(__v => __obj.updateDynamic("PipelineExecutionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePipelineExecutionResponse]
    }
  }

  @js.native
  trait UpdatePipelineRequest extends js.Object {
    var PipelineName: PipelineName
    var PipelineDefinition: js.UndefOr[PipelineDefinition]
    var PipelineDescription: js.UndefOr[PipelineDescription]
    var PipelineDisplayName: js.UndefOr[PipelineName]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object UpdatePipelineRequest {
    @inline
    def apply(
        PipelineName: PipelineName,
        PipelineDefinition: js.UndefOr[PipelineDefinition] = js.undefined,
        PipelineDescription: js.UndefOr[PipelineDescription] = js.undefined,
        PipelineDisplayName: js.UndefOr[PipelineName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined
    ): UpdatePipelineRequest = {
      val __obj = js.Dynamic.literal(
        "PipelineName" -> PipelineName.asInstanceOf[js.Any]
      )

      PipelineDefinition.foreach(__v => __obj.updateDynamic("PipelineDefinition")(__v.asInstanceOf[js.Any]))
      PipelineDescription.foreach(__v => __obj.updateDynamic("PipelineDescription")(__v.asInstanceOf[js.Any]))
      PipelineDisplayName.foreach(__v => __obj.updateDynamic("PipelineDisplayName")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePipelineRequest]
    }
  }

  @js.native
  trait UpdatePipelineResponse extends js.Object {
    var PipelineArn: js.UndefOr[PipelineArn]
  }

  object UpdatePipelineResponse {
    @inline
    def apply(
        PipelineArn: js.UndefOr[PipelineArn] = js.undefined
    ): UpdatePipelineResponse = {
      val __obj = js.Dynamic.literal()
      PipelineArn.foreach(__v => __obj.updateDynamic("PipelineArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePipelineResponse]
    }
  }

  @js.native
  trait UpdateTrainingJobRequest extends js.Object {
    var TrainingJobName: TrainingJobName
    var ProfilerConfig: js.UndefOr[ProfilerConfigForUpdate]
    var ProfilerRuleConfigurations: js.UndefOr[ProfilerRuleConfigurations]
  }

  object UpdateTrainingJobRequest {
    @inline
    def apply(
        TrainingJobName: TrainingJobName,
        ProfilerConfig: js.UndefOr[ProfilerConfigForUpdate] = js.undefined,
        ProfilerRuleConfigurations: js.UndefOr[ProfilerRuleConfigurations] = js.undefined
    ): UpdateTrainingJobRequest = {
      val __obj = js.Dynamic.literal(
        "TrainingJobName" -> TrainingJobName.asInstanceOf[js.Any]
      )

      ProfilerConfig.foreach(__v => __obj.updateDynamic("ProfilerConfig")(__v.asInstanceOf[js.Any]))
      ProfilerRuleConfigurations.foreach(__v => __obj.updateDynamic("ProfilerRuleConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTrainingJobRequest]
    }
  }

  @js.native
  trait UpdateTrainingJobResponse extends js.Object {
    var TrainingJobArn: TrainingJobArn
  }

  object UpdateTrainingJobResponse {
    @inline
    def apply(
        TrainingJobArn: TrainingJobArn
    ): UpdateTrainingJobResponse = {
      val __obj = js.Dynamic.literal(
        "TrainingJobArn" -> TrainingJobArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateTrainingJobResponse]
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
        "DomainId" -> DomainId.asInstanceOf[js.Any],
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
    var OidcConfig: js.UndefOr[OidcConfig]
    var SourceIpConfig: js.UndefOr[SourceIpConfig]
  }

  object UpdateWorkforceRequest {
    @inline
    def apply(
        WorkforceName: WorkforceName,
        OidcConfig: js.UndefOr[OidcConfig] = js.undefined,
        SourceIpConfig: js.UndefOr[SourceIpConfig] = js.undefined
    ): UpdateWorkforceRequest = {
      val __obj = js.Dynamic.literal(
        "WorkforceName" -> WorkforceName.asInstanceOf[js.Any]
      )

      OidcConfig.foreach(__v => __obj.updateDynamic("OidcConfig")(__v.asInstanceOf[js.Any]))
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
      NotificationConfiguration.foreach(__v => __obj.updateDynamic("NotificationConfiguration")(__v.asInstanceOf[js.Any]))
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

  /** Information about the user who created or modified an experiment, trial, or trial component.
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

  /** The user profile details.
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

  /** A collection of settings that apply to users of Amazon SageMaker Studio. These settings are specified when the <code>CreateUserProfile</code> API is called, and as <code>DefaultUserSettings</code> when the <code>CreateDomain</code> API is called. <code>SecurityGroups</code> is aggregated when specified in both calls. For all other settings in <code>UserSettings</code>, the values specified in <code>CreateUserProfile</code> take precedence over those specified in <code>CreateDomain</code>.
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

  /** Specifies a production variant property type for an Endpoint. If you are updating an endpoint with the [[UpdateEndpointInput.RetainAllVariantProperties]] option set to <code>true</code>, the <code>VariantProperty</code> objects listed in [[UpdateEndpointInput.ExcludeRetainedVariantProperties]] override the existing variant properties of the endpoint.
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

  /** Specifies a VPC that your training jobs and hosted models have access to. Control access to and from your training and model containers by configuring the VPC. For more information, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html|Protect Endpoints by Using an Amazon Virtual Private Cloud]] and [[https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html|Protect Training Jobs by Using an Amazon Virtual Private Cloud]].
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
        "Subnets" -> Subnets.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VpcConfig]
    }
  }

  /** A single private workforce, which is automatically created when you create your first private work team. You can create one private work force in each AWS Region. By default, any workforce-related API operation used in a specific region will apply to the workforce created in that region. To learn how to create a private workforce, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-create-private.html|Create a Private Workforce]].
    */
  @js.native
  trait Workforce extends js.Object {
    var WorkforceArn: WorkforceArn
    var WorkforceName: WorkforceName
    var CognitoConfig: js.UndefOr[CognitoConfig]
    var CreateDate: js.UndefOr[Timestamp]
    var LastUpdatedDate: js.UndefOr[Timestamp]
    var OidcConfig: js.UndefOr[OidcConfigForResponse]
    var SourceIpConfig: js.UndefOr[SourceIpConfig]
    var SubDomain: js.UndefOr[String]
  }

  object Workforce {
    @inline
    def apply(
        WorkforceArn: WorkforceArn,
        WorkforceName: WorkforceName,
        CognitoConfig: js.UndefOr[CognitoConfig] = js.undefined,
        CreateDate: js.UndefOr[Timestamp] = js.undefined,
        LastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
        OidcConfig: js.UndefOr[OidcConfigForResponse] = js.undefined,
        SourceIpConfig: js.UndefOr[SourceIpConfig] = js.undefined,
        SubDomain: js.UndefOr[String] = js.undefined
    ): Workforce = {
      val __obj = js.Dynamic.literal(
        "WorkforceArn" -> WorkforceArn.asInstanceOf[js.Any],
        "WorkforceName" -> WorkforceName.asInstanceOf[js.Any]
      )

      CognitoConfig.foreach(__v => __obj.updateDynamic("CognitoConfig")(__v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      LastUpdatedDate.foreach(__v => __obj.updateDynamic("LastUpdatedDate")(__v.asInstanceOf[js.Any]))
      OidcConfig.foreach(__v => __obj.updateDynamic("OidcConfig")(__v.asInstanceOf[js.Any]))
      SourceIpConfig.foreach(__v => __obj.updateDynamic("SourceIpConfig")(__v.asInstanceOf[js.Any]))
      SubDomain.foreach(__v => __obj.updateDynamic("SubDomain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Workforce]
    }
  }

  /** Provides details about a labeling work team.
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
    var WorkforceArn: js.UndefOr[WorkforceArn]
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
        SubDomain: js.UndefOr[String] = js.undefined,
        WorkforceArn: js.UndefOr[WorkforceArn] = js.undefined
    ): Workteam = {
      val __obj = js.Dynamic.literal(
        "Description" -> Description.asInstanceOf[js.Any],
        "MemberDefinitions" -> MemberDefinitions.asInstanceOf[js.Any],
        "WorkteamArn" -> WorkteamArn.asInstanceOf[js.Any],
        "WorkteamName" -> WorkteamName.asInstanceOf[js.Any]
      )

      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      LastUpdatedDate.foreach(__v => __obj.updateDynamic("LastUpdatedDate")(__v.asInstanceOf[js.Any]))
      NotificationConfiguration.foreach(__v => __obj.updateDynamic("NotificationConfiguration")(__v.asInstanceOf[js.Any]))
      ProductListingIds.foreach(__v => __obj.updateDynamic("ProductListingIds")(__v.asInstanceOf[js.Any]))
      SubDomain.foreach(__v => __obj.updateDynamic("SubDomain")(__v.asInstanceOf[js.Any]))
      WorkforceArn.foreach(__v => __obj.updateDynamic("WorkforceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Workteam]
    }
  }
}
