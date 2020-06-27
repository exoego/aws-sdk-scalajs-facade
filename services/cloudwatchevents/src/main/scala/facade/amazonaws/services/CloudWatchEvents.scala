package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object cloudwatchevents {
  type AccountId                        = String
  type Action                           = String
  type Arn                              = String
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
  type EventTime                        = js.Date
  type InputTransformerPathKey          = String
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

  implicit final class CloudWatchEventsOps(private val service: CloudWatchEvents) extends AnyVal {

    @inline def activateEventSourceFuture(params: ActivateEventSourceRequest): Future[js.Object] =
      service.activateEventSource(params).promise().toFuture
    @inline def createEventBusFuture(params: CreateEventBusRequest): Future[CreateEventBusResponse] =
      service.createEventBus(params).promise().toFuture
    @inline def createPartnerEventSourceFuture(
        params: CreatePartnerEventSourceRequest
    ): Future[CreatePartnerEventSourceResponse] = service.createPartnerEventSource(params).promise().toFuture
    @inline def deactivateEventSourceFuture(params: DeactivateEventSourceRequest): Future[js.Object] =
      service.deactivateEventSource(params).promise().toFuture
    @inline def deleteEventBusFuture(params: DeleteEventBusRequest): Future[js.Object] =
      service.deleteEventBus(params).promise().toFuture
    @inline def deletePartnerEventSourceFuture(params: DeletePartnerEventSourceRequest): Future[js.Object] =
      service.deletePartnerEventSource(params).promise().toFuture
    @inline def deleteRuleFuture(params: DeleteRuleRequest): Future[js.Object] =
      service.deleteRule(params).promise().toFuture
    @inline def describeEventBusFuture(params: DescribeEventBusRequest): Future[DescribeEventBusResponse] =
      service.describeEventBus(params).promise().toFuture
    @inline def describeEventSourceFuture(params: DescribeEventSourceRequest): Future[DescribeEventSourceResponse] =
      service.describeEventSource(params).promise().toFuture
    @inline def describePartnerEventSourceFuture(
        params: DescribePartnerEventSourceRequest
    ): Future[DescribePartnerEventSourceResponse] = service.describePartnerEventSource(params).promise().toFuture
    @inline def describeRuleFuture(params: DescribeRuleRequest): Future[DescribeRuleResponse] =
      service.describeRule(params).promise().toFuture
    @inline def disableRuleFuture(params: DisableRuleRequest): Future[js.Object] =
      service.disableRule(params).promise().toFuture
    @inline def enableRuleFuture(params: EnableRuleRequest): Future[js.Object] =
      service.enableRule(params).promise().toFuture
    @inline def listEventBusesFuture(params: ListEventBusesRequest): Future[ListEventBusesResponse] =
      service.listEventBuses(params).promise().toFuture
    @inline def listEventSourcesFuture(params: ListEventSourcesRequest): Future[ListEventSourcesResponse] =
      service.listEventSources(params).promise().toFuture
    @inline def listPartnerEventSourceAccountsFuture(
        params: ListPartnerEventSourceAccountsRequest
    ): Future[ListPartnerEventSourceAccountsResponse] =
      service.listPartnerEventSourceAccounts(params).promise().toFuture
    @inline def listPartnerEventSourcesFuture(
        params: ListPartnerEventSourcesRequest
    ): Future[ListPartnerEventSourcesResponse] = service.listPartnerEventSources(params).promise().toFuture
    @inline def listRuleNamesByTargetFuture(
        params: ListRuleNamesByTargetRequest
    ): Future[ListRuleNamesByTargetResponse] = service.listRuleNamesByTarget(params).promise().toFuture
    @inline def listRulesFuture(params: ListRulesRequest): Future[ListRulesResponse] =
      service.listRules(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listTargetsByRuleFuture(params: ListTargetsByRuleRequest): Future[ListTargetsByRuleResponse] =
      service.listTargetsByRule(params).promise().toFuture
    @inline def putEventsFuture(params: PutEventsRequest): Future[PutEventsResponse] =
      service.putEvents(params).promise().toFuture
    @inline def putPartnerEventsFuture(params: PutPartnerEventsRequest): Future[PutPartnerEventsResponse] =
      service.putPartnerEvents(params).promise().toFuture
    @inline def putPermissionFuture(params: PutPermissionRequest): Future[js.Object] =
      service.putPermission(params).promise().toFuture
    @inline def putRuleFuture(params: PutRuleRequest): Future[PutRuleResponse] =
      service.putRule(params).promise().toFuture
    @inline def putTargetsFuture(params: PutTargetsRequest): Future[PutTargetsResponse] =
      service.putTargets(params).promise().toFuture
    @inline def removePermissionFuture(params: RemovePermissionRequest): Future[js.Object] =
      service.removePermission(params).promise().toFuture
    @inline def removeTargetsFuture(params: RemoveTargetsRequest): Future[RemoveTargetsResponse] =
      service.removeTargets(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def testEventPatternFuture(params: TestEventPatternRequest): Future[TestEventPatternResponse] =
      service.testEventPattern(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
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
  @Factory
  trait ActivateEventSourceRequest extends js.Object {
    var Name: EventSourceName
  }

  @js.native
  sealed trait AssignPublicIp extends js.Any
  object AssignPublicIp extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[AssignPublicIp]
    val DISABLED = "DISABLED".asInstanceOf[AssignPublicIp]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * This structure specifies the VPC subnets and security groups for the task and whether a public IP address is to be used. This structure is relevant only for ECS tasks that use the <code>awsvpc</code> network mode.
    */
  @js.native
  @Factory
  trait AwsVpcConfiguration extends js.Object {
    var Subnets: StringList
    var AssignPublicIp: js.UndefOr[AssignPublicIp]
    var SecurityGroups: js.UndefOr[StringList]
  }

  /**
    * The array properties for the submitted job, such as the size of the array. The array size can be between 2 and 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used only if the target is an AWS Batch job.
    */
  @js.native
  @Factory
  trait BatchArrayProperties extends js.Object {
    var Size: js.UndefOr[Int]
  }

  /**
    * The custom parameters to be used when the target is an AWS Batch job.
    */
  @js.native
  @Factory
  trait BatchParameters extends js.Object {
    var JobDefinition: String
    var JobName: String
    var ArrayProperties: js.UndefOr[BatchArrayProperties]
    var RetryStrategy: js.UndefOr[BatchRetryStrategy]
  }

  /**
    * The retry strategy to use for failed jobs if the target is an AWS Batch job. If you specify a retry strategy here, it overrides the retry strategy defined in the job definition.
    */
  @js.native
  @Factory
  trait BatchRetryStrategy extends js.Object {
    var Attempts: js.UndefOr[Int]
  }

  /**
    * A JSON string that you can use to limit the event bus permissions that you're granting to only accounts that fulfill the condition. Currently, the only supported condition is membership in a certain AWS organization. The string must contain <code>Type</code>, <code>Key</code>, and <code>Value</code> fields. The <code>Value</code> field specifies the ID of the AWS organization. The following is an example value for <code>Condition</code>:
    *  <code>'{"Type" : "StringEquals", "Key": "aws:PrincipalOrgID", "Value": "o-1234567890"}'</code>
    */
  @js.native
  @Factory
  trait Condition extends js.Object {
    var Key: String
    var Type: String
    var Value: String
  }

  @js.native
  @Factory
  trait CreateEventBusRequest extends js.Object {
    var Name: EventBusName
    var EventSourceName: js.UndefOr[EventSourceName]
  }

  @js.native
  @Factory
  trait CreateEventBusResponse extends js.Object {
    var EventBusArn: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreatePartnerEventSourceRequest extends js.Object {
    var Account: AccountId
    var Name: EventSourceName
  }

  @js.native
  @Factory
  trait CreatePartnerEventSourceResponse extends js.Object {
    var EventSourceArn: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeactivateEventSourceRequest extends js.Object {
    var Name: EventSourceName
  }

  @js.native
  @Factory
  trait DeleteEventBusRequest extends js.Object {
    var Name: EventBusName
  }

  @js.native
  @Factory
  trait DeletePartnerEventSourceRequest extends js.Object {
    var Account: AccountId
    var Name: EventSourceName
  }

  @js.native
  @Factory
  trait DeleteRuleRequest extends js.Object {
    var Name: RuleName
    var EventBusName: js.UndefOr[EventBusName]
    var Force: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DescribeEventBusRequest extends js.Object {
    var Name: js.UndefOr[EventBusName]
  }

  @js.native
  @Factory
  trait DescribeEventBusResponse extends js.Object {
    var Arn: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Policy: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeEventSourceRequest extends js.Object {
    var Name: EventSourceName
  }

  @js.native
  @Factory
  trait DescribeEventSourceResponse extends js.Object {
    var Arn: js.UndefOr[String]
    var CreatedBy: js.UndefOr[String]
    var CreationTime: js.UndefOr[Timestamp]
    var ExpirationTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[String]
    var State: js.UndefOr[EventSourceState]
  }

  @js.native
  @Factory
  trait DescribePartnerEventSourceRequest extends js.Object {
    var Name: EventSourceName
  }

  @js.native
  @Factory
  trait DescribePartnerEventSourceResponse extends js.Object {
    var Arn: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeRuleRequest extends js.Object {
    var Name: RuleName
    var EventBusName: js.UndefOr[EventBusName]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DisableRuleRequest extends js.Object {
    var Name: RuleName
    var EventBusName: js.UndefOr[EventBusName]
  }

  /**
    * The custom parameters to be used when the target is an Amazon ECS task.
    */
  @js.native
  @Factory
  trait EcsParameters extends js.Object {
    var TaskDefinitionArn: Arn
    var Group: js.UndefOr[String]
    var LaunchType: js.UndefOr[LaunchType]
    var NetworkConfiguration: js.UndefOr[NetworkConfiguration]
    var PlatformVersion: js.UndefOr[String]
    var TaskCount: js.UndefOr[LimitMin1]
  }

  @js.native
  @Factory
  trait EnableRuleRequest extends js.Object {
    var Name: RuleName
    var EventBusName: js.UndefOr[EventBusName]
  }

  /**
    * An event bus receives events from a source and routes them to rules associated with that event bus. Your account's default event bus receives rules from AWS services. A custom event bus can receive rules from AWS services as well as your custom applications and services. A partner event bus receives events from an event source created by an SaaS partner. These events come from the partners services or applications.
    */
  @js.native
  @Factory
  trait EventBus extends js.Object {
    var Arn: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Policy: js.UndefOr[String]
  }

  /**
    * A partner event source is created by an SaaS partner. If a customer creates a partner event bus that matches this event source, that AWS account can receive events from the partner's applications or services.
    */
  @js.native
  @Factory
  trait EventSource extends js.Object {
    var Arn: js.UndefOr[String]
    var CreatedBy: js.UndefOr[String]
    var CreationTime: js.UndefOr[Timestamp]
    var ExpirationTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[String]
    var State: js.UndefOr[EventSourceState]
  }

  @js.native
  sealed trait EventSourceState extends js.Any
  object EventSourceState extends js.Object {
    val PENDING = "PENDING".asInstanceOf[EventSourceState]
    val ACTIVE  = "ACTIVE".asInstanceOf[EventSourceState]
    val DELETED = "DELETED".asInstanceOf[EventSourceState]

    val values = js.Object.freeze(js.Array(PENDING, ACTIVE, DELETED))
  }

  /**
    * Contains the parameters needed for you to provide custom input to a target based on one or more pieces of data extracted from the event.
    */
  @js.native
  @Factory
  trait InputTransformer extends js.Object {
    var InputTemplate: TransformerInput
    var InputPathsMap: js.UndefOr[TransformerPaths]
  }

  /**
    * This object enables you to specify a JSON path to extract from the event and use as the partition key for the Amazon Kinesis data stream so that you can control the shard that the event goes to. If you don't include this parameter, the default is to use the <code>eventId</code> as the partition key.
    */
  @js.native
  @Factory
  trait KinesisParameters extends js.Object {
    var PartitionKeyPath: TargetPartitionKeyPath
  }

  @js.native
  sealed trait LaunchType extends js.Any
  object LaunchType extends js.Object {
    val EC2     = "EC2".asInstanceOf[LaunchType]
    val FARGATE = "FARGATE".asInstanceOf[LaunchType]

    val values = js.Object.freeze(js.Array(EC2, FARGATE))
  }

  @js.native
  @Factory
  trait ListEventBusesRequest extends js.Object {
    var Limit: js.UndefOr[LimitMax100]
    var NamePrefix: js.UndefOr[EventBusName]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListEventBusesResponse extends js.Object {
    var EventBuses: js.UndefOr[EventBusList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListEventSourcesRequest extends js.Object {
    var Limit: js.UndefOr[LimitMax100]
    var NamePrefix: js.UndefOr[EventSourceNamePrefix]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListEventSourcesResponse extends js.Object {
    var EventSources: js.UndefOr[EventSourceList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListPartnerEventSourceAccountsRequest extends js.Object {
    var EventSourceName: EventSourceName
    var Limit: js.UndefOr[LimitMax100]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListPartnerEventSourceAccountsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PartnerEventSourceAccounts: js.UndefOr[PartnerEventSourceAccountList]
  }

  @js.native
  @Factory
  trait ListPartnerEventSourcesRequest extends js.Object {
    var NamePrefix: PartnerEventSourceNamePrefix
    var Limit: js.UndefOr[LimitMax100]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListPartnerEventSourcesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PartnerEventSources: js.UndefOr[PartnerEventSourceList]
  }

  @js.native
  @Factory
  trait ListRuleNamesByTargetRequest extends js.Object {
    var TargetArn: TargetArn
    var EventBusName: js.UndefOr[EventBusName]
    var Limit: js.UndefOr[LimitMax100]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListRuleNamesByTargetResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RuleNames: js.UndefOr[RuleNameList]
  }

  @js.native
  @Factory
  trait ListRulesRequest extends js.Object {
    var EventBusName: js.UndefOr[EventBusName]
    var Limit: js.UndefOr[LimitMax100]
    var NamePrefix: js.UndefOr[RuleName]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListRulesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Rules: js.UndefOr[RuleResponseList]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: Arn
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait ListTargetsByRuleRequest extends js.Object {
    var Rule: RuleName
    var EventBusName: js.UndefOr[EventBusName]
    var Limit: js.UndefOr[LimitMax100]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTargetsByRuleResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Targets: js.UndefOr[TargetList]
  }

  /**
    * This structure specifies the network configuration for an ECS task.
    */
  @js.native
  @Factory
  trait NetworkConfiguration extends js.Object {
    var awsvpcConfiguration: js.UndefOr[AwsVpcConfiguration]
  }

  /**
    * A partner event source is created by an SaaS partner. If a customer creates a partner event bus that matches this event source, that AWS account can receive events from the partner's applications or services.
    */
  @js.native
  @Factory
  trait PartnerEventSource extends js.Object {
    var Arn: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  /**
    * The AWS account that a partner event source has been offered to.
    */
  @js.native
  @Factory
  trait PartnerEventSourceAccount extends js.Object {
    var Account: js.UndefOr[AccountId]
    var CreationTime: js.UndefOr[Timestamp]
    var ExpirationTime: js.UndefOr[Timestamp]
    var State: js.UndefOr[EventSourceState]
  }

  @js.native
  @Factory
  trait PutEventsRequest extends js.Object {
    var Entries: PutEventsRequestEntryList
  }

  /**
    * Represents an event to be submitted.
    */
  @js.native
  @Factory
  trait PutEventsRequestEntry extends js.Object {
    var Detail: js.UndefOr[String]
    var DetailType: js.UndefOr[String]
    var EventBusName: js.UndefOr[NonPartnerEventBusName]
    var Resources: js.UndefOr[EventResourceList]
    var Source: js.UndefOr[String]
    var Time: js.UndefOr[EventTime]
  }

  @js.native
  @Factory
  trait PutEventsResponse extends js.Object {
    var Entries: js.UndefOr[PutEventsResultEntryList]
    var FailedEntryCount: js.UndefOr[Int]
  }

  /**
    * Represents an event that failed to be submitted.
    */
  @js.native
  @Factory
  trait PutEventsResultEntry extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var EventId: js.UndefOr[EventId]
  }

  @js.native
  @Factory
  trait PutPartnerEventsRequest extends js.Object {
    var Entries: PutPartnerEventsRequestEntryList
  }

  /**
    * The details about an event generated by an SaaS partner.
    */
  @js.native
  @Factory
  trait PutPartnerEventsRequestEntry extends js.Object {
    var Detail: js.UndefOr[String]
    var DetailType: js.UndefOr[String]
    var Resources: js.UndefOr[EventResourceList]
    var Source: js.UndefOr[String]
    var Time: js.UndefOr[EventTime]
  }

  @js.native
  @Factory
  trait PutPartnerEventsResponse extends js.Object {
    var Entries: js.UndefOr[PutPartnerEventsResultEntryList]
    var FailedEntryCount: js.UndefOr[Int]
  }

  /**
    * Represents an event that a partner tried to generate but failed.
    */
  @js.native
  @Factory
  trait PutPartnerEventsResultEntry extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var EventId: js.UndefOr[EventId]
  }

  @js.native
  @Factory
  trait PutPermissionRequest extends js.Object {
    var Action: Action
    var Principal: Principal
    var StatementId: StatementId
    var Condition: js.UndefOr[Condition]
    var EventBusName: js.UndefOr[NonPartnerEventBusName]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait PutRuleResponse extends js.Object {
    var RuleArn: js.UndefOr[RuleArn]
  }

  @js.native
  @Factory
  trait PutTargetsRequest extends js.Object {
    var Rule: RuleName
    var Targets: TargetList
    var EventBusName: js.UndefOr[EventBusName]
  }

  @js.native
  @Factory
  trait PutTargetsResponse extends js.Object {
    var FailedEntries: js.UndefOr[PutTargetsResultEntryList]
    var FailedEntryCount: js.UndefOr[Int]
  }

  /**
    * Represents a target that failed to be added to a rule.
    */
  @js.native
  @Factory
  trait PutTargetsResultEntry extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var TargetId: js.UndefOr[TargetId]
  }

  @js.native
  @Factory
  trait RemovePermissionRequest extends js.Object {
    var StatementId: StatementId
    var EventBusName: js.UndefOr[NonPartnerEventBusName]
  }

  @js.native
  @Factory
  trait RemoveTargetsRequest extends js.Object {
    var Ids: TargetIdList
    var Rule: RuleName
    var EventBusName: js.UndefOr[EventBusName]
    var Force: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait RemoveTargetsResponse extends js.Object {
    var FailedEntries: js.UndefOr[RemoveTargetsResultEntryList]
    var FailedEntryCount: js.UndefOr[Int]
  }

  /**
    * Represents a target that failed to be removed from a rule.
    */
  @js.native
  @Factory
  trait RemoveTargetsResultEntry extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var TargetId: js.UndefOr[TargetId]
  }

  /**
    * Contains information about a rule in Amazon EventBridge.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait RuleState extends js.Any
  object RuleState extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[RuleState]
    val DISABLED = "DISABLED".asInstanceOf[RuleState]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * This parameter contains the criteria (either <code>InstanceIds</code> or a tag) used to specify which EC2 instances are to be sent the command.
    */
  @js.native
  @Factory
  trait RunCommandParameters extends js.Object {
    var RunCommandTargets: RunCommandTargets
  }

  /**
    * Information about the EC2 instances that are to be sent the command, specified as key-value pairs. Each <code>RunCommandTarget</code> block can include only one key, but this key can specify multiple values.
    */
  @js.native
  @Factory
  trait RunCommandTarget extends js.Object {
    var Key: RunCommandTargetKey
    var Values: RunCommandTargetValues
  }

  /**
    * This structure includes the custom parameter to be used when the target is an SQS FIFO queue.
    */
  @js.native
  @Factory
  trait SqsParameters extends js.Object {
    var MessageGroupId: js.UndefOr[MessageGroupId]
  }

  /**
    * A key-value pair associated with an AWS resource. In EventBridge, rules support tagging.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceARN: Arn
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  /**
    * Targets are the resources to be invoked when a rule is triggered. For a complete list of services and resources that can be set as a target, see <a>PutTargets</a>.
    *  If you're setting the event bus of another account as the target and that account granted permission to your account through an organization instead of directly by the account ID, you must specify a <code>RoleArn</code> with proper permissions in the <code>Target</code> structure. For more information, see [[https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html|Sending and Receiving Events Between AWS Accounts]] in the <i>Amazon EventBridge User Guide</i>.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait TestEventPatternRequest extends js.Object {
    var Event: String
    var EventPattern: EventPattern
  }

  @js.native
  @Factory
  trait TestEventPatternResponse extends js.Object {
    var Result: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: Arn
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}
}
