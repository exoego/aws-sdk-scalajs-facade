package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object chime {
  type AccountList               = js.Array[Account]
  type AccountName               = String
  type AccountType               = String
  type EmailAddress              = String
  type EmailStatus               = String
  type ErrorCode                 = String
  type InviteList                = js.Array[Invite]
  type InviteStatus              = String
  type Iso8601Timestamp          = js.Date
  type License                   = String
  type LicenseList               = js.Array[License]
  type NonEmptyString            = String
  type ProfileServiceMaxResults  = Int
  type RegistrationStatus        = String
  type SensitiveString           = String
  type UpdateUserRequestItemList = js.Array[UpdateUserRequestItem]
  type UserEmailList             = js.Array[EmailAddress]
  type UserErrorList             = js.Array[UserError]
  type UserIdList                = js.Array[NonEmptyString]
  type UserList                  = js.Array[User]
}

package chime {
  @js.native
  @JSImport("aws-sdk", "Chime")
  class Chime() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchSuspendUser(params: BatchSuspendUserRequest): Request[BatchSuspendUserResponse]                = js.native
    def batchUnsuspendUser(params: BatchUnsuspendUserRequest): Request[BatchUnsuspendUserResponse]          = js.native
    def batchUpdateUser(params: BatchUpdateUserRequest): Request[BatchUpdateUserResponse]                   = js.native
    def createAccount(params: CreateAccountRequest): Request[CreateAccountResponse]                         = js.native
    def deleteAccount(params: DeleteAccountRequest): Request[DeleteAccountResponse]                         = js.native
    def getAccount(params: GetAccountRequest): Request[GetAccountResponse]                                  = js.native
    def getAccountSettings(params: GetAccountSettingsRequest): Request[GetAccountSettingsResponse]          = js.native
    def getUser(params: GetUserRequest): Request[GetUserResponse]                                           = js.native
    def inviteUsers(params: InviteUsersRequest): Request[InviteUsersResponse]                               = js.native
    def listAccounts(params: ListAccountsRequest): Request[ListAccountsResponse]                            = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse]                                     = js.native
    def logoutUser(params: LogoutUserRequest): Request[LogoutUserResponse]                                  = js.native
    def resetPersonalPIN(params: ResetPersonalPINRequest): Request[ResetPersonalPINResponse]                = js.native
    def updateAccount(params: UpdateAccountRequest): Request[UpdateAccountResponse]                         = js.native
    def updateAccountSettings(params: UpdateAccountSettingsRequest): Request[UpdateAccountSettingsResponse] = js.native
    def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse]                                  = js.native
  }

  /**
    * The Amazon Chime account details. An AWS account can have multiple Amazon Chime accounts.
    */
  @js.native
  trait Account extends js.Object {
    var AccountId: String
    var AwsAccountId: String
    var Name: String
    var AccountType: js.UndefOr[AccountType]
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var DefaultLicense: js.UndefOr[License]
    var SupportedLicenses: js.UndefOr[LicenseList]
  }

  object Account {
    def apply(AccountId: String,
              AwsAccountId: String,
              Name: String,
              AccountType: js.UndefOr[AccountType] = js.undefined,
              CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
              DefaultLicense: js.UndefOr[License] = js.undefined,
              SupportedLicenses: js.UndefOr[LicenseList] = js.undefined): Account = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId"    -> AccountId.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Name"         -> Name.asInstanceOf[js.Any],
        "AccountType" -> AccountType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedTimestamp" -> CreatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultLicense" -> DefaultLicense.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportedLicenses" -> SupportedLicenses.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Account]
    }
  }

  /**
    * Settings related to the Amazon Chime account. This includes settings that start or stop remote control of shared screens, or start or stop the dial-out option in the Amazon Chime web application. For more information about these settings, see [[http://docs.aws.amazon.com/chime/latest/ag/policies.html|Use the Policies Page]] in the <i>Amazon Chime Administration Guide</i>.
    */
  @js.native
  trait AccountSettings extends js.Object {
    var DisableRemoteControl: js.UndefOr[Boolean]
    var EnableDialOut: js.UndefOr[Boolean]
  }

  object AccountSettings {
    def apply(DisableRemoteControl: js.UndefOr[Boolean] = js.undefined,
              EnableDialOut: js.UndefOr[Boolean] = js.undefined): AccountSettings = {
      val _fields = IndexedSeq[(String, js.Any)]("DisableRemoteControl" -> DisableRemoteControl.map { x =>
        x.asInstanceOf[js.Any]
      }, "EnableDialOut" -> EnableDialOut.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountSettings]
    }
  }

  object AccountTypeEnum {
    val Team                = "Team"
    val EnterpriseDirectory = "EnterpriseDirectory"
    val EnterpriseLWA       = "EnterpriseLWA"
    val EnterpriseOIDC      = "EnterpriseOIDC"

    val values = IndexedSeq(Team, EnterpriseDirectory, EnterpriseLWA, EnterpriseOIDC)
  }

  @js.native
  trait BatchSuspendUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserIdList: UserIdList
  }

  object BatchSuspendUserRequest {
    def apply(AccountId: NonEmptyString, UserIdList: UserIdList): BatchSuspendUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId"  -> AccountId.asInstanceOf[js.Any],
        "UserIdList" -> UserIdList.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchSuspendUserRequest]
    }
  }

  @js.native
  trait BatchSuspendUserResponse extends js.Object {
    var UserErrors: js.UndefOr[UserErrorList]
  }

  object BatchSuspendUserResponse {
    def apply(UserErrors: js.UndefOr[UserErrorList] = js.undefined): BatchSuspendUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("UserErrors" -> UserErrors.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchSuspendUserResponse]
    }
  }

  @js.native
  trait BatchUnsuspendUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserIdList: UserIdList
  }

  object BatchUnsuspendUserRequest {
    def apply(AccountId: NonEmptyString, UserIdList: UserIdList): BatchUnsuspendUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId"  -> AccountId.asInstanceOf[js.Any],
        "UserIdList" -> UserIdList.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchUnsuspendUserRequest]
    }
  }

  @js.native
  trait BatchUnsuspendUserResponse extends js.Object {
    var UserErrors: js.UndefOr[UserErrorList]
  }

  object BatchUnsuspendUserResponse {
    def apply(UserErrors: js.UndefOr[UserErrorList] = js.undefined): BatchUnsuspendUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("UserErrors" -> UserErrors.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchUnsuspendUserResponse]
    }
  }

  @js.native
  trait BatchUpdateUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UpdateUserRequestItems: UpdateUserRequestItemList
  }

  object BatchUpdateUserRequest {
    def apply(AccountId: NonEmptyString, UpdateUserRequestItems: UpdateUserRequestItemList): BatchUpdateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId"              -> AccountId.asInstanceOf[js.Any],
        "UpdateUserRequestItems" -> UpdateUserRequestItems.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchUpdateUserRequest]
    }
  }

  @js.native
  trait BatchUpdateUserResponse extends js.Object {
    var UserErrors: js.UndefOr[UserErrorList]
  }

  object BatchUpdateUserResponse {
    def apply(UserErrors: js.UndefOr[UserErrorList] = js.undefined): BatchUpdateUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("UserErrors" -> UserErrors.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchUpdateUserResponse]
    }
  }

  @js.native
  trait CreateAccountRequest extends js.Object {
    var Name: AccountName
  }

  object CreateAccountRequest {
    def apply(Name: AccountName): CreateAccountRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAccountRequest]
    }
  }

  @js.native
  trait CreateAccountResponse extends js.Object {
    var Account: js.UndefOr[Account]
  }

  object CreateAccountResponse {
    def apply(Account: js.UndefOr[Account] = js.undefined): CreateAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Account" -> Account.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAccountResponse]
    }
  }

  @js.native
  trait DeleteAccountRequest extends js.Object {
    var AccountId: NonEmptyString
  }

  object DeleteAccountRequest {
    def apply(AccountId: NonEmptyString): DeleteAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("AccountId" -> AccountId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAccountRequest]
    }
  }

  @js.native
  trait DeleteAccountResponse extends js.Object {}

  object DeleteAccountResponse {
    def apply(): DeleteAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAccountResponse]
    }
  }

  object EmailStatusEnum {
    val NotSent = "NotSent"
    val Sent    = "Sent"
    val Failed  = "Failed"

    val values = IndexedSeq(NotSent, Sent, Failed)
  }

  object ErrorCodeEnum {
    val Unauthorized       = "Unauthorized"
    val Forbidden          = "Forbidden"
    val NotFound           = "NotFound"
    val BadRequest         = "BadRequest"
    val Conflict           = "Conflict"
    val ServiceFailure     = "ServiceFailure"
    val ServiceUnavailable = "ServiceUnavailable"
    val Unprocessable      = "Unprocessable"
    val Throttled          = "Throttled"
    val PreconditionFailed = "PreconditionFailed"

    val values = IndexedSeq(
      Unauthorized,
      Forbidden,
      NotFound,
      BadRequest,
      Conflict,
      ServiceFailure,
      ServiceUnavailable,
      Unprocessable,
      Throttled,
      PreconditionFailed
    )
  }

  @js.native
  trait GetAccountRequest extends js.Object {
    var AccountId: NonEmptyString
  }

  object GetAccountRequest {
    def apply(AccountId: NonEmptyString): GetAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("AccountId" -> AccountId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountRequest]
    }
  }

  @js.native
  trait GetAccountResponse extends js.Object {
    var Account: js.UndefOr[Account]
  }

  object GetAccountResponse {
    def apply(Account: js.UndefOr[Account] = js.undefined): GetAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Account" -> Account.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountResponse]
    }
  }

  @js.native
  trait GetAccountSettingsRequest extends js.Object {
    var AccountId: NonEmptyString
  }

  object GetAccountSettingsRequest {
    def apply(AccountId: NonEmptyString): GetAccountSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("AccountId" -> AccountId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountSettingsRequest]
    }
  }

  @js.native
  trait GetAccountSettingsResponse extends js.Object {
    var AccountSettings: js.UndefOr[AccountSettings]
  }

  object GetAccountSettingsResponse {
    def apply(AccountSettings: js.UndefOr[AccountSettings] = js.undefined): GetAccountSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("AccountSettings" -> AccountSettings.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountSettingsResponse]
    }
  }

  @js.native
  trait GetUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserId: NonEmptyString
  }

  object GetUserRequest {
    def apply(AccountId: NonEmptyString, UserId: NonEmptyString): GetUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "UserId"    -> UserId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserRequest]
    }
  }

  @js.native
  trait GetUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object GetUserResponse {
    def apply(User: js.UndefOr[User] = js.undefined): GetUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("User" -> User.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserResponse]
    }
  }

  /**
    * Invitation object returned after emailing users to invite them to join the Amazon Chime <code>Team</code> account.
    */
  @js.native
  trait Invite extends js.Object {
    var EmailAddress: js.UndefOr[EmailAddress]
    var EmailStatus: js.UndefOr[EmailStatus]
    var InviteId: js.UndefOr[String]
    var Status: js.UndefOr[InviteStatus]
  }

  object Invite {
    def apply(EmailAddress: js.UndefOr[EmailAddress] = js.undefined,
              EmailStatus: js.UndefOr[EmailStatus] = js.undefined,
              InviteId: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[InviteStatus] = js.undefined): Invite = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailAddress" -> EmailAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmailStatus" -> EmailStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InviteId" -> InviteId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Invite]
    }
  }

  object InviteStatusEnum {
    val Pending  = "Pending"
    val Accepted = "Accepted"
    val Failed   = "Failed"

    val values = IndexedSeq(Pending, Accepted, Failed)
  }

  @js.native
  trait InviteUsersRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserEmailList: UserEmailList
  }

  object InviteUsersRequest {
    def apply(AccountId: NonEmptyString, UserEmailList: UserEmailList): InviteUsersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId"     -> AccountId.asInstanceOf[js.Any],
        "UserEmailList" -> UserEmailList.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InviteUsersRequest]
    }
  }

  @js.native
  trait InviteUsersResponse extends js.Object {
    var Invites: js.UndefOr[InviteList]
  }

  object InviteUsersResponse {
    def apply(Invites: js.UndefOr[InviteList] = js.undefined): InviteUsersResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Invites" -> Invites.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InviteUsersResponse]
    }
  }

  object LicenseEnum {
    val Basic    = "Basic"
    val Plus     = "Plus"
    val Pro      = "Pro"
    val ProTrial = "ProTrial"

    val values = IndexedSeq(Basic, Plus, Pro, ProTrial)
  }

  @js.native
  trait ListAccountsRequest extends js.Object {
    var MaxResults: js.UndefOr[ProfileServiceMaxResults]
    var Name: js.UndefOr[AccountName]
    var NextToken: js.UndefOr[String]
    var UserEmail: js.UndefOr[EmailAddress]
  }

  object ListAccountsRequest {
    def apply(MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.undefined,
              Name: js.UndefOr[AccountName] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined,
              UserEmail: js.UndefOr[EmailAddress] = js.undefined): ListAccountsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserEmail" -> UserEmail.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAccountsRequest]
    }
  }

  @js.native
  trait ListAccountsResponse extends js.Object {
    var Accounts: js.UndefOr[AccountList]
    var NextToken: js.UndefOr[String]
  }

  object ListAccountsResponse {
    def apply(Accounts: js.UndefOr[AccountList] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined): ListAccountsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Accounts" -> Accounts.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAccountsResponse]
    }
  }

  @js.native
  trait ListUsersRequest extends js.Object {
    var AccountId: NonEmptyString
    var MaxResults: js.UndefOr[ProfileServiceMaxResults]
    var NextToken: js.UndefOr[String]
    var UserEmail: js.UndefOr[EmailAddress]
  }

  object ListUsersRequest {
    def apply(AccountId: NonEmptyString,
              MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined,
              UserEmail: js.UndefOr[EmailAddress] = js.undefined): ListUsersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserEmail" -> UserEmail.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersRequest]
    }
  }

  @js.native
  trait ListUsersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Users: js.UndefOr[UserList]
  }

  object ListUsersResponse {
    def apply(NextToken: js.UndefOr[String] = js.undefined,
              Users: js.UndefOr[UserList] = js.undefined): ListUsersResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "Users" -> Users.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersResponse]
    }
  }

  @js.native
  trait LogoutUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserId: NonEmptyString
  }

  object LogoutUserRequest {
    def apply(AccountId: NonEmptyString, UserId: NonEmptyString): LogoutUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "UserId"    -> UserId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogoutUserRequest]
    }
  }

  @js.native
  trait LogoutUserResponse extends js.Object {}

  object LogoutUserResponse {
    def apply(): LogoutUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogoutUserResponse]
    }
  }

  object RegistrationStatusEnum {
    val Unregistered = "Unregistered"
    val Registered   = "Registered"
    val Suspended    = "Suspended"

    val values = IndexedSeq(Unregistered, Registered, Suspended)
  }

  @js.native
  trait ResetPersonalPINRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserId: NonEmptyString
  }

  object ResetPersonalPINRequest {
    def apply(AccountId: NonEmptyString, UserId: NonEmptyString): ResetPersonalPINRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "UserId"    -> UserId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetPersonalPINRequest]
    }
  }

  @js.native
  trait ResetPersonalPINResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object ResetPersonalPINResponse {
    def apply(User: js.UndefOr[User] = js.undefined): ResetPersonalPINResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("User" -> User.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetPersonalPINResponse]
    }
  }

  @js.native
  trait UpdateAccountRequest extends js.Object {
    var AccountId: NonEmptyString
    var Name: js.UndefOr[AccountName]
  }

  object UpdateAccountRequest {
    def apply(AccountId: NonEmptyString, Name: js.UndefOr[AccountName] = js.undefined): UpdateAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("AccountId" -> AccountId.asInstanceOf[js.Any], "Name" -> Name.map {
        x =>
          x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAccountRequest]
    }
  }

  @js.native
  trait UpdateAccountResponse extends js.Object {
    var Account: js.UndefOr[Account]
  }

  object UpdateAccountResponse {
    def apply(Account: js.UndefOr[Account] = js.undefined): UpdateAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Account" -> Account.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAccountResponse]
    }
  }

  @js.native
  trait UpdateAccountSettingsRequest extends js.Object {
    var AccountId: NonEmptyString
    var AccountSettings: AccountSettings
  }

  object UpdateAccountSettingsRequest {
    def apply(AccountId: NonEmptyString, AccountSettings: AccountSettings): UpdateAccountSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId"       -> AccountId.asInstanceOf[js.Any],
        "AccountSettings" -> AccountSettings.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAccountSettingsRequest]
    }
  }

  @js.native
  trait UpdateAccountSettingsResponse extends js.Object {}

  object UpdateAccountSettingsResponse {
    def apply(): UpdateAccountSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAccountSettingsResponse]
    }
  }

  @js.native
  trait UpdateUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserId: NonEmptyString
    var LicenseType: js.UndefOr[License]
  }

  object UpdateUserRequest {
    def apply(AccountId: NonEmptyString,
              UserId: NonEmptyString,
              LicenseType: js.UndefOr[License] = js.undefined): UpdateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "UserId"    -> UserId.asInstanceOf[js.Any],
        "LicenseType" -> LicenseType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserRequest]
    }
  }

  /**
    * The user ID and user fields to update, used with the <a>BatchUpdateUser</a> action.
    */
  @js.native
  trait UpdateUserRequestItem extends js.Object {
    var UserId: NonEmptyString
    var LicenseType: js.UndefOr[License]
  }

  object UpdateUserRequestItem {
    def apply(UserId: NonEmptyString, LicenseType: js.UndefOr[License] = js.undefined): UpdateUserRequestItem = {
      val _fields =
        IndexedSeq[(String, js.Any)]("UserId" -> UserId.asInstanceOf[js.Any], "LicenseType" -> LicenseType.map { x =>
          x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserRequestItem]
    }
  }

  @js.native
  trait UpdateUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object UpdateUserResponse {
    def apply(User: js.UndefOr[User] = js.undefined): UpdateUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("User" -> User.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserResponse]
    }
  }

  /**
    * The user on the Amazon Chime account.
    */
  @js.native
  trait User extends js.Object {
    var UserId: String
    var AccountId: js.UndefOr[String]
    var DisplayName: js.UndefOr[SensitiveString]
    var InvitedOn: js.UndefOr[Iso8601Timestamp]
    var LicenseType: js.UndefOr[License]
    var PersonalPIN: js.UndefOr[String]
    var PrimaryEmail: js.UndefOr[EmailAddress]
    var RegisteredOn: js.UndefOr[Iso8601Timestamp]
    var UserInvitationStatus: js.UndefOr[InviteStatus]
    var UserRegistrationStatus: js.UndefOr[RegistrationStatus]
  }

  object User {
    def apply(UserId: String,
              AccountId: js.UndefOr[String] = js.undefined,
              DisplayName: js.UndefOr[SensitiveString] = js.undefined,
              InvitedOn: js.UndefOr[Iso8601Timestamp] = js.undefined,
              LicenseType: js.UndefOr[License] = js.undefined,
              PersonalPIN: js.UndefOr[String] = js.undefined,
              PrimaryEmail: js.UndefOr[EmailAddress] = js.undefined,
              RegisteredOn: js.UndefOr[Iso8601Timestamp] = js.undefined,
              UserInvitationStatus: js.UndefOr[InviteStatus] = js.undefined,
              UserRegistrationStatus: js.UndefOr[RegistrationStatus] = js.undefined): User = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserId" -> UserId.asInstanceOf[js.Any],
        "AccountId" -> AccountId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DisplayName" -> DisplayName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InvitedOn" -> InvitedOn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LicenseType" -> LicenseType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PersonalPIN" -> PersonalPIN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PrimaryEmail" -> PrimaryEmail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RegisteredOn" -> RegisteredOn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserInvitationStatus" -> UserInvitationStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserRegistrationStatus" -> UserRegistrationStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[User]
    }
  }

  /**
    * The list of errors returned when errors are encountered during the <a>BatchSuspendUser</a>, <a>BatchUnsuspendUser</a>, or <a>BatchUpdateUser</a> actions. This includes user IDs, error codes, and error messages.
    */
  @js.native
  trait UserError extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[String]
    var UserId: js.UndefOr[NonEmptyString]
  }

  object UserError {
    def apply(ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
              ErrorMessage: js.UndefOr[String] = js.undefined,
              UserId: js.UndefOr[NonEmptyString] = js.undefined): UserError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorMessage" -> ErrorMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserId" -> UserId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserError]
    }
  }
}
