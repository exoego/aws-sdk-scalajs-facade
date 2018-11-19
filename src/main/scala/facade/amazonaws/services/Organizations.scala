package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object organizations {
  type AccountArn = String
  type AccountId = String
  type AccountJoinedMethod = String
  type AccountName = String
  type AccountStatus = String
  type Accounts = js.Array[Account]
  type ActionType = String
  type AwsManagedPolicy = Boolean
  type ChildId = String
  type ChildType = String
  type Children = js.Array[Child]
  type CreateAccountFailureReason = String
  type CreateAccountRequestId = String
  type CreateAccountState = String
  type CreateAccountStates = js.Array[CreateAccountState]
  type CreateAccountStatuses = js.Array[CreateAccountStatus]
  type Email = String
  type EnabledServicePrincipals = js.Array[EnabledServicePrincipal]
  type GenericArn = String
  type HandshakeArn = String
  type HandshakeId = String
  type HandshakeNotes = String
  type HandshakeParties = js.Array[HandshakeParty]
  type HandshakePartyId = String
  type HandshakePartyType = String
  type HandshakeResourceType = String
  type HandshakeResourceValue = String
  type HandshakeResources = js.Array[HandshakeResource]
  type HandshakeState = String
  type Handshakes = js.Array[Handshake]
  type IAMUserAccessToBilling = String
  type MaxResults = Int
  type NextToken = String
  type OrganizationArn = String
  type OrganizationFeatureSet = String
  type OrganizationId = String
  type OrganizationalUnitArn = String
  type OrganizationalUnitId = String
  type OrganizationalUnitName = String
  type OrganizationalUnits = js.Array[OrganizationalUnit]
  type ParentId = String
  type ParentType = String
  type Parents = js.Array[Parent]
  type Policies = js.Array[PolicySummary]
  type PolicyArn = String
  type PolicyContent = String
  type PolicyDescription = String
  type PolicyId = String
  type PolicyName = String
  type PolicyTargetId = String
  type PolicyTargets = js.Array[PolicyTargetSummary]
  type PolicyType = String
  type PolicyTypeStatus = String
  type PolicyTypes = js.Array[PolicyTypeSummary]
  type RoleName = String
  type RootArn = String
  type RootId = String
  type RootName = String
  type Roots = js.Array[Root]
  type ServicePrincipal = String
  type TargetName = String
  type TargetType = String
  type Timestamp = js.Date
}

package organizations {
  @js.native
  @JSImport("aws-sdk", "Organizations")
  class Organizations(config: AWSConfig) extends js.Object {
    def acceptHandshake(params: AcceptHandshakeRequest): Request[AcceptHandshakeResponse] = js.native
    def attachPolicy(params: AttachPolicyRequest): Request[js.Object] = js.native
    def cancelHandshake(params: CancelHandshakeRequest): Request[CancelHandshakeResponse] = js.native
    def createAccount(params: CreateAccountRequest): Request[CreateAccountResponse] = js.native
    def createOrganization(params: CreateOrganizationRequest): Request[CreateOrganizationResponse] = js.native
    def createOrganizationalUnit(params: CreateOrganizationalUnitRequest): Request[CreateOrganizationalUnitResponse] = js.native
    def createPolicy(params: CreatePolicyRequest): Request[CreatePolicyResponse] = js.native
    def declineHandshake(params: DeclineHandshakeRequest): Request[DeclineHandshakeResponse] = js.native
    def deleteOrganization(): Request[js.Object] = js.native
    def deleteOrganizationalUnit(params: DeleteOrganizationalUnitRequest): Request[js.Object] = js.native
    def deletePolicy(params: DeletePolicyRequest): Request[js.Object] = js.native
    def describeAccount(params: DescribeAccountRequest): Request[DescribeAccountResponse] = js.native
    def describeCreateAccountStatus(params: DescribeCreateAccountStatusRequest): Request[DescribeCreateAccountStatusResponse] = js.native
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
    def listHandshakesForAccount(params: ListHandshakesForAccountRequest): Request[ListHandshakesForAccountResponse] = js.native
    def listHandshakesForOrganization(params: ListHandshakesForOrganizationRequest): Request[ListHandshakesForOrganizationResponse] = js.native
    def listOrganizationalUnitsForParent(params: ListOrganizationalUnitsForParentRequest): Request[ListOrganizationalUnitsForParentResponse] = js.native
    def listParents(params: ListParentsRequest): Request[ListParentsResponse] = js.native
    def listPolicies(params: ListPoliciesRequest): Request[ListPoliciesResponse] = js.native
    def listPoliciesForTarget(params: ListPoliciesForTargetRequest): Request[ListPoliciesForTargetResponse] = js.native
    def listRoots(params: ListRootsRequest): Request[ListRootsResponse] = js.native
    def listTargetsForPolicy(params: ListTargetsForPolicyRequest): Request[ListTargetsForPolicyResponse] = js.native
    def moveAccount(params: MoveAccountRequest): Request[js.Object] = js.native
    def removeAccountFromOrganization(params: RemoveAccountFromOrganizationRequest): Request[js.Object] = js.native
    def updateOrganizationalUnit(params: UpdateOrganizationalUnitRequest): Request[UpdateOrganizationalUnitResponse] = js.native
    def updatePolicy(params: UpdatePolicyRequest): Request[UpdatePolicyResponse] = js.native
  }

  @js.native
  trait AcceptHandshakeRequest extends js.Object {
    var HandshakeId: js.UndefOr[HandshakeId]
  }

  object AcceptHandshakeRequest {
    def apply(
      HandshakeId: js.UndefOr[HandshakeId] = js.undefined): AcceptHandshakeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HandshakeId" -> HandshakeId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptHandshakeRequest]
    }
  }

  @js.native
  trait AcceptHandshakeResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  object AcceptHandshakeResponse {
    def apply(
      Handshake: js.UndefOr[Handshake] = js.undefined): AcceptHandshakeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Handshake" -> Handshake.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptHandshakeResponse]
    }
  }

  /**
   * <p>Contains information about an AWS account that is a member of an organization.</p>
   */
  @js.native
  trait Account extends js.Object {
    var Id: js.UndefOr[AccountId]
    var Name: js.UndefOr[AccountName]
    var Email: js.UndefOr[Email]
    var JoinedMethod: js.UndefOr[AccountJoinedMethod]
    var JoinedTimestamp: js.UndefOr[Timestamp]
    var Arn: js.UndefOr[AccountArn]
    var Status: js.UndefOr[AccountStatus]
  }

  object Account {
    def apply(
      Id: js.UndefOr[AccountId] = js.undefined,
      Name: js.UndefOr[AccountName] = js.undefined,
      Email: js.UndefOr[Email] = js.undefined,
      JoinedMethod: js.UndefOr[AccountJoinedMethod] = js.undefined,
      JoinedTimestamp: js.UndefOr[Timestamp] = js.undefined,
      Arn: js.UndefOr[AccountArn] = js.undefined,
      Status: js.UndefOr[AccountStatus] = js.undefined): Account = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Email" -> Email.map { x => x.asInstanceOf[js.Any] },
        "JoinedMethod" -> JoinedMethod.map { x => x.asInstanceOf[js.Any] },
        "JoinedTimestamp" -> JoinedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Account]
    }
  }

  object AccountJoinedMethodEnum {
    val INVITED = "INVITED"
    val CREATED = "CREATED"

    val values = IndexedSeq(INVITED, CREATED)
  }

  object AccountStatusEnum {
    val ACTIVE = "ACTIVE"
    val SUSPENDED = "SUSPENDED"

    val values = IndexedSeq(ACTIVE, SUSPENDED)
  }

  object ActionTypeEnum {
    val INVITE = "INVITE"
    val ENABLE_ALL_FEATURES = "ENABLE_ALL_FEATURES"
    val APPROVE_ALL_FEATURES = "APPROVE_ALL_FEATURES"
    val ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE = "ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE"

    val values = IndexedSeq(INVITE, ENABLE_ALL_FEATURES, APPROVE_ALL_FEATURES, ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE)
  }

  @js.native
  trait AttachPolicyRequest extends js.Object {
    var PolicyId: js.UndefOr[PolicyId]
    var TargetId: js.UndefOr[PolicyTargetId]
  }

  object AttachPolicyRequest {
    def apply(
      PolicyId: js.UndefOr[PolicyId] = js.undefined,
      TargetId: js.UndefOr[PolicyTargetId] = js.undefined): AttachPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.map { x => x.asInstanceOf[js.Any] },
        "TargetId" -> TargetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachPolicyRequest]
    }
  }

  @js.native
  trait CancelHandshakeRequest extends js.Object {
    var HandshakeId: js.UndefOr[HandshakeId]
  }

  object CancelHandshakeRequest {
    def apply(
      HandshakeId: js.UndefOr[HandshakeId] = js.undefined): CancelHandshakeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HandshakeId" -> HandshakeId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelHandshakeRequest]
    }
  }

  @js.native
  trait CancelHandshakeResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  object CancelHandshakeResponse {
    def apply(
      Handshake: js.UndefOr[Handshake] = js.undefined): CancelHandshakeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Handshake" -> Handshake.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelHandshakeResponse]
    }
  }

  /**
   * <p>Contains a list of child entities, either OUs or accounts.</p>
   */
  @js.native
  trait Child extends js.Object {
    var Id: js.UndefOr[ChildId]
    var Type: js.UndefOr[ChildType]
  }

  object Child {
    def apply(
      Id: js.UndefOr[ChildId] = js.undefined,
      Type: js.UndefOr[ChildType] = js.undefined): Child = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Child]
    }
  }

  object ChildTypeEnum {
    val ACCOUNT = "ACCOUNT"
    val ORGANIZATIONAL_UNIT = "ORGANIZATIONAL_UNIT"

    val values = IndexedSeq(ACCOUNT, ORGANIZATIONAL_UNIT)
  }

  object CreateAccountFailureReasonEnum {
    val ACCOUNT_LIMIT_EXCEEDED = "ACCOUNT_LIMIT_EXCEEDED"
    val EMAIL_ALREADY_EXISTS = "EMAIL_ALREADY_EXISTS"
    val INVALID_ADDRESS = "INVALID_ADDRESS"
    val INVALID_EMAIL = "INVALID_EMAIL"
    val CONCURRENT_ACCOUNT_MODIFICATION = "CONCURRENT_ACCOUNT_MODIFICATION"
    val INTERNAL_FAILURE = "INTERNAL_FAILURE"

    val values = IndexedSeq(ACCOUNT_LIMIT_EXCEEDED, EMAIL_ALREADY_EXISTS, INVALID_ADDRESS, INVALID_EMAIL, CONCURRENT_ACCOUNT_MODIFICATION, INTERNAL_FAILURE)
  }

  @js.native
  trait CreateAccountRequest extends js.Object {
    var Email: js.UndefOr[Email]
    var AccountName: js.UndefOr[AccountName]
    var RoleName: js.UndefOr[RoleName]
    var IamUserAccessToBilling: js.UndefOr[IAMUserAccessToBilling]
  }

  object CreateAccountRequest {
    def apply(
      Email: js.UndefOr[Email] = js.undefined,
      AccountName: js.UndefOr[AccountName] = js.undefined,
      RoleName: js.UndefOr[RoleName] = js.undefined,
      IamUserAccessToBilling: js.UndefOr[IAMUserAccessToBilling] = js.undefined): CreateAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Email" -> Email.map { x => x.asInstanceOf[js.Any] },
        "AccountName" -> AccountName.map { x => x.asInstanceOf[js.Any] },
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] },
        "IamUserAccessToBilling" -> IamUserAccessToBilling.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAccountRequest]
    }
  }

  @js.native
  trait CreateAccountResponse extends js.Object {
    var CreateAccountStatus: js.UndefOr[CreateAccountStatus]
  }

  object CreateAccountResponse {
    def apply(
      CreateAccountStatus: js.UndefOr[CreateAccountStatus] = js.undefined): CreateAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreateAccountStatus" -> CreateAccountStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAccountResponse]
    }
  }

  object CreateAccountStateEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val SUCCEEDED = "SUCCEEDED"
    val FAILED = "FAILED"

    val values = IndexedSeq(IN_PROGRESS, SUCCEEDED, FAILED)
  }

  /**
   * <p>Contains the status about a <a>CreateAccount</a> request to create an AWS account in an organization.</p>
   */
  @js.native
  trait CreateAccountStatus extends js.Object {
    var AccountName: js.UndefOr[AccountName]
    var Id: js.UndefOr[CreateAccountRequestId]
    var CompletedTimestamp: js.UndefOr[Timestamp]
    var FailureReason: js.UndefOr[CreateAccountFailureReason]
    var AccountId: js.UndefOr[AccountId]
    var RequestedTimestamp: js.UndefOr[Timestamp]
    var State: js.UndefOr[CreateAccountState]
  }

  object CreateAccountStatus {
    def apply(
      AccountName: js.UndefOr[AccountName] = js.undefined,
      Id: js.UndefOr[CreateAccountRequestId] = js.undefined,
      CompletedTimestamp: js.UndefOr[Timestamp] = js.undefined,
      FailureReason: js.UndefOr[CreateAccountFailureReason] = js.undefined,
      AccountId: js.UndefOr[AccountId] = js.undefined,
      RequestedTimestamp: js.UndefOr[Timestamp] = js.undefined,
      State: js.UndefOr[CreateAccountState] = js.undefined): CreateAccountStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountName" -> AccountName.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "CompletedTimestamp" -> CompletedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "RequestedTimestamp" -> RequestedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAccountStatus]
    }
  }

  @js.native
  trait CreateOrganizationRequest extends js.Object {
    var FeatureSet: js.UndefOr[OrganizationFeatureSet]
  }

  object CreateOrganizationRequest {
    def apply(
      FeatureSet: js.UndefOr[OrganizationFeatureSet] = js.undefined): CreateOrganizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FeatureSet" -> FeatureSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOrganizationRequest]
    }
  }

  @js.native
  trait CreateOrganizationResponse extends js.Object {
    var Organization: js.UndefOr[Organization]
  }

  object CreateOrganizationResponse {
    def apply(
      Organization: js.UndefOr[Organization] = js.undefined): CreateOrganizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Organization" -> Organization.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOrganizationResponse]
    }
  }

  @js.native
  trait CreateOrganizationalUnitRequest extends js.Object {
    var ParentId: js.UndefOr[ParentId]
    var Name: js.UndefOr[OrganizationalUnitName]
  }

  object CreateOrganizationalUnitRequest {
    def apply(
      ParentId: js.UndefOr[ParentId] = js.undefined,
      Name: js.UndefOr[OrganizationalUnitName] = js.undefined): CreateOrganizationalUnitRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParentId" -> ParentId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOrganizationalUnitRequest]
    }
  }

  @js.native
  trait CreateOrganizationalUnitResponse extends js.Object {
    var OrganizationalUnit: js.UndefOr[OrganizationalUnit]
  }

  object CreateOrganizationalUnitResponse {
    def apply(
      OrganizationalUnit: js.UndefOr[OrganizationalUnit] = js.undefined): CreateOrganizationalUnitResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationalUnit" -> OrganizationalUnit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOrganizationalUnitResponse]
    }
  }

  @js.native
  trait CreatePolicyRequest extends js.Object {
    var Content: js.UndefOr[PolicyContent]
    var Description: js.UndefOr[PolicyDescription]
    var Name: js.UndefOr[PolicyName]
    var Type: js.UndefOr[PolicyType]
  }

  object CreatePolicyRequest {
    def apply(
      Content: js.UndefOr[PolicyContent] = js.undefined,
      Description: js.UndefOr[PolicyDescription] = js.undefined,
      Name: js.UndefOr[PolicyName] = js.undefined,
      Type: js.UndefOr[PolicyType] = js.undefined): CreatePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Content" -> Content.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePolicyRequest]
    }
  }

  @js.native
  trait CreatePolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  object CreatePolicyResponse {
    def apply(
      Policy: js.UndefOr[Policy] = js.undefined): CreatePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePolicyResponse]
    }
  }

  @js.native
  trait DeclineHandshakeRequest extends js.Object {
    var HandshakeId: js.UndefOr[HandshakeId]
  }

  object DeclineHandshakeRequest {
    def apply(
      HandshakeId: js.UndefOr[HandshakeId] = js.undefined): DeclineHandshakeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HandshakeId" -> HandshakeId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeclineHandshakeRequest]
    }
  }

  @js.native
  trait DeclineHandshakeResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  object DeclineHandshakeResponse {
    def apply(
      Handshake: js.UndefOr[Handshake] = js.undefined): DeclineHandshakeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Handshake" -> Handshake.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeclineHandshakeResponse]
    }
  }

  @js.native
  trait DeleteOrganizationalUnitRequest extends js.Object {
    var OrganizationalUnitId: js.UndefOr[OrganizationalUnitId]
  }

  object DeleteOrganizationalUnitRequest {
    def apply(
      OrganizationalUnitId: js.UndefOr[OrganizationalUnitId] = js.undefined): DeleteOrganizationalUnitRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationalUnitId" -> OrganizationalUnitId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteOrganizationalUnitRequest]
    }
  }

  @js.native
  trait DeletePolicyRequest extends js.Object {
    var PolicyId: js.UndefOr[PolicyId]
  }

  object DeletePolicyRequest {
    def apply(
      PolicyId: js.UndefOr[PolicyId] = js.undefined): DeletePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePolicyRequest]
    }
  }

  @js.native
  trait DescribeAccountRequest extends js.Object {
    var AccountId: js.UndefOr[AccountId]
  }

  object DescribeAccountRequest {
    def apply(
      AccountId: js.UndefOr[AccountId] = js.undefined): DescribeAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountRequest]
    }
  }

  @js.native
  trait DescribeAccountResponse extends js.Object {
    var Account: js.UndefOr[Account]
  }

  object DescribeAccountResponse {
    def apply(
      Account: js.UndefOr[Account] = js.undefined): DescribeAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Account" -> Account.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountResponse]
    }
  }

  @js.native
  trait DescribeCreateAccountStatusRequest extends js.Object {
    var CreateAccountRequestId: js.UndefOr[CreateAccountRequestId]
  }

  object DescribeCreateAccountStatusRequest {
    def apply(
      CreateAccountRequestId: js.UndefOr[CreateAccountRequestId] = js.undefined): DescribeCreateAccountStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreateAccountRequestId" -> CreateAccountRequestId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCreateAccountStatusRequest]
    }
  }

  @js.native
  trait DescribeCreateAccountStatusResponse extends js.Object {
    var CreateAccountStatus: js.UndefOr[CreateAccountStatus]
  }

  object DescribeCreateAccountStatusResponse {
    def apply(
      CreateAccountStatus: js.UndefOr[CreateAccountStatus] = js.undefined): DescribeCreateAccountStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreateAccountStatus" -> CreateAccountStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCreateAccountStatusResponse]
    }
  }

  @js.native
  trait DescribeHandshakeRequest extends js.Object {
    var HandshakeId: js.UndefOr[HandshakeId]
  }

  object DescribeHandshakeRequest {
    def apply(
      HandshakeId: js.UndefOr[HandshakeId] = js.undefined): DescribeHandshakeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HandshakeId" -> HandshakeId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHandshakeRequest]
    }
  }

  @js.native
  trait DescribeHandshakeResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  object DescribeHandshakeResponse {
    def apply(
      Handshake: js.UndefOr[Handshake] = js.undefined): DescribeHandshakeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Handshake" -> Handshake.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHandshakeResponse]
    }
  }

  @js.native
  trait DescribeOrganizationResponse extends js.Object {
    var Organization: js.UndefOr[Organization]
  }

  object DescribeOrganizationResponse {
    def apply(
      Organization: js.UndefOr[Organization] = js.undefined): DescribeOrganizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Organization" -> Organization.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOrganizationResponse]
    }
  }

  @js.native
  trait DescribeOrganizationalUnitRequest extends js.Object {
    var OrganizationalUnitId: js.UndefOr[OrganizationalUnitId]
  }

  object DescribeOrganizationalUnitRequest {
    def apply(
      OrganizationalUnitId: js.UndefOr[OrganizationalUnitId] = js.undefined): DescribeOrganizationalUnitRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationalUnitId" -> OrganizationalUnitId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOrganizationalUnitRequest]
    }
  }

  @js.native
  trait DescribeOrganizationalUnitResponse extends js.Object {
    var OrganizationalUnit: js.UndefOr[OrganizationalUnit]
  }

  object DescribeOrganizationalUnitResponse {
    def apply(
      OrganizationalUnit: js.UndefOr[OrganizationalUnit] = js.undefined): DescribeOrganizationalUnitResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationalUnit" -> OrganizationalUnit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOrganizationalUnitResponse]
    }
  }

  @js.native
  trait DescribePolicyRequest extends js.Object {
    var PolicyId: js.UndefOr[PolicyId]
  }

  object DescribePolicyRequest {
    def apply(
      PolicyId: js.UndefOr[PolicyId] = js.undefined): DescribePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePolicyRequest]
    }
  }

  @js.native
  trait DescribePolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  object DescribePolicyResponse {
    def apply(
      Policy: js.UndefOr[Policy] = js.undefined): DescribePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePolicyResponse]
    }
  }

  @js.native
  trait DetachPolicyRequest extends js.Object {
    var PolicyId: js.UndefOr[PolicyId]
    var TargetId: js.UndefOr[PolicyTargetId]
  }

  object DetachPolicyRequest {
    def apply(
      PolicyId: js.UndefOr[PolicyId] = js.undefined,
      TargetId: js.UndefOr[PolicyTargetId] = js.undefined): DetachPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.map { x => x.asInstanceOf[js.Any] },
        "TargetId" -> TargetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachPolicyRequest]
    }
  }

  @js.native
  trait DisableAWSServiceAccessRequest extends js.Object {
    var ServicePrincipal: js.UndefOr[ServicePrincipal]
  }

  object DisableAWSServiceAccessRequest {
    def apply(
      ServicePrincipal: js.UndefOr[ServicePrincipal] = js.undefined): DisableAWSServiceAccessRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServicePrincipal" -> ServicePrincipal.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableAWSServiceAccessRequest]
    }
  }

  @js.native
  trait DisablePolicyTypeRequest extends js.Object {
    var RootId: js.UndefOr[RootId]
    var PolicyType: js.UndefOr[PolicyType]
  }

  object DisablePolicyTypeRequest {
    def apply(
      RootId: js.UndefOr[RootId] = js.undefined,
      PolicyType: js.UndefOr[PolicyType] = js.undefined): DisablePolicyTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RootId" -> RootId.map { x => x.asInstanceOf[js.Any] },
        "PolicyType" -> PolicyType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisablePolicyTypeRequest]
    }
  }

  @js.native
  trait DisablePolicyTypeResponse extends js.Object {
    var Root: js.UndefOr[Root]
  }

  object DisablePolicyTypeResponse {
    def apply(
      Root: js.UndefOr[Root] = js.undefined): DisablePolicyTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Root" -> Root.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisablePolicyTypeResponse]
    }
  }

  @js.native
  trait EnableAWSServiceAccessRequest extends js.Object {
    var ServicePrincipal: js.UndefOr[ServicePrincipal]
  }

  object EnableAWSServiceAccessRequest {
    def apply(
      ServicePrincipal: js.UndefOr[ServicePrincipal] = js.undefined): EnableAWSServiceAccessRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServicePrincipal" -> ServicePrincipal.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableAWSServiceAccessRequest]
    }
  }

  @js.native
  trait EnableAllFeaturesRequest extends js.Object {

  }

  object EnableAllFeaturesRequest {
    def apply(): EnableAllFeaturesRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableAllFeaturesRequest]
    }
  }

  @js.native
  trait EnableAllFeaturesResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  object EnableAllFeaturesResponse {
    def apply(
      Handshake: js.UndefOr[Handshake] = js.undefined): EnableAllFeaturesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Handshake" -> Handshake.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableAllFeaturesResponse]
    }
  }

  @js.native
  trait EnablePolicyTypeRequest extends js.Object {
    var RootId: js.UndefOr[RootId]
    var PolicyType: js.UndefOr[PolicyType]
  }

  object EnablePolicyTypeRequest {
    def apply(
      RootId: js.UndefOr[RootId] = js.undefined,
      PolicyType: js.UndefOr[PolicyType] = js.undefined): EnablePolicyTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RootId" -> RootId.map { x => x.asInstanceOf[js.Any] },
        "PolicyType" -> PolicyType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnablePolicyTypeRequest]
    }
  }

  @js.native
  trait EnablePolicyTypeResponse extends js.Object {
    var Root: js.UndefOr[Root]
  }

  object EnablePolicyTypeResponse {
    def apply(
      Root: js.UndefOr[Root] = js.undefined): EnablePolicyTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Root" -> Root.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnablePolicyTypeResponse]
    }
  }

  /**
   * <p>A structure that contains details of a service principal that is enabled to integrate with AWS Organizations.</p>
   */
  @js.native
  trait EnabledServicePrincipal extends js.Object {
    var ServicePrincipal: js.UndefOr[ServicePrincipal]
    var DateEnabled: js.UndefOr[Timestamp]
  }

  object EnabledServicePrincipal {
    def apply(
      ServicePrincipal: js.UndefOr[ServicePrincipal] = js.undefined,
      DateEnabled: js.UndefOr[Timestamp] = js.undefined): EnabledServicePrincipal = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServicePrincipal" -> ServicePrincipal.map { x => x.asInstanceOf[js.Any] },
        "DateEnabled" -> DateEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnabledServicePrincipal]
    }
  }

  /**
   * <p>Contains information that must be exchanged to securely establish a relationship between two accounts (an <i>originator</i> and a <i>recipient</i>). For example, when a master account (the originator) invites another account (the recipient) to join its organization, the two accounts exchange information as a series of handshake requests and responses.</p> <p> <b>Note:</b> Handshakes that are CANCELED, ACCEPTED, or DECLINED show up in lists for only 30 days after entering that state After that they are deleted.</p>
   */
  @js.native
  trait Handshake extends js.Object {
    var Id: js.UndefOr[HandshakeId]
    var Resources: js.UndefOr[HandshakeResources]
    var Arn: js.UndefOr[HandshakeArn]
    var Parties: js.UndefOr[HandshakeParties]
    var ExpirationTimestamp: js.UndefOr[Timestamp]
    var RequestedTimestamp: js.UndefOr[Timestamp]
    var State: js.UndefOr[HandshakeState]
    var Action: js.UndefOr[ActionType]
  }

  object Handshake {
    def apply(
      Id: js.UndefOr[HandshakeId] = js.undefined,
      Resources: js.UndefOr[HandshakeResources] = js.undefined,
      Arn: js.UndefOr[HandshakeArn] = js.undefined,
      Parties: js.UndefOr[HandshakeParties] = js.undefined,
      ExpirationTimestamp: js.UndefOr[Timestamp] = js.undefined,
      RequestedTimestamp: js.UndefOr[Timestamp] = js.undefined,
      State: js.UndefOr[HandshakeState] = js.undefined,
      Action: js.UndefOr[ActionType] = js.undefined): Handshake = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Resources" -> Resources.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Parties" -> Parties.map { x => x.asInstanceOf[js.Any] },
        "ExpirationTimestamp" -> ExpirationTimestamp.map { x => x.asInstanceOf[js.Any] },
        "RequestedTimestamp" -> RequestedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Handshake]
    }
  }

  /**
   * <p>Specifies the criteria that are used to select the handshakes for the operation.</p>
   */
  @js.native
  trait HandshakeFilter extends js.Object {
    var ActionType: js.UndefOr[ActionType]
    var ParentHandshakeId: js.UndefOr[HandshakeId]
  }

  object HandshakeFilter {
    def apply(
      ActionType: js.UndefOr[ActionType] = js.undefined,
      ParentHandshakeId: js.UndefOr[HandshakeId] = js.undefined): HandshakeFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActionType" -> ActionType.map { x => x.asInstanceOf[js.Any] },
        "ParentHandshakeId" -> ParentHandshakeId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HandshakeFilter]
    }
  }

  /**
   * <p>Identifies a participant in a handshake.</p>
   */
  @js.native
  trait HandshakeParty extends js.Object {
    var Id: js.UndefOr[HandshakePartyId]
    var Type: js.UndefOr[HandshakePartyType]
  }

  object HandshakeParty {
    def apply(
      Id: js.UndefOr[HandshakePartyId] = js.undefined,
      Type: js.UndefOr[HandshakePartyType] = js.undefined): HandshakeParty = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HandshakeParty]
    }
  }

  object HandshakePartyTypeEnum {
    val ACCOUNT = "ACCOUNT"
    val ORGANIZATION = "ORGANIZATION"
    val EMAIL = "EMAIL"

    val values = IndexedSeq(ACCOUNT, ORGANIZATION, EMAIL)
  }

  /**
   * <p>Contains additional data that is needed to process a handshake.</p>
   */
  @js.native
  trait HandshakeResource extends js.Object {
    var Value: js.UndefOr[HandshakeResourceValue]
    var Type: js.UndefOr[HandshakeResourceType]
    var Resources: js.UndefOr[HandshakeResources]
  }

  object HandshakeResource {
    def apply(
      Value: js.UndefOr[HandshakeResourceValue] = js.undefined,
      Type: js.UndefOr[HandshakeResourceType] = js.undefined,
      Resources: js.UndefOr[HandshakeResources] = js.undefined): HandshakeResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Resources" -> Resources.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HandshakeResource]
    }
  }

  object HandshakeResourceTypeEnum {
    val ACCOUNT = "ACCOUNT"
    val ORGANIZATION = "ORGANIZATION"
    val ORGANIZATION_FEATURE_SET = "ORGANIZATION_FEATURE_SET"
    val EMAIL = "EMAIL"
    val MASTER_EMAIL = "MASTER_EMAIL"
    val MASTER_NAME = "MASTER_NAME"
    val NOTES = "NOTES"
    val PARENT_HANDSHAKE = "PARENT_HANDSHAKE"

    val values = IndexedSeq(ACCOUNT, ORGANIZATION, ORGANIZATION_FEATURE_SET, EMAIL, MASTER_EMAIL, MASTER_NAME, NOTES, PARENT_HANDSHAKE)
  }

  object HandshakeStateEnum {
    val REQUESTED = "REQUESTED"
    val OPEN = "OPEN"
    val CANCELED = "CANCELED"
    val ACCEPTED = "ACCEPTED"
    val DECLINED = "DECLINED"
    val EXPIRED = "EXPIRED"

    val values = IndexedSeq(REQUESTED, OPEN, CANCELED, ACCEPTED, DECLINED, EXPIRED)
  }

  object IAMUserAccessToBillingEnum {
    val ALLOW = "ALLOW"
    val DENY = "DENY"

    val values = IndexedSeq(ALLOW, DENY)
  }

  @js.native
  trait InviteAccountToOrganizationRequest extends js.Object {
    var Target: js.UndefOr[HandshakeParty]
    var Notes: js.UndefOr[HandshakeNotes]
  }

  object InviteAccountToOrganizationRequest {
    def apply(
      Target: js.UndefOr[HandshakeParty] = js.undefined,
      Notes: js.UndefOr[HandshakeNotes] = js.undefined): InviteAccountToOrganizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Target" -> Target.map { x => x.asInstanceOf[js.Any] },
        "Notes" -> Notes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InviteAccountToOrganizationRequest]
    }
  }

  @js.native
  trait InviteAccountToOrganizationResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  object InviteAccountToOrganizationResponse {
    def apply(
      Handshake: js.UndefOr[Handshake] = js.undefined): InviteAccountToOrganizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Handshake" -> Handshake.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InviteAccountToOrganizationResponse]
    }
  }

  @js.native
  trait ListAWSServiceAccessForOrganizationRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListAWSServiceAccessForOrganizationRequest {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListAWSServiceAccessForOrganizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAWSServiceAccessForOrganizationRequest]
    }
  }

  @js.native
  trait ListAWSServiceAccessForOrganizationResponse extends js.Object {
    var EnabledServicePrincipals: js.UndefOr[EnabledServicePrincipals]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAWSServiceAccessForOrganizationResponse {
    def apply(
      EnabledServicePrincipals: js.UndefOr[EnabledServicePrincipals] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListAWSServiceAccessForOrganizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EnabledServicePrincipals" -> EnabledServicePrincipals.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAWSServiceAccessForOrganizationResponse]
    }
  }

  @js.native
  trait ListAccountsForParentRequest extends js.Object {
    var ParentId: js.UndefOr[ParentId]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListAccountsForParentRequest {
    def apply(
      ParentId: js.UndefOr[ParentId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListAccountsForParentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParentId" -> ParentId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAccountsForParentRequest]
    }
  }

  @js.native
  trait ListAccountsForParentResponse extends js.Object {
    var Accounts: js.UndefOr[Accounts]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAccountsForParentResponse {
    def apply(
      Accounts: js.UndefOr[Accounts] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListAccountsForParentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Accounts" -> Accounts.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAccountsForParentResponse]
    }
  }

  @js.native
  trait ListAccountsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListAccountsRequest {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListAccountsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAccountsRequest]
    }
  }

  @js.native
  trait ListAccountsResponse extends js.Object {
    var Accounts: js.UndefOr[Accounts]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAccountsResponse {
    def apply(
      Accounts: js.UndefOr[Accounts] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListAccountsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Accounts" -> Accounts.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAccountsResponse]
    }
  }

  @js.native
  trait ListChildrenRequest extends js.Object {
    var ParentId: js.UndefOr[ParentId]
    var ChildType: js.UndefOr[ChildType]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListChildrenRequest {
    def apply(
      ParentId: js.UndefOr[ParentId] = js.undefined,
      ChildType: js.UndefOr[ChildType] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListChildrenRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParentId" -> ParentId.map { x => x.asInstanceOf[js.Any] },
        "ChildType" -> ChildType.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListChildrenRequest]
    }
  }

  @js.native
  trait ListChildrenResponse extends js.Object {
    var Children: js.UndefOr[Children]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChildrenResponse {
    def apply(
      Children: js.UndefOr[Children] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListChildrenResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Children" -> Children.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListChildrenResponse]
    }
  }

  @js.native
  trait ListCreateAccountStatusRequest extends js.Object {
    var States: js.UndefOr[CreateAccountStates]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListCreateAccountStatusRequest {
    def apply(
      States: js.UndefOr[CreateAccountStates] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListCreateAccountStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "States" -> States.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCreateAccountStatusRequest]
    }
  }

  @js.native
  trait ListCreateAccountStatusResponse extends js.Object {
    var CreateAccountStatuses: js.UndefOr[CreateAccountStatuses]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCreateAccountStatusResponse {
    def apply(
      CreateAccountStatuses: js.UndefOr[CreateAccountStatuses] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListCreateAccountStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreateAccountStatuses" -> CreateAccountStatuses.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCreateAccountStatusResponse]
    }
  }

  @js.native
  trait ListHandshakesForAccountRequest extends js.Object {
    var Filter: js.UndefOr[HandshakeFilter]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListHandshakesForAccountRequest {
    def apply(
      Filter: js.UndefOr[HandshakeFilter] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListHandshakesForAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHandshakesForAccountRequest]
    }
  }

  @js.native
  trait ListHandshakesForAccountResponse extends js.Object {
    var Handshakes: js.UndefOr[Handshakes]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHandshakesForAccountResponse {
    def apply(
      Handshakes: js.UndefOr[Handshakes] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListHandshakesForAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Handshakes" -> Handshakes.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHandshakesForAccountResponse]
    }
  }

  @js.native
  trait ListHandshakesForOrganizationRequest extends js.Object {
    var Filter: js.UndefOr[HandshakeFilter]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListHandshakesForOrganizationRequest {
    def apply(
      Filter: js.UndefOr[HandshakeFilter] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListHandshakesForOrganizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHandshakesForOrganizationRequest]
    }
  }

  @js.native
  trait ListHandshakesForOrganizationResponse extends js.Object {
    var Handshakes: js.UndefOr[Handshakes]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHandshakesForOrganizationResponse {
    def apply(
      Handshakes: js.UndefOr[Handshakes] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListHandshakesForOrganizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Handshakes" -> Handshakes.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHandshakesForOrganizationResponse]
    }
  }

  @js.native
  trait ListOrganizationalUnitsForParentRequest extends js.Object {
    var ParentId: js.UndefOr[ParentId]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListOrganizationalUnitsForParentRequest {
    def apply(
      ParentId: js.UndefOr[ParentId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListOrganizationalUnitsForParentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParentId" -> ParentId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOrganizationalUnitsForParentRequest]
    }
  }

  @js.native
  trait ListOrganizationalUnitsForParentResponse extends js.Object {
    var OrganizationalUnits: js.UndefOr[OrganizationalUnits]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListOrganizationalUnitsForParentResponse {
    def apply(
      OrganizationalUnits: js.UndefOr[OrganizationalUnits] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListOrganizationalUnitsForParentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationalUnits" -> OrganizationalUnits.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOrganizationalUnitsForParentResponse]
    }
  }

  @js.native
  trait ListParentsRequest extends js.Object {
    var ChildId: js.UndefOr[ChildId]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListParentsRequest {
    def apply(
      ChildId: js.UndefOr[ChildId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListParentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChildId" -> ChildId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListParentsRequest]
    }
  }

  @js.native
  trait ListParentsResponse extends js.Object {
    var Parents: js.UndefOr[Parents]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListParentsResponse {
    def apply(
      Parents: js.UndefOr[Parents] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListParentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Parents" -> Parents.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListParentsResponse]
    }
  }

  @js.native
  trait ListPoliciesForTargetRequest extends js.Object {
    var TargetId: js.UndefOr[PolicyTargetId]
    var Filter: js.UndefOr[PolicyType]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListPoliciesForTargetRequest {
    def apply(
      TargetId: js.UndefOr[PolicyTargetId] = js.undefined,
      Filter: js.UndefOr[PolicyType] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListPoliciesForTargetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetId" -> TargetId.map { x => x.asInstanceOf[js.Any] },
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPoliciesForTargetRequest]
    }
  }

  @js.native
  trait ListPoliciesForTargetResponse extends js.Object {
    var Policies: js.UndefOr[Policies]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPoliciesForTargetResponse {
    def apply(
      Policies: js.UndefOr[Policies] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListPoliciesForTargetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policies" -> Policies.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPoliciesForTargetResponse]
    }
  }

  @js.native
  trait ListPoliciesRequest extends js.Object {
    var Filter: js.UndefOr[PolicyType]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListPoliciesRequest {
    def apply(
      Filter: js.UndefOr[PolicyType] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPoliciesRequest]
    }
  }

  @js.native
  trait ListPoliciesResponse extends js.Object {
    var Policies: js.UndefOr[Policies]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPoliciesResponse {
    def apply(
      Policies: js.UndefOr[Policies] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policies" -> Policies.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPoliciesResponse]
    }
  }

  @js.native
  trait ListRootsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListRootsRequest {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListRootsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRootsRequest]
    }
  }

  @js.native
  trait ListRootsResponse extends js.Object {
    var Roots: js.UndefOr[Roots]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRootsResponse {
    def apply(
      Roots: js.UndefOr[Roots] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListRootsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Roots" -> Roots.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRootsResponse]
    }
  }

  @js.native
  trait ListTargetsForPolicyRequest extends js.Object {
    var PolicyId: js.UndefOr[PolicyId]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListTargetsForPolicyRequest {
    def apply(
      PolicyId: js.UndefOr[PolicyId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListTargetsForPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTargetsForPolicyRequest]
    }
  }

  @js.native
  trait ListTargetsForPolicyResponse extends js.Object {
    var Targets: js.UndefOr[PolicyTargets]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTargetsForPolicyResponse {
    def apply(
      Targets: js.UndefOr[PolicyTargets] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTargetsForPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTargetsForPolicyResponse]
    }
  }

  @js.native
  trait MoveAccountRequest extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var SourceParentId: js.UndefOr[ParentId]
    var DestinationParentId: js.UndefOr[ParentId]
  }

  object MoveAccountRequest {
    def apply(
      AccountId: js.UndefOr[AccountId] = js.undefined,
      SourceParentId: js.UndefOr[ParentId] = js.undefined,
      DestinationParentId: js.UndefOr[ParentId] = js.undefined): MoveAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "SourceParentId" -> SourceParentId.map { x => x.asInstanceOf[js.Any] },
        "DestinationParentId" -> DestinationParentId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MoveAccountRequest]
    }
  }

  /**
   * <p>Contains details about an organization. An organization is a collection of accounts that are centrally managed together using consolidated billing, organized hierarchically with organizational units (OUs), and controlled with policies .</p>
   */
  @js.native
  trait Organization extends js.Object {
    var Id: js.UndefOr[OrganizationId]
    var FeatureSet: js.UndefOr[OrganizationFeatureSet]
    var MasterAccountEmail: js.UndefOr[Email]
    var Arn: js.UndefOr[OrganizationArn]
    var MasterAccountId: js.UndefOr[AccountId]
    var AvailablePolicyTypes: js.UndefOr[PolicyTypes]
    var MasterAccountArn: js.UndefOr[AccountArn]
  }

  object Organization {
    def apply(
      Id: js.UndefOr[OrganizationId] = js.undefined,
      FeatureSet: js.UndefOr[OrganizationFeatureSet] = js.undefined,
      MasterAccountEmail: js.UndefOr[Email] = js.undefined,
      Arn: js.UndefOr[OrganizationArn] = js.undefined,
      MasterAccountId: js.UndefOr[AccountId] = js.undefined,
      AvailablePolicyTypes: js.UndefOr[PolicyTypes] = js.undefined,
      MasterAccountArn: js.UndefOr[AccountArn] = js.undefined): Organization = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "FeatureSet" -> FeatureSet.map { x => x.asInstanceOf[js.Any] },
        "MasterAccountEmail" -> MasterAccountEmail.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "MasterAccountId" -> MasterAccountId.map { x => x.asInstanceOf[js.Any] },
        "AvailablePolicyTypes" -> AvailablePolicyTypes.map { x => x.asInstanceOf[js.Any] },
        "MasterAccountArn" -> MasterAccountArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Organization]
    }
  }

  object OrganizationFeatureSetEnum {
    val ALL = "ALL"
    val CONSOLIDATED_BILLING = "CONSOLIDATED_BILLING"

    val values = IndexedSeq(ALL, CONSOLIDATED_BILLING)
  }

  /**
   * <p>Contains details about an organizational unit (OU). An OU is a container of AWS accounts within a root of an organization. Policies that are attached to an OU apply to all accounts contained in that OU and in any child OUs.</p>
   */
  @js.native
  trait OrganizationalUnit extends js.Object {
    var Id: js.UndefOr[OrganizationalUnitId]
    var Arn: js.UndefOr[OrganizationalUnitArn]
    var Name: js.UndefOr[OrganizationalUnitName]
  }

  object OrganizationalUnit {
    def apply(
      Id: js.UndefOr[OrganizationalUnitId] = js.undefined,
      Arn: js.UndefOr[OrganizationalUnitArn] = js.undefined,
      Name: js.UndefOr[OrganizationalUnitName] = js.undefined): OrganizationalUnit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrganizationalUnit]
    }
  }

  /**
   * <p>Contains information about either a root or an organizational unit (OU) that can contain OUs or accounts in an organization.</p>
   */
  @js.native
  trait Parent extends js.Object {
    var Id: js.UndefOr[ParentId]
    var Type: js.UndefOr[ParentType]
  }

  object Parent {
    def apply(
      Id: js.UndefOr[ParentId] = js.undefined,
      Type: js.UndefOr[ParentType] = js.undefined): Parent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Parent]
    }
  }

  object ParentTypeEnum {
    val ROOT = "ROOT"
    val ORGANIZATIONAL_UNIT = "ORGANIZATIONAL_UNIT"

    val values = IndexedSeq(ROOT, ORGANIZATIONAL_UNIT)
  }

  /**
   * <p>Contains rules to be applied to the affected accounts. Policies can be attached directly to accounts, or to roots and OUs to affect all accounts in those hierarchies.</p>
   */
  @js.native
  trait Policy extends js.Object {
    var PolicySummary: js.UndefOr[PolicySummary]
    var Content: js.UndefOr[PolicyContent]
  }

  object Policy {
    def apply(
      PolicySummary: js.UndefOr[PolicySummary] = js.undefined,
      Content: js.UndefOr[PolicyContent] = js.undefined): Policy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicySummary" -> PolicySummary.map { x => x.asInstanceOf[js.Any] },
        "Content" -> Content.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Policy]
    }
  }

  /**
   * <p>Contains information about a policy, but does not include the content. To see the content of a policy, see <a>DescribePolicy</a>.</p>
   */
  @js.native
  trait PolicySummary extends js.Object {
    var Id: js.UndefOr[PolicyId]
    var Name: js.UndefOr[PolicyName]
    var Description: js.UndefOr[PolicyDescription]
    var Arn: js.UndefOr[PolicyArn]
    var AwsManaged: js.UndefOr[AwsManagedPolicy]
    var Type: js.UndefOr[PolicyType]
  }

  object PolicySummary {
    def apply(
      Id: js.UndefOr[PolicyId] = js.undefined,
      Name: js.UndefOr[PolicyName] = js.undefined,
      Description: js.UndefOr[PolicyDescription] = js.undefined,
      Arn: js.UndefOr[PolicyArn] = js.undefined,
      AwsManaged: js.UndefOr[AwsManagedPolicy] = js.undefined,
      Type: js.UndefOr[PolicyType] = js.undefined): PolicySummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "AwsManaged" -> AwsManaged.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicySummary]
    }
  }

  /**
   * <p>Contains information about a root, OU, or account that a policy is attached to.</p>
   */
  @js.native
  trait PolicyTargetSummary extends js.Object {
    var TargetId: js.UndefOr[PolicyTargetId]
    var Arn: js.UndefOr[GenericArn]
    var Name: js.UndefOr[TargetName]
    var Type: js.UndefOr[TargetType]
  }

  object PolicyTargetSummary {
    def apply(
      TargetId: js.UndefOr[PolicyTargetId] = js.undefined,
      Arn: js.UndefOr[GenericArn] = js.undefined,
      Name: js.UndefOr[TargetName] = js.undefined,
      Type: js.UndefOr[TargetType] = js.undefined): PolicyTargetSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetId" -> TargetId.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyTargetSummary]
    }
  }

  object PolicyTypeEnum {
    val SERVICE_CONTROL_POLICY = "SERVICE_CONTROL_POLICY"

    val values = IndexedSeq(SERVICE_CONTROL_POLICY)
  }

  object PolicyTypeStatusEnum {
    val ENABLED = "ENABLED"
    val PENDING_ENABLE = "PENDING_ENABLE"
    val PENDING_DISABLE = "PENDING_DISABLE"

    val values = IndexedSeq(ENABLED, PENDING_ENABLE, PENDING_DISABLE)
  }

  /**
   * <p>Contains information about a policy type and its status in the associated root.</p>
   */
  @js.native
  trait PolicyTypeSummary extends js.Object {
    var Type: js.UndefOr[PolicyType]
    var Status: js.UndefOr[PolicyTypeStatus]
  }

  object PolicyTypeSummary {
    def apply(
      Type: js.UndefOr[PolicyType] = js.undefined,
      Status: js.UndefOr[PolicyTypeStatus] = js.undefined): PolicyTypeSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyTypeSummary]
    }
  }

  @js.native
  trait RemoveAccountFromOrganizationRequest extends js.Object {
    var AccountId: js.UndefOr[AccountId]
  }

  object RemoveAccountFromOrganizationRequest {
    def apply(
      AccountId: js.UndefOr[AccountId] = js.undefined): RemoveAccountFromOrganizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveAccountFromOrganizationRequest]
    }
  }

  /**
   * <p>Contains details about a root. A root is a top-level parent node in the hierarchy of an organization that can contain organizational units (OUs) and accounts. Every root contains every AWS account in the organization. Each root enables the accounts to be organized in a different way and to have different policy types enabled for use in that root.</p>
   */
  @js.native
  trait Root extends js.Object {
    var Id: js.UndefOr[RootId]
    var Arn: js.UndefOr[RootArn]
    var Name: js.UndefOr[RootName]
    var PolicyTypes: js.UndefOr[PolicyTypes]
  }

  object Root {
    def apply(
      Id: js.UndefOr[RootId] = js.undefined,
      Arn: js.UndefOr[RootArn] = js.undefined,
      Name: js.UndefOr[RootName] = js.undefined,
      PolicyTypes: js.UndefOr[PolicyTypes] = js.undefined): Root = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "PolicyTypes" -> PolicyTypes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Root]
    }
  }

  object TargetTypeEnum {
    val ACCOUNT = "ACCOUNT"
    val ORGANIZATIONAL_UNIT = "ORGANIZATIONAL_UNIT"
    val ROOT = "ROOT"

    val values = IndexedSeq(ACCOUNT, ORGANIZATIONAL_UNIT, ROOT)
  }

  @js.native
  trait UpdateOrganizationalUnitRequest extends js.Object {
    var OrganizationalUnitId: js.UndefOr[OrganizationalUnitId]
    var Name: js.UndefOr[OrganizationalUnitName]
  }

  object UpdateOrganizationalUnitRequest {
    def apply(
      OrganizationalUnitId: js.UndefOr[OrganizationalUnitId] = js.undefined,
      Name: js.UndefOr[OrganizationalUnitName] = js.undefined): UpdateOrganizationalUnitRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationalUnitId" -> OrganizationalUnitId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateOrganizationalUnitRequest]
    }
  }

  @js.native
  trait UpdateOrganizationalUnitResponse extends js.Object {
    var OrganizationalUnit: js.UndefOr[OrganizationalUnit]
  }

  object UpdateOrganizationalUnitResponse {
    def apply(
      OrganizationalUnit: js.UndefOr[OrganizationalUnit] = js.undefined): UpdateOrganizationalUnitResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationalUnit" -> OrganizationalUnit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateOrganizationalUnitResponse]
    }
  }

  @js.native
  trait UpdatePolicyRequest extends js.Object {
    var PolicyId: js.UndefOr[PolicyId]
    var Name: js.UndefOr[PolicyName]
    var Description: js.UndefOr[PolicyDescription]
    var Content: js.UndefOr[PolicyContent]
  }

  object UpdatePolicyRequest {
    def apply(
      PolicyId: js.UndefOr[PolicyId] = js.undefined,
      Name: js.UndefOr[PolicyName] = js.undefined,
      Description: js.UndefOr[PolicyDescription] = js.undefined,
      Content: js.UndefOr[PolicyContent] = js.undefined): UpdatePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Content" -> Content.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePolicyRequest]
    }
  }

  @js.native
  trait UpdatePolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  object UpdatePolicyResponse {
    def apply(
      Policy: js.UndefOr[Policy] = js.undefined): UpdatePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePolicyResponse]
    }
  }
}
