package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object cloudwatchevents {
  type Action                       = String
  type Arn                          = String
  type AssignPublicIp               = String
  type ErrorCode                    = String
  type ErrorMessage                 = String
  type EventId                      = String
  type EventPattern                 = String
  type EventResource                = String
  type EventResourceList            = js.Array[EventResource]
  type EventTime                    = js.Date
  type InputTransformerPathKey      = String
  type LaunchType                   = String
  type LimitMax100                  = Int
  type LimitMin1                    = Int
  type ManagedBy                    = String
  type MessageGroupId               = String
  type NextToken                    = String
  type Principal                    = String
  type PutEventsRequestEntryList    = js.Array[PutEventsRequestEntry]
  type PutEventsResultEntryList     = js.Array[PutEventsResultEntry]
  type PutTargetsResultEntryList    = js.Array[PutTargetsResultEntry]
  type RemoveTargetsResultEntryList = js.Array[RemoveTargetsResultEntry]
  type RoleArn                      = String
  type RuleArn                      = String
  type RuleDescription              = String
  type RuleName                     = String
  type RuleNameList                 = js.Array[RuleName]
  type RuleResponseList             = js.Array[Rule]
  type RuleState                    = String
  type RunCommandTargetKey          = String
  type RunCommandTargetValue        = String
  type RunCommandTargetValues       = js.Array[RunCommandTargetValue]
  type RunCommandTargets            = js.Array[RunCommandTarget]
  type ScheduleExpression           = String
  type StatementId                  = String
  type StringList                   = js.Array[String]
  type TagKey                       = String
  type TagKeyList                   = js.Array[TagKey]
  type TagList                      = js.Array[Tag]
  type TagValue                     = String
  type TargetArn                    = String
  type TargetId                     = String
  type TargetIdList                 = js.Array[TargetId]
  type TargetInput                  = String
  type TargetInputPath              = String
  type TargetList                   = js.Array[Target]
  type TargetPartitionKeyPath       = String
  type TransformerInput             = String
  type TransformerPaths             = js.Dictionary[TargetInputPath]

  implicit final class CloudWatchEventsOps(val service: CloudWatchEvents) extends AnyVal {

    def deleteRuleFuture(params: DeleteRuleRequest): Future[js.Object] = service.deleteRule(params).promise.toFuture
    def describeEventBusFuture(params: DescribeEventBusRequest): Future[DescribeEventBusResponse] =
      service.describeEventBus(params).promise.toFuture
    def describeRuleFuture(params: DescribeRuleRequest): Future[DescribeRuleResponse] =
      service.describeRule(params).promise.toFuture
    def disableRuleFuture(params: DisableRuleRequest): Future[js.Object] = service.disableRule(params).promise.toFuture
    def enableRuleFuture(params: EnableRuleRequest): Future[js.Object]   = service.enableRule(params).promise.toFuture
    def listRuleNamesByTargetFuture(params: ListRuleNamesByTargetRequest): Future[ListRuleNamesByTargetResponse] =
      service.listRuleNamesByTarget(params).promise.toFuture
    def listRulesFuture(params: ListRulesRequest): Future[ListRulesResponse] =
      service.listRules(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def listTargetsByRuleFuture(params: ListTargetsByRuleRequest): Future[ListTargetsByRuleResponse] =
      service.listTargetsByRule(params).promise.toFuture
    def putEventsFuture(params: PutEventsRequest): Future[PutEventsResponse] =
      service.putEvents(params).promise.toFuture
    def putPermissionFuture(params: PutPermissionRequest): Future[js.Object] =
      service.putPermission(params).promise.toFuture
    def putRuleFuture(params: PutRuleRequest): Future[PutRuleResponse] = service.putRule(params).promise.toFuture
    def putTargetsFuture(params: PutTargetsRequest): Future[PutTargetsResponse] =
      service.putTargets(params).promise.toFuture
    def removePermissionFuture(params: RemovePermissionRequest): Future[js.Object] =
      service.removePermission(params).promise.toFuture
    def removeTargetsFuture(params: RemoveTargetsRequest): Future[RemoveTargetsResponse] =
      service.removeTargets(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def testEventPatternFuture(params: TestEventPatternRequest): Future[TestEventPatternResponse] =
      service.testEventPattern(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
  }
}

package cloudwatchevents {
  @js.native
  @JSImport("aws-sdk", "CloudWatchEvents")
  class CloudWatchEvents() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteRule(params: DeleteRuleRequest): Request[js.Object]                                           = js.native
    def describeEventBus(params: DescribeEventBusRequest): Request[DescribeEventBusResponse]                = js.native
    def describeRule(params: DescribeRuleRequest): Request[DescribeRuleResponse]                            = js.native
    def disableRule(params: DisableRuleRequest): Request[js.Object]                                         = js.native
    def enableRule(params: EnableRuleRequest): Request[js.Object]                                           = js.native
    def listRuleNamesByTarget(params: ListRuleNamesByTargetRequest): Request[ListRuleNamesByTargetResponse] = js.native
    def listRules(params: ListRulesRequest): Request[ListRulesResponse]                                     = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]       = js.native
    def listTargetsByRule(params: ListTargetsByRuleRequest): Request[ListTargetsByRuleResponse]             = js.native
    def putEvents(params: PutEventsRequest): Request[PutEventsResponse]                                     = js.native
    def putPermission(params: PutPermissionRequest): Request[js.Object]                                     = js.native
    def putRule(params: PutRuleRequest): Request[PutRuleResponse]                                           = js.native
    def putTargets(params: PutTargetsRequest): Request[PutTargetsResponse]                                  = js.native
    def removePermission(params: RemovePermissionRequest): Request[js.Object]                               = js.native
    def removeTargets(params: RemoveTargetsRequest): Request[RemoveTargetsResponse]                         = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                               = js.native
    def testEventPattern(params: TestEventPatternRequest): Request[TestEventPatternResponse]                = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                         = js.native
  }

  object AssignPublicIpEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  /**
    * This structure specifies the VPC subnets and security groups for the task, and whether a public IP address is to be used. This structure is relevant only for ECS tasks that use the <code>awsvpc</code> network mode.
    */
  @js.native
  trait AwsVpcConfiguration extends js.Object {
    var Subnets: StringList
    var AssignPublicIp: js.UndefOr[AssignPublicIp]
    var SecurityGroups: js.UndefOr[StringList]
  }

  object AwsVpcConfiguration {
    def apply(
        Subnets: StringList,
        AssignPublicIp: js.UndefOr[AssignPublicIp] = js.undefined,
        SecurityGroups: js.UndefOr[StringList] = js.undefined
    ): AwsVpcConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "Subnets" -> Subnets.asInstanceOf[js.Any]
      )

      AssignPublicIp.foreach(__v => __obj.update("AssignPublicIp", __v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.update("SecurityGroups", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsVpcConfiguration]
    }
  }

  /**
    * The array properties for the submitted job, such as the size of the array. The array size can be between 2 and 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used only if the target is an AWS Batch job.
    */
  @js.native
  trait BatchArrayProperties extends js.Object {
    var Size: js.UndefOr[Int]
  }

  object BatchArrayProperties {
    def apply(
        Size: js.UndefOr[Int] = js.undefined
    ): BatchArrayProperties = {
      val __obj = js.Dictionary.empty[js.Any]
      Size.foreach(__v => __obj.update("Size", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchArrayProperties]
    }
  }

  /**
    * The custom parameters to be used when the target is an AWS Batch job.
    */
  @js.native
  trait BatchParameters extends js.Object {
    var JobDefinition: String
    var JobName: String
    var ArrayProperties: js.UndefOr[BatchArrayProperties]
    var RetryStrategy: js.UndefOr[BatchRetryStrategy]
  }

  object BatchParameters {
    def apply(
        JobDefinition: String,
        JobName: String,
        ArrayProperties: js.UndefOr[BatchArrayProperties] = js.undefined,
        RetryStrategy: js.UndefOr[BatchRetryStrategy] = js.undefined
    ): BatchParameters = {
      val __obj = js.Dictionary[js.Any](
        "JobDefinition" -> JobDefinition.asInstanceOf[js.Any],
        "JobName"       -> JobName.asInstanceOf[js.Any]
      )

      ArrayProperties.foreach(__v => __obj.update("ArrayProperties", __v.asInstanceOf[js.Any]))
      RetryStrategy.foreach(__v => __obj.update("RetryStrategy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchParameters]
    }
  }

  /**
    * The retry strategy to use for failed jobs, if the target is an AWS Batch job. If you specify a retry strategy here, it overrides the retry strategy defined in the job definition.
    */
  @js.native
  trait BatchRetryStrategy extends js.Object {
    var Attempts: js.UndefOr[Int]
  }

  object BatchRetryStrategy {
    def apply(
        Attempts: js.UndefOr[Int] = js.undefined
    ): BatchRetryStrategy = {
      val __obj = js.Dictionary.empty[js.Any]
      Attempts.foreach(__v => __obj.update("Attempts", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchRetryStrategy]
    }
  }

  /**
    * A JSON string which you can use to limit the event bus permissions you are granting to only accounts that fulfill the condition. Currently, the only supported condition is membership in a certain AWS organization. The string must contain <code>Type</code>, <code>Key</code>, and <code>Value</code> fields. The <code>Value</code> field specifies the ID of the AWS organization. Following is an example value for <code>Condition</code>:
    *  <code>'{"Type" : "StringEquals", "Key": "aws:PrincipalOrgID", "Value": "o-1234567890"}'</code>
    */
  @js.native
  trait Condition extends js.Object {
    var Key: String
    var Type: String
    var Value: String
  }

  object Condition {
    def apply(
        Key: String,
        Type: String,
        Value: String
    ): Condition = {
      val __obj = js.Dictionary[js.Any](
        "Key"   -> Key.asInstanceOf[js.Any],
        "Type"  -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Condition]
    }
  }

  @js.native
  trait DeleteRuleRequest extends js.Object {
    var Name: RuleName
    var Force: js.UndefOr[Boolean]
  }

  object DeleteRuleRequest {
    def apply(
        Name: RuleName,
        Force: js.UndefOr[Boolean] = js.undefined
    ): DeleteRuleRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Force.foreach(__v => __obj.update("Force", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRuleRequest]
    }
  }

  @js.native
  trait DescribeEventBusRequest extends js.Object {}

  object DescribeEventBusRequest {
    def apply(
        ): DescribeEventBusRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DescribeEventBusRequest]
    }
  }

  @js.native
  trait DescribeEventBusResponse extends js.Object {
    var Arn: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Policy: js.UndefOr[String]
  }

  object DescribeEventBusResponse {
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Policy: js.UndefOr[String] = js.undefined
    ): DescribeEventBusResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.update("Policy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventBusResponse]
    }
  }

  @js.native
  trait DescribeRuleRequest extends js.Object {
    var Name: RuleName
  }

  object DescribeRuleRequest {
    def apply(
        Name: RuleName
    ): DescribeRuleRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeRuleRequest]
    }
  }

  @js.native
  trait DescribeRuleResponse extends js.Object {
    var Arn: js.UndefOr[RuleArn]
    var Description: js.UndefOr[RuleDescription]
    var EventPattern: js.UndefOr[EventPattern]
    var ManagedBy: js.UndefOr[ManagedBy]
    var Name: js.UndefOr[RuleName]
    var RoleArn: js.UndefOr[RoleArn]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var State: js.UndefOr[RuleState]
  }

  object DescribeRuleResponse {
    def apply(
        Arn: js.UndefOr[RuleArn] = js.undefined,
        Description: js.UndefOr[RuleDescription] = js.undefined,
        EventPattern: js.UndefOr[EventPattern] = js.undefined,
        ManagedBy: js.UndefOr[ManagedBy] = js.undefined,
        Name: js.UndefOr[RuleName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
        State: js.UndefOr[RuleState] = js.undefined
    ): DescribeRuleResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      EventPattern.foreach(__v => __obj.update("EventPattern", __v.asInstanceOf[js.Any]))
      ManagedBy.foreach(__v => __obj.update("ManagedBy", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.update("RoleArn", __v.asInstanceOf[js.Any]))
      ScheduleExpression.foreach(__v => __obj.update("ScheduleExpression", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRuleResponse]
    }
  }

  @js.native
  trait DisableRuleRequest extends js.Object {
    var Name: RuleName
  }

  object DisableRuleRequest {
    def apply(
        Name: RuleName
    ): DisableRuleRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisableRuleRequest]
    }
  }

  /**
    * The custom parameters to be used when the target is an Amazon ECS task.
    */
  @js.native
  trait EcsParameters extends js.Object {
    var TaskDefinitionArn: Arn
    var Group: js.UndefOr[String]
    var LaunchType: js.UndefOr[LaunchType]
    var NetworkConfiguration: js.UndefOr[NetworkConfiguration]
    var PlatformVersion: js.UndefOr[String]
    var TaskCount: js.UndefOr[LimitMin1]
  }

  object EcsParameters {
    def apply(
        TaskDefinitionArn: Arn,
        Group: js.UndefOr[String] = js.undefined,
        LaunchType: js.UndefOr[LaunchType] = js.undefined,
        NetworkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
        PlatformVersion: js.UndefOr[String] = js.undefined,
        TaskCount: js.UndefOr[LimitMin1] = js.undefined
    ): EcsParameters = {
      val __obj = js.Dictionary[js.Any](
        "TaskDefinitionArn" -> TaskDefinitionArn.asInstanceOf[js.Any]
      )

      Group.foreach(__v => __obj.update("Group", __v.asInstanceOf[js.Any]))
      LaunchType.foreach(__v => __obj.update("LaunchType", __v.asInstanceOf[js.Any]))
      NetworkConfiguration.foreach(__v => __obj.update("NetworkConfiguration", __v.asInstanceOf[js.Any]))
      PlatformVersion.foreach(__v => __obj.update("PlatformVersion", __v.asInstanceOf[js.Any]))
      TaskCount.foreach(__v => __obj.update("TaskCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EcsParameters]
    }
  }

  @js.native
  trait EnableRuleRequest extends js.Object {
    var Name: RuleName
  }

  object EnableRuleRequest {
    def apply(
        Name: RuleName
    ): EnableRuleRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EnableRuleRequest]
    }
  }

  /**
    * Contains the parameters needed for you to provide custom input to a target based on one or more pieces of data extracted from the event.
    */
  @js.native
  trait InputTransformer extends js.Object {
    var InputTemplate: TransformerInput
    var InputPathsMap: js.UndefOr[TransformerPaths]
  }

  object InputTransformer {
    def apply(
        InputTemplate: TransformerInput,
        InputPathsMap: js.UndefOr[TransformerPaths] = js.undefined
    ): InputTransformer = {
      val __obj = js.Dictionary[js.Any](
        "InputTemplate" -> InputTemplate.asInstanceOf[js.Any]
      )

      InputPathsMap.foreach(__v => __obj.update("InputPathsMap", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputTransformer]
    }
  }

  /**
    * This object enables you to specify a JSON path to extract from the event and use as the partition key for the Amazon Kinesis data stream, so that you can control the shard to which the event goes. If you do not include this parameter, the default is to use the <code>eventId</code> as the partition key.
    */
  @js.native
  trait KinesisParameters extends js.Object {
    var PartitionKeyPath: TargetPartitionKeyPath
  }

  object KinesisParameters {
    def apply(
        PartitionKeyPath: TargetPartitionKeyPath
    ): KinesisParameters = {
      val __obj = js.Dictionary[js.Any](
        "PartitionKeyPath" -> PartitionKeyPath.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[KinesisParameters]
    }
  }

  object LaunchTypeEnum {
    val EC2     = "EC2"
    val FARGATE = "FARGATE"

    val values = IndexedSeq(EC2, FARGATE)
  }

  @js.native
  trait ListRuleNamesByTargetRequest extends js.Object {
    var TargetArn: TargetArn
    var Limit: js.UndefOr[LimitMax100]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRuleNamesByTargetRequest {
    def apply(
        TargetArn: TargetArn,
        Limit: js.UndefOr[LimitMax100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRuleNamesByTargetRequest = {
      val __obj = js.Dictionary[js.Any](
        "TargetArn" -> TargetArn.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRuleNamesByTargetRequest]
    }
  }

  @js.native
  trait ListRuleNamesByTargetResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RuleNames: js.UndefOr[RuleNameList]
  }

  object ListRuleNamesByTargetResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RuleNames: js.UndefOr[RuleNameList] = js.undefined
    ): ListRuleNamesByTargetResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      RuleNames.foreach(__v => __obj.update("RuleNames", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRuleNamesByTargetResponse]
    }
  }

  @js.native
  trait ListRulesRequest extends js.Object {
    var Limit: js.UndefOr[LimitMax100]
    var NamePrefix: js.UndefOr[RuleName]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRulesRequest {
    def apply(
        Limit: js.UndefOr[LimitMax100] = js.undefined,
        NamePrefix: js.UndefOr[RuleName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRulesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NamePrefix.foreach(__v => __obj.update("NamePrefix", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRulesRequest]
    }
  }

  @js.native
  trait ListRulesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Rules: js.UndefOr[RuleResponseList]
  }

  object ListRulesResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Rules: js.UndefOr[RuleResponseList] = js.undefined
    ): ListRulesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.update("Rules", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRulesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: Arn
  }

  object ListTagsForResourceRequest {
    def apply(
        ResourceARN: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListTargetsByRuleRequest extends js.Object {
    var Rule: RuleName
    var Limit: js.UndefOr[LimitMax100]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTargetsByRuleRequest {
    def apply(
        Rule: RuleName,
        Limit: js.UndefOr[LimitMax100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTargetsByRuleRequest = {
      val __obj = js.Dictionary[js.Any](
        "Rule" -> Rule.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTargetsByRuleRequest]
    }
  }

  @js.native
  trait ListTargetsByRuleResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Targets: js.UndefOr[TargetList]
  }

  object ListTargetsByRuleResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Targets: js.UndefOr[TargetList] = js.undefined
    ): ListTargetsByRuleResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTargetsByRuleResponse]
    }
  }

  /**
    * This structure specifies the network configuration for an ECS task.
    */
  @js.native
  trait NetworkConfiguration extends js.Object {
    var awsvpcConfiguration: js.UndefOr[AwsVpcConfiguration]
  }

  object NetworkConfiguration {
    def apply(
        awsvpcConfiguration: js.UndefOr[AwsVpcConfiguration] = js.undefined
    ): NetworkConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      awsvpcConfiguration.foreach(__v => __obj.update("awsvpcConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkConfiguration]
    }
  }

  @js.native
  trait PutEventsRequest extends js.Object {
    var Entries: PutEventsRequestEntryList
  }

  object PutEventsRequest {
    def apply(
        Entries: PutEventsRequestEntryList
    ): PutEventsRequest = {
      val __obj = js.Dictionary[js.Any](
        "Entries" -> Entries.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutEventsRequest]
    }
  }

  /**
    * Represents an event to be submitted.
    */
  @js.native
  trait PutEventsRequestEntry extends js.Object {
    var Detail: js.UndefOr[String]
    var DetailType: js.UndefOr[String]
    var Resources: js.UndefOr[EventResourceList]
    var Source: js.UndefOr[String]
    var Time: js.UndefOr[EventTime]
  }

  object PutEventsRequestEntry {
    def apply(
        Detail: js.UndefOr[String] = js.undefined,
        DetailType: js.UndefOr[String] = js.undefined,
        Resources: js.UndefOr[EventResourceList] = js.undefined,
        Source: js.UndefOr[String] = js.undefined,
        Time: js.UndefOr[EventTime] = js.undefined
    ): PutEventsRequestEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      Detail.foreach(__v => __obj.update("Detail", __v.asInstanceOf[js.Any]))
      DetailType.foreach(__v => __obj.update("DetailType", __v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.update("Resources", __v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.update("Source", __v.asInstanceOf[js.Any]))
      Time.foreach(__v => __obj.update("Time", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEventsRequestEntry]
    }
  }

  @js.native
  trait PutEventsResponse extends js.Object {
    var Entries: js.UndefOr[PutEventsResultEntryList]
    var FailedEntryCount: js.UndefOr[Int]
  }

  object PutEventsResponse {
    def apply(
        Entries: js.UndefOr[PutEventsResultEntryList] = js.undefined,
        FailedEntryCount: js.UndefOr[Int] = js.undefined
    ): PutEventsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Entries.foreach(__v => __obj.update("Entries", __v.asInstanceOf[js.Any]))
      FailedEntryCount.foreach(__v => __obj.update("FailedEntryCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEventsResponse]
    }
  }

  /**
    * Represents an event that failed to be submitted.
    */
  @js.native
  trait PutEventsResultEntry extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var EventId: js.UndefOr[EventId]
  }

  object PutEventsResultEntry {
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        EventId: js.UndefOr[EventId] = js.undefined
    ): PutEventsResultEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorCode.foreach(__v => __obj.update("ErrorCode", __v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.update("ErrorMessage", __v.asInstanceOf[js.Any]))
      EventId.foreach(__v => __obj.update("EventId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEventsResultEntry]
    }
  }

  @js.native
  trait PutPermissionRequest extends js.Object {
    var Action: Action
    var Principal: Principal
    var StatementId: StatementId
    var Condition: js.UndefOr[Condition]
  }

  object PutPermissionRequest {
    def apply(
        Action: Action,
        Principal: Principal,
        StatementId: StatementId,
        Condition: js.UndefOr[Condition] = js.undefined
    ): PutPermissionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Action"      -> Action.asInstanceOf[js.Any],
        "Principal"   -> Principal.asInstanceOf[js.Any],
        "StatementId" -> StatementId.asInstanceOf[js.Any]
      )

      Condition.foreach(__v => __obj.update("Condition", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutPermissionRequest]
    }
  }

  @js.native
  trait PutRuleRequest extends js.Object {
    var Name: RuleName
    var Description: js.UndefOr[RuleDescription]
    var EventPattern: js.UndefOr[EventPattern]
    var RoleArn: js.UndefOr[RoleArn]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var State: js.UndefOr[RuleState]
    var Tags: js.UndefOr[TagList]
  }

  object PutRuleRequest {
    def apply(
        Name: RuleName,
        Description: js.UndefOr[RuleDescription] = js.undefined,
        EventPattern: js.UndefOr[EventPattern] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
        State: js.UndefOr[RuleState] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): PutRuleRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      EventPattern.foreach(__v => __obj.update("EventPattern", __v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.update("RoleArn", __v.asInstanceOf[js.Any]))
      ScheduleExpression.foreach(__v => __obj.update("ScheduleExpression", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRuleRequest]
    }
  }

  @js.native
  trait PutRuleResponse extends js.Object {
    var RuleArn: js.UndefOr[RuleArn]
  }

  object PutRuleResponse {
    def apply(
        RuleArn: js.UndefOr[RuleArn] = js.undefined
    ): PutRuleResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      RuleArn.foreach(__v => __obj.update("RuleArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRuleResponse]
    }
  }

  @js.native
  trait PutTargetsRequest extends js.Object {
    var Rule: RuleName
    var Targets: TargetList
  }

  object PutTargetsRequest {
    def apply(
        Rule: RuleName,
        Targets: TargetList
    ): PutTargetsRequest = {
      val __obj = js.Dictionary[js.Any](
        "Rule"    -> Rule.asInstanceOf[js.Any],
        "Targets" -> Targets.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutTargetsRequest]
    }
  }

  @js.native
  trait PutTargetsResponse extends js.Object {
    var FailedEntries: js.UndefOr[PutTargetsResultEntryList]
    var FailedEntryCount: js.UndefOr[Int]
  }

  object PutTargetsResponse {
    def apply(
        FailedEntries: js.UndefOr[PutTargetsResultEntryList] = js.undefined,
        FailedEntryCount: js.UndefOr[Int] = js.undefined
    ): PutTargetsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      FailedEntries.foreach(__v => __obj.update("FailedEntries", __v.asInstanceOf[js.Any]))
      FailedEntryCount.foreach(__v => __obj.update("FailedEntryCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutTargetsResponse]
    }
  }

  /**
    * Represents a target that failed to be added to a rule.
    */
  @js.native
  trait PutTargetsResultEntry extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var TargetId: js.UndefOr[TargetId]
  }

  object PutTargetsResultEntry {
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        TargetId: js.UndefOr[TargetId] = js.undefined
    ): PutTargetsResultEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorCode.foreach(__v => __obj.update("ErrorCode", __v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.update("ErrorMessage", __v.asInstanceOf[js.Any]))
      TargetId.foreach(__v => __obj.update("TargetId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutTargetsResultEntry]
    }
  }

  @js.native
  trait RemovePermissionRequest extends js.Object {
    var StatementId: StatementId
  }

  object RemovePermissionRequest {
    def apply(
        StatementId: StatementId
    ): RemovePermissionRequest = {
      val __obj = js.Dictionary[js.Any](
        "StatementId" -> StatementId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemovePermissionRequest]
    }
  }

  @js.native
  trait RemoveTargetsRequest extends js.Object {
    var Ids: TargetIdList
    var Rule: RuleName
    var Force: js.UndefOr[Boolean]
  }

  object RemoveTargetsRequest {
    def apply(
        Ids: TargetIdList,
        Rule: RuleName,
        Force: js.UndefOr[Boolean] = js.undefined
    ): RemoveTargetsRequest = {
      val __obj = js.Dictionary[js.Any](
        "Ids"  -> Ids.asInstanceOf[js.Any],
        "Rule" -> Rule.asInstanceOf[js.Any]
      )

      Force.foreach(__v => __obj.update("Force", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveTargetsRequest]
    }
  }

  @js.native
  trait RemoveTargetsResponse extends js.Object {
    var FailedEntries: js.UndefOr[RemoveTargetsResultEntryList]
    var FailedEntryCount: js.UndefOr[Int]
  }

  object RemoveTargetsResponse {
    def apply(
        FailedEntries: js.UndefOr[RemoveTargetsResultEntryList] = js.undefined,
        FailedEntryCount: js.UndefOr[Int] = js.undefined
    ): RemoveTargetsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      FailedEntries.foreach(__v => __obj.update("FailedEntries", __v.asInstanceOf[js.Any]))
      FailedEntryCount.foreach(__v => __obj.update("FailedEntryCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveTargetsResponse]
    }
  }

  /**
    * Represents a target that failed to be removed from a rule.
    */
  @js.native
  trait RemoveTargetsResultEntry extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var TargetId: js.UndefOr[TargetId]
  }

  object RemoveTargetsResultEntry {
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        TargetId: js.UndefOr[TargetId] = js.undefined
    ): RemoveTargetsResultEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorCode.foreach(__v => __obj.update("ErrorCode", __v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.update("ErrorMessage", __v.asInstanceOf[js.Any]))
      TargetId.foreach(__v => __obj.update("TargetId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveTargetsResultEntry]
    }
  }

  /**
    * Contains information about a rule in Amazon CloudWatch Events.
    */
  @js.native
  trait Rule extends js.Object {
    var Arn: js.UndefOr[RuleArn]
    var Description: js.UndefOr[RuleDescription]
    var EventPattern: js.UndefOr[EventPattern]
    var ManagedBy: js.UndefOr[ManagedBy]
    var Name: js.UndefOr[RuleName]
    var RoleArn: js.UndefOr[RoleArn]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var State: js.UndefOr[RuleState]
  }

  object Rule {
    def apply(
        Arn: js.UndefOr[RuleArn] = js.undefined,
        Description: js.UndefOr[RuleDescription] = js.undefined,
        EventPattern: js.UndefOr[EventPattern] = js.undefined,
        ManagedBy: js.UndefOr[ManagedBy] = js.undefined,
        Name: js.UndefOr[RuleName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
        State: js.UndefOr[RuleState] = js.undefined
    ): Rule = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      EventPattern.foreach(__v => __obj.update("EventPattern", __v.asInstanceOf[js.Any]))
      ManagedBy.foreach(__v => __obj.update("ManagedBy", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.update("RoleArn", __v.asInstanceOf[js.Any]))
      ScheduleExpression.foreach(__v => __obj.update("ScheduleExpression", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Rule]
    }
  }

  object RuleStateEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  /**
    * This parameter contains the criteria (either InstanceIds or a tag) used to specify which EC2 instances are to be sent the command.
    */
  @js.native
  trait RunCommandParameters extends js.Object {
    var RunCommandTargets: RunCommandTargets
  }

  object RunCommandParameters {
    def apply(
        RunCommandTargets: RunCommandTargets
    ): RunCommandParameters = {
      val __obj = js.Dictionary[js.Any](
        "RunCommandTargets" -> RunCommandTargets.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RunCommandParameters]
    }
  }

  /**
    * Information about the EC2 instances that are to be sent the command, specified as key-value pairs. Each <code>RunCommandTarget</code> block can include only one key, but this key may specify multiple values.
    */
  @js.native
  trait RunCommandTarget extends js.Object {
    var Key: RunCommandTargetKey
    var Values: RunCommandTargetValues
  }

  object RunCommandTarget {
    def apply(
        Key: RunCommandTargetKey,
        Values: RunCommandTargetValues
    ): RunCommandTarget = {
      val __obj = js.Dictionary[js.Any](
        "Key"    -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RunCommandTarget]
    }
  }

  /**
    * This structure includes the custom parameter to be used when the target is an SQS FIFO queue.
    */
  @js.native
  trait SqsParameters extends js.Object {
    var MessageGroupId: js.UndefOr[MessageGroupId]
  }

  object SqsParameters {
    def apply(
        MessageGroupId: js.UndefOr[MessageGroupId] = js.undefined
    ): SqsParameters = {
      val __obj = js.Dictionary.empty[js.Any]
      MessageGroupId.foreach(__v => __obj.update("MessageGroupId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SqsParameters]
    }
  }

  /**
    * A key-value pair associated with an AWS resource. In CloudWatch Events, rules support tagging.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dictionary[js.Any](
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceARN: Arn
    var Tags: TagList
  }

  object TagResourceRequest {
    def apply(
        ResourceARN: Arn,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /**
    * Targets are the resources to be invoked when a rule is triggered. For a complete list of services and resources that can be set as a target, see <a>PutTargets</a>.
    *  If you are setting the event bus of another account as the target, and that account granted permission to your account through an organization instead of directly by the account ID, then you must specify a <code>RoleArn</code> with proper permissions in the <code>Target</code> structure. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/CloudWatchEvents-CrossAccountEventDelivery.html|Sending and Receiving Events Between AWS Accounts]] in the <i>Amazon CloudWatch Events User Guide</i>.
    */
  @js.native
  trait Target extends js.Object {
    var Arn: TargetArn
    var Id: TargetId
    var BatchParameters: js.UndefOr[BatchParameters]
    var EcsParameters: js.UndefOr[EcsParameters]
    var Input: js.UndefOr[TargetInput]
    var InputPath: js.UndefOr[TargetInputPath]
    var InputTransformer: js.UndefOr[InputTransformer]
    var KinesisParameters: js.UndefOr[KinesisParameters]
    var RoleArn: js.UndefOr[RoleArn]
    var RunCommandParameters: js.UndefOr[RunCommandParameters]
    var SqsParameters: js.UndefOr[SqsParameters]
  }

  object Target {
    def apply(
        Arn: TargetArn,
        Id: TargetId,
        BatchParameters: js.UndefOr[BatchParameters] = js.undefined,
        EcsParameters: js.UndefOr[EcsParameters] = js.undefined,
        Input: js.UndefOr[TargetInput] = js.undefined,
        InputPath: js.UndefOr[TargetInputPath] = js.undefined,
        InputTransformer: js.UndefOr[InputTransformer] = js.undefined,
        KinesisParameters: js.UndefOr[KinesisParameters] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        RunCommandParameters: js.UndefOr[RunCommandParameters] = js.undefined,
        SqsParameters: js.UndefOr[SqsParameters] = js.undefined
    ): Target = {
      val __obj = js.Dictionary[js.Any](
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Id"  -> Id.asInstanceOf[js.Any]
      )

      BatchParameters.foreach(__v => __obj.update("BatchParameters", __v.asInstanceOf[js.Any]))
      EcsParameters.foreach(__v => __obj.update("EcsParameters", __v.asInstanceOf[js.Any]))
      Input.foreach(__v => __obj.update("Input", __v.asInstanceOf[js.Any]))
      InputPath.foreach(__v => __obj.update("InputPath", __v.asInstanceOf[js.Any]))
      InputTransformer.foreach(__v => __obj.update("InputTransformer", __v.asInstanceOf[js.Any]))
      KinesisParameters.foreach(__v => __obj.update("KinesisParameters", __v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.update("RoleArn", __v.asInstanceOf[js.Any]))
      RunCommandParameters.foreach(__v => __obj.update("RunCommandParameters", __v.asInstanceOf[js.Any]))
      SqsParameters.foreach(__v => __obj.update("SqsParameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Target]
    }
  }

  @js.native
  trait TestEventPatternRequest extends js.Object {
    var Event: String
    var EventPattern: EventPattern
  }

  object TestEventPatternRequest {
    def apply(
        Event: String,
        EventPattern: EventPattern
    ): TestEventPatternRequest = {
      val __obj = js.Dictionary[js.Any](
        "Event"        -> Event.asInstanceOf[js.Any],
        "EventPattern" -> EventPattern.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TestEventPatternRequest]
    }
  }

  @js.native
  trait TestEventPatternResponse extends js.Object {
    var Result: js.UndefOr[Boolean]
  }

  object TestEventPatternResponse {
    def apply(
        Result: js.UndefOr[Boolean] = js.undefined
    ): TestEventPatternResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Result.foreach(__v => __obj.update("Result", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestEventPatternResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: Arn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    def apply(
        ResourceARN: Arn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }
}
