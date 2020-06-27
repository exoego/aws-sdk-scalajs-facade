package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object cloudformation {
  type Account                              = String
  type AccountGateStatusReason              = String
  type AccountLimitList                     = js.Array[AccountLimit]
  type AccountList                          = js.Array[Account]
  type AllowedValue                         = String
  type AllowedValues                        = js.Array[AllowedValue]
  type Arn                                  = String
  type AutoDeploymentNullable               = Boolean
  type BoxedInteger                         = Int
  type BoxedMaxResults                      = Int
  type Capabilities                         = js.Array[Capability]
  type CapabilitiesReason                   = String
  type CausingEntity                        = String
  type ChangeSetId                          = String
  type ChangeSetName                        = String
  type ChangeSetNameOrId                    = String
  type ChangeSetStatusReason                = String
  type ChangeSetSummaries                   = js.Array[ChangeSetSummary]
  type Changes                              = js.Array[Change]
  type ClientRequestToken                   = String
  type ClientToken                          = String
  type CreationTime                         = js.Date
  type DeletionTime                         = js.Date
  type Description                          = String
  type DisableRollback                      = Boolean
  type DriftedStackInstancesCount           = Int
  type EnableTerminationProtection          = Boolean
  type EventId                              = String
  type ExecutionRoleName                    = String
  type ExportName                           = String
  type ExportValue                          = String
  type Exports                              = js.Array[Export]
  type FailedStackInstancesCount            = Int
  type FailureToleranceCount                = Int
  type FailureTolerancePercentage           = Int
  type Imports                              = js.Array[StackName]
  type InProgressStackInstancesCount        = Int
  type InSyncStackInstancesCount            = Int
  type Key                                  = String
  type LastUpdatedTime                      = js.Date
  type LimitName                            = String
  type LimitValue                           = Int
  type LogGroupName                         = String
  type LogicalResourceId                    = String
  type LogicalResourceIds                   = js.Array[LogicalResourceId]
  type MaxConcurrentCount                   = Int
  type MaxConcurrentPercentage              = Int
  type MaxResults                           = Int
  type Metadata                             = String
  type MonitoringTimeInMinutes              = Int
  type NextToken                            = String
  type NoEcho                               = Boolean
  type NotificationARN                      = String
  type NotificationARNs                     = js.Array[NotificationARN]
  type OptionalSecureUrl                    = String
  type OrganizationalUnitId                 = String
  type OrganizationalUnitIdList             = js.Array[OrganizationalUnitId]
  type OutputKey                            = String
  type OutputValue                          = String
  type Outputs                              = js.Array[Output]
  type ParameterDeclarations                = js.Array[ParameterDeclaration]
  type ParameterKey                         = String
  type ParameterType                        = String
  type ParameterValue                       = String
  type Parameters                           = js.Array[Parameter]
  type PhysicalResourceId                   = String
  type PhysicalResourceIdContext            = js.Array[PhysicalResourceIdContextKeyValuePair]
  type PrivateTypeArn                       = String
  type Properties                           = String
  type PropertyDifferences                  = js.Array[PropertyDifference]
  type PropertyName                         = String
  type PropertyPath                         = String
  type PropertyValue                        = String
  type Reason                               = String
  type Region                               = String
  type RegionList                           = js.Array[Region]
  type RegistrationToken                    = String
  type RegistrationTokenList                = js.Array[RegistrationToken]
  type RequestToken                         = String
  type ResourceChangeDetails                = js.Array[ResourceChangeDetail]
  type ResourceIdentifierProperties         = js.Dictionary[ResourceIdentifierPropertyValue]
  type ResourceIdentifierPropertyKey        = String
  type ResourceIdentifierPropertyValue      = String
  type ResourceIdentifierSummaries          = js.Array[ResourceIdentifierSummary]
  type ResourceIdentifiers                  = js.Array[ResourceIdentifierPropertyKey]
  type ResourceModel                        = String
  type ResourceProperties                   = String
  type ResourceSignalUniqueId               = String
  type ResourceStatusReason                 = String
  type ResourceToSkip                       = String
  type ResourceType                         = String
  type ResourceTypes                        = js.Array[ResourceType]
  type ResourcesToImport                    = js.Array[ResourceToImport]
  type ResourcesToSkip                      = js.Array[ResourceToSkip]
  type RetainResources                      = js.Array[LogicalResourceId]
  type RetainStacks                         = Boolean
  type RetainStacksNullable                 = Boolean
  type RetainStacksOnAccountRemovalNullable = Boolean
  type RoleARN                              = String
  type RoleArn                              = String
  type RollbackTriggers                     = js.Array[RollbackTrigger]
  type S3Url                                = String
  type Scope                                = js.Array[ResourceAttribute]
  type StackDriftDetectionId                = String
  type StackDriftDetectionStatusReason      = String
  type StackEvents                          = js.Array[StackEvent]
  type StackId                              = String
  type StackInstanceSummaries               = js.Array[StackInstanceSummary]
  type StackName                            = String
  type StackNameOrId                        = String
  type StackPolicyBody                      = String
  type StackPolicyDuringUpdateBody          = String
  type StackPolicyDuringUpdateURL           = String
  type StackPolicyURL                       = String
  type StackResourceDriftStatusFilters      = js.Array[StackResourceDriftStatus]
  type StackResourceDrifts                  = js.Array[StackResourceDrift]
  type StackResourceSummaries               = js.Array[StackResourceSummary]
  type StackResources                       = js.Array[StackResource]
  type StackSetARN                          = String
  type StackSetId                           = String
  type StackSetName                         = String
  type StackSetNameOrId                     = String
  type StackSetOperationResultSummaries     = js.Array[StackSetOperationResultSummary]
  type StackSetOperationSummaries           = js.Array[StackSetOperationSummary]
  type StackSetSummaries                    = js.Array[StackSetSummary]
  type StackStatusFilter                    = js.Array[StackStatus]
  type StackStatusReason                    = String
  type StackSummaries                       = js.Array[StackSummary]
  type Stacks                               = js.Array[Stack]
  type StageList                            = js.Array[TemplateStage]
  type StatusMessage                        = String
  type TagKey                               = String
  type TagValue                             = String
  type Tags                                 = js.Array[Tag]
  type TemplateBody                         = String
  type TemplateDescription                  = String
  type TemplateParameters                   = js.Array[TemplateParameter]
  type TemplateURL                          = String
  type TimeoutMinutes                       = Int
  type Timestamp                            = js.Date
  type TotalStackInstancesCount             = Int
  type TransformName                        = String
  type TransformsList                       = js.Array[TransformName]
  type Type                                 = String
  type TypeArn                              = String
  type TypeName                             = String
  type TypeSchema                           = String
  type TypeSummaries                        = js.Array[TypeSummary]
  type TypeVersionId                        = String
  type TypeVersionSummaries                 = js.Array[TypeVersionSummary]
  type Url                                  = String
  type UsePreviousTemplate                  = Boolean
  type UsePreviousValue                     = Boolean
  type Value                                = String
  type Version                              = String

  implicit final class CloudFormationOps(private val service: CloudFormation) extends AnyVal {

    @inline def cancelUpdateStackFuture(params: CancelUpdateStackInput): Future[js.Object] =
      service.cancelUpdateStack(params).promise().toFuture
    @inline def continueUpdateRollbackFuture(
        params: ContinueUpdateRollbackInput
    ): Future[ContinueUpdateRollbackOutput] = service.continueUpdateRollback(params).promise().toFuture
    @inline def createChangeSetFuture(params: CreateChangeSetInput): Future[CreateChangeSetOutput] =
      service.createChangeSet(params).promise().toFuture
    @inline def createStackFuture(params: CreateStackInput): Future[CreateStackOutput] =
      service.createStack(params).promise().toFuture
    @inline def createStackInstancesFuture(params: CreateStackInstancesInput): Future[CreateStackInstancesOutput] =
      service.createStackInstances(params).promise().toFuture
    @inline def createStackSetFuture(params: CreateStackSetInput): Future[CreateStackSetOutput] =
      service.createStackSet(params).promise().toFuture
    @inline def deleteChangeSetFuture(params: DeleteChangeSetInput): Future[DeleteChangeSetOutput] =
      service.deleteChangeSet(params).promise().toFuture
    @inline def deleteStackFuture(params: DeleteStackInput): Future[js.Object] =
      service.deleteStack(params).promise().toFuture
    @inline def deleteStackInstancesFuture(params: DeleteStackInstancesInput): Future[DeleteStackInstancesOutput] =
      service.deleteStackInstances(params).promise().toFuture
    @inline def deleteStackSetFuture(params: DeleteStackSetInput): Future[DeleteStackSetOutput] =
      service.deleteStackSet(params).promise().toFuture
    @inline def deregisterTypeFuture(params: DeregisterTypeInput): Future[DeregisterTypeOutput] =
      service.deregisterType(params).promise().toFuture
    @inline def describeAccountLimitsFuture(params: DescribeAccountLimitsInput): Future[DescribeAccountLimitsOutput] =
      service.describeAccountLimits(params).promise().toFuture
    @inline def describeChangeSetFuture(params: DescribeChangeSetInput): Future[DescribeChangeSetOutput] =
      service.describeChangeSet(params).promise().toFuture
    @inline def describeStackDriftDetectionStatusFuture(
        params: DescribeStackDriftDetectionStatusInput
    ): Future[DescribeStackDriftDetectionStatusOutput] =
      service.describeStackDriftDetectionStatus(params).promise().toFuture
    @inline def describeStackEventsFuture(params: DescribeStackEventsInput): Future[DescribeStackEventsOutput] =
      service.describeStackEvents(params).promise().toFuture
    @inline def describeStackInstanceFuture(params: DescribeStackInstanceInput): Future[DescribeStackInstanceOutput] =
      service.describeStackInstance(params).promise().toFuture
    @inline def describeStackResourceDriftsFuture(
        params: DescribeStackResourceDriftsInput
    ): Future[DescribeStackResourceDriftsOutput] = service.describeStackResourceDrifts(params).promise().toFuture
    @inline def describeStackResourceFuture(params: DescribeStackResourceInput): Future[DescribeStackResourceOutput] =
      service.describeStackResource(params).promise().toFuture
    @inline def describeStackResourcesFuture(
        params: DescribeStackResourcesInput
    ): Future[DescribeStackResourcesOutput] = service.describeStackResources(params).promise().toFuture
    @inline def describeStackSetFuture(params: DescribeStackSetInput): Future[DescribeStackSetOutput] =
      service.describeStackSet(params).promise().toFuture
    @inline def describeStackSetOperationFuture(
        params: DescribeStackSetOperationInput
    ): Future[DescribeStackSetOperationOutput] = service.describeStackSetOperation(params).promise().toFuture
    @inline def describeStacksFuture(params: DescribeStacksInput): Future[DescribeStacksOutput] =
      service.describeStacks(params).promise().toFuture
    @inline def describeTypeFuture(params: DescribeTypeInput): Future[DescribeTypeOutput] =
      service.describeType(params).promise().toFuture
    @inline def describeTypeRegistrationFuture(
        params: DescribeTypeRegistrationInput
    ): Future[DescribeTypeRegistrationOutput] = service.describeTypeRegistration(params).promise().toFuture
    @inline def detectStackDriftFuture(params: DetectStackDriftInput): Future[DetectStackDriftOutput] =
      service.detectStackDrift(params).promise().toFuture
    @inline def detectStackResourceDriftFuture(
        params: DetectStackResourceDriftInput
    ): Future[DetectStackResourceDriftOutput] = service.detectStackResourceDrift(params).promise().toFuture
    @inline def detectStackSetDriftFuture(params: DetectStackSetDriftInput): Future[DetectStackSetDriftOutput] =
      service.detectStackSetDrift(params).promise().toFuture
    @inline def estimateTemplateCostFuture(params: EstimateTemplateCostInput): Future[EstimateTemplateCostOutput] =
      service.estimateTemplateCost(params).promise().toFuture
    @inline def executeChangeSetFuture(params: ExecuteChangeSetInput): Future[ExecuteChangeSetOutput] =
      service.executeChangeSet(params).promise().toFuture
    @inline def getStackPolicyFuture(params: GetStackPolicyInput): Future[GetStackPolicyOutput] =
      service.getStackPolicy(params).promise().toFuture
    @inline def getTemplateFuture(params: GetTemplateInput): Future[GetTemplateOutput] =
      service.getTemplate(params).promise().toFuture
    @inline def getTemplateSummaryFuture(params: GetTemplateSummaryInput): Future[GetTemplateSummaryOutput] =
      service.getTemplateSummary(params).promise().toFuture
    @inline def listChangeSetsFuture(params: ListChangeSetsInput): Future[ListChangeSetsOutput] =
      service.listChangeSets(params).promise().toFuture
    @inline def listExportsFuture(params: ListExportsInput): Future[ListExportsOutput] =
      service.listExports(params).promise().toFuture
    @inline def listImportsFuture(params: ListImportsInput): Future[ListImportsOutput] =
      service.listImports(params).promise().toFuture
    @inline def listStackInstancesFuture(params: ListStackInstancesInput): Future[ListStackInstancesOutput] =
      service.listStackInstances(params).promise().toFuture
    @inline def listStackResourcesFuture(params: ListStackResourcesInput): Future[ListStackResourcesOutput] =
      service.listStackResources(params).promise().toFuture
    @inline def listStackSetOperationResultsFuture(
        params: ListStackSetOperationResultsInput
    ): Future[ListStackSetOperationResultsOutput] = service.listStackSetOperationResults(params).promise().toFuture
    @inline def listStackSetOperationsFuture(
        params: ListStackSetOperationsInput
    ): Future[ListStackSetOperationsOutput] = service.listStackSetOperations(params).promise().toFuture
    @inline def listStackSetsFuture(params: ListStackSetsInput): Future[ListStackSetsOutput] =
      service.listStackSets(params).promise().toFuture
    @inline def listStacksFuture(params: ListStacksInput): Future[ListStacksOutput] =
      service.listStacks(params).promise().toFuture
    @inline def listTypeRegistrationsFuture(params: ListTypeRegistrationsInput): Future[ListTypeRegistrationsOutput] =
      service.listTypeRegistrations(params).promise().toFuture
    @inline def listTypeVersionsFuture(params: ListTypeVersionsInput): Future[ListTypeVersionsOutput] =
      service.listTypeVersions(params).promise().toFuture
    @inline def listTypesFuture(params: ListTypesInput): Future[ListTypesOutput] =
      service.listTypes(params).promise().toFuture
    @inline def recordHandlerProgressFuture(params: RecordHandlerProgressInput): Future[RecordHandlerProgressOutput] =
      service.recordHandlerProgress(params).promise().toFuture
    @inline def registerTypeFuture(params: RegisterTypeInput): Future[RegisterTypeOutput] =
      service.registerType(params).promise().toFuture
    @inline def setStackPolicyFuture(params: SetStackPolicyInput): Future[js.Object] =
      service.setStackPolicy(params).promise().toFuture
    @inline def setTypeDefaultVersionFuture(params: SetTypeDefaultVersionInput): Future[SetTypeDefaultVersionOutput] =
      service.setTypeDefaultVersion(params).promise().toFuture
    @inline def signalResourceFuture(params: SignalResourceInput): Future[js.Object] =
      service.signalResource(params).promise().toFuture
    @inline def stopStackSetOperationFuture(params: StopStackSetOperationInput): Future[StopStackSetOperationOutput] =
      service.stopStackSetOperation(params).promise().toFuture
    @inline def updateStackFuture(params: UpdateStackInput): Future[UpdateStackOutput] =
      service.updateStack(params).promise().toFuture
    @inline def updateStackInstancesFuture(params: UpdateStackInstancesInput): Future[UpdateStackInstancesOutput] =
      service.updateStackInstances(params).promise().toFuture
    @inline def updateStackSetFuture(params: UpdateStackSetInput): Future[UpdateStackSetOutput] =
      service.updateStackSet(params).promise().toFuture
    @inline def updateTerminationProtectionFuture(
        params: UpdateTerminationProtectionInput
    ): Future[UpdateTerminationProtectionOutput] = service.updateTerminationProtection(params).promise().toFuture
    @inline def validateTemplateFuture(params: ValidateTemplateInput): Future[ValidateTemplateOutput] =
      service.validateTemplate(params).promise().toFuture
  }
}

package cloudformation {
  @js.native
  @JSImport("aws-sdk", "CloudFormation")
  class CloudFormation() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelUpdateStack(params: CancelUpdateStackInput): Request[js.Object]                              = js.native
    def continueUpdateRollback(params: ContinueUpdateRollbackInput): Request[ContinueUpdateRollbackOutput] = js.native
    def createChangeSet(params: CreateChangeSetInput): Request[CreateChangeSetOutput]                      = js.native
    def createStack(params: CreateStackInput): Request[CreateStackOutput]                                  = js.native
    def createStackInstances(params: CreateStackInstancesInput): Request[CreateStackInstancesOutput]       = js.native
    def createStackSet(params: CreateStackSetInput): Request[CreateStackSetOutput]                         = js.native
    def deleteChangeSet(params: DeleteChangeSetInput): Request[DeleteChangeSetOutput]                      = js.native
    def deleteStack(params: DeleteStackInput): Request[js.Object]                                          = js.native
    def deleteStackInstances(params: DeleteStackInstancesInput): Request[DeleteStackInstancesOutput]       = js.native
    def deleteStackSet(params: DeleteStackSetInput): Request[DeleteStackSetOutput]                         = js.native
    def deregisterType(params: DeregisterTypeInput): Request[DeregisterTypeOutput]                         = js.native
    def describeAccountLimits(params: DescribeAccountLimitsInput): Request[DescribeAccountLimitsOutput]    = js.native
    def describeChangeSet(params: DescribeChangeSetInput): Request[DescribeChangeSetOutput]                = js.native
    def describeStackDriftDetectionStatus(
        params: DescribeStackDriftDetectionStatusInput
    ): Request[DescribeStackDriftDetectionStatusOutput]                                                 = js.native
    def describeStackEvents(params: DescribeStackEventsInput): Request[DescribeStackEventsOutput]       = js.native
    def describeStackInstance(params: DescribeStackInstanceInput): Request[DescribeStackInstanceOutput] = js.native
    def describeStackResource(params: DescribeStackResourceInput): Request[DescribeStackResourceOutput] = js.native
    def describeStackResourceDrifts(
        params: DescribeStackResourceDriftsInput
    ): Request[DescribeStackResourceDriftsOutput]                                                          = js.native
    def describeStackResources(params: DescribeStackResourcesInput): Request[DescribeStackResourcesOutput] = js.native
    def describeStackSet(params: DescribeStackSetInput): Request[DescribeStackSetOutput]                   = js.native
    def describeStackSetOperation(params: DescribeStackSetOperationInput): Request[DescribeStackSetOperationOutput] =
      js.native
    def describeStacks(params: DescribeStacksInput): Request[DescribeStacksOutput] = js.native
    def describeType(params: DescribeTypeInput): Request[DescribeTypeOutput]       = js.native
    def describeTypeRegistration(params: DescribeTypeRegistrationInput): Request[DescribeTypeRegistrationOutput] =
      js.native
    def detectStackDrift(params: DetectStackDriftInput): Request[DetectStackDriftOutput] = js.native
    def detectStackResourceDrift(params: DetectStackResourceDriftInput): Request[DetectStackResourceDriftOutput] =
      js.native
    def detectStackSetDrift(params: DetectStackSetDriftInput): Request[DetectStackSetDriftOutput]    = js.native
    def estimateTemplateCost(params: EstimateTemplateCostInput): Request[EstimateTemplateCostOutput] = js.native
    def executeChangeSet(params: ExecuteChangeSetInput): Request[ExecuteChangeSetOutput]             = js.native
    def getStackPolicy(params: GetStackPolicyInput): Request[GetStackPolicyOutput]                   = js.native
    def getTemplate(params: GetTemplateInput): Request[GetTemplateOutput]                            = js.native
    def getTemplateSummary(params: GetTemplateSummaryInput): Request[GetTemplateSummaryOutput]       = js.native
    def listChangeSets(params: ListChangeSetsInput): Request[ListChangeSetsOutput]                   = js.native
    def listExports(params: ListExportsInput): Request[ListExportsOutput]                            = js.native
    def listImports(params: ListImportsInput): Request[ListImportsOutput]                            = js.native
    def listStackInstances(params: ListStackInstancesInput): Request[ListStackInstancesOutput]       = js.native
    def listStackResources(params: ListStackResourcesInput): Request[ListStackResourcesOutput]       = js.native
    def listStackSetOperationResults(
        params: ListStackSetOperationResultsInput
    ): Request[ListStackSetOperationResultsOutput]                                                         = js.native
    def listStackSetOperations(params: ListStackSetOperationsInput): Request[ListStackSetOperationsOutput] = js.native
    def listStackSets(params: ListStackSetsInput): Request[ListStackSetsOutput]                            = js.native
    def listStacks(params: ListStacksInput): Request[ListStacksOutput]                                     = js.native
    def listTypeRegistrations(params: ListTypeRegistrationsInput): Request[ListTypeRegistrationsOutput]    = js.native
    def listTypeVersions(params: ListTypeVersionsInput): Request[ListTypeVersionsOutput]                   = js.native
    def listTypes(params: ListTypesInput): Request[ListTypesOutput]                                        = js.native
    def recordHandlerProgress(params: RecordHandlerProgressInput): Request[RecordHandlerProgressOutput]    = js.native
    def registerType(params: RegisterTypeInput): Request[RegisterTypeOutput]                               = js.native
    def setStackPolicy(params: SetStackPolicyInput): Request[js.Object]                                    = js.native
    def setTypeDefaultVersion(params: SetTypeDefaultVersionInput): Request[SetTypeDefaultVersionOutput]    = js.native
    def signalResource(params: SignalResourceInput): Request[js.Object]                                    = js.native
    def stopStackSetOperation(params: StopStackSetOperationInput): Request[StopStackSetOperationOutput]    = js.native
    def updateStack(params: UpdateStackInput): Request[UpdateStackOutput]                                  = js.native
    def updateStackInstances(params: UpdateStackInstancesInput): Request[UpdateStackInstancesOutput]       = js.native
    def updateStackSet(params: UpdateStackSetInput): Request[UpdateStackSetOutput]                         = js.native
    def updateTerminationProtection(
        params: UpdateTerminationProtectionInput
    ): Request[UpdateTerminationProtectionOutput]                                        = js.native
    def validateTemplate(params: ValidateTemplateInput): Request[ValidateTemplateOutput] = js.native
  }

  /**
    * Structure that contains the results of the account gate function which AWS CloudFormation invokes, if present, before proceeding with a stack set operation in an account and region.
    *  For each account and region, AWS CloudFormation lets you specify a Lamdba function that encapsulates any requirements that must be met before CloudFormation can proceed with a stack set operation in that account and region. CloudFormation invokes the function each time a stack set operation is requested for that account and region; if the function returns <code>FAILED</code>, CloudFormation cancels the operation in that account and region, and sets the stack set operation result status for that account and region to <code>FAILED</code>.
    *  For more information, see [[https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-account-gating.html|Configuring a target account gate]].
    */
  @js.native
  @Factory
  trait AccountGateResult extends js.Object {
    var Status: js.UndefOr[AccountGateStatus]
    var StatusReason: js.UndefOr[AccountGateStatusReason]
  }

  @js.native
  sealed trait AccountGateStatus extends js.Any
  object AccountGateStatus extends js.Object {
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[AccountGateStatus]
    val FAILED    = "FAILED".asInstanceOf[AccountGateStatus]
    val SKIPPED   = "SKIPPED".asInstanceOf[AccountGateStatus]

    val values = js.Object.freeze(js.Array(SUCCEEDED, FAILED, SKIPPED))
  }

  /**
    * The AccountLimit data type.
    *  CloudFormation has the following limits per account:
    * * Number of concurrent resources
    *  * Number of stacks
    *  * Number of stack outputs
    * For more information about these account limits, and other CloudFormation limits, see [[https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cloudformation-limits.html|AWS CloudFormation Limits]] in the <i>AWS CloudFormation User Guide</i>.
    */
  @js.native
  @Factory
  trait AccountLimit extends js.Object {
    var Name: js.UndefOr[LimitName]
    var Value: js.UndefOr[LimitValue]
  }

  /**
    * [<code>Service-managed</code> permissions] Describes whether StackSets automatically deploys to AWS Organizations accounts that are added to a target organization or organizational unit (OU).
    */
  @js.native
  @Factory
  trait AutoDeployment extends js.Object {
    var Enabled: js.UndefOr[AutoDeploymentNullable]
    var RetainStacksOnAccountRemoval: js.UndefOr[RetainStacksOnAccountRemovalNullable]
  }

  /**
    * The input for the <a>CancelUpdateStack</a> action.
    */
  @js.native
  @Factory
  trait CancelUpdateStackInput extends js.Object {
    var StackName: StackName
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  @js.native
  sealed trait Capability extends js.Any
  object Capability extends js.Object {
    val CAPABILITY_IAM         = "CAPABILITY_IAM".asInstanceOf[Capability]
    val CAPABILITY_NAMED_IAM   = "CAPABILITY_NAMED_IAM".asInstanceOf[Capability]
    val CAPABILITY_AUTO_EXPAND = "CAPABILITY_AUTO_EXPAND".asInstanceOf[Capability]

    val values = js.Object.freeze(js.Array(CAPABILITY_IAM, CAPABILITY_NAMED_IAM, CAPABILITY_AUTO_EXPAND))
  }

  /**
    * The <code>Change</code> structure describes the changes AWS CloudFormation will perform if you execute the change set.
    */
  @js.native
  @Factory
  trait Change extends js.Object {
    var ResourceChange: js.UndefOr[ResourceChange]
    var Type: js.UndefOr[ChangeType]
  }

  @js.native
  sealed trait ChangeAction extends js.Any
  object ChangeAction extends js.Object {
    val Add    = "Add".asInstanceOf[ChangeAction]
    val Modify = "Modify".asInstanceOf[ChangeAction]
    val Remove = "Remove".asInstanceOf[ChangeAction]
    val Import = "Import".asInstanceOf[ChangeAction]

    val values = js.Object.freeze(js.Array(Add, Modify, Remove, Import))
  }

  @js.native
  sealed trait ChangeSetStatus extends js.Any
  object ChangeSetStatus extends js.Object {
    val CREATE_PENDING     = "CREATE_PENDING".asInstanceOf[ChangeSetStatus]
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[ChangeSetStatus]
    val CREATE_COMPLETE    = "CREATE_COMPLETE".asInstanceOf[ChangeSetStatus]
    val DELETE_COMPLETE    = "DELETE_COMPLETE".asInstanceOf[ChangeSetStatus]
    val FAILED             = "FAILED".asInstanceOf[ChangeSetStatus]

    val values =
      js.Object.freeze(js.Array(CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_COMPLETE, DELETE_COMPLETE, FAILED))
  }

  /**
    * The <code>ChangeSetSummary</code> structure describes a change set, its status, and the stack with which it's associated.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait ChangeSetType extends js.Any
  object ChangeSetType extends js.Object {
    val CREATE = "CREATE".asInstanceOf[ChangeSetType]
    val UPDATE = "UPDATE".asInstanceOf[ChangeSetType]
    val IMPORT = "IMPORT".asInstanceOf[ChangeSetType]

    val values = js.Object.freeze(js.Array(CREATE, UPDATE, IMPORT))
  }

  @js.native
  sealed trait ChangeSource extends js.Any
  object ChangeSource extends js.Object {
    val ResourceReference  = "ResourceReference".asInstanceOf[ChangeSource]
    val ParameterReference = "ParameterReference".asInstanceOf[ChangeSource]
    val ResourceAttribute  = "ResourceAttribute".asInstanceOf[ChangeSource]
    val DirectModification = "DirectModification".asInstanceOf[ChangeSource]
    val Automatic          = "Automatic".asInstanceOf[ChangeSource]

    val values = js.Object.freeze(
      js.Array(ResourceReference, ParameterReference, ResourceAttribute, DirectModification, Automatic)
    )
  }

  @js.native
  sealed trait ChangeType extends js.Any
  object ChangeType extends js.Object {
    val Resource = "Resource".asInstanceOf[ChangeType]

    val values = js.Object.freeze(js.Array(Resource))
  }

  /**
    * The input for the <a>ContinueUpdateRollback</a> action.
    */
  @js.native
  @Factory
  trait ContinueUpdateRollbackInput extends js.Object {
    var StackName: StackNameOrId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var ResourcesToSkip: js.UndefOr[ResourcesToSkip]
    var RoleARN: js.UndefOr[RoleARN]
  }

  /**
    * The output for a <a>ContinueUpdateRollback</a> action.
    */
  @js.native
  @Factory
  trait ContinueUpdateRollbackOutput extends js.Object {}

  /**
    * The input for the <a>CreateChangeSet</a> action.
    */
  @js.native
  @Factory
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
    var ResourcesToImport: js.UndefOr[ResourcesToImport]
    var RoleARN: js.UndefOr[RoleARN]
    var RollbackConfiguration: js.UndefOr[RollbackConfiguration]
    var Tags: js.UndefOr[Tags]
    var TemplateBody: js.UndefOr[TemplateBody]
    var TemplateURL: js.UndefOr[TemplateURL]
    var UsePreviousTemplate: js.UndefOr[UsePreviousTemplate]
  }

  /**
    * The output for the <a>CreateChangeSet</a> action.
    */
  @js.native
  @Factory
  trait CreateChangeSetOutput extends js.Object {
    var Id: js.UndefOr[ChangeSetId]
    var StackId: js.UndefOr[StackId]
  }

  /**
    * The input for <a>CreateStack</a> action.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateStackInstancesInput extends js.Object {
    var Regions: RegionList
    var StackSetName: StackSetName
    var Accounts: js.UndefOr[AccountList]
    var DeploymentTargets: js.UndefOr[DeploymentTargets]
    var OperationId: js.UndefOr[ClientRequestToken]
    var OperationPreferences: js.UndefOr[StackSetOperationPreferences]
    var ParameterOverrides: js.UndefOr[Parameters]
  }

  @js.native
  @Factory
  trait CreateStackInstancesOutput extends js.Object {
    var OperationId: js.UndefOr[ClientRequestToken]
  }

  /**
    * The output for a <a>CreateStack</a> action.
    */
  @js.native
  @Factory
  trait CreateStackOutput extends js.Object {
    var StackId: js.UndefOr[StackId]
  }

  @js.native
  @Factory
  trait CreateStackSetInput extends js.Object {
    var StackSetName: StackSetName
    var AdministrationRoleARN: js.UndefOr[RoleARN]
    var AutoDeployment: js.UndefOr[AutoDeployment]
    var Capabilities: js.UndefOr[Capabilities]
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Description: js.UndefOr[Description]
    var ExecutionRoleName: js.UndefOr[ExecutionRoleName]
    var Parameters: js.UndefOr[Parameters]
    var PermissionModel: js.UndefOr[PermissionModels]
    var Tags: js.UndefOr[Tags]
    var TemplateBody: js.UndefOr[TemplateBody]
    var TemplateURL: js.UndefOr[TemplateURL]
  }

  @js.native
  @Factory
  trait CreateStackSetOutput extends js.Object {
    var StackSetId: js.UndefOr[StackSetId]
  }

  /**
    * The input for the <a>DeleteChangeSet</a> action.
    */
  @js.native
  @Factory
  trait DeleteChangeSetInput extends js.Object {
    var ChangeSetName: ChangeSetNameOrId
    var StackName: js.UndefOr[StackNameOrId]
  }

  /**
    * The output for the <a>DeleteChangeSet</a> action.
    */
  @js.native
  @Factory
  trait DeleteChangeSetOutput extends js.Object {}

  /**
    * The input for <a>DeleteStack</a> action.
    */
  @js.native
  @Factory
  trait DeleteStackInput extends js.Object {
    var StackName: StackName
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var RetainResources: js.UndefOr[RetainResources]
    var RoleARN: js.UndefOr[RoleARN]
  }

  @js.native
  @Factory
  trait DeleteStackInstancesInput extends js.Object {
    var Regions: RegionList
    var RetainStacks: RetainStacks
    var StackSetName: StackSetName
    var Accounts: js.UndefOr[AccountList]
    var DeploymentTargets: js.UndefOr[DeploymentTargets]
    var OperationId: js.UndefOr[ClientRequestToken]
    var OperationPreferences: js.UndefOr[StackSetOperationPreferences]
  }

  @js.native
  @Factory
  trait DeleteStackInstancesOutput extends js.Object {
    var OperationId: js.UndefOr[ClientRequestToken]
  }

  @js.native
  @Factory
  trait DeleteStackSetInput extends js.Object {
    var StackSetName: StackSetName
  }

  @js.native
  @Factory
  trait DeleteStackSetOutput extends js.Object {}

  /**
    * [<code>Service-managed</code> permissions] The AWS Organizations accounts to which StackSets deploys.
    *  For update operations, you can specify either <code>Accounts</code> or <code>OrganizationalUnitIds</code>. For create and delete operations, specify <code>OrganizationalUnitIds</code>.
    */
  @js.native
  @Factory
  trait DeploymentTargets extends js.Object {
    var Accounts: js.UndefOr[AccountList]
    var OrganizationalUnitIds: js.UndefOr[OrganizationalUnitIdList]
  }

  @js.native
  sealed trait DeprecatedStatus extends js.Any
  object DeprecatedStatus extends js.Object {
    val LIVE       = "LIVE".asInstanceOf[DeprecatedStatus]
    val DEPRECATED = "DEPRECATED".asInstanceOf[DeprecatedStatus]

    val values = js.Object.freeze(js.Array(LIVE, DEPRECATED))
  }

  @js.native
  @Factory
  trait DeregisterTypeInput extends js.Object {
    var Arn: js.UndefOr[PrivateTypeArn]
    var Type: js.UndefOr[RegistryType]
    var TypeName: js.UndefOr[TypeName]
    var VersionId: js.UndefOr[TypeVersionId]
  }

  @js.native
  @Factory
  trait DeregisterTypeOutput extends js.Object {}

  /**
    * The input for the <a>DescribeAccountLimits</a> action.
    */
  @js.native
  @Factory
  trait DescribeAccountLimitsInput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * The output for the <a>DescribeAccountLimits</a> action.
    */
  @js.native
  @Factory
  trait DescribeAccountLimitsOutput extends js.Object {
    var AccountLimits: js.UndefOr[AccountLimitList]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * The input for the <a>DescribeChangeSet</a> action.
    */
  @js.native
  @Factory
  trait DescribeChangeSetInput extends js.Object {
    var ChangeSetName: ChangeSetNameOrId
    var NextToken: js.UndefOr[NextToken]
    var StackName: js.UndefOr[StackNameOrId]
  }

  /**
    * The output for the <a>DescribeChangeSet</a> action.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeStackDriftDetectionStatusInput extends js.Object {
    var StackDriftDetectionId: StackDriftDetectionId
  }

  @js.native
  @Factory
  trait DescribeStackDriftDetectionStatusOutput extends js.Object {
    var DetectionStatus: StackDriftDetectionStatus
    var StackDriftDetectionId: StackDriftDetectionId
    var StackId: StackId
    var Timestamp: Timestamp
    var DetectionStatusReason: js.UndefOr[StackDriftDetectionStatusReason]
    var DriftedStackResourceCount: js.UndefOr[BoxedInteger]
    var StackDriftStatus: js.UndefOr[StackDriftStatus]
  }

  /**
    * The input for <a>DescribeStackEvents</a> action.
    */
  @js.native
  @Factory
  trait DescribeStackEventsInput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StackName: js.UndefOr[StackName]
  }

  /**
    * The output for a <a>DescribeStackEvents</a> action.
    */
  @js.native
  @Factory
  trait DescribeStackEventsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StackEvents: js.UndefOr[StackEvents]
  }

  @js.native
  @Factory
  trait DescribeStackInstanceInput extends js.Object {
    var StackInstanceAccount: Account
    var StackInstanceRegion: Region
    var StackSetName: StackSetName
  }

  @js.native
  @Factory
  trait DescribeStackInstanceOutput extends js.Object {
    var StackInstance: js.UndefOr[StackInstance]
  }

  @js.native
  @Factory
  trait DescribeStackResourceDriftsInput extends js.Object {
    var StackName: StackNameOrId
    var MaxResults: js.UndefOr[BoxedMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var StackResourceDriftStatusFilters: js.UndefOr[StackResourceDriftStatusFilters]
  }

  @js.native
  @Factory
  trait DescribeStackResourceDriftsOutput extends js.Object {
    var StackResourceDrifts: StackResourceDrifts
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * The input for <a>DescribeStackResource</a> action.
    */
  @js.native
  @Factory
  trait DescribeStackResourceInput extends js.Object {
    var LogicalResourceId: LogicalResourceId
    var StackName: StackName
  }

  /**
    * The output for a <a>DescribeStackResource</a> action.
    */
  @js.native
  @Factory
  trait DescribeStackResourceOutput extends js.Object {
    var StackResourceDetail: js.UndefOr[StackResourceDetail]
  }

  /**
    * The input for <a>DescribeStackResources</a> action.
    */
  @js.native
  @Factory
  trait DescribeStackResourcesInput extends js.Object {
    var LogicalResourceId: js.UndefOr[LogicalResourceId]
    var PhysicalResourceId: js.UndefOr[PhysicalResourceId]
    var StackName: js.UndefOr[StackName]
  }

  /**
    * The output for a <a>DescribeStackResources</a> action.
    */
  @js.native
  @Factory
  trait DescribeStackResourcesOutput extends js.Object {
    var StackResources: js.UndefOr[StackResources]
  }

  @js.native
  @Factory
  trait DescribeStackSetInput extends js.Object {
    var StackSetName: StackSetName
  }

  @js.native
  @Factory
  trait DescribeStackSetOperationInput extends js.Object {
    var OperationId: ClientRequestToken
    var StackSetName: StackSetName
  }

  @js.native
  @Factory
  trait DescribeStackSetOperationOutput extends js.Object {
    var StackSetOperation: js.UndefOr[StackSetOperation]
  }

  @js.native
  @Factory
  trait DescribeStackSetOutput extends js.Object {
    var StackSet: js.UndefOr[StackSet]
  }

  /**
    * The input for <a>DescribeStacks</a> action.
    */
  @js.native
  @Factory
  trait DescribeStacksInput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StackName: js.UndefOr[StackName]
  }

  /**
    * The output for a <a>DescribeStacks</a> action.
    */
  @js.native
  @Factory
  trait DescribeStacksOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Stacks: js.UndefOr[Stacks]
  }

  @js.native
  @Factory
  trait DescribeTypeInput extends js.Object {
    var Arn: js.UndefOr[TypeArn]
    var Type: js.UndefOr[RegistryType]
    var TypeName: js.UndefOr[TypeName]
    var VersionId: js.UndefOr[TypeVersionId]
  }

  @js.native
  @Factory
  trait DescribeTypeOutput extends js.Object {
    var Arn: js.UndefOr[TypeArn]
    var DefaultVersionId: js.UndefOr[TypeVersionId]
    var DeprecatedStatus: js.UndefOr[DeprecatedStatus]
    var Description: js.UndefOr[Description]
    var DocumentationUrl: js.UndefOr[OptionalSecureUrl]
    var ExecutionRoleArn: js.UndefOr[RoleArn]
    var LastUpdated: js.UndefOr[Timestamp]
    var LoggingConfig: js.UndefOr[LoggingConfig]
    var ProvisioningType: js.UndefOr[ProvisioningType]
    var Schema: js.UndefOr[TypeSchema]
    var SourceUrl: js.UndefOr[OptionalSecureUrl]
    var TimeCreated: js.UndefOr[Timestamp]
    var Type: js.UndefOr[RegistryType]
    var TypeName: js.UndefOr[TypeName]
    var Visibility: js.UndefOr[Visibility]
  }

  @js.native
  @Factory
  trait DescribeTypeRegistrationInput extends js.Object {
    var RegistrationToken: RegistrationToken
  }

  @js.native
  @Factory
  trait DescribeTypeRegistrationOutput extends js.Object {
    var Description: js.UndefOr[Description]
    var ProgressStatus: js.UndefOr[RegistrationStatus]
    var TypeArn: js.UndefOr[TypeArn]
    var TypeVersionArn: js.UndefOr[TypeArn]
  }

  @js.native
  @Factory
  trait DetectStackDriftInput extends js.Object {
    var StackName: StackNameOrId
    var LogicalResourceIds: js.UndefOr[LogicalResourceIds]
  }

  @js.native
  @Factory
  trait DetectStackDriftOutput extends js.Object {
    var StackDriftDetectionId: StackDriftDetectionId
  }

  @js.native
  @Factory
  trait DetectStackResourceDriftInput extends js.Object {
    var LogicalResourceId: LogicalResourceId
    var StackName: StackNameOrId
  }

  @js.native
  @Factory
  trait DetectStackResourceDriftOutput extends js.Object {
    var StackResourceDrift: StackResourceDrift
  }

  @js.native
  @Factory
  trait DetectStackSetDriftInput extends js.Object {
    var StackSetName: StackSetNameOrId
    var OperationId: js.UndefOr[ClientRequestToken]
    var OperationPreferences: js.UndefOr[StackSetOperationPreferences]
  }

  @js.native
  @Factory
  trait DetectStackSetDriftOutput extends js.Object {
    var OperationId: js.UndefOr[ClientRequestToken]
  }

  @js.native
  sealed trait DifferenceType extends js.Any
  object DifferenceType extends js.Object {
    val ADD       = "ADD".asInstanceOf[DifferenceType]
    val REMOVE    = "REMOVE".asInstanceOf[DifferenceType]
    val NOT_EQUAL = "NOT_EQUAL".asInstanceOf[DifferenceType]

    val values = js.Object.freeze(js.Array(ADD, REMOVE, NOT_EQUAL))
  }

  /**
    * The input for an <a>EstimateTemplateCost</a> action.
    */
  @js.native
  @Factory
  trait EstimateTemplateCostInput extends js.Object {
    var Parameters: js.UndefOr[Parameters]
    var TemplateBody: js.UndefOr[TemplateBody]
    var TemplateURL: js.UndefOr[TemplateURL]
  }

  /**
    * The output for a <a>EstimateTemplateCost</a> action.
    */
  @js.native
  @Factory
  trait EstimateTemplateCostOutput extends js.Object {
    var Url: js.UndefOr[Url]
  }

  @js.native
  sealed trait EvaluationType extends js.Any
  object EvaluationType extends js.Object {
    val Static  = "Static".asInstanceOf[EvaluationType]
    val Dynamic = "Dynamic".asInstanceOf[EvaluationType]

    val values = js.Object.freeze(js.Array(Static, Dynamic))
  }

  /**
    * The input for the <a>ExecuteChangeSet</a> action.
    */
  @js.native
  @Factory
  trait ExecuteChangeSetInput extends js.Object {
    var ChangeSetName: ChangeSetNameOrId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var StackName: js.UndefOr[StackNameOrId]
  }

  /**
    * The output for the <a>ExecuteChangeSet</a> action.
    */
  @js.native
  @Factory
  trait ExecuteChangeSetOutput extends js.Object {}

  @js.native
  sealed trait ExecutionStatus extends js.Any
  object ExecutionStatus extends js.Object {
    val UNAVAILABLE         = "UNAVAILABLE".asInstanceOf[ExecutionStatus]
    val AVAILABLE           = "AVAILABLE".asInstanceOf[ExecutionStatus]
    val EXECUTE_IN_PROGRESS = "EXECUTE_IN_PROGRESS".asInstanceOf[ExecutionStatus]
    val EXECUTE_COMPLETE    = "EXECUTE_COMPLETE".asInstanceOf[ExecutionStatus]
    val EXECUTE_FAILED      = "EXECUTE_FAILED".asInstanceOf[ExecutionStatus]
    val OBSOLETE            = "OBSOLETE".asInstanceOf[ExecutionStatus]

    val values = js.Object.freeze(
      js.Array(UNAVAILABLE, AVAILABLE, EXECUTE_IN_PROGRESS, EXECUTE_COMPLETE, EXECUTE_FAILED, OBSOLETE)
    )
  }

  /**
    * The <code>Export</code> structure describes the exported output values for a stack.
    */
  @js.native
  @Factory
  trait Export extends js.Object {
    var ExportingStackId: js.UndefOr[StackId]
    var Name: js.UndefOr[ExportName]
    var Value: js.UndefOr[ExportValue]
  }

  /**
    * The input for the <a>GetStackPolicy</a> action.
    */
  @js.native
  @Factory
  trait GetStackPolicyInput extends js.Object {
    var StackName: StackName
  }

  /**
    * The output for the <a>GetStackPolicy</a> action.
    */
  @js.native
  @Factory
  trait GetStackPolicyOutput extends js.Object {
    var StackPolicyBody: js.UndefOr[StackPolicyBody]
  }

  /**
    * The input for a <a>GetTemplate</a> action.
    */
  @js.native
  @Factory
  trait GetTemplateInput extends js.Object {
    var ChangeSetName: js.UndefOr[ChangeSetNameOrId]
    var StackName: js.UndefOr[StackName]
    var TemplateStage: js.UndefOr[TemplateStage]
  }

  /**
    * The output for <a>GetTemplate</a> action.
    */
  @js.native
  @Factory
  trait GetTemplateOutput extends js.Object {
    var StagesAvailable: js.UndefOr[StageList]
    var TemplateBody: js.UndefOr[TemplateBody]
  }

  /**
    * The input for the <a>GetTemplateSummary</a> action.
    */
  @js.native
  @Factory
  trait GetTemplateSummaryInput extends js.Object {
    var StackName: js.UndefOr[StackNameOrId]
    var StackSetName: js.UndefOr[StackSetNameOrId]
    var TemplateBody: js.UndefOr[TemplateBody]
    var TemplateURL: js.UndefOr[TemplateURL]
  }

  /**
    * The output for the <a>GetTemplateSummary</a> action.
    */
  @js.native
  @Factory
  trait GetTemplateSummaryOutput extends js.Object {
    var Capabilities: js.UndefOr[Capabilities]
    var CapabilitiesReason: js.UndefOr[CapabilitiesReason]
    var DeclaredTransforms: js.UndefOr[TransformsList]
    var Description: js.UndefOr[Description]
    var Metadata: js.UndefOr[Metadata]
    var Parameters: js.UndefOr[ParameterDeclarations]
    var ResourceIdentifierSummaries: js.UndefOr[ResourceIdentifierSummaries]
    var ResourceTypes: js.UndefOr[ResourceTypes]
    var Version: js.UndefOr[Version]
  }

  @js.native
  sealed trait HandlerErrorCode extends js.Any
  object HandlerErrorCode extends js.Object {
    val NotUpdatable            = "NotUpdatable".asInstanceOf[HandlerErrorCode]
    val InvalidRequest          = "InvalidRequest".asInstanceOf[HandlerErrorCode]
    val AccessDenied            = "AccessDenied".asInstanceOf[HandlerErrorCode]
    val InvalidCredentials      = "InvalidCredentials".asInstanceOf[HandlerErrorCode]
    val AlreadyExists           = "AlreadyExists".asInstanceOf[HandlerErrorCode]
    val NotFound                = "NotFound".asInstanceOf[HandlerErrorCode]
    val ResourceConflict        = "ResourceConflict".asInstanceOf[HandlerErrorCode]
    val Throttling              = "Throttling".asInstanceOf[HandlerErrorCode]
    val ServiceLimitExceeded    = "ServiceLimitExceeded".asInstanceOf[HandlerErrorCode]
    val NotStabilized           = "NotStabilized".asInstanceOf[HandlerErrorCode]
    val GeneralServiceException = "GeneralServiceException".asInstanceOf[HandlerErrorCode]
    val ServiceInternalError    = "ServiceInternalError".asInstanceOf[HandlerErrorCode]
    val NetworkFailure          = "NetworkFailure".asInstanceOf[HandlerErrorCode]
    val InternalFailure         = "InternalFailure".asInstanceOf[HandlerErrorCode]

    val values = js.Object.freeze(
      js.Array(
        NotUpdatable,
        InvalidRequest,
        AccessDenied,
        InvalidCredentials,
        AlreadyExists,
        NotFound,
        ResourceConflict,
        Throttling,
        ServiceLimitExceeded,
        NotStabilized,
        GeneralServiceException,
        ServiceInternalError,
        NetworkFailure,
        InternalFailure
      )
    )
  }

  /**
    * The input for the <a>ListChangeSets</a> action.
    */
  @js.native
  @Factory
  trait ListChangeSetsInput extends js.Object {
    var StackName: StackNameOrId
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * The output for the <a>ListChangeSets</a> action.
    */
  @js.native
  @Factory
  trait ListChangeSetsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Summaries: js.UndefOr[ChangeSetSummaries]
  }

  @js.native
  @Factory
  trait ListExportsInput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListExportsOutput extends js.Object {
    var Exports: js.UndefOr[Exports]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListImportsInput extends js.Object {
    var ExportName: ExportName
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListImportsOutput extends js.Object {
    var Imports: js.UndefOr[Imports]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListStackInstancesInput extends js.Object {
    var StackSetName: StackSetName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var StackInstanceAccount: js.UndefOr[Account]
    var StackInstanceRegion: js.UndefOr[Region]
  }

  @js.native
  @Factory
  trait ListStackInstancesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Summaries: js.UndefOr[StackInstanceSummaries]
  }

  /**
    * The input for the <a>ListStackResource</a> action.
    */
  @js.native
  @Factory
  trait ListStackResourcesInput extends js.Object {
    var StackName: StackName
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * The output for a <a>ListStackResources</a> action.
    */
  @js.native
  @Factory
  trait ListStackResourcesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StackResourceSummaries: js.UndefOr[StackResourceSummaries]
  }

  @js.native
  @Factory
  trait ListStackSetOperationResultsInput extends js.Object {
    var OperationId: ClientRequestToken
    var StackSetName: StackSetName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListStackSetOperationResultsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Summaries: js.UndefOr[StackSetOperationResultSummaries]
  }

  @js.native
  @Factory
  trait ListStackSetOperationsInput extends js.Object {
    var StackSetName: StackSetName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListStackSetOperationsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Summaries: js.UndefOr[StackSetOperationSummaries]
  }

  @js.native
  @Factory
  trait ListStackSetsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[StackSetStatus]
  }

  @js.native
  @Factory
  trait ListStackSetsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Summaries: js.UndefOr[StackSetSummaries]
  }

  /**
    * The input for <a>ListStacks</a> action.
    */
  @js.native
  @Factory
  trait ListStacksInput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StackStatusFilter: js.UndefOr[StackStatusFilter]
  }

  /**
    * The output for <a>ListStacks</a> action.
    */
  @js.native
  @Factory
  trait ListStacksOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StackSummaries: js.UndefOr[StackSummaries]
  }

  @js.native
  @Factory
  trait ListTypeRegistrationsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var RegistrationStatusFilter: js.UndefOr[RegistrationStatus]
    var Type: js.UndefOr[RegistryType]
    var TypeArn: js.UndefOr[TypeArn]
    var TypeName: js.UndefOr[TypeName]
  }

  @js.native
  @Factory
  trait ListTypeRegistrationsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RegistrationTokenList: js.UndefOr[RegistrationTokenList]
  }

  @js.native
  @Factory
  trait ListTypeVersionsInput extends js.Object {
    var Arn: js.UndefOr[PrivateTypeArn]
    var DeprecatedStatus: js.UndefOr[DeprecatedStatus]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Type: js.UndefOr[RegistryType]
    var TypeName: js.UndefOr[TypeName]
  }

  @js.native
  @Factory
  trait ListTypeVersionsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TypeVersionSummaries: js.UndefOr[TypeVersionSummaries]
  }

  @js.native
  @Factory
  trait ListTypesInput extends js.Object {
    var DeprecatedStatus: js.UndefOr[DeprecatedStatus]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ProvisioningType: js.UndefOr[ProvisioningType]
    var Visibility: js.UndefOr[Visibility]
  }

  @js.native
  @Factory
  trait ListTypesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TypeSummaries: js.UndefOr[TypeSummaries]
  }

  /**
    * Contains logging configuration information for a type.
    */
  @js.native
  @Factory
  trait LoggingConfig extends js.Object {
    var LogGroupName: LogGroupName
    var LogRoleArn: RoleArn
  }

  @js.native
  sealed trait OnFailure extends js.Any
  object OnFailure extends js.Object {
    val DO_NOTHING = "DO_NOTHING".asInstanceOf[OnFailure]
    val ROLLBACK   = "ROLLBACK".asInstanceOf[OnFailure]
    val DELETE     = "DELETE".asInstanceOf[OnFailure]

    val values = js.Object.freeze(js.Array(DO_NOTHING, ROLLBACK, DELETE))
  }

  @js.native
  sealed trait OperationStatus extends js.Any
  object OperationStatus extends js.Object {
    val PENDING     = "PENDING".asInstanceOf[OperationStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[OperationStatus]
    val SUCCESS     = "SUCCESS".asInstanceOf[OperationStatus]
    val FAILED      = "FAILED".asInstanceOf[OperationStatus]

    val values = js.Object.freeze(js.Array(PENDING, IN_PROGRESS, SUCCESS, FAILED))
  }

  /**
    * The Output data type.
    */
  @js.native
  @Factory
  trait Output extends js.Object {
    var Description: js.UndefOr[Description]
    var ExportName: js.UndefOr[ExportName]
    var OutputKey: js.UndefOr[OutputKey]
    var OutputValue: js.UndefOr[OutputValue]
  }

  /**
    * The Parameter data type.
    */
  @js.native
  @Factory
  trait Parameter extends js.Object {
    var ParameterKey: js.UndefOr[ParameterKey]
    var ParameterValue: js.UndefOr[ParameterValue]
    var ResolvedValue: js.UndefOr[ParameterValue]
    var UsePreviousValue: js.UndefOr[UsePreviousValue]
  }

  /**
    * A set of criteria that AWS CloudFormation uses to validate parameter values. Although other constraints might be defined in the stack template, AWS CloudFormation returns only the <code>AllowedValues</code> property.
    */
  @js.native
  @Factory
  trait ParameterConstraints extends js.Object {
    var AllowedValues: js.UndefOr[AllowedValues]
  }

  /**
    * The ParameterDeclaration data type.
    */
  @js.native
  @Factory
  trait ParameterDeclaration extends js.Object {
    var DefaultValue: js.UndefOr[ParameterValue]
    var Description: js.UndefOr[Description]
    var NoEcho: js.UndefOr[NoEcho]
    var ParameterConstraints: js.UndefOr[ParameterConstraints]
    var ParameterKey: js.UndefOr[ParameterKey]
    var ParameterType: js.UndefOr[ParameterType]
  }

  @js.native
  sealed trait PermissionModels extends js.Any
  object PermissionModels extends js.Object {
    val SERVICE_MANAGED = "SERVICE_MANAGED".asInstanceOf[PermissionModels]
    val SELF_MANAGED    = "SELF_MANAGED".asInstanceOf[PermissionModels]

    val values = js.Object.freeze(js.Array(SERVICE_MANAGED, SELF_MANAGED))
  }

  /**
    * Context information that enables AWS CloudFormation to uniquely identify a resource. AWS CloudFormation uses context key-value pairs in cases where a resource's logical and physical IDs are not enough to uniquely identify that resource. Each context key-value pair specifies a resource that contains the targeted resource.
    */
  @js.native
  @Factory
  trait PhysicalResourceIdContextKeyValuePair extends js.Object {
    var Key: Key
    var Value: Value
  }

  /**
    * Information about a resource property whose actual value differs from its expected value, as defined in the stack template and any values specified as template parameters. These will be present only for resources whose <code>StackResourceDriftStatus</code> is <code>MODIFIED</code>. For more information, see [[https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html|Detecting Unregulated Configuration Changes to Stacks and Resources]].
    */
  @js.native
  @Factory
  trait PropertyDifference extends js.Object {
    var ActualValue: PropertyValue
    var DifferenceType: DifferenceType
    var ExpectedValue: PropertyValue
    var PropertyPath: PropertyPath
  }

  @js.native
  sealed trait ProvisioningType extends js.Any
  object ProvisioningType extends js.Object {
    val NON_PROVISIONABLE = "NON_PROVISIONABLE".asInstanceOf[ProvisioningType]
    val IMMUTABLE         = "IMMUTABLE".asInstanceOf[ProvisioningType]
    val FULLY_MUTABLE     = "FULLY_MUTABLE".asInstanceOf[ProvisioningType]

    val values = js.Object.freeze(js.Array(NON_PROVISIONABLE, IMMUTABLE, FULLY_MUTABLE))
  }

  @js.native
  @Factory
  trait RecordHandlerProgressInput extends js.Object {
    var BearerToken: ClientToken
    var OperationStatus: OperationStatus
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var CurrentOperationStatus: js.UndefOr[OperationStatus]
    var ErrorCode: js.UndefOr[HandlerErrorCode]
    var ResourceModel: js.UndefOr[ResourceModel]
    var StatusMessage: js.UndefOr[StatusMessage]
  }

  @js.native
  @Factory
  trait RecordHandlerProgressOutput extends js.Object {}

  @js.native
  @Factory
  trait RegisterTypeInput extends js.Object {
    var SchemaHandlerPackage: S3Url
    var TypeName: TypeName
    var ClientRequestToken: js.UndefOr[RequestToken]
    var ExecutionRoleArn: js.UndefOr[RoleArn]
    var LoggingConfig: js.UndefOr[LoggingConfig]
    var Type: js.UndefOr[RegistryType]
  }

  @js.native
  @Factory
  trait RegisterTypeOutput extends js.Object {
    var RegistrationToken: js.UndefOr[RegistrationToken]
  }

  @js.native
  sealed trait RegistrationStatus extends js.Any
  object RegistrationStatus extends js.Object {
    val COMPLETE    = "COMPLETE".asInstanceOf[RegistrationStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[RegistrationStatus]
    val FAILED      = "FAILED".asInstanceOf[RegistrationStatus]

    val values = js.Object.freeze(js.Array(COMPLETE, IN_PROGRESS, FAILED))
  }

  @js.native
  sealed trait RegistryType extends js.Any
  object RegistryType extends js.Object {
    val RESOURCE = "RESOURCE".asInstanceOf[RegistryType]

    val values = js.Object.freeze(js.Array(RESOURCE))
  }

  @js.native
  sealed trait Replacement extends js.Any
  object Replacement extends js.Object {
    val True        = "True".asInstanceOf[Replacement]
    val False       = "False".asInstanceOf[Replacement]
    val Conditional = "Conditional".asInstanceOf[Replacement]

    val values = js.Object.freeze(js.Array(True, False, Conditional))
  }

  @js.native
  sealed trait RequiresRecreation extends js.Any
  object RequiresRecreation extends js.Object {
    val Never         = "Never".asInstanceOf[RequiresRecreation]
    val Conditionally = "Conditionally".asInstanceOf[RequiresRecreation]
    val Always        = "Always".asInstanceOf[RequiresRecreation]

    val values = js.Object.freeze(js.Array(Never, Conditionally, Always))
  }

  @js.native
  sealed trait ResourceAttribute extends js.Any
  object ResourceAttribute extends js.Object {
    val Properties     = "Properties".asInstanceOf[ResourceAttribute]
    val Metadata       = "Metadata".asInstanceOf[ResourceAttribute]
    val CreationPolicy = "CreationPolicy".asInstanceOf[ResourceAttribute]
    val UpdatePolicy   = "UpdatePolicy".asInstanceOf[ResourceAttribute]
    val DeletionPolicy = "DeletionPolicy".asInstanceOf[ResourceAttribute]
    val Tags           = "Tags".asInstanceOf[ResourceAttribute]

    val values = js.Object.freeze(js.Array(Properties, Metadata, CreationPolicy, UpdatePolicy, DeletionPolicy, Tags))
  }

  /**
    * The <code>ResourceChange</code> structure describes the resource and the action that AWS CloudFormation will perform on it if you execute this change set.
    */
  @js.native
  @Factory
  trait ResourceChange extends js.Object {
    var Action: js.UndefOr[ChangeAction]
    var Details: js.UndefOr[ResourceChangeDetails]
    var LogicalResourceId: js.UndefOr[LogicalResourceId]
    var PhysicalResourceId: js.UndefOr[PhysicalResourceId]
    var Replacement: js.UndefOr[Replacement]
    var ResourceType: js.UndefOr[ResourceType]
    var Scope: js.UndefOr[Scope]
  }

  /**
    * For a resource with <code>Modify</code> as the action, the <code>ResourceChange</code> structure describes the changes AWS CloudFormation will make to that resource.
    */
  @js.native
  @Factory
  trait ResourceChangeDetail extends js.Object {
    var CausingEntity: js.UndefOr[CausingEntity]
    var ChangeSource: js.UndefOr[ChangeSource]
    var Evaluation: js.UndefOr[EvaluationType]
    var Target: js.UndefOr[ResourceTargetDefinition]
  }

  /**
    * Describes the target resources of a specific type in your import template (for example, all <code>AWS::S3::Bucket</code> resources) and the properties you can provide during the import to identify resources of that type.
    */
  @js.native
  @Factory
  trait ResourceIdentifierSummary extends js.Object {
    var LogicalResourceIds: js.UndefOr[LogicalResourceIds]
    var ResourceIdentifiers: js.UndefOr[ResourceIdentifiers]
    var ResourceType: js.UndefOr[ResourceType]
  }

  @js.native
  sealed trait ResourceSignalStatus extends js.Any
  object ResourceSignalStatus extends js.Object {
    val SUCCESS = "SUCCESS".asInstanceOf[ResourceSignalStatus]
    val FAILURE = "FAILURE".asInstanceOf[ResourceSignalStatus]

    val values = js.Object.freeze(js.Array(SUCCESS, FAILURE))
  }

  @js.native
  sealed trait ResourceStatus extends js.Any
  object ResourceStatus extends js.Object {
    val CREATE_IN_PROGRESS          = "CREATE_IN_PROGRESS".asInstanceOf[ResourceStatus]
    val CREATE_FAILED               = "CREATE_FAILED".asInstanceOf[ResourceStatus]
    val CREATE_COMPLETE             = "CREATE_COMPLETE".asInstanceOf[ResourceStatus]
    val DELETE_IN_PROGRESS          = "DELETE_IN_PROGRESS".asInstanceOf[ResourceStatus]
    val DELETE_FAILED               = "DELETE_FAILED".asInstanceOf[ResourceStatus]
    val DELETE_COMPLETE             = "DELETE_COMPLETE".asInstanceOf[ResourceStatus]
    val DELETE_SKIPPED              = "DELETE_SKIPPED".asInstanceOf[ResourceStatus]
    val UPDATE_IN_PROGRESS          = "UPDATE_IN_PROGRESS".asInstanceOf[ResourceStatus]
    val UPDATE_FAILED               = "UPDATE_FAILED".asInstanceOf[ResourceStatus]
    val UPDATE_COMPLETE             = "UPDATE_COMPLETE".asInstanceOf[ResourceStatus]
    val IMPORT_FAILED               = "IMPORT_FAILED".asInstanceOf[ResourceStatus]
    val IMPORT_COMPLETE             = "IMPORT_COMPLETE".asInstanceOf[ResourceStatus]
    val IMPORT_IN_PROGRESS          = "IMPORT_IN_PROGRESS".asInstanceOf[ResourceStatus]
    val IMPORT_ROLLBACK_IN_PROGRESS = "IMPORT_ROLLBACK_IN_PROGRESS".asInstanceOf[ResourceStatus]
    val IMPORT_ROLLBACK_FAILED      = "IMPORT_ROLLBACK_FAILED".asInstanceOf[ResourceStatus]
    val IMPORT_ROLLBACK_COMPLETE    = "IMPORT_ROLLBACK_COMPLETE".asInstanceOf[ResourceStatus]

    val values = js.Object.freeze(
      js.Array(
        CREATE_IN_PROGRESS,
        CREATE_FAILED,
        CREATE_COMPLETE,
        DELETE_IN_PROGRESS,
        DELETE_FAILED,
        DELETE_COMPLETE,
        DELETE_SKIPPED,
        UPDATE_IN_PROGRESS,
        UPDATE_FAILED,
        UPDATE_COMPLETE,
        IMPORT_FAILED,
        IMPORT_COMPLETE,
        IMPORT_IN_PROGRESS,
        IMPORT_ROLLBACK_IN_PROGRESS,
        IMPORT_ROLLBACK_FAILED,
        IMPORT_ROLLBACK_COMPLETE
      )
    )
  }

  /**
    * The field that AWS CloudFormation will change, such as the name of a resource's property, and whether the resource will be recreated.
    */
  @js.native
  @Factory
  trait ResourceTargetDefinition extends js.Object {
    var Attribute: js.UndefOr[ResourceAttribute]
    var Name: js.UndefOr[PropertyName]
    var RequiresRecreation: js.UndefOr[RequiresRecreation]
  }

  /**
    * Describes the target resource of an import operation.
    */
  @js.native
  @Factory
  trait ResourceToImport extends js.Object {
    var LogicalResourceId: LogicalResourceId
    var ResourceIdentifier: ResourceIdentifierProperties
    var ResourceType: ResourceType
  }

  /**
    * Structure containing the rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for the specified monitoring period afterwards.
    *  Rollback triggers enable you to have AWS CloudFormation monitor the state of your application during stack creation and updating, and to roll back that operation if the application breaches the threshold of any of the alarms you've specified. For more information, see [[http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-rollback-triggers.html|Monitor and Roll Back Stack Operations]].
    */
  @js.native
  @Factory
  trait RollbackConfiguration extends js.Object {
    var MonitoringTimeInMinutes: js.UndefOr[MonitoringTimeInMinutes]
    var RollbackTriggers: js.UndefOr[RollbackTriggers]
  }

  /**
    * A rollback trigger AWS CloudFormation monitors during creation and updating of stacks. If any of the alarms you specify goes to ALARM state during the stack operation or within the specified monitoring period afterwards, CloudFormation rolls back the entire stack operation.
    */
  @js.native
  @Factory
  trait RollbackTrigger extends js.Object {
    var Arn: Arn
    var Type: Type
  }

  /**
    * The input for the <a>SetStackPolicy</a> action.
    */
  @js.native
  @Factory
  trait SetStackPolicyInput extends js.Object {
    var StackName: StackName
    var StackPolicyBody: js.UndefOr[StackPolicyBody]
    var StackPolicyURL: js.UndefOr[StackPolicyURL]
  }

  @js.native
  @Factory
  trait SetTypeDefaultVersionInput extends js.Object {
    var Arn: js.UndefOr[PrivateTypeArn]
    var Type: js.UndefOr[RegistryType]
    var TypeName: js.UndefOr[TypeName]
    var VersionId: js.UndefOr[TypeVersionId]
  }

  @js.native
  @Factory
  trait SetTypeDefaultVersionOutput extends js.Object {}

  /**
    * The input for the <a>SignalResource</a> action.
    */
  @js.native
  @Factory
  trait SignalResourceInput extends js.Object {
    var LogicalResourceId: LogicalResourceId
    var StackName: StackNameOrId
    var Status: ResourceSignalStatus
    var UniqueId: ResourceSignalUniqueId
  }

  /**
    * The Stack data type.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait StackDriftDetectionStatus extends js.Any
  object StackDriftDetectionStatus extends js.Object {
    val DETECTION_IN_PROGRESS = "DETECTION_IN_PROGRESS".asInstanceOf[StackDriftDetectionStatus]
    val DETECTION_FAILED      = "DETECTION_FAILED".asInstanceOf[StackDriftDetectionStatus]
    val DETECTION_COMPLETE    = "DETECTION_COMPLETE".asInstanceOf[StackDriftDetectionStatus]

    val values = js.Object.freeze(js.Array(DETECTION_IN_PROGRESS, DETECTION_FAILED, DETECTION_COMPLETE))
  }

  /**
    * Contains information about whether the stack's actual configuration differs, or has <i>drifted</i>, from its expected configuration, as defined in the stack template and any values specified as template parameters. A stack is considered to have drifted if one or more of its resources have drifted.
    */
  @js.native
  @Factory
  trait StackDriftInformation extends js.Object {
    var StackDriftStatus: StackDriftStatus
    var LastCheckTimestamp: js.UndefOr[Timestamp]
  }

  /**
    * Contains information about whether the stack's actual configuration differs, or has <i>drifted</i>, from its expected configuration, as defined in the stack template and any values specified as template parameters. A stack is considered to have drifted if one or more of its resources have drifted.
    */
  @js.native
  @Factory
  trait StackDriftInformationSummary extends js.Object {
    var StackDriftStatus: StackDriftStatus
    var LastCheckTimestamp: js.UndefOr[Timestamp]
  }

  @js.native
  sealed trait StackDriftStatus extends js.Any
  object StackDriftStatus extends js.Object {
    val DRIFTED     = "DRIFTED".asInstanceOf[StackDriftStatus]
    val IN_SYNC     = "IN_SYNC".asInstanceOf[StackDriftStatus]
    val UNKNOWN     = "UNKNOWN".asInstanceOf[StackDriftStatus]
    val NOT_CHECKED = "NOT_CHECKED".asInstanceOf[StackDriftStatus]

    val values = js.Object.freeze(js.Array(DRIFTED, IN_SYNC, UNKNOWN, NOT_CHECKED))
  }

  /**
    * The StackEvent data type.
    */
  @js.native
  @Factory
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

  /**
    * An AWS CloudFormation stack, in a specific account and region, that's part of a stack set operation. A stack instance is a reference to an attempted or actual stack in a given account within a given region. A stack instance can exist without a stack—for example, if the stack couldn't be created for some reason. A stack instance is associated with only one stack set. Each stack instance contains the ID of its associated stack set, as well as the ID of the actual stack and the stack status.
    */
  @js.native
  @Factory
  trait StackInstance extends js.Object {
    var Account: js.UndefOr[Account]
    var DriftStatus: js.UndefOr[StackDriftStatus]
    var LastDriftCheckTimestamp: js.UndefOr[Timestamp]
    var OrganizationalUnitId: js.UndefOr[OrganizationalUnitId]
    var ParameterOverrides: js.UndefOr[Parameters]
    var Region: js.UndefOr[Region]
    var StackId: js.UndefOr[StackId]
    var StackSetId: js.UndefOr[StackSetId]
    var Status: js.UndefOr[StackInstanceStatus]
    var StatusReason: js.UndefOr[Reason]
  }

  @js.native
  sealed trait StackInstanceStatus extends js.Any
  object StackInstanceStatus extends js.Object {
    val CURRENT    = "CURRENT".asInstanceOf[StackInstanceStatus]
    val OUTDATED   = "OUTDATED".asInstanceOf[StackInstanceStatus]
    val INOPERABLE = "INOPERABLE".asInstanceOf[StackInstanceStatus]

    val values = js.Object.freeze(js.Array(CURRENT, OUTDATED, INOPERABLE))
  }

  /**
    * The structure that contains summary information about a stack instance.
    */
  @js.native
  @Factory
  trait StackInstanceSummary extends js.Object {
    var Account: js.UndefOr[Account]
    var DriftStatus: js.UndefOr[StackDriftStatus]
    var LastDriftCheckTimestamp: js.UndefOr[Timestamp]
    var OrganizationalUnitId: js.UndefOr[OrganizationalUnitId]
    var Region: js.UndefOr[Region]
    var StackId: js.UndefOr[StackId]
    var StackSetId: js.UndefOr[StackSetId]
    var Status: js.UndefOr[StackInstanceStatus]
    var StatusReason: js.UndefOr[Reason]
  }

  /**
    * The StackResource data type.
    */
  @js.native
  @Factory
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

  /**
    * Contains detailed information about the specified stack resource.
    */
  @js.native
  @Factory
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

  /**
    * Contains the drift information for a resource that has been checked for drift. This includes actual and expected property values for resources in which AWS CloudFormation has detected drift. Only resource properties explicitly defined in the stack template are checked for drift. For more information, see [[https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html|Detecting Unregulated Configuration Changes to Stacks and Resources]].
    *  Resources that do not currently support drift detection cannot be checked. For a list of resources that support drift detection, see [[http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html|Resources that Support Drift Detection]].
    *  Use <a>DetectStackResourceDrift</a> to detect drift on individual resources, or <a>DetectStackDrift</a> to detect drift on all resources in a given stack that support drift detection.
    */
  @js.native
  @Factory
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

  /**
    * Contains information about whether the resource's actual configuration differs, or has <i>drifted</i>, from its expected configuration.
    */
  @js.native
  @Factory
  trait StackResourceDriftInformation extends js.Object {
    var StackResourceDriftStatus: StackResourceDriftStatus
    var LastCheckTimestamp: js.UndefOr[Timestamp]
  }

  /**
    * Summarizes information about whether the resource's actual configuration differs, or has <i>drifted</i>, from its expected configuration.
    */
  @js.native
  @Factory
  trait StackResourceDriftInformationSummary extends js.Object {
    var StackResourceDriftStatus: StackResourceDriftStatus
    var LastCheckTimestamp: js.UndefOr[Timestamp]
  }

  @js.native
  sealed trait StackResourceDriftStatus extends js.Any
  object StackResourceDriftStatus extends js.Object {
    val IN_SYNC     = "IN_SYNC".asInstanceOf[StackResourceDriftStatus]
    val MODIFIED    = "MODIFIED".asInstanceOf[StackResourceDriftStatus]
    val DELETED     = "DELETED".asInstanceOf[StackResourceDriftStatus]
    val NOT_CHECKED = "NOT_CHECKED".asInstanceOf[StackResourceDriftStatus]

    val values = js.Object.freeze(js.Array(IN_SYNC, MODIFIED, DELETED, NOT_CHECKED))
  }

  /**
    * Contains high-level information about the specified stack resource.
    */
  @js.native
  @Factory
  trait StackResourceSummary extends js.Object {
    var LastUpdatedTimestamp: Timestamp
    var LogicalResourceId: LogicalResourceId
    var ResourceStatus: ResourceStatus
    var ResourceType: ResourceType
    var DriftInformation: js.UndefOr[StackResourceDriftInformationSummary]
    var PhysicalResourceId: js.UndefOr[PhysicalResourceId]
    var ResourceStatusReason: js.UndefOr[ResourceStatusReason]
  }

  /**
    * A structure that contains information about a stack set. A stack set enables you to provision stacks into AWS accounts and across regions by using a single CloudFormation template. In the stack set, you specify the template to use, as well as any parameters and capabilities that the template requires.
    */
  @js.native
  @Factory
  trait StackSet extends js.Object {
    var AdministrationRoleARN: js.UndefOr[RoleARN]
    var AutoDeployment: js.UndefOr[AutoDeployment]
    var Capabilities: js.UndefOr[Capabilities]
    var Description: js.UndefOr[Description]
    var ExecutionRoleName: js.UndefOr[ExecutionRoleName]
    var OrganizationalUnitIds: js.UndefOr[OrganizationalUnitIdList]
    var Parameters: js.UndefOr[Parameters]
    var PermissionModel: js.UndefOr[PermissionModels]
    var StackSetARN: js.UndefOr[StackSetARN]
    var StackSetDriftDetectionDetails: js.UndefOr[StackSetDriftDetectionDetails]
    var StackSetId: js.UndefOr[StackSetId]
    var StackSetName: js.UndefOr[StackSetName]
    var Status: js.UndefOr[StackSetStatus]
    var Tags: js.UndefOr[Tags]
    var TemplateBody: js.UndefOr[TemplateBody]
  }

  /**
    * Detailed information about the drift status of the stack set.
    *  For stack sets, contains information about the last <i>completed</i> drift operation performed on the stack set. Information about drift operations in-progress is not included.
    *  For stack set operations, includes information about drift operations currently being performed on the stack set.
    *  For more information, see [[https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-drift.html|Detecting Unmanaged Changes in Stack Sets]] in the <i>AWS CloudFormation User Guide</i>.
    */
  @js.native
  @Factory
  trait StackSetDriftDetectionDetails extends js.Object {
    var DriftDetectionStatus: js.UndefOr[StackSetDriftDetectionStatus]
    var DriftStatus: js.UndefOr[StackSetDriftStatus]
    var DriftedStackInstancesCount: js.UndefOr[DriftedStackInstancesCount]
    var FailedStackInstancesCount: js.UndefOr[FailedStackInstancesCount]
    var InProgressStackInstancesCount: js.UndefOr[InProgressStackInstancesCount]
    var InSyncStackInstancesCount: js.UndefOr[InSyncStackInstancesCount]
    var LastDriftCheckTimestamp: js.UndefOr[Timestamp]
    var TotalStackInstancesCount: js.UndefOr[TotalStackInstancesCount]
  }

  @js.native
  sealed trait StackSetDriftDetectionStatus extends js.Any
  object StackSetDriftDetectionStatus extends js.Object {
    val COMPLETED       = "COMPLETED".asInstanceOf[StackSetDriftDetectionStatus]
    val FAILED          = "FAILED".asInstanceOf[StackSetDriftDetectionStatus]
    val PARTIAL_SUCCESS = "PARTIAL_SUCCESS".asInstanceOf[StackSetDriftDetectionStatus]
    val IN_PROGRESS     = "IN_PROGRESS".asInstanceOf[StackSetDriftDetectionStatus]
    val STOPPED         = "STOPPED".asInstanceOf[StackSetDriftDetectionStatus]

    val values = js.Object.freeze(js.Array(COMPLETED, FAILED, PARTIAL_SUCCESS, IN_PROGRESS, STOPPED))
  }

  @js.native
  sealed trait StackSetDriftStatus extends js.Any
  object StackSetDriftStatus extends js.Object {
    val DRIFTED     = "DRIFTED".asInstanceOf[StackSetDriftStatus]
    val IN_SYNC     = "IN_SYNC".asInstanceOf[StackSetDriftStatus]
    val NOT_CHECKED = "NOT_CHECKED".asInstanceOf[StackSetDriftStatus]

    val values = js.Object.freeze(js.Array(DRIFTED, IN_SYNC, NOT_CHECKED))
  }

  /**
    * The structure that contains information about a stack set operation.
    */
  @js.native
  @Factory
  trait StackSetOperation extends js.Object {
    var Action: js.UndefOr[StackSetOperationAction]
    var AdministrationRoleARN: js.UndefOr[RoleARN]
    var CreationTimestamp: js.UndefOr[Timestamp]
    var DeploymentTargets: js.UndefOr[DeploymentTargets]
    var EndTimestamp: js.UndefOr[Timestamp]
    var ExecutionRoleName: js.UndefOr[ExecutionRoleName]
    var OperationId: js.UndefOr[ClientRequestToken]
    var OperationPreferences: js.UndefOr[StackSetOperationPreferences]
    var RetainStacks: js.UndefOr[RetainStacksNullable]
    var StackSetDriftDetectionDetails: js.UndefOr[StackSetDriftDetectionDetails]
    var StackSetId: js.UndefOr[StackSetId]
    var Status: js.UndefOr[StackSetOperationStatus]
  }

  @js.native
  sealed trait StackSetOperationAction extends js.Any
  object StackSetOperationAction extends js.Object {
    val CREATE       = "CREATE".asInstanceOf[StackSetOperationAction]
    val UPDATE       = "UPDATE".asInstanceOf[StackSetOperationAction]
    val DELETE       = "DELETE".asInstanceOf[StackSetOperationAction]
    val DETECT_DRIFT = "DETECT_DRIFT".asInstanceOf[StackSetOperationAction]

    val values = js.Object.freeze(js.Array(CREATE, UPDATE, DELETE, DETECT_DRIFT))
  }

  /**
    * The user-specified preferences for how AWS CloudFormation performs a stack set operation.
    *  For more information on maximum concurrent accounts and failure tolerance, see [[https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options|Stack set operation options]].
    */
  @js.native
  @Factory
  trait StackSetOperationPreferences extends js.Object {
    var FailureToleranceCount: js.UndefOr[FailureToleranceCount]
    var FailureTolerancePercentage: js.UndefOr[FailureTolerancePercentage]
    var MaxConcurrentCount: js.UndefOr[MaxConcurrentCount]
    var MaxConcurrentPercentage: js.UndefOr[MaxConcurrentPercentage]
    var RegionOrder: js.UndefOr[RegionList]
  }

  @js.native
  sealed trait StackSetOperationResultStatus extends js.Any
  object StackSetOperationResultStatus extends js.Object {
    val PENDING   = "PENDING".asInstanceOf[StackSetOperationResultStatus]
    val RUNNING   = "RUNNING".asInstanceOf[StackSetOperationResultStatus]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[StackSetOperationResultStatus]
    val FAILED    = "FAILED".asInstanceOf[StackSetOperationResultStatus]
    val CANCELLED = "CANCELLED".asInstanceOf[StackSetOperationResultStatus]

    val values = js.Object.freeze(js.Array(PENDING, RUNNING, SUCCEEDED, FAILED, CANCELLED))
  }

  /**
    * The structure that contains information about a specified operation's results for a given account in a given region.
    */
  @js.native
  @Factory
  trait StackSetOperationResultSummary extends js.Object {
    var Account: js.UndefOr[Account]
    var AccountGateResult: js.UndefOr[AccountGateResult]
    var OrganizationalUnitId: js.UndefOr[OrganizationalUnitId]
    var Region: js.UndefOr[Region]
    var Status: js.UndefOr[StackSetOperationResultStatus]
    var StatusReason: js.UndefOr[Reason]
  }

  @js.native
  sealed trait StackSetOperationStatus extends js.Any
  object StackSetOperationStatus extends js.Object {
    val RUNNING   = "RUNNING".asInstanceOf[StackSetOperationStatus]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[StackSetOperationStatus]
    val FAILED    = "FAILED".asInstanceOf[StackSetOperationStatus]
    val STOPPING  = "STOPPING".asInstanceOf[StackSetOperationStatus]
    val STOPPED   = "STOPPED".asInstanceOf[StackSetOperationStatus]
    val QUEUED    = "QUEUED".asInstanceOf[StackSetOperationStatus]

    val values = js.Object.freeze(js.Array(RUNNING, SUCCEEDED, FAILED, STOPPING, STOPPED, QUEUED))
  }

  /**
    * The structures that contain summary information about the specified operation.
    */
  @js.native
  @Factory
  trait StackSetOperationSummary extends js.Object {
    var Action: js.UndefOr[StackSetOperationAction]
    var CreationTimestamp: js.UndefOr[Timestamp]
    var EndTimestamp: js.UndefOr[Timestamp]
    var OperationId: js.UndefOr[ClientRequestToken]
    var Status: js.UndefOr[StackSetOperationStatus]
  }

  @js.native
  sealed trait StackSetStatus extends js.Any
  object StackSetStatus extends js.Object {
    val ACTIVE  = "ACTIVE".asInstanceOf[StackSetStatus]
    val DELETED = "DELETED".asInstanceOf[StackSetStatus]

    val values = js.Object.freeze(js.Array(ACTIVE, DELETED))
  }

  /**
    * The structures that contain summary information about the specified stack set.
    */
  @js.native
  @Factory
  trait StackSetSummary extends js.Object {
    var AutoDeployment: js.UndefOr[AutoDeployment]
    var Description: js.UndefOr[Description]
    var DriftStatus: js.UndefOr[StackDriftStatus]
    var LastDriftCheckTimestamp: js.UndefOr[Timestamp]
    var PermissionModel: js.UndefOr[PermissionModels]
    var StackSetId: js.UndefOr[StackSetId]
    var StackSetName: js.UndefOr[StackSetName]
    var Status: js.UndefOr[StackSetStatus]
  }

  @js.native
  sealed trait StackStatus extends js.Any
  object StackStatus extends js.Object {
    val CREATE_IN_PROGRESS                  = "CREATE_IN_PROGRESS".asInstanceOf[StackStatus]
    val CREATE_FAILED                       = "CREATE_FAILED".asInstanceOf[StackStatus]
    val CREATE_COMPLETE                     = "CREATE_COMPLETE".asInstanceOf[StackStatus]
    val ROLLBACK_IN_PROGRESS                = "ROLLBACK_IN_PROGRESS".asInstanceOf[StackStatus]
    val ROLLBACK_FAILED                     = "ROLLBACK_FAILED".asInstanceOf[StackStatus]
    val ROLLBACK_COMPLETE                   = "ROLLBACK_COMPLETE".asInstanceOf[StackStatus]
    val DELETE_IN_PROGRESS                  = "DELETE_IN_PROGRESS".asInstanceOf[StackStatus]
    val DELETE_FAILED                       = "DELETE_FAILED".asInstanceOf[StackStatus]
    val DELETE_COMPLETE                     = "DELETE_COMPLETE".asInstanceOf[StackStatus]
    val UPDATE_IN_PROGRESS                  = "UPDATE_IN_PROGRESS".asInstanceOf[StackStatus]
    val UPDATE_COMPLETE_CLEANUP_IN_PROGRESS = "UPDATE_COMPLETE_CLEANUP_IN_PROGRESS".asInstanceOf[StackStatus]
    val UPDATE_COMPLETE                     = "UPDATE_COMPLETE".asInstanceOf[StackStatus]
    val UPDATE_ROLLBACK_IN_PROGRESS         = "UPDATE_ROLLBACK_IN_PROGRESS".asInstanceOf[StackStatus]
    val UPDATE_ROLLBACK_FAILED              = "UPDATE_ROLLBACK_FAILED".asInstanceOf[StackStatus]
    val UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS =
      "UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS".asInstanceOf[StackStatus]
    val UPDATE_ROLLBACK_COMPLETE    = "UPDATE_ROLLBACK_COMPLETE".asInstanceOf[StackStatus]
    val REVIEW_IN_PROGRESS          = "REVIEW_IN_PROGRESS".asInstanceOf[StackStatus]
    val IMPORT_IN_PROGRESS          = "IMPORT_IN_PROGRESS".asInstanceOf[StackStatus]
    val IMPORT_COMPLETE             = "IMPORT_COMPLETE".asInstanceOf[StackStatus]
    val IMPORT_ROLLBACK_IN_PROGRESS = "IMPORT_ROLLBACK_IN_PROGRESS".asInstanceOf[StackStatus]
    val IMPORT_ROLLBACK_FAILED      = "IMPORT_ROLLBACK_FAILED".asInstanceOf[StackStatus]
    val IMPORT_ROLLBACK_COMPLETE    = "IMPORT_ROLLBACK_COMPLETE".asInstanceOf[StackStatus]

    val values = js.Object.freeze(
      js.Array(
        CREATE_IN_PROGRESS,
        CREATE_FAILED,
        CREATE_COMPLETE,
        ROLLBACK_IN_PROGRESS,
        ROLLBACK_FAILED,
        ROLLBACK_COMPLETE,
        DELETE_IN_PROGRESS,
        DELETE_FAILED,
        DELETE_COMPLETE,
        UPDATE_IN_PROGRESS,
        UPDATE_COMPLETE_CLEANUP_IN_PROGRESS,
        UPDATE_COMPLETE,
        UPDATE_ROLLBACK_IN_PROGRESS,
        UPDATE_ROLLBACK_FAILED,
        UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS,
        UPDATE_ROLLBACK_COMPLETE,
        REVIEW_IN_PROGRESS,
        IMPORT_IN_PROGRESS,
        IMPORT_COMPLETE,
        IMPORT_ROLLBACK_IN_PROGRESS,
        IMPORT_ROLLBACK_FAILED,
        IMPORT_ROLLBACK_COMPLETE
      )
    )
  }

  /**
    * The StackSummary Data Type
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait StopStackSetOperationInput extends js.Object {
    var OperationId: ClientRequestToken
    var StackSetName: StackSetName
  }

  @js.native
  @Factory
  trait StopStackSetOperationOutput extends js.Object {}

  /**
    * The Tag type enables you to specify a key-value pair that can be used to store information about an AWS CloudFormation stack.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  /**
    * The TemplateParameter data type.
    */
  @js.native
  @Factory
  trait TemplateParameter extends js.Object {
    var DefaultValue: js.UndefOr[ParameterValue]
    var Description: js.UndefOr[Description]
    var NoEcho: js.UndefOr[NoEcho]
    var ParameterKey: js.UndefOr[ParameterKey]
  }

  @js.native
  sealed trait TemplateStage extends js.Any
  object TemplateStage extends js.Object {
    val Original  = "Original".asInstanceOf[TemplateStage]
    val Processed = "Processed".asInstanceOf[TemplateStage]

    val values = js.Object.freeze(js.Array(Original, Processed))
  }

  /**
    * Contains summary information about the specified CloudFormation type.
    */
  @js.native
  @Factory
  trait TypeSummary extends js.Object {
    var DefaultVersionId: js.UndefOr[TypeVersionId]
    var Description: js.UndefOr[Description]
    var LastUpdated: js.UndefOr[Timestamp]
    var Type: js.UndefOr[RegistryType]
    var TypeArn: js.UndefOr[TypeArn]
    var TypeName: js.UndefOr[TypeName]
  }

  /**
    * Contains summary information about a specific version of a CloudFormation type.
    */
  @js.native
  @Factory
  trait TypeVersionSummary extends js.Object {
    var Arn: js.UndefOr[TypeArn]
    var Description: js.UndefOr[Description]
    var TimeCreated: js.UndefOr[Timestamp]
    var Type: js.UndefOr[RegistryType]
    var TypeName: js.UndefOr[TypeName]
    var VersionId: js.UndefOr[TypeVersionId]
  }

  /**
    * The input for an <a>UpdateStack</a> action.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait UpdateStackInstancesInput extends js.Object {
    var Regions: RegionList
    var StackSetName: StackSetNameOrId
    var Accounts: js.UndefOr[AccountList]
    var DeploymentTargets: js.UndefOr[DeploymentTargets]
    var OperationId: js.UndefOr[ClientRequestToken]
    var OperationPreferences: js.UndefOr[StackSetOperationPreferences]
    var ParameterOverrides: js.UndefOr[Parameters]
  }

  @js.native
  @Factory
  trait UpdateStackInstancesOutput extends js.Object {
    var OperationId: js.UndefOr[ClientRequestToken]
  }

  /**
    * The output for an <a>UpdateStack</a> action.
    */
  @js.native
  @Factory
  trait UpdateStackOutput extends js.Object {
    var StackId: js.UndefOr[StackId]
  }

  @js.native
  @Factory
  trait UpdateStackSetInput extends js.Object {
    var StackSetName: StackSetName
    var Accounts: js.UndefOr[AccountList]
    var AdministrationRoleARN: js.UndefOr[RoleARN]
    var AutoDeployment: js.UndefOr[AutoDeployment]
    var Capabilities: js.UndefOr[Capabilities]
    var DeploymentTargets: js.UndefOr[DeploymentTargets]
    var Description: js.UndefOr[Description]
    var ExecutionRoleName: js.UndefOr[ExecutionRoleName]
    var OperationId: js.UndefOr[ClientRequestToken]
    var OperationPreferences: js.UndefOr[StackSetOperationPreferences]
    var Parameters: js.UndefOr[Parameters]
    var PermissionModel: js.UndefOr[PermissionModels]
    var Regions: js.UndefOr[RegionList]
    var Tags: js.UndefOr[Tags]
    var TemplateBody: js.UndefOr[TemplateBody]
    var TemplateURL: js.UndefOr[TemplateURL]
    var UsePreviousTemplate: js.UndefOr[UsePreviousTemplate]
  }

  @js.native
  @Factory
  trait UpdateStackSetOutput extends js.Object {
    var OperationId: js.UndefOr[ClientRequestToken]
  }

  @js.native
  @Factory
  trait UpdateTerminationProtectionInput extends js.Object {
    var EnableTerminationProtection: EnableTerminationProtection
    var StackName: StackNameOrId
  }

  @js.native
  @Factory
  trait UpdateTerminationProtectionOutput extends js.Object {
    var StackId: js.UndefOr[StackId]
  }

  /**
    * The input for <a>ValidateTemplate</a> action.
    */
  @js.native
  @Factory
  trait ValidateTemplateInput extends js.Object {
    var TemplateBody: js.UndefOr[TemplateBody]
    var TemplateURL: js.UndefOr[TemplateURL]
  }

  /**
    * The output for <a>ValidateTemplate</a> action.
    */
  @js.native
  @Factory
  trait ValidateTemplateOutput extends js.Object {
    var Capabilities: js.UndefOr[Capabilities]
    var CapabilitiesReason: js.UndefOr[CapabilitiesReason]
    var DeclaredTransforms: js.UndefOr[TransformsList]
    var Description: js.UndefOr[Description]
    var Parameters: js.UndefOr[TemplateParameters]
  }

  @js.native
  sealed trait Visibility extends js.Any
  object Visibility extends js.Object {
    val PUBLIC  = "PUBLIC".asInstanceOf[Visibility]
    val PRIVATE = "PRIVATE".asInstanceOf[Visibility]

    val values = js.Object.freeze(js.Array(PUBLIC, PRIVATE))
  }
}
