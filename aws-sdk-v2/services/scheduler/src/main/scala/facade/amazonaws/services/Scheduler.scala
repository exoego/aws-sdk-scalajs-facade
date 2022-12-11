package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object scheduler {
  type CapacityProvider = String
  type CapacityProviderStrategy = js.Array[CapacityProviderStrategyItem]
  type CapacityProviderStrategyItemBase = Int
  type CapacityProviderStrategyItemWeight = Int
  type ClientToken = String
  type CreationDate = js.Date
  type DeadLetterConfigArnString = String
  type Description = String
  type DetailType = String
  type EnableECSManagedTags = Boolean
  type EnableExecuteCommand = Boolean
  type EndDate = js.Date
  type Group = String
  type KmsKeyArn = String
  type LastModificationDate = js.Date
  type MaxResults = Int
  type MaximumEventAgeInSeconds = Int
  type MaximumRetryAttempts = Int
  type MaximumWindowInMinutes = Int
  type MessageGroupId = String
  type Name = String
  type NamePrefix = String
  type NextToken = String
  type PlacementConstraintExpression = String
  type PlacementConstraints = js.Array[PlacementConstraint]
  type PlacementStrategies = js.Array[PlacementStrategy]
  type PlacementStrategyField = String
  type PlatformVersion = String
  type ReferenceId = String
  type RoleArn = String
  type SageMakerPipelineParameterList = js.Array[SageMakerPipelineParameter]
  type SageMakerPipelineParameterName = String
  type SageMakerPipelineParameterValue = String
  type ScheduleArn = String
  type ScheduleExpression = String
  type ScheduleExpressionTimezone = String
  type ScheduleGroupArn = String
  type ScheduleGroupList = js.Array[ScheduleGroupSummary]
  type ScheduleGroupName = String
  type ScheduleGroupNamePrefix = String
  type ScheduleList = js.Array[ScheduleSummary]
  type SecurityGroup = String
  type SecurityGroups = js.Array[SecurityGroup]
  type Source = String
  type StartDate = js.Date
  type Subnet = String
  type Subnets = js.Array[Subnet]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagMap = js.Dictionary[TagValue]
  type TagResourceArn = String
  type TagValue = String
  type Tags = js.Array[TagMap]
  type TargetArn = String
  type TargetInput = String
  type TargetPartitionKey = String
  type TaskCount = Int
  type TaskDefinitionArn = String

  final class SchedulerOps(private val service: Scheduler) extends AnyVal {

    @inline def createScheduleFuture(params: CreateScheduleInput): Future[CreateScheduleOutput] = service.createSchedule(params).promise().toFuture
    @inline def createScheduleGroupFuture(params: CreateScheduleGroupInput): Future[CreateScheduleGroupOutput] = service.createScheduleGroup(params).promise().toFuture
    @inline def deleteScheduleFuture(params: DeleteScheduleInput): Future[DeleteScheduleOutput] = service.deleteSchedule(params).promise().toFuture
    @inline def deleteScheduleGroupFuture(params: DeleteScheduleGroupInput): Future[DeleteScheduleGroupOutput] = service.deleteScheduleGroup(params).promise().toFuture
    @inline def getScheduleFuture(params: GetScheduleInput): Future[GetScheduleOutput] = service.getSchedule(params).promise().toFuture
    @inline def getScheduleGroupFuture(params: GetScheduleGroupInput): Future[GetScheduleGroupOutput] = service.getScheduleGroup(params).promise().toFuture
    @inline def listScheduleGroupsFuture(params: ListScheduleGroupsInput): Future[ListScheduleGroupsOutput] = service.listScheduleGroups(params).promise().toFuture
    @inline def listSchedulesFuture(params: ListSchedulesInput): Future[ListSchedulesOutput] = service.listSchedules(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] = service.untagResource(params).promise().toFuture
    @inline def updateScheduleFuture(params: UpdateScheduleInput): Future[UpdateScheduleOutput] = service.updateSchedule(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/scheduler", JSImport.Namespace, "AWS.Scheduler")
  class Scheduler() extends js.Object {
    def this(config: AWSConfig) = this()

    def createSchedule(params: CreateScheduleInput): Request[CreateScheduleOutput] = js.native
    def createScheduleGroup(params: CreateScheduleGroupInput): Request[CreateScheduleGroupOutput] = js.native
    def deleteSchedule(params: DeleteScheduleInput): Request[DeleteScheduleOutput] = js.native
    def deleteScheduleGroup(params: DeleteScheduleGroupInput): Request[DeleteScheduleGroupOutput] = js.native
    def getSchedule(params: GetScheduleInput): Request[GetScheduleOutput] = js.native
    def getScheduleGroup(params: GetScheduleGroupInput): Request[GetScheduleGroupOutput] = js.native
    def listScheduleGroups(params: ListScheduleGroupsInput): Request[ListScheduleGroupsOutput] = js.native
    def listSchedules(params: ListSchedulesInput): Request[ListSchedulesOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput] = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput] = js.native
    def updateSchedule(params: UpdateScheduleInput): Request[UpdateScheduleOutput] = js.native
  }
  object Scheduler {
    @inline implicit def toOps(service: Scheduler): SchedulerOps = {
      new SchedulerOps(service)
    }
  }

  /** This structure specifies the VPC subnets and security groups for the task, and whether a public IP address is to be used. This structure is relevant only for ECS tasks that use the awsvpc network mode.
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

  /** The details of a capacity provider strategy.
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
  trait CreateScheduleGroupInput extends js.Object {
    var Name: ScheduleGroupName
    var ClientToken: js.UndefOr[ClientToken]
    var Tags: js.UndefOr[TagList]
  }

  object CreateScheduleGroupInput {
    @inline
    def apply(
        Name: ScheduleGroupName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateScheduleGroupInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateScheduleGroupInput]
    }
  }

  @js.native
  trait CreateScheduleGroupOutput extends js.Object {
    var ScheduleGroupArn: ScheduleGroupArn
  }

  object CreateScheduleGroupOutput {
    @inline
    def apply(
        ScheduleGroupArn: ScheduleGroupArn
    ): CreateScheduleGroupOutput = {
      val __obj = js.Dynamic.literal(
        "ScheduleGroupArn" -> ScheduleGroupArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateScheduleGroupOutput]
    }
  }

  @js.native
  trait CreateScheduleInput extends js.Object {
    var FlexibleTimeWindow: FlexibleTimeWindow
    var Name: Name
    var ScheduleExpression: ScheduleExpression
    var Target: Target
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[Description]
    var EndDate: js.UndefOr[EndDate]
    var GroupName: js.UndefOr[ScheduleGroupName]
    var KmsKeyArn: js.UndefOr[KmsKeyArn]
    var ScheduleExpressionTimezone: js.UndefOr[ScheduleExpressionTimezone]
    var StartDate: js.UndefOr[StartDate]
    var State: js.UndefOr[ScheduleState]
  }

  object CreateScheduleInput {
    @inline
    def apply(
        FlexibleTimeWindow: FlexibleTimeWindow,
        Name: Name,
        ScheduleExpression: ScheduleExpression,
        Target: Target,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        EndDate: js.UndefOr[EndDate] = js.undefined,
        GroupName: js.UndefOr[ScheduleGroupName] = js.undefined,
        KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined,
        ScheduleExpressionTimezone: js.UndefOr[ScheduleExpressionTimezone] = js.undefined,
        StartDate: js.UndefOr[StartDate] = js.undefined,
        State: js.UndefOr[ScheduleState] = js.undefined
    ): CreateScheduleInput = {
      val __obj = js.Dynamic.literal(
        "FlexibleTimeWindow" -> FlexibleTimeWindow.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "ScheduleExpression" -> ScheduleExpression.asInstanceOf[js.Any],
        "Target" -> Target.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EndDate.foreach(__v => __obj.updateDynamic("EndDate")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      ScheduleExpressionTimezone.foreach(__v => __obj.updateDynamic("ScheduleExpressionTimezone")(__v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.updateDynamic("StartDate")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateScheduleInput]
    }
  }

  @js.native
  trait CreateScheduleOutput extends js.Object {
    var ScheduleArn: ScheduleArn
  }

  object CreateScheduleOutput {
    @inline
    def apply(
        ScheduleArn: ScheduleArn
    ): CreateScheduleOutput = {
      val __obj = js.Dynamic.literal(
        "ScheduleArn" -> ScheduleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateScheduleOutput]
    }
  }

  /** An object that contains information about an Amazon SQS queue that EventBridge Scheduler uses as a dead-letter queue for your schedule. If specified, EventBridge Scheduler delivers failed events that could not be successfully delivered to a target to the queue.
    */
  @js.native
  trait DeadLetterConfig extends js.Object {
    var Arn: js.UndefOr[DeadLetterConfigArnString]
  }

  object DeadLetterConfig {
    @inline
    def apply(
        Arn: js.UndefOr[DeadLetterConfigArnString] = js.undefined
    ): DeadLetterConfig = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeadLetterConfig]
    }
  }

  @js.native
  trait DeleteScheduleGroupInput extends js.Object {
    var Name: ScheduleGroupName
    var ClientToken: js.UndefOr[ClientToken]
  }

  object DeleteScheduleGroupInput {
    @inline
    def apply(
        Name: ScheduleGroupName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteScheduleGroupInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteScheduleGroupInput]
    }
  }

  @js.native
  trait DeleteScheduleGroupOutput extends js.Object

  object DeleteScheduleGroupOutput {
    @inline
    def apply(): DeleteScheduleGroupOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteScheduleGroupOutput]
    }
  }

  @js.native
  trait DeleteScheduleInput extends js.Object {
    var Name: Name
    var ClientToken: js.UndefOr[ClientToken]
    var GroupName: js.UndefOr[ScheduleGroupName]
  }

  object DeleteScheduleInput {
    @inline
    def apply(
        Name: Name,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        GroupName: js.UndefOr[ScheduleGroupName] = js.undefined
    ): DeleteScheduleInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteScheduleInput]
    }
  }

  @js.native
  trait DeleteScheduleOutput extends js.Object

  object DeleteScheduleOutput {
    @inline
    def apply(): DeleteScheduleOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteScheduleOutput]
    }
  }

  /** The templated target type for the Amazon ECS <a href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html"> <code>RunTask</code> </a> API operation.
    */
  @js.native
  trait EcsParameters extends js.Object {
    var TaskDefinitionArn: TaskDefinitionArn
    var CapacityProviderStrategy: js.UndefOr[CapacityProviderStrategy]
    var EnableECSManagedTags: js.UndefOr[EnableECSManagedTags]
    var EnableExecuteCommand: js.UndefOr[EnableExecuteCommand]
    var Group: js.UndefOr[Group]
    var LaunchType: js.UndefOr[LaunchType]
    var NetworkConfiguration: js.UndefOr[NetworkConfiguration]
    var PlacementConstraints: js.UndefOr[PlacementConstraints]
    var PlacementStrategy: js.UndefOr[PlacementStrategies]
    var PlatformVersion: js.UndefOr[PlatformVersion]
    var PropagateTags: js.UndefOr[PropagateTags]
    var ReferenceId: js.UndefOr[ReferenceId]
    var Tags: js.UndefOr[Tags]
    var TaskCount: js.UndefOr[TaskCount]
  }

  object EcsParameters {
    @inline
    def apply(
        TaskDefinitionArn: TaskDefinitionArn,
        CapacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.undefined,
        EnableECSManagedTags: js.UndefOr[EnableECSManagedTags] = js.undefined,
        EnableExecuteCommand: js.UndefOr[EnableExecuteCommand] = js.undefined,
        Group: js.UndefOr[Group] = js.undefined,
        LaunchType: js.UndefOr[LaunchType] = js.undefined,
        NetworkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
        PlacementConstraints: js.UndefOr[PlacementConstraints] = js.undefined,
        PlacementStrategy: js.UndefOr[PlacementStrategies] = js.undefined,
        PlatformVersion: js.UndefOr[PlatformVersion] = js.undefined,
        PropagateTags: js.UndefOr[PropagateTags] = js.undefined,
        ReferenceId: js.UndefOr[ReferenceId] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        TaskCount: js.UndefOr[TaskCount] = js.undefined
    ): EcsParameters = {
      val __obj = js.Dynamic.literal(
        "TaskDefinitionArn" -> TaskDefinitionArn.asInstanceOf[js.Any]
      )

      CapacityProviderStrategy.foreach(__v => __obj.updateDynamic("CapacityProviderStrategy")(__v.asInstanceOf[js.Any]))
      EnableECSManagedTags.foreach(__v => __obj.updateDynamic("EnableECSManagedTags")(__v.asInstanceOf[js.Any]))
      EnableExecuteCommand.foreach(__v => __obj.updateDynamic("EnableExecuteCommand")(__v.asInstanceOf[js.Any]))
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      LaunchType.foreach(__v => __obj.updateDynamic("LaunchType")(__v.asInstanceOf[js.Any]))
      NetworkConfiguration.foreach(__v => __obj.updateDynamic("NetworkConfiguration")(__v.asInstanceOf[js.Any]))
      PlacementConstraints.foreach(__v => __obj.updateDynamic("PlacementConstraints")(__v.asInstanceOf[js.Any]))
      PlacementStrategy.foreach(__v => __obj.updateDynamic("PlacementStrategy")(__v.asInstanceOf[js.Any]))
      PlatformVersion.foreach(__v => __obj.updateDynamic("PlatformVersion")(__v.asInstanceOf[js.Any]))
      PropagateTags.foreach(__v => __obj.updateDynamic("PropagateTags")(__v.asInstanceOf[js.Any]))
      ReferenceId.foreach(__v => __obj.updateDynamic("ReferenceId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TaskCount.foreach(__v => __obj.updateDynamic("TaskCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EcsParameters]
    }
  }

  /** The templated target type for the EventBridge <a href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html"> <code>PutEvents</code> </a> API operation.
    */
  @js.native
  trait EventBridgeParameters extends js.Object {
    var DetailType: DetailType
    var Source: Source
  }

  object EventBridgeParameters {
    @inline
    def apply(
        DetailType: DetailType,
        Source: Source
    ): EventBridgeParameters = {
      val __obj = js.Dynamic.literal(
        "DetailType" -> DetailType.asInstanceOf[js.Any],
        "Source" -> Source.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EventBridgeParameters]
    }
  }

  /** Allows you to configure a time window during which EventBridge Scheduler invokes the schedule.
    */
  @js.native
  trait FlexibleTimeWindow extends js.Object {
    var Mode: FlexibleTimeWindowMode
    var MaximumWindowInMinutes: js.UndefOr[MaximumWindowInMinutes]
  }

  object FlexibleTimeWindow {
    @inline
    def apply(
        Mode: FlexibleTimeWindowMode,
        MaximumWindowInMinutes: js.UndefOr[MaximumWindowInMinutes] = js.undefined
    ): FlexibleTimeWindow = {
      val __obj = js.Dynamic.literal(
        "Mode" -> Mode.asInstanceOf[js.Any]
      )

      MaximumWindowInMinutes.foreach(__v => __obj.updateDynamic("MaximumWindowInMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FlexibleTimeWindow]
    }
  }

  @js.native
  trait GetScheduleGroupInput extends js.Object {
    var Name: ScheduleGroupName
  }

  object GetScheduleGroupInput {
    @inline
    def apply(
        Name: ScheduleGroupName
    ): GetScheduleGroupInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetScheduleGroupInput]
    }
  }

  @js.native
  trait GetScheduleGroupOutput extends js.Object {
    var Arn: js.UndefOr[ScheduleGroupArn]
    var CreationDate: js.UndefOr[CreationDate]
    var LastModificationDate: js.UndefOr[LastModificationDate]
    var Name: js.UndefOr[ScheduleGroupName]
    var State: js.UndefOr[ScheduleGroupState]
  }

  object GetScheduleGroupOutput {
    @inline
    def apply(
        Arn: js.UndefOr[ScheduleGroupArn] = js.undefined,
        CreationDate: js.UndefOr[CreationDate] = js.undefined,
        LastModificationDate: js.UndefOr[LastModificationDate] = js.undefined,
        Name: js.UndefOr[ScheduleGroupName] = js.undefined,
        State: js.UndefOr[ScheduleGroupState] = js.undefined
    ): GetScheduleGroupOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      LastModificationDate.foreach(__v => __obj.updateDynamic("LastModificationDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetScheduleGroupOutput]
    }
  }

  @js.native
  trait GetScheduleInput extends js.Object {
    var Name: Name
    var GroupName: js.UndefOr[ScheduleGroupName]
  }

  object GetScheduleInput {
    @inline
    def apply(
        Name: Name,
        GroupName: js.UndefOr[ScheduleGroupName] = js.undefined
    ): GetScheduleInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetScheduleInput]
    }
  }

  @js.native
  trait GetScheduleOutput extends js.Object {
    var Arn: js.UndefOr[ScheduleArn]
    var CreationDate: js.UndefOr[CreationDate]
    var Description: js.UndefOr[Description]
    var EndDate: js.UndefOr[EndDate]
    var FlexibleTimeWindow: js.UndefOr[FlexibleTimeWindow]
    var GroupName: js.UndefOr[ScheduleGroupName]
    var KmsKeyArn: js.UndefOr[KmsKeyArn]
    var LastModificationDate: js.UndefOr[LastModificationDate]
    var Name: js.UndefOr[Name]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var ScheduleExpressionTimezone: js.UndefOr[ScheduleExpressionTimezone]
    var StartDate: js.UndefOr[StartDate]
    var State: js.UndefOr[ScheduleState]
    var Target: js.UndefOr[Target]
  }

  object GetScheduleOutput {
    @inline
    def apply(
        Arn: js.UndefOr[ScheduleArn] = js.undefined,
        CreationDate: js.UndefOr[CreationDate] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        EndDate: js.UndefOr[EndDate] = js.undefined,
        FlexibleTimeWindow: js.UndefOr[FlexibleTimeWindow] = js.undefined,
        GroupName: js.UndefOr[ScheduleGroupName] = js.undefined,
        KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined,
        LastModificationDate: js.UndefOr[LastModificationDate] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
        ScheduleExpressionTimezone: js.UndefOr[ScheduleExpressionTimezone] = js.undefined,
        StartDate: js.UndefOr[StartDate] = js.undefined,
        State: js.UndefOr[ScheduleState] = js.undefined,
        Target: js.UndefOr[Target] = js.undefined
    ): GetScheduleOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EndDate.foreach(__v => __obj.updateDynamic("EndDate")(__v.asInstanceOf[js.Any]))
      FlexibleTimeWindow.foreach(__v => __obj.updateDynamic("FlexibleTimeWindow")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      LastModificationDate.foreach(__v => __obj.updateDynamic("LastModificationDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ScheduleExpression.foreach(__v => __obj.updateDynamic("ScheduleExpression")(__v.asInstanceOf[js.Any]))
      ScheduleExpressionTimezone.foreach(__v => __obj.updateDynamic("ScheduleExpressionTimezone")(__v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.updateDynamic("StartDate")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetScheduleOutput]
    }
  }

  /** The templated target type for the Amazon Kinesis <a href="kinesis/latest/APIReference/API_PutRecord.html"> <code>PutRecord</code> </a> API operation.
    */
  @js.native
  trait KinesisParameters extends js.Object {
    var PartitionKey: TargetPartitionKey
  }

  object KinesisParameters {
    @inline
    def apply(
        PartitionKey: TargetPartitionKey
    ): KinesisParameters = {
      val __obj = js.Dynamic.literal(
        "PartitionKey" -> PartitionKey.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[KinesisParameters]
    }
  }

  @js.native
  trait ListScheduleGroupsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NamePrefix: js.UndefOr[ScheduleGroupNamePrefix]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListScheduleGroupsInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NamePrefix: js.UndefOr[ScheduleGroupNamePrefix] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListScheduleGroupsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NamePrefix.foreach(__v => __obj.updateDynamic("NamePrefix")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListScheduleGroupsInput]
    }
  }

  @js.native
  trait ListScheduleGroupsOutput extends js.Object {
    var ScheduleGroups: ScheduleGroupList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListScheduleGroupsOutput {
    @inline
    def apply(
        ScheduleGroups: ScheduleGroupList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListScheduleGroupsOutput = {
      val __obj = js.Dynamic.literal(
        "ScheduleGroups" -> ScheduleGroups.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListScheduleGroupsOutput]
    }
  }

  @js.native
  trait ListSchedulesInput extends js.Object {
    var GroupName: js.UndefOr[ScheduleGroupName]
    var MaxResults: js.UndefOr[MaxResults]
    var NamePrefix: js.UndefOr[NamePrefix]
    var NextToken: js.UndefOr[NextToken]
    var State: js.UndefOr[ScheduleState]
  }

  object ListSchedulesInput {
    @inline
    def apply(
        GroupName: js.UndefOr[ScheduleGroupName] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NamePrefix: js.UndefOr[NamePrefix] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        State: js.UndefOr[ScheduleState] = js.undefined
    ): ListSchedulesInput = {
      val __obj = js.Dynamic.literal()
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NamePrefix.foreach(__v => __obj.updateDynamic("NamePrefix")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSchedulesInput]
    }
  }

  @js.native
  trait ListSchedulesOutput extends js.Object {
    var Schedules: ScheduleList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSchedulesOutput {
    @inline
    def apply(
        Schedules: ScheduleList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSchedulesOutput = {
      val __obj = js.Dynamic.literal(
        "Schedules" -> Schedules.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSchedulesOutput]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var ResourceArn: TagResourceArn
  }

  object ListTagsForResourceInput {
    @inline
    def apply(
        ResourceArn: TagResourceArn
    ): ListTagsForResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceOutput {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
    }
  }

  /** Specifies the network configuration for an ECS task.
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

  /** An object representing a constraint on task placement.
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

  /** The task placement strategy for a task or service.
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

  /** A <code>RetryPolicy</code> object that includes information about the retry policy settings, including the maximum age of an event, and the maximum number of times EventBridge Scheduler will try to deliver the event to a target.
    */
  @js.native
  trait RetryPolicy extends js.Object {
    var MaximumEventAgeInSeconds: js.UndefOr[MaximumEventAgeInSeconds]
    var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttempts]
  }

  object RetryPolicy {
    @inline
    def apply(
        MaximumEventAgeInSeconds: js.UndefOr[MaximumEventAgeInSeconds] = js.undefined,
        MaximumRetryAttempts: js.UndefOr[MaximumRetryAttempts] = js.undefined
    ): RetryPolicy = {
      val __obj = js.Dynamic.literal()
      MaximumEventAgeInSeconds.foreach(__v => __obj.updateDynamic("MaximumEventAgeInSeconds")(__v.asInstanceOf[js.Any]))
      MaximumRetryAttempts.foreach(__v => __obj.updateDynamic("MaximumRetryAttempts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetryPolicy]
    }
  }

  /** The name and value pair of a parameter to use to start execution of a SageMaker Model Building Pipeline.
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

  /** The templated target type for the Amazon SageMaker <a href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StartPipelineExecution.html"> <code>StartPipelineExecution</code> </a> API operation.
    */
  @js.native
  trait SageMakerPipelineParameters extends js.Object {
    var PipelineParameterList: js.UndefOr[SageMakerPipelineParameterList]
  }

  object SageMakerPipelineParameters {
    @inline
    def apply(
        PipelineParameterList: js.UndefOr[SageMakerPipelineParameterList] = js.undefined
    ): SageMakerPipelineParameters = {
      val __obj = js.Dynamic.literal()
      PipelineParameterList.foreach(__v => __obj.updateDynamic("PipelineParameterList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SageMakerPipelineParameters]
    }
  }

  /** The details of a schedule group.
    */
  @js.native
  trait ScheduleGroupSummary extends js.Object {
    var Arn: js.UndefOr[ScheduleGroupArn]
    var CreationDate: js.UndefOr[CreationDate]
    var LastModificationDate: js.UndefOr[LastModificationDate]
    var Name: js.UndefOr[ScheduleGroupName]
    var State: js.UndefOr[ScheduleGroupState]
  }

  object ScheduleGroupSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ScheduleGroupArn] = js.undefined,
        CreationDate: js.UndefOr[CreationDate] = js.undefined,
        LastModificationDate: js.UndefOr[LastModificationDate] = js.undefined,
        Name: js.UndefOr[ScheduleGroupName] = js.undefined,
        State: js.UndefOr[ScheduleGroupState] = js.undefined
    ): ScheduleGroupSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      LastModificationDate.foreach(__v => __obj.updateDynamic("LastModificationDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduleGroupSummary]
    }
  }

  /** The details of a schedule.
    */
  @js.native
  trait ScheduleSummary extends js.Object {
    var Arn: js.UndefOr[ScheduleArn]
    var CreationDate: js.UndefOr[CreationDate]
    var GroupName: js.UndefOr[ScheduleGroupName]
    var LastModificationDate: js.UndefOr[LastModificationDate]
    var Name: js.UndefOr[Name]
    var State: js.UndefOr[ScheduleState]
    var Target: js.UndefOr[TargetSummary]
  }

  object ScheduleSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ScheduleArn] = js.undefined,
        CreationDate: js.UndefOr[CreationDate] = js.undefined,
        GroupName: js.UndefOr[ScheduleGroupName] = js.undefined,
        LastModificationDate: js.UndefOr[LastModificationDate] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        State: js.UndefOr[ScheduleState] = js.undefined,
        Target: js.UndefOr[TargetSummary] = js.undefined
    ): ScheduleSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      LastModificationDate.foreach(__v => __obj.updateDynamic("LastModificationDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduleSummary]
    }
  }

  /** The templated target type for the Amazon SQS <a href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html"> <code>SendMessage</code> </a> API operation. Contains the message group ID to use when the target is a FIFO queue. If you specify an Amazon SQS FIFO queue as a target, the queue must have content-based deduplication enabled. For more information, see [[https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html|Using the Amazon SQS message deduplication ID]] in the <i>Amazon SQS Developer Guide</i>.
    */
  @js.native
  trait SqsParameters extends js.Object {
    var MessageGroupId: js.UndefOr[MessageGroupId]
  }

  object SqsParameters {
    @inline
    def apply(
        MessageGroupId: js.UndefOr[MessageGroupId] = js.undefined
    ): SqsParameters = {
      val __obj = js.Dynamic.literal()
      MessageGroupId.foreach(__v => __obj.updateDynamic("MessageGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SqsParameters]
    }
  }

  /** Tag to associate with a schedule group.
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
  trait TagResourceInput extends js.Object {
    var ResourceArn: TagResourceArn
    var Tags: TagList
  }

  object TagResourceInput {
    @inline
    def apply(
        ResourceArn: TagResourceArn,
        Tags: TagList
    ): TagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceInput]
    }
  }

  @js.native
  trait TagResourceOutput extends js.Object

  object TagResourceOutput {
    @inline
    def apply(): TagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceOutput]
    }
  }

  /** The schedule's target. EventBridge Scheduler supports templated target that invoke common API operations, as well as universal targets that you can customize to invoke over 6,000 API operations across more than 270 services. You can only specify one templated or universal target for a schedule.
    */
  @js.native
  trait Target extends js.Object {
    var Arn: TargetArn
    var RoleArn: RoleArn
    var DeadLetterConfig: js.UndefOr[DeadLetterConfig]
    var EcsParameters: js.UndefOr[EcsParameters]
    var EventBridgeParameters: js.UndefOr[EventBridgeParameters]
    var Input: js.UndefOr[TargetInput]
    var KinesisParameters: js.UndefOr[KinesisParameters]
    var RetryPolicy: js.UndefOr[RetryPolicy]
    var SageMakerPipelineParameters: js.UndefOr[SageMakerPipelineParameters]
    var SqsParameters: js.UndefOr[SqsParameters]
  }

  object Target {
    @inline
    def apply(
        Arn: TargetArn,
        RoleArn: RoleArn,
        DeadLetterConfig: js.UndefOr[DeadLetterConfig] = js.undefined,
        EcsParameters: js.UndefOr[EcsParameters] = js.undefined,
        EventBridgeParameters: js.UndefOr[EventBridgeParameters] = js.undefined,
        Input: js.UndefOr[TargetInput] = js.undefined,
        KinesisParameters: js.UndefOr[KinesisParameters] = js.undefined,
        RetryPolicy: js.UndefOr[RetryPolicy] = js.undefined,
        SageMakerPipelineParameters: js.UndefOr[SageMakerPipelineParameters] = js.undefined,
        SqsParameters: js.UndefOr[SqsParameters] = js.undefined
    ): Target = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      DeadLetterConfig.foreach(__v => __obj.updateDynamic("DeadLetterConfig")(__v.asInstanceOf[js.Any]))
      EcsParameters.foreach(__v => __obj.updateDynamic("EcsParameters")(__v.asInstanceOf[js.Any]))
      EventBridgeParameters.foreach(__v => __obj.updateDynamic("EventBridgeParameters")(__v.asInstanceOf[js.Any]))
      Input.foreach(__v => __obj.updateDynamic("Input")(__v.asInstanceOf[js.Any]))
      KinesisParameters.foreach(__v => __obj.updateDynamic("KinesisParameters")(__v.asInstanceOf[js.Any]))
      RetryPolicy.foreach(__v => __obj.updateDynamic("RetryPolicy")(__v.asInstanceOf[js.Any]))
      SageMakerPipelineParameters.foreach(__v => __obj.updateDynamic("SageMakerPipelineParameters")(__v.asInstanceOf[js.Any]))
      SqsParameters.foreach(__v => __obj.updateDynamic("SqsParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Target]
    }
  }

  /** The details of a target.
    */
  @js.native
  trait TargetSummary extends js.Object {
    var Arn: TargetArn
  }

  object TargetSummary {
    @inline
    def apply(
        Arn: TargetArn
    ): TargetSummary = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TargetSummary]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var ResourceArn: TagResourceArn
    var TagKeys: TagKeyList
  }

  object UntagResourceInput {
    @inline
    def apply(
        ResourceArn: TagResourceArn,
        TagKeys: TagKeyList
    ): UntagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UntagResourceOutput extends js.Object

  object UntagResourceOutput {
    @inline
    def apply(): UntagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceOutput]
    }
  }

  @js.native
  trait UpdateScheduleInput extends js.Object {
    var FlexibleTimeWindow: FlexibleTimeWindow
    var Name: Name
    var ScheduleExpression: ScheduleExpression
    var Target: Target
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[Description]
    var EndDate: js.UndefOr[EndDate]
    var GroupName: js.UndefOr[ScheduleGroupName]
    var KmsKeyArn: js.UndefOr[KmsKeyArn]
    var ScheduleExpressionTimezone: js.UndefOr[ScheduleExpressionTimezone]
    var StartDate: js.UndefOr[StartDate]
    var State: js.UndefOr[ScheduleState]
  }

  object UpdateScheduleInput {
    @inline
    def apply(
        FlexibleTimeWindow: FlexibleTimeWindow,
        Name: Name,
        ScheduleExpression: ScheduleExpression,
        Target: Target,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        EndDate: js.UndefOr[EndDate] = js.undefined,
        GroupName: js.UndefOr[ScheduleGroupName] = js.undefined,
        KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined,
        ScheduleExpressionTimezone: js.UndefOr[ScheduleExpressionTimezone] = js.undefined,
        StartDate: js.UndefOr[StartDate] = js.undefined,
        State: js.UndefOr[ScheduleState] = js.undefined
    ): UpdateScheduleInput = {
      val __obj = js.Dynamic.literal(
        "FlexibleTimeWindow" -> FlexibleTimeWindow.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "ScheduleExpression" -> ScheduleExpression.asInstanceOf[js.Any],
        "Target" -> Target.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EndDate.foreach(__v => __obj.updateDynamic("EndDate")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      ScheduleExpressionTimezone.foreach(__v => __obj.updateDynamic("ScheduleExpressionTimezone")(__v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.updateDynamic("StartDate")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateScheduleInput]
    }
  }

  @js.native
  trait UpdateScheduleOutput extends js.Object {
    var ScheduleArn: ScheduleArn
  }

  object UpdateScheduleOutput {
    @inline
    def apply(
        ScheduleArn: ScheduleArn
    ): UpdateScheduleOutput = {
      val __obj = js.Dynamic.literal(
        "ScheduleArn" -> ScheduleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateScheduleOutput]
    }
  }
}
