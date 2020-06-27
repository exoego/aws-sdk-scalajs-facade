package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object ram {
  type DateTime                       = js.Date
  type MaxResults                     = Int
  type PermissionArnList              = js.Array[String]
  type Policy                         = String
  type PolicyList                     = js.Array[Policy]
  type PrincipalArnOrIdList           = js.Array[String]
  type PrincipalList                  = js.Array[Principal]
  type ResourceArnList                = js.Array[String]
  type ResourceList                   = js.Array[Resource]
  type ResourceShareArnList           = js.Array[String]
  type ResourceShareAssociationList   = js.Array[ResourceShareAssociation]
  type ResourceShareInvitationArnList = js.Array[String]
  type ResourceShareInvitationList    = js.Array[ResourceShareInvitation]
  type ResourceShareList              = js.Array[ResourceShare]
  type ResourceSharePermissionList    = js.Array[ResourceSharePermissionSummary]
  type TagFilters                     = js.Array[TagFilter]
  type TagKey                         = String
  type TagKeyList                     = js.Array[TagKey]
  type TagList                        = js.Array[Tag]
  type TagValue                       = String
  type TagValueList                   = js.Array[TagValue]

  implicit final class RAMOps(private val service: RAM) extends AnyVal {

    @inline def acceptResourceShareInvitationFuture(
        params: AcceptResourceShareInvitationRequest
    ): Future[AcceptResourceShareInvitationResponse] = service.acceptResourceShareInvitation(params).promise().toFuture
    @inline def associateResourceShareFuture(
        params: AssociateResourceShareRequest
    ): Future[AssociateResourceShareResponse] = service.associateResourceShare(params).promise().toFuture
    @inline def associateResourceSharePermissionFuture(
        params: AssociateResourceSharePermissionRequest
    ): Future[AssociateResourceSharePermissionResponse] =
      service.associateResourceSharePermission(params).promise().toFuture
    @inline def createResourceShareFuture(params: CreateResourceShareRequest): Future[CreateResourceShareResponse] =
      service.createResourceShare(params).promise().toFuture
    @inline def deleteResourceShareFuture(params: DeleteResourceShareRequest): Future[DeleteResourceShareResponse] =
      service.deleteResourceShare(params).promise().toFuture
    @inline def disassociateResourceShareFuture(
        params: DisassociateResourceShareRequest
    ): Future[DisassociateResourceShareResponse] = service.disassociateResourceShare(params).promise().toFuture
    @inline def disassociateResourceSharePermissionFuture(
        params: DisassociateResourceSharePermissionRequest
    ): Future[DisassociateResourceSharePermissionResponse] =
      service.disassociateResourceSharePermission(params).promise().toFuture
    @inline def enableSharingWithAwsOrganizationFuture(
        params: EnableSharingWithAwsOrganizationRequest
    ): Future[EnableSharingWithAwsOrganizationResponse] =
      service.enableSharingWithAwsOrganization(params).promise().toFuture
    @inline def getPermissionFuture(params: GetPermissionRequest): Future[GetPermissionResponse] =
      service.getPermission(params).promise().toFuture
    @inline def getResourcePoliciesFuture(params: GetResourcePoliciesRequest): Future[GetResourcePoliciesResponse] =
      service.getResourcePolicies(params).promise().toFuture
    @inline def getResourceShareAssociationsFuture(
        params: GetResourceShareAssociationsRequest
    ): Future[GetResourceShareAssociationsResponse] = service.getResourceShareAssociations(params).promise().toFuture
    @inline def getResourceShareInvitationsFuture(
        params: GetResourceShareInvitationsRequest
    ): Future[GetResourceShareInvitationsResponse] = service.getResourceShareInvitations(params).promise().toFuture
    @inline def getResourceSharesFuture(params: GetResourceSharesRequest): Future[GetResourceSharesResponse] =
      service.getResourceShares(params).promise().toFuture
    @inline def listPendingInvitationResourcesFuture(
        params: ListPendingInvitationResourcesRequest
    ): Future[ListPendingInvitationResourcesResponse] =
      service.listPendingInvitationResources(params).promise().toFuture
    @inline def listPermissionsFuture(params: ListPermissionsRequest): Future[ListPermissionsResponse] =
      service.listPermissions(params).promise().toFuture
    @inline def listPrincipalsFuture(params: ListPrincipalsRequest): Future[ListPrincipalsResponse] =
      service.listPrincipals(params).promise().toFuture
    @inline def listResourceSharePermissionsFuture(
        params: ListResourceSharePermissionsRequest
    ): Future[ListResourceSharePermissionsResponse] = service.listResourceSharePermissions(params).promise().toFuture
    @inline def listResourcesFuture(params: ListResourcesRequest): Future[ListResourcesResponse] =
      service.listResources(params).promise().toFuture
    @inline def promoteResourceShareCreatedFromPolicyFuture(
        params: PromoteResourceShareCreatedFromPolicyRequest
    ): Future[PromoteResourceShareCreatedFromPolicyResponse] =
      service.promoteResourceShareCreatedFromPolicy(params).promise().toFuture
    @inline def rejectResourceShareInvitationFuture(
        params: RejectResourceShareInvitationRequest
    ): Future[RejectResourceShareInvitationResponse] = service.rejectResourceShareInvitation(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateResourceShareFuture(params: UpdateResourceShareRequest): Future[UpdateResourceShareResponse] =
      service.updateResourceShare(params).promise().toFuture
  }
}

package ram {
  @js.native
  @JSImport("aws-sdk", "RAM")
  class RAM() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptResourceShareInvitation(
        params: AcceptResourceShareInvitationRequest
    ): Request[AcceptResourceShareInvitationResponse] = js.native
    def associateResourceShare(params: AssociateResourceShareRequest): Request[AssociateResourceShareResponse] =
      js.native
    def associateResourceSharePermission(
        params: AssociateResourceSharePermissionRequest
    ): Request[AssociateResourceSharePermissionResponse]                                              = js.native
    def createResourceShare(params: CreateResourceShareRequest): Request[CreateResourceShareResponse] = js.native
    def deleteResourceShare(params: DeleteResourceShareRequest): Request[DeleteResourceShareResponse] = js.native
    def disassociateResourceShare(
        params: DisassociateResourceShareRequest
    ): Request[DisassociateResourceShareResponse] = js.native
    def disassociateResourceSharePermission(
        params: DisassociateResourceSharePermissionRequest
    ): Request[DisassociateResourceSharePermissionResponse] = js.native
    def enableSharingWithAwsOrganization(
        params: EnableSharingWithAwsOrganizationRequest
    ): Request[EnableSharingWithAwsOrganizationResponse]                                              = js.native
    def getPermission(params: GetPermissionRequest): Request[GetPermissionResponse]                   = js.native
    def getResourcePolicies(params: GetResourcePoliciesRequest): Request[GetResourcePoliciesResponse] = js.native
    def getResourceShareAssociations(
        params: GetResourceShareAssociationsRequest
    ): Request[GetResourceShareAssociationsResponse] = js.native
    def getResourceShareInvitations(
        params: GetResourceShareInvitationsRequest
    ): Request[GetResourceShareInvitationsResponse]                                             = js.native
    def getResourceShares(params: GetResourceSharesRequest): Request[GetResourceSharesResponse] = js.native
    def listPendingInvitationResources(
        params: ListPendingInvitationResourcesRequest
    ): Request[ListPendingInvitationResourcesResponse]                                    = js.native
    def listPermissions(params: ListPermissionsRequest): Request[ListPermissionsResponse] = js.native
    def listPrincipals(params: ListPrincipalsRequest): Request[ListPrincipalsResponse]    = js.native
    def listResourceSharePermissions(
        params: ListResourceSharePermissionsRequest
    ): Request[ListResourceSharePermissionsResponse]                                = js.native
    def listResources(params: ListResourcesRequest): Request[ListResourcesResponse] = js.native
    def promoteResourceShareCreatedFromPolicy(
        params: PromoteResourceShareCreatedFromPolicyRequest
    ): Request[PromoteResourceShareCreatedFromPolicyResponse] = js.native
    def rejectResourceShareInvitation(
        params: RejectResourceShareInvitationRequest
    ): Request[RejectResourceShareInvitationResponse]                                                 = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                         = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                   = js.native
    def updateResourceShare(params: UpdateResourceShareRequest): Request[UpdateResourceShareResponse] = js.native
  }

  @js.native
  @Factory
  trait AcceptResourceShareInvitationRequest extends js.Object {
    var resourceShareInvitationArn: String
    var clientToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait AcceptResourceShareInvitationResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var resourceShareInvitation: js.UndefOr[ResourceShareInvitation]
  }

  @js.native
  @Factory
  trait AssociateResourceSharePermissionRequest extends js.Object {
    var permissionArn: String
    var resourceShareArn: String
    var clientToken: js.UndefOr[String]
    var replace: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait AssociateResourceSharePermissionResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var returnValue: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait AssociateResourceShareRequest extends js.Object {
    var resourceShareArn: String
    var clientToken: js.UndefOr[String]
    var principals: js.UndefOr[PrincipalArnOrIdList]
    var resourceArns: js.UndefOr[ResourceArnList]
  }

  @js.native
  @Factory
  trait AssociateResourceShareResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList]
  }

  @js.native
  @Factory
  trait CreateResourceShareRequest extends js.Object {
    var name: String
    var allowExternalPrincipals: js.UndefOr[Boolean]
    var clientToken: js.UndefOr[String]
    var permissionArns: js.UndefOr[PermissionArnList]
    var principals: js.UndefOr[PrincipalArnOrIdList]
    var resourceArns: js.UndefOr[ResourceArnList]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateResourceShareResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var resourceShare: js.UndefOr[ResourceShare]
  }

  @js.native
  @Factory
  trait DeleteResourceShareRequest extends js.Object {
    var resourceShareArn: String
    var clientToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeleteResourceShareResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var returnValue: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DisassociateResourceSharePermissionRequest extends js.Object {
    var permissionArn: String
    var resourceShareArn: String
    var clientToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DisassociateResourceSharePermissionResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var returnValue: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DisassociateResourceShareRequest extends js.Object {
    var resourceShareArn: String
    var clientToken: js.UndefOr[String]
    var principals: js.UndefOr[PrincipalArnOrIdList]
    var resourceArns: js.UndefOr[ResourceArnList]
  }

  @js.native
  @Factory
  trait DisassociateResourceShareResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList]
  }

  @js.native
  @Factory
  trait EnableSharingWithAwsOrganizationRequest extends js.Object {}

  @js.native
  @Factory
  trait EnableSharingWithAwsOrganizationResponse extends js.Object {
    var returnValue: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait GetPermissionRequest extends js.Object {
    var permissionArn: String
    var permissionVersion: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait GetPermissionResponse extends js.Object {
    var permission: js.UndefOr[ResourceSharePermissionDetail]
  }

  @js.native
  @Factory
  trait GetResourcePoliciesRequest extends js.Object {
    var resourceArns: ResourceArnList
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
    var principal: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetResourcePoliciesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var policies: js.UndefOr[PolicyList]
  }

  @js.native
  @Factory
  trait GetResourceShareAssociationsRequest extends js.Object {
    var associationType: ResourceShareAssociationType
    var associationStatus: js.UndefOr[ResourceShareAssociationStatus]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
    var principal: js.UndefOr[String]
    var resourceArn: js.UndefOr[String]
    var resourceShareArns: js.UndefOr[ResourceShareArnList]
  }

  @js.native
  @Factory
  trait GetResourceShareAssociationsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList]
  }

  @js.native
  @Factory
  trait GetResourceShareInvitationsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
    var resourceShareArns: js.UndefOr[ResourceShareArnList]
    var resourceShareInvitationArns: js.UndefOr[ResourceShareInvitationArnList]
  }

  @js.native
  @Factory
  trait GetResourceShareInvitationsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var resourceShareInvitations: js.UndefOr[ResourceShareInvitationList]
  }

  @js.native
  @Factory
  trait GetResourceSharesRequest extends js.Object {
    var resourceOwner: ResourceOwner
    var maxResults: js.UndefOr[MaxResults]
    var name: js.UndefOr[String]
    var nextToken: js.UndefOr[String]
    var resourceShareArns: js.UndefOr[ResourceShareArnList]
    var resourceShareStatus: js.UndefOr[ResourceShareStatus]
    var tagFilters: js.UndefOr[TagFilters]
  }

  @js.native
  @Factory
  trait GetResourceSharesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var resourceShares: js.UndefOr[ResourceShareList]
  }

  @js.native
  @Factory
  trait ListPendingInvitationResourcesRequest extends js.Object {
    var resourceShareInvitationArn: String
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListPendingInvitationResourcesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var resources: js.UndefOr[ResourceList]
  }

  @js.native
  @Factory
  trait ListPermissionsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
    var resourceType: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListPermissionsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var permissions: js.UndefOr[ResourceSharePermissionList]
  }

  @js.native
  @Factory
  trait ListPrincipalsRequest extends js.Object {
    var resourceOwner: ResourceOwner
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
    var principals: js.UndefOr[PrincipalArnOrIdList]
    var resourceArn: js.UndefOr[String]
    var resourceShareArns: js.UndefOr[ResourceShareArnList]
    var resourceType: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListPrincipalsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var principals: js.UndefOr[PrincipalList]
  }

  @js.native
  @Factory
  trait ListResourceSharePermissionsRequest extends js.Object {
    var resourceShareArn: String
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListResourceSharePermissionsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var permissions: js.UndefOr[ResourceSharePermissionList]
  }

  @js.native
  @Factory
  trait ListResourcesRequest extends js.Object {
    var resourceOwner: ResourceOwner
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
    var principal: js.UndefOr[String]
    var resourceArns: js.UndefOr[ResourceArnList]
    var resourceShareArns: js.UndefOr[ResourceShareArnList]
    var resourceType: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListResourcesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var resources: js.UndefOr[ResourceList]
  }

  /**
    * Describes a principal for use with AWS Resource Access Manager.
    */
  @js.native
  @Factory
  trait Principal extends js.Object {
    var creationTime: js.UndefOr[DateTime]
    var external: js.UndefOr[Boolean]
    var id: js.UndefOr[String]
    var lastUpdatedTime: js.UndefOr[DateTime]
    var resourceShareArn: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait PromoteResourceShareCreatedFromPolicyRequest extends js.Object {
    var resourceShareArn: String
  }

  @js.native
  @Factory
  trait PromoteResourceShareCreatedFromPolicyResponse extends js.Object {
    var returnValue: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait RejectResourceShareInvitationRequest extends js.Object {
    var resourceShareInvitationArn: String
    var clientToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait RejectResourceShareInvitationResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var resourceShareInvitation: js.UndefOr[ResourceShareInvitation]
  }

  /**
    * Describes a resource associated with a resource share.
    */
  @js.native
  @Factory
  trait Resource extends js.Object {
    var arn: js.UndefOr[String]
    var creationTime: js.UndefOr[DateTime]
    var lastUpdatedTime: js.UndefOr[DateTime]
    var resourceGroupArn: js.UndefOr[String]
    var resourceShareArn: js.UndefOr[String]
    var status: js.UndefOr[ResourceStatus]
    var statusMessage: js.UndefOr[String]
    var `type`: js.UndefOr[String]
  }

  @js.native
  sealed trait ResourceOwner extends js.Any
  object ResourceOwner extends js.Object {
    val SELF             = "SELF".asInstanceOf[ResourceOwner]
    val `OTHER-ACCOUNTS` = "OTHER-ACCOUNTS".asInstanceOf[ResourceOwner]

    val values = js.Object.freeze(js.Array(SELF, `OTHER-ACCOUNTS`))
  }

  /**
    * Describes a resource share.
    */
  @js.native
  @Factory
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

  /**
    * Describes an association with a resource share.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait ResourceShareAssociationStatus extends js.Any
  object ResourceShareAssociationStatus extends js.Object {
    val ASSOCIATING    = "ASSOCIATING".asInstanceOf[ResourceShareAssociationStatus]
    val ASSOCIATED     = "ASSOCIATED".asInstanceOf[ResourceShareAssociationStatus]
    val FAILED         = "FAILED".asInstanceOf[ResourceShareAssociationStatus]
    val DISASSOCIATING = "DISASSOCIATING".asInstanceOf[ResourceShareAssociationStatus]
    val DISASSOCIATED  = "DISASSOCIATED".asInstanceOf[ResourceShareAssociationStatus]

    val values = js.Object.freeze(js.Array(ASSOCIATING, ASSOCIATED, FAILED, DISASSOCIATING, DISASSOCIATED))
  }

  @js.native
  sealed trait ResourceShareAssociationType extends js.Any
  object ResourceShareAssociationType extends js.Object {
    val PRINCIPAL = "PRINCIPAL".asInstanceOf[ResourceShareAssociationType]
    val RESOURCE  = "RESOURCE".asInstanceOf[ResourceShareAssociationType]

    val values = js.Object.freeze(js.Array(PRINCIPAL, RESOURCE))
  }

  @js.native
  sealed trait ResourceShareFeatureSet extends js.Any
  object ResourceShareFeatureSet extends js.Object {
    val CREATED_FROM_POLICY   = "CREATED_FROM_POLICY".asInstanceOf[ResourceShareFeatureSet]
    val PROMOTING_TO_STANDARD = "PROMOTING_TO_STANDARD".asInstanceOf[ResourceShareFeatureSet]
    val STANDARD              = "STANDARD".asInstanceOf[ResourceShareFeatureSet]

    val values = js.Object.freeze(js.Array(CREATED_FROM_POLICY, PROMOTING_TO_STANDARD, STANDARD))
  }

  /**
    * Describes an invitation to join a resource share.
    */
  @js.native
  @Factory
  trait ResourceShareInvitation extends js.Object {
    var invitationTimestamp: js.UndefOr[DateTime]
    var receiverAccountId: js.UndefOr[String]
    var resourceShareArn: js.UndefOr[String]
    var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList]
    var resourceShareInvitationArn: js.UndefOr[String]
    var resourceShareName: js.UndefOr[String]
    var senderAccountId: js.UndefOr[String]
    var status: js.UndefOr[ResourceShareInvitationStatus]
  }

  @js.native
  sealed trait ResourceShareInvitationStatus extends js.Any
  object ResourceShareInvitationStatus extends js.Object {
    val PENDING  = "PENDING".asInstanceOf[ResourceShareInvitationStatus]
    val ACCEPTED = "ACCEPTED".asInstanceOf[ResourceShareInvitationStatus]
    val REJECTED = "REJECTED".asInstanceOf[ResourceShareInvitationStatus]
    val EXPIRED  = "EXPIRED".asInstanceOf[ResourceShareInvitationStatus]

    val values = js.Object.freeze(js.Array(PENDING, ACCEPTED, REJECTED, EXPIRED))
  }

  /**
    * Information about an AWS RAM permission.
    */
  @js.native
  @Factory
  trait ResourceSharePermissionDetail extends js.Object {
    var arn: js.UndefOr[String]
    var creationTime: js.UndefOr[DateTime]
    var defaultVersion: js.UndefOr[Boolean]
    var lastUpdatedTime: js.UndefOr[DateTime]
    var name: js.UndefOr[String]
    var permission: js.UndefOr[String]
    var resourceType: js.UndefOr[String]
    var version: js.UndefOr[String]
  }

  /**
    * Information about a permission that is associated with a resource share.
    */
  @js.native
  @Factory
  trait ResourceSharePermissionSummary extends js.Object {
    var arn: js.UndefOr[String]
    var creationTime: js.UndefOr[DateTime]
    var defaultVersion: js.UndefOr[Boolean]
    var lastUpdatedTime: js.UndefOr[DateTime]
    var name: js.UndefOr[String]
    var resourceType: js.UndefOr[String]
    var status: js.UndefOr[String]
    var version: js.UndefOr[String]
  }

  @js.native
  sealed trait ResourceShareStatus extends js.Any
  object ResourceShareStatus extends js.Object {
    val PENDING  = "PENDING".asInstanceOf[ResourceShareStatus]
    val ACTIVE   = "ACTIVE".asInstanceOf[ResourceShareStatus]
    val FAILED   = "FAILED".asInstanceOf[ResourceShareStatus]
    val DELETING = "DELETING".asInstanceOf[ResourceShareStatus]
    val DELETED  = "DELETED".asInstanceOf[ResourceShareStatus]

    val values = js.Object.freeze(js.Array(PENDING, ACTIVE, FAILED, DELETING, DELETED))
  }

  @js.native
  sealed trait ResourceStatus extends js.Any
  object ResourceStatus extends js.Object {
    val AVAILABLE                   = "AVAILABLE".asInstanceOf[ResourceStatus]
    val ZONAL_RESOURCE_INACCESSIBLE = "ZONAL_RESOURCE_INACCESSIBLE".asInstanceOf[ResourceStatus]
    val LIMIT_EXCEEDED              = "LIMIT_EXCEEDED".asInstanceOf[ResourceStatus]
    val UNAVAILABLE                 = "UNAVAILABLE".asInstanceOf[ResourceStatus]
    val PENDING                     = "PENDING".asInstanceOf[ResourceStatus]

    val values =
      js.Object.freeze(js.Array(AVAILABLE, ZONAL_RESOURCE_INACCESSIBLE, LIMIT_EXCEEDED, UNAVAILABLE, PENDING))
  }

  /**
    * Information about a tag.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var key: js.UndefOr[TagKey]
    var value: js.UndefOr[TagValue]
  }

  /**
    * Used to filter information based on tags.
    */
  @js.native
  @Factory
  trait TagFilter extends js.Object {
    var tagKey: js.UndefOr[TagKey]
    var tagValues: js.UndefOr[TagValueList]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var resourceShareArn: String
    var tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var resourceShareArn: String
    var tagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateResourceShareRequest extends js.Object {
    var resourceShareArn: String
    var allowExternalPrincipals: js.UndefOr[Boolean]
    var clientToken: js.UndefOr[String]
    var name: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateResourceShareResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var resourceShare: js.UndefOr[ResourceShare]
  }
}
