package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
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

    val values = IndexedSeq(READY, CREATING, PENDING_DELETION, DELETING, DELETED)
  }

  @js.native
  trait AssociateAdminAccountRequest extends js.Object {
    var AdminAccount: AWSAccountId
  }

  object AssociateAdminAccountRequest {
    def apply(
        AdminAccount: AWSAccountId
    ): AssociateAdminAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdminAccount" -> AdminAccount.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateAdminAccountRequest]
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
    def apply(
        ResourceId: js.UndefOr[ResourceId] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined,
        ViolationReason: js.UndefOr[ViolationReason] = js.undefined
    ): ComplianceViolator = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceType" -> ResourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ViolationReason" -> ViolationReason.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComplianceViolator]
    }
  }

  object CustomerPolicyScopeIdTypeEnum {
    val ACCOUNT = "ACCOUNT"

    val values = IndexedSeq(ACCOUNT)
  }

  @js.native
  trait DeleteNotificationChannelRequest extends js.Object {}

  object DeleteNotificationChannelRequest {
    def apply(
        ): DeleteNotificationChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNotificationChannelRequest]
    }
  }

  @js.native
  trait DeletePolicyRequest extends js.Object {
    var PolicyId: PolicyId
    var DeleteAllPolicyResources: js.UndefOr[Boolean]
  }

  object DeletePolicyRequest {
    def apply(
        PolicyId: PolicyId,
        DeleteAllPolicyResources: js.UndefOr[Boolean] = js.undefined
    ): DeletePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.asInstanceOf[js.Any],
        "DeleteAllPolicyResources" -> DeleteAllPolicyResources.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePolicyRequest]
    }
  }

  object DependentServiceNameEnum {
    val AWSCONFIG          = "AWSCONFIG"
    val AWSWAF             = "AWSWAF"
    val AWSSHIELD_ADVANCED = "AWSSHIELD_ADVANCED"

    val values = IndexedSeq(AWSCONFIG, AWSWAF, AWSSHIELD_ADVANCED)
  }

  @js.native
  trait DisassociateAdminAccountRequest extends js.Object {}

  object DisassociateAdminAccountRequest {
    def apply(
        ): DisassociateAdminAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateAdminAccountRequest]
    }
  }

  /**
    * Describes the compliance status for the account. An account is considered non-compliant if it includes resources that are not protected by the specified policy.
    */
  @js.native
  trait EvaluationResult extends js.Object {
    var ComplianceStatus: js.UndefOr[PolicyComplianceStatusType]
    var EvaluationLimitExceeded: js.UndefOr[Boolean]
    var ViolatorCount: js.UndefOr[ResourceCount]
  }

  object EvaluationResult {
    def apply(
        ComplianceStatus: js.UndefOr[PolicyComplianceStatusType] = js.undefined,
        EvaluationLimitExceeded: js.UndefOr[Boolean] = js.undefined,
        ViolatorCount: js.UndefOr[ResourceCount] = js.undefined
    ): EvaluationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComplianceStatus" -> ComplianceStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EvaluationLimitExceeded" -> EvaluationLimitExceeded.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ViolatorCount" -> ViolatorCount.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EvaluationResult]
    }
  }

  @js.native
  trait GetAdminAccountRequest extends js.Object {}

  object GetAdminAccountRequest {
    def apply(
        ): GetAdminAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAdminAccountRequest]
    }
  }

  @js.native
  trait GetAdminAccountResponse extends js.Object {
    var AdminAccount: js.UndefOr[AWSAccountId]
    var RoleStatus: js.UndefOr[AccountRoleStatus]
  }

  object GetAdminAccountResponse {
    def apply(
        AdminAccount: js.UndefOr[AWSAccountId] = js.undefined,
        RoleStatus: js.UndefOr[AccountRoleStatus] = js.undefined
    ): GetAdminAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdminAccount" -> AdminAccount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleStatus" -> RoleStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAdminAccountResponse]
    }
  }

  @js.native
  trait GetComplianceDetailRequest extends js.Object {
    var MemberAccount: AWSAccountId
    var PolicyId: PolicyId
  }

  object GetComplianceDetailRequest {
    def apply(
        MemberAccount: AWSAccountId,
        PolicyId: PolicyId
    ): GetComplianceDetailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MemberAccount" -> MemberAccount.asInstanceOf[js.Any],
        "PolicyId"      -> PolicyId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetComplianceDetailRequest]
    }
  }

  @js.native
  trait GetComplianceDetailResponse extends js.Object {
    var PolicyComplianceDetail: js.UndefOr[PolicyComplianceDetail]
  }

  object GetComplianceDetailResponse {
    def apply(
        PolicyComplianceDetail: js.UndefOr[PolicyComplianceDetail] = js.undefined
    ): GetComplianceDetailResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyComplianceDetail" -> PolicyComplianceDetail.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetComplianceDetailResponse]
    }
  }

  @js.native
  trait GetNotificationChannelRequest extends js.Object {}

  object GetNotificationChannelRequest {
    def apply(
        ): GetNotificationChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetNotificationChannelRequest]
    }
  }

  @js.native
  trait GetNotificationChannelResponse extends js.Object {
    var SnsRoleName: js.UndefOr[ResourceArn]
    var SnsTopicArn: js.UndefOr[ResourceArn]
  }

  object GetNotificationChannelResponse {
    def apply(
        SnsRoleName: js.UndefOr[ResourceArn] = js.undefined,
        SnsTopicArn: js.UndefOr[ResourceArn] = js.undefined
    ): GetNotificationChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnsRoleName" -> SnsRoleName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnsTopicArn" -> SnsTopicArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetNotificationChannelResponse]
    }
  }

  @js.native
  trait GetPolicyRequest extends js.Object {
    var PolicyId: PolicyId
  }

  object GetPolicyRequest {
    def apply(
        PolicyId: PolicyId
    ): GetPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyRequest]
    }
  }

  @js.native
  trait GetPolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
    var PolicyArn: js.UndefOr[ResourceArn]
  }

  object GetPolicyResponse {
    def apply(
        Policy: js.UndefOr[Policy] = js.undefined,
        PolicyArn: js.UndefOr[ResourceArn] = js.undefined
    ): GetPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyArn" -> PolicyArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyResponse]
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
    def apply(
        PolicyId: PolicyId,
        EndTime: js.UndefOr[TimeStamp] = js.undefined,
        MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined,
        MemberAccountId: js.UndefOr[AWSAccountId] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        StartTime: js.UndefOr[TimeStamp] = js.undefined
    ): GetProtectionStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.asInstanceOf[js.Any],
        "EndTime" -> EndTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MemberAccountId" -> MemberAccountId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartTime" -> StartTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetProtectionStatusRequest]
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
    def apply(
        AdminAccountId: js.UndefOr[AWSAccountId] = js.undefined,
        Data: js.UndefOr[ProtectionData] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        ServiceType: js.UndefOr[SecurityServiceType] = js.undefined
    ): GetProtectionStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdminAccountId" -> AdminAccountId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Data" -> Data.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServiceType" -> ServiceType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetProtectionStatusResponse]
    }
  }

  @js.native
  trait ListComplianceStatusRequest extends js.Object {
    var PolicyId: PolicyId
    var MaxResults: js.UndefOr[PaginationMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListComplianceStatusRequest {
    def apply(
        PolicyId: PolicyId,
        MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListComplianceStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListComplianceStatusRequest]
    }
  }

  @js.native
  trait ListComplianceStatusResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var PolicyComplianceStatusList: js.UndefOr[PolicyComplianceStatusList]
  }

  object ListComplianceStatusResponse {
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        PolicyComplianceStatusList: js.UndefOr[PolicyComplianceStatusList] = js.undefined
    ): ListComplianceStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyComplianceStatusList" -> PolicyComplianceStatusList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListComplianceStatusResponse]
    }
  }

  @js.native
  trait ListMemberAccountsRequest extends js.Object {
    var MaxResults: js.UndefOr[PaginationMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListMemberAccountsRequest {
    def apply(
        MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListMemberAccountsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMemberAccountsRequest]
    }
  }

  @js.native
  trait ListMemberAccountsResponse extends js.Object {
    var MemberAccounts: js.UndefOr[MemberAccounts]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListMemberAccountsResponse {
    def apply(
        MemberAccounts: js.UndefOr[MemberAccounts] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListMemberAccountsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MemberAccounts" -> MemberAccounts.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMemberAccountsResponse]
    }
  }

  @js.native
  trait ListPoliciesRequest extends js.Object {
    var MaxResults: js.UndefOr[PaginationMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListPoliciesRequest {
    def apply(
        MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPoliciesRequest]
    }
  }

  @js.native
  trait ListPoliciesResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var PolicyList: js.UndefOr[PolicySummaryList]
  }

  object ListPoliciesResponse {
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        PolicyList: js.UndefOr[PolicySummaryList] = js.undefined
    ): ListPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyList" -> PolicyList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPoliciesResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ExcludeResourceTags"       -> ExcludeResourceTags.asInstanceOf[js.Any],
        "PolicyName"                -> PolicyName.asInstanceOf[js.Any],
        "RemediationEnabled"        -> RemediationEnabled.asInstanceOf[js.Any],
        "ResourceType"              -> ResourceType.asInstanceOf[js.Any],
        "SecurityServicePolicyData" -> SecurityServicePolicyData.asInstanceOf[js.Any],
        "ExcludeMap" -> ExcludeMap.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeMap" -> IncludeMap.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyId" -> PolicyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyUpdateToken" -> PolicyUpdateToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceTags" -> ResourceTags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceTypeList" -> ResourceTypeList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Policy]
    }
  }

  /**
    * Describes the non-compliant resources in a member account for a specific AWS Firewall Manager policy. A maximum of 100 entries are displayed. If more than 100 resources are non-compliant, <code>EvaluationLimitExceeded</code> is set to <code>True</code>.
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
    def apply(
        EvaluationLimitExceeded: js.UndefOr[Boolean] = js.undefined,
        ExpiredAt: js.UndefOr[TimeStamp] = js.undefined,
        IssueInfoMap: js.UndefOr[IssueInfoMap] = js.undefined,
        MemberAccount: js.UndefOr[AWSAccountId] = js.undefined,
        PolicyId: js.UndefOr[PolicyId] = js.undefined,
        PolicyOwner: js.UndefOr[AWSAccountId] = js.undefined,
        Violators: js.UndefOr[ComplianceViolators] = js.undefined
    ): PolicyComplianceDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EvaluationLimitExceeded" -> EvaluationLimitExceeded.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpiredAt" -> ExpiredAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IssueInfoMap" -> IssueInfoMap.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MemberAccount" -> MemberAccount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyId" -> PolicyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyOwner" -> PolicyOwner.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Violators" -> Violators.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyComplianceDetail]
    }
  }

  /**
    * Indicates whether the account is compliant with the specified policy. An account is considered non-compliant if it includes resources that are not protected by the policy.
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
    def apply(
        EvaluationResults: js.UndefOr[EvaluationResults] = js.undefined,
        IssueInfoMap: js.UndefOr[IssueInfoMap] = js.undefined,
        LastUpdated: js.UndefOr[TimeStamp] = js.undefined,
        MemberAccount: js.UndefOr[AWSAccountId] = js.undefined,
        PolicyId: js.UndefOr[PolicyId] = js.undefined,
        PolicyName: js.UndefOr[ResourceName] = js.undefined,
        PolicyOwner: js.UndefOr[AWSAccountId] = js.undefined
    ): PolicyComplianceStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EvaluationResults" -> EvaluationResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IssueInfoMap" -> IssueInfoMap.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdated" -> LastUpdated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MemberAccount" -> MemberAccount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyId" -> PolicyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyName" -> PolicyName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyOwner" -> PolicyOwner.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyComplianceStatus]
    }
  }

  object PolicyComplianceStatusTypeEnum {
    val COMPLIANT     = "COMPLIANT"
    val NON_COMPLIANT = "NON_COMPLIANT"

    val values = IndexedSeq(COMPLIANT, NON_COMPLIANT)
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
    def apply(
        PolicyArn: js.UndefOr[ResourceArn] = js.undefined,
        PolicyId: js.UndefOr[PolicyId] = js.undefined,
        PolicyName: js.UndefOr[ResourceName] = js.undefined,
        RemediationEnabled: js.UndefOr[Boolean] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined,
        SecurityServiceType: js.UndefOr[SecurityServiceType] = js.undefined
    ): PolicySummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyArn" -> PolicyArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyId" -> PolicyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyName" -> PolicyName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RemediationEnabled" -> RemediationEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceType" -> ResourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityServiceType" -> SecurityServiceType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicySummary]
    }
  }

  @js.native
  trait PutNotificationChannelRequest extends js.Object {
    var SnsRoleName: ResourceArn
    var SnsTopicArn: ResourceArn
  }

  object PutNotificationChannelRequest {
    def apply(
        SnsRoleName: ResourceArn,
        SnsTopicArn: ResourceArn
    ): PutNotificationChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnsRoleName" -> SnsRoleName.asInstanceOf[js.Any],
        "SnsTopicArn" -> SnsTopicArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutNotificationChannelRequest]
    }
  }

  @js.native
  trait PutPolicyRequest extends js.Object {
    var Policy: Policy
  }

  object PutPolicyRequest {
    def apply(
        Policy: Policy
    ): PutPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutPolicyRequest]
    }
  }

  @js.native
  trait PutPolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
    var PolicyArn: js.UndefOr[ResourceArn]
  }

  object PutPolicyResponse {
    def apply(
        Policy: js.UndefOr[Policy] = js.undefined,
        PolicyArn: js.UndefOr[ResourceArn] = js.undefined
    ): PutPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyArn" -> PolicyArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutPolicyResponse]
    }
  }

  /**
    * The resource tags that AWS Firewall Manager uses to determine if a particular resource should be included or excluded from protection by the AWS Firewall Manager policy. Tags enable you to categorize your AWS resources in different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an optional value, both of which you define. Tags are combined with an "OR." That is, if you add more than one tag, if any of the tags matches, the resource is considered a match for the include or exclude. [[https://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/tag-editor.html|Working with Tag Editor]].
    */
  @js.native
  trait ResourceTag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  object ResourceTag {
    def apply(
        Key: TagKey,
        Value: js.UndefOr[TagValue] = js.undefined
    ): ResourceTag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceTag]
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
    def apply(
        Type: SecurityServiceType,
        ManagedServiceData: js.UndefOr[ManagedServiceData] = js.undefined
    ): SecurityServicePolicyData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.asInstanceOf[js.Any],
        "ManagedServiceData" -> ManagedServiceData.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecurityServicePolicyData]
    }
  }

  object SecurityServiceTypeEnum {
    val WAF             = "WAF"
    val SHIELD_ADVANCED = "SHIELD_ADVANCED"

    val values = IndexedSeq(WAF, SHIELD_ADVANCED)
  }

  object ViolationReasonEnum {
    val WEB_ACL_MISSING_RULE_GROUP         = "WEB_ACL_MISSING_RULE_GROUP"
    val RESOURCE_MISSING_WEB_ACL           = "RESOURCE_MISSING_WEB_ACL"
    val RESOURCE_INCORRECT_WEB_ACL         = "RESOURCE_INCORRECT_WEB_ACL"
    val RESOURCE_MISSING_SHIELD_PROTECTION = "RESOURCE_MISSING_SHIELD_PROTECTION"

    val values = IndexedSeq(
      WEB_ACL_MISSING_RULE_GROUP,
      RESOURCE_MISSING_WEB_ACL,
      RESOURCE_INCORRECT_WEB_ACL,
      RESOURCE_MISSING_SHIELD_PROTECTION
    )
  }
}
