package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object pipes {
  type Arn = String
  type ArnOrJsonPath = String
  type ArnOrUrl = String
  type BatchArraySize = Int
  type BatchDependsOn = js.Array[BatchJobDependency]
  type BatchEnvironmentVariableList = js.Array[BatchEnvironmentVariable]
  type BatchParametersMap = js.Dictionary[String]
  type BatchResourceRequirementsList = js.Array[BatchResourceRequirement]
  type BatchRetryAttempts = Int
  type CapacityProvider = String
  type CapacityProviderStrategy = js.Array[CapacityProviderStrategyItem]
  type CapacityProviderStrategyItemBase = Int
  type CapacityProviderStrategyItemWeight = Int
  type Database = String
  type DbUser = String
  type EcsContainerOverrideList = js.Array[EcsContainerOverride]
  type EcsEnvironmentFileList = js.Array[EcsEnvironmentFile]
  type EcsEnvironmentVariableList = js.Array[EcsEnvironmentVariable]
  type EcsInferenceAcceleratorOverrideList = js.Array[EcsInferenceAcceleratorOverride]
  type EcsResourceRequirementsList = js.Array[EcsResourceRequirement]
  type EndpointString = String
  type EphemeralStorageSize = Int
  type EventBridgeDetailType = String
  type EventBridgeEndpointId = String
  type EventBridgeEventResourceList = js.Array[ArnOrJsonPath]
  type EventBridgeEventSource = String
  type EventPattern = String
  type FilterList = js.Array[Filter]
  type HeaderKey = String
  type HeaderParametersMap = js.Dictionary[HeaderValue]
  type HeaderValue = String
  type InputTemplate = String
  type JsonPath = String
  type KafkaBootstrapServers = js.Array[EndpointString]
  type KafkaTopicName = String
  type KinesisPartitionKey = String
  type LimitMax10 = Int
  type LimitMax100 = Int
  type LimitMax1000 = Int
  type LimitMax10000 = Int
  type LimitMin1 = Int
  type LogStreamName = String
  type MQBrokerQueueName = String
  type MaximumBatchingWindowInSeconds = Int
  type MaximumRecordAgeInSeconds = Int
  type MaximumRetryAttemptsESM = Int
  type MessageDeduplicationId = String
  type MessageGroupId = String
  type NextToken = String
  type OptionalArn = String
  type PathParameter = String
  type PathParameterList = js.Array[PathParameter]
  type PipeArn = String
  type PipeDescription = String
  type PipeList = js.Array[Pipe]
  type PipeName = String
  type PipeStateReason = String
  type PlacementConstraintExpression = String
  type PlacementConstraints = js.Array[PlacementConstraint]
  type PlacementStrategies = js.Array[PlacementStrategy]
  type PlacementStrategyField = String
  type QueryStringKey = String
  type QueryStringParametersMap = js.Dictionary[QueryStringValue]
  type QueryStringValue = String
  type ReferenceId = String
  type ResourceArn = String
  type RoleArn = String
  type SageMakerPipelineParameterList = js.Array[SageMakerPipelineParameter]
  type SageMakerPipelineParameterName = String
  type SageMakerPipelineParameterValue = String
  type SecretManagerArn = String
  type SecretManagerArnOrJsonPath = String
  type SecurityGroup = String
  type SecurityGroupId = String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type SecurityGroups = js.Array[SecurityGroup]
  type Sql = String
  type Sqls = js.Array[Sql]
  type StatementName = String
  type StringList = js.Array[String]
  type Subnet = String
  type SubnetId = String
  type SubnetIds = js.Array[SubnetId]
  type Subnets = js.Array[Subnet]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Timestamp = js.Date
  type URI = String

  final class PipesOps(private val service: Pipes) extends AnyVal {

    @inline def createPipeFuture(params: CreatePipeRequest): Future[CreatePipeResponse] = service.createPipe(params).promise().toFuture
    @inline def deletePipeFuture(params: DeletePipeRequest): Future[DeletePipeResponse] = service.deletePipe(params).promise().toFuture
    @inline def describePipeFuture(params: DescribePipeRequest): Future[DescribePipeResponse] = service.describePipe(params).promise().toFuture
    @inline def listPipesFuture(params: ListPipesRequest): Future[ListPipesResponse] = service.listPipes(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def startPipeFuture(params: StartPipeRequest): Future[StartPipeResponse] = service.startPipe(params).promise().toFuture
    @inline def stopPipeFuture(params: StopPipeRequest): Future[StopPipeResponse] = service.stopPipe(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updatePipeFuture(params: UpdatePipeRequest): Future[UpdatePipeResponse] = service.updatePipe(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/pipes", JSImport.Namespace, "AWS.Pipes")
  class Pipes() extends js.Object {
    def this(config: AWSConfig) = this()

    def createPipe(params: CreatePipeRequest): Request[CreatePipeResponse] = js.native
    def deletePipe(params: DeletePipeRequest): Request[DeletePipeResponse] = js.native
    def describePipe(params: DescribePipeRequest): Request[DescribePipeResponse] = js.native
    def listPipes(params: ListPipesRequest): Request[ListPipesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def startPipe(params: StartPipeRequest): Request[StartPipeResponse] = js.native
    def stopPipe(params: StopPipeRequest): Request[StopPipeResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updatePipe(params: UpdatePipeRequest): Request[UpdatePipeResponse] = js.native
  }
  object Pipes {
    @inline implicit def toOps(service: Pipes): PipesOps = {
      new PipesOps(service)
    }
  }

  /** This structure specifies the VPC subnets and security groups for the task, and whether a public IP address is to be used. This structure is relevant only for ECS tasks that use the <code>awsvpc</code> network mode.
    */
  @js.native
  trait AwsVpcConfiguration extends js.Object {
    var Subnets: Subnets
    var AssignPublicIp: js.UndefOr[AssignPublicIp]
    var SecurityGroups: js.UndefOr[SecurityGroups]
  }

  object AwsVpcConfiguration {
    @inline
    def apply(
        Subnets: Subnets,
        AssignPublicIp: js.UndefOr[AssignPublicIp] = js.undefined,
        SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined
    ): AwsVpcConfiguration = {
      val __obj = js.Dynamic.literal(
        "Subnets" -> Subnets.asInstanceOf[js.Any]
      )

      AssignPublicIp.foreach(__v => __obj.updateDynamic("AssignPublicIp")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsVpcConfiguration]
    }
  }

  /** The array properties for the submitted job, such as the size of the array. The array size can be between 2 and 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used only if the target is an Batch job.
    */
  @js.native
  trait BatchArrayProperties extends js.Object {
    var Size: js.UndefOr[BatchArraySize]
  }

  object BatchArrayProperties {
    @inline
    def apply(
        Size: js.UndefOr[BatchArraySize] = js.undefined
    ): BatchArrayProperties = {
      val __obj = js.Dynamic.literal()
      Size.foreach(__v => __obj.updateDynamic("Size")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchArrayProperties]
    }
  }

  /** The overrides that are sent to a container.
    */
  @js.native
  trait BatchContainerOverrides extends js.Object {
    var Command: js.UndefOr[StringList]
    var Environment: js.UndefOr[BatchEnvironmentVariableList]
    var InstanceType: js.UndefOr[String]
    var ResourceRequirements: js.UndefOr[BatchResourceRequirementsList]
  }

  object BatchContainerOverrides {
    @inline
    def apply(
        Command: js.UndefOr[StringList] = js.undefined,
        Environment: js.UndefOr[BatchEnvironmentVariableList] = js.undefined,
        InstanceType: js.UndefOr[String] = js.undefined,
        ResourceRequirements: js.UndefOr[BatchResourceRequirementsList] = js.undefined
    ): BatchContainerOverrides = {
      val __obj = js.Dynamic.literal()
      Command.foreach(__v => __obj.updateDynamic("Command")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      ResourceRequirements.foreach(__v => __obj.updateDynamic("ResourceRequirements")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchContainerOverrides]
    }
  }

  /** The environment variables to send to the container. You can add new environment variables, which are added to the container at launch, or you can override the existing environment variables from the Docker image or the task definition.
    *
    * '''Note:'''Environment variables cannot start with "<code>Batch</code>". This naming convention is reserved for variables that Batch sets.
    */
  @js.native
  trait BatchEnvironmentVariable extends js.Object {
    var Name: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object BatchEnvironmentVariable {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): BatchEnvironmentVariable = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchEnvironmentVariable]
    }
  }

  /** An object that represents an Batch job dependency.
    */
  @js.native
  trait BatchJobDependency extends js.Object {
    var JobId: js.UndefOr[String]
    var Type: js.UndefOr[BatchJobDependencyType]
  }

  object BatchJobDependency {
    @inline
    def apply(
        JobId: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[BatchJobDependencyType] = js.undefined
    ): BatchJobDependency = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchJobDependency]
    }
  }

  /** The type and amount of a resource to assign to a container. The supported resources include <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
    */
  @js.native
  trait BatchResourceRequirement extends js.Object {
    var Type: BatchResourceRequirementType
    var Value: String
  }

  object BatchResourceRequirement {
    @inline
    def apply(
        Type: BatchResourceRequirementType,
        Value: String
    ): BatchResourceRequirement = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchResourceRequirement]
    }
  }

  /** The retry strategy that's associated with a job. For more information, see [[https://docs.aws.amazon.com/batch/latest/userguide/job_retries.html| Automated job retries]] in the <i>Batch User Guide</i>.
    */
  @js.native
  trait BatchRetryStrategy extends js.Object {
    var Attempts: js.UndefOr[BatchRetryAttempts]
  }

  object BatchRetryStrategy {
    @inline
    def apply(
        Attempts: js.UndefOr[BatchRetryAttempts] = js.undefined
    ): BatchRetryStrategy = {
      val __obj = js.Dynamic.literal()
      Attempts.foreach(__v => __obj.updateDynamic("Attempts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchRetryStrategy]
    }
  }

  /** The details of a capacity provider strategy. To learn more, see [[https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CapacityProviderStrategyItem.html|CapacityProviderStrategyItem]] in the Amazon ECS API Reference.
    */
  @js.native
  trait CapacityProviderStrategyItem extends js.Object {
    var capacityProvider: CapacityProvider
    var base: js.UndefOr[CapacityProviderStrategyItemBase]
    var weight: js.UndefOr[CapacityProviderStrategyItemWeight]
  }

  object CapacityProviderStrategyItem {
    @inline
    def apply(
        capacityProvider: CapacityProvider,
        base: js.UndefOr[CapacityProviderStrategyItemBase] = js.undefined,
        weight: js.UndefOr[CapacityProviderStrategyItemWeight] = js.undefined
    ): CapacityProviderStrategyItem = {
      val __obj = js.Dynamic.literal(
        "capacityProvider" -> capacityProvider.asInstanceOf[js.Any]
      )

      base.foreach(__v => __obj.updateDynamic("base")(__v.asInstanceOf[js.Any]))
      weight.foreach(__v => __obj.updateDynamic("weight")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CapacityProviderStrategyItem]
    }
  }

  @js.native
  trait CreatePipeRequest extends js.Object {
    var Name: PipeName
    var RoleArn: RoleArn
    var Source: ArnOrUrl
    var Target: Arn
    var Description: js.UndefOr[PipeDescription]
    var DesiredState: js.UndefOr[RequestedPipeState]
    var Enrichment: js.UndefOr[OptionalArn]
    var EnrichmentParameters: js.UndefOr[PipeEnrichmentParameters]
    var SourceParameters: js.UndefOr[PipeSourceParameters]
    var Tags: js.UndefOr[TagMap]
    var TargetParameters: js.UndefOr[PipeTargetParameters]
  }

  object CreatePipeRequest {
    @inline
    def apply(
        Name: PipeName,
        RoleArn: RoleArn,
        Source: ArnOrUrl,
        Target: Arn,
        Description: js.UndefOr[PipeDescription] = js.undefined,
        DesiredState: js.UndefOr[RequestedPipeState] = js.undefined,
        Enrichment: js.UndefOr[OptionalArn] = js.undefined,
        EnrichmentParameters: js.UndefOr[PipeEnrichmentParameters] = js.undefined,
        SourceParameters: js.UndefOr[PipeSourceParameters] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        TargetParameters: js.UndefOr[PipeTargetParameters] = js.undefined
    ): CreatePipeRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "Source" -> Source.asInstanceOf[js.Any],
        "Target" -> Target.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DesiredState.foreach(__v => __obj.updateDynamic("DesiredState")(__v.asInstanceOf[js.Any]))
      Enrichment.foreach(__v => __obj.updateDynamic("Enrichment")(__v.asInstanceOf[js.Any]))
      EnrichmentParameters.foreach(__v => __obj.updateDynamic("EnrichmentParameters")(__v.asInstanceOf[js.Any]))
      SourceParameters.foreach(__v => __obj.updateDynamic("SourceParameters")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TargetParameters.foreach(__v => __obj.updateDynamic("TargetParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePipeRequest]
    }
  }

  @js.native
  trait CreatePipeResponse extends js.Object {
    var Arn: js.UndefOr[PipeArn]
    var CreationTime: js.UndefOr[Timestamp]
    var CurrentState: js.UndefOr[PipeState]
    var DesiredState: js.UndefOr[RequestedPipeState]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[PipeName]
  }

  object CreatePipeResponse {
    @inline
    def apply(
        Arn: js.UndefOr[PipeArn] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        CurrentState: js.UndefOr[PipeState] = js.undefined,
        DesiredState: js.UndefOr[RequestedPipeState] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[PipeName] = js.undefined
    ): CreatePipeResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CurrentState.foreach(__v => __obj.updateDynamic("CurrentState")(__v.asInstanceOf[js.Any]))
      DesiredState.foreach(__v => __obj.updateDynamic("DesiredState")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePipeResponse]
    }
  }

  /** A <code>DeadLetterConfig</code> object that contains information about a dead-letter queue configuration.
    */
  @js.native
  trait DeadLetterConfig extends js.Object {
    var Arn: js.UndefOr[Arn]
  }

  object DeadLetterConfig {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined
    ): DeadLetterConfig = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeadLetterConfig]
    }
  }

  @js.native
  trait DeletePipeRequest extends js.Object {
    var Name: PipeName
  }

  object DeletePipeRequest {
    @inline
    def apply(
        Name: PipeName
    ): DeletePipeRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePipeRequest]
    }
  }

  @js.native
  trait DeletePipeResponse extends js.Object {
    var Arn: js.UndefOr[PipeArn]
    var CreationTime: js.UndefOr[Timestamp]
    var CurrentState: js.UndefOr[PipeState]
    var DesiredState: js.UndefOr[RequestedPipeStateDescribeResponse]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[PipeName]
  }

  object DeletePipeResponse {
    @inline
    def apply(
        Arn: js.UndefOr[PipeArn] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        CurrentState: js.UndefOr[PipeState] = js.undefined,
        DesiredState: js.UndefOr[RequestedPipeStateDescribeResponse] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[PipeName] = js.undefined
    ): DeletePipeResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CurrentState.foreach(__v => __obj.updateDynamic("CurrentState")(__v.asInstanceOf[js.Any]))
      DesiredState.foreach(__v => __obj.updateDynamic("DesiredState")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePipeResponse]
    }
  }

  @js.native
  trait DescribePipeRequest extends js.Object {
    var Name: PipeName
  }

  object DescribePipeRequest {
    @inline
    def apply(
        Name: PipeName
    ): DescribePipeRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribePipeRequest]
    }
  }

  @js.native
  trait DescribePipeResponse extends js.Object {
    var Arn: js.UndefOr[PipeArn]
    var CreationTime: js.UndefOr[Timestamp]
    var CurrentState: js.UndefOr[PipeState]
    var Description: js.UndefOr[PipeDescription]
    var DesiredState: js.UndefOr[RequestedPipeStateDescribeResponse]
    var Enrichment: js.UndefOr[OptionalArn]
    var EnrichmentParameters: js.UndefOr[PipeEnrichmentParameters]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[PipeName]
    var RoleArn: js.UndefOr[RoleArn]
    var Source: js.UndefOr[ArnOrUrl]
    var SourceParameters: js.UndefOr[PipeSourceParameters]
    var StateReason: js.UndefOr[PipeStateReason]
    var Tags: js.UndefOr[TagMap]
    var Target: js.UndefOr[Arn]
    var TargetParameters: js.UndefOr[PipeTargetParameters]
  }

  object DescribePipeResponse {
    @inline
    def apply(
        Arn: js.UndefOr[PipeArn] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        CurrentState: js.UndefOr[PipeState] = js.undefined,
        Description: js.UndefOr[PipeDescription] = js.undefined,
        DesiredState: js.UndefOr[RequestedPipeStateDescribeResponse] = js.undefined,
        Enrichment: js.UndefOr[OptionalArn] = js.undefined,
        EnrichmentParameters: js.UndefOr[PipeEnrichmentParameters] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[PipeName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        Source: js.UndefOr[ArnOrUrl] = js.undefined,
        SourceParameters: js.UndefOr[PipeSourceParameters] = js.undefined,
        StateReason: js.UndefOr[PipeStateReason] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        Target: js.UndefOr[Arn] = js.undefined,
        TargetParameters: js.UndefOr[PipeTargetParameters] = js.undefined
    ): DescribePipeResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CurrentState.foreach(__v => __obj.updateDynamic("CurrentState")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DesiredState.foreach(__v => __obj.updateDynamic("DesiredState")(__v.asInstanceOf[js.Any]))
      Enrichment.foreach(__v => __obj.updateDynamic("Enrichment")(__v.asInstanceOf[js.Any]))
      EnrichmentParameters.foreach(__v => __obj.updateDynamic("EnrichmentParameters")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      SourceParameters.foreach(__v => __obj.updateDynamic("SourceParameters")(__v.asInstanceOf[js.Any]))
      StateReason.foreach(__v => __obj.updateDynamic("StateReason")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      TargetParameters.foreach(__v => __obj.updateDynamic("TargetParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePipeResponse]
    }
  }

  /** The overrides that are sent to a container. An empty container override can be passed in. An example of an empty container override is <code>{"containerOverrides": [ ] }</code>. If a non-empty container override is specified, the <code>name</code> parameter must be included.
    */
  @js.native
  trait EcsContainerOverride extends js.Object {
    var Command: js.UndefOr[StringList]
    var Cpu: js.UndefOr[Int]
    var Environment: js.UndefOr[EcsEnvironmentVariableList]
    var EnvironmentFiles: js.UndefOr[EcsEnvironmentFileList]
    var Memory: js.UndefOr[Int]
    var MemoryReservation: js.UndefOr[Int]
    var Name: js.UndefOr[String]
    var ResourceRequirements: js.UndefOr[EcsResourceRequirementsList]
  }

  object EcsContainerOverride {
    @inline
    def apply(
        Command: js.UndefOr[StringList] = js.undefined,
        Cpu: js.UndefOr[Int] = js.undefined,
        Environment: js.UndefOr[EcsEnvironmentVariableList] = js.undefined,
        EnvironmentFiles: js.UndefOr[EcsEnvironmentFileList] = js.undefined,
        Memory: js.UndefOr[Int] = js.undefined,
        MemoryReservation: js.UndefOr[Int] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        ResourceRequirements: js.UndefOr[EcsResourceRequirementsList] = js.undefined
    ): EcsContainerOverride = {
      val __obj = js.Dynamic.literal()
      Command.foreach(__v => __obj.updateDynamic("Command")(__v.asInstanceOf[js.Any]))
      Cpu.foreach(__v => __obj.updateDynamic("Cpu")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      EnvironmentFiles.foreach(__v => __obj.updateDynamic("EnvironmentFiles")(__v.asInstanceOf[js.Any]))
      Memory.foreach(__v => __obj.updateDynamic("Memory")(__v.asInstanceOf[js.Any]))
      MemoryReservation.foreach(__v => __obj.updateDynamic("MemoryReservation")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ResourceRequirements.foreach(__v => __obj.updateDynamic("ResourceRequirements")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EcsContainerOverride]
    }
  }

  /** A list of files containing the environment variables to pass to a container. You can specify up to ten environment files. The file must have a <code>.env</code> file extension. Each line in an environment file should contain an environment variable in <code>VARIABLE=VALUE</code> format. Lines beginning with <code>#</code> are treated as comments and are ignored. For more information about the environment variable file syntax, see [[https://docs.docker.com/compose/env-file/|Declare default environment variables in file]]. If there are environment variables specified using the <code>environment</code> parameter in a container definition, they take precedence over the variables contained within an environment file. If multiple environment files are specified that contain the same variable, they're processed from the top down. We recommend that you use unique variable names. For more information, see
    * [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html|Specifying environment variables]] in the <i>Amazon Elastic Container Service Developer Guide</i>. This parameter is only supported for tasks hosted on Fargate using the following platform versions: * Linux platform version <code>1.4.0</code> or later. * Windows platform version <code>1.0.0</code> or later.
    */
  @js.native
  trait EcsEnvironmentFile extends js.Object {
    var `type`: EcsEnvironmentFileType
    var value: String
  }

  object EcsEnvironmentFile {
    @inline
    def apply(
        `type`: EcsEnvironmentFileType,
        value: String
    ): EcsEnvironmentFile = {
      val __obj = js.Dynamic.literal(
        "type" -> `type`.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EcsEnvironmentFile]
    }
  }

  /** The environment variables to send to the container. You can add new environment variables, which are added to the container at launch, or you can override the existing environment variables from the Docker image or the task definition. You must also specify a container name.
    */
  @js.native
  trait EcsEnvironmentVariable extends js.Object {
    var name: js.UndefOr[String]
    var value: js.UndefOr[String]
  }

  object EcsEnvironmentVariable {
    @inline
    def apply(
        name: js.UndefOr[String] = js.undefined,
        value: js.UndefOr[String] = js.undefined
    ): EcsEnvironmentVariable = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EcsEnvironmentVariable]
    }
  }

  /** The amount of ephemeral storage to allocate for the task. This parameter is used to expand the total amount of ephemeral storage available, beyond the default amount, for tasks hosted on Fargate. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/userguide/using_data_volumes.html|Fargate task storage]] in the <i>Amazon ECS User Guide for Fargate</i>.
    *
    * '''Note:'''This parameter is only supported for tasks hosted on Fargate using Linux platform version <code>1.4.0</code> or later. This parameter is not supported for Windows containers on Fargate.
    */
  @js.native
  trait EcsEphemeralStorage extends js.Object {
    var sizeInGiB: EphemeralStorageSize
  }

  object EcsEphemeralStorage {
    @inline
    def apply(
        sizeInGiB: EphemeralStorageSize
    ): EcsEphemeralStorage = {
      val __obj = js.Dynamic.literal(
        "sizeInGiB" -> sizeInGiB.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EcsEphemeralStorage]
    }
  }

  /** Details on an Elastic Inference accelerator task override. This parameter is used to override the Elastic Inference accelerator specified in the task definition. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/userguide/ecs-inference.html|Working with Amazon Elastic Inference on Amazon ECS]] in the <i>Amazon Elastic Container Service Developer Guide</i>.
    */
  @js.native
  trait EcsInferenceAcceleratorOverride extends js.Object {
    var deviceName: js.UndefOr[String]
    var deviceType: js.UndefOr[String]
  }

  object EcsInferenceAcceleratorOverride {
    @inline
    def apply(
        deviceName: js.UndefOr[String] = js.undefined,
        deviceType: js.UndefOr[String] = js.undefined
    ): EcsInferenceAcceleratorOverride = {
      val __obj = js.Dynamic.literal()
      deviceName.foreach(__v => __obj.updateDynamic("deviceName")(__v.asInstanceOf[js.Any]))
      deviceType.foreach(__v => __obj.updateDynamic("deviceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EcsInferenceAcceleratorOverride]
    }
  }

  /** The type and amount of a resource to assign to a container. The supported resource types are GPUs and Elastic Inference accelerators. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-gpu.html|Working with GPUs on Amazon ECS]] or [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-inference.html|Working with Amazon Elastic Inference on Amazon ECS]] in the <i>Amazon Elastic Container Service Developer Guide</i>
    */
  @js.native
  trait EcsResourceRequirement extends js.Object {
    var `type`: EcsResourceRequirementType
    var value: String
  }

  object EcsResourceRequirement {
    @inline
    def apply(
        `type`: EcsResourceRequirementType,
        value: String
    ): EcsResourceRequirement = {
      val __obj = js.Dynamic.literal(
        "type" -> `type`.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EcsResourceRequirement]
    }
  }

  /** The overrides that are associated with a task.
    */
  @js.native
  trait EcsTaskOverride extends js.Object {
    var ContainerOverrides: js.UndefOr[EcsContainerOverrideList]
    var Cpu: js.UndefOr[String]
    var EphemeralStorage: js.UndefOr[EcsEphemeralStorage]
    var ExecutionRoleArn: js.UndefOr[ArnOrJsonPath]
    var InferenceAcceleratorOverrides: js.UndefOr[EcsInferenceAcceleratorOverrideList]
    var Memory: js.UndefOr[String]
    var TaskRoleArn: js.UndefOr[ArnOrJsonPath]
  }

  object EcsTaskOverride {
    @inline
    def apply(
        ContainerOverrides: js.UndefOr[EcsContainerOverrideList] = js.undefined,
        Cpu: js.UndefOr[String] = js.undefined,
        EphemeralStorage: js.UndefOr[EcsEphemeralStorage] = js.undefined,
        ExecutionRoleArn: js.UndefOr[ArnOrJsonPath] = js.undefined,
        InferenceAcceleratorOverrides: js.UndefOr[EcsInferenceAcceleratorOverrideList] = js.undefined,
        Memory: js.UndefOr[String] = js.undefined,
        TaskRoleArn: js.UndefOr[ArnOrJsonPath] = js.undefined
    ): EcsTaskOverride = {
      val __obj = js.Dynamic.literal()
      ContainerOverrides.foreach(__v => __obj.updateDynamic("ContainerOverrides")(__v.asInstanceOf[js.Any]))
      Cpu.foreach(__v => __obj.updateDynamic("Cpu")(__v.asInstanceOf[js.Any]))
      EphemeralStorage.foreach(__v => __obj.updateDynamic("EphemeralStorage")(__v.asInstanceOf[js.Any]))
      ExecutionRoleArn.foreach(__v => __obj.updateDynamic("ExecutionRoleArn")(__v.asInstanceOf[js.Any]))
      InferenceAcceleratorOverrides.foreach(__v => __obj.updateDynamic("InferenceAcceleratorOverrides")(__v.asInstanceOf[js.Any]))
      Memory.foreach(__v => __obj.updateDynamic("Memory")(__v.asInstanceOf[js.Any]))
      TaskRoleArn.foreach(__v => __obj.updateDynamic("TaskRoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EcsTaskOverride]
    }
  }

  /** Filter events using an event pattern. For more information, see [[https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html|Events and Event Patterns]] in the <i>Amazon EventBridge User Guide</i>.
    */
  @js.native
  trait Filter extends js.Object {
    var Pattern: js.UndefOr[EventPattern]
  }

  object Filter {
    @inline
    def apply(
        Pattern: js.UndefOr[EventPattern] = js.undefined
    ): Filter = {
      val __obj = js.Dynamic.literal()
      Pattern.foreach(__v => __obj.updateDynamic("Pattern")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filter]
    }
  }

  /** The collection of event patterns used to filter events. For more information, see [[https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html|Events and Event Patterns]] in the <i>Amazon EventBridge User Guide</i>.
    */
  @js.native
  trait FilterCriteria extends js.Object {
    var Filters: js.UndefOr[FilterList]
  }

  object FilterCriteria {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined
    ): FilterCriteria = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterCriteria]
    }
  }

  @js.native
  trait ListPipesRequest extends js.Object {
    var CurrentState: js.UndefOr[PipeState]
    var DesiredState: js.UndefOr[RequestedPipeState]
    var Limit: js.UndefOr[LimitMax100]
    var NamePrefix: js.UndefOr[PipeName]
    var NextToken: js.UndefOr[NextToken]
    var SourcePrefix: js.UndefOr[ResourceArn]
    var TargetPrefix: js.UndefOr[ResourceArn]
  }

  object ListPipesRequest {
    @inline
    def apply(
        CurrentState: js.UndefOr[PipeState] = js.undefined,
        DesiredState: js.UndefOr[RequestedPipeState] = js.undefined,
        Limit: js.UndefOr[LimitMax100] = js.undefined,
        NamePrefix: js.UndefOr[PipeName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SourcePrefix: js.UndefOr[ResourceArn] = js.undefined,
        TargetPrefix: js.UndefOr[ResourceArn] = js.undefined
    ): ListPipesRequest = {
      val __obj = js.Dynamic.literal()
      CurrentState.foreach(__v => __obj.updateDynamic("CurrentState")(__v.asInstanceOf[js.Any]))
      DesiredState.foreach(__v => __obj.updateDynamic("DesiredState")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NamePrefix.foreach(__v => __obj.updateDynamic("NamePrefix")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SourcePrefix.foreach(__v => __obj.updateDynamic("SourcePrefix")(__v.asInstanceOf[js.Any]))
      TargetPrefix.foreach(__v => __obj.updateDynamic("TargetPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipesRequest]
    }
  }

  @js.native
  trait ListPipesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Pipes: js.UndefOr[PipeList]
  }

  object ListPipesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Pipes: js.UndefOr[PipeList] = js.undefined
    ): ListPipesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Pipes.foreach(__v => __obj.updateDynamic("Pipes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: PipeArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: PipeArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** The Secrets Manager secret that stores your broker credentials.
    */
  @js.native
  trait MQBrokerAccessCredentials extends js.Object {
    var BasicAuth: js.UndefOr[SecretManagerArn]
  }

  object MQBrokerAccessCredentials {
    @inline
    def apply(
        BasicAuth: js.UndefOr[SecretManagerArn] = js.undefined
    ): MQBrokerAccessCredentials = {
      val __obj = js.Dynamic.literal()
      BasicAuth.foreach(__v => __obj.updateDynamic("BasicAuth")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MQBrokerAccessCredentials]
    }
  }

  /** The Secrets Manager secret that stores your stream credentials.
    */
  @js.native
  trait MSKAccessCredentials extends js.Object {
    var ClientCertificateTlsAuth: js.UndefOr[SecretManagerArn]
    var SaslScram512Auth: js.UndefOr[SecretManagerArn]
  }

  object MSKAccessCredentials {
    @inline
    def apply(
        ClientCertificateTlsAuth: js.UndefOr[SecretManagerArn] = js.undefined,
        SaslScram512Auth: js.UndefOr[SecretManagerArn] = js.undefined
    ): MSKAccessCredentials = {
      val __obj = js.Dynamic.literal()
      ClientCertificateTlsAuth.foreach(__v => __obj.updateDynamic("ClientCertificateTlsAuth")(__v.asInstanceOf[js.Any]))
      SaslScram512Auth.foreach(__v => __obj.updateDynamic("SaslScram512Auth")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MSKAccessCredentials]
    }
  }

  /** This structure specifies the network configuration for an Amazon ECS task.
    */
  @js.native
  trait NetworkConfiguration extends js.Object {
    var awsvpcConfiguration: js.UndefOr[AwsVpcConfiguration]
  }

  object NetworkConfiguration {
    @inline
    def apply(
        awsvpcConfiguration: js.UndefOr[AwsVpcConfiguration] = js.undefined
    ): NetworkConfiguration = {
      val __obj = js.Dynamic.literal()
      awsvpcConfiguration.foreach(__v => __obj.updateDynamic("awsvpcConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkConfiguration]
    }
  }

  /** An object that represents a pipe. Amazon EventBridgePipes connect event sources to targets and reduces the need for specialized knowledge and integration code.
    */
  @js.native
  trait Pipe extends js.Object {
    var Arn: js.UndefOr[PipeArn]
    var CreationTime: js.UndefOr[Timestamp]
    var CurrentState: js.UndefOr[PipeState]
    var DesiredState: js.UndefOr[RequestedPipeState]
    var Enrichment: js.UndefOr[OptionalArn]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[PipeName]
    var Source: js.UndefOr[ArnOrUrl]
    var StateReason: js.UndefOr[PipeStateReason]
    var Target: js.UndefOr[Arn]
  }

  object Pipe {
    @inline
    def apply(
        Arn: js.UndefOr[PipeArn] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        CurrentState: js.UndefOr[PipeState] = js.undefined,
        DesiredState: js.UndefOr[RequestedPipeState] = js.undefined,
        Enrichment: js.UndefOr[OptionalArn] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[PipeName] = js.undefined,
        Source: js.UndefOr[ArnOrUrl] = js.undefined,
        StateReason: js.UndefOr[PipeStateReason] = js.undefined,
        Target: js.UndefOr[Arn] = js.undefined
    ): Pipe = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CurrentState.foreach(__v => __obj.updateDynamic("CurrentState")(__v.asInstanceOf[js.Any]))
      DesiredState.foreach(__v => __obj.updateDynamic("DesiredState")(__v.asInstanceOf[js.Any]))
      Enrichment.foreach(__v => __obj.updateDynamic("Enrichment")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      StateReason.foreach(__v => __obj.updateDynamic("StateReason")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Pipe]
    }
  }

  /** These are custom parameter to be used when the target is an API Gateway REST APIs or EventBridge ApiDestinations. In the latter case, these are merged with any InvocationParameters specified on the Connection, with any values from the Connection taking precedence.
    */
  @js.native
  trait PipeEnrichmentHttpParameters extends js.Object {
    var HeaderParameters: js.UndefOr[HeaderParametersMap]
    var PathParameterValues: js.UndefOr[PathParameterList]
    var QueryStringParameters: js.UndefOr[QueryStringParametersMap]
  }

  object PipeEnrichmentHttpParameters {
    @inline
    def apply(
        HeaderParameters: js.UndefOr[HeaderParametersMap] = js.undefined,
        PathParameterValues: js.UndefOr[PathParameterList] = js.undefined,
        QueryStringParameters: js.UndefOr[QueryStringParametersMap] = js.undefined
    ): PipeEnrichmentHttpParameters = {
      val __obj = js.Dynamic.literal()
      HeaderParameters.foreach(__v => __obj.updateDynamic("HeaderParameters")(__v.asInstanceOf[js.Any]))
      PathParameterValues.foreach(__v => __obj.updateDynamic("PathParameterValues")(__v.asInstanceOf[js.Any]))
      QueryStringParameters.foreach(__v => __obj.updateDynamic("QueryStringParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipeEnrichmentHttpParameters]
    }
  }

  /** The parameters required to set up enrichment on your pipe.
    */
  @js.native
  trait PipeEnrichmentParameters extends js.Object {
    var HttpParameters: js.UndefOr[PipeEnrichmentHttpParameters]
    var InputTemplate: js.UndefOr[InputTemplate]
  }

  object PipeEnrichmentParameters {
    @inline
    def apply(
        HttpParameters: js.UndefOr[PipeEnrichmentHttpParameters] = js.undefined,
        InputTemplate: js.UndefOr[InputTemplate] = js.undefined
    ): PipeEnrichmentParameters = {
      val __obj = js.Dynamic.literal()
      HttpParameters.foreach(__v => __obj.updateDynamic("HttpParameters")(__v.asInstanceOf[js.Any]))
      InputTemplate.foreach(__v => __obj.updateDynamic("InputTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipeEnrichmentParameters]
    }
  }

  /** The parameters for using an Active MQ broker as a source.
    */
  @js.native
  trait PipeSourceActiveMQBrokerParameters extends js.Object {
    var Credentials: MQBrokerAccessCredentials
    var QueueName: MQBrokerQueueName
    var BatchSize: js.UndefOr[LimitMax10000]
    var MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds]
  }

  object PipeSourceActiveMQBrokerParameters {
    @inline
    def apply(
        Credentials: MQBrokerAccessCredentials,
        QueueName: MQBrokerQueueName,
        BatchSize: js.UndefOr[LimitMax10000] = js.undefined,
        MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds] = js.undefined
    ): PipeSourceActiveMQBrokerParameters = {
      val __obj = js.Dynamic.literal(
        "Credentials" -> Credentials.asInstanceOf[js.Any],
        "QueueName" -> QueueName.asInstanceOf[js.Any]
      )

      BatchSize.foreach(__v => __obj.updateDynamic("BatchSize")(__v.asInstanceOf[js.Any]))
      MaximumBatchingWindowInSeconds.foreach(__v => __obj.updateDynamic("MaximumBatchingWindowInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipeSourceActiveMQBrokerParameters]
    }
  }

  /** The parameters for using a DynamoDB stream as a source.
    */
  @js.native
  trait PipeSourceDynamoDBStreamParameters extends js.Object {
    var StartingPosition: DynamoDBStreamStartPosition
    var BatchSize: js.UndefOr[LimitMax1000]
    var DeadLetterConfig: js.UndefOr[DeadLetterConfig]
    var MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds]
    var MaximumRecordAgeInSeconds: js.UndefOr[MaximumRecordAgeInSeconds]
    var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsESM]
    var OnPartialBatchItemFailure: js.UndefOr[OnPartialBatchItemFailureStreams]
    var ParallelizationFactor: js.UndefOr[LimitMax10]
  }

  object PipeSourceDynamoDBStreamParameters {
    @inline
    def apply(
        StartingPosition: DynamoDBStreamStartPosition,
        BatchSize: js.UndefOr[LimitMax1000] = js.undefined,
        DeadLetterConfig: js.UndefOr[DeadLetterConfig] = js.undefined,
        MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds] = js.undefined,
        MaximumRecordAgeInSeconds: js.UndefOr[MaximumRecordAgeInSeconds] = js.undefined,
        MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsESM] = js.undefined,
        OnPartialBatchItemFailure: js.UndefOr[OnPartialBatchItemFailureStreams] = js.undefined,
        ParallelizationFactor: js.UndefOr[LimitMax10] = js.undefined
    ): PipeSourceDynamoDBStreamParameters = {
      val __obj = js.Dynamic.literal(
        "StartingPosition" -> StartingPosition.asInstanceOf[js.Any]
      )

      BatchSize.foreach(__v => __obj.updateDynamic("BatchSize")(__v.asInstanceOf[js.Any]))
      DeadLetterConfig.foreach(__v => __obj.updateDynamic("DeadLetterConfig")(__v.asInstanceOf[js.Any]))
      MaximumBatchingWindowInSeconds.foreach(__v => __obj.updateDynamic("MaximumBatchingWindowInSeconds")(__v.asInstanceOf[js.Any]))
      MaximumRecordAgeInSeconds.foreach(__v => __obj.updateDynamic("MaximumRecordAgeInSeconds")(__v.asInstanceOf[js.Any]))
      MaximumRetryAttempts.foreach(__v => __obj.updateDynamic("MaximumRetryAttempts")(__v.asInstanceOf[js.Any]))
      OnPartialBatchItemFailure.foreach(__v => __obj.updateDynamic("OnPartialBatchItemFailure")(__v.asInstanceOf[js.Any]))
      ParallelizationFactor.foreach(__v => __obj.updateDynamic("ParallelizationFactor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipeSourceDynamoDBStreamParameters]
    }
  }

  /** The parameters for using a Kinesis stream as a source.
    */
  @js.native
  trait PipeSourceKinesisStreamParameters extends js.Object {
    var StartingPosition: KinesisStreamStartPosition
    var BatchSize: js.UndefOr[LimitMax10000]
    var DeadLetterConfig: js.UndefOr[DeadLetterConfig]
    var MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds]
    var MaximumRecordAgeInSeconds: js.UndefOr[MaximumRecordAgeInSeconds]
    var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsESM]
    var OnPartialBatchItemFailure: js.UndefOr[OnPartialBatchItemFailureStreams]
    var ParallelizationFactor: js.UndefOr[LimitMax10]
    var StartingPositionTimestamp: js.UndefOr[Timestamp]
  }

  object PipeSourceKinesisStreamParameters {
    @inline
    def apply(
        StartingPosition: KinesisStreamStartPosition,
        BatchSize: js.UndefOr[LimitMax10000] = js.undefined,
        DeadLetterConfig: js.UndefOr[DeadLetterConfig] = js.undefined,
        MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds] = js.undefined,
        MaximumRecordAgeInSeconds: js.UndefOr[MaximumRecordAgeInSeconds] = js.undefined,
        MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsESM] = js.undefined,
        OnPartialBatchItemFailure: js.UndefOr[OnPartialBatchItemFailureStreams] = js.undefined,
        ParallelizationFactor: js.UndefOr[LimitMax10] = js.undefined,
        StartingPositionTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): PipeSourceKinesisStreamParameters = {
      val __obj = js.Dynamic.literal(
        "StartingPosition" -> StartingPosition.asInstanceOf[js.Any]
      )

      BatchSize.foreach(__v => __obj.updateDynamic("BatchSize")(__v.asInstanceOf[js.Any]))
      DeadLetterConfig.foreach(__v => __obj.updateDynamic("DeadLetterConfig")(__v.asInstanceOf[js.Any]))
      MaximumBatchingWindowInSeconds.foreach(__v => __obj.updateDynamic("MaximumBatchingWindowInSeconds")(__v.asInstanceOf[js.Any]))
      MaximumRecordAgeInSeconds.foreach(__v => __obj.updateDynamic("MaximumRecordAgeInSeconds")(__v.asInstanceOf[js.Any]))
      MaximumRetryAttempts.foreach(__v => __obj.updateDynamic("MaximumRetryAttempts")(__v.asInstanceOf[js.Any]))
      OnPartialBatchItemFailure.foreach(__v => __obj.updateDynamic("OnPartialBatchItemFailure")(__v.asInstanceOf[js.Any]))
      ParallelizationFactor.foreach(__v => __obj.updateDynamic("ParallelizationFactor")(__v.asInstanceOf[js.Any]))
      StartingPositionTimestamp.foreach(__v => __obj.updateDynamic("StartingPositionTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipeSourceKinesisStreamParameters]
    }
  }

  /** The parameters for using an MSK stream as a source.
    */
  @js.native
  trait PipeSourceManagedStreamingKafkaParameters extends js.Object {
    var TopicName: KafkaTopicName
    var BatchSize: js.UndefOr[LimitMax10000]
    var ConsumerGroupID: js.UndefOr[URI]
    var Credentials: js.UndefOr[MSKAccessCredentials]
    var MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds]
    var StartingPosition: js.UndefOr[MSKStartPosition]
  }

  object PipeSourceManagedStreamingKafkaParameters {
    @inline
    def apply(
        TopicName: KafkaTopicName,
        BatchSize: js.UndefOr[LimitMax10000] = js.undefined,
        ConsumerGroupID: js.UndefOr[URI] = js.undefined,
        Credentials: js.UndefOr[MSKAccessCredentials] = js.undefined,
        MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds] = js.undefined,
        StartingPosition: js.UndefOr[MSKStartPosition] = js.undefined
    ): PipeSourceManagedStreamingKafkaParameters = {
      val __obj = js.Dynamic.literal(
        "TopicName" -> TopicName.asInstanceOf[js.Any]
      )

      BatchSize.foreach(__v => __obj.updateDynamic("BatchSize")(__v.asInstanceOf[js.Any]))
      ConsumerGroupID.foreach(__v => __obj.updateDynamic("ConsumerGroupID")(__v.asInstanceOf[js.Any]))
      Credentials.foreach(__v => __obj.updateDynamic("Credentials")(__v.asInstanceOf[js.Any]))
      MaximumBatchingWindowInSeconds.foreach(__v => __obj.updateDynamic("MaximumBatchingWindowInSeconds")(__v.asInstanceOf[js.Any]))
      StartingPosition.foreach(__v => __obj.updateDynamic("StartingPosition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipeSourceManagedStreamingKafkaParameters]
    }
  }

  /** The parameters required to set up a source for your pipe.
    */
  @js.native
  trait PipeSourceParameters extends js.Object {
    var ActiveMQBrokerParameters: js.UndefOr[PipeSourceActiveMQBrokerParameters]
    var DynamoDBStreamParameters: js.UndefOr[PipeSourceDynamoDBStreamParameters]
    var FilterCriteria: js.UndefOr[FilterCriteria]
    var KinesisStreamParameters: js.UndefOr[PipeSourceKinesisStreamParameters]
    var ManagedStreamingKafkaParameters: js.UndefOr[PipeSourceManagedStreamingKafkaParameters]
    var RabbitMQBrokerParameters: js.UndefOr[PipeSourceRabbitMQBrokerParameters]
    var SelfManagedKafkaParameters: js.UndefOr[PipeSourceSelfManagedKafkaParameters]
    var SqsQueueParameters: js.UndefOr[PipeSourceSqsQueueParameters]
  }

  object PipeSourceParameters {
    @inline
    def apply(
        ActiveMQBrokerParameters: js.UndefOr[PipeSourceActiveMQBrokerParameters] = js.undefined,
        DynamoDBStreamParameters: js.UndefOr[PipeSourceDynamoDBStreamParameters] = js.undefined,
        FilterCriteria: js.UndefOr[FilterCriteria] = js.undefined,
        KinesisStreamParameters: js.UndefOr[PipeSourceKinesisStreamParameters] = js.undefined,
        ManagedStreamingKafkaParameters: js.UndefOr[PipeSourceManagedStreamingKafkaParameters] = js.undefined,
        RabbitMQBrokerParameters: js.UndefOr[PipeSourceRabbitMQBrokerParameters] = js.undefined,
        SelfManagedKafkaParameters: js.UndefOr[PipeSourceSelfManagedKafkaParameters] = js.undefined,
        SqsQueueParameters: js.UndefOr[PipeSourceSqsQueueParameters] = js.undefined
    ): PipeSourceParameters = {
      val __obj = js.Dynamic.literal()
      ActiveMQBrokerParameters.foreach(__v => __obj.updateDynamic("ActiveMQBrokerParameters")(__v.asInstanceOf[js.Any]))
      DynamoDBStreamParameters.foreach(__v => __obj.updateDynamic("DynamoDBStreamParameters")(__v.asInstanceOf[js.Any]))
      FilterCriteria.foreach(__v => __obj.updateDynamic("FilterCriteria")(__v.asInstanceOf[js.Any]))
      KinesisStreamParameters.foreach(__v => __obj.updateDynamic("KinesisStreamParameters")(__v.asInstanceOf[js.Any]))
      ManagedStreamingKafkaParameters.foreach(__v => __obj.updateDynamic("ManagedStreamingKafkaParameters")(__v.asInstanceOf[js.Any]))
      RabbitMQBrokerParameters.foreach(__v => __obj.updateDynamic("RabbitMQBrokerParameters")(__v.asInstanceOf[js.Any]))
      SelfManagedKafkaParameters.foreach(__v => __obj.updateDynamic("SelfManagedKafkaParameters")(__v.asInstanceOf[js.Any]))
      SqsQueueParameters.foreach(__v => __obj.updateDynamic("SqsQueueParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipeSourceParameters]
    }
  }

  /** The parameters for using a Rabbit MQ broker as a source.
    */
  @js.native
  trait PipeSourceRabbitMQBrokerParameters extends js.Object {
    var Credentials: MQBrokerAccessCredentials
    var QueueName: MQBrokerQueueName
    var BatchSize: js.UndefOr[LimitMax10000]
    var MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds]
    var VirtualHost: js.UndefOr[URI]
  }

  object PipeSourceRabbitMQBrokerParameters {
    @inline
    def apply(
        Credentials: MQBrokerAccessCredentials,
        QueueName: MQBrokerQueueName,
        BatchSize: js.UndefOr[LimitMax10000] = js.undefined,
        MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds] = js.undefined,
        VirtualHost: js.UndefOr[URI] = js.undefined
    ): PipeSourceRabbitMQBrokerParameters = {
      val __obj = js.Dynamic.literal(
        "Credentials" -> Credentials.asInstanceOf[js.Any],
        "QueueName" -> QueueName.asInstanceOf[js.Any]
      )

      BatchSize.foreach(__v => __obj.updateDynamic("BatchSize")(__v.asInstanceOf[js.Any]))
      MaximumBatchingWindowInSeconds.foreach(__v => __obj.updateDynamic("MaximumBatchingWindowInSeconds")(__v.asInstanceOf[js.Any]))
      VirtualHost.foreach(__v => __obj.updateDynamic("VirtualHost")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipeSourceRabbitMQBrokerParameters]
    }
  }

  /** The parameters for using a self-managed Apache Kafka stream as a source.
    */
  @js.native
  trait PipeSourceSelfManagedKafkaParameters extends js.Object {
    var TopicName: KafkaTopicName
    var AdditionalBootstrapServers: js.UndefOr[KafkaBootstrapServers]
    var BatchSize: js.UndefOr[LimitMax10000]
    var ConsumerGroupID: js.UndefOr[URI]
    var Credentials: js.UndefOr[SelfManagedKafkaAccessConfigurationCredentials]
    var MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds]
    var ServerRootCaCertificate: js.UndefOr[SecretManagerArn]
    var StartingPosition: js.UndefOr[SelfManagedKafkaStartPosition]
    var Vpc: js.UndefOr[SelfManagedKafkaAccessConfigurationVpc]
  }

  object PipeSourceSelfManagedKafkaParameters {
    @inline
    def apply(
        TopicName: KafkaTopicName,
        AdditionalBootstrapServers: js.UndefOr[KafkaBootstrapServers] = js.undefined,
        BatchSize: js.UndefOr[LimitMax10000] = js.undefined,
        ConsumerGroupID: js.UndefOr[URI] = js.undefined,
        Credentials: js.UndefOr[SelfManagedKafkaAccessConfigurationCredentials] = js.undefined,
        MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds] = js.undefined,
        ServerRootCaCertificate: js.UndefOr[SecretManagerArn] = js.undefined,
        StartingPosition: js.UndefOr[SelfManagedKafkaStartPosition] = js.undefined,
        Vpc: js.UndefOr[SelfManagedKafkaAccessConfigurationVpc] = js.undefined
    ): PipeSourceSelfManagedKafkaParameters = {
      val __obj = js.Dynamic.literal(
        "TopicName" -> TopicName.asInstanceOf[js.Any]
      )

      AdditionalBootstrapServers.foreach(__v => __obj.updateDynamic("AdditionalBootstrapServers")(__v.asInstanceOf[js.Any]))
      BatchSize.foreach(__v => __obj.updateDynamic("BatchSize")(__v.asInstanceOf[js.Any]))
      ConsumerGroupID.foreach(__v => __obj.updateDynamic("ConsumerGroupID")(__v.asInstanceOf[js.Any]))
      Credentials.foreach(__v => __obj.updateDynamic("Credentials")(__v.asInstanceOf[js.Any]))
      MaximumBatchingWindowInSeconds.foreach(__v => __obj.updateDynamic("MaximumBatchingWindowInSeconds")(__v.asInstanceOf[js.Any]))
      ServerRootCaCertificate.foreach(__v => __obj.updateDynamic("ServerRootCaCertificate")(__v.asInstanceOf[js.Any]))
      StartingPosition.foreach(__v => __obj.updateDynamic("StartingPosition")(__v.asInstanceOf[js.Any]))
      Vpc.foreach(__v => __obj.updateDynamic("Vpc")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipeSourceSelfManagedKafkaParameters]
    }
  }

  /** The parameters for using a Amazon SQS stream as a source.
    */
  @js.native
  trait PipeSourceSqsQueueParameters extends js.Object {
    var BatchSize: js.UndefOr[LimitMax10000]
    var MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds]
  }

  object PipeSourceSqsQueueParameters {
    @inline
    def apply(
        BatchSize: js.UndefOr[LimitMax10000] = js.undefined,
        MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds] = js.undefined
    ): PipeSourceSqsQueueParameters = {
      val __obj = js.Dynamic.literal()
      BatchSize.foreach(__v => __obj.updateDynamic("BatchSize")(__v.asInstanceOf[js.Any]))
      MaximumBatchingWindowInSeconds.foreach(__v => __obj.updateDynamic("MaximumBatchingWindowInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipeSourceSqsQueueParameters]
    }
  }

  /** The parameters for using an Batch job as a target.
    */
  @js.native
  trait PipeTargetBatchJobParameters extends js.Object {
    var JobDefinition: String
    var JobName: String
    var ArrayProperties: js.UndefOr[BatchArrayProperties]
    var ContainerOverrides: js.UndefOr[BatchContainerOverrides]
    var DependsOn: js.UndefOr[BatchDependsOn]
    var Parameters: js.UndefOr[BatchParametersMap]
    var RetryStrategy: js.UndefOr[BatchRetryStrategy]
  }

  object PipeTargetBatchJobParameters {
    @inline
    def apply(
        JobDefinition: String,
        JobName: String,
        ArrayProperties: js.UndefOr[BatchArrayProperties] = js.undefined,
        ContainerOverrides: js.UndefOr[BatchContainerOverrides] = js.undefined,
        DependsOn: js.UndefOr[BatchDependsOn] = js.undefined,
        Parameters: js.UndefOr[BatchParametersMap] = js.undefined,
        RetryStrategy: js.UndefOr[BatchRetryStrategy] = js.undefined
    ): PipeTargetBatchJobParameters = {
      val __obj = js.Dynamic.literal(
        "JobDefinition" -> JobDefinition.asInstanceOf[js.Any],
        "JobName" -> JobName.asInstanceOf[js.Any]
      )

      ArrayProperties.foreach(__v => __obj.updateDynamic("ArrayProperties")(__v.asInstanceOf[js.Any]))
      ContainerOverrides.foreach(__v => __obj.updateDynamic("ContainerOverrides")(__v.asInstanceOf[js.Any]))
      DependsOn.foreach(__v => __obj.updateDynamic("DependsOn")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      RetryStrategy.foreach(__v => __obj.updateDynamic("RetryStrategy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipeTargetBatchJobParameters]
    }
  }

  /** The parameters for using an CloudWatch Logs log stream as a target.
    */
  @js.native
  trait PipeTargetCloudWatchLogsParameters extends js.Object {
    var LogStreamName: js.UndefOr[LogStreamName]
    var Timestamp: js.UndefOr[JsonPath]
  }

  object PipeTargetCloudWatchLogsParameters {
    @inline
    def apply(
        LogStreamName: js.UndefOr[LogStreamName] = js.undefined,
        Timestamp: js.UndefOr[JsonPath] = js.undefined
    ): PipeTargetCloudWatchLogsParameters = {
      val __obj = js.Dynamic.literal()
      LogStreamName.foreach(__v => __obj.updateDynamic("LogStreamName")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipeTargetCloudWatchLogsParameters]
    }
  }

  /** The parameters for using an Amazon ECS task as a target.
    */
  @js.native
  trait PipeTargetEcsTaskParameters extends js.Object {
    var TaskDefinitionArn: ArnOrJsonPath
    var CapacityProviderStrategy: js.UndefOr[CapacityProviderStrategy]
    var EnableECSManagedTags: js.UndefOr[Boolean]
    var EnableExecuteCommand: js.UndefOr[Boolean]
    var Group: js.UndefOr[String]
    var LaunchType: js.UndefOr[LaunchType]
    var NetworkConfiguration: js.UndefOr[NetworkConfiguration]
    var Overrides: js.UndefOr[EcsTaskOverride]
    var PlacementConstraints: js.UndefOr[PlacementConstraints]
    var PlacementStrategy: js.UndefOr[PlacementStrategies]
    var PlatformVersion: js.UndefOr[String]
    var PropagateTags: js.UndefOr[PropagateTags]
    var ReferenceId: js.UndefOr[ReferenceId]
    var Tags: js.UndefOr[TagList]
    var TaskCount: js.UndefOr[LimitMin1]
  }

  object PipeTargetEcsTaskParameters {
    @inline
    def apply(
        TaskDefinitionArn: ArnOrJsonPath,
        CapacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.undefined,
        EnableECSManagedTags: js.UndefOr[Boolean] = js.undefined,
        EnableExecuteCommand: js.UndefOr[Boolean] = js.undefined,
        Group: js.UndefOr[String] = js.undefined,
        LaunchType: js.UndefOr[LaunchType] = js.undefined,
        NetworkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
        Overrides: js.UndefOr[EcsTaskOverride] = js.undefined,
        PlacementConstraints: js.UndefOr[PlacementConstraints] = js.undefined,
        PlacementStrategy: js.UndefOr[PlacementStrategies] = js.undefined,
        PlatformVersion: js.UndefOr[String] = js.undefined,
        PropagateTags: js.UndefOr[PropagateTags] = js.undefined,
        ReferenceId: js.UndefOr[ReferenceId] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TaskCount: js.UndefOr[LimitMin1] = js.undefined
    ): PipeTargetEcsTaskParameters = {
      val __obj = js.Dynamic.literal(
        "TaskDefinitionArn" -> TaskDefinitionArn.asInstanceOf[js.Any]
      )

      CapacityProviderStrategy.foreach(__v => __obj.updateDynamic("CapacityProviderStrategy")(__v.asInstanceOf[js.Any]))
      EnableECSManagedTags.foreach(__v => __obj.updateDynamic("EnableECSManagedTags")(__v.asInstanceOf[js.Any]))
      EnableExecuteCommand.foreach(__v => __obj.updateDynamic("EnableExecuteCommand")(__v.asInstanceOf[js.Any]))
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      LaunchType.foreach(__v => __obj.updateDynamic("LaunchType")(__v.asInstanceOf[js.Any]))
      NetworkConfiguration.foreach(__v => __obj.updateDynamic("NetworkConfiguration")(__v.asInstanceOf[js.Any]))
      Overrides.foreach(__v => __obj.updateDynamic("Overrides")(__v.asInstanceOf[js.Any]))
      PlacementConstraints.foreach(__v => __obj.updateDynamic("PlacementConstraints")(__v.asInstanceOf[js.Any]))
      PlacementStrategy.foreach(__v => __obj.updateDynamic("PlacementStrategy")(__v.asInstanceOf[js.Any]))
      PlatformVersion.foreach(__v => __obj.updateDynamic("PlatformVersion")(__v.asInstanceOf[js.Any]))
      PropagateTags.foreach(__v => __obj.updateDynamic("PropagateTags")(__v.asInstanceOf[js.Any]))
      ReferenceId.foreach(__v => __obj.updateDynamic("ReferenceId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TaskCount.foreach(__v => __obj.updateDynamic("TaskCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipeTargetEcsTaskParameters]
    }
  }

  /** The parameters for using an EventBridge event bus as a target.
    */
  @js.native
  trait PipeTargetEventBridgeEventBusParameters extends js.Object {
    var DetailType: js.UndefOr[EventBridgeDetailType]
    var EndpointId: js.UndefOr[EventBridgeEndpointId]
    var Resources: js.UndefOr[EventBridgeEventResourceList]
    var Source: js.UndefOr[EventBridgeEventSource]
    var Time: js.UndefOr[JsonPath]
  }

  object PipeTargetEventBridgeEventBusParameters {
    @inline
    def apply(
        DetailType: js.UndefOr[EventBridgeDetailType] = js.undefined,
        EndpointId: js.UndefOr[EventBridgeEndpointId] = js.undefined,
        Resources: js.UndefOr[EventBridgeEventResourceList] = js.undefined,
        Source: js.UndefOr[EventBridgeEventSource] = js.undefined,
        Time: js.UndefOr[JsonPath] = js.undefined
    ): PipeTargetEventBridgeEventBusParameters = {
      val __obj = js.Dynamic.literal()
      DetailType.foreach(__v => __obj.updateDynamic("DetailType")(__v.asInstanceOf[js.Any]))
      EndpointId.foreach(__v => __obj.updateDynamic("EndpointId")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      Time.foreach(__v => __obj.updateDynamic("Time")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipeTargetEventBridgeEventBusParameters]
    }
  }

  /** These are custom parameter to be used when the target is an API Gateway REST APIs or EventBridge ApiDestinations.
    */
  @js.native
  trait PipeTargetHttpParameters extends js.Object {
    var HeaderParameters: js.UndefOr[HeaderParametersMap]
    var PathParameterValues: js.UndefOr[PathParameterList]
    var QueryStringParameters: js.UndefOr[QueryStringParametersMap]
  }

  object PipeTargetHttpParameters {
    @inline
    def apply(
        HeaderParameters: js.UndefOr[HeaderParametersMap] = js.undefined,
        PathParameterValues: js.UndefOr[PathParameterList] = js.undefined,
        QueryStringParameters: js.UndefOr[QueryStringParametersMap] = js.undefined
    ): PipeTargetHttpParameters = {
      val __obj = js.Dynamic.literal()
      HeaderParameters.foreach(__v => __obj.updateDynamic("HeaderParameters")(__v.asInstanceOf[js.Any]))
      PathParameterValues.foreach(__v => __obj.updateDynamic("PathParameterValues")(__v.asInstanceOf[js.Any]))
      QueryStringParameters.foreach(__v => __obj.updateDynamic("QueryStringParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipeTargetHttpParameters]
    }
  }

  /** The parameters for using a Kinesis stream as a source.
    */
  @js.native
  trait PipeTargetKinesisStreamParameters extends js.Object {
    var PartitionKey: KinesisPartitionKey
  }

  object PipeTargetKinesisStreamParameters {
    @inline
    def apply(
        PartitionKey: KinesisPartitionKey
    ): PipeTargetKinesisStreamParameters = {
      val __obj = js.Dynamic.literal(
        "PartitionKey" -> PartitionKey.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PipeTargetKinesisStreamParameters]
    }
  }

  /** The parameters for using a Lambda function as a target.
    */
  @js.native
  trait PipeTargetLambdaFunctionParameters extends js.Object {
    var InvocationType: js.UndefOr[PipeTargetInvocationType]
  }

  object PipeTargetLambdaFunctionParameters {
    @inline
    def apply(
        InvocationType: js.UndefOr[PipeTargetInvocationType] = js.undefined
    ): PipeTargetLambdaFunctionParameters = {
      val __obj = js.Dynamic.literal()
      InvocationType.foreach(__v => __obj.updateDynamic("InvocationType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipeTargetLambdaFunctionParameters]
    }
  }

  /** The parameters required to set up a target for your pipe.
    */
  @js.native
  trait PipeTargetParameters extends js.Object {
    var BatchJobParameters: js.UndefOr[PipeTargetBatchJobParameters]
    var CloudWatchLogsParameters: js.UndefOr[PipeTargetCloudWatchLogsParameters]
    var EcsTaskParameters: js.UndefOr[PipeTargetEcsTaskParameters]
    var EventBridgeEventBusParameters: js.UndefOr[PipeTargetEventBridgeEventBusParameters]
    var HttpParameters: js.UndefOr[PipeTargetHttpParameters]
    var InputTemplate: js.UndefOr[InputTemplate]
    var KinesisStreamParameters: js.UndefOr[PipeTargetKinesisStreamParameters]
    var LambdaFunctionParameters: js.UndefOr[PipeTargetLambdaFunctionParameters]
    var RedshiftDataParameters: js.UndefOr[PipeTargetRedshiftDataParameters]
    var SageMakerPipelineParameters: js.UndefOr[PipeTargetSageMakerPipelineParameters]
    var SqsQueueParameters: js.UndefOr[PipeTargetSqsQueueParameters]
    var StepFunctionStateMachineParameters: js.UndefOr[PipeTargetStateMachineParameters]
  }

  object PipeTargetParameters {
    @inline
    def apply(
        BatchJobParameters: js.UndefOr[PipeTargetBatchJobParameters] = js.undefined,
        CloudWatchLogsParameters: js.UndefOr[PipeTargetCloudWatchLogsParameters] = js.undefined,
        EcsTaskParameters: js.UndefOr[PipeTargetEcsTaskParameters] = js.undefined,
        EventBridgeEventBusParameters: js.UndefOr[PipeTargetEventBridgeEventBusParameters] = js.undefined,
        HttpParameters: js.UndefOr[PipeTargetHttpParameters] = js.undefined,
        InputTemplate: js.UndefOr[InputTemplate] = js.undefined,
        KinesisStreamParameters: js.UndefOr[PipeTargetKinesisStreamParameters] = js.undefined,
        LambdaFunctionParameters: js.UndefOr[PipeTargetLambdaFunctionParameters] = js.undefined,
        RedshiftDataParameters: js.UndefOr[PipeTargetRedshiftDataParameters] = js.undefined,
        SageMakerPipelineParameters: js.UndefOr[PipeTargetSageMakerPipelineParameters] = js.undefined,
        SqsQueueParameters: js.UndefOr[PipeTargetSqsQueueParameters] = js.undefined,
        StepFunctionStateMachineParameters: js.UndefOr[PipeTargetStateMachineParameters] = js.undefined
    ): PipeTargetParameters = {
      val __obj = js.Dynamic.literal()
      BatchJobParameters.foreach(__v => __obj.updateDynamic("BatchJobParameters")(__v.asInstanceOf[js.Any]))
      CloudWatchLogsParameters.foreach(__v => __obj.updateDynamic("CloudWatchLogsParameters")(__v.asInstanceOf[js.Any]))
      EcsTaskParameters.foreach(__v => __obj.updateDynamic("EcsTaskParameters")(__v.asInstanceOf[js.Any]))
      EventBridgeEventBusParameters.foreach(__v => __obj.updateDynamic("EventBridgeEventBusParameters")(__v.asInstanceOf[js.Any]))
      HttpParameters.foreach(__v => __obj.updateDynamic("HttpParameters")(__v.asInstanceOf[js.Any]))
      InputTemplate.foreach(__v => __obj.updateDynamic("InputTemplate")(__v.asInstanceOf[js.Any]))
      KinesisStreamParameters.foreach(__v => __obj.updateDynamic("KinesisStreamParameters")(__v.asInstanceOf[js.Any]))
      LambdaFunctionParameters.foreach(__v => __obj.updateDynamic("LambdaFunctionParameters")(__v.asInstanceOf[js.Any]))
      RedshiftDataParameters.foreach(__v => __obj.updateDynamic("RedshiftDataParameters")(__v.asInstanceOf[js.Any]))
      SageMakerPipelineParameters.foreach(__v => __obj.updateDynamic("SageMakerPipelineParameters")(__v.asInstanceOf[js.Any]))
      SqsQueueParameters.foreach(__v => __obj.updateDynamic("SqsQueueParameters")(__v.asInstanceOf[js.Any]))
      StepFunctionStateMachineParameters.foreach(__v => __obj.updateDynamic("StepFunctionStateMachineParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipeTargetParameters]
    }
  }

  /** These are custom parameters to be used when the target is a Amazon Redshift cluster to invoke the Amazon Redshift Data API ExecuteStatement.
    */
  @js.native
  trait PipeTargetRedshiftDataParameters extends js.Object {
    var Database: Database
    var Sqls: Sqls
    var DbUser: js.UndefOr[DbUser]
    var SecretManagerArn: js.UndefOr[SecretManagerArnOrJsonPath]
    var StatementName: js.UndefOr[StatementName]
    var WithEvent: js.UndefOr[Boolean]
  }

  object PipeTargetRedshiftDataParameters {
    @inline
    def apply(
        Database: Database,
        Sqls: Sqls,
        DbUser: js.UndefOr[DbUser] = js.undefined,
        SecretManagerArn: js.UndefOr[SecretManagerArnOrJsonPath] = js.undefined,
        StatementName: js.UndefOr[StatementName] = js.undefined,
        WithEvent: js.UndefOr[Boolean] = js.undefined
    ): PipeTargetRedshiftDataParameters = {
      val __obj = js.Dynamic.literal(
        "Database" -> Database.asInstanceOf[js.Any],
        "Sqls" -> Sqls.asInstanceOf[js.Any]
      )

      DbUser.foreach(__v => __obj.updateDynamic("DbUser")(__v.asInstanceOf[js.Any]))
      SecretManagerArn.foreach(__v => __obj.updateDynamic("SecretManagerArn")(__v.asInstanceOf[js.Any]))
      StatementName.foreach(__v => __obj.updateDynamic("StatementName")(__v.asInstanceOf[js.Any]))
      WithEvent.foreach(__v => __obj.updateDynamic("WithEvent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipeTargetRedshiftDataParameters]
    }
  }

  /** The parameters for using a SageMaker pipeline as a target.
    */
  @js.native
  trait PipeTargetSageMakerPipelineParameters extends js.Object {
    var PipelineParameterList: js.UndefOr[SageMakerPipelineParameterList]
  }

  object PipeTargetSageMakerPipelineParameters {
    @inline
    def apply(
        PipelineParameterList: js.UndefOr[SageMakerPipelineParameterList] = js.undefined
    ): PipeTargetSageMakerPipelineParameters = {
      val __obj = js.Dynamic.literal()
      PipelineParameterList.foreach(__v => __obj.updateDynamic("PipelineParameterList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipeTargetSageMakerPipelineParameters]
    }
  }

  /** The parameters for using a Amazon SQS stream as a source.
    */
  @js.native
  trait PipeTargetSqsQueueParameters extends js.Object {
    var MessageDeduplicationId: js.UndefOr[MessageDeduplicationId]
    var MessageGroupId: js.UndefOr[MessageGroupId]
  }

  object PipeTargetSqsQueueParameters {
    @inline
    def apply(
        MessageDeduplicationId: js.UndefOr[MessageDeduplicationId] = js.undefined,
        MessageGroupId: js.UndefOr[MessageGroupId] = js.undefined
    ): PipeTargetSqsQueueParameters = {
      val __obj = js.Dynamic.literal()
      MessageDeduplicationId.foreach(__v => __obj.updateDynamic("MessageDeduplicationId")(__v.asInstanceOf[js.Any]))
      MessageGroupId.foreach(__v => __obj.updateDynamic("MessageGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipeTargetSqsQueueParameters]
    }
  }

  /** The parameters for using a Step Functions state machine as a target.
    */
  @js.native
  trait PipeTargetStateMachineParameters extends js.Object {
    var InvocationType: js.UndefOr[PipeTargetInvocationType]
  }

  object PipeTargetStateMachineParameters {
    @inline
    def apply(
        InvocationType: js.UndefOr[PipeTargetInvocationType] = js.undefined
    ): PipeTargetStateMachineParameters = {
      val __obj = js.Dynamic.literal()
      InvocationType.foreach(__v => __obj.updateDynamic("InvocationType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipeTargetStateMachineParameters]
    }
  }

  /** An object representing a constraint on task placement. To learn more, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html|Task Placement Constraints]] in the Amazon Elastic Container Service Developer Guide.
    */
  @js.native
  trait PlacementConstraint extends js.Object {
    var expression: js.UndefOr[PlacementConstraintExpression]
    var `type`: js.UndefOr[PlacementConstraintType]
  }

  object PlacementConstraint {
    @inline
    def apply(
        expression: js.UndefOr[PlacementConstraintExpression] = js.undefined,
        `type`: js.UndefOr[PlacementConstraintType] = js.undefined
    ): PlacementConstraint = {
      val __obj = js.Dynamic.literal()
      expression.foreach(__v => __obj.updateDynamic("expression")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlacementConstraint]
    }
  }

  /** The task placement strategy for a task or service. To learn more, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html|Task Placement Strategies]] in the Amazon Elastic Container Service Service Developer Guide.
    */
  @js.native
  trait PlacementStrategy extends js.Object {
    var field: js.UndefOr[PlacementStrategyField]
    var `type`: js.UndefOr[PlacementStrategyType]
  }

  object PlacementStrategy {
    @inline
    def apply(
        field: js.UndefOr[PlacementStrategyField] = js.undefined,
        `type`: js.UndefOr[PlacementStrategyType] = js.undefined
    ): PlacementStrategy = {
      val __obj = js.Dynamic.literal()
      field.foreach(__v => __obj.updateDynamic("field")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlacementStrategy]
    }
  }

  /** Name/Value pair of a parameter to start execution of a SageMaker Model Building Pipeline.
    */
  @js.native
  trait SageMakerPipelineParameter extends js.Object {
    var Name: SageMakerPipelineParameterName
    var Value: SageMakerPipelineParameterValue
  }

  object SageMakerPipelineParameter {
    @inline
    def apply(
        Name: SageMakerPipelineParameterName,
        Value: SageMakerPipelineParameterValue
    ): SageMakerPipelineParameter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SageMakerPipelineParameter]
    }
  }

  /** The Secrets Manager secret that stores your stream credentials.
    */
  @js.native
  trait SelfManagedKafkaAccessConfigurationCredentials extends js.Object {
    var BasicAuth: js.UndefOr[SecretManagerArn]
    var ClientCertificateTlsAuth: js.UndefOr[SecretManagerArn]
    var SaslScram256Auth: js.UndefOr[SecretManagerArn]
    var SaslScram512Auth: js.UndefOr[SecretManagerArn]
  }

  object SelfManagedKafkaAccessConfigurationCredentials {
    @inline
    def apply(
        BasicAuth: js.UndefOr[SecretManagerArn] = js.undefined,
        ClientCertificateTlsAuth: js.UndefOr[SecretManagerArn] = js.undefined,
        SaslScram256Auth: js.UndefOr[SecretManagerArn] = js.undefined,
        SaslScram512Auth: js.UndefOr[SecretManagerArn] = js.undefined
    ): SelfManagedKafkaAccessConfigurationCredentials = {
      val __obj = js.Dynamic.literal()
      BasicAuth.foreach(__v => __obj.updateDynamic("BasicAuth")(__v.asInstanceOf[js.Any]))
      ClientCertificateTlsAuth.foreach(__v => __obj.updateDynamic("ClientCertificateTlsAuth")(__v.asInstanceOf[js.Any]))
      SaslScram256Auth.foreach(__v => __obj.updateDynamic("SaslScram256Auth")(__v.asInstanceOf[js.Any]))
      SaslScram512Auth.foreach(__v => __obj.updateDynamic("SaslScram512Auth")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelfManagedKafkaAccessConfigurationCredentials]
    }
  }

  /** This structure specifies the VPC subnets and security groups for the stream, and whether a public IP address is to be used.
    */
  @js.native
  trait SelfManagedKafkaAccessConfigurationVpc extends js.Object {
    var SecurityGroup: js.UndefOr[SecurityGroupIds]
    var Subnets: js.UndefOr[SubnetIds]
  }

  object SelfManagedKafkaAccessConfigurationVpc {
    @inline
    def apply(
        SecurityGroup: js.UndefOr[SecurityGroupIds] = js.undefined,
        Subnets: js.UndefOr[SubnetIds] = js.undefined
    ): SelfManagedKafkaAccessConfigurationVpc = {
      val __obj = js.Dynamic.literal()
      SecurityGroup.foreach(__v => __obj.updateDynamic("SecurityGroup")(__v.asInstanceOf[js.Any]))
      Subnets.foreach(__v => __obj.updateDynamic("Subnets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelfManagedKafkaAccessConfigurationVpc]
    }
  }

  @js.native
  trait StartPipeRequest extends js.Object {
    var Name: PipeName
  }

  object StartPipeRequest {
    @inline
    def apply(
        Name: PipeName
    ): StartPipeRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartPipeRequest]
    }
  }

  @js.native
  trait StartPipeResponse extends js.Object {
    var Arn: js.UndefOr[PipeArn]
    var CreationTime: js.UndefOr[Timestamp]
    var CurrentState: js.UndefOr[PipeState]
    var DesiredState: js.UndefOr[RequestedPipeState]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[PipeName]
  }

  object StartPipeResponse {
    @inline
    def apply(
        Arn: js.UndefOr[PipeArn] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        CurrentState: js.UndefOr[PipeState] = js.undefined,
        DesiredState: js.UndefOr[RequestedPipeState] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[PipeName] = js.undefined
    ): StartPipeResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CurrentState.foreach(__v => __obj.updateDynamic("CurrentState")(__v.asInstanceOf[js.Any]))
      DesiredState.foreach(__v => __obj.updateDynamic("DesiredState")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartPipeResponse]
    }
  }

  @js.native
  trait StopPipeRequest extends js.Object {
    var Name: PipeName
  }

  object StopPipeRequest {
    @inline
    def apply(
        Name: PipeName
    ): StopPipeRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopPipeRequest]
    }
  }

  @js.native
  trait StopPipeResponse extends js.Object {
    var Arn: js.UndefOr[PipeArn]
    var CreationTime: js.UndefOr[Timestamp]
    var CurrentState: js.UndefOr[PipeState]
    var DesiredState: js.UndefOr[RequestedPipeState]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[PipeName]
  }

  object StopPipeResponse {
    @inline
    def apply(
        Arn: js.UndefOr[PipeArn] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        CurrentState: js.UndefOr[PipeState] = js.undefined,
        DesiredState: js.UndefOr[RequestedPipeState] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[PipeName] = js.undefined
    ): StopPipeResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CurrentState.foreach(__v => __obj.updateDynamic("CurrentState")(__v.asInstanceOf[js.Any]))
      DesiredState.foreach(__v => __obj.updateDynamic("DesiredState")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopPipeResponse]
    }
  }

  /** A key-value pair associated with an Amazon Web Services resource. In EventBridge, rules and event buses support tagging.
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

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: PipeArn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: PipeArn,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
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

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: PipeArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: PipeArn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
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
  trait UpdatePipeRequest extends js.Object {
    var Name: PipeName
    var RoleArn: RoleArn
    var Description: js.UndefOr[PipeDescription]
    var DesiredState: js.UndefOr[RequestedPipeState]
    var Enrichment: js.UndefOr[OptionalArn]
    var EnrichmentParameters: js.UndefOr[PipeEnrichmentParameters]
    var SourceParameters: js.UndefOr[UpdatePipeSourceParameters]
    var Target: js.UndefOr[Arn]
    var TargetParameters: js.UndefOr[PipeTargetParameters]
  }

  object UpdatePipeRequest {
    @inline
    def apply(
        Name: PipeName,
        RoleArn: RoleArn,
        Description: js.UndefOr[PipeDescription] = js.undefined,
        DesiredState: js.UndefOr[RequestedPipeState] = js.undefined,
        Enrichment: js.UndefOr[OptionalArn] = js.undefined,
        EnrichmentParameters: js.UndefOr[PipeEnrichmentParameters] = js.undefined,
        SourceParameters: js.UndefOr[UpdatePipeSourceParameters] = js.undefined,
        Target: js.UndefOr[Arn] = js.undefined,
        TargetParameters: js.UndefOr[PipeTargetParameters] = js.undefined
    ): UpdatePipeRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DesiredState.foreach(__v => __obj.updateDynamic("DesiredState")(__v.asInstanceOf[js.Any]))
      Enrichment.foreach(__v => __obj.updateDynamic("Enrichment")(__v.asInstanceOf[js.Any]))
      EnrichmentParameters.foreach(__v => __obj.updateDynamic("EnrichmentParameters")(__v.asInstanceOf[js.Any]))
      SourceParameters.foreach(__v => __obj.updateDynamic("SourceParameters")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      TargetParameters.foreach(__v => __obj.updateDynamic("TargetParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePipeRequest]
    }
  }

  @js.native
  trait UpdatePipeResponse extends js.Object {
    var Arn: js.UndefOr[PipeArn]
    var CreationTime: js.UndefOr[Timestamp]
    var CurrentState: js.UndefOr[PipeState]
    var DesiredState: js.UndefOr[RequestedPipeState]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[PipeName]
  }

  object UpdatePipeResponse {
    @inline
    def apply(
        Arn: js.UndefOr[PipeArn] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        CurrentState: js.UndefOr[PipeState] = js.undefined,
        DesiredState: js.UndefOr[RequestedPipeState] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[PipeName] = js.undefined
    ): UpdatePipeResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CurrentState.foreach(__v => __obj.updateDynamic("CurrentState")(__v.asInstanceOf[js.Any]))
      DesiredState.foreach(__v => __obj.updateDynamic("DesiredState")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePipeResponse]
    }
  }

  /** The parameters for using an Active MQ broker as a source.
    */
  @js.native
  trait UpdatePipeSourceActiveMQBrokerParameters extends js.Object {
    var Credentials: MQBrokerAccessCredentials
    var BatchSize: js.UndefOr[LimitMax10000]
    var MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds]
  }

  object UpdatePipeSourceActiveMQBrokerParameters {
    @inline
    def apply(
        Credentials: MQBrokerAccessCredentials,
        BatchSize: js.UndefOr[LimitMax10000] = js.undefined,
        MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds] = js.undefined
    ): UpdatePipeSourceActiveMQBrokerParameters = {
      val __obj = js.Dynamic.literal(
        "Credentials" -> Credentials.asInstanceOf[js.Any]
      )

      BatchSize.foreach(__v => __obj.updateDynamic("BatchSize")(__v.asInstanceOf[js.Any]))
      MaximumBatchingWindowInSeconds.foreach(__v => __obj.updateDynamic("MaximumBatchingWindowInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePipeSourceActiveMQBrokerParameters]
    }
  }

  /** The parameters for using a DynamoDB stream as a source.
    */
  @js.native
  trait UpdatePipeSourceDynamoDBStreamParameters extends js.Object {
    var BatchSize: js.UndefOr[LimitMax1000]
    var DeadLetterConfig: js.UndefOr[DeadLetterConfig]
    var MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds]
    var MaximumRecordAgeInSeconds: js.UndefOr[MaximumRecordAgeInSeconds]
    var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsESM]
    var OnPartialBatchItemFailure: js.UndefOr[OnPartialBatchItemFailureStreams]
    var ParallelizationFactor: js.UndefOr[LimitMax10]
  }

  object UpdatePipeSourceDynamoDBStreamParameters {
    @inline
    def apply(
        BatchSize: js.UndefOr[LimitMax1000] = js.undefined,
        DeadLetterConfig: js.UndefOr[DeadLetterConfig] = js.undefined,
        MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds] = js.undefined,
        MaximumRecordAgeInSeconds: js.UndefOr[MaximumRecordAgeInSeconds] = js.undefined,
        MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsESM] = js.undefined,
        OnPartialBatchItemFailure: js.UndefOr[OnPartialBatchItemFailureStreams] = js.undefined,
        ParallelizationFactor: js.UndefOr[LimitMax10] = js.undefined
    ): UpdatePipeSourceDynamoDBStreamParameters = {
      val __obj = js.Dynamic.literal()
      BatchSize.foreach(__v => __obj.updateDynamic("BatchSize")(__v.asInstanceOf[js.Any]))
      DeadLetterConfig.foreach(__v => __obj.updateDynamic("DeadLetterConfig")(__v.asInstanceOf[js.Any]))
      MaximumBatchingWindowInSeconds.foreach(__v => __obj.updateDynamic("MaximumBatchingWindowInSeconds")(__v.asInstanceOf[js.Any]))
      MaximumRecordAgeInSeconds.foreach(__v => __obj.updateDynamic("MaximumRecordAgeInSeconds")(__v.asInstanceOf[js.Any]))
      MaximumRetryAttempts.foreach(__v => __obj.updateDynamic("MaximumRetryAttempts")(__v.asInstanceOf[js.Any]))
      OnPartialBatchItemFailure.foreach(__v => __obj.updateDynamic("OnPartialBatchItemFailure")(__v.asInstanceOf[js.Any]))
      ParallelizationFactor.foreach(__v => __obj.updateDynamic("ParallelizationFactor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePipeSourceDynamoDBStreamParameters]
    }
  }

  /** The parameters for using a Kinesis stream as a source.
    */
  @js.native
  trait UpdatePipeSourceKinesisStreamParameters extends js.Object {
    var BatchSize: js.UndefOr[LimitMax10000]
    var DeadLetterConfig: js.UndefOr[DeadLetterConfig]
    var MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds]
    var MaximumRecordAgeInSeconds: js.UndefOr[MaximumRecordAgeInSeconds]
    var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsESM]
    var OnPartialBatchItemFailure: js.UndefOr[OnPartialBatchItemFailureStreams]
    var ParallelizationFactor: js.UndefOr[LimitMax10]
  }

  object UpdatePipeSourceKinesisStreamParameters {
    @inline
    def apply(
        BatchSize: js.UndefOr[LimitMax10000] = js.undefined,
        DeadLetterConfig: js.UndefOr[DeadLetterConfig] = js.undefined,
        MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds] = js.undefined,
        MaximumRecordAgeInSeconds: js.UndefOr[MaximumRecordAgeInSeconds] = js.undefined,
        MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsESM] = js.undefined,
        OnPartialBatchItemFailure: js.UndefOr[OnPartialBatchItemFailureStreams] = js.undefined,
        ParallelizationFactor: js.UndefOr[LimitMax10] = js.undefined
    ): UpdatePipeSourceKinesisStreamParameters = {
      val __obj = js.Dynamic.literal()
      BatchSize.foreach(__v => __obj.updateDynamic("BatchSize")(__v.asInstanceOf[js.Any]))
      DeadLetterConfig.foreach(__v => __obj.updateDynamic("DeadLetterConfig")(__v.asInstanceOf[js.Any]))
      MaximumBatchingWindowInSeconds.foreach(__v => __obj.updateDynamic("MaximumBatchingWindowInSeconds")(__v.asInstanceOf[js.Any]))
      MaximumRecordAgeInSeconds.foreach(__v => __obj.updateDynamic("MaximumRecordAgeInSeconds")(__v.asInstanceOf[js.Any]))
      MaximumRetryAttempts.foreach(__v => __obj.updateDynamic("MaximumRetryAttempts")(__v.asInstanceOf[js.Any]))
      OnPartialBatchItemFailure.foreach(__v => __obj.updateDynamic("OnPartialBatchItemFailure")(__v.asInstanceOf[js.Any]))
      ParallelizationFactor.foreach(__v => __obj.updateDynamic("ParallelizationFactor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePipeSourceKinesisStreamParameters]
    }
  }

  /** The parameters for using an MSK stream as a source.
    */
  @js.native
  trait UpdatePipeSourceManagedStreamingKafkaParameters extends js.Object {
    var BatchSize: js.UndefOr[LimitMax10000]
    var Credentials: js.UndefOr[MSKAccessCredentials]
    var MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds]
  }

  object UpdatePipeSourceManagedStreamingKafkaParameters {
    @inline
    def apply(
        BatchSize: js.UndefOr[LimitMax10000] = js.undefined,
        Credentials: js.UndefOr[MSKAccessCredentials] = js.undefined,
        MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds] = js.undefined
    ): UpdatePipeSourceManagedStreamingKafkaParameters = {
      val __obj = js.Dynamic.literal()
      BatchSize.foreach(__v => __obj.updateDynamic("BatchSize")(__v.asInstanceOf[js.Any]))
      Credentials.foreach(__v => __obj.updateDynamic("Credentials")(__v.asInstanceOf[js.Any]))
      MaximumBatchingWindowInSeconds.foreach(__v => __obj.updateDynamic("MaximumBatchingWindowInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePipeSourceManagedStreamingKafkaParameters]
    }
  }

  /** The parameters required to set up a source for your pipe.
    */
  @js.native
  trait UpdatePipeSourceParameters extends js.Object {
    var ActiveMQBrokerParameters: js.UndefOr[UpdatePipeSourceActiveMQBrokerParameters]
    var DynamoDBStreamParameters: js.UndefOr[UpdatePipeSourceDynamoDBStreamParameters]
    var FilterCriteria: js.UndefOr[FilterCriteria]
    var KinesisStreamParameters: js.UndefOr[UpdatePipeSourceKinesisStreamParameters]
    var ManagedStreamingKafkaParameters: js.UndefOr[UpdatePipeSourceManagedStreamingKafkaParameters]
    var RabbitMQBrokerParameters: js.UndefOr[UpdatePipeSourceRabbitMQBrokerParameters]
    var SelfManagedKafkaParameters: js.UndefOr[UpdatePipeSourceSelfManagedKafkaParameters]
    var SqsQueueParameters: js.UndefOr[UpdatePipeSourceSqsQueueParameters]
  }

  object UpdatePipeSourceParameters {
    @inline
    def apply(
        ActiveMQBrokerParameters: js.UndefOr[UpdatePipeSourceActiveMQBrokerParameters] = js.undefined,
        DynamoDBStreamParameters: js.UndefOr[UpdatePipeSourceDynamoDBStreamParameters] = js.undefined,
        FilterCriteria: js.UndefOr[FilterCriteria] = js.undefined,
        KinesisStreamParameters: js.UndefOr[UpdatePipeSourceKinesisStreamParameters] = js.undefined,
        ManagedStreamingKafkaParameters: js.UndefOr[UpdatePipeSourceManagedStreamingKafkaParameters] = js.undefined,
        RabbitMQBrokerParameters: js.UndefOr[UpdatePipeSourceRabbitMQBrokerParameters] = js.undefined,
        SelfManagedKafkaParameters: js.UndefOr[UpdatePipeSourceSelfManagedKafkaParameters] = js.undefined,
        SqsQueueParameters: js.UndefOr[UpdatePipeSourceSqsQueueParameters] = js.undefined
    ): UpdatePipeSourceParameters = {
      val __obj = js.Dynamic.literal()
      ActiveMQBrokerParameters.foreach(__v => __obj.updateDynamic("ActiveMQBrokerParameters")(__v.asInstanceOf[js.Any]))
      DynamoDBStreamParameters.foreach(__v => __obj.updateDynamic("DynamoDBStreamParameters")(__v.asInstanceOf[js.Any]))
      FilterCriteria.foreach(__v => __obj.updateDynamic("FilterCriteria")(__v.asInstanceOf[js.Any]))
      KinesisStreamParameters.foreach(__v => __obj.updateDynamic("KinesisStreamParameters")(__v.asInstanceOf[js.Any]))
      ManagedStreamingKafkaParameters.foreach(__v => __obj.updateDynamic("ManagedStreamingKafkaParameters")(__v.asInstanceOf[js.Any]))
      RabbitMQBrokerParameters.foreach(__v => __obj.updateDynamic("RabbitMQBrokerParameters")(__v.asInstanceOf[js.Any]))
      SelfManagedKafkaParameters.foreach(__v => __obj.updateDynamic("SelfManagedKafkaParameters")(__v.asInstanceOf[js.Any]))
      SqsQueueParameters.foreach(__v => __obj.updateDynamic("SqsQueueParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePipeSourceParameters]
    }
  }

  /** The parameters for using a Rabbit MQ broker as a source.
    */
  @js.native
  trait UpdatePipeSourceRabbitMQBrokerParameters extends js.Object {
    var Credentials: MQBrokerAccessCredentials
    var BatchSize: js.UndefOr[LimitMax10000]
    var MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds]
  }

  object UpdatePipeSourceRabbitMQBrokerParameters {
    @inline
    def apply(
        Credentials: MQBrokerAccessCredentials,
        BatchSize: js.UndefOr[LimitMax10000] = js.undefined,
        MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds] = js.undefined
    ): UpdatePipeSourceRabbitMQBrokerParameters = {
      val __obj = js.Dynamic.literal(
        "Credentials" -> Credentials.asInstanceOf[js.Any]
      )

      BatchSize.foreach(__v => __obj.updateDynamic("BatchSize")(__v.asInstanceOf[js.Any]))
      MaximumBatchingWindowInSeconds.foreach(__v => __obj.updateDynamic("MaximumBatchingWindowInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePipeSourceRabbitMQBrokerParameters]
    }
  }

  /** The parameters for using a self-managed Apache Kafka stream as a source.
    */
  @js.native
  trait UpdatePipeSourceSelfManagedKafkaParameters extends js.Object {
    var BatchSize: js.UndefOr[LimitMax10000]
    var Credentials: js.UndefOr[SelfManagedKafkaAccessConfigurationCredentials]
    var MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds]
    var ServerRootCaCertificate: js.UndefOr[SecretManagerArn]
    var Vpc: js.UndefOr[SelfManagedKafkaAccessConfigurationVpc]
  }

  object UpdatePipeSourceSelfManagedKafkaParameters {
    @inline
    def apply(
        BatchSize: js.UndefOr[LimitMax10000] = js.undefined,
        Credentials: js.UndefOr[SelfManagedKafkaAccessConfigurationCredentials] = js.undefined,
        MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds] = js.undefined,
        ServerRootCaCertificate: js.UndefOr[SecretManagerArn] = js.undefined,
        Vpc: js.UndefOr[SelfManagedKafkaAccessConfigurationVpc] = js.undefined
    ): UpdatePipeSourceSelfManagedKafkaParameters = {
      val __obj = js.Dynamic.literal()
      BatchSize.foreach(__v => __obj.updateDynamic("BatchSize")(__v.asInstanceOf[js.Any]))
      Credentials.foreach(__v => __obj.updateDynamic("Credentials")(__v.asInstanceOf[js.Any]))
      MaximumBatchingWindowInSeconds.foreach(__v => __obj.updateDynamic("MaximumBatchingWindowInSeconds")(__v.asInstanceOf[js.Any]))
      ServerRootCaCertificate.foreach(__v => __obj.updateDynamic("ServerRootCaCertificate")(__v.asInstanceOf[js.Any]))
      Vpc.foreach(__v => __obj.updateDynamic("Vpc")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePipeSourceSelfManagedKafkaParameters]
    }
  }

  /** The parameters for using a Amazon SQS stream as a source.
    */
  @js.native
  trait UpdatePipeSourceSqsQueueParameters extends js.Object {
    var BatchSize: js.UndefOr[LimitMax10000]
    var MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds]
  }

  object UpdatePipeSourceSqsQueueParameters {
    @inline
    def apply(
        BatchSize: js.UndefOr[LimitMax10000] = js.undefined,
        MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds] = js.undefined
    ): UpdatePipeSourceSqsQueueParameters = {
      val __obj = js.Dynamic.literal()
      BatchSize.foreach(__v => __obj.updateDynamic("BatchSize")(__v.asInstanceOf[js.Any]))
      MaximumBatchingWindowInSeconds.foreach(__v => __obj.updateDynamic("MaximumBatchingWindowInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePipeSourceSqsQueueParameters]
    }
  }
}
