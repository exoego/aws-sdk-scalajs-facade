package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object ram {
  type DateTime                       = js.Date
  type MaxResults                     = Int
  type Policy                         = String
  type PolicyList                     = js.Array[Policy]
  type PrincipalArnOrIdList           = js.Array[String]
  type PrincipalList                  = js.Array[Principal]
  type ResourceArnList                = js.Array[String]
  type ResourceList                   = js.Array[Resource]
  type ResourceOwner                  = String
  type ResourceShareArnList           = js.Array[String]
  type ResourceShareAssociationList   = js.Array[ResourceShareAssociation]
  type ResourceShareAssociationStatus = String
  type ResourceShareAssociationType   = String
  type ResourceShareInvitationArnList = js.Array[String]
  type ResourceShareInvitationList    = js.Array[ResourceShareInvitation]
  type ResourceShareInvitationStatus  = String
  type ResourceShareList              = js.Array[ResourceShare]
  type ResourceShareStatus            = String
  type ResourceStatus                 = String
  type TagFilters                     = js.Array[TagFilter]
  type TagKey                         = String
  type TagKeyList                     = js.Array[TagKey]
  type TagList                        = js.Array[Tag]
  type TagValue                       = String
  type TagValueList                   = js.Array[TagValue]

  implicit final class RAMOps(private val service: RAM) extends AnyVal {
    @inline def acceptResourceShareInvitationFuture(
        params: AcceptResourceShareInvitationRequest
    ): Future[AcceptResourceShareInvitationResponse] = service.acceptResourceShareInvitation(params).promise.toFuture
    @inline def associateResourceShareFuture(
        params: AssociateResourceShareRequest
    ): Future[AssociateResourceShareResponse] = service.associateResourceShare(params).promise.toFuture
    @inline def createResourceShareFuture(params: CreateResourceShareRequest): Future[CreateResourceShareResponse] =
      service.createResourceShare(params).promise.toFuture
    @inline def deleteResourceShareFuture(params: DeleteResourceShareRequest): Future[DeleteResourceShareResponse] =
      service.deleteResourceShare(params).promise.toFuture
    @inline def disassociateResourceShareFuture(
        params: DisassociateResourceShareRequest
    ): Future[DisassociateResourceShareResponse] = service.disassociateResourceShare(params).promise.toFuture
    @inline def enableSharingWithAwsOrganizationFuture(
        params: EnableSharingWithAwsOrganizationRequest
    ): Future[EnableSharingWithAwsOrganizationResponse] =
      service.enableSharingWithAwsOrganization(params).promise.toFuture
    @inline def getResourcePoliciesFuture(params: GetResourcePoliciesRequest): Future[GetResourcePoliciesResponse] =
      service.getResourcePolicies(params).promise.toFuture
    @inline def getResourceShareAssociationsFuture(
        params: GetResourceShareAssociationsRequest
    ): Future[GetResourceShareAssociationsResponse] = service.getResourceShareAssociations(params).promise.toFuture
    @inline def getResourceShareInvitationsFuture(
        params: GetResourceShareInvitationsRequest
    ): Future[GetResourceShareInvitationsResponse] = service.getResourceShareInvitations(params).promise.toFuture
    @inline def getResourceSharesFuture(params: GetResourceSharesRequest): Future[GetResourceSharesResponse] =
      service.getResourceShares(params).promise.toFuture
    @inline def listPendingInvitationResourcesFuture(
        params: ListPendingInvitationResourcesRequest
    ): Future[ListPendingInvitationResourcesResponse] = service.listPendingInvitationResources(params).promise.toFuture
    @inline def listPrincipalsFuture(params: ListPrincipalsRequest): Future[ListPrincipalsResponse] =
      service.listPrincipals(params).promise.toFuture
    @inline def listResourcesFuture(params: ListResourcesRequest): Future[ListResourcesResponse] =
      service.listResources(params).promise.toFuture
    @inline def rejectResourceShareInvitationFuture(
        params: RejectResourceShareInvitationRequest
    ): Future[RejectResourceShareInvitationResponse] = service.rejectResourceShareInvitation(params).promise.toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    @inline def updateResourceShareFuture(params: UpdateResourceShareRequest): Future[UpdateResourceShareResponse] =
      service.updateResourceShare(params).promise.toFuture
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
    def createResourceShare(params: CreateResourceShareRequest): Request[CreateResourceShareResponse] = js.native
    def deleteResourceShare(params: DeleteResourceShareRequest): Request[DeleteResourceShareResponse] = js.native
    def disassociateResourceShare(
        params: DisassociateResourceShareRequest
    ): Request[DisassociateResourceShareResponse] = js.native
    def enableSharingWithAwsOrganization(
        params: EnableSharingWithAwsOrganizationRequest
    ): Request[EnableSharingWithAwsOrganizationResponse]                                              = js.native
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
    ): Request[ListPendingInvitationResourcesResponse]                                 = js.native
    def listPrincipals(params: ListPrincipalsRequest): Request[ListPrincipalsResponse] = js.native
    def listResources(params: ListResourcesRequest): Request[ListResourcesResponse]    = js.native
    def rejectResourceShareInvitation(
        params: RejectResourceShareInvitationRequest
    ): Request[RejectResourceShareInvitationResponse]                                                 = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                         = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                   = js.native
    def updateResourceShare(params: UpdateResourceShareRequest): Request[UpdateResourceShareResponse] = js.native
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
      resourceShareAssociations.foreach(
        __v => __obj.updateDynamic("resourceShareAssociations")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[AssociateResourceShareResponse]
    }
  }

  @js.native
  trait CreateResourceShareRequest extends js.Object {
    var name: String
    var allowExternalPrincipals: js.UndefOr[Boolean]
    var clientToken: js.UndefOr[String]
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
        principals: js.UndefOr[PrincipalArnOrIdList] = js.undefined,
        resourceArns: js.UndefOr[ResourceArnList] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateResourceShareRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      allowExternalPrincipals.foreach(__v => __obj.updateDynamic("allowExternalPrincipals")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
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
      resourceShareAssociations.foreach(
        __v => __obj.updateDynamic("resourceShareAssociations")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DisassociateResourceShareResponse]
    }
  }

  @js.native
  trait EnableSharingWithAwsOrganizationRequest extends js.Object {}

  object EnableSharingWithAwsOrganizationRequest {
    @inline
    def apply(
        ): EnableSharingWithAwsOrganizationRequest = {
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
      resourceShareAssociations.foreach(
        __v => __obj.updateDynamic("resourceShareAssociations")(__v.asInstanceOf[js.Any])
      )
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
      resourceShareInvitationArns.foreach(
        __v => __obj.updateDynamic("resourceShareInvitationArns")(__v.asInstanceOf[js.Any])
      )
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
  }

  object ListPendingInvitationResourcesRequest {
    @inline
    def apply(
        resourceShareInvitationArn: String,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListPendingInvitationResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "resourceShareInvitationArn" -> resourceShareInvitationArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
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
  trait ListResourcesRequest extends js.Object {
    var resourceOwner: ResourceOwner
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
    var principal: js.UndefOr[String]
    var resourceArns: js.UndefOr[ResourceArnList]
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

  /**
    * Describes a principal for use with AWS Resource Access Manager.
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

  /**
    * Describes a resource associated with a resource share.
    */
  @js.native
  trait Resource extends js.Object {
    var arn: js.UndefOr[String]
    var creationTime: js.UndefOr[DateTime]
    var lastUpdatedTime: js.UndefOr[DateTime]
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
        resourceShareArn: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[ResourceStatus] = js.undefined,
        statusMessage: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[String] = js.undefined
    ): Resource = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      resourceShareArn.foreach(__v => __obj.updateDynamic("resourceShareArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resource]
    }
  }

  object ResourceOwnerEnum {
    val SELF             = "SELF"
    val `OTHER-ACCOUNTS` = "OTHER-ACCOUNTS"

    val values = js.Object.freeze(js.Array(SELF, `OTHER-ACCOUNTS`))
  }

  /**
    * Describes a resource share.
    */
  @js.native
  trait ResourceShare extends js.Object {
    var allowExternalPrincipals: js.UndefOr[Boolean]
    var creationTime: js.UndefOr[DateTime]
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

  /**
    * Describes an association with a resource share.
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

  object ResourceShareAssociationStatusEnum {
    val ASSOCIATING    = "ASSOCIATING"
    val ASSOCIATED     = "ASSOCIATED"
    val FAILED         = "FAILED"
    val DISASSOCIATING = "DISASSOCIATING"
    val DISASSOCIATED  = "DISASSOCIATED"

    val values = js.Object.freeze(js.Array(ASSOCIATING, ASSOCIATED, FAILED, DISASSOCIATING, DISASSOCIATED))
  }

  object ResourceShareAssociationTypeEnum {
    val PRINCIPAL = "PRINCIPAL"
    val RESOURCE  = "RESOURCE"

    val values = js.Object.freeze(js.Array(PRINCIPAL, RESOURCE))
  }

  /**
    * Describes an invitation to join a resource share.
    */
  @js.native
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

  object ResourceShareInvitation {
    @inline
    def apply(
        invitationTimestamp: js.UndefOr[DateTime] = js.undefined,
        receiverAccountId: js.UndefOr[String] = js.undefined,
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
      resourceShareArn.foreach(__v => __obj.updateDynamic("resourceShareArn")(__v.asInstanceOf[js.Any]))
      resourceShareAssociations.foreach(
        __v => __obj.updateDynamic("resourceShareAssociations")(__v.asInstanceOf[js.Any])
      )
      resourceShareInvitationArn.foreach(
        __v => __obj.updateDynamic("resourceShareInvitationArn")(__v.asInstanceOf[js.Any])
      )
      resourceShareName.foreach(__v => __obj.updateDynamic("resourceShareName")(__v.asInstanceOf[js.Any]))
      senderAccountId.foreach(__v => __obj.updateDynamic("senderAccountId")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceShareInvitation]
    }
  }

  object ResourceShareInvitationStatusEnum {
    val PENDING  = "PENDING"
    val ACCEPTED = "ACCEPTED"
    val REJECTED = "REJECTED"
    val EXPIRED  = "EXPIRED"

    val values = js.Object.freeze(js.Array(PENDING, ACCEPTED, REJECTED, EXPIRED))
  }

  object ResourceShareStatusEnum {
    val PENDING  = "PENDING"
    val ACTIVE   = "ACTIVE"
    val FAILED   = "FAILED"
    val DELETING = "DELETING"
    val DELETED  = "DELETED"

    val values = js.Object.freeze(js.Array(PENDING, ACTIVE, FAILED, DELETING, DELETED))
  }

  object ResourceStatusEnum {
    val AVAILABLE                   = "AVAILABLE"
    val ZONAL_RESOURCE_INACCESSIBLE = "ZONAL_RESOURCE_INACCESSIBLE"
    val LIMIT_EXCEEDED              = "LIMIT_EXCEEDED"
    val UNAVAILABLE                 = "UNAVAILABLE"
    val PENDING                     = "PENDING"

    val values =
      js.Object.freeze(js.Array(AVAILABLE, ZONAL_RESOURCE_INACCESSIBLE, LIMIT_EXCEEDED, UNAVAILABLE, PENDING))
  }

  /**
    * Information about a tag.
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

  /**
    * Used to filter information based on tags.
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
        "tags"             -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
        ): TagResourceResponse = {
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
        "tagKeys"          -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
        ): UntagResourceResponse = {
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
