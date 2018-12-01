package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object cloudwatchevents {
  type Action = String
  type Arn = String
  type AssignPublicIp = String
  type ErrorCode = String
  type ErrorMessage = String
  type EventId = String
  type EventPattern = String
  type EventResource = String
  type EventResourceList = js.Array[EventResource]
  type EventTime = js.Date
  type InputTransformerPathKey = String
  type LaunchType = String
  type LimitMax100 = Int
  type LimitMin1 = Int
  type ManagedBy = String
  type MessageGroupId = String
  type NextToken = String
  type Principal = String
  type PutEventsRequestEntryList = js.Array[PutEventsRequestEntry]
  type PutEventsResultEntryList = js.Array[PutEventsResultEntry]
  type PutTargetsResultEntryList = js.Array[PutTargetsResultEntry]
  type RemoveTargetsResultEntryList = js.Array[RemoveTargetsResultEntry]
  type RoleArn = String
  type RuleArn = String
  type RuleDescription = String
  type RuleName = String
  type RuleNameList = js.Array[RuleName]
  type RuleResponseList = js.Array[Rule]
  type RuleState = String
  type RunCommandTargetKey = String
  type RunCommandTargetValue = String
  type RunCommandTargetValues = js.Array[RunCommandTargetValue]
  type RunCommandTargets = js.Array[RunCommandTarget]
  type ScheduleExpression = String
  type StatementId = String
  type StringList = js.Array[String]
  type TargetArn = String
  type TargetId = String
  type TargetIdList = js.Array[TargetId]
  type TargetInput = String
  type TargetInputPath = String
  type TargetList = js.Array[Target]
  type TargetPartitionKeyPath = String
  type TransformerInput = String
  type TransformerPaths = js.Dictionary[TargetInputPath]
}

package cloudwatchevents {
  @js.native
  @JSImport("aws-sdk", "CloudWatchEvents")
  class CloudWatchEvents(config: AWSConfig) extends js.Object {
    def deleteRule(params: DeleteRuleRequest): Request[js.Object] = js.native
    def describeEventBus(params: DescribeEventBusRequest): Request[DescribeEventBusResponse] = js.native
    def describeRule(params: DescribeRuleRequest): Request[DescribeRuleResponse] = js.native
    def disableRule(params: DisableRuleRequest): Request[js.Object] = js.native
    def enableRule(params: EnableRuleRequest): Request[js.Object] = js.native
    def listRuleNamesByTarget(params: ListRuleNamesByTargetRequest): Request[ListRuleNamesByTargetResponse] = js.native
    def listRules(params: ListRulesRequest): Request[ListRulesResponse] = js.native
    def listTargetsByRule(params: ListTargetsByRuleRequest): Request[ListTargetsByRuleResponse] = js.native
    def putEvents(params: PutEventsRequest): Request[PutEventsResponse] = js.native
    def putPermission(params: PutPermissionRequest): Request[js.Object] = js.native
    def putRule(params: PutRuleRequest): Request[PutRuleResponse] = js.native
    def putTargets(params: PutTargetsRequest): Request[PutTargetsResponse] = js.native
    def removePermission(params: RemovePermissionRequest): Request[js.Object] = js.native
    def removeTargets(params: RemoveTargetsRequest): Request[RemoveTargetsResponse] = js.native
    def testEventPattern(params: TestEventPatternRequest): Request[TestEventPatternResponse] = js.native
  }

  object AssignPublicIpEnum {
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  /**
   * <p>This structure specifies the VPC subnets and security groups for the task, and whether a public IP address is to be used. This structure is relevant only for ECS tasks that use the <code>awsvpc</code> network mode.</p>
   */
  @js.native
  trait AwsVpcConfiguration extends js.Object {
    var Subnets: js.UndefOr[StringList]
    var SecurityGroups: js.UndefOr[StringList]
    var AssignPublicIp: js.UndefOr[AssignPublicIp]
  }

  object AwsVpcConfiguration {
    def apply(
      Subnets: js.UndefOr[StringList] = js.undefined,
      SecurityGroups: js.UndefOr[StringList] = js.undefined,
      AssignPublicIp: js.UndefOr[AssignPublicIp] = js.undefined): AwsVpcConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Subnets" -> Subnets.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "AssignPublicIp" -> AssignPublicIp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AwsVpcConfiguration]
    }
  }

  /**
   * <p>The array properties for the submitted job, such as the size of the array. The array size can be between 2 and 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used only if the target is an AWS Batch job.</p>
   */
  @js.native
  trait BatchArrayProperties extends js.Object {
    var Size: js.UndefOr[Int]
  }

  object BatchArrayProperties {
    def apply(
      Size: js.UndefOr[Int] = js.undefined): BatchArrayProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Size" -> Size.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchArrayProperties]
    }
  }

  /**
   * <p>The custom parameters to be used when the target is an AWS Batch job.</p>
   */
  @js.native
  trait BatchParameters extends js.Object {
    var JobDefinition: js.UndefOr[String]
    var JobName: js.UndefOr[String]
    var ArrayProperties: js.UndefOr[BatchArrayProperties]
    var RetryStrategy: js.UndefOr[BatchRetryStrategy]
  }

  object BatchParameters {
    def apply(
      JobDefinition: js.UndefOr[String] = js.undefined,
      JobName: js.UndefOr[String] = js.undefined,
      ArrayProperties: js.UndefOr[BatchArrayProperties] = js.undefined,
      RetryStrategy: js.UndefOr[BatchRetryStrategy] = js.undefined): BatchParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobDefinition" -> JobDefinition.map { x => x.asInstanceOf[js.Any] },
        "JobName" -> JobName.map { x => x.asInstanceOf[js.Any] },
        "ArrayProperties" -> ArrayProperties.map { x => x.asInstanceOf[js.Any] },
        "RetryStrategy" -> RetryStrategy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchParameters]
    }
  }

  /**
   * <p>The retry strategy to use for failed jobs, if the target is an AWS Batch job. If you specify a retry strategy here, it overrides the retry strategy defined in the job definition.</p>
   */
  @js.native
  trait BatchRetryStrategy extends js.Object {
    var Attempts: js.UndefOr[Int]
  }

  object BatchRetryStrategy {
    def apply(
      Attempts: js.UndefOr[Int] = js.undefined): BatchRetryStrategy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attempts" -> Attempts.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchRetryStrategy]
    }
  }

  /**
   * <p>A JSON string which you can use to limit the event bus permissions you are granting to only accounts that fulfill the condition. Currently, the only supported condition is membership in a certain AWS organization. The string must contain <code>Type</code>, <code>Key</code>, and <code>Value</code> fields. The <code>Value</code> field specifies the ID of the AWS organization. Following is an example value for <code>Condition</code>:</p> <p> <code>'{"Type" : "StringEquals", "Key": "aws:PrincipalOrgID", "Value": "o-1234567890"}'</code> </p>
   */
  @js.native
  trait Condition extends js.Object {
    var Type: js.UndefOr[String]
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Condition {
    def apply(
      Type: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined): Condition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Condition]
    }
  }

  @js.native
  trait DeleteRuleRequest extends js.Object {
    var Name: js.UndefOr[RuleName]
    var Force: js.UndefOr[Boolean]
  }

  object DeleteRuleRequest {
    def apply(
      Name: js.UndefOr[RuleName] = js.undefined,
      Force: js.UndefOr[Boolean] = js.undefined): DeleteRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Force" -> Force.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRuleRequest]
    }
  }

  @js.native
  trait DescribeEventBusRequest extends js.Object {

  }

  object DescribeEventBusRequest {
    def apply(): DescribeEventBusRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventBusRequest]
    }
  }

  @js.native
  trait DescribeEventBusResponse extends js.Object {
    var Name: js.UndefOr[String]
    var Arn: js.UndefOr[String]
    var Policy: js.UndefOr[String]
  }

  object DescribeEventBusResponse {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Arn: js.UndefOr[String] = js.undefined,
      Policy: js.UndefOr[String] = js.undefined): DescribeEventBusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventBusResponse]
    }
  }

  @js.native
  trait DescribeRuleRequest extends js.Object {
    var Name: js.UndefOr[RuleName]
  }

  object DescribeRuleRequest {
    def apply(
      Name: js.UndefOr[RuleName] = js.undefined): DescribeRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRuleRequest]
    }
  }

  @js.native
  trait DescribeRuleResponse extends js.Object {
    var Name: js.UndefOr[RuleName]
    var Description: js.UndefOr[RuleDescription]
    var ManagedBy: js.UndefOr[ManagedBy]
    var Arn: js.UndefOr[RuleArn]
    var EventPattern: js.UndefOr[EventPattern]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var State: js.UndefOr[RuleState]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object DescribeRuleResponse {
    def apply(
      Name: js.UndefOr[RuleName] = js.undefined,
      Description: js.UndefOr[RuleDescription] = js.undefined,
      ManagedBy: js.UndefOr[ManagedBy] = js.undefined,
      Arn: js.UndefOr[RuleArn] = js.undefined,
      EventPattern: js.UndefOr[EventPattern] = js.undefined,
      ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
      State: js.UndefOr[RuleState] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined): DescribeRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ManagedBy" -> ManagedBy.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "EventPattern" -> EventPattern.map { x => x.asInstanceOf[js.Any] },
        "ScheduleExpression" -> ScheduleExpression.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRuleResponse]
    }
  }

  @js.native
  trait DisableRuleRequest extends js.Object {
    var Name: js.UndefOr[RuleName]
  }

  object DisableRuleRequest {
    def apply(
      Name: js.UndefOr[RuleName] = js.undefined): DisableRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableRuleRequest]
    }
  }

  /**
   * <p>The custom parameters to be used when the target is an Amazon ECS task.</p>
   */
  @js.native
  trait EcsParameters extends js.Object {
    var PlatformVersion: js.UndefOr[String]
    var NetworkConfiguration: js.UndefOr[NetworkConfiguration]
    var TaskCount: js.UndefOr[LimitMin1]
    var Group: js.UndefOr[String]
    var TaskDefinitionArn: js.UndefOr[Arn]
    var LaunchType: js.UndefOr[LaunchType]
  }

  object EcsParameters {
    def apply(
      PlatformVersion: js.UndefOr[String] = js.undefined,
      NetworkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
      TaskCount: js.UndefOr[LimitMin1] = js.undefined,
      Group: js.UndefOr[String] = js.undefined,
      TaskDefinitionArn: js.UndefOr[Arn] = js.undefined,
      LaunchType: js.UndefOr[LaunchType] = js.undefined): EcsParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlatformVersion" -> PlatformVersion.map { x => x.asInstanceOf[js.Any] },
        "NetworkConfiguration" -> NetworkConfiguration.map { x => x.asInstanceOf[js.Any] },
        "TaskCount" -> TaskCount.map { x => x.asInstanceOf[js.Any] },
        "Group" -> Group.map { x => x.asInstanceOf[js.Any] },
        "TaskDefinitionArn" -> TaskDefinitionArn.map { x => x.asInstanceOf[js.Any] },
        "LaunchType" -> LaunchType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EcsParameters]
    }
  }

  @js.native
  trait EnableRuleRequest extends js.Object {
    var Name: js.UndefOr[RuleName]
  }

  object EnableRuleRequest {
    def apply(
      Name: js.UndefOr[RuleName] = js.undefined): EnableRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableRuleRequest]
    }
  }

  /**
   * <p>Contains the parameters needed for you to provide custom input to a target based on one or more pieces of data extracted from the event.</p>
   */
  @js.native
  trait InputTransformer extends js.Object {
    var InputPathsMap: js.UndefOr[TransformerPaths]
    var InputTemplate: js.UndefOr[TransformerInput]
  }

  object InputTransformer {
    def apply(
      InputPathsMap: js.UndefOr[TransformerPaths] = js.undefined,
      InputTemplate: js.UndefOr[TransformerInput] = js.undefined): InputTransformer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputPathsMap" -> InputPathsMap.map { x => x.asInstanceOf[js.Any] },
        "InputTemplate" -> InputTemplate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputTransformer]
    }
  }

  /**
   * <p>This object enables you to specify a JSON path to extract from the event and use as the partition key for the Amazon Kinesis data stream, so that you can control the shard to which the event goes. If you do not include this parameter, the default is to use the <code>eventId</code> as the partition key.</p>
   */
  @js.native
  trait KinesisParameters extends js.Object {
    var PartitionKeyPath: js.UndefOr[TargetPartitionKeyPath]
  }

  object KinesisParameters {
    def apply(
      PartitionKeyPath: js.UndefOr[TargetPartitionKeyPath] = js.undefined): KinesisParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PartitionKeyPath" -> PartitionKeyPath.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisParameters]
    }
  }

  object LaunchTypeEnum {
    val EC2 = "EC2"
    val FARGATE = "FARGATE"

    val values = IndexedSeq(EC2, FARGATE)
  }

  @js.native
  trait ListRuleNamesByTargetRequest extends js.Object {
    var TargetArn: js.UndefOr[TargetArn]
    var NextToken: js.UndefOr[NextToken]
    var Limit: js.UndefOr[LimitMax100]
  }

  object ListRuleNamesByTargetRequest {
    def apply(
      TargetArn: js.UndefOr[TargetArn] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Limit: js.UndefOr[LimitMax100] = js.undefined): ListRuleNamesByTargetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetArn" -> TargetArn.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRuleNamesByTargetRequest]
    }
  }

  @js.native
  trait ListRuleNamesByTargetResponse extends js.Object {
    var RuleNames: js.UndefOr[RuleNameList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRuleNamesByTargetResponse {
    def apply(
      RuleNames: js.UndefOr[RuleNameList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListRuleNamesByTargetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleNames" -> RuleNames.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRuleNamesByTargetResponse]
    }
  }

  @js.native
  trait ListRulesRequest extends js.Object {
    var NamePrefix: js.UndefOr[RuleName]
    var NextToken: js.UndefOr[NextToken]
    var Limit: js.UndefOr[LimitMax100]
  }

  object ListRulesRequest {
    def apply(
      NamePrefix: js.UndefOr[RuleName] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Limit: js.UndefOr[LimitMax100] = js.undefined): ListRulesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NamePrefix" -> NamePrefix.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRulesRequest]
    }
  }

  @js.native
  trait ListRulesResponse extends js.Object {
    var Rules: js.UndefOr[RuleResponseList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRulesResponse {
    def apply(
      Rules: js.UndefOr[RuleResponseList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListRulesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Rules" -> Rules.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRulesResponse]
    }
  }

  @js.native
  trait ListTargetsByRuleRequest extends js.Object {
    var Rule: js.UndefOr[RuleName]
    var NextToken: js.UndefOr[NextToken]
    var Limit: js.UndefOr[LimitMax100]
  }

  object ListTargetsByRuleRequest {
    def apply(
      Rule: js.UndefOr[RuleName] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Limit: js.UndefOr[LimitMax100] = js.undefined): ListTargetsByRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Rule" -> Rule.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTargetsByRuleRequest]
    }
  }

  @js.native
  trait ListTargetsByRuleResponse extends js.Object {
    var Targets: js.UndefOr[TargetList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTargetsByRuleResponse {
    def apply(
      Targets: js.UndefOr[TargetList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTargetsByRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTargetsByRuleResponse]
    }
  }

  /**
   * <p>This structure specifies the network configuration for an ECS task.</p>
   */
  @js.native
  trait NetworkConfiguration extends js.Object {
    var awsvpcConfiguration: js.UndefOr[AwsVpcConfiguration]
  }

  object NetworkConfiguration {
    def apply(
      awsvpcConfiguration: js.UndefOr[AwsVpcConfiguration] = js.undefined): NetworkConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "awsvpcConfiguration" -> awsvpcConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkConfiguration]
    }
  }

  @js.native
  trait PutEventsRequest extends js.Object {
    var Entries: js.UndefOr[PutEventsRequestEntryList]
  }

  object PutEventsRequest {
    def apply(
      Entries: js.UndefOr[PutEventsRequestEntryList] = js.undefined): PutEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Entries" -> Entries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEventsRequest]
    }
  }

  /**
   * <p>Represents an event to be submitted.</p>
   */
  @js.native
  trait PutEventsRequestEntry extends js.Object {
    var Detail: js.UndefOr[String]
    var Resources: js.UndefOr[EventResourceList]
    var DetailType: js.UndefOr[String]
    var Source: js.UndefOr[String]
    var Time: js.UndefOr[EventTime]
  }

  object PutEventsRequestEntry {
    def apply(
      Detail: js.UndefOr[String] = js.undefined,
      Resources: js.UndefOr[EventResourceList] = js.undefined,
      DetailType: js.UndefOr[String] = js.undefined,
      Source: js.UndefOr[String] = js.undefined,
      Time: js.UndefOr[EventTime] = js.undefined): PutEventsRequestEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Detail" -> Detail.map { x => x.asInstanceOf[js.Any] },
        "Resources" -> Resources.map { x => x.asInstanceOf[js.Any] },
        "DetailType" -> DetailType.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] },
        "Time" -> Time.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEventsRequestEntry]
    }
  }

  @js.native
  trait PutEventsResponse extends js.Object {
    var FailedEntryCount: js.UndefOr[Int]
    var Entries: js.UndefOr[PutEventsResultEntryList]
  }

  object PutEventsResponse {
    def apply(
      FailedEntryCount: js.UndefOr[Int] = js.undefined,
      Entries: js.UndefOr[PutEventsResultEntryList] = js.undefined): PutEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedEntryCount" -> FailedEntryCount.map { x => x.asInstanceOf[js.Any] },
        "Entries" -> Entries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEventsResponse]
    }
  }

  /**
   * <p>Represents an event that failed to be submitted.</p>
   */
  @js.native
  trait PutEventsResultEntry extends js.Object {
    var EventId: js.UndefOr[EventId]
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
  }

  object PutEventsResultEntry {
    def apply(
      EventId: js.UndefOr[EventId] = js.undefined,
      ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
      ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined): PutEventsResultEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventId" -> EventId.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEventsResultEntry]
    }
  }

  @js.native
  trait PutPermissionRequest extends js.Object {
    var Action: js.UndefOr[Action]
    var Principal: js.UndefOr[Principal]
    var StatementId: js.UndefOr[StatementId]
    var Condition: js.UndefOr[Condition]
  }

  object PutPermissionRequest {
    def apply(
      Action: js.UndefOr[Action] = js.undefined,
      Principal: js.UndefOr[Principal] = js.undefined,
      StatementId: js.UndefOr[StatementId] = js.undefined,
      Condition: js.UndefOr[Condition] = js.undefined): PutPermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "Principal" -> Principal.map { x => x.asInstanceOf[js.Any] },
        "StatementId" -> StatementId.map { x => x.asInstanceOf[js.Any] },
        "Condition" -> Condition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutPermissionRequest]
    }
  }

  @js.native
  trait PutRuleRequest extends js.Object {
    var Name: js.UndefOr[RuleName]
    var Description: js.UndefOr[RuleDescription]
    var EventPattern: js.UndefOr[EventPattern]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var State: js.UndefOr[RuleState]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object PutRuleRequest {
    def apply(
      Name: js.UndefOr[RuleName] = js.undefined,
      Description: js.UndefOr[RuleDescription] = js.undefined,
      EventPattern: js.UndefOr[EventPattern] = js.undefined,
      ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
      State: js.UndefOr[RuleState] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined): PutRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "EventPattern" -> EventPattern.map { x => x.asInstanceOf[js.Any] },
        "ScheduleExpression" -> ScheduleExpression.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRuleRequest]
    }
  }

  @js.native
  trait PutRuleResponse extends js.Object {
    var RuleArn: js.UndefOr[RuleArn]
  }

  object PutRuleResponse {
    def apply(
      RuleArn: js.UndefOr[RuleArn] = js.undefined): PutRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleArn" -> RuleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRuleResponse]
    }
  }

  @js.native
  trait PutTargetsRequest extends js.Object {
    var Rule: js.UndefOr[RuleName]
    var Targets: js.UndefOr[TargetList]
  }

  object PutTargetsRequest {
    def apply(
      Rule: js.UndefOr[RuleName] = js.undefined,
      Targets: js.UndefOr[TargetList] = js.undefined): PutTargetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Rule" -> Rule.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutTargetsRequest]
    }
  }

  @js.native
  trait PutTargetsResponse extends js.Object {
    var FailedEntryCount: js.UndefOr[Int]
    var FailedEntries: js.UndefOr[PutTargetsResultEntryList]
  }

  object PutTargetsResponse {
    def apply(
      FailedEntryCount: js.UndefOr[Int] = js.undefined,
      FailedEntries: js.UndefOr[PutTargetsResultEntryList] = js.undefined): PutTargetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedEntryCount" -> FailedEntryCount.map { x => x.asInstanceOf[js.Any] },
        "FailedEntries" -> FailedEntries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutTargetsResponse]
    }
  }

  /**
   * <p>Represents a target that failed to be added to a rule.</p>
   */
  @js.native
  trait PutTargetsResultEntry extends js.Object {
    var TargetId: js.UndefOr[TargetId]
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
  }

  object PutTargetsResultEntry {
    def apply(
      TargetId: js.UndefOr[TargetId] = js.undefined,
      ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
      ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined): PutTargetsResultEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetId" -> TargetId.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutTargetsResultEntry]
    }
  }

  @js.native
  trait RemovePermissionRequest extends js.Object {
    var StatementId: js.UndefOr[StatementId]
  }

  object RemovePermissionRequest {
    def apply(
      StatementId: js.UndefOr[StatementId] = js.undefined): RemovePermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatementId" -> StatementId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemovePermissionRequest]
    }
  }

  @js.native
  trait RemoveTargetsRequest extends js.Object {
    var Rule: js.UndefOr[RuleName]
    var Ids: js.UndefOr[TargetIdList]
    var Force: js.UndefOr[Boolean]
  }

  object RemoveTargetsRequest {
    def apply(
      Rule: js.UndefOr[RuleName] = js.undefined,
      Ids: js.UndefOr[TargetIdList] = js.undefined,
      Force: js.UndefOr[Boolean] = js.undefined): RemoveTargetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Rule" -> Rule.map { x => x.asInstanceOf[js.Any] },
        "Ids" -> Ids.map { x => x.asInstanceOf[js.Any] },
        "Force" -> Force.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTargetsRequest]
    }
  }

  @js.native
  trait RemoveTargetsResponse extends js.Object {
    var FailedEntryCount: js.UndefOr[Int]
    var FailedEntries: js.UndefOr[RemoveTargetsResultEntryList]
  }

  object RemoveTargetsResponse {
    def apply(
      FailedEntryCount: js.UndefOr[Int] = js.undefined,
      FailedEntries: js.UndefOr[RemoveTargetsResultEntryList] = js.undefined): RemoveTargetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedEntryCount" -> FailedEntryCount.map { x => x.asInstanceOf[js.Any] },
        "FailedEntries" -> FailedEntries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTargetsResponse]
    }
  }

  /**
   * <p>Represents a target that failed to be removed from a rule.</p>
   */
  @js.native
  trait RemoveTargetsResultEntry extends js.Object {
    var TargetId: js.UndefOr[TargetId]
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
  }

  object RemoveTargetsResultEntry {
    def apply(
      TargetId: js.UndefOr[TargetId] = js.undefined,
      ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
      ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined): RemoveTargetsResultEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetId" -> TargetId.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTargetsResultEntry]
    }
  }

  /**
   * <p>Contains information about a rule in Amazon CloudWatch Events.</p>
   */
  @js.native
  trait Rule extends js.Object {
    var Name: js.UndefOr[RuleName]
    var Description: js.UndefOr[RuleDescription]
    var ManagedBy: js.UndefOr[ManagedBy]
    var Arn: js.UndefOr[RuleArn]
    var EventPattern: js.UndefOr[EventPattern]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var State: js.UndefOr[RuleState]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object Rule {
    def apply(
      Name: js.UndefOr[RuleName] = js.undefined,
      Description: js.UndefOr[RuleDescription] = js.undefined,
      ManagedBy: js.UndefOr[ManagedBy] = js.undefined,
      Arn: js.UndefOr[RuleArn] = js.undefined,
      EventPattern: js.UndefOr[EventPattern] = js.undefined,
      ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
      State: js.UndefOr[RuleState] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined): Rule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ManagedBy" -> ManagedBy.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "EventPattern" -> EventPattern.map { x => x.asInstanceOf[js.Any] },
        "ScheduleExpression" -> ScheduleExpression.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Rule]
    }
  }

  object RuleStateEnum {
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  /**
   * <p>This parameter contains the criteria (either InstanceIds or a tag) used to specify which EC2 instances are to be sent the command. </p>
   */
  @js.native
  trait RunCommandParameters extends js.Object {
    var RunCommandTargets: js.UndefOr[RunCommandTargets]
  }

  object RunCommandParameters {
    def apply(
      RunCommandTargets: js.UndefOr[RunCommandTargets] = js.undefined): RunCommandParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RunCommandTargets" -> RunCommandTargets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunCommandParameters]
    }
  }

  /**
   * <p>Information about the EC2 instances that are to be sent the command, specified as key-value pairs. Each <code>RunCommandTarget</code> block can include only one key, but this key may specify multiple values.</p>
   */
  @js.native
  trait RunCommandTarget extends js.Object {
    var Key: js.UndefOr[RunCommandTargetKey]
    var Values: js.UndefOr[RunCommandTargetValues]
  }

  object RunCommandTarget {
    def apply(
      Key: js.UndefOr[RunCommandTargetKey] = js.undefined,
      Values: js.UndefOr[RunCommandTargetValues] = js.undefined): RunCommandTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunCommandTarget]
    }
  }

  /**
   * <p>This structure includes the custom parameter to be used when the target is an SQS FIFO queue.</p>
   */
  @js.native
  trait SqsParameters extends js.Object {
    var MessageGroupId: js.UndefOr[MessageGroupId]
  }

  object SqsParameters {
    def apply(
      MessageGroupId: js.UndefOr[MessageGroupId] = js.undefined): SqsParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MessageGroupId" -> MessageGroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SqsParameters]
    }
  }

  /**
   * <p>Targets are the resources to be invoked when a rule is triggered. For a complete list of services and resources that can be set as a target, see <a>PutTargets</a>.</p> <p>If you are setting the event bus of another account as the target, and that account granted permission to your account through an organization instead of directly by the account ID, then you must specify a <code>RoleArn</code> with proper permissions in the <code>Target</code> structure. For more information, see <a href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/events/CloudWatchEvents-CrossAccountEventDelivery.html">Sending and Receiving Events Between AWS Accounts</a> in the <i>Amazon CloudWatch Events User Guide</i>.</p>
   */
  @js.native
  trait Target extends js.Object {
    var Id: js.UndefOr[TargetId]
    var BatchParameters: js.UndefOr[BatchParameters]
    var RunCommandParameters: js.UndefOr[RunCommandParameters]
    var EcsParameters: js.UndefOr[EcsParameters]
    var InputPath: js.UndefOr[TargetInputPath]
    var InputTransformer: js.UndefOr[InputTransformer]
    var Arn: js.UndefOr[TargetArn]
    var Input: js.UndefOr[TargetInput]
    var SqsParameters: js.UndefOr[SqsParameters]
    var KinesisParameters: js.UndefOr[KinesisParameters]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object Target {
    def apply(
      Id: js.UndefOr[TargetId] = js.undefined,
      BatchParameters: js.UndefOr[BatchParameters] = js.undefined,
      RunCommandParameters: js.UndefOr[RunCommandParameters] = js.undefined,
      EcsParameters: js.UndefOr[EcsParameters] = js.undefined,
      InputPath: js.UndefOr[TargetInputPath] = js.undefined,
      InputTransformer: js.UndefOr[InputTransformer] = js.undefined,
      Arn: js.UndefOr[TargetArn] = js.undefined,
      Input: js.UndefOr[TargetInput] = js.undefined,
      SqsParameters: js.UndefOr[SqsParameters] = js.undefined,
      KinesisParameters: js.UndefOr[KinesisParameters] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined): Target = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "BatchParameters" -> BatchParameters.map { x => x.asInstanceOf[js.Any] },
        "RunCommandParameters" -> RunCommandParameters.map { x => x.asInstanceOf[js.Any] },
        "EcsParameters" -> EcsParameters.map { x => x.asInstanceOf[js.Any] },
        "InputPath" -> InputPath.map { x => x.asInstanceOf[js.Any] },
        "InputTransformer" -> InputTransformer.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Input" -> Input.map { x => x.asInstanceOf[js.Any] },
        "SqsParameters" -> SqsParameters.map { x => x.asInstanceOf[js.Any] },
        "KinesisParameters" -> KinesisParameters.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Target]
    }
  }

  @js.native
  trait TestEventPatternRequest extends js.Object {
    var EventPattern: js.UndefOr[EventPattern]
    var Event: js.UndefOr[String]
  }

  object TestEventPatternRequest {
    def apply(
      EventPattern: js.UndefOr[EventPattern] = js.undefined,
      Event: js.UndefOr[String] = js.undefined): TestEventPatternRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventPattern" -> EventPattern.map { x => x.asInstanceOf[js.Any] },
        "Event" -> Event.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestEventPatternRequest]
    }
  }

  @js.native
  trait TestEventPatternResponse extends js.Object {
    var Result: js.UndefOr[Boolean]
  }

  object TestEventPatternResponse {
    def apply(
      Result: js.UndefOr[Boolean] = js.undefined): TestEventPatternResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Result" -> Result.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestEventPatternResponse]
    }
  }
}
