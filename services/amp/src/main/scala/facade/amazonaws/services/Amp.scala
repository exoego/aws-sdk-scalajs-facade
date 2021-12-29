package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object amp {
  type IdempotencyToken = String
  type ListWorkspacesRequestMaxResultsInteger = Int
  type PaginationToken = String
  type Timestamp = js.Date
  type Uri = String
  type WorkspaceAlias = String
  type WorkspaceArn = String
  type WorkspaceId = String
  type WorkspaceSummaryList = js.Array[WorkspaceSummary]

  final class AmpOps(private val service: Amp) extends AnyVal {

    @inline def createWorkspaceFuture(params: CreateWorkspaceRequest): Future[CreateWorkspaceResponse] = service.createWorkspace(params).promise().toFuture
    @inline def deleteWorkspaceFuture(params: DeleteWorkspaceRequest): Future[js.Object] = service.deleteWorkspace(params).promise().toFuture
    @inline def describeWorkspaceFuture(params: DescribeWorkspaceRequest): Future[DescribeWorkspaceResponse] = service.describeWorkspace(params).promise().toFuture
    @inline def listWorkspacesFuture(params: ListWorkspacesRequest): Future[ListWorkspacesResponse] = service.listWorkspaces(params).promise().toFuture
    @inline def updateWorkspaceAliasFuture(params: UpdateWorkspaceAliasRequest): Future[js.Object] = service.updateWorkspaceAlias(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/amp", JSImport.Namespace, "AWS.Amp")
  class Amp() extends js.Object {
    def this(config: AWSConfig) = this()

    def createWorkspace(params: CreateWorkspaceRequest): Request[CreateWorkspaceResponse] = js.native
    def deleteWorkspace(params: DeleteWorkspaceRequest): Request[js.Object] = js.native
    def describeWorkspace(params: DescribeWorkspaceRequest): Request[DescribeWorkspaceResponse] = js.native
    def listWorkspaces(params: ListWorkspacesRequest): Request[ListWorkspacesResponse] = js.native
    def updateWorkspaceAlias(params: UpdateWorkspaceAliasRequest): Request[js.Object] = js.native
  }
  object Amp {
    @inline implicit def toOps(service: Amp): AmpOps = {
      new AmpOps(service)
    }
  }

  /** Represents the input of a CreateWorkspace operation.
    */
  @js.native
  trait CreateWorkspaceRequest extends js.Object {
    var alias: js.UndefOr[WorkspaceAlias]
    var clientToken: js.UndefOr[IdempotencyToken]
  }

  object CreateWorkspaceRequest {
    @inline
    def apply(
        alias: js.UndefOr[WorkspaceAlias] = js.undefined,
        clientToken: js.UndefOr[IdempotencyToken] = js.undefined
    ): CreateWorkspaceRequest = {
      val __obj = js.Dynamic.literal()
      alias.foreach(__v => __obj.updateDynamic("alias")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
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
  }

  object CreateWorkspaceResponse {
    @inline
    def apply(
        arn: WorkspaceArn,
        status: WorkspaceStatus,
        workspaceId: WorkspaceId
    ): CreateWorkspaceResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateWorkspaceResponse]
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
  }

  object WorkspaceDescription {
    @inline
    def apply(
        arn: WorkspaceArn,
        createdAt: Timestamp,
        status: WorkspaceStatus,
        workspaceId: WorkspaceId,
        alias: js.UndefOr[WorkspaceAlias] = js.undefined,
        prometheusEndpoint: js.UndefOr[Uri] = js.undefined
    ): WorkspaceDescription = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      alias.foreach(__v => __obj.updateDynamic("alias")(__v.asInstanceOf[js.Any]))
      prometheusEndpoint.foreach(__v => __obj.updateDynamic("prometheusEndpoint")(__v.asInstanceOf[js.Any]))
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
  }

  object WorkspaceSummary {
    @inline
    def apply(
        arn: WorkspaceArn,
        createdAt: Timestamp,
        status: WorkspaceStatus,
        workspaceId: WorkspaceId,
        alias: js.UndefOr[WorkspaceAlias] = js.undefined
    ): WorkspaceSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      alias.foreach(__v => __obj.updateDynamic("alias")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkspaceSummary]
    }
  }
}
