package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object route53resolver {
  type AccountId                = String
  type Arn                      = String
  type CreatorRequestId         = String
  type DomainName               = String
  type FilterName               = String
  type FilterValue              = String
  type FilterValues             = js.Array[FilterValue]
  type Filters                  = js.Array[Filter]
  type Ip                       = String
  type IpAddressCount           = Int
  type IpAddressesRequest       = js.Array[IpAddressRequest]
  type IpAddressesResponse      = js.Array[IpAddressResponse]
  type MaxResults               = Int
  type Name                     = String
  type NextToken                = String
  type Port                     = Int
  type ResolverEndpoints        = js.Array[ResolverEndpoint]
  type ResolverRuleAssociations = js.Array[ResolverRuleAssociation]
  type ResolverRulePolicy       = String
  type ResolverRules            = js.Array[ResolverRule]
  type ResourceId               = String
  type Rfc3339TimeString        = String
  type SecurityGroupIds         = js.Array[ResourceId]
  type StatusMessage            = String
  type SubnetId                 = String
  type TagKey                   = String
  type TagKeyList               = js.Array[TagKey]
  type TagList                  = js.Array[Tag]
  type TagValue                 = String
  type TargetList               = js.Array[TargetAddress]

  implicit final class Route53ResolverOps(private val service: Route53Resolver) extends AnyVal {

    @inline def associateResolverEndpointIpAddressFuture(
        params: AssociateResolverEndpointIpAddressRequest
    ): Future[AssociateResolverEndpointIpAddressResponse] =
      service.associateResolverEndpointIpAddress(params).promise().toFuture
    @inline def associateResolverRuleFuture(
        params: AssociateResolverRuleRequest
    ): Future[AssociateResolverRuleResponse] = service.associateResolverRule(params).promise().toFuture
    @inline def createResolverEndpointFuture(
        params: CreateResolverEndpointRequest
    ): Future[CreateResolverEndpointResponse] = service.createResolverEndpoint(params).promise().toFuture
    @inline def createResolverRuleFuture(params: CreateResolverRuleRequest): Future[CreateResolverRuleResponse] =
      service.createResolverRule(params).promise().toFuture
    @inline def deleteResolverEndpointFuture(
        params: DeleteResolverEndpointRequest
    ): Future[DeleteResolverEndpointResponse] = service.deleteResolverEndpoint(params).promise().toFuture
    @inline def deleteResolverRuleFuture(params: DeleteResolverRuleRequest): Future[DeleteResolverRuleResponse] =
      service.deleteResolverRule(params).promise().toFuture
    @inline def disassociateResolverEndpointIpAddressFuture(
        params: DisassociateResolverEndpointIpAddressRequest
    ): Future[DisassociateResolverEndpointIpAddressResponse] =
      service.disassociateResolverEndpointIpAddress(params).promise().toFuture
    @inline def disassociateResolverRuleFuture(
        params: DisassociateResolverRuleRequest
    ): Future[DisassociateResolverRuleResponse] = service.disassociateResolverRule(params).promise().toFuture
    @inline def getResolverEndpointFuture(params: GetResolverEndpointRequest): Future[GetResolverEndpointResponse] =
      service.getResolverEndpoint(params).promise().toFuture
    @inline def getResolverRuleAssociationFuture(
        params: GetResolverRuleAssociationRequest
    ): Future[GetResolverRuleAssociationResponse] = service.getResolverRuleAssociation(params).promise().toFuture
    @inline def getResolverRuleFuture(params: GetResolverRuleRequest): Future[GetResolverRuleResponse] =
      service.getResolverRule(params).promise().toFuture
    @inline def getResolverRulePolicyFuture(
        params: GetResolverRulePolicyRequest
    ): Future[GetResolverRulePolicyResponse] = service.getResolverRulePolicy(params).promise().toFuture
    @inline def listResolverEndpointIpAddressesFuture(
        params: ListResolverEndpointIpAddressesRequest
    ): Future[ListResolverEndpointIpAddressesResponse] =
      service.listResolverEndpointIpAddresses(params).promise().toFuture
    @inline def listResolverEndpointsFuture(
        params: ListResolverEndpointsRequest
    ): Future[ListResolverEndpointsResponse] = service.listResolverEndpoints(params).promise().toFuture
    @inline def listResolverRuleAssociationsFuture(
        params: ListResolverRuleAssociationsRequest
    ): Future[ListResolverRuleAssociationsResponse] = service.listResolverRuleAssociations(params).promise().toFuture
    @inline def listResolverRulesFuture(params: ListResolverRulesRequest): Future[ListResolverRulesResponse] =
      service.listResolverRules(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def putResolverRulePolicyFuture(
        params: PutResolverRulePolicyRequest
    ): Future[PutResolverRulePolicyResponse] = service.putResolverRulePolicy(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateResolverEndpointFuture(
        params: UpdateResolverEndpointRequest
    ): Future[UpdateResolverEndpointResponse] = service.updateResolverEndpoint(params).promise().toFuture
    @inline def updateResolverRuleFuture(params: UpdateResolverRuleRequest): Future[UpdateResolverRuleResponse] =
      service.updateResolverRule(params).promise().toFuture
  }
}

package route53resolver {
  @js.native
  @JSImport("aws-sdk", "Route53Resolver")
  class Route53Resolver() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateResolverEndpointIpAddress(
        params: AssociateResolverEndpointIpAddressRequest
    ): Request[AssociateResolverEndpointIpAddressResponse]                                                  = js.native
    def associateResolverRule(params: AssociateResolverRuleRequest): Request[AssociateResolverRuleResponse] = js.native
    def createResolverEndpoint(params: CreateResolverEndpointRequest): Request[CreateResolverEndpointResponse] =
      js.native
    def createResolverRule(params: CreateResolverRuleRequest): Request[CreateResolverRuleResponse] = js.native
    def deleteResolverEndpoint(params: DeleteResolverEndpointRequest): Request[DeleteResolverEndpointResponse] =
      js.native
    def deleteResolverRule(params: DeleteResolverRuleRequest): Request[DeleteResolverRuleResponse] = js.native
    def disassociateResolverEndpointIpAddress(
        params: DisassociateResolverEndpointIpAddressRequest
    ): Request[DisassociateResolverEndpointIpAddressResponse] = js.native
    def disassociateResolverRule(params: DisassociateResolverRuleRequest): Request[DisassociateResolverRuleResponse] =
      js.native
    def getResolverEndpoint(params: GetResolverEndpointRequest): Request[GetResolverEndpointResponse] = js.native
    def getResolverRule(params: GetResolverRuleRequest): Request[GetResolverRuleResponse]             = js.native
    def getResolverRuleAssociation(
        params: GetResolverRuleAssociationRequest
    ): Request[GetResolverRuleAssociationResponse]                                                          = js.native
    def getResolverRulePolicy(params: GetResolverRulePolicyRequest): Request[GetResolverRulePolicyResponse] = js.native
    def listResolverEndpointIpAddresses(
        params: ListResolverEndpointIpAddressesRequest
    ): Request[ListResolverEndpointIpAddressesResponse]                                                     = js.native
    def listResolverEndpoints(params: ListResolverEndpointsRequest): Request[ListResolverEndpointsResponse] = js.native
    def listResolverRuleAssociations(
        params: ListResolverRuleAssociationsRequest
    ): Request[ListResolverRuleAssociationsResponse]                                                        = js.native
    def listResolverRules(params: ListResolverRulesRequest): Request[ListResolverRulesResponse]             = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]       = js.native
    def putResolverRulePolicy(params: PutResolverRulePolicyRequest): Request[PutResolverRulePolicyResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                               = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                         = js.native
    def updateResolverEndpoint(params: UpdateResolverEndpointRequest): Request[UpdateResolverEndpointResponse] =
      js.native
    def updateResolverRule(params: UpdateResolverRuleRequest): Request[UpdateResolverRuleResponse] = js.native
  }

  @js.native
  @Factory
  trait AssociateResolverEndpointIpAddressRequest extends js.Object {
    var IpAddress: IpAddressUpdate
    var ResolverEndpointId: ResourceId
  }

  @js.native
  @Factory
  trait AssociateResolverEndpointIpAddressResponse extends js.Object {
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint]
  }

  @js.native
  @Factory
  trait AssociateResolverRuleRequest extends js.Object {
    var ResolverRuleId: ResourceId
    var VPCId: ResourceId
    var Name: js.UndefOr[Name]
  }

  @js.native
  @Factory
  trait AssociateResolverRuleResponse extends js.Object {
    var ResolverRuleAssociation: js.UndefOr[ResolverRuleAssociation]
  }

  @js.native
  @Factory
  trait CreateResolverEndpointRequest extends js.Object {
    var CreatorRequestId: CreatorRequestId
    var Direction: ResolverEndpointDirection
    var IpAddresses: IpAddressesRequest
    var SecurityGroupIds: SecurityGroupIds
    var Name: js.UndefOr[Name]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateResolverEndpointResponse extends js.Object {
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint]
  }

  @js.native
  @Factory
  trait CreateResolverRuleRequest extends js.Object {
    var CreatorRequestId: CreatorRequestId
    var DomainName: DomainName
    var RuleType: RuleTypeOption
    var Name: js.UndefOr[Name]
    var ResolverEndpointId: js.UndefOr[ResourceId]
    var Tags: js.UndefOr[TagList]
    var TargetIps: js.UndefOr[TargetList]
  }

  @js.native
  @Factory
  trait CreateResolverRuleResponse extends js.Object {
    var ResolverRule: js.UndefOr[ResolverRule]
  }

  @js.native
  @Factory
  trait DeleteResolverEndpointRequest extends js.Object {
    var ResolverEndpointId: ResourceId
  }

  @js.native
  @Factory
  trait DeleteResolverEndpointResponse extends js.Object {
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint]
  }

  @js.native
  @Factory
  trait DeleteResolverRuleRequest extends js.Object {
    var ResolverRuleId: ResourceId
  }

  @js.native
  @Factory
  trait DeleteResolverRuleResponse extends js.Object {
    var ResolverRule: js.UndefOr[ResolverRule]
  }

  @js.native
  @Factory
  trait DisassociateResolverEndpointIpAddressRequest extends js.Object {
    var IpAddress: IpAddressUpdate
    var ResolverEndpointId: ResourceId
  }

  @js.native
  @Factory
  trait DisassociateResolverEndpointIpAddressResponse extends js.Object {
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint]
  }

  @js.native
  @Factory
  trait DisassociateResolverRuleRequest extends js.Object {
    var ResolverRuleId: ResourceId
    var VPCId: ResourceId
  }

  @js.native
  @Factory
  trait DisassociateResolverRuleResponse extends js.Object {
    var ResolverRuleAssociation: js.UndefOr[ResolverRuleAssociation]
  }

  /**
    * For <code>List</code> operations, an optional specification to return a subset of objects, such as resolver endpoints or resolver rules.
    */
  @js.native
  @Factory
  trait Filter extends js.Object {
    var Name: js.UndefOr[FilterName]
    var Values: js.UndefOr[FilterValues]
  }

  @js.native
  @Factory
  trait GetResolverEndpointRequest extends js.Object {
    var ResolverEndpointId: ResourceId
  }

  @js.native
  @Factory
  trait GetResolverEndpointResponse extends js.Object {
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint]
  }

  @js.native
  @Factory
  trait GetResolverRuleAssociationRequest extends js.Object {
    var ResolverRuleAssociationId: ResourceId
  }

  @js.native
  @Factory
  trait GetResolverRuleAssociationResponse extends js.Object {
    var ResolverRuleAssociation: js.UndefOr[ResolverRuleAssociation]
  }

  @js.native
  @Factory
  trait GetResolverRulePolicyRequest extends js.Object {
    var Arn: Arn
  }

  @js.native
  @Factory
  trait GetResolverRulePolicyResponse extends js.Object {
    var ResolverRulePolicy: js.UndefOr[ResolverRulePolicy]
  }

  @js.native
  @Factory
  trait GetResolverRuleRequest extends js.Object {
    var ResolverRuleId: ResourceId
  }

  @js.native
  @Factory
  trait GetResolverRuleResponse extends js.Object {
    var ResolverRule: js.UndefOr[ResolverRule]
  }

  /**
    * In an <a>CreateResolverEndpoint</a> request, a subnet and IP address that you want to use for DNS queries.
    */
  @js.native
  @Factory
  trait IpAddressRequest extends js.Object {
    var SubnetId: SubnetId
    var Ip: js.UndefOr[Ip]
  }

  /**
    * In the response to a <a>GetResolverEndpoint</a> request, information about the IP addresses that the resolver endpoint uses for DNS queries.
    */
  @js.native
  @Factory
  trait IpAddressResponse extends js.Object {
    var CreationTime: js.UndefOr[Rfc3339TimeString]
    var Ip: js.UndefOr[Ip]
    var IpId: js.UndefOr[ResourceId]
    var ModificationTime: js.UndefOr[Rfc3339TimeString]
    var Status: js.UndefOr[IpAddressStatus]
    var StatusMessage: js.UndefOr[StatusMessage]
    var SubnetId: js.UndefOr[SubnetId]
  }

  @js.native
  sealed trait IpAddressStatus extends js.Any
  object IpAddressStatus extends js.Object {
    val CREATING                  = "CREATING".asInstanceOf[IpAddressStatus]
    val FAILED_CREATION           = "FAILED_CREATION".asInstanceOf[IpAddressStatus]
    val ATTACHING                 = "ATTACHING".asInstanceOf[IpAddressStatus]
    val ATTACHED                  = "ATTACHED".asInstanceOf[IpAddressStatus]
    val REMAP_DETACHING           = "REMAP_DETACHING".asInstanceOf[IpAddressStatus]
    val REMAP_ATTACHING           = "REMAP_ATTACHING".asInstanceOf[IpAddressStatus]
    val DETACHING                 = "DETACHING".asInstanceOf[IpAddressStatus]
    val FAILED_RESOURCE_GONE      = "FAILED_RESOURCE_GONE".asInstanceOf[IpAddressStatus]
    val DELETING                  = "DELETING".asInstanceOf[IpAddressStatus]
    val DELETE_FAILED_FAS_EXPIRED = "DELETE_FAILED_FAS_EXPIRED".asInstanceOf[IpAddressStatus]

    val values = js.Object.freeze(
      js.Array(
        CREATING,
        FAILED_CREATION,
        ATTACHING,
        ATTACHED,
        REMAP_DETACHING,
        REMAP_ATTACHING,
        DETACHING,
        FAILED_RESOURCE_GONE,
        DELETING,
        DELETE_FAILED_FAS_EXPIRED
      )
    )
  }

  /**
    * In an <a>UpdateResolverEndpoint</a> request, information about an IP address to update.
    */
  @js.native
  @Factory
  trait IpAddressUpdate extends js.Object {
    var Ip: js.UndefOr[Ip]
    var IpId: js.UndefOr[ResourceId]
    var SubnetId: js.UndefOr[SubnetId]
  }

  @js.native
  @Factory
  trait ListResolverEndpointIpAddressesRequest extends js.Object {
    var ResolverEndpointId: ResourceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListResolverEndpointIpAddressesResponse extends js.Object {
    var IpAddresses: js.UndefOr[IpAddressesResponse]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListResolverEndpointsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListResolverEndpointsResponse extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ResolverEndpoints: js.UndefOr[ResolverEndpoints]
  }

  @js.native
  @Factory
  trait ListResolverRuleAssociationsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListResolverRuleAssociationsResponse extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ResolverRuleAssociations: js.UndefOr[ResolverRuleAssociations]
  }

  @js.native
  @Factory
  trait ListResolverRulesRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListResolverRulesResponse extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ResolverRules: js.UndefOr[ResolverRules]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: Arn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait PutResolverRulePolicyRequest extends js.Object {
    var Arn: Arn
    var ResolverRulePolicy: ResolverRulePolicy
  }

  /**
    * The response to a <code>PutResolverRulePolicy</code> request.
    */
  @js.native
  @Factory
  trait PutResolverRulePolicyResponse extends js.Object {
    var ReturnValue: js.UndefOr[Boolean]
  }

  /**
    * In the response to a <a>CreateResolverEndpoint</a>, <a>DeleteResolverEndpoint</a>, <a>GetResolverEndpoint</a>, <a>ListResolverEndpoints</a>, or <a>UpdateResolverEndpoint</a> request, a complex type that contains settings for an existing inbound or outbound resolver endpoint.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait ResolverEndpointDirection extends js.Any
  object ResolverEndpointDirection extends js.Object {
    val INBOUND  = "INBOUND".asInstanceOf[ResolverEndpointDirection]
    val OUTBOUND = "OUTBOUND".asInstanceOf[ResolverEndpointDirection]

    val values = js.Object.freeze(js.Array(INBOUND, OUTBOUND))
  }

  @js.native
  sealed trait ResolverEndpointStatus extends js.Any
  object ResolverEndpointStatus extends js.Object {
    val CREATING        = "CREATING".asInstanceOf[ResolverEndpointStatus]
    val OPERATIONAL     = "OPERATIONAL".asInstanceOf[ResolverEndpointStatus]
    val UPDATING        = "UPDATING".asInstanceOf[ResolverEndpointStatus]
    val AUTO_RECOVERING = "AUTO_RECOVERING".asInstanceOf[ResolverEndpointStatus]
    val ACTION_NEEDED   = "ACTION_NEEDED".asInstanceOf[ResolverEndpointStatus]
    val DELETING        = "DELETING".asInstanceOf[ResolverEndpointStatus]

    val values = js.Object.freeze(js.Array(CREATING, OPERATIONAL, UPDATING, AUTO_RECOVERING, ACTION_NEEDED, DELETING))
  }

  /**
    * For queries that originate in your VPC, detailed information about a resolver rule, which specifies how to route DNS queries out of the VPC. The <code>ResolverRule</code> parameter appears in the response to a <a>CreateResolverRule</a>, <a>DeleteResolverRule</a>, <a>GetResolverRule</a>, <a>ListResolverRules</a>, or <a>UpdateResolverRule</a> request.
    */
  @js.native
  @Factory
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

  /**
    * In the response to an <a>AssociateResolverRule</a>, <a>DisassociateResolverRule</a>, or <a>ListResolverRuleAssociations</a> request, information about an association between a resolver rule and a VPC.
    */
  @js.native
  @Factory
  trait ResolverRuleAssociation extends js.Object {
    var Id: js.UndefOr[ResourceId]
    var Name: js.UndefOr[Name]
    var ResolverRuleId: js.UndefOr[ResourceId]
    var Status: js.UndefOr[ResolverRuleAssociationStatus]
    var StatusMessage: js.UndefOr[StatusMessage]
    var VPCId: js.UndefOr[ResourceId]
  }

  @js.native
  sealed trait ResolverRuleAssociationStatus extends js.Any
  object ResolverRuleAssociationStatus extends js.Object {
    val CREATING   = "CREATING".asInstanceOf[ResolverRuleAssociationStatus]
    val COMPLETE   = "COMPLETE".asInstanceOf[ResolverRuleAssociationStatus]
    val DELETING   = "DELETING".asInstanceOf[ResolverRuleAssociationStatus]
    val FAILED     = "FAILED".asInstanceOf[ResolverRuleAssociationStatus]
    val OVERRIDDEN = "OVERRIDDEN".asInstanceOf[ResolverRuleAssociationStatus]

    val values = js.Object.freeze(js.Array(CREATING, COMPLETE, DELETING, FAILED, OVERRIDDEN))
  }

  /**
    * In an <a>UpdateResolverRule</a> request, information about the changes that you want to make.
    */
  @js.native
  @Factory
  trait ResolverRuleConfig extends js.Object {
    var Name: js.UndefOr[Name]
    var ResolverEndpointId: js.UndefOr[ResourceId]
    var TargetIps: js.UndefOr[TargetList]
  }

  @js.native
  sealed trait ResolverRuleStatus extends js.Any
  object ResolverRuleStatus extends js.Object {
    val COMPLETE = "COMPLETE".asInstanceOf[ResolverRuleStatus]
    val DELETING = "DELETING".asInstanceOf[ResolverRuleStatus]
    val UPDATING = "UPDATING".asInstanceOf[ResolverRuleStatus]
    val FAILED   = "FAILED".asInstanceOf[ResolverRuleStatus]

    val values = js.Object.freeze(js.Array(COMPLETE, DELETING, UPDATING, FAILED))
  }

  @js.native
  sealed trait RuleTypeOption extends js.Any
  object RuleTypeOption extends js.Object {
    val FORWARD   = "FORWARD".asInstanceOf[RuleTypeOption]
    val SYSTEM    = "SYSTEM".asInstanceOf[RuleTypeOption]
    val RECURSIVE = "RECURSIVE".asInstanceOf[RuleTypeOption]

    val values = js.Object.freeze(js.Array(FORWARD, SYSTEM, RECURSIVE))
  }

  @js.native
  sealed trait ShareStatus extends js.Any
  object ShareStatus extends js.Object {
    val NOT_SHARED     = "NOT_SHARED".asInstanceOf[ShareStatus]
    val SHARED_WITH_ME = "SHARED_WITH_ME".asInstanceOf[ShareStatus]
    val SHARED_BY_ME   = "SHARED_BY_ME".asInstanceOf[ShareStatus]

    val values = js.Object.freeze(js.Array(NOT_SHARED, SHARED_WITH_ME, SHARED_BY_ME))
  }

  /**
    * One tag that you want to add to the specified resource. A tag consists of a <code>Key</code> (a name for the tag) and a <code>Value</code>.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  /**
    * In a <a>CreateResolverRule</a> request, an array of the IPs that you want to forward DNS queries to.
    */
  @js.native
  @Factory
  trait TargetAddress extends js.Object {
    var Ip: Ip
    var Port: js.UndefOr[Port]
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateResolverEndpointRequest extends js.Object {
    var ResolverEndpointId: ResourceId
    var Name: js.UndefOr[Name]
  }

  @js.native
  @Factory
  trait UpdateResolverEndpointResponse extends js.Object {
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint]
  }

  @js.native
  @Factory
  trait UpdateResolverRuleRequest extends js.Object {
    var Config: ResolverRuleConfig
    var ResolverRuleId: ResourceId
  }

  @js.native
  @Factory
  trait UpdateResolverRuleResponse extends js.Object {
    var ResolverRule: js.UndefOr[ResolverRule]
  }
}
