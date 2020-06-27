package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object sso {
  type AccessKeyType           = String
  type AccessTokenType         = String
  type AccountIdType           = String
  type AccountListType         = js.Array[AccountInfo]
  type AccountNameType         = String
  type EmailAddressType        = String
  type ExpirationTimestampType = Double
  type MaxResultType           = Int
  type NextTokenType           = String
  type RoleListType            = js.Array[RoleInfo]
  type RoleNameType            = String
  type SecretAccessKeyType     = String
  type SessionTokenType        = String

  implicit final class SSOOps(private val service: SSO) extends AnyVal {

    @inline def getRoleCredentialsFuture(params: GetRoleCredentialsRequest): Future[GetRoleCredentialsResponse] =
      service.getRoleCredentials(params).promise().toFuture
    @inline def listAccountRolesFuture(params: ListAccountRolesRequest): Future[ListAccountRolesResponse] =
      service.listAccountRoles(params).promise().toFuture
    @inline def listAccountsFuture(params: ListAccountsRequest): Future[ListAccountsResponse] =
      service.listAccounts(params).promise().toFuture
    @inline def logoutFuture(params: LogoutRequest): Future[js.Object] = service.logout(params).promise().toFuture
  }
}

package sso {
  @js.native
  @JSImport("aws-sdk", "SSO")
  class SSO() extends js.Object {
    def this(config: AWSConfig) = this()

    def getRoleCredentials(params: GetRoleCredentialsRequest): Request[GetRoleCredentialsResponse] = js.native
    def listAccountRoles(params: ListAccountRolesRequest): Request[ListAccountRolesResponse]       = js.native
    def listAccounts(params: ListAccountsRequest): Request[ListAccountsResponse]                   = js.native
    def logout(params: LogoutRequest): Request[js.Object]                                          = js.native
  }

  /**
    * Provides information about your AWS account.
    */
  @js.native
  @Factory
  trait AccountInfo extends js.Object {
    var accountId: js.UndefOr[AccountIdType]
    var accountName: js.UndefOr[AccountNameType]
    var emailAddress: js.UndefOr[EmailAddressType]
  }

  @js.native
  @Factory
  trait GetRoleCredentialsRequest extends js.Object {
    var accessToken: AccessTokenType
    var accountId: AccountIdType
    var roleName: RoleNameType
  }

  @js.native
  @Factory
  trait GetRoleCredentialsResponse extends js.Object {
    var roleCredentials: js.UndefOr[RoleCredentials]
  }

  @js.native
  @Factory
  trait ListAccountRolesRequest extends js.Object {
    var accessToken: AccessTokenType
    var accountId: AccountIdType
    var maxResults: js.UndefOr[MaxResultType]
    var nextToken: js.UndefOr[NextTokenType]
  }

  @js.native
  @Factory
  trait ListAccountRolesResponse extends js.Object {
    var nextToken: js.UndefOr[NextTokenType]
    var roleList: js.UndefOr[RoleListType]
  }

  @js.native
  @Factory
  trait ListAccountsRequest extends js.Object {
    var accessToken: AccessTokenType
    var maxResults: js.UndefOr[MaxResultType]
    var nextToken: js.UndefOr[NextTokenType]
  }

  @js.native
  @Factory
  trait ListAccountsResponse extends js.Object {
    var accountList: js.UndefOr[AccountListType]
    var nextToken: js.UndefOr[NextTokenType]
  }

  @js.native
  @Factory
  trait LogoutRequest extends js.Object {
    var accessToken: AccessTokenType
  }

  /**
    * Provides information about the role credentials that are assigned to the user.
    */
  @js.native
  @Factory
  trait RoleCredentials extends js.Object {
    var accessKeyId: js.UndefOr[AccessKeyType]
    var expiration: js.UndefOr[ExpirationTimestampType]
    var secretAccessKey: js.UndefOr[SecretAccessKeyType]
    var sessionToken: js.UndefOr[SessionTokenType]
  }

  /**
    * Provides information about the role that is assigned to the user.
    */
  @js.native
  @Factory
  trait RoleInfo extends js.Object {
    var accountId: js.UndefOr[AccountIdType]
    var roleName: js.UndefOr[RoleNameType]
  }
}
