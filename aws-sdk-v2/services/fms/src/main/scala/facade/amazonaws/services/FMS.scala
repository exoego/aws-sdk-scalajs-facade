package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object fms {
  type AWSAccountId = String
  type AppsList = js.Array[App]
  type AppsListsData = js.Array[AppsListDataSummary]
  type AwsEc2NetworkInterfaceViolations = js.Array[AwsEc2NetworkInterfaceViolation]
  type BasicInteger = Int
  type CIDR = String
  type ComplianceViolators = js.Array[ComplianceViolator]
  type CustomerPolicyScopeId = String
  type CustomerPolicyScopeIdList = js.Array[CustomerPolicyScopeId]
  type CustomerPolicyScopeMap = js.Dictionary[CustomerPolicyScopeIdList]
  type DetailedInfo = String
  type DnsRuleGroupPriorities = js.Array[DnsRuleGroupPriority]
  type DnsRuleGroupPriority = Int
  type EvaluationResults = js.Array[EvaluationResult]
  type ExpectedRoutes = js.Array[ExpectedRoute]
  type IPPortNumber = Double
  type IssueInfoMap = js.Dictionary[DetailedInfo]
  type LengthBoundedString = String
  type LengthBoundedStringList = js.Array[LengthBoundedString]
  type ListId = String
  type ManagedServiceData = String
  type MemberAccounts = js.Array[AWSAccountId]
  type NetworkFirewallAction = String
  type NetworkFirewallActionList = js.Array[NetworkFirewallAction]
  type NetworkFirewallResourceName = String
  type OrderedRemediationActions = js.Array[RemediationActionWithOrder]
  type PaginationMaxResults = Int
  type PaginationToken = String
  type PartialMatches = js.Array[PartialMatch]
  type PolicyComplianceStatusList = js.Array[PolicyComplianceStatus]
  type PolicyId = String
  type PolicySummaryList = js.Array[PolicySummary]
  type PolicyUpdateToken = String
  type PossibleRemediationActionList = js.Array[PossibleRemediationAction]
  type PreviousAppsList = js.Dictionary[AppsList]
  type PreviousListVersion = String
  type PreviousProtocolsList = js.Dictionary[ProtocolsList]
  type ProtectionData = String
  type Protocol = String
  type ProtocolsList = js.Array[Protocol]
  type ProtocolsListsData = js.Array[ProtocolsListDataSummary]
  type ReferenceRule = String
  type RemediationActionDescription = String
  type ResourceArn = String
  type ResourceCount = Double
  type ResourceId = String
  type ResourceIdList = js.Array[ResourceId]
  type ResourceName = String
  type ResourceTagKey = String
  type ResourceTagValue = String
  type ResourceTags = js.Array[ResourceTag]
  type ResourceType = String
  type ResourceTypeList = js.Array[ResourceType]
  type ResourceViolations = js.Array[ResourceViolation]
  type Routes = js.Array[Route]
  type SecurityGroupRemediationActions = js.Array[SecurityGroupRemediationAction]
  type StatefulRuleGroupList = js.Array[StatefulRuleGroup]
  type StatelessRuleGroupList = js.Array[StatelessRuleGroup]
  type StatelessRuleGroupPriority = Int
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TargetViolationReason = String
  type TargetViolationReasons = js.Array[TargetViolationReason]
  type TimeStamp = js.Date
  type UpdateToken = String
  type ViolationTarget = String

  final class FMSOps(private val service: FMS) extends AnyVal {

    @inline def associateAdminAccountFuture(params: AssociateAdminAccountRequest): Future[js.Object] = service.associateAdminAccount(params).promise().toFuture
    @inline def deleteAppsListFuture(params: DeleteAppsListRequest): Future[js.Object] = service.deleteAppsList(params).promise().toFuture
    @inline def deleteNotificationChannelFuture(params: DeleteNotificationChannelRequest): Future[js.Object] = service.deleteNotificationChannel(params).promise().toFuture
    @inline def deletePolicyFuture(params: DeletePolicyRequest): Future[js.Object] = service.deletePolicy(params).promise().toFuture
    @inline def deleteProtocolsListFuture(params: DeleteProtocolsListRequest): Future[js.Object] = service.deleteProtocolsList(params).promise().toFuture
    @inline def disassociateAdminAccountFuture(params: DisassociateAdminAccountRequest): Future[js.Object] = service.disassociateAdminAccount(params).promise().toFuture
    @inline def getAdminAccountFuture(params: GetAdminAccountRequest): Future[GetAdminAccountResponse] = service.getAdminAccount(params).promise().toFuture
    @inline def getAppsListFuture(params: GetAppsListRequest): Future[GetAppsListResponse] = service.getAppsList(params).promise().toFuture
    @inline def getComplianceDetailFuture(params: GetComplianceDetailRequest): Future[GetComplianceDetailResponse] = service.getComplianceDetail(params).promise().toFuture
    @inline def getNotificationChannelFuture(params: GetNotificationChannelRequest): Future[GetNotificationChannelResponse] = service.getNotificationChannel(params).promise().toFuture
    @inline def getPolicyFuture(params: GetPolicyRequest): Future[GetPolicyResponse] = service.getPolicy(params).promise().toFuture
    @inline def getProtectionStatusFuture(params: GetProtectionStatusRequest): Future[GetProtectionStatusResponse] = service.getProtectionStatus(params).promise().toFuture
    @inline def getProtocolsListFuture(params: GetProtocolsListRequest): Future[GetProtocolsListResponse] = service.getProtocolsList(params).promise().toFuture
    @inline def getViolationDetailsFuture(params: GetViolationDetailsRequest): Future[GetViolationDetailsResponse] = service.getViolationDetails(params).promise().toFuture
    @inline def listAppsListsFuture(params: ListAppsListsRequest): Future[ListAppsListsResponse] = service.listAppsLists(params).promise().toFuture
    @inline def listComplianceStatusFuture(params: ListComplianceStatusRequest): Future[ListComplianceStatusResponse] = service.listComplianceStatus(params).promise().toFuture
    @inline def listMemberAccountsFuture(params: ListMemberAccountsRequest): Future[ListMemberAccountsResponse] = service.listMemberAccounts(params).promise().toFuture
    @inline def listPoliciesFuture(params: ListPoliciesRequest): Future[ListPoliciesResponse] = service.listPolicies(params).promise().toFuture
    @inline def listProtocolsListsFuture(params: ListProtocolsListsRequest): Future[ListProtocolsListsResponse] = service.listProtocolsLists(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putAppsListFuture(params: PutAppsListRequest): Future[PutAppsListResponse] = service.putAppsList(params).promise().toFuture
    @inline def putNotificationChannelFuture(params: PutNotificationChannelRequest): Future[js.Object] = service.putNotificationChannel(params).promise().toFuture
    @inline def putPolicyFuture(params: PutPolicyRequest): Future[PutPolicyResponse] = service.putPolicy(params).promise().toFuture
    @inline def putProtocolsListFuture(params: PutProtocolsListRequest): Future[PutProtocolsListResponse] = service.putProtocolsList(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/fms", JSImport.Namespace, "AWS.FMS")
  class FMS() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateAdminAccount(params: AssociateAdminAccountRequest): Request[js.Object] = js.native
    def deleteAppsList(params: DeleteAppsListRequest): Request[js.Object] = js.native
    def deleteNotificationChannel(params: DeleteNotificationChannelRequest): Request[js.Object] = js.native
    def deletePolicy(params: DeletePolicyRequest): Request[js.Object] = js.native
    def deleteProtocolsList(params: DeleteProtocolsListRequest): Request[js.Object] = js.native
    def disassociateAdminAccount(params: DisassociateAdminAccountRequest): Request[js.Object] = js.native
    def getAdminAccount(params: GetAdminAccountRequest): Request[GetAdminAccountResponse] = js.native
    def getAppsList(params: GetAppsListRequest): Request[GetAppsListResponse] = js.native
    def getComplianceDetail(params: GetComplianceDetailRequest): Request[GetComplianceDetailResponse] = js.native
    def getNotificationChannel(params: GetNotificationChannelRequest): Request[GetNotificationChannelResponse] = js.native
    def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse] = js.native
    def getProtectionStatus(params: GetProtectionStatusRequest): Request[GetProtectionStatusResponse] = js.native
    def getProtocolsList(params: GetProtocolsListRequest): Request[GetProtocolsListResponse] = js.native
    def getViolationDetails(params: GetViolationDetailsRequest): Request[GetViolationDetailsResponse] = js.native
    def listAppsLists(params: ListAppsListsRequest): Request[ListAppsListsResponse] = js.native
    def listComplianceStatus(params: ListComplianceStatusRequest): Request[ListComplianceStatusResponse] = js.native
    def listMemberAccounts(params: ListMemberAccountsRequest): Request[ListMemberAccountsResponse] = js.native
    def listPolicies(params: ListPoliciesRequest): Request[ListPoliciesResponse] = js.native
    def listProtocolsLists(params: ListProtocolsListsRequest): Request[ListProtocolsListsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putAppsList(params: PutAppsListRequest): Request[PutAppsListResponse] = js.native
    def putNotificationChannel(params: PutNotificationChannelRequest): Request[js.Object] = js.native
    def putPolicy(params: PutPolicyRequest): Request[PutPolicyResponse] = js.native
    def putProtocolsList(params: PutProtocolsListRequest): Request[PutProtocolsListResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
  }
  object FMS {
    @inline implicit def toOps(service: FMS): FMSOps = {
      new FMSOps(service)
    }
  }

  /** Describes a remediation action target.
    */
  @js.native
  trait ActionTarget extends js.Object {
    var Description: js.UndefOr[LengthBoundedString]
    var ResourceId: js.UndefOr[ResourceId]
  }

  object ActionTarget {
    @inline
    def apply(
        Description: js.UndefOr[LengthBoundedString] = js.undefined,
        ResourceId: js.UndefOr[ResourceId] = js.undefined
    ): ActionTarget = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionTarget]
    }
  }

  /** An individual Firewall Manager application.
    */
  @js.native
  trait App extends js.Object {
    var AppName: ResourceName
    var Port: IPPortNumber
    var Protocol: Protocol
  }

  object App {
    @inline
    def apply(
        AppName: ResourceName,
        Port: IPPortNumber,
        Protocol: Protocol
    ): App = {
      val __obj = js.Dynamic.literal(
        "AppName" -> AppName.asInstanceOf[js.Any],
        "Port" -> Port.asInstanceOf[js.Any],
        "Protocol" -> Protocol.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[App]
    }
  }

  /** An Firewall Manager applications list.
    */
  @js.native
  trait AppsListData extends js.Object {
    var AppsList: AppsList
    var ListName: ResourceName
    var CreateTime: js.UndefOr[TimeStamp]
    var LastUpdateTime: js.UndefOr[TimeStamp]
    var ListId: js.UndefOr[ListId]
    var ListUpdateToken: js.UndefOr[UpdateToken]
    var PreviousAppsList: js.UndefOr[PreviousAppsList]
  }

  object AppsListData {
    @inline
    def apply(
        AppsList: AppsList,
        ListName: ResourceName,
        CreateTime: js.UndefOr[TimeStamp] = js.undefined,
        LastUpdateTime: js.UndefOr[TimeStamp] = js.undefined,
        ListId: js.UndefOr[ListId] = js.undefined,
        ListUpdateToken: js.UndefOr[UpdateToken] = js.undefined,
        PreviousAppsList: js.UndefOr[PreviousAppsList] = js.undefined
    ): AppsListData = {
      val __obj = js.Dynamic.literal(
        "AppsList" -> AppsList.asInstanceOf[js.Any],
        "ListName" -> ListName.asInstanceOf[js.Any]
      )

      CreateTime.foreach(__v => __obj.updateDynamic("CreateTime")(__v.asInstanceOf[js.Any]))
      LastUpdateTime.foreach(__v => __obj.updateDynamic("LastUpdateTime")(__v.asInstanceOf[js.Any]))
      ListId.foreach(__v => __obj.updateDynamic("ListId")(__v.asInstanceOf[js.Any]))
      ListUpdateToken.foreach(__v => __obj.updateDynamic("ListUpdateToken")(__v.asInstanceOf[js.Any]))
      PreviousAppsList.foreach(__v => __obj.updateDynamic("PreviousAppsList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppsListData]
    }
  }

  /** Details of the Firewall Manager applications list.
    */
  @js.native
  trait AppsListDataSummary extends js.Object {
    var AppsList: js.UndefOr[AppsList]
    var ListArn: js.UndefOr[ResourceArn]
    var ListId: js.UndefOr[ListId]
    var ListName: js.UndefOr[ResourceName]
  }

  object AppsListDataSummary {
    @inline
    def apply(
        AppsList: js.UndefOr[AppsList] = js.undefined,
        ListArn: js.UndefOr[ResourceArn] = js.undefined,
        ListId: js.UndefOr[ListId] = js.undefined,
        ListName: js.UndefOr[ResourceName] = js.undefined
    ): AppsListDataSummary = {
      val __obj = js.Dynamic.literal()
      AppsList.foreach(__v => __obj.updateDynamic("AppsList")(__v.asInstanceOf[js.Any]))
      ListArn.foreach(__v => __obj.updateDynamic("ListArn")(__v.asInstanceOf[js.Any]))
      ListId.foreach(__v => __obj.updateDynamic("ListId")(__v.asInstanceOf[js.Any]))
      ListName.foreach(__v => __obj.updateDynamic("ListName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppsListDataSummary]
    }
  }

  @js.native
  trait AssociateAdminAccountRequest extends js.Object {
    var AdminAccount: AWSAccountId
  }

  object AssociateAdminAccountRequest {
    @inline
    def apply(
        AdminAccount: AWSAccountId
    ): AssociateAdminAccountRequest = {
      val __obj = js.Dynamic.literal(
        "AdminAccount" -> AdminAccount.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateAdminAccountRequest]
    }
  }

  /** Violation detail for an EC2 instance resource.
    */
  @js.native
  trait AwsEc2InstanceViolation extends js.Object {
    var AwsEc2NetworkInterfaceViolations: js.UndefOr[AwsEc2NetworkInterfaceViolations]
    var ViolationTarget: js.UndefOr[ViolationTarget]
  }

  object AwsEc2InstanceViolation {
    @inline
    def apply(
        AwsEc2NetworkInterfaceViolations: js.UndefOr[AwsEc2NetworkInterfaceViolations] = js.undefined,
        ViolationTarget: js.UndefOr[ViolationTarget] = js.undefined
    ): AwsEc2InstanceViolation = {
      val __obj = js.Dynamic.literal()
      AwsEc2NetworkInterfaceViolations.foreach(__v => __obj.updateDynamic("AwsEc2NetworkInterfaceViolations")(__v.asInstanceOf[js.Any]))
      ViolationTarget.foreach(__v => __obj.updateDynamic("ViolationTarget")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2InstanceViolation]
    }
  }

  /** Violation detail for network interfaces associated with an EC2 instance.
    */
  @js.native
  trait AwsEc2NetworkInterfaceViolation extends js.Object {
    var ViolatingSecurityGroups: js.UndefOr[ResourceIdList]
    var ViolationTarget: js.UndefOr[ViolationTarget]
  }

  object AwsEc2NetworkInterfaceViolation {
    @inline
    def apply(
        ViolatingSecurityGroups: js.UndefOr[ResourceIdList] = js.undefined,
        ViolationTarget: js.UndefOr[ViolationTarget] = js.undefined
    ): AwsEc2NetworkInterfaceViolation = {
      val __obj = js.Dynamic.literal()
      ViolatingSecurityGroups.foreach(__v => __obj.updateDynamic("ViolatingSecurityGroups")(__v.asInstanceOf[js.Any]))
      ViolationTarget.foreach(__v => __obj.updateDynamic("ViolationTarget")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2NetworkInterfaceViolation]
    }
  }

  /** Violation detail for the rule violation in a security group when compared to the primary security group of the Firewall Manager policy.
    */
  @js.native
  trait AwsVPCSecurityGroupViolation extends js.Object {
    var PartialMatches: js.UndefOr[PartialMatches]
    var PossibleSecurityGroupRemediationActions: js.UndefOr[SecurityGroupRemediationActions]
    var ViolationTarget: js.UndefOr[ViolationTarget]
    var ViolationTargetDescription: js.UndefOr[LengthBoundedString]
  }

  object AwsVPCSecurityGroupViolation {
    @inline
    def apply(
        PartialMatches: js.UndefOr[PartialMatches] = js.undefined,
        PossibleSecurityGroupRemediationActions: js.UndefOr[SecurityGroupRemediationActions] = js.undefined,
        ViolationTarget: js.UndefOr[ViolationTarget] = js.undefined,
        ViolationTargetDescription: js.UndefOr[LengthBoundedString] = js.undefined
    ): AwsVPCSecurityGroupViolation = {
      val __obj = js.Dynamic.literal()
      PartialMatches.foreach(__v => __obj.updateDynamic("PartialMatches")(__v.asInstanceOf[js.Any]))
      PossibleSecurityGroupRemediationActions.foreach(__v => __obj.updateDynamic("PossibleSecurityGroupRemediationActions")(__v.asInstanceOf[js.Any]))
      ViolationTarget.foreach(__v => __obj.updateDynamic("ViolationTarget")(__v.asInstanceOf[js.Any]))
      ViolationTargetDescription.foreach(__v => __obj.updateDynamic("ViolationTargetDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsVPCSecurityGroupViolation]
    }
  }

  /** Details of the resource that is not protected by the policy.
    */
  @js.native
  trait ComplianceViolator extends js.Object {
    var ResourceId: js.UndefOr[ResourceId]
    var ResourceType: js.UndefOr[ResourceType]
    var ViolationReason: js.UndefOr[ViolationReason]
  }

  object ComplianceViolator {
    @inline
    def apply(
        ResourceId: js.UndefOr[ResourceId] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined,
        ViolationReason: js.UndefOr[ViolationReason] = js.undefined
    ): ComplianceViolator = {
      val __obj = js.Dynamic.literal()
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      ViolationReason.foreach(__v => __obj.updateDynamic("ViolationReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComplianceViolator]
    }
  }

  @js.native
  trait DeleteAppsListRequest extends js.Object {
    var ListId: ListId
  }

  object DeleteAppsListRequest {
    @inline
    def apply(
        ListId: ListId
    ): DeleteAppsListRequest = {
      val __obj = js.Dynamic.literal(
        "ListId" -> ListId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAppsListRequest]
    }
  }

  @js.native
  trait DeleteNotificationChannelRequest extends js.Object

  object DeleteNotificationChannelRequest {
    @inline
    def apply(): DeleteNotificationChannelRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteNotificationChannelRequest]
    }
  }

  @js.native
  trait DeletePolicyRequest extends js.Object {
    var PolicyId: PolicyId
    var DeleteAllPolicyResources: js.UndefOr[Boolean]
  }

  object DeletePolicyRequest {
    @inline
    def apply(
        PolicyId: PolicyId,
        DeleteAllPolicyResources: js.UndefOr[Boolean] = js.undefined
    ): DeletePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "PolicyId" -> PolicyId.asInstanceOf[js.Any]
      )

      DeleteAllPolicyResources.foreach(__v => __obj.updateDynamic("DeleteAllPolicyResources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePolicyRequest]
    }
  }

  @js.native
  trait DeleteProtocolsListRequest extends js.Object {
    var ListId: ListId
  }

  object DeleteProtocolsListRequest {
    @inline
    def apply(
        ListId: ListId
    ): DeleteProtocolsListRequest = {
      val __obj = js.Dynamic.literal(
        "ListId" -> ListId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteProtocolsListRequest]
    }
  }

  @js.native
  trait DisassociateAdminAccountRequest extends js.Object

  object DisassociateAdminAccountRequest {
    @inline
    def apply(): DisassociateAdminAccountRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateAdminAccountRequest]
    }
  }

  /** A DNS Firewall rule group that Firewall Manager tried to associate with a VPC is already associated with the VPC and can't be associated again.
    */
  @js.native
  trait DnsDuplicateRuleGroupViolation extends js.Object {
    var ViolationTarget: js.UndefOr[ViolationTarget]
    var ViolationTargetDescription: js.UndefOr[LengthBoundedString]
  }

  object DnsDuplicateRuleGroupViolation {
    @inline
    def apply(
        ViolationTarget: js.UndefOr[ViolationTarget] = js.undefined,
        ViolationTargetDescription: js.UndefOr[LengthBoundedString] = js.undefined
    ): DnsDuplicateRuleGroupViolation = {
      val __obj = js.Dynamic.literal()
      ViolationTarget.foreach(__v => __obj.updateDynamic("ViolationTarget")(__v.asInstanceOf[js.Any]))
      ViolationTargetDescription.foreach(__v => __obj.updateDynamic("ViolationTargetDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DnsDuplicateRuleGroupViolation]
    }
  }

  /** The VPC that Firewall Manager was applying a DNS Fireall policy to reached the limit for associated DNS Firewall rule groups. Firewall Manager tried to associate another rule group with the VPC and failed due to the limit.
    */
  @js.native
  trait DnsRuleGroupLimitExceededViolation extends js.Object {
    var NumberOfRuleGroupsAlreadyAssociated: js.UndefOr[BasicInteger]
    var ViolationTarget: js.UndefOr[ViolationTarget]
    var ViolationTargetDescription: js.UndefOr[LengthBoundedString]
  }

  object DnsRuleGroupLimitExceededViolation {
    @inline
    def apply(
        NumberOfRuleGroupsAlreadyAssociated: js.UndefOr[BasicInteger] = js.undefined,
        ViolationTarget: js.UndefOr[ViolationTarget] = js.undefined,
        ViolationTargetDescription: js.UndefOr[LengthBoundedString] = js.undefined
    ): DnsRuleGroupLimitExceededViolation = {
      val __obj = js.Dynamic.literal()
      NumberOfRuleGroupsAlreadyAssociated.foreach(__v => __obj.updateDynamic("NumberOfRuleGroupsAlreadyAssociated")(__v.asInstanceOf[js.Any]))
      ViolationTarget.foreach(__v => __obj.updateDynamic("ViolationTarget")(__v.asInstanceOf[js.Any]))
      ViolationTargetDescription.foreach(__v => __obj.updateDynamic("ViolationTargetDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DnsRuleGroupLimitExceededViolation]
    }
  }

  /** A rule group that Firewall Manager tried to associate with a VPC has the same priority as a rule group that's already associated.
    */
  @js.native
  trait DnsRuleGroupPriorityConflictViolation extends js.Object {
    var ConflictingPolicyId: js.UndefOr[PolicyId]
    var ConflictingPriority: js.UndefOr[DnsRuleGroupPriority]
    var UnavailablePriorities: js.UndefOr[DnsRuleGroupPriorities]
    var ViolationTarget: js.UndefOr[ViolationTarget]
    var ViolationTargetDescription: js.UndefOr[LengthBoundedString]
  }

  object DnsRuleGroupPriorityConflictViolation {
    @inline
    def apply(
        ConflictingPolicyId: js.UndefOr[PolicyId] = js.undefined,
        ConflictingPriority: js.UndefOr[DnsRuleGroupPriority] = js.undefined,
        UnavailablePriorities: js.UndefOr[DnsRuleGroupPriorities] = js.undefined,
        ViolationTarget: js.UndefOr[ViolationTarget] = js.undefined,
        ViolationTargetDescription: js.UndefOr[LengthBoundedString] = js.undefined
    ): DnsRuleGroupPriorityConflictViolation = {
      val __obj = js.Dynamic.literal()
      ConflictingPolicyId.foreach(__v => __obj.updateDynamic("ConflictingPolicyId")(__v.asInstanceOf[js.Any]))
      ConflictingPriority.foreach(__v => __obj.updateDynamic("ConflictingPriority")(__v.asInstanceOf[js.Any]))
      UnavailablePriorities.foreach(__v => __obj.updateDynamic("UnavailablePriorities")(__v.asInstanceOf[js.Any]))
      ViolationTarget.foreach(__v => __obj.updateDynamic("ViolationTarget")(__v.asInstanceOf[js.Any]))
      ViolationTargetDescription.foreach(__v => __obj.updateDynamic("ViolationTargetDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DnsRuleGroupPriorityConflictViolation]
    }
  }

  /** The action of associating an EC2 resource, such as a subnet or internet gateway, with a route table.
    */
  @js.native
  trait EC2AssociateRouteTableAction extends js.Object {
    var RouteTableId: ActionTarget
    var Description: js.UndefOr[LengthBoundedString]
    var GatewayId: js.UndefOr[ActionTarget]
    var SubnetId: js.UndefOr[ActionTarget]
  }

  object EC2AssociateRouteTableAction {
    @inline
    def apply(
        RouteTableId: ActionTarget,
        Description: js.UndefOr[LengthBoundedString] = js.undefined,
        GatewayId: js.UndefOr[ActionTarget] = js.undefined,
        SubnetId: js.UndefOr[ActionTarget] = js.undefined
    ): EC2AssociateRouteTableAction = {
      val __obj = js.Dynamic.literal(
        "RouteTableId" -> RouteTableId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      GatewayId.foreach(__v => __obj.updateDynamic("GatewayId")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EC2AssociateRouteTableAction]
    }
  }

  /** An action that copies the EC2 route table for use in remediation.
    */
  @js.native
  trait EC2CopyRouteTableAction extends js.Object {
    var RouteTableId: ActionTarget
    var VpcId: ActionTarget
    var Description: js.UndefOr[LengthBoundedString]
  }

  object EC2CopyRouteTableAction {
    @inline
    def apply(
        RouteTableId: ActionTarget,
        VpcId: ActionTarget,
        Description: js.UndefOr[LengthBoundedString] = js.undefined
    ): EC2CopyRouteTableAction = {
      val __obj = js.Dynamic.literal(
        "RouteTableId" -> RouteTableId.asInstanceOf[js.Any],
        "VpcId" -> VpcId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EC2CopyRouteTableAction]
    }
  }

  /** Information about the CreateRoute action in Amazon EC2.
    */
  @js.native
  trait EC2CreateRouteAction extends js.Object {
    var RouteTableId: ActionTarget
    var Description: js.UndefOr[LengthBoundedString]
    var DestinationCidrBlock: js.UndefOr[CIDR]
    var DestinationIpv6CidrBlock: js.UndefOr[CIDR]
    var DestinationPrefixListId: js.UndefOr[ResourceId]
    var GatewayId: js.UndefOr[ActionTarget]
    var VpcEndpointId: js.UndefOr[ActionTarget]
  }

  object EC2CreateRouteAction {
    @inline
    def apply(
        RouteTableId: ActionTarget,
        Description: js.UndefOr[LengthBoundedString] = js.undefined,
        DestinationCidrBlock: js.UndefOr[CIDR] = js.undefined,
        DestinationIpv6CidrBlock: js.UndefOr[CIDR] = js.undefined,
        DestinationPrefixListId: js.UndefOr[ResourceId] = js.undefined,
        GatewayId: js.UndefOr[ActionTarget] = js.undefined,
        VpcEndpointId: js.UndefOr[ActionTarget] = js.undefined
    ): EC2CreateRouteAction = {
      val __obj = js.Dynamic.literal(
        "RouteTableId" -> RouteTableId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DestinationCidrBlock.foreach(__v => __obj.updateDynamic("DestinationCidrBlock")(__v.asInstanceOf[js.Any]))
      DestinationIpv6CidrBlock.foreach(__v => __obj.updateDynamic("DestinationIpv6CidrBlock")(__v.asInstanceOf[js.Any]))
      DestinationPrefixListId.foreach(__v => __obj.updateDynamic("DestinationPrefixListId")(__v.asInstanceOf[js.Any]))
      GatewayId.foreach(__v => __obj.updateDynamic("GatewayId")(__v.asInstanceOf[js.Any]))
      VpcEndpointId.foreach(__v => __obj.updateDynamic("VpcEndpointId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EC2CreateRouteAction]
    }
  }

  /** Information about the CreateRouteTable action in Amazon EC2.
    */
  @js.native
  trait EC2CreateRouteTableAction extends js.Object {
    var VpcId: ActionTarget
    var Description: js.UndefOr[LengthBoundedString]
  }

  object EC2CreateRouteTableAction {
    @inline
    def apply(
        VpcId: ActionTarget,
        Description: js.UndefOr[LengthBoundedString] = js.undefined
    ): EC2CreateRouteTableAction = {
      val __obj = js.Dynamic.literal(
        "VpcId" -> VpcId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EC2CreateRouteTableAction]
    }
  }

  /** Information about the DeleteRoute action in Amazon EC2.
    */
  @js.native
  trait EC2DeleteRouteAction extends js.Object {
    var RouteTableId: ActionTarget
    var Description: js.UndefOr[LengthBoundedString]
    var DestinationCidrBlock: js.UndefOr[CIDR]
    var DestinationIpv6CidrBlock: js.UndefOr[CIDR]
    var DestinationPrefixListId: js.UndefOr[ResourceId]
  }

  object EC2DeleteRouteAction {
    @inline
    def apply(
        RouteTableId: ActionTarget,
        Description: js.UndefOr[LengthBoundedString] = js.undefined,
        DestinationCidrBlock: js.UndefOr[CIDR] = js.undefined,
        DestinationIpv6CidrBlock: js.UndefOr[CIDR] = js.undefined,
        DestinationPrefixListId: js.UndefOr[ResourceId] = js.undefined
    ): EC2DeleteRouteAction = {
      val __obj = js.Dynamic.literal(
        "RouteTableId" -> RouteTableId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DestinationCidrBlock.foreach(__v => __obj.updateDynamic("DestinationCidrBlock")(__v.asInstanceOf[js.Any]))
      DestinationIpv6CidrBlock.foreach(__v => __obj.updateDynamic("DestinationIpv6CidrBlock")(__v.asInstanceOf[js.Any]))
      DestinationPrefixListId.foreach(__v => __obj.updateDynamic("DestinationPrefixListId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EC2DeleteRouteAction]
    }
  }

  /** Information about the ReplaceRoute action in Amazon EC2.
    */
  @js.native
  trait EC2ReplaceRouteAction extends js.Object {
    var RouteTableId: ActionTarget
    var Description: js.UndefOr[LengthBoundedString]
    var DestinationCidrBlock: js.UndefOr[CIDR]
    var DestinationIpv6CidrBlock: js.UndefOr[CIDR]
    var DestinationPrefixListId: js.UndefOr[ResourceId]
    var GatewayId: js.UndefOr[ActionTarget]
  }

  object EC2ReplaceRouteAction {
    @inline
    def apply(
        RouteTableId: ActionTarget,
        Description: js.UndefOr[LengthBoundedString] = js.undefined,
        DestinationCidrBlock: js.UndefOr[CIDR] = js.undefined,
        DestinationIpv6CidrBlock: js.UndefOr[CIDR] = js.undefined,
        DestinationPrefixListId: js.UndefOr[ResourceId] = js.undefined,
        GatewayId: js.UndefOr[ActionTarget] = js.undefined
    ): EC2ReplaceRouteAction = {
      val __obj = js.Dynamic.literal(
        "RouteTableId" -> RouteTableId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DestinationCidrBlock.foreach(__v => __obj.updateDynamic("DestinationCidrBlock")(__v.asInstanceOf[js.Any]))
      DestinationIpv6CidrBlock.foreach(__v => __obj.updateDynamic("DestinationIpv6CidrBlock")(__v.asInstanceOf[js.Any]))
      DestinationPrefixListId.foreach(__v => __obj.updateDynamic("DestinationPrefixListId")(__v.asInstanceOf[js.Any]))
      GatewayId.foreach(__v => __obj.updateDynamic("GatewayId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EC2ReplaceRouteAction]
    }
  }

  /** Information about the ReplaceRouteTableAssociation action in Amazon EC2.
    */
  @js.native
  trait EC2ReplaceRouteTableAssociationAction extends js.Object {
    var AssociationId: ActionTarget
    var RouteTableId: ActionTarget
    var Description: js.UndefOr[LengthBoundedString]
  }

  object EC2ReplaceRouteTableAssociationAction {
    @inline
    def apply(
        AssociationId: ActionTarget,
        RouteTableId: ActionTarget,
        Description: js.UndefOr[LengthBoundedString] = js.undefined
    ): EC2ReplaceRouteTableAssociationAction = {
      val __obj = js.Dynamic.literal(
        "AssociationId" -> AssociationId.asInstanceOf[js.Any],
        "RouteTableId" -> RouteTableId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EC2ReplaceRouteTableAssociationAction]
    }
  }

  /** Describes the compliance status for the account. An account is considered noncompliant if it includes resources that are not protected by the specified policy or that don't comply with the policy.
    */
  @js.native
  trait EvaluationResult extends js.Object {
    var ComplianceStatus: js.UndefOr[PolicyComplianceStatusType]
    var EvaluationLimitExceeded: js.UndefOr[Boolean]
    var ViolatorCount: js.UndefOr[ResourceCount]
  }

  object EvaluationResult {
    @inline
    def apply(
        ComplianceStatus: js.UndefOr[PolicyComplianceStatusType] = js.undefined,
        EvaluationLimitExceeded: js.UndefOr[Boolean] = js.undefined,
        ViolatorCount: js.UndefOr[ResourceCount] = js.undefined
    ): EvaluationResult = {
      val __obj = js.Dynamic.literal()
      ComplianceStatus.foreach(__v => __obj.updateDynamic("ComplianceStatus")(__v.asInstanceOf[js.Any]))
      EvaluationLimitExceeded.foreach(__v => __obj.updateDynamic("EvaluationLimitExceeded")(__v.asInstanceOf[js.Any]))
      ViolatorCount.foreach(__v => __obj.updateDynamic("ViolatorCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EvaluationResult]
    }
  }

  /** Information about the expected route in the route table.
    */
  @js.native
  trait ExpectedRoute extends js.Object {
    var AllowedTargets: js.UndefOr[LengthBoundedStringList]
    var ContributingSubnets: js.UndefOr[ResourceIdList]
    var IpV4Cidr: js.UndefOr[CIDR]
    var IpV6Cidr: js.UndefOr[CIDR]
    var PrefixListId: js.UndefOr[CIDR]
    var RouteTableId: js.UndefOr[ResourceId]
  }

  object ExpectedRoute {
    @inline
    def apply(
        AllowedTargets: js.UndefOr[LengthBoundedStringList] = js.undefined,
        ContributingSubnets: js.UndefOr[ResourceIdList] = js.undefined,
        IpV4Cidr: js.UndefOr[CIDR] = js.undefined,
        IpV6Cidr: js.UndefOr[CIDR] = js.undefined,
        PrefixListId: js.UndefOr[CIDR] = js.undefined,
        RouteTableId: js.UndefOr[ResourceId] = js.undefined
    ): ExpectedRoute = {
      val __obj = js.Dynamic.literal()
      AllowedTargets.foreach(__v => __obj.updateDynamic("AllowedTargets")(__v.asInstanceOf[js.Any]))
      ContributingSubnets.foreach(__v => __obj.updateDynamic("ContributingSubnets")(__v.asInstanceOf[js.Any]))
      IpV4Cidr.foreach(__v => __obj.updateDynamic("IpV4Cidr")(__v.asInstanceOf[js.Any]))
      IpV6Cidr.foreach(__v => __obj.updateDynamic("IpV6Cidr")(__v.asInstanceOf[js.Any]))
      PrefixListId.foreach(__v => __obj.updateDynamic("PrefixListId")(__v.asInstanceOf[js.Any]))
      RouteTableId.foreach(__v => __obj.updateDynamic("RouteTableId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExpectedRoute]
    }
  }

  @js.native
  trait GetAdminAccountRequest extends js.Object

  object GetAdminAccountRequest {
    @inline
    def apply(): GetAdminAccountRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAdminAccountRequest]
    }
  }

  @js.native
  trait GetAdminAccountResponse extends js.Object {
    var AdminAccount: js.UndefOr[AWSAccountId]
    var RoleStatus: js.UndefOr[AccountRoleStatus]
  }

  object GetAdminAccountResponse {
    @inline
    def apply(
        AdminAccount: js.UndefOr[AWSAccountId] = js.undefined,
        RoleStatus: js.UndefOr[AccountRoleStatus] = js.undefined
    ): GetAdminAccountResponse = {
      val __obj = js.Dynamic.literal()
      AdminAccount.foreach(__v => __obj.updateDynamic("AdminAccount")(__v.asInstanceOf[js.Any]))
      RoleStatus.foreach(__v => __obj.updateDynamic("RoleStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAdminAccountResponse]
    }
  }

  @js.native
  trait GetAppsListRequest extends js.Object {
    var ListId: ListId
    var DefaultList: js.UndefOr[Boolean]
  }

  object GetAppsListRequest {
    @inline
    def apply(
        ListId: ListId,
        DefaultList: js.UndefOr[Boolean] = js.undefined
    ): GetAppsListRequest = {
      val __obj = js.Dynamic.literal(
        "ListId" -> ListId.asInstanceOf[js.Any]
      )

      DefaultList.foreach(__v => __obj.updateDynamic("DefaultList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAppsListRequest]
    }
  }

  @js.native
  trait GetAppsListResponse extends js.Object {
    var AppsList: js.UndefOr[AppsListData]
    var AppsListArn: js.UndefOr[ResourceArn]
  }

  object GetAppsListResponse {
    @inline
    def apply(
        AppsList: js.UndefOr[AppsListData] = js.undefined,
        AppsListArn: js.UndefOr[ResourceArn] = js.undefined
    ): GetAppsListResponse = {
      val __obj = js.Dynamic.literal()
      AppsList.foreach(__v => __obj.updateDynamic("AppsList")(__v.asInstanceOf[js.Any]))
      AppsListArn.foreach(__v => __obj.updateDynamic("AppsListArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAppsListResponse]
    }
  }

  @js.native
  trait GetComplianceDetailRequest extends js.Object {
    var MemberAccount: AWSAccountId
    var PolicyId: PolicyId
  }

  object GetComplianceDetailRequest {
    @inline
    def apply(
        MemberAccount: AWSAccountId,
        PolicyId: PolicyId
    ): GetComplianceDetailRequest = {
      val __obj = js.Dynamic.literal(
        "MemberAccount" -> MemberAccount.asInstanceOf[js.Any],
        "PolicyId" -> PolicyId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetComplianceDetailRequest]
    }
  }

  @js.native
  trait GetComplianceDetailResponse extends js.Object {
    var PolicyComplianceDetail: js.UndefOr[PolicyComplianceDetail]
  }

  object GetComplianceDetailResponse {
    @inline
    def apply(
        PolicyComplianceDetail: js.UndefOr[PolicyComplianceDetail] = js.undefined
    ): GetComplianceDetailResponse = {
      val __obj = js.Dynamic.literal()
      PolicyComplianceDetail.foreach(__v => __obj.updateDynamic("PolicyComplianceDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetComplianceDetailResponse]
    }
  }

  @js.native
  trait GetNotificationChannelRequest extends js.Object

  object GetNotificationChannelRequest {
    @inline
    def apply(): GetNotificationChannelRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetNotificationChannelRequest]
    }
  }

  @js.native
  trait GetNotificationChannelResponse extends js.Object {
    var SnsRoleName: js.UndefOr[ResourceArn]
    var SnsTopicArn: js.UndefOr[ResourceArn]
  }

  object GetNotificationChannelResponse {
    @inline
    def apply(
        SnsRoleName: js.UndefOr[ResourceArn] = js.undefined,
        SnsTopicArn: js.UndefOr[ResourceArn] = js.undefined
    ): GetNotificationChannelResponse = {
      val __obj = js.Dynamic.literal()
      SnsRoleName.foreach(__v => __obj.updateDynamic("SnsRoleName")(__v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.updateDynamic("SnsTopicArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNotificationChannelResponse]
    }
  }

  @js.native
  trait GetPolicyRequest extends js.Object {
    var PolicyId: PolicyId
  }

  object GetPolicyRequest {
    @inline
    def apply(
        PolicyId: PolicyId
    ): GetPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "PolicyId" -> PolicyId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPolicyRequest]
    }
  }

  @js.native
  trait GetPolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
    var PolicyArn: js.UndefOr[ResourceArn]
  }

  object GetPolicyResponse {
    @inline
    def apply(
        Policy: js.UndefOr[Policy] = js.undefined,
        PolicyArn: js.UndefOr[ResourceArn] = js.undefined
    ): GetPolicyResponse = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      PolicyArn.foreach(__v => __obj.updateDynamic("PolicyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPolicyResponse]
    }
  }

  @js.native
  trait GetProtectionStatusRequest extends js.Object {
    var PolicyId: PolicyId
    var EndTime: js.UndefOr[TimeStamp]
    var MaxResults: js.UndefOr[PaginationMaxResults]
    var MemberAccountId: js.UndefOr[AWSAccountId]
    var NextToken: js.UndefOr[PaginationToken]
    var StartTime: js.UndefOr[TimeStamp]
  }

  object GetProtectionStatusRequest {
    @inline
    def apply(
        PolicyId: PolicyId,
        EndTime: js.UndefOr[TimeStamp] = js.undefined,
        MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined,
        MemberAccountId: js.UndefOr[AWSAccountId] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        StartTime: js.UndefOr[TimeStamp] = js.undefined
    ): GetProtectionStatusRequest = {
      val __obj = js.Dynamic.literal(
        "PolicyId" -> PolicyId.asInstanceOf[js.Any]
      )

      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      MemberAccountId.foreach(__v => __obj.updateDynamic("MemberAccountId")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProtectionStatusRequest]
    }
  }

  @js.native
  trait GetProtectionStatusResponse extends js.Object {
    var AdminAccountId: js.UndefOr[AWSAccountId]
    var Data: js.UndefOr[ProtectionData]
    var NextToken: js.UndefOr[PaginationToken]
    var ServiceType: js.UndefOr[SecurityServiceType]
  }

  object GetProtectionStatusResponse {
    @inline
    def apply(
        AdminAccountId: js.UndefOr[AWSAccountId] = js.undefined,
        Data: js.UndefOr[ProtectionData] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        ServiceType: js.UndefOr[SecurityServiceType] = js.undefined
    ): GetProtectionStatusResponse = {
      val __obj = js.Dynamic.literal()
      AdminAccountId.foreach(__v => __obj.updateDynamic("AdminAccountId")(__v.asInstanceOf[js.Any]))
      Data.foreach(__v => __obj.updateDynamic("Data")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ServiceType.foreach(__v => __obj.updateDynamic("ServiceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProtectionStatusResponse]
    }
  }

  @js.native
  trait GetProtocolsListRequest extends js.Object {
    var ListId: ListId
    var DefaultList: js.UndefOr[Boolean]
  }

  object GetProtocolsListRequest {
    @inline
    def apply(
        ListId: ListId,
        DefaultList: js.UndefOr[Boolean] = js.undefined
    ): GetProtocolsListRequest = {
      val __obj = js.Dynamic.literal(
        "ListId" -> ListId.asInstanceOf[js.Any]
      )

      DefaultList.foreach(__v => __obj.updateDynamic("DefaultList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProtocolsListRequest]
    }
  }

  @js.native
  trait GetProtocolsListResponse extends js.Object {
    var ProtocolsList: js.UndefOr[ProtocolsListData]
    var ProtocolsListArn: js.UndefOr[ResourceArn]
  }

  object GetProtocolsListResponse {
    @inline
    def apply(
        ProtocolsList: js.UndefOr[ProtocolsListData] = js.undefined,
        ProtocolsListArn: js.UndefOr[ResourceArn] = js.undefined
    ): GetProtocolsListResponse = {
      val __obj = js.Dynamic.literal()
      ProtocolsList.foreach(__v => __obj.updateDynamic("ProtocolsList")(__v.asInstanceOf[js.Any]))
      ProtocolsListArn.foreach(__v => __obj.updateDynamic("ProtocolsListArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProtocolsListResponse]
    }
  }

  @js.native
  trait GetViolationDetailsRequest extends js.Object {
    var MemberAccount: AWSAccountId
    var PolicyId: PolicyId
    var ResourceId: ResourceId
    var ResourceType: ResourceType
  }

  object GetViolationDetailsRequest {
    @inline
    def apply(
        MemberAccount: AWSAccountId,
        PolicyId: PolicyId,
        ResourceId: ResourceId,
        ResourceType: ResourceType
    ): GetViolationDetailsRequest = {
      val __obj = js.Dynamic.literal(
        "MemberAccount" -> MemberAccount.asInstanceOf[js.Any],
        "PolicyId" -> PolicyId.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetViolationDetailsRequest]
    }
  }

  @js.native
  trait GetViolationDetailsResponse extends js.Object {
    var ViolationDetail: js.UndefOr[ViolationDetail]
  }

  object GetViolationDetailsResponse {
    @inline
    def apply(
        ViolationDetail: js.UndefOr[ViolationDetail] = js.undefined
    ): GetViolationDetailsResponse = {
      val __obj = js.Dynamic.literal()
      ViolationDetail.foreach(__v => __obj.updateDynamic("ViolationDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetViolationDetailsResponse]
    }
  }

  @js.native
  trait ListAppsListsRequest extends js.Object {
    var MaxResults: PaginationMaxResults
    var DefaultLists: js.UndefOr[Boolean]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListAppsListsRequest {
    @inline
    def apply(
        MaxResults: PaginationMaxResults,
        DefaultLists: js.UndefOr[Boolean] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListAppsListsRequest = {
      val __obj = js.Dynamic.literal(
        "MaxResults" -> MaxResults.asInstanceOf[js.Any]
      )

      DefaultLists.foreach(__v => __obj.updateDynamic("DefaultLists")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppsListsRequest]
    }
  }

  @js.native
  trait ListAppsListsResponse extends js.Object {
    var AppsLists: js.UndefOr[AppsListsData]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListAppsListsResponse {
    @inline
    def apply(
        AppsLists: js.UndefOr[AppsListsData] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListAppsListsResponse = {
      val __obj = js.Dynamic.literal()
      AppsLists.foreach(__v => __obj.updateDynamic("AppsLists")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppsListsResponse]
    }
  }

  @js.native
  trait ListComplianceStatusRequest extends js.Object {
    var PolicyId: PolicyId
    var MaxResults: js.UndefOr[PaginationMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListComplianceStatusRequest {
    @inline
    def apply(
        PolicyId: PolicyId,
        MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListComplianceStatusRequest = {
      val __obj = js.Dynamic.literal(
        "PolicyId" -> PolicyId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComplianceStatusRequest]
    }
  }

  @js.native
  trait ListComplianceStatusResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var PolicyComplianceStatusList: js.UndefOr[PolicyComplianceStatusList]
  }

  object ListComplianceStatusResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        PolicyComplianceStatusList: js.UndefOr[PolicyComplianceStatusList] = js.undefined
    ): ListComplianceStatusResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PolicyComplianceStatusList.foreach(__v => __obj.updateDynamic("PolicyComplianceStatusList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComplianceStatusResponse]
    }
  }

  @js.native
  trait ListMemberAccountsRequest extends js.Object {
    var MaxResults: js.UndefOr[PaginationMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListMemberAccountsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListMemberAccountsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMemberAccountsRequest]
    }
  }

  @js.native
  trait ListMemberAccountsResponse extends js.Object {
    var MemberAccounts: js.UndefOr[MemberAccounts]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListMemberAccountsResponse {
    @inline
    def apply(
        MemberAccounts: js.UndefOr[MemberAccounts] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListMemberAccountsResponse = {
      val __obj = js.Dynamic.literal()
      MemberAccounts.foreach(__v => __obj.updateDynamic("MemberAccounts")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMemberAccountsResponse]
    }
  }

  @js.native
  trait ListPoliciesRequest extends js.Object {
    var MaxResults: js.UndefOr[PaginationMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListPoliciesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListPoliciesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPoliciesRequest]
    }
  }

  @js.native
  trait ListPoliciesResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var PolicyList: js.UndefOr[PolicySummaryList]
  }

  object ListPoliciesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        PolicyList: js.UndefOr[PolicySummaryList] = js.undefined
    ): ListPoliciesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PolicyList.foreach(__v => __obj.updateDynamic("PolicyList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPoliciesResponse]
    }
  }

  @js.native
  trait ListProtocolsListsRequest extends js.Object {
    var MaxResults: PaginationMaxResults
    var DefaultLists: js.UndefOr[Boolean]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListProtocolsListsRequest {
    @inline
    def apply(
        MaxResults: PaginationMaxResults,
        DefaultLists: js.UndefOr[Boolean] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListProtocolsListsRequest = {
      val __obj = js.Dynamic.literal(
        "MaxResults" -> MaxResults.asInstanceOf[js.Any]
      )

      DefaultLists.foreach(__v => __obj.updateDynamic("DefaultLists")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProtocolsListsRequest]
    }
  }

  @js.native
  trait ListProtocolsListsResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var ProtocolsLists: js.UndefOr[ProtocolsListsData]
  }

  object ListProtocolsListsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        ProtocolsLists: js.UndefOr[ProtocolsListsData] = js.undefined
    ): ListProtocolsListsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProtocolsLists.foreach(__v => __obj.updateDynamic("ProtocolsLists")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProtocolsListsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        TagList: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      TagList.foreach(__v => __obj.updateDynamic("TagList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Violation detail for an internet gateway route with an inactive state in the customer subnet route table or Network Firewall subnet route table.
    */
  @js.native
  trait NetworkFirewallBlackHoleRouteDetectedViolation extends js.Object {
    var RouteTableId: js.UndefOr[ResourceId]
    var ViolatingRoutes: js.UndefOr[Routes]
    var ViolationTarget: js.UndefOr[ViolationTarget]
    var VpcId: js.UndefOr[ResourceId]
  }

  object NetworkFirewallBlackHoleRouteDetectedViolation {
    @inline
    def apply(
        RouteTableId: js.UndefOr[ResourceId] = js.undefined,
        ViolatingRoutes: js.UndefOr[Routes] = js.undefined,
        ViolationTarget: js.UndefOr[ViolationTarget] = js.undefined,
        VpcId: js.UndefOr[ResourceId] = js.undefined
    ): NetworkFirewallBlackHoleRouteDetectedViolation = {
      val __obj = js.Dynamic.literal()
      RouteTableId.foreach(__v => __obj.updateDynamic("RouteTableId")(__v.asInstanceOf[js.Any]))
      ViolatingRoutes.foreach(__v => __obj.updateDynamic("ViolatingRoutes")(__v.asInstanceOf[js.Any]))
      ViolationTarget.foreach(__v => __obj.updateDynamic("ViolationTarget")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkFirewallBlackHoleRouteDetectedViolation]
    }
  }

  /** Violation detail for the subnet for which internet traffic that hasn't been inspected.
    */
  @js.native
  trait NetworkFirewallInternetTrafficNotInspectedViolation extends js.Object {
    var ActualFirewallSubnetRoutes: js.UndefOr[Routes]
    var ActualInternetGatewayRoutes: js.UndefOr[Routes]
    var CurrentFirewallSubnetRouteTable: js.UndefOr[ResourceId]
    var CurrentInternetGatewayRouteTable: js.UndefOr[ResourceId]
    var ExpectedFirewallEndpoint: js.UndefOr[ResourceId]
    var ExpectedFirewallSubnetRoutes: js.UndefOr[ExpectedRoutes]
    var ExpectedInternetGatewayRoutes: js.UndefOr[ExpectedRoutes]
    var FirewallSubnetId: js.UndefOr[ResourceId]
    var InternetGatewayId: js.UndefOr[ResourceId]
    var IsRouteTableUsedInDifferentAZ: js.UndefOr[Boolean]
    var RouteTableId: js.UndefOr[ResourceId]
    var SubnetAvailabilityZone: js.UndefOr[LengthBoundedString]
    var SubnetId: js.UndefOr[ResourceId]
    var ViolatingRoutes: js.UndefOr[Routes]
    var VpcId: js.UndefOr[ResourceId]
  }

  object NetworkFirewallInternetTrafficNotInspectedViolation {
    @inline
    def apply(
        ActualFirewallSubnetRoutes: js.UndefOr[Routes] = js.undefined,
        ActualInternetGatewayRoutes: js.UndefOr[Routes] = js.undefined,
        CurrentFirewallSubnetRouteTable: js.UndefOr[ResourceId] = js.undefined,
        CurrentInternetGatewayRouteTable: js.UndefOr[ResourceId] = js.undefined,
        ExpectedFirewallEndpoint: js.UndefOr[ResourceId] = js.undefined,
        ExpectedFirewallSubnetRoutes: js.UndefOr[ExpectedRoutes] = js.undefined,
        ExpectedInternetGatewayRoutes: js.UndefOr[ExpectedRoutes] = js.undefined,
        FirewallSubnetId: js.UndefOr[ResourceId] = js.undefined,
        InternetGatewayId: js.UndefOr[ResourceId] = js.undefined,
        IsRouteTableUsedInDifferentAZ: js.UndefOr[Boolean] = js.undefined,
        RouteTableId: js.UndefOr[ResourceId] = js.undefined,
        SubnetAvailabilityZone: js.UndefOr[LengthBoundedString] = js.undefined,
        SubnetId: js.UndefOr[ResourceId] = js.undefined,
        ViolatingRoutes: js.UndefOr[Routes] = js.undefined,
        VpcId: js.UndefOr[ResourceId] = js.undefined
    ): NetworkFirewallInternetTrafficNotInspectedViolation = {
      val __obj = js.Dynamic.literal()
      ActualFirewallSubnetRoutes.foreach(__v => __obj.updateDynamic("ActualFirewallSubnetRoutes")(__v.asInstanceOf[js.Any]))
      ActualInternetGatewayRoutes.foreach(__v => __obj.updateDynamic("ActualInternetGatewayRoutes")(__v.asInstanceOf[js.Any]))
      CurrentFirewallSubnetRouteTable.foreach(__v => __obj.updateDynamic("CurrentFirewallSubnetRouteTable")(__v.asInstanceOf[js.Any]))
      CurrentInternetGatewayRouteTable.foreach(__v => __obj.updateDynamic("CurrentInternetGatewayRouteTable")(__v.asInstanceOf[js.Any]))
      ExpectedFirewallEndpoint.foreach(__v => __obj.updateDynamic("ExpectedFirewallEndpoint")(__v.asInstanceOf[js.Any]))
      ExpectedFirewallSubnetRoutes.foreach(__v => __obj.updateDynamic("ExpectedFirewallSubnetRoutes")(__v.asInstanceOf[js.Any]))
      ExpectedInternetGatewayRoutes.foreach(__v => __obj.updateDynamic("ExpectedInternetGatewayRoutes")(__v.asInstanceOf[js.Any]))
      FirewallSubnetId.foreach(__v => __obj.updateDynamic("FirewallSubnetId")(__v.asInstanceOf[js.Any]))
      InternetGatewayId.foreach(__v => __obj.updateDynamic("InternetGatewayId")(__v.asInstanceOf[js.Any]))
      IsRouteTableUsedInDifferentAZ.foreach(__v => __obj.updateDynamic("IsRouteTableUsedInDifferentAZ")(__v.asInstanceOf[js.Any]))
      RouteTableId.foreach(__v => __obj.updateDynamic("RouteTableId")(__v.asInstanceOf[js.Any]))
      SubnetAvailabilityZone.foreach(__v => __obj.updateDynamic("SubnetAvailabilityZone")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      ViolatingRoutes.foreach(__v => __obj.updateDynamic("ViolatingRoutes")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkFirewallInternetTrafficNotInspectedViolation]
    }
  }

  /** Violation detail for the improperly configured subnet route. It's possible there is a missing route table route, or a configuration that causes traffic to cross an Availability Zone boundary.
    */
  @js.native
  trait NetworkFirewallInvalidRouteConfigurationViolation extends js.Object {
    var ActualFirewallEndpoint: js.UndefOr[ResourceId]
    var ActualFirewallSubnetId: js.UndefOr[ResourceId]
    var ActualFirewallSubnetRoutes: js.UndefOr[Routes]
    var ActualInternetGatewayRoutes: js.UndefOr[Routes]
    var AffectedSubnets: js.UndefOr[ResourceIdList]
    var CurrentFirewallSubnetRouteTable: js.UndefOr[ResourceId]
    var CurrentInternetGatewayRouteTable: js.UndefOr[ResourceId]
    var ExpectedFirewallEndpoint: js.UndefOr[ResourceId]
    var ExpectedFirewallSubnetId: js.UndefOr[ResourceId]
    var ExpectedFirewallSubnetRoutes: js.UndefOr[ExpectedRoutes]
    var ExpectedInternetGatewayRoutes: js.UndefOr[ExpectedRoutes]
    var InternetGatewayId: js.UndefOr[ResourceId]
    var IsRouteTableUsedInDifferentAZ: js.UndefOr[Boolean]
    var RouteTableId: js.UndefOr[ResourceId]
    var ViolatingRoute: js.UndefOr[Route]
    var VpcId: js.UndefOr[ResourceId]
  }

  object NetworkFirewallInvalidRouteConfigurationViolation {
    @inline
    def apply(
        ActualFirewallEndpoint: js.UndefOr[ResourceId] = js.undefined,
        ActualFirewallSubnetId: js.UndefOr[ResourceId] = js.undefined,
        ActualFirewallSubnetRoutes: js.UndefOr[Routes] = js.undefined,
        ActualInternetGatewayRoutes: js.UndefOr[Routes] = js.undefined,
        AffectedSubnets: js.UndefOr[ResourceIdList] = js.undefined,
        CurrentFirewallSubnetRouteTable: js.UndefOr[ResourceId] = js.undefined,
        CurrentInternetGatewayRouteTable: js.UndefOr[ResourceId] = js.undefined,
        ExpectedFirewallEndpoint: js.UndefOr[ResourceId] = js.undefined,
        ExpectedFirewallSubnetId: js.UndefOr[ResourceId] = js.undefined,
        ExpectedFirewallSubnetRoutes: js.UndefOr[ExpectedRoutes] = js.undefined,
        ExpectedInternetGatewayRoutes: js.UndefOr[ExpectedRoutes] = js.undefined,
        InternetGatewayId: js.UndefOr[ResourceId] = js.undefined,
        IsRouteTableUsedInDifferentAZ: js.UndefOr[Boolean] = js.undefined,
        RouteTableId: js.UndefOr[ResourceId] = js.undefined,
        ViolatingRoute: js.UndefOr[Route] = js.undefined,
        VpcId: js.UndefOr[ResourceId] = js.undefined
    ): NetworkFirewallInvalidRouteConfigurationViolation = {
      val __obj = js.Dynamic.literal()
      ActualFirewallEndpoint.foreach(__v => __obj.updateDynamic("ActualFirewallEndpoint")(__v.asInstanceOf[js.Any]))
      ActualFirewallSubnetId.foreach(__v => __obj.updateDynamic("ActualFirewallSubnetId")(__v.asInstanceOf[js.Any]))
      ActualFirewallSubnetRoutes.foreach(__v => __obj.updateDynamic("ActualFirewallSubnetRoutes")(__v.asInstanceOf[js.Any]))
      ActualInternetGatewayRoutes.foreach(__v => __obj.updateDynamic("ActualInternetGatewayRoutes")(__v.asInstanceOf[js.Any]))
      AffectedSubnets.foreach(__v => __obj.updateDynamic("AffectedSubnets")(__v.asInstanceOf[js.Any]))
      CurrentFirewallSubnetRouteTable.foreach(__v => __obj.updateDynamic("CurrentFirewallSubnetRouteTable")(__v.asInstanceOf[js.Any]))
      CurrentInternetGatewayRouteTable.foreach(__v => __obj.updateDynamic("CurrentInternetGatewayRouteTable")(__v.asInstanceOf[js.Any]))
      ExpectedFirewallEndpoint.foreach(__v => __obj.updateDynamic("ExpectedFirewallEndpoint")(__v.asInstanceOf[js.Any]))
      ExpectedFirewallSubnetId.foreach(__v => __obj.updateDynamic("ExpectedFirewallSubnetId")(__v.asInstanceOf[js.Any]))
      ExpectedFirewallSubnetRoutes.foreach(__v => __obj.updateDynamic("ExpectedFirewallSubnetRoutes")(__v.asInstanceOf[js.Any]))
      ExpectedInternetGatewayRoutes.foreach(__v => __obj.updateDynamic("ExpectedInternetGatewayRoutes")(__v.asInstanceOf[js.Any]))
      InternetGatewayId.foreach(__v => __obj.updateDynamic("InternetGatewayId")(__v.asInstanceOf[js.Any]))
      IsRouteTableUsedInDifferentAZ.foreach(__v => __obj.updateDynamic("IsRouteTableUsedInDifferentAZ")(__v.asInstanceOf[js.Any]))
      RouteTableId.foreach(__v => __obj.updateDynamic("RouteTableId")(__v.asInstanceOf[js.Any]))
      ViolatingRoute.foreach(__v => __obj.updateDynamic("ViolatingRoute")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkFirewallInvalidRouteConfigurationViolation]
    }
  }

  /** Violation detail for Network Firewall for a subnet that's not associated to the expected Firewall Manager managed route table.
    */
  @js.native
  trait NetworkFirewallMissingExpectedRTViolation extends js.Object {
    var AvailabilityZone: js.UndefOr[LengthBoundedString]
    var CurrentRouteTable: js.UndefOr[ResourceId]
    var ExpectedRouteTable: js.UndefOr[ResourceId]
    var VPC: js.UndefOr[ResourceId]
    var ViolationTarget: js.UndefOr[ViolationTarget]
  }

  object NetworkFirewallMissingExpectedRTViolation {
    @inline
    def apply(
        AvailabilityZone: js.UndefOr[LengthBoundedString] = js.undefined,
        CurrentRouteTable: js.UndefOr[ResourceId] = js.undefined,
        ExpectedRouteTable: js.UndefOr[ResourceId] = js.undefined,
        VPC: js.UndefOr[ResourceId] = js.undefined,
        ViolationTarget: js.UndefOr[ViolationTarget] = js.undefined
    ): NetworkFirewallMissingExpectedRTViolation = {
      val __obj = js.Dynamic.literal()
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      CurrentRouteTable.foreach(__v => __obj.updateDynamic("CurrentRouteTable")(__v.asInstanceOf[js.Any]))
      ExpectedRouteTable.foreach(__v => __obj.updateDynamic("ExpectedRouteTable")(__v.asInstanceOf[js.Any]))
      VPC.foreach(__v => __obj.updateDynamic("VPC")(__v.asInstanceOf[js.Any]))
      ViolationTarget.foreach(__v => __obj.updateDynamic("ViolationTarget")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkFirewallMissingExpectedRTViolation]
    }
  }

  /** Violation detail for an expected route missing in Network Firewall.
    */
  @js.native
  trait NetworkFirewallMissingExpectedRoutesViolation extends js.Object {
    var ExpectedRoutes: js.UndefOr[ExpectedRoutes]
    var ViolationTarget: js.UndefOr[ViolationTarget]
    var VpcId: js.UndefOr[ResourceId]
  }

  object NetworkFirewallMissingExpectedRoutesViolation {
    @inline
    def apply(
        ExpectedRoutes: js.UndefOr[ExpectedRoutes] = js.undefined,
        ViolationTarget: js.UndefOr[ViolationTarget] = js.undefined,
        VpcId: js.UndefOr[ResourceId] = js.undefined
    ): NetworkFirewallMissingExpectedRoutesViolation = {
      val __obj = js.Dynamic.literal()
      ExpectedRoutes.foreach(__v => __obj.updateDynamic("ExpectedRoutes")(__v.asInstanceOf[js.Any]))
      ViolationTarget.foreach(__v => __obj.updateDynamic("ViolationTarget")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkFirewallMissingExpectedRoutesViolation]
    }
  }

  /** Violation detail for Network Firewall for a subnet that doesn't have a Firewall Manager managed firewall in its VPC.
    */
  @js.native
  trait NetworkFirewallMissingFirewallViolation extends js.Object {
    var AvailabilityZone: js.UndefOr[LengthBoundedString]
    var TargetViolationReason: js.UndefOr[TargetViolationReason]
    var VPC: js.UndefOr[ResourceId]
    var ViolationTarget: js.UndefOr[ViolationTarget]
  }

  object NetworkFirewallMissingFirewallViolation {
    @inline
    def apply(
        AvailabilityZone: js.UndefOr[LengthBoundedString] = js.undefined,
        TargetViolationReason: js.UndefOr[TargetViolationReason] = js.undefined,
        VPC: js.UndefOr[ResourceId] = js.undefined,
        ViolationTarget: js.UndefOr[ViolationTarget] = js.undefined
    ): NetworkFirewallMissingFirewallViolation = {
      val __obj = js.Dynamic.literal()
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      TargetViolationReason.foreach(__v => __obj.updateDynamic("TargetViolationReason")(__v.asInstanceOf[js.Any]))
      VPC.foreach(__v => __obj.updateDynamic("VPC")(__v.asInstanceOf[js.Any]))
      ViolationTarget.foreach(__v => __obj.updateDynamic("ViolationTarget")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkFirewallMissingFirewallViolation]
    }
  }

  /** Violation detail for Network Firewall for an Availability Zone that's missing the expected Firewall Manager managed subnet.
    */
  @js.native
  trait NetworkFirewallMissingSubnetViolation extends js.Object {
    var AvailabilityZone: js.UndefOr[LengthBoundedString]
    var TargetViolationReason: js.UndefOr[TargetViolationReason]
    var VPC: js.UndefOr[ResourceId]
    var ViolationTarget: js.UndefOr[ViolationTarget]
  }

  object NetworkFirewallMissingSubnetViolation {
    @inline
    def apply(
        AvailabilityZone: js.UndefOr[LengthBoundedString] = js.undefined,
        TargetViolationReason: js.UndefOr[TargetViolationReason] = js.undefined,
        VPC: js.UndefOr[ResourceId] = js.undefined,
        ViolationTarget: js.UndefOr[ViolationTarget] = js.undefined
    ): NetworkFirewallMissingSubnetViolation = {
      val __obj = js.Dynamic.literal()
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      TargetViolationReason.foreach(__v => __obj.updateDynamic("TargetViolationReason")(__v.asInstanceOf[js.Any]))
      VPC.foreach(__v => __obj.updateDynamic("VPC")(__v.asInstanceOf[js.Any]))
      ViolationTarget.foreach(__v => __obj.updateDynamic("ViolationTarget")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkFirewallMissingSubnetViolation]
    }
  }

  /** The definition of the Network Firewall firewall policy.
    */
  @js.native
  trait NetworkFirewallPolicyDescription extends js.Object {
    var StatefulRuleGroups: js.UndefOr[StatefulRuleGroupList]
    var StatelessCustomActions: js.UndefOr[NetworkFirewallActionList]
    var StatelessDefaultActions: js.UndefOr[NetworkFirewallActionList]
    var StatelessFragmentDefaultActions: js.UndefOr[NetworkFirewallActionList]
    var StatelessRuleGroups: js.UndefOr[StatelessRuleGroupList]
  }

  object NetworkFirewallPolicyDescription {
    @inline
    def apply(
        StatefulRuleGroups: js.UndefOr[StatefulRuleGroupList] = js.undefined,
        StatelessCustomActions: js.UndefOr[NetworkFirewallActionList] = js.undefined,
        StatelessDefaultActions: js.UndefOr[NetworkFirewallActionList] = js.undefined,
        StatelessFragmentDefaultActions: js.UndefOr[NetworkFirewallActionList] = js.undefined,
        StatelessRuleGroups: js.UndefOr[StatelessRuleGroupList] = js.undefined
    ): NetworkFirewallPolicyDescription = {
      val __obj = js.Dynamic.literal()
      StatefulRuleGroups.foreach(__v => __obj.updateDynamic("StatefulRuleGroups")(__v.asInstanceOf[js.Any]))
      StatelessCustomActions.foreach(__v => __obj.updateDynamic("StatelessCustomActions")(__v.asInstanceOf[js.Any]))
      StatelessDefaultActions.foreach(__v => __obj.updateDynamic("StatelessDefaultActions")(__v.asInstanceOf[js.Any]))
      StatelessFragmentDefaultActions.foreach(__v => __obj.updateDynamic("StatelessFragmentDefaultActions")(__v.asInstanceOf[js.Any]))
      StatelessRuleGroups.foreach(__v => __obj.updateDynamic("StatelessRuleGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkFirewallPolicyDescription]
    }
  }

  /** Violation detail for Network Firewall for a firewall policy that has a different <a>NetworkFirewallPolicyDescription</a> than is required by the Firewall Manager policy.
    */
  @js.native
  trait NetworkFirewallPolicyModifiedViolation extends js.Object {
    var CurrentPolicyDescription: js.UndefOr[NetworkFirewallPolicyDescription]
    var ExpectedPolicyDescription: js.UndefOr[NetworkFirewallPolicyDescription]
    var ViolationTarget: js.UndefOr[ViolationTarget]
  }

  object NetworkFirewallPolicyModifiedViolation {
    @inline
    def apply(
        CurrentPolicyDescription: js.UndefOr[NetworkFirewallPolicyDescription] = js.undefined,
        ExpectedPolicyDescription: js.UndefOr[NetworkFirewallPolicyDescription] = js.undefined,
        ViolationTarget: js.UndefOr[ViolationTarget] = js.undefined
    ): NetworkFirewallPolicyModifiedViolation = {
      val __obj = js.Dynamic.literal()
      CurrentPolicyDescription.foreach(__v => __obj.updateDynamic("CurrentPolicyDescription")(__v.asInstanceOf[js.Any]))
      ExpectedPolicyDescription.foreach(__v => __obj.updateDynamic("ExpectedPolicyDescription")(__v.asInstanceOf[js.Any]))
      ViolationTarget.foreach(__v => __obj.updateDynamic("ViolationTarget")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkFirewallPolicyModifiedViolation]
    }
  }

  /** Violation detail for an unexpected route that's present in a route table.
    */
  @js.native
  trait NetworkFirewallUnexpectedFirewallRoutesViolation extends js.Object {
    var FirewallEndpoint: js.UndefOr[ResourceId]
    var FirewallSubnetId: js.UndefOr[ResourceId]
    var RouteTableId: js.UndefOr[ResourceId]
    var ViolatingRoutes: js.UndefOr[Routes]
    var VpcId: js.UndefOr[ResourceId]
  }

  object NetworkFirewallUnexpectedFirewallRoutesViolation {
    @inline
    def apply(
        FirewallEndpoint: js.UndefOr[ResourceId] = js.undefined,
        FirewallSubnetId: js.UndefOr[ResourceId] = js.undefined,
        RouteTableId: js.UndefOr[ResourceId] = js.undefined,
        ViolatingRoutes: js.UndefOr[Routes] = js.undefined,
        VpcId: js.UndefOr[ResourceId] = js.undefined
    ): NetworkFirewallUnexpectedFirewallRoutesViolation = {
      val __obj = js.Dynamic.literal()
      FirewallEndpoint.foreach(__v => __obj.updateDynamic("FirewallEndpoint")(__v.asInstanceOf[js.Any]))
      FirewallSubnetId.foreach(__v => __obj.updateDynamic("FirewallSubnetId")(__v.asInstanceOf[js.Any]))
      RouteTableId.foreach(__v => __obj.updateDynamic("RouteTableId")(__v.asInstanceOf[js.Any]))
      ViolatingRoutes.foreach(__v => __obj.updateDynamic("ViolatingRoutes")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkFirewallUnexpectedFirewallRoutesViolation]
    }
  }

  /** Violation detail for an unexpected gateway route that’s present in a route table.
    */
  @js.native
  trait NetworkFirewallUnexpectedGatewayRoutesViolation extends js.Object {
    var GatewayId: js.UndefOr[ResourceId]
    var RouteTableId: js.UndefOr[ResourceId]
    var ViolatingRoutes: js.UndefOr[Routes]
    var VpcId: js.UndefOr[ResourceId]
  }

  object NetworkFirewallUnexpectedGatewayRoutesViolation {
    @inline
    def apply(
        GatewayId: js.UndefOr[ResourceId] = js.undefined,
        RouteTableId: js.UndefOr[ResourceId] = js.undefined,
        ViolatingRoutes: js.UndefOr[Routes] = js.undefined,
        VpcId: js.UndefOr[ResourceId] = js.undefined
    ): NetworkFirewallUnexpectedGatewayRoutesViolation = {
      val __obj = js.Dynamic.literal()
      GatewayId.foreach(__v => __obj.updateDynamic("GatewayId")(__v.asInstanceOf[js.Any]))
      RouteTableId.foreach(__v => __obj.updateDynamic("RouteTableId")(__v.asInstanceOf[js.Any]))
      ViolatingRoutes.foreach(__v => __obj.updateDynamic("ViolatingRoutes")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkFirewallUnexpectedGatewayRoutesViolation]
    }
  }

  /** The reference rule that partially matches the <code>ViolationTarget</code> rule and violation reason.
    */
  @js.native
  trait PartialMatch extends js.Object {
    var Reference: js.UndefOr[ReferenceRule]
    var TargetViolationReasons: js.UndefOr[TargetViolationReasons]
  }

  object PartialMatch {
    @inline
    def apply(
        Reference: js.UndefOr[ReferenceRule] = js.undefined,
        TargetViolationReasons: js.UndefOr[TargetViolationReasons] = js.undefined
    ): PartialMatch = {
      val __obj = js.Dynamic.literal()
      Reference.foreach(__v => __obj.updateDynamic("Reference")(__v.asInstanceOf[js.Any]))
      TargetViolationReasons.foreach(__v => __obj.updateDynamic("TargetViolationReasons")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PartialMatch]
    }
  }

  /** An Firewall Manager policy.
    */
  @js.native
  trait Policy extends js.Object {
    var ExcludeResourceTags: Boolean
    var PolicyName: ResourceName
    var RemediationEnabled: Boolean
    var ResourceType: ResourceType
    var SecurityServicePolicyData: SecurityServicePolicyData
    var DeleteUnusedFMManagedResources: js.UndefOr[Boolean]
    var ExcludeMap: js.UndefOr[CustomerPolicyScopeMap]
    var IncludeMap: js.UndefOr[CustomerPolicyScopeMap]
    var PolicyId: js.UndefOr[PolicyId]
    var PolicyUpdateToken: js.UndefOr[PolicyUpdateToken]
    var ResourceTags: js.UndefOr[ResourceTags]
    var ResourceTypeList: js.UndefOr[ResourceTypeList]
  }

  object Policy {
    @inline
    def apply(
        ExcludeResourceTags: Boolean,
        PolicyName: ResourceName,
        RemediationEnabled: Boolean,
        ResourceType: ResourceType,
        SecurityServicePolicyData: SecurityServicePolicyData,
        DeleteUnusedFMManagedResources: js.UndefOr[Boolean] = js.undefined,
        ExcludeMap: js.UndefOr[CustomerPolicyScopeMap] = js.undefined,
        IncludeMap: js.UndefOr[CustomerPolicyScopeMap] = js.undefined,
        PolicyId: js.UndefOr[PolicyId] = js.undefined,
        PolicyUpdateToken: js.UndefOr[PolicyUpdateToken] = js.undefined,
        ResourceTags: js.UndefOr[ResourceTags] = js.undefined,
        ResourceTypeList: js.UndefOr[ResourceTypeList] = js.undefined
    ): Policy = {
      val __obj = js.Dynamic.literal(
        "ExcludeResourceTags" -> ExcludeResourceTags.asInstanceOf[js.Any],
        "PolicyName" -> PolicyName.asInstanceOf[js.Any],
        "RemediationEnabled" -> RemediationEnabled.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "SecurityServicePolicyData" -> SecurityServicePolicyData.asInstanceOf[js.Any]
      )

      DeleteUnusedFMManagedResources.foreach(__v => __obj.updateDynamic("DeleteUnusedFMManagedResources")(__v.asInstanceOf[js.Any]))
      ExcludeMap.foreach(__v => __obj.updateDynamic("ExcludeMap")(__v.asInstanceOf[js.Any]))
      IncludeMap.foreach(__v => __obj.updateDynamic("IncludeMap")(__v.asInstanceOf[js.Any]))
      PolicyId.foreach(__v => __obj.updateDynamic("PolicyId")(__v.asInstanceOf[js.Any]))
      PolicyUpdateToken.foreach(__v => __obj.updateDynamic("PolicyUpdateToken")(__v.asInstanceOf[js.Any]))
      ResourceTags.foreach(__v => __obj.updateDynamic("ResourceTags")(__v.asInstanceOf[js.Any]))
      ResourceTypeList.foreach(__v => __obj.updateDynamic("ResourceTypeList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Policy]
    }
  }

  /** Describes the noncompliant resources in a member account for a specific Firewall Manager policy. A maximum of 100 entries are displayed. If more than 100 resources are noncompliant, <code>EvaluationLimitExceeded</code> is set to <code>True</code>.
    */
  @js.native
  trait PolicyComplianceDetail extends js.Object {
    var EvaluationLimitExceeded: js.UndefOr[Boolean]
    var ExpiredAt: js.UndefOr[TimeStamp]
    var IssueInfoMap: js.UndefOr[IssueInfoMap]
    var MemberAccount: js.UndefOr[AWSAccountId]
    var PolicyId: js.UndefOr[PolicyId]
    var PolicyOwner: js.UndefOr[AWSAccountId]
    var Violators: js.UndefOr[ComplianceViolators]
  }

  object PolicyComplianceDetail {
    @inline
    def apply(
        EvaluationLimitExceeded: js.UndefOr[Boolean] = js.undefined,
        ExpiredAt: js.UndefOr[TimeStamp] = js.undefined,
        IssueInfoMap: js.UndefOr[IssueInfoMap] = js.undefined,
        MemberAccount: js.UndefOr[AWSAccountId] = js.undefined,
        PolicyId: js.UndefOr[PolicyId] = js.undefined,
        PolicyOwner: js.UndefOr[AWSAccountId] = js.undefined,
        Violators: js.UndefOr[ComplianceViolators] = js.undefined
    ): PolicyComplianceDetail = {
      val __obj = js.Dynamic.literal()
      EvaluationLimitExceeded.foreach(__v => __obj.updateDynamic("EvaluationLimitExceeded")(__v.asInstanceOf[js.Any]))
      ExpiredAt.foreach(__v => __obj.updateDynamic("ExpiredAt")(__v.asInstanceOf[js.Any]))
      IssueInfoMap.foreach(__v => __obj.updateDynamic("IssueInfoMap")(__v.asInstanceOf[js.Any]))
      MemberAccount.foreach(__v => __obj.updateDynamic("MemberAccount")(__v.asInstanceOf[js.Any]))
      PolicyId.foreach(__v => __obj.updateDynamic("PolicyId")(__v.asInstanceOf[js.Any]))
      PolicyOwner.foreach(__v => __obj.updateDynamic("PolicyOwner")(__v.asInstanceOf[js.Any]))
      Violators.foreach(__v => __obj.updateDynamic("Violators")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyComplianceDetail]
    }
  }

  /** Indicates whether the account is compliant with the specified policy. An account is considered noncompliant if it includes resources that are not protected by the policy, for WAF and Shield Advanced policies, or that are noncompliant with the policy, for security group policies.
    */
  @js.native
  trait PolicyComplianceStatus extends js.Object {
    var EvaluationResults: js.UndefOr[EvaluationResults]
    var IssueInfoMap: js.UndefOr[IssueInfoMap]
    var LastUpdated: js.UndefOr[TimeStamp]
    var MemberAccount: js.UndefOr[AWSAccountId]
    var PolicyId: js.UndefOr[PolicyId]
    var PolicyName: js.UndefOr[ResourceName]
    var PolicyOwner: js.UndefOr[AWSAccountId]
  }

  object PolicyComplianceStatus {
    @inline
    def apply(
        EvaluationResults: js.UndefOr[EvaluationResults] = js.undefined,
        IssueInfoMap: js.UndefOr[IssueInfoMap] = js.undefined,
        LastUpdated: js.UndefOr[TimeStamp] = js.undefined,
        MemberAccount: js.UndefOr[AWSAccountId] = js.undefined,
        PolicyId: js.UndefOr[PolicyId] = js.undefined,
        PolicyName: js.UndefOr[ResourceName] = js.undefined,
        PolicyOwner: js.UndefOr[AWSAccountId] = js.undefined
    ): PolicyComplianceStatus = {
      val __obj = js.Dynamic.literal()
      EvaluationResults.foreach(__v => __obj.updateDynamic("EvaluationResults")(__v.asInstanceOf[js.Any]))
      IssueInfoMap.foreach(__v => __obj.updateDynamic("IssueInfoMap")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      MemberAccount.foreach(__v => __obj.updateDynamic("MemberAccount")(__v.asInstanceOf[js.Any]))
      PolicyId.foreach(__v => __obj.updateDynamic("PolicyId")(__v.asInstanceOf[js.Any]))
      PolicyName.foreach(__v => __obj.updateDynamic("PolicyName")(__v.asInstanceOf[js.Any]))
      PolicyOwner.foreach(__v => __obj.updateDynamic("PolicyOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyComplianceStatus]
    }
  }

  /** Details of the Firewall Manager policy.
    */
  @js.native
  trait PolicySummary extends js.Object {
    var DeleteUnusedFMManagedResources: js.UndefOr[Boolean]
    var PolicyArn: js.UndefOr[ResourceArn]
    var PolicyId: js.UndefOr[PolicyId]
    var PolicyName: js.UndefOr[ResourceName]
    var RemediationEnabled: js.UndefOr[Boolean]
    var ResourceType: js.UndefOr[ResourceType]
    var SecurityServiceType: js.UndefOr[SecurityServiceType]
  }

  object PolicySummary {
    @inline
    def apply(
        DeleteUnusedFMManagedResources: js.UndefOr[Boolean] = js.undefined,
        PolicyArn: js.UndefOr[ResourceArn] = js.undefined,
        PolicyId: js.UndefOr[PolicyId] = js.undefined,
        PolicyName: js.UndefOr[ResourceName] = js.undefined,
        RemediationEnabled: js.UndefOr[Boolean] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined,
        SecurityServiceType: js.UndefOr[SecurityServiceType] = js.undefined
    ): PolicySummary = {
      val __obj = js.Dynamic.literal()
      DeleteUnusedFMManagedResources.foreach(__v => __obj.updateDynamic("DeleteUnusedFMManagedResources")(__v.asInstanceOf[js.Any]))
      PolicyArn.foreach(__v => __obj.updateDynamic("PolicyArn")(__v.asInstanceOf[js.Any]))
      PolicyId.foreach(__v => __obj.updateDynamic("PolicyId")(__v.asInstanceOf[js.Any]))
      PolicyName.foreach(__v => __obj.updateDynamic("PolicyName")(__v.asInstanceOf[js.Any]))
      RemediationEnabled.foreach(__v => __obj.updateDynamic("RemediationEnabled")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      SecurityServiceType.foreach(__v => __obj.updateDynamic("SecurityServiceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicySummary]
    }
  }

  /** A list of remediation actions.
    */
  @js.native
  trait PossibleRemediationAction extends js.Object {
    var OrderedRemediationActions: OrderedRemediationActions
    var Description: js.UndefOr[LengthBoundedString]
    var IsDefaultAction: js.UndefOr[Boolean]
  }

  object PossibleRemediationAction {
    @inline
    def apply(
        OrderedRemediationActions: OrderedRemediationActions,
        Description: js.UndefOr[LengthBoundedString] = js.undefined,
        IsDefaultAction: js.UndefOr[Boolean] = js.undefined
    ): PossibleRemediationAction = {
      val __obj = js.Dynamic.literal(
        "OrderedRemediationActions" -> OrderedRemediationActions.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IsDefaultAction.foreach(__v => __obj.updateDynamic("IsDefaultAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PossibleRemediationAction]
    }
  }

  /** A list of possible remediation action lists. Each individual possible remediation action is a list of individual remediation actions.
    */
  @js.native
  trait PossibleRemediationActions extends js.Object {
    var Actions: js.UndefOr[PossibleRemediationActionList]
    var Description: js.UndefOr[LengthBoundedString]
  }

  object PossibleRemediationActions {
    @inline
    def apply(
        Actions: js.UndefOr[PossibleRemediationActionList] = js.undefined,
        Description: js.UndefOr[LengthBoundedString] = js.undefined
    ): PossibleRemediationActions = {
      val __obj = js.Dynamic.literal()
      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PossibleRemediationActions]
    }
  }

  /** An Firewall Manager protocols list.
    */
  @js.native
  trait ProtocolsListData extends js.Object {
    var ListName: ResourceName
    var ProtocolsList: ProtocolsList
    var CreateTime: js.UndefOr[TimeStamp]
    var LastUpdateTime: js.UndefOr[TimeStamp]
    var ListId: js.UndefOr[ListId]
    var ListUpdateToken: js.UndefOr[UpdateToken]
    var PreviousProtocolsList: js.UndefOr[PreviousProtocolsList]
  }

  object ProtocolsListData {
    @inline
    def apply(
        ListName: ResourceName,
        ProtocolsList: ProtocolsList,
        CreateTime: js.UndefOr[TimeStamp] = js.undefined,
        LastUpdateTime: js.UndefOr[TimeStamp] = js.undefined,
        ListId: js.UndefOr[ListId] = js.undefined,
        ListUpdateToken: js.UndefOr[UpdateToken] = js.undefined,
        PreviousProtocolsList: js.UndefOr[PreviousProtocolsList] = js.undefined
    ): ProtocolsListData = {
      val __obj = js.Dynamic.literal(
        "ListName" -> ListName.asInstanceOf[js.Any],
        "ProtocolsList" -> ProtocolsList.asInstanceOf[js.Any]
      )

      CreateTime.foreach(__v => __obj.updateDynamic("CreateTime")(__v.asInstanceOf[js.Any]))
      LastUpdateTime.foreach(__v => __obj.updateDynamic("LastUpdateTime")(__v.asInstanceOf[js.Any]))
      ListId.foreach(__v => __obj.updateDynamic("ListId")(__v.asInstanceOf[js.Any]))
      ListUpdateToken.foreach(__v => __obj.updateDynamic("ListUpdateToken")(__v.asInstanceOf[js.Any]))
      PreviousProtocolsList.foreach(__v => __obj.updateDynamic("PreviousProtocolsList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProtocolsListData]
    }
  }

  /** Details of the Firewall Manager protocols list.
    */
  @js.native
  trait ProtocolsListDataSummary extends js.Object {
    var ListArn: js.UndefOr[ResourceArn]
    var ListId: js.UndefOr[ListId]
    var ListName: js.UndefOr[ResourceName]
    var ProtocolsList: js.UndefOr[ProtocolsList]
  }

  object ProtocolsListDataSummary {
    @inline
    def apply(
        ListArn: js.UndefOr[ResourceArn] = js.undefined,
        ListId: js.UndefOr[ListId] = js.undefined,
        ListName: js.UndefOr[ResourceName] = js.undefined,
        ProtocolsList: js.UndefOr[ProtocolsList] = js.undefined
    ): ProtocolsListDataSummary = {
      val __obj = js.Dynamic.literal()
      ListArn.foreach(__v => __obj.updateDynamic("ListArn")(__v.asInstanceOf[js.Any]))
      ListId.foreach(__v => __obj.updateDynamic("ListId")(__v.asInstanceOf[js.Any]))
      ListName.foreach(__v => __obj.updateDynamic("ListName")(__v.asInstanceOf[js.Any]))
      ProtocolsList.foreach(__v => __obj.updateDynamic("ProtocolsList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProtocolsListDataSummary]
    }
  }

  @js.native
  trait PutAppsListRequest extends js.Object {
    var AppsList: AppsListData
    var TagList: js.UndefOr[TagList]
  }

  object PutAppsListRequest {
    @inline
    def apply(
        AppsList: AppsListData,
        TagList: js.UndefOr[TagList] = js.undefined
    ): PutAppsListRequest = {
      val __obj = js.Dynamic.literal(
        "AppsList" -> AppsList.asInstanceOf[js.Any]
      )

      TagList.foreach(__v => __obj.updateDynamic("TagList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAppsListRequest]
    }
  }

  @js.native
  trait PutAppsListResponse extends js.Object {
    var AppsList: js.UndefOr[AppsListData]
    var AppsListArn: js.UndefOr[ResourceArn]
  }

  object PutAppsListResponse {
    @inline
    def apply(
        AppsList: js.UndefOr[AppsListData] = js.undefined,
        AppsListArn: js.UndefOr[ResourceArn] = js.undefined
    ): PutAppsListResponse = {
      val __obj = js.Dynamic.literal()
      AppsList.foreach(__v => __obj.updateDynamic("AppsList")(__v.asInstanceOf[js.Any]))
      AppsListArn.foreach(__v => __obj.updateDynamic("AppsListArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAppsListResponse]
    }
  }

  @js.native
  trait PutNotificationChannelRequest extends js.Object {
    var SnsRoleName: ResourceArn
    var SnsTopicArn: ResourceArn
  }

  object PutNotificationChannelRequest {
    @inline
    def apply(
        SnsRoleName: ResourceArn,
        SnsTopicArn: ResourceArn
    ): PutNotificationChannelRequest = {
      val __obj = js.Dynamic.literal(
        "SnsRoleName" -> SnsRoleName.asInstanceOf[js.Any],
        "SnsTopicArn" -> SnsTopicArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutNotificationChannelRequest]
    }
  }

  @js.native
  trait PutPolicyRequest extends js.Object {
    var Policy: Policy
    var TagList: js.UndefOr[TagList]
  }

  object PutPolicyRequest {
    @inline
    def apply(
        Policy: Policy,
        TagList: js.UndefOr[TagList] = js.undefined
    ): PutPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Policy" -> Policy.asInstanceOf[js.Any]
      )

      TagList.foreach(__v => __obj.updateDynamic("TagList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutPolicyRequest]
    }
  }

  @js.native
  trait PutPolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
    var PolicyArn: js.UndefOr[ResourceArn]
  }

  object PutPolicyResponse {
    @inline
    def apply(
        Policy: js.UndefOr[Policy] = js.undefined,
        PolicyArn: js.UndefOr[ResourceArn] = js.undefined
    ): PutPolicyResponse = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      PolicyArn.foreach(__v => __obj.updateDynamic("PolicyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutPolicyResponse]
    }
  }

  @js.native
  trait PutProtocolsListRequest extends js.Object {
    var ProtocolsList: ProtocolsListData
    var TagList: js.UndefOr[TagList]
  }

  object PutProtocolsListRequest {
    @inline
    def apply(
        ProtocolsList: ProtocolsListData,
        TagList: js.UndefOr[TagList] = js.undefined
    ): PutProtocolsListRequest = {
      val __obj = js.Dynamic.literal(
        "ProtocolsList" -> ProtocolsList.asInstanceOf[js.Any]
      )

      TagList.foreach(__v => __obj.updateDynamic("TagList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutProtocolsListRequest]
    }
  }

  @js.native
  trait PutProtocolsListResponse extends js.Object {
    var ProtocolsList: js.UndefOr[ProtocolsListData]
    var ProtocolsListArn: js.UndefOr[ResourceArn]
  }

  object PutProtocolsListResponse {
    @inline
    def apply(
        ProtocolsList: js.UndefOr[ProtocolsListData] = js.undefined,
        ProtocolsListArn: js.UndefOr[ResourceArn] = js.undefined
    ): PutProtocolsListResponse = {
      val __obj = js.Dynamic.literal()
      ProtocolsList.foreach(__v => __obj.updateDynamic("ProtocolsList")(__v.asInstanceOf[js.Any]))
      ProtocolsListArn.foreach(__v => __obj.updateDynamic("ProtocolsListArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutProtocolsListResponse]
    }
  }

  /** Information about an individual action you can take to remediate a violation.
    */
  @js.native
  trait RemediationAction extends js.Object {
    var Description: js.UndefOr[LengthBoundedString]
    var EC2AssociateRouteTableAction: js.UndefOr[EC2AssociateRouteTableAction]
    var EC2CopyRouteTableAction: js.UndefOr[EC2CopyRouteTableAction]
    var EC2CreateRouteAction: js.UndefOr[EC2CreateRouteAction]
    var EC2CreateRouteTableAction: js.UndefOr[EC2CreateRouteTableAction]
    var EC2DeleteRouteAction: js.UndefOr[EC2DeleteRouteAction]
    var EC2ReplaceRouteAction: js.UndefOr[EC2ReplaceRouteAction]
    var EC2ReplaceRouteTableAssociationAction: js.UndefOr[EC2ReplaceRouteTableAssociationAction]
  }

  object RemediationAction {
    @inline
    def apply(
        Description: js.UndefOr[LengthBoundedString] = js.undefined,
        EC2AssociateRouteTableAction: js.UndefOr[EC2AssociateRouteTableAction] = js.undefined,
        EC2CopyRouteTableAction: js.UndefOr[EC2CopyRouteTableAction] = js.undefined,
        EC2CreateRouteAction: js.UndefOr[EC2CreateRouteAction] = js.undefined,
        EC2CreateRouteTableAction: js.UndefOr[EC2CreateRouteTableAction] = js.undefined,
        EC2DeleteRouteAction: js.UndefOr[EC2DeleteRouteAction] = js.undefined,
        EC2ReplaceRouteAction: js.UndefOr[EC2ReplaceRouteAction] = js.undefined,
        EC2ReplaceRouteTableAssociationAction: js.UndefOr[EC2ReplaceRouteTableAssociationAction] = js.undefined
    ): RemediationAction = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EC2AssociateRouteTableAction.foreach(__v => __obj.updateDynamic("EC2AssociateRouteTableAction")(__v.asInstanceOf[js.Any]))
      EC2CopyRouteTableAction.foreach(__v => __obj.updateDynamic("EC2CopyRouteTableAction")(__v.asInstanceOf[js.Any]))
      EC2CreateRouteAction.foreach(__v => __obj.updateDynamic("EC2CreateRouteAction")(__v.asInstanceOf[js.Any]))
      EC2CreateRouteTableAction.foreach(__v => __obj.updateDynamic("EC2CreateRouteTableAction")(__v.asInstanceOf[js.Any]))
      EC2DeleteRouteAction.foreach(__v => __obj.updateDynamic("EC2DeleteRouteAction")(__v.asInstanceOf[js.Any]))
      EC2ReplaceRouteAction.foreach(__v => __obj.updateDynamic("EC2ReplaceRouteAction")(__v.asInstanceOf[js.Any]))
      EC2ReplaceRouteTableAssociationAction.foreach(__v => __obj.updateDynamic("EC2ReplaceRouteTableAssociationAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemediationAction]
    }
  }

  /** An ordered list of actions you can take to remediate a violation.
    */
  @js.native
  trait RemediationActionWithOrder extends js.Object {
    var Order: js.UndefOr[BasicInteger]
    var RemediationAction: js.UndefOr[RemediationAction]
  }

  object RemediationActionWithOrder {
    @inline
    def apply(
        Order: js.UndefOr[BasicInteger] = js.undefined,
        RemediationAction: js.UndefOr[RemediationAction] = js.undefined
    ): RemediationActionWithOrder = {
      val __obj = js.Dynamic.literal()
      Order.foreach(__v => __obj.updateDynamic("Order")(__v.asInstanceOf[js.Any]))
      RemediationAction.foreach(__v => __obj.updateDynamic("RemediationAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemediationActionWithOrder]
    }
  }

  /** The resource tags that Firewall Manager uses to determine if a particular resource should be included or excluded from the Firewall Manager policy. Tags enable you to categorize your Amazon Web Services resources in different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an optional value. Firewall Manager combines the tags with "AND" so that, if you add more than one tag to a policy scope, a resource must have all the specified tags to be included or excluded. For more information, see [[https://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/tag-editor.html|Working with Tag Editor]].
    */
  @js.native
  trait ResourceTag extends js.Object {
    var Key: ResourceTagKey
    var Value: js.UndefOr[ResourceTagValue]
  }

  object ResourceTag {
    @inline
    def apply(
        Key: ResourceTagKey,
        Value: js.UndefOr[ResourceTagValue] = js.undefined
    ): ResourceTag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceTag]
    }
  }

  /** Violation detail based on resource type.
    */
  @js.native
  trait ResourceViolation extends js.Object {
    var AwsEc2InstanceViolation: js.UndefOr[AwsEc2InstanceViolation]
    var AwsEc2NetworkInterfaceViolation: js.UndefOr[AwsEc2NetworkInterfaceViolation]
    var AwsVPCSecurityGroupViolation: js.UndefOr[AwsVPCSecurityGroupViolation]
    var DnsDuplicateRuleGroupViolation: js.UndefOr[DnsDuplicateRuleGroupViolation]
    var DnsRuleGroupLimitExceededViolation: js.UndefOr[DnsRuleGroupLimitExceededViolation]
    var DnsRuleGroupPriorityConflictViolation: js.UndefOr[DnsRuleGroupPriorityConflictViolation]
    var NetworkFirewallBlackHoleRouteDetectedViolation: js.UndefOr[NetworkFirewallBlackHoleRouteDetectedViolation]
    var NetworkFirewallInternetTrafficNotInspectedViolation: js.UndefOr[NetworkFirewallInternetTrafficNotInspectedViolation]
    var NetworkFirewallInvalidRouteConfigurationViolation: js.UndefOr[NetworkFirewallInvalidRouteConfigurationViolation]
    var NetworkFirewallMissingExpectedRTViolation: js.UndefOr[NetworkFirewallMissingExpectedRTViolation]
    var NetworkFirewallMissingExpectedRoutesViolation: js.UndefOr[NetworkFirewallMissingExpectedRoutesViolation]
    var NetworkFirewallMissingFirewallViolation: js.UndefOr[NetworkFirewallMissingFirewallViolation]
    var NetworkFirewallMissingSubnetViolation: js.UndefOr[NetworkFirewallMissingSubnetViolation]
    var NetworkFirewallPolicyModifiedViolation: js.UndefOr[NetworkFirewallPolicyModifiedViolation]
    var NetworkFirewallUnexpectedFirewallRoutesViolation: js.UndefOr[NetworkFirewallUnexpectedFirewallRoutesViolation]
    var NetworkFirewallUnexpectedGatewayRoutesViolation: js.UndefOr[NetworkFirewallUnexpectedGatewayRoutesViolation]
    var PossibleRemediationActions: js.UndefOr[PossibleRemediationActions]
  }

  object ResourceViolation {
    @inline
    def apply(
        AwsEc2InstanceViolation: js.UndefOr[AwsEc2InstanceViolation] = js.undefined,
        AwsEc2NetworkInterfaceViolation: js.UndefOr[AwsEc2NetworkInterfaceViolation] = js.undefined,
        AwsVPCSecurityGroupViolation: js.UndefOr[AwsVPCSecurityGroupViolation] = js.undefined,
        DnsDuplicateRuleGroupViolation: js.UndefOr[DnsDuplicateRuleGroupViolation] = js.undefined,
        DnsRuleGroupLimitExceededViolation: js.UndefOr[DnsRuleGroupLimitExceededViolation] = js.undefined,
        DnsRuleGroupPriorityConflictViolation: js.UndefOr[DnsRuleGroupPriorityConflictViolation] = js.undefined,
        NetworkFirewallBlackHoleRouteDetectedViolation: js.UndefOr[NetworkFirewallBlackHoleRouteDetectedViolation] = js.undefined,
        NetworkFirewallInternetTrafficNotInspectedViolation: js.UndefOr[NetworkFirewallInternetTrafficNotInspectedViolation] = js.undefined,
        NetworkFirewallInvalidRouteConfigurationViolation: js.UndefOr[NetworkFirewallInvalidRouteConfigurationViolation] = js.undefined,
        NetworkFirewallMissingExpectedRTViolation: js.UndefOr[NetworkFirewallMissingExpectedRTViolation] = js.undefined,
        NetworkFirewallMissingExpectedRoutesViolation: js.UndefOr[NetworkFirewallMissingExpectedRoutesViolation] = js.undefined,
        NetworkFirewallMissingFirewallViolation: js.UndefOr[NetworkFirewallMissingFirewallViolation] = js.undefined,
        NetworkFirewallMissingSubnetViolation: js.UndefOr[NetworkFirewallMissingSubnetViolation] = js.undefined,
        NetworkFirewallPolicyModifiedViolation: js.UndefOr[NetworkFirewallPolicyModifiedViolation] = js.undefined,
        NetworkFirewallUnexpectedFirewallRoutesViolation: js.UndefOr[NetworkFirewallUnexpectedFirewallRoutesViolation] = js.undefined,
        NetworkFirewallUnexpectedGatewayRoutesViolation: js.UndefOr[NetworkFirewallUnexpectedGatewayRoutesViolation] = js.undefined,
        PossibleRemediationActions: js.UndefOr[PossibleRemediationActions] = js.undefined
    ): ResourceViolation = {
      val __obj = js.Dynamic.literal()
      AwsEc2InstanceViolation.foreach(__v => __obj.updateDynamic("AwsEc2InstanceViolation")(__v.asInstanceOf[js.Any]))
      AwsEc2NetworkInterfaceViolation.foreach(__v => __obj.updateDynamic("AwsEc2NetworkInterfaceViolation")(__v.asInstanceOf[js.Any]))
      AwsVPCSecurityGroupViolation.foreach(__v => __obj.updateDynamic("AwsVPCSecurityGroupViolation")(__v.asInstanceOf[js.Any]))
      DnsDuplicateRuleGroupViolation.foreach(__v => __obj.updateDynamic("DnsDuplicateRuleGroupViolation")(__v.asInstanceOf[js.Any]))
      DnsRuleGroupLimitExceededViolation.foreach(__v => __obj.updateDynamic("DnsRuleGroupLimitExceededViolation")(__v.asInstanceOf[js.Any]))
      DnsRuleGroupPriorityConflictViolation.foreach(__v => __obj.updateDynamic("DnsRuleGroupPriorityConflictViolation")(__v.asInstanceOf[js.Any]))
      NetworkFirewallBlackHoleRouteDetectedViolation.foreach(__v => __obj.updateDynamic("NetworkFirewallBlackHoleRouteDetectedViolation")(__v.asInstanceOf[js.Any]))
      NetworkFirewallInternetTrafficNotInspectedViolation.foreach(__v => __obj.updateDynamic("NetworkFirewallInternetTrafficNotInspectedViolation")(__v.asInstanceOf[js.Any]))
      NetworkFirewallInvalidRouteConfigurationViolation.foreach(__v => __obj.updateDynamic("NetworkFirewallInvalidRouteConfigurationViolation")(__v.asInstanceOf[js.Any]))
      NetworkFirewallMissingExpectedRTViolation.foreach(__v => __obj.updateDynamic("NetworkFirewallMissingExpectedRTViolation")(__v.asInstanceOf[js.Any]))
      NetworkFirewallMissingExpectedRoutesViolation.foreach(__v => __obj.updateDynamic("NetworkFirewallMissingExpectedRoutesViolation")(__v.asInstanceOf[js.Any]))
      NetworkFirewallMissingFirewallViolation.foreach(__v => __obj.updateDynamic("NetworkFirewallMissingFirewallViolation")(__v.asInstanceOf[js.Any]))
      NetworkFirewallMissingSubnetViolation.foreach(__v => __obj.updateDynamic("NetworkFirewallMissingSubnetViolation")(__v.asInstanceOf[js.Any]))
      NetworkFirewallPolicyModifiedViolation.foreach(__v => __obj.updateDynamic("NetworkFirewallPolicyModifiedViolation")(__v.asInstanceOf[js.Any]))
      NetworkFirewallUnexpectedFirewallRoutesViolation.foreach(__v => __obj.updateDynamic("NetworkFirewallUnexpectedFirewallRoutesViolation")(__v.asInstanceOf[js.Any]))
      NetworkFirewallUnexpectedGatewayRoutesViolation.foreach(__v => __obj.updateDynamic("NetworkFirewallUnexpectedGatewayRoutesViolation")(__v.asInstanceOf[js.Any]))
      PossibleRemediationActions.foreach(__v => __obj.updateDynamic("PossibleRemediationActions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceViolation]
    }
  }

  /** Describes a route in a route table.
    */
  @js.native
  trait Route extends js.Object {
    var Destination: js.UndefOr[LengthBoundedString]
    var DestinationType: js.UndefOr[DestinationType]
    var Target: js.UndefOr[LengthBoundedString]
    var TargetType: js.UndefOr[TargetType]
  }

  object Route {
    @inline
    def apply(
        Destination: js.UndefOr[LengthBoundedString] = js.undefined,
        DestinationType: js.UndefOr[DestinationType] = js.undefined,
        Target: js.UndefOr[LengthBoundedString] = js.undefined,
        TargetType: js.UndefOr[TargetType] = js.undefined
    ): Route = {
      val __obj = js.Dynamic.literal()
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      DestinationType.foreach(__v => __obj.updateDynamic("DestinationType")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      TargetType.foreach(__v => __obj.updateDynamic("TargetType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Route]
    }
  }

  /** Remediation option for the rule specified in the <code>ViolationTarget</code>.
    */
  @js.native
  trait SecurityGroupRemediationAction extends js.Object {
    var Description: js.UndefOr[RemediationActionDescription]
    var IsDefaultAction: js.UndefOr[Boolean]
    var RemediationActionType: js.UndefOr[RemediationActionType]
    var RemediationResult: js.UndefOr[SecurityGroupRuleDescription]
  }

  object SecurityGroupRemediationAction {
    @inline
    def apply(
        Description: js.UndefOr[RemediationActionDescription] = js.undefined,
        IsDefaultAction: js.UndefOr[Boolean] = js.undefined,
        RemediationActionType: js.UndefOr[RemediationActionType] = js.undefined,
        RemediationResult: js.UndefOr[SecurityGroupRuleDescription] = js.undefined
    ): SecurityGroupRemediationAction = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IsDefaultAction.foreach(__v => __obj.updateDynamic("IsDefaultAction")(__v.asInstanceOf[js.Any]))
      RemediationActionType.foreach(__v => __obj.updateDynamic("RemediationActionType")(__v.asInstanceOf[js.Any]))
      RemediationResult.foreach(__v => __obj.updateDynamic("RemediationResult")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityGroupRemediationAction]
    }
  }

  /** Describes a set of permissions for a security group rule.
    */
  @js.native
  trait SecurityGroupRuleDescription extends js.Object {
    var FromPort: js.UndefOr[IPPortNumber]
    var IPV4Range: js.UndefOr[CIDR]
    var IPV6Range: js.UndefOr[CIDR]
    var PrefixListId: js.UndefOr[ResourceId]
    var Protocol: js.UndefOr[LengthBoundedString]
    var ToPort: js.UndefOr[IPPortNumber]
  }

  object SecurityGroupRuleDescription {
    @inline
    def apply(
        FromPort: js.UndefOr[IPPortNumber] = js.undefined,
        IPV4Range: js.UndefOr[CIDR] = js.undefined,
        IPV6Range: js.UndefOr[CIDR] = js.undefined,
        PrefixListId: js.UndefOr[ResourceId] = js.undefined,
        Protocol: js.UndefOr[LengthBoundedString] = js.undefined,
        ToPort: js.UndefOr[IPPortNumber] = js.undefined
    ): SecurityGroupRuleDescription = {
      val __obj = js.Dynamic.literal()
      FromPort.foreach(__v => __obj.updateDynamic("FromPort")(__v.asInstanceOf[js.Any]))
      IPV4Range.foreach(__v => __obj.updateDynamic("IPV4Range")(__v.asInstanceOf[js.Any]))
      IPV6Range.foreach(__v => __obj.updateDynamic("IPV6Range")(__v.asInstanceOf[js.Any]))
      PrefixListId.foreach(__v => __obj.updateDynamic("PrefixListId")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      ToPort.foreach(__v => __obj.updateDynamic("ToPort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityGroupRuleDescription]
    }
  }

  /** Details about the security service that is being used to protect the resources.
    */
  @js.native
  trait SecurityServicePolicyData extends js.Object {
    var Type: SecurityServiceType
    var ManagedServiceData: js.UndefOr[ManagedServiceData]
  }

  object SecurityServicePolicyData {
    @inline
    def apply(
        Type: SecurityServiceType,
        ManagedServiceData: js.UndefOr[ManagedServiceData] = js.undefined
    ): SecurityServicePolicyData = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      ManagedServiceData.foreach(__v => __obj.updateDynamic("ManagedServiceData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityServicePolicyData]
    }
  }

  /** Network Firewall stateful rule group, used in a <a>NetworkFirewallPolicyDescription</a>.
    */
  @js.native
  trait StatefulRuleGroup extends js.Object {
    var ResourceId: js.UndefOr[ResourceId]
    var RuleGroupName: js.UndefOr[NetworkFirewallResourceName]
  }

  object StatefulRuleGroup {
    @inline
    def apply(
        ResourceId: js.UndefOr[ResourceId] = js.undefined,
        RuleGroupName: js.UndefOr[NetworkFirewallResourceName] = js.undefined
    ): StatefulRuleGroup = {
      val __obj = js.Dynamic.literal()
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      RuleGroupName.foreach(__v => __obj.updateDynamic("RuleGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StatefulRuleGroup]
    }
  }

  /** Network Firewall stateless rule group, used in a <a>NetworkFirewallPolicyDescription</a>.
    */
  @js.native
  trait StatelessRuleGroup extends js.Object {
    var Priority: js.UndefOr[StatelessRuleGroupPriority]
    var ResourceId: js.UndefOr[ResourceId]
    var RuleGroupName: js.UndefOr[NetworkFirewallResourceName]
  }

  object StatelessRuleGroup {
    @inline
    def apply(
        Priority: js.UndefOr[StatelessRuleGroupPriority] = js.undefined,
        ResourceId: js.UndefOr[ResourceId] = js.undefined,
        RuleGroupName: js.UndefOr[NetworkFirewallResourceName] = js.undefined
    ): StatelessRuleGroup = {
      val __obj = js.Dynamic.literal()
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      RuleGroupName.foreach(__v => __obj.updateDynamic("RuleGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StatelessRuleGroup]
    }
  }

  /** A collection of key:value pairs associated with an Amazon Web Services resource. The key:value pair can be anything you define. Typically, the tag key represents a category (such as "environment") and the tag value represents a specific value within that category (such as "test," "development," or "production"). You can add up to 50 tags to each Amazon Web Services resource.
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
    var TagList: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn,
        TagList: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagList" -> TagList.asInstanceOf[js.Any]
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

  /** Violations for a resource based on the specified Firewall Manager policy and Amazon Web Services account.
    */
  @js.native
  trait ViolationDetail extends js.Object {
    var MemberAccount: AWSAccountId
    var PolicyId: PolicyId
    var ResourceId: ResourceId
    var ResourceType: ResourceType
    var ResourceViolations: ResourceViolations
    var ResourceDescription: js.UndefOr[LengthBoundedString]
    var ResourceTags: js.UndefOr[TagList]
  }

  object ViolationDetail {
    @inline
    def apply(
        MemberAccount: AWSAccountId,
        PolicyId: PolicyId,
        ResourceId: ResourceId,
        ResourceType: ResourceType,
        ResourceViolations: ResourceViolations,
        ResourceDescription: js.UndefOr[LengthBoundedString] = js.undefined,
        ResourceTags: js.UndefOr[TagList] = js.undefined
    ): ViolationDetail = {
      val __obj = js.Dynamic.literal(
        "MemberAccount" -> MemberAccount.asInstanceOf[js.Any],
        "PolicyId" -> PolicyId.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "ResourceViolations" -> ResourceViolations.asInstanceOf[js.Any]
      )

      ResourceDescription.foreach(__v => __obj.updateDynamic("ResourceDescription")(__v.asInstanceOf[js.Any]))
      ResourceTags.foreach(__v => __obj.updateDynamic("ResourceTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ViolationDetail]
    }
  }
}
