package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object cloudformation {
  type Capabilities = js.Array[Capability]
  type CapabilitiesReason = String
  type Capability = String
  type CreationTime = js.Date
  type DeletionTime = js.Date
  type Description = String
  type DisableRollback = Boolean
  type EventId = String
  type LastUpdatedTime = js.Date
  type LogicalResourceId = String
  type Metadata = String
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
  type ResourceProperties = String
  type ResourceSignalStatus = String
  type ResourceSignalUniqueId = String
  type ResourceStatus = String
  type ResourceStatusReason = String
  type ResourceType = String
  type StackEvents = js.Array[StackEvent]
  type StackId = String
  type StackName = String
  type StackNameOrId = String
  type StackPolicyBody = String
  type StackPolicyDuringUpdateBody = String
  type StackPolicyDuringUpdateURL = String
  type StackPolicyURL = String
  type StackResourceSummaries = js.Array[StackResourceSummary]
  type StackResources = js.Array[StackResource]
  type StackStatus = String
  type StackStatusFilter = js.Array[StackStatus]
  type StackStatusReason = String
  type StackSummaries = js.Array[StackSummary]
  type Stacks = js.Array[Stack]
  type TagKey = String
  type TagValue = String
  type Tags = js.Array[Tag]
  type TemplateBody = String
  type TemplateDescription = String
  type TemplateParameters = js.Array[TemplateParameter]
  type TemplateURL = String
  type TimeoutMinutes = Integer
  type Timestamp = js.Date
  type Url = String
  type UsePreviousTemplate = Boolean
  type UsePreviousValue = Boolean
  type Version = String
}

package cloudformation {
  @js.native
  trait Cloudformation extends js.Object {
    def cancelUpdateStack(params: CancelUpdateStackInput, callback: Callback[js.Object]): Unit = js.native
    def cancelUpdateStack(params: CancelUpdateStackInput): Request[js.Object] = js.native
    def createStack(params: CreateStackInput, callback: Callback[CreateStackOutput]): Unit = js.native
    def createStack(params: CreateStackInput): Request[CreateStackOutput] = js.native
    def deleteStack(params: DeleteStackInput, callback: Callback[js.Object]): Unit = js.native
    def deleteStack(params: DeleteStackInput): Request[js.Object] = js.native
    def describeStackEvents(params: DescribeStackEventsInput, callback: Callback[DescribeStackEventsOutput]): Unit = js.native
    def describeStackEvents(params: DescribeStackEventsInput): Request[DescribeStackEventsOutput] = js.native
    def describeStackResource(params: DescribeStackResourceInput, callback: Callback[DescribeStackResourceOutput]): Unit = js.native
    def describeStackResource(params: DescribeStackResourceInput): Request[DescribeStackResourceOutput] = js.native
    def describeStackResources(params: DescribeStackResourcesInput, callback: Callback[DescribeStackResourcesOutput]): Unit = js.native
    def describeStackResources(params: DescribeStackResourcesInput): Request[DescribeStackResourcesOutput] = js.native
    def describeStacks(params: DescribeStacksInput, callback: Callback[DescribeStacksOutput]): Unit = js.native
    def describeStacks(params: DescribeStacksInput): Request[DescribeStacksOutput] = js.native
    def estimateTemplateCost(params: EstimateTemplateCostInput, callback: Callback[EstimateTemplateCostOutput]): Unit = js.native
    def estimateTemplateCost(params: EstimateTemplateCostInput): Request[EstimateTemplateCostOutput] = js.native
    def getStackPolicy(params: GetStackPolicyInput, callback: Callback[GetStackPolicyOutput]): Unit = js.native
    def getStackPolicy(params: GetStackPolicyInput): Request[GetStackPolicyOutput] = js.native
    def getTemplate(params: GetTemplateInput, callback: Callback[GetTemplateOutput]): Unit = js.native
    def getTemplate(params: GetTemplateInput): Request[GetTemplateOutput] = js.native
    def getTemplateSummary(params: GetTemplateSummaryInput, callback: Callback[GetTemplateSummaryOutput]): Unit = js.native
    def getTemplateSummary(params: GetTemplateSummaryInput): Request[GetTemplateSummaryOutput] = js.native
    def listStackResources(params: ListStackResourcesInput, callback: Callback[ListStackResourcesOutput]): Unit = js.native
    def listStackResources(params: ListStackResourcesInput): Request[ListStackResourcesOutput] = js.native
    def listStacks(params: ListStacksInput, callback: Callback[ListStacksOutput]): Unit = js.native
    def listStacks(params: ListStacksInput): Request[ListStacksOutput] = js.native
    def setStackPolicy(params: SetStackPolicyInput, callback: Callback[js.Object]): Unit = js.native
    def setStackPolicy(params: SetStackPolicyInput): Request[js.Object] = js.native
    def signalResource(params: SignalResourceInput, callback: Callback[js.Object]): Unit = js.native
    def signalResource(params: SignalResourceInput): Request[js.Object] = js.native
    def updateStack(params: UpdateStackInput, callback: Callback[UpdateStackOutput]): Unit = js.native
    def updateStack(params: UpdateStackInput): Request[UpdateStackOutput] = js.native
    def validateTemplate(params: ValidateTemplateInput, callback: Callback[ValidateTemplateOutput]): Unit = js.native
    def validateTemplate(params: ValidateTemplateInput): Request[ValidateTemplateOutput] = js.native
  }

  /**
   * <p>Resource with the name requested already exists.</p>
   */
  @js.native
  trait AlreadyExistsExceptionException extends js.Object {

  }

  /**
   * <p>The input for <a>CancelUpdateStack</a> action.</p>
   */
  @js.native
  trait CancelUpdateStackInput extends js.Object {
    var StackName: StackName
  }

  object CancelUpdateStackInput {
    def apply(
      StackName: js.UndefOr[StackName] = js.undefined
    ): CancelUpdateStackInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackName" -> StackName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelUpdateStackInput]
    }
  }


  object CapabilityEnum {
    val `CAPABILITY_IAM` = "CAPABILITY_IAM"

    val values = IndexedSeq(`CAPABILITY_IAM`)
  }

  /**
   * <p>The input for <a>CreateStack</a> action.</p>
   */
  @js.native
  trait CreateStackInput extends js.Object {
    var NotificationARNs: NotificationARNs
    var TemplateBody: TemplateBody
    var StackPolicyURL: StackPolicyURL
    var Parameters: Parameters
    var OnFailure: OnFailure
    var TimeoutInMinutes: TimeoutMinutes
    var StackPolicyBody: StackPolicyBody
    var StackName: StackName
    var Tags: Tags
    var DisableRollback: DisableRollback
    var TemplateURL: TemplateURL
    var Capabilities: Capabilities
  }

  object CreateStackInput {
    def apply(
      NotificationARNs: js.UndefOr[NotificationARNs] = js.undefined,
      TemplateBody: js.UndefOr[TemplateBody] = js.undefined,
      StackPolicyURL: js.UndefOr[StackPolicyURL] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      OnFailure: js.UndefOr[OnFailure] = js.undefined,
      TimeoutInMinutes: js.UndefOr[TimeoutMinutes] = js.undefined,
      StackPolicyBody: js.UndefOr[StackPolicyBody] = js.undefined,
      StackName: js.UndefOr[StackName] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined,
      DisableRollback: js.UndefOr[DisableRollback] = js.undefined,
      TemplateURL: js.UndefOr[TemplateURL] = js.undefined,
      Capabilities: js.UndefOr[Capabilities] = js.undefined
    ): CreateStackInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NotificationARNs" -> NotificationARNs.map { x => x: js.Any }),
        ("TemplateBody" -> TemplateBody.map { x => x: js.Any }),
        ("StackPolicyURL" -> StackPolicyURL.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any }),
        ("OnFailure" -> OnFailure.map { x => x: js.Any }),
        ("TimeoutInMinutes" -> TimeoutInMinutes.map { x => x: js.Any }),
        ("StackPolicyBody" -> StackPolicyBody.map { x => x: js.Any }),
        ("StackName" -> StackName.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("DisableRollback" -> DisableRollback.map { x => x: js.Any }),
        ("TemplateURL" -> TemplateURL.map { x => x: js.Any }),
        ("Capabilities" -> Capabilities.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStackInput]
    }
  }

  /**
   * <p>The output for a <a>CreateStack</a> action.</p>
   */
  @js.native
  trait CreateStackOutput extends js.Object {
    var StackId: StackId
  }

  object CreateStackOutput {
    def apply(
      StackId: js.UndefOr[StackId] = js.undefined
    ): CreateStackOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackId" -> StackId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStackOutput]
    }
  }

  /**
   * <p>The input for <a>DeleteStack</a> action.</p>
   */
  @js.native
  trait DeleteStackInput extends js.Object {
    var StackName: StackName
  }

  object DeleteStackInput {
    def apply(
      StackName: js.UndefOr[StackName] = js.undefined
    ): DeleteStackInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackName" -> StackName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStackInput]
    }
  }

  /**
   * <p>The input for <a>DescribeStackEvents</a> action.</p>
   */
  @js.native
  trait DescribeStackEventsInput extends js.Object {
    var StackName: StackName
    var NextToken: NextToken
  }

  object DescribeStackEventsInput {
    def apply(
      StackName: js.UndefOr[StackName] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeStackEventsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackName" -> StackName.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackEventsInput]
    }
  }

  /**
   * <p>The output for a <a>DescribeStackEvents</a> action.</p>
   */
  @js.native
  trait DescribeStackEventsOutput extends js.Object {
    var StackEvents: StackEvents
    var NextToken: NextToken
  }

  object DescribeStackEventsOutput {
    def apply(
      StackEvents: js.UndefOr[StackEvents] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeStackEventsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackEvents" -> StackEvents.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackEventsOutput]
    }
  }

  /**
   * <p>The input for <a>DescribeStackResource</a> action.</p>
   */
  @js.native
  trait DescribeStackResourceInput extends js.Object {
    var StackName: StackName
    var LogicalResourceId: LogicalResourceId
  }

  object DescribeStackResourceInput {
    def apply(
      StackName: js.UndefOr[StackName] = js.undefined,
      LogicalResourceId: js.UndefOr[LogicalResourceId] = js.undefined
    ): DescribeStackResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackName" -> StackName.map { x => x: js.Any }),
        ("LogicalResourceId" -> LogicalResourceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackResourceInput]
    }
  }

  /**
   * <p>The output for a <a>DescribeStackResource</a> action.</p>
   */
  @js.native
  trait DescribeStackResourceOutput extends js.Object {
    var StackResourceDetail: StackResourceDetail
  }

  object DescribeStackResourceOutput {
    def apply(
      StackResourceDetail: js.UndefOr[StackResourceDetail] = js.undefined
    ): DescribeStackResourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackResourceDetail" -> StackResourceDetail.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackResourceOutput]
    }
  }

  /**
   * <p>The input for <a>DescribeStackResources</a> action.</p>
   */
  @js.native
  trait DescribeStackResourcesInput extends js.Object {
    var StackName: StackName
    var LogicalResourceId: LogicalResourceId
    var PhysicalResourceId: PhysicalResourceId
  }

  object DescribeStackResourcesInput {
    def apply(
      StackName: js.UndefOr[StackName] = js.undefined,
      LogicalResourceId: js.UndefOr[LogicalResourceId] = js.undefined,
      PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined
    ): DescribeStackResourcesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackName" -> StackName.map { x => x: js.Any }),
        ("LogicalResourceId" -> LogicalResourceId.map { x => x: js.Any }),
        ("PhysicalResourceId" -> PhysicalResourceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackResourcesInput]
    }
  }

  /**
   * <p>The output for a <a>DescribeStackResources</a> action.</p>
   */
  @js.native
  trait DescribeStackResourcesOutput extends js.Object {
    var StackResources: StackResources
  }

  object DescribeStackResourcesOutput {
    def apply(
      StackResources: js.UndefOr[StackResources] = js.undefined
    ): DescribeStackResourcesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackResources" -> StackResources.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackResourcesOutput]
    }
  }

  /**
   * <p>The input for <a>DescribeStacks</a> action.</p>
   */
  @js.native
  trait DescribeStacksInput extends js.Object {
    var StackName: StackName
    var NextToken: NextToken
  }

  object DescribeStacksInput {
    def apply(
      StackName: js.UndefOr[StackName] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeStacksInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackName" -> StackName.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStacksInput]
    }
  }

  /**
   * <p>The output for a <a>DescribeStacks</a> action.</p>
   */
  @js.native
  trait DescribeStacksOutput extends js.Object {
    var Stacks: Stacks
    var NextToken: NextToken
  }

  object DescribeStacksOutput {
    def apply(
      Stacks: js.UndefOr[Stacks] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeStacksOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Stacks" -> Stacks.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStacksOutput]
    }
  }

  @js.native
  trait EstimateTemplateCostInput extends js.Object {
    var TemplateBody: TemplateBody
    var TemplateURL: TemplateURL
    var Parameters: Parameters
  }

  object EstimateTemplateCostInput {
    def apply(
      TemplateBody: js.UndefOr[TemplateBody] = js.undefined,
      TemplateURL: js.UndefOr[TemplateURL] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined
    ): EstimateTemplateCostInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TemplateBody" -> TemplateBody.map { x => x: js.Any }),
        ("TemplateURL" -> TemplateURL.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EstimateTemplateCostInput]
    }
  }

  /**
   * <p>The output for a <a>EstimateTemplateCost</a> action.</p>
   */
  @js.native
  trait EstimateTemplateCostOutput extends js.Object {
    var Url: Url
  }

  object EstimateTemplateCostOutput {
    def apply(
      Url: js.UndefOr[Url] = js.undefined
    ): EstimateTemplateCostOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Url" -> Url.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EstimateTemplateCostOutput]
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
      StackName: js.UndefOr[StackName] = js.undefined
    ): GetStackPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackName" -> StackName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStackPolicyInput]
    }
  }

  /**
   * <p>The output for the <a>GetStackPolicy</a> action.</p>
   */
  @js.native
  trait GetStackPolicyOutput extends js.Object {
    var StackPolicyBody: StackPolicyBody
  }

  object GetStackPolicyOutput {
    def apply(
      StackPolicyBody: js.UndefOr[StackPolicyBody] = js.undefined
    ): GetStackPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackPolicyBody" -> StackPolicyBody.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStackPolicyOutput]
    }
  }

  /**
   * <p>The input for a <a>GetTemplate</a> action.</p>
   */
  @js.native
  trait GetTemplateInput extends js.Object {
    var StackName: StackName
  }

  object GetTemplateInput {
    def apply(
      StackName: js.UndefOr[StackName] = js.undefined
    ): GetTemplateInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackName" -> StackName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTemplateInput]
    }
  }

  /**
   * <p>The output for <a>GetTemplate</a> action.</p>
   */
  @js.native
  trait GetTemplateOutput extends js.Object {
    var TemplateBody: TemplateBody
  }

  object GetTemplateOutput {
    def apply(
      TemplateBody: js.UndefOr[TemplateBody] = js.undefined
    ): GetTemplateOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TemplateBody" -> TemplateBody.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTemplateOutput]
    }
  }

  /**
   * <p>The input for the <a>GetTemplateSummary</a> action.</p>
   */
  @js.native
  trait GetTemplateSummaryInput extends js.Object {
    var TemplateBody: TemplateBody
    var TemplateURL: TemplateURL
    var StackName: StackNameOrId
  }

  object GetTemplateSummaryInput {
    def apply(
      TemplateBody: js.UndefOr[TemplateBody] = js.undefined,
      TemplateURL: js.UndefOr[TemplateURL] = js.undefined,
      StackName: js.UndefOr[StackNameOrId] = js.undefined
    ): GetTemplateSummaryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TemplateBody" -> TemplateBody.map { x => x: js.Any }),
        ("TemplateURL" -> TemplateURL.map { x => x: js.Any }),
        ("StackName" -> StackName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTemplateSummaryInput]
    }
  }

  /**
   * <p>The output for the <a>GetTemplateSummary</a> action.</p>
   */
  @js.native
  trait GetTemplateSummaryOutput extends js.Object {
    var Version: Version
    var Description: Description
    var Parameters: ParameterDeclarations
    var CapabilitiesReason: CapabilitiesReason
    var Capabilities: Capabilities
  }

  object GetTemplateSummaryOutput {
    def apply(
      Version: js.UndefOr[Version] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      Parameters: js.UndefOr[ParameterDeclarations] = js.undefined,
      CapabilitiesReason: js.UndefOr[CapabilitiesReason] = js.undefined,
      Capabilities: js.UndefOr[Capabilities] = js.undefined
    ): GetTemplateSummaryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Version" -> Version.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any }),
        ("CapabilitiesReason" -> CapabilitiesReason.map { x => x: js.Any }),
        ("Capabilities" -> Capabilities.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTemplateSummaryOutput]
    }
  }

  /**
   * <p>The template contains resources with capabilities that were not specified in the Capabilities parameter.</p>
   */
  @js.native
  trait InsufficientCapabilitiesExceptionException extends js.Object {

  }

  /**
   * <p>Quota for the resource has already been reached.</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {

  }

  /**
   * <p>The input for the <a>ListStackResource</a> action.</p>
   */
  @js.native
  trait ListStackResourcesInput extends js.Object {
    var StackName: StackName
    var NextToken: NextToken
  }

  object ListStackResourcesInput {
    def apply(
      StackName: js.UndefOr[StackName] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListStackResourcesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackName" -> StackName.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStackResourcesInput]
    }
  }

  /**
   * <p>The output for a <a>ListStackResources</a> action.</p>
   */
  @js.native
  trait ListStackResourcesOutput extends js.Object {
    var StackResourceSummaries: StackResourceSummaries
    var NextToken: NextToken
  }

  object ListStackResourcesOutput {
    def apply(
      StackResourceSummaries: js.UndefOr[StackResourceSummaries] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListStackResourcesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackResourceSummaries" -> StackResourceSummaries.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStackResourcesOutput]
    }
  }

  /**
   * <p>The input for <a>ListStacks</a> action.</p>
   */
  @js.native
  trait ListStacksInput extends js.Object {
    var NextToken: NextToken
    var StackStatusFilter: StackStatusFilter
  }

  object ListStacksInput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      StackStatusFilter: js.UndefOr[StackStatusFilter] = js.undefined
    ): ListStacksInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("StackStatusFilter" -> StackStatusFilter.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStacksInput]
    }
  }

  /**
   * <p>The output for <a>ListStacks</a> action.</p>
   */
  @js.native
  trait ListStacksOutput extends js.Object {
    var StackSummaries: StackSummaries
    var NextToken: NextToken
  }

  object ListStacksOutput {
    def apply(
      StackSummaries: js.UndefOr[StackSummaries] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListStacksOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackSummaries" -> StackSummaries.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStacksOutput]
    }
  }


  object OnFailureEnum {
    val `DO_NOTHING` = "DO_NOTHING"
    val ROLLBACK = "ROLLBACK"
    val DELETE = "DELETE"

    val values = IndexedSeq(`DO_NOTHING`, ROLLBACK, DELETE)
  }

  /**
   * <p>The Output data type.</p>
   */
  @js.native
  trait Output extends js.Object {
    var OutputKey: OutputKey
    var OutputValue: OutputValue
    var Description: Description
  }

  object Output {
    def apply(
      OutputKey: js.UndefOr[OutputKey] = js.undefined,
      OutputValue: js.UndefOr[OutputValue] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined
    ): Output = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OutputKey" -> OutputKey.map { x => x: js.Any }),
        ("OutputValue" -> OutputValue.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Output]
    }
  }

  /**
   * <p>The Parameter data type.</p>
   */
  @js.native
  trait Parameter extends js.Object {
    var ParameterKey: ParameterKey
    var ParameterValue: ParameterValue
    var UsePreviousValue: UsePreviousValue
  }

  object Parameter {
    def apply(
      ParameterKey: js.UndefOr[ParameterKey] = js.undefined,
      ParameterValue: js.UndefOr[ParameterValue] = js.undefined,
      UsePreviousValue: js.UndefOr[UsePreviousValue] = js.undefined
    ): Parameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ParameterKey" -> ParameterKey.map { x => x: js.Any }),
        ("ParameterValue" -> ParameterValue.map { x => x: js.Any }),
        ("UsePreviousValue" -> UsePreviousValue.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Parameter]
    }
  }

  /**
   * <p>The ParameterDeclaration data type.</p>
   */
  @js.native
  trait ParameterDeclaration extends js.Object {
    var ParameterType: ParameterType
    var Description: Description
    var NoEcho: NoEcho
    var DefaultValue: ParameterValue
    var ParameterKey: ParameterKey
  }

  object ParameterDeclaration {
    def apply(
      ParameterType: js.UndefOr[ParameterType] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      NoEcho: js.UndefOr[NoEcho] = js.undefined,
      DefaultValue: js.UndefOr[ParameterValue] = js.undefined,
      ParameterKey: js.UndefOr[ParameterKey] = js.undefined
    ): ParameterDeclaration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ParameterType" -> ParameterType.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("NoEcho" -> NoEcho.map { x => x: js.Any }),
        ("DefaultValue" -> DefaultValue.map { x => x: js.Any }),
        ("ParameterKey" -> ParameterKey.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParameterDeclaration]
    }
  }


  object ResourceSignalStatusEnum {
    val SUCCESS = "SUCCESS"
    val FAILURE = "FAILURE"

    val values = IndexedSeq(SUCCESS, FAILURE)
  }


  object ResourceStatusEnum {
    val `CREATE_IN_PROGRESS` = "CREATE_IN_PROGRESS"
    val `CREATE_FAILED` = "CREATE_FAILED"
    val `CREATE_COMPLETE` = "CREATE_COMPLETE"
    val `DELETE_IN_PROGRESS` = "DELETE_IN_PROGRESS"
    val `DELETE_FAILED` = "DELETE_FAILED"
    val `DELETE_COMPLETE` = "DELETE_COMPLETE"
    val `DELETE_SKIPPED` = "DELETE_SKIPPED"
    val `UPDATE_IN_PROGRESS` = "UPDATE_IN_PROGRESS"
    val `UPDATE_FAILED` = "UPDATE_FAILED"
    val `UPDATE_COMPLETE` = "UPDATE_COMPLETE"

    val values = IndexedSeq(`CREATE_IN_PROGRESS`, `CREATE_FAILED`, `CREATE_COMPLETE`, `DELETE_IN_PROGRESS`, `DELETE_FAILED`, `DELETE_COMPLETE`, `DELETE_SKIPPED`, `UPDATE_IN_PROGRESS`, `UPDATE_FAILED`, `UPDATE_COMPLETE`)
  }

  /**
   * <p>The input for the <a>SetStackPolicy</a> action.</p>
   */
  @js.native
  trait SetStackPolicyInput extends js.Object {
    var StackName: StackName
    var StackPolicyBody: StackPolicyBody
    var StackPolicyURL: StackPolicyURL
  }

  object SetStackPolicyInput {
    def apply(
      StackName: js.UndefOr[StackName] = js.undefined,
      StackPolicyBody: js.UndefOr[StackPolicyBody] = js.undefined,
      StackPolicyURL: js.UndefOr[StackPolicyURL] = js.undefined
    ): SetStackPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackName" -> StackName.map { x => x: js.Any }),
        ("StackPolicyBody" -> StackPolicyBody.map { x => x: js.Any }),
        ("StackPolicyURL" -> StackPolicyURL.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetStackPolicyInput]
    }
  }

  /**
   * <p>The input for the <a>SignalResource</a> action.</p>
   */
  @js.native
  trait SignalResourceInput extends js.Object {
    var StackName: StackNameOrId
    var LogicalResourceId: LogicalResourceId
    var UniqueId: ResourceSignalUniqueId
    var Status: ResourceSignalStatus
  }

  object SignalResourceInput {
    def apply(
      StackName: js.UndefOr[StackNameOrId] = js.undefined,
      LogicalResourceId: js.UndefOr[LogicalResourceId] = js.undefined,
      UniqueId: js.UndefOr[ResourceSignalUniqueId] = js.undefined,
      Status: js.UndefOr[ResourceSignalStatus] = js.undefined
    ): SignalResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackName" -> StackName.map { x => x: js.Any }),
        ("LogicalResourceId" -> LogicalResourceId.map { x => x: js.Any }),
        ("UniqueId" -> UniqueId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignalResourceInput]
    }
  }

  /**
   * <p>The Stack data type.</p>
   */
  @js.native
  trait Stack extends js.Object {
    var NotificationARNs: NotificationARNs
    var StackStatusReason: StackStatusReason
    var LastUpdatedTime: LastUpdatedTime
    var Description: Description
    var Parameters: Parameters
    var StackStatus: StackStatus
    var StackId: StackId
    var TimeoutInMinutes: TimeoutMinutes
    var StackName: StackName
    var Tags: Tags
    var DisableRollback: DisableRollback
    var Outputs: Outputs
    var Capabilities: Capabilities
    var CreationTime: CreationTime
  }

  object Stack {
    def apply(
      NotificationARNs: js.UndefOr[NotificationARNs] = js.undefined,
      StackStatusReason: js.UndefOr[StackStatusReason] = js.undefined,
      LastUpdatedTime: js.UndefOr[LastUpdatedTime] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      StackStatus: js.UndefOr[StackStatus] = js.undefined,
      StackId: js.UndefOr[StackId] = js.undefined,
      TimeoutInMinutes: js.UndefOr[TimeoutMinutes] = js.undefined,
      StackName: js.UndefOr[StackName] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined,
      DisableRollback: js.UndefOr[DisableRollback] = js.undefined,
      Outputs: js.UndefOr[Outputs] = js.undefined,
      Capabilities: js.UndefOr[Capabilities] = js.undefined,
      CreationTime: js.UndefOr[CreationTime] = js.undefined
    ): Stack = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NotificationARNs" -> NotificationARNs.map { x => x: js.Any }),
        ("StackStatusReason" -> StackStatusReason.map { x => x: js.Any }),
        ("LastUpdatedTime" -> LastUpdatedTime.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any }),
        ("StackStatus" -> StackStatus.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("TimeoutInMinutes" -> TimeoutInMinutes.map { x => x: js.Any }),
        ("StackName" -> StackName.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("DisableRollback" -> DisableRollback.map { x => x: js.Any }),
        ("Outputs" -> Outputs.map { x => x: js.Any }),
        ("Capabilities" -> Capabilities.map { x => x: js.Any }),
        ("CreationTime" -> CreationTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Stack]
    }
  }

  /**
   * <p>The StackEvent data type.</p>
   */
  @js.native
  trait StackEvent extends js.Object {
    var ResourceStatus: ResourceStatus
    var ResourceType: ResourceType
    var PhysicalResourceId: PhysicalResourceId
    var ResourceStatusReason: ResourceStatusReason
    var StackId: StackId
    var EventId: EventId
    var Timestamp: Timestamp
    var ResourceProperties: ResourceProperties
    var StackName: StackName
    var LogicalResourceId: LogicalResourceId
  }

  object StackEvent {
    def apply(
      ResourceStatus: js.UndefOr[ResourceStatus] = js.undefined,
      ResourceType: js.UndefOr[ResourceType] = js.undefined,
      PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined,
      ResourceStatusReason: js.UndefOr[ResourceStatusReason] = js.undefined,
      StackId: js.UndefOr[StackId] = js.undefined,
      EventId: js.UndefOr[EventId] = js.undefined,
      Timestamp: js.UndefOr[Timestamp] = js.undefined,
      ResourceProperties: js.UndefOr[ResourceProperties] = js.undefined,
      StackName: js.UndefOr[StackName] = js.undefined,
      LogicalResourceId: js.UndefOr[LogicalResourceId] = js.undefined
    ): StackEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceStatus" -> ResourceStatus.map { x => x: js.Any }),
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("PhysicalResourceId" -> PhysicalResourceId.map { x => x: js.Any }),
        ("ResourceStatusReason" -> ResourceStatusReason.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("EventId" -> EventId.map { x => x: js.Any }),
        ("Timestamp" -> Timestamp.map { x => x: js.Any }),
        ("ResourceProperties" -> ResourceProperties.map { x => x: js.Any }),
        ("StackName" -> StackName.map { x => x: js.Any }),
        ("LogicalResourceId" -> LogicalResourceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackEvent]
    }
  }

  /**
   * <p>The StackResource data type.</p>
   */
  @js.native
  trait StackResource extends js.Object {
    var ResourceStatus: ResourceStatus
    var Description: Description
    var ResourceType: ResourceType
    var PhysicalResourceId: PhysicalResourceId
    var ResourceStatusReason: ResourceStatusReason
    var StackId: StackId
    var Timestamp: Timestamp
    var StackName: StackName
    var LogicalResourceId: LogicalResourceId
  }

  object StackResource {
    def apply(
      ResourceStatus: js.UndefOr[ResourceStatus] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      ResourceType: js.UndefOr[ResourceType] = js.undefined,
      PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined,
      ResourceStatusReason: js.UndefOr[ResourceStatusReason] = js.undefined,
      StackId: js.UndefOr[StackId] = js.undefined,
      Timestamp: js.UndefOr[Timestamp] = js.undefined,
      StackName: js.UndefOr[StackName] = js.undefined,
      LogicalResourceId: js.UndefOr[LogicalResourceId] = js.undefined
    ): StackResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceStatus" -> ResourceStatus.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("PhysicalResourceId" -> PhysicalResourceId.map { x => x: js.Any }),
        ("ResourceStatusReason" -> ResourceStatusReason.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("Timestamp" -> Timestamp.map { x => x: js.Any }),
        ("StackName" -> StackName.map { x => x: js.Any }),
        ("LogicalResourceId" -> LogicalResourceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackResource]
    }
  }

  /**
   * <p>Contains detailed information about the specified stack resource.</p>
   */
  @js.native
  trait StackResourceDetail extends js.Object {
    var ResourceStatus: ResourceStatus
    var Metadata: Metadata
    var LastUpdatedTimestamp: Timestamp
    var Description: Description
    var ResourceType: ResourceType
    var PhysicalResourceId: PhysicalResourceId
    var ResourceStatusReason: ResourceStatusReason
    var StackId: StackId
    var StackName: StackName
    var LogicalResourceId: LogicalResourceId
  }

  object StackResourceDetail {
    def apply(
      ResourceStatus: js.UndefOr[ResourceStatus] = js.undefined,
      Metadata: js.UndefOr[Metadata] = js.undefined,
      LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      ResourceType: js.UndefOr[ResourceType] = js.undefined,
      PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined,
      ResourceStatusReason: js.UndefOr[ResourceStatusReason] = js.undefined,
      StackId: js.UndefOr[StackId] = js.undefined,
      StackName: js.UndefOr[StackName] = js.undefined,
      LogicalResourceId: js.UndefOr[LogicalResourceId] = js.undefined
    ): StackResourceDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceStatus" -> ResourceStatus.map { x => x: js.Any }),
        ("Metadata" -> Metadata.map { x => x: js.Any }),
        ("LastUpdatedTimestamp" -> LastUpdatedTimestamp.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("PhysicalResourceId" -> PhysicalResourceId.map { x => x: js.Any }),
        ("ResourceStatusReason" -> ResourceStatusReason.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("StackName" -> StackName.map { x => x: js.Any }),
        ("LogicalResourceId" -> LogicalResourceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackResourceDetail]
    }
  }

  /**
   * <p>Contains high-level information about the specified stack resource.</p>
   */
  @js.native
  trait StackResourceSummary extends js.Object {
    var ResourceStatus: ResourceStatus
    var LastUpdatedTimestamp: Timestamp
    var ResourceType: ResourceType
    var PhysicalResourceId: PhysicalResourceId
    var ResourceStatusReason: ResourceStatusReason
    var LogicalResourceId: LogicalResourceId
  }

  object StackResourceSummary {
    def apply(
      ResourceStatus: js.UndefOr[ResourceStatus] = js.undefined,
      LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
      ResourceType: js.UndefOr[ResourceType] = js.undefined,
      PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined,
      ResourceStatusReason: js.UndefOr[ResourceStatusReason] = js.undefined,
      LogicalResourceId: js.UndefOr[LogicalResourceId] = js.undefined
    ): StackResourceSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceStatus" -> ResourceStatus.map { x => x: js.Any }),
        ("LastUpdatedTimestamp" -> LastUpdatedTimestamp.map { x => x: js.Any }),
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("PhysicalResourceId" -> PhysicalResourceId.map { x => x: js.Any }),
        ("ResourceStatusReason" -> ResourceStatusReason.map { x => x: js.Any }),
        ("LogicalResourceId" -> LogicalResourceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackResourceSummary]
    }
  }


  object StackStatusEnum {
    val `CREATE_IN_PROGRESS` = "CREATE_IN_PROGRESS"
    val `CREATE_FAILED` = "CREATE_FAILED"
    val `CREATE_COMPLETE` = "CREATE_COMPLETE"
    val `ROLLBACK_IN_PROGRESS` = "ROLLBACK_IN_PROGRESS"
    val `ROLLBACK_FAILED` = "ROLLBACK_FAILED"
    val `ROLLBACK_COMPLETE` = "ROLLBACK_COMPLETE"
    val `DELETE_IN_PROGRESS` = "DELETE_IN_PROGRESS"
    val `DELETE_FAILED` = "DELETE_FAILED"
    val `DELETE_COMPLETE` = "DELETE_COMPLETE"
    val `UPDATE_IN_PROGRESS` = "UPDATE_IN_PROGRESS"
    val `UPDATE_COMPLETE_CLEANUP_IN_PROGRESS` = "UPDATE_COMPLETE_CLEANUP_IN_PROGRESS"
    val `UPDATE_COMPLETE` = "UPDATE_COMPLETE"
    val `UPDATE_ROLLBACK_IN_PROGRESS` = "UPDATE_ROLLBACK_IN_PROGRESS"
    val `UPDATE_ROLLBACK_FAILED` = "UPDATE_ROLLBACK_FAILED"
    val `UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS` = "UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS"
    val `UPDATE_ROLLBACK_COMPLETE` = "UPDATE_ROLLBACK_COMPLETE"

    val values = IndexedSeq(`CREATE_IN_PROGRESS`, `CREATE_FAILED`, `CREATE_COMPLETE`, `ROLLBACK_IN_PROGRESS`, `ROLLBACK_FAILED`, `ROLLBACK_COMPLETE`, `DELETE_IN_PROGRESS`, `DELETE_FAILED`, `DELETE_COMPLETE`, `UPDATE_IN_PROGRESS`, `UPDATE_COMPLETE_CLEANUP_IN_PROGRESS`, `UPDATE_COMPLETE`, `UPDATE_ROLLBACK_IN_PROGRESS`, `UPDATE_ROLLBACK_FAILED`, `UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS`, `UPDATE_ROLLBACK_COMPLETE`)
  }

  /**
   * <p>The StackSummary Data Type</p>
   */
  @js.native
  trait StackSummary extends js.Object {
    var StackStatusReason: StackStatusReason
    var LastUpdatedTime: LastUpdatedTime
    var StackStatus: StackStatus
    var StackId: StackId
    var TemplateDescription: TemplateDescription
    var DeletionTime: DeletionTime
    var StackName: StackName
    var CreationTime: CreationTime
  }

  object StackSummary {
    def apply(
      StackStatusReason: js.UndefOr[StackStatusReason] = js.undefined,
      LastUpdatedTime: js.UndefOr[LastUpdatedTime] = js.undefined,
      StackStatus: js.UndefOr[StackStatus] = js.undefined,
      StackId: js.UndefOr[StackId] = js.undefined,
      TemplateDescription: js.UndefOr[TemplateDescription] = js.undefined,
      DeletionTime: js.UndefOr[DeletionTime] = js.undefined,
      StackName: js.UndefOr[StackName] = js.undefined,
      CreationTime: js.UndefOr[CreationTime] = js.undefined
    ): StackSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackStatusReason" -> StackStatusReason.map { x => x: js.Any }),
        ("LastUpdatedTime" -> LastUpdatedTime.map { x => x: js.Any }),
        ("StackStatus" -> StackStatus.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("TemplateDescription" -> TemplateDescription.map { x => x: js.Any }),
        ("DeletionTime" -> DeletionTime.map { x => x: js.Any }),
        ("StackName" -> StackName.map { x => x: js.Any }),
        ("CreationTime" -> CreationTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackSummary]
    }
  }

  /**
   * <p>The Tag type is used by <code>CreateStack</code> in the <code>Tags</code> parameter. It allows you to specify a key/value pair that can be used to store information related to cost allocation for an AWS CloudFormation stack.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>The TemplateParameter data type.</p>
   */
  @js.native
  trait TemplateParameter extends js.Object {
    var ParameterKey: ParameterKey
    var DefaultValue: ParameterValue
    var NoEcho: NoEcho
    var Description: Description
  }

  object TemplateParameter {
    def apply(
      ParameterKey: js.UndefOr[ParameterKey] = js.undefined,
      DefaultValue: js.UndefOr[ParameterValue] = js.undefined,
      NoEcho: js.UndefOr[NoEcho] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined
    ): TemplateParameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ParameterKey" -> ParameterKey.map { x => x: js.Any }),
        ("DefaultValue" -> DefaultValue.map { x => x: js.Any }),
        ("NoEcho" -> NoEcho.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TemplateParameter]
    }
  }

  /**
   * <p>The input for <a>UpdateStack</a> action.</p>
   */
  @js.native
  trait UpdateStackInput extends js.Object {
    var NotificationARNs: NotificationARNs
    var TemplateBody: TemplateBody
    var StackPolicyURL: StackPolicyURL
    var Parameters: Parameters
    var UsePreviousTemplate: UsePreviousTemplate
    var StackPolicyBody: StackPolicyBody
    var StackName: StackName
    var StackPolicyDuringUpdateBody: StackPolicyDuringUpdateBody
    var TemplateURL: TemplateURL
    var StackPolicyDuringUpdateURL: StackPolicyDuringUpdateURL
    var Capabilities: Capabilities
  }

  object UpdateStackInput {
    def apply(
      NotificationARNs: js.UndefOr[NotificationARNs] = js.undefined,
      TemplateBody: js.UndefOr[TemplateBody] = js.undefined,
      StackPolicyURL: js.UndefOr[StackPolicyURL] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined,
      UsePreviousTemplate: js.UndefOr[UsePreviousTemplate] = js.undefined,
      StackPolicyBody: js.UndefOr[StackPolicyBody] = js.undefined,
      StackName: js.UndefOr[StackName] = js.undefined,
      StackPolicyDuringUpdateBody: js.UndefOr[StackPolicyDuringUpdateBody] = js.undefined,
      TemplateURL: js.UndefOr[TemplateURL] = js.undefined,
      StackPolicyDuringUpdateURL: js.UndefOr[StackPolicyDuringUpdateURL] = js.undefined,
      Capabilities: js.UndefOr[Capabilities] = js.undefined
    ): UpdateStackInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NotificationARNs" -> NotificationARNs.map { x => x: js.Any }),
        ("TemplateBody" -> TemplateBody.map { x => x: js.Any }),
        ("StackPolicyURL" -> StackPolicyURL.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any }),
        ("UsePreviousTemplate" -> UsePreviousTemplate.map { x => x: js.Any }),
        ("StackPolicyBody" -> StackPolicyBody.map { x => x: js.Any }),
        ("StackName" -> StackName.map { x => x: js.Any }),
        ("StackPolicyDuringUpdateBody" -> StackPolicyDuringUpdateBody.map { x => x: js.Any }),
        ("TemplateURL" -> TemplateURL.map { x => x: js.Any }),
        ("StackPolicyDuringUpdateURL" -> StackPolicyDuringUpdateURL.map { x => x: js.Any }),
        ("Capabilities" -> Capabilities.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStackInput]
    }
  }

  /**
   * <p>The output for a <a>UpdateStack</a> action.</p>
   */
  @js.native
  trait UpdateStackOutput extends js.Object {
    var StackId: StackId
  }

  object UpdateStackOutput {
    def apply(
      StackId: js.UndefOr[StackId] = js.undefined
    ): UpdateStackOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackId" -> StackId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStackOutput]
    }
  }

  /**
   * <p>The input for <a>ValidateTemplate</a> action.</p>
   */
  @js.native
  trait ValidateTemplateInput extends js.Object {
    var TemplateBody: TemplateBody
    var TemplateURL: TemplateURL
  }

  object ValidateTemplateInput {
    def apply(
      TemplateBody: js.UndefOr[TemplateBody] = js.undefined,
      TemplateURL: js.UndefOr[TemplateURL] = js.undefined
    ): ValidateTemplateInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TemplateBody" -> TemplateBody.map { x => x: js.Any }),
        ("TemplateURL" -> TemplateURL.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidateTemplateInput]
    }
  }

  /**
   * <p>The output for <a>ValidateTemplate</a> action.</p>
   */
  @js.native
  trait ValidateTemplateOutput extends js.Object {
    var Parameters: TemplateParameters
    var Description: Description
    var Capabilities: Capabilities
    var CapabilitiesReason: CapabilitiesReason
  }

  object ValidateTemplateOutput {
    def apply(
      Parameters: js.UndefOr[TemplateParameters] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      Capabilities: js.UndefOr[Capabilities] = js.undefined,
      CapabilitiesReason: js.UndefOr[CapabilitiesReason] = js.undefined
    ): ValidateTemplateOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Parameters" -> Parameters.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("Capabilities" -> Capabilities.map { x => x: js.Any }),
        ("CapabilitiesReason" -> CapabilitiesReason.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidateTemplateOutput]
    }
  }
}
