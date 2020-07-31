package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object fms {
  type AWSAccountId = String
  type AppsList = js.Array[App]
  type AppsListsData = js.Array[AppsListDataSummary]
  type AwsEc2NetworkInterfaceViolations = js.Array[AwsEc2NetworkInterfaceViolation]
  type CIDR = String
  type ComplianceViolators = js.Array[ComplianceViolator]
  type CustomerPolicyScopeId = String
  type CustomerPolicyScopeIdList = js.Array[CustomerPolicyScopeId]
  type CustomerPolicyScopeMap = js.Dictionary[CustomerPolicyScopeIdList]
  type DetailedInfo = String
  type EvaluationResults = js.Array[EvaluationResult]
  type IPPortNumber = Double
  type IssueInfoMap = js.Dictionary[DetailedInfo]
  type LengthBoundedString = String
  type ListId = String
  type ManagedServiceData = String
  type MemberAccounts = js.Array[AWSAccountId]
  type PaginationMaxResults = Int
  type PaginationToken = String
  type PartialMatches = js.Array[PartialMatch]
  type PolicyComplianceStatusList = js.Array[PolicyComplianceStatus]
  type PolicyId = String
  type PolicySummaryList = js.Array[PolicySummary]
  type PolicyUpdateToken = String
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
  type SecurityGroupRemediationActions = js.Array[SecurityGroupRemediationAction]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TargetViolationReason = String
  type TargetViolationReasons = js.Array[TargetViolationReason]
  type TimeStamp = js.Date
  type UpdateToken = String
  type ViolationTarget = String

  implicit final class FMSOps(private val service: FMS) extends AnyVal {

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
}

package fms {
  @js.native
  @JSImport("aws-sdk", "FMS", "AWS.FMS")
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

  @js.native
  sealed trait AccountRoleStatus extends js.Any
  object AccountRoleStatus {
    val READY = "READY".asInstanceOf[AccountRoleStatus]
    val CREATING = "CREATING".asInstanceOf[AccountRoleStatus]
    val PENDING_DELETION = "PENDING_DELETION".asInstanceOf[AccountRoleStatus]
    val DELETING = "DELETING".asInstanceOf[AccountRoleStatus]
    val DELETED = "DELETED".asInstanceOf[AccountRoleStatus]

    @inline def values = js.Object.freeze(js.Array(READY, CREATING, PENDING_DELETION, DELETING, DELETED))
  }

  /**
    * An individual AWS Firewall Manager application.
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

  /**
    * An AWS Firewall Manager applications list.
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

  /**
    * Details of the AWS Firewall Manager applications list.
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

  /**
    * Violations for an EC2 instance resource.
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

  /**
    * Violations for network interfaces associated with an EC2 instance.
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

  /**
    * Details of the rule violation in a security group when compared to the master security group of the AWS Firewall Manager policy.
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

  /**
    * Details of the resource that is not protected by the policy.
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
  sealed trait CustomerPolicyScopeIdType extends js.Any
  object CustomerPolicyScopeIdType {
    val ACCOUNT = "ACCOUNT".asInstanceOf[CustomerPolicyScopeIdType]
    val ORG_UNIT = "ORG_UNIT".asInstanceOf[CustomerPolicyScopeIdType]

    @inline def values = js.Object.freeze(js.Array(ACCOUNT, ORG_UNIT))
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
  trait DeleteNotificationChannelRequest extends js.Object {}

  object DeleteNotificationChannelRequest {
    @inline
    def apply(
    ): DeleteNotificationChannelRequest = {
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
  sealed trait DependentServiceName extends js.Any
  object DependentServiceName {
    val AWSCONFIG = "AWSCONFIG".asInstanceOf[DependentServiceName]
    val AWSWAF = "AWSWAF".asInstanceOf[DependentServiceName]
    val AWSSHIELD_ADVANCED = "AWSSHIELD_ADVANCED".asInstanceOf[DependentServiceName]
    val AWSVPC = "AWSVPC".asInstanceOf[DependentServiceName]

    @inline def values = js.Object.freeze(js.Array(AWSCONFIG, AWSWAF, AWSSHIELD_ADVANCED, AWSVPC))
  }

  @js.native
  trait DisassociateAdminAccountRequest extends js.Object {}

  object DisassociateAdminAccountRequest {
    @inline
    def apply(
    ): DisassociateAdminAccountRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateAdminAccountRequest]
    }
  }

  /**
    * Describes the compliance status for the account. An account is considered noncompliant if it includes resources that are not protected by the specified policy or that don't comply with the policy.
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

  @js.native
  trait GetAdminAccountRequest extends js.Object {}

  object GetAdminAccountRequest {
    @inline
    def apply(
    ): GetAdminAccountRequest = {
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
  trait GetNotificationChannelRequest extends js.Object {}

  object GetNotificationChannelRequest {
    @inline
    def apply(
    ): GetNotificationChannelRequest = {
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

  /**
    * The reference rule that partially matches the <code>ViolationTarget</code> rule and violation reason.
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

  /**
    * An AWS Firewall Manager policy.
    */
  @js.native
  trait Policy extends js.Object {
    var ExcludeResourceTags: Boolean
    var PolicyName: ResourceName
    var RemediationEnabled: Boolean
    var ResourceType: ResourceType
    var SecurityServicePolicyData: SecurityServicePolicyData
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

      ExcludeMap.foreach(__v => __obj.updateDynamic("ExcludeMap")(__v.asInstanceOf[js.Any]))
      IncludeMap.foreach(__v => __obj.updateDynamic("IncludeMap")(__v.asInstanceOf[js.Any]))
      PolicyId.foreach(__v => __obj.updateDynamic("PolicyId")(__v.asInstanceOf[js.Any]))
      PolicyUpdateToken.foreach(__v => __obj.updateDynamic("PolicyUpdateToken")(__v.asInstanceOf[js.Any]))
      ResourceTags.foreach(__v => __obj.updateDynamic("ResourceTags")(__v.asInstanceOf[js.Any]))
      ResourceTypeList.foreach(__v => __obj.updateDynamic("ResourceTypeList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Policy]
    }
  }

  /**
    * Describes the noncompliant resources in a member account for a specific AWS Firewall Manager policy. A maximum of 100 entries are displayed. If more than 100 resources are noncompliant, <code>EvaluationLimitExceeded</code> is set to <code>True</code>.
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

  /**
    * Indicates whether the account is compliant with the specified policy. An account is considered noncompliant if it includes resources that are not protected by the policy, for AWS WAF and Shield Advanced policies, or that are noncompliant with the policy, for security group policies.
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

  @js.native
  sealed trait PolicyComplianceStatusType extends js.Any
  object PolicyComplianceStatusType {
    val COMPLIANT = "COMPLIANT".asInstanceOf[PolicyComplianceStatusType]
    val NON_COMPLIANT = "NON_COMPLIANT".asInstanceOf[PolicyComplianceStatusType]

    @inline def values = js.Object.freeze(js.Array(COMPLIANT, NON_COMPLIANT))
  }

  /**
    * Details of the AWS Firewall Manager policy.
    */
  @js.native
  trait PolicySummary extends js.Object {
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
        PolicyArn: js.UndefOr[ResourceArn] = js.undefined,
        PolicyId: js.UndefOr[PolicyId] = js.undefined,
        PolicyName: js.UndefOr[ResourceName] = js.undefined,
        RemediationEnabled: js.UndefOr[Boolean] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined,
        SecurityServiceType: js.UndefOr[SecurityServiceType] = js.undefined
    ): PolicySummary = {
      val __obj = js.Dynamic.literal()
      PolicyArn.foreach(__v => __obj.updateDynamic("PolicyArn")(__v.asInstanceOf[js.Any]))
      PolicyId.foreach(__v => __obj.updateDynamic("PolicyId")(__v.asInstanceOf[js.Any]))
      PolicyName.foreach(__v => __obj.updateDynamic("PolicyName")(__v.asInstanceOf[js.Any]))
      RemediationEnabled.foreach(__v => __obj.updateDynamic("RemediationEnabled")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      SecurityServiceType.foreach(__v => __obj.updateDynamic("SecurityServiceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicySummary]
    }
  }

  /**
    * An AWS Firewall Manager protocols list.
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

  /**
    * Details of the AWS Firewall Manager protocols list.
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

  @js.native
  sealed trait RemediationActionType extends js.Any
  object RemediationActionType {
    val REMOVE = "REMOVE".asInstanceOf[RemediationActionType]
    val MODIFY = "MODIFY".asInstanceOf[RemediationActionType]

    @inline def values = js.Object.freeze(js.Array(REMOVE, MODIFY))
  }

  /**
    * The resource tags that AWS Firewall Manager uses to determine if a particular resource should be included or excluded from the AWS Firewall Manager policy. Tags enable you to categorize your AWS resources in different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an optional value. Firewall Manager combines the tags with "AND" so that, if you add more than one tag to a policy scope, a resource must have all the specified tags to be included or excluded. For more information, see [[https://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/tag-editor.html|Working with Tag Editor]].
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

  /**
    * Violation detail based on resource type.
    */
  @js.native
  trait ResourceViolation extends js.Object {
    var AwsEc2InstanceViolation: js.UndefOr[AwsEc2InstanceViolation]
    var AwsEc2NetworkInterfaceViolation: js.UndefOr[AwsEc2NetworkInterfaceViolation]
    var AwsVPCSecurityGroupViolation: js.UndefOr[AwsVPCSecurityGroupViolation]
  }

  object ResourceViolation {
    @inline
    def apply(
        AwsEc2InstanceViolation: js.UndefOr[AwsEc2InstanceViolation] = js.undefined,
        AwsEc2NetworkInterfaceViolation: js.UndefOr[AwsEc2NetworkInterfaceViolation] = js.undefined,
        AwsVPCSecurityGroupViolation: js.UndefOr[AwsVPCSecurityGroupViolation] = js.undefined
    ): ResourceViolation = {
      val __obj = js.Dynamic.literal()
      AwsEc2InstanceViolation.foreach(__v => __obj.updateDynamic("AwsEc2InstanceViolation")(__v.asInstanceOf[js.Any]))
      AwsEc2NetworkInterfaceViolation.foreach(__v => __obj.updateDynamic("AwsEc2NetworkInterfaceViolation")(__v.asInstanceOf[js.Any]))
      AwsVPCSecurityGroupViolation.foreach(__v => __obj.updateDynamic("AwsVPCSecurityGroupViolation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceViolation]
    }
  }

  /**
    * Remediation option for the rule specified in the <code>ViolationTarget</code>.
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

  /**
    * Describes a set of permissions for a security group rule.
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

  /**
    * Details about the security service that is being used to protect the resources.
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

  @js.native
  sealed trait SecurityServiceType extends js.Any
  object SecurityServiceType {
    val WAF = "WAF".asInstanceOf[SecurityServiceType]
    val WAFV2 = "WAFV2".asInstanceOf[SecurityServiceType]
    val SHIELD_ADVANCED = "SHIELD_ADVANCED".asInstanceOf[SecurityServiceType]
    val SECURITY_GROUPS_COMMON = "SECURITY_GROUPS_COMMON".asInstanceOf[SecurityServiceType]
    val SECURITY_GROUPS_CONTENT_AUDIT = "SECURITY_GROUPS_CONTENT_AUDIT".asInstanceOf[SecurityServiceType]
    val SECURITY_GROUPS_USAGE_AUDIT = "SECURITY_GROUPS_USAGE_AUDIT".asInstanceOf[SecurityServiceType]

    @inline def values = js.Object.freeze(js.Array(WAF, WAFV2, SHIELD_ADVANCED, SECURITY_GROUPS_COMMON, SECURITY_GROUPS_CONTENT_AUDIT, SECURITY_GROUPS_USAGE_AUDIT))
  }

  /**
    * A collection of key:value pairs associated with an AWS resource. The key:value pair can be anything you define. Typically, the tag key represents a category (such as "environment") and the tag value represents a specific value within that category (such as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
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
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  /**
    * Violations for a resource based on the specified AWS Firewall Manager policy and AWS account.
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

  @js.native
  sealed trait ViolationReason extends js.Any
  object ViolationReason {
    val WEB_ACL_MISSING_RULE_GROUP = "WEB_ACL_MISSING_RULE_GROUP".asInstanceOf[ViolationReason]
    val RESOURCE_MISSING_WEB_ACL = "RESOURCE_MISSING_WEB_ACL".asInstanceOf[ViolationReason]
    val RESOURCE_INCORRECT_WEB_ACL = "RESOURCE_INCORRECT_WEB_ACL".asInstanceOf[ViolationReason]
    val RESOURCE_MISSING_SHIELD_PROTECTION = "RESOURCE_MISSING_SHIELD_PROTECTION".asInstanceOf[ViolationReason]
    val RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION = "RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION".asInstanceOf[ViolationReason]
    val RESOURCE_MISSING_SECURITY_GROUP = "RESOURCE_MISSING_SECURITY_GROUP".asInstanceOf[ViolationReason]
    val RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP = "RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP".asInstanceOf[ViolationReason]
    val SECURITY_GROUP_UNUSED = "SECURITY_GROUP_UNUSED".asInstanceOf[ViolationReason]
    val SECURITY_GROUP_REDUNDANT = "SECURITY_GROUP_REDUNDANT".asInstanceOf[ViolationReason]

    @inline def values =
      js.Object.freeze(js.Array(
        WEB_ACL_MISSING_RULE_GROUP,
        RESOURCE_MISSING_WEB_ACL,
        RESOURCE_INCORRECT_WEB_ACL,
        RESOURCE_MISSING_SHIELD_PROTECTION,
        RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION,
        RESOURCE_MISSING_SECURITY_GROUP,
        RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP,
        SECURITY_GROUP_UNUSED,
        SECURITY_GROUP_REDUNDANT
      ))
  }
}
