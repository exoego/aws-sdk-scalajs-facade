package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object codestarnotifications {
  type ClientRequestToken = String
  type CreatedTimestamp = js.Date
  type EventTypeBatch = js.Array[EventTypeSummary]
  type EventTypeId = String
  type EventTypeIds = js.Array[EventTypeId]
  type EventTypeName = String
  type ForceUnsubscribeAll = Boolean
  type LastModifiedTimestamp = js.Date
  type ListEventTypesFilterValue = String
  type ListEventTypesFilters = js.Array[ListEventTypesFilter]
  type ListNotificationRulesFilterValue = String
  type ListNotificationRulesFilters = js.Array[ListNotificationRulesFilter]
  type ListTargetsFilterValue = String
  type ListTargetsFilters = js.Array[ListTargetsFilter]
  type MaxResults = Int
  type NextToken = String
  type NotificationRuleArn = String
  type NotificationRuleBatch = js.Array[NotificationRuleSummary]
  type NotificationRuleCreatedBy = String
  type NotificationRuleId = String
  type NotificationRuleName = String
  type NotificationRuleResource = String
  type ResourceType = String
  type ServiceName = String
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Dictionary[TagValue]
  type TargetAddress = String
  type TargetType = String
  type Targets = js.Array[Target]
  type TargetsBatch = js.Array[TargetSummary]

  implicit final class CodeStarNotificationsOps(private val service: CodeStarNotifications) extends AnyVal {

    @inline def createNotificationRuleFuture(params: CreateNotificationRuleRequest): Future[CreateNotificationRuleResult] = service.createNotificationRule(params).promise().toFuture
    @inline def deleteNotificationRuleFuture(params: DeleteNotificationRuleRequest): Future[DeleteNotificationRuleResult] = service.deleteNotificationRule(params).promise().toFuture
    @inline def deleteTargetFuture(params: DeleteTargetRequest): Future[DeleteTargetResult] = service.deleteTarget(params).promise().toFuture
    @inline def describeNotificationRuleFuture(params: DescribeNotificationRuleRequest): Future[DescribeNotificationRuleResult] = service.describeNotificationRule(params).promise().toFuture
    @inline def listEventTypesFuture(params: ListEventTypesRequest): Future[ListEventTypesResult] = service.listEventTypes(params).promise().toFuture
    @inline def listNotificationRulesFuture(params: ListNotificationRulesRequest): Future[ListNotificationRulesResult] = service.listNotificationRules(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResult] = service.listTagsForResource(params).promise().toFuture
    @inline def listTargetsFuture(params: ListTargetsRequest): Future[ListTargetsResult] = service.listTargets(params).promise().toFuture
    @inline def subscribeFuture(params: SubscribeRequest): Future[SubscribeResult] = service.subscribe(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResult] = service.tagResource(params).promise().toFuture
    @inline def unsubscribeFuture(params: UnsubscribeRequest): Future[UnsubscribeResult] = service.unsubscribe(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResult] = service.untagResource(params).promise().toFuture
    @inline def updateNotificationRuleFuture(params: UpdateNotificationRuleRequest): Future[UpdateNotificationRuleResult] = service.updateNotificationRule(params).promise().toFuture
  }
}

package codestarnotifications {
  @js.native
  @JSImport("aws-sdk", "CodeStarNotifications", "AWS.CodeStarNotifications")
  class CodeStarNotifications() extends js.Object {
    def this(config: AWSConfig) = this()

    def createNotificationRule(params: CreateNotificationRuleRequest): Request[CreateNotificationRuleResult] = js.native
    def deleteNotificationRule(params: DeleteNotificationRuleRequest): Request[DeleteNotificationRuleResult] = js.native
    def deleteTarget(params: DeleteTargetRequest): Request[DeleteTargetResult] = js.native
    def describeNotificationRule(params: DescribeNotificationRuleRequest): Request[DescribeNotificationRuleResult] = js.native
    def listEventTypes(params: ListEventTypesRequest): Request[ListEventTypesResult] = js.native
    def listNotificationRules(params: ListNotificationRulesRequest): Request[ListNotificationRulesResult] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult] = js.native
    def listTargets(params: ListTargetsRequest): Request[ListTargetsResult] = js.native
    def subscribe(params: SubscribeRequest): Request[SubscribeResult] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResult] = js.native
    def unsubscribe(params: UnsubscribeRequest): Request[UnsubscribeResult] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResult] = js.native
    def updateNotificationRule(params: UpdateNotificationRuleRequest): Request[UpdateNotificationRuleResult] = js.native
  }

  @js.native
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

  object CreateNotificationRuleRequest {
    @inline
    def apply(
        DetailType: DetailType,
        EventTypeIds: EventTypeIds,
        Name: NotificationRuleName,
        Resource: NotificationRuleResource,
        Targets: Targets,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Status: js.UndefOr[NotificationRuleStatus] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateNotificationRuleRequest = {
      val __obj = js.Dynamic.literal(
        "DetailType" -> DetailType.asInstanceOf[js.Any],
        "EventTypeIds" -> EventTypeIds.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Resource" -> Resource.asInstanceOf[js.Any],
        "Targets" -> Targets.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNotificationRuleRequest]
    }
  }

  @js.native
  trait CreateNotificationRuleResult extends js.Object {
    var Arn: js.UndefOr[NotificationRuleArn]
  }

  object CreateNotificationRuleResult {
    @inline
    def apply(
        Arn: js.UndefOr[NotificationRuleArn] = js.undefined
    ): CreateNotificationRuleResult = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNotificationRuleResult]
    }
  }

  @js.native
  trait DeleteNotificationRuleRequest extends js.Object {
    var Arn: NotificationRuleArn
  }

  object DeleteNotificationRuleRequest {
    @inline
    def apply(
        Arn: NotificationRuleArn
    ): DeleteNotificationRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteNotificationRuleRequest]
    }
  }

  @js.native
  trait DeleteNotificationRuleResult extends js.Object {
    var Arn: js.UndefOr[NotificationRuleArn]
  }

  object DeleteNotificationRuleResult {
    @inline
    def apply(
        Arn: js.UndefOr[NotificationRuleArn] = js.undefined
    ): DeleteNotificationRuleResult = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteNotificationRuleResult]
    }
  }

  @js.native
  trait DeleteTargetRequest extends js.Object {
    var TargetAddress: TargetAddress
    var ForceUnsubscribeAll: js.UndefOr[ForceUnsubscribeAll]
  }

  object DeleteTargetRequest {
    @inline
    def apply(
        TargetAddress: TargetAddress,
        ForceUnsubscribeAll: js.UndefOr[ForceUnsubscribeAll] = js.undefined
    ): DeleteTargetRequest = {
      val __obj = js.Dynamic.literal(
        "TargetAddress" -> TargetAddress.asInstanceOf[js.Any]
      )

      ForceUnsubscribeAll.foreach(__v => __obj.updateDynamic("ForceUnsubscribeAll")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteTargetRequest]
    }
  }

  @js.native
  trait DeleteTargetResult extends js.Object {}

  object DeleteTargetResult {
    @inline
    def apply(
    ): DeleteTargetResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteTargetResult]
    }
  }

  @js.native
  trait DescribeNotificationRuleRequest extends js.Object {
    var Arn: NotificationRuleArn
  }

  object DescribeNotificationRuleRequest {
    @inline
    def apply(
        Arn: NotificationRuleArn
    ): DescribeNotificationRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeNotificationRuleRequest]
    }
  }

  @js.native
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

  object DescribeNotificationRuleResult {
    @inline
    def apply(
        Arn: NotificationRuleArn,
        CreatedBy: js.UndefOr[NotificationRuleCreatedBy] = js.undefined,
        CreatedTimestamp: js.UndefOr[CreatedTimestamp] = js.undefined,
        DetailType: js.UndefOr[DetailType] = js.undefined,
        EventTypes: js.UndefOr[EventTypeBatch] = js.undefined,
        LastModifiedTimestamp: js.UndefOr[LastModifiedTimestamp] = js.undefined,
        Name: js.UndefOr[NotificationRuleName] = js.undefined,
        Resource: js.UndefOr[NotificationRuleResource] = js.undefined,
        Status: js.UndefOr[NotificationRuleStatus] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Targets: js.UndefOr[TargetsBatch] = js.undefined
    ): DescribeNotificationRuleResult = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      DetailType.foreach(__v => __obj.updateDynamic("DetailType")(__v.asInstanceOf[js.Any]))
      EventTypes.foreach(__v => __obj.updateDynamic("EventTypes")(__v.asInstanceOf[js.Any]))
      LastModifiedTimestamp.foreach(__v => __obj.updateDynamic("LastModifiedTimestamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Resource.foreach(__v => __obj.updateDynamic("Resource")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeNotificationRuleResult]
    }
  }

  @js.native
  sealed trait DetailType extends js.Any
  object DetailType extends js.Object {
    val BASIC = "BASIC".asInstanceOf[DetailType]
    val FULL = "FULL".asInstanceOf[DetailType]

    val values = js.Object.freeze(js.Array(BASIC, FULL))
  }

  /**
    * Returns information about an event that has triggered a notification rule.
    */
  @js.native
  trait EventTypeSummary extends js.Object {
    var EventTypeId: js.UndefOr[EventTypeId]
    var EventTypeName: js.UndefOr[EventTypeName]
    var ResourceType: js.UndefOr[ResourceType]
    var ServiceName: js.UndefOr[ServiceName]
  }

  object EventTypeSummary {
    @inline
    def apply(
        EventTypeId: js.UndefOr[EventTypeId] = js.undefined,
        EventTypeName: js.UndefOr[EventTypeName] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined,
        ServiceName: js.UndefOr[ServiceName] = js.undefined
    ): EventTypeSummary = {
      val __obj = js.Dynamic.literal()
      EventTypeId.foreach(__v => __obj.updateDynamic("EventTypeId")(__v.asInstanceOf[js.Any]))
      EventTypeName.foreach(__v => __obj.updateDynamic("EventTypeName")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.updateDynamic("ServiceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventTypeSummary]
    }
  }

  /**
    * Information about a filter to apply to the list of returned event types. You can filter by resource type or service name.
    */
  @js.native
  trait ListEventTypesFilter extends js.Object {
    var Name: ListEventTypesFilterName
    var Value: ListEventTypesFilterValue
  }

  object ListEventTypesFilter {
    @inline
    def apply(
        Name: ListEventTypesFilterName,
        Value: ListEventTypesFilterValue
    ): ListEventTypesFilter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListEventTypesFilter]
    }
  }

  @js.native
  sealed trait ListEventTypesFilterName extends js.Any
  object ListEventTypesFilterName extends js.Object {
    val RESOURCE_TYPE = "RESOURCE_TYPE".asInstanceOf[ListEventTypesFilterName]
    val SERVICE_NAME = "SERVICE_NAME".asInstanceOf[ListEventTypesFilterName]

    val values = js.Object.freeze(js.Array(RESOURCE_TYPE, SERVICE_NAME))
  }

  @js.native
  trait ListEventTypesRequest extends js.Object {
    var Filters: js.UndefOr[ListEventTypesFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEventTypesRequest {
    @inline
    def apply(
        Filters: js.UndefOr[ListEventTypesFilters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEventTypesRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventTypesRequest]
    }
  }

  @js.native
  trait ListEventTypesResult extends js.Object {
    var EventTypes: js.UndefOr[EventTypeBatch]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEventTypesResult {
    @inline
    def apply(
        EventTypes: js.UndefOr[EventTypeBatch] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEventTypesResult = {
      val __obj = js.Dynamic.literal()
      EventTypes.foreach(__v => __obj.updateDynamic("EventTypes")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventTypesResult]
    }
  }

  /**
    * Information about a filter to apply to the list of returned notification rules. You can filter by event type, owner, resource, or target.
    */
  @js.native
  trait ListNotificationRulesFilter extends js.Object {
    var Name: ListNotificationRulesFilterName
    var Value: ListNotificationRulesFilterValue
  }

  object ListNotificationRulesFilter {
    @inline
    def apply(
        Name: ListNotificationRulesFilterName,
        Value: ListNotificationRulesFilterValue
    ): ListNotificationRulesFilter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListNotificationRulesFilter]
    }
  }

  @js.native
  sealed trait ListNotificationRulesFilterName extends js.Any
  object ListNotificationRulesFilterName extends js.Object {
    val EVENT_TYPE_ID = "EVENT_TYPE_ID".asInstanceOf[ListNotificationRulesFilterName]
    val CREATED_BY = "CREATED_BY".asInstanceOf[ListNotificationRulesFilterName]
    val RESOURCE = "RESOURCE".asInstanceOf[ListNotificationRulesFilterName]
    val TARGET_ADDRESS = "TARGET_ADDRESS".asInstanceOf[ListNotificationRulesFilterName]

    val values = js.Object.freeze(js.Array(EVENT_TYPE_ID, CREATED_BY, RESOURCE, TARGET_ADDRESS))
  }

  @js.native
  trait ListNotificationRulesRequest extends js.Object {
    var Filters: js.UndefOr[ListNotificationRulesFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListNotificationRulesRequest {
    @inline
    def apply(
        Filters: js.UndefOr[ListNotificationRulesFilters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListNotificationRulesRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNotificationRulesRequest]
    }
  }

  @js.native
  trait ListNotificationRulesResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var NotificationRules: js.UndefOr[NotificationRuleBatch]
  }

  object ListNotificationRulesResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        NotificationRules: js.UndefOr[NotificationRuleBatch] = js.undefined
    ): ListNotificationRulesResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      NotificationRules.foreach(__v => __obj.updateDynamic("NotificationRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNotificationRulesResult]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var Arn: NotificationRuleArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        Arn: NotificationRuleArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResult extends js.Object {
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResult {
    @inline
    def apply(
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResult = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResult]
    }
  }

  /**
    * Information about a filter to apply to the list of returned targets. You can filter by target type, address, or status. For example, to filter results to notification rules that have active Amazon SNS topics as targets, you could specify a ListTargetsFilter Name as TargetType and a Value of SNS, and a Name of TARGET_STATUS and a Value of ACTIVE.
    */
  @js.native
  trait ListTargetsFilter extends js.Object {
    var Name: ListTargetsFilterName
    var Value: ListTargetsFilterValue
  }

  object ListTargetsFilter {
    @inline
    def apply(
        Name: ListTargetsFilterName,
        Value: ListTargetsFilterValue
    ): ListTargetsFilter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTargetsFilter]
    }
  }

  @js.native
  sealed trait ListTargetsFilterName extends js.Any
  object ListTargetsFilterName extends js.Object {
    val TARGET_TYPE = "TARGET_TYPE".asInstanceOf[ListTargetsFilterName]
    val TARGET_ADDRESS = "TARGET_ADDRESS".asInstanceOf[ListTargetsFilterName]
    val TARGET_STATUS = "TARGET_STATUS".asInstanceOf[ListTargetsFilterName]

    val values = js.Object.freeze(js.Array(TARGET_TYPE, TARGET_ADDRESS, TARGET_STATUS))
  }

  @js.native
  trait ListTargetsRequest extends js.Object {
    var Filters: js.UndefOr[ListTargetsFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTargetsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[ListTargetsFilters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTargetsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTargetsRequest]
    }
  }

  @js.native
  trait ListTargetsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Targets: js.UndefOr[TargetsBatch]
  }

  object ListTargetsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Targets: js.UndefOr[TargetsBatch] = js.undefined
    ): ListTargetsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTargetsResult]
    }
  }

  @js.native
  sealed trait NotificationRuleStatus extends js.Any
  object NotificationRuleStatus extends js.Object {
    val ENABLED = "ENABLED".asInstanceOf[NotificationRuleStatus]
    val DISABLED = "DISABLED".asInstanceOf[NotificationRuleStatus]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Information about a specified notification rule.
    */
  @js.native
  trait NotificationRuleSummary extends js.Object {
    var Arn: js.UndefOr[NotificationRuleArn]
    var Id: js.UndefOr[NotificationRuleId]
  }

  object NotificationRuleSummary {
    @inline
    def apply(
        Arn: js.UndefOr[NotificationRuleArn] = js.undefined,
        Id: js.UndefOr[NotificationRuleId] = js.undefined
    ): NotificationRuleSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotificationRuleSummary]
    }
  }

  @js.native
  trait SubscribeRequest extends js.Object {
    var Arn: NotificationRuleArn
    var Target: Target
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object SubscribeRequest {
    @inline
    def apply(
        Arn: NotificationRuleArn,
        Target: Target,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): SubscribeRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Target" -> Target.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubscribeRequest]
    }
  }

  @js.native
  trait SubscribeResult extends js.Object {
    var Arn: js.UndefOr[NotificationRuleArn]
  }

  object SubscribeResult {
    @inline
    def apply(
        Arn: js.UndefOr[NotificationRuleArn] = js.undefined
    ): SubscribeResult = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubscribeResult]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var Arn: NotificationRuleArn
    var Tags: Tags
  }

  object TagResourceRequest {
    @inline
    def apply(
        Arn: NotificationRuleArn,
        Tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResult extends js.Object {
    var Tags: js.UndefOr[Tags]
  }

  object TagResourceResult {
    @inline
    def apply(
        Tags: js.UndefOr[Tags] = js.undefined
    ): TagResourceResult = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagResourceResult]
    }
  }

  /**
    * Information about the SNS topics associated with a notification rule.
    */
  @js.native
  trait Target extends js.Object {
    var TargetAddress: js.UndefOr[TargetAddress]
    var TargetType: js.UndefOr[TargetType]
  }

  object Target {
    @inline
    def apply(
        TargetAddress: js.UndefOr[TargetAddress] = js.undefined,
        TargetType: js.UndefOr[TargetType] = js.undefined
    ): Target = {
      val __obj = js.Dynamic.literal()
      TargetAddress.foreach(__v => __obj.updateDynamic("TargetAddress")(__v.asInstanceOf[js.Any]))
      TargetType.foreach(__v => __obj.updateDynamic("TargetType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Target]
    }
  }

  @js.native
  sealed trait TargetStatus extends js.Any
  object TargetStatus extends js.Object {
    val PENDING = "PENDING".asInstanceOf[TargetStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[TargetStatus]
    val UNREACHABLE = "UNREACHABLE".asInstanceOf[TargetStatus]
    val INACTIVE = "INACTIVE".asInstanceOf[TargetStatus]
    val DEACTIVATED = "DEACTIVATED".asInstanceOf[TargetStatus]

    val values = js.Object.freeze(js.Array(PENDING, ACTIVE, UNREACHABLE, INACTIVE, DEACTIVATED))
  }

  /**
    * Information about the targets specified for a notification rule.
    */
  @js.native
  trait TargetSummary extends js.Object {
    var TargetAddress: js.UndefOr[TargetAddress]
    var TargetStatus: js.UndefOr[TargetStatus]
    var TargetType: js.UndefOr[TargetType]
  }

  object TargetSummary {
    @inline
    def apply(
        TargetAddress: js.UndefOr[TargetAddress] = js.undefined,
        TargetStatus: js.UndefOr[TargetStatus] = js.undefined,
        TargetType: js.UndefOr[TargetType] = js.undefined
    ): TargetSummary = {
      val __obj = js.Dynamic.literal()
      TargetAddress.foreach(__v => __obj.updateDynamic("TargetAddress")(__v.asInstanceOf[js.Any]))
      TargetStatus.foreach(__v => __obj.updateDynamic("TargetStatus")(__v.asInstanceOf[js.Any]))
      TargetType.foreach(__v => __obj.updateDynamic("TargetType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetSummary]
    }
  }

  @js.native
  trait UnsubscribeRequest extends js.Object {
    var Arn: NotificationRuleArn
    var TargetAddress: TargetAddress
  }

  object UnsubscribeRequest {
    @inline
    def apply(
        Arn: NotificationRuleArn,
        TargetAddress: TargetAddress
    ): UnsubscribeRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "TargetAddress" -> TargetAddress.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UnsubscribeRequest]
    }
  }

  @js.native
  trait UnsubscribeResult extends js.Object {
    var Arn: NotificationRuleArn
  }

  object UnsubscribeResult {
    @inline
    def apply(
        Arn: NotificationRuleArn
    ): UnsubscribeResult = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UnsubscribeResult]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var Arn: NotificationRuleArn
    var TagKeys: TagKeys
  }

  object UntagResourceRequest {
    @inline
    def apply(
        Arn: NotificationRuleArn,
        TagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResult extends js.Object {}

  object UntagResourceResult {
    @inline
    def apply(
    ): UntagResourceResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResult]
    }
  }

  @js.native
  trait UpdateNotificationRuleRequest extends js.Object {
    var Arn: NotificationRuleArn
    var DetailType: js.UndefOr[DetailType]
    var EventTypeIds: js.UndefOr[EventTypeIds]
    var Name: js.UndefOr[NotificationRuleName]
    var Status: js.UndefOr[NotificationRuleStatus]
    var Targets: js.UndefOr[Targets]
  }

  object UpdateNotificationRuleRequest {
    @inline
    def apply(
        Arn: NotificationRuleArn,
        DetailType: js.UndefOr[DetailType] = js.undefined,
        EventTypeIds: js.UndefOr[EventTypeIds] = js.undefined,
        Name: js.UndefOr[NotificationRuleName] = js.undefined,
        Status: js.UndefOr[NotificationRuleStatus] = js.undefined,
        Targets: js.UndefOr[Targets] = js.undefined
    ): UpdateNotificationRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      DetailType.foreach(__v => __obj.updateDynamic("DetailType")(__v.asInstanceOf[js.Any]))
      EventTypeIds.foreach(__v => __obj.updateDynamic("EventTypeIds")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNotificationRuleRequest]
    }
  }

  @js.native
  trait UpdateNotificationRuleResult extends js.Object {}

  object UpdateNotificationRuleResult {
    @inline
    def apply(
    ): UpdateNotificationRuleResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateNotificationRuleResult]
    }
  }
}
