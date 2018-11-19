package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object sagemaker {
  type Accept = String
  type AlgorithmImage = String
  type AssemblyType = String
  type BatchStrategy = String
  type CategoricalParameterRanges = js.Array[CategoricalParameterRange]
  type ChannelName = String
  type CompressionType = String
  type ContainerHostname = String
  type ContentType = String
  type ContinuousParameterRanges = js.Array[ContinuousParameterRange]
  type CreationTime = js.Date
  type DeployedImages = js.Array[DeployedImage]
  type DesiredWeightAndCapacityList = js.Array[DesiredWeightAndCapacity]
  type DirectInternetAccess = String
  type DisassociateNotebookInstanceLifecycleConfig = Boolean
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
  type EnvironmentKey = String
  type EnvironmentMap = js.Dictionary[EnvironmentValue]
  type EnvironmentValue = String
  type FailureReason = String
  type FinalMetricDataList = js.Array[MetricData]
  type HyperParameterTrainingJobSummaries = js.Array[HyperParameterTrainingJobSummary]
  type HyperParameterTuningJobArn = String
  type HyperParameterTuningJobName = String
  type HyperParameterTuningJobObjectiveType = String
  type HyperParameterTuningJobSortByOptions = String
  type HyperParameterTuningJobStatus = String
  type HyperParameterTuningJobStrategyType = String
  type HyperParameterTuningJobSummaries = js.Array[HyperParameterTuningJobSummary]
  type HyperParameterTuningJobWarmStartType = String
  type HyperParameters = js.Dictionary[ParameterValue]
  type Image = String
  type InputDataConfig = js.Array[Channel]
  type InstanceType = String
  type IntegerParameterRanges = js.Array[IntegerParameterRange]
  type KmsKeyId = String
  type LastModifiedTime = js.Date
  type ListTagsMaxResults = Int
  type MaxConcurrentTransforms = Int
  type MaxNumberOfTrainingJobs = Int
  type MaxParallelTrainingJobs = Int
  type MaxPayloadInMB = Int
  type MaxResults = Int
  type MaxRuntimeInSeconds = Int
  type MetricDefinitionList = js.Array[MetricDefinition]
  type MetricName = String
  type MetricRegex = String
  type MetricValue = Float
  type ModelArn = String
  type ModelName = String
  type ModelNameContains = String
  type ModelSortKey = String
  type ModelSummaryList = js.Array[ModelSummary]
  type NameContains = String
  type NetworkInterfaceId = String
  type NextToken = String
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
  type ObjectiveStatus = String
  type ObjectiveStatusCounter = Int
  type OrderKey = String
  type PaginationToken = String
  type ParameterKey = String
  type ParameterValue = String
  type ParameterValues = js.Array[ParameterValue]
  type ParentHyperParameterTuningJobs = js.Array[ParentHyperParameterTuningJob]
  type ProductionVariantInstanceType = String
  type ProductionVariantList = js.Array[ProductionVariant]
  type ProductionVariantSummaryList = js.Array[ProductionVariantSummary]
  type RecordWrapper = String
  type ResourceArn = String
  type RoleArn = String
  type S3DataDistribution = String
  type S3DataType = String
  type S3Uri = String
  type SecondaryStatus = String
  type SecondaryStatusTransitions = js.Array[SecondaryStatusTransition]
  type SecurityGroupId = String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type SessionExpirationDurationInSeconds = Int
  type SortBy = String
  type SortOrder = String
  type SplitType = String
  type StatusMessage = String
  type SubnetId = String
  type Subnets = js.Array[SubnetId]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TaskCount = Int
  type Timestamp = js.Date
  type TrainingInputMode = String
  type TrainingInstanceCount = Int
  type TrainingInstanceType = String
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
  type TransformJobArn = String
  type TransformJobName = String
  type TransformJobStatus = String
  type TransformJobSummaries = js.Array[TransformJobSummary]
  type Url = String
  type VariantName = String
  type VariantWeight = Float
  type VolumeSizeInGB = Int
  type VpcSecurityGroupIds = js.Array[SecurityGroupId]
}

package sagemaker {
  @js.native
  @JSImport("aws-sdk", "SageMaker")
  class SageMaker(config: AWSConfig) extends js.Object {
    def addTags(params: AddTagsInput): Request[AddTagsOutput] = js.native
    def createEndpoint(params: CreateEndpointInput): Request[CreateEndpointOutput] = js.native
    def createEndpointConfig(params: CreateEndpointConfigInput): Request[CreateEndpointConfigOutput] = js.native
    def createHyperParameterTuningJob(params: CreateHyperParameterTuningJobRequest): Request[CreateHyperParameterTuningJobResponse] = js.native
    def createModel(params: CreateModelInput): Request[CreateModelOutput] = js.native
    def createNotebookInstance(params: CreateNotebookInstanceInput): Request[CreateNotebookInstanceOutput] = js.native
    def createNotebookInstanceLifecycleConfig(params: CreateNotebookInstanceLifecycleConfigInput): Request[CreateNotebookInstanceLifecycleConfigOutput] = js.native
    def createPresignedNotebookInstanceUrl(params: CreatePresignedNotebookInstanceUrlInput): Request[CreatePresignedNotebookInstanceUrlOutput] = js.native
    def createTrainingJob(params: CreateTrainingJobRequest): Request[CreateTrainingJobResponse] = js.native
    def createTransformJob(params: CreateTransformJobRequest): Request[CreateTransformJobResponse] = js.native
    def deleteEndpoint(params: DeleteEndpointInput): Request[js.Object] = js.native
    def deleteEndpointConfig(params: DeleteEndpointConfigInput): Request[js.Object] = js.native
    def deleteModel(params: DeleteModelInput): Request[js.Object] = js.native
    def deleteNotebookInstance(params: DeleteNotebookInstanceInput): Request[js.Object] = js.native
    def deleteNotebookInstanceLifecycleConfig(params: DeleteNotebookInstanceLifecycleConfigInput): Request[js.Object] = js.native
    def deleteTags(params: DeleteTagsInput): Request[DeleteTagsOutput] = js.native
    def describeEndpoint(params: DescribeEndpointInput): Request[DescribeEndpointOutput] = js.native
    def describeEndpointConfig(params: DescribeEndpointConfigInput): Request[DescribeEndpointConfigOutput] = js.native
    def describeHyperParameterTuningJob(params: DescribeHyperParameterTuningJobRequest): Request[DescribeHyperParameterTuningJobResponse] = js.native
    def describeModel(params: DescribeModelInput): Request[DescribeModelOutput] = js.native
    def describeNotebookInstance(params: DescribeNotebookInstanceInput): Request[DescribeNotebookInstanceOutput] = js.native
    def describeNotebookInstanceLifecycleConfig(params: DescribeNotebookInstanceLifecycleConfigInput): Request[DescribeNotebookInstanceLifecycleConfigOutput] = js.native
    def describeTrainingJob(params: DescribeTrainingJobRequest): Request[DescribeTrainingJobResponse] = js.native
    def describeTransformJob(params: DescribeTransformJobRequest): Request[DescribeTransformJobResponse] = js.native
    def listEndpointConfigs(params: ListEndpointConfigsInput): Request[ListEndpointConfigsOutput] = js.native
    def listEndpoints(params: ListEndpointsInput): Request[ListEndpointsOutput] = js.native
    def listHyperParameterTuningJobs(params: ListHyperParameterTuningJobsRequest): Request[ListHyperParameterTuningJobsResponse] = js.native
    def listModels(params: ListModelsInput): Request[ListModelsOutput] = js.native
    def listNotebookInstanceLifecycleConfigs(params: ListNotebookInstanceLifecycleConfigsInput): Request[ListNotebookInstanceLifecycleConfigsOutput] = js.native
    def listNotebookInstances(params: ListNotebookInstancesInput): Request[ListNotebookInstancesOutput] = js.native
    def listTags(params: ListTagsInput): Request[ListTagsOutput] = js.native
    def listTrainingJobs(params: ListTrainingJobsRequest): Request[ListTrainingJobsResponse] = js.native
    def listTrainingJobsForHyperParameterTuningJob(params: ListTrainingJobsForHyperParameterTuningJobRequest): Request[ListTrainingJobsForHyperParameterTuningJobResponse] = js.native
    def listTransformJobs(params: ListTransformJobsRequest): Request[ListTransformJobsResponse] = js.native
    def startNotebookInstance(params: StartNotebookInstanceInput): Request[js.Object] = js.native
    def stopHyperParameterTuningJob(params: StopHyperParameterTuningJobRequest): Request[js.Object] = js.native
    def stopNotebookInstance(params: StopNotebookInstanceInput): Request[js.Object] = js.native
    def stopTrainingJob(params: StopTrainingJobRequest): Request[js.Object] = js.native
    def stopTransformJob(params: StopTransformJobRequest): Request[js.Object] = js.native
    def updateEndpoint(params: UpdateEndpointInput): Request[UpdateEndpointOutput] = js.native
    def updateEndpointWeightsAndCapacities(params: UpdateEndpointWeightsAndCapacitiesInput): Request[UpdateEndpointWeightsAndCapacitiesOutput] = js.native
    def updateNotebookInstance(params: UpdateNotebookInstanceInput): Request[UpdateNotebookInstanceOutput] = js.native
    def updateNotebookInstanceLifecycleConfig(params: UpdateNotebookInstanceLifecycleConfigInput): Request[UpdateNotebookInstanceLifecycleConfigOutput] = js.native
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

  /**
   * <p>Specifies the training algorithm to use in a <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateTrainingJob.html">CreateTrainingJob</a> request.</p> <p>For more information about algorithms provided by Amazon SageMaker, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. For information about using your own algorithms, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms with Amazon SageMaker</a>. </p>
   */
  @js.native
  trait AlgorithmSpecification extends js.Object {
    var TrainingImage: js.UndefOr[AlgorithmImage]
    var TrainingInputMode: js.UndefOr[TrainingInputMode]
    var MetricDefinitions: js.UndefOr[MetricDefinitionList]
  }

  object AlgorithmSpecification {
    def apply(
      TrainingImage: js.UndefOr[AlgorithmImage] = js.undefined,
      TrainingInputMode: js.UndefOr[TrainingInputMode] = js.undefined,
      MetricDefinitions: js.UndefOr[MetricDefinitionList] = js.undefined): AlgorithmSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrainingImage" -> TrainingImage.map { x => x.asInstanceOf[js.Any] },
        "TrainingInputMode" -> TrainingInputMode.map { x => x.asInstanceOf[js.Any] },
        "MetricDefinitions" -> MetricDefinitions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AlgorithmSpecification]
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
   * <p>A channel is a named input source that training algorithms can consume. </p>
   */
  @js.native
  trait Channel extends js.Object {
    var InputMode: js.UndefOr[TrainingInputMode]
    var ChannelName: js.UndefOr[ChannelName]
    var CompressionType: js.UndefOr[CompressionType]
    var RecordWrapperType: js.UndefOr[RecordWrapper]
    var ContentType: js.UndefOr[ContentType]
    var DataSource: js.UndefOr[DataSource]
  }

  object Channel {
    def apply(
      InputMode: js.UndefOr[TrainingInputMode] = js.undefined,
      ChannelName: js.UndefOr[ChannelName] = js.undefined,
      CompressionType: js.UndefOr[CompressionType] = js.undefined,
      RecordWrapperType: js.UndefOr[RecordWrapper] = js.undefined,
      ContentType: js.UndefOr[ContentType] = js.undefined,
      DataSource: js.UndefOr[DataSource] = js.undefined): Channel = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputMode" -> InputMode.map { x => x.asInstanceOf[js.Any] },
        "ChannelName" -> ChannelName.map { x => x.asInstanceOf[js.Any] },
        "CompressionType" -> CompressionType.map { x => x.asInstanceOf[js.Any] },
        "RecordWrapperType" -> RecordWrapperType.map { x => x.asInstanceOf[js.Any] },
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] },
        "DataSource" -> DataSource.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Channel]
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
    var ContainerHostname: js.UndefOr[ContainerHostname]
    var Image: js.UndefOr[Image]
    var ModelDataUrl: js.UndefOr[Url]
    var Environment: js.UndefOr[EnvironmentMap]
  }

  object ContainerDefinition {
    def apply(
      ContainerHostname: js.UndefOr[ContainerHostname] = js.undefined,
      Image: js.UndefOr[Image] = js.undefined,
      ModelDataUrl: js.UndefOr[Url] = js.undefined,
      Environment: js.UndefOr[EnvironmentMap] = js.undefined): ContainerDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContainerHostname" -> ContainerHostname.map { x => x.asInstanceOf[js.Any] },
        "Image" -> Image.map { x => x.asInstanceOf[js.Any] },
        "ModelDataUrl" -> ModelDataUrl.map { x => x.asInstanceOf[js.Any] },
        "Environment" -> Environment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerDefinition]
    }
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
  trait CreateModelInput extends js.Object {
    var ModelName: js.UndefOr[ModelName]
    var VpcConfig: js.UndefOr[VpcConfig]
    var Tags: js.UndefOr[TagList]
    var PrimaryContainer: js.UndefOr[ContainerDefinition]
    var ExecutionRoleArn: js.UndefOr[RoleArn]
  }

  object CreateModelInput {
    def apply(
      ModelName: js.UndefOr[ModelName] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      PrimaryContainer: js.UndefOr[ContainerDefinition] = js.undefined,
      ExecutionRoleArn: js.UndefOr[RoleArn] = js.undefined): CreateModelInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelName" -> ModelName.map { x => x.asInstanceOf[js.Any] },
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
  trait CreateNotebookInstanceInput extends js.Object {
    var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB]
    var DirectInternetAccess: js.UndefOr[DirectInternetAccess]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var NotebookInstanceName: js.UndefOr[NotebookInstanceName]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var InstanceType: js.UndefOr[InstanceType]
    var Tags: js.UndefOr[TagList]
    var LifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName]
    var RoleArn: js.UndefOr[RoleArn]
    var SubnetId: js.UndefOr[SubnetId]
  }

  object CreateNotebookInstanceInput {
    def apply(
      VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.undefined,
      DirectInternetAccess: js.UndefOr[DirectInternetAccess] = js.undefined,
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      NotebookInstanceName: js.UndefOr[NotebookInstanceName] = js.undefined,
      SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      LifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined,
      SubnetId: js.UndefOr[SubnetId] = js.undefined): CreateNotebookInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeSizeInGB" -> VolumeSizeInGB.map { x => x.asInstanceOf[js.Any] },
        "DirectInternetAccess" -> DirectInternetAccess.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceName" -> NotebookInstanceName.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "LifecycleConfigName" -> LifecycleConfigName.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
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
    var ModelName: js.UndefOr[ModelName]
    var ModelArn: js.UndefOr[ModelArn]
    var VpcConfig: js.UndefOr[VpcConfig]
    var PrimaryContainer: js.UndefOr[ContainerDefinition]
    var ExecutionRoleArn: js.UndefOr[RoleArn]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object DescribeModelOutput {
    def apply(
      ModelName: js.UndefOr[ModelName] = js.undefined,
      ModelArn: js.UndefOr[ModelArn] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined,
      PrimaryContainer: js.UndefOr[ContainerDefinition] = js.undefined,
      ExecutionRoleArn: js.UndefOr[RoleArn] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): DescribeModelOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelName" -> ModelName.map { x => x.asInstanceOf[js.Any] },
        "ModelArn" -> ModelArn.map { x => x.asInstanceOf[js.Any] },
        "VpcConfig" -> VpcConfig.map { x => x.asInstanceOf[js.Any] },
        "PrimaryContainer" -> PrimaryContainer.map { x => x.asInstanceOf[js.Any] },
        "ExecutionRoleArn" -> ExecutionRoleArn.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeModelOutput]
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
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
    var InstanceType: js.UndefOr[InstanceType]
    var FailureReason: js.UndefOr[FailureReason]
    var Url: js.UndefOr[NotebookInstanceUrl]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var RoleArn: js.UndefOr[RoleArn]
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
      LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      Url: js.UndefOr[NotebookInstanceUrl] = js.undefined,
      NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined,
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
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNotebookInstanceOutput]
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
    var TrainingJobArn: js.UndefOr[TrainingJobArn]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var AlgorithmSpecification: js.UndefOr[AlgorithmSpecification]
    var FailureReason: js.UndefOr[FailureReason]
    var VpcConfig: js.UndefOr[VpcConfig]
    var InputDataConfig: js.UndefOr[InputDataConfig]
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
      TrainingJobArn: js.UndefOr[TrainingJobArn] = js.undefined,
      LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
      AlgorithmSpecification: js.UndefOr[AlgorithmSpecification] = js.undefined,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined,
      InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
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
        "TrainingJobArn" -> TrainingJobArn.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "AlgorithmSpecification" -> AlgorithmSpecification.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "VpcConfig" -> VpcConfig.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
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
        "TransformJobArn" -> TransformJobArn.map { x => x.asInstanceOf[js.Any] },
        "TransformStartTime" -> TransformStartTime.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTransformJobResponse]
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

  /**
   * <p>Specifies which training algorithm to use for training jobs that a hyperparameter tuning job launches and the metrics to monitor.</p>
   */
  @js.native
  trait HyperParameterAlgorithmSpecification extends js.Object {
    var TrainingImage: js.UndefOr[AlgorithmImage]
    var TrainingInputMode: js.UndefOr[TrainingInputMode]
    var MetricDefinitions: js.UndefOr[MetricDefinitionList]
  }

  object HyperParameterAlgorithmSpecification {
    def apply(
      TrainingImage: js.UndefOr[AlgorithmImage] = js.undefined,
      TrainingInputMode: js.UndefOr[TrainingInputMode] = js.undefined,
      MetricDefinitions: js.UndefOr[MetricDefinitionList] = js.undefined): HyperParameterAlgorithmSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrainingImage" -> TrainingImage.map { x => x.asInstanceOf[js.Any] },
        "TrainingInputMode" -> TrainingInputMode.map { x => x.asInstanceOf[js.Any] },
        "MetricDefinitions" -> MetricDefinitions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HyperParameterAlgorithmSpecification]
    }
  }

  /**
   * <p>Defines the training jobs launched by a hyperparameter tuning job.</p>
   */
  @js.native
  trait HyperParameterTrainingJobDefinition extends js.Object {
    var StoppingCondition: js.UndefOr[StoppingCondition]
    var ResourceConfig: js.UndefOr[ResourceConfig]
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
      AlgorithmSpecification: js.UndefOr[HyperParameterAlgorithmSpecification] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined,
      InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
      StaticHyperParameters: js.UndefOr[HyperParameters] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined,
      OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined): HyperParameterTrainingJobDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StoppingCondition" -> StoppingCondition.map { x => x.asInstanceOf[js.Any] },
        "ResourceConfig" -> ResourceConfig.map { x => x.asInstanceOf[js.Any] },
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
    var LastModifiedTimeBefore: js.UndefOr[LastModifiedTime]
    var CreationTimeAfter: js.UndefOr[CreationTime]
    var CreationTimeBefore: js.UndefOr[CreationTime]
    var NextToken: js.UndefOr[NextToken]
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
      LastModifiedTimeBefore: js.UndefOr[LastModifiedTime] = js.undefined,
      CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined,
      CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      LastModifiedTimeAfter: js.UndefOr[LastModifiedTime] = js.undefined,
      NotebookInstanceLifecycleConfigNameContains: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined): ListNotebookInstancesInput = {
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
    var LastModifiedTime: js.UndefOr[LastModifiedTime]
    var InstanceType: js.UndefOr[InstanceType]
    var Url: js.UndefOr[NotebookInstanceUrl]
    var CreationTime: js.UndefOr[CreationTime]
  }

  object NotebookInstanceSummary {
    def apply(
      NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined,
      NotebookInstanceName: js.UndefOr[NotebookInstanceName] = js.undefined,
      NotebookInstanceStatus: js.UndefOr[NotebookInstanceStatus] = js.undefined,
      NotebookInstanceArn: js.UndefOr[NotebookInstanceArn] = js.undefined,
      LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      Url: js.UndefOr[NotebookInstanceUrl] = js.undefined,
      CreationTime: js.UndefOr[CreationTime] = js.undefined): NotebookInstanceSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotebookInstanceLifecycleConfigName" -> NotebookInstanceLifecycleConfigName.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceName" -> NotebookInstanceName.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceStatus" -> NotebookInstanceStatus.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceArn" -> NotebookInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] },
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

  object OrderKeyEnum {
    val Ascending = "Ascending"
    val Descending = "Descending"

    val values = IndexedSeq(Ascending, Descending)
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
  }

  object ProductionVariant {
    def apply(
      ModelName: js.UndefOr[ModelName] = js.undefined,
      VariantName: js.UndefOr[VariantName] = js.undefined,
      InitialInstanceCount: js.UndefOr[TaskCount] = js.undefined,
      InstanceType: js.UndefOr[ProductionVariantInstanceType] = js.undefined,
      InitialVariantWeight: js.UndefOr[VariantWeight] = js.undefined): ProductionVariant = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModelName" -> ModelName.map { x => x.asInstanceOf[js.Any] },
        "VariantName" -> VariantName.map { x => x.asInstanceOf[js.Any] },
        "InitialInstanceCount" -> InitialInstanceCount.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "InitialVariantWeight" -> InitialVariantWeight.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProductionVariant]
    }
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

  object RecordWrapperEnum {
    val None = "None"
    val RecordIO = "RecordIO"

    val values = IndexedSeq(None, RecordIO)
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
  }

  object S3DataSource {
    def apply(
      S3DataType: js.UndefOr[S3DataType] = js.undefined,
      S3Uri: js.UndefOr[S3Uri] = js.undefined,
      S3DataDistributionType: js.UndefOr[S3DataDistribution] = js.undefined): S3DataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3DataType" -> S3DataType.map { x => x.asInstanceOf[js.Any] },
        "S3Uri" -> S3Uri.map { x => x.asInstanceOf[js.Any] },
        "S3DataDistributionType" -> S3DataDistributionType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3DataSource]
    }
  }

  object S3DataTypeEnum {
    val ManifestFile = "ManifestFile"
    val S3Prefix = "S3Prefix"

    val values = IndexedSeq(ManifestFile, S3Prefix)
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
   * <p>Specifies how long model training can run. When model training reaches the limit, Amazon SageMaker ends the training job. Use this API to cap model training cost.</p> <p>To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal, which delays job termination for120 seconds. Algorithms might use this 120-second window to save the model artifacts, so the results of training is not lost. </p> <p>Training algorithms provided by Amazon SageMaker automatically saves the intermediate results of a model training job (it is best effort case, as model might not be ready to save as some stages, for example training just started). This intermediate data is a valid model artifact. You can use it to create a model (<code>CreateModel</code>). </p>
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
    var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB]
    var NotebookInstanceName: js.UndefOr[NotebookInstanceName]
    var InstanceType: js.UndefOr[InstanceType]
    var DisassociateLifecycleConfig: js.UndefOr[DisassociateNotebookInstanceLifecycleConfig]
    var LifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object UpdateNotebookInstanceInput {
    def apply(
      VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.undefined,
      NotebookInstanceName: js.UndefOr[NotebookInstanceName] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      DisassociateLifecycleConfig: js.UndefOr[DisassociateNotebookInstanceLifecycleConfig] = js.undefined,
      LifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined): UpdateNotebookInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeSizeInGB" -> VolumeSizeInGB.map { x => x.asInstanceOf[js.Any] },
        "NotebookInstanceName" -> NotebookInstanceName.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "DisassociateLifecycleConfig" -> DisassociateLifecycleConfig.map { x => x.asInstanceOf[js.Any] },
        "LifecycleConfigName" -> LifecycleConfigName.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
}
