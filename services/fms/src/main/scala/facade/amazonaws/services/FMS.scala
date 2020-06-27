package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object fms {
  type AWSAccountId               = String
  type ComplianceViolators        = js.Array[ComplianceViolator]
  type CustomerPolicyScopeId      = String
  type CustomerPolicyScopeIdList  = js.Array[CustomerPolicyScopeId]
  type CustomerPolicyScopeMap     = js.Dictionary[CustomerPolicyScopeIdList]
  type DetailedInfo               = String
  type EvaluationResults          = js.Array[EvaluationResult]
  type IssueInfoMap               = js.Dictionary[DetailedInfo]
  type ManagedServiceData         = String
  type MemberAccounts             = js.Array[AWSAccountId]
  type PaginationMaxResults       = Int
  type PaginationToken            = String
  type PolicyComplianceStatusList = js.Array[PolicyComplianceStatus]
  type PolicyId                   = String
  type PolicySummaryList          = js.Array[PolicySummary]
  type PolicyUpdateToken          = String
  type ProtectionData             = String
  type ResourceArn                = String
  type ResourceCount              = Double
  type ResourceId                 = String
  type ResourceName               = String
  type ResourceTagKey             = String
  type ResourceTagValue           = String
  type ResourceTags               = js.Array[ResourceTag]
  type ResourceType               = String
  type ResourceTypeList           = js.Array[ResourceType]
  type TagKey                     = String
  type TagKeyList                 = js.Array[TagKey]
  type TagList                    = js.Array[Tag]
  type TagValue                   = String
  type TimeStamp                  = js.Date

  implicit final class FMSOps(private val service: FMS) extends AnyVal {

    @inline def associateAdminAccountFuture(params: AssociateAdminAccountRequest): Future[js.Object] =
      service.associateAdminAccount(params).promise().toFuture
    @inline def deleteNotificationChannelFuture(params: DeleteNotificationChannelRequest): Future[js.Object] =
      service.deleteNotificationChannel(params).promise().toFuture
    @inline def deletePolicyFuture(params: DeletePolicyRequest): Future[js.Object] =
      service.deletePolicy(params).promise().toFuture
    @inline def disassociateAdminAccountFuture(params: DisassociateAdminAccountRequest): Future[js.Object] =
      service.disassociateAdminAccount(params).promise().toFuture
    @inline def getAdminAccountFuture(params: GetAdminAccountRequest): Future[GetAdminAccountResponse] =
      service.getAdminAccount(params).promise().toFuture
    @inline def getComplianceDetailFuture(params: GetComplianceDetailRequest): Future[GetComplianceDetailResponse] =
      service.getComplianceDetail(params).promise().toFuture
    @inline def getNotificationChannelFuture(
        params: GetNotificationChannelRequest
    ): Future[GetNotificationChannelResponse] = service.getNotificationChannel(params).promise().toFuture
    @inline def getPolicyFuture(params: GetPolicyRequest): Future[GetPolicyResponse] =
      service.getPolicy(params).promise().toFuture
    @inline def getProtectionStatusFuture(params: GetProtectionStatusRequest): Future[GetProtectionStatusResponse] =
      service.getProtectionStatus(params).promise().toFuture
    @inline def listComplianceStatusFuture(params: ListComplianceStatusRequest): Future[ListComplianceStatusResponse] =
      service.listComplianceStatus(params).promise().toFuture
    @inline def listMemberAccountsFuture(params: ListMemberAccountsRequest): Future[ListMemberAccountsResponse] =
      service.listMemberAccounts(params).promise().toFuture
    @inline def listPoliciesFuture(params: ListPoliciesRequest): Future[ListPoliciesResponse] =
      service.listPolicies(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def putNotificationChannelFuture(params: PutNotificationChannelRequest): Future[js.Object] =
      service.putNotificationChannel(params).promise().toFuture
    @inline def putPolicyFuture(params: PutPolicyRequest): Future[PutPolicyResponse] =
      service.putPolicy(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
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
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]    = js.native
    def putNotificationChannel(params: PutNotificationChannelRequest): Request[js.Object]                = js.native
    def putPolicy(params: PutPolicyRequest): Request[PutPolicyResponse]                                  = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                            = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                      = js.native
  }

  @js.native
  sealed trait AccountRoleStatus extends js.Any
  object AccountRoleStatus extends js.Object {
    val READY            = "READY".asInstanceOf[AccountRoleStatus]
    val CREATING         = "CREATING".asInstanceOf[AccountRoleStatus]
    val PENDING_DELETION = "PENDING_DELETION".asInstanceOf[AccountRoleStatus]
    val DELETING         = "DELETING".asInstanceOf[AccountRoleStatus]
    val DELETED          = "DELETED".asInstanceOf[AccountRoleStatus]

    val values = js.Object.freeze(js.Array(READY, CREATING, PENDING_DELETION, DELETING, DELETED))
  }

  @js.native
  @Factory
  trait AssociateAdminAccountRequest extends js.Object {
    var AdminAccount: AWSAccountId
  }

  /**
    * Details of the resource that is not protected by the policy.
    */
  @js.native
  @Factory
  trait ComplianceViolator extends js.Object {
    var ResourceId: js.UndefOr[ResourceId]
    var ResourceType: js.UndefOr[ResourceType]
    var ViolationReason: js.UndefOr[ViolationReason]
  }

  @js.native
  sealed trait CustomerPolicyScopeIdType extends js.Any
  object CustomerPolicyScopeIdType extends js.Object {
    val ACCOUNT = "ACCOUNT".asInstanceOf[CustomerPolicyScopeIdType]

    val values = js.Object.freeze(js.Array(ACCOUNT))
  }

  @js.native
  @Factory
  trait DeleteNotificationChannelRequest extends js.Object {}

  @js.native
  @Factory
  trait DeletePolicyRequest extends js.Object {
    var PolicyId: PolicyId
    var DeleteAllPolicyResources: js.UndefOr[Boolean]
  }

  @js.native
  sealed trait DependentServiceName extends js.Any
  object DependentServiceName extends js.Object {
    val AWSCONFIG          = "AWSCONFIG".asInstanceOf[DependentServiceName]
    val AWSWAF             = "AWSWAF".asInstanceOf[DependentServiceName]
    val AWSSHIELD_ADVANCED = "AWSSHIELD_ADVANCED".asInstanceOf[DependentServiceName]
    val AWSVPC             = "AWSVPC".asInstanceOf[DependentServiceName]

    val values = js.Object.freeze(js.Array(AWSCONFIG, AWSWAF, AWSSHIELD_ADVANCED, AWSVPC))
  }

  @js.native
  @Factory
  trait DisassociateAdminAccountRequest extends js.Object {}

  /**
    * Describes the compliance status for the account. An account is considered noncompliant if it includes resources that are not protected by the specified policy or that don't comply with the policy.
    */
  @js.native
  @Factory
  trait EvaluationResult extends js.Object {
    var ComplianceStatus: js.UndefOr[PolicyComplianceStatusType]
    var EvaluationLimitExceeded: js.UndefOr[Boolean]
    var ViolatorCount: js.UndefOr[ResourceCount]
  }

  @js.native
  @Factory
  trait GetAdminAccountRequest extends js.Object {}

  @js.native
  @Factory
  trait GetAdminAccountResponse extends js.Object {
    var AdminAccount: js.UndefOr[AWSAccountId]
    var RoleStatus: js.UndefOr[AccountRoleStatus]
  }

  @js.native
  @Factory
  trait GetComplianceDetailRequest extends js.Object {
    var MemberAccount: AWSAccountId
    var PolicyId: PolicyId
  }

  @js.native
  @Factory
  trait GetComplianceDetailResponse extends js.Object {
    var PolicyComplianceDetail: js.UndefOr[PolicyComplianceDetail]
  }

  @js.native
  @Factory
  trait GetNotificationChannelRequest extends js.Object {}

  @js.native
  @Factory
  trait GetNotificationChannelResponse extends js.Object {
    var SnsRoleName: js.UndefOr[ResourceArn]
    var SnsTopicArn: js.UndefOr[ResourceArn]
  }

  @js.native
  @Factory
  trait GetPolicyRequest extends js.Object {
    var PolicyId: PolicyId
  }

  @js.native
  @Factory
  trait GetPolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
    var PolicyArn: js.UndefOr[ResourceArn]
  }

  @js.native
  @Factory
  trait GetProtectionStatusRequest extends js.Object {
    var PolicyId: PolicyId
    var EndTime: js.UndefOr[TimeStamp]
    var MaxResults: js.UndefOr[PaginationMaxResults]
    var MemberAccountId: js.UndefOr[AWSAccountId]
    var NextToken: js.UndefOr[PaginationToken]
    var StartTime: js.UndefOr[TimeStamp]
  }

  @js.native
  @Factory
  trait GetProtectionStatusResponse extends js.Object {
    var AdminAccountId: js.UndefOr[AWSAccountId]
    var Data: js.UndefOr[ProtectionData]
    var NextToken: js.UndefOr[PaginationToken]
    var ServiceType: js.UndefOr[SecurityServiceType]
  }

  @js.native
  @Factory
  trait ListComplianceStatusRequest extends js.Object {
    var PolicyId: PolicyId
    var MaxResults: js.UndefOr[PaginationMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListComplianceStatusResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var PolicyComplianceStatusList: js.UndefOr[PolicyComplianceStatusList]
  }

  @js.native
  @Factory
  trait ListMemberAccountsRequest extends js.Object {
    var MaxResults: js.UndefOr[PaginationMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListMemberAccountsResponse extends js.Object {
    var MemberAccounts: js.UndefOr[MemberAccounts]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListPoliciesRequest extends js.Object {
    var MaxResults: js.UndefOr[PaginationMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListPoliciesResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var PolicyList: js.UndefOr[PolicySummaryList]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  /**
    * An AWS Firewall Manager policy.
    */
  @js.native
  @Factory
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

  /**
    * Describes the noncompliant resources in a member account for a specific AWS Firewall Manager policy. A maximum of 100 entries are displayed. If more than 100 resources are noncompliant, <code>EvaluationLimitExceeded</code> is set to <code>True</code>.
    */
  @js.native
  @Factory
  trait PolicyComplianceDetail extends js.Object {
    var EvaluationLimitExceeded: js.UndefOr[Boolean]
    var ExpiredAt: js.UndefOr[TimeStamp]
    var IssueInfoMap: js.UndefOr[IssueInfoMap]
    var MemberAccount: js.UndefOr[AWSAccountId]
    var PolicyId: js.UndefOr[PolicyId]
    var PolicyOwner: js.UndefOr[AWSAccountId]
    var Violators: js.UndefOr[ComplianceViolators]
  }

  /**
    * Indicates whether the account is compliant with the specified policy. An account is considered noncompliant if it includes resources that are not protected by the policy, for AWS WAF and Shield Advanced policies, or that are noncompliant with the policy, for security group policies.
    */
  @js.native
  @Factory
  trait PolicyComplianceStatus extends js.Object {
    var EvaluationResults: js.UndefOr[EvaluationResults]
    var IssueInfoMap: js.UndefOr[IssueInfoMap]
    var LastUpdated: js.UndefOr[TimeStamp]
    var MemberAccount: js.UndefOr[AWSAccountId]
    var PolicyId: js.UndefOr[PolicyId]
    var PolicyName: js.UndefOr[ResourceName]
    var PolicyOwner: js.UndefOr[AWSAccountId]
  }

  @js.native
  sealed trait PolicyComplianceStatusType extends js.Any
  object PolicyComplianceStatusType extends js.Object {
    val COMPLIANT     = "COMPLIANT".asInstanceOf[PolicyComplianceStatusType]
    val NON_COMPLIANT = "NON_COMPLIANT".asInstanceOf[PolicyComplianceStatusType]

    val values = js.Object.freeze(js.Array(COMPLIANT, NON_COMPLIANT))
  }

  /**
    * Details of the AWS Firewall Manager policy.
    */
  @js.native
  @Factory
  trait PolicySummary extends js.Object {
    var PolicyArn: js.UndefOr[ResourceArn]
    var PolicyId: js.UndefOr[PolicyId]
    var PolicyName: js.UndefOr[ResourceName]
    var RemediationEnabled: js.UndefOr[Boolean]
    var ResourceType: js.UndefOr[ResourceType]
    var SecurityServiceType: js.UndefOr[SecurityServiceType]
  }

  @js.native
  @Factory
  trait PutNotificationChannelRequest extends js.Object {
    var SnsRoleName: ResourceArn
    var SnsTopicArn: ResourceArn
  }

  @js.native
  @Factory
  trait PutPolicyRequest extends js.Object {
    var Policy: Policy
    var TagList: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait PutPolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
    var PolicyArn: js.UndefOr[ResourceArn]
  }

  /**
    * The resource tags that AWS Firewall Manager uses to determine if a particular resource should be included or excluded from the AWS Firewall Manager policy. Tags enable you to categorize your AWS resources in different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an optional value. Firewall Manager combines the tags with "AND" so that, if you add more than one tag to a policy scope, a resource must have all the specified tags to be included or excluded. For more information, see [[https://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/tag-editor.html|Working with Tag Editor]].
    */
  @js.native
  @Factory
  trait ResourceTag extends js.Object {
    var Key: ResourceTagKey
    var Value: js.UndefOr[ResourceTagValue]
  }

  /**
    * Details about the security service that is being used to protect the resources.
    */
  @js.native
  @Factory
  trait SecurityServicePolicyData extends js.Object {
    var Type: SecurityServiceType
    var ManagedServiceData: js.UndefOr[ManagedServiceData]
  }

  @js.native
  sealed trait SecurityServiceType extends js.Any
  object SecurityServiceType extends js.Object {
    val WAF                           = "WAF".asInstanceOf[SecurityServiceType]
    val SHIELD_ADVANCED               = "SHIELD_ADVANCED".asInstanceOf[SecurityServiceType]
    val SECURITY_GROUPS_COMMON        = "SECURITY_GROUPS_COMMON".asInstanceOf[SecurityServiceType]
    val SECURITY_GROUPS_CONTENT_AUDIT = "SECURITY_GROUPS_CONTENT_AUDIT".asInstanceOf[SecurityServiceType]
    val SECURITY_GROUPS_USAGE_AUDIT   = "SECURITY_GROUPS_USAGE_AUDIT".asInstanceOf[SecurityServiceType]

    val values = js.Object.freeze(
      js.Array(WAF, SHIELD_ADVANCED, SECURITY_GROUPS_COMMON, SECURITY_GROUPS_CONTENT_AUDIT, SECURITY_GROUPS_USAGE_AUDIT)
    )
  }

  /**
    * A collection of key:value pairs associated with an AWS resource. The key:value pair can be anything you define. Typically, the tag key represents a category (such as "environment") and the tag value represents a specific value within that category (such as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var TagList: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  sealed trait ViolationReason extends js.Any
  object ViolationReason extends js.Object {
    val WEB_ACL_MISSING_RULE_GROUP         = "WEB_ACL_MISSING_RULE_GROUP".asInstanceOf[ViolationReason]
    val RESOURCE_MISSING_WEB_ACL           = "RESOURCE_MISSING_WEB_ACL".asInstanceOf[ViolationReason]
    val RESOURCE_INCORRECT_WEB_ACL         = "RESOURCE_INCORRECT_WEB_ACL".asInstanceOf[ViolationReason]
    val RESOURCE_MISSING_SHIELD_PROTECTION = "RESOURCE_MISSING_SHIELD_PROTECTION".asInstanceOf[ViolationReason]
    val RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION =
      "RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION".asInstanceOf[ViolationReason]
    val RESOURCE_MISSING_SECURITY_GROUP        = "RESOURCE_MISSING_SECURITY_GROUP".asInstanceOf[ViolationReason]
    val RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP = "RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP".asInstanceOf[ViolationReason]
    val SECURITY_GROUP_UNUSED                  = "SECURITY_GROUP_UNUSED".asInstanceOf[ViolationReason]
    val SECURITY_GROUP_REDUNDANT               = "SECURITY_GROUP_REDUNDANT".asInstanceOf[ViolationReason]

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
