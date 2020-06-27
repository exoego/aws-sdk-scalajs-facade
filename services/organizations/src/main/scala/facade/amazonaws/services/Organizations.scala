package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object organizations {
  type AccountArn               = String
  type AccountId                = String
  type AccountName              = String
  type Accounts                 = js.Array[Account]
  type AwsManagedPolicy         = Boolean
  type ChildId                  = String
  type Children                 = js.Array[Child]
  type CreateAccountRequestId   = String
  type CreateAccountStates      = js.Array[CreateAccountState]
  type CreateAccountStatuses    = js.Array[CreateAccountStatus]
  type Email                    = String
  type EnabledServicePrincipals = js.Array[EnabledServicePrincipal]
  type GenericArn               = String
  type HandshakeArn             = String
  type HandshakeId              = String
  type HandshakeNotes           = String
  type HandshakeParties         = js.Array[HandshakeParty]
  type HandshakePartyId         = String
  type HandshakeResourceValue   = String
  type HandshakeResources       = js.Array[HandshakeResource]
  type Handshakes               = js.Array[Handshake]
  type MaxResults               = Int
  type NextToken                = String
  type OrganizationArn          = String
  type OrganizationId           = String
  type OrganizationalUnitArn    = String
  type OrganizationalUnitId     = String
  type OrganizationalUnitName   = String
  type OrganizationalUnits      = js.Array[OrganizationalUnit]
  type ParentId                 = String
  type Parents                  = js.Array[Parent]
  type Policies                 = js.Array[PolicySummary]
  type PolicyArn                = String
  type PolicyContent            = String
  type PolicyDescription        = String
  type PolicyId                 = String
  type PolicyName               = String
  type PolicyTargetId           = String
  type PolicyTargets            = js.Array[PolicyTargetSummary]
  type PolicyTypes              = js.Array[PolicyTypeSummary]
  type RoleName                 = String
  type RootArn                  = String
  type RootId                   = String
  type RootName                 = String
  type Roots                    = js.Array[Root]
  type ServicePrincipal         = String
  type TagKey                   = String
  type TagKeys                  = js.Array[TagKey]
  type TagValue                 = String
  type TaggableResourceId       = String
  type Tags                     = js.Array[Tag]
  type TargetName               = String
  type Timestamp                = js.Date

  implicit final class OrganizationsOps(private val service: Organizations) extends AnyVal {

    @inline def acceptHandshakeFuture(params: AcceptHandshakeRequest): Future[AcceptHandshakeResponse] =
      service.acceptHandshake(params).promise().toFuture
    @inline def attachPolicyFuture(params: AttachPolicyRequest): Future[js.Object] =
      service.attachPolicy(params).promise().toFuture
    @inline def cancelHandshakeFuture(params: CancelHandshakeRequest): Future[CancelHandshakeResponse] =
      service.cancelHandshake(params).promise().toFuture
    @inline def createAccountFuture(params: CreateAccountRequest): Future[CreateAccountResponse] =
      service.createAccount(params).promise().toFuture
    @inline def createGovCloudAccountFuture(
        params: CreateGovCloudAccountRequest
    ): Future[CreateGovCloudAccountResponse] = service.createGovCloudAccount(params).promise().toFuture
    @inline def createOrganizationFuture(params: CreateOrganizationRequest): Future[CreateOrganizationResponse] =
      service.createOrganization(params).promise().toFuture
    @inline def createOrganizationalUnitFuture(
        params: CreateOrganizationalUnitRequest
    ): Future[CreateOrganizationalUnitResponse] = service.createOrganizationalUnit(params).promise().toFuture
    @inline def createPolicyFuture(params: CreatePolicyRequest): Future[CreatePolicyResponse] =
      service.createPolicy(params).promise().toFuture
    @inline def declineHandshakeFuture(params: DeclineHandshakeRequest): Future[DeclineHandshakeResponse] =
      service.declineHandshake(params).promise().toFuture
    @inline def deleteOrganizationFuture(): Future[js.Object] = service.deleteOrganization().promise().toFuture
    @inline def deleteOrganizationalUnitFuture(params: DeleteOrganizationalUnitRequest): Future[js.Object] =
      service.deleteOrganizationalUnit(params).promise().toFuture
    @inline def deletePolicyFuture(params: DeletePolicyRequest): Future[js.Object] =
      service.deletePolicy(params).promise().toFuture
    @inline def describeAccountFuture(params: DescribeAccountRequest): Future[DescribeAccountResponse] =
      service.describeAccount(params).promise().toFuture
    @inline def describeCreateAccountStatusFuture(
        params: DescribeCreateAccountStatusRequest
    ): Future[DescribeCreateAccountStatusResponse] = service.describeCreateAccountStatus(params).promise().toFuture
    @inline def describeEffectivePolicyFuture(
        params: DescribeEffectivePolicyRequest
    ): Future[DescribeEffectivePolicyResponse] = service.describeEffectivePolicy(params).promise().toFuture
    @inline def describeHandshakeFuture(params: DescribeHandshakeRequest): Future[DescribeHandshakeResponse] =
      service.describeHandshake(params).promise().toFuture
    @inline def describeOrganizationFuture(): Future[DescribeOrganizationResponse] =
      service.describeOrganization().promise().toFuture
    @inline def describeOrganizationalUnitFuture(
        params: DescribeOrganizationalUnitRequest
    ): Future[DescribeOrganizationalUnitResponse] = service.describeOrganizationalUnit(params).promise().toFuture
    @inline def describePolicyFuture(params: DescribePolicyRequest): Future[DescribePolicyResponse] =
      service.describePolicy(params).promise().toFuture
    @inline def detachPolicyFuture(params: DetachPolicyRequest): Future[js.Object] =
      service.detachPolicy(params).promise().toFuture
    @inline def disableAWSServiceAccessFuture(params: DisableAWSServiceAccessRequest): Future[js.Object] =
      service.disableAWSServiceAccess(params).promise().toFuture
    @inline def disablePolicyTypeFuture(params: DisablePolicyTypeRequest): Future[DisablePolicyTypeResponse] =
      service.disablePolicyType(params).promise().toFuture
    @inline def enableAWSServiceAccessFuture(params: EnableAWSServiceAccessRequest): Future[js.Object] =
      service.enableAWSServiceAccess(params).promise().toFuture
    @inline def enableAllFeaturesFuture(params: EnableAllFeaturesRequest): Future[EnableAllFeaturesResponse] =
      service.enableAllFeatures(params).promise().toFuture
    @inline def enablePolicyTypeFuture(params: EnablePolicyTypeRequest): Future[EnablePolicyTypeResponse] =
      service.enablePolicyType(params).promise().toFuture
    @inline def inviteAccountToOrganizationFuture(
        params: InviteAccountToOrganizationRequest
    ): Future[InviteAccountToOrganizationResponse]           = service.inviteAccountToOrganization(params).promise().toFuture
    @inline def leaveOrganizationFuture(): Future[js.Object] = service.leaveOrganization().promise().toFuture
    @inline def listAWSServiceAccessForOrganizationFuture(
        params: ListAWSServiceAccessForOrganizationRequest
    ): Future[ListAWSServiceAccessForOrganizationResponse] =
      service.listAWSServiceAccessForOrganization(params).promise().toFuture
    @inline def listAccountsForParentFuture(
        params: ListAccountsForParentRequest
    ): Future[ListAccountsForParentResponse] = service.listAccountsForParent(params).promise().toFuture
    @inline def listAccountsFuture(params: ListAccountsRequest): Future[ListAccountsResponse] =
      service.listAccounts(params).promise().toFuture
    @inline def listChildrenFuture(params: ListChildrenRequest): Future[ListChildrenResponse] =
      service.listChildren(params).promise().toFuture
    @inline def listCreateAccountStatusFuture(
        params: ListCreateAccountStatusRequest
    ): Future[ListCreateAccountStatusResponse] = service.listCreateAccountStatus(params).promise().toFuture
    @inline def listHandshakesForAccountFuture(
        params: ListHandshakesForAccountRequest
    ): Future[ListHandshakesForAccountResponse] = service.listHandshakesForAccount(params).promise().toFuture
    @inline def listHandshakesForOrganizationFuture(
        params: ListHandshakesForOrganizationRequest
    ): Future[ListHandshakesForOrganizationResponse] = service.listHandshakesForOrganization(params).promise().toFuture
    @inline def listOrganizationalUnitsForParentFuture(
        params: ListOrganizationalUnitsForParentRequest
    ): Future[ListOrganizationalUnitsForParentResponse] =
      service.listOrganizationalUnitsForParent(params).promise().toFuture
    @inline def listParentsFuture(params: ListParentsRequest): Future[ListParentsResponse] =
      service.listParents(params).promise().toFuture
    @inline def listPoliciesForTargetFuture(
        params: ListPoliciesForTargetRequest
    ): Future[ListPoliciesForTargetResponse] = service.listPoliciesForTarget(params).promise().toFuture
    @inline def listPoliciesFuture(params: ListPoliciesRequest): Future[ListPoliciesResponse] =
      service.listPolicies(params).promise().toFuture
    @inline def listRootsFuture(params: ListRootsRequest): Future[ListRootsResponse] =
      service.listRoots(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listTargetsForPolicyFuture(params: ListTargetsForPolicyRequest): Future[ListTargetsForPolicyResponse] =
      service.listTargetsForPolicy(params).promise().toFuture
    @inline def moveAccountFuture(params: MoveAccountRequest): Future[js.Object] =
      service.moveAccount(params).promise().toFuture
    @inline def removeAccountFromOrganizationFuture(params: RemoveAccountFromOrganizationRequest): Future[js.Object] =
      service.removeAccountFromOrganization(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise().toFuture
    @inline def updateOrganizationalUnitFuture(
        params: UpdateOrganizationalUnitRequest
    ): Future[UpdateOrganizationalUnitResponse] = service.updateOrganizationalUnit(params).promise().toFuture
    @inline def updatePolicyFuture(params: UpdatePolicyRequest): Future[UpdatePolicyResponse] =
      service.updatePolicy(params).promise().toFuture
  }
}

package organizations {
  @js.native
  @JSImport("aws-sdk", "Organizations")
  class Organizations() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptHandshake(params: AcceptHandshakeRequest): Request[AcceptHandshakeResponse]                   = js.native
    def attachPolicy(params: AttachPolicyRequest): Request[js.Object]                                       = js.native
    def cancelHandshake(params: CancelHandshakeRequest): Request[CancelHandshakeResponse]                   = js.native
    def createAccount(params: CreateAccountRequest): Request[CreateAccountResponse]                         = js.native
    def createGovCloudAccount(params: CreateGovCloudAccountRequest): Request[CreateGovCloudAccountResponse] = js.native
    def createOrganization(params: CreateOrganizationRequest): Request[CreateOrganizationResponse]          = js.native
    def createOrganizationalUnit(params: CreateOrganizationalUnitRequest): Request[CreateOrganizationalUnitResponse] =
      js.native
    def createPolicy(params: CreatePolicyRequest): Request[CreatePolicyResponse]              = js.native
    def declineHandshake(params: DeclineHandshakeRequest): Request[DeclineHandshakeResponse]  = js.native
    def deleteOrganization(): Request[js.Object]                                              = js.native
    def deleteOrganizationalUnit(params: DeleteOrganizationalUnitRequest): Request[js.Object] = js.native
    def deletePolicy(params: DeletePolicyRequest): Request[js.Object]                         = js.native
    def describeAccount(params: DescribeAccountRequest): Request[DescribeAccountResponse]     = js.native
    def describeCreateAccountStatus(
        params: DescribeCreateAccountStatusRequest
    ): Request[DescribeCreateAccountStatusResponse] = js.native
    def describeEffectivePolicy(params: DescribeEffectivePolicyRequest): Request[DescribeEffectivePolicyResponse] =
      js.native
    def describeHandshake(params: DescribeHandshakeRequest): Request[DescribeHandshakeResponse] = js.native
    def describeOrganization(): Request[DescribeOrganizationResponse]                           = js.native
    def describeOrganizationalUnit(
        params: DescribeOrganizationalUnitRequest
    ): Request[DescribeOrganizationalUnitResponse]                                              = js.native
    def describePolicy(params: DescribePolicyRequest): Request[DescribePolicyResponse]          = js.native
    def detachPolicy(params: DetachPolicyRequest): Request[js.Object]                           = js.native
    def disableAWSServiceAccess(params: DisableAWSServiceAccessRequest): Request[js.Object]     = js.native
    def disablePolicyType(params: DisablePolicyTypeRequest): Request[DisablePolicyTypeResponse] = js.native
    def enableAWSServiceAccess(params: EnableAWSServiceAccessRequest): Request[js.Object]       = js.native
    def enableAllFeatures(params: EnableAllFeaturesRequest): Request[EnableAllFeaturesResponse] = js.native
    def enablePolicyType(params: EnablePolicyTypeRequest): Request[EnablePolicyTypeResponse]    = js.native
    def inviteAccountToOrganization(
        params: InviteAccountToOrganizationRequest
    ): Request[InviteAccountToOrganizationResponse] = js.native
    def leaveOrganization(): Request[js.Object]     = js.native
    def listAWSServiceAccessForOrganization(
        params: ListAWSServiceAccessForOrganizationRequest
    ): Request[ListAWSServiceAccessForOrganizationResponse]                                                 = js.native
    def listAccounts(params: ListAccountsRequest): Request[ListAccountsResponse]                            = js.native
    def listAccountsForParent(params: ListAccountsForParentRequest): Request[ListAccountsForParentResponse] = js.native
    def listChildren(params: ListChildrenRequest): Request[ListChildrenResponse]                            = js.native
    def listCreateAccountStatus(params: ListCreateAccountStatusRequest): Request[ListCreateAccountStatusResponse] =
      js.native
    def listHandshakesForAccount(params: ListHandshakesForAccountRequest): Request[ListHandshakesForAccountResponse] =
      js.native
    def listHandshakesForOrganization(
        params: ListHandshakesForOrganizationRequest
    ): Request[ListHandshakesForOrganizationResponse] = js.native
    def listOrganizationalUnitsForParent(
        params: ListOrganizationalUnitsForParentRequest
    ): Request[ListOrganizationalUnitsForParentResponse]                                                    = js.native
    def listParents(params: ListParentsRequest): Request[ListParentsResponse]                               = js.native
    def listPolicies(params: ListPoliciesRequest): Request[ListPoliciesResponse]                            = js.native
    def listPoliciesForTarget(params: ListPoliciesForTargetRequest): Request[ListPoliciesForTargetResponse] = js.native
    def listRoots(params: ListRootsRequest): Request[ListRootsResponse]                                     = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]       = js.native
    def listTargetsForPolicy(params: ListTargetsForPolicyRequest): Request[ListTargetsForPolicyResponse]    = js.native
    def moveAccount(params: MoveAccountRequest): Request[js.Object]                                         = js.native
    def removeAccountFromOrganization(params: RemoveAccountFromOrganizationRequest): Request[js.Object]     = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                                         = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                                     = js.native
    def updateOrganizationalUnit(params: UpdateOrganizationalUnitRequest): Request[UpdateOrganizationalUnitResponse] =
      js.native
    def updatePolicy(params: UpdatePolicyRequest): Request[UpdatePolicyResponse] = js.native
  }

  @js.native
  @Factory
  trait AcceptHandshakeRequest extends js.Object {
    var HandshakeId: HandshakeId
  }

  @js.native
  @Factory
  trait AcceptHandshakeResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  /**
    * Contains information about an AWS account that is a member of an organization.
    */
  @js.native
  @Factory
  trait Account extends js.Object {
    var Arn: js.UndefOr[AccountArn]
    var Email: js.UndefOr[Email]
    var Id: js.UndefOr[AccountId]
    var JoinedMethod: js.UndefOr[AccountJoinedMethod]
    var JoinedTimestamp: js.UndefOr[Timestamp]
    var Name: js.UndefOr[AccountName]
    var Status: js.UndefOr[AccountStatus]
  }

  @js.native
  sealed trait AccountJoinedMethod extends js.Any
  object AccountJoinedMethod extends js.Object {
    val INVITED = "INVITED".asInstanceOf[AccountJoinedMethod]
    val CREATED = "CREATED".asInstanceOf[AccountJoinedMethod]

    val values = js.Object.freeze(js.Array(INVITED, CREATED))
  }

  @js.native
  sealed trait AccountStatus extends js.Any
  object AccountStatus extends js.Object {
    val ACTIVE    = "ACTIVE".asInstanceOf[AccountStatus]
    val SUSPENDED = "SUSPENDED".asInstanceOf[AccountStatus]

    val values = js.Object.freeze(js.Array(ACTIVE, SUSPENDED))
  }

  @js.native
  sealed trait ActionType extends js.Any
  object ActionType extends js.Object {
    val INVITE                                = "INVITE".asInstanceOf[ActionType]
    val ENABLE_ALL_FEATURES                   = "ENABLE_ALL_FEATURES".asInstanceOf[ActionType]
    val APPROVE_ALL_FEATURES                  = "APPROVE_ALL_FEATURES".asInstanceOf[ActionType]
    val ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE = "ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE".asInstanceOf[ActionType]

    val values = js.Object.freeze(
      js.Array(INVITE, ENABLE_ALL_FEATURES, APPROVE_ALL_FEATURES, ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE)
    )
  }

  @js.native
  @Factory
  trait AttachPolicyRequest extends js.Object {
    var PolicyId: PolicyId
    var TargetId: PolicyTargetId
  }

  @js.native
  @Factory
  trait CancelHandshakeRequest extends js.Object {
    var HandshakeId: HandshakeId
  }

  @js.native
  @Factory
  trait CancelHandshakeResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  /**
    * Contains a list of child entities, either OUs or accounts.
    */
  @js.native
  @Factory
  trait Child extends js.Object {
    var Id: js.UndefOr[ChildId]
    var Type: js.UndefOr[ChildType]
  }

  @js.native
  sealed trait ChildType extends js.Any
  object ChildType extends js.Object {
    val ACCOUNT             = "ACCOUNT".asInstanceOf[ChildType]
    val ORGANIZATIONAL_UNIT = "ORGANIZATIONAL_UNIT".asInstanceOf[ChildType]

    val values = js.Object.freeze(js.Array(ACCOUNT, ORGANIZATIONAL_UNIT))
  }

  @js.native
  sealed trait CreateAccountFailureReason extends js.Any
  object CreateAccountFailureReason extends js.Object {
    val ACCOUNT_LIMIT_EXCEEDED          = "ACCOUNT_LIMIT_EXCEEDED".asInstanceOf[CreateAccountFailureReason]
    val EMAIL_ALREADY_EXISTS            = "EMAIL_ALREADY_EXISTS".asInstanceOf[CreateAccountFailureReason]
    val INVALID_ADDRESS                 = "INVALID_ADDRESS".asInstanceOf[CreateAccountFailureReason]
    val INVALID_EMAIL                   = "INVALID_EMAIL".asInstanceOf[CreateAccountFailureReason]
    val CONCURRENT_ACCOUNT_MODIFICATION = "CONCURRENT_ACCOUNT_MODIFICATION".asInstanceOf[CreateAccountFailureReason]
    val INTERNAL_FAILURE                = "INTERNAL_FAILURE".asInstanceOf[CreateAccountFailureReason]
    val GOVCLOUD_ACCOUNT_ALREADY_EXISTS = "GOVCLOUD_ACCOUNT_ALREADY_EXISTS".asInstanceOf[CreateAccountFailureReason]

    val values = js.Object.freeze(
      js.Array(
        ACCOUNT_LIMIT_EXCEEDED,
        EMAIL_ALREADY_EXISTS,
        INVALID_ADDRESS,
        INVALID_EMAIL,
        CONCURRENT_ACCOUNT_MODIFICATION,
        INTERNAL_FAILURE,
        GOVCLOUD_ACCOUNT_ALREADY_EXISTS
      )
    )
  }

  @js.native
  @Factory
  trait CreateAccountRequest extends js.Object {
    var AccountName: AccountName
    var Email: Email
    var IamUserAccessToBilling: js.UndefOr[IAMUserAccessToBilling]
    var RoleName: js.UndefOr[RoleName]
  }

  @js.native
  @Factory
  trait CreateAccountResponse extends js.Object {
    var CreateAccountStatus: js.UndefOr[CreateAccountStatus]
  }

  @js.native
  sealed trait CreateAccountState extends js.Any
  object CreateAccountState extends js.Object {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[CreateAccountState]
    val SUCCEEDED   = "SUCCEEDED".asInstanceOf[CreateAccountState]
    val FAILED      = "FAILED".asInstanceOf[CreateAccountState]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, SUCCEEDED, FAILED))
  }

  /**
    * Contains the status about a <a>CreateAccount</a> or <a>CreateGovCloudAccount</a> request to create an AWS account or an AWS GovCloud (US) account in an organization.
    */
  @js.native
  @Factory
  trait CreateAccountStatus extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var AccountName: js.UndefOr[AccountName]
    var CompletedTimestamp: js.UndefOr[Timestamp]
    var FailureReason: js.UndefOr[CreateAccountFailureReason]
    var GovCloudAccountId: js.UndefOr[AccountId]
    var Id: js.UndefOr[CreateAccountRequestId]
    var RequestedTimestamp: js.UndefOr[Timestamp]
    var State: js.UndefOr[CreateAccountState]
  }

  @js.native
  @Factory
  trait CreateGovCloudAccountRequest extends js.Object {
    var AccountName: AccountName
    var Email: Email
    var IamUserAccessToBilling: js.UndefOr[IAMUserAccessToBilling]
    var RoleName: js.UndefOr[RoleName]
  }

  @js.native
  @Factory
  trait CreateGovCloudAccountResponse extends js.Object {
    var CreateAccountStatus: js.UndefOr[CreateAccountStatus]
  }

  @js.native
  @Factory
  trait CreateOrganizationRequest extends js.Object {
    var FeatureSet: js.UndefOr[OrganizationFeatureSet]
  }

  @js.native
  @Factory
  trait CreateOrganizationResponse extends js.Object {
    var Organization: js.UndefOr[Organization]
  }

  @js.native
  @Factory
  trait CreateOrganizationalUnitRequest extends js.Object {
    var Name: OrganizationalUnitName
    var ParentId: ParentId
  }

  @js.native
  @Factory
  trait CreateOrganizationalUnitResponse extends js.Object {
    var OrganizationalUnit: js.UndefOr[OrganizationalUnit]
  }

  @js.native
  @Factory
  trait CreatePolicyRequest extends js.Object {
    var Content: PolicyContent
    var Description: PolicyDescription
    var Name: PolicyName
    var Type: PolicyType
  }

  @js.native
  @Factory
  trait CreatePolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  @js.native
  @Factory
  trait DeclineHandshakeRequest extends js.Object {
    var HandshakeId: HandshakeId
  }

  @js.native
  @Factory
  trait DeclineHandshakeResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  @js.native
  @Factory
  trait DeleteOrganizationalUnitRequest extends js.Object {
    var OrganizationalUnitId: OrganizationalUnitId
  }

  @js.native
  @Factory
  trait DeletePolicyRequest extends js.Object {
    var PolicyId: PolicyId
  }

  @js.native
  @Factory
  trait DescribeAccountRequest extends js.Object {
    var AccountId: AccountId
  }

  @js.native
  @Factory
  trait DescribeAccountResponse extends js.Object {
    var Account: js.UndefOr[Account]
  }

  @js.native
  @Factory
  trait DescribeCreateAccountStatusRequest extends js.Object {
    var CreateAccountRequestId: CreateAccountRequestId
  }

  @js.native
  @Factory
  trait DescribeCreateAccountStatusResponse extends js.Object {
    var CreateAccountStatus: js.UndefOr[CreateAccountStatus]
  }

  @js.native
  @Factory
  trait DescribeEffectivePolicyRequest extends js.Object {
    var PolicyType: EffectivePolicyType
    var TargetId: js.UndefOr[PolicyTargetId]
  }

  @js.native
  @Factory
  trait DescribeEffectivePolicyResponse extends js.Object {
    var EffectivePolicy: js.UndefOr[EffectivePolicy]
  }

  @js.native
  @Factory
  trait DescribeHandshakeRequest extends js.Object {
    var HandshakeId: HandshakeId
  }

  @js.native
  @Factory
  trait DescribeHandshakeResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  @js.native
  @Factory
  trait DescribeOrganizationResponse extends js.Object {
    var Organization: js.UndefOr[Organization]
  }

  @js.native
  @Factory
  trait DescribeOrganizationalUnitRequest extends js.Object {
    var OrganizationalUnitId: OrganizationalUnitId
  }

  @js.native
  @Factory
  trait DescribeOrganizationalUnitResponse extends js.Object {
    var OrganizationalUnit: js.UndefOr[OrganizationalUnit]
  }

  @js.native
  @Factory
  trait DescribePolicyRequest extends js.Object {
    var PolicyId: PolicyId
  }

  @js.native
  @Factory
  trait DescribePolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  @js.native
  @Factory
  trait DetachPolicyRequest extends js.Object {
    var PolicyId: PolicyId
    var TargetId: PolicyTargetId
  }

  @js.native
  @Factory
  trait DisableAWSServiceAccessRequest extends js.Object {
    var ServicePrincipal: ServicePrincipal
  }

  @js.native
  @Factory
  trait DisablePolicyTypeRequest extends js.Object {
    var PolicyType: PolicyType
    var RootId: RootId
  }

  @js.native
  @Factory
  trait DisablePolicyTypeResponse extends js.Object {
    var Root: js.UndefOr[Root]
  }

  /**
    * Contains rules to be applied to the affected accounts. The effective policy is the aggregation of any policies the account inherits, plus any policy directly attached to the account.
    */
  @js.native
  @Factory
  trait EffectivePolicy extends js.Object {
    var LastUpdatedTimestamp: js.UndefOr[Timestamp]
    var PolicyContent: js.UndefOr[PolicyContent]
    var PolicyType: js.UndefOr[EffectivePolicyType]
    var TargetId: js.UndefOr[PolicyTargetId]
  }

  @js.native
  sealed trait EffectivePolicyType extends js.Any
  object EffectivePolicyType extends js.Object {
    val TAG_POLICY = "TAG_POLICY".asInstanceOf[EffectivePolicyType]

    val values = js.Object.freeze(js.Array(TAG_POLICY))
  }

  @js.native
  @Factory
  trait EnableAWSServiceAccessRequest extends js.Object {
    var ServicePrincipal: ServicePrincipal
  }

  @js.native
  @Factory
  trait EnableAllFeaturesRequest extends js.Object {}

  @js.native
  @Factory
  trait EnableAllFeaturesResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  @js.native
  @Factory
  trait EnablePolicyTypeRequest extends js.Object {
    var PolicyType: PolicyType
    var RootId: RootId
  }

  @js.native
  @Factory
  trait EnablePolicyTypeResponse extends js.Object {
    var Root: js.UndefOr[Root]
  }

  /**
    * A structure that contains details of a service principal that is enabled to integrate with AWS Organizations.
    */
  @js.native
  @Factory
  trait EnabledServicePrincipal extends js.Object {
    var DateEnabled: js.UndefOr[Timestamp]
    var ServicePrincipal: js.UndefOr[ServicePrincipal]
  }

  /**
    * Contains information that must be exchanged to securely establish a relationship between two accounts (an <i>originator</i> and a <i>recipient</i>). For example, assume that a master account (the originator) invites another account (the recipient) to join its organization. In that case, the two accounts exchange information as a series of handshake requests and responses.
    *  ```Note:``` Handshakes that are CANCELED, ACCEPTED, or DECLINED show up in lists for only 30 days after entering that state. After that, they are deleted.
    */
  @js.native
  @Factory
  trait Handshake extends js.Object {
    var Action: js.UndefOr[ActionType]
    var Arn: js.UndefOr[HandshakeArn]
    var ExpirationTimestamp: js.UndefOr[Timestamp]
    var Id: js.UndefOr[HandshakeId]
    var Parties: js.UndefOr[HandshakeParties]
    var RequestedTimestamp: js.UndefOr[Timestamp]
    var Resources: js.UndefOr[HandshakeResources]
    var State: js.UndefOr[HandshakeState]
  }

  /**
    * Specifies the criteria that are used to select the handshakes for the operation.
    */
  @js.native
  @Factory
  trait HandshakeFilter extends js.Object {
    var ActionType: js.UndefOr[ActionType]
    var ParentHandshakeId: js.UndefOr[HandshakeId]
  }

  /**
    * Identifies a participant in a handshake.
    */
  @js.native
  @Factory
  trait HandshakeParty extends js.Object {
    var Id: HandshakePartyId
    var Type: HandshakePartyType
  }

  @js.native
  sealed trait HandshakePartyType extends js.Any
  object HandshakePartyType extends js.Object {
    val ACCOUNT      = "ACCOUNT".asInstanceOf[HandshakePartyType]
    val ORGANIZATION = "ORGANIZATION".asInstanceOf[HandshakePartyType]
    val EMAIL        = "EMAIL".asInstanceOf[HandshakePartyType]

    val values = js.Object.freeze(js.Array(ACCOUNT, ORGANIZATION, EMAIL))
  }

  /**
    * Contains additional data that is needed to process a handshake.
    */
  @js.native
  @Factory
  trait HandshakeResource extends js.Object {
    var Resources: js.UndefOr[HandshakeResources]
    var Type: js.UndefOr[HandshakeResourceType]
    var Value: js.UndefOr[HandshakeResourceValue]
  }

  @js.native
  sealed trait HandshakeResourceType extends js.Any
  object HandshakeResourceType extends js.Object {
    val ACCOUNT                  = "ACCOUNT".asInstanceOf[HandshakeResourceType]
    val ORGANIZATION             = "ORGANIZATION".asInstanceOf[HandshakeResourceType]
    val ORGANIZATION_FEATURE_SET = "ORGANIZATION_FEATURE_SET".asInstanceOf[HandshakeResourceType]
    val EMAIL                    = "EMAIL".asInstanceOf[HandshakeResourceType]
    val MASTER_EMAIL             = "MASTER_EMAIL".asInstanceOf[HandshakeResourceType]
    val MASTER_NAME              = "MASTER_NAME".asInstanceOf[HandshakeResourceType]
    val NOTES                    = "NOTES".asInstanceOf[HandshakeResourceType]
    val PARENT_HANDSHAKE         = "PARENT_HANDSHAKE".asInstanceOf[HandshakeResourceType]

    val values = js.Object.freeze(
      js.Array(
        ACCOUNT,
        ORGANIZATION,
        ORGANIZATION_FEATURE_SET,
        EMAIL,
        MASTER_EMAIL,
        MASTER_NAME,
        NOTES,
        PARENT_HANDSHAKE
      )
    )
  }

  @js.native
  sealed trait HandshakeState extends js.Any
  object HandshakeState extends js.Object {
    val REQUESTED = "REQUESTED".asInstanceOf[HandshakeState]
    val OPEN      = "OPEN".asInstanceOf[HandshakeState]
    val CANCELED  = "CANCELED".asInstanceOf[HandshakeState]
    val ACCEPTED  = "ACCEPTED".asInstanceOf[HandshakeState]
    val DECLINED  = "DECLINED".asInstanceOf[HandshakeState]
    val EXPIRED   = "EXPIRED".asInstanceOf[HandshakeState]

    val values = js.Object.freeze(js.Array(REQUESTED, OPEN, CANCELED, ACCEPTED, DECLINED, EXPIRED))
  }

  @js.native
  sealed trait IAMUserAccessToBilling extends js.Any
  object IAMUserAccessToBilling extends js.Object {
    val ALLOW = "ALLOW".asInstanceOf[IAMUserAccessToBilling]
    val DENY  = "DENY".asInstanceOf[IAMUserAccessToBilling]

    val values = js.Object.freeze(js.Array(ALLOW, DENY))
  }

  @js.native
  @Factory
  trait InviteAccountToOrganizationRequest extends js.Object {
    var Target: HandshakeParty
    var Notes: js.UndefOr[HandshakeNotes]
  }

  @js.native
  @Factory
  trait InviteAccountToOrganizationResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  @js.native
  @Factory
  trait ListAWSServiceAccessForOrganizationRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListAWSServiceAccessForOrganizationResponse extends js.Object {
    var EnabledServicePrincipals: js.UndefOr[EnabledServicePrincipals]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListAccountsForParentRequest extends js.Object {
    var ParentId: ParentId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListAccountsForParentResponse extends js.Object {
    var Accounts: js.UndefOr[Accounts]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListAccountsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListAccountsResponse extends js.Object {
    var Accounts: js.UndefOr[Accounts]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListChildrenRequest extends js.Object {
    var ChildType: ChildType
    var ParentId: ParentId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListChildrenResponse extends js.Object {
    var Children: js.UndefOr[Children]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListCreateAccountStatusRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var States: js.UndefOr[CreateAccountStates]
  }

  @js.native
  @Factory
  trait ListCreateAccountStatusResponse extends js.Object {
    var CreateAccountStatuses: js.UndefOr[CreateAccountStatuses]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListHandshakesForAccountRequest extends js.Object {
    var Filter: js.UndefOr[HandshakeFilter]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListHandshakesForAccountResponse extends js.Object {
    var Handshakes: js.UndefOr[Handshakes]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListHandshakesForOrganizationRequest extends js.Object {
    var Filter: js.UndefOr[HandshakeFilter]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListHandshakesForOrganizationResponse extends js.Object {
    var Handshakes: js.UndefOr[Handshakes]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListOrganizationalUnitsForParentRequest extends js.Object {
    var ParentId: ParentId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListOrganizationalUnitsForParentResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var OrganizationalUnits: js.UndefOr[OrganizationalUnits]
  }

  @js.native
  @Factory
  trait ListParentsRequest extends js.Object {
    var ChildId: ChildId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListParentsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Parents: js.UndefOr[Parents]
  }

  @js.native
  @Factory
  trait ListPoliciesForTargetRequest extends js.Object {
    var Filter: PolicyType
    var TargetId: PolicyTargetId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListPoliciesForTargetResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Policies: js.UndefOr[Policies]
  }

  @js.native
  @Factory
  trait ListPoliciesRequest extends js.Object {
    var Filter: PolicyType
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListPoliciesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Policies: js.UndefOr[Policies]
  }

  @js.native
  @Factory
  trait ListRootsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListRootsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Roots: js.UndefOr[Roots]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceId: TaggableResourceId
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait ListTargetsForPolicyRequest extends js.Object {
    var PolicyId: PolicyId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTargetsForPolicyResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Targets: js.UndefOr[PolicyTargets]
  }

  @js.native
  @Factory
  trait MoveAccountRequest extends js.Object {
    var AccountId: AccountId
    var DestinationParentId: ParentId
    var SourceParentId: ParentId
  }

  /**
    * Contains details about an organization. An organization is a collection of accounts that are centrally managed together using consolidated billing, organized hierarchically with organizational units (OUs), and controlled with policies.
    */
  @js.native
  @Factory
  trait Organization extends js.Object {
    var Arn: js.UndefOr[OrganizationArn]
    var AvailablePolicyTypes: js.UndefOr[PolicyTypes]
    var FeatureSet: js.UndefOr[OrganizationFeatureSet]
    var Id: js.UndefOr[OrganizationId]
    var MasterAccountArn: js.UndefOr[AccountArn]
    var MasterAccountEmail: js.UndefOr[Email]
    var MasterAccountId: js.UndefOr[AccountId]
  }

  @js.native
  sealed trait OrganizationFeatureSet extends js.Any
  object OrganizationFeatureSet extends js.Object {
    val ALL                  = "ALL".asInstanceOf[OrganizationFeatureSet]
    val CONSOLIDATED_BILLING = "CONSOLIDATED_BILLING".asInstanceOf[OrganizationFeatureSet]

    val values = js.Object.freeze(js.Array(ALL, CONSOLIDATED_BILLING))
  }

  /**
    * Contains details about an organizational unit (OU). An OU is a container of AWS accounts within a root of an organization. Policies that are attached to an OU apply to all accounts contained in that OU and in any child OUs.
    */
  @js.native
  @Factory
  trait OrganizationalUnit extends js.Object {
    var Arn: js.UndefOr[OrganizationalUnitArn]
    var Id: js.UndefOr[OrganizationalUnitId]
    var Name: js.UndefOr[OrganizationalUnitName]
  }

  /**
    * Contains information about either a root or an organizational unit (OU) that can contain OUs or accounts in an organization.
    */
  @js.native
  @Factory
  trait Parent extends js.Object {
    var Id: js.UndefOr[ParentId]
    var Type: js.UndefOr[ParentType]
  }

  @js.native
  sealed trait ParentType extends js.Any
  object ParentType extends js.Object {
    val ROOT                = "ROOT".asInstanceOf[ParentType]
    val ORGANIZATIONAL_UNIT = "ORGANIZATIONAL_UNIT".asInstanceOf[ParentType]

    val values = js.Object.freeze(js.Array(ROOT, ORGANIZATIONAL_UNIT))
  }

  /**
    * Contains rules to be applied to the affected accounts. Policies can be attached directly to accounts, or to roots and OUs to affect all accounts in those hierarchies.
    */
  @js.native
  @Factory
  trait Policy extends js.Object {
    var Content: js.UndefOr[PolicyContent]
    var PolicySummary: js.UndefOr[PolicySummary]
  }

  /**
    * Contains information about a policy, but does not include the content. To see the content of a policy, see <a>DescribePolicy</a>.
    */
  @js.native
  @Factory
  trait PolicySummary extends js.Object {
    var Arn: js.UndefOr[PolicyArn]
    var AwsManaged: js.UndefOr[AwsManagedPolicy]
    var Description: js.UndefOr[PolicyDescription]
    var Id: js.UndefOr[PolicyId]
    var Name: js.UndefOr[PolicyName]
    var Type: js.UndefOr[PolicyType]
  }

  /**
    * Contains information about a root, OU, or account that a policy is attached to.
    */
  @js.native
  @Factory
  trait PolicyTargetSummary extends js.Object {
    var Arn: js.UndefOr[GenericArn]
    var Name: js.UndefOr[TargetName]
    var TargetId: js.UndefOr[PolicyTargetId]
    var Type: js.UndefOr[TargetType]
  }

  @js.native
  sealed trait PolicyType extends js.Any
  object PolicyType extends js.Object {
    val SERVICE_CONTROL_POLICY = "SERVICE_CONTROL_POLICY".asInstanceOf[PolicyType]
    val TAG_POLICY             = "TAG_POLICY".asInstanceOf[PolicyType]

    val values = js.Object.freeze(js.Array(SERVICE_CONTROL_POLICY, TAG_POLICY))
  }

  @js.native
  sealed trait PolicyTypeStatus extends js.Any
  object PolicyTypeStatus extends js.Object {
    val ENABLED         = "ENABLED".asInstanceOf[PolicyTypeStatus]
    val PENDING_ENABLE  = "PENDING_ENABLE".asInstanceOf[PolicyTypeStatus]
    val PENDING_DISABLE = "PENDING_DISABLE".asInstanceOf[PolicyTypeStatus]

    val values = js.Object.freeze(js.Array(ENABLED, PENDING_ENABLE, PENDING_DISABLE))
  }

  /**
    * Contains information about a policy type and its status in the associated root.
    */
  @js.native
  @Factory
  trait PolicyTypeSummary extends js.Object {
    var Status: js.UndefOr[PolicyTypeStatus]
    var Type: js.UndefOr[PolicyType]
  }

  @js.native
  @Factory
  trait RemoveAccountFromOrganizationRequest extends js.Object {
    var AccountId: AccountId
  }

  /**
    * Contains details about a root. A root is a top-level parent node in the hierarchy of an organization that can contain organizational units (OUs) and accounts. Every root contains every AWS account in the organization. Each root enables the accounts to be organized in a different way and to have different policy types enabled for use in that root.
    */
  @js.native
  @Factory
  trait Root extends js.Object {
    var Arn: js.UndefOr[RootArn]
    var Id: js.UndefOr[RootId]
    var Name: js.UndefOr[RootName]
    var PolicyTypes: js.UndefOr[PolicyTypes]
  }

  /**
    * A custom key-value pair associated with a resource such as an account within your organization.
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
    var ResourceId: TaggableResourceId
    var Tags: Tags
  }

  @js.native
  sealed trait TargetType extends js.Any
  object TargetType extends js.Object {
    val ACCOUNT             = "ACCOUNT".asInstanceOf[TargetType]
    val ORGANIZATIONAL_UNIT = "ORGANIZATIONAL_UNIT".asInstanceOf[TargetType]
    val ROOT                = "ROOT".asInstanceOf[TargetType]

    val values = js.Object.freeze(js.Array(ACCOUNT, ORGANIZATIONAL_UNIT, ROOT))
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceId: TaggableResourceId
    var TagKeys: TagKeys
  }

  @js.native
  @Factory
  trait UpdateOrganizationalUnitRequest extends js.Object {
    var OrganizationalUnitId: OrganizationalUnitId
    var Name: js.UndefOr[OrganizationalUnitName]
  }

  @js.native
  @Factory
  trait UpdateOrganizationalUnitResponse extends js.Object {
    var OrganizationalUnit: js.UndefOr[OrganizationalUnit]
  }

  @js.native
  @Factory
  trait UpdatePolicyRequest extends js.Object {
    var PolicyId: PolicyId
    var Content: js.UndefOr[PolicyContent]
    var Description: js.UndefOr[PolicyDescription]
    var Name: js.UndefOr[PolicyName]
  }

  @js.native
  @Factory
  trait UpdatePolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
  }
}
