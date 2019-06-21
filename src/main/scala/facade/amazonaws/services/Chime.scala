package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object chime {
  type AccountList                      = js.Array[Account]
  type AccountName                      = String
  type AccountType                      = String
  type CallingRegion                    = String
  type CallingRegionList                = js.Array[CallingRegion]
  type CpsLimit                         = Int
  type CredentialList                   = js.Array[Credential]
  type E164PhoneNumber                  = String
  type E164PhoneNumberList              = js.Array[E164PhoneNumber]
  type EmailAddress                     = String
  type EmailStatus                      = String
  type ErrorCode                        = String
  type GuidString                       = String
  type InviteList                       = js.Array[Invite]
  type InviteStatus                     = String
  type Iso8601Timestamp                 = js.Date
  type License                          = String
  type LicenseList                      = js.Array[License]
  type NonEmptyString                   = String
  type NonEmptyStringList               = js.Array[String]
  type NullableBoolean                  = Boolean
  type OrderedPhoneNumberList           = js.Array[OrderedPhoneNumber]
  type OrderedPhoneNumberStatus         = String
  type OriginationRouteList             = js.Array[OriginationRoute]
  type OriginationRoutePriority         = Int
  type OriginationRouteProtocol         = String
  type OriginationRouteWeight           = Int
  type PhoneNumberAssociationList       = js.Array[PhoneNumberAssociation]
  type PhoneNumberAssociationName       = String
  type PhoneNumberErrorList             = js.Array[PhoneNumberError]
  type PhoneNumberList                  = js.Array[PhoneNumber]
  type PhoneNumberMaxResults            = Int
  type PhoneNumberOrderList             = js.Array[PhoneNumberOrder]
  type PhoneNumberOrderStatus           = String
  type PhoneNumberProductType           = String
  type PhoneNumberStatus                = String
  type Port                             = Int
  type ProfileServiceMaxResults         = Int
  type RegistrationStatus               = String
  type ResultMax                        = Int
  type SensitiveString                  = String
  type SensitiveStringList              = js.Array[SensitiveString]
  type StringList                       = js.Array[String]
  type UpdatePhoneNumberRequestItemList = js.Array[UpdatePhoneNumberRequestItem]
  type UpdateUserRequestItemList        = js.Array[UpdateUserRequestItem]
  type UserEmailList                    = js.Array[EmailAddress]
  type UserErrorList                    = js.Array[UserError]
  type UserIdList                       = js.Array[NonEmptyString]
  type UserList                         = js.Array[User]
  type VoiceConnectorList               = js.Array[VoiceConnector]
  type VoiceConnectorName               = String

  implicit final class ChimeOps(val service: Chime) extends AnyVal {

    def associatePhoneNumberWithUserFuture(
        params: AssociatePhoneNumberWithUserRequest
    ): Future[AssociatePhoneNumberWithUserResponse] = service.associatePhoneNumberWithUser(params).promise.toFuture
    def associatePhoneNumbersWithVoiceConnectorFuture(
        params: AssociatePhoneNumbersWithVoiceConnectorRequest
    ): Future[AssociatePhoneNumbersWithVoiceConnectorResponse] =
      service.associatePhoneNumbersWithVoiceConnector(params).promise.toFuture
    def batchDeletePhoneNumberFuture(params: BatchDeletePhoneNumberRequest): Future[BatchDeletePhoneNumberResponse] =
      service.batchDeletePhoneNumber(params).promise.toFuture
    def batchSuspendUserFuture(params: BatchSuspendUserRequest): Future[BatchSuspendUserResponse] =
      service.batchSuspendUser(params).promise.toFuture
    def batchUnsuspendUserFuture(params: BatchUnsuspendUserRequest): Future[BatchUnsuspendUserResponse] =
      service.batchUnsuspendUser(params).promise.toFuture
    def batchUpdatePhoneNumberFuture(params: BatchUpdatePhoneNumberRequest): Future[BatchUpdatePhoneNumberResponse] =
      service.batchUpdatePhoneNumber(params).promise.toFuture
    def batchUpdateUserFuture(params: BatchUpdateUserRequest): Future[BatchUpdateUserResponse] =
      service.batchUpdateUser(params).promise.toFuture
    def createAccountFuture(params: CreateAccountRequest): Future[CreateAccountResponse] =
      service.createAccount(params).promise.toFuture
    def createPhoneNumberOrderFuture(params: CreatePhoneNumberOrderRequest): Future[CreatePhoneNumberOrderResponse] =
      service.createPhoneNumberOrder(params).promise.toFuture
    def createVoiceConnectorFuture(params: CreateVoiceConnectorRequest): Future[CreateVoiceConnectorResponse] =
      service.createVoiceConnector(params).promise.toFuture
    def deleteAccountFuture(params: DeleteAccountRequest): Future[DeleteAccountResponse] =
      service.deleteAccount(params).promise.toFuture
    def deletePhoneNumberFuture(params: DeletePhoneNumberRequest): Future[js.Object] =
      service.deletePhoneNumber(params).promise.toFuture
    def deleteVoiceConnectorFuture(params: DeleteVoiceConnectorRequest): Future[js.Object] =
      service.deleteVoiceConnector(params).promise.toFuture
    def deleteVoiceConnectorOriginationFuture(params: DeleteVoiceConnectorOriginationRequest): Future[js.Object] =
      service.deleteVoiceConnectorOrigination(params).promise.toFuture
    def deleteVoiceConnectorTerminationCredentialsFuture(
        params: DeleteVoiceConnectorTerminationCredentialsRequest
    ): Future[js.Object] = service.deleteVoiceConnectorTerminationCredentials(params).promise.toFuture
    def deleteVoiceConnectorTerminationFuture(params: DeleteVoiceConnectorTerminationRequest): Future[js.Object] =
      service.deleteVoiceConnectorTermination(params).promise.toFuture
    def disassociatePhoneNumberFromUserFuture(
        params: DisassociatePhoneNumberFromUserRequest
    ): Future[DisassociatePhoneNumberFromUserResponse] =
      service.disassociatePhoneNumberFromUser(params).promise.toFuture
    def disassociatePhoneNumbersFromVoiceConnectorFuture(
        params: DisassociatePhoneNumbersFromVoiceConnectorRequest
    ): Future[DisassociatePhoneNumbersFromVoiceConnectorResponse] =
      service.disassociatePhoneNumbersFromVoiceConnector(params).promise.toFuture
    def getAccountFuture(params: GetAccountRequest): Future[GetAccountResponse] =
      service.getAccount(params).promise.toFuture
    def getAccountSettingsFuture(params: GetAccountSettingsRequest): Future[GetAccountSettingsResponse] =
      service.getAccountSettings(params).promise.toFuture
    def getGlobalSettingsFuture(): Future[GetGlobalSettingsResponse] = service.getGlobalSettings().promise.toFuture
    def getPhoneNumberFuture(params: GetPhoneNumberRequest): Future[GetPhoneNumberResponse] =
      service.getPhoneNumber(params).promise.toFuture
    def getPhoneNumberOrderFuture(params: GetPhoneNumberOrderRequest): Future[GetPhoneNumberOrderResponse] =
      service.getPhoneNumberOrder(params).promise.toFuture
    def getUserFuture(params: GetUserRequest): Future[GetUserResponse] = service.getUser(params).promise.toFuture
    def getUserSettingsFuture(params: GetUserSettingsRequest): Future[GetUserSettingsResponse] =
      service.getUserSettings(params).promise.toFuture
    def getVoiceConnectorFuture(params: GetVoiceConnectorRequest): Future[GetVoiceConnectorResponse] =
      service.getVoiceConnector(params).promise.toFuture
    def getVoiceConnectorOriginationFuture(
        params: GetVoiceConnectorOriginationRequest
    ): Future[GetVoiceConnectorOriginationResponse] = service.getVoiceConnectorOrigination(params).promise.toFuture
    def getVoiceConnectorTerminationFuture(
        params: GetVoiceConnectorTerminationRequest
    ): Future[GetVoiceConnectorTerminationResponse] = service.getVoiceConnectorTermination(params).promise.toFuture
    def getVoiceConnectorTerminationHealthFuture(
        params: GetVoiceConnectorTerminationHealthRequest
    ): Future[GetVoiceConnectorTerminationHealthResponse] =
      service.getVoiceConnectorTerminationHealth(params).promise.toFuture
    def inviteUsersFuture(params: InviteUsersRequest): Future[InviteUsersResponse] =
      service.inviteUsers(params).promise.toFuture
    def listAccountsFuture(params: ListAccountsRequest): Future[ListAccountsResponse] =
      service.listAccounts(params).promise.toFuture
    def listPhoneNumberOrdersFuture(params: ListPhoneNumberOrdersRequest): Future[ListPhoneNumberOrdersResponse] =
      service.listPhoneNumberOrders(params).promise.toFuture
    def listPhoneNumbersFuture(params: ListPhoneNumbersRequest): Future[ListPhoneNumbersResponse] =
      service.listPhoneNumbers(params).promise.toFuture
    def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] =
      service.listUsers(params).promise.toFuture
    def listVoiceConnectorTerminationCredentialsFuture(
        params: ListVoiceConnectorTerminationCredentialsRequest
    ): Future[ListVoiceConnectorTerminationCredentialsResponse] =
      service.listVoiceConnectorTerminationCredentials(params).promise.toFuture
    def listVoiceConnectorsFuture(params: ListVoiceConnectorsRequest): Future[ListVoiceConnectorsResponse] =
      service.listVoiceConnectors(params).promise.toFuture
    def logoutUserFuture(params: LogoutUserRequest): Future[LogoutUserResponse] =
      service.logoutUser(params).promise.toFuture
    def putVoiceConnectorOriginationFuture(
        params: PutVoiceConnectorOriginationRequest
    ): Future[PutVoiceConnectorOriginationResponse] = service.putVoiceConnectorOrigination(params).promise.toFuture
    def putVoiceConnectorTerminationCredentialsFuture(
        params: PutVoiceConnectorTerminationCredentialsRequest
    ): Future[js.Object] = service.putVoiceConnectorTerminationCredentials(params).promise.toFuture
    def putVoiceConnectorTerminationFuture(
        params: PutVoiceConnectorTerminationRequest
    ): Future[PutVoiceConnectorTerminationResponse] = service.putVoiceConnectorTermination(params).promise.toFuture
    def resetPersonalPINFuture(params: ResetPersonalPINRequest): Future[ResetPersonalPINResponse] =
      service.resetPersonalPIN(params).promise.toFuture
    def restorePhoneNumberFuture(params: RestorePhoneNumberRequest): Future[RestorePhoneNumberResponse] =
      service.restorePhoneNumber(params).promise.toFuture
    def searchAvailablePhoneNumbersFuture(
        params: SearchAvailablePhoneNumbersRequest
    ): Future[SearchAvailablePhoneNumbersResponse] = service.searchAvailablePhoneNumbers(params).promise.toFuture
    def updateAccountFuture(params: UpdateAccountRequest): Future[UpdateAccountResponse] =
      service.updateAccount(params).promise.toFuture
    def updateAccountSettingsFuture(params: UpdateAccountSettingsRequest): Future[UpdateAccountSettingsResponse] =
      service.updateAccountSettings(params).promise.toFuture
    def updateGlobalSettingsFuture(params: UpdateGlobalSettingsRequest): Future[js.Object] =
      service.updateGlobalSettings(params).promise.toFuture
    def updatePhoneNumberFuture(params: UpdatePhoneNumberRequest): Future[UpdatePhoneNumberResponse] =
      service.updatePhoneNumber(params).promise.toFuture
    def updateUserFuture(params: UpdateUserRequest): Future[UpdateUserResponse] =
      service.updateUser(params).promise.toFuture
    def updateUserSettingsFuture(params: UpdateUserSettingsRequest): Future[js.Object] =
      service.updateUserSettings(params).promise.toFuture
    def updateVoiceConnectorFuture(params: UpdateVoiceConnectorRequest): Future[UpdateVoiceConnectorResponse] =
      service.updateVoiceConnector(params).promise.toFuture
  }
}

package chime {
  @js.native
  @JSImport("aws-sdk", "Chime")
  class Chime() extends js.Object {
    def this(config: AWSConfig) = this()

    def associatePhoneNumberWithUser(
        params: AssociatePhoneNumberWithUserRequest
    ): Request[AssociatePhoneNumberWithUserResponse] = js.native
    def associatePhoneNumbersWithVoiceConnector(
        params: AssociatePhoneNumbersWithVoiceConnectorRequest
    ): Request[AssociatePhoneNumbersWithVoiceConnectorResponse] = js.native
    def batchDeletePhoneNumber(params: BatchDeletePhoneNumberRequest): Request[BatchDeletePhoneNumberResponse] =
      js.native
    def batchSuspendUser(params: BatchSuspendUserRequest): Request[BatchSuspendUserResponse]       = js.native
    def batchUnsuspendUser(params: BatchUnsuspendUserRequest): Request[BatchUnsuspendUserResponse] = js.native
    def batchUpdatePhoneNumber(params: BatchUpdatePhoneNumberRequest): Request[BatchUpdatePhoneNumberResponse] =
      js.native
    def batchUpdateUser(params: BatchUpdateUserRequest): Request[BatchUpdateUserResponse] = js.native
    def createAccount(params: CreateAccountRequest): Request[CreateAccountResponse]       = js.native
    def createPhoneNumberOrder(params: CreatePhoneNumberOrderRequest): Request[CreatePhoneNumberOrderResponse] =
      js.native
    def createVoiceConnector(params: CreateVoiceConnectorRequest): Request[CreateVoiceConnectorResponse]    = js.native
    def deleteAccount(params: DeleteAccountRequest): Request[DeleteAccountResponse]                         = js.native
    def deletePhoneNumber(params: DeletePhoneNumberRequest): Request[js.Object]                             = js.native
    def deleteVoiceConnector(params: DeleteVoiceConnectorRequest): Request[js.Object]                       = js.native
    def deleteVoiceConnectorOrigination(params: DeleteVoiceConnectorOriginationRequest): Request[js.Object] = js.native
    def deleteVoiceConnectorTermination(params: DeleteVoiceConnectorTerminationRequest): Request[js.Object] = js.native
    def deleteVoiceConnectorTerminationCredentials(
        params: DeleteVoiceConnectorTerminationCredentialsRequest
    ): Request[js.Object] = js.native
    def disassociatePhoneNumberFromUser(
        params: DisassociatePhoneNumberFromUserRequest
    ): Request[DisassociatePhoneNumberFromUserResponse] = js.native
    def disassociatePhoneNumbersFromVoiceConnector(
        params: DisassociatePhoneNumbersFromVoiceConnectorRequest
    ): Request[DisassociatePhoneNumbersFromVoiceConnectorResponse]                                    = js.native
    def getAccount(params: GetAccountRequest): Request[GetAccountResponse]                            = js.native
    def getAccountSettings(params: GetAccountSettingsRequest): Request[GetAccountSettingsResponse]    = js.native
    def getGlobalSettings(): Request[GetGlobalSettingsResponse]                                       = js.native
    def getPhoneNumber(params: GetPhoneNumberRequest): Request[GetPhoneNumberResponse]                = js.native
    def getPhoneNumberOrder(params: GetPhoneNumberOrderRequest): Request[GetPhoneNumberOrderResponse] = js.native
    def getUser(params: GetUserRequest): Request[GetUserResponse]                                     = js.native
    def getUserSettings(params: GetUserSettingsRequest): Request[GetUserSettingsResponse]             = js.native
    def getVoiceConnector(params: GetVoiceConnectorRequest): Request[GetVoiceConnectorResponse]       = js.native
    def getVoiceConnectorOrigination(
        params: GetVoiceConnectorOriginationRequest
    ): Request[GetVoiceConnectorOriginationResponse] = js.native
    def getVoiceConnectorTermination(
        params: GetVoiceConnectorTerminationRequest
    ): Request[GetVoiceConnectorTerminationResponse] = js.native
    def getVoiceConnectorTerminationHealth(
        params: GetVoiceConnectorTerminationHealthRequest
    ): Request[GetVoiceConnectorTerminationHealthResponse]                                                  = js.native
    def inviteUsers(params: InviteUsersRequest): Request[InviteUsersResponse]                               = js.native
    def listAccounts(params: ListAccountsRequest): Request[ListAccountsResponse]                            = js.native
    def listPhoneNumberOrders(params: ListPhoneNumberOrdersRequest): Request[ListPhoneNumberOrdersResponse] = js.native
    def listPhoneNumbers(params: ListPhoneNumbersRequest): Request[ListPhoneNumbersResponse]                = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse]                                     = js.native
    def listVoiceConnectorTerminationCredentials(
        params: ListVoiceConnectorTerminationCredentialsRequest
    ): Request[ListVoiceConnectorTerminationCredentialsResponse]                                      = js.native
    def listVoiceConnectors(params: ListVoiceConnectorsRequest): Request[ListVoiceConnectorsResponse] = js.native
    def logoutUser(params: LogoutUserRequest): Request[LogoutUserResponse]                            = js.native
    def putVoiceConnectorOrigination(
        params: PutVoiceConnectorOriginationRequest
    ): Request[PutVoiceConnectorOriginationResponse] = js.native
    def putVoiceConnectorTermination(
        params: PutVoiceConnectorTerminationRequest
    ): Request[PutVoiceConnectorTerminationResponse] = js.native
    def putVoiceConnectorTerminationCredentials(
        params: PutVoiceConnectorTerminationCredentialsRequest
    ): Request[js.Object]                                                                          = js.native
    def resetPersonalPIN(params: ResetPersonalPINRequest): Request[ResetPersonalPINResponse]       = js.native
    def restorePhoneNumber(params: RestorePhoneNumberRequest): Request[RestorePhoneNumberResponse] = js.native
    def searchAvailablePhoneNumbers(
        params: SearchAvailablePhoneNumbersRequest
    ): Request[SearchAvailablePhoneNumbersResponse]                                                         = js.native
    def updateAccount(params: UpdateAccountRequest): Request[UpdateAccountResponse]                         = js.native
    def updateAccountSettings(params: UpdateAccountSettingsRequest): Request[UpdateAccountSettingsResponse] = js.native
    def updateGlobalSettings(params: UpdateGlobalSettingsRequest): Request[js.Object]                       = js.native
    def updatePhoneNumber(params: UpdatePhoneNumberRequest): Request[UpdatePhoneNumberResponse]             = js.native
    def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse]                                  = js.native
    def updateUserSettings(params: UpdateUserSettingsRequest): Request[js.Object]                           = js.native
    def updateVoiceConnector(params: UpdateVoiceConnectorRequest): Request[UpdateVoiceConnectorResponse]    = js.native
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
    def apply(
        AccountId: String,
        AwsAccountId: String,
        Name: String,
        AccountType: js.UndefOr[AccountType] = js.undefined,
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        DefaultLicense: js.UndefOr[License] = js.undefined,
        SupportedLicenses: js.UndefOr[LicenseList] = js.undefined
    ): Account = {
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
    * Settings related to the Amazon Chime account. This includes settings that start or stop remote control of shared screens, or start or stop the dial-out option in the Amazon Chime web application. For more information about these settings, see [[https://docs.aws.amazon.com/chime/latest/ag/policies.html|Use the Policies Page]] in the <i>Amazon Chime Administration Guide</i>.
    */
  @js.native
  trait AccountSettings extends js.Object {
    var DisableRemoteControl: js.UndefOr[Boolean]
    var EnableDialOut: js.UndefOr[Boolean]
  }

  object AccountSettings {
    def apply(
        DisableRemoteControl: js.UndefOr[Boolean] = js.undefined,
        EnableDialOut: js.UndefOr[Boolean] = js.undefined
    ): AccountSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisableRemoteControl" -> DisableRemoteControl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableDialOut" -> EnableDialOut.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
  trait AssociatePhoneNumberWithUserRequest extends js.Object {
    var AccountId: String
    var E164PhoneNumber: E164PhoneNumber
    var UserId: String
  }

  object AssociatePhoneNumberWithUserRequest {
    def apply(
        AccountId: String,
        E164PhoneNumber: E164PhoneNumber,
        UserId: String
    ): AssociatePhoneNumberWithUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId"       -> AccountId.asInstanceOf[js.Any],
        "E164PhoneNumber" -> E164PhoneNumber.asInstanceOf[js.Any],
        "UserId"          -> UserId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociatePhoneNumberWithUserRequest]
    }
  }

  @js.native
  trait AssociatePhoneNumberWithUserResponse extends js.Object {}

  object AssociatePhoneNumberWithUserResponse {
    def apply(
        ): AssociatePhoneNumberWithUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociatePhoneNumberWithUserResponse]
    }
  }

  @js.native
  trait AssociatePhoneNumbersWithVoiceConnectorRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
    var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList]
  }

  object AssociatePhoneNumbersWithVoiceConnectorRequest {
    def apply(
        VoiceConnectorId: NonEmptyString,
        E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.undefined
    ): AssociatePhoneNumbersWithVoiceConnectorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any],
        "E164PhoneNumbers" -> E164PhoneNumbers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[AssociatePhoneNumbersWithVoiceConnectorRequest]
    }
  }

  @js.native
  trait AssociatePhoneNumbersWithVoiceConnectorResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  object AssociatePhoneNumbersWithVoiceConnectorResponse {
    def apply(
        PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
    ): AssociatePhoneNumbersWithVoiceConnectorResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PhoneNumberErrors" -> PhoneNumberErrors.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[AssociatePhoneNumbersWithVoiceConnectorResponse]
    }
  }

  @js.native
  trait BatchDeletePhoneNumberRequest extends js.Object {
    var PhoneNumberIds: NonEmptyStringList
  }

  object BatchDeletePhoneNumberRequest {
    def apply(
        PhoneNumberIds: NonEmptyStringList
    ): BatchDeletePhoneNumberRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PhoneNumberIds" -> PhoneNumberIds.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeletePhoneNumberRequest]
    }
  }

  @js.native
  trait BatchDeletePhoneNumberResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  object BatchDeletePhoneNumberResponse {
    def apply(
        PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
    ): BatchDeletePhoneNumberResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PhoneNumberErrors" -> PhoneNumberErrors.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeletePhoneNumberResponse]
    }
  }

  @js.native
  trait BatchSuspendUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserIdList: UserIdList
  }

  object BatchSuspendUserRequest {
    def apply(
        AccountId: NonEmptyString,
        UserIdList: UserIdList
    ): BatchSuspendUserRequest = {
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
    def apply(
        UserErrors: js.UndefOr[UserErrorList] = js.undefined
    ): BatchSuspendUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserErrors" -> UserErrors.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchSuspendUserResponse]
    }
  }

  @js.native
  trait BatchUnsuspendUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserIdList: UserIdList
  }

  object BatchUnsuspendUserRequest {
    def apply(
        AccountId: NonEmptyString,
        UserIdList: UserIdList
    ): BatchUnsuspendUserRequest = {
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
    def apply(
        UserErrors: js.UndefOr[UserErrorList] = js.undefined
    ): BatchUnsuspendUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserErrors" -> UserErrors.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchUnsuspendUserResponse]
    }
  }

  @js.native
  trait BatchUpdatePhoneNumberRequest extends js.Object {
    var UpdatePhoneNumberRequestItems: UpdatePhoneNumberRequestItemList
  }

  object BatchUpdatePhoneNumberRequest {
    def apply(
        UpdatePhoneNumberRequestItems: UpdatePhoneNumberRequestItemList
    ): BatchUpdatePhoneNumberRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UpdatePhoneNumberRequestItems" -> UpdatePhoneNumberRequestItems.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchUpdatePhoneNumberRequest]
    }
  }

  @js.native
  trait BatchUpdatePhoneNumberResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  object BatchUpdatePhoneNumberResponse {
    def apply(
        PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
    ): BatchUpdatePhoneNumberResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PhoneNumberErrors" -> PhoneNumberErrors.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchUpdatePhoneNumberResponse]
    }
  }

  @js.native
  trait BatchUpdateUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UpdateUserRequestItems: UpdateUserRequestItemList
  }

  object BatchUpdateUserRequest {
    def apply(
        AccountId: NonEmptyString,
        UpdateUserRequestItems: UpdateUserRequestItemList
    ): BatchUpdateUserRequest = {
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
    def apply(
        UserErrors: js.UndefOr[UserErrorList] = js.undefined
    ): BatchUpdateUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserErrors" -> UserErrors.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchUpdateUserResponse]
    }
  }

  /**
    * The Amazon Chime Business Calling settings for the administrator's AWS account. Includes any Amazon S3 buckets designated for storing call detail records.
    */
  @js.native
  trait BusinessCallingSettings extends js.Object {
    var CdrBucket: js.UndefOr[String]
  }

  object BusinessCallingSettings {
    def apply(
        CdrBucket: js.UndefOr[String] = js.undefined
    ): BusinessCallingSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CdrBucket" -> CdrBucket.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BusinessCallingSettings]
    }
  }

  @js.native
  trait CreateAccountRequest extends js.Object {
    var Name: AccountName
  }

  object CreateAccountRequest {
    def apply(
        Name: AccountName
    ): CreateAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAccountRequest]
    }
  }

  @js.native
  trait CreateAccountResponse extends js.Object {
    var Account: js.UndefOr[Account]
  }

  object CreateAccountResponse {
    def apply(
        Account: js.UndefOr[Account] = js.undefined
    ): CreateAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Account" -> Account.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAccountResponse]
    }
  }

  @js.native
  trait CreatePhoneNumberOrderRequest extends js.Object {
    var E164PhoneNumbers: E164PhoneNumberList
    var ProductType: PhoneNumberProductType
  }

  object CreatePhoneNumberOrderRequest {
    def apply(
        E164PhoneNumbers: E164PhoneNumberList,
        ProductType: PhoneNumberProductType
    ): CreatePhoneNumberOrderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "E164PhoneNumbers" -> E164PhoneNumbers.asInstanceOf[js.Any],
        "ProductType"      -> ProductType.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePhoneNumberOrderRequest]
    }
  }

  @js.native
  trait CreatePhoneNumberOrderResponse extends js.Object {
    var PhoneNumberOrder: js.UndefOr[PhoneNumberOrder]
  }

  object CreatePhoneNumberOrderResponse {
    def apply(
        PhoneNumberOrder: js.UndefOr[PhoneNumberOrder] = js.undefined
    ): CreatePhoneNumberOrderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PhoneNumberOrder" -> PhoneNumberOrder.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePhoneNumberOrderResponse]
    }
  }

  @js.native
  trait CreateVoiceConnectorRequest extends js.Object {
    var Name: VoiceConnectorName
    var RequireEncryption: Boolean
  }

  object CreateVoiceConnectorRequest {
    def apply(
        Name: VoiceConnectorName,
        RequireEncryption: Boolean
    ): CreateVoiceConnectorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"              -> Name.asInstanceOf[js.Any],
        "RequireEncryption" -> RequireEncryption.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVoiceConnectorRequest]
    }
  }

  @js.native
  trait CreateVoiceConnectorResponse extends js.Object {
    var VoiceConnector: js.UndefOr[VoiceConnector]
  }

  object CreateVoiceConnectorResponse {
    def apply(
        VoiceConnector: js.UndefOr[VoiceConnector] = js.undefined
    ): CreateVoiceConnectorResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VoiceConnector" -> VoiceConnector.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVoiceConnectorResponse]
    }
  }

  /**
    * The SIP credentials used to authenticate requests to your Amazon Chime Voice Connector.
    */
  @js.native
  trait Credential extends js.Object {
    var Password: js.UndefOr[SensitiveString]
    var Username: js.UndefOr[SensitiveString]
  }

  object Credential {
    def apply(
        Password: js.UndefOr[SensitiveString] = js.undefined,
        Username: js.UndefOr[SensitiveString] = js.undefined
    ): Credential = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Password" -> Password.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Username" -> Username.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Credential]
    }
  }

  @js.native
  trait DeleteAccountRequest extends js.Object {
    var AccountId: NonEmptyString
  }

  object DeleteAccountRequest {
    def apply(
        AccountId: NonEmptyString
    ): DeleteAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAccountRequest]
    }
  }

  @js.native
  trait DeleteAccountResponse extends js.Object {}

  object DeleteAccountResponse {
    def apply(
        ): DeleteAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAccountResponse]
    }
  }

  @js.native
  trait DeletePhoneNumberRequest extends js.Object {
    var PhoneNumberId: String
  }

  object DeletePhoneNumberRequest {
    def apply(
        PhoneNumberId: String
    ): DeletePhoneNumberRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePhoneNumberRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorOriginationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object DeleteVoiceConnectorOriginationRequest {
    def apply(
        VoiceConnectorId: NonEmptyString
    ): DeleteVoiceConnectorOriginationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVoiceConnectorOriginationRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object DeleteVoiceConnectorRequest {
    def apply(
        VoiceConnectorId: NonEmptyString
    ): DeleteVoiceConnectorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVoiceConnectorRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorTerminationCredentialsRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
    var Usernames: js.UndefOr[SensitiveStringList]
  }

  object DeleteVoiceConnectorTerminationCredentialsRequest {
    def apply(
        VoiceConnectorId: NonEmptyString,
        Usernames: js.UndefOr[SensitiveStringList] = js.undefined
    ): DeleteVoiceConnectorTerminationCredentialsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any],
        "Usernames" -> Usernames.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DeleteVoiceConnectorTerminationCredentialsRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorTerminationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object DeleteVoiceConnectorTerminationRequest {
    def apply(
        VoiceConnectorId: NonEmptyString
    ): DeleteVoiceConnectorTerminationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVoiceConnectorTerminationRequest]
    }
  }

  @js.native
  trait DisassociatePhoneNumberFromUserRequest extends js.Object {
    var AccountId: String
    var UserId: String
  }

  object DisassociatePhoneNumberFromUserRequest {
    def apply(
        AccountId: String,
        UserId: String
    ): DisassociatePhoneNumberFromUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "UserId"    -> UserId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociatePhoneNumberFromUserRequest]
    }
  }

  @js.native
  trait DisassociatePhoneNumberFromUserResponse extends js.Object {}

  object DisassociatePhoneNumberFromUserResponse {
    def apply(
        ): DisassociatePhoneNumberFromUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociatePhoneNumberFromUserResponse]
    }
  }

  @js.native
  trait DisassociatePhoneNumbersFromVoiceConnectorRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
    var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList]
  }

  object DisassociatePhoneNumbersFromVoiceConnectorRequest {
    def apply(
        VoiceConnectorId: NonEmptyString,
        E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.undefined
    ): DisassociatePhoneNumbersFromVoiceConnectorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any],
        "E164PhoneNumbers" -> E164PhoneNumbers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DisassociatePhoneNumbersFromVoiceConnectorRequest]
    }
  }

  @js.native
  trait DisassociatePhoneNumbersFromVoiceConnectorResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  object DisassociatePhoneNumbersFromVoiceConnectorResponse {
    def apply(
        PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
    ): DisassociatePhoneNumbersFromVoiceConnectorResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PhoneNumberErrors" -> PhoneNumberErrors.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DisassociatePhoneNumbersFromVoiceConnectorResponse]
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
    def apply(
        AccountId: NonEmptyString
    ): GetAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountRequest]
    }
  }

  @js.native
  trait GetAccountResponse extends js.Object {
    var Account: js.UndefOr[Account]
  }

  object GetAccountResponse {
    def apply(
        Account: js.UndefOr[Account] = js.undefined
    ): GetAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Account" -> Account.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountResponse]
    }
  }

  @js.native
  trait GetAccountSettingsRequest extends js.Object {
    var AccountId: NonEmptyString
  }

  object GetAccountSettingsRequest {
    def apply(
        AccountId: NonEmptyString
    ): GetAccountSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountSettingsRequest]
    }
  }

  @js.native
  trait GetAccountSettingsResponse extends js.Object {
    var AccountSettings: js.UndefOr[AccountSettings]
  }

  object GetAccountSettingsResponse {
    def apply(
        AccountSettings: js.UndefOr[AccountSettings] = js.undefined
    ): GetAccountSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountSettings" -> AccountSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountSettingsResponse]
    }
  }

  @js.native
  trait GetGlobalSettingsResponse extends js.Object {
    var BusinessCalling: js.UndefOr[BusinessCallingSettings]
    var VoiceConnector: js.UndefOr[VoiceConnectorSettings]
  }

  object GetGlobalSettingsResponse {
    def apply(
        BusinessCalling: js.UndefOr[BusinessCallingSettings] = js.undefined,
        VoiceConnector: js.UndefOr[VoiceConnectorSettings] = js.undefined
    ): GetGlobalSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BusinessCalling" -> BusinessCalling.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VoiceConnector" -> VoiceConnector.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGlobalSettingsResponse]
    }
  }

  @js.native
  trait GetPhoneNumberOrderRequest extends js.Object {
    var PhoneNumberOrderId: GuidString
  }

  object GetPhoneNumberOrderRequest {
    def apply(
        PhoneNumberOrderId: GuidString
    ): GetPhoneNumberOrderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PhoneNumberOrderId" -> PhoneNumberOrderId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPhoneNumberOrderRequest]
    }
  }

  @js.native
  trait GetPhoneNumberOrderResponse extends js.Object {
    var PhoneNumberOrder: js.UndefOr[PhoneNumberOrder]
  }

  object GetPhoneNumberOrderResponse {
    def apply(
        PhoneNumberOrder: js.UndefOr[PhoneNumberOrder] = js.undefined
    ): GetPhoneNumberOrderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PhoneNumberOrder" -> PhoneNumberOrder.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPhoneNumberOrderResponse]
    }
  }

  @js.native
  trait GetPhoneNumberRequest extends js.Object {
    var PhoneNumberId: String
  }

  object GetPhoneNumberRequest {
    def apply(
        PhoneNumberId: String
    ): GetPhoneNumberRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPhoneNumberRequest]
    }
  }

  @js.native
  trait GetPhoneNumberResponse extends js.Object {
    var PhoneNumber: js.UndefOr[PhoneNumber]
  }

  object GetPhoneNumberResponse {
    def apply(
        PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    ): GetPhoneNumberResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PhoneNumber" -> PhoneNumber.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPhoneNumberResponse]
    }
  }

  @js.native
  trait GetUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserId: NonEmptyString
  }

  object GetUserRequest {
    def apply(
        AccountId: NonEmptyString,
        UserId: NonEmptyString
    ): GetUserRequest = {
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
    def apply(
        User: js.UndefOr[User] = js.undefined
    ): GetUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "User" -> User.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserResponse]
    }
  }

  @js.native
  trait GetUserSettingsRequest extends js.Object {
    var AccountId: String
    var UserId: String
  }

  object GetUserSettingsRequest {
    def apply(
        AccountId: String,
        UserId: String
    ): GetUserSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "UserId"    -> UserId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserSettingsRequest]
    }
  }

  @js.native
  trait GetUserSettingsResponse extends js.Object {
    var UserSettings: js.UndefOr[UserSettings]
  }

  object GetUserSettingsResponse {
    def apply(
        UserSettings: js.UndefOr[UserSettings] = js.undefined
    ): GetUserSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserSettings" -> UserSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserSettingsResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorOriginationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object GetVoiceConnectorOriginationRequest {
    def apply(
        VoiceConnectorId: NonEmptyString
    ): GetVoiceConnectorOriginationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVoiceConnectorOriginationRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorOriginationResponse extends js.Object {
    var Origination: js.UndefOr[Origination]
  }

  object GetVoiceConnectorOriginationResponse {
    def apply(
        Origination: js.UndefOr[Origination] = js.undefined
    ): GetVoiceConnectorOriginationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Origination" -> Origination.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVoiceConnectorOriginationResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object GetVoiceConnectorRequest {
    def apply(
        VoiceConnectorId: NonEmptyString
    ): GetVoiceConnectorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVoiceConnectorRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorResponse extends js.Object {
    var VoiceConnector: js.UndefOr[VoiceConnector]
  }

  object GetVoiceConnectorResponse {
    def apply(
        VoiceConnector: js.UndefOr[VoiceConnector] = js.undefined
    ): GetVoiceConnectorResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VoiceConnector" -> VoiceConnector.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVoiceConnectorResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorTerminationHealthRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object GetVoiceConnectorTerminationHealthRequest {
    def apply(
        VoiceConnectorId: NonEmptyString
    ): GetVoiceConnectorTerminationHealthRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVoiceConnectorTerminationHealthRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorTerminationHealthResponse extends js.Object {
    var TerminationHealth: js.UndefOr[TerminationHealth]
  }

  object GetVoiceConnectorTerminationHealthResponse {
    def apply(
        TerminationHealth: js.UndefOr[TerminationHealth] = js.undefined
    ): GetVoiceConnectorTerminationHealthResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TerminationHealth" -> TerminationHealth.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[GetVoiceConnectorTerminationHealthResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorTerminationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object GetVoiceConnectorTerminationRequest {
    def apply(
        VoiceConnectorId: NonEmptyString
    ): GetVoiceConnectorTerminationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVoiceConnectorTerminationRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorTerminationResponse extends js.Object {
    var Termination: js.UndefOr[Termination]
  }

  object GetVoiceConnectorTerminationResponse {
    def apply(
        Termination: js.UndefOr[Termination] = js.undefined
    ): GetVoiceConnectorTerminationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Termination" -> Termination.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVoiceConnectorTerminationResponse]
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
    def apply(
        EmailAddress: js.UndefOr[EmailAddress] = js.undefined,
        EmailStatus: js.UndefOr[EmailStatus] = js.undefined,
        InviteId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[InviteStatus] = js.undefined
    ): Invite = {
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
    def apply(
        AccountId: NonEmptyString,
        UserEmailList: UserEmailList
    ): InviteUsersRequest = {
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
    def apply(
        Invites: js.UndefOr[InviteList] = js.undefined
    ): InviteUsersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Invites" -> Invites.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(
        MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.undefined,
        Name: js.UndefOr[AccountName] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        UserEmail: js.UndefOr[EmailAddress] = js.undefined
    ): ListAccountsRequest = {
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
    def apply(
        Accounts: js.UndefOr[AccountList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
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
  trait ListPhoneNumberOrdersRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  object ListPhoneNumberOrdersRequest {
    def apply(
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListPhoneNumberOrdersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPhoneNumberOrdersRequest]
    }
  }

  @js.native
  trait ListPhoneNumberOrdersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var PhoneNumberOrders: js.UndefOr[PhoneNumberOrderList]
  }

  object ListPhoneNumberOrdersResponse {
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        PhoneNumberOrders: js.UndefOr[PhoneNumberOrderList] = js.undefined
    ): ListPhoneNumberOrdersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PhoneNumberOrders" -> PhoneNumberOrders.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPhoneNumberOrdersResponse]
    }
  }

  @js.native
  trait ListPhoneNumbersRequest extends js.Object {
    var FilterName: js.UndefOr[PhoneNumberAssociationName]
    var FilterValue: js.UndefOr[String]
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
    var ProductType: js.UndefOr[PhoneNumberProductType]
    var Status: js.UndefOr[PhoneNumberStatus]
  }

  object ListPhoneNumbersRequest {
    def apply(
        FilterName: js.UndefOr[PhoneNumberAssociationName] = js.undefined,
        FilterValue: js.UndefOr[String] = js.undefined,
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined,
        Status: js.UndefOr[PhoneNumberStatus] = js.undefined
    ): ListPhoneNumbersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FilterName" -> FilterName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FilterValue" -> FilterValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProductType" -> ProductType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPhoneNumbersRequest]
    }
  }

  @js.native
  trait ListPhoneNumbersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var PhoneNumbers: js.UndefOr[PhoneNumberList]
  }

  object ListPhoneNumbersResponse {
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        PhoneNumbers: js.UndefOr[PhoneNumberList] = js.undefined
    ): ListPhoneNumbersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PhoneNumbers" -> PhoneNumbers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPhoneNumbersResponse]
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
    def apply(
        AccountId: NonEmptyString,
        MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        UserEmail: js.UndefOr[EmailAddress] = js.undefined
    ): ListUsersRequest = {
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
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Users: js.UndefOr[UserList] = js.undefined
    ): ListUsersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Users" -> Users.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersResponse]
    }
  }

  @js.native
  trait ListVoiceConnectorTerminationCredentialsRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object ListVoiceConnectorTerminationCredentialsRequest {
    def apply(
        VoiceConnectorId: NonEmptyString
    ): ListVoiceConnectorTerminationCredentialsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[ListVoiceConnectorTerminationCredentialsRequest]
    }
  }

  @js.native
  trait ListVoiceConnectorTerminationCredentialsResponse extends js.Object {
    var Usernames: js.UndefOr[SensitiveStringList]
  }

  object ListVoiceConnectorTerminationCredentialsResponse {
    def apply(
        Usernames: js.UndefOr[SensitiveStringList] = js.undefined
    ): ListVoiceConnectorTerminationCredentialsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Usernames" -> Usernames.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[ListVoiceConnectorTerminationCredentialsResponse]
    }
  }

  @js.native
  trait ListVoiceConnectorsRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  object ListVoiceConnectorsRequest {
    def apply(
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListVoiceConnectorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVoiceConnectorsRequest]
    }
  }

  @js.native
  trait ListVoiceConnectorsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var VoiceConnectors: js.UndefOr[VoiceConnectorList]
  }

  object ListVoiceConnectorsResponse {
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        VoiceConnectors: js.UndefOr[VoiceConnectorList] = js.undefined
    ): ListVoiceConnectorsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VoiceConnectors" -> VoiceConnectors.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVoiceConnectorsResponse]
    }
  }

  @js.native
  trait LogoutUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserId: NonEmptyString
  }

  object LogoutUserRequest {
    def apply(
        AccountId: NonEmptyString,
        UserId: NonEmptyString
    ): LogoutUserRequest = {
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
    def apply(
        ): LogoutUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogoutUserResponse]
    }
  }

  /**
    * A phone number for which an order has been placed.
    */
  @js.native
  trait OrderedPhoneNumber extends js.Object {
    var E164PhoneNumber: js.UndefOr[E164PhoneNumber]
    var Status: js.UndefOr[OrderedPhoneNumberStatus]
  }

  object OrderedPhoneNumber {
    def apply(
        E164PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined,
        Status: js.UndefOr[OrderedPhoneNumberStatus] = js.undefined
    ): OrderedPhoneNumber = {
      val _fields = IndexedSeq[(String, js.Any)](
        "E164PhoneNumber" -> E164PhoneNumber.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrderedPhoneNumber]
    }
  }

  object OrderedPhoneNumberStatusEnum {
    val Processing = "Processing"
    val Acquired   = "Acquired"
    val Failed     = "Failed"

    val values = IndexedSeq(Processing, Acquired, Failed)
  }

  /**
    * Origination settings enable your SIP hosts to receive inbound calls using your Amazon Chime Voice Connector.
    */
  @js.native
  trait Origination extends js.Object {
    var Disabled: js.UndefOr[Boolean]
    var Routes: js.UndefOr[OriginationRouteList]
  }

  object Origination {
    def apply(
        Disabled: js.UndefOr[Boolean] = js.undefined,
        Routes: js.UndefOr[OriginationRouteList] = js.undefined
    ): Origination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Disabled" -> Disabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Routes" -> Routes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Origination]
    }
  }

  /**
    * Origination routes define call distribution properties for your SIP hosts to receive inbound calls using your Amazon Chime Voice Connector. Limit: 10 origination routes per Amazon Chime Voice Connector.
    */
  @js.native
  trait OriginationRoute extends js.Object {
    var Host: js.UndefOr[String]
    var Port: js.UndefOr[Port]
    var Priority: js.UndefOr[OriginationRoutePriority]
    var Protocol: js.UndefOr[OriginationRouteProtocol]
    var Weight: js.UndefOr[OriginationRouteWeight]
  }

  object OriginationRoute {
    def apply(
        Host: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[Port] = js.undefined,
        Priority: js.UndefOr[OriginationRoutePriority] = js.undefined,
        Protocol: js.UndefOr[OriginationRouteProtocol] = js.undefined,
        Weight: js.UndefOr[OriginationRouteWeight] = js.undefined
    ): OriginationRoute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Host" -> Host.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Priority" -> Priority.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Protocol" -> Protocol.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Weight" -> Weight.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OriginationRoute]
    }
  }

  object OriginationRouteProtocolEnum {
    val TCP = "TCP"
    val UDP = "UDP"

    val values = IndexedSeq(TCP, UDP)
  }

  /**
    * A phone number used for Amazon Chime Business Calling or an Amazon Chime Voice Connector.
    */
  @js.native
  trait PhoneNumber extends js.Object {
    var Associations: js.UndefOr[PhoneNumberAssociationList]
    var Capabilities: js.UndefOr[PhoneNumberCapabilities]
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var DeletionTimestamp: js.UndefOr[Iso8601Timestamp]
    var E164PhoneNumber: js.UndefOr[E164PhoneNumber]
    var PhoneNumberId: js.UndefOr[String]
    var ProductType: js.UndefOr[PhoneNumberProductType]
    var Status: js.UndefOr[PhoneNumberStatus]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  object PhoneNumber {
    def apply(
        Associations: js.UndefOr[PhoneNumberAssociationList] = js.undefined,
        Capabilities: js.UndefOr[PhoneNumberCapabilities] = js.undefined,
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        DeletionTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        E164PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined,
        PhoneNumberId: js.UndefOr[String] = js.undefined,
        ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined,
        Status: js.UndefOr[PhoneNumberStatus] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): PhoneNumber = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Associations" -> Associations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Capabilities" -> Capabilities.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedTimestamp" -> CreatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeletionTimestamp" -> DeletionTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "E164PhoneNumber" -> E164PhoneNumber.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PhoneNumberId" -> PhoneNumberId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProductType" -> ProductType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpdatedTimestamp" -> UpdatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PhoneNumber]
    }
  }

  /**
    * The phone number associations, such as Amazon Chime account ID, Amazon Chime user ID, or Amazon Chime Voice Connector ID.
    */
  @js.native
  trait PhoneNumberAssociation extends js.Object {
    var AssociatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var Name: js.UndefOr[PhoneNumberAssociationName]
    var Value: js.UndefOr[String]
  }

  object PhoneNumberAssociation {
    def apply(
        AssociatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        Name: js.UndefOr[PhoneNumberAssociationName] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): PhoneNumberAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociatedTimestamp" -> AssociatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PhoneNumberAssociation]
    }
  }

  object PhoneNumberAssociationNameEnum {
    val AccountId        = "AccountId"
    val UserId           = "UserId"
    val VoiceConnectorId = "VoiceConnectorId"

    val values = IndexedSeq(AccountId, UserId, VoiceConnectorId)
  }

  /**
    * The phone number capabilities, such as enabled inbound and outbound calling and text messaging.
    */
  @js.native
  trait PhoneNumberCapabilities extends js.Object {
    var InboundCall: js.UndefOr[NullableBoolean]
    var InboundMMS: js.UndefOr[NullableBoolean]
    var InboundSMS: js.UndefOr[NullableBoolean]
    var OutboundCall: js.UndefOr[NullableBoolean]
    var OutboundMMS: js.UndefOr[NullableBoolean]
    var OutboundSMS: js.UndefOr[NullableBoolean]
  }

  object PhoneNumberCapabilities {
    def apply(
        InboundCall: js.UndefOr[NullableBoolean] = js.undefined,
        InboundMMS: js.UndefOr[NullableBoolean] = js.undefined,
        InboundSMS: js.UndefOr[NullableBoolean] = js.undefined,
        OutboundCall: js.UndefOr[NullableBoolean] = js.undefined,
        OutboundMMS: js.UndefOr[NullableBoolean] = js.undefined,
        OutboundSMS: js.UndefOr[NullableBoolean] = js.undefined
    ): PhoneNumberCapabilities = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InboundCall" -> InboundCall.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InboundMMS" -> InboundMMS.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InboundSMS" -> InboundSMS.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutboundCall" -> OutboundCall.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutboundMMS" -> OutboundMMS.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutboundSMS" -> OutboundSMS.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PhoneNumberCapabilities]
    }
  }

  /**
    * If the phone number action fails for one or more of the phone numbers in the request, a list of the phone numbers is returned, along with error codes and error messages.
    */
  @js.native
  trait PhoneNumberError extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[String]
    var PhoneNumberId: js.UndefOr[NonEmptyString]
  }

  object PhoneNumberError {
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        PhoneNumberId: js.UndefOr[NonEmptyString] = js.undefined
    ): PhoneNumberError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorMessage" -> ErrorMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PhoneNumberId" -> PhoneNumberId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PhoneNumberError]
    }
  }

  /**
    * The details of a phone number order created for Amazon Chime.
    */
  @js.native
  trait PhoneNumberOrder extends js.Object {
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var OrderedPhoneNumbers: js.UndefOr[OrderedPhoneNumberList]
    var PhoneNumberOrderId: js.UndefOr[GuidString]
    var ProductType: js.UndefOr[PhoneNumberProductType]
    var Status: js.UndefOr[PhoneNumberOrderStatus]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  object PhoneNumberOrder {
    def apply(
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        OrderedPhoneNumbers: js.UndefOr[OrderedPhoneNumberList] = js.undefined,
        PhoneNumberOrderId: js.UndefOr[GuidString] = js.undefined,
        ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined,
        Status: js.UndefOr[PhoneNumberOrderStatus] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): PhoneNumberOrder = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedTimestamp" -> CreatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OrderedPhoneNumbers" -> OrderedPhoneNumbers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PhoneNumberOrderId" -> PhoneNumberOrderId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProductType" -> ProductType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpdatedTimestamp" -> UpdatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PhoneNumberOrder]
    }
  }

  object PhoneNumberOrderStatusEnum {
    val Processing = "Processing"
    val Successful = "Successful"
    val Failed     = "Failed"
    val Partial    = "Partial"

    val values = IndexedSeq(Processing, Successful, Failed, Partial)
  }

  object PhoneNumberProductTypeEnum {
    val BusinessCalling = "BusinessCalling"
    val VoiceConnector  = "VoiceConnector"

    val values = IndexedSeq(BusinessCalling, VoiceConnector)
  }

  object PhoneNumberStatusEnum {
    val AcquireInProgress = "AcquireInProgress"
    val AcquireFailed     = "AcquireFailed"
    val Unassigned        = "Unassigned"
    val Assigned          = "Assigned"
    val ReleaseInProgress = "ReleaseInProgress"
    val DeleteInProgress  = "DeleteInProgress"
    val ReleaseFailed     = "ReleaseFailed"
    val DeleteFailed      = "DeleteFailed"

    val values = IndexedSeq(
      AcquireInProgress,
      AcquireFailed,
      Unassigned,
      Assigned,
      ReleaseInProgress,
      DeleteInProgress,
      ReleaseFailed,
      DeleteFailed
    )
  }

  @js.native
  trait PutVoiceConnectorOriginationRequest extends js.Object {
    var Origination: Origination
    var VoiceConnectorId: NonEmptyString
  }

  object PutVoiceConnectorOriginationRequest {
    def apply(
        Origination: Origination,
        VoiceConnectorId: NonEmptyString
    ): PutVoiceConnectorOriginationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Origination"      -> Origination.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutVoiceConnectorOriginationRequest]
    }
  }

  @js.native
  trait PutVoiceConnectorOriginationResponse extends js.Object {
    var Origination: js.UndefOr[Origination]
  }

  object PutVoiceConnectorOriginationResponse {
    def apply(
        Origination: js.UndefOr[Origination] = js.undefined
    ): PutVoiceConnectorOriginationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Origination" -> Origination.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutVoiceConnectorOriginationResponse]
    }
  }

  @js.native
  trait PutVoiceConnectorTerminationCredentialsRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
    var Credentials: js.UndefOr[CredentialList]
  }

  object PutVoiceConnectorTerminationCredentialsRequest {
    def apply(
        VoiceConnectorId: NonEmptyString,
        Credentials: js.UndefOr[CredentialList] = js.undefined
    ): PutVoiceConnectorTerminationCredentialsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any],
        "Credentials" -> Credentials.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[PutVoiceConnectorTerminationCredentialsRequest]
    }
  }

  @js.native
  trait PutVoiceConnectorTerminationRequest extends js.Object {
    var Termination: Termination
    var VoiceConnectorId: NonEmptyString
  }

  object PutVoiceConnectorTerminationRequest {
    def apply(
        Termination: Termination,
        VoiceConnectorId: NonEmptyString
    ): PutVoiceConnectorTerminationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Termination"      -> Termination.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutVoiceConnectorTerminationRequest]
    }
  }

  @js.native
  trait PutVoiceConnectorTerminationResponse extends js.Object {
    var Termination: js.UndefOr[Termination]
  }

  object PutVoiceConnectorTerminationResponse {
    def apply(
        Termination: js.UndefOr[Termination] = js.undefined
    ): PutVoiceConnectorTerminationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Termination" -> Termination.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutVoiceConnectorTerminationResponse]
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
    def apply(
        AccountId: NonEmptyString,
        UserId: NonEmptyString
    ): ResetPersonalPINRequest = {
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
    def apply(
        User: js.UndefOr[User] = js.undefined
    ): ResetPersonalPINResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "User" -> User.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetPersonalPINResponse]
    }
  }

  @js.native
  trait RestorePhoneNumberRequest extends js.Object {
    var PhoneNumberId: NonEmptyString
  }

  object RestorePhoneNumberRequest {
    def apply(
        PhoneNumberId: NonEmptyString
    ): RestorePhoneNumberRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestorePhoneNumberRequest]
    }
  }

  @js.native
  trait RestorePhoneNumberResponse extends js.Object {
    var PhoneNumber: js.UndefOr[PhoneNumber]
  }

  object RestorePhoneNumberResponse {
    def apply(
        PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    ): RestorePhoneNumberResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PhoneNumber" -> PhoneNumber.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestorePhoneNumberResponse]
    }
  }

  @js.native
  trait SearchAvailablePhoneNumbersRequest extends js.Object {
    var AreaCode: js.UndefOr[String]
    var City: js.UndefOr[String]
    var Country: js.UndefOr[String]
    var MaxResults: js.UndefOr[PhoneNumberMaxResults]
    var NextToken: js.UndefOr[String]
    var State: js.UndefOr[String]
  }

  object SearchAvailablePhoneNumbersRequest {
    def apply(
        AreaCode: js.UndefOr[String] = js.undefined,
        City: js.UndefOr[String] = js.undefined,
        Country: js.UndefOr[String] = js.undefined,
        MaxResults: js.UndefOr[PhoneNumberMaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        State: js.UndefOr[String] = js.undefined
    ): SearchAvailablePhoneNumbersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AreaCode" -> AreaCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "City" -> City.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Country" -> Country.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchAvailablePhoneNumbersRequest]
    }
  }

  @js.native
  trait SearchAvailablePhoneNumbersResponse extends js.Object {
    var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList]
  }

  object SearchAvailablePhoneNumbersResponse {
    def apply(
        E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.undefined
    ): SearchAvailablePhoneNumbersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "E164PhoneNumbers" -> E164PhoneNumbers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchAvailablePhoneNumbersResponse]
    }
  }

  /**
    * Settings that allow management of telephony permissions for an Amazon Chime user, such as inbound and outbound calling and text messaging.
    */
  @js.native
  trait TelephonySettings extends js.Object {
    var InboundCalling: Boolean
    var OutboundCalling: Boolean
    var SMS: Boolean
  }

  object TelephonySettings {
    def apply(
        InboundCalling: Boolean,
        OutboundCalling: Boolean,
        SMS: Boolean
    ): TelephonySettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InboundCalling"  -> InboundCalling.asInstanceOf[js.Any],
        "OutboundCalling" -> OutboundCalling.asInstanceOf[js.Any],
        "SMS"             -> SMS.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TelephonySettings]
    }
  }

  /**
    * Termination settings enable your SIP hosts to make outbound calls using your Amazon Chime Voice Connector.
    */
  @js.native
  trait Termination extends js.Object {
    var CallingRegions: js.UndefOr[CallingRegionList]
    var CidrAllowedList: js.UndefOr[StringList]
    var CpsLimit: js.UndefOr[CpsLimit]
    var DefaultPhoneNumber: js.UndefOr[E164PhoneNumber]
    var Disabled: js.UndefOr[Boolean]
  }

  object Termination {
    def apply(
        CallingRegions: js.UndefOr[CallingRegionList] = js.undefined,
        CidrAllowedList: js.UndefOr[StringList] = js.undefined,
        CpsLimit: js.UndefOr[CpsLimit] = js.undefined,
        DefaultPhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined,
        Disabled: js.UndefOr[Boolean] = js.undefined
    ): Termination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CallingRegions" -> CallingRegions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CidrAllowedList" -> CidrAllowedList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CpsLimit" -> CpsLimit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultPhoneNumber" -> DefaultPhoneNumber.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Disabled" -> Disabled.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Termination]
    }
  }

  /**
    * The termination health details, including the source IP address and timestamp of the last successful SIP <code>OPTIONS</code> message from your SIP infrastructure.
    */
  @js.native
  trait TerminationHealth extends js.Object {
    var Source: js.UndefOr[String]
    var Timestamp: js.UndefOr[Iso8601Timestamp]
  }

  object TerminationHealth {
    def apply(
        Source: js.UndefOr[String] = js.undefined,
        Timestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): TerminationHealth = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Source" -> Source.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timestamp" -> Timestamp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminationHealth]
    }
  }

  @js.native
  trait UpdateAccountRequest extends js.Object {
    var AccountId: NonEmptyString
    var Name: js.UndefOr[AccountName]
  }

  object UpdateAccountRequest {
    def apply(
        AccountId: NonEmptyString,
        Name: js.UndefOr[AccountName] = js.undefined
    ): UpdateAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAccountRequest]
    }
  }

  @js.native
  trait UpdateAccountResponse extends js.Object {
    var Account: js.UndefOr[Account]
  }

  object UpdateAccountResponse {
    def apply(
        Account: js.UndefOr[Account] = js.undefined
    ): UpdateAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Account" -> Account.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAccountResponse]
    }
  }

  @js.native
  trait UpdateAccountSettingsRequest extends js.Object {
    var AccountId: NonEmptyString
    var AccountSettings: AccountSettings
  }

  object UpdateAccountSettingsRequest {
    def apply(
        AccountId: NonEmptyString,
        AccountSettings: AccountSettings
    ): UpdateAccountSettingsRequest = {
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
    def apply(
        ): UpdateAccountSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAccountSettingsResponse]
    }
  }

  @js.native
  trait UpdateGlobalSettingsRequest extends js.Object {
    var BusinessCalling: BusinessCallingSettings
    var VoiceConnector: VoiceConnectorSettings
  }

  object UpdateGlobalSettingsRequest {
    def apply(
        BusinessCalling: BusinessCallingSettings,
        VoiceConnector: VoiceConnectorSettings
    ): UpdateGlobalSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BusinessCalling" -> BusinessCalling.asInstanceOf[js.Any],
        "VoiceConnector"  -> VoiceConnector.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGlobalSettingsRequest]
    }
  }

  @js.native
  trait UpdatePhoneNumberRequest extends js.Object {
    var PhoneNumberId: String
    var ProductType: js.UndefOr[PhoneNumberProductType]
  }

  object UpdatePhoneNumberRequest {
    def apply(
        PhoneNumberId: String,
        ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined
    ): UpdatePhoneNumberRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any],
        "ProductType" -> ProductType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePhoneNumberRequest]
    }
  }

  /**
    * The phone number ID and product type fields to update, used with the <a>BatchUpdatePhoneNumber</a> and <a>UpdatePhoneNumber</a> actions.
    */
  @js.native
  trait UpdatePhoneNumberRequestItem extends js.Object {
    var PhoneNumberId: NonEmptyString
    var ProductType: js.UndefOr[PhoneNumberProductType]
  }

  object UpdatePhoneNumberRequestItem {
    def apply(
        PhoneNumberId: NonEmptyString,
        ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined
    ): UpdatePhoneNumberRequestItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any],
        "ProductType" -> ProductType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePhoneNumberRequestItem]
    }
  }

  @js.native
  trait UpdatePhoneNumberResponse extends js.Object {
    var PhoneNumber: js.UndefOr[PhoneNumber]
  }

  object UpdatePhoneNumberResponse {
    def apply(
        PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    ): UpdatePhoneNumberResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PhoneNumber" -> PhoneNumber.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePhoneNumberResponse]
    }
  }

  @js.native
  trait UpdateUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserId: NonEmptyString
    var LicenseType: js.UndefOr[License]
  }

  object UpdateUserRequest {
    def apply(
        AccountId: NonEmptyString,
        UserId: NonEmptyString,
        LicenseType: js.UndefOr[License] = js.undefined
    ): UpdateUserRequest = {
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
    def apply(
        UserId: NonEmptyString,
        LicenseType: js.UndefOr[License] = js.undefined
    ): UpdateUserRequestItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserId" -> UserId.asInstanceOf[js.Any],
        "LicenseType" -> LicenseType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserRequestItem]
    }
  }

  @js.native
  trait UpdateUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object UpdateUserResponse {
    def apply(
        User: js.UndefOr[User] = js.undefined
    ): UpdateUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "User" -> User.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserResponse]
    }
  }

  @js.native
  trait UpdateUserSettingsRequest extends js.Object {
    var AccountId: String
    var UserId: String
    var UserSettings: UserSettings
  }

  object UpdateUserSettingsRequest {
    def apply(
        AccountId: String,
        UserId: String,
        UserSettings: UserSettings
    ): UpdateUserSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId"    -> AccountId.asInstanceOf[js.Any],
        "UserId"       -> UserId.asInstanceOf[js.Any],
        "UserSettings" -> UserSettings.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserSettingsRequest]
    }
  }

  @js.native
  trait UpdateVoiceConnectorRequest extends js.Object {
    var Name: VoiceConnectorName
    var RequireEncryption: Boolean
    var VoiceConnectorId: NonEmptyString
  }

  object UpdateVoiceConnectorRequest {
    def apply(
        Name: VoiceConnectorName,
        RequireEncryption: Boolean,
        VoiceConnectorId: NonEmptyString
    ): UpdateVoiceConnectorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"              -> Name.asInstanceOf[js.Any],
        "RequireEncryption" -> RequireEncryption.asInstanceOf[js.Any],
        "VoiceConnectorId"  -> VoiceConnectorId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateVoiceConnectorRequest]
    }
  }

  @js.native
  trait UpdateVoiceConnectorResponse extends js.Object {
    var VoiceConnector: js.UndefOr[VoiceConnector]
  }

  object UpdateVoiceConnectorResponse {
    def apply(
        VoiceConnector: js.UndefOr[VoiceConnector] = js.undefined
    ): UpdateVoiceConnectorResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VoiceConnector" -> VoiceConnector.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateVoiceConnectorResponse]
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
    var PrimaryProvisionedNumber: js.UndefOr[SensitiveString]
    var RegisteredOn: js.UndefOr[Iso8601Timestamp]
    var UserInvitationStatus: js.UndefOr[InviteStatus]
    var UserRegistrationStatus: js.UndefOr[RegistrationStatus]
  }

  object User {
    def apply(
        UserId: String,
        AccountId: js.UndefOr[String] = js.undefined,
        DisplayName: js.UndefOr[SensitiveString] = js.undefined,
        InvitedOn: js.UndefOr[Iso8601Timestamp] = js.undefined,
        LicenseType: js.UndefOr[License] = js.undefined,
        PersonalPIN: js.UndefOr[String] = js.undefined,
        PrimaryEmail: js.UndefOr[EmailAddress] = js.undefined,
        PrimaryProvisionedNumber: js.UndefOr[SensitiveString] = js.undefined,
        RegisteredOn: js.UndefOr[Iso8601Timestamp] = js.undefined,
        UserInvitationStatus: js.UndefOr[InviteStatus] = js.undefined,
        UserRegistrationStatus: js.UndefOr[RegistrationStatus] = js.undefined
    ): User = {
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
        "PrimaryProvisionedNumber" -> PrimaryProvisionedNumber.map { x =>
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
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        UserId: js.UndefOr[NonEmptyString] = js.undefined
    ): UserError = {
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

  /**
    * Settings associated with an Amazon Chime user, including inbound and outbound calling and text messaging.
    */
  @js.native
  trait UserSettings extends js.Object {
    var Telephony: TelephonySettings
  }

  object UserSettings {
    def apply(
        Telephony: TelephonySettings
    ): UserSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Telephony" -> Telephony.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserSettings]
    }
  }

  /**
    * The Amazon Chime Voice Connector configuration, including outbound host name and encryption settings.
    */
  @js.native
  trait VoiceConnector extends js.Object {
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var Name: js.UndefOr[VoiceConnectorName]
    var OutboundHostName: js.UndefOr[String]
    var RequireEncryption: js.UndefOr[Boolean]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var VoiceConnectorId: js.UndefOr[NonEmptyString]
  }

  object VoiceConnector {
    def apply(
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        Name: js.UndefOr[VoiceConnectorName] = js.undefined,
        OutboundHostName: js.UndefOr[String] = js.undefined,
        RequireEncryption: js.UndefOr[Boolean] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        VoiceConnectorId: js.UndefOr[NonEmptyString] = js.undefined
    ): VoiceConnector = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedTimestamp" -> CreatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutboundHostName" -> OutboundHostName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequireEncryption" -> RequireEncryption.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpdatedTimestamp" -> UpdatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VoiceConnectorId" -> VoiceConnectorId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VoiceConnector]
    }
  }

  /**
    * The Amazon Chime Voice Connector settings. Includes any Amazon S3 buckets designated for storing call detail records.
    */
  @js.native
  trait VoiceConnectorSettings extends js.Object {
    var CdrBucket: js.UndefOr[String]
  }

  object VoiceConnectorSettings {
    def apply(
        CdrBucket: js.UndefOr[String] = js.undefined
    ): VoiceConnectorSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CdrBucket" -> CdrBucket.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VoiceConnectorSettings]
    }
  }
}
