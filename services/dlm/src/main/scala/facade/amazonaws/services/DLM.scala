package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object dlm {
  type AvailabilityZone           = String
  type AvailabilityZoneList       = js.Array[AvailabilityZone]
  type CmkArn                     = String
  type CopyTags                   = Boolean
  type CopyTagsNullable           = Boolean
  type Count                      = Int
  type CrossRegionCopyRules       = js.Array[CrossRegionCopyRule]
  type Encrypted                  = Boolean
  type ExcludeBootVolume          = Boolean
  type ExecutionRoleArn           = String
  type Interval                   = Int
  type LifecyclePolicySummaryList = js.Array[LifecyclePolicySummary]
  type PolicyArn                  = String
  type PolicyDescription          = String
  type PolicyId                   = String
  type PolicyIdList               = js.Array[PolicyId]
  type ResourceTypeValuesList     = js.Array[ResourceTypeValues]
  type ScheduleList               = js.Array[Schedule]
  type ScheduleName               = String
  type StatusMessage              = String
  type TagFilter                  = String
  type TagKey                     = String
  type TagKeyList                 = js.Array[TagKey]
  type TagMap                     = js.Dictionary[TagValue]
  type TagValue                   = String
  type TagsToAddFilterList        = js.Array[TagFilter]
  type TagsToAddList              = js.Array[Tag]
  type TargetRegion               = String
  type TargetTagList              = js.Array[Tag]
  type TargetTagsFilterList       = js.Array[TagFilter]
  type Time                       = String
  type TimesList                  = js.Array[Time]
  type Timestamp                  = js.Date
  type VariableTagsList           = js.Array[Tag]

  implicit final class DLMOps(private val service: DLM) extends AnyVal {

    @inline def createLifecyclePolicyFuture(
        params: CreateLifecyclePolicyRequest
    ): Future[CreateLifecyclePolicyResponse] = service.createLifecyclePolicy(params).promise().toFuture
    @inline def deleteLifecyclePolicyFuture(
        params: DeleteLifecyclePolicyRequest
    ): Future[DeleteLifecyclePolicyResponse] = service.deleteLifecyclePolicy(params).promise().toFuture
    @inline def getLifecyclePoliciesFuture(params: GetLifecyclePoliciesRequest): Future[GetLifecyclePoliciesResponse] =
      service.getLifecyclePolicies(params).promise().toFuture
    @inline def getLifecyclePolicyFuture(params: GetLifecyclePolicyRequest): Future[GetLifecyclePolicyResponse] =
      service.getLifecyclePolicy(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateLifecyclePolicyFuture(
        params: UpdateLifecyclePolicyRequest
    ): Future[UpdateLifecyclePolicyResponse] = service.updateLifecyclePolicy(params).promise().toFuture
  }
}

package dlm {
  @js.native
  @JSImport("aws-sdk", "DLM")
  class DLM() extends js.Object {
    def this(config: AWSConfig) = this()

    def createLifecyclePolicy(params: CreateLifecyclePolicyRequest): Request[CreateLifecyclePolicyResponse] = js.native
    def deleteLifecyclePolicy(params: DeleteLifecyclePolicyRequest): Request[DeleteLifecyclePolicyResponse] = js.native
    def getLifecyclePolicies(params: GetLifecyclePoliciesRequest): Request[GetLifecyclePoliciesResponse]    = js.native
    def getLifecyclePolicy(params: GetLifecyclePolicyRequest): Request[GetLifecyclePolicyResponse]          = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]       = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                               = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                         = js.native
    def updateLifecyclePolicy(params: UpdateLifecyclePolicyRequest): Request[UpdateLifecyclePolicyResponse] = js.native
  }

  @js.native
  @Factory
  trait CreateLifecyclePolicyRequest extends js.Object {
    var Description: PolicyDescription
    var ExecutionRoleArn: ExecutionRoleArn
    var PolicyDetails: PolicyDetails
    var State: SettablePolicyStateValues
    var Tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait CreateLifecyclePolicyResponse extends js.Object {
    var PolicyId: js.UndefOr[PolicyId]
  }

  /**
    * Specifies when to create snapshots of EBS volumes.
    */
  @js.native
  @Factory
  trait CreateRule extends js.Object {
    var Interval: Interval
    var IntervalUnit: IntervalUnitValues
    var Times: js.UndefOr[TimesList]
  }

  /**
    * Specifies the retention rule for cross-Region snapshot copies.
    */
  @js.native
  @Factory
  trait CrossRegionCopyRetainRule extends js.Object {
    var Interval: js.UndefOr[Interval]
    var IntervalUnit: js.UndefOr[RetentionIntervalUnitValues]
  }

  /**
    * Specifies a rule for cross-Region snapshot copies.
    */
  @js.native
  @Factory
  trait CrossRegionCopyRule extends js.Object {
    var Encrypted: Encrypted
    var TargetRegion: TargetRegion
    var CmkArn: js.UndefOr[CmkArn]
    var CopyTags: js.UndefOr[CopyTagsNullable]
    var RetainRule: js.UndefOr[CrossRegionCopyRetainRule]
  }

  @js.native
  @Factory
  trait DeleteLifecyclePolicyRequest extends js.Object {
    var PolicyId: PolicyId
  }

  @js.native
  @Factory
  trait DeleteLifecyclePolicyResponse extends js.Object {}

  /**
    * Specifies a rule for enabling fast snapshot restore. You can enable fast snapshot restore based on either a count or a time interval.
    */
  @js.native
  @Factory
  trait FastRestoreRule extends js.Object {
    var AvailabilityZones: AvailabilityZoneList
    var Count: js.UndefOr[Count]
    var Interval: js.UndefOr[Interval]
    var IntervalUnit: js.UndefOr[RetentionIntervalUnitValues]
  }

  @js.native
  @Factory
  trait GetLifecyclePoliciesRequest extends js.Object {
    var PolicyIds: js.UndefOr[PolicyIdList]
    var ResourceTypes: js.UndefOr[ResourceTypeValuesList]
    var State: js.UndefOr[GettablePolicyStateValues]
    var TagsToAdd: js.UndefOr[TagsToAddFilterList]
    var TargetTags: js.UndefOr[TargetTagsFilterList]
  }

  @js.native
  @Factory
  trait GetLifecyclePoliciesResponse extends js.Object {
    var Policies: js.UndefOr[LifecyclePolicySummaryList]
  }

  @js.native
  @Factory
  trait GetLifecyclePolicyRequest extends js.Object {
    var PolicyId: PolicyId
  }

  @js.native
  @Factory
  trait GetLifecyclePolicyResponse extends js.Object {
    var Policy: js.UndefOr[LifecyclePolicy]
  }

  @js.native
  sealed trait GettablePolicyStateValues extends js.Any
  object GettablePolicyStateValues extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[GettablePolicyStateValues]
    val DISABLED = "DISABLED".asInstanceOf[GettablePolicyStateValues]
    val ERROR    = "ERROR".asInstanceOf[GettablePolicyStateValues]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED, ERROR))
  }

  @js.native
  sealed trait IntervalUnitValues extends js.Any
  object IntervalUnitValues extends js.Object {
    val HOURS = "HOURS".asInstanceOf[IntervalUnitValues]

    val values = js.Object.freeze(js.Array(HOURS))
  }

  /**
    * Detailed information about a lifecycle policy.
    */
  @js.native
  @Factory
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

  /**
    * Summary information about a lifecycle policy.
    */
  @js.native
  @Factory
  trait LifecyclePolicySummary extends js.Object {
    var Description: js.UndefOr[PolicyDescription]
    var PolicyId: js.UndefOr[PolicyId]
    var State: js.UndefOr[GettablePolicyStateValues]
    var Tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: PolicyArn
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  /**
    * Specifies optional parameters to add to a policy. The set of valid parameters depends on the combination of policy type and resource type.
    */
  @js.native
  @Factory
  trait Parameters extends js.Object {
    var ExcludeBootVolume: js.UndefOr[ExcludeBootVolume]
  }

  /**
    * Specifies the configuration of a lifecycle policy.
    */
  @js.native
  @Factory
  trait PolicyDetails extends js.Object {
    var Parameters: js.UndefOr[Parameters]
    var PolicyType: js.UndefOr[PolicyTypeValues]
    var ResourceTypes: js.UndefOr[ResourceTypeValuesList]
    var Schedules: js.UndefOr[ScheduleList]
    var TargetTags: js.UndefOr[TargetTagList]
  }

  @js.native
  sealed trait PolicyTypeValues extends js.Any
  object PolicyTypeValues extends js.Object {
    val EBS_SNAPSHOT_MANAGEMENT = "EBS_SNAPSHOT_MANAGEMENT".asInstanceOf[PolicyTypeValues]

    val values = js.Object.freeze(js.Array(EBS_SNAPSHOT_MANAGEMENT))
  }

  @js.native
  sealed trait ResourceTypeValues extends js.Any
  object ResourceTypeValues extends js.Object {
    val VOLUME   = "VOLUME".asInstanceOf[ResourceTypeValues]
    val INSTANCE = "INSTANCE".asInstanceOf[ResourceTypeValues]

    val values = js.Object.freeze(js.Array(VOLUME, INSTANCE))
  }

  /**
    * Specifies the retention rule for a lifecycle policy. You can retain snapshots based on either a count or a time interval.
    */
  @js.native
  @Factory
  trait RetainRule extends js.Object {
    var Count: js.UndefOr[Count]
    var Interval: js.UndefOr[Interval]
    var IntervalUnit: js.UndefOr[RetentionIntervalUnitValues]
  }

  @js.native
  sealed trait RetentionIntervalUnitValues extends js.Any
  object RetentionIntervalUnitValues extends js.Object {
    val DAYS   = "DAYS".asInstanceOf[RetentionIntervalUnitValues]
    val WEEKS  = "WEEKS".asInstanceOf[RetentionIntervalUnitValues]
    val MONTHS = "MONTHS".asInstanceOf[RetentionIntervalUnitValues]
    val YEARS  = "YEARS".asInstanceOf[RetentionIntervalUnitValues]

    val values = js.Object.freeze(js.Array(DAYS, WEEKS, MONTHS, YEARS))
  }

  /**
    * Specifies a backup schedule.
    */
  @js.native
  @Factory
  trait Schedule extends js.Object {
    var CopyTags: js.UndefOr[CopyTags]
    var CreateRule: js.UndefOr[CreateRule]
    var CrossRegionCopyRules: js.UndefOr[CrossRegionCopyRules]
    var FastRestoreRule: js.UndefOr[FastRestoreRule]
    var Name: js.UndefOr[ScheduleName]
    var RetainRule: js.UndefOr[RetainRule]
    var TagsToAdd: js.UndefOr[TagsToAddList]
    var VariableTags: js.UndefOr[VariableTagsList]
  }

  @js.native
  sealed trait SettablePolicyStateValues extends js.Any
  object SettablePolicyStateValues extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[SettablePolicyStateValues]
    val DISABLED = "DISABLED".asInstanceOf[SettablePolicyStateValues]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Specifies a tag for a resource.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: String
    var Value: String
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: PolicyArn
    var Tags: TagMap
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: PolicyArn
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateLifecyclePolicyRequest extends js.Object {
    var PolicyId: PolicyId
    var Description: js.UndefOr[PolicyDescription]
    var ExecutionRoleArn: js.UndefOr[ExecutionRoleArn]
    var PolicyDetails: js.UndefOr[PolicyDetails]
    var State: js.UndefOr[SettablePolicyStateValues]
  }

  @js.native
  @Factory
  trait UpdateLifecyclePolicyResponse extends js.Object {}
}
