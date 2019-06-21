package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object organizations {
  type AccountArn                 = String
  type AccountId                  = String
  type AccountJoinedMethod        = String
  type AccountName                = String
  type AccountStatus              = String
  type Accounts                   = js.Array[Account]
  type ActionType                 = String
  type AwsManagedPolicy           = Boolean
  type ChildId                    = String
  type ChildType                  = String
  type Children                   = js.Array[Child]
  type CreateAccountFailureReason = String
  type CreateAccountRequestId     = String
  type CreateAccountState         = String
  type CreateAccountStates        = js.Array[CreateAccountState]
  type CreateAccountStatuses      = js.Array[CreateAccountStatus]
  type Email                      = String
  type EnabledServicePrincipals   = js.Array[EnabledServicePrincipal]
  type GenericArn                 = String
  type HandshakeArn               = String
  type HandshakeId                = String
  type HandshakeNotes             = String
  type HandshakeParties           = js.Array[HandshakeParty]
  type HandshakePartyId           = String
  type HandshakePartyType         = String
  type HandshakeResourceType      = String
  type HandshakeResourceValue     = String
  type HandshakeResources         = js.Array[HandshakeResource]
  type HandshakeState             = String
  type Handshakes                 = js.Array[Handshake]
  type IAMUserAccessToBilling     = String
  type MaxResults                 = Int
  type NextToken                  = String
  type OrganizationArn            = String
  type OrganizationFeatureSet     = String
  type OrganizationId             = String
  type OrganizationalUnitArn      = String
  type OrganizationalUnitId       = String
  type OrganizationalUnitName     = String
  type OrganizationalUnits        = js.Array[OrganizationalUnit]
  type ParentId                   = String
  type ParentType                 = String
  type Parents                    = js.Array[Parent]
  type Policies                   = js.Array[PolicySummary]
  type PolicyArn                  = String
  type PolicyContent              = String
  type PolicyDescription          = String
  type PolicyId                   = String
  type PolicyName                 = String
  type PolicyTargetId             = String
  type PolicyTargets              = js.Array[PolicyTargetSummary]
  type PolicyType                 = String
  type PolicyTypeStatus           = String
  type PolicyTypes                = js.Array[PolicyTypeSummary]
  type RoleName                   = String
  type RootArn                    = String
  type RootId                     = String
  type RootName                   = String
  type Roots                      = js.Array[Root]
  type ServicePrincipal           = String
  type TargetName                 = String
  type TargetType                 = String
  type Timestamp                  = js.Date

  implicit final class OrganizationsOps(val service: Organizations) extends AnyVal {

    def acceptHandshakeFuture(params: AcceptHandshakeRequest): Future[AcceptHandshakeResponse] =
      service.acceptHandshake(params).promise.toFuture
    def attachPolicyFuture(params: AttachPolicyRequest): Future[js.Object] =
      service.attachPolicy(params).promise.toFuture
    def cancelHandshakeFuture(params: CancelHandshakeRequest): Future[CancelHandshakeResponse] =
      service.cancelHandshake(params).promise.toFuture
    def createAccountFuture(params: CreateAccountRequest): Future[CreateAccountResponse] =
      service.createAccount(params).promise.toFuture
    def createOrganizationFuture(params: CreateOrganizationRequest): Future[CreateOrganizationResponse] =
      service.createOrganization(params).promise.toFuture
    def createOrganizationalUnitFuture(
        params: CreateOrganizationalUnitRequest
    ): Future[CreateOrganizationalUnitResponse] = service.createOrganizationalUnit(params).promise.toFuture
    def createPolicyFuture(params: CreatePolicyRequest): Future[CreatePolicyResponse] =
      service.createPolicy(params).promise.toFuture
    def declineHandshakeFuture(params: DeclineHandshakeRequest): Future[DeclineHandshakeResponse] =
      service.declineHandshake(params).promise.toFuture
    def deleteOrganizationFuture(): Future[js.Object] = service.deleteOrganization().promise.toFuture
    def deleteOrganizationalUnitFuture(params: DeleteOrganizationalUnitRequest): Future[js.Object] =
      service.deleteOrganizationalUnit(params).promise.toFuture
    def deletePolicyFuture(params: DeletePolicyRequest): Future[js.Object] =
      service.deletePolicy(params).promise.toFuture
    def describeAccountFuture(params: DescribeAccountRequest): Future[DescribeAccountResponse] =
      service.describeAccount(params).promise.toFuture
    def describeCreateAccountStatusFuture(
        params: DescribeCreateAccountStatusRequest
    ): Future[DescribeCreateAccountStatusResponse] = service.describeCreateAccountStatus(params).promise.toFuture
    def describeHandshakeFuture(params: DescribeHandshakeRequest): Future[DescribeHandshakeResponse] =
      service.describeHandshake(params).promise.toFuture
    def describeOrganizationFuture(): Future[DescribeOrganizationResponse] =
      service.describeOrganization().promise.toFuture
    def describeOrganizationalUnitFuture(
        params: DescribeOrganizationalUnitRequest
    ): Future[DescribeOrganizationalUnitResponse] = service.describeOrganizationalUnit(params).promise.toFuture
    def describePolicyFuture(params: DescribePolicyRequest): Future[DescribePolicyResponse] =
      service.describePolicy(params).promise.toFuture
    def detachPolicyFuture(params: DetachPolicyRequest): Future[js.Object] =
      service.detachPolicy(params).promise.toFuture
    def disableAWSServiceAccessFuture(params: DisableAWSServiceAccessRequest): Future[js.Object] =
      service.disableAWSServiceAccess(params).promise.toFuture
    def disablePolicyTypeFuture(params: DisablePolicyTypeRequest): Future[DisablePolicyTypeResponse] =
      service.disablePolicyType(params).promise.toFuture
    def enableAWSServiceAccessFuture(params: EnableAWSServiceAccessRequest): Future[js.Object] =
      service.enableAWSServiceAccess(params).promise.toFuture
    def enableAllFeaturesFuture(params: EnableAllFeaturesRequest): Future[EnableAllFeaturesResponse] =
      service.enableAllFeatures(params).promise.toFuture
    def enablePolicyTypeFuture(params: EnablePolicyTypeRequest): Future[EnablePolicyTypeResponse] =
      service.enablePolicyType(params).promise.toFuture
    def inviteAccountToOrganizationFuture(
        params: InviteAccountToOrganizationRequest
    ): Future[InviteAccountToOrganizationResponse]   = service.inviteAccountToOrganization(params).promise.toFuture
    def leaveOrganizationFuture(): Future[js.Object] = service.leaveOrganization().promise.toFuture
    def listAWSServiceAccessForOrganizationFuture(
        params: ListAWSServiceAccessForOrganizationRequest
    ): Future[ListAWSServiceAccessForOrganizationResponse] =
      service.listAWSServiceAccessForOrganization(params).promise.toFuture
    def listAccountsForParentFuture(params: ListAccountsForParentRequest): Future[ListAccountsForParentResponse] =
      service.listAccountsForParent(params).promise.toFuture
    def listAccountsFuture(params: ListAccountsRequest): Future[ListAccountsResponse] =
      service.listAccounts(params).promise.toFuture
    def listChildrenFuture(params: ListChildrenRequest): Future[ListChildrenResponse] =
      service.listChildren(params).promise.toFuture
    def listCreateAccountStatusFuture(params: ListCreateAccountStatusRequest): Future[ListCreateAccountStatusResponse] =
      service.listCreateAccountStatus(params).promise.toFuture
    def listHandshakesForAccountFuture(
        params: ListHandshakesForAccountRequest
    ): Future[ListHandshakesForAccountResponse] = service.listHandshakesForAccount(params).promise.toFuture
    def listHandshakesForOrganizationFuture(
        params: ListHandshakesForOrganizationRequest
    ): Future[ListHandshakesForOrganizationResponse] = service.listHandshakesForOrganization(params).promise.toFuture
    def listOrganizationalUnitsForParentFuture(
        params: ListOrganizationalUnitsForParentRequest
    ): Future[ListOrganizationalUnitsForParentResponse] =
      service.listOrganizationalUnitsForParent(params).promise.toFuture
    def listParentsFuture(params: ListParentsRequest): Future[ListParentsResponse] =
      service.listParents(params).promise.toFuture
    def listPoliciesForTargetFuture(params: ListPoliciesForTargetRequest): Future[ListPoliciesForTargetResponse] =
      service.listPoliciesForTarget(params).promise.toFuture
    def listPoliciesFuture(params: ListPoliciesRequest): Future[ListPoliciesResponse] =
      service.listPolicies(params).promise.toFuture
    def listRootsFuture(params: ListRootsRequest): Future[ListRootsResponse] =
      service.listRoots(params).promise.toFuture
    def listTargetsForPolicyFuture(params: ListTargetsForPolicyRequest): Future[ListTargetsForPolicyResponse] =
      service.listTargetsForPolicy(params).promise.toFuture
    def moveAccountFuture(params: MoveAccountRequest): Future[js.Object] = service.moveAccount(params).promise.toFuture
    def removeAccountFromOrganizationFuture(params: RemoveAccountFromOrganizationRequest): Future[js.Object] =
      service.removeAccountFromOrganization(params).promise.toFuture
    def updateOrganizationalUnitFuture(
        params: UpdateOrganizationalUnitRequest
    ): Future[UpdateOrganizationalUnitResponse] = service.updateOrganizationalUnit(params).promise.toFuture
    def updatePolicyFuture(params: UpdatePolicyRequest): Future[UpdatePolicyResponse] =
      service.updatePolicy(params).promise.toFuture
  }
}

package organizations {
  @js.native
  @JSImport("aws-sdk", "Organizations")
  class Organizations() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptHandshake(params: AcceptHandshakeRequest): Request[AcceptHandshakeResponse]          = js.native
    def attachPolicy(params: AttachPolicyRequest): Request[js.Object]                              = js.native
    def cancelHandshake(params: CancelHandshakeRequest): Request[CancelHandshakeResponse]          = js.native
    def createAccount(params: CreateAccountRequest): Request[CreateAccountResponse]                = js.native
    def createOrganization(params: CreateOrganizationRequest): Request[CreateOrganizationResponse] = js.native
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
    ): Request[DescribeCreateAccountStatusResponse]                                             = js.native
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
    def listTargetsForPolicy(params: ListTargetsForPolicyRequest): Request[ListTargetsForPolicyResponse]    = js.native
    def moveAccount(params: MoveAccountRequest): Request[js.Object]                                         = js.native
    def removeAccountFromOrganization(params: RemoveAccountFromOrganizationRequest): Request[js.Object]     = js.native
    def updateOrganizationalUnit(params: UpdateOrganizationalUnitRequest): Request[UpdateOrganizationalUnitResponse] =
      js.native
    def updatePolicy(params: UpdatePolicyRequest): Request[UpdatePolicyResponse] = js.native
  }

  @js.native
  trait AcceptHandshakeRequest extends js.Object {
    var HandshakeId: HandshakeId
  }

  object AcceptHandshakeRequest {
    def apply(
        HandshakeId: HandshakeId
    ): AcceptHandshakeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HandshakeId" -> HandshakeId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptHandshakeRequest]
    }
  }

  @js.native
  trait AcceptHandshakeResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  object AcceptHandshakeResponse {
    def apply(
        Handshake: js.UndefOr[Handshake] = js.undefined
    ): AcceptHandshakeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Handshake" -> Handshake.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptHandshakeResponse]
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
    def apply(
        Arn: js.UndefOr[AccountArn] = js.undefined,
        Email: js.UndefOr[Email] = js.undefined,
        Id: js.UndefOr[AccountId] = js.undefined,
        JoinedMethod: js.UndefOr[AccountJoinedMethod] = js.undefined,
        JoinedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[AccountName] = js.undefined,
        Status: js.UndefOr[AccountStatus] = js.undefined
    ): Account = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Email" -> Email.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JoinedMethod" -> JoinedMethod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JoinedTimestamp" -> JoinedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Account]
    }
  }

  object AccountJoinedMethodEnum {
    val INVITED = "INVITED"
    val CREATED = "CREATED"

    val values = IndexedSeq(INVITED, CREATED)
  }

  object AccountStatusEnum {
    val ACTIVE    = "ACTIVE"
    val SUSPENDED = "SUSPENDED"

    val values = IndexedSeq(ACTIVE, SUSPENDED)
  }

  object ActionTypeEnum {
    val INVITE                                = "INVITE"
    val ENABLE_ALL_FEATURES                   = "ENABLE_ALL_FEATURES"
    val APPROVE_ALL_FEATURES                  = "APPROVE_ALL_FEATURES"
    val ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE = "ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE"

    val values = IndexedSeq(INVITE, ENABLE_ALL_FEATURES, APPROVE_ALL_FEATURES, ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE)
  }

  @js.native
  trait AttachPolicyRequest extends js.Object {
    var PolicyId: PolicyId
    var TargetId: PolicyTargetId
  }

  object AttachPolicyRequest {
    def apply(
        PolicyId: PolicyId,
        TargetId: PolicyTargetId
    ): AttachPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.asInstanceOf[js.Any],
        "TargetId" -> TargetId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachPolicyRequest]
    }
  }

  @js.native
  trait CancelHandshakeRequest extends js.Object {
    var HandshakeId: HandshakeId
  }

  object CancelHandshakeRequest {
    def apply(
        HandshakeId: HandshakeId
    ): CancelHandshakeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HandshakeId" -> HandshakeId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelHandshakeRequest]
    }
  }

  @js.native
  trait CancelHandshakeResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  object CancelHandshakeResponse {
    def apply(
        Handshake: js.UndefOr[Handshake] = js.undefined
    ): CancelHandshakeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Handshake" -> Handshake.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelHandshakeResponse]
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
    def apply(
        Id: js.UndefOr[ChildId] = js.undefined,
        Type: js.UndefOr[ChildType] = js.undefined
    ): Child = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Child]
    }
  }

  object ChildTypeEnum {
    val ACCOUNT             = "ACCOUNT"
    val ORGANIZATIONAL_UNIT = "ORGANIZATIONAL_UNIT"

    val values = IndexedSeq(ACCOUNT, ORGANIZATIONAL_UNIT)
  }

  object CreateAccountFailureReasonEnum {
    val ACCOUNT_LIMIT_EXCEEDED          = "ACCOUNT_LIMIT_EXCEEDED"
    val EMAIL_ALREADY_EXISTS            = "EMAIL_ALREADY_EXISTS"
    val INVALID_ADDRESS                 = "INVALID_ADDRESS"
    val INVALID_EMAIL                   = "INVALID_EMAIL"
    val CONCURRENT_ACCOUNT_MODIFICATION = "CONCURRENT_ACCOUNT_MODIFICATION"
    val INTERNAL_FAILURE                = "INTERNAL_FAILURE"

    val values = IndexedSeq(
      ACCOUNT_LIMIT_EXCEEDED,
      EMAIL_ALREADY_EXISTS,
      INVALID_ADDRESS,
      INVALID_EMAIL,
      CONCURRENT_ACCOUNT_MODIFICATION,
      INTERNAL_FAILURE
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
    def apply(
        AccountName: AccountName,
        Email: Email,
        IamUserAccessToBilling: js.UndefOr[IAMUserAccessToBilling] = js.undefined,
        RoleName: js.UndefOr[RoleName] = js.undefined
    ): CreateAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountName" -> AccountName.asInstanceOf[js.Any],
        "Email"       -> Email.asInstanceOf[js.Any],
        "IamUserAccessToBilling" -> IamUserAccessToBilling.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleName" -> RoleName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAccountRequest]
    }
  }

  @js.native
  trait CreateAccountResponse extends js.Object {
    var CreateAccountStatus: js.UndefOr[CreateAccountStatus]
  }

  object CreateAccountResponse {
    def apply(
        CreateAccountStatus: js.UndefOr[CreateAccountStatus] = js.undefined
    ): CreateAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreateAccountStatus" -> CreateAccountStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAccountResponse]
    }
  }

  object CreateAccountStateEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val SUCCEEDED   = "SUCCEEDED"
    val FAILED      = "FAILED"

    val values = IndexedSeq(IN_PROGRESS, SUCCEEDED, FAILED)
  }

  /**
    * Contains the status about a <a>CreateAccount</a> request to create an AWS account in an organization.
    */
  @js.native
  trait CreateAccountStatus extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var AccountName: js.UndefOr[AccountName]
    var CompletedTimestamp: js.UndefOr[Timestamp]
    var FailureReason: js.UndefOr[CreateAccountFailureReason]
    var Id: js.UndefOr[CreateAccountRequestId]
    var RequestedTimestamp: js.UndefOr[Timestamp]
    var State: js.UndefOr[CreateAccountState]
  }

  object CreateAccountStatus {
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        AccountName: js.UndefOr[AccountName] = js.undefined,
        CompletedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        FailureReason: js.UndefOr[CreateAccountFailureReason] = js.undefined,
        Id: js.UndefOr[CreateAccountRequestId] = js.undefined,
        RequestedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        State: js.UndefOr[CreateAccountState] = js.undefined
    ): CreateAccountStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AccountName" -> AccountName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CompletedTimestamp" -> CompletedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FailureReason" -> FailureReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequestedTimestamp" -> RequestedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAccountStatus]
    }
  }

  @js.native
  trait CreateOrganizationRequest extends js.Object {
    var FeatureSet: js.UndefOr[OrganizationFeatureSet]
  }

  object CreateOrganizationRequest {
    def apply(
        FeatureSet: js.UndefOr[OrganizationFeatureSet] = js.undefined
    ): CreateOrganizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FeatureSet" -> FeatureSet.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOrganizationRequest]
    }
  }

  @js.native
  trait CreateOrganizationResponse extends js.Object {
    var Organization: js.UndefOr[Organization]
  }

  object CreateOrganizationResponse {
    def apply(
        Organization: js.UndefOr[Organization] = js.undefined
    ): CreateOrganizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Organization" -> Organization.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOrganizationResponse]
    }
  }

  @js.native
  trait CreateOrganizationalUnitRequest extends js.Object {
    var Name: OrganizationalUnitName
    var ParentId: ParentId
  }

  object CreateOrganizationalUnitRequest {
    def apply(
        Name: OrganizationalUnitName,
        ParentId: ParentId
    ): CreateOrganizationalUnitRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"     -> Name.asInstanceOf[js.Any],
        "ParentId" -> ParentId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOrganizationalUnitRequest]
    }
  }

  @js.native
  trait CreateOrganizationalUnitResponse extends js.Object {
    var OrganizationalUnit: js.UndefOr[OrganizationalUnit]
  }

  object CreateOrganizationalUnitResponse {
    def apply(
        OrganizationalUnit: js.UndefOr[OrganizationalUnit] = js.undefined
    ): CreateOrganizationalUnitResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationalUnit" -> OrganizationalUnit.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOrganizationalUnitResponse]
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
    def apply(
        Content: PolicyContent,
        Description: PolicyDescription,
        Name: PolicyName,
        Type: PolicyType
    ): CreatePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Content"     -> Content.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "Name"        -> Name.asInstanceOf[js.Any],
        "Type"        -> Type.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePolicyRequest]
    }
  }

  @js.native
  trait CreatePolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  object CreatePolicyResponse {
    def apply(
        Policy: js.UndefOr[Policy] = js.undefined
    ): CreatePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePolicyResponse]
    }
  }

  @js.native
  trait DeclineHandshakeRequest extends js.Object {
    var HandshakeId: HandshakeId
  }

  object DeclineHandshakeRequest {
    def apply(
        HandshakeId: HandshakeId
    ): DeclineHandshakeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HandshakeId" -> HandshakeId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeclineHandshakeRequest]
    }
  }

  @js.native
  trait DeclineHandshakeResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  object DeclineHandshakeResponse {
    def apply(
        Handshake: js.UndefOr[Handshake] = js.undefined
    ): DeclineHandshakeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Handshake" -> Handshake.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeclineHandshakeResponse]
    }
  }

  @js.native
  trait DeleteOrganizationalUnitRequest extends js.Object {
    var OrganizationalUnitId: OrganizationalUnitId
  }

  object DeleteOrganizationalUnitRequest {
    def apply(
        OrganizationalUnitId: OrganizationalUnitId
    ): DeleteOrganizationalUnitRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationalUnitId" -> OrganizationalUnitId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteOrganizationalUnitRequest]
    }
  }

  @js.native
  trait DeletePolicyRequest extends js.Object {
    var PolicyId: PolicyId
  }

  object DeletePolicyRequest {
    def apply(
        PolicyId: PolicyId
    ): DeletePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePolicyRequest]
    }
  }

  @js.native
  trait DescribeAccountRequest extends js.Object {
    var AccountId: AccountId
  }

  object DescribeAccountRequest {
    def apply(
        AccountId: AccountId
    ): DescribeAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountRequest]
    }
  }

  @js.native
  trait DescribeAccountResponse extends js.Object {
    var Account: js.UndefOr[Account]
  }

  object DescribeAccountResponse {
    def apply(
        Account: js.UndefOr[Account] = js.undefined
    ): DescribeAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Account" -> Account.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountResponse]
    }
  }

  @js.native
  trait DescribeCreateAccountStatusRequest extends js.Object {
    var CreateAccountRequestId: CreateAccountRequestId
  }

  object DescribeCreateAccountStatusRequest {
    def apply(
        CreateAccountRequestId: CreateAccountRequestId
    ): DescribeCreateAccountStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreateAccountRequestId" -> CreateAccountRequestId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCreateAccountStatusRequest]
    }
  }

  @js.native
  trait DescribeCreateAccountStatusResponse extends js.Object {
    var CreateAccountStatus: js.UndefOr[CreateAccountStatus]
  }

  object DescribeCreateAccountStatusResponse {
    def apply(
        CreateAccountStatus: js.UndefOr[CreateAccountStatus] = js.undefined
    ): DescribeCreateAccountStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreateAccountStatus" -> CreateAccountStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCreateAccountStatusResponse]
    }
  }

  @js.native
  trait DescribeHandshakeRequest extends js.Object {
    var HandshakeId: HandshakeId
  }

  object DescribeHandshakeRequest {
    def apply(
        HandshakeId: HandshakeId
    ): DescribeHandshakeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HandshakeId" -> HandshakeId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHandshakeRequest]
    }
  }

  @js.native
  trait DescribeHandshakeResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  object DescribeHandshakeResponse {
    def apply(
        Handshake: js.UndefOr[Handshake] = js.undefined
    ): DescribeHandshakeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Handshake" -> Handshake.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHandshakeResponse]
    }
  }

  @js.native
  trait DescribeOrganizationResponse extends js.Object {
    var Organization: js.UndefOr[Organization]
  }

  object DescribeOrganizationResponse {
    def apply(
        Organization: js.UndefOr[Organization] = js.undefined
    ): DescribeOrganizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Organization" -> Organization.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOrganizationResponse]
    }
  }

  @js.native
  trait DescribeOrganizationalUnitRequest extends js.Object {
    var OrganizationalUnitId: OrganizationalUnitId
  }

  object DescribeOrganizationalUnitRequest {
    def apply(
        OrganizationalUnitId: OrganizationalUnitId
    ): DescribeOrganizationalUnitRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationalUnitId" -> OrganizationalUnitId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOrganizationalUnitRequest]
    }
  }

  @js.native
  trait DescribeOrganizationalUnitResponse extends js.Object {
    var OrganizationalUnit: js.UndefOr[OrganizationalUnit]
  }

  object DescribeOrganizationalUnitResponse {
    def apply(
        OrganizationalUnit: js.UndefOr[OrganizationalUnit] = js.undefined
    ): DescribeOrganizationalUnitResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationalUnit" -> OrganizationalUnit.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOrganizationalUnitResponse]
    }
  }

  @js.native
  trait DescribePolicyRequest extends js.Object {
    var PolicyId: PolicyId
  }

  object DescribePolicyRequest {
    def apply(
        PolicyId: PolicyId
    ): DescribePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePolicyRequest]
    }
  }

  @js.native
  trait DescribePolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  object DescribePolicyResponse {
    def apply(
        Policy: js.UndefOr[Policy] = js.undefined
    ): DescribePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePolicyResponse]
    }
  }

  @js.native
  trait DetachPolicyRequest extends js.Object {
    var PolicyId: PolicyId
    var TargetId: PolicyTargetId
  }

  object DetachPolicyRequest {
    def apply(
        PolicyId: PolicyId,
        TargetId: PolicyTargetId
    ): DetachPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.asInstanceOf[js.Any],
        "TargetId" -> TargetId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachPolicyRequest]
    }
  }

  @js.native
  trait DisableAWSServiceAccessRequest extends js.Object {
    var ServicePrincipal: ServicePrincipal
  }

  object DisableAWSServiceAccessRequest {
    def apply(
        ServicePrincipal: ServicePrincipal
    ): DisableAWSServiceAccessRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServicePrincipal" -> ServicePrincipal.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableAWSServiceAccessRequest]
    }
  }

  @js.native
  trait DisablePolicyTypeRequest extends js.Object {
    var PolicyType: PolicyType
    var RootId: RootId
  }

  object DisablePolicyTypeRequest {
    def apply(
        PolicyType: PolicyType,
        RootId: RootId
    ): DisablePolicyTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyType" -> PolicyType.asInstanceOf[js.Any],
        "RootId"     -> RootId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisablePolicyTypeRequest]
    }
  }

  @js.native
  trait DisablePolicyTypeResponse extends js.Object {
    var Root: js.UndefOr[Root]
  }

  object DisablePolicyTypeResponse {
    def apply(
        Root: js.UndefOr[Root] = js.undefined
    ): DisablePolicyTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Root" -> Root.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisablePolicyTypeResponse]
    }
  }

  @js.native
  trait EnableAWSServiceAccessRequest extends js.Object {
    var ServicePrincipal: ServicePrincipal
  }

  object EnableAWSServiceAccessRequest {
    def apply(
        ServicePrincipal: ServicePrincipal
    ): EnableAWSServiceAccessRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServicePrincipal" -> ServicePrincipal.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableAWSServiceAccessRequest]
    }
  }

  @js.native
  trait EnableAllFeaturesRequest extends js.Object {}

  object EnableAllFeaturesRequest {
    def apply(
        ): EnableAllFeaturesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableAllFeaturesRequest]
    }
  }

  @js.native
  trait EnableAllFeaturesResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  object EnableAllFeaturesResponse {
    def apply(
        Handshake: js.UndefOr[Handshake] = js.undefined
    ): EnableAllFeaturesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Handshake" -> Handshake.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableAllFeaturesResponse]
    }
  }

  @js.native
  trait EnablePolicyTypeRequest extends js.Object {
    var PolicyType: PolicyType
    var RootId: RootId
  }

  object EnablePolicyTypeRequest {
    def apply(
        PolicyType: PolicyType,
        RootId: RootId
    ): EnablePolicyTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyType" -> PolicyType.asInstanceOf[js.Any],
        "RootId"     -> RootId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnablePolicyTypeRequest]
    }
  }

  @js.native
  trait EnablePolicyTypeResponse extends js.Object {
    var Root: js.UndefOr[Root]
  }

  object EnablePolicyTypeResponse {
    def apply(
        Root: js.UndefOr[Root] = js.undefined
    ): EnablePolicyTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Root" -> Root.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnablePolicyTypeResponse]
    }
  }

  /**
    * A structure that contains details of a service principal that is enabled to integrate with AWS Organizations.
    */
  @js.native
  trait EnabledServicePrincipal extends js.Object {
    var DateEnabled: js.UndefOr[Timestamp]
    var ServicePrincipal: js.UndefOr[ServicePrincipal]
  }

  object EnabledServicePrincipal {
    def apply(
        DateEnabled: js.UndefOr[Timestamp] = js.undefined,
        ServicePrincipal: js.UndefOr[ServicePrincipal] = js.undefined
    ): EnabledServicePrincipal = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DateEnabled" -> DateEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServicePrincipal" -> ServicePrincipal.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnabledServicePrincipal]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpirationTimestamp" -> ExpirationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Parties" -> Parties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequestedTimestamp" -> RequestedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Resources" -> Resources.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Handshake]
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
    def apply(
        ActionType: js.UndefOr[ActionType] = js.undefined,
        ParentHandshakeId: js.UndefOr[HandshakeId] = js.undefined
    ): HandshakeFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActionType" -> ActionType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParentHandshakeId" -> ParentHandshakeId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HandshakeFilter]
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
    def apply(
        Id: HandshakePartyId,
        Type: HandshakePartyType
    ): HandshakeParty = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id"   -> Id.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HandshakeParty]
    }
  }

  object HandshakePartyTypeEnum {
    val ACCOUNT      = "ACCOUNT"
    val ORGANIZATION = "ORGANIZATION"
    val EMAIL        = "EMAIL"

    val values = IndexedSeq(ACCOUNT, ORGANIZATION, EMAIL)
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
    def apply(
        Resources: js.UndefOr[HandshakeResources] = js.undefined,
        Type: js.UndefOr[HandshakeResourceType] = js.undefined,
        Value: js.UndefOr[HandshakeResourceValue] = js.undefined
    ): HandshakeResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Resources" -> Resources.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HandshakeResource]
    }
  }

  object HandshakeResourceTypeEnum {
    val ACCOUNT                  = "ACCOUNT"
    val ORGANIZATION             = "ORGANIZATION"
    val ORGANIZATION_FEATURE_SET = "ORGANIZATION_FEATURE_SET"
    val EMAIL                    = "EMAIL"
    val MASTER_EMAIL             = "MASTER_EMAIL"
    val MASTER_NAME              = "MASTER_NAME"
    val NOTES                    = "NOTES"
    val PARENT_HANDSHAKE         = "PARENT_HANDSHAKE"

    val values = IndexedSeq(
      ACCOUNT,
      ORGANIZATION,
      ORGANIZATION_FEATURE_SET,
      EMAIL,
      MASTER_EMAIL,
      MASTER_NAME,
      NOTES,
      PARENT_HANDSHAKE
    )
  }

  object HandshakeStateEnum {
    val REQUESTED = "REQUESTED"
    val OPEN      = "OPEN"
    val CANCELED  = "CANCELED"
    val ACCEPTED  = "ACCEPTED"
    val DECLINED  = "DECLINED"
    val EXPIRED   = "EXPIRED"

    val values = IndexedSeq(REQUESTED, OPEN, CANCELED, ACCEPTED, DECLINED, EXPIRED)
  }

  object IAMUserAccessToBillingEnum {
    val ALLOW = "ALLOW"
    val DENY  = "DENY"

    val values = IndexedSeq(ALLOW, DENY)
  }

  @js.native
  trait InviteAccountToOrganizationRequest extends js.Object {
    var Target: HandshakeParty
    var Notes: js.UndefOr[HandshakeNotes]
  }

  object InviteAccountToOrganizationRequest {
    def apply(
        Target: HandshakeParty,
        Notes: js.UndefOr[HandshakeNotes] = js.undefined
    ): InviteAccountToOrganizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Target" -> Target.asInstanceOf[js.Any],
        "Notes" -> Notes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InviteAccountToOrganizationRequest]
    }
  }

  @js.native
  trait InviteAccountToOrganizationResponse extends js.Object {
    var Handshake: js.UndefOr[Handshake]
  }

  object InviteAccountToOrganizationResponse {
    def apply(
        Handshake: js.UndefOr[Handshake] = js.undefined
    ): InviteAccountToOrganizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Handshake" -> Handshake.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InviteAccountToOrganizationResponse]
    }
  }

  @js.native
  trait ListAWSServiceAccessForOrganizationRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAWSServiceAccessForOrganizationRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAWSServiceAccessForOrganizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[ListAWSServiceAccessForOrganizationRequest]
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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAWSServiceAccessForOrganizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EnabledServicePrincipals" -> EnabledServicePrincipals.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[ListAWSServiceAccessForOrganizationResponse]
    }
  }

  @js.native
  trait ListAccountsForParentRequest extends js.Object {
    var ParentId: ParentId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAccountsForParentRequest {
    def apply(
        ParentId: ParentId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAccountsForParentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParentId" -> ParentId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAccountsForParentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Accounts" -> Accounts.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAccountsForParentResponse]
    }
  }

  @js.native
  trait ListAccountsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAccountsRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAccountsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAccountsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Accounts" -> Accounts.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAccountsResponse]
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
    def apply(
        ChildType: ChildType,
        ParentId: ParentId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChildrenRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChildType" -> ChildType.asInstanceOf[js.Any],
        "ParentId"  -> ParentId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChildrenResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Children" -> Children.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListChildrenResponse]
    }
  }

  @js.native
  trait ListCreateAccountStatusRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var States: js.UndefOr[CreateAccountStates]
  }

  object ListCreateAccountStatusRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        States: js.UndefOr[CreateAccountStates] = js.undefined
    ): ListCreateAccountStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "States" -> States.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCreateAccountStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreateAccountStatuses" -> CreateAccountStatuses.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCreateAccountStatusResponse]
    }
  }

  @js.native
  trait ListHandshakesForAccountRequest extends js.Object {
    var Filter: js.UndefOr[HandshakeFilter]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHandshakesForAccountRequest {
    def apply(
        Filter: js.UndefOr[HandshakeFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListHandshakesForAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filter" -> Filter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListHandshakesForAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Handshakes" -> Handshakes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHandshakesForAccountResponse]
    }
  }

  @js.native
  trait ListHandshakesForOrganizationRequest extends js.Object {
    var Filter: js.UndefOr[HandshakeFilter]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHandshakesForOrganizationRequest {
    def apply(
        Filter: js.UndefOr[HandshakeFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListHandshakesForOrganizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filter" -> Filter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListHandshakesForOrganizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Handshakes" -> Handshakes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHandshakesForOrganizationResponse]
    }
  }

  @js.native
  trait ListOrganizationalUnitsForParentRequest extends js.Object {
    var ParentId: ParentId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListOrganizationalUnitsForParentRequest {
    def apply(
        ParentId: ParentId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListOrganizationalUnitsForParentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParentId" -> ParentId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOrganizationalUnitsForParentRequest]
    }
  }

  @js.native
  trait ListOrganizationalUnitsForParentResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var OrganizationalUnits: js.UndefOr[OrganizationalUnits]
  }

  object ListOrganizationalUnitsForParentResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        OrganizationalUnits: js.UndefOr[OrganizationalUnits] = js.undefined
    ): ListOrganizationalUnitsForParentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OrganizationalUnits" -> OrganizationalUnits.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOrganizationalUnitsForParentResponse]
    }
  }

  @js.native
  trait ListParentsRequest extends js.Object {
    var ChildId: ChildId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListParentsRequest {
    def apply(
        ChildId: ChildId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListParentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChildId" -> ChildId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListParentsRequest]
    }
  }

  @js.native
  trait ListParentsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Parents: js.UndefOr[Parents]
  }

  object ListParentsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Parents: js.UndefOr[Parents] = js.undefined
    ): ListParentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Parents" -> Parents.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListParentsResponse]
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
    def apply(
        Filter: PolicyType,
        TargetId: PolicyTargetId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPoliciesForTargetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filter"   -> Filter.asInstanceOf[js.Any],
        "TargetId" -> TargetId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPoliciesForTargetRequest]
    }
  }

  @js.native
  trait ListPoliciesForTargetResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Policies: js.UndefOr[Policies]
  }

  object ListPoliciesForTargetResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Policies: js.UndefOr[Policies] = js.undefined
    ): ListPoliciesForTargetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Policies" -> Policies.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPoliciesForTargetResponse]
    }
  }

  @js.native
  trait ListPoliciesRequest extends js.Object {
    var Filter: PolicyType
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPoliciesRequest {
    def apply(
        Filter: PolicyType,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filter" -> Filter.asInstanceOf[js.Any],
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
    var NextToken: js.UndefOr[NextToken]
    var Policies: js.UndefOr[Policies]
  }

  object ListPoliciesResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Policies: js.UndefOr[Policies] = js.undefined
    ): ListPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Policies" -> Policies.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPoliciesResponse]
    }
  }

  @js.native
  trait ListRootsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRootsRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRootsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRootsRequest]
    }
  }

  @js.native
  trait ListRootsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Roots: js.UndefOr[Roots]
  }

  object ListRootsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Roots: js.UndefOr[Roots] = js.undefined
    ): ListRootsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Roots" -> Roots.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRootsResponse]
    }
  }

  @js.native
  trait ListTargetsForPolicyRequest extends js.Object {
    var PolicyId: PolicyId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTargetsForPolicyRequest {
    def apply(
        PolicyId: PolicyId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTargetsForPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTargetsForPolicyRequest]
    }
  }

  @js.native
  trait ListTargetsForPolicyResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Targets: js.UndefOr[PolicyTargets]
  }

  object ListTargetsForPolicyResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Targets: js.UndefOr[PolicyTargets] = js.undefined
    ): ListTargetsForPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Targets" -> Targets.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTargetsForPolicyResponse]
    }
  }

  @js.native
  trait MoveAccountRequest extends js.Object {
    var AccountId: AccountId
    var DestinationParentId: ParentId
    var SourceParentId: ParentId
  }

  object MoveAccountRequest {
    def apply(
        AccountId: AccountId,
        DestinationParentId: ParentId,
        SourceParentId: ParentId
    ): MoveAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId"           -> AccountId.asInstanceOf[js.Any],
        "DestinationParentId" -> DestinationParentId.asInstanceOf[js.Any],
        "SourceParentId"      -> SourceParentId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MoveAccountRequest]
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
    def apply(
        Arn: js.UndefOr[OrganizationArn] = js.undefined,
        AvailablePolicyTypes: js.UndefOr[PolicyTypes] = js.undefined,
        FeatureSet: js.UndefOr[OrganizationFeatureSet] = js.undefined,
        Id: js.UndefOr[OrganizationId] = js.undefined,
        MasterAccountArn: js.UndefOr[AccountArn] = js.undefined,
        MasterAccountEmail: js.UndefOr[Email] = js.undefined,
        MasterAccountId: js.UndefOr[AccountId] = js.undefined
    ): Organization = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AvailablePolicyTypes" -> AvailablePolicyTypes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FeatureSet" -> FeatureSet.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterAccountArn" -> MasterAccountArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterAccountEmail" -> MasterAccountEmail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterAccountId" -> MasterAccountId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Organization]
    }
  }

  object OrganizationFeatureSetEnum {
    val ALL                  = "ALL"
    val CONSOLIDATED_BILLING = "CONSOLIDATED_BILLING"

    val values = IndexedSeq(ALL, CONSOLIDATED_BILLING)
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
    def apply(
        Arn: js.UndefOr[OrganizationalUnitArn] = js.undefined,
        Id: js.UndefOr[OrganizationalUnitId] = js.undefined,
        Name: js.UndefOr[OrganizationalUnitName] = js.undefined
    ): OrganizationalUnit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrganizationalUnit]
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
    def apply(
        Id: js.UndefOr[ParentId] = js.undefined,
        Type: js.UndefOr[ParentType] = js.undefined
    ): Parent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Parent]
    }
  }

  object ParentTypeEnum {
    val ROOT                = "ROOT"
    val ORGANIZATIONAL_UNIT = "ORGANIZATIONAL_UNIT"

    val values = IndexedSeq(ROOT, ORGANIZATIONAL_UNIT)
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
    def apply(
        Content: js.UndefOr[PolicyContent] = js.undefined,
        PolicySummary: js.UndefOr[PolicySummary] = js.undefined
    ): Policy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Content" -> Content.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicySummary" -> PolicySummary.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Policy]
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
    def apply(
        Arn: js.UndefOr[PolicyArn] = js.undefined,
        AwsManaged: js.UndefOr[AwsManagedPolicy] = js.undefined,
        Description: js.UndefOr[PolicyDescription] = js.undefined,
        Id: js.UndefOr[PolicyId] = js.undefined,
        Name: js.UndefOr[PolicyName] = js.undefined,
        Type: js.UndefOr[PolicyType] = js.undefined
    ): PolicySummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AwsManaged" -> AwsManaged.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicySummary]
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
    def apply(
        Arn: js.UndefOr[GenericArn] = js.undefined,
        Name: js.UndefOr[TargetName] = js.undefined,
        TargetId: js.UndefOr[PolicyTargetId] = js.undefined,
        Type: js.UndefOr[TargetType] = js.undefined
    ): PolicyTargetSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TargetId" -> TargetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyTargetSummary]
    }
  }

  object PolicyTypeEnum {
    val SERVICE_CONTROL_POLICY = "SERVICE_CONTROL_POLICY"

    val values = IndexedSeq(SERVICE_CONTROL_POLICY)
  }

  object PolicyTypeStatusEnum {
    val ENABLED         = "ENABLED"
    val PENDING_ENABLE  = "PENDING_ENABLE"
    val PENDING_DISABLE = "PENDING_DISABLE"

    val values = IndexedSeq(ENABLED, PENDING_ENABLE, PENDING_DISABLE)
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
    def apply(
        Status: js.UndefOr[PolicyTypeStatus] = js.undefined,
        Type: js.UndefOr[PolicyType] = js.undefined
    ): PolicyTypeSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyTypeSummary]
    }
  }

  @js.native
  trait RemoveAccountFromOrganizationRequest extends js.Object {
    var AccountId: AccountId
  }

  object RemoveAccountFromOrganizationRequest {
    def apply(
        AccountId: AccountId
    ): RemoveAccountFromOrganizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveAccountFromOrganizationRequest]
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
    def apply(
        Arn: js.UndefOr[RootArn] = js.undefined,
        Id: js.UndefOr[RootId] = js.undefined,
        Name: js.UndefOr[RootName] = js.undefined,
        PolicyTypes: js.UndefOr[PolicyTypes] = js.undefined
    ): Root = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyTypes" -> PolicyTypes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Root]
    }
  }

  object TargetTypeEnum {
    val ACCOUNT             = "ACCOUNT"
    val ORGANIZATIONAL_UNIT = "ORGANIZATIONAL_UNIT"
    val ROOT                = "ROOT"

    val values = IndexedSeq(ACCOUNT, ORGANIZATIONAL_UNIT, ROOT)
  }

  @js.native
  trait UpdateOrganizationalUnitRequest extends js.Object {
    var OrganizationalUnitId: OrganizationalUnitId
    var Name: js.UndefOr[OrganizationalUnitName]
  }

  object UpdateOrganizationalUnitRequest {
    def apply(
        OrganizationalUnitId: OrganizationalUnitId,
        Name: js.UndefOr[OrganizationalUnitName] = js.undefined
    ): UpdateOrganizationalUnitRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationalUnitId" -> OrganizationalUnitId.asInstanceOf[js.Any],
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateOrganizationalUnitRequest]
    }
  }

  @js.native
  trait UpdateOrganizationalUnitResponse extends js.Object {
    var OrganizationalUnit: js.UndefOr[OrganizationalUnit]
  }

  object UpdateOrganizationalUnitResponse {
    def apply(
        OrganizationalUnit: js.UndefOr[OrganizationalUnit] = js.undefined
    ): UpdateOrganizationalUnitResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationalUnit" -> OrganizationalUnit.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateOrganizationalUnitResponse]
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
    def apply(
        PolicyId: PolicyId,
        Content: js.UndefOr[PolicyContent] = js.undefined,
        Description: js.UndefOr[PolicyDescription] = js.undefined,
        Name: js.UndefOr[PolicyName] = js.undefined
    ): UpdatePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.asInstanceOf[js.Any],
        "Content" -> Content.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePolicyRequest]
    }
  }

  @js.native
  trait UpdatePolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  object UpdatePolicyResponse {
    def apply(
        Policy: js.UndefOr[Policy] = js.undefined
    ): UpdatePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePolicyResponse]
    }
  }
}
