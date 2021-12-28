package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object sso {
  type AccessKeyType = String
  type AccessTokenType = String
  type AccountIdType = String
  type AccountListType = js.Array[AccountInfo]
  type AccountNameType = String
  type EmailAddressType = String
  type ExpirationTimestampType = Double
  type MaxResultType = Int
  type NextTokenType = String
  type RoleListType = js.Array[RoleInfo]
  type RoleNameType = String
  type SecretAccessKeyType = String
  type SessionTokenType = String

  final class SSOOps(private val service: SSO) extends AnyVal {

    @inline def getRoleCredentialsFuture(params: GetRoleCredentialsRequest): Future[GetRoleCredentialsResponse] = service.getRoleCredentials(params).promise().toFuture
    @inline def listAccountRolesFuture(params: ListAccountRolesRequest): Future[ListAccountRolesResponse] = service.listAccountRoles(params).promise().toFuture
    @inline def listAccountsFuture(params: ListAccountsRequest): Future[ListAccountsResponse] = service.listAccounts(params).promise().toFuture
    @inline def logoutFuture(params: LogoutRequest): Future[js.Object] = service.logout(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/sso", JSImport.Namespace, "AWS.SSO")
  class SSO() extends js.Object {
    def this(config: AWSConfig) = this()

    def getRoleCredentials(params: GetRoleCredentialsRequest): Request[GetRoleCredentialsResponse] = js.native
    def listAccountRoles(params: ListAccountRolesRequest): Request[ListAccountRolesResponse] = js.native
    def listAccounts(params: ListAccountsRequest): Request[ListAccountsResponse] = js.native
    def logout(params: LogoutRequest): Request[js.Object] = js.native
  }
  object SSO {
    @inline implicit def toOps(service: SSO): SSOOps = {
      new SSOOps(service)
    }
  }

  /** Provides information about your AWS account.
    */
  @js.native
  trait AccountInfo extends js.Object {
    var accountId: js.UndefOr[AccountIdType]
    var accountName: js.UndefOr[AccountNameType]
    var emailAddress: js.UndefOr[EmailAddressType]
  }

  object AccountInfo {
    @inline
    def apply(
        accountId: js.UndefOr[AccountIdType] = js.undefined,
        accountName: js.UndefOr[AccountNameType] = js.undefined,
        emailAddress: js.UndefOr[EmailAddressType] = js.undefined
    ): AccountInfo = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      accountName.foreach(__v => __obj.updateDynamic("accountName")(__v.asInstanceOf[js.Any]))
      emailAddress.foreach(__v => __obj.updateDynamic("emailAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountInfo]
    }
  }

  @js.native
  trait GetRoleCredentialsRequest extends js.Object {
    var accessToken: AccessTokenType
    var accountId: AccountIdType
    var roleName: RoleNameType
  }

  object GetRoleCredentialsRequest {
    @inline
    def apply(
        accessToken: AccessTokenType,
        accountId: AccountIdType,
        roleName: RoleNameType
    ): GetRoleCredentialsRequest = {
      val __obj = js.Dynamic.literal(
        "accessToken" -> accessToken.asInstanceOf[js.Any],
        "accountId" -> accountId.asInstanceOf[js.Any],
        "roleName" -> roleName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRoleCredentialsRequest]
    }
  }

  @js.native
  trait GetRoleCredentialsResponse extends js.Object {
    var roleCredentials: js.UndefOr[RoleCredentials]
  }

  object GetRoleCredentialsResponse {
    @inline
    def apply(
        roleCredentials: js.UndefOr[RoleCredentials] = js.undefined
    ): GetRoleCredentialsResponse = {
      val __obj = js.Dynamic.literal()
      roleCredentials.foreach(__v => __obj.updateDynamic("roleCredentials")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRoleCredentialsResponse]
    }
  }

  @js.native
  trait ListAccountRolesRequest extends js.Object {
    var accessToken: AccessTokenType
    var accountId: AccountIdType
    var maxResults: js.UndefOr[MaxResultType]
    var nextToken: js.UndefOr[NextTokenType]
  }

  object ListAccountRolesRequest {
    @inline
    def apply(
        accessToken: AccessTokenType,
        accountId: AccountIdType,
        maxResults: js.UndefOr[MaxResultType] = js.undefined,
        nextToken: js.UndefOr[NextTokenType] = js.undefined
    ): ListAccountRolesRequest = {
      val __obj = js.Dynamic.literal(
        "accessToken" -> accessToken.asInstanceOf[js.Any],
        "accountId" -> accountId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountRolesRequest]
    }
  }

  @js.native
  trait ListAccountRolesResponse extends js.Object {
    var nextToken: js.UndefOr[NextTokenType]
    var roleList: js.UndefOr[RoleListType]
  }

  object ListAccountRolesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextTokenType] = js.undefined,
        roleList: js.UndefOr[RoleListType] = js.undefined
    ): ListAccountRolesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      roleList.foreach(__v => __obj.updateDynamic("roleList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountRolesResponse]
    }
  }

  @js.native
  trait ListAccountsRequest extends js.Object {
    var accessToken: AccessTokenType
    var maxResults: js.UndefOr[MaxResultType]
    var nextToken: js.UndefOr[NextTokenType]
  }

  object ListAccountsRequest {
    @inline
    def apply(
        accessToken: AccessTokenType,
        maxResults: js.UndefOr[MaxResultType] = js.undefined,
        nextToken: js.UndefOr[NextTokenType] = js.undefined
    ): ListAccountsRequest = {
      val __obj = js.Dynamic.literal(
        "accessToken" -> accessToken.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountsRequest]
    }
  }

  @js.native
  trait ListAccountsResponse extends js.Object {
    var accountList: js.UndefOr[AccountListType]
    var nextToken: js.UndefOr[NextTokenType]
  }

  object ListAccountsResponse {
    @inline
    def apply(
        accountList: js.UndefOr[AccountListType] = js.undefined,
        nextToken: js.UndefOr[NextTokenType] = js.undefined
    ): ListAccountsResponse = {
      val __obj = js.Dynamic.literal()
      accountList.foreach(__v => __obj.updateDynamic("accountList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountsResponse]
    }
  }

  @js.native
  trait LogoutRequest extends js.Object {
    var accessToken: AccessTokenType
  }

  object LogoutRequest {
    @inline
    def apply(
        accessToken: AccessTokenType
    ): LogoutRequest = {
      val __obj = js.Dynamic.literal(
        "accessToken" -> accessToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LogoutRequest]
    }
  }

  /** Provides information about the role credentials that are assigned to the user.
    */
  @js.native
  trait RoleCredentials extends js.Object {
    var accessKeyId: js.UndefOr[AccessKeyType]
    var expiration: js.UndefOr[ExpirationTimestampType]
    var secretAccessKey: js.UndefOr[SecretAccessKeyType]
    var sessionToken: js.UndefOr[SessionTokenType]
  }

  object RoleCredentials {
    @inline
    def apply(
        accessKeyId: js.UndefOr[AccessKeyType] = js.undefined,
        expiration: js.UndefOr[ExpirationTimestampType] = js.undefined,
        secretAccessKey: js.UndefOr[SecretAccessKeyType] = js.undefined,
        sessionToken: js.UndefOr[SessionTokenType] = js.undefined
    ): RoleCredentials = {
      val __obj = js.Dynamic.literal()
      accessKeyId.foreach(__v => __obj.updateDynamic("accessKeyId")(__v.asInstanceOf[js.Any]))
      expiration.foreach(__v => __obj.updateDynamic("expiration")(__v.asInstanceOf[js.Any]))
      secretAccessKey.foreach(__v => __obj.updateDynamic("secretAccessKey")(__v.asInstanceOf[js.Any]))
      sessionToken.foreach(__v => __obj.updateDynamic("sessionToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoleCredentials]
    }
  }

  /** Provides information about the role that is assigned to the user.
    */
  @js.native
  trait RoleInfo extends js.Object {
    var accountId: js.UndefOr[AccountIdType]
    var roleName: js.UndefOr[RoleNameType]
  }

  object RoleInfo {
    @inline
    def apply(
        accountId: js.UndefOr[AccountIdType] = js.undefined,
        roleName: js.UndefOr[RoleNameType] = js.undefined
    ): RoleInfo = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      roleName.foreach(__v => __obj.updateDynamic("roleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoleInfo]
    }
  }
}
