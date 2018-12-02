package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object cloudformation {
  type Account = String
  type AccountGateStatus = String
  type AccountGateStatusReason = String
  type AccountLimitList = js.Array[AccountLimit]
  type AccountList = js.Array[Account]
  type AllowedValue = String
  type AllowedValues = js.Array[AllowedValue]
  type Arn = String
  type BoxedInteger = Int
  type BoxedMaxResults = Int
  type Capabilities = js.Array[Capability]
  type CapabilitiesReason = String
  type Capability = String
  type CausingEntity = String
  type ChangeAction = String
  type ChangeSetId = String
  type ChangeSetName = String
  type ChangeSetNameOrId = String
  type ChangeSetStatus = String
  type ChangeSetStatusReason = String
  type ChangeSetSummaries = js.Array[ChangeSetSummary]
  type ChangeSetType = String
  type ChangeSource = String
  type ChangeType = String
  type Changes = js.Array[Change]
  type ClientRequestToken = String
  type ClientToken = String
  type CreationTime = js.Date
  type DeletionTime = js.Date
  type Description = String
  type DifferenceType = String
  type DisableRollback = Boolean
  type EnableTerminationProtection = Boolean
  type EvaluationType = String
  type EventId = String
  type ExecutionRoleName = String
  type ExecutionStatus = String
  type ExportName = String
  type ExportValue = String
  type Exports = js.Array[Export]
  type FailureToleranceCount = Int
  type FailureTolerancePercentage = Int
  type Imports = js.Array[StackName]
  type Key = String
  type LastUpdatedTime = js.Date
  type LimitName = String
  type LimitValue = Int
  type LogicalResourceId = String
  type LogicalResourceIds = js.Array[LogicalResourceId]
  type MaxConcurrentCount = Int
  type MaxConcurrentPercentage = Int
  type MaxResults = Int
  type Metadata = String
  type MonitoringTimeInMinutes = Int
  type NextToken = String
  type NoEcho = Boolean
  type NotificationARN = String
  type NotificationARNs = js.Array[NotificationARN]
  type OnFailure = String
  type OutputKey = String
  type OutputValue = String
  type Outputs = js.Array[Output]
  type ParameterDeclarations = js.Array[ParameterDeclaration]
  type ParameterKey = String
  type ParameterType = String
  type ParameterValue = String
  type Parameters = js.Array[Parameter]
  type PhysicalResourceId = String
  type PhysicalResourceIdContext = js.Array[PhysicalResourceIdContextKeyValuePair]
  type Properties = String
  type PropertyDifferences = js.Array[PropertyDifference]
  type PropertyName = String
  type PropertyPath = String
  type PropertyValue = String
  type Reason = String
  type Region = String
  type RegionList = js.Array[Region]
  type Replacement = String
  type RequiresRecreation = String
  type ResourceAttribute = String
  type ResourceChangeDetails = js.Array[ResourceChangeDetail]
  type ResourceProperties = String
  type ResourceSignalStatus = String
  type ResourceSignalUniqueId = String
  type ResourceStatus = String
  type ResourceStatusReason = String
  type ResourceToSkip = String
  type ResourceType = String
  type ResourceTypes = js.Array[ResourceType]
  type ResourcesToSkip = js.Array[ResourceToSkip]
  type RetainResources = js.Array[LogicalResourceId]
  type RetainStacks = Boolean
  type RetainStacksNullable = Boolean
  type RoleARN = String
  type RollbackTriggers = js.Array[RollbackTrigger]
  type Scope = js.Array[ResourceAttribute]
  type StackDriftDetectionId = String
  type StackDriftDetectionStatus = String
  type StackDriftDetectionStatusReason = String
  type StackDriftStatus = String
  type StackEvents = js.Array[StackEvent]
  type StackId = String
  type StackInstanceStatus = String
  type StackInstanceSummaries = js.Array[StackInstanceSummary]
  type StackName = String
  type StackNameOrId = String
  type StackPolicyBody = String
  type StackPolicyDuringUpdateBody = String
  type StackPolicyDuringUpdateURL = String
  type StackPolicyURL = String
  type StackResourceDriftStatus = String
  type StackResourceDriftStatusFilters = js.Array[StackResourceDriftStatus]
  type StackResourceDrifts = js.Array[StackResourceDrift]
  type StackResourceSummaries = js.Array[StackResourceSummary]
  type StackResources = js.Array[StackResource]
  type StackSetARN = String
  type StackSetId = String
  type StackSetName = String
  type StackSetNameOrId = String
  type StackSetOperationAction = String
  type StackSetOperationResultStatus = String
  type StackSetOperationResultSummaries = js.Array[StackSetOperationResultSummary]
  type StackSetOperationStatus = String
  type StackSetOperationSummaries = js.Array[StackSetOperationSummary]
  type StackSetStatus = String
  type StackSetSummaries = js.Array[StackSetSummary]
  type StackStatus = String
  type StackStatusFilter = js.Array[StackStatus]
  type StackStatusReason = String
  type StackSummaries = js.Array[StackSummary]
  type Stacks = js.Array[Stack]
  type StageList = js.Array[TemplateStage]
  type TagKey = String
  type TagValue = String
  type Tags = js.Array[Tag]
  type TemplateBody = String
  type TemplateDescription = String
  type TemplateParameters = js.Array[TemplateParameter]
  type TemplateStage = String
  type TemplateURL = String
  type TimeoutMinutes = Int
  type Timestamp = js.Date
  type TransformName = String
  type TransformsList = js.Array[TransformName]
  type Type = String
  type Url = String
  type UsePreviousTemplate = Boolean
  type UsePreviousValue = Boolean
  type Value = String
  type Version = String
}

package cloudformation {
  @js.native
  @JSImport("aws-sdk", "CloudFormation")
  class CloudFormation(config: AWSConfig) extends js.Object {
    def cancelUpdateStack(params: CancelUpdateStackInput): Request[js.Object] = js.native
    def continueUpdateRollback(params: ContinueUpdateRollbackInput): Request[ContinueUpdateRollbackOutput] = js.native
    def createChangeSet(params: CreateChangeSetInput): Request[CreateChangeSetOutput] = js.native
    def createStack(params: CreateStackInput): Request[CreateStackOutput] = js.native
    def createStackInstances(params: CreateStackInstancesInput): Request[CreateStackInstancesOutput] = js.native
    def createStackSet(params: CreateStackSetInput): Request[CreateStackSetOutput] = js.native
    def deleteChangeSet(params: DeleteChangeSetInput): Request[DeleteChangeSetOutput] = js.native
    def deleteStack(params: DeleteStackInput): Request[js.Object] = js.native
    def deleteStackInstances(params: DeleteStackInstancesInput): Request[DeleteStackInstancesOutput] = js.native
    def deleteStackSet(params: DeleteStackSetInput): Request[DeleteStackSetOutput] = js.native
    def describeAccountLimits(params: DescribeAccountLimitsInput): Request[DescribeAccountLimitsOutput] = js.native
    def describeChangeSet(params: DescribeChangeSetInput): Request[DescribeChangeSetOutput] = js.native
    def describeStackDriftDetectionStatus(params: DescribeStackDriftDetectionStatusInput): Request[DescribeStackDriftDetectionStatusOutput] = js.native
    def describeStackEvents(params: DescribeStackEventsInput): Request[DescribeStackEventsOutput] = js.native
    def describeStackInstance(params: DescribeStackInstanceInput): Request[DescribeStackInstanceOutput] = js.native
    def describeStackResource(params: DescribeStackResourceInput): Request[DescribeStackResourceOutput] = js.native
    def describeStackResourceDrifts(params: DescribeStackResourceDriftsInput): Request[DescribeStackResourceDriftsOutput] = js.native
    def describeStackResources(params: DescribeStackResourcesInput): Request[DescribeStackResourcesOutput] = js.native
    def describeStackSet(params: DescribeStackSetInput): Request[DescribeStackSetOutput] = js.native
    def describeStackSetOperation(params: DescribeStackSetOperationInput): Request[DescribeStackSetOperationOutput] = js.native
    def describeStacks(params: DescribeStacksInput): Request[DescribeStacksOutput] = js.native
    def detectStackDrift(params: DetectStackDriftInput): Request[DetectStackDriftOutput] = js.native
    def detectStackResourceDrift(params: DetectStackResourceDriftInput): Request[DetectStackResourceDriftOutput] = js.native
    def estimateTemplateCost(params: EstimateTemplateCostInput): Request[EstimateTemplateCostOutput] = js.native
    def executeChangeSet(params: ExecuteChangeSetInput): Request[ExecuteChangeSetOutput] = js.native
    def getStackPolicy(params: GetStackPolicyInput): Request[GetStackPolicyOutput] = js.native
    def getTemplate(params: GetTemplateInput): Request[GetTemplateOutput] = js.native
    def getTemplateSummary(params: GetTemplateSummaryInput): Request[GetTemplateSummaryOutput] = js.native
    def listChangeSets(params: ListChangeSetsInput): Request[ListChangeSetsOutput] = js.native
    def listExports(params: ListExportsInput): Request[ListExportsOutput] = js.native
    def listImports(params: ListImportsInput): Request[ListImportsOutput] = js.native
    def listStackInstances(params: ListStackInstancesInput): Request[ListStackInstancesOutput] = js.native
    def listStackResources(params: ListStackResourcesInput): Request[ListStackResourcesOutput] = js.native
    def listStackSetOperationResults(params: ListStackSetOperationResultsInput): Request[ListStackSetOperationResultsOutput] = js.native
    def listStackSetOperations(params: ListStackSetOperationsInput): Request[ListStackSetOperationsOutput] = js.native
    def listStackSets(params: ListStackSetsInput): Request[ListStackSetsOutput] = js.native
    def listStacks(params: ListStacksInput): Request[ListStacksOutput] = js.native
    def setStackPolicy(params: SetStackPolicyInput): Request[js.Object] = js.native
    def signalResource(params: SignalResourceInput): Request[js.Object] = js.native
    def stopStackSetOperation(params: StopStackSetOperationInput): Request[StopStackSetOperationOutput] = js.native
    def updateStack(params: UpdateStackInput): Request[UpdateStackOutput] = js.native
    def updateStackInstances(params: UpdateStackInstancesInput): Request[UpdateStackInstancesOutput] = js.native
    def updateStackSet(params: UpdateStackSetInput): Request[UpdateStackSetOutput] = js.native
    def updateTerminationProtection(params: UpdateTerminationProtectionInput): Request[UpdateTerminationProtectionOutput] = js.native
    def validateTemplate(params: ValidateTemplateInput): Request[ValidateTemplateOutput] = js.native
  }

  /**
   * <p>Structure that contains the results of the account gate function which AWS CloudFormation invokes, if present, before proceeding with a stack set operation in an account and region.</p> <p>For each account and region, AWS CloudFormation lets you specify a Lamdba function that encapsulates any requirements that must be met before CloudFormation can proceed with a stack set operation in that account and region. CloudFormation invokes the function each time a stack set operation is requested for that account and region; if the function returns <code>FAILED</code>, CloudFormation cancels the operation in that account and region, and sets the stack set operation result status for that account and region to <code>FAILED</code>. </p> <p>For more information, see <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-account-gating.html">Configuring a target account gate</a>.</p>
   */
  @js.native
  trait AccountGateResult extends js.Object {
    var Status: js.UndefOr[AccountGateStatus]
    var StatusReason: js.UndefOr[AccountGateStatusReason]
  }

  object AccountGateResult {
    def apply(
      Status: js.UndefOr[AccountGateStatus] = js.undefined,
      StatusReason: js.UndefOr[AccountGateStatusReason] = js.undefined): AccountGateResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusReason" -> StatusReason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountGateResult]
    }
  }

  object AccountGateStatusEnum {
    val SUCCEEDED = "SUCCEEDED"
    val FAILED = "FAILED"
    val SKIPPED = "SKIPPED"

    val values = IndexedSeq(SUCCEEDED, FAILED, SKIPPED)
  }

  /**
   * <p>The AccountLimit data type.</p>
   */
  @js.native
  trait AccountLimit extends js.Object {
    var Name: js.UndefOr[LimitName]
    var Value: js.UndefOr[LimitValue]
  }

  object AccountLimit {
    def apply(
      Name: js.UndefOr[LimitName] = js.undefined,
      Value: js.UndefOr[LimitValue] = js.undefined): AccountLimit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountLimit]
    }
  }

  /**
   * <p>The input for the <a>CancelUpdateStack</a> action.</p>
   */
  @js.native
  trait CancelUpdateStackInput extends js.Object {
    var StackName: StackName
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object CancelUpdateStackInput {
    def apply(
      StackName: StackName,
      ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined): CancelUpdateStackInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackName" -> StackName.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelUpdateStackInput]
    }
  }

  object CapabilityEnum {
    val CAPABILITY_IAM = "CAPABILITY_IAM"
    val CAPABILITY_NAMED_IAM = "CAPABILITY_NAMED_IAM"
    val CAPABILITY_AUTO_EXPAND = "CAPABILITY_AUTO_EXPAND"

    val values = IndexedSeq(CAPABILITY_IAM, CAPABILITY_NAMED_IAM, CAPABILITY_AUTO_EXPAND)
  }

  /**
   * <p>The <code>Change</code> structure describes the changes AWS CloudFormation will perform if you execute the change set.</p>
   */
  @js.native
  trait Change extends js.Object {
    var ResourceChange: js.UndefOr[ResourceChange]
    var Type: js.UndefOr[ChangeType]
  }

  object Change {
    def apply(
      ResourceChange: js.UndefOr[ResourceChange] = js.undefined,
      Type: js.UndefOr[ChangeType] = js.undefined): Change = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceChange" -> ResourceChange.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Change]
    }
  }

  object ChangeActionEnum {
    val Add = "Add"
    val Modify = "Modify"
    val Remove = "Remove"

    val values = IndexedSeq(Add, Modify, Remove)
  }

  object ChangeSetStatusEnum {
    val CREATE_PENDING = "CREATE_PENDING"
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS"
    val CREATE_COMPLETE = "CREATE_COMPLETE"
    val DELETE_COMPLETE = "DELETE_COMPLETE"
    val FAILED = "FAILED"

    val values = IndexedSeq(CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_COMPLETE, DELETE_COMPLETE, FAILED)
  }

  /**
   * <p>The <code>ChangeSetSummary</code> structure describes a change set, its status, and the stack with which it's associated.</p>
   */
  @js.native
  trait ChangeSetSummary extends js.Object {
    var ChangeSetId: js.UndefOr[ChangeSetId]
    var ChangeSetName: js.UndefOr[ChangeSetName]
    var CreationTime: js.UndefOr[CreationTime]
    var Description: js.UndefOr[Description]
    var ExecutionStatus: js.UndefOr[ExecutionStatus]
    var StackId: js.UndefOr[StackId]
    var StackName: js.UndefOr[StackName]
    var Status: js.UndefOr[ChangeSetStatus]
    var StatusReason: js.UndefOr[ChangeSetStatusReason]
  }

  object ChangeSetSummary {
    def apply(
      ChangeSetId: js.UndefOr[ChangeSetId] = js.undefined,
      ChangeSetName: js.UndefOr[ChangeSetName] = js.undefined,
      CreationTime: js.UndefOr[CreationTime] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      ExecutionStatus: js.UndefOr[ExecutionStatus] = js.undefined,
      StackId: js.UndefOr[StackId] = js.undefined,
      StackName: js.UndefOr[StackName] = js.undefined,
      Status: js.UndefOr[ChangeSetStatus] = js.undefined,
      StatusReason: js.UndefOr[ChangeSetStatusReason] = js.undefined): ChangeSetSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeSetId" -> ChangeSetId.map { x => x.asInstanceOf[js.Any] },
        "ChangeSetName" -> ChangeSetName.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ExecutionStatus" -> ExecutionStatus.map { x => x.asInstanceOf[js.Any] },
        "StackId" -> StackId.map { x => x.asInstanceOf[js.Any] },
        "StackName" -> StackName.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusReason" -> StatusReason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeSetSummary]
    }
  }

  object ChangeSetTypeEnum {
    val CREATE = "CREATE"
    val UPDATE = "UPDATE"

    val values = IndexedSeq(CREATE, UPDATE)
  }

  object ChangeSourceEnum {
    val ResourceReference = "ResourceReference"
    val ParameterReference = "ParameterReference"
    val ResourceAttribute = "ResourceAttribute"
    val DirectModification = "DirectModification"
    val Automatic = "Automatic"

    val values = IndexedSeq(ResourceReference, ParameterReference, ResourceAttribute, DirectModification, Automatic)
  }

  object ChangeTypeEnum {
    val Resource = "Resource"

    val values = IndexedSeq(Resource)
  }

  /**
   * <p>The input for the <a>ContinueUpdateRollback</a> action.</p>
   */
  @js.native
  trait ContinueUpdateRollbackInput extends js.Object {
    var StackName: StackNameOrId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var ResourcesToSkip: js.UndefOr[ResourcesToSkip]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object ContinueUpdateRollbackInput {
    def apply(
      StackName: StackNameOrId,
      ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      ResourcesToSkip: js.UndefOr[ResourcesToSkip] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined): ContinueUpdateRollbackInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackName" -> StackName.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "ResourcesToSkip" -> ResourcesToSkip.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContinueUpdateRollbackInput]
    }
  }

  /**
   * <p>The output for a <a>ContinueUpdateRollback</a> action.</p>
   */
  @js.native
  trait ContinueUpdateRollbackOutput extends js.Object {

  }

  object ContinueUpdateRollbackOutput {
    def apply(): ContinueUpdateRollbackOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContinueUpdateRollbackOutput]
    }
  }

  /**
   * <p>The input for the <a>CreateChangeSet</a> action.</p>
   */
  @js.native
  trait CreateChangeSetInput extends js.Object {
    var ChangeSetName: ChangeSetName
    var StackName: StackNameOrId
    var Capabilities: js.UndefOr[Capabilities]
    var ChangeSetType: js.UndefOr[ChangeSetType]
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[Description]
    var NotificationARNs: js.UndefOr[NotificationARNs]
    var Parameters: js.UndefOr[Parameters]
    var ResourceTypes: js.UndefOr[ResourceTypes]
    var RoleARN: js.UndefOr[RoleARN]
    var RollbackConfiguration: js.UndefOr[RollbackConfiguration]
    var Tags: js.UndefOr[Tags]
    var TemplateBody: js.UndefOr[TemplateBody]
    var TemplateURL: js.UndefOr[TemplateURL]
    var UsePreviousTemplate: js.UndefOr[UsePreviousTemplate]
  }

  object CreateChangeSetInput {
    def apply(
      ChangeSetName: ChangeSetName,
      StackName: StackNameOrId,
      Capabilities: js.UndefOr[Capabilities] = js.undefined,
      ChangeSetType: js.UndefOr[ChangeSetType] = js.undefined,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      NotificationARNs: js.UndefOr[NotificationARNs] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      ResourceTypes: js.UndefOr[ResourceTypes] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      RollbackConfiguration: js.UndefOr[RollbackConfiguration] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined,
      TemplateBody: js.UndefOr[TemplateBody] = js.undefined,
      TemplateURL: js.UndefOr[TemplateURL] = js.undefined,
      UsePreviousTemplate: js.UndefOr[UsePreviousTemplate] = js.undefined): CreateChangeSetInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeSetName" -> ChangeSetName.asInstanceOf[js.Any],
        "StackName" -> StackName.asInstanceOf[js.Any],
        "Capabilities" -> Capabilities.map { x => x.asInstanceOf[js.Any] },
        "ChangeSetType" -> ChangeSetType.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "NotificationARNs" -> NotificationARNs.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "ResourceTypes" -> ResourceTypes.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "RollbackConfiguration" -> RollbackConfiguration.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "TemplateBody" -> TemplateBody.map { x => x.asInstanceOf[js.Any] },
        "TemplateURL" -> TemplateURL.map { x => x.asInstanceOf[js.Any] },
        "UsePreviousTemplate" -> UsePreviousTemplate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateChangeSetInput]
    }
  }

  /**
   * <p>The output for the <a>CreateChangeSet</a> action.</p>
   */
  @js.native
  trait CreateChangeSetOutput extends js.Object {
    var Id: js.UndefOr[ChangeSetId]
    var StackId: js.UndefOr[StackId]
  }

  object CreateChangeSetOutput {
    def apply(
      Id: js.UndefOr[ChangeSetId] = js.undefined,
      StackId: js.UndefOr[StackId] = js.undefined): CreateChangeSetOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "StackId" -> StackId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateChangeSetOutput]
    }
  }

  /**
   * <p>The input for <a>CreateStack</a> action.</p>
   */
  @js.native
  trait CreateStackInput extends js.Object {
    var StackName: StackName
    var Capabilities: js.UndefOr[Capabilities]
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var DisableRollback: js.UndefOr[DisableRollback]
    var EnableTerminationProtection: js.UndefOr[EnableTerminationProtection]
    var NotificationARNs: js.UndefOr[NotificationARNs]
    var OnFailure: js.UndefOr[OnFailure]
    var Parameters: js.UndefOr[Parameters]
    var ResourceTypes: js.UndefOr[ResourceTypes]
    var RoleARN: js.UndefOr[RoleARN]
    var RollbackConfiguration: js.UndefOr[RollbackConfiguration]
    var StackPolicyBody: js.UndefOr[StackPolicyBody]
    var StackPolicyURL: js.UndefOr[StackPolicyURL]
    var Tags: js.UndefOr[Tags]
    var TemplateBody: js.UndefOr[TemplateBody]
    var TemplateURL: js.UndefOr[TemplateURL]
    var TimeoutInMinutes: js.UndefOr[TimeoutMinutes]
  }

  object CreateStackInput {
    def apply(
      StackName: StackName,
      Capabilities: js.UndefOr[Capabilities] = js.undefined,
      ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      DisableRollback: js.UndefOr[DisableRollback] = js.undefined,
      EnableTerminationProtection: js.UndefOr[EnableTerminationProtection] = js.undefined,
      NotificationARNs: js.UndefOr[NotificationARNs] = js.undefined,
      OnFailure: js.UndefOr[OnFailure] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      ResourceTypes: js.UndefOr[ResourceTypes] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      RollbackConfiguration: js.UndefOr[RollbackConfiguration] = js.undefined,
      StackPolicyBody: js.UndefOr[StackPolicyBody] = js.undefined,
      StackPolicyURL: js.UndefOr[StackPolicyURL] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined,
      TemplateBody: js.UndefOr[TemplateBody] = js.undefined,
      TemplateURL: js.UndefOr[TemplateURL] = js.undefined,
      TimeoutInMinutes: js.UndefOr[TimeoutMinutes] = js.undefined): CreateStackInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackName" -> StackName.asInstanceOf[js.Any],
        "Capabilities" -> Capabilities.map { x => x.asInstanceOf[js.Any] },
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "DisableRollback" -> DisableRollback.map { x => x.asInstanceOf[js.Any] },
        "EnableTerminationProtection" -> EnableTerminationProtection.map { x => x.asInstanceOf[js.Any] },
        "NotificationARNs" -> NotificationARNs.map { x => x.asInstanceOf[js.Any] },
        "OnFailure" -> OnFailure.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "ResourceTypes" -> ResourceTypes.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "RollbackConfiguration" -> RollbackConfiguration.map { x => x.asInstanceOf[js.Any] },
        "StackPolicyBody" -> StackPolicyBody.map { x => x.asInstanceOf[js.Any] },
        "StackPolicyURL" -> StackPolicyURL.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "TemplateBody" -> TemplateBody.map { x => x.asInstanceOf[js.Any] },
        "TemplateURL" -> TemplateURL.map { x => x.asInstanceOf[js.Any] },
        "TimeoutInMinutes" -> TimeoutInMinutes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStackInput]
    }
  }

  @js.native
  trait CreateStackInstancesInput extends js.Object {
    var Accounts: AccountList
    var Regions: RegionList
    var StackSetName: StackSetName
    var OperationId: js.UndefOr[ClientRequestToken]
    var OperationPreferences: js.UndefOr[StackSetOperationPreferences]
    var ParameterOverrides: js.UndefOr[Parameters]
  }

  object CreateStackInstancesInput {
    def apply(
      Accounts: AccountList,
      Regions: RegionList,
      StackSetName: StackSetName,
      OperationId: js.UndefOr[ClientRequestToken] = js.undefined,
      OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.undefined,
      ParameterOverrides: js.UndefOr[Parameters] = js.undefined): CreateStackInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Accounts" -> Accounts.asInstanceOf[js.Any],
        "Regions" -> Regions.asInstanceOf[js.Any],
        "StackSetName" -> StackSetName.asInstanceOf[js.Any],
        "OperationId" -> OperationId.map { x => x.asInstanceOf[js.Any] },
        "OperationPreferences" -> OperationPreferences.map { x => x.asInstanceOf[js.Any] },
        "ParameterOverrides" -> ParameterOverrides.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStackInstancesInput]
    }
  }

  @js.native
  trait CreateStackInstancesOutput extends js.Object {
    var OperationId: js.UndefOr[ClientRequestToken]
  }

  object CreateStackInstancesOutput {
    def apply(
      OperationId: js.UndefOr[ClientRequestToken] = js.undefined): CreateStackInstancesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OperationId" -> OperationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStackInstancesOutput]
    }
  }

  /**
   * <p>The output for a <a>CreateStack</a> action.</p>
   */
  @js.native
  trait CreateStackOutput extends js.Object {
    var StackId: js.UndefOr[StackId]
  }

  object CreateStackOutput {
    def apply(
      StackId: js.UndefOr[StackId] = js.undefined): CreateStackOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackId" -> StackId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStackOutput]
    }
  }

  @js.native
  trait CreateStackSetInput extends js.Object {
    var StackSetName: StackSetName
    var AdministrationRoleARN: js.UndefOr[RoleARN]
    var Capabilities: js.UndefOr[Capabilities]
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Description: js.UndefOr[Description]
    var ExecutionRoleName: js.UndefOr[ExecutionRoleName]
    var Parameters: js.UndefOr[Parameters]
    var Tags: js.UndefOr[Tags]
    var TemplateBody: js.UndefOr[TemplateBody]
    var TemplateURL: js.UndefOr[TemplateURL]
  }

  object CreateStackSetInput {
    def apply(
      StackSetName: StackSetName,
      AdministrationRoleARN: js.UndefOr[RoleARN] = js.undefined,
      Capabilities: js.UndefOr[Capabilities] = js.undefined,
      ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      ExecutionRoleName: js.UndefOr[ExecutionRoleName] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined,
      TemplateBody: js.UndefOr[TemplateBody] = js.undefined,
      TemplateURL: js.UndefOr[TemplateURL] = js.undefined): CreateStackSetInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackSetName" -> StackSetName.asInstanceOf[js.Any],
        "AdministrationRoleARN" -> AdministrationRoleARN.map { x => x.asInstanceOf[js.Any] },
        "Capabilities" -> Capabilities.map { x => x.asInstanceOf[js.Any] },
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ExecutionRoleName" -> ExecutionRoleName.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "TemplateBody" -> TemplateBody.map { x => x.asInstanceOf[js.Any] },
        "TemplateURL" -> TemplateURL.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStackSetInput]
    }
  }

  @js.native
  trait CreateStackSetOutput extends js.Object {
    var StackSetId: js.UndefOr[StackSetId]
  }

  object CreateStackSetOutput {
    def apply(
      StackSetId: js.UndefOr[StackSetId] = js.undefined): CreateStackSetOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackSetId" -> StackSetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStackSetOutput]
    }
  }

  /**
   * <p>The input for the <a>DeleteChangeSet</a> action.</p>
   */
  @js.native
  trait DeleteChangeSetInput extends js.Object {
    var ChangeSetName: ChangeSetNameOrId
    var StackName: js.UndefOr[StackNameOrId]
  }

  object DeleteChangeSetInput {
    def apply(
      ChangeSetName: ChangeSetNameOrId,
      StackName: js.UndefOr[StackNameOrId] = js.undefined): DeleteChangeSetInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeSetName" -> ChangeSetName.asInstanceOf[js.Any],
        "StackName" -> StackName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteChangeSetInput]
    }
  }

  /**
   * <p>The output for the <a>DeleteChangeSet</a> action.</p>
   */
  @js.native
  trait DeleteChangeSetOutput extends js.Object {

  }

  object DeleteChangeSetOutput {
    def apply(): DeleteChangeSetOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteChangeSetOutput]
    }
  }

  /**
   * <p>The input for <a>DeleteStack</a> action.</p>
   */
  @js.native
  trait DeleteStackInput extends js.Object {
    var StackName: StackName
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var RetainResources: js.UndefOr[RetainResources]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object DeleteStackInput {
    def apply(
      StackName: StackName,
      ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      RetainResources: js.UndefOr[RetainResources] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined): DeleteStackInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackName" -> StackName.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "RetainResources" -> RetainResources.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStackInput]
    }
  }

  @js.native
  trait DeleteStackInstancesInput extends js.Object {
    var Accounts: AccountList
    var Regions: RegionList
    var RetainStacks: RetainStacks
    var StackSetName: StackSetName
    var OperationId: js.UndefOr[ClientRequestToken]
    var OperationPreferences: js.UndefOr[StackSetOperationPreferences]
  }

  object DeleteStackInstancesInput {
    def apply(
      Accounts: AccountList,
      Regions: RegionList,
      RetainStacks: RetainStacks,
      StackSetName: StackSetName,
      OperationId: js.UndefOr[ClientRequestToken] = js.undefined,
      OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.undefined): DeleteStackInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Accounts" -> Accounts.asInstanceOf[js.Any],
        "Regions" -> Regions.asInstanceOf[js.Any],
        "RetainStacks" -> RetainStacks.asInstanceOf[js.Any],
        "StackSetName" -> StackSetName.asInstanceOf[js.Any],
        "OperationId" -> OperationId.map { x => x.asInstanceOf[js.Any] },
        "OperationPreferences" -> OperationPreferences.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStackInstancesInput]
    }
  }

  @js.native
  trait DeleteStackInstancesOutput extends js.Object {
    var OperationId: js.UndefOr[ClientRequestToken]
  }

  object DeleteStackInstancesOutput {
    def apply(
      OperationId: js.UndefOr[ClientRequestToken] = js.undefined): DeleteStackInstancesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OperationId" -> OperationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStackInstancesOutput]
    }
  }

  @js.native
  trait DeleteStackSetInput extends js.Object {
    var StackSetName: StackSetName
  }

  object DeleteStackSetInput {
    def apply(
      StackSetName: StackSetName): DeleteStackSetInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackSetName" -> StackSetName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStackSetInput]
    }
  }

  @js.native
  trait DeleteStackSetOutput extends js.Object {

  }

  object DeleteStackSetOutput {
    def apply(): DeleteStackSetOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStackSetOutput]
    }
  }

  /**
   * <p>The input for the <a>DescribeAccountLimits</a> action.</p>
   */
  @js.native
  trait DescribeAccountLimitsInput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAccountLimitsInput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeAccountLimitsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountLimitsInput]
    }
  }

  /**
   * <p>The output for the <a>DescribeAccountLimits</a> action.</p>
   */
  @js.native
  trait DescribeAccountLimitsOutput extends js.Object {
    var AccountLimits: js.UndefOr[AccountLimitList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAccountLimitsOutput {
    def apply(
      AccountLimits: js.UndefOr[AccountLimitList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeAccountLimitsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountLimits" -> AccountLimits.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountLimitsOutput]
    }
  }

  /**
   * <p>The input for the <a>DescribeChangeSet</a> action.</p>
   */
  @js.native
  trait DescribeChangeSetInput extends js.Object {
    var ChangeSetName: ChangeSetNameOrId
    var NextToken: js.UndefOr[NextToken]
    var StackName: js.UndefOr[StackNameOrId]
  }

  object DescribeChangeSetInput {
    def apply(
      ChangeSetName: ChangeSetNameOrId,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      StackName: js.UndefOr[StackNameOrId] = js.undefined): DescribeChangeSetInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeSetName" -> ChangeSetName.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "StackName" -> StackName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeChangeSetInput]
    }
  }

  /**
   * <p>The output for the <a>DescribeChangeSet</a> action.</p>
   */
  @js.native
  trait DescribeChangeSetOutput extends js.Object {
    var Capabilities: js.UndefOr[Capabilities]
    var ChangeSetId: js.UndefOr[ChangeSetId]
    var ChangeSetName: js.UndefOr[ChangeSetName]
    var Changes: js.UndefOr[Changes]
    var CreationTime: js.UndefOr[CreationTime]
    var Description: js.UndefOr[Description]
    var ExecutionStatus: js.UndefOr[ExecutionStatus]
    var NextToken: js.UndefOr[NextToken]
    var NotificationARNs: js.UndefOr[NotificationARNs]
    var Parameters: js.UndefOr[Parameters]
    var RollbackConfiguration: js.UndefOr[RollbackConfiguration]
    var StackId: js.UndefOr[StackId]
    var StackName: js.UndefOr[StackName]
    var Status: js.UndefOr[ChangeSetStatus]
    var StatusReason: js.UndefOr[ChangeSetStatusReason]
    var Tags: js.UndefOr[Tags]
  }

  object DescribeChangeSetOutput {
    def apply(
      Capabilities: js.UndefOr[Capabilities] = js.undefined,
      ChangeSetId: js.UndefOr[ChangeSetId] = js.undefined,
      ChangeSetName: js.UndefOr[ChangeSetName] = js.undefined,
      Changes: js.UndefOr[Changes] = js.undefined,
      CreationTime: js.UndefOr[CreationTime] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      ExecutionStatus: js.UndefOr[ExecutionStatus] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      NotificationARNs: js.UndefOr[NotificationARNs] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      RollbackConfiguration: js.UndefOr[RollbackConfiguration] = js.undefined,
      StackId: js.UndefOr[StackId] = js.undefined,
      StackName: js.UndefOr[StackName] = js.undefined,
      Status: js.UndefOr[ChangeSetStatus] = js.undefined,
      StatusReason: js.UndefOr[ChangeSetStatusReason] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): DescribeChangeSetOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Capabilities" -> Capabilities.map { x => x.asInstanceOf[js.Any] },
        "ChangeSetId" -> ChangeSetId.map { x => x.asInstanceOf[js.Any] },
        "ChangeSetName" -> ChangeSetName.map { x => x.asInstanceOf[js.Any] },
        "Changes" -> Changes.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ExecutionStatus" -> ExecutionStatus.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "NotificationARNs" -> NotificationARNs.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "RollbackConfiguration" -> RollbackConfiguration.map { x => x.asInstanceOf[js.Any] },
        "StackId" -> StackId.map { x => x.asInstanceOf[js.Any] },
        "StackName" -> StackName.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusReason" -> StatusReason.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeChangeSetOutput]
    }
  }

  @js.native
  trait DescribeStackDriftDetectionStatusInput extends js.Object {
    var StackDriftDetectionId: StackDriftDetectionId
  }

  object DescribeStackDriftDetectionStatusInput {
    def apply(
      StackDriftDetectionId: StackDriftDetectionId): DescribeStackDriftDetectionStatusInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackDriftDetectionId" -> StackDriftDetectionId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackDriftDetectionStatusInput]
    }
  }

  @js.native
  trait DescribeStackDriftDetectionStatusOutput extends js.Object {
    var DetectionStatus: StackDriftDetectionStatus
    var StackDriftDetectionId: StackDriftDetectionId
    var StackId: StackId
    var Timestamp: Timestamp
    var DetectionStatusReason: js.UndefOr[StackDriftDetectionStatusReason]
    var DriftedStackResourceCount: js.UndefOr[BoxedInteger]
    var StackDriftStatus: js.UndefOr[StackDriftStatus]
  }

  object DescribeStackDriftDetectionStatusOutput {
    def apply(
      DetectionStatus: StackDriftDetectionStatus,
      StackDriftDetectionId: StackDriftDetectionId,
      StackId: StackId,
      Timestamp: Timestamp,
      DetectionStatusReason: js.UndefOr[StackDriftDetectionStatusReason] = js.undefined,
      DriftedStackResourceCount: js.UndefOr[BoxedInteger] = js.undefined,
      StackDriftStatus: js.UndefOr[StackDriftStatus] = js.undefined): DescribeStackDriftDetectionStatusOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectionStatus" -> DetectionStatus.asInstanceOf[js.Any],
        "StackDriftDetectionId" -> StackDriftDetectionId.asInstanceOf[js.Any],
        "StackId" -> StackId.asInstanceOf[js.Any],
        "Timestamp" -> Timestamp.asInstanceOf[js.Any],
        "DetectionStatusReason" -> DetectionStatusReason.map { x => x.asInstanceOf[js.Any] },
        "DriftedStackResourceCount" -> DriftedStackResourceCount.map { x => x.asInstanceOf[js.Any] },
        "StackDriftStatus" -> StackDriftStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackDriftDetectionStatusOutput]
    }
  }

  /**
   * <p>The input for <a>DescribeStackEvents</a> action.</p>
   */
  @js.native
  trait DescribeStackEventsInput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StackName: js.UndefOr[StackName]
  }

  object DescribeStackEventsInput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      StackName: js.UndefOr[StackName] = js.undefined): DescribeStackEventsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "StackName" -> StackName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackEventsInput]
    }
  }

  /**
   * <p>The output for a <a>DescribeStackEvents</a> action.</p>
   */
  @js.native
  trait DescribeStackEventsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StackEvents: js.UndefOr[StackEvents]
  }

  object DescribeStackEventsOutput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      StackEvents: js.UndefOr[StackEvents] = js.undefined): DescribeStackEventsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "StackEvents" -> StackEvents.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackEventsOutput]
    }
  }

  @js.native
  trait DescribeStackInstanceInput extends js.Object {
    var StackInstanceAccount: Account
    var StackInstanceRegion: Region
    var StackSetName: StackSetName
  }

  object DescribeStackInstanceInput {
    def apply(
      StackInstanceAccount: Account,
      StackInstanceRegion: Region,
      StackSetName: StackSetName): DescribeStackInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackInstanceAccount" -> StackInstanceAccount.asInstanceOf[js.Any],
        "StackInstanceRegion" -> StackInstanceRegion.asInstanceOf[js.Any],
        "StackSetName" -> StackSetName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackInstanceInput]
    }
  }

  @js.native
  trait DescribeStackInstanceOutput extends js.Object {
    var StackInstance: js.UndefOr[StackInstance]
  }

  object DescribeStackInstanceOutput {
    def apply(
      StackInstance: js.UndefOr[StackInstance] = js.undefined): DescribeStackInstanceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackInstance" -> StackInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackInstanceOutput]
    }
  }

  @js.native
  trait DescribeStackResourceDriftsInput extends js.Object {
    var StackName: StackNameOrId
    var MaxResults: js.UndefOr[BoxedMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var StackResourceDriftStatusFilters: js.UndefOr[StackResourceDriftStatusFilters]
  }

  object DescribeStackResourceDriftsInput {
    def apply(
      StackName: StackNameOrId,
      MaxResults: js.UndefOr[BoxedMaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      StackResourceDriftStatusFilters: js.UndefOr[StackResourceDriftStatusFilters] = js.undefined): DescribeStackResourceDriftsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackName" -> StackName.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "StackResourceDriftStatusFilters" -> StackResourceDriftStatusFilters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackResourceDriftsInput]
    }
  }

  @js.native
  trait DescribeStackResourceDriftsOutput extends js.Object {
    var StackResourceDrifts: StackResourceDrifts
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeStackResourceDriftsOutput {
    def apply(
      StackResourceDrifts: StackResourceDrifts,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeStackResourceDriftsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackResourceDrifts" -> StackResourceDrifts.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackResourceDriftsOutput]
    }
  }

  /**
   * <p>The input for <a>DescribeStackResource</a> action.</p>
   */
  @js.native
  trait DescribeStackResourceInput extends js.Object {
    var LogicalResourceId: LogicalResourceId
    var StackName: StackName
  }

  object DescribeStackResourceInput {
    def apply(
      LogicalResourceId: LogicalResourceId,
      StackName: StackName): DescribeStackResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogicalResourceId" -> LogicalResourceId.asInstanceOf[js.Any],
        "StackName" -> StackName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackResourceInput]
    }
  }

  /**
   * <p>The output for a <a>DescribeStackResource</a> action.</p>
   */
  @js.native
  trait DescribeStackResourceOutput extends js.Object {
    var StackResourceDetail: js.UndefOr[StackResourceDetail]
  }

  object DescribeStackResourceOutput {
    def apply(
      StackResourceDetail: js.UndefOr[StackResourceDetail] = js.undefined): DescribeStackResourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackResourceDetail" -> StackResourceDetail.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackResourceOutput]
    }
  }

  /**
   * <p>The input for <a>DescribeStackResources</a> action.</p>
   */
  @js.native
  trait DescribeStackResourcesInput extends js.Object {
    var LogicalResourceId: js.UndefOr[LogicalResourceId]
    var PhysicalResourceId: js.UndefOr[PhysicalResourceId]
    var StackName: js.UndefOr[StackName]
  }

  object DescribeStackResourcesInput {
    def apply(
      LogicalResourceId: js.UndefOr[LogicalResourceId] = js.undefined,
      PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined,
      StackName: js.UndefOr[StackName] = js.undefined): DescribeStackResourcesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogicalResourceId" -> LogicalResourceId.map { x => x.asInstanceOf[js.Any] },
        "PhysicalResourceId" -> PhysicalResourceId.map { x => x.asInstanceOf[js.Any] },
        "StackName" -> StackName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackResourcesInput]
    }
  }

  /**
   * <p>The output for a <a>DescribeStackResources</a> action.</p>
   */
  @js.native
  trait DescribeStackResourcesOutput extends js.Object {
    var StackResources: js.UndefOr[StackResources]
  }

  object DescribeStackResourcesOutput {
    def apply(
      StackResources: js.UndefOr[StackResources] = js.undefined): DescribeStackResourcesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackResources" -> StackResources.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackResourcesOutput]
    }
  }

  @js.native
  trait DescribeStackSetInput extends js.Object {
    var StackSetName: StackSetName
  }

  object DescribeStackSetInput {
    def apply(
      StackSetName: StackSetName): DescribeStackSetInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackSetName" -> StackSetName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackSetInput]
    }
  }

  @js.native
  trait DescribeStackSetOperationInput extends js.Object {
    var OperationId: ClientRequestToken
    var StackSetName: StackSetName
  }

  object DescribeStackSetOperationInput {
    def apply(
      OperationId: ClientRequestToken,
      StackSetName: StackSetName): DescribeStackSetOperationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OperationId" -> OperationId.asInstanceOf[js.Any],
        "StackSetName" -> StackSetName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackSetOperationInput]
    }
  }

  @js.native
  trait DescribeStackSetOperationOutput extends js.Object {
    var StackSetOperation: js.UndefOr[StackSetOperation]
  }

  object DescribeStackSetOperationOutput {
    def apply(
      StackSetOperation: js.UndefOr[StackSetOperation] = js.undefined): DescribeStackSetOperationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackSetOperation" -> StackSetOperation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackSetOperationOutput]
    }
  }

  @js.native
  trait DescribeStackSetOutput extends js.Object {
    var StackSet: js.UndefOr[StackSet]
  }

  object DescribeStackSetOutput {
    def apply(
      StackSet: js.UndefOr[StackSet] = js.undefined): DescribeStackSetOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackSet" -> StackSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackSetOutput]
    }
  }

  /**
   * <p>The input for <a>DescribeStacks</a> action.</p>
   */
  @js.native
  trait DescribeStacksInput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StackName: js.UndefOr[StackName]
  }

  object DescribeStacksInput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      StackName: js.UndefOr[StackName] = js.undefined): DescribeStacksInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "StackName" -> StackName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStacksInput]
    }
  }

  /**
   * <p>The output for a <a>DescribeStacks</a> action.</p>
   */
  @js.native
  trait DescribeStacksOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Stacks: js.UndefOr[Stacks]
  }

  object DescribeStacksOutput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Stacks: js.UndefOr[Stacks] = js.undefined): DescribeStacksOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Stacks" -> Stacks.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStacksOutput]
    }
  }

  @js.native
  trait DetectStackDriftInput extends js.Object {
    var StackName: StackNameOrId
    var LogicalResourceIds: js.UndefOr[LogicalResourceIds]
  }

  object DetectStackDriftInput {
    def apply(
      StackName: StackNameOrId,
      LogicalResourceIds: js.UndefOr[LogicalResourceIds] = js.undefined): DetectStackDriftInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackName" -> StackName.asInstanceOf[js.Any],
        "LogicalResourceIds" -> LogicalResourceIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectStackDriftInput]
    }
  }

  @js.native
  trait DetectStackDriftOutput extends js.Object {
    var StackDriftDetectionId: StackDriftDetectionId
  }

  object DetectStackDriftOutput {
    def apply(
      StackDriftDetectionId: StackDriftDetectionId): DetectStackDriftOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackDriftDetectionId" -> StackDriftDetectionId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectStackDriftOutput]
    }
  }

  @js.native
  trait DetectStackResourceDriftInput extends js.Object {
    var LogicalResourceId: LogicalResourceId
    var StackName: StackNameOrId
  }

  object DetectStackResourceDriftInput {
    def apply(
      LogicalResourceId: LogicalResourceId,
      StackName: StackNameOrId): DetectStackResourceDriftInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogicalResourceId" -> LogicalResourceId.asInstanceOf[js.Any],
        "StackName" -> StackName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectStackResourceDriftInput]
    }
  }

  @js.native
  trait DetectStackResourceDriftOutput extends js.Object {
    var StackResourceDrift: StackResourceDrift
  }

  object DetectStackResourceDriftOutput {
    def apply(
      StackResourceDrift: StackResourceDrift): DetectStackResourceDriftOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackResourceDrift" -> StackResourceDrift.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectStackResourceDriftOutput]
    }
  }

  object DifferenceTypeEnum {
    val ADD = "ADD"
    val REMOVE = "REMOVE"
    val NOT_EQUAL = "NOT_EQUAL"

    val values = IndexedSeq(ADD, REMOVE, NOT_EQUAL)
  }

  /**
   * <p>The input for an <a>EstimateTemplateCost</a> action.</p>
   */
  @js.native
  trait EstimateTemplateCostInput extends js.Object {
    var Parameters: js.UndefOr[Parameters]
    var TemplateBody: js.UndefOr[TemplateBody]
    var TemplateURL: js.UndefOr[TemplateURL]
  }

  object EstimateTemplateCostInput {
    def apply(
      Parameters: js.UndefOr[Parameters] = js.undefined,
      TemplateBody: js.UndefOr[TemplateBody] = js.undefined,
      TemplateURL: js.UndefOr[TemplateURL] = js.undefined): EstimateTemplateCostInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "TemplateBody" -> TemplateBody.map { x => x.asInstanceOf[js.Any] },
        "TemplateURL" -> TemplateURL.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EstimateTemplateCostInput]
    }
  }

  /**
   * <p>The output for a <a>EstimateTemplateCost</a> action.</p>
   */
  @js.native
  trait EstimateTemplateCostOutput extends js.Object {
    var Url: js.UndefOr[Url]
  }

  object EstimateTemplateCostOutput {
    def apply(
      Url: js.UndefOr[Url] = js.undefined): EstimateTemplateCostOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EstimateTemplateCostOutput]
    }
  }

  object EvaluationTypeEnum {
    val Static = "Static"
    val Dynamic = "Dynamic"

    val values = IndexedSeq(Static, Dynamic)
  }

  /**
   * <p>The input for the <a>ExecuteChangeSet</a> action.</p>
   */
  @js.native
  trait ExecuteChangeSetInput extends js.Object {
    var ChangeSetName: ChangeSetNameOrId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var StackName: js.UndefOr[StackNameOrId]
  }

  object ExecuteChangeSetInput {
    def apply(
      ChangeSetName: ChangeSetNameOrId,
      ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      StackName: js.UndefOr[StackNameOrId] = js.undefined): ExecuteChangeSetInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeSetName" -> ChangeSetName.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "StackName" -> StackName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecuteChangeSetInput]
    }
  }

  /**
   * <p>The output for the <a>ExecuteChangeSet</a> action.</p>
   */
  @js.native
  trait ExecuteChangeSetOutput extends js.Object {

  }

  object ExecuteChangeSetOutput {
    def apply(): ExecuteChangeSetOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecuteChangeSetOutput]
    }
  }

  object ExecutionStatusEnum {
    val UNAVAILABLE = "UNAVAILABLE"
    val AVAILABLE = "AVAILABLE"
    val EXECUTE_IN_PROGRESS = "EXECUTE_IN_PROGRESS"
    val EXECUTE_COMPLETE = "EXECUTE_COMPLETE"
    val EXECUTE_FAILED = "EXECUTE_FAILED"
    val OBSOLETE = "OBSOLETE"

    val values = IndexedSeq(UNAVAILABLE, AVAILABLE, EXECUTE_IN_PROGRESS, EXECUTE_COMPLETE, EXECUTE_FAILED, OBSOLETE)
  }

  /**
   * <p>The <code>Export</code> structure describes the exported output values for a stack.</p>
   */
  @js.native
  trait Export extends js.Object {
    var ExportingStackId: js.UndefOr[StackId]
    var Name: js.UndefOr[ExportName]
    var Value: js.UndefOr[ExportValue]
  }

  object Export {
    def apply(
      ExportingStackId: js.UndefOr[StackId] = js.undefined,
      Name: js.UndefOr[ExportName] = js.undefined,
      Value: js.UndefOr[ExportValue] = js.undefined): Export = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExportingStackId" -> ExportingStackId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Export]
    }
  }

  /**
   * <p>The input for the <a>GetStackPolicy</a> action.</p>
   */
  @js.native
  trait GetStackPolicyInput extends js.Object {
    var StackName: StackName
  }

  object GetStackPolicyInput {
    def apply(
      StackName: StackName): GetStackPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackName" -> StackName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStackPolicyInput]
    }
  }

  /**
   * <p>The output for the <a>GetStackPolicy</a> action.</p>
   */
  @js.native
  trait GetStackPolicyOutput extends js.Object {
    var StackPolicyBody: js.UndefOr[StackPolicyBody]
  }

  object GetStackPolicyOutput {
    def apply(
      StackPolicyBody: js.UndefOr[StackPolicyBody] = js.undefined): GetStackPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackPolicyBody" -> StackPolicyBody.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStackPolicyOutput]
    }
  }

  /**
   * <p>The input for a <a>GetTemplate</a> action.</p>
   */
  @js.native
  trait GetTemplateInput extends js.Object {
    var ChangeSetName: js.UndefOr[ChangeSetNameOrId]
    var StackName: js.UndefOr[StackName]
    var TemplateStage: js.UndefOr[TemplateStage]
  }

  object GetTemplateInput {
    def apply(
      ChangeSetName: js.UndefOr[ChangeSetNameOrId] = js.undefined,
      StackName: js.UndefOr[StackName] = js.undefined,
      TemplateStage: js.UndefOr[TemplateStage] = js.undefined): GetTemplateInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeSetName" -> ChangeSetName.map { x => x.asInstanceOf[js.Any] },
        "StackName" -> StackName.map { x => x.asInstanceOf[js.Any] },
        "TemplateStage" -> TemplateStage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTemplateInput]
    }
  }

  /**
   * <p>The output for <a>GetTemplate</a> action.</p>
   */
  @js.native
  trait GetTemplateOutput extends js.Object {
    var StagesAvailable: js.UndefOr[StageList]
    var TemplateBody: js.UndefOr[TemplateBody]
  }

  object GetTemplateOutput {
    def apply(
      StagesAvailable: js.UndefOr[StageList] = js.undefined,
      TemplateBody: js.UndefOr[TemplateBody] = js.undefined): GetTemplateOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StagesAvailable" -> StagesAvailable.map { x => x.asInstanceOf[js.Any] },
        "TemplateBody" -> TemplateBody.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTemplateOutput]
    }
  }

  /**
   * <p>The input for the <a>GetTemplateSummary</a> action.</p>
   */
  @js.native
  trait GetTemplateSummaryInput extends js.Object {
    var StackName: js.UndefOr[StackNameOrId]
    var StackSetName: js.UndefOr[StackSetNameOrId]
    var TemplateBody: js.UndefOr[TemplateBody]
    var TemplateURL: js.UndefOr[TemplateURL]
  }

  object GetTemplateSummaryInput {
    def apply(
      StackName: js.UndefOr[StackNameOrId] = js.undefined,
      StackSetName: js.UndefOr[StackSetNameOrId] = js.undefined,
      TemplateBody: js.UndefOr[TemplateBody] = js.undefined,
      TemplateURL: js.UndefOr[TemplateURL] = js.undefined): GetTemplateSummaryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackName" -> StackName.map { x => x.asInstanceOf[js.Any] },
        "StackSetName" -> StackSetName.map { x => x.asInstanceOf[js.Any] },
        "TemplateBody" -> TemplateBody.map { x => x.asInstanceOf[js.Any] },
        "TemplateURL" -> TemplateURL.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTemplateSummaryInput]
    }
  }

  /**
   * <p>The output for the <a>GetTemplateSummary</a> action.</p>
   */
  @js.native
  trait GetTemplateSummaryOutput extends js.Object {
    var Capabilities: js.UndefOr[Capabilities]
    var CapabilitiesReason: js.UndefOr[CapabilitiesReason]
    var DeclaredTransforms: js.UndefOr[TransformsList]
    var Description: js.UndefOr[Description]
    var Metadata: js.UndefOr[Metadata]
    var Parameters: js.UndefOr[ParameterDeclarations]
    var ResourceTypes: js.UndefOr[ResourceTypes]
    var Version: js.UndefOr[Version]
  }

  object GetTemplateSummaryOutput {
    def apply(
      Capabilities: js.UndefOr[Capabilities] = js.undefined,
      CapabilitiesReason: js.UndefOr[CapabilitiesReason] = js.undefined,
      DeclaredTransforms: js.UndefOr[TransformsList] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      Metadata: js.UndefOr[Metadata] = js.undefined,
      Parameters: js.UndefOr[ParameterDeclarations] = js.undefined,
      ResourceTypes: js.UndefOr[ResourceTypes] = js.undefined,
      Version: js.UndefOr[Version] = js.undefined): GetTemplateSummaryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Capabilities" -> Capabilities.map { x => x.asInstanceOf[js.Any] },
        "CapabilitiesReason" -> CapabilitiesReason.map { x => x.asInstanceOf[js.Any] },
        "DeclaredTransforms" -> DeclaredTransforms.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Metadata" -> Metadata.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "ResourceTypes" -> ResourceTypes.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTemplateSummaryOutput]
    }
  }

  /**
   * <p>The input for the <a>ListChangeSets</a> action.</p>
   */
  @js.native
  trait ListChangeSetsInput extends js.Object {
    var StackName: StackNameOrId
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChangeSetsInput {
    def apply(
      StackName: StackNameOrId,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListChangeSetsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackName" -> StackName.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListChangeSetsInput]
    }
  }

  /**
   * <p>The output for the <a>ListChangeSets</a> action.</p>
   */
  @js.native
  trait ListChangeSetsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Summaries: js.UndefOr[ChangeSetSummaries]
  }

  object ListChangeSetsOutput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Summaries: js.UndefOr[ChangeSetSummaries] = js.undefined): ListChangeSetsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Summaries" -> Summaries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListChangeSetsOutput]
    }
  }

  @js.native
  trait ListExportsInput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
  }

  object ListExportsInput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined): ListExportsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListExportsInput]
    }
  }

  @js.native
  trait ListExportsOutput extends js.Object {
    var Exports: js.UndefOr[Exports]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListExportsOutput {
    def apply(
      Exports: js.UndefOr[Exports] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListExportsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Exports" -> Exports.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListExportsOutput]
    }
  }

  @js.native
  trait ListImportsInput extends js.Object {
    var ExportName: ExportName
    var NextToken: js.UndefOr[NextToken]
  }

  object ListImportsInput {
    def apply(
      ExportName: ExportName,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListImportsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExportName" -> ExportName.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListImportsInput]
    }
  }

  @js.native
  trait ListImportsOutput extends js.Object {
    var Imports: js.UndefOr[Imports]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListImportsOutput {
    def apply(
      Imports: js.UndefOr[Imports] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListImportsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Imports" -> Imports.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListImportsOutput]
    }
  }

  @js.native
  trait ListStackInstancesInput extends js.Object {
    var StackSetName: StackSetName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var StackInstanceAccount: js.UndefOr[Account]
    var StackInstanceRegion: js.UndefOr[Region]
  }

  object ListStackInstancesInput {
    def apply(
      StackSetName: StackSetName,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      StackInstanceAccount: js.UndefOr[Account] = js.undefined,
      StackInstanceRegion: js.UndefOr[Region] = js.undefined): ListStackInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackSetName" -> StackSetName.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "StackInstanceAccount" -> StackInstanceAccount.map { x => x.asInstanceOf[js.Any] },
        "StackInstanceRegion" -> StackInstanceRegion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStackInstancesInput]
    }
  }

  @js.native
  trait ListStackInstancesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Summaries: js.UndefOr[StackInstanceSummaries]
  }

  object ListStackInstancesOutput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Summaries: js.UndefOr[StackInstanceSummaries] = js.undefined): ListStackInstancesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Summaries" -> Summaries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStackInstancesOutput]
    }
  }

  /**
   * <p>The input for the <a>ListStackResource</a> action.</p>
   */
  @js.native
  trait ListStackResourcesInput extends js.Object {
    var StackName: StackName
    var NextToken: js.UndefOr[NextToken]
  }

  object ListStackResourcesInput {
    def apply(
      StackName: StackName,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListStackResourcesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackName" -> StackName.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStackResourcesInput]
    }
  }

  /**
   * <p>The output for a <a>ListStackResources</a> action.</p>
   */
  @js.native
  trait ListStackResourcesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StackResourceSummaries: js.UndefOr[StackResourceSummaries]
  }

  object ListStackResourcesOutput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      StackResourceSummaries: js.UndefOr[StackResourceSummaries] = js.undefined): ListStackResourcesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "StackResourceSummaries" -> StackResourceSummaries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStackResourcesOutput]
    }
  }

  @js.native
  trait ListStackSetOperationResultsInput extends js.Object {
    var OperationId: ClientRequestToken
    var StackSetName: StackSetName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListStackSetOperationResultsInput {
    def apply(
      OperationId: ClientRequestToken,
      StackSetName: StackSetName,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListStackSetOperationResultsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OperationId" -> OperationId.asInstanceOf[js.Any],
        "StackSetName" -> StackSetName.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStackSetOperationResultsInput]
    }
  }

  @js.native
  trait ListStackSetOperationResultsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Summaries: js.UndefOr[StackSetOperationResultSummaries]
  }

  object ListStackSetOperationResultsOutput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Summaries: js.UndefOr[StackSetOperationResultSummaries] = js.undefined): ListStackSetOperationResultsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Summaries" -> Summaries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStackSetOperationResultsOutput]
    }
  }

  @js.native
  trait ListStackSetOperationsInput extends js.Object {
    var StackSetName: StackSetName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListStackSetOperationsInput {
    def apply(
      StackSetName: StackSetName,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListStackSetOperationsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackSetName" -> StackSetName.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStackSetOperationsInput]
    }
  }

  @js.native
  trait ListStackSetOperationsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Summaries: js.UndefOr[StackSetOperationSummaries]
  }

  object ListStackSetOperationsOutput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Summaries: js.UndefOr[StackSetOperationSummaries] = js.undefined): ListStackSetOperationsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Summaries" -> Summaries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStackSetOperationsOutput]
    }
  }

  @js.native
  trait ListStackSetsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[StackSetStatus]
  }

  object ListStackSetsInput {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Status: js.UndefOr[StackSetStatus] = js.undefined): ListStackSetsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStackSetsInput]
    }
  }

  @js.native
  trait ListStackSetsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Summaries: js.UndefOr[StackSetSummaries]
  }

  object ListStackSetsOutput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Summaries: js.UndefOr[StackSetSummaries] = js.undefined): ListStackSetsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Summaries" -> Summaries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStackSetsOutput]
    }
  }

  /**
   * <p>The input for <a>ListStacks</a> action.</p>
   */
  @js.native
  trait ListStacksInput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StackStatusFilter: js.UndefOr[StackStatusFilter]
  }

  object ListStacksInput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      StackStatusFilter: js.UndefOr[StackStatusFilter] = js.undefined): ListStacksInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "StackStatusFilter" -> StackStatusFilter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStacksInput]
    }
  }

  /**
   * <p>The output for <a>ListStacks</a> action.</p>
   */
  @js.native
  trait ListStacksOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StackSummaries: js.UndefOr[StackSummaries]
  }

  object ListStacksOutput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      StackSummaries: js.UndefOr[StackSummaries] = js.undefined): ListStacksOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "StackSummaries" -> StackSummaries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStacksOutput]
    }
  }

  object OnFailureEnum {
    val DO_NOTHING = "DO_NOTHING"
    val ROLLBACK = "ROLLBACK"
    val DELETE = "DELETE"

    val values = IndexedSeq(DO_NOTHING, ROLLBACK, DELETE)
  }

  /**
   * <p>The Output data type.</p>
   */
  @js.native
  trait Output extends js.Object {
    var Description: js.UndefOr[Description]
    var ExportName: js.UndefOr[ExportName]
    var OutputKey: js.UndefOr[OutputKey]
    var OutputValue: js.UndefOr[OutputValue]
  }

  object Output {
    def apply(
      Description: js.UndefOr[Description] = js.undefined,
      ExportName: js.UndefOr[ExportName] = js.undefined,
      OutputKey: js.UndefOr[OutputKey] = js.undefined,
      OutputValue: js.UndefOr[OutputValue] = js.undefined): Output = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ExportName" -> ExportName.map { x => x.asInstanceOf[js.Any] },
        "OutputKey" -> OutputKey.map { x => x.asInstanceOf[js.Any] },
        "OutputValue" -> OutputValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Output]
    }
  }

  /**
   * <p>The Parameter data type.</p>
   */
  @js.native
  trait Parameter extends js.Object {
    var ParameterKey: js.UndefOr[ParameterKey]
    var ParameterValue: js.UndefOr[ParameterValue]
    var ResolvedValue: js.UndefOr[ParameterValue]
    var UsePreviousValue: js.UndefOr[UsePreviousValue]
  }

  object Parameter {
    def apply(
      ParameterKey: js.UndefOr[ParameterKey] = js.undefined,
      ParameterValue: js.UndefOr[ParameterValue] = js.undefined,
      ResolvedValue: js.UndefOr[ParameterValue] = js.undefined,
      UsePreviousValue: js.UndefOr[UsePreviousValue] = js.undefined): Parameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterKey" -> ParameterKey.map { x => x.asInstanceOf[js.Any] },
        "ParameterValue" -> ParameterValue.map { x => x.asInstanceOf[js.Any] },
        "ResolvedValue" -> ResolvedValue.map { x => x.asInstanceOf[js.Any] },
        "UsePreviousValue" -> UsePreviousValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Parameter]
    }
  }

  /**
   * <p>A set of criteria that AWS CloudFormation uses to validate parameter values. Although other constraints might be defined in the stack template, AWS CloudFormation returns only the <code>AllowedValues</code> property.</p>
   */
  @js.native
  trait ParameterConstraints extends js.Object {
    var AllowedValues: js.UndefOr[AllowedValues]
  }

  object ParameterConstraints {
    def apply(
      AllowedValues: js.UndefOr[AllowedValues] = js.undefined): ParameterConstraints = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowedValues" -> AllowedValues.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParameterConstraints]
    }
  }

  /**
   * <p>The ParameterDeclaration data type.</p>
   */
  @js.native
  trait ParameterDeclaration extends js.Object {
    var DefaultValue: js.UndefOr[ParameterValue]
    var Description: js.UndefOr[Description]
    var NoEcho: js.UndefOr[NoEcho]
    var ParameterConstraints: js.UndefOr[ParameterConstraints]
    var ParameterKey: js.UndefOr[ParameterKey]
    var ParameterType: js.UndefOr[ParameterType]
  }

  object ParameterDeclaration {
    def apply(
      DefaultValue: js.UndefOr[ParameterValue] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      NoEcho: js.UndefOr[NoEcho] = js.undefined,
      ParameterConstraints: js.UndefOr[ParameterConstraints] = js.undefined,
      ParameterKey: js.UndefOr[ParameterKey] = js.undefined,
      ParameterType: js.UndefOr[ParameterType] = js.undefined): ParameterDeclaration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DefaultValue" -> DefaultValue.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "NoEcho" -> NoEcho.map { x => x.asInstanceOf[js.Any] },
        "ParameterConstraints" -> ParameterConstraints.map { x => x.asInstanceOf[js.Any] },
        "ParameterKey" -> ParameterKey.map { x => x.asInstanceOf[js.Any] },
        "ParameterType" -> ParameterType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParameterDeclaration]
    }
  }

  /**
   * <p>Context information that enables AWS CloudFormation to uniquely identify a resource. AWS CloudFormation uses context key-value pairs in cases where a resource's logical and physical IDs are not enough to uniquely identify that resource. Each context key-value pair specifies a resource that contains the targeted resource.</p>
   */
  @js.native
  trait PhysicalResourceIdContextKeyValuePair extends js.Object {
    var Key: Key
    var Value: Value
  }

  object PhysicalResourceIdContextKeyValuePair {
    def apply(
      Key: Key,
      Value: Value): PhysicalResourceIdContextKeyValuePair = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PhysicalResourceIdContextKeyValuePair]
    }
  }

  /**
   * <p>Information about a resource property whose actual value differs from its expected value, as defined in the stack template and any values specified as template parameters. These will be present only for resources whose <code>StackResourceDriftStatus</code> is <code>MODIFIED</code>. For more information, see <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting Unregulated Configuration Changes to Stacks and Resources</a>.</p>
   */
  @js.native
  trait PropertyDifference extends js.Object {
    var ActualValue: PropertyValue
    var DifferenceType: DifferenceType
    var ExpectedValue: PropertyValue
    var PropertyPath: PropertyPath
  }

  object PropertyDifference {
    def apply(
      ActualValue: PropertyValue,
      DifferenceType: DifferenceType,
      ExpectedValue: PropertyValue,
      PropertyPath: PropertyPath): PropertyDifference = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActualValue" -> ActualValue.asInstanceOf[js.Any],
        "DifferenceType" -> DifferenceType.asInstanceOf[js.Any],
        "ExpectedValue" -> ExpectedValue.asInstanceOf[js.Any],
        "PropertyPath" -> PropertyPath.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PropertyDifference]
    }
  }

  object ReplacementEnum {
    val True = "True"
    val False = "False"
    val Conditional = "Conditional"

    val values = IndexedSeq(True, False, Conditional)
  }

  object RequiresRecreationEnum {
    val Never = "Never"
    val Conditionally = "Conditionally"
    val Always = "Always"

    val values = IndexedSeq(Never, Conditionally, Always)
  }

  object ResourceAttributeEnum {
    val Properties = "Properties"
    val Metadata = "Metadata"
    val CreationPolicy = "CreationPolicy"
    val UpdatePolicy = "UpdatePolicy"
    val DeletionPolicy = "DeletionPolicy"
    val Tags = "Tags"

    val values = IndexedSeq(Properties, Metadata, CreationPolicy, UpdatePolicy, DeletionPolicy, Tags)
  }

  /**
   * <p>The <code>ResourceChange</code> structure describes the resource and the action that AWS CloudFormation will perform on it if you execute this change set.</p>
   */
  @js.native
  trait ResourceChange extends js.Object {
    var Action: js.UndefOr[ChangeAction]
    var Details: js.UndefOr[ResourceChangeDetails]
    var LogicalResourceId: js.UndefOr[LogicalResourceId]
    var PhysicalResourceId: js.UndefOr[PhysicalResourceId]
    var Replacement: js.UndefOr[Replacement]
    var ResourceType: js.UndefOr[ResourceType]
    var Scope: js.UndefOr[Scope]
  }

  object ResourceChange {
    def apply(
      Action: js.UndefOr[ChangeAction] = js.undefined,
      Details: js.UndefOr[ResourceChangeDetails] = js.undefined,
      LogicalResourceId: js.UndefOr[LogicalResourceId] = js.undefined,
      PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined,
      Replacement: js.UndefOr[Replacement] = js.undefined,
      ResourceType: js.UndefOr[ResourceType] = js.undefined,
      Scope: js.UndefOr[Scope] = js.undefined): ResourceChange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "Details" -> Details.map { x => x.asInstanceOf[js.Any] },
        "LogicalResourceId" -> LogicalResourceId.map { x => x.asInstanceOf[js.Any] },
        "PhysicalResourceId" -> PhysicalResourceId.map { x => x.asInstanceOf[js.Any] },
        "Replacement" -> Replacement.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "Scope" -> Scope.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceChange]
    }
  }

  /**
   * <p>For a resource with <code>Modify</code> as the action, the <code>ResourceChange</code> structure describes the changes AWS CloudFormation will make to that resource.</p>
   */
  @js.native
  trait ResourceChangeDetail extends js.Object {
    var CausingEntity: js.UndefOr[CausingEntity]
    var ChangeSource: js.UndefOr[ChangeSource]
    var Evaluation: js.UndefOr[EvaluationType]
    var Target: js.UndefOr[ResourceTargetDefinition]
  }

  object ResourceChangeDetail {
    def apply(
      CausingEntity: js.UndefOr[CausingEntity] = js.undefined,
      ChangeSource: js.UndefOr[ChangeSource] = js.undefined,
      Evaluation: js.UndefOr[EvaluationType] = js.undefined,
      Target: js.UndefOr[ResourceTargetDefinition] = js.undefined): ResourceChangeDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CausingEntity" -> CausingEntity.map { x => x.asInstanceOf[js.Any] },
        "ChangeSource" -> ChangeSource.map { x => x.asInstanceOf[js.Any] },
        "Evaluation" -> Evaluation.map { x => x.asInstanceOf[js.Any] },
        "Target" -> Target.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceChangeDetail]
    }
  }

  object ResourceSignalStatusEnum {
    val SUCCESS = "SUCCESS"
    val FAILURE = "FAILURE"

    val values = IndexedSeq(SUCCESS, FAILURE)
  }

  object ResourceStatusEnum {
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS"
    val CREATE_FAILED = "CREATE_FAILED"
    val CREATE_COMPLETE = "CREATE_COMPLETE"
    val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS"
    val DELETE_FAILED = "DELETE_FAILED"
    val DELETE_COMPLETE = "DELETE_COMPLETE"
    val DELETE_SKIPPED = "DELETE_SKIPPED"
    val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS"
    val UPDATE_FAILED = "UPDATE_FAILED"
    val UPDATE_COMPLETE = "UPDATE_COMPLETE"

    val values = IndexedSeq(CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, DELETE_SKIPPED, UPDATE_IN_PROGRESS, UPDATE_FAILED, UPDATE_COMPLETE)
  }

  /**
   * <p>The field that AWS CloudFormation will change, such as the name of a resource's property, and whether the resource will be recreated.</p>
   */
  @js.native
  trait ResourceTargetDefinition extends js.Object {
    var Attribute: js.UndefOr[ResourceAttribute]
    var Name: js.UndefOr[PropertyName]
    var RequiresRecreation: js.UndefOr[RequiresRecreation]
  }

  object ResourceTargetDefinition {
    def apply(
      Attribute: js.UndefOr[ResourceAttribute] = js.undefined,
      Name: js.UndefOr[PropertyName] = js.undefined,
      RequiresRecreation: js.UndefOr[RequiresRecreation] = js.undefined): ResourceTargetDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attribute" -> Attribute.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RequiresRecreation" -> RequiresRecreation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceTargetDefinition]
    }
  }

  /**
   * <p>Structure containing the rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for the specified monitoring period afterwards.</p> <p>Rollback triggers enable you to have AWS CloudFormation monitor the state of your application during stack creation and updating, and to roll back that operation if the application breaches the threshold of any of the alarms you've specified. For more information, see <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-rollback-triggers.html">Monitor and Roll Back Stack Operations</a>.</p>
   */
  @js.native
  trait RollbackConfiguration extends js.Object {
    var MonitoringTimeInMinutes: js.UndefOr[MonitoringTimeInMinutes]
    var RollbackTriggers: js.UndefOr[RollbackTriggers]
  }

  object RollbackConfiguration {
    def apply(
      MonitoringTimeInMinutes: js.UndefOr[MonitoringTimeInMinutes] = js.undefined,
      RollbackTriggers: js.UndefOr[RollbackTriggers] = js.undefined): RollbackConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MonitoringTimeInMinutes" -> MonitoringTimeInMinutes.map { x => x.asInstanceOf[js.Any] },
        "RollbackTriggers" -> RollbackTriggers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RollbackConfiguration]
    }
  }

  /**
   * <p>A rollback trigger AWS CloudFormation monitors during creation and updating of stacks. If any of the alarms you specify goes to ALARM state during the stack operation or within the specified monitoring period afterwards, CloudFormation rolls back the entire stack operation. </p>
   */
  @js.native
  trait RollbackTrigger extends js.Object {
    var Arn: Arn
    var Type: Type
  }

  object RollbackTrigger {
    def apply(
      Arn: Arn,
      Type: Type): RollbackTrigger = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RollbackTrigger]
    }
  }

  /**
   * <p>The input for the <a>SetStackPolicy</a> action.</p>
   */
  @js.native
  trait SetStackPolicyInput extends js.Object {
    var StackName: StackName
    var StackPolicyBody: js.UndefOr[StackPolicyBody]
    var StackPolicyURL: js.UndefOr[StackPolicyURL]
  }

  object SetStackPolicyInput {
    def apply(
      StackName: StackName,
      StackPolicyBody: js.UndefOr[StackPolicyBody] = js.undefined,
      StackPolicyURL: js.UndefOr[StackPolicyURL] = js.undefined): SetStackPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackName" -> StackName.asInstanceOf[js.Any],
        "StackPolicyBody" -> StackPolicyBody.map { x => x.asInstanceOf[js.Any] },
        "StackPolicyURL" -> StackPolicyURL.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetStackPolicyInput]
    }
  }

  /**
   * <p>The input for the <a>SignalResource</a> action.</p>
   */
  @js.native
  trait SignalResourceInput extends js.Object {
    var LogicalResourceId: LogicalResourceId
    var StackName: StackNameOrId
    var Status: ResourceSignalStatus
    var UniqueId: ResourceSignalUniqueId
  }

  object SignalResourceInput {
    def apply(
      LogicalResourceId: LogicalResourceId,
      StackName: StackNameOrId,
      Status: ResourceSignalStatus,
      UniqueId: ResourceSignalUniqueId): SignalResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogicalResourceId" -> LogicalResourceId.asInstanceOf[js.Any],
        "StackName" -> StackName.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "UniqueId" -> UniqueId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignalResourceInput]
    }
  }

  /**
   * <p>The Stack data type.</p>
   */
  @js.native
  trait Stack extends js.Object {
    var CreationTime: CreationTime
    var StackName: StackName
    var StackStatus: StackStatus
    var Capabilities: js.UndefOr[Capabilities]
    var ChangeSetId: js.UndefOr[ChangeSetId]
    var DeletionTime: js.UndefOr[DeletionTime]
    var Description: js.UndefOr[Description]
    var DisableRollback: js.UndefOr[DisableRollback]
    var DriftInformation: js.UndefOr[StackDriftInformation]
    var EnableTerminationProtection: js.UndefOr[EnableTerminationProtection]
    var LastUpdatedTime: js.UndefOr[LastUpdatedTime]
    var NotificationARNs: js.UndefOr[NotificationARNs]
    var Outputs: js.UndefOr[Outputs]
    var Parameters: js.UndefOr[Parameters]
    var ParentId: js.UndefOr[StackId]
    var RoleARN: js.UndefOr[RoleARN]
    var RollbackConfiguration: js.UndefOr[RollbackConfiguration]
    var RootId: js.UndefOr[StackId]
    var StackId: js.UndefOr[StackId]
    var StackStatusReason: js.UndefOr[StackStatusReason]
    var Tags: js.UndefOr[Tags]
    var TimeoutInMinutes: js.UndefOr[TimeoutMinutes]
  }

  object Stack {
    def apply(
      CreationTime: CreationTime,
      StackName: StackName,
      StackStatus: StackStatus,
      Capabilities: js.UndefOr[Capabilities] = js.undefined,
      ChangeSetId: js.UndefOr[ChangeSetId] = js.undefined,
      DeletionTime: js.UndefOr[DeletionTime] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      DisableRollback: js.UndefOr[DisableRollback] = js.undefined,
      DriftInformation: js.UndefOr[StackDriftInformation] = js.undefined,
      EnableTerminationProtection: js.UndefOr[EnableTerminationProtection] = js.undefined,
      LastUpdatedTime: js.UndefOr[LastUpdatedTime] = js.undefined,
      NotificationARNs: js.UndefOr[NotificationARNs] = js.undefined,
      Outputs: js.UndefOr[Outputs] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      ParentId: js.UndefOr[StackId] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      RollbackConfiguration: js.UndefOr[RollbackConfiguration] = js.undefined,
      RootId: js.UndefOr[StackId] = js.undefined,
      StackId: js.UndefOr[StackId] = js.undefined,
      StackStatusReason: js.UndefOr[StackStatusReason] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined,
      TimeoutInMinutes: js.UndefOr[TimeoutMinutes] = js.undefined): Stack = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "StackName" -> StackName.asInstanceOf[js.Any],
        "StackStatus" -> StackStatus.asInstanceOf[js.Any],
        "Capabilities" -> Capabilities.map { x => x.asInstanceOf[js.Any] },
        "ChangeSetId" -> ChangeSetId.map { x => x.asInstanceOf[js.Any] },
        "DeletionTime" -> DeletionTime.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "DisableRollback" -> DisableRollback.map { x => x.asInstanceOf[js.Any] },
        "DriftInformation" -> DriftInformation.map { x => x.asInstanceOf[js.Any] },
        "EnableTerminationProtection" -> EnableTerminationProtection.map { x => x.asInstanceOf[js.Any] },
        "LastUpdatedTime" -> LastUpdatedTime.map { x => x.asInstanceOf[js.Any] },
        "NotificationARNs" -> NotificationARNs.map { x => x.asInstanceOf[js.Any] },
        "Outputs" -> Outputs.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "ParentId" -> ParentId.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "RollbackConfiguration" -> RollbackConfiguration.map { x => x.asInstanceOf[js.Any] },
        "RootId" -> RootId.map { x => x.asInstanceOf[js.Any] },
        "StackId" -> StackId.map { x => x.asInstanceOf[js.Any] },
        "StackStatusReason" -> StackStatusReason.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "TimeoutInMinutes" -> TimeoutInMinutes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Stack]
    }
  }

  object StackDriftDetectionStatusEnum {
    val DETECTION_IN_PROGRESS = "DETECTION_IN_PROGRESS"
    val DETECTION_FAILED = "DETECTION_FAILED"
    val DETECTION_COMPLETE = "DETECTION_COMPLETE"

    val values = IndexedSeq(DETECTION_IN_PROGRESS, DETECTION_FAILED, DETECTION_COMPLETE)
  }

  /**
   * <p>Contains information about whether the stack's actual configuration differs, or has <i>drifted</i>, from its expected configuration, as defined in the stack template and any values specified as template parameters. A stack is considered to have drifted if one or more of its resources have drifted.</p>
   */
  @js.native
  trait StackDriftInformation extends js.Object {
    var StackDriftStatus: StackDriftStatus
    var LastCheckTimestamp: js.UndefOr[Timestamp]
  }

  object StackDriftInformation {
    def apply(
      StackDriftStatus: StackDriftStatus,
      LastCheckTimestamp: js.UndefOr[Timestamp] = js.undefined): StackDriftInformation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackDriftStatus" -> StackDriftStatus.asInstanceOf[js.Any],
        "LastCheckTimestamp" -> LastCheckTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackDriftInformation]
    }
  }

  /**
   * <p>Contains information about whether the stack's actual configuration differs, or has <i>drifted</i>, from its expected configuration, as defined in the stack template and any values specified as template parameters. A stack is considered to have drifted if one or more of its resources have drifted.</p>
   */
  @js.native
  trait StackDriftInformationSummary extends js.Object {
    var StackDriftStatus: StackDriftStatus
    var LastCheckTimestamp: js.UndefOr[Timestamp]
  }

  object StackDriftInformationSummary {
    def apply(
      StackDriftStatus: StackDriftStatus,
      LastCheckTimestamp: js.UndefOr[Timestamp] = js.undefined): StackDriftInformationSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackDriftStatus" -> StackDriftStatus.asInstanceOf[js.Any],
        "LastCheckTimestamp" -> LastCheckTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackDriftInformationSummary]
    }
  }

  object StackDriftStatusEnum {
    val DRIFTED = "DRIFTED"
    val IN_SYNC = "IN_SYNC"
    val UNKNOWN = "UNKNOWN"
    val NOT_CHECKED = "NOT_CHECKED"

    val values = IndexedSeq(DRIFTED, IN_SYNC, UNKNOWN, NOT_CHECKED)
  }

  /**
   * <p>The StackEvent data type.</p>
   */
  @js.native
  trait StackEvent extends js.Object {
    var EventId: EventId
    var StackId: StackId
    var StackName: StackName
    var Timestamp: Timestamp
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var LogicalResourceId: js.UndefOr[LogicalResourceId]
    var PhysicalResourceId: js.UndefOr[PhysicalResourceId]
    var ResourceProperties: js.UndefOr[ResourceProperties]
    var ResourceStatus: js.UndefOr[ResourceStatus]
    var ResourceStatusReason: js.UndefOr[ResourceStatusReason]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object StackEvent {
    def apply(
      EventId: EventId,
      StackId: StackId,
      StackName: StackName,
      Timestamp: Timestamp,
      ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      LogicalResourceId: js.UndefOr[LogicalResourceId] = js.undefined,
      PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined,
      ResourceProperties: js.UndefOr[ResourceProperties] = js.undefined,
      ResourceStatus: js.UndefOr[ResourceStatus] = js.undefined,
      ResourceStatusReason: js.UndefOr[ResourceStatusReason] = js.undefined,
      ResourceType: js.UndefOr[ResourceType] = js.undefined): StackEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventId" -> EventId.asInstanceOf[js.Any],
        "StackId" -> StackId.asInstanceOf[js.Any],
        "StackName" -> StackName.asInstanceOf[js.Any],
        "Timestamp" -> Timestamp.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "LogicalResourceId" -> LogicalResourceId.map { x => x.asInstanceOf[js.Any] },
        "PhysicalResourceId" -> PhysicalResourceId.map { x => x.asInstanceOf[js.Any] },
        "ResourceProperties" -> ResourceProperties.map { x => x.asInstanceOf[js.Any] },
        "ResourceStatus" -> ResourceStatus.map { x => x.asInstanceOf[js.Any] },
        "ResourceStatusReason" -> ResourceStatusReason.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackEvent]
    }
  }

  /**
   * <p>An AWS CloudFormation stack, in a specific account and region, that's part of a stack set operation. A stack instance is a reference to an attempted or actual stack in a given account within a given region. A stack instance can exist without a stack?for example, if the stack couldn't be created for some reason. A stack instance is associated with only one stack set. Each stack instance contains the ID of its associated stack set, as well as the ID of the actual stack and the stack status.</p>
   */
  @js.native
  trait StackInstance extends js.Object {
    var Account: js.UndefOr[Account]
    var ParameterOverrides: js.UndefOr[Parameters]
    var Region: js.UndefOr[Region]
    var StackId: js.UndefOr[StackId]
    var StackSetId: js.UndefOr[StackSetId]
    var Status: js.UndefOr[StackInstanceStatus]
    var StatusReason: js.UndefOr[Reason]
  }

  object StackInstance {
    def apply(
      Account: js.UndefOr[Account] = js.undefined,
      ParameterOverrides: js.UndefOr[Parameters] = js.undefined,
      Region: js.UndefOr[Region] = js.undefined,
      StackId: js.UndefOr[StackId] = js.undefined,
      StackSetId: js.UndefOr[StackSetId] = js.undefined,
      Status: js.UndefOr[StackInstanceStatus] = js.undefined,
      StatusReason: js.UndefOr[Reason] = js.undefined): StackInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Account" -> Account.map { x => x.asInstanceOf[js.Any] },
        "ParameterOverrides" -> ParameterOverrides.map { x => x.asInstanceOf[js.Any] },
        "Region" -> Region.map { x => x.asInstanceOf[js.Any] },
        "StackId" -> StackId.map { x => x.asInstanceOf[js.Any] },
        "StackSetId" -> StackSetId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusReason" -> StatusReason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackInstance]
    }
  }

  object StackInstanceStatusEnum {
    val CURRENT = "CURRENT"
    val OUTDATED = "OUTDATED"
    val INOPERABLE = "INOPERABLE"

    val values = IndexedSeq(CURRENT, OUTDATED, INOPERABLE)
  }

  /**
   * <p>The structure that contains summary information about a stack instance.</p>
   */
  @js.native
  trait StackInstanceSummary extends js.Object {
    var Account: js.UndefOr[Account]
    var Region: js.UndefOr[Region]
    var StackId: js.UndefOr[StackId]
    var StackSetId: js.UndefOr[StackSetId]
    var Status: js.UndefOr[StackInstanceStatus]
    var StatusReason: js.UndefOr[Reason]
  }

  object StackInstanceSummary {
    def apply(
      Account: js.UndefOr[Account] = js.undefined,
      Region: js.UndefOr[Region] = js.undefined,
      StackId: js.UndefOr[StackId] = js.undefined,
      StackSetId: js.UndefOr[StackSetId] = js.undefined,
      Status: js.UndefOr[StackInstanceStatus] = js.undefined,
      StatusReason: js.UndefOr[Reason] = js.undefined): StackInstanceSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Account" -> Account.map { x => x.asInstanceOf[js.Any] },
        "Region" -> Region.map { x => x.asInstanceOf[js.Any] },
        "StackId" -> StackId.map { x => x.asInstanceOf[js.Any] },
        "StackSetId" -> StackSetId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusReason" -> StatusReason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackInstanceSummary]
    }
  }

  /**
   * <p>The StackResource data type.</p>
   */
  @js.native
  trait StackResource extends js.Object {
    var LogicalResourceId: LogicalResourceId
    var ResourceStatus: ResourceStatus
    var ResourceType: ResourceType
    var Timestamp: Timestamp
    var Description: js.UndefOr[Description]
    var DriftInformation: js.UndefOr[StackResourceDriftInformation]
    var PhysicalResourceId: js.UndefOr[PhysicalResourceId]
    var ResourceStatusReason: js.UndefOr[ResourceStatusReason]
    var StackId: js.UndefOr[StackId]
    var StackName: js.UndefOr[StackName]
  }

  object StackResource {
    def apply(
      LogicalResourceId: LogicalResourceId,
      ResourceStatus: ResourceStatus,
      ResourceType: ResourceType,
      Timestamp: Timestamp,
      Description: js.UndefOr[Description] = js.undefined,
      DriftInformation: js.UndefOr[StackResourceDriftInformation] = js.undefined,
      PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined,
      ResourceStatusReason: js.UndefOr[ResourceStatusReason] = js.undefined,
      StackId: js.UndefOr[StackId] = js.undefined,
      StackName: js.UndefOr[StackName] = js.undefined): StackResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogicalResourceId" -> LogicalResourceId.asInstanceOf[js.Any],
        "ResourceStatus" -> ResourceStatus.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "Timestamp" -> Timestamp.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "DriftInformation" -> DriftInformation.map { x => x.asInstanceOf[js.Any] },
        "PhysicalResourceId" -> PhysicalResourceId.map { x => x.asInstanceOf[js.Any] },
        "ResourceStatusReason" -> ResourceStatusReason.map { x => x.asInstanceOf[js.Any] },
        "StackId" -> StackId.map { x => x.asInstanceOf[js.Any] },
        "StackName" -> StackName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackResource]
    }
  }

  /**
   * <p>Contains detailed information about the specified stack resource.</p>
   */
  @js.native
  trait StackResourceDetail extends js.Object {
    var LastUpdatedTimestamp: Timestamp
    var LogicalResourceId: LogicalResourceId
    var ResourceStatus: ResourceStatus
    var ResourceType: ResourceType
    var Description: js.UndefOr[Description]
    var DriftInformation: js.UndefOr[StackResourceDriftInformation]
    var Metadata: js.UndefOr[Metadata]
    var PhysicalResourceId: js.UndefOr[PhysicalResourceId]
    var ResourceStatusReason: js.UndefOr[ResourceStatusReason]
    var StackId: js.UndefOr[StackId]
    var StackName: js.UndefOr[StackName]
  }

  object StackResourceDetail {
    def apply(
      LastUpdatedTimestamp: Timestamp,
      LogicalResourceId: LogicalResourceId,
      ResourceStatus: ResourceStatus,
      ResourceType: ResourceType,
      Description: js.UndefOr[Description] = js.undefined,
      DriftInformation: js.UndefOr[StackResourceDriftInformation] = js.undefined,
      Metadata: js.UndefOr[Metadata] = js.undefined,
      PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined,
      ResourceStatusReason: js.UndefOr[ResourceStatusReason] = js.undefined,
      StackId: js.UndefOr[StackId] = js.undefined,
      StackName: js.UndefOr[StackName] = js.undefined): StackResourceDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastUpdatedTimestamp" -> LastUpdatedTimestamp.asInstanceOf[js.Any],
        "LogicalResourceId" -> LogicalResourceId.asInstanceOf[js.Any],
        "ResourceStatus" -> ResourceStatus.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "DriftInformation" -> DriftInformation.map { x => x.asInstanceOf[js.Any] },
        "Metadata" -> Metadata.map { x => x.asInstanceOf[js.Any] },
        "PhysicalResourceId" -> PhysicalResourceId.map { x => x.asInstanceOf[js.Any] },
        "ResourceStatusReason" -> ResourceStatusReason.map { x => x.asInstanceOf[js.Any] },
        "StackId" -> StackId.map { x => x.asInstanceOf[js.Any] },
        "StackName" -> StackName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackResourceDetail]
    }
  }

  /**
   * <p>Contains the drift information for a resource that has been checked for drift. This includes actual and expected property values for resources in which AWS CloudFormation has detected drift. Only resource properties explicitly defined in the stack template are checked for drift. For more information, see <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting Unregulated Configuration Changes to Stacks and Resources</a>.</p> <p>Resources that do not currently support drift detection cannot be checked. For a list of resources that support drift detection, see <a href="http://docs.aws.amazon.com/http:/docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html">Resources that Support Drift Detection</a>.</p> <p>Use <a>DetectStackResourceDrift</a> to detect drift on individual resources, or <a>DetectStackDrift</a> to detect drift on all resources in a given stack that support drift detection.</p>
   */
  @js.native
  trait StackResourceDrift extends js.Object {
    var LogicalResourceId: LogicalResourceId
    var ResourceType: ResourceType
    var StackId: StackId
    var StackResourceDriftStatus: StackResourceDriftStatus
    var Timestamp: Timestamp
    var ActualProperties: js.UndefOr[Properties]
    var ExpectedProperties: js.UndefOr[Properties]
    var PhysicalResourceId: js.UndefOr[PhysicalResourceId]
    var PhysicalResourceIdContext: js.UndefOr[PhysicalResourceIdContext]
    var PropertyDifferences: js.UndefOr[PropertyDifferences]
  }

  object StackResourceDrift {
    def apply(
      LogicalResourceId: LogicalResourceId,
      ResourceType: ResourceType,
      StackId: StackId,
      StackResourceDriftStatus: StackResourceDriftStatus,
      Timestamp: Timestamp,
      ActualProperties: js.UndefOr[Properties] = js.undefined,
      ExpectedProperties: js.UndefOr[Properties] = js.undefined,
      PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined,
      PhysicalResourceIdContext: js.UndefOr[PhysicalResourceIdContext] = js.undefined,
      PropertyDifferences: js.UndefOr[PropertyDifferences] = js.undefined): StackResourceDrift = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogicalResourceId" -> LogicalResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "StackId" -> StackId.asInstanceOf[js.Any],
        "StackResourceDriftStatus" -> StackResourceDriftStatus.asInstanceOf[js.Any],
        "Timestamp" -> Timestamp.asInstanceOf[js.Any],
        "ActualProperties" -> ActualProperties.map { x => x.asInstanceOf[js.Any] },
        "ExpectedProperties" -> ExpectedProperties.map { x => x.asInstanceOf[js.Any] },
        "PhysicalResourceId" -> PhysicalResourceId.map { x => x.asInstanceOf[js.Any] },
        "PhysicalResourceIdContext" -> PhysicalResourceIdContext.map { x => x.asInstanceOf[js.Any] },
        "PropertyDifferences" -> PropertyDifferences.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackResourceDrift]
    }
  }

  /**
   * <p>Contains information about whether the resource's actual configuration differs, or has <i>drifted</i>, from its expected configuration.</p>
   */
  @js.native
  trait StackResourceDriftInformation extends js.Object {
    var StackResourceDriftStatus: StackResourceDriftStatus
    var LastCheckTimestamp: js.UndefOr[Timestamp]
  }

  object StackResourceDriftInformation {
    def apply(
      StackResourceDriftStatus: StackResourceDriftStatus,
      LastCheckTimestamp: js.UndefOr[Timestamp] = js.undefined): StackResourceDriftInformation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackResourceDriftStatus" -> StackResourceDriftStatus.asInstanceOf[js.Any],
        "LastCheckTimestamp" -> LastCheckTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackResourceDriftInformation]
    }
  }

  /**
   * <p>Summarizes information about whether the resource's actual configuration differs, or has <i>drifted</i>, from its expected configuration.</p>
   */
  @js.native
  trait StackResourceDriftInformationSummary extends js.Object {
    var StackResourceDriftStatus: StackResourceDriftStatus
    var LastCheckTimestamp: js.UndefOr[Timestamp]
  }

  object StackResourceDriftInformationSummary {
    def apply(
      StackResourceDriftStatus: StackResourceDriftStatus,
      LastCheckTimestamp: js.UndefOr[Timestamp] = js.undefined): StackResourceDriftInformationSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackResourceDriftStatus" -> StackResourceDriftStatus.asInstanceOf[js.Any],
        "LastCheckTimestamp" -> LastCheckTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackResourceDriftInformationSummary]
    }
  }

  object StackResourceDriftStatusEnum {
    val IN_SYNC = "IN_SYNC"
    val MODIFIED = "MODIFIED"
    val DELETED = "DELETED"
    val NOT_CHECKED = "NOT_CHECKED"

    val values = IndexedSeq(IN_SYNC, MODIFIED, DELETED, NOT_CHECKED)
  }

  /**
   * <p>Contains high-level information about the specified stack resource.</p>
   */
  @js.native
  trait StackResourceSummary extends js.Object {
    var LastUpdatedTimestamp: Timestamp
    var LogicalResourceId: LogicalResourceId
    var ResourceStatus: ResourceStatus
    var ResourceType: ResourceType
    var DriftInformation: js.UndefOr[StackResourceDriftInformationSummary]
    var PhysicalResourceId: js.UndefOr[PhysicalResourceId]
    var ResourceStatusReason: js.UndefOr[ResourceStatusReason]
  }

  object StackResourceSummary {
    def apply(
      LastUpdatedTimestamp: Timestamp,
      LogicalResourceId: LogicalResourceId,
      ResourceStatus: ResourceStatus,
      ResourceType: ResourceType,
      DriftInformation: js.UndefOr[StackResourceDriftInformationSummary] = js.undefined,
      PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined,
      ResourceStatusReason: js.UndefOr[ResourceStatusReason] = js.undefined): StackResourceSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastUpdatedTimestamp" -> LastUpdatedTimestamp.asInstanceOf[js.Any],
        "LogicalResourceId" -> LogicalResourceId.asInstanceOf[js.Any],
        "ResourceStatus" -> ResourceStatus.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "DriftInformation" -> DriftInformation.map { x => x.asInstanceOf[js.Any] },
        "PhysicalResourceId" -> PhysicalResourceId.map { x => x.asInstanceOf[js.Any] },
        "ResourceStatusReason" -> ResourceStatusReason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackResourceSummary]
    }
  }

  /**
   * <p>A structure that contains information about a stack set. A stack set enables you to provision stacks into AWS accounts and across regions by using a single CloudFormation template. In the stack set, you specify the template to use, as well as any parameters and capabilities that the template requires. </p>
   */
  @js.native
  trait StackSet extends js.Object {
    var AdministrationRoleARN: js.UndefOr[RoleARN]
    var Capabilities: js.UndefOr[Capabilities]
    var Description: js.UndefOr[Description]
    var ExecutionRoleName: js.UndefOr[ExecutionRoleName]
    var Parameters: js.UndefOr[Parameters]
    var StackSetARN: js.UndefOr[StackSetARN]
    var StackSetId: js.UndefOr[StackSetId]
    var StackSetName: js.UndefOr[StackSetName]
    var Status: js.UndefOr[StackSetStatus]
    var Tags: js.UndefOr[Tags]
    var TemplateBody: js.UndefOr[TemplateBody]
  }

  object StackSet {
    def apply(
      AdministrationRoleARN: js.UndefOr[RoleARN] = js.undefined,
      Capabilities: js.UndefOr[Capabilities] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      ExecutionRoleName: js.UndefOr[ExecutionRoleName] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      StackSetARN: js.UndefOr[StackSetARN] = js.undefined,
      StackSetId: js.UndefOr[StackSetId] = js.undefined,
      StackSetName: js.UndefOr[StackSetName] = js.undefined,
      Status: js.UndefOr[StackSetStatus] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined,
      TemplateBody: js.UndefOr[TemplateBody] = js.undefined): StackSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdministrationRoleARN" -> AdministrationRoleARN.map { x => x.asInstanceOf[js.Any] },
        "Capabilities" -> Capabilities.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ExecutionRoleName" -> ExecutionRoleName.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "StackSetARN" -> StackSetARN.map { x => x.asInstanceOf[js.Any] },
        "StackSetId" -> StackSetId.map { x => x.asInstanceOf[js.Any] },
        "StackSetName" -> StackSetName.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "TemplateBody" -> TemplateBody.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackSet]
    }
  }

  /**
   * <p>The structure that contains information about a stack set operation. </p>
   */
  @js.native
  trait StackSetOperation extends js.Object {
    var Action: js.UndefOr[StackSetOperationAction]
    var AdministrationRoleARN: js.UndefOr[RoleARN]
    var CreationTimestamp: js.UndefOr[Timestamp]
    var EndTimestamp: js.UndefOr[Timestamp]
    var ExecutionRoleName: js.UndefOr[ExecutionRoleName]
    var OperationId: js.UndefOr[ClientRequestToken]
    var OperationPreferences: js.UndefOr[StackSetOperationPreferences]
    var RetainStacks: js.UndefOr[RetainStacksNullable]
    var StackSetId: js.UndefOr[StackSetId]
    var Status: js.UndefOr[StackSetOperationStatus]
  }

  object StackSetOperation {
    def apply(
      Action: js.UndefOr[StackSetOperationAction] = js.undefined,
      AdministrationRoleARN: js.UndefOr[RoleARN] = js.undefined,
      CreationTimestamp: js.UndefOr[Timestamp] = js.undefined,
      EndTimestamp: js.UndefOr[Timestamp] = js.undefined,
      ExecutionRoleName: js.UndefOr[ExecutionRoleName] = js.undefined,
      OperationId: js.UndefOr[ClientRequestToken] = js.undefined,
      OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.undefined,
      RetainStacks: js.UndefOr[RetainStacksNullable] = js.undefined,
      StackSetId: js.UndefOr[StackSetId] = js.undefined,
      Status: js.UndefOr[StackSetOperationStatus] = js.undefined): StackSetOperation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "AdministrationRoleARN" -> AdministrationRoleARN.map { x => x.asInstanceOf[js.Any] },
        "CreationTimestamp" -> CreationTimestamp.map { x => x.asInstanceOf[js.Any] },
        "EndTimestamp" -> EndTimestamp.map { x => x.asInstanceOf[js.Any] },
        "ExecutionRoleName" -> ExecutionRoleName.map { x => x.asInstanceOf[js.Any] },
        "OperationId" -> OperationId.map { x => x.asInstanceOf[js.Any] },
        "OperationPreferences" -> OperationPreferences.map { x => x.asInstanceOf[js.Any] },
        "RetainStacks" -> RetainStacks.map { x => x.asInstanceOf[js.Any] },
        "StackSetId" -> StackSetId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackSetOperation]
    }
  }

  object StackSetOperationActionEnum {
    val CREATE = "CREATE"
    val UPDATE = "UPDATE"
    val DELETE = "DELETE"

    val values = IndexedSeq(CREATE, UPDATE, DELETE)
  }

  /**
   * <p>The user-specified preferences for how AWS CloudFormation performs a stack set operation. </p> <p>For more information on maximum concurrent accounts and failure tolerance, see <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options">Stack set operation options</a>.</p>
   */
  @js.native
  trait StackSetOperationPreferences extends js.Object {
    var FailureToleranceCount: js.UndefOr[FailureToleranceCount]
    var FailureTolerancePercentage: js.UndefOr[FailureTolerancePercentage]
    var MaxConcurrentCount: js.UndefOr[MaxConcurrentCount]
    var MaxConcurrentPercentage: js.UndefOr[MaxConcurrentPercentage]
    var RegionOrder: js.UndefOr[RegionList]
  }

  object StackSetOperationPreferences {
    def apply(
      FailureToleranceCount: js.UndefOr[FailureToleranceCount] = js.undefined,
      FailureTolerancePercentage: js.UndefOr[FailureTolerancePercentage] = js.undefined,
      MaxConcurrentCount: js.UndefOr[MaxConcurrentCount] = js.undefined,
      MaxConcurrentPercentage: js.UndefOr[MaxConcurrentPercentage] = js.undefined,
      RegionOrder: js.UndefOr[RegionList] = js.undefined): StackSetOperationPreferences = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailureToleranceCount" -> FailureToleranceCount.map { x => x.asInstanceOf[js.Any] },
        "FailureTolerancePercentage" -> FailureTolerancePercentage.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrentCount" -> MaxConcurrentCount.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrentPercentage" -> MaxConcurrentPercentage.map { x => x.asInstanceOf[js.Any] },
        "RegionOrder" -> RegionOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackSetOperationPreferences]
    }
  }

  object StackSetOperationResultStatusEnum {
    val PENDING = "PENDING"
    val RUNNING = "RUNNING"
    val SUCCEEDED = "SUCCEEDED"
    val FAILED = "FAILED"
    val CANCELLED = "CANCELLED"

    val values = IndexedSeq(PENDING, RUNNING, SUCCEEDED, FAILED, CANCELLED)
  }

  /**
   * <p>The structure that contains information about a specified operation's results for a given account in a given region.</p>
   */
  @js.native
  trait StackSetOperationResultSummary extends js.Object {
    var Account: js.UndefOr[Account]
    var AccountGateResult: js.UndefOr[AccountGateResult]
    var Region: js.UndefOr[Region]
    var Status: js.UndefOr[StackSetOperationResultStatus]
    var StatusReason: js.UndefOr[Reason]
  }

  object StackSetOperationResultSummary {
    def apply(
      Account: js.UndefOr[Account] = js.undefined,
      AccountGateResult: js.UndefOr[AccountGateResult] = js.undefined,
      Region: js.UndefOr[Region] = js.undefined,
      Status: js.UndefOr[StackSetOperationResultStatus] = js.undefined,
      StatusReason: js.UndefOr[Reason] = js.undefined): StackSetOperationResultSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Account" -> Account.map { x => x.asInstanceOf[js.Any] },
        "AccountGateResult" -> AccountGateResult.map { x => x.asInstanceOf[js.Any] },
        "Region" -> Region.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusReason" -> StatusReason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackSetOperationResultSummary]
    }
  }

  object StackSetOperationStatusEnum {
    val RUNNING = "RUNNING"
    val SUCCEEDED = "SUCCEEDED"
    val FAILED = "FAILED"
    val STOPPING = "STOPPING"
    val STOPPED = "STOPPED"

    val values = IndexedSeq(RUNNING, SUCCEEDED, FAILED, STOPPING, STOPPED)
  }

  /**
   * <p>The structures that contain summary information about the specified operation.</p>
   */
  @js.native
  trait StackSetOperationSummary extends js.Object {
    var Action: js.UndefOr[StackSetOperationAction]
    var CreationTimestamp: js.UndefOr[Timestamp]
    var EndTimestamp: js.UndefOr[Timestamp]
    var OperationId: js.UndefOr[ClientRequestToken]
    var Status: js.UndefOr[StackSetOperationStatus]
  }

  object StackSetOperationSummary {
    def apply(
      Action: js.UndefOr[StackSetOperationAction] = js.undefined,
      CreationTimestamp: js.UndefOr[Timestamp] = js.undefined,
      EndTimestamp: js.UndefOr[Timestamp] = js.undefined,
      OperationId: js.UndefOr[ClientRequestToken] = js.undefined,
      Status: js.UndefOr[StackSetOperationStatus] = js.undefined): StackSetOperationSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "CreationTimestamp" -> CreationTimestamp.map { x => x.asInstanceOf[js.Any] },
        "EndTimestamp" -> EndTimestamp.map { x => x.asInstanceOf[js.Any] },
        "OperationId" -> OperationId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackSetOperationSummary]
    }
  }

  object StackSetStatusEnum {
    val ACTIVE = "ACTIVE"
    val DELETED = "DELETED"

    val values = IndexedSeq(ACTIVE, DELETED)
  }

  /**
   * <p>The structures that contain summary information about the specified stack set.</p>
   */
  @js.native
  trait StackSetSummary extends js.Object {
    var Description: js.UndefOr[Description]
    var StackSetId: js.UndefOr[StackSetId]
    var StackSetName: js.UndefOr[StackSetName]
    var Status: js.UndefOr[StackSetStatus]
  }

  object StackSetSummary {
    def apply(
      Description: js.UndefOr[Description] = js.undefined,
      StackSetId: js.UndefOr[StackSetId] = js.undefined,
      StackSetName: js.UndefOr[StackSetName] = js.undefined,
      Status: js.UndefOr[StackSetStatus] = js.undefined): StackSetSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "StackSetId" -> StackSetId.map { x => x.asInstanceOf[js.Any] },
        "StackSetName" -> StackSetName.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackSetSummary]
    }
  }

  object StackStatusEnum {
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS"
    val CREATE_FAILED = "CREATE_FAILED"
    val CREATE_COMPLETE = "CREATE_COMPLETE"
    val ROLLBACK_IN_PROGRESS = "ROLLBACK_IN_PROGRESS"
    val ROLLBACK_FAILED = "ROLLBACK_FAILED"
    val ROLLBACK_COMPLETE = "ROLLBACK_COMPLETE"
    val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS"
    val DELETE_FAILED = "DELETE_FAILED"
    val DELETE_COMPLETE = "DELETE_COMPLETE"
    val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS"
    val UPDATE_COMPLETE_CLEANUP_IN_PROGRESS = "UPDATE_COMPLETE_CLEANUP_IN_PROGRESS"
    val UPDATE_COMPLETE = "UPDATE_COMPLETE"
    val UPDATE_ROLLBACK_IN_PROGRESS = "UPDATE_ROLLBACK_IN_PROGRESS"
    val UPDATE_ROLLBACK_FAILED = "UPDATE_ROLLBACK_FAILED"
    val UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS = "UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS"
    val UPDATE_ROLLBACK_COMPLETE = "UPDATE_ROLLBACK_COMPLETE"
    val REVIEW_IN_PROGRESS = "REVIEW_IN_PROGRESS"

    val values = IndexedSeq(CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED, ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED, UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE, REVIEW_IN_PROGRESS)
  }

  /**
   * <p>The StackSummary Data Type</p>
   */
  @js.native
  trait StackSummary extends js.Object {
    var CreationTime: CreationTime
    var StackName: StackName
    var StackStatus: StackStatus
    var DeletionTime: js.UndefOr[DeletionTime]
    var DriftInformation: js.UndefOr[StackDriftInformationSummary]
    var LastUpdatedTime: js.UndefOr[LastUpdatedTime]
    var ParentId: js.UndefOr[StackId]
    var RootId: js.UndefOr[StackId]
    var StackId: js.UndefOr[StackId]
    var StackStatusReason: js.UndefOr[StackStatusReason]
    var TemplateDescription: js.UndefOr[TemplateDescription]
  }

  object StackSummary {
    def apply(
      CreationTime: CreationTime,
      StackName: StackName,
      StackStatus: StackStatus,
      DeletionTime: js.UndefOr[DeletionTime] = js.undefined,
      DriftInformation: js.UndefOr[StackDriftInformationSummary] = js.undefined,
      LastUpdatedTime: js.UndefOr[LastUpdatedTime] = js.undefined,
      ParentId: js.UndefOr[StackId] = js.undefined,
      RootId: js.UndefOr[StackId] = js.undefined,
      StackId: js.UndefOr[StackId] = js.undefined,
      StackStatusReason: js.UndefOr[StackStatusReason] = js.undefined,
      TemplateDescription: js.UndefOr[TemplateDescription] = js.undefined): StackSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "StackName" -> StackName.asInstanceOf[js.Any],
        "StackStatus" -> StackStatus.asInstanceOf[js.Any],
        "DeletionTime" -> DeletionTime.map { x => x.asInstanceOf[js.Any] },
        "DriftInformation" -> DriftInformation.map { x => x.asInstanceOf[js.Any] },
        "LastUpdatedTime" -> LastUpdatedTime.map { x => x.asInstanceOf[js.Any] },
        "ParentId" -> ParentId.map { x => x.asInstanceOf[js.Any] },
        "RootId" -> RootId.map { x => x.asInstanceOf[js.Any] },
        "StackId" -> StackId.map { x => x.asInstanceOf[js.Any] },
        "StackStatusReason" -> StackStatusReason.map { x => x.asInstanceOf[js.Any] },
        "TemplateDescription" -> TemplateDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackSummary]
    }
  }

  @js.native
  trait StopStackSetOperationInput extends js.Object {
    var OperationId: ClientRequestToken
    var StackSetName: StackSetName
  }

  object StopStackSetOperationInput {
    def apply(
      OperationId: ClientRequestToken,
      StackSetName: StackSetName): StopStackSetOperationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OperationId" -> OperationId.asInstanceOf[js.Any],
        "StackSetName" -> StackSetName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopStackSetOperationInput]
    }
  }

  @js.native
  trait StopStackSetOperationOutput extends js.Object {

  }

  object StopStackSetOperationOutput {
    def apply(): StopStackSetOperationOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopStackSetOperationOutput]
    }
  }

  /**
   * <p>The Tag type enables you to specify a key-value pair that can be used to store information about an AWS CloudFormation stack.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
      Key: TagKey,
      Value: TagValue): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>The TemplateParameter data type.</p>
   */
  @js.native
  trait TemplateParameter extends js.Object {
    var DefaultValue: js.UndefOr[ParameterValue]
    var Description: js.UndefOr[Description]
    var NoEcho: js.UndefOr[NoEcho]
    var ParameterKey: js.UndefOr[ParameterKey]
  }

  object TemplateParameter {
    def apply(
      DefaultValue: js.UndefOr[ParameterValue] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      NoEcho: js.UndefOr[NoEcho] = js.undefined,
      ParameterKey: js.UndefOr[ParameterKey] = js.undefined): TemplateParameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DefaultValue" -> DefaultValue.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "NoEcho" -> NoEcho.map { x => x.asInstanceOf[js.Any] },
        "ParameterKey" -> ParameterKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TemplateParameter]
    }
  }

  object TemplateStageEnum {
    val Original = "Original"
    val Processed = "Processed"

    val values = IndexedSeq(Original, Processed)
  }

  /**
   * <p>The input for an <a>UpdateStack</a> action.</p>
   */
  @js.native
  trait UpdateStackInput extends js.Object {
    var StackName: StackName
    var Capabilities: js.UndefOr[Capabilities]
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var NotificationARNs: js.UndefOr[NotificationARNs]
    var Parameters: js.UndefOr[Parameters]
    var ResourceTypes: js.UndefOr[ResourceTypes]
    var RoleARN: js.UndefOr[RoleARN]
    var RollbackConfiguration: js.UndefOr[RollbackConfiguration]
    var StackPolicyBody: js.UndefOr[StackPolicyBody]
    var StackPolicyDuringUpdateBody: js.UndefOr[StackPolicyDuringUpdateBody]
    var StackPolicyDuringUpdateURL: js.UndefOr[StackPolicyDuringUpdateURL]
    var StackPolicyURL: js.UndefOr[StackPolicyURL]
    var Tags: js.UndefOr[Tags]
    var TemplateBody: js.UndefOr[TemplateBody]
    var TemplateURL: js.UndefOr[TemplateURL]
    var UsePreviousTemplate: js.UndefOr[UsePreviousTemplate]
  }

  object UpdateStackInput {
    def apply(
      StackName: StackName,
      Capabilities: js.UndefOr[Capabilities] = js.undefined,
      ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      NotificationARNs: js.UndefOr[NotificationARNs] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      ResourceTypes: js.UndefOr[ResourceTypes] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      RollbackConfiguration: js.UndefOr[RollbackConfiguration] = js.undefined,
      StackPolicyBody: js.UndefOr[StackPolicyBody] = js.undefined,
      StackPolicyDuringUpdateBody: js.UndefOr[StackPolicyDuringUpdateBody] = js.undefined,
      StackPolicyDuringUpdateURL: js.UndefOr[StackPolicyDuringUpdateURL] = js.undefined,
      StackPolicyURL: js.UndefOr[StackPolicyURL] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined,
      TemplateBody: js.UndefOr[TemplateBody] = js.undefined,
      TemplateURL: js.UndefOr[TemplateURL] = js.undefined,
      UsePreviousTemplate: js.UndefOr[UsePreviousTemplate] = js.undefined): UpdateStackInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackName" -> StackName.asInstanceOf[js.Any],
        "Capabilities" -> Capabilities.map { x => x.asInstanceOf[js.Any] },
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "NotificationARNs" -> NotificationARNs.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "ResourceTypes" -> ResourceTypes.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "RollbackConfiguration" -> RollbackConfiguration.map { x => x.asInstanceOf[js.Any] },
        "StackPolicyBody" -> StackPolicyBody.map { x => x.asInstanceOf[js.Any] },
        "StackPolicyDuringUpdateBody" -> StackPolicyDuringUpdateBody.map { x => x.asInstanceOf[js.Any] },
        "StackPolicyDuringUpdateURL" -> StackPolicyDuringUpdateURL.map { x => x.asInstanceOf[js.Any] },
        "StackPolicyURL" -> StackPolicyURL.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "TemplateBody" -> TemplateBody.map { x => x.asInstanceOf[js.Any] },
        "TemplateURL" -> TemplateURL.map { x => x.asInstanceOf[js.Any] },
        "UsePreviousTemplate" -> UsePreviousTemplate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStackInput]
    }
  }

  @js.native
  trait UpdateStackInstancesInput extends js.Object {
    var Accounts: AccountList
    var Regions: RegionList
    var StackSetName: StackSetNameOrId
    var OperationId: js.UndefOr[ClientRequestToken]
    var OperationPreferences: js.UndefOr[StackSetOperationPreferences]
    var ParameterOverrides: js.UndefOr[Parameters]
  }

  object UpdateStackInstancesInput {
    def apply(
      Accounts: AccountList,
      Regions: RegionList,
      StackSetName: StackSetNameOrId,
      OperationId: js.UndefOr[ClientRequestToken] = js.undefined,
      OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.undefined,
      ParameterOverrides: js.UndefOr[Parameters] = js.undefined): UpdateStackInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Accounts" -> Accounts.asInstanceOf[js.Any],
        "Regions" -> Regions.asInstanceOf[js.Any],
        "StackSetName" -> StackSetName.asInstanceOf[js.Any],
        "OperationId" -> OperationId.map { x => x.asInstanceOf[js.Any] },
        "OperationPreferences" -> OperationPreferences.map { x => x.asInstanceOf[js.Any] },
        "ParameterOverrides" -> ParameterOverrides.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStackInstancesInput]
    }
  }

  @js.native
  trait UpdateStackInstancesOutput extends js.Object {
    var OperationId: js.UndefOr[ClientRequestToken]
  }

  object UpdateStackInstancesOutput {
    def apply(
      OperationId: js.UndefOr[ClientRequestToken] = js.undefined): UpdateStackInstancesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OperationId" -> OperationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStackInstancesOutput]
    }
  }

  /**
   * <p>The output for an <a>UpdateStack</a> action.</p>
   */
  @js.native
  trait UpdateStackOutput extends js.Object {
    var StackId: js.UndefOr[StackId]
  }

  object UpdateStackOutput {
    def apply(
      StackId: js.UndefOr[StackId] = js.undefined): UpdateStackOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackId" -> StackId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStackOutput]
    }
  }

  @js.native
  trait UpdateStackSetInput extends js.Object {
    var StackSetName: StackSetName
    var Accounts: js.UndefOr[AccountList]
    var AdministrationRoleARN: js.UndefOr[RoleARN]
    var Capabilities: js.UndefOr[Capabilities]
    var Description: js.UndefOr[Description]
    var ExecutionRoleName: js.UndefOr[ExecutionRoleName]
    var OperationId: js.UndefOr[ClientRequestToken]
    var OperationPreferences: js.UndefOr[StackSetOperationPreferences]
    var Parameters: js.UndefOr[Parameters]
    var Regions: js.UndefOr[RegionList]
    var Tags: js.UndefOr[Tags]
    var TemplateBody: js.UndefOr[TemplateBody]
    var TemplateURL: js.UndefOr[TemplateURL]
    var UsePreviousTemplate: js.UndefOr[UsePreviousTemplate]
  }

  object UpdateStackSetInput {
    def apply(
      StackSetName: StackSetName,
      Accounts: js.UndefOr[AccountList] = js.undefined,
      AdministrationRoleARN: js.UndefOr[RoleARN] = js.undefined,
      Capabilities: js.UndefOr[Capabilities] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      ExecutionRoleName: js.UndefOr[ExecutionRoleName] = js.undefined,
      OperationId: js.UndefOr[ClientRequestToken] = js.undefined,
      OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      Regions: js.UndefOr[RegionList] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined,
      TemplateBody: js.UndefOr[TemplateBody] = js.undefined,
      TemplateURL: js.UndefOr[TemplateURL] = js.undefined,
      UsePreviousTemplate: js.UndefOr[UsePreviousTemplate] = js.undefined): UpdateStackSetInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackSetName" -> StackSetName.asInstanceOf[js.Any],
        "Accounts" -> Accounts.map { x => x.asInstanceOf[js.Any] },
        "AdministrationRoleARN" -> AdministrationRoleARN.map { x => x.asInstanceOf[js.Any] },
        "Capabilities" -> Capabilities.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ExecutionRoleName" -> ExecutionRoleName.map { x => x.asInstanceOf[js.Any] },
        "OperationId" -> OperationId.map { x => x.asInstanceOf[js.Any] },
        "OperationPreferences" -> OperationPreferences.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "Regions" -> Regions.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "TemplateBody" -> TemplateBody.map { x => x.asInstanceOf[js.Any] },
        "TemplateURL" -> TemplateURL.map { x => x.asInstanceOf[js.Any] },
        "UsePreviousTemplate" -> UsePreviousTemplate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStackSetInput]
    }
  }

  @js.native
  trait UpdateStackSetOutput extends js.Object {
    var OperationId: js.UndefOr[ClientRequestToken]
  }

  object UpdateStackSetOutput {
    def apply(
      OperationId: js.UndefOr[ClientRequestToken] = js.undefined): UpdateStackSetOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OperationId" -> OperationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStackSetOutput]
    }
  }

  @js.native
  trait UpdateTerminationProtectionInput extends js.Object {
    var EnableTerminationProtection: EnableTerminationProtection
    var StackName: StackNameOrId
  }

  object UpdateTerminationProtectionInput {
    def apply(
      EnableTerminationProtection: EnableTerminationProtection,
      StackName: StackNameOrId): UpdateTerminationProtectionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EnableTerminationProtection" -> EnableTerminationProtection.asInstanceOf[js.Any],
        "StackName" -> StackName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTerminationProtectionInput]
    }
  }

  @js.native
  trait UpdateTerminationProtectionOutput extends js.Object {
    var StackId: js.UndefOr[StackId]
  }

  object UpdateTerminationProtectionOutput {
    def apply(
      StackId: js.UndefOr[StackId] = js.undefined): UpdateTerminationProtectionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackId" -> StackId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTerminationProtectionOutput]
    }
  }

  /**
   * <p>The input for <a>ValidateTemplate</a> action.</p>
   */
  @js.native
  trait ValidateTemplateInput extends js.Object {
    var TemplateBody: js.UndefOr[TemplateBody]
    var TemplateURL: js.UndefOr[TemplateURL]
  }

  object ValidateTemplateInput {
    def apply(
      TemplateBody: js.UndefOr[TemplateBody] = js.undefined,
      TemplateURL: js.UndefOr[TemplateURL] = js.undefined): ValidateTemplateInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TemplateBody" -> TemplateBody.map { x => x.asInstanceOf[js.Any] },
        "TemplateURL" -> TemplateURL.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidateTemplateInput]
    }
  }

  /**
   * <p>The output for <a>ValidateTemplate</a> action.</p>
   */
  @js.native
  trait ValidateTemplateOutput extends js.Object {
    var Capabilities: js.UndefOr[Capabilities]
    var CapabilitiesReason: js.UndefOr[CapabilitiesReason]
    var DeclaredTransforms: js.UndefOr[TransformsList]
    var Description: js.UndefOr[Description]
    var Parameters: js.UndefOr[TemplateParameters]
  }

  object ValidateTemplateOutput {
    def apply(
      Capabilities: js.UndefOr[Capabilities] = js.undefined,
      CapabilitiesReason: js.UndefOr[CapabilitiesReason] = js.undefined,
      DeclaredTransforms: js.UndefOr[TransformsList] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      Parameters: js.UndefOr[TemplateParameters] = js.undefined): ValidateTemplateOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Capabilities" -> Capabilities.map { x => x.asInstanceOf[js.Any] },
        "CapabilitiesReason" -> CapabilitiesReason.map { x => x.asInstanceOf[js.Any] },
        "DeclaredTransforms" -> DeclaredTransforms.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidateTemplateOutput]
    }
  }
}
