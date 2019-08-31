package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object dlm {
  type CopyTags                   = Boolean
  type Count                      = Int
  type ExcludeBootVolume          = Boolean
  type ExecutionRoleArn           = String
  type GettablePolicyStateValues  = String
  type Interval                   = Int
  type IntervalUnitValues         = String
  type LifecyclePolicySummaryList = js.Array[LifecyclePolicySummary]
  type PolicyDescription          = String
  type PolicyId                   = String
  type PolicyIdList               = js.Array[PolicyId]
  type PolicyTypeValues           = String
  type ResourceTypeValues         = String
  type ResourceTypeValuesList     = js.Array[ResourceTypeValues]
  type ScheduleList               = js.Array[Schedule]
  type ScheduleName               = String
  type SettablePolicyStateValues  = String
  type TagFilter                  = String
  type TagsToAddFilterList        = js.Array[TagFilter]
  type TagsToAddList              = js.Array[Tag]
  type TargetTagList              = js.Array[Tag]
  type TargetTagsFilterList       = js.Array[TagFilter]
  type Time                       = String
  type TimesList                  = js.Array[Time]
  type Timestamp                  = js.Date
  type VariableTagsList           = js.Array[Tag]

  implicit final class DLMOps(private val service: DLM) extends AnyVal {

    def createLifecyclePolicyFuture(params: CreateLifecyclePolicyRequest): Future[CreateLifecyclePolicyResponse] =
      service.createLifecyclePolicy(params).promise.toFuture
    def deleteLifecyclePolicyFuture(params: DeleteLifecyclePolicyRequest): Future[DeleteLifecyclePolicyResponse] =
      service.deleteLifecyclePolicy(params).promise.toFuture
    def getLifecyclePoliciesFuture(params: GetLifecyclePoliciesRequest): Future[GetLifecyclePoliciesResponse] =
      service.getLifecyclePolicies(params).promise.toFuture
    def getLifecyclePolicyFuture(params: GetLifecyclePolicyRequest): Future[GetLifecyclePolicyResponse] =
      service.getLifecyclePolicy(params).promise.toFuture
    def updateLifecyclePolicyFuture(params: UpdateLifecyclePolicyRequest): Future[UpdateLifecyclePolicyResponse] =
      service.updateLifecyclePolicy(params).promise.toFuture
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
    def updateLifecyclePolicy(params: UpdateLifecyclePolicyRequest): Request[UpdateLifecyclePolicyResponse] = js.native
  }

  @js.native
  trait CreateLifecyclePolicyRequest extends js.Object {
    var Description: PolicyDescription
    var ExecutionRoleArn: ExecutionRoleArn
    var PolicyDetails: PolicyDetails
    var State: SettablePolicyStateValues
  }

  object CreateLifecyclePolicyRequest {
    def apply(
        Description: PolicyDescription,
        ExecutionRoleArn: ExecutionRoleArn,
        PolicyDetails: PolicyDetails,
        State: SettablePolicyStateValues
    ): CreateLifecyclePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Description"      -> Description.asInstanceOf[js.Any],
        "ExecutionRoleArn" -> ExecutionRoleArn.asInstanceOf[js.Any],
        "PolicyDetails"    -> PolicyDetails.asInstanceOf[js.Any],
        "State"            -> State.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateLifecyclePolicyRequest]
    }
  }

  @js.native
  trait CreateLifecyclePolicyResponse extends js.Object {
    var PolicyId: js.UndefOr[PolicyId]
  }

  object CreateLifecyclePolicyResponse {
    def apply(
        PolicyId: js.UndefOr[PolicyId] = js.undefined
    ): CreateLifecyclePolicyResponse = {
      val __obj = js.Dynamic.literal()
      PolicyId.foreach(__v => __obj.updateDynamic("PolicyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLifecyclePolicyResponse]
    }
  }

  /**
    * Specifies when to create snapshots of EBS volumes.
    */
  @js.native
  trait CreateRule extends js.Object {
    var Interval: Interval
    var IntervalUnit: IntervalUnitValues
    var Times: js.UndefOr[TimesList]
  }

  object CreateRule {
    def apply(
        Interval: Interval,
        IntervalUnit: IntervalUnitValues,
        Times: js.UndefOr[TimesList] = js.undefined
    ): CreateRule = {
      val __obj = js.Dynamic.literal(
        "Interval"     -> Interval.asInstanceOf[js.Any],
        "IntervalUnit" -> IntervalUnit.asInstanceOf[js.Any]
      )

      Times.foreach(__v => __obj.updateDynamic("Times")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRule]
    }
  }

  @js.native
  trait DeleteLifecyclePolicyRequest extends js.Object {
    var PolicyId: PolicyId
  }

  object DeleteLifecyclePolicyRequest {
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
  trait DeleteLifecyclePolicyResponse extends js.Object {}

  object DeleteLifecyclePolicyResponse {
    def apply(
        ): DeleteLifecyclePolicyResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteLifecyclePolicyResponse]
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
    def apply(
        Policy: js.UndefOr[LifecyclePolicy] = js.undefined
    ): GetLifecyclePolicyResponse = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLifecyclePolicyResponse]
    }
  }

  object GettablePolicyStateValuesEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"
    val ERROR    = "ERROR"

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED, ERROR))
  }

  object IntervalUnitValuesEnum {
    val HOURS = "HOURS"

    val values = js.Object.freeze(js.Array(HOURS))
  }

  /**
    * Detailed information about a lifecycle policy.
    */
  @js.native
  trait LifecyclePolicy extends js.Object {
    var DateCreated: js.UndefOr[Timestamp]
    var DateModified: js.UndefOr[Timestamp]
    var Description: js.UndefOr[PolicyDescription]
    var ExecutionRoleArn: js.UndefOr[ExecutionRoleArn]
    var PolicyDetails: js.UndefOr[PolicyDetails]
    var PolicyId: js.UndefOr[PolicyId]
    var State: js.UndefOr[GettablePolicyStateValues]
  }

  object LifecyclePolicy {
    def apply(
        DateCreated: js.UndefOr[Timestamp] = js.undefined,
        DateModified: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[PolicyDescription] = js.undefined,
        ExecutionRoleArn: js.UndefOr[ExecutionRoleArn] = js.undefined,
        PolicyDetails: js.UndefOr[PolicyDetails] = js.undefined,
        PolicyId: js.UndefOr[PolicyId] = js.undefined,
        State: js.UndefOr[GettablePolicyStateValues] = js.undefined
    ): LifecyclePolicy = {
      val __obj = js.Dynamic.literal()
      DateCreated.foreach(__v => __obj.updateDynamic("DateCreated")(__v.asInstanceOf[js.Any]))
      DateModified.foreach(__v => __obj.updateDynamic("DateModified")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ExecutionRoleArn.foreach(__v => __obj.updateDynamic("ExecutionRoleArn")(__v.asInstanceOf[js.Any]))
      PolicyDetails.foreach(__v => __obj.updateDynamic("PolicyDetails")(__v.asInstanceOf[js.Any]))
      PolicyId.foreach(__v => __obj.updateDynamic("PolicyId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecyclePolicy]
    }
  }

  /**
    * Summary information about a lifecycle policy.
    */
  @js.native
  trait LifecyclePolicySummary extends js.Object {
    var Description: js.UndefOr[PolicyDescription]
    var PolicyId: js.UndefOr[PolicyId]
    var State: js.UndefOr[GettablePolicyStateValues]
  }

  object LifecyclePolicySummary {
    def apply(
        Description: js.UndefOr[PolicyDescription] = js.undefined,
        PolicyId: js.UndefOr[PolicyId] = js.undefined,
        State: js.UndefOr[GettablePolicyStateValues] = js.undefined
    ): LifecyclePolicySummary = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      PolicyId.foreach(__v => __obj.updateDynamic("PolicyId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecyclePolicySummary]
    }
  }

  /**
    * Optional parameters that can be added to the policy. The set of valid parameters depends on the combination of <code>policyType</code> and <code>resourceType</code> values.
    */
  @js.native
  trait Parameters extends js.Object {
    var ExcludeBootVolume: js.UndefOr[ExcludeBootVolume]
  }

  object Parameters {
    def apply(
        ExcludeBootVolume: js.UndefOr[ExcludeBootVolume] = js.undefined
    ): Parameters = {
      val __obj = js.Dynamic.literal()
      ExcludeBootVolume.foreach(__v => __obj.updateDynamic("ExcludeBootVolume")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Parameters]
    }
  }

  /**
    * Specifies the configuration of a lifecycle policy.
    */
  @js.native
  trait PolicyDetails extends js.Object {
    var Parameters: js.UndefOr[Parameters]
    var PolicyType: js.UndefOr[PolicyTypeValues]
    var ResourceTypes: js.UndefOr[ResourceTypeValuesList]
    var Schedules: js.UndefOr[ScheduleList]
    var TargetTags: js.UndefOr[TargetTagList]
  }

  object PolicyDetails {
    def apply(
        Parameters: js.UndefOr[Parameters] = js.undefined,
        PolicyType: js.UndefOr[PolicyTypeValues] = js.undefined,
        ResourceTypes: js.UndefOr[ResourceTypeValuesList] = js.undefined,
        Schedules: js.UndefOr[ScheduleList] = js.undefined,
        TargetTags: js.UndefOr[TargetTagList] = js.undefined
    ): PolicyDetails = {
      val __obj = js.Dynamic.literal()
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      PolicyType.foreach(__v => __obj.updateDynamic("PolicyType")(__v.asInstanceOf[js.Any]))
      ResourceTypes.foreach(__v => __obj.updateDynamic("ResourceTypes")(__v.asInstanceOf[js.Any]))
      Schedules.foreach(__v => __obj.updateDynamic("Schedules")(__v.asInstanceOf[js.Any]))
      TargetTags.foreach(__v => __obj.updateDynamic("TargetTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyDetails]
    }
  }

  object PolicyTypeValuesEnum {
    val EBS_SNAPSHOT_MANAGEMENT = "EBS_SNAPSHOT_MANAGEMENT"

    val values = js.Object.freeze(js.Array(EBS_SNAPSHOT_MANAGEMENT))
  }

  object ResourceTypeValuesEnum {
    val VOLUME   = "VOLUME"
    val INSTANCE = "INSTANCE"

    val values = js.Object.freeze(js.Array(VOLUME, INSTANCE))
  }

  /**
    * Specifies the number of snapshots to keep for each EBS volume.
    */
  @js.native
  trait RetainRule extends js.Object {
    var Count: Count
  }

  object RetainRule {
    def apply(
        Count: Count
    ): RetainRule = {
      val __obj = js.Dynamic.literal(
        "Count" -> Count.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RetainRule]
    }
  }

  /**
    * Specifies a schedule.
    */
  @js.native
  trait Schedule extends js.Object {
    var CopyTags: js.UndefOr[CopyTags]
    var CreateRule: js.UndefOr[CreateRule]
    var Name: js.UndefOr[ScheduleName]
    var RetainRule: js.UndefOr[RetainRule]
    var TagsToAdd: js.UndefOr[TagsToAddList]
    var VariableTags: js.UndefOr[VariableTagsList]
  }

  object Schedule {
    def apply(
        CopyTags: js.UndefOr[CopyTags] = js.undefined,
        CreateRule: js.UndefOr[CreateRule] = js.undefined,
        Name: js.UndefOr[ScheduleName] = js.undefined,
        RetainRule: js.UndefOr[RetainRule] = js.undefined,
        TagsToAdd: js.UndefOr[TagsToAddList] = js.undefined,
        VariableTags: js.UndefOr[VariableTagsList] = js.undefined
    ): Schedule = {
      val __obj = js.Dynamic.literal()
      CopyTags.foreach(__v => __obj.updateDynamic("CopyTags")(__v.asInstanceOf[js.Any]))
      CreateRule.foreach(__v => __obj.updateDynamic("CreateRule")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RetainRule.foreach(__v => __obj.updateDynamic("RetainRule")(__v.asInstanceOf[js.Any]))
      TagsToAdd.foreach(__v => __obj.updateDynamic("TagsToAdd")(__v.asInstanceOf[js.Any]))
      VariableTags.foreach(__v => __obj.updateDynamic("VariableTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Schedule]
    }
  }

  object SettablePolicyStateValuesEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Specifies a tag for a resource.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: String
    var Value: String
  }

  object Tag {
    def apply(
        Key: String,
        Value: String
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
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
  trait UpdateLifecyclePolicyResponse extends js.Object {}

  object UpdateLifecyclePolicyResponse {
    def apply(
        ): UpdateLifecyclePolicyResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateLifecyclePolicyResponse]
    }
  }
}
