package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object elasticmapreduce {
  type ActionOnFailure = String
  type AdjustmentType = String
  type ApplicationList = js.Array[Application]
  type AutoScalingPolicyState = String
  type AutoScalingPolicyStateChangeReasonCode = String
  type BooleanObject = Boolean
  type BootstrapActionConfigList = js.Array[BootstrapActionConfig]
  type BootstrapActionDetailList = js.Array[BootstrapActionDetail]
  type CancelStepsInfoList = js.Array[CancelStepsInfo]
  type CancelStepsRequestStatus = String
  type ClusterId = String
  type ClusterState = String
  type ClusterStateChangeReasonCode = String
  type ClusterStateList = js.Array[ClusterState]
  type ClusterSummaryList = js.Array[ClusterSummary]
  type CommandList = js.Array[Command]
  type ComparisonOperator = String
  type ConfigurationList = js.Array[Configuration]
  type Date = js.Date
  type EC2InstanceIdsList = js.Array[InstanceId]
  type EC2InstanceIdsToTerminateList = js.Array[InstanceId]
  type EbsBlockDeviceConfigList = js.Array[EbsBlockDeviceConfig]
  type EbsBlockDeviceList = js.Array[EbsBlockDevice]
  type EbsVolumeList = js.Array[EbsVolume]
  type ErrorCode = String
  type ErrorMessage = String
  type InstanceGroupConfigList = js.Array[InstanceGroupConfig]
  type InstanceGroupDetailList = js.Array[InstanceGroupDetail]
  type InstanceGroupId = String
  type InstanceGroupIdsList = js.Array[XmlStringMaxLen256]
  type InstanceGroupList = js.Array[InstanceGroup]
  type InstanceGroupModifyConfigList = js.Array[InstanceGroupModifyConfig]
  type InstanceGroupState = String
  type InstanceGroupStateChangeReasonCode = String
  type InstanceGroupType = String
  type InstanceGroupTypeList = js.Array[InstanceGroupType]
  type InstanceId = String
  type InstanceList = js.Array[Instance]
  type InstanceRoleType = String
  type InstanceState = String
  type InstanceStateChangeReasonCode = String
  type InstanceStateList = js.Array[InstanceState]
  type InstanceType = String
  type JobFlowDetailList = js.Array[JobFlowDetail]
  type JobFlowExecutionState = String
  type JobFlowExecutionStateList = js.Array[JobFlowExecutionState]
  type KeyValueList = js.Array[KeyValue]
  type Marker = String
  type MarketType = String
  type MetricDimensionList = js.Array[MetricDimension]
  type NewSupportedProductsList = js.Array[SupportedProductConfig]
  type NonNegativeDouble = Double
  type ResourceId = String
  type ScaleDownBehavior = String
  type ScalingRuleList = js.Array[ScalingRule]
  type SecurityConfigurationList = js.Array[SecurityConfigurationSummary]
  type SecurityGroupsList = js.Array[XmlStringMaxLen256]
  type Statistic = String
  type StepConfigList = js.Array[StepConfig]
  type StepDetailList = js.Array[StepDetail]
  type StepExecutionState = String
  type StepId = String
  type StepIdsList = js.Array[XmlStringMaxLen256]
  type StepState = String
  type StepStateChangeReasonCode = String
  type StepStateList = js.Array[StepState]
  type StepSummaryList = js.Array[StepSummary]
  type StringList = js.Array[String]
  type StringMap = js.Dictionary[String]
  type SupportedProductsList = js.Array[XmlStringMaxLen256]
  type TagList = js.Array[Tag]
  type Unit = String
  type XmlString = String
  type XmlStringList = js.Array[XmlString]
  type XmlStringMaxLen256 = String
}

package elasticmapreduce {
  @js.native
  trait Elasticmapreduce extends js.Object {
    def addInstanceGroups(params: AddInstanceGroupsInput, callback: Callback[AddInstanceGroupsOutput]): Unit = js.native
    def addInstanceGroups(params: AddInstanceGroupsInput): Request[AddInstanceGroupsOutput] = js.native
    def addJobFlowSteps(params: AddJobFlowStepsInput, callback: Callback[AddJobFlowStepsOutput]): Unit = js.native
    def addJobFlowSteps(params: AddJobFlowStepsInput): Request[AddJobFlowStepsOutput] = js.native
    def addTags(params: AddTagsInput, callback: Callback[AddTagsOutput]): Unit = js.native
    def addTags(params: AddTagsInput): Request[AddTagsOutput] = js.native
    def cancelSteps(params: CancelStepsInput, callback: Callback[CancelStepsOutput]): Unit = js.native
    def cancelSteps(params: CancelStepsInput): Request[CancelStepsOutput] = js.native
    def createSecurityConfiguration(params: CreateSecurityConfigurationInput, callback: Callback[CreateSecurityConfigurationOutput]): Unit = js.native
    def createSecurityConfiguration(params: CreateSecurityConfigurationInput): Request[CreateSecurityConfigurationOutput] = js.native
    def deleteSecurityConfiguration(params: DeleteSecurityConfigurationInput, callback: Callback[DeleteSecurityConfigurationOutput]): Unit = js.native
    def deleteSecurityConfiguration(params: DeleteSecurityConfigurationInput): Request[DeleteSecurityConfigurationOutput] = js.native
    def describeCluster(params: DescribeClusterInput, callback: Callback[DescribeClusterOutput]): Unit = js.native
    def describeCluster(params: DescribeClusterInput): Request[DescribeClusterOutput] = js.native
    def describeJobFlows(params: DescribeJobFlowsInput, callback: Callback[DescribeJobFlowsOutput]): Unit = js.native
    def describeJobFlows(params: DescribeJobFlowsInput): Request[DescribeJobFlowsOutput] = js.native
    def describeSecurityConfiguration(params: DescribeSecurityConfigurationInput, callback: Callback[DescribeSecurityConfigurationOutput]): Unit = js.native
    def describeSecurityConfiguration(params: DescribeSecurityConfigurationInput): Request[DescribeSecurityConfigurationOutput] = js.native
    def describeStep(params: DescribeStepInput, callback: Callback[DescribeStepOutput]): Unit = js.native
    def describeStep(params: DescribeStepInput): Request[DescribeStepOutput] = js.native
    def listBootstrapActions(params: ListBootstrapActionsInput, callback: Callback[ListBootstrapActionsOutput]): Unit = js.native
    def listBootstrapActions(params: ListBootstrapActionsInput): Request[ListBootstrapActionsOutput] = js.native
    def listClusters(params: ListClustersInput, callback: Callback[ListClustersOutput]): Unit = js.native
    def listClusters(params: ListClustersInput): Request[ListClustersOutput] = js.native
    def listInstanceGroups(params: ListInstanceGroupsInput, callback: Callback[ListInstanceGroupsOutput]): Unit = js.native
    def listInstanceGroups(params: ListInstanceGroupsInput): Request[ListInstanceGroupsOutput] = js.native
    def listInstances(params: ListInstancesInput, callback: Callback[ListInstancesOutput]): Unit = js.native
    def listInstances(params: ListInstancesInput): Request[ListInstancesOutput] = js.native
    def listSecurityConfigurations(params: ListSecurityConfigurationsInput, callback: Callback[ListSecurityConfigurationsOutput]): Unit = js.native
    def listSecurityConfigurations(params: ListSecurityConfigurationsInput): Request[ListSecurityConfigurationsOutput] = js.native
    def listSteps(params: ListStepsInput, callback: Callback[ListStepsOutput]): Unit = js.native
    def listSteps(params: ListStepsInput): Request[ListStepsOutput] = js.native
    def modifyInstanceGroups(params: ModifyInstanceGroupsInput, callback: Callback[js.Object]): Unit = js.native
    def modifyInstanceGroups(params: ModifyInstanceGroupsInput): Request[js.Object] = js.native
    def putAutoScalingPolicy(params: PutAutoScalingPolicyInput, callback: Callback[PutAutoScalingPolicyOutput]): Unit = js.native
    def putAutoScalingPolicy(params: PutAutoScalingPolicyInput): Request[PutAutoScalingPolicyOutput] = js.native
    def removeAutoScalingPolicy(params: RemoveAutoScalingPolicyInput, callback: Callback[RemoveAutoScalingPolicyOutput]): Unit = js.native
    def removeAutoScalingPolicy(params: RemoveAutoScalingPolicyInput): Request[RemoveAutoScalingPolicyOutput] = js.native
    def removeTags(params: RemoveTagsInput, callback: Callback[RemoveTagsOutput]): Unit = js.native
    def removeTags(params: RemoveTagsInput): Request[RemoveTagsOutput] = js.native
    def runJobFlow(params: RunJobFlowInput, callback: Callback[RunJobFlowOutput]): Unit = js.native
    def runJobFlow(params: RunJobFlowInput): Request[RunJobFlowOutput] = js.native
    def setTerminationProtection(params: SetTerminationProtectionInput, callback: Callback[js.Object]): Unit = js.native
    def setTerminationProtection(params: SetTerminationProtectionInput): Request[js.Object] = js.native
    def setVisibleToAllUsers(params: SetVisibleToAllUsersInput, callback: Callback[js.Object]): Unit = js.native
    def setVisibleToAllUsers(params: SetVisibleToAllUsersInput): Request[js.Object] = js.native
    def terminateJobFlows(params: TerminateJobFlowsInput, callback: Callback[js.Object]): Unit = js.native
    def terminateJobFlows(params: TerminateJobFlowsInput): Request[js.Object] = js.native
  }


  object ActionOnFailureEnum {
    val `TERMINATE_JOB_FLOW` = "TERMINATE_JOB_FLOW"
    val `TERMINATE_CLUSTER` = "TERMINATE_CLUSTER"
    val `CANCEL_AND_WAIT` = "CANCEL_AND_WAIT"
    val CONTINUE = "CONTINUE"

    val values = IndexedSeq(`TERMINATE_JOB_FLOW`, `TERMINATE_CLUSTER`, `CANCEL_AND_WAIT`, CONTINUE)
  }

  /**
   * <p>Input to an AddInstanceGroups call.</p>
   */
  @js.native
  trait AddInstanceGroupsInput extends js.Object {
    var InstanceGroups: InstanceGroupConfigList
    var JobFlowId: XmlStringMaxLen256
  }

  object AddInstanceGroupsInput {
    def apply(
      InstanceGroups: js.UndefOr[InstanceGroupConfigList] = js.undefined,
      JobFlowId: js.UndefOr[XmlStringMaxLen256] = js.undefined
    ): AddInstanceGroupsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceGroups" -> InstanceGroups.map { x => x: js.Any }),
        ("JobFlowId" -> JobFlowId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddInstanceGroupsInput]
    }
  }

  /**
   * <p>Output from an AddInstanceGroups call.</p>
   */
  @js.native
  trait AddInstanceGroupsOutput extends js.Object {
    var JobFlowId: XmlStringMaxLen256
    var InstanceGroupIds: InstanceGroupIdsList
  }

  object AddInstanceGroupsOutput {
    def apply(
      JobFlowId: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      InstanceGroupIds: js.UndefOr[InstanceGroupIdsList] = js.undefined
    ): AddInstanceGroupsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("JobFlowId" -> JobFlowId.map { x => x: js.Any }),
        ("InstanceGroupIds" -> InstanceGroupIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddInstanceGroupsOutput]
    }
  }

  /**
   * <p> The input argument to the <a>AddJobFlowSteps</a> operation. </p>
   */
  @js.native
  trait AddJobFlowStepsInput extends js.Object {
    var JobFlowId: XmlStringMaxLen256
    var Steps: StepConfigList
  }

  object AddJobFlowStepsInput {
    def apply(
      JobFlowId: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      Steps: js.UndefOr[StepConfigList] = js.undefined
    ): AddJobFlowStepsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("JobFlowId" -> JobFlowId.map { x => x: js.Any }),
        ("Steps" -> Steps.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddJobFlowStepsInput]
    }
  }

  /**
   * <p> The output for the <a>AddJobFlowSteps</a> operation. </p>
   */
  @js.native
  trait AddJobFlowStepsOutput extends js.Object {
    var StepIds: StepIdsList
  }

  object AddJobFlowStepsOutput {
    def apply(
      StepIds: js.UndefOr[StepIdsList] = js.undefined
    ): AddJobFlowStepsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StepIds" -> StepIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddJobFlowStepsOutput]
    }
  }

  /**
   * <p>This input identifies a cluster and a list of tags to attach.</p>
   */
  @js.native
  trait AddTagsInput extends js.Object {
    var ResourceId: ResourceId
    var Tags: TagList
  }

  object AddTagsInput {
    def apply(
      ResourceId: js.UndefOr[ResourceId] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): AddTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceId" -> ResourceId.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsInput]
    }
  }

  /**
   * <p>This output indicates the result of adding tags to a resource.</p>
   */
  @js.native
  trait AddTagsOutput extends js.Object {

  }

  object AddTagsOutput {
    def apply(

    ): AddTagsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsOutput]
    }
  }


  object AdjustmentTypeEnum {
    val `CHANGE_IN_CAPACITY` = "CHANGE_IN_CAPACITY"
    val `PERCENT_CHANGE_IN_CAPACITY` = "PERCENT_CHANGE_IN_CAPACITY"
    val `EXACT_CAPACITY` = "EXACT_CAPACITY"

    val values = IndexedSeq(`CHANGE_IN_CAPACITY`, `PERCENT_CHANGE_IN_CAPACITY`, `EXACT_CAPACITY`)
  }

  /**
   * <p>An application is any Amazon or third-party software that you can add to the cluster. This structure contains a list of strings that indicates the software to use with the cluster and accepts a user argument list. Amazon EMR accepts and forwards the argument list to the corresponding installation script as bootstrap action argument. For more information, see <a href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-mapr.html">Launch a Job Flow on the MapR Distribution for Hadoop</a>. Currently supported values are:</p> <ul> <li> <p>"mapr-m3" - launch the job flow using MapR M3 Edition.</p> </li> <li> <p>"mapr-m5" - launch the job flow using MapR M5 Edition.</p> </li> <li> <p>"mapr" with the user arguments specifying "--edition,m3" or "--edition,m5" - launch the job flow using MapR M3 or M5 Edition, respectively.</p> </li> </ul> <note> <p>In Amazon EMR releases 4.0 and greater, the only accepted parameter is the application name. To pass arguments to applications, you supply a configuration for each application.</p> </note>
   */
  @js.native
  trait Application extends js.Object {
    var Name: String
    var Version: String
    var Args: StringList
    var AdditionalInfo: StringMap
  }

  object Application {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Version: js.UndefOr[String] = js.undefined,
      Args: js.UndefOr[StringList] = js.undefined,
      AdditionalInfo: js.UndefOr[StringMap] = js.undefined
    ): Application = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Version" -> Version.map { x => x: js.Any }),
        ("Args" -> Args.map { x => x: js.Any }),
        ("AdditionalInfo" -> AdditionalInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Application]
    }
  }

  /**
   * <p>An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. An automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric. See <a>PutAutoScalingPolicy</a>.</p>
   */
  @js.native
  trait AutoScalingPolicy extends js.Object {
    var Constraints: ScalingConstraints
    var Rules: ScalingRuleList
  }

  object AutoScalingPolicy {
    def apply(
      Constraints: js.UndefOr[ScalingConstraints] = js.undefined,
      Rules: js.UndefOr[ScalingRuleList] = js.undefined
    ): AutoScalingPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Constraints" -> Constraints.map { x => x: js.Any }),
        ("Rules" -> Rules.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingPolicy]
    }
  }

  /**
   * <p>An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric. See <a>PutAutoScalingPolicy</a>.</p>
   */
  @js.native
  trait AutoScalingPolicyDescription extends js.Object {
    var Status: AutoScalingPolicyStatus
    var Constraints: ScalingConstraints
    var Rules: ScalingRuleList
  }

  object AutoScalingPolicyDescription {
    def apply(
      Status: js.UndefOr[AutoScalingPolicyStatus] = js.undefined,
      Constraints: js.UndefOr[ScalingConstraints] = js.undefined,
      Rules: js.UndefOr[ScalingRuleList] = js.undefined
    ): AutoScalingPolicyDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Status" -> Status.map { x => x: js.Any }),
        ("Constraints" -> Constraints.map { x => x: js.Any }),
        ("Rules" -> Rules.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingPolicyDescription]
    }
  }


  object AutoScalingPolicyStateEnum {
    val PENDING = "PENDING"
    val ATTACHING = "ATTACHING"
    val ATTACHED = "ATTACHED"
    val DETACHING = "DETACHING"
    val DETACHED = "DETACHED"
    val FAILED = "FAILED"

    val values = IndexedSeq(PENDING, ATTACHING, ATTACHED, DETACHING, DETACHED, FAILED)
  }

  /**
   * <p>The reason for an <a>AutoScalingPolicyStatus</a> change.</p>
   */
  @js.native
  trait AutoScalingPolicyStateChangeReason extends js.Object {
    var Code: AutoScalingPolicyStateChangeReasonCode
    var Message: String
  }

  object AutoScalingPolicyStateChangeReason {
    def apply(
      Code: js.UndefOr[AutoScalingPolicyStateChangeReasonCode] = js.undefined,
      Message: js.UndefOr[String] = js.undefined
    ): AutoScalingPolicyStateChangeReason = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Code" -> Code.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingPolicyStateChangeReason]
    }
  }


  object AutoScalingPolicyStateChangeReasonCodeEnum {
    val `USER_REQUEST` = "USER_REQUEST"
    val `PROVISION_FAILURE` = "PROVISION_FAILURE"
    val `CLEANUP_FAILURE` = "CLEANUP_FAILURE"

    val values = IndexedSeq(`USER_REQUEST`, `PROVISION_FAILURE`, `CLEANUP_FAILURE`)
  }

  /**
   * <p>The status of an automatic scaling policy. </p>
   */
  @js.native
  trait AutoScalingPolicyStatus extends js.Object {
    var State: AutoScalingPolicyState
    var StateChangeReason: AutoScalingPolicyStateChangeReason
  }

  object AutoScalingPolicyStatus {
    def apply(
      State: js.UndefOr[AutoScalingPolicyState] = js.undefined,
      StateChangeReason: js.UndefOr[AutoScalingPolicyStateChangeReason] = js.undefined
    ): AutoScalingPolicyStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("State" -> State.map { x => x: js.Any }),
        ("StateChangeReason" -> StateChangeReason.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingPolicyStatus]
    }
  }

  /**
   * <p>Configuration of a bootstrap action.</p>
   */
  @js.native
  trait BootstrapActionConfig extends js.Object {
    var Name: XmlStringMaxLen256
    var ScriptBootstrapAction: ScriptBootstrapActionConfig
  }

  object BootstrapActionConfig {
    def apply(
      Name: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      ScriptBootstrapAction: js.UndefOr[ScriptBootstrapActionConfig] = js.undefined
    ): BootstrapActionConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("ScriptBootstrapAction" -> ScriptBootstrapAction.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BootstrapActionConfig]
    }
  }

  /**
   * <p>Reports the configuration of a bootstrap action in a job flow.</p>
   */
  @js.native
  trait BootstrapActionDetail extends js.Object {
    var BootstrapActionConfig: BootstrapActionConfig
  }

  object BootstrapActionDetail {
    def apply(
      BootstrapActionConfig: js.UndefOr[BootstrapActionConfig] = js.undefined
    ): BootstrapActionDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BootstrapActionConfig" -> BootstrapActionConfig.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BootstrapActionDetail]
    }
  }

  @js.native
  trait CancelStepsInfo extends js.Object {
    var StepId: StepId
    var Status: CancelStepsRequestStatus
    var Reason: String
  }

  object CancelStepsInfo {
    def apply(
      StepId: js.UndefOr[StepId] = js.undefined,
      Status: js.UndefOr[CancelStepsRequestStatus] = js.undefined,
      Reason: js.UndefOr[String] = js.undefined
    ): CancelStepsInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StepId" -> StepId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("Reason" -> Reason.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelStepsInfo]
    }
  }

  /**
   * <p>The input argument to the <a>CancelSteps</a> operation.</p>
   */
  @js.native
  trait CancelStepsInput extends js.Object {
    var ClusterId: XmlStringMaxLen256
    var StepIds: StepIdsList
  }

  object CancelStepsInput {
    def apply(
      ClusterId: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      StepIds: js.UndefOr[StepIdsList] = js.undefined
    ): CancelStepsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterId" -> ClusterId.map { x => x: js.Any }),
        ("StepIds" -> StepIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelStepsInput]
    }
  }

  /**
   * <p> The output for the <a>CancelSteps</a> operation. </p>
   */
  @js.native
  trait CancelStepsOutput extends js.Object {
    var CancelStepsInfoList: CancelStepsInfoList
  }

  object CancelStepsOutput {
    def apply(
      CancelStepsInfoList: js.UndefOr[CancelStepsInfoList] = js.undefined
    ): CancelStepsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CancelStepsInfoList" -> CancelStepsInfoList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelStepsOutput]
    }
  }


  object CancelStepsRequestStatusEnum {
    val SUBMITTED = "SUBMITTED"
    val FAILED = "FAILED"

    val values = IndexedSeq(SUBMITTED, FAILED)
  }

  /**
   * <p>The definition of a CloudWatch metric alarm, which determines when an automatic scaling activity is triggered. When the defined alarm conditions are satisfied, scaling activity begins.</p>
   */
  @js.native
  trait CloudWatchAlarmDefinition extends js.Object {
    var Threshold: NonNegativeDouble
    var Dimensions: MetricDimensionList
    var EvaluationPeriods: Integer
    var ComparisonOperator: ComparisonOperator
    var Period: Integer
    var Statistic: Statistic
    var Namespace: String
    var Unit: Unit
    var MetricName: String
  }

  object CloudWatchAlarmDefinition {
    def apply(
      Threshold: js.UndefOr[NonNegativeDouble] = js.undefined,
      Dimensions: js.UndefOr[MetricDimensionList] = js.undefined,
      EvaluationPeriods: js.UndefOr[Integer] = js.undefined,
      ComparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined,
      Period: js.UndefOr[Integer] = js.undefined,
      Statistic: js.UndefOr[Statistic] = js.undefined,
      Namespace: js.UndefOr[String] = js.undefined,
      Unit: js.UndefOr[Unit] = js.undefined,
      MetricName: js.UndefOr[String] = js.undefined
    ): CloudWatchAlarmDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Threshold" -> Threshold.map { x => x: js.Any }),
        ("Dimensions" -> Dimensions.map { x => x: js.Any }),
        ("EvaluationPeriods" -> EvaluationPeriods.map { x => x: js.Any }),
        ("ComparisonOperator" -> ComparisonOperator.map { x => x: js.Any }),
        ("Period" -> Period.map { x => x: js.Any }),
        ("Statistic" -> Statistic.map { x => x: js.Any }),
        ("Namespace" -> Namespace.map { x => x: js.Any }),
        ("Unit" -> Unit.map { x => x: js.Any }),
        ("MetricName" -> MetricName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchAlarmDefinition]
    }
  }

  /**
   * <p>The detailed description of the cluster.</p>
   */
  @js.native
  trait Cluster extends js.Object {
    var AutoTerminate: Boolean
    var LogUri: String
    var Id: ClusterId
    var Name: String
    var Applications: ApplicationList
    var ReleaseLabel: String
    var TerminationProtected: Boolean
    var MasterPublicDnsName: String
    var Ec2InstanceAttributes: Ec2InstanceAttributes
    var ServiceRole: String
    var Configurations: ConfigurationList
    var ScaleDownBehavior: ScaleDownBehavior
    var RunningAmiVersion: String
    var NormalizedInstanceHours: Integer
    var AutoScalingRole: XmlString
    var Tags: TagList
    var VisibleToAllUsers: Boolean
    var RequestedAmiVersion: String
    var SecurityConfiguration: XmlString
    var Status: ClusterStatus
  }

  object Cluster {
    def apply(
      AutoTerminate: js.UndefOr[Boolean] = js.undefined,
      LogUri: js.UndefOr[String] = js.undefined,
      Id: js.UndefOr[ClusterId] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      Applications: js.UndefOr[ApplicationList] = js.undefined,
      ReleaseLabel: js.UndefOr[String] = js.undefined,
      TerminationProtected: js.UndefOr[Boolean] = js.undefined,
      MasterPublicDnsName: js.UndefOr[String] = js.undefined,
      Ec2InstanceAttributes: js.UndefOr[Ec2InstanceAttributes] = js.undefined,
      ServiceRole: js.UndefOr[String] = js.undefined,
      Configurations: js.UndefOr[ConfigurationList] = js.undefined,
      ScaleDownBehavior: js.UndefOr[ScaleDownBehavior] = js.undefined,
      RunningAmiVersion: js.UndefOr[String] = js.undefined,
      NormalizedInstanceHours: js.UndefOr[Integer] = js.undefined,
      AutoScalingRole: js.UndefOr[XmlString] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      VisibleToAllUsers: js.UndefOr[Boolean] = js.undefined,
      RequestedAmiVersion: js.UndefOr[String] = js.undefined,
      SecurityConfiguration: js.UndefOr[XmlString] = js.undefined,
      Status: js.UndefOr[ClusterStatus] = js.undefined
    ): Cluster = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoTerminate" -> AutoTerminate.map { x => x: js.Any }),
        ("LogUri" -> LogUri.map { x => x: js.Any }),
        ("Id" -> Id.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("Applications" -> Applications.map { x => x: js.Any }),
        ("ReleaseLabel" -> ReleaseLabel.map { x => x: js.Any }),
        ("TerminationProtected" -> TerminationProtected.map { x => x: js.Any }),
        ("MasterPublicDnsName" -> MasterPublicDnsName.map { x => x: js.Any }),
        ("Ec2InstanceAttributes" -> Ec2InstanceAttributes.map { x => x: js.Any }),
        ("ServiceRole" -> ServiceRole.map { x => x: js.Any }),
        ("Configurations" -> Configurations.map { x => x: js.Any }),
        ("ScaleDownBehavior" -> ScaleDownBehavior.map { x => x: js.Any }),
        ("RunningAmiVersion" -> RunningAmiVersion.map { x => x: js.Any }),
        ("NormalizedInstanceHours" -> NormalizedInstanceHours.map { x => x: js.Any }),
        ("AutoScalingRole" -> AutoScalingRole.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("VisibleToAllUsers" -> VisibleToAllUsers.map { x => x: js.Any }),
        ("RequestedAmiVersion" -> RequestedAmiVersion.map { x => x: js.Any }),
        ("SecurityConfiguration" -> SecurityConfiguration.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Cluster]
    }
  }


  object ClusterStateEnum {
    val STARTING = "STARTING"
    val BOOTSTRAPPING = "BOOTSTRAPPING"
    val RUNNING = "RUNNING"
    val WAITING = "WAITING"
    val TERMINATING = "TERMINATING"
    val TERMINATED = "TERMINATED"
    val `TERMINATED_WITH_ERRORS` = "TERMINATED_WITH_ERRORS"

    val values = IndexedSeq(STARTING, BOOTSTRAPPING, RUNNING, WAITING, TERMINATING, TERMINATED, `TERMINATED_WITH_ERRORS`)
  }

  /**
   * <p>The reason that the cluster changed to its current state.</p>
   */
  @js.native
  trait ClusterStateChangeReason extends js.Object {
    var Code: ClusterStateChangeReasonCode
    var Message: String
  }

  object ClusterStateChangeReason {
    def apply(
      Code: js.UndefOr[ClusterStateChangeReasonCode] = js.undefined,
      Message: js.UndefOr[String] = js.undefined
    ): ClusterStateChangeReason = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Code" -> Code.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterStateChangeReason]
    }
  }


  object ClusterStateChangeReasonCodeEnum {
    val `INTERNAL_ERROR` = "INTERNAL_ERROR"
    val `VALIDATION_ERROR` = "VALIDATION_ERROR"
    val `INSTANCE_FAILURE` = "INSTANCE_FAILURE"
    val `BOOTSTRAP_FAILURE` = "BOOTSTRAP_FAILURE"
    val `USER_REQUEST` = "USER_REQUEST"
    val `STEP_FAILURE` = "STEP_FAILURE"
    val `ALL_STEPS_COMPLETED` = "ALL_STEPS_COMPLETED"

    val values = IndexedSeq(`INTERNAL_ERROR`, `VALIDATION_ERROR`, `INSTANCE_FAILURE`, `BOOTSTRAP_FAILURE`, `USER_REQUEST`, `STEP_FAILURE`, `ALL_STEPS_COMPLETED`)
  }

  /**
   * <p>The detailed status of the cluster.</p>
   */
  @js.native
  trait ClusterStatus extends js.Object {
    var State: ClusterState
    var StateChangeReason: ClusterStateChangeReason
    var Timeline: ClusterTimeline
  }

  object ClusterStatus {
    def apply(
      State: js.UndefOr[ClusterState] = js.undefined,
      StateChangeReason: js.UndefOr[ClusterStateChangeReason] = js.undefined,
      Timeline: js.UndefOr[ClusterTimeline] = js.undefined
    ): ClusterStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("State" -> State.map { x => x: js.Any }),
        ("StateChangeReason" -> StateChangeReason.map { x => x: js.Any }),
        ("Timeline" -> Timeline.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterStatus]
    }
  }

  /**
   * <p>The summary description of the cluster.</p>
   */
  @js.native
  trait ClusterSummary extends js.Object {
    var Id: ClusterId
    var Name: String
    var Status: ClusterStatus
    var NormalizedInstanceHours: Integer
  }

  object ClusterSummary {
    def apply(
      Id: js.UndefOr[ClusterId] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[ClusterStatus] = js.undefined,
      NormalizedInstanceHours: js.UndefOr[Integer] = js.undefined
    ): ClusterSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("NormalizedInstanceHours" -> NormalizedInstanceHours.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterSummary]
    }
  }

  /**
   * <p>Represents the timeline of the cluster's lifecycle.</p>
   */
  @js.native
  trait ClusterTimeline extends js.Object {
    var CreationDateTime: Date
    var ReadyDateTime: Date
    var EndDateTime: Date
  }

  object ClusterTimeline {
    def apply(
      CreationDateTime: js.UndefOr[Date] = js.undefined,
      ReadyDateTime: js.UndefOr[Date] = js.undefined,
      EndDateTime: js.UndefOr[Date] = js.undefined
    ): ClusterTimeline = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CreationDateTime" -> CreationDateTime.map { x => x: js.Any }),
        ("ReadyDateTime" -> ReadyDateTime.map { x => x: js.Any }),
        ("EndDateTime" -> EndDateTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterTimeline]
    }
  }

  /**
   * <p>An entity describing an executable that runs on a cluster.</p>
   */
  @js.native
  trait Command extends js.Object {
    var Name: String
    var ScriptPath: String
    var Args: StringList
  }

  object Command {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      ScriptPath: js.UndefOr[String] = js.undefined,
      Args: js.UndefOr[StringList] = js.undefined
    ): Command = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("ScriptPath" -> ScriptPath.map { x => x: js.Any }),
        ("Args" -> Args.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Command]
    }
  }


  object ComparisonOperatorEnum {
    val `GREATER_THAN_OR_EQUAL` = "GREATER_THAN_OR_EQUAL"
    val `GREATER_THAN` = "GREATER_THAN"
    val `LESS_THAN` = "LESS_THAN"
    val `LESS_THAN_OR_EQUAL` = "LESS_THAN_OR_EQUAL"

    val values = IndexedSeq(`GREATER_THAN_OR_EQUAL`, `GREATER_THAN`, `LESS_THAN`, `LESS_THAN_OR_EQUAL`)
  }

  /**
   * <note> <p>Amazon EMR releases 4.x or later.</p> </note> <p>Specifies a hardware and software configuration of the EMR cluster. This includes configurations for applications and software bundled with Amazon EMR. The Configuration object is a JSON object which is defined by a classification and a set of properties. Configurations can be nested, so a configuration may have its own Configuration objects listed.</p>
   */
  @js.native
  trait Configuration extends js.Object {
    var Classification: String
    var Configurations: ConfigurationList
    var Properties: StringMap
  }

  object Configuration {
    def apply(
      Classification: js.UndefOr[String] = js.undefined,
      Configurations: js.UndefOr[ConfigurationList] = js.undefined,
      Properties: js.UndefOr[StringMap] = js.undefined
    ): Configuration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Classification" -> Classification.map { x => x: js.Any }),
        ("Configurations" -> Configurations.map { x => x: js.Any }),
        ("Properties" -> Properties.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Configuration]
    }
  }

  @js.native
  trait CreateSecurityConfigurationInput extends js.Object {
    var Name: XmlString
    var SecurityConfiguration: String
  }

  object CreateSecurityConfigurationInput {
    def apply(
      Name: js.UndefOr[XmlString] = js.undefined,
      SecurityConfiguration: js.UndefOr[String] = js.undefined
    ): CreateSecurityConfigurationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("SecurityConfiguration" -> SecurityConfiguration.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSecurityConfigurationInput]
    }
  }

  @js.native
  trait CreateSecurityConfigurationOutput extends js.Object {
    var Name: XmlString
    var CreationDateTime: Date
  }

  object CreateSecurityConfigurationOutput {
    def apply(
      Name: js.UndefOr[XmlString] = js.undefined,
      CreationDateTime: js.UndefOr[Date] = js.undefined
    ): CreateSecurityConfigurationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("CreationDateTime" -> CreationDateTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSecurityConfigurationOutput]
    }
  }

  @js.native
  trait DeleteSecurityConfigurationInput extends js.Object {
    var Name: XmlString
  }

  object DeleteSecurityConfigurationInput {
    def apply(
      Name: js.UndefOr[XmlString] = js.undefined
    ): DeleteSecurityConfigurationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSecurityConfigurationInput]
    }
  }

  @js.native
  trait DeleteSecurityConfigurationOutput extends js.Object {

  }

  object DeleteSecurityConfigurationOutput {
    def apply(

    ): DeleteSecurityConfigurationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSecurityConfigurationOutput]
    }
  }

  /**
   * <p>This input determines which cluster to describe.</p>
   */
  @js.native
  trait DescribeClusterInput extends js.Object {
    var ClusterId: ClusterId
  }

  object DescribeClusterInput {
    def apply(
      ClusterId: js.UndefOr[ClusterId] = js.undefined
    ): DescribeClusterInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterId" -> ClusterId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterInput]
    }
  }

  /**
   * <p>This output contains the description of the cluster.</p>
   */
  @js.native
  trait DescribeClusterOutput extends js.Object {
    var Cluster: Cluster
  }

  object DescribeClusterOutput {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined
    ): DescribeClusterOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Cluster" -> Cluster.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterOutput]
    }
  }

  /**
   * <p> The input for the <a>DescribeJobFlows</a> operation. </p>
   */
  @js.native
  trait DescribeJobFlowsInput extends js.Object {
    var CreatedAfter: Date
    var CreatedBefore: Date
    var JobFlowIds: XmlStringList
    var JobFlowStates: JobFlowExecutionStateList
  }

  object DescribeJobFlowsInput {
    def apply(
      CreatedAfter: js.UndefOr[Date] = js.undefined,
      CreatedBefore: js.UndefOr[Date] = js.undefined,
      JobFlowIds: js.UndefOr[XmlStringList] = js.undefined,
      JobFlowStates: js.UndefOr[JobFlowExecutionStateList] = js.undefined
    ): DescribeJobFlowsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CreatedAfter" -> CreatedAfter.map { x => x: js.Any }),
        ("CreatedBefore" -> CreatedBefore.map { x => x: js.Any }),
        ("JobFlowIds" -> JobFlowIds.map { x => x: js.Any }),
        ("JobFlowStates" -> JobFlowStates.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobFlowsInput]
    }
  }

  /**
   * <p> The output for the <a>DescribeJobFlows</a> operation. </p>
   */
  @js.native
  trait DescribeJobFlowsOutput extends js.Object {
    var JobFlows: JobFlowDetailList
  }

  object DescribeJobFlowsOutput {
    def apply(
      JobFlows: js.UndefOr[JobFlowDetailList] = js.undefined
    ): DescribeJobFlowsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("JobFlows" -> JobFlows.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobFlowsOutput]
    }
  }

  @js.native
  trait DescribeSecurityConfigurationInput extends js.Object {
    var Name: XmlString
  }

  object DescribeSecurityConfigurationInput {
    def apply(
      Name: js.UndefOr[XmlString] = js.undefined
    ): DescribeSecurityConfigurationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSecurityConfigurationInput]
    }
  }

  @js.native
  trait DescribeSecurityConfigurationOutput extends js.Object {
    var Name: XmlString
    var SecurityConfiguration: String
    var CreationDateTime: Date
  }

  object DescribeSecurityConfigurationOutput {
    def apply(
      Name: js.UndefOr[XmlString] = js.undefined,
      SecurityConfiguration: js.UndefOr[String] = js.undefined,
      CreationDateTime: js.UndefOr[Date] = js.undefined
    ): DescribeSecurityConfigurationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("SecurityConfiguration" -> SecurityConfiguration.map { x => x: js.Any }),
        ("CreationDateTime" -> CreationDateTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSecurityConfigurationOutput]
    }
  }

  /**
   * <p>This input determines which step to describe.</p>
   */
  @js.native
  trait DescribeStepInput extends js.Object {
    var ClusterId: ClusterId
    var StepId: StepId
  }

  object DescribeStepInput {
    def apply(
      ClusterId: js.UndefOr[ClusterId] = js.undefined,
      StepId: js.UndefOr[StepId] = js.undefined
    ): DescribeStepInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterId" -> ClusterId.map { x => x: js.Any }),
        ("StepId" -> StepId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStepInput]
    }
  }

  /**
   * <p>This output contains the description of the cluster step.</p>
   */
  @js.native
  trait DescribeStepOutput extends js.Object {
    var Step: Step
  }

  object DescribeStepOutput {
    def apply(
      Step: js.UndefOr[Step] = js.undefined
    ): DescribeStepOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Step" -> Step.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStepOutput]
    }
  }

  /**
   * <p>Configuration of requested EBS block device associated with the instance group.</p>
   */
  @js.native
  trait EbsBlockDevice extends js.Object {
    var VolumeSpecification: VolumeSpecification
    var Device: String
  }

  object EbsBlockDevice {
    def apply(
      VolumeSpecification: js.UndefOr[VolumeSpecification] = js.undefined,
      Device: js.UndefOr[String] = js.undefined
    ): EbsBlockDevice = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeSpecification" -> VolumeSpecification.map { x => x: js.Any }),
        ("Device" -> Device.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EbsBlockDevice]
    }
  }

  /**
   * <p>Configuration of requested EBS block device associated with the instance group with count of volumes that will be associated to every instance.</p>
   */
  @js.native
  trait EbsBlockDeviceConfig extends js.Object {
    var VolumeSpecification: VolumeSpecification
    var VolumesPerInstance: Integer
  }

  object EbsBlockDeviceConfig {
    def apply(
      VolumeSpecification: js.UndefOr[VolumeSpecification] = js.undefined,
      VolumesPerInstance: js.UndefOr[Integer] = js.undefined
    ): EbsBlockDeviceConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeSpecification" -> VolumeSpecification.map { x => x: js.Any }),
        ("VolumesPerInstance" -> VolumesPerInstance.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EbsBlockDeviceConfig]
    }
  }

  /**
   * <p>The Amazon EBS configuration of a cluster instance.</p>
   */
  @js.native
  trait EbsConfiguration extends js.Object {
    var EbsBlockDeviceConfigs: EbsBlockDeviceConfigList
    var EbsOptimized: BooleanObject
  }

  object EbsConfiguration {
    def apply(
      EbsBlockDeviceConfigs: js.UndefOr[EbsBlockDeviceConfigList] = js.undefined,
      EbsOptimized: js.UndefOr[BooleanObject] = js.undefined
    ): EbsConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EbsBlockDeviceConfigs" -> EbsBlockDeviceConfigs.map { x => x: js.Any }),
        ("EbsOptimized" -> EbsOptimized.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EbsConfiguration]
    }
  }

  /**
   * <p>EBS block device that's attached to an EC2 instance.</p>
   */
  @js.native
  trait EbsVolume extends js.Object {
    var Device: String
    var VolumeId: String
  }

  object EbsVolume {
    def apply(
      Device: js.UndefOr[String] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined
    ): EbsVolume = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Device" -> Device.map { x => x: js.Any }),
        ("VolumeId" -> VolumeId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EbsVolume]
    }
  }

  /**
   * <p>Provides information about the EC2 instances in a cluster grouped by category. For example, key name, subnet ID, IAM instance profile, and so on.</p>
   */
  @js.native
  trait Ec2InstanceAttributes extends js.Object {
    var AdditionalSlaveSecurityGroups: StringList
    var EmrManagedMasterSecurityGroup: String
    var EmrManagedSlaveSecurityGroup: String
    var Ec2KeyName: String
    var IamInstanceProfile: String
    var ServiceAccessSecurityGroup: String
    var Ec2SubnetId: String
    var Ec2AvailabilityZone: String
    var AdditionalMasterSecurityGroups: StringList
  }

  object Ec2InstanceAttributes {
    def apply(
      AdditionalSlaveSecurityGroups: js.UndefOr[StringList] = js.undefined,
      EmrManagedMasterSecurityGroup: js.UndefOr[String] = js.undefined,
      EmrManagedSlaveSecurityGroup: js.UndefOr[String] = js.undefined,
      Ec2KeyName: js.UndefOr[String] = js.undefined,
      IamInstanceProfile: js.UndefOr[String] = js.undefined,
      ServiceAccessSecurityGroup: js.UndefOr[String] = js.undefined,
      Ec2SubnetId: js.UndefOr[String] = js.undefined,
      Ec2AvailabilityZone: js.UndefOr[String] = js.undefined,
      AdditionalMasterSecurityGroups: js.UndefOr[StringList] = js.undefined
    ): Ec2InstanceAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AdditionalSlaveSecurityGroups" -> AdditionalSlaveSecurityGroups.map { x => x: js.Any }),
        ("EmrManagedMasterSecurityGroup" -> EmrManagedMasterSecurityGroup.map { x => x: js.Any }),
        ("EmrManagedSlaveSecurityGroup" -> EmrManagedSlaveSecurityGroup.map { x => x: js.Any }),
        ("Ec2KeyName" -> Ec2KeyName.map { x => x: js.Any }),
        ("IamInstanceProfile" -> IamInstanceProfile.map { x => x: js.Any }),
        ("ServiceAccessSecurityGroup" -> ServiceAccessSecurityGroup.map { x => x: js.Any }),
        ("Ec2SubnetId" -> Ec2SubnetId.map { x => x: js.Any }),
        ("Ec2AvailabilityZone" -> Ec2AvailabilityZone.map { x => x: js.Any }),
        ("AdditionalMasterSecurityGroups" -> AdditionalMasterSecurityGroups.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Ec2InstanceAttributes]
    }
  }

  /**
   * <p>The details of the step failure. The service attempts to detect the root cause for many common failures.</p>
   */
  @js.native
  trait FailureDetails extends js.Object {
    var Reason: String
    var Message: String
    var LogFile: String
  }

  object FailureDetails {
    def apply(
      Reason: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[String] = js.undefined,
      LogFile: js.UndefOr[String] = js.undefined
    ): FailureDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Reason" -> Reason.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("LogFile" -> LogFile.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailureDetails]
    }
  }

  /**
   * <p>A job flow step consisting of a JAR file whose main function will be executed. The main function submits a job for Hadoop to execute and waits for the job to finish or fail.</p>
   */
  @js.native
  trait HadoopJarStepConfig extends js.Object {
    var Properties: KeyValueList
    var Jar: XmlString
    var MainClass: XmlString
    var Args: XmlStringList
  }

  object HadoopJarStepConfig {
    def apply(
      Properties: js.UndefOr[KeyValueList] = js.undefined,
      Jar: js.UndefOr[XmlString] = js.undefined,
      MainClass: js.UndefOr[XmlString] = js.undefined,
      Args: js.UndefOr[XmlStringList] = js.undefined
    ): HadoopJarStepConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Properties" -> Properties.map { x => x: js.Any }),
        ("Jar" -> Jar.map { x => x: js.Any }),
        ("MainClass" -> MainClass.map { x => x: js.Any }),
        ("Args" -> Args.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HadoopJarStepConfig]
    }
  }

  /**
   * <p>A cluster step consisting of a JAR file whose main function will be executed. The main function submits a job for Hadoop to execute and waits for the job to finish or fail.</p>
   */
  @js.native
  trait HadoopStepConfig extends js.Object {
    var Jar: String
    var Properties: StringMap
    var MainClass: String
    var Args: StringList
  }

  object HadoopStepConfig {
    def apply(
      Jar: js.UndefOr[String] = js.undefined,
      Properties: js.UndefOr[StringMap] = js.undefined,
      MainClass: js.UndefOr[String] = js.undefined,
      Args: js.UndefOr[StringList] = js.undefined
    ): HadoopStepConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Jar" -> Jar.map { x => x: js.Any }),
        ("Properties" -> Properties.map { x => x: js.Any }),
        ("MainClass" -> MainClass.map { x => x: js.Any }),
        ("Args" -> Args.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HadoopStepConfig]
    }
  }

  /**
   * <p>Represents an EC2 instance provisioned as part of cluster.</p>
   */
  @js.native
  trait Instance extends js.Object {
    var Id: InstanceId
    var PrivateIpAddress: String
    var PrivateDnsName: String
    var EbsVolumes: EbsVolumeList
    var PublicIpAddress: String
    var PublicDnsName: String
    var InstanceGroupId: String
    var Ec2InstanceId: InstanceId
    var Status: InstanceStatus
  }

  object Instance {
    def apply(
      Id: js.UndefOr[InstanceId] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      PrivateDnsName: js.UndefOr[String] = js.undefined,
      EbsVolumes: js.UndefOr[EbsVolumeList] = js.undefined,
      PublicIpAddress: js.UndefOr[String] = js.undefined,
      PublicDnsName: js.UndefOr[String] = js.undefined,
      InstanceGroupId: js.UndefOr[String] = js.undefined,
      Ec2InstanceId: js.UndefOr[InstanceId] = js.undefined,
      Status: js.UndefOr[InstanceStatus] = js.undefined
    ): Instance = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("PrivateIpAddress" -> PrivateIpAddress.map { x => x: js.Any }),
        ("PrivateDnsName" -> PrivateDnsName.map { x => x: js.Any }),
        ("EbsVolumes" -> EbsVolumes.map { x => x: js.Any }),
        ("PublicIpAddress" -> PublicIpAddress.map { x => x: js.Any }),
        ("PublicDnsName" -> PublicDnsName.map { x => x: js.Any }),
        ("InstanceGroupId" -> InstanceGroupId.map { x => x: js.Any }),
        ("Ec2InstanceId" -> Ec2InstanceId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Instance]
    }
  }

  /**
   * <p>This entity represents an instance group, which is a group of instances that have common purpose. For example, CORE instance group is used for HDFS.</p>
   */
  @js.native
  trait InstanceGroup extends js.Object {
    var EbsBlockDevices: EbsBlockDeviceList
    var Id: InstanceGroupId
    var Name: String
    var EbsOptimized: BooleanObject
    var AutoScalingPolicy: AutoScalingPolicyDescription
    var InstanceGroupType: InstanceGroupType
    var Configurations: ConfigurationList
    var BidPrice: String
    var Market: MarketType
    var RequestedInstanceCount: Integer
    var RunningInstanceCount: Integer
    var InstanceType: InstanceType
    var ShrinkPolicy: ShrinkPolicy
    var Status: InstanceGroupStatus
  }

  object InstanceGroup {
    def apply(
      EbsBlockDevices: js.UndefOr[EbsBlockDeviceList] = js.undefined,
      Id: js.UndefOr[InstanceGroupId] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      EbsOptimized: js.UndefOr[BooleanObject] = js.undefined,
      AutoScalingPolicy: js.UndefOr[AutoScalingPolicyDescription] = js.undefined,
      InstanceGroupType: js.UndefOr[InstanceGroupType] = js.undefined,
      Configurations: js.UndefOr[ConfigurationList] = js.undefined,
      BidPrice: js.UndefOr[String] = js.undefined,
      Market: js.UndefOr[MarketType] = js.undefined,
      RequestedInstanceCount: js.UndefOr[Integer] = js.undefined,
      RunningInstanceCount: js.UndefOr[Integer] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      ShrinkPolicy: js.UndefOr[ShrinkPolicy] = js.undefined,
      Status: js.UndefOr[InstanceGroupStatus] = js.undefined
    ): InstanceGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EbsBlockDevices" -> EbsBlockDevices.map { x => x: js.Any }),
        ("Id" -> Id.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("EbsOptimized" -> EbsOptimized.map { x => x: js.Any }),
        ("AutoScalingPolicy" -> AutoScalingPolicy.map { x => x: js.Any }),
        ("InstanceGroupType" -> InstanceGroupType.map { x => x: js.Any }),
        ("Configurations" -> Configurations.map { x => x: js.Any }),
        ("BidPrice" -> BidPrice.map { x => x: js.Any }),
        ("Market" -> Market.map { x => x: js.Any }),
        ("RequestedInstanceCount" -> RequestedInstanceCount.map { x => x: js.Any }),
        ("RunningInstanceCount" -> RunningInstanceCount.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("ShrinkPolicy" -> ShrinkPolicy.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceGroup]
    }
  }

  /**
   * <p>Configuration defining a new instance group.</p>
   */
  @js.native
  trait InstanceGroupConfig extends js.Object {
    var EbsConfiguration: EbsConfiguration
    var Name: XmlStringMaxLen256
    var AutoScalingPolicy: AutoScalingPolicy
    var InstanceCount: Integer
    var Configurations: ConfigurationList
    var BidPrice: XmlStringMaxLen256
    var Market: MarketType
    var InstanceType: InstanceType
    var InstanceRole: InstanceRoleType
  }

  object InstanceGroupConfig {
    def apply(
      EbsConfiguration: js.UndefOr[EbsConfiguration] = js.undefined,
      Name: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      AutoScalingPolicy: js.UndefOr[AutoScalingPolicy] = js.undefined,
      InstanceCount: js.UndefOr[Integer] = js.undefined,
      Configurations: js.UndefOr[ConfigurationList] = js.undefined,
      BidPrice: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      Market: js.UndefOr[MarketType] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      InstanceRole: js.UndefOr[InstanceRoleType] = js.undefined
    ): InstanceGroupConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EbsConfiguration" -> EbsConfiguration.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("AutoScalingPolicy" -> AutoScalingPolicy.map { x => x: js.Any }),
        ("InstanceCount" -> InstanceCount.map { x => x: js.Any }),
        ("Configurations" -> Configurations.map { x => x: js.Any }),
        ("BidPrice" -> BidPrice.map { x => x: js.Any }),
        ("Market" -> Market.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("InstanceRole" -> InstanceRole.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceGroupConfig]
    }
  }

  /**
   * <p>Detailed information about an instance group.</p>
   */
  @js.native
  trait InstanceGroupDetail extends js.Object {
    var LastStateChangeReason: XmlString
    var StartDateTime: Date
    var Name: XmlStringMaxLen256
    var EndDateTime: Date
    var ReadyDateTime: Date
    var CreationDateTime: Date
    var BidPrice: XmlStringMaxLen256
    var Market: MarketType
    var InstanceRunningCount: Integer
    var InstanceRequestCount: Integer
    var InstanceType: InstanceType
    var InstanceRole: InstanceRoleType
    var State: InstanceGroupState
    var InstanceGroupId: XmlStringMaxLen256
  }

  object InstanceGroupDetail {
    def apply(
      LastStateChangeReason: js.UndefOr[XmlString] = js.undefined,
      StartDateTime: js.UndefOr[Date] = js.undefined,
      Name: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      EndDateTime: js.UndefOr[Date] = js.undefined,
      ReadyDateTime: js.UndefOr[Date] = js.undefined,
      CreationDateTime: js.UndefOr[Date] = js.undefined,
      BidPrice: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      Market: js.UndefOr[MarketType] = js.undefined,
      InstanceRunningCount: js.UndefOr[Integer] = js.undefined,
      InstanceRequestCount: js.UndefOr[Integer] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      InstanceRole: js.UndefOr[InstanceRoleType] = js.undefined,
      State: js.UndefOr[InstanceGroupState] = js.undefined,
      InstanceGroupId: js.UndefOr[XmlStringMaxLen256] = js.undefined
    ): InstanceGroupDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LastStateChangeReason" -> LastStateChangeReason.map { x => x: js.Any }),
        ("StartDateTime" -> StartDateTime.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("EndDateTime" -> EndDateTime.map { x => x: js.Any }),
        ("ReadyDateTime" -> ReadyDateTime.map { x => x: js.Any }),
        ("CreationDateTime" -> CreationDateTime.map { x => x: js.Any }),
        ("BidPrice" -> BidPrice.map { x => x: js.Any }),
        ("Market" -> Market.map { x => x: js.Any }),
        ("InstanceRunningCount" -> InstanceRunningCount.map { x => x: js.Any }),
        ("InstanceRequestCount" -> InstanceRequestCount.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("InstanceRole" -> InstanceRole.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("InstanceGroupId" -> InstanceGroupId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceGroupDetail]
    }
  }

  /**
   * <p>Modify an instance group size.</p>
   */
  @js.native
  trait InstanceGroupModifyConfig extends js.Object {
    var InstanceGroupId: XmlStringMaxLen256
    var InstanceCount: Integer
    var EC2InstanceIdsToTerminate: EC2InstanceIdsToTerminateList
    var ShrinkPolicy: ShrinkPolicy
  }

  object InstanceGroupModifyConfig {
    def apply(
      InstanceGroupId: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      InstanceCount: js.UndefOr[Integer] = js.undefined,
      EC2InstanceIdsToTerminate: js.UndefOr[EC2InstanceIdsToTerminateList] = js.undefined,
      ShrinkPolicy: js.UndefOr[ShrinkPolicy] = js.undefined
    ): InstanceGroupModifyConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceGroupId" -> InstanceGroupId.map { x => x: js.Any }),
        ("InstanceCount" -> InstanceCount.map { x => x: js.Any }),
        ("EC2InstanceIdsToTerminate" -> EC2InstanceIdsToTerminate.map { x => x: js.Any }),
        ("ShrinkPolicy" -> ShrinkPolicy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceGroupModifyConfig]
    }
  }


  object InstanceGroupStateEnum {
    val PROVISIONING = "PROVISIONING"
    val BOOTSTRAPPING = "BOOTSTRAPPING"
    val RUNNING = "RUNNING"
    val RESIZING = "RESIZING"
    val SUSPENDED = "SUSPENDED"
    val TERMINATING = "TERMINATING"
    val TERMINATED = "TERMINATED"
    val ARRESTED = "ARRESTED"
    val `SHUTTING_DOWN` = "SHUTTING_DOWN"
    val ENDED = "ENDED"

    val values = IndexedSeq(PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING, SUSPENDED, TERMINATING, TERMINATED, ARRESTED, `SHUTTING_DOWN`, ENDED)
  }

  /**
   * <p>The status change reason details for the instance group.</p>
   */
  @js.native
  trait InstanceGroupStateChangeReason extends js.Object {
    var Code: InstanceGroupStateChangeReasonCode
    var Message: String
  }

  object InstanceGroupStateChangeReason {
    def apply(
      Code: js.UndefOr[InstanceGroupStateChangeReasonCode] = js.undefined,
      Message: js.UndefOr[String] = js.undefined
    ): InstanceGroupStateChangeReason = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Code" -> Code.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceGroupStateChangeReason]
    }
  }


  object InstanceGroupStateChangeReasonCodeEnum {
    val `INTERNAL_ERROR` = "INTERNAL_ERROR"
    val `VALIDATION_ERROR` = "VALIDATION_ERROR"
    val `INSTANCE_FAILURE` = "INSTANCE_FAILURE"
    val `CLUSTER_TERMINATED` = "CLUSTER_TERMINATED"

    val values = IndexedSeq(`INTERNAL_ERROR`, `VALIDATION_ERROR`, `INSTANCE_FAILURE`, `CLUSTER_TERMINATED`)
  }

  /**
   * <p>The details of the instance group status.</p>
   */
  @js.native
  trait InstanceGroupStatus extends js.Object {
    var State: InstanceGroupState
    var StateChangeReason: InstanceGroupStateChangeReason
    var Timeline: InstanceGroupTimeline
  }

  object InstanceGroupStatus {
    def apply(
      State: js.UndefOr[InstanceGroupState] = js.undefined,
      StateChangeReason: js.UndefOr[InstanceGroupStateChangeReason] = js.undefined,
      Timeline: js.UndefOr[InstanceGroupTimeline] = js.undefined
    ): InstanceGroupStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("State" -> State.map { x => x: js.Any }),
        ("StateChangeReason" -> StateChangeReason.map { x => x: js.Any }),
        ("Timeline" -> Timeline.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceGroupStatus]
    }
  }

  /**
   * <p>The timeline of the instance group lifecycle.</p>
   */
  @js.native
  trait InstanceGroupTimeline extends js.Object {
    var CreationDateTime: Date
    var ReadyDateTime: Date
    var EndDateTime: Date
  }

  object InstanceGroupTimeline {
    def apply(
      CreationDateTime: js.UndefOr[Date] = js.undefined,
      ReadyDateTime: js.UndefOr[Date] = js.undefined,
      EndDateTime: js.UndefOr[Date] = js.undefined
    ): InstanceGroupTimeline = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CreationDateTime" -> CreationDateTime.map { x => x: js.Any }),
        ("ReadyDateTime" -> ReadyDateTime.map { x => x: js.Any }),
        ("EndDateTime" -> EndDateTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceGroupTimeline]
    }
  }


  object InstanceGroupTypeEnum {
    val MASTER = "MASTER"
    val CORE = "CORE"
    val TASK = "TASK"

    val values = IndexedSeq(MASTER, CORE, TASK)
  }

  /**
   * <p>Custom policy for requesting termination protection or termination of specific instances when shrinking an instance group.</p>
   */
  @js.native
  trait InstanceResizePolicy extends js.Object {
    var InstancesToTerminate: EC2InstanceIdsList
    var InstancesToProtect: EC2InstanceIdsList
    var InstanceTerminationTimeout: Integer
  }

  object InstanceResizePolicy {
    def apply(
      InstancesToTerminate: js.UndefOr[EC2InstanceIdsList] = js.undefined,
      InstancesToProtect: js.UndefOr[EC2InstanceIdsList] = js.undefined,
      InstanceTerminationTimeout: js.UndefOr[Integer] = js.undefined
    ): InstanceResizePolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstancesToTerminate" -> InstancesToTerminate.map { x => x: js.Any }),
        ("InstancesToProtect" -> InstancesToProtect.map { x => x: js.Any }),
        ("InstanceTerminationTimeout" -> InstanceTerminationTimeout.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceResizePolicy]
    }
  }


  object InstanceRoleTypeEnum {
    val MASTER = "MASTER"
    val CORE = "CORE"
    val TASK = "TASK"

    val values = IndexedSeq(MASTER, CORE, TASK)
  }


  object InstanceStateEnum {
    val `AWAITING_FULFILLMENT` = "AWAITING_FULFILLMENT"
    val PROVISIONING = "PROVISIONING"
    val BOOTSTRAPPING = "BOOTSTRAPPING"
    val RUNNING = "RUNNING"
    val TERMINATED = "TERMINATED"

    val values = IndexedSeq(`AWAITING_FULFILLMENT`, PROVISIONING, BOOTSTRAPPING, RUNNING, TERMINATED)
  }

  /**
   * <p>The details of the status change reason for the instance.</p>
   */
  @js.native
  trait InstanceStateChangeReason extends js.Object {
    var Code: InstanceStateChangeReasonCode
    var Message: String
  }

  object InstanceStateChangeReason {
    def apply(
      Code: js.UndefOr[InstanceStateChangeReasonCode] = js.undefined,
      Message: js.UndefOr[String] = js.undefined
    ): InstanceStateChangeReason = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Code" -> Code.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceStateChangeReason]
    }
  }


  object InstanceStateChangeReasonCodeEnum {
    val `INTERNAL_ERROR` = "INTERNAL_ERROR"
    val `VALIDATION_ERROR` = "VALIDATION_ERROR"
    val `INSTANCE_FAILURE` = "INSTANCE_FAILURE"
    val `BOOTSTRAP_FAILURE` = "BOOTSTRAP_FAILURE"
    val `CLUSTER_TERMINATED` = "CLUSTER_TERMINATED"

    val values = IndexedSeq(`INTERNAL_ERROR`, `VALIDATION_ERROR`, `INSTANCE_FAILURE`, `BOOTSTRAP_FAILURE`, `CLUSTER_TERMINATED`)
  }

  /**
   * <p>The instance status details.</p>
   */
  @js.native
  trait InstanceStatus extends js.Object {
    var State: InstanceState
    var StateChangeReason: InstanceStateChangeReason
    var Timeline: InstanceTimeline
  }

  object InstanceStatus {
    def apply(
      State: js.UndefOr[InstanceState] = js.undefined,
      StateChangeReason: js.UndefOr[InstanceStateChangeReason] = js.undefined,
      Timeline: js.UndefOr[InstanceTimeline] = js.undefined
    ): InstanceStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("State" -> State.map { x => x: js.Any }),
        ("StateChangeReason" -> StateChangeReason.map { x => x: js.Any }),
        ("Timeline" -> Timeline.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceStatus]
    }
  }

  /**
   * <p>The timeline of the instance lifecycle.</p>
   */
  @js.native
  trait InstanceTimeline extends js.Object {
    var CreationDateTime: Date
    var ReadyDateTime: Date
    var EndDateTime: Date
  }

  object InstanceTimeline {
    def apply(
      CreationDateTime: js.UndefOr[Date] = js.undefined,
      ReadyDateTime: js.UndefOr[Date] = js.undefined,
      EndDateTime: js.UndefOr[Date] = js.undefined
    ): InstanceTimeline = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CreationDateTime" -> CreationDateTime.map { x => x: js.Any }),
        ("ReadyDateTime" -> ReadyDateTime.map { x => x: js.Any }),
        ("EndDateTime" -> EndDateTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceTimeline]
    }
  }

  /**
   * <p>Indicates that an error occurred while processing the request and that the request was not completed.</p>
   */
  @js.native
  trait InternalServerErrorException extends js.Object {

  }

  /**
   * <p>This exception occurs when there is an internal failure in the EMR service.</p>
   */
  @js.native
  trait InternalServerExceptionException extends js.Object {
    var Message: ErrorMessage
  }

  /**
   * <p>This exception occurs when there is something wrong with user input.</p>
   */
  @js.native
  trait InvalidRequestExceptionException extends js.Object {
    var ErrorCode: ErrorCode
    var Message: ErrorMessage
  }

  /**
   * <p>A description of a job flow.</p>
   */
  @js.native
  trait JobFlowDetail extends js.Object {
    var LogUri: XmlString
    var Name: XmlStringMaxLen256
    var AmiVersion: XmlStringMaxLen256
    var JobFlowId: XmlStringMaxLen256
    var SupportedProducts: SupportedProductsList
    var ServiceRole: XmlString
    var ExecutionStatusDetail: JobFlowExecutionStatusDetail
    var JobFlowRole: XmlString
    var ScaleDownBehavior: ScaleDownBehavior
    var Instances: JobFlowInstancesDetail
    var AutoScalingRole: XmlString
    var Steps: StepDetailList
    var VisibleToAllUsers: Boolean
    var BootstrapActions: BootstrapActionDetailList
  }

  object JobFlowDetail {
    def apply(
      LogUri: js.UndefOr[XmlString] = js.undefined,
      Name: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      AmiVersion: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      JobFlowId: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      SupportedProducts: js.UndefOr[SupportedProductsList] = js.undefined,
      ServiceRole: js.UndefOr[XmlString] = js.undefined,
      ExecutionStatusDetail: js.UndefOr[JobFlowExecutionStatusDetail] = js.undefined,
      JobFlowRole: js.UndefOr[XmlString] = js.undefined,
      ScaleDownBehavior: js.UndefOr[ScaleDownBehavior] = js.undefined,
      Instances: js.UndefOr[JobFlowInstancesDetail] = js.undefined,
      AutoScalingRole: js.UndefOr[XmlString] = js.undefined,
      Steps: js.UndefOr[StepDetailList] = js.undefined,
      VisibleToAllUsers: js.UndefOr[Boolean] = js.undefined,
      BootstrapActions: js.UndefOr[BootstrapActionDetailList] = js.undefined
    ): JobFlowDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LogUri" -> LogUri.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("AmiVersion" -> AmiVersion.map { x => x: js.Any }),
        ("JobFlowId" -> JobFlowId.map { x => x: js.Any }),
        ("SupportedProducts" -> SupportedProducts.map { x => x: js.Any }),
        ("ServiceRole" -> ServiceRole.map { x => x: js.Any }),
        ("ExecutionStatusDetail" -> ExecutionStatusDetail.map { x => x: js.Any }),
        ("JobFlowRole" -> JobFlowRole.map { x => x: js.Any }),
        ("ScaleDownBehavior" -> ScaleDownBehavior.map { x => x: js.Any }),
        ("Instances" -> Instances.map { x => x: js.Any }),
        ("AutoScalingRole" -> AutoScalingRole.map { x => x: js.Any }),
        ("Steps" -> Steps.map { x => x: js.Any }),
        ("VisibleToAllUsers" -> VisibleToAllUsers.map { x => x: js.Any }),
        ("BootstrapActions" -> BootstrapActions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobFlowDetail]
    }
  }

  /**
   * <p>The type of instance.</p>
   */
  object JobFlowExecutionStateEnum {
    val STARTING = "STARTING"
    val BOOTSTRAPPING = "BOOTSTRAPPING"
    val RUNNING = "RUNNING"
    val WAITING = "WAITING"
    val `SHUTTING_DOWN` = "SHUTTING_DOWN"
    val TERMINATED = "TERMINATED"
    val COMPLETED = "COMPLETED"
    val FAILED = "FAILED"

    val values = IndexedSeq(STARTING, BOOTSTRAPPING, RUNNING, WAITING, `SHUTTING_DOWN`, TERMINATED, COMPLETED, FAILED)
  }

  /**
   * <p>Describes the status of the job flow.</p>
   */
  @js.native
  trait JobFlowExecutionStatusDetail extends js.Object {
    var LastStateChangeReason: XmlString
    var StartDateTime: Date
    var EndDateTime: Date
    var ReadyDateTime: Date
    var CreationDateTime: Date
    var State: JobFlowExecutionState
  }

  object JobFlowExecutionStatusDetail {
    def apply(
      LastStateChangeReason: js.UndefOr[XmlString] = js.undefined,
      StartDateTime: js.UndefOr[Date] = js.undefined,
      EndDateTime: js.UndefOr[Date] = js.undefined,
      ReadyDateTime: js.UndefOr[Date] = js.undefined,
      CreationDateTime: js.UndefOr[Date] = js.undefined,
      State: js.UndefOr[JobFlowExecutionState] = js.undefined
    ): JobFlowExecutionStatusDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LastStateChangeReason" -> LastStateChangeReason.map { x => x: js.Any }),
        ("StartDateTime" -> StartDateTime.map { x => x: js.Any }),
        ("EndDateTime" -> EndDateTime.map { x => x: js.Any }),
        ("ReadyDateTime" -> ReadyDateTime.map { x => x: js.Any }),
        ("CreationDateTime" -> CreationDateTime.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobFlowExecutionStatusDetail]
    }
  }

  /**
   * <p>A description of the Amazon EC2 instance running the job flow. A valid JobFlowInstancesConfig must contain at least InstanceGroups, which is the recommended configuration. However, a valid alternative is to have MasterInstanceType, SlaveInstanceType, and InstanceCount (all three must be present).</p>
   */
  @js.native
  trait JobFlowInstancesConfig extends js.Object {
    var TerminationProtected: Boolean
    var AdditionalSlaveSecurityGroups: SecurityGroupsList
    var MasterInstanceType: InstanceType
    var Placement: PlacementType
    var EmrManagedMasterSecurityGroup: XmlStringMaxLen256
    var KeepJobFlowAliveWhenNoSteps: Boolean
    var InstanceGroups: InstanceGroupConfigList
    var InstanceCount: Integer
    var EmrManagedSlaveSecurityGroup: XmlStringMaxLen256
    var Ec2KeyName: XmlStringMaxLen256
    var SlaveInstanceType: InstanceType
    var ServiceAccessSecurityGroup: XmlStringMaxLen256
    var Ec2SubnetId: XmlStringMaxLen256
    var AdditionalMasterSecurityGroups: SecurityGroupsList
    var HadoopVersion: XmlStringMaxLen256
  }

  object JobFlowInstancesConfig {
    def apply(
      TerminationProtected: js.UndefOr[Boolean] = js.undefined,
      AdditionalSlaveSecurityGroups: js.UndefOr[SecurityGroupsList] = js.undefined,
      MasterInstanceType: js.UndefOr[InstanceType] = js.undefined,
      Placement: js.UndefOr[PlacementType] = js.undefined,
      EmrManagedMasterSecurityGroup: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      KeepJobFlowAliveWhenNoSteps: js.UndefOr[Boolean] = js.undefined,
      InstanceGroups: js.UndefOr[InstanceGroupConfigList] = js.undefined,
      InstanceCount: js.UndefOr[Integer] = js.undefined,
      EmrManagedSlaveSecurityGroup: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      Ec2KeyName: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      SlaveInstanceType: js.UndefOr[InstanceType] = js.undefined,
      ServiceAccessSecurityGroup: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      Ec2SubnetId: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      AdditionalMasterSecurityGroups: js.UndefOr[SecurityGroupsList] = js.undefined,
      HadoopVersion: js.UndefOr[XmlStringMaxLen256] = js.undefined
    ): JobFlowInstancesConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TerminationProtected" -> TerminationProtected.map { x => x: js.Any }),
        ("AdditionalSlaveSecurityGroups" -> AdditionalSlaveSecurityGroups.map { x => x: js.Any }),
        ("MasterInstanceType" -> MasterInstanceType.map { x => x: js.Any }),
        ("Placement" -> Placement.map { x => x: js.Any }),
        ("EmrManagedMasterSecurityGroup" -> EmrManagedMasterSecurityGroup.map { x => x: js.Any }),
        ("KeepJobFlowAliveWhenNoSteps" -> KeepJobFlowAliveWhenNoSteps.map { x => x: js.Any }),
        ("InstanceGroups" -> InstanceGroups.map { x => x: js.Any }),
        ("InstanceCount" -> InstanceCount.map { x => x: js.Any }),
        ("EmrManagedSlaveSecurityGroup" -> EmrManagedSlaveSecurityGroup.map { x => x: js.Any }),
        ("Ec2KeyName" -> Ec2KeyName.map { x => x: js.Any }),
        ("SlaveInstanceType" -> SlaveInstanceType.map { x => x: js.Any }),
        ("ServiceAccessSecurityGroup" -> ServiceAccessSecurityGroup.map { x => x: js.Any }),
        ("Ec2SubnetId" -> Ec2SubnetId.map { x => x: js.Any }),
        ("AdditionalMasterSecurityGroups" -> AdditionalMasterSecurityGroups.map { x => x: js.Any }),
        ("HadoopVersion" -> HadoopVersion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobFlowInstancesConfig]
    }
  }

  /**
   * <p>Specify the type of Amazon EC2 instances to run the job flow on.</p>
   */
  @js.native
  trait JobFlowInstancesDetail extends js.Object {
    var TerminationProtected: Boolean
    var MasterInstanceId: XmlString
    var MasterPublicDnsName: XmlString
    var MasterInstanceType: InstanceType
    var Placement: PlacementType
    var KeepJobFlowAliveWhenNoSteps: Boolean
    var InstanceGroups: InstanceGroupDetailList
    var InstanceCount: Integer
    var NormalizedInstanceHours: Integer
    var Ec2KeyName: XmlStringMaxLen256
    var SlaveInstanceType: InstanceType
    var Ec2SubnetId: XmlStringMaxLen256
    var HadoopVersion: XmlStringMaxLen256
  }

  object JobFlowInstancesDetail {
    def apply(
      TerminationProtected: js.UndefOr[Boolean] = js.undefined,
      MasterInstanceId: js.UndefOr[XmlString] = js.undefined,
      MasterPublicDnsName: js.UndefOr[XmlString] = js.undefined,
      MasterInstanceType: js.UndefOr[InstanceType] = js.undefined,
      Placement: js.UndefOr[PlacementType] = js.undefined,
      KeepJobFlowAliveWhenNoSteps: js.UndefOr[Boolean] = js.undefined,
      InstanceGroups: js.UndefOr[InstanceGroupDetailList] = js.undefined,
      InstanceCount: js.UndefOr[Integer] = js.undefined,
      NormalizedInstanceHours: js.UndefOr[Integer] = js.undefined,
      Ec2KeyName: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      SlaveInstanceType: js.UndefOr[InstanceType] = js.undefined,
      Ec2SubnetId: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      HadoopVersion: js.UndefOr[XmlStringMaxLen256] = js.undefined
    ): JobFlowInstancesDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TerminationProtected" -> TerminationProtected.map { x => x: js.Any }),
        ("MasterInstanceId" -> MasterInstanceId.map { x => x: js.Any }),
        ("MasterPublicDnsName" -> MasterPublicDnsName.map { x => x: js.Any }),
        ("MasterInstanceType" -> MasterInstanceType.map { x => x: js.Any }),
        ("Placement" -> Placement.map { x => x: js.Any }),
        ("KeepJobFlowAliveWhenNoSteps" -> KeepJobFlowAliveWhenNoSteps.map { x => x: js.Any }),
        ("InstanceGroups" -> InstanceGroups.map { x => x: js.Any }),
        ("InstanceCount" -> InstanceCount.map { x => x: js.Any }),
        ("NormalizedInstanceHours" -> NormalizedInstanceHours.map { x => x: js.Any }),
        ("Ec2KeyName" -> Ec2KeyName.map { x => x: js.Any }),
        ("SlaveInstanceType" -> SlaveInstanceType.map { x => x: js.Any }),
        ("Ec2SubnetId" -> Ec2SubnetId.map { x => x: js.Any }),
        ("HadoopVersion" -> HadoopVersion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobFlowInstancesDetail]
    }
  }

  /**
   * <p>A key value pair.</p>
   */
  @js.native
  trait KeyValue extends js.Object {
    var Key: XmlString
    var Value: XmlString
  }

  object KeyValue {
    def apply(
      Key: js.UndefOr[XmlString] = js.undefined,
      Value: js.UndefOr[XmlString] = js.undefined
    ): KeyValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyValue]
    }
  }

  /**
   * <p>This input determines which bootstrap actions to retrieve.</p>
   */
  @js.native
  trait ListBootstrapActionsInput extends js.Object {
    var ClusterId: ClusterId
    var Marker: Marker
  }

  object ListBootstrapActionsInput {
    def apply(
      ClusterId: js.UndefOr[ClusterId] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined
    ): ListBootstrapActionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterId" -> ClusterId.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBootstrapActionsInput]
    }
  }

  /**
   * <p>This output contains the bootstrap actions detail.</p>
   */
  @js.native
  trait ListBootstrapActionsOutput extends js.Object {
    var BootstrapActions: CommandList
    var Marker: Marker
  }

  object ListBootstrapActionsOutput {
    def apply(
      BootstrapActions: js.UndefOr[CommandList] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined
    ): ListBootstrapActionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BootstrapActions" -> BootstrapActions.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBootstrapActionsOutput]
    }
  }

  /**
   * <p>This input determines how the ListClusters action filters the list of clusters that it returns.</p>
   */
  @js.native
  trait ListClustersInput extends js.Object {
    var CreatedAfter: Date
    var CreatedBefore: Date
    var ClusterStates: ClusterStateList
    var Marker: Marker
  }

  object ListClustersInput {
    def apply(
      CreatedAfter: js.UndefOr[Date] = js.undefined,
      CreatedBefore: js.UndefOr[Date] = js.undefined,
      ClusterStates: js.UndefOr[ClusterStateList] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined
    ): ListClustersInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CreatedAfter" -> CreatedAfter.map { x => x: js.Any }),
        ("CreatedBefore" -> CreatedBefore.map { x => x: js.Any }),
        ("ClusterStates" -> ClusterStates.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListClustersInput]
    }
  }

  /**
   * <p>This contains a ClusterSummaryList with the cluster details; for example, the cluster IDs, names, and status.</p>
   */
  @js.native
  trait ListClustersOutput extends js.Object {
    var Clusters: ClusterSummaryList
    var Marker: Marker
  }

  object ListClustersOutput {
    def apply(
      Clusters: js.UndefOr[ClusterSummaryList] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined
    ): ListClustersOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Clusters" -> Clusters.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListClustersOutput]
    }
  }

  /**
   * <p>This input determines which instance groups to retrieve.</p>
   */
  @js.native
  trait ListInstanceGroupsInput extends js.Object {
    var ClusterId: ClusterId
    var Marker: Marker
  }

  object ListInstanceGroupsInput {
    def apply(
      ClusterId: js.UndefOr[ClusterId] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined
    ): ListInstanceGroupsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterId" -> ClusterId.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInstanceGroupsInput]
    }
  }

  /**
   * <p>This input determines which instance groups to retrieve.</p>
   */
  @js.native
  trait ListInstanceGroupsOutput extends js.Object {
    var InstanceGroups: InstanceGroupList
    var Marker: Marker
  }

  object ListInstanceGroupsOutput {
    def apply(
      InstanceGroups: js.UndefOr[InstanceGroupList] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined
    ): ListInstanceGroupsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceGroups" -> InstanceGroups.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInstanceGroupsOutput]
    }
  }

  /**
   * <p>This input determines which instances to list.</p>
   */
  @js.native
  trait ListInstancesInput extends js.Object {
    var ClusterId: ClusterId
    var InstanceGroupTypes: InstanceGroupTypeList
    var InstanceStates: InstanceStateList
    var InstanceGroupId: InstanceGroupId
    var Marker: Marker
  }

  object ListInstancesInput {
    def apply(
      ClusterId: js.UndefOr[ClusterId] = js.undefined,
      InstanceGroupTypes: js.UndefOr[InstanceGroupTypeList] = js.undefined,
      InstanceStates: js.UndefOr[InstanceStateList] = js.undefined,
      InstanceGroupId: js.UndefOr[InstanceGroupId] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined
    ): ListInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterId" -> ClusterId.map { x => x: js.Any }),
        ("InstanceGroupTypes" -> InstanceGroupTypes.map { x => x: js.Any }),
        ("InstanceStates" -> InstanceStates.map { x => x: js.Any }),
        ("InstanceGroupId" -> InstanceGroupId.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInstancesInput]
    }
  }

  /**
   * <p>This output contains the list of instances.</p>
   */
  @js.native
  trait ListInstancesOutput extends js.Object {
    var Instances: InstanceList
    var Marker: Marker
  }

  object ListInstancesOutput {
    def apply(
      Instances: js.UndefOr[InstanceList] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined
    ): ListInstancesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Instances" -> Instances.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInstancesOutput]
    }
  }

  @js.native
  trait ListSecurityConfigurationsInput extends js.Object {
    var Marker: Marker
  }

  object ListSecurityConfigurationsInput {
    def apply(
      Marker: js.UndefOr[Marker] = js.undefined
    ): ListSecurityConfigurationsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSecurityConfigurationsInput]
    }
  }

  @js.native
  trait ListSecurityConfigurationsOutput extends js.Object {
    var SecurityConfigurations: SecurityConfigurationList
    var Marker: Marker
  }

  object ListSecurityConfigurationsOutput {
    def apply(
      SecurityConfigurations: js.UndefOr[SecurityConfigurationList] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined
    ): ListSecurityConfigurationsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SecurityConfigurations" -> SecurityConfigurations.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSecurityConfigurationsOutput]
    }
  }

  /**
   * <p>This input determines which steps to list.</p>
   */
  @js.native
  trait ListStepsInput extends js.Object {
    var ClusterId: ClusterId
    var StepStates: StepStateList
    var StepIds: XmlStringList
    var Marker: Marker
  }

  object ListStepsInput {
    def apply(
      ClusterId: js.UndefOr[ClusterId] = js.undefined,
      StepStates: js.UndefOr[StepStateList] = js.undefined,
      StepIds: js.UndefOr[XmlStringList] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined
    ): ListStepsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterId" -> ClusterId.map { x => x: js.Any }),
        ("StepStates" -> StepStates.map { x => x: js.Any }),
        ("StepIds" -> StepIds.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStepsInput]
    }
  }

  /**
   * <p>This output contains the list of steps returned in reverse order. This means that the last step is the first element in the list.</p>
   */
  @js.native
  trait ListStepsOutput extends js.Object {
    var Steps: StepSummaryList
    var Marker: Marker
  }

  object ListStepsOutput {
    def apply(
      Steps: js.UndefOr[StepSummaryList] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined
    ): ListStepsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Steps" -> Steps.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStepsOutput]
    }
  }


  object MarketTypeEnum {
    val `ON_DEMAND` = "ON_DEMAND"
    val SPOT = "SPOT"

    val values = IndexedSeq(`ON_DEMAND`, SPOT)
  }

  /**
   * <p>A CloudWatch dimension, which is specified using a <code>Key</code> (known as a <code>Name</code> in CloudWatch), Value pair. By default, Amazon EMR uses one dimension whose <code>Key</code> is <code>JobFlowID</code> and <code>Value</code> is a variable representing the cluster ID, which is <code>${emr:cluster_id}</code>. This enables the rule to bootstrap when the cluster ID becomes available, and also enables a single automatic scaling policy to be reused for multiple clusters and instance groups.</p>
   */
  @js.native
  trait MetricDimension extends js.Object {
    var Key: String
    var Value: String
  }

  object MetricDimension {
    def apply(
      Key: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined
    ): MetricDimension = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricDimension]
    }
  }

  /**
   * <p>Change the size of some instance groups.</p>
   */
  @js.native
  trait ModifyInstanceGroupsInput extends js.Object {
    var ClusterId: ClusterId
    var InstanceGroups: InstanceGroupModifyConfigList
  }

  object ModifyInstanceGroupsInput {
    def apply(
      ClusterId: js.UndefOr[ClusterId] = js.undefined,
      InstanceGroups: js.UndefOr[InstanceGroupModifyConfigList] = js.undefined
    ): ModifyInstanceGroupsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterId" -> ClusterId.map { x => x: js.Any }),
        ("InstanceGroups" -> InstanceGroups.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyInstanceGroupsInput]
    }
  }

  /**
   * <p>The Amazon EC2 location for the job flow.</p>
   */
  @js.native
  trait PlacementType extends js.Object {
    var AvailabilityZone: XmlString
  }

  object PlacementType {
    def apply(
      AvailabilityZone: js.UndefOr[XmlString] = js.undefined
    ): PlacementType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlacementType]
    }
  }

  @js.native
  trait PutAutoScalingPolicyInput extends js.Object {
    var ClusterId: ClusterId
    var InstanceGroupId: InstanceGroupId
    var AutoScalingPolicy: AutoScalingPolicy
  }

  object PutAutoScalingPolicyInput {
    def apply(
      ClusterId: js.UndefOr[ClusterId] = js.undefined,
      InstanceGroupId: js.UndefOr[InstanceGroupId] = js.undefined,
      AutoScalingPolicy: js.UndefOr[AutoScalingPolicy] = js.undefined
    ): PutAutoScalingPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterId" -> ClusterId.map { x => x: js.Any }),
        ("InstanceGroupId" -> InstanceGroupId.map { x => x: js.Any }),
        ("AutoScalingPolicy" -> AutoScalingPolicy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAutoScalingPolicyInput]
    }
  }

  @js.native
  trait PutAutoScalingPolicyOutput extends js.Object {
    var ClusterId: ClusterId
    var InstanceGroupId: InstanceGroupId
    var AutoScalingPolicy: AutoScalingPolicyDescription
  }

  object PutAutoScalingPolicyOutput {
    def apply(
      ClusterId: js.UndefOr[ClusterId] = js.undefined,
      InstanceGroupId: js.UndefOr[InstanceGroupId] = js.undefined,
      AutoScalingPolicy: js.UndefOr[AutoScalingPolicyDescription] = js.undefined
    ): PutAutoScalingPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterId" -> ClusterId.map { x => x: js.Any }),
        ("InstanceGroupId" -> InstanceGroupId.map { x => x: js.Any }),
        ("AutoScalingPolicy" -> AutoScalingPolicy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAutoScalingPolicyOutput]
    }
  }

  @js.native
  trait RemoveAutoScalingPolicyInput extends js.Object {
    var ClusterId: ClusterId
    var InstanceGroupId: InstanceGroupId
  }

  object RemoveAutoScalingPolicyInput {
    def apply(
      ClusterId: js.UndefOr[ClusterId] = js.undefined,
      InstanceGroupId: js.UndefOr[InstanceGroupId] = js.undefined
    ): RemoveAutoScalingPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterId" -> ClusterId.map { x => x: js.Any }),
        ("InstanceGroupId" -> InstanceGroupId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveAutoScalingPolicyInput]
    }
  }

  @js.native
  trait RemoveAutoScalingPolicyOutput extends js.Object {

  }

  object RemoveAutoScalingPolicyOutput {
    def apply(

    ): RemoveAutoScalingPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveAutoScalingPolicyOutput]
    }
  }

  /**
   * <p>This input identifies a cluster and a list of tags to remove.</p>
   */
  @js.native
  trait RemoveTagsInput extends js.Object {
    var ResourceId: ResourceId
    var TagKeys: StringList
  }

  object RemoveTagsInput {
    def apply(
      ResourceId: js.UndefOr[ResourceId] = js.undefined,
      TagKeys: js.UndefOr[StringList] = js.undefined
    ): RemoveTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceId" -> ResourceId.map { x => x: js.Any }),
        ("TagKeys" -> TagKeys.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsInput]
    }
  }

  /**
   * <p>This output indicates the result of removing tags from a resource.</p>
   */
  @js.native
  trait RemoveTagsOutput extends js.Object {

  }

  object RemoveTagsOutput {
    def apply(

    ): RemoveTagsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsOutput]
    }
  }

  /**
   * <p> Input to the <a>RunJobFlow</a> operation. </p>
   */
  @js.native
  trait RunJobFlowInput extends js.Object {
    var LogUri: XmlString
    var Name: XmlStringMaxLen256
    var Applications: ApplicationList
    var ReleaseLabel: XmlStringMaxLen256
    var AmiVersion: XmlStringMaxLen256
    var SupportedProducts: SupportedProductsList
    var ServiceRole: XmlString
    var Configurations: ConfigurationList
    var JobFlowRole: XmlString
    var ScaleDownBehavior: ScaleDownBehavior
    var NewSupportedProducts: NewSupportedProductsList
    var Instances: JobFlowInstancesConfig
    var AutoScalingRole: XmlString
    var AdditionalInfo: XmlString
    var Steps: StepConfigList
    var Tags: TagList
    var VisibleToAllUsers: Boolean
    var SecurityConfiguration: XmlString
    var BootstrapActions: BootstrapActionConfigList
  }

  object RunJobFlowInput {
    def apply(
      LogUri: js.UndefOr[XmlString] = js.undefined,
      Name: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      Applications: js.UndefOr[ApplicationList] = js.undefined,
      ReleaseLabel: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      AmiVersion: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      SupportedProducts: js.UndefOr[SupportedProductsList] = js.undefined,
      ServiceRole: js.UndefOr[XmlString] = js.undefined,
      Configurations: js.UndefOr[ConfigurationList] = js.undefined,
      JobFlowRole: js.UndefOr[XmlString] = js.undefined,
      ScaleDownBehavior: js.UndefOr[ScaleDownBehavior] = js.undefined,
      NewSupportedProducts: js.UndefOr[NewSupportedProductsList] = js.undefined,
      Instances: js.UndefOr[JobFlowInstancesConfig] = js.undefined,
      AutoScalingRole: js.UndefOr[XmlString] = js.undefined,
      AdditionalInfo: js.UndefOr[XmlString] = js.undefined,
      Steps: js.UndefOr[StepConfigList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      VisibleToAllUsers: js.UndefOr[Boolean] = js.undefined,
      SecurityConfiguration: js.UndefOr[XmlString] = js.undefined,
      BootstrapActions: js.UndefOr[BootstrapActionConfigList] = js.undefined
    ): RunJobFlowInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LogUri" -> LogUri.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("Applications" -> Applications.map { x => x: js.Any }),
        ("ReleaseLabel" -> ReleaseLabel.map { x => x: js.Any }),
        ("AmiVersion" -> AmiVersion.map { x => x: js.Any }),
        ("SupportedProducts" -> SupportedProducts.map { x => x: js.Any }),
        ("ServiceRole" -> ServiceRole.map { x => x: js.Any }),
        ("Configurations" -> Configurations.map { x => x: js.Any }),
        ("JobFlowRole" -> JobFlowRole.map { x => x: js.Any }),
        ("ScaleDownBehavior" -> ScaleDownBehavior.map { x => x: js.Any }),
        ("NewSupportedProducts" -> NewSupportedProducts.map { x => x: js.Any }),
        ("Instances" -> Instances.map { x => x: js.Any }),
        ("AutoScalingRole" -> AutoScalingRole.map { x => x: js.Any }),
        ("AdditionalInfo" -> AdditionalInfo.map { x => x: js.Any }),
        ("Steps" -> Steps.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("VisibleToAllUsers" -> VisibleToAllUsers.map { x => x: js.Any }),
        ("SecurityConfiguration" -> SecurityConfiguration.map { x => x: js.Any }),
        ("BootstrapActions" -> BootstrapActions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunJobFlowInput]
    }
  }

  /**
   * <p> The result of the <a>RunJobFlow</a> operation. </p>
   */
  @js.native
  trait RunJobFlowOutput extends js.Object {
    var JobFlowId: XmlStringMaxLen256
  }

  object RunJobFlowOutput {
    def apply(
      JobFlowId: js.UndefOr[XmlStringMaxLen256] = js.undefined
    ): RunJobFlowOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("JobFlowId" -> JobFlowId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunJobFlowOutput]
    }
  }


  object ScaleDownBehaviorEnum {
    val `TERMINATE_AT_INSTANCE_HOUR` = "TERMINATE_AT_INSTANCE_HOUR"
    val `TERMINATE_AT_TASK_COMPLETION` = "TERMINATE_AT_TASK_COMPLETION"

    val values = IndexedSeq(`TERMINATE_AT_INSTANCE_HOUR`, `TERMINATE_AT_TASK_COMPLETION`)
  }

  /**
   * <p>The type of adjustment the automatic scaling activity makes when triggered, and the periodicity of the adjustment.</p>
   */
  @js.native
  trait ScalingAction extends js.Object {
    var Market: MarketType
    var SimpleScalingPolicyConfiguration: SimpleScalingPolicyConfiguration
  }

  object ScalingAction {
    def apply(
      Market: js.UndefOr[MarketType] = js.undefined,
      SimpleScalingPolicyConfiguration: js.UndefOr[SimpleScalingPolicyConfiguration] = js.undefined
    ): ScalingAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Market" -> Market.map { x => x: js.Any }),
        ("SimpleScalingPolicyConfiguration" -> SimpleScalingPolicyConfiguration.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalingAction]
    }
  }

  /**
   * <p>The upper and lower EC2 instance limits for an automatic scaling policy. Automatic scaling activities triggered by automatic scaling rules will not cause an instance group to grow above or below these limits.</p>
   */
  @js.native
  trait ScalingConstraints extends js.Object {
    var MinCapacity: Integer
    var MaxCapacity: Integer
  }

  object ScalingConstraints {
    def apply(
      MinCapacity: js.UndefOr[Integer] = js.undefined,
      MaxCapacity: js.UndefOr[Integer] = js.undefined
    ): ScalingConstraints = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MinCapacity" -> MinCapacity.map { x => x: js.Any }),
        ("MaxCapacity" -> MaxCapacity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalingConstraints]
    }
  }

  /**
   * <p>A scale-in or scale-out rule that defines scaling activity, including the CloudWatch metric alarm that triggers activity, how EC2 instances are added or removed, and the periodicity of adjustments. The automatic scaling policy for an instance group can comprise one or more automatic scaling rules.</p>
   */
  @js.native
  trait ScalingRule extends js.Object {
    var Name: String
    var Description: String
    var Action: ScalingAction
    var Trigger: ScalingTrigger
  }

  object ScalingRule {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      Action: js.UndefOr[ScalingAction] = js.undefined,
      Trigger: js.UndefOr[ScalingTrigger] = js.undefined
    ): ScalingRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("Action" -> Action.map { x => x: js.Any }),
        ("Trigger" -> Trigger.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalingRule]
    }
  }

  /**
   * <p>The conditions that trigger an automatic scaling activity.</p>
   */
  @js.native
  trait ScalingTrigger extends js.Object {
    var CloudWatchAlarmDefinition: CloudWatchAlarmDefinition
  }

  object ScalingTrigger {
    def apply(
      CloudWatchAlarmDefinition: js.UndefOr[CloudWatchAlarmDefinition] = js.undefined
    ): ScalingTrigger = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CloudWatchAlarmDefinition" -> CloudWatchAlarmDefinition.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalingTrigger]
    }
  }

  /**
   * <p>Configuration of the script to run during a bootstrap action.</p>
   */
  @js.native
  trait ScriptBootstrapActionConfig extends js.Object {
    var Path: XmlString
    var Args: XmlStringList
  }

  object ScriptBootstrapActionConfig {
    def apply(
      Path: js.UndefOr[XmlString] = js.undefined,
      Args: js.UndefOr[XmlStringList] = js.undefined
    ): ScriptBootstrapActionConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Path" -> Path.map { x => x: js.Any }),
        ("Args" -> Args.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScriptBootstrapActionConfig]
    }
  }

  /**
   * <p>The creation date and time, and name, of a security configuration.</p>
   */
  @js.native
  trait SecurityConfigurationSummary extends js.Object {
    var Name: XmlString
    var CreationDateTime: Date
  }

  object SecurityConfigurationSummary {
    def apply(
      Name: js.UndefOr[XmlString] = js.undefined,
      CreationDateTime: js.UndefOr[Date] = js.undefined
    ): SecurityConfigurationSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("CreationDateTime" -> CreationDateTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecurityConfigurationSummary]
    }
  }

  /**
   * <p> The input argument to the <a>TerminationProtection</a> operation. </p>
   */
  @js.native
  trait SetTerminationProtectionInput extends js.Object {
    var JobFlowIds: XmlStringList
    var TerminationProtected: Boolean
  }

  object SetTerminationProtectionInput {
    def apply(
      JobFlowIds: js.UndefOr[XmlStringList] = js.undefined,
      TerminationProtected: js.UndefOr[Boolean] = js.undefined
    ): SetTerminationProtectionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("JobFlowIds" -> JobFlowIds.map { x => x: js.Any }),
        ("TerminationProtected" -> TerminationProtected.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetTerminationProtectionInput]
    }
  }

  /**
   * <p>The input to the SetVisibleToAllUsers action.</p>
   */
  @js.native
  trait SetVisibleToAllUsersInput extends js.Object {
    var JobFlowIds: XmlStringList
    var VisibleToAllUsers: Boolean
  }

  object SetVisibleToAllUsersInput {
    def apply(
      JobFlowIds: js.UndefOr[XmlStringList] = js.undefined,
      VisibleToAllUsers: js.UndefOr[Boolean] = js.undefined
    ): SetVisibleToAllUsersInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("JobFlowIds" -> JobFlowIds.map { x => x: js.Any }),
        ("VisibleToAllUsers" -> VisibleToAllUsers.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetVisibleToAllUsersInput]
    }
  }

  /**
   * <p>Policy for customizing shrink operations. Allows configuration of decommissioning timeout and targeted instance shrinking.</p>
   */
  @js.native
  trait ShrinkPolicy extends js.Object {
    var DecommissionTimeout: Integer
    var InstanceResizePolicy: InstanceResizePolicy
  }

  object ShrinkPolicy {
    def apply(
      DecommissionTimeout: js.UndefOr[Integer] = js.undefined,
      InstanceResizePolicy: js.UndefOr[InstanceResizePolicy] = js.undefined
    ): ShrinkPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DecommissionTimeout" -> DecommissionTimeout.map { x => x: js.Any }),
        ("InstanceResizePolicy" -> InstanceResizePolicy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ShrinkPolicy]
    }
  }

  /**
   * <p>An automatic scaling configuration, which describes how the policy adds or removes instances, the cooldown period, and the number of EC2 instances that will be added each time the CloudWatch metric alarm condition is satisfied.</p>
   */
  @js.native
  trait SimpleScalingPolicyConfiguration extends js.Object {
    var AdjustmentType: AdjustmentType
    var ScalingAdjustment: Integer
    var CoolDown: Integer
  }

  object SimpleScalingPolicyConfiguration {
    def apply(
      AdjustmentType: js.UndefOr[AdjustmentType] = js.undefined,
      ScalingAdjustment: js.UndefOr[Integer] = js.undefined,
      CoolDown: js.UndefOr[Integer] = js.undefined
    ): SimpleScalingPolicyConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AdjustmentType" -> AdjustmentType.map { x => x: js.Any }),
        ("ScalingAdjustment" -> ScalingAdjustment.map { x => x: js.Any }),
        ("CoolDown" -> CoolDown.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SimpleScalingPolicyConfiguration]
    }
  }


  object StatisticEnum {
    val `SAMPLE_COUNT` = "SAMPLE_COUNT"
    val AVERAGE = "AVERAGE"
    val SUM = "SUM"
    val MINIMUM = "MINIMUM"
    val MAXIMUM = "MAXIMUM"

    val values = IndexedSeq(`SAMPLE_COUNT`, AVERAGE, SUM, MINIMUM, MAXIMUM)
  }

  /**
   * <p>This represents a step in a cluster.</p>
   */
  @js.native
  trait Step extends js.Object {
    var Id: StepId
    var ActionOnFailure: ActionOnFailure
    var Name: String
    var Config: HadoopStepConfig
    var Status: StepStatus
  }

  object Step {
    def apply(
      Id: js.UndefOr[StepId] = js.undefined,
      ActionOnFailure: js.UndefOr[ActionOnFailure] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      Config: js.UndefOr[HadoopStepConfig] = js.undefined,
      Status: js.UndefOr[StepStatus] = js.undefined
    ): Step = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("ActionOnFailure" -> ActionOnFailure.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("Config" -> Config.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Step]
    }
  }

  /**
   * <p>Specification of a job flow step.</p>
   */
  @js.native
  trait StepConfig extends js.Object {
    var Name: XmlStringMaxLen256
    var ActionOnFailure: ActionOnFailure
    var HadoopJarStep: HadoopJarStepConfig
  }

  object StepConfig {
    def apply(
      Name: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      ActionOnFailure: js.UndefOr[ActionOnFailure] = js.undefined,
      HadoopJarStep: js.UndefOr[HadoopJarStepConfig] = js.undefined
    ): StepConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("ActionOnFailure" -> ActionOnFailure.map { x => x: js.Any }),
        ("HadoopJarStep" -> HadoopJarStep.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepConfig]
    }
  }

  /**
   * <p>Combines the execution state and configuration of a step.</p>
   */
  @js.native
  trait StepDetail extends js.Object {
    var StepConfig: StepConfig
    var ExecutionStatusDetail: StepExecutionStatusDetail
  }

  object StepDetail {
    def apply(
      StepConfig: js.UndefOr[StepConfig] = js.undefined,
      ExecutionStatusDetail: js.UndefOr[StepExecutionStatusDetail] = js.undefined
    ): StepDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StepConfig" -> StepConfig.map { x => x: js.Any }),
        ("ExecutionStatusDetail" -> ExecutionStatusDetail.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepDetail]
    }
  }


  object StepExecutionStateEnum {
    val PENDING = "PENDING"
    val RUNNING = "RUNNING"
    val CONTINUE = "CONTINUE"
    val COMPLETED = "COMPLETED"
    val CANCELLED = "CANCELLED"
    val FAILED = "FAILED"
    val INTERRUPTED = "INTERRUPTED"

    val values = IndexedSeq(PENDING, RUNNING, CONTINUE, COMPLETED, CANCELLED, FAILED, INTERRUPTED)
  }

  /**
   * <p>The execution state of a step.</p>
   */
  @js.native
  trait StepExecutionStatusDetail extends js.Object {
    var LastStateChangeReason: XmlString
    var StartDateTime: Date
    var EndDateTime: Date
    var CreationDateTime: Date
    var State: StepExecutionState
  }

  object StepExecutionStatusDetail {
    def apply(
      LastStateChangeReason: js.UndefOr[XmlString] = js.undefined,
      StartDateTime: js.UndefOr[Date] = js.undefined,
      EndDateTime: js.UndefOr[Date] = js.undefined,
      CreationDateTime: js.UndefOr[Date] = js.undefined,
      State: js.UndefOr[StepExecutionState] = js.undefined
    ): StepExecutionStatusDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LastStateChangeReason" -> LastStateChangeReason.map { x => x: js.Any }),
        ("StartDateTime" -> StartDateTime.map { x => x: js.Any }),
        ("EndDateTime" -> EndDateTime.map { x => x: js.Any }),
        ("CreationDateTime" -> CreationDateTime.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepExecutionStatusDetail]
    }
  }


  object StepStateEnum {
    val PENDING = "PENDING"
    val `CANCEL_PENDING` = "CANCEL_PENDING"
    val RUNNING = "RUNNING"
    val COMPLETED = "COMPLETED"
    val CANCELLED = "CANCELLED"
    val FAILED = "FAILED"
    val INTERRUPTED = "INTERRUPTED"

    val values = IndexedSeq(PENDING, `CANCEL_PENDING`, RUNNING, COMPLETED, CANCELLED, FAILED, INTERRUPTED)
  }

  /**
   * <p>The details of the step state change reason.</p>
   */
  @js.native
  trait StepStateChangeReason extends js.Object {
    var Code: StepStateChangeReasonCode
    var Message: String
  }

  object StepStateChangeReason {
    def apply(
      Code: js.UndefOr[StepStateChangeReasonCode] = js.undefined,
      Message: js.UndefOr[String] = js.undefined
    ): StepStateChangeReason = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Code" -> Code.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepStateChangeReason]
    }
  }


  object StepStateChangeReasonCodeEnum {
    val NONE = "NONE"

    val values = IndexedSeq(NONE)
  }

  /**
   * <p>The execution status details of the cluster step.</p>
   */
  @js.native
  trait StepStatus extends js.Object {
    var State: StepState
    var StateChangeReason: StepStateChangeReason
    var FailureDetails: FailureDetails
    var Timeline: StepTimeline
  }

  object StepStatus {
    def apply(
      State: js.UndefOr[StepState] = js.undefined,
      StateChangeReason: js.UndefOr[StepStateChangeReason] = js.undefined,
      FailureDetails: js.UndefOr[FailureDetails] = js.undefined,
      Timeline: js.UndefOr[StepTimeline] = js.undefined
    ): StepStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("State" -> State.map { x => x: js.Any }),
        ("StateChangeReason" -> StateChangeReason.map { x => x: js.Any }),
        ("FailureDetails" -> FailureDetails.map { x => x: js.Any }),
        ("Timeline" -> Timeline.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepStatus]
    }
  }

  /**
   * <p>The summary of the cluster step.</p>
   */
  @js.native
  trait StepSummary extends js.Object {
    var Id: StepId
    var ActionOnFailure: ActionOnFailure
    var Name: String
    var Config: HadoopStepConfig
    var Status: StepStatus
  }

  object StepSummary {
    def apply(
      Id: js.UndefOr[StepId] = js.undefined,
      ActionOnFailure: js.UndefOr[ActionOnFailure] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      Config: js.UndefOr[HadoopStepConfig] = js.undefined,
      Status: js.UndefOr[StepStatus] = js.undefined
    ): StepSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("ActionOnFailure" -> ActionOnFailure.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("Config" -> Config.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepSummary]
    }
  }

  /**
   * <p>The timeline of the cluster step lifecycle.</p>
   */
  @js.native
  trait StepTimeline extends js.Object {
    var CreationDateTime: Date
    var StartDateTime: Date
    var EndDateTime: Date
  }

  object StepTimeline {
    def apply(
      CreationDateTime: js.UndefOr[Date] = js.undefined,
      StartDateTime: js.UndefOr[Date] = js.undefined,
      EndDateTime: js.UndefOr[Date] = js.undefined
    ): StepTimeline = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CreationDateTime" -> CreationDateTime.map { x => x: js.Any }),
        ("StartDateTime" -> StartDateTime.map { x => x: js.Any }),
        ("EndDateTime" -> EndDateTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepTimeline]
    }
  }

  /**
   * <p>The list of supported product configurations which allow user-supplied arguments. EMR accepts these arguments and forwards them to the corresponding installation script as bootstrap action arguments.</p>
   */
  @js.native
  trait SupportedProductConfig extends js.Object {
    var Name: XmlStringMaxLen256
    var Args: XmlStringList
  }

  object SupportedProductConfig {
    def apply(
      Name: js.UndefOr[XmlStringMaxLen256] = js.undefined,
      Args: js.UndefOr[XmlStringList] = js.undefined
    ): SupportedProductConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Args" -> Args.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SupportedProductConfig]
    }
  }

  /**
   * <p>A key/value pair containing user-defined metadata that you can associate with an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as grouping clusters to track your Amazon EMR resource allocation costs. For more information, see <a href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html">Tagging Amazon EMR Resources</a>. </p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: String
    var Value: String
  }

  object Tag {
    def apply(
      Key: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p> Input to the <a>TerminateJobFlows</a> operation. </p>
   */
  @js.native
  trait TerminateJobFlowsInput extends js.Object {
    var JobFlowIds: XmlStringList
  }

  object TerminateJobFlowsInput {
    def apply(
      JobFlowIds: js.UndefOr[XmlStringList] = js.undefined
    ): TerminateJobFlowsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("JobFlowIds" -> JobFlowIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateJobFlowsInput]
    }
  }


  object UnitEnum {
    val NONE = "NONE"
    val SECONDS = "SECONDS"
    val `MICRO_SECONDS` = "MICRO_SECONDS"
    val `MILLI_SECONDS` = "MILLI_SECONDS"
    val BYTES = "BYTES"
    val `KILO_BYTES` = "KILO_BYTES"
    val `MEGA_BYTES` = "MEGA_BYTES"
    val `GIGA_BYTES` = "GIGA_BYTES"
    val `TERA_BYTES` = "TERA_BYTES"
    val BITS = "BITS"
    val `KILO_BITS` = "KILO_BITS"
    val `MEGA_BITS` = "MEGA_BITS"
    val `GIGA_BITS` = "GIGA_BITS"
    val `TERA_BITS` = "TERA_BITS"
    val PERCENT = "PERCENT"
    val COUNT = "COUNT"
    val `BYTES_PER_SECOND` = "BYTES_PER_SECOND"
    val `KILO_BYTES_PER_SECOND` = "KILO_BYTES_PER_SECOND"
    val `MEGA_BYTES_PER_SECOND` = "MEGA_BYTES_PER_SECOND"
    val `GIGA_BYTES_PER_SECOND` = "GIGA_BYTES_PER_SECOND"
    val `TERA_BYTES_PER_SECOND` = "TERA_BYTES_PER_SECOND"
    val `BITS_PER_SECOND` = "BITS_PER_SECOND"
    val `KILO_BITS_PER_SECOND` = "KILO_BITS_PER_SECOND"
    val `MEGA_BITS_PER_SECOND` = "MEGA_BITS_PER_SECOND"
    val `GIGA_BITS_PER_SECOND` = "GIGA_BITS_PER_SECOND"
    val `TERA_BITS_PER_SECOND` = "TERA_BITS_PER_SECOND"
    val `COUNT_PER_SECOND` = "COUNT_PER_SECOND"

    val values = IndexedSeq(NONE, SECONDS, `MICRO_SECONDS`, `MILLI_SECONDS`, BYTES, `KILO_BYTES`, `MEGA_BYTES`, `GIGA_BYTES`, `TERA_BYTES`, BITS, `KILO_BITS`, `MEGA_BITS`, `GIGA_BITS`, `TERA_BITS`, PERCENT, COUNT, `BYTES_PER_SECOND`, `KILO_BYTES_PER_SECOND`, `MEGA_BYTES_PER_SECOND`, `GIGA_BYTES_PER_SECOND`, `TERA_BYTES_PER_SECOND`, `BITS_PER_SECOND`, `KILO_BITS_PER_SECOND`, `MEGA_BITS_PER_SECOND`, `GIGA_BITS_PER_SECOND`, `TERA_BITS_PER_SECOND`, `COUNT_PER_SECOND`)
  }

  /**
   * <p>EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested for the EBS volume attached to an EC2 instance in the cluster.</p>
   */
  @js.native
  trait VolumeSpecification extends js.Object {
    var VolumeType: String
    var Iops: Integer
    var SizeInGB: Integer
  }

  object VolumeSpecification {
    def apply(
      VolumeType: js.UndefOr[String] = js.undefined,
      Iops: js.UndefOr[Integer] = js.undefined,
      SizeInGB: js.UndefOr[Integer] = js.undefined
    ): VolumeSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeType" -> VolumeType.map { x => x: js.Any }),
        ("Iops" -> Iops.map { x => x: js.Any }),
        ("SizeInGB" -> SizeInGB.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeSpecification]
    }
  }
}
