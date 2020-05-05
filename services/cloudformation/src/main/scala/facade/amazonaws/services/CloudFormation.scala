package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

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
      service.cancelUpdateStack(params).promise.toFuture
    @inline def continueUpdateRollbackFuture(
        params: ContinueUpdateRollbackInput
    ): Future[ContinueUpdateRollbackOutput] = service.continueUpdateRollback(params).promise.toFuture
    @inline def createChangeSetFuture(params: CreateChangeSetInput): Future[CreateChangeSetOutput] =
      service.createChangeSet(params).promise.toFuture
    @inline def createStackFuture(params: CreateStackInput): Future[CreateStackOutput] =
      service.createStack(params).promise.toFuture
    @inline def createStackInstancesFuture(params: CreateStackInstancesInput): Future[CreateStackInstancesOutput] =
      service.createStackInstances(params).promise.toFuture
    @inline def createStackSetFuture(params: CreateStackSetInput): Future[CreateStackSetOutput] =
      service.createStackSet(params).promise.toFuture
    @inline def deleteChangeSetFuture(params: DeleteChangeSetInput): Future[DeleteChangeSetOutput] =
      service.deleteChangeSet(params).promise.toFuture
    @inline def deleteStackFuture(params: DeleteStackInput): Future[js.Object] =
      service.deleteStack(params).promise.toFuture
    @inline def deleteStackInstancesFuture(params: DeleteStackInstancesInput): Future[DeleteStackInstancesOutput] =
      service.deleteStackInstances(params).promise.toFuture
    @inline def deleteStackSetFuture(params: DeleteStackSetInput): Future[DeleteStackSetOutput] =
      service.deleteStackSet(params).promise.toFuture
    @inline def deregisterTypeFuture(params: DeregisterTypeInput): Future[DeregisterTypeOutput] =
      service.deregisterType(params).promise.toFuture
    @inline def describeAccountLimitsFuture(params: DescribeAccountLimitsInput): Future[DescribeAccountLimitsOutput] =
      service.describeAccountLimits(params).promise.toFuture
    @inline def describeChangeSetFuture(params: DescribeChangeSetInput): Future[DescribeChangeSetOutput] =
      service.describeChangeSet(params).promise.toFuture
    @inline def describeStackDriftDetectionStatusFuture(
        params: DescribeStackDriftDetectionStatusInput
    ): Future[DescribeStackDriftDetectionStatusOutput] =
      service.describeStackDriftDetectionStatus(params).promise.toFuture
    @inline def describeStackEventsFuture(params: DescribeStackEventsInput): Future[DescribeStackEventsOutput] =
      service.describeStackEvents(params).promise.toFuture
    @inline def describeStackInstanceFuture(params: DescribeStackInstanceInput): Future[DescribeStackInstanceOutput] =
      service.describeStackInstance(params).promise.toFuture
    @inline def describeStackResourceDriftsFuture(
        params: DescribeStackResourceDriftsInput
    ): Future[DescribeStackResourceDriftsOutput] = service.describeStackResourceDrifts(params).promise.toFuture
    @inline def describeStackResourceFuture(params: DescribeStackResourceInput): Future[DescribeStackResourceOutput] =
      service.describeStackResource(params).promise.toFuture
    @inline def describeStackResourcesFuture(
        params: DescribeStackResourcesInput
    ): Future[DescribeStackResourcesOutput] = service.describeStackResources(params).promise.toFuture
    @inline def describeStackSetFuture(params: DescribeStackSetInput): Future[DescribeStackSetOutput] =
      service.describeStackSet(params).promise.toFuture
    @inline def describeStackSetOperationFuture(
        params: DescribeStackSetOperationInput
    ): Future[DescribeStackSetOperationOutput] = service.describeStackSetOperation(params).promise.toFuture
    @inline def describeStacksFuture(params: DescribeStacksInput): Future[DescribeStacksOutput] =
      service.describeStacks(params).promise.toFuture
    @inline def describeTypeFuture(params: DescribeTypeInput): Future[DescribeTypeOutput] =
      service.describeType(params).promise.toFuture
    @inline def describeTypeRegistrationFuture(
        params: DescribeTypeRegistrationInput
    ): Future[DescribeTypeRegistrationOutput] = service.describeTypeRegistration(params).promise.toFuture
    @inline def detectStackDriftFuture(params: DetectStackDriftInput): Future[DetectStackDriftOutput] =
      service.detectStackDrift(params).promise.toFuture
    @inline def detectStackResourceDriftFuture(
        params: DetectStackResourceDriftInput
    ): Future[DetectStackResourceDriftOutput] = service.detectStackResourceDrift(params).promise.toFuture
    @inline def detectStackSetDriftFuture(params: DetectStackSetDriftInput): Future[DetectStackSetDriftOutput] =
      service.detectStackSetDrift(params).promise.toFuture
    @inline def estimateTemplateCostFuture(params: EstimateTemplateCostInput): Future[EstimateTemplateCostOutput] =
      service.estimateTemplateCost(params).promise.toFuture
    @inline def executeChangeSetFuture(params: ExecuteChangeSetInput): Future[ExecuteChangeSetOutput] =
      service.executeChangeSet(params).promise.toFuture
    @inline def getStackPolicyFuture(params: GetStackPolicyInput): Future[GetStackPolicyOutput] =
      service.getStackPolicy(params).promise.toFuture
    @inline def getTemplateFuture(params: GetTemplateInput): Future[GetTemplateOutput] =
      service.getTemplate(params).promise.toFuture
    @inline def getTemplateSummaryFuture(params: GetTemplateSummaryInput): Future[GetTemplateSummaryOutput] =
      service.getTemplateSummary(params).promise.toFuture
    @inline def listChangeSetsFuture(params: ListChangeSetsInput): Future[ListChangeSetsOutput] =
      service.listChangeSets(params).promise.toFuture
    @inline def listExportsFuture(params: ListExportsInput): Future[ListExportsOutput] =
      service.listExports(params).promise.toFuture
    @inline def listImportsFuture(params: ListImportsInput): Future[ListImportsOutput] =
      service.listImports(params).promise.toFuture
    @inline def listStackInstancesFuture(params: ListStackInstancesInput): Future[ListStackInstancesOutput] =
      service.listStackInstances(params).promise.toFuture
    @inline def listStackResourcesFuture(params: ListStackResourcesInput): Future[ListStackResourcesOutput] =
      service.listStackResources(params).promise.toFuture
    @inline def listStackSetOperationResultsFuture(
        params: ListStackSetOperationResultsInput
    ): Future[ListStackSetOperationResultsOutput] = service.listStackSetOperationResults(params).promise.toFuture
    @inline def listStackSetOperationsFuture(
        params: ListStackSetOperationsInput
    ): Future[ListStackSetOperationsOutput] = service.listStackSetOperations(params).promise.toFuture
    @inline def listStackSetsFuture(params: ListStackSetsInput): Future[ListStackSetsOutput] =
      service.listStackSets(params).promise.toFuture
    @inline def listStacksFuture(params: ListStacksInput): Future[ListStacksOutput] =
      service.listStacks(params).promise.toFuture
    @inline def listTypeRegistrationsFuture(params: ListTypeRegistrationsInput): Future[ListTypeRegistrationsOutput] =
      service.listTypeRegistrations(params).promise.toFuture
    @inline def listTypeVersionsFuture(params: ListTypeVersionsInput): Future[ListTypeVersionsOutput] =
      service.listTypeVersions(params).promise.toFuture
    @inline def listTypesFuture(params: ListTypesInput): Future[ListTypesOutput] =
      service.listTypes(params).promise.toFuture
    @inline def recordHandlerProgressFuture(params: RecordHandlerProgressInput): Future[RecordHandlerProgressOutput] =
      service.recordHandlerProgress(params).promise.toFuture
    @inline def registerTypeFuture(params: RegisterTypeInput): Future[RegisterTypeOutput] =
      service.registerType(params).promise.toFuture
    @inline def setStackPolicyFuture(params: SetStackPolicyInput): Future[js.Object] =
      service.setStackPolicy(params).promise.toFuture
    @inline def setTypeDefaultVersionFuture(params: SetTypeDefaultVersionInput): Future[SetTypeDefaultVersionOutput] =
      service.setTypeDefaultVersion(params).promise.toFuture
    @inline def signalResourceFuture(params: SignalResourceInput): Future[js.Object] =
      service.signalResource(params).promise.toFuture
    @inline def stopStackSetOperationFuture(params: StopStackSetOperationInput): Future[StopStackSetOperationOutput] =
      service.stopStackSetOperation(params).promise.toFuture
    @inline def updateStackFuture(params: UpdateStackInput): Future[UpdateStackOutput] =
      service.updateStack(params).promise.toFuture
    @inline def updateStackInstancesFuture(params: UpdateStackInstancesInput): Future[UpdateStackInstancesOutput] =
      service.updateStackInstances(params).promise.toFuture
    @inline def updateStackSetFuture(params: UpdateStackSetInput): Future[UpdateStackSetOutput] =
      service.updateStackSet(params).promise.toFuture
    @inline def updateTerminationProtectionFuture(
        params: UpdateTerminationProtectionInput
    ): Future[UpdateTerminationProtectionOutput] = service.updateTerminationProtection(params).promise.toFuture
    @inline def validateTemplateFuture(params: ValidateTemplateInput): Future[ValidateTemplateOutput] =
      service.validateTemplate(params).promise.toFuture
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
  trait AccountGateResult extends js.Object {
    var Status: js.UndefOr[AccountGateStatus]
    var StatusReason: js.UndefOr[AccountGateStatusReason]
  }

  object AccountGateResult {
    @inline
    def apply(
        Status: js.UndefOr[AccountGateStatus] = js.undefined,
        StatusReason: js.UndefOr[AccountGateStatusReason] = js.undefined
    ): AccountGateResult = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusReason.foreach(__v => __obj.updateDynamic("StatusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountGateResult]
    }
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
  trait AccountLimit extends js.Object {
    var Name: js.UndefOr[LimitName]
    var Value: js.UndefOr[LimitValue]
  }

  object AccountLimit {
    @inline
    def apply(
        Name: js.UndefOr[LimitName] = js.undefined,
        Value: js.UndefOr[LimitValue] = js.undefined
    ): AccountLimit = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountLimit]
    }
  }

  /**
    * [<code>Service-managed</code> permissions] Describes whether StackSets automatically deploys to AWS Organizations accounts that are added to a target organization or organizational unit (OU).
    */
  @js.native
  trait AutoDeployment extends js.Object {
    var Enabled: js.UndefOr[AutoDeploymentNullable]
    var RetainStacksOnAccountRemoval: js.UndefOr[RetainStacksOnAccountRemovalNullable]
  }

  object AutoDeployment {
    @inline
    def apply(
        Enabled: js.UndefOr[AutoDeploymentNullable] = js.undefined,
        RetainStacksOnAccountRemoval: js.UndefOr[RetainStacksOnAccountRemovalNullable] = js.undefined
    ): AutoDeployment = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      RetainStacksOnAccountRemoval.foreach(__v =>
        __obj.updateDynamic("RetainStacksOnAccountRemoval")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[AutoDeployment]
    }
  }

  /**
    * The input for the <a>CancelUpdateStack</a> action.
    */
  @js.native
  trait CancelUpdateStackInput extends js.Object {
    var StackName: StackName
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object CancelUpdateStackInput {
    @inline
    def apply(
        StackName: StackName,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): CancelUpdateStackInput = {
      val __obj = js.Dynamic.literal(
        "StackName" -> StackName.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelUpdateStackInput]
    }
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
  trait Change extends js.Object {
    var ResourceChange: js.UndefOr[ResourceChange]
    var Type: js.UndefOr[ChangeType]
  }

  object Change {
    @inline
    def apply(
        ResourceChange: js.UndefOr[ResourceChange] = js.undefined,
        Type: js.UndefOr[ChangeType] = js.undefined
    ): Change = {
      val __obj = js.Dynamic.literal()
      ResourceChange.foreach(__v => __obj.updateDynamic("ResourceChange")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Change]
    }
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
    @inline
    def apply(
        ChangeSetId: js.UndefOr[ChangeSetId] = js.undefined,
        ChangeSetName: js.UndefOr[ChangeSetName] = js.undefined,
        CreationTime: js.UndefOr[CreationTime] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        ExecutionStatus: js.UndefOr[ExecutionStatus] = js.undefined,
        StackId: js.UndefOr[StackId] = js.undefined,
        StackName: js.UndefOr[StackName] = js.undefined,
        Status: js.UndefOr[ChangeSetStatus] = js.undefined,
        StatusReason: js.UndefOr[ChangeSetStatusReason] = js.undefined
    ): ChangeSetSummary = {
      val __obj = js.Dynamic.literal()
      ChangeSetId.foreach(__v => __obj.updateDynamic("ChangeSetId")(__v.asInstanceOf[js.Any]))
      ChangeSetName.foreach(__v => __obj.updateDynamic("ChangeSetName")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ExecutionStatus.foreach(__v => __obj.updateDynamic("ExecutionStatus")(__v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.updateDynamic("StackId")(__v.asInstanceOf[js.Any]))
      StackName.foreach(__v => __obj.updateDynamic("StackName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusReason.foreach(__v => __obj.updateDynamic("StatusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChangeSetSummary]
    }
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
  trait ContinueUpdateRollbackInput extends js.Object {
    var StackName: StackNameOrId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var ResourcesToSkip: js.UndefOr[ResourcesToSkip]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object ContinueUpdateRollbackInput {
    @inline
    def apply(
        StackName: StackNameOrId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        ResourcesToSkip: js.UndefOr[ResourcesToSkip] = js.undefined,
        RoleARN: js.UndefOr[RoleARN] = js.undefined
    ): ContinueUpdateRollbackInput = {
      val __obj = js.Dynamic.literal(
        "StackName" -> StackName.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      ResourcesToSkip.foreach(__v => __obj.updateDynamic("ResourcesToSkip")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContinueUpdateRollbackInput]
    }
  }

  /**
    * The output for a <a>ContinueUpdateRollback</a> action.
    */
  @js.native
  trait ContinueUpdateRollbackOutput extends js.Object {}

  object ContinueUpdateRollbackOutput {
    @inline
    def apply(
    ): ContinueUpdateRollbackOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ContinueUpdateRollbackOutput]
    }
  }

  /**
    * The input for the <a>CreateChangeSet</a> action.
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
    var ResourcesToImport: js.UndefOr[ResourcesToImport]
    var RoleARN: js.UndefOr[RoleARN]
    var RollbackConfiguration: js.UndefOr[RollbackConfiguration]
    var Tags: js.UndefOr[Tags]
    var TemplateBody: js.UndefOr[TemplateBody]
    var TemplateURL: js.UndefOr[TemplateURL]
    var UsePreviousTemplate: js.UndefOr[UsePreviousTemplate]
  }

  object CreateChangeSetInput {
    @inline
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
        ResourcesToImport: js.UndefOr[ResourcesToImport] = js.undefined,
        RoleARN: js.UndefOr[RoleARN] = js.undefined,
        RollbackConfiguration: js.UndefOr[RollbackConfiguration] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        TemplateBody: js.UndefOr[TemplateBody] = js.undefined,
        TemplateURL: js.UndefOr[TemplateURL] = js.undefined,
        UsePreviousTemplate: js.UndefOr[UsePreviousTemplate] = js.undefined
    ): CreateChangeSetInput = {
      val __obj = js.Dynamic.literal(
        "ChangeSetName" -> ChangeSetName.asInstanceOf[js.Any],
        "StackName"     -> StackName.asInstanceOf[js.Any]
      )

      Capabilities.foreach(__v => __obj.updateDynamic("Capabilities")(__v.asInstanceOf[js.Any]))
      ChangeSetType.foreach(__v => __obj.updateDynamic("ChangeSetType")(__v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      NotificationARNs.foreach(__v => __obj.updateDynamic("NotificationARNs")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      ResourceTypes.foreach(__v => __obj.updateDynamic("ResourceTypes")(__v.asInstanceOf[js.Any]))
      ResourcesToImport.foreach(__v => __obj.updateDynamic("ResourcesToImport")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      RollbackConfiguration.foreach(__v => __obj.updateDynamic("RollbackConfiguration")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TemplateBody.foreach(__v => __obj.updateDynamic("TemplateBody")(__v.asInstanceOf[js.Any]))
      TemplateURL.foreach(__v => __obj.updateDynamic("TemplateURL")(__v.asInstanceOf[js.Any]))
      UsePreviousTemplate.foreach(__v => __obj.updateDynamic("UsePreviousTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChangeSetInput]
    }
  }

  /**
    * The output for the <a>CreateChangeSet</a> action.
    */
  @js.native
  trait CreateChangeSetOutput extends js.Object {
    var Id: js.UndefOr[ChangeSetId]
    var StackId: js.UndefOr[StackId]
  }

  object CreateChangeSetOutput {
    @inline
    def apply(
        Id: js.UndefOr[ChangeSetId] = js.undefined,
        StackId: js.UndefOr[StackId] = js.undefined
    ): CreateChangeSetOutput = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.updateDynamic("StackId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChangeSetOutput]
    }
  }

  /**
    * The input for <a>CreateStack</a> action.
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
    @inline
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
        TimeoutInMinutes: js.UndefOr[TimeoutMinutes] = js.undefined
    ): CreateStackInput = {
      val __obj = js.Dynamic.literal(
        "StackName" -> StackName.asInstanceOf[js.Any]
      )

      Capabilities.foreach(__v => __obj.updateDynamic("Capabilities")(__v.asInstanceOf[js.Any]))
      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      DisableRollback.foreach(__v => __obj.updateDynamic("DisableRollback")(__v.asInstanceOf[js.Any]))
      EnableTerminationProtection.foreach(__v =>
        __obj.updateDynamic("EnableTerminationProtection")(__v.asInstanceOf[js.Any])
      )
      NotificationARNs.foreach(__v => __obj.updateDynamic("NotificationARNs")(__v.asInstanceOf[js.Any]))
      OnFailure.foreach(__v => __obj.updateDynamic("OnFailure")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      ResourceTypes.foreach(__v => __obj.updateDynamic("ResourceTypes")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      RollbackConfiguration.foreach(__v => __obj.updateDynamic("RollbackConfiguration")(__v.asInstanceOf[js.Any]))
      StackPolicyBody.foreach(__v => __obj.updateDynamic("StackPolicyBody")(__v.asInstanceOf[js.Any]))
      StackPolicyURL.foreach(__v => __obj.updateDynamic("StackPolicyURL")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TemplateBody.foreach(__v => __obj.updateDynamic("TemplateBody")(__v.asInstanceOf[js.Any]))
      TemplateURL.foreach(__v => __obj.updateDynamic("TemplateURL")(__v.asInstanceOf[js.Any]))
      TimeoutInMinutes.foreach(__v => __obj.updateDynamic("TimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStackInput]
    }
  }

  @js.native
  trait CreateStackInstancesInput extends js.Object {
    var Regions: RegionList
    var StackSetName: StackSetName
    var Accounts: js.UndefOr[AccountList]
    var DeploymentTargets: js.UndefOr[DeploymentTargets]
    var OperationId: js.UndefOr[ClientRequestToken]
    var OperationPreferences: js.UndefOr[StackSetOperationPreferences]
    var ParameterOverrides: js.UndefOr[Parameters]
  }

  object CreateStackInstancesInput {
    @inline
    def apply(
        Regions: RegionList,
        StackSetName: StackSetName,
        Accounts: js.UndefOr[AccountList] = js.undefined,
        DeploymentTargets: js.UndefOr[DeploymentTargets] = js.undefined,
        OperationId: js.UndefOr[ClientRequestToken] = js.undefined,
        OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.undefined,
        ParameterOverrides: js.UndefOr[Parameters] = js.undefined
    ): CreateStackInstancesInput = {
      val __obj = js.Dynamic.literal(
        "Regions"      -> Regions.asInstanceOf[js.Any],
        "StackSetName" -> StackSetName.asInstanceOf[js.Any]
      )

      Accounts.foreach(__v => __obj.updateDynamic("Accounts")(__v.asInstanceOf[js.Any]))
      DeploymentTargets.foreach(__v => __obj.updateDynamic("DeploymentTargets")(__v.asInstanceOf[js.Any]))
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      OperationPreferences.foreach(__v => __obj.updateDynamic("OperationPreferences")(__v.asInstanceOf[js.Any]))
      ParameterOverrides.foreach(__v => __obj.updateDynamic("ParameterOverrides")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStackInstancesInput]
    }
  }

  @js.native
  trait CreateStackInstancesOutput extends js.Object {
    var OperationId: js.UndefOr[ClientRequestToken]
  }

  object CreateStackInstancesOutput {
    @inline
    def apply(
        OperationId: js.UndefOr[ClientRequestToken] = js.undefined
    ): CreateStackInstancesOutput = {
      val __obj = js.Dynamic.literal()
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStackInstancesOutput]
    }
  }

  /**
    * The output for a <a>CreateStack</a> action.
    */
  @js.native
  trait CreateStackOutput extends js.Object {
    var StackId: js.UndefOr[StackId]
  }

  object CreateStackOutput {
    @inline
    def apply(
        StackId: js.UndefOr[StackId] = js.undefined
    ): CreateStackOutput = {
      val __obj = js.Dynamic.literal()
      StackId.foreach(__v => __obj.updateDynamic("StackId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStackOutput]
    }
  }

  @js.native
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

  object CreateStackSetInput {
    @inline
    def apply(
        StackSetName: StackSetName,
        AdministrationRoleARN: js.UndefOr[RoleARN] = js.undefined,
        AutoDeployment: js.UndefOr[AutoDeployment] = js.undefined,
        Capabilities: js.UndefOr[Capabilities] = js.undefined,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        ExecutionRoleName: js.UndefOr[ExecutionRoleName] = js.undefined,
        Parameters: js.UndefOr[Parameters] = js.undefined,
        PermissionModel: js.UndefOr[PermissionModels] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        TemplateBody: js.UndefOr[TemplateBody] = js.undefined,
        TemplateURL: js.UndefOr[TemplateURL] = js.undefined
    ): CreateStackSetInput = {
      val __obj = js.Dynamic.literal(
        "StackSetName" -> StackSetName.asInstanceOf[js.Any]
      )

      AdministrationRoleARN.foreach(__v => __obj.updateDynamic("AdministrationRoleARN")(__v.asInstanceOf[js.Any]))
      AutoDeployment.foreach(__v => __obj.updateDynamic("AutoDeployment")(__v.asInstanceOf[js.Any]))
      Capabilities.foreach(__v => __obj.updateDynamic("Capabilities")(__v.asInstanceOf[js.Any]))
      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ExecutionRoleName.foreach(__v => __obj.updateDynamic("ExecutionRoleName")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      PermissionModel.foreach(__v => __obj.updateDynamic("PermissionModel")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TemplateBody.foreach(__v => __obj.updateDynamic("TemplateBody")(__v.asInstanceOf[js.Any]))
      TemplateURL.foreach(__v => __obj.updateDynamic("TemplateURL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStackSetInput]
    }
  }

  @js.native
  trait CreateStackSetOutput extends js.Object {
    var StackSetId: js.UndefOr[StackSetId]
  }

  object CreateStackSetOutput {
    @inline
    def apply(
        StackSetId: js.UndefOr[StackSetId] = js.undefined
    ): CreateStackSetOutput = {
      val __obj = js.Dynamic.literal()
      StackSetId.foreach(__v => __obj.updateDynamic("StackSetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStackSetOutput]
    }
  }

  /**
    * The input for the <a>DeleteChangeSet</a> action.
    */
  @js.native
  trait DeleteChangeSetInput extends js.Object {
    var ChangeSetName: ChangeSetNameOrId
    var StackName: js.UndefOr[StackNameOrId]
  }

  object DeleteChangeSetInput {
    @inline
    def apply(
        ChangeSetName: ChangeSetNameOrId,
        StackName: js.UndefOr[StackNameOrId] = js.undefined
    ): DeleteChangeSetInput = {
      val __obj = js.Dynamic.literal(
        "ChangeSetName" -> ChangeSetName.asInstanceOf[js.Any]
      )

      StackName.foreach(__v => __obj.updateDynamic("StackName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteChangeSetInput]
    }
  }

  /**
    * The output for the <a>DeleteChangeSet</a> action.
    */
  @js.native
  trait DeleteChangeSetOutput extends js.Object {}

  object DeleteChangeSetOutput {
    @inline
    def apply(
    ): DeleteChangeSetOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteChangeSetOutput]
    }
  }

  /**
    * The input for <a>DeleteStack</a> action.
    */
  @js.native
  trait DeleteStackInput extends js.Object {
    var StackName: StackName
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var RetainResources: js.UndefOr[RetainResources]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object DeleteStackInput {
    @inline
    def apply(
        StackName: StackName,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        RetainResources: js.UndefOr[RetainResources] = js.undefined,
        RoleARN: js.UndefOr[RoleARN] = js.undefined
    ): DeleteStackInput = {
      val __obj = js.Dynamic.literal(
        "StackName" -> StackName.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      RetainResources.foreach(__v => __obj.updateDynamic("RetainResources")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteStackInput]
    }
  }

  @js.native
  trait DeleteStackInstancesInput extends js.Object {
    var Regions: RegionList
    var RetainStacks: RetainStacks
    var StackSetName: StackSetName
    var Accounts: js.UndefOr[AccountList]
    var DeploymentTargets: js.UndefOr[DeploymentTargets]
    var OperationId: js.UndefOr[ClientRequestToken]
    var OperationPreferences: js.UndefOr[StackSetOperationPreferences]
  }

  object DeleteStackInstancesInput {
    @inline
    def apply(
        Regions: RegionList,
        RetainStacks: RetainStacks,
        StackSetName: StackSetName,
        Accounts: js.UndefOr[AccountList] = js.undefined,
        DeploymentTargets: js.UndefOr[DeploymentTargets] = js.undefined,
        OperationId: js.UndefOr[ClientRequestToken] = js.undefined,
        OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.undefined
    ): DeleteStackInstancesInput = {
      val __obj = js.Dynamic.literal(
        "Regions"      -> Regions.asInstanceOf[js.Any],
        "RetainStacks" -> RetainStacks.asInstanceOf[js.Any],
        "StackSetName" -> StackSetName.asInstanceOf[js.Any]
      )

      Accounts.foreach(__v => __obj.updateDynamic("Accounts")(__v.asInstanceOf[js.Any]))
      DeploymentTargets.foreach(__v => __obj.updateDynamic("DeploymentTargets")(__v.asInstanceOf[js.Any]))
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      OperationPreferences.foreach(__v => __obj.updateDynamic("OperationPreferences")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteStackInstancesInput]
    }
  }

  @js.native
  trait DeleteStackInstancesOutput extends js.Object {
    var OperationId: js.UndefOr[ClientRequestToken]
  }

  object DeleteStackInstancesOutput {
    @inline
    def apply(
        OperationId: js.UndefOr[ClientRequestToken] = js.undefined
    ): DeleteStackInstancesOutput = {
      val __obj = js.Dynamic.literal()
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteStackInstancesOutput]
    }
  }

  @js.native
  trait DeleteStackSetInput extends js.Object {
    var StackSetName: StackSetName
  }

  object DeleteStackSetInput {
    @inline
    def apply(
        StackSetName: StackSetName
    ): DeleteStackSetInput = {
      val __obj = js.Dynamic.literal(
        "StackSetName" -> StackSetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteStackSetInput]
    }
  }

  @js.native
  trait DeleteStackSetOutput extends js.Object {}

  object DeleteStackSetOutput {
    @inline
    def apply(
    ): DeleteStackSetOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteStackSetOutput]
    }
  }

  /**
    * [<code>Service-managed</code> permissions] The AWS Organizations accounts to which StackSets deploys.
    *  For update operations, you can specify either <code>Accounts</code> or <code>OrganizationalUnitIds</code>. For create and delete operations, specify <code>OrganizationalUnitIds</code>.
    */
  @js.native
  trait DeploymentTargets extends js.Object {
    var Accounts: js.UndefOr[AccountList]
    var OrganizationalUnitIds: js.UndefOr[OrganizationalUnitIdList]
  }

  object DeploymentTargets {
    @inline
    def apply(
        Accounts: js.UndefOr[AccountList] = js.undefined,
        OrganizationalUnitIds: js.UndefOr[OrganizationalUnitIdList] = js.undefined
    ): DeploymentTargets = {
      val __obj = js.Dynamic.literal()
      Accounts.foreach(__v => __obj.updateDynamic("Accounts")(__v.asInstanceOf[js.Any]))
      OrganizationalUnitIds.foreach(__v => __obj.updateDynamic("OrganizationalUnitIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentTargets]
    }
  }
  @js.native
  sealed trait DeprecatedStatus extends js.Any
  object DeprecatedStatus extends js.Object {
    val LIVE       = "LIVE".asInstanceOf[DeprecatedStatus]
    val DEPRECATED = "DEPRECATED".asInstanceOf[DeprecatedStatus]

    val values = js.Object.freeze(js.Array(LIVE, DEPRECATED))
  }

  @js.native
  trait DeregisterTypeInput extends js.Object {
    var Arn: js.UndefOr[PrivateTypeArn]
    var Type: js.UndefOr[RegistryType]
    var TypeName: js.UndefOr[TypeName]
    var VersionId: js.UndefOr[TypeVersionId]
  }

  object DeregisterTypeInput {
    @inline
    def apply(
        Arn: js.UndefOr[PrivateTypeArn] = js.undefined,
        Type: js.UndefOr[RegistryType] = js.undefined,
        TypeName: js.UndefOr[TypeName] = js.undefined,
        VersionId: js.UndefOr[TypeVersionId] = js.undefined
    ): DeregisterTypeInput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      TypeName.foreach(__v => __obj.updateDynamic("TypeName")(__v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeregisterTypeInput]
    }
  }

  @js.native
  trait DeregisterTypeOutput extends js.Object {}

  object DeregisterTypeOutput {
    @inline
    def apply(
    ): DeregisterTypeOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeregisterTypeOutput]
    }
  }

  /**
    * The input for the <a>DescribeAccountLimits</a> action.
    */
  @js.native
  trait DescribeAccountLimitsInput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAccountLimitsInput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAccountLimitsInput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountLimitsInput]
    }
  }

  /**
    * The output for the <a>DescribeAccountLimits</a> action.
    */
  @js.native
  trait DescribeAccountLimitsOutput extends js.Object {
    var AccountLimits: js.UndefOr[AccountLimitList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAccountLimitsOutput {
    @inline
    def apply(
        AccountLimits: js.UndefOr[AccountLimitList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAccountLimitsOutput = {
      val __obj = js.Dynamic.literal()
      AccountLimits.foreach(__v => __obj.updateDynamic("AccountLimits")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountLimitsOutput]
    }
  }

  /**
    * The input for the <a>DescribeChangeSet</a> action.
    */
  @js.native
  trait DescribeChangeSetInput extends js.Object {
    var ChangeSetName: ChangeSetNameOrId
    var NextToken: js.UndefOr[NextToken]
    var StackName: js.UndefOr[StackNameOrId]
  }

  object DescribeChangeSetInput {
    @inline
    def apply(
        ChangeSetName: ChangeSetNameOrId,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StackName: js.UndefOr[StackNameOrId] = js.undefined
    ): DescribeChangeSetInput = {
      val __obj = js.Dynamic.literal(
        "ChangeSetName" -> ChangeSetName.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StackName.foreach(__v => __obj.updateDynamic("StackName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeChangeSetInput]
    }
  }

  /**
    * The output for the <a>DescribeChangeSet</a> action.
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
    @inline
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
        Tags: js.UndefOr[Tags] = js.undefined
    ): DescribeChangeSetOutput = {
      val __obj = js.Dynamic.literal()
      Capabilities.foreach(__v => __obj.updateDynamic("Capabilities")(__v.asInstanceOf[js.Any]))
      ChangeSetId.foreach(__v => __obj.updateDynamic("ChangeSetId")(__v.asInstanceOf[js.Any]))
      ChangeSetName.foreach(__v => __obj.updateDynamic("ChangeSetName")(__v.asInstanceOf[js.Any]))
      Changes.foreach(__v => __obj.updateDynamic("Changes")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ExecutionStatus.foreach(__v => __obj.updateDynamic("ExecutionStatus")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      NotificationARNs.foreach(__v => __obj.updateDynamic("NotificationARNs")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      RollbackConfiguration.foreach(__v => __obj.updateDynamic("RollbackConfiguration")(__v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.updateDynamic("StackId")(__v.asInstanceOf[js.Any]))
      StackName.foreach(__v => __obj.updateDynamic("StackName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusReason.foreach(__v => __obj.updateDynamic("StatusReason")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeChangeSetOutput]
    }
  }

  @js.native
  trait DescribeStackDriftDetectionStatusInput extends js.Object {
    var StackDriftDetectionId: StackDriftDetectionId
  }

  object DescribeStackDriftDetectionStatusInput {
    @inline
    def apply(
        StackDriftDetectionId: StackDriftDetectionId
    ): DescribeStackDriftDetectionStatusInput = {
      val __obj = js.Dynamic.literal(
        "StackDriftDetectionId" -> StackDriftDetectionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeStackDriftDetectionStatusInput]
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
    @inline
    def apply(
        DetectionStatus: StackDriftDetectionStatus,
        StackDriftDetectionId: StackDriftDetectionId,
        StackId: StackId,
        Timestamp: Timestamp,
        DetectionStatusReason: js.UndefOr[StackDriftDetectionStatusReason] = js.undefined,
        DriftedStackResourceCount: js.UndefOr[BoxedInteger] = js.undefined,
        StackDriftStatus: js.UndefOr[StackDriftStatus] = js.undefined
    ): DescribeStackDriftDetectionStatusOutput = {
      val __obj = js.Dynamic.literal(
        "DetectionStatus"       -> DetectionStatus.asInstanceOf[js.Any],
        "StackDriftDetectionId" -> StackDriftDetectionId.asInstanceOf[js.Any],
        "StackId"               -> StackId.asInstanceOf[js.Any],
        "Timestamp"             -> Timestamp.asInstanceOf[js.Any]
      )

      DetectionStatusReason.foreach(__v => __obj.updateDynamic("DetectionStatusReason")(__v.asInstanceOf[js.Any]))
      DriftedStackResourceCount.foreach(__v =>
        __obj.updateDynamic("DriftedStackResourceCount")(__v.asInstanceOf[js.Any])
      )
      StackDriftStatus.foreach(__v => __obj.updateDynamic("StackDriftStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStackDriftDetectionStatusOutput]
    }
  }

  /**
    * The input for <a>DescribeStackEvents</a> action.
    */
  @js.native
  trait DescribeStackEventsInput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StackName: js.UndefOr[StackName]
  }

  object DescribeStackEventsInput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StackName: js.UndefOr[StackName] = js.undefined
    ): DescribeStackEventsInput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StackName.foreach(__v => __obj.updateDynamic("StackName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStackEventsInput]
    }
  }

  /**
    * The output for a <a>DescribeStackEvents</a> action.
    */
  @js.native
  trait DescribeStackEventsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StackEvents: js.UndefOr[StackEvents]
  }

  object DescribeStackEventsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StackEvents: js.UndefOr[StackEvents] = js.undefined
    ): DescribeStackEventsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StackEvents.foreach(__v => __obj.updateDynamic("StackEvents")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStackEventsOutput]
    }
  }

  @js.native
  trait DescribeStackInstanceInput extends js.Object {
    var StackInstanceAccount: Account
    var StackInstanceRegion: Region
    var StackSetName: StackSetName
  }

  object DescribeStackInstanceInput {
    @inline
    def apply(
        StackInstanceAccount: Account,
        StackInstanceRegion: Region,
        StackSetName: StackSetName
    ): DescribeStackInstanceInput = {
      val __obj = js.Dynamic.literal(
        "StackInstanceAccount" -> StackInstanceAccount.asInstanceOf[js.Any],
        "StackInstanceRegion"  -> StackInstanceRegion.asInstanceOf[js.Any],
        "StackSetName"         -> StackSetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeStackInstanceInput]
    }
  }

  @js.native
  trait DescribeStackInstanceOutput extends js.Object {
    var StackInstance: js.UndefOr[StackInstance]
  }

  object DescribeStackInstanceOutput {
    @inline
    def apply(
        StackInstance: js.UndefOr[StackInstance] = js.undefined
    ): DescribeStackInstanceOutput = {
      val __obj = js.Dynamic.literal()
      StackInstance.foreach(__v => __obj.updateDynamic("StackInstance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStackInstanceOutput]
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
    @inline
    def apply(
        StackName: StackNameOrId,
        MaxResults: js.UndefOr[BoxedMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StackResourceDriftStatusFilters: js.UndefOr[StackResourceDriftStatusFilters] = js.undefined
    ): DescribeStackResourceDriftsInput = {
      val __obj = js.Dynamic.literal(
        "StackName" -> StackName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StackResourceDriftStatusFilters.foreach(__v =>
        __obj.updateDynamic("StackResourceDriftStatusFilters")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeStackResourceDriftsInput]
    }
  }

  @js.native
  trait DescribeStackResourceDriftsOutput extends js.Object {
    var StackResourceDrifts: StackResourceDrifts
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeStackResourceDriftsOutput {
    @inline
    def apply(
        StackResourceDrifts: StackResourceDrifts,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeStackResourceDriftsOutput = {
      val __obj = js.Dynamic.literal(
        "StackResourceDrifts" -> StackResourceDrifts.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStackResourceDriftsOutput]
    }
  }

  /**
    * The input for <a>DescribeStackResource</a> action.
    */
  @js.native
  trait DescribeStackResourceInput extends js.Object {
    var LogicalResourceId: LogicalResourceId
    var StackName: StackName
  }

  object DescribeStackResourceInput {
    @inline
    def apply(
        LogicalResourceId: LogicalResourceId,
        StackName: StackName
    ): DescribeStackResourceInput = {
      val __obj = js.Dynamic.literal(
        "LogicalResourceId" -> LogicalResourceId.asInstanceOf[js.Any],
        "StackName"         -> StackName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeStackResourceInput]
    }
  }

  /**
    * The output for a <a>DescribeStackResource</a> action.
    */
  @js.native
  trait DescribeStackResourceOutput extends js.Object {
    var StackResourceDetail: js.UndefOr[StackResourceDetail]
  }

  object DescribeStackResourceOutput {
    @inline
    def apply(
        StackResourceDetail: js.UndefOr[StackResourceDetail] = js.undefined
    ): DescribeStackResourceOutput = {
      val __obj = js.Dynamic.literal()
      StackResourceDetail.foreach(__v => __obj.updateDynamic("StackResourceDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStackResourceOutput]
    }
  }

  /**
    * The input for <a>DescribeStackResources</a> action.
    */
  @js.native
  trait DescribeStackResourcesInput extends js.Object {
    var LogicalResourceId: js.UndefOr[LogicalResourceId]
    var PhysicalResourceId: js.UndefOr[PhysicalResourceId]
    var StackName: js.UndefOr[StackName]
  }

  object DescribeStackResourcesInput {
    @inline
    def apply(
        LogicalResourceId: js.UndefOr[LogicalResourceId] = js.undefined,
        PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined,
        StackName: js.UndefOr[StackName] = js.undefined
    ): DescribeStackResourcesInput = {
      val __obj = js.Dynamic.literal()
      LogicalResourceId.foreach(__v => __obj.updateDynamic("LogicalResourceId")(__v.asInstanceOf[js.Any]))
      PhysicalResourceId.foreach(__v => __obj.updateDynamic("PhysicalResourceId")(__v.asInstanceOf[js.Any]))
      StackName.foreach(__v => __obj.updateDynamic("StackName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStackResourcesInput]
    }
  }

  /**
    * The output for a <a>DescribeStackResources</a> action.
    */
  @js.native
  trait DescribeStackResourcesOutput extends js.Object {
    var StackResources: js.UndefOr[StackResources]
  }

  object DescribeStackResourcesOutput {
    @inline
    def apply(
        StackResources: js.UndefOr[StackResources] = js.undefined
    ): DescribeStackResourcesOutput = {
      val __obj = js.Dynamic.literal()
      StackResources.foreach(__v => __obj.updateDynamic("StackResources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStackResourcesOutput]
    }
  }

  @js.native
  trait DescribeStackSetInput extends js.Object {
    var StackSetName: StackSetName
  }

  object DescribeStackSetInput {
    @inline
    def apply(
        StackSetName: StackSetName
    ): DescribeStackSetInput = {
      val __obj = js.Dynamic.literal(
        "StackSetName" -> StackSetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeStackSetInput]
    }
  }

  @js.native
  trait DescribeStackSetOperationInput extends js.Object {
    var OperationId: ClientRequestToken
    var StackSetName: StackSetName
  }

  object DescribeStackSetOperationInput {
    @inline
    def apply(
        OperationId: ClientRequestToken,
        StackSetName: StackSetName
    ): DescribeStackSetOperationInput = {
      val __obj = js.Dynamic.literal(
        "OperationId"  -> OperationId.asInstanceOf[js.Any],
        "StackSetName" -> StackSetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeStackSetOperationInput]
    }
  }

  @js.native
  trait DescribeStackSetOperationOutput extends js.Object {
    var StackSetOperation: js.UndefOr[StackSetOperation]
  }

  object DescribeStackSetOperationOutput {
    @inline
    def apply(
        StackSetOperation: js.UndefOr[StackSetOperation] = js.undefined
    ): DescribeStackSetOperationOutput = {
      val __obj = js.Dynamic.literal()
      StackSetOperation.foreach(__v => __obj.updateDynamic("StackSetOperation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStackSetOperationOutput]
    }
  }

  @js.native
  trait DescribeStackSetOutput extends js.Object {
    var StackSet: js.UndefOr[StackSet]
  }

  object DescribeStackSetOutput {
    @inline
    def apply(
        StackSet: js.UndefOr[StackSet] = js.undefined
    ): DescribeStackSetOutput = {
      val __obj = js.Dynamic.literal()
      StackSet.foreach(__v => __obj.updateDynamic("StackSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStackSetOutput]
    }
  }

  /**
    * The input for <a>DescribeStacks</a> action.
    */
  @js.native
  trait DescribeStacksInput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StackName: js.UndefOr[StackName]
  }

  object DescribeStacksInput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StackName: js.UndefOr[StackName] = js.undefined
    ): DescribeStacksInput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StackName.foreach(__v => __obj.updateDynamic("StackName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStacksInput]
    }
  }

  /**
    * The output for a <a>DescribeStacks</a> action.
    */
  @js.native
  trait DescribeStacksOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Stacks: js.UndefOr[Stacks]
  }

  object DescribeStacksOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Stacks: js.UndefOr[Stacks] = js.undefined
    ): DescribeStacksOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Stacks.foreach(__v => __obj.updateDynamic("Stacks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStacksOutput]
    }
  }

  @js.native
  trait DescribeTypeInput extends js.Object {
    var Arn: js.UndefOr[TypeArn]
    var Type: js.UndefOr[RegistryType]
    var TypeName: js.UndefOr[TypeName]
    var VersionId: js.UndefOr[TypeVersionId]
  }

  object DescribeTypeInput {
    @inline
    def apply(
        Arn: js.UndefOr[TypeArn] = js.undefined,
        Type: js.UndefOr[RegistryType] = js.undefined,
        TypeName: js.UndefOr[TypeName] = js.undefined,
        VersionId: js.UndefOr[TypeVersionId] = js.undefined
    ): DescribeTypeInput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      TypeName.foreach(__v => __obj.updateDynamic("TypeName")(__v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTypeInput]
    }
  }

  @js.native
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

  object DescribeTypeOutput {
    @inline
    def apply(
        Arn: js.UndefOr[TypeArn] = js.undefined,
        DefaultVersionId: js.UndefOr[TypeVersionId] = js.undefined,
        DeprecatedStatus: js.UndefOr[DeprecatedStatus] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        DocumentationUrl: js.UndefOr[OptionalSecureUrl] = js.undefined,
        ExecutionRoleArn: js.UndefOr[RoleArn] = js.undefined,
        LastUpdated: js.UndefOr[Timestamp] = js.undefined,
        LoggingConfig: js.UndefOr[LoggingConfig] = js.undefined,
        ProvisioningType: js.UndefOr[ProvisioningType] = js.undefined,
        Schema: js.UndefOr[TypeSchema] = js.undefined,
        SourceUrl: js.UndefOr[OptionalSecureUrl] = js.undefined,
        TimeCreated: js.UndefOr[Timestamp] = js.undefined,
        Type: js.UndefOr[RegistryType] = js.undefined,
        TypeName: js.UndefOr[TypeName] = js.undefined,
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): DescribeTypeOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      DefaultVersionId.foreach(__v => __obj.updateDynamic("DefaultVersionId")(__v.asInstanceOf[js.Any]))
      DeprecatedStatus.foreach(__v => __obj.updateDynamic("DeprecatedStatus")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DocumentationUrl.foreach(__v => __obj.updateDynamic("DocumentationUrl")(__v.asInstanceOf[js.Any]))
      ExecutionRoleArn.foreach(__v => __obj.updateDynamic("ExecutionRoleArn")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      LoggingConfig.foreach(__v => __obj.updateDynamic("LoggingConfig")(__v.asInstanceOf[js.Any]))
      ProvisioningType.foreach(__v => __obj.updateDynamic("ProvisioningType")(__v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.updateDynamic("Schema")(__v.asInstanceOf[js.Any]))
      SourceUrl.foreach(__v => __obj.updateDynamic("SourceUrl")(__v.asInstanceOf[js.Any]))
      TimeCreated.foreach(__v => __obj.updateDynamic("TimeCreated")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      TypeName.foreach(__v => __obj.updateDynamic("TypeName")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTypeOutput]
    }
  }

  @js.native
  trait DescribeTypeRegistrationInput extends js.Object {
    var RegistrationToken: RegistrationToken
  }

  object DescribeTypeRegistrationInput {
    @inline
    def apply(
        RegistrationToken: RegistrationToken
    ): DescribeTypeRegistrationInput = {
      val __obj = js.Dynamic.literal(
        "RegistrationToken" -> RegistrationToken.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeTypeRegistrationInput]
    }
  }

  @js.native
  trait DescribeTypeRegistrationOutput extends js.Object {
    var Description: js.UndefOr[Description]
    var ProgressStatus: js.UndefOr[RegistrationStatus]
    var TypeArn: js.UndefOr[TypeArn]
    var TypeVersionArn: js.UndefOr[TypeArn]
  }

  object DescribeTypeRegistrationOutput {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        ProgressStatus: js.UndefOr[RegistrationStatus] = js.undefined,
        TypeArn: js.UndefOr[TypeArn] = js.undefined,
        TypeVersionArn: js.UndefOr[TypeArn] = js.undefined
    ): DescribeTypeRegistrationOutput = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ProgressStatus.foreach(__v => __obj.updateDynamic("ProgressStatus")(__v.asInstanceOf[js.Any]))
      TypeArn.foreach(__v => __obj.updateDynamic("TypeArn")(__v.asInstanceOf[js.Any]))
      TypeVersionArn.foreach(__v => __obj.updateDynamic("TypeVersionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTypeRegistrationOutput]
    }
  }

  @js.native
  trait DetectStackDriftInput extends js.Object {
    var StackName: StackNameOrId
    var LogicalResourceIds: js.UndefOr[LogicalResourceIds]
  }

  object DetectStackDriftInput {
    @inline
    def apply(
        StackName: StackNameOrId,
        LogicalResourceIds: js.UndefOr[LogicalResourceIds] = js.undefined
    ): DetectStackDriftInput = {
      val __obj = js.Dynamic.literal(
        "StackName" -> StackName.asInstanceOf[js.Any]
      )

      LogicalResourceIds.foreach(__v => __obj.updateDynamic("LogicalResourceIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectStackDriftInput]
    }
  }

  @js.native
  trait DetectStackDriftOutput extends js.Object {
    var StackDriftDetectionId: StackDriftDetectionId
  }

  object DetectStackDriftOutput {
    @inline
    def apply(
        StackDriftDetectionId: StackDriftDetectionId
    ): DetectStackDriftOutput = {
      val __obj = js.Dynamic.literal(
        "StackDriftDetectionId" -> StackDriftDetectionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetectStackDriftOutput]
    }
  }

  @js.native
  trait DetectStackResourceDriftInput extends js.Object {
    var LogicalResourceId: LogicalResourceId
    var StackName: StackNameOrId
  }

  object DetectStackResourceDriftInput {
    @inline
    def apply(
        LogicalResourceId: LogicalResourceId,
        StackName: StackNameOrId
    ): DetectStackResourceDriftInput = {
      val __obj = js.Dynamic.literal(
        "LogicalResourceId" -> LogicalResourceId.asInstanceOf[js.Any],
        "StackName"         -> StackName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetectStackResourceDriftInput]
    }
  }

  @js.native
  trait DetectStackResourceDriftOutput extends js.Object {
    var StackResourceDrift: StackResourceDrift
  }

  object DetectStackResourceDriftOutput {
    @inline
    def apply(
        StackResourceDrift: StackResourceDrift
    ): DetectStackResourceDriftOutput = {
      val __obj = js.Dynamic.literal(
        "StackResourceDrift" -> StackResourceDrift.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetectStackResourceDriftOutput]
    }
  }

  @js.native
  trait DetectStackSetDriftInput extends js.Object {
    var StackSetName: StackSetNameOrId
    var OperationId: js.UndefOr[ClientRequestToken]
    var OperationPreferences: js.UndefOr[StackSetOperationPreferences]
  }

  object DetectStackSetDriftInput {
    @inline
    def apply(
        StackSetName: StackSetNameOrId,
        OperationId: js.UndefOr[ClientRequestToken] = js.undefined,
        OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.undefined
    ): DetectStackSetDriftInput = {
      val __obj = js.Dynamic.literal(
        "StackSetName" -> StackSetName.asInstanceOf[js.Any]
      )

      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      OperationPreferences.foreach(__v => __obj.updateDynamic("OperationPreferences")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectStackSetDriftInput]
    }
  }

  @js.native
  trait DetectStackSetDriftOutput extends js.Object {
    var OperationId: js.UndefOr[ClientRequestToken]
  }

  object DetectStackSetDriftOutput {
    @inline
    def apply(
        OperationId: js.UndefOr[ClientRequestToken] = js.undefined
    ): DetectStackSetDriftOutput = {
      val __obj = js.Dynamic.literal()
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectStackSetDriftOutput]
    }
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
  trait EstimateTemplateCostInput extends js.Object {
    var Parameters: js.UndefOr[Parameters]
    var TemplateBody: js.UndefOr[TemplateBody]
    var TemplateURL: js.UndefOr[TemplateURL]
  }

  object EstimateTemplateCostInput {
    @inline
    def apply(
        Parameters: js.UndefOr[Parameters] = js.undefined,
        TemplateBody: js.UndefOr[TemplateBody] = js.undefined,
        TemplateURL: js.UndefOr[TemplateURL] = js.undefined
    ): EstimateTemplateCostInput = {
      val __obj = js.Dynamic.literal()
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      TemplateBody.foreach(__v => __obj.updateDynamic("TemplateBody")(__v.asInstanceOf[js.Any]))
      TemplateURL.foreach(__v => __obj.updateDynamic("TemplateURL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EstimateTemplateCostInput]
    }
  }

  /**
    * The output for a <a>EstimateTemplateCost</a> action.
    */
  @js.native
  trait EstimateTemplateCostOutput extends js.Object {
    var Url: js.UndefOr[Url]
  }

  object EstimateTemplateCostOutput {
    @inline
    def apply(
        Url: js.UndefOr[Url] = js.undefined
    ): EstimateTemplateCostOutput = {
      val __obj = js.Dynamic.literal()
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EstimateTemplateCostOutput]
    }
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
  trait ExecuteChangeSetInput extends js.Object {
    var ChangeSetName: ChangeSetNameOrId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var StackName: js.UndefOr[StackNameOrId]
  }

  object ExecuteChangeSetInput {
    @inline
    def apply(
        ChangeSetName: ChangeSetNameOrId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        StackName: js.UndefOr[StackNameOrId] = js.undefined
    ): ExecuteChangeSetInput = {
      val __obj = js.Dynamic.literal(
        "ChangeSetName" -> ChangeSetName.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      StackName.foreach(__v => __obj.updateDynamic("StackName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteChangeSetInput]
    }
  }

  /**
    * The output for the <a>ExecuteChangeSet</a> action.
    */
  @js.native
  trait ExecuteChangeSetOutput extends js.Object {}

  object ExecuteChangeSetOutput {
    @inline
    def apply(
    ): ExecuteChangeSetOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ExecuteChangeSetOutput]
    }
  }
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
  trait Export extends js.Object {
    var ExportingStackId: js.UndefOr[StackId]
    var Name: js.UndefOr[ExportName]
    var Value: js.UndefOr[ExportValue]
  }

  object Export {
    @inline
    def apply(
        ExportingStackId: js.UndefOr[StackId] = js.undefined,
        Name: js.UndefOr[ExportName] = js.undefined,
        Value: js.UndefOr[ExportValue] = js.undefined
    ): Export = {
      val __obj = js.Dynamic.literal()
      ExportingStackId.foreach(__v => __obj.updateDynamic("ExportingStackId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Export]
    }
  }

  /**
    * The input for the <a>GetStackPolicy</a> action.
    */
  @js.native
  trait GetStackPolicyInput extends js.Object {
    var StackName: StackName
  }

  object GetStackPolicyInput {
    @inline
    def apply(
        StackName: StackName
    ): GetStackPolicyInput = {
      val __obj = js.Dynamic.literal(
        "StackName" -> StackName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetStackPolicyInput]
    }
  }

  /**
    * The output for the <a>GetStackPolicy</a> action.
    */
  @js.native
  trait GetStackPolicyOutput extends js.Object {
    var StackPolicyBody: js.UndefOr[StackPolicyBody]
  }

  object GetStackPolicyOutput {
    @inline
    def apply(
        StackPolicyBody: js.UndefOr[StackPolicyBody] = js.undefined
    ): GetStackPolicyOutput = {
      val __obj = js.Dynamic.literal()
      StackPolicyBody.foreach(__v => __obj.updateDynamic("StackPolicyBody")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStackPolicyOutput]
    }
  }

  /**
    * The input for a <a>GetTemplate</a> action.
    */
  @js.native
  trait GetTemplateInput extends js.Object {
    var ChangeSetName: js.UndefOr[ChangeSetNameOrId]
    var StackName: js.UndefOr[StackName]
    var TemplateStage: js.UndefOr[TemplateStage]
  }

  object GetTemplateInput {
    @inline
    def apply(
        ChangeSetName: js.UndefOr[ChangeSetNameOrId] = js.undefined,
        StackName: js.UndefOr[StackName] = js.undefined,
        TemplateStage: js.UndefOr[TemplateStage] = js.undefined
    ): GetTemplateInput = {
      val __obj = js.Dynamic.literal()
      ChangeSetName.foreach(__v => __obj.updateDynamic("ChangeSetName")(__v.asInstanceOf[js.Any]))
      StackName.foreach(__v => __obj.updateDynamic("StackName")(__v.asInstanceOf[js.Any]))
      TemplateStage.foreach(__v => __obj.updateDynamic("TemplateStage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTemplateInput]
    }
  }

  /**
    * The output for <a>GetTemplate</a> action.
    */
  @js.native
  trait GetTemplateOutput extends js.Object {
    var StagesAvailable: js.UndefOr[StageList]
    var TemplateBody: js.UndefOr[TemplateBody]
  }

  object GetTemplateOutput {
    @inline
    def apply(
        StagesAvailable: js.UndefOr[StageList] = js.undefined,
        TemplateBody: js.UndefOr[TemplateBody] = js.undefined
    ): GetTemplateOutput = {
      val __obj = js.Dynamic.literal()
      StagesAvailable.foreach(__v => __obj.updateDynamic("StagesAvailable")(__v.asInstanceOf[js.Any]))
      TemplateBody.foreach(__v => __obj.updateDynamic("TemplateBody")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTemplateOutput]
    }
  }

  /**
    * The input for the <a>GetTemplateSummary</a> action.
    */
  @js.native
  trait GetTemplateSummaryInput extends js.Object {
    var StackName: js.UndefOr[StackNameOrId]
    var StackSetName: js.UndefOr[StackSetNameOrId]
    var TemplateBody: js.UndefOr[TemplateBody]
    var TemplateURL: js.UndefOr[TemplateURL]
  }

  object GetTemplateSummaryInput {
    @inline
    def apply(
        StackName: js.UndefOr[StackNameOrId] = js.undefined,
        StackSetName: js.UndefOr[StackSetNameOrId] = js.undefined,
        TemplateBody: js.UndefOr[TemplateBody] = js.undefined,
        TemplateURL: js.UndefOr[TemplateURL] = js.undefined
    ): GetTemplateSummaryInput = {
      val __obj = js.Dynamic.literal()
      StackName.foreach(__v => __obj.updateDynamic("StackName")(__v.asInstanceOf[js.Any]))
      StackSetName.foreach(__v => __obj.updateDynamic("StackSetName")(__v.asInstanceOf[js.Any]))
      TemplateBody.foreach(__v => __obj.updateDynamic("TemplateBody")(__v.asInstanceOf[js.Any]))
      TemplateURL.foreach(__v => __obj.updateDynamic("TemplateURL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTemplateSummaryInput]
    }
  }

  /**
    * The output for the <a>GetTemplateSummary</a> action.
    */
  @js.native
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

  object GetTemplateSummaryOutput {
    @inline
    def apply(
        Capabilities: js.UndefOr[Capabilities] = js.undefined,
        CapabilitiesReason: js.UndefOr[CapabilitiesReason] = js.undefined,
        DeclaredTransforms: js.UndefOr[TransformsList] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        Parameters: js.UndefOr[ParameterDeclarations] = js.undefined,
        ResourceIdentifierSummaries: js.UndefOr[ResourceIdentifierSummaries] = js.undefined,
        ResourceTypes: js.UndefOr[ResourceTypes] = js.undefined,
        Version: js.UndefOr[Version] = js.undefined
    ): GetTemplateSummaryOutput = {
      val __obj = js.Dynamic.literal()
      Capabilities.foreach(__v => __obj.updateDynamic("Capabilities")(__v.asInstanceOf[js.Any]))
      CapabilitiesReason.foreach(__v => __obj.updateDynamic("CapabilitiesReason")(__v.asInstanceOf[js.Any]))
      DeclaredTransforms.foreach(__v => __obj.updateDynamic("DeclaredTransforms")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      ResourceIdentifierSummaries.foreach(__v =>
        __obj.updateDynamic("ResourceIdentifierSummaries")(__v.asInstanceOf[js.Any])
      )
      ResourceTypes.foreach(__v => __obj.updateDynamic("ResourceTypes")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTemplateSummaryOutput]
    }
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
  trait ListChangeSetsInput extends js.Object {
    var StackName: StackNameOrId
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChangeSetsInput {
    @inline
    def apply(
        StackName: StackNameOrId,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChangeSetsInput = {
      val __obj = js.Dynamic.literal(
        "StackName" -> StackName.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChangeSetsInput]
    }
  }

  /**
    * The output for the <a>ListChangeSets</a> action.
    */
  @js.native
  trait ListChangeSetsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Summaries: js.UndefOr[ChangeSetSummaries]
  }

  object ListChangeSetsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Summaries: js.UndefOr[ChangeSetSummaries] = js.undefined
    ): ListChangeSetsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Summaries.foreach(__v => __obj.updateDynamic("Summaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChangeSetsOutput]
    }
  }

  @js.native
  trait ListExportsInput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
  }

  object ListExportsInput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListExportsInput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExportsInput]
    }
  }

  @js.native
  trait ListExportsOutput extends js.Object {
    var Exports: js.UndefOr[Exports]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListExportsOutput {
    @inline
    def apply(
        Exports: js.UndefOr[Exports] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListExportsOutput = {
      val __obj = js.Dynamic.literal()
      Exports.foreach(__v => __obj.updateDynamic("Exports")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExportsOutput]
    }
  }

  @js.native
  trait ListImportsInput extends js.Object {
    var ExportName: ExportName
    var NextToken: js.UndefOr[NextToken]
  }

  object ListImportsInput {
    @inline
    def apply(
        ExportName: ExportName,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListImportsInput = {
      val __obj = js.Dynamic.literal(
        "ExportName" -> ExportName.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImportsInput]
    }
  }

  @js.native
  trait ListImportsOutput extends js.Object {
    var Imports: js.UndefOr[Imports]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListImportsOutput {
    @inline
    def apply(
        Imports: js.UndefOr[Imports] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListImportsOutput = {
      val __obj = js.Dynamic.literal()
      Imports.foreach(__v => __obj.updateDynamic("Imports")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImportsOutput]
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
    @inline
    def apply(
        StackSetName: StackSetName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StackInstanceAccount: js.UndefOr[Account] = js.undefined,
        StackInstanceRegion: js.UndefOr[Region] = js.undefined
    ): ListStackInstancesInput = {
      val __obj = js.Dynamic.literal(
        "StackSetName" -> StackSetName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StackInstanceAccount.foreach(__v => __obj.updateDynamic("StackInstanceAccount")(__v.asInstanceOf[js.Any]))
      StackInstanceRegion.foreach(__v => __obj.updateDynamic("StackInstanceRegion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStackInstancesInput]
    }
  }

  @js.native
  trait ListStackInstancesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Summaries: js.UndefOr[StackInstanceSummaries]
  }

  object ListStackInstancesOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Summaries: js.UndefOr[StackInstanceSummaries] = js.undefined
    ): ListStackInstancesOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Summaries.foreach(__v => __obj.updateDynamic("Summaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStackInstancesOutput]
    }
  }

  /**
    * The input for the <a>ListStackResource</a> action.
    */
  @js.native
  trait ListStackResourcesInput extends js.Object {
    var StackName: StackName
    var NextToken: js.UndefOr[NextToken]
  }

  object ListStackResourcesInput {
    @inline
    def apply(
        StackName: StackName,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListStackResourcesInput = {
      val __obj = js.Dynamic.literal(
        "StackName" -> StackName.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStackResourcesInput]
    }
  }

  /**
    * The output for a <a>ListStackResources</a> action.
    */
  @js.native
  trait ListStackResourcesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StackResourceSummaries: js.UndefOr[StackResourceSummaries]
  }

  object ListStackResourcesOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StackResourceSummaries: js.UndefOr[StackResourceSummaries] = js.undefined
    ): ListStackResourcesOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StackResourceSummaries.foreach(__v => __obj.updateDynamic("StackResourceSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStackResourcesOutput]
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
    @inline
    def apply(
        OperationId: ClientRequestToken,
        StackSetName: StackSetName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListStackSetOperationResultsInput = {
      val __obj = js.Dynamic.literal(
        "OperationId"  -> OperationId.asInstanceOf[js.Any],
        "StackSetName" -> StackSetName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStackSetOperationResultsInput]
    }
  }

  @js.native
  trait ListStackSetOperationResultsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Summaries: js.UndefOr[StackSetOperationResultSummaries]
  }

  object ListStackSetOperationResultsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Summaries: js.UndefOr[StackSetOperationResultSummaries] = js.undefined
    ): ListStackSetOperationResultsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Summaries.foreach(__v => __obj.updateDynamic("Summaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStackSetOperationResultsOutput]
    }
  }

  @js.native
  trait ListStackSetOperationsInput extends js.Object {
    var StackSetName: StackSetName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListStackSetOperationsInput {
    @inline
    def apply(
        StackSetName: StackSetName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListStackSetOperationsInput = {
      val __obj = js.Dynamic.literal(
        "StackSetName" -> StackSetName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStackSetOperationsInput]
    }
  }

  @js.native
  trait ListStackSetOperationsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Summaries: js.UndefOr[StackSetOperationSummaries]
  }

  object ListStackSetOperationsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Summaries: js.UndefOr[StackSetOperationSummaries] = js.undefined
    ): ListStackSetOperationsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Summaries.foreach(__v => __obj.updateDynamic("Summaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStackSetOperationsOutput]
    }
  }

  @js.native
  trait ListStackSetsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[StackSetStatus]
  }

  object ListStackSetsInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Status: js.UndefOr[StackSetStatus] = js.undefined
    ): ListStackSetsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStackSetsInput]
    }
  }

  @js.native
  trait ListStackSetsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Summaries: js.UndefOr[StackSetSummaries]
  }

  object ListStackSetsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Summaries: js.UndefOr[StackSetSummaries] = js.undefined
    ): ListStackSetsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Summaries.foreach(__v => __obj.updateDynamic("Summaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStackSetsOutput]
    }
  }

  /**
    * The input for <a>ListStacks</a> action.
    */
  @js.native
  trait ListStacksInput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StackStatusFilter: js.UndefOr[StackStatusFilter]
  }

  object ListStacksInput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StackStatusFilter: js.UndefOr[StackStatusFilter] = js.undefined
    ): ListStacksInput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StackStatusFilter.foreach(__v => __obj.updateDynamic("StackStatusFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStacksInput]
    }
  }

  /**
    * The output for <a>ListStacks</a> action.
    */
  @js.native
  trait ListStacksOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StackSummaries: js.UndefOr[StackSummaries]
  }

  object ListStacksOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StackSummaries: js.UndefOr[StackSummaries] = js.undefined
    ): ListStacksOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StackSummaries.foreach(__v => __obj.updateDynamic("StackSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStacksOutput]
    }
  }

  @js.native
  trait ListTypeRegistrationsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var RegistrationStatusFilter: js.UndefOr[RegistrationStatus]
    var Type: js.UndefOr[RegistryType]
    var TypeArn: js.UndefOr[TypeArn]
    var TypeName: js.UndefOr[TypeName]
  }

  object ListTypeRegistrationsInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RegistrationStatusFilter: js.UndefOr[RegistrationStatus] = js.undefined,
        Type: js.UndefOr[RegistryType] = js.undefined,
        TypeArn: js.UndefOr[TypeArn] = js.undefined,
        TypeName: js.UndefOr[TypeName] = js.undefined
    ): ListTypeRegistrationsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RegistrationStatusFilter.foreach(__v => __obj.updateDynamic("RegistrationStatusFilter")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      TypeArn.foreach(__v => __obj.updateDynamic("TypeArn")(__v.asInstanceOf[js.Any]))
      TypeName.foreach(__v => __obj.updateDynamic("TypeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTypeRegistrationsInput]
    }
  }

  @js.native
  trait ListTypeRegistrationsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RegistrationTokenList: js.UndefOr[RegistrationTokenList]
  }

  object ListTypeRegistrationsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RegistrationTokenList: js.UndefOr[RegistrationTokenList] = js.undefined
    ): ListTypeRegistrationsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RegistrationTokenList.foreach(__v => __obj.updateDynamic("RegistrationTokenList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTypeRegistrationsOutput]
    }
  }

  @js.native
  trait ListTypeVersionsInput extends js.Object {
    var Arn: js.UndefOr[PrivateTypeArn]
    var DeprecatedStatus: js.UndefOr[DeprecatedStatus]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Type: js.UndefOr[RegistryType]
    var TypeName: js.UndefOr[TypeName]
  }

  object ListTypeVersionsInput {
    @inline
    def apply(
        Arn: js.UndefOr[PrivateTypeArn] = js.undefined,
        DeprecatedStatus: js.UndefOr[DeprecatedStatus] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Type: js.UndefOr[RegistryType] = js.undefined,
        TypeName: js.UndefOr[TypeName] = js.undefined
    ): ListTypeVersionsInput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      DeprecatedStatus.foreach(__v => __obj.updateDynamic("DeprecatedStatus")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      TypeName.foreach(__v => __obj.updateDynamic("TypeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTypeVersionsInput]
    }
  }

  @js.native
  trait ListTypeVersionsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TypeVersionSummaries: js.UndefOr[TypeVersionSummaries]
  }

  object ListTypeVersionsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TypeVersionSummaries: js.UndefOr[TypeVersionSummaries] = js.undefined
    ): ListTypeVersionsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TypeVersionSummaries.foreach(__v => __obj.updateDynamic("TypeVersionSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTypeVersionsOutput]
    }
  }

  @js.native
  trait ListTypesInput extends js.Object {
    var DeprecatedStatus: js.UndefOr[DeprecatedStatus]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ProvisioningType: js.UndefOr[ProvisioningType]
    var Visibility: js.UndefOr[Visibility]
  }

  object ListTypesInput {
    @inline
    def apply(
        DeprecatedStatus: js.UndefOr[DeprecatedStatus] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ProvisioningType: js.UndefOr[ProvisioningType] = js.undefined,
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): ListTypesInput = {
      val __obj = js.Dynamic.literal()
      DeprecatedStatus.foreach(__v => __obj.updateDynamic("DeprecatedStatus")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProvisioningType.foreach(__v => __obj.updateDynamic("ProvisioningType")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTypesInput]
    }
  }

  @js.native
  trait ListTypesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TypeSummaries: js.UndefOr[TypeSummaries]
  }

  object ListTypesOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TypeSummaries: js.UndefOr[TypeSummaries] = js.undefined
    ): ListTypesOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TypeSummaries.foreach(__v => __obj.updateDynamic("TypeSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTypesOutput]
    }
  }

  /**
    * Contains logging configuration information for a type.
    */
  @js.native
  trait LoggingConfig extends js.Object {
    var LogGroupName: LogGroupName
    var LogRoleArn: RoleArn
  }

  object LoggingConfig {
    @inline
    def apply(
        LogGroupName: LogGroupName,
        LogRoleArn: RoleArn
    ): LoggingConfig = {
      val __obj = js.Dynamic.literal(
        "LogGroupName" -> LogGroupName.asInstanceOf[js.Any],
        "LogRoleArn"   -> LogRoleArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[LoggingConfig]
    }
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
  trait Output extends js.Object {
    var Description: js.UndefOr[Description]
    var ExportName: js.UndefOr[ExportName]
    var OutputKey: js.UndefOr[OutputKey]
    var OutputValue: js.UndefOr[OutputValue]
  }

  object Output {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        ExportName: js.UndefOr[ExportName] = js.undefined,
        OutputKey: js.UndefOr[OutputKey] = js.undefined,
        OutputValue: js.UndefOr[OutputValue] = js.undefined
    ): Output = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ExportName.foreach(__v => __obj.updateDynamic("ExportName")(__v.asInstanceOf[js.Any]))
      OutputKey.foreach(__v => __obj.updateDynamic("OutputKey")(__v.asInstanceOf[js.Any]))
      OutputValue.foreach(__v => __obj.updateDynamic("OutputValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Output]
    }
  }

  /**
    * The Parameter data type.
    */
  @js.native
  trait Parameter extends js.Object {
    var ParameterKey: js.UndefOr[ParameterKey]
    var ParameterValue: js.UndefOr[ParameterValue]
    var ResolvedValue: js.UndefOr[ParameterValue]
    var UsePreviousValue: js.UndefOr[UsePreviousValue]
  }

  object Parameter {
    @inline
    def apply(
        ParameterKey: js.UndefOr[ParameterKey] = js.undefined,
        ParameterValue: js.UndefOr[ParameterValue] = js.undefined,
        ResolvedValue: js.UndefOr[ParameterValue] = js.undefined,
        UsePreviousValue: js.UndefOr[UsePreviousValue] = js.undefined
    ): Parameter = {
      val __obj = js.Dynamic.literal()
      ParameterKey.foreach(__v => __obj.updateDynamic("ParameterKey")(__v.asInstanceOf[js.Any]))
      ParameterValue.foreach(__v => __obj.updateDynamic("ParameterValue")(__v.asInstanceOf[js.Any]))
      ResolvedValue.foreach(__v => __obj.updateDynamic("ResolvedValue")(__v.asInstanceOf[js.Any]))
      UsePreviousValue.foreach(__v => __obj.updateDynamic("UsePreviousValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Parameter]
    }
  }

  /**
    * A set of criteria that AWS CloudFormation uses to validate parameter values. Although other constraints might be defined in the stack template, AWS CloudFormation returns only the <code>AllowedValues</code> property.
    */
  @js.native
  trait ParameterConstraints extends js.Object {
    var AllowedValues: js.UndefOr[AllowedValues]
  }

  object ParameterConstraints {
    @inline
    def apply(
        AllowedValues: js.UndefOr[AllowedValues] = js.undefined
    ): ParameterConstraints = {
      val __obj = js.Dynamic.literal()
      AllowedValues.foreach(__v => __obj.updateDynamic("AllowedValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterConstraints]
    }
  }

  /**
    * The ParameterDeclaration data type.
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
    @inline
    def apply(
        DefaultValue: js.UndefOr[ParameterValue] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        NoEcho: js.UndefOr[NoEcho] = js.undefined,
        ParameterConstraints: js.UndefOr[ParameterConstraints] = js.undefined,
        ParameterKey: js.UndefOr[ParameterKey] = js.undefined,
        ParameterType: js.UndefOr[ParameterType] = js.undefined
    ): ParameterDeclaration = {
      val __obj = js.Dynamic.literal()
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      NoEcho.foreach(__v => __obj.updateDynamic("NoEcho")(__v.asInstanceOf[js.Any]))
      ParameterConstraints.foreach(__v => __obj.updateDynamic("ParameterConstraints")(__v.asInstanceOf[js.Any]))
      ParameterKey.foreach(__v => __obj.updateDynamic("ParameterKey")(__v.asInstanceOf[js.Any]))
      ParameterType.foreach(__v => __obj.updateDynamic("ParameterType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterDeclaration]
    }
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
  trait PhysicalResourceIdContextKeyValuePair extends js.Object {
    var Key: Key
    var Value: Value
  }

  object PhysicalResourceIdContextKeyValuePair {
    @inline
    def apply(
        Key: Key,
        Value: Value
    ): PhysicalResourceIdContextKeyValuePair = {
      val __obj = js.Dynamic.literal(
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PhysicalResourceIdContextKeyValuePair]
    }
  }

  /**
    * Information about a resource property whose actual value differs from its expected value, as defined in the stack template and any values specified as template parameters. These will be present only for resources whose <code>StackResourceDriftStatus</code> is <code>MODIFIED</code>. For more information, see [[https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html|Detecting Unregulated Configuration Changes to Stacks and Resources]].
    */
  @js.native
  trait PropertyDifference extends js.Object {
    var ActualValue: PropertyValue
    var DifferenceType: DifferenceType
    var ExpectedValue: PropertyValue
    var PropertyPath: PropertyPath
  }

  object PropertyDifference {
    @inline
    def apply(
        ActualValue: PropertyValue,
        DifferenceType: DifferenceType,
        ExpectedValue: PropertyValue,
        PropertyPath: PropertyPath
    ): PropertyDifference = {
      val __obj = js.Dynamic.literal(
        "ActualValue"    -> ActualValue.asInstanceOf[js.Any],
        "DifferenceType" -> DifferenceType.asInstanceOf[js.Any],
        "ExpectedValue"  -> ExpectedValue.asInstanceOf[js.Any],
        "PropertyPath"   -> PropertyPath.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PropertyDifference]
    }
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
  trait RecordHandlerProgressInput extends js.Object {
    var BearerToken: ClientToken
    var OperationStatus: OperationStatus
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var CurrentOperationStatus: js.UndefOr[OperationStatus]
    var ErrorCode: js.UndefOr[HandlerErrorCode]
    var ResourceModel: js.UndefOr[ResourceModel]
    var StatusMessage: js.UndefOr[StatusMessage]
  }

  object RecordHandlerProgressInput {
    @inline
    def apply(
        BearerToken: ClientToken,
        OperationStatus: OperationStatus,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        CurrentOperationStatus: js.UndefOr[OperationStatus] = js.undefined,
        ErrorCode: js.UndefOr[HandlerErrorCode] = js.undefined,
        ResourceModel: js.UndefOr[ResourceModel] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined
    ): RecordHandlerProgressInput = {
      val __obj = js.Dynamic.literal(
        "BearerToken"     -> BearerToken.asInstanceOf[js.Any],
        "OperationStatus" -> OperationStatus.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      CurrentOperationStatus.foreach(__v => __obj.updateDynamic("CurrentOperationStatus")(__v.asInstanceOf[js.Any]))
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ResourceModel.foreach(__v => __obj.updateDynamic("ResourceModel")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecordHandlerProgressInput]
    }
  }

  @js.native
  trait RecordHandlerProgressOutput extends js.Object {}

  object RecordHandlerProgressOutput {
    @inline
    def apply(
    ): RecordHandlerProgressOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RecordHandlerProgressOutput]
    }
  }

  @js.native
  trait RegisterTypeInput extends js.Object {
    var SchemaHandlerPackage: S3Url
    var TypeName: TypeName
    var ClientRequestToken: js.UndefOr[RequestToken]
    var ExecutionRoleArn: js.UndefOr[RoleArn]
    var LoggingConfig: js.UndefOr[LoggingConfig]
    var Type: js.UndefOr[RegistryType]
  }

  object RegisterTypeInput {
    @inline
    def apply(
        SchemaHandlerPackage: S3Url,
        TypeName: TypeName,
        ClientRequestToken: js.UndefOr[RequestToken] = js.undefined,
        ExecutionRoleArn: js.UndefOr[RoleArn] = js.undefined,
        LoggingConfig: js.UndefOr[LoggingConfig] = js.undefined,
        Type: js.UndefOr[RegistryType] = js.undefined
    ): RegisterTypeInput = {
      val __obj = js.Dynamic.literal(
        "SchemaHandlerPackage" -> SchemaHandlerPackage.asInstanceOf[js.Any],
        "TypeName"             -> TypeName.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      ExecutionRoleArn.foreach(__v => __obj.updateDynamic("ExecutionRoleArn")(__v.asInstanceOf[js.Any]))
      LoggingConfig.foreach(__v => __obj.updateDynamic("LoggingConfig")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterTypeInput]
    }
  }

  @js.native
  trait RegisterTypeOutput extends js.Object {
    var RegistrationToken: js.UndefOr[RegistrationToken]
  }

  object RegisterTypeOutput {
    @inline
    def apply(
        RegistrationToken: js.UndefOr[RegistrationToken] = js.undefined
    ): RegisterTypeOutput = {
      val __obj = js.Dynamic.literal()
      RegistrationToken.foreach(__v => __obj.updateDynamic("RegistrationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterTypeOutput]
    }
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
    @inline
    def apply(
        Action: js.UndefOr[ChangeAction] = js.undefined,
        Details: js.UndefOr[ResourceChangeDetails] = js.undefined,
        LogicalResourceId: js.UndefOr[LogicalResourceId] = js.undefined,
        PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined,
        Replacement: js.UndefOr[Replacement] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined,
        Scope: js.UndefOr[Scope] = js.undefined
    ): ResourceChange = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      Details.foreach(__v => __obj.updateDynamic("Details")(__v.asInstanceOf[js.Any]))
      LogicalResourceId.foreach(__v => __obj.updateDynamic("LogicalResourceId")(__v.asInstanceOf[js.Any]))
      PhysicalResourceId.foreach(__v => __obj.updateDynamic("PhysicalResourceId")(__v.asInstanceOf[js.Any]))
      Replacement.foreach(__v => __obj.updateDynamic("Replacement")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      Scope.foreach(__v => __obj.updateDynamic("Scope")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceChange]
    }
  }

  /**
    * For a resource with <code>Modify</code> as the action, the <code>ResourceChange</code> structure describes the changes AWS CloudFormation will make to that resource.
    */
  @js.native
  trait ResourceChangeDetail extends js.Object {
    var CausingEntity: js.UndefOr[CausingEntity]
    var ChangeSource: js.UndefOr[ChangeSource]
    var Evaluation: js.UndefOr[EvaluationType]
    var Target: js.UndefOr[ResourceTargetDefinition]
  }

  object ResourceChangeDetail {
    @inline
    def apply(
        CausingEntity: js.UndefOr[CausingEntity] = js.undefined,
        ChangeSource: js.UndefOr[ChangeSource] = js.undefined,
        Evaluation: js.UndefOr[EvaluationType] = js.undefined,
        Target: js.UndefOr[ResourceTargetDefinition] = js.undefined
    ): ResourceChangeDetail = {
      val __obj = js.Dynamic.literal()
      CausingEntity.foreach(__v => __obj.updateDynamic("CausingEntity")(__v.asInstanceOf[js.Any]))
      ChangeSource.foreach(__v => __obj.updateDynamic("ChangeSource")(__v.asInstanceOf[js.Any]))
      Evaluation.foreach(__v => __obj.updateDynamic("Evaluation")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceChangeDetail]
    }
  }

  /**
    * Describes the target resources of a specific type in your import template (for example, all <code>AWS::S3::Bucket</code> resources) and the properties you can provide during the import to identify resources of that type.
    */
  @js.native
  trait ResourceIdentifierSummary extends js.Object {
    var LogicalResourceIds: js.UndefOr[LogicalResourceIds]
    var ResourceIdentifiers: js.UndefOr[ResourceIdentifiers]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object ResourceIdentifierSummary {
    @inline
    def apply(
        LogicalResourceIds: js.UndefOr[LogicalResourceIds] = js.undefined,
        ResourceIdentifiers: js.UndefOr[ResourceIdentifiers] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): ResourceIdentifierSummary = {
      val __obj = js.Dynamic.literal()
      LogicalResourceIds.foreach(__v => __obj.updateDynamic("LogicalResourceIds")(__v.asInstanceOf[js.Any]))
      ResourceIdentifiers.foreach(__v => __obj.updateDynamic("ResourceIdentifiers")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceIdentifierSummary]
    }
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
  trait ResourceTargetDefinition extends js.Object {
    var Attribute: js.UndefOr[ResourceAttribute]
    var Name: js.UndefOr[PropertyName]
    var RequiresRecreation: js.UndefOr[RequiresRecreation]
  }

  object ResourceTargetDefinition {
    @inline
    def apply(
        Attribute: js.UndefOr[ResourceAttribute] = js.undefined,
        Name: js.UndefOr[PropertyName] = js.undefined,
        RequiresRecreation: js.UndefOr[RequiresRecreation] = js.undefined
    ): ResourceTargetDefinition = {
      val __obj = js.Dynamic.literal()
      Attribute.foreach(__v => __obj.updateDynamic("Attribute")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RequiresRecreation.foreach(__v => __obj.updateDynamic("RequiresRecreation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceTargetDefinition]
    }
  }

  /**
    * Describes the target resource of an import operation.
    */
  @js.native
  trait ResourceToImport extends js.Object {
    var LogicalResourceId: LogicalResourceId
    var ResourceIdentifier: ResourceIdentifierProperties
    var ResourceType: ResourceType
  }

  object ResourceToImport {
    @inline
    def apply(
        LogicalResourceId: LogicalResourceId,
        ResourceIdentifier: ResourceIdentifierProperties,
        ResourceType: ResourceType
    ): ResourceToImport = {
      val __obj = js.Dynamic.literal(
        "LogicalResourceId"  -> LogicalResourceId.asInstanceOf[js.Any],
        "ResourceIdentifier" -> ResourceIdentifier.asInstanceOf[js.Any],
        "ResourceType"       -> ResourceType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResourceToImport]
    }
  }

  /**
    * Structure containing the rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for the specified monitoring period afterwards.
    *  Rollback triggers enable you to have AWS CloudFormation monitor the state of your application during stack creation and updating, and to roll back that operation if the application breaches the threshold of any of the alarms you've specified. For more information, see [[http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-rollback-triggers.html|Monitor and Roll Back Stack Operations]].
    */
  @js.native
  trait RollbackConfiguration extends js.Object {
    var MonitoringTimeInMinutes: js.UndefOr[MonitoringTimeInMinutes]
    var RollbackTriggers: js.UndefOr[RollbackTriggers]
  }

  object RollbackConfiguration {
    @inline
    def apply(
        MonitoringTimeInMinutes: js.UndefOr[MonitoringTimeInMinutes] = js.undefined,
        RollbackTriggers: js.UndefOr[RollbackTriggers] = js.undefined
    ): RollbackConfiguration = {
      val __obj = js.Dynamic.literal()
      MonitoringTimeInMinutes.foreach(__v => __obj.updateDynamic("MonitoringTimeInMinutes")(__v.asInstanceOf[js.Any]))
      RollbackTriggers.foreach(__v => __obj.updateDynamic("RollbackTriggers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RollbackConfiguration]
    }
  }

  /**
    * A rollback trigger AWS CloudFormation monitors during creation and updating of stacks. If any of the alarms you specify goes to ALARM state during the stack operation or within the specified monitoring period afterwards, CloudFormation rolls back the entire stack operation.
    */
  @js.native
  trait RollbackTrigger extends js.Object {
    var Arn: Arn
    var Type: Type
  }

  object RollbackTrigger {
    @inline
    def apply(
        Arn: Arn,
        Type: Type
    ): RollbackTrigger = {
      val __obj = js.Dynamic.literal(
        "Arn"  -> Arn.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RollbackTrigger]
    }
  }

  /**
    * The input for the <a>SetStackPolicy</a> action.
    */
  @js.native
  trait SetStackPolicyInput extends js.Object {
    var StackName: StackName
    var StackPolicyBody: js.UndefOr[StackPolicyBody]
    var StackPolicyURL: js.UndefOr[StackPolicyURL]
  }

  object SetStackPolicyInput {
    @inline
    def apply(
        StackName: StackName,
        StackPolicyBody: js.UndefOr[StackPolicyBody] = js.undefined,
        StackPolicyURL: js.UndefOr[StackPolicyURL] = js.undefined
    ): SetStackPolicyInput = {
      val __obj = js.Dynamic.literal(
        "StackName" -> StackName.asInstanceOf[js.Any]
      )

      StackPolicyBody.foreach(__v => __obj.updateDynamic("StackPolicyBody")(__v.asInstanceOf[js.Any]))
      StackPolicyURL.foreach(__v => __obj.updateDynamic("StackPolicyURL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetStackPolicyInput]
    }
  }

  @js.native
  trait SetTypeDefaultVersionInput extends js.Object {
    var Arn: js.UndefOr[PrivateTypeArn]
    var Type: js.UndefOr[RegistryType]
    var TypeName: js.UndefOr[TypeName]
    var VersionId: js.UndefOr[TypeVersionId]
  }

  object SetTypeDefaultVersionInput {
    @inline
    def apply(
        Arn: js.UndefOr[PrivateTypeArn] = js.undefined,
        Type: js.UndefOr[RegistryType] = js.undefined,
        TypeName: js.UndefOr[TypeName] = js.undefined,
        VersionId: js.UndefOr[TypeVersionId] = js.undefined
    ): SetTypeDefaultVersionInput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      TypeName.foreach(__v => __obj.updateDynamic("TypeName")(__v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetTypeDefaultVersionInput]
    }
  }

  @js.native
  trait SetTypeDefaultVersionOutput extends js.Object {}

  object SetTypeDefaultVersionOutput {
    @inline
    def apply(
    ): SetTypeDefaultVersionOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[SetTypeDefaultVersionOutput]
    }
  }

  /**
    * The input for the <a>SignalResource</a> action.
    */
  @js.native
  trait SignalResourceInput extends js.Object {
    var LogicalResourceId: LogicalResourceId
    var StackName: StackNameOrId
    var Status: ResourceSignalStatus
    var UniqueId: ResourceSignalUniqueId
  }

  object SignalResourceInput {
    @inline
    def apply(
        LogicalResourceId: LogicalResourceId,
        StackName: StackNameOrId,
        Status: ResourceSignalStatus,
        UniqueId: ResourceSignalUniqueId
    ): SignalResourceInput = {
      val __obj = js.Dynamic.literal(
        "LogicalResourceId" -> LogicalResourceId.asInstanceOf[js.Any],
        "StackName"         -> StackName.asInstanceOf[js.Any],
        "Status"            -> Status.asInstanceOf[js.Any],
        "UniqueId"          -> UniqueId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SignalResourceInput]
    }
  }

  /**
    * The Stack data type.
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
    @inline
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
        TimeoutInMinutes: js.UndefOr[TimeoutMinutes] = js.undefined
    ): Stack = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "StackName"    -> StackName.asInstanceOf[js.Any],
        "StackStatus"  -> StackStatus.asInstanceOf[js.Any]
      )

      Capabilities.foreach(__v => __obj.updateDynamic("Capabilities")(__v.asInstanceOf[js.Any]))
      ChangeSetId.foreach(__v => __obj.updateDynamic("ChangeSetId")(__v.asInstanceOf[js.Any]))
      DeletionTime.foreach(__v => __obj.updateDynamic("DeletionTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisableRollback.foreach(__v => __obj.updateDynamic("DisableRollback")(__v.asInstanceOf[js.Any]))
      DriftInformation.foreach(__v => __obj.updateDynamic("DriftInformation")(__v.asInstanceOf[js.Any]))
      EnableTerminationProtection.foreach(__v =>
        __obj.updateDynamic("EnableTerminationProtection")(__v.asInstanceOf[js.Any])
      )
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      NotificationARNs.foreach(__v => __obj.updateDynamic("NotificationARNs")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      ParentId.foreach(__v => __obj.updateDynamic("ParentId")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      RollbackConfiguration.foreach(__v => __obj.updateDynamic("RollbackConfiguration")(__v.asInstanceOf[js.Any]))
      RootId.foreach(__v => __obj.updateDynamic("RootId")(__v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.updateDynamic("StackId")(__v.asInstanceOf[js.Any]))
      StackStatusReason.foreach(__v => __obj.updateDynamic("StackStatusReason")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TimeoutInMinutes.foreach(__v => __obj.updateDynamic("TimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Stack]
    }
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
  trait StackDriftInformation extends js.Object {
    var StackDriftStatus: StackDriftStatus
    var LastCheckTimestamp: js.UndefOr[Timestamp]
  }

  object StackDriftInformation {
    @inline
    def apply(
        StackDriftStatus: StackDriftStatus,
        LastCheckTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): StackDriftInformation = {
      val __obj = js.Dynamic.literal(
        "StackDriftStatus" -> StackDriftStatus.asInstanceOf[js.Any]
      )

      LastCheckTimestamp.foreach(__v => __obj.updateDynamic("LastCheckTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackDriftInformation]
    }
  }

  /**
    * Contains information about whether the stack's actual configuration differs, or has <i>drifted</i>, from its expected configuration, as defined in the stack template and any values specified as template parameters. A stack is considered to have drifted if one or more of its resources have drifted.
    */
  @js.native
  trait StackDriftInformationSummary extends js.Object {
    var StackDriftStatus: StackDriftStatus
    var LastCheckTimestamp: js.UndefOr[Timestamp]
  }

  object StackDriftInformationSummary {
    @inline
    def apply(
        StackDriftStatus: StackDriftStatus,
        LastCheckTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): StackDriftInformationSummary = {
      val __obj = js.Dynamic.literal(
        "StackDriftStatus" -> StackDriftStatus.asInstanceOf[js.Any]
      )

      LastCheckTimestamp.foreach(__v => __obj.updateDynamic("LastCheckTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackDriftInformationSummary]
    }
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
    @inline
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
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): StackEvent = {
      val __obj = js.Dynamic.literal(
        "EventId"   -> EventId.asInstanceOf[js.Any],
        "StackId"   -> StackId.asInstanceOf[js.Any],
        "StackName" -> StackName.asInstanceOf[js.Any],
        "Timestamp" -> Timestamp.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      LogicalResourceId.foreach(__v => __obj.updateDynamic("LogicalResourceId")(__v.asInstanceOf[js.Any]))
      PhysicalResourceId.foreach(__v => __obj.updateDynamic("PhysicalResourceId")(__v.asInstanceOf[js.Any]))
      ResourceProperties.foreach(__v => __obj.updateDynamic("ResourceProperties")(__v.asInstanceOf[js.Any]))
      ResourceStatus.foreach(__v => __obj.updateDynamic("ResourceStatus")(__v.asInstanceOf[js.Any]))
      ResourceStatusReason.foreach(__v => __obj.updateDynamic("ResourceStatusReason")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackEvent]
    }
  }

  /**
    * An AWS CloudFormation stack, in a specific account and region, that's part of a stack set operation. A stack instance is a reference to an attempted or actual stack in a given account within a given region. A stack instance can exist without a stack—for example, if the stack couldn't be created for some reason. A stack instance is associated with only one stack set. Each stack instance contains the ID of its associated stack set, as well as the ID of the actual stack and the stack status.
    */
  @js.native
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

  object StackInstance {
    @inline
    def apply(
        Account: js.UndefOr[Account] = js.undefined,
        DriftStatus: js.UndefOr[StackDriftStatus] = js.undefined,
        LastDriftCheckTimestamp: js.UndefOr[Timestamp] = js.undefined,
        OrganizationalUnitId: js.UndefOr[OrganizationalUnitId] = js.undefined,
        ParameterOverrides: js.UndefOr[Parameters] = js.undefined,
        Region: js.UndefOr[Region] = js.undefined,
        StackId: js.UndefOr[StackId] = js.undefined,
        StackSetId: js.UndefOr[StackSetId] = js.undefined,
        Status: js.UndefOr[StackInstanceStatus] = js.undefined,
        StatusReason: js.UndefOr[Reason] = js.undefined
    ): StackInstance = {
      val __obj = js.Dynamic.literal()
      Account.foreach(__v => __obj.updateDynamic("Account")(__v.asInstanceOf[js.Any]))
      DriftStatus.foreach(__v => __obj.updateDynamic("DriftStatus")(__v.asInstanceOf[js.Any]))
      LastDriftCheckTimestamp.foreach(__v => __obj.updateDynamic("LastDriftCheckTimestamp")(__v.asInstanceOf[js.Any]))
      OrganizationalUnitId.foreach(__v => __obj.updateDynamic("OrganizationalUnitId")(__v.asInstanceOf[js.Any]))
      ParameterOverrides.foreach(__v => __obj.updateDynamic("ParameterOverrides")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.updateDynamic("StackId")(__v.asInstanceOf[js.Any]))
      StackSetId.foreach(__v => __obj.updateDynamic("StackSetId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusReason.foreach(__v => __obj.updateDynamic("StatusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackInstance]
    }
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

  object StackInstanceSummary {
    @inline
    def apply(
        Account: js.UndefOr[Account] = js.undefined,
        DriftStatus: js.UndefOr[StackDriftStatus] = js.undefined,
        LastDriftCheckTimestamp: js.UndefOr[Timestamp] = js.undefined,
        OrganizationalUnitId: js.UndefOr[OrganizationalUnitId] = js.undefined,
        Region: js.UndefOr[Region] = js.undefined,
        StackId: js.UndefOr[StackId] = js.undefined,
        StackSetId: js.UndefOr[StackSetId] = js.undefined,
        Status: js.UndefOr[StackInstanceStatus] = js.undefined,
        StatusReason: js.UndefOr[Reason] = js.undefined
    ): StackInstanceSummary = {
      val __obj = js.Dynamic.literal()
      Account.foreach(__v => __obj.updateDynamic("Account")(__v.asInstanceOf[js.Any]))
      DriftStatus.foreach(__v => __obj.updateDynamic("DriftStatus")(__v.asInstanceOf[js.Any]))
      LastDriftCheckTimestamp.foreach(__v => __obj.updateDynamic("LastDriftCheckTimestamp")(__v.asInstanceOf[js.Any]))
      OrganizationalUnitId.foreach(__v => __obj.updateDynamic("OrganizationalUnitId")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.updateDynamic("StackId")(__v.asInstanceOf[js.Any]))
      StackSetId.foreach(__v => __obj.updateDynamic("StackSetId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusReason.foreach(__v => __obj.updateDynamic("StatusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackInstanceSummary]
    }
  }

  /**
    * The StackResource data type.
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
    @inline
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
        StackName: js.UndefOr[StackName] = js.undefined
    ): StackResource = {
      val __obj = js.Dynamic.literal(
        "LogicalResourceId" -> LogicalResourceId.asInstanceOf[js.Any],
        "ResourceStatus"    -> ResourceStatus.asInstanceOf[js.Any],
        "ResourceType"      -> ResourceType.asInstanceOf[js.Any],
        "Timestamp"         -> Timestamp.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DriftInformation.foreach(__v => __obj.updateDynamic("DriftInformation")(__v.asInstanceOf[js.Any]))
      PhysicalResourceId.foreach(__v => __obj.updateDynamic("PhysicalResourceId")(__v.asInstanceOf[js.Any]))
      ResourceStatusReason.foreach(__v => __obj.updateDynamic("ResourceStatusReason")(__v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.updateDynamic("StackId")(__v.asInstanceOf[js.Any]))
      StackName.foreach(__v => __obj.updateDynamic("StackName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackResource]
    }
  }

  /**
    * Contains detailed information about the specified stack resource.
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
    @inline
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
        StackName: js.UndefOr[StackName] = js.undefined
    ): StackResourceDetail = {
      val __obj = js.Dynamic.literal(
        "LastUpdatedTimestamp" -> LastUpdatedTimestamp.asInstanceOf[js.Any],
        "LogicalResourceId"    -> LogicalResourceId.asInstanceOf[js.Any],
        "ResourceStatus"       -> ResourceStatus.asInstanceOf[js.Any],
        "ResourceType"         -> ResourceType.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DriftInformation.foreach(__v => __obj.updateDynamic("DriftInformation")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      PhysicalResourceId.foreach(__v => __obj.updateDynamic("PhysicalResourceId")(__v.asInstanceOf[js.Any]))
      ResourceStatusReason.foreach(__v => __obj.updateDynamic("ResourceStatusReason")(__v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.updateDynamic("StackId")(__v.asInstanceOf[js.Any]))
      StackName.foreach(__v => __obj.updateDynamic("StackName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackResourceDetail]
    }
  }

  /**
    * Contains the drift information for a resource that has been checked for drift. This includes actual and expected property values for resources in which AWS CloudFormation has detected drift. Only resource properties explicitly defined in the stack template are checked for drift. For more information, see [[https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html|Detecting Unregulated Configuration Changes to Stacks and Resources]].
    *  Resources that do not currently support drift detection cannot be checked. For a list of resources that support drift detection, see [[http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html|Resources that Support Drift Detection]].
    *  Use <a>DetectStackResourceDrift</a> to detect drift on individual resources, or <a>DetectStackDrift</a> to detect drift on all resources in a given stack that support drift detection.
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
    @inline
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
        PropertyDifferences: js.UndefOr[PropertyDifferences] = js.undefined
    ): StackResourceDrift = {
      val __obj = js.Dynamic.literal(
        "LogicalResourceId"        -> LogicalResourceId.asInstanceOf[js.Any],
        "ResourceType"             -> ResourceType.asInstanceOf[js.Any],
        "StackId"                  -> StackId.asInstanceOf[js.Any],
        "StackResourceDriftStatus" -> StackResourceDriftStatus.asInstanceOf[js.Any],
        "Timestamp"                -> Timestamp.asInstanceOf[js.Any]
      )

      ActualProperties.foreach(__v => __obj.updateDynamic("ActualProperties")(__v.asInstanceOf[js.Any]))
      ExpectedProperties.foreach(__v => __obj.updateDynamic("ExpectedProperties")(__v.asInstanceOf[js.Any]))
      PhysicalResourceId.foreach(__v => __obj.updateDynamic("PhysicalResourceId")(__v.asInstanceOf[js.Any]))
      PhysicalResourceIdContext.foreach(__v =>
        __obj.updateDynamic("PhysicalResourceIdContext")(__v.asInstanceOf[js.Any])
      )
      PropertyDifferences.foreach(__v => __obj.updateDynamic("PropertyDifferences")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackResourceDrift]
    }
  }

  /**
    * Contains information about whether the resource's actual configuration differs, or has <i>drifted</i>, from its expected configuration.
    */
  @js.native
  trait StackResourceDriftInformation extends js.Object {
    var StackResourceDriftStatus: StackResourceDriftStatus
    var LastCheckTimestamp: js.UndefOr[Timestamp]
  }

  object StackResourceDriftInformation {
    @inline
    def apply(
        StackResourceDriftStatus: StackResourceDriftStatus,
        LastCheckTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): StackResourceDriftInformation = {
      val __obj = js.Dynamic.literal(
        "StackResourceDriftStatus" -> StackResourceDriftStatus.asInstanceOf[js.Any]
      )

      LastCheckTimestamp.foreach(__v => __obj.updateDynamic("LastCheckTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackResourceDriftInformation]
    }
  }

  /**
    * Summarizes information about whether the resource's actual configuration differs, or has <i>drifted</i>, from its expected configuration.
    */
  @js.native
  trait StackResourceDriftInformationSummary extends js.Object {
    var StackResourceDriftStatus: StackResourceDriftStatus
    var LastCheckTimestamp: js.UndefOr[Timestamp]
  }

  object StackResourceDriftInformationSummary {
    @inline
    def apply(
        StackResourceDriftStatus: StackResourceDriftStatus,
        LastCheckTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): StackResourceDriftInformationSummary = {
      val __obj = js.Dynamic.literal(
        "StackResourceDriftStatus" -> StackResourceDriftStatus.asInstanceOf[js.Any]
      )

      LastCheckTimestamp.foreach(__v => __obj.updateDynamic("LastCheckTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackResourceDriftInformationSummary]
    }
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
    @inline
    def apply(
        LastUpdatedTimestamp: Timestamp,
        LogicalResourceId: LogicalResourceId,
        ResourceStatus: ResourceStatus,
        ResourceType: ResourceType,
        DriftInformation: js.UndefOr[StackResourceDriftInformationSummary] = js.undefined,
        PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined,
        ResourceStatusReason: js.UndefOr[ResourceStatusReason] = js.undefined
    ): StackResourceSummary = {
      val __obj = js.Dynamic.literal(
        "LastUpdatedTimestamp" -> LastUpdatedTimestamp.asInstanceOf[js.Any],
        "LogicalResourceId"    -> LogicalResourceId.asInstanceOf[js.Any],
        "ResourceStatus"       -> ResourceStatus.asInstanceOf[js.Any],
        "ResourceType"         -> ResourceType.asInstanceOf[js.Any]
      )

      DriftInformation.foreach(__v => __obj.updateDynamic("DriftInformation")(__v.asInstanceOf[js.Any]))
      PhysicalResourceId.foreach(__v => __obj.updateDynamic("PhysicalResourceId")(__v.asInstanceOf[js.Any]))
      ResourceStatusReason.foreach(__v => __obj.updateDynamic("ResourceStatusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackResourceSummary]
    }
  }

  /**
    * A structure that contains information about a stack set. A stack set enables you to provision stacks into AWS accounts and across regions by using a single CloudFormation template. In the stack set, you specify the template to use, as well as any parameters and capabilities that the template requires.
    */
  @js.native
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

  object StackSet {
    @inline
    def apply(
        AdministrationRoleARN: js.UndefOr[RoleARN] = js.undefined,
        AutoDeployment: js.UndefOr[AutoDeployment] = js.undefined,
        Capabilities: js.UndefOr[Capabilities] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        ExecutionRoleName: js.UndefOr[ExecutionRoleName] = js.undefined,
        OrganizationalUnitIds: js.UndefOr[OrganizationalUnitIdList] = js.undefined,
        Parameters: js.UndefOr[Parameters] = js.undefined,
        PermissionModel: js.UndefOr[PermissionModels] = js.undefined,
        StackSetARN: js.UndefOr[StackSetARN] = js.undefined,
        StackSetDriftDetectionDetails: js.UndefOr[StackSetDriftDetectionDetails] = js.undefined,
        StackSetId: js.UndefOr[StackSetId] = js.undefined,
        StackSetName: js.UndefOr[StackSetName] = js.undefined,
        Status: js.UndefOr[StackSetStatus] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        TemplateBody: js.UndefOr[TemplateBody] = js.undefined
    ): StackSet = {
      val __obj = js.Dynamic.literal()
      AdministrationRoleARN.foreach(__v => __obj.updateDynamic("AdministrationRoleARN")(__v.asInstanceOf[js.Any]))
      AutoDeployment.foreach(__v => __obj.updateDynamic("AutoDeployment")(__v.asInstanceOf[js.Any]))
      Capabilities.foreach(__v => __obj.updateDynamic("Capabilities")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ExecutionRoleName.foreach(__v => __obj.updateDynamic("ExecutionRoleName")(__v.asInstanceOf[js.Any]))
      OrganizationalUnitIds.foreach(__v => __obj.updateDynamic("OrganizationalUnitIds")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      PermissionModel.foreach(__v => __obj.updateDynamic("PermissionModel")(__v.asInstanceOf[js.Any]))
      StackSetARN.foreach(__v => __obj.updateDynamic("StackSetARN")(__v.asInstanceOf[js.Any]))
      StackSetDriftDetectionDetails.foreach(__v =>
        __obj.updateDynamic("StackSetDriftDetectionDetails")(__v.asInstanceOf[js.Any])
      )
      StackSetId.foreach(__v => __obj.updateDynamic("StackSetId")(__v.asInstanceOf[js.Any]))
      StackSetName.foreach(__v => __obj.updateDynamic("StackSetName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TemplateBody.foreach(__v => __obj.updateDynamic("TemplateBody")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackSet]
    }
  }

  /**
    * Detailed information about the drift status of the stack set.
    *  For stack sets, contains information about the last <i>completed</i> drift operation performed on the stack set. Information about drift operations in-progress is not included.
    *  For stack set operations, includes information about drift operations currently being performed on the stack set.
    *  For more information, see [[https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-drift.html|Detecting Unmanaged Changes in Stack Sets]] in the <i>AWS CloudFormation User Guide</i>.
    */
  @js.native
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

  object StackSetDriftDetectionDetails {
    @inline
    def apply(
        DriftDetectionStatus: js.UndefOr[StackSetDriftDetectionStatus] = js.undefined,
        DriftStatus: js.UndefOr[StackSetDriftStatus] = js.undefined,
        DriftedStackInstancesCount: js.UndefOr[DriftedStackInstancesCount] = js.undefined,
        FailedStackInstancesCount: js.UndefOr[FailedStackInstancesCount] = js.undefined,
        InProgressStackInstancesCount: js.UndefOr[InProgressStackInstancesCount] = js.undefined,
        InSyncStackInstancesCount: js.UndefOr[InSyncStackInstancesCount] = js.undefined,
        LastDriftCheckTimestamp: js.UndefOr[Timestamp] = js.undefined,
        TotalStackInstancesCount: js.UndefOr[TotalStackInstancesCount] = js.undefined
    ): StackSetDriftDetectionDetails = {
      val __obj = js.Dynamic.literal()
      DriftDetectionStatus.foreach(__v => __obj.updateDynamic("DriftDetectionStatus")(__v.asInstanceOf[js.Any]))
      DriftStatus.foreach(__v => __obj.updateDynamic("DriftStatus")(__v.asInstanceOf[js.Any]))
      DriftedStackInstancesCount.foreach(__v =>
        __obj.updateDynamic("DriftedStackInstancesCount")(__v.asInstanceOf[js.Any])
      )
      FailedStackInstancesCount.foreach(__v =>
        __obj.updateDynamic("FailedStackInstancesCount")(__v.asInstanceOf[js.Any])
      )
      InProgressStackInstancesCount.foreach(__v =>
        __obj.updateDynamic("InProgressStackInstancesCount")(__v.asInstanceOf[js.Any])
      )
      InSyncStackInstancesCount.foreach(__v =>
        __obj.updateDynamic("InSyncStackInstancesCount")(__v.asInstanceOf[js.Any])
      )
      LastDriftCheckTimestamp.foreach(__v => __obj.updateDynamic("LastDriftCheckTimestamp")(__v.asInstanceOf[js.Any]))
      TotalStackInstancesCount.foreach(__v => __obj.updateDynamic("TotalStackInstancesCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackSetDriftDetectionDetails]
    }
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

  object StackSetOperation {
    @inline
    def apply(
        Action: js.UndefOr[StackSetOperationAction] = js.undefined,
        AdministrationRoleARN: js.UndefOr[RoleARN] = js.undefined,
        CreationTimestamp: js.UndefOr[Timestamp] = js.undefined,
        DeploymentTargets: js.UndefOr[DeploymentTargets] = js.undefined,
        EndTimestamp: js.UndefOr[Timestamp] = js.undefined,
        ExecutionRoleName: js.UndefOr[ExecutionRoleName] = js.undefined,
        OperationId: js.UndefOr[ClientRequestToken] = js.undefined,
        OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.undefined,
        RetainStacks: js.UndefOr[RetainStacksNullable] = js.undefined,
        StackSetDriftDetectionDetails: js.UndefOr[StackSetDriftDetectionDetails] = js.undefined,
        StackSetId: js.UndefOr[StackSetId] = js.undefined,
        Status: js.UndefOr[StackSetOperationStatus] = js.undefined
    ): StackSetOperation = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      AdministrationRoleARN.foreach(__v => __obj.updateDynamic("AdministrationRoleARN")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      DeploymentTargets.foreach(__v => __obj.updateDynamic("DeploymentTargets")(__v.asInstanceOf[js.Any]))
      EndTimestamp.foreach(__v => __obj.updateDynamic("EndTimestamp")(__v.asInstanceOf[js.Any]))
      ExecutionRoleName.foreach(__v => __obj.updateDynamic("ExecutionRoleName")(__v.asInstanceOf[js.Any]))
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      OperationPreferences.foreach(__v => __obj.updateDynamic("OperationPreferences")(__v.asInstanceOf[js.Any]))
      RetainStacks.foreach(__v => __obj.updateDynamic("RetainStacks")(__v.asInstanceOf[js.Any]))
      StackSetDriftDetectionDetails.foreach(__v =>
        __obj.updateDynamic("StackSetDriftDetectionDetails")(__v.asInstanceOf[js.Any])
      )
      StackSetId.foreach(__v => __obj.updateDynamic("StackSetId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackSetOperation]
    }
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
  trait StackSetOperationPreferences extends js.Object {
    var FailureToleranceCount: js.UndefOr[FailureToleranceCount]
    var FailureTolerancePercentage: js.UndefOr[FailureTolerancePercentage]
    var MaxConcurrentCount: js.UndefOr[MaxConcurrentCount]
    var MaxConcurrentPercentage: js.UndefOr[MaxConcurrentPercentage]
    var RegionOrder: js.UndefOr[RegionList]
  }

  object StackSetOperationPreferences {
    @inline
    def apply(
        FailureToleranceCount: js.UndefOr[FailureToleranceCount] = js.undefined,
        FailureTolerancePercentage: js.UndefOr[FailureTolerancePercentage] = js.undefined,
        MaxConcurrentCount: js.UndefOr[MaxConcurrentCount] = js.undefined,
        MaxConcurrentPercentage: js.UndefOr[MaxConcurrentPercentage] = js.undefined,
        RegionOrder: js.UndefOr[RegionList] = js.undefined
    ): StackSetOperationPreferences = {
      val __obj = js.Dynamic.literal()
      FailureToleranceCount.foreach(__v => __obj.updateDynamic("FailureToleranceCount")(__v.asInstanceOf[js.Any]))
      FailureTolerancePercentage.foreach(__v =>
        __obj.updateDynamic("FailureTolerancePercentage")(__v.asInstanceOf[js.Any])
      )
      MaxConcurrentCount.foreach(__v => __obj.updateDynamic("MaxConcurrentCount")(__v.asInstanceOf[js.Any]))
      MaxConcurrentPercentage.foreach(__v => __obj.updateDynamic("MaxConcurrentPercentage")(__v.asInstanceOf[js.Any]))
      RegionOrder.foreach(__v => __obj.updateDynamic("RegionOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackSetOperationPreferences]
    }
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
  trait StackSetOperationResultSummary extends js.Object {
    var Account: js.UndefOr[Account]
    var AccountGateResult: js.UndefOr[AccountGateResult]
    var OrganizationalUnitId: js.UndefOr[OrganizationalUnitId]
    var Region: js.UndefOr[Region]
    var Status: js.UndefOr[StackSetOperationResultStatus]
    var StatusReason: js.UndefOr[Reason]
  }

  object StackSetOperationResultSummary {
    @inline
    def apply(
        Account: js.UndefOr[Account] = js.undefined,
        AccountGateResult: js.UndefOr[AccountGateResult] = js.undefined,
        OrganizationalUnitId: js.UndefOr[OrganizationalUnitId] = js.undefined,
        Region: js.UndefOr[Region] = js.undefined,
        Status: js.UndefOr[StackSetOperationResultStatus] = js.undefined,
        StatusReason: js.UndefOr[Reason] = js.undefined
    ): StackSetOperationResultSummary = {
      val __obj = js.Dynamic.literal()
      Account.foreach(__v => __obj.updateDynamic("Account")(__v.asInstanceOf[js.Any]))
      AccountGateResult.foreach(__v => __obj.updateDynamic("AccountGateResult")(__v.asInstanceOf[js.Any]))
      OrganizationalUnitId.foreach(__v => __obj.updateDynamic("OrganizationalUnitId")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusReason.foreach(__v => __obj.updateDynamic("StatusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackSetOperationResultSummary]
    }
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
  trait StackSetOperationSummary extends js.Object {
    var Action: js.UndefOr[StackSetOperationAction]
    var CreationTimestamp: js.UndefOr[Timestamp]
    var EndTimestamp: js.UndefOr[Timestamp]
    var OperationId: js.UndefOr[ClientRequestToken]
    var Status: js.UndefOr[StackSetOperationStatus]
  }

  object StackSetOperationSummary {
    @inline
    def apply(
        Action: js.UndefOr[StackSetOperationAction] = js.undefined,
        CreationTimestamp: js.UndefOr[Timestamp] = js.undefined,
        EndTimestamp: js.UndefOr[Timestamp] = js.undefined,
        OperationId: js.UndefOr[ClientRequestToken] = js.undefined,
        Status: js.UndefOr[StackSetOperationStatus] = js.undefined
    ): StackSetOperationSummary = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      EndTimestamp.foreach(__v => __obj.updateDynamic("EndTimestamp")(__v.asInstanceOf[js.Any]))
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackSetOperationSummary]
    }
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

  object StackSetSummary {
    @inline
    def apply(
        AutoDeployment: js.UndefOr[AutoDeployment] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        DriftStatus: js.UndefOr[StackDriftStatus] = js.undefined,
        LastDriftCheckTimestamp: js.UndefOr[Timestamp] = js.undefined,
        PermissionModel: js.UndefOr[PermissionModels] = js.undefined,
        StackSetId: js.UndefOr[StackSetId] = js.undefined,
        StackSetName: js.UndefOr[StackSetName] = js.undefined,
        Status: js.UndefOr[StackSetStatus] = js.undefined
    ): StackSetSummary = {
      val __obj = js.Dynamic.literal()
      AutoDeployment.foreach(__v => __obj.updateDynamic("AutoDeployment")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DriftStatus.foreach(__v => __obj.updateDynamic("DriftStatus")(__v.asInstanceOf[js.Any]))
      LastDriftCheckTimestamp.foreach(__v => __obj.updateDynamic("LastDriftCheckTimestamp")(__v.asInstanceOf[js.Any]))
      PermissionModel.foreach(__v => __obj.updateDynamic("PermissionModel")(__v.asInstanceOf[js.Any]))
      StackSetId.foreach(__v => __obj.updateDynamic("StackSetId")(__v.asInstanceOf[js.Any]))
      StackSetName.foreach(__v => __obj.updateDynamic("StackSetName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackSetSummary]
    }
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
    @inline
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
        TemplateDescription: js.UndefOr[TemplateDescription] = js.undefined
    ): StackSummary = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "StackName"    -> StackName.asInstanceOf[js.Any],
        "StackStatus"  -> StackStatus.asInstanceOf[js.Any]
      )

      DeletionTime.foreach(__v => __obj.updateDynamic("DeletionTime")(__v.asInstanceOf[js.Any]))
      DriftInformation.foreach(__v => __obj.updateDynamic("DriftInformation")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      ParentId.foreach(__v => __obj.updateDynamic("ParentId")(__v.asInstanceOf[js.Any]))
      RootId.foreach(__v => __obj.updateDynamic("RootId")(__v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.updateDynamic("StackId")(__v.asInstanceOf[js.Any]))
      StackStatusReason.foreach(__v => __obj.updateDynamic("StackStatusReason")(__v.asInstanceOf[js.Any]))
      TemplateDescription.foreach(__v => __obj.updateDynamic("TemplateDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackSummary]
    }
  }

  @js.native
  trait StopStackSetOperationInput extends js.Object {
    var OperationId: ClientRequestToken
    var StackSetName: StackSetName
  }

  object StopStackSetOperationInput {
    @inline
    def apply(
        OperationId: ClientRequestToken,
        StackSetName: StackSetName
    ): StopStackSetOperationInput = {
      val __obj = js.Dynamic.literal(
        "OperationId"  -> OperationId.asInstanceOf[js.Any],
        "StackSetName" -> StackSetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopStackSetOperationInput]
    }
  }

  @js.native
  trait StopStackSetOperationOutput extends js.Object {}

  object StopStackSetOperationOutput {
    @inline
    def apply(
    ): StopStackSetOperationOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[StopStackSetOperationOutput]
    }
  }

  /**
    * The Tag type enables you to specify a key-value pair that can be used to store information about an AWS CloudFormation stack.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  /**
    * The TemplateParameter data type.
    */
  @js.native
  trait TemplateParameter extends js.Object {
    var DefaultValue: js.UndefOr[ParameterValue]
    var Description: js.UndefOr[Description]
    var NoEcho: js.UndefOr[NoEcho]
    var ParameterKey: js.UndefOr[ParameterKey]
  }

  object TemplateParameter {
    @inline
    def apply(
        DefaultValue: js.UndefOr[ParameterValue] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        NoEcho: js.UndefOr[NoEcho] = js.undefined,
        ParameterKey: js.UndefOr[ParameterKey] = js.undefined
    ): TemplateParameter = {
      val __obj = js.Dynamic.literal()
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      NoEcho.foreach(__v => __obj.updateDynamic("NoEcho")(__v.asInstanceOf[js.Any]))
      ParameterKey.foreach(__v => __obj.updateDynamic("ParameterKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplateParameter]
    }
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
  trait TypeSummary extends js.Object {
    var DefaultVersionId: js.UndefOr[TypeVersionId]
    var Description: js.UndefOr[Description]
    var LastUpdated: js.UndefOr[Timestamp]
    var Type: js.UndefOr[RegistryType]
    var TypeArn: js.UndefOr[TypeArn]
    var TypeName: js.UndefOr[TypeName]
  }

  object TypeSummary {
    @inline
    def apply(
        DefaultVersionId: js.UndefOr[TypeVersionId] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        LastUpdated: js.UndefOr[Timestamp] = js.undefined,
        Type: js.UndefOr[RegistryType] = js.undefined,
        TypeArn: js.UndefOr[TypeArn] = js.undefined,
        TypeName: js.UndefOr[TypeName] = js.undefined
    ): TypeSummary = {
      val __obj = js.Dynamic.literal()
      DefaultVersionId.foreach(__v => __obj.updateDynamic("DefaultVersionId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      TypeArn.foreach(__v => __obj.updateDynamic("TypeArn")(__v.asInstanceOf[js.Any]))
      TypeName.foreach(__v => __obj.updateDynamic("TypeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TypeSummary]
    }
  }

  /**
    * Contains summary information about a specific version of a CloudFormation type.
    */
  @js.native
  trait TypeVersionSummary extends js.Object {
    var Arn: js.UndefOr[TypeArn]
    var Description: js.UndefOr[Description]
    var TimeCreated: js.UndefOr[Timestamp]
    var Type: js.UndefOr[RegistryType]
    var TypeName: js.UndefOr[TypeName]
    var VersionId: js.UndefOr[TypeVersionId]
  }

  object TypeVersionSummary {
    @inline
    def apply(
        Arn: js.UndefOr[TypeArn] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        TimeCreated: js.UndefOr[Timestamp] = js.undefined,
        Type: js.UndefOr[RegistryType] = js.undefined,
        TypeName: js.UndefOr[TypeName] = js.undefined,
        VersionId: js.UndefOr[TypeVersionId] = js.undefined
    ): TypeVersionSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      TimeCreated.foreach(__v => __obj.updateDynamic("TimeCreated")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      TypeName.foreach(__v => __obj.updateDynamic("TypeName")(__v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TypeVersionSummary]
    }
  }

  /**
    * The input for an <a>UpdateStack</a> action.
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
    @inline
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
        UsePreviousTemplate: js.UndefOr[UsePreviousTemplate] = js.undefined
    ): UpdateStackInput = {
      val __obj = js.Dynamic.literal(
        "StackName" -> StackName.asInstanceOf[js.Any]
      )

      Capabilities.foreach(__v => __obj.updateDynamic("Capabilities")(__v.asInstanceOf[js.Any]))
      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      NotificationARNs.foreach(__v => __obj.updateDynamic("NotificationARNs")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      ResourceTypes.foreach(__v => __obj.updateDynamic("ResourceTypes")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      RollbackConfiguration.foreach(__v => __obj.updateDynamic("RollbackConfiguration")(__v.asInstanceOf[js.Any]))
      StackPolicyBody.foreach(__v => __obj.updateDynamic("StackPolicyBody")(__v.asInstanceOf[js.Any]))
      StackPolicyDuringUpdateBody.foreach(__v =>
        __obj.updateDynamic("StackPolicyDuringUpdateBody")(__v.asInstanceOf[js.Any])
      )
      StackPolicyDuringUpdateURL.foreach(__v =>
        __obj.updateDynamic("StackPolicyDuringUpdateURL")(__v.asInstanceOf[js.Any])
      )
      StackPolicyURL.foreach(__v => __obj.updateDynamic("StackPolicyURL")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TemplateBody.foreach(__v => __obj.updateDynamic("TemplateBody")(__v.asInstanceOf[js.Any]))
      TemplateURL.foreach(__v => __obj.updateDynamic("TemplateURL")(__v.asInstanceOf[js.Any]))
      UsePreviousTemplate.foreach(__v => __obj.updateDynamic("UsePreviousTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStackInput]
    }
  }

  @js.native
  trait UpdateStackInstancesInput extends js.Object {
    var Regions: RegionList
    var StackSetName: StackSetNameOrId
    var Accounts: js.UndefOr[AccountList]
    var DeploymentTargets: js.UndefOr[DeploymentTargets]
    var OperationId: js.UndefOr[ClientRequestToken]
    var OperationPreferences: js.UndefOr[StackSetOperationPreferences]
    var ParameterOverrides: js.UndefOr[Parameters]
  }

  object UpdateStackInstancesInput {
    @inline
    def apply(
        Regions: RegionList,
        StackSetName: StackSetNameOrId,
        Accounts: js.UndefOr[AccountList] = js.undefined,
        DeploymentTargets: js.UndefOr[DeploymentTargets] = js.undefined,
        OperationId: js.UndefOr[ClientRequestToken] = js.undefined,
        OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.undefined,
        ParameterOverrides: js.UndefOr[Parameters] = js.undefined
    ): UpdateStackInstancesInput = {
      val __obj = js.Dynamic.literal(
        "Regions"      -> Regions.asInstanceOf[js.Any],
        "StackSetName" -> StackSetName.asInstanceOf[js.Any]
      )

      Accounts.foreach(__v => __obj.updateDynamic("Accounts")(__v.asInstanceOf[js.Any]))
      DeploymentTargets.foreach(__v => __obj.updateDynamic("DeploymentTargets")(__v.asInstanceOf[js.Any]))
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      OperationPreferences.foreach(__v => __obj.updateDynamic("OperationPreferences")(__v.asInstanceOf[js.Any]))
      ParameterOverrides.foreach(__v => __obj.updateDynamic("ParameterOverrides")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStackInstancesInput]
    }
  }

  @js.native
  trait UpdateStackInstancesOutput extends js.Object {
    var OperationId: js.UndefOr[ClientRequestToken]
  }

  object UpdateStackInstancesOutput {
    @inline
    def apply(
        OperationId: js.UndefOr[ClientRequestToken] = js.undefined
    ): UpdateStackInstancesOutput = {
      val __obj = js.Dynamic.literal()
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStackInstancesOutput]
    }
  }

  /**
    * The output for an <a>UpdateStack</a> action.
    */
  @js.native
  trait UpdateStackOutput extends js.Object {
    var StackId: js.UndefOr[StackId]
  }

  object UpdateStackOutput {
    @inline
    def apply(
        StackId: js.UndefOr[StackId] = js.undefined
    ): UpdateStackOutput = {
      val __obj = js.Dynamic.literal()
      StackId.foreach(__v => __obj.updateDynamic("StackId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStackOutput]
    }
  }

  @js.native
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

  object UpdateStackSetInput {
    @inline
    def apply(
        StackSetName: StackSetName,
        Accounts: js.UndefOr[AccountList] = js.undefined,
        AdministrationRoleARN: js.UndefOr[RoleARN] = js.undefined,
        AutoDeployment: js.UndefOr[AutoDeployment] = js.undefined,
        Capabilities: js.UndefOr[Capabilities] = js.undefined,
        DeploymentTargets: js.UndefOr[DeploymentTargets] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        ExecutionRoleName: js.UndefOr[ExecutionRoleName] = js.undefined,
        OperationId: js.UndefOr[ClientRequestToken] = js.undefined,
        OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.undefined,
        Parameters: js.UndefOr[Parameters] = js.undefined,
        PermissionModel: js.UndefOr[PermissionModels] = js.undefined,
        Regions: js.UndefOr[RegionList] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        TemplateBody: js.UndefOr[TemplateBody] = js.undefined,
        TemplateURL: js.UndefOr[TemplateURL] = js.undefined,
        UsePreviousTemplate: js.UndefOr[UsePreviousTemplate] = js.undefined
    ): UpdateStackSetInput = {
      val __obj = js.Dynamic.literal(
        "StackSetName" -> StackSetName.asInstanceOf[js.Any]
      )

      Accounts.foreach(__v => __obj.updateDynamic("Accounts")(__v.asInstanceOf[js.Any]))
      AdministrationRoleARN.foreach(__v => __obj.updateDynamic("AdministrationRoleARN")(__v.asInstanceOf[js.Any]))
      AutoDeployment.foreach(__v => __obj.updateDynamic("AutoDeployment")(__v.asInstanceOf[js.Any]))
      Capabilities.foreach(__v => __obj.updateDynamic("Capabilities")(__v.asInstanceOf[js.Any]))
      DeploymentTargets.foreach(__v => __obj.updateDynamic("DeploymentTargets")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ExecutionRoleName.foreach(__v => __obj.updateDynamic("ExecutionRoleName")(__v.asInstanceOf[js.Any]))
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      OperationPreferences.foreach(__v => __obj.updateDynamic("OperationPreferences")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      PermissionModel.foreach(__v => __obj.updateDynamic("PermissionModel")(__v.asInstanceOf[js.Any]))
      Regions.foreach(__v => __obj.updateDynamic("Regions")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TemplateBody.foreach(__v => __obj.updateDynamic("TemplateBody")(__v.asInstanceOf[js.Any]))
      TemplateURL.foreach(__v => __obj.updateDynamic("TemplateURL")(__v.asInstanceOf[js.Any]))
      UsePreviousTemplate.foreach(__v => __obj.updateDynamic("UsePreviousTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStackSetInput]
    }
  }

  @js.native
  trait UpdateStackSetOutput extends js.Object {
    var OperationId: js.UndefOr[ClientRequestToken]
  }

  object UpdateStackSetOutput {
    @inline
    def apply(
        OperationId: js.UndefOr[ClientRequestToken] = js.undefined
    ): UpdateStackSetOutput = {
      val __obj = js.Dynamic.literal()
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStackSetOutput]
    }
  }

  @js.native
  trait UpdateTerminationProtectionInput extends js.Object {
    var EnableTerminationProtection: EnableTerminationProtection
    var StackName: StackNameOrId
  }

  object UpdateTerminationProtectionInput {
    @inline
    def apply(
        EnableTerminationProtection: EnableTerminationProtection,
        StackName: StackNameOrId
    ): UpdateTerminationProtectionInput = {
      val __obj = js.Dynamic.literal(
        "EnableTerminationProtection" -> EnableTerminationProtection.asInstanceOf[js.Any],
        "StackName"                   -> StackName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateTerminationProtectionInput]
    }
  }

  @js.native
  trait UpdateTerminationProtectionOutput extends js.Object {
    var StackId: js.UndefOr[StackId]
  }

  object UpdateTerminationProtectionOutput {
    @inline
    def apply(
        StackId: js.UndefOr[StackId] = js.undefined
    ): UpdateTerminationProtectionOutput = {
      val __obj = js.Dynamic.literal()
      StackId.foreach(__v => __obj.updateDynamic("StackId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTerminationProtectionOutput]
    }
  }

  /**
    * The input for <a>ValidateTemplate</a> action.
    */
  @js.native
  trait ValidateTemplateInput extends js.Object {
    var TemplateBody: js.UndefOr[TemplateBody]
    var TemplateURL: js.UndefOr[TemplateURL]
  }

  object ValidateTemplateInput {
    @inline
    def apply(
        TemplateBody: js.UndefOr[TemplateBody] = js.undefined,
        TemplateURL: js.UndefOr[TemplateURL] = js.undefined
    ): ValidateTemplateInput = {
      val __obj = js.Dynamic.literal()
      TemplateBody.foreach(__v => __obj.updateDynamic("TemplateBody")(__v.asInstanceOf[js.Any]))
      TemplateURL.foreach(__v => __obj.updateDynamic("TemplateURL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidateTemplateInput]
    }
  }

  /**
    * The output for <a>ValidateTemplate</a> action.
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
    @inline
    def apply(
        Capabilities: js.UndefOr[Capabilities] = js.undefined,
        CapabilitiesReason: js.UndefOr[CapabilitiesReason] = js.undefined,
        DeclaredTransforms: js.UndefOr[TransformsList] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Parameters: js.UndefOr[TemplateParameters] = js.undefined
    ): ValidateTemplateOutput = {
      val __obj = js.Dynamic.literal()
      Capabilities.foreach(__v => __obj.updateDynamic("Capabilities")(__v.asInstanceOf[js.Any]))
      CapabilitiesReason.foreach(__v => __obj.updateDynamic("CapabilitiesReason")(__v.asInstanceOf[js.Any]))
      DeclaredTransforms.foreach(__v => __obj.updateDynamic("DeclaredTransforms")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidateTemplateOutput]
    }
  }
  @js.native
  sealed trait Visibility extends js.Any
  object Visibility extends js.Object {
    val PUBLIC  = "PUBLIC".asInstanceOf[Visibility]
    val PRIVATE = "PRIVATE".asInstanceOf[Visibility]

    val values = js.Object.freeze(js.Array(PUBLIC, PRIVATE))
  }
}
