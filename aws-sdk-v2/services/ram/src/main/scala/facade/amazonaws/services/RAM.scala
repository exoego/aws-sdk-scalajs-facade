package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object ram {
  type DateTime = js.Date
  type MaxResults = Int
  type PermissionArnList = js.Array[String]
  type Policy = String
  type PolicyList = js.Array[Policy]
  type PrincipalArnOrIdList = js.Array[String]
  type PrincipalList = js.Array[Principal]
  type ResourceArnList = js.Array[String]
  type ResourceList = js.Array[Resource]
  type ResourceShareArnList = js.Array[String]
  type ResourceShareAssociationList = js.Array[ResourceShareAssociation]
  type ResourceShareInvitationArnList = js.Array[String]
  type ResourceShareInvitationList = js.Array[ResourceShareInvitation]
  type ResourceShareList = js.Array[ResourceShare]
  type ResourceSharePermissionList = js.Array[ResourceSharePermissionSummary]
  type ServiceNameAndResourceTypeList = js.Array[ServiceNameAndResourceType]
  type TagFilters = js.Array[TagFilter]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TagValueList = js.Array[TagValue]

  final class RAMOps(private val service: RAM) extends AnyVal {

    @inline def acceptResourceShareInvitationFuture(params: AcceptResourceShareInvitationRequest): Future[AcceptResourceShareInvitationResponse] = service.acceptResourceShareInvitation(params).promise().toFuture
    @inline def associateResourceShareFuture(params: AssociateResourceShareRequest): Future[AssociateResourceShareResponse] = service.associateResourceShare(params).promise().toFuture
    @inline def associateResourceSharePermissionFuture(params: AssociateResourceSharePermissionRequest): Future[AssociateResourceSharePermissionResponse] = service.associateResourceSharePermission(params).promise().toFuture
    @inline def createResourceShareFuture(params: CreateResourceShareRequest): Future[CreateResourceShareResponse] = service.createResourceShare(params).promise().toFuture
    @inline def deleteResourceShareFuture(params: DeleteResourceShareRequest): Future[DeleteResourceShareResponse] = service.deleteResourceShare(params).promise().toFuture
    @inline def disassociateResourceShareFuture(params: DisassociateResourceShareRequest): Future[DisassociateResourceShareResponse] = service.disassociateResourceShare(params).promise().toFuture
    @inline def disassociateResourceSharePermissionFuture(params: DisassociateResourceSharePermissionRequest): Future[DisassociateResourceSharePermissionResponse] = service.disassociateResourceSharePermission(params).promise().toFuture
    @inline def enableSharingWithAwsOrganizationFuture(params: EnableSharingWithAwsOrganizationRequest): Future[EnableSharingWithAwsOrganizationResponse] = service.enableSharingWithAwsOrganization(params).promise().toFuture
    @inline def getPermissionFuture(params: GetPermissionRequest): Future[GetPermissionResponse] = service.getPermission(params).promise().toFuture
    @inline def getResourcePoliciesFuture(params: GetResourcePoliciesRequest): Future[GetResourcePoliciesResponse] = service.getResourcePolicies(params).promise().toFuture
    @inline def getResourceShareAssociationsFuture(params: GetResourceShareAssociationsRequest): Future[GetResourceShareAssociationsResponse] = service.getResourceShareAssociations(params).promise().toFuture
    @inline def getResourceShareInvitationsFuture(params: GetResourceShareInvitationsRequest): Future[GetResourceShareInvitationsResponse] = service.getResourceShareInvitations(params).promise().toFuture
    @inline def getResourceSharesFuture(params: GetResourceSharesRequest): Future[GetResourceSharesResponse] = service.getResourceShares(params).promise().toFuture
    @inline def listPendingInvitationResourcesFuture(params: ListPendingInvitationResourcesRequest): Future[ListPendingInvitationResourcesResponse] = service.listPendingInvitationResources(params).promise().toFuture
    @inline def listPermissionsFuture(params: ListPermissionsRequest): Future[ListPermissionsResponse] = service.listPermissions(params).promise().toFuture
    @inline def listPrincipalsFuture(params: ListPrincipalsRequest): Future[ListPrincipalsResponse] = service.listPrincipals(params).promise().toFuture
    @inline def listResourceSharePermissionsFuture(params: ListResourceSharePermissionsRequest): Future[ListResourceSharePermissionsResponse] = service.listResourceSharePermissions(params).promise().toFuture
    @inline def listResourceTypesFuture(params: ListResourceTypesRequest): Future[ListResourceTypesResponse] = service.listResourceTypes(params).promise().toFuture
    @inline def listResourcesFuture(params: ListResourcesRequest): Future[ListResourcesResponse] = service.listResources(params).promise().toFuture
    @inline def promoteResourceShareCreatedFromPolicyFuture(params: PromoteResourceShareCreatedFromPolicyRequest): Future[PromoteResourceShareCreatedFromPolicyResponse] = service.promoteResourceShareCreatedFromPolicy(params).promise().toFuture
    @inline def rejectResourceShareInvitationFuture(params: RejectResourceShareInvitationRequest): Future[RejectResourceShareInvitationResponse] = service.rejectResourceShareInvitation(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateResourceShareFuture(params: UpdateResourceShareRequest): Future[UpdateResourceShareResponse] = service.updateResourceShare(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/ram", JSImport.Namespace, "AWS.RAM")
  class RAM() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptResourceShareInvitation(params: AcceptResourceShareInvitationRequest): Request[AcceptResourceShareInvitationResponse] = js.native
    def associateResourceShare(params: AssociateResourceShareRequest): Request[AssociateResourceShareResponse] = js.native
    def associateResourceSharePermission(params: AssociateResourceSharePermissionRequest): Request[AssociateResourceSharePermissionResponse] = js.native
    def createResourceShare(params: CreateResourceShareRequest): Request[CreateResourceShareResponse] = js.native
    def deleteResourceShare(params: DeleteResourceShareRequest): Request[DeleteResourceShareResponse] = js.native
    def disassociateResourceShare(params: DisassociateResourceShareRequest): Request[DisassociateResourceShareResponse] = js.native
    def disassociateResourceSharePermission(params: DisassociateResourceSharePermissionRequest): Request[DisassociateResourceSharePermissionResponse] = js.native
    def enableSharingWithAwsOrganization(params: EnableSharingWithAwsOrganizationRequest): Request[EnableSharingWithAwsOrganizationResponse] = js.native
    def getPermission(params: GetPermissionRequest): Request[GetPermissionResponse] = js.native
    def getResourcePolicies(params: GetResourcePoliciesRequest): Request[GetResourcePoliciesResponse] = js.native
    def getResourceShareAssociations(params: GetResourceShareAssociationsRequest): Request[GetResourceShareAssociationsResponse] = js.native
    def getResourceShareInvitations(params: GetResourceShareInvitationsRequest): Request[GetResourceShareInvitationsResponse] = js.native
    def getResourceShares(params: GetResourceSharesRequest): Request[GetResourceSharesResponse] = js.native
    def listPendingInvitationResources(params: ListPendingInvitationResourcesRequest): Request[ListPendingInvitationResourcesResponse] = js.native
    def listPermissions(params: ListPermissionsRequest): Request[ListPermissionsResponse] = js.native
    def listPrincipals(params: ListPrincipalsRequest): Request[ListPrincipalsResponse] = js.native
    def listResourceSharePermissions(params: ListResourceSharePermissionsRequest): Request[ListResourceSharePermissionsResponse] = js.native
    def listResourceTypes(params: ListResourceTypesRequest): Request[ListResourceTypesResponse] = js.native
    def listResources(params: ListResourcesRequest): Request[ListResourcesResponse] = js.native
    def promoteResourceShareCreatedFromPolicy(params: PromoteResourceShareCreatedFromPolicyRequest): Request[PromoteResourceShareCreatedFromPolicyResponse] = js.native
    def rejectResourceShareInvitation(params: RejectResourceShareInvitationRequest): Request[RejectResourceShareInvitationResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateResourceShare(params: UpdateResourceShareRequest): Request[UpdateResourceShareResponse] = js.native
  }
  object RAM {
    @inline implicit def toOps(service: RAM): RAMOps = {
      new RAMOps(service)
    }
  }

  @js.native
  trait AcceptResourceShareInvitationRequest extends js.Object {
    var resourceShareInvitationArn: String
    var clientToken: js.UndefOr[String]
  }

  object AcceptResourceShareInvitationRequest {
    @inline
    def apply(
        resourceShareInvitationArn: String,
        clientToken: js.UndefOr[String] = js.undefined
    ): AcceptResourceShareInvitationRequest = {
      val __obj = js.Dynamic.literal(
        "resourceShareInvitationArn" -> resourceShareInvitationArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcceptResourceShareInvitationRequest]
    }
  }

  @js.native
  trait AcceptResourceShareInvitationResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var resourceShareInvitation: js.UndefOr[ResourceShareInvitation]
  }

  object AcceptResourceShareInvitationResponse {
    @inline
    def apply(
        clientToken: js.UndefOr[String] = js.undefined,
        resourceShareInvitation: js.UndefOr[ResourceShareInvitation] = js.undefined
    ): AcceptResourceShareInvitationResponse = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      resourceShareInvitation.foreach(__v => __obj.updateDynamic("resourceShareInvitation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcceptResourceShareInvitationResponse]
    }
  }

  @js.native
  trait AssociateResourceSharePermissionRequest extends js.Object {
    var permissionArn: String
    var resourceShareArn: String
    var clientToken: js.UndefOr[String]
    var permissionVersion: js.UndefOr[Int]
    var replace: js.UndefOr[Boolean]
  }

  object AssociateResourceSharePermissionRequest {
    @inline
    def apply(
        permissionArn: String,
        resourceShareArn: String,
        clientToken: js.UndefOr[String] = js.undefined,
        permissionVersion: js.UndefOr[Int] = js.undefined,
        replace: js.UndefOr[Boolean] = js.undefined
    ): AssociateResourceSharePermissionRequest = {
      val __obj = js.Dynamic.literal(
        "permissionArn" -> permissionArn.asInstanceOf[js.Any],
        "resourceShareArn" -> resourceShareArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      permissionVersion.foreach(__v => __obj.updateDynamic("permissionVersion")(__v.asInstanceOf[js.Any]))
      replace.foreach(__v => __obj.updateDynamic("replace")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateResourceSharePermissionRequest]
    }
  }

  @js.native
  trait AssociateResourceSharePermissionResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var returnValue: js.UndefOr[Boolean]
  }

  object AssociateResourceSharePermissionResponse {
    @inline
    def apply(
        clientToken: js.UndefOr[String] = js.undefined,
        returnValue: js.UndefOr[Boolean] = js.undefined
    ): AssociateResourceSharePermissionResponse = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      returnValue.foreach(__v => __obj.updateDynamic("returnValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateResourceSharePermissionResponse]
    }
  }

  @js.native
  trait AssociateResourceShareRequest extends js.Object {
    var resourceShareArn: String
    var clientToken: js.UndefOr[String]
    var principals: js.UndefOr[PrincipalArnOrIdList]
    var resourceArns: js.UndefOr[ResourceArnList]
  }

  object AssociateResourceShareRequest {
    @inline
    def apply(
        resourceShareArn: String,
        clientToken: js.UndefOr[String] = js.undefined,
        principals: js.UndefOr[PrincipalArnOrIdList] = js.undefined,
        resourceArns: js.UndefOr[ResourceArnList] = js.undefined
    ): AssociateResourceShareRequest = {
      val __obj = js.Dynamic.literal(
        "resourceShareArn" -> resourceShareArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      principals.foreach(__v => __obj.updateDynamic("principals")(__v.asInstanceOf[js.Any]))
      resourceArns.foreach(__v => __obj.updateDynamic("resourceArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateResourceShareRequest]
    }
  }

  @js.native
  trait AssociateResourceShareResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList]
  }

  object AssociateResourceShareResponse {
    @inline
    def apply(
        clientToken: js.UndefOr[String] = js.undefined,
        resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.undefined
    ): AssociateResourceShareResponse = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      resourceShareAssociations.foreach(__v => __obj.updateDynamic("resourceShareAssociations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateResourceShareResponse]
    }
  }

  @js.native
  trait CreateResourceShareRequest extends js.Object {
    var name: String
    var allowExternalPrincipals: js.UndefOr[Boolean]
    var clientToken: js.UndefOr[String]
    var permissionArns: js.UndefOr[PermissionArnList]
    var principals: js.UndefOr[PrincipalArnOrIdList]
    var resourceArns: js.UndefOr[ResourceArnList]
    var tags: js.UndefOr[TagList]
  }

  object CreateResourceShareRequest {
    @inline
    def apply(
        name: String,
        allowExternalPrincipals: js.UndefOr[Boolean] = js.undefined,
        clientToken: js.UndefOr[String] = js.undefined,
        permissionArns: js.UndefOr[PermissionArnList] = js.undefined,
        principals: js.UndefOr[PrincipalArnOrIdList] = js.undefined,
        resourceArns: js.UndefOr[ResourceArnList] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateResourceShareRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      allowExternalPrincipals.foreach(__v => __obj.updateDynamic("allowExternalPrincipals")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      permissionArns.foreach(__v => __obj.updateDynamic("permissionArns")(__v.asInstanceOf[js.Any]))
      principals.foreach(__v => __obj.updateDynamic("principals")(__v.asInstanceOf[js.Any]))
      resourceArns.foreach(__v => __obj.updateDynamic("resourceArns")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResourceShareRequest]
    }
  }

  @js.native
  trait CreateResourceShareResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var resourceShare: js.UndefOr[ResourceShare]
  }

  object CreateResourceShareResponse {
    @inline
    def apply(
        clientToken: js.UndefOr[String] = js.undefined,
        resourceShare: js.UndefOr[ResourceShare] = js.undefined
    ): CreateResourceShareResponse = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      resourceShare.foreach(__v => __obj.updateDynamic("resourceShare")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResourceShareResponse]
    }
  }

  @js.native
  trait DeleteResourceShareRequest extends js.Object {
    var resourceShareArn: String
    var clientToken: js.UndefOr[String]
  }

  object DeleteResourceShareRequest {
    @inline
    def apply(
        resourceShareArn: String,
        clientToken: js.UndefOr[String] = js.undefined
    ): DeleteResourceShareRequest = {
      val __obj = js.Dynamic.literal(
        "resourceShareArn" -> resourceShareArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteResourceShareRequest]
    }
  }

  @js.native
  trait DeleteResourceShareResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var returnValue: js.UndefOr[Boolean]
  }

  object DeleteResourceShareResponse {
    @inline
    def apply(
        clientToken: js.UndefOr[String] = js.undefined,
        returnValue: js.UndefOr[Boolean] = js.undefined
    ): DeleteResourceShareResponse = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      returnValue.foreach(__v => __obj.updateDynamic("returnValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteResourceShareResponse]
    }
  }

  @js.native
  trait DisassociateResourceSharePermissionRequest extends js.Object {
    var permissionArn: String
    var resourceShareArn: String
    var clientToken: js.UndefOr[String]
  }

  object DisassociateResourceSharePermissionRequest {
    @inline
    def apply(
        permissionArn: String,
        resourceShareArn: String,
        clientToken: js.UndefOr[String] = js.undefined
    ): DisassociateResourceSharePermissionRequest = {
      val __obj = js.Dynamic.literal(
        "permissionArn" -> permissionArn.asInstanceOf[js.Any],
        "resourceShareArn" -> resourceShareArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateResourceSharePermissionRequest]
    }
  }

  @js.native
  trait DisassociateResourceSharePermissionResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var returnValue: js.UndefOr[Boolean]
  }

  object DisassociateResourceSharePermissionResponse {
    @inline
    def apply(
        clientToken: js.UndefOr[String] = js.undefined,
        returnValue: js.UndefOr[Boolean] = js.undefined
    ): DisassociateResourceSharePermissionResponse = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      returnValue.foreach(__v => __obj.updateDynamic("returnValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateResourceSharePermissionResponse]
    }
  }

  @js.native
  trait DisassociateResourceShareRequest extends js.Object {
    var resourceShareArn: String
    var clientToken: js.UndefOr[String]
    var principals: js.UndefOr[PrincipalArnOrIdList]
    var resourceArns: js.UndefOr[ResourceArnList]
  }

  object DisassociateResourceShareRequest {
    @inline
    def apply(
        resourceShareArn: String,
        clientToken: js.UndefOr[String] = js.undefined,
        principals: js.UndefOr[PrincipalArnOrIdList] = js.undefined,
        resourceArns: js.UndefOr[ResourceArnList] = js.undefined
    ): DisassociateResourceShareRequest = {
      val __obj = js.Dynamic.literal(
        "resourceShareArn" -> resourceShareArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      principals.foreach(__v => __obj.updateDynamic("principals")(__v.asInstanceOf[js.Any]))
      resourceArns.foreach(__v => __obj.updateDynamic("resourceArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateResourceShareRequest]
    }
  }

  @js.native
  trait DisassociateResourceShareResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList]
  }

  object DisassociateResourceShareResponse {
    @inline
    def apply(
        clientToken: js.UndefOr[String] = js.undefined,
        resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.undefined
    ): DisassociateResourceShareResponse = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      resourceShareAssociations.foreach(__v => __obj.updateDynamic("resourceShareAssociations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateResourceShareResponse]
    }
  }

  @js.native
  trait EnableSharingWithAwsOrganizationRequest extends js.Object

  object EnableSharingWithAwsOrganizationRequest {
    @inline
    def apply(): EnableSharingWithAwsOrganizationRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnableSharingWithAwsOrganizationRequest]
    }
  }

  @js.native
  trait EnableSharingWithAwsOrganizationResponse extends js.Object {
    var returnValue: js.UndefOr[Boolean]
  }

  object EnableSharingWithAwsOrganizationResponse {
    @inline
    def apply(
        returnValue: js.UndefOr[Boolean] = js.undefined
    ): EnableSharingWithAwsOrganizationResponse = {
      val __obj = js.Dynamic.literal()
      returnValue.foreach(__v => __obj.updateDynamic("returnValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableSharingWithAwsOrganizationResponse]
    }
  }

  @js.native
  trait GetPermissionRequest extends js.Object {
    var permissionArn: String
    var permissionVersion: js.UndefOr[Int]
  }

  object GetPermissionRequest {
    @inline
    def apply(
        permissionArn: String,
        permissionVersion: js.UndefOr[Int] = js.undefined
    ): GetPermissionRequest = {
      val __obj = js.Dynamic.literal(
        "permissionArn" -> permissionArn.asInstanceOf[js.Any]
      )

      permissionVersion.foreach(__v => __obj.updateDynamic("permissionVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPermissionRequest]
    }
  }

  @js.native
  trait GetPermissionResponse extends js.Object {
    var permission: js.UndefOr[ResourceSharePermissionDetail]
  }

  object GetPermissionResponse {
    @inline
    def apply(
        permission: js.UndefOr[ResourceSharePermissionDetail] = js.undefined
    ): GetPermissionResponse = {
      val __obj = js.Dynamic.literal()
      permission.foreach(__v => __obj.updateDynamic("permission")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPermissionResponse]
    }
  }

  @js.native
  trait GetResourcePoliciesRequest extends js.Object {
    var resourceArns: ResourceArnList
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
    var principal: js.UndefOr[String]
  }

  object GetResourcePoliciesRequest {
    @inline
    def apply(
        resourceArns: ResourceArnList,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        principal: js.UndefOr[String] = js.undefined
    ): GetResourcePoliciesRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArns" -> resourceArns.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      principal.foreach(__v => __obj.updateDynamic("principal")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcePoliciesRequest]
    }
  }

  @js.native
  trait GetResourcePoliciesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var policies: js.UndefOr[PolicyList]
  }

  object GetResourcePoliciesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        policies: js.UndefOr[PolicyList] = js.undefined
    ): GetResourcePoliciesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      policies.foreach(__v => __obj.updateDynamic("policies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcePoliciesResponse]
    }
  }

  @js.native
  trait GetResourceShareAssociationsRequest extends js.Object {
    var associationType: ResourceShareAssociationType
    var associationStatus: js.UndefOr[ResourceShareAssociationStatus]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
    var principal: js.UndefOr[String]
    var resourceArn: js.UndefOr[String]
    var resourceShareArns: js.UndefOr[ResourceShareArnList]
  }

  object GetResourceShareAssociationsRequest {
    @inline
    def apply(
        associationType: ResourceShareAssociationType,
        associationStatus: js.UndefOr[ResourceShareAssociationStatus] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        principal: js.UndefOr[String] = js.undefined,
        resourceArn: js.UndefOr[String] = js.undefined,
        resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined
    ): GetResourceShareAssociationsRequest = {
      val __obj = js.Dynamic.literal(
        "associationType" -> associationType.asInstanceOf[js.Any]
      )

      associationStatus.foreach(__v => __obj.updateDynamic("associationStatus")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      principal.foreach(__v => __obj.updateDynamic("principal")(__v.asInstanceOf[js.Any]))
      resourceArn.foreach(__v => __obj.updateDynamic("resourceArn")(__v.asInstanceOf[js.Any]))
      resourceShareArns.foreach(__v => __obj.updateDynamic("resourceShareArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceShareAssociationsRequest]
    }
  }

  @js.native
  trait GetResourceShareAssociationsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList]
  }

  object GetResourceShareAssociationsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.undefined
    ): GetResourceShareAssociationsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resourceShareAssociations.foreach(__v => __obj.updateDynamic("resourceShareAssociations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceShareAssociationsResponse]
    }
  }

  @js.native
  trait GetResourceShareInvitationsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
    var resourceShareArns: js.UndefOr[ResourceShareArnList]
    var resourceShareInvitationArns: js.UndefOr[ResourceShareInvitationArnList]
  }

  object GetResourceShareInvitationsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined,
        resourceShareInvitationArns: js.UndefOr[ResourceShareInvitationArnList] = js.undefined
    ): GetResourceShareInvitationsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resourceShareArns.foreach(__v => __obj.updateDynamic("resourceShareArns")(__v.asInstanceOf[js.Any]))
      resourceShareInvitationArns.foreach(__v => __obj.updateDynamic("resourceShareInvitationArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceShareInvitationsRequest]
    }
  }

  @js.native
  trait GetResourceShareInvitationsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var resourceShareInvitations: js.UndefOr[ResourceShareInvitationList]
  }

  object GetResourceShareInvitationsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        resourceShareInvitations: js.UndefOr[ResourceShareInvitationList] = js.undefined
    ): GetResourceShareInvitationsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resourceShareInvitations.foreach(__v => __obj.updateDynamic("resourceShareInvitations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceShareInvitationsResponse]
    }
  }

  @js.native
  trait GetResourceSharesRequest extends js.Object {
    var resourceOwner: ResourceOwner
    var maxResults: js.UndefOr[MaxResults]
    var name: js.UndefOr[String]
    var nextToken: js.UndefOr[String]
    var permissionArn: js.UndefOr[String]
    var resourceShareArns: js.UndefOr[ResourceShareArnList]
    var resourceShareStatus: js.UndefOr[ResourceShareStatus]
    var tagFilters: js.UndefOr[TagFilters]
  }

  object GetResourceSharesRequest {
    @inline
    def apply(
        resourceOwner: ResourceOwner,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        permissionArn: js.UndefOr[String] = js.undefined,
        resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined,
        resourceShareStatus: js.UndefOr[ResourceShareStatus] = js.undefined,
        tagFilters: js.UndefOr[TagFilters] = js.undefined
    ): GetResourceSharesRequest = {
      val __obj = js.Dynamic.literal(
        "resourceOwner" -> resourceOwner.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      permissionArn.foreach(__v => __obj.updateDynamic("permissionArn")(__v.asInstanceOf[js.Any]))
      resourceShareArns.foreach(__v => __obj.updateDynamic("resourceShareArns")(__v.asInstanceOf[js.Any]))
      resourceShareStatus.foreach(__v => __obj.updateDynamic("resourceShareStatus")(__v.asInstanceOf[js.Any]))
      tagFilters.foreach(__v => __obj.updateDynamic("tagFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceSharesRequest]
    }
  }

  @js.native
  trait GetResourceSharesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var resourceShares: js.UndefOr[ResourceShareList]
  }

  object GetResourceSharesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        resourceShares: js.UndefOr[ResourceShareList] = js.undefined
    ): GetResourceSharesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resourceShares.foreach(__v => __obj.updateDynamic("resourceShares")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceSharesResponse]
    }
  }

  @js.native
  trait ListPendingInvitationResourcesRequest extends js.Object {
    var resourceShareInvitationArn: String
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
    var resourceRegionScope: js.UndefOr[ResourceRegionScopeFilter]
  }

  object ListPendingInvitationResourcesRequest {
    @inline
    def apply(
        resourceShareInvitationArn: String,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        resourceRegionScope: js.UndefOr[ResourceRegionScopeFilter] = js.undefined
    ): ListPendingInvitationResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "resourceShareInvitationArn" -> resourceShareInvitationArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resourceRegionScope.foreach(__v => __obj.updateDynamic("resourceRegionScope")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPendingInvitationResourcesRequest]
    }
  }

  @js.native
  trait ListPendingInvitationResourcesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var resources: js.UndefOr[ResourceList]
  }

  object ListPendingInvitationResourcesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        resources: js.UndefOr[ResourceList] = js.undefined
    ): ListPendingInvitationResourcesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resources.foreach(__v => __obj.updateDynamic("resources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPendingInvitationResourcesResponse]
    }
  }

  @js.native
  trait ListPermissionsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
    var resourceType: js.UndefOr[String]
  }

  object ListPermissionsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        resourceType: js.UndefOr[String] = js.undefined
    ): ListPermissionsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPermissionsRequest]
    }
  }

  @js.native
  trait ListPermissionsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var permissions: js.UndefOr[ResourceSharePermissionList]
  }

  object ListPermissionsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        permissions: js.UndefOr[ResourceSharePermissionList] = js.undefined
    ): ListPermissionsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      permissions.foreach(__v => __obj.updateDynamic("permissions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPermissionsResponse]
    }
  }

  @js.native
  trait ListPrincipalsRequest extends js.Object {
    var resourceOwner: ResourceOwner
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
    var principals: js.UndefOr[PrincipalArnOrIdList]
    var resourceArn: js.UndefOr[String]
    var resourceShareArns: js.UndefOr[ResourceShareArnList]
    var resourceType: js.UndefOr[String]
  }

  object ListPrincipalsRequest {
    @inline
    def apply(
        resourceOwner: ResourceOwner,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        principals: js.UndefOr[PrincipalArnOrIdList] = js.undefined,
        resourceArn: js.UndefOr[String] = js.undefined,
        resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined,
        resourceType: js.UndefOr[String] = js.undefined
    ): ListPrincipalsRequest = {
      val __obj = js.Dynamic.literal(
        "resourceOwner" -> resourceOwner.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      principals.foreach(__v => __obj.updateDynamic("principals")(__v.asInstanceOf[js.Any]))
      resourceArn.foreach(__v => __obj.updateDynamic("resourceArn")(__v.asInstanceOf[js.Any]))
      resourceShareArns.foreach(__v => __obj.updateDynamic("resourceShareArns")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPrincipalsRequest]
    }
  }

  @js.native
  trait ListPrincipalsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var principals: js.UndefOr[PrincipalList]
  }

  object ListPrincipalsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        principals: js.UndefOr[PrincipalList] = js.undefined
    ): ListPrincipalsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      principals.foreach(__v => __obj.updateDynamic("principals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPrincipalsResponse]
    }
  }

  @js.native
  trait ListResourceSharePermissionsRequest extends js.Object {
    var resourceShareArn: String
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
  }

  object ListResourceSharePermissionsRequest {
    @inline
    def apply(
        resourceShareArn: String,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListResourceSharePermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "resourceShareArn" -> resourceShareArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceSharePermissionsRequest]
    }
  }

  @js.native
  trait ListResourceSharePermissionsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var permissions: js.UndefOr[ResourceSharePermissionList]
  }

  object ListResourceSharePermissionsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        permissions: js.UndefOr[ResourceSharePermissionList] = js.undefined
    ): ListResourceSharePermissionsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      permissions.foreach(__v => __obj.updateDynamic("permissions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceSharePermissionsResponse]
    }
  }

  @js.native
  trait ListResourceTypesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
    var resourceRegionScope: js.UndefOr[ResourceRegionScopeFilter]
  }

  object ListResourceTypesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        resourceRegionScope: js.UndefOr[ResourceRegionScopeFilter] = js.undefined
    ): ListResourceTypesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resourceRegionScope.foreach(__v => __obj.updateDynamic("resourceRegionScope")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceTypesRequest]
    }
  }

  @js.native
  trait ListResourceTypesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var resourceTypes: js.UndefOr[ServiceNameAndResourceTypeList]
  }

  object ListResourceTypesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        resourceTypes: js.UndefOr[ServiceNameAndResourceTypeList] = js.undefined
    ): ListResourceTypesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resourceTypes.foreach(__v => __obj.updateDynamic("resourceTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceTypesResponse]
    }
  }

  @js.native
  trait ListResourcesRequest extends js.Object {
    var resourceOwner: ResourceOwner
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
    var principal: js.UndefOr[String]
    var resourceArns: js.UndefOr[ResourceArnList]
    var resourceRegionScope: js.UndefOr[ResourceRegionScopeFilter]
    var resourceShareArns: js.UndefOr[ResourceShareArnList]
    var resourceType: js.UndefOr[String]
  }

  object ListResourcesRequest {
    @inline
    def apply(
        resourceOwner: ResourceOwner,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        principal: js.UndefOr[String] = js.undefined,
        resourceArns: js.UndefOr[ResourceArnList] = js.undefined,
        resourceRegionScope: js.UndefOr[ResourceRegionScopeFilter] = js.undefined,
        resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined,
        resourceType: js.UndefOr[String] = js.undefined
    ): ListResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "resourceOwner" -> resourceOwner.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      principal.foreach(__v => __obj.updateDynamic("principal")(__v.asInstanceOf[js.Any]))
      resourceArns.foreach(__v => __obj.updateDynamic("resourceArns")(__v.asInstanceOf[js.Any]))
      resourceRegionScope.foreach(__v => __obj.updateDynamic("resourceRegionScope")(__v.asInstanceOf[js.Any]))
      resourceShareArns.foreach(__v => __obj.updateDynamic("resourceShareArns")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourcesRequest]
    }
  }

  @js.native
  trait ListResourcesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var resources: js.UndefOr[ResourceList]
  }

  object ListResourcesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        resources: js.UndefOr[ResourceList] = js.undefined
    ): ListResourcesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resources.foreach(__v => __obj.updateDynamic("resources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourcesResponse]
    }
  }

  /** Describes a principal for use with Resource Access Manager.
    */
  @js.native
  trait Principal extends js.Object {
    var creationTime: js.UndefOr[DateTime]
    var external: js.UndefOr[Boolean]
    var id: js.UndefOr[String]
    var lastUpdatedTime: js.UndefOr[DateTime]
    var resourceShareArn: js.UndefOr[String]
  }

  object Principal {
    @inline
    def apply(
        creationTime: js.UndefOr[DateTime] = js.undefined,
        external: js.UndefOr[Boolean] = js.undefined,
        id: js.UndefOr[String] = js.undefined,
        lastUpdatedTime: js.UndefOr[DateTime] = js.undefined,
        resourceShareArn: js.UndefOr[String] = js.undefined
    ): Principal = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      external.foreach(__v => __obj.updateDynamic("external")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      resourceShareArn.foreach(__v => __obj.updateDynamic("resourceShareArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Principal]
    }
  }

  @js.native
  trait PromoteResourceShareCreatedFromPolicyRequest extends js.Object {
    var resourceShareArn: String
  }

  object PromoteResourceShareCreatedFromPolicyRequest {
    @inline
    def apply(
        resourceShareArn: String
    ): PromoteResourceShareCreatedFromPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "resourceShareArn" -> resourceShareArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PromoteResourceShareCreatedFromPolicyRequest]
    }
  }

  @js.native
  trait PromoteResourceShareCreatedFromPolicyResponse extends js.Object {
    var returnValue: js.UndefOr[Boolean]
  }

  object PromoteResourceShareCreatedFromPolicyResponse {
    @inline
    def apply(
        returnValue: js.UndefOr[Boolean] = js.undefined
    ): PromoteResourceShareCreatedFromPolicyResponse = {
      val __obj = js.Dynamic.literal()
      returnValue.foreach(__v => __obj.updateDynamic("returnValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PromoteResourceShareCreatedFromPolicyResponse]
    }
  }

  @js.native
  trait RejectResourceShareInvitationRequest extends js.Object {
    var resourceShareInvitationArn: String
    var clientToken: js.UndefOr[String]
  }

  object RejectResourceShareInvitationRequest {
    @inline
    def apply(
        resourceShareInvitationArn: String,
        clientToken: js.UndefOr[String] = js.undefined
    ): RejectResourceShareInvitationRequest = {
      val __obj = js.Dynamic.literal(
        "resourceShareInvitationArn" -> resourceShareInvitationArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RejectResourceShareInvitationRequest]
    }
  }

  @js.native
  trait RejectResourceShareInvitationResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var resourceShareInvitation: js.UndefOr[ResourceShareInvitation]
  }

  object RejectResourceShareInvitationResponse {
    @inline
    def apply(
        clientToken: js.UndefOr[String] = js.undefined,
        resourceShareInvitation: js.UndefOr[ResourceShareInvitation] = js.undefined
    ): RejectResourceShareInvitationResponse = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      resourceShareInvitation.foreach(__v => __obj.updateDynamic("resourceShareInvitation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RejectResourceShareInvitationResponse]
    }
  }

  /** Describes a resource associated with a resource share in RAM.
    */
  @js.native
  trait Resource extends js.Object {
    var arn: js.UndefOr[String]
    var creationTime: js.UndefOr[DateTime]
    var lastUpdatedTime: js.UndefOr[DateTime]
    var resourceGroupArn: js.UndefOr[String]
    var resourceRegionScope: js.UndefOr[ResourceRegionScope]
    var resourceShareArn: js.UndefOr[String]
    var status: js.UndefOr[ResourceStatus]
    var statusMessage: js.UndefOr[String]
    var `type`: js.UndefOr[String]
  }

  object Resource {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        creationTime: js.UndefOr[DateTime] = js.undefined,
        lastUpdatedTime: js.UndefOr[DateTime] = js.undefined,
        resourceGroupArn: js.UndefOr[String] = js.undefined,
        resourceRegionScope: js.UndefOr[ResourceRegionScope] = js.undefined,
        resourceShareArn: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[ResourceStatus] = js.undefined,
        statusMessage: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[String] = js.undefined
    ): Resource = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      resourceGroupArn.foreach(__v => __obj.updateDynamic("resourceGroupArn")(__v.asInstanceOf[js.Any]))
      resourceRegionScope.foreach(__v => __obj.updateDynamic("resourceRegionScope")(__v.asInstanceOf[js.Any]))
      resourceShareArn.foreach(__v => __obj.updateDynamic("resourceShareArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resource]
    }
  }

  /** Describes a resource share in RAM.
    */
  @js.native
  trait ResourceShare extends js.Object {
    var allowExternalPrincipals: js.UndefOr[Boolean]
    var creationTime: js.UndefOr[DateTime]
    var featureSet: js.UndefOr[ResourceShareFeatureSet]
    var lastUpdatedTime: js.UndefOr[DateTime]
    var name: js.UndefOr[String]
    var owningAccountId: js.UndefOr[String]
    var resourceShareArn: js.UndefOr[String]
    var status: js.UndefOr[ResourceShareStatus]
    var statusMessage: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
  }

  object ResourceShare {
    @inline
    def apply(
        allowExternalPrincipals: js.UndefOr[Boolean] = js.undefined,
        creationTime: js.UndefOr[DateTime] = js.undefined,
        featureSet: js.UndefOr[ResourceShareFeatureSet] = js.undefined,
        lastUpdatedTime: js.UndefOr[DateTime] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        owningAccountId: js.UndefOr[String] = js.undefined,
        resourceShareArn: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[ResourceShareStatus] = js.undefined,
        statusMessage: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): ResourceShare = {
      val __obj = js.Dynamic.literal()
      allowExternalPrincipals.foreach(__v => __obj.updateDynamic("allowExternalPrincipals")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      featureSet.foreach(__v => __obj.updateDynamic("featureSet")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      owningAccountId.foreach(__v => __obj.updateDynamic("owningAccountId")(__v.asInstanceOf[js.Any]))
      resourceShareArn.foreach(__v => __obj.updateDynamic("resourceShareArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceShare]
    }
  }

  /** Describes an association with a resource share and either a principal or a resource.
    */
  @js.native
  trait ResourceShareAssociation extends js.Object {
    var associatedEntity: js.UndefOr[String]
    var associationType: js.UndefOr[ResourceShareAssociationType]
    var creationTime: js.UndefOr[DateTime]
    var external: js.UndefOr[Boolean]
    var lastUpdatedTime: js.UndefOr[DateTime]
    var resourceShareArn: js.UndefOr[String]
    var resourceShareName: js.UndefOr[String]
    var status: js.UndefOr[ResourceShareAssociationStatus]
    var statusMessage: js.UndefOr[String]
  }

  object ResourceShareAssociation {
    @inline
    def apply(
        associatedEntity: js.UndefOr[String] = js.undefined,
        associationType: js.UndefOr[ResourceShareAssociationType] = js.undefined,
        creationTime: js.UndefOr[DateTime] = js.undefined,
        external: js.UndefOr[Boolean] = js.undefined,
        lastUpdatedTime: js.UndefOr[DateTime] = js.undefined,
        resourceShareArn: js.UndefOr[String] = js.undefined,
        resourceShareName: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[ResourceShareAssociationStatus] = js.undefined,
        statusMessage: js.UndefOr[String] = js.undefined
    ): ResourceShareAssociation = {
      val __obj = js.Dynamic.literal()
      associatedEntity.foreach(__v => __obj.updateDynamic("associatedEntity")(__v.asInstanceOf[js.Any]))
      associationType.foreach(__v => __obj.updateDynamic("associationType")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      external.foreach(__v => __obj.updateDynamic("external")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      resourceShareArn.foreach(__v => __obj.updateDynamic("resourceShareArn")(__v.asInstanceOf[js.Any]))
      resourceShareName.foreach(__v => __obj.updateDynamic("resourceShareName")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceShareAssociation]
    }
  }

  /** Describes an invitation for an Amazon Web Services account to join a resource share.
    */
  @js.native
  trait ResourceShareInvitation extends js.Object {
    var invitationTimestamp: js.UndefOr[DateTime]
    var receiverAccountId: js.UndefOr[String]
    var receiverArn: js.UndefOr[String]
    var resourceShareArn: js.UndefOr[String]
    var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList]
    var resourceShareInvitationArn: js.UndefOr[String]
    var resourceShareName: js.UndefOr[String]
    var senderAccountId: js.UndefOr[String]
    var status: js.UndefOr[ResourceShareInvitationStatus]
  }

  object ResourceShareInvitation {
    @inline
    def apply(
        invitationTimestamp: js.UndefOr[DateTime] = js.undefined,
        receiverAccountId: js.UndefOr[String] = js.undefined,
        receiverArn: js.UndefOr[String] = js.undefined,
        resourceShareArn: js.UndefOr[String] = js.undefined,
        resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.undefined,
        resourceShareInvitationArn: js.UndefOr[String] = js.undefined,
        resourceShareName: js.UndefOr[String] = js.undefined,
        senderAccountId: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[ResourceShareInvitationStatus] = js.undefined
    ): ResourceShareInvitation = {
      val __obj = js.Dynamic.literal()
      invitationTimestamp.foreach(__v => __obj.updateDynamic("invitationTimestamp")(__v.asInstanceOf[js.Any]))
      receiverAccountId.foreach(__v => __obj.updateDynamic("receiverAccountId")(__v.asInstanceOf[js.Any]))
      receiverArn.foreach(__v => __obj.updateDynamic("receiverArn")(__v.asInstanceOf[js.Any]))
      resourceShareArn.foreach(__v => __obj.updateDynamic("resourceShareArn")(__v.asInstanceOf[js.Any]))
      resourceShareAssociations.foreach(__v => __obj.updateDynamic("resourceShareAssociations")(__v.asInstanceOf[js.Any]))
      resourceShareInvitationArn.foreach(__v => __obj.updateDynamic("resourceShareInvitationArn")(__v.asInstanceOf[js.Any]))
      resourceShareName.foreach(__v => __obj.updateDynamic("resourceShareName")(__v.asInstanceOf[js.Any]))
      senderAccountId.foreach(__v => __obj.updateDynamic("senderAccountId")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceShareInvitation]
    }
  }

  /** Information about an RAM permission.
    */
  @js.native
  trait ResourceSharePermissionDetail extends js.Object {
    var arn: js.UndefOr[String]
    var creationTime: js.UndefOr[DateTime]
    var defaultVersion: js.UndefOr[Boolean]
    var isResourceTypeDefault: js.UndefOr[Boolean]
    var lastUpdatedTime: js.UndefOr[DateTime]
    var name: js.UndefOr[String]
    var permission: js.UndefOr[String]
    var resourceType: js.UndefOr[String]
    var version: js.UndefOr[String]
  }

  object ResourceSharePermissionDetail {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        creationTime: js.UndefOr[DateTime] = js.undefined,
        defaultVersion: js.UndefOr[Boolean] = js.undefined,
        isResourceTypeDefault: js.UndefOr[Boolean] = js.undefined,
        lastUpdatedTime: js.UndefOr[DateTime] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        permission: js.UndefOr[String] = js.undefined,
        resourceType: js.UndefOr[String] = js.undefined,
        version: js.UndefOr[String] = js.undefined
    ): ResourceSharePermissionDetail = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      defaultVersion.foreach(__v => __obj.updateDynamic("defaultVersion")(__v.asInstanceOf[js.Any]))
      isResourceTypeDefault.foreach(__v => __obj.updateDynamic("isResourceTypeDefault")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      permission.foreach(__v => __obj.updateDynamic("permission")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceSharePermissionDetail]
    }
  }

  /** Information about an RAM permission that is associated with a resource share and any of its resources of a specified type.
    */
  @js.native
  trait ResourceSharePermissionSummary extends js.Object {
    var arn: js.UndefOr[String]
    var creationTime: js.UndefOr[DateTime]
    var defaultVersion: js.UndefOr[Boolean]
    var isResourceTypeDefault: js.UndefOr[Boolean]
    var lastUpdatedTime: js.UndefOr[DateTime]
    var name: js.UndefOr[String]
    var resourceType: js.UndefOr[String]
    var status: js.UndefOr[String]
    var version: js.UndefOr[String]
  }

  object ResourceSharePermissionSummary {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        creationTime: js.UndefOr[DateTime] = js.undefined,
        defaultVersion: js.UndefOr[Boolean] = js.undefined,
        isResourceTypeDefault: js.UndefOr[Boolean] = js.undefined,
        lastUpdatedTime: js.UndefOr[DateTime] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        resourceType: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[String] = js.undefined,
        version: js.UndefOr[String] = js.undefined
    ): ResourceSharePermissionSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      defaultVersion.foreach(__v => __obj.updateDynamic("defaultVersion")(__v.asInstanceOf[js.Any]))
      isResourceTypeDefault.foreach(__v => __obj.updateDynamic("isResourceTypeDefault")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceSharePermissionSummary]
    }
  }

  /** Information about a shareable resource type and the Amazon Web Services service to which resources of that type belong.
    */
  @js.native
  trait ServiceNameAndResourceType extends js.Object {
    var resourceRegionScope: js.UndefOr[ResourceRegionScope]
    var resourceType: js.UndefOr[String]
    var serviceName: js.UndefOr[String]
  }

  object ServiceNameAndResourceType {
    @inline
    def apply(
        resourceRegionScope: js.UndefOr[ResourceRegionScope] = js.undefined,
        resourceType: js.UndefOr[String] = js.undefined,
        serviceName: js.UndefOr[String] = js.undefined
    ): ServiceNameAndResourceType = {
      val __obj = js.Dynamic.literal()
      resourceRegionScope.foreach(__v => __obj.updateDynamic("resourceRegionScope")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      serviceName.foreach(__v => __obj.updateDynamic("serviceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceNameAndResourceType]
    }
  }

  /** A structure containing a tag. A tag is metadata that you can attach to your resources to help organize and categorize them. You can also use them to help you secure your resources. For more information, see [[https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html|Controlling access to Amazon Web Services resources using tags]]. For more information about tags, see [[https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html|Tagging Amazon Web Services resources]] in the <i>Amazon Web Services General Reference Guide</i>.
    */
  @js.native
  trait Tag extends js.Object {
    var key: js.UndefOr[TagKey]
    var value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        key: js.UndefOr[TagKey] = js.undefined,
        value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  /** A tag key and optional list of possible values that you can use to filter results for tagged resources.
    */
  @js.native
  trait TagFilter extends js.Object {
    var tagKey: js.UndefOr[TagKey]
    var tagValues: js.UndefOr[TagValueList]
  }

  object TagFilter {
    @inline
    def apply(
        tagKey: js.UndefOr[TagKey] = js.undefined,
        tagValues: js.UndefOr[TagValueList] = js.undefined
    ): TagFilter = {
      val __obj = js.Dynamic.literal()
      tagKey.foreach(__v => __obj.updateDynamic("tagKey")(__v.asInstanceOf[js.Any]))
      tagValues.foreach(__v => __obj.updateDynamic("tagValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagFilter]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceShareArn: String
    var tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceShareArn: String,
        tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceShareArn" -> resourceShareArn.asInstanceOf[js.Any],
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
    var resourceShareArn: String
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceShareArn: String,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceShareArn" -> resourceShareArn.asInstanceOf[js.Any],
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

  @js.native
  trait UpdateResourceShareRequest extends js.Object {
    var resourceShareArn: String
    var allowExternalPrincipals: js.UndefOr[Boolean]
    var clientToken: js.UndefOr[String]
    var name: js.UndefOr[String]
  }

  object UpdateResourceShareRequest {
    @inline
    def apply(
        resourceShareArn: String,
        allowExternalPrincipals: js.UndefOr[Boolean] = js.undefined,
        clientToken: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined
    ): UpdateResourceShareRequest = {
      val __obj = js.Dynamic.literal(
        "resourceShareArn" -> resourceShareArn.asInstanceOf[js.Any]
      )

      allowExternalPrincipals.foreach(__v => __obj.updateDynamic("allowExternalPrincipals")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResourceShareRequest]
    }
  }

  @js.native
  trait UpdateResourceShareResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var resourceShare: js.UndefOr[ResourceShare]
  }

  object UpdateResourceShareResponse {
    @inline
    def apply(
        clientToken: js.UndefOr[String] = js.undefined,
        resourceShare: js.UndefOr[ResourceShare] = js.undefined
    ): UpdateResourceShareResponse = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      resourceShare.foreach(__v => __obj.updateDynamic("resourceShare")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResourceShareResponse]
    }
  }
}
