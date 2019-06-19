package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object emr {
  type ActionOnFailure                        = String
  type AdjustmentType                         = String
  type ApplicationList                        = js.Array[Application]
  type AutoScalingPolicyState                 = String
  type AutoScalingPolicyStateChangeReasonCode = String
  type BooleanObject                          = Boolean
  type BootstrapActionConfigList              = js.Array[BootstrapActionConfig]
  type BootstrapActionDetailList              = js.Array[BootstrapActionDetail]
  type CancelStepsInfoList                    = js.Array[CancelStepsInfo]
  type CancelStepsRequestStatus               = String
  type ClusterId                              = String
  type ClusterState                           = String
  type ClusterStateChangeReasonCode           = String
  type ClusterStateList                       = js.Array[ClusterState]
  type ClusterSummaryList                     = js.Array[ClusterSummary]
  type CommandList                            = js.Array[Command]
  type ComparisonOperator                     = String
  type ConfigurationList                      = js.Array[Configuration]
  type Date                                   = js.Date
  type EC2InstanceIdsList                     = js.Array[InstanceId]
  type EC2InstanceIdsToTerminateList          = js.Array[InstanceId]
  type EbsBlockDeviceConfigList               = js.Array[EbsBlockDeviceConfig]
  type EbsBlockDeviceList                     = js.Array[EbsBlockDevice]
  type EbsVolumeList                          = js.Array[EbsVolume]
  type ErrorCode                              = String
  type ErrorMessage                           = String
  type InstanceCollectionType                 = String
  type InstanceFleetConfigList                = js.Array[InstanceFleetConfig]
  type InstanceFleetId                        = String
  type InstanceFleetList                      = js.Array[InstanceFleet]
  type InstanceFleetState                     = String
  type InstanceFleetStateChangeReasonCode     = String
  type InstanceFleetType                      = String
  type InstanceGroupConfigList                = js.Array[InstanceGroupConfig]
  type InstanceGroupDetailList                = js.Array[InstanceGroupDetail]
  type InstanceGroupId                        = String
  type InstanceGroupIdsList                   = js.Array[XmlStringMaxLen256]
  type InstanceGroupList                      = js.Array[InstanceGroup]
  type InstanceGroupModifyConfigList          = js.Array[InstanceGroupModifyConfig]
  type InstanceGroupState                     = String
  type InstanceGroupStateChangeReasonCode     = String
  type InstanceGroupType                      = String
  type InstanceGroupTypeList                  = js.Array[InstanceGroupType]
  type InstanceId                             = String
  type InstanceList                           = js.Array[Instance]
  type InstanceRoleType                       = String
  type InstanceState                          = String
  type InstanceStateChangeReasonCode          = String
  type InstanceStateList                      = js.Array[InstanceState]
  type InstanceType                           = String
  type InstanceTypeConfigList                 = js.Array[InstanceTypeConfig]
  type InstanceTypeSpecificationList          = js.Array[InstanceTypeSpecification]
  type JobFlowDetailList                      = js.Array[JobFlowDetail]
  type JobFlowExecutionState                  = String
  type JobFlowExecutionStateList              = js.Array[JobFlowExecutionState]
  type KeyValueList                           = js.Array[KeyValue]
  type Marker                                 = String
  type MarketType                             = String
  type MetricDimensionList                    = js.Array[MetricDimension]
  type NewSupportedProductsList               = js.Array[SupportedProductConfig]
  type NonNegativeDouble                      = Double
  type RepoUpgradeOnBoot                      = String
  type ResourceId                             = String
  type ScaleDownBehavior                      = String
  type ScalingRuleList                        = js.Array[ScalingRule]
  type SecurityConfigurationList              = js.Array[SecurityConfigurationSummary]
  type SecurityGroupsList                     = js.Array[XmlStringMaxLen256]
  type SpotProvisioningTimeoutAction          = String
  type Statistic                              = String
  type StepConfigList                         = js.Array[StepConfig]
  type StepDetailList                         = js.Array[StepDetail]
  type StepExecutionState                     = String
  type StepId                                 = String
  type StepIdsList                            = js.Array[XmlStringMaxLen256]
  type StepState                              = String
  type StepStateChangeReasonCode              = String
  type StepStateList                          = js.Array[StepState]
  type StepSummaryList                        = js.Array[StepSummary]
  type StringList                             = js.Array[String]
  type StringMap                              = js.Dictionary[String]
  type SupportedProductsList                  = js.Array[XmlStringMaxLen256]
  type TagList                                = js.Array[Tag]
  type Unit                                   = String
  type WholeNumber                            = Int
  type XmlString                              = String
  type XmlStringList                          = js.Array[XmlString]
  type XmlStringMaxLen256                     = String
  type XmlStringMaxLen256List                 = js.Array[XmlStringMaxLen256]
}

package emr {
  @js.native
  @JSImport("aws-sdk", "EMR")
  class EMR() extends js.Object {
    def this(config: AWSConfig) = this()

    def addInstanceFleet(params: AddInstanceFleetInput): Request[AddInstanceFleetOutput]    = js.native
    def addInstanceGroups(params: AddInstanceGroupsInput): Request[AddInstanceGroupsOutput] = js.native
    def addJobFlowSteps(params: AddJobFlowStepsInput): Request[AddJobFlowStepsOutput]       = js.native
    def addTags(params: AddTagsInput): Request[AddTagsOutput]                               = js.native
    def cancelSteps(params: CancelStepsInput): Request[CancelStepsOutput]                   = js.native
    def createSecurityConfiguration(
        params: CreateSecurityConfigurationInput
    ): Request[CreateSecurityConfigurationOutput] = js.native
    def deleteSecurityConfiguration(
        params: DeleteSecurityConfigurationInput
    ): Request[DeleteSecurityConfigurationOutput]                                        = js.native
    def describeCluster(params: DescribeClusterInput): Request[DescribeClusterOutput]    = js.native
    def describeJobFlows(params: DescribeJobFlowsInput): Request[DescribeJobFlowsOutput] = js.native
    def describeSecurityConfiguration(
        params: DescribeSecurityConfigurationInput
    ): Request[DescribeSecurityConfigurationOutput]                                                  = js.native
    def describeStep(params: DescribeStepInput): Request[DescribeStepOutput]                         = js.native
    def listBootstrapActions(params: ListBootstrapActionsInput): Request[ListBootstrapActionsOutput] = js.native
    def listClusters(params: ListClustersInput): Request[ListClustersOutput]                         = js.native
    def listInstanceFleets(params: ListInstanceFleetsInput): Request[ListInstanceFleetsOutput]       = js.native
    def listInstanceGroups(params: ListInstanceGroupsInput): Request[ListInstanceGroupsOutput]       = js.native
    def listInstances(params: ListInstancesInput): Request[ListInstancesOutput]                      = js.native
    def listSecurityConfigurations(params: ListSecurityConfigurationsInput): Request[ListSecurityConfigurationsOutput] =
      js.native
    def listSteps(params: ListStepsInput): Request[ListStepsOutput]                                  = js.native
    def modifyInstanceFleet(params: ModifyInstanceFleetInput): Request[js.Object]                    = js.native
    def modifyInstanceGroups(params: ModifyInstanceGroupsInput): Request[js.Object]                  = js.native
    def putAutoScalingPolicy(params: PutAutoScalingPolicyInput): Request[PutAutoScalingPolicyOutput] = js.native
    def removeAutoScalingPolicy(params: RemoveAutoScalingPolicyInput): Request[RemoveAutoScalingPolicyOutput] =
      js.native
    def removeTags(params: RemoveTagsInput): Request[RemoveTagsOutput]                      = js.native
    def runJobFlow(params: RunJobFlowInput): Request[RunJobFlowOutput]                      = js.native
    def setTerminationProtection(params: SetTerminationProtectionInput): Request[js.Object] = js.native
    def setVisibleToAllUsers(params: SetVisibleToAllUsersInput): Request[js.Object]         = js.native
    def terminateJobFlows(params: TerminateJobFlowsInput): Request[js.Object]               = js.native
  }

  object ActionOnFailureEnum {
    val TERMINATE_JOB_FLOW = "TERMINATE_JOB_FLOW"
    val TERMINATE_CLUSTER  = "TERMINATE_CLUSTER"
    val CANCEL_AND_WAIT    = "CANCEL_AND_WAIT"
    val CONTINUE           = "CONTINUE"

    val values = IndexedSeq(TERMINATE_JOB_FLOW, TERMINATE_CLUSTER, CANCEL_AND_WAIT, CONTINUE)
  }

  @js.native
  trait AddInstanceFleetInput extends js.Object {
    var ClusterId: XmlStringMaxLen256
    var InstanceFleet: InstanceFleetConfig
  }

  object AddInstanceFleetInput {
    def apply(ClusterId: XmlStringMaxLen256, InstanceFleet: InstanceFleetConfig): AddInstanceFleetInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterId"     -> ClusterId.asInstanceOf[js.Any],
        "InstanceFleet" -> InstanceFleet.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddInstanceFleetInput]
    }
  }

  @js.native
  trait AddInstanceFleetOutput extends js.Object {
    var ClusterId: js.UndefOr[XmlStringMaxLen256]
    var InstanceFleetId: js.UndefOr[InstanceFleetId]
  }

  object AddInstanceFleetOutput {
    def apply(ClusterId: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              InstanceFleetId: js.UndefOr[InstanceFleetId] = js.undefined): AddInstanceFleetOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterId" -> ClusterId.map { x =>
        x.asInstanceOf[js.Any]
      }, "InstanceFleetId" -> InstanceFleetId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddInstanceFleetOutput]
    }
  }

  /**
    * Input to an AddInstanceGroups call.
    */
  @js.native
  trait AddInstanceGroupsInput extends js.Object {
    var InstanceGroups: InstanceGroupConfigList
    var JobFlowId: XmlStringMaxLen256
  }

  object AddInstanceGroupsInput {
    def apply(InstanceGroups: InstanceGroupConfigList, JobFlowId: XmlStringMaxLen256): AddInstanceGroupsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceGroups" -> InstanceGroups.asInstanceOf[js.Any],
        "JobFlowId"      -> JobFlowId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddInstanceGroupsInput]
    }
  }

  /**
    * Output from an AddInstanceGroups call.
    */
  @js.native
  trait AddInstanceGroupsOutput extends js.Object {
    var InstanceGroupIds: js.UndefOr[InstanceGroupIdsList]
    var JobFlowId: js.UndefOr[XmlStringMaxLen256]
  }

  object AddInstanceGroupsOutput {
    def apply(InstanceGroupIds: js.UndefOr[InstanceGroupIdsList] = js.undefined,
              JobFlowId: js.UndefOr[XmlStringMaxLen256] = js.undefined): AddInstanceGroupsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("InstanceGroupIds" -> InstanceGroupIds.map { x =>
        x.asInstanceOf[js.Any]
      }, "JobFlowId" -> JobFlowId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddInstanceGroupsOutput]
    }
  }

  /**
    * The input argument to the <a>AddJobFlowSteps</a> operation.
    */
  @js.native
  trait AddJobFlowStepsInput extends js.Object {
    var JobFlowId: XmlStringMaxLen256
    var Steps: StepConfigList
  }

  object AddJobFlowStepsInput {
    def apply(JobFlowId: XmlStringMaxLen256, Steps: StepConfigList): AddJobFlowStepsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobFlowId" -> JobFlowId.asInstanceOf[js.Any],
        "Steps"     -> Steps.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddJobFlowStepsInput]
    }
  }

  /**
    * The output for the <a>AddJobFlowSteps</a> operation.
    */
  @js.native
  trait AddJobFlowStepsOutput extends js.Object {
    var StepIds: js.UndefOr[StepIdsList]
  }

  object AddJobFlowStepsOutput {
    def apply(StepIds: js.UndefOr[StepIdsList] = js.undefined): AddJobFlowStepsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("StepIds" -> StepIds.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddJobFlowStepsOutput]
    }
  }

  /**
    * This input identifies a cluster and a list of tags to attach.
    */
  @js.native
  trait AddTagsInput extends js.Object {
    var ResourceId: ResourceId
    var Tags: TagList
  }

  object AddTagsInput {
    def apply(ResourceId: ResourceId, Tags: TagList): AddTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "Tags"       -> Tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsInput]
    }
  }

  /**
    * This output indicates the result of adding tags to a resource.
    */
  @js.native
  trait AddTagsOutput extends js.Object {}

  object AddTagsOutput {
    def apply(): AddTagsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsOutput]
    }
  }

  object AdjustmentTypeEnum {
    val CHANGE_IN_CAPACITY         = "CHANGE_IN_CAPACITY"
    val PERCENT_CHANGE_IN_CAPACITY = "PERCENT_CHANGE_IN_CAPACITY"
    val EXACT_CAPACITY             = "EXACT_CAPACITY"

    val values = IndexedSeq(CHANGE_IN_CAPACITY, PERCENT_CHANGE_IN_CAPACITY, EXACT_CAPACITY)
  }

  /**
    * An application is any Amazon or third-party software that you can add to the cluster. This structure contains a list of strings that indicates the software to use with the cluster and accepts a user argument list. Amazon EMR accepts and forwards the argument list to the corresponding installation script as bootstrap action argument. For more information, see [[http://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-mapr.html|Using the MapR Distribution for Hadoop]]. Currently supported values are:
    * * "mapr-m3" - launch the cluster using MapR M3 Edition.
    *  * "mapr-m5" - launch the cluster using MapR M5 Edition.
    *  * "mapr" with the user arguments specifying "--edition,m3" or "--edition,m5" - launch the cluster using MapR M3 or M5 Edition, respectively.
    * '''Note:'''In Amazon EMR releases 4.x and later, the only accepted parameter is the application name. To pass arguments to applications, you supply a configuration for each application.
    */
  @js.native
  trait Application extends js.Object {
    var AdditionalInfo: js.UndefOr[StringMap]
    var Args: js.UndefOr[StringList]
    var Name: js.UndefOr[String]
    var Version: js.UndefOr[String]
  }

  object Application {
    def apply(AdditionalInfo: js.UndefOr[StringMap] = js.undefined,
              Args: js.UndefOr[StringList] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              Version: js.UndefOr[String] = js.undefined): Application = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdditionalInfo" -> AdditionalInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Args" -> Args.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Application]
    }
  }

  /**
    * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. An automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric. See <a>PutAutoScalingPolicy</a>.
    */
  @js.native
  trait AutoScalingPolicy extends js.Object {
    var Constraints: ScalingConstraints
    var Rules: ScalingRuleList
  }

  object AutoScalingPolicy {
    def apply(Constraints: ScalingConstraints, Rules: ScalingRuleList): AutoScalingPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Constraints" -> Constraints.asInstanceOf[js.Any],
        "Rules"       -> Rules.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingPolicy]
    }
  }

  /**
    * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric. See <a>PutAutoScalingPolicy</a>.
    */
  @js.native
  trait AutoScalingPolicyDescription extends js.Object {
    var Constraints: js.UndefOr[ScalingConstraints]
    var Rules: js.UndefOr[ScalingRuleList]
    var Status: js.UndefOr[AutoScalingPolicyStatus]
  }

  object AutoScalingPolicyDescription {
    def apply(Constraints: js.UndefOr[ScalingConstraints] = js.undefined,
              Rules: js.UndefOr[ScalingRuleList] = js.undefined,
              Status: js.UndefOr[AutoScalingPolicyStatus] = js.undefined): AutoScalingPolicyDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Constraints" -> Constraints.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Rules" -> Rules.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingPolicyDescription]
    }
  }

  object AutoScalingPolicyStateEnum {
    val PENDING   = "PENDING"
    val ATTACHING = "ATTACHING"
    val ATTACHED  = "ATTACHED"
    val DETACHING = "DETACHING"
    val DETACHED  = "DETACHED"
    val FAILED    = "FAILED"

    val values = IndexedSeq(PENDING, ATTACHING, ATTACHED, DETACHING, DETACHED, FAILED)
  }

  /**
    * The reason for an <a>AutoScalingPolicyStatus</a> change.
    */
  @js.native
  trait AutoScalingPolicyStateChangeReason extends js.Object {
    var Code: js.UndefOr[AutoScalingPolicyStateChangeReasonCode]
    var Message: js.UndefOr[String]
  }

  object AutoScalingPolicyStateChangeReason {
    def apply(Code: js.UndefOr[AutoScalingPolicyStateChangeReasonCode] = js.undefined,
              Message: js.UndefOr[String] = js.undefined): AutoScalingPolicyStateChangeReason = {
      val _fields = IndexedSeq[(String, js.Any)]("Code" -> Code.map { x =>
        x.asInstanceOf[js.Any]
      }, "Message" -> Message.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingPolicyStateChangeReason]
    }
  }

  object AutoScalingPolicyStateChangeReasonCodeEnum {
    val USER_REQUEST      = "USER_REQUEST"
    val PROVISION_FAILURE = "PROVISION_FAILURE"
    val CLEANUP_FAILURE   = "CLEANUP_FAILURE"

    val values = IndexedSeq(USER_REQUEST, PROVISION_FAILURE, CLEANUP_FAILURE)
  }

  /**
    * The status of an automatic scaling policy.
    */
  @js.native
  trait AutoScalingPolicyStatus extends js.Object {
    var State: js.UndefOr[AutoScalingPolicyState]
    var StateChangeReason: js.UndefOr[AutoScalingPolicyStateChangeReason]
  }

  object AutoScalingPolicyStatus {
    def apply(
        State: js.UndefOr[AutoScalingPolicyState] = js.undefined,
        StateChangeReason: js.UndefOr[AutoScalingPolicyStateChangeReason] = js.undefined
    ): AutoScalingPolicyStatus = {
      val _fields = IndexedSeq[(String, js.Any)]("State" -> State.map { x =>
        x.asInstanceOf[js.Any]
      }, "StateChangeReason" -> StateChangeReason.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingPolicyStatus]
    }
  }

  /**
    * Configuration of a bootstrap action.
    */
  @js.native
  trait BootstrapActionConfig extends js.Object {
    var Name: XmlStringMaxLen256
    var ScriptBootstrapAction: ScriptBootstrapActionConfig
  }

  object BootstrapActionConfig {
    def apply(Name: XmlStringMaxLen256, ScriptBootstrapAction: ScriptBootstrapActionConfig): BootstrapActionConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"                  -> Name.asInstanceOf[js.Any],
        "ScriptBootstrapAction" -> ScriptBootstrapAction.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BootstrapActionConfig]
    }
  }

  /**
    * Reports the configuration of a bootstrap action in a cluster (job flow).
    */
  @js.native
  trait BootstrapActionDetail extends js.Object {
    var BootstrapActionConfig: js.UndefOr[BootstrapActionConfig]
  }

  object BootstrapActionDetail {
    def apply(BootstrapActionConfig: js.UndefOr[BootstrapActionConfig] = js.undefined): BootstrapActionDetail = {
      val _fields = IndexedSeq[(String, js.Any)]("BootstrapActionConfig" -> BootstrapActionConfig.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BootstrapActionDetail]
    }
  }

  /**
    * Specification of the status of a CancelSteps request. Available only in Amazon EMR version 4.8.0 and later, excluding version 5.0.0.
    */
  @js.native
  trait CancelStepsInfo extends js.Object {
    var Reason: js.UndefOr[String]
    var Status: js.UndefOr[CancelStepsRequestStatus]
    var StepId: js.UndefOr[StepId]
  }

  object CancelStepsInfo {
    def apply(Reason: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[CancelStepsRequestStatus] = js.undefined,
              StepId: js.UndefOr[StepId] = js.undefined): CancelStepsInfo = {
      val _fields = IndexedSeq[(String, js.Any)]("Reason" -> Reason.map { x =>
        x.asInstanceOf[js.Any]
      }, "Status" -> Status.map { x =>
        x.asInstanceOf[js.Any]
      }, "StepId" -> StepId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelStepsInfo]
    }
  }

  /**
    * The input argument to the <a>CancelSteps</a> operation.
    */
  @js.native
  trait CancelStepsInput extends js.Object {
    var ClusterId: js.UndefOr[XmlStringMaxLen256]
    var StepIds: js.UndefOr[StepIdsList]
  }

  object CancelStepsInput {
    def apply(ClusterId: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              StepIds: js.UndefOr[StepIdsList] = js.undefined): CancelStepsInput = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterId" -> ClusterId.map { x =>
        x.asInstanceOf[js.Any]
      }, "StepIds" -> StepIds.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelStepsInput]
    }
  }

  /**
    * The output for the <a>CancelSteps</a> operation.
    */
  @js.native
  trait CancelStepsOutput extends js.Object {
    var CancelStepsInfoList: js.UndefOr[CancelStepsInfoList]
  }

  object CancelStepsOutput {
    def apply(CancelStepsInfoList: js.UndefOr[CancelStepsInfoList] = js.undefined): CancelStepsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("CancelStepsInfoList" -> CancelStepsInfoList.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelStepsOutput]
    }
  }

  object CancelStepsRequestStatusEnum {
    val SUBMITTED = "SUBMITTED"
    val FAILED    = "FAILED"

    val values = IndexedSeq(SUBMITTED, FAILED)
  }

  /**
    * The definition of a CloudWatch metric alarm, which determines when an automatic scaling activity is triggered. When the defined alarm conditions are satisfied, scaling activity begins.
    */
  @js.native
  trait CloudWatchAlarmDefinition extends js.Object {
    var ComparisonOperator: ComparisonOperator
    var MetricName: String
    var Period: Int
    var Threshold: NonNegativeDouble
    var Dimensions: js.UndefOr[MetricDimensionList]
    var EvaluationPeriods: js.UndefOr[Int]
    var Namespace: js.UndefOr[String]
    var Statistic: js.UndefOr[Statistic]
    var Unit: js.UndefOr[Unit]
  }

  object CloudWatchAlarmDefinition {
    def apply(ComparisonOperator: ComparisonOperator,
              MetricName: String,
              Period: Int,
              Threshold: NonNegativeDouble,
              Dimensions: js.UndefOr[MetricDimensionList] = js.undefined,
              EvaluationPeriods: js.UndefOr[Int] = js.undefined,
              Namespace: js.UndefOr[String] = js.undefined,
              Statistic: js.UndefOr[Statistic] = js.undefined,
              Unit: js.UndefOr[Unit] = js.undefined): CloudWatchAlarmDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComparisonOperator" -> ComparisonOperator.asInstanceOf[js.Any],
        "MetricName"         -> MetricName.asInstanceOf[js.Any],
        "Period"             -> Period.asInstanceOf[js.Any],
        "Threshold"          -> Threshold.asInstanceOf[js.Any],
        "Dimensions" -> Dimensions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EvaluationPeriods" -> EvaluationPeriods.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Namespace" -> Namespace.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Statistic" -> Statistic.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Unit" -> Unit.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchAlarmDefinition]
    }
  }

  /**
    * The detailed description of the cluster.
    */
  @js.native
  trait Cluster extends js.Object {
    var Applications: js.UndefOr[ApplicationList]
    var AutoScalingRole: js.UndefOr[XmlString]
    var AutoTerminate: js.UndefOr[Boolean]
    var Configurations: js.UndefOr[ConfigurationList]
    var CustomAmiId: js.UndefOr[XmlStringMaxLen256]
    var EbsRootVolumeSize: js.UndefOr[Int]
    var Ec2InstanceAttributes: js.UndefOr[Ec2InstanceAttributes]
    var Id: js.UndefOr[ClusterId]
    var InstanceCollectionType: js.UndefOr[InstanceCollectionType]
    var KerberosAttributes: js.UndefOr[KerberosAttributes]
    var LogUri: js.UndefOr[String]
    var MasterPublicDnsName: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var NormalizedInstanceHours: js.UndefOr[Int]
    var ReleaseLabel: js.UndefOr[String]
    var RepoUpgradeOnBoot: js.UndefOr[RepoUpgradeOnBoot]
    var RequestedAmiVersion: js.UndefOr[String]
    var RunningAmiVersion: js.UndefOr[String]
    var ScaleDownBehavior: js.UndefOr[ScaleDownBehavior]
    var SecurityConfiguration: js.UndefOr[XmlString]
    var ServiceRole: js.UndefOr[String]
    var Status: js.UndefOr[ClusterStatus]
    var Tags: js.UndefOr[TagList]
    var TerminationProtected: js.UndefOr[Boolean]
    var VisibleToAllUsers: js.UndefOr[Boolean]
  }

  object Cluster {
    def apply(Applications: js.UndefOr[ApplicationList] = js.undefined,
              AutoScalingRole: js.UndefOr[XmlString] = js.undefined,
              AutoTerminate: js.UndefOr[Boolean] = js.undefined,
              Configurations: js.UndefOr[ConfigurationList] = js.undefined,
              CustomAmiId: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              EbsRootVolumeSize: js.UndefOr[Int] = js.undefined,
              Ec2InstanceAttributes: js.UndefOr[Ec2InstanceAttributes] = js.undefined,
              Id: js.UndefOr[ClusterId] = js.undefined,
              InstanceCollectionType: js.UndefOr[InstanceCollectionType] = js.undefined,
              KerberosAttributes: js.UndefOr[KerberosAttributes] = js.undefined,
              LogUri: js.UndefOr[String] = js.undefined,
              MasterPublicDnsName: js.UndefOr[String] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              NormalizedInstanceHours: js.UndefOr[Int] = js.undefined,
              ReleaseLabel: js.UndefOr[String] = js.undefined,
              RepoUpgradeOnBoot: js.UndefOr[RepoUpgradeOnBoot] = js.undefined,
              RequestedAmiVersion: js.UndefOr[String] = js.undefined,
              RunningAmiVersion: js.UndefOr[String] = js.undefined,
              ScaleDownBehavior: js.UndefOr[ScaleDownBehavior] = js.undefined,
              SecurityConfiguration: js.UndefOr[XmlString] = js.undefined,
              ServiceRole: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[ClusterStatus] = js.undefined,
              Tags: js.UndefOr[TagList] = js.undefined,
              TerminationProtected: js.UndefOr[Boolean] = js.undefined,
              VisibleToAllUsers: js.UndefOr[Boolean] = js.undefined): Cluster = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Applications" -> Applications.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoScalingRole" -> AutoScalingRole.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoTerminate" -> AutoTerminate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Configurations" -> Configurations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomAmiId" -> CustomAmiId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EbsRootVolumeSize" -> EbsRootVolumeSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Ec2InstanceAttributes" -> Ec2InstanceAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceCollectionType" -> InstanceCollectionType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KerberosAttributes" -> KerberosAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogUri" -> LogUri.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterPublicDnsName" -> MasterPublicDnsName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NormalizedInstanceHours" -> NormalizedInstanceHours.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReleaseLabel" -> ReleaseLabel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RepoUpgradeOnBoot" -> RepoUpgradeOnBoot.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequestedAmiVersion" -> RequestedAmiVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RunningAmiVersion" -> RunningAmiVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScaleDownBehavior" -> ScaleDownBehavior.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityConfiguration" -> SecurityConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServiceRole" -> ServiceRole.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TerminationProtected" -> TerminationProtected.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VisibleToAllUsers" -> VisibleToAllUsers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Cluster]
    }
  }

  object ClusterStateEnum {
    val STARTING               = "STARTING"
    val BOOTSTRAPPING          = "BOOTSTRAPPING"
    val RUNNING                = "RUNNING"
    val WAITING                = "WAITING"
    val TERMINATING            = "TERMINATING"
    val TERMINATED             = "TERMINATED"
    val TERMINATED_WITH_ERRORS = "TERMINATED_WITH_ERRORS"

    val values = IndexedSeq(STARTING, BOOTSTRAPPING, RUNNING, WAITING, TERMINATING, TERMINATED, TERMINATED_WITH_ERRORS)
  }

  /**
    * The reason that the cluster changed to its current state.
    */
  @js.native
  trait ClusterStateChangeReason extends js.Object {
    var Code: js.UndefOr[ClusterStateChangeReasonCode]
    var Message: js.UndefOr[String]
  }

  object ClusterStateChangeReason {
    def apply(Code: js.UndefOr[ClusterStateChangeReasonCode] = js.undefined,
              Message: js.UndefOr[String] = js.undefined): ClusterStateChangeReason = {
      val _fields = IndexedSeq[(String, js.Any)]("Code" -> Code.map { x =>
        x.asInstanceOf[js.Any]
      }, "Message" -> Message.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterStateChangeReason]
    }
  }

  object ClusterStateChangeReasonCodeEnum {
    val INTERNAL_ERROR         = "INTERNAL_ERROR"
    val VALIDATION_ERROR       = "VALIDATION_ERROR"
    val INSTANCE_FAILURE       = "INSTANCE_FAILURE"
    val INSTANCE_FLEET_TIMEOUT = "INSTANCE_FLEET_TIMEOUT"
    val BOOTSTRAP_FAILURE      = "BOOTSTRAP_FAILURE"
    val USER_REQUEST           = "USER_REQUEST"
    val STEP_FAILURE           = "STEP_FAILURE"
    val ALL_STEPS_COMPLETED    = "ALL_STEPS_COMPLETED"

    val values = IndexedSeq(
      INTERNAL_ERROR,
      VALIDATION_ERROR,
      INSTANCE_FAILURE,
      INSTANCE_FLEET_TIMEOUT,
      BOOTSTRAP_FAILURE,
      USER_REQUEST,
      STEP_FAILURE,
      ALL_STEPS_COMPLETED
    )
  }

  /**
    * The detailed status of the cluster.
    */
  @js.native
  trait ClusterStatus extends js.Object {
    var State: js.UndefOr[ClusterState]
    var StateChangeReason: js.UndefOr[ClusterStateChangeReason]
    var Timeline: js.UndefOr[ClusterTimeline]
  }

  object ClusterStatus {
    def apply(State: js.UndefOr[ClusterState] = js.undefined,
              StateChangeReason: js.UndefOr[ClusterStateChangeReason] = js.undefined,
              Timeline: js.UndefOr[ClusterTimeline] = js.undefined): ClusterStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StateChangeReason" -> StateChangeReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timeline" -> Timeline.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterStatus]
    }
  }

  /**
    * The summary description of the cluster.
    */
  @js.native
  trait ClusterSummary extends js.Object {
    var Id: js.UndefOr[ClusterId]
    var Name: js.UndefOr[String]
    var NormalizedInstanceHours: js.UndefOr[Int]
    var Status: js.UndefOr[ClusterStatus]
  }

  object ClusterSummary {
    def apply(Id: js.UndefOr[ClusterId] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              NormalizedInstanceHours: js.UndefOr[Int] = js.undefined,
              Status: js.UndefOr[ClusterStatus] = js.undefined): ClusterSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NormalizedInstanceHours" -> NormalizedInstanceHours.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterSummary]
    }
  }

  /**
    * Represents the timeline of the cluster's lifecycle.
    */
  @js.native
  trait ClusterTimeline extends js.Object {
    var CreationDateTime: js.UndefOr[Date]
    var EndDateTime: js.UndefOr[Date]
    var ReadyDateTime: js.UndefOr[Date]
  }

  object ClusterTimeline {
    def apply(CreationDateTime: js.UndefOr[Date] = js.undefined,
              EndDateTime: js.UndefOr[Date] = js.undefined,
              ReadyDateTime: js.UndefOr[Date] = js.undefined): ClusterTimeline = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDateTime" -> CreationDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndDateTime" -> EndDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReadyDateTime" -> ReadyDateTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterTimeline]
    }
  }

  /**
    * An entity describing an executable that runs on a cluster.
    */
  @js.native
  trait Command extends js.Object {
    var Args: js.UndefOr[StringList]
    var Name: js.UndefOr[String]
    var ScriptPath: js.UndefOr[String]
  }

  object Command {
    def apply(Args: js.UndefOr[StringList] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              ScriptPath: js.UndefOr[String] = js.undefined): Command = {
      val _fields = IndexedSeq[(String, js.Any)]("Args" -> Args.map { x =>
        x.asInstanceOf[js.Any]
      }, "Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }, "ScriptPath" -> ScriptPath.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Command]
    }
  }

  object ComparisonOperatorEnum {
    val GREATER_THAN_OR_EQUAL = "GREATER_THAN_OR_EQUAL"
    val GREATER_THAN          = "GREATER_THAN"
    val LESS_THAN             = "LESS_THAN"
    val LESS_THAN_OR_EQUAL    = "LESS_THAN_OR_EQUAL"

    val values = IndexedSeq(GREATER_THAN_OR_EQUAL, GREATER_THAN, LESS_THAN, LESS_THAN_OR_EQUAL)
  }

  /**
    * '''Note:'''Amazon EMR releases 4.x or later.
    * An optional configuration specification to be used when provisioning cluster instances, which can include configurations for applications and software bundled with Amazon EMR. A configuration consists of a classification, properties, and optional nested configurations. A classification refers to an application-specific configuration file. Properties are the settings you want to change in that file. For more information, see [[http://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html|Configuring Applications]].
    */
  @js.native
  trait Configuration extends js.Object {
    var Classification: js.UndefOr[String]
    var Configurations: js.UndefOr[ConfigurationList]
    var Properties: js.UndefOr[StringMap]
  }

  object Configuration {
    def apply(Classification: js.UndefOr[String] = js.undefined,
              Configurations: js.UndefOr[ConfigurationList] = js.undefined,
              Properties: js.UndefOr[StringMap] = js.undefined): Configuration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Classification" -> Classification.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Configurations" -> Configurations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Properties" -> Properties.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Configuration]
    }
  }

  @js.native
  trait CreateSecurityConfigurationInput extends js.Object {
    var Name: XmlString
    var SecurityConfiguration: String
  }

  object CreateSecurityConfigurationInput {
    def apply(Name: XmlString, SecurityConfiguration: String): CreateSecurityConfigurationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"                  -> Name.asInstanceOf[js.Any],
        "SecurityConfiguration" -> SecurityConfiguration.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSecurityConfigurationInput]
    }
  }

  @js.native
  trait CreateSecurityConfigurationOutput extends js.Object {
    var CreationDateTime: Date
    var Name: XmlString
  }

  object CreateSecurityConfigurationOutput {
    def apply(CreationDateTime: Date, Name: XmlString): CreateSecurityConfigurationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDateTime" -> CreationDateTime.asInstanceOf[js.Any],
        "Name"             -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSecurityConfigurationOutput]
    }
  }

  @js.native
  trait DeleteSecurityConfigurationInput extends js.Object {
    var Name: XmlString
  }

  object DeleteSecurityConfigurationInput {
    def apply(Name: XmlString): DeleteSecurityConfigurationInput = {
      val _fields =
        IndexedSeq[(String, js.Any)]("Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSecurityConfigurationInput]
    }
  }

  @js.native
  trait DeleteSecurityConfigurationOutput extends js.Object {}

  object DeleteSecurityConfigurationOutput {
    def apply(): DeleteSecurityConfigurationOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSecurityConfigurationOutput]
    }
  }

  /**
    * This input determines which cluster to describe.
    */
  @js.native
  trait DescribeClusterInput extends js.Object {
    var ClusterId: ClusterId
  }

  object DescribeClusterInput {
    def apply(ClusterId: ClusterId): DescribeClusterInput = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterId" -> ClusterId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterInput]
    }
  }

  /**
    * This output contains the description of the cluster.
    */
  @js.native
  trait DescribeClusterOutput extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object DescribeClusterOutput {
    def apply(Cluster: js.UndefOr[Cluster] = js.undefined): DescribeClusterOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("Cluster" -> Cluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterOutput]
    }
  }

  /**
    * The input for the <a>DescribeJobFlows</a> operation.
    */
  @js.native
  trait DescribeJobFlowsInput extends js.Object {
    var CreatedAfter: js.UndefOr[Date]
    var CreatedBefore: js.UndefOr[Date]
    var JobFlowIds: js.UndefOr[XmlStringList]
    var JobFlowStates: js.UndefOr[JobFlowExecutionStateList]
  }

  object DescribeJobFlowsInput {
    def apply(CreatedAfter: js.UndefOr[Date] = js.undefined,
              CreatedBefore: js.UndefOr[Date] = js.undefined,
              JobFlowIds: js.UndefOr[XmlStringList] = js.undefined,
              JobFlowStates: js.UndefOr[JobFlowExecutionStateList] = js.undefined): DescribeJobFlowsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedAfter" -> CreatedAfter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedBefore" -> CreatedBefore.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobFlowIds" -> JobFlowIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobFlowStates" -> JobFlowStates.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobFlowsInput]
    }
  }

  /**
    * The output for the <a>DescribeJobFlows</a> operation.
    */
  @js.native
  trait DescribeJobFlowsOutput extends js.Object {
    var JobFlows: js.UndefOr[JobFlowDetailList]
  }

  object DescribeJobFlowsOutput {
    def apply(JobFlows: js.UndefOr[JobFlowDetailList] = js.undefined): DescribeJobFlowsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("JobFlows" -> JobFlows.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobFlowsOutput]
    }
  }

  @js.native
  trait DescribeSecurityConfigurationInput extends js.Object {
    var Name: XmlString
  }

  object DescribeSecurityConfigurationInput {
    def apply(Name: XmlString): DescribeSecurityConfigurationInput = {
      val _fields =
        IndexedSeq[(String, js.Any)]("Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSecurityConfigurationInput]
    }
  }

  @js.native
  trait DescribeSecurityConfigurationOutput extends js.Object {
    var CreationDateTime: js.UndefOr[Date]
    var Name: js.UndefOr[XmlString]
    var SecurityConfiguration: js.UndefOr[String]
  }

  object DescribeSecurityConfigurationOutput {
    def apply(CreationDateTime: js.UndefOr[Date] = js.undefined,
              Name: js.UndefOr[XmlString] = js.undefined,
              SecurityConfiguration: js.UndefOr[String] = js.undefined): DescribeSecurityConfigurationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDateTime" -> CreationDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityConfiguration" -> SecurityConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSecurityConfigurationOutput]
    }
  }

  /**
    * This input determines which step to describe.
    */
  @js.native
  trait DescribeStepInput extends js.Object {
    var ClusterId: ClusterId
    var StepId: StepId
  }

  object DescribeStepInput {
    def apply(ClusterId: ClusterId, StepId: StepId): DescribeStepInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterId" -> ClusterId.asInstanceOf[js.Any],
        "StepId"    -> StepId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStepInput]
    }
  }

  /**
    * This output contains the description of the cluster step.
    */
  @js.native
  trait DescribeStepOutput extends js.Object {
    var Step: js.UndefOr[Step]
  }

  object DescribeStepOutput {
    def apply(Step: js.UndefOr[Step] = js.undefined): DescribeStepOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("Step" -> Step.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStepOutput]
    }
  }

  /**
    * Configuration of requested EBS block device associated with the instance group.
    */
  @js.native
  trait EbsBlockDevice extends js.Object {
    var Device: js.UndefOr[String]
    var VolumeSpecification: js.UndefOr[VolumeSpecification]
  }

  object EbsBlockDevice {
    def apply(Device: js.UndefOr[String] = js.undefined,
              VolumeSpecification: js.UndefOr[VolumeSpecification] = js.undefined): EbsBlockDevice = {
      val _fields = IndexedSeq[(String, js.Any)]("Device" -> Device.map { x =>
        x.asInstanceOf[js.Any]
      }, "VolumeSpecification" -> VolumeSpecification.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EbsBlockDevice]
    }
  }

  /**
    * Configuration of requested EBS block device associated with the instance group with count of volumes that will be associated to every instance.
    */
  @js.native
  trait EbsBlockDeviceConfig extends js.Object {
    var VolumeSpecification: VolumeSpecification
    var VolumesPerInstance: js.UndefOr[Int]
  }

  object EbsBlockDeviceConfig {
    def apply(VolumeSpecification: VolumeSpecification,
              VolumesPerInstance: js.UndefOr[Int] = js.undefined): EbsBlockDeviceConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeSpecification" -> VolumeSpecification.asInstanceOf[js.Any],
        "VolumesPerInstance" -> VolumesPerInstance.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EbsBlockDeviceConfig]
    }
  }

  /**
    * The Amazon EBS configuration of a cluster instance.
    */
  @js.native
  trait EbsConfiguration extends js.Object {
    var EbsBlockDeviceConfigs: js.UndefOr[EbsBlockDeviceConfigList]
    var EbsOptimized: js.UndefOr[BooleanObject]
  }

  object EbsConfiguration {
    def apply(EbsBlockDeviceConfigs: js.UndefOr[EbsBlockDeviceConfigList] = js.undefined,
              EbsOptimized: js.UndefOr[BooleanObject] = js.undefined): EbsConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)]("EbsBlockDeviceConfigs" -> EbsBlockDeviceConfigs.map { x =>
        x.asInstanceOf[js.Any]
      }, "EbsOptimized" -> EbsOptimized.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EbsConfiguration]
    }
  }

  /**
    * EBS block device that's attached to an EC2 instance.
    */
  @js.native
  trait EbsVolume extends js.Object {
    var Device: js.UndefOr[String]
    var VolumeId: js.UndefOr[String]
  }

  object EbsVolume {
    def apply(Device: js.UndefOr[String] = js.undefined, VolumeId: js.UndefOr[String] = js.undefined): EbsVolume = {
      val _fields = IndexedSeq[(String, js.Any)]("Device" -> Device.map { x =>
        x.asInstanceOf[js.Any]
      }, "VolumeId" -> VolumeId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EbsVolume]
    }
  }

  /**
    * Provides information about the EC2 instances in a cluster grouped by category. For example, key name, subnet ID, IAM instance profile, and so on.
    */
  @js.native
  trait Ec2InstanceAttributes extends js.Object {
    var AdditionalMasterSecurityGroups: js.UndefOr[StringList]
    var AdditionalSlaveSecurityGroups: js.UndefOr[StringList]
    var Ec2AvailabilityZone: js.UndefOr[String]
    var Ec2KeyName: js.UndefOr[String]
    var Ec2SubnetId: js.UndefOr[String]
    var EmrManagedMasterSecurityGroup: js.UndefOr[String]
    var EmrManagedSlaveSecurityGroup: js.UndefOr[String]
    var IamInstanceProfile: js.UndefOr[String]
    var RequestedEc2AvailabilityZones: js.UndefOr[XmlStringMaxLen256List]
    var RequestedEc2SubnetIds: js.UndefOr[XmlStringMaxLen256List]
    var ServiceAccessSecurityGroup: js.UndefOr[String]
  }

  object Ec2InstanceAttributes {
    def apply(AdditionalMasterSecurityGroups: js.UndefOr[StringList] = js.undefined,
              AdditionalSlaveSecurityGroups: js.UndefOr[StringList] = js.undefined,
              Ec2AvailabilityZone: js.UndefOr[String] = js.undefined,
              Ec2KeyName: js.UndefOr[String] = js.undefined,
              Ec2SubnetId: js.UndefOr[String] = js.undefined,
              EmrManagedMasterSecurityGroup: js.UndefOr[String] = js.undefined,
              EmrManagedSlaveSecurityGroup: js.UndefOr[String] = js.undefined,
              IamInstanceProfile: js.UndefOr[String] = js.undefined,
              RequestedEc2AvailabilityZones: js.UndefOr[XmlStringMaxLen256List] = js.undefined,
              RequestedEc2SubnetIds: js.UndefOr[XmlStringMaxLen256List] = js.undefined,
              ServiceAccessSecurityGroup: js.UndefOr[String] = js.undefined): Ec2InstanceAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdditionalMasterSecurityGroups" -> AdditionalMasterSecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AdditionalSlaveSecurityGroups" -> AdditionalSlaveSecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Ec2AvailabilityZone" -> Ec2AvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Ec2KeyName" -> Ec2KeyName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Ec2SubnetId" -> Ec2SubnetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmrManagedMasterSecurityGroup" -> EmrManagedMasterSecurityGroup.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmrManagedSlaveSecurityGroup" -> EmrManagedSlaveSecurityGroup.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IamInstanceProfile" -> IamInstanceProfile.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequestedEc2AvailabilityZones" -> RequestedEc2AvailabilityZones.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequestedEc2SubnetIds" -> RequestedEc2SubnetIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServiceAccessSecurityGroup" -> ServiceAccessSecurityGroup.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Ec2InstanceAttributes]
    }
  }

  /**
    * The details of the step failure. The service attempts to detect the root cause for many common failures.
    */
  @js.native
  trait FailureDetails extends js.Object {
    var LogFile: js.UndefOr[String]
    var Message: js.UndefOr[String]
    var Reason: js.UndefOr[String]
  }

  object FailureDetails {
    def apply(LogFile: js.UndefOr[String] = js.undefined,
              Message: js.UndefOr[String] = js.undefined,
              Reason: js.UndefOr[String] = js.undefined): FailureDetails = {
      val _fields = IndexedSeq[(String, js.Any)]("LogFile" -> LogFile.map { x =>
        x.asInstanceOf[js.Any]
      }, "Message" -> Message.map { x =>
        x.asInstanceOf[js.Any]
      }, "Reason" -> Reason.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailureDetails]
    }
  }

  /**
    * A job flow step consisting of a JAR file whose main function will be executed. The main function submits a job for Hadoop to execute and waits for the job to finish or fail.
    */
  @js.native
  trait HadoopJarStepConfig extends js.Object {
    var Jar: XmlString
    var Args: js.UndefOr[XmlStringList]
    var MainClass: js.UndefOr[XmlString]
    var Properties: js.UndefOr[KeyValueList]
  }

  object HadoopJarStepConfig {
    def apply(Jar: XmlString,
              Args: js.UndefOr[XmlStringList] = js.undefined,
              MainClass: js.UndefOr[XmlString] = js.undefined,
              Properties: js.UndefOr[KeyValueList] = js.undefined): HadoopJarStepConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Jar" -> Jar.asInstanceOf[js.Any],
        "Args" -> Args.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MainClass" -> MainClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Properties" -> Properties.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HadoopJarStepConfig]
    }
  }

  /**
    * A cluster step consisting of a JAR file whose main function will be executed. The main function submits a job for Hadoop to execute and waits for the job to finish or fail.
    */
  @js.native
  trait HadoopStepConfig extends js.Object {
    var Args: js.UndefOr[StringList]
    var Jar: js.UndefOr[String]
    var MainClass: js.UndefOr[String]
    var Properties: js.UndefOr[StringMap]
  }

  object HadoopStepConfig {
    def apply(Args: js.UndefOr[StringList] = js.undefined,
              Jar: js.UndefOr[String] = js.undefined,
              MainClass: js.UndefOr[String] = js.undefined,
              Properties: js.UndefOr[StringMap] = js.undefined): HadoopStepConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Args" -> Args.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Jar" -> Jar.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MainClass" -> MainClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Properties" -> Properties.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HadoopStepConfig]
    }
  }

  /**
    * Represents an EC2 instance provisioned as part of cluster.
    */
  @js.native
  trait Instance extends js.Object {
    var EbsVolumes: js.UndefOr[EbsVolumeList]
    var Ec2InstanceId: js.UndefOr[InstanceId]
    var Id: js.UndefOr[InstanceId]
    var InstanceFleetId: js.UndefOr[InstanceFleetId]
    var InstanceGroupId: js.UndefOr[String]
    var InstanceType: js.UndefOr[InstanceType]
    var Market: js.UndefOr[MarketType]
    var PrivateDnsName: js.UndefOr[String]
    var PrivateIpAddress: js.UndefOr[String]
    var PublicDnsName: js.UndefOr[String]
    var PublicIpAddress: js.UndefOr[String]
    var Status: js.UndefOr[InstanceStatus]
  }

  object Instance {
    def apply(EbsVolumes: js.UndefOr[EbsVolumeList] = js.undefined,
              Ec2InstanceId: js.UndefOr[InstanceId] = js.undefined,
              Id: js.UndefOr[InstanceId] = js.undefined,
              InstanceFleetId: js.UndefOr[InstanceFleetId] = js.undefined,
              InstanceGroupId: js.UndefOr[String] = js.undefined,
              InstanceType: js.UndefOr[InstanceType] = js.undefined,
              Market: js.UndefOr[MarketType] = js.undefined,
              PrivateDnsName: js.UndefOr[String] = js.undefined,
              PrivateIpAddress: js.UndefOr[String] = js.undefined,
              PublicDnsName: js.UndefOr[String] = js.undefined,
              PublicIpAddress: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[InstanceStatus] = js.undefined): Instance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EbsVolumes" -> EbsVolumes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Ec2InstanceId" -> Ec2InstanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceFleetId" -> InstanceFleetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceGroupId" -> InstanceGroupId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceType" -> InstanceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Market" -> Market.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PrivateDnsName" -> PrivateDnsName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PrivateIpAddress" -> PrivateIpAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PublicDnsName" -> PublicDnsName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PublicIpAddress" -> PublicIpAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Instance]
    }
  }

  object InstanceCollectionTypeEnum {
    val INSTANCE_FLEET = "INSTANCE_FLEET"
    val INSTANCE_GROUP = "INSTANCE_GROUP"

    val values = IndexedSeq(INSTANCE_FLEET, INSTANCE_GROUP)
  }

  /**
    * Describes an instance fleet, which is a group of EC2 instances that host a particular node type (master, core, or task) in an Amazon EMR cluster. Instance fleets can consist of a mix of instance types and On-Demand and Spot instances, which are provisioned to meet a defined target capacity.
    *
    * '''Note:'''The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.
    */
  @js.native
  trait InstanceFleet extends js.Object {
    var Id: js.UndefOr[InstanceFleetId]
    var InstanceFleetType: js.UndefOr[InstanceFleetType]
    var InstanceTypeSpecifications: js.UndefOr[InstanceTypeSpecificationList]
    var LaunchSpecifications: js.UndefOr[InstanceFleetProvisioningSpecifications]
    var Name: js.UndefOr[XmlStringMaxLen256]
    var ProvisionedOnDemandCapacity: js.UndefOr[WholeNumber]
    var ProvisionedSpotCapacity: js.UndefOr[WholeNumber]
    var Status: js.UndefOr[InstanceFleetStatus]
    var TargetOnDemandCapacity: js.UndefOr[WholeNumber]
    var TargetSpotCapacity: js.UndefOr[WholeNumber]
  }

  object InstanceFleet {
    def apply(Id: js.UndefOr[InstanceFleetId] = js.undefined,
              InstanceFleetType: js.UndefOr[InstanceFleetType] = js.undefined,
              InstanceTypeSpecifications: js.UndefOr[InstanceTypeSpecificationList] = js.undefined,
              LaunchSpecifications: js.UndefOr[InstanceFleetProvisioningSpecifications] = js.undefined,
              Name: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              ProvisionedOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined,
              ProvisionedSpotCapacity: js.UndefOr[WholeNumber] = js.undefined,
              Status: js.UndefOr[InstanceFleetStatus] = js.undefined,
              TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined,
              TargetSpotCapacity: js.UndefOr[WholeNumber] = js.undefined): InstanceFleet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceFleetType" -> InstanceFleetType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceTypeSpecifications" -> InstanceTypeSpecifications.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LaunchSpecifications" -> LaunchSpecifications.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProvisionedOnDemandCapacity" -> ProvisionedOnDemandCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProvisionedSpotCapacity" -> ProvisionedSpotCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TargetOnDemandCapacity" -> TargetOnDemandCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TargetSpotCapacity" -> TargetSpotCapacity.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceFleet]
    }
  }

  /**
    * The configuration that defines an instance fleet.
    *
    * '''Note:'''The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.
    */
  @js.native
  trait InstanceFleetConfig extends js.Object {
    var InstanceFleetType: InstanceFleetType
    var InstanceTypeConfigs: js.UndefOr[InstanceTypeConfigList]
    var LaunchSpecifications: js.UndefOr[InstanceFleetProvisioningSpecifications]
    var Name: js.UndefOr[XmlStringMaxLen256]
    var TargetOnDemandCapacity: js.UndefOr[WholeNumber]
    var TargetSpotCapacity: js.UndefOr[WholeNumber]
  }

  object InstanceFleetConfig {
    def apply(InstanceFleetType: InstanceFleetType,
              InstanceTypeConfigs: js.UndefOr[InstanceTypeConfigList] = js.undefined,
              LaunchSpecifications: js.UndefOr[InstanceFleetProvisioningSpecifications] = js.undefined,
              Name: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined,
              TargetSpotCapacity: js.UndefOr[WholeNumber] = js.undefined): InstanceFleetConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceFleetType" -> InstanceFleetType.asInstanceOf[js.Any],
        "InstanceTypeConfigs" -> InstanceTypeConfigs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LaunchSpecifications" -> LaunchSpecifications.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TargetOnDemandCapacity" -> TargetOnDemandCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TargetSpotCapacity" -> TargetSpotCapacity.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceFleetConfig]
    }
  }

  /**
    * Configuration parameters for an instance fleet modification request.
    *
    * '''Note:'''The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.
    */
  @js.native
  trait InstanceFleetModifyConfig extends js.Object {
    var InstanceFleetId: InstanceFleetId
    var TargetOnDemandCapacity: js.UndefOr[WholeNumber]
    var TargetSpotCapacity: js.UndefOr[WholeNumber]
  }

  object InstanceFleetModifyConfig {
    def apply(InstanceFleetId: InstanceFleetId,
              TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined,
              TargetSpotCapacity: js.UndefOr[WholeNumber] = js.undefined): InstanceFleetModifyConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceFleetId" -> InstanceFleetId.asInstanceOf[js.Any],
        "TargetOnDemandCapacity" -> TargetOnDemandCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TargetSpotCapacity" -> TargetSpotCapacity.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceFleetModifyConfig]
    }
  }

  /**
    * The launch specification for Spot instances in the fleet, which determines the defined duration and provisioning timeout behavior.
    *
    * '''Note:'''The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.
    */
  @js.native
  trait InstanceFleetProvisioningSpecifications extends js.Object {
    var SpotSpecification: SpotProvisioningSpecification
  }

  object InstanceFleetProvisioningSpecifications {
    def apply(SpotSpecification: SpotProvisioningSpecification): InstanceFleetProvisioningSpecifications = {
      val _fields = IndexedSeq[(String, js.Any)]("SpotSpecification" -> SpotSpecification.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceFleetProvisioningSpecifications]
    }
  }

  object InstanceFleetStateEnum {
    val PROVISIONING  = "PROVISIONING"
    val BOOTSTRAPPING = "BOOTSTRAPPING"
    val RUNNING       = "RUNNING"
    val RESIZING      = "RESIZING"
    val SUSPENDED     = "SUSPENDED"
    val TERMINATING   = "TERMINATING"
    val TERMINATED    = "TERMINATED"

    val values = IndexedSeq(PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING, SUSPENDED, TERMINATING, TERMINATED)
  }

  /**
    * Provides status change reason details for the instance fleet.
    *
    * '''Note:'''The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.
    */
  @js.native
  trait InstanceFleetStateChangeReason extends js.Object {
    var Code: js.UndefOr[InstanceFleetStateChangeReasonCode]
    var Message: js.UndefOr[String]
  }

  object InstanceFleetStateChangeReason {
    def apply(Code: js.UndefOr[InstanceFleetStateChangeReasonCode] = js.undefined,
              Message: js.UndefOr[String] = js.undefined): InstanceFleetStateChangeReason = {
      val _fields = IndexedSeq[(String, js.Any)]("Code" -> Code.map { x =>
        x.asInstanceOf[js.Any]
      }, "Message" -> Message.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceFleetStateChangeReason]
    }
  }

  object InstanceFleetStateChangeReasonCodeEnum {
    val INTERNAL_ERROR     = "INTERNAL_ERROR"
    val VALIDATION_ERROR   = "VALIDATION_ERROR"
    val INSTANCE_FAILURE   = "INSTANCE_FAILURE"
    val CLUSTER_TERMINATED = "CLUSTER_TERMINATED"

    val values = IndexedSeq(INTERNAL_ERROR, VALIDATION_ERROR, INSTANCE_FAILURE, CLUSTER_TERMINATED)
  }

  /**
    * The status of the instance fleet.
    *
    * '''Note:'''The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.
    */
  @js.native
  trait InstanceFleetStatus extends js.Object {
    var State: js.UndefOr[InstanceFleetState]
    var StateChangeReason: js.UndefOr[InstanceFleetStateChangeReason]
    var Timeline: js.UndefOr[InstanceFleetTimeline]
  }

  object InstanceFleetStatus {
    def apply(State: js.UndefOr[InstanceFleetState] = js.undefined,
              StateChangeReason: js.UndefOr[InstanceFleetStateChangeReason] = js.undefined,
              Timeline: js.UndefOr[InstanceFleetTimeline] = js.undefined): InstanceFleetStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StateChangeReason" -> StateChangeReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timeline" -> Timeline.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceFleetStatus]
    }
  }

  /**
    * Provides historical timestamps for the instance fleet, including the time of creation, the time it became ready to run jobs, and the time of termination.
    *
    * '''Note:'''The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.
    */
  @js.native
  trait InstanceFleetTimeline extends js.Object {
    var CreationDateTime: js.UndefOr[Date]
    var EndDateTime: js.UndefOr[Date]
    var ReadyDateTime: js.UndefOr[Date]
  }

  object InstanceFleetTimeline {
    def apply(CreationDateTime: js.UndefOr[Date] = js.undefined,
              EndDateTime: js.UndefOr[Date] = js.undefined,
              ReadyDateTime: js.UndefOr[Date] = js.undefined): InstanceFleetTimeline = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDateTime" -> CreationDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndDateTime" -> EndDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReadyDateTime" -> ReadyDateTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceFleetTimeline]
    }
  }

  object InstanceFleetTypeEnum {
    val MASTER = "MASTER"
    val CORE   = "CORE"
    val TASK   = "TASK"

    val values = IndexedSeq(MASTER, CORE, TASK)
  }

  /**
    * This entity represents an instance group, which is a group of instances that have common purpose. For example, CORE instance group is used for HDFS.
    */
  @js.native
  trait InstanceGroup extends js.Object {
    var AutoScalingPolicy: js.UndefOr[AutoScalingPolicyDescription]
    var BidPrice: js.UndefOr[String]
    var Configurations: js.UndefOr[ConfigurationList]
    var EbsBlockDevices: js.UndefOr[EbsBlockDeviceList]
    var EbsOptimized: js.UndefOr[BooleanObject]
    var Id: js.UndefOr[InstanceGroupId]
    var InstanceGroupType: js.UndefOr[InstanceGroupType]
    var InstanceType: js.UndefOr[InstanceType]
    var Market: js.UndefOr[MarketType]
    var Name: js.UndefOr[String]
    var RequestedInstanceCount: js.UndefOr[Int]
    var RunningInstanceCount: js.UndefOr[Int]
    var ShrinkPolicy: js.UndefOr[ShrinkPolicy]
    var Status: js.UndefOr[InstanceGroupStatus]
  }

  object InstanceGroup {
    def apply(AutoScalingPolicy: js.UndefOr[AutoScalingPolicyDescription] = js.undefined,
              BidPrice: js.UndefOr[String] = js.undefined,
              Configurations: js.UndefOr[ConfigurationList] = js.undefined,
              EbsBlockDevices: js.UndefOr[EbsBlockDeviceList] = js.undefined,
              EbsOptimized: js.UndefOr[BooleanObject] = js.undefined,
              Id: js.UndefOr[InstanceGroupId] = js.undefined,
              InstanceGroupType: js.UndefOr[InstanceGroupType] = js.undefined,
              InstanceType: js.UndefOr[InstanceType] = js.undefined,
              Market: js.UndefOr[MarketType] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              RequestedInstanceCount: js.UndefOr[Int] = js.undefined,
              RunningInstanceCount: js.UndefOr[Int] = js.undefined,
              ShrinkPolicy: js.UndefOr[ShrinkPolicy] = js.undefined,
              Status: js.UndefOr[InstanceGroupStatus] = js.undefined): InstanceGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingPolicy" -> AutoScalingPolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BidPrice" -> BidPrice.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Configurations" -> Configurations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EbsBlockDevices" -> EbsBlockDevices.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EbsOptimized" -> EbsOptimized.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceGroupType" -> InstanceGroupType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceType" -> InstanceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Market" -> Market.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequestedInstanceCount" -> RequestedInstanceCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RunningInstanceCount" -> RunningInstanceCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ShrinkPolicy" -> ShrinkPolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceGroup]
    }
  }

  /**
    * Configuration defining a new instance group.
    */
  @js.native
  trait InstanceGroupConfig extends js.Object {
    var InstanceCount: Int
    var InstanceRole: InstanceRoleType
    var InstanceType: InstanceType
    var AutoScalingPolicy: js.UndefOr[AutoScalingPolicy]
    var BidPrice: js.UndefOr[XmlStringMaxLen256]
    var Configurations: js.UndefOr[ConfigurationList]
    var EbsConfiguration: js.UndefOr[EbsConfiguration]
    var Market: js.UndefOr[MarketType]
    var Name: js.UndefOr[XmlStringMaxLen256]
  }

  object InstanceGroupConfig {
    def apply(InstanceCount: Int,
              InstanceRole: InstanceRoleType,
              InstanceType: InstanceType,
              AutoScalingPolicy: js.UndefOr[AutoScalingPolicy] = js.undefined,
              BidPrice: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              Configurations: js.UndefOr[ConfigurationList] = js.undefined,
              EbsConfiguration: js.UndefOr[EbsConfiguration] = js.undefined,
              Market: js.UndefOr[MarketType] = js.undefined,
              Name: js.UndefOr[XmlStringMaxLen256] = js.undefined): InstanceGroupConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceCount" -> InstanceCount.asInstanceOf[js.Any],
        "InstanceRole"  -> InstanceRole.asInstanceOf[js.Any],
        "InstanceType"  -> InstanceType.asInstanceOf[js.Any],
        "AutoScalingPolicy" -> AutoScalingPolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BidPrice" -> BidPrice.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Configurations" -> Configurations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EbsConfiguration" -> EbsConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Market" -> Market.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceGroupConfig]
    }
  }

  /**
    * Detailed information about an instance group.
    */
  @js.native
  trait InstanceGroupDetail extends js.Object {
    var CreationDateTime: Date
    var InstanceRequestCount: Int
    var InstanceRole: InstanceRoleType
    var InstanceRunningCount: Int
    var InstanceType: InstanceType
    var Market: MarketType
    var State: InstanceGroupState
    var BidPrice: js.UndefOr[XmlStringMaxLen256]
    var EndDateTime: js.UndefOr[Date]
    var InstanceGroupId: js.UndefOr[XmlStringMaxLen256]
    var LastStateChangeReason: js.UndefOr[XmlString]
    var Name: js.UndefOr[XmlStringMaxLen256]
    var ReadyDateTime: js.UndefOr[Date]
    var StartDateTime: js.UndefOr[Date]
  }

  object InstanceGroupDetail {
    def apply(CreationDateTime: Date,
              InstanceRequestCount: Int,
              InstanceRole: InstanceRoleType,
              InstanceRunningCount: Int,
              InstanceType: InstanceType,
              Market: MarketType,
              State: InstanceGroupState,
              BidPrice: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              EndDateTime: js.UndefOr[Date] = js.undefined,
              InstanceGroupId: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              LastStateChangeReason: js.UndefOr[XmlString] = js.undefined,
              Name: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              ReadyDateTime: js.UndefOr[Date] = js.undefined,
              StartDateTime: js.UndefOr[Date] = js.undefined): InstanceGroupDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDateTime"     -> CreationDateTime.asInstanceOf[js.Any],
        "InstanceRequestCount" -> InstanceRequestCount.asInstanceOf[js.Any],
        "InstanceRole"         -> InstanceRole.asInstanceOf[js.Any],
        "InstanceRunningCount" -> InstanceRunningCount.asInstanceOf[js.Any],
        "InstanceType"         -> InstanceType.asInstanceOf[js.Any],
        "Market"               -> Market.asInstanceOf[js.Any],
        "State"                -> State.asInstanceOf[js.Any],
        "BidPrice" -> BidPrice.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndDateTime" -> EndDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceGroupId" -> InstanceGroupId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastStateChangeReason" -> LastStateChangeReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReadyDateTime" -> ReadyDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartDateTime" -> StartDateTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceGroupDetail]
    }
  }

  /**
    * Modify an instance group size.
    */
  @js.native
  trait InstanceGroupModifyConfig extends js.Object {
    var InstanceGroupId: XmlStringMaxLen256
    var EC2InstanceIdsToTerminate: js.UndefOr[EC2InstanceIdsToTerminateList]
    var InstanceCount: js.UndefOr[Int]
    var ShrinkPolicy: js.UndefOr[ShrinkPolicy]
  }

  object InstanceGroupModifyConfig {
    def apply(InstanceGroupId: XmlStringMaxLen256,
              EC2InstanceIdsToTerminate: js.UndefOr[EC2InstanceIdsToTerminateList] = js.undefined,
              InstanceCount: js.UndefOr[Int] = js.undefined,
              ShrinkPolicy: js.UndefOr[ShrinkPolicy] = js.undefined): InstanceGroupModifyConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceGroupId" -> InstanceGroupId.asInstanceOf[js.Any],
        "EC2InstanceIdsToTerminate" -> EC2InstanceIdsToTerminate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceCount" -> InstanceCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ShrinkPolicy" -> ShrinkPolicy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceGroupModifyConfig]
    }
  }

  object InstanceGroupStateEnum {
    val PROVISIONING  = "PROVISIONING"
    val BOOTSTRAPPING = "BOOTSTRAPPING"
    val RUNNING       = "RUNNING"
    val RESIZING      = "RESIZING"
    val SUSPENDED     = "SUSPENDED"
    val TERMINATING   = "TERMINATING"
    val TERMINATED    = "TERMINATED"
    val ARRESTED      = "ARRESTED"
    val SHUTTING_DOWN = "SHUTTING_DOWN"
    val ENDED         = "ENDED"

    val values = IndexedSeq(
      PROVISIONING,
      BOOTSTRAPPING,
      RUNNING,
      RESIZING,
      SUSPENDED,
      TERMINATING,
      TERMINATED,
      ARRESTED,
      SHUTTING_DOWN,
      ENDED
    )
  }

  /**
    * The status change reason details for the instance group.
    */
  @js.native
  trait InstanceGroupStateChangeReason extends js.Object {
    var Code: js.UndefOr[InstanceGroupStateChangeReasonCode]
    var Message: js.UndefOr[String]
  }

  object InstanceGroupStateChangeReason {
    def apply(Code: js.UndefOr[InstanceGroupStateChangeReasonCode] = js.undefined,
              Message: js.UndefOr[String] = js.undefined): InstanceGroupStateChangeReason = {
      val _fields = IndexedSeq[(String, js.Any)]("Code" -> Code.map { x =>
        x.asInstanceOf[js.Any]
      }, "Message" -> Message.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceGroupStateChangeReason]
    }
  }

  object InstanceGroupStateChangeReasonCodeEnum {
    val INTERNAL_ERROR     = "INTERNAL_ERROR"
    val VALIDATION_ERROR   = "VALIDATION_ERROR"
    val INSTANCE_FAILURE   = "INSTANCE_FAILURE"
    val CLUSTER_TERMINATED = "CLUSTER_TERMINATED"

    val values = IndexedSeq(INTERNAL_ERROR, VALIDATION_ERROR, INSTANCE_FAILURE, CLUSTER_TERMINATED)
  }

  /**
    * The details of the instance group status.
    */
  @js.native
  trait InstanceGroupStatus extends js.Object {
    var State: js.UndefOr[InstanceGroupState]
    var StateChangeReason: js.UndefOr[InstanceGroupStateChangeReason]
    var Timeline: js.UndefOr[InstanceGroupTimeline]
  }

  object InstanceGroupStatus {
    def apply(State: js.UndefOr[InstanceGroupState] = js.undefined,
              StateChangeReason: js.UndefOr[InstanceGroupStateChangeReason] = js.undefined,
              Timeline: js.UndefOr[InstanceGroupTimeline] = js.undefined): InstanceGroupStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StateChangeReason" -> StateChangeReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timeline" -> Timeline.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceGroupStatus]
    }
  }

  /**
    * The timeline of the instance group lifecycle.
    */
  @js.native
  trait InstanceGroupTimeline extends js.Object {
    var CreationDateTime: js.UndefOr[Date]
    var EndDateTime: js.UndefOr[Date]
    var ReadyDateTime: js.UndefOr[Date]
  }

  object InstanceGroupTimeline {
    def apply(CreationDateTime: js.UndefOr[Date] = js.undefined,
              EndDateTime: js.UndefOr[Date] = js.undefined,
              ReadyDateTime: js.UndefOr[Date] = js.undefined): InstanceGroupTimeline = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDateTime" -> CreationDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndDateTime" -> EndDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReadyDateTime" -> ReadyDateTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceGroupTimeline]
    }
  }

  object InstanceGroupTypeEnum {
    val MASTER = "MASTER"
    val CORE   = "CORE"
    val TASK   = "TASK"

    val values = IndexedSeq(MASTER, CORE, TASK)
  }

  /**
    * Custom policy for requesting termination protection or termination of specific instances when shrinking an instance group.
    */
  @js.native
  trait InstanceResizePolicy extends js.Object {
    var InstanceTerminationTimeout: js.UndefOr[Int]
    var InstancesToProtect: js.UndefOr[EC2InstanceIdsList]
    var InstancesToTerminate: js.UndefOr[EC2InstanceIdsList]
  }

  object InstanceResizePolicy {
    def apply(InstanceTerminationTimeout: js.UndefOr[Int] = js.undefined,
              InstancesToProtect: js.UndefOr[EC2InstanceIdsList] = js.undefined,
              InstancesToTerminate: js.UndefOr[EC2InstanceIdsList] = js.undefined): InstanceResizePolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceTerminationTimeout" -> InstanceTerminationTimeout.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstancesToProtect" -> InstancesToProtect.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstancesToTerminate" -> InstancesToTerminate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceResizePolicy]
    }
  }

  object InstanceRoleTypeEnum {
    val MASTER = "MASTER"
    val CORE   = "CORE"
    val TASK   = "TASK"

    val values = IndexedSeq(MASTER, CORE, TASK)
  }

  object InstanceStateEnum {
    val AWAITING_FULFILLMENT = "AWAITING_FULFILLMENT"
    val PROVISIONING         = "PROVISIONING"
    val BOOTSTRAPPING        = "BOOTSTRAPPING"
    val RUNNING              = "RUNNING"
    val TERMINATED           = "TERMINATED"

    val values = IndexedSeq(AWAITING_FULFILLMENT, PROVISIONING, BOOTSTRAPPING, RUNNING, TERMINATED)
  }

  /**
    * The details of the status change reason for the instance.
    */
  @js.native
  trait InstanceStateChangeReason extends js.Object {
    var Code: js.UndefOr[InstanceStateChangeReasonCode]
    var Message: js.UndefOr[String]
  }

  object InstanceStateChangeReason {
    def apply(Code: js.UndefOr[InstanceStateChangeReasonCode] = js.undefined,
              Message: js.UndefOr[String] = js.undefined): InstanceStateChangeReason = {
      val _fields = IndexedSeq[(String, js.Any)]("Code" -> Code.map { x =>
        x.asInstanceOf[js.Any]
      }, "Message" -> Message.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceStateChangeReason]
    }
  }

  object InstanceStateChangeReasonCodeEnum {
    val INTERNAL_ERROR     = "INTERNAL_ERROR"
    val VALIDATION_ERROR   = "VALIDATION_ERROR"
    val INSTANCE_FAILURE   = "INSTANCE_FAILURE"
    val BOOTSTRAP_FAILURE  = "BOOTSTRAP_FAILURE"
    val CLUSTER_TERMINATED = "CLUSTER_TERMINATED"

    val values = IndexedSeq(INTERNAL_ERROR, VALIDATION_ERROR, INSTANCE_FAILURE, BOOTSTRAP_FAILURE, CLUSTER_TERMINATED)
  }

  /**
    * The instance status details.
    */
  @js.native
  trait InstanceStatus extends js.Object {
    var State: js.UndefOr[InstanceState]
    var StateChangeReason: js.UndefOr[InstanceStateChangeReason]
    var Timeline: js.UndefOr[InstanceTimeline]
  }

  object InstanceStatus {
    def apply(State: js.UndefOr[InstanceState] = js.undefined,
              StateChangeReason: js.UndefOr[InstanceStateChangeReason] = js.undefined,
              Timeline: js.UndefOr[InstanceTimeline] = js.undefined): InstanceStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StateChangeReason" -> StateChangeReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timeline" -> Timeline.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceStatus]
    }
  }

  /**
    * The timeline of the instance lifecycle.
    */
  @js.native
  trait InstanceTimeline extends js.Object {
    var CreationDateTime: js.UndefOr[Date]
    var EndDateTime: js.UndefOr[Date]
    var ReadyDateTime: js.UndefOr[Date]
  }

  object InstanceTimeline {
    def apply(CreationDateTime: js.UndefOr[Date] = js.undefined,
              EndDateTime: js.UndefOr[Date] = js.undefined,
              ReadyDateTime: js.UndefOr[Date] = js.undefined): InstanceTimeline = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDateTime" -> CreationDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndDateTime" -> EndDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReadyDateTime" -> ReadyDateTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceTimeline]
    }
  }

  /**
    * An instance type configuration for each instance type in an instance fleet, which determines the EC2 instances Amazon EMR attempts to provision to fulfill On-Demand and Spot target capacities. There can be a maximum of 5 instance type configurations in a fleet.
    *
    * '''Note:'''The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.
    */
  @js.native
  trait InstanceTypeConfig extends js.Object {
    var InstanceType: InstanceType
    var BidPrice: js.UndefOr[XmlStringMaxLen256]
    var BidPriceAsPercentageOfOnDemandPrice: js.UndefOr[NonNegativeDouble]
    var Configurations: js.UndefOr[ConfigurationList]
    var EbsConfiguration: js.UndefOr[EbsConfiguration]
    var WeightedCapacity: js.UndefOr[WholeNumber]
  }

  object InstanceTypeConfig {
    def apply(InstanceType: InstanceType,
              BidPrice: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              BidPriceAsPercentageOfOnDemandPrice: js.UndefOr[NonNegativeDouble] = js.undefined,
              Configurations: js.UndefOr[ConfigurationList] = js.undefined,
              EbsConfiguration: js.UndefOr[EbsConfiguration] = js.undefined,
              WeightedCapacity: js.UndefOr[WholeNumber] = js.undefined): InstanceTypeConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceType" -> InstanceType.asInstanceOf[js.Any],
        "BidPrice" -> BidPrice.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BidPriceAsPercentageOfOnDemandPrice" -> BidPriceAsPercentageOfOnDemandPrice.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Configurations" -> Configurations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EbsConfiguration" -> EbsConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WeightedCapacity" -> WeightedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceTypeConfig]
    }
  }

  /**
    * The configuration specification for each instance type in an instance fleet.
    *
    * '''Note:'''The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.
    */
  @js.native
  trait InstanceTypeSpecification extends js.Object {
    var BidPrice: js.UndefOr[XmlStringMaxLen256]
    var BidPriceAsPercentageOfOnDemandPrice: js.UndefOr[NonNegativeDouble]
    var Configurations: js.UndefOr[ConfigurationList]
    var EbsBlockDevices: js.UndefOr[EbsBlockDeviceList]
    var EbsOptimized: js.UndefOr[BooleanObject]
    var InstanceType: js.UndefOr[InstanceType]
    var WeightedCapacity: js.UndefOr[WholeNumber]
  }

  object InstanceTypeSpecification {
    def apply(BidPrice: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              BidPriceAsPercentageOfOnDemandPrice: js.UndefOr[NonNegativeDouble] = js.undefined,
              Configurations: js.UndefOr[ConfigurationList] = js.undefined,
              EbsBlockDevices: js.UndefOr[EbsBlockDeviceList] = js.undefined,
              EbsOptimized: js.UndefOr[BooleanObject] = js.undefined,
              InstanceType: js.UndefOr[InstanceType] = js.undefined,
              WeightedCapacity: js.UndefOr[WholeNumber] = js.undefined): InstanceTypeSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BidPrice" -> BidPrice.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BidPriceAsPercentageOfOnDemandPrice" -> BidPriceAsPercentageOfOnDemandPrice.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Configurations" -> Configurations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EbsBlockDevices" -> EbsBlockDevices.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EbsOptimized" -> EbsOptimized.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceType" -> InstanceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WeightedCapacity" -> WeightedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceTypeSpecification]
    }
  }

  /**
    * Indicates that an error occurred while processing the request and that the request was not completed.
    */
  @js.native
  trait InternalServerErrorException extends js.Object {}

  /**
    * This exception occurs when there is an internal failure in the EMR service.
    */
  @js.native
  trait InternalServerExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
    * This exception occurs when there is something wrong with user input.
    */
  @js.native
  trait InvalidRequestExceptionException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
    * A description of a cluster (job flow).
    */
  @js.native
  trait JobFlowDetail extends js.Object {
    var ExecutionStatusDetail: JobFlowExecutionStatusDetail
    var Instances: JobFlowInstancesDetail
    var JobFlowId: XmlStringMaxLen256
    var Name: XmlStringMaxLen256
    var AmiVersion: js.UndefOr[XmlStringMaxLen256]
    var AutoScalingRole: js.UndefOr[XmlString]
    var BootstrapActions: js.UndefOr[BootstrapActionDetailList]
    var JobFlowRole: js.UndefOr[XmlString]
    var LogUri: js.UndefOr[XmlString]
    var ScaleDownBehavior: js.UndefOr[ScaleDownBehavior]
    var ServiceRole: js.UndefOr[XmlString]
    var Steps: js.UndefOr[StepDetailList]
    var SupportedProducts: js.UndefOr[SupportedProductsList]
    var VisibleToAllUsers: js.UndefOr[Boolean]
  }

  object JobFlowDetail {
    def apply(ExecutionStatusDetail: JobFlowExecutionStatusDetail,
              Instances: JobFlowInstancesDetail,
              JobFlowId: XmlStringMaxLen256,
              Name: XmlStringMaxLen256,
              AmiVersion: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              AutoScalingRole: js.UndefOr[XmlString] = js.undefined,
              BootstrapActions: js.UndefOr[BootstrapActionDetailList] = js.undefined,
              JobFlowRole: js.UndefOr[XmlString] = js.undefined,
              LogUri: js.UndefOr[XmlString] = js.undefined,
              ScaleDownBehavior: js.UndefOr[ScaleDownBehavior] = js.undefined,
              ServiceRole: js.UndefOr[XmlString] = js.undefined,
              Steps: js.UndefOr[StepDetailList] = js.undefined,
              SupportedProducts: js.UndefOr[SupportedProductsList] = js.undefined,
              VisibleToAllUsers: js.UndefOr[Boolean] = js.undefined): JobFlowDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExecutionStatusDetail" -> ExecutionStatusDetail.asInstanceOf[js.Any],
        "Instances"             -> Instances.asInstanceOf[js.Any],
        "JobFlowId"             -> JobFlowId.asInstanceOf[js.Any],
        "Name"                  -> Name.asInstanceOf[js.Any],
        "AmiVersion" -> AmiVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoScalingRole" -> AutoScalingRole.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BootstrapActions" -> BootstrapActions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobFlowRole" -> JobFlowRole.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogUri" -> LogUri.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScaleDownBehavior" -> ScaleDownBehavior.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServiceRole" -> ServiceRole.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Steps" -> Steps.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportedProducts" -> SupportedProducts.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VisibleToAllUsers" -> VisibleToAllUsers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobFlowDetail]
    }
  }

  /**
    * The type of instance.
    */
  object JobFlowExecutionStateEnum {
    val STARTING      = "STARTING"
    val BOOTSTRAPPING = "BOOTSTRAPPING"
    val RUNNING       = "RUNNING"
    val WAITING       = "WAITING"
    val SHUTTING_DOWN = "SHUTTING_DOWN"
    val TERMINATED    = "TERMINATED"
    val COMPLETED     = "COMPLETED"
    val FAILED        = "FAILED"

    val values = IndexedSeq(STARTING, BOOTSTRAPPING, RUNNING, WAITING, SHUTTING_DOWN, TERMINATED, COMPLETED, FAILED)
  }

  /**
    * Describes the status of the cluster (job flow).
    */
  @js.native
  trait JobFlowExecutionStatusDetail extends js.Object {
    var CreationDateTime: Date
    var State: JobFlowExecutionState
    var EndDateTime: js.UndefOr[Date]
    var LastStateChangeReason: js.UndefOr[XmlString]
    var ReadyDateTime: js.UndefOr[Date]
    var StartDateTime: js.UndefOr[Date]
  }

  object JobFlowExecutionStatusDetail {
    def apply(CreationDateTime: Date,
              State: JobFlowExecutionState,
              EndDateTime: js.UndefOr[Date] = js.undefined,
              LastStateChangeReason: js.UndefOr[XmlString] = js.undefined,
              ReadyDateTime: js.UndefOr[Date] = js.undefined,
              StartDateTime: js.UndefOr[Date] = js.undefined): JobFlowExecutionStatusDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDateTime" -> CreationDateTime.asInstanceOf[js.Any],
        "State"            -> State.asInstanceOf[js.Any],
        "EndDateTime" -> EndDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastStateChangeReason" -> LastStateChangeReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReadyDateTime" -> ReadyDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartDateTime" -> StartDateTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobFlowExecutionStatusDetail]
    }
  }

  /**
    * A description of the Amazon EC2 instance on which the cluster (job flow) runs. A valid JobFlowInstancesConfig must contain either InstanceGroups or InstanceFleets, which is the recommended configuration. They cannot be used together. You may also have MasterInstanceType, SlaveInstanceType, and InstanceCount (all three must be present), but we don't recommend this configuration.
    */
  @js.native
  trait JobFlowInstancesConfig extends js.Object {
    var AdditionalMasterSecurityGroups: js.UndefOr[SecurityGroupsList]
    var AdditionalSlaveSecurityGroups: js.UndefOr[SecurityGroupsList]
    var Ec2KeyName: js.UndefOr[XmlStringMaxLen256]
    var Ec2SubnetId: js.UndefOr[XmlStringMaxLen256]
    var Ec2SubnetIds: js.UndefOr[XmlStringMaxLen256List]
    var EmrManagedMasterSecurityGroup: js.UndefOr[XmlStringMaxLen256]
    var EmrManagedSlaveSecurityGroup: js.UndefOr[XmlStringMaxLen256]
    var HadoopVersion: js.UndefOr[XmlStringMaxLen256]
    var InstanceCount: js.UndefOr[Int]
    var InstanceFleets: js.UndefOr[InstanceFleetConfigList]
    var InstanceGroups: js.UndefOr[InstanceGroupConfigList]
    var KeepJobFlowAliveWhenNoSteps: js.UndefOr[Boolean]
    var MasterInstanceType: js.UndefOr[InstanceType]
    var Placement: js.UndefOr[PlacementType]
    var ServiceAccessSecurityGroup: js.UndefOr[XmlStringMaxLen256]
    var SlaveInstanceType: js.UndefOr[InstanceType]
    var TerminationProtected: js.UndefOr[Boolean]
  }

  object JobFlowInstancesConfig {
    def apply(AdditionalMasterSecurityGroups: js.UndefOr[SecurityGroupsList] = js.undefined,
              AdditionalSlaveSecurityGroups: js.UndefOr[SecurityGroupsList] = js.undefined,
              Ec2KeyName: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              Ec2SubnetId: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              Ec2SubnetIds: js.UndefOr[XmlStringMaxLen256List] = js.undefined,
              EmrManagedMasterSecurityGroup: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              EmrManagedSlaveSecurityGroup: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              HadoopVersion: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              InstanceCount: js.UndefOr[Int] = js.undefined,
              InstanceFleets: js.UndefOr[InstanceFleetConfigList] = js.undefined,
              InstanceGroups: js.UndefOr[InstanceGroupConfigList] = js.undefined,
              KeepJobFlowAliveWhenNoSteps: js.UndefOr[Boolean] = js.undefined,
              MasterInstanceType: js.UndefOr[InstanceType] = js.undefined,
              Placement: js.UndefOr[PlacementType] = js.undefined,
              ServiceAccessSecurityGroup: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              SlaveInstanceType: js.UndefOr[InstanceType] = js.undefined,
              TerminationProtected: js.UndefOr[Boolean] = js.undefined): JobFlowInstancesConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdditionalMasterSecurityGroups" -> AdditionalMasterSecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AdditionalSlaveSecurityGroups" -> AdditionalSlaveSecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Ec2KeyName" -> Ec2KeyName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Ec2SubnetId" -> Ec2SubnetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Ec2SubnetIds" -> Ec2SubnetIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmrManagedMasterSecurityGroup" -> EmrManagedMasterSecurityGroup.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmrManagedSlaveSecurityGroup" -> EmrManagedSlaveSecurityGroup.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HadoopVersion" -> HadoopVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceCount" -> InstanceCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceFleets" -> InstanceFleets.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceGroups" -> InstanceGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KeepJobFlowAliveWhenNoSteps" -> KeepJobFlowAliveWhenNoSteps.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterInstanceType" -> MasterInstanceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Placement" -> Placement.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServiceAccessSecurityGroup" -> ServiceAccessSecurityGroup.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SlaveInstanceType" -> SlaveInstanceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TerminationProtected" -> TerminationProtected.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobFlowInstancesConfig]
    }
  }

  /**
    * Specify the type of Amazon EC2 instances that the cluster (job flow) runs on.
    */
  @js.native
  trait JobFlowInstancesDetail extends js.Object {
    var InstanceCount: Int
    var MasterInstanceType: InstanceType
    var SlaveInstanceType: InstanceType
    var Ec2KeyName: js.UndefOr[XmlStringMaxLen256]
    var Ec2SubnetId: js.UndefOr[XmlStringMaxLen256]
    var HadoopVersion: js.UndefOr[XmlStringMaxLen256]
    var InstanceGroups: js.UndefOr[InstanceGroupDetailList]
    var KeepJobFlowAliveWhenNoSteps: js.UndefOr[Boolean]
    var MasterInstanceId: js.UndefOr[XmlString]
    var MasterPublicDnsName: js.UndefOr[XmlString]
    var NormalizedInstanceHours: js.UndefOr[Int]
    var Placement: js.UndefOr[PlacementType]
    var TerminationProtected: js.UndefOr[Boolean]
  }

  object JobFlowInstancesDetail {
    def apply(InstanceCount: Int,
              MasterInstanceType: InstanceType,
              SlaveInstanceType: InstanceType,
              Ec2KeyName: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              Ec2SubnetId: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              HadoopVersion: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              InstanceGroups: js.UndefOr[InstanceGroupDetailList] = js.undefined,
              KeepJobFlowAliveWhenNoSteps: js.UndefOr[Boolean] = js.undefined,
              MasterInstanceId: js.UndefOr[XmlString] = js.undefined,
              MasterPublicDnsName: js.UndefOr[XmlString] = js.undefined,
              NormalizedInstanceHours: js.UndefOr[Int] = js.undefined,
              Placement: js.UndefOr[PlacementType] = js.undefined,
              TerminationProtected: js.UndefOr[Boolean] = js.undefined): JobFlowInstancesDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceCount"      -> InstanceCount.asInstanceOf[js.Any],
        "MasterInstanceType" -> MasterInstanceType.asInstanceOf[js.Any],
        "SlaveInstanceType"  -> SlaveInstanceType.asInstanceOf[js.Any],
        "Ec2KeyName" -> Ec2KeyName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Ec2SubnetId" -> Ec2SubnetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HadoopVersion" -> HadoopVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceGroups" -> InstanceGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KeepJobFlowAliveWhenNoSteps" -> KeepJobFlowAliveWhenNoSteps.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterInstanceId" -> MasterInstanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterPublicDnsName" -> MasterPublicDnsName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NormalizedInstanceHours" -> NormalizedInstanceHours.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Placement" -> Placement.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TerminationProtected" -> TerminationProtected.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobFlowInstancesDetail]
    }
  }

  /**
    * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security configuration. For more information see [[http://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html|Use Kerberos Authentication]] in the <i>EMR Management Guide</i>.
    */
  @js.native
  trait KerberosAttributes extends js.Object {
    var KdcAdminPassword: XmlStringMaxLen256
    var Realm: XmlStringMaxLen256
    var ADDomainJoinPassword: js.UndefOr[XmlStringMaxLen256]
    var ADDomainJoinUser: js.UndefOr[XmlStringMaxLen256]
    var CrossRealmTrustPrincipalPassword: js.UndefOr[XmlStringMaxLen256]
  }

  object KerberosAttributes {
    def apply(KdcAdminPassword: XmlStringMaxLen256,
              Realm: XmlStringMaxLen256,
              ADDomainJoinPassword: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              ADDomainJoinUser: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              CrossRealmTrustPrincipalPassword: js.UndefOr[XmlStringMaxLen256] = js.undefined): KerberosAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KdcAdminPassword" -> KdcAdminPassword.asInstanceOf[js.Any],
        "Realm"            -> Realm.asInstanceOf[js.Any],
        "ADDomainJoinPassword" -> ADDomainJoinPassword.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ADDomainJoinUser" -> ADDomainJoinUser.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CrossRealmTrustPrincipalPassword" -> CrossRealmTrustPrincipalPassword.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KerberosAttributes]
    }
  }

  /**
    * A key value pair.
    */
  @js.native
  trait KeyValue extends js.Object {
    var Key: js.UndefOr[XmlString]
    var Value: js.UndefOr[XmlString]
  }

  object KeyValue {
    def apply(Key: js.UndefOr[XmlString] = js.undefined, Value: js.UndefOr[XmlString] = js.undefined): KeyValue = {
      val _fields = IndexedSeq[(String, js.Any)]("Key" -> Key.map { x =>
        x.asInstanceOf[js.Any]
      }, "Value" -> Value.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyValue]
    }
  }

  /**
    * This input determines which bootstrap actions to retrieve.
    */
  @js.native
  trait ListBootstrapActionsInput extends js.Object {
    var ClusterId: ClusterId
    var Marker: js.UndefOr[Marker]
  }

  object ListBootstrapActionsInput {
    def apply(ClusterId: ClusterId, Marker: js.UndefOr[Marker] = js.undefined): ListBootstrapActionsInput = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterId" -> ClusterId.asInstanceOf[js.Any], "Marker" -> Marker.map {
        x =>
          x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBootstrapActionsInput]
    }
  }

  /**
    * This output contains the bootstrap actions detail.
    */
  @js.native
  trait ListBootstrapActionsOutput extends js.Object {
    var BootstrapActions: js.UndefOr[CommandList]
    var Marker: js.UndefOr[Marker]
  }

  object ListBootstrapActionsOutput {
    def apply(BootstrapActions: js.UndefOr[CommandList] = js.undefined,
              Marker: js.UndefOr[Marker] = js.undefined): ListBootstrapActionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("BootstrapActions" -> BootstrapActions.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBootstrapActionsOutput]
    }
  }

  /**
    * This input determines how the ListClusters action filters the list of clusters that it returns.
    */
  @js.native
  trait ListClustersInput extends js.Object {
    var ClusterStates: js.UndefOr[ClusterStateList]
    var CreatedAfter: js.UndefOr[Date]
    var CreatedBefore: js.UndefOr[Date]
    var Marker: js.UndefOr[Marker]
  }

  object ListClustersInput {
    def apply(ClusterStates: js.UndefOr[ClusterStateList] = js.undefined,
              CreatedAfter: js.UndefOr[Date] = js.undefined,
              CreatedBefore: js.UndefOr[Date] = js.undefined,
              Marker: js.UndefOr[Marker] = js.undefined): ListClustersInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterStates" -> ClusterStates.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedAfter" -> CreatedAfter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedBefore" -> CreatedBefore.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListClustersInput]
    }
  }

  /**
    * This contains a ClusterSummaryList with the cluster details; for example, the cluster IDs, names, and status.
    */
  @js.native
  trait ListClustersOutput extends js.Object {
    var Clusters: js.UndefOr[ClusterSummaryList]
    var Marker: js.UndefOr[Marker]
  }

  object ListClustersOutput {
    def apply(Clusters: js.UndefOr[ClusterSummaryList] = js.undefined,
              Marker: js.UndefOr[Marker] = js.undefined): ListClustersOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("Clusters" -> Clusters.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListClustersOutput]
    }
  }

  @js.native
  trait ListInstanceFleetsInput extends js.Object {
    var ClusterId: ClusterId
    var Marker: js.UndefOr[Marker]
  }

  object ListInstanceFleetsInput {
    def apply(ClusterId: ClusterId, Marker: js.UndefOr[Marker] = js.undefined): ListInstanceFleetsInput = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterId" -> ClusterId.asInstanceOf[js.Any], "Marker" -> Marker.map {
        x =>
          x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInstanceFleetsInput]
    }
  }

  @js.native
  trait ListInstanceFleetsOutput extends js.Object {
    var InstanceFleets: js.UndefOr[InstanceFleetList]
    var Marker: js.UndefOr[Marker]
  }

  object ListInstanceFleetsOutput {
    def apply(InstanceFleets: js.UndefOr[InstanceFleetList] = js.undefined,
              Marker: js.UndefOr[Marker] = js.undefined): ListInstanceFleetsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("InstanceFleets" -> InstanceFleets.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInstanceFleetsOutput]
    }
  }

  /**
    * This input determines which instance groups to retrieve.
    */
  @js.native
  trait ListInstanceGroupsInput extends js.Object {
    var ClusterId: ClusterId
    var Marker: js.UndefOr[Marker]
  }

  object ListInstanceGroupsInput {
    def apply(ClusterId: ClusterId, Marker: js.UndefOr[Marker] = js.undefined): ListInstanceGroupsInput = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterId" -> ClusterId.asInstanceOf[js.Any], "Marker" -> Marker.map {
        x =>
          x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInstanceGroupsInput]
    }
  }

  /**
    * This input determines which instance groups to retrieve.
    */
  @js.native
  trait ListInstanceGroupsOutput extends js.Object {
    var InstanceGroups: js.UndefOr[InstanceGroupList]
    var Marker: js.UndefOr[Marker]
  }

  object ListInstanceGroupsOutput {
    def apply(InstanceGroups: js.UndefOr[InstanceGroupList] = js.undefined,
              Marker: js.UndefOr[Marker] = js.undefined): ListInstanceGroupsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("InstanceGroups" -> InstanceGroups.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInstanceGroupsOutput]
    }
  }

  /**
    * This input determines which instances to list.
    */
  @js.native
  trait ListInstancesInput extends js.Object {
    var ClusterId: ClusterId
    var InstanceFleetId: js.UndefOr[InstanceFleetId]
    var InstanceFleetType: js.UndefOr[InstanceFleetType]
    var InstanceGroupId: js.UndefOr[InstanceGroupId]
    var InstanceGroupTypes: js.UndefOr[InstanceGroupTypeList]
    var InstanceStates: js.UndefOr[InstanceStateList]
    var Marker: js.UndefOr[Marker]
  }

  object ListInstancesInput {
    def apply(ClusterId: ClusterId,
              InstanceFleetId: js.UndefOr[InstanceFleetId] = js.undefined,
              InstanceFleetType: js.UndefOr[InstanceFleetType] = js.undefined,
              InstanceGroupId: js.UndefOr[InstanceGroupId] = js.undefined,
              InstanceGroupTypes: js.UndefOr[InstanceGroupTypeList] = js.undefined,
              InstanceStates: js.UndefOr[InstanceStateList] = js.undefined,
              Marker: js.UndefOr[Marker] = js.undefined): ListInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterId" -> ClusterId.asInstanceOf[js.Any],
        "InstanceFleetId" -> InstanceFleetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceFleetType" -> InstanceFleetType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceGroupId" -> InstanceGroupId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceGroupTypes" -> InstanceGroupTypes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceStates" -> InstanceStates.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInstancesInput]
    }
  }

  /**
    * This output contains the list of instances.
    */
  @js.native
  trait ListInstancesOutput extends js.Object {
    var Instances: js.UndefOr[InstanceList]
    var Marker: js.UndefOr[Marker]
  }

  object ListInstancesOutput {
    def apply(Instances: js.UndefOr[InstanceList] = js.undefined,
              Marker: js.UndefOr[Marker] = js.undefined): ListInstancesOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("Instances" -> Instances.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInstancesOutput]
    }
  }

  @js.native
  trait ListSecurityConfigurationsInput extends js.Object {
    var Marker: js.UndefOr[Marker]
  }

  object ListSecurityConfigurationsInput {
    def apply(Marker: js.UndefOr[Marker] = js.undefined): ListSecurityConfigurationsInput = {
      val _fields = IndexedSeq[(String, js.Any)]("Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSecurityConfigurationsInput]
    }
  }

  @js.native
  trait ListSecurityConfigurationsOutput extends js.Object {
    var Marker: js.UndefOr[Marker]
    var SecurityConfigurations: js.UndefOr[SecurityConfigurationList]
  }

  object ListSecurityConfigurationsOutput {
    def apply(
        Marker: js.UndefOr[Marker] = js.undefined,
        SecurityConfigurations: js.UndefOr[SecurityConfigurationList] = js.undefined
    ): ListSecurityConfigurationsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }, "SecurityConfigurations" -> SecurityConfigurations.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSecurityConfigurationsOutput]
    }
  }

  /**
    * This input determines which steps to list.
    */
  @js.native
  trait ListStepsInput extends js.Object {
    var ClusterId: ClusterId
    var Marker: js.UndefOr[Marker]
    var StepIds: js.UndefOr[XmlStringList]
    var StepStates: js.UndefOr[StepStateList]
  }

  object ListStepsInput {
    def apply(ClusterId: ClusterId,
              Marker: js.UndefOr[Marker] = js.undefined,
              StepIds: js.UndefOr[XmlStringList] = js.undefined,
              StepStates: js.UndefOr[StepStateList] = js.undefined): ListStepsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterId" -> ClusterId.asInstanceOf[js.Any],
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StepIds" -> StepIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StepStates" -> StepStates.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStepsInput]
    }
  }

  /**
    * This output contains the list of steps returned in reverse order. This means that the last step is the first element in the list.
    */
  @js.native
  trait ListStepsOutput extends js.Object {
    var Marker: js.UndefOr[Marker]
    var Steps: js.UndefOr[StepSummaryList]
  }

  object ListStepsOutput {
    def apply(Marker: js.UndefOr[Marker] = js.undefined,
              Steps: js.UndefOr[StepSummaryList] = js.undefined): ListStepsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }, "Steps" -> Steps.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStepsOutput]
    }
  }

  object MarketTypeEnum {
    val ON_DEMAND = "ON_DEMAND"
    val SPOT      = "SPOT"

    val values = IndexedSeq(ON_DEMAND, SPOT)
  }

  /**
    * A CloudWatch dimension, which is specified using a <code>Key</code> (known as a <code>Name</code> in CloudWatch), <code>Value</code> pair. By default, Amazon EMR uses one dimension whose <code>Key</code> is <code>JobFlowID</code> and <code>Value</code> is a variable representing the cluster ID, which is <code>{emr.clusterId}</code>. This enables the rule to bootstrap when the cluster ID becomes available.
    */
  @js.native
  trait MetricDimension extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object MetricDimension {
    def apply(Key: js.UndefOr[String] = js.undefined, Value: js.UndefOr[String] = js.undefined): MetricDimension = {
      val _fields = IndexedSeq[(String, js.Any)]("Key" -> Key.map { x =>
        x.asInstanceOf[js.Any]
      }, "Value" -> Value.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricDimension]
    }
  }

  @js.native
  trait ModifyInstanceFleetInput extends js.Object {
    var ClusterId: ClusterId
    var InstanceFleet: InstanceFleetModifyConfig
  }

  object ModifyInstanceFleetInput {
    def apply(ClusterId: ClusterId, InstanceFleet: InstanceFleetModifyConfig): ModifyInstanceFleetInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterId"     -> ClusterId.asInstanceOf[js.Any],
        "InstanceFleet" -> InstanceFleet.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyInstanceFleetInput]
    }
  }

  /**
    * Change the size of some instance groups.
    */
  @js.native
  trait ModifyInstanceGroupsInput extends js.Object {
    var ClusterId: js.UndefOr[ClusterId]
    var InstanceGroups: js.UndefOr[InstanceGroupModifyConfigList]
  }

  object ModifyInstanceGroupsInput {
    def apply(ClusterId: js.UndefOr[ClusterId] = js.undefined,
              InstanceGroups: js.UndefOr[InstanceGroupModifyConfigList] = js.undefined): ModifyInstanceGroupsInput = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterId" -> ClusterId.map { x =>
        x.asInstanceOf[js.Any]
      }, "InstanceGroups" -> InstanceGroups.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyInstanceGroupsInput]
    }
  }

  /**
    * The Amazon EC2 Availability Zone configuration of the cluster (job flow).
    */
  @js.native
  trait PlacementType extends js.Object {
    var AvailabilityZone: js.UndefOr[XmlString]
    var AvailabilityZones: js.UndefOr[XmlStringMaxLen256List]
  }

  object PlacementType {
    def apply(AvailabilityZone: js.UndefOr[XmlString] = js.undefined,
              AvailabilityZones: js.UndefOr[XmlStringMaxLen256List] = js.undefined): PlacementType = {
      val _fields = IndexedSeq[(String, js.Any)]("AvailabilityZone" -> AvailabilityZone.map { x =>
        x.asInstanceOf[js.Any]
      }, "AvailabilityZones" -> AvailabilityZones.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlacementType]
    }
  }

  @js.native
  trait PutAutoScalingPolicyInput extends js.Object {
    var AutoScalingPolicy: AutoScalingPolicy
    var ClusterId: ClusterId
    var InstanceGroupId: InstanceGroupId
  }

  object PutAutoScalingPolicyInput {
    def apply(AutoScalingPolicy: AutoScalingPolicy,
              ClusterId: ClusterId,
              InstanceGroupId: InstanceGroupId): PutAutoScalingPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingPolicy" -> AutoScalingPolicy.asInstanceOf[js.Any],
        "ClusterId"         -> ClusterId.asInstanceOf[js.Any],
        "InstanceGroupId"   -> InstanceGroupId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAutoScalingPolicyInput]
    }
  }

  @js.native
  trait PutAutoScalingPolicyOutput extends js.Object {
    var AutoScalingPolicy: js.UndefOr[AutoScalingPolicyDescription]
    var ClusterId: js.UndefOr[ClusterId]
    var InstanceGroupId: js.UndefOr[InstanceGroupId]
  }

  object PutAutoScalingPolicyOutput {
    def apply(AutoScalingPolicy: js.UndefOr[AutoScalingPolicyDescription] = js.undefined,
              ClusterId: js.UndefOr[ClusterId] = js.undefined,
              InstanceGroupId: js.UndefOr[InstanceGroupId] = js.undefined): PutAutoScalingPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingPolicy" -> AutoScalingPolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterId" -> ClusterId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceGroupId" -> InstanceGroupId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAutoScalingPolicyOutput]
    }
  }

  @js.native
  trait RemoveAutoScalingPolicyInput extends js.Object {
    var ClusterId: ClusterId
    var InstanceGroupId: InstanceGroupId
  }

  object RemoveAutoScalingPolicyInput {
    def apply(ClusterId: ClusterId, InstanceGroupId: InstanceGroupId): RemoveAutoScalingPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterId"       -> ClusterId.asInstanceOf[js.Any],
        "InstanceGroupId" -> InstanceGroupId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveAutoScalingPolicyInput]
    }
  }

  @js.native
  trait RemoveAutoScalingPolicyOutput extends js.Object {}

  object RemoveAutoScalingPolicyOutput {
    def apply(): RemoveAutoScalingPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveAutoScalingPolicyOutput]
    }
  }

  /**
    * This input identifies a cluster and a list of tags to remove.
    */
  @js.native
  trait RemoveTagsInput extends js.Object {
    var ResourceId: ResourceId
    var TagKeys: StringList
  }

  object RemoveTagsInput {
    def apply(ResourceId: ResourceId, TagKeys: StringList): RemoveTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "TagKeys"    -> TagKeys.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsInput]
    }
  }

  /**
    * This output indicates the result of removing tags from a resource.
    */
  @js.native
  trait RemoveTagsOutput extends js.Object {}

  object RemoveTagsOutput {
    def apply(): RemoveTagsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsOutput]
    }
  }

  object RepoUpgradeOnBootEnum {
    val SECURITY = "SECURITY"
    val NONE     = "NONE"

    val values = IndexedSeq(SECURITY, NONE)
  }

  /**
    * Input to the <a>RunJobFlow</a> operation.
    */
  @js.native
  trait RunJobFlowInput extends js.Object {
    var Instances: JobFlowInstancesConfig
    var Name: XmlStringMaxLen256
    var AdditionalInfo: js.UndefOr[XmlString]
    var AmiVersion: js.UndefOr[XmlStringMaxLen256]
    var Applications: js.UndefOr[ApplicationList]
    var AutoScalingRole: js.UndefOr[XmlString]
    var BootstrapActions: js.UndefOr[BootstrapActionConfigList]
    var Configurations: js.UndefOr[ConfigurationList]
    var CustomAmiId: js.UndefOr[XmlStringMaxLen256]
    var EbsRootVolumeSize: js.UndefOr[Int]
    var JobFlowRole: js.UndefOr[XmlString]
    var KerberosAttributes: js.UndefOr[KerberosAttributes]
    var LogUri: js.UndefOr[XmlString]
    var NewSupportedProducts: js.UndefOr[NewSupportedProductsList]
    var ReleaseLabel: js.UndefOr[XmlStringMaxLen256]
    var RepoUpgradeOnBoot: js.UndefOr[RepoUpgradeOnBoot]
    var ScaleDownBehavior: js.UndefOr[ScaleDownBehavior]
    var SecurityConfiguration: js.UndefOr[XmlString]
    var ServiceRole: js.UndefOr[XmlString]
    var Steps: js.UndefOr[StepConfigList]
    var SupportedProducts: js.UndefOr[SupportedProductsList]
    var Tags: js.UndefOr[TagList]
    var VisibleToAllUsers: js.UndefOr[Boolean]
  }

  object RunJobFlowInput {
    def apply(Instances: JobFlowInstancesConfig,
              Name: XmlStringMaxLen256,
              AdditionalInfo: js.UndefOr[XmlString] = js.undefined,
              AmiVersion: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              Applications: js.UndefOr[ApplicationList] = js.undefined,
              AutoScalingRole: js.UndefOr[XmlString] = js.undefined,
              BootstrapActions: js.UndefOr[BootstrapActionConfigList] = js.undefined,
              Configurations: js.UndefOr[ConfigurationList] = js.undefined,
              CustomAmiId: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              EbsRootVolumeSize: js.UndefOr[Int] = js.undefined,
              JobFlowRole: js.UndefOr[XmlString] = js.undefined,
              KerberosAttributes: js.UndefOr[KerberosAttributes] = js.undefined,
              LogUri: js.UndefOr[XmlString] = js.undefined,
              NewSupportedProducts: js.UndefOr[NewSupportedProductsList] = js.undefined,
              ReleaseLabel: js.UndefOr[XmlStringMaxLen256] = js.undefined,
              RepoUpgradeOnBoot: js.UndefOr[RepoUpgradeOnBoot] = js.undefined,
              ScaleDownBehavior: js.UndefOr[ScaleDownBehavior] = js.undefined,
              SecurityConfiguration: js.UndefOr[XmlString] = js.undefined,
              ServiceRole: js.UndefOr[XmlString] = js.undefined,
              Steps: js.UndefOr[StepConfigList] = js.undefined,
              SupportedProducts: js.UndefOr[SupportedProductsList] = js.undefined,
              Tags: js.UndefOr[TagList] = js.undefined,
              VisibleToAllUsers: js.UndefOr[Boolean] = js.undefined): RunJobFlowInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Instances" -> Instances.asInstanceOf[js.Any],
        "Name"      -> Name.asInstanceOf[js.Any],
        "AdditionalInfo" -> AdditionalInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AmiVersion" -> AmiVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Applications" -> Applications.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoScalingRole" -> AutoScalingRole.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BootstrapActions" -> BootstrapActions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Configurations" -> Configurations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomAmiId" -> CustomAmiId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EbsRootVolumeSize" -> EbsRootVolumeSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobFlowRole" -> JobFlowRole.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KerberosAttributes" -> KerberosAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogUri" -> LogUri.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NewSupportedProducts" -> NewSupportedProducts.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReleaseLabel" -> ReleaseLabel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RepoUpgradeOnBoot" -> RepoUpgradeOnBoot.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScaleDownBehavior" -> ScaleDownBehavior.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityConfiguration" -> SecurityConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServiceRole" -> ServiceRole.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Steps" -> Steps.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportedProducts" -> SupportedProducts.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VisibleToAllUsers" -> VisibleToAllUsers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunJobFlowInput]
    }
  }

  /**
    * The result of the <a>RunJobFlow</a> operation.
    */
  @js.native
  trait RunJobFlowOutput extends js.Object {
    var JobFlowId: js.UndefOr[XmlStringMaxLen256]
  }

  object RunJobFlowOutput {
    def apply(JobFlowId: js.UndefOr[XmlStringMaxLen256] = js.undefined): RunJobFlowOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("JobFlowId" -> JobFlowId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunJobFlowOutput]
    }
  }

  object ScaleDownBehaviorEnum {
    val TERMINATE_AT_INSTANCE_HOUR   = "TERMINATE_AT_INSTANCE_HOUR"
    val TERMINATE_AT_TASK_COMPLETION = "TERMINATE_AT_TASK_COMPLETION"

    val values = IndexedSeq(TERMINATE_AT_INSTANCE_HOUR, TERMINATE_AT_TASK_COMPLETION)
  }

  /**
    * The type of adjustment the automatic scaling activity makes when triggered, and the periodicity of the adjustment.
    */
  @js.native
  trait ScalingAction extends js.Object {
    var SimpleScalingPolicyConfiguration: SimpleScalingPolicyConfiguration
    var Market: js.UndefOr[MarketType]
  }

  object ScalingAction {
    def apply(SimpleScalingPolicyConfiguration: SimpleScalingPolicyConfiguration,
              Market: js.UndefOr[MarketType] = js.undefined): ScalingAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SimpleScalingPolicyConfiguration" -> SimpleScalingPolicyConfiguration.asInstanceOf[js.Any],
        "Market" -> Market.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalingAction]
    }
  }

  /**
    * The upper and lower EC2 instance limits for an automatic scaling policy. Automatic scaling activities triggered by automatic scaling rules will not cause an instance group to grow above or below these limits.
    */
  @js.native
  trait ScalingConstraints extends js.Object {
    var MaxCapacity: Int
    var MinCapacity: Int
  }

  object ScalingConstraints {
    def apply(MaxCapacity: Int, MinCapacity: Int): ScalingConstraints = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxCapacity" -> MaxCapacity.asInstanceOf[js.Any],
        "MinCapacity" -> MinCapacity.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalingConstraints]
    }
  }

  /**
    * A scale-in or scale-out rule that defines scaling activity, including the CloudWatch metric alarm that triggers activity, how EC2 instances are added or removed, and the periodicity of adjustments. The automatic scaling policy for an instance group can comprise one or more automatic scaling rules.
    */
  @js.native
  trait ScalingRule extends js.Object {
    var Action: ScalingAction
    var Name: String
    var Trigger: ScalingTrigger
    var Description: js.UndefOr[String]
  }

  object ScalingRule {
    def apply(Action: ScalingAction,
              Name: String,
              Trigger: ScalingTrigger,
              Description: js.UndefOr[String] = js.undefined): ScalingRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action"  -> Action.asInstanceOf[js.Any],
        "Name"    -> Name.asInstanceOf[js.Any],
        "Trigger" -> Trigger.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalingRule]
    }
  }

  /**
    * The conditions that trigger an automatic scaling activity.
    */
  @js.native
  trait ScalingTrigger extends js.Object {
    var CloudWatchAlarmDefinition: CloudWatchAlarmDefinition
  }

  object ScalingTrigger {
    def apply(CloudWatchAlarmDefinition: CloudWatchAlarmDefinition): ScalingTrigger = {
      val _fields =
        IndexedSeq[(String, js.Any)]("CloudWatchAlarmDefinition" -> CloudWatchAlarmDefinition.asInstanceOf[js.Any])
          .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalingTrigger]
    }
  }

  /**
    * Configuration of the script to run during a bootstrap action.
    */
  @js.native
  trait ScriptBootstrapActionConfig extends js.Object {
    var Path: XmlString
    var Args: js.UndefOr[XmlStringList]
  }

  object ScriptBootstrapActionConfig {
    def apply(Path: XmlString, Args: js.UndefOr[XmlStringList] = js.undefined): ScriptBootstrapActionConfig = {
      val _fields = IndexedSeq[(String, js.Any)]("Path" -> Path.asInstanceOf[js.Any], "Args" -> Args.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScriptBootstrapActionConfig]
    }
  }

  /**
    * The creation date and time, and name, of a security configuration.
    */
  @js.native
  trait SecurityConfigurationSummary extends js.Object {
    var CreationDateTime: js.UndefOr[Date]
    var Name: js.UndefOr[XmlString]
  }

  object SecurityConfigurationSummary {
    def apply(CreationDateTime: js.UndefOr[Date] = js.undefined,
              Name: js.UndefOr[XmlString] = js.undefined): SecurityConfigurationSummary = {
      val _fields = IndexedSeq[(String, js.Any)]("CreationDateTime" -> CreationDateTime.map { x =>
        x.asInstanceOf[js.Any]
      }, "Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecurityConfigurationSummary]
    }
  }

  /**
    * The input argument to the <a>TerminationProtection</a> operation.
    */
  @js.native
  trait SetTerminationProtectionInput extends js.Object {
    var JobFlowIds: XmlStringList
    var TerminationProtected: Boolean
  }

  object SetTerminationProtectionInput {
    def apply(JobFlowIds: XmlStringList, TerminationProtected: Boolean): SetTerminationProtectionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobFlowIds"           -> JobFlowIds.asInstanceOf[js.Any],
        "TerminationProtected" -> TerminationProtected.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetTerminationProtectionInput]
    }
  }

  /**
    * The input to the SetVisibleToAllUsers action.
    */
  @js.native
  trait SetVisibleToAllUsersInput extends js.Object {
    var JobFlowIds: XmlStringList
    var VisibleToAllUsers: Boolean
  }

  object SetVisibleToAllUsersInput {
    def apply(JobFlowIds: XmlStringList, VisibleToAllUsers: Boolean): SetVisibleToAllUsersInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobFlowIds"        -> JobFlowIds.asInstanceOf[js.Any],
        "VisibleToAllUsers" -> VisibleToAllUsers.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetVisibleToAllUsersInput]
    }
  }

  /**
    * Policy for customizing shrink operations. Allows configuration of decommissioning timeout and targeted instance shrinking.
    */
  @js.native
  trait ShrinkPolicy extends js.Object {
    var DecommissionTimeout: js.UndefOr[Int]
    var InstanceResizePolicy: js.UndefOr[InstanceResizePolicy]
  }

  object ShrinkPolicy {
    def apply(DecommissionTimeout: js.UndefOr[Int] = js.undefined,
              InstanceResizePolicy: js.UndefOr[InstanceResizePolicy] = js.undefined): ShrinkPolicy = {
      val _fields = IndexedSeq[(String, js.Any)]("DecommissionTimeout" -> DecommissionTimeout.map { x =>
        x.asInstanceOf[js.Any]
      }, "InstanceResizePolicy" -> InstanceResizePolicy.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ShrinkPolicy]
    }
  }

  /**
    * An automatic scaling configuration, which describes how the policy adds or removes instances, the cooldown period, and the number of EC2 instances that will be added each time the CloudWatch metric alarm condition is satisfied.
    */
  @js.native
  trait SimpleScalingPolicyConfiguration extends js.Object {
    var ScalingAdjustment: Int
    var AdjustmentType: js.UndefOr[AdjustmentType]
    var CoolDown: js.UndefOr[Int]
  }

  object SimpleScalingPolicyConfiguration {
    def apply(ScalingAdjustment: Int,
              AdjustmentType: js.UndefOr[AdjustmentType] = js.undefined,
              CoolDown: js.UndefOr[Int] = js.undefined): SimpleScalingPolicyConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScalingAdjustment" -> ScalingAdjustment.asInstanceOf[js.Any],
        "AdjustmentType" -> AdjustmentType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CoolDown" -> CoolDown.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SimpleScalingPolicyConfiguration]
    }
  }

  /**
    * The launch specification for Spot instances in the instance fleet, which determines the defined duration and provisioning timeout behavior.
    *
    * '''Note:'''The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.
    */
  @js.native
  trait SpotProvisioningSpecification extends js.Object {
    var TimeoutAction: SpotProvisioningTimeoutAction
    var TimeoutDurationMinutes: WholeNumber
    var BlockDurationMinutes: js.UndefOr[WholeNumber]
  }

  object SpotProvisioningSpecification {
    def apply(TimeoutAction: SpotProvisioningTimeoutAction,
              TimeoutDurationMinutes: WholeNumber,
              BlockDurationMinutes: js.UndefOr[WholeNumber] = js.undefined): SpotProvisioningSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TimeoutAction"          -> TimeoutAction.asInstanceOf[js.Any],
        "TimeoutDurationMinutes" -> TimeoutDurationMinutes.asInstanceOf[js.Any],
        "BlockDurationMinutes" -> BlockDurationMinutes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotProvisioningSpecification]
    }
  }

  object SpotProvisioningTimeoutActionEnum {
    val SWITCH_TO_ON_DEMAND = "SWITCH_TO_ON_DEMAND"
    val TERMINATE_CLUSTER   = "TERMINATE_CLUSTER"

    val values = IndexedSeq(SWITCH_TO_ON_DEMAND, TERMINATE_CLUSTER)
  }

  object StatisticEnum {
    val SAMPLE_COUNT = "SAMPLE_COUNT"
    val AVERAGE      = "AVERAGE"
    val SUM          = "SUM"
    val MINIMUM      = "MINIMUM"
    val MAXIMUM      = "MAXIMUM"

    val values = IndexedSeq(SAMPLE_COUNT, AVERAGE, SUM, MINIMUM, MAXIMUM)
  }

  /**
    * This represents a step in a cluster.
    */
  @js.native
  trait Step extends js.Object {
    var ActionOnFailure: js.UndefOr[ActionOnFailure]
    var Config: js.UndefOr[HadoopStepConfig]
    var Id: js.UndefOr[StepId]
    var Name: js.UndefOr[String]
    var Status: js.UndefOr[StepStatus]
  }

  object Step {
    def apply(ActionOnFailure: js.UndefOr[ActionOnFailure] = js.undefined,
              Config: js.UndefOr[HadoopStepConfig] = js.undefined,
              Id: js.UndefOr[StepId] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[StepStatus] = js.undefined): Step = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActionOnFailure" -> ActionOnFailure.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Config" -> Config.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Step]
    }
  }

  /**
    * Specification of a cluster (job flow) step.
    */
  @js.native
  trait StepConfig extends js.Object {
    var HadoopJarStep: HadoopJarStepConfig
    var Name: XmlStringMaxLen256
    var ActionOnFailure: js.UndefOr[ActionOnFailure]
  }

  object StepConfig {
    def apply(HadoopJarStep: HadoopJarStepConfig,
              Name: XmlStringMaxLen256,
              ActionOnFailure: js.UndefOr[ActionOnFailure] = js.undefined): StepConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HadoopJarStep" -> HadoopJarStep.asInstanceOf[js.Any],
        "Name"          -> Name.asInstanceOf[js.Any],
        "ActionOnFailure" -> ActionOnFailure.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepConfig]
    }
  }

  /**
    * Combines the execution state and configuration of a step.
    */
  @js.native
  trait StepDetail extends js.Object {
    var ExecutionStatusDetail: StepExecutionStatusDetail
    var StepConfig: StepConfig
  }

  object StepDetail {
    def apply(ExecutionStatusDetail: StepExecutionStatusDetail, StepConfig: StepConfig): StepDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExecutionStatusDetail" -> ExecutionStatusDetail.asInstanceOf[js.Any],
        "StepConfig"            -> StepConfig.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepDetail]
    }
  }

  object StepExecutionStateEnum {
    val PENDING     = "PENDING"
    val RUNNING     = "RUNNING"
    val CONTINUE    = "CONTINUE"
    val COMPLETED   = "COMPLETED"
    val CANCELLED   = "CANCELLED"
    val FAILED      = "FAILED"
    val INTERRUPTED = "INTERRUPTED"

    val values = IndexedSeq(PENDING, RUNNING, CONTINUE, COMPLETED, CANCELLED, FAILED, INTERRUPTED)
  }

  /**
    * The execution state of a step.
    */
  @js.native
  trait StepExecutionStatusDetail extends js.Object {
    var CreationDateTime: Date
    var State: StepExecutionState
    var EndDateTime: js.UndefOr[Date]
    var LastStateChangeReason: js.UndefOr[XmlString]
    var StartDateTime: js.UndefOr[Date]
  }

  object StepExecutionStatusDetail {
    def apply(CreationDateTime: Date,
              State: StepExecutionState,
              EndDateTime: js.UndefOr[Date] = js.undefined,
              LastStateChangeReason: js.UndefOr[XmlString] = js.undefined,
              StartDateTime: js.UndefOr[Date] = js.undefined): StepExecutionStatusDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDateTime" -> CreationDateTime.asInstanceOf[js.Any],
        "State"            -> State.asInstanceOf[js.Any],
        "EndDateTime" -> EndDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastStateChangeReason" -> LastStateChangeReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartDateTime" -> StartDateTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepExecutionStatusDetail]
    }
  }

  object StepStateEnum {
    val PENDING        = "PENDING"
    val CANCEL_PENDING = "CANCEL_PENDING"
    val RUNNING        = "RUNNING"
    val COMPLETED      = "COMPLETED"
    val CANCELLED      = "CANCELLED"
    val FAILED         = "FAILED"
    val INTERRUPTED    = "INTERRUPTED"

    val values = IndexedSeq(PENDING, CANCEL_PENDING, RUNNING, COMPLETED, CANCELLED, FAILED, INTERRUPTED)
  }

  /**
    * The details of the step state change reason.
    */
  @js.native
  trait StepStateChangeReason extends js.Object {
    var Code: js.UndefOr[StepStateChangeReasonCode]
    var Message: js.UndefOr[String]
  }

  object StepStateChangeReason {
    def apply(Code: js.UndefOr[StepStateChangeReasonCode] = js.undefined,
              Message: js.UndefOr[String] = js.undefined): StepStateChangeReason = {
      val _fields = IndexedSeq[(String, js.Any)]("Code" -> Code.map { x =>
        x.asInstanceOf[js.Any]
      }, "Message" -> Message.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepStateChangeReason]
    }
  }

  object StepStateChangeReasonCodeEnum {
    val NONE = "NONE"

    val values = IndexedSeq(NONE)
  }

  /**
    * The execution status details of the cluster step.
    */
  @js.native
  trait StepStatus extends js.Object {
    var FailureDetails: js.UndefOr[FailureDetails]
    var State: js.UndefOr[StepState]
    var StateChangeReason: js.UndefOr[StepStateChangeReason]
    var Timeline: js.UndefOr[StepTimeline]
  }

  object StepStatus {
    def apply(FailureDetails: js.UndefOr[FailureDetails] = js.undefined,
              State: js.UndefOr[StepState] = js.undefined,
              StateChangeReason: js.UndefOr[StepStateChangeReason] = js.undefined,
              Timeline: js.UndefOr[StepTimeline] = js.undefined): StepStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailureDetails" -> FailureDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StateChangeReason" -> StateChangeReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timeline" -> Timeline.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepStatus]
    }
  }

  /**
    * The summary of the cluster step.
    */
  @js.native
  trait StepSummary extends js.Object {
    var ActionOnFailure: js.UndefOr[ActionOnFailure]
    var Config: js.UndefOr[HadoopStepConfig]
    var Id: js.UndefOr[StepId]
    var Name: js.UndefOr[String]
    var Status: js.UndefOr[StepStatus]
  }

  object StepSummary {
    def apply(ActionOnFailure: js.UndefOr[ActionOnFailure] = js.undefined,
              Config: js.UndefOr[HadoopStepConfig] = js.undefined,
              Id: js.UndefOr[StepId] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[StepStatus] = js.undefined): StepSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActionOnFailure" -> ActionOnFailure.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Config" -> Config.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepSummary]
    }
  }

  /**
    * The timeline of the cluster step lifecycle.
    */
  @js.native
  trait StepTimeline extends js.Object {
    var CreationDateTime: js.UndefOr[Date]
    var EndDateTime: js.UndefOr[Date]
    var StartDateTime: js.UndefOr[Date]
  }

  object StepTimeline {
    def apply(CreationDateTime: js.UndefOr[Date] = js.undefined,
              EndDateTime: js.UndefOr[Date] = js.undefined,
              StartDateTime: js.UndefOr[Date] = js.undefined): StepTimeline = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDateTime" -> CreationDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndDateTime" -> EndDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartDateTime" -> StartDateTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepTimeline]
    }
  }

  /**
    * The list of supported product configurations which allow user-supplied arguments. EMR accepts these arguments and forwards them to the corresponding installation script as bootstrap action arguments.
    */
  @js.native
  trait SupportedProductConfig extends js.Object {
    var Args: js.UndefOr[XmlStringList]
    var Name: js.UndefOr[XmlStringMaxLen256]
  }

  object SupportedProductConfig {
    def apply(Args: js.UndefOr[XmlStringList] = js.undefined,
              Name: js.UndefOr[XmlStringMaxLen256] = js.undefined): SupportedProductConfig = {
      val _fields = IndexedSeq[(String, js.Any)]("Args" -> Args.map { x =>
        x.asInstanceOf[js.Any]
      }, "Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SupportedProductConfig]
    }
  }

  /**
    * A key/value pair containing user-defined metadata that you can associate with an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as grouping clusters to track your Amazon EMR resource allocation costs. For more information, see [[http://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html|Tag Clusters]].
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Tag {
    def apply(Key: js.UndefOr[String] = js.undefined, Value: js.UndefOr[String] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)]("Key" -> Key.map { x =>
        x.asInstanceOf[js.Any]
      }, "Value" -> Value.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
    * Input to the <a>TerminateJobFlows</a> operation.
    */
  @js.native
  trait TerminateJobFlowsInput extends js.Object {
    var JobFlowIds: XmlStringList
  }

  object TerminateJobFlowsInput {
    def apply(JobFlowIds: XmlStringList): TerminateJobFlowsInput = {
      val _fields = IndexedSeq[(String, js.Any)]("JobFlowIds" -> JobFlowIds.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateJobFlowsInput]
    }
  }

  object UnitEnum {
    val NONE                  = "NONE"
    val SECONDS               = "SECONDS"
    val MICRO_SECONDS         = "MICRO_SECONDS"
    val MILLI_SECONDS         = "MILLI_SECONDS"
    val BYTES                 = "BYTES"
    val KILO_BYTES            = "KILO_BYTES"
    val MEGA_BYTES            = "MEGA_BYTES"
    val GIGA_BYTES            = "GIGA_BYTES"
    val TERA_BYTES            = "TERA_BYTES"
    val BITS                  = "BITS"
    val KILO_BITS             = "KILO_BITS"
    val MEGA_BITS             = "MEGA_BITS"
    val GIGA_BITS             = "GIGA_BITS"
    val TERA_BITS             = "TERA_BITS"
    val PERCENT               = "PERCENT"
    val COUNT                 = "COUNT"
    val BYTES_PER_SECOND      = "BYTES_PER_SECOND"
    val KILO_BYTES_PER_SECOND = "KILO_BYTES_PER_SECOND"
    val MEGA_BYTES_PER_SECOND = "MEGA_BYTES_PER_SECOND"
    val GIGA_BYTES_PER_SECOND = "GIGA_BYTES_PER_SECOND"
    val TERA_BYTES_PER_SECOND = "TERA_BYTES_PER_SECOND"
    val BITS_PER_SECOND       = "BITS_PER_SECOND"
    val KILO_BITS_PER_SECOND  = "KILO_BITS_PER_SECOND"
    val MEGA_BITS_PER_SECOND  = "MEGA_BITS_PER_SECOND"
    val GIGA_BITS_PER_SECOND  = "GIGA_BITS_PER_SECOND"
    val TERA_BITS_PER_SECOND  = "TERA_BITS_PER_SECOND"
    val COUNT_PER_SECOND      = "COUNT_PER_SECOND"

    val values = IndexedSeq(
      NONE,
      SECONDS,
      MICRO_SECONDS,
      MILLI_SECONDS,
      BYTES,
      KILO_BYTES,
      MEGA_BYTES,
      GIGA_BYTES,
      TERA_BYTES,
      BITS,
      KILO_BITS,
      MEGA_BITS,
      GIGA_BITS,
      TERA_BITS,
      PERCENT,
      COUNT,
      BYTES_PER_SECOND,
      KILO_BYTES_PER_SECOND,
      MEGA_BYTES_PER_SECOND,
      GIGA_BYTES_PER_SECOND,
      TERA_BYTES_PER_SECOND,
      BITS_PER_SECOND,
      KILO_BITS_PER_SECOND,
      MEGA_BITS_PER_SECOND,
      GIGA_BITS_PER_SECOND,
      TERA_BITS_PER_SECOND,
      COUNT_PER_SECOND
    )
  }

  /**
    * EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested for the EBS volume attached to an EC2 instance in the cluster.
    */
  @js.native
  trait VolumeSpecification extends js.Object {
    var SizeInGB: Int
    var VolumeType: String
    var Iops: js.UndefOr[Int]
  }

  object VolumeSpecification {
    def apply(SizeInGB: Int, VolumeType: String, Iops: js.UndefOr[Int] = js.undefined): VolumeSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SizeInGB"   -> SizeInGB.asInstanceOf[js.Any],
        "VolumeType" -> VolumeType.asInstanceOf[js.Any],
        "Iops" -> Iops.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeSpecification]
    }
  }
}
