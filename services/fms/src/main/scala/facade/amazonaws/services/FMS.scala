package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object fms {
  type AWSAccountId               = String
  type AccountRoleStatus          = String
  type ComplianceViolators        = js.Array[ComplianceViolator]
  type CustomerPolicyScopeId      = String
  type CustomerPolicyScopeIdList  = js.Array[CustomerPolicyScopeId]
  type CustomerPolicyScopeIdType  = String
  type CustomerPolicyScopeMap     = js.Dictionary[CustomerPolicyScopeIdList]
  type DependentServiceName       = String
  type DetailedInfo               = String
  type EvaluationResults          = js.Array[EvaluationResult]
  type IssueInfoMap               = js.Dictionary[DetailedInfo]
  type ManagedServiceData         = String
  type MemberAccounts             = js.Array[AWSAccountId]
  type PaginationMaxResults       = Int
  type PaginationToken            = String
  type PolicyComplianceStatusList = js.Array[PolicyComplianceStatus]
  type PolicyComplianceStatusType = String
  type PolicyId                   = String
  type PolicySummaryList          = js.Array[PolicySummary]
  type PolicyUpdateToken          = String
  type ProtectionData             = String
  type ResourceArn                = String
  type ResourceCount              = Double
  type ResourceId                 = String
  type ResourceName               = String
  type ResourceTags               = js.Array[ResourceTag]
  type ResourceType               = String
  type ResourceTypeList           = js.Array[ResourceType]
  type SecurityServiceType        = String
  type TagKey                     = String
  type TagValue                   = String
  type TimeStamp                  = js.Date
  type ViolationReason            = String

  implicit final class FMSOps(private val service: FMS) extends AnyVal {

    @inline def associateAdminAccountFuture(params: AssociateAdminAccountRequest): Future[js.Object] =
      service.associateAdminAccount(params).promise.toFuture
    @inline def deleteNotificationChannelFuture(params: DeleteNotificationChannelRequest): Future[js.Object] =
      service.deleteNotificationChannel(params).promise.toFuture
    @inline def deletePolicyFuture(params: DeletePolicyRequest): Future[js.Object] =
      service.deletePolicy(params).promise.toFuture
    @inline def disassociateAdminAccountFuture(params: DisassociateAdminAccountRequest): Future[js.Object] =
      service.disassociateAdminAccount(params).promise.toFuture
    @inline def getAdminAccountFuture(params: GetAdminAccountRequest): Future[GetAdminAccountResponse] =
      service.getAdminAccount(params).promise.toFuture
    @inline def getComplianceDetailFuture(params: GetComplianceDetailRequest): Future[GetComplianceDetailResponse] =
      service.getComplianceDetail(params).promise.toFuture
    @inline def getNotificationChannelFuture(
        params: GetNotificationChannelRequest
    ): Future[GetNotificationChannelResponse] = service.getNotificationChannel(params).promise.toFuture
    @inline def getPolicyFuture(params: GetPolicyRequest): Future[GetPolicyResponse] =
      service.getPolicy(params).promise.toFuture
    @inline def getProtectionStatusFuture(params: GetProtectionStatusRequest): Future[GetProtectionStatusResponse] =
      service.getProtectionStatus(params).promise.toFuture
    @inline def listComplianceStatusFuture(params: ListComplianceStatusRequest): Future[ListComplianceStatusResponse] =
      service.listComplianceStatus(params).promise.toFuture
    @inline def listMemberAccountsFuture(params: ListMemberAccountsRequest): Future[ListMemberAccountsResponse] =
      service.listMemberAccounts(params).promise.toFuture
    @inline def listPoliciesFuture(params: ListPoliciesRequest): Future[ListPoliciesResponse] =
      service.listPolicies(params).promise.toFuture
    @inline def putNotificationChannelFuture(params: PutNotificationChannelRequest): Future[js.Object] =
      service.putNotificationChannel(params).promise.toFuture
    @inline def putPolicyFuture(params: PutPolicyRequest): Future[PutPolicyResponse] =
      service.putPolicy(params).promise.toFuture
  }
}

package fms {
  @js.native
  @JSImport("aws-sdk", "FMS")
  class FMS() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateAdminAccount(params: AssociateAdminAccountRequest): Request[js.Object]               = js.native
    def deleteNotificationChannel(params: DeleteNotificationChannelRequest): Request[js.Object]       = js.native
    def deletePolicy(params: DeletePolicyRequest): Request[js.Object]                                 = js.native
    def disassociateAdminAccount(params: DisassociateAdminAccountRequest): Request[js.Object]         = js.native
    def getAdminAccount(params: GetAdminAccountRequest): Request[GetAdminAccountResponse]             = js.native
    def getComplianceDetail(params: GetComplianceDetailRequest): Request[GetComplianceDetailResponse] = js.native
    def getNotificationChannel(params: GetNotificationChannelRequest): Request[GetNotificationChannelResponse] =
      js.native
    def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse]                                  = js.native
    def getProtectionStatus(params: GetProtectionStatusRequest): Request[GetProtectionStatusResponse]    = js.native
    def listComplianceStatus(params: ListComplianceStatusRequest): Request[ListComplianceStatusResponse] = js.native
    def listMemberAccounts(params: ListMemberAccountsRequest): Request[ListMemberAccountsResponse]       = js.native
    def listPolicies(params: ListPoliciesRequest): Request[ListPoliciesResponse]                         = js.native
    def putNotificationChannel(params: PutNotificationChannelRequest): Request[js.Object]                = js.native
    def putPolicy(params: PutPolicyRequest): Request[PutPolicyResponse]                                  = js.native
  }

  object AccountRoleStatusEnum {
    val READY            = "READY"
    val CREATING         = "CREATING"
    val PENDING_DELETION = "PENDING_DELETION"
    val DELETING         = "DELETING"
    val DELETED          = "DELETED"

    val values = js.Object.freeze(js.Array(READY, CREATING, PENDING_DELETION, DELETING, DELETED))
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

  object CustomerPolicyScopeIdTypeEnum {
    val ACCOUNT = "ACCOUNT"

    val values = js.Object.freeze(js.Array(ACCOUNT))
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

  object DependentServiceNameEnum {
    val AWSCONFIG          = "AWSCONFIG"
    val AWSWAF             = "AWSWAF"
    val AWSSHIELD_ADVANCED = "AWSSHIELD_ADVANCED"
    val AWSVPC             = "AWSVPC"

    val values = js.Object.freeze(js.Array(AWSCONFIG, AWSWAF, AWSSHIELD_ADVANCED, AWSVPC))
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
        "PolicyId"      -> PolicyId.asInstanceOf[js.Any]
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
      PolicyComplianceStatusList.foreach(__v =>
        __obj.updateDynamic("PolicyComplianceStatusList")(__v.asInstanceOf[js.Any])
      )
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
        "ExcludeResourceTags"       -> ExcludeResourceTags.asInstanceOf[js.Any],
        "PolicyName"                -> PolicyName.asInstanceOf[js.Any],
        "RemediationEnabled"        -> RemediationEnabled.asInstanceOf[js.Any],
        "ResourceType"              -> ResourceType.asInstanceOf[js.Any],
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

  object PolicyComplianceStatusTypeEnum {
    val COMPLIANT     = "COMPLIANT"
    val NON_COMPLIANT = "NON_COMPLIANT"

    val values = js.Object.freeze(js.Array(COMPLIANT, NON_COMPLIANT))
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
  }

  object PutPolicyRequest {
    @inline
    def apply(
        Policy: Policy
    ): PutPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Policy" -> Policy.asInstanceOf[js.Any]
      )

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

  /**
    * The resource tags that AWS Firewall Manager uses to determine if a particular resource should be included or excluded from the AWS Firewall Manager policy. Tags enable you to categorize your AWS resources in different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an optional value. Firewall Manager combines the tags with "AND" so that, if you add more than one tag to a policy scope, a resource must have all the specified tags to be included or excluded. For more information, see [[https://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/tag-editor.html|Working with Tag Editor]].
    */
  @js.native
  trait ResourceTag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  object ResourceTag {
    @inline
    def apply(
        Key: TagKey,
        Value: js.UndefOr[TagValue] = js.undefined
    ): ResourceTag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceTag]
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

  object SecurityServiceTypeEnum {
    val WAF                           = "WAF"
    val SHIELD_ADVANCED               = "SHIELD_ADVANCED"
    val SECURITY_GROUPS_COMMON        = "SECURITY_GROUPS_COMMON"
    val SECURITY_GROUPS_CONTENT_AUDIT = "SECURITY_GROUPS_CONTENT_AUDIT"
    val SECURITY_GROUPS_USAGE_AUDIT   = "SECURITY_GROUPS_USAGE_AUDIT"

    val values = js.Object.freeze(
      js.Array(WAF, SHIELD_ADVANCED, SECURITY_GROUPS_COMMON, SECURITY_GROUPS_CONTENT_AUDIT, SECURITY_GROUPS_USAGE_AUDIT)
    )
  }

  object ViolationReasonEnum {
    val WEB_ACL_MISSING_RULE_GROUP                    = "WEB_ACL_MISSING_RULE_GROUP"
    val RESOURCE_MISSING_WEB_ACL                      = "RESOURCE_MISSING_WEB_ACL"
    val RESOURCE_INCORRECT_WEB_ACL                    = "RESOURCE_INCORRECT_WEB_ACL"
    val RESOURCE_MISSING_SHIELD_PROTECTION            = "RESOURCE_MISSING_SHIELD_PROTECTION"
    val RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION = "RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION"
    val RESOURCE_MISSING_SECURITY_GROUP               = "RESOURCE_MISSING_SECURITY_GROUP"
    val RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP        = "RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP"
    val SECURITY_GROUP_UNUSED                         = "SECURITY_GROUP_UNUSED"
    val SECURITY_GROUP_REDUNDANT                      = "SECURITY_GROUP_REDUNDANT"

    val values = js.Object.freeze(
      js.Array(
        WEB_ACL_MISSING_RULE_GROUP,
        RESOURCE_MISSING_WEB_ACL,
        RESOURCE_INCORRECT_WEB_ACL,
        RESOURCE_MISSING_SHIELD_PROTECTION,
        RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION,
        RESOURCE_MISSING_SECURITY_GROUP,
        RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP,
        SECURITY_GROUP_UNUSED,
        SECURITY_GROUP_REDUNDANT
      )
    )
  }
}
