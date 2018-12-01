package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object ram {
  type DateTime = js.Date
  type MaxResults = Int
  type Policy = String
  type PolicyList = js.Array[Policy]
  type PrincipalArnOrIdList = js.Array[String]
  type PrincipalList = js.Array[Principal]
  type ResourceArnList = js.Array[String]
  type ResourceList = js.Array[Resource]
  type ResourceOwner = String
  type ResourceShareArnList = js.Array[String]
  type ResourceShareAssociationList = js.Array[ResourceShareAssociation]
  type ResourceShareAssociationStatus = String
  type ResourceShareAssociationType = String
  type ResourceShareInvitationArnList = js.Array[String]
  type ResourceShareInvitationList = js.Array[ResourceShareInvitation]
  type ResourceShareInvitationStatus = String
  type ResourceShareList = js.Array[ResourceShare]
  type ResourceShareStatus = String
  type ResourceStatus = String
  type TagFilters = js.Array[TagFilter]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TagValueList = js.Array[TagValue]
}

package ram {
  @js.native
  @JSImport("aws-sdk", "RAM")
  class RAM(config: AWSConfig) extends js.Object {
    def acceptResourceShareInvitation(params: AcceptResourceShareInvitationRequest): Request[AcceptResourceShareInvitationResponse] = js.native
    def associateResourceShare(params: AssociateResourceShareRequest): Request[AssociateResourceShareResponse] = js.native
    def createResourceShare(params: CreateResourceShareRequest): Request[CreateResourceShareResponse] = js.native
    def deleteResourceShare(params: DeleteResourceShareRequest): Request[DeleteResourceShareResponse] = js.native
    def disassociateResourceShare(params: DisassociateResourceShareRequest): Request[DisassociateResourceShareResponse] = js.native
    def enableSharingWithAwsOrganization(params: EnableSharingWithAwsOrganizationRequest): Request[EnableSharingWithAwsOrganizationResponse] = js.native
    def getResourcePolicies(params: GetResourcePoliciesRequest): Request[GetResourcePoliciesResponse] = js.native
    def getResourceShareAssociations(params: GetResourceShareAssociationsRequest): Request[GetResourceShareAssociationsResponse] = js.native
    def getResourceShareInvitations(params: GetResourceShareInvitationsRequest): Request[GetResourceShareInvitationsResponse] = js.native
    def getResourceShares(params: GetResourceSharesRequest): Request[GetResourceSharesResponse] = js.native
    def listPrincipals(params: ListPrincipalsRequest): Request[ListPrincipalsResponse] = js.native
    def listResources(params: ListResourcesRequest): Request[ListResourcesResponse] = js.native
    def rejectResourceShareInvitation(params: RejectResourceShareInvitationRequest): Request[RejectResourceShareInvitationResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateResourceShare(params: UpdateResourceShareRequest): Request[UpdateResourceShareResponse] = js.native
  }

  @js.native
  trait AcceptResourceShareInvitationRequest extends js.Object {
    var resourceShareInvitationArn: js.UndefOr[String]
    var clientToken: js.UndefOr[String]
  }

  object AcceptResourceShareInvitationRequest {
    def apply(
      resourceShareInvitationArn: js.UndefOr[String] = js.undefined,
      clientToken: js.UndefOr[String] = js.undefined): AcceptResourceShareInvitationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareInvitationArn" -> resourceShareInvitationArn.map { x => x.asInstanceOf[js.Any] },
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptResourceShareInvitationRequest]
    }
  }

  @js.native
  trait AcceptResourceShareInvitationResponse extends js.Object {
    var resourceShareInvitation: js.UndefOr[ResourceShareInvitation]
    var clientToken: js.UndefOr[String]
  }

  object AcceptResourceShareInvitationResponse {
    def apply(
      resourceShareInvitation: js.UndefOr[ResourceShareInvitation] = js.undefined,
      clientToken: js.UndefOr[String] = js.undefined): AcceptResourceShareInvitationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareInvitation" -> resourceShareInvitation.map { x => x.asInstanceOf[js.Any] },
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptResourceShareInvitationResponse]
    }
  }

  @js.native
  trait AssociateResourceShareRequest extends js.Object {
    var resourceShareArn: js.UndefOr[String]
    var resourceArns: js.UndefOr[ResourceArnList]
    var principals: js.UndefOr[PrincipalArnOrIdList]
    var clientToken: js.UndefOr[String]
  }

  object AssociateResourceShareRequest {
    def apply(
      resourceShareArn: js.UndefOr[String] = js.undefined,
      resourceArns: js.UndefOr[ResourceArnList] = js.undefined,
      principals: js.UndefOr[PrincipalArnOrIdList] = js.undefined,
      clientToken: js.UndefOr[String] = js.undefined): AssociateResourceShareRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareArn" -> resourceShareArn.map { x => x.asInstanceOf[js.Any] },
        "resourceArns" -> resourceArns.map { x => x.asInstanceOf[js.Any] },
        "principals" -> principals.map { x => x.asInstanceOf[js.Any] },
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateResourceShareRequest]
    }
  }

  @js.native
  trait AssociateResourceShareResponse extends js.Object {
    var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList]
    var clientToken: js.UndefOr[String]
  }

  object AssociateResourceShareResponse {
    def apply(
      resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.undefined,
      clientToken: js.UndefOr[String] = js.undefined): AssociateResourceShareResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareAssociations" -> resourceShareAssociations.map { x => x.asInstanceOf[js.Any] },
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateResourceShareResponse]
    }
  }

  @js.native
  trait CreateResourceShareRequest extends js.Object {
    var name: js.UndefOr[String]
    var principals: js.UndefOr[PrincipalArnOrIdList]
    var allowExternalPrincipals: js.UndefOr[Boolean]
    var tags: js.UndefOr[TagList]
    var clientToken: js.UndefOr[String]
    var resourceArns: js.UndefOr[ResourceArnList]
  }

  object CreateResourceShareRequest {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      principals: js.UndefOr[PrincipalArnOrIdList] = js.undefined,
      allowExternalPrincipals: js.UndefOr[Boolean] = js.undefined,
      tags: js.UndefOr[TagList] = js.undefined,
      clientToken: js.UndefOr[String] = js.undefined,
      resourceArns: js.UndefOr[ResourceArnList] = js.undefined): CreateResourceShareRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "principals" -> principals.map { x => x.asInstanceOf[js.Any] },
        "allowExternalPrincipals" -> allowExternalPrincipals.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] },
        "resourceArns" -> resourceArns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResourceShareRequest]
    }
  }

  @js.native
  trait CreateResourceShareResponse extends js.Object {
    var resourceShare: js.UndefOr[ResourceShare]
    var clientToken: js.UndefOr[String]
  }

  object CreateResourceShareResponse {
    def apply(
      resourceShare: js.UndefOr[ResourceShare] = js.undefined,
      clientToken: js.UndefOr[String] = js.undefined): CreateResourceShareResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShare" -> resourceShare.map { x => x.asInstanceOf[js.Any] },
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResourceShareResponse]
    }
  }

  @js.native
  trait DeleteResourceShareRequest extends js.Object {
    var resourceShareArn: js.UndefOr[String]
    var clientToken: js.UndefOr[String]
  }

  object DeleteResourceShareRequest {
    def apply(
      resourceShareArn: js.UndefOr[String] = js.undefined,
      clientToken: js.UndefOr[String] = js.undefined): DeleteResourceShareRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareArn" -> resourceShareArn.map { x => x.asInstanceOf[js.Any] },
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResourceShareRequest]
    }
  }

  @js.native
  trait DeleteResourceShareResponse extends js.Object {
    var returnValue: js.UndefOr[Boolean]
    var clientToken: js.UndefOr[String]
  }

  object DeleteResourceShareResponse {
    def apply(
      returnValue: js.UndefOr[Boolean] = js.undefined,
      clientToken: js.UndefOr[String] = js.undefined): DeleteResourceShareResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "returnValue" -> returnValue.map { x => x.asInstanceOf[js.Any] },
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResourceShareResponse]
    }
  }

  @js.native
  trait DisassociateResourceShareRequest extends js.Object {
    var resourceShareArn: js.UndefOr[String]
    var resourceArns: js.UndefOr[ResourceArnList]
    var principals: js.UndefOr[PrincipalArnOrIdList]
    var clientToken: js.UndefOr[String]
  }

  object DisassociateResourceShareRequest {
    def apply(
      resourceShareArn: js.UndefOr[String] = js.undefined,
      resourceArns: js.UndefOr[ResourceArnList] = js.undefined,
      principals: js.UndefOr[PrincipalArnOrIdList] = js.undefined,
      clientToken: js.UndefOr[String] = js.undefined): DisassociateResourceShareRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareArn" -> resourceShareArn.map { x => x.asInstanceOf[js.Any] },
        "resourceArns" -> resourceArns.map { x => x.asInstanceOf[js.Any] },
        "principals" -> principals.map { x => x.asInstanceOf[js.Any] },
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateResourceShareRequest]
    }
  }

  @js.native
  trait DisassociateResourceShareResponse extends js.Object {
    var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList]
    var clientToken: js.UndefOr[String]
  }

  object DisassociateResourceShareResponse {
    def apply(
      resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.undefined,
      clientToken: js.UndefOr[String] = js.undefined): DisassociateResourceShareResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareAssociations" -> resourceShareAssociations.map { x => x.asInstanceOf[js.Any] },
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateResourceShareResponse]
    }
  }

  @js.native
  trait EnableSharingWithAwsOrganizationRequest extends js.Object {

  }

  object EnableSharingWithAwsOrganizationRequest {
    def apply(): EnableSharingWithAwsOrganizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableSharingWithAwsOrganizationRequest]
    }
  }

  @js.native
  trait EnableSharingWithAwsOrganizationResponse extends js.Object {
    var returnValue: js.UndefOr[Boolean]
  }

  object EnableSharingWithAwsOrganizationResponse {
    def apply(
      returnValue: js.UndefOr[Boolean] = js.undefined): EnableSharingWithAwsOrganizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "returnValue" -> returnValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableSharingWithAwsOrganizationResponse]
    }
  }

  @js.native
  trait GetResourcePoliciesRequest extends js.Object {
    var resourceArns: js.UndefOr[ResourceArnList]
    var principal: js.UndefOr[String]
    var nextToken: js.UndefOr[String]
    var maxResults: js.UndefOr[MaxResults]
  }

  object GetResourcePoliciesRequest {
    def apply(
      resourceArns: js.UndefOr[ResourceArnList] = js.undefined,
      principal: js.UndefOr[String] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): GetResourcePoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArns" -> resourceArns.map { x => x.asInstanceOf[js.Any] },
        "principal" -> principal.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourcePoliciesRequest]
    }
  }

  @js.native
  trait GetResourcePoliciesResponse extends js.Object {
    var policies: js.UndefOr[PolicyList]
    var nextToken: js.UndefOr[String]
  }

  object GetResourcePoliciesResponse {
    def apply(
      policies: js.UndefOr[PolicyList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): GetResourcePoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policies" -> policies.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourcePoliciesResponse]
    }
  }

  @js.native
  trait GetResourceShareAssociationsRequest extends js.Object {
    var resourceArn: js.UndefOr[String]
    var maxResults: js.UndefOr[MaxResults]
    var associationType: js.UndefOr[ResourceShareAssociationType]
    var nextToken: js.UndefOr[String]
    var resourceShareArns: js.UndefOr[ResourceShareArnList]
    var associationStatus: js.UndefOr[ResourceShareAssociationStatus]
    var principal: js.UndefOr[String]
  }

  object GetResourceShareAssociationsRequest {
    def apply(
      resourceArn: js.UndefOr[String] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      associationType: js.UndefOr[ResourceShareAssociationType] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined,
      associationStatus: js.UndefOr[ResourceShareAssociationStatus] = js.undefined,
      principal: js.UndefOr[String] = js.undefined): GetResourceShareAssociationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "associationType" -> associationType.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "resourceShareArns" -> resourceShareArns.map { x => x.asInstanceOf[js.Any] },
        "associationStatus" -> associationStatus.map { x => x.asInstanceOf[js.Any] },
        "principal" -> principal.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceShareAssociationsRequest]
    }
  }

  @js.native
  trait GetResourceShareAssociationsResponse extends js.Object {
    var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList]
    var nextToken: js.UndefOr[String]
  }

  object GetResourceShareAssociationsResponse {
    def apply(
      resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): GetResourceShareAssociationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareAssociations" -> resourceShareAssociations.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceShareAssociationsResponse]
    }
  }

  @js.native
  trait GetResourceShareInvitationsRequest extends js.Object {
    var resourceShareInvitationArns: js.UndefOr[ResourceShareInvitationArnList]
    var resourceShareArns: js.UndefOr[ResourceShareArnList]
    var nextToken: js.UndefOr[String]
    var maxResults: js.UndefOr[MaxResults]
  }

  object GetResourceShareInvitationsRequest {
    def apply(
      resourceShareInvitationArns: js.UndefOr[ResourceShareInvitationArnList] = js.undefined,
      resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): GetResourceShareInvitationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareInvitationArns" -> resourceShareInvitationArns.map { x => x.asInstanceOf[js.Any] },
        "resourceShareArns" -> resourceShareArns.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceShareInvitationsRequest]
    }
  }

  @js.native
  trait GetResourceShareInvitationsResponse extends js.Object {
    var resourceShareInvitations: js.UndefOr[ResourceShareInvitationList]
    var nextToken: js.UndefOr[String]
  }

  object GetResourceShareInvitationsResponse {
    def apply(
      resourceShareInvitations: js.UndefOr[ResourceShareInvitationList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): GetResourceShareInvitationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareInvitations" -> resourceShareInvitations.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceShareInvitationsResponse]
    }
  }

  @js.native
  trait GetResourceSharesRequest extends js.Object {
    var tagFilters: js.UndefOr[TagFilters]
    var name: js.UndefOr[String]
    var maxResults: js.UndefOr[MaxResults]
    var resourceShareStatus: js.UndefOr[ResourceShareStatus]
    var nextToken: js.UndefOr[String]
    var resourceShareArns: js.UndefOr[ResourceShareArnList]
    var resourceOwner: js.UndefOr[ResourceOwner]
  }

  object GetResourceSharesRequest {
    def apply(
      tagFilters: js.UndefOr[TagFilters] = js.undefined,
      name: js.UndefOr[String] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      resourceShareStatus: js.UndefOr[ResourceShareStatus] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined,
      resourceOwner: js.UndefOr[ResourceOwner] = js.undefined): GetResourceSharesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tagFilters" -> tagFilters.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "resourceShareStatus" -> resourceShareStatus.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "resourceShareArns" -> resourceShareArns.map { x => x.asInstanceOf[js.Any] },
        "resourceOwner" -> resourceOwner.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceSharesRequest]
    }
  }

  @js.native
  trait GetResourceSharesResponse extends js.Object {
    var resourceShares: js.UndefOr[ResourceShareList]
    var nextToken: js.UndefOr[String]
  }

  object GetResourceSharesResponse {
    def apply(
      resourceShares: js.UndefOr[ResourceShareList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): GetResourceSharesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShares" -> resourceShares.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceSharesResponse]
    }
  }

  @js.native
  trait ListPrincipalsRequest extends js.Object {
    var principals: js.UndefOr[PrincipalArnOrIdList]
    var resourceArn: js.UndefOr[String]
    var maxResults: js.UndefOr[MaxResults]
    var resourceType: js.UndefOr[String]
    var nextToken: js.UndefOr[String]
    var resourceShareArns: js.UndefOr[ResourceShareArnList]
    var resourceOwner: js.UndefOr[ResourceOwner]
  }

  object ListPrincipalsRequest {
    def apply(
      principals: js.UndefOr[PrincipalArnOrIdList] = js.undefined,
      resourceArn: js.UndefOr[String] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      resourceType: js.UndefOr[String] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined,
      resourceOwner: js.UndefOr[ResourceOwner] = js.undefined): ListPrincipalsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "principals" -> principals.map { x => x.asInstanceOf[js.Any] },
        "resourceArn" -> resourceArn.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "resourceShareArns" -> resourceShareArns.map { x => x.asInstanceOf[js.Any] },
        "resourceOwner" -> resourceOwner.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPrincipalsRequest]
    }
  }

  @js.native
  trait ListPrincipalsResponse extends js.Object {
    var principals: js.UndefOr[PrincipalList]
    var nextToken: js.UndefOr[String]
  }

  object ListPrincipalsResponse {
    def apply(
      principals: js.UndefOr[PrincipalList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): ListPrincipalsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "principals" -> principals.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPrincipalsResponse]
    }
  }

  @js.native
  trait ListResourcesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var resourceType: js.UndefOr[String]
    var resourceArns: js.UndefOr[ResourceArnList]
    var nextToken: js.UndefOr[String]
    var resourceShareArns: js.UndefOr[ResourceShareArnList]
    var resourceOwner: js.UndefOr[ResourceOwner]
    var principal: js.UndefOr[String]
  }

  object ListResourcesRequest {
    def apply(
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      resourceType: js.UndefOr[String] = js.undefined,
      resourceArns: js.UndefOr[ResourceArnList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined,
      resourceOwner: js.UndefOr[ResourceOwner] = js.undefined,
      principal: js.UndefOr[String] = js.undefined): ListResourcesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "resourceArns" -> resourceArns.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "resourceShareArns" -> resourceShareArns.map { x => x.asInstanceOf[js.Any] },
        "resourceOwner" -> resourceOwner.map { x => x.asInstanceOf[js.Any] },
        "principal" -> principal.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourcesRequest]
    }
  }

  @js.native
  trait ListResourcesResponse extends js.Object {
    var resources: js.UndefOr[ResourceList]
    var nextToken: js.UndefOr[String]
  }

  object ListResourcesResponse {
    def apply(
      resources: js.UndefOr[ResourceList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): ListResourcesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resources" -> resources.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourcesResponse]
    }
  }

  /**
   * <p>Describes a principal for use with AWS Resource Access Manager.</p>
   */
  @js.native
  trait Principal extends js.Object {
    var lastUpdatedTime: js.UndefOr[DateTime]
    var resourceShareArn: js.UndefOr[String]
    var id: js.UndefOr[String]
    var external: js.UndefOr[Boolean]
    var creationTime: js.UndefOr[DateTime]
  }

  object Principal {
    def apply(
      lastUpdatedTime: js.UndefOr[DateTime] = js.undefined,
      resourceShareArn: js.UndefOr[String] = js.undefined,
      id: js.UndefOr[String] = js.undefined,
      external: js.UndefOr[Boolean] = js.undefined,
      creationTime: js.UndefOr[DateTime] = js.undefined): Principal = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lastUpdatedTime" -> lastUpdatedTime.map { x => x.asInstanceOf[js.Any] },
        "resourceShareArn" -> resourceShareArn.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "external" -> external.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Principal]
    }
  }

  @js.native
  trait RejectResourceShareInvitationRequest extends js.Object {
    var resourceShareInvitationArn: js.UndefOr[String]
    var clientToken: js.UndefOr[String]
  }

  object RejectResourceShareInvitationRequest {
    def apply(
      resourceShareInvitationArn: js.UndefOr[String] = js.undefined,
      clientToken: js.UndefOr[String] = js.undefined): RejectResourceShareInvitationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareInvitationArn" -> resourceShareInvitationArn.map { x => x.asInstanceOf[js.Any] },
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectResourceShareInvitationRequest]
    }
  }

  @js.native
  trait RejectResourceShareInvitationResponse extends js.Object {
    var resourceShareInvitation: js.UndefOr[ResourceShareInvitation]
    var clientToken: js.UndefOr[String]
  }

  object RejectResourceShareInvitationResponse {
    def apply(
      resourceShareInvitation: js.UndefOr[ResourceShareInvitation] = js.undefined,
      clientToken: js.UndefOr[String] = js.undefined): RejectResourceShareInvitationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareInvitation" -> resourceShareInvitation.map { x => x.asInstanceOf[js.Any] },
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectResourceShareInvitationResponse]
    }
  }

  /**
   * <p>Describes a resource associated with a resource share.</p>
   */
  @js.native
  trait Resource extends js.Object {
    var arn: js.UndefOr[String]
    var lastUpdatedTime: js.UndefOr[DateTime]
    var resourceShareArn: js.UndefOr[String]
    var status: js.UndefOr[ResourceStatus]
    var `type`: js.UndefOr[String]
    var statusMessage: js.UndefOr[String]
    var creationTime: js.UndefOr[DateTime]
  }

  object Resource {
    def apply(
      arn: js.UndefOr[String] = js.undefined,
      lastUpdatedTime: js.UndefOr[DateTime] = js.undefined,
      resourceShareArn: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[ResourceStatus] = js.undefined,
      `type`: js.UndefOr[String] = js.undefined,
      statusMessage: js.UndefOr[String] = js.undefined,
      creationTime: js.UndefOr[DateTime] = js.undefined): Resource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedTime" -> lastUpdatedTime.map { x => x.asInstanceOf[js.Any] },
        "resourceShareArn" -> resourceShareArn.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "statusMessage" -> statusMessage.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Resource]
    }
  }

  object ResourceOwnerEnum {
    val SELF = "SELF"
    val `OTHER-ACCOUNTS` = "OTHER-ACCOUNTS"

    val values = IndexedSeq(SELF, `OTHER-ACCOUNTS`)
  }

  /**
   * <p>Describes a resource share.</p>
   */
  @js.native
  trait ResourceShare extends js.Object {
    var name: js.UndefOr[String]
    var lastUpdatedTime: js.UndefOr[DateTime]
    var owningAccountId: js.UndefOr[String]
    var resourceShareArn: js.UndefOr[String]
    var allowExternalPrincipals: js.UndefOr[Boolean]
    var tags: js.UndefOr[TagList]
    var status: js.UndefOr[ResourceShareStatus]
    var statusMessage: js.UndefOr[String]
    var creationTime: js.UndefOr[DateTime]
  }

  object ResourceShare {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      lastUpdatedTime: js.UndefOr[DateTime] = js.undefined,
      owningAccountId: js.UndefOr[String] = js.undefined,
      resourceShareArn: js.UndefOr[String] = js.undefined,
      allowExternalPrincipals: js.UndefOr[Boolean] = js.undefined,
      tags: js.UndefOr[TagList] = js.undefined,
      status: js.UndefOr[ResourceShareStatus] = js.undefined,
      statusMessage: js.UndefOr[String] = js.undefined,
      creationTime: js.UndefOr[DateTime] = js.undefined): ResourceShare = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedTime" -> lastUpdatedTime.map { x => x.asInstanceOf[js.Any] },
        "owningAccountId" -> owningAccountId.map { x => x.asInstanceOf[js.Any] },
        "resourceShareArn" -> resourceShareArn.map { x => x.asInstanceOf[js.Any] },
        "allowExternalPrincipals" -> allowExternalPrincipals.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "statusMessage" -> statusMessage.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceShare]
    }
  }

  /**
   * <p>Describes an association with a resource share.</p>
   */
  @js.native
  trait ResourceShareAssociation extends js.Object {
    var lastUpdatedTime: js.UndefOr[DateTime]
    var resourceShareArn: js.UndefOr[String]
    var associationType: js.UndefOr[ResourceShareAssociationType]
    var associatedEntity: js.UndefOr[String]
    var external: js.UndefOr[Boolean]
    var status: js.UndefOr[ResourceShareAssociationStatus]
    var statusMessage: js.UndefOr[String]
    var creationTime: js.UndefOr[DateTime]
  }

  object ResourceShareAssociation {
    def apply(
      lastUpdatedTime: js.UndefOr[DateTime] = js.undefined,
      resourceShareArn: js.UndefOr[String] = js.undefined,
      associationType: js.UndefOr[ResourceShareAssociationType] = js.undefined,
      associatedEntity: js.UndefOr[String] = js.undefined,
      external: js.UndefOr[Boolean] = js.undefined,
      status: js.UndefOr[ResourceShareAssociationStatus] = js.undefined,
      statusMessage: js.UndefOr[String] = js.undefined,
      creationTime: js.UndefOr[DateTime] = js.undefined): ResourceShareAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lastUpdatedTime" -> lastUpdatedTime.map { x => x.asInstanceOf[js.Any] },
        "resourceShareArn" -> resourceShareArn.map { x => x.asInstanceOf[js.Any] },
        "associationType" -> associationType.map { x => x.asInstanceOf[js.Any] },
        "associatedEntity" -> associatedEntity.map { x => x.asInstanceOf[js.Any] },
        "external" -> external.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "statusMessage" -> statusMessage.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceShareAssociation]
    }
  }

  object ResourceShareAssociationStatusEnum {
    val ASSOCIATING = "ASSOCIATING"
    val ASSOCIATED = "ASSOCIATED"
    val FAILED = "FAILED"
    val DISASSOCIATING = "DISASSOCIATING"
    val DISASSOCIATED = "DISASSOCIATED"

    val values = IndexedSeq(ASSOCIATING, ASSOCIATED, FAILED, DISASSOCIATING, DISASSOCIATED)
  }

  object ResourceShareAssociationTypeEnum {
    val PRINCIPAL = "PRINCIPAL"
    val RESOURCE = "RESOURCE"

    val values = IndexedSeq(PRINCIPAL, RESOURCE)
  }

  /**
   * <p>Describes an invitation to join a resource share.</p>
   */
  @js.native
  trait ResourceShareInvitation extends js.Object {
    var resourceShareInvitationArn: js.UndefOr[String]
    var receiverAccountId: js.UndefOr[String]
    var resourceShareArn: js.UndefOr[String]
    var resourceShareName: js.UndefOr[String]
    var senderAccountId: js.UndefOr[String]
    var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList]
    var status: js.UndefOr[ResourceShareInvitationStatus]
    var invitationTimestamp: js.UndefOr[DateTime]
  }

  object ResourceShareInvitation {
    def apply(
      resourceShareInvitationArn: js.UndefOr[String] = js.undefined,
      receiverAccountId: js.UndefOr[String] = js.undefined,
      resourceShareArn: js.UndefOr[String] = js.undefined,
      resourceShareName: js.UndefOr[String] = js.undefined,
      senderAccountId: js.UndefOr[String] = js.undefined,
      resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.undefined,
      status: js.UndefOr[ResourceShareInvitationStatus] = js.undefined,
      invitationTimestamp: js.UndefOr[DateTime] = js.undefined): ResourceShareInvitation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareInvitationArn" -> resourceShareInvitationArn.map { x => x.asInstanceOf[js.Any] },
        "receiverAccountId" -> receiverAccountId.map { x => x.asInstanceOf[js.Any] },
        "resourceShareArn" -> resourceShareArn.map { x => x.asInstanceOf[js.Any] },
        "resourceShareName" -> resourceShareName.map { x => x.asInstanceOf[js.Any] },
        "senderAccountId" -> senderAccountId.map { x => x.asInstanceOf[js.Any] },
        "resourceShareAssociations" -> resourceShareAssociations.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "invitationTimestamp" -> invitationTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceShareInvitation]
    }
  }

  object ResourceShareInvitationStatusEnum {
    val PENDING = "PENDING"
    val ACCEPTED = "ACCEPTED"
    val REJECTED = "REJECTED"
    val EXPIRED = "EXPIRED"

    val values = IndexedSeq(PENDING, ACCEPTED, REJECTED, EXPIRED)
  }

  object ResourceShareStatusEnum {
    val PENDING = "PENDING"
    val ACTIVE = "ACTIVE"
    val FAILED = "FAILED"
    val DELETING = "DELETING"
    val DELETED = "DELETED"

    val values = IndexedSeq(PENDING, ACTIVE, FAILED, DELETING, DELETED)
  }

  object ResourceStatusEnum {
    val AVAILABLE = "AVAILABLE"
    val ZONAL_RESOURCE_INACCESSIBLE = "ZONAL_RESOURCE_INACCESSIBLE"
    val LIMIT_EXCEEDED = "LIMIT_EXCEEDED"
    val UNAVAILABLE = "UNAVAILABLE"

    val values = IndexedSeq(AVAILABLE, ZONAL_RESOURCE_INACCESSIBLE, LIMIT_EXCEEDED, UNAVAILABLE)
  }

  /**
   * <p>Information about a tag.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var key: js.UndefOr[TagKey]
    var value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      key: js.UndefOr[TagKey] = js.undefined,
      value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>Used to filter information based on tags.</p>
   */
  @js.native
  trait TagFilter extends js.Object {
    var tagKey: js.UndefOr[TagKey]
    var tagValues: js.UndefOr[TagValueList]
  }

  object TagFilter {
    def apply(
      tagKey: js.UndefOr[TagKey] = js.undefined,
      tagValues: js.UndefOr[TagValueList] = js.undefined): TagFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tagKey" -> tagKey.map { x => x.asInstanceOf[js.Any] },
        "tagValues" -> tagValues.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagFilter]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceShareArn: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
  }

  object TagResourceRequest {
    def apply(
      resourceShareArn: js.UndefOr[String] = js.undefined,
      tags: js.UndefOr[TagList] = js.undefined): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareArn" -> resourceShareArn.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {

  }

  object TagResourceResponse {
    def apply(): TagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceShareArn: js.UndefOr[String]
    var tagKeys: js.UndefOr[TagKeyList]
  }

  object UntagResourceRequest {
    def apply(
      resourceShareArn: js.UndefOr[String] = js.undefined,
      tagKeys: js.UndefOr[TagKeyList] = js.undefined): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareArn" -> resourceShareArn.map { x => x.asInstanceOf[js.Any] },
        "tagKeys" -> tagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {

  }

  object UntagResourceResponse {
    def apply(): UntagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateResourceShareRequest extends js.Object {
    var resourceShareArn: js.UndefOr[String]
    var name: js.UndefOr[String]
    var allowExternalPrincipals: js.UndefOr[Boolean]
    var clientToken: js.UndefOr[String]
  }

  object UpdateResourceShareRequest {
    def apply(
      resourceShareArn: js.UndefOr[String] = js.undefined,
      name: js.UndefOr[String] = js.undefined,
      allowExternalPrincipals: js.UndefOr[Boolean] = js.undefined,
      clientToken: js.UndefOr[String] = js.undefined): UpdateResourceShareRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareArn" -> resourceShareArn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "allowExternalPrincipals" -> allowExternalPrincipals.map { x => x.asInstanceOf[js.Any] },
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateResourceShareRequest]
    }
  }

  @js.native
  trait UpdateResourceShareResponse extends js.Object {
    var resourceShare: js.UndefOr[ResourceShare]
    var clientToken: js.UndefOr[String]
  }

  object UpdateResourceShareResponse {
    def apply(
      resourceShare: js.UndefOr[ResourceShare] = js.undefined,
      clientToken: js.UndefOr[String] = js.undefined): UpdateResourceShareResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShare" -> resourceShare.map { x => x.asInstanceOf[js.Any] },
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateResourceShareResponse]
    }
  }
}
