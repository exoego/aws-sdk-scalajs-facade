package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object dlm {
  type ActionList = js.Array[Action]
  type ActionName = String
  type AvailabilityZone = String
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type AwsAccountId = String
  type CmkArn = String
  type CopyTags = Boolean
  type CopyTagsNullable = Boolean
  type Count = Int
  type CronExpression = String
  type CrossRegionCopyActionList = js.Array[CrossRegionCopyAction]
  type CrossRegionCopyRules = js.Array[CrossRegionCopyRule]
  type DescriptionRegex = String
  type Encrypted = Boolean
  type ExcludeBootVolume = Boolean
  type ExcludeDataVolumeTagList = js.Array[Tag]
  type ExecutionRoleArn = String
  type Interval = Int
  type LifecyclePolicySummaryList = js.Array[LifecyclePolicySummary]
  type NoReboot = Boolean
  type PolicyArn = String
  type PolicyDescription = String
  type PolicyId = String
  type PolicyIdList = js.Array[PolicyId]
  type ResourceLocationList = js.Array[ResourceLocationValues]
  type ResourceTypeValuesList = js.Array[ResourceTypeValues]
  type ScheduleList = js.Array[Schedule]
  type ScheduleName = String
  type ShareRules = js.Array[ShareRule]
  type ShareTargetAccountList = js.Array[AwsAccountId]
  type SnapshotOwnerList = js.Array[AwsAccountId]
  type StandardTierRetainRuleCount = Int
  type StandardTierRetainRuleInterval = Int
  type StatusMessage = String
  type TagFilter = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type TagsToAddFilterList = js.Array[TagFilter]
  type TagsToAddList = js.Array[Tag]
  type Target = String
  type TargetRegion = String
  type TargetTagList = js.Array[Tag]
  type TargetTagsFilterList = js.Array[TagFilter]
  type Time = String
  type TimesList = js.Array[Time]
  type Timestamp = js.Date
  type VariableTagsList = js.Array[Tag]

  final class DLMOps(private val service: DLM) extends AnyVal {

    @inline def createLifecyclePolicyFuture(params: CreateLifecyclePolicyRequest): Future[CreateLifecyclePolicyResponse] = service.createLifecyclePolicy(params).promise().toFuture
    @inline def deleteLifecyclePolicyFuture(params: DeleteLifecyclePolicyRequest): Future[DeleteLifecyclePolicyResponse] = service.deleteLifecyclePolicy(params).promise().toFuture
    @inline def getLifecyclePoliciesFuture(params: GetLifecyclePoliciesRequest): Future[GetLifecyclePoliciesResponse] = service.getLifecyclePolicies(params).promise().toFuture
    @inline def getLifecyclePolicyFuture(params: GetLifecyclePolicyRequest): Future[GetLifecyclePolicyResponse] = service.getLifecyclePolicy(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateLifecyclePolicyFuture(params: UpdateLifecyclePolicyRequest): Future[UpdateLifecyclePolicyResponse] = service.updateLifecyclePolicy(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/dlm", JSImport.Namespace, "AWS.DLM")
  class DLM() extends js.Object {
    def this(config: AWSConfig) = this()

    def createLifecyclePolicy(params: CreateLifecyclePolicyRequest): Request[CreateLifecyclePolicyResponse] = js.native
    def deleteLifecyclePolicy(params: DeleteLifecyclePolicyRequest): Request[DeleteLifecyclePolicyResponse] = js.native
    def getLifecyclePolicies(params: GetLifecyclePoliciesRequest): Request[GetLifecyclePoliciesResponse] = js.native
    def getLifecyclePolicy(params: GetLifecyclePolicyRequest): Request[GetLifecyclePolicyResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateLifecyclePolicy(params: UpdateLifecyclePolicyRequest): Request[UpdateLifecyclePolicyResponse] = js.native
  }
  object DLM {
    @inline implicit def toOps(service: DLM): DLMOps = {
      new DLMOps(service)
    }
  }

  /** \```[Event-based policies only]``` Specifies an action for an event-based policy.
    */
  @js.native
  trait Action extends js.Object {
    var CrossRegionCopy: CrossRegionCopyActionList
    var Name: ActionName
  }

  object Action {
    @inline
    def apply(
        CrossRegionCopy: CrossRegionCopyActionList,
        Name: ActionName
    ): Action = {
      val __obj = js.Dynamic.literal(
        "CrossRegionCopy" -> CrossRegionCopy.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Action]
    }
  }

  /** \```[Snapshot policies only]``` Specifies information about the archive storage tier retention period.
    */
  @js.native
  trait ArchiveRetainRule extends js.Object {
    var RetentionArchiveTier: RetentionArchiveTier
  }

  object ArchiveRetainRule {
    @inline
    def apply(
        RetentionArchiveTier: RetentionArchiveTier
    ): ArchiveRetainRule = {
      val __obj = js.Dynamic.literal(
        "RetentionArchiveTier" -> RetentionArchiveTier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ArchiveRetainRule]
    }
  }

  /** \```[Snapshot policies only]``` Specifies a snapshot archiving rule for a schedule.
    */
  @js.native
  trait ArchiveRule extends js.Object {
    var RetainRule: ArchiveRetainRule
  }

  object ArchiveRule {
    @inline
    def apply(
        RetainRule: ArchiveRetainRule
    ): ArchiveRule = {
      val __obj = js.Dynamic.literal(
        "RetainRule" -> RetainRule.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ArchiveRule]
    }
  }

  @js.native
  trait CreateLifecyclePolicyRequest extends js.Object {
    var Description: PolicyDescription
    var ExecutionRoleArn: ExecutionRoleArn
    var PolicyDetails: PolicyDetails
    var State: SettablePolicyStateValues
    var Tags: js.UndefOr[TagMap]
  }

  object CreateLifecyclePolicyRequest {
    @inline
    def apply(
        Description: PolicyDescription,
        ExecutionRoleArn: ExecutionRoleArn,
        PolicyDetails: PolicyDetails,
        State: SettablePolicyStateValues,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateLifecyclePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Description" -> Description.asInstanceOf[js.Any],
        "ExecutionRoleArn" -> ExecutionRoleArn.asInstanceOf[js.Any],
        "PolicyDetails" -> PolicyDetails.asInstanceOf[js.Any],
        "State" -> State.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLifecyclePolicyRequest]
    }
  }

  @js.native
  trait CreateLifecyclePolicyResponse extends js.Object {
    var PolicyId: js.UndefOr[PolicyId]
  }

  object CreateLifecyclePolicyResponse {
    @inline
    def apply(
        PolicyId: js.UndefOr[PolicyId] = js.undefined
    ): CreateLifecyclePolicyResponse = {
      val __obj = js.Dynamic.literal()
      PolicyId.foreach(__v => __obj.updateDynamic("PolicyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLifecyclePolicyResponse]
    }
  }

  /** \```[Snapshot and AMI policies only]``` Specifies when the policy should create snapshots or AMIs.
    *
    * '''Note:'''* You must specify either ```CronExpression```, or ```Interval```, ```IntervalUnit```, and ```Times```. * If you need to specify an <a>ArchiveRule</a> for the schedule, then you must specify a creation frequency of at least 28 days.
    */
  @js.native
  trait CreateRule extends js.Object {
    var CronExpression: js.UndefOr[CronExpression]
    var Interval: js.UndefOr[Interval]
    var IntervalUnit: js.UndefOr[IntervalUnitValues]
    var Location: js.UndefOr[LocationValues]
    var Times: js.UndefOr[TimesList]
  }

  object CreateRule {
    @inline
    def apply(
        CronExpression: js.UndefOr[CronExpression] = js.undefined,
        Interval: js.UndefOr[Interval] = js.undefined,
        IntervalUnit: js.UndefOr[IntervalUnitValues] = js.undefined,
        Location: js.UndefOr[LocationValues] = js.undefined,
        Times: js.UndefOr[TimesList] = js.undefined
    ): CreateRule = {
      val __obj = js.Dynamic.literal()
      CronExpression.foreach(__v => __obj.updateDynamic("CronExpression")(__v.asInstanceOf[js.Any]))
      Interval.foreach(__v => __obj.updateDynamic("Interval")(__v.asInstanceOf[js.Any]))
      IntervalUnit.foreach(__v => __obj.updateDynamic("IntervalUnit")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      Times.foreach(__v => __obj.updateDynamic("Times")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRule]
    }
  }

  /** \```[Event-based policies only]``` Specifies a cross-Region copy action for event-based policies.
    *
    * '''Note:'''To specify a cross-Region copy rule for snapshot and AMI policies, use <a>CrossRegionCopyRule</a>.
    */
  @js.native
  trait CrossRegionCopyAction extends js.Object {
    var EncryptionConfiguration: EncryptionConfiguration
    var Target: Target
    var RetainRule: js.UndefOr[CrossRegionCopyRetainRule]
  }

  object CrossRegionCopyAction {
    @inline
    def apply(
        EncryptionConfiguration: EncryptionConfiguration,
        Target: Target,
        RetainRule: js.UndefOr[CrossRegionCopyRetainRule] = js.undefined
    ): CrossRegionCopyAction = {
      val __obj = js.Dynamic.literal(
        "EncryptionConfiguration" -> EncryptionConfiguration.asInstanceOf[js.Any],
        "Target" -> Target.asInstanceOf[js.Any]
      )

      RetainRule.foreach(__v => __obj.updateDynamic("RetainRule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CrossRegionCopyAction]
    }
  }

  /** \```[AMI policies only]``` Specifies an AMI deprecation rule for cross-Region AMI copies created by an AMI policy.
    */
  @js.native
  trait CrossRegionCopyDeprecateRule extends js.Object {
    var Interval: js.UndefOr[Interval]
    var IntervalUnit: js.UndefOr[RetentionIntervalUnitValues]
  }

  object CrossRegionCopyDeprecateRule {
    @inline
    def apply(
        Interval: js.UndefOr[Interval] = js.undefined,
        IntervalUnit: js.UndefOr[RetentionIntervalUnitValues] = js.undefined
    ): CrossRegionCopyDeprecateRule = {
      val __obj = js.Dynamic.literal()
      Interval.foreach(__v => __obj.updateDynamic("Interval")(__v.asInstanceOf[js.Any]))
      IntervalUnit.foreach(__v => __obj.updateDynamic("IntervalUnit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CrossRegionCopyDeprecateRule]
    }
  }

  /** Specifies a retention rule for cross-Region snapshot copies created by snapshot or event-based policies, or cross-Region AMI copies created by AMI policies. After the retention period expires, the cross-Region copy is deleted.
    */
  @js.native
  trait CrossRegionCopyRetainRule extends js.Object {
    var Interval: js.UndefOr[Interval]
    var IntervalUnit: js.UndefOr[RetentionIntervalUnitValues]
  }

  object CrossRegionCopyRetainRule {
    @inline
    def apply(
        Interval: js.UndefOr[Interval] = js.undefined,
        IntervalUnit: js.UndefOr[RetentionIntervalUnitValues] = js.undefined
    ): CrossRegionCopyRetainRule = {
      val __obj = js.Dynamic.literal()
      Interval.foreach(__v => __obj.updateDynamic("Interval")(__v.asInstanceOf[js.Any]))
      IntervalUnit.foreach(__v => __obj.updateDynamic("IntervalUnit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CrossRegionCopyRetainRule]
    }
  }

  /** \```[Snapshot and AMI policies only]``` Specifies a cross-Region copy rule for snapshot and AMI policies.
    *
    * '''Note:'''To specify a cross-Region copy action for event-based polices, use <a>CrossRegionCopyAction</a>.
    */
  @js.native
  trait CrossRegionCopyRule extends js.Object {
    var Encrypted: Encrypted
    var CmkArn: js.UndefOr[CmkArn]
    var CopyTags: js.UndefOr[CopyTagsNullable]
    var DeprecateRule: js.UndefOr[CrossRegionCopyDeprecateRule]
    var RetainRule: js.UndefOr[CrossRegionCopyRetainRule]
    var Target: js.UndefOr[Target]
    var TargetRegion: js.UndefOr[TargetRegion]
  }

  object CrossRegionCopyRule {
    @inline
    def apply(
        Encrypted: Encrypted,
        CmkArn: js.UndefOr[CmkArn] = js.undefined,
        CopyTags: js.UndefOr[CopyTagsNullable] = js.undefined,
        DeprecateRule: js.UndefOr[CrossRegionCopyDeprecateRule] = js.undefined,
        RetainRule: js.UndefOr[CrossRegionCopyRetainRule] = js.undefined,
        Target: js.UndefOr[Target] = js.undefined,
        TargetRegion: js.UndefOr[TargetRegion] = js.undefined
    ): CrossRegionCopyRule = {
      val __obj = js.Dynamic.literal(
        "Encrypted" -> Encrypted.asInstanceOf[js.Any]
      )

      CmkArn.foreach(__v => __obj.updateDynamic("CmkArn")(__v.asInstanceOf[js.Any]))
      CopyTags.foreach(__v => __obj.updateDynamic("CopyTags")(__v.asInstanceOf[js.Any]))
      DeprecateRule.foreach(__v => __obj.updateDynamic("DeprecateRule")(__v.asInstanceOf[js.Any]))
      RetainRule.foreach(__v => __obj.updateDynamic("RetainRule")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      TargetRegion.foreach(__v => __obj.updateDynamic("TargetRegion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CrossRegionCopyRule]
    }
  }

  @js.native
  trait DeleteLifecyclePolicyRequest extends js.Object {
    var PolicyId: PolicyId
  }

  object DeleteLifecyclePolicyRequest {
    @inline
    def apply(
        PolicyId: PolicyId
    ): DeleteLifecyclePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "PolicyId" -> PolicyId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteLifecyclePolicyRequest]
    }
  }

  @js.native
  trait DeleteLifecyclePolicyResponse extends js.Object

  object DeleteLifecyclePolicyResponse {
    @inline
    def apply(): DeleteLifecyclePolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteLifecyclePolicyResponse]
    }
  }

  /** \```[AMI policies only]``` Specifies an AMI deprecation rule for AMIs created by an AMI lifecycle policy. For age-based schedules, you must specify ```Interval``` and ```IntervalUnit```. For count-based schedules, you must specify ```Count```.
    */
  @js.native
  trait DeprecateRule extends js.Object {
    var Count: js.UndefOr[Count]
    var Interval: js.UndefOr[Interval]
    var IntervalUnit: js.UndefOr[RetentionIntervalUnitValues]
  }

  object DeprecateRule {
    @inline
    def apply(
        Count: js.UndefOr[Count] = js.undefined,
        Interval: js.UndefOr[Interval] = js.undefined,
        IntervalUnit: js.UndefOr[RetentionIntervalUnitValues] = js.undefined
    ): DeprecateRule = {
      val __obj = js.Dynamic.literal()
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      Interval.foreach(__v => __obj.updateDynamic("Interval")(__v.asInstanceOf[js.Any]))
      IntervalUnit.foreach(__v => __obj.updateDynamic("IntervalUnit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeprecateRule]
    }
  }

  /** \```[Event-based policies only]``` Specifies the encryption settings for cross-Region snapshot copies created by event-based policies.
    */
  @js.native
  trait EncryptionConfiguration extends js.Object {
    var Encrypted: Encrypted
    var CmkArn: js.UndefOr[CmkArn]
  }

  object EncryptionConfiguration {
    @inline
    def apply(
        Encrypted: Encrypted,
        CmkArn: js.UndefOr[CmkArn] = js.undefined
    ): EncryptionConfiguration = {
      val __obj = js.Dynamic.literal(
        "Encrypted" -> Encrypted.asInstanceOf[js.Any]
      )

      CmkArn.foreach(__v => __obj.updateDynamic("CmkArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptionConfiguration]
    }
  }

  /** \```[Event-based policies only]``` Specifies an event that activates an event-based policy.
    */
  @js.native
  trait EventParameters extends js.Object {
    var DescriptionRegex: DescriptionRegex
    var EventType: EventTypeValues
    var SnapshotOwner: SnapshotOwnerList
  }

  object EventParameters {
    @inline
    def apply(
        DescriptionRegex: DescriptionRegex,
        EventType: EventTypeValues,
        SnapshotOwner: SnapshotOwnerList
    ): EventParameters = {
      val __obj = js.Dynamic.literal(
        "DescriptionRegex" -> DescriptionRegex.asInstanceOf[js.Any],
        "EventType" -> EventType.asInstanceOf[js.Any],
        "SnapshotOwner" -> SnapshotOwner.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EventParameters]
    }
  }

  /** \```[Event-based policies only]``` Specifies an event that activates an event-based policy.
    */
  @js.native
  trait EventSource extends js.Object {
    var Type: EventSourceValues
    var Parameters: js.UndefOr[EventParameters]
  }

  object EventSource {
    @inline
    def apply(
        Type: EventSourceValues,
        Parameters: js.UndefOr[EventParameters] = js.undefined
    ): EventSource = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventSource]
    }
  }

  /** \```[Snapshot policies only]``` Specifies a rule for enabling fast snapshot restore for snapshots created by snapshot policies. You can enable fast snapshot restore based on either a count or a time interval.
    */
  @js.native
  trait FastRestoreRule extends js.Object {
    var AvailabilityZones: AvailabilityZoneList
    var Count: js.UndefOr[Count]
    var Interval: js.UndefOr[Interval]
    var IntervalUnit: js.UndefOr[RetentionIntervalUnitValues]
  }

  object FastRestoreRule {
    @inline
    def apply(
        AvailabilityZones: AvailabilityZoneList,
        Count: js.UndefOr[Count] = js.undefined,
        Interval: js.UndefOr[Interval] = js.undefined,
        IntervalUnit: js.UndefOr[RetentionIntervalUnitValues] = js.undefined
    ): FastRestoreRule = {
      val __obj = js.Dynamic.literal(
        "AvailabilityZones" -> AvailabilityZones.asInstanceOf[js.Any]
      )

      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      Interval.foreach(__v => __obj.updateDynamic("Interval")(__v.asInstanceOf[js.Any]))
      IntervalUnit.foreach(__v => __obj.updateDynamic("IntervalUnit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FastRestoreRule]
    }
  }

  @js.native
  trait GetLifecyclePoliciesRequest extends js.Object {
    var PolicyIds: js.UndefOr[PolicyIdList]
    var ResourceTypes: js.UndefOr[ResourceTypeValuesList]
    var State: js.UndefOr[GettablePolicyStateValues]
    var TagsToAdd: js.UndefOr[TagsToAddFilterList]
    var TargetTags: js.UndefOr[TargetTagsFilterList]
  }

  object GetLifecyclePoliciesRequest {
    @inline
    def apply(
        PolicyIds: js.UndefOr[PolicyIdList] = js.undefined,
        ResourceTypes: js.UndefOr[ResourceTypeValuesList] = js.undefined,
        State: js.UndefOr[GettablePolicyStateValues] = js.undefined,
        TagsToAdd: js.UndefOr[TagsToAddFilterList] = js.undefined,
        TargetTags: js.UndefOr[TargetTagsFilterList] = js.undefined
    ): GetLifecyclePoliciesRequest = {
      val __obj = js.Dynamic.literal()
      PolicyIds.foreach(__v => __obj.updateDynamic("PolicyIds")(__v.asInstanceOf[js.Any]))
      ResourceTypes.foreach(__v => __obj.updateDynamic("ResourceTypes")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      TagsToAdd.foreach(__v => __obj.updateDynamic("TagsToAdd")(__v.asInstanceOf[js.Any]))
      TargetTags.foreach(__v => __obj.updateDynamic("TargetTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLifecyclePoliciesRequest]
    }
  }

  @js.native
  trait GetLifecyclePoliciesResponse extends js.Object {
    var Policies: js.UndefOr[LifecyclePolicySummaryList]
  }

  object GetLifecyclePoliciesResponse {
    @inline
    def apply(
        Policies: js.UndefOr[LifecyclePolicySummaryList] = js.undefined
    ): GetLifecyclePoliciesResponse = {
      val __obj = js.Dynamic.literal()
      Policies.foreach(__v => __obj.updateDynamic("Policies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLifecyclePoliciesResponse]
    }
  }

  @js.native
  trait GetLifecyclePolicyRequest extends js.Object {
    var PolicyId: PolicyId
  }

  object GetLifecyclePolicyRequest {
    @inline
    def apply(
        PolicyId: PolicyId
    ): GetLifecyclePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "PolicyId" -> PolicyId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetLifecyclePolicyRequest]
    }
  }

  @js.native
  trait GetLifecyclePolicyResponse extends js.Object {
    var Policy: js.UndefOr[LifecyclePolicy]
  }

  object GetLifecyclePolicyResponse {
    @inline
    def apply(
        Policy: js.UndefOr[LifecyclePolicy] = js.undefined
    ): GetLifecyclePolicyResponse = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLifecyclePolicyResponse]
    }
  }

  /** \```[All policy types]``` Detailed information about a snapshot, AMI, or event-based lifecycle policy.
    */
  @js.native
  trait LifecyclePolicy extends js.Object {
    var DateCreated: js.UndefOr[Timestamp]
    var DateModified: js.UndefOr[Timestamp]
    var Description: js.UndefOr[PolicyDescription]
    var ExecutionRoleArn: js.UndefOr[ExecutionRoleArn]
    var PolicyArn: js.UndefOr[PolicyArn]
    var PolicyDetails: js.UndefOr[PolicyDetails]
    var PolicyId: js.UndefOr[PolicyId]
    var State: js.UndefOr[GettablePolicyStateValues]
    var StatusMessage: js.UndefOr[StatusMessage]
    var Tags: js.UndefOr[TagMap]
  }

  object LifecyclePolicy {
    @inline
    def apply(
        DateCreated: js.UndefOr[Timestamp] = js.undefined,
        DateModified: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[PolicyDescription] = js.undefined,
        ExecutionRoleArn: js.UndefOr[ExecutionRoleArn] = js.undefined,
        PolicyArn: js.UndefOr[PolicyArn] = js.undefined,
        PolicyDetails: js.UndefOr[PolicyDetails] = js.undefined,
        PolicyId: js.UndefOr[PolicyId] = js.undefined,
        State: js.UndefOr[GettablePolicyStateValues] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): LifecyclePolicy = {
      val __obj = js.Dynamic.literal()
      DateCreated.foreach(__v => __obj.updateDynamic("DateCreated")(__v.asInstanceOf[js.Any]))
      DateModified.foreach(__v => __obj.updateDynamic("DateModified")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ExecutionRoleArn.foreach(__v => __obj.updateDynamic("ExecutionRoleArn")(__v.asInstanceOf[js.Any]))
      PolicyArn.foreach(__v => __obj.updateDynamic("PolicyArn")(__v.asInstanceOf[js.Any]))
      PolicyDetails.foreach(__v => __obj.updateDynamic("PolicyDetails")(__v.asInstanceOf[js.Any]))
      PolicyId.foreach(__v => __obj.updateDynamic("PolicyId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecyclePolicy]
    }
  }

  /** Summary information about a lifecycle policy.
    */
  @js.native
  trait LifecyclePolicySummary extends js.Object {
    var Description: js.UndefOr[PolicyDescription]
    var PolicyId: js.UndefOr[PolicyId]
    var PolicyType: js.UndefOr[PolicyTypeValues]
    var State: js.UndefOr[GettablePolicyStateValues]
    var Tags: js.UndefOr[TagMap]
  }

  object LifecyclePolicySummary {
    @inline
    def apply(
        Description: js.UndefOr[PolicyDescription] = js.undefined,
        PolicyId: js.UndefOr[PolicyId] = js.undefined,
        PolicyType: js.UndefOr[PolicyTypeValues] = js.undefined,
        State: js.UndefOr[GettablePolicyStateValues] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): LifecyclePolicySummary = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      PolicyId.foreach(__v => __obj.updateDynamic("PolicyId")(__v.asInstanceOf[js.Any]))
      PolicyType.foreach(__v => __obj.updateDynamic("PolicyType")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecyclePolicySummary]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: PolicyArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: PolicyArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** \```[Snapshot and AMI policies only]``` Specifies optional parameters for snapshot and AMI policies. The set of valid parameters depends on the combination of policy type and target resource type. If you choose to exclude boot volumes and you specify tags that consequently exclude all of the additional data volumes attached to an instance, then Amazon Data Lifecycle Manager will not create any snapshots for the affected instance, and it will emit a <code>SnapshotsCreateFailed</code> Amazon CloudWatch metric. For more information, see [[https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitor-dlm-cw-metrics.html|Monitor your policies using Amazon CloudWatch]].
    */
  @js.native
  trait Parameters extends js.Object {
    var ExcludeBootVolume: js.UndefOr[ExcludeBootVolume]
    var ExcludeDataVolumeTags: js.UndefOr[ExcludeDataVolumeTagList]
    var NoReboot: js.UndefOr[NoReboot]
  }

  object Parameters {
    @inline
    def apply(
        ExcludeBootVolume: js.UndefOr[ExcludeBootVolume] = js.undefined,
        ExcludeDataVolumeTags: js.UndefOr[ExcludeDataVolumeTagList] = js.undefined,
        NoReboot: js.UndefOr[NoReboot] = js.undefined
    ): Parameters = {
      val __obj = js.Dynamic.literal()
      ExcludeBootVolume.foreach(__v => __obj.updateDynamic("ExcludeBootVolume")(__v.asInstanceOf[js.Any]))
      ExcludeDataVolumeTags.foreach(__v => __obj.updateDynamic("ExcludeDataVolumeTags")(__v.asInstanceOf[js.Any]))
      NoReboot.foreach(__v => __obj.updateDynamic("NoReboot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Parameters]
    }
  }

  /** \```[All policy types]``` Specifies the configuration of a lifecycle policy.
    */
  @js.native
  trait PolicyDetails extends js.Object {
    var Actions: js.UndefOr[ActionList]
    var EventSource: js.UndefOr[EventSource]
    var Parameters: js.UndefOr[Parameters]
    var PolicyType: js.UndefOr[PolicyTypeValues]
    var ResourceLocations: js.UndefOr[ResourceLocationList]
    var ResourceTypes: js.UndefOr[ResourceTypeValuesList]
    var Schedules: js.UndefOr[ScheduleList]
    var TargetTags: js.UndefOr[TargetTagList]
  }

  object PolicyDetails {
    @inline
    def apply(
        Actions: js.UndefOr[ActionList] = js.undefined,
        EventSource: js.UndefOr[EventSource] = js.undefined,
        Parameters: js.UndefOr[Parameters] = js.undefined,
        PolicyType: js.UndefOr[PolicyTypeValues] = js.undefined,
        ResourceLocations: js.UndefOr[ResourceLocationList] = js.undefined,
        ResourceTypes: js.UndefOr[ResourceTypeValuesList] = js.undefined,
        Schedules: js.UndefOr[ScheduleList] = js.undefined,
        TargetTags: js.UndefOr[TargetTagList] = js.undefined
    ): PolicyDetails = {
      val __obj = js.Dynamic.literal()
      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      EventSource.foreach(__v => __obj.updateDynamic("EventSource")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      PolicyType.foreach(__v => __obj.updateDynamic("PolicyType")(__v.asInstanceOf[js.Any]))
      ResourceLocations.foreach(__v => __obj.updateDynamic("ResourceLocations")(__v.asInstanceOf[js.Any]))
      ResourceTypes.foreach(__v => __obj.updateDynamic("ResourceTypes")(__v.asInstanceOf[js.Any]))
      Schedules.foreach(__v => __obj.updateDynamic("Schedules")(__v.asInstanceOf[js.Any]))
      TargetTags.foreach(__v => __obj.updateDynamic("TargetTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyDetails]
    }
  }

  /** \```[Snapshot and AMI policies only]``` Specifies a retention rule for snapshots created by snapshot policies, or for AMIs created by AMI policies.
    *
    * '''Note:'''For snapshot policies that have an <a>ArchiveRule</a>, this retention rule applies to standard tier retention. When the retention threshold is met, snapshots are moved from the standard to the archive tier. For snapshot policies that do not have an ```ArchiveRule```, snapshots are permanently deleted when this retention threshold is met. You can retain snapshots based on either a count or a time interval. * ```Count-based retention``` You must specify ```Count```. If you specify an <a>ArchiveRule</a> for the schedule, then you can specify a retention count of <code>0</code> to archive snapshots immediately after creation. If you specify a <a>FastRestoreRule</a>, <a>ShareRule</a>, or a <a>CrossRegionCopyRule</a>, then you must specify a retention count of <code>1</code> or more. * ```Age-based retention``` You must specify ```Interval``` and ```IntervalUnit```. If you specify an <a>ArchiveRule</a> for the schedule, then you can specify a retention interval of
    * <code>0</code> days to archive snapshots immediately after creation. If you specify a <a>FastRestoreRule</a>, <a>ShareRule</a>, or a <a>CrossRegionCopyRule</a>, then you must specify a retention interval of <code>1</code> day or more.
    */
  @js.native
  trait RetainRule extends js.Object {
    var Count: js.UndefOr[StandardTierRetainRuleCount]
    var Interval: js.UndefOr[StandardTierRetainRuleInterval]
    var IntervalUnit: js.UndefOr[RetentionIntervalUnitValues]
  }

  object RetainRule {
    @inline
    def apply(
        Count: js.UndefOr[StandardTierRetainRuleCount] = js.undefined,
        Interval: js.UndefOr[StandardTierRetainRuleInterval] = js.undefined,
        IntervalUnit: js.UndefOr[RetentionIntervalUnitValues] = js.undefined
    ): RetainRule = {
      val __obj = js.Dynamic.literal()
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      Interval.foreach(__v => __obj.updateDynamic("Interval")(__v.asInstanceOf[js.Any]))
      IntervalUnit.foreach(__v => __obj.updateDynamic("IntervalUnit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetainRule]
    }
  }

  /** \```[Snapshot policies only]``` Describes the retention rule for archived snapshots. Once the archive retention threshold is met, the snapshots are permanently deleted from the archive tier.
    *
    * '''Note:'''The archive retention rule must retain snapshots in the archive tier for a minimum of 90 days. For ```count-based schedules```, you must specify ```Count```. For ```age-based schedules```, you must specify ```Interval``` and ``` IntervalUnit```. For more information about using snapshot archiving, see [[https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-ami-policy.html#dlm-archive|Considerations for snapshot lifecycle policies]].
    */
  @js.native
  trait RetentionArchiveTier extends js.Object {
    var Count: js.UndefOr[Count]
    var Interval: js.UndefOr[Interval]
    var IntervalUnit: js.UndefOr[RetentionIntervalUnitValues]
  }

  object RetentionArchiveTier {
    @inline
    def apply(
        Count: js.UndefOr[Count] = js.undefined,
        Interval: js.UndefOr[Interval] = js.undefined,
        IntervalUnit: js.UndefOr[RetentionIntervalUnitValues] = js.undefined
    ): RetentionArchiveTier = {
      val __obj = js.Dynamic.literal()
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      Interval.foreach(__v => __obj.updateDynamic("Interval")(__v.asInstanceOf[js.Any]))
      IntervalUnit.foreach(__v => __obj.updateDynamic("IntervalUnit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetentionArchiveTier]
    }
  }

  /** \```[Snapshot and AMI policies only]``` Specifies a schedule for a snapshot or AMI lifecycle policy.
    */
  @js.native
  trait Schedule extends js.Object {
    var ArchiveRule: js.UndefOr[ArchiveRule]
    var CopyTags: js.UndefOr[CopyTags]
    var CreateRule: js.UndefOr[CreateRule]
    var CrossRegionCopyRules: js.UndefOr[CrossRegionCopyRules]
    var DeprecateRule: js.UndefOr[DeprecateRule]
    var FastRestoreRule: js.UndefOr[FastRestoreRule]
    var Name: js.UndefOr[ScheduleName]
    var RetainRule: js.UndefOr[RetainRule]
    var ShareRules: js.UndefOr[ShareRules]
    var TagsToAdd: js.UndefOr[TagsToAddList]
    var VariableTags: js.UndefOr[VariableTagsList]
  }

  object Schedule {
    @inline
    def apply(
        ArchiveRule: js.UndefOr[ArchiveRule] = js.undefined,
        CopyTags: js.UndefOr[CopyTags] = js.undefined,
        CreateRule: js.UndefOr[CreateRule] = js.undefined,
        CrossRegionCopyRules: js.UndefOr[CrossRegionCopyRules] = js.undefined,
        DeprecateRule: js.UndefOr[DeprecateRule] = js.undefined,
        FastRestoreRule: js.UndefOr[FastRestoreRule] = js.undefined,
        Name: js.UndefOr[ScheduleName] = js.undefined,
        RetainRule: js.UndefOr[RetainRule] = js.undefined,
        ShareRules: js.UndefOr[ShareRules] = js.undefined,
        TagsToAdd: js.UndefOr[TagsToAddList] = js.undefined,
        VariableTags: js.UndefOr[VariableTagsList] = js.undefined
    ): Schedule = {
      val __obj = js.Dynamic.literal()
      ArchiveRule.foreach(__v => __obj.updateDynamic("ArchiveRule")(__v.asInstanceOf[js.Any]))
      CopyTags.foreach(__v => __obj.updateDynamic("CopyTags")(__v.asInstanceOf[js.Any]))
      CreateRule.foreach(__v => __obj.updateDynamic("CreateRule")(__v.asInstanceOf[js.Any]))
      CrossRegionCopyRules.foreach(__v => __obj.updateDynamic("CrossRegionCopyRules")(__v.asInstanceOf[js.Any]))
      DeprecateRule.foreach(__v => __obj.updateDynamic("DeprecateRule")(__v.asInstanceOf[js.Any]))
      FastRestoreRule.foreach(__v => __obj.updateDynamic("FastRestoreRule")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RetainRule.foreach(__v => __obj.updateDynamic("RetainRule")(__v.asInstanceOf[js.Any]))
      ShareRules.foreach(__v => __obj.updateDynamic("ShareRules")(__v.asInstanceOf[js.Any]))
      TagsToAdd.foreach(__v => __obj.updateDynamic("TagsToAdd")(__v.asInstanceOf[js.Any]))
      VariableTags.foreach(__v => __obj.updateDynamic("VariableTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Schedule]
    }
  }

  /** \```[Snapshot policies only]``` Specifies a rule for sharing snapshots across Amazon Web Services accounts.
    */
  @js.native
  trait ShareRule extends js.Object {
    var TargetAccounts: ShareTargetAccountList
    var UnshareInterval: js.UndefOr[Interval]
    var UnshareIntervalUnit: js.UndefOr[RetentionIntervalUnitValues]
  }

  object ShareRule {
    @inline
    def apply(
        TargetAccounts: ShareTargetAccountList,
        UnshareInterval: js.UndefOr[Interval] = js.undefined,
        UnshareIntervalUnit: js.UndefOr[RetentionIntervalUnitValues] = js.undefined
    ): ShareRule = {
      val __obj = js.Dynamic.literal(
        "TargetAccounts" -> TargetAccounts.asInstanceOf[js.Any]
      )

      UnshareInterval.foreach(__v => __obj.updateDynamic("UnshareInterval")(__v.asInstanceOf[js.Any]))
      UnshareIntervalUnit.foreach(__v => __obj.updateDynamic("UnshareIntervalUnit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ShareRule]
    }
  }

  /** Specifies a tag for a resource.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: String
    var Value: String
  }

  object Tag {
    @inline
    def apply(
        Key: String,
        Value: String
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
    var ResourceArn: PolicyArn
    var Tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: PolicyArn,
        Tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
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

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: PolicyArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: PolicyArn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
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
  trait UpdateLifecyclePolicyRequest extends js.Object {
    var PolicyId: PolicyId
    var Description: js.UndefOr[PolicyDescription]
    var ExecutionRoleArn: js.UndefOr[ExecutionRoleArn]
    var PolicyDetails: js.UndefOr[PolicyDetails]
    var State: js.UndefOr[SettablePolicyStateValues]
  }

  object UpdateLifecyclePolicyRequest {
    @inline
    def apply(
        PolicyId: PolicyId,
        Description: js.UndefOr[PolicyDescription] = js.undefined,
        ExecutionRoleArn: js.UndefOr[ExecutionRoleArn] = js.undefined,
        PolicyDetails: js.UndefOr[PolicyDetails] = js.undefined,
        State: js.UndefOr[SettablePolicyStateValues] = js.undefined
    ): UpdateLifecyclePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "PolicyId" -> PolicyId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ExecutionRoleArn.foreach(__v => __obj.updateDynamic("ExecutionRoleArn")(__v.asInstanceOf[js.Any]))
      PolicyDetails.foreach(__v => __obj.updateDynamic("PolicyDetails")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLifecyclePolicyRequest]
    }
  }

  @js.native
  trait UpdateLifecyclePolicyResponse extends js.Object

  object UpdateLifecyclePolicyResponse {
    @inline
    def apply(): UpdateLifecyclePolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateLifecyclePolicyResponse]
    }
  }
}
