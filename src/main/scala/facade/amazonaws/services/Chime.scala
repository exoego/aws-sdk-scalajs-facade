package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object chime {
  type AccountList = js.Array[Account]
  type AccountName = String
  type AccountType = String
  type EmailAddress = String
  type EmailStatus = String
  type ErrorCode = String
  type InviteList = js.Array[Invite]
  type InviteStatus = String
  type Iso8601Timestamp = js.Date
  type License = String
  type LicenseList = js.Array[License]
  type NonEmptyString = String
  type ProfileServiceMaxResults = Int
  type RegistrationStatus = String
  type SensitiveString = String
  type UpdateUserRequestItemList = js.Array[UpdateUserRequestItem]
  type UserEmailList = js.Array[EmailAddress]
  type UserErrorList = js.Array[UserError]
  type UserIdList = js.Array[NonEmptyString]
  type UserList = js.Array[User]
}

package chime {
  @js.native
  @JSImport("aws-sdk", "Chime")
  class Chime(config: AWSConfig) extends js.Object {
    def batchSuspendUser(params: BatchSuspendUserRequest): Request[BatchSuspendUserResponse] = js.native
    def batchUnsuspendUser(params: BatchUnsuspendUserRequest): Request[BatchUnsuspendUserResponse] = js.native
    def batchUpdateUser(params: BatchUpdateUserRequest): Request[BatchUpdateUserResponse] = js.native
    def createAccount(params: CreateAccountRequest): Request[CreateAccountResponse] = js.native
    def deleteAccount(params: DeleteAccountRequest): Request[DeleteAccountResponse] = js.native
    def getAccount(params: GetAccountRequest): Request[GetAccountResponse] = js.native
    def getAccountSettings(params: GetAccountSettingsRequest): Request[GetAccountSettingsResponse] = js.native
    def getUser(params: GetUserRequest): Request[GetUserResponse] = js.native
    def inviteUsers(params: InviteUsersRequest): Request[InviteUsersResponse] = js.native
    def listAccounts(params: ListAccountsRequest): Request[ListAccountsResponse] = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse] = js.native
    def logoutUser(params: LogoutUserRequest): Request[LogoutUserResponse] = js.native
    def resetPersonalPIN(params: ResetPersonalPINRequest): Request[ResetPersonalPINResponse] = js.native
    def updateAccount(params: UpdateAccountRequest): Request[UpdateAccountResponse] = js.native
    def updateAccountSettings(params: UpdateAccountSettingsRequest): Request[UpdateAccountSettingsResponse] = js.native
    def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse] = js.native
  }

  /**
   * <p>The Amazon Chime account details. An AWS account can have multiple Amazon Chime accounts.</p>
   */
  @js.native
  trait Account extends js.Object {
    var AwsAccountId: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var DefaultLicense: js.UndefOr[License]
    var SupportedLicenses: js.UndefOr[LicenseList]
    var AccountType: js.UndefOr[AccountType]
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var AccountId: js.UndefOr[String]
  }

  object Account {
    def apply(
      AwsAccountId: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      DefaultLicense: js.UndefOr[License] = js.undefined,
      SupportedLicenses: js.UndefOr[LicenseList] = js.undefined,
      AccountType: js.UndefOr[AccountType] = js.undefined,
      CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
      AccountId: js.UndefOr[String] = js.undefined): Account = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AwsAccountId" -> AwsAccountId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "DefaultLicense" -> DefaultLicense.map { x => x.asInstanceOf[js.Any] },
        "SupportedLicenses" -> SupportedLicenses.map { x => x.asInstanceOf[js.Any] },
        "AccountType" -> AccountType.map { x => x.asInstanceOf[js.Any] },
        "CreatedTimestamp" -> CreatedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Account]
    }
  }

  /**
   * <p>Settings related to the Amazon Chime account. This includes settings that start or stop remote control of shared screens, or start or stop the dial-out option in the Amazon Chime web application. For more information about these settings, see <a href="http://docs.aws.amazon.com/chime/latest/ag/policies.html">Use the Policies Page</a> in the <i>Amazon Chime Administration Guide</i>.</p>
   */
  @js.native
  trait AccountSettings extends js.Object {
    var DisableRemoteControl: js.UndefOr[Boolean]
    var EnableDialOut: js.UndefOr[Boolean]
  }

  object AccountSettings {
    def apply(
      DisableRemoteControl: js.UndefOr[Boolean] = js.undefined,
      EnableDialOut: js.UndefOr[Boolean] = js.undefined): AccountSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisableRemoteControl" -> DisableRemoteControl.map { x => x.asInstanceOf[js.Any] },
        "EnableDialOut" -> EnableDialOut.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountSettings]
    }
  }

  object AccountTypeEnum {
    val Team = "Team"
    val EnterpriseDirectory = "EnterpriseDirectory"
    val EnterpriseLWA = "EnterpriseLWA"
    val EnterpriseOIDC = "EnterpriseOIDC"

    val values = IndexedSeq(Team, EnterpriseDirectory, EnterpriseLWA, EnterpriseOIDC)
  }

  @js.native
  trait BatchSuspendUserRequest extends js.Object {
    var AccountId: js.UndefOr[NonEmptyString]
    var UserIdList: js.UndefOr[UserIdList]
  }

  object BatchSuspendUserRequest {
    def apply(
      AccountId: js.UndefOr[NonEmptyString] = js.undefined,
      UserIdList: js.UndefOr[UserIdList] = js.undefined): BatchSuspendUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "UserIdList" -> UserIdList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchSuspendUserRequest]
    }
  }

  @js.native
  trait BatchSuspendUserResponse extends js.Object {
    var UserErrors: js.UndefOr[UserErrorList]
  }

  object BatchSuspendUserResponse {
    def apply(
      UserErrors: js.UndefOr[UserErrorList] = js.undefined): BatchSuspendUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserErrors" -> UserErrors.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchSuspendUserResponse]
    }
  }

  @js.native
  trait BatchUnsuspendUserRequest extends js.Object {
    var AccountId: js.UndefOr[NonEmptyString]
    var UserIdList: js.UndefOr[UserIdList]
  }

  object BatchUnsuspendUserRequest {
    def apply(
      AccountId: js.UndefOr[NonEmptyString] = js.undefined,
      UserIdList: js.UndefOr[UserIdList] = js.undefined): BatchUnsuspendUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "UserIdList" -> UserIdList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchUnsuspendUserRequest]
    }
  }

  @js.native
  trait BatchUnsuspendUserResponse extends js.Object {
    var UserErrors: js.UndefOr[UserErrorList]
  }

  object BatchUnsuspendUserResponse {
    def apply(
      UserErrors: js.UndefOr[UserErrorList] = js.undefined): BatchUnsuspendUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserErrors" -> UserErrors.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchUnsuspendUserResponse]
    }
  }

  @js.native
  trait BatchUpdateUserRequest extends js.Object {
    var AccountId: js.UndefOr[NonEmptyString]
    var UpdateUserRequestItems: js.UndefOr[UpdateUserRequestItemList]
  }

  object BatchUpdateUserRequest {
    def apply(
      AccountId: js.UndefOr[NonEmptyString] = js.undefined,
      UpdateUserRequestItems: js.UndefOr[UpdateUserRequestItemList] = js.undefined): BatchUpdateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "UpdateUserRequestItems" -> UpdateUserRequestItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchUpdateUserRequest]
    }
  }

  @js.native
  trait BatchUpdateUserResponse extends js.Object {
    var UserErrors: js.UndefOr[UserErrorList]
  }

  object BatchUpdateUserResponse {
    def apply(
      UserErrors: js.UndefOr[UserErrorList] = js.undefined): BatchUpdateUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserErrors" -> UserErrors.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchUpdateUserResponse]
    }
  }

  @js.native
  trait CreateAccountRequest extends js.Object {
    var Name: js.UndefOr[AccountName]
  }

  object CreateAccountRequest {
    def apply(
      Name: js.UndefOr[AccountName] = js.undefined): CreateAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAccountRequest]
    }
  }

  @js.native
  trait CreateAccountResponse extends js.Object {
    var Account: js.UndefOr[Account]
  }

  object CreateAccountResponse {
    def apply(
      Account: js.UndefOr[Account] = js.undefined): CreateAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Account" -> Account.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAccountResponse]
    }
  }

  @js.native
  trait DeleteAccountRequest extends js.Object {
    var AccountId: js.UndefOr[NonEmptyString]
  }

  object DeleteAccountRequest {
    def apply(
      AccountId: js.UndefOr[NonEmptyString] = js.undefined): DeleteAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAccountRequest]
    }
  }

  @js.native
  trait DeleteAccountResponse extends js.Object {

  }

  object DeleteAccountResponse {
    def apply(): DeleteAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAccountResponse]
    }
  }

  object EmailStatusEnum {
    val NotSent = "NotSent"
    val Sent = "Sent"
    val Failed = "Failed"

    val values = IndexedSeq(NotSent, Sent, Failed)
  }

  object ErrorCodeEnum {
    val Unauthorized = "Unauthorized"
    val Forbidden = "Forbidden"
    val NotFound = "NotFound"
    val BadRequest = "BadRequest"
    val Conflict = "Conflict"
    val ServiceFailure = "ServiceFailure"
    val ServiceUnavailable = "ServiceUnavailable"
    val Unprocessable = "Unprocessable"
    val Throttled = "Throttled"
    val PreconditionFailed = "PreconditionFailed"

    val values = IndexedSeq(Unauthorized, Forbidden, NotFound, BadRequest, Conflict, ServiceFailure, ServiceUnavailable, Unprocessable, Throttled, PreconditionFailed)
  }

  @js.native
  trait GetAccountRequest extends js.Object {
    var AccountId: js.UndefOr[NonEmptyString]
  }

  object GetAccountRequest {
    def apply(
      AccountId: js.UndefOr[NonEmptyString] = js.undefined): GetAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountRequest]
    }
  }

  @js.native
  trait GetAccountResponse extends js.Object {
    var Account: js.UndefOr[Account]
  }

  object GetAccountResponse {
    def apply(
      Account: js.UndefOr[Account] = js.undefined): GetAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Account" -> Account.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountResponse]
    }
  }

  @js.native
  trait GetAccountSettingsRequest extends js.Object {
    var AccountId: js.UndefOr[NonEmptyString]
  }

  object GetAccountSettingsRequest {
    def apply(
      AccountId: js.UndefOr[NonEmptyString] = js.undefined): GetAccountSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountSettingsRequest]
    }
  }

  @js.native
  trait GetAccountSettingsResponse extends js.Object {
    var AccountSettings: js.UndefOr[AccountSettings]
  }

  object GetAccountSettingsResponse {
    def apply(
      AccountSettings: js.UndefOr[AccountSettings] = js.undefined): GetAccountSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountSettings" -> AccountSettings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountSettingsResponse]
    }
  }

  @js.native
  trait GetUserRequest extends js.Object {
    var AccountId: js.UndefOr[NonEmptyString]
    var UserId: js.UndefOr[NonEmptyString]
  }

  object GetUserRequest {
    def apply(
      AccountId: js.UndefOr[NonEmptyString] = js.undefined,
      UserId: js.UndefOr[NonEmptyString] = js.undefined): GetUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserRequest]
    }
  }

  @js.native
  trait GetUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object GetUserResponse {
    def apply(
      User: js.UndefOr[User] = js.undefined): GetUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "User" -> User.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserResponse]
    }
  }

  /**
   * <p>Invitation object returned after emailing users to invite them to join the Amazon Chime <code>Team</code> account.</p>
   */
  @js.native
  trait Invite extends js.Object {
    var InviteId: js.UndefOr[String]
    var Status: js.UndefOr[InviteStatus]
    var EmailAddress: js.UndefOr[EmailAddress]
    var EmailStatus: js.UndefOr[EmailStatus]
  }

  object Invite {
    def apply(
      InviteId: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[InviteStatus] = js.undefined,
      EmailAddress: js.UndefOr[EmailAddress] = js.undefined,
      EmailStatus: js.UndefOr[EmailStatus] = js.undefined): Invite = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InviteId" -> InviteId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "EmailAddress" -> EmailAddress.map { x => x.asInstanceOf[js.Any] },
        "EmailStatus" -> EmailStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Invite]
    }
  }

  object InviteStatusEnum {
    val Pending = "Pending"
    val Accepted = "Accepted"
    val Failed = "Failed"

    val values = IndexedSeq(Pending, Accepted, Failed)
  }

  @js.native
  trait InviteUsersRequest extends js.Object {
    var AccountId: js.UndefOr[NonEmptyString]
    var UserEmailList: js.UndefOr[UserEmailList]
  }

  object InviteUsersRequest {
    def apply(
      AccountId: js.UndefOr[NonEmptyString] = js.undefined,
      UserEmailList: js.UndefOr[UserEmailList] = js.undefined): InviteUsersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "UserEmailList" -> UserEmailList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InviteUsersRequest]
    }
  }

  @js.native
  trait InviteUsersResponse extends js.Object {
    var Invites: js.UndefOr[InviteList]
  }

  object InviteUsersResponse {
    def apply(
      Invites: js.UndefOr[InviteList] = js.undefined): InviteUsersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Invites" -> Invites.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InviteUsersResponse]
    }
  }

  object LicenseEnum {
    val Basic = "Basic"
    val Plus = "Plus"
    val Pro = "Pro"
    val ProTrial = "ProTrial"

    val values = IndexedSeq(Basic, Plus, Pro, ProTrial)
  }

  @js.native
  trait ListAccountsRequest extends js.Object {
    var Name: js.UndefOr[AccountName]
    var UserEmail: js.UndefOr[EmailAddress]
    var NextToken: js.UndefOr[String]
    var MaxResults: js.UndefOr[ProfileServiceMaxResults]
  }

  object ListAccountsRequest {
    def apply(
      Name: js.UndefOr[AccountName] = js.undefined,
      UserEmail: js.UndefOr[EmailAddress] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.undefined): ListAccountsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "UserEmail" -> UserEmail.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAccountsRequest]
    }
  }

  @js.native
  trait ListAccountsResponse extends js.Object {
    var Accounts: js.UndefOr[AccountList]
    var NextToken: js.UndefOr[String]
  }

  object ListAccountsResponse {
    def apply(
      Accounts: js.UndefOr[AccountList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListAccountsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Accounts" -> Accounts.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAccountsResponse]
    }
  }

  @js.native
  trait ListUsersRequest extends js.Object {
    var AccountId: js.UndefOr[NonEmptyString]
    var UserEmail: js.UndefOr[EmailAddress]
    var MaxResults: js.UndefOr[ProfileServiceMaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListUsersRequest {
    def apply(
      AccountId: js.UndefOr[NonEmptyString] = js.undefined,
      UserEmail: js.UndefOr[EmailAddress] = js.undefined,
      MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListUsersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "UserEmail" -> UserEmail.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersRequest]
    }
  }

  @js.native
  trait ListUsersResponse extends js.Object {
    var Users: js.UndefOr[UserList]
    var NextToken: js.UndefOr[String]
  }

  object ListUsersResponse {
    def apply(
      Users: js.UndefOr[UserList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListUsersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Users" -> Users.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersResponse]
    }
  }

  @js.native
  trait LogoutUserRequest extends js.Object {
    var AccountId: js.UndefOr[NonEmptyString]
    var UserId: js.UndefOr[NonEmptyString]
  }

  object LogoutUserRequest {
    def apply(
      AccountId: js.UndefOr[NonEmptyString] = js.undefined,
      UserId: js.UndefOr[NonEmptyString] = js.undefined): LogoutUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogoutUserRequest]
    }
  }

  @js.native
  trait LogoutUserResponse extends js.Object {

  }

  object LogoutUserResponse {
    def apply(): LogoutUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogoutUserResponse]
    }
  }

  object RegistrationStatusEnum {
    val Unregistered = "Unregistered"
    val Registered = "Registered"
    val Suspended = "Suspended"

    val values = IndexedSeq(Unregistered, Registered, Suspended)
  }

  @js.native
  trait ResetPersonalPINRequest extends js.Object {
    var AccountId: js.UndefOr[NonEmptyString]
    var UserId: js.UndefOr[NonEmptyString]
  }

  object ResetPersonalPINRequest {
    def apply(
      AccountId: js.UndefOr[NonEmptyString] = js.undefined,
      UserId: js.UndefOr[NonEmptyString] = js.undefined): ResetPersonalPINRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetPersonalPINRequest]
    }
  }

  @js.native
  trait ResetPersonalPINResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object ResetPersonalPINResponse {
    def apply(
      User: js.UndefOr[User] = js.undefined): ResetPersonalPINResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "User" -> User.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetPersonalPINResponse]
    }
  }

  @js.native
  trait UpdateAccountRequest extends js.Object {
    var AccountId: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[AccountName]
  }

  object UpdateAccountRequest {
    def apply(
      AccountId: js.UndefOr[NonEmptyString] = js.undefined,
      Name: js.UndefOr[AccountName] = js.undefined): UpdateAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAccountRequest]
    }
  }

  @js.native
  trait UpdateAccountResponse extends js.Object {
    var Account: js.UndefOr[Account]
  }

  object UpdateAccountResponse {
    def apply(
      Account: js.UndefOr[Account] = js.undefined): UpdateAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Account" -> Account.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAccountResponse]
    }
  }

  @js.native
  trait UpdateAccountSettingsRequest extends js.Object {
    var AccountId: js.UndefOr[NonEmptyString]
    var AccountSettings: js.UndefOr[AccountSettings]
  }

  object UpdateAccountSettingsRequest {
    def apply(
      AccountId: js.UndefOr[NonEmptyString] = js.undefined,
      AccountSettings: js.UndefOr[AccountSettings] = js.undefined): UpdateAccountSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "AccountSettings" -> AccountSettings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAccountSettingsRequest]
    }
  }

  @js.native
  trait UpdateAccountSettingsResponse extends js.Object {

  }

  object UpdateAccountSettingsResponse {
    def apply(): UpdateAccountSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAccountSettingsResponse]
    }
  }

  @js.native
  trait UpdateUserRequest extends js.Object {
    var AccountId: js.UndefOr[NonEmptyString]
    var UserId: js.UndefOr[NonEmptyString]
    var LicenseType: js.UndefOr[License]
  }

  object UpdateUserRequest {
    def apply(
      AccountId: js.UndefOr[NonEmptyString] = js.undefined,
      UserId: js.UndefOr[NonEmptyString] = js.undefined,
      LicenseType: js.UndefOr[License] = js.undefined): UpdateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] },
        "LicenseType" -> LicenseType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserRequest]
    }
  }

  /**
   * <p>The user ID and user fields to update, used with the <a>BatchUpdateUser</a> action.</p>
   */
  @js.native
  trait UpdateUserRequestItem extends js.Object {
    var UserId: js.UndefOr[NonEmptyString]
    var LicenseType: js.UndefOr[License]
  }

  object UpdateUserRequestItem {
    def apply(
      UserId: js.UndefOr[NonEmptyString] = js.undefined,
      LicenseType: js.UndefOr[License] = js.undefined): UpdateUserRequestItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] },
        "LicenseType" -> LicenseType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserRequestItem]
    }
  }

  @js.native
  trait UpdateUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object UpdateUserResponse {
    def apply(
      User: js.UndefOr[User] = js.undefined): UpdateUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "User" -> User.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserResponse]
    }
  }

  /**
   * <p>The user on the Amazon Chime account.</p>
   */
  @js.native
  trait User extends js.Object {
    var UserRegistrationStatus: js.UndefOr[RegistrationStatus]
    var LicenseType: js.UndefOr[License]
    var RegisteredOn: js.UndefOr[Iso8601Timestamp]
    var PrimaryEmail: js.UndefOr[EmailAddress]
    var InvitedOn: js.UndefOr[Iso8601Timestamp]
    var AccountId: js.UndefOr[String]
    var UserId: js.UndefOr[String]
    var PersonalPIN: js.UndefOr[String]
    var DisplayName: js.UndefOr[SensitiveString]
    var UserInvitationStatus: js.UndefOr[InviteStatus]
  }

  object User {
    def apply(
      UserRegistrationStatus: js.UndefOr[RegistrationStatus] = js.undefined,
      LicenseType: js.UndefOr[License] = js.undefined,
      RegisteredOn: js.UndefOr[Iso8601Timestamp] = js.undefined,
      PrimaryEmail: js.UndefOr[EmailAddress] = js.undefined,
      InvitedOn: js.UndefOr[Iso8601Timestamp] = js.undefined,
      AccountId: js.UndefOr[String] = js.undefined,
      UserId: js.UndefOr[String] = js.undefined,
      PersonalPIN: js.UndefOr[String] = js.undefined,
      DisplayName: js.UndefOr[SensitiveString] = js.undefined,
      UserInvitationStatus: js.UndefOr[InviteStatus] = js.undefined): User = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserRegistrationStatus" -> UserRegistrationStatus.map { x => x.asInstanceOf[js.Any] },
        "LicenseType" -> LicenseType.map { x => x.asInstanceOf[js.Any] },
        "RegisteredOn" -> RegisteredOn.map { x => x.asInstanceOf[js.Any] },
        "PrimaryEmail" -> PrimaryEmail.map { x => x.asInstanceOf[js.Any] },
        "InvitedOn" -> InvitedOn.map { x => x.asInstanceOf[js.Any] },
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] },
        "PersonalPIN" -> PersonalPIN.map { x => x.asInstanceOf[js.Any] },
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] },
        "UserInvitationStatus" -> UserInvitationStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[User]
    }
  }

  /**
   * <p>The list of errors returned when errors are encountered during the <a>BatchSuspendUser</a>, <a>BatchUnsuspendUser</a>, or <a>BatchUpdateUser</a> actions. This includes user IDs, error codes, and error messages.</p>
   */
  @js.native
  trait UserError extends js.Object {
    var UserId: js.UndefOr[NonEmptyString]
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[String]
  }

  object UserError {
    def apply(
      UserId: js.UndefOr[NonEmptyString] = js.undefined,
      ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
      ErrorMessage: js.UndefOr[String] = js.undefined): UserError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserError]
    }
  }
}
