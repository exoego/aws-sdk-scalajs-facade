package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object organizations {
  type AccountArn = String
  type AccountId = String
  type AccountName = String
  type Accounts = js.Array[Account]
  type AwsManagedPolicy = Boolean
  type ChildId = String
  type Children = js.Array[Child]
  type CreateAccountRequestId = String
  type CreateAccountStates = js.Array[CreateAccountState]
  type CreateAccountStatuses = js.Array[CreateAccountStatus]
  type DelegatedAdministrators = js.Array[DelegatedAdministrator]
  type DelegatedServices = js.Array[DelegatedService]
  type Email = String
  type EnabledServicePrincipals = js.Array[EnabledServicePrincipal]
  type GenericArn = String
  type HandshakeArn = String
  type HandshakeId = String
  type HandshakeNotes = String
  type HandshakeParties = js.Array[HandshakeParty]
  type HandshakePartyId = String
  type HandshakeResourceValue = String
  type HandshakeResources = js.Array[HandshakeResource]
  type Handshakes = js.Array[Handshake]
  type MaxResults = Int
  type NextToken = String
  type OrganizationArn = String
  type OrganizationId = String
  type OrganizationalUnitArn = String
  type OrganizationalUnitId = String
  type OrganizationalUnitName = String
  type OrganizationalUnits = js.Array[OrganizationalUnit]
  type ParentId = String
  type Parents = js.Array[Parent]
  type Policies = js.Array[PolicySummary]
  type PolicyArn = String
  type PolicyContent = String
  type PolicyDescription = String
  type PolicyId = String
  type PolicyName = String
  type PolicyTargetId = String
  type PolicyTargets = js.Array[PolicyTargetSummary]
  type PolicyTypes = js.Array[PolicyTypeSummary]
  type RoleName = String
  type RootArn = String
  type RootId = String
  type RootName = String
  type Roots = js.Array[Root]
  type ServicePrincipal = String
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type TaggableResourceId = String
  type Tags = js.Array[Tag]
  type TargetName = String
  type Timestamp = js.Date

  implicit final class OrganizationsOps(private val service: Organizations) extends AnyVal {

    @inline def acceptHandshakeFuture(params: AcceptHandshakeRequest): Future[AcceptHandshakeResponse] = service.acceptHandshake(params).promise().toFuture
    @inline def attachPolicyFuture(params: AttachPolicyRequest): Future[js.Object] = service.attachPolicy(params).promise().toFuture
    @inline def cancelHandshakeFuture(params: CancelHandshakeRequest): Future[CancelHandshakeResponse] = service.cancelHandshake(params).promise().toFuture
    @inline def createAccountFuture(params: CreateAccountRequest): Future[CreateAccountResponse] = service.createAccount(params).promise().toFuture
    @inline def createGovCloudAccountFuture(params: CreateGovCloudAccountRequest): Future[CreateGovCloudAccountResponse] = service.createGovCloudAccount(params).promise().toFuture
    @inline def createOrganizationFuture(params: CreateOrganizationRequest): Future[CreateOrganizationResponse] = service.createOrganization(params).promise().toFuture
    @inline def createOrganizationalUnitFuture(params: CreateOrganizationalUnitRequest): Future[CreateOrganizationalUnitResponse] = service.createOrganizationalUnit(params).promise().toFuture
    @inline def createPolicyFuture(params: CreatePolicyRequest): Future[CreatePolicyResponse] = service.createPolicy(params).promise().toFuture
    @inline def declineHandshakeFuture(params: DeclineHandshakeRequest): Future[DeclineHandshakeResponse] = service.declineHandshake(params).promise().toFuture
    @inline def deleteOrganizationFuture(): Future[js.Object] = service.deleteOrganization().promise().toFuture
    @inline def deleteOrganizationalUnitFuture(params: DeleteOrganizationalUnitRequest): Future[js.Object] = service.deleteOrganizationalUnit(params).promise().toFuture
    @inline def deletePolicyFuture(params: DeletePolicyRequest): Future[js.Object] = service.deletePolicy(params).promise().toFuture
    @inline def deregisterDelegatedAdministratorFuture(params: DeregisterDelegatedAdministratorRequest): Future[js.Object] = service.deregisterDelegatedAdministrator(params).promise().toFuture
    @inline def describeAccountFuture(params: DescribeAccountRequest): Future[DescribeAccountResponse] = service.describeAccount(params).promise().toFuture
    @inline def describeCreateAccountStatusFuture(params: DescribeCreateAccountStatusRequest): Future[DescribeCreateAccountStatusResponse] = service.describeCreateAccountStatus(params).promise().toFuture
    @inline def describeEffectivePolicyFuture(params: DescribeEffectivePolicyRequest): Future[DescribeEffectivePolicyResponse] = service.describeEffectivePolicy(params).promise().toFuture
    @inline def describeHandshakeFuture(params: DescribeHandshakeRequest): Future[DescribeHandshakeResponse] = service.describeHandshake(params).promise().toFuture
    @inline def describeOrganizationFuture(): Future[DescribeOrganizationResponse] = service.describeOrganization().promise().toFuture
    @inline def describeOrganizationalUnitFuture(params: DescribeOrganizationalUnitRequest): Future[DescribeOrganizationalUnitResponse] = service.describeOrganizationalUnit(params).promise().toFuture
    @inline def describePolicyFuture(params: DescribePolicyRequest): Future[DescribePolicyResponse] = service.describePolicy(params).promise().toFuture
    @inline def detachPolicyFuture(params: DetachPolicyRequest): Future[js.Object] = service.detachPolicy(params).promise().toFuture
    @inline def disableAWSServiceAccessFuture(params: DisableAWSServiceAccessRequest): Future[js.Object] = service.disableAWSServiceAccess(params).promise().toFuture
    @inline def disablePolicyTypeFuture(params: DisablePolicyTypeRequest): Future[DisablePolicyTypeResponse] = service.disablePolicyType(params).promise().toFuture
    @inline def enableAWSServiceAccessFuture(params: EnableAWSServiceAccessRequest): Future[js.Object] = service.enableAWSServiceAccess(params).promise().toFuture
    @inline def enableAllFeaturesFuture(params: EnableAllFeaturesRequest): Future[EnableAllFeaturesResponse] = service.enableAllFeatures(params).promise().toFuture
    @inline def enablePolicyTypeFuture(params: EnablePolicyTypeRequest): Future[EnablePolicyTypeResponse] = service.enablePolicyType(params).promise().toFuture
    @inline def inviteAccountToOrganizationFuture(params: InviteAccountToOrganizationRequest): Future[InviteAccountToOrganizationResponse] = service.inviteAccountToOrganization(params).promise().toFuture
    @inline def leaveOrganizationFuture(): Future[js.Object] = service.leaveOrganization().promise().toFuture
    @inline def listAWSServiceAccessForOrganizationFuture(params: ListAWSServiceAccessForOrganizationRequest): Future[ListAWSServiceAccessForOrganizationResponse] = service.listAWSServiceAccessForOrganization(params).promise().toFuture
    @inline def listAccountsForParentFuture(params: ListAccountsForParentRequest): Future[ListAccountsForParentResponse] = service.listAccountsForParent(params).promise().toFuture
    @inline def listAccountsFuture(params: ListAccountsRequest): Future[ListAccountsResponse] = service.listAccounts(params).promise().toFuture
    @inline def listChildrenFuture(params: ListChildrenRequest): Future[ListChildrenResponse] = service.listChildren(params).promise().toFuture
    @inline def listCreateAccountStatusFuture(params: ListCreateAccountStatusRequest): Future[ListCreateAccountStatusResponse] = service.listCreateAccountStatus(params).promise().toFuture
    @inline def listDelegatedAdministratorsFuture(params: ListDelegatedAdministratorsRequest): Future[ListDelegatedAdministratorsResponse] = service.listDelegatedAdministrators(params).promise().toFuture
    @inline def listDelegatedServicesForAccountFuture(params: ListDelegatedServicesForAccountRequest): Future[ListDelegatedServicesForAccountResponse] = service.listDelegatedServicesForAccount(params).promise().toFuture
    @inline def listHandshakesForAccountFuture(params: ListHandshakesForAccountRequest): Future[ListHandshakesForAccountResponse] = service.listHandshakesForAccount(params).promise().toFuture
    @inline def listHandshakesForOrganizationFuture(params: ListHandshakesForOrganizationRequest): Future[ListHandshakesForOrganizationResponse] = service.listHandshakesForOrganization(params).promise().toFuture
    @inline def listOrganizationalUnitsForParentFuture(params: ListOrganizationalUnitsForParentRequest): Future[ListOrganizationalUnitsForParentResponse] = service.listOrganizationalUnitsForParent(params).promise().toFuture
    @inline def listParentsFuture(params: ListParentsRequest): Future[ListParentsResponse] = service.listParents(params).promise().toFuture
    @inline def listPoliciesForTargetFuture(params: ListPoliciesForTargetRequest): Future[ListPoliciesForTargetResponse] = service.listPoliciesForTarget(params).promise().toFuture
    @inline def listPoliciesFuture(params: ListPoliciesRequest): Future[ListPoliciesResponse] = service.listPolicies(params).promise().toFuture
    @inline def listRootsFuture(params: ListRootsRequest): Future[ListRootsResponse] = service.listRoots(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listTargetsForPolicyFuture(params: ListTargetsForPolicyRequest): Future[ListTargetsForPolicyResponse] = service.listTargetsForPolicy(params).promise().toFuture
    @inline def moveAccountFuture(params: MoveAccountRequest): Future[js.Object] = service.moveAccount(params).promise().toFuture
    @inline def registerDelegatedAdministratorFuture(params: RegisterDelegatedAdministratorRequest): Future[js.Object] = service.registerDelegatedAdministrator(params).promise().toFuture
    @inline def removeAccountFromOrganizationFuture(params: RemoveAccountFromOrganizationRequest): Future[js.Object] = service.removeAccountFromOrganization(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateOrganizationalUnitFuture(params: UpdateOrganizationalUnitRequest): Future[UpdateOrganizationalUnitResponse] = service.updateOrganizationalUnit(params).promise().toFuture
    @inline def updatePolicyFuture(params: UpdatePolicyRequest): Future[UpdatePolicyResponse] = service.updatePolicy(params).promise().toFuture
  }
}

package organizations {
  @js.native
  @JSImport("aws-sdk", "Organizations", "AWS.Organizations")
  class Organizations() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptHandshake(params: AcceptHandshakeRequest): Request[AcceptHandshakeResponse] = js.native
    def attachPolicy(params: AttachPolicyRequest): Request[js.Object] = js.native
    def cancelHandshake(params: CancelHandshakeRequest): Request[CancelHandshakeResponse] = js.native
    def createAccount(params: CreateAccountRequest): Request[CreateAccountResponse] = js.native
    def createGovCloudAccount(params: CreateGovCloudAccountRequest): Request[CreateGovCloudAccountResponse] = js.native
    def createOrganization(params: CreateOrganizationRequest): Request[CreateOrganizationResponse] = js.native
    def createOrganizationalUnit(params: CreateOrganizationalUnitRequest): Request[CreateOrganizationalUnitResponse] = js.native
    def createPolicy(params: CreatePolicyRequest): Request[CreatePolicyResponse] = js.native
    def declineHandshake(params: DeclineHandshakeRequest): Request[DeclineHandshakeResponse] = js.native
    def deleteOrganization(): Request[js.Object] = js.native
    def deleteOrganizationalUnit(params: DeleteOrganizationalUnitRequest): Request[js.Object] = js.native
    def deletePolicy(params: DeletePolicyRequest): Request[js.Object] = js.native
    def deregisterDelegatedAdministrator(params: DeregisterDelegatedAdministratorRequest): Request[js.Object] = js.native
    def describeAccount(params: DescribeAccountRequest): Request[DescribeAccountResponse] = js.native
    def describeCreateAccountStatus(params: DescribeCreateAccountStatusRequest): Request[DescribeCreateAccountStatusResponse] = js.native
    def describeEffectivePolicy(params: DescribeEffectivePolicyRequest): Request[DescribeEffectivePolicyResponse] = js.native
    def describeHandshake(params: DescribeHandshakeRequest): Request[DescribeHandshakeResponse] = js.native
    def describeOrganization(): Request[DescribeOrganizationResponse] = js.native
    def describeOrganizationalUnit(params: DescribeOrganizationalUnitRequest): Request[DescribeOrganizationalUnitResponse] = js.native
    def describePolicy(params: DescribePolicyRequest): Request[DescribePolicyResponse] = js.native
    def detachPolicy(params: DetachPolicyRequest): Request[js.Object] = js.native
    def disableAWSServiceAccess(params: DisableAWSServiceAccessRequest): Request[js.Object] = js.native
    def disablePolicyType(params: DisablePolicyTypeRequest): Request[DisablePolicyTypeResponse] = js.native
    def enableAWSServiceAccess(params: EnableAWSServiceAccessRequest): Request[js.Object] = js.native
    def enableAllFeatures(params: EnableAllFeaturesRequest): Request[EnableAllFeaturesResponse] = js.native
    def enablePolicyType(params: EnablePolicyTypeRequest): Request[EnablePolicyTypeResponse] = js.native
    def inviteAccountToOrganization(params: InviteAccountToOrganizationRequest): Request[InviteAccountToOrganizationResponse] = js.native
    def leaveOrganization(): Request[js.Object] = js.native
    def listAWSServiceAccessForOrganization(params: ListAWSServiceAccessForOrganizationRequest): Request[ListAWSServiceAccessForOrganizationResponse] = js.native
    def listAccounts(params: ListAccountsRequest): Request[ListAccountsResponse] = js.native
    def listAccountsForParent(params: ListAccountsForParentRequest): Request[ListAccountsForParentResponse] = js.native
    def listChildren(params: ListChildrenRequest): Request[ListChildrenResponse] = js.native
    def listCreateAccountStatus(params: ListCreateAccountStatusRequest): Request[ListCreateAccountStatusResponse] = js.native
    def listDelegatedAdministrators(params: ListDelegatedAdministratorsRequest): Request[ListDelegatedAdministratorsResponse] = js.native
    def listDelegatedServicesForAccount(params: ListDelegatedServicesForAccountRequest): Request[ListDelegatedServicesForAccountResponse] = js.native
    def listHandshakesForAccount(params: ListHandshakesForAccountRequest): Request[ListHandshakesForAccountResponse] = js.native
    def listHandshakesForOrganization(params: ListHandshakesForOrganizationRequest): Request[ListHandshakesForOrganizationResponse] = js.native
    def listOrganizationalUnitsForParent(params: ListOrganizationalUnitsForParentRequest): Request[ListOrganizationalUnitsForParentResponse] = js.native
    def listParents(params: ListParentsRequest): Request[ListParentsResponse] = js.native
    def listPolicies(params: ListPoliciesRequest): Request[ListPoliciesResponse] = js.native
    def listPoliciesForTarget(params: ListPoliciesForTargetRequest): Request[ListPoliciesForTargetResponse] = js.native
    def listRoots(params: ListRootsRequest): Request[ListRootsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTargetsForPolicy(params: ListTargetsForPolicyRequest): Request[ListTargetsForPolicyResponse] = js.native
    def moveAccount(params: MoveAccountRequest): Request[js.Object] = js.native
    def registerDelegatedAdministrator(params: RegisterDelegatedAdministratorRequest): Request[js.Object] = js.native
    def removeAccountFromOrganization(params: RemoveAccountFromOrganizationRequest): Request[js.Object] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateOrganizationalUnit(params: UpdateOrganizationalUnitRequest): Request[UpdateOrganizationalUnitResponse] = js.native
    def updatePolicy(params: UpdatePolicyRequest): Request[UpdatePolicyResponse] = js.native
  }

  @js.native
  trait AcceptHandshakeRequest extends js.Object {
    var HandshakeId: HandshakeId
  }

  object AcceptHandshakeRequest {
    @inline
    def apply(
        HandshakeId: HandshakeId
    ): AcceptHandshakeRequest = {
      val __obj = js.Dynamic.literal(
        "HandshakeId" -> HandshakeId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AcceptHandshakeRequest]
    }
  }

  @js.native
  trait AcceptHandshakeResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  object AcceptHandshakeResponse {
    @inline
    def apply(
        Handshake: js.UndefOr[Handshake] = js.undefined
    ): AcceptHandshakeResponse = {
      val __obj = js.Dynamic.literal()
      Handshake.foreach(__v => __obj.updateDynamic("Handshake")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcceptHandshakeResponse]
    }
  }

  /**
    * Contains information about an AWS account that is a member of an organization.
    */
  @js.native
  trait Account extends js.Object {
    var Arn: js.UndefOr[AccountArn]
    var Email: js.UndefOr[Email]
    var Id: js.UndefOr[AccountId]
    var JoinedMethod: js.UndefOr[AccountJoinedMethod]
    var JoinedTimestamp: js.UndefOr[Timestamp]
    var Name: js.UndefOr[AccountName]
    var Status: js.UndefOr[AccountStatus]
  }

  object Account {
    @inline
    def apply(
        Arn: js.UndefOr[AccountArn] = js.undefined,
        Email: js.UndefOr[Email] = js.undefined,
        Id: js.UndefOr[AccountId] = js.undefined,
        JoinedMethod: js.UndefOr[AccountJoinedMethod] = js.undefined,
        JoinedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[AccountName] = js.undefined,
        Status: js.UndefOr[AccountStatus] = js.undefined
    ): Account = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      JoinedMethod.foreach(__v => __obj.updateDynamic("JoinedMethod")(__v.asInstanceOf[js.Any]))
      JoinedTimestamp.foreach(__v => __obj.updateDynamic("JoinedTimestamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Account]
    }
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
    val ACTIVE = "ACTIVE".asInstanceOf[AccountStatus]
    val SUSPENDED = "SUSPENDED".asInstanceOf[AccountStatus]

    val values = js.Object.freeze(js.Array(ACTIVE, SUSPENDED))
  }

  @js.native
  sealed trait ActionType extends js.Any
  object ActionType extends js.Object {
    val INVITE = "INVITE".asInstanceOf[ActionType]
    val ENABLE_ALL_FEATURES = "ENABLE_ALL_FEATURES".asInstanceOf[ActionType]
    val APPROVE_ALL_FEATURES = "APPROVE_ALL_FEATURES".asInstanceOf[ActionType]
    val ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE = "ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE".asInstanceOf[ActionType]

    val values = js.Object.freeze(js.Array(INVITE, ENABLE_ALL_FEATURES, APPROVE_ALL_FEATURES, ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE))
  }

  @js.native
  trait AttachPolicyRequest extends js.Object {
    var PolicyId: PolicyId
    var TargetId: PolicyTargetId
  }

  object AttachPolicyRequest {
    @inline
    def apply(
        PolicyId: PolicyId,
        TargetId: PolicyTargetId
    ): AttachPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "PolicyId" -> PolicyId.asInstanceOf[js.Any],
        "TargetId" -> TargetId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttachPolicyRequest]
    }
  }

  @js.native
  trait CancelHandshakeRequest extends js.Object {
    var HandshakeId: HandshakeId
  }

  object CancelHandshakeRequest {
    @inline
    def apply(
        HandshakeId: HandshakeId
    ): CancelHandshakeRequest = {
      val __obj = js.Dynamic.literal(
        "HandshakeId" -> HandshakeId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelHandshakeRequest]
    }
  }

  @js.native
  trait CancelHandshakeResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  object CancelHandshakeResponse {
    @inline
    def apply(
        Handshake: js.UndefOr[Handshake] = js.undefined
    ): CancelHandshakeResponse = {
      val __obj = js.Dynamic.literal()
      Handshake.foreach(__v => __obj.updateDynamic("Handshake")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelHandshakeResponse]
    }
  }

  /**
    * Contains a list of child entities, either OUs or accounts.
    */
  @js.native
  trait Child extends js.Object {
    var Id: js.UndefOr[ChildId]
    var Type: js.UndefOr[ChildType]
  }

  object Child {
    @inline
    def apply(
        Id: js.UndefOr[ChildId] = js.undefined,
        Type: js.UndefOr[ChildType] = js.undefined
    ): Child = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Child]
    }
  }

  @js.native
  sealed trait ChildType extends js.Any
  object ChildType extends js.Object {
    val ACCOUNT = "ACCOUNT".asInstanceOf[ChildType]
    val ORGANIZATIONAL_UNIT = "ORGANIZATIONAL_UNIT".asInstanceOf[ChildType]

    val values = js.Object.freeze(js.Array(ACCOUNT, ORGANIZATIONAL_UNIT))
  }

  @js.native
  sealed trait CreateAccountFailureReason extends js.Any
  object CreateAccountFailureReason extends js.Object {
    val ACCOUNT_LIMIT_EXCEEDED = "ACCOUNT_LIMIT_EXCEEDED".asInstanceOf[CreateAccountFailureReason]
    val EMAIL_ALREADY_EXISTS = "EMAIL_ALREADY_EXISTS".asInstanceOf[CreateAccountFailureReason]
    val INVALID_ADDRESS = "INVALID_ADDRESS".asInstanceOf[CreateAccountFailureReason]
    val INVALID_EMAIL = "INVALID_EMAIL".asInstanceOf[CreateAccountFailureReason]
    val CONCURRENT_ACCOUNT_MODIFICATION = "CONCURRENT_ACCOUNT_MODIFICATION".asInstanceOf[CreateAccountFailureReason]
    val INTERNAL_FAILURE = "INTERNAL_FAILURE".asInstanceOf[CreateAccountFailureReason]
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
  trait CreateAccountRequest extends js.Object {
    var AccountName: AccountName
    var Email: Email
    var IamUserAccessToBilling: js.UndefOr[IAMUserAccessToBilling]
    var RoleName: js.UndefOr[RoleName]
  }

  object CreateAccountRequest {
    @inline
    def apply(
        AccountName: AccountName,
        Email: Email,
        IamUserAccessToBilling: js.UndefOr[IAMUserAccessToBilling] = js.undefined,
        RoleName: js.UndefOr[RoleName] = js.undefined
    ): CreateAccountRequest = {
      val __obj = js.Dynamic.literal(
        "AccountName" -> AccountName.asInstanceOf[js.Any],
        "Email" -> Email.asInstanceOf[js.Any]
      )

      IamUserAccessToBilling.foreach(__v => __obj.updateDynamic("IamUserAccessToBilling")(__v.asInstanceOf[js.Any]))
      RoleName.foreach(__v => __obj.updateDynamic("RoleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAccountRequest]
    }
  }

  @js.native
  trait CreateAccountResponse extends js.Object {
    var CreateAccountStatus: js.UndefOr[CreateAccountStatus]
  }

  object CreateAccountResponse {
    @inline
    def apply(
        CreateAccountStatus: js.UndefOr[CreateAccountStatus] = js.undefined
    ): CreateAccountResponse = {
      val __obj = js.Dynamic.literal()
      CreateAccountStatus.foreach(__v => __obj.updateDynamic("CreateAccountStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAccountResponse]
    }
  }

  @js.native
  sealed trait CreateAccountState extends js.Any
  object CreateAccountState extends js.Object {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[CreateAccountState]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[CreateAccountState]
    val FAILED = "FAILED".asInstanceOf[CreateAccountState]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, SUCCEEDED, FAILED))
  }

  /**
    * Contains the status about a <a>CreateAccount</a> or <a>CreateGovCloudAccount</a> request to create an AWS account or an AWS GovCloud (US) account in an organization.
    */
  @js.native
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

  object CreateAccountStatus {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        AccountName: js.UndefOr[AccountName] = js.undefined,
        CompletedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        FailureReason: js.UndefOr[CreateAccountFailureReason] = js.undefined,
        GovCloudAccountId: js.UndefOr[AccountId] = js.undefined,
        Id: js.UndefOr[CreateAccountRequestId] = js.undefined,
        RequestedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        State: js.UndefOr[CreateAccountState] = js.undefined
    ): CreateAccountStatus = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      AccountName.foreach(__v => __obj.updateDynamic("AccountName")(__v.asInstanceOf[js.Any]))
      CompletedTimestamp.foreach(__v => __obj.updateDynamic("CompletedTimestamp")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      GovCloudAccountId.foreach(__v => __obj.updateDynamic("GovCloudAccountId")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      RequestedTimestamp.foreach(__v => __obj.updateDynamic("RequestedTimestamp")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAccountStatus]
    }
  }

  @js.native
  trait CreateGovCloudAccountRequest extends js.Object {
    var AccountName: AccountName
    var Email: Email
    var IamUserAccessToBilling: js.UndefOr[IAMUserAccessToBilling]
    var RoleName: js.UndefOr[RoleName]
  }

  object CreateGovCloudAccountRequest {
    @inline
    def apply(
        AccountName: AccountName,
        Email: Email,
        IamUserAccessToBilling: js.UndefOr[IAMUserAccessToBilling] = js.undefined,
        RoleName: js.UndefOr[RoleName] = js.undefined
    ): CreateGovCloudAccountRequest = {
      val __obj = js.Dynamic.literal(
        "AccountName" -> AccountName.asInstanceOf[js.Any],
        "Email" -> Email.asInstanceOf[js.Any]
      )

      IamUserAccessToBilling.foreach(__v => __obj.updateDynamic("IamUserAccessToBilling")(__v.asInstanceOf[js.Any]))
      RoleName.foreach(__v => __obj.updateDynamic("RoleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGovCloudAccountRequest]
    }
  }

  @js.native
  trait CreateGovCloudAccountResponse extends js.Object {
    var CreateAccountStatus: js.UndefOr[CreateAccountStatus]
  }

  object CreateGovCloudAccountResponse {
    @inline
    def apply(
        CreateAccountStatus: js.UndefOr[CreateAccountStatus] = js.undefined
    ): CreateGovCloudAccountResponse = {
      val __obj = js.Dynamic.literal()
      CreateAccountStatus.foreach(__v => __obj.updateDynamic("CreateAccountStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGovCloudAccountResponse]
    }
  }

  @js.native
  trait CreateOrganizationRequest extends js.Object {
    var FeatureSet: js.UndefOr[OrganizationFeatureSet]
  }

  object CreateOrganizationRequest {
    @inline
    def apply(
        FeatureSet: js.UndefOr[OrganizationFeatureSet] = js.undefined
    ): CreateOrganizationRequest = {
      val __obj = js.Dynamic.literal()
      FeatureSet.foreach(__v => __obj.updateDynamic("FeatureSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOrganizationRequest]
    }
  }

  @js.native
  trait CreateOrganizationResponse extends js.Object {
    var Organization: js.UndefOr[Organization]
  }

  object CreateOrganizationResponse {
    @inline
    def apply(
        Organization: js.UndefOr[Organization] = js.undefined
    ): CreateOrganizationResponse = {
      val __obj = js.Dynamic.literal()
      Organization.foreach(__v => __obj.updateDynamic("Organization")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOrganizationResponse]
    }
  }

  @js.native
  trait CreateOrganizationalUnitRequest extends js.Object {
    var Name: OrganizationalUnitName
    var ParentId: ParentId
  }

  object CreateOrganizationalUnitRequest {
    @inline
    def apply(
        Name: OrganizationalUnitName,
        ParentId: ParentId
    ): CreateOrganizationalUnitRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "ParentId" -> ParentId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateOrganizationalUnitRequest]
    }
  }

  @js.native
  trait CreateOrganizationalUnitResponse extends js.Object {
    var OrganizationalUnit: js.UndefOr[OrganizationalUnit]
  }

  object CreateOrganizationalUnitResponse {
    @inline
    def apply(
        OrganizationalUnit: js.UndefOr[OrganizationalUnit] = js.undefined
    ): CreateOrganizationalUnitResponse = {
      val __obj = js.Dynamic.literal()
      OrganizationalUnit.foreach(__v => __obj.updateDynamic("OrganizationalUnit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOrganizationalUnitResponse]
    }
  }

  @js.native
  trait CreatePolicyRequest extends js.Object {
    var Content: PolicyContent
    var Description: PolicyDescription
    var Name: PolicyName
    var Type: PolicyType
  }

  object CreatePolicyRequest {
    @inline
    def apply(
        Content: PolicyContent,
        Description: PolicyDescription,
        Name: PolicyName,
        Type: PolicyType
    ): CreatePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Content" -> Content.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreatePolicyRequest]
    }
  }

  @js.native
  trait CreatePolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  object CreatePolicyResponse {
    @inline
    def apply(
        Policy: js.UndefOr[Policy] = js.undefined
    ): CreatePolicyResponse = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePolicyResponse]
    }
  }

  @js.native
  trait DeclineHandshakeRequest extends js.Object {
    var HandshakeId: HandshakeId
  }

  object DeclineHandshakeRequest {
    @inline
    def apply(
        HandshakeId: HandshakeId
    ): DeclineHandshakeRequest = {
      val __obj = js.Dynamic.literal(
        "HandshakeId" -> HandshakeId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeclineHandshakeRequest]
    }
  }

  @js.native
  trait DeclineHandshakeResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  object DeclineHandshakeResponse {
    @inline
    def apply(
        Handshake: js.UndefOr[Handshake] = js.undefined
    ): DeclineHandshakeResponse = {
      val __obj = js.Dynamic.literal()
      Handshake.foreach(__v => __obj.updateDynamic("Handshake")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeclineHandshakeResponse]
    }
  }

  /**
    * Contains information about the delegated administrator.
    */
  @js.native
  trait DelegatedAdministrator extends js.Object {
    var Arn: js.UndefOr[AccountArn]
    var DelegationEnabledDate: js.UndefOr[Timestamp]
    var Email: js.UndefOr[Email]
    var Id: js.UndefOr[AccountId]
    var JoinedMethod: js.UndefOr[AccountJoinedMethod]
    var JoinedTimestamp: js.UndefOr[Timestamp]
    var Name: js.UndefOr[AccountName]
    var Status: js.UndefOr[AccountStatus]
  }

  object DelegatedAdministrator {
    @inline
    def apply(
        Arn: js.UndefOr[AccountArn] = js.undefined,
        DelegationEnabledDate: js.UndefOr[Timestamp] = js.undefined,
        Email: js.UndefOr[Email] = js.undefined,
        Id: js.UndefOr[AccountId] = js.undefined,
        JoinedMethod: js.UndefOr[AccountJoinedMethod] = js.undefined,
        JoinedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[AccountName] = js.undefined,
        Status: js.UndefOr[AccountStatus] = js.undefined
    ): DelegatedAdministrator = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      DelegationEnabledDate.foreach(__v => __obj.updateDynamic("DelegationEnabledDate")(__v.asInstanceOf[js.Any]))
      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      JoinedMethod.foreach(__v => __obj.updateDynamic("JoinedMethod")(__v.asInstanceOf[js.Any]))
      JoinedTimestamp.foreach(__v => __obj.updateDynamic("JoinedTimestamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DelegatedAdministrator]
    }
  }

  /**
    * Contains information about the AWS service for which the account is a delegated administrator.
    */
  @js.native
  trait DelegatedService extends js.Object {
    var DelegationEnabledDate: js.UndefOr[Timestamp]
    var ServicePrincipal: js.UndefOr[ServicePrincipal]
  }

  object DelegatedService {
    @inline
    def apply(
        DelegationEnabledDate: js.UndefOr[Timestamp] = js.undefined,
        ServicePrincipal: js.UndefOr[ServicePrincipal] = js.undefined
    ): DelegatedService = {
      val __obj = js.Dynamic.literal()
      DelegationEnabledDate.foreach(__v => __obj.updateDynamic("DelegationEnabledDate")(__v.asInstanceOf[js.Any]))
      ServicePrincipal.foreach(__v => __obj.updateDynamic("ServicePrincipal")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DelegatedService]
    }
  }

  @js.native
  trait DeleteOrganizationalUnitRequest extends js.Object {
    var OrganizationalUnitId: OrganizationalUnitId
  }

  object DeleteOrganizationalUnitRequest {
    @inline
    def apply(
        OrganizationalUnitId: OrganizationalUnitId
    ): DeleteOrganizationalUnitRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationalUnitId" -> OrganizationalUnitId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteOrganizationalUnitRequest]
    }
  }

  @js.native
  trait DeletePolicyRequest extends js.Object {
    var PolicyId: PolicyId
  }

  object DeletePolicyRequest {
    @inline
    def apply(
        PolicyId: PolicyId
    ): DeletePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "PolicyId" -> PolicyId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePolicyRequest]
    }
  }

  @js.native
  trait DeregisterDelegatedAdministratorRequest extends js.Object {
    var AccountId: AccountId
    var ServicePrincipal: ServicePrincipal
  }

  object DeregisterDelegatedAdministratorRequest {
    @inline
    def apply(
        AccountId: AccountId,
        ServicePrincipal: ServicePrincipal
    ): DeregisterDelegatedAdministratorRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "ServicePrincipal" -> ServicePrincipal.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeregisterDelegatedAdministratorRequest]
    }
  }

  @js.native
  trait DescribeAccountRequest extends js.Object {
    var AccountId: AccountId
  }

  object DescribeAccountRequest {
    @inline
    def apply(
        AccountId: AccountId
    ): DescribeAccountRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeAccountRequest]
    }
  }

  @js.native
  trait DescribeAccountResponse extends js.Object {
    var Account: js.UndefOr[Account]
  }

  object DescribeAccountResponse {
    @inline
    def apply(
        Account: js.UndefOr[Account] = js.undefined
    ): DescribeAccountResponse = {
      val __obj = js.Dynamic.literal()
      Account.foreach(__v => __obj.updateDynamic("Account")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountResponse]
    }
  }

  @js.native
  trait DescribeCreateAccountStatusRequest extends js.Object {
    var CreateAccountRequestId: CreateAccountRequestId
  }

  object DescribeCreateAccountStatusRequest {
    @inline
    def apply(
        CreateAccountRequestId: CreateAccountRequestId
    ): DescribeCreateAccountStatusRequest = {
      val __obj = js.Dynamic.literal(
        "CreateAccountRequestId" -> CreateAccountRequestId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeCreateAccountStatusRequest]
    }
  }

  @js.native
  trait DescribeCreateAccountStatusResponse extends js.Object {
    var CreateAccountStatus: js.UndefOr[CreateAccountStatus]
  }

  object DescribeCreateAccountStatusResponse {
    @inline
    def apply(
        CreateAccountStatus: js.UndefOr[CreateAccountStatus] = js.undefined
    ): DescribeCreateAccountStatusResponse = {
      val __obj = js.Dynamic.literal()
      CreateAccountStatus.foreach(__v => __obj.updateDynamic("CreateAccountStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCreateAccountStatusResponse]
    }
  }

  @js.native
  trait DescribeEffectivePolicyRequest extends js.Object {
    var PolicyType: EffectivePolicyType
    var TargetId: js.UndefOr[PolicyTargetId]
  }

  object DescribeEffectivePolicyRequest {
    @inline
    def apply(
        PolicyType: EffectivePolicyType,
        TargetId: js.UndefOr[PolicyTargetId] = js.undefined
    ): DescribeEffectivePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "PolicyType" -> PolicyType.asInstanceOf[js.Any]
      )

      TargetId.foreach(__v => __obj.updateDynamic("TargetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEffectivePolicyRequest]
    }
  }

  @js.native
  trait DescribeEffectivePolicyResponse extends js.Object {
    var EffectivePolicy: js.UndefOr[EffectivePolicy]
  }

  object DescribeEffectivePolicyResponse {
    @inline
    def apply(
        EffectivePolicy: js.UndefOr[EffectivePolicy] = js.undefined
    ): DescribeEffectivePolicyResponse = {
      val __obj = js.Dynamic.literal()
      EffectivePolicy.foreach(__v => __obj.updateDynamic("EffectivePolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEffectivePolicyResponse]
    }
  }

  @js.native
  trait DescribeHandshakeRequest extends js.Object {
    var HandshakeId: HandshakeId
  }

  object DescribeHandshakeRequest {
    @inline
    def apply(
        HandshakeId: HandshakeId
    ): DescribeHandshakeRequest = {
      val __obj = js.Dynamic.literal(
        "HandshakeId" -> HandshakeId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeHandshakeRequest]
    }
  }

  @js.native
  trait DescribeHandshakeResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  object DescribeHandshakeResponse {
    @inline
    def apply(
        Handshake: js.UndefOr[Handshake] = js.undefined
    ): DescribeHandshakeResponse = {
      val __obj = js.Dynamic.literal()
      Handshake.foreach(__v => __obj.updateDynamic("Handshake")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeHandshakeResponse]
    }
  }

  @js.native
  trait DescribeOrganizationResponse extends js.Object {
    var Organization: js.UndefOr[Organization]
  }

  object DescribeOrganizationResponse {
    @inline
    def apply(
        Organization: js.UndefOr[Organization] = js.undefined
    ): DescribeOrganizationResponse = {
      val __obj = js.Dynamic.literal()
      Organization.foreach(__v => __obj.updateDynamic("Organization")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOrganizationResponse]
    }
  }

  @js.native
  trait DescribeOrganizationalUnitRequest extends js.Object {
    var OrganizationalUnitId: OrganizationalUnitId
  }

  object DescribeOrganizationalUnitRequest {
    @inline
    def apply(
        OrganizationalUnitId: OrganizationalUnitId
    ): DescribeOrganizationalUnitRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationalUnitId" -> OrganizationalUnitId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeOrganizationalUnitRequest]
    }
  }

  @js.native
  trait DescribeOrganizationalUnitResponse extends js.Object {
    var OrganizationalUnit: js.UndefOr[OrganizationalUnit]
  }

  object DescribeOrganizationalUnitResponse {
    @inline
    def apply(
        OrganizationalUnit: js.UndefOr[OrganizationalUnit] = js.undefined
    ): DescribeOrganizationalUnitResponse = {
      val __obj = js.Dynamic.literal()
      OrganizationalUnit.foreach(__v => __obj.updateDynamic("OrganizationalUnit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOrganizationalUnitResponse]
    }
  }

  @js.native
  trait DescribePolicyRequest extends js.Object {
    var PolicyId: PolicyId
  }

  object DescribePolicyRequest {
    @inline
    def apply(
        PolicyId: PolicyId
    ): DescribePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "PolicyId" -> PolicyId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribePolicyRequest]
    }
  }

  @js.native
  trait DescribePolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  object DescribePolicyResponse {
    @inline
    def apply(
        Policy: js.UndefOr[Policy] = js.undefined
    ): DescribePolicyResponse = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePolicyResponse]
    }
  }

  @js.native
  trait DetachPolicyRequest extends js.Object {
    var PolicyId: PolicyId
    var TargetId: PolicyTargetId
  }

  object DetachPolicyRequest {
    @inline
    def apply(
        PolicyId: PolicyId,
        TargetId: PolicyTargetId
    ): DetachPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "PolicyId" -> PolicyId.asInstanceOf[js.Any],
        "TargetId" -> TargetId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetachPolicyRequest]
    }
  }

  @js.native
  trait DisableAWSServiceAccessRequest extends js.Object {
    var ServicePrincipal: ServicePrincipal
  }

  object DisableAWSServiceAccessRequest {
    @inline
    def apply(
        ServicePrincipal: ServicePrincipal
    ): DisableAWSServiceAccessRequest = {
      val __obj = js.Dynamic.literal(
        "ServicePrincipal" -> ServicePrincipal.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisableAWSServiceAccessRequest]
    }
  }

  @js.native
  trait DisablePolicyTypeRequest extends js.Object {
    var PolicyType: PolicyType
    var RootId: RootId
  }

  object DisablePolicyTypeRequest {
    @inline
    def apply(
        PolicyType: PolicyType,
        RootId: RootId
    ): DisablePolicyTypeRequest = {
      val __obj = js.Dynamic.literal(
        "PolicyType" -> PolicyType.asInstanceOf[js.Any],
        "RootId" -> RootId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisablePolicyTypeRequest]
    }
  }

  @js.native
  trait DisablePolicyTypeResponse extends js.Object {
    var Root: js.UndefOr[Root]
  }

  object DisablePolicyTypeResponse {
    @inline
    def apply(
        Root: js.UndefOr[Root] = js.undefined
    ): DisablePolicyTypeResponse = {
      val __obj = js.Dynamic.literal()
      Root.foreach(__v => __obj.updateDynamic("Root")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisablePolicyTypeResponse]
    }
  }

  /**
    * Contains rules to be applied to the affected accounts. The effective policy is the aggregation of any policies the account inherits, plus any policy directly attached to the account.
    */
  @js.native
  trait EffectivePolicy extends js.Object {
    var LastUpdatedTimestamp: js.UndefOr[Timestamp]
    var PolicyContent: js.UndefOr[PolicyContent]
    var PolicyType: js.UndefOr[EffectivePolicyType]
    var TargetId: js.UndefOr[PolicyTargetId]
  }

  object EffectivePolicy {
    @inline
    def apply(
        LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        PolicyContent: js.UndefOr[PolicyContent] = js.undefined,
        PolicyType: js.UndefOr[EffectivePolicyType] = js.undefined,
        TargetId: js.UndefOr[PolicyTargetId] = js.undefined
    ): EffectivePolicy = {
      val __obj = js.Dynamic.literal()
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      PolicyContent.foreach(__v => __obj.updateDynamic("PolicyContent")(__v.asInstanceOf[js.Any]))
      PolicyType.foreach(__v => __obj.updateDynamic("PolicyType")(__v.asInstanceOf[js.Any]))
      TargetId.foreach(__v => __obj.updateDynamic("TargetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EffectivePolicy]
    }
  }

  @js.native
  sealed trait EffectivePolicyType extends js.Any
  object EffectivePolicyType extends js.Object {
    val TAG_POLICY = "TAG_POLICY".asInstanceOf[EffectivePolicyType]
    val BACKUP_POLICY = "BACKUP_POLICY".asInstanceOf[EffectivePolicyType]
    val AISERVICES_OPT_OUT_POLICY = "AISERVICES_OPT_OUT_POLICY".asInstanceOf[EffectivePolicyType]

    val values = js.Object.freeze(js.Array(TAG_POLICY, BACKUP_POLICY, AISERVICES_OPT_OUT_POLICY))
  }

  @js.native
  trait EnableAWSServiceAccessRequest extends js.Object {
    var ServicePrincipal: ServicePrincipal
  }

  object EnableAWSServiceAccessRequest {
    @inline
    def apply(
        ServicePrincipal: ServicePrincipal
    ): EnableAWSServiceAccessRequest = {
      val __obj = js.Dynamic.literal(
        "ServicePrincipal" -> ServicePrincipal.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EnableAWSServiceAccessRequest]
    }
  }

  @js.native
  trait EnableAllFeaturesRequest extends js.Object {}

  object EnableAllFeaturesRequest {
    @inline
    def apply(
    ): EnableAllFeaturesRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[EnableAllFeaturesRequest]
    }
  }

  @js.native
  trait EnableAllFeaturesResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  object EnableAllFeaturesResponse {
    @inline
    def apply(
        Handshake: js.UndefOr[Handshake] = js.undefined
    ): EnableAllFeaturesResponse = {
      val __obj = js.Dynamic.literal()
      Handshake.foreach(__v => __obj.updateDynamic("Handshake")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableAllFeaturesResponse]
    }
  }

  @js.native
  trait EnablePolicyTypeRequest extends js.Object {
    var PolicyType: PolicyType
    var RootId: RootId
  }

  object EnablePolicyTypeRequest {
    @inline
    def apply(
        PolicyType: PolicyType,
        RootId: RootId
    ): EnablePolicyTypeRequest = {
      val __obj = js.Dynamic.literal(
        "PolicyType" -> PolicyType.asInstanceOf[js.Any],
        "RootId" -> RootId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EnablePolicyTypeRequest]
    }
  }

  @js.native
  trait EnablePolicyTypeResponse extends js.Object {
    var Root: js.UndefOr[Root]
  }

  object EnablePolicyTypeResponse {
    @inline
    def apply(
        Root: js.UndefOr[Root] = js.undefined
    ): EnablePolicyTypeResponse = {
      val __obj = js.Dynamic.literal()
      Root.foreach(__v => __obj.updateDynamic("Root")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnablePolicyTypeResponse]
    }
  }

  /**
    * A structure that contains details of a service principal that represents an AWS service that is enabled to integrate with AWS Organizations.
    */
  @js.native
  trait EnabledServicePrincipal extends js.Object {
    var DateEnabled: js.UndefOr[Timestamp]
    var ServicePrincipal: js.UndefOr[ServicePrincipal]
  }

  object EnabledServicePrincipal {
    @inline
    def apply(
        DateEnabled: js.UndefOr[Timestamp] = js.undefined,
        ServicePrincipal: js.UndefOr[ServicePrincipal] = js.undefined
    ): EnabledServicePrincipal = {
      val __obj = js.Dynamic.literal()
      DateEnabled.foreach(__v => __obj.updateDynamic("DateEnabled")(__v.asInstanceOf[js.Any]))
      ServicePrincipal.foreach(__v => __obj.updateDynamic("ServicePrincipal")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnabledServicePrincipal]
    }
  }

  /**
    * Contains information that must be exchanged to securely establish a relationship between two accounts (an <i>originator</i> and a <i>recipient</i>). For example, when a master account (the originator) invites another account (the recipient) to join its organization, the two accounts exchange information as a series of handshake requests and responses.
    *  ```Note:``` Handshakes that are CANCELED, ACCEPTED, or DECLINED show up in lists for only 30 days after entering that state After that they are deleted.
    */
  @js.native
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

  object Handshake {
    @inline
    def apply(
        Action: js.UndefOr[ActionType] = js.undefined,
        Arn: js.UndefOr[HandshakeArn] = js.undefined,
        ExpirationTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Id: js.UndefOr[HandshakeId] = js.undefined,
        Parties: js.UndefOr[HandshakeParties] = js.undefined,
        RequestedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Resources: js.UndefOr[HandshakeResources] = js.undefined,
        State: js.UndefOr[HandshakeState] = js.undefined
    ): Handshake = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ExpirationTimestamp.foreach(__v => __obj.updateDynamic("ExpirationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Parties.foreach(__v => __obj.updateDynamic("Parties")(__v.asInstanceOf[js.Any]))
      RequestedTimestamp.foreach(__v => __obj.updateDynamic("RequestedTimestamp")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Handshake]
    }
  }

  /**
    * Specifies the criteria that are used to select the handshakes for the operation.
    */
  @js.native
  trait HandshakeFilter extends js.Object {
    var ActionType: js.UndefOr[ActionType]
    var ParentHandshakeId: js.UndefOr[HandshakeId]
  }

  object HandshakeFilter {
    @inline
    def apply(
        ActionType: js.UndefOr[ActionType] = js.undefined,
        ParentHandshakeId: js.UndefOr[HandshakeId] = js.undefined
    ): HandshakeFilter = {
      val __obj = js.Dynamic.literal()
      ActionType.foreach(__v => __obj.updateDynamic("ActionType")(__v.asInstanceOf[js.Any]))
      ParentHandshakeId.foreach(__v => __obj.updateDynamic("ParentHandshakeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HandshakeFilter]
    }
  }

  /**
    * Identifies a participant in a handshake.
    */
  @js.native
  trait HandshakeParty extends js.Object {
    var Id: HandshakePartyId
    var Type: HandshakePartyType
  }

  object HandshakeParty {
    @inline
    def apply(
        Id: HandshakePartyId,
        Type: HandshakePartyType
    ): HandshakeParty = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[HandshakeParty]
    }
  }

  @js.native
  sealed trait HandshakePartyType extends js.Any
  object HandshakePartyType extends js.Object {
    val ACCOUNT = "ACCOUNT".asInstanceOf[HandshakePartyType]
    val ORGANIZATION = "ORGANIZATION".asInstanceOf[HandshakePartyType]
    val EMAIL = "EMAIL".asInstanceOf[HandshakePartyType]

    val values = js.Object.freeze(js.Array(ACCOUNT, ORGANIZATION, EMAIL))
  }

  /**
    * Contains additional data that is needed to process a handshake.
    */
  @js.native
  trait HandshakeResource extends js.Object {
    var Resources: js.UndefOr[HandshakeResources]
    var Type: js.UndefOr[HandshakeResourceType]
    var Value: js.UndefOr[HandshakeResourceValue]
  }

  object HandshakeResource {
    @inline
    def apply(
        Resources: js.UndefOr[HandshakeResources] = js.undefined,
        Type: js.UndefOr[HandshakeResourceType] = js.undefined,
        Value: js.UndefOr[HandshakeResourceValue] = js.undefined
    ): HandshakeResource = {
      val __obj = js.Dynamic.literal()
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HandshakeResource]
    }
  }

  @js.native
  sealed trait HandshakeResourceType extends js.Any
  object HandshakeResourceType extends js.Object {
    val ACCOUNT = "ACCOUNT".asInstanceOf[HandshakeResourceType]
    val ORGANIZATION = "ORGANIZATION".asInstanceOf[HandshakeResourceType]
    val ORGANIZATION_FEATURE_SET = "ORGANIZATION_FEATURE_SET".asInstanceOf[HandshakeResourceType]
    val EMAIL = "EMAIL".asInstanceOf[HandshakeResourceType]
    val MASTER_EMAIL = "MASTER_EMAIL".asInstanceOf[HandshakeResourceType]
    val MASTER_NAME = "MASTER_NAME".asInstanceOf[HandshakeResourceType]
    val NOTES = "NOTES".asInstanceOf[HandshakeResourceType]
    val PARENT_HANDSHAKE = "PARENT_HANDSHAKE".asInstanceOf[HandshakeResourceType]

    val values = js.Object.freeze(js.Array(ACCOUNT, ORGANIZATION, ORGANIZATION_FEATURE_SET, EMAIL, MASTER_EMAIL, MASTER_NAME, NOTES, PARENT_HANDSHAKE))
  }

  @js.native
  sealed trait HandshakeState extends js.Any
  object HandshakeState extends js.Object {
    val REQUESTED = "REQUESTED".asInstanceOf[HandshakeState]
    val OPEN = "OPEN".asInstanceOf[HandshakeState]
    val CANCELED = "CANCELED".asInstanceOf[HandshakeState]
    val ACCEPTED = "ACCEPTED".asInstanceOf[HandshakeState]
    val DECLINED = "DECLINED".asInstanceOf[HandshakeState]
    val EXPIRED = "EXPIRED".asInstanceOf[HandshakeState]

    val values = js.Object.freeze(js.Array(REQUESTED, OPEN, CANCELED, ACCEPTED, DECLINED, EXPIRED))
  }

  @js.native
  sealed trait IAMUserAccessToBilling extends js.Any
  object IAMUserAccessToBilling extends js.Object {
    val ALLOW = "ALLOW".asInstanceOf[IAMUserAccessToBilling]
    val DENY = "DENY".asInstanceOf[IAMUserAccessToBilling]

    val values = js.Object.freeze(js.Array(ALLOW, DENY))
  }

  @js.native
  trait InviteAccountToOrganizationRequest extends js.Object {
    var Target: HandshakeParty
    var Notes: js.UndefOr[HandshakeNotes]
  }

  object InviteAccountToOrganizationRequest {
    @inline
    def apply(
        Target: HandshakeParty,
        Notes: js.UndefOr[HandshakeNotes] = js.undefined
    ): InviteAccountToOrganizationRequest = {
      val __obj = js.Dynamic.literal(
        "Target" -> Target.asInstanceOf[js.Any]
      )

      Notes.foreach(__v => __obj.updateDynamic("Notes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InviteAccountToOrganizationRequest]
    }
  }

  @js.native
  trait InviteAccountToOrganizationResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  object InviteAccountToOrganizationResponse {
    @inline
    def apply(
        Handshake: js.UndefOr[Handshake] = js.undefined
    ): InviteAccountToOrganizationResponse = {
      val __obj = js.Dynamic.literal()
      Handshake.foreach(__v => __obj.updateDynamic("Handshake")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InviteAccountToOrganizationResponse]
    }
  }

  @js.native
  trait ListAWSServiceAccessForOrganizationRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAWSServiceAccessForOrganizationRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAWSServiceAccessForOrganizationRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAWSServiceAccessForOrganizationRequest]
    }
  }

  @js.native
  trait ListAWSServiceAccessForOrganizationResponse extends js.Object {
    var EnabledServicePrincipals: js.UndefOr[EnabledServicePrincipals]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAWSServiceAccessForOrganizationResponse {
    @inline
    def apply(
        EnabledServicePrincipals: js.UndefOr[EnabledServicePrincipals] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAWSServiceAccessForOrganizationResponse = {
      val __obj = js.Dynamic.literal()
      EnabledServicePrincipals.foreach(__v => __obj.updateDynamic("EnabledServicePrincipals")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAWSServiceAccessForOrganizationResponse]
    }
  }

  @js.native
  trait ListAccountsForParentRequest extends js.Object {
    var ParentId: ParentId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAccountsForParentRequest {
    @inline
    def apply(
        ParentId: ParentId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAccountsForParentRequest = {
      val __obj = js.Dynamic.literal(
        "ParentId" -> ParentId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountsForParentRequest]
    }
  }

  @js.native
  trait ListAccountsForParentResponse extends js.Object {
    var Accounts: js.UndefOr[Accounts]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAccountsForParentResponse {
    @inline
    def apply(
        Accounts: js.UndefOr[Accounts] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAccountsForParentResponse = {
      val __obj = js.Dynamic.literal()
      Accounts.foreach(__v => __obj.updateDynamic("Accounts")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountsForParentResponse]
    }
  }

  @js.native
  trait ListAccountsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAccountsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAccountsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountsRequest]
    }
  }

  @js.native
  trait ListAccountsResponse extends js.Object {
    var Accounts: js.UndefOr[Accounts]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAccountsResponse {
    @inline
    def apply(
        Accounts: js.UndefOr[Accounts] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAccountsResponse = {
      val __obj = js.Dynamic.literal()
      Accounts.foreach(__v => __obj.updateDynamic("Accounts")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountsResponse]
    }
  }

  @js.native
  trait ListChildrenRequest extends js.Object {
    var ChildType: ChildType
    var ParentId: ParentId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChildrenRequest {
    @inline
    def apply(
        ChildType: ChildType,
        ParentId: ParentId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChildrenRequest = {
      val __obj = js.Dynamic.literal(
        "ChildType" -> ChildType.asInstanceOf[js.Any],
        "ParentId" -> ParentId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChildrenRequest]
    }
  }

  @js.native
  trait ListChildrenResponse extends js.Object {
    var Children: js.UndefOr[Children]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChildrenResponse {
    @inline
    def apply(
        Children: js.UndefOr[Children] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChildrenResponse = {
      val __obj = js.Dynamic.literal()
      Children.foreach(__v => __obj.updateDynamic("Children")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChildrenResponse]
    }
  }

  @js.native
  trait ListCreateAccountStatusRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var States: js.UndefOr[CreateAccountStates]
  }

  object ListCreateAccountStatusRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        States: js.UndefOr[CreateAccountStates] = js.undefined
    ): ListCreateAccountStatusRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      States.foreach(__v => __obj.updateDynamic("States")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCreateAccountStatusRequest]
    }
  }

  @js.native
  trait ListCreateAccountStatusResponse extends js.Object {
    var CreateAccountStatuses: js.UndefOr[CreateAccountStatuses]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCreateAccountStatusResponse {
    @inline
    def apply(
        CreateAccountStatuses: js.UndefOr[CreateAccountStatuses] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCreateAccountStatusResponse = {
      val __obj = js.Dynamic.literal()
      CreateAccountStatuses.foreach(__v => __obj.updateDynamic("CreateAccountStatuses")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCreateAccountStatusResponse]
    }
  }

  @js.native
  trait ListDelegatedAdministratorsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ServicePrincipal: js.UndefOr[ServicePrincipal]
  }

  object ListDelegatedAdministratorsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ServicePrincipal: js.UndefOr[ServicePrincipal] = js.undefined
    ): ListDelegatedAdministratorsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ServicePrincipal.foreach(__v => __obj.updateDynamic("ServicePrincipal")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDelegatedAdministratorsRequest]
    }
  }

  @js.native
  trait ListDelegatedAdministratorsResponse extends js.Object {
    var DelegatedAdministrators: js.UndefOr[DelegatedAdministrators]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDelegatedAdministratorsResponse {
    @inline
    def apply(
        DelegatedAdministrators: js.UndefOr[DelegatedAdministrators] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDelegatedAdministratorsResponse = {
      val __obj = js.Dynamic.literal()
      DelegatedAdministrators.foreach(__v => __obj.updateDynamic("DelegatedAdministrators")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDelegatedAdministratorsResponse]
    }
  }

  @js.native
  trait ListDelegatedServicesForAccountRequest extends js.Object {
    var AccountId: AccountId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDelegatedServicesForAccountRequest {
    @inline
    def apply(
        AccountId: AccountId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDelegatedServicesForAccountRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDelegatedServicesForAccountRequest]
    }
  }

  @js.native
  trait ListDelegatedServicesForAccountResponse extends js.Object {
    var DelegatedServices: js.UndefOr[DelegatedServices]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDelegatedServicesForAccountResponse {
    @inline
    def apply(
        DelegatedServices: js.UndefOr[DelegatedServices] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDelegatedServicesForAccountResponse = {
      val __obj = js.Dynamic.literal()
      DelegatedServices.foreach(__v => __obj.updateDynamic("DelegatedServices")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDelegatedServicesForAccountResponse]
    }
  }

  @js.native
  trait ListHandshakesForAccountRequest extends js.Object {
    var Filter: js.UndefOr[HandshakeFilter]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHandshakesForAccountRequest {
    @inline
    def apply(
        Filter: js.UndefOr[HandshakeFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListHandshakesForAccountRequest = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHandshakesForAccountRequest]
    }
  }

  @js.native
  trait ListHandshakesForAccountResponse extends js.Object {
    var Handshakes: js.UndefOr[Handshakes]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHandshakesForAccountResponse {
    @inline
    def apply(
        Handshakes: js.UndefOr[Handshakes] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListHandshakesForAccountResponse = {
      val __obj = js.Dynamic.literal()
      Handshakes.foreach(__v => __obj.updateDynamic("Handshakes")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHandshakesForAccountResponse]
    }
  }

  @js.native
  trait ListHandshakesForOrganizationRequest extends js.Object {
    var Filter: js.UndefOr[HandshakeFilter]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHandshakesForOrganizationRequest {
    @inline
    def apply(
        Filter: js.UndefOr[HandshakeFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListHandshakesForOrganizationRequest = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHandshakesForOrganizationRequest]
    }
  }

  @js.native
  trait ListHandshakesForOrganizationResponse extends js.Object {
    var Handshakes: js.UndefOr[Handshakes]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHandshakesForOrganizationResponse {
    @inline
    def apply(
        Handshakes: js.UndefOr[Handshakes] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListHandshakesForOrganizationResponse = {
      val __obj = js.Dynamic.literal()
      Handshakes.foreach(__v => __obj.updateDynamic("Handshakes")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHandshakesForOrganizationResponse]
    }
  }

  @js.native
  trait ListOrganizationalUnitsForParentRequest extends js.Object {
    var ParentId: ParentId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListOrganizationalUnitsForParentRequest {
    @inline
    def apply(
        ParentId: ParentId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListOrganizationalUnitsForParentRequest = {
      val __obj = js.Dynamic.literal(
        "ParentId" -> ParentId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrganizationalUnitsForParentRequest]
    }
  }

  @js.native
  trait ListOrganizationalUnitsForParentResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var OrganizationalUnits: js.UndefOr[OrganizationalUnits]
  }

  object ListOrganizationalUnitsForParentResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        OrganizationalUnits: js.UndefOr[OrganizationalUnits] = js.undefined
    ): ListOrganizationalUnitsForParentResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OrganizationalUnits.foreach(__v => __obj.updateDynamic("OrganizationalUnits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrganizationalUnitsForParentResponse]
    }
  }

  @js.native
  trait ListParentsRequest extends js.Object {
    var ChildId: ChildId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListParentsRequest {
    @inline
    def apply(
        ChildId: ChildId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListParentsRequest = {
      val __obj = js.Dynamic.literal(
        "ChildId" -> ChildId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListParentsRequest]
    }
  }

  @js.native
  trait ListParentsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Parents: js.UndefOr[Parents]
  }

  object ListParentsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Parents: js.UndefOr[Parents] = js.undefined
    ): ListParentsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Parents.foreach(__v => __obj.updateDynamic("Parents")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListParentsResponse]
    }
  }

  @js.native
  trait ListPoliciesForTargetRequest extends js.Object {
    var Filter: PolicyType
    var TargetId: PolicyTargetId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPoliciesForTargetRequest {
    @inline
    def apply(
        Filter: PolicyType,
        TargetId: PolicyTargetId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPoliciesForTargetRequest = {
      val __obj = js.Dynamic.literal(
        "Filter" -> Filter.asInstanceOf[js.Any],
        "TargetId" -> TargetId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPoliciesForTargetRequest]
    }
  }

  @js.native
  trait ListPoliciesForTargetResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Policies: js.UndefOr[Policies]
  }

  object ListPoliciesForTargetResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Policies: js.UndefOr[Policies] = js.undefined
    ): ListPoliciesForTargetResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Policies.foreach(__v => __obj.updateDynamic("Policies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPoliciesForTargetResponse]
    }
  }

  @js.native
  trait ListPoliciesRequest extends js.Object {
    var Filter: PolicyType
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPoliciesRequest {
    @inline
    def apply(
        Filter: PolicyType,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPoliciesRequest = {
      val __obj = js.Dynamic.literal(
        "Filter" -> Filter.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPoliciesRequest]
    }
  }

  @js.native
  trait ListPoliciesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Policies: js.UndefOr[Policies]
  }

  object ListPoliciesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Policies: js.UndefOr[Policies] = js.undefined
    ): ListPoliciesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Policies.foreach(__v => __obj.updateDynamic("Policies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPoliciesResponse]
    }
  }

  @js.native
  trait ListRootsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRootsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRootsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRootsRequest]
    }
  }

  @js.native
  trait ListRootsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Roots: js.UndefOr[Roots]
  }

  object ListRootsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Roots: js.UndefOr[Roots] = js.undefined
    ): ListRootsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Roots.foreach(__v => __obj.updateDynamic("Roots")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRootsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceId: TaggableResourceId
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceId: TaggableResourceId,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListTargetsForPolicyRequest extends js.Object {
    var PolicyId: PolicyId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTargetsForPolicyRequest {
    @inline
    def apply(
        PolicyId: PolicyId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTargetsForPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "PolicyId" -> PolicyId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTargetsForPolicyRequest]
    }
  }

  @js.native
  trait ListTargetsForPolicyResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Targets: js.UndefOr[PolicyTargets]
  }

  object ListTargetsForPolicyResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Targets: js.UndefOr[PolicyTargets] = js.undefined
    ): ListTargetsForPolicyResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTargetsForPolicyResponse]
    }
  }

  @js.native
  trait MoveAccountRequest extends js.Object {
    var AccountId: AccountId
    var DestinationParentId: ParentId
    var SourceParentId: ParentId
  }

  object MoveAccountRequest {
    @inline
    def apply(
        AccountId: AccountId,
        DestinationParentId: ParentId,
        SourceParentId: ParentId
    ): MoveAccountRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "DestinationParentId" -> DestinationParentId.asInstanceOf[js.Any],
        "SourceParentId" -> SourceParentId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MoveAccountRequest]
    }
  }

  /**
    * Contains details about an organization. An organization is a collection of accounts that are centrally managed together using consolidated billing, organized hierarchically with organizational units (OUs), and controlled with policies .
    */
  @js.native
  trait Organization extends js.Object {
    var Arn: js.UndefOr[OrganizationArn]
    var AvailablePolicyTypes: js.UndefOr[PolicyTypes]
    var FeatureSet: js.UndefOr[OrganizationFeatureSet]
    var Id: js.UndefOr[OrganizationId]
    var MasterAccountArn: js.UndefOr[AccountArn]
    var MasterAccountEmail: js.UndefOr[Email]
    var MasterAccountId: js.UndefOr[AccountId]
  }

  object Organization {
    @inline
    def apply(
        Arn: js.UndefOr[OrganizationArn] = js.undefined,
        AvailablePolicyTypes: js.UndefOr[PolicyTypes] = js.undefined,
        FeatureSet: js.UndefOr[OrganizationFeatureSet] = js.undefined,
        Id: js.UndefOr[OrganizationId] = js.undefined,
        MasterAccountArn: js.UndefOr[AccountArn] = js.undefined,
        MasterAccountEmail: js.UndefOr[Email] = js.undefined,
        MasterAccountId: js.UndefOr[AccountId] = js.undefined
    ): Organization = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AvailablePolicyTypes.foreach(__v => __obj.updateDynamic("AvailablePolicyTypes")(__v.asInstanceOf[js.Any]))
      FeatureSet.foreach(__v => __obj.updateDynamic("FeatureSet")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      MasterAccountArn.foreach(__v => __obj.updateDynamic("MasterAccountArn")(__v.asInstanceOf[js.Any]))
      MasterAccountEmail.foreach(__v => __obj.updateDynamic("MasterAccountEmail")(__v.asInstanceOf[js.Any]))
      MasterAccountId.foreach(__v => __obj.updateDynamic("MasterAccountId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Organization]
    }
  }

  @js.native
  sealed trait OrganizationFeatureSet extends js.Any
  object OrganizationFeatureSet extends js.Object {
    val ALL = "ALL".asInstanceOf[OrganizationFeatureSet]
    val CONSOLIDATED_BILLING = "CONSOLIDATED_BILLING".asInstanceOf[OrganizationFeatureSet]

    val values = js.Object.freeze(js.Array(ALL, CONSOLIDATED_BILLING))
  }

  /**
    * Contains details about an organizational unit (OU). An OU is a container of AWS accounts within a root of an organization. Policies that are attached to an OU apply to all accounts contained in that OU and in any child OUs.
    */
  @js.native
  trait OrganizationalUnit extends js.Object {
    var Arn: js.UndefOr[OrganizationalUnitArn]
    var Id: js.UndefOr[OrganizationalUnitId]
    var Name: js.UndefOr[OrganizationalUnitName]
  }

  object OrganizationalUnit {
    @inline
    def apply(
        Arn: js.UndefOr[OrganizationalUnitArn] = js.undefined,
        Id: js.UndefOr[OrganizationalUnitId] = js.undefined,
        Name: js.UndefOr[OrganizationalUnitName] = js.undefined
    ): OrganizationalUnit = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrganizationalUnit]
    }
  }

  /**
    * Contains information about either a root or an organizational unit (OU) that can contain OUs or accounts in an organization.
    */
  @js.native
  trait Parent extends js.Object {
    var Id: js.UndefOr[ParentId]
    var Type: js.UndefOr[ParentType]
  }

  object Parent {
    @inline
    def apply(
        Id: js.UndefOr[ParentId] = js.undefined,
        Type: js.UndefOr[ParentType] = js.undefined
    ): Parent = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Parent]
    }
  }

  @js.native
  sealed trait ParentType extends js.Any
  object ParentType extends js.Object {
    val ROOT = "ROOT".asInstanceOf[ParentType]
    val ORGANIZATIONAL_UNIT = "ORGANIZATIONAL_UNIT".asInstanceOf[ParentType]

    val values = js.Object.freeze(js.Array(ROOT, ORGANIZATIONAL_UNIT))
  }

  /**
    * Contains rules to be applied to the affected accounts. Policies can be attached directly to accounts, or to roots and OUs to affect all accounts in those hierarchies.
    */
  @js.native
  trait Policy extends js.Object {
    var Content: js.UndefOr[PolicyContent]
    var PolicySummary: js.UndefOr[PolicySummary]
  }

  object Policy {
    @inline
    def apply(
        Content: js.UndefOr[PolicyContent] = js.undefined,
        PolicySummary: js.UndefOr[PolicySummary] = js.undefined
    ): Policy = {
      val __obj = js.Dynamic.literal()
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      PolicySummary.foreach(__v => __obj.updateDynamic("PolicySummary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Policy]
    }
  }

  /**
    * Contains information about a policy, but does not include the content. To see the content of a policy, see <a>DescribePolicy</a>.
    */
  @js.native
  trait PolicySummary extends js.Object {
    var Arn: js.UndefOr[PolicyArn]
    var AwsManaged: js.UndefOr[AwsManagedPolicy]
    var Description: js.UndefOr[PolicyDescription]
    var Id: js.UndefOr[PolicyId]
    var Name: js.UndefOr[PolicyName]
    var Type: js.UndefOr[PolicyType]
  }

  object PolicySummary {
    @inline
    def apply(
        Arn: js.UndefOr[PolicyArn] = js.undefined,
        AwsManaged: js.UndefOr[AwsManagedPolicy] = js.undefined,
        Description: js.UndefOr[PolicyDescription] = js.undefined,
        Id: js.UndefOr[PolicyId] = js.undefined,
        Name: js.UndefOr[PolicyName] = js.undefined,
        Type: js.UndefOr[PolicyType] = js.undefined
    ): PolicySummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AwsManaged.foreach(__v => __obj.updateDynamic("AwsManaged")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicySummary]
    }
  }

  /**
    * Contains information about a root, OU, or account that a policy is attached to.
    */
  @js.native
  trait PolicyTargetSummary extends js.Object {
    var Arn: js.UndefOr[GenericArn]
    var Name: js.UndefOr[TargetName]
    var TargetId: js.UndefOr[PolicyTargetId]
    var Type: js.UndefOr[TargetType]
  }

  object PolicyTargetSummary {
    @inline
    def apply(
        Arn: js.UndefOr[GenericArn] = js.undefined,
        Name: js.UndefOr[TargetName] = js.undefined,
        TargetId: js.UndefOr[PolicyTargetId] = js.undefined,
        Type: js.UndefOr[TargetType] = js.undefined
    ): PolicyTargetSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      TargetId.foreach(__v => __obj.updateDynamic("TargetId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyTargetSummary]
    }
  }

  @js.native
  sealed trait PolicyType extends js.Any
  object PolicyType extends js.Object {
    val SERVICE_CONTROL_POLICY = "SERVICE_CONTROL_POLICY".asInstanceOf[PolicyType]
    val TAG_POLICY = "TAG_POLICY".asInstanceOf[PolicyType]
    val BACKUP_POLICY = "BACKUP_POLICY".asInstanceOf[PolicyType]
    val AISERVICES_OPT_OUT_POLICY = "AISERVICES_OPT_OUT_POLICY".asInstanceOf[PolicyType]

    val values = js.Object.freeze(js.Array(SERVICE_CONTROL_POLICY, TAG_POLICY, BACKUP_POLICY, AISERVICES_OPT_OUT_POLICY))
  }

  @js.native
  sealed trait PolicyTypeStatus extends js.Any
  object PolicyTypeStatus extends js.Object {
    val ENABLED = "ENABLED".asInstanceOf[PolicyTypeStatus]
    val PENDING_ENABLE = "PENDING_ENABLE".asInstanceOf[PolicyTypeStatus]
    val PENDING_DISABLE = "PENDING_DISABLE".asInstanceOf[PolicyTypeStatus]

    val values = js.Object.freeze(js.Array(ENABLED, PENDING_ENABLE, PENDING_DISABLE))
  }

  /**
    * Contains information about a policy type and its status in the associated root.
    */
  @js.native
  trait PolicyTypeSummary extends js.Object {
    var Status: js.UndefOr[PolicyTypeStatus]
    var Type: js.UndefOr[PolicyType]
  }

  object PolicyTypeSummary {
    @inline
    def apply(
        Status: js.UndefOr[PolicyTypeStatus] = js.undefined,
        Type: js.UndefOr[PolicyType] = js.undefined
    ): PolicyTypeSummary = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyTypeSummary]
    }
  }

  @js.native
  trait RegisterDelegatedAdministratorRequest extends js.Object {
    var AccountId: AccountId
    var ServicePrincipal: ServicePrincipal
  }

  object RegisterDelegatedAdministratorRequest {
    @inline
    def apply(
        AccountId: AccountId,
        ServicePrincipal: ServicePrincipal
    ): RegisterDelegatedAdministratorRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "ServicePrincipal" -> ServicePrincipal.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RegisterDelegatedAdministratorRequest]
    }
  }

  @js.native
  trait RemoveAccountFromOrganizationRequest extends js.Object {
    var AccountId: AccountId
  }

  object RemoveAccountFromOrganizationRequest {
    @inline
    def apply(
        AccountId: AccountId
    ): RemoveAccountFromOrganizationRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveAccountFromOrganizationRequest]
    }
  }

  /**
    * Contains details about a root. A root is a top-level parent node in the hierarchy of an organization that can contain organizational units (OUs) and accounts. Every root contains every AWS account in the organization. Each root enables the accounts to be organized in a different way and to have different policy types enabled for use in that root.
    */
  @js.native
  trait Root extends js.Object {
    var Arn: js.UndefOr[RootArn]
    var Id: js.UndefOr[RootId]
    var Name: js.UndefOr[RootName]
    var PolicyTypes: js.UndefOr[PolicyTypes]
  }

  object Root {
    @inline
    def apply(
        Arn: js.UndefOr[RootArn] = js.undefined,
        Id: js.UndefOr[RootId] = js.undefined,
        Name: js.UndefOr[RootName] = js.undefined,
        PolicyTypes: js.UndefOr[PolicyTypes] = js.undefined
    ): Root = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PolicyTypes.foreach(__v => __obj.updateDynamic("PolicyTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Root]
    }
  }

  /**
    * A custom key-value pair associated with a resource such as an account within your organization.
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
    var ResourceId: TaggableResourceId
    var Tags: Tags
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceId: TaggableResourceId,
        Tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  sealed trait TargetType extends js.Any
  object TargetType extends js.Object {
    val ACCOUNT = "ACCOUNT".asInstanceOf[TargetType]
    val ORGANIZATIONAL_UNIT = "ORGANIZATIONAL_UNIT".asInstanceOf[TargetType]
    val ROOT = "ROOT".asInstanceOf[TargetType]

    val values = js.Object.freeze(js.Array(ACCOUNT, ORGANIZATIONAL_UNIT, ROOT))
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceId: TaggableResourceId
    var TagKeys: TagKeys
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceId: TaggableResourceId,
        TagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateOrganizationalUnitRequest extends js.Object {
    var OrganizationalUnitId: OrganizationalUnitId
    var Name: js.UndefOr[OrganizationalUnitName]
  }

  object UpdateOrganizationalUnitRequest {
    @inline
    def apply(
        OrganizationalUnitId: OrganizationalUnitId,
        Name: js.UndefOr[OrganizationalUnitName] = js.undefined
    ): UpdateOrganizationalUnitRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationalUnitId" -> OrganizationalUnitId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateOrganizationalUnitRequest]
    }
  }

  @js.native
  trait UpdateOrganizationalUnitResponse extends js.Object {
    var OrganizationalUnit: js.UndefOr[OrganizationalUnit]
  }

  object UpdateOrganizationalUnitResponse {
    @inline
    def apply(
        OrganizationalUnit: js.UndefOr[OrganizationalUnit] = js.undefined
    ): UpdateOrganizationalUnitResponse = {
      val __obj = js.Dynamic.literal()
      OrganizationalUnit.foreach(__v => __obj.updateDynamic("OrganizationalUnit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateOrganizationalUnitResponse]
    }
  }

  @js.native
  trait UpdatePolicyRequest extends js.Object {
    var PolicyId: PolicyId
    var Content: js.UndefOr[PolicyContent]
    var Description: js.UndefOr[PolicyDescription]
    var Name: js.UndefOr[PolicyName]
  }

  object UpdatePolicyRequest {
    @inline
    def apply(
        PolicyId: PolicyId,
        Content: js.UndefOr[PolicyContent] = js.undefined,
        Description: js.UndefOr[PolicyDescription] = js.undefined,
        Name: js.UndefOr[PolicyName] = js.undefined
    ): UpdatePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "PolicyId" -> PolicyId.asInstanceOf[js.Any]
      )

      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePolicyRequest]
    }
  }

  @js.native
  trait UpdatePolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  object UpdatePolicyResponse {
    @inline
    def apply(
        Policy: js.UndefOr[Policy] = js.undefined
    ): UpdatePolicyResponse = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePolicyResponse]
    }
  }
}
