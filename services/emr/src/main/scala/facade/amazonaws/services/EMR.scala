package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object emr {
  type ApplicationList = js.Array[Application]
  type ArnType = String
  type BooleanObject = Boolean
  type BootstrapActionConfigList = js.Array[BootstrapActionConfig]
  type BootstrapActionDetailList = js.Array[BootstrapActionDetail]
  type CancelStepsInfoList = js.Array[CancelStepsInfo]
  type ClusterId = String
  type ClusterStateList = js.Array[ClusterState]
  type ClusterSummaryList = js.Array[ClusterSummary]
  type CommandList = js.Array[Command]
  type ConfigurationList = js.Array[Configuration]
  type Date = js.Date
  type EC2InstanceIdsList = js.Array[InstanceId]
  type EC2InstanceIdsToTerminateList = js.Array[InstanceId]
  type EbsBlockDeviceConfigList = js.Array[EbsBlockDeviceConfig]
  type EbsBlockDeviceList = js.Array[EbsBlockDevice]
  type EbsVolumeList = js.Array[EbsVolume]
  type InstanceFleetConfigList = js.Array[InstanceFleetConfig]
  type InstanceFleetId = String
  type InstanceFleetList = js.Array[InstanceFleet]
  type InstanceGroupConfigList = js.Array[InstanceGroupConfig]
  type InstanceGroupDetailList = js.Array[InstanceGroupDetail]
  type InstanceGroupId = String
  type InstanceGroupIdsList = js.Array[XmlStringMaxLen256]
  type InstanceGroupList = js.Array[InstanceGroup]
  type InstanceGroupModifyConfigList = js.Array[InstanceGroupModifyConfig]
  type InstanceGroupTypeList = js.Array[InstanceGroupType]
  type InstanceId = String
  type InstanceList = js.Array[Instance]
  type InstanceStateList = js.Array[InstanceState]
  type InstanceType = String
  type InstanceTypeConfigList = js.Array[InstanceTypeConfig]
  type InstanceTypeSpecificationList = js.Array[InstanceTypeSpecification]
  type JobFlowDetailList = js.Array[JobFlowDetail]
  type JobFlowExecutionStateList = js.Array[JobFlowExecutionState]
  type KeyValueList = js.Array[KeyValue]
  type Marker = String
  type MetricDimensionList = js.Array[MetricDimension]
  type NewSupportedProductsList = js.Array[SupportedProductConfig]
  type NonNegativeDouble = Double
  type OptionalArnType = String
  type Port = Int
  type PortRanges = js.Array[PortRange]
  type ResourceId = String
  type ScalingRuleList = js.Array[ScalingRule]
  type SecurityConfigurationList = js.Array[SecurityConfigurationSummary]
  type SecurityGroupsList = js.Array[XmlStringMaxLen256]
  type StepConfigList = js.Array[StepConfig]
  type StepDetailList = js.Array[StepDetail]
  type StepId = String
  type StepIdsList = js.Array[XmlStringMaxLen256]
  type StepStateList = js.Array[StepState]
  type StepSummaryList = js.Array[StepSummary]
  type StringList = js.Array[String]
  type StringMap = js.Dictionary[String]
  type SupportedProductsList = js.Array[XmlStringMaxLen256]
  type TagList = js.Array[Tag]
  type WholeNumber = Int
  type XmlString = String
  type XmlStringList = js.Array[XmlString]
  type XmlStringMaxLen256 = String
  type XmlStringMaxLen256List = js.Array[XmlStringMaxLen256]

  implicit final class EMROps(private val service: EMR) extends AnyVal {

    @inline def addInstanceFleetFuture(params: AddInstanceFleetInput): Future[AddInstanceFleetOutput] = service.addInstanceFleet(params).promise().toFuture
    @inline def addInstanceGroupsFuture(params: AddInstanceGroupsInput): Future[AddInstanceGroupsOutput] = service.addInstanceGroups(params).promise().toFuture
    @inline def addJobFlowStepsFuture(params: AddJobFlowStepsInput): Future[AddJobFlowStepsOutput] = service.addJobFlowSteps(params).promise().toFuture
    @inline def addTagsFuture(params: AddTagsInput): Future[AddTagsOutput] = service.addTags(params).promise().toFuture
    @inline def cancelStepsFuture(params: CancelStepsInput): Future[CancelStepsOutput] = service.cancelSteps(params).promise().toFuture
    @inline def createSecurityConfigurationFuture(params: CreateSecurityConfigurationInput): Future[CreateSecurityConfigurationOutput] = service.createSecurityConfiguration(params).promise().toFuture
    @inline def deleteSecurityConfigurationFuture(params: DeleteSecurityConfigurationInput): Future[DeleteSecurityConfigurationOutput] = service.deleteSecurityConfiguration(params).promise().toFuture
    @inline def describeClusterFuture(params: DescribeClusterInput): Future[DescribeClusterOutput] = service.describeCluster(params).promise().toFuture
    @inline def describeSecurityConfigurationFuture(params: DescribeSecurityConfigurationInput): Future[DescribeSecurityConfigurationOutput] = service.describeSecurityConfiguration(params).promise().toFuture
    @inline def describeStepFuture(params: DescribeStepInput): Future[DescribeStepOutput] = service.describeStep(params).promise().toFuture
    @inline def getBlockPublicAccessConfigurationFuture(params: GetBlockPublicAccessConfigurationInput): Future[GetBlockPublicAccessConfigurationOutput] = service.getBlockPublicAccessConfiguration(params).promise().toFuture
    @inline def getManagedScalingPolicyFuture(params: GetManagedScalingPolicyInput): Future[GetManagedScalingPolicyOutput] = service.getManagedScalingPolicy(params).promise().toFuture
    @inline def listBootstrapActionsFuture(params: ListBootstrapActionsInput): Future[ListBootstrapActionsOutput] = service.listBootstrapActions(params).promise().toFuture
    @inline def listClustersFuture(params: ListClustersInput): Future[ListClustersOutput] = service.listClusters(params).promise().toFuture
    @inline def listInstanceFleetsFuture(params: ListInstanceFleetsInput): Future[ListInstanceFleetsOutput] = service.listInstanceFleets(params).promise().toFuture
    @inline def listInstanceGroupsFuture(params: ListInstanceGroupsInput): Future[ListInstanceGroupsOutput] = service.listInstanceGroups(params).promise().toFuture
    @inline def listInstancesFuture(params: ListInstancesInput): Future[ListInstancesOutput] = service.listInstances(params).promise().toFuture
    @inline def listSecurityConfigurationsFuture(params: ListSecurityConfigurationsInput): Future[ListSecurityConfigurationsOutput] = service.listSecurityConfigurations(params).promise().toFuture
    @inline def listStepsFuture(params: ListStepsInput): Future[ListStepsOutput] = service.listSteps(params).promise().toFuture
    @inline def modifyClusterFuture(params: ModifyClusterInput): Future[ModifyClusterOutput] = service.modifyCluster(params).promise().toFuture
    @inline def modifyInstanceFleetFuture(params: ModifyInstanceFleetInput): Future[js.Object] = service.modifyInstanceFleet(params).promise().toFuture
    @inline def modifyInstanceGroupsFuture(params: ModifyInstanceGroupsInput): Future[js.Object] = service.modifyInstanceGroups(params).promise().toFuture
    @inline def putAutoScalingPolicyFuture(params: PutAutoScalingPolicyInput): Future[PutAutoScalingPolicyOutput] = service.putAutoScalingPolicy(params).promise().toFuture
    @inline def putBlockPublicAccessConfigurationFuture(params: PutBlockPublicAccessConfigurationInput): Future[PutBlockPublicAccessConfigurationOutput] = service.putBlockPublicAccessConfiguration(params).promise().toFuture
    @inline def putManagedScalingPolicyFuture(params: PutManagedScalingPolicyInput): Future[PutManagedScalingPolicyOutput] = service.putManagedScalingPolicy(params).promise().toFuture
    @inline def removeAutoScalingPolicyFuture(params: RemoveAutoScalingPolicyInput): Future[RemoveAutoScalingPolicyOutput] = service.removeAutoScalingPolicy(params).promise().toFuture
    @inline def removeManagedScalingPolicyFuture(params: RemoveManagedScalingPolicyInput): Future[RemoveManagedScalingPolicyOutput] = service.removeManagedScalingPolicy(params).promise().toFuture
    @inline def removeTagsFuture(params: RemoveTagsInput): Future[RemoveTagsOutput] = service.removeTags(params).promise().toFuture
    @inline def runJobFlowFuture(params: RunJobFlowInput): Future[RunJobFlowOutput] = service.runJobFlow(params).promise().toFuture
    @inline def setTerminationProtectionFuture(params: SetTerminationProtectionInput): Future[js.Object] = service.setTerminationProtection(params).promise().toFuture
    @inline def setVisibleToAllUsersFuture(params: SetVisibleToAllUsersInput): Future[js.Object] = service.setVisibleToAllUsers(params).promise().toFuture
    @inline def terminateJobFlowsFuture(params: TerminateJobFlowsInput): Future[js.Object] = service.terminateJobFlows(params).promise().toFuture
  }
}

package emr {
  @js.native
  @JSImport("aws-sdk", "EMR", "AWS.EMR")
  class EMR() extends js.Object {
    def this(config: AWSConfig) = this()

    def addInstanceFleet(params: AddInstanceFleetInput): Request[AddInstanceFleetOutput] = js.native
    def addInstanceGroups(params: AddInstanceGroupsInput): Request[AddInstanceGroupsOutput] = js.native
    def addJobFlowSteps(params: AddJobFlowStepsInput): Request[AddJobFlowStepsOutput] = js.native
    def addTags(params: AddTagsInput): Request[AddTagsOutput] = js.native
    def cancelSteps(params: CancelStepsInput): Request[CancelStepsOutput] = js.native
    def createSecurityConfiguration(params: CreateSecurityConfigurationInput): Request[CreateSecurityConfigurationOutput] = js.native
    def deleteSecurityConfiguration(params: DeleteSecurityConfigurationInput): Request[DeleteSecurityConfigurationOutput] = js.native
    def describeCluster(params: DescribeClusterInput): Request[DescribeClusterOutput] = js.native
    def describeSecurityConfiguration(params: DescribeSecurityConfigurationInput): Request[DescribeSecurityConfigurationOutput] = js.native
    def describeStep(params: DescribeStepInput): Request[DescribeStepOutput] = js.native
    def getBlockPublicAccessConfiguration(params: GetBlockPublicAccessConfigurationInput): Request[GetBlockPublicAccessConfigurationOutput] = js.native
    def getManagedScalingPolicy(params: GetManagedScalingPolicyInput): Request[GetManagedScalingPolicyOutput] = js.native
    def listBootstrapActions(params: ListBootstrapActionsInput): Request[ListBootstrapActionsOutput] = js.native
    def listClusters(params: ListClustersInput): Request[ListClustersOutput] = js.native
    def listInstanceFleets(params: ListInstanceFleetsInput): Request[ListInstanceFleetsOutput] = js.native
    def listInstanceGroups(params: ListInstanceGroupsInput): Request[ListInstanceGroupsOutput] = js.native
    def listInstances(params: ListInstancesInput): Request[ListInstancesOutput] = js.native
    def listSecurityConfigurations(params: ListSecurityConfigurationsInput): Request[ListSecurityConfigurationsOutput] = js.native
    def listSteps(params: ListStepsInput): Request[ListStepsOutput] = js.native
    def modifyCluster(params: ModifyClusterInput): Request[ModifyClusterOutput] = js.native
    def modifyInstanceFleet(params: ModifyInstanceFleetInput): Request[js.Object] = js.native
    def modifyInstanceGroups(params: ModifyInstanceGroupsInput): Request[js.Object] = js.native
    def putAutoScalingPolicy(params: PutAutoScalingPolicyInput): Request[PutAutoScalingPolicyOutput] = js.native
    def putBlockPublicAccessConfiguration(params: PutBlockPublicAccessConfigurationInput): Request[PutBlockPublicAccessConfigurationOutput] = js.native
    def putManagedScalingPolicy(params: PutManagedScalingPolicyInput): Request[PutManagedScalingPolicyOutput] = js.native
    def removeAutoScalingPolicy(params: RemoveAutoScalingPolicyInput): Request[RemoveAutoScalingPolicyOutput] = js.native
    def removeManagedScalingPolicy(params: RemoveManagedScalingPolicyInput): Request[RemoveManagedScalingPolicyOutput] = js.native
    def removeTags(params: RemoveTagsInput): Request[RemoveTagsOutput] = js.native
    def runJobFlow(params: RunJobFlowInput): Request[RunJobFlowOutput] = js.native
    def setTerminationProtection(params: SetTerminationProtectionInput): Request[js.Object] = js.native
    def setVisibleToAllUsers(params: SetVisibleToAllUsersInput): Request[js.Object] = js.native
    def terminateJobFlows(params: TerminateJobFlowsInput): Request[js.Object] = js.native
    @deprecated("Deprecated in AWS SDK", "forever") def describeJobFlows(params: DescribeJobFlowsInput): Request[DescribeJobFlowsOutput] = js.native
  }

  @js.native
  sealed trait ActionOnFailure extends js.Any
  object ActionOnFailure extends js.Object {
    val TERMINATE_JOB_FLOW = "TERMINATE_JOB_FLOW".asInstanceOf[ActionOnFailure]
    val TERMINATE_CLUSTER = "TERMINATE_CLUSTER".asInstanceOf[ActionOnFailure]
    val CANCEL_AND_WAIT = "CANCEL_AND_WAIT".asInstanceOf[ActionOnFailure]
    val CONTINUE = "CONTINUE".asInstanceOf[ActionOnFailure]

    val values = js.Object.freeze(js.Array(TERMINATE_JOB_FLOW, TERMINATE_CLUSTER, CANCEL_AND_WAIT, CONTINUE))
  }

  @js.native
  trait AddInstanceFleetInput extends js.Object {
    var ClusterId: XmlStringMaxLen256
    var InstanceFleet: InstanceFleetConfig
  }

  object AddInstanceFleetInput {
    @inline
    def apply(
        ClusterId: XmlStringMaxLen256,
        InstanceFleet: InstanceFleetConfig
    ): AddInstanceFleetInput = {
      val __obj = js.Dynamic.literal(
        "ClusterId" -> ClusterId.asInstanceOf[js.Any],
        "InstanceFleet" -> InstanceFleet.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddInstanceFleetInput]
    }
  }

  @js.native
  trait AddInstanceFleetOutput extends js.Object {
    var ClusterArn: js.UndefOr[ArnType]
    var ClusterId: js.UndefOr[XmlStringMaxLen256]
    var InstanceFleetId: js.UndefOr[InstanceFleetId]
  }

  object AddInstanceFleetOutput {
    @inline
    def apply(
        ClusterArn: js.UndefOr[ArnType] = js.undefined,
        ClusterId: js.UndefOr[XmlStringMaxLen256] = js.undefined,
        InstanceFleetId: js.UndefOr[InstanceFleetId] = js.undefined
    ): AddInstanceFleetOutput = {
      val __obj = js.Dynamic.literal()
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      ClusterId.foreach(__v => __obj.updateDynamic("ClusterId")(__v.asInstanceOf[js.Any]))
      InstanceFleetId.foreach(__v => __obj.updateDynamic("InstanceFleetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddInstanceFleetOutput]
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
    @inline
    def apply(
        InstanceGroups: InstanceGroupConfigList,
        JobFlowId: XmlStringMaxLen256
    ): AddInstanceGroupsInput = {
      val __obj = js.Dynamic.literal(
        "InstanceGroups" -> InstanceGroups.asInstanceOf[js.Any],
        "JobFlowId" -> JobFlowId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddInstanceGroupsInput]
    }
  }

  /**
    * Output from an AddInstanceGroups call.
    */
  @js.native
  trait AddInstanceGroupsOutput extends js.Object {
    var ClusterArn: js.UndefOr[ArnType]
    var InstanceGroupIds: js.UndefOr[InstanceGroupIdsList]
    var JobFlowId: js.UndefOr[XmlStringMaxLen256]
  }

  object AddInstanceGroupsOutput {
    @inline
    def apply(
        ClusterArn: js.UndefOr[ArnType] = js.undefined,
        InstanceGroupIds: js.UndefOr[InstanceGroupIdsList] = js.undefined,
        JobFlowId: js.UndefOr[XmlStringMaxLen256] = js.undefined
    ): AddInstanceGroupsOutput = {
      val __obj = js.Dynamic.literal()
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      InstanceGroupIds.foreach(__v => __obj.updateDynamic("InstanceGroupIds")(__v.asInstanceOf[js.Any]))
      JobFlowId.foreach(__v => __obj.updateDynamic("JobFlowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddInstanceGroupsOutput]
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
    @inline
    def apply(
        JobFlowId: XmlStringMaxLen256,
        Steps: StepConfigList
    ): AddJobFlowStepsInput = {
      val __obj = js.Dynamic.literal(
        "JobFlowId" -> JobFlowId.asInstanceOf[js.Any],
        "Steps" -> Steps.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddJobFlowStepsInput]
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
    @inline
    def apply(
        StepIds: js.UndefOr[StepIdsList] = js.undefined
    ): AddJobFlowStepsOutput = {
      val __obj = js.Dynamic.literal()
      StepIds.foreach(__v => __obj.updateDynamic("StepIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddJobFlowStepsOutput]
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
    @inline
    def apply(
        ResourceId: ResourceId,
        Tags: TagList
    ): AddTagsInput = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddTagsInput]
    }
  }

  /**
    * This output indicates the result of adding tags to a resource.
    */
  @js.native
  trait AddTagsOutput extends js.Object {}

  object AddTagsOutput {
    @inline
    def apply(
    ): AddTagsOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AddTagsOutput]
    }
  }

  @js.native
  sealed trait AdjustmentType extends js.Any
  object AdjustmentType extends js.Object {
    val CHANGE_IN_CAPACITY = "CHANGE_IN_CAPACITY".asInstanceOf[AdjustmentType]
    val PERCENT_CHANGE_IN_CAPACITY = "PERCENT_CHANGE_IN_CAPACITY".asInstanceOf[AdjustmentType]
    val EXACT_CAPACITY = "EXACT_CAPACITY".asInstanceOf[AdjustmentType]

    val values = js.Object.freeze(js.Array(CHANGE_IN_CAPACITY, PERCENT_CHANGE_IN_CAPACITY, EXACT_CAPACITY))
  }

  /**
    * With Amazon EMR release version 4.0 and later, the only accepted parameter is the application name. To pass arguments to applications, you use configuration classifications specified using configuration JSON objects. For more information, see [[https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html|Configuring Applications]].
    *  With earlier Amazon EMR releases, the application is any Amazon or third-party software that you can add to the cluster. This structure contains a list of strings that indicates the software to use with the cluster and accepts a user argument list. Amazon EMR accepts and forwards the argument list to the corresponding installation script as bootstrap action argument.
    */
  @js.native
  trait Application extends js.Object {
    var AdditionalInfo: js.UndefOr[StringMap]
    var Args: js.UndefOr[StringList]
    var Name: js.UndefOr[String]
    var Version: js.UndefOr[String]
  }

  object Application {
    @inline
    def apply(
        AdditionalInfo: js.UndefOr[StringMap] = js.undefined,
        Args: js.UndefOr[StringList] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Version: js.UndefOr[String] = js.undefined
    ): Application = {
      val __obj = js.Dynamic.literal()
      AdditionalInfo.foreach(__v => __obj.updateDynamic("AdditionalInfo")(__v.asInstanceOf[js.Any]))
      Args.foreach(__v => __obj.updateDynamic("Args")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Application]
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
    @inline
    def apply(
        Constraints: ScalingConstraints,
        Rules: ScalingRuleList
    ): AutoScalingPolicy = {
      val __obj = js.Dynamic.literal(
        "Constraints" -> Constraints.asInstanceOf[js.Any],
        "Rules" -> Rules.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AutoScalingPolicy]
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
    @inline
    def apply(
        Constraints: js.UndefOr[ScalingConstraints] = js.undefined,
        Rules: js.UndefOr[ScalingRuleList] = js.undefined,
        Status: js.UndefOr[AutoScalingPolicyStatus] = js.undefined
    ): AutoScalingPolicyDescription = {
      val __obj = js.Dynamic.literal()
      Constraints.foreach(__v => __obj.updateDynamic("Constraints")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingPolicyDescription]
    }
  }

  @js.native
  sealed trait AutoScalingPolicyState extends js.Any
  object AutoScalingPolicyState extends js.Object {
    val PENDING = "PENDING".asInstanceOf[AutoScalingPolicyState]
    val ATTACHING = "ATTACHING".asInstanceOf[AutoScalingPolicyState]
    val ATTACHED = "ATTACHED".asInstanceOf[AutoScalingPolicyState]
    val DETACHING = "DETACHING".asInstanceOf[AutoScalingPolicyState]
    val DETACHED = "DETACHED".asInstanceOf[AutoScalingPolicyState]
    val FAILED = "FAILED".asInstanceOf[AutoScalingPolicyState]

    val values = js.Object.freeze(js.Array(PENDING, ATTACHING, ATTACHED, DETACHING, DETACHED, FAILED))
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
    @inline
    def apply(
        Code: js.UndefOr[AutoScalingPolicyStateChangeReasonCode] = js.undefined,
        Message: js.UndefOr[String] = js.undefined
    ): AutoScalingPolicyStateChangeReason = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingPolicyStateChangeReason]
    }
  }

  @js.native
  sealed trait AutoScalingPolicyStateChangeReasonCode extends js.Any
  object AutoScalingPolicyStateChangeReasonCode extends js.Object {
    val USER_REQUEST = "USER_REQUEST".asInstanceOf[AutoScalingPolicyStateChangeReasonCode]
    val PROVISION_FAILURE = "PROVISION_FAILURE".asInstanceOf[AutoScalingPolicyStateChangeReasonCode]
    val CLEANUP_FAILURE = "CLEANUP_FAILURE".asInstanceOf[AutoScalingPolicyStateChangeReasonCode]

    val values = js.Object.freeze(js.Array(USER_REQUEST, PROVISION_FAILURE, CLEANUP_FAILURE))
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
    @inline
    def apply(
        State: js.UndefOr[AutoScalingPolicyState] = js.undefined,
        StateChangeReason: js.UndefOr[AutoScalingPolicyStateChangeReason] = js.undefined
    ): AutoScalingPolicyStatus = {
      val __obj = js.Dynamic.literal()
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateChangeReason.foreach(__v => __obj.updateDynamic("StateChangeReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingPolicyStatus]
    }
  }

  /**
    * A configuration for Amazon EMR block public access. When <code>BlockPublicSecurityGroupRules</code> is set to <code>true</code>, Amazon EMR prevents cluster creation if one of the cluster's security groups has a rule that allows inbound traffic from 0.0.0.0/0 or ::/0 on a port, unless the port is specified as an exception using <code>PermittedPublicSecurityGroupRuleRanges</code>.
    */
  @js.native
  trait BlockPublicAccessConfiguration extends js.Object {
    var BlockPublicSecurityGroupRules: Boolean
    var PermittedPublicSecurityGroupRuleRanges: js.UndefOr[PortRanges]
  }

  object BlockPublicAccessConfiguration {
    @inline
    def apply(
        BlockPublicSecurityGroupRules: Boolean,
        PermittedPublicSecurityGroupRuleRanges: js.UndefOr[PortRanges] = js.undefined
    ): BlockPublicAccessConfiguration = {
      val __obj = js.Dynamic.literal(
        "BlockPublicSecurityGroupRules" -> BlockPublicSecurityGroupRules.asInstanceOf[js.Any]
      )

      PermittedPublicSecurityGroupRuleRanges.foreach(__v => __obj.updateDynamic("PermittedPublicSecurityGroupRuleRanges")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BlockPublicAccessConfiguration]
    }
  }

  /**
    * Properties that describe the AWS principal that created the <code>BlockPublicAccessConfiguration</code> using the <code>PutBlockPublicAccessConfiguration</code> action as well as the date and time that the configuration was created. Each time a configuration for block public access is updated, Amazon EMR updates this metadata.
    */
  @js.native
  trait BlockPublicAccessConfigurationMetadata extends js.Object {
    var CreatedByArn: ArnType
    var CreationDateTime: Date
  }

  object BlockPublicAccessConfigurationMetadata {
    @inline
    def apply(
        CreatedByArn: ArnType,
        CreationDateTime: Date
    ): BlockPublicAccessConfigurationMetadata = {
      val __obj = js.Dynamic.literal(
        "CreatedByArn" -> CreatedByArn.asInstanceOf[js.Any],
        "CreationDateTime" -> CreationDateTime.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BlockPublicAccessConfigurationMetadata]
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
    @inline
    def apply(
        Name: XmlStringMaxLen256,
        ScriptBootstrapAction: ScriptBootstrapActionConfig
    ): BootstrapActionConfig = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "ScriptBootstrapAction" -> ScriptBootstrapAction.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BootstrapActionConfig]
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
    @inline
    def apply(
        BootstrapActionConfig: js.UndefOr[BootstrapActionConfig] = js.undefined
    ): BootstrapActionDetail = {
      val __obj = js.Dynamic.literal()
      BootstrapActionConfig.foreach(__v => __obj.updateDynamic("BootstrapActionConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BootstrapActionDetail]
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
    @inline
    def apply(
        Reason: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[CancelStepsRequestStatus] = js.undefined,
        StepId: js.UndefOr[StepId] = js.undefined
    ): CancelStepsInfo = {
      val __obj = js.Dynamic.literal()
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StepId.foreach(__v => __obj.updateDynamic("StepId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelStepsInfo]
    }
  }

  /**
    * The input argument to the <a>CancelSteps</a> operation.
    */
  @js.native
  trait CancelStepsInput extends js.Object {
    var ClusterId: XmlStringMaxLen256
    var StepIds: StepIdsList
    var StepCancellationOption: js.UndefOr[StepCancellationOption]
  }

  object CancelStepsInput {
    @inline
    def apply(
        ClusterId: XmlStringMaxLen256,
        StepIds: StepIdsList,
        StepCancellationOption: js.UndefOr[StepCancellationOption] = js.undefined
    ): CancelStepsInput = {
      val __obj = js.Dynamic.literal(
        "ClusterId" -> ClusterId.asInstanceOf[js.Any],
        "StepIds" -> StepIds.asInstanceOf[js.Any]
      )

      StepCancellationOption.foreach(__v => __obj.updateDynamic("StepCancellationOption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelStepsInput]
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
    @inline
    def apply(
        CancelStepsInfoList: js.UndefOr[CancelStepsInfoList] = js.undefined
    ): CancelStepsOutput = {
      val __obj = js.Dynamic.literal()
      CancelStepsInfoList.foreach(__v => __obj.updateDynamic("CancelStepsInfoList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelStepsOutput]
    }
  }

  @js.native
  sealed trait CancelStepsRequestStatus extends js.Any
  object CancelStepsRequestStatus extends js.Object {
    val SUBMITTED = "SUBMITTED".asInstanceOf[CancelStepsRequestStatus]
    val FAILED = "FAILED".asInstanceOf[CancelStepsRequestStatus]

    val values = js.Object.freeze(js.Array(SUBMITTED, FAILED))
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
    @inline
    def apply(
        ComparisonOperator: ComparisonOperator,
        MetricName: String,
        Period: Int,
        Threshold: NonNegativeDouble,
        Dimensions: js.UndefOr[MetricDimensionList] = js.undefined,
        EvaluationPeriods: js.UndefOr[Int] = js.undefined,
        Namespace: js.UndefOr[String] = js.undefined,
        Statistic: js.UndefOr[Statistic] = js.undefined,
        Unit: js.UndefOr[Unit] = js.undefined
    ): CloudWatchAlarmDefinition = {
      val __obj = js.Dynamic.literal(
        "ComparisonOperator" -> ComparisonOperator.asInstanceOf[js.Any],
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Period" -> Period.asInstanceOf[js.Any],
        "Threshold" -> Threshold.asInstanceOf[js.Any]
      )

      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      EvaluationPeriods.foreach(__v => __obj.updateDynamic("EvaluationPeriods")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      Statistic.foreach(__v => __obj.updateDynamic("Statistic")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchAlarmDefinition]
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
    var ClusterArn: js.UndefOr[ArnType]
    var Configurations: js.UndefOr[ConfigurationList]
    var CustomAmiId: js.UndefOr[XmlStringMaxLen256]
    var EbsRootVolumeSize: js.UndefOr[Int]
    var Ec2InstanceAttributes: js.UndefOr[Ec2InstanceAttributes]
    var Id: js.UndefOr[ClusterId]
    var InstanceCollectionType: js.UndefOr[InstanceCollectionType]
    var KerberosAttributes: js.UndefOr[KerberosAttributes]
    var LogEncryptionKmsKeyId: js.UndefOr[String]
    var LogUri: js.UndefOr[String]
    var MasterPublicDnsName: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var NormalizedInstanceHours: js.UndefOr[Int]
    var OutpostArn: js.UndefOr[OptionalArnType]
    var ReleaseLabel: js.UndefOr[String]
    var RepoUpgradeOnBoot: js.UndefOr[RepoUpgradeOnBoot]
    var RequestedAmiVersion: js.UndefOr[String]
    var RunningAmiVersion: js.UndefOr[String]
    var ScaleDownBehavior: js.UndefOr[ScaleDownBehavior]
    var SecurityConfiguration: js.UndefOr[XmlString]
    var ServiceRole: js.UndefOr[String]
    var Status: js.UndefOr[ClusterStatus]
    var StepConcurrencyLevel: js.UndefOr[Int]
    var Tags: js.UndefOr[TagList]
    var TerminationProtected: js.UndefOr[Boolean]
    var VisibleToAllUsers: js.UndefOr[Boolean]
  }

  object Cluster {
    @inline
    def apply(
        Applications: js.UndefOr[ApplicationList] = js.undefined,
        AutoScalingRole: js.UndefOr[XmlString] = js.undefined,
        AutoTerminate: js.UndefOr[Boolean] = js.undefined,
        ClusterArn: js.UndefOr[ArnType] = js.undefined,
        Configurations: js.UndefOr[ConfigurationList] = js.undefined,
        CustomAmiId: js.UndefOr[XmlStringMaxLen256] = js.undefined,
        EbsRootVolumeSize: js.UndefOr[Int] = js.undefined,
        Ec2InstanceAttributes: js.UndefOr[Ec2InstanceAttributes] = js.undefined,
        Id: js.UndefOr[ClusterId] = js.undefined,
        InstanceCollectionType: js.UndefOr[InstanceCollectionType] = js.undefined,
        KerberosAttributes: js.UndefOr[KerberosAttributes] = js.undefined,
        LogEncryptionKmsKeyId: js.UndefOr[String] = js.undefined,
        LogUri: js.UndefOr[String] = js.undefined,
        MasterPublicDnsName: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        NormalizedInstanceHours: js.UndefOr[Int] = js.undefined,
        OutpostArn: js.UndefOr[OptionalArnType] = js.undefined,
        ReleaseLabel: js.UndefOr[String] = js.undefined,
        RepoUpgradeOnBoot: js.UndefOr[RepoUpgradeOnBoot] = js.undefined,
        RequestedAmiVersion: js.UndefOr[String] = js.undefined,
        RunningAmiVersion: js.UndefOr[String] = js.undefined,
        ScaleDownBehavior: js.UndefOr[ScaleDownBehavior] = js.undefined,
        SecurityConfiguration: js.UndefOr[XmlString] = js.undefined,
        ServiceRole: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[ClusterStatus] = js.undefined,
        StepConcurrencyLevel: js.UndefOr[Int] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TerminationProtected: js.UndefOr[Boolean] = js.undefined,
        VisibleToAllUsers: js.UndefOr[Boolean] = js.undefined
    ): Cluster = {
      val __obj = js.Dynamic.literal()
      Applications.foreach(__v => __obj.updateDynamic("Applications")(__v.asInstanceOf[js.Any]))
      AutoScalingRole.foreach(__v => __obj.updateDynamic("AutoScalingRole")(__v.asInstanceOf[js.Any]))
      AutoTerminate.foreach(__v => __obj.updateDynamic("AutoTerminate")(__v.asInstanceOf[js.Any]))
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      Configurations.foreach(__v => __obj.updateDynamic("Configurations")(__v.asInstanceOf[js.Any]))
      CustomAmiId.foreach(__v => __obj.updateDynamic("CustomAmiId")(__v.asInstanceOf[js.Any]))
      EbsRootVolumeSize.foreach(__v => __obj.updateDynamic("EbsRootVolumeSize")(__v.asInstanceOf[js.Any]))
      Ec2InstanceAttributes.foreach(__v => __obj.updateDynamic("Ec2InstanceAttributes")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InstanceCollectionType.foreach(__v => __obj.updateDynamic("InstanceCollectionType")(__v.asInstanceOf[js.Any]))
      KerberosAttributes.foreach(__v => __obj.updateDynamic("KerberosAttributes")(__v.asInstanceOf[js.Any]))
      LogEncryptionKmsKeyId.foreach(__v => __obj.updateDynamic("LogEncryptionKmsKeyId")(__v.asInstanceOf[js.Any]))
      LogUri.foreach(__v => __obj.updateDynamic("LogUri")(__v.asInstanceOf[js.Any]))
      MasterPublicDnsName.foreach(__v => __obj.updateDynamic("MasterPublicDnsName")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NormalizedInstanceHours.foreach(__v => __obj.updateDynamic("NormalizedInstanceHours")(__v.asInstanceOf[js.Any]))
      OutpostArn.foreach(__v => __obj.updateDynamic("OutpostArn")(__v.asInstanceOf[js.Any]))
      ReleaseLabel.foreach(__v => __obj.updateDynamic("ReleaseLabel")(__v.asInstanceOf[js.Any]))
      RepoUpgradeOnBoot.foreach(__v => __obj.updateDynamic("RepoUpgradeOnBoot")(__v.asInstanceOf[js.Any]))
      RequestedAmiVersion.foreach(__v => __obj.updateDynamic("RequestedAmiVersion")(__v.asInstanceOf[js.Any]))
      RunningAmiVersion.foreach(__v => __obj.updateDynamic("RunningAmiVersion")(__v.asInstanceOf[js.Any]))
      ScaleDownBehavior.foreach(__v => __obj.updateDynamic("ScaleDownBehavior")(__v.asInstanceOf[js.Any]))
      SecurityConfiguration.foreach(__v => __obj.updateDynamic("SecurityConfiguration")(__v.asInstanceOf[js.Any]))
      ServiceRole.foreach(__v => __obj.updateDynamic("ServiceRole")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StepConcurrencyLevel.foreach(__v => __obj.updateDynamic("StepConcurrencyLevel")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TerminationProtected.foreach(__v => __obj.updateDynamic("TerminationProtected")(__v.asInstanceOf[js.Any]))
      VisibleToAllUsers.foreach(__v => __obj.updateDynamic("VisibleToAllUsers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Cluster]
    }
  }

  @js.native
  sealed trait ClusterState extends js.Any
  object ClusterState extends js.Object {
    val STARTING = "STARTING".asInstanceOf[ClusterState]
    val BOOTSTRAPPING = "BOOTSTRAPPING".asInstanceOf[ClusterState]
    val RUNNING = "RUNNING".asInstanceOf[ClusterState]
    val WAITING = "WAITING".asInstanceOf[ClusterState]
    val TERMINATING = "TERMINATING".asInstanceOf[ClusterState]
    val TERMINATED = "TERMINATED".asInstanceOf[ClusterState]
    val TERMINATED_WITH_ERRORS = "TERMINATED_WITH_ERRORS".asInstanceOf[ClusterState]

    val values = js.Object.freeze(js.Array(STARTING, BOOTSTRAPPING, RUNNING, WAITING, TERMINATING, TERMINATED, TERMINATED_WITH_ERRORS))
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
    @inline
    def apply(
        Code: js.UndefOr[ClusterStateChangeReasonCode] = js.undefined,
        Message: js.UndefOr[String] = js.undefined
    ): ClusterStateChangeReason = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterStateChangeReason]
    }
  }

  @js.native
  sealed trait ClusterStateChangeReasonCode extends js.Any
  object ClusterStateChangeReasonCode extends js.Object {
    val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[ClusterStateChangeReasonCode]
    val VALIDATION_ERROR = "VALIDATION_ERROR".asInstanceOf[ClusterStateChangeReasonCode]
    val INSTANCE_FAILURE = "INSTANCE_FAILURE".asInstanceOf[ClusterStateChangeReasonCode]
    val INSTANCE_FLEET_TIMEOUT = "INSTANCE_FLEET_TIMEOUT".asInstanceOf[ClusterStateChangeReasonCode]
    val BOOTSTRAP_FAILURE = "BOOTSTRAP_FAILURE".asInstanceOf[ClusterStateChangeReasonCode]
    val USER_REQUEST = "USER_REQUEST".asInstanceOf[ClusterStateChangeReasonCode]
    val STEP_FAILURE = "STEP_FAILURE".asInstanceOf[ClusterStateChangeReasonCode]
    val ALL_STEPS_COMPLETED = "ALL_STEPS_COMPLETED".asInstanceOf[ClusterStateChangeReasonCode]

    val values = js.Object.freeze(js.Array(INTERNAL_ERROR, VALIDATION_ERROR, INSTANCE_FAILURE, INSTANCE_FLEET_TIMEOUT, BOOTSTRAP_FAILURE, USER_REQUEST, STEP_FAILURE, ALL_STEPS_COMPLETED))
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
    @inline
    def apply(
        State: js.UndefOr[ClusterState] = js.undefined,
        StateChangeReason: js.UndefOr[ClusterStateChangeReason] = js.undefined,
        Timeline: js.UndefOr[ClusterTimeline] = js.undefined
    ): ClusterStatus = {
      val __obj = js.Dynamic.literal()
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateChangeReason.foreach(__v => __obj.updateDynamic("StateChangeReason")(__v.asInstanceOf[js.Any]))
      Timeline.foreach(__v => __obj.updateDynamic("Timeline")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterStatus]
    }
  }

  /**
    * The summary description of the cluster.
    */
  @js.native
  trait ClusterSummary extends js.Object {
    var ClusterArn: js.UndefOr[ArnType]
    var Id: js.UndefOr[ClusterId]
    var Name: js.UndefOr[String]
    var NormalizedInstanceHours: js.UndefOr[Int]
    var OutpostArn: js.UndefOr[OptionalArnType]
    var Status: js.UndefOr[ClusterStatus]
  }

  object ClusterSummary {
    @inline
    def apply(
        ClusterArn: js.UndefOr[ArnType] = js.undefined,
        Id: js.UndefOr[ClusterId] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        NormalizedInstanceHours: js.UndefOr[Int] = js.undefined,
        OutpostArn: js.UndefOr[OptionalArnType] = js.undefined,
        Status: js.UndefOr[ClusterStatus] = js.undefined
    ): ClusterSummary = {
      val __obj = js.Dynamic.literal()
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NormalizedInstanceHours.foreach(__v => __obj.updateDynamic("NormalizedInstanceHours")(__v.asInstanceOf[js.Any]))
      OutpostArn.foreach(__v => __obj.updateDynamic("OutpostArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterSummary]
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
    @inline
    def apply(
        CreationDateTime: js.UndefOr[Date] = js.undefined,
        EndDateTime: js.UndefOr[Date] = js.undefined,
        ReadyDateTime: js.UndefOr[Date] = js.undefined
    ): ClusterTimeline = {
      val __obj = js.Dynamic.literal()
      CreationDateTime.foreach(__v => __obj.updateDynamic("CreationDateTime")(__v.asInstanceOf[js.Any]))
      EndDateTime.foreach(__v => __obj.updateDynamic("EndDateTime")(__v.asInstanceOf[js.Any]))
      ReadyDateTime.foreach(__v => __obj.updateDynamic("ReadyDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterTimeline]
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
    @inline
    def apply(
        Args: js.UndefOr[StringList] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        ScriptPath: js.UndefOr[String] = js.undefined
    ): Command = {
      val __obj = js.Dynamic.literal()
      Args.foreach(__v => __obj.updateDynamic("Args")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ScriptPath.foreach(__v => __obj.updateDynamic("ScriptPath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Command]
    }
  }

  @js.native
  sealed trait ComparisonOperator extends js.Any
  object ComparisonOperator extends js.Object {
    val GREATER_THAN_OR_EQUAL = "GREATER_THAN_OR_EQUAL".asInstanceOf[ComparisonOperator]
    val GREATER_THAN = "GREATER_THAN".asInstanceOf[ComparisonOperator]
    val LESS_THAN = "LESS_THAN".asInstanceOf[ComparisonOperator]
    val LESS_THAN_OR_EQUAL = "LESS_THAN_OR_EQUAL".asInstanceOf[ComparisonOperator]

    val values = js.Object.freeze(js.Array(GREATER_THAN_OR_EQUAL, GREATER_THAN, LESS_THAN, LESS_THAN_OR_EQUAL))
  }

  /**
    * The EC2 unit limits for a managed scaling policy. The managed scaling activity of a cluster can not be above or below these limits. The limit only applies to the core and task nodes. The master node cannot be scaled after initial configuration.
    */
  @js.native
  trait ComputeLimits extends js.Object {
    var MaximumCapacityUnits: Int
    var MinimumCapacityUnits: Int
    var UnitType: ComputeLimitsUnitType
    var MaximumCoreCapacityUnits: js.UndefOr[Int]
    var MaximumOnDemandCapacityUnits: js.UndefOr[Int]
  }

  object ComputeLimits {
    @inline
    def apply(
        MaximumCapacityUnits: Int,
        MinimumCapacityUnits: Int,
        UnitType: ComputeLimitsUnitType,
        MaximumCoreCapacityUnits: js.UndefOr[Int] = js.undefined,
        MaximumOnDemandCapacityUnits: js.UndefOr[Int] = js.undefined
    ): ComputeLimits = {
      val __obj = js.Dynamic.literal(
        "MaximumCapacityUnits" -> MaximumCapacityUnits.asInstanceOf[js.Any],
        "MinimumCapacityUnits" -> MinimumCapacityUnits.asInstanceOf[js.Any],
        "UnitType" -> UnitType.asInstanceOf[js.Any]
      )

      MaximumCoreCapacityUnits.foreach(__v => __obj.updateDynamic("MaximumCoreCapacityUnits")(__v.asInstanceOf[js.Any]))
      MaximumOnDemandCapacityUnits.foreach(__v => __obj.updateDynamic("MaximumOnDemandCapacityUnits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComputeLimits]
    }
  }

  @js.native
  sealed trait ComputeLimitsUnitType extends js.Any
  object ComputeLimitsUnitType extends js.Object {
    val InstanceFleetUnits = "InstanceFleetUnits".asInstanceOf[ComputeLimitsUnitType]
    val Instances = "Instances".asInstanceOf[ComputeLimitsUnitType]
    val VCPU = "VCPU".asInstanceOf[ComputeLimitsUnitType]

    val values = js.Object.freeze(js.Array(InstanceFleetUnits, Instances, VCPU))
  }

  /**
    * '''Note:'''Amazon EMR releases 4.x or later.
    * An optional configuration specification to be used when provisioning cluster instances, which can include configurations for applications and software bundled with Amazon EMR. A configuration consists of a classification, properties, and optional nested configurations. A classification refers to an application-specific configuration file. Properties are the settings you want to change in that file. For more information, see [[https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html|Configuring Applications]].
    */
  @js.native
  trait Configuration extends js.Object {
    var Classification: js.UndefOr[String]
    var Configurations: js.UndefOr[ConfigurationList]
    var Properties: js.UndefOr[StringMap]
  }

  object Configuration {
    @inline
    def apply(
        Classification: js.UndefOr[String] = js.undefined,
        Configurations: js.UndefOr[ConfigurationList] = js.undefined,
        Properties: js.UndefOr[StringMap] = js.undefined
    ): Configuration = {
      val __obj = js.Dynamic.literal()
      Classification.foreach(__v => __obj.updateDynamic("Classification")(__v.asInstanceOf[js.Any]))
      Configurations.foreach(__v => __obj.updateDynamic("Configurations")(__v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.updateDynamic("Properties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Configuration]
    }
  }

  @js.native
  trait CreateSecurityConfigurationInput extends js.Object {
    var Name: XmlString
    var SecurityConfiguration: String
  }

  object CreateSecurityConfigurationInput {
    @inline
    def apply(
        Name: XmlString,
        SecurityConfiguration: String
    ): CreateSecurityConfigurationInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "SecurityConfiguration" -> SecurityConfiguration.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateSecurityConfigurationInput]
    }
  }

  @js.native
  trait CreateSecurityConfigurationOutput extends js.Object {
    var CreationDateTime: Date
    var Name: XmlString
  }

  object CreateSecurityConfigurationOutput {
    @inline
    def apply(
        CreationDateTime: Date,
        Name: XmlString
    ): CreateSecurityConfigurationOutput = {
      val __obj = js.Dynamic.literal(
        "CreationDateTime" -> CreationDateTime.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateSecurityConfigurationOutput]
    }
  }

  @js.native
  trait DeleteSecurityConfigurationInput extends js.Object {
    var Name: XmlString
  }

  object DeleteSecurityConfigurationInput {
    @inline
    def apply(
        Name: XmlString
    ): DeleteSecurityConfigurationInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSecurityConfigurationInput]
    }
  }

  @js.native
  trait DeleteSecurityConfigurationOutput extends js.Object {}

  object DeleteSecurityConfigurationOutput {
    @inline
    def apply(
    ): DeleteSecurityConfigurationOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteSecurityConfigurationOutput]
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
    @inline
    def apply(
        ClusterId: ClusterId
    ): DescribeClusterInput = {
      val __obj = js.Dynamic.literal(
        "ClusterId" -> ClusterId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeClusterInput]
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
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): DescribeClusterOutput = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClusterOutput]
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
    @inline
    def apply(
        CreatedAfter: js.UndefOr[Date] = js.undefined,
        CreatedBefore: js.UndefOr[Date] = js.undefined,
        JobFlowIds: js.UndefOr[XmlStringList] = js.undefined,
        JobFlowStates: js.UndefOr[JobFlowExecutionStateList] = js.undefined
    ): DescribeJobFlowsInput = {
      val __obj = js.Dynamic.literal()
      CreatedAfter.foreach(__v => __obj.updateDynamic("CreatedAfter")(__v.asInstanceOf[js.Any]))
      CreatedBefore.foreach(__v => __obj.updateDynamic("CreatedBefore")(__v.asInstanceOf[js.Any]))
      JobFlowIds.foreach(__v => __obj.updateDynamic("JobFlowIds")(__v.asInstanceOf[js.Any]))
      JobFlowStates.foreach(__v => __obj.updateDynamic("JobFlowStates")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobFlowsInput]
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
    @inline
    def apply(
        JobFlows: js.UndefOr[JobFlowDetailList] = js.undefined
    ): DescribeJobFlowsOutput = {
      val __obj = js.Dynamic.literal()
      JobFlows.foreach(__v => __obj.updateDynamic("JobFlows")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobFlowsOutput]
    }
  }

  @js.native
  trait DescribeSecurityConfigurationInput extends js.Object {
    var Name: XmlString
  }

  object DescribeSecurityConfigurationInput {
    @inline
    def apply(
        Name: XmlString
    ): DescribeSecurityConfigurationInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeSecurityConfigurationInput]
    }
  }

  @js.native
  trait DescribeSecurityConfigurationOutput extends js.Object {
    var CreationDateTime: js.UndefOr[Date]
    var Name: js.UndefOr[XmlString]
    var SecurityConfiguration: js.UndefOr[String]
  }

  object DescribeSecurityConfigurationOutput {
    @inline
    def apply(
        CreationDateTime: js.UndefOr[Date] = js.undefined,
        Name: js.UndefOr[XmlString] = js.undefined,
        SecurityConfiguration: js.UndefOr[String] = js.undefined
    ): DescribeSecurityConfigurationOutput = {
      val __obj = js.Dynamic.literal()
      CreationDateTime.foreach(__v => __obj.updateDynamic("CreationDateTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SecurityConfiguration.foreach(__v => __obj.updateDynamic("SecurityConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSecurityConfigurationOutput]
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
    @inline
    def apply(
        ClusterId: ClusterId,
        StepId: StepId
    ): DescribeStepInput = {
      val __obj = js.Dynamic.literal(
        "ClusterId" -> ClusterId.asInstanceOf[js.Any],
        "StepId" -> StepId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeStepInput]
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
    @inline
    def apply(
        Step: js.UndefOr[Step] = js.undefined
    ): DescribeStepOutput = {
      val __obj = js.Dynamic.literal()
      Step.foreach(__v => __obj.updateDynamic("Step")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStepOutput]
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
    @inline
    def apply(
        Device: js.UndefOr[String] = js.undefined,
        VolumeSpecification: js.UndefOr[VolumeSpecification] = js.undefined
    ): EbsBlockDevice = {
      val __obj = js.Dynamic.literal()
      Device.foreach(__v => __obj.updateDynamic("Device")(__v.asInstanceOf[js.Any]))
      VolumeSpecification.foreach(__v => __obj.updateDynamic("VolumeSpecification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EbsBlockDevice]
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
    @inline
    def apply(
        VolumeSpecification: VolumeSpecification,
        VolumesPerInstance: js.UndefOr[Int] = js.undefined
    ): EbsBlockDeviceConfig = {
      val __obj = js.Dynamic.literal(
        "VolumeSpecification" -> VolumeSpecification.asInstanceOf[js.Any]
      )

      VolumesPerInstance.foreach(__v => __obj.updateDynamic("VolumesPerInstance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EbsBlockDeviceConfig]
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
    @inline
    def apply(
        EbsBlockDeviceConfigs: js.UndefOr[EbsBlockDeviceConfigList] = js.undefined,
        EbsOptimized: js.UndefOr[BooleanObject] = js.undefined
    ): EbsConfiguration = {
      val __obj = js.Dynamic.literal()
      EbsBlockDeviceConfigs.foreach(__v => __obj.updateDynamic("EbsBlockDeviceConfigs")(__v.asInstanceOf[js.Any]))
      EbsOptimized.foreach(__v => __obj.updateDynamic("EbsOptimized")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EbsConfiguration]
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
    @inline
    def apply(
        Device: js.UndefOr[String] = js.undefined,
        VolumeId: js.UndefOr[String] = js.undefined
    ): EbsVolume = {
      val __obj = js.Dynamic.literal()
      Device.foreach(__v => __obj.updateDynamic("Device")(__v.asInstanceOf[js.Any]))
      VolumeId.foreach(__v => __obj.updateDynamic("VolumeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EbsVolume]
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
    @inline
    def apply(
        AdditionalMasterSecurityGroups: js.UndefOr[StringList] = js.undefined,
        AdditionalSlaveSecurityGroups: js.UndefOr[StringList] = js.undefined,
        Ec2AvailabilityZone: js.UndefOr[String] = js.undefined,
        Ec2KeyName: js.UndefOr[String] = js.undefined,
        Ec2SubnetId: js.UndefOr[String] = js.undefined,
        EmrManagedMasterSecurityGroup: js.UndefOr[String] = js.undefined,
        EmrManagedSlaveSecurityGroup: js.UndefOr[String] = js.undefined,
        IamInstanceProfile: js.UndefOr[String] = js.undefined,
        RequestedEc2AvailabilityZones: js.UndefOr[XmlStringMaxLen256List] = js.undefined,
        RequestedEc2SubnetIds: js.UndefOr[XmlStringMaxLen256List] = js.undefined,
        ServiceAccessSecurityGroup: js.UndefOr[String] = js.undefined
    ): Ec2InstanceAttributes = {
      val __obj = js.Dynamic.literal()
      AdditionalMasterSecurityGroups.foreach(__v => __obj.updateDynamic("AdditionalMasterSecurityGroups")(__v.asInstanceOf[js.Any]))
      AdditionalSlaveSecurityGroups.foreach(__v => __obj.updateDynamic("AdditionalSlaveSecurityGroups")(__v.asInstanceOf[js.Any]))
      Ec2AvailabilityZone.foreach(__v => __obj.updateDynamic("Ec2AvailabilityZone")(__v.asInstanceOf[js.Any]))
      Ec2KeyName.foreach(__v => __obj.updateDynamic("Ec2KeyName")(__v.asInstanceOf[js.Any]))
      Ec2SubnetId.foreach(__v => __obj.updateDynamic("Ec2SubnetId")(__v.asInstanceOf[js.Any]))
      EmrManagedMasterSecurityGroup.foreach(__v => __obj.updateDynamic("EmrManagedMasterSecurityGroup")(__v.asInstanceOf[js.Any]))
      EmrManagedSlaveSecurityGroup.foreach(__v => __obj.updateDynamic("EmrManagedSlaveSecurityGroup")(__v.asInstanceOf[js.Any]))
      IamInstanceProfile.foreach(__v => __obj.updateDynamic("IamInstanceProfile")(__v.asInstanceOf[js.Any]))
      RequestedEc2AvailabilityZones.foreach(__v => __obj.updateDynamic("RequestedEc2AvailabilityZones")(__v.asInstanceOf[js.Any]))
      RequestedEc2SubnetIds.foreach(__v => __obj.updateDynamic("RequestedEc2SubnetIds")(__v.asInstanceOf[js.Any]))
      ServiceAccessSecurityGroup.foreach(__v => __obj.updateDynamic("ServiceAccessSecurityGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Ec2InstanceAttributes]
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
    @inline
    def apply(
        LogFile: js.UndefOr[String] = js.undefined,
        Message: js.UndefOr[String] = js.undefined,
        Reason: js.UndefOr[String] = js.undefined
    ): FailureDetails = {
      val __obj = js.Dynamic.literal()
      LogFile.foreach(__v => __obj.updateDynamic("LogFile")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailureDetails]
    }
  }

  @js.native
  trait GetBlockPublicAccessConfigurationInput extends js.Object {}

  object GetBlockPublicAccessConfigurationInput {
    @inline
    def apply(
    ): GetBlockPublicAccessConfigurationInput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[GetBlockPublicAccessConfigurationInput]
    }
  }

  @js.native
  trait GetBlockPublicAccessConfigurationOutput extends js.Object {
    var BlockPublicAccessConfiguration: BlockPublicAccessConfiguration
    var BlockPublicAccessConfigurationMetadata: BlockPublicAccessConfigurationMetadata
  }

  object GetBlockPublicAccessConfigurationOutput {
    @inline
    def apply(
        BlockPublicAccessConfiguration: BlockPublicAccessConfiguration,
        BlockPublicAccessConfigurationMetadata: BlockPublicAccessConfigurationMetadata
    ): GetBlockPublicAccessConfigurationOutput = {
      val __obj = js.Dynamic.literal(
        "BlockPublicAccessConfiguration" -> BlockPublicAccessConfiguration.asInstanceOf[js.Any],
        "BlockPublicAccessConfigurationMetadata" -> BlockPublicAccessConfigurationMetadata.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBlockPublicAccessConfigurationOutput]
    }
  }

  @js.native
  trait GetManagedScalingPolicyInput extends js.Object {
    var ClusterId: ClusterId
  }

  object GetManagedScalingPolicyInput {
    @inline
    def apply(
        ClusterId: ClusterId
    ): GetManagedScalingPolicyInput = {
      val __obj = js.Dynamic.literal(
        "ClusterId" -> ClusterId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetManagedScalingPolicyInput]
    }
  }

  @js.native
  trait GetManagedScalingPolicyOutput extends js.Object {
    var ManagedScalingPolicy: js.UndefOr[ManagedScalingPolicy]
  }

  object GetManagedScalingPolicyOutput {
    @inline
    def apply(
        ManagedScalingPolicy: js.UndefOr[ManagedScalingPolicy] = js.undefined
    ): GetManagedScalingPolicyOutput = {
      val __obj = js.Dynamic.literal()
      ManagedScalingPolicy.foreach(__v => __obj.updateDynamic("ManagedScalingPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetManagedScalingPolicyOutput]
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
    @inline
    def apply(
        Jar: XmlString,
        Args: js.UndefOr[XmlStringList] = js.undefined,
        MainClass: js.UndefOr[XmlString] = js.undefined,
        Properties: js.UndefOr[KeyValueList] = js.undefined
    ): HadoopJarStepConfig = {
      val __obj = js.Dynamic.literal(
        "Jar" -> Jar.asInstanceOf[js.Any]
      )

      Args.foreach(__v => __obj.updateDynamic("Args")(__v.asInstanceOf[js.Any]))
      MainClass.foreach(__v => __obj.updateDynamic("MainClass")(__v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.updateDynamic("Properties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HadoopJarStepConfig]
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
    @inline
    def apply(
        Args: js.UndefOr[StringList] = js.undefined,
        Jar: js.UndefOr[String] = js.undefined,
        MainClass: js.UndefOr[String] = js.undefined,
        Properties: js.UndefOr[StringMap] = js.undefined
    ): HadoopStepConfig = {
      val __obj = js.Dynamic.literal()
      Args.foreach(__v => __obj.updateDynamic("Args")(__v.asInstanceOf[js.Any]))
      Jar.foreach(__v => __obj.updateDynamic("Jar")(__v.asInstanceOf[js.Any]))
      MainClass.foreach(__v => __obj.updateDynamic("MainClass")(__v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.updateDynamic("Properties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HadoopStepConfig]
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
    @inline
    def apply(
        EbsVolumes: js.UndefOr[EbsVolumeList] = js.undefined,
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
        Status: js.UndefOr[InstanceStatus] = js.undefined
    ): Instance = {
      val __obj = js.Dynamic.literal()
      EbsVolumes.foreach(__v => __obj.updateDynamic("EbsVolumes")(__v.asInstanceOf[js.Any]))
      Ec2InstanceId.foreach(__v => __obj.updateDynamic("Ec2InstanceId")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InstanceFleetId.foreach(__v => __obj.updateDynamic("InstanceFleetId")(__v.asInstanceOf[js.Any]))
      InstanceGroupId.foreach(__v => __obj.updateDynamic("InstanceGroupId")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      Market.foreach(__v => __obj.updateDynamic("Market")(__v.asInstanceOf[js.Any]))
      PrivateDnsName.foreach(__v => __obj.updateDynamic("PrivateDnsName")(__v.asInstanceOf[js.Any]))
      PrivateIpAddress.foreach(__v => __obj.updateDynamic("PrivateIpAddress")(__v.asInstanceOf[js.Any]))
      PublicDnsName.foreach(__v => __obj.updateDynamic("PublicDnsName")(__v.asInstanceOf[js.Any]))
      PublicIpAddress.foreach(__v => __obj.updateDynamic("PublicIpAddress")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Instance]
    }
  }

  @js.native
  sealed trait InstanceCollectionType extends js.Any
  object InstanceCollectionType extends js.Object {
    val INSTANCE_FLEET = "INSTANCE_FLEET".asInstanceOf[InstanceCollectionType]
    val INSTANCE_GROUP = "INSTANCE_GROUP".asInstanceOf[InstanceCollectionType]

    val values = js.Object.freeze(js.Array(INSTANCE_FLEET, INSTANCE_GROUP))
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
    @inline
    def apply(
        Id: js.UndefOr[InstanceFleetId] = js.undefined,
        InstanceFleetType: js.UndefOr[InstanceFleetType] = js.undefined,
        InstanceTypeSpecifications: js.UndefOr[InstanceTypeSpecificationList] = js.undefined,
        LaunchSpecifications: js.UndefOr[InstanceFleetProvisioningSpecifications] = js.undefined,
        Name: js.UndefOr[XmlStringMaxLen256] = js.undefined,
        ProvisionedOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined,
        ProvisionedSpotCapacity: js.UndefOr[WholeNumber] = js.undefined,
        Status: js.UndefOr[InstanceFleetStatus] = js.undefined,
        TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined,
        TargetSpotCapacity: js.UndefOr[WholeNumber] = js.undefined
    ): InstanceFleet = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InstanceFleetType.foreach(__v => __obj.updateDynamic("InstanceFleetType")(__v.asInstanceOf[js.Any]))
      InstanceTypeSpecifications.foreach(__v => __obj.updateDynamic("InstanceTypeSpecifications")(__v.asInstanceOf[js.Any]))
      LaunchSpecifications.foreach(__v => __obj.updateDynamic("LaunchSpecifications")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ProvisionedOnDemandCapacity.foreach(__v => __obj.updateDynamic("ProvisionedOnDemandCapacity")(__v.asInstanceOf[js.Any]))
      ProvisionedSpotCapacity.foreach(__v => __obj.updateDynamic("ProvisionedSpotCapacity")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TargetOnDemandCapacity.foreach(__v => __obj.updateDynamic("TargetOnDemandCapacity")(__v.asInstanceOf[js.Any]))
      TargetSpotCapacity.foreach(__v => __obj.updateDynamic("TargetSpotCapacity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceFleet]
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
    @inline
    def apply(
        InstanceFleetType: InstanceFleetType,
        InstanceTypeConfigs: js.UndefOr[InstanceTypeConfigList] = js.undefined,
        LaunchSpecifications: js.UndefOr[InstanceFleetProvisioningSpecifications] = js.undefined,
        Name: js.UndefOr[XmlStringMaxLen256] = js.undefined,
        TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined,
        TargetSpotCapacity: js.UndefOr[WholeNumber] = js.undefined
    ): InstanceFleetConfig = {
      val __obj = js.Dynamic.literal(
        "InstanceFleetType" -> InstanceFleetType.asInstanceOf[js.Any]
      )

      InstanceTypeConfigs.foreach(__v => __obj.updateDynamic("InstanceTypeConfigs")(__v.asInstanceOf[js.Any]))
      LaunchSpecifications.foreach(__v => __obj.updateDynamic("LaunchSpecifications")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      TargetOnDemandCapacity.foreach(__v => __obj.updateDynamic("TargetOnDemandCapacity")(__v.asInstanceOf[js.Any]))
      TargetSpotCapacity.foreach(__v => __obj.updateDynamic("TargetSpotCapacity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceFleetConfig]
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
    @inline
    def apply(
        InstanceFleetId: InstanceFleetId,
        TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined,
        TargetSpotCapacity: js.UndefOr[WholeNumber] = js.undefined
    ): InstanceFleetModifyConfig = {
      val __obj = js.Dynamic.literal(
        "InstanceFleetId" -> InstanceFleetId.asInstanceOf[js.Any]
      )

      TargetOnDemandCapacity.foreach(__v => __obj.updateDynamic("TargetOnDemandCapacity")(__v.asInstanceOf[js.Any]))
      TargetSpotCapacity.foreach(__v => __obj.updateDynamic("TargetSpotCapacity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceFleetModifyConfig]
    }
  }

  /**
    * The launch specification for Spot instances in the fleet, which determines the defined duration, provisioning timeout behavior, and allocation strategy.
    *
    * '''Note:'''The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. On-Demand and Spot instance allocation strategies are available in Amazon EMR version 5.12.1 and later.
    */
  @js.native
  trait InstanceFleetProvisioningSpecifications extends js.Object {
    var OnDemandSpecification: js.UndefOr[OnDemandProvisioningSpecification]
    var SpotSpecification: js.UndefOr[SpotProvisioningSpecification]
  }

  object InstanceFleetProvisioningSpecifications {
    @inline
    def apply(
        OnDemandSpecification: js.UndefOr[OnDemandProvisioningSpecification] = js.undefined,
        SpotSpecification: js.UndefOr[SpotProvisioningSpecification] = js.undefined
    ): InstanceFleetProvisioningSpecifications = {
      val __obj = js.Dynamic.literal()
      OnDemandSpecification.foreach(__v => __obj.updateDynamic("OnDemandSpecification")(__v.asInstanceOf[js.Any]))
      SpotSpecification.foreach(__v => __obj.updateDynamic("SpotSpecification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceFleetProvisioningSpecifications]
    }
  }

  @js.native
  sealed trait InstanceFleetState extends js.Any
  object InstanceFleetState extends js.Object {
    val PROVISIONING = "PROVISIONING".asInstanceOf[InstanceFleetState]
    val BOOTSTRAPPING = "BOOTSTRAPPING".asInstanceOf[InstanceFleetState]
    val RUNNING = "RUNNING".asInstanceOf[InstanceFleetState]
    val RESIZING = "RESIZING".asInstanceOf[InstanceFleetState]
    val SUSPENDED = "SUSPENDED".asInstanceOf[InstanceFleetState]
    val TERMINATING = "TERMINATING".asInstanceOf[InstanceFleetState]
    val TERMINATED = "TERMINATED".asInstanceOf[InstanceFleetState]

    val values = js.Object.freeze(js.Array(PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING, SUSPENDED, TERMINATING, TERMINATED))
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
    @inline
    def apply(
        Code: js.UndefOr[InstanceFleetStateChangeReasonCode] = js.undefined,
        Message: js.UndefOr[String] = js.undefined
    ): InstanceFleetStateChangeReason = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceFleetStateChangeReason]
    }
  }

  @js.native
  sealed trait InstanceFleetStateChangeReasonCode extends js.Any
  object InstanceFleetStateChangeReasonCode extends js.Object {
    val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[InstanceFleetStateChangeReasonCode]
    val VALIDATION_ERROR = "VALIDATION_ERROR".asInstanceOf[InstanceFleetStateChangeReasonCode]
    val INSTANCE_FAILURE = "INSTANCE_FAILURE".asInstanceOf[InstanceFleetStateChangeReasonCode]
    val CLUSTER_TERMINATED = "CLUSTER_TERMINATED".asInstanceOf[InstanceFleetStateChangeReasonCode]

    val values = js.Object.freeze(js.Array(INTERNAL_ERROR, VALIDATION_ERROR, INSTANCE_FAILURE, CLUSTER_TERMINATED))
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
    @inline
    def apply(
        State: js.UndefOr[InstanceFleetState] = js.undefined,
        StateChangeReason: js.UndefOr[InstanceFleetStateChangeReason] = js.undefined,
        Timeline: js.UndefOr[InstanceFleetTimeline] = js.undefined
    ): InstanceFleetStatus = {
      val __obj = js.Dynamic.literal()
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateChangeReason.foreach(__v => __obj.updateDynamic("StateChangeReason")(__v.asInstanceOf[js.Any]))
      Timeline.foreach(__v => __obj.updateDynamic("Timeline")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceFleetStatus]
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
    @inline
    def apply(
        CreationDateTime: js.UndefOr[Date] = js.undefined,
        EndDateTime: js.UndefOr[Date] = js.undefined,
        ReadyDateTime: js.UndefOr[Date] = js.undefined
    ): InstanceFleetTimeline = {
      val __obj = js.Dynamic.literal()
      CreationDateTime.foreach(__v => __obj.updateDynamic("CreationDateTime")(__v.asInstanceOf[js.Any]))
      EndDateTime.foreach(__v => __obj.updateDynamic("EndDateTime")(__v.asInstanceOf[js.Any]))
      ReadyDateTime.foreach(__v => __obj.updateDynamic("ReadyDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceFleetTimeline]
    }
  }

  @js.native
  sealed trait InstanceFleetType extends js.Any
  object InstanceFleetType extends js.Object {
    val MASTER = "MASTER".asInstanceOf[InstanceFleetType]
    val CORE = "CORE".asInstanceOf[InstanceFleetType]
    val TASK = "TASK".asInstanceOf[InstanceFleetType]

    val values = js.Object.freeze(js.Array(MASTER, CORE, TASK))
  }

  /**
    * This entity represents an instance group, which is a group of instances that have common purpose. For example, CORE instance group is used for HDFS.
    */
  @js.native
  trait InstanceGroup extends js.Object {
    var AutoScalingPolicy: js.UndefOr[AutoScalingPolicyDescription]
    var BidPrice: js.UndefOr[String]
    var Configurations: js.UndefOr[ConfigurationList]
    var ConfigurationsVersion: js.UndefOr[Double]
    var EbsBlockDevices: js.UndefOr[EbsBlockDeviceList]
    var EbsOptimized: js.UndefOr[BooleanObject]
    var Id: js.UndefOr[InstanceGroupId]
    var InstanceGroupType: js.UndefOr[InstanceGroupType]
    var InstanceType: js.UndefOr[InstanceType]
    var LastSuccessfullyAppliedConfigurations: js.UndefOr[ConfigurationList]
    var LastSuccessfullyAppliedConfigurationsVersion: js.UndefOr[Double]
    var Market: js.UndefOr[MarketType]
    var Name: js.UndefOr[String]
    var RequestedInstanceCount: js.UndefOr[Int]
    var RunningInstanceCount: js.UndefOr[Int]
    var ShrinkPolicy: js.UndefOr[ShrinkPolicy]
    var Status: js.UndefOr[InstanceGroupStatus]
  }

  object InstanceGroup {
    @inline
    def apply(
        AutoScalingPolicy: js.UndefOr[AutoScalingPolicyDescription] = js.undefined,
        BidPrice: js.UndefOr[String] = js.undefined,
        Configurations: js.UndefOr[ConfigurationList] = js.undefined,
        ConfigurationsVersion: js.UndefOr[Double] = js.undefined,
        EbsBlockDevices: js.UndefOr[EbsBlockDeviceList] = js.undefined,
        EbsOptimized: js.UndefOr[BooleanObject] = js.undefined,
        Id: js.UndefOr[InstanceGroupId] = js.undefined,
        InstanceGroupType: js.UndefOr[InstanceGroupType] = js.undefined,
        InstanceType: js.UndefOr[InstanceType] = js.undefined,
        LastSuccessfullyAppliedConfigurations: js.UndefOr[ConfigurationList] = js.undefined,
        LastSuccessfullyAppliedConfigurationsVersion: js.UndefOr[Double] = js.undefined,
        Market: js.UndefOr[MarketType] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        RequestedInstanceCount: js.UndefOr[Int] = js.undefined,
        RunningInstanceCount: js.UndefOr[Int] = js.undefined,
        ShrinkPolicy: js.UndefOr[ShrinkPolicy] = js.undefined,
        Status: js.UndefOr[InstanceGroupStatus] = js.undefined
    ): InstanceGroup = {
      val __obj = js.Dynamic.literal()
      AutoScalingPolicy.foreach(__v => __obj.updateDynamic("AutoScalingPolicy")(__v.asInstanceOf[js.Any]))
      BidPrice.foreach(__v => __obj.updateDynamic("BidPrice")(__v.asInstanceOf[js.Any]))
      Configurations.foreach(__v => __obj.updateDynamic("Configurations")(__v.asInstanceOf[js.Any]))
      ConfigurationsVersion.foreach(__v => __obj.updateDynamic("ConfigurationsVersion")(__v.asInstanceOf[js.Any]))
      EbsBlockDevices.foreach(__v => __obj.updateDynamic("EbsBlockDevices")(__v.asInstanceOf[js.Any]))
      EbsOptimized.foreach(__v => __obj.updateDynamic("EbsOptimized")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InstanceGroupType.foreach(__v => __obj.updateDynamic("InstanceGroupType")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      LastSuccessfullyAppliedConfigurations.foreach(__v => __obj.updateDynamic("LastSuccessfullyAppliedConfigurations")(__v.asInstanceOf[js.Any]))
      LastSuccessfullyAppliedConfigurationsVersion.foreach(__v => __obj.updateDynamic("LastSuccessfullyAppliedConfigurationsVersion")(__v.asInstanceOf[js.Any]))
      Market.foreach(__v => __obj.updateDynamic("Market")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RequestedInstanceCount.foreach(__v => __obj.updateDynamic("RequestedInstanceCount")(__v.asInstanceOf[js.Any]))
      RunningInstanceCount.foreach(__v => __obj.updateDynamic("RunningInstanceCount")(__v.asInstanceOf[js.Any]))
      ShrinkPolicy.foreach(__v => __obj.updateDynamic("ShrinkPolicy")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceGroup]
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
    @inline
    def apply(
        InstanceCount: Int,
        InstanceRole: InstanceRoleType,
        InstanceType: InstanceType,
        AutoScalingPolicy: js.UndefOr[AutoScalingPolicy] = js.undefined,
        BidPrice: js.UndefOr[XmlStringMaxLen256] = js.undefined,
        Configurations: js.UndefOr[ConfigurationList] = js.undefined,
        EbsConfiguration: js.UndefOr[EbsConfiguration] = js.undefined,
        Market: js.UndefOr[MarketType] = js.undefined,
        Name: js.UndefOr[XmlStringMaxLen256] = js.undefined
    ): InstanceGroupConfig = {
      val __obj = js.Dynamic.literal(
        "InstanceCount" -> InstanceCount.asInstanceOf[js.Any],
        "InstanceRole" -> InstanceRole.asInstanceOf[js.Any],
        "InstanceType" -> InstanceType.asInstanceOf[js.Any]
      )

      AutoScalingPolicy.foreach(__v => __obj.updateDynamic("AutoScalingPolicy")(__v.asInstanceOf[js.Any]))
      BidPrice.foreach(__v => __obj.updateDynamic("BidPrice")(__v.asInstanceOf[js.Any]))
      Configurations.foreach(__v => __obj.updateDynamic("Configurations")(__v.asInstanceOf[js.Any]))
      EbsConfiguration.foreach(__v => __obj.updateDynamic("EbsConfiguration")(__v.asInstanceOf[js.Any]))
      Market.foreach(__v => __obj.updateDynamic("Market")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceGroupConfig]
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
    @inline
    def apply(
        CreationDateTime: Date,
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
        StartDateTime: js.UndefOr[Date] = js.undefined
    ): InstanceGroupDetail = {
      val __obj = js.Dynamic.literal(
        "CreationDateTime" -> CreationDateTime.asInstanceOf[js.Any],
        "InstanceRequestCount" -> InstanceRequestCount.asInstanceOf[js.Any],
        "InstanceRole" -> InstanceRole.asInstanceOf[js.Any],
        "InstanceRunningCount" -> InstanceRunningCount.asInstanceOf[js.Any],
        "InstanceType" -> InstanceType.asInstanceOf[js.Any],
        "Market" -> Market.asInstanceOf[js.Any],
        "State" -> State.asInstanceOf[js.Any]
      )

      BidPrice.foreach(__v => __obj.updateDynamic("BidPrice")(__v.asInstanceOf[js.Any]))
      EndDateTime.foreach(__v => __obj.updateDynamic("EndDateTime")(__v.asInstanceOf[js.Any]))
      InstanceGroupId.foreach(__v => __obj.updateDynamic("InstanceGroupId")(__v.asInstanceOf[js.Any]))
      LastStateChangeReason.foreach(__v => __obj.updateDynamic("LastStateChangeReason")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ReadyDateTime.foreach(__v => __obj.updateDynamic("ReadyDateTime")(__v.asInstanceOf[js.Any]))
      StartDateTime.foreach(__v => __obj.updateDynamic("StartDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceGroupDetail]
    }
  }

  /**
    * Modify the size or configurations of an instance group.
    */
  @js.native
  trait InstanceGroupModifyConfig extends js.Object {
    var InstanceGroupId: XmlStringMaxLen256
    var Configurations: js.UndefOr[ConfigurationList]
    var EC2InstanceIdsToTerminate: js.UndefOr[EC2InstanceIdsToTerminateList]
    var InstanceCount: js.UndefOr[Int]
    var ShrinkPolicy: js.UndefOr[ShrinkPolicy]
  }

  object InstanceGroupModifyConfig {
    @inline
    def apply(
        InstanceGroupId: XmlStringMaxLen256,
        Configurations: js.UndefOr[ConfigurationList] = js.undefined,
        EC2InstanceIdsToTerminate: js.UndefOr[EC2InstanceIdsToTerminateList] = js.undefined,
        InstanceCount: js.UndefOr[Int] = js.undefined,
        ShrinkPolicy: js.UndefOr[ShrinkPolicy] = js.undefined
    ): InstanceGroupModifyConfig = {
      val __obj = js.Dynamic.literal(
        "InstanceGroupId" -> InstanceGroupId.asInstanceOf[js.Any]
      )

      Configurations.foreach(__v => __obj.updateDynamic("Configurations")(__v.asInstanceOf[js.Any]))
      EC2InstanceIdsToTerminate.foreach(__v => __obj.updateDynamic("EC2InstanceIdsToTerminate")(__v.asInstanceOf[js.Any]))
      InstanceCount.foreach(__v => __obj.updateDynamic("InstanceCount")(__v.asInstanceOf[js.Any]))
      ShrinkPolicy.foreach(__v => __obj.updateDynamic("ShrinkPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceGroupModifyConfig]
    }
  }

  @js.native
  sealed trait InstanceGroupState extends js.Any
  object InstanceGroupState extends js.Object {
    val PROVISIONING = "PROVISIONING".asInstanceOf[InstanceGroupState]
    val BOOTSTRAPPING = "BOOTSTRAPPING".asInstanceOf[InstanceGroupState]
    val RUNNING = "RUNNING".asInstanceOf[InstanceGroupState]
    val RECONFIGURING = "RECONFIGURING".asInstanceOf[InstanceGroupState]
    val RESIZING = "RESIZING".asInstanceOf[InstanceGroupState]
    val SUSPENDED = "SUSPENDED".asInstanceOf[InstanceGroupState]
    val TERMINATING = "TERMINATING".asInstanceOf[InstanceGroupState]
    val TERMINATED = "TERMINATED".asInstanceOf[InstanceGroupState]
    val ARRESTED = "ARRESTED".asInstanceOf[InstanceGroupState]
    val SHUTTING_DOWN = "SHUTTING_DOWN".asInstanceOf[InstanceGroupState]
    val ENDED = "ENDED".asInstanceOf[InstanceGroupState]

    val values = js.Object.freeze(js.Array(PROVISIONING, BOOTSTRAPPING, RUNNING, RECONFIGURING, RESIZING, SUSPENDED, TERMINATING, TERMINATED, ARRESTED, SHUTTING_DOWN, ENDED))
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
    @inline
    def apply(
        Code: js.UndefOr[InstanceGroupStateChangeReasonCode] = js.undefined,
        Message: js.UndefOr[String] = js.undefined
    ): InstanceGroupStateChangeReason = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceGroupStateChangeReason]
    }
  }

  @js.native
  sealed trait InstanceGroupStateChangeReasonCode extends js.Any
  object InstanceGroupStateChangeReasonCode extends js.Object {
    val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[InstanceGroupStateChangeReasonCode]
    val VALIDATION_ERROR = "VALIDATION_ERROR".asInstanceOf[InstanceGroupStateChangeReasonCode]
    val INSTANCE_FAILURE = "INSTANCE_FAILURE".asInstanceOf[InstanceGroupStateChangeReasonCode]
    val CLUSTER_TERMINATED = "CLUSTER_TERMINATED".asInstanceOf[InstanceGroupStateChangeReasonCode]

    val values = js.Object.freeze(js.Array(INTERNAL_ERROR, VALIDATION_ERROR, INSTANCE_FAILURE, CLUSTER_TERMINATED))
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
    @inline
    def apply(
        State: js.UndefOr[InstanceGroupState] = js.undefined,
        StateChangeReason: js.UndefOr[InstanceGroupStateChangeReason] = js.undefined,
        Timeline: js.UndefOr[InstanceGroupTimeline] = js.undefined
    ): InstanceGroupStatus = {
      val __obj = js.Dynamic.literal()
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateChangeReason.foreach(__v => __obj.updateDynamic("StateChangeReason")(__v.asInstanceOf[js.Any]))
      Timeline.foreach(__v => __obj.updateDynamic("Timeline")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceGroupStatus]
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
    @inline
    def apply(
        CreationDateTime: js.UndefOr[Date] = js.undefined,
        EndDateTime: js.UndefOr[Date] = js.undefined,
        ReadyDateTime: js.UndefOr[Date] = js.undefined
    ): InstanceGroupTimeline = {
      val __obj = js.Dynamic.literal()
      CreationDateTime.foreach(__v => __obj.updateDynamic("CreationDateTime")(__v.asInstanceOf[js.Any]))
      EndDateTime.foreach(__v => __obj.updateDynamic("EndDateTime")(__v.asInstanceOf[js.Any]))
      ReadyDateTime.foreach(__v => __obj.updateDynamic("ReadyDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceGroupTimeline]
    }
  }

  @js.native
  sealed trait InstanceGroupType extends js.Any
  object InstanceGroupType extends js.Object {
    val MASTER = "MASTER".asInstanceOf[InstanceGroupType]
    val CORE = "CORE".asInstanceOf[InstanceGroupType]
    val TASK = "TASK".asInstanceOf[InstanceGroupType]

    val values = js.Object.freeze(js.Array(MASTER, CORE, TASK))
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
    @inline
    def apply(
        InstanceTerminationTimeout: js.UndefOr[Int] = js.undefined,
        InstancesToProtect: js.UndefOr[EC2InstanceIdsList] = js.undefined,
        InstancesToTerminate: js.UndefOr[EC2InstanceIdsList] = js.undefined
    ): InstanceResizePolicy = {
      val __obj = js.Dynamic.literal()
      InstanceTerminationTimeout.foreach(__v => __obj.updateDynamic("InstanceTerminationTimeout")(__v.asInstanceOf[js.Any]))
      InstancesToProtect.foreach(__v => __obj.updateDynamic("InstancesToProtect")(__v.asInstanceOf[js.Any]))
      InstancesToTerminate.foreach(__v => __obj.updateDynamic("InstancesToTerminate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceResizePolicy]
    }
  }

  @js.native
  sealed trait InstanceRoleType extends js.Any
  object InstanceRoleType extends js.Object {
    val MASTER = "MASTER".asInstanceOf[InstanceRoleType]
    val CORE = "CORE".asInstanceOf[InstanceRoleType]
    val TASK = "TASK".asInstanceOf[InstanceRoleType]

    val values = js.Object.freeze(js.Array(MASTER, CORE, TASK))
  }

  @js.native
  sealed trait InstanceState extends js.Any
  object InstanceState extends js.Object {
    val AWAITING_FULFILLMENT = "AWAITING_FULFILLMENT".asInstanceOf[InstanceState]
    val PROVISIONING = "PROVISIONING".asInstanceOf[InstanceState]
    val BOOTSTRAPPING = "BOOTSTRAPPING".asInstanceOf[InstanceState]
    val RUNNING = "RUNNING".asInstanceOf[InstanceState]
    val TERMINATED = "TERMINATED".asInstanceOf[InstanceState]

    val values = js.Object.freeze(js.Array(AWAITING_FULFILLMENT, PROVISIONING, BOOTSTRAPPING, RUNNING, TERMINATED))
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
    @inline
    def apply(
        Code: js.UndefOr[InstanceStateChangeReasonCode] = js.undefined,
        Message: js.UndefOr[String] = js.undefined
    ): InstanceStateChangeReason = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceStateChangeReason]
    }
  }

  @js.native
  sealed trait InstanceStateChangeReasonCode extends js.Any
  object InstanceStateChangeReasonCode extends js.Object {
    val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[InstanceStateChangeReasonCode]
    val VALIDATION_ERROR = "VALIDATION_ERROR".asInstanceOf[InstanceStateChangeReasonCode]
    val INSTANCE_FAILURE = "INSTANCE_FAILURE".asInstanceOf[InstanceStateChangeReasonCode]
    val BOOTSTRAP_FAILURE = "BOOTSTRAP_FAILURE".asInstanceOf[InstanceStateChangeReasonCode]
    val CLUSTER_TERMINATED = "CLUSTER_TERMINATED".asInstanceOf[InstanceStateChangeReasonCode]

    val values = js.Object.freeze(js.Array(INTERNAL_ERROR, VALIDATION_ERROR, INSTANCE_FAILURE, BOOTSTRAP_FAILURE, CLUSTER_TERMINATED))
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
    @inline
    def apply(
        State: js.UndefOr[InstanceState] = js.undefined,
        StateChangeReason: js.UndefOr[InstanceStateChangeReason] = js.undefined,
        Timeline: js.UndefOr[InstanceTimeline] = js.undefined
    ): InstanceStatus = {
      val __obj = js.Dynamic.literal()
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateChangeReason.foreach(__v => __obj.updateDynamic("StateChangeReason")(__v.asInstanceOf[js.Any]))
      Timeline.foreach(__v => __obj.updateDynamic("Timeline")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceStatus]
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
    @inline
    def apply(
        CreationDateTime: js.UndefOr[Date] = js.undefined,
        EndDateTime: js.UndefOr[Date] = js.undefined,
        ReadyDateTime: js.UndefOr[Date] = js.undefined
    ): InstanceTimeline = {
      val __obj = js.Dynamic.literal()
      CreationDateTime.foreach(__v => __obj.updateDynamic("CreationDateTime")(__v.asInstanceOf[js.Any]))
      EndDateTime.foreach(__v => __obj.updateDynamic("EndDateTime")(__v.asInstanceOf[js.Any]))
      ReadyDateTime.foreach(__v => __obj.updateDynamic("ReadyDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceTimeline]
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
    @inline
    def apply(
        InstanceType: InstanceType,
        BidPrice: js.UndefOr[XmlStringMaxLen256] = js.undefined,
        BidPriceAsPercentageOfOnDemandPrice: js.UndefOr[NonNegativeDouble] = js.undefined,
        Configurations: js.UndefOr[ConfigurationList] = js.undefined,
        EbsConfiguration: js.UndefOr[EbsConfiguration] = js.undefined,
        WeightedCapacity: js.UndefOr[WholeNumber] = js.undefined
    ): InstanceTypeConfig = {
      val __obj = js.Dynamic.literal(
        "InstanceType" -> InstanceType.asInstanceOf[js.Any]
      )

      BidPrice.foreach(__v => __obj.updateDynamic("BidPrice")(__v.asInstanceOf[js.Any]))
      BidPriceAsPercentageOfOnDemandPrice.foreach(__v => __obj.updateDynamic("BidPriceAsPercentageOfOnDemandPrice")(__v.asInstanceOf[js.Any]))
      Configurations.foreach(__v => __obj.updateDynamic("Configurations")(__v.asInstanceOf[js.Any]))
      EbsConfiguration.foreach(__v => __obj.updateDynamic("EbsConfiguration")(__v.asInstanceOf[js.Any]))
      WeightedCapacity.foreach(__v => __obj.updateDynamic("WeightedCapacity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceTypeConfig]
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
    @inline
    def apply(
        BidPrice: js.UndefOr[XmlStringMaxLen256] = js.undefined,
        BidPriceAsPercentageOfOnDemandPrice: js.UndefOr[NonNegativeDouble] = js.undefined,
        Configurations: js.UndefOr[ConfigurationList] = js.undefined,
        EbsBlockDevices: js.UndefOr[EbsBlockDeviceList] = js.undefined,
        EbsOptimized: js.UndefOr[BooleanObject] = js.undefined,
        InstanceType: js.UndefOr[InstanceType] = js.undefined,
        WeightedCapacity: js.UndefOr[WholeNumber] = js.undefined
    ): InstanceTypeSpecification = {
      val __obj = js.Dynamic.literal()
      BidPrice.foreach(__v => __obj.updateDynamic("BidPrice")(__v.asInstanceOf[js.Any]))
      BidPriceAsPercentageOfOnDemandPrice.foreach(__v => __obj.updateDynamic("BidPriceAsPercentageOfOnDemandPrice")(__v.asInstanceOf[js.Any]))
      Configurations.foreach(__v => __obj.updateDynamic("Configurations")(__v.asInstanceOf[js.Any]))
      EbsBlockDevices.foreach(__v => __obj.updateDynamic("EbsBlockDevices")(__v.asInstanceOf[js.Any]))
      EbsOptimized.foreach(__v => __obj.updateDynamic("EbsOptimized")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      WeightedCapacity.foreach(__v => __obj.updateDynamic("WeightedCapacity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceTypeSpecification]
    }
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
    var LogEncryptionKmsKeyId: js.UndefOr[XmlString]
    var LogUri: js.UndefOr[XmlString]
    var ScaleDownBehavior: js.UndefOr[ScaleDownBehavior]
    var ServiceRole: js.UndefOr[XmlString]
    var Steps: js.UndefOr[StepDetailList]
    var SupportedProducts: js.UndefOr[SupportedProductsList]
    var VisibleToAllUsers: js.UndefOr[Boolean]
  }

  object JobFlowDetail {
    @inline
    def apply(
        ExecutionStatusDetail: JobFlowExecutionStatusDetail,
        Instances: JobFlowInstancesDetail,
        JobFlowId: XmlStringMaxLen256,
        Name: XmlStringMaxLen256,
        AmiVersion: js.UndefOr[XmlStringMaxLen256] = js.undefined,
        AutoScalingRole: js.UndefOr[XmlString] = js.undefined,
        BootstrapActions: js.UndefOr[BootstrapActionDetailList] = js.undefined,
        JobFlowRole: js.UndefOr[XmlString] = js.undefined,
        LogEncryptionKmsKeyId: js.UndefOr[XmlString] = js.undefined,
        LogUri: js.UndefOr[XmlString] = js.undefined,
        ScaleDownBehavior: js.UndefOr[ScaleDownBehavior] = js.undefined,
        ServiceRole: js.UndefOr[XmlString] = js.undefined,
        Steps: js.UndefOr[StepDetailList] = js.undefined,
        SupportedProducts: js.UndefOr[SupportedProductsList] = js.undefined,
        VisibleToAllUsers: js.UndefOr[Boolean] = js.undefined
    ): JobFlowDetail = {
      val __obj = js.Dynamic.literal(
        "ExecutionStatusDetail" -> ExecutionStatusDetail.asInstanceOf[js.Any],
        "Instances" -> Instances.asInstanceOf[js.Any],
        "JobFlowId" -> JobFlowId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AmiVersion.foreach(__v => __obj.updateDynamic("AmiVersion")(__v.asInstanceOf[js.Any]))
      AutoScalingRole.foreach(__v => __obj.updateDynamic("AutoScalingRole")(__v.asInstanceOf[js.Any]))
      BootstrapActions.foreach(__v => __obj.updateDynamic("BootstrapActions")(__v.asInstanceOf[js.Any]))
      JobFlowRole.foreach(__v => __obj.updateDynamic("JobFlowRole")(__v.asInstanceOf[js.Any]))
      LogEncryptionKmsKeyId.foreach(__v => __obj.updateDynamic("LogEncryptionKmsKeyId")(__v.asInstanceOf[js.Any]))
      LogUri.foreach(__v => __obj.updateDynamic("LogUri")(__v.asInstanceOf[js.Any]))
      ScaleDownBehavior.foreach(__v => __obj.updateDynamic("ScaleDownBehavior")(__v.asInstanceOf[js.Any]))
      ServiceRole.foreach(__v => __obj.updateDynamic("ServiceRole")(__v.asInstanceOf[js.Any]))
      Steps.foreach(__v => __obj.updateDynamic("Steps")(__v.asInstanceOf[js.Any]))
      SupportedProducts.foreach(__v => __obj.updateDynamic("SupportedProducts")(__v.asInstanceOf[js.Any]))
      VisibleToAllUsers.foreach(__v => __obj.updateDynamic("VisibleToAllUsers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobFlowDetail]
    }
  }

  /**
    * The type of instance.
    */
  @js.native
  sealed trait JobFlowExecutionState extends js.Any
  object JobFlowExecutionState extends js.Object {
    val STARTING = "STARTING".asInstanceOf[JobFlowExecutionState]
    val BOOTSTRAPPING = "BOOTSTRAPPING".asInstanceOf[JobFlowExecutionState]
    val RUNNING = "RUNNING".asInstanceOf[JobFlowExecutionState]
    val WAITING = "WAITING".asInstanceOf[JobFlowExecutionState]
    val SHUTTING_DOWN = "SHUTTING_DOWN".asInstanceOf[JobFlowExecutionState]
    val TERMINATED = "TERMINATED".asInstanceOf[JobFlowExecutionState]
    val COMPLETED = "COMPLETED".asInstanceOf[JobFlowExecutionState]
    val FAILED = "FAILED".asInstanceOf[JobFlowExecutionState]

    val values = js.Object.freeze(js.Array(STARTING, BOOTSTRAPPING, RUNNING, WAITING, SHUTTING_DOWN, TERMINATED, COMPLETED, FAILED))
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
    @inline
    def apply(
        CreationDateTime: Date,
        State: JobFlowExecutionState,
        EndDateTime: js.UndefOr[Date] = js.undefined,
        LastStateChangeReason: js.UndefOr[XmlString] = js.undefined,
        ReadyDateTime: js.UndefOr[Date] = js.undefined,
        StartDateTime: js.UndefOr[Date] = js.undefined
    ): JobFlowExecutionStatusDetail = {
      val __obj = js.Dynamic.literal(
        "CreationDateTime" -> CreationDateTime.asInstanceOf[js.Any],
        "State" -> State.asInstanceOf[js.Any]
      )

      EndDateTime.foreach(__v => __obj.updateDynamic("EndDateTime")(__v.asInstanceOf[js.Any]))
      LastStateChangeReason.foreach(__v => __obj.updateDynamic("LastStateChangeReason")(__v.asInstanceOf[js.Any]))
      ReadyDateTime.foreach(__v => __obj.updateDynamic("ReadyDateTime")(__v.asInstanceOf[js.Any]))
      StartDateTime.foreach(__v => __obj.updateDynamic("StartDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobFlowExecutionStatusDetail]
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
    @inline
    def apply(
        AdditionalMasterSecurityGroups: js.UndefOr[SecurityGroupsList] = js.undefined,
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
        TerminationProtected: js.UndefOr[Boolean] = js.undefined
    ): JobFlowInstancesConfig = {
      val __obj = js.Dynamic.literal()
      AdditionalMasterSecurityGroups.foreach(__v => __obj.updateDynamic("AdditionalMasterSecurityGroups")(__v.asInstanceOf[js.Any]))
      AdditionalSlaveSecurityGroups.foreach(__v => __obj.updateDynamic("AdditionalSlaveSecurityGroups")(__v.asInstanceOf[js.Any]))
      Ec2KeyName.foreach(__v => __obj.updateDynamic("Ec2KeyName")(__v.asInstanceOf[js.Any]))
      Ec2SubnetId.foreach(__v => __obj.updateDynamic("Ec2SubnetId")(__v.asInstanceOf[js.Any]))
      Ec2SubnetIds.foreach(__v => __obj.updateDynamic("Ec2SubnetIds")(__v.asInstanceOf[js.Any]))
      EmrManagedMasterSecurityGroup.foreach(__v => __obj.updateDynamic("EmrManagedMasterSecurityGroup")(__v.asInstanceOf[js.Any]))
      EmrManagedSlaveSecurityGroup.foreach(__v => __obj.updateDynamic("EmrManagedSlaveSecurityGroup")(__v.asInstanceOf[js.Any]))
      HadoopVersion.foreach(__v => __obj.updateDynamic("HadoopVersion")(__v.asInstanceOf[js.Any]))
      InstanceCount.foreach(__v => __obj.updateDynamic("InstanceCount")(__v.asInstanceOf[js.Any]))
      InstanceFleets.foreach(__v => __obj.updateDynamic("InstanceFleets")(__v.asInstanceOf[js.Any]))
      InstanceGroups.foreach(__v => __obj.updateDynamic("InstanceGroups")(__v.asInstanceOf[js.Any]))
      KeepJobFlowAliveWhenNoSteps.foreach(__v => __obj.updateDynamic("KeepJobFlowAliveWhenNoSteps")(__v.asInstanceOf[js.Any]))
      MasterInstanceType.foreach(__v => __obj.updateDynamic("MasterInstanceType")(__v.asInstanceOf[js.Any]))
      Placement.foreach(__v => __obj.updateDynamic("Placement")(__v.asInstanceOf[js.Any]))
      ServiceAccessSecurityGroup.foreach(__v => __obj.updateDynamic("ServiceAccessSecurityGroup")(__v.asInstanceOf[js.Any]))
      SlaveInstanceType.foreach(__v => __obj.updateDynamic("SlaveInstanceType")(__v.asInstanceOf[js.Any]))
      TerminationProtected.foreach(__v => __obj.updateDynamic("TerminationProtected")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobFlowInstancesConfig]
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
    @inline
    def apply(
        InstanceCount: Int,
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
        TerminationProtected: js.UndefOr[Boolean] = js.undefined
    ): JobFlowInstancesDetail = {
      val __obj = js.Dynamic.literal(
        "InstanceCount" -> InstanceCount.asInstanceOf[js.Any],
        "MasterInstanceType" -> MasterInstanceType.asInstanceOf[js.Any],
        "SlaveInstanceType" -> SlaveInstanceType.asInstanceOf[js.Any]
      )

      Ec2KeyName.foreach(__v => __obj.updateDynamic("Ec2KeyName")(__v.asInstanceOf[js.Any]))
      Ec2SubnetId.foreach(__v => __obj.updateDynamic("Ec2SubnetId")(__v.asInstanceOf[js.Any]))
      HadoopVersion.foreach(__v => __obj.updateDynamic("HadoopVersion")(__v.asInstanceOf[js.Any]))
      InstanceGroups.foreach(__v => __obj.updateDynamic("InstanceGroups")(__v.asInstanceOf[js.Any]))
      KeepJobFlowAliveWhenNoSteps.foreach(__v => __obj.updateDynamic("KeepJobFlowAliveWhenNoSteps")(__v.asInstanceOf[js.Any]))
      MasterInstanceId.foreach(__v => __obj.updateDynamic("MasterInstanceId")(__v.asInstanceOf[js.Any]))
      MasterPublicDnsName.foreach(__v => __obj.updateDynamic("MasterPublicDnsName")(__v.asInstanceOf[js.Any]))
      NormalizedInstanceHours.foreach(__v => __obj.updateDynamic("NormalizedInstanceHours")(__v.asInstanceOf[js.Any]))
      Placement.foreach(__v => __obj.updateDynamic("Placement")(__v.asInstanceOf[js.Any]))
      TerminationProtected.foreach(__v => __obj.updateDynamic("TerminationProtected")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobFlowInstancesDetail]
    }
  }

  /**
    * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security configuration. For more information see [[https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html|Use Kerberos Authentication]] in the <i>EMR Management Guide</i>.
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
    @inline
    def apply(
        KdcAdminPassword: XmlStringMaxLen256,
        Realm: XmlStringMaxLen256,
        ADDomainJoinPassword: js.UndefOr[XmlStringMaxLen256] = js.undefined,
        ADDomainJoinUser: js.UndefOr[XmlStringMaxLen256] = js.undefined,
        CrossRealmTrustPrincipalPassword: js.UndefOr[XmlStringMaxLen256] = js.undefined
    ): KerberosAttributes = {
      val __obj = js.Dynamic.literal(
        "KdcAdminPassword" -> KdcAdminPassword.asInstanceOf[js.Any],
        "Realm" -> Realm.asInstanceOf[js.Any]
      )

      ADDomainJoinPassword.foreach(__v => __obj.updateDynamic("ADDomainJoinPassword")(__v.asInstanceOf[js.Any]))
      ADDomainJoinUser.foreach(__v => __obj.updateDynamic("ADDomainJoinUser")(__v.asInstanceOf[js.Any]))
      CrossRealmTrustPrincipalPassword.foreach(__v => __obj.updateDynamic("CrossRealmTrustPrincipalPassword")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KerberosAttributes]
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
    @inline
    def apply(
        Key: js.UndefOr[XmlString] = js.undefined,
        Value: js.UndefOr[XmlString] = js.undefined
    ): KeyValue = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KeyValue]
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
    @inline
    def apply(
        ClusterId: ClusterId,
        Marker: js.UndefOr[Marker] = js.undefined
    ): ListBootstrapActionsInput = {
      val __obj = js.Dynamic.literal(
        "ClusterId" -> ClusterId.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBootstrapActionsInput]
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
    @inline
    def apply(
        BootstrapActions: js.UndefOr[CommandList] = js.undefined,
        Marker: js.UndefOr[Marker] = js.undefined
    ): ListBootstrapActionsOutput = {
      val __obj = js.Dynamic.literal()
      BootstrapActions.foreach(__v => __obj.updateDynamic("BootstrapActions")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBootstrapActionsOutput]
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
    @inline
    def apply(
        ClusterStates: js.UndefOr[ClusterStateList] = js.undefined,
        CreatedAfter: js.UndefOr[Date] = js.undefined,
        CreatedBefore: js.UndefOr[Date] = js.undefined,
        Marker: js.UndefOr[Marker] = js.undefined
    ): ListClustersInput = {
      val __obj = js.Dynamic.literal()
      ClusterStates.foreach(__v => __obj.updateDynamic("ClusterStates")(__v.asInstanceOf[js.Any]))
      CreatedAfter.foreach(__v => __obj.updateDynamic("CreatedAfter")(__v.asInstanceOf[js.Any]))
      CreatedBefore.foreach(__v => __obj.updateDynamic("CreatedBefore")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClustersInput]
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
    @inline
    def apply(
        Clusters: js.UndefOr[ClusterSummaryList] = js.undefined,
        Marker: js.UndefOr[Marker] = js.undefined
    ): ListClustersOutput = {
      val __obj = js.Dynamic.literal()
      Clusters.foreach(__v => __obj.updateDynamic("Clusters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClustersOutput]
    }
  }

  @js.native
  trait ListInstanceFleetsInput extends js.Object {
    var ClusterId: ClusterId
    var Marker: js.UndefOr[Marker]
  }

  object ListInstanceFleetsInput {
    @inline
    def apply(
        ClusterId: ClusterId,
        Marker: js.UndefOr[Marker] = js.undefined
    ): ListInstanceFleetsInput = {
      val __obj = js.Dynamic.literal(
        "ClusterId" -> ClusterId.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstanceFleetsInput]
    }
  }

  @js.native
  trait ListInstanceFleetsOutput extends js.Object {
    var InstanceFleets: js.UndefOr[InstanceFleetList]
    var Marker: js.UndefOr[Marker]
  }

  object ListInstanceFleetsOutput {
    @inline
    def apply(
        InstanceFleets: js.UndefOr[InstanceFleetList] = js.undefined,
        Marker: js.UndefOr[Marker] = js.undefined
    ): ListInstanceFleetsOutput = {
      val __obj = js.Dynamic.literal()
      InstanceFleets.foreach(__v => __obj.updateDynamic("InstanceFleets")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstanceFleetsOutput]
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
    @inline
    def apply(
        ClusterId: ClusterId,
        Marker: js.UndefOr[Marker] = js.undefined
    ): ListInstanceGroupsInput = {
      val __obj = js.Dynamic.literal(
        "ClusterId" -> ClusterId.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstanceGroupsInput]
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
    @inline
    def apply(
        InstanceGroups: js.UndefOr[InstanceGroupList] = js.undefined,
        Marker: js.UndefOr[Marker] = js.undefined
    ): ListInstanceGroupsOutput = {
      val __obj = js.Dynamic.literal()
      InstanceGroups.foreach(__v => __obj.updateDynamic("InstanceGroups")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstanceGroupsOutput]
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
    @inline
    def apply(
        ClusterId: ClusterId,
        InstanceFleetId: js.UndefOr[InstanceFleetId] = js.undefined,
        InstanceFleetType: js.UndefOr[InstanceFleetType] = js.undefined,
        InstanceGroupId: js.UndefOr[InstanceGroupId] = js.undefined,
        InstanceGroupTypes: js.UndefOr[InstanceGroupTypeList] = js.undefined,
        InstanceStates: js.UndefOr[InstanceStateList] = js.undefined,
        Marker: js.UndefOr[Marker] = js.undefined
    ): ListInstancesInput = {
      val __obj = js.Dynamic.literal(
        "ClusterId" -> ClusterId.asInstanceOf[js.Any]
      )

      InstanceFleetId.foreach(__v => __obj.updateDynamic("InstanceFleetId")(__v.asInstanceOf[js.Any]))
      InstanceFleetType.foreach(__v => __obj.updateDynamic("InstanceFleetType")(__v.asInstanceOf[js.Any]))
      InstanceGroupId.foreach(__v => __obj.updateDynamic("InstanceGroupId")(__v.asInstanceOf[js.Any]))
      InstanceGroupTypes.foreach(__v => __obj.updateDynamic("InstanceGroupTypes")(__v.asInstanceOf[js.Any]))
      InstanceStates.foreach(__v => __obj.updateDynamic("InstanceStates")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstancesInput]
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
    @inline
    def apply(
        Instances: js.UndefOr[InstanceList] = js.undefined,
        Marker: js.UndefOr[Marker] = js.undefined
    ): ListInstancesOutput = {
      val __obj = js.Dynamic.literal()
      Instances.foreach(__v => __obj.updateDynamic("Instances")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstancesOutput]
    }
  }

  @js.native
  trait ListSecurityConfigurationsInput extends js.Object {
    var Marker: js.UndefOr[Marker]
  }

  object ListSecurityConfigurationsInput {
    @inline
    def apply(
        Marker: js.UndefOr[Marker] = js.undefined
    ): ListSecurityConfigurationsInput = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecurityConfigurationsInput]
    }
  }

  @js.native
  trait ListSecurityConfigurationsOutput extends js.Object {
    var Marker: js.UndefOr[Marker]
    var SecurityConfigurations: js.UndefOr[SecurityConfigurationList]
  }

  object ListSecurityConfigurationsOutput {
    @inline
    def apply(
        Marker: js.UndefOr[Marker] = js.undefined,
        SecurityConfigurations: js.UndefOr[SecurityConfigurationList] = js.undefined
    ): ListSecurityConfigurationsOutput = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      SecurityConfigurations.foreach(__v => __obj.updateDynamic("SecurityConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecurityConfigurationsOutput]
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
    @inline
    def apply(
        ClusterId: ClusterId,
        Marker: js.UndefOr[Marker] = js.undefined,
        StepIds: js.UndefOr[XmlStringList] = js.undefined,
        StepStates: js.UndefOr[StepStateList] = js.undefined
    ): ListStepsInput = {
      val __obj = js.Dynamic.literal(
        "ClusterId" -> ClusterId.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      StepIds.foreach(__v => __obj.updateDynamic("StepIds")(__v.asInstanceOf[js.Any]))
      StepStates.foreach(__v => __obj.updateDynamic("StepStates")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStepsInput]
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
    @inline
    def apply(
        Marker: js.UndefOr[Marker] = js.undefined,
        Steps: js.UndefOr[StepSummaryList] = js.undefined
    ): ListStepsOutput = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      Steps.foreach(__v => __obj.updateDynamic("Steps")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStepsOutput]
    }
  }

  /**
    * Managed scaling policy for an Amazon EMR cluster. The policy specifies the limits for resources that can be added or terminated from a cluster. The policy only applies to the core and task nodes. The master node cannot be scaled after initial configuration.
    */
  @js.native
  trait ManagedScalingPolicy extends js.Object {
    var ComputeLimits: js.UndefOr[ComputeLimits]
  }

  object ManagedScalingPolicy {
    @inline
    def apply(
        ComputeLimits: js.UndefOr[ComputeLimits] = js.undefined
    ): ManagedScalingPolicy = {
      val __obj = js.Dynamic.literal()
      ComputeLimits.foreach(__v => __obj.updateDynamic("ComputeLimits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManagedScalingPolicy]
    }
  }

  @js.native
  sealed trait MarketType extends js.Any
  object MarketType extends js.Object {
    val ON_DEMAND = "ON_DEMAND".asInstanceOf[MarketType]
    val SPOT = "SPOT".asInstanceOf[MarketType]

    val values = js.Object.freeze(js.Array(ON_DEMAND, SPOT))
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
    @inline
    def apply(
        Key: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): MetricDimension = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricDimension]
    }
  }

  @js.native
  trait ModifyClusterInput extends js.Object {
    var ClusterId: String
    var StepConcurrencyLevel: js.UndefOr[Int]
  }

  object ModifyClusterInput {
    @inline
    def apply(
        ClusterId: String,
        StepConcurrencyLevel: js.UndefOr[Int] = js.undefined
    ): ModifyClusterInput = {
      val __obj = js.Dynamic.literal(
        "ClusterId" -> ClusterId.asInstanceOf[js.Any]
      )

      StepConcurrencyLevel.foreach(__v => __obj.updateDynamic("StepConcurrencyLevel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyClusterInput]
    }
  }

  @js.native
  trait ModifyClusterOutput extends js.Object {
    var StepConcurrencyLevel: js.UndefOr[Int]
  }

  object ModifyClusterOutput {
    @inline
    def apply(
        StepConcurrencyLevel: js.UndefOr[Int] = js.undefined
    ): ModifyClusterOutput = {
      val __obj = js.Dynamic.literal()
      StepConcurrencyLevel.foreach(__v => __obj.updateDynamic("StepConcurrencyLevel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyClusterOutput]
    }
  }

  @js.native
  trait ModifyInstanceFleetInput extends js.Object {
    var ClusterId: ClusterId
    var InstanceFleet: InstanceFleetModifyConfig
  }

  object ModifyInstanceFleetInput {
    @inline
    def apply(
        ClusterId: ClusterId,
        InstanceFleet: InstanceFleetModifyConfig
    ): ModifyInstanceFleetInput = {
      val __obj = js.Dynamic.literal(
        "ClusterId" -> ClusterId.asInstanceOf[js.Any],
        "InstanceFleet" -> InstanceFleet.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModifyInstanceFleetInput]
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
    @inline
    def apply(
        ClusterId: js.UndefOr[ClusterId] = js.undefined,
        InstanceGroups: js.UndefOr[InstanceGroupModifyConfigList] = js.undefined
    ): ModifyInstanceGroupsInput = {
      val __obj = js.Dynamic.literal()
      ClusterId.foreach(__v => __obj.updateDynamic("ClusterId")(__v.asInstanceOf[js.Any]))
      InstanceGroups.foreach(__v => __obj.updateDynamic("InstanceGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyInstanceGroupsInput]
    }
  }

  @js.native
  sealed trait OnDemandProvisioningAllocationStrategy extends js.Any
  object OnDemandProvisioningAllocationStrategy extends js.Object {
    val `lowest-price` = "lowest-price".asInstanceOf[OnDemandProvisioningAllocationStrategy]

    val values = js.Object.freeze(js.Array(`lowest-price`))
  }

  /**
    * The launch specification for On-Demand instances in the instance fleet, which determines the allocation strategy.
    *
    * '''Note:'''The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. On-Demand instances allocation strategy is available in Amazon EMR version 5.12.1 and later.
    */
  @js.native
  trait OnDemandProvisioningSpecification extends js.Object {
    var AllocationStrategy: OnDemandProvisioningAllocationStrategy
  }

  object OnDemandProvisioningSpecification {
    @inline
    def apply(
        AllocationStrategy: OnDemandProvisioningAllocationStrategy
    ): OnDemandProvisioningSpecification = {
      val __obj = js.Dynamic.literal(
        "AllocationStrategy" -> AllocationStrategy.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[OnDemandProvisioningSpecification]
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
    @inline
    def apply(
        AvailabilityZone: js.UndefOr[XmlString] = js.undefined,
        AvailabilityZones: js.UndefOr[XmlStringMaxLen256List] = js.undefined
    ): PlacementType = {
      val __obj = js.Dynamic.literal()
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlacementType]
    }
  }

  /**
    * A list of port ranges that are permitted to allow inbound traffic from all public IP addresses. To specify a single port, use the same value for <code>MinRange</code> and <code>MaxRange</code>.
    */
  @js.native
  trait PortRange extends js.Object {
    var MinRange: Port
    var MaxRange: js.UndefOr[Port]
  }

  object PortRange {
    @inline
    def apply(
        MinRange: Port,
        MaxRange: js.UndefOr[Port] = js.undefined
    ): PortRange = {
      val __obj = js.Dynamic.literal(
        "MinRange" -> MinRange.asInstanceOf[js.Any]
      )

      MaxRange.foreach(__v => __obj.updateDynamic("MaxRange")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortRange]
    }
  }

  @js.native
  trait PutAutoScalingPolicyInput extends js.Object {
    var AutoScalingPolicy: AutoScalingPolicy
    var ClusterId: ClusterId
    var InstanceGroupId: InstanceGroupId
  }

  object PutAutoScalingPolicyInput {
    @inline
    def apply(
        AutoScalingPolicy: AutoScalingPolicy,
        ClusterId: ClusterId,
        InstanceGroupId: InstanceGroupId
    ): PutAutoScalingPolicyInput = {
      val __obj = js.Dynamic.literal(
        "AutoScalingPolicy" -> AutoScalingPolicy.asInstanceOf[js.Any],
        "ClusterId" -> ClusterId.asInstanceOf[js.Any],
        "InstanceGroupId" -> InstanceGroupId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutAutoScalingPolicyInput]
    }
  }

  @js.native
  trait PutAutoScalingPolicyOutput extends js.Object {
    var AutoScalingPolicy: js.UndefOr[AutoScalingPolicyDescription]
    var ClusterArn: js.UndefOr[ArnType]
    var ClusterId: js.UndefOr[ClusterId]
    var InstanceGroupId: js.UndefOr[InstanceGroupId]
  }

  object PutAutoScalingPolicyOutput {
    @inline
    def apply(
        AutoScalingPolicy: js.UndefOr[AutoScalingPolicyDescription] = js.undefined,
        ClusterArn: js.UndefOr[ArnType] = js.undefined,
        ClusterId: js.UndefOr[ClusterId] = js.undefined,
        InstanceGroupId: js.UndefOr[InstanceGroupId] = js.undefined
    ): PutAutoScalingPolicyOutput = {
      val __obj = js.Dynamic.literal()
      AutoScalingPolicy.foreach(__v => __obj.updateDynamic("AutoScalingPolicy")(__v.asInstanceOf[js.Any]))
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      ClusterId.foreach(__v => __obj.updateDynamic("ClusterId")(__v.asInstanceOf[js.Any]))
      InstanceGroupId.foreach(__v => __obj.updateDynamic("InstanceGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAutoScalingPolicyOutput]
    }
  }

  @js.native
  trait PutBlockPublicAccessConfigurationInput extends js.Object {
    var BlockPublicAccessConfiguration: BlockPublicAccessConfiguration
  }

  object PutBlockPublicAccessConfigurationInput {
    @inline
    def apply(
        BlockPublicAccessConfiguration: BlockPublicAccessConfiguration
    ): PutBlockPublicAccessConfigurationInput = {
      val __obj = js.Dynamic.literal(
        "BlockPublicAccessConfiguration" -> BlockPublicAccessConfiguration.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutBlockPublicAccessConfigurationInput]
    }
  }

  @js.native
  trait PutBlockPublicAccessConfigurationOutput extends js.Object {}

  object PutBlockPublicAccessConfigurationOutput {
    @inline
    def apply(
    ): PutBlockPublicAccessConfigurationOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutBlockPublicAccessConfigurationOutput]
    }
  }

  @js.native
  trait PutManagedScalingPolicyInput extends js.Object {
    var ClusterId: ClusterId
    var ManagedScalingPolicy: ManagedScalingPolicy
  }

  object PutManagedScalingPolicyInput {
    @inline
    def apply(
        ClusterId: ClusterId,
        ManagedScalingPolicy: ManagedScalingPolicy
    ): PutManagedScalingPolicyInput = {
      val __obj = js.Dynamic.literal(
        "ClusterId" -> ClusterId.asInstanceOf[js.Any],
        "ManagedScalingPolicy" -> ManagedScalingPolicy.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutManagedScalingPolicyInput]
    }
  }

  @js.native
  trait PutManagedScalingPolicyOutput extends js.Object {}

  object PutManagedScalingPolicyOutput {
    @inline
    def apply(
    ): PutManagedScalingPolicyOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutManagedScalingPolicyOutput]
    }
  }

  @js.native
  trait RemoveAutoScalingPolicyInput extends js.Object {
    var ClusterId: ClusterId
    var InstanceGroupId: InstanceGroupId
  }

  object RemoveAutoScalingPolicyInput {
    @inline
    def apply(
        ClusterId: ClusterId,
        InstanceGroupId: InstanceGroupId
    ): RemoveAutoScalingPolicyInput = {
      val __obj = js.Dynamic.literal(
        "ClusterId" -> ClusterId.asInstanceOf[js.Any],
        "InstanceGroupId" -> InstanceGroupId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveAutoScalingPolicyInput]
    }
  }

  @js.native
  trait RemoveAutoScalingPolicyOutput extends js.Object {}

  object RemoveAutoScalingPolicyOutput {
    @inline
    def apply(
    ): RemoveAutoScalingPolicyOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RemoveAutoScalingPolicyOutput]
    }
  }

  @js.native
  trait RemoveManagedScalingPolicyInput extends js.Object {
    var ClusterId: ClusterId
  }

  object RemoveManagedScalingPolicyInput {
    @inline
    def apply(
        ClusterId: ClusterId
    ): RemoveManagedScalingPolicyInput = {
      val __obj = js.Dynamic.literal(
        "ClusterId" -> ClusterId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveManagedScalingPolicyInput]
    }
  }

  @js.native
  trait RemoveManagedScalingPolicyOutput extends js.Object {}

  object RemoveManagedScalingPolicyOutput {
    @inline
    def apply(
    ): RemoveManagedScalingPolicyOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RemoveManagedScalingPolicyOutput]
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
    @inline
    def apply(
        ResourceId: ResourceId,
        TagKeys: StringList
    ): RemoveTagsInput = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveTagsInput]
    }
  }

  /**
    * This output indicates the result of removing tags from a resource.
    */
  @js.native
  trait RemoveTagsOutput extends js.Object {}

  object RemoveTagsOutput {
    @inline
    def apply(
    ): RemoveTagsOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RemoveTagsOutput]
    }
  }

  @js.native
  sealed trait RepoUpgradeOnBoot extends js.Any
  object RepoUpgradeOnBoot extends js.Object {
    val SECURITY = "SECURITY".asInstanceOf[RepoUpgradeOnBoot]
    val NONE = "NONE".asInstanceOf[RepoUpgradeOnBoot]

    val values = js.Object.freeze(js.Array(SECURITY, NONE))
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
    var LogEncryptionKmsKeyId: js.UndefOr[XmlString]
    var LogUri: js.UndefOr[XmlString]
    var ManagedScalingPolicy: js.UndefOr[ManagedScalingPolicy]
    var NewSupportedProducts: js.UndefOr[NewSupportedProductsList]
    var ReleaseLabel: js.UndefOr[XmlStringMaxLen256]
    var RepoUpgradeOnBoot: js.UndefOr[RepoUpgradeOnBoot]
    var ScaleDownBehavior: js.UndefOr[ScaleDownBehavior]
    var SecurityConfiguration: js.UndefOr[XmlString]
    var ServiceRole: js.UndefOr[XmlString]
    var StepConcurrencyLevel: js.UndefOr[Int]
    var Steps: js.UndefOr[StepConfigList]
    var SupportedProducts: js.UndefOr[SupportedProductsList]
    var Tags: js.UndefOr[TagList]
    var VisibleToAllUsers: js.UndefOr[Boolean]
  }

  object RunJobFlowInput {
    @inline
    def apply(
        Instances: JobFlowInstancesConfig,
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
        LogEncryptionKmsKeyId: js.UndefOr[XmlString] = js.undefined,
        LogUri: js.UndefOr[XmlString] = js.undefined,
        ManagedScalingPolicy: js.UndefOr[ManagedScalingPolicy] = js.undefined,
        NewSupportedProducts: js.UndefOr[NewSupportedProductsList] = js.undefined,
        ReleaseLabel: js.UndefOr[XmlStringMaxLen256] = js.undefined,
        RepoUpgradeOnBoot: js.UndefOr[RepoUpgradeOnBoot] = js.undefined,
        ScaleDownBehavior: js.UndefOr[ScaleDownBehavior] = js.undefined,
        SecurityConfiguration: js.UndefOr[XmlString] = js.undefined,
        ServiceRole: js.UndefOr[XmlString] = js.undefined,
        StepConcurrencyLevel: js.UndefOr[Int] = js.undefined,
        Steps: js.UndefOr[StepConfigList] = js.undefined,
        SupportedProducts: js.UndefOr[SupportedProductsList] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VisibleToAllUsers: js.UndefOr[Boolean] = js.undefined
    ): RunJobFlowInput = {
      val __obj = js.Dynamic.literal(
        "Instances" -> Instances.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AdditionalInfo.foreach(__v => __obj.updateDynamic("AdditionalInfo")(__v.asInstanceOf[js.Any]))
      AmiVersion.foreach(__v => __obj.updateDynamic("AmiVersion")(__v.asInstanceOf[js.Any]))
      Applications.foreach(__v => __obj.updateDynamic("Applications")(__v.asInstanceOf[js.Any]))
      AutoScalingRole.foreach(__v => __obj.updateDynamic("AutoScalingRole")(__v.asInstanceOf[js.Any]))
      BootstrapActions.foreach(__v => __obj.updateDynamic("BootstrapActions")(__v.asInstanceOf[js.Any]))
      Configurations.foreach(__v => __obj.updateDynamic("Configurations")(__v.asInstanceOf[js.Any]))
      CustomAmiId.foreach(__v => __obj.updateDynamic("CustomAmiId")(__v.asInstanceOf[js.Any]))
      EbsRootVolumeSize.foreach(__v => __obj.updateDynamic("EbsRootVolumeSize")(__v.asInstanceOf[js.Any]))
      JobFlowRole.foreach(__v => __obj.updateDynamic("JobFlowRole")(__v.asInstanceOf[js.Any]))
      KerberosAttributes.foreach(__v => __obj.updateDynamic("KerberosAttributes")(__v.asInstanceOf[js.Any]))
      LogEncryptionKmsKeyId.foreach(__v => __obj.updateDynamic("LogEncryptionKmsKeyId")(__v.asInstanceOf[js.Any]))
      LogUri.foreach(__v => __obj.updateDynamic("LogUri")(__v.asInstanceOf[js.Any]))
      ManagedScalingPolicy.foreach(__v => __obj.updateDynamic("ManagedScalingPolicy")(__v.asInstanceOf[js.Any]))
      NewSupportedProducts.foreach(__v => __obj.updateDynamic("NewSupportedProducts")(__v.asInstanceOf[js.Any]))
      ReleaseLabel.foreach(__v => __obj.updateDynamic("ReleaseLabel")(__v.asInstanceOf[js.Any]))
      RepoUpgradeOnBoot.foreach(__v => __obj.updateDynamic("RepoUpgradeOnBoot")(__v.asInstanceOf[js.Any]))
      ScaleDownBehavior.foreach(__v => __obj.updateDynamic("ScaleDownBehavior")(__v.asInstanceOf[js.Any]))
      SecurityConfiguration.foreach(__v => __obj.updateDynamic("SecurityConfiguration")(__v.asInstanceOf[js.Any]))
      ServiceRole.foreach(__v => __obj.updateDynamic("ServiceRole")(__v.asInstanceOf[js.Any]))
      StepConcurrencyLevel.foreach(__v => __obj.updateDynamic("StepConcurrencyLevel")(__v.asInstanceOf[js.Any]))
      Steps.foreach(__v => __obj.updateDynamic("Steps")(__v.asInstanceOf[js.Any]))
      SupportedProducts.foreach(__v => __obj.updateDynamic("SupportedProducts")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VisibleToAllUsers.foreach(__v => __obj.updateDynamic("VisibleToAllUsers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RunJobFlowInput]
    }
  }

  /**
    * The result of the <a>RunJobFlow</a> operation.
    */
  @js.native
  trait RunJobFlowOutput extends js.Object {
    var ClusterArn: js.UndefOr[ArnType]
    var JobFlowId: js.UndefOr[XmlStringMaxLen256]
  }

  object RunJobFlowOutput {
    @inline
    def apply(
        ClusterArn: js.UndefOr[ArnType] = js.undefined,
        JobFlowId: js.UndefOr[XmlStringMaxLen256] = js.undefined
    ): RunJobFlowOutput = {
      val __obj = js.Dynamic.literal()
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      JobFlowId.foreach(__v => __obj.updateDynamic("JobFlowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RunJobFlowOutput]
    }
  }

  @js.native
  sealed trait ScaleDownBehavior extends js.Any
  object ScaleDownBehavior extends js.Object {
    val TERMINATE_AT_INSTANCE_HOUR = "TERMINATE_AT_INSTANCE_HOUR".asInstanceOf[ScaleDownBehavior]
    val TERMINATE_AT_TASK_COMPLETION = "TERMINATE_AT_TASK_COMPLETION".asInstanceOf[ScaleDownBehavior]

    val values = js.Object.freeze(js.Array(TERMINATE_AT_INSTANCE_HOUR, TERMINATE_AT_TASK_COMPLETION))
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
    @inline
    def apply(
        SimpleScalingPolicyConfiguration: SimpleScalingPolicyConfiguration,
        Market: js.UndefOr[MarketType] = js.undefined
    ): ScalingAction = {
      val __obj = js.Dynamic.literal(
        "SimpleScalingPolicyConfiguration" -> SimpleScalingPolicyConfiguration.asInstanceOf[js.Any]
      )

      Market.foreach(__v => __obj.updateDynamic("Market")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScalingAction]
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
    @inline
    def apply(
        MaxCapacity: Int,
        MinCapacity: Int
    ): ScalingConstraints = {
      val __obj = js.Dynamic.literal(
        "MaxCapacity" -> MaxCapacity.asInstanceOf[js.Any],
        "MinCapacity" -> MinCapacity.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ScalingConstraints]
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
    @inline
    def apply(
        Action: ScalingAction,
        Name: String,
        Trigger: ScalingTrigger,
        Description: js.UndefOr[String] = js.undefined
    ): ScalingRule = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Trigger" -> Trigger.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScalingRule]
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
    @inline
    def apply(
        CloudWatchAlarmDefinition: CloudWatchAlarmDefinition
    ): ScalingTrigger = {
      val __obj = js.Dynamic.literal(
        "CloudWatchAlarmDefinition" -> CloudWatchAlarmDefinition.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ScalingTrigger]
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
    @inline
    def apply(
        Path: XmlString,
        Args: js.UndefOr[XmlStringList] = js.undefined
    ): ScriptBootstrapActionConfig = {
      val __obj = js.Dynamic.literal(
        "Path" -> Path.asInstanceOf[js.Any]
      )

      Args.foreach(__v => __obj.updateDynamic("Args")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScriptBootstrapActionConfig]
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
    @inline
    def apply(
        CreationDateTime: js.UndefOr[Date] = js.undefined,
        Name: js.UndefOr[XmlString] = js.undefined
    ): SecurityConfigurationSummary = {
      val __obj = js.Dynamic.literal()
      CreationDateTime.foreach(__v => __obj.updateDynamic("CreationDateTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityConfigurationSummary]
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
    @inline
    def apply(
        JobFlowIds: XmlStringList,
        TerminationProtected: Boolean
    ): SetTerminationProtectionInput = {
      val __obj = js.Dynamic.literal(
        "JobFlowIds" -> JobFlowIds.asInstanceOf[js.Any],
        "TerminationProtected" -> TerminationProtected.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetTerminationProtectionInput]
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
    @inline
    def apply(
        JobFlowIds: XmlStringList,
        VisibleToAllUsers: Boolean
    ): SetVisibleToAllUsersInput = {
      val __obj = js.Dynamic.literal(
        "JobFlowIds" -> JobFlowIds.asInstanceOf[js.Any],
        "VisibleToAllUsers" -> VisibleToAllUsers.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetVisibleToAllUsersInput]
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
    @inline
    def apply(
        DecommissionTimeout: js.UndefOr[Int] = js.undefined,
        InstanceResizePolicy: js.UndefOr[InstanceResizePolicy] = js.undefined
    ): ShrinkPolicy = {
      val __obj = js.Dynamic.literal()
      DecommissionTimeout.foreach(__v => __obj.updateDynamic("DecommissionTimeout")(__v.asInstanceOf[js.Any]))
      InstanceResizePolicy.foreach(__v => __obj.updateDynamic("InstanceResizePolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ShrinkPolicy]
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
    @inline
    def apply(
        ScalingAdjustment: Int,
        AdjustmentType: js.UndefOr[AdjustmentType] = js.undefined,
        CoolDown: js.UndefOr[Int] = js.undefined
    ): SimpleScalingPolicyConfiguration = {
      val __obj = js.Dynamic.literal(
        "ScalingAdjustment" -> ScalingAdjustment.asInstanceOf[js.Any]
      )

      AdjustmentType.foreach(__v => __obj.updateDynamic("AdjustmentType")(__v.asInstanceOf[js.Any]))
      CoolDown.foreach(__v => __obj.updateDynamic("CoolDown")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimpleScalingPolicyConfiguration]
    }
  }

  @js.native
  sealed trait SpotProvisioningAllocationStrategy extends js.Any
  object SpotProvisioningAllocationStrategy extends js.Object {
    val `capacity-optimized` = "capacity-optimized".asInstanceOf[SpotProvisioningAllocationStrategy]

    val values = js.Object.freeze(js.Array(`capacity-optimized`))
  }

  /**
    * The launch specification for Spot instances in the instance fleet, which determines the defined duration, provisioning timeout behavior, and allocation strategy.
    *
    * '''Note:'''The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. Spot instance allocation strategy is available in Amazon EMR version 5.12.1 and later.
    */
  @js.native
  trait SpotProvisioningSpecification extends js.Object {
    var TimeoutAction: SpotProvisioningTimeoutAction
    var TimeoutDurationMinutes: WholeNumber
    var AllocationStrategy: js.UndefOr[SpotProvisioningAllocationStrategy]
    var BlockDurationMinutes: js.UndefOr[WholeNumber]
  }

  object SpotProvisioningSpecification {
    @inline
    def apply(
        TimeoutAction: SpotProvisioningTimeoutAction,
        TimeoutDurationMinutes: WholeNumber,
        AllocationStrategy: js.UndefOr[SpotProvisioningAllocationStrategy] = js.undefined,
        BlockDurationMinutes: js.UndefOr[WholeNumber] = js.undefined
    ): SpotProvisioningSpecification = {
      val __obj = js.Dynamic.literal(
        "TimeoutAction" -> TimeoutAction.asInstanceOf[js.Any],
        "TimeoutDurationMinutes" -> TimeoutDurationMinutes.asInstanceOf[js.Any]
      )

      AllocationStrategy.foreach(__v => __obj.updateDynamic("AllocationStrategy")(__v.asInstanceOf[js.Any]))
      BlockDurationMinutes.foreach(__v => __obj.updateDynamic("BlockDurationMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SpotProvisioningSpecification]
    }
  }

  @js.native
  sealed trait SpotProvisioningTimeoutAction extends js.Any
  object SpotProvisioningTimeoutAction extends js.Object {
    val SWITCH_TO_ON_DEMAND = "SWITCH_TO_ON_DEMAND".asInstanceOf[SpotProvisioningTimeoutAction]
    val TERMINATE_CLUSTER = "TERMINATE_CLUSTER".asInstanceOf[SpotProvisioningTimeoutAction]

    val values = js.Object.freeze(js.Array(SWITCH_TO_ON_DEMAND, TERMINATE_CLUSTER))
  }

  @js.native
  sealed trait Statistic extends js.Any
  object Statistic extends js.Object {
    val SAMPLE_COUNT = "SAMPLE_COUNT".asInstanceOf[Statistic]
    val AVERAGE = "AVERAGE".asInstanceOf[Statistic]
    val SUM = "SUM".asInstanceOf[Statistic]
    val MINIMUM = "MINIMUM".asInstanceOf[Statistic]
    val MAXIMUM = "MAXIMUM".asInstanceOf[Statistic]

    val values = js.Object.freeze(js.Array(SAMPLE_COUNT, AVERAGE, SUM, MINIMUM, MAXIMUM))
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
    @inline
    def apply(
        ActionOnFailure: js.UndefOr[ActionOnFailure] = js.undefined,
        Config: js.UndefOr[HadoopStepConfig] = js.undefined,
        Id: js.UndefOr[StepId] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StepStatus] = js.undefined
    ): Step = {
      val __obj = js.Dynamic.literal()
      ActionOnFailure.foreach(__v => __obj.updateDynamic("ActionOnFailure")(__v.asInstanceOf[js.Any]))
      Config.foreach(__v => __obj.updateDynamic("Config")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Step]
    }
  }

  @js.native
  sealed trait StepCancellationOption extends js.Any
  object StepCancellationOption extends js.Object {
    val SEND_INTERRUPT = "SEND_INTERRUPT".asInstanceOf[StepCancellationOption]
    val TERMINATE_PROCESS = "TERMINATE_PROCESS".asInstanceOf[StepCancellationOption]

    val values = js.Object.freeze(js.Array(SEND_INTERRUPT, TERMINATE_PROCESS))
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
    @inline
    def apply(
        HadoopJarStep: HadoopJarStepConfig,
        Name: XmlStringMaxLen256,
        ActionOnFailure: js.UndefOr[ActionOnFailure] = js.undefined
    ): StepConfig = {
      val __obj = js.Dynamic.literal(
        "HadoopJarStep" -> HadoopJarStep.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ActionOnFailure.foreach(__v => __obj.updateDynamic("ActionOnFailure")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StepConfig]
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
    @inline
    def apply(
        ExecutionStatusDetail: StepExecutionStatusDetail,
        StepConfig: StepConfig
    ): StepDetail = {
      val __obj = js.Dynamic.literal(
        "ExecutionStatusDetail" -> ExecutionStatusDetail.asInstanceOf[js.Any],
        "StepConfig" -> StepConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StepDetail]
    }
  }

  @js.native
  sealed trait StepExecutionState extends js.Any
  object StepExecutionState extends js.Object {
    val PENDING = "PENDING".asInstanceOf[StepExecutionState]
    val RUNNING = "RUNNING".asInstanceOf[StepExecutionState]
    val CONTINUE = "CONTINUE".asInstanceOf[StepExecutionState]
    val COMPLETED = "COMPLETED".asInstanceOf[StepExecutionState]
    val CANCELLED = "CANCELLED".asInstanceOf[StepExecutionState]
    val FAILED = "FAILED".asInstanceOf[StepExecutionState]
    val INTERRUPTED = "INTERRUPTED".asInstanceOf[StepExecutionState]

    val values = js.Object.freeze(js.Array(PENDING, RUNNING, CONTINUE, COMPLETED, CANCELLED, FAILED, INTERRUPTED))
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
    @inline
    def apply(
        CreationDateTime: Date,
        State: StepExecutionState,
        EndDateTime: js.UndefOr[Date] = js.undefined,
        LastStateChangeReason: js.UndefOr[XmlString] = js.undefined,
        StartDateTime: js.UndefOr[Date] = js.undefined
    ): StepExecutionStatusDetail = {
      val __obj = js.Dynamic.literal(
        "CreationDateTime" -> CreationDateTime.asInstanceOf[js.Any],
        "State" -> State.asInstanceOf[js.Any]
      )

      EndDateTime.foreach(__v => __obj.updateDynamic("EndDateTime")(__v.asInstanceOf[js.Any]))
      LastStateChangeReason.foreach(__v => __obj.updateDynamic("LastStateChangeReason")(__v.asInstanceOf[js.Any]))
      StartDateTime.foreach(__v => __obj.updateDynamic("StartDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StepExecutionStatusDetail]
    }
  }

  @js.native
  sealed trait StepState extends js.Any
  object StepState extends js.Object {
    val PENDING = "PENDING".asInstanceOf[StepState]
    val CANCEL_PENDING = "CANCEL_PENDING".asInstanceOf[StepState]
    val RUNNING = "RUNNING".asInstanceOf[StepState]
    val COMPLETED = "COMPLETED".asInstanceOf[StepState]
    val CANCELLED = "CANCELLED".asInstanceOf[StepState]
    val FAILED = "FAILED".asInstanceOf[StepState]
    val INTERRUPTED = "INTERRUPTED".asInstanceOf[StepState]

    val values = js.Object.freeze(js.Array(PENDING, CANCEL_PENDING, RUNNING, COMPLETED, CANCELLED, FAILED, INTERRUPTED))
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
    @inline
    def apply(
        Code: js.UndefOr[StepStateChangeReasonCode] = js.undefined,
        Message: js.UndefOr[String] = js.undefined
    ): StepStateChangeReason = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StepStateChangeReason]
    }
  }

  @js.native
  sealed trait StepStateChangeReasonCode extends js.Any
  object StepStateChangeReasonCode extends js.Object {
    val NONE = "NONE".asInstanceOf[StepStateChangeReasonCode]

    val values = js.Object.freeze(js.Array(NONE))
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
    @inline
    def apply(
        FailureDetails: js.UndefOr[FailureDetails] = js.undefined,
        State: js.UndefOr[StepState] = js.undefined,
        StateChangeReason: js.UndefOr[StepStateChangeReason] = js.undefined,
        Timeline: js.UndefOr[StepTimeline] = js.undefined
    ): StepStatus = {
      val __obj = js.Dynamic.literal()
      FailureDetails.foreach(__v => __obj.updateDynamic("FailureDetails")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateChangeReason.foreach(__v => __obj.updateDynamic("StateChangeReason")(__v.asInstanceOf[js.Any]))
      Timeline.foreach(__v => __obj.updateDynamic("Timeline")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StepStatus]
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
    @inline
    def apply(
        ActionOnFailure: js.UndefOr[ActionOnFailure] = js.undefined,
        Config: js.UndefOr[HadoopStepConfig] = js.undefined,
        Id: js.UndefOr[StepId] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StepStatus] = js.undefined
    ): StepSummary = {
      val __obj = js.Dynamic.literal()
      ActionOnFailure.foreach(__v => __obj.updateDynamic("ActionOnFailure")(__v.asInstanceOf[js.Any]))
      Config.foreach(__v => __obj.updateDynamic("Config")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StepSummary]
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
    @inline
    def apply(
        CreationDateTime: js.UndefOr[Date] = js.undefined,
        EndDateTime: js.UndefOr[Date] = js.undefined,
        StartDateTime: js.UndefOr[Date] = js.undefined
    ): StepTimeline = {
      val __obj = js.Dynamic.literal()
      CreationDateTime.foreach(__v => __obj.updateDynamic("CreationDateTime")(__v.asInstanceOf[js.Any]))
      EndDateTime.foreach(__v => __obj.updateDynamic("EndDateTime")(__v.asInstanceOf[js.Any]))
      StartDateTime.foreach(__v => __obj.updateDynamic("StartDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StepTimeline]
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
    @inline
    def apply(
        Args: js.UndefOr[XmlStringList] = js.undefined,
        Name: js.UndefOr[XmlStringMaxLen256] = js.undefined
    ): SupportedProductConfig = {
      val __obj = js.Dynamic.literal()
      Args.foreach(__v => __obj.updateDynamic("Args")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SupportedProductConfig]
    }
  }

  /**
    * A key/value pair containing user-defined metadata that you can associate with an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as grouping clusters to track your Amazon EMR resource allocation costs. For more information, see [[https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html|Tag Clusters]].
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Tag {
    @inline
    def apply(
        Key: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
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
    @inline
    def apply(
        JobFlowIds: XmlStringList
    ): TerminateJobFlowsInput = {
      val __obj = js.Dynamic.literal(
        "JobFlowIds" -> JobFlowIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TerminateJobFlowsInput]
    }
  }

  @js.native
  sealed trait Unit extends js.Any
  object Unit extends js.Object {
    val NONE = "NONE".asInstanceOf[Unit]
    val SECONDS = "SECONDS".asInstanceOf[Unit]
    val MICRO_SECONDS = "MICRO_SECONDS".asInstanceOf[Unit]
    val MILLI_SECONDS = "MILLI_SECONDS".asInstanceOf[Unit]
    val BYTES = "BYTES".asInstanceOf[Unit]
    val KILO_BYTES = "KILO_BYTES".asInstanceOf[Unit]
    val MEGA_BYTES = "MEGA_BYTES".asInstanceOf[Unit]
    val GIGA_BYTES = "GIGA_BYTES".asInstanceOf[Unit]
    val TERA_BYTES = "TERA_BYTES".asInstanceOf[Unit]
    val BITS = "BITS".asInstanceOf[Unit]
    val KILO_BITS = "KILO_BITS".asInstanceOf[Unit]
    val MEGA_BITS = "MEGA_BITS".asInstanceOf[Unit]
    val GIGA_BITS = "GIGA_BITS".asInstanceOf[Unit]
    val TERA_BITS = "TERA_BITS".asInstanceOf[Unit]
    val PERCENT = "PERCENT".asInstanceOf[Unit]
    val COUNT = "COUNT".asInstanceOf[Unit]
    val BYTES_PER_SECOND = "BYTES_PER_SECOND".asInstanceOf[Unit]
    val KILO_BYTES_PER_SECOND = "KILO_BYTES_PER_SECOND".asInstanceOf[Unit]
    val MEGA_BYTES_PER_SECOND = "MEGA_BYTES_PER_SECOND".asInstanceOf[Unit]
    val GIGA_BYTES_PER_SECOND = "GIGA_BYTES_PER_SECOND".asInstanceOf[Unit]
    val TERA_BYTES_PER_SECOND = "TERA_BYTES_PER_SECOND".asInstanceOf[Unit]
    val BITS_PER_SECOND = "BITS_PER_SECOND".asInstanceOf[Unit]
    val KILO_BITS_PER_SECOND = "KILO_BITS_PER_SECOND".asInstanceOf[Unit]
    val MEGA_BITS_PER_SECOND = "MEGA_BITS_PER_SECOND".asInstanceOf[Unit]
    val GIGA_BITS_PER_SECOND = "GIGA_BITS_PER_SECOND".asInstanceOf[Unit]
    val TERA_BITS_PER_SECOND = "TERA_BITS_PER_SECOND".asInstanceOf[Unit]
    val COUNT_PER_SECOND = "COUNT_PER_SECOND".asInstanceOf[Unit]

    val values = js.Object.freeze(
      js.Array(
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
    @inline
    def apply(
        SizeInGB: Int,
        VolumeType: String,
        Iops: js.UndefOr[Int] = js.undefined
    ): VolumeSpecification = {
      val __obj = js.Dynamic.literal(
        "SizeInGB" -> SizeInGB.asInstanceOf[js.Any],
        "VolumeType" -> VolumeType.asInstanceOf[js.Any]
      )

      Iops.foreach(__v => __obj.updateDynamic("Iops")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VolumeSpecification]
    }
  }
}
