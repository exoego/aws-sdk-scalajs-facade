package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object ssmincidents {
  type ActionsList = js.Array[Action]
  type Arn = String
  type AutomationExecutionSet = js.Array[AutomationExecution]
  type ChatbotSnsConfigurationSet = js.Array[SnsArn]
  type ClientToken = String
  type DedupeString = String
  type EngagementSet = js.Array[SsmContactsArn]
  type EventData = String
  type EventSummaryList = js.Array[EventSummary]
  type FilterKeyString = String
  type FilterList = js.Array[Filter]
  type Impact = Int
  type IncidentRecordSummaryList = js.Array[IncidentRecordSummary]
  type IncidentSource = String
  type IncidentSummary = String
  type IncidentTitle = String
  type IntegerList = js.Array[Int]
  type MaxResults = Int
  type MetricDefinition = String
  type NextToken = String
  type NotificationTargetSet = js.Array[NotificationTargetItem]
  type Policy = String
  type PolicyId = String
  type RawData = String
  type RegionInfoMap = js.Dictionary[RegionInfo]
  type RegionMapInput = js.Dictionary[RegionMapInputValue]
  type RegionName = String
  type RelatedItemList = js.Array[RelatedItem]
  type RelatedItemTitleString = String
  type ReplicationSetArnList = js.Array[Arn]
  type ResourcePolicyList = js.Array[ResourcePolicy]
  type ResponsePlanDisplayName = String
  type ResponsePlanName = String
  type ResponsePlanSummaryList = js.Array[ResponsePlanSummary]
  type RoleArn = String
  type SnsArn = String
  type SseKmsKey = String
  type SsmAutomationDocumentNameString = String
  type SsmAutomationDocumentVersionString = String
  type SsmContactsArn = String
  type SsmParameterValues = js.Array[SsmParameterValuesMemberString]
  type SsmParameterValuesMemberString = String
  type SsmParameters = js.Dictionary[SsmParameterValues]
  type SsmParametersKeyString = String
  type StringList = js.Array[StringListMemberString]
  type StringListMemberString = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type TimelineEventType = String
  type Timestamp = js.Date
  type UUID = String
  type UpdateReplicationSetInputActionsList = js.Array[UpdateReplicationSetAction]
  type Url = String

  final class SSMIncidentsOps(private val service: SSMIncidents) extends AnyVal {

    @inline def createReplicationSetFuture(params: CreateReplicationSetInput): Future[CreateReplicationSetOutput] = service.createReplicationSet(params).promise().toFuture
    @inline def createResponsePlanFuture(params: CreateResponsePlanInput): Future[CreateResponsePlanOutput] = service.createResponsePlan(params).promise().toFuture
    @inline def createTimelineEventFuture(params: CreateTimelineEventInput): Future[CreateTimelineEventOutput] = service.createTimelineEvent(params).promise().toFuture
    @inline def deleteIncidentRecordFuture(params: DeleteIncidentRecordInput): Future[DeleteIncidentRecordOutput] = service.deleteIncidentRecord(params).promise().toFuture
    @inline def deleteReplicationSetFuture(params: DeleteReplicationSetInput): Future[DeleteReplicationSetOutput] = service.deleteReplicationSet(params).promise().toFuture
    @inline def deleteResourcePolicyFuture(params: DeleteResourcePolicyInput): Future[DeleteResourcePolicyOutput] = service.deleteResourcePolicy(params).promise().toFuture
    @inline def deleteResponsePlanFuture(params: DeleteResponsePlanInput): Future[DeleteResponsePlanOutput] = service.deleteResponsePlan(params).promise().toFuture
    @inline def deleteTimelineEventFuture(params: DeleteTimelineEventInput): Future[DeleteTimelineEventOutput] = service.deleteTimelineEvent(params).promise().toFuture
    @inline def getIncidentRecordFuture(params: GetIncidentRecordInput): Future[GetIncidentRecordOutput] = service.getIncidentRecord(params).promise().toFuture
    @inline def getReplicationSetFuture(params: GetReplicationSetInput): Future[GetReplicationSetOutput] = service.getReplicationSet(params).promise().toFuture
    @inline def getResourcePoliciesFuture(params: GetResourcePoliciesInput): Future[GetResourcePoliciesOutput] = service.getResourcePolicies(params).promise().toFuture
    @inline def getResponsePlanFuture(params: GetResponsePlanInput): Future[GetResponsePlanOutput] = service.getResponsePlan(params).promise().toFuture
    @inline def getTimelineEventFuture(params: GetTimelineEventInput): Future[GetTimelineEventOutput] = service.getTimelineEvent(params).promise().toFuture
    @inline def listIncidentRecordsFuture(params: ListIncidentRecordsInput): Future[ListIncidentRecordsOutput] = service.listIncidentRecords(params).promise().toFuture
    @inline def listRelatedItemsFuture(params: ListRelatedItemsInput): Future[ListRelatedItemsOutput] = service.listRelatedItems(params).promise().toFuture
    @inline def listReplicationSetsFuture(params: ListReplicationSetsInput): Future[ListReplicationSetsOutput] = service.listReplicationSets(params).promise().toFuture
    @inline def listResponsePlansFuture(params: ListResponsePlansInput): Future[ListResponsePlansOutput] = service.listResponsePlans(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listTimelineEventsFuture(params: ListTimelineEventsInput): Future[ListTimelineEventsOutput] = service.listTimelineEvents(params).promise().toFuture
    @inline def putResourcePolicyFuture(params: PutResourcePolicyInput): Future[PutResourcePolicyOutput] = service.putResourcePolicy(params).promise().toFuture
    @inline def startIncidentFuture(params: StartIncidentInput): Future[StartIncidentOutput] = service.startIncident(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateDeletionProtectionFuture(params: UpdateDeletionProtectionInput): Future[UpdateDeletionProtectionOutput] = service.updateDeletionProtection(params).promise().toFuture
    @inline def updateIncidentRecordFuture(params: UpdateIncidentRecordInput): Future[UpdateIncidentRecordOutput] = service.updateIncidentRecord(params).promise().toFuture
    @inline def updateRelatedItemsFuture(params: UpdateRelatedItemsInput): Future[UpdateRelatedItemsOutput] = service.updateRelatedItems(params).promise().toFuture
    @inline def updateReplicationSetFuture(params: UpdateReplicationSetInput): Future[UpdateReplicationSetOutput] = service.updateReplicationSet(params).promise().toFuture
    @inline def updateResponsePlanFuture(params: UpdateResponsePlanInput): Future[UpdateResponsePlanOutput] = service.updateResponsePlan(params).promise().toFuture
    @inline def updateTimelineEventFuture(params: UpdateTimelineEventInput): Future[UpdateTimelineEventOutput] = service.updateTimelineEvent(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/ssmincidents", JSImport.Namespace, "AWS.SSMIncidents")
  class SSMIncidents() extends js.Object {
    def this(config: AWSConfig) = this()

    def createReplicationSet(params: CreateReplicationSetInput): Request[CreateReplicationSetOutput] = js.native
    def createResponsePlan(params: CreateResponsePlanInput): Request[CreateResponsePlanOutput] = js.native
    def createTimelineEvent(params: CreateTimelineEventInput): Request[CreateTimelineEventOutput] = js.native
    def deleteIncidentRecord(params: DeleteIncidentRecordInput): Request[DeleteIncidentRecordOutput] = js.native
    def deleteReplicationSet(params: DeleteReplicationSetInput): Request[DeleteReplicationSetOutput] = js.native
    def deleteResourcePolicy(params: DeleteResourcePolicyInput): Request[DeleteResourcePolicyOutput] = js.native
    def deleteResponsePlan(params: DeleteResponsePlanInput): Request[DeleteResponsePlanOutput] = js.native
    def deleteTimelineEvent(params: DeleteTimelineEventInput): Request[DeleteTimelineEventOutput] = js.native
    def getIncidentRecord(params: GetIncidentRecordInput): Request[GetIncidentRecordOutput] = js.native
    def getReplicationSet(params: GetReplicationSetInput): Request[GetReplicationSetOutput] = js.native
    def getResourcePolicies(params: GetResourcePoliciesInput): Request[GetResourcePoliciesOutput] = js.native
    def getResponsePlan(params: GetResponsePlanInput): Request[GetResponsePlanOutput] = js.native
    def getTimelineEvent(params: GetTimelineEventInput): Request[GetTimelineEventOutput] = js.native
    def listIncidentRecords(params: ListIncidentRecordsInput): Request[ListIncidentRecordsOutput] = js.native
    def listRelatedItems(params: ListRelatedItemsInput): Request[ListRelatedItemsOutput] = js.native
    def listReplicationSets(params: ListReplicationSetsInput): Request[ListReplicationSetsOutput] = js.native
    def listResponsePlans(params: ListResponsePlansInput): Request[ListResponsePlansOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTimelineEvents(params: ListTimelineEventsInput): Request[ListTimelineEventsOutput] = js.native
    def putResourcePolicy(params: PutResourcePolicyInput): Request[PutResourcePolicyOutput] = js.native
    def startIncident(params: StartIncidentInput): Request[StartIncidentOutput] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateDeletionProtection(params: UpdateDeletionProtectionInput): Request[UpdateDeletionProtectionOutput] = js.native
    def updateIncidentRecord(params: UpdateIncidentRecordInput): Request[UpdateIncidentRecordOutput] = js.native
    def updateRelatedItems(params: UpdateRelatedItemsInput): Request[UpdateRelatedItemsOutput] = js.native
    def updateReplicationSet(params: UpdateReplicationSetInput): Request[UpdateReplicationSetOutput] = js.native
    def updateResponsePlan(params: UpdateResponsePlanInput): Request[UpdateResponsePlanOutput] = js.native
    def updateTimelineEvent(params: UpdateTimelineEventInput): Request[UpdateTimelineEventOutput] = js.native
  }
  object SSMIncidents {
    @inline implicit def toOps(service: SSMIncidents): SSMIncidentsOps = {
      new SSMIncidentsOps(service)
    }
  }

  /** The action that starts at the beginning of an incident. The response plan defines the action.
    */
  @js.native
  trait Action extends js.Object {
    var ssmAutomation: js.UndefOr[SsmAutomation]
  }

  object Action {
    @inline
    def apply(
        ssmAutomation: js.UndefOr[SsmAutomation] = js.undefined
    ): Action = {
      val __obj = js.Dynamic.literal()
      ssmAutomation.foreach(__v => __obj.updateDynamic("ssmAutomation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Action]
    }
  }

  /** Defines the Amazon Web Services Region and KMS key to add to the replication set.
    */
  @js.native
  trait AddRegionAction extends js.Object {
    var regionName: RegionName
    var sseKmsKeyId: js.UndefOr[SseKmsKey]
  }

  object AddRegionAction {
    @inline
    def apply(
        regionName: RegionName,
        sseKmsKeyId: js.UndefOr[SseKmsKey] = js.undefined
    ): AddRegionAction = {
      val __obj = js.Dynamic.literal(
        "regionName" -> regionName.asInstanceOf[js.Any]
      )

      sseKmsKeyId.foreach(__v => __obj.updateDynamic("sseKmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddRegionAction]
    }
  }

  /** Use the AttributeValueList to filter by string or integer values.
    */
  @js.native
  trait AttributeValueList extends js.Object {
    var integerValues: js.UndefOr[IntegerList]
    var stringValues: js.UndefOr[StringList]
  }

  object AttributeValueList {
    @inline
    def apply(
        integerValues: js.UndefOr[IntegerList] = js.undefined,
        stringValues: js.UndefOr[StringList] = js.undefined
    ): AttributeValueList = {
      val __obj = js.Dynamic.literal()
      integerValues.foreach(__v => __obj.updateDynamic("integerValues")(__v.asInstanceOf[js.Any]))
      stringValues.foreach(__v => __obj.updateDynamic("stringValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttributeValueList]
    }
  }

  /** The Systems Manager automation document process to start as the runbook at the beginning of the incident.
    */
  @js.native
  trait AutomationExecution extends js.Object {
    var ssmExecutionArn: js.UndefOr[Arn]
  }

  object AutomationExecution {
    @inline
    def apply(
        ssmExecutionArn: js.UndefOr[Arn] = js.undefined
    ): AutomationExecution = {
      val __obj = js.Dynamic.literal()
      ssmExecutionArn.foreach(__v => __obj.updateDynamic("ssmExecutionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutomationExecution]
    }
  }

  /** The Chatbot chat channel used for collaboration during an incident.
    */
  @js.native
  trait ChatChannel extends js.Object {
    var chatbotSns: js.UndefOr[ChatbotSnsConfigurationSet]
    var empty: js.UndefOr[EmptyChatChannel]
  }

  object ChatChannel {
    @inline
    def apply(
        chatbotSns: js.UndefOr[ChatbotSnsConfigurationSet] = js.undefined,
        empty: js.UndefOr[EmptyChatChannel] = js.undefined
    ): ChatChannel = {
      val __obj = js.Dynamic.literal()
      chatbotSns.foreach(__v => __obj.updateDynamic("chatbotSns")(__v.asInstanceOf[js.Any]))
      empty.foreach(__v => __obj.updateDynamic("empty")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChatChannel]
    }
  }

  /** A conditional statement with which to compare a value, after a timestamp, before a timestamp, or equal to a string or integer. If multiple conditions are specified, the conditionals become an <code>AND</code>ed statement. If multiple values are specified for a conditional, the values are <code>OR</code>d.
    */
  @js.native
  trait Condition extends js.Object {
    var after: js.UndefOr[Timestamp]
    var before: js.UndefOr[Timestamp]
    var equals: js.UndefOr[AttributeValueList]
  }

  object Condition {
    @inline
    def apply(
        after: js.UndefOr[Timestamp] = js.undefined,
        before: js.UndefOr[Timestamp] = js.undefined,
        equals: js.UndefOr[AttributeValueList] = js.undefined
    ): Condition = {
      val __obj = js.Dynamic.literal()
      after.foreach(__v => __obj.updateDynamic("after")(__v.asInstanceOf[js.Any]))
      before.foreach(__v => __obj.updateDynamic("before")(__v.asInstanceOf[js.Any]))
      equals.foreach(__v => __obj.updateDynamic("equals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Condition]
    }
  }

  @js.native
  trait CreateReplicationSetInput extends js.Object {
    var regions: RegionMapInput
    var clientToken: js.UndefOr[ClientToken]
  }

  object CreateReplicationSetInput {
    @inline
    def apply(
        regions: RegionMapInput,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): CreateReplicationSetInput = {
      val __obj = js.Dynamic.literal(
        "regions" -> regions.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReplicationSetInput]
    }
  }

  @js.native
  trait CreateReplicationSetOutput extends js.Object {
    var arn: Arn
  }

  object CreateReplicationSetOutput {
    @inline
    def apply(
        arn: Arn
    ): CreateReplicationSetOutput = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateReplicationSetOutput]
    }
  }

  @js.native
  trait CreateResponsePlanInput extends js.Object {
    var incidentTemplate: IncidentTemplate
    var name: ResponsePlanName
    var actions: js.UndefOr[ActionsList]
    var chatChannel: js.UndefOr[ChatChannel]
    var clientToken: js.UndefOr[ClientToken]
    var displayName: js.UndefOr[ResponsePlanDisplayName]
    var engagements: js.UndefOr[EngagementSet]
    var tags: js.UndefOr[TagMap]
  }

  object CreateResponsePlanInput {
    @inline
    def apply(
        incidentTemplate: IncidentTemplate,
        name: ResponsePlanName,
        actions: js.UndefOr[ActionsList] = js.undefined,
        chatChannel: js.UndefOr[ChatChannel] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        displayName: js.UndefOr[ResponsePlanDisplayName] = js.undefined,
        engagements: js.UndefOr[EngagementSet] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateResponsePlanInput = {
      val __obj = js.Dynamic.literal(
        "incidentTemplate" -> incidentTemplate.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      actions.foreach(__v => __obj.updateDynamic("actions")(__v.asInstanceOf[js.Any]))
      chatChannel.foreach(__v => __obj.updateDynamic("chatChannel")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      engagements.foreach(__v => __obj.updateDynamic("engagements")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResponsePlanInput]
    }
  }

  @js.native
  trait CreateResponsePlanOutput extends js.Object {
    var arn: Arn
  }

  object CreateResponsePlanOutput {
    @inline
    def apply(
        arn: Arn
    ): CreateResponsePlanOutput = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateResponsePlanOutput]
    }
  }

  @js.native
  trait CreateTimelineEventInput extends js.Object {
    var eventData: EventData
    var eventTime: Timestamp
    var eventType: TimelineEventType
    var incidentRecordArn: Arn
    var clientToken: js.UndefOr[ClientToken]
  }

  object CreateTimelineEventInput {
    @inline
    def apply(
        eventData: EventData,
        eventTime: Timestamp,
        eventType: TimelineEventType,
        incidentRecordArn: Arn,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): CreateTimelineEventInput = {
      val __obj = js.Dynamic.literal(
        "eventData" -> eventData.asInstanceOf[js.Any],
        "eventTime" -> eventTime.asInstanceOf[js.Any],
        "eventType" -> eventType.asInstanceOf[js.Any],
        "incidentRecordArn" -> incidentRecordArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTimelineEventInput]
    }
  }

  @js.native
  trait CreateTimelineEventOutput extends js.Object {
    var eventId: UUID
    var incidentRecordArn: Arn
  }

  object CreateTimelineEventOutput {
    @inline
    def apply(
        eventId: UUID,
        incidentRecordArn: Arn
    ): CreateTimelineEventOutput = {
      val __obj = js.Dynamic.literal(
        "eventId" -> eventId.asInstanceOf[js.Any],
        "incidentRecordArn" -> incidentRecordArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateTimelineEventOutput]
    }
  }

  @js.native
  trait DeleteIncidentRecordInput extends js.Object {
    var arn: Arn
  }

  object DeleteIncidentRecordInput {
    @inline
    def apply(
        arn: Arn
    ): DeleteIncidentRecordInput = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteIncidentRecordInput]
    }
  }

  @js.native
  trait DeleteIncidentRecordOutput extends js.Object

  object DeleteIncidentRecordOutput {
    @inline
    def apply(): DeleteIncidentRecordOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteIncidentRecordOutput]
    }
  }

  /** Defines the information about the Amazon Web Services Region you're deleting from your replication set.
    */
  @js.native
  trait DeleteRegionAction extends js.Object {
    var regionName: RegionName
  }

  object DeleteRegionAction {
    @inline
    def apply(
        regionName: RegionName
    ): DeleteRegionAction = {
      val __obj = js.Dynamic.literal(
        "regionName" -> regionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRegionAction]
    }
  }

  @js.native
  trait DeleteReplicationSetInput extends js.Object {
    var arn: Arn
  }

  object DeleteReplicationSetInput {
    @inline
    def apply(
        arn: Arn
    ): DeleteReplicationSetInput = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteReplicationSetInput]
    }
  }

  @js.native
  trait DeleteReplicationSetOutput extends js.Object

  object DeleteReplicationSetOutput {
    @inline
    def apply(): DeleteReplicationSetOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteReplicationSetOutput]
    }
  }

  @js.native
  trait DeleteResourcePolicyInput extends js.Object {
    var policyId: PolicyId
    var resourceArn: Arn
  }

  object DeleteResourcePolicyInput {
    @inline
    def apply(
        policyId: PolicyId,
        resourceArn: Arn
    ): DeleteResourcePolicyInput = {
      val __obj = js.Dynamic.literal(
        "policyId" -> policyId.asInstanceOf[js.Any],
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteResourcePolicyInput]
    }
  }

  @js.native
  trait DeleteResourcePolicyOutput extends js.Object

  object DeleteResourcePolicyOutput {
    @inline
    def apply(): DeleteResourcePolicyOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteResourcePolicyOutput]
    }
  }

  @js.native
  trait DeleteResponsePlanInput extends js.Object {
    var arn: Arn
  }

  object DeleteResponsePlanInput {
    @inline
    def apply(
        arn: Arn
    ): DeleteResponsePlanInput = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteResponsePlanInput]
    }
  }

  @js.native
  trait DeleteResponsePlanOutput extends js.Object

  object DeleteResponsePlanOutput {
    @inline
    def apply(): DeleteResponsePlanOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteResponsePlanOutput]
    }
  }

  @js.native
  trait DeleteTimelineEventInput extends js.Object {
    var eventId: UUID
    var incidentRecordArn: Arn
  }

  object DeleteTimelineEventInput {
    @inline
    def apply(
        eventId: UUID,
        incidentRecordArn: Arn
    ): DeleteTimelineEventInput = {
      val __obj = js.Dynamic.literal(
        "eventId" -> eventId.asInstanceOf[js.Any],
        "incidentRecordArn" -> incidentRecordArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteTimelineEventInput]
    }
  }

  @js.native
  trait DeleteTimelineEventOutput extends js.Object

  object DeleteTimelineEventOutput {
    @inline
    def apply(): DeleteTimelineEventOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteTimelineEventOutput]
    }
  }

  /** Used to remove the chat channel from an incident record or response plan.
    */
  @js.native
  trait EmptyChatChannel extends js.Object

  object EmptyChatChannel {
    @inline
    def apply(): EmptyChatChannel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmptyChatChannel]
    }
  }

  /** Details about a timeline event during an incident.
    */
  @js.native
  trait EventSummary extends js.Object {
    var eventId: UUID
    var eventTime: Timestamp
    var eventType: TimelineEventType
    var eventUpdatedTime: Timestamp
    var incidentRecordArn: Arn
  }

  object EventSummary {
    @inline
    def apply(
        eventId: UUID,
        eventTime: Timestamp,
        eventType: TimelineEventType,
        eventUpdatedTime: Timestamp,
        incidentRecordArn: Arn
    ): EventSummary = {
      val __obj = js.Dynamic.literal(
        "eventId" -> eventId.asInstanceOf[js.Any],
        "eventTime" -> eventTime.asInstanceOf[js.Any],
        "eventType" -> eventType.asInstanceOf[js.Any],
        "eventUpdatedTime" -> eventUpdatedTime.asInstanceOf[js.Any],
        "incidentRecordArn" -> incidentRecordArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EventSummary]
    }
  }

  /** Filter the selection by using a condition.
    */
  @js.native
  trait Filter extends js.Object {
    var condition: Condition
    var key: FilterKeyString
  }

  object Filter {
    @inline
    def apply(
        condition: Condition,
        key: FilterKeyString
    ): Filter = {
      val __obj = js.Dynamic.literal(
        "condition" -> condition.asInstanceOf[js.Any],
        "key" -> key.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Filter]
    }
  }

  @js.native
  trait GetIncidentRecordInput extends js.Object {
    var arn: Arn
  }

  object GetIncidentRecordInput {
    @inline
    def apply(
        arn: Arn
    ): GetIncidentRecordInput = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetIncidentRecordInput]
    }
  }

  @js.native
  trait GetIncidentRecordOutput extends js.Object {
    var incidentRecord: IncidentRecord
  }

  object GetIncidentRecordOutput {
    @inline
    def apply(
        incidentRecord: IncidentRecord
    ): GetIncidentRecordOutput = {
      val __obj = js.Dynamic.literal(
        "incidentRecord" -> incidentRecord.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetIncidentRecordOutput]
    }
  }

  @js.native
  trait GetReplicationSetInput extends js.Object {
    var arn: Arn
  }

  object GetReplicationSetInput {
    @inline
    def apply(
        arn: Arn
    ): GetReplicationSetInput = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetReplicationSetInput]
    }
  }

  @js.native
  trait GetReplicationSetOutput extends js.Object {
    var replicationSet: ReplicationSet
  }

  object GetReplicationSetOutput {
    @inline
    def apply(
        replicationSet: ReplicationSet
    ): GetReplicationSetOutput = {
      val __obj = js.Dynamic.literal(
        "replicationSet" -> replicationSet.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetReplicationSetOutput]
    }
  }

  @js.native
  trait GetResourcePoliciesInput extends js.Object {
    var resourceArn: Arn
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetResourcePoliciesInput {
    @inline
    def apply(
        resourceArn: Arn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetResourcePoliciesInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcePoliciesInput]
    }
  }

  @js.native
  trait GetResourcePoliciesOutput extends js.Object {
    var resourcePolicies: ResourcePolicyList
    var nextToken: js.UndefOr[NextToken]
  }

  object GetResourcePoliciesOutput {
    @inline
    def apply(
        resourcePolicies: ResourcePolicyList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetResourcePoliciesOutput = {
      val __obj = js.Dynamic.literal(
        "resourcePolicies" -> resourcePolicies.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcePoliciesOutput]
    }
  }

  @js.native
  trait GetResponsePlanInput extends js.Object {
    var arn: Arn
  }

  object GetResponsePlanInput {
    @inline
    def apply(
        arn: Arn
    ): GetResponsePlanInput = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetResponsePlanInput]
    }
  }

  @js.native
  trait GetResponsePlanOutput extends js.Object {
    var arn: Arn
    var incidentTemplate: IncidentTemplate
    var name: ResponsePlanName
    var actions: js.UndefOr[ActionsList]
    var chatChannel: js.UndefOr[ChatChannel]
    var displayName: js.UndefOr[ResponsePlanDisplayName]
    var engagements: js.UndefOr[EngagementSet]
  }

  object GetResponsePlanOutput {
    @inline
    def apply(
        arn: Arn,
        incidentTemplate: IncidentTemplate,
        name: ResponsePlanName,
        actions: js.UndefOr[ActionsList] = js.undefined,
        chatChannel: js.UndefOr[ChatChannel] = js.undefined,
        displayName: js.UndefOr[ResponsePlanDisplayName] = js.undefined,
        engagements: js.UndefOr[EngagementSet] = js.undefined
    ): GetResponsePlanOutput = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "incidentTemplate" -> incidentTemplate.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      actions.foreach(__v => __obj.updateDynamic("actions")(__v.asInstanceOf[js.Any]))
      chatChannel.foreach(__v => __obj.updateDynamic("chatChannel")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      engagements.foreach(__v => __obj.updateDynamic("engagements")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResponsePlanOutput]
    }
  }

  @js.native
  trait GetTimelineEventInput extends js.Object {
    var eventId: UUID
    var incidentRecordArn: Arn
  }

  object GetTimelineEventInput {
    @inline
    def apply(
        eventId: UUID,
        incidentRecordArn: Arn
    ): GetTimelineEventInput = {
      val __obj = js.Dynamic.literal(
        "eventId" -> eventId.asInstanceOf[js.Any],
        "incidentRecordArn" -> incidentRecordArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTimelineEventInput]
    }
  }

  @js.native
  trait GetTimelineEventOutput extends js.Object {
    var event: TimelineEvent
  }

  object GetTimelineEventOutput {
    @inline
    def apply(
        event: TimelineEvent
    ): GetTimelineEventOutput = {
      val __obj = js.Dynamic.literal(
        "event" -> event.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTimelineEventOutput]
    }
  }

  /** The record of the incident that's created when an incident occurs.
    */
  @js.native
  trait IncidentRecord extends js.Object {
    var arn: Arn
    var creationTime: Timestamp
    var dedupeString: DedupeString
    var impact: Impact
    var incidentRecordSource: IncidentRecordSource
    var lastModifiedBy: Arn
    var lastModifiedTime: Timestamp
    var status: IncidentRecordStatus
    var title: IncidentTitle
    var automationExecutions: js.UndefOr[AutomationExecutionSet]
    var chatChannel: js.UndefOr[ChatChannel]
    var notificationTargets: js.UndefOr[NotificationTargetSet]
    var resolvedTime: js.UndefOr[Timestamp]
    var summary: js.UndefOr[IncidentSummary]
  }

  object IncidentRecord {
    @inline
    def apply(
        arn: Arn,
        creationTime: Timestamp,
        dedupeString: DedupeString,
        impact: Impact,
        incidentRecordSource: IncidentRecordSource,
        lastModifiedBy: Arn,
        lastModifiedTime: Timestamp,
        status: IncidentRecordStatus,
        title: IncidentTitle,
        automationExecutions: js.UndefOr[AutomationExecutionSet] = js.undefined,
        chatChannel: js.UndefOr[ChatChannel] = js.undefined,
        notificationTargets: js.UndefOr[NotificationTargetSet] = js.undefined,
        resolvedTime: js.UndefOr[Timestamp] = js.undefined,
        summary: js.UndefOr[IncidentSummary] = js.undefined
    ): IncidentRecord = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "dedupeString" -> dedupeString.asInstanceOf[js.Any],
        "impact" -> impact.asInstanceOf[js.Any],
        "incidentRecordSource" -> incidentRecordSource.asInstanceOf[js.Any],
        "lastModifiedBy" -> lastModifiedBy.asInstanceOf[js.Any],
        "lastModifiedTime" -> lastModifiedTime.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "title" -> title.asInstanceOf[js.Any]
      )

      automationExecutions.foreach(__v => __obj.updateDynamic("automationExecutions")(__v.asInstanceOf[js.Any]))
      chatChannel.foreach(__v => __obj.updateDynamic("chatChannel")(__v.asInstanceOf[js.Any]))
      notificationTargets.foreach(__v => __obj.updateDynamic("notificationTargets")(__v.asInstanceOf[js.Any]))
      resolvedTime.foreach(__v => __obj.updateDynamic("resolvedTime")(__v.asInstanceOf[js.Any]))
      summary.foreach(__v => __obj.updateDynamic("summary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IncidentRecord]
    }
  }

  /** Details about what created the incident record and when it was created.
    */
  @js.native
  trait IncidentRecordSource extends js.Object {
    var createdBy: Arn
    var source: IncidentSource
    var invokedBy: js.UndefOr[Arn]
    var resourceArn: js.UndefOr[Arn]
  }

  object IncidentRecordSource {
    @inline
    def apply(
        createdBy: Arn,
        source: IncidentSource,
        invokedBy: js.UndefOr[Arn] = js.undefined,
        resourceArn: js.UndefOr[Arn] = js.undefined
    ): IncidentRecordSource = {
      val __obj = js.Dynamic.literal(
        "createdBy" -> createdBy.asInstanceOf[js.Any],
        "source" -> source.asInstanceOf[js.Any]
      )

      invokedBy.foreach(__v => __obj.updateDynamic("invokedBy")(__v.asInstanceOf[js.Any]))
      resourceArn.foreach(__v => __obj.updateDynamic("resourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IncidentRecordSource]
    }
  }

  /** Details describing an incident record.
    */
  @js.native
  trait IncidentRecordSummary extends js.Object {
    var arn: Arn
    var creationTime: Timestamp
    var impact: Impact
    var incidentRecordSource: IncidentRecordSource
    var status: IncidentRecordStatus
    var title: IncidentTitle
    var resolvedTime: js.UndefOr[Timestamp]
  }

  object IncidentRecordSummary {
    @inline
    def apply(
        arn: Arn,
        creationTime: Timestamp,
        impact: Impact,
        incidentRecordSource: IncidentRecordSource,
        status: IncidentRecordStatus,
        title: IncidentTitle,
        resolvedTime: js.UndefOr[Timestamp] = js.undefined
    ): IncidentRecordSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "impact" -> impact.asInstanceOf[js.Any],
        "incidentRecordSource" -> incidentRecordSource.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "title" -> title.asInstanceOf[js.Any]
      )

      resolvedTime.foreach(__v => __obj.updateDynamic("resolvedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IncidentRecordSummary]
    }
  }

  /** Basic details used in creating a response plan. The response plan is then used to create an incident record.
    */
  @js.native
  trait IncidentTemplate extends js.Object {
    var impact: Impact
    var title: IncidentTitle
    var dedupeString: js.UndefOr[DedupeString]
    var notificationTargets: js.UndefOr[NotificationTargetSet]
    var summary: js.UndefOr[IncidentSummary]
  }

  object IncidentTemplate {
    @inline
    def apply(
        impact: Impact,
        title: IncidentTitle,
        dedupeString: js.UndefOr[DedupeString] = js.undefined,
        notificationTargets: js.UndefOr[NotificationTargetSet] = js.undefined,
        summary: js.UndefOr[IncidentSummary] = js.undefined
    ): IncidentTemplate = {
      val __obj = js.Dynamic.literal(
        "impact" -> impact.asInstanceOf[js.Any],
        "title" -> title.asInstanceOf[js.Any]
      )

      dedupeString.foreach(__v => __obj.updateDynamic("dedupeString")(__v.asInstanceOf[js.Any]))
      notificationTargets.foreach(__v => __obj.updateDynamic("notificationTargets")(__v.asInstanceOf[js.Any]))
      summary.foreach(__v => __obj.updateDynamic("summary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IncidentTemplate]
    }
  }

  /** Details and type of a related item.
    */
  @js.native
  trait ItemIdentifier extends js.Object {
    var `type`: ItemType
    var value: ItemValue
  }

  object ItemIdentifier {
    @inline
    def apply(
        `type`: ItemType,
        value: ItemValue
    ): ItemIdentifier = {
      val __obj = js.Dynamic.literal(
        "type" -> `type`.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ItemIdentifier]
    }
  }

  /** Describes a related item.
    */
  @js.native
  trait ItemValue extends js.Object {
    var arn: js.UndefOr[Arn]
    var metricDefinition: js.UndefOr[MetricDefinition]
    var url: js.UndefOr[Url]
  }

  object ItemValue {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        metricDefinition: js.UndefOr[MetricDefinition] = js.undefined,
        url: js.UndefOr[Url] = js.undefined
    ): ItemValue = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      metricDefinition.foreach(__v => __obj.updateDynamic("metricDefinition")(__v.asInstanceOf[js.Any]))
      url.foreach(__v => __obj.updateDynamic("url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ItemValue]
    }
  }

  @js.native
  trait ListIncidentRecordsInput extends js.Object {
    var filters: js.UndefOr[FilterList]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListIncidentRecordsInput {
    @inline
    def apply(
        filters: js.UndefOr[FilterList] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIncidentRecordsInput = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIncidentRecordsInput]
    }
  }

  @js.native
  trait ListIncidentRecordsOutput extends js.Object {
    var incidentRecordSummaries: IncidentRecordSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListIncidentRecordsOutput {
    @inline
    def apply(
        incidentRecordSummaries: IncidentRecordSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIncidentRecordsOutput = {
      val __obj = js.Dynamic.literal(
        "incidentRecordSummaries" -> incidentRecordSummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIncidentRecordsOutput]
    }
  }

  @js.native
  trait ListRelatedItemsInput extends js.Object {
    var incidentRecordArn: Arn
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListRelatedItemsInput {
    @inline
    def apply(
        incidentRecordArn: Arn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRelatedItemsInput = {
      val __obj = js.Dynamic.literal(
        "incidentRecordArn" -> incidentRecordArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRelatedItemsInput]
    }
  }

  @js.native
  trait ListRelatedItemsOutput extends js.Object {
    var relatedItems: RelatedItemList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListRelatedItemsOutput {
    @inline
    def apply(
        relatedItems: RelatedItemList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRelatedItemsOutput = {
      val __obj = js.Dynamic.literal(
        "relatedItems" -> relatedItems.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRelatedItemsOutput]
    }
  }

  @js.native
  trait ListReplicationSetsInput extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListReplicationSetsInput {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListReplicationSetsInput = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReplicationSetsInput]
    }
  }

  @js.native
  trait ListReplicationSetsOutput extends js.Object {
    var replicationSetArns: ReplicationSetArnList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListReplicationSetsOutput {
    @inline
    def apply(
        replicationSetArns: ReplicationSetArnList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListReplicationSetsOutput = {
      val __obj = js.Dynamic.literal(
        "replicationSetArns" -> replicationSetArns.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReplicationSetsOutput]
    }
  }

  @js.native
  trait ListResponsePlansInput extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListResponsePlansInput {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListResponsePlansInput = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResponsePlansInput]
    }
  }

  @js.native
  trait ListResponsePlansOutput extends js.Object {
    var responsePlanSummaries: ResponsePlanSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListResponsePlansOutput {
    @inline
    def apply(
        responsePlanSummaries: ResponsePlanSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListResponsePlansOutput = {
      val __obj = js.Dynamic.literal(
        "responsePlanSummaries" -> responsePlanSummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResponsePlansOutput]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: String
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: String
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: TagMap
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: TagMap
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal(
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListTimelineEventsInput extends js.Object {
    var incidentRecordArn: Arn
    var filters: js.UndefOr[FilterList]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var sortBy: js.UndefOr[TimelineEventSort]
    var sortOrder: js.UndefOr[SortOrder]
  }

  object ListTimelineEventsInput {
    @inline
    def apply(
        incidentRecordArn: Arn,
        filters: js.UndefOr[FilterList] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        sortBy: js.UndefOr[TimelineEventSort] = js.undefined,
        sortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListTimelineEventsInput = {
      val __obj = js.Dynamic.literal(
        "incidentRecordArn" -> incidentRecordArn.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTimelineEventsInput]
    }
  }

  @js.native
  trait ListTimelineEventsOutput extends js.Object {
    var eventSummaries: EventSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTimelineEventsOutput {
    @inline
    def apply(
        eventSummaries: EventSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTimelineEventsOutput = {
      val __obj = js.Dynamic.literal(
        "eventSummaries" -> eventSummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTimelineEventsOutput]
    }
  }

  /** The SNS targets that are notified when updates are made to an incident.
    */
  @js.native
  trait NotificationTargetItem extends js.Object {
    var snsTopicArn: js.UndefOr[Arn]
  }

  object NotificationTargetItem {
    @inline
    def apply(
        snsTopicArn: js.UndefOr[Arn] = js.undefined
    ): NotificationTargetItem = {
      val __obj = js.Dynamic.literal()
      snsTopicArn.foreach(__v => __obj.updateDynamic("snsTopicArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotificationTargetItem]
    }
  }

  @js.native
  trait PutResourcePolicyInput extends js.Object {
    var policy: Policy
    var resourceArn: Arn
  }

  object PutResourcePolicyInput {
    @inline
    def apply(
        policy: Policy,
        resourceArn: Arn
    ): PutResourcePolicyInput = {
      val __obj = js.Dynamic.literal(
        "policy" -> policy.asInstanceOf[js.Any],
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutResourcePolicyInput]
    }
  }

  @js.native
  trait PutResourcePolicyOutput extends js.Object {
    var policyId: PolicyId
  }

  object PutResourcePolicyOutput {
    @inline
    def apply(
        policyId: PolicyId
    ): PutResourcePolicyOutput = {
      val __obj = js.Dynamic.literal(
        "policyId" -> policyId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutResourcePolicyOutput]
    }
  }

  /** Information about a Amazon Web Services Region in your replication set.
    */
  @js.native
  trait RegionInfo extends js.Object {
    var status: RegionStatus
    var statusUpdateDateTime: Timestamp
    var sseKmsKeyId: js.UndefOr[SseKmsKey]
    var statusMessage: js.UndefOr[String]
  }

  object RegionInfo {
    @inline
    def apply(
        status: RegionStatus,
        statusUpdateDateTime: Timestamp,
        sseKmsKeyId: js.UndefOr[SseKmsKey] = js.undefined,
        statusMessage: js.UndefOr[String] = js.undefined
    ): RegionInfo = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any],
        "statusUpdateDateTime" -> statusUpdateDateTime.asInstanceOf[js.Any]
      )

      sseKmsKeyId.foreach(__v => __obj.updateDynamic("sseKmsKeyId")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegionInfo]
    }
  }

  /** The mapping between a Amazon Web Services Region and the key that's used to encrypt the data.
    */
  @js.native
  trait RegionMapInputValue extends js.Object {
    var sseKmsKeyId: js.UndefOr[SseKmsKey]
  }

  object RegionMapInputValue {
    @inline
    def apply(
        sseKmsKeyId: js.UndefOr[SseKmsKey] = js.undefined
    ): RegionMapInputValue = {
      val __obj = js.Dynamic.literal()
      sseKmsKeyId.foreach(__v => __obj.updateDynamic("sseKmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegionMapInputValue]
    }
  }

  /** Resources that responders use to triage and mitigate the incident.
    */
  @js.native
  trait RelatedItem extends js.Object {
    var identifier: ItemIdentifier
    var title: js.UndefOr[RelatedItemTitleString]
  }

  object RelatedItem {
    @inline
    def apply(
        identifier: ItemIdentifier,
        title: js.UndefOr[RelatedItemTitleString] = js.undefined
    ): RelatedItem = {
      val __obj = js.Dynamic.literal(
        "identifier" -> identifier.asInstanceOf[js.Any]
      )

      title.foreach(__v => __obj.updateDynamic("title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RelatedItem]
    }
  }

  /** Details about the related item you're adding.
    */
  @js.native
  trait RelatedItemsUpdate extends js.Object {
    var itemToAdd: js.UndefOr[RelatedItem]
    var itemToRemove: js.UndefOr[ItemIdentifier]
  }

  object RelatedItemsUpdate {
    @inline
    def apply(
        itemToAdd: js.UndefOr[RelatedItem] = js.undefined,
        itemToRemove: js.UndefOr[ItemIdentifier] = js.undefined
    ): RelatedItemsUpdate = {
      val __obj = js.Dynamic.literal()
      itemToAdd.foreach(__v => __obj.updateDynamic("itemToAdd")(__v.asInstanceOf[js.Any]))
      itemToRemove.foreach(__v => __obj.updateDynamic("itemToRemove")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RelatedItemsUpdate]
    }
  }

  /** The set of Amazon Web Services Region that your Incident Manager data will be replicated to and the KMS key used to encrypt the data.
    */
  @js.native
  trait ReplicationSet extends js.Object {
    var createdBy: Arn
    var createdTime: Timestamp
    var deletionProtected: Boolean
    var lastModifiedBy: Arn
    var lastModifiedTime: Timestamp
    var regionMap: RegionInfoMap
    var status: ReplicationSetStatus
    var arn: js.UndefOr[Arn]
  }

  object ReplicationSet {
    @inline
    def apply(
        createdBy: Arn,
        createdTime: Timestamp,
        deletionProtected: Boolean,
        lastModifiedBy: Arn,
        lastModifiedTime: Timestamp,
        regionMap: RegionInfoMap,
        status: ReplicationSetStatus,
        arn: js.UndefOr[Arn] = js.undefined
    ): ReplicationSet = {
      val __obj = js.Dynamic.literal(
        "createdBy" -> createdBy.asInstanceOf[js.Any],
        "createdTime" -> createdTime.asInstanceOf[js.Any],
        "deletionProtected" -> deletionProtected.asInstanceOf[js.Any],
        "lastModifiedBy" -> lastModifiedBy.asInstanceOf[js.Any],
        "lastModifiedTime" -> lastModifiedTime.asInstanceOf[js.Any],
        "regionMap" -> regionMap.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationSet]
    }
  }

  /** The resource policy that allows Incident Manager to perform actions on resources on your behalf.
    */
  @js.native
  trait ResourcePolicy extends js.Object {
    var policyDocument: Policy
    var policyId: PolicyId
    var ramResourceShareRegion: String
  }

  object ResourcePolicy {
    @inline
    def apply(
        policyDocument: Policy,
        policyId: PolicyId,
        ramResourceShareRegion: String
    ): ResourcePolicy = {
      val __obj = js.Dynamic.literal(
        "policyDocument" -> policyDocument.asInstanceOf[js.Any],
        "policyId" -> policyId.asInstanceOf[js.Any],
        "ramResourceShareRegion" -> ramResourceShareRegion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResourcePolicy]
    }
  }

  /** Details of the response plan that are used when creating an incident.
    */
  @js.native
  trait ResponsePlanSummary extends js.Object {
    var arn: Arn
    var name: ResponsePlanName
    var displayName: js.UndefOr[ResponsePlanDisplayName]
  }

  object ResponsePlanSummary {
    @inline
    def apply(
        arn: Arn,
        name: ResponsePlanName,
        displayName: js.UndefOr[ResponsePlanDisplayName] = js.undefined
    ): ResponsePlanSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResponsePlanSummary]
    }
  }

  /** Details about the Systems Manager automation document that will be used as a runbook during an incident.
    */
  @js.native
  trait SsmAutomation extends js.Object {
    var documentName: SsmAutomationDocumentNameString
    var roleArn: RoleArn
    var documentVersion: js.UndefOr[SsmAutomationDocumentVersionString]
    var parameters: js.UndefOr[SsmParameters]
    var targetAccount: js.UndefOr[SsmTargetAccount]
  }

  object SsmAutomation {
    @inline
    def apply(
        documentName: SsmAutomationDocumentNameString,
        roleArn: RoleArn,
        documentVersion: js.UndefOr[SsmAutomationDocumentVersionString] = js.undefined,
        parameters: js.UndefOr[SsmParameters] = js.undefined,
        targetAccount: js.UndefOr[SsmTargetAccount] = js.undefined
    ): SsmAutomation = {
      val __obj = js.Dynamic.literal(
        "documentName" -> documentName.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      documentVersion.foreach(__v => __obj.updateDynamic("documentVersion")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      targetAccount.foreach(__v => __obj.updateDynamic("targetAccount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SsmAutomation]
    }
  }

  @js.native
  trait StartIncidentInput extends js.Object {
    var responsePlanArn: Arn
    var clientToken: js.UndefOr[ClientToken]
    var impact: js.UndefOr[Impact]
    var relatedItems: js.UndefOr[RelatedItemList]
    var title: js.UndefOr[IncidentTitle]
    var triggerDetails: js.UndefOr[TriggerDetails]
  }

  object StartIncidentInput {
    @inline
    def apply(
        responsePlanArn: Arn,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        impact: js.UndefOr[Impact] = js.undefined,
        relatedItems: js.UndefOr[RelatedItemList] = js.undefined,
        title: js.UndefOr[IncidentTitle] = js.undefined,
        triggerDetails: js.UndefOr[TriggerDetails] = js.undefined
    ): StartIncidentInput = {
      val __obj = js.Dynamic.literal(
        "responsePlanArn" -> responsePlanArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      impact.foreach(__v => __obj.updateDynamic("impact")(__v.asInstanceOf[js.Any]))
      relatedItems.foreach(__v => __obj.updateDynamic("relatedItems")(__v.asInstanceOf[js.Any]))
      title.foreach(__v => __obj.updateDynamic("title")(__v.asInstanceOf[js.Any]))
      triggerDetails.foreach(__v => __obj.updateDynamic("triggerDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartIncidentInput]
    }
  }

  @js.native
  trait StartIncidentOutput extends js.Object {
    var incidentRecordArn: Arn
  }

  object StartIncidentOutput {
    @inline
    def apply(
        incidentRecordArn: Arn
    ): StartIncidentOutput = {
      val __obj = js.Dynamic.literal(
        "incidentRecordArn" -> incidentRecordArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartIncidentOutput]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: String
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: String,
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

  /** A significant event that happened during the incident.
    */
  @js.native
  trait TimelineEvent extends js.Object {
    var eventData: EventData
    var eventId: UUID
    var eventTime: Timestamp
    var eventType: TimelineEventType
    var eventUpdatedTime: Timestamp
    var incidentRecordArn: Arn
  }

  object TimelineEvent {
    @inline
    def apply(
        eventData: EventData,
        eventId: UUID,
        eventTime: Timestamp,
        eventType: TimelineEventType,
        eventUpdatedTime: Timestamp,
        incidentRecordArn: Arn
    ): TimelineEvent = {
      val __obj = js.Dynamic.literal(
        "eventData" -> eventData.asInstanceOf[js.Any],
        "eventId" -> eventId.asInstanceOf[js.Any],
        "eventTime" -> eventTime.asInstanceOf[js.Any],
        "eventType" -> eventType.asInstanceOf[js.Any],
        "eventUpdatedTime" -> eventUpdatedTime.asInstanceOf[js.Any],
        "incidentRecordArn" -> incidentRecordArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TimelineEvent]
    }
  }

  /** Details about what caused the incident to be created in Incident Manager.
    */
  @js.native
  trait TriggerDetails extends js.Object {
    var source: IncidentSource
    var timestamp: Timestamp
    var rawData: js.UndefOr[RawData]
    var triggerArn: js.UndefOr[Arn]
  }

  object TriggerDetails {
    @inline
    def apply(
        source: IncidentSource,
        timestamp: Timestamp,
        rawData: js.UndefOr[RawData] = js.undefined,
        triggerArn: js.UndefOr[Arn] = js.undefined
    ): TriggerDetails = {
      val __obj = js.Dynamic.literal(
        "source" -> source.asInstanceOf[js.Any],
        "timestamp" -> timestamp.asInstanceOf[js.Any]
      )

      rawData.foreach(__v => __obj.updateDynamic("rawData")(__v.asInstanceOf[js.Any]))
      triggerArn.foreach(__v => __obj.updateDynamic("triggerArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TriggerDetails]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: String
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: String,
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
  trait UpdateDeletionProtectionInput extends js.Object {
    var arn: Arn
    var deletionProtected: Boolean
    var clientToken: js.UndefOr[ClientToken]
  }

  object UpdateDeletionProtectionInput {
    @inline
    def apply(
        arn: Arn,
        deletionProtected: Boolean,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): UpdateDeletionProtectionInput = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "deletionProtected" -> deletionProtected.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDeletionProtectionInput]
    }
  }

  @js.native
  trait UpdateDeletionProtectionOutput extends js.Object

  object UpdateDeletionProtectionOutput {
    @inline
    def apply(): UpdateDeletionProtectionOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateDeletionProtectionOutput]
    }
  }

  @js.native
  trait UpdateIncidentRecordInput extends js.Object {
    var arn: Arn
    var chatChannel: js.UndefOr[ChatChannel]
    var clientToken: js.UndefOr[ClientToken]
    var impact: js.UndefOr[Impact]
    var notificationTargets: js.UndefOr[NotificationTargetSet]
    var status: js.UndefOr[IncidentRecordStatus]
    var summary: js.UndefOr[IncidentSummary]
    var title: js.UndefOr[IncidentTitle]
  }

  object UpdateIncidentRecordInput {
    @inline
    def apply(
        arn: Arn,
        chatChannel: js.UndefOr[ChatChannel] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        impact: js.UndefOr[Impact] = js.undefined,
        notificationTargets: js.UndefOr[NotificationTargetSet] = js.undefined,
        status: js.UndefOr[IncidentRecordStatus] = js.undefined,
        summary: js.UndefOr[IncidentSummary] = js.undefined,
        title: js.UndefOr[IncidentTitle] = js.undefined
    ): UpdateIncidentRecordInput = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )

      chatChannel.foreach(__v => __obj.updateDynamic("chatChannel")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      impact.foreach(__v => __obj.updateDynamic("impact")(__v.asInstanceOf[js.Any]))
      notificationTargets.foreach(__v => __obj.updateDynamic("notificationTargets")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      summary.foreach(__v => __obj.updateDynamic("summary")(__v.asInstanceOf[js.Any]))
      title.foreach(__v => __obj.updateDynamic("title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIncidentRecordInput]
    }
  }

  @js.native
  trait UpdateIncidentRecordOutput extends js.Object

  object UpdateIncidentRecordOutput {
    @inline
    def apply(): UpdateIncidentRecordOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateIncidentRecordOutput]
    }
  }

  @js.native
  trait UpdateRelatedItemsInput extends js.Object {
    var incidentRecordArn: Arn
    var relatedItemsUpdate: RelatedItemsUpdate
    var clientToken: js.UndefOr[ClientToken]
  }

  object UpdateRelatedItemsInput {
    @inline
    def apply(
        incidentRecordArn: Arn,
        relatedItemsUpdate: RelatedItemsUpdate,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): UpdateRelatedItemsInput = {
      val __obj = js.Dynamic.literal(
        "incidentRecordArn" -> incidentRecordArn.asInstanceOf[js.Any],
        "relatedItemsUpdate" -> relatedItemsUpdate.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRelatedItemsInput]
    }
  }

  @js.native
  trait UpdateRelatedItemsOutput extends js.Object

  object UpdateRelatedItemsOutput {
    @inline
    def apply(): UpdateRelatedItemsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateRelatedItemsOutput]
    }
  }

  /** Details used when updating the replication set.
    */
  @js.native
  trait UpdateReplicationSetAction extends js.Object {
    var addRegionAction: js.UndefOr[AddRegionAction]
    var deleteRegionAction: js.UndefOr[DeleteRegionAction]
  }

  object UpdateReplicationSetAction {
    @inline
    def apply(
        addRegionAction: js.UndefOr[AddRegionAction] = js.undefined,
        deleteRegionAction: js.UndefOr[DeleteRegionAction] = js.undefined
    ): UpdateReplicationSetAction = {
      val __obj = js.Dynamic.literal()
      addRegionAction.foreach(__v => __obj.updateDynamic("addRegionAction")(__v.asInstanceOf[js.Any]))
      deleteRegionAction.foreach(__v => __obj.updateDynamic("deleteRegionAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateReplicationSetAction]
    }
  }

  @js.native
  trait UpdateReplicationSetInput extends js.Object {
    var actions: UpdateReplicationSetInputActionsList
    var arn: Arn
    var clientToken: js.UndefOr[ClientToken]
  }

  object UpdateReplicationSetInput {
    @inline
    def apply(
        actions: UpdateReplicationSetInputActionsList,
        arn: Arn,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): UpdateReplicationSetInput = {
      val __obj = js.Dynamic.literal(
        "actions" -> actions.asInstanceOf[js.Any],
        "arn" -> arn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateReplicationSetInput]
    }
  }

  @js.native
  trait UpdateReplicationSetOutput extends js.Object

  object UpdateReplicationSetOutput {
    @inline
    def apply(): UpdateReplicationSetOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateReplicationSetOutput]
    }
  }

  @js.native
  trait UpdateResponsePlanInput extends js.Object {
    var arn: Arn
    var actions: js.UndefOr[ActionsList]
    var chatChannel: js.UndefOr[ChatChannel]
    var clientToken: js.UndefOr[ClientToken]
    var displayName: js.UndefOr[ResponsePlanDisplayName]
    var engagements: js.UndefOr[EngagementSet]
    var incidentTemplateDedupeString: js.UndefOr[DedupeString]
    var incidentTemplateImpact: js.UndefOr[Impact]
    var incidentTemplateNotificationTargets: js.UndefOr[NotificationTargetSet]
    var incidentTemplateSummary: js.UndefOr[IncidentSummary]
    var incidentTemplateTitle: js.UndefOr[IncidentTitle]
  }

  object UpdateResponsePlanInput {
    @inline
    def apply(
        arn: Arn,
        actions: js.UndefOr[ActionsList] = js.undefined,
        chatChannel: js.UndefOr[ChatChannel] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        displayName: js.UndefOr[ResponsePlanDisplayName] = js.undefined,
        engagements: js.UndefOr[EngagementSet] = js.undefined,
        incidentTemplateDedupeString: js.UndefOr[DedupeString] = js.undefined,
        incidentTemplateImpact: js.UndefOr[Impact] = js.undefined,
        incidentTemplateNotificationTargets: js.UndefOr[NotificationTargetSet] = js.undefined,
        incidentTemplateSummary: js.UndefOr[IncidentSummary] = js.undefined,
        incidentTemplateTitle: js.UndefOr[IncidentTitle] = js.undefined
    ): UpdateResponsePlanInput = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )

      actions.foreach(__v => __obj.updateDynamic("actions")(__v.asInstanceOf[js.Any]))
      chatChannel.foreach(__v => __obj.updateDynamic("chatChannel")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      engagements.foreach(__v => __obj.updateDynamic("engagements")(__v.asInstanceOf[js.Any]))
      incidentTemplateDedupeString.foreach(__v => __obj.updateDynamic("incidentTemplateDedupeString")(__v.asInstanceOf[js.Any]))
      incidentTemplateImpact.foreach(__v => __obj.updateDynamic("incidentTemplateImpact")(__v.asInstanceOf[js.Any]))
      incidentTemplateNotificationTargets.foreach(__v => __obj.updateDynamic("incidentTemplateNotificationTargets")(__v.asInstanceOf[js.Any]))
      incidentTemplateSummary.foreach(__v => __obj.updateDynamic("incidentTemplateSummary")(__v.asInstanceOf[js.Any]))
      incidentTemplateTitle.foreach(__v => __obj.updateDynamic("incidentTemplateTitle")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResponsePlanInput]
    }
  }

  @js.native
  trait UpdateResponsePlanOutput extends js.Object

  object UpdateResponsePlanOutput {
    @inline
    def apply(): UpdateResponsePlanOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateResponsePlanOutput]
    }
  }

  @js.native
  trait UpdateTimelineEventInput extends js.Object {
    var eventId: UUID
    var incidentRecordArn: Arn
    var clientToken: js.UndefOr[ClientToken]
    var eventData: js.UndefOr[EventData]
    var eventTime: js.UndefOr[Timestamp]
    var eventType: js.UndefOr[TimelineEventType]
  }

  object UpdateTimelineEventInput {
    @inline
    def apply(
        eventId: UUID,
        incidentRecordArn: Arn,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        eventData: js.UndefOr[EventData] = js.undefined,
        eventTime: js.UndefOr[Timestamp] = js.undefined,
        eventType: js.UndefOr[TimelineEventType] = js.undefined
    ): UpdateTimelineEventInput = {
      val __obj = js.Dynamic.literal(
        "eventId" -> eventId.asInstanceOf[js.Any],
        "incidentRecordArn" -> incidentRecordArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      eventData.foreach(__v => __obj.updateDynamic("eventData")(__v.asInstanceOf[js.Any]))
      eventTime.foreach(__v => __obj.updateDynamic("eventTime")(__v.asInstanceOf[js.Any]))
      eventType.foreach(__v => __obj.updateDynamic("eventType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTimelineEventInput]
    }
  }

  @js.native
  trait UpdateTimelineEventOutput extends js.Object

  object UpdateTimelineEventOutput {
    @inline
    def apply(): UpdateTimelineEventOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateTimelineEventOutput]
    }
  }
}
