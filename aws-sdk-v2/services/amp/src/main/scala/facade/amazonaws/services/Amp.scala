package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object amp {
  type AlertManagerDefinitionData = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type IdempotencyToken = String
  type ListRuleGroupsNamespacesRequestMaxResultsInteger = Int
  type ListWorkspacesRequestMaxResultsInteger = Int
  type PaginationToken = String
  type RuleGroupsNamespaceArn = String
  type RuleGroupsNamespaceData = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type RuleGroupsNamespaceName = String
  type RuleGroupsNamespaceSummaryList = js.Array[RuleGroupsNamespaceSummary]
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Timestamp = js.Date
  type Uri = String
  type WorkspaceAlias = String
  type WorkspaceArn = String
  type WorkspaceId = String
  type WorkspaceSummaryList = js.Array[WorkspaceSummary]

  final class AmpOps(private val service: Amp) extends AnyVal {

    @inline def createAlertManagerDefinitionFuture(params: CreateAlertManagerDefinitionRequest): Future[CreateAlertManagerDefinitionResponse] = service.createAlertManagerDefinition(params).promise().toFuture
    @inline def createRuleGroupsNamespaceFuture(params: CreateRuleGroupsNamespaceRequest): Future[CreateRuleGroupsNamespaceResponse] = service.createRuleGroupsNamespace(params).promise().toFuture
    @inline def createWorkspaceFuture(params: CreateWorkspaceRequest): Future[CreateWorkspaceResponse] = service.createWorkspace(params).promise().toFuture
    @inline def deleteAlertManagerDefinitionFuture(params: DeleteAlertManagerDefinitionRequest): Future[js.Object] = service.deleteAlertManagerDefinition(params).promise().toFuture
    @inline def deleteRuleGroupsNamespaceFuture(params: DeleteRuleGroupsNamespaceRequest): Future[js.Object] = service.deleteRuleGroupsNamespace(params).promise().toFuture
    @inline def deleteWorkspaceFuture(params: DeleteWorkspaceRequest): Future[js.Object] = service.deleteWorkspace(params).promise().toFuture
    @inline def describeAlertManagerDefinitionFuture(params: DescribeAlertManagerDefinitionRequest): Future[DescribeAlertManagerDefinitionResponse] = service.describeAlertManagerDefinition(params).promise().toFuture
    @inline def describeRuleGroupsNamespaceFuture(params: DescribeRuleGroupsNamespaceRequest): Future[DescribeRuleGroupsNamespaceResponse] = service.describeRuleGroupsNamespace(params).promise().toFuture
    @inline def describeWorkspaceFuture(params: DescribeWorkspaceRequest): Future[DescribeWorkspaceResponse] = service.describeWorkspace(params).promise().toFuture
    @inline def listRuleGroupsNamespacesFuture(params: ListRuleGroupsNamespacesRequest): Future[ListRuleGroupsNamespacesResponse] = service.listRuleGroupsNamespaces(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listWorkspacesFuture(params: ListWorkspacesRequest): Future[ListWorkspacesResponse] = service.listWorkspaces(params).promise().toFuture
    @inline def putAlertManagerDefinitionFuture(params: PutAlertManagerDefinitionRequest): Future[PutAlertManagerDefinitionResponse] = service.putAlertManagerDefinition(params).promise().toFuture
    @inline def putRuleGroupsNamespaceFuture(params: PutRuleGroupsNamespaceRequest): Future[PutRuleGroupsNamespaceResponse] = service.putRuleGroupsNamespace(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateWorkspaceAliasFuture(params: UpdateWorkspaceAliasRequest): Future[js.Object] = service.updateWorkspaceAlias(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/amp", JSImport.Namespace, "AWS.Amp")
  class Amp() extends js.Object {
    def this(config: AWSConfig) = this()

    def createAlertManagerDefinition(params: CreateAlertManagerDefinitionRequest): Request[CreateAlertManagerDefinitionResponse] = js.native
    def createRuleGroupsNamespace(params: CreateRuleGroupsNamespaceRequest): Request[CreateRuleGroupsNamespaceResponse] = js.native
    def createWorkspace(params: CreateWorkspaceRequest): Request[CreateWorkspaceResponse] = js.native
    def deleteAlertManagerDefinition(params: DeleteAlertManagerDefinitionRequest): Request[js.Object] = js.native
    def deleteRuleGroupsNamespace(params: DeleteRuleGroupsNamespaceRequest): Request[js.Object] = js.native
    def deleteWorkspace(params: DeleteWorkspaceRequest): Request[js.Object] = js.native
    def describeAlertManagerDefinition(params: DescribeAlertManagerDefinitionRequest): Request[DescribeAlertManagerDefinitionResponse] = js.native
    def describeRuleGroupsNamespace(params: DescribeRuleGroupsNamespaceRequest): Request[DescribeRuleGroupsNamespaceResponse] = js.native
    def describeWorkspace(params: DescribeWorkspaceRequest): Request[DescribeWorkspaceResponse] = js.native
    def listRuleGroupsNamespaces(params: ListRuleGroupsNamespacesRequest): Request[ListRuleGroupsNamespacesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listWorkspaces(params: ListWorkspacesRequest): Request[ListWorkspacesResponse] = js.native
    def putAlertManagerDefinition(params: PutAlertManagerDefinitionRequest): Request[PutAlertManagerDefinitionResponse] = js.native
    def putRuleGroupsNamespace(params: PutRuleGroupsNamespaceRequest): Request[PutRuleGroupsNamespaceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateWorkspaceAlias(params: UpdateWorkspaceAliasRequest): Request[js.Object] = js.native
  }
  object Amp {
    @inline implicit def toOps(service: Amp): AmpOps = {
      new AmpOps(service)
    }
  }

  /** Represents the properties of an alert manager definition.
    */
  @js.native
  trait AlertManagerDefinitionDescription extends js.Object {
    var createdAt: Timestamp
    var data: AlertManagerDefinitionData
    var modifiedAt: Timestamp
    var status: AlertManagerDefinitionStatus
  }

  object AlertManagerDefinitionDescription {
    @inline
    def apply(
        createdAt: Timestamp,
        data: AlertManagerDefinitionData,
        modifiedAt: Timestamp,
        status: AlertManagerDefinitionStatus
    ): AlertManagerDefinitionDescription = {
      val __obj = js.Dynamic.literal(
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "data" -> data.asInstanceOf[js.Any],
        "modifiedAt" -> modifiedAt.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AlertManagerDefinitionDescription]
    }
  }

  /** Represents the status of a definition.
    */
  @js.native
  trait AlertManagerDefinitionStatus extends js.Object {
    var statusCode: AlertManagerDefinitionStatusCode
    var statusReason: js.UndefOr[String]
  }

  object AlertManagerDefinitionStatus {
    @inline
    def apply(
        statusCode: AlertManagerDefinitionStatusCode,
        statusReason: js.UndefOr[String] = js.undefined
    ): AlertManagerDefinitionStatus = {
      val __obj = js.Dynamic.literal(
        "statusCode" -> statusCode.asInstanceOf[js.Any]
      )

      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlertManagerDefinitionStatus]
    }
  }

  /** Represents the input of a CreateAlertManagerDefinition operation.
    */
  @js.native
  trait CreateAlertManagerDefinitionRequest extends js.Object {
    var data: AlertManagerDefinitionData
    var workspaceId: WorkspaceId
    var clientToken: js.UndefOr[IdempotencyToken]
  }

  object CreateAlertManagerDefinitionRequest {
    @inline
    def apply(
        data: AlertManagerDefinitionData,
        workspaceId: WorkspaceId,
        clientToken: js.UndefOr[IdempotencyToken] = js.undefined
    ): CreateAlertManagerDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "data" -> data.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAlertManagerDefinitionRequest]
    }
  }

  /** Represents the output of a CreateAlertManagerDefinition operation.
    */
  @js.native
  trait CreateAlertManagerDefinitionResponse extends js.Object {
    var status: AlertManagerDefinitionStatus
  }

  object CreateAlertManagerDefinitionResponse {
    @inline
    def apply(
        status: AlertManagerDefinitionStatus
    ): CreateAlertManagerDefinitionResponse = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateAlertManagerDefinitionResponse]
    }
  }

  /** Represents the input of a CreateRuleGroupsNamespace operation.
    */
  @js.native
  trait CreateRuleGroupsNamespaceRequest extends js.Object {
    var data: RuleGroupsNamespaceData
    var name: RuleGroupsNamespaceName
    var workspaceId: WorkspaceId
    var clientToken: js.UndefOr[IdempotencyToken]
    var tags: js.UndefOr[TagMap]
  }

  object CreateRuleGroupsNamespaceRequest {
    @inline
    def apply(
        data: RuleGroupsNamespaceData,
        name: RuleGroupsNamespaceName,
        workspaceId: WorkspaceId,
        clientToken: js.UndefOr[IdempotencyToken] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateRuleGroupsNamespaceRequest = {
      val __obj = js.Dynamic.literal(
        "data" -> data.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRuleGroupsNamespaceRequest]
    }
  }

  /** Represents the output of a CreateRuleGroupsNamespace operation.
    */
  @js.native
  trait CreateRuleGroupsNamespaceResponse extends js.Object {
    var arn: RuleGroupsNamespaceArn
    var name: RuleGroupsNamespaceName
    var status: RuleGroupsNamespaceStatus
    var tags: js.UndefOr[TagMap]
  }

  object CreateRuleGroupsNamespaceResponse {
    @inline
    def apply(
        arn: RuleGroupsNamespaceArn,
        name: RuleGroupsNamespaceName,
        status: RuleGroupsNamespaceStatus,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateRuleGroupsNamespaceResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRuleGroupsNamespaceResponse]
    }
  }

  /** Represents the input of a CreateWorkspace operation.
    */
  @js.native
  trait CreateWorkspaceRequest extends js.Object {
    var alias: js.UndefOr[WorkspaceAlias]
    var clientToken: js.UndefOr[IdempotencyToken]
    var tags: js.UndefOr[TagMap]
  }

  object CreateWorkspaceRequest {
    @inline
    def apply(
        alias: js.UndefOr[WorkspaceAlias] = js.undefined,
        clientToken: js.UndefOr[IdempotencyToken] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateWorkspaceRequest = {
      val __obj = js.Dynamic.literal()
      alias.foreach(__v => __obj.updateDynamic("alias")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkspaceRequest]
    }
  }

  /** Represents the output of a CreateWorkspace operation.
    */
  @js.native
  trait CreateWorkspaceResponse extends js.Object {
    var arn: WorkspaceArn
    var status: WorkspaceStatus
    var workspaceId: WorkspaceId
    var tags: js.UndefOr[TagMap]
  }

  object CreateWorkspaceResponse {
    @inline
    def apply(
        arn: WorkspaceArn,
        status: WorkspaceStatus,
        workspaceId: WorkspaceId,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateWorkspaceResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkspaceResponse]
    }
  }

  /** Represents the input of a DeleteAlertManagerDefinition operation.
    */
  @js.native
  trait DeleteAlertManagerDefinitionRequest extends js.Object {
    var workspaceId: WorkspaceId
    var clientToken: js.UndefOr[IdempotencyToken]
  }

  object DeleteAlertManagerDefinitionRequest {
    @inline
    def apply(
        workspaceId: WorkspaceId,
        clientToken: js.UndefOr[IdempotencyToken] = js.undefined
    ): DeleteAlertManagerDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAlertManagerDefinitionRequest]
    }
  }

  /** Represents the input of a DeleteRuleGroupsNamespace operation.
    */
  @js.native
  trait DeleteRuleGroupsNamespaceRequest extends js.Object {
    var name: RuleGroupsNamespaceName
    var workspaceId: WorkspaceId
    var clientToken: js.UndefOr[IdempotencyToken]
  }

  object DeleteRuleGroupsNamespaceRequest {
    @inline
    def apply(
        name: RuleGroupsNamespaceName,
        workspaceId: WorkspaceId,
        clientToken: js.UndefOr[IdempotencyToken] = js.undefined
    ): DeleteRuleGroupsNamespaceRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRuleGroupsNamespaceRequest]
    }
  }

  /** Represents the input of a DeleteWorkspace operation.
    */
  @js.native
  trait DeleteWorkspaceRequest extends js.Object {
    var workspaceId: WorkspaceId
    var clientToken: js.UndefOr[IdempotencyToken]
  }

  object DeleteWorkspaceRequest {
    @inline
    def apply(
        workspaceId: WorkspaceId,
        clientToken: js.UndefOr[IdempotencyToken] = js.undefined
    ): DeleteWorkspaceRequest = {
      val __obj = js.Dynamic.literal(
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteWorkspaceRequest]
    }
  }

  /** Represents the input of a DescribeAlertManagerDefinition operation.
    */
  @js.native
  trait DescribeAlertManagerDefinitionRequest extends js.Object {
    var workspaceId: WorkspaceId
  }

  object DescribeAlertManagerDefinitionRequest {
    @inline
    def apply(
        workspaceId: WorkspaceId
    ): DescribeAlertManagerDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAlertManagerDefinitionRequest]
    }
  }

  /** Represents the output of a DescribeAlertManagerDefinition operation.
    */
  @js.native
  trait DescribeAlertManagerDefinitionResponse extends js.Object {
    var alertManagerDefinition: AlertManagerDefinitionDescription
  }

  object DescribeAlertManagerDefinitionResponse {
    @inline
    def apply(
        alertManagerDefinition: AlertManagerDefinitionDescription
    ): DescribeAlertManagerDefinitionResponse = {
      val __obj = js.Dynamic.literal(
        "alertManagerDefinition" -> alertManagerDefinition.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAlertManagerDefinitionResponse]
    }
  }

  /** Represents the input of a DescribeRuleGroupsNamespace operation.
    */
  @js.native
  trait DescribeRuleGroupsNamespaceRequest extends js.Object {
    var name: RuleGroupsNamespaceName
    var workspaceId: WorkspaceId
  }

  object DescribeRuleGroupsNamespaceRequest {
    @inline
    def apply(
        name: RuleGroupsNamespaceName,
        workspaceId: WorkspaceId
    ): DescribeRuleGroupsNamespaceRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeRuleGroupsNamespaceRequest]
    }
  }

  /** Represents the output of a DescribeRuleGroupsNamespace operation.
    */
  @js.native
  trait DescribeRuleGroupsNamespaceResponse extends js.Object {
    var ruleGroupsNamespace: RuleGroupsNamespaceDescription
  }

  object DescribeRuleGroupsNamespaceResponse {
    @inline
    def apply(
        ruleGroupsNamespace: RuleGroupsNamespaceDescription
    ): DescribeRuleGroupsNamespaceResponse = {
      val __obj = js.Dynamic.literal(
        "ruleGroupsNamespace" -> ruleGroupsNamespace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeRuleGroupsNamespaceResponse]
    }
  }

  /** Represents the input of a DescribeWorkspace operation.
    */
  @js.native
  trait DescribeWorkspaceRequest extends js.Object {
    var workspaceId: WorkspaceId
  }

  object DescribeWorkspaceRequest {
    @inline
    def apply(
        workspaceId: WorkspaceId
    ): DescribeWorkspaceRequest = {
      val __obj = js.Dynamic.literal(
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeWorkspaceRequest]
    }
  }

  /** Represents the output of a DescribeWorkspace operation.
    */
  @js.native
  trait DescribeWorkspaceResponse extends js.Object {
    var workspace: WorkspaceDescription
  }

  object DescribeWorkspaceResponse {
    @inline
    def apply(
        workspace: WorkspaceDescription
    ): DescribeWorkspaceResponse = {
      val __obj = js.Dynamic.literal(
        "workspace" -> workspace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeWorkspaceResponse]
    }
  }

  /** Represents the input of a ListRuleGroupsNamespaces operation.
    */
  @js.native
  trait ListRuleGroupsNamespacesRequest extends js.Object {
    var workspaceId: WorkspaceId
    var maxResults: js.UndefOr[ListRuleGroupsNamespacesRequestMaxResultsInteger]
    var name: js.UndefOr[RuleGroupsNamespaceName]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListRuleGroupsNamespacesRequest {
    @inline
    def apply(
        workspaceId: WorkspaceId,
        maxResults: js.UndefOr[ListRuleGroupsNamespacesRequestMaxResultsInteger] = js.undefined,
        name: js.UndefOr[RuleGroupsNamespaceName] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListRuleGroupsNamespacesRequest = {
      val __obj = js.Dynamic.literal(
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRuleGroupsNamespacesRequest]
    }
  }

  /** Represents the output of a ListRuleGroupsNamespaces operation.
    */
  @js.native
  trait ListRuleGroupsNamespacesResponse extends js.Object {
    var ruleGroupsNamespaces: RuleGroupsNamespaceSummaryList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListRuleGroupsNamespacesResponse {
    @inline
    def apply(
        ruleGroupsNamespaces: RuleGroupsNamespaceSummaryList,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListRuleGroupsNamespacesResponse = {
      val __obj = js.Dynamic.literal(
        "ruleGroupsNamespaces" -> ruleGroupsNamespaces.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRuleGroupsNamespacesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: String
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: String
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Represents the input of a ListWorkspaces operation.
    */
  @js.native
  trait ListWorkspacesRequest extends js.Object {
    var alias: js.UndefOr[WorkspaceAlias]
    var maxResults: js.UndefOr[ListWorkspacesRequestMaxResultsInteger]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListWorkspacesRequest {
    @inline
    def apply(
        alias: js.UndefOr[WorkspaceAlias] = js.undefined,
        maxResults: js.UndefOr[ListWorkspacesRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListWorkspacesRequest = {
      val __obj = js.Dynamic.literal()
      alias.foreach(__v => __obj.updateDynamic("alias")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkspacesRequest]
    }
  }

  /** Represents the output of a ListWorkspaces operation.
    */
  @js.native
  trait ListWorkspacesResponse extends js.Object {
    var workspaces: WorkspaceSummaryList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListWorkspacesResponse {
    @inline
    def apply(
        workspaces: WorkspaceSummaryList,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListWorkspacesResponse = {
      val __obj = js.Dynamic.literal(
        "workspaces" -> workspaces.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkspacesResponse]
    }
  }

  /** Represents the input of a PutAlertManagerDefinition operation.
    */
  @js.native
  trait PutAlertManagerDefinitionRequest extends js.Object {
    var data: AlertManagerDefinitionData
    var workspaceId: WorkspaceId
    var clientToken: js.UndefOr[IdempotencyToken]
  }

  object PutAlertManagerDefinitionRequest {
    @inline
    def apply(
        data: AlertManagerDefinitionData,
        workspaceId: WorkspaceId,
        clientToken: js.UndefOr[IdempotencyToken] = js.undefined
    ): PutAlertManagerDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "data" -> data.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAlertManagerDefinitionRequest]
    }
  }

  /** Represents the output of a PutAlertManagerDefinition operation.
    */
  @js.native
  trait PutAlertManagerDefinitionResponse extends js.Object {
    var status: AlertManagerDefinitionStatus
  }

  object PutAlertManagerDefinitionResponse {
    @inline
    def apply(
        status: AlertManagerDefinitionStatus
    ): PutAlertManagerDefinitionResponse = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutAlertManagerDefinitionResponse]
    }
  }

  /** Represents the input of a PutRuleGroupsNamespace operation.
    */
  @js.native
  trait PutRuleGroupsNamespaceRequest extends js.Object {
    var data: RuleGroupsNamespaceData
    var name: RuleGroupsNamespaceName
    var workspaceId: WorkspaceId
    var clientToken: js.UndefOr[IdempotencyToken]
  }

  object PutRuleGroupsNamespaceRequest {
    @inline
    def apply(
        data: RuleGroupsNamespaceData,
        name: RuleGroupsNamespaceName,
        workspaceId: WorkspaceId,
        clientToken: js.UndefOr[IdempotencyToken] = js.undefined
    ): PutRuleGroupsNamespaceRequest = {
      val __obj = js.Dynamic.literal(
        "data" -> data.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRuleGroupsNamespaceRequest]
    }
  }

  /** Represents the output of a PutRuleGroupsNamespace operation.
    */
  @js.native
  trait PutRuleGroupsNamespaceResponse extends js.Object {
    var arn: RuleGroupsNamespaceArn
    var name: RuleGroupsNamespaceName
    var status: RuleGroupsNamespaceStatus
    var tags: js.UndefOr[TagMap]
  }

  object PutRuleGroupsNamespaceResponse {
    @inline
    def apply(
        arn: RuleGroupsNamespaceArn,
        name: RuleGroupsNamespaceName,
        status: RuleGroupsNamespaceStatus,
        tags: js.UndefOr[TagMap] = js.undefined
    ): PutRuleGroupsNamespaceResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRuleGroupsNamespaceResponse]
    }
  }

  /** Represents a description of the rule groups namespace.
    */
  @js.native
  trait RuleGroupsNamespaceDescription extends js.Object {
    var arn: RuleGroupsNamespaceArn
    var createdAt: Timestamp
    var data: RuleGroupsNamespaceData
    var modifiedAt: Timestamp
    var name: RuleGroupsNamespaceName
    var status: RuleGroupsNamespaceStatus
    var tags: js.UndefOr[TagMap]
  }

  object RuleGroupsNamespaceDescription {
    @inline
    def apply(
        arn: RuleGroupsNamespaceArn,
        createdAt: Timestamp,
        data: RuleGroupsNamespaceData,
        modifiedAt: Timestamp,
        name: RuleGroupsNamespaceName,
        status: RuleGroupsNamespaceStatus,
        tags: js.UndefOr[TagMap] = js.undefined
    ): RuleGroupsNamespaceDescription = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "data" -> data.asInstanceOf[js.Any],
        "modifiedAt" -> modifiedAt.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupsNamespaceDescription]
    }
  }

  /** Represents the status of a namespace.
    */
  @js.native
  trait RuleGroupsNamespaceStatus extends js.Object {
    var statusCode: RuleGroupsNamespaceStatusCode
    var statusReason: js.UndefOr[String]
  }

  object RuleGroupsNamespaceStatus {
    @inline
    def apply(
        statusCode: RuleGroupsNamespaceStatusCode,
        statusReason: js.UndefOr[String] = js.undefined
    ): RuleGroupsNamespaceStatus = {
      val __obj = js.Dynamic.literal(
        "statusCode" -> statusCode.asInstanceOf[js.Any]
      )

      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupsNamespaceStatus]
    }
  }

  /** Represents a summary of the rule groups namespace.
    */
  @js.native
  trait RuleGroupsNamespaceSummary extends js.Object {
    var arn: RuleGroupsNamespaceArn
    var createdAt: Timestamp
    var modifiedAt: Timestamp
    var name: RuleGroupsNamespaceName
    var status: RuleGroupsNamespaceStatus
    var tags: js.UndefOr[TagMap]
  }

  object RuleGroupsNamespaceSummary {
    @inline
    def apply(
        arn: RuleGroupsNamespaceArn,
        createdAt: Timestamp,
        modifiedAt: Timestamp,
        name: RuleGroupsNamespaceName,
        status: RuleGroupsNamespaceStatus,
        tags: js.UndefOr[TagMap] = js.undefined
    ): RuleGroupsNamespaceSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "modifiedAt" -> modifiedAt.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupsNamespaceSummary]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: String
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: String,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
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
    var resourceArn: String
    var tagKeys: TagKeys
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: String,
        tagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
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

  /** Represents the input of an UpdateWorkspaceAlias operation.
    */
  @js.native
  trait UpdateWorkspaceAliasRequest extends js.Object {
    var workspaceId: WorkspaceId
    var alias: js.UndefOr[WorkspaceAlias]
    var clientToken: js.UndefOr[IdempotencyToken]
  }

  object UpdateWorkspaceAliasRequest {
    @inline
    def apply(
        workspaceId: WorkspaceId,
        alias: js.UndefOr[WorkspaceAlias] = js.undefined,
        clientToken: js.UndefOr[IdempotencyToken] = js.undefined
    ): UpdateWorkspaceAliasRequest = {
      val __obj = js.Dynamic.literal(
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      alias.foreach(__v => __obj.updateDynamic("alias")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkspaceAliasRequest]
    }
  }

  /** Represents the properties of a workspace.
    */
  @js.native
  trait WorkspaceDescription extends js.Object {
    var arn: WorkspaceArn
    var createdAt: Timestamp
    var status: WorkspaceStatus
    var workspaceId: WorkspaceId
    var alias: js.UndefOr[WorkspaceAlias]
    var prometheusEndpoint: js.UndefOr[Uri]
    var tags: js.UndefOr[TagMap]
  }

  object WorkspaceDescription {
    @inline
    def apply(
        arn: WorkspaceArn,
        createdAt: Timestamp,
        status: WorkspaceStatus,
        workspaceId: WorkspaceId,
        alias: js.UndefOr[WorkspaceAlias] = js.undefined,
        prometheusEndpoint: js.UndefOr[Uri] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): WorkspaceDescription = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      alias.foreach(__v => __obj.updateDynamic("alias")(__v.asInstanceOf[js.Any]))
      prometheusEndpoint.foreach(__v => __obj.updateDynamic("prometheusEndpoint")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkspaceDescription]
    }
  }

  /** Represents the status of a workspace.
    */
  @js.native
  trait WorkspaceStatus extends js.Object {
    var statusCode: WorkspaceStatusCode
  }

  object WorkspaceStatus {
    @inline
    def apply(
        statusCode: WorkspaceStatusCode
    ): WorkspaceStatus = {
      val __obj = js.Dynamic.literal(
        "statusCode" -> statusCode.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[WorkspaceStatus]
    }
  }

  /** Represents a summary of the properties of a workspace.
    */
  @js.native
  trait WorkspaceSummary extends js.Object {
    var arn: WorkspaceArn
    var createdAt: Timestamp
    var status: WorkspaceStatus
    var workspaceId: WorkspaceId
    var alias: js.UndefOr[WorkspaceAlias]
    var tags: js.UndefOr[TagMap]
  }

  object WorkspaceSummary {
    @inline
    def apply(
        arn: WorkspaceArn,
        createdAt: Timestamp,
        status: WorkspaceStatus,
        workspaceId: WorkspaceId,
        alias: js.UndefOr[WorkspaceAlias] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): WorkspaceSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      alias.foreach(__v => __obj.updateDynamic("alias")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkspaceSummary]
    }
  }
}
