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

  implicit final class RAMOps(val service: RAM) extends AnyVal {

    def acceptResourceShareInvitationFuture(
        params: AcceptResourceShareInvitationRequest
    ): Future[AcceptResourceShareInvitationResponse] = service.acceptResourceShareInvitation(params).promise.toFuture
    def associateResourceShareFuture(params: AssociateResourceShareRequest): Future[AssociateResourceShareResponse] =
      service.associateResourceShare(params).promise.toFuture
    def createResourceShareFuture(params: CreateResourceShareRequest): Future[CreateResourceShareResponse] =
      service.createResourceShare(params).promise.toFuture
    def deleteResourceShareFuture(params: DeleteResourceShareRequest): Future[DeleteResourceShareResponse] =
      service.deleteResourceShare(params).promise.toFuture
    def disassociateResourceShareFuture(
        params: DisassociateResourceShareRequest
    ): Future[DisassociateResourceShareResponse] = service.disassociateResourceShare(params).promise.toFuture
    def enableSharingWithAwsOrganizationFuture(
        params: EnableSharingWithAwsOrganizationRequest
    ): Future[EnableSharingWithAwsOrganizationResponse] =
      service.enableSharingWithAwsOrganization(params).promise.toFuture
    def getResourcePoliciesFuture(params: GetResourcePoliciesRequest): Future[GetResourcePoliciesResponse] =
      service.getResourcePolicies(params).promise.toFuture
    def getResourceShareAssociationsFuture(
        params: GetResourceShareAssociationsRequest
    ): Future[GetResourceShareAssociationsResponse] = service.getResourceShareAssociations(params).promise.toFuture
    def getResourceShareInvitationsFuture(
        params: GetResourceShareInvitationsRequest
    ): Future[GetResourceShareInvitationsResponse] = service.getResourceShareInvitations(params).promise.toFuture
    def getResourceSharesFuture(params: GetResourceSharesRequest): Future[GetResourceSharesResponse] =
      service.getResourceShares(params).promise.toFuture
    def listPrincipalsFuture(params: ListPrincipalsRequest): Future[ListPrincipalsResponse] =
      service.listPrincipals(params).promise.toFuture
    def listResourcesFuture(params: ListResourcesRequest): Future[ListResourcesResponse] =
      service.listResources(params).promise.toFuture
    def rejectResourceShareInvitationFuture(
        params: RejectResourceShareInvitationRequest
    ): Future[RejectResourceShareInvitationResponse] = service.rejectResourceShareInvitation(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    def updateResourceShareFuture(params: UpdateResourceShareRequest): Future[UpdateResourceShareResponse] =
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
    def listPrincipals(params: ListPrincipalsRequest): Request[ListPrincipalsResponse]          = js.native
    def listResources(params: ListResourcesRequest): Request[ListResourcesResponse]             = js.native
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
    def apply(
        resourceShareInvitationArn: String,
        clientToken: js.UndefOr[String] = js.undefined
    ): AcceptResourceShareInvitationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareInvitationArn" -> resourceShareInvitationArn.asInstanceOf[js.Any],
        "clientToken" -> clientToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptResourceShareInvitationRequest]
    }
  }

  @js.native
  trait AcceptResourceShareInvitationResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var resourceShareInvitation: js.UndefOr[ResourceShareInvitation]
  }

  object AcceptResourceShareInvitationResponse {
    def apply(
        clientToken: js.UndefOr[String] = js.undefined,
        resourceShareInvitation: js.UndefOr[ResourceShareInvitation] = js.undefined
    ): AcceptResourceShareInvitationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientToken" -> clientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShareInvitation" -> resourceShareInvitation.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptResourceShareInvitationResponse]
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
    def apply(
        resourceShareArn: String,
        clientToken: js.UndefOr[String] = js.undefined,
        principals: js.UndefOr[PrincipalArnOrIdList] = js.undefined,
        resourceArns: js.UndefOr[ResourceArnList] = js.undefined
    ): AssociateResourceShareRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareArn" -> resourceShareArn.asInstanceOf[js.Any],
        "clientToken" -> clientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "principals" -> principals.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceArns" -> resourceArns.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateResourceShareRequest]
    }
  }

  @js.native
  trait AssociateResourceShareResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList]
  }

  object AssociateResourceShareResponse {
    def apply(
        clientToken: js.UndefOr[String] = js.undefined,
        resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.undefined
    ): AssociateResourceShareResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientToken" -> clientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShareAssociations" -> resourceShareAssociations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateResourceShareResponse]
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
    def apply(
        name: String,
        allowExternalPrincipals: js.UndefOr[Boolean] = js.undefined,
        clientToken: js.UndefOr[String] = js.undefined,
        principals: js.UndefOr[PrincipalArnOrIdList] = js.undefined,
        resourceArns: js.UndefOr[ResourceArnList] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateResourceShareRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.asInstanceOf[js.Any],
        "allowExternalPrincipals" -> allowExternalPrincipals.map { x =>
          x.asInstanceOf[js.Any]
        },
        "clientToken" -> clientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "principals" -> principals.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceArns" -> resourceArns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResourceShareRequest]
    }
  }

  @js.native
  trait CreateResourceShareResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var resourceShare: js.UndefOr[ResourceShare]
  }

  object CreateResourceShareResponse {
    def apply(
        clientToken: js.UndefOr[String] = js.undefined,
        resourceShare: js.UndefOr[ResourceShare] = js.undefined
    ): CreateResourceShareResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientToken" -> clientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShare" -> resourceShare.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResourceShareResponse]
    }
  }

  @js.native
  trait DeleteResourceShareRequest extends js.Object {
    var resourceShareArn: String
    var clientToken: js.UndefOr[String]
  }

  object DeleteResourceShareRequest {
    def apply(
        resourceShareArn: String,
        clientToken: js.UndefOr[String] = js.undefined
    ): DeleteResourceShareRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareArn" -> resourceShareArn.asInstanceOf[js.Any],
        "clientToken" -> clientToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResourceShareRequest]
    }
  }

  @js.native
  trait DeleteResourceShareResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var returnValue: js.UndefOr[Boolean]
  }

  object DeleteResourceShareResponse {
    def apply(
        clientToken: js.UndefOr[String] = js.undefined,
        returnValue: js.UndefOr[Boolean] = js.undefined
    ): DeleteResourceShareResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientToken" -> clientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "returnValue" -> returnValue.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResourceShareResponse]
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
    def apply(
        resourceShareArn: String,
        clientToken: js.UndefOr[String] = js.undefined,
        principals: js.UndefOr[PrincipalArnOrIdList] = js.undefined,
        resourceArns: js.UndefOr[ResourceArnList] = js.undefined
    ): DisassociateResourceShareRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareArn" -> resourceShareArn.asInstanceOf[js.Any],
        "clientToken" -> clientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "principals" -> principals.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceArns" -> resourceArns.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateResourceShareRequest]
    }
  }

  @js.native
  trait DisassociateResourceShareResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList]
  }

  object DisassociateResourceShareResponse {
    def apply(
        clientToken: js.UndefOr[String] = js.undefined,
        resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.undefined
    ): DisassociateResourceShareResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientToken" -> clientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShareAssociations" -> resourceShareAssociations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateResourceShareResponse]
    }
  }

  @js.native
  trait EnableSharingWithAwsOrganizationRequest extends js.Object {}

  object EnableSharingWithAwsOrganizationRequest {
    def apply(
        ): EnableSharingWithAwsOrganizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableSharingWithAwsOrganizationRequest]
    }
  }

  @js.native
  trait EnableSharingWithAwsOrganizationResponse extends js.Object {
    var returnValue: js.UndefOr[Boolean]
  }

  object EnableSharingWithAwsOrganizationResponse {
    def apply(
        returnValue: js.UndefOr[Boolean] = js.undefined
    ): EnableSharingWithAwsOrganizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "returnValue" -> returnValue.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableSharingWithAwsOrganizationResponse]
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
    def apply(
        resourceArns: ResourceArnList,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        principal: js.UndefOr[String] = js.undefined
    ): GetResourcePoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArns" -> resourceArns.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "principal" -> principal.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourcePoliciesRequest]
    }
  }

  @js.native
  trait GetResourcePoliciesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var policies: js.UndefOr[PolicyList]
  }

  object GetResourcePoliciesResponse {
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        policies: js.UndefOr[PolicyList] = js.undefined
    ): GetResourcePoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policies" -> policies.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourcePoliciesResponse]
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
    def apply(
        associationType: ResourceShareAssociationType,
        associationStatus: js.UndefOr[ResourceShareAssociationStatus] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        principal: js.UndefOr[String] = js.undefined,
        resourceArn: js.UndefOr[String] = js.undefined,
        resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined
    ): GetResourceShareAssociationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "associationType" -> associationType.asInstanceOf[js.Any],
        "associationStatus" -> associationStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "principal" -> principal.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceArn" -> resourceArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShareArns" -> resourceShareArns.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceShareAssociationsRequest]
    }
  }

  @js.native
  trait GetResourceShareAssociationsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList]
  }

  object GetResourceShareAssociationsResponse {
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.undefined
    ): GetResourceShareAssociationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShareAssociations" -> resourceShareAssociations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceShareAssociationsResponse]
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
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined,
        resourceShareInvitationArns: js.UndefOr[ResourceShareInvitationArnList] = js.undefined
    ): GetResourceShareInvitationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShareArns" -> resourceShareArns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShareInvitationArns" -> resourceShareInvitationArns.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceShareInvitationsRequest]
    }
  }

  @js.native
  trait GetResourceShareInvitationsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var resourceShareInvitations: js.UndefOr[ResourceShareInvitationList]
  }

  object GetResourceShareInvitationsResponse {
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        resourceShareInvitations: js.UndefOr[ResourceShareInvitationList] = js.undefined
    ): GetResourceShareInvitationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShareInvitations" -> resourceShareInvitations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceShareInvitationsResponse]
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
    def apply(
        resourceOwner: ResourceOwner,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined,
        resourceShareStatus: js.UndefOr[ResourceShareStatus] = js.undefined,
        tagFilters: js.UndefOr[TagFilters] = js.undefined
    ): GetResourceSharesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceOwner" -> resourceOwner.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShareArns" -> resourceShareArns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShareStatus" -> resourceShareStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tagFilters" -> tagFilters.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceSharesRequest]
    }
  }

  @js.native
  trait GetResourceSharesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var resourceShares: js.UndefOr[ResourceShareList]
  }

  object GetResourceSharesResponse {
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        resourceShares: js.UndefOr[ResourceShareList] = js.undefined
    ): GetResourceSharesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShares" -> resourceShares.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceSharesResponse]
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
    def apply(
        resourceOwner: ResourceOwner,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        principals: js.UndefOr[PrincipalArnOrIdList] = js.undefined,
        resourceArn: js.UndefOr[String] = js.undefined,
        resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined,
        resourceType: js.UndefOr[String] = js.undefined
    ): ListPrincipalsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceOwner" -> resourceOwner.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "principals" -> principals.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceArn" -> resourceArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShareArns" -> resourceShareArns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceType" -> resourceType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPrincipalsRequest]
    }
  }

  @js.native
  trait ListPrincipalsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var principals: js.UndefOr[PrincipalList]
  }

  object ListPrincipalsResponse {
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        principals: js.UndefOr[PrincipalList] = js.undefined
    ): ListPrincipalsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "principals" -> principals.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPrincipalsResponse]
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
    def apply(
        resourceOwner: ResourceOwner,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        principal: js.UndefOr[String] = js.undefined,
        resourceArns: js.UndefOr[ResourceArnList] = js.undefined,
        resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined,
        resourceType: js.UndefOr[String] = js.undefined
    ): ListResourcesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceOwner" -> resourceOwner.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "principal" -> principal.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceArns" -> resourceArns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShareArns" -> resourceShareArns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceType" -> resourceType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourcesRequest]
    }
  }

  @js.native
  trait ListResourcesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var resources: js.UndefOr[ResourceList]
  }

  object ListResourcesResponse {
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        resources: js.UndefOr[ResourceList] = js.undefined
    ): ListResourcesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resources" -> resources.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourcesResponse]
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
    def apply(
        creationTime: js.UndefOr[DateTime] = js.undefined,
        external: js.UndefOr[Boolean] = js.undefined,
        id: js.UndefOr[String] = js.undefined,
        lastUpdatedTime: js.UndefOr[DateTime] = js.undefined,
        resourceShareArn: js.UndefOr[String] = js.undefined
    ): Principal = {
      val _fields = IndexedSeq[(String, js.Any)](
        "creationTime" -> creationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "external" -> external.map { x =>
          x.asInstanceOf[js.Any]
        },
        "id" -> id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastUpdatedTime" -> lastUpdatedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShareArn" -> resourceShareArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Principal]
    }
  }

  @js.native
  trait RejectResourceShareInvitationRequest extends js.Object {
    var resourceShareInvitationArn: String
    var clientToken: js.UndefOr[String]
  }

  object RejectResourceShareInvitationRequest {
    def apply(
        resourceShareInvitationArn: String,
        clientToken: js.UndefOr[String] = js.undefined
    ): RejectResourceShareInvitationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareInvitationArn" -> resourceShareInvitationArn.asInstanceOf[js.Any],
        "clientToken" -> clientToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectResourceShareInvitationRequest]
    }
  }

  @js.native
  trait RejectResourceShareInvitationResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var resourceShareInvitation: js.UndefOr[ResourceShareInvitation]
  }

  object RejectResourceShareInvitationResponse {
    def apply(
        clientToken: js.UndefOr[String] = js.undefined,
        resourceShareInvitation: js.UndefOr[ResourceShareInvitation] = js.undefined
    ): RejectResourceShareInvitationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientToken" -> clientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShareInvitation" -> resourceShareInvitation.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectResourceShareInvitationResponse]
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
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        creationTime: js.UndefOr[DateTime] = js.undefined,
        lastUpdatedTime: js.UndefOr[DateTime] = js.undefined,
        resourceShareArn: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[ResourceStatus] = js.undefined,
        statusMessage: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[String] = js.undefined
    ): Resource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "creationTime" -> creationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastUpdatedTime" -> lastUpdatedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShareArn" -> resourceShareArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "statusMessage" -> statusMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "`type`" -> `type`.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Resource]
    }
  }

  object ResourceOwnerEnum {
    val SELF             = "SELF"
    val `OTHER-ACCOUNTS` = "OTHER-ACCOUNTS"

    val values = IndexedSeq(SELF, `OTHER-ACCOUNTS`)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "allowExternalPrincipals" -> allowExternalPrincipals.map { x =>
          x.asInstanceOf[js.Any]
        },
        "creationTime" -> creationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastUpdatedTime" -> lastUpdatedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "owningAccountId" -> owningAccountId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShareArn" -> resourceShareArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "statusMessage" -> statusMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceShare]
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
    var status: js.UndefOr[ResourceShareAssociationStatus]
    var statusMessage: js.UndefOr[String]
  }

  object ResourceShareAssociation {
    def apply(
        associatedEntity: js.UndefOr[String] = js.undefined,
        associationType: js.UndefOr[ResourceShareAssociationType] = js.undefined,
        creationTime: js.UndefOr[DateTime] = js.undefined,
        external: js.UndefOr[Boolean] = js.undefined,
        lastUpdatedTime: js.UndefOr[DateTime] = js.undefined,
        resourceShareArn: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[ResourceShareAssociationStatus] = js.undefined,
        statusMessage: js.UndefOr[String] = js.undefined
    ): ResourceShareAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "associatedEntity" -> associatedEntity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "associationType" -> associationType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "creationTime" -> creationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "external" -> external.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastUpdatedTime" -> lastUpdatedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShareArn" -> resourceShareArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "statusMessage" -> statusMessage.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceShareAssociation]
    }
  }

  object ResourceShareAssociationStatusEnum {
    val ASSOCIATING    = "ASSOCIATING"
    val ASSOCIATED     = "ASSOCIATED"
    val FAILED         = "FAILED"
    val DISASSOCIATING = "DISASSOCIATING"
    val DISASSOCIATED  = "DISASSOCIATED"

    val values = IndexedSeq(ASSOCIATING, ASSOCIATED, FAILED, DISASSOCIATING, DISASSOCIATED)
  }

  object ResourceShareAssociationTypeEnum {
    val PRINCIPAL = "PRINCIPAL"
    val RESOURCE  = "RESOURCE"

    val values = IndexedSeq(PRINCIPAL, RESOURCE)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "invitationTimestamp" -> invitationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "receiverAccountId" -> receiverAccountId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShareArn" -> resourceShareArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShareAssociations" -> resourceShareAssociations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShareInvitationArn" -> resourceShareInvitationArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShareName" -> resourceShareName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "senderAccountId" -> senderAccountId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceShareInvitation]
    }
  }

  object ResourceShareInvitationStatusEnum {
    val PENDING  = "PENDING"
    val ACCEPTED = "ACCEPTED"
    val REJECTED = "REJECTED"
    val EXPIRED  = "EXPIRED"

    val values = IndexedSeq(PENDING, ACCEPTED, REJECTED, EXPIRED)
  }

  object ResourceShareStatusEnum {
    val PENDING  = "PENDING"
    val ACTIVE   = "ACTIVE"
    val FAILED   = "FAILED"
    val DELETING = "DELETING"
    val DELETED  = "DELETED"

    val values = IndexedSeq(PENDING, ACTIVE, FAILED, DELETING, DELETED)
  }

  object ResourceStatusEnum {
    val AVAILABLE                   = "AVAILABLE"
    val ZONAL_RESOURCE_INACCESSIBLE = "ZONAL_RESOURCE_INACCESSIBLE"
    val LIMIT_EXCEEDED              = "LIMIT_EXCEEDED"
    val UNAVAILABLE                 = "UNAVAILABLE"

    val values = IndexedSeq(AVAILABLE, ZONAL_RESOURCE_INACCESSIBLE, LIMIT_EXCEEDED, UNAVAILABLE)
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
    def apply(
        key: js.UndefOr[TagKey] = js.undefined,
        value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.map { x =>
          x.asInstanceOf[js.Any]
        },
        "value" -> value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
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
    def apply(
        tagKey: js.UndefOr[TagKey] = js.undefined,
        tagValues: js.UndefOr[TagValueList] = js.undefined
    ): TagFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tagKey" -> tagKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tagValues" -> tagValues.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagFilter]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceShareArn: String
    var tags: TagList
  }

  object TagResourceRequest {
    def apply(
        resourceShareArn: String,
        tags: TagList
    ): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareArn" -> resourceShareArn.asInstanceOf[js.Any],
        "tags"             -> tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceShareArn: String
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    def apply(
        resourceShareArn: String,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareArn" -> resourceShareArn.asInstanceOf[js.Any],
        "tagKeys"          -> tagKeys.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceResponse]
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
    def apply(
        resourceShareArn: String,
        allowExternalPrincipals: js.UndefOr[Boolean] = js.undefined,
        clientToken: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined
    ): UpdateResourceShareRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceShareArn" -> resourceShareArn.asInstanceOf[js.Any],
        "allowExternalPrincipals" -> allowExternalPrincipals.map { x =>
          x.asInstanceOf[js.Any]
        },
        "clientToken" -> clientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateResourceShareRequest]
    }
  }

  @js.native
  trait UpdateResourceShareResponse extends js.Object {
    var clientToken: js.UndefOr[String]
    var resourceShare: js.UndefOr[ResourceShare]
  }

  object UpdateResourceShareResponse {
    def apply(
        clientToken: js.UndefOr[String] = js.undefined,
        resourceShare: js.UndefOr[ResourceShare] = js.undefined
    ): UpdateResourceShareResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientToken" -> clientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceShare" -> resourceShare.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateResourceShareResponse]
    }
  }
}
