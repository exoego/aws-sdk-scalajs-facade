package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object shield {
  type AttackId = String
  type AttackProperties = js.Array[AttackProperty]
  type AttackStatisticsDataList = js.Array[AttackStatisticsDataItem]
  type AttackSummaries = js.Array[AttackSummary]
  type AttackTimestamp = js.Date
  type AttackVectorDescriptionList = js.Array[AttackVectorDescription]
  type ContactNotes = String
  type DurationInSeconds = Double
  type EmailAddress = String
  type EmergencyContactList = js.Array[EmergencyContact]
  type HealthCheckArn = String
  type HealthCheckId = String
  type HealthCheckIds = js.Array[HealthCheckId]
  type Limits = js.Array[Limit]
  type LogBucket = String
  type LogBucketList = js.Array[LogBucket]
  type MaxResults = Int
  type MitigationList = js.Array[Mitigation]
  type PhoneNumber = String
  type ProtectionGroupId = String
  type ProtectionGroupMembers = js.Array[ResourceArn]
  type ProtectionGroups = js.Array[ProtectionGroup]
  type ProtectionId = String
  type ProtectionName = String
  type Protections = js.Array[Protection]
  type ResourceArn = String
  type ResourceArnFilterList = js.Array[ResourceArn]
  type ResourceArnList = js.Array[ResourceArn]
  type RoleArn = String
  type SubResourceSummaryList = js.Array[SubResourceSummary]
  type SummarizedAttackVectorList = js.Array[SummarizedAttackVector]
  type SummarizedCounterList = js.Array[SummarizedCounter]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Timestamp = js.Date
  type Token = String
  type TopContributors = js.Array[Contributor]

  final class ShieldOps(private val service: Shield) extends AnyVal {

    @inline def associateDRTLogBucketFuture(params: AssociateDRTLogBucketRequest): Future[AssociateDRTLogBucketResponse] = service.associateDRTLogBucket(params).promise().toFuture
    @inline def associateDRTRoleFuture(params: AssociateDRTRoleRequest): Future[AssociateDRTRoleResponse] = service.associateDRTRole(params).promise().toFuture
    @inline def associateHealthCheckFuture(params: AssociateHealthCheckRequest): Future[AssociateHealthCheckResponse] = service.associateHealthCheck(params).promise().toFuture
    @inline def associateProactiveEngagementDetailsFuture(params: AssociateProactiveEngagementDetailsRequest): Future[AssociateProactiveEngagementDetailsResponse] = service.associateProactiveEngagementDetails(params).promise().toFuture
    @inline def createProtectionFuture(params: CreateProtectionRequest): Future[CreateProtectionResponse] = service.createProtection(params).promise().toFuture
    @inline def createProtectionGroupFuture(params: CreateProtectionGroupRequest): Future[CreateProtectionGroupResponse] = service.createProtectionGroup(params).promise().toFuture
    @inline def createSubscriptionFuture(params: CreateSubscriptionRequest): Future[CreateSubscriptionResponse] = service.createSubscription(params).promise().toFuture
    @inline def deleteProtectionFuture(params: DeleteProtectionRequest): Future[DeleteProtectionResponse] = service.deleteProtection(params).promise().toFuture
    @inline def deleteProtectionGroupFuture(params: DeleteProtectionGroupRequest): Future[DeleteProtectionGroupResponse] = service.deleteProtectionGroup(params).promise().toFuture
    @inline def describeAttackFuture(params: DescribeAttackRequest): Future[DescribeAttackResponse] = service.describeAttack(params).promise().toFuture
    @inline def describeAttackStatisticsFuture(params: DescribeAttackStatisticsRequest): Future[DescribeAttackStatisticsResponse] = service.describeAttackStatistics(params).promise().toFuture
    @inline def describeDRTAccessFuture(params: DescribeDRTAccessRequest): Future[DescribeDRTAccessResponse] = service.describeDRTAccess(params).promise().toFuture
    @inline def describeEmergencyContactSettingsFuture(params: DescribeEmergencyContactSettingsRequest): Future[DescribeEmergencyContactSettingsResponse] = service.describeEmergencyContactSettings(params).promise().toFuture
    @inline def describeProtectionFuture(params: DescribeProtectionRequest): Future[DescribeProtectionResponse] = service.describeProtection(params).promise().toFuture
    @inline def describeProtectionGroupFuture(params: DescribeProtectionGroupRequest): Future[DescribeProtectionGroupResponse] = service.describeProtectionGroup(params).promise().toFuture
    @inline def describeSubscriptionFuture(params: DescribeSubscriptionRequest): Future[DescribeSubscriptionResponse] = service.describeSubscription(params).promise().toFuture
    @inline def disableApplicationLayerAutomaticResponseFuture(params: DisableApplicationLayerAutomaticResponseRequest): Future[DisableApplicationLayerAutomaticResponseResponse] = service.disableApplicationLayerAutomaticResponse(params).promise().toFuture
    @inline def disableProactiveEngagementFuture(params: DisableProactiveEngagementRequest): Future[DisableProactiveEngagementResponse] = service.disableProactiveEngagement(params).promise().toFuture
    @inline def disassociateDRTLogBucketFuture(params: DisassociateDRTLogBucketRequest): Future[DisassociateDRTLogBucketResponse] = service.disassociateDRTLogBucket(params).promise().toFuture
    @inline def disassociateDRTRoleFuture(params: DisassociateDRTRoleRequest): Future[DisassociateDRTRoleResponse] = service.disassociateDRTRole(params).promise().toFuture
    @inline def disassociateHealthCheckFuture(params: DisassociateHealthCheckRequest): Future[DisassociateHealthCheckResponse] = service.disassociateHealthCheck(params).promise().toFuture
    @inline def enableApplicationLayerAutomaticResponseFuture(params: EnableApplicationLayerAutomaticResponseRequest): Future[EnableApplicationLayerAutomaticResponseResponse] = service.enableApplicationLayerAutomaticResponse(params).promise().toFuture
    @inline def enableProactiveEngagementFuture(params: EnableProactiveEngagementRequest): Future[EnableProactiveEngagementResponse] = service.enableProactiveEngagement(params).promise().toFuture
    @inline def getSubscriptionStateFuture(params: GetSubscriptionStateRequest): Future[GetSubscriptionStateResponse] = service.getSubscriptionState(params).promise().toFuture
    @inline def listAttacksFuture(params: ListAttacksRequest): Future[ListAttacksResponse] = service.listAttacks(params).promise().toFuture
    @inline def listProtectionGroupsFuture(params: ListProtectionGroupsRequest): Future[ListProtectionGroupsResponse] = service.listProtectionGroups(params).promise().toFuture
    @inline def listProtectionsFuture(params: ListProtectionsRequest): Future[ListProtectionsResponse] = service.listProtections(params).promise().toFuture
    @inline def listResourcesInProtectionGroupFuture(params: ListResourcesInProtectionGroupRequest): Future[ListResourcesInProtectionGroupResponse] = service.listResourcesInProtectionGroup(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateApplicationLayerAutomaticResponseFuture(params: UpdateApplicationLayerAutomaticResponseRequest): Future[UpdateApplicationLayerAutomaticResponseResponse] = service.updateApplicationLayerAutomaticResponse(params).promise().toFuture
    @inline def updateEmergencyContactSettingsFuture(params: UpdateEmergencyContactSettingsRequest): Future[UpdateEmergencyContactSettingsResponse] = service.updateEmergencyContactSettings(params).promise().toFuture
    @inline def updateProtectionGroupFuture(params: UpdateProtectionGroupRequest): Future[UpdateProtectionGroupResponse] = service.updateProtectionGroup(params).promise().toFuture
    @inline def updateSubscriptionFuture(params: UpdateSubscriptionRequest): Future[UpdateSubscriptionResponse] = service.updateSubscription(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/shield", JSImport.Namespace, "AWS.Shield")
  class Shield() extends js.Object {
    def this(config: AWSConfig) = this()

    @deprecated("Deprecated in AWS SDK", "forever") def deleteSubscription(params: DeleteSubscriptionRequest): Request[DeleteSubscriptionResponse] = js.native
    def associateDRTLogBucket(params: AssociateDRTLogBucketRequest): Request[AssociateDRTLogBucketResponse] = js.native
    def associateDRTRole(params: AssociateDRTRoleRequest): Request[AssociateDRTRoleResponse] = js.native
    def associateHealthCheck(params: AssociateHealthCheckRequest): Request[AssociateHealthCheckResponse] = js.native
    def associateProactiveEngagementDetails(params: AssociateProactiveEngagementDetailsRequest): Request[AssociateProactiveEngagementDetailsResponse] = js.native
    def createProtection(params: CreateProtectionRequest): Request[CreateProtectionResponse] = js.native
    def createProtectionGroup(params: CreateProtectionGroupRequest): Request[CreateProtectionGroupResponse] = js.native
    def createSubscription(params: CreateSubscriptionRequest): Request[CreateSubscriptionResponse] = js.native
    def deleteProtection(params: DeleteProtectionRequest): Request[DeleteProtectionResponse] = js.native
    def deleteProtectionGroup(params: DeleteProtectionGroupRequest): Request[DeleteProtectionGroupResponse] = js.native
    def describeAttack(params: DescribeAttackRequest): Request[DescribeAttackResponse] = js.native
    def describeAttackStatistics(params: DescribeAttackStatisticsRequest): Request[DescribeAttackStatisticsResponse] = js.native
    def describeDRTAccess(params: DescribeDRTAccessRequest): Request[DescribeDRTAccessResponse] = js.native
    def describeEmergencyContactSettings(params: DescribeEmergencyContactSettingsRequest): Request[DescribeEmergencyContactSettingsResponse] = js.native
    def describeProtection(params: DescribeProtectionRequest): Request[DescribeProtectionResponse] = js.native
    def describeProtectionGroup(params: DescribeProtectionGroupRequest): Request[DescribeProtectionGroupResponse] = js.native
    def describeSubscription(params: DescribeSubscriptionRequest): Request[DescribeSubscriptionResponse] = js.native
    def disableApplicationLayerAutomaticResponse(params: DisableApplicationLayerAutomaticResponseRequest): Request[DisableApplicationLayerAutomaticResponseResponse] = js.native
    def disableProactiveEngagement(params: DisableProactiveEngagementRequest): Request[DisableProactiveEngagementResponse] = js.native
    def disassociateDRTLogBucket(params: DisassociateDRTLogBucketRequest): Request[DisassociateDRTLogBucketResponse] = js.native
    def disassociateDRTRole(params: DisassociateDRTRoleRequest): Request[DisassociateDRTRoleResponse] = js.native
    def disassociateHealthCheck(params: DisassociateHealthCheckRequest): Request[DisassociateHealthCheckResponse] = js.native
    def enableApplicationLayerAutomaticResponse(params: EnableApplicationLayerAutomaticResponseRequest): Request[EnableApplicationLayerAutomaticResponseResponse] = js.native
    def enableProactiveEngagement(params: EnableProactiveEngagementRequest): Request[EnableProactiveEngagementResponse] = js.native
    def getSubscriptionState(params: GetSubscriptionStateRequest): Request[GetSubscriptionStateResponse] = js.native
    def listAttacks(params: ListAttacksRequest): Request[ListAttacksResponse] = js.native
    def listProtectionGroups(params: ListProtectionGroupsRequest): Request[ListProtectionGroupsResponse] = js.native
    def listProtections(params: ListProtectionsRequest): Request[ListProtectionsResponse] = js.native
    def listResourcesInProtectionGroup(params: ListResourcesInProtectionGroupRequest): Request[ListResourcesInProtectionGroupResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateApplicationLayerAutomaticResponse(params: UpdateApplicationLayerAutomaticResponseRequest): Request[UpdateApplicationLayerAutomaticResponseResponse] = js.native
    def updateEmergencyContactSettings(params: UpdateEmergencyContactSettingsRequest): Request[UpdateEmergencyContactSettingsResponse] = js.native
    def updateProtectionGroup(params: UpdateProtectionGroupRequest): Request[UpdateProtectionGroupResponse] = js.native
    def updateSubscription(params: UpdateSubscriptionRequest): Request[UpdateSubscriptionResponse] = js.native
  }
  object Shield {
    @inline implicit def toOps(service: Shield): ShieldOps = {
      new ShieldOps(service)
    }
  }

  /** The automatic application layer DDoS mitigation settings for a <a>Protection</a>. This configuration determines whether Shield Advanced automatically manages rules in the web ACL in order to respond to application layer events that Shield Advanced determines to be DDoS attacks.
    */
  @js.native
  trait ApplicationLayerAutomaticResponseConfiguration extends js.Object {
    var Action: ResponseAction
    var Status: ApplicationLayerAutomaticResponseStatus
  }

  object ApplicationLayerAutomaticResponseConfiguration {
    @inline
    def apply(
        Action: ResponseAction,
        Status: ApplicationLayerAutomaticResponseStatus
    ): ApplicationLayerAutomaticResponseConfiguration = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ApplicationLayerAutomaticResponseConfiguration]
    }
  }

  @js.native
  trait AssociateDRTLogBucketRequest extends js.Object {
    var LogBucket: LogBucket
  }

  object AssociateDRTLogBucketRequest {
    @inline
    def apply(
        LogBucket: LogBucket
    ): AssociateDRTLogBucketRequest = {
      val __obj = js.Dynamic.literal(
        "LogBucket" -> LogBucket.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateDRTLogBucketRequest]
    }
  }

  @js.native
  trait AssociateDRTLogBucketResponse extends js.Object

  object AssociateDRTLogBucketResponse {
    @inline
    def apply(): AssociateDRTLogBucketResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateDRTLogBucketResponse]
    }
  }

  @js.native
  trait AssociateDRTRoleRequest extends js.Object {
    var RoleArn: RoleArn
  }

  object AssociateDRTRoleRequest {
    @inline
    def apply(
        RoleArn: RoleArn
    ): AssociateDRTRoleRequest = {
      val __obj = js.Dynamic.literal(
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateDRTRoleRequest]
    }
  }

  @js.native
  trait AssociateDRTRoleResponse extends js.Object

  object AssociateDRTRoleResponse {
    @inline
    def apply(): AssociateDRTRoleResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateDRTRoleResponse]
    }
  }

  @js.native
  trait AssociateHealthCheckRequest extends js.Object {
    var HealthCheckArn: HealthCheckArn
    var ProtectionId: ProtectionId
  }

  object AssociateHealthCheckRequest {
    @inline
    def apply(
        HealthCheckArn: HealthCheckArn,
        ProtectionId: ProtectionId
    ): AssociateHealthCheckRequest = {
      val __obj = js.Dynamic.literal(
        "HealthCheckArn" -> HealthCheckArn.asInstanceOf[js.Any],
        "ProtectionId" -> ProtectionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateHealthCheckRequest]
    }
  }

  @js.native
  trait AssociateHealthCheckResponse extends js.Object

  object AssociateHealthCheckResponse {
    @inline
    def apply(): AssociateHealthCheckResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateHealthCheckResponse]
    }
  }

  @js.native
  trait AssociateProactiveEngagementDetailsRequest extends js.Object {
    var EmergencyContactList: EmergencyContactList
  }

  object AssociateProactiveEngagementDetailsRequest {
    @inline
    def apply(
        EmergencyContactList: EmergencyContactList
    ): AssociateProactiveEngagementDetailsRequest = {
      val __obj = js.Dynamic.literal(
        "EmergencyContactList" -> EmergencyContactList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateProactiveEngagementDetailsRequest]
    }
  }

  @js.native
  trait AssociateProactiveEngagementDetailsResponse extends js.Object

  object AssociateProactiveEngagementDetailsResponse {
    @inline
    def apply(): AssociateProactiveEngagementDetailsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateProactiveEngagementDetailsResponse]
    }
  }

  /** The details of a DDoS attack.
    */
  @js.native
  trait AttackDetail extends js.Object {
    var AttackCounters: js.UndefOr[SummarizedCounterList]
    var AttackId: js.UndefOr[AttackId]
    var AttackProperties: js.UndefOr[AttackProperties]
    var EndTime: js.UndefOr[AttackTimestamp]
    var Mitigations: js.UndefOr[MitigationList]
    var ResourceArn: js.UndefOr[ResourceArn]
    var StartTime: js.UndefOr[AttackTimestamp]
    var SubResources: js.UndefOr[SubResourceSummaryList]
  }

  object AttackDetail {
    @inline
    def apply(
        AttackCounters: js.UndefOr[SummarizedCounterList] = js.undefined,
        AttackId: js.UndefOr[AttackId] = js.undefined,
        AttackProperties: js.UndefOr[AttackProperties] = js.undefined,
        EndTime: js.UndefOr[AttackTimestamp] = js.undefined,
        Mitigations: js.UndefOr[MitigationList] = js.undefined,
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
        StartTime: js.UndefOr[AttackTimestamp] = js.undefined,
        SubResources: js.UndefOr[SubResourceSummaryList] = js.undefined
    ): AttackDetail = {
      val __obj = js.Dynamic.literal()
      AttackCounters.foreach(__v => __obj.updateDynamic("AttackCounters")(__v.asInstanceOf[js.Any]))
      AttackId.foreach(__v => __obj.updateDynamic("AttackId")(__v.asInstanceOf[js.Any]))
      AttackProperties.foreach(__v => __obj.updateDynamic("AttackProperties")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      Mitigations.foreach(__v => __obj.updateDynamic("Mitigations")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      SubResources.foreach(__v => __obj.updateDynamic("SubResources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttackDetail]
    }
  }

  /** Details of a Shield event. This is provided as part of an <a>AttackDetail</a>.
    */
  @js.native
  trait AttackProperty extends js.Object {
    var AttackLayer: js.UndefOr[AttackLayer]
    var AttackPropertyIdentifier: js.UndefOr[AttackPropertyIdentifier]
    var TopContributors: js.UndefOr[TopContributors]
    var Total: js.UndefOr[Double]
    var Unit: js.UndefOr[Unit]
  }

  object AttackProperty {
    @inline
    def apply(
        AttackLayer: js.UndefOr[AttackLayer] = js.undefined,
        AttackPropertyIdentifier: js.UndefOr[AttackPropertyIdentifier] = js.undefined,
        TopContributors: js.UndefOr[TopContributors] = js.undefined,
        Total: js.UndefOr[Double] = js.undefined,
        Unit: js.UndefOr[Unit] = js.undefined
    ): AttackProperty = {
      val __obj = js.Dynamic.literal()
      AttackLayer.foreach(__v => __obj.updateDynamic("AttackLayer")(__v.asInstanceOf[js.Any]))
      AttackPropertyIdentifier.foreach(__v => __obj.updateDynamic("AttackPropertyIdentifier")(__v.asInstanceOf[js.Any]))
      TopContributors.foreach(__v => __obj.updateDynamic("TopContributors")(__v.asInstanceOf[js.Any]))
      Total.foreach(__v => __obj.updateDynamic("Total")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttackProperty]
    }
  }

  /** A single attack statistics data record. This is returned by <a>DescribeAttackStatistics</a> along with a time range indicating the time period that the attack statistics apply to.
    */
  @js.native
  trait AttackStatisticsDataItem extends js.Object {
    var AttackCount: Double
    var AttackVolume: js.UndefOr[AttackVolume]
  }

  object AttackStatisticsDataItem {
    @inline
    def apply(
        AttackCount: Double,
        AttackVolume: js.UndefOr[AttackVolume] = js.undefined
    ): AttackStatisticsDataItem = {
      val __obj = js.Dynamic.literal(
        "AttackCount" -> AttackCount.asInstanceOf[js.Any]
      )

      AttackVolume.foreach(__v => __obj.updateDynamic("AttackVolume")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttackStatisticsDataItem]
    }
  }

  /** Summarizes all DDoS attacks for a specified time period.
    */
  @js.native
  trait AttackSummary extends js.Object {
    var AttackId: js.UndefOr[String]
    var AttackVectors: js.UndefOr[AttackVectorDescriptionList]
    var EndTime: js.UndefOr[AttackTimestamp]
    var ResourceArn: js.UndefOr[String]
    var StartTime: js.UndefOr[AttackTimestamp]
  }

  object AttackSummary {
    @inline
    def apply(
        AttackId: js.UndefOr[String] = js.undefined,
        AttackVectors: js.UndefOr[AttackVectorDescriptionList] = js.undefined,
        EndTime: js.UndefOr[AttackTimestamp] = js.undefined,
        ResourceArn: js.UndefOr[String] = js.undefined,
        StartTime: js.UndefOr[AttackTimestamp] = js.undefined
    ): AttackSummary = {
      val __obj = js.Dynamic.literal()
      AttackId.foreach(__v => __obj.updateDynamic("AttackId")(__v.asInstanceOf[js.Any]))
      AttackVectors.foreach(__v => __obj.updateDynamic("AttackVectors")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttackSummary]
    }
  }

  /** Describes the attack.
    */
  @js.native
  trait AttackVectorDescription extends js.Object {
    var VectorType: String
  }

  object AttackVectorDescription {
    @inline
    def apply(
        VectorType: String
    ): AttackVectorDescription = {
      val __obj = js.Dynamic.literal(
        "VectorType" -> VectorType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AttackVectorDescription]
    }
  }

  /** Information about the volume of attacks during the time period, included in an <a>AttackStatisticsDataItem</a>. If the accompanying <code>AttackCount</code> in the statistics object is zero, this setting might be empty.
    */
  @js.native
  trait AttackVolume extends js.Object {
    var BitsPerSecond: js.UndefOr[AttackVolumeStatistics]
    var PacketsPerSecond: js.UndefOr[AttackVolumeStatistics]
    var RequestsPerSecond: js.UndefOr[AttackVolumeStatistics]
  }

  object AttackVolume {
    @inline
    def apply(
        BitsPerSecond: js.UndefOr[AttackVolumeStatistics] = js.undefined,
        PacketsPerSecond: js.UndefOr[AttackVolumeStatistics] = js.undefined,
        RequestsPerSecond: js.UndefOr[AttackVolumeStatistics] = js.undefined
    ): AttackVolume = {
      val __obj = js.Dynamic.literal()
      BitsPerSecond.foreach(__v => __obj.updateDynamic("BitsPerSecond")(__v.asInstanceOf[js.Any]))
      PacketsPerSecond.foreach(__v => __obj.updateDynamic("PacketsPerSecond")(__v.asInstanceOf[js.Any]))
      RequestsPerSecond.foreach(__v => __obj.updateDynamic("RequestsPerSecond")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttackVolume]
    }
  }

  /** Statistics objects for the various data types in <a>AttackVolume</a>.
    */
  @js.native
  trait AttackVolumeStatistics extends js.Object {
    var Max: Double
  }

  object AttackVolumeStatistics {
    @inline
    def apply(
        Max: Double
    ): AttackVolumeStatistics = {
      val __obj = js.Dynamic.literal(
        "Max" -> Max.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AttackVolumeStatistics]
    }
  }

  /** Specifies that Shield Advanced should configure its WAF rules with the WAF <code>Block</code> action. This is only used in the context of the <code>ResponseAction</code> setting. JSON specification: <code>"Block": {}</code>
    */
  @js.native
  trait BlockAction extends js.Object

  object BlockAction {
    @inline
    def apply(): BlockAction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockAction]
    }
  }

  /** A contributor to the attack and their contribution.
    */
  @js.native
  trait Contributor extends js.Object {
    var Name: js.UndefOr[String]
    var Value: js.UndefOr[Double]
  }

  object Contributor {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[Double] = js.undefined
    ): Contributor = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Contributor]
    }
  }

  /** Specifies that Shield Advanced should configure its WAF rules with the WAF <code>Count</code> action. This is only used in the context of the <code>ResponseAction</code> setting. JSON specification: <code>"Count": {}</code>
    */
  @js.native
  trait CountAction extends js.Object

  object CountAction {
    @inline
    def apply(): CountAction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CountAction]
    }
  }

  @js.native
  trait CreateProtectionGroupRequest extends js.Object {
    var Aggregation: ProtectionGroupAggregation
    var Pattern: ProtectionGroupPattern
    var ProtectionGroupId: ProtectionGroupId
    var Members: js.UndefOr[ProtectionGroupMembers]
    var ResourceType: js.UndefOr[ProtectedResourceType]
    var Tags: js.UndefOr[TagList]
  }

  object CreateProtectionGroupRequest {
    @inline
    def apply(
        Aggregation: ProtectionGroupAggregation,
        Pattern: ProtectionGroupPattern,
        ProtectionGroupId: ProtectionGroupId,
        Members: js.UndefOr[ProtectionGroupMembers] = js.undefined,
        ResourceType: js.UndefOr[ProtectedResourceType] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateProtectionGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Aggregation" -> Aggregation.asInstanceOf[js.Any],
        "Pattern" -> Pattern.asInstanceOf[js.Any],
        "ProtectionGroupId" -> ProtectionGroupId.asInstanceOf[js.Any]
      )

      Members.foreach(__v => __obj.updateDynamic("Members")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProtectionGroupRequest]
    }
  }

  @js.native
  trait CreateProtectionGroupResponse extends js.Object

  object CreateProtectionGroupResponse {
    @inline
    def apply(): CreateProtectionGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateProtectionGroupResponse]
    }
  }

  @js.native
  trait CreateProtectionRequest extends js.Object {
    var Name: ProtectionName
    var ResourceArn: ResourceArn
    var Tags: js.UndefOr[TagList]
  }

  object CreateProtectionRequest {
    @inline
    def apply(
        Name: ProtectionName,
        ResourceArn: ResourceArn,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateProtectionRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProtectionRequest]
    }
  }

  @js.native
  trait CreateProtectionResponse extends js.Object {
    var ProtectionId: js.UndefOr[ProtectionId]
  }

  object CreateProtectionResponse {
    @inline
    def apply(
        ProtectionId: js.UndefOr[ProtectionId] = js.undefined
    ): CreateProtectionResponse = {
      val __obj = js.Dynamic.literal()
      ProtectionId.foreach(__v => __obj.updateDynamic("ProtectionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProtectionResponse]
    }
  }

  @js.native
  trait CreateSubscriptionRequest extends js.Object

  object CreateSubscriptionRequest {
    @inline
    def apply(): CreateSubscriptionRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateSubscriptionRequest]
    }
  }

  @js.native
  trait CreateSubscriptionResponse extends js.Object

  object CreateSubscriptionResponse {
    @inline
    def apply(): CreateSubscriptionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateSubscriptionResponse]
    }
  }

  @js.native
  trait DeleteProtectionGroupRequest extends js.Object {
    var ProtectionGroupId: ProtectionGroupId
  }

  object DeleteProtectionGroupRequest {
    @inline
    def apply(
        ProtectionGroupId: ProtectionGroupId
    ): DeleteProtectionGroupRequest = {
      val __obj = js.Dynamic.literal(
        "ProtectionGroupId" -> ProtectionGroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteProtectionGroupRequest]
    }
  }

  @js.native
  trait DeleteProtectionGroupResponse extends js.Object

  object DeleteProtectionGroupResponse {
    @inline
    def apply(): DeleteProtectionGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteProtectionGroupResponse]
    }
  }

  @js.native
  trait DeleteProtectionRequest extends js.Object {
    var ProtectionId: ProtectionId
  }

  object DeleteProtectionRequest {
    @inline
    def apply(
        ProtectionId: ProtectionId
    ): DeleteProtectionRequest = {
      val __obj = js.Dynamic.literal(
        "ProtectionId" -> ProtectionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteProtectionRequest]
    }
  }

  @js.native
  trait DeleteProtectionResponse extends js.Object

  object DeleteProtectionResponse {
    @inline
    def apply(): DeleteProtectionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteProtectionResponse]
    }
  }

  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  trait DeleteSubscriptionRequest extends js.Object

  object DeleteSubscriptionRequest {
    @inline
    def apply(): DeleteSubscriptionRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSubscriptionRequest]
    }
  }

  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  trait DeleteSubscriptionResponse extends js.Object

  object DeleteSubscriptionResponse {
    @inline
    def apply(): DeleteSubscriptionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSubscriptionResponse]
    }
  }

  @js.native
  trait DescribeAttackRequest extends js.Object {
    var AttackId: AttackId
  }

  object DescribeAttackRequest {
    @inline
    def apply(
        AttackId: AttackId
    ): DescribeAttackRequest = {
      val __obj = js.Dynamic.literal(
        "AttackId" -> AttackId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAttackRequest]
    }
  }

  @js.native
  trait DescribeAttackResponse extends js.Object {
    var Attack: js.UndefOr[AttackDetail]
  }

  object DescribeAttackResponse {
    @inline
    def apply(
        Attack: js.UndefOr[AttackDetail] = js.undefined
    ): DescribeAttackResponse = {
      val __obj = js.Dynamic.literal()
      Attack.foreach(__v => __obj.updateDynamic("Attack")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAttackResponse]
    }
  }

  @js.native
  trait DescribeAttackStatisticsRequest extends js.Object

  object DescribeAttackStatisticsRequest {
    @inline
    def apply(): DescribeAttackStatisticsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeAttackStatisticsRequest]
    }
  }

  @js.native
  trait DescribeAttackStatisticsResponse extends js.Object {
    var DataItems: AttackStatisticsDataList
    var TimeRange: TimeRange
  }

  object DescribeAttackStatisticsResponse {
    @inline
    def apply(
        DataItems: AttackStatisticsDataList,
        TimeRange: TimeRange
    ): DescribeAttackStatisticsResponse = {
      val __obj = js.Dynamic.literal(
        "DataItems" -> DataItems.asInstanceOf[js.Any],
        "TimeRange" -> TimeRange.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAttackStatisticsResponse]
    }
  }

  @js.native
  trait DescribeDRTAccessRequest extends js.Object

  object DescribeDRTAccessRequest {
    @inline
    def apply(): DescribeDRTAccessRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeDRTAccessRequest]
    }
  }

  @js.native
  trait DescribeDRTAccessResponse extends js.Object {
    var LogBucketList: js.UndefOr[LogBucketList]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object DescribeDRTAccessResponse {
    @inline
    def apply(
        LogBucketList: js.UndefOr[LogBucketList] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined
    ): DescribeDRTAccessResponse = {
      val __obj = js.Dynamic.literal()
      LogBucketList.foreach(__v => __obj.updateDynamic("LogBucketList")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDRTAccessResponse]
    }
  }

  @js.native
  trait DescribeEmergencyContactSettingsRequest extends js.Object

  object DescribeEmergencyContactSettingsRequest {
    @inline
    def apply(): DescribeEmergencyContactSettingsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeEmergencyContactSettingsRequest]
    }
  }

  @js.native
  trait DescribeEmergencyContactSettingsResponse extends js.Object {
    var EmergencyContactList: js.UndefOr[EmergencyContactList]
  }

  object DescribeEmergencyContactSettingsResponse {
    @inline
    def apply(
        EmergencyContactList: js.UndefOr[EmergencyContactList] = js.undefined
    ): DescribeEmergencyContactSettingsResponse = {
      val __obj = js.Dynamic.literal()
      EmergencyContactList.foreach(__v => __obj.updateDynamic("EmergencyContactList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEmergencyContactSettingsResponse]
    }
  }

  @js.native
  trait DescribeProtectionGroupRequest extends js.Object {
    var ProtectionGroupId: ProtectionGroupId
  }

  object DescribeProtectionGroupRequest {
    @inline
    def apply(
        ProtectionGroupId: ProtectionGroupId
    ): DescribeProtectionGroupRequest = {
      val __obj = js.Dynamic.literal(
        "ProtectionGroupId" -> ProtectionGroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeProtectionGroupRequest]
    }
  }

  @js.native
  trait DescribeProtectionGroupResponse extends js.Object {
    var ProtectionGroup: ProtectionGroup
  }

  object DescribeProtectionGroupResponse {
    @inline
    def apply(
        ProtectionGroup: ProtectionGroup
    ): DescribeProtectionGroupResponse = {
      val __obj = js.Dynamic.literal(
        "ProtectionGroup" -> ProtectionGroup.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeProtectionGroupResponse]
    }
  }

  @js.native
  trait DescribeProtectionRequest extends js.Object {
    var ProtectionId: js.UndefOr[ProtectionId]
    var ResourceArn: js.UndefOr[ResourceArn]
  }

  object DescribeProtectionRequest {
    @inline
    def apply(
        ProtectionId: js.UndefOr[ProtectionId] = js.undefined,
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined
    ): DescribeProtectionRequest = {
      val __obj = js.Dynamic.literal()
      ProtectionId.foreach(__v => __obj.updateDynamic("ProtectionId")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProtectionRequest]
    }
  }

  @js.native
  trait DescribeProtectionResponse extends js.Object {
    var Protection: js.UndefOr[Protection]
  }

  object DescribeProtectionResponse {
    @inline
    def apply(
        Protection: js.UndefOr[Protection] = js.undefined
    ): DescribeProtectionResponse = {
      val __obj = js.Dynamic.literal()
      Protection.foreach(__v => __obj.updateDynamic("Protection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProtectionResponse]
    }
  }

  @js.native
  trait DescribeSubscriptionRequest extends js.Object

  object DescribeSubscriptionRequest {
    @inline
    def apply(): DescribeSubscriptionRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeSubscriptionRequest]
    }
  }

  @js.native
  trait DescribeSubscriptionResponse extends js.Object {
    var Subscription: js.UndefOr[Subscription]
  }

  object DescribeSubscriptionResponse {
    @inline
    def apply(
        Subscription: js.UndefOr[Subscription] = js.undefined
    ): DescribeSubscriptionResponse = {
      val __obj = js.Dynamic.literal()
      Subscription.foreach(__v => __obj.updateDynamic("Subscription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSubscriptionResponse]
    }
  }

  @js.native
  trait DisableApplicationLayerAutomaticResponseRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object DisableApplicationLayerAutomaticResponseRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn
    ): DisableApplicationLayerAutomaticResponseRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisableApplicationLayerAutomaticResponseRequest]
    }
  }

  @js.native
  trait DisableApplicationLayerAutomaticResponseResponse extends js.Object

  object DisableApplicationLayerAutomaticResponseResponse {
    @inline
    def apply(): DisableApplicationLayerAutomaticResponseResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisableApplicationLayerAutomaticResponseResponse]
    }
  }

  @js.native
  trait DisableProactiveEngagementRequest extends js.Object

  object DisableProactiveEngagementRequest {
    @inline
    def apply(): DisableProactiveEngagementRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisableProactiveEngagementRequest]
    }
  }

  @js.native
  trait DisableProactiveEngagementResponse extends js.Object

  object DisableProactiveEngagementResponse {
    @inline
    def apply(): DisableProactiveEngagementResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisableProactiveEngagementResponse]
    }
  }

  @js.native
  trait DisassociateDRTLogBucketRequest extends js.Object {
    var LogBucket: LogBucket
  }

  object DisassociateDRTLogBucketRequest {
    @inline
    def apply(
        LogBucket: LogBucket
    ): DisassociateDRTLogBucketRequest = {
      val __obj = js.Dynamic.literal(
        "LogBucket" -> LogBucket.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateDRTLogBucketRequest]
    }
  }

  @js.native
  trait DisassociateDRTLogBucketResponse extends js.Object

  object DisassociateDRTLogBucketResponse {
    @inline
    def apply(): DisassociateDRTLogBucketResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateDRTLogBucketResponse]
    }
  }

  @js.native
  trait DisassociateDRTRoleRequest extends js.Object

  object DisassociateDRTRoleRequest {
    @inline
    def apply(): DisassociateDRTRoleRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateDRTRoleRequest]
    }
  }

  @js.native
  trait DisassociateDRTRoleResponse extends js.Object

  object DisassociateDRTRoleResponse {
    @inline
    def apply(): DisassociateDRTRoleResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateDRTRoleResponse]
    }
  }

  @js.native
  trait DisassociateHealthCheckRequest extends js.Object {
    var HealthCheckArn: HealthCheckArn
    var ProtectionId: ProtectionId
  }

  object DisassociateHealthCheckRequest {
    @inline
    def apply(
        HealthCheckArn: HealthCheckArn,
        ProtectionId: ProtectionId
    ): DisassociateHealthCheckRequest = {
      val __obj = js.Dynamic.literal(
        "HealthCheckArn" -> HealthCheckArn.asInstanceOf[js.Any],
        "ProtectionId" -> ProtectionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateHealthCheckRequest]
    }
  }

  @js.native
  trait DisassociateHealthCheckResponse extends js.Object

  object DisassociateHealthCheckResponse {
    @inline
    def apply(): DisassociateHealthCheckResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateHealthCheckResponse]
    }
  }

  /** Contact information that the SRT can use to contact you if you have proactive engagement enabled, for escalations to the SRT and to initiate proactive customer support.
    */
  @js.native
  trait EmergencyContact extends js.Object {
    var EmailAddress: EmailAddress
    var ContactNotes: js.UndefOr[ContactNotes]
    var PhoneNumber: js.UndefOr[PhoneNumber]
  }

  object EmergencyContact {
    @inline
    def apply(
        EmailAddress: EmailAddress,
        ContactNotes: js.UndefOr[ContactNotes] = js.undefined,
        PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    ): EmergencyContact = {
      val __obj = js.Dynamic.literal(
        "EmailAddress" -> EmailAddress.asInstanceOf[js.Any]
      )

      ContactNotes.foreach(__v => __obj.updateDynamic("ContactNotes")(__v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmergencyContact]
    }
  }

  @js.native
  trait EnableApplicationLayerAutomaticResponseRequest extends js.Object {
    var Action: ResponseAction
    var ResourceArn: ResourceArn
  }

  object EnableApplicationLayerAutomaticResponseRequest {
    @inline
    def apply(
        Action: ResponseAction,
        ResourceArn: ResourceArn
    ): EnableApplicationLayerAutomaticResponseRequest = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EnableApplicationLayerAutomaticResponseRequest]
    }
  }

  @js.native
  trait EnableApplicationLayerAutomaticResponseResponse extends js.Object

  object EnableApplicationLayerAutomaticResponseResponse {
    @inline
    def apply(): EnableApplicationLayerAutomaticResponseResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnableApplicationLayerAutomaticResponseResponse]
    }
  }

  @js.native
  trait EnableProactiveEngagementRequest extends js.Object

  object EnableProactiveEngagementRequest {
    @inline
    def apply(): EnableProactiveEngagementRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnableProactiveEngagementRequest]
    }
  }

  @js.native
  trait EnableProactiveEngagementResponse extends js.Object

  object EnableProactiveEngagementResponse {
    @inline
    def apply(): EnableProactiveEngagementResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnableProactiveEngagementResponse]
    }
  }

  @js.native
  trait GetSubscriptionStateRequest extends js.Object

  object GetSubscriptionStateRequest {
    @inline
    def apply(): GetSubscriptionStateRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSubscriptionStateRequest]
    }
  }

  @js.native
  trait GetSubscriptionStateResponse extends js.Object {
    var SubscriptionState: SubscriptionState
  }

  object GetSubscriptionStateResponse {
    @inline
    def apply(
        SubscriptionState: SubscriptionState
    ): GetSubscriptionStateResponse = {
      val __obj = js.Dynamic.literal(
        "SubscriptionState" -> SubscriptionState.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSubscriptionStateResponse]
    }
  }

  /** Specifies how many protections of a given type you can create.
    */
  @js.native
  trait Limit extends js.Object {
    var Max: js.UndefOr[Double]
    var Type: js.UndefOr[String]
  }

  object Limit {
    @inline
    def apply(
        Max: js.UndefOr[Double] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
    ): Limit = {
      val __obj = js.Dynamic.literal()
      Max.foreach(__v => __obj.updateDynamic("Max")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Limit]
    }
  }

  @js.native
  trait ListAttacksRequest extends js.Object {
    var EndTime: js.UndefOr[TimeRange]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
    var ResourceArns: js.UndefOr[ResourceArnFilterList]
    var StartTime: js.UndefOr[TimeRange]
  }

  object ListAttacksRequest {
    @inline
    def apply(
        EndTime: js.UndefOr[TimeRange] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        ResourceArns: js.UndefOr[ResourceArnFilterList] = js.undefined,
        StartTime: js.UndefOr[TimeRange] = js.undefined
    ): ListAttacksRequest = {
      val __obj = js.Dynamic.literal()
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceArns.foreach(__v => __obj.updateDynamic("ResourceArns")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttacksRequest]
    }
  }

  @js.native
  trait ListAttacksResponse extends js.Object {
    var AttackSummaries: js.UndefOr[AttackSummaries]
    var NextToken: js.UndefOr[Token]
  }

  object ListAttacksResponse {
    @inline
    def apply(
        AttackSummaries: js.UndefOr[AttackSummaries] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListAttacksResponse = {
      val __obj = js.Dynamic.literal()
      AttackSummaries.foreach(__v => __obj.updateDynamic("AttackSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttacksResponse]
    }
  }

  @js.native
  trait ListProtectionGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListProtectionGroupsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListProtectionGroupsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProtectionGroupsRequest]
    }
  }

  @js.native
  trait ListProtectionGroupsResponse extends js.Object {
    var ProtectionGroups: ProtectionGroups
    var NextToken: js.UndefOr[Token]
  }

  object ListProtectionGroupsResponse {
    @inline
    def apply(
        ProtectionGroups: ProtectionGroups,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListProtectionGroupsResponse = {
      val __obj = js.Dynamic.literal(
        "ProtectionGroups" -> ProtectionGroups.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProtectionGroupsResponse]
    }
  }

  @js.native
  trait ListProtectionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListProtectionsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListProtectionsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProtectionsRequest]
    }
  }

  @js.native
  trait ListProtectionsResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Protections: js.UndefOr[Protections]
  }

  object ListProtectionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        Protections: js.UndefOr[Protections] = js.undefined
    ): ListProtectionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Protections.foreach(__v => __obj.updateDynamic("Protections")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProtectionsResponse]
    }
  }

  @js.native
  trait ListResourcesInProtectionGroupRequest extends js.Object {
    var ProtectionGroupId: ProtectionGroupId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListResourcesInProtectionGroupRequest {
    @inline
    def apply(
        ProtectionGroupId: ProtectionGroupId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListResourcesInProtectionGroupRequest = {
      val __obj = js.Dynamic.literal(
        "ProtectionGroupId" -> ProtectionGroupId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourcesInProtectionGroupRequest]
    }
  }

  @js.native
  trait ListResourcesInProtectionGroupResponse extends js.Object {
    var ResourceArns: ResourceArnList
    var NextToken: js.UndefOr[Token]
  }

  object ListResourcesInProtectionGroupResponse {
    @inline
    def apply(
        ResourceArns: ResourceArnList,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListResourcesInProtectionGroupResponse = {
      val __obj = js.Dynamic.literal(
        "ResourceArns" -> ResourceArns.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourcesInProtectionGroupResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: ResourceArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceARN: ResourceArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** The mitigation applied to a DDoS attack.
    */
  @js.native
  trait Mitigation extends js.Object {
    var MitigationName: js.UndefOr[String]
  }

  object Mitigation {
    @inline
    def apply(
        MitigationName: js.UndefOr[String] = js.undefined
    ): Mitigation = {
      val __obj = js.Dynamic.literal()
      MitigationName.foreach(__v => __obj.updateDynamic("MitigationName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Mitigation]
    }
  }

  /** An object that represents a resource that is under DDoS protection.
    */
  @js.native
  trait Protection extends js.Object {
    var ApplicationLayerAutomaticResponseConfiguration: js.UndefOr[ApplicationLayerAutomaticResponseConfiguration]
    var HealthCheckIds: js.UndefOr[HealthCheckIds]
    var Id: js.UndefOr[ProtectionId]
    var Name: js.UndefOr[ProtectionName]
    var ProtectionArn: js.UndefOr[ResourceArn]
    var ResourceArn: js.UndefOr[ResourceArn]
  }

  object Protection {
    @inline
    def apply(
        ApplicationLayerAutomaticResponseConfiguration: js.UndefOr[ApplicationLayerAutomaticResponseConfiguration] = js.undefined,
        HealthCheckIds: js.UndefOr[HealthCheckIds] = js.undefined,
        Id: js.UndefOr[ProtectionId] = js.undefined,
        Name: js.UndefOr[ProtectionName] = js.undefined,
        ProtectionArn: js.UndefOr[ResourceArn] = js.undefined,
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined
    ): Protection = {
      val __obj = js.Dynamic.literal()
      ApplicationLayerAutomaticResponseConfiguration.foreach(__v => __obj.updateDynamic("ApplicationLayerAutomaticResponseConfiguration")(__v.asInstanceOf[js.Any]))
      HealthCheckIds.foreach(__v => __obj.updateDynamic("HealthCheckIds")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ProtectionArn.foreach(__v => __obj.updateDynamic("ProtectionArn")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Protection]
    }
  }

  /** A grouping of protected resources that you and Shield Advanced can monitor as a collective. This resource grouping improves the accuracy of detection and reduces false positives.
    */
  @js.native
  trait ProtectionGroup extends js.Object {
    var Aggregation: ProtectionGroupAggregation
    var Members: ProtectionGroupMembers
    var Pattern: ProtectionGroupPattern
    var ProtectionGroupId: ProtectionGroupId
    var ProtectionGroupArn: js.UndefOr[ResourceArn]
    var ResourceType: js.UndefOr[ProtectedResourceType]
  }

  object ProtectionGroup {
    @inline
    def apply(
        Aggregation: ProtectionGroupAggregation,
        Members: ProtectionGroupMembers,
        Pattern: ProtectionGroupPattern,
        ProtectionGroupId: ProtectionGroupId,
        ProtectionGroupArn: js.UndefOr[ResourceArn] = js.undefined,
        ResourceType: js.UndefOr[ProtectedResourceType] = js.undefined
    ): ProtectionGroup = {
      val __obj = js.Dynamic.literal(
        "Aggregation" -> Aggregation.asInstanceOf[js.Any],
        "Members" -> Members.asInstanceOf[js.Any],
        "Pattern" -> Pattern.asInstanceOf[js.Any],
        "ProtectionGroupId" -> ProtectionGroupId.asInstanceOf[js.Any]
      )

      ProtectionGroupArn.foreach(__v => __obj.updateDynamic("ProtectionGroupArn")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProtectionGroup]
    }
  }

  /** Limits settings on protection groups with arbitrary pattern type.
    */
  @js.native
  trait ProtectionGroupArbitraryPatternLimits extends js.Object {
    var MaxMembers: Double
  }

  object ProtectionGroupArbitraryPatternLimits {
    @inline
    def apply(
        MaxMembers: Double
    ): ProtectionGroupArbitraryPatternLimits = {
      val __obj = js.Dynamic.literal(
        "MaxMembers" -> MaxMembers.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ProtectionGroupArbitraryPatternLimits]
    }
  }

  /** Limits settings on protection groups for your subscription.
    */
  @js.native
  trait ProtectionGroupLimits extends js.Object {
    var MaxProtectionGroups: Double
    var PatternTypeLimits: ProtectionGroupPatternTypeLimits
  }

  object ProtectionGroupLimits {
    @inline
    def apply(
        MaxProtectionGroups: Double,
        PatternTypeLimits: ProtectionGroupPatternTypeLimits
    ): ProtectionGroupLimits = {
      val __obj = js.Dynamic.literal(
        "MaxProtectionGroups" -> MaxProtectionGroups.asInstanceOf[js.Any],
        "PatternTypeLimits" -> PatternTypeLimits.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ProtectionGroupLimits]
    }
  }

  /** Limits settings by pattern type in the protection groups for your subscription.
    */
  @js.native
  trait ProtectionGroupPatternTypeLimits extends js.Object {
    var ArbitraryPatternLimits: ProtectionGroupArbitraryPatternLimits
  }

  object ProtectionGroupPatternTypeLimits {
    @inline
    def apply(
        ArbitraryPatternLimits: ProtectionGroupArbitraryPatternLimits
    ): ProtectionGroupPatternTypeLimits = {
      val __obj = js.Dynamic.literal(
        "ArbitraryPatternLimits" -> ArbitraryPatternLimits.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ProtectionGroupPatternTypeLimits]
    }
  }

  /** Limits settings on protections for your subscription.
    */
  @js.native
  trait ProtectionLimits extends js.Object {
    var ProtectedResourceTypeLimits: Limits
  }

  object ProtectionLimits {
    @inline
    def apply(
        ProtectedResourceTypeLimits: Limits
    ): ProtectionLimits = {
      val __obj = js.Dynamic.literal(
        "ProtectedResourceTypeLimits" -> ProtectedResourceTypeLimits.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ProtectionLimits]
    }
  }

  /** Specifies the action setting that Shield Advanced should use in the WAF rules that it creates on behalf of the protected resource in response to DDoS attacks. You specify this as part of the configuration for the automatic application layer DDoS mitigation feature, when you enable or update automatic mitigation. Shield Advanced creates the WAF rules in a Shield Advanced-managed rule group, inside the web ACL that you have associated with the resource.
    */
  @js.native
  trait ResponseAction extends js.Object {
    var Block: js.UndefOr[BlockAction]
    var Count: js.UndefOr[CountAction]
  }

  object ResponseAction {
    @inline
    def apply(
        Block: js.UndefOr[BlockAction] = js.undefined,
        Count: js.UndefOr[CountAction] = js.undefined
    ): ResponseAction = {
      val __obj = js.Dynamic.literal()
      Block.foreach(__v => __obj.updateDynamic("Block")(__v.asInstanceOf[js.Any]))
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResponseAction]
    }
  }

  /** The attack information for the specified SubResource.
    */
  @js.native
  trait SubResourceSummary extends js.Object {
    var AttackVectors: js.UndefOr[SummarizedAttackVectorList]
    var Counters: js.UndefOr[SummarizedCounterList]
    var Id: js.UndefOr[String]
    var Type: js.UndefOr[SubResourceType]
  }

  object SubResourceSummary {
    @inline
    def apply(
        AttackVectors: js.UndefOr[SummarizedAttackVectorList] = js.undefined,
        Counters: js.UndefOr[SummarizedCounterList] = js.undefined,
        Id: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[SubResourceType] = js.undefined
    ): SubResourceSummary = {
      val __obj = js.Dynamic.literal()
      AttackVectors.foreach(__v => __obj.updateDynamic("AttackVectors")(__v.asInstanceOf[js.Any]))
      Counters.foreach(__v => __obj.updateDynamic("Counters")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubResourceSummary]
    }
  }

  /** Information about the Shield Advanced subscription for an account.
    */
  @js.native
  trait Subscription extends js.Object {
    var SubscriptionLimits: SubscriptionLimits
    var AutoRenew: js.UndefOr[AutoRenew]
    var EndTime: js.UndefOr[Timestamp]
    var Limits: js.UndefOr[Limits]
    var ProactiveEngagementStatus: js.UndefOr[ProactiveEngagementStatus]
    var StartTime: js.UndefOr[Timestamp]
    var SubscriptionArn: js.UndefOr[ResourceArn]
    var TimeCommitmentInSeconds: js.UndefOr[DurationInSeconds]
  }

  object Subscription {
    @inline
    def apply(
        SubscriptionLimits: SubscriptionLimits,
        AutoRenew: js.UndefOr[AutoRenew] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        Limits: js.UndefOr[Limits] = js.undefined,
        ProactiveEngagementStatus: js.UndefOr[ProactiveEngagementStatus] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined,
        SubscriptionArn: js.UndefOr[ResourceArn] = js.undefined,
        TimeCommitmentInSeconds: js.UndefOr[DurationInSeconds] = js.undefined
    ): Subscription = {
      val __obj = js.Dynamic.literal(
        "SubscriptionLimits" -> SubscriptionLimits.asInstanceOf[js.Any]
      )

      AutoRenew.foreach(__v => __obj.updateDynamic("AutoRenew")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      Limits.foreach(__v => __obj.updateDynamic("Limits")(__v.asInstanceOf[js.Any]))
      ProactiveEngagementStatus.foreach(__v => __obj.updateDynamic("ProactiveEngagementStatus")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      SubscriptionArn.foreach(__v => __obj.updateDynamic("SubscriptionArn")(__v.asInstanceOf[js.Any]))
      TimeCommitmentInSeconds.foreach(__v => __obj.updateDynamic("TimeCommitmentInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Subscription]
    }
  }

  /** Limits settings for your subscription.
    */
  @js.native
  trait SubscriptionLimits extends js.Object {
    var ProtectionGroupLimits: ProtectionGroupLimits
    var ProtectionLimits: ProtectionLimits
  }

  object SubscriptionLimits {
    @inline
    def apply(
        ProtectionGroupLimits: ProtectionGroupLimits,
        ProtectionLimits: ProtectionLimits
    ): SubscriptionLimits = {
      val __obj = js.Dynamic.literal(
        "ProtectionGroupLimits" -> ProtectionGroupLimits.asInstanceOf[js.Any],
        "ProtectionLimits" -> ProtectionLimits.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SubscriptionLimits]
    }
  }

  /** A summary of information about the attack.
    */
  @js.native
  trait SummarizedAttackVector extends js.Object {
    var VectorType: String
    var VectorCounters: js.UndefOr[SummarizedCounterList]
  }

  object SummarizedAttackVector {
    @inline
    def apply(
        VectorType: String,
        VectorCounters: js.UndefOr[SummarizedCounterList] = js.undefined
    ): SummarizedAttackVector = {
      val __obj = js.Dynamic.literal(
        "VectorType" -> VectorType.asInstanceOf[js.Any]
      )

      VectorCounters.foreach(__v => __obj.updateDynamic("VectorCounters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SummarizedAttackVector]
    }
  }

  /** The counter that describes a DDoS attack.
    */
  @js.native
  trait SummarizedCounter extends js.Object {
    var Average: js.UndefOr[Double]
    var Max: js.UndefOr[Double]
    var N: js.UndefOr[Int]
    var Name: js.UndefOr[String]
    var Sum: js.UndefOr[Double]
    var Unit: js.UndefOr[String]
  }

  object SummarizedCounter {
    @inline
    def apply(
        Average: js.UndefOr[Double] = js.undefined,
        Max: js.UndefOr[Double] = js.undefined,
        N: js.UndefOr[Int] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Sum: js.UndefOr[Double] = js.undefined,
        Unit: js.UndefOr[String] = js.undefined
    ): SummarizedCounter = {
      val __obj = js.Dynamic.literal()
      Average.foreach(__v => __obj.updateDynamic("Average")(__v.asInstanceOf[js.Any]))
      Max.foreach(__v => __obj.updateDynamic("Max")(__v.asInstanceOf[js.Any]))
      N.foreach(__v => __obj.updateDynamic("N")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Sum.foreach(__v => __obj.updateDynamic("Sum")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SummarizedCounter]
    }
  }

  /** A tag associated with an Amazon Web Services resource. Tags are key:value pairs that you can use to categorize and manage your resources, for purposes like billing or other management. Typically, the tag key represents a category, such as "environment", and the tag value represents a specific value within that category, such as "test," "development," or "production". Or you might set the tag key to "customer" and the value to the customer name or ID. You can specify one or more tags to add to each Amazon Web Services resource, up to 50 tags for a resource.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceARN: ResourceArn
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceARN: ResourceArn,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
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

  /** The time range.
    */
  @js.native
  trait TimeRange extends js.Object {
    var FromInclusive: js.UndefOr[Timestamp]
    var ToExclusive: js.UndefOr[Timestamp]
  }

  object TimeRange {
    @inline
    def apply(
        FromInclusive: js.UndefOr[Timestamp] = js.undefined,
        ToExclusive: js.UndefOr[Timestamp] = js.undefined
    ): TimeRange = {
      val __obj = js.Dynamic.literal()
      FromInclusive.foreach(__v => __obj.updateDynamic("FromInclusive")(__v.asInstanceOf[js.Any]))
      ToExclusive.foreach(__v => __obj.updateDynamic("ToExclusive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeRange]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: ResourceArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceARN: ResourceArn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
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
  trait UpdateApplicationLayerAutomaticResponseRequest extends js.Object {
    var Action: ResponseAction
    var ResourceArn: ResourceArn
  }

  object UpdateApplicationLayerAutomaticResponseRequest {
    @inline
    def apply(
        Action: ResponseAction,
        ResourceArn: ResourceArn
    ): UpdateApplicationLayerAutomaticResponseRequest = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateApplicationLayerAutomaticResponseRequest]
    }
  }

  @js.native
  trait UpdateApplicationLayerAutomaticResponseResponse extends js.Object

  object UpdateApplicationLayerAutomaticResponseResponse {
    @inline
    def apply(): UpdateApplicationLayerAutomaticResponseResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateApplicationLayerAutomaticResponseResponse]
    }
  }

  @js.native
  trait UpdateEmergencyContactSettingsRequest extends js.Object {
    var EmergencyContactList: js.UndefOr[EmergencyContactList]
  }

  object UpdateEmergencyContactSettingsRequest {
    @inline
    def apply(
        EmergencyContactList: js.UndefOr[EmergencyContactList] = js.undefined
    ): UpdateEmergencyContactSettingsRequest = {
      val __obj = js.Dynamic.literal()
      EmergencyContactList.foreach(__v => __obj.updateDynamic("EmergencyContactList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEmergencyContactSettingsRequest]
    }
  }

  @js.native
  trait UpdateEmergencyContactSettingsResponse extends js.Object

  object UpdateEmergencyContactSettingsResponse {
    @inline
    def apply(): UpdateEmergencyContactSettingsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateEmergencyContactSettingsResponse]
    }
  }

  @js.native
  trait UpdateProtectionGroupRequest extends js.Object {
    var Aggregation: ProtectionGroupAggregation
    var Pattern: ProtectionGroupPattern
    var ProtectionGroupId: ProtectionGroupId
    var Members: js.UndefOr[ProtectionGroupMembers]
    var ResourceType: js.UndefOr[ProtectedResourceType]
  }

  object UpdateProtectionGroupRequest {
    @inline
    def apply(
        Aggregation: ProtectionGroupAggregation,
        Pattern: ProtectionGroupPattern,
        ProtectionGroupId: ProtectionGroupId,
        Members: js.UndefOr[ProtectionGroupMembers] = js.undefined,
        ResourceType: js.UndefOr[ProtectedResourceType] = js.undefined
    ): UpdateProtectionGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Aggregation" -> Aggregation.asInstanceOf[js.Any],
        "Pattern" -> Pattern.asInstanceOf[js.Any],
        "ProtectionGroupId" -> ProtectionGroupId.asInstanceOf[js.Any]
      )

      Members.foreach(__v => __obj.updateDynamic("Members")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProtectionGroupRequest]
    }
  }

  @js.native
  trait UpdateProtectionGroupResponse extends js.Object

  object UpdateProtectionGroupResponse {
    @inline
    def apply(): UpdateProtectionGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateProtectionGroupResponse]
    }
  }

  @js.native
  trait UpdateSubscriptionRequest extends js.Object {
    var AutoRenew: js.UndefOr[AutoRenew]
  }

  object UpdateSubscriptionRequest {
    @inline
    def apply(
        AutoRenew: js.UndefOr[AutoRenew] = js.undefined
    ): UpdateSubscriptionRequest = {
      val __obj = js.Dynamic.literal()
      AutoRenew.foreach(__v => __obj.updateDynamic("AutoRenew")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSubscriptionRequest]
    }
  }

  @js.native
  trait UpdateSubscriptionResponse extends js.Object

  object UpdateSubscriptionResponse {
    @inline
    def apply(): UpdateSubscriptionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateSubscriptionResponse]
    }
  }
}
