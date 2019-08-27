package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object cloudwatchevents {
  type AccountId                        = String
  type Action                           = String
  type Arn                              = String
  type AssignPublicIp                   = String
  type ErrorCode                        = String
  type ErrorMessage                     = String
  type EventBusList                     = js.Array[EventBus]
  type EventBusName                     = String
  type EventId                          = String
  type EventPattern                     = String
  type EventResource                    = String
  type EventResourceList                = js.Array[EventResource]
  type EventSourceList                  = js.Array[EventSource]
  type EventSourceName                  = String
  type EventSourceNamePrefix            = String
  type EventSourceState                 = String
  type EventTime                        = js.Date
  type InputTransformerPathKey          = String
  type LaunchType                       = String
  type LimitMax100                      = Int
  type LimitMin1                        = Int
  type ManagedBy                        = String
  type MessageGroupId                   = String
  type NextToken                        = String
  type NonPartnerEventBusName           = String
  type PartnerEventSourceAccountList    = js.Array[PartnerEventSourceAccount]
  type PartnerEventSourceList           = js.Array[PartnerEventSource]
  type PartnerEventSourceNamePrefix     = String
  type Principal                        = String
  type PutEventsRequestEntryList        = js.Array[PutEventsRequestEntry]
  type PutEventsResultEntryList         = js.Array[PutEventsResultEntry]
  type PutPartnerEventsRequestEntryList = js.Array[PutPartnerEventsRequestEntry]
  type PutPartnerEventsResultEntryList  = js.Array[PutPartnerEventsResultEntry]
  type PutTargetsResultEntryList        = js.Array[PutTargetsResultEntry]
  type RemoveTargetsResultEntryList     = js.Array[RemoveTargetsResultEntry]
  type RoleArn                          = String
  type RuleArn                          = String
  type RuleDescription                  = String
  type RuleName                         = String
  type RuleNameList                     = js.Array[RuleName]
  type RuleResponseList                 = js.Array[Rule]
  type RuleState                        = String
  type RunCommandTargetKey              = String
  type RunCommandTargetValue            = String
  type RunCommandTargetValues           = js.Array[RunCommandTargetValue]
  type RunCommandTargets                = js.Array[RunCommandTarget]
  type ScheduleExpression               = String
  type StatementId                      = String
  type StringList                       = js.Array[String]
  type TagKey                           = String
  type TagKeyList                       = js.Array[TagKey]
  type TagList                          = js.Array[Tag]
  type TagValue                         = String
  type TargetArn                        = String
  type TargetId                         = String
  type TargetIdList                     = js.Array[TargetId]
  type TargetInput                      = String
  type TargetInputPath                  = String
  type TargetList                       = js.Array[Target]
  type TargetPartitionKeyPath           = String
  type Timestamp                        = js.Date
  type TransformerInput                 = String
  type TransformerPaths                 = js.Dictionary[TargetInputPath]

  implicit final class CloudWatchEventsOps(val service: CloudWatchEvents) extends AnyVal {

    def activateEventSourceFuture(params: ActivateEventSourceRequest): Future[js.Object] =
      service.activateEventSource(params).promise.toFuture
    def createEventBusFuture(params: CreateEventBusRequest): Future[CreateEventBusResponse] =
      service.createEventBus(params).promise.toFuture
    def createPartnerEventSourceFuture(
        params: CreatePartnerEventSourceRequest
    ): Future[CreatePartnerEventSourceResponse] = service.createPartnerEventSource(params).promise.toFuture
    def deactivateEventSourceFuture(params: DeactivateEventSourceRequest): Future[js.Object] =
      service.deactivateEventSource(params).promise.toFuture
    def deleteEventBusFuture(params: DeleteEventBusRequest): Future[js.Object] =
      service.deleteEventBus(params).promise.toFuture
    def deletePartnerEventSourceFuture(params: DeletePartnerEventSourceRequest): Future[js.Object] =
      service.deletePartnerEventSource(params).promise.toFuture
    def deleteRuleFuture(params: DeleteRuleRequest): Future[js.Object] = service.deleteRule(params).promise.toFuture
    def describeEventBusFuture(params: DescribeEventBusRequest): Future[DescribeEventBusResponse] =
      service.describeEventBus(params).promise.toFuture
    def describeEventSourceFuture(params: DescribeEventSourceRequest): Future[DescribeEventSourceResponse] =
      service.describeEventSource(params).promise.toFuture
    def describePartnerEventSourceFuture(
        params: DescribePartnerEventSourceRequest
    ): Future[DescribePartnerEventSourceResponse] = service.describePartnerEventSource(params).promise.toFuture
    def describeRuleFuture(params: DescribeRuleRequest): Future[DescribeRuleResponse] =
      service.describeRule(params).promise.toFuture
    def disableRuleFuture(params: DisableRuleRequest): Future[js.Object] = service.disableRule(params).promise.toFuture
    def enableRuleFuture(params: EnableRuleRequest): Future[js.Object]   = service.enableRule(params).promise.toFuture
    def listEventBusesFuture(params: ListEventBusesRequest): Future[ListEventBusesResponse] =
      service.listEventBuses(params).promise.toFuture
    def listEventSourcesFuture(params: ListEventSourcesRequest): Future[ListEventSourcesResponse] =
      service.listEventSources(params).promise.toFuture
    def listPartnerEventSourceAccountsFuture(
        params: ListPartnerEventSourceAccountsRequest
    ): Future[ListPartnerEventSourceAccountsResponse] = service.listPartnerEventSourceAccounts(params).promise.toFuture
    def listPartnerEventSourcesFuture(params: ListPartnerEventSourcesRequest): Future[ListPartnerEventSourcesResponse] =
      service.listPartnerEventSources(params).promise.toFuture
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
    def putPartnerEventsFuture(params: PutPartnerEventsRequest): Future[PutPartnerEventsResponse] =
      service.putPartnerEvents(params).promise.toFuture
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

    def activateEventSource(params: ActivateEventSourceRequest): Request[js.Object]    = js.native
    def createEventBus(params: CreateEventBusRequest): Request[CreateEventBusResponse] = js.native
    def createPartnerEventSource(params: CreatePartnerEventSourceRequest): Request[CreatePartnerEventSourceResponse] =
      js.native
    def deactivateEventSource(params: DeactivateEventSourceRequest): Request[js.Object]               = js.native
    def deleteEventBus(params: DeleteEventBusRequest): Request[js.Object]                             = js.native
    def deletePartnerEventSource(params: DeletePartnerEventSourceRequest): Request[js.Object]         = js.native
    def deleteRule(params: DeleteRuleRequest): Request[js.Object]                                     = js.native
    def describeEventBus(params: DescribeEventBusRequest): Request[DescribeEventBusResponse]          = js.native
    def describeEventSource(params: DescribeEventSourceRequest): Request[DescribeEventSourceResponse] = js.native
    def describePartnerEventSource(
        params: DescribePartnerEventSourceRequest
    ): Request[DescribePartnerEventSourceResponse]                                           = js.native
    def describeRule(params: DescribeRuleRequest): Request[DescribeRuleResponse]             = js.native
    def disableRule(params: DisableRuleRequest): Request[js.Object]                          = js.native
    def enableRule(params: EnableRuleRequest): Request[js.Object]                            = js.native
    def listEventBuses(params: ListEventBusesRequest): Request[ListEventBusesResponse]       = js.native
    def listEventSources(params: ListEventSourcesRequest): Request[ListEventSourcesResponse] = js.native
    def listPartnerEventSourceAccounts(
        params: ListPartnerEventSourceAccountsRequest
    ): Request[ListPartnerEventSourceAccountsResponse] = js.native
    def listPartnerEventSources(params: ListPartnerEventSourcesRequest): Request[ListPartnerEventSourcesResponse] =
      js.native
    def listRuleNamesByTarget(params: ListRuleNamesByTargetRequest): Request[ListRuleNamesByTargetResponse] = js.native
    def listRules(params: ListRulesRequest): Request[ListRulesResponse]                                     = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]       = js.native
    def listTargetsByRule(params: ListTargetsByRuleRequest): Request[ListTargetsByRuleResponse]             = js.native
    def putEvents(params: PutEventsRequest): Request[PutEventsResponse]                                     = js.native
    def putPartnerEvents(params: PutPartnerEventsRequest): Request[PutPartnerEventsResponse]                = js.native
    def putPermission(params: PutPermissionRequest): Request[js.Object]                                     = js.native
    def putRule(params: PutRuleRequest): Request[PutRuleResponse]                                           = js.native
    def putTargets(params: PutTargetsRequest): Request[PutTargetsResponse]                                  = js.native
    def removePermission(params: RemovePermissionRequest): Request[js.Object]                               = js.native
    def removeTargets(params: RemoveTargetsRequest): Request[RemoveTargetsResponse]                         = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                               = js.native
    def testEventPattern(params: TestEventPatternRequest): Request[TestEventPatternResponse]                = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                         = js.native
  }

  @js.native
  trait ActivateEventSourceRequest extends js.Object {
    var Name: EventSourceName
  }

  object ActivateEventSourceRequest {
    def apply(
        Name: EventSourceName
    ): ActivateEventSourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ActivateEventSourceRequest]
    }
  }

  object AssignPublicIpEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  /**
    * This structure specifies the VPC subnets and security groups for the task and whether a public IP address is to be used. This structure is relevant only for ECS tasks that use the <code>awsvpc</code> network mode.
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
    * The retry strategy to use for failed jobs if the target is an AWS Batch job. If you specify a retry strategy here, it overrides the retry strategy defined in the job definition.
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
    * A JSON string that you can use to limit the event bus permissions that you're granting to only accounts that fulfill the condition. Currently, the only supported condition is membership in a certain AWS organization. The string must contain <code>Type</code>, <code>Key</code>, and <code>Value</code> fields. The <code>Value</code> field specifies the ID of the AWS organization. The following is an example value for <code>Condition</code>:
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
  trait CreateEventBusRequest extends js.Object {
    var Name: EventBusName
    var EventSourceName: js.UndefOr[EventSourceName]
  }

  object CreateEventBusRequest {
    def apply(
        Name: EventBusName,
        EventSourceName: js.UndefOr[EventSourceName] = js.undefined
    ): CreateEventBusRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      EventSourceName.foreach(__v => __obj.update("EventSourceName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEventBusRequest]
    }
  }

  @js.native
  trait CreateEventBusResponse extends js.Object {
    var EventBusArn: js.UndefOr[String]
  }

  object CreateEventBusResponse {
    def apply(
        EventBusArn: js.UndefOr[String] = js.undefined
    ): CreateEventBusResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EventBusArn.foreach(__v => __obj.update("EventBusArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEventBusResponse]
    }
  }

  @js.native
  trait CreatePartnerEventSourceRequest extends js.Object {
    var Account: AccountId
    var Name: EventSourceName
  }

  object CreatePartnerEventSourceRequest {
    def apply(
        Account: AccountId,
        Name: EventSourceName
    ): CreatePartnerEventSourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Account" -> Account.asInstanceOf[js.Any],
        "Name"    -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreatePartnerEventSourceRequest]
    }
  }

  @js.native
  trait CreatePartnerEventSourceResponse extends js.Object {
    var EventSourceArn: js.UndefOr[String]
  }

  object CreatePartnerEventSourceResponse {
    def apply(
        EventSourceArn: js.UndefOr[String] = js.undefined
    ): CreatePartnerEventSourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EventSourceArn.foreach(__v => __obj.update("EventSourceArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePartnerEventSourceResponse]
    }
  }

  @js.native
  trait DeactivateEventSourceRequest extends js.Object {
    var Name: EventSourceName
  }

  object DeactivateEventSourceRequest {
    def apply(
        Name: EventSourceName
    ): DeactivateEventSourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeactivateEventSourceRequest]
    }
  }

  @js.native
  trait DeleteEventBusRequest extends js.Object {
    var Name: EventBusName
  }

  object DeleteEventBusRequest {
    def apply(
        Name: EventBusName
    ): DeleteEventBusRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEventBusRequest]
    }
  }

  @js.native
  trait DeletePartnerEventSourceRequest extends js.Object {
    var Account: AccountId
    var Name: EventSourceName
  }

  object DeletePartnerEventSourceRequest {
    def apply(
        Account: AccountId,
        Name: EventSourceName
    ): DeletePartnerEventSourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Account" -> Account.asInstanceOf[js.Any],
        "Name"    -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePartnerEventSourceRequest]
    }
  }

  @js.native
  trait DeleteRuleRequest extends js.Object {
    var Name: RuleName
    var EventBusName: js.UndefOr[EventBusName]
    var Force: js.UndefOr[Boolean]
  }

  object DeleteRuleRequest {
    def apply(
        Name: RuleName,
        EventBusName: js.UndefOr[EventBusName] = js.undefined,
        Force: js.UndefOr[Boolean] = js.undefined
    ): DeleteRuleRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      EventBusName.foreach(__v => __obj.update("EventBusName", __v.asInstanceOf[js.Any]))
      Force.foreach(__v => __obj.update("Force", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRuleRequest]
    }
  }

  @js.native
  trait DescribeEventBusRequest extends js.Object {
    var Name: js.UndefOr[EventBusName]
  }

  object DescribeEventBusRequest {
    def apply(
        Name: js.UndefOr[EventBusName] = js.undefined
    ): DescribeEventBusRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
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
  trait DescribeEventSourceRequest extends js.Object {
    var Name: EventSourceName
  }

  object DescribeEventSourceRequest {
    def apply(
        Name: EventSourceName
    ): DescribeEventSourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeEventSourceRequest]
    }
  }

  @js.native
  trait DescribeEventSourceResponse extends js.Object {
    var Arn: js.UndefOr[String]
    var CreatedBy: js.UndefOr[String]
    var CreationTime: js.UndefOr[Timestamp]
    var ExpirationTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[String]
    var State: js.UndefOr[EventSourceState]
  }

  object DescribeEventSourceResponse {
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        CreatedBy: js.UndefOr[String] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        ExpirationTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        State: js.UndefOr[EventSourceState] = js.undefined
    ): DescribeEventSourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.update("CreatedBy", __v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      ExpirationTime.foreach(__v => __obj.update("ExpirationTime", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventSourceResponse]
    }
  }

  @js.native
  trait DescribePartnerEventSourceRequest extends js.Object {
    var Name: EventSourceName
  }

  object DescribePartnerEventSourceRequest {
    def apply(
        Name: EventSourceName
    ): DescribePartnerEventSourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribePartnerEventSourceRequest]
    }
  }

  @js.native
  trait DescribePartnerEventSourceResponse extends js.Object {
    var Arn: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  object DescribePartnerEventSourceResponse {
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined
    ): DescribePartnerEventSourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePartnerEventSourceResponse]
    }
  }

  @js.native
  trait DescribeRuleRequest extends js.Object {
    var Name: RuleName
    var EventBusName: js.UndefOr[EventBusName]
  }

  object DescribeRuleRequest {
    def apply(
        Name: RuleName,
        EventBusName: js.UndefOr[EventBusName] = js.undefined
    ): DescribeRuleRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      EventBusName.foreach(__v => __obj.update("EventBusName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRuleRequest]
    }
  }

  @js.native
  trait DescribeRuleResponse extends js.Object {
    var Arn: js.UndefOr[RuleArn]
    var Description: js.UndefOr[RuleDescription]
    var EventBusName: js.UndefOr[EventBusName]
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
        EventBusName: js.UndefOr[EventBusName] = js.undefined,
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
      EventBusName.foreach(__v => __obj.update("EventBusName", __v.asInstanceOf[js.Any]))
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
    var EventBusName: js.UndefOr[EventBusName]
  }

  object DisableRuleRequest {
    def apply(
        Name: RuleName,
        EventBusName: js.UndefOr[EventBusName] = js.undefined
    ): DisableRuleRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      EventBusName.foreach(__v => __obj.update("EventBusName", __v.asInstanceOf[js.Any]))
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
    var EventBusName: js.UndefOr[EventBusName]
  }

  object EnableRuleRequest {
    def apply(
        Name: RuleName,
        EventBusName: js.UndefOr[EventBusName] = js.undefined
    ): EnableRuleRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      EventBusName.foreach(__v => __obj.update("EventBusName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableRuleRequest]
    }
  }

  /**
    * An event bus receives events from a source and routes them to rules associated with that event bus. Your account's default event bus receives rules from AWS services. A custom event bus can receive rules from AWS services as well as your custom applications and services. A partner event bus receives events from an event source created by an SaaS partner. These events come from the partners services or applications.
    */
  @js.native
  trait EventBus extends js.Object {
    var Arn: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Policy: js.UndefOr[String]
  }

  object EventBus {
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Policy: js.UndefOr[String] = js.undefined
    ): EventBus = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.update("Policy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventBus]
    }
  }

  /**
    * A partner event source is created by an SaaS partner. If a customer creates a partner event bus that matches this event source, that AWS account can receive events from the partner's applications or services.
    */
  @js.native
  trait EventSource extends js.Object {
    var Arn: js.UndefOr[String]
    var CreatedBy: js.UndefOr[String]
    var CreationTime: js.UndefOr[Timestamp]
    var ExpirationTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[String]
    var State: js.UndefOr[EventSourceState]
  }

  object EventSource {
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        CreatedBy: js.UndefOr[String] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        ExpirationTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        State: js.UndefOr[EventSourceState] = js.undefined
    ): EventSource = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.update("CreatedBy", __v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      ExpirationTime.foreach(__v => __obj.update("ExpirationTime", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventSource]
    }
  }

  object EventSourceStateEnum {
    val PENDING = "PENDING"
    val ACTIVE  = "ACTIVE"
    val DELETED = "DELETED"

    val values = IndexedSeq(PENDING, ACTIVE, DELETED)
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
    * This object enables you to specify a JSON path to extract from the event and use as the partition key for the Amazon Kinesis data stream so that you can control the shard that the event goes to. If you don't include this parameter, the default is to use the <code>eventId</code> as the partition key.
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
  trait ListEventBusesRequest extends js.Object {
    var Limit: js.UndefOr[LimitMax100]
    var NamePrefix: js.UndefOr[EventBusName]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEventBusesRequest {
    def apply(
        Limit: js.UndefOr[LimitMax100] = js.undefined,
        NamePrefix: js.UndefOr[EventBusName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEventBusesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NamePrefix.foreach(__v => __obj.update("NamePrefix", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventBusesRequest]
    }
  }

  @js.native
  trait ListEventBusesResponse extends js.Object {
    var EventBuses: js.UndefOr[EventBusList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEventBusesResponse {
    def apply(
        EventBuses: js.UndefOr[EventBusList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEventBusesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EventBuses.foreach(__v => __obj.update("EventBuses", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventBusesResponse]
    }
  }

  @js.native
  trait ListEventSourcesRequest extends js.Object {
    var Limit: js.UndefOr[LimitMax100]
    var NamePrefix: js.UndefOr[EventSourceNamePrefix]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEventSourcesRequest {
    def apply(
        Limit: js.UndefOr[LimitMax100] = js.undefined,
        NamePrefix: js.UndefOr[EventSourceNamePrefix] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEventSourcesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NamePrefix.foreach(__v => __obj.update("NamePrefix", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventSourcesRequest]
    }
  }

  @js.native
  trait ListEventSourcesResponse extends js.Object {
    var EventSources: js.UndefOr[EventSourceList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEventSourcesResponse {
    def apply(
        EventSources: js.UndefOr[EventSourceList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEventSourcesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EventSources.foreach(__v => __obj.update("EventSources", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventSourcesResponse]
    }
  }

  @js.native
  trait ListPartnerEventSourceAccountsRequest extends js.Object {
    var EventSourceName: EventSourceName
    var Limit: js.UndefOr[LimitMax100]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPartnerEventSourceAccountsRequest {
    def apply(
        EventSourceName: EventSourceName,
        Limit: js.UndefOr[LimitMax100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPartnerEventSourceAccountsRequest = {
      val __obj = js.Dictionary[js.Any](
        "EventSourceName" -> EventSourceName.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPartnerEventSourceAccountsRequest]
    }
  }

  @js.native
  trait ListPartnerEventSourceAccountsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PartnerEventSourceAccounts: js.UndefOr[PartnerEventSourceAccountList]
  }

  object ListPartnerEventSourceAccountsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PartnerEventSourceAccounts: js.UndefOr[PartnerEventSourceAccountList] = js.undefined
    ): ListPartnerEventSourceAccountsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      PartnerEventSourceAccounts.foreach(__v => __obj.update("PartnerEventSourceAccounts", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPartnerEventSourceAccountsResponse]
    }
  }

  @js.native
  trait ListPartnerEventSourcesRequest extends js.Object {
    var NamePrefix: PartnerEventSourceNamePrefix
    var Limit: js.UndefOr[LimitMax100]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPartnerEventSourcesRequest {
    def apply(
        NamePrefix: PartnerEventSourceNamePrefix,
        Limit: js.UndefOr[LimitMax100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPartnerEventSourcesRequest = {
      val __obj = js.Dictionary[js.Any](
        "NamePrefix" -> NamePrefix.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPartnerEventSourcesRequest]
    }
  }

  @js.native
  trait ListPartnerEventSourcesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PartnerEventSources: js.UndefOr[PartnerEventSourceList]
  }

  object ListPartnerEventSourcesResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PartnerEventSources: js.UndefOr[PartnerEventSourceList] = js.undefined
    ): ListPartnerEventSourcesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      PartnerEventSources.foreach(__v => __obj.update("PartnerEventSources", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPartnerEventSourcesResponse]
    }
  }

  @js.native
  trait ListRuleNamesByTargetRequest extends js.Object {
    var TargetArn: TargetArn
    var EventBusName: js.UndefOr[EventBusName]
    var Limit: js.UndefOr[LimitMax100]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRuleNamesByTargetRequest {
    def apply(
        TargetArn: TargetArn,
        EventBusName: js.UndefOr[EventBusName] = js.undefined,
        Limit: js.UndefOr[LimitMax100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRuleNamesByTargetRequest = {
      val __obj = js.Dictionary[js.Any](
        "TargetArn" -> TargetArn.asInstanceOf[js.Any]
      )

      EventBusName.foreach(__v => __obj.update("EventBusName", __v.asInstanceOf[js.Any]))
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
    var EventBusName: js.UndefOr[EventBusName]
    var Limit: js.UndefOr[LimitMax100]
    var NamePrefix: js.UndefOr[RuleName]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRulesRequest {
    def apply(
        EventBusName: js.UndefOr[EventBusName] = js.undefined,
        Limit: js.UndefOr[LimitMax100] = js.undefined,
        NamePrefix: js.UndefOr[RuleName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRulesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      EventBusName.foreach(__v => __obj.update("EventBusName", __v.asInstanceOf[js.Any]))
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
    var EventBusName: js.UndefOr[EventBusName]
    var Limit: js.UndefOr[LimitMax100]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTargetsByRuleRequest {
    def apply(
        Rule: RuleName,
        EventBusName: js.UndefOr[EventBusName] = js.undefined,
        Limit: js.UndefOr[LimitMax100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTargetsByRuleRequest = {
      val __obj = js.Dictionary[js.Any](
        "Rule" -> Rule.asInstanceOf[js.Any]
      )

      EventBusName.foreach(__v => __obj.update("EventBusName", __v.asInstanceOf[js.Any]))
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

  /**
    * A partner event source is created by an SaaS partner. If a customer creates a partner event bus that matches this event source, that AWS account can receive events from the partner's applications or services.
    */
  @js.native
  trait PartnerEventSource extends js.Object {
    var Arn: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  object PartnerEventSource {
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined
    ): PartnerEventSource = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PartnerEventSource]
    }
  }

  /**
    * The AWS account that a partner event source has been offered to.
    */
  @js.native
  trait PartnerEventSourceAccount extends js.Object {
    var Account: js.UndefOr[AccountId]
    var CreationTime: js.UndefOr[Timestamp]
    var ExpirationTime: js.UndefOr[Timestamp]
    var State: js.UndefOr[EventSourceState]
  }

  object PartnerEventSourceAccount {
    def apply(
        Account: js.UndefOr[AccountId] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        ExpirationTime: js.UndefOr[Timestamp] = js.undefined,
        State: js.UndefOr[EventSourceState] = js.undefined
    ): PartnerEventSourceAccount = {
      val __obj = js.Dictionary.empty[js.Any]
      Account.foreach(__v => __obj.update("Account", __v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      ExpirationTime.foreach(__v => __obj.update("ExpirationTime", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PartnerEventSourceAccount]
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
    var EventBusName: js.UndefOr[NonPartnerEventBusName]
    var Resources: js.UndefOr[EventResourceList]
    var Source: js.UndefOr[String]
    var Time: js.UndefOr[EventTime]
  }

  object PutEventsRequestEntry {
    def apply(
        Detail: js.UndefOr[String] = js.undefined,
        DetailType: js.UndefOr[String] = js.undefined,
        EventBusName: js.UndefOr[NonPartnerEventBusName] = js.undefined,
        Resources: js.UndefOr[EventResourceList] = js.undefined,
        Source: js.UndefOr[String] = js.undefined,
        Time: js.UndefOr[EventTime] = js.undefined
    ): PutEventsRequestEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      Detail.foreach(__v => __obj.update("Detail", __v.asInstanceOf[js.Any]))
      DetailType.foreach(__v => __obj.update("DetailType", __v.asInstanceOf[js.Any]))
      EventBusName.foreach(__v => __obj.update("EventBusName", __v.asInstanceOf[js.Any]))
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
  trait PutPartnerEventsRequest extends js.Object {
    var Entries: PutPartnerEventsRequestEntryList
  }

  object PutPartnerEventsRequest {
    def apply(
        Entries: PutPartnerEventsRequestEntryList
    ): PutPartnerEventsRequest = {
      val __obj = js.Dictionary[js.Any](
        "Entries" -> Entries.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutPartnerEventsRequest]
    }
  }

  /**
    * The details about an event generated by an SaaS partner.
    */
  @js.native
  trait PutPartnerEventsRequestEntry extends js.Object {
    var Detail: js.UndefOr[String]
    var DetailType: js.UndefOr[String]
    var Resources: js.UndefOr[EventResourceList]
    var Source: js.UndefOr[String]
    var Time: js.UndefOr[EventTime]
  }

  object PutPartnerEventsRequestEntry {
    def apply(
        Detail: js.UndefOr[String] = js.undefined,
        DetailType: js.UndefOr[String] = js.undefined,
        Resources: js.UndefOr[EventResourceList] = js.undefined,
        Source: js.UndefOr[String] = js.undefined,
        Time: js.UndefOr[EventTime] = js.undefined
    ): PutPartnerEventsRequestEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      Detail.foreach(__v => __obj.update("Detail", __v.asInstanceOf[js.Any]))
      DetailType.foreach(__v => __obj.update("DetailType", __v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.update("Resources", __v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.update("Source", __v.asInstanceOf[js.Any]))
      Time.foreach(__v => __obj.update("Time", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutPartnerEventsRequestEntry]
    }
  }

  @js.native
  trait PutPartnerEventsResponse extends js.Object {
    var Entries: js.UndefOr[PutPartnerEventsResultEntryList]
    var FailedEntryCount: js.UndefOr[Int]
  }

  object PutPartnerEventsResponse {
    def apply(
        Entries: js.UndefOr[PutPartnerEventsResultEntryList] = js.undefined,
        FailedEntryCount: js.UndefOr[Int] = js.undefined
    ): PutPartnerEventsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Entries.foreach(__v => __obj.update("Entries", __v.asInstanceOf[js.Any]))
      FailedEntryCount.foreach(__v => __obj.update("FailedEntryCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutPartnerEventsResponse]
    }
  }

  /**
    * Represents an event that a partner tried to generate but failed.
    */
  @js.native
  trait PutPartnerEventsResultEntry extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var EventId: js.UndefOr[EventId]
  }

  object PutPartnerEventsResultEntry {
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        EventId: js.UndefOr[EventId] = js.undefined
    ): PutPartnerEventsResultEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorCode.foreach(__v => __obj.update("ErrorCode", __v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.update("ErrorMessage", __v.asInstanceOf[js.Any]))
      EventId.foreach(__v => __obj.update("EventId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutPartnerEventsResultEntry]
    }
  }

  @js.native
  trait PutPermissionRequest extends js.Object {
    var Action: Action
    var Principal: Principal
    var StatementId: StatementId
    var Condition: js.UndefOr[Condition]
    var EventBusName: js.UndefOr[NonPartnerEventBusName]
  }

  object PutPermissionRequest {
    def apply(
        Action: Action,
        Principal: Principal,
        StatementId: StatementId,
        Condition: js.UndefOr[Condition] = js.undefined,
        EventBusName: js.UndefOr[NonPartnerEventBusName] = js.undefined
    ): PutPermissionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Action"      -> Action.asInstanceOf[js.Any],
        "Principal"   -> Principal.asInstanceOf[js.Any],
        "StatementId" -> StatementId.asInstanceOf[js.Any]
      )

      Condition.foreach(__v => __obj.update("Condition", __v.asInstanceOf[js.Any]))
      EventBusName.foreach(__v => __obj.update("EventBusName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutPermissionRequest]
    }
  }

  @js.native
  trait PutRuleRequest extends js.Object {
    var Name: RuleName
    var Description: js.UndefOr[RuleDescription]
    var EventBusName: js.UndefOr[EventBusName]
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
        EventBusName: js.UndefOr[EventBusName] = js.undefined,
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
      EventBusName.foreach(__v => __obj.update("EventBusName", __v.asInstanceOf[js.Any]))
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
    var EventBusName: js.UndefOr[EventBusName]
  }

  object PutTargetsRequest {
    def apply(
        Rule: RuleName,
        Targets: TargetList,
        EventBusName: js.UndefOr[EventBusName] = js.undefined
    ): PutTargetsRequest = {
      val __obj = js.Dictionary[js.Any](
        "Rule"    -> Rule.asInstanceOf[js.Any],
        "Targets" -> Targets.asInstanceOf[js.Any]
      )

      EventBusName.foreach(__v => __obj.update("EventBusName", __v.asInstanceOf[js.Any]))
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
    var EventBusName: js.UndefOr[NonPartnerEventBusName]
  }

  object RemovePermissionRequest {
    def apply(
        StatementId: StatementId,
        EventBusName: js.UndefOr[NonPartnerEventBusName] = js.undefined
    ): RemovePermissionRequest = {
      val __obj = js.Dictionary[js.Any](
        "StatementId" -> StatementId.asInstanceOf[js.Any]
      )

      EventBusName.foreach(__v => __obj.update("EventBusName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemovePermissionRequest]
    }
  }

  @js.native
  trait RemoveTargetsRequest extends js.Object {
    var Ids: TargetIdList
    var Rule: RuleName
    var EventBusName: js.UndefOr[EventBusName]
    var Force: js.UndefOr[Boolean]
  }

  object RemoveTargetsRequest {
    def apply(
        Ids: TargetIdList,
        Rule: RuleName,
        EventBusName: js.UndefOr[EventBusName] = js.undefined,
        Force: js.UndefOr[Boolean] = js.undefined
    ): RemoveTargetsRequest = {
      val __obj = js.Dictionary[js.Any](
        "Ids"  -> Ids.asInstanceOf[js.Any],
        "Rule" -> Rule.asInstanceOf[js.Any]
      )

      EventBusName.foreach(__v => __obj.update("EventBusName", __v.asInstanceOf[js.Any]))
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
    * Contains information about a rule in Amazon EventBridge.
    */
  @js.native
  trait Rule extends js.Object {
    var Arn: js.UndefOr[RuleArn]
    var Description: js.UndefOr[RuleDescription]
    var EventBusName: js.UndefOr[EventBusName]
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
        EventBusName: js.UndefOr[EventBusName] = js.undefined,
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
      EventBusName.foreach(__v => __obj.update("EventBusName", __v.asInstanceOf[js.Any]))
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
    * This parameter contains the criteria (either <code>InstanceIds</code> or a tag) used to specify which EC2 instances are to be sent the command.
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
    * Information about the EC2 instances that are to be sent the command, specified as key-value pairs. Each <code>RunCommandTarget</code> block can include only one key, but this key can specify multiple values.
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
    * A key-value pair associated with an AWS resource. In EventBridge, rules support tagging.
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
    *  If you're setting the event bus of another account as the target and that account granted permission to your account through an organization instead of directly by the account ID, you must specify a <code>RoleArn</code> with proper permissions in the <code>Target</code> structure. For more information, see [[https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html|Sending and Receiving Events Between AWS Accounts]] in the <i>Amazon EventBridge User Guide</i>.
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
