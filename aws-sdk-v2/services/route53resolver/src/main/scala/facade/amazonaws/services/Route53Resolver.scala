package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object route53resolver {
  type AccountId = String
  type Arn = String
  type BlockOverrideDomain = String
  type BlockOverrideTtl = Int
  type Count = Int
  type CreatorRequestId = String
  type DestinationArn = String
  type DomainListFileUrl = String
  type DomainName = String
  type FilterName = String
  type FilterValue = String
  type FilterValues = js.Array[FilterValue]
  type Filters = js.Array[Filter]
  type FirewallConfigList = js.Array[FirewallConfig]
  type FirewallDomainListMetadataList = js.Array[FirewallDomainListMetadata]
  type FirewallDomainName = String
  type FirewallDomains = js.Array[FirewallDomainName]
  type FirewallRuleGroupAssociations = js.Array[FirewallRuleGroupAssociation]
  type FirewallRuleGroupMetadataList = js.Array[FirewallRuleGroupMetadata]
  type FirewallRuleGroupPolicy = String
  type FirewallRules = js.Array[FirewallRule]
  type Ip = String
  type IpAddressCount = Int
  type IpAddressesRequest = js.Array[IpAddressRequest]
  type IpAddressesResponse = js.Array[IpAddressResponse]
  type ListDomainMaxResults = Int
  type ListFirewallConfigsMaxResult = Int
  type ListResolverConfigsMaxResult = Int
  type MaxResults = Int
  type Name = String
  type NextToken = String
  type Port = Int
  type Priority = Int
  type ResolverConfigList = js.Array[ResolverConfig]
  type ResolverDnssecConfigList = js.Array[ResolverDnssecConfig]
  type ResolverEndpoints = js.Array[ResolverEndpoint]
  type ResolverQueryLogConfigAssociationErrorMessage = String
  type ResolverQueryLogConfigAssociationList = js.Array[ResolverQueryLogConfigAssociation]
  type ResolverQueryLogConfigList = js.Array[ResolverQueryLogConfig]
  type ResolverQueryLogConfigName = String
  type ResolverQueryLogConfigPolicy = String
  type ResolverRuleAssociations = js.Array[ResolverRuleAssociation]
  type ResolverRulePolicy = String
  type ResolverRules = js.Array[ResolverRule]
  type ResourceId = String
  type Rfc3339TimeString = String
  type SecurityGroupIds = js.Array[ResourceId]
  type ServicePrinciple = String
  type SortByKey = String
  type StatusMessage = String
  type SubnetId = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TargetList = js.Array[TargetAddress]
  type Unsigned = Int

  final class Route53ResolverOps(private val service: Route53Resolver) extends AnyVal {

    @inline def associateFirewallRuleGroupFuture(params: AssociateFirewallRuleGroupRequest): Future[AssociateFirewallRuleGroupResponse] = service.associateFirewallRuleGroup(params).promise().toFuture
    @inline def associateResolverEndpointIpAddressFuture(params: AssociateResolverEndpointIpAddressRequest): Future[AssociateResolverEndpointIpAddressResponse] = service.associateResolverEndpointIpAddress(params).promise().toFuture
    @inline def associateResolverQueryLogConfigFuture(params: AssociateResolverQueryLogConfigRequest): Future[AssociateResolverQueryLogConfigResponse] = service.associateResolverQueryLogConfig(params).promise().toFuture
    @inline def associateResolverRuleFuture(params: AssociateResolverRuleRequest): Future[AssociateResolverRuleResponse] = service.associateResolverRule(params).promise().toFuture
    @inline def createFirewallDomainListFuture(params: CreateFirewallDomainListRequest): Future[CreateFirewallDomainListResponse] = service.createFirewallDomainList(params).promise().toFuture
    @inline def createFirewallRuleFuture(params: CreateFirewallRuleRequest): Future[CreateFirewallRuleResponse] = service.createFirewallRule(params).promise().toFuture
    @inline def createFirewallRuleGroupFuture(params: CreateFirewallRuleGroupRequest): Future[CreateFirewallRuleGroupResponse] = service.createFirewallRuleGroup(params).promise().toFuture
    @inline def createResolverEndpointFuture(params: CreateResolverEndpointRequest): Future[CreateResolverEndpointResponse] = service.createResolverEndpoint(params).promise().toFuture
    @inline def createResolverQueryLogConfigFuture(params: CreateResolverQueryLogConfigRequest): Future[CreateResolverQueryLogConfigResponse] = service.createResolverQueryLogConfig(params).promise().toFuture
    @inline def createResolverRuleFuture(params: CreateResolverRuleRequest): Future[CreateResolverRuleResponse] = service.createResolverRule(params).promise().toFuture
    @inline def deleteFirewallDomainListFuture(params: DeleteFirewallDomainListRequest): Future[DeleteFirewallDomainListResponse] = service.deleteFirewallDomainList(params).promise().toFuture
    @inline def deleteFirewallRuleFuture(params: DeleteFirewallRuleRequest): Future[DeleteFirewallRuleResponse] = service.deleteFirewallRule(params).promise().toFuture
    @inline def deleteFirewallRuleGroupFuture(params: DeleteFirewallRuleGroupRequest): Future[DeleteFirewallRuleGroupResponse] = service.deleteFirewallRuleGroup(params).promise().toFuture
    @inline def deleteResolverEndpointFuture(params: DeleteResolverEndpointRequest): Future[DeleteResolverEndpointResponse] = service.deleteResolverEndpoint(params).promise().toFuture
    @inline def deleteResolverQueryLogConfigFuture(params: DeleteResolverQueryLogConfigRequest): Future[DeleteResolverQueryLogConfigResponse] = service.deleteResolverQueryLogConfig(params).promise().toFuture
    @inline def deleteResolverRuleFuture(params: DeleteResolverRuleRequest): Future[DeleteResolverRuleResponse] = service.deleteResolverRule(params).promise().toFuture
    @inline def disassociateFirewallRuleGroupFuture(params: DisassociateFirewallRuleGroupRequest): Future[DisassociateFirewallRuleGroupResponse] = service.disassociateFirewallRuleGroup(params).promise().toFuture
    @inline def disassociateResolverEndpointIpAddressFuture(params: DisassociateResolverEndpointIpAddressRequest): Future[DisassociateResolverEndpointIpAddressResponse] = service.disassociateResolverEndpointIpAddress(params).promise().toFuture
    @inline def disassociateResolverQueryLogConfigFuture(params: DisassociateResolverQueryLogConfigRequest): Future[DisassociateResolverQueryLogConfigResponse] = service.disassociateResolverQueryLogConfig(params).promise().toFuture
    @inline def disassociateResolverRuleFuture(params: DisassociateResolverRuleRequest): Future[DisassociateResolverRuleResponse] = service.disassociateResolverRule(params).promise().toFuture
    @inline def getFirewallConfigFuture(params: GetFirewallConfigRequest): Future[GetFirewallConfigResponse] = service.getFirewallConfig(params).promise().toFuture
    @inline def getFirewallDomainListFuture(params: GetFirewallDomainListRequest): Future[GetFirewallDomainListResponse] = service.getFirewallDomainList(params).promise().toFuture
    @inline def getFirewallRuleGroupAssociationFuture(params: GetFirewallRuleGroupAssociationRequest): Future[GetFirewallRuleGroupAssociationResponse] = service.getFirewallRuleGroupAssociation(params).promise().toFuture
    @inline def getFirewallRuleGroupFuture(params: GetFirewallRuleGroupRequest): Future[GetFirewallRuleGroupResponse] = service.getFirewallRuleGroup(params).promise().toFuture
    @inline def getFirewallRuleGroupPolicyFuture(params: GetFirewallRuleGroupPolicyRequest): Future[GetFirewallRuleGroupPolicyResponse] = service.getFirewallRuleGroupPolicy(params).promise().toFuture
    @inline def getResolverConfigFuture(params: GetResolverConfigRequest): Future[GetResolverConfigResponse] = service.getResolverConfig(params).promise().toFuture
    @inline def getResolverDnssecConfigFuture(params: GetResolverDnssecConfigRequest): Future[GetResolverDnssecConfigResponse] = service.getResolverDnssecConfig(params).promise().toFuture
    @inline def getResolverEndpointFuture(params: GetResolverEndpointRequest): Future[GetResolverEndpointResponse] = service.getResolverEndpoint(params).promise().toFuture
    @inline def getResolverQueryLogConfigAssociationFuture(params: GetResolverQueryLogConfigAssociationRequest): Future[GetResolverQueryLogConfigAssociationResponse] = service.getResolverQueryLogConfigAssociation(params).promise().toFuture
    @inline def getResolverQueryLogConfigFuture(params: GetResolverQueryLogConfigRequest): Future[GetResolverQueryLogConfigResponse] = service.getResolverQueryLogConfig(params).promise().toFuture
    @inline def getResolverQueryLogConfigPolicyFuture(params: GetResolverQueryLogConfigPolicyRequest): Future[GetResolverQueryLogConfigPolicyResponse] = service.getResolverQueryLogConfigPolicy(params).promise().toFuture
    @inline def getResolverRuleAssociationFuture(params: GetResolverRuleAssociationRequest): Future[GetResolverRuleAssociationResponse] = service.getResolverRuleAssociation(params).promise().toFuture
    @inline def getResolverRuleFuture(params: GetResolverRuleRequest): Future[GetResolverRuleResponse] = service.getResolverRule(params).promise().toFuture
    @inline def getResolverRulePolicyFuture(params: GetResolverRulePolicyRequest): Future[GetResolverRulePolicyResponse] = service.getResolverRulePolicy(params).promise().toFuture
    @inline def importFirewallDomainsFuture(params: ImportFirewallDomainsRequest): Future[ImportFirewallDomainsResponse] = service.importFirewallDomains(params).promise().toFuture
    @inline def listFirewallConfigsFuture(params: ListFirewallConfigsRequest): Future[ListFirewallConfigsResponse] = service.listFirewallConfigs(params).promise().toFuture
    @inline def listFirewallDomainListsFuture(params: ListFirewallDomainListsRequest): Future[ListFirewallDomainListsResponse] = service.listFirewallDomainLists(params).promise().toFuture
    @inline def listFirewallDomainsFuture(params: ListFirewallDomainsRequest): Future[ListFirewallDomainsResponse] = service.listFirewallDomains(params).promise().toFuture
    @inline def listFirewallRuleGroupAssociationsFuture(params: ListFirewallRuleGroupAssociationsRequest): Future[ListFirewallRuleGroupAssociationsResponse] = service.listFirewallRuleGroupAssociations(params).promise().toFuture
    @inline def listFirewallRuleGroupsFuture(params: ListFirewallRuleGroupsRequest): Future[ListFirewallRuleGroupsResponse] = service.listFirewallRuleGroups(params).promise().toFuture
    @inline def listFirewallRulesFuture(params: ListFirewallRulesRequest): Future[ListFirewallRulesResponse] = service.listFirewallRules(params).promise().toFuture
    @inline def listResolverConfigsFuture(params: ListResolverConfigsRequest): Future[ListResolverConfigsResponse] = service.listResolverConfigs(params).promise().toFuture
    @inline def listResolverDnssecConfigsFuture(params: ListResolverDnssecConfigsRequest): Future[ListResolverDnssecConfigsResponse] = service.listResolverDnssecConfigs(params).promise().toFuture
    @inline def listResolverEndpointIpAddressesFuture(params: ListResolverEndpointIpAddressesRequest): Future[ListResolverEndpointIpAddressesResponse] = service.listResolverEndpointIpAddresses(params).promise().toFuture
    @inline def listResolverEndpointsFuture(params: ListResolverEndpointsRequest): Future[ListResolverEndpointsResponse] = service.listResolverEndpoints(params).promise().toFuture
    @inline def listResolverQueryLogConfigAssociationsFuture(params: ListResolverQueryLogConfigAssociationsRequest): Future[ListResolverQueryLogConfigAssociationsResponse] = service.listResolverQueryLogConfigAssociations(params).promise().toFuture
    @inline def listResolverQueryLogConfigsFuture(params: ListResolverQueryLogConfigsRequest): Future[ListResolverQueryLogConfigsResponse] = service.listResolverQueryLogConfigs(params).promise().toFuture
    @inline def listResolverRuleAssociationsFuture(params: ListResolverRuleAssociationsRequest): Future[ListResolverRuleAssociationsResponse] = service.listResolverRuleAssociations(params).promise().toFuture
    @inline def listResolverRulesFuture(params: ListResolverRulesRequest): Future[ListResolverRulesResponse] = service.listResolverRules(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putFirewallRuleGroupPolicyFuture(params: PutFirewallRuleGroupPolicyRequest): Future[PutFirewallRuleGroupPolicyResponse] = service.putFirewallRuleGroupPolicy(params).promise().toFuture
    @inline def putResolverQueryLogConfigPolicyFuture(params: PutResolverQueryLogConfigPolicyRequest): Future[PutResolverQueryLogConfigPolicyResponse] = service.putResolverQueryLogConfigPolicy(params).promise().toFuture
    @inline def putResolverRulePolicyFuture(params: PutResolverRulePolicyRequest): Future[PutResolverRulePolicyResponse] = service.putResolverRulePolicy(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateFirewallConfigFuture(params: UpdateFirewallConfigRequest): Future[UpdateFirewallConfigResponse] = service.updateFirewallConfig(params).promise().toFuture
    @inline def updateFirewallDomainsFuture(params: UpdateFirewallDomainsRequest): Future[UpdateFirewallDomainsResponse] = service.updateFirewallDomains(params).promise().toFuture
    @inline def updateFirewallRuleFuture(params: UpdateFirewallRuleRequest): Future[UpdateFirewallRuleResponse] = service.updateFirewallRule(params).promise().toFuture
    @inline def updateFirewallRuleGroupAssociationFuture(params: UpdateFirewallRuleGroupAssociationRequest): Future[UpdateFirewallRuleGroupAssociationResponse] = service.updateFirewallRuleGroupAssociation(params).promise().toFuture
    @inline def updateResolverConfigFuture(params: UpdateResolverConfigRequest): Future[UpdateResolverConfigResponse] = service.updateResolverConfig(params).promise().toFuture
    @inline def updateResolverDnssecConfigFuture(params: UpdateResolverDnssecConfigRequest): Future[UpdateResolverDnssecConfigResponse] = service.updateResolverDnssecConfig(params).promise().toFuture
    @inline def updateResolverEndpointFuture(params: UpdateResolverEndpointRequest): Future[UpdateResolverEndpointResponse] = service.updateResolverEndpoint(params).promise().toFuture
    @inline def updateResolverRuleFuture(params: UpdateResolverRuleRequest): Future[UpdateResolverRuleResponse] = service.updateResolverRule(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/route53resolver", JSImport.Namespace, "AWS.Route53Resolver")
  class Route53Resolver() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateFirewallRuleGroup(params: AssociateFirewallRuleGroupRequest): Request[AssociateFirewallRuleGroupResponse] = js.native
    def associateResolverEndpointIpAddress(params: AssociateResolverEndpointIpAddressRequest): Request[AssociateResolverEndpointIpAddressResponse] = js.native
    def associateResolverQueryLogConfig(params: AssociateResolverQueryLogConfigRequest): Request[AssociateResolverQueryLogConfigResponse] = js.native
    def associateResolverRule(params: AssociateResolverRuleRequest): Request[AssociateResolverRuleResponse] = js.native
    def createFirewallDomainList(params: CreateFirewallDomainListRequest): Request[CreateFirewallDomainListResponse] = js.native
    def createFirewallRule(params: CreateFirewallRuleRequest): Request[CreateFirewallRuleResponse] = js.native
    def createFirewallRuleGroup(params: CreateFirewallRuleGroupRequest): Request[CreateFirewallRuleGroupResponse] = js.native
    def createResolverEndpoint(params: CreateResolverEndpointRequest): Request[CreateResolverEndpointResponse] = js.native
    def createResolverQueryLogConfig(params: CreateResolverQueryLogConfigRequest): Request[CreateResolverQueryLogConfigResponse] = js.native
    def createResolverRule(params: CreateResolverRuleRequest): Request[CreateResolverRuleResponse] = js.native
    def deleteFirewallDomainList(params: DeleteFirewallDomainListRequest): Request[DeleteFirewallDomainListResponse] = js.native
    def deleteFirewallRule(params: DeleteFirewallRuleRequest): Request[DeleteFirewallRuleResponse] = js.native
    def deleteFirewallRuleGroup(params: DeleteFirewallRuleGroupRequest): Request[DeleteFirewallRuleGroupResponse] = js.native
    def deleteResolverEndpoint(params: DeleteResolverEndpointRequest): Request[DeleteResolverEndpointResponse] = js.native
    def deleteResolverQueryLogConfig(params: DeleteResolverQueryLogConfigRequest): Request[DeleteResolverQueryLogConfigResponse] = js.native
    def deleteResolverRule(params: DeleteResolverRuleRequest): Request[DeleteResolverRuleResponse] = js.native
    def disassociateFirewallRuleGroup(params: DisassociateFirewallRuleGroupRequest): Request[DisassociateFirewallRuleGroupResponse] = js.native
    def disassociateResolverEndpointIpAddress(params: DisassociateResolverEndpointIpAddressRequest): Request[DisassociateResolverEndpointIpAddressResponse] = js.native
    def disassociateResolverQueryLogConfig(params: DisassociateResolverQueryLogConfigRequest): Request[DisassociateResolverQueryLogConfigResponse] = js.native
    def disassociateResolverRule(params: DisassociateResolverRuleRequest): Request[DisassociateResolverRuleResponse] = js.native
    def getFirewallConfig(params: GetFirewallConfigRequest): Request[GetFirewallConfigResponse] = js.native
    def getFirewallDomainList(params: GetFirewallDomainListRequest): Request[GetFirewallDomainListResponse] = js.native
    def getFirewallRuleGroup(params: GetFirewallRuleGroupRequest): Request[GetFirewallRuleGroupResponse] = js.native
    def getFirewallRuleGroupAssociation(params: GetFirewallRuleGroupAssociationRequest): Request[GetFirewallRuleGroupAssociationResponse] = js.native
    def getFirewallRuleGroupPolicy(params: GetFirewallRuleGroupPolicyRequest): Request[GetFirewallRuleGroupPolicyResponse] = js.native
    def getResolverConfig(params: GetResolverConfigRequest): Request[GetResolverConfigResponse] = js.native
    def getResolverDnssecConfig(params: GetResolverDnssecConfigRequest): Request[GetResolverDnssecConfigResponse] = js.native
    def getResolverEndpoint(params: GetResolverEndpointRequest): Request[GetResolverEndpointResponse] = js.native
    def getResolverQueryLogConfig(params: GetResolverQueryLogConfigRequest): Request[GetResolverQueryLogConfigResponse] = js.native
    def getResolverQueryLogConfigAssociation(params: GetResolverQueryLogConfigAssociationRequest): Request[GetResolverQueryLogConfigAssociationResponse] = js.native
    def getResolverQueryLogConfigPolicy(params: GetResolverQueryLogConfigPolicyRequest): Request[GetResolverQueryLogConfigPolicyResponse] = js.native
    def getResolverRule(params: GetResolverRuleRequest): Request[GetResolverRuleResponse] = js.native
    def getResolverRuleAssociation(params: GetResolverRuleAssociationRequest): Request[GetResolverRuleAssociationResponse] = js.native
    def getResolverRulePolicy(params: GetResolverRulePolicyRequest): Request[GetResolverRulePolicyResponse] = js.native
    def importFirewallDomains(params: ImportFirewallDomainsRequest): Request[ImportFirewallDomainsResponse] = js.native
    def listFirewallConfigs(params: ListFirewallConfigsRequest): Request[ListFirewallConfigsResponse] = js.native
    def listFirewallDomainLists(params: ListFirewallDomainListsRequest): Request[ListFirewallDomainListsResponse] = js.native
    def listFirewallDomains(params: ListFirewallDomainsRequest): Request[ListFirewallDomainsResponse] = js.native
    def listFirewallRuleGroupAssociations(params: ListFirewallRuleGroupAssociationsRequest): Request[ListFirewallRuleGroupAssociationsResponse] = js.native
    def listFirewallRuleGroups(params: ListFirewallRuleGroupsRequest): Request[ListFirewallRuleGroupsResponse] = js.native
    def listFirewallRules(params: ListFirewallRulesRequest): Request[ListFirewallRulesResponse] = js.native
    def listResolverConfigs(params: ListResolverConfigsRequest): Request[ListResolverConfigsResponse] = js.native
    def listResolverDnssecConfigs(params: ListResolverDnssecConfigsRequest): Request[ListResolverDnssecConfigsResponse] = js.native
    def listResolverEndpointIpAddresses(params: ListResolverEndpointIpAddressesRequest): Request[ListResolverEndpointIpAddressesResponse] = js.native
    def listResolverEndpoints(params: ListResolverEndpointsRequest): Request[ListResolverEndpointsResponse] = js.native
    def listResolverQueryLogConfigAssociations(params: ListResolverQueryLogConfigAssociationsRequest): Request[ListResolverQueryLogConfigAssociationsResponse] = js.native
    def listResolverQueryLogConfigs(params: ListResolverQueryLogConfigsRequest): Request[ListResolverQueryLogConfigsResponse] = js.native
    def listResolverRuleAssociations(params: ListResolverRuleAssociationsRequest): Request[ListResolverRuleAssociationsResponse] = js.native
    def listResolverRules(params: ListResolverRulesRequest): Request[ListResolverRulesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putFirewallRuleGroupPolicy(params: PutFirewallRuleGroupPolicyRequest): Request[PutFirewallRuleGroupPolicyResponse] = js.native
    def putResolverQueryLogConfigPolicy(params: PutResolverQueryLogConfigPolicyRequest): Request[PutResolverQueryLogConfigPolicyResponse] = js.native
    def putResolverRulePolicy(params: PutResolverRulePolicyRequest): Request[PutResolverRulePolicyResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateFirewallConfig(params: UpdateFirewallConfigRequest): Request[UpdateFirewallConfigResponse] = js.native
    def updateFirewallDomains(params: UpdateFirewallDomainsRequest): Request[UpdateFirewallDomainsResponse] = js.native
    def updateFirewallRule(params: UpdateFirewallRuleRequest): Request[UpdateFirewallRuleResponse] = js.native
    def updateFirewallRuleGroupAssociation(params: UpdateFirewallRuleGroupAssociationRequest): Request[UpdateFirewallRuleGroupAssociationResponse] = js.native
    def updateResolverConfig(params: UpdateResolverConfigRequest): Request[UpdateResolverConfigResponse] = js.native
    def updateResolverDnssecConfig(params: UpdateResolverDnssecConfigRequest): Request[UpdateResolverDnssecConfigResponse] = js.native
    def updateResolverEndpoint(params: UpdateResolverEndpointRequest): Request[UpdateResolverEndpointResponse] = js.native
    def updateResolverRule(params: UpdateResolverRuleRequest): Request[UpdateResolverRuleResponse] = js.native
  }
  object Route53Resolver {
    @inline implicit def toOps(service: Route53Resolver): Route53ResolverOps = {
      new Route53ResolverOps(service)
    }
  }

  @js.native
  trait AssociateFirewallRuleGroupRequest extends js.Object {
    var CreatorRequestId: CreatorRequestId
    var FirewallRuleGroupId: ResourceId
    var Name: Name
    var Priority: Priority
    var VpcId: ResourceId
    var MutationProtection: js.UndefOr[MutationProtectionStatus]
    var Tags: js.UndefOr[TagList]
  }

  object AssociateFirewallRuleGroupRequest {
    @inline
    def apply(
        CreatorRequestId: CreatorRequestId,
        FirewallRuleGroupId: ResourceId,
        Name: Name,
        Priority: Priority,
        VpcId: ResourceId,
        MutationProtection: js.UndefOr[MutationProtectionStatus] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): AssociateFirewallRuleGroupRequest = {
      val __obj = js.Dynamic.literal(
        "CreatorRequestId" -> CreatorRequestId.asInstanceOf[js.Any],
        "FirewallRuleGroupId" -> FirewallRuleGroupId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Priority" -> Priority.asInstanceOf[js.Any],
        "VpcId" -> VpcId.asInstanceOf[js.Any]
      )

      MutationProtection.foreach(__v => __obj.updateDynamic("MutationProtection")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateFirewallRuleGroupRequest]
    }
  }

  @js.native
  trait AssociateFirewallRuleGroupResponse extends js.Object {
    var FirewallRuleGroupAssociation: js.UndefOr[FirewallRuleGroupAssociation]
  }

  object AssociateFirewallRuleGroupResponse {
    @inline
    def apply(
        FirewallRuleGroupAssociation: js.UndefOr[FirewallRuleGroupAssociation] = js.undefined
    ): AssociateFirewallRuleGroupResponse = {
      val __obj = js.Dynamic.literal()
      FirewallRuleGroupAssociation.foreach(__v => __obj.updateDynamic("FirewallRuleGroupAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateFirewallRuleGroupResponse]
    }
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
  trait AssociateResolverQueryLogConfigRequest extends js.Object {
    var ResolverQueryLogConfigId: ResourceId
    var ResourceId: ResourceId
  }

  object AssociateResolverQueryLogConfigRequest {
    @inline
    def apply(
        ResolverQueryLogConfigId: ResourceId,
        ResourceId: ResourceId
    ): AssociateResolverQueryLogConfigRequest = {
      val __obj = js.Dynamic.literal(
        "ResolverQueryLogConfigId" -> ResolverQueryLogConfigId.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateResolverQueryLogConfigRequest]
    }
  }

  @js.native
  trait AssociateResolverQueryLogConfigResponse extends js.Object {
    var ResolverQueryLogConfigAssociation: js.UndefOr[ResolverQueryLogConfigAssociation]
  }

  object AssociateResolverQueryLogConfigResponse {
    @inline
    def apply(
        ResolverQueryLogConfigAssociation: js.UndefOr[ResolverQueryLogConfigAssociation] = js.undefined
    ): AssociateResolverQueryLogConfigResponse = {
      val __obj = js.Dynamic.literal()
      ResolverQueryLogConfigAssociation.foreach(__v => __obj.updateDynamic("ResolverQueryLogConfigAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateResolverQueryLogConfigResponse]
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
  trait CreateFirewallDomainListRequest extends js.Object {
    var CreatorRequestId: CreatorRequestId
    var Name: Name
    var Tags: js.UndefOr[TagList]
  }

  object CreateFirewallDomainListRequest {
    @inline
    def apply(
        CreatorRequestId: CreatorRequestId,
        Name: Name,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateFirewallDomainListRequest = {
      val __obj = js.Dynamic.literal(
        "CreatorRequestId" -> CreatorRequestId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFirewallDomainListRequest]
    }
  }

  @js.native
  trait CreateFirewallDomainListResponse extends js.Object {
    var FirewallDomainList: js.UndefOr[FirewallDomainList]
  }

  object CreateFirewallDomainListResponse {
    @inline
    def apply(
        FirewallDomainList: js.UndefOr[FirewallDomainList] = js.undefined
    ): CreateFirewallDomainListResponse = {
      val __obj = js.Dynamic.literal()
      FirewallDomainList.foreach(__v => __obj.updateDynamic("FirewallDomainList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFirewallDomainListResponse]
    }
  }

  @js.native
  trait CreateFirewallRuleGroupRequest extends js.Object {
    var CreatorRequestId: CreatorRequestId
    var Name: Name
    var Tags: js.UndefOr[TagList]
  }

  object CreateFirewallRuleGroupRequest {
    @inline
    def apply(
        CreatorRequestId: CreatorRequestId,
        Name: Name,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateFirewallRuleGroupRequest = {
      val __obj = js.Dynamic.literal(
        "CreatorRequestId" -> CreatorRequestId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFirewallRuleGroupRequest]
    }
  }

  @js.native
  trait CreateFirewallRuleGroupResponse extends js.Object {
    var FirewallRuleGroup: js.UndefOr[FirewallRuleGroup]
  }

  object CreateFirewallRuleGroupResponse {
    @inline
    def apply(
        FirewallRuleGroup: js.UndefOr[FirewallRuleGroup] = js.undefined
    ): CreateFirewallRuleGroupResponse = {
      val __obj = js.Dynamic.literal()
      FirewallRuleGroup.foreach(__v => __obj.updateDynamic("FirewallRuleGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFirewallRuleGroupResponse]
    }
  }

  @js.native
  trait CreateFirewallRuleRequest extends js.Object {
    var Action: Action
    var CreatorRequestId: CreatorRequestId
    var FirewallDomainListId: ResourceId
    var FirewallRuleGroupId: ResourceId
    var Name: Name
    var Priority: Priority
    var BlockOverrideDnsType: js.UndefOr[BlockOverrideDnsType]
    var BlockOverrideDomain: js.UndefOr[BlockOverrideDomain]
    var BlockOverrideTtl: js.UndefOr[BlockOverrideTtl]
    var BlockResponse: js.UndefOr[BlockResponse]
  }

  object CreateFirewallRuleRequest {
    @inline
    def apply(
        Action: Action,
        CreatorRequestId: CreatorRequestId,
        FirewallDomainListId: ResourceId,
        FirewallRuleGroupId: ResourceId,
        Name: Name,
        Priority: Priority,
        BlockOverrideDnsType: js.UndefOr[BlockOverrideDnsType] = js.undefined,
        BlockOverrideDomain: js.UndefOr[BlockOverrideDomain] = js.undefined,
        BlockOverrideTtl: js.UndefOr[BlockOverrideTtl] = js.undefined,
        BlockResponse: js.UndefOr[BlockResponse] = js.undefined
    ): CreateFirewallRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "CreatorRequestId" -> CreatorRequestId.asInstanceOf[js.Any],
        "FirewallDomainListId" -> FirewallDomainListId.asInstanceOf[js.Any],
        "FirewallRuleGroupId" -> FirewallRuleGroupId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Priority" -> Priority.asInstanceOf[js.Any]
      )

      BlockOverrideDnsType.foreach(__v => __obj.updateDynamic("BlockOverrideDnsType")(__v.asInstanceOf[js.Any]))
      BlockOverrideDomain.foreach(__v => __obj.updateDynamic("BlockOverrideDomain")(__v.asInstanceOf[js.Any]))
      BlockOverrideTtl.foreach(__v => __obj.updateDynamic("BlockOverrideTtl")(__v.asInstanceOf[js.Any]))
      BlockResponse.foreach(__v => __obj.updateDynamic("BlockResponse")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFirewallRuleRequest]
    }
  }

  @js.native
  trait CreateFirewallRuleResponse extends js.Object {
    var FirewallRule: js.UndefOr[FirewallRule]
  }

  object CreateFirewallRuleResponse {
    @inline
    def apply(
        FirewallRule: js.UndefOr[FirewallRule] = js.undefined
    ): CreateFirewallRuleResponse = {
      val __obj = js.Dynamic.literal()
      FirewallRule.foreach(__v => __obj.updateDynamic("FirewallRule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFirewallRuleResponse]
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
  trait CreateResolverQueryLogConfigRequest extends js.Object {
    var CreatorRequestId: CreatorRequestId
    var DestinationArn: DestinationArn
    var Name: ResolverQueryLogConfigName
    var Tags: js.UndefOr[TagList]
  }

  object CreateResolverQueryLogConfigRequest {
    @inline
    def apply(
        CreatorRequestId: CreatorRequestId,
        DestinationArn: DestinationArn,
        Name: ResolverQueryLogConfigName,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateResolverQueryLogConfigRequest = {
      val __obj = js.Dynamic.literal(
        "CreatorRequestId" -> CreatorRequestId.asInstanceOf[js.Any],
        "DestinationArn" -> DestinationArn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResolverQueryLogConfigRequest]
    }
  }

  @js.native
  trait CreateResolverQueryLogConfigResponse extends js.Object {
    var ResolverQueryLogConfig: js.UndefOr[ResolverQueryLogConfig]
  }

  object CreateResolverQueryLogConfigResponse {
    @inline
    def apply(
        ResolverQueryLogConfig: js.UndefOr[ResolverQueryLogConfig] = js.undefined
    ): CreateResolverQueryLogConfigResponse = {
      val __obj = js.Dynamic.literal()
      ResolverQueryLogConfig.foreach(__v => __obj.updateDynamic("ResolverQueryLogConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResolverQueryLogConfigResponse]
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
  trait DeleteFirewallDomainListRequest extends js.Object {
    var FirewallDomainListId: ResourceId
  }

  object DeleteFirewallDomainListRequest {
    @inline
    def apply(
        FirewallDomainListId: ResourceId
    ): DeleteFirewallDomainListRequest = {
      val __obj = js.Dynamic.literal(
        "FirewallDomainListId" -> FirewallDomainListId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFirewallDomainListRequest]
    }
  }

  @js.native
  trait DeleteFirewallDomainListResponse extends js.Object {
    var FirewallDomainList: js.UndefOr[FirewallDomainList]
  }

  object DeleteFirewallDomainListResponse {
    @inline
    def apply(
        FirewallDomainList: js.UndefOr[FirewallDomainList] = js.undefined
    ): DeleteFirewallDomainListResponse = {
      val __obj = js.Dynamic.literal()
      FirewallDomainList.foreach(__v => __obj.updateDynamic("FirewallDomainList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFirewallDomainListResponse]
    }
  }

  @js.native
  trait DeleteFirewallRuleGroupRequest extends js.Object {
    var FirewallRuleGroupId: ResourceId
  }

  object DeleteFirewallRuleGroupRequest {
    @inline
    def apply(
        FirewallRuleGroupId: ResourceId
    ): DeleteFirewallRuleGroupRequest = {
      val __obj = js.Dynamic.literal(
        "FirewallRuleGroupId" -> FirewallRuleGroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFirewallRuleGroupRequest]
    }
  }

  @js.native
  trait DeleteFirewallRuleGroupResponse extends js.Object {
    var FirewallRuleGroup: js.UndefOr[FirewallRuleGroup]
  }

  object DeleteFirewallRuleGroupResponse {
    @inline
    def apply(
        FirewallRuleGroup: js.UndefOr[FirewallRuleGroup] = js.undefined
    ): DeleteFirewallRuleGroupResponse = {
      val __obj = js.Dynamic.literal()
      FirewallRuleGroup.foreach(__v => __obj.updateDynamic("FirewallRuleGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFirewallRuleGroupResponse]
    }
  }

  @js.native
  trait DeleteFirewallRuleRequest extends js.Object {
    var FirewallDomainListId: ResourceId
    var FirewallRuleGroupId: ResourceId
  }

  object DeleteFirewallRuleRequest {
    @inline
    def apply(
        FirewallDomainListId: ResourceId,
        FirewallRuleGroupId: ResourceId
    ): DeleteFirewallRuleRequest = {
      val __obj = js.Dynamic.literal(
        "FirewallDomainListId" -> FirewallDomainListId.asInstanceOf[js.Any],
        "FirewallRuleGroupId" -> FirewallRuleGroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFirewallRuleRequest]
    }
  }

  @js.native
  trait DeleteFirewallRuleResponse extends js.Object {
    var FirewallRule: js.UndefOr[FirewallRule]
  }

  object DeleteFirewallRuleResponse {
    @inline
    def apply(
        FirewallRule: js.UndefOr[FirewallRule] = js.undefined
    ): DeleteFirewallRuleResponse = {
      val __obj = js.Dynamic.literal()
      FirewallRule.foreach(__v => __obj.updateDynamic("FirewallRule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFirewallRuleResponse]
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
  trait DeleteResolverQueryLogConfigRequest extends js.Object {
    var ResolverQueryLogConfigId: ResourceId
  }

  object DeleteResolverQueryLogConfigRequest {
    @inline
    def apply(
        ResolverQueryLogConfigId: ResourceId
    ): DeleteResolverQueryLogConfigRequest = {
      val __obj = js.Dynamic.literal(
        "ResolverQueryLogConfigId" -> ResolverQueryLogConfigId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteResolverQueryLogConfigRequest]
    }
  }

  @js.native
  trait DeleteResolverQueryLogConfigResponse extends js.Object {
    var ResolverQueryLogConfig: js.UndefOr[ResolverQueryLogConfig]
  }

  object DeleteResolverQueryLogConfigResponse {
    @inline
    def apply(
        ResolverQueryLogConfig: js.UndefOr[ResolverQueryLogConfig] = js.undefined
    ): DeleteResolverQueryLogConfigResponse = {
      val __obj = js.Dynamic.literal()
      ResolverQueryLogConfig.foreach(__v => __obj.updateDynamic("ResolverQueryLogConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteResolverQueryLogConfigResponse]
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
  trait DisassociateFirewallRuleGroupRequest extends js.Object {
    var FirewallRuleGroupAssociationId: ResourceId
  }

  object DisassociateFirewallRuleGroupRequest {
    @inline
    def apply(
        FirewallRuleGroupAssociationId: ResourceId
    ): DisassociateFirewallRuleGroupRequest = {
      val __obj = js.Dynamic.literal(
        "FirewallRuleGroupAssociationId" -> FirewallRuleGroupAssociationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateFirewallRuleGroupRequest]
    }
  }

  @js.native
  trait DisassociateFirewallRuleGroupResponse extends js.Object {
    var FirewallRuleGroupAssociation: js.UndefOr[FirewallRuleGroupAssociation]
  }

  object DisassociateFirewallRuleGroupResponse {
    @inline
    def apply(
        FirewallRuleGroupAssociation: js.UndefOr[FirewallRuleGroupAssociation] = js.undefined
    ): DisassociateFirewallRuleGroupResponse = {
      val __obj = js.Dynamic.literal()
      FirewallRuleGroupAssociation.foreach(__v => __obj.updateDynamic("FirewallRuleGroupAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateFirewallRuleGroupResponse]
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
  trait DisassociateResolverQueryLogConfigRequest extends js.Object {
    var ResolverQueryLogConfigId: ResourceId
    var ResourceId: ResourceId
  }

  object DisassociateResolverQueryLogConfigRequest {
    @inline
    def apply(
        ResolverQueryLogConfigId: ResourceId,
        ResourceId: ResourceId
    ): DisassociateResolverQueryLogConfigRequest = {
      val __obj = js.Dynamic.literal(
        "ResolverQueryLogConfigId" -> ResolverQueryLogConfigId.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateResolverQueryLogConfigRequest]
    }
  }

  @js.native
  trait DisassociateResolverQueryLogConfigResponse extends js.Object {
    var ResolverQueryLogConfigAssociation: js.UndefOr[ResolverQueryLogConfigAssociation]
  }

  object DisassociateResolverQueryLogConfigResponse {
    @inline
    def apply(
        ResolverQueryLogConfigAssociation: js.UndefOr[ResolverQueryLogConfigAssociation] = js.undefined
    ): DisassociateResolverQueryLogConfigResponse = {
      val __obj = js.Dynamic.literal()
      ResolverQueryLogConfigAssociation.foreach(__v => __obj.updateDynamic("ResolverQueryLogConfigAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateResolverQueryLogConfigResponse]
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

  /** For Resolver list operations ([[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverEndpoints.html|ListResolverEndpoints]], [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverRules.html|ListResolverRules]], [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverRuleAssociations.html|ListResolverRuleAssociations]], [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigs.html|ListResolverQueryLogConfigs]], [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigAssociations.html|ListResolverQueryLogConfigAssociations]]), and [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverDnssecConfigs.html|ListResolverDnssecConfigs]]), an optional specification to return a subset of objects. To filter objects, such as Resolver endpoints or Resolver
    * rules, you specify <code>Name</code> and <code>Values</code>. For example, to list only inbound Resolver endpoints, specify <code>Direction</code> for <code>Name</code> and specify <code>INBOUND</code> for <code>Values</code>.
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

  /** Configuration of the firewall behavior provided by DNS Firewall for a single VPC from Amazon Virtual Private Cloud (Amazon VPC).
    */
  @js.native
  trait FirewallConfig extends js.Object {
    var FirewallFailOpen: js.UndefOr[FirewallFailOpenStatus]
    var Id: js.UndefOr[ResourceId]
    var OwnerId: js.UndefOr[AccountId]
    var ResourceId: js.UndefOr[ResourceId]
  }

  object FirewallConfig {
    @inline
    def apply(
        FirewallFailOpen: js.UndefOr[FirewallFailOpenStatus] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined,
        OwnerId: js.UndefOr[AccountId] = js.undefined,
        ResourceId: js.UndefOr[ResourceId] = js.undefined
    ): FirewallConfig = {
      val __obj = js.Dynamic.literal()
      FirewallFailOpen.foreach(__v => __obj.updateDynamic("FirewallFailOpen")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FirewallConfig]
    }
  }

  /** High-level information about a list of firewall domains for use in a <a>FirewallRule</a>. This is returned by <a>GetFirewallDomainList</a>. To retrieve the domains that are defined for this domain list, call <a>ListFirewallDomains</a>.
    */
  @js.native
  trait FirewallDomainList extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationTime: js.UndefOr[Rfc3339TimeString]
    var CreatorRequestId: js.UndefOr[CreatorRequestId]
    var DomainCount: js.UndefOr[Unsigned]
    var Id: js.UndefOr[ResourceId]
    var ManagedOwnerName: js.UndefOr[ServicePrinciple]
    var ModificationTime: js.UndefOr[Rfc3339TimeString]
    var Name: js.UndefOr[Name]
    var Status: js.UndefOr[FirewallDomainListStatus]
    var StatusMessage: js.UndefOr[StatusMessage]
  }

  object FirewallDomainList {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreationTime: js.UndefOr[Rfc3339TimeString] = js.undefined,
        CreatorRequestId: js.UndefOr[CreatorRequestId] = js.undefined,
        DomainCount: js.UndefOr[Unsigned] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined,
        ManagedOwnerName: js.UndefOr[ServicePrinciple] = js.undefined,
        ModificationTime: js.UndefOr[Rfc3339TimeString] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Status: js.UndefOr[FirewallDomainListStatus] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined
    ): FirewallDomainList = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.updateDynamic("CreatorRequestId")(__v.asInstanceOf[js.Any]))
      DomainCount.foreach(__v => __obj.updateDynamic("DomainCount")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      ManagedOwnerName.foreach(__v => __obj.updateDynamic("ManagedOwnerName")(__v.asInstanceOf[js.Any]))
      ModificationTime.foreach(__v => __obj.updateDynamic("ModificationTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FirewallDomainList]
    }
  }

  /** Minimal high-level information for a firewall domain list. The action <a>ListFirewallDomainLists</a> returns an array of these objects. To retrieve full information for a firewall domain list, call <a>GetFirewallDomainList</a> and <a>ListFirewallDomains</a>.
    */
  @js.native
  trait FirewallDomainListMetadata extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatorRequestId: js.UndefOr[CreatorRequestId]
    var Id: js.UndefOr[ResourceId]
    var ManagedOwnerName: js.UndefOr[ServicePrinciple]
    var Name: js.UndefOr[Name]
  }

  object FirewallDomainListMetadata {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatorRequestId: js.UndefOr[CreatorRequestId] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined,
        ManagedOwnerName: js.UndefOr[ServicePrinciple] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined
    ): FirewallDomainListMetadata = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.updateDynamic("CreatorRequestId")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      ManagedOwnerName.foreach(__v => __obj.updateDynamic("ManagedOwnerName")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FirewallDomainListMetadata]
    }
  }

  /** A single firewall rule in a rule group.
    */
  @js.native
  trait FirewallRule extends js.Object {
    var Action: js.UndefOr[Action]
    var BlockOverrideDnsType: js.UndefOr[BlockOverrideDnsType]
    var BlockOverrideDomain: js.UndefOr[BlockOverrideDomain]
    var BlockOverrideTtl: js.UndefOr[Unsigned]
    var BlockResponse: js.UndefOr[BlockResponse]
    var CreationTime: js.UndefOr[Rfc3339TimeString]
    var CreatorRequestId: js.UndefOr[CreatorRequestId]
    var FirewallDomainListId: js.UndefOr[ResourceId]
    var FirewallRuleGroupId: js.UndefOr[ResourceId]
    var ModificationTime: js.UndefOr[Rfc3339TimeString]
    var Name: js.UndefOr[Name]
    var Priority: js.UndefOr[Priority]
  }

  object FirewallRule {
    @inline
    def apply(
        Action: js.UndefOr[Action] = js.undefined,
        BlockOverrideDnsType: js.UndefOr[BlockOverrideDnsType] = js.undefined,
        BlockOverrideDomain: js.UndefOr[BlockOverrideDomain] = js.undefined,
        BlockOverrideTtl: js.UndefOr[Unsigned] = js.undefined,
        BlockResponse: js.UndefOr[BlockResponse] = js.undefined,
        CreationTime: js.UndefOr[Rfc3339TimeString] = js.undefined,
        CreatorRequestId: js.UndefOr[CreatorRequestId] = js.undefined,
        FirewallDomainListId: js.UndefOr[ResourceId] = js.undefined,
        FirewallRuleGroupId: js.UndefOr[ResourceId] = js.undefined,
        ModificationTime: js.UndefOr[Rfc3339TimeString] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Priority: js.UndefOr[Priority] = js.undefined
    ): FirewallRule = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      BlockOverrideDnsType.foreach(__v => __obj.updateDynamic("BlockOverrideDnsType")(__v.asInstanceOf[js.Any]))
      BlockOverrideDomain.foreach(__v => __obj.updateDynamic("BlockOverrideDomain")(__v.asInstanceOf[js.Any]))
      BlockOverrideTtl.foreach(__v => __obj.updateDynamic("BlockOverrideTtl")(__v.asInstanceOf[js.Any]))
      BlockResponse.foreach(__v => __obj.updateDynamic("BlockResponse")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.updateDynamic("CreatorRequestId")(__v.asInstanceOf[js.Any]))
      FirewallDomainListId.foreach(__v => __obj.updateDynamic("FirewallDomainListId")(__v.asInstanceOf[js.Any]))
      FirewallRuleGroupId.foreach(__v => __obj.updateDynamic("FirewallRuleGroupId")(__v.asInstanceOf[js.Any]))
      ModificationTime.foreach(__v => __obj.updateDynamic("ModificationTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FirewallRule]
    }
  }

  /** High-level information for a firewall rule group. A firewall rule group is a collection of rules that DNS Firewall uses to filter DNS network traffic for a VPC. To retrieve the rules for the rule group, call <a>ListFirewallRules</a>.
    */
  @js.native
  trait FirewallRuleGroup extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationTime: js.UndefOr[Rfc3339TimeString]
    var CreatorRequestId: js.UndefOr[CreatorRequestId]
    var Id: js.UndefOr[ResourceId]
    var ModificationTime: js.UndefOr[Rfc3339TimeString]
    var Name: js.UndefOr[Name]
    var OwnerId: js.UndefOr[AccountId]
    var RuleCount: js.UndefOr[Unsigned]
    var ShareStatus: js.UndefOr[ShareStatus]
    var Status: js.UndefOr[FirewallRuleGroupStatus]
    var StatusMessage: js.UndefOr[StatusMessage]
  }

  object FirewallRuleGroup {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreationTime: js.UndefOr[Rfc3339TimeString] = js.undefined,
        CreatorRequestId: js.UndefOr[CreatorRequestId] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined,
        ModificationTime: js.UndefOr[Rfc3339TimeString] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        OwnerId: js.UndefOr[AccountId] = js.undefined,
        RuleCount: js.UndefOr[Unsigned] = js.undefined,
        ShareStatus: js.UndefOr[ShareStatus] = js.undefined,
        Status: js.UndefOr[FirewallRuleGroupStatus] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined
    ): FirewallRuleGroup = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.updateDynamic("CreatorRequestId")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      ModificationTime.foreach(__v => __obj.updateDynamic("ModificationTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      RuleCount.foreach(__v => __obj.updateDynamic("RuleCount")(__v.asInstanceOf[js.Any]))
      ShareStatus.foreach(__v => __obj.updateDynamic("ShareStatus")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FirewallRuleGroup]
    }
  }

  /** An association between a firewall rule group and a VPC, which enables DNS filtering for the VPC.
    */
  @js.native
  trait FirewallRuleGroupAssociation extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationTime: js.UndefOr[Rfc3339TimeString]
    var CreatorRequestId: js.UndefOr[CreatorRequestId]
    var FirewallRuleGroupId: js.UndefOr[ResourceId]
    var Id: js.UndefOr[ResourceId]
    var ManagedOwnerName: js.UndefOr[ServicePrinciple]
    var ModificationTime: js.UndefOr[Rfc3339TimeString]
    var MutationProtection: js.UndefOr[MutationProtectionStatus]
    var Name: js.UndefOr[Name]
    var Priority: js.UndefOr[Priority]
    var Status: js.UndefOr[FirewallRuleGroupAssociationStatus]
    var StatusMessage: js.UndefOr[StatusMessage]
    var VpcId: js.UndefOr[ResourceId]
  }

  object FirewallRuleGroupAssociation {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreationTime: js.UndefOr[Rfc3339TimeString] = js.undefined,
        CreatorRequestId: js.UndefOr[CreatorRequestId] = js.undefined,
        FirewallRuleGroupId: js.UndefOr[ResourceId] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined,
        ManagedOwnerName: js.UndefOr[ServicePrinciple] = js.undefined,
        ModificationTime: js.UndefOr[Rfc3339TimeString] = js.undefined,
        MutationProtection: js.UndefOr[MutationProtectionStatus] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Priority: js.UndefOr[Priority] = js.undefined,
        Status: js.UndefOr[FirewallRuleGroupAssociationStatus] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        VpcId: js.UndefOr[ResourceId] = js.undefined
    ): FirewallRuleGroupAssociation = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.updateDynamic("CreatorRequestId")(__v.asInstanceOf[js.Any]))
      FirewallRuleGroupId.foreach(__v => __obj.updateDynamic("FirewallRuleGroupId")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      ManagedOwnerName.foreach(__v => __obj.updateDynamic("ManagedOwnerName")(__v.asInstanceOf[js.Any]))
      ModificationTime.foreach(__v => __obj.updateDynamic("ModificationTime")(__v.asInstanceOf[js.Any]))
      MutationProtection.foreach(__v => __obj.updateDynamic("MutationProtection")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FirewallRuleGroupAssociation]
    }
  }

  /** Minimal high-level information for a firewall rule group. The action <a>ListFirewallRuleGroups</a> returns an array of these objects. To retrieve full information for a firewall rule group, call <a>GetFirewallRuleGroup</a> and <a>ListFirewallRules</a>.
    */
  @js.native
  trait FirewallRuleGroupMetadata extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatorRequestId: js.UndefOr[CreatorRequestId]
    var Id: js.UndefOr[ResourceId]
    var Name: js.UndefOr[Name]
    var OwnerId: js.UndefOr[AccountId]
    var ShareStatus: js.UndefOr[ShareStatus]
  }

  object FirewallRuleGroupMetadata {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatorRequestId: js.UndefOr[CreatorRequestId] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        OwnerId: js.UndefOr[AccountId] = js.undefined,
        ShareStatus: js.UndefOr[ShareStatus] = js.undefined
    ): FirewallRuleGroupMetadata = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.updateDynamic("CreatorRequestId")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      ShareStatus.foreach(__v => __obj.updateDynamic("ShareStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FirewallRuleGroupMetadata]
    }
  }

  @js.native
  trait GetFirewallConfigRequest extends js.Object {
    var ResourceId: ResourceId
  }

  object GetFirewallConfigRequest {
    @inline
    def apply(
        ResourceId: ResourceId
    ): GetFirewallConfigRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetFirewallConfigRequest]
    }
  }

  @js.native
  trait GetFirewallConfigResponse extends js.Object {
    var FirewallConfig: js.UndefOr[FirewallConfig]
  }

  object GetFirewallConfigResponse {
    @inline
    def apply(
        FirewallConfig: js.UndefOr[FirewallConfig] = js.undefined
    ): GetFirewallConfigResponse = {
      val __obj = js.Dynamic.literal()
      FirewallConfig.foreach(__v => __obj.updateDynamic("FirewallConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFirewallConfigResponse]
    }
  }

  @js.native
  trait GetFirewallDomainListRequest extends js.Object {
    var FirewallDomainListId: ResourceId
  }

  object GetFirewallDomainListRequest {
    @inline
    def apply(
        FirewallDomainListId: ResourceId
    ): GetFirewallDomainListRequest = {
      val __obj = js.Dynamic.literal(
        "FirewallDomainListId" -> FirewallDomainListId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetFirewallDomainListRequest]
    }
  }

  @js.native
  trait GetFirewallDomainListResponse extends js.Object {
    var FirewallDomainList: js.UndefOr[FirewallDomainList]
  }

  object GetFirewallDomainListResponse {
    @inline
    def apply(
        FirewallDomainList: js.UndefOr[FirewallDomainList] = js.undefined
    ): GetFirewallDomainListResponse = {
      val __obj = js.Dynamic.literal()
      FirewallDomainList.foreach(__v => __obj.updateDynamic("FirewallDomainList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFirewallDomainListResponse]
    }
  }

  @js.native
  trait GetFirewallRuleGroupAssociationRequest extends js.Object {
    var FirewallRuleGroupAssociationId: ResourceId
  }

  object GetFirewallRuleGroupAssociationRequest {
    @inline
    def apply(
        FirewallRuleGroupAssociationId: ResourceId
    ): GetFirewallRuleGroupAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "FirewallRuleGroupAssociationId" -> FirewallRuleGroupAssociationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetFirewallRuleGroupAssociationRequest]
    }
  }

  @js.native
  trait GetFirewallRuleGroupAssociationResponse extends js.Object {
    var FirewallRuleGroupAssociation: js.UndefOr[FirewallRuleGroupAssociation]
  }

  object GetFirewallRuleGroupAssociationResponse {
    @inline
    def apply(
        FirewallRuleGroupAssociation: js.UndefOr[FirewallRuleGroupAssociation] = js.undefined
    ): GetFirewallRuleGroupAssociationResponse = {
      val __obj = js.Dynamic.literal()
      FirewallRuleGroupAssociation.foreach(__v => __obj.updateDynamic("FirewallRuleGroupAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFirewallRuleGroupAssociationResponse]
    }
  }

  @js.native
  trait GetFirewallRuleGroupPolicyRequest extends js.Object {
    var Arn: Arn
  }

  object GetFirewallRuleGroupPolicyRequest {
    @inline
    def apply(
        Arn: Arn
    ): GetFirewallRuleGroupPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetFirewallRuleGroupPolicyRequest]
    }
  }

  @js.native
  trait GetFirewallRuleGroupPolicyResponse extends js.Object {
    var FirewallRuleGroupPolicy: js.UndefOr[FirewallRuleGroupPolicy]
  }

  object GetFirewallRuleGroupPolicyResponse {
    @inline
    def apply(
        FirewallRuleGroupPolicy: js.UndefOr[FirewallRuleGroupPolicy] = js.undefined
    ): GetFirewallRuleGroupPolicyResponse = {
      val __obj = js.Dynamic.literal()
      FirewallRuleGroupPolicy.foreach(__v => __obj.updateDynamic("FirewallRuleGroupPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFirewallRuleGroupPolicyResponse]
    }
  }

  @js.native
  trait GetFirewallRuleGroupRequest extends js.Object {
    var FirewallRuleGroupId: ResourceId
  }

  object GetFirewallRuleGroupRequest {
    @inline
    def apply(
        FirewallRuleGroupId: ResourceId
    ): GetFirewallRuleGroupRequest = {
      val __obj = js.Dynamic.literal(
        "FirewallRuleGroupId" -> FirewallRuleGroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetFirewallRuleGroupRequest]
    }
  }

  @js.native
  trait GetFirewallRuleGroupResponse extends js.Object {
    var FirewallRuleGroup: js.UndefOr[FirewallRuleGroup]
  }

  object GetFirewallRuleGroupResponse {
    @inline
    def apply(
        FirewallRuleGroup: js.UndefOr[FirewallRuleGroup] = js.undefined
    ): GetFirewallRuleGroupResponse = {
      val __obj = js.Dynamic.literal()
      FirewallRuleGroup.foreach(__v => __obj.updateDynamic("FirewallRuleGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFirewallRuleGroupResponse]
    }
  }

  @js.native
  trait GetResolverConfigRequest extends js.Object {
    var ResourceId: ResourceId
  }

  object GetResolverConfigRequest {
    @inline
    def apply(
        ResourceId: ResourceId
    ): GetResolverConfigRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetResolverConfigRequest]
    }
  }

  @js.native
  trait GetResolverConfigResponse extends js.Object {
    var ResolverConfig: js.UndefOr[ResolverConfig]
  }

  object GetResolverConfigResponse {
    @inline
    def apply(
        ResolverConfig: js.UndefOr[ResolverConfig] = js.undefined
    ): GetResolverConfigResponse = {
      val __obj = js.Dynamic.literal()
      ResolverConfig.foreach(__v => __obj.updateDynamic("ResolverConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResolverConfigResponse]
    }
  }

  @js.native
  trait GetResolverDnssecConfigRequest extends js.Object {
    var ResourceId: ResourceId
  }

  object GetResolverDnssecConfigRequest {
    @inline
    def apply(
        ResourceId: ResourceId
    ): GetResolverDnssecConfigRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetResolverDnssecConfigRequest]
    }
  }

  @js.native
  trait GetResolverDnssecConfigResponse extends js.Object {
    var ResolverDNSSECConfig: js.UndefOr[ResolverDnssecConfig]
  }

  object GetResolverDnssecConfigResponse {
    @inline
    def apply(
        ResolverDNSSECConfig: js.UndefOr[ResolverDnssecConfig] = js.undefined
    ): GetResolverDnssecConfigResponse = {
      val __obj = js.Dynamic.literal()
      ResolverDNSSECConfig.foreach(__v => __obj.updateDynamic("ResolverDNSSECConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResolverDnssecConfigResponse]
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
  trait GetResolverQueryLogConfigAssociationRequest extends js.Object {
    var ResolverQueryLogConfigAssociationId: ResourceId
  }

  object GetResolverQueryLogConfigAssociationRequest {
    @inline
    def apply(
        ResolverQueryLogConfigAssociationId: ResourceId
    ): GetResolverQueryLogConfigAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "ResolverQueryLogConfigAssociationId" -> ResolverQueryLogConfigAssociationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetResolverQueryLogConfigAssociationRequest]
    }
  }

  @js.native
  trait GetResolverQueryLogConfigAssociationResponse extends js.Object {
    var ResolverQueryLogConfigAssociation: js.UndefOr[ResolverQueryLogConfigAssociation]
  }

  object GetResolverQueryLogConfigAssociationResponse {
    @inline
    def apply(
        ResolverQueryLogConfigAssociation: js.UndefOr[ResolverQueryLogConfigAssociation] = js.undefined
    ): GetResolverQueryLogConfigAssociationResponse = {
      val __obj = js.Dynamic.literal()
      ResolverQueryLogConfigAssociation.foreach(__v => __obj.updateDynamic("ResolverQueryLogConfigAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResolverQueryLogConfigAssociationResponse]
    }
  }

  @js.native
  trait GetResolverQueryLogConfigPolicyRequest extends js.Object {
    var Arn: Arn
  }

  object GetResolverQueryLogConfigPolicyRequest {
    @inline
    def apply(
        Arn: Arn
    ): GetResolverQueryLogConfigPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetResolverQueryLogConfigPolicyRequest]
    }
  }

  @js.native
  trait GetResolverQueryLogConfigPolicyResponse extends js.Object {
    var ResolverQueryLogConfigPolicy: js.UndefOr[ResolverQueryLogConfigPolicy]
  }

  object GetResolverQueryLogConfigPolicyResponse {
    @inline
    def apply(
        ResolverQueryLogConfigPolicy: js.UndefOr[ResolverQueryLogConfigPolicy] = js.undefined
    ): GetResolverQueryLogConfigPolicyResponse = {
      val __obj = js.Dynamic.literal()
      ResolverQueryLogConfigPolicy.foreach(__v => __obj.updateDynamic("ResolverQueryLogConfigPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResolverQueryLogConfigPolicyResponse]
    }
  }

  @js.native
  trait GetResolverQueryLogConfigRequest extends js.Object {
    var ResolverQueryLogConfigId: ResourceId
  }

  object GetResolverQueryLogConfigRequest {
    @inline
    def apply(
        ResolverQueryLogConfigId: ResourceId
    ): GetResolverQueryLogConfigRequest = {
      val __obj = js.Dynamic.literal(
        "ResolverQueryLogConfigId" -> ResolverQueryLogConfigId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetResolverQueryLogConfigRequest]
    }
  }

  @js.native
  trait GetResolverQueryLogConfigResponse extends js.Object {
    var ResolverQueryLogConfig: js.UndefOr[ResolverQueryLogConfig]
  }

  object GetResolverQueryLogConfigResponse {
    @inline
    def apply(
        ResolverQueryLogConfig: js.UndefOr[ResolverQueryLogConfig] = js.undefined
    ): GetResolverQueryLogConfigResponse = {
      val __obj = js.Dynamic.literal()
      ResolverQueryLogConfig.foreach(__v => __obj.updateDynamic("ResolverQueryLogConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResolverQueryLogConfigResponse]
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

  @js.native
  trait ImportFirewallDomainsRequest extends js.Object {
    var DomainFileUrl: DomainListFileUrl
    var FirewallDomainListId: ResourceId
    var Operation: FirewallDomainImportOperation
  }

  object ImportFirewallDomainsRequest {
    @inline
    def apply(
        DomainFileUrl: DomainListFileUrl,
        FirewallDomainListId: ResourceId,
        Operation: FirewallDomainImportOperation
    ): ImportFirewallDomainsRequest = {
      val __obj = js.Dynamic.literal(
        "DomainFileUrl" -> DomainFileUrl.asInstanceOf[js.Any],
        "FirewallDomainListId" -> FirewallDomainListId.asInstanceOf[js.Any],
        "Operation" -> Operation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImportFirewallDomainsRequest]
    }
  }

  @js.native
  trait ImportFirewallDomainsResponse extends js.Object {
    var Id: js.UndefOr[ResourceId]
    var Name: js.UndefOr[Name]
    var Status: js.UndefOr[FirewallDomainListStatus]
    var StatusMessage: js.UndefOr[StatusMessage]
  }

  object ImportFirewallDomainsResponse {
    @inline
    def apply(
        Id: js.UndefOr[ResourceId] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Status: js.UndefOr[FirewallDomainListStatus] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined
    ): ImportFirewallDomainsResponse = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportFirewallDomainsResponse]
    }
  }

  /** In a [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverEndpoint.html|CreateResolverEndpoint]] request, the IP address that DNS queries originate from (for outbound endpoints) or that you forward DNS queries to (for inbound endpoints). <code>IpAddressRequest</code> also includes the ID of the subnet that contains the IP address.
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

  /** In the response to a [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_GetResolverEndpoint.html|GetResolverEndpoint]] request, information about the IP addresses that the Resolver endpoint uses for DNS queries.
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

  /** In an [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_UpdateResolverEndpoint.html|UpdateResolverEndpoint]] request, information about an IP address to update.
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
  trait ListFirewallConfigsRequest extends js.Object {
    var MaxResults: js.UndefOr[ListFirewallConfigsMaxResult]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFirewallConfigsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListFirewallConfigsMaxResult] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFirewallConfigsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFirewallConfigsRequest]
    }
  }

  @js.native
  trait ListFirewallConfigsResponse extends js.Object {
    var FirewallConfigs: js.UndefOr[FirewallConfigList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFirewallConfigsResponse {
    @inline
    def apply(
        FirewallConfigs: js.UndefOr[FirewallConfigList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFirewallConfigsResponse = {
      val __obj = js.Dynamic.literal()
      FirewallConfigs.foreach(__v => __obj.updateDynamic("FirewallConfigs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFirewallConfigsResponse]
    }
  }

  @js.native
  trait ListFirewallDomainListsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFirewallDomainListsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFirewallDomainListsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFirewallDomainListsRequest]
    }
  }

  @js.native
  trait ListFirewallDomainListsResponse extends js.Object {
    var FirewallDomainLists: js.UndefOr[FirewallDomainListMetadataList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFirewallDomainListsResponse {
    @inline
    def apply(
        FirewallDomainLists: js.UndefOr[FirewallDomainListMetadataList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFirewallDomainListsResponse = {
      val __obj = js.Dynamic.literal()
      FirewallDomainLists.foreach(__v => __obj.updateDynamic("FirewallDomainLists")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFirewallDomainListsResponse]
    }
  }

  @js.native
  trait ListFirewallDomainsRequest extends js.Object {
    var FirewallDomainListId: ResourceId
    var MaxResults: js.UndefOr[ListDomainMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFirewallDomainsRequest {
    @inline
    def apply(
        FirewallDomainListId: ResourceId,
        MaxResults: js.UndefOr[ListDomainMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFirewallDomainsRequest = {
      val __obj = js.Dynamic.literal(
        "FirewallDomainListId" -> FirewallDomainListId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFirewallDomainsRequest]
    }
  }

  @js.native
  trait ListFirewallDomainsResponse extends js.Object {
    var Domains: js.UndefOr[FirewallDomains]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFirewallDomainsResponse {
    @inline
    def apply(
        Domains: js.UndefOr[FirewallDomains] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFirewallDomainsResponse = {
      val __obj = js.Dynamic.literal()
      Domains.foreach(__v => __obj.updateDynamic("Domains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFirewallDomainsResponse]
    }
  }

  @js.native
  trait ListFirewallRuleGroupAssociationsRequest extends js.Object {
    var FirewallRuleGroupId: js.UndefOr[ResourceId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Priority: js.UndefOr[Priority]
    var Status: js.UndefOr[FirewallRuleGroupAssociationStatus]
    var VpcId: js.UndefOr[ResourceId]
  }

  object ListFirewallRuleGroupAssociationsRequest {
    @inline
    def apply(
        FirewallRuleGroupId: js.UndefOr[ResourceId] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Priority: js.UndefOr[Priority] = js.undefined,
        Status: js.UndefOr[FirewallRuleGroupAssociationStatus] = js.undefined,
        VpcId: js.UndefOr[ResourceId] = js.undefined
    ): ListFirewallRuleGroupAssociationsRequest = {
      val __obj = js.Dynamic.literal()
      FirewallRuleGroupId.foreach(__v => __obj.updateDynamic("FirewallRuleGroupId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFirewallRuleGroupAssociationsRequest]
    }
  }

  @js.native
  trait ListFirewallRuleGroupAssociationsResponse extends js.Object {
    var FirewallRuleGroupAssociations: js.UndefOr[FirewallRuleGroupAssociations]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFirewallRuleGroupAssociationsResponse {
    @inline
    def apply(
        FirewallRuleGroupAssociations: js.UndefOr[FirewallRuleGroupAssociations] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFirewallRuleGroupAssociationsResponse = {
      val __obj = js.Dynamic.literal()
      FirewallRuleGroupAssociations.foreach(__v => __obj.updateDynamic("FirewallRuleGroupAssociations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFirewallRuleGroupAssociationsResponse]
    }
  }

  @js.native
  trait ListFirewallRuleGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFirewallRuleGroupsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFirewallRuleGroupsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFirewallRuleGroupsRequest]
    }
  }

  @js.native
  trait ListFirewallRuleGroupsResponse extends js.Object {
    var FirewallRuleGroups: js.UndefOr[FirewallRuleGroupMetadataList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFirewallRuleGroupsResponse {
    @inline
    def apply(
        FirewallRuleGroups: js.UndefOr[FirewallRuleGroupMetadataList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFirewallRuleGroupsResponse = {
      val __obj = js.Dynamic.literal()
      FirewallRuleGroups.foreach(__v => __obj.updateDynamic("FirewallRuleGroups")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFirewallRuleGroupsResponse]
    }
  }

  @js.native
  trait ListFirewallRulesRequest extends js.Object {
    var FirewallRuleGroupId: ResourceId
    var Action: js.UndefOr[Action]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Priority: js.UndefOr[Priority]
  }

  object ListFirewallRulesRequest {
    @inline
    def apply(
        FirewallRuleGroupId: ResourceId,
        Action: js.UndefOr[Action] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Priority: js.UndefOr[Priority] = js.undefined
    ): ListFirewallRulesRequest = {
      val __obj = js.Dynamic.literal(
        "FirewallRuleGroupId" -> FirewallRuleGroupId.asInstanceOf[js.Any]
      )

      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFirewallRulesRequest]
    }
  }

  @js.native
  trait ListFirewallRulesResponse extends js.Object {
    var FirewallRules: js.UndefOr[FirewallRules]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFirewallRulesResponse {
    @inline
    def apply(
        FirewallRules: js.UndefOr[FirewallRules] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFirewallRulesResponse = {
      val __obj = js.Dynamic.literal()
      FirewallRules.foreach(__v => __obj.updateDynamic("FirewallRules")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFirewallRulesResponse]
    }
  }

  @js.native
  trait ListResolverConfigsRequest extends js.Object {
    var MaxResults: js.UndefOr[ListResolverConfigsMaxResult]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListResolverConfigsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListResolverConfigsMaxResult] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListResolverConfigsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResolverConfigsRequest]
    }
  }

  @js.native
  trait ListResolverConfigsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ResolverConfigs: js.UndefOr[ResolverConfigList]
  }

  object ListResolverConfigsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResolverConfigs: js.UndefOr[ResolverConfigList] = js.undefined
    ): ListResolverConfigsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResolverConfigs.foreach(__v => __obj.updateDynamic("ResolverConfigs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResolverConfigsResponse]
    }
  }

  @js.native
  trait ListResolverDnssecConfigsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListResolverDnssecConfigsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListResolverDnssecConfigsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResolverDnssecConfigsRequest]
    }
  }

  @js.native
  trait ListResolverDnssecConfigsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ResolverDnssecConfigs: js.UndefOr[ResolverDnssecConfigList]
  }

  object ListResolverDnssecConfigsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResolverDnssecConfigs: js.UndefOr[ResolverDnssecConfigList] = js.undefined
    ): ListResolverDnssecConfigsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResolverDnssecConfigs.foreach(__v => __obj.updateDynamic("ResolverDnssecConfigs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResolverDnssecConfigsResponse]
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
  trait ListResolverQueryLogConfigAssociationsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[SortByKey]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListResolverQueryLogConfigAssociationsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[SortByKey] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListResolverQueryLogConfigAssociationsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResolverQueryLogConfigAssociationsRequest]
    }
  }

  @js.native
  trait ListResolverQueryLogConfigAssociationsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ResolverQueryLogConfigAssociations: js.UndefOr[ResolverQueryLogConfigAssociationList]
    var TotalCount: js.UndefOr[Count]
    var TotalFilteredCount: js.UndefOr[Count]
  }

  object ListResolverQueryLogConfigAssociationsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResolverQueryLogConfigAssociations: js.UndefOr[ResolverQueryLogConfigAssociationList] = js.undefined,
        TotalCount: js.UndefOr[Count] = js.undefined,
        TotalFilteredCount: js.UndefOr[Count] = js.undefined
    ): ListResolverQueryLogConfigAssociationsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResolverQueryLogConfigAssociations.foreach(__v => __obj.updateDynamic("ResolverQueryLogConfigAssociations")(__v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.updateDynamic("TotalCount")(__v.asInstanceOf[js.Any]))
      TotalFilteredCount.foreach(__v => __obj.updateDynamic("TotalFilteredCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResolverQueryLogConfigAssociationsResponse]
    }
  }

  @js.native
  trait ListResolverQueryLogConfigsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[SortByKey]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListResolverQueryLogConfigsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[SortByKey] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListResolverQueryLogConfigsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResolverQueryLogConfigsRequest]
    }
  }

  @js.native
  trait ListResolverQueryLogConfigsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ResolverQueryLogConfigs: js.UndefOr[ResolverQueryLogConfigList]
    var TotalCount: js.UndefOr[Count]
    var TotalFilteredCount: js.UndefOr[Count]
  }

  object ListResolverQueryLogConfigsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResolverQueryLogConfigs: js.UndefOr[ResolverQueryLogConfigList] = js.undefined,
        TotalCount: js.UndefOr[Count] = js.undefined,
        TotalFilteredCount: js.UndefOr[Count] = js.undefined
    ): ListResolverQueryLogConfigsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResolverQueryLogConfigs.foreach(__v => __obj.updateDynamic("ResolverQueryLogConfigs")(__v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.updateDynamic("TotalCount")(__v.asInstanceOf[js.Any]))
      TotalFilteredCount.foreach(__v => __obj.updateDynamic("TotalFilteredCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResolverQueryLogConfigsResponse]
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
  trait PutFirewallRuleGroupPolicyRequest extends js.Object {
    var Arn: Arn
    var FirewallRuleGroupPolicy: FirewallRuleGroupPolicy
  }

  object PutFirewallRuleGroupPolicyRequest {
    @inline
    def apply(
        Arn: Arn,
        FirewallRuleGroupPolicy: FirewallRuleGroupPolicy
    ): PutFirewallRuleGroupPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "FirewallRuleGroupPolicy" -> FirewallRuleGroupPolicy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutFirewallRuleGroupPolicyRequest]
    }
  }

  @js.native
  trait PutFirewallRuleGroupPolicyResponse extends js.Object {
    var ReturnValue: js.UndefOr[Boolean]
  }

  object PutFirewallRuleGroupPolicyResponse {
    @inline
    def apply(
        ReturnValue: js.UndefOr[Boolean] = js.undefined
    ): PutFirewallRuleGroupPolicyResponse = {
      val __obj = js.Dynamic.literal()
      ReturnValue.foreach(__v => __obj.updateDynamic("ReturnValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutFirewallRuleGroupPolicyResponse]
    }
  }

  @js.native
  trait PutResolverQueryLogConfigPolicyRequest extends js.Object {
    var Arn: Arn
    var ResolverQueryLogConfigPolicy: ResolverQueryLogConfigPolicy
  }

  object PutResolverQueryLogConfigPolicyRequest {
    @inline
    def apply(
        Arn: Arn,
        ResolverQueryLogConfigPolicy: ResolverQueryLogConfigPolicy
    ): PutResolverQueryLogConfigPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "ResolverQueryLogConfigPolicy" -> ResolverQueryLogConfigPolicy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutResolverQueryLogConfigPolicyRequest]
    }
  }

  /** The response to a <code>PutResolverQueryLogConfigPolicy</code> request.
    */
  @js.native
  trait PutResolverQueryLogConfigPolicyResponse extends js.Object {
    var ReturnValue: js.UndefOr[Boolean]
  }

  object PutResolverQueryLogConfigPolicyResponse {
    @inline
    def apply(
        ReturnValue: js.UndefOr[Boolean] = js.undefined
    ): PutResolverQueryLogConfigPolicyResponse = {
      val __obj = js.Dynamic.literal()
      ReturnValue.foreach(__v => __obj.updateDynamic("ReturnValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutResolverQueryLogConfigPolicyResponse]
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

  /** The response to a <code>PutResolverRulePolicy</code> request.
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

  /** A complex type that contains information about a Resolver configuration for a VPC.
    */
  @js.native
  trait ResolverConfig extends js.Object {
    var AutodefinedReverse: js.UndefOr[ResolverAutodefinedReverseStatus]
    var Id: js.UndefOr[ResourceId]
    var OwnerId: js.UndefOr[AccountId]
    var ResourceId: js.UndefOr[ResourceId]
  }

  object ResolverConfig {
    @inline
    def apply(
        AutodefinedReverse: js.UndefOr[ResolverAutodefinedReverseStatus] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined,
        OwnerId: js.UndefOr[AccountId] = js.undefined,
        ResourceId: js.UndefOr[ResourceId] = js.undefined
    ): ResolverConfig = {
      val __obj = js.Dynamic.literal()
      AutodefinedReverse.foreach(__v => __obj.updateDynamic("AutodefinedReverse")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResolverConfig]
    }
  }

  /** A complex type that contains information about a configuration for DNSSEC validation.
    */
  @js.native
  trait ResolverDnssecConfig extends js.Object {
    var Id: js.UndefOr[ResourceId]
    var OwnerId: js.UndefOr[AccountId]
    var ResourceId: js.UndefOr[ResourceId]
    var ValidationStatus: js.UndefOr[ResolverDNSSECValidationStatus]
  }

  object ResolverDnssecConfig {
    @inline
    def apply(
        Id: js.UndefOr[ResourceId] = js.undefined,
        OwnerId: js.UndefOr[AccountId] = js.undefined,
        ResourceId: js.UndefOr[ResourceId] = js.undefined,
        ValidationStatus: js.UndefOr[ResolverDNSSECValidationStatus] = js.undefined
    ): ResolverDnssecConfig = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ValidationStatus.foreach(__v => __obj.updateDynamic("ValidationStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResolverDnssecConfig]
    }
  }

  /** In the response to a [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverEndpoint.html|CreateResolverEndpoint]], [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DeleteResolverEndpoint.html|DeleteResolverEndpoint]], [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_GetResolverEndpoint.html|GetResolverEndpoint]], [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverEndpoints.html|ListResolverEndpoints]], or [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_UpdateResolverEndpoint.html|UpdateResolverEndpoint]] request, a complex type that contains settings for an existing inbound or outbound Resolver endpoint.
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

  /** In the response to a [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverQueryLogConfig.html|CreateResolverQueryLogConfig]], [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DeleteResolverQueryLogConfig.html|DeleteResolverQueryLogConfig]], [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_GetResolverQueryLogConfig.html|GetResolverQueryLogConfig]], or [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigs.html|ListResolverQueryLogConfigs]] request, a complex type that contains settings for one query logging configuration.
    */
  @js.native
  trait ResolverQueryLogConfig extends js.Object {
    var Arn: js.UndefOr[Arn]
    var AssociationCount: js.UndefOr[Count]
    var CreationTime: js.UndefOr[Rfc3339TimeString]
    var CreatorRequestId: js.UndefOr[CreatorRequestId]
    var DestinationArn: js.UndefOr[DestinationArn]
    var Id: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResolverQueryLogConfigName]
    var OwnerId: js.UndefOr[AccountId]
    var ShareStatus: js.UndefOr[ShareStatus]
    var Status: js.UndefOr[ResolverQueryLogConfigStatus]
  }

  object ResolverQueryLogConfig {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        AssociationCount: js.UndefOr[Count] = js.undefined,
        CreationTime: js.UndefOr[Rfc3339TimeString] = js.undefined,
        CreatorRequestId: js.UndefOr[CreatorRequestId] = js.undefined,
        DestinationArn: js.UndefOr[DestinationArn] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined,
        Name: js.UndefOr[ResolverQueryLogConfigName] = js.undefined,
        OwnerId: js.UndefOr[AccountId] = js.undefined,
        ShareStatus: js.UndefOr[ShareStatus] = js.undefined,
        Status: js.UndefOr[ResolverQueryLogConfigStatus] = js.undefined
    ): ResolverQueryLogConfig = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AssociationCount.foreach(__v => __obj.updateDynamic("AssociationCount")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.updateDynamic("CreatorRequestId")(__v.asInstanceOf[js.Any]))
      DestinationArn.foreach(__v => __obj.updateDynamic("DestinationArn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      ShareStatus.foreach(__v => __obj.updateDynamic("ShareStatus")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResolverQueryLogConfig]
    }
  }

  /** In the response to an [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_AssociateResolverQueryLogConfig.html|AssociateResolverQueryLogConfig]], [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DisassociateResolverQueryLogConfig.html|DisassociateResolverQueryLogConfig]], [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_GetResolverQueryLogConfigAssociation.html|GetResolverQueryLogConfigAssociation]], or [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigAssociations.html|ListResolverQueryLogConfigAssociations]], request, a complex type that contains settings for a specified association between an Amazon VPC and a query logging configuration.
    */
  @js.native
  trait ResolverQueryLogConfigAssociation extends js.Object {
    var CreationTime: js.UndefOr[Rfc3339TimeString]
    var Error: js.UndefOr[ResolverQueryLogConfigAssociationError]
    var ErrorMessage: js.UndefOr[ResolverQueryLogConfigAssociationErrorMessage]
    var Id: js.UndefOr[ResourceId]
    var ResolverQueryLogConfigId: js.UndefOr[ResourceId]
    var ResourceId: js.UndefOr[ResourceId]
    var Status: js.UndefOr[ResolverQueryLogConfigAssociationStatus]
  }

  object ResolverQueryLogConfigAssociation {
    @inline
    def apply(
        CreationTime: js.UndefOr[Rfc3339TimeString] = js.undefined,
        Error: js.UndefOr[ResolverQueryLogConfigAssociationError] = js.undefined,
        ErrorMessage: js.UndefOr[ResolverQueryLogConfigAssociationErrorMessage] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined,
        ResolverQueryLogConfigId: js.UndefOr[ResourceId] = js.undefined,
        ResourceId: js.UndefOr[ResourceId] = js.undefined,
        Status: js.UndefOr[ResolverQueryLogConfigAssociationStatus] = js.undefined
    ): ResolverQueryLogConfigAssociation = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      ResolverQueryLogConfigId.foreach(__v => __obj.updateDynamic("ResolverQueryLogConfigId")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResolverQueryLogConfigAssociation]
    }
  }

  /** For queries that originate in your VPC, detailed information about a Resolver rule, which specifies how to route DNS queries out of the VPC. The <code>ResolverRule</code> parameter appears in the response to a [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverRule.html|CreateResolverRule]], [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DeleteResolverRule.html|DeleteResolverRule]], [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_GetResolverRule.html|GetResolverRule]], [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverRules.html|ListResolverRules]], or [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_UpdateResolverRule.html|UpdateResolverRule]] request.
    */
  @js.native
  trait ResolverRule extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationTime: js.UndefOr[Rfc3339TimeString]
    var CreatorRequestId: js.UndefOr[CreatorRequestId]
    var DomainName: js.UndefOr[DomainName]
    var Id: js.UndefOr[ResourceId]
    var ModificationTime: js.UndefOr[Rfc3339TimeString]
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
        CreationTime: js.UndefOr[Rfc3339TimeString] = js.undefined,
        CreatorRequestId: js.UndefOr[CreatorRequestId] = js.undefined,
        DomainName: js.UndefOr[DomainName] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined,
        ModificationTime: js.UndefOr[Rfc3339TimeString] = js.undefined,
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
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.updateDynamic("CreatorRequestId")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      ModificationTime.foreach(__v => __obj.updateDynamic("ModificationTime")(__v.asInstanceOf[js.Any]))
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

  /** In the response to an [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_AssociateResolverRule.html|AssociateResolverRule]], [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DisassociateResolverRule.html|DisassociateResolverRule]], or [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverRuleAssociations.html|ListResolverRuleAssociations]] request, provides information about an association between a Resolver rule and a VPC. The association determines which DNS queries that originate in the VPC are forwarded to your network.
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

  /** In an [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_UpdateResolverRule.html|UpdateResolverRule]] request, information about the changes that you want to make.
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

  /** One tag that you want to add to the specified resource. A tag consists of a <code>Key</code> (a name for the tag) and a <code>Value</code>.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
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
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** In a [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverRule.html|CreateResolverRule]] request, an array of the IPs that you want to forward DNS queries to.
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
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateFirewallConfigRequest extends js.Object {
    var FirewallFailOpen: FirewallFailOpenStatus
    var ResourceId: ResourceId
  }

  object UpdateFirewallConfigRequest {
    @inline
    def apply(
        FirewallFailOpen: FirewallFailOpenStatus,
        ResourceId: ResourceId
    ): UpdateFirewallConfigRequest = {
      val __obj = js.Dynamic.literal(
        "FirewallFailOpen" -> FirewallFailOpen.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateFirewallConfigRequest]
    }
  }

  @js.native
  trait UpdateFirewallConfigResponse extends js.Object {
    var FirewallConfig: js.UndefOr[FirewallConfig]
  }

  object UpdateFirewallConfigResponse {
    @inline
    def apply(
        FirewallConfig: js.UndefOr[FirewallConfig] = js.undefined
    ): UpdateFirewallConfigResponse = {
      val __obj = js.Dynamic.literal()
      FirewallConfig.foreach(__v => __obj.updateDynamic("FirewallConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFirewallConfigResponse]
    }
  }

  @js.native
  trait UpdateFirewallDomainsRequest extends js.Object {
    var Domains: FirewallDomains
    var FirewallDomainListId: ResourceId
    var Operation: FirewallDomainUpdateOperation
  }

  object UpdateFirewallDomainsRequest {
    @inline
    def apply(
        Domains: FirewallDomains,
        FirewallDomainListId: ResourceId,
        Operation: FirewallDomainUpdateOperation
    ): UpdateFirewallDomainsRequest = {
      val __obj = js.Dynamic.literal(
        "Domains" -> Domains.asInstanceOf[js.Any],
        "FirewallDomainListId" -> FirewallDomainListId.asInstanceOf[js.Any],
        "Operation" -> Operation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateFirewallDomainsRequest]
    }
  }

  @js.native
  trait UpdateFirewallDomainsResponse extends js.Object {
    var Id: js.UndefOr[ResourceId]
    var Name: js.UndefOr[Name]
    var Status: js.UndefOr[FirewallDomainListStatus]
    var StatusMessage: js.UndefOr[StatusMessage]
  }

  object UpdateFirewallDomainsResponse {
    @inline
    def apply(
        Id: js.UndefOr[ResourceId] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Status: js.UndefOr[FirewallDomainListStatus] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined
    ): UpdateFirewallDomainsResponse = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFirewallDomainsResponse]
    }
  }

  @js.native
  trait UpdateFirewallRuleGroupAssociationRequest extends js.Object {
    var FirewallRuleGroupAssociationId: ResourceId
    var MutationProtection: js.UndefOr[MutationProtectionStatus]
    var Name: js.UndefOr[Name]
    var Priority: js.UndefOr[Priority]
  }

  object UpdateFirewallRuleGroupAssociationRequest {
    @inline
    def apply(
        FirewallRuleGroupAssociationId: ResourceId,
        MutationProtection: js.UndefOr[MutationProtectionStatus] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Priority: js.UndefOr[Priority] = js.undefined
    ): UpdateFirewallRuleGroupAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "FirewallRuleGroupAssociationId" -> FirewallRuleGroupAssociationId.asInstanceOf[js.Any]
      )

      MutationProtection.foreach(__v => __obj.updateDynamic("MutationProtection")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFirewallRuleGroupAssociationRequest]
    }
  }

  @js.native
  trait UpdateFirewallRuleGroupAssociationResponse extends js.Object {
    var FirewallRuleGroupAssociation: js.UndefOr[FirewallRuleGroupAssociation]
  }

  object UpdateFirewallRuleGroupAssociationResponse {
    @inline
    def apply(
        FirewallRuleGroupAssociation: js.UndefOr[FirewallRuleGroupAssociation] = js.undefined
    ): UpdateFirewallRuleGroupAssociationResponse = {
      val __obj = js.Dynamic.literal()
      FirewallRuleGroupAssociation.foreach(__v => __obj.updateDynamic("FirewallRuleGroupAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFirewallRuleGroupAssociationResponse]
    }
  }

  @js.native
  trait UpdateFirewallRuleRequest extends js.Object {
    var FirewallDomainListId: ResourceId
    var FirewallRuleGroupId: ResourceId
    var Action: js.UndefOr[Action]
    var BlockOverrideDnsType: js.UndefOr[BlockOverrideDnsType]
    var BlockOverrideDomain: js.UndefOr[BlockOverrideDomain]
    var BlockOverrideTtl: js.UndefOr[BlockOverrideTtl]
    var BlockResponse: js.UndefOr[BlockResponse]
    var Name: js.UndefOr[Name]
    var Priority: js.UndefOr[Priority]
  }

  object UpdateFirewallRuleRequest {
    @inline
    def apply(
        FirewallDomainListId: ResourceId,
        FirewallRuleGroupId: ResourceId,
        Action: js.UndefOr[Action] = js.undefined,
        BlockOverrideDnsType: js.UndefOr[BlockOverrideDnsType] = js.undefined,
        BlockOverrideDomain: js.UndefOr[BlockOverrideDomain] = js.undefined,
        BlockOverrideTtl: js.UndefOr[BlockOverrideTtl] = js.undefined,
        BlockResponse: js.UndefOr[BlockResponse] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Priority: js.UndefOr[Priority] = js.undefined
    ): UpdateFirewallRuleRequest = {
      val __obj = js.Dynamic.literal(
        "FirewallDomainListId" -> FirewallDomainListId.asInstanceOf[js.Any],
        "FirewallRuleGroupId" -> FirewallRuleGroupId.asInstanceOf[js.Any]
      )

      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      BlockOverrideDnsType.foreach(__v => __obj.updateDynamic("BlockOverrideDnsType")(__v.asInstanceOf[js.Any]))
      BlockOverrideDomain.foreach(__v => __obj.updateDynamic("BlockOverrideDomain")(__v.asInstanceOf[js.Any]))
      BlockOverrideTtl.foreach(__v => __obj.updateDynamic("BlockOverrideTtl")(__v.asInstanceOf[js.Any]))
      BlockResponse.foreach(__v => __obj.updateDynamic("BlockResponse")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFirewallRuleRequest]
    }
  }

  @js.native
  trait UpdateFirewallRuleResponse extends js.Object {
    var FirewallRule: js.UndefOr[FirewallRule]
  }

  object UpdateFirewallRuleResponse {
    @inline
    def apply(
        FirewallRule: js.UndefOr[FirewallRule] = js.undefined
    ): UpdateFirewallRuleResponse = {
      val __obj = js.Dynamic.literal()
      FirewallRule.foreach(__v => __obj.updateDynamic("FirewallRule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFirewallRuleResponse]
    }
  }

  @js.native
  trait UpdateResolverConfigRequest extends js.Object {
    var AutodefinedReverseFlag: AutodefinedReverseFlag
    var ResourceId: ResourceId
  }

  object UpdateResolverConfigRequest {
    @inline
    def apply(
        AutodefinedReverseFlag: AutodefinedReverseFlag,
        ResourceId: ResourceId
    ): UpdateResolverConfigRequest = {
      val __obj = js.Dynamic.literal(
        "AutodefinedReverseFlag" -> AutodefinedReverseFlag.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateResolverConfigRequest]
    }
  }

  @js.native
  trait UpdateResolverConfigResponse extends js.Object {
    var ResolverConfig: js.UndefOr[ResolverConfig]
  }

  object UpdateResolverConfigResponse {
    @inline
    def apply(
        ResolverConfig: js.UndefOr[ResolverConfig] = js.undefined
    ): UpdateResolverConfigResponse = {
      val __obj = js.Dynamic.literal()
      ResolverConfig.foreach(__v => __obj.updateDynamic("ResolverConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResolverConfigResponse]
    }
  }

  @js.native
  trait UpdateResolverDnssecConfigRequest extends js.Object {
    var ResourceId: ResourceId
    var Validation: Validation
  }

  object UpdateResolverDnssecConfigRequest {
    @inline
    def apply(
        ResourceId: ResourceId,
        Validation: Validation
    ): UpdateResolverDnssecConfigRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "Validation" -> Validation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateResolverDnssecConfigRequest]
    }
  }

  @js.native
  trait UpdateResolverDnssecConfigResponse extends js.Object {
    var ResolverDNSSECConfig: js.UndefOr[ResolverDnssecConfig]
  }

  object UpdateResolverDnssecConfigResponse {
    @inline
    def apply(
        ResolverDNSSECConfig: js.UndefOr[ResolverDnssecConfig] = js.undefined
    ): UpdateResolverDnssecConfigResponse = {
      val __obj = js.Dynamic.literal()
      ResolverDNSSECConfig.foreach(__v => __obj.updateDynamic("ResolverDNSSECConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResolverDnssecConfigResponse]
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
