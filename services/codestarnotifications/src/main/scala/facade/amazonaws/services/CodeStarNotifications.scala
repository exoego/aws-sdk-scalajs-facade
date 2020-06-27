package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object codestarnotifications {
  type ClientRequestToken               = String
  type CreatedTimestamp                 = js.Date
  type EventTypeBatch                   = js.Array[EventTypeSummary]
  type EventTypeId                      = String
  type EventTypeIds                     = js.Array[EventTypeId]
  type EventTypeName                    = String
  type ForceUnsubscribeAll              = Boolean
  type LastModifiedTimestamp            = js.Date
  type ListEventTypesFilterValue        = String
  type ListEventTypesFilters            = js.Array[ListEventTypesFilter]
  type ListNotificationRulesFilterValue = String
  type ListNotificationRulesFilters     = js.Array[ListNotificationRulesFilter]
  type ListTargetsFilterValue           = String
  type ListTargetsFilters               = js.Array[ListTargetsFilter]
  type MaxResults                       = Int
  type NextToken                        = String
  type NotificationRuleArn              = String
  type NotificationRuleBatch            = js.Array[NotificationRuleSummary]
  type NotificationRuleCreatedBy        = String
  type NotificationRuleId               = String
  type NotificationRuleName             = String
  type NotificationRuleResource         = String
  type ResourceType                     = String
  type ServiceName                      = String
  type TagKey                           = String
  type TagKeys                          = js.Array[TagKey]
  type TagValue                         = String
  type Tags                             = js.Dictionary[TagValue]
  type TargetAddress                    = String
  type TargetType                       = String
  type Targets                          = js.Array[Target]
  type TargetsBatch                     = js.Array[TargetSummary]

  implicit final class CodeStarNotificationsOps(private val service: CodeStarNotifications) extends AnyVal {

    @inline def createNotificationRuleFuture(
        params: CreateNotificationRuleRequest
    ): Future[CreateNotificationRuleResult] = service.createNotificationRule(params).promise().toFuture
    @inline def deleteNotificationRuleFuture(
        params: DeleteNotificationRuleRequest
    ): Future[DeleteNotificationRuleResult] = service.deleteNotificationRule(params).promise().toFuture
    @inline def deleteTargetFuture(params: DeleteTargetRequest): Future[DeleteTargetResult] =
      service.deleteTarget(params).promise().toFuture
    @inline def describeNotificationRuleFuture(
        params: DescribeNotificationRuleRequest
    ): Future[DescribeNotificationRuleResult] = service.describeNotificationRule(params).promise().toFuture
    @inline def listEventTypesFuture(params: ListEventTypesRequest): Future[ListEventTypesResult] =
      service.listEventTypes(params).promise().toFuture
    @inline def listNotificationRulesFuture(params: ListNotificationRulesRequest): Future[ListNotificationRulesResult] =
      service.listNotificationRules(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResult] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listTargetsFuture(params: ListTargetsRequest): Future[ListTargetsResult] =
      service.listTargets(params).promise().toFuture
    @inline def subscribeFuture(params: SubscribeRequest): Future[SubscribeResult] =
      service.subscribe(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResult] =
      service.tagResource(params).promise().toFuture
    @inline def unsubscribeFuture(params: UnsubscribeRequest): Future[UnsubscribeResult] =
      service.unsubscribe(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResult] =
      service.untagResource(params).promise().toFuture
    @inline def updateNotificationRuleFuture(
        params: UpdateNotificationRuleRequest
    ): Future[UpdateNotificationRuleResult] = service.updateNotificationRule(params).promise().toFuture
  }
}

package codestarnotifications {
  @js.native
  @JSImport("aws-sdk", "CodeStarNotifications")
  class CodeStarNotifications() extends js.Object {
    def this(config: AWSConfig) = this()

    def createNotificationRule(params: CreateNotificationRuleRequest): Request[CreateNotificationRuleResult] = js.native
    def deleteNotificationRule(params: DeleteNotificationRuleRequest): Request[DeleteNotificationRuleResult] = js.native
    def deleteTarget(params: DeleteTargetRequest): Request[DeleteTargetResult]                               = js.native
    def describeNotificationRule(params: DescribeNotificationRuleRequest): Request[DescribeNotificationRuleResult] =
      js.native
    def listEventTypes(params: ListEventTypesRequest): Request[ListEventTypesResult]                         = js.native
    def listNotificationRules(params: ListNotificationRulesRequest): Request[ListNotificationRulesResult]    = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult]          = js.native
    def listTargets(params: ListTargetsRequest): Request[ListTargetsResult]                                  = js.native
    def subscribe(params: SubscribeRequest): Request[SubscribeResult]                                        = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResult]                                  = js.native
    def unsubscribe(params: UnsubscribeRequest): Request[UnsubscribeResult]                                  = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResult]                            = js.native
    def updateNotificationRule(params: UpdateNotificationRuleRequest): Request[UpdateNotificationRuleResult] = js.native
  }

  @js.native
  @Factory
  trait CreateNotificationRuleRequest extends js.Object {
    var DetailType: DetailType
    var EventTypeIds: EventTypeIds
    var Name: NotificationRuleName
    var Resource: NotificationRuleResource
    var Targets: Targets
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Status: js.UndefOr[NotificationRuleStatus]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateNotificationRuleResult extends js.Object {
    var Arn: js.UndefOr[NotificationRuleArn]
  }

  @js.native
  @Factory
  trait DeleteNotificationRuleRequest extends js.Object {
    var Arn: NotificationRuleArn
  }

  @js.native
  @Factory
  trait DeleteNotificationRuleResult extends js.Object {
    var Arn: js.UndefOr[NotificationRuleArn]
  }

  @js.native
  @Factory
  trait DeleteTargetRequest extends js.Object {
    var TargetAddress: TargetAddress
    var ForceUnsubscribeAll: js.UndefOr[ForceUnsubscribeAll]
  }

  @js.native
  @Factory
  trait DeleteTargetResult extends js.Object {}

  @js.native
  @Factory
  trait DescribeNotificationRuleRequest extends js.Object {
    var Arn: NotificationRuleArn
  }

  @js.native
  @Factory
  trait DescribeNotificationRuleResult extends js.Object {
    var Arn: NotificationRuleArn
    var CreatedBy: js.UndefOr[NotificationRuleCreatedBy]
    var CreatedTimestamp: js.UndefOr[CreatedTimestamp]
    var DetailType: js.UndefOr[DetailType]
    var EventTypes: js.UndefOr[EventTypeBatch]
    var LastModifiedTimestamp: js.UndefOr[LastModifiedTimestamp]
    var Name: js.UndefOr[NotificationRuleName]
    var Resource: js.UndefOr[NotificationRuleResource]
    var Status: js.UndefOr[NotificationRuleStatus]
    var Tags: js.UndefOr[Tags]
    var Targets: js.UndefOr[TargetsBatch]
  }

  @js.native
  sealed trait DetailType extends js.Any
  object DetailType extends js.Object {
    val BASIC = "BASIC".asInstanceOf[DetailType]
    val FULL  = "FULL".asInstanceOf[DetailType]

    val values = js.Object.freeze(js.Array(BASIC, FULL))
  }

  /**
    * Returns information about an event that has triggered a notification rule.
    */
  @js.native
  @Factory
  trait EventTypeSummary extends js.Object {
    var EventTypeId: js.UndefOr[EventTypeId]
    var EventTypeName: js.UndefOr[EventTypeName]
    var ResourceType: js.UndefOr[ResourceType]
    var ServiceName: js.UndefOr[ServiceName]
  }

  /**
    * Information about a filter to apply to the list of returned event types. You can filter by resource type or service name.
    */
  @js.native
  @Factory
  trait ListEventTypesFilter extends js.Object {
    var Name: ListEventTypesFilterName
    var Value: ListEventTypesFilterValue
  }

  @js.native
  sealed trait ListEventTypesFilterName extends js.Any
  object ListEventTypesFilterName extends js.Object {
    val RESOURCE_TYPE = "RESOURCE_TYPE".asInstanceOf[ListEventTypesFilterName]
    val SERVICE_NAME  = "SERVICE_NAME".asInstanceOf[ListEventTypesFilterName]

    val values = js.Object.freeze(js.Array(RESOURCE_TYPE, SERVICE_NAME))
  }

  @js.native
  @Factory
  trait ListEventTypesRequest extends js.Object {
    var Filters: js.UndefOr[ListEventTypesFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListEventTypesResult extends js.Object {
    var EventTypes: js.UndefOr[EventTypeBatch]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Information about a filter to apply to the list of returned notification rules. You can filter by event type, owner, resource, or target.
    */
  @js.native
  @Factory
  trait ListNotificationRulesFilter extends js.Object {
    var Name: ListNotificationRulesFilterName
    var Value: ListNotificationRulesFilterValue
  }

  @js.native
  sealed trait ListNotificationRulesFilterName extends js.Any
  object ListNotificationRulesFilterName extends js.Object {
    val EVENT_TYPE_ID  = "EVENT_TYPE_ID".asInstanceOf[ListNotificationRulesFilterName]
    val CREATED_BY     = "CREATED_BY".asInstanceOf[ListNotificationRulesFilterName]
    val RESOURCE       = "RESOURCE".asInstanceOf[ListNotificationRulesFilterName]
    val TARGET_ADDRESS = "TARGET_ADDRESS".asInstanceOf[ListNotificationRulesFilterName]

    val values = js.Object.freeze(js.Array(EVENT_TYPE_ID, CREATED_BY, RESOURCE, TARGET_ADDRESS))
  }

  @js.native
  @Factory
  trait ListNotificationRulesRequest extends js.Object {
    var Filters: js.UndefOr[ListNotificationRulesFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListNotificationRulesResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var NotificationRules: js.UndefOr[NotificationRuleBatch]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var Arn: NotificationRuleArn
  }

  @js.native
  @Factory
  trait ListTagsForResourceResult extends js.Object {
    var Tags: js.UndefOr[Tags]
  }

  /**
    * Information about a filter to apply to the list of returned targets. You can filter by target type, address, or status. For example, to filter results to notification rules that have active Amazon SNS topics as targets, you could specify a ListTargetsFilter Name as TargetType and a Value of SNS, and a Name of TARGET_STATUS and a Value of ACTIVE.
    */
  @js.native
  @Factory
  trait ListTargetsFilter extends js.Object {
    var Name: ListTargetsFilterName
    var Value: ListTargetsFilterValue
  }

  @js.native
  sealed trait ListTargetsFilterName extends js.Any
  object ListTargetsFilterName extends js.Object {
    val TARGET_TYPE    = "TARGET_TYPE".asInstanceOf[ListTargetsFilterName]
    val TARGET_ADDRESS = "TARGET_ADDRESS".asInstanceOf[ListTargetsFilterName]
    val TARGET_STATUS  = "TARGET_STATUS".asInstanceOf[ListTargetsFilterName]

    val values = js.Object.freeze(js.Array(TARGET_TYPE, TARGET_ADDRESS, TARGET_STATUS))
  }

  @js.native
  @Factory
  trait ListTargetsRequest extends js.Object {
    var Filters: js.UndefOr[ListTargetsFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTargetsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Targets: js.UndefOr[TargetsBatch]
  }

  @js.native
  sealed trait NotificationRuleStatus extends js.Any
  object NotificationRuleStatus extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[NotificationRuleStatus]
    val DISABLED = "DISABLED".asInstanceOf[NotificationRuleStatus]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Information about a specified notification rule.
    */
  @js.native
  @Factory
  trait NotificationRuleSummary extends js.Object {
    var Arn: js.UndefOr[NotificationRuleArn]
    var Id: js.UndefOr[NotificationRuleId]
  }

  @js.native
  @Factory
  trait SubscribeRequest extends js.Object {
    var Arn: NotificationRuleArn
    var Target: Target
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  @js.native
  @Factory
  trait SubscribeResult extends js.Object {
    var Arn: js.UndefOr[NotificationRuleArn]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var Arn: NotificationRuleArn
    var Tags: Tags
  }

  @js.native
  @Factory
  trait TagResourceResult extends js.Object {
    var Tags: js.UndefOr[Tags]
  }

  /**
    * Information about the SNS topics associated with a notification rule.
    */
  @js.native
  @Factory
  trait Target extends js.Object {
    var TargetAddress: js.UndefOr[TargetAddress]
    var TargetType: js.UndefOr[TargetType]
  }

  @js.native
  sealed trait TargetStatus extends js.Any
  object TargetStatus extends js.Object {
    val PENDING     = "PENDING".asInstanceOf[TargetStatus]
    val ACTIVE      = "ACTIVE".asInstanceOf[TargetStatus]
    val UNREACHABLE = "UNREACHABLE".asInstanceOf[TargetStatus]
    val INACTIVE    = "INACTIVE".asInstanceOf[TargetStatus]
    val DEACTIVATED = "DEACTIVATED".asInstanceOf[TargetStatus]

    val values = js.Object.freeze(js.Array(PENDING, ACTIVE, UNREACHABLE, INACTIVE, DEACTIVATED))
  }

  /**
    * Information about the targets specified for a notification rule.
    */
  @js.native
  @Factory
  trait TargetSummary extends js.Object {
    var TargetAddress: js.UndefOr[TargetAddress]
    var TargetStatus: js.UndefOr[TargetStatus]
    var TargetType: js.UndefOr[TargetType]
  }

  @js.native
  @Factory
  trait UnsubscribeRequest extends js.Object {
    var Arn: NotificationRuleArn
    var TargetAddress: TargetAddress
  }

  @js.native
  @Factory
  trait UnsubscribeResult extends js.Object {
    var Arn: NotificationRuleArn
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var Arn: NotificationRuleArn
    var TagKeys: TagKeys
  }

  @js.native
  @Factory
  trait UntagResourceResult extends js.Object {}

  @js.native
  @Factory
  trait UpdateNotificationRuleRequest extends js.Object {
    var Arn: NotificationRuleArn
    var DetailType: js.UndefOr[DetailType]
    var EventTypeIds: js.UndefOr[EventTypeIds]
    var Name: js.UndefOr[NotificationRuleName]
    var Status: js.UndefOr[NotificationRuleStatus]
    var Targets: js.UndefOr[Targets]
  }

  @js.native
  @Factory
  trait UpdateNotificationRuleResult extends js.Object {}
}
