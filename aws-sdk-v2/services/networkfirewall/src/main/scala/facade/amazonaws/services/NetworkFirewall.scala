package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object networkfirewall {
  type ActionName = String
  type AddressDefinition = String
  type Addresses = js.Array[Address]
  type AvailabilityZone = String
  type AzSubnet = String
  type AzSubnets = js.Array[AzSubnet]
  type CIDRCount = Int
  type CollectionMember_String = String
  type CustomActions = js.Array[CustomAction]
  type Description = String
  type Destination = String
  type DimensionValue = String
  type Dimensions = js.Array[Dimension]
  type EndpointId = String
  type FirewallPolicies = js.Array[FirewallPolicyMetadata]
  type Firewalls = js.Array[FirewallMetadata]
  type Flags = js.Array[TCPFlag]
  type HashMapKey = String
  type HashMapValue = String
  type IPSetArn = String
  type IPSetMetadataMap = js.Dictionary[IPSetMetadata]
  type IPSetReferenceMap = js.Dictionary[IPSetReference]
  type IPSetReferenceName = String
  type IPSets = js.Dictionary[IPSet]
  type KeyId = String
  type Keyword = String
  type LastUpdateTime = js.Date
  type LogDestinationConfigs = js.Array[LogDestinationConfig]
  type LogDestinationMap = js.Dictionary[HashMapValue]
  type NumberOfAssociations = Int
  type PaginationMaxResults = Int
  type PaginationToken = String
  type PolicyString = String
  type Port = String
  type PortRangeBound = Int
  type PortRanges = js.Array[PortRange]
  type PortSets = js.Dictionary[PortSet]
  type Priority = Int
  type ProtocolNumber = Int
  type ProtocolNumbers = js.Array[ProtocolNumber]
  type ResourceArn = String
  type ResourceId = String
  type ResourceName = String
  type RuleCapacity = Int
  type RuleGroups = js.Array[RuleGroupMetadata]
  type RuleOptions = js.Array[RuleOption]
  type RuleTargets = js.Array[CollectionMember_String]
  type RuleVariableName = String
  type RulesString = String
  type Setting = String
  type Settings = js.Array[Setting]
  type Source = String
  type StatefulActions = js.Array[CollectionMember_String]
  type StatefulRuleGroupReferences = js.Array[StatefulRuleGroupReference]
  type StatefulRules = js.Array[StatefulRule]
  type StatelessActions = js.Array[CollectionMember_String]
  type StatelessRuleGroupReferences = js.Array[StatelessRuleGroupReference]
  type StatelessRules = js.Array[StatelessRule]
  type SubnetMappings = js.Array[SubnetMapping]
  type SyncStateConfig = js.Dictionary[PerObjectStatus]
  type SyncStates = js.Dictionary[SyncState]
  type TCPFlags = js.Array[TCPFlagField]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TagsPaginationMaxResults = Int
  type TargetTypes = js.Array[TargetType]
  type UpdateToken = String
  type VariableDefinition = String
  type VariableDefinitionList = js.Array[VariableDefinition]
  type VpcId = String
  type VpcIds = js.Array[VpcId]

  final class NetworkFirewallOps(private val service: NetworkFirewall) extends AnyVal {

    @inline def associateFirewallPolicyFuture(params: AssociateFirewallPolicyRequest): Future[AssociateFirewallPolicyResponse] = service.associateFirewallPolicy(params).promise().toFuture
    @inline def associateSubnetsFuture(params: AssociateSubnetsRequest): Future[AssociateSubnetsResponse] = service.associateSubnets(params).promise().toFuture
    @inline def createFirewallFuture(params: CreateFirewallRequest): Future[CreateFirewallResponse] = service.createFirewall(params).promise().toFuture
    @inline def createFirewallPolicyFuture(params: CreateFirewallPolicyRequest): Future[CreateFirewallPolicyResponse] = service.createFirewallPolicy(params).promise().toFuture
    @inline def createRuleGroupFuture(params: CreateRuleGroupRequest): Future[CreateRuleGroupResponse] = service.createRuleGroup(params).promise().toFuture
    @inline def deleteFirewallFuture(params: DeleteFirewallRequest): Future[DeleteFirewallResponse] = service.deleteFirewall(params).promise().toFuture
    @inline def deleteFirewallPolicyFuture(params: DeleteFirewallPolicyRequest): Future[DeleteFirewallPolicyResponse] = service.deleteFirewallPolicy(params).promise().toFuture
    @inline def deleteResourcePolicyFuture(params: DeleteResourcePolicyRequest): Future[DeleteResourcePolicyResponse] = service.deleteResourcePolicy(params).promise().toFuture
    @inline def deleteRuleGroupFuture(params: DeleteRuleGroupRequest): Future[DeleteRuleGroupResponse] = service.deleteRuleGroup(params).promise().toFuture
    @inline def describeFirewallFuture(params: DescribeFirewallRequest): Future[DescribeFirewallResponse] = service.describeFirewall(params).promise().toFuture
    @inline def describeFirewallPolicyFuture(params: DescribeFirewallPolicyRequest): Future[DescribeFirewallPolicyResponse] = service.describeFirewallPolicy(params).promise().toFuture
    @inline def describeLoggingConfigurationFuture(params: DescribeLoggingConfigurationRequest): Future[DescribeLoggingConfigurationResponse] = service.describeLoggingConfiguration(params).promise().toFuture
    @inline def describeResourcePolicyFuture(params: DescribeResourcePolicyRequest): Future[DescribeResourcePolicyResponse] = service.describeResourcePolicy(params).promise().toFuture
    @inline def describeRuleGroupFuture(params: DescribeRuleGroupRequest): Future[DescribeRuleGroupResponse] = service.describeRuleGroup(params).promise().toFuture
    @inline def describeRuleGroupMetadataFuture(params: DescribeRuleGroupMetadataRequest): Future[DescribeRuleGroupMetadataResponse] = service.describeRuleGroupMetadata(params).promise().toFuture
    @inline def disassociateSubnetsFuture(params: DisassociateSubnetsRequest): Future[DisassociateSubnetsResponse] = service.disassociateSubnets(params).promise().toFuture
    @inline def listFirewallPoliciesFuture(params: ListFirewallPoliciesRequest): Future[ListFirewallPoliciesResponse] = service.listFirewallPolicies(params).promise().toFuture
    @inline def listFirewallsFuture(params: ListFirewallsRequest): Future[ListFirewallsResponse] = service.listFirewalls(params).promise().toFuture
    @inline def listRuleGroupsFuture(params: ListRuleGroupsRequest): Future[ListRuleGroupsResponse] = service.listRuleGroups(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putResourcePolicyFuture(params: PutResourcePolicyRequest): Future[PutResourcePolicyResponse] = service.putResourcePolicy(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateFirewallDeleteProtectionFuture(params: UpdateFirewallDeleteProtectionRequest): Future[UpdateFirewallDeleteProtectionResponse] = service.updateFirewallDeleteProtection(params).promise().toFuture
    @inline def updateFirewallDescriptionFuture(params: UpdateFirewallDescriptionRequest): Future[UpdateFirewallDescriptionResponse] = service.updateFirewallDescription(params).promise().toFuture
    @inline def updateFirewallEncryptionConfigurationFuture(params: UpdateFirewallEncryptionConfigurationRequest): Future[UpdateFirewallEncryptionConfigurationResponse] = service.updateFirewallEncryptionConfiguration(params).promise().toFuture
    @inline def updateFirewallPolicyChangeProtectionFuture(params: UpdateFirewallPolicyChangeProtectionRequest): Future[UpdateFirewallPolicyChangeProtectionResponse] = service.updateFirewallPolicyChangeProtection(params).promise().toFuture
    @inline def updateFirewallPolicyFuture(params: UpdateFirewallPolicyRequest): Future[UpdateFirewallPolicyResponse] = service.updateFirewallPolicy(params).promise().toFuture
    @inline def updateLoggingConfigurationFuture(params: UpdateLoggingConfigurationRequest): Future[UpdateLoggingConfigurationResponse] = service.updateLoggingConfiguration(params).promise().toFuture
    @inline def updateRuleGroupFuture(params: UpdateRuleGroupRequest): Future[UpdateRuleGroupResponse] = service.updateRuleGroup(params).promise().toFuture
    @inline def updateSubnetChangeProtectionFuture(params: UpdateSubnetChangeProtectionRequest): Future[UpdateSubnetChangeProtectionResponse] = service.updateSubnetChangeProtection(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/networkfirewall", JSImport.Namespace, "AWS.NetworkFirewall")
  class NetworkFirewall() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateFirewallPolicy(params: AssociateFirewallPolicyRequest): Request[AssociateFirewallPolicyResponse] = js.native
    def associateSubnets(params: AssociateSubnetsRequest): Request[AssociateSubnetsResponse] = js.native
    def createFirewall(params: CreateFirewallRequest): Request[CreateFirewallResponse] = js.native
    def createFirewallPolicy(params: CreateFirewallPolicyRequest): Request[CreateFirewallPolicyResponse] = js.native
    def createRuleGroup(params: CreateRuleGroupRequest): Request[CreateRuleGroupResponse] = js.native
    def deleteFirewall(params: DeleteFirewallRequest): Request[DeleteFirewallResponse] = js.native
    def deleteFirewallPolicy(params: DeleteFirewallPolicyRequest): Request[DeleteFirewallPolicyResponse] = js.native
    def deleteResourcePolicy(params: DeleteResourcePolicyRequest): Request[DeleteResourcePolicyResponse] = js.native
    def deleteRuleGroup(params: DeleteRuleGroupRequest): Request[DeleteRuleGroupResponse] = js.native
    def describeFirewall(params: DescribeFirewallRequest): Request[DescribeFirewallResponse] = js.native
    def describeFirewallPolicy(params: DescribeFirewallPolicyRequest): Request[DescribeFirewallPolicyResponse] = js.native
    def describeLoggingConfiguration(params: DescribeLoggingConfigurationRequest): Request[DescribeLoggingConfigurationResponse] = js.native
    def describeResourcePolicy(params: DescribeResourcePolicyRequest): Request[DescribeResourcePolicyResponse] = js.native
    def describeRuleGroup(params: DescribeRuleGroupRequest): Request[DescribeRuleGroupResponse] = js.native
    def describeRuleGroupMetadata(params: DescribeRuleGroupMetadataRequest): Request[DescribeRuleGroupMetadataResponse] = js.native
    def disassociateSubnets(params: DisassociateSubnetsRequest): Request[DisassociateSubnetsResponse] = js.native
    def listFirewallPolicies(params: ListFirewallPoliciesRequest): Request[ListFirewallPoliciesResponse] = js.native
    def listFirewalls(params: ListFirewallsRequest): Request[ListFirewallsResponse] = js.native
    def listRuleGroups(params: ListRuleGroupsRequest): Request[ListRuleGroupsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putResourcePolicy(params: PutResourcePolicyRequest): Request[PutResourcePolicyResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateFirewallDeleteProtection(params: UpdateFirewallDeleteProtectionRequest): Request[UpdateFirewallDeleteProtectionResponse] = js.native
    def updateFirewallDescription(params: UpdateFirewallDescriptionRequest): Request[UpdateFirewallDescriptionResponse] = js.native
    def updateFirewallEncryptionConfiguration(params: UpdateFirewallEncryptionConfigurationRequest): Request[UpdateFirewallEncryptionConfigurationResponse] = js.native
    def updateFirewallPolicy(params: UpdateFirewallPolicyRequest): Request[UpdateFirewallPolicyResponse] = js.native
    def updateFirewallPolicyChangeProtection(params: UpdateFirewallPolicyChangeProtectionRequest): Request[UpdateFirewallPolicyChangeProtectionResponse] = js.native
    def updateLoggingConfiguration(params: UpdateLoggingConfigurationRequest): Request[UpdateLoggingConfigurationResponse] = js.native
    def updateRuleGroup(params: UpdateRuleGroupRequest): Request[UpdateRuleGroupResponse] = js.native
    def updateSubnetChangeProtection(params: UpdateSubnetChangeProtectionRequest): Request[UpdateSubnetChangeProtectionResponse] = js.native
  }
  object NetworkFirewall {
    @inline implicit def toOps(service: NetworkFirewall): NetworkFirewallOps = {
      new NetworkFirewallOps(service)
    }
  }

  /** A custom action to use in stateless rule actions settings. This is used in <a>CustomAction</a>.
    */
  @js.native
  trait ActionDefinition extends js.Object {
    var PublishMetricAction: js.UndefOr[PublishMetricAction]
  }

  object ActionDefinition {
    @inline
    def apply(
        PublishMetricAction: js.UndefOr[PublishMetricAction] = js.undefined
    ): ActionDefinition = {
      val __obj = js.Dynamic.literal()
      PublishMetricAction.foreach(__v => __obj.updateDynamic("PublishMetricAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionDefinition]
    }
  }

  /** A single IP address specification. This is used in the <a>MatchAttributes</a> source and destination specifications.
    */
  @js.native
  trait Address extends js.Object {
    var AddressDefinition: AddressDefinition
  }

  object Address {
    @inline
    def apply(
        AddressDefinition: AddressDefinition
    ): Address = {
      val __obj = js.Dynamic.literal(
        "AddressDefinition" -> AddressDefinition.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Address]
    }
  }

  @js.native
  trait AssociateFirewallPolicyRequest extends js.Object {
    var FirewallPolicyArn: ResourceArn
    var FirewallArn: js.UndefOr[ResourceArn]
    var FirewallName: js.UndefOr[ResourceName]
    var UpdateToken: js.UndefOr[UpdateToken]
  }

  object AssociateFirewallPolicyRequest {
    @inline
    def apply(
        FirewallPolicyArn: ResourceArn,
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallName: js.UndefOr[ResourceName] = js.undefined,
        UpdateToken: js.UndefOr[UpdateToken] = js.undefined
    ): AssociateFirewallPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "FirewallPolicyArn" -> FirewallPolicyArn.asInstanceOf[js.Any]
      )

      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      UpdateToken.foreach(__v => __obj.updateDynamic("UpdateToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateFirewallPolicyRequest]
    }
  }

  @js.native
  trait AssociateFirewallPolicyResponse extends js.Object {
    var FirewallArn: js.UndefOr[ResourceArn]
    var FirewallName: js.UndefOr[ResourceName]
    var FirewallPolicyArn: js.UndefOr[ResourceArn]
    var UpdateToken: js.UndefOr[UpdateToken]
  }

  object AssociateFirewallPolicyResponse {
    @inline
    def apply(
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallName: js.UndefOr[ResourceName] = js.undefined,
        FirewallPolicyArn: js.UndefOr[ResourceArn] = js.undefined,
        UpdateToken: js.UndefOr[UpdateToken] = js.undefined
    ): AssociateFirewallPolicyResponse = {
      val __obj = js.Dynamic.literal()
      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      FirewallPolicyArn.foreach(__v => __obj.updateDynamic("FirewallPolicyArn")(__v.asInstanceOf[js.Any]))
      UpdateToken.foreach(__v => __obj.updateDynamic("UpdateToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateFirewallPolicyResponse]
    }
  }

  @js.native
  trait AssociateSubnetsRequest extends js.Object {
    var SubnetMappings: SubnetMappings
    var FirewallArn: js.UndefOr[ResourceArn]
    var FirewallName: js.UndefOr[ResourceName]
    var UpdateToken: js.UndefOr[UpdateToken]
  }

  object AssociateSubnetsRequest {
    @inline
    def apply(
        SubnetMappings: SubnetMappings,
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallName: js.UndefOr[ResourceName] = js.undefined,
        UpdateToken: js.UndefOr[UpdateToken] = js.undefined
    ): AssociateSubnetsRequest = {
      val __obj = js.Dynamic.literal(
        "SubnetMappings" -> SubnetMappings.asInstanceOf[js.Any]
      )

      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      UpdateToken.foreach(__v => __obj.updateDynamic("UpdateToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateSubnetsRequest]
    }
  }

  @js.native
  trait AssociateSubnetsResponse extends js.Object {
    var FirewallArn: js.UndefOr[ResourceArn]
    var FirewallName: js.UndefOr[ResourceName]
    var SubnetMappings: js.UndefOr[SubnetMappings]
    var UpdateToken: js.UndefOr[UpdateToken]
  }

  object AssociateSubnetsResponse {
    @inline
    def apply(
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallName: js.UndefOr[ResourceName] = js.undefined,
        SubnetMappings: js.UndefOr[SubnetMappings] = js.undefined,
        UpdateToken: js.UndefOr[UpdateToken] = js.undefined
    ): AssociateSubnetsResponse = {
      val __obj = js.Dynamic.literal()
      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      SubnetMappings.foreach(__v => __obj.updateDynamic("SubnetMappings")(__v.asInstanceOf[js.Any]))
      UpdateToken.foreach(__v => __obj.updateDynamic("UpdateToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateSubnetsResponse]
    }
  }

  /** The configuration and status for a single subnet that you've specified for use by the Network Firewall firewall. This is part of the <a>FirewallStatus</a>.
    */
  @js.native
  trait Attachment extends js.Object {
    var EndpointId: js.UndefOr[EndpointId]
    var Status: js.UndefOr[AttachmentStatus]
    var SubnetId: js.UndefOr[AzSubnet]
  }

  object Attachment {
    @inline
    def apply(
        EndpointId: js.UndefOr[EndpointId] = js.undefined,
        Status: js.UndefOr[AttachmentStatus] = js.undefined,
        SubnetId: js.UndefOr[AzSubnet] = js.undefined
    ): Attachment = {
      val __obj = js.Dynamic.literal()
      EndpointId.foreach(__v => __obj.updateDynamic("EndpointId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Attachment]
    }
  }

  /** Summarizes the CIDR blocks used by the IP set references in a firewall. Network Firewall calculates the number of CIDRs by taking an aggregated count of all CIDRs used by the IP sets you are referencing.
    */
  @js.native
  trait CIDRSummary extends js.Object {
    var AvailableCIDRCount: js.UndefOr[CIDRCount]
    var IPSetReferences: js.UndefOr[IPSetMetadataMap]
    var UtilizedCIDRCount: js.UndefOr[CIDRCount]
  }

  object CIDRSummary {
    @inline
    def apply(
        AvailableCIDRCount: js.UndefOr[CIDRCount] = js.undefined,
        IPSetReferences: js.UndefOr[IPSetMetadataMap] = js.undefined,
        UtilizedCIDRCount: js.UndefOr[CIDRCount] = js.undefined
    ): CIDRSummary = {
      val __obj = js.Dynamic.literal()
      AvailableCIDRCount.foreach(__v => __obj.updateDynamic("AvailableCIDRCount")(__v.asInstanceOf[js.Any]))
      IPSetReferences.foreach(__v => __obj.updateDynamic("IPSetReferences")(__v.asInstanceOf[js.Any]))
      UtilizedCIDRCount.foreach(__v => __obj.updateDynamic("UtilizedCIDRCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CIDRSummary]
    }
  }

  /** The capacity usage summary of the resources used by the <a>ReferenceSets</a> in a firewall.
    */
  @js.native
  trait CapacityUsageSummary extends js.Object {
    var CIDRs: js.UndefOr[CIDRSummary]
  }

  object CapacityUsageSummary {
    @inline
    def apply(
        CIDRs: js.UndefOr[CIDRSummary] = js.undefined
    ): CapacityUsageSummary = {
      val __obj = js.Dynamic.literal()
      CIDRs.foreach(__v => __obj.updateDynamic("CIDRs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CapacityUsageSummary]
    }
  }

  @js.native
  trait CreateFirewallPolicyRequest extends js.Object {
    var FirewallPolicy: FirewallPolicy
    var FirewallPolicyName: ResourceName
    var Description: js.UndefOr[Description]
    var DryRun: js.UndefOr[Boolean]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var Tags: js.UndefOr[TagList]
  }

  object CreateFirewallPolicyRequest {
    @inline
    def apply(
        FirewallPolicy: FirewallPolicy,
        FirewallPolicyName: ResourceName,
        Description: js.UndefOr[Description] = js.undefined,
        DryRun: js.UndefOr[Boolean] = js.undefined,
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateFirewallPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "FirewallPolicy" -> FirewallPolicy.asInstanceOf[js.Any],
        "FirewallPolicyName" -> FirewallPolicyName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      EncryptionConfiguration.foreach(__v => __obj.updateDynamic("EncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFirewallPolicyRequest]
    }
  }

  @js.native
  trait CreateFirewallPolicyResponse extends js.Object {
    var FirewallPolicyResponse: FirewallPolicyResponse
    var UpdateToken: UpdateToken
  }

  object CreateFirewallPolicyResponse {
    @inline
    def apply(
        FirewallPolicyResponse: FirewallPolicyResponse,
        UpdateToken: UpdateToken
    ): CreateFirewallPolicyResponse = {
      val __obj = js.Dynamic.literal(
        "FirewallPolicyResponse" -> FirewallPolicyResponse.asInstanceOf[js.Any],
        "UpdateToken" -> UpdateToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateFirewallPolicyResponse]
    }
  }

  @js.native
  trait CreateFirewallRequest extends js.Object {
    var FirewallName: ResourceName
    var FirewallPolicyArn: ResourceArn
    var SubnetMappings: SubnetMappings
    var VpcId: VpcId
    var DeleteProtection: js.UndefOr[Boolean]
    var Description: js.UndefOr[Description]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var FirewallPolicyChangeProtection: js.UndefOr[Boolean]
    var SubnetChangeProtection: js.UndefOr[Boolean]
    var Tags: js.UndefOr[TagList]
  }

  object CreateFirewallRequest {
    @inline
    def apply(
        FirewallName: ResourceName,
        FirewallPolicyArn: ResourceArn,
        SubnetMappings: SubnetMappings,
        VpcId: VpcId,
        DeleteProtection: js.UndefOr[Boolean] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        FirewallPolicyChangeProtection: js.UndefOr[Boolean] = js.undefined,
        SubnetChangeProtection: js.UndefOr[Boolean] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateFirewallRequest = {
      val __obj = js.Dynamic.literal(
        "FirewallName" -> FirewallName.asInstanceOf[js.Any],
        "FirewallPolicyArn" -> FirewallPolicyArn.asInstanceOf[js.Any],
        "SubnetMappings" -> SubnetMappings.asInstanceOf[js.Any],
        "VpcId" -> VpcId.asInstanceOf[js.Any]
      )

      DeleteProtection.foreach(__v => __obj.updateDynamic("DeleteProtection")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EncryptionConfiguration.foreach(__v => __obj.updateDynamic("EncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      FirewallPolicyChangeProtection.foreach(__v => __obj.updateDynamic("FirewallPolicyChangeProtection")(__v.asInstanceOf[js.Any]))
      SubnetChangeProtection.foreach(__v => __obj.updateDynamic("SubnetChangeProtection")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFirewallRequest]
    }
  }

  @js.native
  trait CreateFirewallResponse extends js.Object {
    var Firewall: js.UndefOr[Firewall]
    var FirewallStatus: js.UndefOr[FirewallStatus]
  }

  object CreateFirewallResponse {
    @inline
    def apply(
        Firewall: js.UndefOr[Firewall] = js.undefined,
        FirewallStatus: js.UndefOr[FirewallStatus] = js.undefined
    ): CreateFirewallResponse = {
      val __obj = js.Dynamic.literal()
      Firewall.foreach(__v => __obj.updateDynamic("Firewall")(__v.asInstanceOf[js.Any]))
      FirewallStatus.foreach(__v => __obj.updateDynamic("FirewallStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFirewallResponse]
    }
  }

  @js.native
  trait CreateRuleGroupRequest extends js.Object {
    var Capacity: RuleCapacity
    var RuleGroupName: ResourceName
    var Type: RuleGroupType
    var Description: js.UndefOr[Description]
    var DryRun: js.UndefOr[Boolean]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var RuleGroup: js.UndefOr[RuleGroup]
    var Rules: js.UndefOr[RulesString]
    var SourceMetadata: js.UndefOr[SourceMetadata]
    var Tags: js.UndefOr[TagList]
  }

  object CreateRuleGroupRequest {
    @inline
    def apply(
        Capacity: RuleCapacity,
        RuleGroupName: ResourceName,
        Type: RuleGroupType,
        Description: js.UndefOr[Description] = js.undefined,
        DryRun: js.UndefOr[Boolean] = js.undefined,
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        RuleGroup: js.UndefOr[RuleGroup] = js.undefined,
        Rules: js.UndefOr[RulesString] = js.undefined,
        SourceMetadata: js.UndefOr[SourceMetadata] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateRuleGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Capacity" -> Capacity.asInstanceOf[js.Any],
        "RuleGroupName" -> RuleGroupName.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      EncryptionConfiguration.foreach(__v => __obj.updateDynamic("EncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      RuleGroup.foreach(__v => __obj.updateDynamic("RuleGroup")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      SourceMetadata.foreach(__v => __obj.updateDynamic("SourceMetadata")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRuleGroupRequest]
    }
  }

  @js.native
  trait CreateRuleGroupResponse extends js.Object {
    var RuleGroupResponse: RuleGroupResponse
    var UpdateToken: UpdateToken
  }

  object CreateRuleGroupResponse {
    @inline
    def apply(
        RuleGroupResponse: RuleGroupResponse,
        UpdateToken: UpdateToken
    ): CreateRuleGroupResponse = {
      val __obj = js.Dynamic.literal(
        "RuleGroupResponse" -> RuleGroupResponse.asInstanceOf[js.Any],
        "UpdateToken" -> UpdateToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateRuleGroupResponse]
    }
  }

  /** An optional, non-standard action to use for stateless packet handling. You can define this in addition to the standard action that you must specify. You define and name the custom actions that you want to be able to use, and then you reference them by name in your actions settings. You can use custom actions in the following places: * In a rule group's <a>StatelessRulesAndCustomActions</a> specification. The custom actions are available for use by name inside the <code>StatelessRulesAndCustomActions</code> where you define them. You can use them for your stateless rule actions to specify what to do with a packet that matches the rule's match attributes. * In a <a>FirewallPolicy</a> specification, in <code>StatelessCustomActions</code>. The custom actions are available for use inside the policy where you define them. You can use them for the policy's default stateless actions settings to specify what to do with packets that don't match any of the policy's stateless rules.
    */
  @js.native
  trait CustomAction extends js.Object {
    var ActionDefinition: ActionDefinition
    var ActionName: ActionName
  }

  object CustomAction {
    @inline
    def apply(
        ActionDefinition: ActionDefinition,
        ActionName: ActionName
    ): CustomAction = {
      val __obj = js.Dynamic.literal(
        "ActionDefinition" -> ActionDefinition.asInstanceOf[js.Any],
        "ActionName" -> ActionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CustomAction]
    }
  }

  @js.native
  trait DeleteFirewallPolicyRequest extends js.Object {
    var FirewallPolicyArn: js.UndefOr[ResourceArn]
    var FirewallPolicyName: js.UndefOr[ResourceName]
  }

  object DeleteFirewallPolicyRequest {
    @inline
    def apply(
        FirewallPolicyArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallPolicyName: js.UndefOr[ResourceName] = js.undefined
    ): DeleteFirewallPolicyRequest = {
      val __obj = js.Dynamic.literal()
      FirewallPolicyArn.foreach(__v => __obj.updateDynamic("FirewallPolicyArn")(__v.asInstanceOf[js.Any]))
      FirewallPolicyName.foreach(__v => __obj.updateDynamic("FirewallPolicyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFirewallPolicyRequest]
    }
  }

  @js.native
  trait DeleteFirewallPolicyResponse extends js.Object {
    var FirewallPolicyResponse: FirewallPolicyResponse
  }

  object DeleteFirewallPolicyResponse {
    @inline
    def apply(
        FirewallPolicyResponse: FirewallPolicyResponse
    ): DeleteFirewallPolicyResponse = {
      val __obj = js.Dynamic.literal(
        "FirewallPolicyResponse" -> FirewallPolicyResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFirewallPolicyResponse]
    }
  }

  @js.native
  trait DeleteFirewallRequest extends js.Object {
    var FirewallArn: js.UndefOr[ResourceArn]
    var FirewallName: js.UndefOr[ResourceName]
  }

  object DeleteFirewallRequest {
    @inline
    def apply(
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallName: js.UndefOr[ResourceName] = js.undefined
    ): DeleteFirewallRequest = {
      val __obj = js.Dynamic.literal()
      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFirewallRequest]
    }
  }

  @js.native
  trait DeleteFirewallResponse extends js.Object {
    var Firewall: js.UndefOr[Firewall]
    var FirewallStatus: js.UndefOr[FirewallStatus]
  }

  object DeleteFirewallResponse {
    @inline
    def apply(
        Firewall: js.UndefOr[Firewall] = js.undefined,
        FirewallStatus: js.UndefOr[FirewallStatus] = js.undefined
    ): DeleteFirewallResponse = {
      val __obj = js.Dynamic.literal()
      Firewall.foreach(__v => __obj.updateDynamic("Firewall")(__v.asInstanceOf[js.Any]))
      FirewallStatus.foreach(__v => __obj.updateDynamic("FirewallStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFirewallResponse]
    }
  }

  @js.native
  trait DeleteResourcePolicyRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object DeleteResourcePolicyRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn
    ): DeleteResourcePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteResourcePolicyRequest]
    }
  }

  @js.native
  trait DeleteResourcePolicyResponse extends js.Object

  object DeleteResourcePolicyResponse {
    @inline
    def apply(): DeleteResourcePolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteResourcePolicyResponse]
    }
  }

  @js.native
  trait DeleteRuleGroupRequest extends js.Object {
    var RuleGroupArn: js.UndefOr[ResourceArn]
    var RuleGroupName: js.UndefOr[ResourceName]
    var Type: js.UndefOr[RuleGroupType]
  }

  object DeleteRuleGroupRequest {
    @inline
    def apply(
        RuleGroupArn: js.UndefOr[ResourceArn] = js.undefined,
        RuleGroupName: js.UndefOr[ResourceName] = js.undefined,
        Type: js.UndefOr[RuleGroupType] = js.undefined
    ): DeleteRuleGroupRequest = {
      val __obj = js.Dynamic.literal()
      RuleGroupArn.foreach(__v => __obj.updateDynamic("RuleGroupArn")(__v.asInstanceOf[js.Any]))
      RuleGroupName.foreach(__v => __obj.updateDynamic("RuleGroupName")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRuleGroupRequest]
    }
  }

  @js.native
  trait DeleteRuleGroupResponse extends js.Object {
    var RuleGroupResponse: RuleGroupResponse
  }

  object DeleteRuleGroupResponse {
    @inline
    def apply(
        RuleGroupResponse: RuleGroupResponse
    ): DeleteRuleGroupResponse = {
      val __obj = js.Dynamic.literal(
        "RuleGroupResponse" -> RuleGroupResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRuleGroupResponse]
    }
  }

  @js.native
  trait DescribeFirewallPolicyRequest extends js.Object {
    var FirewallPolicyArn: js.UndefOr[ResourceArn]
    var FirewallPolicyName: js.UndefOr[ResourceName]
  }

  object DescribeFirewallPolicyRequest {
    @inline
    def apply(
        FirewallPolicyArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallPolicyName: js.UndefOr[ResourceName] = js.undefined
    ): DescribeFirewallPolicyRequest = {
      val __obj = js.Dynamic.literal()
      FirewallPolicyArn.foreach(__v => __obj.updateDynamic("FirewallPolicyArn")(__v.asInstanceOf[js.Any]))
      FirewallPolicyName.foreach(__v => __obj.updateDynamic("FirewallPolicyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFirewallPolicyRequest]
    }
  }

  @js.native
  trait DescribeFirewallPolicyResponse extends js.Object {
    var FirewallPolicyResponse: FirewallPolicyResponse
    var UpdateToken: UpdateToken
    var FirewallPolicy: js.UndefOr[FirewallPolicy]
  }

  object DescribeFirewallPolicyResponse {
    @inline
    def apply(
        FirewallPolicyResponse: FirewallPolicyResponse,
        UpdateToken: UpdateToken,
        FirewallPolicy: js.UndefOr[FirewallPolicy] = js.undefined
    ): DescribeFirewallPolicyResponse = {
      val __obj = js.Dynamic.literal(
        "FirewallPolicyResponse" -> FirewallPolicyResponse.asInstanceOf[js.Any],
        "UpdateToken" -> UpdateToken.asInstanceOf[js.Any]
      )

      FirewallPolicy.foreach(__v => __obj.updateDynamic("FirewallPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFirewallPolicyResponse]
    }
  }

  @js.native
  trait DescribeFirewallRequest extends js.Object {
    var FirewallArn: js.UndefOr[ResourceArn]
    var FirewallName: js.UndefOr[ResourceName]
  }

  object DescribeFirewallRequest {
    @inline
    def apply(
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallName: js.UndefOr[ResourceName] = js.undefined
    ): DescribeFirewallRequest = {
      val __obj = js.Dynamic.literal()
      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFirewallRequest]
    }
  }

  @js.native
  trait DescribeFirewallResponse extends js.Object {
    var Firewall: js.UndefOr[Firewall]
    var FirewallStatus: js.UndefOr[FirewallStatus]
    var UpdateToken: js.UndefOr[UpdateToken]
  }

  object DescribeFirewallResponse {
    @inline
    def apply(
        Firewall: js.UndefOr[Firewall] = js.undefined,
        FirewallStatus: js.UndefOr[FirewallStatus] = js.undefined,
        UpdateToken: js.UndefOr[UpdateToken] = js.undefined
    ): DescribeFirewallResponse = {
      val __obj = js.Dynamic.literal()
      Firewall.foreach(__v => __obj.updateDynamic("Firewall")(__v.asInstanceOf[js.Any]))
      FirewallStatus.foreach(__v => __obj.updateDynamic("FirewallStatus")(__v.asInstanceOf[js.Any]))
      UpdateToken.foreach(__v => __obj.updateDynamic("UpdateToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFirewallResponse]
    }
  }

  @js.native
  trait DescribeLoggingConfigurationRequest extends js.Object {
    var FirewallArn: js.UndefOr[ResourceArn]
    var FirewallName: js.UndefOr[ResourceName]
  }

  object DescribeLoggingConfigurationRequest {
    @inline
    def apply(
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallName: js.UndefOr[ResourceName] = js.undefined
    ): DescribeLoggingConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLoggingConfigurationRequest]
    }
  }

  @js.native
  trait DescribeLoggingConfigurationResponse extends js.Object {
    var FirewallArn: js.UndefOr[ResourceArn]
    var LoggingConfiguration: js.UndefOr[LoggingConfiguration]
  }

  object DescribeLoggingConfigurationResponse {
    @inline
    def apply(
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        LoggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined
    ): DescribeLoggingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      LoggingConfiguration.foreach(__v => __obj.updateDynamic("LoggingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLoggingConfigurationResponse]
    }
  }

  @js.native
  trait DescribeResourcePolicyRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object DescribeResourcePolicyRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn
    ): DescribeResourcePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeResourcePolicyRequest]
    }
  }

  @js.native
  trait DescribeResourcePolicyResponse extends js.Object {
    var Policy: js.UndefOr[PolicyString]
  }

  object DescribeResourcePolicyResponse {
    @inline
    def apply(
        Policy: js.UndefOr[PolicyString] = js.undefined
    ): DescribeResourcePolicyResponse = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeResourcePolicyResponse]
    }
  }

  @js.native
  trait DescribeRuleGroupMetadataRequest extends js.Object {
    var RuleGroupArn: js.UndefOr[ResourceArn]
    var RuleGroupName: js.UndefOr[ResourceName]
    var Type: js.UndefOr[RuleGroupType]
  }

  object DescribeRuleGroupMetadataRequest {
    @inline
    def apply(
        RuleGroupArn: js.UndefOr[ResourceArn] = js.undefined,
        RuleGroupName: js.UndefOr[ResourceName] = js.undefined,
        Type: js.UndefOr[RuleGroupType] = js.undefined
    ): DescribeRuleGroupMetadataRequest = {
      val __obj = js.Dynamic.literal()
      RuleGroupArn.foreach(__v => __obj.updateDynamic("RuleGroupArn")(__v.asInstanceOf[js.Any]))
      RuleGroupName.foreach(__v => __obj.updateDynamic("RuleGroupName")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRuleGroupMetadataRequest]
    }
  }

  @js.native
  trait DescribeRuleGroupMetadataResponse extends js.Object {
    var RuleGroupArn: ResourceArn
    var RuleGroupName: ResourceName
    var Capacity: js.UndefOr[RuleCapacity]
    var Description: js.UndefOr[Description]
    var LastModifiedTime: js.UndefOr[LastUpdateTime]
    var StatefulRuleOptions: js.UndefOr[StatefulRuleOptions]
    var Type: js.UndefOr[RuleGroupType]
  }

  object DescribeRuleGroupMetadataResponse {
    @inline
    def apply(
        RuleGroupArn: ResourceArn,
        RuleGroupName: ResourceName,
        Capacity: js.UndefOr[RuleCapacity] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        LastModifiedTime: js.UndefOr[LastUpdateTime] = js.undefined,
        StatefulRuleOptions: js.UndefOr[StatefulRuleOptions] = js.undefined,
        Type: js.UndefOr[RuleGroupType] = js.undefined
    ): DescribeRuleGroupMetadataResponse = {
      val __obj = js.Dynamic.literal(
        "RuleGroupArn" -> RuleGroupArn.asInstanceOf[js.Any],
        "RuleGroupName" -> RuleGroupName.asInstanceOf[js.Any]
      )

      Capacity.foreach(__v => __obj.updateDynamic("Capacity")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      StatefulRuleOptions.foreach(__v => __obj.updateDynamic("StatefulRuleOptions")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRuleGroupMetadataResponse]
    }
  }

  @js.native
  trait DescribeRuleGroupRequest extends js.Object {
    var RuleGroupArn: js.UndefOr[ResourceArn]
    var RuleGroupName: js.UndefOr[ResourceName]
    var Type: js.UndefOr[RuleGroupType]
  }

  object DescribeRuleGroupRequest {
    @inline
    def apply(
        RuleGroupArn: js.UndefOr[ResourceArn] = js.undefined,
        RuleGroupName: js.UndefOr[ResourceName] = js.undefined,
        Type: js.UndefOr[RuleGroupType] = js.undefined
    ): DescribeRuleGroupRequest = {
      val __obj = js.Dynamic.literal()
      RuleGroupArn.foreach(__v => __obj.updateDynamic("RuleGroupArn")(__v.asInstanceOf[js.Any]))
      RuleGroupName.foreach(__v => __obj.updateDynamic("RuleGroupName")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRuleGroupRequest]
    }
  }

  @js.native
  trait DescribeRuleGroupResponse extends js.Object {
    var RuleGroupResponse: RuleGroupResponse
    var UpdateToken: UpdateToken
    var RuleGroup: js.UndefOr[RuleGroup]
  }

  object DescribeRuleGroupResponse {
    @inline
    def apply(
        RuleGroupResponse: RuleGroupResponse,
        UpdateToken: UpdateToken,
        RuleGroup: js.UndefOr[RuleGroup] = js.undefined
    ): DescribeRuleGroupResponse = {
      val __obj = js.Dynamic.literal(
        "RuleGroupResponse" -> RuleGroupResponse.asInstanceOf[js.Any],
        "UpdateToken" -> UpdateToken.asInstanceOf[js.Any]
      )

      RuleGroup.foreach(__v => __obj.updateDynamic("RuleGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRuleGroupResponse]
    }
  }

  /** The value to use in an Amazon CloudWatch custom metric dimension. This is used in the <code>PublishMetrics</code> <a>CustomAction</a>. A CloudWatch custom metric dimension is a name/value pair that's part of the identity of a metric. Network Firewall sets the dimension name to <code>CustomAction</code> and you provide the dimension value. For more information about CloudWatch custom metric dimensions, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html#usingDimensions|Publishing Custom Metrics]] in the [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html|Amazon CloudWatch User Guide]].
    */
  @js.native
  trait Dimension extends js.Object {
    var Value: DimensionValue
  }

  object Dimension {
    @inline
    def apply(
        Value: DimensionValue
    ): Dimension = {
      val __obj = js.Dynamic.literal(
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Dimension]
    }
  }

  @js.native
  trait DisassociateSubnetsRequest extends js.Object {
    var SubnetIds: AzSubnets
    var FirewallArn: js.UndefOr[ResourceArn]
    var FirewallName: js.UndefOr[ResourceName]
    var UpdateToken: js.UndefOr[UpdateToken]
  }

  object DisassociateSubnetsRequest {
    @inline
    def apply(
        SubnetIds: AzSubnets,
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallName: js.UndefOr[ResourceName] = js.undefined,
        UpdateToken: js.UndefOr[UpdateToken] = js.undefined
    ): DisassociateSubnetsRequest = {
      val __obj = js.Dynamic.literal(
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any]
      )

      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      UpdateToken.foreach(__v => __obj.updateDynamic("UpdateToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateSubnetsRequest]
    }
  }

  @js.native
  trait DisassociateSubnetsResponse extends js.Object {
    var FirewallArn: js.UndefOr[ResourceArn]
    var FirewallName: js.UndefOr[ResourceName]
    var SubnetMappings: js.UndefOr[SubnetMappings]
    var UpdateToken: js.UndefOr[UpdateToken]
  }

  object DisassociateSubnetsResponse {
    @inline
    def apply(
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallName: js.UndefOr[ResourceName] = js.undefined,
        SubnetMappings: js.UndefOr[SubnetMappings] = js.undefined,
        UpdateToken: js.UndefOr[UpdateToken] = js.undefined
    ): DisassociateSubnetsResponse = {
      val __obj = js.Dynamic.literal()
      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      SubnetMappings.foreach(__v => __obj.updateDynamic("SubnetMappings")(__v.asInstanceOf[js.Any]))
      UpdateToken.foreach(__v => __obj.updateDynamic("UpdateToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateSubnetsResponse]
    }
  }

  /** A complex type that contains optional Amazon Web Services Key Management Service (KMS) encryption settings for your Network Firewall resources. Your data is encrypted by default with an Amazon Web Services owned key that Amazon Web Services owns and manages for you. You can use either the Amazon Web Services owned key, or provide your own customer managed key. To learn more about KMS encryption of your Network Firewall resources, see [[https://docs.aws.amazon.com/kms/latest/developerguide/kms-encryption-at-rest.html|Encryption at rest with Amazon Web Services Key Managment Service]] in the <i>Network Firewall Developer Guide</i>.
    */
  @js.native
  trait EncryptionConfiguration extends js.Object {
    var Type: EncryptionType
    var KeyId: js.UndefOr[KeyId]
  }

  object EncryptionConfiguration {
    @inline
    def apply(
        Type: EncryptionType,
        KeyId: js.UndefOr[KeyId] = js.undefined
    ): EncryptionConfiguration = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      KeyId.foreach(__v => __obj.updateDynamic("KeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptionConfiguration]
    }
  }

  /** The firewall defines the configuration settings for an Network Firewall firewall. These settings include the firewall policy, the subnets in your VPC to use for the firewall endpoints, and any tags that are attached to the firewall Amazon Web Services resource. The status of the firewall, for example whether it's ready to filter network traffic, is provided in the corresponding <a>FirewallStatus</a>. You can retrieve both objects by calling <a>DescribeFirewall</a>.
    */
  @js.native
  trait Firewall extends js.Object {
    var FirewallId: ResourceId
    var FirewallPolicyArn: ResourceArn
    var SubnetMappings: SubnetMappings
    var VpcId: VpcId
    var DeleteProtection: js.UndefOr[Boolean]
    var Description: js.UndefOr[Description]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var FirewallArn: js.UndefOr[ResourceArn]
    var FirewallName: js.UndefOr[ResourceName]
    var FirewallPolicyChangeProtection: js.UndefOr[Boolean]
    var SubnetChangeProtection: js.UndefOr[Boolean]
    var Tags: js.UndefOr[TagList]
  }

  object Firewall {
    @inline
    def apply(
        FirewallId: ResourceId,
        FirewallPolicyArn: ResourceArn,
        SubnetMappings: SubnetMappings,
        VpcId: VpcId,
        DeleteProtection: js.UndefOr[Boolean] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallName: js.UndefOr[ResourceName] = js.undefined,
        FirewallPolicyChangeProtection: js.UndefOr[Boolean] = js.undefined,
        SubnetChangeProtection: js.UndefOr[Boolean] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): Firewall = {
      val __obj = js.Dynamic.literal(
        "FirewallId" -> FirewallId.asInstanceOf[js.Any],
        "FirewallPolicyArn" -> FirewallPolicyArn.asInstanceOf[js.Any],
        "SubnetMappings" -> SubnetMappings.asInstanceOf[js.Any],
        "VpcId" -> VpcId.asInstanceOf[js.Any]
      )

      DeleteProtection.foreach(__v => __obj.updateDynamic("DeleteProtection")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EncryptionConfiguration.foreach(__v => __obj.updateDynamic("EncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      FirewallPolicyChangeProtection.foreach(__v => __obj.updateDynamic("FirewallPolicyChangeProtection")(__v.asInstanceOf[js.Any]))
      SubnetChangeProtection.foreach(__v => __obj.updateDynamic("SubnetChangeProtection")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Firewall]
    }
  }

  /** High-level information about a firewall, returned by operations like create and describe. You can use the information provided in the metadata to retrieve and manage a firewall.
    */
  @js.native
  trait FirewallMetadata extends js.Object {
    var FirewallArn: js.UndefOr[ResourceArn]
    var FirewallName: js.UndefOr[ResourceName]
  }

  object FirewallMetadata {
    @inline
    def apply(
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallName: js.UndefOr[ResourceName] = js.undefined
    ): FirewallMetadata = {
      val __obj = js.Dynamic.literal()
      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FirewallMetadata]
    }
  }

  /** The firewall policy defines the behavior of a firewall using a collection of stateless and stateful rule groups and other settings. You can use one firewall policy for multiple firewalls. This, along with <a>FirewallPolicyResponse</a>, define the policy. You can retrieve all objects for a firewall policy by calling <a>DescribeFirewallPolicy</a>.
    */
  @js.native
  trait FirewallPolicy extends js.Object {
    var StatelessDefaultActions: StatelessActions
    var StatelessFragmentDefaultActions: StatelessActions
    var StatefulDefaultActions: js.UndefOr[StatefulActions]
    var StatefulEngineOptions: js.UndefOr[StatefulEngineOptions]
    var StatefulRuleGroupReferences: js.UndefOr[StatefulRuleGroupReferences]
    var StatelessCustomActions: js.UndefOr[CustomActions]
    var StatelessRuleGroupReferences: js.UndefOr[StatelessRuleGroupReferences]
  }

  object FirewallPolicy {
    @inline
    def apply(
        StatelessDefaultActions: StatelessActions,
        StatelessFragmentDefaultActions: StatelessActions,
        StatefulDefaultActions: js.UndefOr[StatefulActions] = js.undefined,
        StatefulEngineOptions: js.UndefOr[StatefulEngineOptions] = js.undefined,
        StatefulRuleGroupReferences: js.UndefOr[StatefulRuleGroupReferences] = js.undefined,
        StatelessCustomActions: js.UndefOr[CustomActions] = js.undefined,
        StatelessRuleGroupReferences: js.UndefOr[StatelessRuleGroupReferences] = js.undefined
    ): FirewallPolicy = {
      val __obj = js.Dynamic.literal(
        "StatelessDefaultActions" -> StatelessDefaultActions.asInstanceOf[js.Any],
        "StatelessFragmentDefaultActions" -> StatelessFragmentDefaultActions.asInstanceOf[js.Any]
      )

      StatefulDefaultActions.foreach(__v => __obj.updateDynamic("StatefulDefaultActions")(__v.asInstanceOf[js.Any]))
      StatefulEngineOptions.foreach(__v => __obj.updateDynamic("StatefulEngineOptions")(__v.asInstanceOf[js.Any]))
      StatefulRuleGroupReferences.foreach(__v => __obj.updateDynamic("StatefulRuleGroupReferences")(__v.asInstanceOf[js.Any]))
      StatelessCustomActions.foreach(__v => __obj.updateDynamic("StatelessCustomActions")(__v.asInstanceOf[js.Any]))
      StatelessRuleGroupReferences.foreach(__v => __obj.updateDynamic("StatelessRuleGroupReferences")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FirewallPolicy]
    }
  }

  /** High-level information about a firewall policy, returned by operations like create and describe. You can use the information provided in the metadata to retrieve and manage a firewall policy. You can retrieve all objects for a firewall policy by calling <a>DescribeFirewallPolicy</a>.
    */
  @js.native
  trait FirewallPolicyMetadata extends js.Object {
    var Arn: js.UndefOr[ResourceArn]
    var Name: js.UndefOr[ResourceName]
  }

  object FirewallPolicyMetadata {
    @inline
    def apply(
        Arn: js.UndefOr[ResourceArn] = js.undefined,
        Name: js.UndefOr[ResourceName] = js.undefined
    ): FirewallPolicyMetadata = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FirewallPolicyMetadata]
    }
  }

  /** The high-level properties of a firewall policy. This, along with the <a>FirewallPolicy</a>, define the policy. You can retrieve all objects for a firewall policy by calling <a>DescribeFirewallPolicy</a>.
    */
  @js.native
  trait FirewallPolicyResponse extends js.Object {
    var FirewallPolicyArn: ResourceArn
    var FirewallPolicyId: ResourceId
    var FirewallPolicyName: ResourceName
    var ConsumedStatefulRuleCapacity: js.UndefOr[RuleCapacity]
    var ConsumedStatelessRuleCapacity: js.UndefOr[RuleCapacity]
    var Description: js.UndefOr[Description]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var FirewallPolicyStatus: js.UndefOr[ResourceStatus]
    var LastModifiedTime: js.UndefOr[LastUpdateTime]
    var NumberOfAssociations: js.UndefOr[NumberOfAssociations]
    var Tags: js.UndefOr[TagList]
  }

  object FirewallPolicyResponse {
    @inline
    def apply(
        FirewallPolicyArn: ResourceArn,
        FirewallPolicyId: ResourceId,
        FirewallPolicyName: ResourceName,
        ConsumedStatefulRuleCapacity: js.UndefOr[RuleCapacity] = js.undefined,
        ConsumedStatelessRuleCapacity: js.UndefOr[RuleCapacity] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        FirewallPolicyStatus: js.UndefOr[ResourceStatus] = js.undefined,
        LastModifiedTime: js.UndefOr[LastUpdateTime] = js.undefined,
        NumberOfAssociations: js.UndefOr[NumberOfAssociations] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): FirewallPolicyResponse = {
      val __obj = js.Dynamic.literal(
        "FirewallPolicyArn" -> FirewallPolicyArn.asInstanceOf[js.Any],
        "FirewallPolicyId" -> FirewallPolicyId.asInstanceOf[js.Any],
        "FirewallPolicyName" -> FirewallPolicyName.asInstanceOf[js.Any]
      )

      ConsumedStatefulRuleCapacity.foreach(__v => __obj.updateDynamic("ConsumedStatefulRuleCapacity")(__v.asInstanceOf[js.Any]))
      ConsumedStatelessRuleCapacity.foreach(__v => __obj.updateDynamic("ConsumedStatelessRuleCapacity")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EncryptionConfiguration.foreach(__v => __obj.updateDynamic("EncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      FirewallPolicyStatus.foreach(__v => __obj.updateDynamic("FirewallPolicyStatus")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      NumberOfAssociations.foreach(__v => __obj.updateDynamic("NumberOfAssociations")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FirewallPolicyResponse]
    }
  }

  /** Detailed information about the current status of a <a>Firewall</a>. You can retrieve this for a firewall by calling <a>DescribeFirewall</a> and providing the firewall name and ARN.
    */
  @js.native
  trait FirewallStatus extends js.Object {
    var ConfigurationSyncStateSummary: ConfigurationSyncState
    var Status: FirewallStatusValue
    var CapacityUsageSummary: js.UndefOr[CapacityUsageSummary]
    var SyncStates: js.UndefOr[SyncStates]
  }

  object FirewallStatus {
    @inline
    def apply(
        ConfigurationSyncStateSummary: ConfigurationSyncState,
        Status: FirewallStatusValue,
        CapacityUsageSummary: js.UndefOr[CapacityUsageSummary] = js.undefined,
        SyncStates: js.UndefOr[SyncStates] = js.undefined
    ): FirewallStatus = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSyncStateSummary" -> ConfigurationSyncStateSummary.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      CapacityUsageSummary.foreach(__v => __obj.updateDynamic("CapacityUsageSummary")(__v.asInstanceOf[js.Any]))
      SyncStates.foreach(__v => __obj.updateDynamic("SyncStates")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FirewallStatus]
    }
  }

  /** The basic rule criteria for Network Firewall to use to inspect packet headers in stateful traffic flow inspection. Traffic flows that match the criteria are a match for the corresponding <a>StatefulRule</a>.
    */
  @js.native
  trait Header extends js.Object {
    var Destination: Destination
    var DestinationPort: Port
    var Direction: StatefulRuleDirection
    var Protocol: StatefulRuleProtocol
    var Source: Source
    var SourcePort: Port
  }

  object Header {
    @inline
    def apply(
        Destination: Destination,
        DestinationPort: Port,
        Direction: StatefulRuleDirection,
        Protocol: StatefulRuleProtocol,
        Source: Source,
        SourcePort: Port
    ): Header = {
      val __obj = js.Dynamic.literal(
        "Destination" -> Destination.asInstanceOf[js.Any],
        "DestinationPort" -> DestinationPort.asInstanceOf[js.Any],
        "Direction" -> Direction.asInstanceOf[js.Any],
        "Protocol" -> Protocol.asInstanceOf[js.Any],
        "Source" -> Source.asInstanceOf[js.Any],
        "SourcePort" -> SourcePort.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Header]
    }
  }

  /** A list of IP addresses and address ranges, in CIDR notation. This is part of a <a>RuleVariables</a>.
    */
  @js.native
  trait IPSet extends js.Object {
    var Definition: VariableDefinitionList
  }

  object IPSet {
    @inline
    def apply(
        Definition: VariableDefinitionList
    ): IPSet = {
      val __obj = js.Dynamic.literal(
        "Definition" -> Definition.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IPSet]
    }
  }

  /** General information about the IP set.
    */
  @js.native
  trait IPSetMetadata extends js.Object {
    var ResolvedCIDRCount: js.UndefOr[CIDRCount]
  }

  object IPSetMetadata {
    @inline
    def apply(
        ResolvedCIDRCount: js.UndefOr[CIDRCount] = js.undefined
    ): IPSetMetadata = {
      val __obj = js.Dynamic.literal()
      ResolvedCIDRCount.foreach(__v => __obj.updateDynamic("ResolvedCIDRCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IPSetMetadata]
    }
  }

  /** Configures one or more IP set references for a Suricata-compatible rule group. This is used in <a>CreateRuleGroup</a> or <a>UpdateRuleGroup</a>. An IP set reference is a rule variable that references a resource that you create and manage in another Amazon Web Services service, such as an Amazon VPC prefix list. Network Firewall IP set references enable you to dynamically update the contents of your rules. When you create, update, or delete the IP set you are referencing in your rule, Network Firewall automatically updates the rule's content with the changes. For more information about IP set references in Network Firewall, see [[https://docs.aws.amazon.com/network-firewall/latest/developerguide/rule-groups-ip-set-references|Using IP set references]] in the <i>Network Firewall Developer Guide</i>. Network Firewall currently supports only [[https://docs.aws.amazon.com/vpc/latest/userguide/managed-prefix-lists.html|Amazon VPC prefix lists]] as IP set references.
    */
  @js.native
  trait IPSetReference extends js.Object {
    var ReferenceArn: js.UndefOr[ResourceArn]
  }

  object IPSetReference {
    @inline
    def apply(
        ReferenceArn: js.UndefOr[ResourceArn] = js.undefined
    ): IPSetReference = {
      val __obj = js.Dynamic.literal()
      ReferenceArn.foreach(__v => __obj.updateDynamic("ReferenceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IPSetReference]
    }
  }

  @js.native
  trait ListFirewallPoliciesRequest extends js.Object {
    var MaxResults: js.UndefOr[PaginationMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListFirewallPoliciesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListFirewallPoliciesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFirewallPoliciesRequest]
    }
  }

  @js.native
  trait ListFirewallPoliciesResponse extends js.Object {
    var FirewallPolicies: js.UndefOr[FirewallPolicies]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListFirewallPoliciesResponse {
    @inline
    def apply(
        FirewallPolicies: js.UndefOr[FirewallPolicies] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListFirewallPoliciesResponse = {
      val __obj = js.Dynamic.literal()
      FirewallPolicies.foreach(__v => __obj.updateDynamic("FirewallPolicies")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFirewallPoliciesResponse]
    }
  }

  @js.native
  trait ListFirewallsRequest extends js.Object {
    var MaxResults: js.UndefOr[PaginationMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
    var VpcIds: js.UndefOr[VpcIds]
  }

  object ListFirewallsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        VpcIds: js.UndefOr[VpcIds] = js.undefined
    ): ListFirewallsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      VpcIds.foreach(__v => __obj.updateDynamic("VpcIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFirewallsRequest]
    }
  }

  @js.native
  trait ListFirewallsResponse extends js.Object {
    var Firewalls: js.UndefOr[Firewalls]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListFirewallsResponse {
    @inline
    def apply(
        Firewalls: js.UndefOr[Firewalls] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListFirewallsResponse = {
      val __obj = js.Dynamic.literal()
      Firewalls.foreach(__v => __obj.updateDynamic("Firewalls")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFirewallsResponse]
    }
  }

  @js.native
  trait ListRuleGroupsRequest extends js.Object {
    var ManagedType: js.UndefOr[ResourceManagedType]
    var MaxResults: js.UndefOr[PaginationMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
    var Scope: js.UndefOr[ResourceManagedStatus]
    var Type: js.UndefOr[RuleGroupType]
  }

  object ListRuleGroupsRequest {
    @inline
    def apply(
        ManagedType: js.UndefOr[ResourceManagedType] = js.undefined,
        MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Scope: js.UndefOr[ResourceManagedStatus] = js.undefined,
        Type: js.UndefOr[RuleGroupType] = js.undefined
    ): ListRuleGroupsRequest = {
      val __obj = js.Dynamic.literal()
      ManagedType.foreach(__v => __obj.updateDynamic("ManagedType")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Scope.foreach(__v => __obj.updateDynamic("Scope")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRuleGroupsRequest]
    }
  }

  @js.native
  trait ListRuleGroupsResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var RuleGroups: js.UndefOr[RuleGroups]
  }

  object ListRuleGroupsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        RuleGroups: js.UndefOr[RuleGroups] = js.undefined
    ): ListRuleGroupsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RuleGroups.foreach(__v => __obj.updateDynamic("RuleGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRuleGroupsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var MaxResults: js.UndefOr[TagsPaginationMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn,
        MaxResults: js.UndefOr[TagsPaginationMaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
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
    var NextToken: js.UndefOr[PaginationToken]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Defines where Network Firewall sends logs for the firewall for one log type. This is used in <a>LoggingConfiguration</a>. You can send each type of log to an Amazon S3 bucket, a CloudWatch log group, or a Kinesis Data Firehose delivery stream. Network Firewall generates logs for stateful rule groups. You can save alert and flow log types. The stateful rules engine records flow logs for all network traffic that it receives. It records alert logs for traffic that matches stateful rules that have the rule action set to <code>DROP</code> or <code>ALERT</code>.
    */
  @js.native
  trait LogDestinationConfig extends js.Object {
    var LogDestination: LogDestinationMap
    var LogDestinationType: LogDestinationType
    var LogType: LogType
  }

  object LogDestinationConfig {
    @inline
    def apply(
        LogDestination: LogDestinationMap,
        LogDestinationType: LogDestinationType,
        LogType: LogType
    ): LogDestinationConfig = {
      val __obj = js.Dynamic.literal(
        "LogDestination" -> LogDestination.asInstanceOf[js.Any],
        "LogDestinationType" -> LogDestinationType.asInstanceOf[js.Any],
        "LogType" -> LogType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LogDestinationConfig]
    }
  }

  /** Defines how Network Firewall performs logging for a <a>Firewall</a>.
    */
  @js.native
  trait LoggingConfiguration extends js.Object {
    var LogDestinationConfigs: LogDestinationConfigs
  }

  object LoggingConfiguration {
    @inline
    def apply(
        LogDestinationConfigs: LogDestinationConfigs
    ): LoggingConfiguration = {
      val __obj = js.Dynamic.literal(
        "LogDestinationConfigs" -> LogDestinationConfigs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LoggingConfiguration]
    }
  }

  /** Criteria for Network Firewall to use to inspect an individual packet in stateless rule inspection. Each match attributes set can include one or more items such as IP address, CIDR range, port number, protocol, and TCP flags.
    */
  @js.native
  trait MatchAttributes extends js.Object {
    var DestinationPorts: js.UndefOr[PortRanges]
    var Destinations: js.UndefOr[Addresses]
    var Protocols: js.UndefOr[ProtocolNumbers]
    var SourcePorts: js.UndefOr[PortRanges]
    var Sources: js.UndefOr[Addresses]
    var TCPFlags: js.UndefOr[TCPFlags]
  }

  object MatchAttributes {
    @inline
    def apply(
        DestinationPorts: js.UndefOr[PortRanges] = js.undefined,
        Destinations: js.UndefOr[Addresses] = js.undefined,
        Protocols: js.UndefOr[ProtocolNumbers] = js.undefined,
        SourcePorts: js.UndefOr[PortRanges] = js.undefined,
        Sources: js.UndefOr[Addresses] = js.undefined,
        TCPFlags: js.UndefOr[TCPFlags] = js.undefined
    ): MatchAttributes = {
      val __obj = js.Dynamic.literal()
      DestinationPorts.foreach(__v => __obj.updateDynamic("DestinationPorts")(__v.asInstanceOf[js.Any]))
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      Protocols.foreach(__v => __obj.updateDynamic("Protocols")(__v.asInstanceOf[js.Any]))
      SourcePorts.foreach(__v => __obj.updateDynamic("SourcePorts")(__v.asInstanceOf[js.Any]))
      Sources.foreach(__v => __obj.updateDynamic("Sources")(__v.asInstanceOf[js.Any]))
      TCPFlags.foreach(__v => __obj.updateDynamic("TCPFlags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MatchAttributes]
    }
  }

  /** Provides configuration status for a single policy or rule group that is used for a firewall endpoint. Network Firewall provides each endpoint with the rules that are configured in the firewall policy. Each time you add a subnet or modify the associated firewall policy, Network Firewall synchronizes the rules in the endpoint, so it can properly filter network traffic. This is part of a <a>SyncState</a> for a firewall.
    */
  @js.native
  trait PerObjectStatus extends js.Object {
    var SyncStatus: js.UndefOr[PerObjectSyncStatus]
    var UpdateToken: js.UndefOr[UpdateToken]
  }

  object PerObjectStatus {
    @inline
    def apply(
        SyncStatus: js.UndefOr[PerObjectSyncStatus] = js.undefined,
        UpdateToken: js.UndefOr[UpdateToken] = js.undefined
    ): PerObjectStatus = {
      val __obj = js.Dynamic.literal()
      SyncStatus.foreach(__v => __obj.updateDynamic("SyncStatus")(__v.asInstanceOf[js.Any]))
      UpdateToken.foreach(__v => __obj.updateDynamic("UpdateToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PerObjectStatus]
    }
  }

  /** A single port range specification. This is used for source and destination port ranges in the stateless rule <a>MatchAttributes</a>, <code>SourcePorts</code>, and <code>DestinationPorts</code> settings.
    */
  @js.native
  trait PortRange extends js.Object {
    var FromPort: PortRangeBound
    var ToPort: PortRangeBound
  }

  object PortRange {
    @inline
    def apply(
        FromPort: PortRangeBound,
        ToPort: PortRangeBound
    ): PortRange = {
      val __obj = js.Dynamic.literal(
        "FromPort" -> FromPort.asInstanceOf[js.Any],
        "ToPort" -> ToPort.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PortRange]
    }
  }

  /** A set of port ranges for use in the rules in a rule group.
    */
  @js.native
  trait PortSet extends js.Object {
    var Definition: js.UndefOr[VariableDefinitionList]
  }

  object PortSet {
    @inline
    def apply(
        Definition: js.UndefOr[VariableDefinitionList] = js.undefined
    ): PortSet = {
      val __obj = js.Dynamic.literal()
      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortSet]
    }
  }

  /** Stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for the matching packet. This setting defines a CloudWatch dimension value to be published.
    */
  @js.native
  trait PublishMetricAction extends js.Object {
    var Dimensions: Dimensions
  }

  object PublishMetricAction {
    @inline
    def apply(
        Dimensions: Dimensions
    ): PublishMetricAction = {
      val __obj = js.Dynamic.literal(
        "Dimensions" -> Dimensions.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PublishMetricAction]
    }
  }

  @js.native
  trait PutResourcePolicyRequest extends js.Object {
    var Policy: PolicyString
    var ResourceArn: ResourceArn
  }

  object PutResourcePolicyRequest {
    @inline
    def apply(
        Policy: PolicyString,
        ResourceArn: ResourceArn
    ): PutResourcePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Policy" -> Policy.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutResourcePolicyRequest]
    }
  }

  @js.native
  trait PutResourcePolicyResponse extends js.Object

  object PutResourcePolicyResponse {
    @inline
    def apply(): PutResourcePolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutResourcePolicyResponse]
    }
  }

  /** Contains a set of IP set references.
    */
  @js.native
  trait ReferenceSets extends js.Object {
    var IPSetReferences: js.UndefOr[IPSetReferenceMap]
  }

  object ReferenceSets {
    @inline
    def apply(
        IPSetReferences: js.UndefOr[IPSetReferenceMap] = js.undefined
    ): ReferenceSets = {
      val __obj = js.Dynamic.literal()
      IPSetReferences.foreach(__v => __obj.updateDynamic("IPSetReferences")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReferenceSets]
    }
  }

  /** The inspection criteria and action for a single stateless rule. Network Firewall inspects each packet for the specified matching criteria. When a packet matches the criteria, Network Firewall performs the rule's actions on the packet.
    */
  @js.native
  trait RuleDefinition extends js.Object {
    var Actions: StatelessActions
    var MatchAttributes: MatchAttributes
  }

  object RuleDefinition {
    @inline
    def apply(
        Actions: StatelessActions,
        MatchAttributes: MatchAttributes
    ): RuleDefinition = {
      val __obj = js.Dynamic.literal(
        "Actions" -> Actions.asInstanceOf[js.Any],
        "MatchAttributes" -> MatchAttributes.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RuleDefinition]
    }
  }

  /** The object that defines the rules in a rule group. This, along with <a>RuleGroupResponse</a>, define the rule group. You can retrieve all objects for a rule group by calling <a>DescribeRuleGroup</a>. Network Firewall uses a rule group to inspect and control network traffic. You define stateless rule groups to inspect individual packets and you define stateful rule groups to inspect packets in the context of their traffic flow. To use a rule group, you include it by reference in an Network Firewall firewall policy, then you use the policy in a firewall. You can reference a rule group from more than one firewall policy, and you can use a firewall policy in more than one firewall.
    */
  @js.native
  trait RuleGroup extends js.Object {
    var RulesSource: RulesSource
    var ReferenceSets: js.UndefOr[ReferenceSets]
    var RuleVariables: js.UndefOr[RuleVariables]
    var StatefulRuleOptions: js.UndefOr[StatefulRuleOptions]
  }

  object RuleGroup {
    @inline
    def apply(
        RulesSource: RulesSource,
        ReferenceSets: js.UndefOr[ReferenceSets] = js.undefined,
        RuleVariables: js.UndefOr[RuleVariables] = js.undefined,
        StatefulRuleOptions: js.UndefOr[StatefulRuleOptions] = js.undefined
    ): RuleGroup = {
      val __obj = js.Dynamic.literal(
        "RulesSource" -> RulesSource.asInstanceOf[js.Any]
      )

      ReferenceSets.foreach(__v => __obj.updateDynamic("ReferenceSets")(__v.asInstanceOf[js.Any]))
      RuleVariables.foreach(__v => __obj.updateDynamic("RuleVariables")(__v.asInstanceOf[js.Any]))
      StatefulRuleOptions.foreach(__v => __obj.updateDynamic("StatefulRuleOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroup]
    }
  }

  /** High-level information about a rule group, returned by <a>ListRuleGroups</a>. You can use the information provided in the metadata to retrieve and manage a rule group.
    */
  @js.native
  trait RuleGroupMetadata extends js.Object {
    var Arn: js.UndefOr[ResourceArn]
    var Name: js.UndefOr[ResourceName]
  }

  object RuleGroupMetadata {
    @inline
    def apply(
        Arn: js.UndefOr[ResourceArn] = js.undefined,
        Name: js.UndefOr[ResourceName] = js.undefined
    ): RuleGroupMetadata = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupMetadata]
    }
  }

  /** The high-level properties of a rule group. This, along with the <a>RuleGroup</a>, define the rule group. You can retrieve all objects for a rule group by calling <a>DescribeRuleGroup</a>.
    */
  @js.native
  trait RuleGroupResponse extends js.Object {
    var RuleGroupArn: ResourceArn
    var RuleGroupId: ResourceId
    var RuleGroupName: ResourceName
    var Capacity: js.UndefOr[RuleCapacity]
    var ConsumedCapacity: js.UndefOr[RuleCapacity]
    var Description: js.UndefOr[Description]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var LastModifiedTime: js.UndefOr[LastUpdateTime]
    var NumberOfAssociations: js.UndefOr[NumberOfAssociations]
    var RuleGroupStatus: js.UndefOr[ResourceStatus]
    var SnsTopic: js.UndefOr[ResourceArn]
    var SourceMetadata: js.UndefOr[SourceMetadata]
    var Tags: js.UndefOr[TagList]
    var Type: js.UndefOr[RuleGroupType]
  }

  object RuleGroupResponse {
    @inline
    def apply(
        RuleGroupArn: ResourceArn,
        RuleGroupId: ResourceId,
        RuleGroupName: ResourceName,
        Capacity: js.UndefOr[RuleCapacity] = js.undefined,
        ConsumedCapacity: js.UndefOr[RuleCapacity] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        LastModifiedTime: js.UndefOr[LastUpdateTime] = js.undefined,
        NumberOfAssociations: js.UndefOr[NumberOfAssociations] = js.undefined,
        RuleGroupStatus: js.UndefOr[ResourceStatus] = js.undefined,
        SnsTopic: js.UndefOr[ResourceArn] = js.undefined,
        SourceMetadata: js.UndefOr[SourceMetadata] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        Type: js.UndefOr[RuleGroupType] = js.undefined
    ): RuleGroupResponse = {
      val __obj = js.Dynamic.literal(
        "RuleGroupArn" -> RuleGroupArn.asInstanceOf[js.Any],
        "RuleGroupId" -> RuleGroupId.asInstanceOf[js.Any],
        "RuleGroupName" -> RuleGroupName.asInstanceOf[js.Any]
      )

      Capacity.foreach(__v => __obj.updateDynamic("Capacity")(__v.asInstanceOf[js.Any]))
      ConsumedCapacity.foreach(__v => __obj.updateDynamic("ConsumedCapacity")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EncryptionConfiguration.foreach(__v => __obj.updateDynamic("EncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      NumberOfAssociations.foreach(__v => __obj.updateDynamic("NumberOfAssociations")(__v.asInstanceOf[js.Any]))
      RuleGroupStatus.foreach(__v => __obj.updateDynamic("RuleGroupStatus")(__v.asInstanceOf[js.Any]))
      SnsTopic.foreach(__v => __obj.updateDynamic("SnsTopic")(__v.asInstanceOf[js.Any]))
      SourceMetadata.foreach(__v => __obj.updateDynamic("SourceMetadata")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupResponse]
    }
  }

  /** Additional settings for a stateful rule. This is part of the <a>StatefulRule</a> configuration.
    */
  @js.native
  trait RuleOption extends js.Object {
    var Keyword: Keyword
    var Settings: js.UndefOr[Settings]
  }

  object RuleOption {
    @inline
    def apply(
        Keyword: Keyword,
        Settings: js.UndefOr[Settings] = js.undefined
    ): RuleOption = {
      val __obj = js.Dynamic.literal(
        "Keyword" -> Keyword.asInstanceOf[js.Any]
      )

      Settings.foreach(__v => __obj.updateDynamic("Settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleOption]
    }
  }

  /** Settings that are available for use in the rules in the <a>RuleGroup</a> where this is defined.
    */
  @js.native
  trait RuleVariables extends js.Object {
    var IPSets: js.UndefOr[IPSets]
    var PortSets: js.UndefOr[PortSets]
  }

  object RuleVariables {
    @inline
    def apply(
        IPSets: js.UndefOr[IPSets] = js.undefined,
        PortSets: js.UndefOr[PortSets] = js.undefined
    ): RuleVariables = {
      val __obj = js.Dynamic.literal()
      IPSets.foreach(__v => __obj.updateDynamic("IPSets")(__v.asInstanceOf[js.Any]))
      PortSets.foreach(__v => __obj.updateDynamic("PortSets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleVariables]
    }
  }

  /** The stateless or stateful rules definitions for use in a single rule group. Each rule group requires a single <code>RulesSource</code>. You can use an instance of this for either stateless rules or stateful rules.
    */
  @js.native
  trait RulesSource extends js.Object {
    var RulesSourceList: js.UndefOr[RulesSourceList]
    var RulesString: js.UndefOr[RulesString]
    var StatefulRules: js.UndefOr[StatefulRules]
    var StatelessRulesAndCustomActions: js.UndefOr[StatelessRulesAndCustomActions]
  }

  object RulesSource {
    @inline
    def apply(
        RulesSourceList: js.UndefOr[RulesSourceList] = js.undefined,
        RulesString: js.UndefOr[RulesString] = js.undefined,
        StatefulRules: js.UndefOr[StatefulRules] = js.undefined,
        StatelessRulesAndCustomActions: js.UndefOr[StatelessRulesAndCustomActions] = js.undefined
    ): RulesSource = {
      val __obj = js.Dynamic.literal()
      RulesSourceList.foreach(__v => __obj.updateDynamic("RulesSourceList")(__v.asInstanceOf[js.Any]))
      RulesString.foreach(__v => __obj.updateDynamic("RulesString")(__v.asInstanceOf[js.Any]))
      StatefulRules.foreach(__v => __obj.updateDynamic("StatefulRules")(__v.asInstanceOf[js.Any]))
      StatelessRulesAndCustomActions.foreach(__v => __obj.updateDynamic("StatelessRulesAndCustomActions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RulesSource]
    }
  }

  /** Stateful inspection criteria for a domain list rule group. For HTTPS traffic, domain filtering is SNI-based. It uses the server name indicator extension of the TLS handshake. By default, Network Firewall domain list inspection only includes traffic coming from the VPC where you deploy the firewall. To inspect traffic from IP addresses outside of the deployment VPC, you set the <code>HOME_NET</code> rule variable to include the CIDR range of the deployment VPC plus the other CIDR ranges. For more information, see <a>RuleVariables</a> in this guide and [[https://docs.aws.amazon.com/network-firewall/latest/developerguide/stateful-rule-groups-domain-names.html|Stateful domain list rule groups in Network Firewall]] in the <i>Network Firewall Developer Guide</i>.
    */
  @js.native
  trait RulesSourceList extends js.Object {
    var GeneratedRulesType: GeneratedRulesType
    var TargetTypes: TargetTypes
    var Targets: RuleTargets
  }

  object RulesSourceList {
    @inline
    def apply(
        GeneratedRulesType: GeneratedRulesType,
        TargetTypes: TargetTypes,
        Targets: RuleTargets
    ): RulesSourceList = {
      val __obj = js.Dynamic.literal(
        "GeneratedRulesType" -> GeneratedRulesType.asInstanceOf[js.Any],
        "TargetTypes" -> TargetTypes.asInstanceOf[js.Any],
        "Targets" -> Targets.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RulesSourceList]
    }
  }

  /** High-level information about the managed rule group that your own rule group is copied from. You can use the the metadata to track version updates made to the originating rule group. You can retrieve all objects for a rule group by calling [[https://docs.aws.amazon.com/network-firewall/latest/APIReference/API_DescribeRuleGroup.html|DescribeRuleGroup]].
    */
  @js.native
  trait SourceMetadata extends js.Object {
    var SourceArn: js.UndefOr[ResourceArn]
    var SourceUpdateToken: js.UndefOr[UpdateToken]
  }

  object SourceMetadata {
    @inline
    def apply(
        SourceArn: js.UndefOr[ResourceArn] = js.undefined,
        SourceUpdateToken: js.UndefOr[UpdateToken] = js.undefined
    ): SourceMetadata = {
      val __obj = js.Dynamic.literal()
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      SourceUpdateToken.foreach(__v => __obj.updateDynamic("SourceUpdateToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceMetadata]
    }
  }

  /** Configuration settings for the handling of the stateful rule groups in a firewall policy.
    */
  @js.native
  trait StatefulEngineOptions extends js.Object {
    var RuleOrder: js.UndefOr[RuleOrder]
    var StreamExceptionPolicy: js.UndefOr[StreamExceptionPolicy]
  }

  object StatefulEngineOptions {
    @inline
    def apply(
        RuleOrder: js.UndefOr[RuleOrder] = js.undefined,
        StreamExceptionPolicy: js.UndefOr[StreamExceptionPolicy] = js.undefined
    ): StatefulEngineOptions = {
      val __obj = js.Dynamic.literal()
      RuleOrder.foreach(__v => __obj.updateDynamic("RuleOrder")(__v.asInstanceOf[js.Any]))
      StreamExceptionPolicy.foreach(__v => __obj.updateDynamic("StreamExceptionPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StatefulEngineOptions]
    }
  }

  /** A single Suricata rules specification, for use in a stateful rule group. Use this option to specify a simple Suricata rule with protocol, source and destination, ports, direction, and rule options. For information about the Suricata <code>Rules</code> format, see [[https://suricata.readthedocs.io/rules/intro.html#|Rules Format]].
    */
  @js.native
  trait StatefulRule extends js.Object {
    var Action: StatefulAction
    var Header: Header
    var RuleOptions: RuleOptions
  }

  object StatefulRule {
    @inline
    def apply(
        Action: StatefulAction,
        Header: Header,
        RuleOptions: RuleOptions
    ): StatefulRule = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "Header" -> Header.asInstanceOf[js.Any],
        "RuleOptions" -> RuleOptions.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StatefulRule]
    }
  }

  /** The setting that allows the policy owner to change the behavior of the rule group within a policy.
    */
  @js.native
  trait StatefulRuleGroupOverride extends js.Object {
    var Action: js.UndefOr[OverrideAction]
  }

  object StatefulRuleGroupOverride {
    @inline
    def apply(
        Action: js.UndefOr[OverrideAction] = js.undefined
    ): StatefulRuleGroupOverride = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StatefulRuleGroupOverride]
    }
  }

  /** Identifier for a single stateful rule group, used in a firewall policy to refer to a rule group.
    */
  @js.native
  trait StatefulRuleGroupReference extends js.Object {
    var ResourceArn: ResourceArn
    var Override: js.UndefOr[StatefulRuleGroupOverride]
    var Priority: js.UndefOr[Priority]
  }

  object StatefulRuleGroupReference {
    @inline
    def apply(
        ResourceArn: ResourceArn,
        Override: js.UndefOr[StatefulRuleGroupOverride] = js.undefined,
        Priority: js.UndefOr[Priority] = js.undefined
    ): StatefulRuleGroupReference = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      Override.foreach(__v => __obj.updateDynamic("Override")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StatefulRuleGroupReference]
    }
  }

  /** Additional options governing how Network Firewall handles the rule group. You can only use these for stateful rule groups.
    */
  @js.native
  trait StatefulRuleOptions extends js.Object {
    var RuleOrder: js.UndefOr[RuleOrder]
  }

  object StatefulRuleOptions {
    @inline
    def apply(
        RuleOrder: js.UndefOr[RuleOrder] = js.undefined
    ): StatefulRuleOptions = {
      val __obj = js.Dynamic.literal()
      RuleOrder.foreach(__v => __obj.updateDynamic("RuleOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StatefulRuleOptions]
    }
  }

  /** A single stateless rule. This is used in <a>StatelessRulesAndCustomActions</a>.
    */
  @js.native
  trait StatelessRule extends js.Object {
    var Priority: Priority
    var RuleDefinition: RuleDefinition
  }

  object StatelessRule {
    @inline
    def apply(
        Priority: Priority,
        RuleDefinition: RuleDefinition
    ): StatelessRule = {
      val __obj = js.Dynamic.literal(
        "Priority" -> Priority.asInstanceOf[js.Any],
        "RuleDefinition" -> RuleDefinition.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StatelessRule]
    }
  }

  /** Identifier for a single stateless rule group, used in a firewall policy to refer to the rule group.
    */
  @js.native
  trait StatelessRuleGroupReference extends js.Object {
    var Priority: Priority
    var ResourceArn: ResourceArn
  }

  object StatelessRuleGroupReference {
    @inline
    def apply(
        Priority: Priority,
        ResourceArn: ResourceArn
    ): StatelessRuleGroupReference = {
      val __obj = js.Dynamic.literal(
        "Priority" -> Priority.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StatelessRuleGroupReference]
    }
  }

  /** Stateless inspection criteria. Each stateless rule group uses exactly one of these data types to define its stateless rules.
    */
  @js.native
  trait StatelessRulesAndCustomActions extends js.Object {
    var StatelessRules: StatelessRules
    var CustomActions: js.UndefOr[CustomActions]
  }

  object StatelessRulesAndCustomActions {
    @inline
    def apply(
        StatelessRules: StatelessRules,
        CustomActions: js.UndefOr[CustomActions] = js.undefined
    ): StatelessRulesAndCustomActions = {
      val __obj = js.Dynamic.literal(
        "StatelessRules" -> StatelessRules.asInstanceOf[js.Any]
      )

      CustomActions.foreach(__v => __obj.updateDynamic("CustomActions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StatelessRulesAndCustomActions]
    }
  }

  /** The ID for a subnet that you want to associate with the firewall. This is used with <a>CreateFirewall</a> and <a>AssociateSubnets</a>. Network Firewall creates an instance of the associated firewall in each subnet that you specify, to filter traffic in the subnet's Availability Zone.
    */
  @js.native
  trait SubnetMapping extends js.Object {
    var SubnetId: CollectionMember_String
  }

  object SubnetMapping {
    @inline
    def apply(
        SubnetId: CollectionMember_String
    ): SubnetMapping = {
      val __obj = js.Dynamic.literal(
        "SubnetId" -> SubnetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SubnetMapping]
    }
  }

  /** The status of the firewall endpoint and firewall policy configuration for a single VPC subnet. For each VPC subnet that you associate with a firewall, Network Firewall does the following: * Instantiates a firewall endpoint in the subnet, ready to take traffic. * Configures the endpoint with the current firewall policy settings, to provide the filtering behavior for the endpoint. When you update a firewall, for example to add a subnet association or change a rule group in the firewall policy, the affected sync states reflect out-of-sync or not ready status until the changes are complete.
    */
  @js.native
  trait SyncState extends js.Object {
    var Attachment: js.UndefOr[Attachment]
    var Config: js.UndefOr[SyncStateConfig]
  }

  object SyncState {
    @inline
    def apply(
        Attachment: js.UndefOr[Attachment] = js.undefined,
        Config: js.UndefOr[SyncStateConfig] = js.undefined
    ): SyncState = {
      val __obj = js.Dynamic.literal()
      Attachment.foreach(__v => __obj.updateDynamic("Attachment")(__v.asInstanceOf[js.Any]))
      Config.foreach(__v => __obj.updateDynamic("Config")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SyncState]
    }
  }

  /** TCP flags and masks to inspect packets for, used in stateless rules <a>MatchAttributes</a> settings.
    */
  @js.native
  trait TCPFlagField extends js.Object {
    var Flags: Flags
    var Masks: js.UndefOr[Flags]
  }

  object TCPFlagField {
    @inline
    def apply(
        Flags: Flags,
        Masks: js.UndefOr[Flags] = js.undefined
    ): TCPFlagField = {
      val __obj = js.Dynamic.literal(
        "Flags" -> Flags.asInstanceOf[js.Any]
      )

      Masks.foreach(__v => __obj.updateDynamic("Masks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TCPFlagField]
    }
  }

  /** A key:value pair associated with an Amazon Web Services resource. The key:value pair can be anything you define. Typically, the tag key represents a category (such as "environment") and the tag value represents a specific value within that category (such as "test," "development," or "production"). You can add up to 50 tags to each Amazon Web Services resource.
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
    var ResourceArn: ResourceArn
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn,
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

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn,
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
  trait UpdateFirewallDeleteProtectionRequest extends js.Object {
    var DeleteProtection: Boolean
    var FirewallArn: js.UndefOr[ResourceArn]
    var FirewallName: js.UndefOr[ResourceName]
    var UpdateToken: js.UndefOr[UpdateToken]
  }

  object UpdateFirewallDeleteProtectionRequest {
    @inline
    def apply(
        DeleteProtection: Boolean,
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallName: js.UndefOr[ResourceName] = js.undefined,
        UpdateToken: js.UndefOr[UpdateToken] = js.undefined
    ): UpdateFirewallDeleteProtectionRequest = {
      val __obj = js.Dynamic.literal(
        "DeleteProtection" -> DeleteProtection.asInstanceOf[js.Any]
      )

      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      UpdateToken.foreach(__v => __obj.updateDynamic("UpdateToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFirewallDeleteProtectionRequest]
    }
  }

  @js.native
  trait UpdateFirewallDeleteProtectionResponse extends js.Object {
    var DeleteProtection: js.UndefOr[Boolean]
    var FirewallArn: js.UndefOr[ResourceArn]
    var FirewallName: js.UndefOr[ResourceName]
    var UpdateToken: js.UndefOr[UpdateToken]
  }

  object UpdateFirewallDeleteProtectionResponse {
    @inline
    def apply(
        DeleteProtection: js.UndefOr[Boolean] = js.undefined,
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallName: js.UndefOr[ResourceName] = js.undefined,
        UpdateToken: js.UndefOr[UpdateToken] = js.undefined
    ): UpdateFirewallDeleteProtectionResponse = {
      val __obj = js.Dynamic.literal()
      DeleteProtection.foreach(__v => __obj.updateDynamic("DeleteProtection")(__v.asInstanceOf[js.Any]))
      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      UpdateToken.foreach(__v => __obj.updateDynamic("UpdateToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFirewallDeleteProtectionResponse]
    }
  }

  @js.native
  trait UpdateFirewallDescriptionRequest extends js.Object {
    var Description: js.UndefOr[Description]
    var FirewallArn: js.UndefOr[ResourceArn]
    var FirewallName: js.UndefOr[ResourceName]
    var UpdateToken: js.UndefOr[UpdateToken]
  }

  object UpdateFirewallDescriptionRequest {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallName: js.UndefOr[ResourceName] = js.undefined,
        UpdateToken: js.UndefOr[UpdateToken] = js.undefined
    ): UpdateFirewallDescriptionRequest = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      UpdateToken.foreach(__v => __obj.updateDynamic("UpdateToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFirewallDescriptionRequest]
    }
  }

  @js.native
  trait UpdateFirewallDescriptionResponse extends js.Object {
    var Description: js.UndefOr[Description]
    var FirewallArn: js.UndefOr[ResourceArn]
    var FirewallName: js.UndefOr[ResourceName]
    var UpdateToken: js.UndefOr[UpdateToken]
  }

  object UpdateFirewallDescriptionResponse {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallName: js.UndefOr[ResourceName] = js.undefined,
        UpdateToken: js.UndefOr[UpdateToken] = js.undefined
    ): UpdateFirewallDescriptionResponse = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      UpdateToken.foreach(__v => __obj.updateDynamic("UpdateToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFirewallDescriptionResponse]
    }
  }

  @js.native
  trait UpdateFirewallEncryptionConfigurationRequest extends js.Object {
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var FirewallArn: js.UndefOr[ResourceArn]
    var FirewallName: js.UndefOr[ResourceName]
    var UpdateToken: js.UndefOr[UpdateToken]
  }

  object UpdateFirewallEncryptionConfigurationRequest {
    @inline
    def apply(
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallName: js.UndefOr[ResourceName] = js.undefined,
        UpdateToken: js.UndefOr[UpdateToken] = js.undefined
    ): UpdateFirewallEncryptionConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      EncryptionConfiguration.foreach(__v => __obj.updateDynamic("EncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      UpdateToken.foreach(__v => __obj.updateDynamic("UpdateToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFirewallEncryptionConfigurationRequest]
    }
  }

  @js.native
  trait UpdateFirewallEncryptionConfigurationResponse extends js.Object {
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var FirewallArn: js.UndefOr[ResourceArn]
    var FirewallName: js.UndefOr[ResourceName]
    var UpdateToken: js.UndefOr[UpdateToken]
  }

  object UpdateFirewallEncryptionConfigurationResponse {
    @inline
    def apply(
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallName: js.UndefOr[ResourceName] = js.undefined,
        UpdateToken: js.UndefOr[UpdateToken] = js.undefined
    ): UpdateFirewallEncryptionConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      EncryptionConfiguration.foreach(__v => __obj.updateDynamic("EncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      UpdateToken.foreach(__v => __obj.updateDynamic("UpdateToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFirewallEncryptionConfigurationResponse]
    }
  }

  @js.native
  trait UpdateFirewallPolicyChangeProtectionRequest extends js.Object {
    var FirewallPolicyChangeProtection: Boolean
    var FirewallArn: js.UndefOr[ResourceArn]
    var FirewallName: js.UndefOr[ResourceName]
    var UpdateToken: js.UndefOr[UpdateToken]
  }

  object UpdateFirewallPolicyChangeProtectionRequest {
    @inline
    def apply(
        FirewallPolicyChangeProtection: Boolean,
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallName: js.UndefOr[ResourceName] = js.undefined,
        UpdateToken: js.UndefOr[UpdateToken] = js.undefined
    ): UpdateFirewallPolicyChangeProtectionRequest = {
      val __obj = js.Dynamic.literal(
        "FirewallPolicyChangeProtection" -> FirewallPolicyChangeProtection.asInstanceOf[js.Any]
      )

      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      UpdateToken.foreach(__v => __obj.updateDynamic("UpdateToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFirewallPolicyChangeProtectionRequest]
    }
  }

  @js.native
  trait UpdateFirewallPolicyChangeProtectionResponse extends js.Object {
    var FirewallArn: js.UndefOr[ResourceArn]
    var FirewallName: js.UndefOr[ResourceName]
    var FirewallPolicyChangeProtection: js.UndefOr[Boolean]
    var UpdateToken: js.UndefOr[UpdateToken]
  }

  object UpdateFirewallPolicyChangeProtectionResponse {
    @inline
    def apply(
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallName: js.UndefOr[ResourceName] = js.undefined,
        FirewallPolicyChangeProtection: js.UndefOr[Boolean] = js.undefined,
        UpdateToken: js.UndefOr[UpdateToken] = js.undefined
    ): UpdateFirewallPolicyChangeProtectionResponse = {
      val __obj = js.Dynamic.literal()
      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      FirewallPolicyChangeProtection.foreach(__v => __obj.updateDynamic("FirewallPolicyChangeProtection")(__v.asInstanceOf[js.Any]))
      UpdateToken.foreach(__v => __obj.updateDynamic("UpdateToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFirewallPolicyChangeProtectionResponse]
    }
  }

  @js.native
  trait UpdateFirewallPolicyRequest extends js.Object {
    var FirewallPolicy: FirewallPolicy
    var UpdateToken: UpdateToken
    var Description: js.UndefOr[Description]
    var DryRun: js.UndefOr[Boolean]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var FirewallPolicyArn: js.UndefOr[ResourceArn]
    var FirewallPolicyName: js.UndefOr[ResourceName]
  }

  object UpdateFirewallPolicyRequest {
    @inline
    def apply(
        FirewallPolicy: FirewallPolicy,
        UpdateToken: UpdateToken,
        Description: js.UndefOr[Description] = js.undefined,
        DryRun: js.UndefOr[Boolean] = js.undefined,
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        FirewallPolicyArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallPolicyName: js.UndefOr[ResourceName] = js.undefined
    ): UpdateFirewallPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "FirewallPolicy" -> FirewallPolicy.asInstanceOf[js.Any],
        "UpdateToken" -> UpdateToken.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      EncryptionConfiguration.foreach(__v => __obj.updateDynamic("EncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      FirewallPolicyArn.foreach(__v => __obj.updateDynamic("FirewallPolicyArn")(__v.asInstanceOf[js.Any]))
      FirewallPolicyName.foreach(__v => __obj.updateDynamic("FirewallPolicyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFirewallPolicyRequest]
    }
  }

  @js.native
  trait UpdateFirewallPolicyResponse extends js.Object {
    var FirewallPolicyResponse: FirewallPolicyResponse
    var UpdateToken: UpdateToken
  }

  object UpdateFirewallPolicyResponse {
    @inline
    def apply(
        FirewallPolicyResponse: FirewallPolicyResponse,
        UpdateToken: UpdateToken
    ): UpdateFirewallPolicyResponse = {
      val __obj = js.Dynamic.literal(
        "FirewallPolicyResponse" -> FirewallPolicyResponse.asInstanceOf[js.Any],
        "UpdateToken" -> UpdateToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateFirewallPolicyResponse]
    }
  }

  @js.native
  trait UpdateLoggingConfigurationRequest extends js.Object {
    var FirewallArn: js.UndefOr[ResourceArn]
    var FirewallName: js.UndefOr[ResourceName]
    var LoggingConfiguration: js.UndefOr[LoggingConfiguration]
  }

  object UpdateLoggingConfigurationRequest {
    @inline
    def apply(
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallName: js.UndefOr[ResourceName] = js.undefined,
        LoggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined
    ): UpdateLoggingConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      LoggingConfiguration.foreach(__v => __obj.updateDynamic("LoggingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLoggingConfigurationRequest]
    }
  }

  @js.native
  trait UpdateLoggingConfigurationResponse extends js.Object {
    var FirewallArn: js.UndefOr[ResourceArn]
    var FirewallName: js.UndefOr[ResourceName]
    var LoggingConfiguration: js.UndefOr[LoggingConfiguration]
  }

  object UpdateLoggingConfigurationResponse {
    @inline
    def apply(
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallName: js.UndefOr[ResourceName] = js.undefined,
        LoggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined
    ): UpdateLoggingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      LoggingConfiguration.foreach(__v => __obj.updateDynamic("LoggingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLoggingConfigurationResponse]
    }
  }

  @js.native
  trait UpdateRuleGroupRequest extends js.Object {
    var UpdateToken: UpdateToken
    var Description: js.UndefOr[Description]
    var DryRun: js.UndefOr[Boolean]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var RuleGroup: js.UndefOr[RuleGroup]
    var RuleGroupArn: js.UndefOr[ResourceArn]
    var RuleGroupName: js.UndefOr[ResourceName]
    var Rules: js.UndefOr[RulesString]
    var SourceMetadata: js.UndefOr[SourceMetadata]
    var Type: js.UndefOr[RuleGroupType]
  }

  object UpdateRuleGroupRequest {
    @inline
    def apply(
        UpdateToken: UpdateToken,
        Description: js.UndefOr[Description] = js.undefined,
        DryRun: js.UndefOr[Boolean] = js.undefined,
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        RuleGroup: js.UndefOr[RuleGroup] = js.undefined,
        RuleGroupArn: js.UndefOr[ResourceArn] = js.undefined,
        RuleGroupName: js.UndefOr[ResourceName] = js.undefined,
        Rules: js.UndefOr[RulesString] = js.undefined,
        SourceMetadata: js.UndefOr[SourceMetadata] = js.undefined,
        Type: js.UndefOr[RuleGroupType] = js.undefined
    ): UpdateRuleGroupRequest = {
      val __obj = js.Dynamic.literal(
        "UpdateToken" -> UpdateToken.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      EncryptionConfiguration.foreach(__v => __obj.updateDynamic("EncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      RuleGroup.foreach(__v => __obj.updateDynamic("RuleGroup")(__v.asInstanceOf[js.Any]))
      RuleGroupArn.foreach(__v => __obj.updateDynamic("RuleGroupArn")(__v.asInstanceOf[js.Any]))
      RuleGroupName.foreach(__v => __obj.updateDynamic("RuleGroupName")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      SourceMetadata.foreach(__v => __obj.updateDynamic("SourceMetadata")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRuleGroupRequest]
    }
  }

  @js.native
  trait UpdateRuleGroupResponse extends js.Object {
    var RuleGroupResponse: RuleGroupResponse
    var UpdateToken: UpdateToken
  }

  object UpdateRuleGroupResponse {
    @inline
    def apply(
        RuleGroupResponse: RuleGroupResponse,
        UpdateToken: UpdateToken
    ): UpdateRuleGroupResponse = {
      val __obj = js.Dynamic.literal(
        "RuleGroupResponse" -> RuleGroupResponse.asInstanceOf[js.Any],
        "UpdateToken" -> UpdateToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRuleGroupResponse]
    }
  }

  @js.native
  trait UpdateSubnetChangeProtectionRequest extends js.Object {
    var SubnetChangeProtection: Boolean
    var FirewallArn: js.UndefOr[ResourceArn]
    var FirewallName: js.UndefOr[ResourceName]
    var UpdateToken: js.UndefOr[UpdateToken]
  }

  object UpdateSubnetChangeProtectionRequest {
    @inline
    def apply(
        SubnetChangeProtection: Boolean,
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallName: js.UndefOr[ResourceName] = js.undefined,
        UpdateToken: js.UndefOr[UpdateToken] = js.undefined
    ): UpdateSubnetChangeProtectionRequest = {
      val __obj = js.Dynamic.literal(
        "SubnetChangeProtection" -> SubnetChangeProtection.asInstanceOf[js.Any]
      )

      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      UpdateToken.foreach(__v => __obj.updateDynamic("UpdateToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSubnetChangeProtectionRequest]
    }
  }

  @js.native
  trait UpdateSubnetChangeProtectionResponse extends js.Object {
    var FirewallArn: js.UndefOr[ResourceArn]
    var FirewallName: js.UndefOr[ResourceName]
    var SubnetChangeProtection: js.UndefOr[Boolean]
    var UpdateToken: js.UndefOr[UpdateToken]
  }

  object UpdateSubnetChangeProtectionResponse {
    @inline
    def apply(
        FirewallArn: js.UndefOr[ResourceArn] = js.undefined,
        FirewallName: js.UndefOr[ResourceName] = js.undefined,
        SubnetChangeProtection: js.UndefOr[Boolean] = js.undefined,
        UpdateToken: js.UndefOr[UpdateToken] = js.undefined
    ): UpdateSubnetChangeProtectionResponse = {
      val __obj = js.Dynamic.literal()
      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      SubnetChangeProtection.foreach(__v => __obj.updateDynamic("SubnetChangeProtection")(__v.asInstanceOf[js.Any]))
      UpdateToken.foreach(__v => __obj.updateDynamic("UpdateToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSubnetChangeProtectionResponse]
    }
  }
}
