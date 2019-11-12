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
  type BotList                          = js.Array[Bot]
  type BotType                          = String
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
  type PhoneNumberType                  = String
  type Port                             = Int
  type ProfileServiceMaxResults         = Int
  type RegistrationStatus               = String
  type ResultMax                        = Int
  type SensitiveString                  = String
  type SensitiveStringList              = js.Array[SensitiveString]
  type StringList                       = js.Array[String]
  type TollFreePrefix                   = String
  type UpdatePhoneNumberRequestItemList = js.Array[UpdatePhoneNumberRequestItem]
  type UpdateUserRequestItemList        = js.Array[UpdateUserRequestItem]
  type UserEmailList                    = js.Array[EmailAddress]
  type UserErrorList                    = js.Array[UserError]
  type UserIdList                       = js.Array[NonEmptyString]
  type UserList                         = js.Array[User]
  type VoiceConnectorList               = js.Array[VoiceConnector]
  type VoiceConnectorName               = String

  implicit final class ChimeOps(private val service: Chime) extends AnyVal {
    @inline def associatePhoneNumberWithUserFuture(
        params: AssociatePhoneNumberWithUserRequest
    ): Future[AssociatePhoneNumberWithUserResponse] = service.associatePhoneNumberWithUser(params).promise.toFuture
    @inline def associatePhoneNumbersWithVoiceConnectorFuture(
        params: AssociatePhoneNumbersWithVoiceConnectorRequest
    ): Future[AssociatePhoneNumbersWithVoiceConnectorResponse] =
      service.associatePhoneNumbersWithVoiceConnector(params).promise.toFuture
    @inline def batchDeletePhoneNumberFuture(
        params: BatchDeletePhoneNumberRequest
    ): Future[BatchDeletePhoneNumberResponse] = service.batchDeletePhoneNumber(params).promise.toFuture
    @inline def batchSuspendUserFuture(params: BatchSuspendUserRequest): Future[BatchSuspendUserResponse] =
      service.batchSuspendUser(params).promise.toFuture
    @inline def batchUnsuspendUserFuture(params: BatchUnsuspendUserRequest): Future[BatchUnsuspendUserResponse] =
      service.batchUnsuspendUser(params).promise.toFuture
    @inline def batchUpdatePhoneNumberFuture(
        params: BatchUpdatePhoneNumberRequest
    ): Future[BatchUpdatePhoneNumberResponse] = service.batchUpdatePhoneNumber(params).promise.toFuture
    @inline def batchUpdateUserFuture(params: BatchUpdateUserRequest): Future[BatchUpdateUserResponse] =
      service.batchUpdateUser(params).promise.toFuture
    @inline def createAccountFuture(params: CreateAccountRequest): Future[CreateAccountResponse] =
      service.createAccount(params).promise.toFuture
    @inline def createBotFuture(params: CreateBotRequest): Future[CreateBotResponse] =
      service.createBot(params).promise.toFuture
    @inline def createPhoneNumberOrderFuture(
        params: CreatePhoneNumberOrderRequest
    ): Future[CreatePhoneNumberOrderResponse] = service.createPhoneNumberOrder(params).promise.toFuture
    @inline def createVoiceConnectorFuture(params: CreateVoiceConnectorRequest): Future[CreateVoiceConnectorResponse] =
      service.createVoiceConnector(params).promise.toFuture
    @inline def deleteAccountFuture(params: DeleteAccountRequest): Future[DeleteAccountResponse] =
      service.deleteAccount(params).promise.toFuture
    @inline def deleteEventsConfigurationFuture(params: DeleteEventsConfigurationRequest): Future[js.Object] =
      service.deleteEventsConfiguration(params).promise.toFuture
    @inline def deletePhoneNumberFuture(params: DeletePhoneNumberRequest): Future[js.Object] =
      service.deletePhoneNumber(params).promise.toFuture
    @inline def deleteVoiceConnectorFuture(params: DeleteVoiceConnectorRequest): Future[js.Object] =
      service.deleteVoiceConnector(params).promise.toFuture
    @inline def deleteVoiceConnectorOriginationFuture(
        params: DeleteVoiceConnectorOriginationRequest
    ): Future[js.Object] = service.deleteVoiceConnectorOrigination(params).promise.toFuture
    @inline def deleteVoiceConnectorTerminationCredentialsFuture(
        params: DeleteVoiceConnectorTerminationCredentialsRequest
    ): Future[js.Object] = service.deleteVoiceConnectorTerminationCredentials(params).promise.toFuture
    @inline def deleteVoiceConnectorTerminationFuture(
        params: DeleteVoiceConnectorTerminationRequest
    ): Future[js.Object] = service.deleteVoiceConnectorTermination(params).promise.toFuture
    @inline def disassociatePhoneNumberFromUserFuture(
        params: DisassociatePhoneNumberFromUserRequest
    ): Future[DisassociatePhoneNumberFromUserResponse] =
      service.disassociatePhoneNumberFromUser(params).promise.toFuture
    @inline def disassociatePhoneNumbersFromVoiceConnectorFuture(
        params: DisassociatePhoneNumbersFromVoiceConnectorRequest
    ): Future[DisassociatePhoneNumbersFromVoiceConnectorResponse] =
      service.disassociatePhoneNumbersFromVoiceConnector(params).promise.toFuture
    @inline def getAccountFuture(params: GetAccountRequest): Future[GetAccountResponse] =
      service.getAccount(params).promise.toFuture
    @inline def getAccountSettingsFuture(params: GetAccountSettingsRequest): Future[GetAccountSettingsResponse] =
      service.getAccountSettings(params).promise.toFuture
    @inline def getBotFuture(params: GetBotRequest): Future[GetBotResponse] = service.getBot(params).promise.toFuture
    @inline def getEventsConfigurationFuture(
        params: GetEventsConfigurationRequest
    ): Future[GetEventsConfigurationResponse] = service.getEventsConfiguration(params).promise.toFuture
    @inline def getGlobalSettingsFuture(): Future[GetGlobalSettingsResponse] =
      service.getGlobalSettings().promise.toFuture
    @inline def getPhoneNumberFuture(params: GetPhoneNumberRequest): Future[GetPhoneNumberResponse] =
      service.getPhoneNumber(params).promise.toFuture
    @inline def getPhoneNumberOrderFuture(params: GetPhoneNumberOrderRequest): Future[GetPhoneNumberOrderResponse] =
      service.getPhoneNumberOrder(params).promise.toFuture
    @inline def getUserFuture(params: GetUserRequest): Future[GetUserResponse] =
      service.getUser(params).promise.toFuture
    @inline def getUserSettingsFuture(params: GetUserSettingsRequest): Future[GetUserSettingsResponse] =
      service.getUserSettings(params).promise.toFuture
    @inline def getVoiceConnectorFuture(params: GetVoiceConnectorRequest): Future[GetVoiceConnectorResponse] =
      service.getVoiceConnector(params).promise.toFuture
    @inline def getVoiceConnectorOriginationFuture(
        params: GetVoiceConnectorOriginationRequest
    ): Future[GetVoiceConnectorOriginationResponse] = service.getVoiceConnectorOrigination(params).promise.toFuture
    @inline def getVoiceConnectorTerminationFuture(
        params: GetVoiceConnectorTerminationRequest
    ): Future[GetVoiceConnectorTerminationResponse] = service.getVoiceConnectorTermination(params).promise.toFuture
    @inline def getVoiceConnectorTerminationHealthFuture(
        params: GetVoiceConnectorTerminationHealthRequest
    ): Future[GetVoiceConnectorTerminationHealthResponse] =
      service.getVoiceConnectorTerminationHealth(params).promise.toFuture
    @inline def inviteUsersFuture(params: InviteUsersRequest): Future[InviteUsersResponse] =
      service.inviteUsers(params).promise.toFuture
    @inline def listAccountsFuture(params: ListAccountsRequest): Future[ListAccountsResponse] =
      service.listAccounts(params).promise.toFuture
    @inline def listBotsFuture(params: ListBotsRequest): Future[ListBotsResponse] =
      service.listBots(params).promise.toFuture
    @inline def listPhoneNumberOrdersFuture(
        params: ListPhoneNumberOrdersRequest
    ): Future[ListPhoneNumberOrdersResponse] = service.listPhoneNumberOrders(params).promise.toFuture
    @inline def listPhoneNumbersFuture(params: ListPhoneNumbersRequest): Future[ListPhoneNumbersResponse] =
      service.listPhoneNumbers(params).promise.toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] =
      service.listUsers(params).promise.toFuture
    @inline def listVoiceConnectorTerminationCredentialsFuture(
        params: ListVoiceConnectorTerminationCredentialsRequest
    ): Future[ListVoiceConnectorTerminationCredentialsResponse] =
      service.listVoiceConnectorTerminationCredentials(params).promise.toFuture
    @inline def listVoiceConnectorsFuture(params: ListVoiceConnectorsRequest): Future[ListVoiceConnectorsResponse] =
      service.listVoiceConnectors(params).promise.toFuture
    @inline def logoutUserFuture(params: LogoutUserRequest): Future[LogoutUserResponse] =
      service.logoutUser(params).promise.toFuture
    @inline def putEventsConfigurationFuture(
        params: PutEventsConfigurationRequest
    ): Future[PutEventsConfigurationResponse] = service.putEventsConfiguration(params).promise.toFuture
    @inline def putVoiceConnectorOriginationFuture(
        params: PutVoiceConnectorOriginationRequest
    ): Future[PutVoiceConnectorOriginationResponse] = service.putVoiceConnectorOrigination(params).promise.toFuture
    @inline def putVoiceConnectorTerminationCredentialsFuture(
        params: PutVoiceConnectorTerminationCredentialsRequest
    ): Future[js.Object] = service.putVoiceConnectorTerminationCredentials(params).promise.toFuture
    @inline def putVoiceConnectorTerminationFuture(
        params: PutVoiceConnectorTerminationRequest
    ): Future[PutVoiceConnectorTerminationResponse] = service.putVoiceConnectorTermination(params).promise.toFuture
    @inline def regenerateSecurityTokenFuture(
        params: RegenerateSecurityTokenRequest
    ): Future[RegenerateSecurityTokenResponse] = service.regenerateSecurityToken(params).promise.toFuture
    @inline def resetPersonalPINFuture(params: ResetPersonalPINRequest): Future[ResetPersonalPINResponse] =
      service.resetPersonalPIN(params).promise.toFuture
    @inline def restorePhoneNumberFuture(params: RestorePhoneNumberRequest): Future[RestorePhoneNumberResponse] =
      service.restorePhoneNumber(params).promise.toFuture
    @inline def searchAvailablePhoneNumbersFuture(
        params: SearchAvailablePhoneNumbersRequest
    ): Future[SearchAvailablePhoneNumbersResponse] = service.searchAvailablePhoneNumbers(params).promise.toFuture
    @inline def updateAccountFuture(params: UpdateAccountRequest): Future[UpdateAccountResponse] =
      service.updateAccount(params).promise.toFuture
    @inline def updateAccountSettingsFuture(
        params: UpdateAccountSettingsRequest
    ): Future[UpdateAccountSettingsResponse] = service.updateAccountSettings(params).promise.toFuture
    @inline def updateBotFuture(params: UpdateBotRequest): Future[UpdateBotResponse] =
      service.updateBot(params).promise.toFuture
    @inline def updateGlobalSettingsFuture(params: UpdateGlobalSettingsRequest): Future[js.Object] =
      service.updateGlobalSettings(params).promise.toFuture
    @inline def updatePhoneNumberFuture(params: UpdatePhoneNumberRequest): Future[UpdatePhoneNumberResponse] =
      service.updatePhoneNumber(params).promise.toFuture
    @inline def updateUserFuture(params: UpdateUserRequest): Future[UpdateUserResponse] =
      service.updateUser(params).promise.toFuture
    @inline def updateUserSettingsFuture(params: UpdateUserSettingsRequest): Future[js.Object] =
      service.updateUserSettings(params).promise.toFuture
    @inline def updateVoiceConnectorFuture(params: UpdateVoiceConnectorRequest): Future[UpdateVoiceConnectorResponse] =
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
    def createBot(params: CreateBotRequest): Request[CreateBotResponse]                   = js.native
    def createPhoneNumberOrder(params: CreatePhoneNumberOrderRequest): Request[CreatePhoneNumberOrderResponse] =
      js.native
    def createVoiceConnector(params: CreateVoiceConnectorRequest): Request[CreateVoiceConnectorResponse]    = js.native
    def deleteAccount(params: DeleteAccountRequest): Request[DeleteAccountResponse]                         = js.native
    def deleteEventsConfiguration(params: DeleteEventsConfigurationRequest): Request[js.Object]             = js.native
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
    ): Request[DisassociatePhoneNumbersFromVoiceConnectorResponse]                                 = js.native
    def getAccount(params: GetAccountRequest): Request[GetAccountResponse]                         = js.native
    def getAccountSettings(params: GetAccountSettingsRequest): Request[GetAccountSettingsResponse] = js.native
    def getBot(params: GetBotRequest): Request[GetBotResponse]                                     = js.native
    def getEventsConfiguration(params: GetEventsConfigurationRequest): Request[GetEventsConfigurationResponse] =
      js.native
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
    def listBots(params: ListBotsRequest): Request[ListBotsResponse]                                        = js.native
    def listPhoneNumberOrders(params: ListPhoneNumberOrdersRequest): Request[ListPhoneNumberOrdersResponse] = js.native
    def listPhoneNumbers(params: ListPhoneNumbersRequest): Request[ListPhoneNumbersResponse]                = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse]                                     = js.native
    def listVoiceConnectorTerminationCredentials(
        params: ListVoiceConnectorTerminationCredentialsRequest
    ): Request[ListVoiceConnectorTerminationCredentialsResponse]                                      = js.native
    def listVoiceConnectors(params: ListVoiceConnectorsRequest): Request[ListVoiceConnectorsResponse] = js.native
    def logoutUser(params: LogoutUserRequest): Request[LogoutUserResponse]                            = js.native
    def putEventsConfiguration(params: PutEventsConfigurationRequest): Request[PutEventsConfigurationResponse] =
      js.native
    def putVoiceConnectorOrigination(
        params: PutVoiceConnectorOriginationRequest
    ): Request[PutVoiceConnectorOriginationResponse] = js.native
    def putVoiceConnectorTermination(
        params: PutVoiceConnectorTerminationRequest
    ): Request[PutVoiceConnectorTerminationResponse] = js.native
    def putVoiceConnectorTerminationCredentials(
        params: PutVoiceConnectorTerminationCredentialsRequest
    ): Request[js.Object] = js.native
    def regenerateSecurityToken(params: RegenerateSecurityTokenRequest): Request[RegenerateSecurityTokenResponse] =
      js.native
    def resetPersonalPIN(params: ResetPersonalPINRequest): Request[ResetPersonalPINResponse]       = js.native
    def restorePhoneNumber(params: RestorePhoneNumberRequest): Request[RestorePhoneNumberResponse] = js.native
    def searchAvailablePhoneNumbers(
        params: SearchAvailablePhoneNumbersRequest
    ): Request[SearchAvailablePhoneNumbersResponse]                                                         = js.native
    def updateAccount(params: UpdateAccountRequest): Request[UpdateAccountResponse]                         = js.native
    def updateAccountSettings(params: UpdateAccountSettingsRequest): Request[UpdateAccountSettingsResponse] = js.native
    def updateBot(params: UpdateBotRequest): Request[UpdateBotResponse]                                     = js.native
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
    @inline
    def apply(
        AccountId: String,
        AwsAccountId: String,
        Name: String,
        AccountType: js.UndefOr[AccountType] = js.undefined,
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        DefaultLicense: js.UndefOr[License] = js.undefined,
        SupportedLicenses: js.UndefOr[LicenseList] = js.undefined
    ): Account = {
      val __obj = js.Dynamic.literal(
        "AccountId"    -> AccountId.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Name"         -> Name.asInstanceOf[js.Any]
      )

      AccountType.foreach(__v => __obj.updateDynamic("AccountType")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      DefaultLicense.foreach(__v => __obj.updateDynamic("DefaultLicense")(__v.asInstanceOf[js.Any]))
      SupportedLicenses.foreach(__v => __obj.updateDynamic("SupportedLicenses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Account]
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
    @inline
    def apply(
        DisableRemoteControl: js.UndefOr[Boolean] = js.undefined,
        EnableDialOut: js.UndefOr[Boolean] = js.undefined
    ): AccountSettings = {
      val __obj = js.Dynamic.literal()
      DisableRemoteControl.foreach(__v => __obj.updateDynamic("DisableRemoteControl")(__v.asInstanceOf[js.Any]))
      EnableDialOut.foreach(__v => __obj.updateDynamic("EnableDialOut")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountSettings]
    }
  }

  object AccountTypeEnum {
    val Team                = "Team"
    val EnterpriseDirectory = "EnterpriseDirectory"
    val EnterpriseLWA       = "EnterpriseLWA"
    val EnterpriseOIDC      = "EnterpriseOIDC"

    val values = js.Object.freeze(js.Array(Team, EnterpriseDirectory, EnterpriseLWA, EnterpriseOIDC))
  }

  @js.native
  trait AssociatePhoneNumberWithUserRequest extends js.Object {
    var AccountId: String
    var E164PhoneNumber: E164PhoneNumber
    var UserId: String
  }

  object AssociatePhoneNumberWithUserRequest {
    @inline
    def apply(
        AccountId: String,
        E164PhoneNumber: E164PhoneNumber,
        UserId: String
    ): AssociatePhoneNumberWithUserRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId"       -> AccountId.asInstanceOf[js.Any],
        "E164PhoneNumber" -> E164PhoneNumber.asInstanceOf[js.Any],
        "UserId"          -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociatePhoneNumberWithUserRequest]
    }
  }

  @js.native
  trait AssociatePhoneNumberWithUserResponse extends js.Object {}

  object AssociatePhoneNumberWithUserResponse {
    @inline
    def apply(
        ): AssociatePhoneNumberWithUserResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AssociatePhoneNumberWithUserResponse]
    }
  }

  @js.native
  trait AssociatePhoneNumbersWithVoiceConnectorRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
    var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList]
  }

  object AssociatePhoneNumbersWithVoiceConnectorRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString,
        E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.undefined
    ): AssociatePhoneNumbersWithVoiceConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      E164PhoneNumbers.foreach(__v => __obj.updateDynamic("E164PhoneNumbers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociatePhoneNumbersWithVoiceConnectorRequest]
    }
  }

  @js.native
  trait AssociatePhoneNumbersWithVoiceConnectorResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  object AssociatePhoneNumbersWithVoiceConnectorResponse {
    @inline
    def apply(
        PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
    ): AssociatePhoneNumbersWithVoiceConnectorResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberErrors.foreach(__v => __obj.updateDynamic("PhoneNumberErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociatePhoneNumbersWithVoiceConnectorResponse]
    }
  }

  @js.native
  trait BatchDeletePhoneNumberRequest extends js.Object {
    var PhoneNumberIds: NonEmptyStringList
  }

  object BatchDeletePhoneNumberRequest {
    @inline
    def apply(
        PhoneNumberIds: NonEmptyStringList
    ): BatchDeletePhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberIds" -> PhoneNumberIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchDeletePhoneNumberRequest]
    }
  }

  @js.native
  trait BatchDeletePhoneNumberResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  object BatchDeletePhoneNumberResponse {
    @inline
    def apply(
        PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
    ): BatchDeletePhoneNumberResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberErrors.foreach(__v => __obj.updateDynamic("PhoneNumberErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeletePhoneNumberResponse]
    }
  }

  @js.native
  trait BatchSuspendUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserIdList: UserIdList
  }

  object BatchSuspendUserRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        UserIdList: UserIdList
    ): BatchSuspendUserRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId"  -> AccountId.asInstanceOf[js.Any],
        "UserIdList" -> UserIdList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchSuspendUserRequest]
    }
  }

  @js.native
  trait BatchSuspendUserResponse extends js.Object {
    var UserErrors: js.UndefOr[UserErrorList]
  }

  object BatchSuspendUserResponse {
    @inline
    def apply(
        UserErrors: js.UndefOr[UserErrorList] = js.undefined
    ): BatchSuspendUserResponse = {
      val __obj = js.Dynamic.literal()
      UserErrors.foreach(__v => __obj.updateDynamic("UserErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchSuspendUserResponse]
    }
  }

  @js.native
  trait BatchUnsuspendUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserIdList: UserIdList
  }

  object BatchUnsuspendUserRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        UserIdList: UserIdList
    ): BatchUnsuspendUserRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId"  -> AccountId.asInstanceOf[js.Any],
        "UserIdList" -> UserIdList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchUnsuspendUserRequest]
    }
  }

  @js.native
  trait BatchUnsuspendUserResponse extends js.Object {
    var UserErrors: js.UndefOr[UserErrorList]
  }

  object BatchUnsuspendUserResponse {
    @inline
    def apply(
        UserErrors: js.UndefOr[UserErrorList] = js.undefined
    ): BatchUnsuspendUserResponse = {
      val __obj = js.Dynamic.literal()
      UserErrors.foreach(__v => __obj.updateDynamic("UserErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUnsuspendUserResponse]
    }
  }

  @js.native
  trait BatchUpdatePhoneNumberRequest extends js.Object {
    var UpdatePhoneNumberRequestItems: UpdatePhoneNumberRequestItemList
  }

  object BatchUpdatePhoneNumberRequest {
    @inline
    def apply(
        UpdatePhoneNumberRequestItems: UpdatePhoneNumberRequestItemList
    ): BatchUpdatePhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "UpdatePhoneNumberRequestItems" -> UpdatePhoneNumberRequestItems.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchUpdatePhoneNumberRequest]
    }
  }

  @js.native
  trait BatchUpdatePhoneNumberResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  object BatchUpdatePhoneNumberResponse {
    @inline
    def apply(
        PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
    ): BatchUpdatePhoneNumberResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberErrors.foreach(__v => __obj.updateDynamic("PhoneNumberErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUpdatePhoneNumberResponse]
    }
  }

  @js.native
  trait BatchUpdateUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UpdateUserRequestItems: UpdateUserRequestItemList
  }

  object BatchUpdateUserRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        UpdateUserRequestItems: UpdateUserRequestItemList
    ): BatchUpdateUserRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId"              -> AccountId.asInstanceOf[js.Any],
        "UpdateUserRequestItems" -> UpdateUserRequestItems.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchUpdateUserRequest]
    }
  }

  @js.native
  trait BatchUpdateUserResponse extends js.Object {
    var UserErrors: js.UndefOr[UserErrorList]
  }

  object BatchUpdateUserResponse {
    @inline
    def apply(
        UserErrors: js.UndefOr[UserErrorList] = js.undefined
    ): BatchUpdateUserResponse = {
      val __obj = js.Dynamic.literal()
      UserErrors.foreach(__v => __obj.updateDynamic("UserErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUpdateUserResponse]
    }
  }

  /**
    * A resource that allows Enterprise account administrators to configure an interface to receive events from Amazon Chime.
    */
  @js.native
  trait Bot extends js.Object {
    var BotEmail: js.UndefOr[SensitiveString]
    var BotId: js.UndefOr[String]
    var BotType: js.UndefOr[BotType]
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var Disabled: js.UndefOr[NullableBoolean]
    var DisplayName: js.UndefOr[SensitiveString]
    var SecurityToken: js.UndefOr[SensitiveString]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var UserId: js.UndefOr[String]
  }

  object Bot {
    @inline
    def apply(
        BotEmail: js.UndefOr[SensitiveString] = js.undefined,
        BotId: js.UndefOr[String] = js.undefined,
        BotType: js.UndefOr[BotType] = js.undefined,
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        Disabled: js.UndefOr[NullableBoolean] = js.undefined,
        DisplayName: js.UndefOr[SensitiveString] = js.undefined,
        SecurityToken: js.UndefOr[SensitiveString] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        UserId: js.UndefOr[String] = js.undefined
    ): Bot = {
      val __obj = js.Dynamic.literal()
      BotEmail.foreach(__v => __obj.updateDynamic("BotEmail")(__v.asInstanceOf[js.Any]))
      BotId.foreach(__v => __obj.updateDynamic("BotId")(__v.asInstanceOf[js.Any]))
      BotType.foreach(__v => __obj.updateDynamic("BotType")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      SecurityToken.foreach(__v => __obj.updateDynamic("SecurityToken")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Bot]
    }
  }

  object BotTypeEnum {
    val ChatBot = "ChatBot"

    val values = js.Object.freeze(js.Array(ChatBot))
  }

  /**
    * The Amazon Chime Business Calling settings for the administrator's AWS account. Includes any Amazon S3 buckets designated for storing call detail records.
    */
  @js.native
  trait BusinessCallingSettings extends js.Object {
    var CdrBucket: js.UndefOr[String]
  }

  object BusinessCallingSettings {
    @inline
    def apply(
        CdrBucket: js.UndefOr[String] = js.undefined
    ): BusinessCallingSettings = {
      val __obj = js.Dynamic.literal()
      CdrBucket.foreach(__v => __obj.updateDynamic("CdrBucket")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BusinessCallingSettings]
    }
  }

  @js.native
  trait CreateAccountRequest extends js.Object {
    var Name: AccountName
  }

  object CreateAccountRequest {
    @inline
    def apply(
        Name: AccountName
    ): CreateAccountRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateAccountRequest]
    }
  }

  @js.native
  trait CreateAccountResponse extends js.Object {
    var Account: js.UndefOr[Account]
  }

  object CreateAccountResponse {
    @inline
    def apply(
        Account: js.UndefOr[Account] = js.undefined
    ): CreateAccountResponse = {
      val __obj = js.Dynamic.literal()
      Account.foreach(__v => __obj.updateDynamic("Account")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAccountResponse]
    }
  }

  @js.native
  trait CreateBotRequest extends js.Object {
    var AccountId: NonEmptyString
    var DisplayName: SensitiveString
    var Domain: js.UndefOr[NonEmptyString]
  }

  object CreateBotRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        DisplayName: SensitiveString,
        Domain: js.UndefOr[NonEmptyString] = js.undefined
    ): CreateBotRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId"   -> AccountId.asInstanceOf[js.Any],
        "DisplayName" -> DisplayName.asInstanceOf[js.Any]
      )

      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBotRequest]
    }
  }

  @js.native
  trait CreateBotResponse extends js.Object {
    var Bot: js.UndefOr[Bot]
  }

  object CreateBotResponse {
    @inline
    def apply(
        Bot: js.UndefOr[Bot] = js.undefined
    ): CreateBotResponse = {
      val __obj = js.Dynamic.literal()
      Bot.foreach(__v => __obj.updateDynamic("Bot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBotResponse]
    }
  }

  @js.native
  trait CreatePhoneNumberOrderRequest extends js.Object {
    var E164PhoneNumbers: E164PhoneNumberList
    var ProductType: PhoneNumberProductType
  }

  object CreatePhoneNumberOrderRequest {
    @inline
    def apply(
        E164PhoneNumbers: E164PhoneNumberList,
        ProductType: PhoneNumberProductType
    ): CreatePhoneNumberOrderRequest = {
      val __obj = js.Dynamic.literal(
        "E164PhoneNumbers" -> E164PhoneNumbers.asInstanceOf[js.Any],
        "ProductType"      -> ProductType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreatePhoneNumberOrderRequest]
    }
  }

  @js.native
  trait CreatePhoneNumberOrderResponse extends js.Object {
    var PhoneNumberOrder: js.UndefOr[PhoneNumberOrder]
  }

  object CreatePhoneNumberOrderResponse {
    @inline
    def apply(
        PhoneNumberOrder: js.UndefOr[PhoneNumberOrder] = js.undefined
    ): CreatePhoneNumberOrderResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberOrder.foreach(__v => __obj.updateDynamic("PhoneNumberOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePhoneNumberOrderResponse]
    }
  }

  @js.native
  trait CreateVoiceConnectorRequest extends js.Object {
    var Name: VoiceConnectorName
    var RequireEncryption: Boolean
  }

  object CreateVoiceConnectorRequest {
    @inline
    def apply(
        Name: VoiceConnectorName,
        RequireEncryption: Boolean
    ): CreateVoiceConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "Name"              -> Name.asInstanceOf[js.Any],
        "RequireEncryption" -> RequireEncryption.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateVoiceConnectorRequest]
    }
  }

  @js.native
  trait CreateVoiceConnectorResponse extends js.Object {
    var VoiceConnector: js.UndefOr[VoiceConnector]
  }

  object CreateVoiceConnectorResponse {
    @inline
    def apply(
        VoiceConnector: js.UndefOr[VoiceConnector] = js.undefined
    ): CreateVoiceConnectorResponse = {
      val __obj = js.Dynamic.literal()
      VoiceConnector.foreach(__v => __obj.updateDynamic("VoiceConnector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVoiceConnectorResponse]
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
    @inline
    def apply(
        Password: js.UndefOr[SensitiveString] = js.undefined,
        Username: js.UndefOr[SensitiveString] = js.undefined
    ): Credential = {
      val __obj = js.Dynamic.literal()
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Credential]
    }
  }

  @js.native
  trait DeleteAccountRequest extends js.Object {
    var AccountId: NonEmptyString
  }

  object DeleteAccountRequest {
    @inline
    def apply(
        AccountId: NonEmptyString
    ): DeleteAccountRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAccountRequest]
    }
  }

  @js.native
  trait DeleteAccountResponse extends js.Object {}

  object DeleteAccountResponse {
    @inline
    def apply(
        ): DeleteAccountResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteAccountResponse]
    }
  }

  @js.native
  trait DeleteEventsConfigurationRequest extends js.Object {
    var AccountId: NonEmptyString
    var BotId: NonEmptyString
  }

  object DeleteEventsConfigurationRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        BotId: NonEmptyString
    ): DeleteEventsConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BotId"     -> BotId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEventsConfigurationRequest]
    }
  }

  @js.native
  trait DeletePhoneNumberRequest extends js.Object {
    var PhoneNumberId: String
  }

  object DeletePhoneNumberRequest {
    @inline
    def apply(
        PhoneNumberId: String
    ): DeletePhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePhoneNumberRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorOriginationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object DeleteVoiceConnectorOriginationRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): DeleteVoiceConnectorOriginationRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteVoiceConnectorOriginationRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object DeleteVoiceConnectorRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): DeleteVoiceConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteVoiceConnectorRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorTerminationCredentialsRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
    var Usernames: js.UndefOr[SensitiveStringList]
  }

  object DeleteVoiceConnectorTerminationCredentialsRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString,
        Usernames: js.UndefOr[SensitiveStringList] = js.undefined
    ): DeleteVoiceConnectorTerminationCredentialsRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      Usernames.foreach(__v => __obj.updateDynamic("Usernames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteVoiceConnectorTerminationCredentialsRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorTerminationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object DeleteVoiceConnectorTerminationRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): DeleteVoiceConnectorTerminationRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteVoiceConnectorTerminationRequest]
    }
  }

  @js.native
  trait DisassociatePhoneNumberFromUserRequest extends js.Object {
    var AccountId: String
    var UserId: String
  }

  object DisassociatePhoneNumberFromUserRequest {
    @inline
    def apply(
        AccountId: String,
        UserId: String
    ): DisassociatePhoneNumberFromUserRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "UserId"    -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociatePhoneNumberFromUserRequest]
    }
  }

  @js.native
  trait DisassociatePhoneNumberFromUserResponse extends js.Object {}

  object DisassociatePhoneNumberFromUserResponse {
    @inline
    def apply(
        ): DisassociatePhoneNumberFromUserResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociatePhoneNumberFromUserResponse]
    }
  }

  @js.native
  trait DisassociatePhoneNumbersFromVoiceConnectorRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
    var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList]
  }

  object DisassociatePhoneNumbersFromVoiceConnectorRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString,
        E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.undefined
    ): DisassociatePhoneNumbersFromVoiceConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      E164PhoneNumbers.foreach(__v => __obj.updateDynamic("E164PhoneNumbers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociatePhoneNumbersFromVoiceConnectorRequest]
    }
  }

  @js.native
  trait DisassociatePhoneNumbersFromVoiceConnectorResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  object DisassociatePhoneNumbersFromVoiceConnectorResponse {
    @inline
    def apply(
        PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
    ): DisassociatePhoneNumbersFromVoiceConnectorResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberErrors.foreach(__v => __obj.updateDynamic("PhoneNumberErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociatePhoneNumbersFromVoiceConnectorResponse]
    }
  }

  object EmailStatusEnum {
    val NotSent = "NotSent"
    val Sent    = "Sent"
    val Failed  = "Failed"

    val values = js.Object.freeze(js.Array(NotSent, Sent, Failed))
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

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  /**
    * The configuration that allows a bot to receive outgoing events. Can be either an HTTPS endpoint or a Lambda function ARN.
    */
  @js.native
  trait EventsConfiguration extends js.Object {
    var BotId: js.UndefOr[String]
    var LambdaFunctionArn: js.UndefOr[SensitiveString]
    var OutboundEventsHTTPSEndpoint: js.UndefOr[SensitiveString]
  }

  object EventsConfiguration {
    @inline
    def apply(
        BotId: js.UndefOr[String] = js.undefined,
        LambdaFunctionArn: js.UndefOr[SensitiveString] = js.undefined,
        OutboundEventsHTTPSEndpoint: js.UndefOr[SensitiveString] = js.undefined
    ): EventsConfiguration = {
      val __obj = js.Dynamic.literal()
      BotId.foreach(__v => __obj.updateDynamic("BotId")(__v.asInstanceOf[js.Any]))
      LambdaFunctionArn.foreach(__v => __obj.updateDynamic("LambdaFunctionArn")(__v.asInstanceOf[js.Any]))
      OutboundEventsHTTPSEndpoint.foreach(
        __v => __obj.updateDynamic("OutboundEventsHTTPSEndpoint")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[EventsConfiguration]
    }
  }

  @js.native
  trait GetAccountRequest extends js.Object {
    var AccountId: NonEmptyString
  }

  object GetAccountRequest {
    @inline
    def apply(
        AccountId: NonEmptyString
    ): GetAccountRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAccountRequest]
    }
  }

  @js.native
  trait GetAccountResponse extends js.Object {
    var Account: js.UndefOr[Account]
  }

  object GetAccountResponse {
    @inline
    def apply(
        Account: js.UndefOr[Account] = js.undefined
    ): GetAccountResponse = {
      val __obj = js.Dynamic.literal()
      Account.foreach(__v => __obj.updateDynamic("Account")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccountResponse]
    }
  }

  @js.native
  trait GetAccountSettingsRequest extends js.Object {
    var AccountId: NonEmptyString
  }

  object GetAccountSettingsRequest {
    @inline
    def apply(
        AccountId: NonEmptyString
    ): GetAccountSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAccountSettingsRequest]
    }
  }

  @js.native
  trait GetAccountSettingsResponse extends js.Object {
    var AccountSettings: js.UndefOr[AccountSettings]
  }

  object GetAccountSettingsResponse {
    @inline
    def apply(
        AccountSettings: js.UndefOr[AccountSettings] = js.undefined
    ): GetAccountSettingsResponse = {
      val __obj = js.Dynamic.literal()
      AccountSettings.foreach(__v => __obj.updateDynamic("AccountSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccountSettingsResponse]
    }
  }

  @js.native
  trait GetBotRequest extends js.Object {
    var AccountId: NonEmptyString
    var BotId: NonEmptyString
  }

  object GetBotRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        BotId: NonEmptyString
    ): GetBotRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BotId"     -> BotId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBotRequest]
    }
  }

  @js.native
  trait GetBotResponse extends js.Object {
    var Bot: js.UndefOr[Bot]
  }

  object GetBotResponse {
    @inline
    def apply(
        Bot: js.UndefOr[Bot] = js.undefined
    ): GetBotResponse = {
      val __obj = js.Dynamic.literal()
      Bot.foreach(__v => __obj.updateDynamic("Bot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBotResponse]
    }
  }

  @js.native
  trait GetEventsConfigurationRequest extends js.Object {
    var AccountId: NonEmptyString
    var BotId: NonEmptyString
  }

  object GetEventsConfigurationRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        BotId: NonEmptyString
    ): GetEventsConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BotId"     -> BotId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetEventsConfigurationRequest]
    }
  }

  @js.native
  trait GetEventsConfigurationResponse extends js.Object {
    var EventsConfiguration: js.UndefOr[EventsConfiguration]
  }

  object GetEventsConfigurationResponse {
    @inline
    def apply(
        EventsConfiguration: js.UndefOr[EventsConfiguration] = js.undefined
    ): GetEventsConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      EventsConfiguration.foreach(__v => __obj.updateDynamic("EventsConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEventsConfigurationResponse]
    }
  }

  @js.native
  trait GetGlobalSettingsResponse extends js.Object {
    var BusinessCalling: js.UndefOr[BusinessCallingSettings]
    var VoiceConnector: js.UndefOr[VoiceConnectorSettings]
  }

  object GetGlobalSettingsResponse {
    @inline
    def apply(
        BusinessCalling: js.UndefOr[BusinessCallingSettings] = js.undefined,
        VoiceConnector: js.UndefOr[VoiceConnectorSettings] = js.undefined
    ): GetGlobalSettingsResponse = {
      val __obj = js.Dynamic.literal()
      BusinessCalling.foreach(__v => __obj.updateDynamic("BusinessCalling")(__v.asInstanceOf[js.Any]))
      VoiceConnector.foreach(__v => __obj.updateDynamic("VoiceConnector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGlobalSettingsResponse]
    }
  }

  @js.native
  trait GetPhoneNumberOrderRequest extends js.Object {
    var PhoneNumberOrderId: GuidString
  }

  object GetPhoneNumberOrderRequest {
    @inline
    def apply(
        PhoneNumberOrderId: GuidString
    ): GetPhoneNumberOrderRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberOrderId" -> PhoneNumberOrderId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetPhoneNumberOrderRequest]
    }
  }

  @js.native
  trait GetPhoneNumberOrderResponse extends js.Object {
    var PhoneNumberOrder: js.UndefOr[PhoneNumberOrder]
  }

  object GetPhoneNumberOrderResponse {
    @inline
    def apply(
        PhoneNumberOrder: js.UndefOr[PhoneNumberOrder] = js.undefined
    ): GetPhoneNumberOrderResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberOrder.foreach(__v => __obj.updateDynamic("PhoneNumberOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPhoneNumberOrderResponse]
    }
  }

  @js.native
  trait GetPhoneNumberRequest extends js.Object {
    var PhoneNumberId: String
  }

  object GetPhoneNumberRequest {
    @inline
    def apply(
        PhoneNumberId: String
    ): GetPhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetPhoneNumberRequest]
    }
  }

  @js.native
  trait GetPhoneNumberResponse extends js.Object {
    var PhoneNumber: js.UndefOr[PhoneNumber]
  }

  object GetPhoneNumberResponse {
    @inline
    def apply(
        PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    ): GetPhoneNumberResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPhoneNumberResponse]
    }
  }

  @js.native
  trait GetUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserId: NonEmptyString
  }

  object GetUserRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        UserId: NonEmptyString
    ): GetUserRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "UserId"    -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetUserRequest]
    }
  }

  @js.native
  trait GetUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object GetUserResponse {
    @inline
    def apply(
        User: js.UndefOr[User] = js.undefined
    ): GetUserResponse = {
      val __obj = js.Dynamic.literal()
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUserResponse]
    }
  }

  @js.native
  trait GetUserSettingsRequest extends js.Object {
    var AccountId: String
    var UserId: String
  }

  object GetUserSettingsRequest {
    @inline
    def apply(
        AccountId: String,
        UserId: String
    ): GetUserSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "UserId"    -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetUserSettingsRequest]
    }
  }

  @js.native
  trait GetUserSettingsResponse extends js.Object {
    var UserSettings: js.UndefOr[UserSettings]
  }

  object GetUserSettingsResponse {
    @inline
    def apply(
        UserSettings: js.UndefOr[UserSettings] = js.undefined
    ): GetUserSettingsResponse = {
      val __obj = js.Dynamic.literal()
      UserSettings.foreach(__v => __obj.updateDynamic("UserSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUserSettingsResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorOriginationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object GetVoiceConnectorOriginationRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): GetVoiceConnectorOriginationRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetVoiceConnectorOriginationRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorOriginationResponse extends js.Object {
    var Origination: js.UndefOr[Origination]
  }

  object GetVoiceConnectorOriginationResponse {
    @inline
    def apply(
        Origination: js.UndefOr[Origination] = js.undefined
    ): GetVoiceConnectorOriginationResponse = {
      val __obj = js.Dynamic.literal()
      Origination.foreach(__v => __obj.updateDynamic("Origination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVoiceConnectorOriginationResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object GetVoiceConnectorRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): GetVoiceConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetVoiceConnectorRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorResponse extends js.Object {
    var VoiceConnector: js.UndefOr[VoiceConnector]
  }

  object GetVoiceConnectorResponse {
    @inline
    def apply(
        VoiceConnector: js.UndefOr[VoiceConnector] = js.undefined
    ): GetVoiceConnectorResponse = {
      val __obj = js.Dynamic.literal()
      VoiceConnector.foreach(__v => __obj.updateDynamic("VoiceConnector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVoiceConnectorResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorTerminationHealthRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object GetVoiceConnectorTerminationHealthRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): GetVoiceConnectorTerminationHealthRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetVoiceConnectorTerminationHealthRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorTerminationHealthResponse extends js.Object {
    var TerminationHealth: js.UndefOr[TerminationHealth]
  }

  object GetVoiceConnectorTerminationHealthResponse {
    @inline
    def apply(
        TerminationHealth: js.UndefOr[TerminationHealth] = js.undefined
    ): GetVoiceConnectorTerminationHealthResponse = {
      val __obj = js.Dynamic.literal()
      TerminationHealth.foreach(__v => __obj.updateDynamic("TerminationHealth")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVoiceConnectorTerminationHealthResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorTerminationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object GetVoiceConnectorTerminationRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): GetVoiceConnectorTerminationRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetVoiceConnectorTerminationRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorTerminationResponse extends js.Object {
    var Termination: js.UndefOr[Termination]
  }

  object GetVoiceConnectorTerminationResponse {
    @inline
    def apply(
        Termination: js.UndefOr[Termination] = js.undefined
    ): GetVoiceConnectorTerminationResponse = {
      val __obj = js.Dynamic.literal()
      Termination.foreach(__v => __obj.updateDynamic("Termination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVoiceConnectorTerminationResponse]
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
    @inline
    def apply(
        EmailAddress: js.UndefOr[EmailAddress] = js.undefined,
        EmailStatus: js.UndefOr[EmailStatus] = js.undefined,
        InviteId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[InviteStatus] = js.undefined
    ): Invite = {
      val __obj = js.Dynamic.literal()
      EmailAddress.foreach(__v => __obj.updateDynamic("EmailAddress")(__v.asInstanceOf[js.Any]))
      EmailStatus.foreach(__v => __obj.updateDynamic("EmailStatus")(__v.asInstanceOf[js.Any]))
      InviteId.foreach(__v => __obj.updateDynamic("InviteId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Invite]
    }
  }

  object InviteStatusEnum {
    val Pending  = "Pending"
    val Accepted = "Accepted"
    val Failed   = "Failed"

    val values = js.Object.freeze(js.Array(Pending, Accepted, Failed))
  }

  @js.native
  trait InviteUsersRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserEmailList: UserEmailList
  }

  object InviteUsersRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        UserEmailList: UserEmailList
    ): InviteUsersRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId"     -> AccountId.asInstanceOf[js.Any],
        "UserEmailList" -> UserEmailList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InviteUsersRequest]
    }
  }

  @js.native
  trait InviteUsersResponse extends js.Object {
    var Invites: js.UndefOr[InviteList]
  }

  object InviteUsersResponse {
    @inline
    def apply(
        Invites: js.UndefOr[InviteList] = js.undefined
    ): InviteUsersResponse = {
      val __obj = js.Dynamic.literal()
      Invites.foreach(__v => __obj.updateDynamic("Invites")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InviteUsersResponse]
    }
  }

  object LicenseEnum {
    val Basic    = "Basic"
    val Plus     = "Plus"
    val Pro      = "Pro"
    val ProTrial = "ProTrial"

    val values = js.Object.freeze(js.Array(Basic, Plus, Pro, ProTrial))
  }

  @js.native
  trait ListAccountsRequest extends js.Object {
    var MaxResults: js.UndefOr[ProfileServiceMaxResults]
    var Name: js.UndefOr[AccountName]
    var NextToken: js.UndefOr[String]
    var UserEmail: js.UndefOr[EmailAddress]
  }

  object ListAccountsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.undefined,
        Name: js.UndefOr[AccountName] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        UserEmail: js.UndefOr[EmailAddress] = js.undefined
    ): ListAccountsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      UserEmail.foreach(__v => __obj.updateDynamic("UserEmail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountsRequest]
    }
  }

  @js.native
  trait ListAccountsResponse extends js.Object {
    var Accounts: js.UndefOr[AccountList]
    var NextToken: js.UndefOr[String]
  }

  object ListAccountsResponse {
    @inline
    def apply(
        Accounts: js.UndefOr[AccountList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListAccountsResponse = {
      val __obj = js.Dynamic.literal()
      Accounts.foreach(__v => __obj.updateDynamic("Accounts")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountsResponse]
    }
  }

  @js.native
  trait ListBotsRequest extends js.Object {
    var AccountId: NonEmptyString
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  object ListBotsRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListBotsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBotsRequest]
    }
  }

  @js.native
  trait ListBotsResponse extends js.Object {
    var Bots: js.UndefOr[BotList]
    var NextToken: js.UndefOr[String]
  }

  object ListBotsResponse {
    @inline
    def apply(
        Bots: js.UndefOr[BotList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListBotsResponse = {
      val __obj = js.Dynamic.literal()
      Bots.foreach(__v => __obj.updateDynamic("Bots")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBotsResponse]
    }
  }

  @js.native
  trait ListPhoneNumberOrdersRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  object ListPhoneNumberOrdersRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListPhoneNumberOrdersRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPhoneNumberOrdersRequest]
    }
  }

  @js.native
  trait ListPhoneNumberOrdersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var PhoneNumberOrders: js.UndefOr[PhoneNumberOrderList]
  }

  object ListPhoneNumberOrdersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        PhoneNumberOrders: js.UndefOr[PhoneNumberOrderList] = js.undefined
    ): ListPhoneNumberOrdersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PhoneNumberOrders.foreach(__v => __obj.updateDynamic("PhoneNumberOrders")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPhoneNumberOrdersResponse]
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
    @inline
    def apply(
        FilterName: js.UndefOr[PhoneNumberAssociationName] = js.undefined,
        FilterValue: js.UndefOr[String] = js.undefined,
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined,
        Status: js.UndefOr[PhoneNumberStatus] = js.undefined
    ): ListPhoneNumbersRequest = {
      val __obj = js.Dynamic.literal()
      FilterName.foreach(__v => __obj.updateDynamic("FilterName")(__v.asInstanceOf[js.Any]))
      FilterValue.foreach(__v => __obj.updateDynamic("FilterValue")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProductType.foreach(__v => __obj.updateDynamic("ProductType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPhoneNumbersRequest]
    }
  }

  @js.native
  trait ListPhoneNumbersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var PhoneNumbers: js.UndefOr[PhoneNumberList]
  }

  object ListPhoneNumbersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        PhoneNumbers: js.UndefOr[PhoneNumberList] = js.undefined
    ): ListPhoneNumbersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PhoneNumbers.foreach(__v => __obj.updateDynamic("PhoneNumbers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPhoneNumbersResponse]
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
    @inline
    def apply(
        AccountId: NonEmptyString,
        MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        UserEmail: js.UndefOr[EmailAddress] = js.undefined
    ): ListUsersRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      UserEmail.foreach(__v => __obj.updateDynamic("UserEmail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersRequest]
    }
  }

  @js.native
  trait ListUsersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Users: js.UndefOr[UserList]
  }

  object ListUsersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Users: js.UndefOr[UserList] = js.undefined
    ): ListUsersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Users.foreach(__v => __obj.updateDynamic("Users")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersResponse]
    }
  }

  @js.native
  trait ListVoiceConnectorTerminationCredentialsRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object ListVoiceConnectorTerminationCredentialsRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): ListVoiceConnectorTerminationCredentialsRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListVoiceConnectorTerminationCredentialsRequest]
    }
  }

  @js.native
  trait ListVoiceConnectorTerminationCredentialsResponse extends js.Object {
    var Usernames: js.UndefOr[SensitiveStringList]
  }

  object ListVoiceConnectorTerminationCredentialsResponse {
    @inline
    def apply(
        Usernames: js.UndefOr[SensitiveStringList] = js.undefined
    ): ListVoiceConnectorTerminationCredentialsResponse = {
      val __obj = js.Dynamic.literal()
      Usernames.foreach(__v => __obj.updateDynamic("Usernames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVoiceConnectorTerminationCredentialsResponse]
    }
  }

  @js.native
  trait ListVoiceConnectorsRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  object ListVoiceConnectorsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListVoiceConnectorsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVoiceConnectorsRequest]
    }
  }

  @js.native
  trait ListVoiceConnectorsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var VoiceConnectors: js.UndefOr[VoiceConnectorList]
  }

  object ListVoiceConnectorsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        VoiceConnectors: js.UndefOr[VoiceConnectorList] = js.undefined
    ): ListVoiceConnectorsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      VoiceConnectors.foreach(__v => __obj.updateDynamic("VoiceConnectors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVoiceConnectorsResponse]
    }
  }

  @js.native
  trait LogoutUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserId: NonEmptyString
  }

  object LogoutUserRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        UserId: NonEmptyString
    ): LogoutUserRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "UserId"    -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[LogoutUserRequest]
    }
  }

  @js.native
  trait LogoutUserResponse extends js.Object {}

  object LogoutUserResponse {
    @inline
    def apply(
        ): LogoutUserResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[LogoutUserResponse]
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
    @inline
    def apply(
        E164PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined,
        Status: js.UndefOr[OrderedPhoneNumberStatus] = js.undefined
    ): OrderedPhoneNumber = {
      val __obj = js.Dynamic.literal()
      E164PhoneNumber.foreach(__v => __obj.updateDynamic("E164PhoneNumber")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrderedPhoneNumber]
    }
  }

  object OrderedPhoneNumberStatusEnum {
    val Processing = "Processing"
    val Acquired   = "Acquired"
    val Failed     = "Failed"

    val values = js.Object.freeze(js.Array(Processing, Acquired, Failed))
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
    @inline
    def apply(
        Disabled: js.UndefOr[Boolean] = js.undefined,
        Routes: js.UndefOr[OriginationRouteList] = js.undefined
    ): Origination = {
      val __obj = js.Dynamic.literal()
      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      Routes.foreach(__v => __obj.updateDynamic("Routes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Origination]
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
    @inline
    def apply(
        Host: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[Port] = js.undefined,
        Priority: js.UndefOr[OriginationRoutePriority] = js.undefined,
        Protocol: js.UndefOr[OriginationRouteProtocol] = js.undefined,
        Weight: js.UndefOr[OriginationRouteWeight] = js.undefined
    ): OriginationRoute = {
      val __obj = js.Dynamic.literal()
      Host.foreach(__v => __obj.updateDynamic("Host")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      Weight.foreach(__v => __obj.updateDynamic("Weight")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OriginationRoute]
    }
  }

  object OriginationRouteProtocolEnum {
    val TCP = "TCP"
    val UDP = "UDP"

    val values = js.Object.freeze(js.Array(TCP, UDP))
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
    var Type: js.UndefOr[PhoneNumberType]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  object PhoneNumber {
    @inline
    def apply(
        Associations: js.UndefOr[PhoneNumberAssociationList] = js.undefined,
        Capabilities: js.UndefOr[PhoneNumberCapabilities] = js.undefined,
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        DeletionTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        E164PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined,
        PhoneNumberId: js.UndefOr[String] = js.undefined,
        ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined,
        Status: js.UndefOr[PhoneNumberStatus] = js.undefined,
        Type: js.UndefOr[PhoneNumberType] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): PhoneNumber = {
      val __obj = js.Dynamic.literal()
      Associations.foreach(__v => __obj.updateDynamic("Associations")(__v.asInstanceOf[js.Any]))
      Capabilities.foreach(__v => __obj.updateDynamic("Capabilities")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      DeletionTimestamp.foreach(__v => __obj.updateDynamic("DeletionTimestamp")(__v.asInstanceOf[js.Any]))
      E164PhoneNumber.foreach(__v => __obj.updateDynamic("E164PhoneNumber")(__v.asInstanceOf[js.Any]))
      PhoneNumberId.foreach(__v => __obj.updateDynamic("PhoneNumberId")(__v.asInstanceOf[js.Any]))
      ProductType.foreach(__v => __obj.updateDynamic("ProductType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhoneNumber]
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
    @inline
    def apply(
        AssociatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        Name: js.UndefOr[PhoneNumberAssociationName] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): PhoneNumberAssociation = {
      val __obj = js.Dynamic.literal()
      AssociatedTimestamp.foreach(__v => __obj.updateDynamic("AssociatedTimestamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhoneNumberAssociation]
    }
  }

  object PhoneNumberAssociationNameEnum {
    val AccountId        = "AccountId"
    val UserId           = "UserId"
    val VoiceConnectorId = "VoiceConnectorId"

    val values = js.Object.freeze(js.Array(AccountId, UserId, VoiceConnectorId))
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
    @inline
    def apply(
        InboundCall: js.UndefOr[NullableBoolean] = js.undefined,
        InboundMMS: js.UndefOr[NullableBoolean] = js.undefined,
        InboundSMS: js.UndefOr[NullableBoolean] = js.undefined,
        OutboundCall: js.UndefOr[NullableBoolean] = js.undefined,
        OutboundMMS: js.UndefOr[NullableBoolean] = js.undefined,
        OutboundSMS: js.UndefOr[NullableBoolean] = js.undefined
    ): PhoneNumberCapabilities = {
      val __obj = js.Dynamic.literal()
      InboundCall.foreach(__v => __obj.updateDynamic("InboundCall")(__v.asInstanceOf[js.Any]))
      InboundMMS.foreach(__v => __obj.updateDynamic("InboundMMS")(__v.asInstanceOf[js.Any]))
      InboundSMS.foreach(__v => __obj.updateDynamic("InboundSMS")(__v.asInstanceOf[js.Any]))
      OutboundCall.foreach(__v => __obj.updateDynamic("OutboundCall")(__v.asInstanceOf[js.Any]))
      OutboundMMS.foreach(__v => __obj.updateDynamic("OutboundMMS")(__v.asInstanceOf[js.Any]))
      OutboundSMS.foreach(__v => __obj.updateDynamic("OutboundSMS")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhoneNumberCapabilities]
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
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        PhoneNumberId: js.UndefOr[NonEmptyString] = js.undefined
    ): PhoneNumberError = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      PhoneNumberId.foreach(__v => __obj.updateDynamic("PhoneNumberId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhoneNumberError]
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
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        OrderedPhoneNumbers: js.UndefOr[OrderedPhoneNumberList] = js.undefined,
        PhoneNumberOrderId: js.UndefOr[GuidString] = js.undefined,
        ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined,
        Status: js.UndefOr[PhoneNumberOrderStatus] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): PhoneNumberOrder = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      OrderedPhoneNumbers.foreach(__v => __obj.updateDynamic("OrderedPhoneNumbers")(__v.asInstanceOf[js.Any]))
      PhoneNumberOrderId.foreach(__v => __obj.updateDynamic("PhoneNumberOrderId")(__v.asInstanceOf[js.Any]))
      ProductType.foreach(__v => __obj.updateDynamic("ProductType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhoneNumberOrder]
    }
  }

  object PhoneNumberOrderStatusEnum {
    val Processing = "Processing"
    val Successful = "Successful"
    val Failed     = "Failed"
    val Partial    = "Partial"

    val values = js.Object.freeze(js.Array(Processing, Successful, Failed, Partial))
  }

  object PhoneNumberProductTypeEnum {
    val BusinessCalling = "BusinessCalling"
    val VoiceConnector  = "VoiceConnector"

    val values = js.Object.freeze(js.Array(BusinessCalling, VoiceConnector))
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

    val values = js.Object.freeze(
      js.Array(
        AcquireInProgress,
        AcquireFailed,
        Unassigned,
        Assigned,
        ReleaseInProgress,
        DeleteInProgress,
        ReleaseFailed,
        DeleteFailed
      )
    )
  }

  object PhoneNumberTypeEnum {
    val Local    = "Local"
    val TollFree = "TollFree"

    val values = js.Object.freeze(js.Array(Local, TollFree))
  }

  @js.native
  trait PutEventsConfigurationRequest extends js.Object {
    var AccountId: NonEmptyString
    var BotId: NonEmptyString
    var LambdaFunctionArn: js.UndefOr[SensitiveString]
    var OutboundEventsHTTPSEndpoint: js.UndefOr[SensitiveString]
  }

  object PutEventsConfigurationRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        BotId: NonEmptyString,
        LambdaFunctionArn: js.UndefOr[SensitiveString] = js.undefined,
        OutboundEventsHTTPSEndpoint: js.UndefOr[SensitiveString] = js.undefined
    ): PutEventsConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BotId"     -> BotId.asInstanceOf[js.Any]
      )

      LambdaFunctionArn.foreach(__v => __obj.updateDynamic("LambdaFunctionArn")(__v.asInstanceOf[js.Any]))
      OutboundEventsHTTPSEndpoint.foreach(
        __v => __obj.updateDynamic("OutboundEventsHTTPSEndpoint")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[PutEventsConfigurationRequest]
    }
  }

  @js.native
  trait PutEventsConfigurationResponse extends js.Object {
    var EventsConfiguration: js.UndefOr[EventsConfiguration]
  }

  object PutEventsConfigurationResponse {
    @inline
    def apply(
        EventsConfiguration: js.UndefOr[EventsConfiguration] = js.undefined
    ): PutEventsConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      EventsConfiguration.foreach(__v => __obj.updateDynamic("EventsConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEventsConfigurationResponse]
    }
  }

  @js.native
  trait PutVoiceConnectorOriginationRequest extends js.Object {
    var Origination: Origination
    var VoiceConnectorId: NonEmptyString
  }

  object PutVoiceConnectorOriginationRequest {
    @inline
    def apply(
        Origination: Origination,
        VoiceConnectorId: NonEmptyString
    ): PutVoiceConnectorOriginationRequest = {
      val __obj = js.Dynamic.literal(
        "Origination"      -> Origination.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutVoiceConnectorOriginationRequest]
    }
  }

  @js.native
  trait PutVoiceConnectorOriginationResponse extends js.Object {
    var Origination: js.UndefOr[Origination]
  }

  object PutVoiceConnectorOriginationResponse {
    @inline
    def apply(
        Origination: js.UndefOr[Origination] = js.undefined
    ): PutVoiceConnectorOriginationResponse = {
      val __obj = js.Dynamic.literal()
      Origination.foreach(__v => __obj.updateDynamic("Origination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutVoiceConnectorOriginationResponse]
    }
  }

  @js.native
  trait PutVoiceConnectorTerminationCredentialsRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
    var Credentials: js.UndefOr[CredentialList]
  }

  object PutVoiceConnectorTerminationCredentialsRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString,
        Credentials: js.UndefOr[CredentialList] = js.undefined
    ): PutVoiceConnectorTerminationCredentialsRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      Credentials.foreach(__v => __obj.updateDynamic("Credentials")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutVoiceConnectorTerminationCredentialsRequest]
    }
  }

  @js.native
  trait PutVoiceConnectorTerminationRequest extends js.Object {
    var Termination: Termination
    var VoiceConnectorId: NonEmptyString
  }

  object PutVoiceConnectorTerminationRequest {
    @inline
    def apply(
        Termination: Termination,
        VoiceConnectorId: NonEmptyString
    ): PutVoiceConnectorTerminationRequest = {
      val __obj = js.Dynamic.literal(
        "Termination"      -> Termination.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutVoiceConnectorTerminationRequest]
    }
  }

  @js.native
  trait PutVoiceConnectorTerminationResponse extends js.Object {
    var Termination: js.UndefOr[Termination]
  }

  object PutVoiceConnectorTerminationResponse {
    @inline
    def apply(
        Termination: js.UndefOr[Termination] = js.undefined
    ): PutVoiceConnectorTerminationResponse = {
      val __obj = js.Dynamic.literal()
      Termination.foreach(__v => __obj.updateDynamic("Termination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutVoiceConnectorTerminationResponse]
    }
  }

  @js.native
  trait RegenerateSecurityTokenRequest extends js.Object {
    var AccountId: NonEmptyString
    var BotId: NonEmptyString
  }

  object RegenerateSecurityTokenRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        BotId: NonEmptyString
    ): RegenerateSecurityTokenRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BotId"     -> BotId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RegenerateSecurityTokenRequest]
    }
  }

  @js.native
  trait RegenerateSecurityTokenResponse extends js.Object {
    var Bot: js.UndefOr[Bot]
  }

  object RegenerateSecurityTokenResponse {
    @inline
    def apply(
        Bot: js.UndefOr[Bot] = js.undefined
    ): RegenerateSecurityTokenResponse = {
      val __obj = js.Dynamic.literal()
      Bot.foreach(__v => __obj.updateDynamic("Bot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegenerateSecurityTokenResponse]
    }
  }

  object RegistrationStatusEnum {
    val Unregistered = "Unregistered"
    val Registered   = "Registered"
    val Suspended    = "Suspended"

    val values = js.Object.freeze(js.Array(Unregistered, Registered, Suspended))
  }

  @js.native
  trait ResetPersonalPINRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserId: NonEmptyString
  }

  object ResetPersonalPINRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        UserId: NonEmptyString
    ): ResetPersonalPINRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "UserId"    -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResetPersonalPINRequest]
    }
  }

  @js.native
  trait ResetPersonalPINResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object ResetPersonalPINResponse {
    @inline
    def apply(
        User: js.UndefOr[User] = js.undefined
    ): ResetPersonalPINResponse = {
      val __obj = js.Dynamic.literal()
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResetPersonalPINResponse]
    }
  }

  @js.native
  trait RestorePhoneNumberRequest extends js.Object {
    var PhoneNumberId: NonEmptyString
  }

  object RestorePhoneNumberRequest {
    @inline
    def apply(
        PhoneNumberId: NonEmptyString
    ): RestorePhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RestorePhoneNumberRequest]
    }
  }

  @js.native
  trait RestorePhoneNumberResponse extends js.Object {
    var PhoneNumber: js.UndefOr[PhoneNumber]
  }

  object RestorePhoneNumberResponse {
    @inline
    def apply(
        PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    ): RestorePhoneNumberResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestorePhoneNumberResponse]
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
    var TollFreePrefix: js.UndefOr[TollFreePrefix]
  }

  object SearchAvailablePhoneNumbersRequest {
    @inline
    def apply(
        AreaCode: js.UndefOr[String] = js.undefined,
        City: js.UndefOr[String] = js.undefined,
        Country: js.UndefOr[String] = js.undefined,
        MaxResults: js.UndefOr[PhoneNumberMaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        State: js.UndefOr[String] = js.undefined,
        TollFreePrefix: js.UndefOr[TollFreePrefix] = js.undefined
    ): SearchAvailablePhoneNumbersRequest = {
      val __obj = js.Dynamic.literal()
      AreaCode.foreach(__v => __obj.updateDynamic("AreaCode")(__v.asInstanceOf[js.Any]))
      City.foreach(__v => __obj.updateDynamic("City")(__v.asInstanceOf[js.Any]))
      Country.foreach(__v => __obj.updateDynamic("Country")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      TollFreePrefix.foreach(__v => __obj.updateDynamic("TollFreePrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchAvailablePhoneNumbersRequest]
    }
  }

  @js.native
  trait SearchAvailablePhoneNumbersResponse extends js.Object {
    var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList]
  }

  object SearchAvailablePhoneNumbersResponse {
    @inline
    def apply(
        E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.undefined
    ): SearchAvailablePhoneNumbersResponse = {
      val __obj = js.Dynamic.literal()
      E164PhoneNumbers.foreach(__v => __obj.updateDynamic("E164PhoneNumbers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchAvailablePhoneNumbersResponse]
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
    @inline
    def apply(
        InboundCalling: Boolean,
        OutboundCalling: Boolean,
        SMS: Boolean
    ): TelephonySettings = {
      val __obj = js.Dynamic.literal(
        "InboundCalling"  -> InboundCalling.asInstanceOf[js.Any],
        "OutboundCalling" -> OutboundCalling.asInstanceOf[js.Any],
        "SMS"             -> SMS.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TelephonySettings]
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
    @inline
    def apply(
        CallingRegions: js.UndefOr[CallingRegionList] = js.undefined,
        CidrAllowedList: js.UndefOr[StringList] = js.undefined,
        CpsLimit: js.UndefOr[CpsLimit] = js.undefined,
        DefaultPhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined,
        Disabled: js.UndefOr[Boolean] = js.undefined
    ): Termination = {
      val __obj = js.Dynamic.literal()
      CallingRegions.foreach(__v => __obj.updateDynamic("CallingRegions")(__v.asInstanceOf[js.Any]))
      CidrAllowedList.foreach(__v => __obj.updateDynamic("CidrAllowedList")(__v.asInstanceOf[js.Any]))
      CpsLimit.foreach(__v => __obj.updateDynamic("CpsLimit")(__v.asInstanceOf[js.Any]))
      DefaultPhoneNumber.foreach(__v => __obj.updateDynamic("DefaultPhoneNumber")(__v.asInstanceOf[js.Any]))
      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Termination]
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
    @inline
    def apply(
        Source: js.UndefOr[String] = js.undefined,
        Timestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): TerminationHealth = {
      val __obj = js.Dynamic.literal()
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TerminationHealth]
    }
  }

  @js.native
  trait UpdateAccountRequest extends js.Object {
    var AccountId: NonEmptyString
    var Name: js.UndefOr[AccountName]
  }

  object UpdateAccountRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        Name: js.UndefOr[AccountName] = js.undefined
    ): UpdateAccountRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAccountRequest]
    }
  }

  @js.native
  trait UpdateAccountResponse extends js.Object {
    var Account: js.UndefOr[Account]
  }

  object UpdateAccountResponse {
    @inline
    def apply(
        Account: js.UndefOr[Account] = js.undefined
    ): UpdateAccountResponse = {
      val __obj = js.Dynamic.literal()
      Account.foreach(__v => __obj.updateDynamic("Account")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAccountResponse]
    }
  }

  @js.native
  trait UpdateAccountSettingsRequest extends js.Object {
    var AccountId: NonEmptyString
    var AccountSettings: AccountSettings
  }

  object UpdateAccountSettingsRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        AccountSettings: AccountSettings
    ): UpdateAccountSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId"       -> AccountId.asInstanceOf[js.Any],
        "AccountSettings" -> AccountSettings.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateAccountSettingsRequest]
    }
  }

  @js.native
  trait UpdateAccountSettingsResponse extends js.Object {}

  object UpdateAccountSettingsResponse {
    @inline
    def apply(
        ): UpdateAccountSettingsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateAccountSettingsResponse]
    }
  }

  @js.native
  trait UpdateBotRequest extends js.Object {
    var AccountId: NonEmptyString
    var BotId: NonEmptyString
    var Disabled: js.UndefOr[NullableBoolean]
  }

  object UpdateBotRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        BotId: NonEmptyString,
        Disabled: js.UndefOr[NullableBoolean] = js.undefined
    ): UpdateBotRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BotId"     -> BotId.asInstanceOf[js.Any]
      )

      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBotRequest]
    }
  }

  @js.native
  trait UpdateBotResponse extends js.Object {
    var Bot: js.UndefOr[Bot]
  }

  object UpdateBotResponse {
    @inline
    def apply(
        Bot: js.UndefOr[Bot] = js.undefined
    ): UpdateBotResponse = {
      val __obj = js.Dynamic.literal()
      Bot.foreach(__v => __obj.updateDynamic("Bot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBotResponse]
    }
  }

  @js.native
  trait UpdateGlobalSettingsRequest extends js.Object {
    var BusinessCalling: BusinessCallingSettings
    var VoiceConnector: VoiceConnectorSettings
  }

  object UpdateGlobalSettingsRequest {
    @inline
    def apply(
        BusinessCalling: BusinessCallingSettings,
        VoiceConnector: VoiceConnectorSettings
    ): UpdateGlobalSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "BusinessCalling" -> BusinessCalling.asInstanceOf[js.Any],
        "VoiceConnector"  -> VoiceConnector.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateGlobalSettingsRequest]
    }
  }

  @js.native
  trait UpdatePhoneNumberRequest extends js.Object {
    var PhoneNumberId: String
    var ProductType: js.UndefOr[PhoneNumberProductType]
  }

  object UpdatePhoneNumberRequest {
    @inline
    def apply(
        PhoneNumberId: String,
        ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined
    ): UpdatePhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      )

      ProductType.foreach(__v => __obj.updateDynamic("ProductType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePhoneNumberRequest]
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
    @inline
    def apply(
        PhoneNumberId: NonEmptyString,
        ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined
    ): UpdatePhoneNumberRequestItem = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      )

      ProductType.foreach(__v => __obj.updateDynamic("ProductType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePhoneNumberRequestItem]
    }
  }

  @js.native
  trait UpdatePhoneNumberResponse extends js.Object {
    var PhoneNumber: js.UndefOr[PhoneNumber]
  }

  object UpdatePhoneNumberResponse {
    @inline
    def apply(
        PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    ): UpdatePhoneNumberResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePhoneNumberResponse]
    }
  }

  @js.native
  trait UpdateUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserId: NonEmptyString
    var LicenseType: js.UndefOr[License]
  }

  object UpdateUserRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        UserId: NonEmptyString,
        LicenseType: js.UndefOr[License] = js.undefined
    ): UpdateUserRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "UserId"    -> UserId.asInstanceOf[js.Any]
      )

      LicenseType.foreach(__v => __obj.updateDynamic("LicenseType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserRequest]
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
    @inline
    def apply(
        UserId: NonEmptyString,
        LicenseType: js.UndefOr[License] = js.undefined
    ): UpdateUserRequestItem = {
      val __obj = js.Dynamic.literal(
        "UserId" -> UserId.asInstanceOf[js.Any]
      )

      LicenseType.foreach(__v => __obj.updateDynamic("LicenseType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserRequestItem]
    }
  }

  @js.native
  trait UpdateUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object UpdateUserResponse {
    @inline
    def apply(
        User: js.UndefOr[User] = js.undefined
    ): UpdateUserResponse = {
      val __obj = js.Dynamic.literal()
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserResponse]
    }
  }

  @js.native
  trait UpdateUserSettingsRequest extends js.Object {
    var AccountId: String
    var UserId: String
    var UserSettings: UserSettings
  }

  object UpdateUserSettingsRequest {
    @inline
    def apply(
        AccountId: String,
        UserId: String,
        UserSettings: UserSettings
    ): UpdateUserSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId"    -> AccountId.asInstanceOf[js.Any],
        "UserId"       -> UserId.asInstanceOf[js.Any],
        "UserSettings" -> UserSettings.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateUserSettingsRequest]
    }
  }

  @js.native
  trait UpdateVoiceConnectorRequest extends js.Object {
    var Name: VoiceConnectorName
    var RequireEncryption: Boolean
    var VoiceConnectorId: NonEmptyString
  }

  object UpdateVoiceConnectorRequest {
    @inline
    def apply(
        Name: VoiceConnectorName,
        RequireEncryption: Boolean,
        VoiceConnectorId: NonEmptyString
    ): UpdateVoiceConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "Name"              -> Name.asInstanceOf[js.Any],
        "RequireEncryption" -> RequireEncryption.asInstanceOf[js.Any],
        "VoiceConnectorId"  -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateVoiceConnectorRequest]
    }
  }

  @js.native
  trait UpdateVoiceConnectorResponse extends js.Object {
    var VoiceConnector: js.UndefOr[VoiceConnector]
  }

  object UpdateVoiceConnectorResponse {
    @inline
    def apply(
        VoiceConnector: js.UndefOr[VoiceConnector] = js.undefined
    ): UpdateVoiceConnectorResponse = {
      val __obj = js.Dynamic.literal()
      VoiceConnector.foreach(__v => __obj.updateDynamic("VoiceConnector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVoiceConnectorResponse]
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "UserId" -> UserId.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      InvitedOn.foreach(__v => __obj.updateDynamic("InvitedOn")(__v.asInstanceOf[js.Any]))
      LicenseType.foreach(__v => __obj.updateDynamic("LicenseType")(__v.asInstanceOf[js.Any]))
      PersonalPIN.foreach(__v => __obj.updateDynamic("PersonalPIN")(__v.asInstanceOf[js.Any]))
      PrimaryEmail.foreach(__v => __obj.updateDynamic("PrimaryEmail")(__v.asInstanceOf[js.Any]))
      PrimaryProvisionedNumber.foreach(__v => __obj.updateDynamic("PrimaryProvisionedNumber")(__v.asInstanceOf[js.Any]))
      RegisteredOn.foreach(__v => __obj.updateDynamic("RegisteredOn")(__v.asInstanceOf[js.Any]))
      UserInvitationStatus.foreach(__v => __obj.updateDynamic("UserInvitationStatus")(__v.asInstanceOf[js.Any]))
      UserRegistrationStatus.foreach(__v => __obj.updateDynamic("UserRegistrationStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[User]
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
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        UserId: js.UndefOr[NonEmptyString] = js.undefined
    ): UserError = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserError]
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
    @inline
    def apply(
        Telephony: TelephonySettings
    ): UserSettings = {
      val __obj = js.Dynamic.literal(
        "Telephony" -> Telephony.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UserSettings]
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
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        Name: js.UndefOr[VoiceConnectorName] = js.undefined,
        OutboundHostName: js.UndefOr[String] = js.undefined,
        RequireEncryption: js.UndefOr[Boolean] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        VoiceConnectorId: js.UndefOr[NonEmptyString] = js.undefined
    ): VoiceConnector = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OutboundHostName.foreach(__v => __obj.updateDynamic("OutboundHostName")(__v.asInstanceOf[js.Any]))
      RequireEncryption.foreach(__v => __obj.updateDynamic("RequireEncryption")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      VoiceConnectorId.foreach(__v => __obj.updateDynamic("VoiceConnectorId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VoiceConnector]
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
    @inline
    def apply(
        CdrBucket: js.UndefOr[String] = js.undefined
    ): VoiceConnectorSettings = {
      val __obj = js.Dynamic.literal()
      CdrBucket.foreach(__v => __obj.updateDynamic("CdrBucket")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VoiceConnectorSettings]
    }
  }
}
