package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
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
  type IpAddressStatus = String
  type IpAddressesRequest = js.Array[IpAddressRequest]
  type IpAddressesResponse = js.Array[IpAddressResponse]
  type MaxResults = Int
  type Name = String
  type NextToken = String
  type Port = Int
  type ResolverEndpointDirection = String
  type ResolverEndpointStatus = String
  type ResolverEndpoints = js.Array[ResolverEndpoint]
  type ResolverRuleAssociationStatus = String
  type ResolverRuleAssociations = js.Array[ResolverRuleAssociation]
  type ResolverRulePolicy = String
  type ResolverRuleStatus = String
  type ResolverRules = js.Array[ResolverRule]
  type ResourceId = String
  type Rfc3339TimeString = String
  type RuleTypeOption = String
  type SecurityGroupIds = js.Array[ResourceId]
  type ShareStatus = String
  type StatusMessage = String
  type SubnetId = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TargetList = js.Array[TargetAddress]
}

package route53resolver {
  @js.native
  @JSImport("aws-sdk", "Route53Resolver")
  class Route53Resolver(config: AWSConfig) extends js.Object {
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
    var ResolverEndpointId: js.UndefOr[ResourceId]
    var IpAddress: js.UndefOr[IpAddressUpdate]
  }

  object AssociateResolverEndpointIpAddressRequest {
    def apply(
      ResolverEndpointId: js.UndefOr[ResourceId] = js.undefined,
      IpAddress: js.UndefOr[IpAddressUpdate] = js.undefined): AssociateResolverEndpointIpAddressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverEndpointId" -> ResolverEndpointId.map { x => x.asInstanceOf[js.Any] },
        "IpAddress" -> IpAddress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateResolverEndpointIpAddressRequest]
    }
  }

  @js.native
  trait AssociateResolverEndpointIpAddressResponse extends js.Object {
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint]
  }

  object AssociateResolverEndpointIpAddressResponse {
    def apply(
      ResolverEndpoint: js.UndefOr[ResolverEndpoint] = js.undefined): AssociateResolverEndpointIpAddressResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverEndpoint" -> ResolverEndpoint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateResolverEndpointIpAddressResponse]
    }
  }

  @js.native
  trait AssociateResolverRuleRequest extends js.Object {
    var ResolverRuleId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[Name]
    var VPCId: js.UndefOr[ResourceId]
  }

  object AssociateResolverRuleRequest {
    def apply(
      ResolverRuleId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[Name] = js.undefined,
      VPCId: js.UndefOr[ResourceId] = js.undefined): AssociateResolverRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverRuleId" -> ResolverRuleId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "VPCId" -> VPCId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateResolverRuleRequest]
    }
  }

  @js.native
  trait AssociateResolverRuleResponse extends js.Object {
    var ResolverRuleAssociation: js.UndefOr[ResolverRuleAssociation]
  }

  object AssociateResolverRuleResponse {
    def apply(
      ResolverRuleAssociation: js.UndefOr[ResolverRuleAssociation] = js.undefined): AssociateResolverRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverRuleAssociation" -> ResolverRuleAssociation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateResolverRuleResponse]
    }
  }

  @js.native
  trait CreateResolverEndpointRequest extends js.Object {
    var Name: js.UndefOr[Name]
    var IpAddresses: js.UndefOr[IpAddressesRequest]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var Tags: js.UndefOr[TagList]
    var CreatorRequestId: js.UndefOr[CreatorRequestId]
    var Direction: js.UndefOr[ResolverEndpointDirection]
  }

  object CreateResolverEndpointRequest {
    def apply(
      Name: js.UndefOr[Name] = js.undefined,
      IpAddresses: js.UndefOr[IpAddressesRequest] = js.undefined,
      SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      CreatorRequestId: js.UndefOr[CreatorRequestId] = js.undefined,
      Direction: js.UndefOr[ResolverEndpointDirection] = js.undefined): CreateResolverEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "IpAddresses" -> IpAddresses.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "CreatorRequestId" -> CreatorRequestId.map { x => x.asInstanceOf[js.Any] },
        "Direction" -> Direction.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResolverEndpointRequest]
    }
  }

  @js.native
  trait CreateResolverEndpointResponse extends js.Object {
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint]
  }

  object CreateResolverEndpointResponse {
    def apply(
      ResolverEndpoint: js.UndefOr[ResolverEndpoint] = js.undefined): CreateResolverEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverEndpoint" -> ResolverEndpoint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResolverEndpointResponse]
    }
  }

  @js.native
  trait CreateResolverRuleRequest extends js.Object {
    var TargetIps: js.UndefOr[TargetList]
    var ResolverEndpointId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[Name]
    var DomainName: js.UndefOr[DomainName]
    var Tags: js.UndefOr[TagList]
    var CreatorRequestId: js.UndefOr[CreatorRequestId]
    var RuleType: js.UndefOr[RuleTypeOption]
  }

  object CreateResolverRuleRequest {
    def apply(
      TargetIps: js.UndefOr[TargetList] = js.undefined,
      ResolverEndpointId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[Name] = js.undefined,
      DomainName: js.UndefOr[DomainName] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      CreatorRequestId: js.UndefOr[CreatorRequestId] = js.undefined,
      RuleType: js.UndefOr[RuleTypeOption] = js.undefined): CreateResolverRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetIps" -> TargetIps.map { x => x.asInstanceOf[js.Any] },
        "ResolverEndpointId" -> ResolverEndpointId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "CreatorRequestId" -> CreatorRequestId.map { x => x.asInstanceOf[js.Any] },
        "RuleType" -> RuleType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResolverRuleRequest]
    }
  }

  @js.native
  trait CreateResolverRuleResponse extends js.Object {
    var ResolverRule: js.UndefOr[ResolverRule]
  }

  object CreateResolverRuleResponse {
    def apply(
      ResolverRule: js.UndefOr[ResolverRule] = js.undefined): CreateResolverRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverRule" -> ResolverRule.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResolverRuleResponse]
    }
  }

  @js.native
  trait DeleteResolverEndpointRequest extends js.Object {
    var ResolverEndpointId: js.UndefOr[ResourceId]
  }

  object DeleteResolverEndpointRequest {
    def apply(
      ResolverEndpointId: js.UndefOr[ResourceId] = js.undefined): DeleteResolverEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverEndpointId" -> ResolverEndpointId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResolverEndpointRequest]
    }
  }

  @js.native
  trait DeleteResolverEndpointResponse extends js.Object {
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint]
  }

  object DeleteResolverEndpointResponse {
    def apply(
      ResolverEndpoint: js.UndefOr[ResolverEndpoint] = js.undefined): DeleteResolverEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverEndpoint" -> ResolverEndpoint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResolverEndpointResponse]
    }
  }

  @js.native
  trait DeleteResolverRuleRequest extends js.Object {
    var ResolverRuleId: js.UndefOr[ResourceId]
  }

  object DeleteResolverRuleRequest {
    def apply(
      ResolverRuleId: js.UndefOr[ResourceId] = js.undefined): DeleteResolverRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverRuleId" -> ResolverRuleId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResolverRuleRequest]
    }
  }

  @js.native
  trait DeleteResolverRuleResponse extends js.Object {
    var ResolverRule: js.UndefOr[ResolverRule]
  }

  object DeleteResolverRuleResponse {
    def apply(
      ResolverRule: js.UndefOr[ResolverRule] = js.undefined): DeleteResolverRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverRule" -> ResolverRule.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResolverRuleResponse]
    }
  }

  @js.native
  trait DisassociateResolverEndpointIpAddressRequest extends js.Object {
    var ResolverEndpointId: js.UndefOr[ResourceId]
    var IpAddress: js.UndefOr[IpAddressUpdate]
  }

  object DisassociateResolverEndpointIpAddressRequest {
    def apply(
      ResolverEndpointId: js.UndefOr[ResourceId] = js.undefined,
      IpAddress: js.UndefOr[IpAddressUpdate] = js.undefined): DisassociateResolverEndpointIpAddressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverEndpointId" -> ResolverEndpointId.map { x => x.asInstanceOf[js.Any] },
        "IpAddress" -> IpAddress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateResolverEndpointIpAddressRequest]
    }
  }

  @js.native
  trait DisassociateResolverEndpointIpAddressResponse extends js.Object {
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint]
  }

  object DisassociateResolverEndpointIpAddressResponse {
    def apply(
      ResolverEndpoint: js.UndefOr[ResolverEndpoint] = js.undefined): DisassociateResolverEndpointIpAddressResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverEndpoint" -> ResolverEndpoint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateResolverEndpointIpAddressResponse]
    }
  }

  @js.native
  trait DisassociateResolverRuleRequest extends js.Object {
    var VPCId: js.UndefOr[ResourceId]
    var ResolverRuleId: js.UndefOr[ResourceId]
  }

  object DisassociateResolverRuleRequest {
    def apply(
      VPCId: js.UndefOr[ResourceId] = js.undefined,
      ResolverRuleId: js.UndefOr[ResourceId] = js.undefined): DisassociateResolverRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VPCId" -> VPCId.map { x => x.asInstanceOf[js.Any] },
        "ResolverRuleId" -> ResolverRuleId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateResolverRuleRequest]
    }
  }

  @js.native
  trait DisassociateResolverRuleResponse extends js.Object {
    var ResolverRuleAssociation: js.UndefOr[ResolverRuleAssociation]
  }

  object DisassociateResolverRuleResponse {
    def apply(
      ResolverRuleAssociation: js.UndefOr[ResolverRuleAssociation] = js.undefined): DisassociateResolverRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverRuleAssociation" -> ResolverRuleAssociation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateResolverRuleResponse]
    }
  }

  /**
   * <p>For <code>List</code> operations, an optional specification to return a subset of objects, such as resolver endpoints or resolver rules.</p>
   */
  @js.native
  trait Filter extends js.Object {
    var Name: js.UndefOr[FilterName]
    var Values: js.UndefOr[FilterValues]
  }

  object Filter {
    def apply(
      Name: js.UndefOr[FilterName] = js.undefined,
      Values: js.UndefOr[FilterValues] = js.undefined): Filter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Filter]
    }
  }

  @js.native
  trait GetResolverEndpointRequest extends js.Object {
    var ResolverEndpointId: js.UndefOr[ResourceId]
  }

  object GetResolverEndpointRequest {
    def apply(
      ResolverEndpointId: js.UndefOr[ResourceId] = js.undefined): GetResolverEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverEndpointId" -> ResolverEndpointId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResolverEndpointRequest]
    }
  }

  @js.native
  trait GetResolverEndpointResponse extends js.Object {
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint]
  }

  object GetResolverEndpointResponse {
    def apply(
      ResolverEndpoint: js.UndefOr[ResolverEndpoint] = js.undefined): GetResolverEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverEndpoint" -> ResolverEndpoint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResolverEndpointResponse]
    }
  }

  @js.native
  trait GetResolverRuleAssociationRequest extends js.Object {
    var ResolverRuleAssociationId: js.UndefOr[ResourceId]
  }

  object GetResolverRuleAssociationRequest {
    def apply(
      ResolverRuleAssociationId: js.UndefOr[ResourceId] = js.undefined): GetResolverRuleAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverRuleAssociationId" -> ResolverRuleAssociationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResolverRuleAssociationRequest]
    }
  }

  @js.native
  trait GetResolverRuleAssociationResponse extends js.Object {
    var ResolverRuleAssociation: js.UndefOr[ResolverRuleAssociation]
  }

  object GetResolverRuleAssociationResponse {
    def apply(
      ResolverRuleAssociation: js.UndefOr[ResolverRuleAssociation] = js.undefined): GetResolverRuleAssociationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverRuleAssociation" -> ResolverRuleAssociation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResolverRuleAssociationResponse]
    }
  }

  @js.native
  trait GetResolverRulePolicyRequest extends js.Object {
    var Arn: js.UndefOr[Arn]
  }

  object GetResolverRulePolicyRequest {
    def apply(
      Arn: js.UndefOr[Arn] = js.undefined): GetResolverRulePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResolverRulePolicyRequest]
    }
  }

  @js.native
  trait GetResolverRulePolicyResponse extends js.Object {
    var ResolverRulePolicy: js.UndefOr[ResolverRulePolicy]
  }

  object GetResolverRulePolicyResponse {
    def apply(
      ResolverRulePolicy: js.UndefOr[ResolverRulePolicy] = js.undefined): GetResolverRulePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverRulePolicy" -> ResolverRulePolicy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResolverRulePolicyResponse]
    }
  }

  @js.native
  trait GetResolverRuleRequest extends js.Object {
    var ResolverRuleId: js.UndefOr[ResourceId]
  }

  object GetResolverRuleRequest {
    def apply(
      ResolverRuleId: js.UndefOr[ResourceId] = js.undefined): GetResolverRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverRuleId" -> ResolverRuleId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResolverRuleRequest]
    }
  }

  @js.native
  trait GetResolverRuleResponse extends js.Object {
    var ResolverRule: js.UndefOr[ResolverRule]
  }

  object GetResolverRuleResponse {
    def apply(
      ResolverRule: js.UndefOr[ResolverRule] = js.undefined): GetResolverRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverRule" -> ResolverRule.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResolverRuleResponse]
    }
  }

  /**
   * <p>In an <a>CreateResolverEndpoint</a> request, a subnet and IP address that you want to use for DNS queries.</p>
   */
  @js.native
  trait IpAddressRequest extends js.Object {
    var SubnetId: js.UndefOr[SubnetId]
    var Ip: js.UndefOr[Ip]
  }

  object IpAddressRequest {
    def apply(
      SubnetId: js.UndefOr[SubnetId] = js.undefined,
      Ip: js.UndefOr[Ip] = js.undefined): IpAddressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] },
        "Ip" -> Ip.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IpAddressRequest]
    }
  }

  /**
   * <p>In the response to a <a>GetResolverEndpoint</a> request, information about the IP addresses that the resolver endpoint uses for DNS queries.</p>
   */
  @js.native
  trait IpAddressResponse extends js.Object {
    var StatusMessage: js.UndefOr[StatusMessage]
    var ModificationTime: js.UndefOr[Rfc3339TimeString]
    var IpId: js.UndefOr[ResourceId]
    var Ip: js.UndefOr[Ip]
    var Status: js.UndefOr[IpAddressStatus]
    var CreationTime: js.UndefOr[Rfc3339TimeString]
    var SubnetId: js.UndefOr[SubnetId]
  }

  object IpAddressResponse {
    def apply(
      StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
      ModificationTime: js.UndefOr[Rfc3339TimeString] = js.undefined,
      IpId: js.UndefOr[ResourceId] = js.undefined,
      Ip: js.UndefOr[Ip] = js.undefined,
      Status: js.UndefOr[IpAddressStatus] = js.undefined,
      CreationTime: js.UndefOr[Rfc3339TimeString] = js.undefined,
      SubnetId: js.UndefOr[SubnetId] = js.undefined): IpAddressResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] },
        "ModificationTime" -> ModificationTime.map { x => x.asInstanceOf[js.Any] },
        "IpId" -> IpId.map { x => x.asInstanceOf[js.Any] },
        "Ip" -> Ip.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IpAddressResponse]
    }
  }

  object IpAddressStatusEnum {
    val CREATING = "CREATING"
    val FAILED_CREATION = "FAILED_CREATION"
    val ATTACHING = "ATTACHING"
    val ATTACHED = "ATTACHED"
    val REMAP_DETACHING = "REMAP_DETACHING"
    val REMAP_ATTACHING = "REMAP_ATTACHING"
    val DETACHING = "DETACHING"
    val FAILED_RESOURCE_GONE = "FAILED_RESOURCE_GONE"
    val DELETING = "DELETING"
    val DELETE_FAILED_FAS_EXPIRED = "DELETE_FAILED_FAS_EXPIRED"

    val values = IndexedSeq(CREATING, FAILED_CREATION, ATTACHING, ATTACHED, REMAP_DETACHING, REMAP_ATTACHING, DETACHING, FAILED_RESOURCE_GONE, DELETING, DELETE_FAILED_FAS_EXPIRED)
  }

  /**
   * <p>In an <a>UpdateResolverEndpoint</a> request, information about an IP address to update.</p>
   */
  @js.native
  trait IpAddressUpdate extends js.Object {
    var IpId: js.UndefOr[ResourceId]
    var SubnetId: js.UndefOr[SubnetId]
    var Ip: js.UndefOr[Ip]
  }

  object IpAddressUpdate {
    def apply(
      IpId: js.UndefOr[ResourceId] = js.undefined,
      SubnetId: js.UndefOr[SubnetId] = js.undefined,
      Ip: js.UndefOr[Ip] = js.undefined): IpAddressUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IpId" -> IpId.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] },
        "Ip" -> Ip.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IpAddressUpdate]
    }
  }

  @js.native
  trait ListResolverEndpointIpAddressesRequest extends js.Object {
    var ResolverEndpointId: js.UndefOr[ResourceId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListResolverEndpointIpAddressesRequest {
    def apply(
      ResolverEndpointId: js.UndefOr[ResourceId] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListResolverEndpointIpAddressesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverEndpointId" -> ResolverEndpointId.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResolverEndpointIpAddressesRequest]
    }
  }

  @js.native
  trait ListResolverEndpointIpAddressesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
    var IpAddresses: js.UndefOr[IpAddressesResponse]
  }

  object ListResolverEndpointIpAddressesResponse {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      IpAddresses: js.UndefOr[IpAddressesResponse] = js.undefined): ListResolverEndpointIpAddressesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "IpAddresses" -> IpAddresses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResolverEndpointIpAddressesResponse]
    }
  }

  @js.native
  trait ListResolverEndpointsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Filters: js.UndefOr[Filters]
  }

  object ListResolverEndpointsRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Filters: js.UndefOr[Filters] = js.undefined): ListResolverEndpointsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResolverEndpointsRequest]
    }
  }

  @js.native
  trait ListResolverEndpointsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
    var ResolverEndpoints: js.UndefOr[ResolverEndpoints]
  }

  object ListResolverEndpointsResponse {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      ResolverEndpoints: js.UndefOr[ResolverEndpoints] = js.undefined): ListResolverEndpointsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ResolverEndpoints" -> ResolverEndpoints.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResolverEndpointsResponse]
    }
  }

  @js.native
  trait ListResolverRuleAssociationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Filters: js.UndefOr[Filters]
  }

  object ListResolverRuleAssociationsRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Filters: js.UndefOr[Filters] = js.undefined): ListResolverRuleAssociationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResolverRuleAssociationsRequest]
    }
  }

  @js.native
  trait ListResolverRuleAssociationsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
    var ResolverRuleAssociations: js.UndefOr[ResolverRuleAssociations]
  }

  object ListResolverRuleAssociationsResponse {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      ResolverRuleAssociations: js.UndefOr[ResolverRuleAssociations] = js.undefined): ListResolverRuleAssociationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ResolverRuleAssociations" -> ResolverRuleAssociations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResolverRuleAssociationsResponse]
    }
  }

  @js.native
  trait ListResolverRulesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Filters: js.UndefOr[Filters]
  }

  object ListResolverRulesRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Filters: js.UndefOr[Filters] = js.undefined): ListResolverRulesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResolverRulesRequest]
    }
  }

  @js.native
  trait ListResolverRulesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
    var ResolverRules: js.UndefOr[ResolverRules]
  }

  object ListResolverRulesResponse {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      ResolverRules: js.UndefOr[ResolverRules] = js.undefined): ListResolverRulesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ResolverRules" -> ResolverRules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResolverRulesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: js.UndefOr[Arn]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceRequest {
    def apply(
      ResourceArn: js.UndefOr[Arn] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceResponse {
    def apply(
      Tags: js.UndefOr[TagList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait PutResolverRulePolicyRequest extends js.Object {
    var Arn: js.UndefOr[Arn]
    var ResolverRulePolicy: js.UndefOr[ResolverRulePolicy]
  }

  object PutResolverRulePolicyRequest {
    def apply(
      Arn: js.UndefOr[Arn] = js.undefined,
      ResolverRulePolicy: js.UndefOr[ResolverRulePolicy] = js.undefined): PutResolverRulePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "ResolverRulePolicy" -> ResolverRulePolicy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutResolverRulePolicyRequest]
    }
  }

  /**
   * <p>The response to a <code>PutResolverRulePolicy</code> request.</p>
   */
  @js.native
  trait PutResolverRulePolicyResponse extends js.Object {
    var ReturnValue: js.UndefOr[Boolean]
  }

  object PutResolverRulePolicyResponse {
    def apply(
      ReturnValue: js.UndefOr[Boolean] = js.undefined): PutResolverRulePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReturnValue" -> ReturnValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutResolverRulePolicyResponse]
    }
  }

  /**
   * <p>In the response to a <a>CreateResolverEndpoint</a>, <a>DeleteResolverEndpoint</a>, <a>GetResolverEndpoint</a>, <a>ListResolverEndpoints</a>, or <a>UpdateResolverEndpoint</a> request, a complex type that contains settings for an existing inbound or outbound resolver endpoint.</p>
   */
  @js.native
  trait ResolverEndpoint extends js.Object {
    var Id: js.UndefOr[ResourceId]
    var StatusMessage: js.UndefOr[StatusMessage]
    var Name: js.UndefOr[Name]
    var HostVPCId: js.UndefOr[ResourceId]
    var Arn: js.UndefOr[Arn]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var ModificationTime: js.UndefOr[Rfc3339TimeString]
    var CreatorRequestId: js.UndefOr[CreatorRequestId]
    var IpAddressCount: js.UndefOr[IpAddressCount]
    var Status: js.UndefOr[ResolverEndpointStatus]
    var Direction: js.UndefOr[ResolverEndpointDirection]
    var CreationTime: js.UndefOr[Rfc3339TimeString]
  }

  object ResolverEndpoint {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined,
      StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
      Name: js.UndefOr[Name] = js.undefined,
      HostVPCId: js.UndefOr[ResourceId] = js.undefined,
      Arn: js.UndefOr[Arn] = js.undefined,
      SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
      ModificationTime: js.UndefOr[Rfc3339TimeString] = js.undefined,
      CreatorRequestId: js.UndefOr[CreatorRequestId] = js.undefined,
      IpAddressCount: js.UndefOr[IpAddressCount] = js.undefined,
      Status: js.UndefOr[ResolverEndpointStatus] = js.undefined,
      Direction: js.UndefOr[ResolverEndpointDirection] = js.undefined,
      CreationTime: js.UndefOr[Rfc3339TimeString] = js.undefined): ResolverEndpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "HostVPCId" -> HostVPCId.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "ModificationTime" -> ModificationTime.map { x => x.asInstanceOf[js.Any] },
        "CreatorRequestId" -> CreatorRequestId.map { x => x.asInstanceOf[js.Any] },
        "IpAddressCount" -> IpAddressCount.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Direction" -> Direction.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResolverEndpoint]
    }
  }

  object ResolverEndpointDirectionEnum {
    val INBOUND = "INBOUND"
    val OUTBOUND = "OUTBOUND"

    val values = IndexedSeq(INBOUND, OUTBOUND)
  }

  object ResolverEndpointStatusEnum {
    val CREATING = "CREATING"
    val OPERATIONAL = "OPERATIONAL"
    val UPDATING = "UPDATING"
    val AUTO_RECOVERING = "AUTO_RECOVERING"
    val ACTION_NEEDED = "ACTION_NEEDED"
    val DELETING = "DELETING"

    val values = IndexedSeq(CREATING, OPERATIONAL, UPDATING, AUTO_RECOVERING, ACTION_NEEDED, DELETING)
  }

  /**
   * <p>For queries that originate in your VPC, detailed information about a resolver rule, which specifies how to route DNS queries out of the VPC. The <code>ResolverRule</code> parameter appears in the response to a <a>CreateResolverRule</a>, <a>DeleteResolverRule</a>, <a>GetResolverRule</a>, <a>ListResolverRules</a>, or <a>UpdateResolverRule</a> request.</p>
   */
  @js.native
  trait ResolverRule extends js.Object {
    var TargetIps: js.UndefOr[TargetList]
    var Id: js.UndefOr[ResourceId]
    var ResolverEndpointId: js.UndefOr[ResourceId]
    var StatusMessage: js.UndefOr[StatusMessage]
    var Name: js.UndefOr[Name]
    var ShareStatus: js.UndefOr[ShareStatus]
    var Arn: js.UndefOr[Arn]
    var OwnerId: js.UndefOr[AccountId]
    var DomainName: js.UndefOr[DomainName]
    var CreatorRequestId: js.UndefOr[CreatorRequestId]
    var RuleType: js.UndefOr[RuleTypeOption]
    var Status: js.UndefOr[ResolverRuleStatus]
  }

  object ResolverRule {
    def apply(
      TargetIps: js.UndefOr[TargetList] = js.undefined,
      Id: js.UndefOr[ResourceId] = js.undefined,
      ResolverEndpointId: js.UndefOr[ResourceId] = js.undefined,
      StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
      Name: js.UndefOr[Name] = js.undefined,
      ShareStatus: js.UndefOr[ShareStatus] = js.undefined,
      Arn: js.UndefOr[Arn] = js.undefined,
      OwnerId: js.UndefOr[AccountId] = js.undefined,
      DomainName: js.UndefOr[DomainName] = js.undefined,
      CreatorRequestId: js.UndefOr[CreatorRequestId] = js.undefined,
      RuleType: js.UndefOr[RuleTypeOption] = js.undefined,
      Status: js.UndefOr[ResolverRuleStatus] = js.undefined): ResolverRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetIps" -> TargetIps.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "ResolverEndpointId" -> ResolverEndpointId.map { x => x.asInstanceOf[js.Any] },
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ShareStatus" -> ShareStatus.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "OwnerId" -> OwnerId.map { x => x.asInstanceOf[js.Any] },
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] },
        "CreatorRequestId" -> CreatorRequestId.map { x => x.asInstanceOf[js.Any] },
        "RuleType" -> RuleType.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResolverRule]
    }
  }

  /**
   * <p>In the response to an <a>AssociateResolverRule</a>, <a>DisassociateResolverRule</a>, or <a>ListResolverRuleAssociations</a> request, information about an association between a resolver rule and a VPC.</p>
   */
  @js.native
  trait ResolverRuleAssociation extends js.Object {
    var Id: js.UndefOr[ResourceId]
    var StatusMessage: js.UndefOr[StatusMessage]
    var Name: js.UndefOr[Name]
    var ResolverRuleId: js.UndefOr[ResourceId]
    var VPCId: js.UndefOr[ResourceId]
    var Status: js.UndefOr[ResolverRuleAssociationStatus]
  }

  object ResolverRuleAssociation {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined,
      StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
      Name: js.UndefOr[Name] = js.undefined,
      ResolverRuleId: js.UndefOr[ResourceId] = js.undefined,
      VPCId: js.UndefOr[ResourceId] = js.undefined,
      Status: js.UndefOr[ResolverRuleAssociationStatus] = js.undefined): ResolverRuleAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ResolverRuleId" -> ResolverRuleId.map { x => x.asInstanceOf[js.Any] },
        "VPCId" -> VPCId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResolverRuleAssociation]
    }
  }

  object ResolverRuleAssociationStatusEnum {
    val CREATING = "CREATING"
    val COMPLETE = "COMPLETE"
    val DELETING = "DELETING"
    val FAILED = "FAILED"
    val OVERRIDDEN = "OVERRIDDEN"

    val values = IndexedSeq(CREATING, COMPLETE, DELETING, FAILED, OVERRIDDEN)
  }

  /**
   * <p>In an <a>UpdateResolverRule</a> request, information about the changes that you want to make.</p>
   */
  @js.native
  trait ResolverRuleConfig extends js.Object {
    var Name: js.UndefOr[Name]
    var TargetIps: js.UndefOr[TargetList]
    var ResolverEndpointId: js.UndefOr[ResourceId]
  }

  object ResolverRuleConfig {
    def apply(
      Name: js.UndefOr[Name] = js.undefined,
      TargetIps: js.UndefOr[TargetList] = js.undefined,
      ResolverEndpointId: js.UndefOr[ResourceId] = js.undefined): ResolverRuleConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "TargetIps" -> TargetIps.map { x => x.asInstanceOf[js.Any] },
        "ResolverEndpointId" -> ResolverEndpointId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResolverRuleConfig]
    }
  }

  object ResolverRuleStatusEnum {
    val COMPLETE = "COMPLETE"
    val DELETING = "DELETING"
    val UPDATING = "UPDATING"
    val FAILED = "FAILED"

    val values = IndexedSeq(COMPLETE, DELETING, UPDATING, FAILED)
  }

  object RuleTypeOptionEnum {
    val FORWARD = "FORWARD"
    val SYSTEM = "SYSTEM"
    val RECURSIVE = "RECURSIVE"

    val values = IndexedSeq(FORWARD, SYSTEM, RECURSIVE)
  }

  object ShareStatusEnum {
    val NOT_SHARED = "NOT_SHARED"
    val SHARED_WITH_ME = "SHARED_WITH_ME"
    val SHARED_BY_ME = "SHARED_BY_ME"

    val values = IndexedSeq(NOT_SHARED, SHARED_WITH_ME, SHARED_BY_ME)
  }

  /**
   * <p>One tag that you want to add to the specified resource. A tag consists of a <code>Key</code> (a name for the tag) and a <code>Value</code>.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: js.UndefOr[Arn]
    var Tags: js.UndefOr[TagList]
  }

  object TagResourceRequest {
    def apply(
      ResourceArn: js.UndefOr[Arn] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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

  /**
   * <p>In a <a>CreateResolverRule</a> request, an array of the IPs that you want to forward DNS queries to.</p>
   */
  @js.native
  trait TargetAddress extends js.Object {
    var Ip: js.UndefOr[Ip]
    var Port: js.UndefOr[Port]
  }

  object TargetAddress {
    def apply(
      Ip: js.UndefOr[Ip] = js.undefined,
      Port: js.UndefOr[Port] = js.undefined): TargetAddress = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ip" -> Ip.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetAddress]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: js.UndefOr[Arn]
    var TagKeys: js.UndefOr[TagKeyList]
  }

  object UntagResourceRequest {
    def apply(
      ResourceArn: js.UndefOr[Arn] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
  trait UpdateResolverEndpointRequest extends js.Object {
    var ResolverEndpointId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[Name]
  }

  object UpdateResolverEndpointRequest {
    def apply(
      ResolverEndpointId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[Name] = js.undefined): UpdateResolverEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverEndpointId" -> ResolverEndpointId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateResolverEndpointRequest]
    }
  }

  @js.native
  trait UpdateResolverEndpointResponse extends js.Object {
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint]
  }

  object UpdateResolverEndpointResponse {
    def apply(
      ResolverEndpoint: js.UndefOr[ResolverEndpoint] = js.undefined): UpdateResolverEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverEndpoint" -> ResolverEndpoint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateResolverEndpointResponse]
    }
  }

  @js.native
  trait UpdateResolverRuleRequest extends js.Object {
    var ResolverRuleId: js.UndefOr[ResourceId]
    var Config: js.UndefOr[ResolverRuleConfig]
  }

  object UpdateResolverRuleRequest {
    def apply(
      ResolverRuleId: js.UndefOr[ResourceId] = js.undefined,
      Config: js.UndefOr[ResolverRuleConfig] = js.undefined): UpdateResolverRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverRuleId" -> ResolverRuleId.map { x => x.asInstanceOf[js.Any] },
        "Config" -> Config.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateResolverRuleRequest]
    }
  }

  @js.native
  trait UpdateResolverRuleResponse extends js.Object {
    var ResolverRule: js.UndefOr[ResolverRule]
  }

  object UpdateResolverRuleResponse {
    def apply(
      ResolverRule: js.UndefOr[ResolverRule] = js.undefined): UpdateResolverRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResolverRule" -> ResolverRule.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateResolverRuleResponse]
    }
  }
}
