package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object route53resolver {
  type AccountId = String
  type Arn = String
  type CreatorRequestId = String
  type DomainName = String
  type FilterName = String
  type FilterValue = String
  type FilterValues = js.Array[FilterValue]
  type Filters = js.Array[Filter]
  type Ip = String
  type IpAddressCount = Int
  type IpAddressesRequest = js.Array[IpAddressRequest]
  type IpAddressesResponse = js.Array[IpAddressResponse]
  type MaxResults = Int
  type Name = String
  type NextToken = String
  type Port = Int
  type ResolverEndpoints = js.Array[ResolverEndpoint]
  type ResolverRuleAssociations = js.Array[ResolverRuleAssociation]
  type ResolverRulePolicy = String
  type ResolverRules = js.Array[ResolverRule]
  type ResourceId = String
  type Rfc3339TimeString = String
  type SecurityGroupIds = js.Array[ResourceId]
  type StatusMessage = String
  type SubnetId = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TargetList = js.Array[TargetAddress]

  implicit final class Route53ResolverOps(private val service: Route53Resolver) extends AnyVal {

    @inline def associateResolverEndpointIpAddressFuture(params: AssociateResolverEndpointIpAddressRequest): Future[AssociateResolverEndpointIpAddressResponse] = service.associateResolverEndpointIpAddress(params).promise().toFuture
    @inline def associateResolverRuleFuture(params: AssociateResolverRuleRequest): Future[AssociateResolverRuleResponse] = service.associateResolverRule(params).promise().toFuture
    @inline def createResolverEndpointFuture(params: CreateResolverEndpointRequest): Future[CreateResolverEndpointResponse] = service.createResolverEndpoint(params).promise().toFuture
    @inline def createResolverRuleFuture(params: CreateResolverRuleRequest): Future[CreateResolverRuleResponse] = service.createResolverRule(params).promise().toFuture
    @inline def deleteResolverEndpointFuture(params: DeleteResolverEndpointRequest): Future[DeleteResolverEndpointResponse] = service.deleteResolverEndpoint(params).promise().toFuture
    @inline def deleteResolverRuleFuture(params: DeleteResolverRuleRequest): Future[DeleteResolverRuleResponse] = service.deleteResolverRule(params).promise().toFuture
    @inline def disassociateResolverEndpointIpAddressFuture(params: DisassociateResolverEndpointIpAddressRequest): Future[DisassociateResolverEndpointIpAddressResponse] = service.disassociateResolverEndpointIpAddress(params).promise().toFuture
    @inline def disassociateResolverRuleFuture(params: DisassociateResolverRuleRequest): Future[DisassociateResolverRuleResponse] = service.disassociateResolverRule(params).promise().toFuture
    @inline def getResolverEndpointFuture(params: GetResolverEndpointRequest): Future[GetResolverEndpointResponse] = service.getResolverEndpoint(params).promise().toFuture
    @inline def getResolverRuleAssociationFuture(params: GetResolverRuleAssociationRequest): Future[GetResolverRuleAssociationResponse] = service.getResolverRuleAssociation(params).promise().toFuture
    @inline def getResolverRuleFuture(params: GetResolverRuleRequest): Future[GetResolverRuleResponse] = service.getResolverRule(params).promise().toFuture
    @inline def getResolverRulePolicyFuture(params: GetResolverRulePolicyRequest): Future[GetResolverRulePolicyResponse] = service.getResolverRulePolicy(params).promise().toFuture
    @inline def listResolverEndpointIpAddressesFuture(params: ListResolverEndpointIpAddressesRequest): Future[ListResolverEndpointIpAddressesResponse] = service.listResolverEndpointIpAddresses(params).promise().toFuture
    @inline def listResolverEndpointsFuture(params: ListResolverEndpointsRequest): Future[ListResolverEndpointsResponse] = service.listResolverEndpoints(params).promise().toFuture
    @inline def listResolverRuleAssociationsFuture(params: ListResolverRuleAssociationsRequest): Future[ListResolverRuleAssociationsResponse] = service.listResolverRuleAssociations(params).promise().toFuture
    @inline def listResolverRulesFuture(params: ListResolverRulesRequest): Future[ListResolverRulesResponse] = service.listResolverRules(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putResolverRulePolicyFuture(params: PutResolverRulePolicyRequest): Future[PutResolverRulePolicyResponse] = service.putResolverRulePolicy(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateResolverEndpointFuture(params: UpdateResolverEndpointRequest): Future[UpdateResolverEndpointResponse] = service.updateResolverEndpoint(params).promise().toFuture
    @inline def updateResolverRuleFuture(params: UpdateResolverRuleRequest): Future[UpdateResolverRuleResponse] = service.updateResolverRule(params).promise().toFuture

  }
}

package route53resolver {
  @js.native
  @JSImport("aws-sdk/clients/route53resolver", JSImport.Namespace, "AWS.Route53Resolver")
  class Route53Resolver() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateResolverEndpointIpAddress(params: AssociateResolverEndpointIpAddressRequest): Request[AssociateResolverEndpointIpAddressResponse] = js.native
    def associateResolverRule(params: AssociateResolverRuleRequest): Request[AssociateResolverRuleResponse] = js.native
    def createResolverEndpoint(params: CreateResolverEndpointRequest): Request[CreateResolverEndpointResponse] = js.native
    def createResolverRule(params: CreateResolverRuleRequest): Request[CreateResolverRuleResponse] = js.native
    def deleteResolverEndpoint(params: DeleteResolverEndpointRequest): Request[DeleteResolverEndpointResponse] = js.native
    def deleteResolverRule(params: DeleteResolverRuleRequest): Request[DeleteResolverRuleResponse] = js.native
    def disassociateResolverEndpointIpAddress(params: DisassociateResolverEndpointIpAddressRequest): Request[DisassociateResolverEndpointIpAddressResponse] = js.native
    def disassociateResolverRule(params: DisassociateResolverRuleRequest): Request[DisassociateResolverRuleResponse] = js.native
    def getResolverEndpoint(params: GetResolverEndpointRequest): Request[GetResolverEndpointResponse] = js.native
    def getResolverRule(params: GetResolverRuleRequest): Request[GetResolverRuleResponse] = js.native
    def getResolverRuleAssociation(params: GetResolverRuleAssociationRequest): Request[GetResolverRuleAssociationResponse] = js.native
    def getResolverRulePolicy(params: GetResolverRulePolicyRequest): Request[GetResolverRulePolicyResponse] = js.native
    def listResolverEndpointIpAddresses(params: ListResolverEndpointIpAddressesRequest): Request[ListResolverEndpointIpAddressesResponse] = js.native
    def listResolverEndpoints(params: ListResolverEndpointsRequest): Request[ListResolverEndpointsResponse] = js.native
    def listResolverRuleAssociations(params: ListResolverRuleAssociationsRequest): Request[ListResolverRuleAssociationsResponse] = js.native
    def listResolverRules(params: ListResolverRulesRequest): Request[ListResolverRulesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putResolverRulePolicy(params: PutResolverRulePolicyRequest): Request[PutResolverRulePolicyResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateResolverEndpoint(params: UpdateResolverEndpointRequest): Request[UpdateResolverEndpointResponse] = js.native
    def updateResolverRule(params: UpdateResolverRuleRequest): Request[UpdateResolverRuleResponse] = js.native
  }

  @js.native
  trait AssociateResolverEndpointIpAddressRequest extends js.Object {
    var IpAddress: IpAddressUpdate
    var ResolverEndpointId: ResourceId
  }

  object AssociateResolverEndpointIpAddressRequest {
    @inline
    def apply(
        IpAddress: IpAddressUpdate,
        ResolverEndpointId: ResourceId
    ): AssociateResolverEndpointIpAddressRequest = {
      val __obj = js.Dynamic.literal(
        "IpAddress" -> IpAddress.asInstanceOf[js.Any],
        "ResolverEndpointId" -> ResolverEndpointId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateResolverEndpointIpAddressRequest]
    }
  }

  @js.native
  trait AssociateResolverEndpointIpAddressResponse extends js.Object {
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint]
  }

  object AssociateResolverEndpointIpAddressResponse {
    @inline
    def apply(
        ResolverEndpoint: js.UndefOr[ResolverEndpoint] = js.undefined
    ): AssociateResolverEndpointIpAddressResponse = {
      val __obj = js.Dynamic.literal()
      ResolverEndpoint.foreach(__v => __obj.updateDynamic("ResolverEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateResolverEndpointIpAddressResponse]
    }
  }

  @js.native
  trait AssociateResolverRuleRequest extends js.Object {
    var ResolverRuleId: ResourceId
    var VPCId: ResourceId
    var Name: js.UndefOr[Name]
  }

  object AssociateResolverRuleRequest {
    @inline
    def apply(
        ResolverRuleId: ResourceId,
        VPCId: ResourceId,
        Name: js.UndefOr[Name] = js.undefined
    ): AssociateResolverRuleRequest = {
      val __obj = js.Dynamic.literal(
        "ResolverRuleId" -> ResolverRuleId.asInstanceOf[js.Any],
        "VPCId" -> VPCId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateResolverRuleRequest]
    }
  }

  @js.native
  trait AssociateResolverRuleResponse extends js.Object {
    var ResolverRuleAssociation: js.UndefOr[ResolverRuleAssociation]
  }

  object AssociateResolverRuleResponse {
    @inline
    def apply(
        ResolverRuleAssociation: js.UndefOr[ResolverRuleAssociation] = js.undefined
    ): AssociateResolverRuleResponse = {
      val __obj = js.Dynamic.literal()
      ResolverRuleAssociation.foreach(__v => __obj.updateDynamic("ResolverRuleAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateResolverRuleResponse]
    }
  }

  @js.native
  trait CreateResolverEndpointRequest extends js.Object {
    var CreatorRequestId: CreatorRequestId
    var Direction: ResolverEndpointDirection
    var IpAddresses: IpAddressesRequest
    var SecurityGroupIds: SecurityGroupIds
    var Name: js.UndefOr[Name]
    var Tags: js.UndefOr[TagList]
  }

  object CreateResolverEndpointRequest {
    @inline
    def apply(
        CreatorRequestId: CreatorRequestId,
        Direction: ResolverEndpointDirection,
        IpAddresses: IpAddressesRequest,
        SecurityGroupIds: SecurityGroupIds,
        Name: js.UndefOr[Name] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateResolverEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "CreatorRequestId" -> CreatorRequestId.asInstanceOf[js.Any],
        "Direction" -> Direction.asInstanceOf[js.Any],
        "IpAddresses" -> IpAddresses.asInstanceOf[js.Any],
        "SecurityGroupIds" -> SecurityGroupIds.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResolverEndpointRequest]
    }
  }

  @js.native
  trait CreateResolverEndpointResponse extends js.Object {
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint]
  }

  object CreateResolverEndpointResponse {
    @inline
    def apply(
        ResolverEndpoint: js.UndefOr[ResolverEndpoint] = js.undefined
    ): CreateResolverEndpointResponse = {
      val __obj = js.Dynamic.literal()
      ResolverEndpoint.foreach(__v => __obj.updateDynamic("ResolverEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResolverEndpointResponse]
    }
  }

  @js.native
  trait CreateResolverRuleRequest extends js.Object {
    var CreatorRequestId: CreatorRequestId
    var DomainName: DomainName
    var RuleType: RuleTypeOption
    var Name: js.UndefOr[Name]
    var ResolverEndpointId: js.UndefOr[ResourceId]
    var Tags: js.UndefOr[TagList]
    var TargetIps: js.UndefOr[TargetList]
  }

  object CreateResolverRuleRequest {
    @inline
    def apply(
        CreatorRequestId: CreatorRequestId,
        DomainName: DomainName,
        RuleType: RuleTypeOption,
        Name: js.UndefOr[Name] = js.undefined,
        ResolverEndpointId: js.UndefOr[ResourceId] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TargetIps: js.UndefOr[TargetList] = js.undefined
    ): CreateResolverRuleRequest = {
      val __obj = js.Dynamic.literal(
        "CreatorRequestId" -> CreatorRequestId.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "RuleType" -> RuleType.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ResolverEndpointId.foreach(__v => __obj.updateDynamic("ResolverEndpointId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TargetIps.foreach(__v => __obj.updateDynamic("TargetIps")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResolverRuleRequest]
    }
  }

  @js.native
  trait CreateResolverRuleResponse extends js.Object {
    var ResolverRule: js.UndefOr[ResolverRule]
  }

  object CreateResolverRuleResponse {
    @inline
    def apply(
        ResolverRule: js.UndefOr[ResolverRule] = js.undefined
    ): CreateResolverRuleResponse = {
      val __obj = js.Dynamic.literal()
      ResolverRule.foreach(__v => __obj.updateDynamic("ResolverRule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResolverRuleResponse]
    }
  }

  @js.native
  trait DeleteResolverEndpointRequest extends js.Object {
    var ResolverEndpointId: ResourceId
  }

  object DeleteResolverEndpointRequest {
    @inline
    def apply(
        ResolverEndpointId: ResourceId
    ): DeleteResolverEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "ResolverEndpointId" -> ResolverEndpointId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteResolverEndpointRequest]
    }
  }

  @js.native
  trait DeleteResolverEndpointResponse extends js.Object {
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint]
  }

  object DeleteResolverEndpointResponse {
    @inline
    def apply(
        ResolverEndpoint: js.UndefOr[ResolverEndpoint] = js.undefined
    ): DeleteResolverEndpointResponse = {
      val __obj = js.Dynamic.literal()
      ResolverEndpoint.foreach(__v => __obj.updateDynamic("ResolverEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteResolverEndpointResponse]
    }
  }

  @js.native
  trait DeleteResolverRuleRequest extends js.Object {
    var ResolverRuleId: ResourceId
  }

  object DeleteResolverRuleRequest {
    @inline
    def apply(
        ResolverRuleId: ResourceId
    ): DeleteResolverRuleRequest = {
      val __obj = js.Dynamic.literal(
        "ResolverRuleId" -> ResolverRuleId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteResolverRuleRequest]
    }
  }

  @js.native
  trait DeleteResolverRuleResponse extends js.Object {
    var ResolverRule: js.UndefOr[ResolverRule]
  }

  object DeleteResolverRuleResponse {
    @inline
    def apply(
        ResolverRule: js.UndefOr[ResolverRule] = js.undefined
    ): DeleteResolverRuleResponse = {
      val __obj = js.Dynamic.literal()
      ResolverRule.foreach(__v => __obj.updateDynamic("ResolverRule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteResolverRuleResponse]
    }
  }

  @js.native
  trait DisassociateResolverEndpointIpAddressRequest extends js.Object {
    var IpAddress: IpAddressUpdate
    var ResolverEndpointId: ResourceId
  }

  object DisassociateResolverEndpointIpAddressRequest {
    @inline
    def apply(
        IpAddress: IpAddressUpdate,
        ResolverEndpointId: ResourceId
    ): DisassociateResolverEndpointIpAddressRequest = {
      val __obj = js.Dynamic.literal(
        "IpAddress" -> IpAddress.asInstanceOf[js.Any],
        "ResolverEndpointId" -> ResolverEndpointId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateResolverEndpointIpAddressRequest]
    }
  }

  @js.native
  trait DisassociateResolverEndpointIpAddressResponse extends js.Object {
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint]
  }

  object DisassociateResolverEndpointIpAddressResponse {
    @inline
    def apply(
        ResolverEndpoint: js.UndefOr[ResolverEndpoint] = js.undefined
    ): DisassociateResolverEndpointIpAddressResponse = {
      val __obj = js.Dynamic.literal()
      ResolverEndpoint.foreach(__v => __obj.updateDynamic("ResolverEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateResolverEndpointIpAddressResponse]
    }
  }

  @js.native
  trait DisassociateResolverRuleRequest extends js.Object {
    var ResolverRuleId: ResourceId
    var VPCId: ResourceId
  }

  object DisassociateResolverRuleRequest {
    @inline
    def apply(
        ResolverRuleId: ResourceId,
        VPCId: ResourceId
    ): DisassociateResolverRuleRequest = {
      val __obj = js.Dynamic.literal(
        "ResolverRuleId" -> ResolverRuleId.asInstanceOf[js.Any],
        "VPCId" -> VPCId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateResolverRuleRequest]
    }
  }

  @js.native
  trait DisassociateResolverRuleResponse extends js.Object {
    var ResolverRuleAssociation: js.UndefOr[ResolverRuleAssociation]
  }

  object DisassociateResolverRuleResponse {
    @inline
    def apply(
        ResolverRuleAssociation: js.UndefOr[ResolverRuleAssociation] = js.undefined
    ): DisassociateResolverRuleResponse = {
      val __obj = js.Dynamic.literal()
      ResolverRuleAssociation.foreach(__v => __obj.updateDynamic("ResolverRuleAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateResolverRuleResponse]
    }
  }

  /**
    * For <code>List</code> operations, an optional specification to return a subset of objects, such as resolver endpoints or resolver rules.
    */
  @js.native
  trait Filter extends js.Object {
    var Name: js.UndefOr[FilterName]
    var Values: js.UndefOr[FilterValues]
  }

  object Filter {
    @inline
    def apply(
        Name: js.UndefOr[FilterName] = js.undefined,
        Values: js.UndefOr[FilterValues] = js.undefined
    ): Filter = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filter]
    }
  }

  @js.native
  trait GetResolverEndpointRequest extends js.Object {
    var ResolverEndpointId: ResourceId
  }

  object GetResolverEndpointRequest {
    @inline
    def apply(
        ResolverEndpointId: ResourceId
    ): GetResolverEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "ResolverEndpointId" -> ResolverEndpointId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetResolverEndpointRequest]
    }
  }

  @js.native
  trait GetResolverEndpointResponse extends js.Object {
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint]
  }

  object GetResolverEndpointResponse {
    @inline
    def apply(
        ResolverEndpoint: js.UndefOr[ResolverEndpoint] = js.undefined
    ): GetResolverEndpointResponse = {
      val __obj = js.Dynamic.literal()
      ResolverEndpoint.foreach(__v => __obj.updateDynamic("ResolverEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResolverEndpointResponse]
    }
  }

  @js.native
  trait GetResolverRuleAssociationRequest extends js.Object {
    var ResolverRuleAssociationId: ResourceId
  }

  object GetResolverRuleAssociationRequest {
    @inline
    def apply(
        ResolverRuleAssociationId: ResourceId
    ): GetResolverRuleAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "ResolverRuleAssociationId" -> ResolverRuleAssociationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetResolverRuleAssociationRequest]
    }
  }

  @js.native
  trait GetResolverRuleAssociationResponse extends js.Object {
    var ResolverRuleAssociation: js.UndefOr[ResolverRuleAssociation]
  }

  object GetResolverRuleAssociationResponse {
    @inline
    def apply(
        ResolverRuleAssociation: js.UndefOr[ResolverRuleAssociation] = js.undefined
    ): GetResolverRuleAssociationResponse = {
      val __obj = js.Dynamic.literal()
      ResolverRuleAssociation.foreach(__v => __obj.updateDynamic("ResolverRuleAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResolverRuleAssociationResponse]
    }
  }

  @js.native
  trait GetResolverRulePolicyRequest extends js.Object {
    var Arn: Arn
  }

  object GetResolverRulePolicyRequest {
    @inline
    def apply(
        Arn: Arn
    ): GetResolverRulePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetResolverRulePolicyRequest]
    }
  }

  @js.native
  trait GetResolverRulePolicyResponse extends js.Object {
    var ResolverRulePolicy: js.UndefOr[ResolverRulePolicy]
  }

  object GetResolverRulePolicyResponse {
    @inline
    def apply(
        ResolverRulePolicy: js.UndefOr[ResolverRulePolicy] = js.undefined
    ): GetResolverRulePolicyResponse = {
      val __obj = js.Dynamic.literal()
      ResolverRulePolicy.foreach(__v => __obj.updateDynamic("ResolverRulePolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResolverRulePolicyResponse]
    }
  }

  @js.native
  trait GetResolverRuleRequest extends js.Object {
    var ResolverRuleId: ResourceId
  }

  object GetResolverRuleRequest {
    @inline
    def apply(
        ResolverRuleId: ResourceId
    ): GetResolverRuleRequest = {
      val __obj = js.Dynamic.literal(
        "ResolverRuleId" -> ResolverRuleId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetResolverRuleRequest]
    }
  }

  @js.native
  trait GetResolverRuleResponse extends js.Object {
    var ResolverRule: js.UndefOr[ResolverRule]
  }

  object GetResolverRuleResponse {
    @inline
    def apply(
        ResolverRule: js.UndefOr[ResolverRule] = js.undefined
    ): GetResolverRuleResponse = {
      val __obj = js.Dynamic.literal()
      ResolverRule.foreach(__v => __obj.updateDynamic("ResolverRule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResolverRuleResponse]
    }
  }

  /**
    * In an <a>CreateResolverEndpoint</a> request, a subnet and IP address that you want to use for DNS queries.
    */
  @js.native
  trait IpAddressRequest extends js.Object {
    var SubnetId: SubnetId
    var Ip: js.UndefOr[Ip]
  }

  object IpAddressRequest {
    @inline
    def apply(
        SubnetId: SubnetId,
        Ip: js.UndefOr[Ip] = js.undefined
    ): IpAddressRequest = {
      val __obj = js.Dynamic.literal(
        "SubnetId" -> SubnetId.asInstanceOf[js.Any]
      )

      Ip.foreach(__v => __obj.updateDynamic("Ip")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IpAddressRequest]
    }
  }

  /**
    * In the response to a <a>GetResolverEndpoint</a> request, information about the IP addresses that the resolver endpoint uses for DNS queries.
    */
  @js.native
  trait IpAddressResponse extends js.Object {
    var CreationTime: js.UndefOr[Rfc3339TimeString]
    var Ip: js.UndefOr[Ip]
    var IpId: js.UndefOr[ResourceId]
    var ModificationTime: js.UndefOr[Rfc3339TimeString]
    var Status: js.UndefOr[IpAddressStatus]
    var StatusMessage: js.UndefOr[StatusMessage]
    var SubnetId: js.UndefOr[SubnetId]
  }

  object IpAddressResponse {
    @inline
    def apply(
        CreationTime: js.UndefOr[Rfc3339TimeString] = js.undefined,
        Ip: js.UndefOr[Ip] = js.undefined,
        IpId: js.UndefOr[ResourceId] = js.undefined,
        ModificationTime: js.UndefOr[Rfc3339TimeString] = js.undefined,
        Status: js.UndefOr[IpAddressStatus] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        SubnetId: js.UndefOr[SubnetId] = js.undefined
    ): IpAddressResponse = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Ip.foreach(__v => __obj.updateDynamic("Ip")(__v.asInstanceOf[js.Any]))
      IpId.foreach(__v => __obj.updateDynamic("IpId")(__v.asInstanceOf[js.Any]))
      ModificationTime.foreach(__v => __obj.updateDynamic("ModificationTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IpAddressResponse]
    }
  }

  @js.native
  sealed trait IpAddressStatus extends js.Any
  object IpAddressStatus {
    val CREATING = "CREATING".asInstanceOf[IpAddressStatus]
    val FAILED_CREATION = "FAILED_CREATION".asInstanceOf[IpAddressStatus]
    val ATTACHING = "ATTACHING".asInstanceOf[IpAddressStatus]
    val ATTACHED = "ATTACHED".asInstanceOf[IpAddressStatus]
    val REMAP_DETACHING = "REMAP_DETACHING".asInstanceOf[IpAddressStatus]
    val REMAP_ATTACHING = "REMAP_ATTACHING".asInstanceOf[IpAddressStatus]
    val DETACHING = "DETACHING".asInstanceOf[IpAddressStatus]
    val FAILED_RESOURCE_GONE = "FAILED_RESOURCE_GONE".asInstanceOf[IpAddressStatus]
    val DELETING = "DELETING".asInstanceOf[IpAddressStatus]
    val DELETE_FAILED_FAS_EXPIRED = "DELETE_FAILED_FAS_EXPIRED".asInstanceOf[IpAddressStatus]

    @inline def values = js.Array(CREATING, FAILED_CREATION, ATTACHING, ATTACHED, REMAP_DETACHING, REMAP_ATTACHING, DETACHING, FAILED_RESOURCE_GONE, DELETING, DELETE_FAILED_FAS_EXPIRED)
  }

  /**
    * In an <a>UpdateResolverEndpoint</a> request, information about an IP address to update.
    */
  @js.native
  trait IpAddressUpdate extends js.Object {
    var Ip: js.UndefOr[Ip]
    var IpId: js.UndefOr[ResourceId]
    var SubnetId: js.UndefOr[SubnetId]
  }

  object IpAddressUpdate {
    @inline
    def apply(
        Ip: js.UndefOr[Ip] = js.undefined,
        IpId: js.UndefOr[ResourceId] = js.undefined,
        SubnetId: js.UndefOr[SubnetId] = js.undefined
    ): IpAddressUpdate = {
      val __obj = js.Dynamic.literal()
      Ip.foreach(__v => __obj.updateDynamic("Ip")(__v.asInstanceOf[js.Any]))
      IpId.foreach(__v => __obj.updateDynamic("IpId")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IpAddressUpdate]
    }
  }

  @js.native
  trait ListResolverEndpointIpAddressesRequest extends js.Object {
    var ResolverEndpointId: ResourceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListResolverEndpointIpAddressesRequest {
    @inline
    def apply(
        ResolverEndpointId: ResourceId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListResolverEndpointIpAddressesRequest = {
      val __obj = js.Dynamic.literal(
        "ResolverEndpointId" -> ResolverEndpointId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResolverEndpointIpAddressesRequest]
    }
  }

  @js.native
  trait ListResolverEndpointIpAddressesResponse extends js.Object {
    var IpAddresses: js.UndefOr[IpAddressesResponse]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListResolverEndpointIpAddressesResponse {
    @inline
    def apply(
        IpAddresses: js.UndefOr[IpAddressesResponse] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListResolverEndpointIpAddressesResponse = {
      val __obj = js.Dynamic.literal()
      IpAddresses.foreach(__v => __obj.updateDynamic("IpAddresses")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResolverEndpointIpAddressesResponse]
    }
  }

  @js.native
  trait ListResolverEndpointsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListResolverEndpointsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListResolverEndpointsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResolverEndpointsRequest]
    }
  }

  @js.native
  trait ListResolverEndpointsResponse extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ResolverEndpoints: js.UndefOr[ResolverEndpoints]
  }

  object ListResolverEndpointsResponse {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResolverEndpoints: js.UndefOr[ResolverEndpoints] = js.undefined
    ): ListResolverEndpointsResponse = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResolverEndpoints.foreach(__v => __obj.updateDynamic("ResolverEndpoints")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResolverEndpointsResponse]
    }
  }

  @js.native
  trait ListResolverRuleAssociationsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListResolverRuleAssociationsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListResolverRuleAssociationsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResolverRuleAssociationsRequest]
    }
  }

  @js.native
  trait ListResolverRuleAssociationsResponse extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ResolverRuleAssociations: js.UndefOr[ResolverRuleAssociations]
  }

  object ListResolverRuleAssociationsResponse {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResolverRuleAssociations: js.UndefOr[ResolverRuleAssociations] = js.undefined
    ): ListResolverRuleAssociationsResponse = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResolverRuleAssociations.foreach(__v => __obj.updateDynamic("ResolverRuleAssociations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResolverRuleAssociationsResponse]
    }
  }

  @js.native
  trait ListResolverRulesRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListResolverRulesRequest {
    @inline
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListResolverRulesRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResolverRulesRequest]
    }
  }

  @js.native
  trait ListResolverRulesResponse extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ResolverRules: js.UndefOr[ResolverRules]
  }

  object ListResolverRulesResponse {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResolverRules: js.UndefOr[ResolverRules] = js.undefined
    ): ListResolverRulesResponse = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResolverRules.foreach(__v => __obj.updateDynamic("ResolverRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResolverRulesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: Arn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait PutResolverRulePolicyRequest extends js.Object {
    var Arn: Arn
    var ResolverRulePolicy: ResolverRulePolicy
  }

  object PutResolverRulePolicyRequest {
    @inline
    def apply(
        Arn: Arn,
        ResolverRulePolicy: ResolverRulePolicy
    ): PutResolverRulePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "ResolverRulePolicy" -> ResolverRulePolicy.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutResolverRulePolicyRequest]
    }
  }

  /**
    * The response to a <code>PutResolverRulePolicy</code> request.
    */
  @js.native
  trait PutResolverRulePolicyResponse extends js.Object {
    var ReturnValue: js.UndefOr[Boolean]
  }

  object PutResolverRulePolicyResponse {
    @inline
    def apply(
        ReturnValue: js.UndefOr[Boolean] = js.undefined
    ): PutResolverRulePolicyResponse = {
      val __obj = js.Dynamic.literal()
      ReturnValue.foreach(__v => __obj.updateDynamic("ReturnValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutResolverRulePolicyResponse]
    }
  }

  /**
    * In the response to a <a>CreateResolverEndpoint</a>, <a>DeleteResolverEndpoint</a>, <a>GetResolverEndpoint</a>, <a>ListResolverEndpoints</a>, or <a>UpdateResolverEndpoint</a> request, a complex type that contains settings for an existing inbound or outbound resolver endpoint.
    */
  @js.native
  trait ResolverEndpoint extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationTime: js.UndefOr[Rfc3339TimeString]
    var CreatorRequestId: js.UndefOr[CreatorRequestId]
    var Direction: js.UndefOr[ResolverEndpointDirection]
    var HostVPCId: js.UndefOr[ResourceId]
    var Id: js.UndefOr[ResourceId]
    var IpAddressCount: js.UndefOr[IpAddressCount]
    var ModificationTime: js.UndefOr[Rfc3339TimeString]
    var Name: js.UndefOr[Name]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var Status: js.UndefOr[ResolverEndpointStatus]
    var StatusMessage: js.UndefOr[StatusMessage]
  }

  object ResolverEndpoint {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreationTime: js.UndefOr[Rfc3339TimeString] = js.undefined,
        CreatorRequestId: js.UndefOr[CreatorRequestId] = js.undefined,
        Direction: js.UndefOr[ResolverEndpointDirection] = js.undefined,
        HostVPCId: js.UndefOr[ResourceId] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined,
        IpAddressCount: js.UndefOr[IpAddressCount] = js.undefined,
        ModificationTime: js.UndefOr[Rfc3339TimeString] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
        Status: js.UndefOr[ResolverEndpointStatus] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined
    ): ResolverEndpoint = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.updateDynamic("CreatorRequestId")(__v.asInstanceOf[js.Any]))
      Direction.foreach(__v => __obj.updateDynamic("Direction")(__v.asInstanceOf[js.Any]))
      HostVPCId.foreach(__v => __obj.updateDynamic("HostVPCId")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IpAddressCount.foreach(__v => __obj.updateDynamic("IpAddressCount")(__v.asInstanceOf[js.Any]))
      ModificationTime.foreach(__v => __obj.updateDynamic("ModificationTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResolverEndpoint]
    }
  }

  @js.native
  sealed trait ResolverEndpointDirection extends js.Any
  object ResolverEndpointDirection {
    val INBOUND = "INBOUND".asInstanceOf[ResolverEndpointDirection]
    val OUTBOUND = "OUTBOUND".asInstanceOf[ResolverEndpointDirection]

    @inline def values = js.Array(INBOUND, OUTBOUND)
  }

  @js.native
  sealed trait ResolverEndpointStatus extends js.Any
  object ResolverEndpointStatus {
    val CREATING = "CREATING".asInstanceOf[ResolverEndpointStatus]
    val OPERATIONAL = "OPERATIONAL".asInstanceOf[ResolverEndpointStatus]
    val UPDATING = "UPDATING".asInstanceOf[ResolverEndpointStatus]
    val AUTO_RECOVERING = "AUTO_RECOVERING".asInstanceOf[ResolverEndpointStatus]
    val ACTION_NEEDED = "ACTION_NEEDED".asInstanceOf[ResolverEndpointStatus]
    val DELETING = "DELETING".asInstanceOf[ResolverEndpointStatus]

    @inline def values = js.Array(CREATING, OPERATIONAL, UPDATING, AUTO_RECOVERING, ACTION_NEEDED, DELETING)
  }

  /**
    * For queries that originate in your VPC, detailed information about a resolver rule, which specifies how to route DNS queries out of the VPC. The <code>ResolverRule</code> parameter appears in the response to a <a>CreateResolverRule</a>, <a>DeleteResolverRule</a>, <a>GetResolverRule</a>, <a>ListResolverRules</a>, or <a>UpdateResolverRule</a> request.
    */
  @js.native
  trait ResolverRule extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatorRequestId: js.UndefOr[CreatorRequestId]
    var DomainName: js.UndefOr[DomainName]
    var Id: js.UndefOr[ResourceId]
    var Name: js.UndefOr[Name]
    var OwnerId: js.UndefOr[AccountId]
    var ResolverEndpointId: js.UndefOr[ResourceId]
    var RuleType: js.UndefOr[RuleTypeOption]
    var ShareStatus: js.UndefOr[ShareStatus]
    var Status: js.UndefOr[ResolverRuleStatus]
    var StatusMessage: js.UndefOr[StatusMessage]
    var TargetIps: js.UndefOr[TargetList]
  }

  object ResolverRule {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatorRequestId: js.UndefOr[CreatorRequestId] = js.undefined,
        DomainName: js.UndefOr[DomainName] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        OwnerId: js.UndefOr[AccountId] = js.undefined,
        ResolverEndpointId: js.UndefOr[ResourceId] = js.undefined,
        RuleType: js.UndefOr[RuleTypeOption] = js.undefined,
        ShareStatus: js.UndefOr[ShareStatus] = js.undefined,
        Status: js.UndefOr[ResolverRuleStatus] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        TargetIps: js.UndefOr[TargetList] = js.undefined
    ): ResolverRule = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.updateDynamic("CreatorRequestId")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      ResolverEndpointId.foreach(__v => __obj.updateDynamic("ResolverEndpointId")(__v.asInstanceOf[js.Any]))
      RuleType.foreach(__v => __obj.updateDynamic("RuleType")(__v.asInstanceOf[js.Any]))
      ShareStatus.foreach(__v => __obj.updateDynamic("ShareStatus")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      TargetIps.foreach(__v => __obj.updateDynamic("TargetIps")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResolverRule]
    }
  }

  /**
    * In the response to an <a>AssociateResolverRule</a>, <a>DisassociateResolverRule</a>, or <a>ListResolverRuleAssociations</a> request, information about an association between a resolver rule and a VPC.
    */
  @js.native
  trait ResolverRuleAssociation extends js.Object {
    var Id: js.UndefOr[ResourceId]
    var Name: js.UndefOr[Name]
    var ResolverRuleId: js.UndefOr[ResourceId]
    var Status: js.UndefOr[ResolverRuleAssociationStatus]
    var StatusMessage: js.UndefOr[StatusMessage]
    var VPCId: js.UndefOr[ResourceId]
  }

  object ResolverRuleAssociation {
    @inline
    def apply(
        Id: js.UndefOr[ResourceId] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        ResolverRuleId: js.UndefOr[ResourceId] = js.undefined,
        Status: js.UndefOr[ResolverRuleAssociationStatus] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        VPCId: js.UndefOr[ResourceId] = js.undefined
    ): ResolverRuleAssociation = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ResolverRuleId.foreach(__v => __obj.updateDynamic("ResolverRuleId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      VPCId.foreach(__v => __obj.updateDynamic("VPCId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResolverRuleAssociation]
    }
  }

  @js.native
  sealed trait ResolverRuleAssociationStatus extends js.Any
  object ResolverRuleAssociationStatus {
    val CREATING = "CREATING".asInstanceOf[ResolverRuleAssociationStatus]
    val COMPLETE = "COMPLETE".asInstanceOf[ResolverRuleAssociationStatus]
    val DELETING = "DELETING".asInstanceOf[ResolverRuleAssociationStatus]
    val FAILED = "FAILED".asInstanceOf[ResolverRuleAssociationStatus]
    val OVERRIDDEN = "OVERRIDDEN".asInstanceOf[ResolverRuleAssociationStatus]

    @inline def values = js.Array(CREATING, COMPLETE, DELETING, FAILED, OVERRIDDEN)
  }

  /**
    * In an <a>UpdateResolverRule</a> request, information about the changes that you want to make.
    */
  @js.native
  trait ResolverRuleConfig extends js.Object {
    var Name: js.UndefOr[Name]
    var ResolverEndpointId: js.UndefOr[ResourceId]
    var TargetIps: js.UndefOr[TargetList]
  }

  object ResolverRuleConfig {
    @inline
    def apply(
        Name: js.UndefOr[Name] = js.undefined,
        ResolverEndpointId: js.UndefOr[ResourceId] = js.undefined,
        TargetIps: js.UndefOr[TargetList] = js.undefined
    ): ResolverRuleConfig = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ResolverEndpointId.foreach(__v => __obj.updateDynamic("ResolverEndpointId")(__v.asInstanceOf[js.Any]))
      TargetIps.foreach(__v => __obj.updateDynamic("TargetIps")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResolverRuleConfig]
    }
  }

  @js.native
  sealed trait ResolverRuleStatus extends js.Any
  object ResolverRuleStatus {
    val COMPLETE = "COMPLETE".asInstanceOf[ResolverRuleStatus]
    val DELETING = "DELETING".asInstanceOf[ResolverRuleStatus]
    val UPDATING = "UPDATING".asInstanceOf[ResolverRuleStatus]
    val FAILED = "FAILED".asInstanceOf[ResolverRuleStatus]

    @inline def values = js.Array(COMPLETE, DELETING, UPDATING, FAILED)
  }

  @js.native
  sealed trait RuleTypeOption extends js.Any
  object RuleTypeOption {
    val FORWARD = "FORWARD".asInstanceOf[RuleTypeOption]
    val SYSTEM = "SYSTEM".asInstanceOf[RuleTypeOption]
    val RECURSIVE = "RECURSIVE".asInstanceOf[RuleTypeOption]

    @inline def values = js.Array(FORWARD, SYSTEM, RECURSIVE)
  }

  @js.native
  sealed trait ShareStatus extends js.Any
  object ShareStatus {
    val NOT_SHARED = "NOT_SHARED".asInstanceOf[ShareStatus]
    val SHARED_WITH_ME = "SHARED_WITH_ME".asInstanceOf[ShareStatus]
    val SHARED_BY_ME = "SHARED_BY_ME".asInstanceOf[ShareStatus]

    @inline def values = js.Array(NOT_SHARED, SHARED_WITH_ME, SHARED_BY_ME)
  }

  /**
    * One tag that you want to add to the specified resource. A tag consists of a <code>Key</code> (a name for the tag) and a <code>Value</code>.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
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

  /**
    * In a <a>CreateResolverRule</a> request, an array of the IPs that you want to forward DNS queries to.
    */
  @js.native
  trait TargetAddress extends js.Object {
    var Ip: Ip
    var Port: js.UndefOr[Port]
  }

  object TargetAddress {
    @inline
    def apply(
        Ip: Ip,
        Port: js.UndefOr[Port] = js.undefined
    ): TargetAddress = {
      val __obj = js.Dynamic.literal(
        "Ip" -> Ip.asInstanceOf[js.Any]
      )

      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetAddress]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
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
  trait UpdateResolverEndpointRequest extends js.Object {
    var ResolverEndpointId: ResourceId
    var Name: js.UndefOr[Name]
  }

  object UpdateResolverEndpointRequest {
    @inline
    def apply(
        ResolverEndpointId: ResourceId,
        Name: js.UndefOr[Name] = js.undefined
    ): UpdateResolverEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "ResolverEndpointId" -> ResolverEndpointId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResolverEndpointRequest]
    }
  }

  @js.native
  trait UpdateResolverEndpointResponse extends js.Object {
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint]
  }

  object UpdateResolverEndpointResponse {
    @inline
    def apply(
        ResolverEndpoint: js.UndefOr[ResolverEndpoint] = js.undefined
    ): UpdateResolverEndpointResponse = {
      val __obj = js.Dynamic.literal()
      ResolverEndpoint.foreach(__v => __obj.updateDynamic("ResolverEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResolverEndpointResponse]
    }
  }

  @js.native
  trait UpdateResolverRuleRequest extends js.Object {
    var Config: ResolverRuleConfig
    var ResolverRuleId: ResourceId
  }

  object UpdateResolverRuleRequest {
    @inline
    def apply(
        Config: ResolverRuleConfig,
        ResolverRuleId: ResourceId
    ): UpdateResolverRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Config" -> Config.asInstanceOf[js.Any],
        "ResolverRuleId" -> ResolverRuleId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateResolverRuleRequest]
    }
  }

  @js.native
  trait UpdateResolverRuleResponse extends js.Object {
    var ResolverRule: js.UndefOr[ResolverRule]
  }

  object UpdateResolverRuleResponse {
    @inline
    def apply(
        ResolverRule: js.UndefOr[ResolverRule] = js.undefined
    ): UpdateResolverRuleResponse = {
      val __obj = js.Dynamic.literal()
      ResolverRule.foreach(__v => __obj.updateDynamic("ResolverRule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResolverRuleResponse]
    }
  }
}
